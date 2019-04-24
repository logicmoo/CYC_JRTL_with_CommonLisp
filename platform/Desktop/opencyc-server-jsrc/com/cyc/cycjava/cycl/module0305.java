package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0305 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0305";
    public static final String myFingerPrint = "e3e30f663762c26a55e6579039f166c30e23891832dcf7e4905410738b72e8f9";
    public static SubLSymbol $g2728$;
    public static SubLSymbol $g2729$;
    public static SubLSymbol $g2730$;
    public static SubLSymbol $g2731$;
    public static SubLSymbol $g2732$;
    public static SubLSymbol $g2733$;
    public static SubLSymbol $g2734$;
    public static SubLSymbol $g2735$;
    public static SubLSymbol $g2736$;
    public static SubLSymbol $g2737$;
    public static SubLSymbol $g2738$;
    public static SubLSymbol $g2739$;
    public static SubLSymbol $g2740$;
    public static SubLSymbol $g2741$;
    public static SubLSymbol $g2742$;
    private static SubLSymbol $g2743$;
    private static SubLSymbol $g2744$;
    public static SubLSymbol $g2745$;
    public static SubLSymbol $g2746$;
    public static SubLSymbol $g2747$;
    public static SubLSymbol $g2748$;
    public static SubLSymbol $g2749$;
    public static SubLSymbol $g2750$;
    public static SubLSymbol $g2751$;
    public static SubLSymbol $g2752$;
    public static SubLSymbol $g2753$;
    public static SubLSymbol $g2754$;
    public static SubLSymbol $g2755$;
    public static SubLSymbol $g2756$;
    private static SubLSymbol $g2757$;
    private static SubLSymbol $g2758$;
    private static SubLSymbol $g2759$;
    private static SubLSymbol $g2760$;
    private static SubLSymbol $g2761$;
    private static SubLSymbol $g2762$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
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
    private static final SubLObject $ic20$;
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
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLList $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLObject $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLInteger $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLObject $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLList $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLObject $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLObject $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLObject $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLInteger $ic115$;
    private static final SubLObject $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLString $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLInteger $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLInteger $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLInteger $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLList $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLList $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
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
    private static final SubLList $ic178$;
    private static final SubLString $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLString $ic182$;
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
    private static final SubLString $ic193$;
    private static final SubLString $ic194$;
    private static final SubLString $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLList $ic206$;
    private static final SubLString $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLObject $ic213$;
    private static final SubLString $ic214$;
    private static final SubLString $ic215$;
    private static final SubLString $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLList $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLString $ic226$;
    private static final SubLString $ic227$;
    private static final SubLString $ic228$;
    private static final SubLString $ic229$;
    private static final SubLString $ic230$;
    private static final SubLString $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLList $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLString $ic247$;
    private static final SubLString $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLList $ic251$;
    private static final SubLList $ic252$;
    private static final SubLString $ic253$;
    private static final SubLString $ic254$;
    private static final SubLString $ic255$;
    private static final SubLString $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLString $ic258$;
    private static final SubLString $ic259$;
    private static final SubLString $ic260$;
    private static final SubLString $ic261$;
    private static final SubLString $ic262$;
    private static final SubLString $ic263$;
    private static final SubLString $ic264$;
    private static final SubLObject $ic265$;
    private static final SubLString $ic266$;
    private static final SubLString $ic267$;
    
    public static SubLObject f20316() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0030.f1630(module0144.$g1866$.getDynamicValue(var1));
    }
    
    public static SubLObject f20317(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return Hashtables.gethash_without_values(var2, module0144.$g1866$.getDynamicValue(var3), (SubLObject)module0305.UNPROVIDED);
    }
    
    public static SubLObject f20318(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f20319((SubLObject)ConsesLow.cons(var4, Hashtables.gethash_without_values(var3, module0144.$g1866$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED)));
        if (module0305.NIL != var6) {
            Hashtables.sethash(var3, module0144.$g1866$.getDynamicValue(var5), var6);
        }
        return var6;
    }
    
    public static SubLObject f20320(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f20319(Sequences.delete(var4, Hashtables.gethash_without_values(var3, module0144.$g1866$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        if (module0305.NIL != var6) {
            Hashtables.sethash(var3, module0144.$g1866$.getDynamicValue(var5), var6);
        }
        else {
            Hashtables.remhash(var3, module0144.$g1866$.getDynamicValue(var5));
        }
        return var6;
    }
    
    public static SubLObject f20321(final SubLObject var2, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return Hashtables.sethash(var2, module0144.$g1866$.getDynamicValue(var7), f20319(conses_high.nunion(Hashtables.gethash_without_values(var2, module0144.$g1866$.getDynamicValue(var7), (SubLObject)module0305.UNPROVIDED), conses_high.copy_list(var6), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)));
    }
    
    public static SubLObject f20322(final SubLObject var2, SubLObject var6) {
        if (var6 == module0305.UNPROVIDED) {
            var6 = module0144.$g1872$.getDynamicValue();
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0305.NIL == f20323(var2)) {
            final SubLObject var8 = f20317(var2);
            if (module0305.NIL != var8) {
                SubLObject var9 = (SubLObject)module0305.NIL;
                SubLObject var10 = var6;
                SubLObject var11 = (SubLObject)module0305.NIL;
                var11 = var10.first();
                while (module0305.NIL != var10) {
                    if (module0305.NIL == module0178.f11361(var11, (SubLObject)module0305.UNPROVIDED) || module0305.NIL == module0256.f16576(module0178.f11334(var11), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
                        var9 = (SubLObject)ConsesLow.cons(var11, var9);
                    }
                    var10 = var10.rest();
                    var11 = var10.first();
                }
                if (module0144.$g1863$.getDynamicValue(var7).numGE((SubLObject)module0305.FOUR_INTEGER)) {
                    var10 = var9;
                    var11 = (SubLObject)module0305.NIL;
                    var11 = var10.first();
                    while (module0305.NIL != var10) {
                        f20324((SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.$ic0$, var2, var11, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                        var10 = var10.rest();
                        var11 = var10.first();
                    }
                }
                final SubLObject var12 = f20319(conses_high.nset_difference(var8, var9, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                if (module0305.NIL != var12) {
                    Hashtables.sethash(var2, module0144.$g1866$.getDynamicValue(var7), var12);
                }
                else {
                    Hashtables.remhash(var2, module0144.$g1866$.getDynamicValue(var7));
                }
                return var12;
            }
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20325() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.clrhash(module0144.$g1866$.getDynamicValue(var1));
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20326() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0144.$g1866$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)module0305.NIL;
        SubLObject var4 = (SubLObject)module0305.NIL;
        final Iterator var5 = Hashtables.getEntrySetIterator(var2);
        try {
            while (Hashtables.iteratorHasNext(var5)) {
                final Map.Entry var6 = Hashtables.iteratorNextEntry(var5);
                var3 = Hashtables.getEntryKey(var6);
                var4 = Hashtables.getEntryValue(var6);
                Hashtables.sethash(var3, module0144.$g1866$.getDynamicValue(var1), f20319(var4));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var5);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20327() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0030.f1630(module0144.$g1867$.getDynamicValue(var1));
    }
    
    public static SubLObject f20328(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return Hashtables.gethash_without_values(var2, module0144.$g1867$.getDynamicValue(var3), (SubLObject)module0305.UNPROVIDED);
    }
    
    public static SubLObject f20329(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f20319((SubLObject)ConsesLow.cons(var4, Hashtables.gethash_without_values(var3, module0144.$g1867$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED)));
        if (module0305.NIL != var6) {
            Hashtables.sethash(var3, module0144.$g1867$.getDynamicValue(var5), var6);
        }
        return var6;
    }
    
    public static SubLObject f20330(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f20319(Sequences.delete(var4, Hashtables.gethash_without_values(var3, module0144.$g1867$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        if (module0305.NIL != var6) {
            Hashtables.sethash(var3, module0144.$g1867$.getDynamicValue(var5), var6);
        }
        else {
            Hashtables.remhash(var3, module0144.$g1867$.getDynamicValue(var5));
        }
        return var6;
    }
    
    public static SubLObject f20331(final SubLObject var2, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return Hashtables.sethash(var2, module0144.$g1867$.getDynamicValue(var7), f20319(conses_high.nunion(Hashtables.gethash_without_values(var2, module0144.$g1867$.getDynamicValue(var7), (SubLObject)module0305.UNPROVIDED), conses_high.copy_list(var6), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)));
    }
    
    public static SubLObject f20332(final SubLObject var2, SubLObject var6) {
        if (var6 == module0305.UNPROVIDED) {
            var6 = module0144.$g1872$.getDynamicValue();
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0305.NIL == f20323(var2)) {
            final SubLObject var8 = Hashtables.gethash_without_values(var2, module0144.$g1867$.getDynamicValue(var7), (SubLObject)module0305.UNPROVIDED);
            if (module0305.NIL != var8) {
                SubLObject var9 = (SubLObject)module0305.NIL;
                SubLObject var10 = var6;
                SubLObject var11 = (SubLObject)module0305.NIL;
                var11 = var10.first();
                while (module0305.NIL != var10) {
                    if (module0305.NIL == module0178.f11361(var11, (SubLObject)module0305.UNPROVIDED) || module0305.NIL == module0256.f16576(module0178.f11334(var11), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
                        var9 = (SubLObject)ConsesLow.cons(var11, var9);
                    }
                    var10 = var10.rest();
                    var11 = var10.first();
                }
                if (module0144.$g1863$.getDynamicValue(var7).numGE((SubLObject)module0305.FOUR_INTEGER)) {
                    var10 = var9;
                    var11 = (SubLObject)module0305.NIL;
                    var11 = var10.first();
                    while (module0305.NIL != var10) {
                        f20324((SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.$ic0$, var2, var11, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                        var10 = var10.rest();
                        var11 = var10.first();
                    }
                }
                final SubLObject var12 = f20319(conses_high.nset_difference(var8, var9, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                if (module0305.NIL != var12) {
                    Hashtables.sethash(var2, module0144.$g1867$.getDynamicValue(var7), var12);
                }
                else {
                    Hashtables.remhash(var2, module0144.$g1867$.getDynamicValue(var7));
                }
                return var12;
            }
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20333() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.clrhash(module0144.$g1867$.getDynamicValue(var1));
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20334() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0144.$g1867$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)module0305.NIL;
        SubLObject var4 = (SubLObject)module0305.NIL;
        final Iterator var5 = Hashtables.getEntrySetIterator(var2);
        try {
            while (Hashtables.iteratorHasNext(var5)) {
                final Map.Entry var6 = Hashtables.iteratorNextEntry(var5);
                var3 = Hashtables.getEntryKey(var6);
                var4 = Hashtables.getEntryValue(var6);
                Hashtables.sethash(var3, module0144.$g1867$.getDynamicValue(var1), f20319(var4));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var5);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20335(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0305.NIL == module0144.$g1857$.getDynamicValue(var3)) {
            return (SubLObject)module0305.NIL;
        }
        final SubLObject var4 = f20336(var2);
        if (var4.eql((SubLObject)module0305.$ic1$)) {
            return (SubLObject)module0305.T;
        }
        if (var4.eql((SubLObject)module0305.$ic2$)) {
            return (SubLObject)module0305.NIL;
        }
        final SubLObject var5 = f20337(var2, module0144.$g1832$.getDynamicValue(var3), (SubLObject)module0305.UNPROVIDED);
        if (module0305.NIL != var5) {
            f20338(var2, (SubLObject)module0305.$ic1$);
        }
        else {
            f20338(var2, (SubLObject)module0305.$ic2$);
        }
        return var5;
    }
    
    public static SubLObject f20339(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0305.NIL == module0144.$g1857$.getDynamicValue(var3)) {
            return (SubLObject)module0305.NIL;
        }
        final SubLObject var4 = f20336(var2);
        if (var4.eql((SubLObject)module0305.$ic1$)) {
            return (SubLObject)module0305.NIL;
        }
        if (var4.eql((SubLObject)module0305.$ic2$)) {
            return (SubLObject)module0305.T;
        }
        final SubLObject var5 = f20340(var2, module0144.$g1832$.getDynamicValue(var3), (SubLObject)module0305.UNPROVIDED);
        if (module0305.NIL != var5) {
            f20338(var2, (SubLObject)module0305.$ic2$);
        }
        else {
            f20338(var2, (SubLObject)module0305.$ic1$);
        }
        return var5;
    }
    
    public static SubLObject f20337(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var22)) {
            return module0306.f20644(var2, var20, var21);
        }
        return f20341(var2, var20, var21);
    }
    
    public static SubLObject f20342() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2729$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2729$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2729$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2729$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2729$.getDynamicValue(var1), (SubLObject)module0305.$ic9$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2729$.getDynamicValue(var1), (SubLObject)module0305.$ic11$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20343(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0259.f16854(var20, var2, var21, (SubLObject)module0305.UNPROVIDED)) {
            return (SubLObject)module0305.T;
        }
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1881$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1882$.currentBinding(var22);
        final SubLObject var26 = module0144.$g1879$.currentBinding(var22);
        final SubLObject var27 = module0144.$g1880$.currentBinding(var22);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var22);
            module0144.$g1882$.bind(module0149.f9627(), var22);
            module0144.$g1879$.bind(module0149.f9628(), var22);
            module0144.$g1880$.bind(module0149.f9629(), var22);
            try {
                final SubLObject var28 = f20344(var2, var20, var21);
                if (var28.eql((SubLObject)module0305.$ic1$)) {
                    var23 = (SubLObject)module0305.T;
                }
                else if (!var28.eql((SubLObject)module0305.$ic2$)) {
                    var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != f20345(var2) && (module0305.NIL == module0144.$g1858$.getDynamicValue(var22) || module0305.NIL != f20346(var2, var20, var21)) && module0305.NIL != f20347(var2, var20, var21));
                }
            }
            finally {
                final SubLObject var23_27 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                    f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_27, var22);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var27, var22);
            module0144.$g1879$.rebind(var26, var22);
            module0144.$g1882$.rebind(var25, var22);
            module0144.$g1881$.rebind(var24, var22);
        }
        if (module0305.NIL == var23 && module0305.NIL != module0206.f13472(var20)) {
            final SubLObject var29 = module0285.f18933(var20, (SubLObject)module0305.UNPROVIDED);
            if (module0305.NIL != var29 && module0305.NIL != f20349(var2, var29, var21)) {
                var23 = (SubLObject)module0305.T;
            }
        }
        return var23;
    }
    
    public static SubLObject f20341(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var22)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            SubLObject var24 = (SubLObject)module0305.NIL;
            final SubLObject var25 = Time.get_internal_real_time();
            var23 = f20343(var2, var20, var21);
            var24 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var25), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2729$.getDynamicValue(var22), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2729$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2729$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var24, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2729$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2729$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var23, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2729$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2729$.getDynamicValue(var22), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var2, var20, var21), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2729$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            return var23;
        }
        return f20343(var2, var20, var21);
    }
    
    public static SubLObject f20340(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var22)) {
            return module0306.f20650(var2, var20, var21);
        }
        return f20350(var2, var20, var21);
    }
    
    public static SubLObject f20351() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2730$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2730$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2730$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2730$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2730$.getDynamicValue(var1), (SubLObject)module0305.$ic9$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2730$.getDynamicValue(var1), (SubLObject)module0305.$ic15$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20352(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0259.f16854(var20, var2, var21, (SubLObject)module0305.UNPROVIDED)) {
            return (SubLObject)module0305.NIL;
        }
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1881$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1882$.currentBinding(var22);
        final SubLObject var26 = module0144.$g1879$.currentBinding(var22);
        final SubLObject var27 = module0144.$g1880$.currentBinding(var22);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var22);
            module0144.$g1882$.bind(module0149.f9627(), var22);
            module0144.$g1879$.bind(module0149.f9628(), var22);
            module0144.$g1880$.bind(module0149.f9629(), var22);
            try {
                final SubLObject var28 = f20344(var2, var20, var21);
                if (!var28.eql((SubLObject)module0305.$ic1$)) {
                    if (var28.eql((SubLObject)module0305.$ic2$)) {
                        var23 = (SubLObject)module0305.T;
                    }
                    else {
                        var23 = f20353(var2, var20, var21);
                    }
                }
            }
            finally {
                final SubLObject var23_33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                    f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_33, var22);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var27, var22);
            module0144.$g1879$.rebind(var26, var22);
            module0144.$g1882$.rebind(var25, var22);
            module0144.$g1881$.rebind(var24, var22);
        }
        if (module0305.NIL == var23 && module0305.NIL != module0206.f13472(var20)) {
            final SubLObject var29 = module0285.f18933(var20, (SubLObject)module0305.UNPROVIDED);
            if (module0305.NIL != var29 && module0305.NIL != f20354(var2, var29, var21)) {
                var23 = (SubLObject)module0305.T;
            }
        }
        return var23;
    }
    
    public static SubLObject f20350(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var22)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            SubLObject var24 = (SubLObject)module0305.NIL;
            final SubLObject var25 = Time.get_internal_real_time();
            var23 = f20352(var2, var20, var21);
            var24 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var25), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2730$.getDynamicValue(var22), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2730$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2730$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var24, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2730$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2730$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var23, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2730$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2730$.getDynamicValue(var22), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var2, var20, var21), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2730$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            return var23;
        }
        return f20352(var2, var20, var21);
    }
    
    public static SubLObject f20355(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1881$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1882$.currentBinding(var22);
        final SubLObject var26 = module0144.$g1879$.currentBinding(var22);
        final SubLObject var27 = module0144.$g1880$.currentBinding(var22);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var22);
            module0144.$g1882$.bind(module0149.f9627(), var22);
            module0144.$g1879$.bind(module0149.f9628(), var22);
            module0144.$g1880$.bind(module0149.f9629(), var22);
            try {
                var23 = f20344(var2, var20, var21);
            }
            finally {
                final SubLObject var23_34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                    f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_34, var22);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var27, var22);
            module0144.$g1879$.rebind(var26, var22);
            module0144.$g1882$.rebind(var25, var22);
            module0144.$g1881$.rebind(var24, var22);
        }
        return Equality.eq((SubLObject)module0305.$ic1$, var23);
    }
    
    public static SubLObject f20356(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1881$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1882$.currentBinding(var22);
        final SubLObject var26 = module0144.$g1879$.currentBinding(var22);
        final SubLObject var27 = module0144.$g1880$.currentBinding(var22);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var22);
            module0144.$g1882$.bind(module0149.f9627(), var22);
            module0144.$g1879$.bind(module0149.f9628(), var22);
            module0144.$g1880$.bind(module0149.f9629(), var22);
            try {
                var23 = f20344(var2, var20, var21);
            }
            finally {
                final SubLObject var23_35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                    f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_35, var22);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var27, var22);
            module0144.$g1879$.rebind(var26, var22);
            module0144.$g1882$.rebind(var25, var22);
            module0144.$g1881$.rebind(var24, var22);
        }
        return Equality.eq((SubLObject)module0305.$ic2$, var23);
    }
    
    public static SubLObject f20357() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2731$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2731$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2731$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2731$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2731$.getDynamicValue(var1), (SubLObject)module0305.$ic9$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2731$.getDynamicValue(var1), (SubLObject)module0305.$ic18$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20358(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0202.f12757(module0220.f14557(var2, module0305.$ic20$, var21, (SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic21$));
        SubLObject var24 = (SubLObject)module0305.NIL;
        if (module0305.NIL != f20359(var23, var2)) {
            final SubLObject var25 = module0144.$g1869$.currentBinding(var22);
            try {
                module0144.$g1869$.bind(var2, var22);
                if (module0305.NIL != f20360(var23, var20, var2, var21)) {
                    var24 = (SubLObject)module0305.$ic1$;
                }
                else if (module0305.NIL != module0144.$g1796$.getDynamicValue(var22)) {
                    var24 = (SubLObject)module0305.$ic2$;
                    module0303.f20203(f20361(var2, var20, var23, (SubLObject)module0305.NIL, var21));
                }
                else {
                    var24 = (SubLObject)module0305.$ic2$;
                }
            }
            finally {
                module0144.$g1869$.rebind(var25, var22);
            }
        }
        return var24;
    }
    
    public static SubLObject f20344(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var22)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            SubLObject var24 = (SubLObject)module0305.NIL;
            final SubLObject var25 = Time.get_internal_real_time();
            var23 = f20358(var2, var20, var21);
            var24 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var25), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2731$.getDynamicValue(var22), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2731$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2731$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var24, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2731$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2731$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var23, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2731$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2731$.getDynamicValue(var22), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var2, var20, var21), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2731$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            return var23;
        }
        return f20358(var2, var20, var21);
    }
    
    public static SubLObject f20361(final SubLObject var2, final SubLObject var20, final SubLObject var36, final SubLObject var38, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        SubLObject var40 = (SubLObject)module0305.NIL;
        if (module0305.NIL != module0144.$g1841$.getDynamicValue(var39) && module0305.NIL != module0144.$g1831$.getDynamicValue(var39) && !module0144.$g1841$.getDynamicValue(var39).eql(module0144.$g1831$.getDynamicValue(var39))) {
            var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0305.$ic22$, module0144.$g1841$.getDynamicValue(var39)), var40);
        }
        if (module0305.NIL != module0144.$g1847$.getDynamicValue(var39) && module0305.NIL != module0144.$g1846$.getDynamicValue(var39)) {
            var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0305.$ic23$, module0144.$g1846$.getDynamicValue(var39)), var40);
        }
        if (module0305.NIL != var21) {
            var40 = (SubLObject)ConsesLow.cons(var21, var40);
        }
        else {
            var40 = (SubLObject)ConsesLow.cons(module0147.$g2095$.getDynamicValue(var39), var40);
        }
        if (module0305.NIL != var38) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0305.$ic24$, new SubLObject[] { var20, module0144.$g1831$.getDynamicValue(var39), module0144.$g1833$.getDynamicValue(var39), var2, var36, var40 });
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0305.$ic25$, new SubLObject[] { var20, module0144.$g1831$.getDynamicValue(var39), module0144.$g1833$.getDynamicValue(var39), var2, var36, var40 });
    }
    
    public static SubLObject f20362() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2732$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2732$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2732$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2732$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2732$.getDynamicValue(var1), (SubLObject)module0305.$ic9$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2732$.getDynamicValue(var1), (SubLObject)module0305.$ic27$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20363(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        return f20364(var2, var20, f20345(var2), (SubLObject)module0305.NIL, var21);
    }
    
    public static SubLObject f20347(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var22)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            SubLObject var24 = (SubLObject)module0305.NIL;
            final SubLObject var25 = Time.get_internal_real_time();
            var23 = f20363(var2, var20, var21);
            var24 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var25), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2732$.getDynamicValue(var22), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2732$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2732$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var24, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2732$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2732$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var23, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2732$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2732$.getDynamicValue(var22), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var2, var20, var21), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2732$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            return var23;
        }
        return f20363(var2, var20, var21);
    }
    
    public static SubLObject f20364(final SubLObject var2, final SubLObject var20, final SubLObject var6, SubLObject var38, SubLObject var21) {
        if (var38 == module0305.UNPROVIDED) {
            var38 = (SubLObject)module0305.NIL;
        }
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        SubLObject var40 = (SubLObject)module0305.NIL;
        SubLObject var41 = (SubLObject)module0305.NIL;
        SubLObject var42 = (SubLObject)module0305.NIL;
        final SubLObject var43 = var21;
        final SubLObject var44 = module0147.$g2094$.currentBinding(var39);
        final SubLObject var45 = module0147.$g2095$.currentBinding(var39);
        final SubLObject var46 = module0144.$g1853$.currentBinding(var39);
        try {
            module0147.$g2094$.bind(module0147.f9531(var43), var39);
            module0147.$g2095$.bind(module0147.f9534(var43), var39);
            module0144.$g1853$.bind((SubLObject)module0305.NIL, var39);
            if (module0305.NIL == var40) {
                SubLObject var47 = var6;
                SubLObject var48 = (SubLObject)module0305.NIL;
                var48 = var47.first();
                while (module0305.NIL == var40 && module0305.NIL != var47) {
                    if (module0305.NIL != module0178.f11361(var48, (SubLObject)module0305.UNPROVIDED)) {
                        final SubLObject var23_44 = module0144.$g1869$.currentBinding(var39);
                        try {
                            module0144.$g1869$.bind(module0178.f11334(var48), var39);
                            final SubLObject var49 = module0178.f11287(var48);
                            if (module0305.NIL != module0147.f9507(var49) && module0305.NIL != module0256.f16576(module0144.$g1869$.getDynamicValue(var39), var2, var21, (SubLObject)module0305.UNPROVIDED)) {
                                final SubLObject var50 = module0202.f12757(module0178.f11335(var48));
                                if (module0305.NIL != f20359(var50, module0144.$g1869$.getDynamicValue(var39))) {
                                    final SubLObject var23_45 = module0144.$g1796$.currentBinding(var39);
                                    final SubLObject var24_47 = module0144.$g1795$.currentBinding(var39);
                                    final SubLObject var25_48 = module0152.$g2116$.currentBinding(var39);
                                    final SubLObject var51 = module0152.$g2115$.currentBinding(var39);
                                    try {
                                        module0144.$g1796$.bind((SubLObject)module0305.NIL, var39);
                                        module0144.$g1795$.bind((SubLObject)module0305.NIL, var39);
                                        module0152.$g2116$.bind((SubLObject)module0305.NIL, var39);
                                        module0152.$g2115$.bind((SubLObject)module0305.NIL, var39);
                                        if (module0305.NIL == var38 && module0305.NIL != f20360(var50, var20, var2, var21)) {
                                            var40 = (SubLObject)module0305.T;
                                        }
                                        else if (module0305.NIL != var38 && module0305.NIL != f20365(var50, var20, var2, var21)) {
                                            var40 = (SubLObject)module0305.T;
                                        }
                                    }
                                    finally {
                                        module0152.$g2115$.rebind(var51, var39);
                                        module0152.$g2116$.rebind(var25_48, var39);
                                        module0144.$g1795$.rebind(var24_47, var39);
                                        module0144.$g1796$.rebind(var23_45, var39);
                                    }
                                    if (module0305.NIL == var40 && module0305.NIL != module0144.$g1796$.getDynamicValue(var39)) {
                                        final SubLObject var52 = module0144.$g1869$.getDynamicValue(var39);
                                        if (module0305.NIL == conses_high.member(var52, var41, Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
                                            var41 = (SubLObject)ConsesLow.cons(var52, var41);
                                        }
                                    }
                                }
                            }
                        }
                        finally {
                            module0144.$g1869$.rebind(var23_44, var39);
                        }
                    }
                    var47 = var47.rest();
                    var48 = var47.first();
                }
            }
            if (module0305.NIL == var40) {
                var42 = module0144.$g1853$.getDynamicValue(var39);
            }
        }
        finally {
            module0144.$g1853$.rebind(var46, var39);
            module0147.$g2095$.rebind(var45, var39);
            module0147.$g2094$.rebind(var44, var39);
        }
        if (module0305.NIL == var40 && module0305.NIL != var41 && module0305.NIL != module0144.$g1796$.getDynamicValue(var39)) {
            SubLObject var53 = var42;
            SubLObject var54 = (SubLObject)module0305.NIL;
            var54 = var53.first();
            while (module0305.NIL != var53) {
                module0303.f20203(var54);
                var53 = var53.rest();
                var54 = var53.first();
            }
            module0303.f20203(f20366(var2, var20, var41, var38, var21));
        }
        return var40;
    }
    
    public static SubLObject f20367(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1881$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1882$.currentBinding(var22);
        final SubLObject var26 = module0144.$g1879$.currentBinding(var22);
        final SubLObject var27 = module0144.$g1880$.currentBinding(var22);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var22);
            module0144.$g1882$.bind(module0149.f9627(), var22);
            module0144.$g1879$.bind(module0149.f9628(), var22);
            module0144.$g1880$.bind(module0149.f9629(), var22);
            try {
                final SubLObject var28 = var21;
                final SubLObject var23_52 = module0147.$g2094$.currentBinding(var22);
                final SubLObject var24_53 = module0147.$g2095$.currentBinding(var22);
                try {
                    module0147.$g2094$.bind(module0147.f9531(var28), var22);
                    module0147.$g2095$.bind(module0147.f9534(var28), var22);
                    if (module0305.NIL == var23) {
                        SubLObject var29 = f20345(var2);
                        SubLObject var30 = (SubLObject)module0305.NIL;
                        var30 = var29.first();
                        while (module0305.NIL == var23 && module0305.NIL != var29) {
                            if (module0305.NIL != module0178.f11361(var30, (SubLObject)module0305.UNPROVIDED)) {
                                final SubLObject var23_53 = module0144.$g1869$.currentBinding(var22);
                                try {
                                    module0144.$g1869$.bind(module0178.f11334(var30), var22);
                                    final SubLObject var31 = module0178.f11287(var30);
                                    if (module0305.NIL != module0147.f9507(var31)) {
                                        final SubLObject var32 = module0202.f12757(module0178.f11335(var30));
                                        if (module0305.NIL != f20359(var32, module0144.$g1869$.getDynamicValue(var22))) {
                                            if (module0305.NIL != module0259.f16854(var20, module0144.$g1869$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
                                                var23 = module0259.f16914(var20, module0144.$g1869$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                            }
                                            else if (module0305.NIL != f20368(var32, var20, var2, var21)) {
                                                if (!var2.eql(module0144.$g1869$.getDynamicValue(var22))) {
                                                    var23 = module0256.f16628(module0144.$g1869$.getDynamicValue(var22), var2, var21, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                                }
                                                var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0178.f11303(var30), (SubLObject)module0305.$ic21$), var23);
                                            }
                                        }
                                    }
                                }
                                finally {
                                    module0144.$g1869$.rebind(var23_53, var22);
                                }
                            }
                            var29 = var29.rest();
                            var30 = var29.first();
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var24_53, var22);
                    module0147.$g2094$.rebind(var23_52, var22);
                }
            }
            finally {
                final SubLObject var23_54 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                    f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_54, var22);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var27, var22);
            module0144.$g1879$.rebind(var26, var22);
            module0144.$g1882$.rebind(var25, var22);
            module0144.$g1881$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20366(final SubLObject var2, final SubLObject var20, final SubLObject var56, final SubLObject var38, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)module0305.NIL;
        if (module0305.NIL != module0144.$g1841$.getDynamicValue(var57) && module0305.NIL != module0144.$g1831$.getDynamicValue(var57) && !module0144.$g1841$.getDynamicValue(var57).eql(module0144.$g1831$.getDynamicValue(var57))) {
            var58 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0305.$ic22$, module0144.$g1841$.getDynamicValue(var57)), var58);
        }
        if (module0305.NIL != module0144.$g1847$.getDynamicValue(var57) && module0305.NIL != module0144.$g1846$.getDynamicValue(var57)) {
            var58 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0305.$ic23$, module0144.$g1846$.getDynamicValue(var57)), var58);
        }
        if (module0305.NIL != var21) {
            var58 = (SubLObject)ConsesLow.cons(var21, var58);
        }
        else {
            var58 = (SubLObject)ConsesLow.cons(module0147.$g2095$.getDynamicValue(var57), var58);
        }
        if (module0305.NIL != var38) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0305.$ic29$, new SubLObject[] { var20, module0144.$g1831$.getDynamicValue(var57), module0144.$g1833$.getDynamicValue(var57), var2, var56, var58 });
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0305.$ic30$, new SubLObject[] { var20, module0144.$g1831$.getDynamicValue(var57), module0144.$g1833$.getDynamicValue(var57), var2, var56, var58 });
    }
    
    public static SubLObject f20346(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == f20353(var2, var20, var21));
    }
    
    public static SubLObject f20369() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2733$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2733$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2733$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2733$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2733$.getDynamicValue(var1), (SubLObject)module0305.$ic9$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2733$.getDynamicValue(var1), (SubLObject)module0305.$ic32$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20370(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        SubLObject var24 = (SubLObject)module0305.NIL;
        if (module0305.NIL == f20371(var20, var2, var21) && module0305.NIL == var24) {
            SubLObject var25 = var2;
            final SubLObject var26 = (SubLObject)module0305.$ic36$;
            final SubLObject var27 = module0056.f4145(var26);
            final SubLObject var28 = module0139.$g1635$.currentBinding(var22);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var22);
                final SubLObject var29 = var21;
                final SubLObject var23_63 = module0147.$g2095$.currentBinding(var22);
                final SubLObject var30 = module0147.$g2094$.currentBinding(var22);
                final SubLObject var31 = module0147.$g2096$.currentBinding(var22);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var29), var22);
                    module0147.$g2094$.bind(module0147.f9546(var29), var22);
                    module0147.$g2096$.bind(module0147.f9549(var29), var22);
                    final SubLObject var32 = (SubLObject)module0305.NIL;
                    final SubLObject var23_64 = module0141.$g1714$.currentBinding(var22);
                    final SubLObject var24_66 = module0141.$g1715$.currentBinding(var22);
                    try {
                        module0141.$g1714$.bind((module0305.NIL != var32) ? var32 : module0141.f9283(), var22);
                        module0141.$g1715$.bind((SubLObject)((module0305.NIL != var32) ? module0305.$ic37$ : module0141.$g1715$.getDynamicValue(var22)), var22);
                        if (module0305.NIL != var32 && module0305.NIL != module0136.f8864() && module0305.NIL == module0141.f9279(var32)) {
                            final SubLObject var33 = module0136.$g1591$.getDynamicValue(var22);
                            if (var33.eql((SubLObject)module0305.$ic38$)) {
                                module0136.f8870((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                            }
                            else if (var33.eql((SubLObject)module0305.$ic41$)) {
                                module0136.f8871((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                            }
                            else if (var33.eql((SubLObject)module0305.$ic43$)) {
                                Errors.warn((SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$);
                            }
                            else {
                                Errors.warn((SubLObject)module0305.$ic44$, module0136.$g1591$.getDynamicValue(var22));
                                Errors.cerror((SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$);
                            }
                        }
                        final SubLObject var23_65 = module0141.$g1670$.currentBinding(var22);
                        final SubLObject var24_67 = module0141.$g1671$.currentBinding(var22);
                        final SubLObject var25_69 = module0141.$g1672$.currentBinding(var22);
                        final SubLObject var34 = module0141.$g1674$.currentBinding(var22);
                        final SubLObject var35 = module0137.$g1605$.currentBinding(var22);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0305.$ic45$), var22);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0305.$ic45$)), var22);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0305.$ic45$)), var22);
                            module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                            module0137.$g1605$.bind(module0137.f8955(module0305.$ic45$), var22);
                            if (module0305.NIL != module0136.f8865() || module0305.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0305.UNPROVIDED))) {
                                final SubLObject var23_66 = module0141.$g1677$.currentBinding(var22);
                                final SubLObject var24_68 = module0138.$g1619$.currentBinding(var22);
                                final SubLObject var25_70 = module0141.$g1674$.currentBinding(var22);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var22);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0305.$ic45$)), var22);
                                    module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                                    module0249.f16055(var25, (SubLObject)module0305.UNPROVIDED);
                                    while (module0305.NIL != var25 && module0305.NIL == var24) {
                                        final SubLObject var36 = var25;
                                        final SubLObject var23_67 = module0144.$g1869$.currentBinding(var22);
                                        try {
                                            module0144.$g1869$.bind(var36, var22);
                                            if (module0305.NIL == var24) {
                                                SubLObject var37 = (SubLObject)module0305.$ic46$;
                                                SubLObject var38 = (SubLObject)module0305.NIL;
                                                var38 = var37.first();
                                                while (module0305.NIL == var24 && module0305.NIL != var37) {
                                                    var22.resetMultipleValues();
                                                    final SubLObject var77_78 = f20372(var2, var20, var36, var38, (SubLObject)module0305.NIL, var21);
                                                    final SubLObject var79_80 = var22.secondMultipleValue();
                                                    var22.resetMultipleValues();
                                                    var23 = var77_78;
                                                    var24 = var79_80;
                                                    var37 = var37.rest();
                                                    var38 = var37.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0144.$g1869$.rebind(var23_67, var22);
                                        }
                                        final SubLObject var39 = module0200.f12443(module0137.f8955(module0305.$ic45$));
                                        SubLObject var40;
                                        SubLObject var41;
                                        SubLObject var23_68;
                                        SubLObject var24_69;
                                        SubLObject var42;
                                        SubLObject var43;
                                        SubLObject var44;
                                        SubLObject var45;
                                        SubLObject var90_91;
                                        SubLObject var46;
                                        SubLObject var23_69;
                                        SubLObject var89_94;
                                        SubLObject var47;
                                        SubLObject var48;
                                        SubLObject var23_70;
                                        SubLObject var49;
                                        SubLObject var50;
                                        SubLObject var51;
                                        SubLObject var52;
                                        SubLObject var53;
                                        SubLObject var54;
                                        SubLObject var55;
                                        SubLObject var56;
                                        SubLObject var82_104;
                                        SubLObject var57;
                                        SubLObject var23_71;
                                        SubLObject var59;
                                        SubLObject var58;
                                        SubLObject var60;
                                        SubLObject var61;
                                        SubLObject var62;
                                        SubLObject var63;
                                        SubLObject var64;
                                        SubLObject var65;
                                        for (var40 = (SubLObject)module0305.NIL, var40 = var39; module0305.NIL == var24 && module0305.NIL != var40; var40 = var40.rest()) {
                                            var41 = var40.first();
                                            var23_68 = module0137.$g1605$.currentBinding(var22);
                                            var24_69 = module0141.$g1674$.currentBinding(var22);
                                            try {
                                                module0137.$g1605$.bind(var41, var22);
                                                module0141.$g1674$.bind((SubLObject)((module0305.NIL != module0141.f9205((SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0305.NIL == module0141.$g1674$.getDynamicValue(var22)) : module0141.$g1674$.getDynamicValue(var22)), var22);
                                                var42 = module0228.f15229(var25);
                                                if (module0305.NIL != module0138.f8992(var42)) {
                                                    var43 = module0242.f15664(var42, module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                    if (module0305.NIL != var43) {
                                                        var44 = module0245.f15834(var43, module0138.f8979(), module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                        if (module0305.NIL != var44) {
                                                            for (var45 = module0066.f4838(module0067.f4891(var44)); module0305.NIL == var24 && module0305.NIL == module0066.f4841(var45); var45 = module0066.f4840(var45)) {
                                                                var22.resetMultipleValues();
                                                                var90_91 = module0066.f4839(var45);
                                                                var46 = var22.secondMultipleValue();
                                                                var22.resetMultipleValues();
                                                                if (module0305.NIL != module0147.f9507(var90_91)) {
                                                                    var23_69 = module0138.$g1623$.currentBinding(var22);
                                                                    try {
                                                                        module0138.$g1623$.bind(var90_91, var22);
                                                                        for (var89_94 = module0066.f4838(module0067.f4891(var46)); module0305.NIL == var24 && module0305.NIL == module0066.f4841(var89_94); var89_94 = module0066.f4840(var89_94)) {
                                                                            var22.resetMultipleValues();
                                                                            var47 = module0066.f4839(var89_94);
                                                                            var48 = var22.secondMultipleValue();
                                                                            var22.resetMultipleValues();
                                                                            if (module0305.NIL != module0141.f9289(var47)) {
                                                                                var23_70 = module0138.$g1624$.currentBinding(var22);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var47, var22);
                                                                                    var49 = var48;
                                                                                    if (module0305.NIL != module0077.f5302(var49)) {
                                                                                        var50 = module0077.f5333(var49);
                                                                                        for (var51 = module0032.f1741(var50), var52 = (SubLObject)module0305.NIL, var52 = module0032.f1742(var51, var50); module0305.NIL == var24 && module0305.NIL == module0032.f1744(var51, var52); var52 = module0032.f1743(var52)) {
                                                                                            var53 = module0032.f1745(var51, var52);
                                                                                            if (module0305.NIL != module0032.f1746(var52, var53) && module0305.NIL == module0249.f16059(var53, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                module0249.f16055(var53, (SubLObject)module0305.UNPROVIDED);
                                                                                                module0056.f4149(var53, var27);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var49.isList()) {
                                                                                        if (module0305.NIL == var24) {
                                                                                            var54 = var49;
                                                                                            var55 = (SubLObject)module0305.NIL;
                                                                                            var55 = var54.first();
                                                                                            while (module0305.NIL == var24 && module0305.NIL != var54) {
                                                                                                if (module0305.NIL == module0249.f16059(var55, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                    module0249.f16055(var55, (SubLObject)module0305.UNPROVIDED);
                                                                                                    module0056.f4149(var55, var27);
                                                                                                }
                                                                                                var54 = var54.rest();
                                                                                                var55 = var54.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0305.$ic47$, var49);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var23_70, var22);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var89_94);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var23_69, var22);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var45);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.$ic48$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0305.NIL != module0155.f9785(var42, (SubLObject)module0305.UNPROVIDED)) {
                                                    var56 = ((module0305.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED)));
                                                    for (var82_104 = (SubLObject)module0305.NIL, var82_104 = var56; module0305.NIL == var24 && module0305.NIL != var82_104; var82_104 = var82_104.rest()) {
                                                        var57 = var82_104.first();
                                                        var23_71 = module0138.$g1625$.currentBinding(var22);
                                                        try {
                                                            module0138.$g1625$.bind(var57, var22);
                                                            var58 = (var59 = Functions.funcall(var57, var42));
                                                            if (module0305.NIL != module0077.f5302(var59)) {
                                                                var60 = module0077.f5333(var59);
                                                                for (var61 = module0032.f1741(var60), var62 = (SubLObject)module0305.NIL, var62 = module0032.f1742(var61, var60); module0305.NIL == var24 && module0305.NIL == module0032.f1744(var61, var62); var62 = module0032.f1743(var62)) {
                                                                    var63 = module0032.f1745(var61, var62);
                                                                    if (module0305.NIL != module0032.f1746(var62, var63) && module0305.NIL == module0249.f16059(var63, (SubLObject)module0305.UNPROVIDED)) {
                                                                        module0249.f16055(var63, (SubLObject)module0305.UNPROVIDED);
                                                                        module0056.f4149(var63, var27);
                                                                    }
                                                                }
                                                            }
                                                            else if (var59.isList()) {
                                                                if (module0305.NIL == var24) {
                                                                    var64 = var59;
                                                                    var65 = (SubLObject)module0305.NIL;
                                                                    var65 = var64.first();
                                                                    while (module0305.NIL == var24 && module0305.NIL != var64) {
                                                                        if (module0305.NIL == module0249.f16059(var65, (SubLObject)module0305.UNPROVIDED)) {
                                                                            module0249.f16055(var65, (SubLObject)module0305.UNPROVIDED);
                                                                            module0056.f4149(var65, var27);
                                                                        }
                                                                        var64 = var64.rest();
                                                                        var65 = var64.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0305.$ic47$, var59);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var23_71, var22);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var24_69, var22);
                                                module0137.$g1605$.rebind(var23_68, var22);
                                            }
                                        }
                                        var25 = module0056.f4150(var27);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var25_70, var22);
                                    module0138.$g1619$.rebind(var24_68, var22);
                                    module0141.$g1677$.rebind(var23_66, var22);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic49$, var2, module0244.f15748(module0137.f8955((SubLObject)module0305.UNPROVIDED)), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var35, var22);
                            module0141.$g1674$.rebind(var34, var22);
                            module0141.$g1672$.rebind(var25_69, var22);
                            module0141.$g1671$.rebind(var24_67, var22);
                            module0141.$g1670$.rebind(var23_65, var22);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var24_66, var22);
                        module0141.$g1714$.rebind(var23_64, var22);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var31, var22);
                    module0147.$g2094$.rebind(var30, var22);
                    module0147.$g2095$.rebind(var23_63, var22);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var22));
            }
            finally {
                module0139.$g1635$.rebind(var28, var22);
            }
        }
        return var23;
    }
    
    public static SubLObject f20353(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var22)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            SubLObject var24 = (SubLObject)module0305.NIL;
            final SubLObject var25 = Time.get_internal_real_time();
            var23 = f20370(var2, var20, var21);
            var24 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var25), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2733$.getDynamicValue(var22), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2733$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2733$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var24, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2733$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2733$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var23, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2733$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2733$.getDynamicValue(var22), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var2, var20, var21), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2733$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            return var23;
        }
        return f20370(var2, var20, var21);
    }
    
    public static SubLObject f20372(final SubLObject var2, final SubLObject var20, final SubLObject var74, final SubLObject var76, final SubLObject var38, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var77 = SubLProcess.currentSubLThread();
        SubLObject var78 = (SubLObject)module0305.NIL;
        SubLObject var79 = (SubLObject)module0305.NIL;
        if (module0305.NIL != module0158.f10010(var74, (SubLObject)module0305.ONE_INTEGER, var76)) {
            final SubLObject var80 = module0158.f10011(var74, (SubLObject)module0305.ONE_INTEGER, var76);
            SubLObject var81 = var79;
            final SubLObject var82 = (SubLObject)module0305.NIL;
            while (module0305.NIL == var81) {
                final SubLObject var83 = module0052.f3695(var80, var82);
                final SubLObject var84 = (SubLObject)SubLObjectFactory.makeBoolean(!var82.eql(var83));
                if (module0305.NIL != var84) {
                    SubLObject var85 = (SubLObject)module0305.NIL;
                    try {
                        var85 = module0158.f10316(var83, (SubLObject)module0305.$ic50$, (SubLObject)module0305.$ic21$, (SubLObject)module0305.NIL);
                        SubLObject var109_114 = var79;
                        final SubLObject var110_115 = (SubLObject)module0305.NIL;
                        while (module0305.NIL == var109_114) {
                            final SubLObject var86 = module0052.f3695(var85, var110_115);
                            final SubLObject var112_116 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_115.eql(var86));
                            if (module0305.NIL != var112_116) {
                                final SubLObject var87 = module0202.f12757(module0178.f11335(var86));
                                if (module0305.NIL != f20359(var87, module0144.$g1869$.getDynamicValue(var77))) {
                                    if (module0305.NIL == var38 && module0305.NIL == f20360(var87, var20, var2, (SubLObject)module0305.UNPROVIDED)) {
                                        var78 = (SubLObject)module0305.T;
                                    }
                                    else if (module0305.NIL != var38 && module0305.NIL == f20365(var87, var20, var2, (SubLObject)module0305.UNPROVIDED)) {
                                        var78 = (SubLObject)module0305.T;
                                    }
                                    if (module0305.NIL != var78 && module0305.NIL != module0144.$g1796$.getDynamicValue(var77)) {
                                        module0303.f20203(f20373(var2, var20, module0144.$g1869$.getDynamicValue(var77), var87, var38, var21));
                                    }
                                    if (module0305.NIL == module0146.$g1960$.getDynamicValue(var77)) {
                                        var79 = (SubLObject)module0305.T;
                                    }
                                }
                            }
                            var109_114 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var112_116 || module0305.NIL != var79);
                        }
                    }
                    finally {
                        final SubLObject var88 = Threads.$is_thread_performing_cleanupP$.currentBinding(var77);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var77);
                            if (module0305.NIL != var85) {
                                module0158.f10319(var85);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var88, var77);
                        }
                    }
                }
                var81 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var84 || module0305.NIL != var79);
            }
        }
        return Values.values(var78, var79);
    }
    
    public static SubLObject f20371(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        if (module0305.NIL != module0144.f9461()) {
            final SubLObject var24 = module0139.$g1659$.currentBinding(var22);
            try {
                module0139.$g1659$.bind(module0139.f9007(), var22);
                var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != f20374(var20, (SubLObject)module0305.UNPROVIDED) && (module0305.NIL != module0259.f16854(var20, var2, var21, (SubLObject)module0305.UNPROVIDED) || (module0305.NIL != module0178.f11284(module0138.$g1627$.getDynamicValue(var22)) && module0305.NIL != module0202.f12859(module0178.f11285(module0138.$g1627$.getDynamicValue(var22))) && var20.equal(module0178.f11334(module0138.$g1627$.getDynamicValue(var22))) && module0305.NIL != module0256.f16596(module0178.f11335(module0138.$g1627$.getDynamicValue(var22)), var2, var21, (SubLObject)module0305.UNPROVIDED)) || (module0305.NIL != module0151.f9690() && module0305.NIL != module0018.f981() && module0305.NIL != module0202.f12859(module0152.f9723()) && var20.equal(module0205.f13379(module0152.f9723(), (SubLObject)module0305.UNPROVIDED)) && module0305.NIL != module0210.f13565(module0205.f13380(module0152.f9723(), (SubLObject)module0305.UNPROVIDED)) && module0305.NIL != module0256.f16596(module0205.f13380(module0152.f9723(), (SubLObject)module0305.UNPROVIDED), var2, var21, (SubLObject)module0305.UNPROVIDED) && module0305.NIL == module0202.f12592(module0152.f9723()))));
                module0139.f9011(module0139.$g1659$.getDynamicValue(var22));
            }
            finally {
                module0139.$g1659$.rebind(var24, var22);
            }
        }
        return var23;
    }
    
    public static SubLObject f20375() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2734$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2734$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2734$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2734$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2734$.getDynamicValue(var1), (SubLObject)module0305.$ic9$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2734$.getDynamicValue(var1), (SubLObject)module0305.$ic52$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20376(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        if (module0305.NIL == f20371(var20, var2, var21)) {
            SubLObject var24 = var2;
            final SubLObject var25 = (SubLObject)module0305.$ic36$;
            final SubLObject var26 = module0056.f4145(var25);
            final SubLObject var27 = module0139.$g1635$.currentBinding(var22);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var22);
                final SubLObject var28 = var21;
                final SubLObject var23_118 = module0147.$g2095$.currentBinding(var22);
                final SubLObject var29 = module0147.$g2094$.currentBinding(var22);
                final SubLObject var30 = module0147.$g2096$.currentBinding(var22);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var28), var22);
                    module0147.$g2094$.bind(module0147.f9546(var28), var22);
                    module0147.$g2096$.bind(module0147.f9549(var28), var22);
                    final SubLObject var31 = (SubLObject)module0305.NIL;
                    final SubLObject var23_119 = module0141.$g1714$.currentBinding(var22);
                    final SubLObject var24_120 = module0141.$g1715$.currentBinding(var22);
                    try {
                        module0141.$g1714$.bind((module0305.NIL != var31) ? var31 : module0141.f9283(), var22);
                        module0141.$g1715$.bind((SubLObject)((module0305.NIL != var31) ? module0305.$ic37$ : module0141.$g1715$.getDynamicValue(var22)), var22);
                        if (module0305.NIL != var31 && module0305.NIL != module0136.f8864() && module0305.NIL == module0141.f9279(var31)) {
                            final SubLObject var32 = module0136.$g1591$.getDynamicValue(var22);
                            if (var32.eql((SubLObject)module0305.$ic38$)) {
                                module0136.f8870((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic39$, var31, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                            }
                            else if (var32.eql((SubLObject)module0305.$ic41$)) {
                                module0136.f8871((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var31, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                            }
                            else if (var32.eql((SubLObject)module0305.$ic43$)) {
                                Errors.warn((SubLObject)module0305.$ic39$, var31, (SubLObject)module0305.$ic40$);
                            }
                            else {
                                Errors.warn((SubLObject)module0305.$ic44$, module0136.$g1591$.getDynamicValue(var22));
                                Errors.cerror((SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var31, (SubLObject)module0305.$ic40$);
                            }
                        }
                        final SubLObject var23_120 = module0141.$g1670$.currentBinding(var22);
                        final SubLObject var24_121 = module0141.$g1671$.currentBinding(var22);
                        final SubLObject var25_123 = module0141.$g1672$.currentBinding(var22);
                        final SubLObject var33 = module0141.$g1674$.currentBinding(var22);
                        final SubLObject var34 = module0137.$g1605$.currentBinding(var22);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0305.$ic45$), var22);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0305.$ic45$)), var22);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0305.$ic45$)), var22);
                            module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                            module0137.$g1605$.bind(module0137.f8955(module0305.$ic45$), var22);
                            if (module0305.NIL != module0136.f8865() || module0305.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0305.UNPROVIDED))) {
                                final SubLObject var23_121 = module0141.$g1677$.currentBinding(var22);
                                final SubLObject var24_122 = module0138.$g1619$.currentBinding(var22);
                                final SubLObject var25_124 = module0141.$g1674$.currentBinding(var22);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var22);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0305.$ic45$)), var22);
                                    module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                                    module0249.f16055(var24, (SubLObject)module0305.UNPROVIDED);
                                    while (module0305.NIL != var24) {
                                        final SubLObject var35 = var24;
                                        final SubLObject var23_122 = module0144.$g1869$.currentBinding(var22);
                                        try {
                                            module0144.$g1869$.bind(var35, var22);
                                            final SubLObject var36 = module0305.$ic54$;
                                            if (module0305.NIL != module0158.f10010(var35, (SubLObject)module0305.ONE_INTEGER, var36)) {
                                                final SubLObject var37 = module0158.f10011(var35, (SubLObject)module0305.ONE_INTEGER, var36);
                                                SubLObject var38 = (SubLObject)module0305.NIL;
                                                final SubLObject var39 = (SubLObject)module0305.NIL;
                                                while (module0305.NIL == var38) {
                                                    final SubLObject var40 = module0052.f3695(var37, var39);
                                                    final SubLObject var41 = (SubLObject)SubLObjectFactory.makeBoolean(!var39.eql(var40));
                                                    if (module0305.NIL != var41) {
                                                        SubLObject var42 = (SubLObject)module0305.NIL;
                                                        try {
                                                            var42 = module0158.f10316(var40, (SubLObject)module0305.$ic50$, (SubLObject)module0305.$ic21$, (SubLObject)module0305.NIL);
                                                            SubLObject var109_128 = (SubLObject)module0305.NIL;
                                                            final SubLObject var110_129 = (SubLObject)module0305.NIL;
                                                            while (module0305.NIL == var109_128) {
                                                                final SubLObject var43 = module0052.f3695(var42, var110_129);
                                                                final SubLObject var112_130 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_129.eql(var43));
                                                                if (module0305.NIL != var112_130) {
                                                                    final SubLObject var44 = module0202.f12757(module0178.f11335(var43));
                                                                    if (module0305.NIL != f20359(var44, module0144.$g1869$.getDynamicValue(var22)) && module0305.NIL == f20360(var44, var20, var2, (SubLObject)module0305.UNPROVIDED)) {
                                                                        final SubLObject var45 = var44;
                                                                        if (module0305.NIL == conses_high.member(var45, var23, Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
                                                                            var23 = (SubLObject)ConsesLow.cons(var45, var23);
                                                                        }
                                                                    }
                                                                }
                                                                var109_128 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var112_130);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var23_123 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                                                                if (module0305.NIL != var42) {
                                                                    module0158.f10319(var42);
                                                                }
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var23_123, var22);
                                                            }
                                                        }
                                                    }
                                                    var38 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var41);
                                                }
                                            }
                                        }
                                        finally {
                                            module0144.$g1869$.rebind(var23_122, var22);
                                        }
                                        SubLObject var47;
                                        final SubLObject var46 = var47 = module0200.f12443(module0137.f8955(module0305.$ic45$));
                                        SubLObject var48 = (SubLObject)module0305.NIL;
                                        var48 = var47.first();
                                        while (module0305.NIL != var47) {
                                            final SubLObject var23_124 = module0137.$g1605$.currentBinding(var22);
                                            final SubLObject var24_123 = module0141.$g1674$.currentBinding(var22);
                                            try {
                                                module0137.$g1605$.bind(var48, var22);
                                                module0141.$g1674$.bind((SubLObject)((module0305.NIL != module0141.f9205((SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0305.NIL == module0141.$g1674$.getDynamicValue(var22)) : module0141.$g1674$.getDynamicValue(var22)), var22);
                                                final SubLObject var49 = module0228.f15229(var24);
                                                if (module0305.NIL != module0138.f8992(var49)) {
                                                    final SubLObject var50 = module0242.f15664(var49, module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                    if (module0305.NIL != var50) {
                                                        final SubLObject var51 = module0245.f15834(var50, module0138.f8979(), module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                        if (module0305.NIL != var51) {
                                                            SubLObject var52;
                                                            for (var52 = module0066.f4838(module0067.f4891(var51)); module0305.NIL == module0066.f4841(var52); var52 = module0066.f4840(var52)) {
                                                                var22.resetMultipleValues();
                                                                final SubLObject var90_134 = module0066.f4839(var52);
                                                                final SubLObject var53 = var22.secondMultipleValue();
                                                                var22.resetMultipleValues();
                                                                if (module0305.NIL != module0147.f9507(var90_134)) {
                                                                    final SubLObject var23_125 = module0138.$g1623$.currentBinding(var22);
                                                                    try {
                                                                        module0138.$g1623$.bind(var90_134, var22);
                                                                        SubLObject var89_136;
                                                                        for (var89_136 = module0066.f4838(module0067.f4891(var53)); module0305.NIL == module0066.f4841(var89_136); var89_136 = module0066.f4840(var89_136)) {
                                                                            var22.resetMultipleValues();
                                                                            final SubLObject var54 = module0066.f4839(var89_136);
                                                                            final SubLObject var55 = var22.secondMultipleValue();
                                                                            var22.resetMultipleValues();
                                                                            if (module0305.NIL != module0141.f9289(var54)) {
                                                                                final SubLObject var23_126 = module0138.$g1624$.currentBinding(var22);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var54, var22);
                                                                                    final SubLObject var56 = var55;
                                                                                    if (module0305.NIL != module0077.f5302(var56)) {
                                                                                        final SubLObject var57 = module0077.f5333(var56);
                                                                                        SubLObject var58;
                                                                                        SubLObject var59;
                                                                                        SubLObject var60;
                                                                                        for (var58 = module0032.f1741(var57), var59 = (SubLObject)module0305.NIL, var59 = module0032.f1742(var58, var57); module0305.NIL == module0032.f1744(var58, var59); var59 = module0032.f1743(var59)) {
                                                                                            var60 = module0032.f1745(var58, var59);
                                                                                            if (module0305.NIL != module0032.f1746(var59, var60) && module0305.NIL == module0249.f16059(var60, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                module0249.f16055(var60, (SubLObject)module0305.UNPROVIDED);
                                                                                                module0056.f4149(var60, var26);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var56.isList()) {
                                                                                        SubLObject var61 = var56;
                                                                                        SubLObject var62 = (SubLObject)module0305.NIL;
                                                                                        var62 = var61.first();
                                                                                        while (module0305.NIL != var61) {
                                                                                            if (module0305.NIL == module0249.f16059(var62, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                module0249.f16055(var62, (SubLObject)module0305.UNPROVIDED);
                                                                                                module0056.f4149(var62, var26);
                                                                                            }
                                                                                            var61 = var61.rest();
                                                                                            var62 = var61.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0305.$ic47$, var56);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var23_126, var22);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var89_136);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var23_125, var22);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var52);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.$ic48$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0305.NIL != module0155.f9785(var49, (SubLObject)module0305.UNPROVIDED)) {
                                                    SubLObject var9_138;
                                                    final SubLObject var63 = var9_138 = ((module0305.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED)));
                                                    SubLObject var64 = (SubLObject)module0305.NIL;
                                                    var64 = var9_138.first();
                                                    while (module0305.NIL != var9_138) {
                                                        final SubLObject var23_127 = module0138.$g1625$.currentBinding(var22);
                                                        try {
                                                            module0138.$g1625$.bind(var64, var22);
                                                            final SubLObject var66;
                                                            final SubLObject var65 = var66 = Functions.funcall(var64, var49);
                                                            if (module0305.NIL != module0077.f5302(var66)) {
                                                                final SubLObject var67 = module0077.f5333(var66);
                                                                SubLObject var68;
                                                                SubLObject var69;
                                                                SubLObject var70;
                                                                for (var68 = module0032.f1741(var67), var69 = (SubLObject)module0305.NIL, var69 = module0032.f1742(var68, var67); module0305.NIL == module0032.f1744(var68, var69); var69 = module0032.f1743(var69)) {
                                                                    var70 = module0032.f1745(var68, var69);
                                                                    if (module0305.NIL != module0032.f1746(var69, var70) && module0305.NIL == module0249.f16059(var70, (SubLObject)module0305.UNPROVIDED)) {
                                                                        module0249.f16055(var70, (SubLObject)module0305.UNPROVIDED);
                                                                        module0056.f4149(var70, var26);
                                                                    }
                                                                }
                                                            }
                                                            else if (var66.isList()) {
                                                                SubLObject var71 = var66;
                                                                SubLObject var72 = (SubLObject)module0305.NIL;
                                                                var72 = var71.first();
                                                                while (module0305.NIL != var71) {
                                                                    if (module0305.NIL == module0249.f16059(var72, (SubLObject)module0305.UNPROVIDED)) {
                                                                        module0249.f16055(var72, (SubLObject)module0305.UNPROVIDED);
                                                                        module0056.f4149(var72, var26);
                                                                    }
                                                                    var71 = var71.rest();
                                                                    var72 = var71.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0305.$ic47$, var66);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var23_127, var22);
                                                        }
                                                        var9_138 = var9_138.rest();
                                                        var64 = var9_138.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var24_123, var22);
                                                module0137.$g1605$.rebind(var23_124, var22);
                                            }
                                            var47 = var47.rest();
                                            var48 = var47.first();
                                        }
                                        var24 = module0056.f4150(var26);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var25_124, var22);
                                    module0138.$g1619$.rebind(var24_122, var22);
                                    module0141.$g1677$.rebind(var23_121, var22);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic49$, var2, module0244.f15748(module0137.f8955((SubLObject)module0305.UNPROVIDED)), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var34, var22);
                            module0141.$g1674$.rebind(var33, var22);
                            module0141.$g1672$.rebind(var25_123, var22);
                            module0141.$g1671$.rebind(var24_121, var22);
                            module0141.$g1670$.rebind(var23_120, var22);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var24_120, var22);
                        module0141.$g1714$.rebind(var23_119, var22);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var30, var22);
                    module0147.$g2094$.rebind(var29, var22);
                    module0147.$g2095$.rebind(var23_118, var22);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var22));
            }
            finally {
                module0139.$g1635$.rebind(var27, var22);
            }
        }
        return var23;
    }
    
    public static SubLObject f20377(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var22)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            SubLObject var24 = (SubLObject)module0305.NIL;
            final SubLObject var25 = Time.get_internal_real_time();
            var23 = f20376(var2, var20, var21);
            var24 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var25), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2734$.getDynamicValue(var22), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2734$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2734$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var24, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2734$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2734$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var23, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2734$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2734$.getDynamicValue(var22), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var2, var20, var21), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2734$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            return var23;
        }
        return f20376(var2, var20, var21);
    }
    
    public static SubLObject f20378(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1881$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1882$.currentBinding(var22);
        final SubLObject var26 = module0144.$g1879$.currentBinding(var22);
        final SubLObject var27 = module0144.$g1880$.currentBinding(var22);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var22);
            module0144.$g1882$.bind(module0149.f9627(), var22);
            module0144.$g1879$.bind(module0149.f9628(), var22);
            module0144.$g1880$.bind(module0149.f9629(), var22);
            try {
                if (module0305.NIL == f20371(var20, var2, var21) && module0305.NIL == var23) {
                    SubLObject var28 = var2;
                    final SubLObject var29 = (SubLObject)module0305.$ic36$;
                    final SubLObject var30 = module0056.f4145(var29);
                    final SubLObject var23_140 = module0139.$g1635$.currentBinding(var22);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var22);
                        final SubLObject var31 = var21;
                        final SubLObject var23_141 = module0147.$g2095$.currentBinding(var22);
                        final SubLObject var24_142 = module0147.$g2094$.currentBinding(var22);
                        final SubLObject var25_143 = module0147.$g2096$.currentBinding(var22);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var31), var22);
                            module0147.$g2094$.bind(module0147.f9546(var31), var22);
                            module0147.$g2096$.bind(module0147.f9549(var31), var22);
                            final SubLObject var32 = (SubLObject)module0305.NIL;
                            final SubLObject var23_142 = module0141.$g1714$.currentBinding(var22);
                            final SubLObject var24_143 = module0141.$g1715$.currentBinding(var22);
                            try {
                                module0141.$g1714$.bind((module0305.NIL != var32) ? var32 : module0141.f9283(), var22);
                                module0141.$g1715$.bind((SubLObject)((module0305.NIL != var32) ? module0305.$ic37$ : module0141.$g1715$.getDynamicValue(var22)), var22);
                                if (module0305.NIL != var32 && module0305.NIL != module0136.f8864() && module0305.NIL == module0141.f9279(var32)) {
                                    final SubLObject var33 = module0136.$g1591$.getDynamicValue(var22);
                                    if (var33.eql((SubLObject)module0305.$ic38$)) {
                                        module0136.f8870((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                    }
                                    else if (var33.eql((SubLObject)module0305.$ic41$)) {
                                        module0136.f8871((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                    }
                                    else if (var33.eql((SubLObject)module0305.$ic43$)) {
                                        Errors.warn((SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$);
                                    }
                                    else {
                                        Errors.warn((SubLObject)module0305.$ic44$, module0136.$g1591$.getDynamicValue(var22));
                                        Errors.cerror((SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$);
                                    }
                                }
                                final SubLObject var23_143 = module0141.$g1670$.currentBinding(var22);
                                final SubLObject var24_144 = module0141.$g1671$.currentBinding(var22);
                                final SubLObject var25_144 = module0141.$g1672$.currentBinding(var22);
                                final SubLObject var26_149 = module0141.$g1674$.currentBinding(var22);
                                final SubLObject var34 = module0137.$g1605$.currentBinding(var22);
                                try {
                                    module0141.$g1670$.bind(module0137.f8955(module0305.$ic45$), var22);
                                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0305.$ic45$)), var22);
                                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0305.$ic45$)), var22);
                                    module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                                    module0137.$g1605$.bind(module0137.f8955(module0305.$ic45$), var22);
                                    if (module0305.NIL != module0136.f8865() || module0305.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0305.UNPROVIDED))) {
                                        final SubLObject var23_144 = module0141.$g1677$.currentBinding(var22);
                                        final SubLObject var24_145 = module0138.$g1619$.currentBinding(var22);
                                        final SubLObject var25_145 = module0141.$g1674$.currentBinding(var22);
                                        try {
                                            module0141.$g1677$.bind(module0141.f9208(), var22);
                                            module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0305.$ic45$)), var22);
                                            module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                                            module0249.f16055(var28, (SubLObject)module0305.UNPROVIDED);
                                            while (module0305.NIL != var28 && module0305.NIL == var23) {
                                                final SubLObject var35 = var28;
                                                final SubLObject var23_145 = module0144.$g1869$.currentBinding(var22);
                                                try {
                                                    module0144.$g1869$.bind(var35, var22);
                                                    if (module0305.NIL == var23) {
                                                        SubLObject var36 = (SubLObject)module0305.$ic46$;
                                                        SubLObject var37 = (SubLObject)module0305.NIL;
                                                        var37 = var36.first();
                                                        while (module0305.NIL == var23 && module0305.NIL != var36) {
                                                            final SubLObject var38 = var37;
                                                            if (module0305.NIL != module0158.f10010(var35, (SubLObject)module0305.ONE_INTEGER, var38)) {
                                                                final SubLObject var39 = module0158.f10011(var35, (SubLObject)module0305.ONE_INTEGER, var38);
                                                                SubLObject var40 = (SubLObject)module0305.NIL;
                                                                final SubLObject var41 = (SubLObject)module0305.NIL;
                                                                while (module0305.NIL == var40) {
                                                                    final SubLObject var42 = module0052.f3695(var39, var41);
                                                                    final SubLObject var43 = (SubLObject)SubLObjectFactory.makeBoolean(!var41.eql(var42));
                                                                    if (module0305.NIL != var43) {
                                                                        SubLObject var44 = (SubLObject)module0305.NIL;
                                                                        try {
                                                                            var44 = module0158.f10316(var42, (SubLObject)module0305.$ic50$, (SubLObject)module0305.$ic21$, (SubLObject)module0305.NIL);
                                                                            SubLObject var109_154 = (SubLObject)module0305.NIL;
                                                                            final SubLObject var110_155 = (SubLObject)module0305.NIL;
                                                                            while (module0305.NIL == var109_154) {
                                                                                final SubLObject var45 = module0052.f3695(var44, var110_155);
                                                                                final SubLObject var112_156 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_155.eql(var45));
                                                                                if (module0305.NIL != var112_156) {
                                                                                    final SubLObject var46 = module0202.f12757(module0178.f11335(var45));
                                                                                    if (module0305.NIL != f20359(var46, module0144.$g1869$.getDynamicValue(var22)) && module0305.NIL == f20360(var46, var20, var2, (SubLObject)module0305.UNPROVIDED)) {
                                                                                        if (!var2.eql(module0144.$g1869$.getDynamicValue(var22))) {
                                                                                            var23 = module0256.f16628(var2, module0144.$g1869$.getDynamicValue(var22), var21, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                                                                        }
                                                                                        var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0178.f11303(var45), (SubLObject)module0305.$ic21$), var23);
                                                                                    }
                                                                                }
                                                                                var109_154 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var112_156);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            final SubLObject var23_146 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                                                                            try {
                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                                                                                if (module0305.NIL != var44) {
                                                                                    module0158.f10319(var44);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                Threads.$is_thread_performing_cleanupP$.rebind(var23_146, var22);
                                                                            }
                                                                        }
                                                                    }
                                                                    var40 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var43);
                                                                }
                                                            }
                                                            var36 = var36.rest();
                                                            var37 = var36.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0144.$g1869$.rebind(var23_145, var22);
                                                }
                                                final SubLObject var47 = module0200.f12443(module0137.f8955(module0305.$ic45$));
                                                SubLObject var48;
                                                SubLObject var49;
                                                SubLObject var23_147;
                                                SubLObject var24_146;
                                                SubLObject var50;
                                                SubLObject var51;
                                                SubLObject var52;
                                                SubLObject var53;
                                                SubLObject var90_160;
                                                SubLObject var54;
                                                SubLObject var23_148;
                                                SubLObject var89_162;
                                                SubLObject var55;
                                                SubLObject var56;
                                                SubLObject var23_149;
                                                SubLObject var57;
                                                SubLObject var58;
                                                SubLObject var59;
                                                SubLObject var60;
                                                SubLObject var61;
                                                SubLObject var62;
                                                SubLObject var63;
                                                SubLObject var64;
                                                SubLObject var82_164;
                                                SubLObject var65;
                                                SubLObject var23_150;
                                                SubLObject var67;
                                                SubLObject var66;
                                                SubLObject var68;
                                                SubLObject var69;
                                                SubLObject var70;
                                                SubLObject var71;
                                                SubLObject var72;
                                                SubLObject var73;
                                                for (var48 = (SubLObject)module0305.NIL, var48 = var47; module0305.NIL == var23 && module0305.NIL != var48; var48 = var48.rest()) {
                                                    var49 = var48.first();
                                                    var23_147 = module0137.$g1605$.currentBinding(var22);
                                                    var24_146 = module0141.$g1674$.currentBinding(var22);
                                                    try {
                                                        module0137.$g1605$.bind(var49, var22);
                                                        module0141.$g1674$.bind((SubLObject)((module0305.NIL != module0141.f9205((SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0305.NIL == module0141.$g1674$.getDynamicValue(var22)) : module0141.$g1674$.getDynamicValue(var22)), var22);
                                                        var50 = module0228.f15229(var28);
                                                        if (module0305.NIL != module0138.f8992(var50)) {
                                                            var51 = module0242.f15664(var50, module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                            if (module0305.NIL != var51) {
                                                                var52 = module0245.f15834(var51, module0138.f8979(), module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                                if (module0305.NIL != var52) {
                                                                    for (var53 = module0066.f4838(module0067.f4891(var52)); module0305.NIL == var23 && module0305.NIL == module0066.f4841(var53); var53 = module0066.f4840(var53)) {
                                                                        var22.resetMultipleValues();
                                                                        var90_160 = module0066.f4839(var53);
                                                                        var54 = var22.secondMultipleValue();
                                                                        var22.resetMultipleValues();
                                                                        if (module0305.NIL != module0147.f9507(var90_160)) {
                                                                            var23_148 = module0138.$g1623$.currentBinding(var22);
                                                                            try {
                                                                                module0138.$g1623$.bind(var90_160, var22);
                                                                                for (var89_162 = module0066.f4838(module0067.f4891(var54)); module0305.NIL == var23 && module0305.NIL == module0066.f4841(var89_162); var89_162 = module0066.f4840(var89_162)) {
                                                                                    var22.resetMultipleValues();
                                                                                    var55 = module0066.f4839(var89_162);
                                                                                    var56 = var22.secondMultipleValue();
                                                                                    var22.resetMultipleValues();
                                                                                    if (module0305.NIL != module0141.f9289(var55)) {
                                                                                        var23_149 = module0138.$g1624$.currentBinding(var22);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var55, var22);
                                                                                            var57 = var56;
                                                                                            if (module0305.NIL != module0077.f5302(var57)) {
                                                                                                var58 = module0077.f5333(var57);
                                                                                                for (var59 = module0032.f1741(var58), var60 = (SubLObject)module0305.NIL, var60 = module0032.f1742(var59, var58); module0305.NIL == var23 && module0305.NIL == module0032.f1744(var59, var60); var60 = module0032.f1743(var60)) {
                                                                                                    var61 = module0032.f1745(var59, var60);
                                                                                                    if (module0305.NIL != module0032.f1746(var60, var61) && module0305.NIL == module0249.f16059(var61, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                        module0249.f16055(var61, (SubLObject)module0305.UNPROVIDED);
                                                                                                        module0056.f4149(var61, var30);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var57.isList()) {
                                                                                                if (module0305.NIL == var23) {
                                                                                                    var62 = var57;
                                                                                                    var63 = (SubLObject)module0305.NIL;
                                                                                                    var63 = var62.first();
                                                                                                    while (module0305.NIL == var23 && module0305.NIL != var62) {
                                                                                                        if (module0305.NIL == module0249.f16059(var63, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                            module0249.f16055(var63, (SubLObject)module0305.UNPROVIDED);
                                                                                                            module0056.f4149(var63, var30);
                                                                                                        }
                                                                                                        var62 = var62.rest();
                                                                                                        var63 = var62.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)module0305.$ic47$, var57);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var23_149, var22);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var89_162);
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var23_148, var22);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var53);
                                                                }
                                                            }
                                                            else {
                                                                module0136.f8870((SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.$ic48$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (module0305.NIL != module0155.f9785(var50, (SubLObject)module0305.UNPROVIDED)) {
                                                            var64 = ((module0305.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED)));
                                                            for (var82_164 = (SubLObject)module0305.NIL, var82_164 = var64; module0305.NIL == var23 && module0305.NIL != var82_164; var82_164 = var82_164.rest()) {
                                                                var65 = var82_164.first();
                                                                var23_150 = module0138.$g1625$.currentBinding(var22);
                                                                try {
                                                                    module0138.$g1625$.bind(var65, var22);
                                                                    var66 = (var67 = Functions.funcall(var65, var50));
                                                                    if (module0305.NIL != module0077.f5302(var67)) {
                                                                        var68 = module0077.f5333(var67);
                                                                        for (var69 = module0032.f1741(var68), var70 = (SubLObject)module0305.NIL, var70 = module0032.f1742(var69, var68); module0305.NIL == var23 && module0305.NIL == module0032.f1744(var69, var70); var70 = module0032.f1743(var70)) {
                                                                            var71 = module0032.f1745(var69, var70);
                                                                            if (module0305.NIL != module0032.f1746(var70, var71) && module0305.NIL == module0249.f16059(var71, (SubLObject)module0305.UNPROVIDED)) {
                                                                                module0249.f16055(var71, (SubLObject)module0305.UNPROVIDED);
                                                                                module0056.f4149(var71, var30);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var67.isList()) {
                                                                        if (module0305.NIL == var23) {
                                                                            var72 = var67;
                                                                            var73 = (SubLObject)module0305.NIL;
                                                                            var73 = var72.first();
                                                                            while (module0305.NIL == var23 && module0305.NIL != var72) {
                                                                                if (module0305.NIL == module0249.f16059(var73, (SubLObject)module0305.UNPROVIDED)) {
                                                                                    module0249.f16055(var73, (SubLObject)module0305.UNPROVIDED);
                                                                                    module0056.f4149(var73, var30);
                                                                                }
                                                                                var72 = var72.rest();
                                                                                var73 = var72.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)module0305.$ic47$, var67);
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1625$.rebind(var23_150, var22);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var24_146, var22);
                                                        module0137.$g1605$.rebind(var23_147, var22);
                                                    }
                                                }
                                                var28 = module0056.f4150(var30);
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var25_145, var22);
                                            module0138.$g1619$.rebind(var24_145, var22);
                                            module0141.$g1677$.rebind(var23_144, var22);
                                        }
                                    }
                                    else {
                                        module0136.f8872((SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic49$, var2, module0244.f15748(module0137.f8955((SubLObject)module0305.UNPROVIDED)), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                    }
                                }
                                finally {
                                    module0137.$g1605$.rebind(var34, var22);
                                    module0141.$g1674$.rebind(var26_149, var22);
                                    module0141.$g1672$.rebind(var25_144, var22);
                                    module0141.$g1671$.rebind(var24_144, var22);
                                    module0141.$g1670$.rebind(var23_143, var22);
                                }
                            }
                            finally {
                                module0141.$g1715$.rebind(var24_143, var22);
                                module0141.$g1714$.rebind(var23_142, var22);
                            }
                        }
                        finally {
                            module0147.$g2096$.rebind(var25_143, var22);
                            module0147.$g2094$.rebind(var24_142, var22);
                            module0147.$g2095$.rebind(var23_141, var22);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var22));
                    }
                    finally {
                        module0139.$g1635$.rebind(var23_140, var22);
                    }
                }
            }
            finally {
                final SubLObject var23_151 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                    f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_151, var22);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var27, var22);
            module0144.$g1879$.rebind(var26, var22);
            module0144.$g1882$.rebind(var25, var22);
            module0144.$g1881$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20373(final SubLObject var2, final SubLObject var20, final SubLObject var167, final SubLObject var36, final SubLObject var38, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var168 = SubLProcess.currentSubLThread();
        SubLObject var169 = (SubLObject)module0305.NIL;
        if (module0305.NIL != module0144.$g1841$.getDynamicValue(var168) && module0305.NIL != module0144.$g1831$.getDynamicValue(var168) && !module0144.$g1841$.getDynamicValue(var168).eql(module0144.$g1831$.getDynamicValue(var168))) {
            var169 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0305.$ic22$, module0144.$g1841$.getDynamicValue(var168)), var169);
        }
        if (module0305.NIL != module0144.$g1847$.getDynamicValue(var168) && module0305.NIL != module0144.$g1846$.getDynamicValue(var168)) {
            var169 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0305.$ic23$, module0144.$g1846$.getDynamicValue(var168)), var169);
        }
        if (module0305.NIL != var21) {
            var169 = (SubLObject)ConsesLow.cons(var21, var169);
        }
        else {
            var169 = (SubLObject)ConsesLow.cons(module0147.$g2095$.getDynamicValue(var168), var169);
        }
        if (module0305.NIL != var38) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0305.$ic55$, new SubLObject[] { var20, module0144.$g1831$.getDynamicValue(var168), module0144.$g1833$.getDynamicValue(var168), var2, var167, var36, var169 });
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0305.$ic56$, new SubLObject[] { var20, module0144.$g1831$.getDynamicValue(var168), module0144.$g1833$.getDynamicValue(var168), var2, var167, var36, var169 });
    }
    
    public static SubLObject f20379(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0305.NIL == module0144.$g1857$.getDynamicValue(var3)) {
            return (SubLObject)module0305.NIL;
        }
        final SubLObject var4 = f20380(var2);
        if (var4.eql((SubLObject)module0305.$ic1$)) {
            return (SubLObject)module0305.T;
        }
        if (var4.eql((SubLObject)module0305.$ic2$)) {
            return (SubLObject)module0305.NIL;
        }
        final SubLObject var5 = f20349(var2, module0144.$g1832$.getDynamicValue(var3), (SubLObject)module0305.UNPROVIDED);
        if (module0305.NIL != var5) {
            f20381(var2, (SubLObject)module0305.$ic1$);
        }
        else {
            f20381(var2, (SubLObject)module0305.$ic2$);
        }
        return var5;
    }
    
    public static SubLObject f20382(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0305.NIL == module0144.$g1857$.getDynamicValue(var3)) {
            return (SubLObject)module0305.NIL;
        }
        final SubLObject var4 = f20380(var2);
        if (var4.eql((SubLObject)module0305.$ic1$)) {
            return (SubLObject)module0305.NIL;
        }
        if (var4.eql((SubLObject)module0305.$ic2$)) {
            return (SubLObject)module0305.T;
        }
        final SubLObject var5 = f20354(var2, module0144.$g1832$.getDynamicValue(var3), (SubLObject)module0305.UNPROVIDED);
        if (module0305.NIL != var5) {
            f20381(var2, (SubLObject)module0305.$ic2$);
        }
        else {
            f20381(var2, (SubLObject)module0305.$ic1$);
        }
        return var5;
    }
    
    public static SubLObject f20349(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var22)) {
            return module0306.f20655(var2, var20, var21);
        }
        return f20383(var2, var20, var21);
    }
    
    public static SubLObject f20384() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2735$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2735$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2735$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2735$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2735$.getDynamicValue(var1), (SubLObject)module0305.$ic9$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2735$.getDynamicValue(var1), (SubLObject)module0305.$ic58$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20385(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0259.f16975(var20, var2, var21, (SubLObject)module0305.UNPROVIDED)) {
            return (SubLObject)module0305.T;
        }
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1881$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1882$.currentBinding(var22);
        final SubLObject var26 = module0144.$g1879$.currentBinding(var22);
        final SubLObject var27 = module0144.$g1880$.currentBinding(var22);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var22);
            module0144.$g1882$.bind(module0149.f9627(), var22);
            module0144.$g1879$.bind(module0149.f9628(), var22);
            module0144.$g1880$.bind(module0149.f9629(), var22);
            try {
                final SubLObject var28 = f20386(var2, var20, var21);
                if (var28.eql((SubLObject)module0305.$ic1$)) {
                    var23 = (SubLObject)module0305.T;
                }
                else if (!var28.eql((SubLObject)module0305.$ic2$)) {
                    var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != f20387(var2) && (module0305.NIL == module0144.$g1858$.getDynamicValue(var22) || module0305.NIL != f20388(var2, var20, var21)) && module0305.NIL != f20389(var2, var20, var21));
                }
            }
            finally {
                final SubLObject var23_168 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                    f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_168, var22);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var27, var22);
            module0144.$g1879$.rebind(var26, var22);
            module0144.$g1882$.rebind(var25, var22);
            module0144.$g1881$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20383(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var22)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            SubLObject var24 = (SubLObject)module0305.NIL;
            final SubLObject var25 = Time.get_internal_real_time();
            var23 = f20385(var2, var20, var21);
            var24 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var25), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2735$.getDynamicValue(var22), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2735$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2735$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var24, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2735$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2735$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var23, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2735$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2735$.getDynamicValue(var22), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var2, var20, var21), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2735$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            return var23;
        }
        return f20385(var2, var20, var21);
    }
    
    public static SubLObject f20354(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var22)) {
            return module0306.f20658(var2, var20, var21);
        }
        return f20390(var2, var20, var21);
    }
    
    public static SubLObject f20391() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2736$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2736$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2736$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2736$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2736$.getDynamicValue(var1), (SubLObject)module0305.$ic9$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2736$.getDynamicValue(var1), (SubLObject)module0305.$ic61$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20392(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0259.f16975(var20, var2, var21, (SubLObject)module0305.UNPROVIDED)) {
            return (SubLObject)module0305.NIL;
        }
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1881$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1882$.currentBinding(var22);
        final SubLObject var26 = module0144.$g1879$.currentBinding(var22);
        final SubLObject var27 = module0144.$g1880$.currentBinding(var22);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var22);
            module0144.$g1882$.bind(module0149.f9627(), var22);
            module0144.$g1879$.bind(module0149.f9628(), var22);
            module0144.$g1880$.bind(module0149.f9629(), var22);
            try {
                final SubLObject var28 = f20386(var2, var20, var21);
                if (!var28.eql((SubLObject)module0305.$ic1$)) {
                    if (var28.eql((SubLObject)module0305.$ic2$)) {
                        var23 = (SubLObject)module0305.T;
                    }
                    else {
                        var23 = f20393(var2, var20, var21);
                    }
                }
            }
            finally {
                final SubLObject var23_169 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                    f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_169, var22);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var27, var22);
            module0144.$g1879$.rebind(var26, var22);
            module0144.$g1882$.rebind(var25, var22);
            module0144.$g1881$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20390(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var22)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            SubLObject var24 = (SubLObject)module0305.NIL;
            final SubLObject var25 = Time.get_internal_real_time();
            var23 = f20392(var2, var20, var21);
            var24 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var25), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2736$.getDynamicValue(var22), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2736$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2736$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var24, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2736$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2736$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var23, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2736$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2736$.getDynamicValue(var22), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var2, var20, var21), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2736$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            return var23;
        }
        return f20392(var2, var20, var21);
    }
    
    public static SubLObject f20394() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2737$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2737$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2737$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2737$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2737$.getDynamicValue(var1), (SubLObject)module0305.$ic9$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2737$.getDynamicValue(var1), (SubLObject)module0305.$ic64$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20395(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0202.f12757(module0220.f14557(var2, module0305.$ic66$, var21, (SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic21$));
        SubLObject var24 = (SubLObject)module0305.NIL;
        if (module0305.NIL != f20359(var23, var2)) {
            final SubLObject var25 = module0144.$g1869$.currentBinding(var22);
            try {
                module0144.$g1869$.bind(var2, var22);
                if (module0305.NIL != f20365(var23, var20, var2, var21)) {
                    var24 = (SubLObject)module0305.$ic1$;
                }
                else if (module0305.NIL != module0144.$g1796$.getDynamicValue(var22)) {
                    var24 = (SubLObject)module0305.$ic2$;
                    module0303.f20203(f20361(var2, var20, var23, (SubLObject)module0305.T, var21));
                }
                else {
                    var24 = (SubLObject)module0305.$ic2$;
                }
            }
            finally {
                module0144.$g1869$.rebind(var25, var22);
            }
        }
        return var24;
    }
    
    public static SubLObject f20386(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var22)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            SubLObject var24 = (SubLObject)module0305.NIL;
            final SubLObject var25 = Time.get_internal_real_time();
            var23 = f20395(var2, var20, var21);
            var24 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var25), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2737$.getDynamicValue(var22), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2737$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2737$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var24, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2737$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2737$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var23, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2737$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2737$.getDynamicValue(var22), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var2, var20, var21), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2737$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            return var23;
        }
        return f20395(var2, var20, var21);
    }
    
    public static SubLObject f20396() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2738$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2738$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2738$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2738$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2738$.getDynamicValue(var1), (SubLObject)module0305.$ic9$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2738$.getDynamicValue(var1), (SubLObject)module0305.$ic68$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20397(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        return f20364(var2, var20, f20387(var2), (SubLObject)module0305.T, var21);
    }
    
    public static SubLObject f20389(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var22)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            SubLObject var24 = (SubLObject)module0305.NIL;
            final SubLObject var25 = Time.get_internal_real_time();
            var23 = f20397(var2, var20, var21);
            var24 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var25), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2738$.getDynamicValue(var22), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2738$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2738$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var24, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2738$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2738$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var23, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2738$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2738$.getDynamicValue(var22), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var2, var20, var21), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2738$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            return var23;
        }
        return f20397(var2, var20, var21);
    }
    
    public static SubLObject f20388(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == f20393(var2, var20, var21));
    }
    
    public static SubLObject f20398() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2739$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2739$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2739$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2739$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2739$.getDynamicValue(var1), (SubLObject)module0305.$ic9$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2739$.getDynamicValue(var1), (SubLObject)module0305.$ic71$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20399(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        SubLObject var24 = (SubLObject)module0305.NIL;
        if (module0305.NIL == var24) {
            SubLObject var25 = var2;
            final SubLObject var26 = (SubLObject)module0305.$ic36$;
            final SubLObject var27 = module0056.f4145(var26);
            final SubLObject var28 = module0139.$g1635$.currentBinding(var22);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var22);
                final SubLObject var29 = var21;
                final SubLObject var23_170 = module0147.$g2095$.currentBinding(var22);
                final SubLObject var30 = module0147.$g2094$.currentBinding(var22);
                final SubLObject var31 = module0147.$g2096$.currentBinding(var22);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var29), var22);
                    module0147.$g2094$.bind(module0147.f9546(var29), var22);
                    module0147.$g2096$.bind(module0147.f9549(var29), var22);
                    final SubLObject var32 = (SubLObject)module0305.NIL;
                    final SubLObject var23_171 = module0141.$g1714$.currentBinding(var22);
                    final SubLObject var24_172 = module0141.$g1715$.currentBinding(var22);
                    try {
                        module0141.$g1714$.bind((module0305.NIL != var32) ? var32 : module0141.f9283(), var22);
                        module0141.$g1715$.bind((SubLObject)((module0305.NIL != var32) ? module0305.$ic37$ : module0141.$g1715$.getDynamicValue(var22)), var22);
                        if (module0305.NIL != var32 && module0305.NIL != module0136.f8864() && module0305.NIL == module0141.f9279(var32)) {
                            final SubLObject var33 = module0136.$g1591$.getDynamicValue(var22);
                            if (var33.eql((SubLObject)module0305.$ic38$)) {
                                module0136.f8870((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                            }
                            else if (var33.eql((SubLObject)module0305.$ic41$)) {
                                module0136.f8871((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                            }
                            else if (var33.eql((SubLObject)module0305.$ic43$)) {
                                Errors.warn((SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$);
                            }
                            else {
                                Errors.warn((SubLObject)module0305.$ic44$, module0136.$g1591$.getDynamicValue(var22));
                                Errors.cerror((SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$);
                            }
                        }
                        final SubLObject var23_172 = module0141.$g1670$.currentBinding(var22);
                        final SubLObject var24_173 = module0141.$g1671$.currentBinding(var22);
                        final SubLObject var25_175 = module0141.$g1672$.currentBinding(var22);
                        final SubLObject var34 = module0141.$g1674$.currentBinding(var22);
                        final SubLObject var35 = module0137.$g1605$.currentBinding(var22);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0305.$ic45$), var22);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0305.$ic45$)), var22);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0305.$ic45$)), var22);
                            module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                            module0137.$g1605$.bind(module0137.f8955(module0305.$ic45$), var22);
                            if (module0305.NIL != module0136.f8865() || module0305.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0305.UNPROVIDED))) {
                                final SubLObject var23_173 = module0141.$g1677$.currentBinding(var22);
                                final SubLObject var24_174 = module0138.$g1619$.currentBinding(var22);
                                final SubLObject var25_176 = module0141.$g1674$.currentBinding(var22);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var22);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0305.$ic45$)), var22);
                                    module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                                    module0249.f16055(var25, (SubLObject)module0305.UNPROVIDED);
                                    while (module0305.NIL != var25 && module0305.NIL == var24) {
                                        final SubLObject var36 = var25;
                                        final SubLObject var23_174 = module0144.$g1869$.currentBinding(var22);
                                        try {
                                            module0144.$g1869$.bind(var36, var22);
                                            if (module0305.NIL == var24) {
                                                SubLObject var37 = (SubLObject)module0305.$ic73$;
                                                SubLObject var38 = (SubLObject)module0305.NIL;
                                                var38 = var37.first();
                                                while (module0305.NIL == var24 && module0305.NIL != var37) {
                                                    var22.resetMultipleValues();
                                                    final SubLObject var180_181 = f20372(var2, var20, var36, var38, (SubLObject)module0305.T, var21);
                                                    final SubLObject var182_183 = var22.secondMultipleValue();
                                                    var22.resetMultipleValues();
                                                    var23 = var180_181;
                                                    var24 = var182_183;
                                                    var37 = var37.rest();
                                                    var38 = var37.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0144.$g1869$.rebind(var23_174, var22);
                                        }
                                        final SubLObject var39 = module0200.f12443(module0137.f8955(module0305.$ic45$));
                                        SubLObject var40;
                                        SubLObject var41;
                                        SubLObject var23_175;
                                        SubLObject var24_175;
                                        SubLObject var42;
                                        SubLObject var43;
                                        SubLObject var44;
                                        SubLObject var45;
                                        SubLObject var90_186;
                                        SubLObject var46;
                                        SubLObject var23_176;
                                        SubLObject var89_188;
                                        SubLObject var47;
                                        SubLObject var48;
                                        SubLObject var23_177;
                                        SubLObject var49;
                                        SubLObject var50;
                                        SubLObject var51;
                                        SubLObject var52;
                                        SubLObject var53;
                                        SubLObject var54;
                                        SubLObject var55;
                                        SubLObject var56;
                                        SubLObject var82_190;
                                        SubLObject var57;
                                        SubLObject var23_178;
                                        SubLObject var59;
                                        SubLObject var58;
                                        SubLObject var60;
                                        SubLObject var61;
                                        SubLObject var62;
                                        SubLObject var63;
                                        SubLObject var64;
                                        SubLObject var65;
                                        for (var40 = (SubLObject)module0305.NIL, var40 = var39; module0305.NIL == var24 && module0305.NIL != var40; var40 = var40.rest()) {
                                            var41 = var40.first();
                                            var23_175 = module0137.$g1605$.currentBinding(var22);
                                            var24_175 = module0141.$g1674$.currentBinding(var22);
                                            try {
                                                module0137.$g1605$.bind(var41, var22);
                                                module0141.$g1674$.bind((SubLObject)((module0305.NIL != module0141.f9205((SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0305.NIL == module0141.$g1674$.getDynamicValue(var22)) : module0141.$g1674$.getDynamicValue(var22)), var22);
                                                var42 = module0228.f15229(var25);
                                                if (module0305.NIL != module0138.f8992(var42)) {
                                                    var43 = module0242.f15664(var42, module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                    if (module0305.NIL != var43) {
                                                        var44 = module0245.f15834(var43, module0138.f8979(), module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                        if (module0305.NIL != var44) {
                                                            for (var45 = module0066.f4838(module0067.f4891(var44)); module0305.NIL == var24 && module0305.NIL == module0066.f4841(var45); var45 = module0066.f4840(var45)) {
                                                                var22.resetMultipleValues();
                                                                var90_186 = module0066.f4839(var45);
                                                                var46 = var22.secondMultipleValue();
                                                                var22.resetMultipleValues();
                                                                if (module0305.NIL != module0147.f9507(var90_186)) {
                                                                    var23_176 = module0138.$g1623$.currentBinding(var22);
                                                                    try {
                                                                        module0138.$g1623$.bind(var90_186, var22);
                                                                        for (var89_188 = module0066.f4838(module0067.f4891(var46)); module0305.NIL == var24 && module0305.NIL == module0066.f4841(var89_188); var89_188 = module0066.f4840(var89_188)) {
                                                                            var22.resetMultipleValues();
                                                                            var47 = module0066.f4839(var89_188);
                                                                            var48 = var22.secondMultipleValue();
                                                                            var22.resetMultipleValues();
                                                                            if (module0305.NIL != module0141.f9289(var47)) {
                                                                                var23_177 = module0138.$g1624$.currentBinding(var22);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var47, var22);
                                                                                    var49 = var48;
                                                                                    if (module0305.NIL != module0077.f5302(var49)) {
                                                                                        var50 = module0077.f5333(var49);
                                                                                        for (var51 = module0032.f1741(var50), var52 = (SubLObject)module0305.NIL, var52 = module0032.f1742(var51, var50); module0305.NIL == var24 && module0305.NIL == module0032.f1744(var51, var52); var52 = module0032.f1743(var52)) {
                                                                                            var53 = module0032.f1745(var51, var52);
                                                                                            if (module0305.NIL != module0032.f1746(var52, var53) && module0305.NIL == module0249.f16059(var53, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                module0249.f16055(var53, (SubLObject)module0305.UNPROVIDED);
                                                                                                module0056.f4149(var53, var27);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var49.isList()) {
                                                                                        if (module0305.NIL == var24) {
                                                                                            var54 = var49;
                                                                                            var55 = (SubLObject)module0305.NIL;
                                                                                            var55 = var54.first();
                                                                                            while (module0305.NIL == var24 && module0305.NIL != var54) {
                                                                                                if (module0305.NIL == module0249.f16059(var55, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                    module0249.f16055(var55, (SubLObject)module0305.UNPROVIDED);
                                                                                                    module0056.f4149(var55, var27);
                                                                                                }
                                                                                                var54 = var54.rest();
                                                                                                var55 = var54.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0305.$ic47$, var49);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var23_177, var22);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var89_188);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var23_176, var22);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var45);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.$ic48$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0305.NIL != module0155.f9785(var42, (SubLObject)module0305.UNPROVIDED)) {
                                                    var56 = ((module0305.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED)));
                                                    for (var82_190 = (SubLObject)module0305.NIL, var82_190 = var56; module0305.NIL == var24 && module0305.NIL != var82_190; var82_190 = var82_190.rest()) {
                                                        var57 = var82_190.first();
                                                        var23_178 = module0138.$g1625$.currentBinding(var22);
                                                        try {
                                                            module0138.$g1625$.bind(var57, var22);
                                                            var58 = (var59 = Functions.funcall(var57, var42));
                                                            if (module0305.NIL != module0077.f5302(var59)) {
                                                                var60 = module0077.f5333(var59);
                                                                for (var61 = module0032.f1741(var60), var62 = (SubLObject)module0305.NIL, var62 = module0032.f1742(var61, var60); module0305.NIL == var24 && module0305.NIL == module0032.f1744(var61, var62); var62 = module0032.f1743(var62)) {
                                                                    var63 = module0032.f1745(var61, var62);
                                                                    if (module0305.NIL != module0032.f1746(var62, var63) && module0305.NIL == module0249.f16059(var63, (SubLObject)module0305.UNPROVIDED)) {
                                                                        module0249.f16055(var63, (SubLObject)module0305.UNPROVIDED);
                                                                        module0056.f4149(var63, var27);
                                                                    }
                                                                }
                                                            }
                                                            else if (var59.isList()) {
                                                                if (module0305.NIL == var24) {
                                                                    var64 = var59;
                                                                    var65 = (SubLObject)module0305.NIL;
                                                                    var65 = var64.first();
                                                                    while (module0305.NIL == var24 && module0305.NIL != var64) {
                                                                        if (module0305.NIL == module0249.f16059(var65, (SubLObject)module0305.UNPROVIDED)) {
                                                                            module0249.f16055(var65, (SubLObject)module0305.UNPROVIDED);
                                                                            module0056.f4149(var65, var27);
                                                                        }
                                                                        var64 = var64.rest();
                                                                        var65 = var64.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0305.$ic47$, var59);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var23_178, var22);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var24_175, var22);
                                                module0137.$g1605$.rebind(var23_175, var22);
                                            }
                                        }
                                        var25 = module0056.f4150(var27);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var25_176, var22);
                                    module0138.$g1619$.rebind(var24_174, var22);
                                    module0141.$g1677$.rebind(var23_173, var22);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic49$, var2, module0244.f15748(module0137.f8955((SubLObject)module0305.UNPROVIDED)), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var35, var22);
                            module0141.$g1674$.rebind(var34, var22);
                            module0141.$g1672$.rebind(var25_175, var22);
                            module0141.$g1671$.rebind(var24_173, var22);
                            module0141.$g1670$.rebind(var23_172, var22);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var24_172, var22);
                        module0141.$g1714$.rebind(var23_171, var22);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var31, var22);
                    module0147.$g2094$.rebind(var30, var22);
                    module0147.$g2095$.rebind(var23_170, var22);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var22));
            }
            finally {
                module0139.$g1635$.rebind(var28, var22);
            }
        }
        return var23;
    }
    
    public static SubLObject f20393(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var22)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            SubLObject var24 = (SubLObject)module0305.NIL;
            final SubLObject var25 = Time.get_internal_real_time();
            var23 = f20399(var2, var20, var21);
            var24 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var25), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2739$.getDynamicValue(var22), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2739$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2739$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var24, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2739$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2739$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var23, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2739$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2739$.getDynamicValue(var22), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var2, var20, var21), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2739$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            return var23;
        }
        return f20399(var2, var20, var21);
    }
    
    public static SubLObject f20400(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        if (module0305.NIL != module0144.f9461()) {
            final SubLObject var24 = module0139.$g1659$.currentBinding(var22);
            try {
                module0139.$g1659$.bind(module0139.f9007(), var22);
                var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != f20374(var20, (SubLObject)module0305.UNPROVIDED) && (module0305.NIL != module0259.f16975(var20, var2, var21, (SubLObject)module0305.UNPROVIDED) || (module0305.NIL != module0178.f11284(module0138.$g1627$.getDynamicValue(var22)) && module0305.NIL != module0202.f12864(module0178.f11285(module0138.$g1627$.getDynamicValue(var22))) && var20.equal(module0178.f11334(module0138.$g1627$.getDynamicValue(var22))) && module0305.NIL != module0256.f16596(module0178.f11335(module0138.$g1627$.getDynamicValue(var22)), var2, var21, (SubLObject)module0305.UNPROVIDED)) || (module0305.NIL != module0151.f9690() && module0305.NIL != module0018.f981() && module0305.NIL != module0202.f12864(module0152.f9723()) && var20.equal(module0205.f13379(module0152.f9723(), (SubLObject)module0305.UNPROVIDED)) && module0305.NIL != module0210.f13565(module0205.f13380(module0152.f9723(), (SubLObject)module0305.UNPROVIDED)) && module0305.NIL != module0256.f16596(module0205.f13380(module0152.f9723(), (SubLObject)module0305.UNPROVIDED), var2, var21, (SubLObject)module0305.UNPROVIDED) && module0305.NIL == module0202.f12592(module0152.f9723()))));
                module0139.f9011(module0139.$g1659$.getDynamicValue(var22));
            }
            finally {
                module0139.$g1659$.rebind(var24, var22);
            }
        }
        return var23;
    }
    
    public static SubLObject f20401() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2740$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2740$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2740$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2740$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2740$.getDynamicValue(var1), (SubLObject)module0305.$ic9$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2740$.getDynamicValue(var1), (SubLObject)module0305.$ic75$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20402(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        if (module0305.NIL == f20400(var20, var2, var21)) {
            SubLObject var24 = var2;
            final SubLObject var25 = (SubLObject)module0305.$ic36$;
            final SubLObject var26 = module0056.f4145(var25);
            final SubLObject var27 = module0139.$g1635$.currentBinding(var22);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var22);
                final SubLObject var28 = var21;
                final SubLObject var23_192 = module0147.$g2095$.currentBinding(var22);
                final SubLObject var29 = module0147.$g2094$.currentBinding(var22);
                final SubLObject var30 = module0147.$g2096$.currentBinding(var22);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var28), var22);
                    module0147.$g2094$.bind(module0147.f9546(var28), var22);
                    module0147.$g2096$.bind(module0147.f9549(var28), var22);
                    final SubLObject var31 = (SubLObject)module0305.NIL;
                    final SubLObject var23_193 = module0141.$g1714$.currentBinding(var22);
                    final SubLObject var24_194 = module0141.$g1715$.currentBinding(var22);
                    try {
                        module0141.$g1714$.bind((module0305.NIL != var31) ? var31 : module0141.f9283(), var22);
                        module0141.$g1715$.bind((SubLObject)((module0305.NIL != var31) ? module0305.$ic37$ : module0141.$g1715$.getDynamicValue(var22)), var22);
                        if (module0305.NIL != var31 && module0305.NIL != module0136.f8864() && module0305.NIL == module0141.f9279(var31)) {
                            final SubLObject var32 = module0136.$g1591$.getDynamicValue(var22);
                            if (var32.eql((SubLObject)module0305.$ic38$)) {
                                module0136.f8870((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic39$, var31, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                            }
                            else if (var32.eql((SubLObject)module0305.$ic41$)) {
                                module0136.f8871((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var31, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                            }
                            else if (var32.eql((SubLObject)module0305.$ic43$)) {
                                Errors.warn((SubLObject)module0305.$ic39$, var31, (SubLObject)module0305.$ic40$);
                            }
                            else {
                                Errors.warn((SubLObject)module0305.$ic44$, module0136.$g1591$.getDynamicValue(var22));
                                Errors.cerror((SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var31, (SubLObject)module0305.$ic40$);
                            }
                        }
                        final SubLObject var23_194 = module0141.$g1670$.currentBinding(var22);
                        final SubLObject var24_195 = module0141.$g1671$.currentBinding(var22);
                        final SubLObject var25_197 = module0141.$g1672$.currentBinding(var22);
                        final SubLObject var33 = module0141.$g1674$.currentBinding(var22);
                        final SubLObject var34 = module0137.$g1605$.currentBinding(var22);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0305.$ic45$), var22);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0305.$ic45$)), var22);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0305.$ic45$)), var22);
                            module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                            module0137.$g1605$.bind(module0137.f8955(module0305.$ic45$), var22);
                            if (module0305.NIL != module0136.f8865() || module0305.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0305.UNPROVIDED))) {
                                final SubLObject var23_195 = module0141.$g1677$.currentBinding(var22);
                                final SubLObject var24_196 = module0138.$g1619$.currentBinding(var22);
                                final SubLObject var25_198 = module0141.$g1674$.currentBinding(var22);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var22);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0305.$ic45$)), var22);
                                    module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                                    module0249.f16055(var24, (SubLObject)module0305.UNPROVIDED);
                                    while (module0305.NIL != var24) {
                                        final SubLObject var35 = var24;
                                        final SubLObject var23_196 = module0144.$g1869$.currentBinding(var22);
                                        try {
                                            module0144.$g1869$.bind(var35, var22);
                                            final SubLObject var36 = module0305.$ic77$;
                                            if (module0305.NIL != module0158.f10010(var35, (SubLObject)module0305.ONE_INTEGER, var36)) {
                                                final SubLObject var37 = module0158.f10011(var35, (SubLObject)module0305.ONE_INTEGER, var36);
                                                SubLObject var38 = (SubLObject)module0305.NIL;
                                                final SubLObject var39 = (SubLObject)module0305.NIL;
                                                while (module0305.NIL == var38) {
                                                    final SubLObject var40 = module0052.f3695(var37, var39);
                                                    final SubLObject var41 = (SubLObject)SubLObjectFactory.makeBoolean(!var39.eql(var40));
                                                    if (module0305.NIL != var41) {
                                                        SubLObject var42 = (SubLObject)module0305.NIL;
                                                        try {
                                                            var42 = module0158.f10316(var40, (SubLObject)module0305.$ic50$, (SubLObject)module0305.$ic21$, (SubLObject)module0305.NIL);
                                                            SubLObject var109_202 = (SubLObject)module0305.NIL;
                                                            final SubLObject var110_203 = (SubLObject)module0305.NIL;
                                                            while (module0305.NIL == var109_202) {
                                                                final SubLObject var43 = module0052.f3695(var42, var110_203);
                                                                final SubLObject var112_204 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_203.eql(var43));
                                                                if (module0305.NIL != var112_204) {
                                                                    final SubLObject var44 = module0202.f12757(module0178.f11335(var43));
                                                                    if (module0305.NIL != f20359(var44, module0144.$g1869$.getDynamicValue(var22)) && module0305.NIL == f20365(var44, var20, var2, (SubLObject)module0305.UNPROVIDED)) {
                                                                        final SubLObject var45 = var44;
                                                                        if (module0305.NIL == conses_high.member(var45, var23, Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
                                                                            var23 = (SubLObject)ConsesLow.cons(var45, var23);
                                                                        }
                                                                    }
                                                                }
                                                                var109_202 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var112_204);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var23_197 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                                                                if (module0305.NIL != var42) {
                                                                    module0158.f10319(var42);
                                                                }
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var23_197, var22);
                                                            }
                                                        }
                                                    }
                                                    var38 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var41);
                                                }
                                            }
                                        }
                                        finally {
                                            module0144.$g1869$.rebind(var23_196, var22);
                                        }
                                        SubLObject var47;
                                        final SubLObject var46 = var47 = module0200.f12443(module0137.f8955(module0305.$ic45$));
                                        SubLObject var48 = (SubLObject)module0305.NIL;
                                        var48 = var47.first();
                                        while (module0305.NIL != var47) {
                                            final SubLObject var23_198 = module0137.$g1605$.currentBinding(var22);
                                            final SubLObject var24_197 = module0141.$g1674$.currentBinding(var22);
                                            try {
                                                module0137.$g1605$.bind(var48, var22);
                                                module0141.$g1674$.bind((SubLObject)((module0305.NIL != module0141.f9205((SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0305.NIL == module0141.$g1674$.getDynamicValue(var22)) : module0141.$g1674$.getDynamicValue(var22)), var22);
                                                final SubLObject var49 = module0228.f15229(var24);
                                                if (module0305.NIL != module0138.f8992(var49)) {
                                                    final SubLObject var50 = module0242.f15664(var49, module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                    if (module0305.NIL != var50) {
                                                        final SubLObject var51 = module0245.f15834(var50, module0138.f8979(), module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                        if (module0305.NIL != var51) {
                                                            SubLObject var52;
                                                            for (var52 = module0066.f4838(module0067.f4891(var51)); module0305.NIL == module0066.f4841(var52); var52 = module0066.f4840(var52)) {
                                                                var22.resetMultipleValues();
                                                                final SubLObject var90_208 = module0066.f4839(var52);
                                                                final SubLObject var53 = var22.secondMultipleValue();
                                                                var22.resetMultipleValues();
                                                                if (module0305.NIL != module0147.f9507(var90_208)) {
                                                                    final SubLObject var23_199 = module0138.$g1623$.currentBinding(var22);
                                                                    try {
                                                                        module0138.$g1623$.bind(var90_208, var22);
                                                                        SubLObject var89_210;
                                                                        for (var89_210 = module0066.f4838(module0067.f4891(var53)); module0305.NIL == module0066.f4841(var89_210); var89_210 = module0066.f4840(var89_210)) {
                                                                            var22.resetMultipleValues();
                                                                            final SubLObject var54 = module0066.f4839(var89_210);
                                                                            final SubLObject var55 = var22.secondMultipleValue();
                                                                            var22.resetMultipleValues();
                                                                            if (module0305.NIL != module0141.f9289(var54)) {
                                                                                final SubLObject var23_200 = module0138.$g1624$.currentBinding(var22);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var54, var22);
                                                                                    final SubLObject var56 = var55;
                                                                                    if (module0305.NIL != module0077.f5302(var56)) {
                                                                                        final SubLObject var57 = module0077.f5333(var56);
                                                                                        SubLObject var58;
                                                                                        SubLObject var59;
                                                                                        SubLObject var60;
                                                                                        for (var58 = module0032.f1741(var57), var59 = (SubLObject)module0305.NIL, var59 = module0032.f1742(var58, var57); module0305.NIL == module0032.f1744(var58, var59); var59 = module0032.f1743(var59)) {
                                                                                            var60 = module0032.f1745(var58, var59);
                                                                                            if (module0305.NIL != module0032.f1746(var59, var60) && module0305.NIL == module0249.f16059(var60, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                module0249.f16055(var60, (SubLObject)module0305.UNPROVIDED);
                                                                                                module0056.f4149(var60, var26);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var56.isList()) {
                                                                                        SubLObject var61 = var56;
                                                                                        SubLObject var62 = (SubLObject)module0305.NIL;
                                                                                        var62 = var61.first();
                                                                                        while (module0305.NIL != var61) {
                                                                                            if (module0305.NIL == module0249.f16059(var62, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                module0249.f16055(var62, (SubLObject)module0305.UNPROVIDED);
                                                                                                module0056.f4149(var62, var26);
                                                                                            }
                                                                                            var61 = var61.rest();
                                                                                            var62 = var61.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0305.$ic47$, var56);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var23_200, var22);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var89_210);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var23_199, var22);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var52);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.$ic48$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0305.NIL != module0155.f9785(var49, (SubLObject)module0305.UNPROVIDED)) {
                                                    SubLObject var9_212;
                                                    final SubLObject var63 = var9_212 = ((module0305.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED)));
                                                    SubLObject var64 = (SubLObject)module0305.NIL;
                                                    var64 = var9_212.first();
                                                    while (module0305.NIL != var9_212) {
                                                        final SubLObject var23_201 = module0138.$g1625$.currentBinding(var22);
                                                        try {
                                                            module0138.$g1625$.bind(var64, var22);
                                                            final SubLObject var66;
                                                            final SubLObject var65 = var66 = Functions.funcall(var64, var49);
                                                            if (module0305.NIL != module0077.f5302(var66)) {
                                                                final SubLObject var67 = module0077.f5333(var66);
                                                                SubLObject var68;
                                                                SubLObject var69;
                                                                SubLObject var70;
                                                                for (var68 = module0032.f1741(var67), var69 = (SubLObject)module0305.NIL, var69 = module0032.f1742(var68, var67); module0305.NIL == module0032.f1744(var68, var69); var69 = module0032.f1743(var69)) {
                                                                    var70 = module0032.f1745(var68, var69);
                                                                    if (module0305.NIL != module0032.f1746(var69, var70) && module0305.NIL == module0249.f16059(var70, (SubLObject)module0305.UNPROVIDED)) {
                                                                        module0249.f16055(var70, (SubLObject)module0305.UNPROVIDED);
                                                                        module0056.f4149(var70, var26);
                                                                    }
                                                                }
                                                            }
                                                            else if (var66.isList()) {
                                                                SubLObject var71 = var66;
                                                                SubLObject var72 = (SubLObject)module0305.NIL;
                                                                var72 = var71.first();
                                                                while (module0305.NIL != var71) {
                                                                    if (module0305.NIL == module0249.f16059(var72, (SubLObject)module0305.UNPROVIDED)) {
                                                                        module0249.f16055(var72, (SubLObject)module0305.UNPROVIDED);
                                                                        module0056.f4149(var72, var26);
                                                                    }
                                                                    var71 = var71.rest();
                                                                    var72 = var71.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0305.$ic47$, var66);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var23_201, var22);
                                                        }
                                                        var9_212 = var9_212.rest();
                                                        var64 = var9_212.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var24_197, var22);
                                                module0137.$g1605$.rebind(var23_198, var22);
                                            }
                                            var47 = var47.rest();
                                            var48 = var47.first();
                                        }
                                        var24 = module0056.f4150(var26);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var25_198, var22);
                                    module0138.$g1619$.rebind(var24_196, var22);
                                    module0141.$g1677$.rebind(var23_195, var22);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic49$, var2, module0244.f15748(module0137.f8955((SubLObject)module0305.UNPROVIDED)), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var34, var22);
                            module0141.$g1674$.rebind(var33, var22);
                            module0141.$g1672$.rebind(var25_197, var22);
                            module0141.$g1671$.rebind(var24_195, var22);
                            module0141.$g1670$.rebind(var23_194, var22);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var24_194, var22);
                        module0141.$g1714$.rebind(var23_193, var22);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var30, var22);
                    module0147.$g2094$.rebind(var29, var22);
                    module0147.$g2095$.rebind(var23_192, var22);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var22));
            }
            finally {
                module0139.$g1635$.rebind(var27, var22);
            }
        }
        return var23;
    }
    
    public static SubLObject f20403(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var22)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            SubLObject var24 = (SubLObject)module0305.NIL;
            final SubLObject var25 = Time.get_internal_real_time();
            var23 = f20402(var2, var20, var21);
            var24 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var25), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2740$.getDynamicValue(var22), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2740$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2740$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var24, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2740$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2740$.getDynamicValue(var22), (SubLObject)ConsesLow.cons(var23, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2740$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2740$.getDynamicValue(var22), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var2, var20, var21), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2740$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED)));
            return var23;
        }
        return f20402(var2, var20, var21);
    }
    
    public static SubLObject f20404(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1881$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1882$.currentBinding(var22);
        final SubLObject var26 = module0144.$g1879$.currentBinding(var22);
        final SubLObject var27 = module0144.$g1880$.currentBinding(var22);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var22);
            module0144.$g1882$.bind(module0149.f9627(), var22);
            module0144.$g1879$.bind(module0149.f9628(), var22);
            module0144.$g1880$.bind(module0149.f9629(), var22);
            try {
                if (module0305.NIL == f20400(var20, var2, var21) && module0305.NIL == var23) {
                    SubLObject var28 = var2;
                    final SubLObject var29 = (SubLObject)module0305.$ic36$;
                    final SubLObject var30 = module0056.f4145(var29);
                    final SubLObject var23_214 = module0139.$g1635$.currentBinding(var22);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var22);
                        final SubLObject var31 = var21;
                        final SubLObject var23_215 = module0147.$g2095$.currentBinding(var22);
                        final SubLObject var24_216 = module0147.$g2094$.currentBinding(var22);
                        final SubLObject var25_217 = module0147.$g2096$.currentBinding(var22);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var31), var22);
                            module0147.$g2094$.bind(module0147.f9546(var31), var22);
                            module0147.$g2096$.bind(module0147.f9549(var31), var22);
                            final SubLObject var32 = (SubLObject)module0305.NIL;
                            final SubLObject var23_216 = module0141.$g1714$.currentBinding(var22);
                            final SubLObject var24_217 = module0141.$g1715$.currentBinding(var22);
                            try {
                                module0141.$g1714$.bind((module0305.NIL != var32) ? var32 : module0141.f9283(), var22);
                                module0141.$g1715$.bind((SubLObject)((module0305.NIL != var32) ? module0305.$ic37$ : module0141.$g1715$.getDynamicValue(var22)), var22);
                                if (module0305.NIL != var32 && module0305.NIL != module0136.f8864() && module0305.NIL == module0141.f9279(var32)) {
                                    final SubLObject var33 = module0136.$g1591$.getDynamicValue(var22);
                                    if (var33.eql((SubLObject)module0305.$ic38$)) {
                                        module0136.f8870((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                    }
                                    else if (var33.eql((SubLObject)module0305.$ic41$)) {
                                        module0136.f8871((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                    }
                                    else if (var33.eql((SubLObject)module0305.$ic43$)) {
                                        Errors.warn((SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$);
                                    }
                                    else {
                                        Errors.warn((SubLObject)module0305.$ic44$, module0136.$g1591$.getDynamicValue(var22));
                                        Errors.cerror((SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$);
                                    }
                                }
                                final SubLObject var23_217 = module0141.$g1670$.currentBinding(var22);
                                final SubLObject var24_218 = module0141.$g1671$.currentBinding(var22);
                                final SubLObject var25_218 = module0141.$g1672$.currentBinding(var22);
                                final SubLObject var26_223 = module0141.$g1674$.currentBinding(var22);
                                final SubLObject var34 = module0137.$g1605$.currentBinding(var22);
                                try {
                                    module0141.$g1670$.bind(module0137.f8955(module0305.$ic45$), var22);
                                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0305.$ic45$)), var22);
                                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0305.$ic45$)), var22);
                                    module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                                    module0137.$g1605$.bind(module0137.f8955(module0305.$ic45$), var22);
                                    if (module0305.NIL != module0136.f8865() || module0305.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0305.UNPROVIDED))) {
                                        final SubLObject var23_218 = module0141.$g1677$.currentBinding(var22);
                                        final SubLObject var24_219 = module0138.$g1619$.currentBinding(var22);
                                        final SubLObject var25_219 = module0141.$g1674$.currentBinding(var22);
                                        try {
                                            module0141.$g1677$.bind(module0141.f9208(), var22);
                                            module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0305.$ic45$)), var22);
                                            module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                                            module0249.f16055(var28, (SubLObject)module0305.UNPROVIDED);
                                            while (module0305.NIL != var28 && module0305.NIL == var23) {
                                                final SubLObject var35 = var28;
                                                final SubLObject var23_219 = module0144.$g1869$.currentBinding(var22);
                                                try {
                                                    module0144.$g1869$.bind(var35, var22);
                                                    if (module0305.NIL == var23) {
                                                        SubLObject var36 = (SubLObject)module0305.$ic73$;
                                                        SubLObject var37 = (SubLObject)module0305.NIL;
                                                        var37 = var36.first();
                                                        while (module0305.NIL == var23 && module0305.NIL != var36) {
                                                            final SubLObject var38 = var37;
                                                            if (module0305.NIL != module0158.f10010(var35, (SubLObject)module0305.ONE_INTEGER, var38)) {
                                                                final SubLObject var39 = module0158.f10011(var35, (SubLObject)module0305.ONE_INTEGER, var38);
                                                                SubLObject var40 = (SubLObject)module0305.NIL;
                                                                final SubLObject var41 = (SubLObject)module0305.NIL;
                                                                while (module0305.NIL == var40) {
                                                                    final SubLObject var42 = module0052.f3695(var39, var41);
                                                                    final SubLObject var43 = (SubLObject)SubLObjectFactory.makeBoolean(!var41.eql(var42));
                                                                    if (module0305.NIL != var43) {
                                                                        SubLObject var44 = (SubLObject)module0305.NIL;
                                                                        try {
                                                                            var44 = module0158.f10316(var42, (SubLObject)module0305.$ic50$, (SubLObject)module0305.$ic21$, (SubLObject)module0305.NIL);
                                                                            SubLObject var109_228 = (SubLObject)module0305.NIL;
                                                                            final SubLObject var110_229 = (SubLObject)module0305.NIL;
                                                                            while (module0305.NIL == var109_228) {
                                                                                final SubLObject var45 = module0052.f3695(var44, var110_229);
                                                                                final SubLObject var112_230 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_229.eql(var45));
                                                                                if (module0305.NIL != var112_230) {
                                                                                    final SubLObject var46 = module0202.f12757(module0178.f11335(var45));
                                                                                    if (module0305.NIL != f20359(var46, module0144.$g1869$.getDynamicValue(var22)) && module0305.NIL == f20365(var46, var20, var2, (SubLObject)module0305.UNPROVIDED)) {
                                                                                        if (!var2.eql(module0144.$g1869$.getDynamicValue(var22))) {
                                                                                            var23 = module0256.f16628(var2, module0144.$g1869$.getDynamicValue(var22), var21, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                                                                        }
                                                                                        var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0178.f11303(var45), (SubLObject)module0305.$ic21$), var23);
                                                                                    }
                                                                                }
                                                                                var109_228 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var112_230);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            final SubLObject var23_220 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                                                                            try {
                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                                                                                if (module0305.NIL != var44) {
                                                                                    module0158.f10319(var44);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                Threads.$is_thread_performing_cleanupP$.rebind(var23_220, var22);
                                                                            }
                                                                        }
                                                                    }
                                                                    var40 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var43);
                                                                }
                                                            }
                                                            var36 = var36.rest();
                                                            var37 = var36.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0144.$g1869$.rebind(var23_219, var22);
                                                }
                                                final SubLObject var47 = module0200.f12443(module0137.f8955(module0305.$ic45$));
                                                SubLObject var48;
                                                SubLObject var49;
                                                SubLObject var23_221;
                                                SubLObject var24_220;
                                                SubLObject var50;
                                                SubLObject var51;
                                                SubLObject var52;
                                                SubLObject var53;
                                                SubLObject var90_234;
                                                SubLObject var54;
                                                SubLObject var23_222;
                                                SubLObject var89_236;
                                                SubLObject var55;
                                                SubLObject var56;
                                                SubLObject var23_223;
                                                SubLObject var57;
                                                SubLObject var58;
                                                SubLObject var59;
                                                SubLObject var60;
                                                SubLObject var61;
                                                SubLObject var62;
                                                SubLObject var63;
                                                SubLObject var64;
                                                SubLObject var82_238;
                                                SubLObject var65;
                                                SubLObject var23_224;
                                                SubLObject var67;
                                                SubLObject var66;
                                                SubLObject var68;
                                                SubLObject var69;
                                                SubLObject var70;
                                                SubLObject var71;
                                                SubLObject var72;
                                                SubLObject var73;
                                                for (var48 = (SubLObject)module0305.NIL, var48 = var47; module0305.NIL == var23 && module0305.NIL != var48; var48 = var48.rest()) {
                                                    var49 = var48.first();
                                                    var23_221 = module0137.$g1605$.currentBinding(var22);
                                                    var24_220 = module0141.$g1674$.currentBinding(var22);
                                                    try {
                                                        module0137.$g1605$.bind(var49, var22);
                                                        module0141.$g1674$.bind((SubLObject)((module0305.NIL != module0141.f9205((SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0305.NIL == module0141.$g1674$.getDynamicValue(var22)) : module0141.$g1674$.getDynamicValue(var22)), var22);
                                                        var50 = module0228.f15229(var28);
                                                        if (module0305.NIL != module0138.f8992(var50)) {
                                                            var51 = module0242.f15664(var50, module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                            if (module0305.NIL != var51) {
                                                                var52 = module0245.f15834(var51, module0138.f8979(), module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                                if (module0305.NIL != var52) {
                                                                    for (var53 = module0066.f4838(module0067.f4891(var52)); module0305.NIL == var23 && module0305.NIL == module0066.f4841(var53); var53 = module0066.f4840(var53)) {
                                                                        var22.resetMultipleValues();
                                                                        var90_234 = module0066.f4839(var53);
                                                                        var54 = var22.secondMultipleValue();
                                                                        var22.resetMultipleValues();
                                                                        if (module0305.NIL != module0147.f9507(var90_234)) {
                                                                            var23_222 = module0138.$g1623$.currentBinding(var22);
                                                                            try {
                                                                                module0138.$g1623$.bind(var90_234, var22);
                                                                                for (var89_236 = module0066.f4838(module0067.f4891(var54)); module0305.NIL == var23 && module0305.NIL == module0066.f4841(var89_236); var89_236 = module0066.f4840(var89_236)) {
                                                                                    var22.resetMultipleValues();
                                                                                    var55 = module0066.f4839(var89_236);
                                                                                    var56 = var22.secondMultipleValue();
                                                                                    var22.resetMultipleValues();
                                                                                    if (module0305.NIL != module0141.f9289(var55)) {
                                                                                        var23_223 = module0138.$g1624$.currentBinding(var22);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var55, var22);
                                                                                            var57 = var56;
                                                                                            if (module0305.NIL != module0077.f5302(var57)) {
                                                                                                var58 = module0077.f5333(var57);
                                                                                                for (var59 = module0032.f1741(var58), var60 = (SubLObject)module0305.NIL, var60 = module0032.f1742(var59, var58); module0305.NIL == var23 && module0305.NIL == module0032.f1744(var59, var60); var60 = module0032.f1743(var60)) {
                                                                                                    var61 = module0032.f1745(var59, var60);
                                                                                                    if (module0305.NIL != module0032.f1746(var60, var61) && module0305.NIL == module0249.f16059(var61, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                        module0249.f16055(var61, (SubLObject)module0305.UNPROVIDED);
                                                                                                        module0056.f4149(var61, var30);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var57.isList()) {
                                                                                                if (module0305.NIL == var23) {
                                                                                                    var62 = var57;
                                                                                                    var63 = (SubLObject)module0305.NIL;
                                                                                                    var63 = var62.first();
                                                                                                    while (module0305.NIL == var23 && module0305.NIL != var62) {
                                                                                                        if (module0305.NIL == module0249.f16059(var63, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                            module0249.f16055(var63, (SubLObject)module0305.UNPROVIDED);
                                                                                                            module0056.f4149(var63, var30);
                                                                                                        }
                                                                                                        var62 = var62.rest();
                                                                                                        var63 = var62.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)module0305.$ic47$, var57);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var23_223, var22);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var89_236);
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var23_222, var22);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var53);
                                                                }
                                                            }
                                                            else {
                                                                module0136.f8870((SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.$ic48$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (module0305.NIL != module0155.f9785(var50, (SubLObject)module0305.UNPROVIDED)) {
                                                            var64 = ((module0305.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED)));
                                                            for (var82_238 = (SubLObject)module0305.NIL, var82_238 = var64; module0305.NIL == var23 && module0305.NIL != var82_238; var82_238 = var82_238.rest()) {
                                                                var65 = var82_238.first();
                                                                var23_224 = module0138.$g1625$.currentBinding(var22);
                                                                try {
                                                                    module0138.$g1625$.bind(var65, var22);
                                                                    var66 = (var67 = Functions.funcall(var65, var50));
                                                                    if (module0305.NIL != module0077.f5302(var67)) {
                                                                        var68 = module0077.f5333(var67);
                                                                        for (var69 = module0032.f1741(var68), var70 = (SubLObject)module0305.NIL, var70 = module0032.f1742(var69, var68); module0305.NIL == var23 && module0305.NIL == module0032.f1744(var69, var70); var70 = module0032.f1743(var70)) {
                                                                            var71 = module0032.f1745(var69, var70);
                                                                            if (module0305.NIL != module0032.f1746(var70, var71) && module0305.NIL == module0249.f16059(var71, (SubLObject)module0305.UNPROVIDED)) {
                                                                                module0249.f16055(var71, (SubLObject)module0305.UNPROVIDED);
                                                                                module0056.f4149(var71, var30);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var67.isList()) {
                                                                        if (module0305.NIL == var23) {
                                                                            var72 = var67;
                                                                            var73 = (SubLObject)module0305.NIL;
                                                                            var73 = var72.first();
                                                                            while (module0305.NIL == var23 && module0305.NIL != var72) {
                                                                                if (module0305.NIL == module0249.f16059(var73, (SubLObject)module0305.UNPROVIDED)) {
                                                                                    module0249.f16055(var73, (SubLObject)module0305.UNPROVIDED);
                                                                                    module0056.f4149(var73, var30);
                                                                                }
                                                                                var72 = var72.rest();
                                                                                var73 = var72.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)module0305.$ic47$, var67);
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1625$.rebind(var23_224, var22);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var24_220, var22);
                                                        module0137.$g1605$.rebind(var23_221, var22);
                                                    }
                                                }
                                                var28 = module0056.f4150(var30);
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var25_219, var22);
                                            module0138.$g1619$.rebind(var24_219, var22);
                                            module0141.$g1677$.rebind(var23_218, var22);
                                        }
                                    }
                                    else {
                                        module0136.f8872((SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic49$, var2, module0244.f15748(module0137.f8955((SubLObject)module0305.UNPROVIDED)), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                    }
                                }
                                finally {
                                    module0137.$g1605$.rebind(var34, var22);
                                    module0141.$g1674$.rebind(var26_223, var22);
                                    module0141.$g1672$.rebind(var25_218, var22);
                                    module0141.$g1671$.rebind(var24_218, var22);
                                    module0141.$g1670$.rebind(var23_217, var22);
                                }
                            }
                            finally {
                                module0141.$g1715$.rebind(var24_217, var22);
                                module0141.$g1714$.rebind(var23_216, var22);
                            }
                        }
                        finally {
                            module0147.$g2096$.rebind(var25_217, var22);
                            module0147.$g2094$.rebind(var24_216, var22);
                            module0147.$g2095$.rebind(var23_215, var22);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var22));
                    }
                    finally {
                        module0139.$g1635$.rebind(var23_214, var22);
                    }
                }
            }
            finally {
                final SubLObject var23_225 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                    f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_225, var22);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var27, var22);
            module0144.$g1879$.rebind(var26, var22);
            module0144.$g1882$.rebind(var25, var22);
            module0144.$g1881$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20405() {
        return Hashtables.make_hash_table((SubLObject)module0305.SIXTEEN_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
    }
    
    public static SubLObject f20406(final SubLObject var36, final SubLObject var20) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        return module0030.f1599(var36, var20, module0144.$g1883$.getDynamicValue(var37));
    }
    
    public static SubLObject f20407(final SubLObject var36, final SubLObject var241) {
        final SubLThread var242 = SubLProcess.currentSubLThread();
        final SubLObject var243 = module0030.f1604(var36, module0144.$g1883$.getDynamicValue(var242));
        if (!var241.equal(var243)) {
            f20408((SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic78$, var241, var243, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        }
        return var243;
    }
    
    public static SubLObject f20409(final SubLObject var36, final SubLObject var20) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0107.f7629(module0144.$g1883$.getDynamicValue(var37))) {
            final SubLObject var38 = Hashtables.gethash_without_values(var36, module0144.$g1883$.getDynamicValue(var37), (SubLObject)module0305.UNPROVIDED);
            return module0004.f104(var20, var38, Symbols.symbol_function((SubLObject)module0305.EQUAL), (SubLObject)module0305.UNPROVIDED);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20336(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0305.NIL;
        var4 = Hashtables.gethash_without_values(var2, module0144.$g1879$.getDynamicValue(var3), (SubLObject)module0305.UNPROVIDED);
        return var4;
    }
    
    public static SubLObject f20338(final SubLObject var36, final SubLObject var29) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var36, module0144.$g1879$.getDynamicValue(var37), var29);
        return var29;
    }
    
    public static SubLObject f20410(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0305.NIL;
        var38 = Hashtables.gethash_without_values(var36, module0144.$g1881$.getDynamicValue(var37), (SubLObject)module0305.UNPROVIDED);
        return var38;
    }
    
    public static SubLObject f20411(final SubLObject var36, final SubLObject var29) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var36, module0144.$g1881$.getDynamicValue(var37), var29);
        return var29;
    }
    
    public static SubLObject f20412(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0305.NIL;
        var38 = Hashtables.gethash_without_values(var36, module0144.$g1882$.getDynamicValue(var37), (SubLObject)module0305.UNPROVIDED);
        return var38;
    }
    
    public static SubLObject f20381(final SubLObject var36, final SubLObject var29) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var36, module0144.$g1882$.getDynamicValue(var37), var29);
        return var29;
    }
    
    public static SubLObject f20380(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0305.NIL;
        var4 = Hashtables.gethash_without_values(var2, module0144.$g1880$.getDynamicValue(var3), (SubLObject)module0305.UNPROVIDED);
        return var4;
    }
    
    public static SubLObject f20413(final SubLObject var36, final SubLObject var29) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var36, module0144.$g1880$.getDynamicValue(var37), var29);
        return var29;
    }
    
    public static SubLObject f20414(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1796$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1795$.currentBinding(var22);
        final SubLObject var26 = module0152.$g2116$.currentBinding(var22);
        final SubLObject var27 = module0152.$g2115$.currentBinding(var22);
        try {
            module0144.$g1796$.bind((SubLObject)module0305.NIL, var22);
            module0144.$g1795$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2116$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2115$.bind((SubLObject)module0305.NIL, var22);
            var23 = f20337(var2, var20, var21);
        }
        finally {
            module0152.$g2115$.rebind(var27, var22);
            module0152.$g2116$.rebind(var26, var22);
            module0144.$g1795$.rebind(var25, var22);
            module0144.$g1796$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20415(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1796$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1795$.currentBinding(var22);
        final SubLObject var26 = module0152.$g2116$.currentBinding(var22);
        final SubLObject var27 = module0152.$g2115$.currentBinding(var22);
        final SubLObject var28 = module0144.$g1858$.currentBinding(var22);
        try {
            module0144.$g1796$.bind((SubLObject)module0305.NIL, var22);
            module0144.$g1795$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2116$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2115$.bind((SubLObject)module0305.NIL, var22);
            module0144.$g1858$.bind((SubLObject)module0305.NIL, var22);
            var23 = f20337(var2, var20, var21);
        }
        finally {
            module0144.$g1858$.rebind(var28, var22);
            module0152.$g2115$.rebind(var27, var22);
            module0152.$g2116$.rebind(var26, var22);
            module0144.$g1795$.rebind(var25, var22);
            module0144.$g1796$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20416(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1796$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1795$.currentBinding(var22);
        final SubLObject var26 = module0152.$g2116$.currentBinding(var22);
        final SubLObject var27 = module0152.$g2115$.currentBinding(var22);
        final SubLObject var28 = module0144.$g1858$.currentBinding(var22);
        try {
            module0144.$g1796$.bind((SubLObject)module0305.NIL, var22);
            module0144.$g1795$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2116$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2115$.bind((SubLObject)module0305.NIL, var22);
            module0144.$g1858$.bind((SubLObject)module0305.NIL, var22);
            var23 = f20340(var2, var20, var21);
        }
        finally {
            module0144.$g1858$.rebind(var28, var22);
            module0152.$g2115$.rebind(var27, var22);
            module0152.$g2116$.rebind(var26, var22);
            module0144.$g1795$.rebind(var25, var22);
            module0144.$g1796$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20368(final SubLObject var36, final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0305.NIL;
        final SubLObject var39 = module0144.$g1796$.currentBinding(var37);
        final SubLObject var40 = module0144.$g1795$.currentBinding(var37);
        final SubLObject var41 = module0152.$g2116$.currentBinding(var37);
        final SubLObject var42 = module0152.$g2115$.currentBinding(var37);
        try {
            module0144.$g1796$.bind((SubLObject)module0305.NIL, var37);
            module0144.$g1795$.bind((SubLObject)module0305.NIL, var37);
            module0152.$g2116$.bind((SubLObject)module0305.NIL, var37);
            module0152.$g2115$.bind((SubLObject)module0305.NIL, var37);
            var38 = f20360(var36, var20, var2, var21);
        }
        finally {
            module0152.$g2115$.rebind(var42, var37);
            module0152.$g2116$.rebind(var41, var37);
            module0144.$g1795$.rebind(var40, var37);
            module0144.$g1796$.rebind(var39, var37);
        }
        return var38;
    }
    
    public static SubLObject f20360(final SubLObject var36, final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = f20417(var36);
        if (var38.eql((SubLObject)module0305.$ic1$)) {
            return (SubLObject)module0305.T;
        }
        if (var38.eql((SubLObject)module0305.$ic2$)) {
            return (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != f20409(var36, var20)) {
            f20408((SubLObject)module0305.THREE_INTEGER, (SubLObject)module0305.$ic79$, var36, var20, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
            return (SubLObject)module0305.NIL;
        }
        SubLObject var39 = (SubLObject)module0305.NIL;
        final SubLObject var40 = module0144.$g1883$.currentBinding(var37);
        try {
            module0144.$g1883$.bind((module0305.NIL != module0107.f7628(module0144.$g1883$.getDynamicValue(var37))) ? f20405() : module0144.$g1883$.getDynamicValue(var37), var37);
            try {
                f20406(var36, var20);
                final SubLObject var41 = var21;
                final SubLObject var23_244 = module0147.$g2094$.currentBinding(var37);
                final SubLObject var42 = module0147.$g2095$.currentBinding(var37);
                try {
                    module0147.$g2094$.bind(module0147.f9531(var41), var37);
                    module0147.$g2095$.bind(module0147.f9534(var41), var37);
                    var39 = f20418(var36, var20, var2);
                }
                finally {
                    module0147.$g2095$.rebind(var42, var37);
                    module0147.$g2094$.rebind(var23_244, var37);
                }
            }
            finally {
                final SubLObject var23_245 = Threads.$is_thread_performing_cleanupP$.currentBinding(var37);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var37);
                    f20407(var36, var20);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_245, var37);
                }
            }
        }
        finally {
            module0144.$g1883$.rebind(var40, var37);
        }
        if (module0305.NIL == f20419(var36)) {
            if (module0305.NIL != var39) {
                f20411(var36, (SubLObject)module0305.$ic1$);
            }
            else {
                f20411(var36, (SubLObject)module0305.$ic2$);
            }
        }
        return var39;
    }
    
    public static SubLObject f20419(final SubLObject var246) {
        final SubLThread var247 = SubLProcess.currentSubLThread();
        return module0004.f104(var246, module0144.$g1862$.getDynamicValue(var247), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
    }
    
    public static SubLObject f20417(final SubLObject var36) {
        if (module0305.NIL != f20359(var36, (SubLObject)module0305.UNPROVIDED) && module0305.NIL == f20419(var36)) {
            return f20410(var36);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20420() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2741$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2741$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2741$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2741$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2741$.getDynamicValue(var1), (SubLObject)module0305.$ic81$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2741$.getDynamicValue(var1), (SubLObject)module0305.$ic82$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20421(final SubLObject var36, final SubLObject var20, final SubLObject var2) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0305.NIL;
        final SubLObject var39 = module0139.$g1659$.currentBinding(var37);
        try {
            module0139.$g1659$.bind(module0139.f9007(), var37);
            var38 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != f20371(var20, var2, (SubLObject)module0305.UNPROVIDED) || module0305.NIL != f20422(var36, var20));
            module0139.f9011(module0139.$g1659$.getDynamicValue(var37));
        }
        finally {
            module0139.$g1659$.rebind(var39, var37);
        }
        if (var2.eql(module0144.$g1869$.getDynamicValue(var37))) {
            f20324((SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.$ic84$, var20, var36, var2, (SubLObject)((module0305.NIL != var38) ? module0305.$ic1$ : module0305.$ic2$), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        }
        else {
            f20324((SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.$ic85$, var20, var36, var2, module0144.$g1869$.getDynamicValue(var37), (SubLObject)((module0305.NIL != var38) ? module0305.$ic1$ : module0305.$ic2$), (SubLObject)module0305.UNPROVIDED);
        }
        return var38;
    }
    
    public static SubLObject f20418(final SubLObject var36, final SubLObject var20, final SubLObject var2) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var37)) {
            SubLObject var38 = (SubLObject)module0305.NIL;
            SubLObject var39 = (SubLObject)module0305.NIL;
            final SubLObject var40 = Time.get_internal_real_time();
            var38 = f20421(var36, var20, var2);
            var39 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var40), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2741$.getDynamicValue(var37), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2741$.getDynamicValue(var37), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2741$.getDynamicValue(var37), (SubLObject)ConsesLow.cons(var39, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2741$.getDynamicValue(var37), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2741$.getDynamicValue(var37), (SubLObject)ConsesLow.cons(var38, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2741$.getDynamicValue(var37), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2741$.getDynamicValue(var37), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var36, var20, var2), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2741$.getDynamicValue(var37), (SubLObject)module0305.UNPROVIDED)));
            return var38;
        }
        return f20421(var36, var20, var2);
    }
    
    public static SubLObject f20423(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1796$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1795$.currentBinding(var22);
        final SubLObject var26 = module0152.$g2116$.currentBinding(var22);
        final SubLObject var27 = module0152.$g2115$.currentBinding(var22);
        try {
            module0144.$g1796$.bind((SubLObject)module0305.NIL, var22);
            module0144.$g1795$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2116$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2115$.bind((SubLObject)module0305.NIL, var22);
            var23 = f20349(var2, var20, var21);
        }
        finally {
            module0152.$g2115$.rebind(var27, var22);
            module0152.$g2116$.rebind(var26, var22);
            module0144.$g1795$.rebind(var25, var22);
            module0144.$g1796$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20424(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1796$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1795$.currentBinding(var22);
        final SubLObject var26 = module0152.$g2116$.currentBinding(var22);
        final SubLObject var27 = module0152.$g2115$.currentBinding(var22);
        final SubLObject var28 = module0144.$g1858$.currentBinding(var22);
        try {
            module0144.$g1796$.bind((SubLObject)module0305.NIL, var22);
            module0144.$g1795$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2116$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2115$.bind((SubLObject)module0305.NIL, var22);
            module0144.$g1858$.bind((SubLObject)module0305.NIL, var22);
            var23 = f20349(var2, var20, var21);
        }
        finally {
            module0144.$g1858$.rebind(var28, var22);
            module0152.$g2115$.rebind(var27, var22);
            module0152.$g2116$.rebind(var26, var22);
            module0144.$g1795$.rebind(var25, var22);
            module0144.$g1796$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20425(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1796$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1795$.currentBinding(var22);
        final SubLObject var26 = module0152.$g2116$.currentBinding(var22);
        final SubLObject var27 = module0152.$g2115$.currentBinding(var22);
        try {
            module0144.$g1796$.bind((SubLObject)module0305.NIL, var22);
            module0144.$g1795$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2116$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2115$.bind((SubLObject)module0305.NIL, var22);
            var23 = f20354(var2, var20, var21);
        }
        finally {
            module0152.$g2115$.rebind(var27, var22);
            module0152.$g2116$.rebind(var26, var22);
            module0144.$g1795$.rebind(var25, var22);
            module0144.$g1796$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20426(final SubLObject var36, final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0305.NIL;
        final SubLObject var39 = module0144.$g1796$.currentBinding(var37);
        final SubLObject var40 = module0144.$g1795$.currentBinding(var37);
        final SubLObject var41 = module0152.$g2116$.currentBinding(var37);
        final SubLObject var42 = module0152.$g2115$.currentBinding(var37);
        try {
            module0144.$g1796$.bind((SubLObject)module0305.NIL, var37);
            module0144.$g1795$.bind((SubLObject)module0305.NIL, var37);
            module0152.$g2116$.bind((SubLObject)module0305.NIL, var37);
            module0152.$g2115$.bind((SubLObject)module0305.NIL, var37);
            var38 = f20365(var36, var20, var2, var21);
        }
        finally {
            module0152.$g2115$.rebind(var42, var37);
            module0152.$g2116$.rebind(var41, var37);
            module0144.$g1795$.rebind(var40, var37);
            module0144.$g1796$.rebind(var39, var37);
        }
        return var38;
    }
    
    public static SubLObject f20365(final SubLObject var36, final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = f20427(var36);
        if (var38.eql((SubLObject)module0305.$ic1$)) {
            return (SubLObject)module0305.T;
        }
        if (var38.eql((SubLObject)module0305.$ic2$)) {
            return (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != f20409(var36, var20)) {
            f20408((SubLObject)module0305.THREE_INTEGER, (SubLObject)module0305.$ic86$, var36, var20, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
            return (SubLObject)module0305.NIL;
        }
        SubLObject var39 = (SubLObject)module0305.NIL;
        final SubLObject var40 = module0144.$g1883$.currentBinding(var37);
        try {
            module0144.$g1883$.bind((module0305.NIL != module0107.f7628(module0144.$g1883$.getDynamicValue(var37))) ? f20405() : module0144.$g1883$.getDynamicValue(var37), var37);
            try {
                f20406(var36, var20);
                final SubLObject var41 = var21;
                final SubLObject var23_247 = module0147.$g2094$.currentBinding(var37);
                final SubLObject var42 = module0147.$g2095$.currentBinding(var37);
                try {
                    module0147.$g2094$.bind(module0147.f9531(var41), var37);
                    module0147.$g2095$.bind(module0147.f9534(var41), var37);
                    var39 = f20428(var36, var20, var2);
                }
                finally {
                    module0147.$g2095$.rebind(var42, var37);
                    module0147.$g2094$.rebind(var23_247, var37);
                }
            }
            finally {
                final SubLObject var23_248 = Threads.$is_thread_performing_cleanupP$.currentBinding(var37);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var37);
                    f20407(var36, var20);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_248, var37);
                }
            }
        }
        finally {
            module0144.$g1883$.rebind(var40, var37);
        }
        if (module0305.NIL == f20419(var36)) {
            if (module0305.NIL != var39) {
                Hashtables.sethash(var36, module0144.$g1882$.getDynamicValue(var37), (SubLObject)module0305.$ic1$);
            }
            else {
                Hashtables.sethash(var36, module0144.$g1882$.getDynamicValue(var37), (SubLObject)module0305.$ic2$);
            }
        }
        return var39;
    }
    
    public static SubLObject f20427(final SubLObject var36) {
        if (module0305.NIL != f20359(var36, (SubLObject)module0305.UNPROVIDED) && module0305.NIL == f20419(var36)) {
            return f20412(var36);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20429() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2742$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2742$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2742$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2742$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2742$.getDynamicValue(var1), (SubLObject)module0305.$ic81$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2742$.getDynamicValue(var1), (SubLObject)module0305.$ic88$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20430(final SubLObject var36, final SubLObject var20, final SubLObject var2) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0305.NIL;
        final SubLObject var39 = module0139.$g1659$.currentBinding(var37);
        try {
            module0139.$g1659$.bind(module0139.f9007(), var37);
            var38 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != f20400(var20, var2, (SubLObject)module0305.UNPROVIDED) || module0305.NIL != f20422(var36, var20));
            module0139.f9011(module0139.$g1659$.getDynamicValue(var37));
        }
        finally {
            module0139.$g1659$.rebind(var39, var37);
        }
        if (var2.eql(module0144.$g1869$.getDynamicValue(var37))) {
            f20324((SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.$ic84$, var20, var36, var2, (SubLObject)((module0305.NIL != var38) ? module0305.$ic1$ : module0305.$ic2$), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        }
        else {
            f20324((SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.$ic85$, var20, var36, var2, module0144.$g1869$.getDynamicValue(var37), (SubLObject)((module0305.NIL != var38) ? module0305.$ic1$ : module0305.$ic2$), (SubLObject)module0305.UNPROVIDED);
        }
        return var38;
    }
    
    public static SubLObject f20428(final SubLObject var36, final SubLObject var20, final SubLObject var2) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var37)) {
            SubLObject var38 = (SubLObject)module0305.NIL;
            SubLObject var39 = (SubLObject)module0305.NIL;
            final SubLObject var40 = Time.get_internal_real_time();
            var38 = f20430(var36, var20, var2);
            var39 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var40), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2742$.getDynamicValue(var37), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2742$.getDynamicValue(var37), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2742$.getDynamicValue(var37), (SubLObject)ConsesLow.cons(var39, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2742$.getDynamicValue(var37), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2742$.getDynamicValue(var37), (SubLObject)ConsesLow.cons(var38, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2742$.getDynamicValue(var37), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2742$.getDynamicValue(var37), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var36, var20, var2), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2742$.getDynamicValue(var37), (SubLObject)module0305.UNPROVIDED)));
            return var38;
        }
        return f20430(var36, var20, var2);
    }
    
    public static SubLObject f20431() {
        final SubLObject var249 = module0305.$g2743$.getGlobalValue();
        if (module0305.NIL != var249) {
            module0034.f1818(var249);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20432(final SubLObject var20) {
        return module0034.f1829(module0305.$g2743$.getGlobalValue(), (SubLObject)ConsesLow.list(var20), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
    }
    
    public static SubLObject f20433(final SubLObject var20) {
        return module0229.f15243(var20);
    }
    
    public static SubLObject f20434(final SubLObject var20) {
        SubLObject var21 = module0305.$g2743$.getGlobalValue();
        if (module0305.NIL == var21) {
            var21 = module0034.f1934((SubLObject)module0305.$ic90$, (SubLObject)module0305.$ic91$, (SubLObject)module0305.NIL, (SubLObject)module0305.EQUAL, (SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic92$);
        }
        SubLObject var22 = module0034.f1814(var21, var20, (SubLObject)module0305.$ic93$);
        if (var22 == module0305.$ic93$) {
            var22 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f20433(var20)));
            module0034.f1816(var21, var20, var22, (SubLObject)module0305.UNPROVIDED);
        }
        return module0034.f1959(var22);
    }
    
    public static SubLObject f20435(final SubLObject var36, SubLObject var252) {
        if (var252 == module0305.UNPROVIDED) {
            var252 = (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != var36) {
            final SubLObject var253 = Types.symbolp(var36);
            if (module0305.NIL == var253) {
                if (module0305.NIL != var252) {
                    f20408((SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.$ic94$, var252, var36, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                }
                else {
                    f20408((SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.$ic95$, var252, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                }
            }
            return var253;
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20359(final SubLObject var36, SubLObject var252) {
        if (var252 == module0305.UNPROVIDED) {
            var252 = (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != f20435(var36, (SubLObject)module0305.UNPROVIDED)) {
            final SubLObject var253 = module0112.f7693(var36);
            if (module0305.NIL == var253) {
                if (module0305.NIL != var252) {
                    f20408((SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.$ic96$, var252, var36, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                }
                else {
                    f20408((SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.$ic97$, var252, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                }
            }
            return var253;
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20422(final SubLObject var36, final SubLObject var20) {
        return module0112.f7695(var36, var20);
    }
    
    public static SubLObject f20374(final SubLObject var20, SubLObject var255) {
        if (var255 == module0305.UNPROVIDED) {
            var255 = Symbols.symbol_function((SubLObject)module0305.$ic98$);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != module0173.f10955(var20) || module0305.NIL != module0210.f13595(var20, var255));
    }
    
    public static SubLObject f20348() {
        f20431();
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20436(final SubLObject var256) {
        SubLObject var257 = f20316();
        SubLObject var258 = (SubLObject)module0305.NIL;
        var258 = var257.first();
        while (module0305.NIL != var257) {
            SubLObject var260;
            final SubLObject var259 = var260 = var258;
            SubLObject var261 = (SubLObject)module0305.NIL;
            SubLObject var262 = (SubLObject)module0305.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var260, var259, (SubLObject)module0305.$ic99$);
            var261 = var260.first();
            var260 = (var262 = var260.rest());
            Functions.funcall(var256, var261, var262);
            var257 = var257.rest();
            var258 = var257.first();
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20437(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0210.f13593(var2, (SubLObject)module0305.UNPROVIDED)) {
            return f20437(var20, module0205.f13330(var2), var21);
        }
        if (module0305.NIL != module0173.f10955(var2)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            final SubLObject var24 = module0144.$g1870$.currentBinding(var22);
            try {
                module0144.$g1870$.bind((SubLObject)module0305.NIL, var22);
                var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != module0259.f16854(var20, var2, var21, (SubLObject)module0305.UNPROVIDED) || module0305.NIL != f20337(var2, var20, var21));
            }
            finally {
                module0144.$g1870$.rebind(var24, var22);
            }
            return var23;
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20438(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0210.f13593(var2, (SubLObject)module0305.UNPROVIDED)) {
            return f20438(var20, module0205.f13330(var2), var21);
        }
        if (module0305.NIL != module0173.f10955(var2)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            final SubLObject var24 = module0144.$g1870$.currentBinding(var22);
            try {
                module0144.$g1870$.bind((SubLObject)module0305.NIL, var22);
                var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != module0259.f16854(var20, var2, var21, (SubLObject)module0305.UNPROVIDED) || module0305.NIL != f20414(var2, var20, var21));
            }
            finally {
                module0144.$g1870$.rebind(var24, var22);
            }
            return var23;
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20439(final SubLObject var20, final SubLObject var260, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var261 = SubLProcess.currentSubLThread();
        SubLObject var262 = (SubLObject)module0305.NIL;
        final SubLObject var263 = module0144.$g1870$.currentBinding(var261);
        try {
            module0144.$g1870$.bind((SubLObject)module0305.NIL, var261);
            var262 = module0259.f16902(var20, var260, var21, (SubLObject)module0305.UNPROVIDED);
            if (module0305.NIL == var262) {
                SubLObject var264;
                SubLObject var265;
                for (var264 = var260, var265 = (SubLObject)module0305.NIL, var265 = var264.first(); module0305.NIL == var262 && module0305.NIL != var264; var262 = f20414(var265, var20, var21), var264 = var264.rest(), var265 = var264.first()) {}
            }
        }
        finally {
            module0144.$g1870$.rebind(var263, var261);
        }
        return var262;
    }
    
    public static SubLObject f20440(final SubLObject var20, final SubLObject var2, SubLObject var21, SubLObject var261) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        if (var261 == module0305.UNPROVIDED) {
            var261 = module0147.f9552((SubLObject)module0305.UNPROVIDED);
        }
        return f20438(var20, var2, var21);
    }
    
    public static SubLObject f20441(final SubLObject var20, final SubLObject var2, SubLObject var21, SubLObject var261) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        if (var261 == module0305.UNPROVIDED) {
            var261 = module0147.f9552((SubLObject)module0305.UNPROVIDED);
        }
        final SubLThread var262 = SubLProcess.currentSubLThread();
        final SubLObject var263 = module0034.$g879$.getDynamicValue(var262);
        SubLObject var264 = (SubLObject)module0305.NIL;
        if (module0305.NIL == var263) {
            return f20440(var20, var2, var21, var261);
        }
        var264 = module0034.f1857(var263, (SubLObject)module0305.$ic100$, (SubLObject)module0305.UNPROVIDED);
        if (module0305.NIL == var264) {
            var264 = module0034.f1807(module0034.f1842(var263), (SubLObject)module0305.$ic100$, (SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.NIL, (SubLObject)module0305.EQUAL, (SubLObject)module0305.UNPROVIDED);
            module0034.f1860(var263, (SubLObject)module0305.$ic100$, var264);
        }
        final SubLObject var265 = module0034.f1780(var20, var2, var21, var261);
        final SubLObject var266 = module0034.f1814(var264, var265, (SubLObject)module0305.UNPROVIDED);
        if (var266 != module0305.$ic93$) {
            SubLObject var267 = var266;
            SubLObject var268 = (SubLObject)module0305.NIL;
            var268 = var267.first();
            while (module0305.NIL != var267) {
                SubLObject var269 = var268.first();
                final SubLObject var270 = conses_high.second(var268);
                if (var20.equal(var269.first())) {
                    var269 = var269.rest();
                    if (var2.equal(var269.first())) {
                        var269 = var269.rest();
                        if (var21.equal(var269.first())) {
                            var269 = var269.rest();
                            if (module0305.NIL != var269 && module0305.NIL == var269.rest() && var261.equal(var269.first())) {
                                return module0034.f1959(var270);
                            }
                        }
                    }
                }
                var267 = var267.rest();
                var268 = var267.first();
            }
        }
        final SubLObject var271 = Values.arg2(var262.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f20440(var20, var2, var21, var261)));
        module0034.f1836(var264, var265, var266, var271, (SubLObject)ConsesLow.list(var20, var2, var21, var261));
        return module0034.f1959(var271);
    }
    
    public static SubLObject f20442(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != module0210.f13593(var2, (SubLObject)module0305.UNPROVIDED)) {
            return f20442(var20, module0205.f13330(var2), var21);
        }
        if (module0305.NIL != module0173.f10955(var2) && module0305.NIL != module0226.f14858(var2, var21)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == f20438(var20, var2, var21));
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20443(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0210.f13593(var2, (SubLObject)module0305.UNPROVIDED)) {
            return f20443(var20, module0205.f13330(var2), var21);
        }
        if (module0305.NIL != module0173.f10955(var2)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            final SubLObject var24 = module0144.$g1870$.currentBinding(var22);
            try {
                module0144.$g1870$.bind((SubLObject)module0305.NIL, var22);
                var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != f20340(var2, var20, var21) || module0305.NIL != module0259.f16867(var20, var2, var21, (SubLObject)module0305.UNPROVIDED));
            }
            finally {
                module0144.$g1870$.rebind(var24, var22);
            }
            return var23;
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20444(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0210.f13593(var2, (SubLObject)module0305.UNPROVIDED)) {
            return f20443(var20, module0205.f13330(var2), var21);
        }
        if (module0305.NIL != module0173.f10955(var2)) {
            SubLObject var23 = (SubLObject)module0305.NIL;
            final SubLObject var24 = module0144.$g1870$.currentBinding(var22);
            try {
                module0144.$g1870$.bind((SubLObject)module0305.NIL, var22);
                var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != f20416(var2, var20, var21) || module0305.NIL != module0259.f16867(var20, var2, var21, (SubLObject)module0305.UNPROVIDED));
            }
            finally {
                module0144.$g1870$.rebind(var24, var22);
            }
            return var23;
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20445(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = module0305.$ic101$;
        }
        if (module0305.NIL != module0173.f10955(var2)) {
            return f20446(var20, var2, var21);
        }
        if (module0305.NIL != module0202.f12659(var2)) {
            return f20447(var20, var2, var21);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20446(final SubLObject var20, final SubLObject var2, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0147.f9540(var21);
        final SubLObject var25 = module0147.$g2095$.currentBinding(var22);
        final SubLObject var26 = module0147.$g2094$.currentBinding(var22);
        final SubLObject var27 = module0147.$g2096$.currentBinding(var22);
        try {
            module0147.$g2095$.bind(module0147.f9545(var24), var22);
            module0147.$g2094$.bind(module0147.f9546(var24), var22);
            module0147.$g2096$.bind(module0147.f9549(var24), var22);
            if (module0305.NIL != module0173.f10955(var20) && module0305.NIL != module0259.f16854(var20, var2, var21, (SubLObject)module0305.UNPROVIDED)) {
                var23 = (SubLObject)module0305.T;
            }
            else if (module0305.NIL != module0202.f12656(var20) && module0305.NIL != module0259.f16854(var20.first(), module0305.$ic102$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED) && module0305.NIL != module0259.f16892(var20, var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
                var23 = (SubLObject)module0305.T;
            }
            else {
                final SubLObject var23_271 = module0144.$g1858$.currentBinding(var22);
                try {
                    module0144.$g1858$.bind((SubLObject)module0305.NIL, var22);
                    var23 = f20414(var2, var20, (SubLObject)module0305.UNPROVIDED);
                }
                finally {
                    module0144.$g1858$.rebind(var23_271, var22);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var27, var22);
            module0147.$g2094$.rebind(var26, var22);
            module0147.$g2095$.rebind(var25, var22);
        }
        return var23;
    }
    
    public static SubLObject f20447(final SubLObject var20, final SubLObject var2, final SubLObject var21) {
        if (module0305.NIL != module0205.f13374(var2, module0305.$ic103$) && module0305.NIL != module0210.f13565(var20) && module0305.NIL != module0256.f16576(var20, module0205.f13277(var2, (SubLObject)module0305.UNPROVIDED), var21, (SubLObject)module0305.UNPROVIDED)) {
            return (SubLObject)module0305.T;
        }
        if (module0305.NIL != module0205.f13299(var2)) {
            return f20448(var20, var2, var21);
        }
        if (module0305.NIL != module0205.f13298(var2)) {
            return f20449(var20, var2, var21);
        }
        if (module0305.NIL != module0210.f13593(var2, (SubLObject)module0305.UNPROVIDED)) {
            final SubLObject var22 = module0205.f13330(var2);
            return (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != module0167.f10813(var22) && module0305.NIL != f20445(var20, var22, var21));
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20448(final SubLObject var20, final SubLObject var273, final SubLObject var21) {
        SubLObject var274 = module0205.f13305(var273);
        SubLObject var275 = (SubLObject)module0305.NIL;
        var275 = var274.first();
        while (module0305.NIL != var274) {
            if (module0305.NIL != f20445(var20, var275, var21)) {
                return (SubLObject)module0305.T;
            }
            var274 = var274.rest();
            var275 = var274.first();
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20449(final SubLObject var20, final SubLObject var275, final SubLObject var21) {
        SubLObject var276 = module0205.f13303(var275);
        SubLObject var277 = (SubLObject)module0305.NIL;
        var277 = var276.first();
        while (module0305.NIL != var276) {
            if (module0305.NIL == f20445(var20, var277, var21)) {
                return (SubLObject)module0305.NIL;
            }
            var276 = var276.rest();
            var277 = var276.first();
        }
        return (SubLObject)module0305.T;
    }
    
    public static SubLObject f20450(final SubLObject var20, final SubLObject var2) {
        if (var2.eql(module0305.$ic104$)) {
            return (SubLObject)module0305.$ic105$;
        }
        return module0262.f17367(f20451(var20, var2), (SubLObject)module0305.UNPROVIDED);
    }
    
    public static SubLObject f20451(final SubLObject var20, final SubLObject var2) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var21)) {
            return module0306.f20675(var20, var2);
        }
        return f20452(var20, var2);
    }
    
    public static SubLObject f20452(final SubLObject var20, final SubLObject var2) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0305.NIL;
        final SubLObject var23 = module0144.$g1881$.currentBinding(var21);
        final SubLObject var24 = module0144.$g1882$.currentBinding(var21);
        final SubLObject var25 = module0144.$g1879$.currentBinding(var21);
        final SubLObject var26 = module0144.$g1880$.currentBinding(var21);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var21);
            module0144.$g1882$.bind(module0149.f9627(), var21);
            module0144.$g1879$.bind(module0149.f9628(), var21);
            module0144.$g1880$.bind(module0149.f9629(), var21);
            try {
                final SubLObject var23_278 = module0144.$g1870$.currentBinding(var21);
                try {
                    module0144.$g1870$.bind((SubLObject)module0305.NIL, var21);
                    SubLObject var27 = f20345(var2);
                    SubLObject var28 = (SubLObject)module0305.NIL;
                    var28 = var27.first();
                    while (module0305.NIL != var27) {
                        final SubLObject var23_279 = module0144.$g1869$.currentBinding(var21);
                        try {
                            module0144.$g1869$.bind(module0178.f11334(var28), var21);
                            final SubLObject var29 = module0202.f12757(module0178.f11335(var28));
                            final SubLObject var30 = module0178.f11287(var28);
                            if (module0305.NIL != f20359(var29, module0144.$g1869$.getDynamicValue(var21))) {
                                final SubLObject var23_280 = module0147.$g2094$.currentBinding(var21);
                                final SubLObject var24_281 = module0147.$g2095$.currentBinding(var21);
                                try {
                                    module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var21);
                                    module0147.$g2095$.bind(module0305.$ic107$, var21);
                                    if (module0305.NIL != f20368(var29, var20, var2, (SubLObject)module0305.UNPROVIDED) && (module0305.NIL == module0144.$g1858$.getDynamicValue(var21) || module0305.NIL != f20346(var2, var20, (SubLObject)module0305.UNPROVIDED))) {
                                        SubLObject var9_282 = module0256.f16652(module0144.$g1869$.getDynamicValue(var21), var2, (SubLObject)module0305.UNPROVIDED);
                                        SubLObject var31 = (SubLObject)module0305.NIL;
                                        var31 = var9_282.first();
                                        while (module0305.NIL != var9_282) {
                                            var22 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var30, var31), var22);
                                            var9_282 = var9_282.rest();
                                            var31 = var9_282.first();
                                        }
                                    }
                                }
                                finally {
                                    module0147.$g2095$.rebind(var24_281, var21);
                                    module0147.$g2094$.rebind(var23_280, var21);
                                }
                            }
                        }
                        finally {
                            module0144.$g1869$.rebind(var23_279, var21);
                        }
                        var27 = var27.rest();
                        var28 = var27.first();
                    }
                }
                finally {
                    module0144.$g1870$.rebind(var23_278, var21);
                }
            }
            finally {
                final SubLObject var23_281 = Threads.$is_thread_performing_cleanupP$.currentBinding(var21);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var21);
                    f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_281, var21);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var26, var21);
            module0144.$g1879$.rebind(var25, var21);
            module0144.$g1882$.rebind(var24, var21);
            module0144.$g1881$.rebind(var23, var21);
        }
        return module0262.f17379(var22);
    }
    
    public static SubLObject f20453(final SubLObject var20, final SubLObject var2) {
        return module0262.f17367(f20454(var20, var2), (SubLObject)module0305.UNPROVIDED);
    }
    
    public static SubLObject f20454(final SubLObject var20, final SubLObject var2) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var21)) {
            return module0306.f20678(var20, var2);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20455(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        return f20337(var2, var20, var21);
    }
    
    public static SubLObject f20456(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var22)) {
            return module0306.f20679(var20, var2, var21);
        }
        return f20457(var20, var2, var21);
    }
    
    public static SubLObject f20457(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1881$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1882$.currentBinding(var22);
        final SubLObject var26 = module0144.$g1879$.currentBinding(var22);
        final SubLObject var27 = module0144.$g1880$.currentBinding(var22);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var22);
            module0144.$g1882$.bind(module0149.f9627(), var22);
            module0144.$g1879$.bind(module0149.f9628(), var22);
            module0144.$g1880$.bind(module0149.f9629(), var22);
            try {
                final SubLObject var28 = var21;
                final SubLObject var23_286 = module0147.$g2094$.currentBinding(var22);
                final SubLObject var24_287 = module0147.$g2095$.currentBinding(var22);
                try {
                    module0147.$g2094$.bind(module0147.f9531(var28), var22);
                    module0147.$g2095$.bind(module0147.f9534(var28), var22);
                    if (module0305.NIL == var23) {
                        SubLObject var29 = f20345(var2);
                        SubLObject var30 = (SubLObject)module0305.NIL;
                        var30 = var29.first();
                        while (module0305.NIL == var23 && module0305.NIL != var29) {
                            if (module0305.NIL != module0178.f11361(var30, (SubLObject)module0305.UNPROVIDED)) {
                                final SubLObject var23_287 = module0144.$g1869$.currentBinding(var22);
                                try {
                                    module0144.$g1869$.bind(module0178.f11334(var30), var22);
                                    final SubLObject var31 = module0178.f11287(var30);
                                    if (module0305.NIL != module0147.f9507(var31)) {
                                        final SubLObject var32 = module0202.f12757(module0178.f11335(var30));
                                        if (module0305.NIL != f20359(var32, module0144.$g1869$.getDynamicValue(var22))) {
                                            if (module0305.NIL != module0259.f16854(var20, module0144.$g1869$.getDynamicValue(var22), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
                                                var23 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0305.$ic108$, (SubLObject)ConsesLow.list(module0305.$ic109$, var20, var2), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED), var23);
                                            }
                                            else if (module0305.NIL != f20368(var32, var20, var2, var21)) {
                                                if (!var2.eql(module0144.$g1869$.getDynamicValue(var22))) {
                                                    var23 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0305.$ic110$, (SubLObject)ConsesLow.list(module0305.$ic45$, module0144.$g1869$.getDynamicValue(var22), var2), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED), var23);
                                                }
                                                var23 = (SubLObject)ConsesLow.cons(var30, var23);
                                            }
                                        }
                                    }
                                }
                                finally {
                                    module0144.$g1869$.rebind(var23_287, var22);
                                }
                            }
                            var29 = var29.rest();
                            var30 = var29.first();
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var24_287, var22);
                    module0147.$g2094$.rebind(var23_286, var22);
                }
            }
            finally {
                final SubLObject var23_288 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                    f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_288, var22);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var27, var22);
            module0144.$g1879$.rebind(var26, var22);
            module0144.$g1882$.rebind(var25, var22);
            module0144.$g1881$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20458(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != f20340(var2, var20, var21) || module0305.NIL != f20459(var2, var20, var21));
    }
    
    public static SubLObject f20460(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        SubLObject var22 = f20378(var2, var20, var21);
        if (module0305.NIL == var22) {
            var22 = f20461(var2, var20, var21);
        }
        return var22;
    }
    
    public static SubLObject f20462(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1881$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1882$.currentBinding(var22);
        final SubLObject var26 = module0144.$g1879$.currentBinding(var22);
        final SubLObject var27 = module0144.$g1880$.currentBinding(var22);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var22);
            module0144.$g1882$.bind(module0149.f9627(), var22);
            module0144.$g1879$.bind(module0149.f9628(), var22);
            module0144.$g1880$.bind(module0149.f9629(), var22);
            try {
                final SubLObject var28 = var21;
                final SubLObject var23_290 = module0147.$g2094$.currentBinding(var22);
                final SubLObject var24_291 = module0147.$g2095$.currentBinding(var22);
                try {
                    module0147.$g2094$.bind(module0147.f9531(var28), var22);
                    module0147.$g2095$.bind(module0147.f9534(var28), var22);
                    if (module0305.NIL == var23) {
                        SubLObject var29 = var2;
                        final SubLObject var30 = (SubLObject)module0305.$ic36$;
                        final SubLObject var31 = module0056.f4145(var30);
                        final SubLObject var23_291 = module0139.$g1635$.currentBinding(var22);
                        try {
                            module0139.$g1635$.bind(module0139.f9007(), var22);
                            final SubLObject var62_293 = var21;
                            final SubLObject var23_292 = module0147.$g2095$.currentBinding(var22);
                            final SubLObject var24_292 = module0147.$g2094$.currentBinding(var22);
                            final SubLObject var25_296 = module0147.$g2096$.currentBinding(var22);
                            try {
                                module0147.$g2095$.bind(module0147.f9545(var62_293), var22);
                                module0147.$g2094$.bind(module0147.f9546(var62_293), var22);
                                module0147.$g2096$.bind(module0147.f9549(var62_293), var22);
                                final SubLObject var32 = (SubLObject)module0305.NIL;
                                final SubLObject var23_293 = module0141.$g1714$.currentBinding(var22);
                                final SubLObject var24_293 = module0141.$g1715$.currentBinding(var22);
                                try {
                                    module0141.$g1714$.bind((module0305.NIL != var32) ? var32 : module0141.f9283(), var22);
                                    module0141.$g1715$.bind((SubLObject)((module0305.NIL != var32) ? module0305.$ic37$ : module0141.$g1715$.getDynamicValue(var22)), var22);
                                    if (module0305.NIL != var32 && module0305.NIL != module0136.f8864() && module0305.NIL == module0141.f9279(var32)) {
                                        final SubLObject var33 = module0136.$g1591$.getDynamicValue(var22);
                                        if (var33.eql((SubLObject)module0305.$ic38$)) {
                                            module0136.f8870((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                        }
                                        else if (var33.eql((SubLObject)module0305.$ic41$)) {
                                            module0136.f8871((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                        }
                                        else if (var33.eql((SubLObject)module0305.$ic43$)) {
                                            Errors.warn((SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$);
                                        }
                                        else {
                                            Errors.warn((SubLObject)module0305.$ic44$, module0136.$g1591$.getDynamicValue(var22));
                                            Errors.cerror((SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$);
                                        }
                                    }
                                    final SubLObject var23_294 = module0141.$g1670$.currentBinding(var22);
                                    final SubLObject var24_294 = module0141.$g1671$.currentBinding(var22);
                                    final SubLObject var25_297 = module0141.$g1672$.currentBinding(var22);
                                    final SubLObject var26_302 = module0141.$g1674$.currentBinding(var22);
                                    final SubLObject var34 = module0137.$g1605$.currentBinding(var22);
                                    try {
                                        module0141.$g1670$.bind(module0137.f8955(module0305.$ic45$), var22);
                                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0305.$ic45$)), var22);
                                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0305.$ic45$)), var22);
                                        module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                                        module0137.$g1605$.bind(module0137.f8955(module0305.$ic45$), var22);
                                        if (module0305.NIL != module0136.f8865() || module0305.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0305.UNPROVIDED))) {
                                            final SubLObject var23_295 = module0141.$g1677$.currentBinding(var22);
                                            final SubLObject var24_295 = module0138.$g1619$.currentBinding(var22);
                                            final SubLObject var25_298 = module0141.$g1674$.currentBinding(var22);
                                            try {
                                                module0141.$g1677$.bind(module0141.f9208(), var22);
                                                module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0305.$ic45$)), var22);
                                                module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                                                module0249.f16055(var29, (SubLObject)module0305.UNPROVIDED);
                                                while (module0305.NIL != var29 && module0305.NIL == var23) {
                                                    final SubLObject var35 = var29;
                                                    final SubLObject var23_296 = module0144.$g1869$.currentBinding(var22);
                                                    try {
                                                        module0144.$g1869$.bind(var35, var22);
                                                        if (module0305.NIL == var23) {
                                                            SubLObject var36 = (SubLObject)module0305.$ic46$;
                                                            SubLObject var37 = (SubLObject)module0305.NIL;
                                                            var37 = var36.first();
                                                            while (module0305.NIL == var23 && module0305.NIL != var36) {
                                                                final SubLObject var38 = var37;
                                                                if (module0305.NIL != module0158.f10010(var35, (SubLObject)module0305.ONE_INTEGER, var38)) {
                                                                    final SubLObject var39 = module0158.f10011(var35, (SubLObject)module0305.ONE_INTEGER, var38);
                                                                    SubLObject var40 = (SubLObject)module0305.NIL;
                                                                    final SubLObject var41 = (SubLObject)module0305.NIL;
                                                                    while (module0305.NIL == var40) {
                                                                        final SubLObject var42 = module0052.f3695(var39, var41);
                                                                        final SubLObject var43 = (SubLObject)SubLObjectFactory.makeBoolean(!var41.eql(var42));
                                                                        if (module0305.NIL != var43) {
                                                                            SubLObject var44 = (SubLObject)module0305.NIL;
                                                                            try {
                                                                                var44 = module0158.f10316(var42, (SubLObject)module0305.$ic50$, (SubLObject)module0305.$ic21$, (SubLObject)module0305.NIL);
                                                                                SubLObject var109_307 = (SubLObject)module0305.NIL;
                                                                                final SubLObject var110_308 = (SubLObject)module0305.NIL;
                                                                                while (module0305.NIL == var109_307) {
                                                                                    final SubLObject var45 = module0052.f3695(var44, var110_308);
                                                                                    final SubLObject var112_309 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_308.eql(var45));
                                                                                    if (module0305.NIL != var112_309) {
                                                                                        final SubLObject var46 = module0202.f12757(module0178.f11335(var45));
                                                                                        if (module0305.NIL != f20359(var46, module0144.$g1869$.getDynamicValue(var22)) && module0305.NIL == f20368(var46, var20, var2, var21)) {
                                                                                            if (!var2.eql(module0144.$g1869$.getDynamicValue(var22))) {
                                                                                                var23 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0305.$ic110$, (SubLObject)ConsesLow.list(module0305.$ic45$, var2, module0144.$g1869$.getDynamicValue(var22)), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED), var23);
                                                                                            }
                                                                                            var23 = (SubLObject)ConsesLow.cons(var45, var23);
                                                                                        }
                                                                                    }
                                                                                    var109_307 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var112_309);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                final SubLObject var23_297 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                                                                                try {
                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                                                                                    if (module0305.NIL != var44) {
                                                                                        module0158.f10319(var44);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var23_297, var22);
                                                                                }
                                                                            }
                                                                        }
                                                                        var40 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var43);
                                                                    }
                                                                }
                                                                var36 = var36.rest();
                                                                var37 = var36.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0144.$g1869$.rebind(var23_296, var22);
                                                    }
                                                    final SubLObject var47 = module0200.f12443(module0137.f8955(module0305.$ic45$));
                                                    SubLObject var48;
                                                    SubLObject var49;
                                                    SubLObject var23_298;
                                                    SubLObject var24_296;
                                                    SubLObject var50;
                                                    SubLObject var51;
                                                    SubLObject var52;
                                                    SubLObject var53;
                                                    SubLObject var90_313;
                                                    SubLObject var54;
                                                    SubLObject var23_299;
                                                    SubLObject var89_315;
                                                    SubLObject var55;
                                                    SubLObject var56;
                                                    SubLObject var23_300;
                                                    SubLObject var57;
                                                    SubLObject var58;
                                                    SubLObject var59;
                                                    SubLObject var60;
                                                    SubLObject var61;
                                                    SubLObject var62;
                                                    SubLObject var63;
                                                    SubLObject var64;
                                                    SubLObject var82_317;
                                                    SubLObject var65;
                                                    SubLObject var23_301;
                                                    SubLObject var67;
                                                    SubLObject var66;
                                                    SubLObject var68;
                                                    SubLObject var69;
                                                    SubLObject var70;
                                                    SubLObject var71;
                                                    SubLObject var72;
                                                    SubLObject var73;
                                                    for (var48 = (SubLObject)module0305.NIL, var48 = var47; module0305.NIL == var23 && module0305.NIL != var48; var48 = var48.rest()) {
                                                        var49 = var48.first();
                                                        var23_298 = module0137.$g1605$.currentBinding(var22);
                                                        var24_296 = module0141.$g1674$.currentBinding(var22);
                                                        try {
                                                            module0137.$g1605$.bind(var49, var22);
                                                            module0141.$g1674$.bind((SubLObject)((module0305.NIL != module0141.f9205((SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0305.NIL == module0141.$g1674$.getDynamicValue(var22)) : module0141.$g1674$.getDynamicValue(var22)), var22);
                                                            var50 = module0228.f15229(var29);
                                                            if (module0305.NIL != module0138.f8992(var50)) {
                                                                var51 = module0242.f15664(var50, module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                                if (module0305.NIL != var51) {
                                                                    var52 = module0245.f15834(var51, module0138.f8979(), module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                                    if (module0305.NIL != var52) {
                                                                        for (var53 = module0066.f4838(module0067.f4891(var52)); module0305.NIL == var23 && module0305.NIL == module0066.f4841(var53); var53 = module0066.f4840(var53)) {
                                                                            var22.resetMultipleValues();
                                                                            var90_313 = module0066.f4839(var53);
                                                                            var54 = var22.secondMultipleValue();
                                                                            var22.resetMultipleValues();
                                                                            if (module0305.NIL != module0147.f9507(var90_313)) {
                                                                                var23_299 = module0138.$g1623$.currentBinding(var22);
                                                                                try {
                                                                                    module0138.$g1623$.bind(var90_313, var22);
                                                                                    for (var89_315 = module0066.f4838(module0067.f4891(var54)); module0305.NIL == var23 && module0305.NIL == module0066.f4841(var89_315); var89_315 = module0066.f4840(var89_315)) {
                                                                                        var22.resetMultipleValues();
                                                                                        var55 = module0066.f4839(var89_315);
                                                                                        var56 = var22.secondMultipleValue();
                                                                                        var22.resetMultipleValues();
                                                                                        if (module0305.NIL != module0141.f9289(var55)) {
                                                                                            var23_300 = module0138.$g1624$.currentBinding(var22);
                                                                                            try {
                                                                                                module0138.$g1624$.bind(var55, var22);
                                                                                                var57 = var56;
                                                                                                if (module0305.NIL != module0077.f5302(var57)) {
                                                                                                    var58 = module0077.f5333(var57);
                                                                                                    for (var59 = module0032.f1741(var58), var60 = (SubLObject)module0305.NIL, var60 = module0032.f1742(var59, var58); module0305.NIL == var23 && module0305.NIL == module0032.f1744(var59, var60); var60 = module0032.f1743(var60)) {
                                                                                                        var61 = module0032.f1745(var59, var60);
                                                                                                        if (module0305.NIL != module0032.f1746(var60, var61) && module0305.NIL == module0249.f16059(var61, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                            module0249.f16055(var61, (SubLObject)module0305.UNPROVIDED);
                                                                                                            module0056.f4149(var61, var31);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (var57.isList()) {
                                                                                                    if (module0305.NIL == var23) {
                                                                                                        var62 = var57;
                                                                                                        var63 = (SubLObject)module0305.NIL;
                                                                                                        var63 = var62.first();
                                                                                                        while (module0305.NIL == var23 && module0305.NIL != var62) {
                                                                                                            if (module0305.NIL == module0249.f16059(var63, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                                module0249.f16055(var63, (SubLObject)module0305.UNPROVIDED);
                                                                                                                module0056.f4149(var63, var31);
                                                                                                            }
                                                                                                            var62 = var62.rest();
                                                                                                            var63 = var62.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)module0305.$ic47$, var57);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                module0138.$g1624$.rebind(var23_300, var22);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    module0066.f4842(var89_315);
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1623$.rebind(var23_299, var22);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var53);
                                                                    }
                                                                }
                                                                else {
                                                                    module0136.f8870((SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.$ic48$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (module0305.NIL != module0155.f9785(var50, (SubLObject)module0305.UNPROVIDED)) {
                                                                var64 = ((module0305.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED)));
                                                                for (var82_317 = (SubLObject)module0305.NIL, var82_317 = var64; module0305.NIL == var23 && module0305.NIL != var82_317; var82_317 = var82_317.rest()) {
                                                                    var65 = var82_317.first();
                                                                    var23_301 = module0138.$g1625$.currentBinding(var22);
                                                                    try {
                                                                        module0138.$g1625$.bind(var65, var22);
                                                                        var66 = (var67 = Functions.funcall(var65, var50));
                                                                        if (module0305.NIL != module0077.f5302(var67)) {
                                                                            var68 = module0077.f5333(var67);
                                                                            for (var69 = module0032.f1741(var68), var70 = (SubLObject)module0305.NIL, var70 = module0032.f1742(var69, var68); module0305.NIL == var23 && module0305.NIL == module0032.f1744(var69, var70); var70 = module0032.f1743(var70)) {
                                                                                var71 = module0032.f1745(var69, var70);
                                                                                if (module0305.NIL != module0032.f1746(var70, var71) && module0305.NIL == module0249.f16059(var71, (SubLObject)module0305.UNPROVIDED)) {
                                                                                    module0249.f16055(var71, (SubLObject)module0305.UNPROVIDED);
                                                                                    module0056.f4149(var71, var31);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (var67.isList()) {
                                                                            if (module0305.NIL == var23) {
                                                                                var72 = var67;
                                                                                var73 = (SubLObject)module0305.NIL;
                                                                                var73 = var72.first();
                                                                                while (module0305.NIL == var23 && module0305.NIL != var72) {
                                                                                    if (module0305.NIL == module0249.f16059(var73, (SubLObject)module0305.UNPROVIDED)) {
                                                                                        module0249.f16055(var73, (SubLObject)module0305.UNPROVIDED);
                                                                                        module0056.f4149(var73, var31);
                                                                                    }
                                                                                    var72 = var72.rest();
                                                                                    var73 = var72.first();
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)module0305.$ic47$, var67);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1625$.rebind(var23_301, var22);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            module0141.$g1674$.rebind(var24_296, var22);
                                                            module0137.$g1605$.rebind(var23_298, var22);
                                                        }
                                                    }
                                                    var29 = module0056.f4150(var31);
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var25_298, var22);
                                                module0138.$g1619$.rebind(var24_295, var22);
                                                module0141.$g1677$.rebind(var23_295, var22);
                                            }
                                        }
                                        else {
                                            module0136.f8872((SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic49$, var2, module0244.f15748(module0137.f8955((SubLObject)module0305.UNPROVIDED)), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        module0137.$g1605$.rebind(var34, var22);
                                        module0141.$g1674$.rebind(var26_302, var22);
                                        module0141.$g1672$.rebind(var25_297, var22);
                                        module0141.$g1671$.rebind(var24_294, var22);
                                        module0141.$g1670$.rebind(var23_294, var22);
                                    }
                                }
                                finally {
                                    module0141.$g1715$.rebind(var24_293, var22);
                                    module0141.$g1714$.rebind(var23_293, var22);
                                }
                            }
                            finally {
                                module0147.$g2096$.rebind(var25_296, var22);
                                module0147.$g2094$.rebind(var24_292, var22);
                                module0147.$g2095$.rebind(var23_292, var22);
                            }
                            module0139.f9011(module0139.$g1635$.getDynamicValue(var22));
                        }
                        finally {
                            module0139.$g1635$.rebind(var23_291, var22);
                        }
                    }
                    if (module0305.NIL == var23) {
                        final SubLObject var23_302 = module0144.$g1796$.currentBinding(var22);
                        final SubLObject var24_297 = module0144.$g1795$.currentBinding(var22);
                        final SubLObject var25_299 = module0152.$g2116$.currentBinding(var22);
                        final SubLObject var26_303 = module0152.$g2115$.currentBinding(var22);
                        try {
                            module0144.$g1796$.bind((SubLObject)module0305.NIL, var22);
                            module0144.$g1795$.bind((SubLObject)module0305.NIL, var22);
                            module0152.$g2116$.bind((SubLObject)module0305.NIL, var22);
                            module0152.$g2115$.bind((SubLObject)module0305.NIL, var22);
                            if (module0305.NIL == var23) {
                                SubLObject var74 = module0257.f16683(var2, var21, (SubLObject)module0305.UNPROVIDED);
                                SubLObject var75 = (SubLObject)module0305.NIL;
                                var75 = var74.first();
                                while (module0305.NIL == var23 && module0305.NIL != var74) {
                                    if (module0305.NIL != f20414(var75, var20, var21)) {
                                        var23 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)module0305.$ic111$, (SubLObject)ConsesLow.list(module0305.$ic109$, var20, var75), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED), module0191.f11990((SubLObject)module0305.$ic112$, (SubLObject)ConsesLow.list(module0305.$ic113$, var2, var75), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                                    }
                                    var74 = var74.rest();
                                    var75 = var74.first();
                                }
                            }
                        }
                        finally {
                            module0152.$g2115$.rebind(var26_303, var22);
                            module0152.$g2116$.rebind(var25_299, var22);
                            module0144.$g1795$.rebind(var24_297, var22);
                            module0144.$g1796$.rebind(var23_302, var22);
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var24_291, var22);
                    module0147.$g2094$.rebind(var23_290, var22);
                }
            }
            finally {
                final SubLObject var23_303 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                    f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_303, var22);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var27, var22);
            module0144.$g1879$.rebind(var26, var22);
            module0144.$g1882$.rebind(var25, var22);
            module0144.$g1881$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20463(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1881$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1882$.currentBinding(var22);
        final SubLObject var26 = module0144.$g1879$.currentBinding(var22);
        final SubLObject var27 = module0144.$g1880$.currentBinding(var22);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var22);
            module0144.$g1882$.bind(module0149.f9627(), var22);
            module0144.$g1879$.bind(module0149.f9628(), var22);
            module0144.$g1880$.bind(module0149.f9629(), var22);
            try {
                final SubLObject var28 = var21;
                final SubLObject var23_325 = module0147.$g2094$.currentBinding(var22);
                final SubLObject var24_326 = module0147.$g2095$.currentBinding(var22);
                try {
                    module0147.$g2094$.bind(module0147.f9531(var28), var22);
                    module0147.$g2095$.bind(module0147.f9534(var28), var22);
                    if (module0305.NIL == var23) {
                        SubLObject var29 = var2;
                        final SubLObject var30 = (SubLObject)module0305.$ic36$;
                        final SubLObject var31 = module0056.f4145(var30);
                        final SubLObject var23_326 = module0139.$g1635$.currentBinding(var22);
                        try {
                            module0139.$g1635$.bind(module0139.f9007(), var22);
                            final SubLObject var62_328 = var21;
                            final SubLObject var23_327 = module0147.$g2095$.currentBinding(var22);
                            final SubLObject var24_327 = module0147.$g2094$.currentBinding(var22);
                            final SubLObject var25_331 = module0147.$g2096$.currentBinding(var22);
                            try {
                                module0147.$g2095$.bind(module0147.f9545(var62_328), var22);
                                module0147.$g2094$.bind(module0147.f9546(var62_328), var22);
                                module0147.$g2096$.bind(module0147.f9549(var62_328), var22);
                                final SubLObject var32 = (SubLObject)module0305.NIL;
                                final SubLObject var23_328 = module0141.$g1714$.currentBinding(var22);
                                final SubLObject var24_328 = module0141.$g1715$.currentBinding(var22);
                                try {
                                    module0141.$g1714$.bind((module0305.NIL != var32) ? var32 : module0141.f9283(), var22);
                                    module0141.$g1715$.bind((SubLObject)((module0305.NIL != var32) ? module0305.$ic37$ : module0141.$g1715$.getDynamicValue(var22)), var22);
                                    if (module0305.NIL != var32 && module0305.NIL != module0136.f8864() && module0305.NIL == module0141.f9279(var32)) {
                                        final SubLObject var33 = module0136.$g1591$.getDynamicValue(var22);
                                        if (var33.eql((SubLObject)module0305.$ic38$)) {
                                            module0136.f8870((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                        }
                                        else if (var33.eql((SubLObject)module0305.$ic41$)) {
                                            module0136.f8871((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                        }
                                        else if (var33.eql((SubLObject)module0305.$ic43$)) {
                                            Errors.warn((SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$);
                                        }
                                        else {
                                            Errors.warn((SubLObject)module0305.$ic44$, module0136.$g1591$.getDynamicValue(var22));
                                            Errors.cerror((SubLObject)module0305.$ic42$, (SubLObject)module0305.$ic39$, var32, (SubLObject)module0305.$ic40$);
                                        }
                                    }
                                    final SubLObject var23_329 = module0141.$g1670$.currentBinding(var22);
                                    final SubLObject var24_329 = module0141.$g1671$.currentBinding(var22);
                                    final SubLObject var25_332 = module0141.$g1672$.currentBinding(var22);
                                    final SubLObject var26_337 = module0141.$g1674$.currentBinding(var22);
                                    final SubLObject var34 = module0137.$g1605$.currentBinding(var22);
                                    try {
                                        module0141.$g1670$.bind(module0137.f8955(module0305.$ic45$), var22);
                                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0305.$ic45$)), var22);
                                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0305.$ic45$)), var22);
                                        module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                                        module0137.$g1605$.bind(module0137.f8955(module0305.$ic45$), var22);
                                        if (module0305.NIL != module0136.f8865() || module0305.NIL != module0244.f15795(var2, module0137.f8955((SubLObject)module0305.UNPROVIDED))) {
                                            final SubLObject var23_330 = module0141.$g1677$.currentBinding(var22);
                                            final SubLObject var24_330 = module0138.$g1619$.currentBinding(var22);
                                            final SubLObject var25_333 = module0141.$g1674$.currentBinding(var22);
                                            try {
                                                module0141.$g1677$.bind(module0141.f9208(), var22);
                                                module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0305.$ic45$)), var22);
                                                module0141.$g1674$.bind((SubLObject)module0305.NIL, var22);
                                                module0249.f16055(var29, (SubLObject)module0305.UNPROVIDED);
                                                while (module0305.NIL != var29 && module0305.NIL == var23) {
                                                    final SubLObject var35 = var29;
                                                    final SubLObject var23_331 = module0144.$g1869$.currentBinding(var22);
                                                    try {
                                                        module0144.$g1869$.bind(var35, var22);
                                                        if (module0305.NIL == var23) {
                                                            SubLObject var36 = (SubLObject)module0305.$ic46$;
                                                            SubLObject var37 = (SubLObject)module0305.NIL;
                                                            var37 = var36.first();
                                                            while (module0305.NIL == var23 && module0305.NIL != var36) {
                                                                final SubLObject var38 = var37;
                                                                if (module0305.NIL != module0158.f10010(var35, (SubLObject)module0305.ONE_INTEGER, var38)) {
                                                                    final SubLObject var39 = module0158.f10011(var35, (SubLObject)module0305.ONE_INTEGER, var38);
                                                                    SubLObject var40 = (SubLObject)module0305.NIL;
                                                                    final SubLObject var41 = (SubLObject)module0305.NIL;
                                                                    while (module0305.NIL == var40) {
                                                                        final SubLObject var42 = module0052.f3695(var39, var41);
                                                                        final SubLObject var43 = (SubLObject)SubLObjectFactory.makeBoolean(!var41.eql(var42));
                                                                        if (module0305.NIL != var43) {
                                                                            SubLObject var44 = (SubLObject)module0305.NIL;
                                                                            try {
                                                                                var44 = module0158.f10316(var42, (SubLObject)module0305.$ic50$, (SubLObject)module0305.$ic21$, (SubLObject)module0305.NIL);
                                                                                SubLObject var109_342 = (SubLObject)module0305.NIL;
                                                                                final SubLObject var110_343 = (SubLObject)module0305.NIL;
                                                                                while (module0305.NIL == var109_342) {
                                                                                    final SubLObject var45 = module0052.f3695(var44, var110_343);
                                                                                    final SubLObject var112_344 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_343.eql(var45));
                                                                                    if (module0305.NIL != var112_344) {
                                                                                        final SubLObject var46 = module0202.f12757(module0178.f11335(var45));
                                                                                        if (module0305.NIL != f20359(var46, module0144.$g1869$.getDynamicValue(var22)) && module0305.NIL == f20426(var46, var20, var2, var21)) {
                                                                                            if (!var2.eql(module0144.$g1869$.getDynamicValue(var22))) {
                                                                                                var23 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0305.$ic110$, (SubLObject)ConsesLow.list(module0305.$ic45$, var2, module0144.$g1869$.getDynamicValue(var22)), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED), var23);
                                                                                            }
                                                                                            var23 = (SubLObject)ConsesLow.cons(var45, var23);
                                                                                        }
                                                                                    }
                                                                                    var109_342 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var112_344);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                final SubLObject var23_332 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                                                                                try {
                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                                                                                    if (module0305.NIL != var44) {
                                                                                        module0158.f10319(var44);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var23_332, var22);
                                                                                }
                                                                            }
                                                                        }
                                                                        var40 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var43);
                                                                    }
                                                                }
                                                                var36 = var36.rest();
                                                                var37 = var36.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0144.$g1869$.rebind(var23_331, var22);
                                                    }
                                                    final SubLObject var47 = module0200.f12443(module0137.f8955(module0305.$ic45$));
                                                    SubLObject var48;
                                                    SubLObject var49;
                                                    SubLObject var23_333;
                                                    SubLObject var24_331;
                                                    SubLObject var50;
                                                    SubLObject var51;
                                                    SubLObject var52;
                                                    SubLObject var53;
                                                    SubLObject var90_348;
                                                    SubLObject var54;
                                                    SubLObject var23_334;
                                                    SubLObject var89_350;
                                                    SubLObject var55;
                                                    SubLObject var56;
                                                    SubLObject var23_335;
                                                    SubLObject var57;
                                                    SubLObject var58;
                                                    SubLObject var59;
                                                    SubLObject var60;
                                                    SubLObject var61;
                                                    SubLObject var62;
                                                    SubLObject var63;
                                                    SubLObject var64;
                                                    SubLObject var82_352;
                                                    SubLObject var65;
                                                    SubLObject var23_336;
                                                    SubLObject var67;
                                                    SubLObject var66;
                                                    SubLObject var68;
                                                    SubLObject var69;
                                                    SubLObject var70;
                                                    SubLObject var71;
                                                    SubLObject var72;
                                                    SubLObject var73;
                                                    for (var48 = (SubLObject)module0305.NIL, var48 = var47; module0305.NIL == var23 && module0305.NIL != var48; var48 = var48.rest()) {
                                                        var49 = var48.first();
                                                        var23_333 = module0137.$g1605$.currentBinding(var22);
                                                        var24_331 = module0141.$g1674$.currentBinding(var22);
                                                        try {
                                                            module0137.$g1605$.bind(var49, var22);
                                                            module0141.$g1674$.bind((SubLObject)((module0305.NIL != module0141.f9205((SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0305.NIL == module0141.$g1674$.getDynamicValue(var22)) : module0141.$g1674$.getDynamicValue(var22)), var22);
                                                            var50 = module0228.f15229(var29);
                                                            if (module0305.NIL != module0138.f8992(var50)) {
                                                                var51 = module0242.f15664(var50, module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                                if (module0305.NIL != var51) {
                                                                    var52 = module0245.f15834(var51, module0138.f8979(), module0137.f8955((SubLObject)module0305.UNPROVIDED));
                                                                    if (module0305.NIL != var52) {
                                                                        for (var53 = module0066.f4838(module0067.f4891(var52)); module0305.NIL == var23 && module0305.NIL == module0066.f4841(var53); var53 = module0066.f4840(var53)) {
                                                                            var22.resetMultipleValues();
                                                                            var90_348 = module0066.f4839(var53);
                                                                            var54 = var22.secondMultipleValue();
                                                                            var22.resetMultipleValues();
                                                                            if (module0305.NIL != module0147.f9507(var90_348)) {
                                                                                var23_334 = module0138.$g1623$.currentBinding(var22);
                                                                                try {
                                                                                    module0138.$g1623$.bind(var90_348, var22);
                                                                                    for (var89_350 = module0066.f4838(module0067.f4891(var54)); module0305.NIL == var23 && module0305.NIL == module0066.f4841(var89_350); var89_350 = module0066.f4840(var89_350)) {
                                                                                        var22.resetMultipleValues();
                                                                                        var55 = module0066.f4839(var89_350);
                                                                                        var56 = var22.secondMultipleValue();
                                                                                        var22.resetMultipleValues();
                                                                                        if (module0305.NIL != module0141.f9289(var55)) {
                                                                                            var23_335 = module0138.$g1624$.currentBinding(var22);
                                                                                            try {
                                                                                                module0138.$g1624$.bind(var55, var22);
                                                                                                var57 = var56;
                                                                                                if (module0305.NIL != module0077.f5302(var57)) {
                                                                                                    var58 = module0077.f5333(var57);
                                                                                                    for (var59 = module0032.f1741(var58), var60 = (SubLObject)module0305.NIL, var60 = module0032.f1742(var59, var58); module0305.NIL == var23 && module0305.NIL == module0032.f1744(var59, var60); var60 = module0032.f1743(var60)) {
                                                                                                        var61 = module0032.f1745(var59, var60);
                                                                                                        if (module0305.NIL != module0032.f1746(var60, var61) && module0305.NIL == module0249.f16059(var61, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                            module0249.f16055(var61, (SubLObject)module0305.UNPROVIDED);
                                                                                                            module0056.f4149(var61, var31);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (var57.isList()) {
                                                                                                    if (module0305.NIL == var23) {
                                                                                                        var62 = var57;
                                                                                                        var63 = (SubLObject)module0305.NIL;
                                                                                                        var63 = var62.first();
                                                                                                        while (module0305.NIL == var23 && module0305.NIL != var62) {
                                                                                                            if (module0305.NIL == module0249.f16059(var63, (SubLObject)module0305.UNPROVIDED)) {
                                                                                                                module0249.f16055(var63, (SubLObject)module0305.UNPROVIDED);
                                                                                                                module0056.f4149(var63, var31);
                                                                                                            }
                                                                                                            var62 = var62.rest();
                                                                                                            var63 = var62.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)module0305.$ic47$, var57);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                module0138.$g1624$.rebind(var23_335, var22);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    module0066.f4842(var89_350);
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1623$.rebind(var23_334, var22);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var53);
                                                                    }
                                                                }
                                                                else {
                                                                    module0136.f8870((SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.$ic48$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (module0305.NIL != module0155.f9785(var50, (SubLObject)module0305.UNPROVIDED)) {
                                                                var64 = ((module0305.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var22), module0137.f8955((SubLObject)module0305.UNPROVIDED)));
                                                                for (var82_352 = (SubLObject)module0305.NIL, var82_352 = var64; module0305.NIL == var23 && module0305.NIL != var82_352; var82_352 = var82_352.rest()) {
                                                                    var65 = var82_352.first();
                                                                    var23_336 = module0138.$g1625$.currentBinding(var22);
                                                                    try {
                                                                        module0138.$g1625$.bind(var65, var22);
                                                                        var66 = (var67 = Functions.funcall(var65, var50));
                                                                        if (module0305.NIL != module0077.f5302(var67)) {
                                                                            var68 = module0077.f5333(var67);
                                                                            for (var69 = module0032.f1741(var68), var70 = (SubLObject)module0305.NIL, var70 = module0032.f1742(var69, var68); module0305.NIL == var23 && module0305.NIL == module0032.f1744(var69, var70); var70 = module0032.f1743(var70)) {
                                                                                var71 = module0032.f1745(var69, var70);
                                                                                if (module0305.NIL != module0032.f1746(var70, var71) && module0305.NIL == module0249.f16059(var71, (SubLObject)module0305.UNPROVIDED)) {
                                                                                    module0249.f16055(var71, (SubLObject)module0305.UNPROVIDED);
                                                                                    module0056.f4149(var71, var31);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (var67.isList()) {
                                                                            if (module0305.NIL == var23) {
                                                                                var72 = var67;
                                                                                var73 = (SubLObject)module0305.NIL;
                                                                                var73 = var72.first();
                                                                                while (module0305.NIL == var23 && module0305.NIL != var72) {
                                                                                    if (module0305.NIL == module0249.f16059(var73, (SubLObject)module0305.UNPROVIDED)) {
                                                                                        module0249.f16055(var73, (SubLObject)module0305.UNPROVIDED);
                                                                                        module0056.f4149(var73, var31);
                                                                                    }
                                                                                    var72 = var72.rest();
                                                                                    var73 = var72.first();
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)module0305.$ic47$, var67);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1625$.rebind(var23_336, var22);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            module0141.$g1674$.rebind(var24_331, var22);
                                                            module0137.$g1605$.rebind(var23_333, var22);
                                                        }
                                                    }
                                                    var29 = module0056.f4150(var31);
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var25_333, var22);
                                                module0138.$g1619$.rebind(var24_330, var22);
                                                module0141.$g1677$.rebind(var23_330, var22);
                                            }
                                        }
                                        else {
                                            module0136.f8872((SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic49$, var2, module0244.f15748(module0137.f8955((SubLObject)module0305.UNPROVIDED)), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        module0137.$g1605$.rebind(var34, var22);
                                        module0141.$g1674$.rebind(var26_337, var22);
                                        module0141.$g1672$.rebind(var25_332, var22);
                                        module0141.$g1671$.rebind(var24_329, var22);
                                        module0141.$g1670$.rebind(var23_329, var22);
                                    }
                                }
                                finally {
                                    module0141.$g1715$.rebind(var24_328, var22);
                                    module0141.$g1714$.rebind(var23_328, var22);
                                }
                            }
                            finally {
                                module0147.$g2096$.rebind(var25_331, var22);
                                module0147.$g2094$.rebind(var24_327, var22);
                                module0147.$g2095$.rebind(var23_327, var22);
                            }
                            module0139.f9011(module0139.$g1635$.getDynamicValue(var22));
                        }
                        finally {
                            module0139.$g1635$.rebind(var23_326, var22);
                        }
                    }
                    if (module0305.NIL == var23) {
                        final SubLObject var23_337 = module0144.$g1796$.currentBinding(var22);
                        final SubLObject var24_332 = module0144.$g1795$.currentBinding(var22);
                        final SubLObject var25_334 = module0152.$g2116$.currentBinding(var22);
                        final SubLObject var26_338 = module0152.$g2115$.currentBinding(var22);
                        try {
                            module0144.$g1796$.bind((SubLObject)module0305.NIL, var22);
                            module0144.$g1795$.bind((SubLObject)module0305.NIL, var22);
                            module0152.$g2116$.bind((SubLObject)module0305.NIL, var22);
                            module0152.$g2115$.bind((SubLObject)module0305.NIL, var22);
                            if (module0305.NIL == var23) {
                                SubLObject var74 = module0257.f16683(var2, var21, (SubLObject)module0305.UNPROVIDED);
                                SubLObject var75 = (SubLObject)module0305.NIL;
                                var75 = var74.first();
                                while (module0305.NIL == var23 && module0305.NIL != var74) {
                                    if (module0305.NIL != f20423(var75, var20, var21)) {
                                        var23 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)module0305.$ic111$, (SubLObject)ConsesLow.list(module0305.$ic114$, var20, var75), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED), module0191.f11990((SubLObject)module0305.$ic112$, (SubLObject)ConsesLow.list(module0305.$ic113$, var2, var75), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                                    }
                                    var74 = var74.rest();
                                    var75 = var74.first();
                                }
                            }
                        }
                        finally {
                            module0152.$g2115$.rebind(var26_338, var22);
                            module0152.$g2116$.rebind(var25_334, var22);
                            module0144.$g1795$.rebind(var24_332, var22);
                            module0144.$g1796$.rebind(var23_337, var22);
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var24_326, var22);
                    module0147.$g2094$.rebind(var23_325, var22);
                }
            }
            finally {
                final SubLObject var23_338 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                    f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_338, var22);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var27, var22);
            module0144.$g1879$.rebind(var26, var22);
            module0144.$g1882$.rebind(var25, var22);
            module0144.$g1881$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20459(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1796$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1795$.currentBinding(var22);
        final SubLObject var26 = module0152.$g2116$.currentBinding(var22);
        final SubLObject var27 = module0152.$g2115$.currentBinding(var22);
        try {
            module0144.$g1796$.bind((SubLObject)module0305.NIL, var22);
            module0144.$g1795$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2116$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2115$.bind((SubLObject)module0305.NIL, var22);
            if (module0305.NIL == var23) {
                SubLObject var28;
                SubLObject var29;
                for (var28 = module0257.f16683(var2, var21, (SubLObject)module0305.UNPROVIDED), var29 = (SubLObject)module0305.NIL, var29 = var28.first(); module0305.NIL == var23 && module0305.NIL != var28; var23 = f20337(var29, var20, var21), var28 = var28.rest(), var29 = var28.first()) {}
            }
        }
        finally {
            module0152.$g2115$.rebind(var27, var22);
            module0152.$g2116$.rebind(var26, var22);
            module0144.$g1795$.rebind(var25, var22);
            module0144.$g1796$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20461(final SubLObject var2, final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1796$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1795$.currentBinding(var22);
        final SubLObject var26 = module0152.$g2116$.currentBinding(var22);
        final SubLObject var27 = module0152.$g2115$.currentBinding(var22);
        try {
            module0144.$g1796$.bind((SubLObject)module0305.NIL, var22);
            module0144.$g1795$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2116$.bind((SubLObject)module0305.NIL, var22);
            module0152.$g2115$.bind((SubLObject)module0305.NIL, var22);
            if (module0305.NIL == var23) {
                SubLObject var28 = module0257.f16683(var2, var21, (SubLObject)module0305.UNPROVIDED);
                SubLObject var29 = (SubLObject)module0305.NIL;
                var29 = var28.first();
                while (module0305.NIL == var23 && module0305.NIL != var28) {
                    if (module0305.NIL != f20337(var29, var20, var21)) {
                        var23 = ConsesLow.nconc(module0257.f16704(var2, var29, var21, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED), f20367(var29, var20, var21));
                    }
                    var28 = var28.rest();
                    var29 = var28.first();
                }
            }
        }
        finally {
            module0152.$g2115$.rebind(var27, var22);
            module0152.$g2116$.rebind(var26, var22);
            module0144.$g1795$.rebind(var25, var22);
            module0144.$g1796$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f20464(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0305.NIL;
        final SubLObject var23 = module0144.$g1881$.currentBinding(var21);
        final SubLObject var24 = module0144.$g1882$.currentBinding(var21);
        final SubLObject var25 = module0144.$g1879$.currentBinding(var21);
        final SubLObject var26 = module0144.$g1880$.currentBinding(var21);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var21);
            module0144.$g1882$.bind(module0149.f9627(), var21);
            module0144.$g1879$.bind(module0149.f9628(), var21);
            module0144.$g1880$.bind(module0149.f9629(), var21);
            try {
                final SubLObject var23_360 = module0018.$g598$.currentBinding(var21);
                final SubLObject var24_361 = module0018.$g584$.currentBinding(var21);
                final SubLObject var25_362 = module0305.$g2744$.currentBinding(var21);
                try {
                    module0018.$g598$.bind(var20, var21);
                    module0018.$g584$.bind(Hashtables.make_hash_table((SubLObject)module0305.$ic115$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED), var21);
                    module0305.$g2744$.bind(Hashtables.make_hash_table((SubLObject)module0305.$ic115$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED), var21);
                    module0260.f17062(module0305.$ic116$, (SubLObject)module0305.$ic117$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                    final SubLObject var27 = module0018.$g584$.getDynamicValue(var21);
                    SubLObject var28 = (SubLObject)module0305.NIL;
                    SubLObject var29 = (SubLObject)module0305.NIL;
                    final Iterator var30 = Hashtables.getEntrySetIterator(var27);
                    try {
                        while (Hashtables.iteratorHasNext(var30)) {
                            final Map.Entry var31 = Hashtables.iteratorNextEntry(var30);
                            var28 = Hashtables.getEntryKey(var31);
                            var29 = Hashtables.getEntryValue(var31);
                            var22 = conses_high.nunion(var22, var29, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var30);
                    }
                }
                finally {
                    module0305.$g2744$.rebind(var25_362, var21);
                    module0018.$g584$.rebind(var24_361, var21);
                    module0018.$g598$.rebind(var23_360, var21);
                }
            }
            finally {
                final SubLObject var23_361 = Threads.$is_thread_performing_cleanupP$.currentBinding(var21);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var21);
                    f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_361, var21);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var26, var21);
            module0144.$g1879$.rebind(var25, var21);
            module0144.$g1882$.rebind(var24, var21);
            module0144.$g1881$.rebind(var23, var21);
        }
        return var22;
    }
    
    public static SubLObject f20465(final SubLObject var20, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = module0144.$g1881$.currentBinding(var22);
        final SubLObject var25 = module0144.$g1882$.currentBinding(var22);
        final SubLObject var26 = module0144.$g1879$.currentBinding(var22);
        final SubLObject var27 = module0144.$g1880$.currentBinding(var22);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var22);
            module0144.$g1882$.bind(module0149.f9627(), var22);
            module0144.$g1879$.bind(module0149.f9628(), var22);
            module0144.$g1880$.bind(module0149.f9629(), var22);
            try {
                final SubLObject var28 = var21;
                final SubLObject var23_365 = module0147.$g2094$.currentBinding(var22);
                final SubLObject var24_366 = module0147.$g2095$.currentBinding(var22);
                final SubLObject var25_367 = module0018.$g598$.currentBinding(var22);
                final SubLObject var26_368 = module0018.$g584$.currentBinding(var22);
                try {
                    module0147.$g2094$.bind(module0147.f9531(var28), var22);
                    module0147.$g2095$.bind(module0147.f9534(var28), var22);
                    module0018.$g598$.bind(var20, var22);
                    module0018.$g584$.bind(Hashtables.make_hash_table((SubLObject)module0305.$ic115$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED), var22);
                    module0260.f17062(module0305.$ic116$, (SubLObject)module0305.$ic117$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                    final SubLObject var29 = module0018.$g584$.getDynamicValue(var22);
                    SubLObject var30 = (SubLObject)module0305.NIL;
                    SubLObject var31 = (SubLObject)module0305.NIL;
                    final Iterator var32 = Hashtables.getEntrySetIterator(var29);
                    try {
                        while (Hashtables.iteratorHasNext(var32)) {
                            final Map.Entry var33 = Hashtables.iteratorNextEntry(var32);
                            var30 = Hashtables.getEntryKey(var33);
                            var31 = Hashtables.getEntryValue(var33);
                            var23 = conses_high.nunion(var23, module0256.f16538(var31, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var32);
                    }
                }
                finally {
                    module0018.$g584$.rebind(var26_368, var22);
                    module0018.$g598$.rebind(var25_367, var22);
                    module0147.$g2095$.rebind(var24_366, var22);
                    module0147.$g2094$.rebind(var23_365, var22);
                }
            }
            finally {
                final SubLObject var23_366 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var22);
                    f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var23_366, var22);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var27, var22);
            module0144.$g1879$.rebind(var26, var22);
            module0144.$g1882$.rebind(var25, var22);
            module0144.$g1881$.rebind(var24, var22);
        }
        return module0256.f16529(var23, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
    }
    
    public static SubLObject f20466(final SubLObject var370) {
        if (module0305.NIL != module0173.f10955(var370)) {
            module0219.f14478((SubLObject)module0305.$ic118$, var370, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20467(final SubLObject var371) {
        final SubLThread var372 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0178.f11284(var371)) {
            final SubLObject var373 = module0144.$g1869$.currentBinding(var372);
            try {
                module0144.$g1869$.bind(module0178.f11334(var371), var372);
                final SubLObject var374 = module0202.f12757(module0178.f11335(var371));
                if (module0305.NIL != f20359(var374, module0144.$g1869$.getDynamicValue(var372))) {
                    if (module0305.NIL != Hashtables.gethash_without_values(var374, module0018.$g584$.getDynamicValue(var372), (SubLObject)module0305.UNPROVIDED)) {
                        module0030.f1600(var374, module0144.$g1869$.getDynamicValue(var372), module0018.$g584$.getDynamicValue(var372), (SubLObject)module0305.UNPROVIDED);
                    }
                    else if (module0305.NIL == Hashtables.gethash_without_values(var374, module0305.$g2744$.getDynamicValue(var372), (SubLObject)module0305.UNPROVIDED)) {
                        if (module0305.NIL != f20368(var374, module0018.$g598$.getDynamicValue(var372), module0144.$g1869$.getDynamicValue(var372), (SubLObject)module0305.UNPROVIDED)) {
                            module0030.f1600(var374, module0144.$g1869$.getDynamicValue(var372), module0018.$g584$.getDynamicValue(var372), (SubLObject)module0305.UNPROVIDED);
                        }
                        else {
                            Hashtables.sethash(var374, module0305.$g2744$.getDynamicValue(var372), (SubLObject)module0305.T);
                        }
                    }
                }
            }
            finally {
                module0144.$g1869$.rebind(var373, var372);
            }
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20324(final SubLObject var372, final SubLObject var373, SubLObject var374, SubLObject var375, SubLObject var376, SubLObject var377, SubLObject var378, SubLObject var379) {
        if (var374 == module0305.UNPROVIDED) {
            var374 = (SubLObject)module0305.NIL;
        }
        if (var375 == module0305.UNPROVIDED) {
            var375 = (SubLObject)module0305.NIL;
        }
        if (var376 == module0305.UNPROVIDED) {
            var376 = (SubLObject)module0305.NIL;
        }
        if (var377 == module0305.UNPROVIDED) {
            var377 = (SubLObject)module0305.NIL;
        }
        if (var378 == module0305.UNPROVIDED) {
            var378 = (SubLObject)module0305.NIL;
        }
        if (var379 == module0305.UNPROVIDED) {
            var379 = (SubLObject)module0305.NIL;
        }
        final SubLThread var380 = SubLProcess.currentSubLThread();
        if (module0144.$g1863$.getDynamicValue(var380).numGE(var372)) {
            PrintLow.format((SubLObject)module0305.T, var373, new SubLObject[] { var374, var375, var376, var377, var378, var379 });
            return (SubLObject)module0305.NIL;
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20408(final SubLObject var372, final SubLObject var373, SubLObject var374, SubLObject var375, SubLObject var376, SubLObject var377, SubLObject var378) {
        if (var374 == module0305.UNPROVIDED) {
            var374 = (SubLObject)module0305.NIL;
        }
        if (var375 == module0305.UNPROVIDED) {
            var375 = (SubLObject)module0305.NIL;
        }
        if (var376 == module0305.UNPROVIDED) {
            var376 = (SubLObject)module0305.NIL;
        }
        if (var377 == module0305.UNPROVIDED) {
            var377 = (SubLObject)module0305.NIL;
        }
        if (var378 == module0305.UNPROVIDED) {
            var378 = (SubLObject)module0305.NIL;
        }
        final SubLThread var379 = SubLProcess.currentSubLThread();
        if (module0144.$g1863$.getDynamicValue(var379).numGE(var372)) {
            Errors.cerror((SubLObject)module0305.$ic42$, var373, new SubLObject[] { var374, var375, var376, var377, var378 });
        }
        else if (Numbers.add((SubLObject)module0305.TWO_INTEGER, module0144.$g1863$.getDynamicValue(var379)).numGE(var372)) {
            PrintLow.format((SubLObject)module0305.T, Sequences.cconcatenate((SubLObject)module0305.$ic119$, var373), new SubLObject[] { var374, var375, var376, var377, var378 });
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20468(final SubLObject var372, final SubLObject var380, final SubLObject var373, SubLObject var374, SubLObject var375, SubLObject var376, SubLObject var377, SubLObject var378) {
        if (var374 == module0305.UNPROVIDED) {
            var374 = (SubLObject)module0305.NIL;
        }
        if (var375 == module0305.UNPROVIDED) {
            var375 = (SubLObject)module0305.NIL;
        }
        if (var376 == module0305.UNPROVIDED) {
            var376 = (SubLObject)module0305.NIL;
        }
        if (var377 == module0305.UNPROVIDED) {
            var377 = (SubLObject)module0305.NIL;
        }
        if (var378 == module0305.UNPROVIDED) {
            var378 = (SubLObject)module0305.NIL;
        }
        final SubLThread var381 = SubLProcess.currentSubLThread();
        if (module0144.$g1863$.getDynamicValue(var381).numGE(var372)) {
            Errors.cerror(var380, var373, new SubLObject[] { var374, var375, var376, var377, var378 });
        }
        else if (Numbers.add((SubLObject)module0305.TWO_INTEGER, module0144.$g1863$.getDynamicValue(var381)).numGE(var372)) {
            Errors.warn(var373, new SubLObject[] { var374, var375, var376, var377, var378 });
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20469(final SubLObject var372, final SubLObject var373, SubLObject var374, SubLObject var375, SubLObject var376, SubLObject var377, SubLObject var378) {
        if (var374 == module0305.UNPROVIDED) {
            var374 = (SubLObject)module0305.NIL;
        }
        if (var375 == module0305.UNPROVIDED) {
            var375 = (SubLObject)module0305.NIL;
        }
        if (var376 == module0305.UNPROVIDED) {
            var376 = (SubLObject)module0305.NIL;
        }
        if (var377 == module0305.UNPROVIDED) {
            var377 = (SubLObject)module0305.NIL;
        }
        if (var378 == module0305.UNPROVIDED) {
            var378 = (SubLObject)module0305.NIL;
        }
        final SubLThread var379 = SubLProcess.currentSubLThread();
        if (module0144.$g1863$.getDynamicValue(var379).numGE(var372)) {
            Functions.apply((SubLObject)module0305.$ic120$, var373, new SubLObject[] { var374, var375, var376, var377, var378 });
            return (SubLObject)module0305.NIL;
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20470() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = module0144.$g1868$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)module0305.NIL;
        var3 = var2.first();
        while (module0305.NIL != var2) {
            Functions.funcall(Hashtables.gethash((SubLObject)module0305.$ic12$, var3, (SubLObject)module0305.UNPROVIDED));
            var2 = var2.rest();
            var3 = var2.first();
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20471(SubLObject var382) {
        if (var382 == module0305.UNPROVIDED) {
            var382 = (SubLObject)module0305.T;
        }
        final SubLThread var383 = SubLProcess.currentSubLThread();
        SubLObject var384 = module0144.$g1868$.getDynamicValue(var383);
        SubLObject var385 = (SubLObject)module0305.NIL;
        var385 = var384.first();
        while (module0305.NIL != var384) {
            if (Hashtables.gethash((SubLObject)module0305.$ic4$, var385, (SubLObject)module0305.UNPROVIDED).numG((SubLObject)module0305.ZERO_INTEGER)) {
                f20472(var385, var382);
            }
            var384 = var384.rest();
            var385 = var384.first();
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20473(SubLObject var382) {
        if (var382 == module0305.UNPROVIDED) {
            var382 = (SubLObject)module0305.T;
        }
        final SubLThread var383 = SubLProcess.currentSubLThread();
        final SubLObject var384 = f20474(module0144.$g1868$.getDynamicValue(var383));
        f20475(var384, var382);
        SubLObject var385 = module0144.$g1868$.getDynamicValue(var383);
        SubLObject var386 = (SubLObject)module0305.NIL;
        var386 = var385.first();
        while (module0305.NIL != var385) {
            if (Hashtables.gethash((SubLObject)module0305.$ic4$, var386, (SubLObject)module0305.UNPROVIDED).numG((SubLObject)module0305.ZERO_INTEGER)) {
                f20476(var386, var384, var382);
            }
            var385 = var385.rest();
            var386 = var385.first();
        }
        f20477(var384, var382);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20475(SubLObject var384, SubLObject var382) {
        if (var384 == module0305.UNPROVIDED) {
            var384 = (SubLObject)module0305.TEN_INTEGER;
        }
        if (var382 == module0305.UNPROVIDED) {
            var382 = (SubLObject)module0305.T;
        }
        PrintLow.format(var382, (SubLObject)module0305.$ic121$);
        module0038.f2944(Numbers.add(var384, (SubLObject)module0305.$ic122$), var382, (SubLObject)module0305.NIL, (SubLObject)module0305.$ic123$, (SubLObject)module0305.UNPROVIDED);
        PrintLow.format(var382, (SubLObject)module0305.$ic124$, module0038.f2940((SubLObject)module0305.$ic125$, var384, (SubLObject)module0305.UNPROVIDED));
        PrintLow.format(var382, (SubLObject)module0305.$ic126$);
        PrintLow.format(var382, (SubLObject)module0305.$ic127$);
        PrintLow.format(var382, (SubLObject)module0305.$ic128$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20476(final SubLObject var381, SubLObject var384, SubLObject var382) {
        if (var384 == module0305.UNPROVIDED) {
            var384 = (SubLObject)module0305.TEN_INTEGER;
        }
        if (var382 == module0305.UNPROVIDED) {
            var382 = (SubLObject)module0305.T;
        }
        final SubLObject var385 = PrintLow.format((SubLObject)module0305.NIL, (SubLObject)module0305.$ic129$, Hashtables.gethash((SubLObject)module0305.$ic10$, var381, (SubLObject)module0305.UNPROVIDED));
        final SubLObject var386 = Hashtables.gethash((SubLObject)module0305.$ic4$, var381, (SubLObject)module0305.UNPROVIDED);
        if (module0305.NIL != var386 && var386.numG((SubLObject)module0305.ZERO_INTEGER)) {
            final SubLObject var387 = (SubLObject)((module0305.NIL != var386 && var386.numG((SubLObject)module0305.ZERO_INTEGER)) ? Hashtables.gethash((SubLObject)module0305.$ic5$, var381, (SubLObject)module0305.UNPROVIDED) : module0305.NIL);
            final SubLObject var388 = (SubLObject)((module0305.NIL != var387) ? Functions.apply(Symbols.symbol_function((SubLObject)module0305.$ic130$), var387) : module0305.NIL);
            final SubLObject var389 = (SubLObject)((module0305.NIL != var388) ? Numbers.divide(var388, var386) : module0305.NIL);
            PrintLow.format(var382, (SubLObject)module0305.$ic124$, module0038.f2940(Strings.string_downcase(var385, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED), var384, (SubLObject)module0305.UNPROVIDED));
            PrintLow.format(var382, (SubLObject)module0305.$ic131$, module0038.f2941(module0038.f2940(module0038.f2638(var386), (SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.UNPROVIDED));
            if (module0305.NIL != var388) {
                PrintLow.format(var382, (SubLObject)module0305.$ic131$, module0038.f2939(PrintLow.format((SubLObject)module0305.NIL, (SubLObject)module0305.$ic132$, module0048.f3307(var388, (SubLObject)module0305.TWO_INTEGER)), module0038.$g913$.getGlobalValue(), (SubLObject)module0305.TEN_INTEGER, (SubLObject)module0305.SEVEN_INTEGER, (SubLObject)module0305.UNPROVIDED));
            }
            else {
                module0038.f2944((SubLObject)module0305.SIXTEEN_INTEGER, var382, (SubLObject)module0305.NIL, (SubLObject)module0305.$ic133$, (SubLObject)module0305.UNPROVIDED);
            }
            if (module0305.NIL != var389) {
                PrintLow.format(var382, (SubLObject)module0305.$ic131$, module0038.f2939(module0038.f2638(module0048.f3307(var389, (SubLObject)module0305.TWO_INTEGER)), module0038.$g913$.getGlobalValue(), (SubLObject)module0305.TEN_INTEGER, (SubLObject)module0305.SEVEN_INTEGER, (SubLObject)module0305.UNPROVIDED));
            }
            else {
                module0038.f2944((SubLObject)module0305.SIXTEEN_INTEGER, var382, (SubLObject)module0305.NIL, (SubLObject)module0305.$ic133$, (SubLObject)module0305.UNPROVIDED);
            }
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20477(SubLObject var384, SubLObject var382) {
        if (var384 == module0305.UNPROVIDED) {
            var384 = (SubLObject)module0305.TEN_INTEGER;
        }
        if (var382 == module0305.UNPROVIDED) {
            var382 = (SubLObject)module0305.T;
        }
        module0038.f2944(Numbers.add(var384, (SubLObject)module0305.$ic134$), var382, (SubLObject)module0305.T, (SubLObject)module0305.$ic123$, (SubLObject)module0305.UNPROVIDED);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20472(final SubLObject var381, SubLObject var382) {
        if (var382 == module0305.UNPROVIDED) {
            var382 = (SubLObject)module0305.T;
        }
        final SubLObject var383 = f20478(var381);
        f20479(var381, var383, var382);
        SubLObject var384;
        SubLObject var385;
        for (var384 = Hashtables.gethash((SubLObject)module0305.$ic4$, var381, (SubLObject)module0305.UNPROVIDED), var385 = (SubLObject)module0305.NIL, var385 = (SubLObject)module0305.ZERO_INTEGER; var385.numL(var384); var385 = Numbers.add(var385, (SubLObject)module0305.ONE_INTEGER)) {
            f20480(var381, Numbers.add((SubLObject)module0305.ONE_INTEGER, var385), var383, var382);
        }
        f20481(var381, var383, var382);
        f20482(var381, var383, var382);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20479(final SubLObject var381, SubLObject var393, SubLObject var382) {
        if (var393 == module0305.UNPROVIDED) {
            var393 = f20478(var381);
        }
        if (var382 == module0305.UNPROVIDED) {
            var382 = (SubLObject)module0305.T;
        }
        final SubLObject var394 = PrintLow.format((SubLObject)module0305.NIL, (SubLObject)module0305.$ic135$, Hashtables.gethash((SubLObject)module0305.$ic10$, var381, (SubLObject)module0305.UNPROVIDED));
        final SubLObject var395 = Sequences.length(var394);
        PrintLow.format(var382, (SubLObject)module0305.$ic136$, Strings.string_downcase(var394, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        SubLObject var396 = var393;
        SubLObject var397 = (SubLObject)module0305.NIL;
        var397 = var396.first();
        while (module0305.NIL != var396) {
            module0038.f2944(Numbers.add((SubLObject)module0305.SIX_INTEGER, var397), var382, (SubLObject)module0305.NIL, (SubLObject)module0305.$ic123$, (SubLObject)module0305.UNPROVIDED);
            var396 = var396.rest();
            var397 = var396.first();
        }
        module0038.f2944(Numbers.subtract((SubLObject)module0305.$ic137$, var395), var382, (SubLObject)module0305.NIL, (SubLObject)module0305.$ic123$, (SubLObject)module0305.UNPROVIDED);
        PrintLow.format(var382, (SubLObject)module0305.$ic138$);
        SubLObject var398 = (SubLObject)module0305.ZERO_INTEGER;
        SubLObject var399 = Hashtables.gethash((SubLObject)module0305.$ic8$, var381, (SubLObject)module0305.UNPROVIDED);
        SubLObject var400 = (SubLObject)module0305.NIL;
        var400 = var399.first();
        while (module0305.NIL != var399) {
            final SubLObject var385_398 = Strings.string_downcase(PrintLow.format((SubLObject)module0305.NIL, (SubLObject)module0305.$ic129$, var400), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
            final SubLObject var401 = ConsesLow.nth(var398, var393);
            final SubLObject var402 = module0038.f2623(var385_398, (SubLObject)module0305.ZERO_INTEGER, Numbers.min(var401, Sequences.length(var385_398)));
            PrintLow.format(var382, (SubLObject)module0305.$ic139$, module0038.f2942(var402, var401, (SubLObject)module0305.UNPROVIDED));
            var398 = Numbers.add(var398, (SubLObject)module0305.ONE_INTEGER);
            var399 = var399.rest();
            var400 = var399.first();
        }
        PrintLow.format(var382, (SubLObject)module0305.$ic140$);
        PrintLow.format(var382, (SubLObject)module0305.$ic141$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20482(final SubLObject var381, SubLObject var393, SubLObject var382) {
        if (var393 == module0305.UNPROVIDED) {
            var393 = f20478(var381);
        }
        if (var382 == module0305.UNPROVIDED) {
            var382 = (SubLObject)module0305.T;
        }
        final SubLObject var394 = Sequences.length(PrintLow.format((SubLObject)module0305.NIL, (SubLObject)module0305.$ic135$, Hashtables.gethash((SubLObject)module0305.$ic10$, var381, (SubLObject)module0305.UNPROVIDED)));
        module0038.f2944(var394, var382, (SubLObject)module0305.T, (SubLObject)module0305.$ic123$, (SubLObject)module0305.UNPROVIDED);
        SubLObject var395 = var393;
        SubLObject var396 = (SubLObject)module0305.NIL;
        var396 = var395.first();
        while (module0305.NIL != var395) {
            module0038.f2944(Numbers.add((SubLObject)module0305.SIX_INTEGER, var396), var382, (SubLObject)module0305.NIL, (SubLObject)module0305.$ic123$, (SubLObject)module0305.UNPROVIDED);
            var395 = var395.rest();
            var396 = var395.first();
        }
        module0038.f2944(Numbers.subtract((SubLObject)module0305.$ic137$, var394), var382, (SubLObject)module0305.NIL, (SubLObject)module0305.$ic123$, (SubLObject)module0305.UNPROVIDED);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20480(final SubLObject var381, final SubLObject var392, SubLObject var393, SubLObject var382) {
        if (var393 == module0305.UNPROVIDED) {
            var393 = f20478(var381);
        }
        if (var382 == module0305.UNPROVIDED) {
            var382 = (SubLObject)module0305.T;
        }
        PrintLow.format(var382, (SubLObject)module0305.$ic142$, module0038.f2942(PrintLow.format((SubLObject)module0305.NIL, (SubLObject)module0305.$ic132$, var392), (SubLObject)module0305.NINE_INTEGER, (SubLObject)module0305.UNPROVIDED));
        SubLObject var394 = (SubLObject)module0305.ZERO_INTEGER;
        SubLObject var395 = ConsesLow.nth(Numbers.subtract(var392, (SubLObject)module0305.ONE_INTEGER), Hashtables.gethash((SubLObject)module0305.$ic7$, var381, (SubLObject)module0305.UNPROVIDED));
        SubLObject var396 = (SubLObject)module0305.NIL;
        var396 = var395.first();
        while (module0305.NIL != var395) {
            final SubLObject var397 = PrintLow.format((SubLObject)module0305.NIL, (SubLObject)module0305.$ic129$, var396);
            final SubLObject var398 = ConsesLow.nth(var394, var393);
            final SubLObject var399 = module0038.f2623(var397, (SubLObject)module0305.ZERO_INTEGER, Numbers.min(var398, Sequences.length(var397)));
            PrintLow.format(var382, (SubLObject)module0305.$ic139$, module0038.f2942(var399, var398, (SubLObject)module0305.UNPROVIDED));
            var394 = Numbers.add(var394, (SubLObject)module0305.ONE_INTEGER);
            var395 = var395.rest();
            var396 = var395.first();
        }
        PrintLow.format(var382, (SubLObject)module0305.$ic139$, module0038.f2942(PrintLow.format((SubLObject)module0305.NIL, (SubLObject)module0305.$ic132$, ConsesLow.nth(Numbers.subtract(var392, (SubLObject)module0305.ONE_INTEGER), Hashtables.gethash((SubLObject)module0305.$ic6$, var381, (SubLObject)module0305.UNPROVIDED))), (SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED));
        PrintLow.format(var382, (SubLObject)module0305.$ic139$, module0038.f2942(PrintLow.format((SubLObject)module0305.NIL, (SubLObject)module0305.$ic132$, module0048.f3307(ConsesLow.nth(Numbers.subtract(var392, (SubLObject)module0305.ONE_INTEGER), Hashtables.gethash((SubLObject)module0305.$ic5$, var381, (SubLObject)module0305.UNPROVIDED)), (SubLObject)module0305.FOUR_INTEGER)), (SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED));
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20481(final SubLObject var381, SubLObject var393, SubLObject var382) {
        if (var393 == module0305.UNPROVIDED) {
            var393 = f20478(var381);
        }
        if (var382 == module0305.UNPROVIDED) {
            var382 = (SubLObject)module0305.T;
        }
        PrintLow.format(var382, (SubLObject)module0305.$ic142$, module0038.f2942((SubLObject)module0305.$ic143$, (SubLObject)module0305.NINE_INTEGER, (SubLObject)module0305.UNPROVIDED));
        SubLObject var394 = var393;
        SubLObject var395 = (SubLObject)module0305.NIL;
        var395 = var394.first();
        while (module0305.NIL != var394) {
            module0038.f2944(Numbers.add((SubLObject)module0305.SIX_INTEGER, var395), var382, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
            var394 = var394.rest();
            var395 = var394.first();
        }
        module0038.f2944((SubLObject)module0305.FOURTEEN_INTEGER, var382, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        final SubLObject var396 = Hashtables.gethash((SubLObject)module0305.$ic5$, var381, (SubLObject)module0305.UNPROVIDED);
        final SubLObject var397 = (SubLObject)((module0305.NIL != var396) ? Functions.apply(Symbols.symbol_function((SubLObject)module0305.$ic130$), var396) : module0305.NIL);
        if (module0305.NIL != var397) {
            PrintLow.format(var382, (SubLObject)module0305.$ic139$, module0038.f2942(PrintLow.format((SubLObject)module0305.NIL, (SubLObject)module0305.$ic132$, module0048.f3307(var397, (SubLObject)module0305.FOUR_INTEGER)), (SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED));
        }
        else {
            module0038.f2944((SubLObject)module0305.FOURTEEN_INTEGER, var382, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20474(final SubLObject var400) {
        SubLObject var401 = (SubLObject)module0305.NIL;
        SubLObject var402 = var400;
        SubLObject var403 = (SubLObject)module0305.NIL;
        var403 = var402.first();
        while (module0305.NIL != var402) {
            if (Hashtables.gethash((SubLObject)module0305.$ic4$, var403, (SubLObject)module0305.UNPROVIDED).numG((SubLObject)module0305.ZERO_INTEGER)) {
                if (module0305.NIL != var401) {
                    var401 = Numbers.max(var401, module0038.f2943(Hashtables.gethash((SubLObject)module0305.$ic10$, var403, (SubLObject)module0305.UNPROVIDED)));
                }
                else {
                    var401 = module0038.f2943(Hashtables.gethash((SubLObject)module0305.$ic10$, var403, (SubLObject)module0305.UNPROVIDED));
                }
            }
            var402 = var402.rest();
            var403 = var402.first();
        }
        return var401;
    }
    
    public static SubLObject f20478(final SubLObject var381) {
        final SubLObject var382 = Hashtables.gethash((SubLObject)module0305.$ic8$, var381, (SubLObject)module0305.UNPROVIDED);
        final SubLObject var383 = Hashtables.gethash((SubLObject)module0305.$ic7$, var381, (SubLObject)module0305.UNPROVIDED);
        final SubLObject var384 = Hashtables.gethash((SubLObject)module0305.$ic4$, var381, (SubLObject)module0305.UNPROVIDED);
        SubLObject var385 = (SubLObject)module0305.NIL;
        SubLObject var386;
        SubLObject var387;
        SubLObject var388;
        SubLObject var389;
        for (var386 = Sequences.length(var382), var387 = (SubLObject)module0305.NIL, var387 = (SubLObject)module0305.ZERO_INTEGER; var387.numL(var386); var387 = Numbers.add(var387, (SubLObject)module0305.ONE_INTEGER)) {
            var388 = module0038.f2943(ConsesLow.nth(var387, var382));
            for (var389 = (SubLObject)module0305.NIL, var389 = (SubLObject)module0305.ZERO_INTEGER; var389.numL(var384); var389 = Numbers.add(var389, (SubLObject)module0305.ONE_INTEGER)) {
                var388 = Numbers.max(var388, module0038.f2943(ConsesLow.nth(var387, ConsesLow.nth(var389, var383))));
            }
            var385 = (SubLObject)ConsesLow.cons(Numbers.min((SubLObject)module0305.FIFTEEN_INTEGER, Numbers.add((SubLObject)module0305.TWO_INTEGER, var388)), var385);
        }
        return Sequences.nreverse(var385);
    }
    
    public static SubLObject f20345(final SubLObject var2) {
        if (module0305.NIL != module0173.f10955(var2)) {
            return f20317(var2);
        }
        if (module0305.NIL != module0155.f9779(var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
            return f20345(module0172.f10921(var2));
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20483(final SubLObject var2, final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var37)) {
            return module0306.f20637(var2, var36, (SubLObject)module0305.UNPROVIDED);
        }
        return f20484(var2, var36);
    }
    
    public static SubLObject f20484(final SubLObject var2, final SubLObject var36) {
        SubLObject var37 = (SubLObject)module0305.NIL;
        if (module0305.NIL == var37) {
            SubLObject var38 = f20345(var2);
            SubLObject var39 = (SubLObject)module0305.NIL;
            var39 = var38.first();
            while (module0305.NIL == var37 && module0305.NIL != var38) {
                if (module0305.NIL != module0178.f11361(var39, (SubLObject)module0305.UNPROVIDED)) {
                    var37 = Equality.eql(var36, module0202.f12757(module0178.f11335(var39)));
                }
                var38 = var38.rest();
                var39 = var38.first();
            }
        }
        return var37;
    }
    
    public static SubLObject f20485(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var3)) {
            return module0306.f20630(var2, (SubLObject)module0305.NIL);
        }
        return f20486(var2);
    }
    
    public static SubLObject f20486(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0305.NIL;
        if (module0305.NIL == var3) {
            SubLObject var4 = f20345(var2);
            SubLObject var5 = (SubLObject)module0305.NIL;
            var5 = var4.first();
            while (module0305.NIL == var3 && module0305.NIL != var4) {
                if (module0305.NIL != module0178.f11361(var5, (SubLObject)module0305.UNPROVIDED)) {
                    var3 = (SubLObject)module0305.T;
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        return var3;
    }
    
    public static SubLObject f20487(final SubLObject var3, final SubLObject var4) {
        return module0004.f104(var4, f20317(var3), Symbols.symbol_function((SubLObject)module0305.$ic144$), (SubLObject)module0305.UNPROVIDED);
    }
    
    public static SubLObject f20488(final SubLObject var404, final SubLObject var4) {
        final SubLThread var405 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var405)) {
            return module0306.f20697(var404, var4);
        }
        return f20489(var404, var4);
    }
    
    public static SubLObject f20490(final SubLObject var404, final SubLObject var4) {
        final SubLThread var405 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var405)) {
            return module0306.f20695(var404, var4);
        }
        return f20489(var404, var4);
    }
    
    public static SubLObject f20489(final SubLObject var404, final SubLObject var4) {
        final SubLThread var405 = SubLProcess.currentSubLThread();
        final SubLObject var406 = module0138.$g1628$.currentBinding(var405);
        final SubLObject var407 = module0138.$g1627$.currentBinding(var405);
        try {
            module0138.$g1628$.bind(var404, var405);
            module0138.$g1627$.bind(var4, var405);
            final SubLObject var408 = module0178.f11287(var4);
            final SubLObject var409 = module0178.f11334(var4);
            final SubLObject var410 = module0202.f12757(module0178.f11335(var4));
            if (module0305.NIL != module0018.$g574$.getDynamicValue(var405) && module0305.NIL != module0173.f10955(var409) && var410.isSymbol()) {
                f20491(var409, var4);
            }
            else {
                final SubLObject var23_405 = module0147.$g2094$.currentBinding(var405);
                final SubLObject var24_406 = module0147.$g2095$.currentBinding(var405);
                try {
                    module0147.$g2094$.bind((SubLObject)module0305.$ic147$, var405);
                    module0147.$g2095$.bind(var408, var405);
                    final SubLObject var411 = f20435(var410, var409);
                    final SubLObject var412 = module0173.f10955(var409);
                    if (module0305.NIL != var412 && module0305.NIL != var411) {
                        f20491(var409, var4);
                    }
                    else if (module0305.NIL == var412) {
                        f20468((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic148$, (SubLObject)module0305.$ic149$, var409, var408, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                    }
                    else if (module0305.NIL == var411) {
                        f20468((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic148$, (SubLObject)module0305.$ic150$, var410, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var24_406, var405);
                    module0147.$g2094$.rebind(var23_405, var405);
                }
            }
        }
        finally {
            module0138.$g1627$.rebind(var407, var405);
            module0138.$g1628$.rebind(var406, var405);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20492(final SubLObject var404, final SubLObject var4) {
        final SubLThread var405 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var405)) {
            return module0306.f20698(var404, var4);
        }
        return f20493(var404, var4);
    }
    
    public static SubLObject f20494(final SubLObject var404, final SubLObject var4) {
        final SubLThread var405 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var405)) {
            return module0306.f20696(var404, var4);
        }
        return f20493(var404, var4);
    }
    
    public static SubLObject f20493(final SubLObject var404, final SubLObject var4) {
        final SubLThread var405 = SubLProcess.currentSubLThread();
        final SubLObject var406 = module0138.$g1628$.currentBinding(var405);
        final SubLObject var407 = module0138.$g1627$.currentBinding(var405);
        try {
            module0138.$g1628$.bind(var404, var405);
            module0138.$g1627$.bind(var4, var405);
            final SubLObject var408 = module0178.f11287(var4);
            final SubLObject var409 = module0178.f11334(var4);
            final SubLObject var410 = module0202.f12757(module0178.f11335(var4));
            if (module0305.NIL != module0018.$g574$.getDynamicValue(var405) && module0305.NIL != module0173.f10955(var409) && var410.isSymbol()) {
                f20495(var409, var4);
            }
            else {
                final SubLObject var23_409 = module0147.$g2094$.currentBinding(var405);
                final SubLObject var24_410 = module0147.$g2095$.currentBinding(var405);
                try {
                    module0147.$g2094$.bind((SubLObject)module0305.$ic147$, var405);
                    module0147.$g2095$.bind(var408, var405);
                    final SubLObject var411 = f20435(var410, var409);
                    final SubLObject var412 = module0173.f10955(var409);
                    if (module0305.NIL != var412 && module0305.NIL != var411) {
                        f20495(var409, var4);
                    }
                    else if (module0305.NIL == var412) {
                        f20468((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic148$, (SubLObject)module0305.$ic149$, var409, var408, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                    }
                    else if (module0305.NIL == var411) {
                        f20468((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic148$, (SubLObject)module0305.$ic150$, var410, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var24_410, var405);
                    module0147.$g2094$.rebind(var23_409, var405);
                }
            }
        }
        finally {
            module0138.$g1627$.rebind(var407, var405);
            module0138.$g1628$.rebind(var406, var405);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20496() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2745$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2745$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2745$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2745$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2745$.getDynamicValue(var1), (SubLObject)module0305.$ic156$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2745$.getDynamicValue(var1), (SubLObject)module0305.$ic157$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20497(final SubLObject var3, final SubLObject var4) {
        f20498(var3, var4, (SubLObject)module0305.UNPROVIDED);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20491(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var5)) {
            SubLObject var6 = (SubLObject)module0305.NIL;
            SubLObject var7 = (SubLObject)module0305.NIL;
            final SubLObject var8 = Time.get_internal_real_time();
            var6 = f20497(var3, var4);
            var7 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var8), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2745$.getDynamicValue(var5), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2745$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2745$.getDynamicValue(var5), (SubLObject)ConsesLow.cons(var7, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2745$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2745$.getDynamicValue(var5), (SubLObject)ConsesLow.cons(var6, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2745$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2745$.getDynamicValue(var5), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var3, var4), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2745$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED)));
            return var6;
        }
        return f20497(var3, var4);
    }
    
    public static SubLObject f20499() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2746$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2746$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2746$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2746$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2746$.getDynamicValue(var1), (SubLObject)module0305.$ic156$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2746$.getDynamicValue(var1), (SubLObject)module0305.$ic160$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20500(final SubLObject var3, final SubLObject var4) {
        f20501(var3, var4, (SubLObject)module0305.UNPROVIDED);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20495(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var5)) {
            SubLObject var6 = (SubLObject)module0305.NIL;
            SubLObject var7 = (SubLObject)module0305.NIL;
            final SubLObject var8 = Time.get_internal_real_time();
            var6 = f20500(var3, var4);
            var7 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var8), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2746$.getDynamicValue(var5), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2746$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2746$.getDynamicValue(var5), (SubLObject)ConsesLow.cons(var7, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2746$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2746$.getDynamicValue(var5), (SubLObject)ConsesLow.cons(var6, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2746$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2746$.getDynamicValue(var5), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var3, var4), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2746$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED)));
            return var6;
        }
        return f20500(var3, var4);
    }
    
    public static SubLObject f20498(final SubLObject var3, final SubLObject var4, SubLObject var411) {
        if (var411 == module0305.UNPROVIDED) {
            var411 = (SubLObject)module0305.T;
        }
        if (module0305.NIL != f20487(var3, var4)) {
            return (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != var411) {
            return f20502(var3, var4);
        }
        f20324((SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.$ic162$, var3, var4, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        return f20318(var3, var4);
    }
    
    public static SubLObject f20501(final SubLObject var3, final SubLObject var4, SubLObject var411) {
        if (var411 == module0305.UNPROVIDED) {
            var411 = (SubLObject)module0305.T;
        }
        if (module0305.NIL == f20487(var3, var4)) {
            f20408((SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.$ic163$, var4, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
            return (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != var411) {
            return f20503(var3, var4);
        }
        f20324((SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.$ic0$, var3, var4, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        return f20320(var3, var4);
    }
    
    public static SubLObject f20504(final SubLObject var412, final SubLObject var74) {
        final SubLThread var413 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var413)) {
            return module0306.f20711(var412, var74);
        }
        return f20505(var412, var74);
    }
    
    public static SubLObject f20506() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2747$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2747$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2747$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2747$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2747$.getDynamicValue(var1), (SubLObject)module0305.$ic165$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2747$.getDynamicValue(var1), (SubLObject)module0305.$ic166$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20507(final SubLObject var412, final SubLObject var74) {
        final SubLObject var413 = f20345(var412);
        if (module0305.NIL != var413) {
            f20508(var412, var413);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20505(final SubLObject var412, final SubLObject var74) {
        final SubLThread var413 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var413)) {
            SubLObject var414 = (SubLObject)module0305.NIL;
            SubLObject var415 = (SubLObject)module0305.NIL;
            final SubLObject var416 = Time.get_internal_real_time();
            var414 = f20507(var412, var74);
            var415 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var416), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2747$.getDynamicValue(var413), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2747$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2747$.getDynamicValue(var413), (SubLObject)ConsesLow.cons(var415, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2747$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2747$.getDynamicValue(var413), (SubLObject)ConsesLow.cons(var414, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2747$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2747$.getDynamicValue(var413), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var412, var74), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2747$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            return var414;
        }
        return f20507(var412, var74);
    }
    
    public static SubLObject f20509(final SubLObject var412, final SubLObject var74) {
        final SubLThread var413 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var413)) {
            return module0306.f20719(var412, var74);
        }
        return f20510(var412, var74);
    }
    
    public static SubLObject f20511() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2748$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2748$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2748$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2748$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2748$.getDynamicValue(var1), (SubLObject)module0305.$ic165$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2748$.getDynamicValue(var1), (SubLObject)module0305.$ic169$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20512(final SubLObject var412, final SubLObject var74) {
        final SubLThread var413 = SubLProcess.currentSubLThread();
        final SubLObject var414 = module0147.$g2094$.currentBinding(var413);
        final SubLObject var415 = module0147.$g2095$.currentBinding(var413);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var413);
            module0147.$g2095$.bind(module0305.$ic107$, var413);
            if (module0305.NIL == module0256.f16576(var412, var74, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
                final SubLObject var416 = f20345(var412);
                if (module0305.NIL != var416) {
                    final SubLObject var417 = module0139.f9008();
                    final SubLObject var23_414 = module0139.$g1630$.currentBinding(var413);
                    final SubLObject var24_415 = module0139.$g1659$.currentBinding(var413);
                    try {
                        module0139.$g1630$.bind((SubLObject)module0305.NIL, var413);
                        module0139.$g1659$.bind(module0139.f9007(), var413);
                        final SubLObject var23_415 = module0144.$g1856$.currentBinding(var413);
                        final SubLObject var24_416 = module0139.$g1630$.currentBinding(var413);
                        try {
                            module0144.$g1856$.bind(module0139.$g1659$.getDynamicValue(var413), var413);
                            module0139.$g1630$.bind(var417, var413);
                            module0251.f16232(module0137.f8955(module0305.$ic45$), var412, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                            f20513(var74, var416);
                        }
                        finally {
                            module0139.$g1630$.rebind(var24_416, var413);
                            module0144.$g1856$.rebind(var23_415, var413);
                        }
                        module0139.f9011(module0139.$g1659$.getDynamicValue(var413));
                    }
                    finally {
                        module0139.$g1659$.rebind(var24_415, var413);
                        module0139.$g1630$.rebind(var23_414, var413);
                    }
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var415, var413);
            module0147.$g2094$.rebind(var414, var413);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20510(final SubLObject var412, final SubLObject var74) {
        final SubLThread var413 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var413)) {
            SubLObject var414 = (SubLObject)module0305.NIL;
            SubLObject var415 = (SubLObject)module0305.NIL;
            final SubLObject var416 = Time.get_internal_real_time();
            var414 = f20512(var412, var74);
            var415 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var416), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2748$.getDynamicValue(var413), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2748$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2748$.getDynamicValue(var413), (SubLObject)ConsesLow.cons(var415, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2748$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2748$.getDynamicValue(var413), (SubLObject)ConsesLow.cons(var414, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2748$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2748$.getDynamicValue(var413), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var412, var74), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2748$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            return var414;
        }
        return f20512(var412, var74);
    }
    
    public static SubLObject f20502(final SubLObject var2, final SubLObject var418) {
        final SubLThread var419 = SubLProcess.currentSubLThread();
        final SubLObject var420 = module0147.$g2094$.currentBinding(var419);
        final SubLObject var421 = module0147.$g2095$.currentBinding(var419);
        final SubLObject var422 = module0144.$g1871$.currentBinding(var419);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var419);
            module0147.$g2095$.bind(module0305.$ic107$, var419);
            module0144.$g1871$.bind(var418, var419);
            module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic171$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        }
        finally {
            module0144.$g1871$.rebind(var422, var419);
            module0147.$g2095$.rebind(var421, var419);
            module0147.$g2094$.rebind(var420, var419);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20503(final SubLObject var2, final SubLObject var418) {
        final SubLThread var419 = SubLProcess.currentSubLThread();
        final SubLObject var420 = module0147.$g2094$.currentBinding(var419);
        final SubLObject var421 = module0147.$g2095$.currentBinding(var419);
        final SubLObject var422 = module0144.$g1871$.currentBinding(var419);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var419);
            module0147.$g2095$.bind(module0305.$ic107$, var419);
            module0144.$g1871$.bind(var418, var419);
            module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic172$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        }
        finally {
            module0144.$g1871$.rebind(var422, var419);
            module0147.$g2095$.rebind(var421, var419);
            module0147.$g2094$.rebind(var420, var419);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20508(final SubLObject var2, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0147.$g2094$.currentBinding(var7);
        final SubLObject var9 = module0147.$g2095$.currentBinding(var7);
        final SubLObject var10 = module0144.$g1872$.currentBinding(var7);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var7);
            module0147.$g2095$.bind(module0305.$ic107$, var7);
            module0144.$g1872$.bind(var6, var7);
            module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic173$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        }
        finally {
            module0144.$g1872$.rebind(var10, var7);
            module0147.$g2095$.rebind(var9, var7);
            module0147.$g2094$.rebind(var8, var7);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20513(final SubLObject var2, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0147.$g2094$.currentBinding(var7);
        final SubLObject var9 = module0147.$g2095$.currentBinding(var7);
        final SubLObject var10 = module0144.$g1872$.currentBinding(var7);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var7);
            module0147.$g2095$.bind(module0305.$ic107$, var7);
            module0144.$g1872$.bind(var6, var7);
            module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic174$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        }
        finally {
            module0144.$g1872$.rebind(var10, var7);
            module0147.$g2095$.rebind(var9, var7);
            module0147.$g2094$.rebind(var8, var7);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20514(final SubLObject var2, SubLObject var418) {
        if (var418 == module0305.UNPROVIDED) {
            var418 = module0144.$g1871$.getDynamicValue();
        }
        return f20498(var2, var418, (SubLObject)module0305.NIL);
    }
    
    public static SubLObject f20515(final SubLObject var2, SubLObject var418) {
        if (var418 == module0305.UNPROVIDED) {
            var418 = module0144.$g1871$.getDynamicValue();
        }
        return f20501(var2, var418, (SubLObject)module0305.NIL);
    }
    
    public static SubLObject f20516(final SubLObject var2, SubLObject var6) {
        if (var6 == module0305.UNPROVIDED) {
            var6 = module0144.$g1872$.getDynamicValue();
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0144.$g1863$.getDynamicValue(var7).numGE((SubLObject)module0305.FIVE_INTEGER)) {
            SubLObject var8 = var6;
            SubLObject var9 = (SubLObject)module0305.NIL;
            var9 = var8.first();
            while (module0305.NIL != var8) {
                f20324((SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.$ic162$, var2, var9, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        return f20321(var2, var6);
    }
    
    public static SubLObject f20323(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)module0305.NIL;
        final SubLObject var15 = module0139.$g1659$.currentBinding(var13);
        try {
            module0139.$g1659$.bind(module0144.$g1856$.getDynamicValue(var13), var13);
            var14 = module0251.f16239(var12, (SubLObject)module0305.UNPROVIDED);
        }
        finally {
            module0139.$g1659$.rebind(var15, var13);
        }
        return var14;
    }
    
    public static SubLObject f20517(final SubLObject var4) {
        return module0549.f33901(module0178.f11334(var4));
    }
    
    public static SubLObject f20319(SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0305.NIL == module0144.$g1860$.getDynamicValue(var8)) {
            return var7;
        }
        if (module0305.NIL == var7) {
            return (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != module0035.f1997(var7)) {
            return var7;
        }
        var7 = conses_high.copy_list(var7);
        var7 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)module0305.$ic175$), var7, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        return Sort.sort(var7, Symbols.symbol_function((SubLObject)module0305.$ic176$), Symbols.symbol_function((SubLObject)module0305.$ic177$));
    }
    
    public static SubLObject f20518(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)module0305.NIL;
        SubLObject var5 = (SubLObject)module0305.$ic178$;
        SubLObject var6 = (SubLObject)module0305.NIL;
        var6 = var5.first();
        while (module0305.NIL != var5) {
            final SubLObject var7 = module0147.$g2094$.currentBinding(var3);
            final SubLObject var8 = module0147.$g2095$.currentBinding(var3);
            try {
                module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var3);
                module0147.$g2095$.bind(module0305.$ic107$, var3);
                final SubLObject var9 = module0139.$g1630$.getDynamicValue(var3);
                final SubLObject var23_421 = module0139.$g1631$.currentBinding(var3);
                final SubLObject var24_422 = module0139.$g1632$.currentBinding(var3);
                final SubLObject var10 = module0139.$g1630$.currentBinding(var3);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var9, (SubLObject)module0305.SIX_INTEGER), var3);
                    module0139.$g1632$.bind(module0139.f9016(var9), var3);
                    module0139.$g1630$.bind((SubLObject)module0305.T, var3);
                    final SubLObject var11 = var6;
                    if (module0305.NIL != module0158.f10038(var11)) {
                        final SubLObject var12 = (SubLObject)module0305.NIL;
                        final SubLObject var23_422 = module0012.$g73$.currentBinding(var3);
                        final SubLObject var24_423 = module0012.$g65$.currentBinding(var3);
                        final SubLObject var25_427 = module0012.$g67$.currentBinding(var3);
                        final SubLObject var13 = module0012.$g68$.currentBinding(var3);
                        final SubLObject var14 = module0012.$g66$.currentBinding(var3);
                        final SubLObject var15 = module0012.$g69$.currentBinding(var3);
                        final SubLObject var16 = module0012.$g70$.currentBinding(var3);
                        final SubLObject var17 = module0012.$silent_progressP$.currentBinding(var3);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var3);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                            module0012.$g67$.bind((SubLObject)module0305.ONE_INTEGER, var3);
                            module0012.$g68$.bind((SubLObject)module0305.ZERO_INTEGER, var3);
                            module0012.$g66$.bind((SubLObject)module0305.ZERO_INTEGER, var3);
                            module0012.$g69$.bind((SubLObject)module0305.ZERO_INTEGER, var3);
                            module0012.$g70$.bind((SubLObject)module0305.T, var3);
                            module0012.$silent_progressP$.bind((SubLObject)((module0305.NIL != var12) ? module0012.$silent_progressP$.getDynamicValue(var3) : module0305.T), var3);
                            module0012.f474(var12);
                            final SubLObject var18 = module0158.f10039(var11);
                            SubLObject var19 = var4;
                            final SubLObject var20 = (SubLObject)module0305.NIL;
                            while (module0305.NIL == var19) {
                                final SubLObject var21 = module0052.f3695(var18, var20);
                                final SubLObject var22 = (SubLObject)SubLObjectFactory.makeBoolean(!var20.eql(var21));
                                if (module0305.NIL != var22) {
                                    module0012.f476();
                                    SubLObject var23 = (SubLObject)module0305.NIL;
                                    try {
                                        var23 = module0158.f10316(var21, (SubLObject)module0305.$ic50$, (SubLObject)module0305.$ic21$, (SubLObject)module0305.NIL);
                                        SubLObject var109_432 = var4;
                                        final SubLObject var110_433 = (SubLObject)module0305.NIL;
                                        while (module0305.NIL == var109_432) {
                                            final SubLObject var24 = module0052.f3695(var23, var110_433);
                                            final SubLObject var112_434 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_433.eql(var24));
                                            if (module0305.NIL != var112_434) {
                                                final SubLObject var25 = module0178.f11334(var24);
                                                if (module0305.NIL != module0256.f16576(var25, var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
                                                    f20491(var2, var24);
                                                }
                                            }
                                            var109_432 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var112_434 || module0305.NIL != var4);
                                        }
                                    }
                                    finally {
                                        final SubLObject var23_423 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var3);
                                            if (module0305.NIL != var23) {
                                                module0158.f10319(var23);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var23_423, var3);
                                        }
                                    }
                                }
                                var19 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var22 || module0305.NIL != var4);
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var17, var3);
                            module0012.$g70$.rebind(var16, var3);
                            module0012.$g69$.rebind(var15, var3);
                            module0012.$g66$.rebind(var14, var3);
                            module0012.$g68$.rebind(var13, var3);
                            module0012.$g67$.rebind(var25_427, var3);
                            module0012.$g65$.rebind(var24_423, var3);
                            module0012.$g73$.rebind(var23_422, var3);
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var10, var3);
                    module0139.$g1632$.rebind(var24_422, var3);
                    module0139.$g1631$.rebind(var23_421, var3);
                }
            }
            finally {
                module0147.$g2095$.rebind(var8, var3);
                module0147.$g2094$.rebind(var7, var3);
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20519(SubLObject var436, SubLObject var437) {
        if (var436 == module0305.UNPROVIDED) {
            var436 = (SubLObject)module0305.T;
        }
        if (var437 == module0305.UNPROVIDED) {
            var437 = (SubLObject)module0305.NIL;
        }
        final SubLThread var438 = SubLProcess.currentSubLThread();
        final SubLObject var439 = module0144.$g1797$.currentBinding(var438);
        final SubLObject var440 = module0144.$g1860$.currentBinding(var438);
        try {
            module0144.$g1797$.bind((SubLObject)((module0305.NIL != var437) ? module0305.FIVE_INTEGER : module0144.$g1797$.getDynamicValue(var438)), var438);
            module0144.$g1860$.bind((SubLObject)module0305.NIL, var438);
            final SubLObject var441 = (SubLObject)module0305.NIL;
            if (module0305.NIL != var436) {
                f20325();
            }
            SubLObject var442 = (SubLObject)module0305.$ic178$;
            SubLObject var443 = (SubLObject)module0305.NIL;
            var443 = var442.first();
            while (module0305.NIL != var442) {
                final SubLObject var23_438 = module0147.$g2094$.currentBinding(var438);
                final SubLObject var24_439 = module0147.$g2095$.currentBinding(var438);
                try {
                    module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var438);
                    module0147.$g2095$.bind(module0305.$ic107$, var438);
                    final SubLObject var444 = module0139.$g1630$.getDynamicValue(var438);
                    final SubLObject var23_439 = module0139.$g1631$.currentBinding(var438);
                    final SubLObject var24_440 = module0139.$g1632$.currentBinding(var438);
                    final SubLObject var445 = module0139.$g1630$.currentBinding(var438);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var444, (SubLObject)module0305.SIX_INTEGER), var438);
                        module0139.$g1632$.bind(module0139.f9016(var444), var438);
                        module0139.$g1630$.bind((SubLObject)module0305.T, var438);
                        final SubLObject var446 = var443;
                        if (module0305.NIL != module0158.f10038(var446)) {
                            final SubLObject var447 = (SubLObject)module0305.NIL;
                            final SubLObject var23_440 = module0012.$g73$.currentBinding(var438);
                            final SubLObject var24_441 = module0012.$g65$.currentBinding(var438);
                            final SubLObject var25_444 = module0012.$g67$.currentBinding(var438);
                            final SubLObject var448 = module0012.$g68$.currentBinding(var438);
                            final SubLObject var449 = module0012.$g66$.currentBinding(var438);
                            final SubLObject var450 = module0012.$g69$.currentBinding(var438);
                            final SubLObject var451 = module0012.$g70$.currentBinding(var438);
                            final SubLObject var452 = module0012.$silent_progressP$.currentBinding(var438);
                            try {
                                module0012.$g73$.bind(Time.get_universal_time(), var438);
                                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var438), var438);
                                module0012.$g67$.bind((SubLObject)module0305.ONE_INTEGER, var438);
                                module0012.$g68$.bind((SubLObject)module0305.ZERO_INTEGER, var438);
                                module0012.$g66$.bind((SubLObject)module0305.ZERO_INTEGER, var438);
                                module0012.$g69$.bind((SubLObject)module0305.ZERO_INTEGER, var438);
                                module0012.$g70$.bind((SubLObject)module0305.T, var438);
                                module0012.$silent_progressP$.bind((SubLObject)((module0305.NIL != var447) ? module0012.$silent_progressP$.getDynamicValue(var438) : module0305.T), var438);
                                module0012.f474(var447);
                                final SubLObject var453 = module0158.f10039(var446);
                                SubLObject var454 = var441;
                                final SubLObject var455 = (SubLObject)module0305.NIL;
                                while (module0305.NIL == var454) {
                                    final SubLObject var456 = module0052.f3695(var453, var455);
                                    final SubLObject var457 = (SubLObject)SubLObjectFactory.makeBoolean(!var455.eql(var456));
                                    if (module0305.NIL != var457) {
                                        module0012.f476();
                                        SubLObject var458 = (SubLObject)module0305.NIL;
                                        try {
                                            var458 = module0158.f10316(var456, (SubLObject)module0305.$ic50$, (SubLObject)module0305.$ic21$, (SubLObject)module0305.NIL);
                                            SubLObject var109_445 = var441;
                                            final SubLObject var110_446 = (SubLObject)module0305.NIL;
                                            while (module0305.NIL == var109_445) {
                                                final SubLObject var459 = module0052.f3695(var458, var110_446);
                                                final SubLObject var112_447 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_446.eql(var459));
                                                if (module0305.NIL != var112_447) {
                                                    final SubLObject var460 = module0178.f11334(var459);
                                                    f20491(var460, var459);
                                                }
                                                var109_445 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var112_447 || module0305.NIL != var441);
                                            }
                                        }
                                        finally {
                                            final SubLObject var23_441 = Threads.$is_thread_performing_cleanupP$.currentBinding(var438);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var438);
                                                if (module0305.NIL != var458) {
                                                    module0158.f10319(var458);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var23_441, var438);
                                            }
                                        }
                                    }
                                    var454 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var457 || module0305.NIL != var441);
                                }
                                module0012.f475();
                            }
                            finally {
                                module0012.$silent_progressP$.rebind(var452, var438);
                                module0012.$g70$.rebind(var451, var438);
                                module0012.$g69$.rebind(var450, var438);
                                module0012.$g66$.rebind(var449, var438);
                                module0012.$g68$.rebind(var448, var438);
                                module0012.$g67$.rebind(var25_444, var438);
                                module0012.$g65$.rebind(var24_441, var438);
                                module0012.$g73$.rebind(var23_440, var438);
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var445, var438);
                        module0139.$g1632$.rebind(var24_440, var438);
                        module0139.$g1631$.rebind(var23_439, var438);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var24_439, var438);
                    module0147.$g2094$.rebind(var23_438, var438);
                }
                var442 = var442.rest();
                var443 = var442.first();
            }
        }
        finally {
            module0144.$g1860$.rebind(var440, var438);
            module0144.$g1797$.rebind(var439, var438);
        }
        if (module0305.NIL != module0144.$g1860$.getDynamicValue(var438)) {
            f20326();
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20520() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)module0305.$ic179$;
        final SubLObject var3 = module0012.$g73$.currentBinding(var1);
        final SubLObject var4 = module0012.$g65$.currentBinding(var1);
        final SubLObject var5 = module0012.$g67$.currentBinding(var1);
        final SubLObject var6 = module0012.$g68$.currentBinding(var1);
        final SubLObject var7 = module0012.$g66$.currentBinding(var1);
        final SubLObject var8 = module0012.$g69$.currentBinding(var1);
        final SubLObject var9 = module0012.$g70$.currentBinding(var1);
        final SubLObject var10 = module0012.$silent_progressP$.currentBinding(var1);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var1);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var1), var1);
            module0012.$g67$.bind((SubLObject)module0305.ONE_INTEGER, var1);
            module0012.$g68$.bind((SubLObject)module0305.ZERO_INTEGER, var1);
            module0012.$g66$.bind((SubLObject)module0305.ZERO_INTEGER, var1);
            module0012.$g69$.bind((SubLObject)module0305.ZERO_INTEGER, var1);
            module0012.$g70$.bind((SubLObject)module0305.T, var1);
            module0012.$silent_progressP$.bind((SubLObject)((module0305.NIL != var2) ? module0012.$silent_progressP$.getDynamicValue(var1) : module0305.T), var1);
            module0012.f474(var2);
            f20519((SubLObject)module0305.T, (SubLObject)module0305.UNPROVIDED);
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var10, var1);
            module0012.$g70$.rebind(var9, var1);
            module0012.$g69$.rebind(var8, var1);
            module0012.$g66$.rebind(var7, var1);
            module0012.$g68$.rebind(var6, var1);
            module0012.$g67$.rebind(var5, var1);
            module0012.$g65$.rebind(var4, var1);
            module0012.$g73$.rebind(var3, var1);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20387(final SubLObject var2) {
        if (module0305.NIL != module0173.f10955(var2)) {
            return f20328(var2);
        }
        if (module0305.NIL != module0155.f9779(var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
            return f20387(module0172.f10921(var2));
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20521(final SubLObject var2, final SubLObject var36) {
        SubLObject var37 = (SubLObject)module0305.NIL;
        if (module0305.NIL == var37) {
            SubLObject var38 = f20387(var2);
            SubLObject var39 = (SubLObject)module0305.NIL;
            var39 = var38.first();
            while (module0305.NIL == var37 && module0305.NIL != var38) {
                if (module0305.NIL != module0178.f11361(var39, (SubLObject)module0305.UNPROVIDED)) {
                    var37 = Equality.eql(var36, module0202.f12757(module0178.f11335(var39)));
                }
                var38 = var38.rest();
                var39 = var38.first();
            }
        }
        return var37;
    }
    
    public static SubLObject f20522(final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0305.NIL;
        final SubLObject var24 = var21;
        final SubLObject var25 = module0147.$g2094$.currentBinding(var22);
        final SubLObject var26 = module0147.$g2095$.currentBinding(var22);
        try {
            module0147.$g2094$.bind(module0147.f9531(var24), var22);
            module0147.$g2095$.bind(module0147.f9534(var24), var22);
            if (module0305.NIL == var23) {
                SubLObject var27 = f20387(var2);
                SubLObject var28 = (SubLObject)module0305.NIL;
                var28 = var27.first();
                while (module0305.NIL == var23 && module0305.NIL != var27) {
                    if (module0305.NIL != module0178.f11361(var28, (SubLObject)module0305.UNPROVIDED) && module0305.NIL != module0147.f9508(var28)) {
                        var23 = (SubLObject)module0305.T;
                    }
                    var27 = var27.rest();
                    var28 = var27.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var26, var22);
            module0147.$g2094$.rebind(var25, var22);
        }
        return var23;
    }
    
    public static SubLObject f20523(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var3)) {
            return module0306.f20630(var2, (SubLObject)module0305.T);
        }
        return f20524(var2);
    }
    
    public static SubLObject f20524(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0305.NIL;
        if (module0305.NIL == var3) {
            SubLObject var4 = f20387(var2);
            SubLObject var5 = (SubLObject)module0305.NIL;
            var5 = var4.first();
            while (module0305.NIL == var3 && module0305.NIL != var4) {
                if (module0305.NIL != module0178.f11361(var5, (SubLObject)module0305.UNPROVIDED)) {
                    var3 = (SubLObject)module0305.T;
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        return var3;
    }
    
    public static SubLObject f20525(final SubLObject var3, final SubLObject var4) {
        return module0004.f104(var4, f20328(var3), Symbols.symbol_function((SubLObject)module0305.$ic144$), (SubLObject)module0305.UNPROVIDED);
    }
    
    public static SubLObject f20526(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != module0210.f13593(var2, (SubLObject)module0305.UNPROVIDED)) {
            return f20526(var20, module0205.f13330(var2), var21);
        }
        if (module0305.NIL != module0173.f10955(var2)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != module0259.f16975(var20, var2, var21, (SubLObject)module0305.UNPROVIDED) || module0305.NIL != f20349(var2, var20, var21));
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20527(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != module0210.f13593(var2, (SubLObject)module0305.UNPROVIDED)) {
            return f20527(var20, module0205.f13330(var2), var21);
        }
        if (module0305.NIL != module0173.f10955(var2)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != module0259.f16975(var20, var2, var21, (SubLObject)module0305.UNPROVIDED) || module0305.NIL != f20423(var2, var20, var21));
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20528(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != module0210.f13593(var2, (SubLObject)module0305.UNPROVIDED)) {
            return f20528(var20, module0205.f13330(var2), var21);
        }
        if (module0305.NIL != module0173.f10955(var2) && module0305.NIL != module0226.f14858(var2, var21)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == f20527(var20, var2, var21));
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20529(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != module0210.f13593(var2, (SubLObject)module0305.UNPROVIDED)) {
            return f20529(var20, module0205.f13330(var2), var21);
        }
        if (module0305.NIL != module0173.f10955(var2)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != f20354(var2, var20, var21) || module0305.NIL != module0259.f16980(var20, var2, var21, (SubLObject)module0305.UNPROVIDED));
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20530(final SubLObject var20, final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != module0210.f13593(var2, (SubLObject)module0305.UNPROVIDED)) {
            return f20529(var20, module0205.f13330(var2), var21);
        }
        if (module0305.NIL != module0173.f10955(var2)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != f20425(var2, var20, var21) || module0305.NIL != module0259.f16980(var20, var2, var21, (SubLObject)module0305.UNPROVIDED));
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20531(final SubLObject var404, final SubLObject var4) {
        final SubLThread var405 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var405)) {
            return module0306.f20703(var404, var4);
        }
        return f20532(var404, var4);
    }
    
    public static SubLObject f20533(final SubLObject var404, final SubLObject var4) {
        final SubLThread var405 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var405)) {
            return module0306.f20701(var404, var4);
        }
        return f20532(var404, var4);
    }
    
    public static SubLObject f20532(final SubLObject var404, final SubLObject var4) {
        final SubLThread var405 = SubLProcess.currentSubLThread();
        final SubLObject var406 = module0138.$g1628$.currentBinding(var405);
        final SubLObject var407 = module0138.$g1627$.currentBinding(var405);
        try {
            module0138.$g1628$.bind(var404, var405);
            module0138.$g1627$.bind(var4, var405);
            final SubLObject var408 = module0178.f11287(var4);
            final SubLObject var409 = module0178.f11334(var4);
            final SubLObject var410 = module0202.f12757(module0178.f11335(var4));
            if (module0305.NIL != module0018.$g574$.getDynamicValue(var405) && module0305.NIL != module0173.f10955(var409) && var410.isSymbol()) {
                f20534(var409, var4);
            }
            else {
                final SubLObject var23_449 = module0147.$g2094$.currentBinding(var405);
                final SubLObject var24_450 = module0147.$g2095$.currentBinding(var405);
                try {
                    module0147.$g2094$.bind((SubLObject)module0305.$ic147$, var405);
                    module0147.$g2095$.bind(var408, var405);
                    final SubLObject var411 = f20435(var410, var409);
                    final SubLObject var412 = module0173.f10955(var409);
                    if (module0305.NIL != var412 && module0305.NIL != var411) {
                        f20534(var409, var4);
                    }
                    else if (module0305.NIL == var412) {
                        f20468((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic182$, (SubLObject)module0305.$ic149$, var409, var408, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                    }
                    else if (module0305.NIL == var411) {
                        f20468((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic182$, (SubLObject)module0305.$ic150$, var410, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var24_450, var405);
                    module0147.$g2094$.rebind(var23_449, var405);
                }
            }
        }
        finally {
            module0138.$g1627$.rebind(var407, var405);
            module0138.$g1628$.rebind(var406, var405);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20535(final SubLObject var404, final SubLObject var4) {
        final SubLThread var405 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var405)) {
            return module0306.f20704(var404, var4);
        }
        return f20536(var404, var4);
    }
    
    public static SubLObject f20537(final SubLObject var404, final SubLObject var4) {
        final SubLThread var405 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var405)) {
            return module0306.f20702(var404, var4);
        }
        return f20536(var404, var4);
    }
    
    public static SubLObject f20536(final SubLObject var404, final SubLObject var4) {
        final SubLThread var405 = SubLProcess.currentSubLThread();
        final SubLObject var406 = module0138.$g1628$.currentBinding(var405);
        final SubLObject var407 = module0138.$g1627$.currentBinding(var405);
        try {
            module0138.$g1628$.bind(var404, var405);
            module0138.$g1627$.bind(var4, var405);
            final SubLObject var408 = module0178.f11287(var4);
            final SubLObject var409 = module0178.f11334(var4);
            final SubLObject var410 = module0202.f12757(module0178.f11335(var4));
            if (module0305.NIL != module0018.$g574$.getDynamicValue(var405) && module0305.NIL != module0173.f10955(var409) && var410.isSymbol()) {
                f20538(var409, var4);
            }
            else {
                final SubLObject var23_451 = module0147.$g2094$.currentBinding(var405);
                final SubLObject var24_452 = module0147.$g2095$.currentBinding(var405);
                try {
                    module0147.$g2094$.bind((SubLObject)module0305.$ic147$, var405);
                    module0147.$g2095$.bind(var408, var405);
                    final SubLObject var411 = f20435(var410, var409);
                    final SubLObject var412 = module0173.f10955(var409);
                    if (module0305.NIL != var412 && module0305.NIL != var411) {
                        f20538(var409, var4);
                    }
                    else if (module0305.NIL == var412) {
                        f20468((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic182$, (SubLObject)module0305.$ic149$, var409, var408, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                    }
                    else if (module0305.NIL == var411) {
                        f20468((SubLObject)module0305.ONE_INTEGER, (SubLObject)module0305.$ic182$, (SubLObject)module0305.$ic150$, var410, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var24_452, var405);
                    module0147.$g2094$.rebind(var23_451, var405);
                }
            }
        }
        finally {
            module0138.$g1627$.rebind(var407, var405);
            module0138.$g1628$.rebind(var406, var405);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20539() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2749$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2749$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2749$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2749$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2749$.getDynamicValue(var1), (SubLObject)module0305.$ic156$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2749$.getDynamicValue(var1), (SubLObject)module0305.$ic188$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20540(final SubLObject var3, final SubLObject var4) {
        f20541(var3, var4, (SubLObject)module0305.UNPROVIDED);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20534(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var5)) {
            SubLObject var6 = (SubLObject)module0305.NIL;
            SubLObject var7 = (SubLObject)module0305.NIL;
            final SubLObject var8 = Time.get_internal_real_time();
            var6 = f20540(var3, var4);
            var7 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var8), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2749$.getDynamicValue(var5), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2749$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2749$.getDynamicValue(var5), (SubLObject)ConsesLow.cons(var7, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2749$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2749$.getDynamicValue(var5), (SubLObject)ConsesLow.cons(var6, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2749$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2749$.getDynamicValue(var5), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var3, var4), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2749$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED)));
            return var6;
        }
        return f20540(var3, var4);
    }
    
    public static SubLObject f20542() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2750$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2750$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2750$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2750$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2750$.getDynamicValue(var1), (SubLObject)module0305.$ic156$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2750$.getDynamicValue(var1), (SubLObject)module0305.$ic191$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20543(final SubLObject var3, final SubLObject var4) {
        f20544(var3, var4, (SubLObject)module0305.UNPROVIDED);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20538(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var5)) {
            SubLObject var6 = (SubLObject)module0305.NIL;
            SubLObject var7 = (SubLObject)module0305.NIL;
            final SubLObject var8 = Time.get_internal_real_time();
            var6 = f20543(var3, var4);
            var7 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var8), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2750$.getDynamicValue(var5), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2750$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2750$.getDynamicValue(var5), (SubLObject)ConsesLow.cons(var7, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2750$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2750$.getDynamicValue(var5), (SubLObject)ConsesLow.cons(var6, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2750$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2750$.getDynamicValue(var5), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var3, var4), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2750$.getDynamicValue(var5), (SubLObject)module0305.UNPROVIDED)));
            return var6;
        }
        return f20543(var3, var4);
    }
    
    public static SubLObject f20541(final SubLObject var3, final SubLObject var4, SubLObject var411) {
        if (var411 == module0305.UNPROVIDED) {
            var411 = (SubLObject)module0305.T;
        }
        if (module0305.NIL != f20525(var3, var4)) {
            return (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != var411) {
            return f20545(var3, var4);
        }
        f20324((SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.$ic193$, var3, var4, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        return f20329(var3, var4);
    }
    
    public static SubLObject f20544(final SubLObject var3, final SubLObject var4, SubLObject var411) {
        if (var411 == module0305.UNPROVIDED) {
            var411 = (SubLObject)module0305.T;
        }
        if (module0305.NIL == f20525(var3, var4)) {
            f20408((SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.$ic194$, var4, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
            return (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != var411) {
            return f20546(var3, var4);
        }
        f20324((SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.$ic195$, var3, var4, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        return f20330(var3, var4);
    }
    
    public static SubLObject f20547(final SubLObject var412, final SubLObject var74) {
        final SubLThread var413 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var413)) {
            return module0306.f20714(var412, var74);
        }
        return f20548(var412, var74);
    }
    
    public static SubLObject f20549() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2751$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2751$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2751$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2751$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2751$.getDynamicValue(var1), (SubLObject)module0305.$ic165$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2751$.getDynamicValue(var1), (SubLObject)module0305.$ic197$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20550(final SubLObject var412, final SubLObject var74) {
        final SubLObject var413 = f20387(var412);
        if (module0305.NIL != var413) {
            f20551(var412, var413);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20548(final SubLObject var412, final SubLObject var74) {
        final SubLThread var413 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var413)) {
            SubLObject var414 = (SubLObject)module0305.NIL;
            SubLObject var415 = (SubLObject)module0305.NIL;
            final SubLObject var416 = Time.get_internal_real_time();
            var414 = f20550(var412, var74);
            var415 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var416), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2751$.getDynamicValue(var413), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2751$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2751$.getDynamicValue(var413), (SubLObject)ConsesLow.cons(var415, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2751$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2751$.getDynamicValue(var413), (SubLObject)ConsesLow.cons(var414, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2751$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2751$.getDynamicValue(var413), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var412, var74), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2751$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            return var414;
        }
        return f20550(var412, var74);
    }
    
    public static SubLObject f20552(final SubLObject var412, final SubLObject var74) {
        final SubLThread var413 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0305.$g2728$.getDynamicValue(var413)) {
            return module0306.f20722(var412, var74);
        }
        return f20553(var412, var74);
    }
    
    public static SubLObject f20554() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2752$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2752$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2752$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2752$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2752$.getDynamicValue(var1), (SubLObject)module0305.$ic165$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2752$.getDynamicValue(var1), (SubLObject)module0305.$ic200$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20555(final SubLObject var412, final SubLObject var74) {
        final SubLThread var413 = SubLProcess.currentSubLThread();
        final SubLObject var414 = module0147.$g2094$.currentBinding(var413);
        final SubLObject var415 = module0147.$g2095$.currentBinding(var413);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var413);
            module0147.$g2095$.bind(module0305.$ic107$, var413);
            if (module0305.NIL == module0256.f16576(var412, var74, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
                final SubLObject var416 = f20387(var412);
                if (module0305.NIL != var416) {
                    final SubLObject var417 = module0139.f9008();
                    final SubLObject var23_453 = module0139.$g1630$.currentBinding(var413);
                    final SubLObject var24_454 = module0139.$g1659$.currentBinding(var413);
                    try {
                        module0139.$g1630$.bind((SubLObject)module0305.NIL, var413);
                        module0139.$g1659$.bind(module0139.f9007(), var413);
                        final SubLObject var23_454 = module0144.$g1856$.currentBinding(var413);
                        final SubLObject var24_455 = module0139.$g1630$.currentBinding(var413);
                        try {
                            module0144.$g1856$.bind(module0139.$g1659$.getDynamicValue(var413), var413);
                            module0139.$g1630$.bind(var417, var413);
                            module0251.f16232(module0137.f8955(module0305.$ic45$), var412, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                            f20556(var74, var416);
                        }
                        finally {
                            module0139.$g1630$.rebind(var24_455, var413);
                            module0144.$g1856$.rebind(var23_454, var413);
                        }
                        module0139.f9011(module0139.$g1659$.getDynamicValue(var413));
                    }
                    finally {
                        module0139.$g1659$.rebind(var24_454, var413);
                        module0139.$g1630$.rebind(var23_453, var413);
                    }
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var415, var413);
            module0147.$g2094$.rebind(var414, var413);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20553(final SubLObject var412, final SubLObject var74) {
        final SubLThread var413 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var413)) {
            SubLObject var414 = (SubLObject)module0305.NIL;
            SubLObject var415 = (SubLObject)module0305.NIL;
            final SubLObject var416 = Time.get_internal_real_time();
            var414 = f20555(var412, var74);
            var415 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var416), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2752$.getDynamicValue(var413), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2752$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2752$.getDynamicValue(var413), (SubLObject)ConsesLow.cons(var415, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2752$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2752$.getDynamicValue(var413), (SubLObject)ConsesLow.cons(var414, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2752$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2752$.getDynamicValue(var413), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var412, var74), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2752$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            return var414;
        }
        return f20555(var412, var74);
    }
    
    public static SubLObject f20545(final SubLObject var2, final SubLObject var418) {
        final SubLThread var419 = SubLProcess.currentSubLThread();
        final SubLObject var420 = module0147.$g2094$.currentBinding(var419);
        final SubLObject var421 = module0147.$g2095$.currentBinding(var419);
        final SubLObject var422 = module0144.$g1871$.currentBinding(var419);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var419);
            module0147.$g2095$.bind(module0305.$ic107$, var419);
            module0144.$g1871$.bind(var418, var419);
            module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic202$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        }
        finally {
            module0144.$g1871$.rebind(var422, var419);
            module0147.$g2095$.rebind(var421, var419);
            module0147.$g2094$.rebind(var420, var419);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20546(final SubLObject var2, final SubLObject var418) {
        final SubLThread var419 = SubLProcess.currentSubLThread();
        final SubLObject var420 = module0147.$g2094$.currentBinding(var419);
        final SubLObject var421 = module0147.$g2095$.currentBinding(var419);
        final SubLObject var422 = module0144.$g1871$.currentBinding(var419);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var419);
            module0147.$g2095$.bind(module0305.$ic107$, var419);
            module0144.$g1871$.bind(var418, var419);
            module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic203$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        }
        finally {
            module0144.$g1871$.rebind(var422, var419);
            module0147.$g2095$.rebind(var421, var419);
            module0147.$g2094$.rebind(var420, var419);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20551(final SubLObject var2, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0147.$g2094$.currentBinding(var7);
        final SubLObject var9 = module0147.$g2095$.currentBinding(var7);
        final SubLObject var10 = module0144.$g1872$.currentBinding(var7);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var7);
            module0147.$g2095$.bind(module0305.$ic107$, var7);
            module0144.$g1872$.bind(var6, var7);
            module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic204$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        }
        finally {
            module0144.$g1872$.rebind(var10, var7);
            module0147.$g2095$.rebind(var9, var7);
            module0147.$g2094$.rebind(var8, var7);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20556(final SubLObject var2, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0147.$g2094$.currentBinding(var7);
        final SubLObject var9 = module0147.$g2095$.currentBinding(var7);
        final SubLObject var10 = module0144.$g1872$.currentBinding(var7);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var7);
            module0147.$g2095$.bind(module0305.$ic107$, var7);
            module0144.$g1872$.bind(var6, var7);
            module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic205$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        }
        finally {
            module0144.$g1872$.rebind(var10, var7);
            module0147.$g2095$.rebind(var9, var7);
            module0147.$g2094$.rebind(var8, var7);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20557(final SubLObject var2, SubLObject var418) {
        if (var418 == module0305.UNPROVIDED) {
            var418 = module0144.$g1871$.getDynamicValue();
        }
        return f20541(var2, var418, (SubLObject)module0305.NIL);
    }
    
    public static SubLObject f20558(final SubLObject var2, SubLObject var418) {
        if (var418 == module0305.UNPROVIDED) {
            var418 = module0144.$g1871$.getDynamicValue();
        }
        return f20544(var2, var418, (SubLObject)module0305.NIL);
    }
    
    public static SubLObject f20559(final SubLObject var2, SubLObject var6) {
        if (var6 == module0305.UNPROVIDED) {
            var6 = module0144.$g1872$.getDynamicValue();
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0144.$g1863$.getDynamicValue(var7).numGE((SubLObject)module0305.FIVE_INTEGER)) {
            SubLObject var8 = var6;
            SubLObject var9 = (SubLObject)module0305.NIL;
            var9 = var8.first();
            while (module0305.NIL != var8) {
                f20324((SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.$ic162$, var2, var9, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        return f20331(var2, var6);
    }
    
    public static SubLObject f20560(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)module0305.NIL;
        SubLObject var5 = (SubLObject)module0305.$ic206$;
        SubLObject var6 = (SubLObject)module0305.NIL;
        var6 = var5.first();
        while (module0305.NIL != var5) {
            final SubLObject var7 = module0147.$g2094$.currentBinding(var3);
            final SubLObject var8 = module0147.$g2095$.currentBinding(var3);
            try {
                module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var3);
                module0147.$g2095$.bind(module0305.$ic107$, var3);
                final SubLObject var9 = var6;
                if (module0305.NIL != module0158.f10038(var9)) {
                    final SubLObject var10 = (SubLObject)module0305.NIL;
                    final SubLObject var23_457 = module0012.$g73$.currentBinding(var3);
                    final SubLObject var24_458 = module0012.$g65$.currentBinding(var3);
                    final SubLObject var11 = module0012.$g67$.currentBinding(var3);
                    final SubLObject var12 = module0012.$g68$.currentBinding(var3);
                    final SubLObject var13 = module0012.$g66$.currentBinding(var3);
                    final SubLObject var14 = module0012.$g69$.currentBinding(var3);
                    final SubLObject var15 = module0012.$g70$.currentBinding(var3);
                    final SubLObject var16 = module0012.$silent_progressP$.currentBinding(var3);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var3);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                        module0012.$g67$.bind((SubLObject)module0305.ONE_INTEGER, var3);
                        module0012.$g68$.bind((SubLObject)module0305.ZERO_INTEGER, var3);
                        module0012.$g66$.bind((SubLObject)module0305.ZERO_INTEGER, var3);
                        module0012.$g69$.bind((SubLObject)module0305.ZERO_INTEGER, var3);
                        module0012.$g70$.bind((SubLObject)module0305.T, var3);
                        module0012.$silent_progressP$.bind((SubLObject)((module0305.NIL != var10) ? module0012.$silent_progressP$.getDynamicValue(var3) : module0305.T), var3);
                        module0012.f474(var10);
                        final SubLObject var17 = module0158.f10039(var9);
                        SubLObject var18 = var4;
                        final SubLObject var19 = (SubLObject)module0305.NIL;
                        while (module0305.NIL == var18) {
                            final SubLObject var20 = module0052.f3695(var17, var19);
                            final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(!var19.eql(var20));
                            if (module0305.NIL != var21) {
                                module0012.f476();
                                SubLObject var22 = (SubLObject)module0305.NIL;
                                try {
                                    var22 = module0158.f10316(var20, (SubLObject)module0305.$ic50$, (SubLObject)module0305.$ic21$, (SubLObject)module0305.NIL);
                                    SubLObject var109_459 = var4;
                                    final SubLObject var110_460 = (SubLObject)module0305.NIL;
                                    while (module0305.NIL == var109_459) {
                                        final SubLObject var23 = module0052.f3695(var22, var110_460);
                                        final SubLObject var112_461 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_460.eql(var23));
                                        if (module0305.NIL != var112_461) {
                                            final SubLObject var24 = module0178.f11334(var23);
                                            if (module0305.NIL != module0256.f16576(var24, var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
                                                f20534(var2, var23);
                                            }
                                        }
                                        var109_459 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var112_461 || module0305.NIL != var4);
                                    }
                                }
                                finally {
                                    final SubLObject var23_458 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var3);
                                        if (module0305.NIL != var22) {
                                            module0158.f10319(var22);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var23_458, var3);
                                    }
                                }
                            }
                            var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var21 || module0305.NIL != var4);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var16, var3);
                        module0012.$g70$.rebind(var15, var3);
                        module0012.$g69$.rebind(var14, var3);
                        module0012.$g66$.rebind(var13, var3);
                        module0012.$g68$.rebind(var12, var3);
                        module0012.$g67$.rebind(var11, var3);
                        module0012.$g65$.rebind(var24_458, var3);
                        module0012.$g73$.rebind(var23_457, var3);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var8, var3);
                module0147.$g2094$.rebind(var7, var3);
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20561(SubLObject var436, SubLObject var437) {
        if (var436 == module0305.UNPROVIDED) {
            var436 = (SubLObject)module0305.T;
        }
        if (var437 == module0305.UNPROVIDED) {
            var437 = (SubLObject)module0305.NIL;
        }
        final SubLThread var438 = SubLProcess.currentSubLThread();
        final SubLObject var439 = module0144.$g1797$.currentBinding(var438);
        final SubLObject var440 = module0144.$g1860$.currentBinding(var438);
        try {
            module0144.$g1797$.bind((SubLObject)((module0305.NIL != var437) ? module0305.FIVE_INTEGER : module0144.$g1797$.getDynamicValue(var438)), var438);
            module0144.$g1860$.bind((SubLObject)module0305.NIL, var438);
            final SubLObject var441 = (SubLObject)module0305.NIL;
            if (module0305.NIL != var436) {
                f20333();
            }
            SubLObject var442 = (SubLObject)module0305.$ic206$;
            SubLObject var443 = (SubLObject)module0305.NIL;
            var443 = var442.first();
            while (module0305.NIL != var442) {
                final SubLObject var23_463 = module0147.$g2094$.currentBinding(var438);
                final SubLObject var24_464 = module0147.$g2095$.currentBinding(var438);
                try {
                    module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var438);
                    module0147.$g2095$.bind(module0305.$ic107$, var438);
                    final SubLObject var444 = module0139.$g1630$.getDynamicValue(var438);
                    final SubLObject var23_464 = module0139.$g1631$.currentBinding(var438);
                    final SubLObject var24_465 = module0139.$g1632$.currentBinding(var438);
                    final SubLObject var445 = module0139.$g1630$.currentBinding(var438);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var444, (SubLObject)module0305.SIX_INTEGER), var438);
                        module0139.$g1632$.bind(module0139.f9016(var444), var438);
                        module0139.$g1630$.bind((SubLObject)module0305.T, var438);
                        final SubLObject var446 = var443;
                        if (module0305.NIL != module0158.f10038(var446)) {
                            final SubLObject var447 = (SubLObject)module0305.NIL;
                            final SubLObject var23_465 = module0012.$g73$.currentBinding(var438);
                            final SubLObject var24_466 = module0012.$g65$.currentBinding(var438);
                            final SubLObject var25_469 = module0012.$g67$.currentBinding(var438);
                            final SubLObject var448 = module0012.$g68$.currentBinding(var438);
                            final SubLObject var449 = module0012.$g66$.currentBinding(var438);
                            final SubLObject var450 = module0012.$g69$.currentBinding(var438);
                            final SubLObject var451 = module0012.$g70$.currentBinding(var438);
                            final SubLObject var452 = module0012.$silent_progressP$.currentBinding(var438);
                            try {
                                module0012.$g73$.bind(Time.get_universal_time(), var438);
                                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var438), var438);
                                module0012.$g67$.bind((SubLObject)module0305.ONE_INTEGER, var438);
                                module0012.$g68$.bind((SubLObject)module0305.ZERO_INTEGER, var438);
                                module0012.$g66$.bind((SubLObject)module0305.ZERO_INTEGER, var438);
                                module0012.$g69$.bind((SubLObject)module0305.ZERO_INTEGER, var438);
                                module0012.$g70$.bind((SubLObject)module0305.T, var438);
                                module0012.$silent_progressP$.bind((SubLObject)((module0305.NIL != var447) ? module0012.$silent_progressP$.getDynamicValue(var438) : module0305.T), var438);
                                module0012.f474(var447);
                                final SubLObject var453 = module0158.f10039(var446);
                                SubLObject var454 = var441;
                                final SubLObject var455 = (SubLObject)module0305.NIL;
                                while (module0305.NIL == var454) {
                                    final SubLObject var456 = module0052.f3695(var453, var455);
                                    final SubLObject var457 = (SubLObject)SubLObjectFactory.makeBoolean(!var455.eql(var456));
                                    if (module0305.NIL != var457) {
                                        module0012.f476();
                                        SubLObject var458 = (SubLObject)module0305.NIL;
                                        try {
                                            var458 = module0158.f10316(var456, (SubLObject)module0305.$ic50$, (SubLObject)module0305.$ic21$, (SubLObject)module0305.NIL);
                                            SubLObject var109_470 = var441;
                                            final SubLObject var110_471 = (SubLObject)module0305.NIL;
                                            while (module0305.NIL == var109_470) {
                                                final SubLObject var459 = module0052.f3695(var458, var110_471);
                                                final SubLObject var112_472 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_471.eql(var459));
                                                if (module0305.NIL != var112_472) {
                                                    final SubLObject var460 = module0178.f11334(var459);
                                                    f20534(var460, var459);
                                                }
                                                var109_470 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var112_472 || module0305.NIL != var441);
                                            }
                                        }
                                        finally {
                                            final SubLObject var23_466 = Threads.$is_thread_performing_cleanupP$.currentBinding(var438);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var438);
                                                if (module0305.NIL != var458) {
                                                    module0158.f10319(var458);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var23_466, var438);
                                            }
                                        }
                                    }
                                    var454 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var457 || module0305.NIL != var441);
                                }
                                module0012.f475();
                            }
                            finally {
                                module0012.$silent_progressP$.rebind(var452, var438);
                                module0012.$g70$.rebind(var451, var438);
                                module0012.$g69$.rebind(var450, var438);
                                module0012.$g66$.rebind(var449, var438);
                                module0012.$g68$.rebind(var448, var438);
                                module0012.$g67$.rebind(var25_469, var438);
                                module0012.$g65$.rebind(var24_466, var438);
                                module0012.$g73$.rebind(var23_465, var438);
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var445, var438);
                        module0139.$g1632$.rebind(var24_465, var438);
                        module0139.$g1631$.rebind(var23_464, var438);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var24_464, var438);
                    module0147.$g2094$.rebind(var23_463, var438);
                }
                var442 = var442.rest();
                var443 = var442.first();
            }
        }
        finally {
            module0144.$g1860$.rebind(var440, var438);
            module0144.$g1797$.rebind(var439, var438);
        }
        if (module0305.NIL != module0144.$g1860$.getDynamicValue(var438)) {
            f20334();
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20562() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)module0305.$ic207$;
        final SubLObject var3 = module0012.$g73$.currentBinding(var1);
        final SubLObject var4 = module0012.$g65$.currentBinding(var1);
        final SubLObject var5 = module0012.$g67$.currentBinding(var1);
        final SubLObject var6 = module0012.$g68$.currentBinding(var1);
        final SubLObject var7 = module0012.$g66$.currentBinding(var1);
        final SubLObject var8 = module0012.$g69$.currentBinding(var1);
        final SubLObject var9 = module0012.$g70$.currentBinding(var1);
        final SubLObject var10 = module0012.$silent_progressP$.currentBinding(var1);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var1);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var1), var1);
            module0012.$g67$.bind((SubLObject)module0305.ONE_INTEGER, var1);
            module0012.$g68$.bind((SubLObject)module0305.ZERO_INTEGER, var1);
            module0012.$g66$.bind((SubLObject)module0305.ZERO_INTEGER, var1);
            module0012.$g69$.bind((SubLObject)module0305.ZERO_INTEGER, var1);
            module0012.$g70$.bind((SubLObject)module0305.T, var1);
            module0012.$silent_progressP$.bind((SubLObject)((module0305.NIL != var2) ? module0012.$silent_progressP$.getDynamicValue(var1) : module0305.T), var1);
            module0012.f474(var2);
            f20561((SubLObject)module0305.T, (SubLObject)module0305.UNPROVIDED);
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var10, var1);
            module0012.$g70$.rebind(var9, var1);
            module0012.$g69$.rebind(var8, var1);
            module0012.$g66$.rebind(var7, var1);
            module0012.$g68$.rebind(var6, var1);
            module0012.$g67$.rebind(var5, var1);
            module0012.$g65$.rebind(var4, var1);
            module0012.$g73$.rebind(var3, var1);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20563(final SubLObject var474) {
        final SubLThread var475 = SubLProcess.currentSubLThread();
        if (var474.eql((SubLObject)module0305.$ic108$)) {
            return module0144.$g1873$.getDynamicValue(var475);
        }
        if (var474.eql((SubLObject)module0305.$ic208$)) {
            return module0144.$g1874$.getDynamicValue(var475);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20564(final SubLObject var2, final SubLObject var474) {
        return Hashtables.gethash(var2, f20563(var474), (SubLObject)module0305.UNPROVIDED);
    }
    
    public static SubLObject f20565(final SubLObject var2, final SubLObject var7, final SubLObject var474) {
        Hashtables.sethash(var2, f20563(var474), var7);
        return var7;
    }
    
    public static SubLObject f20566(final SubLObject var2, final SubLObject var474) {
        Hashtables.remhash(var2, f20563(var474));
        return var2;
    }
    
    public static SubLObject f20567(final SubLObject var2, final SubLObject var474) {
        if (module0305.NIL != module0173.f10955(var2)) {
            f20564(var2, var474);
        }
        else if (module0305.NIL != module0155.f9779(var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
            return f20567(module0172.f10921(var2), var474);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20568(final SubLObject var2, final SubLObject var256, final SubLObject var474) {
        SubLObject var475 = (SubLObject)module0305.NIL;
        if (module0305.NIL == var475) {
            SubLObject var476 = f20567(var2, var474);
            SubLObject var477 = (SubLObject)module0305.NIL;
            var477 = var476.first();
            while (module0305.NIL == var475 && module0305.NIL != var476) {
                if (module0305.NIL != module0178.f11361(var477, (SubLObject)module0305.UNPROVIDED)) {
                    var475 = Equality.eql(var256, module0178.f11334(var477));
                }
                var476 = var476.rest();
                var477 = var476.first();
            }
        }
        return var475;
    }
    
    public static SubLObject f20569(final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        return f20570(var2, var21, (SubLObject)module0305.$ic108$);
    }
    
    public static SubLObject f20571(final SubLObject var2, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        return f20570(var2, var21, (SubLObject)module0305.$ic208$);
    }
    
    public static SubLObject f20570(final SubLObject var2, final SubLObject var21, final SubLObject var474) {
        final SubLThread var475 = SubLProcess.currentSubLThread();
        SubLObject var476 = (SubLObject)module0305.NIL;
        final SubLObject var477 = module0147.$g2094$.currentBinding(var475);
        final SubLObject var478 = module0147.$g2095$.currentBinding(var475);
        try {
            module0147.$g2094$.bind(module0147.f9531(var21), var475);
            module0147.$g2095$.bind(module0147.f9534(var21), var475);
            if (module0305.NIL == var476) {
                SubLObject var479 = f20567(var2, var474);
                SubLObject var480 = (SubLObject)module0305.NIL;
                var480 = var479.first();
                while (module0305.NIL == var476 && module0305.NIL != var479) {
                    if (module0305.NIL != module0178.f11361(var480, (SubLObject)module0305.UNPROVIDED) && module0305.NIL != module0147.f9508(var480) && module0305.NIL != module0256.f16576(module0178.f11335(var480), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
                        var476 = (SubLObject)module0305.T;
                    }
                    var479 = var479.rest();
                    var480 = var479.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var478, var475);
            module0147.$g2094$.rebind(var477, var475);
        }
        return var476;
    }
    
    public static SubLObject f20572(final SubLObject var2, final SubLObject var474, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var475 = SubLProcess.currentSubLThread();
        SubLObject var476 = (SubLObject)module0305.NIL;
        final SubLObject var477 = var21;
        final SubLObject var478 = module0147.$g2094$.currentBinding(var475);
        final SubLObject var479 = module0147.$g2095$.currentBinding(var475);
        try {
            module0147.$g2094$.bind(module0147.f9531(var477), var475);
            module0147.$g2095$.bind(module0147.f9534(var477), var475);
            if (module0305.NIL == var476) {
                SubLObject var480 = f20567(var2, var474);
                SubLObject var481 = (SubLObject)module0305.NIL;
                var481 = var480.first();
                while (module0305.NIL == var476 && module0305.NIL != var480) {
                    if (module0305.NIL != module0178.f11361(var481, (SubLObject)module0305.UNPROVIDED) && module0305.NIL != module0147.f9508(var481) && module0305.NIL != module0256.f16576(module0178.f11335(var481), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
                        var476 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == module0279.f18533(module0178.f11334(var481), (SubLObject)module0305.UNPROVIDED));
                    }
                    var480 = var480.rest();
                    var481 = var480.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var479, var475);
            module0147.$g2094$.rebind(var478, var475);
        }
        return var476;
    }
    
    public static SubLObject f20573(final SubLObject var3, final SubLObject var4, final SubLObject var474) {
        return module0004.f104(var4, f20564(var3, var474), Symbols.symbol_function((SubLObject)module0305.$ic144$), (SubLObject)module0305.UNPROVIDED);
    }
    
    public static SubLObject f20574(final SubLObject var475, final SubLObject var474, SubLObject var21) {
        if (var21 == module0305.UNPROVIDED) {
            var21 = (SubLObject)module0305.NIL;
        }
        final SubLThread var476 = SubLProcess.currentSubLThread();
        SubLObject var477 = (SubLObject)module0305.NIL;
        final SubLObject var478 = var21;
        final SubLObject var479 = module0147.$g2094$.currentBinding(var476);
        final SubLObject var480 = module0147.$g2095$.currentBinding(var476);
        try {
            module0147.$g2094$.bind(module0147.f9531(var478), var476);
            module0147.$g2095$.bind(module0147.f9534(var478), var476);
            final SubLObject var481 = f20563(var474);
            SubLObject var482 = (SubLObject)module0305.NIL;
            SubLObject var483 = (SubLObject)module0305.NIL;
            final Iterator var484 = Hashtables.getEntrySetIterator(var481);
            try {
                while (Hashtables.iteratorHasNext(var484)) {
                    final Map.Entry var485 = Hashtables.iteratorNextEntry(var484);
                    var482 = Hashtables.getEntryKey(var485);
                    var483 = Hashtables.getEntryValue(var485);
                    SubLObject var486 = (SubLObject)module0305.NIL;
                    if (module0305.NIL == var486) {
                        SubLObject var487 = var483;
                        SubLObject var488 = (SubLObject)module0305.NIL;
                        var488 = var487.first();
                        while (module0305.NIL == var486 && module0305.NIL != var487) {
                            if (module0305.NIL != module0178.f11361(var488, (SubLObject)module0305.UNPROVIDED)) {
                                var486 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != module0147.f9508(var488) && var475.eql(module0178.f11334(var488)));
                            }
                            var487 = var487.rest();
                            var488 = var487.first();
                        }
                    }
                    if (module0305.NIL != var486) {
                        var477 = (SubLObject)ConsesLow.cons(var482, var477);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var484);
            }
        }
        finally {
            module0147.$g2095$.rebind(var480, var476);
            module0147.$g2094$.rebind(var479, var476);
        }
        return module0256.f16529(var477, var21, (SubLObject)module0305.UNPROVIDED);
    }
    
    public static SubLObject f20575(final SubLObject var404, final SubLObject var4) {
        return f20576(var404, var4, (SubLObject)module0305.$ic108$);
    }
    
    public static SubLObject f20577(final SubLObject var404, final SubLObject var4) {
        return f20578(var404, var4, (SubLObject)module0305.$ic108$);
    }
    
    public static SubLObject f20579(final SubLObject var404, final SubLObject var4) {
        return f20576(var404, var4, (SubLObject)module0305.$ic208$);
    }
    
    public static SubLObject f20580(final SubLObject var404, final SubLObject var4) {
        return f20578(var404, var4, (SubLObject)module0305.$ic208$);
    }
    
    public static SubLObject f20576(final SubLObject var404, final SubLObject var4, final SubLObject var474) {
        final SubLThread var475 = SubLProcess.currentSubLThread();
        final SubLObject var476 = module0138.$g1628$.currentBinding(var475);
        final SubLObject var477 = module0138.$g1627$.currentBinding(var475);
        try {
            module0138.$g1628$.bind(var404, var475);
            module0138.$g1627$.bind(var4, var475);
            final SubLObject var478 = module0178.f11287(var4);
            final SubLObject var479 = module0178.f11335(var4);
            final SubLObject var480 = module0178.f11334(var4);
            if (module0305.NIL != module0018.$g574$.getDynamicValue(var475) && module0305.NIL != module0173.f10955(var479) && module0305.NIL != module0173.f10955(var480)) {
                f20581(var479, var4, var474);
            }
            else {
                final SubLObject var23_476 = module0147.$g2094$.currentBinding(var475);
                final SubLObject var24_477 = module0147.$g2095$.currentBinding(var475);
                try {
                    module0147.$g2094$.bind((SubLObject)module0305.$ic147$, var475);
                    module0147.$g2095$.bind(var478, var475);
                    final SubLObject var481 = module0173.f10955(var479);
                    final SubLObject var482 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != module0269.f17725(var480) || module0305.NIL != module0303.f20137(var480));
                    if (var474 == module0305.$ic208$ && module0305.NIL != module0211.f13650(var4, module0305.$ic213$) && module0305.NIL == module0269.f17770(var480)) {
                        f20468((SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic214$, (SubLObject)module0305.$ic215$, var480, var478, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                    }
                    else if (module0305.NIL != var481 && module0305.NIL != var482) {
                        f20581(var479, var4, var474);
                    }
                    else if (module0305.NIL == var481) {
                        f20468((SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic214$, (SubLObject)module0305.$ic149$, var479, var478, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                        if (module0305.NIL != module0173.f10955(var479)) {
                            f20581(var479, var4, var474);
                        }
                    }
                    else if (module0305.NIL == var482) {
                        f20468((SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic214$, (SubLObject)module0305.$ic216$, var480, var478, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                        f20581(var479, var4, var474);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var24_477, var475);
                    module0147.$g2094$.rebind(var23_476, var475);
                }
            }
        }
        finally {
            module0138.$g1627$.rebind(var477, var475);
            module0138.$g1628$.rebind(var476, var475);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20578(final SubLObject var404, final SubLObject var4, final SubLObject var474) {
        final SubLThread var475 = SubLProcess.currentSubLThread();
        final SubLObject var476 = module0138.$g1628$.currentBinding(var475);
        final SubLObject var477 = module0138.$g1627$.currentBinding(var475);
        try {
            module0138.$g1628$.bind(var404, var475);
            module0138.$g1627$.bind(var4, var475);
            final SubLObject var478 = module0178.f11287(var4);
            final SubLObject var479 = module0178.f11335(var4);
            final SubLObject var480 = module0178.f11334(var4);
            if (module0305.NIL != module0018.$g574$.getDynamicValue(var475) && module0305.NIL != module0173.f10955(var479) && module0305.NIL != module0173.f10955(var480)) {
                f20582(var479, var4, var474);
            }
            else {
                final SubLObject var23_479 = module0147.$g2094$.currentBinding(var475);
                final SubLObject var24_480 = module0147.$g2095$.currentBinding(var475);
                try {
                    module0147.$g2094$.bind((SubLObject)module0305.$ic147$, var475);
                    module0147.$g2095$.bind(var478, var475);
                    final SubLObject var481 = module0173.f10955(var479);
                    final SubLObject var482 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL != module0269.f17725(var480) || module0305.NIL != module0303.f20137(var480));
                    if (module0305.NIL != var481 && module0305.NIL != var482) {
                        f20582(var479, var4, var474);
                    }
                    else if (module0305.NIL == var481) {
                        f20468((SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic214$, (SubLObject)module0305.$ic149$, var479, var478, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                        if (module0305.NIL != f20573(var479, var4, var474)) {
                            f20582(var479, var4, var474);
                        }
                    }
                    else if (module0305.NIL == var482) {
                        f20468((SubLObject)module0305.TWO_INTEGER, (SubLObject)module0305.$ic214$, (SubLObject)module0305.$ic216$, var480, var478, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                        if (module0305.NIL != f20573(var479, var4, var474)) {
                            f20582(var479, var4, var474);
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var24_480, var475);
                    module0147.$g2094$.rebind(var23_479, var475);
                }
            }
        }
        finally {
            module0138.$g1627$.rebind(var477, var475);
            module0138.$g1628$.rebind(var476, var475);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20583() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2753$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2753$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2753$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2753$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2753$.getDynamicValue(var1), (SubLObject)module0305.$ic220$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2753$.getDynamicValue(var1), (SubLObject)module0305.$ic221$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20584(final SubLObject var3, final SubLObject var4, final SubLObject var474) {
        f20585(var3, var4, var474, (SubLObject)module0305.UNPROVIDED);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20581(final SubLObject var3, final SubLObject var4, final SubLObject var474) {
        final SubLThread var475 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var475)) {
            SubLObject var476 = (SubLObject)module0305.NIL;
            SubLObject var477 = (SubLObject)module0305.NIL;
            final SubLObject var478 = Time.get_internal_real_time();
            var476 = f20584(var3, var4, var474);
            var477 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var478), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2753$.getDynamicValue(var475), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2753$.getDynamicValue(var475), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2753$.getDynamicValue(var475), (SubLObject)ConsesLow.cons(var477, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2753$.getDynamicValue(var475), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2753$.getDynamicValue(var475), (SubLObject)ConsesLow.cons(var476, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2753$.getDynamicValue(var475), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2753$.getDynamicValue(var475), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var3, var4, var474), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2753$.getDynamicValue(var475), (SubLObject)module0305.UNPROVIDED)));
            return var476;
        }
        return f20584(var3, var4, var474);
    }
    
    public static SubLObject f20586() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2754$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2754$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2754$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2754$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2754$.getDynamicValue(var1), (SubLObject)module0305.$ic220$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2754$.getDynamicValue(var1), (SubLObject)module0305.$ic224$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20587(final SubLObject var3, final SubLObject var4, final SubLObject var474) {
        f20588(var3, var4, var474, (SubLObject)module0305.UNPROVIDED);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20582(final SubLObject var3, final SubLObject var4, final SubLObject var474) {
        final SubLThread var475 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var475)) {
            SubLObject var476 = (SubLObject)module0305.NIL;
            SubLObject var477 = (SubLObject)module0305.NIL;
            final SubLObject var478 = Time.get_internal_real_time();
            var476 = f20587(var3, var4, var474);
            var477 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var478), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2754$.getDynamicValue(var475), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2754$.getDynamicValue(var475), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2754$.getDynamicValue(var475), (SubLObject)ConsesLow.cons(var477, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2754$.getDynamicValue(var475), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2754$.getDynamicValue(var475), (SubLObject)ConsesLow.cons(var476, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2754$.getDynamicValue(var475), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2754$.getDynamicValue(var475), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var3, var4, var474), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2754$.getDynamicValue(var475), (SubLObject)module0305.UNPROVIDED)));
            return var476;
        }
        return f20587(var3, var4, var474);
    }
    
    public static SubLObject f20585(final SubLObject var3, final SubLObject var4, final SubLObject var474, SubLObject var411) {
        if (var411 == module0305.UNPROVIDED) {
            var411 = (SubLObject)module0305.T;
        }
        if (module0305.NIL != f20573(var3, var4, var474)) {
            return (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != var411) {
            return f20589(var3, var4, var474);
        }
        f20324((SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.$ic226$, (SubLObject)((var474 == module0305.$ic108$) ? module0305.$ic227$ : module0305.$ic228$), var3, var4, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        final SubLObject var475 = f20590((SubLObject)ConsesLow.cons(var4, f20564(var3, var474)));
        if (module0305.NIL != var475) {
            f20565(var3, var475, var474);
        }
        return var475;
    }
    
    public static SubLObject f20588(final SubLObject var3, final SubLObject var4, final SubLObject var474, SubLObject var411) {
        if (var411 == module0305.UNPROVIDED) {
            var411 = (SubLObject)module0305.T;
        }
        if (module0305.NIL == f20573(var3, var4, var474)) {
            f20408((SubLObject)module0305.THREE_INTEGER, (SubLObject)module0305.$ic229$, var4, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
            return (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != var411) {
            return f20591(var3, var4, var474);
        }
        f20324((SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.$ic226$, (SubLObject)((var474 == module0305.$ic108$) ? module0305.$ic230$ : module0305.$ic231$), var3, var4, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        final SubLObject var475 = f20590(Sequences.delete(var4, f20564(var3, var474), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        if (module0305.NIL != var475) {
            f20565(var3, var475, var474);
        }
        else {
            f20566(var3, var474);
        }
        return var475;
    }
    
    public static SubLObject f20592() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2755$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2755$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2755$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2755$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2755$.getDynamicValue(var1), (SubLObject)module0305.$ic165$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2755$.getDynamicValue(var1), (SubLObject)module0305.$ic233$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20593(final SubLObject var412, final SubLObject var74) {
        SubLObject var413 = (SubLObject)module0305.$ic235$;
        SubLObject var414 = (SubLObject)module0305.NIL;
        var414 = var413.first();
        while (module0305.NIL != var413) {
            final SubLObject var415 = f20567(var412, var414);
            if (module0305.NIL != var415) {
                f20594(var412, var415, var414);
            }
            var413 = var413.rest();
            var414 = var413.first();
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20595(final SubLObject var412, final SubLObject var74) {
        final SubLThread var413 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var413)) {
            SubLObject var414 = (SubLObject)module0305.NIL;
            SubLObject var415 = (SubLObject)module0305.NIL;
            final SubLObject var416 = Time.get_internal_real_time();
            var414 = f20593(var412, var74);
            var415 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var416), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2755$.getDynamicValue(var413), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2755$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2755$.getDynamicValue(var413), (SubLObject)ConsesLow.cons(var415, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2755$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2755$.getDynamicValue(var413), (SubLObject)ConsesLow.cons(var414, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2755$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2755$.getDynamicValue(var413), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var412, var74), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2755$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            return var414;
        }
        return f20593(var412, var74);
    }
    
    public static SubLObject f20596() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2756$.getDynamicValue(var1), (SubLObject)module0305.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2756$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2756$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2756$.getDynamicValue(var1), (SubLObject)module0305.NIL);
        Hashtables.sethash((SubLObject)module0305.$ic8$, module0305.$g2756$.getDynamicValue(var1), (SubLObject)module0305.$ic165$);
        Hashtables.sethash((SubLObject)module0305.$ic10$, module0305.$g2756$.getDynamicValue(var1), (SubLObject)module0305.$ic237$);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20597(final SubLObject var412, final SubLObject var74) {
        final SubLThread var413 = SubLProcess.currentSubLThread();
        final SubLObject var414 = module0147.$g2094$.currentBinding(var413);
        final SubLObject var415 = module0147.$g2095$.currentBinding(var413);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var413);
            module0147.$g2095$.bind(module0305.$ic107$, var413);
            if (module0305.NIL == module0256.f16576(var412, var74, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
                SubLObject var416 = (SubLObject)module0305.$ic235$;
                SubLObject var417 = (SubLObject)module0305.NIL;
                var417 = var416.first();
                while (module0305.NIL != var416) {
                    final SubLObject var418 = f20567(var412, var417);
                    if (module0305.NIL != var418) {
                        final SubLObject var419 = module0139.f9008();
                        final SubLObject var23_482 = module0139.$g1630$.currentBinding(var413);
                        final SubLObject var24_483 = module0139.$g1659$.currentBinding(var413);
                        try {
                            module0139.$g1630$.bind((SubLObject)module0305.NIL, var413);
                            module0139.$g1659$.bind(module0139.f9007(), var413);
                            final SubLObject var23_483 = module0144.$g1856$.currentBinding(var413);
                            final SubLObject var24_484 = module0139.$g1630$.currentBinding(var413);
                            try {
                                module0144.$g1856$.bind(module0139.$g1659$.getDynamicValue(var413), var413);
                                module0139.$g1630$.bind(var419, var413);
                                module0251.f16232(module0137.f8955(module0305.$ic45$), var412, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                                f20598(var74, var418, var417);
                            }
                            finally {
                                module0139.$g1630$.rebind(var24_484, var413);
                                module0144.$g1856$.rebind(var23_483, var413);
                            }
                            module0139.f9011(module0139.$g1659$.getDynamicValue(var413));
                        }
                        finally {
                            module0139.$g1659$.rebind(var24_483, var413);
                            module0139.$g1630$.rebind(var23_482, var413);
                        }
                    }
                    var416 = var416.rest();
                    var417 = var416.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var415, var413);
            module0147.$g2094$.rebind(var414, var413);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20599(final SubLObject var412, final SubLObject var74) {
        final SubLThread var413 = SubLProcess.currentSubLThread();
        if (module0305.NIL != module0144.$g1865$.getDynamicValue(var413)) {
            SubLObject var414 = (SubLObject)module0305.NIL;
            SubLObject var415 = (SubLObject)module0305.NIL;
            final SubLObject var416 = Time.get_internal_real_time();
            var414 = f20597(var412, var74);
            var415 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var416), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)module0305.$ic4$, module0305.$g2756$.getDynamicValue(var413), Numbers.add(Hashtables.gethash((SubLObject)module0305.$ic4$, module0305.$g2756$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED), (SubLObject)module0305.ONE_INTEGER));
            Hashtables.sethash((SubLObject)module0305.$ic5$, module0305.$g2756$.getDynamicValue(var413), (SubLObject)ConsesLow.cons(var415, Hashtables.gethash((SubLObject)module0305.$ic5$, module0305.$g2756$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic6$, module0305.$g2756$.getDynamicValue(var413), (SubLObject)ConsesLow.cons(var414, Hashtables.gethash((SubLObject)module0305.$ic6$, module0305.$g2756$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            Hashtables.sethash((SubLObject)module0305.$ic7$, module0305.$g2756$.getDynamicValue(var413), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var412, var74), Hashtables.gethash((SubLObject)module0305.$ic7$, module0305.$g2756$.getDynamicValue(var413), (SubLObject)module0305.UNPROVIDED)));
            return var414;
        }
        return f20597(var412, var74);
    }
    
    public static SubLObject f20589(final SubLObject var2, final SubLObject var486, final SubLObject var474) {
        final SubLThread var487 = SubLProcess.currentSubLThread();
        final SubLObject var488 = module0147.$g2094$.currentBinding(var487);
        final SubLObject var489 = module0147.$g2095$.currentBinding(var487);
        final SubLObject var490 = module0144.$g1875$.currentBinding(var487);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var487);
            module0147.$g2095$.bind(module0305.$ic107$, var487);
            module0144.$g1875$.bind(var486, var487);
            if (var474.eql((SubLObject)module0305.$ic108$)) {
                module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic239$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
            }
            else if (var474.eql((SubLObject)module0305.$ic208$)) {
                module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic240$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
            }
        }
        finally {
            module0144.$g1875$.rebind(var490, var487);
            module0147.$g2095$.rebind(var489, var487);
            module0147.$g2094$.rebind(var488, var487);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20591(final SubLObject var2, final SubLObject var486, final SubLObject var474) {
        final SubLThread var487 = SubLProcess.currentSubLThread();
        final SubLObject var488 = module0147.$g2094$.currentBinding(var487);
        final SubLObject var489 = module0147.$g2095$.currentBinding(var487);
        final SubLObject var490 = module0144.$g1875$.currentBinding(var487);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var487);
            module0147.$g2095$.bind(module0305.$ic107$, var487);
            module0144.$g1875$.bind(var486, var487);
            if (var474.eql((SubLObject)module0305.$ic108$)) {
                module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic241$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
            }
            else if (var474.eql((SubLObject)module0305.$ic208$)) {
                module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic242$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
            }
        }
        finally {
            module0144.$g1875$.rebind(var490, var487);
            module0147.$g2095$.rebind(var489, var487);
            module0147.$g2094$.rebind(var488, var487);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20594(final SubLObject var2, final SubLObject var481, final SubLObject var474) {
        final SubLThread var482 = SubLProcess.currentSubLThread();
        final SubLObject var483 = module0147.$g2094$.currentBinding(var482);
        final SubLObject var484 = module0147.$g2095$.currentBinding(var482);
        final SubLObject var485 = module0144.$g1876$.currentBinding(var482);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var482);
            module0147.$g2095$.bind(module0305.$ic107$, var482);
            module0144.$g1876$.bind(var481, var482);
            if (var474.eql((SubLObject)module0305.$ic108$)) {
                module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic243$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
            }
            else if (var474.eql((SubLObject)module0305.$ic208$)) {
                module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic244$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
            }
        }
        finally {
            module0144.$g1876$.rebind(var485, var482);
            module0147.$g2095$.rebind(var484, var482);
            module0147.$g2094$.rebind(var483, var482);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20598(final SubLObject var2, final SubLObject var481, final SubLObject var474) {
        final SubLThread var482 = SubLProcess.currentSubLThread();
        final SubLObject var483 = module0147.$g2094$.currentBinding(var482);
        final SubLObject var484 = module0147.$g2095$.currentBinding(var482);
        final SubLObject var485 = module0144.$g1876$.currentBinding(var482);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var482);
            module0147.$g2095$.bind(module0305.$ic107$, var482);
            module0144.$g1876$.bind(var481, var482);
            if (var474.eql((SubLObject)module0305.$ic108$)) {
                module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic245$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
            }
            else if (var474.eql((SubLObject)module0305.$ic208$)) {
                module0256.f16585(Symbols.symbol_function((SubLObject)module0305.$ic246$), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
            }
        }
        finally {
            module0144.$g1876$.rebind(var485, var482);
            module0147.$g2095$.rebind(var484, var482);
            module0147.$g2094$.rebind(var483, var482);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20600(final SubLObject var2, SubLObject var486) {
        if (var486 == module0305.UNPROVIDED) {
            var486 = module0144.$g1875$.getDynamicValue();
        }
        return f20585(var2, var486, (SubLObject)module0305.$ic108$, (SubLObject)module0305.NIL);
    }
    
    public static SubLObject f20601(final SubLObject var2, SubLObject var486) {
        if (var486 == module0305.UNPROVIDED) {
            var486 = module0144.$g1875$.getDynamicValue();
        }
        return f20588(var2, var486, (SubLObject)module0305.$ic108$, (SubLObject)module0305.NIL);
    }
    
    public static SubLObject f20602(final SubLObject var2, SubLObject var481) {
        if (var481 == module0305.UNPROVIDED) {
            var481 = module0144.$g1876$.getDynamicValue();
        }
        return f20603(var2, var481, (SubLObject)module0305.$ic108$);
    }
    
    public static SubLObject f20604(final SubLObject var2, SubLObject var481) {
        if (var481 == module0305.UNPROVIDED) {
            var481 = module0144.$g1876$.getDynamicValue();
        }
        return f20605(var2, var481, (SubLObject)module0305.$ic108$);
    }
    
    public static SubLObject f20606(final SubLObject var2, SubLObject var486) {
        if (var486 == module0305.UNPROVIDED) {
            var486 = module0144.$g1875$.getDynamicValue();
        }
        return f20585(var2, var486, (SubLObject)module0305.$ic208$, (SubLObject)module0305.NIL);
    }
    
    public static SubLObject f20607(final SubLObject var2, SubLObject var486) {
        if (var486 == module0305.UNPROVIDED) {
            var486 = module0144.$g1875$.getDynamicValue();
        }
        return f20588(var2, var486, (SubLObject)module0305.$ic208$, (SubLObject)module0305.NIL);
    }
    
    public static SubLObject f20608(final SubLObject var2, SubLObject var481) {
        if (var481 == module0305.UNPROVIDED) {
            var481 = module0144.$g1876$.getDynamicValue();
        }
        return f20603(var2, var481, (SubLObject)module0305.$ic208$);
    }
    
    public static SubLObject f20609(final SubLObject var2, SubLObject var481) {
        if (var481 == module0305.UNPROVIDED) {
            var481 = module0144.$g1876$.getDynamicValue();
        }
        return f20605(var2, var481, (SubLObject)module0305.$ic208$);
    }
    
    public static SubLObject f20603(final SubLObject var2, final SubLObject var481, final SubLObject var474) {
        final SubLThread var482 = SubLProcess.currentSubLThread();
        if (module0144.$g1863$.getDynamicValue(var482).numGE((SubLObject)module0305.FIVE_INTEGER)) {
            SubLObject var483 = var481;
            SubLObject var484 = (SubLObject)module0305.NIL;
            var484 = var483.first();
            while (module0305.NIL != var483) {
                f20324((SubLObject)module0305.FIVE_INTEGER, (SubLObject)module0305.$ic247$, var2, var484, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                var483 = var483.rest();
                var484 = var483.first();
            }
        }
        return f20565(var2, f20590(module0035.f2265(ConsesLow.nconc(f20564(var2, var474), conses_high.copy_list(var481)), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)), var474);
    }
    
    public static SubLObject f20605(final SubLObject var2, final SubLObject var481, final SubLObject var474) {
        final SubLThread var482 = SubLProcess.currentSubLThread();
        if (module0305.NIL == f20610(var2)) {
            final SubLObject var483 = f20564(var2, var474);
            if (module0305.NIL != var483) {
                SubLObject var484 = (SubLObject)module0305.NIL;
                SubLObject var485 = var481;
                SubLObject var486 = (SubLObject)module0305.NIL;
                var486 = var485.first();
                while (module0305.NIL != var485) {
                    if (module0305.NIL == module0178.f11361(var486, (SubLObject)module0305.UNPROVIDED) || module0305.NIL == module0256.f16576(module0178.f11335(var486), var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
                        var484 = (SubLObject)ConsesLow.cons(var486, var484);
                    }
                    var485 = var485.rest();
                    var486 = var485.first();
                }
                if (module0144.$g1863$.getDynamicValue(var482).numGE((SubLObject)module0305.FOUR_INTEGER)) {
                    var485 = var484;
                    var486 = (SubLObject)module0305.NIL;
                    var486 = var485.first();
                    while (module0305.NIL != var485) {
                        f20324((SubLObject)module0305.FOUR_INTEGER, (SubLObject)module0305.$ic226$, (SubLObject)((var474 == module0305.$ic108$) ? module0305.$ic248$ : module0305.$ic231$), var2, var486, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                        var485 = var485.rest();
                        var486 = var485.first();
                    }
                }
                final SubLObject var487 = f20590(conses_high.nset_difference(var483, var484, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                if (module0305.NIL != var487) {
                    f20565(var2, var487, var474);
                }
                else {
                    f20566(var2, var474);
                }
                return var487;
            }
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20610(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)module0305.NIL;
        final SubLObject var15 = module0139.$g1659$.currentBinding(var13);
        try {
            module0139.$g1659$.bind(module0144.$g1856$.getDynamicValue(var13), var13);
            var14 = module0251.f16239(var12, (SubLObject)module0305.UNPROVIDED);
        }
        finally {
            module0139.$g1659$.rebind(var15, var13);
        }
        return var14;
    }
    
    public static SubLObject f20590(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0305.NIL == module0144.$g1861$.getDynamicValue(var8)) {
            return var7;
        }
        if (module0305.NIL == var7) {
            return (SubLObject)module0305.NIL;
        }
        if (module0305.NIL != module0035.f1997(var7)) {
            return var7;
        }
        return Sort.sort(conses_high.copy_list(var7), Symbols.symbol_function((SubLObject)module0305.$ic249$), Symbols.symbol_function((SubLObject)module0305.$ic250$));
    }
    
    public static SubLObject f20611(final SubLObject var487, final SubLObject var488) {
        final SubLObject var489 = module0549.f33901(var487);
        final SubLObject var490 = module0549.f33901(var488);
        if (var489.numG(var490)) {
            return (SubLObject)module0305.T;
        }
        if (var489.numE(var490)) {
            return module0213.f13927(var487, var488, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20612() {
        Hashtables.clrhash(f20563((SubLObject)module0305.$ic108$));
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20613() {
        Hashtables.clrhash(f20563((SubLObject)module0305.$ic208$));
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20614(final SubLObject var2, final SubLObject var474) {
        final SubLThread var475 = SubLProcess.currentSubLThread();
        SubLObject var476 = (SubLObject)module0305.NIL;
        final SubLObject var477 = (SubLObject)module0305.NIL;
        if (var474.eql((SubLObject)module0305.$ic108$)) {
            var476 = (SubLObject)module0305.$ic251$;
        }
        else if (var474.eql((SubLObject)module0305.$ic208$)) {
            var476 = (SubLObject)module0305.$ic252$;
        }
        SubLObject var478 = var476;
        SubLObject var479 = (SubLObject)module0305.NIL;
        var479 = var478.first();
        while (module0305.NIL != var478) {
            final SubLObject var480 = module0147.$g2094$.currentBinding(var475);
            final SubLObject var481 = module0147.$g2095$.currentBinding(var475);
            try {
                module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var475);
                module0147.$g2095$.bind(module0305.$ic107$, var475);
                final SubLObject var482 = var479;
                if (module0305.NIL != module0158.f10038(var482)) {
                    final SubLObject var483 = (SubLObject)module0305.NIL;
                    final SubLObject var23_493 = module0012.$g73$.currentBinding(var475);
                    final SubLObject var24_494 = module0012.$g65$.currentBinding(var475);
                    final SubLObject var484 = module0012.$g67$.currentBinding(var475);
                    final SubLObject var485 = module0012.$g68$.currentBinding(var475);
                    final SubLObject var486 = module0012.$g66$.currentBinding(var475);
                    final SubLObject var487 = module0012.$g69$.currentBinding(var475);
                    final SubLObject var488 = module0012.$g70$.currentBinding(var475);
                    final SubLObject var489 = module0012.$silent_progressP$.currentBinding(var475);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var475);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var475), var475);
                        module0012.$g67$.bind((SubLObject)module0305.ONE_INTEGER, var475);
                        module0012.$g68$.bind((SubLObject)module0305.ZERO_INTEGER, var475);
                        module0012.$g66$.bind((SubLObject)module0305.ZERO_INTEGER, var475);
                        module0012.$g69$.bind((SubLObject)module0305.ZERO_INTEGER, var475);
                        module0012.$g70$.bind((SubLObject)module0305.T, var475);
                        module0012.$silent_progressP$.bind((SubLObject)((module0305.NIL != var483) ? module0012.$silent_progressP$.getDynamicValue(var475) : module0305.T), var475);
                        module0012.f474(var483);
                        final SubLObject var490 = module0158.f10039(var482);
                        SubLObject var491 = var477;
                        final SubLObject var492 = (SubLObject)module0305.NIL;
                        while (module0305.NIL == var491) {
                            final SubLObject var493 = module0052.f3695(var490, var492);
                            final SubLObject var494 = (SubLObject)SubLObjectFactory.makeBoolean(!var492.eql(var493));
                            if (module0305.NIL != var494) {
                                module0012.f476();
                                SubLObject var495 = (SubLObject)module0305.NIL;
                                try {
                                    var495 = module0158.f10316(var493, (SubLObject)module0305.$ic50$, (SubLObject)module0305.$ic21$, (SubLObject)module0305.NIL);
                                    SubLObject var109_495 = var477;
                                    final SubLObject var110_496 = (SubLObject)module0305.NIL;
                                    while (module0305.NIL == var109_495) {
                                        final SubLObject var496 = module0052.f3695(var495, var110_496);
                                        final SubLObject var112_497 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_496.eql(var496));
                                        if (module0305.NIL != var112_497) {
                                            final SubLObject var497 = module0178.f11335(var496);
                                            if (module0305.NIL != module0256.f16576(var497, var2, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
                                                f20581(var2, var496, var474);
                                            }
                                        }
                                        var109_495 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var112_497 || module0305.NIL != var477);
                                    }
                                }
                                finally {
                                    final SubLObject var23_494 = Threads.$is_thread_performing_cleanupP$.currentBinding(var475);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var475);
                                        if (module0305.NIL != var495) {
                                            module0158.f10319(var495);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var23_494, var475);
                                    }
                                }
                            }
                            var491 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var494 || module0305.NIL != var477);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var489, var475);
                        module0012.$g70$.rebind(var488, var475);
                        module0012.$g69$.rebind(var487, var475);
                        module0012.$g66$.rebind(var486, var475);
                        module0012.$g68$.rebind(var485, var475);
                        module0012.$g67$.rebind(var484, var475);
                        module0012.$g65$.rebind(var24_494, var475);
                        module0012.$g73$.rebind(var23_493, var475);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var481, var475);
                module0147.$g2094$.rebind(var480, var475);
            }
            var478 = var478.rest();
            var479 = var478.first();
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20615(final SubLObject var474, SubLObject var436, SubLObject var437) {
        if (var436 == module0305.UNPROVIDED) {
            var436 = (SubLObject)module0305.T;
        }
        if (var437 == module0305.UNPROVIDED) {
            var437 = (SubLObject)module0305.NIL;
        }
        final SubLThread var475 = SubLProcess.currentSubLThread();
        final SubLObject var476 = module0144.$g1797$.currentBinding(var475);
        try {
            module0144.$g1797$.bind((SubLObject)((module0305.NIL != var437) ? module0305.FIVE_INTEGER : module0144.$g1797$.getDynamicValue(var475)), var475);
            SubLObject var477 = (SubLObject)module0305.NIL;
            final SubLObject var23_500 = module0144.$g1861$.currentBinding(var475);
            try {
                module0144.$g1861$.bind((SubLObject)module0305.NIL, var475);
                final SubLObject var478 = (SubLObject)module0305.NIL;
                if (module0305.NIL != var436) {
                    if (var474.eql((SubLObject)module0305.$ic108$)) {
                        f20612();
                        var477 = (SubLObject)module0305.$ic251$;
                    }
                    else if (var474.eql((SubLObject)module0305.$ic208$)) {
                        f20613();
                        var477 = (SubLObject)module0305.$ic252$;
                    }
                }
                SubLObject var479 = var477;
                SubLObject var480 = (SubLObject)module0305.NIL;
                var480 = var479.first();
                while (module0305.NIL != var479) {
                    final SubLObject var23_501 = module0147.$g2094$.currentBinding(var475);
                    final SubLObject var481 = module0147.$g2095$.currentBinding(var475);
                    try {
                        module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var475);
                        module0147.$g2095$.bind(module0305.$ic107$, var475);
                        final SubLObject var482 = module0139.$g1630$.getDynamicValue(var475);
                        final SubLObject var23_502 = module0139.$g1631$.currentBinding(var475);
                        final SubLObject var24_503 = module0139.$g1632$.currentBinding(var475);
                        final SubLObject var483 = module0139.$g1630$.currentBinding(var475);
                        try {
                            module0139.$g1631$.bind(module0139.f9015(var482, (SubLObject)module0305.SIX_INTEGER), var475);
                            module0139.$g1632$.bind(module0139.f9016(var482), var475);
                            module0139.$g1630$.bind((SubLObject)module0305.T, var475);
                            final SubLObject var484 = var480;
                            if (module0305.NIL != module0158.f10038(var484)) {
                                final SubLObject var485 = (SubLObject)module0305.NIL;
                                final SubLObject var23_503 = module0012.$g73$.currentBinding(var475);
                                final SubLObject var24_504 = module0012.$g65$.currentBinding(var475);
                                final SubLObject var25_506 = module0012.$g67$.currentBinding(var475);
                                final SubLObject var486 = module0012.$g68$.currentBinding(var475);
                                final SubLObject var487 = module0012.$g66$.currentBinding(var475);
                                final SubLObject var488 = module0012.$g69$.currentBinding(var475);
                                final SubLObject var489 = module0012.$g70$.currentBinding(var475);
                                final SubLObject var490 = module0012.$silent_progressP$.currentBinding(var475);
                                try {
                                    module0012.$g73$.bind(Time.get_universal_time(), var475);
                                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var475), var475);
                                    module0012.$g67$.bind((SubLObject)module0305.ONE_INTEGER, var475);
                                    module0012.$g68$.bind((SubLObject)module0305.ZERO_INTEGER, var475);
                                    module0012.$g66$.bind((SubLObject)module0305.ZERO_INTEGER, var475);
                                    module0012.$g69$.bind((SubLObject)module0305.ZERO_INTEGER, var475);
                                    module0012.$g70$.bind((SubLObject)module0305.T, var475);
                                    module0012.$silent_progressP$.bind((SubLObject)((module0305.NIL != var485) ? module0012.$silent_progressP$.getDynamicValue(var475) : module0305.T), var475);
                                    module0012.f474(var485);
                                    final SubLObject var491 = module0158.f10039(var484);
                                    SubLObject var492 = var478;
                                    final SubLObject var493 = (SubLObject)module0305.NIL;
                                    while (module0305.NIL == var492) {
                                        final SubLObject var494 = module0052.f3695(var491, var493);
                                        final SubLObject var495 = (SubLObject)SubLObjectFactory.makeBoolean(!var493.eql(var494));
                                        if (module0305.NIL != var495) {
                                            module0012.f476();
                                            SubLObject var496 = (SubLObject)module0305.NIL;
                                            try {
                                                var496 = module0158.f10316(var494, (SubLObject)module0305.$ic50$, (SubLObject)module0305.$ic21$, (SubLObject)module0305.NIL);
                                                SubLObject var109_507 = var478;
                                                final SubLObject var110_508 = (SubLObject)module0305.NIL;
                                                while (module0305.NIL == var109_507) {
                                                    final SubLObject var497 = module0052.f3695(var496, var110_508);
                                                    final SubLObject var112_509 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_508.eql(var497));
                                                    if (module0305.NIL != var112_509) {
                                                        final SubLObject var498 = module0178.f11335(var497);
                                                        f20581(var498, var497, var474);
                                                    }
                                                    var109_507 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var112_509 || module0305.NIL != var478);
                                                }
                                            }
                                            finally {
                                                final SubLObject var23_504 = Threads.$is_thread_performing_cleanupP$.currentBinding(var475);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var475);
                                                    if (module0305.NIL != var496) {
                                                        module0158.f10319(var496);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var23_504, var475);
                                                }
                                            }
                                        }
                                        var492 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var495 || module0305.NIL != var478);
                                    }
                                    module0012.f475();
                                }
                                finally {
                                    module0012.$silent_progressP$.rebind(var490, var475);
                                    module0012.$g70$.rebind(var489, var475);
                                    module0012.$g69$.rebind(var488, var475);
                                    module0012.$g66$.rebind(var487, var475);
                                    module0012.$g68$.rebind(var486, var475);
                                    module0012.$g67$.rebind(var25_506, var475);
                                    module0012.$g65$.rebind(var24_504, var475);
                                    module0012.$g73$.rebind(var23_503, var475);
                                }
                            }
                        }
                        finally {
                            module0139.$g1630$.rebind(var483, var475);
                            module0139.$g1632$.rebind(var24_503, var475);
                            module0139.$g1631$.rebind(var23_502, var475);
                        }
                    }
                    finally {
                        module0147.$g2095$.rebind(var481, var475);
                        module0147.$g2094$.rebind(var23_501, var475);
                    }
                    var479 = var479.rest();
                    var480 = var479.first();
                }
            }
            finally {
                module0144.$g1861$.rebind(var23_500, var475);
            }
        }
        finally {
            module0144.$g1797$.rebind(var476, var475);
        }
        if (module0305.NIL != module0144.$g1861$.getDynamicValue(var475)) {
            final SubLObject var499 = f20563(var474);
            SubLObject var500 = (SubLObject)module0305.NIL;
            SubLObject var501 = (SubLObject)module0305.NIL;
            final Iterator var502 = Hashtables.getEntrySetIterator(var499);
            try {
                while (Hashtables.iteratorHasNext(var502)) {
                    final Map.Entry var503 = Hashtables.iteratorNextEntry(var502);
                    var500 = Hashtables.getEntryKey(var503);
                    var501 = Hashtables.getEntryValue(var503);
                    f20565(var500, f20590(var501), var474);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var502);
            }
        }
        return Hashtables.hash_table_count(f20563(var474));
    }
    
    public static SubLObject f20616() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)module0305.$ic253$;
        final SubLObject var3 = module0012.$g73$.currentBinding(var1);
        final SubLObject var4 = module0012.$g65$.currentBinding(var1);
        final SubLObject var5 = module0012.$g67$.currentBinding(var1);
        final SubLObject var6 = module0012.$g68$.currentBinding(var1);
        final SubLObject var7 = module0012.$g66$.currentBinding(var1);
        final SubLObject var8 = module0012.$g69$.currentBinding(var1);
        final SubLObject var9 = module0012.$g70$.currentBinding(var1);
        final SubLObject var10 = module0012.$silent_progressP$.currentBinding(var1);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var1);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var1), var1);
            module0012.$g67$.bind((SubLObject)module0305.ONE_INTEGER, var1);
            module0012.$g68$.bind((SubLObject)module0305.ZERO_INTEGER, var1);
            module0012.$g66$.bind((SubLObject)module0305.ZERO_INTEGER, var1);
            module0012.$g69$.bind((SubLObject)module0305.ZERO_INTEGER, var1);
            module0012.$g70$.bind((SubLObject)module0305.T, var1);
            module0012.$silent_progressP$.bind((SubLObject)((module0305.NIL != var2) ? module0012.$silent_progressP$.getDynamicValue(var1) : module0305.T), var1);
            module0012.f474(var2);
            f20615((SubLObject)module0305.$ic108$, (SubLObject)module0305.T, (SubLObject)module0305.UNPROVIDED);
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var10, var1);
            module0012.$g70$.rebind(var9, var1);
            module0012.$g69$.rebind(var8, var1);
            module0012.$g66$.rebind(var7, var1);
            module0012.$g68$.rebind(var6, var1);
            module0012.$g67$.rebind(var5, var1);
            module0012.$g65$.rebind(var4, var1);
            module0012.$g73$.rebind(var3, var1);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20617() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)module0305.$ic254$;
        final SubLObject var3 = module0012.$g73$.currentBinding(var1);
        final SubLObject var4 = module0012.$g65$.currentBinding(var1);
        final SubLObject var5 = module0012.$g67$.currentBinding(var1);
        final SubLObject var6 = module0012.$g68$.currentBinding(var1);
        final SubLObject var7 = module0012.$g66$.currentBinding(var1);
        final SubLObject var8 = module0012.$g69$.currentBinding(var1);
        final SubLObject var9 = module0012.$g70$.currentBinding(var1);
        final SubLObject var10 = module0012.$silent_progressP$.currentBinding(var1);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var1);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var1), var1);
            module0012.$g67$.bind((SubLObject)module0305.ONE_INTEGER, var1);
            module0012.$g68$.bind((SubLObject)module0305.ZERO_INTEGER, var1);
            module0012.$g66$.bind((SubLObject)module0305.ZERO_INTEGER, var1);
            module0012.$g69$.bind((SubLObject)module0305.ZERO_INTEGER, var1);
            module0012.$g70$.bind((SubLObject)module0305.T, var1);
            module0012.$silent_progressP$.bind((SubLObject)((module0305.NIL != var2) ? module0012.$silent_progressP$.getDynamicValue(var1) : module0305.T), var1);
            module0012.f474(var2);
            f20615((SubLObject)module0305.$ic208$, (SubLObject)module0305.T, (SubLObject)module0305.UNPROVIDED);
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var10, var1);
            module0012.$g70$.rebind(var9, var1);
            module0012.$g69$.rebind(var8, var1);
            module0012.$g66$.rebind(var7, var1);
            module0012.$g68$.rebind(var6, var1);
            module0012.$g67$.rebind(var5, var1);
            module0012.$g65$.rebind(var4, var1);
            module0012.$g73$.rebind(var3, var1);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20618(SubLObject var512) {
        if (var512 == module0305.UNPROVIDED) {
            var512 = module0144.$g1873$.getDynamicValue();
        }
        SubLObject var513 = (SubLObject)module0305.NIL;
        SubLObject var514 = (SubLObject)module0305.NIL;
        SubLObject var515 = (SubLObject)module0305.NIL;
        final Iterator var516 = Hashtables.getEntrySetIterator(var512);
        try {
            while (Hashtables.iteratorHasNext(var516)) {
                final Map.Entry var517 = Hashtables.iteratorNextEntry(var516);
                var514 = Hashtables.getEntryKey(var517);
                SubLObject var518;
                var515 = (var518 = Hashtables.getEntryValue(var517));
                SubLObject var519 = (SubLObject)module0305.NIL;
                var519 = var518.first();
                while (module0305.NIL != var518) {
                    if (module0305.NIL == module0178.f11361(var519, (SubLObject)module0305.UNPROVIDED)) {
                        final SubLObject var520 = var519;
                        if (module0305.NIL == conses_high.member(var520, var513, Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
                            var513 = (SubLObject)ConsesLow.cons(var520, var513);
                        }
                    }
                    var518 = var518.rest();
                    var519 = var518.first();
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var516);
        }
        return var513;
    }
    
    public static SubLObject f20619(SubLObject var512) {
        if (var512 == module0305.UNPROVIDED) {
            var512 = module0144.$g1873$.getDynamicValue();
        }
        final SubLThread var513 = SubLProcess.currentSubLThread();
        final SubLObject var514 = var512;
        module0012.$g82$.setDynamicValue((SubLObject)module0305.$ic255$, var513);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var513);
        module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var514), var513);
        module0012.$g84$.setDynamicValue((SubLObject)module0305.ZERO_INTEGER, var513);
        final SubLObject var515 = module0012.$g75$.currentBinding(var513);
        final SubLObject var516 = module0012.$g76$.currentBinding(var513);
        final SubLObject var517 = module0012.$g77$.currentBinding(var513);
        final SubLObject var518 = module0012.$g78$.currentBinding(var513);
        try {
            module0012.$g75$.bind((SubLObject)module0305.ZERO_INTEGER, var513);
            module0012.$g76$.bind((SubLObject)module0305.NIL, var513);
            module0012.$g77$.bind((SubLObject)module0305.T, var513);
            module0012.$g78$.bind(Time.get_universal_time(), var513);
            module0012.f478(module0012.$g82$.getDynamicValue(var513));
            SubLObject var519 = (SubLObject)module0305.NIL;
            SubLObject var520 = (SubLObject)module0305.NIL;
            final Iterator var521 = Hashtables.getEntrySetIterator(var514);
            try {
                while (Hashtables.iteratorHasNext(var521)) {
                    final Map.Entry var522 = Hashtables.iteratorNextEntry(var521);
                    var519 = Hashtables.getEntryKey(var522);
                    var520 = Hashtables.getEntryValue(var522);
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var513), module0012.$g83$.getDynamicValue(var513));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var513), (SubLObject)module0305.ONE_INTEGER), var513);
                    print_high.print(var519, (SubLObject)module0305.UNPROVIDED);
                    module0538.f33365(var519);
                    final SubLObject var523 = f20618((SubLObject)module0305.UNPROVIDED);
                    if (module0305.NIL != var523) {
                        print_high.print(var523, (SubLObject)module0305.UNPROVIDED);
                        Errors.sublisp_break((SubLObject)module0305.$ic256$, module0305.EMPTY_SUBL_OBJECT_ARRAY);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var521);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var518, var513);
            module0012.$g77$.rebind(var517, var513);
            module0012.$g76$.rebind(var516, var513);
            module0012.$g75$.rebind(var515, var513);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20620(final SubLObject var4, final SubLObject var474) {
        final SubLThread var475 = SubLProcess.currentSubLThread();
        SubLObject var476 = (SubLObject)module0305.NIL;
        SubLObject var477 = (SubLObject)module0305.NIL;
        try {
            var475.throwStack.push(module0305.$ic257$);
            final SubLObject var478 = f20563(var474);
            SubLObject var479 = (SubLObject)module0305.NIL;
            SubLObject var480 = (SubLObject)module0305.NIL;
            final Iterator var481 = Hashtables.getEntrySetIterator(var478);
            try {
                while (Hashtables.iteratorHasNext(var481)) {
                    final Map.Entry var482 = Hashtables.iteratorNextEntry(var481);
                    var479 = Hashtables.getEntryKey(var482);
                    var480 = Hashtables.getEntryValue(var482);
                    if (module0305.NIL != module0004.f104(var4, var480, Symbols.symbol_function((SubLObject)module0305.$ic144$), (SubLObject)module0305.UNPROVIDED)) {
                        var476 = (SubLObject)module0305.T;
                        module0012.f425();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var481);
            }
        }
        catch (Throwable var483) {
            var477 = Errors.handleThrowable(var483, (SubLObject)module0305.$ic257$);
        }
        finally {
            var475.throwStack.pop();
        }
        return var476;
    }
    
    public static SubLObject f20621(final SubLObject var474, SubLObject var520, SubLObject var382) {
        if (var520 == module0305.UNPROVIDED) {
            var520 = (SubLObject)module0305.NIL;
        }
        if (var382 == module0305.UNPROVIDED) {
            var382 = (SubLObject)module0305.T;
        }
        final SubLThread var521 = SubLProcess.currentSubLThread();
        module0305.$g2757$.setDynamicValue((SubLObject)module0305.NIL, var521);
        module0305.$g2758$.setDynamicValue((SubLObject)module0305.NIL, var521);
        module0305.$g2759$.setDynamicValue((SubLObject)module0305.NIL, var521);
        module0305.$g2760$.setDynamicValue((SubLObject)module0305.NIL, var521);
        module0305.$g2761$.setDynamicValue((SubLObject)module0305.NIL, var521);
        module0305.$g2762$.setDynamicValue((SubLObject)module0305.NIL, var521);
        final SubLObject var522 = module0147.$g2094$.currentBinding(var521);
        final SubLObject var523 = module0147.$g2095$.currentBinding(var521);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var521);
            module0147.$g2095$.bind(module0305.$ic107$, var521);
            SubLObject var524 = (SubLObject)((var474 == module0305.$ic108$) ? module0305.$ic251$ : module0305.$ic252$);
            SubLObject var525 = (SubLObject)module0305.NIL;
            var525 = var524.first();
            while (module0305.NIL != var524) {
                final SubLObject var526 = (SubLObject)module0305.NIL;
                final SubLObject var23_521 = module0147.$g2094$.currentBinding(var521);
                final SubLObject var24_522 = module0147.$g2095$.currentBinding(var521);
                try {
                    module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var521);
                    module0147.$g2095$.bind(module0305.$ic107$, var521);
                    final SubLObject var527 = var525;
                    if (module0305.NIL != module0158.f10038(var527)) {
                        final SubLObject var528 = (SubLObject)module0305.NIL;
                        final SubLObject var23_522 = module0012.$g73$.currentBinding(var521);
                        final SubLObject var24_523 = module0012.$g65$.currentBinding(var521);
                        final SubLObject var529 = module0012.$g67$.currentBinding(var521);
                        final SubLObject var530 = module0012.$g68$.currentBinding(var521);
                        final SubLObject var531 = module0012.$g66$.currentBinding(var521);
                        final SubLObject var532 = module0012.$g69$.currentBinding(var521);
                        final SubLObject var533 = module0012.$g70$.currentBinding(var521);
                        final SubLObject var534 = module0012.$silent_progressP$.currentBinding(var521);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var521);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var521), var521);
                            module0012.$g67$.bind((SubLObject)module0305.ONE_INTEGER, var521);
                            module0012.$g68$.bind((SubLObject)module0305.ZERO_INTEGER, var521);
                            module0012.$g66$.bind((SubLObject)module0305.ZERO_INTEGER, var521);
                            module0012.$g69$.bind((SubLObject)module0305.ZERO_INTEGER, var521);
                            module0012.$g70$.bind((SubLObject)module0305.T, var521);
                            module0012.$silent_progressP$.bind((SubLObject)((module0305.NIL != var528) ? module0012.$silent_progressP$.getDynamicValue(var521) : module0305.T), var521);
                            module0012.f474(var528);
                            final SubLObject var535 = module0158.f10039(var527);
                            SubLObject var536 = var526;
                            final SubLObject var537 = (SubLObject)module0305.NIL;
                            while (module0305.NIL == var536) {
                                final SubLObject var538 = module0052.f3695(var535, var537);
                                final SubLObject var539 = (SubLObject)SubLObjectFactory.makeBoolean(!var537.eql(var538));
                                if (module0305.NIL != var539) {
                                    module0012.f476();
                                    SubLObject var540 = (SubLObject)module0305.NIL;
                                    try {
                                        var540 = module0158.f10316(var538, (SubLObject)module0305.$ic50$, (SubLObject)module0305.$ic21$, (SubLObject)module0305.NIL);
                                        SubLObject var109_525 = var526;
                                        final SubLObject var110_526 = (SubLObject)module0305.NIL;
                                        while (module0305.NIL == var109_525) {
                                            final SubLObject var541 = module0052.f3695(var540, var110_526);
                                            final SubLObject var112_527 = (SubLObject)SubLObjectFactory.makeBoolean(!var110_526.eql(var541));
                                            if (module0305.NIL != var112_527) {
                                                final SubLObject var542 = module0178.f11335(var541);
                                                if (module0305.NIL == f20573(var542, var541, var474)) {
                                                    module0305.$g2762$.setDynamicValue((SubLObject)ConsesLow.cons(var541, module0305.$g2762$.getDynamicValue(var521)), var521);
                                                }
                                            }
                                            var109_525 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var112_527 || module0305.NIL != var526);
                                        }
                                    }
                                    finally {
                                        final SubLObject var23_523 = Threads.$is_thread_performing_cleanupP$.currentBinding(var521);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0305.T, var521);
                                            if (module0305.NIL != var540) {
                                                module0158.f10319(var540);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var23_523, var521);
                                        }
                                    }
                                }
                                var536 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == var539 || module0305.NIL != var526);
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var534, var521);
                            module0012.$g70$.rebind(var533, var521);
                            module0012.$g69$.rebind(var532, var521);
                            module0012.$g66$.rebind(var531, var521);
                            module0012.$g68$.rebind(var530, var521);
                            module0012.$g67$.rebind(var529, var521);
                            module0012.$g65$.rebind(var24_523, var521);
                            module0012.$g73$.rebind(var23_522, var521);
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var24_522, var521);
                    module0147.$g2094$.rebind(var23_521, var521);
                }
                var524 = var524.rest();
                var525 = var524.first();
            }
            final SubLObject var543 = f20563(var474);
            module0012.$g82$.setDynamicValue((SubLObject)module0305.$ic258$, var521);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var521);
            module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var543), var521);
            module0012.$g84$.setDynamicValue((SubLObject)module0305.ZERO_INTEGER, var521);
            final SubLObject var23_524 = module0012.$g75$.currentBinding(var521);
            final SubLObject var24_524 = module0012.$g76$.currentBinding(var521);
            final SubLObject var544 = module0012.$g77$.currentBinding(var521);
            final SubLObject var545 = module0012.$g78$.currentBinding(var521);
            try {
                module0012.$g75$.bind((SubLObject)module0305.ZERO_INTEGER, var521);
                module0012.$g76$.bind((SubLObject)module0305.NIL, var521);
                module0012.$g77$.bind((SubLObject)module0305.T, var521);
                module0012.$g78$.bind(Time.get_universal_time(), var521);
                module0012.f478(module0012.$g82$.getDynamicValue(var521));
                SubLObject var546 = (SubLObject)module0305.NIL;
                SubLObject var547 = (SubLObject)module0305.NIL;
                final Iterator var548 = Hashtables.getEntrySetIterator(var543);
                try {
                    while (Hashtables.iteratorHasNext(var548)) {
                        final Map.Entry var549 = Hashtables.iteratorNextEntry(var548);
                        var546 = Hashtables.getEntryKey(var549);
                        var547 = Hashtables.getEntryValue(var549);
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var521), module0012.$g83$.getDynamicValue(var521));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var521), (SubLObject)module0305.ONE_INTEGER), var521);
                        final SubLObject var23_525 = module0012.$g83$.currentBinding(var521);
                        final SubLObject var24_525 = module0012.$g84$.currentBinding(var521);
                        try {
                            module0012.$g83$.bind((SubLObject)module0305.NIL, var521);
                            module0012.$g84$.bind((SubLObject)module0305.NIL, var521);
                            if (module0305.NIL == module0173.f10969(var546)) {
                                module0305.$g2757$.setDynamicValue((SubLObject)ConsesLow.cons(var546, module0305.$g2757$.getDynamicValue(var521)), var521);
                            }
                            if (module0305.NIL == var547) {
                                module0305.$g2758$.setDynamicValue((SubLObject)ConsesLow.cons(var546, module0305.$g2758$.getDynamicValue(var521)), var521);
                            }
                            SubLObject var550 = (SubLObject)module0305.NIL;
                            if (module0305.NIL == var550) {
                                SubLObject var551;
                                SubLObject var552;
                                for (var551 = var547, var552 = (SubLObject)module0305.NIL, var552 = var551.first(); module0305.NIL == var550 && module0305.NIL != var551; var550 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == module0178.f11361(var552, (SubLObject)module0305.UNPROVIDED)), var551 = var551.rest(), var552 = var551.first()) {}
                            }
                            if (module0305.NIL != var550) {
                                module0305.$g2759$.setDynamicValue((SubLObject)ConsesLow.cons(var546, module0305.$g2759$.getDynamicValue(var521)), var521);
                            }
                            var550 = (SubLObject)module0305.NIL;
                            if (module0305.NIL == var550) {
                                SubLObject var551 = var547;
                                SubLObject var552 = (SubLObject)module0305.NIL;
                                var552 = var551.first();
                                while (module0305.NIL == var550 && module0305.NIL != var551) {
                                    final SubLObject var553 = module0178.f11335(var552);
                                    var550 = (SubLObject)SubLObjectFactory.makeBoolean(module0305.NIL == module0256.f16576(var553, var546, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                                    var551 = var551.rest();
                                    var552 = var551.first();
                                }
                            }
                            if (module0305.NIL != var550) {
                                module0305.$g2760$.setDynamicValue((SubLObject)ConsesLow.cons(var546, module0305.$g2760$.getDynamicValue(var521)), var521);
                            }
                            if (module0305.NIL == var547) {
                                continue;
                            }
                            SubLObject var554 = module0256.f16531(var546, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED);
                            SubLObject var555 = (SubLObject)module0305.NIL;
                            var555 = var554.first();
                            while (module0305.NIL != var554) {
                                if (module0305.NIL != conses_high.set_difference(var547, f20564(var555, var474), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED)) {
                                    final SubLObject var556 = var555;
                                    if (module0305.NIL == conses_high.member(var556, module0305.$g2761$.getDynamicValue(var521), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
                                        module0305.$g2761$.setDynamicValue((SubLObject)ConsesLow.cons(var556, module0305.$g2761$.getDynamicValue(var521)), var521);
                                    }
                                }
                                var554 = var554.rest();
                                var555 = var554.first();
                            }
                        }
                        finally {
                            module0012.$g84$.rebind(var24_525, var521);
                            module0012.$g83$.rebind(var23_525, var521);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var548);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var545, var521);
                module0012.$g77$.rebind(var544, var521);
                module0012.$g76$.rebind(var24_524, var521);
                module0012.$g75$.rebind(var23_524, var521);
            }
        }
        finally {
            module0147.$g2095$.rebind(var523, var521);
            module0147.$g2094$.rebind(var522, var521);
        }
        if (module0305.NIL != var520) {
            f20622(var382);
        }
        return (SubLObject)module0305.T;
    }
    
    public static SubLObject f20622(SubLObject var382) {
        if (var382 == module0305.UNPROVIDED) {
            var382 = (SubLObject)module0305.T;
        }
        final SubLThread var383 = SubLProcess.currentSubLThread();
        PrintLow.format(var382, (SubLObject)module0305.$ic259$, Sequences.length(module0305.$g2757$.getDynamicValue(var383)));
        PrintLow.format(var382, (SubLObject)module0305.$ic260$, Sequences.length(module0305.$g2758$.getDynamicValue(var383)));
        PrintLow.format(var382, (SubLObject)module0305.$ic261$, Sequences.length(module0305.$g2759$.getDynamicValue(var383)));
        PrintLow.format(var382, (SubLObject)module0305.$ic262$, Sequences.length(module0305.$g2760$.getDynamicValue(var383)));
        PrintLow.format(var382, (SubLObject)module0305.$ic263$, Sequences.length(module0305.$g2761$.getDynamicValue(var383)));
        PrintLow.format(var382, (SubLObject)module0305.$ic264$, Sequences.length(module0305.$g2762$.getDynamicValue(var383)));
        return (SubLObject)module0305.T;
    }
    
    public static SubLObject f20623(final SubLObject var474) {
        final SubLThread var475 = SubLProcess.currentSubLThread();
        SubLObject var476 = (SubLObject)module0305.NIL;
        SubLObject var477 = (SubLObject)module0305.NIL;
        SubLObject var478 = (SubLObject)module0305.ZERO_INTEGER;
        final SubLObject var479 = module0147.$g2094$.currentBinding(var475);
        final SubLObject var480 = module0147.$g2095$.currentBinding(var475);
        try {
            module0147.$g2094$.bind((SubLObject)module0305.$ic106$, var475);
            module0147.$g2095$.bind(module0305.$ic107$, var475);
            streams_high.terpri((SubLObject)module0305.UNPROVIDED);
            final SubLObject var481;
            var477 = (var481 = module0259.f16848(module0305.$ic265$, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
            module0012.$g82$.setDynamicValue((SubLObject)module0305.$ic266$, var475);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var475);
            module0012.$g83$.setDynamicValue(Sequences.length(var481), var475);
            module0012.$g84$.setDynamicValue((SubLObject)module0305.ZERO_INTEGER, var475);
            final SubLObject var23_536 = module0012.$g75$.currentBinding(var475);
            final SubLObject var24_537 = module0012.$g76$.currentBinding(var475);
            final SubLObject var482 = module0012.$g77$.currentBinding(var475);
            final SubLObject var483 = module0012.$g78$.currentBinding(var475);
            try {
                module0012.$g75$.bind((SubLObject)module0305.ZERO_INTEGER, var475);
                module0012.$g76$.bind((SubLObject)module0305.NIL, var475);
                module0012.$g77$.bind((SubLObject)module0305.T, var475);
                module0012.$g78$.bind(Time.get_universal_time(), var475);
                module0012.f478(module0012.$g82$.getDynamicValue(var475));
                SubLObject var484 = var481;
                SubLObject var485 = (SubLObject)module0305.NIL;
                var485 = var484.first();
                while (module0305.NIL != var484) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var475), module0012.$g83$.getDynamicValue(var475));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var475), (SubLObject)module0305.ONE_INTEGER), var475);
                    final SubLObject var486 = f20574(var485, var474, (SubLObject)module0305.UNPROVIDED);
                    module0538.f33365(var485);
                    var478 = Numbers.add(var478, (SubLObject)module0305.ONE_INTEGER);
                    SubLObject var487 = var486;
                    SubLObject var488 = (SubLObject)module0305.NIL;
                    var488 = var487.first();
                    while (module0305.NIL != var487) {
                        var476 = var488;
                        SubLObject var9_539 = f20567(var488, var474);
                        SubLObject var489 = (SubLObject)module0305.NIL;
                        var489 = var9_539.first();
                        while (module0305.NIL != var9_539) {
                            if (module0305.NIL == module0178.f11361(var489, (SubLObject)module0305.T)) {
                                print_high.print(var489, (SubLObject)module0305.UNPROVIDED);
                                print_high.print((SubLObject)ConsesLow.list(var485, var476), (SubLObject)module0305.UNPROVIDED);
                                Errors.sublisp_break((SubLObject)module0305.$ic256$, module0305.EMPTY_SUBL_OBJECT_ARRAY);
                            }
                            var9_539 = var9_539.rest();
                            var489 = var9_539.first();
                        }
                        f20572(var488, var474, (SubLObject)module0305.UNPROVIDED);
                        var487 = var487.rest();
                        var488 = var487.first();
                    }
                    PrintLow.format((SubLObject)module0305.T, (SubLObject)module0305.$ic267$, var478);
                    var484 = var484.rest();
                    var485 = var484.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var483, var475);
                module0012.$g77$.rebind(var482, var475);
                module0012.$g76$.rebind(var24_537, var475);
                module0012.$g75$.rebind(var23_536, var475);
            }
        }
        finally {
            module0147.$g2095$.rebind(var480, var475);
            module0147.$g2094$.rebind(var479, var475);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20624(final SubLObject var474) {
        final SubLThread var475 = SubLProcess.currentSubLThread();
        final SubLObject var476 = f20563(var474);
        module0012.$g82$.setDynamicValue((SubLObject)module0305.$ic258$, var475);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var475);
        module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var476), var475);
        module0012.$g84$.setDynamicValue((SubLObject)module0305.ZERO_INTEGER, var475);
        final SubLObject var477 = module0012.$g75$.currentBinding(var475);
        final SubLObject var478 = module0012.$g76$.currentBinding(var475);
        final SubLObject var479 = module0012.$g77$.currentBinding(var475);
        final SubLObject var480 = module0012.$g78$.currentBinding(var475);
        try {
            module0012.$g75$.bind((SubLObject)module0305.ZERO_INTEGER, var475);
            module0012.$g76$.bind((SubLObject)module0305.NIL, var475);
            module0012.$g77$.bind((SubLObject)module0305.T, var475);
            module0012.$g78$.bind(Time.get_universal_time(), var475);
            module0012.f478(module0012.$g82$.getDynamicValue(var475));
            SubLObject var481 = (SubLObject)module0305.NIL;
            SubLObject var482 = (SubLObject)module0305.NIL;
            final Iterator var483 = Hashtables.getEntrySetIterator(var476);
            try {
                while (Hashtables.iteratorHasNext(var483)) {
                    final Map.Entry var484 = Hashtables.iteratorNextEntry(var483);
                    var481 = Hashtables.getEntryKey(var484);
                    var482 = Hashtables.getEntryValue(var484);
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var475), module0012.$g83$.getDynamicValue(var475));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var475), (SubLObject)module0305.ONE_INTEGER), var475);
                    SubLObject var485 = var482;
                    SubLObject var486 = (SubLObject)module0305.NIL;
                    var486 = var485.first();
                    while (module0305.NIL != var485) {
                        if (module0305.NIL == module0178.f11361(var486, (SubLObject)module0305.T)) {
                            print_high.print(var486, (SubLObject)module0305.UNPROVIDED);
                            print_high.print(var481, (SubLObject)module0305.UNPROVIDED);
                            Errors.sublisp_break((SubLObject)module0305.$ic256$, module0305.EMPTY_SUBL_OBJECT_ARRAY);
                        }
                        var485 = var485.rest();
                        var486 = var485.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var483);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var480, var475);
            module0012.$g77$.rebind(var479, var475);
            module0012.$g76$.rebind(var478, var475);
            module0012.$g75$.rebind(var477, var475);
        }
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20625() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20316", "S#22982", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20317", "S#22983", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20318", "S#22984", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20320", "S#22985", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20321", "S#22986", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20322", "S#22987", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20325", "S#22988", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20326", "S#22989", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20327", "S#22990", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20328", "S#22991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20329", "S#22992", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20330", "S#22993", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20331", "S#22994", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20332", "S#22995", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20333", "S#22996", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20334", "S#22997", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20335", "S#22998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20339", "S#22999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20337", "S#22670", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20342", "S#23000", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20343", "S#23001", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20341", "S#23002", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20340", "S#22674", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20351", "S#23003", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20352", "S#23004", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20350", "S#23005", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20355", "S#23006", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20356", "S#23007", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20357", "S#23008", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20358", "S#23009", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20344", "S#23010", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20361", "S#23011", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20362", "S#23012", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20363", "S#23013", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20347", "S#23014", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20364", "S#23015", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20367", "S#23016", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20366", "S#23017", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20346", "S#23018", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20369", "S#23019", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20370", "S#23020", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20353", "S#23021", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20372", "S#23022", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20371", "S#23023", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20375", "S#23024", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20376", "S#23025", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20377", "S#23026", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20378", "S#23027", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20373", "S#23028", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20379", "S#23029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20382", "S#23030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20349", "S#23031", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20384", "S#23032", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20385", "S#23033", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20383", "S#23034", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20354", "S#22677", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20391", "S#23035", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20392", "S#23036", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20390", "S#23037", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20394", "S#23038", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20395", "S#23039", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20386", "S#23040", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20396", "S#23041", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20397", "S#23042", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20389", "S#23043", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20388", "S#23044", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20398", "S#23045", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20399", "S#23046", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20393", "S#23047", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20400", "S#23048", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20401", "S#23049", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20402", "S#23050", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20403", "S#23051", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20404", "S#23052", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20405", "S#23053", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20406", "S#23054", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20407", "S#23055", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20409", "S#23056", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20336", "S#23057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20338", "S#23058", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20410", "S#23059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20411", "S#23060", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20412", "S#23061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20381", "S#23062", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20380", "S#23063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20413", "S#23064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20414", "S#23065", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20415", "S#20273", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20416", "S#23066", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20368", "S#23067", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20360", "S#23068", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20419", "S#23069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20417", "S#23070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20420", "S#23071", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20421", "S#23072", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20418", "S#23073", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20423", "S#22676", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20424", "S#23074", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20425", "S#23075", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20426", "S#23076", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20365", "S#23077", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20427", "S#23078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20429", "S#23079", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20430", "S#23080", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20428", "S#23081", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20431", "S#23082", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20432", "S#23083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20433", "S#23084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20434", "S#23085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20435", "S#23086", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20359", "S#20997", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20422", "S#23087", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20374", "S#22678", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20348", "S#12452", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20436", "S#23088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20437", "S#22672", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20438", "S#13267", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20439", "S#23089", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20440", "S#23090", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20441", "S#23091", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20442", "S#23092", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20443", "S#23093", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20444", "S#20650", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20445", "S#23094", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20446", "S#23095", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20447", "S#23096", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20448", "S#23097", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20449", "S#23098", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20450", "S#19518", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20451", "S#23099", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20452", "S#23100", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20453", "S#19520", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20454", "S#23101", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20455", "S#23102", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20456", "S#23103", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20457", "S#23104", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20458", "S#23105", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20460", "S#19512", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20462", "S#23106", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20463", "S#23107", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20459", "S#23108", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20461", "S#23109", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20464", "S#22927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20465", "S#23110", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20466", "S#23111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20467", "S#23112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20324", "S#23113", 2, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20408", "S#23114", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20468", "S#23115", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20469", "S#23116", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20470", "S#23117", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20471", "S#23118", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20473", "S#23119", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20475", "S#23120", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20476", "S#23121", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20477", "S#23122", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20472", "S#23123", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20479", "S#23124", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20482", "S#23125", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20480", "S#23126", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20481", "S#23127", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20474", "S#23128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20478", "S#23129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20345", "S#17593", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20483", "SUF-DEFN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20484", "S#23130", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20485", "S#19513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20486", "S#23131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20487", "S#23132", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20488", "ADD-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20490", "ADD-IFF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20489", "OLD-ADD-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20492", "REMOVE-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20494", "REMOVE-IFF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20493", "OLD-REMOVE-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20496", "S#23133", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20497", "S#23134", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20491", "S#23135", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20499", "S#23136", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20500", "S#23137", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20495", "S#23138", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20498", "S#23139", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20501", "S#23140", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20504", "S#19273", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20506", "S#23141", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20507", "S#23142", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20505", "S#23143", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20509", "S#19279", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20511", "S#23144", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20512", "S#23145", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20510", "S#23146", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20502", "S#23147", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20503", "S#23148", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20508", "S#23149", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20513", "S#23150", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20514", "S#23151", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20515", "S#23152", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20516", "S#23153", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20323", "S#23154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20517", "S#23155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20319", "S#23156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20518", "S#23157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20519", "S#23158", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20520", "S#23159", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20387", "S#23160", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20521", "S#23161", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20522", "S#23162", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20523", "S#19519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20524", "S#23163", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20525", "S#23164", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20526", "S#22675", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20527", "S#23165", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20528", "S#23166", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20529", "S#23167", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20530", "S#20822", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20531", "ADD-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20533", "ADD-IFF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20532", "OLD-ADD-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20535", "REMOVE-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20537", "REMOVE-IFF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20536", "OLD-REMOVE-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20539", "S#23168", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20540", "S#23169", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20534", "S#23170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20542", "S#23171", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20543", "S#23172", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20538", "S#23173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20541", "S#23174", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20544", "S#23175", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20547", "S#19274", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20549", "S#23176", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20550", "S#23177", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20548", "S#23178", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20552", "S#19280", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20554", "S#23179", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20555", "S#23180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20553", "S#23181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20545", "S#23182", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20546", "S#23183", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20551", "S#23184", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20556", "S#23185", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20557", "S#23186", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20558", "S#23187", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20559", "S#23188", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20560", "S#23189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20561", "S#23190", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20562", "S#23191", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20563", "S#23192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20564", "S#23193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20565", "S#23194", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20566", "S#23195", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20567", "S#23196", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20568", "S#23197", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20569", "S#19514", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20571", "S#23198", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20570", "S#23199", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20572", "S#23200", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20573", "S#23201", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20574", "S#23202", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20575", "ADD-SUF-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20577", "REMOVE-SUF-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20579", "ADD-SUF-QUOTED-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20580", "REMOVE-SUF-QUOTED-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20576", "ADD-SUF-FUNCTION-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20578", "REMOVE-SUF-FUNCTION-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20583", "S#23203", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20584", "S#23204", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20581", "S#23205", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20586", "S#23206", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20587", "S#23207", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20582", "S#23208", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20585", "S#23209", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20588", "S#23210", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20592", "S#23211", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20593", "S#23212", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20595", "S#19275", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20596", "S#23213", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20597", "S#23214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20599", "S#19281", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20589", "S#23215", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20591", "S#23216", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20594", "S#23217", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20598", "S#23218", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20600", "S#23219", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20601", "S#23220", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20602", "S#23221", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20604", "S#23222", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20606", "S#23223", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20607", "S#23224", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20608", "S#23225", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20609", "S#23226", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20603", "S#23227", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20605", "S#23228", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20610", "S#23229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20590", "S#23230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20611", "S#23231", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20612", "S#23232", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20613", "S#23233", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20614", "S#23234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20615", "S#23235", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20616", "S#23236", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20617", "S#23237", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20618", "S#23238", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20619", "S#23239", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20620", "S#23240", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20621", "S#23241", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20622", "S#23242", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20623", "S#23243", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0305", "f20624", "S#23244", 1, 0, false);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20626() {
        module0305.$g2728$ = SubLFiles.defvar("S#23245", (SubLObject)module0305.T);
        module0305.$g2729$ = SubLFiles.defparameter("S#23246", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2730$ = SubLFiles.defparameter("S#23247", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2731$ = SubLFiles.defparameter("S#23248", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2732$ = SubLFiles.defparameter("S#23249", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2733$ = SubLFiles.defparameter("S#23250", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2734$ = SubLFiles.defparameter("S#23251", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2735$ = SubLFiles.defparameter("S#23252", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2736$ = SubLFiles.defparameter("S#23253", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2737$ = SubLFiles.defparameter("S#23254", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2738$ = SubLFiles.defparameter("S#23255", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2739$ = SubLFiles.defparameter("S#23256", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2740$ = SubLFiles.defparameter("S#23257", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2741$ = SubLFiles.defparameter("S#23258", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2742$ = SubLFiles.defparameter("S#23259", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2743$ = SubLFiles.deflexical("S#23260", (SubLObject)module0305.NIL);
        module0305.$g2744$ = SubLFiles.defparameter("S#23261", (SubLObject)module0305.NIL);
        module0305.$g2745$ = SubLFiles.defparameter("S#23262", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2746$ = SubLFiles.defparameter("S#23263", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2747$ = SubLFiles.defparameter("S#23264", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2748$ = SubLFiles.defparameter("S#23265", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2749$ = SubLFiles.defparameter("S#23266", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2750$ = SubLFiles.defparameter("S#23267", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2751$ = SubLFiles.defparameter("S#23268", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2752$ = SubLFiles.defparameter("S#23269", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2753$ = SubLFiles.defparameter("S#23270", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2754$ = SubLFiles.defparameter("S#23271", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2755$ = SubLFiles.defparameter("S#23272", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2756$ = SubLFiles.defparameter("S#23273", Hashtables.make_hash_table((SubLObject)module0305.EIGHT_INTEGER, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
        module0305.$g2757$ = SubLFiles.defparameter("S#23274", (SubLObject)module0305.NIL);
        module0305.$g2758$ = SubLFiles.defparameter("S#23275", (SubLObject)module0305.NIL);
        module0305.$g2759$ = SubLFiles.defparameter("S#23276", (SubLObject)module0305.NIL);
        module0305.$g2760$ = SubLFiles.defparameter("S#23277", (SubLObject)module0305.NIL);
        module0305.$g2761$ = SubLFiles.defparameter("S#23278", (SubLObject)module0305.NIL);
        module0305.$g2762$ = SubLFiles.defparameter("S#23279", (SubLObject)module0305.NIL);
        return (SubLObject)module0305.NIL;
    }
    
    public static SubLObject f20627() {
        SubLObject var49 = (SubLObject)module0305.$ic3$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20342();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2729$.getDynamicValue(), (SubLObject)module0305.$ic13$);
        SubLObject var50 = module0144.$g1868$.getDynamicValue();
        SubLObject var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic11$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2729$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic14$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20351();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2730$.getDynamicValue(), (SubLObject)module0305.$ic16$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic15$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2730$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic17$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20357();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2731$.getDynamicValue(), (SubLObject)module0305.$ic19$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic18$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2731$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic26$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20362();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2732$.getDynamicValue(), (SubLObject)module0305.$ic28$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic27$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2732$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic31$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20369();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2733$.getDynamicValue(), (SubLObject)module0305.$ic33$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic32$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2733$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic51$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20375();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2734$.getDynamicValue(), (SubLObject)module0305.$ic53$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic52$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2734$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic57$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20384();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2735$.getDynamicValue(), (SubLObject)module0305.$ic59$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic58$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2735$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic60$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20391();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2736$.getDynamicValue(), (SubLObject)module0305.$ic62$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic61$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2736$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic63$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20394();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2737$.getDynamicValue(), (SubLObject)module0305.$ic65$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic64$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2737$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic67$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20396();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2738$.getDynamicValue(), (SubLObject)module0305.$ic69$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic68$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2738$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic70$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20398();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2739$.getDynamicValue(), (SubLObject)module0305.$ic72$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic71$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2739$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic74$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20401();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2740$.getDynamicValue(), (SubLObject)module0305.$ic76$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic75$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2740$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic80$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20420();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2741$.getDynamicValue(), (SubLObject)module0305.$ic83$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic82$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2741$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic87$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20429();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2742$.getDynamicValue(), (SubLObject)module0305.$ic89$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic88$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2742$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        module0034.f1909((SubLObject)module0305.$ic90$);
        module0034.f1895((SubLObject)module0305.$ic100$);
        module0012.f416((SubLObject)module0305.$ic145$);
        module0012.f416((SubLObject)module0305.$ic146$);
        module0012.f416((SubLObject)module0305.$ic151$);
        module0012.f416((SubLObject)module0305.$ic152$);
        module0012.f416((SubLObject)module0305.$ic153$);
        module0012.f416((SubLObject)module0305.$ic154$);
        var49 = (SubLObject)module0305.$ic155$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20496();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2745$.getDynamicValue(), (SubLObject)module0305.$ic158$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic157$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2745$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic159$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20499();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2746$.getDynamicValue(), (SubLObject)module0305.$ic161$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic160$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2746$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic164$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20506();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2747$.getDynamicValue(), (SubLObject)module0305.$ic167$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic166$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2747$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic168$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20511();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2748$.getDynamicValue(), (SubLObject)module0305.$ic170$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic169$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2748$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        module0012.f416((SubLObject)module0305.$ic180$);
        module0012.f416((SubLObject)module0305.$ic181$);
        module0012.f416((SubLObject)module0305.$ic183$);
        module0012.f416((SubLObject)module0305.$ic184$);
        module0012.f416((SubLObject)module0305.$ic185$);
        module0012.f416((SubLObject)module0305.$ic186$);
        var49 = (SubLObject)module0305.$ic187$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20539();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2749$.getDynamicValue(), (SubLObject)module0305.$ic189$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic188$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2749$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic190$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20542();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2750$.getDynamicValue(), (SubLObject)module0305.$ic192$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic191$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2750$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic196$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20549();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2751$.getDynamicValue(), (SubLObject)module0305.$ic198$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic197$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2751$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic199$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20554();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2752$.getDynamicValue(), (SubLObject)module0305.$ic201$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic200$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2752$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        module0012.f416((SubLObject)module0305.$ic209$);
        module0012.f416((SubLObject)module0305.$ic210$);
        module0012.f416((SubLObject)module0305.$ic211$);
        module0012.f416((SubLObject)module0305.$ic212$);
        module0012.f416((SubLObject)module0305.$ic217$);
        module0012.f416((SubLObject)module0305.$ic218$);
        var49 = (SubLObject)module0305.$ic219$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20583();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2753$.getDynamicValue(), (SubLObject)module0305.$ic222$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic221$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2753$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic223$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20586();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2754$.getDynamicValue(), (SubLObject)module0305.$ic225$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic224$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2754$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic232$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20592();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2755$.getDynamicValue(), (SubLObject)module0305.$ic234$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic233$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2755$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var49 = (SubLObject)module0305.$ic236$;
        if (module0305.NIL == conses_high.member(var49, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0305.EQL), Symbols.symbol_function((SubLObject)module0305.IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var49, module0012.$g57$.getGlobalValue()));
        }
        f20596();
        Hashtables.sethash((SubLObject)module0305.$ic12$, module0305.$g2756$.getDynamicValue(), (SubLObject)module0305.$ic238$);
        var50 = module0144.$g1868$.getDynamicValue();
        var51 = (SubLObject)module0305.NIL;
        var51 = var50.first();
        while (module0305.NIL != var50) {
            if (module0305.$ic237$ == Hashtables.gethash((SubLObject)module0305.$ic10$, var51, (SubLObject)module0305.UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var51, module0144.$g1868$.getDynamicValue(), (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED, (SubLObject)module0305.UNPROVIDED));
                Hashtables.clrhash(var51);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons(module0305.$g2756$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        return (SubLObject)module0305.NIL;
    }
    
    public void declareFunctions() {
        f20625();
    }
    
    public void initializeVariables() {
        f20626();
    }
    
    public void runTopLevelForms() {
        f20627();
    }
    
    static {
        me = (SubLFile)new module0305();
        module0305.$g2728$ = null;
        module0305.$g2729$ = null;
        module0305.$g2730$ = null;
        module0305.$g2731$ = null;
        module0305.$g2732$ = null;
        module0305.$g2733$ = null;
        module0305.$g2734$ = null;
        module0305.$g2735$ = null;
        module0305.$g2736$ = null;
        module0305.$g2737$ = null;
        module0305.$g2738$ = null;
        module0305.$g2739$ = null;
        module0305.$g2740$ = null;
        module0305.$g2741$ = null;
        module0305.$g2742$ = null;
        module0305.$g2743$ = null;
        module0305.$g2744$ = null;
        module0305.$g2745$ = null;
        module0305.$g2746$ = null;
        module0305.$g2747$ = null;
        module0305.$g2748$ = null;
        module0305.$g2749$ = null;
        module0305.$g2750$ = null;
        module0305.$g2751$ = null;
        module0305.$g2752$ = null;
        module0305.$g2753$ = null;
        module0305.$g2754$ = null;
        module0305.$g2755$ = null;
        module0305.$g2756$ = null;
        module0305.$g2757$ = null;
        module0305.$g2758$ = null;
        module0305.$g2759$ = null;
        module0305.$g2760$ = null;
        module0305.$g2761$ = null;
        module0305.$g2762$ = null;
        $ic0$ = SubLObjectFactory.makeString("~%(remove-sufficent-defn ~a ~a)");
        $ic1$ = SubLObjectFactory.makeKeyword("ADMITTED");
        $ic2$ = SubLObjectFactory.makeKeyword("REJECTED");
        $ic3$ = SubLObjectFactory.makeSymbol("S#23246", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("CALLS");
        $ic5$ = SubLObjectFactory.makeKeyword("TIMES");
        $ic6$ = SubLObjectFactory.makeKeyword("RESULTS");
        $ic7$ = SubLObjectFactory.makeKeyword("ARGS");
        $ic8$ = SubLObjectFactory.makeKeyword("ARG-LIST");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic10$ = SubLObjectFactory.makeKeyword("FUNCTION");
        $ic11$ = SubLObjectFactory.makeSymbol("S#23002", "CYC");
        $ic12$ = SubLObjectFactory.makeKeyword("RESET");
        $ic13$ = SubLObjectFactory.makeSymbol("S#23000", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#23247", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#23005", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#23003", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#23248", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#23010", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#23008", "CYC");
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("defnIff"));
        $ic21$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic22$ = SubLObjectFactory.makeKeyword("VIA-GENL-PRED");
        $ic23$ = SubLObjectFactory.makeKeyword("AT-CONSTRAINT-GAF");
        $ic24$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-QUOTED-IFF-DEFN");
        $ic25$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-IFF-DEFN");
        $ic26$ = SubLObjectFactory.makeSymbol("S#23249", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#23014", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#23012", "CYC");
        $ic29$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-QUOTED-SUF-DEFNS");
        $ic30$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-SUF-DEFNS");
        $ic31$ = SubLObjectFactory.makeSymbol("S#23250", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#23021", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#23019", "CYC");
        $ic34$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic35$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic36$ = SubLObjectFactory.makeKeyword("STACK");
        $ic37$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic38$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic39$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic40$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic41$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic42$ = SubLObjectFactory.makeString("continue anyway");
        $ic43$ = SubLObjectFactory.makeKeyword("WARN");
        $ic44$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic45$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic46$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("defnIff")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("defnNecessary")));
        $ic47$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic48$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic49$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic50$ = SubLObjectFactory.makeKeyword("GAF");
        $ic51$ = SubLObjectFactory.makeSymbol("S#23251", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#23026", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#23024", "CYC");
        $ic54$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("defnNecessary"));
        $ic55$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-QUOTED-NEC-DEFN");
        $ic56$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-NEC-DEFN");
        $ic57$ = SubLObjectFactory.makeSymbol("S#23252", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#23034", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#23032", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#23253", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#23037", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#23035", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#23254", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#23040", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#23038", "CYC");
        $ic66$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedDefnIff"));
        $ic67$ = SubLObjectFactory.makeSymbol("S#23255", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#23043", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#23041", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#23256", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#23047", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#23045", "CYC");
        $ic73$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedDefnIff")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedDefnNecessary")));
        $ic74$ = SubLObjectFactory.makeSymbol("S#23257", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#23051", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#23049", "CYC");
        $ic77$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedDefnNecessary"));
        $ic78$ = SubLObjectFactory.makeString("defn-stack consistency error.  Expected ~s to be on the top of the stack, but instead got ~s.");
        $ic79$ = SubLObjectFactory.makeString("recursive call of defn ~a with argument ~a");
        $ic80$ = SubLObjectFactory.makeSymbol("S#23258", "CYC");
        $ic81$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12453", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"));
        $ic82$ = SubLObjectFactory.makeSymbol("S#23073", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#23071", "CYC");
        $ic84$ = SubLObjectFactory.makeString("~%defn test: term ~s; defn ~s of collection ~s: ~s");
        $ic85$ = SubLObjectFactory.makeString("~%defn test: term ~s; defn ~s of collection ~s (via ~s): ~s");
        $ic86$ = SubLObjectFactory.makeString("recursive call of quoted defn ~a with argument ~a");
        $ic87$ = SubLObjectFactory.makeSymbol("S#23259", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#23081", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#23079", "CYC");
        $ic90$ = SubLObjectFactory.makeSymbol("S#23085", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("S#23260", "CYC");
        $ic92$ = SubLObjectFactory.makeInteger(24);
        $ic93$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic94$ = SubLObjectFactory.makeString("~s has invalid defn: ~s");
        $ic95$ = SubLObjectFactory.makeString("invalid defn: ~s");
        $ic96$ = SubLObjectFactory.makeString("~s has non-viable defn: ~s");
        $ic97$ = SubLObjectFactory.makeString("non-viable defn: ~s");
        $ic98$ = SubLObjectFactory.makeSymbol("S#12629", "CYC");
        $ic99$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23280", "CYC"));
        $ic100$ = SubLObjectFactory.makeSymbol("S#23091", "CYC");
        $ic101$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic102$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Function-Denotational"));
        $ic103$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SpecsFn"));
        $ic104$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic105$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB")));
        $ic106$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic107$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic108$ = SubLObjectFactory.makeKeyword("ISA");
        $ic109$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic110$ = SubLObjectFactory.makeKeyword("GENLS");
        $ic111$ = SubLObjectFactory.makeKeyword("DEFN");
        $ic112$ = SubLObjectFactory.makeKeyword("DISJOINTWITH");
        $ic113$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $ic114$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic115$ = SubLObjectFactory.makeInteger(64);
        $ic116$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("defnSufficient"));
        $ic117$ = SubLObjectFactory.makeSymbol("S#23111", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("S#23112", "CYC");
        $ic119$ = SubLObjectFactory.makeString("~%warn: ");
        $ic120$ = SubLObjectFactory.makeSymbol("WARN");
        $ic121$ = SubLObjectFactory.makeString("~%~%defn module meters ");
        $ic122$ = SubLObjectFactory.makeInteger(27);
        $ic123$ = SubLObjectFactory.makeString("*");
        $ic124$ = SubLObjectFactory.makeString("~%  ~a :");
        $ic125$ = SubLObjectFactory.makeString("function");
        $ic126$ = SubLObjectFactory.makeString(" [ calls ] ");
        $ic127$ = SubLObjectFactory.makeString(" [ total time ] ");
        $ic128$ = SubLObjectFactory.makeString(" [  avg time  ] ");
        $ic129$ = SubLObjectFactory.makeString("~s");
        $ic130$ = SubLObjectFactory.makeSymbol("+");
        $ic131$ = SubLObjectFactory.makeString("   ~a   ");
        $ic132$ = SubLObjectFactory.makeString("~a");
        $ic133$ = SubLObjectFactory.makeString(" ");
        $ic134$ = SubLObjectFactory.makeInteger(46);
        $ic135$ = SubLObjectFactory.makeString("~s ");
        $ic136$ = SubLObjectFactory.makeString("~%~%~a");
        $ic137$ = SubLObjectFactory.makeInteger(37);
        $ic138$ = SubLObjectFactory.makeString("~%  [ call ]");
        $ic139$ = SubLObjectFactory.makeString(" [ ~a ] ");
        $ic140$ = SubLObjectFactory.makeString(" [  result  ] ");
        $ic141$ = SubLObjectFactory.makeString(" [   time   ] ");
        $ic142$ = SubLObjectFactory.makeString("~% ~a");
        $ic143$ = SubLObjectFactory.makeString("total");
        $ic144$ = SubLObjectFactory.makeSymbol("S#2879", "CYC");
        $ic145$ = SubLObjectFactory.makeSymbol("ADD-SUF-DEFN");
        $ic146$ = SubLObjectFactory.makeSymbol("ADD-IFF-DEFN");
        $ic147$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic148$ = SubLObjectFactory.makeString("skip defn op");
        $ic149$ = SubLObjectFactory.makeString("~s is not a collection in ~s");
        $ic150$ = SubLObjectFactory.makeString("~s is not a symbol");
        $ic151$ = SubLObjectFactory.makeSymbol("OLD-ADD-SUF-DEFN");
        $ic152$ = SubLObjectFactory.makeSymbol("REMOVE-SUF-DEFN");
        $ic153$ = SubLObjectFactory.makeSymbol("REMOVE-IFF-DEFN");
        $ic154$ = SubLObjectFactory.makeSymbol("OLD-REMOVE-SUF-DEFN");
        $ic155$ = SubLObjectFactory.makeSymbol("S#23262", "CYC");
        $ic156$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"));
        $ic157$ = SubLObjectFactory.makeSymbol("S#23135", "CYC");
        $ic158$ = SubLObjectFactory.makeSymbol("S#23133", "CYC");
        $ic159$ = SubLObjectFactory.makeSymbol("S#23263", "CYC");
        $ic160$ = SubLObjectFactory.makeSymbol("S#23138", "CYC");
        $ic161$ = SubLObjectFactory.makeSymbol("S#23136", "CYC");
        $ic162$ = SubLObjectFactory.makeString("~%(add-sufficent-defn ~a ~a)");
        $ic163$ = SubLObjectFactory.makeString("removed sufficient defn not found in cache: ~s");
        $ic164$ = SubLObjectFactory.makeSymbol("S#23264", "CYC");
        $ic165$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12109", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12112", "CYC"));
        $ic166$ = SubLObjectFactory.makeSymbol("S#23143", "CYC");
        $ic167$ = SubLObjectFactory.makeSymbol("S#23141", "CYC");
        $ic168$ = SubLObjectFactory.makeSymbol("S#23265", "CYC");
        $ic169$ = SubLObjectFactory.makeSymbol("S#23146", "CYC");
        $ic170$ = SubLObjectFactory.makeSymbol("S#23144", "CYC");
        $ic171$ = SubLObjectFactory.makeSymbol("S#23151", "CYC");
        $ic172$ = SubLObjectFactory.makeSymbol("S#23152", "CYC");
        $ic173$ = SubLObjectFactory.makeSymbol("S#23153", "CYC");
        $ic174$ = SubLObjectFactory.makeSymbol("S#22987", "CYC");
        $ic175$ = SubLObjectFactory.makeSymbol("S#14110", "CYC");
        $ic176$ = SubLObjectFactory.makeSymbol(">");
        $ic177$ = SubLObjectFactory.makeSymbol("S#23155", "CYC");
        $ic178$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("defnIff")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("defnSufficient")));
        $ic179$ = SubLObjectFactory.makeString("Initializing sufficient defns cache...");
        $ic180$ = SubLObjectFactory.makeSymbol("ADD-SUF-QUOTED-DEFN");
        $ic181$ = SubLObjectFactory.makeSymbol("ADD-IFF-QUOTED-DEFN");
        $ic182$ = SubLObjectFactory.makeString("skip quoted defn op");
        $ic183$ = SubLObjectFactory.makeSymbol("OLD-ADD-SUF-QUOTED-DEFN");
        $ic184$ = SubLObjectFactory.makeSymbol("REMOVE-SUF-QUOTED-DEFN");
        $ic185$ = SubLObjectFactory.makeSymbol("REMOVE-IFF-QUOTED-DEFN");
        $ic186$ = SubLObjectFactory.makeSymbol("OLD-REMOVE-SUF-QUOTED-DEFN");
        $ic187$ = SubLObjectFactory.makeSymbol("S#23266", "CYC");
        $ic188$ = SubLObjectFactory.makeSymbol("S#23170", "CYC");
        $ic189$ = SubLObjectFactory.makeSymbol("S#23168", "CYC");
        $ic190$ = SubLObjectFactory.makeSymbol("S#23267", "CYC");
        $ic191$ = SubLObjectFactory.makeSymbol("S#23173", "CYC");
        $ic192$ = SubLObjectFactory.makeSymbol("S#23171", "CYC");
        $ic193$ = SubLObjectFactory.makeString("~%(add-sufficent-quoted-defn ~a ~a)");
        $ic194$ = SubLObjectFactory.makeString("removed sufficient quoted defn not found in cache: ~s");
        $ic195$ = SubLObjectFactory.makeString("~%(remove-sufficent-quoted-defn ~a ~a)");
        $ic196$ = SubLObjectFactory.makeSymbol("S#23268", "CYC");
        $ic197$ = SubLObjectFactory.makeSymbol("S#23178", "CYC");
        $ic198$ = SubLObjectFactory.makeSymbol("S#23176", "CYC");
        $ic199$ = SubLObjectFactory.makeSymbol("S#23269", "CYC");
        $ic200$ = SubLObjectFactory.makeSymbol("S#23181", "CYC");
        $ic201$ = SubLObjectFactory.makeSymbol("S#23179", "CYC");
        $ic202$ = SubLObjectFactory.makeSymbol("S#23186", "CYC");
        $ic203$ = SubLObjectFactory.makeSymbol("S#23187", "CYC");
        $ic204$ = SubLObjectFactory.makeSymbol("S#23188", "CYC");
        $ic205$ = SubLObjectFactory.makeSymbol("S#22995", "CYC");
        $ic206$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedDefnIff")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedDefnSufficient")));
        $ic207$ = SubLObjectFactory.makeString("Initializing sufficient quoted defns cache...");
        $ic208$ = SubLObjectFactory.makeKeyword("QUOTED-ISA");
        $ic209$ = SubLObjectFactory.makeSymbol("ADD-SUF-FUNCTION");
        $ic210$ = SubLObjectFactory.makeSymbol("REMOVE-SUF-FUNCTION");
        $ic211$ = SubLObjectFactory.makeSymbol("ADD-SUF-QUOTED-FUNCTION");
        $ic212$ = SubLObjectFactory.makeSymbol("REMOVE-SUF-QUOTED-FUNCTION");
        $ic213$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluationResultQuotedIsa"));
        $ic214$ = SubLObjectFactory.makeString("oh well...");
        $ic215$ = SubLObjectFactory.makeString("~s is not a evaluatable functor in ~s");
        $ic216$ = SubLObjectFactory.makeString("~s is not a functor in ~s");
        $ic217$ = SubLObjectFactory.makeSymbol("ADD-SUF-FUNCTION-INT");
        $ic218$ = SubLObjectFactory.makeSymbol("REMOVE-SUF-FUNCTION-INT");
        $ic219$ = SubLObjectFactory.makeSymbol("S#23270", "CYC");
        $ic220$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $ic221$ = SubLObjectFactory.makeSymbol("S#23205", "CYC");
        $ic222$ = SubLObjectFactory.makeSymbol("S#23203", "CYC");
        $ic223$ = SubLObjectFactory.makeSymbol("S#23271", "CYC");
        $ic224$ = SubLObjectFactory.makeSymbol("S#23208", "CYC");
        $ic225$ = SubLObjectFactory.makeSymbol("S#23206", "CYC");
        $ic226$ = SubLObjectFactory.makeString("~%(~a ~a ~a)");
        $ic227$ = SubLObjectFactory.makeString("add-sufficient-function");
        $ic228$ = SubLObjectFactory.makeString("add-sufficient-quoted-function");
        $ic229$ = SubLObjectFactory.makeString("removed sufficient function not found in cache: ~s");
        $ic230$ = SubLObjectFactory.makeString("remove-sufficient-function");
        $ic231$ = SubLObjectFactory.makeString("remove-sufficient-quoted-function");
        $ic232$ = SubLObjectFactory.makeSymbol("S#23272", "CYC");
        $ic233$ = SubLObjectFactory.makeSymbol("S#19275", "CYC");
        $ic234$ = SubLObjectFactory.makeSymbol("S#23211", "CYC");
        $ic235$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), (SubLObject)SubLObjectFactory.makeKeyword("QUOTED-ISA"));
        $ic236$ = SubLObjectFactory.makeSymbol("S#23273", "CYC");
        $ic237$ = SubLObjectFactory.makeSymbol("S#19281", "CYC");
        $ic238$ = SubLObjectFactory.makeSymbol("S#23213", "CYC");
        $ic239$ = SubLObjectFactory.makeSymbol("S#23219", "CYC");
        $ic240$ = SubLObjectFactory.makeSymbol("S#23223", "CYC");
        $ic241$ = SubLObjectFactory.makeSymbol("S#23220", "CYC");
        $ic242$ = SubLObjectFactory.makeSymbol("S#23224", "CYC");
        $ic243$ = SubLObjectFactory.makeSymbol("S#23221", "CYC");
        $ic244$ = SubLObjectFactory.makeSymbol("S#23225", "CYC");
        $ic245$ = SubLObjectFactory.makeSymbol("S#23222", "CYC");
        $ic246$ = SubLObjectFactory.makeSymbol("S#23226", "CYC");
        $ic247$ = SubLObjectFactory.makeString("~%(add-sufficent-function ~a ~a)");
        $ic248$ = SubLObjectFactory.makeString("remove-sufficent-function");
        $ic249$ = SubLObjectFactory.makeSymbol("S#23231", "CYC");
        $ic250$ = SubLObjectFactory.makeSymbol("GAF-ARG2");
        $ic251$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("resultIsa")));
        $ic252$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluationResultQuotedIsa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("resultQuotedIsa")));
        $ic253$ = SubLObjectFactory.makeString("Initializing sufficient functions cache...");
        $ic254$ = SubLObjectFactory.makeString("Initializing sufficient quoted functions cache...");
        $ic255$ = SubLObjectFactory.makeString("cdohash");
        $ic256$ = SubLObjectFactory.makeString("stop");
        $ic257$ = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $ic258$ = SubLObjectFactory.makeString("diagnostics: sufficient-functions-cache");
        $ic259$ = SubLObjectFactory.makeString("~%*suf-function-cache-mal-keys* : ~a");
        $ic260$ = SubLObjectFactory.makeString("~%*suf-function-cache-key-w/o-value* : ~a");
        $ic261$ = SubLObjectFactory.makeString("~%*suf-function-cache-key-w/mal-value* : ~a");
        $ic262$ = SubLObjectFactory.makeString("~%*suf-function-cache-key-w/stale-value* : ~a");
        $ic263$ = SubLObjectFactory.makeString("~%*suf-function-cache-keys-w/o-inerited-value* : ~a");
        $ic264$ = SubLObjectFactory.makeString("~%*suf-function-cache-awol-direct-assertions* : ~a");
        $ic265$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFunction"));
        $ic266$ = SubLObjectFactory.makeString("mapping skolems");
        $ic267$ = SubLObjectFactory.makeString("~a ");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0305.class
	Total time: 6620 ms
	
	Decompiled with Procyon 0.5.32.
*/