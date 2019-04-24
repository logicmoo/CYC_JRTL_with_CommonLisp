package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0217 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0217";
    public static final String myFingerPrint = "8ea99b1c332f7f3ca7398a5f2de91f57a9caee257d39acc2246abee51f4f2322";
    private static SubLSymbol $g2386$;
    private static SubLSymbol $g2387$;
    private static SubLSymbol $g2388$;
    private static SubLSymbol $g2389$;
    private static SubLSymbol $g2390$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLString $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLInteger $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLString $ic66$;
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
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLList $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLString $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLList $ic113$;
    private static final SubLString $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLString $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLObject $ic129$;
    private static final SubLObject $ic130$;
    private static final SubLObject $ic131$;
    private static final SubLString $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLString $ic134$;
    private static final SubLList $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLList $ic147$;
    private static final SubLList $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLObject $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLObject $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLObject $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLObject $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLObject $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLList $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLList $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLList $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLList $ic178$;
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
    private static final SubLList $ic191$;
    private static final SubLList $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLInteger $ic199$;
    private static final SubLString $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLString $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLString $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLString $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLList $ic213$;
    private static final SubLString $ic214$;
    private static final SubLList $ic215$;
    private static final SubLList $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLList $ic219$;
    private static final SubLString $ic220$;
    private static final SubLList $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLString $ic223$;
    private static final SubLList $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLList $ic228$;
    private static final SubLString $ic229$;
    private static final SubLList $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLList $ic232$;
    private static final SubLString $ic233$;
    private static final SubLList $ic234$;
    private static final SubLSymbol $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLString $ic237$;
    private static final SubLList $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLList $ic246$;
    private static final SubLObject $ic247$;
    
    public static SubLObject f14213(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = module0212.f13787(var1);
        SubLObject var4 = var2;
        SubLObject var5 = (SubLObject)module0217.NIL;
        var5 = var4.first();
        while (module0217.NIL != var4) {
            if (module0217.NIL != var5 && module0217.NIL != var3) {
                var3 = module0212.f13825(var3, var5);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var3;
    }
    
    public static SubLObject f14214(final SubLObject var1, final SubLObject var2, final SubLObject var6) {
        SubLObject var7 = (SubLObject)module0217.NIL;
        final SubLObject var8 = module0212.f13787(var1);
        f14215(var1);
        if (module0217.NIL != module0212.f13795(var1)) {
            var7 = module0214.f14136(var1, var8, var6);
        }
        else {
            var7 = module0212.f13840(var8, var2, var6);
        }
        return var7;
    }
    
    public static SubLObject f14216(final SubLObject var1, final SubLObject var2, final SubLObject var6) {
        SubLObject var7 = (SubLObject)module0217.NIL;
        final SubLObject var8 = module0212.f13787(var1);
        f14215(var1);
        if (module0217.NIL != module0212.f13795(var1)) {
            var7 = module0214.f14139(var1, var8, var6);
        }
        else {
            module0212.f13846(var8, var2, var6);
            module0214.f14137(var1);
            var7 = var6;
        }
        return var7;
    }
    
    public static SubLObject f14217() {
        return module0147.f9509();
    }
    
    public static SubLObject f14218(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        assert module0217.NIL != module0212.f13815(var9) : var9;
        if (module0217.NIL != f14217()) {
            return module0212.f13808(var9);
        }
        if (module0217.NIL != module0147.f9518()) {
            final SubLObject var11 = module0147.f9496();
            final SubLObject var12 = module0212.f13810(var9, var11);
            return (SubLObject)((module0217.NIL != var12) ? module0212.f13808(var12) : module0217.ZERO_INTEGER);
        }
        SubLObject var13 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13836(var9)) {
            SubLObject var14;
            for (var14 = module0066.f4838(module0067.f4891(module0212.f13837(var9))); module0217.NIL == module0066.f4841(var14); var14 = module0066.f4840(var14)) {
                var10.resetMultipleValues();
                final SubLObject var15 = module0066.f4839(var14);
                final SubLObject var16 = var10.secondMultipleValue();
                var10.resetMultipleValues();
                if (module0217.NIL != module0147.f9507(var15)) {
                    var13 = Numbers.add(var13, module0212.f13808(var16));
                }
            }
            module0066.f4842(var14);
        }
        return var13;
    }
    
    public static SubLObject f14219(final SubLObject var9, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        assert module0217.NIL != module0212.f13815(var9) : var9;
        assert module0217.NIL != module0004.f106(var15) : var15;
        if (module0217.NIL != f14217()) {
            return Numbers.min(var15, module0212.f13808(var9));
        }
        if (module0217.NIL != module0147.f9518()) {
            final SubLObject var17 = module0147.f9496();
            final SubLObject var18 = module0212.f13810(var9, var17);
            return (SubLObject)((module0217.NIL != var18) ? Numbers.min(var15, module0212.f13808(var18)) : module0217.ZERO_INTEGER);
        }
        SubLObject var19 = (SubLObject)module0217.ZERO_INTEGER;
        SubLObject var20 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13836(var9)) {
            SubLObject var21;
            for (var21 = module0066.f4838(module0067.f4891(module0212.f13837(var9))); module0217.NIL == var20 && module0217.NIL == module0066.f4841(var21); var21 = module0066.f4840(var21)) {
                var16.resetMultipleValues();
                final SubLObject var22 = module0066.f4839(var21);
                final SubLObject var23 = var16.secondMultipleValue();
                var16.resetMultipleValues();
                if (module0217.NIL != module0216.f14173(var19, var15)) {
                    var20 = (SubLObject)module0217.T;
                }
                else if (module0217.NIL != module0147.f9507(var22)) {
                    var19 = Numbers.add(var19, module0212.f13808(var23));
                }
            }
            module0066.f4842(var21);
        }
        return Numbers.min(var15, var19);
    }
    
    public static SubLObject f14220(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        assert module0217.NIL != module0212.f13815(var9) : var9;
        if (module0217.NIL != f14217()) {
            return module0212.f13838(var9);
        }
        if (module0217.NIL != module0147.f9518()) {
            final SubLObject var11 = module0147.f9496();
            final SubLObject var12 = module0212.f13810(var9, var11);
            return (SubLObject)((module0217.NIL != var12) ? ConsesLow.list(var11) : module0217.NIL);
        }
        SubLObject var13 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13836(var9)) {
            SubLObject var14;
            for (var14 = module0066.f4838(module0067.f4891(module0212.f13837(var9))); module0217.NIL == module0066.f4841(var14); var14 = module0066.f4840(var14)) {
                var10.resetMultipleValues();
                final SubLObject var15 = module0066.f4839(var14);
                final SubLObject var16 = var10.secondMultipleValue();
                var10.resetMultipleValues();
                if (module0217.NIL != module0147.f9507(var15)) {
                    var13 = (SubLObject)ConsesLow.cons(var15, var13);
                }
            }
            module0066.f4842(var14);
        }
        return var13;
    }
    
    public static SubLObject f14215(final SubLObject var1) {
        if (module0217.NIL != module0128.f8449(var1)) {
            final SubLObject var2 = module0128.f8440(var1);
            if (module0217.NIL != var2) {
                return module0164.f10687(var2);
            }
        }
        else if (module0217.NIL != module0167.f10813(var1)) {
            final SubLObject var2 = module0167.f10803(var1);
            if (module0217.NIL != var2) {
                return module0169.f10859(var2);
            }
        }
        else if (module0217.NIL != module0190.f11868(var1)) {
            final SubLObject var2 = module0190.f11846(var1);
            if (module0217.NIL != var2) {
                return module0189.f11820(var2);
            }
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14221(final SubLObject var1, SubLObject var19, SubLObject var20, SubLObject var11) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (var20 == module0217.UNPROVIDED) {
            var20 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        SubLObject var21 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var1)) {
            SubLObject var22 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var23 = module0212.f13799(var1);
            SubLObject var24 = (SubLObject)module0217.NIL;
            var24 = var23.first();
            while (module0217.NIL != var23) {
                if (module0217.NIL != module0214.f14088(var24, var1, var19, var20, var11)) {
                    var22 = Numbers.add(var22, (SubLObject)module0217.ONE_INTEGER);
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
            var21 = var22;
        }
        else {
            final SubLObject var25 = f14222(var1, var19, var20, var11);
            var21 = (SubLObject)((module0217.NIL != var25) ? module0212.f13808(var25) : module0217.ZERO_INTEGER);
        }
        return var21;
    }
    
    public static SubLObject f14223(final SubLObject var1, SubLObject var19, SubLObject var20) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (var20 == module0217.UNPROVIDED) {
            var20 = (SubLObject)module0217.NIL;
        }
        SubLObject var21 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var21 = f14221(var1, var19, var20, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var1)) {
            SubLObject var22 = module0212.f13799(var1);
            SubLObject var23 = (SubLObject)module0217.NIL;
            var23 = var22.first();
            while (module0217.NIL != var22) {
                if (module0217.NIL != module0214.f14088(var23, var1, var19, var20, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var23))) {
                    var21 = Numbers.add(var21, (SubLObject)module0217.ONE_INTEGER);
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
        }
        else {
            final SubLObject var24 = module0216.f14171(var19, var20, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var24.numE(Numbers.subtract((SubLObject)module0217.THREE_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var25 = f14222(var1, var19, var20, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var25) {
                    var21 = f14218(var25);
                }
            }
            else {
                final SubLObject var26 = module0216.f14181(var24, var19, var20, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var28;
                final SubLObject var27 = var28 = Functions.apply((SubLObject)module0217.$ic6$, var1, var26);
                SubLObject var29 = (SubLObject)module0217.NIL;
                var29 = var28.first();
                while (module0217.NIL != var28) {
                    var21 = Numbers.add(var21, Functions.apply((SubLObject)module0217.$ic7$, var1, ConsesLow.append(var26, (SubLObject)ConsesLow.list(var29))));
                    var28 = var28.rest();
                    var29 = var28.first();
                }
            }
        }
        return var21;
    }
    
    public static SubLObject f14224(final SubLObject var1, final SubLObject var15, SubLObject var19, SubLObject var20) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (var20 == module0217.UNPROVIDED) {
            var20 = (SubLObject)module0217.NIL;
        }
        assert module0217.NIL != module0004.f106(var15) : var15;
        SubLObject var21 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var21 = f14221(var1, var19, var20, (SubLObject)module0217.UNPROVIDED);
            if (module0217.NIL != module0216.f14173(var21, var15)) {
                var21 = var15;
            }
        }
        else if (module0217.NIL != module0212.f13795(var1)) {
            SubLObject var22 = module0212.f13799(var1);
            SubLObject var23 = (SubLObject)module0217.NIL;
            var23 = var22.first();
            while (module0217.NIL != var22) {
                if (module0217.NIL == module0216.f14173(var21, var15) && module0217.NIL != module0214.f14088(var23, var1, var19, var20, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var23))) {
                    var21 = Numbers.add(var21, (SubLObject)module0217.ONE_INTEGER);
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
        }
        else {
            final SubLObject var24 = module0216.f14171(var19, var20, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var24.numE(Numbers.subtract((SubLObject)module0217.THREE_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var25 = f14222(var1, var19, var20, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var25) {
                    var21 = f14219(var25, var15);
                }
            }
            else {
                final SubLObject var26 = module0216.f14181(var24, var19, var20, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var28;
                final SubLObject var27 = var28 = Functions.apply((SubLObject)module0217.$ic6$, var1, var26);
                SubLObject var29 = (SubLObject)module0217.NIL;
                var29 = var28.first();
                while (module0217.NIL != var28) {
                    var21 = Numbers.add(var21, Functions.apply((SubLObject)module0217.$ic10$, var1, new SubLObject[] { var15, ConsesLow.append(var26, (SubLObject)ConsesLow.list(var29)) }));
                    var28 = var28.rest();
                    var29 = var28.first();
                }
            }
        }
        return var21;
    }
    
    public static SubLObject f14225() {
        final SubLObject var35 = module0217.$g2387$.getGlobalValue();
        if (module0217.NIL != var35) {
            module0034.f1818(var35);
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14226(final SubLObject var1, SubLObject var19, SubLObject var20) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (var20 == module0217.UNPROVIDED) {
            var20 = (SubLObject)module0217.NIL;
        }
        return module0034.f1829(module0217.$g2387$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var19, var20), (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
    }
    
    public static SubLObject f14227(final SubLObject var1, final SubLObject var19, final SubLObject var20) {
        return f14228(var1, var19, var20);
    }
    
    public static SubLObject f14229(final SubLObject var1, SubLObject var19, SubLObject var20) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (var20 == module0217.UNPROVIDED) {
            var20 = (SubLObject)module0217.NIL;
        }
        SubLObject var21 = module0217.$g2387$.getGlobalValue();
        if (module0217.NIL == var21) {
            var21 = module0034.f1934((SubLObject)module0217.$ic11$, (SubLObject)module0217.$ic12$, (SubLObject)module0217.$ic13$, (SubLObject)module0217.EQ, (SubLObject)module0217.THREE_INTEGER, (SubLObject)module0217.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0217.$ic14$);
        }
        final SubLObject var22 = module0034.f1781(var1, var19, var20);
        final SubLObject var23 = module0034.f1814(var21, var22, (SubLObject)module0217.UNPROVIDED);
        if (var23 != module0217.$ic15$) {
            SubLObject var24 = var23;
            SubLObject var25 = (SubLObject)module0217.NIL;
            var25 = var24.first();
            while (module0217.NIL != var24) {
                SubLObject var26 = var25.first();
                final SubLObject var27 = conses_high.second(var25);
                if (var1.eql(var26.first())) {
                    var26 = var26.rest();
                    if (var19.eql(var26.first())) {
                        var26 = var26.rest();
                        if (module0217.NIL != var26 && module0217.NIL == var26.rest() && var20.eql(var26.first())) {
                            return module0034.f1959(var27);
                        }
                    }
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        final SubLObject var28 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f14227(var1, var19, var20)));
        module0034.f1836(var21, var22, var23, var28, (SubLObject)ConsesLow.list(var1, var19, var20));
        return module0034.f1959(var28);
    }
    
    public static SubLObject f14228(final SubLObject var1, SubLObject var19, SubLObject var20) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (var20 == module0217.UNPROVIDED) {
            var20 = (SubLObject)module0217.NIL;
        }
        SubLObject var21 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13795(var1)) {
            SubLObject var22 = (SubLObject)module0217.NIL;
            SubLObject var23 = module0212.f13799(var1);
            SubLObject var24 = (SubLObject)module0217.NIL;
            var24 = var23.first();
            while (module0217.NIL != var23) {
                var22 = module0214.f14090(var24, var22, var1, var19, var20);
                var23 = var23.rest();
                var24 = var23.first();
            }
            var21 = var22;
        }
        else {
            final SubLObject var25 = f14222(var1, var19, var20, (SubLObject)module0217.UNPROVIDED);
            var21 = (SubLObject)((module0217.NIL != module0212.f13815(var25)) ? module0212.f13838(var25) : module0217.NIL);
        }
        return var21;
    }
    
    public static SubLObject f14230(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0217.NIL;
        final SubLObject var4 = module0216.f14184(var1);
        if (module0217.NIL != module0212.f13836(var4)) {
            SubLObject var5;
            for (var5 = module0066.f4838(module0067.f4891(module0212.f13837(var4))); module0217.NIL == module0066.f4841(var5); var5 = module0066.f4840(var5)) {
                var2.resetMultipleValues();
                final SubLObject var6 = module0066.f4839(var5);
                final SubLObject var7 = var2.secondMultipleValue();
                var2.resetMultipleValues();
                if (module0217.NIL != module0216.f14185(var6)) {
                    var3 = (SubLObject)ConsesLow.cons(var7, var3);
                }
            }
            module0066.f4842(var5);
        }
        return var3;
    }
    
    public static SubLObject f14231(final SubLObject var1, SubLObject var19) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (module0217.NIL != var19) {
            return f14232(var1, var19, (SubLObject)module0217.UNPROVIDED);
        }
        final SubLObject var20 = f14233(var1);
        final SubLObject var21 = module0077.f5313(Symbols.symbol_function((SubLObject)module0217.EQL), (SubLObject)module0217.UNPROVIDED);
        SubLObject var22 = var20;
        SubLObject var23 = (SubLObject)module0217.NIL;
        var23 = var22.first();
        while (module0217.NIL != var22) {
            module0078.f5374(f14231(var1, var23), var21);
            var22 = var22.rest();
            var23 = var22.first();
        }
        return module0077.f5312(var21);
    }
    
    public static SubLObject f14233(final SubLObject var1) {
        return f14232(var1, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
    }
    
    public static SubLObject f14232(final SubLObject var1, SubLObject var19, SubLObject var20) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (var20 == module0217.UNPROVIDED) {
            var20 = (SubLObject)module0217.NIL;
        }
        SubLObject var21 = (SubLObject)module0217.NIL;
        if (module0217.NIL != f14217()) {
            var21 = f14228(var1, var19, var20);
        }
        else if (module0217.NIL != module0212.f13795(var1)) {
            SubLObject var22 = (SubLObject)module0217.NIL;
            SubLObject var23 = module0212.f13799(var1);
            SubLObject var24 = (SubLObject)module0217.NIL;
            var24 = var23.first();
            while (module0217.NIL != var23) {
                if (module0217.NIL != module0214.f14088(var24, var1, var19, var20, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var24))) {
                    var22 = module0214.f14090(var24, var22, var1, var19, var20);
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
            var21 = var22;
        }
        else {
            final SubLObject var25 = module0216.f14171(var19, var20, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var25.numE(Numbers.subtract((SubLObject)module0217.THREE_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var26 = f14222(var1, var19, var20, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var26) {
                    var21 = f14220(var26);
                }
            }
            else {
                final SubLObject var27 = module0216.f14181(var25, var19, var20, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var29;
                final SubLObject var28 = var29 = Functions.apply((SubLObject)module0217.$ic6$, var1, var27);
                SubLObject var30 = (SubLObject)module0217.NIL;
                var30 = var29.first();
                while (module0217.NIL != var29) {
                    if (Functions.apply((SubLObject)module0217.$ic7$, var1, ConsesLow.append(var27, (SubLObject)ConsesLow.list(var30))).isPositive()) {
                        var21 = (SubLObject)ConsesLow.cons(var30, var21);
                    }
                    var29 = var29.rest();
                    var30 = var29.first();
                }
            }
        }
        return var21;
    }
    
    public static SubLObject f14234(final SubLObject var1, final SubLObject var19, final SubLObject var20, SubLObject var58) {
        if (var58 == module0217.UNPROVIDED) {
            var58 = (SubLObject)module0217.NIL;
        }
        final SubLObject var59 = f14228(var1, var19, var20);
        var58 = conses_high.union(var59, var58, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
        return var58;
    }
    
    public static SubLObject f14235(final SubLObject var1, SubLObject var19, SubLObject var59, SubLObject var11) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (var59 == module0217.UNPROVIDED) {
            var59 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL != module0212.f13762(var1) && (module0217.NIL == var19 || module0217.NIL != module0004.f105(var19)) && (module0217.NIL == var59 || module0217.NIL != module0173.f10955(var59)) && (module0217.NIL == var11 || module0217.NIL != module0161.f10481(var11)));
    }
    
    public static SubLObject f14222(final SubLObject var1, SubLObject var19, SubLObject var20, SubLObject var11) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (var20 == module0217.UNPROVIDED) {
            var20 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        return f14213(var1, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic18$, var19, var20, var11));
    }
    
    public static SubLObject f14236(final SubLObject var1, final SubLObject var19, final SubLObject var20, final SubLObject var11, final SubLObject var60) {
        return f14214(var1, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic18$, var19, var20, var11), var60);
    }
    
    public static SubLObject f14237(final SubLObject var1, final SubLObject var19, final SubLObject var20, final SubLObject var11, final SubLObject var60) {
        return f14216(var1, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic18$, var19, var20, var11), var60);
    }
    
    public static SubLObject f14238(final SubLObject var1, SubLObject var19, SubLObject var61) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (var61 == module0217.UNPROVIDED) {
            var61 = (SubLObject)module0217.NIL;
        }
        SubLObject var62 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var1)) {
            SubLObject var63 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var64 = module0212.f13799(var1);
            SubLObject var65 = (SubLObject)module0217.NIL;
            var65 = var64.first();
            while (module0217.NIL != var64) {
                if (module0217.NIL != module0214.f14092(var65, var1, var19, var61)) {
                    var63 = Numbers.add(var63, (SubLObject)module0217.ONE_INTEGER);
                }
                var64 = var64.rest();
                var65 = var64.first();
            }
            var62 = var63;
        }
        else {
            final SubLObject var66 = f14239(var1, var19, var61);
            var62 = (SubLObject)((module0217.NIL != var66) ? module0212.f13808(var66) : module0217.ZERO_INTEGER);
        }
        return var62;
    }
    
    public static SubLObject f14240(final SubLObject var1, SubLObject var19, SubLObject var61) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (var61 == module0217.UNPROVIDED) {
            var61 = (SubLObject)module0217.NIL;
        }
        if (module0217.NIL != module0147.f9507(module0132.$g1558$.getGlobalValue())) {
            return f14238(var1, var19, var61);
        }
        return (SubLObject)module0217.ZERO_INTEGER;
    }
    
    public static SubLObject f14241(final SubLObject var1, final SubLObject var15, SubLObject var19, SubLObject var61) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (var61 == module0217.UNPROVIDED) {
            var61 = (SubLObject)module0217.NIL;
        }
        assert module0217.NIL != module0004.f106(var15) : var15;
        return Numbers.min(var15, f14240(var1, var19, var61));
    }
    
    public static SubLObject f14242(final SubLObject var1, SubLObject var19, SubLObject var61) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (var61 == module0217.UNPROVIDED) {
            var61 = (SubLObject)module0217.NIL;
        }
        SubLObject var62 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13795(var1)) {
            SubLObject var63 = (SubLObject)module0217.NIL;
            SubLObject var64 = module0212.f13799(var1);
            SubLObject var65 = (SubLObject)module0217.NIL;
            var65 = var64.first();
            while (module0217.NIL != var64) {
                var63 = module0214.f14094(var65, var63, var1, var19, var61);
                var64 = var64.rest();
                var65 = var64.first();
            }
            var62 = var63;
        }
        else {
            final SubLObject var66 = f14239(var1, var19, var61);
            var62 = (SubLObject)((module0217.NIL != module0212.f13815(var66)) ? module0212.f13838(var66) : module0217.NIL);
        }
        return var62;
    }
    
    public static SubLObject f14243(final SubLObject var1, SubLObject var19, SubLObject var61) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (var61 == module0217.UNPROVIDED) {
            var61 = (SubLObject)module0217.NIL;
        }
        if (module0217.NIL == module0147.f9507(module0132.$g1558$.getGlobalValue())) {
            return (SubLObject)module0217.NIL;
        }
        return f14242(var1, var19, var61);
    }
    
    public static SubLObject f14244(final SubLObject var1, final SubLObject var19, final SubLObject var61, SubLObject var58) {
        if (var58 == module0217.UNPROVIDED) {
            var58 = (SubLObject)module0217.NIL;
        }
        final SubLObject var62 = f14242(var1, var19, var61);
        var58 = conses_high.union(var62, var58, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
        return var58;
    }
    
    public static SubLObject f14239(final SubLObject var1, SubLObject var19, SubLObject var61) {
        if (var19 == module0217.UNPROVIDED) {
            var19 = (SubLObject)module0217.NIL;
        }
        if (var61 == module0217.UNPROVIDED) {
            var61 = (SubLObject)module0217.NIL;
        }
        return f14213(var1, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic26$, var19, var61));
    }
    
    public static SubLObject f14245(final SubLObject var1, final SubLObject var19, final SubLObject var61, final SubLObject var60) {
        return f14214(var1, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic26$, var19, var61), var60);
    }
    
    public static SubLObject f14246(final SubLObject var1, final SubLObject var19, final SubLObject var61, final SubLObject var60) {
        return f14216(var1, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic26$, var19, var61), var60);
    }
    
    public static SubLObject f14247(final SubLObject var20, SubLObject var11) {
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        SubLObject var21 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var20)) {
            SubLObject var22 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var23 = module0212.f13799(var20);
            SubLObject var24 = (SubLObject)module0217.NIL;
            var24 = var23.first();
            while (module0217.NIL != var23) {
                if (module0217.NIL != module0214.f14096(var24, var20, var11)) {
                    var22 = Numbers.add(var22, (SubLObject)module0217.ONE_INTEGER);
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
            var21 = var22;
        }
        else {
            final SubLObject var25 = f14248(var20, var11);
            var21 = (SubLObject)((module0217.NIL != var25) ? module0212.f13808(var25) : module0217.ZERO_INTEGER);
        }
        return var21;
    }
    
    public static SubLObject f14249(final SubLObject var20) {
        SubLObject var21 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var21 = f14247(var20, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var20)) {
            SubLObject var22 = module0212.f13799(var20);
            SubLObject var23 = (SubLObject)module0217.NIL;
            var23 = var22.first();
            while (module0217.NIL != var22) {
                if (module0217.NIL != module0214.f14096(var23, var20, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var23))) {
                    var21 = Numbers.add(var21, (SubLObject)module0217.ONE_INTEGER);
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
        }
        else {
            final SubLObject var24 = module0216.f14171((SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var24.numE(Numbers.subtract((SubLObject)module0217.ONE_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var25 = f14248(var20, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var25) {
                    var21 = f14218(var25);
                }
            }
            else {
                final SubLObject var26 = module0216.f14181(var24, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var28;
                final SubLObject var27 = var28 = Functions.apply((SubLObject)module0217.$ic30$, var20, var26);
                SubLObject var29 = (SubLObject)module0217.NIL;
                var29 = var28.first();
                while (module0217.NIL != var28) {
                    var21 = Numbers.add(var21, Functions.apply((SubLObject)module0217.$ic31$, var20, ConsesLow.append(var26, (SubLObject)ConsesLow.list(var29))));
                    var28 = var28.rest();
                    var29 = var28.first();
                }
            }
        }
        return var21;
    }
    
    public static SubLObject f14250(final SubLObject var20, final SubLObject var15) {
        assert module0217.NIL != module0004.f106(var15) : var15;
        SubLObject var21 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var21 = f14247(var20, (SubLObject)module0217.UNPROVIDED);
            if (module0217.NIL != module0216.f14173(var21, var15)) {
                var21 = var15;
            }
        }
        else if (module0217.NIL != module0212.f13795(var20)) {
            SubLObject var22 = module0212.f13799(var20);
            SubLObject var23 = (SubLObject)module0217.NIL;
            var23 = var22.first();
            while (module0217.NIL != var22) {
                if (module0217.NIL == module0216.f14173(var21, var15) && module0217.NIL != module0214.f14096(var23, var20, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var23))) {
                    var21 = Numbers.add(var21, (SubLObject)module0217.ONE_INTEGER);
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
        }
        else {
            final SubLObject var24 = module0216.f14171((SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var24.numE(Numbers.subtract((SubLObject)module0217.ONE_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var25 = f14248(var20, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var25) {
                    var21 = f14219(var25, var15);
                }
            }
            else {
                final SubLObject var26 = module0216.f14181(var24, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var28;
                final SubLObject var27 = var28 = Functions.apply((SubLObject)module0217.$ic30$, var20, var26);
                SubLObject var29 = (SubLObject)module0217.NIL;
                var29 = var28.first();
                while (module0217.NIL != var28) {
                    var21 = Numbers.add(var21, Functions.apply((SubLObject)module0217.$ic34$, var20, new SubLObject[] { var15, ConsesLow.append(var26, (SubLObject)ConsesLow.list(var29)) }));
                    var28 = var28.rest();
                    var29 = var28.first();
                }
            }
        }
        return var21;
    }
    
    public static SubLObject f14251(final SubLObject var20) {
        return Numbers.zerop(f14247(var20, (SubLObject)module0217.UNPROVIDED));
    }
    
    public static SubLObject f14252(final SubLObject var20) {
        SubLObject var21 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13795(var20)) {
            SubLObject var22 = (SubLObject)module0217.NIL;
            SubLObject var23 = module0212.f13799(var20);
            SubLObject var24 = (SubLObject)module0217.NIL;
            var24 = var23.first();
            while (module0217.NIL != var23) {
                var22 = module0214.f14098(var24, var22, var20);
                var23 = var23.rest();
                var24 = var23.first();
            }
            var21 = var22;
        }
        else {
            final SubLObject var25 = f14248(var20, (SubLObject)module0217.UNPROVIDED);
            var21 = (SubLObject)((module0217.NIL != module0212.f13815(var25)) ? module0212.f13838(var25) : module0217.NIL);
        }
        return var21;
    }
    
    public static SubLObject f14253(final SubLObject var20) {
        SubLObject var21 = (SubLObject)module0217.NIL;
        if (module0217.NIL != f14217()) {
            var21 = f14252(var20);
        }
        else if (module0217.NIL != module0212.f13795(var20)) {
            SubLObject var22 = (SubLObject)module0217.NIL;
            SubLObject var23 = module0212.f13799(var20);
            SubLObject var24 = (SubLObject)module0217.NIL;
            var24 = var23.first();
            while (module0217.NIL != var23) {
                if (module0217.NIL != module0214.f14096(var24, var20, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var24))) {
                    var22 = module0214.f14098(var24, var22, var20);
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
            var21 = var22;
        }
        else {
            final SubLObject var25 = module0216.f14171((SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var25.numE(Numbers.subtract((SubLObject)module0217.ONE_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var26 = f14248(var20, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var26) {
                    var21 = f14220(var26);
                }
            }
            else {
                final SubLObject var27 = module0216.f14181(var25, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var29;
                final SubLObject var28 = var29 = Functions.apply((SubLObject)module0217.$ic30$, var20, var27);
                SubLObject var30 = (SubLObject)module0217.NIL;
                var30 = var29.first();
                while (module0217.NIL != var29) {
                    if (Functions.apply((SubLObject)module0217.$ic31$, var20, ConsesLow.append(var27, (SubLObject)ConsesLow.list(var30))).isPositive()) {
                        var21 = (SubLObject)ConsesLow.cons(var30, var21);
                    }
                    var29 = var29.rest();
                    var30 = var29.first();
                }
            }
        }
        return var21;
    }
    
    public static SubLObject f14254() {
        return (SubLObject)module0217.$ic36$;
    }
    
    public static SubLObject f14255(final SubLObject var20, final SubLObject var11, final SubLObject var60) {
        return f14214(var20, (SubLObject)ConsesLow.list(f14254(), var11), var60);
    }
    
    public static SubLObject f14256(final SubLObject var20, final SubLObject var11, final SubLObject var60) {
        return f14216(var20, (SubLObject)ConsesLow.list(f14254(), var11), var60);
    }
    
    public static SubLObject f14248(final SubLObject var20, SubLObject var11) {
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        return f14213(var20, (SubLObject)ConsesLow.list(f14254(), var11));
    }
    
    public static SubLObject f14257(final SubLObject var61) {
        SubLObject var62 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var61)) {
            SubLObject var63 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var64 = module0212.f13799(var61);
            SubLObject var65 = (SubLObject)module0217.NIL;
            var65 = var64.first();
            while (module0217.NIL != var64) {
                if (module0217.NIL != module0214.f14099(var65, var61)) {
                    var63 = Numbers.add(var63, (SubLObject)module0217.ONE_INTEGER);
                }
                var64 = var64.rest();
                var65 = var64.first();
            }
            var62 = var63;
        }
        else {
            final SubLObject var66 = f14258(var61);
            var62 = (SubLObject)((module0217.NIL != var66) ? module0212.f13808(var66) : module0217.ZERO_INTEGER);
        }
        return var62;
    }
    
    public static SubLObject f14259(final SubLObject var61) {
        if (module0217.NIL != module0147.f9507(module0132.$g1558$.getGlobalValue())) {
            return f14257(var61);
        }
        return (SubLObject)module0217.ZERO_INTEGER;
    }
    
    public static SubLObject f14260(final SubLObject var61, final SubLObject var15) {
        assert module0217.NIL != module0004.f106(var15) : var15;
        return Numbers.min(var15, f14259(var61));
    }
    
    public static SubLObject f14258(final SubLObject var61) {
        return f14213(var61, (SubLObject)ConsesLow.list(f14261()));
    }
    
    public static SubLObject f14262(final SubLObject var61, final SubLObject var60) {
        return f14214(var61, (SubLObject)ConsesLow.list(f14261()), var60);
    }
    
    public static SubLObject f14263(final SubLObject var61, final SubLObject var60) {
        return f14216(var61, (SubLObject)ConsesLow.list(f14261()), var60);
    }
    
    public static SubLObject f14261() {
        return (SubLObject)module0217.$ic42$;
    }
    
    public static SubLObject f14264(final SubLObject var20, SubLObject var64, SubLObject var11, SubLObject var65) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        SubLObject var66 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var20)) {
            SubLObject var67 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var68 = module0212.f13799(var20);
            SubLObject var69 = (SubLObject)module0217.NIL;
            var69 = var68.first();
            while (module0217.NIL != var68) {
                if (module0217.NIL != module0214.f14101(var69, var20, var64, var11, var65)) {
                    var67 = Numbers.add(var67, (SubLObject)module0217.ONE_INTEGER);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
            var66 = var67;
        }
        else {
            final SubLObject var70 = f14265(var20, var64, var11, var65);
            var66 = (SubLObject)((module0217.NIL != var70) ? module0212.f13808(var70) : module0217.ZERO_INTEGER);
        }
        return var66;
    }
    
    public static SubLObject f14266(final SubLObject var20, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        SubLObject var65 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var65 = f14264(var20, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var20)) {
            SubLObject var66 = module0212.f13799(var20);
            SubLObject var67 = (SubLObject)module0217.NIL;
            var67 = var66.first();
            while (module0217.NIL != var66) {
                if (module0217.NIL != module0214.f14101(var67, var20, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var67))) {
                    var65 = Numbers.add(var65, (SubLObject)module0217.ONE_INTEGER);
                }
                var66 = var66.rest();
                var67 = var66.first();
            }
        }
        else {
            final SubLObject var68 = module0216.f14171(var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var68.numE(Numbers.subtract((SubLObject)module0217.TWO_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var69 = f14265(var20, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var69) {
                    var65 = f14218(var69);
                }
            }
            else {
                final SubLObject var70 = module0216.f14181(var68, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var72;
                final SubLObject var71 = var72 = Functions.apply((SubLObject)module0217.$ic46$, var20, var70);
                SubLObject var73 = (SubLObject)module0217.NIL;
                var73 = var72.first();
                while (module0217.NIL != var72) {
                    var65 = Numbers.add(var65, Functions.apply((SubLObject)module0217.$ic47$, var20, ConsesLow.append(var70, (SubLObject)ConsesLow.list(var73))));
                    var72 = var72.rest();
                    var73 = var72.first();
                }
            }
        }
        return var65;
    }
    
    public static SubLObject f14267(final SubLObject var20, final SubLObject var15, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        assert module0217.NIL != module0004.f106(var15) : var15;
        SubLObject var65 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var65 = f14264(var20, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (module0217.NIL != module0216.f14173(var65, var15)) {
                var65 = var15;
            }
        }
        else if (module0217.NIL != module0212.f13795(var20)) {
            SubLObject var66 = module0212.f13799(var20);
            SubLObject var67 = (SubLObject)module0217.NIL;
            var67 = var66.first();
            while (module0217.NIL != var66) {
                if (module0217.NIL == module0216.f14173(var65, var15) && module0217.NIL != module0214.f14101(var67, var20, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var67))) {
                    var65 = Numbers.add(var65, (SubLObject)module0217.ONE_INTEGER);
                }
                var66 = var66.rest();
                var67 = var66.first();
            }
        }
        else {
            final SubLObject var68 = module0216.f14171(var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var68.numE(Numbers.subtract((SubLObject)module0217.TWO_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var69 = f14265(var20, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var69) {
                    var65 = f14219(var69, var15);
                }
            }
            else {
                final SubLObject var70 = module0216.f14181(var68, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var72;
                final SubLObject var71 = var72 = Functions.apply((SubLObject)module0217.$ic46$, var20, var70);
                SubLObject var73 = (SubLObject)module0217.NIL;
                var73 = var72.first();
                while (module0217.NIL != var72) {
                    var65 = Numbers.add(var65, Functions.apply((SubLObject)module0217.$ic48$, var20, new SubLObject[] { var15, ConsesLow.append(var70, (SubLObject)ConsesLow.list(var73)) }));
                    var72 = var72.rest();
                    var73 = var72.first();
                }
            }
        }
        return var65;
    }
    
    public static SubLObject f14268(final SubLObject var20, SubLObject var64, SubLObject var11) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        SubLObject var65 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13795(var20)) {
            SubLObject var66 = (SubLObject)module0217.NIL;
            SubLObject var67 = module0212.f13799(var20);
            SubLObject var68 = (SubLObject)module0217.NIL;
            var68 = var67.first();
            while (module0217.NIL != var67) {
                var66 = module0214.f14102(var68, var66, var20, var64, var11);
                var67 = var67.rest();
                var68 = var67.first();
            }
            var65 = var66;
        }
        else {
            final SubLObject var69 = f14265(var20, var64, var11, (SubLObject)module0217.UNPROVIDED);
            var65 = (SubLObject)((module0217.NIL != module0212.f13815(var69)) ? module0212.f13838(var69) : module0217.NIL);
        }
        return var65;
    }
    
    public static SubLObject f14269(final SubLObject var20, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        SubLObject var65 = (SubLObject)module0217.NIL;
        if (module0217.NIL != f14217()) {
            var65 = f14268(var20, var64, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var20)) {
            SubLObject var66 = (SubLObject)module0217.NIL;
            SubLObject var67 = module0212.f13799(var20);
            SubLObject var68 = (SubLObject)module0217.NIL;
            var68 = var67.first();
            while (module0217.NIL != var67) {
                if (module0217.NIL != module0214.f14101(var68, var20, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var68))) {
                    var66 = module0214.f14102(var68, var66, var20, var64, (SubLObject)module0217.UNPROVIDED);
                }
                var67 = var67.rest();
                var68 = var67.first();
            }
            var65 = var66;
        }
        else {
            final SubLObject var69 = module0216.f14171(var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var69.numE(Numbers.subtract((SubLObject)module0217.TWO_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var70 = f14265(var20, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var70) {
                    var65 = f14220(var70);
                }
            }
            else {
                final SubLObject var71 = module0216.f14181(var69, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var73;
                final SubLObject var72 = var73 = Functions.apply((SubLObject)module0217.$ic46$, var20, var71);
                SubLObject var74 = (SubLObject)module0217.NIL;
                var74 = var73.first();
                while (module0217.NIL != var73) {
                    if (Functions.apply((SubLObject)module0217.$ic47$, var20, ConsesLow.append(var71, (SubLObject)ConsesLow.list(var74))).isPositive()) {
                        var65 = (SubLObject)ConsesLow.cons(var74, var65);
                    }
                    var73 = var73.rest();
                    var74 = var73.first();
                }
            }
        }
        return var65;
    }
    
    public static SubLObject f14265(final SubLObject var20, SubLObject var64, SubLObject var11, SubLObject var65) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        return f14213(var20, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic51$, var64, var11, var65));
    }
    
    public static SubLObject f14270(final SubLObject var20, final SubLObject var64, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14214(var20, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic51$, var64, var11, var65), var60);
    }
    
    public static SubLObject f14271(final SubLObject var20, final SubLObject var64, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14216(var20, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic51$, var64, var11, var65), var60);
    }
    
    public static SubLObject f14272(final SubLObject var20, SubLObject var64, SubLObject var65) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        SubLObject var66 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var20)) {
            SubLObject var67 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var68 = module0212.f13799(var20);
            SubLObject var69 = (SubLObject)module0217.NIL;
            var69 = var68.first();
            while (module0217.NIL != var68) {
                if (module0217.NIL != module0214.f14107(var69, var20, var64, var65)) {
                    var67 = Numbers.add(var67, (SubLObject)module0217.ONE_INTEGER);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
            var66 = var67;
        }
        else {
            final SubLObject var70 = f14273(var20, var64, var65);
            var66 = (SubLObject)((module0217.NIL != var70) ? module0212.f13808(var70) : module0217.ZERO_INTEGER);
        }
        return var66;
    }
    
    public static SubLObject f14274(final SubLObject var20, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        SubLObject var65 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13795(var20)) {
            SubLObject var66 = (SubLObject)module0217.NIL;
            SubLObject var67 = module0212.f13799(var20);
            SubLObject var68 = (SubLObject)module0217.NIL;
            var68 = var67.first();
            while (module0217.NIL != var67) {
                var66 = module0214.f14108(var68, var66, var20, var64);
                var67 = var67.rest();
                var68 = var67.first();
            }
            var65 = var66;
        }
        else {
            final SubLObject var69 = f14273(var20, var64, (SubLObject)module0217.UNPROVIDED);
            var65 = (SubLObject)((module0217.NIL != module0212.f13815(var69)) ? module0212.f13838(var69) : module0217.NIL);
        }
        return var65;
    }
    
    public static SubLObject f14273(final SubLObject var20, SubLObject var64, SubLObject var65) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        return f14213(var20, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic58$, var64, var65));
    }
    
    public static SubLObject f14275(final SubLObject var20, final SubLObject var64, final SubLObject var65, final SubLObject var60) {
        return f14214(var20, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic58$, var64, var65), var60);
    }
    
    public static SubLObject f14276(final SubLObject var20, final SubLObject var64, final SubLObject var65, final SubLObject var60) {
        return f14216(var20, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic58$, var64, var65), var60);
    }
    
    public static SubLObject f14277(final SubLObject var66, SubLObject var64, SubLObject var11, SubLObject var65) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var69 = module0212.f13799(var66);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                if (module0217.NIL != module0214.f14110(var70, var66, var64, var11, var65)) {
                    var68 = Numbers.add(var68, (SubLObject)module0217.ONE_INTEGER);
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
            var67 = var68;
        }
        else {
            final SubLObject var71 = f14278(var66, var64, var11, var65);
            var67 = (SubLObject)((module0217.NIL != var71) ? module0212.f13808(var71) : module0217.ZERO_INTEGER);
        }
        return var67;
    }
    
    public static SubLObject f14279(final SubLObject var66, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var67 = f14277(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = module0212.f13799(var66);
            SubLObject var69 = (SubLObject)module0217.NIL;
            var69 = var68.first();
            while (module0217.NIL != var68) {
                if (module0217.NIL != module0214.f14110(var69, var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var69))) {
                    var67 = Numbers.add(var67, (SubLObject)module0217.ONE_INTEGER);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
        }
        else {
            final SubLObject var70 = module0216.f14171(var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var70.numE(Numbers.subtract((SubLObject)module0217.TWO_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var71 = f14278(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var71) {
                    var67 = f14218(var71);
                }
            }
            else {
                final SubLObject var72 = module0216.f14181(var70, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var74;
                final SubLObject var73 = var74 = Functions.apply((SubLObject)module0217.$ic62$, var66, var72);
                SubLObject var75 = (SubLObject)module0217.NIL;
                var75 = var74.first();
                while (module0217.NIL != var74) {
                    var67 = Numbers.add(var67, Functions.apply((SubLObject)module0217.$ic63$, var66, ConsesLow.append(var72, (SubLObject)ConsesLow.list(var75))));
                    var74 = var74.rest();
                    var75 = var74.first();
                }
            }
        }
        return var67;
    }
    
    public static SubLObject f14280(final SubLObject var66, final SubLObject var15, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        assert module0217.NIL != module0004.f106(var15) : var15;
        SubLObject var67 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var67 = f14277(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (module0217.NIL != module0216.f14173(var67, var15)) {
                var67 = var15;
            }
        }
        else if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = module0212.f13799(var66);
            SubLObject var69 = (SubLObject)module0217.NIL;
            var69 = var68.first();
            while (module0217.NIL != var68) {
                if (module0217.NIL == module0216.f14173(var67, var15) && module0217.NIL != module0214.f14110(var69, var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var69))) {
                    var67 = Numbers.add(var67, (SubLObject)module0217.ONE_INTEGER);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
        }
        else {
            final SubLObject var70 = module0216.f14171(var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var70.numE(Numbers.subtract((SubLObject)module0217.TWO_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var71 = f14278(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var71) {
                    var67 = f14219(var71, var15);
                }
            }
            else {
                final SubLObject var72 = module0216.f14181(var70, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var74;
                final SubLObject var73 = var74 = Functions.apply((SubLObject)module0217.$ic62$, var66, var72);
                SubLObject var75 = (SubLObject)module0217.NIL;
                var75 = var74.first();
                while (module0217.NIL != var74) {
                    var67 = Numbers.add(var67, Functions.apply((SubLObject)module0217.$ic64$, var66, new SubLObject[] { var15, ConsesLow.append(var72, (SubLObject)ConsesLow.list(var75)) }));
                    var74 = var74.rest();
                    var75 = var74.first();
                }
            }
        }
        return var67;
    }
    
    public static SubLObject f14281(final SubLObject var66, SubLObject var64, SubLObject var11) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = (SubLObject)module0217.NIL;
            SubLObject var69 = module0212.f13799(var66);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                var68 = module0214.f14111(var70, var68, var66, var64, var11);
                var69 = var69.rest();
                var70 = var69.first();
            }
            var67 = var68;
        }
        else {
            final SubLObject var71 = f14278(var66, var64, var11, (SubLObject)module0217.UNPROVIDED);
            var67 = (SubLObject)((module0217.NIL != module0212.f13815(var71)) ? module0212.f13838(var71) : module0217.NIL);
        }
        return var67;
    }
    
    public static SubLObject f14282(final SubLObject var66, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.NIL;
        if (module0217.NIL != f14217()) {
            var67 = f14281(var66, var64, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = (SubLObject)module0217.NIL;
            SubLObject var69 = module0212.f13799(var66);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                if (module0217.NIL != module0214.f14110(var70, var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var70))) {
                    var68 = module0214.f14111(var70, var68, var66, var64, (SubLObject)module0217.UNPROVIDED);
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
            var67 = var68;
        }
        else {
            final SubLObject var71 = module0216.f14171(var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var71.numE(Numbers.subtract((SubLObject)module0217.TWO_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var72 = f14278(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var72) {
                    var67 = f14220(var72);
                }
            }
            else {
                final SubLObject var73 = module0216.f14181(var71, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var75;
                final SubLObject var74 = var75 = Functions.apply((SubLObject)module0217.$ic62$, var66, var73);
                SubLObject var76 = (SubLObject)module0217.NIL;
                var76 = var75.first();
                while (module0217.NIL != var75) {
                    if (Functions.apply((SubLObject)module0217.$ic63$, var66, ConsesLow.append(var73, (SubLObject)ConsesLow.list(var76))).isPositive()) {
                        var67 = (SubLObject)ConsesLow.cons(var76, var67);
                    }
                    var75 = var75.rest();
                    var76 = var75.first();
                }
            }
        }
        return var67;
    }
    
    public static SubLObject f14278(final SubLObject var66, SubLObject var64, SubLObject var11, SubLObject var65) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        return f14213(var66, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic67$, var64, var11, var65));
    }
    
    public static SubLObject f14283(final SubLObject var66, final SubLObject var64, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14214(var66, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic67$, var64, var11, var65), var60);
    }
    
    public static SubLObject f14284(final SubLObject var66, final SubLObject var64, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14216(var66, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic67$, var64, var11, var65), var60);
    }
    
    public static SubLObject f14285(final SubLObject var66, SubLObject var64, SubLObject var11, SubLObject var65) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var69 = module0212.f13799(var66);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                if (module0217.NIL != module0214.f14113(var70, var66, var64, var11, var65)) {
                    var68 = Numbers.add(var68, (SubLObject)module0217.ONE_INTEGER);
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
            var67 = var68;
        }
        else {
            final SubLObject var71 = f14286(var66, var64, var11, var65);
            var67 = (SubLObject)((module0217.NIL != var71) ? module0212.f13808(var71) : module0217.ZERO_INTEGER);
        }
        return var67;
    }
    
    public static SubLObject f14287(final SubLObject var66, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var67 = f14285(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = module0212.f13799(var66);
            SubLObject var69 = (SubLObject)module0217.NIL;
            var69 = var68.first();
            while (module0217.NIL != var68) {
                if (module0217.NIL != module0214.f14113(var69, var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var69))) {
                    var67 = Numbers.add(var67, (SubLObject)module0217.ONE_INTEGER);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
        }
        else {
            final SubLObject var70 = module0216.f14171(var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var70.numE(Numbers.subtract((SubLObject)module0217.TWO_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var71 = f14286(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var71) {
                    var67 = f14218(var71);
                }
            }
            else {
                final SubLObject var72 = module0216.f14181(var70, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var74;
                final SubLObject var73 = var74 = Functions.apply((SubLObject)module0217.$ic69$, var66, var72);
                SubLObject var75 = (SubLObject)module0217.NIL;
                var75 = var74.first();
                while (module0217.NIL != var74) {
                    var67 = Numbers.add(var67, Functions.apply((SubLObject)module0217.$ic70$, var66, ConsesLow.append(var72, (SubLObject)ConsesLow.list(var75))));
                    var74 = var74.rest();
                    var75 = var74.first();
                }
            }
        }
        return var67;
    }
    
    public static SubLObject f14288(final SubLObject var66, final SubLObject var15, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        assert module0217.NIL != module0004.f106(var15) : var15;
        SubLObject var67 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var67 = f14285(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (module0217.NIL != module0216.f14173(var67, var15)) {
                var67 = var15;
            }
        }
        else if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = module0212.f13799(var66);
            SubLObject var69 = (SubLObject)module0217.NIL;
            var69 = var68.first();
            while (module0217.NIL != var68) {
                if (module0217.NIL == module0216.f14173(var67, var15) && module0217.NIL != module0214.f14113(var69, var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var69))) {
                    var67 = Numbers.add(var67, (SubLObject)module0217.ONE_INTEGER);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
        }
        else {
            final SubLObject var70 = module0216.f14171(var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var70.numE(Numbers.subtract((SubLObject)module0217.TWO_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var71 = f14286(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var71) {
                    var67 = f14219(var71, var15);
                }
            }
            else {
                final SubLObject var72 = module0216.f14181(var70, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var74;
                final SubLObject var73 = var74 = Functions.apply((SubLObject)module0217.$ic69$, var66, var72);
                SubLObject var75 = (SubLObject)module0217.NIL;
                var75 = var74.first();
                while (module0217.NIL != var74) {
                    var67 = Numbers.add(var67, Functions.apply((SubLObject)module0217.$ic71$, var66, new SubLObject[] { var15, ConsesLow.append(var72, (SubLObject)ConsesLow.list(var75)) }));
                    var74 = var74.rest();
                    var75 = var74.first();
                }
            }
        }
        return var67;
    }
    
    public static SubLObject f14289(final SubLObject var66, SubLObject var64, SubLObject var11) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = (SubLObject)module0217.NIL;
            SubLObject var69 = module0212.f13799(var66);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                var68 = module0214.f14114(var70, var68, var66, var64, var11);
                var69 = var69.rest();
                var70 = var69.first();
            }
            var67 = var68;
        }
        else {
            final SubLObject var71 = f14286(var66, var64, var11, (SubLObject)module0217.UNPROVIDED);
            var67 = (SubLObject)((module0217.NIL != module0212.f13815(var71)) ? module0212.f13838(var71) : module0217.NIL);
        }
        return var67;
    }
    
    public static SubLObject f14290(final SubLObject var66, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.NIL;
        if (module0217.NIL != f14217()) {
            var67 = f14289(var66, var64, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = (SubLObject)module0217.NIL;
            SubLObject var69 = module0212.f13799(var66);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                if (module0217.NIL != module0214.f14113(var70, var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var70))) {
                    var68 = module0214.f14114(var70, var68, var66, var64, (SubLObject)module0217.UNPROVIDED);
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
            var67 = var68;
        }
        else {
            final SubLObject var71 = module0216.f14171(var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var71.numE(Numbers.subtract((SubLObject)module0217.TWO_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var72 = f14286(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var72) {
                    var67 = f14220(var72);
                }
            }
            else {
                final SubLObject var73 = module0216.f14181(var71, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var75;
                final SubLObject var74 = var75 = Functions.apply((SubLObject)module0217.$ic69$, var66, var73);
                SubLObject var76 = (SubLObject)module0217.NIL;
                var76 = var75.first();
                while (module0217.NIL != var75) {
                    if (Functions.apply((SubLObject)module0217.$ic70$, var66, ConsesLow.append(var73, (SubLObject)ConsesLow.list(var76))).isPositive()) {
                        var67 = (SubLObject)ConsesLow.cons(var76, var67);
                    }
                    var75 = var75.rest();
                    var76 = var75.first();
                }
            }
        }
        return var67;
    }
    
    public static SubLObject f14286(final SubLObject var66, SubLObject var64, SubLObject var11, SubLObject var65) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        return f14213(var66, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic72$, var64, var11, var65));
    }
    
    public static SubLObject f14291(final SubLObject var66, final SubLObject var64, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14214(var66, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic72$, var64, var11, var65), var60);
    }
    
    public static SubLObject f14292(final SubLObject var66, final SubLObject var64, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14216(var66, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic72$, var64, var11, var65), var60);
    }
    
    public static SubLObject f14293(final SubLObject var66, SubLObject var64, SubLObject var11, SubLObject var65) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var69 = module0212.f13799(var66);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                if (module0217.NIL != module0214.f14116(var70, var66, var64, var11, var65)) {
                    var68 = Numbers.add(var68, (SubLObject)module0217.ONE_INTEGER);
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
            var67 = var68;
        }
        else {
            final SubLObject var71 = f14294(var66, var64, var11, var65);
            var67 = (SubLObject)((module0217.NIL != var71) ? module0212.f13808(var71) : module0217.ZERO_INTEGER);
        }
        return var67;
    }
    
    public static SubLObject f14295(final SubLObject var66, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var67 = f14293(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = module0212.f13799(var66);
            SubLObject var69 = (SubLObject)module0217.NIL;
            var69 = var68.first();
            while (module0217.NIL != var68) {
                if (module0217.NIL != module0214.f14116(var69, var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var69))) {
                    var67 = Numbers.add(var67, (SubLObject)module0217.ONE_INTEGER);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
        }
        else {
            final SubLObject var70 = module0216.f14171(var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var70.numE(Numbers.subtract((SubLObject)module0217.TWO_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var71 = f14294(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var71) {
                    var67 = f14218(var71);
                }
            }
            else {
                final SubLObject var72 = module0216.f14181(var70, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var74;
                final SubLObject var73 = var74 = Functions.apply((SubLObject)module0217.$ic74$, var66, var72);
                SubLObject var75 = (SubLObject)module0217.NIL;
                var75 = var74.first();
                while (module0217.NIL != var74) {
                    var67 = Numbers.add(var67, Functions.apply((SubLObject)module0217.$ic75$, var66, ConsesLow.append(var72, (SubLObject)ConsesLow.list(var75))));
                    var74 = var74.rest();
                    var75 = var74.first();
                }
            }
        }
        return var67;
    }
    
    public static SubLObject f14296(final SubLObject var66, final SubLObject var15, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        assert module0217.NIL != module0004.f106(var15) : var15;
        SubLObject var67 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var67 = f14293(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (module0217.NIL != module0216.f14173(var67, var15)) {
                var67 = var15;
            }
        }
        else if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = module0212.f13799(var66);
            SubLObject var69 = (SubLObject)module0217.NIL;
            var69 = var68.first();
            while (module0217.NIL != var68) {
                if (module0217.NIL == module0216.f14173(var67, var15) && module0217.NIL != module0214.f14116(var69, var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var69))) {
                    var67 = Numbers.add(var67, (SubLObject)module0217.ONE_INTEGER);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
        }
        else {
            final SubLObject var70 = module0216.f14171(var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var70.numE(Numbers.subtract((SubLObject)module0217.TWO_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var71 = f14294(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var71) {
                    var67 = f14219(var71, var15);
                }
            }
            else {
                final SubLObject var72 = module0216.f14181(var70, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var74;
                final SubLObject var73 = var74 = Functions.apply((SubLObject)module0217.$ic74$, var66, var72);
                SubLObject var75 = (SubLObject)module0217.NIL;
                var75 = var74.first();
                while (module0217.NIL != var74) {
                    var67 = Numbers.add(var67, Functions.apply((SubLObject)module0217.$ic76$, var66, new SubLObject[] { var15, ConsesLow.append(var72, (SubLObject)ConsesLow.list(var75)) }));
                    var74 = var74.rest();
                    var75 = var74.first();
                }
            }
        }
        return var67;
    }
    
    public static SubLObject f14297(final SubLObject var66, SubLObject var64, SubLObject var11) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = (SubLObject)module0217.NIL;
            SubLObject var69 = module0212.f13799(var66);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                var68 = module0214.f14117(var70, var68, var66, var64, var11);
                var69 = var69.rest();
                var70 = var69.first();
            }
            var67 = var68;
        }
        else {
            final SubLObject var71 = f14294(var66, var64, var11, (SubLObject)module0217.UNPROVIDED);
            var67 = (SubLObject)((module0217.NIL != module0212.f13815(var71)) ? module0212.f13838(var71) : module0217.NIL);
        }
        return var67;
    }
    
    public static SubLObject f14298(final SubLObject var66, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.NIL;
        if (module0217.NIL != f14217()) {
            var67 = f14297(var66, var64, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = (SubLObject)module0217.NIL;
            SubLObject var69 = module0212.f13799(var66);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                if (module0217.NIL != module0214.f14116(var70, var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var70))) {
                    var68 = module0214.f14117(var70, var68, var66, var64, (SubLObject)module0217.UNPROVIDED);
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
            var67 = var68;
        }
        else {
            final SubLObject var71 = module0216.f14171(var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var71.numE(Numbers.subtract((SubLObject)module0217.TWO_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var72 = f14294(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var72) {
                    var67 = f14220(var72);
                }
            }
            else {
                final SubLObject var73 = module0216.f14181(var71, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var75;
                final SubLObject var74 = var75 = Functions.apply((SubLObject)module0217.$ic74$, var66, var73);
                SubLObject var76 = (SubLObject)module0217.NIL;
                var76 = var75.first();
                while (module0217.NIL != var75) {
                    if (Functions.apply((SubLObject)module0217.$ic75$, var66, ConsesLow.append(var73, (SubLObject)ConsesLow.list(var76))).isPositive()) {
                        var67 = (SubLObject)ConsesLow.cons(var76, var67);
                    }
                    var75 = var75.rest();
                    var76 = var75.first();
                }
            }
        }
        return var67;
    }
    
    public static SubLObject f14294(final SubLObject var66, SubLObject var64, SubLObject var11, SubLObject var65) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        return f14213(var66, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic77$, var64, var11, var65));
    }
    
    public static SubLObject f14299(final SubLObject var66, final SubLObject var64, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14214(var66, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic77$, var64, var11, var65), var60);
    }
    
    public static SubLObject f14300(final SubLObject var66, final SubLObject var64, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14216(var66, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic77$, var64, var11, var65), var60);
    }
    
    public static SubLObject f14301(final SubLObject var66, SubLObject var64, SubLObject var11, SubLObject var65) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var69 = module0212.f13799(var66);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                if (module0217.NIL != module0214.f14119(var70, var66, var64, var11, var65)) {
                    var68 = Numbers.add(var68, (SubLObject)module0217.ONE_INTEGER);
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
            var67 = var68;
        }
        else {
            final SubLObject var71 = f14302(var66, var64, var11, var65);
            var67 = (SubLObject)((module0217.NIL != var71) ? module0212.f13808(var71) : module0217.ZERO_INTEGER);
        }
        return var67;
    }
    
    public static SubLObject f14303(final SubLObject var66, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var67 = f14301(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = module0212.f13799(var66);
            SubLObject var69 = (SubLObject)module0217.NIL;
            var69 = var68.first();
            while (module0217.NIL != var68) {
                if (module0217.NIL != module0214.f14119(var69, var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var69))) {
                    var67 = Numbers.add(var67, (SubLObject)module0217.ONE_INTEGER);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
        }
        else {
            final SubLObject var70 = module0216.f14171(var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var70.numE(Numbers.subtract((SubLObject)module0217.TWO_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var71 = f14302(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var71) {
                    var67 = f14218(var71);
                }
            }
            else {
                final SubLObject var72 = module0216.f14181(var70, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var74;
                final SubLObject var73 = var74 = Functions.apply((SubLObject)module0217.$ic79$, var66, var72);
                SubLObject var75 = (SubLObject)module0217.NIL;
                var75 = var74.first();
                while (module0217.NIL != var74) {
                    var67 = Numbers.add(var67, Functions.apply((SubLObject)module0217.$ic80$, var66, ConsesLow.append(var72, (SubLObject)ConsesLow.list(var75))));
                    var74 = var74.rest();
                    var75 = var74.first();
                }
            }
        }
        return var67;
    }
    
    public static SubLObject f14304(final SubLObject var66, final SubLObject var15, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        assert module0217.NIL != module0004.f106(var15) : var15;
        SubLObject var67 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var67 = f14301(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (module0217.NIL != module0216.f14173(var67, var15)) {
                var67 = var15;
            }
        }
        else if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = module0212.f13799(var66);
            SubLObject var69 = (SubLObject)module0217.NIL;
            var69 = var68.first();
            while (module0217.NIL != var68) {
                if (module0217.NIL == module0216.f14173(var67, var15) && module0217.NIL != module0214.f14119(var69, var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var69))) {
                    var67 = Numbers.add(var67, (SubLObject)module0217.ONE_INTEGER);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
        }
        else {
            final SubLObject var70 = module0216.f14171(var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var70.numE(Numbers.subtract((SubLObject)module0217.TWO_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var71 = f14302(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var71) {
                    var67 = f14219(var71, var15);
                }
            }
            else {
                final SubLObject var72 = module0216.f14181(var70, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var74;
                final SubLObject var73 = var74 = Functions.apply((SubLObject)module0217.$ic79$, var66, var72);
                SubLObject var75 = (SubLObject)module0217.NIL;
                var75 = var74.first();
                while (module0217.NIL != var74) {
                    var67 = Numbers.add(var67, Functions.apply((SubLObject)module0217.$ic81$, var66, new SubLObject[] { var15, ConsesLow.append(var72, (SubLObject)ConsesLow.list(var75)) }));
                    var74 = var74.rest();
                    var75 = var74.first();
                }
            }
        }
        return var67;
    }
    
    public static SubLObject f14305(final SubLObject var66, SubLObject var64, SubLObject var11) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = (SubLObject)module0217.NIL;
            SubLObject var69 = module0212.f13799(var66);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                var68 = module0214.f14120(var70, var68, var66, var64, var11);
                var69 = var69.rest();
                var70 = var69.first();
            }
            var67 = var68;
        }
        else {
            final SubLObject var71 = f14302(var66, var64, var11, (SubLObject)module0217.UNPROVIDED);
            var67 = (SubLObject)((module0217.NIL != module0212.f13815(var71)) ? module0212.f13838(var71) : module0217.NIL);
        }
        return var67;
    }
    
    public static SubLObject f14306(final SubLObject var66, SubLObject var64) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        SubLObject var67 = (SubLObject)module0217.NIL;
        if (module0217.NIL != f14217()) {
            var67 = f14305(var66, var64, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var66)) {
            SubLObject var68 = (SubLObject)module0217.NIL;
            SubLObject var69 = module0212.f13799(var66);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                if (module0217.NIL != module0214.f14119(var70, var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var70))) {
                    var68 = module0214.f14120(var70, var68, var66, var64, (SubLObject)module0217.UNPROVIDED);
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
            var67 = var68;
        }
        else {
            final SubLObject var71 = module0216.f14171(var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var71.numE(Numbers.subtract((SubLObject)module0217.TWO_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var72 = f14302(var66, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var72) {
                    var67 = f14220(var72);
                }
            }
            else {
                final SubLObject var73 = module0216.f14181(var71, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var75;
                final SubLObject var74 = var75 = Functions.apply((SubLObject)module0217.$ic79$, var66, var73);
                SubLObject var76 = (SubLObject)module0217.NIL;
                var76 = var75.first();
                while (module0217.NIL != var75) {
                    if (Functions.apply((SubLObject)module0217.$ic80$, var66, ConsesLow.append(var73, (SubLObject)ConsesLow.list(var76))).isPositive()) {
                        var67 = (SubLObject)ConsesLow.cons(var76, var67);
                    }
                    var75 = var75.rest();
                    var76 = var75.first();
                }
            }
        }
        return var67;
    }
    
    public static SubLObject f14302(final SubLObject var66, SubLObject var64, SubLObject var11, SubLObject var65) {
        if (var64 == module0217.UNPROVIDED) {
            var64 = (SubLObject)module0217.NIL;
        }
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        return f14213(var66, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic82$, var64, var11, var65));
    }
    
    public static SubLObject f14307(final SubLObject var66, final SubLObject var64, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14214(var66, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic82$, var64, var11, var65), var60);
    }
    
    public static SubLObject f14308(final SubLObject var66, final SubLObject var64, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14216(var66, (SubLObject)ConsesLow.list((SubLObject)module0217.$ic82$, var64, var11, var65), var60);
    }
    
    public static SubLObject f14309(final SubLObject var61, SubLObject var11, SubLObject var65) {
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        SubLObject var66 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var61)) {
            SubLObject var67 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var68 = module0212.f13799(var61);
            SubLObject var69 = (SubLObject)module0217.NIL;
            var69 = var68.first();
            while (module0217.NIL != var68) {
                if (module0217.NIL != module0214.f14122(var69, var61, var11, var65)) {
                    var67 = Numbers.add(var67, (SubLObject)module0217.ONE_INTEGER);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
            var66 = var67;
        }
        else {
            final SubLObject var70 = f14310(var61, var11, var65);
            var66 = (SubLObject)((module0217.NIL != var70) ? module0212.f13808(var70) : module0217.ZERO_INTEGER);
        }
        return var66;
    }
    
    public static SubLObject f14311(final SubLObject var61) {
        SubLObject var62 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var62 = f14309(var61, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var61)) {
            SubLObject var63 = module0212.f13799(var61);
            SubLObject var64 = (SubLObject)module0217.NIL;
            var64 = var63.first();
            while (module0217.NIL != var63) {
                if (module0217.NIL != module0214.f14122(var64, var61, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var64))) {
                    var62 = Numbers.add(var62, (SubLObject)module0217.ONE_INTEGER);
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
        }
        else {
            final SubLObject var65 = module0216.f14171((SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var65.numE(Numbers.subtract((SubLObject)module0217.ONE_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var66 = f14310(var61, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var66) {
                    var62 = f14218(var66);
                }
            }
            else {
                final SubLObject var67 = module0216.f14181(var65, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var69;
                final SubLObject var68 = var69 = Functions.apply((SubLObject)module0217.$ic86$, var61, var67);
                SubLObject var70 = (SubLObject)module0217.NIL;
                var70 = var69.first();
                while (module0217.NIL != var69) {
                    var62 = Numbers.add(var62, Functions.apply((SubLObject)module0217.$ic87$, var61, ConsesLow.append(var67, (SubLObject)ConsesLow.list(var70))));
                    var69 = var69.rest();
                    var70 = var69.first();
                }
            }
        }
        return var62;
    }
    
    public static SubLObject f14312(final SubLObject var61, final SubLObject var15) {
        assert module0217.NIL != module0004.f106(var15) : var15;
        SubLObject var62 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var62 = f14309(var61, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (module0217.NIL != module0216.f14173(var62, var15)) {
                var62 = var15;
            }
        }
        else if (module0217.NIL != module0212.f13795(var61)) {
            SubLObject var63 = module0212.f13799(var61);
            SubLObject var64 = (SubLObject)module0217.NIL;
            var64 = var63.first();
            while (module0217.NIL != var63) {
                if (module0217.NIL == module0216.f14173(var62, var15) && module0217.NIL != module0214.f14122(var64, var61, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var64))) {
                    var62 = Numbers.add(var62, (SubLObject)module0217.ONE_INTEGER);
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
        }
        else {
            final SubLObject var65 = module0216.f14171((SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var65.numE(Numbers.subtract((SubLObject)module0217.ONE_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var66 = f14310(var61, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var66) {
                    var62 = f14219(var66, var15);
                }
            }
            else {
                final SubLObject var67 = module0216.f14181(var65, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var69;
                final SubLObject var68 = var69 = Functions.apply((SubLObject)module0217.$ic86$, var61, var67);
                SubLObject var70 = (SubLObject)module0217.NIL;
                var70 = var69.first();
                while (module0217.NIL != var69) {
                    var62 = Numbers.add(var62, Functions.apply((SubLObject)module0217.$ic88$, var61, new SubLObject[] { var15, ConsesLow.append(var67, (SubLObject)ConsesLow.list(var70)) }));
                    var69 = var69.rest();
                    var70 = var69.first();
                }
            }
        }
        return var62;
    }
    
    public static SubLObject f14313(final SubLObject var61, SubLObject var11) {
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        SubLObject var62 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13795(var61)) {
            SubLObject var63 = (SubLObject)module0217.NIL;
            SubLObject var64 = module0212.f13799(var61);
            SubLObject var65 = (SubLObject)module0217.NIL;
            var65 = var64.first();
            while (module0217.NIL != var64) {
                var63 = module0214.f14123(var65, var63, var61, var11);
                var64 = var64.rest();
                var65 = var64.first();
            }
            var62 = var63;
        }
        else {
            final SubLObject var66 = f14310(var61, var11, (SubLObject)module0217.UNPROVIDED);
            var62 = (SubLObject)((module0217.NIL != module0212.f13815(var66)) ? module0212.f13838(var66) : module0217.NIL);
        }
        return var62;
    }
    
    public static SubLObject f14314(final SubLObject var61) {
        SubLObject var62 = (SubLObject)module0217.NIL;
        if (module0217.NIL != f14217()) {
            var62 = f14313(var61, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var61)) {
            SubLObject var63 = (SubLObject)module0217.NIL;
            SubLObject var64 = module0212.f13799(var61);
            SubLObject var65 = (SubLObject)module0217.NIL;
            var65 = var64.first();
            while (module0217.NIL != var64) {
                if (module0217.NIL != module0214.f14122(var65, var61, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var65))) {
                    var63 = module0214.f14123(var65, var63, var61, (SubLObject)module0217.UNPROVIDED);
                }
                var64 = var64.rest();
                var65 = var64.first();
            }
            var62 = var63;
        }
        else {
            final SubLObject var66 = module0216.f14171((SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var66.numE(Numbers.subtract((SubLObject)module0217.ONE_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var67 = f14310(var61, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var67) {
                    var62 = f14220(var67);
                }
            }
            else {
                final SubLObject var68 = module0216.f14181(var66, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var70;
                final SubLObject var69 = var70 = Functions.apply((SubLObject)module0217.$ic86$, var61, var68);
                SubLObject var71 = (SubLObject)module0217.NIL;
                var71 = var70.first();
                while (module0217.NIL != var70) {
                    if (Functions.apply((SubLObject)module0217.$ic87$, var61, ConsesLow.append(var68, (SubLObject)ConsesLow.list(var71))).isPositive()) {
                        var62 = (SubLObject)ConsesLow.cons(var71, var62);
                    }
                    var70 = var70.rest();
                    var71 = var70.first();
                }
            }
        }
        return var62;
    }
    
    public static SubLObject f14310(final SubLObject var61, SubLObject var11, SubLObject var65) {
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        return f14213(var61, (SubLObject)ConsesLow.list(f14315(), var11, var65));
    }
    
    public static SubLObject f14316(final SubLObject var61, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14214(var61, (SubLObject)ConsesLow.list(f14315(), var11, var65), var60);
    }
    
    public static SubLObject f14317(final SubLObject var61, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14216(var61, (SubLObject)ConsesLow.list(f14315(), var11, var65), var60);
    }
    
    public static SubLObject f14315() {
        return (SubLObject)module0217.$ic91$;
    }
    
    public static SubLObject f14318(final SubLObject var67, SubLObject var11, SubLObject var65) {
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        SubLObject var68 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var67)) {
            SubLObject var69 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var70 = module0212.f13799(var67);
            SubLObject var71 = (SubLObject)module0217.NIL;
            var71 = var70.first();
            while (module0217.NIL != var70) {
                if (module0217.NIL != module0214.f14125(var71, var67, var11, var65)) {
                    var69 = Numbers.add(var69, (SubLObject)module0217.ONE_INTEGER);
                }
                var70 = var70.rest();
                var71 = var70.first();
            }
            var68 = var69;
        }
        else {
            final SubLObject var72 = f14319(var67, var11, var65);
            var68 = (SubLObject)((module0217.NIL != var72) ? module0212.f13808(var72) : module0217.ZERO_INTEGER);
        }
        return var68;
    }
    
    public static SubLObject f14320(final SubLObject var67) {
        SubLObject var68 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var68 = f14318(var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var67)) {
            SubLObject var69 = module0212.f13799(var67);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                if (module0217.NIL != module0214.f14125(var70, var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var70))) {
                    var68 = Numbers.add(var68, (SubLObject)module0217.ONE_INTEGER);
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
        }
        else {
            final SubLObject var71 = module0216.f14171((SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var71.numE(Numbers.subtract((SubLObject)module0217.ONE_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var72 = f14319(var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var72) {
                    var68 = f14218(var72);
                }
            }
            else {
                final SubLObject var73 = module0216.f14181(var71, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var75;
                final SubLObject var74 = var75 = Functions.apply((SubLObject)module0217.$ic95$, var67, var73);
                SubLObject var76 = (SubLObject)module0217.NIL;
                var76 = var75.first();
                while (module0217.NIL != var75) {
                    var68 = Numbers.add(var68, Functions.apply((SubLObject)module0217.$ic96$, var67, ConsesLow.append(var73, (SubLObject)ConsesLow.list(var76))));
                    var75 = var75.rest();
                    var76 = var75.first();
                }
            }
        }
        return var68;
    }
    
    public static SubLObject f14321(final SubLObject var67, final SubLObject var15) {
        assert module0217.NIL != module0004.f106(var15) : var15;
        SubLObject var68 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var68 = f14318(var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (module0217.NIL != module0216.f14173(var68, var15)) {
                var68 = var15;
            }
        }
        else if (module0217.NIL != module0212.f13795(var67)) {
            SubLObject var69 = module0212.f13799(var67);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                if (module0217.NIL == module0216.f14173(var68, var15) && module0217.NIL != module0214.f14125(var70, var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var70))) {
                    var68 = Numbers.add(var68, (SubLObject)module0217.ONE_INTEGER);
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
        }
        else {
            final SubLObject var71 = module0216.f14171((SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var71.numE(Numbers.subtract((SubLObject)module0217.ONE_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var72 = f14319(var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var72) {
                    var68 = f14219(var72, var15);
                }
            }
            else {
                final SubLObject var73 = module0216.f14181(var71, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var75;
                final SubLObject var74 = var75 = Functions.apply((SubLObject)module0217.$ic95$, var67, var73);
                SubLObject var76 = (SubLObject)module0217.NIL;
                var76 = var75.first();
                while (module0217.NIL != var75) {
                    var68 = Numbers.add(var68, Functions.apply((SubLObject)module0217.$ic97$, var67, new SubLObject[] { var15, ConsesLow.append(var73, (SubLObject)ConsesLow.list(var76)) }));
                    var75 = var75.rest();
                    var76 = var75.first();
                }
            }
        }
        return var68;
    }
    
    public static SubLObject f14322(final SubLObject var67, SubLObject var11) {
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        SubLObject var68 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13795(var67)) {
            SubLObject var69 = (SubLObject)module0217.NIL;
            SubLObject var70 = module0212.f13799(var67);
            SubLObject var71 = (SubLObject)module0217.NIL;
            var71 = var70.first();
            while (module0217.NIL != var70) {
                var69 = module0214.f14126(var71, var69, var67, var11);
                var70 = var70.rest();
                var71 = var70.first();
            }
            var68 = var69;
        }
        else {
            final SubLObject var72 = f14319(var67, var11, (SubLObject)module0217.UNPROVIDED);
            var68 = (SubLObject)((module0217.NIL != module0212.f13815(var72)) ? module0212.f13838(var72) : module0217.NIL);
        }
        return var68;
    }
    
    public static SubLObject f14323(final SubLObject var67) {
        SubLObject var68 = (SubLObject)module0217.NIL;
        if (module0217.NIL != f14217()) {
            var68 = f14322(var67, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var67)) {
            SubLObject var69 = (SubLObject)module0217.NIL;
            SubLObject var70 = module0212.f13799(var67);
            SubLObject var71 = (SubLObject)module0217.NIL;
            var71 = var70.first();
            while (module0217.NIL != var70) {
                if (module0217.NIL != module0214.f14125(var71, var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var71))) {
                    var69 = module0214.f14126(var71, var69, var67, (SubLObject)module0217.UNPROVIDED);
                }
                var70 = var70.rest();
                var71 = var70.first();
            }
            var68 = var69;
        }
        else {
            final SubLObject var72 = module0216.f14171((SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var72.numE(Numbers.subtract((SubLObject)module0217.ONE_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var73 = f14319(var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var73) {
                    var68 = f14220(var73);
                }
            }
            else {
                final SubLObject var74 = module0216.f14181(var72, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var76;
                final SubLObject var75 = var76 = Functions.apply((SubLObject)module0217.$ic95$, var67, var74);
                SubLObject var77 = (SubLObject)module0217.NIL;
                var77 = var76.first();
                while (module0217.NIL != var76) {
                    if (Functions.apply((SubLObject)module0217.$ic96$, var67, ConsesLow.append(var74, (SubLObject)ConsesLow.list(var77))).isPositive()) {
                        var68 = (SubLObject)ConsesLow.cons(var77, var68);
                    }
                    var76 = var76.rest();
                    var77 = var76.first();
                }
            }
        }
        return var68;
    }
    
    public static SubLObject f14324() {
        return (SubLObject)module0217.$ic100$;
    }
    
    public static SubLObject f14319(final SubLObject var67, SubLObject var11, SubLObject var65) {
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        return f14213(var67, (SubLObject)ConsesLow.list(f14324(), var11, var65));
    }
    
    public static SubLObject f14325(final SubLObject var67, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14214(var67, (SubLObject)ConsesLow.list(f14324(), var11, var65), var60);
    }
    
    public static SubLObject f14326(final SubLObject var67, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14216(var67, (SubLObject)ConsesLow.list(f14324(), var11, var65), var60);
    }
    
    public static SubLObject f14327(final SubLObject var67, SubLObject var11, SubLObject var65) {
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        SubLObject var68 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var67)) {
            SubLObject var69 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var70 = module0212.f13799(var67);
            SubLObject var71 = (SubLObject)module0217.NIL;
            var71 = var70.first();
            while (module0217.NIL != var70) {
                if (module0217.NIL != module0214.f14128(var71, var67, var11, var65)) {
                    var69 = Numbers.add(var69, (SubLObject)module0217.ONE_INTEGER);
                }
                var70 = var70.rest();
                var71 = var70.first();
            }
            var68 = var69;
        }
        else {
            final SubLObject var72 = f14328(var67, var11, var65);
            var68 = (SubLObject)((module0217.NIL != var72) ? module0212.f13808(var72) : module0217.ZERO_INTEGER);
        }
        return var68;
    }
    
    public static SubLObject f14329(final SubLObject var67) {
        SubLObject var68 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var68 = f14327(var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var67)) {
            SubLObject var69 = module0212.f13799(var67);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                if (module0217.NIL != module0214.f14128(var70, var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var70))) {
                    var68 = Numbers.add(var68, (SubLObject)module0217.ONE_INTEGER);
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
        }
        else {
            final SubLObject var71 = module0216.f14171((SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var71.numE(Numbers.subtract((SubLObject)module0217.ONE_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var72 = f14328(var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var72) {
                    var68 = f14218(var72);
                }
            }
            else {
                final SubLObject var73 = module0216.f14181(var71, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var75;
                final SubLObject var74 = var75 = Functions.apply((SubLObject)module0217.$ic102$, var67, var73);
                SubLObject var76 = (SubLObject)module0217.NIL;
                var76 = var75.first();
                while (module0217.NIL != var75) {
                    var68 = Numbers.add(var68, Functions.apply((SubLObject)module0217.$ic103$, var67, ConsesLow.append(var73, (SubLObject)ConsesLow.list(var76))));
                    var75 = var75.rest();
                    var76 = var75.first();
                }
            }
        }
        return var68;
    }
    
    public static SubLObject f14330(final SubLObject var67, final SubLObject var15) {
        assert module0217.NIL != module0004.f106(var15) : var15;
        SubLObject var68 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != f14217()) {
            var68 = f14327(var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (module0217.NIL != module0216.f14173(var68, var15)) {
                var68 = var15;
            }
        }
        else if (module0217.NIL != module0212.f13795(var67)) {
            SubLObject var69 = module0212.f13799(var67);
            SubLObject var70 = (SubLObject)module0217.NIL;
            var70 = var69.first();
            while (module0217.NIL != var69) {
                if (module0217.NIL == module0216.f14173(var68, var15) && module0217.NIL != module0214.f14128(var70, var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var70))) {
                    var68 = Numbers.add(var68, (SubLObject)module0217.ONE_INTEGER);
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
        }
        else {
            final SubLObject var71 = module0216.f14171((SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var71.numE(Numbers.subtract((SubLObject)module0217.ONE_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var72 = f14328(var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var72) {
                    var68 = f14219(var72, var15);
                }
            }
            else {
                final SubLObject var73 = module0216.f14181(var71, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var75;
                final SubLObject var74 = var75 = Functions.apply((SubLObject)module0217.$ic102$, var67, var73);
                SubLObject var76 = (SubLObject)module0217.NIL;
                var76 = var75.first();
                while (module0217.NIL != var75) {
                    var68 = Numbers.add(var68, Functions.apply((SubLObject)module0217.$ic104$, var67, new SubLObject[] { var15, ConsesLow.append(var73, (SubLObject)ConsesLow.list(var76)) }));
                    var75 = var75.rest();
                    var76 = var75.first();
                }
            }
        }
        return var68;
    }
    
    public static SubLObject f14331(final SubLObject var67, SubLObject var11) {
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        SubLObject var68 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13795(var67)) {
            SubLObject var69 = (SubLObject)module0217.NIL;
            SubLObject var70 = module0212.f13799(var67);
            SubLObject var71 = (SubLObject)module0217.NIL;
            var71 = var70.first();
            while (module0217.NIL != var70) {
                var69 = module0214.f14129(var71, var69, var67, var11);
                var70 = var70.rest();
                var71 = var70.first();
            }
            var68 = var69;
        }
        else {
            final SubLObject var72 = f14328(var67, var11, (SubLObject)module0217.UNPROVIDED);
            var68 = (SubLObject)((module0217.NIL != module0212.f13815(var72)) ? module0212.f13838(var72) : module0217.NIL);
        }
        return var68;
    }
    
    public static SubLObject f14332(final SubLObject var67) {
        SubLObject var68 = (SubLObject)module0217.NIL;
        if (module0217.NIL != f14217()) {
            var68 = f14331(var67, (SubLObject)module0217.UNPROVIDED);
        }
        else if (module0217.NIL != module0212.f13795(var67)) {
            SubLObject var69 = (SubLObject)module0217.NIL;
            SubLObject var70 = module0212.f13799(var67);
            SubLObject var71 = (SubLObject)module0217.NIL;
            var71 = var70.first();
            while (module0217.NIL != var70) {
                if (module0217.NIL != module0214.f14128(var71, var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0147.f9507(module0178.f11287(var71))) {
                    var69 = module0214.f14129(var71, var69, var67, (SubLObject)module0217.UNPROVIDED);
                }
                var70 = var70.rest();
                var71 = var70.first();
            }
            var68 = var69;
        }
        else {
            final SubLObject var72 = module0216.f14171((SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            if (var72.numE(Numbers.subtract((SubLObject)module0217.ONE_INTEGER, (SubLObject)module0217.ONE_INTEGER))) {
                final SubLObject var73 = f14328(var67, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != var73) {
                    var68 = f14220(var73);
                }
            }
            else {
                final SubLObject var74 = module0216.f14181(var72, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                SubLObject var76;
                final SubLObject var75 = var76 = Functions.apply((SubLObject)module0217.$ic102$, var67, var74);
                SubLObject var77 = (SubLObject)module0217.NIL;
                var77 = var76.first();
                while (module0217.NIL != var76) {
                    if (Functions.apply((SubLObject)module0217.$ic103$, var67, ConsesLow.append(var74, (SubLObject)ConsesLow.list(var77))).isPositive()) {
                        var68 = (SubLObject)ConsesLow.cons(var77, var68);
                    }
                    var76 = var76.rest();
                    var77 = var76.first();
                }
            }
        }
        return var68;
    }
    
    public static SubLObject f14333() {
        return (SubLObject)module0217.$ic105$;
    }
    
    public static SubLObject f14328(final SubLObject var67, SubLObject var11, SubLObject var65) {
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        if (var65 == module0217.UNPROVIDED) {
            var65 = (SubLObject)module0217.NIL;
        }
        return f14213(var67, (SubLObject)ConsesLow.list(f14333(), var11, var65));
    }
    
    public static SubLObject f14334(final SubLObject var67, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14214(var67, (SubLObject)ConsesLow.list(f14333(), var11, var65), var60);
    }
    
    public static SubLObject f14335(final SubLObject var67, final SubLObject var11, final SubLObject var65, final SubLObject var60) {
        return f14216(var67, (SubLObject)ConsesLow.list(f14333(), var11, var65), var60);
    }
    
    public static SubLObject f14336(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var1)) {
            SubLObject var3 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var4 = module0212.f13799(var1);
            SubLObject var5 = (SubLObject)module0217.NIL;
            var5 = var4.first();
            while (module0217.NIL != var4) {
                if (module0217.NIL != module0214.f14133(var5, var1)) {
                    var3 = Numbers.add(var3, (SubLObject)module0217.ONE_INTEGER);
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
            var2 = var3;
        }
        else {
            final SubLObject var6 = f14337(var1);
            var2 = (SubLObject)((module0217.NIL != var6) ? module0212.f13808(var6) : module0217.ZERO_INTEGER);
        }
        return var2;
    }
    
    public static SubLObject f14338(final SubLObject var1) {
        if (module0217.NIL != f14217()) {
            return f14336(var1);
        }
        final SubLObject var2 = f14336(var1);
        if (var2.isPositive() && module0217.NIL != module0147.f9507(var1)) {
            return var2;
        }
        return (SubLObject)module0217.ZERO_INTEGER;
    }
    
    public static SubLObject f14339(final SubLObject var1, final SubLObject var15) {
        assert module0217.NIL != module0004.f106(var15) : var15;
        if (module0217.NIL != f14217()) {
            return Numbers.min(var15, f14336(var1));
        }
        final SubLObject var16 = f14336(var1);
        if (var16.isPositive() && module0217.NIL != module0147.f9507(var1)) {
            return Numbers.min(var15, var16);
        }
        return (SubLObject)module0217.ZERO_INTEGER;
    }
    
    public static SubLObject f14337(final SubLObject var1) {
        return module0212.f13811(var1, f14340());
    }
    
    public static SubLObject f14341(final SubLObject var1, final SubLObject var60) {
        if (module0217.NIL == f14342(var1)) {
            f14343(var1, var60);
        }
        return var60;
    }
    
    public static SubLObject f14344(final SubLObject var1, final SubLObject var60) {
        if (module0217.NIL == f14342(var1)) {
            f14345(var1, var60);
        }
        return var60;
    }
    
    public static SubLObject f14343(final SubLObject var1, final SubLObject var60) {
        return f14214(var1, (SubLObject)ConsesLow.list(f14340()), var60);
    }
    
    public static SubLObject f14345(final SubLObject var1, final SubLObject var60) {
        return f14216(var1, (SubLObject)ConsesLow.list(f14340()), var60);
    }
    
    public static SubLObject f14340() {
        return (SubLObject)module0217.$ic109$;
    }
    
    public static SubLObject f14346(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0217.ZERO_INTEGER;
        final SubLObject var14 = module0147.$g2094$.currentBinding(var12);
        final SubLObject var15 = module0147.$g2095$.currentBinding(var12);
        try {
            module0147.$g2094$.bind((SubLObject)module0217.$ic110$, var12);
            module0147.$g2095$.bind(module0217.$ic111$, var12);
            SubLObject var16 = module0218.f14453(module0035.f2119(var11), (SubLObject)module0217.UNPROVIDED);
            SubLObject var17 = (SubLObject)module0217.NIL;
            var17 = var16.first();
            while (module0217.NIL != var16) {
                if (module0217.NIL != module0161.f10513(module0178.f11287(var17), var11)) {
                    var13 = Numbers.add(var13, (SubLObject)module0217.ONE_INTEGER);
                }
                var16 = var16.rest();
                var17 = var16.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var15, var12);
            module0147.$g2094$.rebind(var14, var12);
        }
        return var13;
    }
    
    public static SubLObject f14347(final SubLObject var1) {
        if (module0217.NIL != f14217()) {
            return f14346(var1);
        }
        final SubLObject var2 = f14346(var1);
        if (var2.isPositive() && module0217.NIL != module0147.f9507(var1)) {
            return var2;
        }
        return (SubLObject)module0217.ZERO_INTEGER;
    }
    
    public static SubLObject f14342(final SubLObject var11) {
        final SubLObject var12 = module0161.f10557(var11);
        SubLObject var13 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0173.f10955(var12)) {
            var13 = module0269.f17758(var12);
        }
        return var13;
    }
    
    public static SubLObject f14348() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (module0217.NIL != module0128.f8463(module0217.$ic115$, (SubLObject)module0217.UNPROVIDED)) {
            SubLObject var11 = (SubLObject)module0217.NIL;
            final SubLObject var12 = module0147.$g2094$.currentBinding(var10);
            final SubLObject var13 = module0147.$g2095$.currentBinding(var10);
            try {
                module0147.$g2094$.bind((SubLObject)module0217.$ic110$, var10);
                module0147.$g2095$.bind(module0217.$ic111$, var10);
                var11 = module0259.f17001(module0217.$ic115$, (SubLObject)module0217.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var13, var10);
                module0147.$g2094$.rebind(var12, var10);
            }
            SubLObject var14 = var11;
            SubLObject var15 = (SubLObject)module0217.NIL;
            var15 = var14.first();
            while (module0217.NIL != var14) {
                if (module0217.NIL != module0173.f10955(var15)) {
                    f14349(var15);
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            return (SubLObject)module0217.NIL;
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14349(final SubLObject var1) {
        if (module0217.NIL == module0212.f13795(var1)) {
            final SubLObject var2 = module0212.f13787(var1);
            module0212.f13818(module0212.f13787(var1), f14340());
            module0212.f13849(var2, Sequences.length(module0212.f13827(var2)));
        }
        return var1;
    }
    
    public static SubLObject f14350(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var1)) {
            SubLObject var3 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var4 = module0212.f13799(var1);
            SubLObject var5 = (SubLObject)module0217.NIL;
            var5 = var4.first();
            while (module0217.NIL != var4) {
                if (module0217.NIL != module0214.f14134(var5, var1)) {
                    var3 = Numbers.add(var3, (SubLObject)module0217.ONE_INTEGER);
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
            var2 = var3;
        }
        else {
            final SubLObject var6 = f14351(var1);
            var2 = (SubLObject)((module0217.NIL != var6) ? module0212.f13808(var6) : module0217.ZERO_INTEGER);
        }
        return var2;
    }
    
    public static SubLObject f14352(final SubLObject var1) {
        if (module0217.NIL != f14217()) {
            return f14350(var1);
        }
        SubLObject var2 = (SubLObject)module0217.ZERO_INTEGER;
        if (module0217.NIL != module0212.f13795(var1)) {
            SubLObject var3 = module0212.f13799(var1);
            SubLObject var4 = (SubLObject)module0217.NIL;
            var4 = var3.first();
            while (module0217.NIL != var3) {
                if (module0217.NIL != module0214.f14134(var4, var1) && module0217.NIL != module0147.f9507(module0178.f11287(var4))) {
                    var2 = Numbers.add(var2, (SubLObject)module0217.ONE_INTEGER);
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        else {
            final SubLObject var5 = f14351(var1);
            if (module0217.NIL != var5) {
                final SubLObject var6 = var5;
                if (module0217.NIL != module0212.f13852(var6)) {
                    final SubLObject var7 = module0077.f5333(module0212.f13853(var6));
                    SubLObject var8;
                    SubLObject var9;
                    SubLObject var10;
                    for (var8 = module0032.f1741(var7), var9 = (SubLObject)module0217.NIL, var9 = module0032.f1742(var8, var7); module0217.NIL == module0032.f1744(var8, var9); var9 = module0032.f1743(var9)) {
                        var10 = module0032.f1745(var8, var9);
                        if (module0217.NIL != module0032.f1746(var9, var10) && module0217.NIL != module0147.f9507(module0178.f11287(var10))) {
                            var2 = Numbers.add(var2, (SubLObject)module0217.ONE_INTEGER);
                        }
                    }
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f14353(final SubLObject var1, final SubLObject var15) {
        assert module0217.NIL != module0004.f106(var15) : var15;
        if (module0217.NIL != f14217()) {
            return Numbers.min(var15, f14350(var1));
        }
        SubLObject var16 = (SubLObject)module0217.ZERO_INTEGER;
        SubLObject var17 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13795(var1)) {
            SubLObject var18;
            SubLObject var19;
            for (var18 = (SubLObject)module0217.NIL, var18 = module0212.f13799(var1); module0217.NIL == var17 && module0217.NIL != var18; var18 = var18.rest()) {
                var19 = var18.first();
                if (module0217.NIL != module0216.f14173(var16, var15)) {
                    var17 = (SubLObject)module0217.T;
                }
                else if (module0217.NIL != module0214.f14134(var19, var1) && module0217.NIL != module0147.f9507(module0178.f11287(var19))) {
                    var16 = Numbers.add(var16, (SubLObject)module0217.ONE_INTEGER);
                }
            }
        }
        else {
            final SubLObject var20 = f14351(var1);
            if (module0217.NIL != var20) {
                final SubLObject var21 = var20;
                if (module0217.NIL != module0212.f13852(var21)) {
                    final SubLObject var22 = module0077.f5333(module0212.f13853(var21));
                    SubLObject var23;
                    SubLObject var24;
                    SubLObject var25;
                    for (var23 = module0032.f1741(var22), var24 = (SubLObject)module0217.NIL, var24 = module0032.f1742(var23, var22); module0217.NIL == var17 && module0217.NIL == module0032.f1744(var23, var24); var24 = module0032.f1743(var24)) {
                        var25 = module0032.f1745(var23, var24);
                        if (module0217.NIL != module0032.f1746(var24, var25)) {
                            if (module0217.NIL != module0216.f14173(var16, var15)) {
                                var17 = (SubLObject)module0217.T;
                            }
                            else if (module0217.NIL != module0147.f9507(module0178.f11287(var25))) {
                                var16 = Numbers.add(var16, (SubLObject)module0217.ONE_INTEGER);
                            }
                        }
                    }
                }
            }
        }
        return Numbers.min(var15, var16);
    }
    
    public static SubLObject f14351(final SubLObject var1) {
        return module0212.f13811(var1, f14354());
    }
    
    public static SubLObject f14355(final SubLObject var1, final SubLObject var60) {
        return f14214(var1, (SubLObject)ConsesLow.list(f14354()), var60);
    }
    
    public static SubLObject f14356(final SubLObject var1, final SubLObject var60) {
        return f14216(var1, (SubLObject)ConsesLow.list(f14354()), var60);
    }
    
    public static SubLObject f14354() {
        return (SubLObject)module0217.$ic118$;
    }
    
    public static SubLObject f14357(final SubLObject var1) {
        if (module0217.NIL != module0212.f13795(var1)) {
            return module0212.f13797(var1);
        }
        return module0212.f13786(module0212.f13787(var1));
    }
    
    public static SubLObject f14358(final SubLObject var1) {
        if (module0217.NIL != f14217()) {
            return f14357(var1);
        }
        if (module0217.NIL != module0212.f13795(var1)) {
            SubLObject var2 = (SubLObject)module0217.ZERO_INTEGER;
            SubLObject var3 = module0212.f13799(var1);
            SubLObject var4 = (SubLObject)module0217.NIL;
            var4 = var3.first();
            while (module0217.NIL != var3) {
                if (module0217.NIL != module0147.f9507(module0178.f11287(var4))) {
                    var2 = Numbers.add(var2, (SubLObject)module0217.ONE_INTEGER);
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
            return var2;
        }
        return Numbers.add(new SubLObject[] { f14223(var1, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED), f14240(var1, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED), f14249(var1), f14259(var1), f14266(var1, (SubLObject)module0217.UNPROVIDED), f14272(var1, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED), f14279(var1, (SubLObject)module0217.UNPROVIDED), f14287(var1, (SubLObject)module0217.UNPROVIDED), f14295(var1, (SubLObject)module0217.UNPROVIDED), f14303(var1, (SubLObject)module0217.UNPROVIDED), f14311(var1), f14320(var1), f14329(var1), f14338(var1), f14352(var1) });
    }
    
    public static SubLObject f14359() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = (SubLObject)module0217.$ic121$;
        final SubLObject var12 = module0012.$g73$.currentBinding(var10);
        final SubLObject var13 = module0012.$g65$.currentBinding(var10);
        final SubLObject var14 = module0012.$g67$.currentBinding(var10);
        final SubLObject var15 = module0012.$g68$.currentBinding(var10);
        final SubLObject var16 = module0012.$g66$.currentBinding(var10);
        final SubLObject var17 = module0012.$g69$.currentBinding(var10);
        final SubLObject var18 = module0012.$g70$.currentBinding(var10);
        final SubLObject var19 = module0012.$silent_progressP$.currentBinding(var10);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var10);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var10), var10);
            module0012.$g67$.bind((SubLObject)module0217.ONE_INTEGER, var10);
            module0012.$g68$.bind((SubLObject)module0217.ZERO_INTEGER, var10);
            module0012.$g66$.bind((SubLObject)module0217.ZERO_INTEGER, var10);
            module0012.$g69$.bind((SubLObject)module0217.ZERO_INTEGER, var10);
            module0012.$g70$.bind((SubLObject)module0217.T, var10);
            module0012.$silent_progressP$.bind((SubLObject)((module0217.NIL != var11) ? module0012.$silent_progressP$.getDynamicValue(var10) : module0217.T), var10);
            module0012.f474(var11);
            f14348();
            f14360();
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var19, var10);
            module0012.$g70$.rebind(var18, var10);
            module0012.$g69$.rebind(var17, var10);
            module0012.$g66$.rebind(var16, var10);
            module0012.$g68$.rebind(var15, var10);
            module0012.$g67$.rebind(var14, var10);
            module0012.$g65$.rebind(var13, var10);
            module0012.$g73$.rebind(var12, var10);
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14360() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = module0212.f13760();
        SubLObject var12 = (SubLObject)module0217.NIL;
        var12 = var11.first();
        while (module0217.NIL != var11) {
            if (module0217.NIL == module0212.f13795(var12)) {
                final SubLObject var13 = module0018.$g587$.currentBinding(var10);
                final SubLObject var14 = module0147.$g2094$.currentBinding(var10);
                final SubLObject var15 = module0147.$g2095$.currentBinding(var10);
                try {
                    module0018.$g587$.bind(var12, var10);
                    module0147.$g2094$.bind((SubLObject)module0217.$ic110$, var10);
                    module0147.$g2095$.bind(module0217.$ic111$, var10);
                    module0219.f14502(Symbols.symbol_function((SubLObject)module0217.$ic122$), var12, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                }
                finally {
                    module0147.$g2095$.rebind(var15, var10);
                    module0147.$g2094$.rebind(var14, var10);
                    module0018.$g587$.rebind(var13, var10);
                }
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14361(final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        f14356(module0018.$g587$.getDynamicValue(var61), var60);
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14362(final SubLObject var1) {
        assert module0217.NIL != module0212.f13762(var1) : var1;
        return Sequences.length(f14363(var1));
    }
    
    public static SubLObject f14363(final SubLObject var1) {
        if (module0217.NIL != module0212.f13795(var1)) {
            SubLObject var2 = (SubLObject)module0217.NIL;
            SubLObject var3 = module0212.f13799(var1);
            SubLObject var4 = (SubLObject)module0217.NIL;
            var4 = var3.first();
            while (module0217.NIL != var3) {
                final SubLObject var5 = module0178.f11287(var4);
                if (module0217.NIL == conses_high.member(var5, var2, Symbols.symbol_function((SubLObject)module0217.EQL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                    var2 = (SubLObject)ConsesLow.cons(var5, var2);
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
            return var2;
        }
        final SubLObject var6 = module0212.f13827(module0212.f13787(var1));
        final SubLObject var7 = module0035.f2076((SubLObject)module0217.$ic124$, var6);
        final SubLObject var8 = module0035.f2269(var7, (SubLObject)module0217.EQUAL, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
        return var8;
    }
    
    public static SubLObject f14364(final SubLObject var60, SubLObject var1) {
        if (var1 == module0217.UNPROVIDED) {
            var1 = (SubLObject)module0217.NIL;
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        assert module0217.NIL != module0174.f11035(var60) : var60;
        final SubLObject var62 = module0214.$g2378$.currentBinding(var61);
        final SubLObject var63 = module0214.$g2379$.currentBinding(var61);
        try {
            module0214.$g2378$.bind((SubLObject)module0217.T, var61);
            module0214.$g2379$.bind((SubLObject)module0217.NIL, var61);
            if (module0217.NIL != module0174.f11045(var60)) {
                if (module0217.NIL != module0175.f11065(var60)) {
                    f14365(var60, var1);
                }
                else {
                    f14366(var60, var1);
                }
            }
            if (module0217.NIL != module0214.$g2379$.getDynamicValue(var61)) {
                module0214.f14142();
            }
        }
        finally {
            module0214.$g2379$.rebind(var63, var61);
            module0214.$g2378$.rebind(var62, var61);
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14367(final SubLObject var60, SubLObject var1) {
        if (var1 == module0217.UNPROVIDED) {
            var1 = (SubLObject)module0217.NIL;
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        assert module0217.NIL != module0174.f11035(var60) : var60;
        final SubLObject var62 = module0214.$g2378$.currentBinding(var61);
        final SubLObject var63 = module0214.$g2379$.currentBinding(var61);
        try {
            module0214.$g2378$.bind((SubLObject)module0217.T, var61);
            module0214.$g2379$.bind((SubLObject)module0217.NIL, var61);
            if (module0217.NIL != module0178.f11284(var60)) {
                f14368(var60, var1);
            }
            else {
                f14369(var60, var1);
            }
            if (module0217.NIL != module0214.$g2379$.getDynamicValue(var61)) {
                module0214.f14142();
            }
        }
        finally {
            module0214.$g2379$.rebind(var63, var61);
            module0214.$g2378$.rebind(var62, var61);
        }
        return var60;
    }
    
    public static SubLObject f14370(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var4 = module0147.$g2095$.currentBinding(var2);
        final SubLObject var5 = Errors.$ignore_warnsP$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0217.$ic110$, var2);
            module0147.$g2095$.bind(module0217.$ic111$, var2);
            Errors.$ignore_warnsP$.bind((SubLObject)module0217.T, var2);
            module0342.f23127(module0219.f14525(var1));
            if (module0217.NIL != module0161.f10481(var1)) {
                module0342.f23127(module0219.f14524(var1));
            }
            module0342.f23127(module0219.f14514(var1, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED));
            module0342.f23127(module0219.f14514(var1, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED));
            module0342.f23127(module0219.f14516(var1, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED));
            module0342.f23127(module0219.f14516(var1, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED));
            module0342.f23127(module0219.f14517(var1, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED));
            module0342.f23127(module0219.f14517(var1, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED));
            module0342.f23127(module0219.f14518(var1, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED));
            module0342.f23127(module0219.f14518(var1, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED));
            module0342.f23127(module0219.f14519(var1, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED));
            module0342.f23127(module0219.f14519(var1, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED));
            module0342.f23127(module0219.f14520(var1, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED));
            module0342.f23127(module0219.f14520(var1, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED));
            module0342.f23127(module0219.f14521(var1, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED));
            module0342.f23127(module0219.f14522(var1, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED));
            module0342.f23127(module0219.f14523(var1, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED));
            if (module0217.NIL != module0173.f10955(var1)) {
                module0342.f23127(module0219.f14512(var1, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL));
                module0342.f23127(module0219.f14513(var1));
            }
            SubLObject var6 = f14242(var1, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            SubLObject var7;
            var6 = (var7 = Sort.sort(var6, Symbols.symbol_function((SubLObject)module0217.$ic128$), (SubLObject)module0217.UNPROVIDED));
            SubLObject var8 = (SubLObject)module0217.NIL;
            var8 = var7.first();
            while (module0217.NIL != var7) {
                module0342.f23127(module0219.f14511(var1, var8, (SubLObject)module0217.NIL));
                var7 = var7.rest();
                var8 = var7.first();
            }
            SubLObject var9 = f14228(var1, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            var9 = (var7 = Sort.sort(var9, Symbols.symbol_function((SubLObject)module0217.$ic128$), (SubLObject)module0217.UNPROVIDED));
            var8 = (SubLObject)module0217.NIL;
            var8 = var7.first();
            while (module0217.NIL != var7) {
                if (!module0217.ONE_INTEGER.numE(var8)) {
                    module0342.f23127(module0219.f14509(var1, var8, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL));
                }
                var7 = var7.rest();
                var8 = var7.first();
            }
            final SubLObject var10 = module0219.f14509(var1, (SubLObject)module0217.ONE_INTEGER, module0217.$ic129$, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
            final SubLObject var11 = module0219.f14509(var1, (SubLObject)module0217.ONE_INTEGER, module0217.$ic130$, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
            final SubLObject var12 = module0219.f14509(var1, (SubLObject)module0217.ONE_INTEGER, module0217.$ic131$, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
            SubLObject var14;
            final SubLObject var13 = var14 = module0219.f14509(var1, (SubLObject)module0217.ONE_INTEGER, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
            SubLObject var15 = (SubLObject)module0217.NIL;
            var15 = var14.first();
            while (module0217.NIL != var14) {
                if (module0217.NIL != module0178.f11361(var15, (SubLObject)module0217.UNPROVIDED) && module0217.NIL == module0004.f104(var15, var10, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL == conses_high.member(var15, var11, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED) && module0217.NIL == conses_high.member(var15, var12, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED)) {
                    module0342.f23126(var15);
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            module0342.f23127(var11);
            module0342.f23127(var10);
            module0342.f23127(var12);
            final SubLObject var16 = module0226.f15093(var1, (SubLObject)module0217.T);
            if (module0217.NIL != var16) {
                Errors.warn((SubLObject)module0217.$ic132$, var1);
            }
            module0342.f23127(var16);
        }
        finally {
            Errors.$ignore_warnsP$.rebind(var5, var2);
            module0147.$g2095$.rebind(var4, var2);
            module0147.$g2094$.rebind(var3, var2);
        }
        return var1;
    }
    
    public static SubLObject f14371(SubLObject var100) {
        var100 = module0202.f12717(var100);
        SubLObject var101 = (SubLObject)module0217.NIL;
        SubLObject var102 = (SubLObject)module0217.NIL;
        final SubLObject var103 = module0205.f13180(var100, (SubLObject)module0217.$ic136$);
        SubLObject var104 = (SubLObject)module0217.NIL;
        SubLObject var105 = (SubLObject)module0217.NIL;
        SubLObject var106 = (SubLObject)module0217.NIL;
        var104 = var103;
        var105 = var104.first();
        for (var106 = (SubLObject)module0217.ZERO_INTEGER; module0217.NIL != var104; var104 = var104.rest(), var105 = var104.first(), var106 = module0048.f_1X(var106)) {
            if (module0217.NIL != module0212.f13764(var105)) {
                final SubLObject var107 = (SubLObject)ConsesLow.cons(var106, var105);
                var102 = (SubLObject)ConsesLow.cons(var107, var102);
            }
            else {
                var101 = conses_high.nunion(module0035.f2399(var105, Symbols.symbol_function((SubLObject)module0217.$ic137$), (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED), var101, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            }
        }
        if (module0217.NIL != var101) {
            var101 = module0035.f2269(var101, Symbols.symbol_function((SubLObject)module0217.EQUAL), (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            SubLObject var108 = (SubLObject)module0217.NIL;
            SubLObject var109 = var101;
            SubLObject var110 = (SubLObject)module0217.NIL;
            var110 = var109.first();
            while (module0217.NIL != var109) {
                if (module0217.NIL == module0004.f104(var110, var102, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.$ic138$))) {
                    var108 = (SubLObject)ConsesLow.cons(var110, var108);
                }
                var109 = var109.rest();
                var110 = var109.first();
            }
            var101 = var108;
        }
        var102 = f14372(var102);
        return Values.values(var102, var101);
    }
    
    public static SubLObject f14372(SubLObject var109) {
        var109 = Sort.sort(var109, Symbols.symbol_function((SubLObject)module0217.$ic139$), Symbols.symbol_function((SubLObject)module0217.$ic140$));
        var109 = module0035.f2389(var109, Symbols.symbol_function((SubLObject)module0217.$ic141$), Symbols.symbol_function((SubLObject)module0217.$ic138$));
        var109 = module0035.f2389(var109, Symbols.symbol_function((SubLObject)module0217.$ic142$), Symbols.symbol_function((SubLObject)module0217.$ic140$));
        var109 = module0035.f2389(var109, (SubLObject)module0217.$ic143$, Symbols.symbol_function((SubLObject)module0217.$ic138$));
        return var109;
    }
    
    public static SubLObject f14373(final SubLObject var100, final SubLObject var11) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        var101.resetMultipleValues();
        final SubLObject var102 = f14371(var100);
        SubLObject var103 = var101.secondMultipleValue();
        var101.resetMultipleValues();
        if (module0217.NIL == module0173.f10955(var11)) {
            var103 = conses_high.nunion(module0205.f13188(var11, (SubLObject)module0217.$ic144$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED), var103, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
        }
        return Values.values(var102, var103);
    }
    
    public static SubLObject f14365(final SubLObject var60, SubLObject var1) {
        if (var1 == module0217.UNPROVIDED) {
            var1 = (SubLObject)module0217.NIL;
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        final SubLObject var62 = module0178.f11285(var60);
        final SubLObject var63 = module0178.f11287(var60);
        var61.resetMultipleValues();
        final SubLObject var64 = f14373(var62, var63);
        final SubLObject var65 = var61.secondMultipleValue();
        var61.resetMultipleValues();
        final SubLObject var66 = conses_high.assoc((SubLObject)module0217.ZERO_INTEGER, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED).rest();
        if (module0217.NIL == module0161.f10481(var63) || module0217.NIL == module0173.f10955(var66)) {
            Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic146$, var60);
            return (SubLObject)module0217.NIL;
        }
        if (module0217.NIL == var1 || module0217.NIL != module0161.f10513(var1, var63)) {
            f14341(var63, var60);
        }
        if (module0217.NIL == var1 || var1.eql(var66)) {
            f14255(var66, var63, var60);
        }
        SubLObject var67 = var64;
        SubLObject var68 = (SubLObject)module0217.NIL;
        var68 = var67.first();
        while (module0217.NIL != var67) {
            SubLObject var70;
            final SubLObject var69 = var70 = var68;
            SubLObject var71 = (SubLObject)module0217.NIL;
            SubLObject var72 = (SubLObject)module0217.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var70, var69, (SubLObject)module0217.$ic147$);
            var71 = var70.first();
            var70 = (var72 = var70.rest());
            if (var71.isPositive() && module0217.NIL != var72 && (module0217.NIL == var1 || var1.equal(var72))) {
                f14236(var72, var71, var66, var63, var60);
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        if (var66.eql(module0217.$ic131$)) {
            f14374(var60, var1);
        }
        else if (module0217.NIL != var65) {
            var67 = var65;
            SubLObject var73 = (SubLObject)module0217.NIL;
            var73 = var67.first();
            while (module0217.NIL != var67) {
                if (module0217.NIL != module0212.f13769(var73) && (module0217.NIL == var1 || var1.equal(var73))) {
                    f14355(var73, var60);
                }
                var67 = var67.rest();
                var73 = var67.first();
            }
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14368(final SubLObject var60, SubLObject var1) {
        if (var1 == module0217.UNPROVIDED) {
            var1 = (SubLObject)module0217.NIL;
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        final SubLObject var62 = module0178.f11285(var60);
        final SubLObject var63 = module0178.f11287(var60);
        var61.resetMultipleValues();
        final SubLObject var64 = f14373(var62, var63);
        final SubLObject var65 = var61.secondMultipleValue();
        var61.resetMultipleValues();
        final SubLObject var66 = conses_high.assoc((SubLObject)module0217.ZERO_INTEGER, var64, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED).rest();
        if (module0217.NIL == module0161.f10481(var63) || module0217.NIL == module0173.f10955(var66)) {
            Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic146$, var60);
            return (SubLObject)module0217.NIL;
        }
        if (module0217.NIL == var1 || module0217.NIL != module0161.f10513(var1, var63)) {
            f14344(var63, var60);
        }
        if (module0217.NIL == var1 || var1.eql(var66)) {
            f14256(var66, var63, var60);
        }
        SubLObject var67 = var64;
        SubLObject var68 = (SubLObject)module0217.NIL;
        var68 = var67.first();
        while (module0217.NIL != var67) {
            SubLObject var70;
            final SubLObject var69 = var70 = var68;
            SubLObject var71 = (SubLObject)module0217.NIL;
            SubLObject var72 = (SubLObject)module0217.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var70, var69, (SubLObject)module0217.$ic147$);
            var71 = var70.first();
            var70 = (var72 = var70.rest());
            if (var71.isPositive() && module0217.NIL != var72 && (module0217.NIL == var1 || var1.equal(var72))) {
                f14237(var72, var71, var66, var63, var60);
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        if (var66.eql(module0217.$ic131$)) {
            f14375(var60, var1);
        }
        else if (module0217.NIL != var65) {
            var67 = var65;
            SubLObject var73 = (SubLObject)module0217.NIL;
            var73 = var67.first();
            while (module0217.NIL != var67) {
                if (module0217.NIL != module0212.f13769(var73) && (module0217.NIL == var1 || var1.equal(var73))) {
                    f14356(var73, var60);
                }
                var67 = var67.rest();
                var73 = var67.first();
            }
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14376(final SubLObject var117) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        var118.resetMultipleValues();
        final SubLObject var119 = f14371(var117);
        final SubLObject var120 = var118.secondMultipleValue();
        var118.resetMultipleValues();
        return Values.values(var119, var120);
    }
    
    public static SubLObject f14374(final SubLObject var60, SubLObject var1) {
        if (var1 == module0217.UNPROVIDED) {
            var1 = (SubLObject)module0217.NIL;
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        var61.resetMultipleValues();
        final SubLObject var62 = module0202.f12796(module0178.f11285(var60));
        final SubLObject var63 = var61.secondMultipleValue();
        final SubLObject var64 = var61.thirdMultipleValue();
        var61.resetMultipleValues();
        if (var62.eql(module0217.$ic131$)) {
            var61.resetMultipleValues();
            final SubLObject var65 = f14376(var64);
            final SubLObject var66 = var61.secondMultipleValue();
            var61.resetMultipleValues();
            final SubLObject var67 = conses_high.assoc((SubLObject)module0217.ZERO_INTEGER, var65, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED).rest();
            if (module0217.NIL == module0173.f10955(var67)) {
                Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic146$, var60);
                return (SubLObject)module0217.NIL;
            }
            if (module0217.NIL == var1 || var1.eql(var67)) {
                f14262(var67, var60);
            }
            SubLObject var68 = var65;
            SubLObject var69 = (SubLObject)module0217.NIL;
            var69 = var68.first();
            while (module0217.NIL != var68) {
                SubLObject var71;
                final SubLObject var70 = var71 = var69;
                SubLObject var72 = (SubLObject)module0217.NIL;
                SubLObject var73 = (SubLObject)module0217.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var71, var70, (SubLObject)module0217.$ic148$);
                var72 = var71.first();
                var71 = (var73 = var71.rest());
                if (var72.isPositive() && module0217.NIL != var73 && (module0217.NIL == var1 || var1.equal(var73))) {
                    f14245(var73, var72, var67, var60);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
            if (module0217.NIL != var66) {
                var68 = var66;
                SubLObject var74 = (SubLObject)module0217.NIL;
                var74 = var68.first();
                while (module0217.NIL != var68) {
                    if (module0217.NIL != module0212.f13769(var74) && (module0217.NIL == var1 || var1.equal(var74))) {
                        f14355(var74, var60);
                    }
                    var68 = var68.rest();
                    var74 = var68.first();
                }
            }
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14375(final SubLObject var60, SubLObject var1) {
        if (var1 == module0217.UNPROVIDED) {
            var1 = (SubLObject)module0217.NIL;
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        var61.resetMultipleValues();
        final SubLObject var62 = module0202.f12796(module0178.f11285(var60));
        final SubLObject var63 = var61.secondMultipleValue();
        final SubLObject var64 = var61.thirdMultipleValue();
        var61.resetMultipleValues();
        if (var62.eql(module0217.$ic131$)) {
            var61.resetMultipleValues();
            final SubLObject var65 = f14376(var64);
            final SubLObject var66 = var61.secondMultipleValue();
            var61.resetMultipleValues();
            final SubLObject var67 = conses_high.assoc((SubLObject)module0217.ZERO_INTEGER, var65, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED).rest();
            if (module0217.NIL == module0173.f10955(var67)) {
                Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic146$, var60);
                return (SubLObject)module0217.NIL;
            }
            if (module0217.NIL == var1 || var1.eql(var67)) {
                f14263(var67, var60);
            }
            SubLObject var68 = var65;
            SubLObject var69 = (SubLObject)module0217.NIL;
            var69 = var68.first();
            while (module0217.NIL != var68) {
                SubLObject var71;
                final SubLObject var70 = var71 = var69;
                SubLObject var72 = (SubLObject)module0217.NIL;
                SubLObject var73 = (SubLObject)module0217.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var71, var70, (SubLObject)module0217.$ic148$);
                var72 = var71.first();
                var71 = (var73 = var71.rest());
                if (var72.isPositive() && module0217.NIL != var73 && (module0217.NIL == var1 || var1.equal(var73))) {
                    f14246(var73, var72, var67, var60);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
            if (module0217.NIL != var66) {
                var68 = var66;
                SubLObject var74 = (SubLObject)module0217.NIL;
                var74 = var68.first();
                while (module0217.NIL != var68) {
                    if (module0217.NIL != module0212.f13769(var74) && (module0217.NIL == var1 || var1.equal(var74))) {
                        f14356(var74, var60);
                    }
                    var68 = var68.rest();
                    var74 = var68.first();
                }
            }
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14377(final SubLObject var127, final SubLObject var64) {
        SubLObject var128 = (SubLObject)module0217.NIL;
        SubLObject var129 = (SubLObject)module0217.NIL;
        SubLObject var130 = var127;
        SubLObject var131 = (SubLObject)module0217.NIL;
        var131 = var130.first();
        while (module0217.NIL != var130) {
            final SubLObject var132 = module0205.f13333(var131);
            if (var132.eql(module0217.$ic129$)) {
                final SubLObject var133 = module0205.f13380(var131, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != module0173.f10955(var133)) {
                    final SubLObject var134 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic149$, var133);
                    if (module0217.NIL == conses_high.member(var134, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                        var128 = (SubLObject)ConsesLow.cons(var134, var128);
                    }
                }
                else {
                    final SubLObject var134 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic150$, module0217.$ic129$);
                    if (module0217.NIL == conses_high.member(var134, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                        var128 = (SubLObject)ConsesLow.cons(var134, var128);
                    }
                }
            }
            else if (var132.eql(module0217.$ic151$)) {
                final SubLObject var133 = module0205.f13380(var131, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != module0173.f10955(var133)) {
                    final SubLObject var134 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic152$, var133);
                    if (module0217.NIL == conses_high.member(var134, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                        var128 = (SubLObject)ConsesLow.cons(var134, var128);
                    }
                }
                else {
                    final SubLObject var134 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic150$, module0217.$ic151$);
                    if (module0217.NIL == conses_high.member(var134, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                        var128 = (SubLObject)ConsesLow.cons(var134, var128);
                    }
                }
            }
            else if (var132.eql(module0217.$ic130$)) {
                final SubLObject var133 = module0205.f13380(var131, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != module0173.f10955(var133)) {
                    final SubLObject var134 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic153$, var133);
                    if (module0217.NIL == conses_high.member(var134, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                        var128 = (SubLObject)ConsesLow.cons(var134, var128);
                    }
                }
                else {
                    final SubLObject var134 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic150$, module0217.$ic130$);
                    if (module0217.NIL == conses_high.member(var134, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                        var128 = (SubLObject)ConsesLow.cons(var134, var128);
                    }
                }
            }
            else if (var132.eql(module0217.$ic154$)) {
                final SubLObject var135 = module0205.f13380(var131, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != module0161.f10481(var135)) {
                    final SubLObject var134 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic155$, var135);
                    if (module0217.NIL == conses_high.member(var134, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                        var128 = (SubLObject)ConsesLow.cons(var134, var128);
                    }
                }
                else {
                    final SubLObject var134 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic150$, module0217.$ic154$);
                    if (module0217.NIL == conses_high.member(var134, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                        var128 = (SubLObject)ConsesLow.cons(var134, var128);
                    }
                }
            }
            else if (var64 == module0217.$ic127$ && var132.eql(module0217.$ic131$)) {
                final SubLObject var136 = module0205.f13380(var131, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != module0202.f12659(var136)) {
                    final SubLObject var137 = module0205.f13276(var136);
                    if (module0217.NIL != module0173.f10955(var137)) {
                        final SubLObject var138 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic156$, var137);
                        if (module0217.NIL == conses_high.member(var138, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                            var128 = (SubLObject)ConsesLow.cons(var138, var128);
                        }
                    }
                    else {
                        final SubLObject var138 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic150$, module0217.$ic131$);
                        if (module0217.NIL == conses_high.member(var138, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                            var128 = (SubLObject)ConsesLow.cons(var138, var128);
                        }
                    }
                }
                else {
                    final SubLObject var134 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic150$, module0217.$ic131$);
                    if (module0217.NIL == conses_high.member(var134, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                        var128 = (SubLObject)ConsesLow.cons(var134, var128);
                    }
                }
            }
            else if (var64 == module0217.$ic126$ && var132.eql(module0217.$ic157$)) {
                final SubLObject var139 = module0205.f13380(var131, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != module0174.f11035(var139)) {
                    final SubLObject var134 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic158$, var139);
                    if (module0217.NIL == conses_high.member(var134, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                        var128 = (SubLObject)ConsesLow.cons(var134, var128);
                    }
                }
                else {
                    final SubLObject var134 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic150$, module0217.$ic157$);
                    if (module0217.NIL == conses_high.member(var134, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                        var128 = (SubLObject)ConsesLow.cons(var134, var128);
                    }
                }
            }
            else if (var64 == module0217.$ic126$ && var132.eql(module0217.$ic159$)) {
                final SubLObject var139 = module0205.f13380(var131, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != module0174.f11035(var139)) {
                    final SubLObject var134 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic160$, var139);
                    if (module0217.NIL == conses_high.member(var134, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                        var128 = (SubLObject)ConsesLow.cons(var134, var128);
                    }
                }
                else {
                    final SubLObject var134 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic150$, module0217.$ic159$);
                    if (module0217.NIL == conses_high.member(var134, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                        var128 = (SubLObject)ConsesLow.cons(var134, var128);
                    }
                }
            }
            else if (var132.eql(module0217.$ic161$)) {
                final SubLObject var140 = module0205.f13380(var131, (SubLObject)module0217.UNPROVIDED);
                final SubLObject var141 = module0202.f12832(var140, (SubLObject)module0217.UNPROVIDED);
                if (module0217.NIL != module0173.f10955(var141)) {
                    final SubLObject var138 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic162$, var141);
                    if (module0217.NIL == conses_high.member(var138, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                        var128 = (SubLObject)ConsesLow.cons(var138, var128);
                    }
                }
            }
            else if (module0217.NIL != module0173.f10955(var132)) {
                final SubLObject var142 = (SubLObject)ConsesLow.list((SubLObject)module0217.$ic150$, var132);
                if (module0217.NIL == conses_high.member(var142, var128, Symbols.symbol_function((SubLObject)module0217.EQUAL), Symbols.symbol_function((SubLObject)module0217.IDENTITY))) {
                    var128 = (SubLObject)ConsesLow.cons(var142, var128);
                }
            }
            var129 = conses_high.nunion(var129, module0035.f2399(module0205.f13377(var131, (SubLObject)module0217.UNPROVIDED), Symbols.symbol_function((SubLObject)module0217.$ic163$), (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED), (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
            var130 = var130.rest();
            var131 = var130.first();
        }
        return Values.values(var128, var129);
    }
    
    public static SubLObject f14378(final SubLObject var133) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        var134.resetMultipleValues();
        final SubLObject var135 = f14377(module0232.f15306(var133), (SubLObject)module0217.$ic127$);
        final SubLObject var136 = var134.secondMultipleValue();
        var134.resetMultipleValues();
        var134.resetMultipleValues();
        final SubLObject var137 = f14377(module0232.f15308(var133), (SubLObject)module0217.$ic126$);
        final SubLObject var138 = var134.secondMultipleValue();
        var134.resetMultipleValues();
        final SubLObject var139 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0217.$ic164$), var135);
        final SubLObject var140 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0217.$ic164$), var137);
        SubLObject var141 = module0035.f2269(conses_high.nunion(var136, var138, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED), (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
        var141 = conses_high.nset_difference(conses_high.nset_difference(var141, var139, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED), var140, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
        return Values.values(var135, var137, var141);
    }
    
    public static SubLObject f14366(final SubLObject var60, SubLObject var1) {
        if (var1 == module0217.UNPROVIDED) {
            var1 = (SubLObject)module0217.NIL;
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        final SubLObject var62 = module0178.f11282(var60);
        final SubLObject var63 = module0178.f11287(var60);
        final SubLObject var64 = module0178.f11291(var60);
        var61.resetMultipleValues();
        final SubLObject var65 = f14378(var62);
        final SubLObject var66 = var61.secondMultipleValue();
        final SubLObject var67 = var61.thirdMultipleValue();
        var61.resetMultipleValues();
        SubLObject var68 = var65;
        SubLObject var69 = (SubLObject)module0217.NIL;
        var69 = var68.first();
        while (module0217.NIL != var68) {
            SubLObject var71;
            final SubLObject var70 = var71 = var69;
            SubLObject var72 = (SubLObject)module0217.NIL;
            SubLObject var73 = (SubLObject)module0217.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var71, var70, (SubLObject)module0217.$ic165$);
            var72 = var71.first();
            var71 = var71.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var71, var70, (SubLObject)module0217.$ic165$);
            var73 = var71.first();
            var71 = var71.rest();
            if (module0217.NIL == var71) {
                if (module0217.NIL != module0212.f13769(var73) && (module0217.NIL == var1 || var73.equal(var1))) {
                    final SubLObject var74 = var72;
                    if (var74.eql((SubLObject)module0217.$ic150$)) {
                        f14270(var73, (SubLObject)module0217.$ic127$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic162$)) {
                        f14275(var73, (SubLObject)module0217.$ic127$, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic156$)) {
                        f14316(var73, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic149$)) {
                        f14283(var73, (SubLObject)module0217.$ic127$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic152$)) {
                        f14291(var73, (SubLObject)module0217.$ic127$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic153$)) {
                        f14299(var73, (SubLObject)module0217.$ic127$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic155$)) {
                        f14307(var73, (SubLObject)module0217.$ic127$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic160$)) {
                        Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic166$, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic158$)) {
                        Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic167$, var60);
                    }
                    else {
                        Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic168$, var72);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var70, (SubLObject)module0217.$ic165$);
            }
            var68 = var68.rest();
            var69 = var68.first();
        }
        var68 = var66;
        SubLObject var75 = (SubLObject)module0217.NIL;
        var75 = var68.first();
        while (module0217.NIL != var68) {
            SubLObject var77;
            final SubLObject var76 = var77 = var75;
            SubLObject var78 = (SubLObject)module0217.NIL;
            SubLObject var79 = (SubLObject)module0217.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)module0217.$ic169$);
            var78 = var77.first();
            var77 = var77.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)module0217.$ic169$);
            var79 = var77.first();
            var77 = var77.rest();
            if (module0217.NIL == var77) {
                if (module0217.NIL != module0212.f13769(var79) && (module0217.NIL == var1 || var79.equal(var1))) {
                    final SubLObject var74 = var78;
                    if (var74.eql((SubLObject)module0217.$ic150$)) {
                        f14270(var79, (SubLObject)module0217.$ic126$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic162$)) {
                        f14275(var79, (SubLObject)module0217.$ic126$, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic149$)) {
                        f14283(var79, (SubLObject)module0217.$ic126$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic152$)) {
                        f14291(var79, (SubLObject)module0217.$ic126$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic153$)) {
                        f14299(var79, (SubLObject)module0217.$ic126$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic155$)) {
                        f14307(var79, (SubLObject)module0217.$ic126$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic160$)) {
                        f14334(var79, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic158$)) {
                        f14325(var79, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic156$)) {
                        Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic170$, var60);
                    }
                    else {
                        Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic168$, var78);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var76, (SubLObject)module0217.$ic169$);
            }
            var68 = var68.rest();
            var75 = var68.first();
        }
        var68 = var67;
        SubLObject var80 = (SubLObject)module0217.NIL;
        var80 = var68.first();
        while (module0217.NIL != var68) {
            if (module0217.NIL != module0212.f13769(var80) && (module0217.NIL == var1 || var80.equal(var1))) {
                f14355(var80, var60);
            }
            var68 = var68.rest();
            var80 = var68.first();
        }
        if (module0217.NIL != module0161.f10481(var63) && (module0217.NIL == var1 || module0217.NIL != module0161.f10513(var63, var1))) {
            f14341(var63, var60);
        }
        if (module0217.NIL == var1) {
            module0223.f14683(var60);
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14369(final SubLObject var60, SubLObject var1) {
        if (var1 == module0217.UNPROVIDED) {
            var1 = (SubLObject)module0217.NIL;
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        final SubLObject var62 = module0178.f11282(var60);
        final SubLObject var63 = module0178.f11287(var60);
        final SubLObject var64 = module0178.f11291(var60);
        var61.resetMultipleValues();
        final SubLObject var65 = f14378(var62);
        final SubLObject var66 = var61.secondMultipleValue();
        final SubLObject var67 = var61.thirdMultipleValue();
        var61.resetMultipleValues();
        SubLObject var68 = var65;
        SubLObject var69 = (SubLObject)module0217.NIL;
        var69 = var68.first();
        while (module0217.NIL != var68) {
            SubLObject var71;
            final SubLObject var70 = var71 = var69;
            SubLObject var72 = (SubLObject)module0217.NIL;
            SubLObject var73 = (SubLObject)module0217.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var71, var70, (SubLObject)module0217.$ic165$);
            var72 = var71.first();
            var71 = var71.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var71, var70, (SubLObject)module0217.$ic165$);
            var73 = var71.first();
            var71 = var71.rest();
            if (module0217.NIL == var71) {
                if (module0217.NIL != module0212.f13769(var73) && (module0217.NIL == var1 || var73.equal(var1))) {
                    final SubLObject var74 = var72;
                    if (var74.eql((SubLObject)module0217.$ic150$)) {
                        f14271(var73, (SubLObject)module0217.$ic127$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic162$)) {
                        f14276(var73, (SubLObject)module0217.$ic127$, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic149$)) {
                        f14284(var73, (SubLObject)module0217.$ic127$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic152$)) {
                        f14292(var73, (SubLObject)module0217.$ic127$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic153$)) {
                        f14300(var73, (SubLObject)module0217.$ic127$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic155$)) {
                        f14308(var73, (SubLObject)module0217.$ic127$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic156$)) {
                        f14317(var73, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic160$)) {
                        Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic171$, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic158$)) {
                        Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic172$, var60);
                    }
                    else {
                        Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic168$, var72);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var70, (SubLObject)module0217.$ic165$);
            }
            var68 = var68.rest();
            var69 = var68.first();
        }
        var68 = var66;
        SubLObject var75 = (SubLObject)module0217.NIL;
        var75 = var68.first();
        while (module0217.NIL != var68) {
            SubLObject var77;
            final SubLObject var76 = var77 = var75;
            SubLObject var78 = (SubLObject)module0217.NIL;
            SubLObject var79 = (SubLObject)module0217.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)module0217.$ic169$);
            var78 = var77.first();
            var77 = var77.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)module0217.$ic169$);
            var79 = var77.first();
            var77 = var77.rest();
            if (module0217.NIL == var77) {
                if (module0217.NIL != module0212.f13769(var79) && (module0217.NIL == var1 || var79.equal(var1))) {
                    final SubLObject var74 = var78;
                    if (var74.eql((SubLObject)module0217.$ic150$)) {
                        f14271(var79, (SubLObject)module0217.$ic126$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic162$)) {
                        f14276(var79, (SubLObject)module0217.$ic126$, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic149$)) {
                        f14284(var79, (SubLObject)module0217.$ic126$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic152$)) {
                        f14292(var79, (SubLObject)module0217.$ic126$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic153$)) {
                        f14300(var79, (SubLObject)module0217.$ic126$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic155$)) {
                        f14308(var79, (SubLObject)module0217.$ic126$, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic158$)) {
                        f14326(var79, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic160$)) {
                        f14335(var79, var63, var64, var60);
                    }
                    else if (var74.eql((SubLObject)module0217.$ic156$)) {
                        Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic173$, var60);
                    }
                    else {
                        Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic168$, var78);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var76, (SubLObject)module0217.$ic169$);
            }
            var68 = var68.rest();
            var75 = var68.first();
        }
        var68 = var67;
        SubLObject var80 = (SubLObject)module0217.NIL;
        var80 = var68.first();
        while (module0217.NIL != var68) {
            if (module0217.NIL != module0212.f13769(var80) && (module0217.NIL == var1 || var80.equal(var1))) {
                f14356(var80, var60);
            }
            var68 = var68.rest();
            var80 = var68.first();
        }
        if (module0217.NIL != module0161.f10481(var63) && (module0217.NIL == var1 || module0217.NIL != module0161.f10513(var63, var1))) {
            f14344(var63, var60);
        }
        if (module0217.NIL == var1) {
            module0223.f14685(var60);
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14379(final SubLObject var157, SubLObject var158) {
        if (var158 == module0217.UNPROVIDED) {
            var158 = (SubLObject)module0217.NIL;
        }
        if (module0217.NIL != f14380((SubLObject)module0217.$ic42$, var158) || module0217.NIL != f14380((SubLObject)module0217.$ic26$, var158)) {
            return f14381(var157, var158);
        }
        if (module0217.NIL != f14382((SubLObject)module0217.$ic174$, var158)) {
            return f14383(var157);
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14384(final SubLObject var157, SubLObject var158) {
        if (var158 == module0217.UNPROVIDED) {
            var158 = (SubLObject)module0217.NIL;
        }
        if (module0217.NIL != f14380((SubLObject)module0217.$ic42$, var158) || module0217.NIL != f14380((SubLObject)module0217.$ic26$, var158)) {
            return f14385(var157, var158);
        }
        if (module0217.NIL != f14382((SubLObject)module0217.$ic174$, var158)) {
            return module0218.f14461(var157, (SubLObject)module0217.UNPROVIDED);
        }
        return (SubLObject)module0217.ZERO_INTEGER;
    }
    
    public static SubLObject f14381(final SubLObject var157, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        SubLObject var160 = (SubLObject)module0217.NIL;
        final SubLObject var161 = module0147.$g2094$.currentBinding(var159);
        final SubLObject var162 = module0147.$g2095$.currentBinding(var159);
        try {
            module0147.$g2094$.bind((SubLObject)module0217.$ic110$, var159);
            module0147.$g2095$.bind(module0217.$ic111$, var159);
            var159.resetMultipleValues();
            final SubLObject var163 = f14386(var157, var158);
            final SubLObject var164 = var159.secondMultipleValue();
            final SubLObject var165 = var159.thirdMultipleValue();
            final SubLObject var166 = var159.fourthMultipleValue();
            var159.resetMultipleValues();
            if (module0217.NIL != f14380((SubLObject)module0217.$ic174$, var158) && module0217.NIL != module0218.f14466(var157, var166)) {
                var160 = f14383(var157);
            }
            else if (module0217.NIL == var163 && module0217.NIL == var164 && module0217.NIL == var165 && module0217.ZERO_INTEGER.eql(var166)) {
                var160 = (SubLObject)module0217.NIL;
            }
            else if (module0217.NIL != f14380((SubLObject)module0217.$ic42$, var158) && module0217.ZERO_INTEGER.eql(var164)) {
                var160 = f14387(var163);
            }
            else if (module0217.NIL != f14380((SubLObject)module0217.$ic26$, var158) && module0217.NIL != module0004.f105(var164)) {
                var160 = f14388(var163, var164, var165);
            }
        }
        finally {
            module0147.$g2095$.rebind(var162, var159);
            module0147.$g2094$.rebind(var161, var159);
        }
        return var160;
    }
    
    public static SubLObject f14385(final SubLObject var157, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        var159.resetMultipleValues();
        final SubLObject var160 = f14386(var157, var158);
        final SubLObject var161 = var159.secondMultipleValue();
        final SubLObject var162 = var159.thirdMultipleValue();
        final SubLObject var163 = var159.fourthMultipleValue();
        var159.resetMultipleValues();
        if (module0217.NIL != f14380((SubLObject)module0217.$ic174$, var158) && module0217.NIL != module0218.f14466(var157, var163)) {
            return module0218.f14461(var157, (SubLObject)module0217.UNPROVIDED);
        }
        return var163;
    }
    
    public static SubLObject f14386(final SubLObject var157, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = (module0217.NIL != f14380((SubLObject)module0217.$ic42$, var158) && module0217.NIL == f14380((SubLObject)module0217.$ic26$, var158)) ? module0202.f12720(module0205.f13276(var157), (SubLObject)module0217.NIL, (SubLObject)module0217.UNPROVIDED) : var157;
        var159.resetMultipleValues();
        final SubLObject var161 = f14389(var160);
        final SubLObject var162 = var159.secondMultipleValue();
        final SubLObject var163 = var159.thirdMultipleValue();
        final SubLObject var164 = var159.fourthMultipleValue();
        var159.resetMultipleValues();
        if (module0217.NIL == f14380((SubLObject)module0217.$ic26$, var158) || module0217.NIL == module0004.f105(var162)) {
            if (module0217.NIL == f14380((SubLObject)module0217.$ic42$, var158) || !module0217.ZERO_INTEGER.eql(var162)) {
                if (module0217.NIL != f14380((SubLObject)module0217.$ic26$, var158) && module0217.ZERO_INTEGER.eql(var162)) {
                    return Values.values((SubLObject)module0217.NIL, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL, (SubLObject)module0217.ZERO_INTEGER);
                }
            }
        }
        return Values.values(var161, var162, var163, var164);
    }
    
    public static SubLObject f14389(final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        var158.resetMultipleValues();
        final SubLObject var159 = f14376(var157);
        final SubLObject var160 = var158.secondMultipleValue();
        var158.resetMultipleValues();
        return f14390(var159);
    }
    
    public static SubLObject f14390(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject var112 = (SubLObject)module0217.NIL;
        SubLObject var113 = (SubLObject)module0217.NIL;
        final SubLObject var114 = conses_high.assoc((SubLObject)module0217.ZERO_INTEGER, var109, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED).rest();
        if (module0217.NIL == module0212.f13762(var114)) {
            return Values.values((SubLObject)module0217.NIL, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
        }
        SubLObject var115 = var109;
        SubLObject var116 = (SubLObject)module0217.NIL;
        var116 = var115.first();
        while (module0217.NIL != var115) {
            SubLObject var118;
            final SubLObject var117 = var118 = var116;
            SubLObject var119 = (SubLObject)module0217.NIL;
            SubLObject var120 = (SubLObject)module0217.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var118, var117, (SubLObject)module0217.$ic147$);
            var119 = var118.first();
            var118 = (var120 = var118.rest());
            if (var111.numG(module0217.$g2386$.getDynamicValue(var110))) {
                if (var119.isPositive()) {
                    if (module0217.NIL != module0212.f13762(var120)) {
                        final SubLObject var121 = f14238(var120, var119, var114);
                        if (var121.numL(var111)) {
                            var112 = var120;
                            var111 = var121;
                            var113 = var119;
                        }
                    }
                }
                else {
                    final SubLObject var121 = f14257(var114);
                    if (var121.numL(var111)) {
                        var112 = var114;
                        var111 = var121;
                        var113 = var119;
                    }
                }
            }
            var115 = var115.rest();
            var116 = var115.first();
        }
        return Values.values(var112, var113, var114, var111);
    }
    
    public static SubLObject f14391(final SubLObject var157) {
        if (module0217.NIL != module0202.f12714(var157)) {
            final SubLObject var158 = module0205.f13180(var157, (SubLObject)module0217.$ic136$);
            return f14391(var158);
        }
        final SubLObject var159 = f14376(var157);
        return f14390(var159);
    }
    
    public static SubLObject f14392(final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        var158.resetMultipleValues();
        final SubLObject var159 = f14391(var157);
        final SubLObject var160 = var158.secondMultipleValue();
        final SubLObject var161 = var158.thirdMultipleValue();
        final SubLObject var162 = var158.fourthMultipleValue();
        var158.resetMultipleValues();
        return var162;
    }
    
    public static SubLObject f14393(final SubLObject var173) {
        final SubLThread var174 = SubLProcess.currentSubLThread();
        SubLObject var175 = (SubLObject)module0217.NIL;
        SubLObject var176 = (SubLObject)module0217.NIL;
        SubLObject var177 = Numbers.$most_positive_fixnum$.getGlobalValue();
        var174.resetMultipleValues();
        final SubLObject var178 = f14378(var173);
        final SubLObject var179 = var174.secondMultipleValue();
        final SubLObject var180 = var174.thirdMultipleValue();
        var174.resetMultipleValues();
        SubLObject var181 = var179;
        SubLObject var182 = (SubLObject)module0217.NIL;
        var182 = var181.first();
        while (module0217.NIL != var181) {
            final SubLObject var183 = var182.first();
            final SubLObject var184 = conses_high.second(var182);
            if (module0217.NIL != module0212.f13762(var184)) {
                SubLObject var185 = Numbers.$most_positive_fixnum$.getGlobalValue();
                SubLObject var186 = var183;
                if (var186.eql((SubLObject)module0217.$ic150$)) {
                    var185 = f14264(var184, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                }
                else if (var186.eql((SubLObject)module0217.$ic162$)) {
                    var185 = f14272(var184, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED);
                }
                else if (var186.eql((SubLObject)module0217.$ic149$)) {
                    var185 = f14277(var184, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                }
                else if (var186.eql((SubLObject)module0217.$ic152$)) {
                    var185 = f14285(var184, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                }
                else if (var186.eql((SubLObject)module0217.$ic153$)) {
                    var185 = f14293(var184, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                }
                else if (var186.eql((SubLObject)module0217.$ic155$)) {
                    var185 = f14301(var184, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                }
                else if (var186.eql((SubLObject)module0217.$ic160$)) {
                    var185 = f14327(var184, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                }
                else if (var186.eql((SubLObject)module0217.$ic158$)) {
                    var185 = f14318(var184, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                }
                else {
                    Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic168$, var183);
                }
                if (var185.numL(var177)) {
                    var177 = var185;
                    var176 = var184;
                    var186 = var183;
                    if (var186.eql((SubLObject)module0217.$ic150$)) {
                        var175 = (SubLObject)module0217.$ic179$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic162$)) {
                        var175 = (SubLObject)module0217.$ic180$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic149$)) {
                        var175 = (SubLObject)module0217.$ic181$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic152$)) {
                        var175 = (SubLObject)module0217.$ic182$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic153$)) {
                        var175 = (SubLObject)module0217.$ic183$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic155$)) {
                        var175 = (SubLObject)module0217.$ic184$;
                    }
                    else {
                        var175 = var183;
                    }
                }
            }
            var181 = var181.rest();
            var182 = var181.first();
        }
        var181 = var178;
        SubLObject var187 = (SubLObject)module0217.NIL;
        var187 = var181.first();
        while (module0217.NIL != var181) {
            final SubLObject var188 = var187.first();
            final SubLObject var189 = conses_high.second(var187);
            if (module0217.NIL != module0212.f13762(var189)) {
                SubLObject var185 = Numbers.$most_positive_fixnum$.getGlobalValue();
                SubLObject var186 = var188;
                if (var186.eql((SubLObject)module0217.$ic150$)) {
                    var185 = f14264(var189, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                }
                else if (var186.eql((SubLObject)module0217.$ic162$)) {
                    var185 = f14272(var189, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED);
                }
                else if (var186.eql((SubLObject)module0217.$ic149$)) {
                    var185 = f14277(var189, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                }
                else if (var186.eql((SubLObject)module0217.$ic152$)) {
                    var185 = f14285(var189, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                }
                else if (var186.eql((SubLObject)module0217.$ic153$)) {
                    var185 = f14293(var189, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                }
                else if (var186.eql((SubLObject)module0217.$ic155$)) {
                    var185 = f14301(var189, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                }
                else if (var186.eql((SubLObject)module0217.$ic156$)) {
                    var185 = f14309(var189, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                }
                else {
                    Errors.cerror((SubLObject)module0217.$ic145$, (SubLObject)module0217.$ic168$, var188);
                }
                if (var185.numL(var177)) {
                    var177 = var185;
                    var176 = var189;
                    var186 = var188;
                    if (var186.eql((SubLObject)module0217.$ic150$)) {
                        var175 = (SubLObject)module0217.$ic185$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic162$)) {
                        var175 = (SubLObject)module0217.$ic186$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic149$)) {
                        var175 = (SubLObject)module0217.$ic187$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic152$)) {
                        var175 = (SubLObject)module0217.$ic188$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic153$)) {
                        var175 = (SubLObject)module0217.$ic189$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic155$)) {
                        var175 = (SubLObject)module0217.$ic190$;
                    }
                    else {
                        var175 = var188;
                    }
                }
            }
            var181 = var181.rest();
            var187 = var181.first();
        }
        var181 = var180;
        SubLObject var190 = (SubLObject)module0217.NIL;
        var190 = var181.first();
        while (module0217.NIL != var181) {
            if (module0217.NIL != module0212.f13762(var190)) {
                final SubLObject var191 = f14350(var190);
                if (var191.numL(var177)) {
                    var177 = var191;
                    var176 = var190;
                    var175 = (SubLObject)module0217.$ic118$;
                }
            }
            var181 = var181.rest();
            var190 = var181.first();
        }
        return Values.values(var175, var176);
    }
    
    public static SubLObject f14394(final SubLObject var173) {
        final SubLThread var174 = SubLProcess.currentSubLThread();
        SubLObject var175 = (SubLObject)module0217.NIL;
        var174.resetMultipleValues();
        final SubLObject var176 = f14378(var173);
        final SubLObject var177 = var174.secondMultipleValue();
        final SubLObject var178 = var174.thirdMultipleValue();
        var174.resetMultipleValues();
        SubLObject var179 = var176;
        SubLObject var180 = (SubLObject)module0217.NIL;
        var180 = var179.first();
        while (module0217.NIL != var179) {
            SubLObject var182;
            final SubLObject var181 = var182 = var180;
            SubLObject var183 = (SubLObject)module0217.NIL;
            SubLObject var184 = (SubLObject)module0217.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var182, var181, (SubLObject)module0217.$ic191$);
            var183 = var182.first();
            var182 = var182.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var182, var181, (SubLObject)module0217.$ic191$);
            var184 = var182.first();
            var182 = var182.rest();
            if (module0217.NIL == var182) {
                if (module0217.NIL != module0212.f13762(var184)) {
                    SubLObject var185 = (SubLObject)module0217.NIL;
                    final SubLObject var186 = var183;
                    if (var186.eql((SubLObject)module0217.$ic150$)) {
                        var185 = (SubLObject)module0217.$ic185$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic162$)) {
                        var185 = (SubLObject)module0217.$ic186$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic149$)) {
                        var185 = (SubLObject)module0217.$ic187$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic152$)) {
                        var185 = (SubLObject)module0217.$ic188$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic153$)) {
                        var185 = (SubLObject)module0217.$ic189$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic155$)) {
                        var185 = (SubLObject)module0217.$ic190$;
                    }
                    else {
                        var185 = var183;
                    }
                    var175 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var185, var184), var175);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var181, (SubLObject)module0217.$ic191$);
            }
            var179 = var179.rest();
            var180 = var179.first();
        }
        var179 = var177;
        SubLObject var187 = (SubLObject)module0217.NIL;
        var187 = var179.first();
        while (module0217.NIL != var179) {
            SubLObject var189;
            final SubLObject var188 = var189 = var187;
            SubLObject var190 = (SubLObject)module0217.NIL;
            SubLObject var184 = (SubLObject)module0217.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var189, var188, (SubLObject)module0217.$ic192$);
            var190 = var189.first();
            var189 = var189.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var189, var188, (SubLObject)module0217.$ic192$);
            var184 = var189.first();
            var189 = var189.rest();
            if (module0217.NIL == var189) {
                if (module0217.NIL != module0212.f13762(var184)) {
                    SubLObject var185 = (SubLObject)module0217.NIL;
                    final SubLObject var186 = var190;
                    if (var186.eql((SubLObject)module0217.$ic150$)) {
                        var185 = (SubLObject)module0217.$ic179$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic162$)) {
                        var185 = (SubLObject)module0217.$ic180$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic149$)) {
                        var185 = (SubLObject)module0217.$ic181$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic152$)) {
                        var185 = (SubLObject)module0217.$ic182$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic153$)) {
                        var185 = (SubLObject)module0217.$ic183$;
                    }
                    else if (var186.eql((SubLObject)module0217.$ic155$)) {
                        var185 = (SubLObject)module0217.$ic184$;
                    }
                    else {
                        var185 = var190;
                    }
                    var175 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var185, var184), var175);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var188, (SubLObject)module0217.$ic192$);
            }
            var179 = var179.rest();
            var187 = var179.first();
        }
        var179 = var178;
        SubLObject var191 = (SubLObject)module0217.NIL;
        var191 = var179.first();
        while (module0217.NIL != var179) {
            if (module0217.NIL != module0212.f13762(var191)) {
                var175 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0217.$ic118$, var191), var175);
            }
            var179 = var179.rest();
            var191 = var179.first();
        }
        return Sequences.nreverse(var175);
    }
    
    public static SubLObject f14395(final SubLObject var183) {
        return module0035.f2327(var183);
    }
    
    public static SubLObject f14396(final SubLObject var159, final SubLObject var184, SubLObject var185) {
        if (var185 == module0217.UNPROVIDED) {
            var185 = (SubLObject)module0217.NIL;
        }
        return conses_high.getf(var159, var184, var185);
    }
    
    public static SubLObject f14397(final SubLObject var159, final SubLObject var184, final SubLObject var186) {
        return conses_high.putf(var159, var184, var186);
    }
    
    public static SubLObject f14398(final SubLObject var159) {
        return f14396(var159, (SubLObject)module0217.$ic193$, (SubLObject)module0217.UNPROVIDED);
    }
    
    public static SubLObject f14399(final SubLObject var159) {
        final SubLObject var160 = f14396(var159, (SubLObject)module0217.$ic194$, (SubLObject)module0217.UNPROVIDED);
        return var160;
    }
    
    public static SubLObject f14400(final SubLObject var159) {
        final SubLObject var160 = f14396(var159, (SubLObject)module0217.$ic195$, (SubLObject)module0217.UNPROVIDED);
        final SubLObject var161 = f14396(var159, (SubLObject)module0217.$ic196$, (SubLObject)module0217.UNPROVIDED);
        final SubLObject var162 = f14396(var159, (SubLObject)module0217.$ic194$, (SubLObject)module0217.UNPROVIDED);
        return Values.values(var160, var161, var162);
    }
    
    public static SubLObject f14401(final SubLObject var159) {
        final SubLObject var160 = f14396(var159, (SubLObject)module0217.$ic197$, (SubLObject)module0217.UNPROVIDED);
        return var160;
    }
    
    public static SubLObject f14383(final SubLObject var100) {
        SubLObject var101 = (SubLObject)module0217.NIL;
        var101 = f14397(var101, (SubLObject)module0217.$ic193$, (SubLObject)module0217.$ic174$);
        var101 = f14397(var101, (SubLObject)module0217.$ic197$, module0218.f14455(var100));
        return var101;
    }
    
    public static SubLObject f14402(final SubLObject var59) {
        SubLObject var60 = (SubLObject)module0217.NIL;
        var60 = f14397(var60, (SubLObject)module0217.$ic193$, (SubLObject)module0217.$ic36$);
        var60 = f14397(var60, (SubLObject)module0217.$ic194$, var59);
        return var60;
    }
    
    public static SubLObject f14387(final SubLObject var162) {
        SubLObject var163 = (SubLObject)module0217.NIL;
        var163 = f14397(var163, (SubLObject)module0217.$ic193$, (SubLObject)module0217.$ic42$);
        var163 = f14397(var163, (SubLObject)module0217.$ic198$, var162);
        return var163;
    }
    
    public static SubLObject f14403(final SubLObject var165, final SubLObject var161, final SubLObject var188) {
        SubLObject var189 = (SubLObject)module0217.NIL;
        var189 = f14397(var189, (SubLObject)module0217.$ic193$, (SubLObject)module0217.$ic18$);
        var189 = f14397(var189, (SubLObject)module0217.$ic195$, var165);
        var189 = f14397(var189, (SubLObject)module0217.$ic196$, var161);
        var189 = f14397(var189, (SubLObject)module0217.$ic194$, var188);
        return var189;
    }
    
    public static SubLObject f14388(final SubLObject var165, final SubLObject var161, final SubLObject var162) {
        SubLObject var166 = (SubLObject)module0217.NIL;
        var166 = f14397(var166, (SubLObject)module0217.$ic193$, (SubLObject)module0217.$ic26$);
        var166 = f14397(var166, (SubLObject)module0217.$ic195$, var165);
        var166 = f14397(var166, (SubLObject)module0217.$ic196$, var161);
        var166 = f14397(var166, (SubLObject)module0217.$ic198$, var162);
        return var166;
    }
    
    public static SubLObject f14380(final SubLObject var180, final SubLObject var158) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var158 || module0217.NIL != conses_high.member(var180, var158, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED));
    }
    
    public static SubLObject f14382(final SubLObject var180, final SubLObject var158) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL != module0035.f1997(var158) && var180.eql(var158.first()));
    }
    
    public static SubLObject f14404(final SubLObject var128, final SubLObject var189, SubLObject var158) {
        if (var158 == module0217.UNPROVIDED) {
            var158 = (SubLObject)module0217.NIL;
        }
        if (module0217.NIL != f14380((SubLObject)module0217.$ic36$, var158) || module0217.NIL != f14380((SubLObject)module0217.$ic18$, var158)) {
            return f14405(var128, var189, var158);
        }
        if (module0217.NIL != f14382((SubLObject)module0217.$ic174$, var158)) {
            return f14383(var128);
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14406(final SubLObject var128, final SubLObject var189, SubLObject var158) {
        if (var158 == module0217.UNPROVIDED) {
            var158 = (SubLObject)module0217.NIL;
        }
        if (module0217.NIL != f14380((SubLObject)module0217.$ic36$, var158) || module0217.NIL != f14380((SubLObject)module0217.$ic18$, var158)) {
            return f14407(var128, var189, var158);
        }
        if (module0217.NIL != f14382((SubLObject)module0217.$ic174$, var158)) {
            return module0218.f14460(var128, (SubLObject)module0217.UNPROVIDED);
        }
        return (SubLObject)module0217.ZERO_INTEGER;
    }
    
    public static SubLObject f14405(final SubLObject var128, final SubLObject var189, final SubLObject var158) {
        final SubLThread var190 = SubLProcess.currentSubLThread();
        SubLObject var191 = (SubLObject)module0217.NIL;
        var190.resetMultipleValues();
        final SubLObject var192 = f14408(var128, var189, var158);
        final SubLObject var193 = var190.secondMultipleValue();
        final SubLObject var194 = var190.thirdMultipleValue();
        final SubLObject var195 = var190.fourthMultipleValue();
        var190.resetMultipleValues();
        if (module0217.NIL != f14380((SubLObject)module0217.$ic174$, var158) && module0217.NIL != module0218.f14466(var128, var195)) {
            var191 = f14383(var128);
        }
        else if (module0217.NIL == var192 && module0217.NIL == var193 && module0217.NIL == var194 && module0217.ZERO_INTEGER.eql(var195)) {
            var191 = (SubLObject)module0217.NIL;
        }
        else if (module0217.NIL != f14380((SubLObject)module0217.$ic36$, var158) && module0217.ZERO_INTEGER.eql(var193)) {
            var191 = f14402(var192);
        }
        else if (module0217.NIL != f14380((SubLObject)module0217.$ic18$, var158) && module0217.NIL != module0004.f105(var193)) {
            var191 = f14403(var192, var193, var194);
        }
        return var191;
    }
    
    public static SubLObject f14407(final SubLObject var128, final SubLObject var189, final SubLObject var158) {
        final SubLThread var190 = SubLProcess.currentSubLThread();
        var190.resetMultipleValues();
        final SubLObject var191 = f14408(var128, var189, var158);
        final SubLObject var192 = var190.secondMultipleValue();
        final SubLObject var193 = var190.thirdMultipleValue();
        final SubLObject var194 = var190.fourthMultipleValue();
        var190.resetMultipleValues();
        if (module0217.NIL != f14380((SubLObject)module0217.$ic174$, var158) && module0217.NIL != module0218.f14466(var128, var194)) {
            return module0218.f14460(var128, (SubLObject)module0217.UNPROVIDED);
        }
        return var194;
    }
    
    public static SubLObject f14408(final SubLObject var128, final SubLObject var189, final SubLObject var158) {
        final SubLThread var190 = SubLProcess.currentSubLThread();
        final SubLObject var191 = (module0217.NIL != f14380((SubLObject)module0217.$ic36$, var158) && module0217.NIL == f14380((SubLObject)module0217.$ic18$, var158)) ? module0202.f12720(module0205.f13333(var128), (SubLObject)module0217.NIL, (SubLObject)module0217.UNPROVIDED) : var128;
        var190.resetMultipleValues();
        final SubLObject var192 = f14409(var191, var189);
        final SubLObject var193 = var190.secondMultipleValue();
        final SubLObject var194 = var190.thirdMultipleValue();
        final SubLObject var195 = var190.fourthMultipleValue();
        var190.resetMultipleValues();
        if (module0217.NIL == f14380((SubLObject)module0217.$ic18$, var158) || module0217.NIL == module0004.f105(var193)) {
            if (module0217.NIL == f14380((SubLObject)module0217.$ic36$, var158) || !module0217.ZERO_INTEGER.eql(var193)) {
                if (module0217.NIL != f14380((SubLObject)module0217.$ic18$, var158) && module0217.ZERO_INTEGER.eql(var193)) {
                    return Values.values((SubLObject)module0217.NIL, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL, (SubLObject)module0217.ZERO_INTEGER);
                }
            }
        }
        return Values.values(var192, var193, var194, var195);
    }
    
    public static SubLObject f14409(final SubLObject var128, final SubLObject var189) {
        final SubLThread var190 = SubLProcess.currentSubLThread();
        var190.resetMultipleValues();
        final SubLObject var191 = f14371(var128);
        final SubLObject var192 = var190.secondMultipleValue();
        var190.resetMultipleValues();
        SubLObject var193 = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject var194 = (SubLObject)module0217.NIL;
        SubLObject var195 = (SubLObject)module0217.NIL;
        SubLObject var196 = conses_high.assoc((SubLObject)module0217.ZERO_INTEGER, var191, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED).rest();
        if (module0217.NIL == module0173.f10955(var196)) {
            var196 = (SubLObject)module0217.NIL;
        }
        SubLObject var197 = var191;
        SubLObject var198 = (SubLObject)module0217.NIL;
        var198 = var197.first();
        while (module0217.NIL != var197) {
            SubLObject var200;
            final SubLObject var199 = var200 = var198;
            SubLObject var201 = (SubLObject)module0217.NIL;
            SubLObject var202 = (SubLObject)module0217.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var200, var199, (SubLObject)module0217.$ic147$);
            var201 = var200.first();
            var200 = (var202 = var200.rest());
            if (var193.numG(module0217.$g2386$.getDynamicValue(var190))) {
                if (var201.isPositive()) {
                    if (module0217.NIL != module0212.f13762(var202)) {
                        final SubLObject var203 = f14221(var202, var201, var196, (SubLObject)module0217.UNPROVIDED);
                        if (var203.numL(var193)) {
                            var194 = var202;
                            var193 = var203;
                            var195 = var201;
                        }
                    }
                }
                else if (module0217.NIL != var196) {
                    final SubLObject var203 = f14247(var196, (SubLObject)module0217.UNPROVIDED);
                    if (var203.numL(var193)) {
                        var194 = var202;
                        var193 = var203;
                        var195 = var201;
                    }
                }
            }
            if (module0217.NIL == module0147.f9509() && var193.numG(module0217.$g2386$.getDynamicValue(var190))) {
                if (var201.isPositive()) {
                    if (module0217.NIL != module0212.f13762(var202)) {
                        final SubLObject var203 = f14224(var202, var193, var201, var196);
                        if (var203.numL(var193)) {
                            var194 = var202;
                            var193 = var203;
                            var195 = var201;
                        }
                    }
                }
                else if (module0217.NIL != var196) {
                    final SubLObject var203 = f14250(var196, var193);
                    if (var203.numL(var193)) {
                        var194 = var202;
                        var193 = var203;
                        var195 = var201;
                    }
                }
            }
            var197 = var197.rest();
            var198 = var197.first();
        }
        return Values.values(var194, var195, var196, var193);
    }
    
    public static SubLObject f14410() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0035.sublisp_boolean(module0212.f13753());
        final SubLObject var12 = module0128.f8433();
        final SubLObject var13 = (SubLObject)module0217.$ic200$;
        final SubLObject var14 = module0173.f10962();
        SubLObject var15 = (SubLObject)module0217.ZERO_INTEGER;
        final SubLObject var16 = module0012.$g75$.currentBinding(var10);
        SubLObject var17 = module0012.$g76$.currentBinding(var10);
        SubLObject var18 = module0012.$g77$.currentBinding(var10);
        SubLObject var19 = module0012.$g78$.currentBinding(var10);
        try {
            module0012.$g75$.bind((SubLObject)module0217.ZERO_INTEGER, var10);
            module0012.$g76$.bind((SubLObject)module0217.NIL, var10);
            module0012.$g77$.bind((SubLObject)module0217.T, var10);
            module0012.$g78$.bind(Time.get_universal_time(), var10);
            module0012.f478(var13);
            SubLObject var20 = module0173.f10961();
            SubLObject var21 = (SubLObject)module0217.NIL;
            var21 = var20.first();
            while (module0217.NIL != var20) {
                final SubLObject var22 = var21;
                if (module0217.NIL == module0065.f4772(var22, (SubLObject)module0217.$ic201$)) {
                    final SubLObject var200_201 = var22;
                    if (module0217.NIL == module0065.f4775(var200_201, (SubLObject)module0217.$ic201$)) {
                        final SubLObject var23 = module0065.f4740(var200_201);
                        final SubLObject var24 = (SubLObject)module0217.NIL;
                        SubLObject var25;
                        SubLObject var26;
                        SubLObject var27;
                        SubLObject var28;
                        for (var25 = Sequences.length(var23), var26 = (SubLObject)module0217.NIL, var26 = (SubLObject)module0217.ZERO_INTEGER; var26.numL(var25); var26 = Numbers.add(var26, (SubLObject)module0217.ONE_INTEGER)) {
                            var27 = ((module0217.NIL != var24) ? Numbers.subtract(var25, var26, (SubLObject)module0217.ONE_INTEGER) : var26);
                            var28 = Vectors.aref(var23, var27);
                            if (module0217.NIL == module0065.f4749(var28) || module0217.NIL == module0065.f4773((SubLObject)module0217.$ic201$)) {
                                if (module0217.NIL != module0065.f4749(var28)) {
                                    var28 = (SubLObject)module0217.$ic201$;
                                }
                                var15 = Numbers.add(var15, (SubLObject)module0217.ONE_INTEGER);
                                module0012.note_percent_progress(var15, var14);
                                module0173.f10966(var28);
                            }
                        }
                    }
                    final SubLObject var207_208 = var22;
                    if (module0217.NIL == module0065.f4777(var207_208) || module0217.NIL == module0065.f4773((SubLObject)module0217.$ic201$)) {
                        final SubLObject var29 = module0065.f4738(var207_208);
                        SubLObject var30 = module0065.f4739(var207_208);
                        final SubLObject var31 = module0065.f4734(var207_208);
                        final SubLObject var32 = (SubLObject)((module0217.NIL != module0065.f4773((SubLObject)module0217.$ic201$)) ? module0217.NIL : module0217.$ic201$);
                        while (var30.numL(var31)) {
                            final SubLObject var33 = Hashtables.gethash_without_values(var30, var29, var32);
                            if (module0217.NIL == module0065.f4773((SubLObject)module0217.$ic201$) || module0217.NIL == module0065.f4749(var33)) {
                                var15 = Numbers.add(var15, (SubLObject)module0217.ONE_INTEGER);
                                module0012.note_percent_progress(var15, var14);
                                module0173.f10966(var33);
                            }
                            var30 = Numbers.add(var30, (SubLObject)module0217.ONE_INTEGER);
                        }
                    }
                }
                var20 = var20.rest();
                var21 = var20.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var19, var10);
            module0012.$g77$.rebind(var18, var10);
            module0012.$g76$.rebind(var17, var10);
            module0012.$g75$.rebind(var16, var10);
        }
        final SubLObject var34 = module0174.f11010();
        final SubLObject var35 = (SubLObject)module0217.$ic202$;
        final SubLObject var214_215 = module0065.f4733(var34);
        SubLObject var216_217 = (SubLObject)module0217.ZERO_INTEGER;
        assert module0217.NIL != Types.stringp(var35) : var35;
        final SubLObject var36 = module0012.$g75$.currentBinding(var10);
        final SubLObject var37 = module0012.$g76$.currentBinding(var10);
        final SubLObject var38 = module0012.$g77$.currentBinding(var10);
        final SubLObject var39 = module0012.$g78$.currentBinding(var10);
        try {
            module0012.$g75$.bind((SubLObject)module0217.ZERO_INTEGER, var10);
            module0012.$g76$.bind((SubLObject)module0217.NIL, var10);
            module0012.$g77$.bind((SubLObject)module0217.T, var10);
            module0012.$g78$.bind(Time.get_universal_time(), var10);
            module0012.f478(var35);
            final SubLObject var199_218 = var34;
            if (module0217.NIL == module0065.f4772(var199_218, (SubLObject)module0217.$ic201$)) {
                final SubLObject var200_202 = var199_218;
                if (module0217.NIL == module0065.f4775(var200_202, (SubLObject)module0217.$ic201$)) {
                    final SubLObject var40 = module0065.f4740(var200_202);
                    final SubLObject var41 = (SubLObject)module0217.NIL;
                    SubLObject var42;
                    SubLObject var43;
                    SubLObject var44;
                    SubLObject var45;
                    for (var42 = Sequences.length(var40), var43 = (SubLObject)module0217.NIL, var43 = (SubLObject)module0217.ZERO_INTEGER; var43.numL(var42); var43 = Numbers.add(var43, (SubLObject)module0217.ONE_INTEGER)) {
                        var44 = ((module0217.NIL != var41) ? Numbers.subtract(var42, var43, (SubLObject)module0217.ONE_INTEGER) : var43);
                        var45 = Vectors.aref(var40, var44);
                        if (module0217.NIL == module0065.f4749(var45) || module0217.NIL == module0065.f4773((SubLObject)module0217.$ic201$)) {
                            if (module0217.NIL != module0065.f4749(var45)) {
                                var45 = (SubLObject)module0217.$ic201$;
                            }
                            module0012.note_percent_progress(var216_217, var214_215);
                            var216_217 = Numbers.add(var216_217, (SubLObject)module0217.ONE_INTEGER);
                            module0177.f11245(var45);
                        }
                    }
                }
                final SubLObject var207_209 = var199_218;
                if (module0217.NIL == module0065.f4777(var207_209) || module0217.NIL == module0065.f4773((SubLObject)module0217.$ic201$)) {
                    final SubLObject var46 = module0065.f4738(var207_209);
                    SubLObject var47 = module0065.f4739(var207_209);
                    final SubLObject var48 = module0065.f4734(var207_209);
                    final SubLObject var49 = (SubLObject)((module0217.NIL != module0065.f4773((SubLObject)module0217.$ic201$)) ? module0217.NIL : module0217.$ic201$);
                    while (var47.numL(var48)) {
                        final SubLObject var50 = Hashtables.gethash_without_values(var47, var46, var49);
                        if (module0217.NIL == module0065.f4773((SubLObject)module0217.$ic201$) || module0217.NIL == module0065.f4749(var50)) {
                            module0012.note_percent_progress(var216_217, var214_215);
                            var216_217 = Numbers.add(var216_217, (SubLObject)module0217.ONE_INTEGER);
                            module0177.f11245(var50);
                        }
                        var47 = Numbers.add(var47, (SubLObject)module0217.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var39, var10);
            module0012.$g77$.rebind(var38, var10);
            module0012.$g76$.rebind(var37, var10);
            module0012.$g75$.rebind(var36, var10);
        }
        module0190.f11881();
        SubLObject var51 = module0223.f14665();
        SubLObject var52 = (SubLObject)module0217.NIL;
        var52 = var51.first();
        while (module0217.NIL != var51) {
            module0223.f14671(var52);
            var51 = var51.rest();
            var52 = var51.first();
        }
        if (module0217.NIL != var11 && var12.numG(module0217.$g2388$.getGlobalValue())) {
            Storage.gc_full();
        }
        final SubLObject var53 = Errors.$continue_cerrorP$.currentBinding(var10);
        try {
            Errors.$continue_cerrorP$.bind((SubLObject)module0217.T, var10);
            final SubLObject var54 = module0174.f11010();
            final SubLObject var55 = (SubLObject)module0217.$ic204$;
            final SubLObject var56 = module0065.f4733(var54);
            SubLObject var57 = (SubLObject)module0217.ZERO_INTEGER;
            assert module0217.NIL != Types.stringp(var55) : var55;
            final SubLObject var69_222 = module0012.$g75$.currentBinding(var10);
            var17 = module0012.$g76$.currentBinding(var10);
            var18 = module0012.$g77$.currentBinding(var10);
            var19 = module0012.$g78$.currentBinding(var10);
            try {
                module0012.$g75$.bind((SubLObject)module0217.ZERO_INTEGER, var10);
                module0012.$g76$.bind((SubLObject)module0217.NIL, var10);
                module0012.$g77$.bind((SubLObject)module0217.T, var10);
                module0012.$g78$.bind(Time.get_universal_time(), var10);
                module0012.f478(var55);
                final SubLObject var199_219 = var54;
                if (module0217.NIL == module0065.f4772(var199_219, (SubLObject)module0217.$ic201$)) {
                    final SubLObject var200_203 = var199_219;
                    if (module0217.NIL == module0065.f4775(var200_203, (SubLObject)module0217.$ic201$)) {
                        final SubLObject var58 = module0065.f4740(var200_203);
                        final SubLObject var59 = (SubLObject)module0217.NIL;
                        SubLObject var60;
                        SubLObject var61;
                        SubLObject var62;
                        SubLObject var63;
                        for (var60 = Sequences.length(var58), var61 = (SubLObject)module0217.NIL, var61 = (SubLObject)module0217.ZERO_INTEGER; var61.numL(var60); var61 = Numbers.add(var61, (SubLObject)module0217.ONE_INTEGER)) {
                            var62 = ((module0217.NIL != var59) ? Numbers.subtract(var60, var61, (SubLObject)module0217.ONE_INTEGER) : var61);
                            var63 = Vectors.aref(var58, var62);
                            if (module0217.NIL == module0065.f4749(var63) || module0217.NIL == module0065.f4773((SubLObject)module0217.$ic201$)) {
                                if (module0217.NIL != module0065.f4749(var63)) {
                                    var63 = (SubLObject)module0217.$ic201$;
                                }
                                module0012.note_percent_progress(var57, var56);
                                var57 = Numbers.add(var57, (SubLObject)module0217.ONE_INTEGER);
                                f14411(var63);
                            }
                        }
                    }
                    final SubLObject var207_210 = var199_219;
                    if (module0217.NIL == module0065.f4777(var207_210) || module0217.NIL == module0065.f4773((SubLObject)module0217.$ic201$)) {
                        final SubLObject var64 = module0065.f4738(var207_210);
                        SubLObject var65 = module0065.f4739(var207_210);
                        final SubLObject var66 = module0065.f4734(var207_210);
                        final SubLObject var67 = (SubLObject)((module0217.NIL != module0065.f4773((SubLObject)module0217.$ic201$)) ? module0217.NIL : module0217.$ic201$);
                        while (var65.numL(var66)) {
                            final SubLObject var68 = Hashtables.gethash_without_values(var65, var64, var67);
                            if (module0217.NIL == module0065.f4773((SubLObject)module0217.$ic201$) || module0217.NIL == module0065.f4749(var68)) {
                                module0012.note_percent_progress(var57, var56);
                                var57 = Numbers.add(var57, (SubLObject)module0217.ONE_INTEGER);
                                f14411(var68);
                            }
                            var65 = Numbers.add(var65, (SubLObject)module0217.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var19, var10);
                module0012.$g77$.rebind(var18, var10);
                module0012.$g76$.rebind(var17, var10);
                module0012.$g75$.rebind(var69_222, var10);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(var53, var10);
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14411(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)module0217.NIL;
        try {
            var25.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var27 = Errors.$error_handler$.currentBinding(var25);
            try {
                Errors.$error_handler$.bind((SubLObject)module0217.$ic205$, var25);
                try {
                    SubLObject var28 = (SubLObject)module0217.NIL;
                    try {
                        f14364(var24, (SubLObject)module0217.UNPROVIDED);
                        var28 = (SubLObject)module0217.T;
                    }
                    finally {
                        final SubLObject var69_228 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0217.T, var25);
                            if (module0217.NIL == var28) {
                                SubLObject var29 = (SubLObject)module0217.NIL;
                                try {
                                    var25.throwStack.push(module0217.$ic206$);
                                    final SubLObject var69_229 = Errors.$error_handler$.currentBinding(var25);
                                    try {
                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0217.$ic207$), var25);
                                        try {
                                            f14367(var24, (SubLObject)module0217.UNPROVIDED);
                                        }
                                        catch (Throwable var30) {
                                            Errors.handleThrowable(var30, (SubLObject)module0217.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(var69_229, var25);
                                    }
                                }
                                catch (Throwable var31) {
                                    var29 = Errors.handleThrowable(var31, (SubLObject)module0217.$ic206$);
                                }
                                finally {
                                    var25.throwStack.pop();
                                }
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var69_228, var25);
                        }
                    }
                }
                catch (Throwable var32) {
                    Errors.handleThrowable(var32, (SubLObject)module0217.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var27, var25);
            }
        }
        catch (Throwable var33) {
            var26 = Errors.handleThrowable(var33, module0003.$g3$.getGlobalValue());
        }
        finally {
            var25.throwStack.pop();
        }
        if (module0217.NIL != module0217.$g2389$.getDynamicValue(var25) && var26.isString()) {
            Errors.warn((SubLObject)module0217.$ic208$, var24, var26);
        }
        return var24;
    }
    
    public static SubLObject f14412(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = module0226.f15093(var1, (SubLObject)module0217.T);
        var3 = Sort.sort(var3, Symbols.symbol_function((SubLObject)module0217.$ic139$), Symbols.symbol_function((SubLObject)module0217.$ic209$));
        module0212.f13790(var1);
        final SubLObject var4 = Errors.$continue_cerrorP$.currentBinding(var2);
        try {
            Errors.$continue_cerrorP$.bind((SubLObject)module0217.T, var2);
            f14413(var3, var1);
        }
        finally {
            Errors.$continue_cerrorP$.rebind(var4, var2);
        }
        return Sequences.length(var3);
    }
    
    public static SubLObject f14413(final SubLObject var233, SubLObject var1) {
        if (var1 == module0217.UNPROVIDED) {
            var1 = (SubLObject)module0217.NIL;
        }
        SubLObject var234 = var233;
        SubLObject var235 = (SubLObject)module0217.NIL;
        var235 = var234.first();
        while (module0217.NIL != var234) {
            f14414(var235, var1);
            var234 = var234.rest();
            var235 = var234.first();
        }
        return var233;
    }
    
    public static SubLObject f14414(final SubLObject var60, SubLObject var1) {
        if (var1 == module0217.UNPROVIDED) {
            var1 = (SubLObject)module0217.NIL;
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        if (module0217.NIL != module0178.f11361(var60, (SubLObject)module0217.UNPROVIDED)) {
            final SubLObject var62 = Errors.$continue_cerrorP$.currentBinding(var61);
            try {
                Errors.$continue_cerrorP$.bind((SubLObject)module0217.T, var61);
                f14367(var60, var1);
                f14364(var60, var1);
            }
            finally {
                Errors.$continue_cerrorP$.rebind(var62, var61);
            }
        }
        return var60;
    }
    
    public static SubLObject f14415(final SubLObject var133, final SubLObject var11) {
        assert module0217.NIL != module0232.f15320(var133) : var133;
        assert module0217.NIL != module0161.f10480(var11) : var11;
        return module0175.f11064(var133, var11);
    }
    
    public static SubLObject f14416(final SubLObject var133, final SubLObject var11) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        SubLObject var135 = (SubLObject)module0217.NIL;
        final SubLObject var136 = module0147.$g2094$.currentBinding(var134);
        final SubLObject var137 = module0147.$g2095$.currentBinding(var134);
        try {
            module0147.$g2094$.bind((SubLObject)module0217.$ic217$, var134);
            module0147.$g2095$.bind(var11, var134);
            var135 = f14417(var133);
        }
        finally {
            module0147.$g2095$.rebind(var137, var134);
            module0147.$g2094$.rebind(var136, var134);
        }
        return var135;
    }
    
    public static SubLObject f14418(final SubLObject var133) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        assert module0217.NIL != module0232.f15320(var133) : var133;
        SubLObject var135 = (SubLObject)module0217.NIL;
        final SubLObject var136 = module0147.$g2094$.currentBinding(var134);
        final SubLObject var137 = module0147.$g2095$.currentBinding(var134);
        try {
            module0147.$g2094$.bind((SubLObject)module0217.$ic110$, var134);
            module0147.$g2095$.bind(module0217.$ic111$, var134);
            var135 = f14417(var133);
        }
        finally {
            module0147.$g2095$.rebind(var137, var134);
            module0147.$g2094$.rebind(var136, var134);
        }
        return var135;
    }
    
    public static SubLObject f14419(final SubLObject var133, final SubLObject var11) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        SubLObject var135 = (SubLObject)module0217.NIL;
        final SubLObject var136 = module0147.f9540(var11);
        final SubLObject var137 = module0147.$g2095$.currentBinding(var134);
        final SubLObject var138 = module0147.$g2094$.currentBinding(var134);
        final SubLObject var139 = module0147.$g2096$.currentBinding(var134);
        try {
            module0147.$g2095$.bind(module0147.f9545(var136), var134);
            module0147.$g2094$.bind(module0147.f9546(var136), var134);
            module0147.$g2096$.bind(module0147.f9549(var136), var134);
            var135 = f14417(var133);
        }
        finally {
            module0147.$g2096$.rebind(var139, var134);
            module0147.$g2094$.rebind(var138, var134);
            module0147.$g2095$.rebind(var137, var134);
        }
        return var135;
    }
    
    public static SubLObject f14420(final SubLObject var133) {
        assert module0217.NIL != module0232.f15320(var133) : var133;
        final SubLObject var134 = f14418(var133);
        if (module0217.NIL == var134) {
            return (SubLObject)module0217.NIL;
        }
        final SubLObject var135 = module0177.f11211(var134);
        if (module0217.NIL != var135) {
            return conses_high.copy_list(module0192.f12029(var135));
        }
        return (SubLObject)ConsesLow.list(var134);
    }
    
    public static SubLObject f14421(final SubLObject var237, final SubLObject var11) {
        final SubLThread var238 = SubLProcess.currentSubLThread();
        assert module0217.NIL != module0202.f12590(var237) : var237;
        assert module0217.NIL != module0161.f10481(var11) : var11;
        SubLObject var239 = (SubLObject)module0217.NIL;
        final SubLObject var240 = module0147.$g2094$.currentBinding(var238);
        final SubLObject var241 = module0147.$g2095$.currentBinding(var238);
        try {
            module0147.$g2094$.bind((SubLObject)module0217.$ic217$, var238);
            module0147.$g2095$.bind(var11, var238);
            var239 = f14422(var237);
        }
        finally {
            module0147.$g2095$.rebind(var241, var238);
            module0147.$g2094$.rebind(var240, var238);
        }
        return var239;
    }
    
    public static SubLObject f14423(final SubLObject var237) {
        final SubLThread var238 = SubLProcess.currentSubLThread();
        assert module0217.NIL != module0202.f12590(var237) : var237;
        SubLObject var239 = (SubLObject)module0217.NIL;
        final SubLObject var240 = module0147.$g2094$.currentBinding(var238);
        final SubLObject var241 = module0147.$g2095$.currentBinding(var238);
        try {
            module0147.$g2094$.bind((SubLObject)module0217.$ic110$, var238);
            module0147.$g2095$.bind(module0217.$ic111$, var238);
            var239 = f14422(var237);
        }
        finally {
            module0147.$g2095$.rebind(var241, var238);
            module0147.$g2094$.rebind(var240, var238);
        }
        return var239;
    }
    
    public static SubLObject f14424(final SubLObject var237, final SubLObject var11) {
        final SubLThread var238 = SubLProcess.currentSubLThread();
        SubLObject var239 = (SubLObject)module0217.NIL;
        final SubLObject var240 = module0147.$g2094$.currentBinding(var238);
        final SubLObject var241 = module0147.$g2095$.currentBinding(var238);
        try {
            module0147.$g2094$.bind((SubLObject)module0217.$ic235$, var238);
            module0147.$g2095$.bind(var11, var238);
            var239 = f14422(var237);
        }
        finally {
            module0147.$g2095$.rebind(var241, var238);
            module0147.$g2094$.rebind(var240, var238);
        }
        return var239;
    }
    
    public static SubLObject f14425(final SubLObject var237) {
        assert module0217.NIL != module0202.f12590(var237) : var237;
        final SubLObject var238 = f14423(var237);
        if (module0217.NIL == var238) {
            return (SubLObject)module0217.NIL;
        }
        final SubLObject var239 = module0177.f11211(var238);
        if (module0217.NIL != var239) {
            return conses_high.copy_list(module0192.f12029(var239));
        }
        return (SubLObject)ConsesLow.list(var238);
    }
    
    public static SubLObject f14426(final SubLObject var237) {
        return f14422(var237);
    }
    
    public static SubLObject f14427(final SubLObject var237, SubLObject var11) {
        if (var11 == module0217.UNPROVIDED) {
            var11 = (SubLObject)module0217.NIL;
        }
        final SubLThread var238 = SubLProcess.currentSubLThread();
        SubLObject var239 = (SubLObject)module0217.NIL;
        final SubLObject var240 = var11;
        final SubLObject var241 = module0147.$g2094$.currentBinding(var238);
        final SubLObject var242 = module0147.$g2095$.currentBinding(var238);
        try {
            module0147.$g2094$.bind(module0147.f9531(var240), var238);
            module0147.$g2095$.bind(module0147.f9534(var240), var238);
            var239 = f14426(var237);
        }
        finally {
            module0147.$g2095$.rebind(var242, var238);
            module0147.$g2094$.rebind(var241, var238);
        }
        return var239;
    }
    
    public static SubLObject f14428(final SubLObject var237) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0217.$ic124$), f14425(var237));
    }
    
    public static SubLObject f14429(final SubLObject var60) {
        final SubLObject var61 = module0177.f11211(var60);
        if (module0217.NIL != var61) {
            final SubLObject var62 = module0192.f12029(var61);
            return Sequences.remove(var60, var62, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14417(final SubLObject var133) {
        assert module0217.NIL != module0232.f15320(var133) : var133;
        if (module0217.NIL != module0232.f15322(var133)) {
            return f14430(var133);
        }
        return f14431(var133);
    }
    
    public static SubLObject f14430(final SubLObject var133) {
        return f14422(module0177.f11182(var133));
    }
    
    public static SubLObject f14431(final SubLObject var133) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        var134.resetMultipleValues();
        final SubLObject var135 = f14393(var133);
        final SubLObject var136 = var134.secondMultipleValue();
        var134.resetMultipleValues();
        return f14432(var133, var135, var136);
    }
    
    public static SubLObject f14433(final SubLObject var133, final SubLObject var239) {
        SubLObject var240 = (SubLObject)module0217.NIL;
        SubLObject var241 = (SubLObject)module0217.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var239, var239, (SubLObject)module0217.$ic238$);
        var240 = var239.first();
        SubLObject var242 = var239.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var242, var239, (SubLObject)module0217.$ic238$);
        var241 = var242.first();
        var242 = var242.rest();
        if (module0217.NIL == var242) {
            return f14432(var133, var240, var241);
        }
        cdestructuring_bind.cdestructuring_bind_error(var239, (SubLObject)module0217.$ic238$);
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14432(final SubLObject var133, final SubLObject var8, final SubLObject var1) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        SubLObject var135 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0212.f13762(var1)) {
            final SubLObject var136 = module0018.$g587$.currentBinding(var134);
            final SubLObject var137 = module0018.$g584$.currentBinding(var134);
            try {
                module0018.$g587$.bind(var133, var134);
                module0018.$g584$.bind((SubLObject)module0217.NIL, var134);
                SubLObject var138 = (SubLObject)module0217.NIL;
                try {
                    var134.throwStack.push(module0217.$ic239$);
                    if (var8.eql((SubLObject)module0217.$ic118$)) {
                        module0219.f14502(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
                    }
                    else if (var8.eql((SubLObject)module0217.$ic185$)) {
                        module0219.f14481(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                    }
                    else if (var8.eql((SubLObject)module0217.$ic179$)) {
                        module0219.f14481(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                    }
                    else if (var8.eql((SubLObject)module0217.$ic186$)) {
                        module0219.f14482(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED);
                    }
                    else if (var8.eql((SubLObject)module0217.$ic180$)) {
                        module0219.f14482(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED);
                    }
                    else if (var8.eql((SubLObject)module0217.$ic187$)) {
                        module0219.f14483(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                    }
                    else if (var8.eql((SubLObject)module0217.$ic181$)) {
                        module0219.f14483(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                    }
                    else if (var8.eql((SubLObject)module0217.$ic188$)) {
                        module0219.f14484(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                    }
                    else if (var8.eql((SubLObject)module0217.$ic182$)) {
                        module0219.f14484(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                    }
                    else if (var8.eql((SubLObject)module0217.$ic189$)) {
                        module0219.f14485(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                    }
                    else if (var8.eql((SubLObject)module0217.$ic183$)) {
                        module0219.f14485(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                    }
                    else if (var8.eql((SubLObject)module0217.$ic190$)) {
                        module0219.f14486(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.$ic127$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                    }
                    else if (var8.eql((SubLObject)module0217.$ic184$)) {
                        module0219.f14486(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.$ic126$, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                    }
                    else if (var8.eql((SubLObject)module0217.$ic156$)) {
                        module0219.f14487(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                    }
                    else if (var8.eql((SubLObject)module0217.$ic158$)) {
                        module0219.f14488(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                    }
                    else if (var8.eql((SubLObject)module0217.$ic160$)) {
                        module0219.f14489(Symbols.symbol_function((SubLObject)module0217.$ic240$), var1, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED);
                    }
                }
                catch (Throwable var139) {
                    var138 = Errors.handleThrowable(var139, (SubLObject)module0217.$ic239$);
                }
                finally {
                    var134.throwStack.pop();
                }
                var135 = module0018.$g584$.getDynamicValue(var134);
            }
            finally {
                module0018.$g584$.rebind(var137, var134);
                module0018.$g587$.rebind(var136, var134);
            }
        }
        return var135;
    }
    
    public static SubLObject f14434(final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        if (module0217.NIL != module0018.$g587$.getDynamicValue(var61) && module0217.NIL != module0178.f11361(var60, (SubLObject)module0217.UNPROVIDED)) {
            final SubLObject var62 = module0178.f11282(var60);
            final SubLObject var63 = module0018.$g581$.currentBinding(var61);
            try {
                module0018.$g581$.bind(var60, var61);
                if (module0217.NIL != Functions.funcall(module0018.$g578$.getDynamicValue(var61), var62, module0018.$g587$.getDynamicValue(var61))) {
                    module0018.$g584$.setDynamicValue(var60, var61);
                    module0012.f425();
                }
            }
            finally {
                module0018.$g581$.rebind(var63, var61);
            }
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14422(final SubLObject var237) {
        final SubLThread var238 = SubLProcess.currentSubLThread();
        SubLObject var239 = (SubLObject)module0217.NIL;
        final SubLObject var240 = f14404(var237, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
        final SubLObject var242;
        final SubLObject var241 = var242 = module0158.f10294(var240);
        if (var242.eql((SubLObject)module0217.$ic18$)) {
            var238.resetMultipleValues();
            final SubLObject var243 = module0158.f10297(var240);
            final SubLObject var244 = var238.secondMultipleValue();
            final SubLObject var245 = var238.thirdMultipleValue();
            var238.resetMultipleValues();
            if (module0217.NIL != var244) {
                if (module0217.NIL != var245) {
                    final SubLObject var246 = var245;
                    if (module0217.NIL != module0158.f10010(var243, var244, var246)) {
                        final SubLObject var247 = module0158.f10011(var243, var244, var246);
                        SubLObject var248 = var239;
                        final SubLObject var249 = (SubLObject)module0217.NIL;
                        while (module0217.NIL == var248) {
                            final SubLObject var250 = module0052.f3695(var247, var249);
                            final SubLObject var251 = (SubLObject)SubLObjectFactory.makeBoolean(!var249.eql(var250));
                            if (module0217.NIL != var251) {
                                SubLObject var252 = (SubLObject)module0217.NIL;
                                try {
                                    var252 = module0158.f10316(var250, (SubLObject)module0217.$ic241$, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
                                    SubLObject var250_255 = var239;
                                    final SubLObject var251_256 = (SubLObject)module0217.NIL;
                                    while (module0217.NIL == var250_255) {
                                        final SubLObject var253 = module0052.f3695(var252, var251_256);
                                        final SubLObject var253_257 = (SubLObject)SubLObjectFactory.makeBoolean(!var251_256.eql(var253));
                                        if (module0217.NIL != var253_257) {
                                            final SubLObject var254 = f14435(var253, var237);
                                            if (module0217.NIL != var254) {
                                                var239 = var254;
                                            }
                                        }
                                        var250_255 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var253_257 || module0217.NIL != var239);
                                    }
                                }
                                finally {
                                    final SubLObject var255 = Threads.$is_thread_performing_cleanupP$.currentBinding(var238);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0217.T, var238);
                                        if (module0217.NIL != var252) {
                                            module0158.f10319(var252);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var255, var238);
                                    }
                                }
                            }
                            var248 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var251 || module0217.NIL != var239);
                        }
                    }
                }
                else {
                    final SubLObject var246 = (SubLObject)module0217.NIL;
                    if (module0217.NIL != module0158.f10010(var243, var244, var246)) {
                        final SubLObject var247 = module0158.f10011(var243, var244, var246);
                        SubLObject var248 = var239;
                        final SubLObject var249 = (SubLObject)module0217.NIL;
                        while (module0217.NIL == var248) {
                            final SubLObject var250 = module0052.f3695(var247, var249);
                            final SubLObject var251 = (SubLObject)SubLObjectFactory.makeBoolean(!var249.eql(var250));
                            if (module0217.NIL != var251) {
                                SubLObject var252 = (SubLObject)module0217.NIL;
                                try {
                                    var252 = module0158.f10316(var250, (SubLObject)module0217.$ic241$, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
                                    SubLObject var250_256 = var239;
                                    final SubLObject var251_257 = (SubLObject)module0217.NIL;
                                    while (module0217.NIL == var250_256) {
                                        final SubLObject var253 = module0052.f3695(var252, var251_257);
                                        final SubLObject var253_258 = (SubLObject)SubLObjectFactory.makeBoolean(!var251_257.eql(var253));
                                        if (module0217.NIL != var253_258) {
                                            final SubLObject var254 = f14435(var253, var237);
                                            if (module0217.NIL != var254) {
                                                var239 = var254;
                                            }
                                        }
                                        var250_256 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var253_258 || module0217.NIL != var239);
                                    }
                                }
                                finally {
                                    final SubLObject var256 = Threads.$is_thread_performing_cleanupP$.currentBinding(var238);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0217.T, var238);
                                        if (module0217.NIL != var252) {
                                            module0158.f10319(var252);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var256, var238);
                                    }
                                }
                            }
                            var248 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var251 || module0217.NIL != var239);
                        }
                    }
                }
            }
            else if (module0217.NIL != var245) {
                final SubLObject var246 = var245;
                if (module0217.NIL != module0158.f10010(var243, (SubLObject)module0217.NIL, var246)) {
                    final SubLObject var247 = module0158.f10011(var243, (SubLObject)module0217.NIL, var246);
                    SubLObject var248 = var239;
                    final SubLObject var249 = (SubLObject)module0217.NIL;
                    while (module0217.NIL == var248) {
                        final SubLObject var250 = module0052.f3695(var247, var249);
                        final SubLObject var251 = (SubLObject)SubLObjectFactory.makeBoolean(!var249.eql(var250));
                        if (module0217.NIL != var251) {
                            SubLObject var252 = (SubLObject)module0217.NIL;
                            try {
                                var252 = module0158.f10316(var250, (SubLObject)module0217.$ic241$, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
                                SubLObject var250_257 = var239;
                                final SubLObject var251_258 = (SubLObject)module0217.NIL;
                                while (module0217.NIL == var250_257) {
                                    final SubLObject var253 = module0052.f3695(var252, var251_258);
                                    final SubLObject var253_259 = (SubLObject)SubLObjectFactory.makeBoolean(!var251_258.eql(var253));
                                    if (module0217.NIL != var253_259) {
                                        final SubLObject var254 = f14435(var253, var237);
                                        if (module0217.NIL != var254) {
                                            var239 = var254;
                                        }
                                    }
                                    var250_257 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var253_259 || module0217.NIL != var239);
                                }
                            }
                            finally {
                                final SubLObject var257 = Threads.$is_thread_performing_cleanupP$.currentBinding(var238);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0217.T, var238);
                                    if (module0217.NIL != var252) {
                                        module0158.f10319(var252);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var257, var238);
                                }
                            }
                        }
                        var248 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var251 || module0217.NIL != var239);
                    }
                }
            }
            else {
                final SubLObject var246 = (SubLObject)module0217.NIL;
                if (module0217.NIL != module0158.f10010(var243, (SubLObject)module0217.NIL, var246)) {
                    final SubLObject var247 = module0158.f10011(var243, (SubLObject)module0217.NIL, var246);
                    SubLObject var248 = var239;
                    final SubLObject var249 = (SubLObject)module0217.NIL;
                    while (module0217.NIL == var248) {
                        final SubLObject var250 = module0052.f3695(var247, var249);
                        final SubLObject var251 = (SubLObject)SubLObjectFactory.makeBoolean(!var249.eql(var250));
                        if (module0217.NIL != var251) {
                            SubLObject var252 = (SubLObject)module0217.NIL;
                            try {
                                var252 = module0158.f10316(var250, (SubLObject)module0217.$ic241$, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
                                SubLObject var250_258 = var239;
                                final SubLObject var251_259 = (SubLObject)module0217.NIL;
                                while (module0217.NIL == var250_258) {
                                    final SubLObject var253 = module0052.f3695(var252, var251_259);
                                    final SubLObject var253_260 = (SubLObject)SubLObjectFactory.makeBoolean(!var251_259.eql(var253));
                                    if (module0217.NIL != var253_260) {
                                        final SubLObject var254 = f14435(var253, var237);
                                        if (module0217.NIL != var254) {
                                            var239 = var254;
                                        }
                                    }
                                    var250_258 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var253_260 || module0217.NIL != var239);
                                }
                            }
                            finally {
                                final SubLObject var258 = Threads.$is_thread_performing_cleanupP$.currentBinding(var238);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0217.T, var238);
                                    if (module0217.NIL != var252) {
                                        module0158.f10319(var252);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var258, var238);
                                }
                            }
                        }
                        var248 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var251 || module0217.NIL != var239);
                    }
                }
            }
        }
        else if (var242.eql((SubLObject)module0217.$ic36$)) {
            final SubLObject var259 = module0158.f10299(var240);
            if (module0217.NIL != module0158.f10038(var259)) {
                final SubLObject var260 = (SubLObject)module0217.NIL;
                final SubLObject var261 = module0012.$g73$.currentBinding(var238);
                final SubLObject var262 = module0012.$g65$.currentBinding(var238);
                final SubLObject var263 = module0012.$g67$.currentBinding(var238);
                final SubLObject var264 = module0012.$g68$.currentBinding(var238);
                final SubLObject var265 = module0012.$g66$.currentBinding(var238);
                final SubLObject var266 = module0012.$g69$.currentBinding(var238);
                final SubLObject var267 = module0012.$g70$.currentBinding(var238);
                final SubLObject var268 = module0012.$silent_progressP$.currentBinding(var238);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var238);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var238), var238);
                    module0012.$g67$.bind((SubLObject)module0217.ONE_INTEGER, var238);
                    module0012.$g68$.bind((SubLObject)module0217.ZERO_INTEGER, var238);
                    module0012.$g66$.bind((SubLObject)module0217.ZERO_INTEGER, var238);
                    module0012.$g69$.bind((SubLObject)module0217.ZERO_INTEGER, var238);
                    module0012.$g70$.bind((SubLObject)module0217.T, var238);
                    module0012.$silent_progressP$.bind((SubLObject)((module0217.NIL != var260) ? module0012.$silent_progressP$.getDynamicValue(var238) : module0217.T), var238);
                    module0012.f474(var260);
                    final SubLObject var269 = module0158.f10039(var259);
                    SubLObject var270 = var239;
                    final SubLObject var271 = (SubLObject)module0217.NIL;
                    while (module0217.NIL == var270) {
                        final SubLObject var272 = module0052.f3695(var269, var271);
                        final SubLObject var273 = (SubLObject)SubLObjectFactory.makeBoolean(!var271.eql(var272));
                        if (module0217.NIL != var273) {
                            module0012.f476();
                            SubLObject var274 = (SubLObject)module0217.NIL;
                            try {
                                var274 = module0158.f10316(var272, (SubLObject)module0217.$ic241$, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
                                SubLObject var250_259 = var239;
                                final SubLObject var251_260 = (SubLObject)module0217.NIL;
                                while (module0217.NIL == var250_259) {
                                    final SubLObject var275 = module0052.f3695(var274, var251_260);
                                    final SubLObject var253_261 = (SubLObject)SubLObjectFactory.makeBoolean(!var251_260.eql(var275));
                                    if (module0217.NIL != var253_261) {
                                        final SubLObject var276 = f14435(var275, var237);
                                        if (module0217.NIL != var276) {
                                            var239 = var276;
                                        }
                                    }
                                    var250_259 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var253_261 || module0217.NIL != var239);
                                }
                            }
                            finally {
                                final SubLObject var69_273 = Threads.$is_thread_performing_cleanupP$.currentBinding(var238);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0217.T, var238);
                                    if (module0217.NIL != var274) {
                                        module0158.f10319(var274);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var69_273, var238);
                                }
                            }
                        }
                        var270 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var273 || module0217.NIL != var239);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var268, var238);
                    module0012.$g70$.rebind(var267, var238);
                    module0012.$g69$.rebind(var266, var238);
                    module0012.$g66$.rebind(var265, var238);
                    module0012.$g68$.rebind(var264, var238);
                    module0012.$g67$.rebind(var263, var238);
                    module0012.$g65$.rebind(var262, var238);
                    module0012.$g73$.rebind(var261, var238);
                }
            }
        }
        else if (var242.eql((SubLObject)module0217.$ic174$)) {
            SubLObject var277;
            SubLObject var278;
            SubLObject var279;
            for (var277 = (SubLObject)module0217.NIL, var277 = module0218.f14453(module0158.f10301(var240), (SubLObject)module0217.UNPROVIDED); module0217.NIL == var239 && module0217.NIL != var277; var277 = var277.rest()) {
                var278 = var277.first();
                var279 = f14435(var278, var237);
                if (module0217.NIL != var279) {
                    var239 = var279;
                }
            }
        }
        else {
            module0158.f10295(var240, var241);
        }
        return var239;
    }
    
    public static SubLObject f14435(final SubLObject var60, final SubLObject var274) {
        final SubLThread var275 = SubLProcess.currentSubLThread();
        SubLObject var276 = (SubLObject)module0217.NIL;
        if (module0217.NIL != var274 && module0217.NIL != module0178.f11361(var60, (SubLObject)module0217.UNPROVIDED) && module0217.NIL != module0178.f11284(var60)) {
            final SubLObject var277 = module0178.f11288(var60);
            final SubLObject var278 = module0018.$g581$.currentBinding(var275);
            try {
                module0018.$g581$.bind(var60, var275);
                if (module0217.NIL != Functions.funcall(module0018.$g579$.getDynamicValue(var275), var277, var274)) {
                    var276 = var60;
                }
            }
            finally {
                module0018.$g581$.rebind(var278, var275);
            }
        }
        return var276;
    }
    
    public static SubLObject f14436(final SubLObject var128, SubLObject var15) {
        if (var15 == module0217.UNPROVIDED) {
            var15 = (SubLObject)module0217.NIL;
        }
        final SubLThread var129 = SubLProcess.currentSubLThread();
        SubLObject var130 = (SubLObject)module0217.NIL;
        SubLObject var131 = (SubLObject)module0217.NIL;
        SubLObject var132 = (SubLObject)module0217.ZERO_INTEGER;
        final SubLObject var133 = f14404(var128, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
        final SubLObject var135;
        final SubLObject var134 = var135 = module0158.f10294(var133);
        if (var135.eql((SubLObject)module0217.$ic18$)) {
            var129.resetMultipleValues();
            final SubLObject var136 = module0158.f10297(var133);
            final SubLObject var137 = var129.secondMultipleValue();
            final SubLObject var138 = var129.thirdMultipleValue();
            var129.resetMultipleValues();
            if (module0217.NIL != var137) {
                if (module0217.NIL != var138) {
                    final SubLObject var139 = var138;
                    if (module0217.NIL != module0158.f10010(var136, var137, var139)) {
                        final SubLObject var140 = module0158.f10011(var136, var137, var139);
                        SubLObject var141 = var131;
                        final SubLObject var142 = (SubLObject)module0217.NIL;
                        while (module0217.NIL == var141) {
                            final SubLObject var143 = module0052.f3695(var140, var142);
                            final SubLObject var144 = (SubLObject)SubLObjectFactory.makeBoolean(!var142.eql(var143));
                            if (module0217.NIL != var144) {
                                SubLObject var145 = (SubLObject)module0217.NIL;
                                try {
                                    var145 = module0158.f10316(var143, (SubLObject)module0217.$ic241$, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
                                    SubLObject var250_276 = var131;
                                    final SubLObject var251_277 = (SubLObject)module0217.NIL;
                                    while (module0217.NIL == var250_276) {
                                        final SubLObject var146 = module0052.f3695(var145, var251_277);
                                        final SubLObject var253_278 = (SubLObject)SubLObjectFactory.makeBoolean(!var251_277.eql(var146));
                                        if (module0217.NIL != var253_278) {
                                            if (module0217.NIL != module0235.f15475(var128, module0178.f11285(var146), (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED)) {
                                                var130 = var146;
                                                var131 = (SubLObject)module0217.T;
                                            }
                                            else if (module0217.NIL != var15) {
                                                var132 = Numbers.add(var132, (SubLObject)module0217.ONE_INTEGER);
                                                if (var132.numGE(var15)) {
                                                    var130 = (SubLObject)module0217.$ic242$;
                                                    var131 = (SubLObject)module0217.T;
                                                }
                                            }
                                        }
                                        var250_276 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var253_278 || module0217.NIL != var131);
                                    }
                                }
                                finally {
                                    final SubLObject var147 = Threads.$is_thread_performing_cleanupP$.currentBinding(var129);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0217.T, var129);
                                        if (module0217.NIL != var145) {
                                            module0158.f10319(var145);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var147, var129);
                                    }
                                }
                            }
                            var141 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var144 || module0217.NIL != var131);
                        }
                    }
                }
                else {
                    final SubLObject var139 = (SubLObject)module0217.NIL;
                    if (module0217.NIL != module0158.f10010(var136, var137, var139)) {
                        final SubLObject var140 = module0158.f10011(var136, var137, var139);
                        SubLObject var141 = var131;
                        final SubLObject var142 = (SubLObject)module0217.NIL;
                        while (module0217.NIL == var141) {
                            final SubLObject var143 = module0052.f3695(var140, var142);
                            final SubLObject var144 = (SubLObject)SubLObjectFactory.makeBoolean(!var142.eql(var143));
                            if (module0217.NIL != var144) {
                                SubLObject var145 = (SubLObject)module0217.NIL;
                                try {
                                    var145 = module0158.f10316(var143, (SubLObject)module0217.$ic241$, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
                                    SubLObject var250_277 = var131;
                                    final SubLObject var251_278 = (SubLObject)module0217.NIL;
                                    while (module0217.NIL == var250_277) {
                                        final SubLObject var146 = module0052.f3695(var145, var251_278);
                                        final SubLObject var253_279 = (SubLObject)SubLObjectFactory.makeBoolean(!var251_278.eql(var146));
                                        if (module0217.NIL != var253_279) {
                                            if (module0217.NIL != module0235.f15475(var128, module0178.f11285(var146), (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED)) {
                                                var130 = var146;
                                                var131 = (SubLObject)module0217.T;
                                            }
                                            else if (module0217.NIL != var15) {
                                                var132 = Numbers.add(var132, (SubLObject)module0217.ONE_INTEGER);
                                                if (var132.numGE(var15)) {
                                                    var130 = (SubLObject)module0217.$ic242$;
                                                    var131 = (SubLObject)module0217.T;
                                                }
                                            }
                                        }
                                        var250_277 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var253_279 || module0217.NIL != var131);
                                    }
                                }
                                finally {
                                    final SubLObject var148 = Threads.$is_thread_performing_cleanupP$.currentBinding(var129);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0217.T, var129);
                                        if (module0217.NIL != var145) {
                                            module0158.f10319(var145);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var148, var129);
                                    }
                                }
                            }
                            var141 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var144 || module0217.NIL != var131);
                        }
                    }
                }
            }
            else if (module0217.NIL != var138) {
                final SubLObject var139 = var138;
                if (module0217.NIL != module0158.f10010(var136, (SubLObject)module0217.NIL, var139)) {
                    final SubLObject var140 = module0158.f10011(var136, (SubLObject)module0217.NIL, var139);
                    SubLObject var141 = var131;
                    final SubLObject var142 = (SubLObject)module0217.NIL;
                    while (module0217.NIL == var141) {
                        final SubLObject var143 = module0052.f3695(var140, var142);
                        final SubLObject var144 = (SubLObject)SubLObjectFactory.makeBoolean(!var142.eql(var143));
                        if (module0217.NIL != var144) {
                            SubLObject var145 = (SubLObject)module0217.NIL;
                            try {
                                var145 = module0158.f10316(var143, (SubLObject)module0217.$ic241$, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
                                SubLObject var250_278 = var131;
                                final SubLObject var251_279 = (SubLObject)module0217.NIL;
                                while (module0217.NIL == var250_278) {
                                    final SubLObject var146 = module0052.f3695(var145, var251_279);
                                    final SubLObject var253_280 = (SubLObject)SubLObjectFactory.makeBoolean(!var251_279.eql(var146));
                                    if (module0217.NIL != var253_280) {
                                        if (module0217.NIL != module0235.f15475(var128, module0178.f11285(var146), (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED)) {
                                            var130 = var146;
                                            var131 = (SubLObject)module0217.T;
                                        }
                                        else if (module0217.NIL != var15) {
                                            var132 = Numbers.add(var132, (SubLObject)module0217.ONE_INTEGER);
                                            if (var132.numGE(var15)) {
                                                var130 = (SubLObject)module0217.$ic242$;
                                                var131 = (SubLObject)module0217.T;
                                            }
                                        }
                                    }
                                    var250_278 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var253_280 || module0217.NIL != var131);
                                }
                            }
                            finally {
                                final SubLObject var149 = Threads.$is_thread_performing_cleanupP$.currentBinding(var129);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0217.T, var129);
                                    if (module0217.NIL != var145) {
                                        module0158.f10319(var145);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var149, var129);
                                }
                            }
                        }
                        var141 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var144 || module0217.NIL != var131);
                    }
                }
            }
            else {
                final SubLObject var139 = (SubLObject)module0217.NIL;
                if (module0217.NIL != module0158.f10010(var136, (SubLObject)module0217.NIL, var139)) {
                    final SubLObject var140 = module0158.f10011(var136, (SubLObject)module0217.NIL, var139);
                    SubLObject var141 = var131;
                    final SubLObject var142 = (SubLObject)module0217.NIL;
                    while (module0217.NIL == var141) {
                        final SubLObject var143 = module0052.f3695(var140, var142);
                        final SubLObject var144 = (SubLObject)SubLObjectFactory.makeBoolean(!var142.eql(var143));
                        if (module0217.NIL != var144) {
                            SubLObject var145 = (SubLObject)module0217.NIL;
                            try {
                                var145 = module0158.f10316(var143, (SubLObject)module0217.$ic241$, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
                                SubLObject var250_279 = var131;
                                final SubLObject var251_280 = (SubLObject)module0217.NIL;
                                while (module0217.NIL == var250_279) {
                                    final SubLObject var146 = module0052.f3695(var145, var251_280);
                                    final SubLObject var253_281 = (SubLObject)SubLObjectFactory.makeBoolean(!var251_280.eql(var146));
                                    if (module0217.NIL != var253_281) {
                                        if (module0217.NIL != module0235.f15475(var128, module0178.f11285(var146), (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED)) {
                                            var130 = var146;
                                            var131 = (SubLObject)module0217.T;
                                        }
                                        else if (module0217.NIL != var15) {
                                            var132 = Numbers.add(var132, (SubLObject)module0217.ONE_INTEGER);
                                            if (var132.numGE(var15)) {
                                                var130 = (SubLObject)module0217.$ic242$;
                                                var131 = (SubLObject)module0217.T;
                                            }
                                        }
                                    }
                                    var250_279 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var253_281 || module0217.NIL != var131);
                                }
                            }
                            finally {
                                final SubLObject var150 = Threads.$is_thread_performing_cleanupP$.currentBinding(var129);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0217.T, var129);
                                    if (module0217.NIL != var145) {
                                        module0158.f10319(var145);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var150, var129);
                                }
                            }
                        }
                        var141 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var144 || module0217.NIL != var131);
                    }
                }
            }
        }
        else if (var135.eql((SubLObject)module0217.$ic36$)) {
            final SubLObject var151 = module0158.f10299(var133);
            if (module0217.NIL != module0158.f10038(var151)) {
                final SubLObject var152 = (SubLObject)module0217.NIL;
                final SubLObject var153 = module0012.$g73$.currentBinding(var129);
                final SubLObject var154 = module0012.$g65$.currentBinding(var129);
                final SubLObject var155 = module0012.$g67$.currentBinding(var129);
                final SubLObject var156 = module0012.$g68$.currentBinding(var129);
                final SubLObject var157 = module0012.$g66$.currentBinding(var129);
                final SubLObject var158 = module0012.$g69$.currentBinding(var129);
                final SubLObject var159 = module0012.$g70$.currentBinding(var129);
                final SubLObject var160 = module0012.$silent_progressP$.currentBinding(var129);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var129);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var129), var129);
                    module0012.$g67$.bind((SubLObject)module0217.ONE_INTEGER, var129);
                    module0012.$g68$.bind((SubLObject)module0217.ZERO_INTEGER, var129);
                    module0012.$g66$.bind((SubLObject)module0217.ZERO_INTEGER, var129);
                    module0012.$g69$.bind((SubLObject)module0217.ZERO_INTEGER, var129);
                    module0012.$g70$.bind((SubLObject)module0217.T, var129);
                    module0012.$silent_progressP$.bind((SubLObject)((module0217.NIL != var152) ? module0012.$silent_progressP$.getDynamicValue(var129) : module0217.T), var129);
                    module0012.f474(var152);
                    final SubLObject var161 = module0158.f10039(var151);
                    SubLObject var162 = var131;
                    final SubLObject var163 = (SubLObject)module0217.NIL;
                    while (module0217.NIL == var162) {
                        final SubLObject var164 = module0052.f3695(var161, var163);
                        final SubLObject var165 = (SubLObject)SubLObjectFactory.makeBoolean(!var163.eql(var164));
                        if (module0217.NIL != var165) {
                            module0012.f476();
                            SubLObject var166 = (SubLObject)module0217.NIL;
                            try {
                                var166 = module0158.f10316(var164, (SubLObject)module0217.$ic241$, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
                                SubLObject var250_280 = var131;
                                final SubLObject var251_281 = (SubLObject)module0217.NIL;
                                while (module0217.NIL == var250_280) {
                                    final SubLObject var167 = module0052.f3695(var166, var251_281);
                                    final SubLObject var253_282 = (SubLObject)SubLObjectFactory.makeBoolean(!var251_281.eql(var167));
                                    if (module0217.NIL != var253_282) {
                                        if (module0217.NIL != module0235.f15475(var128, module0178.f11285(var167), (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED)) {
                                            var130 = var167;
                                            var131 = (SubLObject)module0217.T;
                                        }
                                        else if (module0217.NIL != var15) {
                                            var132 = Numbers.add(var132, (SubLObject)module0217.ONE_INTEGER);
                                            if (var132.numGE(var15)) {
                                                var130 = (SubLObject)module0217.$ic242$;
                                                var131 = (SubLObject)module0217.T;
                                            }
                                        }
                                    }
                                    var250_280 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var253_282 || module0217.NIL != var131);
                                }
                            }
                            finally {
                                final SubLObject var69_291 = Threads.$is_thread_performing_cleanupP$.currentBinding(var129);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0217.T, var129);
                                    if (module0217.NIL != var166) {
                                        module0158.f10319(var166);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var69_291, var129);
                                }
                            }
                        }
                        var162 = (SubLObject)SubLObjectFactory.makeBoolean(module0217.NIL == var165 || module0217.NIL != var131);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var160, var129);
                    module0012.$g70$.rebind(var159, var129);
                    module0012.$g69$.rebind(var158, var129);
                    module0012.$g66$.rebind(var157, var129);
                    module0012.$g68$.rebind(var156, var129);
                    module0012.$g67$.rebind(var155, var129);
                    module0012.$g65$.rebind(var154, var129);
                    module0012.$g73$.rebind(var153, var129);
                }
            }
        }
        else if (var135.eql((SubLObject)module0217.$ic174$)) {
            SubLObject var168;
            SubLObject var169;
            for (var168 = (SubLObject)module0217.NIL, var168 = module0218.f14453(module0158.f10301(var133), (SubLObject)module0217.UNPROVIDED); module0217.NIL == var131 && module0217.NIL != var168; var168 = var168.rest()) {
                var169 = var168.first();
                if (module0217.NIL != module0235.f15475(var128, module0178.f11285(var169), (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED)) {
                    var130 = var169;
                    var131 = (SubLObject)module0217.T;
                }
                else if (module0217.NIL != var15) {
                    var132 = Numbers.add(var132, (SubLObject)module0217.ONE_INTEGER);
                    if (var132.numGE(var15)) {
                        var130 = (SubLObject)module0217.$ic242$;
                        var131 = (SubLObject)module0217.T;
                    }
                }
            }
        }
        else {
            module0158.f10295(var133, var134);
        }
        return var130;
    }
    
    public static SubLObject f14437(final SubLObject var128, SubLObject var15) {
        if (var15 == module0217.UNPROVIDED) {
            var15 = (SubLObject)module0217.NIL;
        }
        final SubLThread var129 = SubLProcess.currentSubLThread();
        final SubLObject var130 = module0147.$g2094$.currentBinding(var129);
        final SubLObject var131 = module0147.$g2095$.currentBinding(var129);
        try {
            module0147.$g2094$.bind((SubLObject)module0217.$ic110$, var129);
            module0147.$g2095$.bind(module0217.$ic111$, var129);
            return f14436(var128, var15);
        }
        finally {
            module0147.$g2095$.rebind(var131, var129);
            module0147.$g2094$.rebind(var130, var129);
        }
    }
    
    public static SubLObject f14438(final SubLObject var133) {
        assert module0217.NIL != module0232.f15320(var133) : var133;
        final SubLObject var134 = f14418(var133);
        if (module0217.NIL != var134) {
            final SubLObject var135 = module0177.f11211(var134);
            if (module0217.NIL != var135) {
                return var135;
            }
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14439(final SubLObject var1) {
        assert module0217.NIL != module0173.f10955(var1) : var1;
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0217.$ic244$), f14440(var1));
    }
    
    public static SubLObject f14440(final SubLObject var1) {
        assert module0217.NIL != module0173.f10955(var1) : var1;
        SubLObject var2 = (SubLObject)module0217.NIL;
        if (module0217.NIL != module0269.f17705(var1)) {
            var2 = ConsesLow.append(f14441(var1), f14442(var1), f14443(var1));
        }
        else if (module0217.NIL != module0269.f17706(var1)) {
            var2 = ConsesLow.append(f14444(var1), f14443(var1));
        }
        else {
            var2 = f14443(var1);
        }
        return var2;
    }
    
    public static SubLObject f14444(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0217.NIL;
        SubLObject var23 = (SubLObject)module0217.$ic246$;
        SubLObject var24 = (SubLObject)module0217.NIL;
        var24 = var23.first();
        while (module0217.NIL != var23) {
            if (f14264(var20, var24, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED).numG((SubLObject)module0217.ZERO_INTEGER)) {
                SubLObject var4_294;
                final SubLObject var25 = var4_294 = f14268(var20, var24, (SubLObject)module0217.UNPROVIDED);
                SubLObject var26 = (SubLObject)module0217.NIL;
                var26 = var4_294.first();
                while (module0217.NIL != var4_294) {
                    SubLObject var4_295;
                    final SubLObject var27 = var4_295 = f14268(var20, var24, var26);
                    SubLObject var28 = (SubLObject)module0217.NIL;
                    var28 = var4_295.first();
                    while (module0217.NIL != var4_295) {
                        final SubLObject var29 = module0217.$g2390$.currentBinding(var21);
                        try {
                            module0217.$g2390$.bind((SubLObject)module0217.NIL, var21);
                            module0219.f14481(Symbols.symbol_function((SubLObject)module0217.$ic245$), var20, var24, var28, var26);
                            var22 = ConsesLow.append(var22, module0217.$g2390$.getDynamicValue(var21));
                        }
                        finally {
                            module0217.$g2390$.rebind(var29, var21);
                        }
                        var4_295 = var4_295.rest();
                        var28 = var4_295.first();
                    }
                    var4_294 = var4_294.rest();
                    var26 = var4_294.first();
                }
            }
            var23 = var23.rest();
            var24 = var23.first();
        }
        return var22;
    }
    
    public static SubLObject f14445(final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        assert module0217.NIL != module0174.f11035(var60) : var60;
        if (module0205.f13132(var60).eql(module0217.$ic247$)) {
            module0217.$g2390$.setDynamicValue((SubLObject)ConsesLow.cons(var60, module0217.$g2390$.getDynamicValue(var61)), var61);
        }
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14441(final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        SubLObject var68 = (SubLObject)module0217.NIL;
        SubLObject var69 = (SubLObject)module0217.$ic246$;
        SubLObject var70 = (SubLObject)module0217.NIL;
        var70 = var69.first();
        while (module0217.NIL != var69) {
            if (f14277(var66, var70, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED).numG((SubLObject)module0217.ZERO_INTEGER)) {
                SubLObject var4_297;
                final SubLObject var71 = var4_297 = f14281(var66, var70, (SubLObject)module0217.UNPROVIDED);
                SubLObject var72 = (SubLObject)module0217.NIL;
                var72 = var4_297.first();
                while (module0217.NIL != var4_297) {
                    SubLObject var4_298;
                    final SubLObject var73 = var4_298 = f14281(var66, var70, var72);
                    SubLObject var74 = (SubLObject)module0217.NIL;
                    var74 = var4_298.first();
                    while (module0217.NIL != var4_298) {
                        final SubLObject var75 = module0217.$g2390$.currentBinding(var67);
                        try {
                            module0217.$g2390$.bind((SubLObject)module0217.NIL, var67);
                            module0219.f14483(Symbols.symbol_function((SubLObject)module0217.$ic245$), var66, var70, var74, var72);
                            var68 = ConsesLow.append(var68, module0217.$g2390$.getDynamicValue(var67));
                        }
                        finally {
                            module0217.$g2390$.rebind(var75, var67);
                        }
                        var4_298 = var4_298.rest();
                        var74 = var4_298.first();
                    }
                    var4_297 = var4_297.rest();
                    var72 = var4_297.first();
                }
            }
            var69 = var69.rest();
            var70 = var69.first();
        }
        return var68;
    }
    
    public static SubLObject f14442(final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        SubLObject var68 = (SubLObject)module0217.NIL;
        SubLObject var69 = (SubLObject)module0217.$ic246$;
        SubLObject var70 = (SubLObject)module0217.NIL;
        var70 = var69.first();
        while (module0217.NIL != var69) {
            if (f14293(var66, var70, (SubLObject)module0217.UNPROVIDED, (SubLObject)module0217.UNPROVIDED).numG((SubLObject)module0217.ZERO_INTEGER)) {
                SubLObject var4_299;
                final SubLObject var71 = var4_299 = f14297(var66, var70, (SubLObject)module0217.UNPROVIDED);
                SubLObject var72 = (SubLObject)module0217.NIL;
                var72 = var4_299.first();
                while (module0217.NIL != var4_299) {
                    SubLObject var4_300;
                    final SubLObject var73 = var4_300 = f14297(var66, var70, var72);
                    SubLObject var74 = (SubLObject)module0217.NIL;
                    var74 = var4_300.first();
                    while (module0217.NIL != var4_300) {
                        final SubLObject var75 = module0217.$g2390$.currentBinding(var67);
                        try {
                            module0217.$g2390$.bind((SubLObject)module0217.NIL, var67);
                            module0219.f14485(Symbols.symbol_function((SubLObject)module0217.$ic245$), var66, var70, var74, var72);
                            var68 = ConsesLow.append(var68, module0217.$g2390$.getDynamicValue(var67));
                        }
                        finally {
                            module0217.$g2390$.rebind(var75, var67);
                        }
                        var4_300 = var4_300.rest();
                        var74 = var4_300.first();
                    }
                    var4_299 = var4_299.rest();
                    var72 = var4_299.first();
                }
            }
            var69 = var69.rest();
            var70 = var69.first();
        }
        return var68;
    }
    
    public static SubLObject f14443(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0217.NIL;
        final SubLObject var4 = module0217.$g2390$.currentBinding(var2);
        try {
            module0217.$g2390$.bind((SubLObject)module0217.NIL, var2);
            final SubLObject var69_301 = module0147.$g2094$.currentBinding(var2);
            final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
            try {
                module0147.$g2094$.bind((SubLObject)module0217.$ic110$, var2);
                module0147.$g2095$.bind(module0217.$ic111$, var2);
                module0219.f14502(Symbols.symbol_function((SubLObject)module0217.$ic245$), var1, (SubLObject)module0217.NIL, (SubLObject)module0217.NIL);
            }
            finally {
                module0147.$g2095$.rebind(var5, var2);
                module0147.$g2094$.rebind(var69_301, var2);
            }
            var3 = module0217.$g2390$.getDynamicValue(var2);
        }
        finally {
            module0217.$g2390$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f14446() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14213", "S#12742", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14214", "S#17162", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14216", "S#17163", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14217", "S#17137", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14218", "S#17136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14219", "S#17138", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14220", "S#17140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14215", "S#17164", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14221", "NUM-GAF-ARG-INDEX", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14223", "RELEVANT-NUM-GAF-ARG-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14224", "S#17037", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14225", "S#17141", 0, 0, false);
        new $f14225$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14226", "S#17165", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14227", "S#17166", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14229", "S#12719", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14228", "KEY-GAF-ARG-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14230", "S#17167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14231", "S#17168", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14233", "S#17169", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14232", "S#17038", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14234", "S#17170", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14235", "S#12718", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14222", "S#17039", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14236", "S#17171", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14237", "S#17172", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14238", "NUM-NART-ARG-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14240", "RELEVANT-NUM-NART-ARG-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14241", "S#17040", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14242", "KEY-NART-ARG-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14243", "S#17041", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14244", "S#17173", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14239", "S#17042", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14245", "S#17174", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14246", "S#17175", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14247", "NUM-PREDICATE-EXTENT-INDEX", 1, 1, false);
        new $f14247$UnaryFunction();
        new $f14247$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14249", "RELEVANT-NUM-PREDICATE-EXTENT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14250", "S#17043", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14251", "S#17176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14252", "KEY-PREDICATE-EXTENT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14253", "S#17044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14254", "S#17177", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14255", "S#17178", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14256", "S#17179", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14248", "S#17045", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14257", "NUM-FUNCTION-EXTENT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14259", "RELEVANT-NUM-FUNCTION-EXTENT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14260", "S#17046", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14258", "S#17047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14262", "S#17180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14263", "S#17181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14261", "S#17182", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14264", "NUM-PREDICATE-RULE-INDEX", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14266", "S#17048", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14267", "S#17049", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14268", "KEY-PREDICATE-RULE-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14269", "S#17050", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14265", "S#17051", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14270", "S#17183", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14271", "S#17184", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14272", "NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14274", "KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14273", "S#17055", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14275", "S#17185", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14276", "S#17186", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14277", "NUM-ISA-RULE-INDEX", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14279", "S#17056", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14280", "S#17057", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14281", "KEY-ISA-RULE-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14282", "S#17058", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14278", "S#17059", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14283", "S#17187", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14284", "S#17188", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14285", "NUM-QUOTED-ISA-RULE-INDEX", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14287", "S#17060", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14288", "S#17061", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14289", "KEY-QUOTED-ISA-RULE-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14290", "S#17062", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14286", "S#17063", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14291", "S#17189", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14292", "S#17190", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14293", "NUM-GENLS-RULE-INDEX", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14295", "S#17064", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14296", "S#17065", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14297", "KEY-GENLS-RULE-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14298", "S#17066", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14294", "S#17067", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14299", "S#17191", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14300", "S#17192", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14301", "NUM-GENL-MT-RULE-INDEX", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14303", "S#17068", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14304", "S#17069", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14305", "KEY-GENL-MT-RULE-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14306", "S#17070", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14302", "S#17071", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14307", "S#17193", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14308", "S#17194", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14309", "NUM-FUNCTION-RULE-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14311", "S#17072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14312", "S#17073", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14313", "KEY-FUNCTION-RULE-INDEX", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14314", "S#17074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14310", "S#17075", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14316", "S#17195", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14317", "S#17196", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14315", "S#17197", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14318", "NUM-EXCEPTION-RULE-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14320", "S#17076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14321", "S#17077", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14322", "KEY-EXCEPTION-RULE-INDEX", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14323", "S#17078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14324", "S#17198", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14319", "S#17079", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14325", "S#17199", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14326", "S#17200", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14327", "NUM-PRAGMA-RULE-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14329", "S#17080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14330", "S#17081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14331", "KEY-PRAGMA-RULE-INDEX", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14332", "S#17082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14333", "S#17201", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14328", "S#17083", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14334", "S#17202", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14335", "S#17203", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14336", "NUM-MT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14338", "S#17084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14339", "S#17085", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14337", "S#17086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14341", "S#17204", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14344", "S#17205", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14343", "S#17206", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14345", "S#17207", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14340", "S#17208", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14346", "NUM-HLMT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14347", "S#17209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14342", "S#12735", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14348", "S#17210", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14349", "S#17211", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14350", "NUM-OTHER-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14352", "S#17087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14353", "S#17088", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14351", "S#17089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14355", "S#17212", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14356", "S#17213", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14354", "S#17214", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14357", "NUM-INDEX", 1, 0, false);
        new $f14357$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14358", "S#17215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14359", "S#17216", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14360", "S#17217", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14361", "S#17218", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14362", "S#17219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14363", "S#17220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14364", "S#13961", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14367", "S#13960", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14370", "REMOVE-TERM-INDICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14371", "S#17221", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14372", "S#17222", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14373", "S#17223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14365", "S#17224", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14368", "S#17225", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14376", "S#17226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14374", "S#17227", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14375", "S#17228", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14377", "S#17229", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14378", "S#17230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14366", "S#17231", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14369", "S#17232", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14379", "S#13105", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14384", "S#17233", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14381", "S#17234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14385", "S#17235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14386", "S#17236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14389", "S#17237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14390", "S#17238", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14391", "S#17239", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14392", "S#17240", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14393", "S#17241", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14394", "S#17242", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14395", "S#17243", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14396", "S#12739", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14397", "S#17244", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14398", "S#17245", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14399", "S#17246", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14400", "S#17247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14401", "S#17248", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14383", "S#17249", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14402", "S#17250", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14387", "S#17251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14403", "S#17252", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14388", "S#17253", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14380", "S#17254", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14382", "S#17255", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14404", "S#13102", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14406", "NUM-BEST-GAF-LOOKUP-INDEX", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14405", "S#17256", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14407", "S#17257", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14408", "S#17258", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14409", "S#17259", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14410", "S#17260", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14411", "S#17261", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14412", "S#17262", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14413", "S#17263", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14414", "S#17264", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14415", "FIND-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14416", "S#13862", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14418", "FIND-ASSERTION-ANY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14419", "S#17265", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14420", "FIND-ALL-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14421", "FIND-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14423", "FIND-GAF-ANY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14424", "S#17266", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14425", "FIND-ALL-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14426", "S#17267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14427", "S#17268", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14428", "S#17269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14429", "S#17270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14417", "S#17271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14430", "S#17272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14431", "S#17273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14433", "S#17274", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14432", "S#17275", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14434", "S#17276", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14422", "S#17277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14435", "S#17278", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14436", "S#17279", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14437", "S#17280", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14438", "S#17281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14439", "S#17282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14440", "S#17283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14444", "S#17284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14445", "S#17285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14441", "S#17286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14442", "S#17287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0217", "f14443", "S#17288", 1, 0, false);
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14447() {
        module0217.$g2386$ = SubLFiles.defparameter("S#17289", (SubLObject)module0217.THREE_INTEGER);
        module0217.$g2387$ = SubLFiles.deflexical("S#17290", (SubLObject)module0217.NIL);
        module0217.$g2388$ = SubLFiles.deflexical("S#17291", (SubLObject)module0217.$ic199$);
        module0217.$g2389$ = SubLFiles.defparameter("S#17292", (SubLObject)module0217.NIL);
        module0217.$g2390$ = SubLFiles.defparameter("S#17293", (SubLObject)module0217.NIL);
        return (SubLObject)module0217.NIL;
    }
    
    public static SubLObject f14448() {
        module0012.f368((SubLObject)module0217.$ic2$, (SubLObject)module0217.$ic3$, (SubLObject)module0217.$ic4$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic7$, (SubLObject)module0217.$ic8$, (SubLObject)module0217.$ic9$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0034.f1909((SubLObject)module0217.$ic11$);
        module0012.f368((SubLObject)module0217.$ic6$, (SubLObject)module0217.$ic8$, (SubLObject)module0217.$ic16$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic17$);
        module0012.f368((SubLObject)module0217.$ic19$, (SubLObject)module0217.$ic20$, (SubLObject)module0217.$ic21$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic22$, (SubLObject)module0217.$ic20$, (SubLObject)module0217.$ic23$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic24$, (SubLObject)module0217.$ic20$, (SubLObject)module0217.$ic25$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic17$);
        module0012.f368((SubLObject)module0217.$ic27$, (SubLObject)module0217.$ic28$, (SubLObject)module0217.$ic29$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic31$, (SubLObject)module0217.$ic32$, (SubLObject)module0217.$ic33$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic30$, (SubLObject)module0217.$ic32$, (SubLObject)module0217.$ic35$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic17$);
        module0012.f368((SubLObject)module0217.$ic37$, (SubLObject)module0217.$ic38$, (SubLObject)module0217.$ic39$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic40$, (SubLObject)module0217.$ic38$, (SubLObject)module0217.$ic41$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic43$, (SubLObject)module0217.$ic44$, (SubLObject)module0217.$ic45$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic46$, (SubLObject)module0217.$ic49$, (SubLObject)module0217.$ic50$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic17$);
        module0012.f368((SubLObject)module0217.$ic52$, (SubLObject)module0217.$ic53$, (SubLObject)module0217.$ic54$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic55$, (SubLObject)module0217.$ic56$, (SubLObject)module0217.$ic57$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic17$);
        module0012.f368((SubLObject)module0217.$ic59$, (SubLObject)module0217.$ic60$, (SubLObject)module0217.$ic61$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic62$, (SubLObject)module0217.$ic65$, (SubLObject)module0217.$ic66$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic17$);
        module0012.f368((SubLObject)module0217.$ic68$, (SubLObject)module0217.$ic60$, (SubLObject)module0217.$ic61$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic69$, (SubLObject)module0217.$ic65$, (SubLObject)module0217.$ic66$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic17$);
        module0012.f368((SubLObject)module0217.$ic73$, (SubLObject)module0217.$ic60$, (SubLObject)module0217.$ic61$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic74$, (SubLObject)module0217.$ic65$, (SubLObject)module0217.$ic66$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic17$);
        module0012.f368((SubLObject)module0217.$ic78$, (SubLObject)module0217.$ic60$, (SubLObject)module0217.$ic61$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic79$, (SubLObject)module0217.$ic65$, (SubLObject)module0217.$ic66$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic17$);
        module0012.f368((SubLObject)module0217.$ic83$, (SubLObject)module0217.$ic84$, (SubLObject)module0217.$ic85$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic86$, (SubLObject)module0217.$ic89$, (SubLObject)module0217.$ic90$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic17$);
        module0012.f368((SubLObject)module0217.$ic92$, (SubLObject)module0217.$ic93$, (SubLObject)module0217.$ic94$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic95$, (SubLObject)module0217.$ic98$, (SubLObject)module0217.$ic99$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic17$);
        module0012.f368((SubLObject)module0217.$ic101$, (SubLObject)module0217.$ic93$, (SubLObject)module0217.$ic94$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic102$, (SubLObject)module0217.$ic98$, (SubLObject)module0217.$ic99$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic17$);
        module0012.f368((SubLObject)module0217.$ic106$, (SubLObject)module0217.$ic107$, (SubLObject)module0217.$ic108$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic112$, (SubLObject)module0217.$ic113$, (SubLObject)module0217.$ic114$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic116$, (SubLObject)module0217.$ic107$, (SubLObject)module0217.$ic117$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic119$, (SubLObject)module0217.$ic107$, (SubLObject)module0217.$ic120$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic5$);
        module0012.f368((SubLObject)module0217.$ic133$, (SubLObject)module0217.$ic107$, (SubLObject)module0217.$ic134$, (SubLObject)module0217.NIL, (SubLObject)module0217.$ic135$);
        module0002.f35((SubLObject)module0217.$ic175$, (SubLObject)module0217.$ic176$);
        module0002.f35((SubLObject)module0217.$ic177$, (SubLObject)module0217.$ic178$);
        module0012.f368((SubLObject)module0217.$ic212$, (SubLObject)module0217.$ic213$, (SubLObject)module0217.$ic214$, (SubLObject)module0217.$ic215$, (SubLObject)module0217.$ic216$);
        module0012.f368((SubLObject)module0217.$ic218$, (SubLObject)module0217.$ic219$, (SubLObject)module0217.$ic220$, (SubLObject)module0217.$ic221$, (SubLObject)module0217.$ic216$);
        module0012.f368((SubLObject)module0217.$ic222$, (SubLObject)module0217.$ic219$, (SubLObject)module0217.$ic223$, (SubLObject)module0217.$ic221$, (SubLObject)module0217.$ic224$);
        module0012.f368((SubLObject)module0217.$ic227$, (SubLObject)module0217.$ic228$, (SubLObject)module0217.$ic229$, (SubLObject)module0217.$ic230$, (SubLObject)module0217.$ic216$);
        module0012.f368((SubLObject)module0217.$ic231$, (SubLObject)module0217.$ic232$, (SubLObject)module0217.$ic233$, (SubLObject)module0217.$ic234$, (SubLObject)module0217.$ic216$);
        module0012.f368((SubLObject)module0217.$ic236$, (SubLObject)module0217.$ic232$, (SubLObject)module0217.$ic237$, (SubLObject)module0217.$ic234$, (SubLObject)module0217.$ic224$);
        return (SubLObject)module0217.NIL;
    }
    
    public void declareFunctions() {
        f14446();
    }
    
    public void initializeVariables() {
        f14447();
    }
    
    public void runTopLevelForms() {
        f14448();
    }
    
    static {
        me = (SubLFile)new module0217();
        module0217.$g2386$ = null;
        module0217.$g2387$ = null;
        module0217.$g2388$ = null;
        module0217.$g2389$ = null;
        module0217.$g2390$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX-P");
        $ic1$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic2$ = SubLObjectFactory.makeSymbol("NUM-GAF-ARG-INDEX");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic4$ = SubLObjectFactory.makeString("Return the number of gafs indexed off of TERM ARGNUM PRED MT.");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $ic6$ = SubLObjectFactory.makeSymbol("KEY-GAF-ARG-INDEX");
        $ic7$ = SubLObjectFactory.makeSymbol("RELEVANT-NUM-GAF-ARG-INDEX");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"));
        $ic9$ = SubLObjectFactory.makeString("Return the assertion count at relevant mts under TERM ARGNUM PRED.");
        $ic10$ = SubLObjectFactory.makeSymbol("S#17037", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#12719", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#17290", "CYC");
        $ic13$ = SubLObjectFactory.makeInteger(5000);
        $ic14$ = SubLObjectFactory.makeSymbol("S#17141", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic16$ = SubLObjectFactory.makeString("Return a list of the keys to the next index level below TERM ARGNUM PRED.\n   @note destructible");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $ic18$ = SubLObjectFactory.makeKeyword("GAF-ARG");
        $ic19$ = SubLObjectFactory.makeSymbol("NUM-NART-ARG-INDEX");
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#168", "CYC"));
        $ic21$ = SubLObjectFactory.makeString("Return the number of #$termOfUnit gafs indexed off of TERM ARGNUM FUNC.");
        $ic22$ = SubLObjectFactory.makeSymbol("RELEVANT-NUM-NART-ARG-INDEX");
        $ic23$ = SubLObjectFactory.makeString("Compute the assertion count at relevant mts under TERM ARGNUM FUNC.\n   This will be the entire count extent if *tou-mt* is relevant,\n   and zero otherwise.");
        $ic24$ = SubLObjectFactory.makeSymbol("KEY-NART-ARG-INDEX");
        $ic25$ = SubLObjectFactory.makeString("Return a list of the keys to the next index level below TERM ARGNUM FUNC.");
        $ic26$ = SubLObjectFactory.makeKeyword("NART-ARG");
        $ic27$ = SubLObjectFactory.makeSymbol("NUM-PREDICATE-EXTENT-INDEX");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic29$ = SubLObjectFactory.makeString("Return the assertion count at PRED MT.");
        $ic30$ = SubLObjectFactory.makeSymbol("KEY-PREDICATE-EXTENT-INDEX");
        $ic31$ = SubLObjectFactory.makeSymbol("RELEVANT-NUM-PREDICATE-EXTENT-INDEX");
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"));
        $ic33$ = SubLObjectFactory.makeString("Compute the assertion count at relevant mts under PRED.");
        $ic34$ = SubLObjectFactory.makeSymbol("S#17043", "CYC");
        $ic35$ = SubLObjectFactory.makeString("Return a list of the keys to the next predicate-extent index level below PRED.");
        $ic36$ = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $ic37$ = SubLObjectFactory.makeSymbol("NUM-FUNCTION-EXTENT-INDEX");
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#168", "CYC"));
        $ic39$ = SubLObjectFactory.makeString("Return the function extent of FUNC.");
        $ic40$ = SubLObjectFactory.makeSymbol("RELEVANT-NUM-FUNCTION-EXTENT-INDEX");
        $ic41$ = SubLObjectFactory.makeString("Compute the function extent at relevant mts under FUNC.\n   This will be the entire function extent if *tou-mt* is relevant,\n   and zero otherwise.");
        $ic42$ = SubLObjectFactory.makeKeyword("FUNCTION-EXTENT");
        $ic43$ = SubLObjectFactory.makeSymbol("NUM-PREDICATE-RULE-INDEX");
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"));
        $ic45$ = SubLObjectFactory.makeString("Return the raw assertion count at PRED SENSE MT DIRECTION.");
        $ic46$ = SubLObjectFactory.makeSymbol("KEY-PREDICATE-RULE-INDEX");
        $ic47$ = SubLObjectFactory.makeSymbol("S#17048", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#17049", "CYC");
        $ic49$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic50$ = SubLObjectFactory.makeString("Return a list of the keys to the next index level below PRED SENSE MT.");
        $ic51$ = SubLObjectFactory.makeKeyword("PREDICATE-RULE");
        $ic52$ = SubLObjectFactory.makeSymbol("NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"));
        $ic54$ = SubLObjectFactory.makeString("Return the raw assertion count at PRED SENSE DIRECTION.");
        $ic55$ = SubLObjectFactory.makeSymbol("KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"));
        $ic57$ = SubLObjectFactory.makeString("Return a list of the keys to the next index level below PRED SENSE.");
        $ic58$ = SubLObjectFactory.makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");
        $ic59$ = SubLObjectFactory.makeSymbol("NUM-ISA-RULE-INDEX");
        $ic60$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"));
        $ic61$ = SubLObjectFactory.makeString("Return the raw assertion count at COL SENSE MT DIRECTION.");
        $ic62$ = SubLObjectFactory.makeSymbol("KEY-ISA-RULE-INDEX");
        $ic63$ = SubLObjectFactory.makeSymbol("S#17056", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#17057", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic66$ = SubLObjectFactory.makeString("Return a list of the keys to the next index level below COL SENSE MT.");
        $ic67$ = SubLObjectFactory.makeKeyword("ISA-RULE");
        $ic68$ = SubLObjectFactory.makeSymbol("NUM-QUOTED-ISA-RULE-INDEX");
        $ic69$ = SubLObjectFactory.makeSymbol("KEY-QUOTED-ISA-RULE-INDEX");
        $ic70$ = SubLObjectFactory.makeSymbol("S#17060", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#17061", "CYC");
        $ic72$ = SubLObjectFactory.makeKeyword("QUOTED-ISA-RULE");
        $ic73$ = SubLObjectFactory.makeSymbol("NUM-GENLS-RULE-INDEX");
        $ic74$ = SubLObjectFactory.makeSymbol("KEY-GENLS-RULE-INDEX");
        $ic75$ = SubLObjectFactory.makeSymbol("S#17064", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#17065", "CYC");
        $ic77$ = SubLObjectFactory.makeKeyword("GENLS-RULE");
        $ic78$ = SubLObjectFactory.makeSymbol("NUM-GENL-MT-RULE-INDEX");
        $ic79$ = SubLObjectFactory.makeSymbol("KEY-GENL-MT-RULE-INDEX");
        $ic80$ = SubLObjectFactory.makeSymbol("S#17068", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#17069", "CYC");
        $ic82$ = SubLObjectFactory.makeKeyword("GENL-MT-RULE");
        $ic83$ = SubLObjectFactory.makeSymbol("NUM-FUNCTION-RULE-INDEX");
        $ic84$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#168", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"));
        $ic85$ = SubLObjectFactory.makeString("Return the raw assertion count at FUNC MT DIRECTION.");
        $ic86$ = SubLObjectFactory.makeSymbol("KEY-FUNCTION-RULE-INDEX");
        $ic87$ = SubLObjectFactory.makeSymbol("S#17072", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#17073", "CYC");
        $ic89$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#168", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic90$ = SubLObjectFactory.makeString("Return a list of the keys to the next index level below FUNC MT.");
        $ic91$ = SubLObjectFactory.makeKeyword("FUNCTION-RULE");
        $ic92$ = SubLObjectFactory.makeSymbol("NUM-EXCEPTION-RULE-INDEX");
        $ic93$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"));
        $ic94$ = SubLObjectFactory.makeString("Return the raw assertion count at RULE MT DIRECTION.");
        $ic95$ = SubLObjectFactory.makeSymbol("KEY-EXCEPTION-RULE-INDEX");
        $ic96$ = SubLObjectFactory.makeSymbol("S#17076", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#17077", "CYC");
        $ic98$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic99$ = SubLObjectFactory.makeString("Return a list of the keys to the next index level below RULE MT.");
        $ic100$ = SubLObjectFactory.makeKeyword("EXCEPTION-RULE");
        $ic101$ = SubLObjectFactory.makeSymbol("NUM-PRAGMA-RULE-INDEX");
        $ic102$ = SubLObjectFactory.makeSymbol("KEY-PRAGMA-RULE-INDEX");
        $ic103$ = SubLObjectFactory.makeSymbol("S#17080", "CYC");
        $ic104$ = SubLObjectFactory.makeSymbol("S#17081", "CYC");
        $ic105$ = SubLObjectFactory.makeKeyword("PRAGMA-RULE");
        $ic106$ = SubLObjectFactory.makeSymbol("NUM-MT-INDEX");
        $ic107$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"));
        $ic108$ = SubLObjectFactory.makeString("Return the number of assertions at the mt index for TERM.");
        $ic109$ = SubLObjectFactory.makeKeyword("IST");
        $ic110$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic111$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic112$ = SubLObjectFactory.makeSymbol("NUM-HLMT-INDEX");
        $ic113$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic114$ = SubLObjectFactory.makeString("Return the number of assertions at the hlmt virtual index for TERM.");
        $ic115$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BroadMicrotheory"));
        $ic116$ = SubLObjectFactory.makeSymbol("NUM-OTHER-INDEX");
        $ic117$ = SubLObjectFactory.makeString("Return the number of assertions at the other index for TERM.");
        $ic118$ = SubLObjectFactory.makeKeyword("OTHER");
        $ic119$ = SubLObjectFactory.makeSymbol("NUM-INDEX");
        $ic120$ = SubLObjectFactory.makeString("The total number of assertions indexed from TERM.");
        $ic121$ = SubLObjectFactory.makeString("Performing indexing cleanup...");
        $ic122$ = SubLObjectFactory.makeSymbol("S#17218", "CYC");
        $ic123$ = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $ic124$ = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $ic125$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic126$ = SubLObjectFactory.makeKeyword("POS");
        $ic127$ = SubLObjectFactory.makeKeyword("NEG");
        $ic128$ = SubLObjectFactory.makeSymbol(">");
        $ic129$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic130$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic131$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic132$ = SubLObjectFactory.makeString("indexing problem while removing ~S");
        $ic133$ = SubLObjectFactory.makeSymbol("REMOVE-TERM-INDICES");
        $ic134$ = SubLObjectFactory.makeString("Remove all assertions about TERM from the KB. Return the TERM.");
        $ic135$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P"));
        $ic136$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic137$ = SubLObjectFactory.makeSymbol("S#16599", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("CDR");
        $ic139$ = SubLObjectFactory.makeSymbol("<");
        $ic140$ = SubLObjectFactory.makeSymbol("CAR");
        $ic141$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic142$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic143$ = SubLObjectFactory.makeSymbol("S#16604", "CYC");
        $ic144$ = SubLObjectFactory.makeSymbol("S#13284", "CYC");
        $ic145$ = SubLObjectFactory.makeString("So don't!");
        $ic146$ = SubLObjectFactory.makeString("Don't know how to index ~S");
        $ic147$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#202", "CYC"));
        $ic148$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#17294", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17295", "CYC"));
        $ic149$ = SubLObjectFactory.makeKeyword("ISA");
        $ic150$ = SubLObjectFactory.makeKeyword("PRED");
        $ic151$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic152$ = SubLObjectFactory.makeKeyword("QUOTED-ISA");
        $ic153$ = SubLObjectFactory.makeKeyword("GENLS");
        $ic154$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic155$ = SubLObjectFactory.makeKeyword("GENL-MT");
        $ic156$ = SubLObjectFactory.makeKeyword("FUNC");
        $ic157$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("abnormal"));
        $ic158$ = SubLObjectFactory.makeKeyword("EXCEPTION");
        $ic159$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("meetsPragmaticRequirement"));
        $ic160$ = SubLObjectFactory.makeKeyword("PRAGMA");
        $ic161$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic162$ = SubLObjectFactory.makeKeyword("IST-PRED");
        $ic163$ = SubLObjectFactory.makeSymbol("S#13258", "CYC");
        $ic164$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic165$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17296", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17297", "CYC"));
        $ic166$ = SubLObjectFactory.makeString("Can't index a pragmatic requirement as a neg-lit ~S");
        $ic167$ = SubLObjectFactory.makeString("Can't index an exception as a neg-lit ~S");
        $ic168$ = SubLObjectFactory.makeString("Don't know how to handle indexing type ~S");
        $ic169$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17298", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17299", "CYC"));
        $ic170$ = SubLObjectFactory.makeString("Can't index a function rule as a pos-lit ~S");
        $ic171$ = SubLObjectFactory.makeString("Can't remove the index of a pragmatic requirement as a neg-lit ~S");
        $ic172$ = SubLObjectFactory.makeString("Can't remove the index of an exception as a neg-lit ~S");
        $ic173$ = SubLObjectFactory.makeString("Can't remove the index of a function rule as a pos-lit ~S");
        $ic174$ = SubLObjectFactory.makeKeyword("OVERLAP");
        $ic175$ = SubLObjectFactory.makeSymbol("S#17239", "CYC");
        $ic176$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13105", "CYC"));
        $ic177$ = SubLObjectFactory.makeSymbol("S#17240", "CYC");
        $ic178$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17233", "CYC"));
        $ic179$ = SubLObjectFactory.makeKeyword("PRED-POS");
        $ic180$ = SubLObjectFactory.makeKeyword("IST-PRED-POS");
        $ic181$ = SubLObjectFactory.makeKeyword("ISA-POS");
        $ic182$ = SubLObjectFactory.makeKeyword("QUOTED-ISA-POS");
        $ic183$ = SubLObjectFactory.makeKeyword("GENLS-POS");
        $ic184$ = SubLObjectFactory.makeKeyword("GENL-MT-POS");
        $ic185$ = SubLObjectFactory.makeKeyword("PRED-NEG");
        $ic186$ = SubLObjectFactory.makeKeyword("IST-PRED-NEG");
        $ic187$ = SubLObjectFactory.makeKeyword("ISA-NEG");
        $ic188$ = SubLObjectFactory.makeKeyword("QUOTED-ISA-NEG");
        $ic189$ = SubLObjectFactory.makeKeyword("GENLS-NEG");
        $ic190$ = SubLObjectFactory.makeKeyword("GENL-MT-NEG");
        $ic191$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17296", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"));
        $ic192$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17298", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"));
        $ic193$ = SubLObjectFactory.makeKeyword("INDEX-TYPE");
        $ic194$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic195$ = SubLObjectFactory.makeKeyword("TERM");
        $ic196$ = SubLObjectFactory.makeKeyword("ARGNUM");
        $ic197$ = SubLObjectFactory.makeKeyword("TERMS");
        $ic198$ = SubLObjectFactory.makeKeyword("FUNCTOR");
        $ic199$ = SubLObjectFactory.makeInteger(10000);
        $ic200$ = SubLObjectFactory.makeString("Clearing FORT indexing");
        $ic201$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic202$ = SubLObjectFactory.makeString("Clearing Assertion indexing");
        $ic203$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic204$ = SubLObjectFactory.makeString("Reindexing assertions");
        $ic205$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic206$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic207$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic208$ = SubLObjectFactory.makeString("Error when indexing assertion ~A: ~A.~%");
        $ic209$ = SubLObjectFactory.makeSymbol("ASSERTION-ID");
        $ic210$ = SubLObjectFactory.makeSymbol("CNF-P");
        $ic211$ = SubLObjectFactory.makeSymbol("S#12265", "CYC");
        $ic212$ = SubLObjectFactory.makeSymbol("FIND-ASSERTION");
        $ic213$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13916", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic214$ = SubLObjectFactory.makeString("Find the assertion in MT with CNF.  Return NIL if not present.");
        $ic215$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13916", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CNF-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12265", "CYC")));
        $ic216$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")));
        $ic217$ = SubLObjectFactory.makeSymbol("S#12276", "CYC");
        $ic218$ = SubLObjectFactory.makeSymbol("FIND-ASSERTION-ANY-MT");
        $ic219$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13916", "CYC"));
        $ic220$ = SubLObjectFactory.makeString("Find any assertion in any mt with CNF.  Return NIL if none are present.");
        $ic221$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13916", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CNF-P")));
        $ic222$ = SubLObjectFactory.makeSymbol("FIND-ALL-ASSERTIONS");
        $ic223$ = SubLObjectFactory.makeString("Return all assertions that have CNF or NIL if there aren't any.\n   @note destructible");
        $ic224$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P"))));
        $ic225$ = SubLObjectFactory.makeSymbol("S#12753", "CYC");
        $ic226$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic227$ = SubLObjectFactory.makeSymbol("FIND-GAF");
        $ic228$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic229$ = SubLObjectFactory.makeString("Find the assertion in MT with GAF-FORMULA as its formula.  Return NIL if not present.");
        $ic230$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("S#12753", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC")));
        $ic231$ = SubLObjectFactory.makeSymbol("FIND-GAF-ANY-MT");
        $ic232$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF-FORMULA"));
        $ic233$ = SubLObjectFactory.makeString("Find any assertion in any mt with GAF-FORMULA as its formula.  Return NIL if not present.");
        $ic234$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("S#12753", "CYC")));
        $ic235$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic236$ = SubLObjectFactory.makeSymbol("FIND-ALL-GAFS");
        $ic237$ = SubLObjectFactory.makeString("Return all assertions of GAF-FORMULA or NIL if there aren't any.\n   @note destructible");
        $ic238$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"));
        $ic239$ = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $ic240$ = SubLObjectFactory.makeSymbol("S#17276", "CYC");
        $ic241$ = SubLObjectFactory.makeKeyword("GAF");
        $ic242$ = SubLObjectFactory.makeKeyword("CUTOFF");
        $ic243$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic244$ = SubLObjectFactory.makeSymbol("ASSERTION-EL-FORMULA");
        $ic245$ = SubLObjectFactory.makeSymbol("S#17285", "CYC");
        $ic246$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEG"), (SubLObject)SubLObjectFactory.makeKeyword("POS"));
        $ic247$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies"));
    }
    
    public static final class $f14225$ZeroArityFunction extends ZeroArityFunction
    {
        public $f14225$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#17141"));
        }
        
        public SubLObject processItem() {
            return module0217.f14225();
        }
    }
    
    public static final class $f14247$UnaryFunction extends UnaryFunction
    {
        public $f14247$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NUM-PREDICATE-EXTENT-INDEX"));
        }
        
        public SubLObject processItem(final SubLObject var62) {
            return module0217.f14247(var62, (SubLObject)$f14247$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f14247$BinaryFunction extends BinaryFunction
    {
        public $f14247$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NUM-PREDICATE-EXTENT-INDEX"));
        }
        
        public SubLObject processItem(final SubLObject var62, final SubLObject var63) {
            return module0217.f14247(var62, var63);
        }
    }
    
    public static final class $f14357$UnaryFunction extends UnaryFunction
    {
        public $f14357$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NUM-INDEX"));
        }
        
        public SubLObject processItem(final SubLObject var62) {
            return module0217.f14357(var62);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0217.class
	Total time: 2303 ms
	
	Decompiled with Procyon 0.5.32.
*/