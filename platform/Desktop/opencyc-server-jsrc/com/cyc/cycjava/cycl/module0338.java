package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0338 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0338";
    public static final String myFingerPrint = "aa493205c0bf1ad65f9e96b68b7584bc3b18c34891fe22a4ab72e94fcb20a0d5";
    public static SubLSymbol $g2879$;
    public static SubLSymbol $g2880$;
    private static SubLSymbol $g2881$;
    private static SubLSymbol $g2882$;
    private static SubLSymbol $g2883$;
    private static SubLSymbol $g2884$;
    private static SubLSymbol $g2885$;
    private static SubLSymbol $g2886$;
    public static SubLSymbol $g2887$;
    private static SubLSymbol $g2888$;
    private static SubLSymbol $g2889$;
    private static SubLSymbol $g2890$;
    private static SubLSymbol $g2891$;
    private static SubLSymbol $g2892$;
    private static SubLSymbol $g2893$;
    private static SubLSymbol $g2894$;
    private static SubLSymbol $g2895$;
    private static SubLSymbol $g2896$;
    private static SubLSymbol $g2897$;
    private static SubLSymbol $g2898$;
    private static SubLSymbol $g2899$;
    private static SubLSymbol $g2900$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLInteger $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLInteger $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLInteger $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLInteger $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLInteger $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLInteger $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLInteger $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLInteger $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLInteger $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLInteger $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLInteger $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLInteger $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLInteger $ic68$;
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
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    
    public static SubLObject f22655() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0338.$g2879$.getDynamicValue(var1);
    }
    
    public static SubLObject f22656(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)module0338.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0338.$ic0$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0338.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0338.$ic2$, var6)), ConsesLow.append(var7, (SubLObject)module0338.NIL));
    }
    
    public static SubLObject f22657(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0338.NIL != module0338.$g2880$.getDynamicValue(var9) && module0338.NIL != module0077.f5320(var8, module0338.$g2880$.getDynamicValue(var9)));
    }
    
    public static SubLObject f22658(final SubLObject var8, final SubLObject var9) {
        if (module0338.NIL != f22655()) {
            module0021.f1086(module0338.$g2882$.getGlobalValue(), var9);
            f22659(var8, var9);
            final SubLObject var10 = constants_high_oc.f10743(var8);
            if (var10.isString()) {
                module0021.f1144(var10, var9);
            }
            else {
                module0021.f1038(var10, var9);
            }
        }
        else {
            module0021.f1086(module0338.$g2881$.getGlobalValue(), var9);
            if (module0338.NIL != module0021.f1102()) {
                f22659(var8, var9);
            }
            else {
                f22660(var8, var9);
            }
        }
        return var8;
    }
    
    public static SubLObject f22661(final SubLObject var11, final SubLObject var9) {
        return f22658(var11, var9);
    }
    
    public static SubLObject f22662() {
        return module0338.$g2883$.getGlobalValue();
    }
    
    public static SubLObject f22663(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0338.NIL;
        if (module0338.NIL != module0021.f1102()) {
            var10 = f22664(var9);
        }
        else {
            var10 = f22665(var9);
        }
        if (module0338.NIL == var10) {
            var10 = module0338.$g2883$.getGlobalValue();
        }
        return var10;
    }
    
    public static SubLObject f22666(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0338.NIL;
        var10 = f22664(var9);
        module0021.f1090(var9);
        if (module0338.NIL == var10) {
            var10 = module0338.$g2883$.getGlobalValue();
        }
        return var10;
    }
    
    public static SubLObject f22659(final SubLObject var8, final SubLObject var9) {
        if (module0338.NIL != f22657(var8)) {
            return f22660(var8, var9);
        }
        final SubLObject var10 = constants_high_oc.f10757(var8);
        module0021.f1038(var10, var9);
        return var8;
    }
    
    public static SubLObject f22664(final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        if (module0338.NIL != constants_high_oc.f10734(var10)) {
            return constants_high_oc.f10751(var10);
        }
        if (module0338.NIL != constants_high_oc.f10753(var10)) {
            return f22667(var10);
        }
        return (SubLObject)module0338.NIL;
    }
    
    public static SubLObject f22660(final SubLObject var8, final SubLObject var9) {
        module0021.f1038(f22668(var8), var9);
        return var8;
    }
    
    public static SubLObject f22665(final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        return f22667(var10);
    }
    
    public static SubLObject f22668(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0338.NIL != constant_handles_oc.f8467(var8, (SubLObject)module0338.UNPROVIDED)) {
            return (SubLObject)module0338.MINUS_ONE_INTEGER;
        }
        final SubLObject var10 = module0111.$g1393$.getDynamicValue(var9);
        if (module0338.NIL == var10) {
            return constants_high_oc.f10749(var8);
        }
        final SubLObject var11 = var10;
        if (var11.eql((SubLObject)module0338.$ic9$)) {
            return constants_high_oc.f10749(var8);
        }
        if (var11.eql((SubLObject)module0338.$ic10$)) {
            return constants_high_oc.f10780(var8);
        }
        return Functions.funcall(var10, var8);
    }
    
    public static SubLObject f22667(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0338.NIL == module0004.f106(var14)) {
            return module0338.$g2883$.getGlobalValue();
        }
        final SubLObject var16 = module0111.$g1394$.getDynamicValue(var15);
        if (module0338.NIL == var16) {
            return constants_high_oc.f10752(var14);
        }
        final SubLObject var17 = var16;
        if (var17.eql((SubLObject)module0338.$ic11$)) {
            return constants_high_oc.f10752(var14);
        }
        if (var17.eql((SubLObject)module0338.$ic12$)) {
            return constants_high_oc.f10781(var14);
        }
        return Functions.funcall(var16, var14);
    }
    
    public static SubLObject f22669(final SubLObject var18, final SubLObject var9) {
        module0021.f1086(module0338.$g2884$.getGlobalValue(), var9);
        if (module0338.NIL != module0021.f1102()) {
            f22670(var18, var9);
        }
        else {
            f22671(var18, var9);
        }
        return var18;
    }
    
    public static SubLObject f22672(final SubLObject var11, final SubLObject var9) {
        return f22669(var11, var9);
    }
    
    public static SubLObject f22673() {
        return module0338.$g2885$.getGlobalValue();
    }
    
    public static SubLObject f22674(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0338.NIL;
        if (module0338.NIL != module0021.f1102()) {
            var10 = f22675(var9);
        }
        else {
            var10 = f22676(var9);
        }
        if (module0338.NIL == var10) {
            var10 = module0338.$g2885$.getGlobalValue();
        }
        return var10;
    }
    
    public static SubLObject f22670(final SubLObject var18, final SubLObject var9) {
        final SubLObject var19 = module0172.f10915(var18);
        module0021.f1038(var19, var9);
        return var18;
    }
    
    public static SubLObject f22675(final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        if (module0338.NIL != var10) {
            return module0172.f10916(var10);
        }
        return (SubLObject)module0338.NIL;
    }
    
    public static SubLObject f22671(final SubLObject var18, final SubLObject var9) {
        module0021.f1038(f22677(var18), var9);
        return var18;
    }
    
    public static SubLObject f22676(final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        return f22678(var10);
    }
    
    public static SubLObject f22677(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0338.NIL != module0172.f10918(var18, (SubLObject)module0338.UNPROVIDED)) {
            return (SubLObject)module0338.MINUS_ONE_INTEGER;
        }
        final SubLObject var20 = module0111.$g1395$.getDynamicValue(var19);
        if (module0338.NIL == var20) {
            return module0167.f10803(var18);
        }
        final SubLObject var21 = var20;
        if (var21.eql((SubLObject)module0338.$ic17$)) {
            return module0167.f10803(var18);
        }
        if (var21.eql((SubLObject)module0338.$ic18$)) {
            return module0172.f10937(var18);
        }
        return Functions.funcall(var20, var18);
    }
    
    public static SubLObject f22678(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0338.NIL == module0004.f106(var14)) {
            return module0338.$g2885$.getGlobalValue();
        }
        final SubLObject var16 = module0111.$g1396$.getDynamicValue(var15);
        if (module0338.NIL == var16) {
            return module0167.f10832(var14);
        }
        final SubLObject var17 = var16;
        if (var17.eql((SubLObject)module0338.$ic19$)) {
            return module0167.f10832(var14);
        }
        if (var17.eql((SubLObject)module0338.$ic20$)) {
            return module0172.f10938(var14);
        }
        return Functions.funcall(var16, var14);
    }
    
    public static SubLObject f22679(final SubLObject var20, final SubLObject var9) {
        module0021.f1086(module0338.$g2886$.getGlobalValue(), var9);
        if (module0338.NIL != module0021.f1102()) {
            f22680(var20, var9);
        }
        else {
            f22681(var20, var9);
        }
        return var20;
    }
    
    public static SubLObject f22682(final SubLObject var11, final SubLObject var9) {
        return f22679(var11, var9);
    }
    
    public static SubLObject f22683() {
        return module0338.$g2888$.getGlobalValue();
    }
    
    public static SubLObject f22684(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0338.NIL;
        if (module0338.NIL != module0021.f1102()) {
            var10 = f22685(var9);
        }
        else {
            var10 = f22686(var9);
        }
        if (module0338.NIL == var10) {
            var10 = module0338.$g2888$.getGlobalValue();
        }
        return var10;
    }
    
    public static SubLObject f22680(final SubLObject var20, final SubLObject var9) {
        final SubLObject var21 = module0178.f11282(var20);
        final SubLObject var22 = module0178.f11287(var20);
        module0021.f1038(var21, var9);
        module0021.f1038(var22, var9);
        return var20;
    }
    
    public static SubLObject f22685(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        final SubLObject var12 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        if (module0338.NIL != var11 && module0338.NIL != var12) {
            final SubLObject var13 = module0217.f14416(var11, var12);
            if (module0338.NIL == var13 && module0338.NIL != module0338.$g2887$.getDynamicValue(var10)) {
                Errors.error((SubLObject)module0338.$ic25$, var11, var12, var9);
            }
            return var13;
        }
        return (SubLObject)module0338.NIL;
    }
    
    public static SubLObject f22681(final SubLObject var20, final SubLObject var9) {
        module0021.f1038(f22687(var20), var9);
        return var20;
    }
    
    public static SubLObject f22686(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        final SubLObject var12 = f22688(var11);
        if (module0338.NIL == var12 && module0338.NIL != module0338.$g2887$.getDynamicValue(var10)) {
            Errors.error((SubLObject)module0338.$ic26$, var11, module0111.$g1398$.getDynamicValue(var10), var9);
        }
        return var12;
    }
    
    public static SubLObject f22687(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0338.NIL != module0178.f11362(var20, (SubLObject)module0338.UNPROVIDED)) {
            return (SubLObject)module0338.MINUS_ONE_INTEGER;
        }
        final SubLObject var22 = module0111.$g1397$.getDynamicValue(var21);
        if (module0338.NIL == var22) {
            return assertion_handles_oc.f11025(var20);
        }
        final SubLObject var23 = var22;
        if (var23.eql((SubLObject)module0338.$ic27$)) {
            return assertion_handles_oc.f11025(var20);
        }
        if (var23.eql((SubLObject)module0338.$ic28$)) {
            return module0178.f11391(var20);
        }
        return Functions.funcall(var22, var20);
    }
    
    public static SubLObject f22688(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0338.NIL == module0004.f106(var14)) {
            return module0338.$g2888$.getGlobalValue();
        }
        final SubLObject var16 = module0111.$g1398$.getDynamicValue(var15);
        if (module0338.NIL == var16) {
            return assertion_handles_oc.f11053(var14);
        }
        final SubLObject var17 = var16;
        if (var17.eql((SubLObject)module0338.$ic29$)) {
            return assertion_handles_oc.f11053(var14);
        }
        if (var17.eql((SubLObject)module0338.$ic30$)) {
            return module0178.f11392(var14);
        }
        return Functions.funcall(var16, var14);
    }
    
    public static SubLObject f22689(final SubLObject var24, final SubLObject var9) {
        module0021.f1086(module0338.$g2889$.getGlobalValue(), var9);
        if (module0338.NIL != module0021.f1102()) {
            f22690(var24, var9);
        }
        else {
            f22691(var24, var9);
        }
        return var24;
    }
    
    public static SubLObject f22692(final SubLObject var11, final SubLObject var9) {
        return f22689(var11, var9);
    }
    
    public static SubLObject f22693() {
        return module0338.$g2890$.getGlobalValue();
    }
    
    public static SubLObject f22694(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0338.NIL;
        if (module0338.NIL != module0021.f1102()) {
            var10 = f22695(var9);
        }
        else {
            var10 = f22696(var9);
        }
        if (module0338.NIL == var10) {
            var10 = module0338.$g2890$.getGlobalValue();
        }
        return var10;
    }
    
    public static SubLObject f22690(final SubLObject var24, final SubLObject var9) {
        final SubLObject var25 = module0188.f11781(var24);
        final SubLObject var26 = module0188.f11770(var24);
        final SubLObject var27 = module0191.f11924(var24);
        module0021.f1038(var25, var9);
        module0021.f1038(var26, var9);
        module0021.f1038(var27, var9);
        return var24;
    }
    
    public static SubLObject f22695(final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        final SubLObject var11 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        final SubLObject var12 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        if (module0338.NIL != var10 && module0338.NIL != var11 && module0338.NIL != var12) {
            return module0188.f11778(var10, var11, var12);
        }
        return (SubLObject)module0338.NIL;
    }
    
    public static SubLObject f22691(final SubLObject var24, final SubLObject var9) {
        module0021.f1038(f22697(var24), var9);
        return var24;
    }
    
    public static SubLObject f22696(final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        return f22698(var10);
    }
    
    public static SubLObject f22697(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if (module0338.NIL != module0188.f11782(var24, (SubLObject)module0338.UNPROVIDED)) {
            return (SubLObject)module0338.MINUS_ONE_INTEGER;
        }
        final SubLObject var26 = module0111.$g1399$.getDynamicValue(var25);
        if (module0338.NIL == var26) {
            return oc_deduction_handles.f11649(var24);
        }
        final SubLObject var27 = var26;
        if (var27.eql((SubLObject)module0338.$ic35$)) {
            return oc_deduction_handles.f11649(var24);
        }
        if (var27.eql((SubLObject)module0338.$ic36$)) {
            return module0188.f11796(var24);
        }
        return Functions.funcall(var26, var24);
    }
    
    public static SubLObject f22698(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0338.NIL == module0004.f106(var14)) {
            return module0338.$g2890$.getGlobalValue();
        }
        final SubLObject var16 = module0111.$g1400$.getDynamicValue(var15);
        if (module0338.NIL == var16) {
            return oc_deduction_handles.f11675(var14);
        }
        final SubLObject var17 = var16;
        if (var17.eql((SubLObject)module0338.$ic37$)) {
            return oc_deduction_handles.f11675(var14);
        }
        if (var17.eql((SubLObject)module0338.$ic38$)) {
            return module0188.f11797(var14);
        }
        return Functions.funcall(var16, var14);
    }
    
    public static SubLObject f22699(final SubLObject var28, final SubLObject var9) {
        module0021.f1086(module0338.$g2891$.getGlobalValue(), var9);
        if (module0338.NIL != module0021.f1102()) {
            f22700(var28, var9);
        }
        else {
            f22701(var28, var9);
        }
        return var28;
    }
    
    public static SubLObject f22702(final SubLObject var11, final SubLObject var9) {
        return f22699(var11, var9);
    }
    
    public static SubLObject f22703() {
        return module0338.$g2892$.getGlobalValue();
    }
    
    public static SubLObject f22704(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0338.NIL;
        if (module0338.NIL != module0021.f1102()) {
            var10 = f22705(var9);
        }
        else {
            var10 = f22706(var9);
        }
        if (module0338.NIL == var10) {
            var10 = module0338.$g2892$.getGlobalValue();
        }
        return var10;
    }
    
    public static SubLObject f22700(final SubLObject var28, final SubLObject var9) {
        final SubLObject var29 = module0183.f11557(var28);
        module0021.f1038(var29, var9);
        return var28;
    }
    
    public static SubLObject f22705(final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        return (SubLObject)((module0338.NIL != module0191.f11952(var10)) ? module0183.f11552(var10) : module0338.NIL);
    }
    
    public static SubLObject f22701(final SubLObject var28, final SubLObject var9) {
        module0021.f1038(f22707(var28), var9);
        return var28;
    }
    
    public static SubLObject f22706(final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        return f22708(var10);
    }
    
    public static SubLObject f22707(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0338.NIL == module0179.f11430(var28, (SubLObject)module0338.UNPROVIDED)) {
            return (SubLObject)module0338.MINUS_ONE_INTEGER;
        }
        final SubLObject var31;
        final SubLObject var30 = var31 = (SubLObject)((module0338.NIL != module0111.$g1401$.getDynamicValue(var29)) ? module0111.$g1401$.getDynamicValue(var29) : module0338.$ic43$);
        if (var31.eql((SubLObject)module0338.$ic43$)) {
            return module0179.f11415(var28);
        }
        if (var31.eql((SubLObject)module0338.$ic44$)) {
            return module0183.f11581(var28);
        }
        return Functions.funcall(var30, var28);
    }
    
    public static SubLObject f22708(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var17;
        final SubLObject var16 = var17 = (SubLObject)((module0338.NIL != module0111.$g1402$.getDynamicValue(var15)) ? module0111.$g1402$.getDynamicValue(var15) : module0338.$ic45$);
        if (var17.eql((SubLObject)module0338.$ic45$)) {
            return module0179.f11443(var14);
        }
        if (var17.eql((SubLObject)module0338.$ic46$)) {
            return module0183.f11582(var14);
        }
        return Functions.funcall(var16, var14);
    }
    
    public static SubLObject f22709(final SubLObject var30, final SubLObject var9) {
        module0021.f1086(module0338.$g2893$.getGlobalValue(), var9);
        if (module0338.NIL != module0021.f1102()) {
            f22710(var30, var9);
        }
        else {
            f22711(var30, var9);
        }
        return var30;
    }
    
    public static SubLObject f22712(final SubLObject var11, final SubLObject var9) {
        return f22709(var11, var9);
    }
    
    public static SubLObject f22713() {
        return module0338.$g2894$.getGlobalValue();
    }
    
    public static SubLObject f22714(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0338.NIL;
        if (module0338.NIL != module0021.f1102()) {
            var10 = f22715(var9);
        }
        else {
            var10 = f22716(var9);
        }
        if (module0338.NIL == var10) {
            var10 = module0338.$g2894$.getGlobalValue();
        }
        return var10;
    }
    
    public static SubLObject f22710(final SubLObject var30, final SubLObject var9) {
        final SubLObject var31 = module0192.f12017(var30);
        module0021.f1038(var31, var9);
        return var30;
    }
    
    public static SubLObject f22715(final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        if (module0338.NIL != var10) {
            return module0217.f14438(var10);
        }
        return (SubLObject)module0338.NIL;
    }
    
    public static SubLObject f22711(final SubLObject var30, final SubLObject var9) {
        module0021.f1038(f22717(var30), var9);
        return var30;
    }
    
    public static SubLObject f22716(final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        return f22718(var10);
    }
    
    public static SubLObject f22717(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (module0338.NIL != module0192.f12031(var30, (SubLObject)module0338.UNPROVIDED)) {
            return (SubLObject)module0338.MINUS_ONE_INTEGER;
        }
        final SubLObject var32 = module0111.$g1403$.getDynamicValue(var31);
        if (module0338.NIL == var32) {
            return module0192.f12025(var30);
        }
        final SubLObject var33 = var32;
        if (var33.eql((SubLObject)module0338.$ic51$)) {
            return module0192.f12025(var30);
        }
        if (var33.eql((SubLObject)module0338.$ic52$)) {
            return module0192.f12056(var30);
        }
        return Functions.funcall(var32, var30);
    }
    
    public static SubLObject f22718(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0338.NIL == module0004.f106(var14)) {
            return module0338.$g2894$.getGlobalValue();
        }
        final SubLObject var16 = module0111.$g1404$.getDynamicValue(var15);
        if (module0338.NIL == var16) {
            return module0192.f12032(var14);
        }
        final SubLObject var17 = var16;
        if (var17.eql((SubLObject)module0338.$ic53$)) {
            return module0192.f12032(var14);
        }
        if (var17.eql((SubLObject)module0338.$ic54$)) {
            return module0192.f12057(var14);
        }
        return Functions.funcall(var16, var14);
    }
    
    public static SubLObject f22719(final SubLObject var31, final SubLObject var9) {
        if (module0338.NIL != f22655()) {
            module0021.f1086(module0338.$g2896$.getGlobalValue(), var9);
            module0021.f1038(module0193.f12073(var31), var9);
            module0021.f1144(module0038.f2624(var31), var9);
        }
        else {
            module0021.f1086(module0338.$g2895$.getGlobalValue(), var9);
            module0021.f1038(module0193.f12073(var31), var9);
        }
        return var31;
    }
    
    public static SubLObject f22720(final SubLObject var11, final SubLObject var9) {
        return f22719(var11, var9);
    }
    
    public static SubLObject f22721(final SubLObject var9) {
        return module0193.f12079(module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED));
    }
    
    public static SubLObject f22722(final SubLObject var9) {
        final SubLObject var10 = module0193.f12079(module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED));
        module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        return var10;
    }
    
    public static SubLObject f22723(final SubLObject var11, final SubLObject var9) {
        return f22724(var11, var9);
    }
    
    public static SubLObject f22724(final SubLObject var32, final SubLObject var9) {
        module0021.f1086(module0338.$g2897$.getGlobalValue(), var9);
        module0021.f1038(module0245.f15810(var32), var9);
        module0021.f1038(module0245.f15811(var32), var9);
        return var32;
    }
    
    public static SubLObject f22725(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0338.NIL;
        var10 = module0245.f15814((SubLObject)module0338.UNPROVIDED);
        module0245.f15812(var10, module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED));
        module0245.f15813(var10, module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED));
        return var10;
    }
    
    public static SubLObject f22726(final SubLObject var11, final SubLObject var9) {
        return f22727(var11, var9);
    }
    
    public static SubLObject f22727(final SubLObject var32, final SubLObject var9) {
        module0021.f1086(module0338.$g2898$.getGlobalValue(), var9);
        module0021.f1038(module0245.f15819(var32), var9);
        return var32;
    }
    
    public static SubLObject f22728(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0338.NIL;
        var10 = module0245.f15821((SubLObject)module0338.UNPROVIDED);
        module0245.f15820(var10, module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED));
        return var10;
    }
    
    public static SubLObject f22729(final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        SubLObject var11 = (SubLObject)module0338.NIL;
        var11 = module0324.f21943(var10);
        return var11;
    }
    
    public static SubLObject f22730(final SubLObject var9) {
        final SubLObject var10 = module0021.f1060(var9, (SubLObject)module0338.UNPROVIDED, (SubLObject)module0338.UNPROVIDED);
        SubLObject var11 = (SubLObject)module0338.NIL;
        var11 = module0324.f21944(var10);
        return var11;
    }
    
    public static SubLObject f22731(final SubLObject var11, final SubLObject var9) {
        return f22732(var11, var9);
    }
    
    public static SubLObject f22733(final SubLObject var11, final SubLObject var9) {
        return f22734(var11, var9);
    }
    
    public static SubLObject f22732(final SubLObject var34, final SubLObject var9) {
        module0021.f1086(module0338.$g2899$.getGlobalValue(), var9);
        module0021.f1038(module0324.f21931(var34), var9);
        return var34;
    }
    
    public static SubLObject f22734(final SubLObject var35, final SubLObject var9) {
        module0021.f1086(module0338.$g2900$.getGlobalValue(), var9);
        module0021.f1038(module0324.f21931(var35), var9);
        return var35;
    }
    
    public static SubLObject f22735() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22655", "S#25280", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0338", "f22656", "S#25281");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22657", "S#25282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22658", "S#25283", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22661", "S#25284", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22662", "S#10519", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22663", "S#25269", 1, 0, false);
        new $f22663$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22666", "S#25285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22659", "S#25286", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22664", "S#25287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22660", "S#25288", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22665", "S#25289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22668", "S#25290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22667", "S#25291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22669", "S#25292", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22672", "S#25293", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22673", "S#13602", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22674", "S#25270", 1, 0, false);
        new $f22674$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22670", "S#25294", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22675", "S#25295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22671", "S#25296", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22676", "S#25297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22677", "S#25298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22678", "S#25299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22679", "S#25300", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22682", "S#25301", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22683", "S#13810", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22684", "S#25271", 1, 0, false);
        new $f22684$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22680", "S#25302", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22685", "S#25303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22681", "S#25304", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22686", "S#25305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22687", "S#25306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22688", "S#25307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22689", "S#25308", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22692", "S#25309", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22693", "S#14451", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22694", "S#25272", 1, 0, false);
        new $f22694$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22690", "S#25310", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22695", "S#25311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22691", "S#25312", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22696", "S#25313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22697", "S#25314", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22698", "S#25315", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22699", "S#25316", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22702", "S#25317", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22703", "S#14197", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22704", "S#25273", 1, 0, false);
        new $f22704$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22700", "S#25318", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22705", "S#25319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22701", "S#25320", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22706", "S#25321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22707", "S#25322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22708", "S#25323", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22709", "S#25324", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22712", "S#25325", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22713", "S#14783", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22714", "S#25274", 1, 0, false);
        new $f22714$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22710", "S#25326", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22715", "S#25327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22711", "S#25328", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22716", "S#25329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22717", "S#25330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22718", "S#25331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22719", "S#25332", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22720", "S#25333", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22721", "S#25275", 1, 0, false);
        new $f22721$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22722", "S#25334", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22723", "S#25335", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22724", "S#25336", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22725", "S#25276", 1, 0, false);
        new $f22725$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22726", "S#25337", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22727", "S#25338", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22728", "S#25277", 1, 0, false);
        new $f22728$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22729", "S#25278", 1, 0, false);
        new $f22729$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22730", "S#25279", 1, 0, false);
        new $f22730$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22731", "S#25339", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22733", "S#25340", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22732", "S#25341", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0338", "f22734", "S#25342", 2, 0, false);
        return (SubLObject)module0338.NIL;
    }
    
    public static SubLObject f22736() {
        module0338.$g2879$ = SubLFiles.defparameter("S#25343", (SubLObject)module0338.NIL);
        module0338.$g2880$ = SubLFiles.defparameter("S#25344", (SubLObject)module0338.NIL);
        module0338.$g2881$ = SubLFiles.defconstant("S#25345", (SubLObject)module0338.$ic3$);
        module0338.$g2882$ = SubLFiles.defconstant("S#25346", (SubLObject)module0338.$ic5$);
        module0338.$g2883$ = SubLFiles.deflexical("S#25347", (module0338.NIL != Symbols.boundp((SubLObject)module0338.$ic8$)) ? module0338.$g2883$.getGlobalValue() : constant_handles_oc.f8481());
        module0338.$g2884$ = SubLFiles.defconstant("S#25348", (SubLObject)module0338.$ic13$);
        module0338.$g2885$ = SubLFiles.deflexical("S#25349", (module0338.NIL != Symbols.boundp((SubLObject)module0338.$ic16$)) ? module0338.$g2885$.getGlobalValue() : module0167.f10830());
        module0338.$g2886$ = SubLFiles.defconstant("S#25350", (SubLObject)module0338.$ic21$);
        module0338.$g2887$ = SubLFiles.defparameter("S#25351", (SubLObject)module0338.NIL);
        module0338.$g2888$ = SubLFiles.deflexical("S#25352", (module0338.NIL != Symbols.boundp((SubLObject)module0338.$ic24$)) ? module0338.$g2888$.getGlobalValue() : assertion_handles_oc.f11050());
        module0338.$g2889$ = SubLFiles.defconstant("S#25353", (SubLObject)module0338.$ic31$);
        module0338.$g2890$ = SubLFiles.deflexical("S#25354", (module0338.NIL != Symbols.boundp((SubLObject)module0338.$ic34$)) ? module0338.$g2890$.getGlobalValue() : oc_deduction_handles.f11673());
        module0338.$g2891$ = SubLFiles.defconstant("S#25355", (SubLObject)module0338.$ic39$);
        module0338.$g2892$ = SubLFiles.deflexical("S#25356", (module0338.NIL != Symbols.boundp((SubLObject)module0338.$ic42$)) ? module0338.$g2892$.getGlobalValue() : module0179.f11440());
        module0338.$g2893$ = SubLFiles.defconstant("S#25357", (SubLObject)module0338.$ic47$);
        module0338.$g2894$ = SubLFiles.deflexical("S#25358", (module0338.NIL != Symbols.boundp((SubLObject)module0338.$ic50$)) ? module0338.$g2894$.getGlobalValue() : module0192.f12038());
        module0338.$g2895$ = SubLFiles.defconstant("S#25359", (SubLObject)module0338.$ic55$);
        module0338.$g2896$ = SubLFiles.defconstant("S#25360", (SubLObject)module0338.$ic57$);
        module0338.$g2897$ = SubLFiles.defconstant("S#25361", (SubLObject)module0338.$ic61$);
        module0338.$g2898$ = SubLFiles.defconstant("S#25362", (SubLObject)module0338.$ic64$);
        module0338.$g2899$ = SubLFiles.defconstant("S#25363", (SubLObject)module0338.$ic66$);
        module0338.$g2900$ = SubLFiles.defconstant("S#25364", (SubLObject)module0338.$ic68$);
        return (SubLObject)module0338.NIL;
    }
    
    public static SubLObject f22737() {
        module0021.f1098(module0338.$g2881$.getGlobalValue(), (SubLObject)module0338.$ic4$);
        module0021.f1098(module0338.$g2882$.getGlobalValue(), (SubLObject)module0338.$ic6$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), constant_handles_oc.$g1501$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0338.$ic7$));
        module0003.f57((SubLObject)module0338.$ic8$);
        module0021.f1098(module0338.$g2884$.getGlobalValue(), (SubLObject)module0338.$ic14$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0167.$g2182$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0338.$ic15$));
        module0003.f57((SubLObject)module0338.$ic16$);
        module0021.f1098(module0338.$g2886$.getGlobalValue(), (SubLObject)module0338.$ic22$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), assertion_handles_oc.$g2194$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0338.$ic23$));
        module0003.f57((SubLObject)module0338.$ic24$);
        module0021.f1098(module0338.$g2889$.getGlobalValue(), (SubLObject)module0338.$ic32$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), oc_deduction_handles.$g2229$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0338.$ic33$));
        module0003.f57((SubLObject)module0338.$ic34$);
        module0021.f1098(module0338.$g2891$.getGlobalValue(), (SubLObject)module0338.$ic40$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0179.$g2214$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0338.$ic41$));
        module0003.f57((SubLObject)module0338.$ic42$);
        module0021.f1098(module0338.$g2893$.getGlobalValue(), (SubLObject)module0338.$ic48$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0192.$g2252$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0338.$ic49$));
        module0003.f57((SubLObject)module0338.$ic50$);
        module0021.f1098(module0338.$g2895$.getGlobalValue(), (SubLObject)module0338.$ic56$);
        module0021.f1098(module0338.$g2896$.getGlobalValue(), (SubLObject)module0338.$ic58$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0193.$g2259$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0338.$ic59$));
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0245.$g2462$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0338.$ic60$));
        module0021.f1098(module0338.$g2897$.getGlobalValue(), (SubLObject)module0338.$ic62$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0245.$g2463$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0338.$ic63$));
        module0021.f1098(module0338.$g2898$.getGlobalValue(), (SubLObject)module0338.$ic65$);
        module0021.f1098(module0338.$g2899$.getGlobalValue(), (SubLObject)module0338.$ic67$);
        module0021.f1098(module0338.$g2900$.getGlobalValue(), (SubLObject)module0338.$ic69$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0324.$g2838$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0338.$ic70$));
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0324.$g2839$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0338.$ic71$));
        module0027.f1449((SubLObject)module0338.$ic72$, (SubLObject)ConsesLow.list(new SubLObject[] { module0338.$ic73$, Symbols.symbol_function((SubLObject)module0338.EQUALP), module0338.$ic74$, module0338.NIL, module0338.$ic75$, module0338.NIL, module0338.$ic76$, module0338.$ic77$, module0338.$ic78$, module0338.T }), (SubLObject)module0338.$ic79$);
        module0027.f1449((SubLObject)module0338.$ic80$, (SubLObject)ConsesLow.list(new SubLObject[] { module0338.$ic73$, Symbols.symbol_function((SubLObject)module0338.EQUALP), module0338.$ic74$, module0338.NIL, module0338.$ic75$, module0338.NIL, module0338.$ic76$, module0338.$ic77$, module0338.$ic78$, module0338.T }), (SubLObject)module0338.$ic81$);
        return (SubLObject)module0338.NIL;
    }
    
    public void declareFunctions() {
        f22735();
    }
    
    public void initializeVariables() {
        f22736();
    }
    
    public void runTopLevelForms() {
        f22737();
    }
    
    static {
        me = (SubLFile)new module0338();
        module0338.$g2879$ = null;
        module0338.$g2880$ = null;
        module0338.$g2881$ = null;
        module0338.$g2882$ = null;
        module0338.$g2883$ = null;
        module0338.$g2884$ = null;
        module0338.$g2885$ = null;
        module0338.$g2886$ = null;
        module0338.$g2887$ = null;
        module0338.$g2888$ = null;
        module0338.$g2889$ = null;
        module0338.$g2890$ = null;
        module0338.$g2891$ = null;
        module0338.$g2892$ = null;
        module0338.$g2893$ = null;
        module0338.$g2894$ = null;
        module0338.$g2895$ = null;
        module0338.$g2896$ = null;
        module0338.$g2897$ = null;
        module0338.$g2898$ = null;
        module0338.$g2899$ = null;
        module0338.$g2900$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13801", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("CLET");
        $ic2$ = SubLObjectFactory.makeSymbol("S#25344", "CYC");
        $ic3$ = SubLObjectFactory.makeInteger(30);
        $ic4$ = SubLObjectFactory.makeSymbol("S#25269", "CYC");
        $ic5$ = SubLObjectFactory.makeInteger(32);
        $ic6$ = SubLObjectFactory.makeSymbol("S#25285", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#25284", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#25347", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID");
        $ic10$ = SubLObjectFactory.makeSymbol("S#13584", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID");
        $ic12$ = SubLObjectFactory.makeSymbol("S#13585", "CYC");
        $ic13$ = SubLObjectFactory.makeInteger(31);
        $ic14$ = SubLObjectFactory.makeSymbol("S#25270", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#25293", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#25349", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("NART-ID");
        $ic18$ = SubLObjectFactory.makeSymbol("S#13739", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("FIND-NART-BY-ID");
        $ic20$ = SubLObjectFactory.makeSymbol("S#13740", "CYC");
        $ic21$ = SubLObjectFactory.makeInteger(33);
        $ic22$ = SubLObjectFactory.makeSymbol("S#25271", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#25301", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#25352", "CYC");
        $ic25$ = SubLObjectFactory.makeString("Failed to input assertion with CNF ~a and mt ~a from stream ~a");
        $ic26$ = SubLObjectFactory.makeString("Failed to input assertion with handle ~a and lookup function ~a from stream ~a");
        $ic27$ = SubLObjectFactory.makeSymbol("ASSERTION-ID");
        $ic28$ = SubLObjectFactory.makeSymbol("S#14176", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("FIND-ASSERTION-BY-ID");
        $ic30$ = SubLObjectFactory.makeSymbol("S#14177", "CYC");
        $ic31$ = SubLObjectFactory.makeInteger(36);
        $ic32$ = SubLObjectFactory.makeSymbol("S#25272", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#25309", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#25354", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("DEDUCTION-ID");
        $ic36$ = SubLObjectFactory.makeSymbol("S#14592", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("FIND-DEDUCTION-BY-ID");
        $ic38$ = SubLObjectFactory.makeSymbol("S#14593", "CYC");
        $ic39$ = SubLObjectFactory.makeInteger(37);
        $ic40$ = SubLObjectFactory.makeSymbol("S#25273", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#25317", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#25356", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#14246", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#14396", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#14249", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#14397", "CYC");
        $ic47$ = SubLObjectFactory.makeInteger(38);
        $ic48$ = SubLObjectFactory.makeSymbol("S#25274", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#25325", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#25358", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#14801", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#14831", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#14810", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#14832", "CYC");
        $ic55$ = SubLObjectFactory.makeInteger(40);
        $ic56$ = SubLObjectFactory.makeSymbol("S#25275", "CYC");
        $ic57$ = SubLObjectFactory.makeInteger(42);
        $ic58$ = SubLObjectFactory.makeSymbol("S#25334", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#25333", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#25335", "CYC");
        $ic61$ = SubLObjectFactory.makeInteger(90);
        $ic62$ = SubLObjectFactory.makeSymbol("S#25276", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#25337", "CYC");
        $ic64$ = SubLObjectFactory.makeInteger(91);
        $ic65$ = SubLObjectFactory.makeSymbol("S#25277", "CYC");
        $ic66$ = SubLObjectFactory.makeInteger(94);
        $ic67$ = SubLObjectFactory.makeSymbol("S#25278", "CYC");
        $ic68$ = SubLObjectFactory.makeInteger(95);
        $ic69$ = SubLObjectFactory.makeSymbol("S#25279", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#25339", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#25340", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#2057", "CYC");
        $ic73$ = SubLObjectFactory.makeKeyword("TEST");
        $ic74$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic75$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic76$ = SubLObjectFactory.makeKeyword("KB");
        $ic77$ = SubLObjectFactory.makeKeyword("TINY");
        $ic78$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic79$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeGuid("bd5880f4-9c29-11b1-9dad-c379636f7270")), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(25), module0338.FIFTEEN_INTEGER, SubLObjectFactory.makeInteger(164), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(99), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(99), SubLObjectFactory.makeInteger(51), SubLObjectFactory.makeInteger(55), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(51), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(55), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(55), SubLObjectFactory.makeInteger(48) })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeGuid("1bb5d971-e945-11dc-8241-00e08156aaa2")), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(25), module0338.FIFTEEN_INTEGER, SubLObjectFactory.makeInteger(164), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(55), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(99), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(50) })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeGuid("8654b22c-e947-11dc-86ef-00e08156aaa2")), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(25), module0338.FIFTEEN_INTEGER, SubLObjectFactory.makeInteger(164), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(99), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(55), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(99), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(50) })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeGuid("69ece82b-4224-40d6-8f55-268be97ba4e7")), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(25), module0338.FIFTEEN_INTEGER, SubLObjectFactory.makeInteger(164), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(99), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(55), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(55) })));
        $ic80$ = SubLObjectFactory.makeSymbol("S#2076", "CYC");
        $ic81$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(25), module0338.FIFTEEN_INTEGER, SubLObjectFactory.makeInteger(164), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(99), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(99), SubLObjectFactory.makeInteger(51), SubLObjectFactory.makeInteger(55), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(51), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(55), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(55), SubLObjectFactory.makeInteger(48) })), (SubLObject)SubLObjectFactory.makeGuid("bd5880f4-9c29-11b1-9dad-c379636f7270")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(25), module0338.FIFTEEN_INTEGER, SubLObjectFactory.makeInteger(164), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(55), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(99), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(50) })), (SubLObject)SubLObjectFactory.makeGuid("1bb5d971-e945-11dc-8241-00e08156aaa2")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(25), module0338.FIFTEEN_INTEGER, SubLObjectFactory.makeInteger(164), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(99), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(55), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(99), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(50) })), (SubLObject)SubLObjectFactory.makeGuid("8654b22c-e947-11dc-86ef-00e08156aaa2")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(25), module0338.FIFTEEN_INTEGER, SubLObjectFactory.makeInteger(164), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(99), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(48), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeInteger(54), SubLObjectFactory.makeInteger(56), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(55), SubLObjectFactory.makeInteger(98), SubLObjectFactory.makeInteger(97), SubLObjectFactory.makeInteger(52), SubLObjectFactory.makeInteger(101), SubLObjectFactory.makeInteger(55) })), (SubLObject)SubLObjectFactory.makeGuid("69ece82b-4224-40d6-8f55-268be97ba4e7")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(43), SubLObjectFactory.makeInteger(189), SubLObjectFactory.makeInteger(88), SubLObjectFactory.makeInteger(128), SubLObjectFactory.makeInteger(244), SubLObjectFactory.makeInteger(156), SubLObjectFactory.makeInteger(41), module0338.SEVENTEEN_INTEGER, SubLObjectFactory.makeInteger(177), SubLObjectFactory.makeInteger(157), SubLObjectFactory.makeInteger(173), SubLObjectFactory.makeInteger(195), SubLObjectFactory.makeInteger(121), SubLObjectFactory.makeInteger(99), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(114), SubLObjectFactory.makeInteger(112) })), (SubLObject)SubLObjectFactory.makeGuid("bd5880f4-9c29-11b1-9dad-c379636f7270")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(43), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(181), SubLObjectFactory.makeInteger(217), SubLObjectFactory.makeInteger(113), SubLObjectFactory.makeInteger(233), SubLObjectFactory.makeInteger(69), module0338.SEVENTEEN_INTEGER, SubLObjectFactory.makeInteger(220), SubLObjectFactory.makeInteger(130), SubLObjectFactory.makeInteger(65), module0338.ZERO_INTEGER, SubLObjectFactory.makeInteger(224), SubLObjectFactory.makeInteger(129), SubLObjectFactory.makeInteger(86), SubLObjectFactory.makeInteger(170), SubLObjectFactory.makeInteger(162) })), (SubLObject)SubLObjectFactory.makeGuid("1bb5d971-e945-11dc-8241-00e08156aaa2")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(43), SubLObjectFactory.makeInteger(134), SubLObjectFactory.makeInteger(84), SubLObjectFactory.makeInteger(178), SubLObjectFactory.makeInteger(44), SubLObjectFactory.makeInteger(233), SubLObjectFactory.makeInteger(71), module0338.SEVENTEEN_INTEGER, SubLObjectFactory.makeInteger(220), SubLObjectFactory.makeInteger(134), SubLObjectFactory.makeInteger(239), module0338.ZERO_INTEGER, SubLObjectFactory.makeInteger(224), SubLObjectFactory.makeInteger(129), SubLObjectFactory.makeInteger(86), SubLObjectFactory.makeInteger(170), SubLObjectFactory.makeInteger(162) })), (SubLObject)SubLObjectFactory.makeGuid("8654b22c-e947-11dc-86ef-00e08156aaa2")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(43), SubLObjectFactory.makeInteger(105), SubLObjectFactory.makeInteger(236), SubLObjectFactory.makeInteger(232), SubLObjectFactory.makeInteger(43), SubLObjectFactory.makeInteger(66), SubLObjectFactory.makeInteger(36), SubLObjectFactory.makeInteger(64), SubLObjectFactory.makeInteger(214), SubLObjectFactory.makeInteger(143), SubLObjectFactory.makeInteger(85), SubLObjectFactory.makeInteger(38), SubLObjectFactory.makeInteger(139), SubLObjectFactory.makeInteger(233), SubLObjectFactory.makeInteger(123), SubLObjectFactory.makeInteger(164), SubLObjectFactory.makeInteger(231) })), (SubLObject)SubLObjectFactory.makeGuid("69ece82b-4224-40d6-8f55-268be97ba4e7")));
    }
    
    public static final class $f22663$UnaryFunction extends UnaryFunction
    {
        public $f22663$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25269"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0338.f22663(var12);
        }
    }
    
    public static final class $f22674$UnaryFunction extends UnaryFunction
    {
        public $f22674$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25270"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0338.f22674(var12);
        }
    }
    
    public static final class $f22684$UnaryFunction extends UnaryFunction
    {
        public $f22684$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25271"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0338.f22684(var12);
        }
    }
    
    public static final class $f22694$UnaryFunction extends UnaryFunction
    {
        public $f22694$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25272"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0338.f22694(var12);
        }
    }
    
    public static final class $f22704$UnaryFunction extends UnaryFunction
    {
        public $f22704$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25273"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0338.f22704(var12);
        }
    }
    
    public static final class $f22714$UnaryFunction extends UnaryFunction
    {
        public $f22714$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25274"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0338.f22714(var12);
        }
    }
    
    public static final class $f22721$UnaryFunction extends UnaryFunction
    {
        public $f22721$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25275"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0338.f22721(var12);
        }
    }
    
    public static final class $f22725$UnaryFunction extends UnaryFunction
    {
        public $f22725$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25276"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0338.f22725(var12);
        }
    }
    
    public static final class $f22728$UnaryFunction extends UnaryFunction
    {
        public $f22728$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25277"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0338.f22728(var12);
        }
    }
    
    public static final class $f22729$UnaryFunction extends UnaryFunction
    {
        public $f22729$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25278"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0338.f22729(var12);
        }
    }
    
    public static final class $f22730$UnaryFunction extends UnaryFunction
    {
        public $f22730$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25279"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0338.f22730(var12);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0338.class
	Total time: 320 ms
	
	Decompiled with Procyon 0.5.32.
*/