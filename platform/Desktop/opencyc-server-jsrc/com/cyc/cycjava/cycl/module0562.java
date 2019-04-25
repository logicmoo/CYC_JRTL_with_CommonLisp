package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0562 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0562";
    public static final String myFingerPrint = "e5b37a201907dda254245f4ed8fb1c0f4ef52d6c8c809402751533513ceda69a";
    public static SubLSymbol $g4090$;
    private static SubLSymbol $g4091$;
    private static SubLSymbol $g4092$;
    public static SubLSymbol $g4093$;
    public static SubLSymbol $g4094$;
    public static SubLSymbol $g4096$;
    public static SubLSymbol $g4097$;
    private static SubLSymbol $g4098$;
    private static SubLSymbol $g4099$;
    private static SubLSymbol $g4100$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLInteger $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
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
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLList $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLList $ic60$;
    private static final SubLList $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLString $ic63$;
    private static final SubLList $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLList $ic78$;
    private static final SubLString $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLString $ic84$;
    private static final SubLObject $ic85$;
    private static final SubLObject $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLList $ic100$;
    private static final SubLString $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLObject $ic105$;
    private static final SubLObject $ic106$;
    private static final SubLObject $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLObject $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLObject $ic121$;
    private static final SubLString $ic122$;
    private static final SubLObject $ic123$;
    private static final SubLString $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLObject $ic127$;
    private static final SubLObject $ic128$;
    private static final SubLObject $ic129$;
    private static final SubLObject $ic130$;
    private static final SubLObject $ic131$;
    private static final SubLObject $ic132$;
    private static final SubLObject $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLObject $ic135$;
    private static final SubLObject $ic136$;
    private static final SubLObject $ic137$;
    private static final SubLObject $ic138$;
    private static final SubLObject $ic139$;
    private static final SubLObject $ic140$;
    private static final SubLObject $ic141$;
    private static final SubLObject $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    private static final SubLList $ic147$;
    private static final SubLList $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLObject $ic154$;
    private static final SubLString $ic155$;
    private static final SubLObject $ic156$;
    private static final SubLObject $ic157$;
    private static final SubLObject $ic158$;
    private static final SubLObject $ic159$;
    private static final SubLObject $ic160$;
    private static final SubLObject $ic161$;
    private static final SubLList $ic162$;
    private static final SubLString $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    
    public static SubLObject f34620(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0562.UNPROVIDED) {
            var3 = (SubLObject)module0562.NIL;
        }
        assert module0562.NIL != module0038.f2653(var2) : var2;
        f34621(var3);
        return f34622(var1, var2, var3);
    }
    
    public static SubLObject f34623(final SubLObject var4, SubLObject var3) {
        if (var3 == module0562.UNPROVIDED) {
            var3 = (SubLObject)module0562.NIL;
        }
        f34621(var3);
        module0619.f38189(var4);
        return var4;
    }
    
    public static SubLObject f34622(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0562.UNPROVIDED) {
            var3 = (SubLObject)module0562.NIL;
        }
        assert module0562.NIL != module0038.f2653(var2) : var2;
        f34624();
        f34625(var1, var2, var3);
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34621(SubLObject var3) {
        if (var3 == module0562.UNPROVIDED) {
            var3 = (SubLObject)module0562.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0562.NIL == f34626()) {
            Errors.cerror((SubLObject)module0562.$ic1$, (SubLObject)module0562.$ic2$);
        }
        module0740.f45866();
        module0563.f34784();
        module0563.f34779((SubLObject)module0562.UNPROVIDED);
        if (module0562.NIL != module0038.f2653(var3) && module0562.NIL != Filesys.probe_file(var3)) {
            module0559.f34428(var3, (SubLObject)module0562.UNPROVIDED);
        }
        return module0562.$g4090$.getDynamicValue(var4);
    }
    
    public static SubLObject f34624() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0562.NIL == module0563.f34731()) {
            module0563.f34785();
        }
        module0563.f34788();
        module0564.f34802();
        module0563.f34786();
        module0563.f34789();
        module0563.f34787();
        module0564.f34808();
        return module0562.$g4090$.getDynamicValue(var5);
    }
    
    public static SubLObject f34625(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0562.UNPROVIDED) {
            var3 = (SubLObject)module0562.NIL;
        }
        module0565.f34844(var2);
        if (var3.isString() && module0562.NIL == Filesys.probe_file(var3)) {
            module0565.f34853(var3);
        }
        f34627(f34628(), var1);
        return var1;
    }
    
    public static SubLObject f34629(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0213.f13889((SubLObject)module0562.$ic3$);
        module0213.f13887();
        module0255.f16518((SubLObject)module0562.UNPROVIDED);
        final SubLObject var4 = module0559.$g4062$.currentBinding(var3);
        try {
            module0559.$g4062$.bind((SubLObject)module0562.$ic4$, var3);
            module0565.f34845(var2);
        }
        finally {
            module0559.$g4062$.rebind(var4, var3);
        }
        module0018.f969((SubLObject)module0562.ONE_INTEGER);
        module0213.f13887();
        oc_dumper.f37978();
        oc_dumper.f37988();
        module0183.f11627((SubLObject)module0562.UNPROVIDED);
        oc_dumper.f38019((SubLObject)module0562.UNPROVIDED);
        f34630(f34628(), var1);
        module0565.f34849();
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34631() {
        return module0566.f34860();
    }
    
    public static SubLObject f34632() {
        module0268.f17651();
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34626() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0562.T;
        if (module0562.NIL == module0562.$g4090$.getDynamicValue(var5)) {
            Errors.warn((SubLObject)module0562.$ic7$);
            var6 = (SubLObject)module0562.NIL;
        }
        else if (module0562.NIL != module0035.f2327(module0562.$g4090$.getDynamicValue(var5))) {
            SubLObject var7;
            SubLObject var8;
            SubLObject var9;
            for (var7 = (SubLObject)module0562.NIL, var7 = module0562.$g4090$.getDynamicValue(var5); module0562.NIL != var7; var7 = conses_high.cddr(var7)) {
                var8 = var7.first();
                var9 = conses_high.cadr(var7);
                if (module0562.NIL == module0004.f104(var8, module0562.$g4091$.getGlobalValue(), (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED)) {
                    Errors.warn((SubLObject)module0562.$ic8$, var8);
                    var6 = (SubLObject)module0562.NIL;
                }
                if (var8 == module0562.$ic9$ && module0562.NIL == f34633(var9)) {
                    var6 = (SubLObject)module0562.NIL;
                }
            }
        }
        else {
            Errors.warn((SubLObject)module0562.$ic10$);
            var6 = (SubLObject)module0562.NIL;
        }
        return var6;
    }
    
    public static SubLObject f34634() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return conses_high.getf(module0562.$g4090$.getDynamicValue(var5), (SubLObject)module0562.$ic11$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34635() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return conses_high.getf(module0562.$g4090$.getDynamicValue(var5), (SubLObject)module0562.$ic9$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34636() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return conses_high.getf(module0562.$g4090$.getDynamicValue(var5), (SubLObject)module0562.$ic12$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34637() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return conses_high.getf(module0562.$g4090$.getDynamicValue(var5), (SubLObject)module0562.$ic13$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34638() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return conses_high.getf(module0562.$g4090$.getDynamicValue(var5), (SubLObject)module0562.$ic14$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34639() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return conses_high.getf(module0562.$g4090$.getDynamicValue(var5), (SubLObject)module0562.$ic15$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34628() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return conses_high.getf(module0562.$g4090$.getDynamicValue(var5), (SubLObject)module0562.$ic16$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34633(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0562.T;
        if (module0562.NIL != module0035.f2013(var11)) {
            SubLObject var14 = var11;
            SubLObject var15 = (SubLObject)module0562.NIL;
            var15 = var14.first();
            while (module0562.NIL != var14) {
                if (module0562.NIL != module0035.f2327(var15)) {
                    SubLObject var16;
                    SubLObject var17;
                    SubLObject var18;
                    for (var16 = (SubLObject)module0562.NIL, var16 = var15; module0562.NIL != var16; var16 = conses_high.cddr(var16)) {
                        var17 = var16.first();
                        var18 = conses_high.cadr(var16);
                        if (module0562.NIL == module0004.f104(var17, module0562.$g4092$.getDynamicValue(var12), (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED)) {
                            Errors.warn((SubLObject)module0562.$ic17$, var17);
                            var13 = (SubLObject)module0562.NIL;
                        }
                    }
                }
                else {
                    Errors.warn((SubLObject)module0562.$ic18$, var15);
                    var13 = (SubLObject)module0562.NIL;
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
        }
        else {
            Errors.warn((SubLObject)module0562.$ic19$);
            var13 = (SubLObject)module0562.NIL;
        }
        return var13;
    }
    
    public static SubLObject f34640(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0562.$ic20$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)module0562.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0562.$ic20$);
        var19 = var17.first();
        var17 = var17.rest();
        if (module0562.NIL == var17) {
            final SubLObject var20;
            var17 = (var20 = var18);
            return (SubLObject)ConsesLow.listS((SubLObject)module0562.$ic21$, reader.bq_cons(var19, (SubLObject)module0562.$ic22$), ConsesLow.append(var20, (SubLObject)module0562.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0562.$ic20$);
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34641(final SubLObject var19) {
        return conses_high.getf(var19, (SubLObject)module0562.$ic23$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34642(final SubLObject var19) {
        return conses_high.getf(var19, (SubLObject)module0562.$ic24$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34643(final SubLObject var19) {
        return conses_high.getf(var19, (SubLObject)module0562.$ic25$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34644(final SubLObject var19) {
        return conses_high.getf(var19, (SubLObject)module0562.$ic26$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34645(final SubLObject var19) {
        return conses_high.getf(var19, (SubLObject)module0562.$ic27$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34646(final SubLObject var19) {
        return conses_high.getf(var19, (SubLObject)module0562.$ic28$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34647(final SubLObject var19) {
        return conses_high.getf(var19, (SubLObject)module0562.$ic29$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34648(final SubLObject var19) {
        return conses_high.getf(var19, (SubLObject)module0562.$ic30$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34649(final SubLObject var19) {
        return conses_high.getf(var19, (SubLObject)module0562.$ic31$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34650(final SubLObject var19) {
        return conses_high.getf(var19, (SubLObject)module0562.$ic32$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34651(final SubLObject var19) {
        return conses_high.getf(var19, (SubLObject)module0562.$ic33$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34652(final SubLObject var19) {
        return conses_high.getf(var19, (SubLObject)module0562.$ic34$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34627(final SubLObject var21, final SubLObject var22) {
        SubLObject var23 = var21;
        SubLObject var24 = (SubLObject)module0562.NIL;
        var24 = var23.first();
        while (module0562.NIL != var23) {
            final SubLObject var25 = var24;
            if (var25.eql((SubLObject)module0562.$ic35$)) {
                oc_dumper.f38079(var22, (SubLObject)module0562.NIL);
            }
            else if (var25.eql((SubLObject)module0562.$ic36$)) {
                module0243.f15707(var22, (SubLObject)module0562.$ic37$);
            }
            else {
                Errors.error((SubLObject)module0562.$ic38$, var24);
            }
            var23 = var23.rest();
            var24 = var23.first();
        }
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34630(final SubLObject var21, final SubLObject var22) {
        SubLObject var23 = var21;
        SubLObject var24 = (SubLObject)module0562.NIL;
        var24 = var23.first();
        while (module0562.NIL != var23) {
            final SubLObject var25 = var24;
            if (var25.eql((SubLObject)module0562.$ic35$)) {
                oc_dumper.f38080(var22);
            }
            else if (var25.eql((SubLObject)module0562.$ic36$)) {
                module0243.f15705(var22);
            }
            else {
                Errors.warn((SubLObject)module0562.$ic39$, var24);
            }
            var23 = var23.rest();
            var24 = var23.first();
        }
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34653() {
        f34654();
        final SubLObject var25 = f34655();
        final SubLObject var26 = f34656(var25);
        module0564.f34837(var26);
        return (SubLObject)module0562.T;
    }
    
    public static SubLObject f34655() {
        final SubLObject var25 = f34657();
        final SubLObject var26 = f34658();
        module0564.f34829(var26, var25);
        module0083.f5700(var25, (SubLObject)module0562.UNPROVIDED);
        return var25;
    }
    
    public static SubLObject f34658() {
        if (module0562.NIL != module0604.f36897(module0562.$g4093$.getGlobalValue())) {
            final SubLObject var28 = module0562.$g4093$.getGlobalValue();
            return module0604.f36955(module0604.f36925(var28, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED));
        }
        return module0052.f3709(module0564.f34825());
    }
    
    public static SubLObject f34659(SubLObject var29, SubLObject var30) {
        if (var29 == module0562.UNPROVIDED) {
            var29 = (SubLObject)module0562.NIL;
        }
        if (var30 == module0562.UNPROVIDED) {
            var30 = module0052.$g1013$.getGlobalValue();
        }
        if (module0562.NIL != module0604.f36897(module0562.$g4094$.getGlobalValue())) {
            final SubLObject var31 = module0562.$g4094$.getGlobalValue();
            SubLObject var32 = module0604.f36929(var31, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
            var32 = module0604.f36944(var32, module0604.$g4095$.getGlobalValue(), (SubLObject)module0562.NIL);
            if (module0562.NIL != var29) {
                var32 = module0083.f5749(var32, var29, var30);
            }
            return var32;
        }
        return module0083.f5708((SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34660(final SubLObject var32, SubLObject var29, SubLObject var30) {
        if (var29 == module0562.UNPROVIDED) {
            var29 = (SubLObject)module0562.NIL;
        }
        if (var30 == module0562.UNPROVIDED) {
            var30 = module0052.$g1013$.getGlobalValue();
        }
        if (module0562.NIL != module0604.f36897(module0562.$g4094$.getGlobalValue())) {
            SubLObject var33 = module0604.f36925(module0562.$g4094$.getGlobalValue(), (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
            var33 = module0604.f36955(var33);
            if (module0562.NIL != var29) {
                var33 = module0052.f3791(var33, var29, var30);
            }
            return var33;
        }
        return module0083.f5702(var32);
    }
    
    public static SubLObject f34656(final SubLObject var32) {
        return f34660(var32, (SubLObject)module0562.$ic40$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34657() {
        return f34659((SubLObject)module0562.$ic41$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34654() {
        if (module0562.NIL != module0604.f36897(module0562.$g4093$.getGlobalValue())) {
            return f34661();
        }
        return (SubLObject)module0562.$ic42$;
    }
    
    public static SubLObject f34661() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0562.$g4093$.getGlobalValue();
        final SubLObject var7 = module0604.f36898(var6);
        if (module0562.NIL == Errors.$ignore_mustsP$.getDynamicValue(var5) && !var7.isZero()) {
            Errors.error((SubLObject)module0562.$ic43$, var7);
        }
        module0083.f5707(module0604.f36944(module0604.f36929(var6, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED), (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED), module0052.f3709(module0564.f34825()));
        return (SubLObject)module0562.$ic44$;
    }
    
    public static SubLObject f34662(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        SubLObject var37 = (SubLObject)module0562.NIL;
        SubLObject var38 = (SubLObject)module0562.NIL;
        SubLObject var39 = (SubLObject)module0562.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var35, (SubLObject)module0562.$ic45$);
        var37 = var35.first();
        SubLObject var40 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var35, (SubLObject)module0562.$ic45$);
        var38 = var40.first();
        var40 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var35, (SubLObject)module0562.$ic45$);
        var39 = var40.first();
        var40 = var40.rest();
        if (module0562.NIL == var40) {
            SubLObject var43_44;
            final SubLObject var41_42 = var43_44 = var37;
            SubLObject var41 = (SubLObject)module0562.NIL;
            SubLObject var42 = (SubLObject)module0562.NIL;
            SubLObject var43 = (SubLObject)module0562.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var43_44, var41_42, (SubLObject)module0562.$ic46$);
            var41 = var43_44.first();
            var43_44 = var43_44.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var43_44, var41_42, (SubLObject)module0562.$ic46$);
            var42 = var43_44.first();
            var43_44 = var43_44.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var43_44, var41_42, (SubLObject)module0562.$ic46$);
            var43 = var43_44.first();
            var43_44 = var43_44.rest();
            if (module0562.NIL == var43_44) {
                if (module0562.NIL == Errors.$ignore_mustsP$.getDynamicValue(var36) && !var41.eql(module0562.$ic47$)) {
                    Errors.error((SubLObject)module0562.$ic48$, var35);
                }
                final SubLObject var44 = Sequences.position(var39, module0130.$g1507$.getGlobalValue(), (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                if (module0562.NIL == Errors.$ignore_mustsP$.getDynamicValue(var36) && module0562.NIL == module0004.f106(var44)) {
                    Errors.error((SubLObject)module0562.$ic49$, var35, var39);
                }
                return (SubLObject)ConsesLow.list(var42, var43, var38, var44);
            }
            cdestructuring_bind.cdestructuring_bind_error(var41_42, (SubLObject)module0562.$ic46$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)module0562.$ic45$);
        }
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34663(final SubLObject var35) {
        SubLObject var36 = (SubLObject)module0562.NIL;
        SubLObject var37 = (SubLObject)module0562.NIL;
        SubLObject var38 = (SubLObject)module0562.NIL;
        SubLObject var39 = (SubLObject)module0562.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var35, (SubLObject)module0562.$ic50$);
        var36 = var35.first();
        SubLObject var40 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var35, (SubLObject)module0562.$ic50$);
        var37 = var40.first();
        var40 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var35, (SubLObject)module0562.$ic50$);
        var38 = var40.first();
        var40 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var35, (SubLObject)module0562.$ic50$);
        var39 = var40.first();
        var40 = var40.rest();
        if (module0562.NIL == var40) {
            return (SubLObject)ConsesLow.list(module0202.f12768(module0562.$ic47$, var36, var37), var38, ConsesLow.nth(var39, module0130.$g1507$.getGlobalValue()));
        }
        cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)module0562.$ic50$);
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34664() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0563.f34786();
        SubLObject var6 = (SubLObject)module0562.ZERO_INTEGER;
        SubLObject var7 = (SubLObject)module0562.ZERO_INTEGER;
        final SubLObject var8 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var9 = module0147.$g2095$.currentBinding(var5);
        try {
            module0147.$g2094$.bind((SubLObject)module0562.$ic51$, var5);
            module0147.$g2095$.bind(module0562.$ic52$, var5);
            final SubLObject var10 = (SubLObject)module0562.$ic53$;
            final SubLObject var11 = module0173.f10962();
            SubLObject var12 = (SubLObject)module0562.ZERO_INTEGER;
            final SubLObject var6_57 = module0012.$g75$.currentBinding(var5);
            final SubLObject var53_58 = module0012.$g76$.currentBinding(var5);
            final SubLObject var13 = module0012.$g77$.currentBinding(var5);
            final SubLObject var14 = module0012.$g78$.currentBinding(var5);
            try {
                module0012.$g75$.bind((SubLObject)module0562.ZERO_INTEGER, var5);
                module0012.$g76$.bind((SubLObject)module0562.NIL, var5);
                module0012.$g77$.bind((SubLObject)module0562.T, var5);
                module0012.$g78$.bind(Time.get_universal_time(), var5);
                module0012.f478(var10);
                SubLObject var15 = module0173.f10961();
                SubLObject var16 = (SubLObject)module0562.NIL;
                var16 = var15.first();
                while (module0562.NIL != var15) {
                    final SubLObject var17 = var16;
                    if (module0562.NIL == module0065.f4772(var17, (SubLObject)module0562.$ic54$)) {
                        final SubLObject var63_64 = var17;
                        if (module0562.NIL == module0065.f4775(var63_64, (SubLObject)module0562.$ic54$)) {
                            final SubLObject var18 = module0065.f4740(var63_64);
                            final SubLObject var19 = (SubLObject)module0562.NIL;
                            SubLObject var20;
                            SubLObject var21;
                            SubLObject var22;
                            SubLObject var23;
                            SubLObject var24;
                            SubLObject var25;
                            SubLObject var26;
                            SubLObject var27;
                            SubLObject var28;
                            SubLObject var29;
                            SubLObject var30;
                            SubLObject var73_78;
                            SubLObject var74_79;
                            SubLObject var31;
                            SubLObject var76_81;
                            SubLObject var6_58;
                            SubLObject var32;
                            SubLObject var33;
                            for (var20 = Sequences.length(var18), var21 = (SubLObject)module0562.NIL, var21 = (SubLObject)module0562.ZERO_INTEGER; var21.numL(var20); var21 = Numbers.add(var21, (SubLObject)module0562.ONE_INTEGER)) {
                                var22 = ((module0562.NIL != var19) ? Numbers.subtract(var20, var21, (SubLObject)module0562.ONE_INTEGER) : var21);
                                var23 = Vectors.aref(var18, var22);
                                if (module0562.NIL == module0065.f4749(var23) || module0562.NIL == module0065.f4773((SubLObject)module0562.$ic54$)) {
                                    if (module0562.NIL != module0065.f4749(var23)) {
                                        var23 = (SubLObject)module0562.$ic54$;
                                    }
                                    var12 = Numbers.add(var12, (SubLObject)module0562.ONE_INTEGER);
                                    module0012.note_percent_progress(var12, var11);
                                    if (module0562.NIL != module0563.f34732(var23)) {
                                        var24 = (SubLObject)module0562.NIL;
                                        if (module0562.NIL != module0158.f10282(var23, (SubLObject)module0562.NIL)) {
                                            var25 = module0158.f10283(var23, (SubLObject)module0562.NIL);
                                            var26 = var24;
                                            var27 = (SubLObject)module0562.NIL;
                                            while (module0562.NIL == var26) {
                                                var28 = module0052.f3695(var25, var27);
                                                var29 = (SubLObject)SubLObjectFactory.makeBoolean(!var27.eql(var28));
                                                if (module0562.NIL != var29) {
                                                    var30 = (SubLObject)module0562.NIL;
                                                    try {
                                                        var30 = module0158.f10316(var28, (SubLObject)module0562.NIL, (SubLObject)module0562.NIL, (SubLObject)module0562.NIL);
                                                        var73_78 = var24;
                                                        var74_79 = (SubLObject)module0562.NIL;
                                                        while (module0562.NIL == var73_78) {
                                                            var31 = module0052.f3695(var30, var74_79);
                                                            var76_81 = (SubLObject)SubLObjectFactory.makeBoolean(!var74_79.eql(var31));
                                                            if (module0562.NIL != var76_81 && module0562.NIL != module0158.f10284(var31, var28) && module0562.NIL == module0228.f15209(var31) && module0562.NIL != module0563.f34742(var31)) {
                                                                var24 = (SubLObject)module0562.T;
                                                            }
                                                            var73_78 = (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL == var76_81 || module0562.NIL != var24);
                                                        }
                                                    }
                                                    finally {
                                                        var6_58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0562.T, var5);
                                                            if (module0562.NIL != var30) {
                                                                module0158.f10319(var30);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var6_58, var5);
                                                        }
                                                    }
                                                }
                                                var26 = (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL == var29 || module0562.NIL != var24);
                                            }
                                        }
                                        if (module0562.NIL == var24) {
                                            PrintLow.format((SubLObject)module0562.T, (SubLObject)module0562.$ic55$, var23);
                                            streams_high.force_output((SubLObject)module0562.UNPROVIDED);
                                            var5.resetMultipleValues();
                                            var32 = module0563.f34741(var23);
                                            var33 = var5.secondMultipleValue();
                                            var5.resetMultipleValues();
                                            var6 = Numbers.add(var6, var32);
                                            var7 = Numbers.add(var7, var33);
                                        }
                                    }
                                }
                            }
                        }
                        final SubLObject var85_86 = var17;
                        if (module0562.NIL == module0065.f4777(var85_86) || module0562.NIL == module0065.f4773((SubLObject)module0562.$ic54$)) {
                            final SubLObject var34 = module0065.f4738(var85_86);
                            SubLObject var35 = module0065.f4739(var85_86);
                            final SubLObject var36 = module0065.f4734(var85_86);
                            final SubLObject var37 = (SubLObject)((module0562.NIL != module0065.f4773((SubLObject)module0562.$ic54$)) ? module0562.NIL : module0562.$ic54$);
                            while (var35.numL(var36)) {
                                final SubLObject var38 = Hashtables.gethash_without_values(var35, var34, var37);
                                if (module0562.NIL == module0065.f4773((SubLObject)module0562.$ic54$) || module0562.NIL == module0065.f4749(var38)) {
                                    var12 = Numbers.add(var12, (SubLObject)module0562.ONE_INTEGER);
                                    module0012.note_percent_progress(var12, var11);
                                    if (module0562.NIL != module0563.f34732(var38)) {
                                        SubLObject var39 = (SubLObject)module0562.NIL;
                                        if (module0562.NIL != module0158.f10282(var38, (SubLObject)module0562.NIL)) {
                                            final SubLObject var40 = module0158.f10283(var38, (SubLObject)module0562.NIL);
                                            SubLObject var41 = var39;
                                            final SubLObject var42 = (SubLObject)module0562.NIL;
                                            while (module0562.NIL == var41) {
                                                final SubLObject var43 = module0052.f3695(var40, var42);
                                                final SubLObject var44 = (SubLObject)SubLObjectFactory.makeBoolean(!var42.eql(var43));
                                                if (module0562.NIL != var44) {
                                                    SubLObject var45 = (SubLObject)module0562.NIL;
                                                    try {
                                                        var45 = module0158.f10316(var43, (SubLObject)module0562.NIL, (SubLObject)module0562.NIL, (SubLObject)module0562.NIL);
                                                        SubLObject var73_79 = var39;
                                                        final SubLObject var74_80 = (SubLObject)module0562.NIL;
                                                        while (module0562.NIL == var73_79) {
                                                            final SubLObject var46 = module0052.f3695(var45, var74_80);
                                                            final SubLObject var76_82 = (SubLObject)SubLObjectFactory.makeBoolean(!var74_80.eql(var46));
                                                            if (module0562.NIL != var76_82 && module0562.NIL != module0158.f10284(var46, var43) && module0562.NIL == module0228.f15209(var46) && module0562.NIL != module0563.f34742(var46)) {
                                                                var39 = (SubLObject)module0562.T;
                                                            }
                                                            var73_79 = (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL == var76_82 || module0562.NIL != var39);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var6_59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0562.T, var5);
                                                            if (module0562.NIL != var45) {
                                                                module0158.f10319(var45);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var6_59, var5);
                                                        }
                                                    }
                                                }
                                                var41 = (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL == var44 || module0562.NIL != var39);
                                            }
                                        }
                                        if (module0562.NIL == var39) {
                                            PrintLow.format((SubLObject)module0562.T, (SubLObject)module0562.$ic55$, var38);
                                            streams_high.force_output((SubLObject)module0562.UNPROVIDED);
                                            var5.resetMultipleValues();
                                            final SubLObject var47 = module0563.f34741(var38);
                                            final SubLObject var48 = var5.secondMultipleValue();
                                            var5.resetMultipleValues();
                                            var6 = Numbers.add(var6, var47);
                                            var7 = Numbers.add(var7, var48);
                                        }
                                    }
                                }
                                var35 = Numbers.add(var35, (SubLObject)module0562.ONE_INTEGER);
                            }
                        }
                    }
                    var15 = var15.rest();
                    var16 = var15.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var14, var5);
                module0012.$g77$.rebind(var13, var5);
                module0012.$g76$.rebind(var53_58, var5);
                module0012.$g75$.rebind(var6_57, var5);
            }
        }
        finally {
            module0147.$g2095$.rebind(var9, var5);
            module0147.$g2094$.rebind(var8, var5);
        }
        PrintLow.format((SubLObject)module0562.T, (SubLObject)module0562.$ic56$, var6, var7);
        return Values.values(var6, var7);
    }
    
    public static SubLObject f34665() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL != module0604.f36897(module0562.$g4096$.getGlobalValue()) && module0562.NIL != module0604.f36897(module0562.$g4097$.getGlobalValue()));
    }
    
    public static SubLObject f34666() {
        final SubLObject var94 = f34667();
        final SubLObject var95 = f34668();
        if (module0562.NIL != f34665()) {
            f34669(var95);
            f34670();
            final SubLObject var96 = module0562.$g4097$.getGlobalValue();
            final SubLObject var97 = module0052.f3791(module0604.f36955(module0604.f36925(var96, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED)), (SubLObject)module0562.$ic57$, (SubLObject)module0562.UNPROVIDED);
            module0083.f5707(var94, var97);
            return (SubLObject)module0562.NIL;
        }
        f34671(var94, var95);
        return module0083.f5695(var94);
    }
    
    public static SubLObject f34670() {
        final SubLObject var97 = module0562.$g4096$.getGlobalValue();
        final SubLObject var98 = module0562.$g4097$.getGlobalValue();
        final SubLObject var99 = module0604.f36955(module0604.f36925(var97, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED));
        final SubLObject var100 = module0083.f5749(module0604.f36944(module0604.f36929(var98, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED), (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED), (SubLObject)module0562.$ic58$, (SubLObject)module0562.UNPROVIDED);
        f34671(var100, var99);
        return var100;
    }
    
    public static SubLObject f34669(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = module0562.$g4096$.getGlobalValue();
        final SubLObject var30 = module0604.f36898(var29);
        if (module0562.NIL == Errors.$ignore_mustsP$.getDynamicValue(var28) && !var30.isZero()) {
            Errors.error((SubLObject)module0562.$ic43$, var30);
        }
        final SubLObject var31 = module0604.f36944(module0604.f36929(var29, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED), (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
        module0083.f5707(var31, var27);
        return (SubLObject)module0562.$ic44$;
    }
    
    public static SubLObject f34672(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        SubLObject var101 = (SubLObject)module0562.NIL;
        SubLObject var102 = (SubLObject)module0562.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var99, var99, (SubLObject)module0562.$ic61$);
        var101 = var99.first();
        SubLObject var103 = var99.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var103, var99, (SubLObject)module0562.$ic61$);
        var102 = var103.first();
        var103 = var103.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var103, var99, (SubLObject)module0562.$ic61$);
        final SubLObject var104 = var103.rest();
        var103 = var103.first();
        SubLObject var105 = (SubLObject)module0562.NIL;
        SubLObject var106 = (SubLObject)module0562.NIL;
        SubLObject var107 = (SubLObject)module0562.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var103, var99, (SubLObject)module0562.$ic61$);
        var105 = var103.first();
        var103 = var103.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var103, var99, (SubLObject)module0562.$ic61$);
        var106 = var103.first();
        var103 = var103.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var103, var99, (SubLObject)module0562.$ic61$);
        var107 = var103.first();
        var103 = var103.rest();
        if (module0562.NIL == var103) {
            var103 = var104;
            if (module0562.NIL == var103) {
                if (module0562.NIL == Errors.$ignore_mustsP$.getDynamicValue(var100) && !module0562.$ic62$.eql(var101)) {
                    Errors.error((SubLObject)module0562.$ic63$, var99);
                }
                final SubLObject var108 = Sequences.position(var102, module0562.$g4099$.getGlobalValue(), (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                final SubLObject var109 = Sequences.position(var105, module0562.$g4098$.getGlobalValue(), (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                return (SubLObject)ConsesLow.list((module0562.NIL == var108) ? var102 : var108, (module0562.NIL == var109) ? var105 : var109, var106, var107);
            }
            cdestructuring_bind.cdestructuring_bind_error(var99, (SubLObject)module0562.$ic61$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var99, (SubLObject)module0562.$ic61$);
        }
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34673(final SubLObject var109) {
        SubLObject var110 = (SubLObject)module0562.NIL;
        SubLObject var111 = (SubLObject)module0562.NIL;
        SubLObject var112 = (SubLObject)module0562.NIL;
        SubLObject var113 = (SubLObject)module0562.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var109, var109, (SubLObject)module0562.$ic64$);
        var110 = var109.first();
        SubLObject var114 = var109.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var114, var109, (SubLObject)module0562.$ic64$);
        var111 = var114.first();
        var114 = var114.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var114, var109, (SubLObject)module0562.$ic64$);
        var112 = var114.first();
        var114 = var114.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var114, var109, (SubLObject)module0562.$ic64$);
        var113 = var114.first();
        var114 = var114.rest();
        if (module0562.NIL == var114) {
            final SubLObject var115 = var110.isNumber() ? ConsesLow.nth(var110, module0562.$g4099$.getGlobalValue()) : var110;
            final SubLObject var116 = var111.isNumber() ? ConsesLow.nth(var111, module0562.$g4098$.getGlobalValue()) : var111;
            return module0202.f12768(module0562.$ic62$, var115, module0202.f12768(var116, var112, var113));
        }
        cdestructuring_bind.cdestructuring_bind_error(var109, (SubLObject)module0562.$ic64$);
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34671(final SubLObject var98, final SubLObject var33) {
        final SubLObject var99 = module0563.f34792();
        final SubLObject var100 = Sequences.cconcatenate((SubLObject)module0562.$ic65$, new SubLObject[] { module0006.f203(var99), module0562.$ic66$ });
        module0751.f47229(var33, var98, var100, var99, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
        return module0083.f5695(var98);
    }
    
    public static SubLObject f34668() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0562.NIL == Errors.$ignore_mustsP$.getDynamicValue(var5) && module0562.NIL == module0563.f34731()) {
            Errors.error((SubLObject)module0562.$ic67$);
        }
        return module0052.f3781(module0052.f3709(module0563.f34731()), (SubLObject)module0562.$ic68$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34674(final SubLObject var70) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL == module0210.f13584(var70));
    }
    
    public static SubLObject f34667() {
        return module0083.f5696((SubLObject)module0562.ZERO_INTEGER, (SubLObject)module0562.$ic69$, (SubLObject)module0562.$ic70$, (SubLObject)module0562.$ic71$, (SubLObject)module0562.$ic72$, (SubLObject)module0562.$ic73$, (SubLObject)module0562.UNPROVIDED);
    }
    
    public static SubLObject f34675(final SubLObject var114) {
        Errors.error((SubLObject)module0562.$ic74$);
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34676(final SubLObject var115, final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        assert module0562.NIL != module0202.f12883(var116, (SubLObject)module0562.UNPROVIDED) : var116;
        final SubLObject var118 = module0343.$g2954$.currentBinding(var117);
        try {
            module0343.$g2954$.bind((SubLObject)module0562.T, var117);
            module0540.f33517(var116, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
        }
        finally {
            module0343.$g2954$.rebind(var118, var117);
        }
        return module0048.f_1X(var115);
    }
    
    public static SubLObject f34677(final SubLObject var115) {
        return var115;
    }
    
    public static SubLObject f34678(final SubLObject var115, SubLObject var117) {
        if (var117 == module0562.UNPROVIDED) {
            var117 = (SubLObject)module0562.NIL;
        }
        Errors.error((SubLObject)module0562.$ic76$);
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34679(final SubLObject var115) {
        Errors.error((SubLObject)module0562.$ic77$);
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34680() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0562.ZERO_INTEGER;
        SubLObject var7 = (SubLObject)module0562.ZERO_INTEGER;
        SubLObject var8 = (SubLObject)module0562.MINUS_ONE_INTEGER;
        final SubLObject var9 = (module0562.NIL != constants_high_oc.f10737((SubLObject)module0562.$ic79$)) ? module0259.f16847(constants_high_oc.f10737((SubLObject)module0562.$ic79$)) : module0172.f10922(module0562.$g4100$.getGlobalValue());
        while (module0562.NIL != module0004.f109(var8)) {
            var8 = (SubLObject)module0562.ZERO_INTEGER;
            final SubLObject var10 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var11 = module0147.$g2095$.currentBinding(var5);
            try {
                module0147.$g2094$.bind((SubLObject)module0562.$ic51$, var5);
                module0147.$g2095$.bind(module0562.$ic52$, var5);
                var7 = Numbers.add(var7, (SubLObject)module0562.ONE_INTEGER);
                final SubLObject var12 = module0219.f14512(module0562.$ic80$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                module0012.$g82$.setDynamicValue(Sequences.cconcatenate((SubLObject)module0562.$ic81$, new SubLObject[] { module0006.f203(var7), module0562.$ic82$ }), var5);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var5);
                module0012.$g83$.setDynamicValue(Sequences.length(var12), var5);
                module0012.$g84$.setDynamicValue((SubLObject)module0562.ZERO_INTEGER, var5);
                final SubLObject var6_123 = module0012.$g75$.currentBinding(var5);
                final SubLObject var53_124 = module0012.$g76$.currentBinding(var5);
                final SubLObject var13 = module0012.$g77$.currentBinding(var5);
                final SubLObject var14 = module0012.$g78$.currentBinding(var5);
                try {
                    module0012.$g75$.bind((SubLObject)module0562.ZERO_INTEGER, var5);
                    module0012.$g76$.bind((SubLObject)module0562.NIL, var5);
                    module0012.$g77$.bind((SubLObject)module0562.T, var5);
                    module0012.$g78$.bind(Time.get_universal_time(), var5);
                    module0012.f478(module0012.$g82$.getDynamicValue(var5));
                    SubLObject var15 = var12;
                    SubLObject var16 = (SubLObject)module0562.NIL;
                    var16 = var15.first();
                    while (module0562.NIL != var15) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var5), module0012.$g83$.getDynamicValue(var5));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var5), (SubLObject)module0562.ONE_INTEGER), var5);
                        if (module0562.NIL != f34681(var16, var9)) {
                            var6 = Numbers.add(var6, (SubLObject)module0562.ONE_INTEGER);
                            var8 = Numbers.add(var8, (SubLObject)module0562.ONE_INTEGER);
                        }
                        var15 = var15.rest();
                        var16 = var15.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var14, var5);
                    module0012.$g77$.rebind(var13, var5);
                    module0012.$g76$.rebind(var53_124, var5);
                    module0012.$g75$.rebind(var6_123, var5);
                }
            }
            finally {
                module0147.$g2095$.rebind(var11, var5);
                module0147.$g2094$.rebind(var10, var5);
            }
        }
        return var6;
    }
    
    public static SubLObject f34681(final SubLObject var126, final SubLObject var121) {
        if (module0562.NIL != assertion_handles_oc.f11041(var126, (SubLObject)module0562.UNPROVIDED)) {
            final SubLObject var127 = module0178.f11335(var126);
            if (module0562.NIL == module0035.f2169(var127, var121) && module0562.NIL != ((module0562.NIL == module0178.f11375(var126)) ? module0540.f33522(module0290.f19497(var126), module0178.f11287(var126)) : module0540.f33518(module0290.f19497(var126), module0178.f11287(var126)))) {
                return (SubLObject)module0562.T;
            }
        }
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34682() {
        module0322.f21764(module0562.$ic83$, (SubLObject)module0562.ONE_INTEGER);
        return (SubLObject)module0562.T;
    }
    
    public static SubLObject f34683() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)module0562.T, (SubLObject)module0562.$ic84$);
        final SubLObject var6 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var7 = module0147.$g2095$.currentBinding(var5);
        try {
            module0147.$g2094$.bind((SubLObject)module0562.$ic51$, var5);
            module0147.$g2095$.bind(module0562.$ic52$, var5);
            SubLObject var8 = module0562.$ic85$;
            final SubLObject var6_129 = module0137.$g1605$.currentBinding(var5);
            final SubLObject var53_130 = module0139.$g1636$.currentBinding(var5);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0562.$ic86$), var5);
                module0139.$g1636$.bind(module0139.f9007(), var5);
                SubLObject var131_132 = var8;
                final SubLObject var9 = (SubLObject)module0562.$ic89$;
                final SubLObject var10 = module0056.f4145(var9);
                final SubLObject var6_130 = module0139.$g1635$.currentBinding(var5);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var5);
                    final SubLObject var11 = (SubLObject)module0562.NIL;
                    final SubLObject var6_131 = module0141.$g1714$.currentBinding(var5);
                    final SubLObject var53_131 = module0141.$g1715$.currentBinding(var5);
                    try {
                        module0141.$g1714$.bind((module0562.NIL != var11) ? var11 : module0141.f9283(), var5);
                        module0141.$g1715$.bind((SubLObject)((module0562.NIL != var11) ? module0562.$ic90$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                        if (module0562.NIL != var11 && module0562.NIL != module0136.f8864() && module0562.NIL == module0141.f9279(var11)) {
                            final SubLObject var12 = module0136.$g1591$.getDynamicValue(var5);
                            if (var12.eql((SubLObject)module0562.$ic91$)) {
                                module0136.f8870((SubLObject)module0562.ONE_INTEGER, (SubLObject)module0562.$ic92$, var11, (SubLObject)module0562.$ic93$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                            }
                            else if (var12.eql((SubLObject)module0562.$ic94$)) {
                                module0136.f8871((SubLObject)module0562.ONE_INTEGER, (SubLObject)module0562.$ic95$, (SubLObject)module0562.$ic92$, var11, (SubLObject)module0562.$ic93$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                            }
                            else if (var12.eql((SubLObject)module0562.$ic96$)) {
                                Errors.warn((SubLObject)module0562.$ic92$, var11, (SubLObject)module0562.$ic93$);
                            }
                            else {
                                Errors.warn((SubLObject)module0562.$ic97$, module0136.$g1591$.getDynamicValue(var5));
                                Errors.cerror((SubLObject)module0562.$ic95$, (SubLObject)module0562.$ic92$, var11, (SubLObject)module0562.$ic93$);
                            }
                        }
                        final SubLObject var6_132 = module0141.$g1670$.currentBinding(var5);
                        final SubLObject var53_132 = module0141.$g1671$.currentBinding(var5);
                        final SubLObject var13 = module0141.$g1672$.currentBinding(var5);
                        final SubLObject var14 = module0141.$g1674$.currentBinding(var5);
                        final SubLObject var15 = module0137.$g1605$.currentBinding(var5);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0562.$ic86$)), var5);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0562.$ic86$))), var5);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0562.$ic86$))), var5);
                            module0141.$g1674$.bind((SubLObject)module0562.NIL, var5);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0562.$ic86$)), var5);
                            if (module0562.NIL != module0136.f8865() || module0562.NIL != module0244.f15795(var8, module0137.f8955((SubLObject)module0562.UNPROVIDED))) {
                                final SubLObject var6_133 = module0141.$g1677$.currentBinding(var5);
                                final SubLObject var53_133 = module0138.$g1619$.currentBinding(var5);
                                final SubLObject var59_144 = module0141.$g1674$.currentBinding(var5);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var5);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0562.$ic86$))), var5);
                                    module0141.$g1674$.bind((SubLObject)module0562.NIL, var5);
                                    module0249.f16055(var131_132, (SubLObject)module0562.UNPROVIDED);
                                    while (module0562.NIL != var131_132) {
                                        final SubLObject var16 = var131_132;
                                        SubLObject var18;
                                        final SubLObject var17 = var18 = module0200.f12443(module0137.f8955(module0562.$ic86$));
                                        SubLObject var19 = (SubLObject)module0562.NIL;
                                        var19 = var18.first();
                                        while (module0562.NIL != var18) {
                                            final SubLObject var6_134 = module0137.$g1605$.currentBinding(var5);
                                            final SubLObject var53_134 = module0141.$g1674$.currentBinding(var5);
                                            try {
                                                module0137.$g1605$.bind(var19, var5);
                                                module0141.$g1674$.bind((SubLObject)((module0562.NIL != module0141.f9205((SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0562.NIL == module0141.$g1674$.getDynamicValue(var5)) : module0141.$g1674$.getDynamicValue(var5)), var5);
                                                final SubLObject var20 = module0228.f15229(var16);
                                                if (module0562.NIL != module0138.f8992(var20)) {
                                                    final SubLObject var21 = module0242.f15664(var20, module0137.f8955((SubLObject)module0562.UNPROVIDED));
                                                    if (module0562.NIL != var21) {
                                                        final SubLObject var22 = module0245.f15834(var21, module0244.f15780(module0137.f8955(module0562.$ic86$)), module0137.f8955((SubLObject)module0562.UNPROVIDED));
                                                        if (module0562.NIL != var22) {
                                                            SubLObject var23;
                                                            for (var23 = module0066.f4838(module0067.f4891(var22)); module0562.NIL == module0066.f4841(var23); var23 = module0066.f4840(var23)) {
                                                                var5.resetMultipleValues();
                                                                final SubLObject var24 = module0066.f4839(var23);
                                                                final SubLObject var25 = var5.secondMultipleValue();
                                                                var5.resetMultipleValues();
                                                                if (module0562.NIL != module0147.f9507(var24)) {
                                                                    final SubLObject var6_135 = module0138.$g1623$.currentBinding(var5);
                                                                    try {
                                                                        module0138.$g1623$.bind(var24, var5);
                                                                        SubLObject var153_157;
                                                                        for (var153_157 = module0066.f4838(module0067.f4891(var25)); module0562.NIL == module0066.f4841(var153_157); var153_157 = module0066.f4840(var153_157)) {
                                                                            var5.resetMultipleValues();
                                                                            final SubLObject var26 = module0066.f4839(var153_157);
                                                                            final SubLObject var27 = var5.secondMultipleValue();
                                                                            var5.resetMultipleValues();
                                                                            if (module0562.NIL != module0141.f9289(var26)) {
                                                                                final SubLObject var6_136 = module0138.$g1624$.currentBinding(var5);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var26, var5);
                                                                                    final SubLObject var28 = var27;
                                                                                    if (module0562.NIL != module0077.f5302(var28)) {
                                                                                        final SubLObject var29 = module0077.f5333(var28);
                                                                                        SubLObject var30;
                                                                                        SubLObject var31;
                                                                                        SubLObject var32;
                                                                                        for (var30 = module0032.f1741(var29), var31 = (SubLObject)module0562.NIL, var31 = module0032.f1742(var30, var29); module0562.NIL == module0032.f1744(var30, var31); var31 = module0032.f1743(var31)) {
                                                                                            var32 = module0032.f1745(var30, var31);
                                                                                            if (module0562.NIL != module0032.f1746(var31, var32) && module0562.NIL == module0249.f16059(var32, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                                module0249.f16055(var32, module0139.$g1636$.getDynamicValue(var5));
                                                                                                if (module0562.NIL != module0173.f10955(var32)) {
                                                                                                    module0563.f34740(var32);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var28.isList()) {
                                                                                        SubLObject var33 = var28;
                                                                                        SubLObject var34 = (SubLObject)module0562.NIL;
                                                                                        var34 = var33.first();
                                                                                        while (module0562.NIL != var33) {
                                                                                            if (module0562.NIL == module0249.f16059(var34, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                                module0249.f16055(var34, module0139.$g1636$.getDynamicValue(var5));
                                                                                                if (module0562.NIL != module0173.f10955(var34)) {
                                                                                                    module0563.f34740(var34);
                                                                                                }
                                                                                            }
                                                                                            var33 = var33.rest();
                                                                                            var34 = var33.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0562.$ic98$, var28);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_136, var5);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var153_157);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_135, var5);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var23);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0562.FIVE_INTEGER, (SubLObject)module0562.$ic99$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                                                    }
                                                    if (module0562.NIL != module0200.f12419(var20, module0137.f8955((SubLObject)module0562.UNPROVIDED))) {
                                                        SubLObject var35 = module0248.f15995(var20);
                                                        SubLObject var36 = (SubLObject)module0562.NIL;
                                                        var36 = var35.first();
                                                        while (module0562.NIL != var35) {
                                                            SubLObject var38;
                                                            final SubLObject var37 = var38 = var36;
                                                            SubLObject var39 = (SubLObject)module0562.NIL;
                                                            SubLObject var40 = (SubLObject)module0562.NIL;
                                                            SubLObject var41 = (SubLObject)module0562.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0562.$ic100$);
                                                            var39 = var38.first();
                                                            var38 = var38.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0562.$ic100$);
                                                            var40 = var38.first();
                                                            var38 = var38.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0562.$ic100$);
                                                            var41 = var38.first();
                                                            var38 = var38.rest();
                                                            if (module0562.NIL == var38) {
                                                                if (module0562.NIL != module0147.f9507(var40)) {
                                                                    final SubLObject var6_137 = module0138.$g1623$.currentBinding(var5);
                                                                    try {
                                                                        module0138.$g1623$.bind(var40, var5);
                                                                        if (module0562.NIL != module0141.f9289(var41)) {
                                                                            final SubLObject var6_138 = module0138.$g1624$.currentBinding(var5);
                                                                            try {
                                                                                module0138.$g1624$.bind(var41, var5);
                                                                                final SubLObject var28;
                                                                                final SubLObject var42 = var28 = (SubLObject)ConsesLow.list(var39);
                                                                                if (module0562.NIL != module0077.f5302(var28)) {
                                                                                    final SubLObject var29 = module0077.f5333(var28);
                                                                                    SubLObject var30;
                                                                                    SubLObject var31;
                                                                                    SubLObject var32;
                                                                                    for (var30 = module0032.f1741(var29), var31 = (SubLObject)module0562.NIL, var31 = module0032.f1742(var30, var29); module0562.NIL == module0032.f1744(var30, var31); var31 = module0032.f1743(var31)) {
                                                                                        var32 = module0032.f1745(var30, var31);
                                                                                        if (module0562.NIL != module0032.f1746(var31, var32) && module0562.NIL == module0249.f16059(var32, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                            module0249.f16055(var32, module0139.$g1636$.getDynamicValue(var5));
                                                                                            if (module0562.NIL != module0173.f10955(var32)) {
                                                                                                module0563.f34740(var32);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var28.isList()) {
                                                                                    SubLObject var125_173 = var28;
                                                                                    SubLObject var34 = (SubLObject)module0562.NIL;
                                                                                    var34 = var125_173.first();
                                                                                    while (module0562.NIL != var125_173) {
                                                                                        if (module0562.NIL == module0249.f16059(var34, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                            module0249.f16055(var34, module0139.$g1636$.getDynamicValue(var5));
                                                                                            if (module0562.NIL != module0173.f10955(var34)) {
                                                                                                module0563.f34740(var34);
                                                                                            }
                                                                                        }
                                                                                        var125_173 = var125_173.rest();
                                                                                        var34 = var125_173.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0562.$ic98$, var28);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var6_138, var5);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_137, var5);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var37, (SubLObject)module0562.$ic100$);
                                                            }
                                                            var35 = var35.rest();
                                                            var36 = var35.first();
                                                        }
                                                    }
                                                }
                                                else if (module0562.NIL != module0155.f9785(var20, (SubLObject)module0562.UNPROVIDED)) {
                                                    SubLObject var12_175;
                                                    final SubLObject var43 = var12_175 = ((module0562.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0562.$ic86$)), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0562.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0562.$ic86$)), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0562.UNPROVIDED)));
                                                    SubLObject var44 = (SubLObject)module0562.NIL;
                                                    var44 = var12_175.first();
                                                    while (module0562.NIL != var12_175) {
                                                        final SubLObject var6_139 = module0138.$g1625$.currentBinding(var5);
                                                        try {
                                                            module0138.$g1625$.bind(var44, var5);
                                                            final SubLObject var46;
                                                            final SubLObject var45 = var46 = Functions.funcall(var44, var20);
                                                            if (module0562.NIL != module0077.f5302(var46)) {
                                                                final SubLObject var47 = module0077.f5333(var46);
                                                                SubLObject var48;
                                                                SubLObject var49;
                                                                SubLObject var50;
                                                                for (var48 = module0032.f1741(var47), var49 = (SubLObject)module0562.NIL, var49 = module0032.f1742(var48, var47); module0562.NIL == module0032.f1744(var48, var49); var49 = module0032.f1743(var49)) {
                                                                    var50 = module0032.f1745(var48, var49);
                                                                    if (module0562.NIL != module0032.f1746(var49, var50) && module0562.NIL == module0249.f16059(var50, module0139.$g1636$.getDynamicValue(var5))) {
                                                                        module0249.f16055(var50, module0139.$g1636$.getDynamicValue(var5));
                                                                        if (module0562.NIL != module0173.f10955(var50)) {
                                                                            module0563.f34740(var50);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var46.isList()) {
                                                                SubLObject var51 = var46;
                                                                SubLObject var52 = (SubLObject)module0562.NIL;
                                                                var52 = var51.first();
                                                                while (module0562.NIL != var51) {
                                                                    if (module0562.NIL == module0249.f16059(var52, module0139.$g1636$.getDynamicValue(var5))) {
                                                                        module0249.f16055(var52, module0139.$g1636$.getDynamicValue(var5));
                                                                        if (module0562.NIL != module0173.f10955(var52)) {
                                                                            module0563.f34740(var52);
                                                                        }
                                                                    }
                                                                    var51 = var51.rest();
                                                                    var52 = var51.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0562.$ic98$, var46);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_139, var5);
                                                        }
                                                        var12_175 = var12_175.rest();
                                                        var44 = var12_175.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var53_134, var5);
                                                module0137.$g1605$.rebind(var6_134, var5);
                                            }
                                            var18 = var18.rest();
                                            var19 = var18.first();
                                        }
                                        SubLObject var54;
                                        final SubLObject var53 = var54 = module0200.f12443(module0244.f15771(module0137.f8955(module0562.$ic86$)));
                                        SubLObject var55 = (SubLObject)module0562.NIL;
                                        var55 = var54.first();
                                        while (module0562.NIL != var54) {
                                            final SubLObject var6_140 = module0137.$g1605$.currentBinding(var5);
                                            final SubLObject var53_135 = module0141.$g1674$.currentBinding(var5);
                                            try {
                                                module0137.$g1605$.bind(var55, var5);
                                                module0141.$g1674$.bind((SubLObject)((module0562.NIL != module0141.f9205((SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0562.NIL == module0141.$g1674$.getDynamicValue(var5)) : module0141.$g1674$.getDynamicValue(var5)), var5);
                                                final SubLObject var56 = module0228.f15229(var131_132);
                                                if (module0562.NIL != module0138.f8992(var56)) {
                                                    final SubLObject var57 = module0242.f15664(var56, module0137.f8955((SubLObject)module0562.UNPROVIDED));
                                                    if (module0562.NIL != var57) {
                                                        final SubLObject var58 = module0245.f15834(var57, module0138.f8979(), module0137.f8955((SubLObject)module0562.UNPROVIDED));
                                                        if (module0562.NIL != var58) {
                                                            SubLObject var59;
                                                            for (var59 = module0066.f4838(module0067.f4891(var58)); module0562.NIL == module0066.f4841(var59); var59 = module0066.f4840(var59)) {
                                                                var5.resetMultipleValues();
                                                                final SubLObject var60 = module0066.f4839(var59);
                                                                final SubLObject var61 = var5.secondMultipleValue();
                                                                var5.resetMultipleValues();
                                                                if (module0562.NIL != module0147.f9507(var60)) {
                                                                    final SubLObject var6_141 = module0138.$g1623$.currentBinding(var5);
                                                                    try {
                                                                        module0138.$g1623$.bind(var60, var5);
                                                                        SubLObject var153_158;
                                                                        for (var153_158 = module0066.f4838(module0067.f4891(var61)); module0562.NIL == module0066.f4841(var153_158); var153_158 = module0066.f4840(var153_158)) {
                                                                            var5.resetMultipleValues();
                                                                            final SubLObject var62 = module0066.f4839(var153_158);
                                                                            final SubLObject var63 = var5.secondMultipleValue();
                                                                            var5.resetMultipleValues();
                                                                            if (module0562.NIL != module0141.f9289(var62)) {
                                                                                final SubLObject var6_142 = module0138.$g1624$.currentBinding(var5);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var62, var5);
                                                                                    final SubLObject var64 = var63;
                                                                                    if (module0562.NIL != module0077.f5302(var64)) {
                                                                                        final SubLObject var65 = module0077.f5333(var64);
                                                                                        SubLObject var66;
                                                                                        SubLObject var67;
                                                                                        SubLObject var68;
                                                                                        for (var66 = module0032.f1741(var65), var67 = (SubLObject)module0562.NIL, var67 = module0032.f1742(var66, var65); module0562.NIL == module0032.f1744(var66, var67); var67 = module0032.f1743(var67)) {
                                                                                            var68 = module0032.f1745(var66, var67);
                                                                                            if (module0562.NIL != module0032.f1746(var67, var68) && module0562.NIL == module0249.f16059(var68, (SubLObject)module0562.UNPROVIDED)) {
                                                                                                module0249.f16055(var68, (SubLObject)module0562.UNPROVIDED);
                                                                                                module0056.f4149(var68, var10);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var64.isList()) {
                                                                                        SubLObject var69 = var64;
                                                                                        SubLObject var70 = (SubLObject)module0562.NIL;
                                                                                        var70 = var69.first();
                                                                                        while (module0562.NIL != var69) {
                                                                                            if (module0562.NIL == module0249.f16059(var70, (SubLObject)module0562.UNPROVIDED)) {
                                                                                                module0249.f16055(var70, (SubLObject)module0562.UNPROVIDED);
                                                                                                module0056.f4149(var70, var10);
                                                                                            }
                                                                                            var69 = var69.rest();
                                                                                            var70 = var69.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0562.$ic98$, var64);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_142, var5);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var153_158);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_141, var5);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var59);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0562.FIVE_INTEGER, (SubLObject)module0562.$ic99$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0562.NIL != module0155.f9785(var56, (SubLObject)module0562.UNPROVIDED)) {
                                                    SubLObject var12_176;
                                                    final SubLObject var71 = var12_176 = ((module0562.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0562.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0562.UNPROVIDED)));
                                                    SubLObject var72 = (SubLObject)module0562.NIL;
                                                    var72 = var12_176.first();
                                                    while (module0562.NIL != var12_176) {
                                                        final SubLObject var6_143 = module0138.$g1625$.currentBinding(var5);
                                                        try {
                                                            module0138.$g1625$.bind(var72, var5);
                                                            final SubLObject var74;
                                                            final SubLObject var73 = var74 = Functions.funcall(var72, var56);
                                                            if (module0562.NIL != module0077.f5302(var74)) {
                                                                final SubLObject var75 = module0077.f5333(var74);
                                                                SubLObject var76;
                                                                SubLObject var77;
                                                                SubLObject var78;
                                                                for (var76 = module0032.f1741(var75), var77 = (SubLObject)module0562.NIL, var77 = module0032.f1742(var76, var75); module0562.NIL == module0032.f1744(var76, var77); var77 = module0032.f1743(var77)) {
                                                                    var78 = module0032.f1745(var76, var77);
                                                                    if (module0562.NIL != module0032.f1746(var77, var78) && module0562.NIL == module0249.f16059(var78, (SubLObject)module0562.UNPROVIDED)) {
                                                                        module0249.f16055(var78, (SubLObject)module0562.UNPROVIDED);
                                                                        module0056.f4149(var78, var10);
                                                                    }
                                                                }
                                                            }
                                                            else if (var74.isList()) {
                                                                SubLObject var79 = var74;
                                                                SubLObject var80 = (SubLObject)module0562.NIL;
                                                                var80 = var79.first();
                                                                while (module0562.NIL != var79) {
                                                                    if (module0562.NIL == module0249.f16059(var80, (SubLObject)module0562.UNPROVIDED)) {
                                                                        module0249.f16055(var80, (SubLObject)module0562.UNPROVIDED);
                                                                        module0056.f4149(var80, var10);
                                                                    }
                                                                    var79 = var79.rest();
                                                                    var80 = var79.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0562.$ic98$, var74);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_143, var5);
                                                        }
                                                        var12_176 = var12_176.rest();
                                                        var72 = var12_176.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var53_135, var5);
                                                module0137.$g1605$.rebind(var6_140, var5);
                                            }
                                            var54 = var54.rest();
                                            var55 = var54.first();
                                        }
                                        var131_132 = module0056.f4150(var10);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var59_144, var5);
                                    module0138.$g1619$.rebind(var53_133, var5);
                                    module0141.$g1677$.rebind(var6_133, var5);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0562.TWO_INTEGER, (SubLObject)module0562.$ic101$, var8, module0244.f15748(module0137.f8955((SubLObject)module0562.UNPROVIDED)), (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var15, var5);
                            module0141.$g1674$.rebind(var14, var5);
                            module0141.$g1672$.rebind(var13, var5);
                            module0141.$g1671$.rebind(var53_132, var5);
                            module0141.$g1670$.rebind(var6_132, var5);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var53_131, var5);
                        module0141.$g1714$.rebind(var6_131, var5);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var5));
                }
                finally {
                    module0139.$g1635$.rebind(var6_130, var5);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var5));
            }
            finally {
                module0139.$g1636$.rebind(var53_130, var5);
                module0137.$g1605$.rebind(var6_129, var5);
            }
            var8 = module0562.$ic102$;
            final SubLObject var6_144 = module0137.$g1605$.currentBinding(var5);
            final SubLObject var53_136 = module0139.$g1636$.currentBinding(var5);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0562.$ic86$), var5);
                module0139.$g1636$.bind(module0139.f9007(), var5);
                SubLObject var131_133 = var8;
                final SubLObject var9 = (SubLObject)module0562.$ic89$;
                final SubLObject var10 = module0056.f4145(var9);
                final SubLObject var6_145 = module0139.$g1635$.currentBinding(var5);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var5);
                    final SubLObject var11 = (SubLObject)module0562.NIL;
                    final SubLObject var6_146 = module0141.$g1714$.currentBinding(var5);
                    final SubLObject var53_137 = module0141.$g1715$.currentBinding(var5);
                    try {
                        module0141.$g1714$.bind((module0562.NIL != var11) ? var11 : module0141.f9283(), var5);
                        module0141.$g1715$.bind((SubLObject)((module0562.NIL != var11) ? module0562.$ic90$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                        if (module0562.NIL != var11 && module0562.NIL != module0136.f8864() && module0562.NIL == module0141.f9279(var11)) {
                            final SubLObject var12 = module0136.$g1591$.getDynamicValue(var5);
                            if (var12.eql((SubLObject)module0562.$ic91$)) {
                                module0136.f8870((SubLObject)module0562.ONE_INTEGER, (SubLObject)module0562.$ic92$, var11, (SubLObject)module0562.$ic93$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                            }
                            else if (var12.eql((SubLObject)module0562.$ic94$)) {
                                module0136.f8871((SubLObject)module0562.ONE_INTEGER, (SubLObject)module0562.$ic95$, (SubLObject)module0562.$ic92$, var11, (SubLObject)module0562.$ic93$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                            }
                            else if (var12.eql((SubLObject)module0562.$ic96$)) {
                                Errors.warn((SubLObject)module0562.$ic92$, var11, (SubLObject)module0562.$ic93$);
                            }
                            else {
                                Errors.warn((SubLObject)module0562.$ic97$, module0136.$g1591$.getDynamicValue(var5));
                                Errors.cerror((SubLObject)module0562.$ic95$, (SubLObject)module0562.$ic92$, var11, (SubLObject)module0562.$ic93$);
                            }
                        }
                        final SubLObject var6_147 = module0141.$g1670$.currentBinding(var5);
                        final SubLObject var53_138 = module0141.$g1671$.currentBinding(var5);
                        final SubLObject var13 = module0141.$g1672$.currentBinding(var5);
                        final SubLObject var14 = module0141.$g1674$.currentBinding(var5);
                        final SubLObject var15 = module0137.$g1605$.currentBinding(var5);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0562.$ic86$)), var5);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0562.$ic86$))), var5);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0562.$ic86$))), var5);
                            module0141.$g1674$.bind((SubLObject)module0562.NIL, var5);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0562.$ic86$)), var5);
                            if (module0562.NIL != module0136.f8865() || module0562.NIL != module0244.f15795(var8, module0137.f8955((SubLObject)module0562.UNPROVIDED))) {
                                final SubLObject var6_148 = module0141.$g1677$.currentBinding(var5);
                                final SubLObject var53_139 = module0138.$g1619$.currentBinding(var5);
                                final SubLObject var59_145 = module0141.$g1674$.currentBinding(var5);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var5);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0562.$ic86$))), var5);
                                    module0141.$g1674$.bind((SubLObject)module0562.NIL, var5);
                                    module0249.f16055(var131_133, (SubLObject)module0562.UNPROVIDED);
                                    while (module0562.NIL != var131_133) {
                                        final SubLObject var16 = var131_133;
                                        SubLObject var18;
                                        final SubLObject var17 = var18 = module0200.f12443(module0137.f8955(module0562.$ic86$));
                                        SubLObject var19 = (SubLObject)module0562.NIL;
                                        var19 = var18.first();
                                        while (module0562.NIL != var18) {
                                            final SubLObject var6_149 = module0137.$g1605$.currentBinding(var5);
                                            final SubLObject var53_140 = module0141.$g1674$.currentBinding(var5);
                                            try {
                                                module0137.$g1605$.bind(var19, var5);
                                                module0141.$g1674$.bind((SubLObject)((module0562.NIL != module0141.f9205((SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0562.NIL == module0141.$g1674$.getDynamicValue(var5)) : module0141.$g1674$.getDynamicValue(var5)), var5);
                                                final SubLObject var20 = module0228.f15229(var16);
                                                if (module0562.NIL != module0138.f8992(var20)) {
                                                    final SubLObject var21 = module0242.f15664(var20, module0137.f8955((SubLObject)module0562.UNPROVIDED));
                                                    if (module0562.NIL != var21) {
                                                        final SubLObject var22 = module0245.f15834(var21, module0244.f15780(module0137.f8955(module0562.$ic86$)), module0137.f8955((SubLObject)module0562.UNPROVIDED));
                                                        if (module0562.NIL != var22) {
                                                            SubLObject var23;
                                                            for (var23 = module0066.f4838(module0067.f4891(var22)); module0562.NIL == module0066.f4841(var23); var23 = module0066.f4840(var23)) {
                                                                var5.resetMultipleValues();
                                                                final SubLObject var24 = module0066.f4839(var23);
                                                                final SubLObject var25 = var5.secondMultipleValue();
                                                                var5.resetMultipleValues();
                                                                if (module0562.NIL != module0147.f9507(var24)) {
                                                                    final SubLObject var6_150 = module0138.$g1623$.currentBinding(var5);
                                                                    try {
                                                                        module0138.$g1623$.bind(var24, var5);
                                                                        SubLObject var153_159;
                                                                        for (var153_159 = module0066.f4838(module0067.f4891(var25)); module0562.NIL == module0066.f4841(var153_159); var153_159 = module0066.f4840(var153_159)) {
                                                                            var5.resetMultipleValues();
                                                                            final SubLObject var26 = module0066.f4839(var153_159);
                                                                            final SubLObject var27 = var5.secondMultipleValue();
                                                                            var5.resetMultipleValues();
                                                                            if (module0562.NIL != module0141.f9289(var26)) {
                                                                                final SubLObject var6_151 = module0138.$g1624$.currentBinding(var5);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var26, var5);
                                                                                    final SubLObject var28 = var27;
                                                                                    if (module0562.NIL != module0077.f5302(var28)) {
                                                                                        final SubLObject var29 = module0077.f5333(var28);
                                                                                        SubLObject var30;
                                                                                        SubLObject var31;
                                                                                        SubLObject var32;
                                                                                        for (var30 = module0032.f1741(var29), var31 = (SubLObject)module0562.NIL, var31 = module0032.f1742(var30, var29); module0562.NIL == module0032.f1744(var30, var31); var31 = module0032.f1743(var31)) {
                                                                                            var32 = module0032.f1745(var30, var31);
                                                                                            if (module0562.NIL != module0032.f1746(var31, var32) && module0562.NIL == module0249.f16059(var32, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                                module0249.f16055(var32, module0139.$g1636$.getDynamicValue(var5));
                                                                                                if (module0562.NIL != module0173.f10955(var32)) {
                                                                                                    module0563.f34740(var32);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var28.isList()) {
                                                                                        SubLObject var33 = var28;
                                                                                        SubLObject var34 = (SubLObject)module0562.NIL;
                                                                                        var34 = var33.first();
                                                                                        while (module0562.NIL != var33) {
                                                                                            if (module0562.NIL == module0249.f16059(var34, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                                module0249.f16055(var34, module0139.$g1636$.getDynamicValue(var5));
                                                                                                if (module0562.NIL != module0173.f10955(var34)) {
                                                                                                    module0563.f34740(var34);
                                                                                                }
                                                                                            }
                                                                                            var33 = var33.rest();
                                                                                            var34 = var33.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0562.$ic98$, var28);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_151, var5);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var153_159);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_150, var5);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var23);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0562.FIVE_INTEGER, (SubLObject)module0562.$ic99$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                                                    }
                                                    if (module0562.NIL != module0200.f12419(var20, module0137.f8955((SubLObject)module0562.UNPROVIDED))) {
                                                        SubLObject var35 = module0248.f15995(var20);
                                                        SubLObject var36 = (SubLObject)module0562.NIL;
                                                        var36 = var35.first();
                                                        while (module0562.NIL != var35) {
                                                            SubLObject var82;
                                                            final SubLObject var81 = var82 = var36;
                                                            SubLObject var39 = (SubLObject)module0562.NIL;
                                                            SubLObject var40 = (SubLObject)module0562.NIL;
                                                            SubLObject var41 = (SubLObject)module0562.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)module0562.$ic100$);
                                                            var39 = var82.first();
                                                            var82 = var82.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)module0562.$ic100$);
                                                            var40 = var82.first();
                                                            var82 = var82.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)module0562.$ic100$);
                                                            var41 = var82.first();
                                                            var82 = var82.rest();
                                                            if (module0562.NIL == var82) {
                                                                if (module0562.NIL != module0147.f9507(var40)) {
                                                                    final SubLObject var6_152 = module0138.$g1623$.currentBinding(var5);
                                                                    try {
                                                                        module0138.$g1623$.bind(var40, var5);
                                                                        if (module0562.NIL != module0141.f9289(var41)) {
                                                                            final SubLObject var6_153 = module0138.$g1624$.currentBinding(var5);
                                                                            try {
                                                                                module0138.$g1624$.bind(var41, var5);
                                                                                final SubLObject var28;
                                                                                final SubLObject var42 = var28 = (SubLObject)ConsesLow.list(var39);
                                                                                if (module0562.NIL != module0077.f5302(var28)) {
                                                                                    final SubLObject var29 = module0077.f5333(var28);
                                                                                    SubLObject var30;
                                                                                    SubLObject var31;
                                                                                    SubLObject var32;
                                                                                    for (var30 = module0032.f1741(var29), var31 = (SubLObject)module0562.NIL, var31 = module0032.f1742(var30, var29); module0562.NIL == module0032.f1744(var30, var31); var31 = module0032.f1743(var31)) {
                                                                                        var32 = module0032.f1745(var30, var31);
                                                                                        if (module0562.NIL != module0032.f1746(var31, var32) && module0562.NIL == module0249.f16059(var32, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                            module0249.f16055(var32, module0139.$g1636$.getDynamicValue(var5));
                                                                                            if (module0562.NIL != module0173.f10955(var32)) {
                                                                                                module0563.f34740(var32);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var28.isList()) {
                                                                                    SubLObject var125_174 = var28;
                                                                                    SubLObject var34 = (SubLObject)module0562.NIL;
                                                                                    var34 = var125_174.first();
                                                                                    while (module0562.NIL != var125_174) {
                                                                                        if (module0562.NIL == module0249.f16059(var34, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                            module0249.f16055(var34, module0139.$g1636$.getDynamicValue(var5));
                                                                                            if (module0562.NIL != module0173.f10955(var34)) {
                                                                                                module0563.f34740(var34);
                                                                                            }
                                                                                        }
                                                                                        var125_174 = var125_174.rest();
                                                                                        var34 = var125_174.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0562.$ic98$, var28);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var6_153, var5);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_152, var5);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var81, (SubLObject)module0562.$ic100$);
                                                            }
                                                            var35 = var35.rest();
                                                            var36 = var35.first();
                                                        }
                                                    }
                                                }
                                                else if (module0562.NIL != module0155.f9785(var20, (SubLObject)module0562.UNPROVIDED)) {
                                                    SubLObject var12_177;
                                                    final SubLObject var43 = var12_177 = ((module0562.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0562.$ic86$)), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0562.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0562.$ic86$)), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0562.UNPROVIDED)));
                                                    SubLObject var44 = (SubLObject)module0562.NIL;
                                                    var44 = var12_177.first();
                                                    while (module0562.NIL != var12_177) {
                                                        final SubLObject var6_154 = module0138.$g1625$.currentBinding(var5);
                                                        try {
                                                            module0138.$g1625$.bind(var44, var5);
                                                            final SubLObject var46;
                                                            final SubLObject var45 = var46 = Functions.funcall(var44, var20);
                                                            if (module0562.NIL != module0077.f5302(var46)) {
                                                                final SubLObject var47 = module0077.f5333(var46);
                                                                SubLObject var48;
                                                                SubLObject var49;
                                                                SubLObject var50;
                                                                for (var48 = module0032.f1741(var47), var49 = (SubLObject)module0562.NIL, var49 = module0032.f1742(var48, var47); module0562.NIL == module0032.f1744(var48, var49); var49 = module0032.f1743(var49)) {
                                                                    var50 = module0032.f1745(var48, var49);
                                                                    if (module0562.NIL != module0032.f1746(var49, var50) && module0562.NIL == module0249.f16059(var50, module0139.$g1636$.getDynamicValue(var5))) {
                                                                        module0249.f16055(var50, module0139.$g1636$.getDynamicValue(var5));
                                                                        if (module0562.NIL != module0173.f10955(var50)) {
                                                                            module0563.f34740(var50);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var46.isList()) {
                                                                SubLObject var51 = var46;
                                                                SubLObject var52 = (SubLObject)module0562.NIL;
                                                                var52 = var51.first();
                                                                while (module0562.NIL != var51) {
                                                                    if (module0562.NIL == module0249.f16059(var52, module0139.$g1636$.getDynamicValue(var5))) {
                                                                        module0249.f16055(var52, module0139.$g1636$.getDynamicValue(var5));
                                                                        if (module0562.NIL != module0173.f10955(var52)) {
                                                                            module0563.f34740(var52);
                                                                        }
                                                                    }
                                                                    var51 = var51.rest();
                                                                    var52 = var51.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0562.$ic98$, var46);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_154, var5);
                                                        }
                                                        var12_177 = var12_177.rest();
                                                        var44 = var12_177.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var53_140, var5);
                                                module0137.$g1605$.rebind(var6_149, var5);
                                            }
                                            var18 = var18.rest();
                                            var19 = var18.first();
                                        }
                                        SubLObject var54;
                                        final SubLObject var53 = var54 = module0200.f12443(module0244.f15771(module0137.f8955(module0562.$ic86$)));
                                        SubLObject var55 = (SubLObject)module0562.NIL;
                                        var55 = var54.first();
                                        while (module0562.NIL != var54) {
                                            final SubLObject var6_155 = module0137.$g1605$.currentBinding(var5);
                                            final SubLObject var53_141 = module0141.$g1674$.currentBinding(var5);
                                            try {
                                                module0137.$g1605$.bind(var55, var5);
                                                module0141.$g1674$.bind((SubLObject)((module0562.NIL != module0141.f9205((SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0562.NIL == module0141.$g1674$.getDynamicValue(var5)) : module0141.$g1674$.getDynamicValue(var5)), var5);
                                                final SubLObject var56 = module0228.f15229(var131_133);
                                                if (module0562.NIL != module0138.f8992(var56)) {
                                                    final SubLObject var57 = module0242.f15664(var56, module0137.f8955((SubLObject)module0562.UNPROVIDED));
                                                    if (module0562.NIL != var57) {
                                                        final SubLObject var58 = module0245.f15834(var57, module0138.f8979(), module0137.f8955((SubLObject)module0562.UNPROVIDED));
                                                        if (module0562.NIL != var58) {
                                                            SubLObject var59;
                                                            for (var59 = module0066.f4838(module0067.f4891(var58)); module0562.NIL == module0066.f4841(var59); var59 = module0066.f4840(var59)) {
                                                                var5.resetMultipleValues();
                                                                final SubLObject var60 = module0066.f4839(var59);
                                                                final SubLObject var61 = var5.secondMultipleValue();
                                                                var5.resetMultipleValues();
                                                                if (module0562.NIL != module0147.f9507(var60)) {
                                                                    final SubLObject var6_156 = module0138.$g1623$.currentBinding(var5);
                                                                    try {
                                                                        module0138.$g1623$.bind(var60, var5);
                                                                        SubLObject var153_160;
                                                                        for (var153_160 = module0066.f4838(module0067.f4891(var61)); module0562.NIL == module0066.f4841(var153_160); var153_160 = module0066.f4840(var153_160)) {
                                                                            var5.resetMultipleValues();
                                                                            final SubLObject var62 = module0066.f4839(var153_160);
                                                                            final SubLObject var63 = var5.secondMultipleValue();
                                                                            var5.resetMultipleValues();
                                                                            if (module0562.NIL != module0141.f9289(var62)) {
                                                                                final SubLObject var6_157 = module0138.$g1624$.currentBinding(var5);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var62, var5);
                                                                                    final SubLObject var64 = var63;
                                                                                    if (module0562.NIL != module0077.f5302(var64)) {
                                                                                        final SubLObject var65 = module0077.f5333(var64);
                                                                                        SubLObject var66;
                                                                                        SubLObject var67;
                                                                                        SubLObject var68;
                                                                                        for (var66 = module0032.f1741(var65), var67 = (SubLObject)module0562.NIL, var67 = module0032.f1742(var66, var65); module0562.NIL == module0032.f1744(var66, var67); var67 = module0032.f1743(var67)) {
                                                                                            var68 = module0032.f1745(var66, var67);
                                                                                            if (module0562.NIL != module0032.f1746(var67, var68) && module0562.NIL == module0249.f16059(var68, (SubLObject)module0562.UNPROVIDED)) {
                                                                                                module0249.f16055(var68, (SubLObject)module0562.UNPROVIDED);
                                                                                                module0056.f4149(var68, var10);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var64.isList()) {
                                                                                        SubLObject var69 = var64;
                                                                                        SubLObject var70 = (SubLObject)module0562.NIL;
                                                                                        var70 = var69.first();
                                                                                        while (module0562.NIL != var69) {
                                                                                            if (module0562.NIL == module0249.f16059(var70, (SubLObject)module0562.UNPROVIDED)) {
                                                                                                module0249.f16055(var70, (SubLObject)module0562.UNPROVIDED);
                                                                                                module0056.f4149(var70, var10);
                                                                                            }
                                                                                            var69 = var69.rest();
                                                                                            var70 = var69.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0562.$ic98$, var64);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_157, var5);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var153_160);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_156, var5);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var59);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0562.FIVE_INTEGER, (SubLObject)module0562.$ic99$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0562.NIL != module0155.f9785(var56, (SubLObject)module0562.UNPROVIDED)) {
                                                    SubLObject var12_178;
                                                    final SubLObject var71 = var12_178 = ((module0562.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0562.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0562.UNPROVIDED)));
                                                    SubLObject var72 = (SubLObject)module0562.NIL;
                                                    var72 = var12_178.first();
                                                    while (module0562.NIL != var12_178) {
                                                        final SubLObject var6_158 = module0138.$g1625$.currentBinding(var5);
                                                        try {
                                                            module0138.$g1625$.bind(var72, var5);
                                                            final SubLObject var74;
                                                            final SubLObject var73 = var74 = Functions.funcall(var72, var56);
                                                            if (module0562.NIL != module0077.f5302(var74)) {
                                                                final SubLObject var75 = module0077.f5333(var74);
                                                                SubLObject var76;
                                                                SubLObject var77;
                                                                SubLObject var78;
                                                                for (var76 = module0032.f1741(var75), var77 = (SubLObject)module0562.NIL, var77 = module0032.f1742(var76, var75); module0562.NIL == module0032.f1744(var76, var77); var77 = module0032.f1743(var77)) {
                                                                    var78 = module0032.f1745(var76, var77);
                                                                    if (module0562.NIL != module0032.f1746(var77, var78) && module0562.NIL == module0249.f16059(var78, (SubLObject)module0562.UNPROVIDED)) {
                                                                        module0249.f16055(var78, (SubLObject)module0562.UNPROVIDED);
                                                                        module0056.f4149(var78, var10);
                                                                    }
                                                                }
                                                            }
                                                            else if (var74.isList()) {
                                                                SubLObject var79 = var74;
                                                                SubLObject var80 = (SubLObject)module0562.NIL;
                                                                var80 = var79.first();
                                                                while (module0562.NIL != var79) {
                                                                    if (module0562.NIL == module0249.f16059(var80, (SubLObject)module0562.UNPROVIDED)) {
                                                                        module0249.f16055(var80, (SubLObject)module0562.UNPROVIDED);
                                                                        module0056.f4149(var80, var10);
                                                                    }
                                                                    var79 = var79.rest();
                                                                    var80 = var79.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0562.$ic98$, var74);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_158, var5);
                                                        }
                                                        var12_178 = var12_178.rest();
                                                        var72 = var12_178.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var53_141, var5);
                                                module0137.$g1605$.rebind(var6_155, var5);
                                            }
                                            var54 = var54.rest();
                                            var55 = var54.first();
                                        }
                                        var131_133 = module0056.f4150(var10);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var59_145, var5);
                                    module0138.$g1619$.rebind(var53_139, var5);
                                    module0141.$g1677$.rebind(var6_148, var5);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0562.TWO_INTEGER, (SubLObject)module0562.$ic101$, var8, module0244.f15748(module0137.f8955((SubLObject)module0562.UNPROVIDED)), (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var15, var5);
                            module0141.$g1674$.rebind(var14, var5);
                            module0141.$g1672$.rebind(var13, var5);
                            module0141.$g1671$.rebind(var53_138, var5);
                            module0141.$g1670$.rebind(var6_147, var5);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var53_137, var5);
                        module0141.$g1714$.rebind(var6_146, var5);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var5));
                }
                finally {
                    module0139.$g1635$.rebind(var6_145, var5);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var5));
            }
            finally {
                module0139.$g1636$.rebind(var53_136, var5);
                module0137.$g1605$.rebind(var6_144, var5);
            }
            var8 = module0562.$ic103$;
            final SubLObject var6_159 = module0137.$g1605$.currentBinding(var5);
            final SubLObject var53_142 = module0139.$g1636$.currentBinding(var5);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0562.$ic86$), var5);
                module0139.$g1636$.bind(module0139.f9007(), var5);
                SubLObject var131_134 = var8;
                final SubLObject var9 = (SubLObject)module0562.$ic89$;
                final SubLObject var10 = module0056.f4145(var9);
                final SubLObject var6_160 = module0139.$g1635$.currentBinding(var5);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var5);
                    final SubLObject var11 = (SubLObject)module0562.NIL;
                    final SubLObject var6_161 = module0141.$g1714$.currentBinding(var5);
                    final SubLObject var53_143 = module0141.$g1715$.currentBinding(var5);
                    try {
                        module0141.$g1714$.bind((module0562.NIL != var11) ? var11 : module0141.f9283(), var5);
                        module0141.$g1715$.bind((SubLObject)((module0562.NIL != var11) ? module0562.$ic90$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                        if (module0562.NIL != var11 && module0562.NIL != module0136.f8864() && module0562.NIL == module0141.f9279(var11)) {
                            final SubLObject var12 = module0136.$g1591$.getDynamicValue(var5);
                            if (var12.eql((SubLObject)module0562.$ic91$)) {
                                module0136.f8870((SubLObject)module0562.ONE_INTEGER, (SubLObject)module0562.$ic92$, var11, (SubLObject)module0562.$ic93$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                            }
                            else if (var12.eql((SubLObject)module0562.$ic94$)) {
                                module0136.f8871((SubLObject)module0562.ONE_INTEGER, (SubLObject)module0562.$ic95$, (SubLObject)module0562.$ic92$, var11, (SubLObject)module0562.$ic93$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                            }
                            else if (var12.eql((SubLObject)module0562.$ic96$)) {
                                Errors.warn((SubLObject)module0562.$ic92$, var11, (SubLObject)module0562.$ic93$);
                            }
                            else {
                                Errors.warn((SubLObject)module0562.$ic97$, module0136.$g1591$.getDynamicValue(var5));
                                Errors.cerror((SubLObject)module0562.$ic95$, (SubLObject)module0562.$ic92$, var11, (SubLObject)module0562.$ic93$);
                            }
                        }
                        final SubLObject var6_162 = module0141.$g1670$.currentBinding(var5);
                        final SubLObject var53_144 = module0141.$g1671$.currentBinding(var5);
                        final SubLObject var13 = module0141.$g1672$.currentBinding(var5);
                        final SubLObject var14 = module0141.$g1674$.currentBinding(var5);
                        final SubLObject var15 = module0137.$g1605$.currentBinding(var5);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0562.$ic86$)), var5);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0562.$ic86$))), var5);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0562.$ic86$))), var5);
                            module0141.$g1674$.bind((SubLObject)module0562.NIL, var5);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0562.$ic86$)), var5);
                            if (module0562.NIL != module0136.f8865() || module0562.NIL != module0244.f15795(var8, module0137.f8955((SubLObject)module0562.UNPROVIDED))) {
                                final SubLObject var6_163 = module0141.$g1677$.currentBinding(var5);
                                final SubLObject var53_145 = module0138.$g1619$.currentBinding(var5);
                                final SubLObject var59_146 = module0141.$g1674$.currentBinding(var5);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var5);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0562.$ic86$))), var5);
                                    module0141.$g1674$.bind((SubLObject)module0562.NIL, var5);
                                    module0249.f16055(var131_134, (SubLObject)module0562.UNPROVIDED);
                                    while (module0562.NIL != var131_134) {
                                        final SubLObject var16 = var131_134;
                                        SubLObject var18;
                                        final SubLObject var17 = var18 = module0200.f12443(module0137.f8955(module0562.$ic86$));
                                        SubLObject var19 = (SubLObject)module0562.NIL;
                                        var19 = var18.first();
                                        while (module0562.NIL != var18) {
                                            final SubLObject var6_164 = module0137.$g1605$.currentBinding(var5);
                                            final SubLObject var53_146 = module0141.$g1674$.currentBinding(var5);
                                            try {
                                                module0137.$g1605$.bind(var19, var5);
                                                module0141.$g1674$.bind((SubLObject)((module0562.NIL != module0141.f9205((SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0562.NIL == module0141.$g1674$.getDynamicValue(var5)) : module0141.$g1674$.getDynamicValue(var5)), var5);
                                                final SubLObject var20 = module0228.f15229(var16);
                                                if (module0562.NIL != module0138.f8992(var20)) {
                                                    final SubLObject var21 = module0242.f15664(var20, module0137.f8955((SubLObject)module0562.UNPROVIDED));
                                                    if (module0562.NIL != var21) {
                                                        final SubLObject var22 = module0245.f15834(var21, module0244.f15780(module0137.f8955(module0562.$ic86$)), module0137.f8955((SubLObject)module0562.UNPROVIDED));
                                                        if (module0562.NIL != var22) {
                                                            SubLObject var23;
                                                            for (var23 = module0066.f4838(module0067.f4891(var22)); module0562.NIL == module0066.f4841(var23); var23 = module0066.f4840(var23)) {
                                                                var5.resetMultipleValues();
                                                                final SubLObject var24 = module0066.f4839(var23);
                                                                final SubLObject var25 = var5.secondMultipleValue();
                                                                var5.resetMultipleValues();
                                                                if (module0562.NIL != module0147.f9507(var24)) {
                                                                    final SubLObject var6_165 = module0138.$g1623$.currentBinding(var5);
                                                                    try {
                                                                        module0138.$g1623$.bind(var24, var5);
                                                                        SubLObject var153_161;
                                                                        for (var153_161 = module0066.f4838(module0067.f4891(var25)); module0562.NIL == module0066.f4841(var153_161); var153_161 = module0066.f4840(var153_161)) {
                                                                            var5.resetMultipleValues();
                                                                            final SubLObject var26 = module0066.f4839(var153_161);
                                                                            final SubLObject var27 = var5.secondMultipleValue();
                                                                            var5.resetMultipleValues();
                                                                            if (module0562.NIL != module0141.f9289(var26)) {
                                                                                final SubLObject var6_166 = module0138.$g1624$.currentBinding(var5);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var26, var5);
                                                                                    final SubLObject var28 = var27;
                                                                                    if (module0562.NIL != module0077.f5302(var28)) {
                                                                                        final SubLObject var29 = module0077.f5333(var28);
                                                                                        SubLObject var30;
                                                                                        SubLObject var31;
                                                                                        SubLObject var32;
                                                                                        for (var30 = module0032.f1741(var29), var31 = (SubLObject)module0562.NIL, var31 = module0032.f1742(var30, var29); module0562.NIL == module0032.f1744(var30, var31); var31 = module0032.f1743(var31)) {
                                                                                            var32 = module0032.f1745(var30, var31);
                                                                                            if (module0562.NIL != module0032.f1746(var31, var32) && module0562.NIL == module0249.f16059(var32, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                                module0249.f16055(var32, module0139.$g1636$.getDynamicValue(var5));
                                                                                                if (module0562.NIL != module0173.f10955(var32)) {
                                                                                                    module0563.f34740(var32);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var28.isList()) {
                                                                                        SubLObject var33 = var28;
                                                                                        SubLObject var34 = (SubLObject)module0562.NIL;
                                                                                        var34 = var33.first();
                                                                                        while (module0562.NIL != var33) {
                                                                                            if (module0562.NIL == module0249.f16059(var34, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                                module0249.f16055(var34, module0139.$g1636$.getDynamicValue(var5));
                                                                                                if (module0562.NIL != module0173.f10955(var34)) {
                                                                                                    module0563.f34740(var34);
                                                                                                }
                                                                                            }
                                                                                            var33 = var33.rest();
                                                                                            var34 = var33.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0562.$ic98$, var28);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_166, var5);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var153_161);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_165, var5);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var23);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0562.FIVE_INTEGER, (SubLObject)module0562.$ic99$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                                                    }
                                                    if (module0562.NIL != module0200.f12419(var20, module0137.f8955((SubLObject)module0562.UNPROVIDED))) {
                                                        SubLObject var35 = module0248.f15995(var20);
                                                        SubLObject var36 = (SubLObject)module0562.NIL;
                                                        var36 = var35.first();
                                                        while (module0562.NIL != var35) {
                                                            SubLObject var84;
                                                            final SubLObject var83 = var84 = var36;
                                                            SubLObject var39 = (SubLObject)module0562.NIL;
                                                            SubLObject var40 = (SubLObject)module0562.NIL;
                                                            SubLObject var41 = (SubLObject)module0562.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0562.$ic100$);
                                                            var39 = var84.first();
                                                            var84 = var84.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0562.$ic100$);
                                                            var40 = var84.first();
                                                            var84 = var84.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0562.$ic100$);
                                                            var41 = var84.first();
                                                            var84 = var84.rest();
                                                            if (module0562.NIL == var84) {
                                                                if (module0562.NIL != module0147.f9507(var40)) {
                                                                    final SubLObject var6_167 = module0138.$g1623$.currentBinding(var5);
                                                                    try {
                                                                        module0138.$g1623$.bind(var40, var5);
                                                                        if (module0562.NIL != module0141.f9289(var41)) {
                                                                            final SubLObject var6_168 = module0138.$g1624$.currentBinding(var5);
                                                                            try {
                                                                                module0138.$g1624$.bind(var41, var5);
                                                                                final SubLObject var28;
                                                                                final SubLObject var42 = var28 = (SubLObject)ConsesLow.list(var39);
                                                                                if (module0562.NIL != module0077.f5302(var28)) {
                                                                                    final SubLObject var29 = module0077.f5333(var28);
                                                                                    SubLObject var30;
                                                                                    SubLObject var31;
                                                                                    SubLObject var32;
                                                                                    for (var30 = module0032.f1741(var29), var31 = (SubLObject)module0562.NIL, var31 = module0032.f1742(var30, var29); module0562.NIL == module0032.f1744(var30, var31); var31 = module0032.f1743(var31)) {
                                                                                        var32 = module0032.f1745(var30, var31);
                                                                                        if (module0562.NIL != module0032.f1746(var31, var32) && module0562.NIL == module0249.f16059(var32, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                            module0249.f16055(var32, module0139.$g1636$.getDynamicValue(var5));
                                                                                            if (module0562.NIL != module0173.f10955(var32)) {
                                                                                                module0563.f34740(var32);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var28.isList()) {
                                                                                    SubLObject var125_175 = var28;
                                                                                    SubLObject var34 = (SubLObject)module0562.NIL;
                                                                                    var34 = var125_175.first();
                                                                                    while (module0562.NIL != var125_175) {
                                                                                        if (module0562.NIL == module0249.f16059(var34, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                            module0249.f16055(var34, module0139.$g1636$.getDynamicValue(var5));
                                                                                            if (module0562.NIL != module0173.f10955(var34)) {
                                                                                                module0563.f34740(var34);
                                                                                            }
                                                                                        }
                                                                                        var125_175 = var125_175.rest();
                                                                                        var34 = var125_175.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0562.$ic98$, var28);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var6_168, var5);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_167, var5);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0562.$ic100$);
                                                            }
                                                            var35 = var35.rest();
                                                            var36 = var35.first();
                                                        }
                                                    }
                                                }
                                                else if (module0562.NIL != module0155.f9785(var20, (SubLObject)module0562.UNPROVIDED)) {
                                                    SubLObject var12_179;
                                                    final SubLObject var43 = var12_179 = ((module0562.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0562.$ic86$)), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0562.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0562.$ic86$)), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0562.UNPROVIDED)));
                                                    SubLObject var44 = (SubLObject)module0562.NIL;
                                                    var44 = var12_179.first();
                                                    while (module0562.NIL != var12_179) {
                                                        final SubLObject var6_169 = module0138.$g1625$.currentBinding(var5);
                                                        try {
                                                            module0138.$g1625$.bind(var44, var5);
                                                            final SubLObject var46;
                                                            final SubLObject var45 = var46 = Functions.funcall(var44, var20);
                                                            if (module0562.NIL != module0077.f5302(var46)) {
                                                                final SubLObject var47 = module0077.f5333(var46);
                                                                SubLObject var48;
                                                                SubLObject var49;
                                                                SubLObject var50;
                                                                for (var48 = module0032.f1741(var47), var49 = (SubLObject)module0562.NIL, var49 = module0032.f1742(var48, var47); module0562.NIL == module0032.f1744(var48, var49); var49 = module0032.f1743(var49)) {
                                                                    var50 = module0032.f1745(var48, var49);
                                                                    if (module0562.NIL != module0032.f1746(var49, var50) && module0562.NIL == module0249.f16059(var50, module0139.$g1636$.getDynamicValue(var5))) {
                                                                        module0249.f16055(var50, module0139.$g1636$.getDynamicValue(var5));
                                                                        if (module0562.NIL != module0173.f10955(var50)) {
                                                                            module0563.f34740(var50);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var46.isList()) {
                                                                SubLObject var51 = var46;
                                                                SubLObject var52 = (SubLObject)module0562.NIL;
                                                                var52 = var51.first();
                                                                while (module0562.NIL != var51) {
                                                                    if (module0562.NIL == module0249.f16059(var52, module0139.$g1636$.getDynamicValue(var5))) {
                                                                        module0249.f16055(var52, module0139.$g1636$.getDynamicValue(var5));
                                                                        if (module0562.NIL != module0173.f10955(var52)) {
                                                                            module0563.f34740(var52);
                                                                        }
                                                                    }
                                                                    var51 = var51.rest();
                                                                    var52 = var51.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0562.$ic98$, var46);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_169, var5);
                                                        }
                                                        var12_179 = var12_179.rest();
                                                        var44 = var12_179.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var53_146, var5);
                                                module0137.$g1605$.rebind(var6_164, var5);
                                            }
                                            var18 = var18.rest();
                                            var19 = var18.first();
                                        }
                                        SubLObject var54;
                                        final SubLObject var53 = var54 = module0200.f12443(module0244.f15771(module0137.f8955(module0562.$ic86$)));
                                        SubLObject var55 = (SubLObject)module0562.NIL;
                                        var55 = var54.first();
                                        while (module0562.NIL != var54) {
                                            final SubLObject var6_170 = module0137.$g1605$.currentBinding(var5);
                                            final SubLObject var53_147 = module0141.$g1674$.currentBinding(var5);
                                            try {
                                                module0137.$g1605$.bind(var55, var5);
                                                module0141.$g1674$.bind((SubLObject)((module0562.NIL != module0141.f9205((SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0562.NIL == module0141.$g1674$.getDynamicValue(var5)) : module0141.$g1674$.getDynamicValue(var5)), var5);
                                                final SubLObject var56 = module0228.f15229(var131_134);
                                                if (module0562.NIL != module0138.f8992(var56)) {
                                                    final SubLObject var57 = module0242.f15664(var56, module0137.f8955((SubLObject)module0562.UNPROVIDED));
                                                    if (module0562.NIL != var57) {
                                                        final SubLObject var58 = module0245.f15834(var57, module0138.f8979(), module0137.f8955((SubLObject)module0562.UNPROVIDED));
                                                        if (module0562.NIL != var58) {
                                                            SubLObject var59;
                                                            for (var59 = module0066.f4838(module0067.f4891(var58)); module0562.NIL == module0066.f4841(var59); var59 = module0066.f4840(var59)) {
                                                                var5.resetMultipleValues();
                                                                final SubLObject var60 = module0066.f4839(var59);
                                                                final SubLObject var61 = var5.secondMultipleValue();
                                                                var5.resetMultipleValues();
                                                                if (module0562.NIL != module0147.f9507(var60)) {
                                                                    final SubLObject var6_171 = module0138.$g1623$.currentBinding(var5);
                                                                    try {
                                                                        module0138.$g1623$.bind(var60, var5);
                                                                        SubLObject var153_162;
                                                                        for (var153_162 = module0066.f4838(module0067.f4891(var61)); module0562.NIL == module0066.f4841(var153_162); var153_162 = module0066.f4840(var153_162)) {
                                                                            var5.resetMultipleValues();
                                                                            final SubLObject var62 = module0066.f4839(var153_162);
                                                                            final SubLObject var63 = var5.secondMultipleValue();
                                                                            var5.resetMultipleValues();
                                                                            if (module0562.NIL != module0141.f9289(var62)) {
                                                                                final SubLObject var6_172 = module0138.$g1624$.currentBinding(var5);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var62, var5);
                                                                                    final SubLObject var64 = var63;
                                                                                    if (module0562.NIL != module0077.f5302(var64)) {
                                                                                        final SubLObject var65 = module0077.f5333(var64);
                                                                                        SubLObject var66;
                                                                                        SubLObject var67;
                                                                                        SubLObject var68;
                                                                                        for (var66 = module0032.f1741(var65), var67 = (SubLObject)module0562.NIL, var67 = module0032.f1742(var66, var65); module0562.NIL == module0032.f1744(var66, var67); var67 = module0032.f1743(var67)) {
                                                                                            var68 = module0032.f1745(var66, var67);
                                                                                            if (module0562.NIL != module0032.f1746(var67, var68) && module0562.NIL == module0249.f16059(var68, (SubLObject)module0562.UNPROVIDED)) {
                                                                                                module0249.f16055(var68, (SubLObject)module0562.UNPROVIDED);
                                                                                                module0056.f4149(var68, var10);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var64.isList()) {
                                                                                        SubLObject var69 = var64;
                                                                                        SubLObject var70 = (SubLObject)module0562.NIL;
                                                                                        var70 = var69.first();
                                                                                        while (module0562.NIL != var69) {
                                                                                            if (module0562.NIL == module0249.f16059(var70, (SubLObject)module0562.UNPROVIDED)) {
                                                                                                module0249.f16055(var70, (SubLObject)module0562.UNPROVIDED);
                                                                                                module0056.f4149(var70, var10);
                                                                                            }
                                                                                            var69 = var69.rest();
                                                                                            var70 = var69.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0562.$ic98$, var64);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_172, var5);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var153_162);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_171, var5);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var59);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0562.FIVE_INTEGER, (SubLObject)module0562.$ic99$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0562.NIL != module0155.f9785(var56, (SubLObject)module0562.UNPROVIDED)) {
                                                    SubLObject var12_180;
                                                    final SubLObject var71 = var12_180 = ((module0562.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0562.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0562.UNPROVIDED)));
                                                    SubLObject var72 = (SubLObject)module0562.NIL;
                                                    var72 = var12_180.first();
                                                    while (module0562.NIL != var12_180) {
                                                        final SubLObject var6_173 = module0138.$g1625$.currentBinding(var5);
                                                        try {
                                                            module0138.$g1625$.bind(var72, var5);
                                                            final SubLObject var74;
                                                            final SubLObject var73 = var74 = Functions.funcall(var72, var56);
                                                            if (module0562.NIL != module0077.f5302(var74)) {
                                                                final SubLObject var75 = module0077.f5333(var74);
                                                                SubLObject var76;
                                                                SubLObject var77;
                                                                SubLObject var78;
                                                                for (var76 = module0032.f1741(var75), var77 = (SubLObject)module0562.NIL, var77 = module0032.f1742(var76, var75); module0562.NIL == module0032.f1744(var76, var77); var77 = module0032.f1743(var77)) {
                                                                    var78 = module0032.f1745(var76, var77);
                                                                    if (module0562.NIL != module0032.f1746(var77, var78) && module0562.NIL == module0249.f16059(var78, (SubLObject)module0562.UNPROVIDED)) {
                                                                        module0249.f16055(var78, (SubLObject)module0562.UNPROVIDED);
                                                                        module0056.f4149(var78, var10);
                                                                    }
                                                                }
                                                            }
                                                            else if (var74.isList()) {
                                                                SubLObject var79 = var74;
                                                                SubLObject var80 = (SubLObject)module0562.NIL;
                                                                var80 = var79.first();
                                                                while (module0562.NIL != var79) {
                                                                    if (module0562.NIL == module0249.f16059(var80, (SubLObject)module0562.UNPROVIDED)) {
                                                                        module0249.f16055(var80, (SubLObject)module0562.UNPROVIDED);
                                                                        module0056.f4149(var80, var10);
                                                                    }
                                                                    var79 = var79.rest();
                                                                    var80 = var79.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0562.$ic98$, var74);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_173, var5);
                                                        }
                                                        var12_180 = var12_180.rest();
                                                        var72 = var12_180.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var53_147, var5);
                                                module0137.$g1605$.rebind(var6_170, var5);
                                            }
                                            var54 = var54.rest();
                                            var55 = var54.first();
                                        }
                                        var131_134 = module0056.f4150(var10);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var59_146, var5);
                                    module0138.$g1619$.rebind(var53_145, var5);
                                    module0141.$g1677$.rebind(var6_163, var5);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0562.TWO_INTEGER, (SubLObject)module0562.$ic101$, var8, module0244.f15748(module0137.f8955((SubLObject)module0562.UNPROVIDED)), (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var15, var5);
                            module0141.$g1674$.rebind(var14, var5);
                            module0141.$g1672$.rebind(var13, var5);
                            module0141.$g1671$.rebind(var53_144, var5);
                            module0141.$g1670$.rebind(var6_162, var5);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var53_143, var5);
                        module0141.$g1714$.rebind(var6_161, var5);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var5));
                }
                finally {
                    module0139.$g1635$.rebind(var6_160, var5);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var5));
            }
            finally {
                module0139.$g1636$.rebind(var53_142, var5);
                module0137.$g1605$.rebind(var6_159, var5);
            }
        }
        finally {
            module0147.$g2095$.rebind(var7, var5);
            module0147.$g2094$.rebind(var6, var5);
        }
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34684(final SubLObject var70) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL != module0259.f16891(var70, module0562.$ic85$) || module0562.NIL != module0259.f16891(var70, module0562.$ic102$) || module0562.NIL != module0259.f16891(var70, module0562.$ic103$));
    }
    
    public static SubLObject f34685(final SubLObject var70) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL == f34686(var70, module0562.$ic104$) && module0562.NIL == module0259.f16891(var70, module0562.$ic104$) && module0562.NIL == f34686(var70, module0562.$ic105$) && module0562.NIL == module0259.f16891(var70, module0562.$ic105$) && module0562.NIL == f34686(var70, module0562.$ic106$) && module0562.NIL == module0259.f16891(var70, module0562.$ic106$) && module0562.NIL == f34684(var70) && module0562.NIL == f34686(var70, module0562.$ic107$) && module0562.NIL == f34686(var70, module0562.$ic108$) && module0562.NIL == module0259.f16891(var70, module0562.$ic108$) && module0562.NIL == module0259.f16891(var70, module0562.$ic109$) && module0562.NIL == module0269.f17800(var70, (SubLObject)module0562.UNPROVIDED) && module0562.NIL != ((module0562.NIL != constant_handles_oc.f8449(var70)) ? SubLObjectFactory.makeBoolean(module0562.NIL == module0038.f2684(constants_high_oc.f10743(var70), (SubLObject)module0562.$ic110$) && module0562.NIL == module0038.f2684(constants_high_oc.f10743(var70), (SubLObject)module0562.$ic111$) && module0562.NIL == module0038.f2684(constants_high_oc.f10743(var70), (SubLObject)module0562.$ic112$) && module0562.NIL == module0038.f2684(constants_high_oc.f10743(var70), (SubLObject)module0562.$ic113$) && module0562.NIL == module0038.f2684(constants_high_oc.f10743(var70), (SubLObject)module0562.$ic114$) && module0562.NIL == module0038.f2684(constants_high_oc.f10743(var70), (SubLObject)module0562.$ic115$)) : module0562.NIL));
    }
    
    public static SubLObject f34687() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0562.ZERO_INTEGER;
        final SubLObject var8;
        final SubLObject var7 = var8 = module0034.f1888();
        final SubLObject var9 = module0034.$g879$.currentBinding(var5);
        try {
            module0034.$g879$.bind(var8, var5);
            SubLObject var10 = (SubLObject)module0562.NIL;
            if (module0562.NIL != var8 && module0562.NIL == module0034.f1842(var8)) {
                var10 = module0034.f1869(var8);
                final SubLObject var11 = Threads.current_process();
                if (module0562.NIL == var10) {
                    module0034.f1873(var8, var11);
                }
                else if (!var10.eql(var11)) {
                    Errors.error((SubLObject)module0562.$ic116$);
                }
            }
            try {
                final SubLObject var12 = module0139.$g1630$.getDynamicValue(var5);
                final SubLObject var6_254 = module0139.$g1631$.currentBinding(var5);
                final SubLObject var13 = module0139.$g1632$.currentBinding(var5);
                final SubLObject var14 = module0139.$g1630$.currentBinding(var5);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var12, (SubLObject)module0562.SIX_INTEGER), var5);
                    module0139.$g1632$.bind(module0139.f9016(var12), var5);
                    module0139.$g1630$.bind((SubLObject)module0562.T, var5);
                    final SubLObject var15 = module0076.f5287(module0563.f34761());
                    module0012.$g82$.setDynamicValue((SubLObject)module0562.$ic117$, var5);
                    module0012.$g73$.setDynamicValue(Time.get_universal_time(), var5);
                    module0012.$g83$.setDynamicValue(Sequences.length(var15), var5);
                    module0012.$g84$.setDynamicValue((SubLObject)module0562.ZERO_INTEGER, var5);
                    final SubLObject var6_255 = module0012.$g75$.currentBinding(var5);
                    final SubLObject var53_256 = module0012.$g76$.currentBinding(var5);
                    final SubLObject var59_257 = module0012.$g77$.currentBinding(var5);
                    final SubLObject var16 = module0012.$g78$.currentBinding(var5);
                    try {
                        module0012.$g75$.bind((SubLObject)module0562.ZERO_INTEGER, var5);
                        module0012.$g76$.bind((SubLObject)module0562.NIL, var5);
                        module0012.$g77$.bind((SubLObject)module0562.T, var5);
                        module0012.$g78$.bind(Time.get_universal_time(), var5);
                        module0012.f478(module0012.$g82$.getDynamicValue(var5));
                        SubLObject var17 = var15;
                        SubLObject var18 = (SubLObject)module0562.NIL;
                        var18 = var17.first();
                        while (module0562.NIL != var17) {
                            module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var5), module0012.$g83$.getDynamicValue(var5));
                            module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var5), (SubLObject)module0562.ONE_INTEGER), var5);
                            if (module0562.NIL != f34688(var18)) {
                                module0563.f34743(var18);
                                var6 = Numbers.add(var6, (SubLObject)module0562.ONE_INTEGER);
                            }
                            var17 = var17.rest();
                            var18 = var17.first();
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var16, var5);
                        module0012.$g77$.rebind(var59_257, var5);
                        module0012.$g76$.rebind(var53_256, var5);
                        module0012.$g75$.rebind(var6_255, var5);
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var14, var5);
                    module0139.$g1632$.rebind(var13, var5);
                    module0139.$g1631$.rebind(var6_254, var5);
                }
            }
            finally {
                final SubLObject var6_256 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0562.T, var5);
                    if (module0562.NIL != var8 && module0562.NIL == var10) {
                        module0034.f1873(var8, (SubLObject)module0562.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var6_256, var5);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var9, var5);
        }
        return var6;
    }
    
    public static SubLObject f34689() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0562.ZERO_INTEGER;
        final SubLObject var7 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
        try {
            module0147.$g2094$.bind((SubLObject)module0562.$ic51$, var5);
            module0147.$g2095$.bind(module0562.$ic52$, var5);
            final SubLObject var9 = constant_handles_oc.f8425();
            final SubLObject var10 = (SubLObject)module0562.$ic118$;
            final SubLObject var11 = module0065.f4733(var9);
            SubLObject var12 = (SubLObject)module0562.ZERO_INTEGER;
            assert module0562.NIL != Types.stringp(var10) : var10;
            final SubLObject var6_264 = module0012.$g75$.currentBinding(var5);
            final SubLObject var53_265 = module0012.$g76$.currentBinding(var5);
            final SubLObject var13 = module0012.$g77$.currentBinding(var5);
            final SubLObject var14 = module0012.$g78$.currentBinding(var5);
            try {
                module0012.$g75$.bind((SubLObject)module0562.ZERO_INTEGER, var5);
                module0012.$g76$.bind((SubLObject)module0562.NIL, var5);
                module0012.$g77$.bind((SubLObject)module0562.T, var5);
                module0012.$g78$.bind(Time.get_universal_time(), var5);
                module0012.f478(var10);
                final SubLObject var62_266 = var9;
                if (module0562.NIL == module0065.f4772(var62_266, (SubLObject)module0562.$ic54$)) {
                    final SubLObject var63_267 = var62_266;
                    if (module0562.NIL == module0065.f4775(var63_267, (SubLObject)module0562.$ic54$)) {
                        final SubLObject var15 = module0065.f4740(var63_267);
                        final SubLObject var16 = (SubLObject)module0562.NIL;
                        SubLObject var17;
                        SubLObject var18;
                        SubLObject var19;
                        SubLObject var20;
                        SubLObject var21;
                        SubLObject var22;
                        SubLObject var23;
                        SubLObject var24;
                        SubLObject var25;
                        SubLObject var26;
                        SubLObject var27;
                        SubLObject var28;
                        SubLObject var73_272;
                        SubLObject var74_273;
                        SubLObject var29;
                        SubLObject var76_274;
                        SubLObject var6_265;
                        SubLObject var30;
                        SubLObject var31;
                        for (var17 = Sequences.length(var15), var18 = (SubLObject)module0562.NIL, var18 = (SubLObject)module0562.ZERO_INTEGER; var18.numL(var17); var18 = Numbers.add(var18, (SubLObject)module0562.ONE_INTEGER)) {
                            var19 = ((module0562.NIL != var16) ? Numbers.subtract(var17, var18, (SubLObject)module0562.ONE_INTEGER) : var18);
                            var20 = Vectors.aref(var15, var19);
                            if (module0562.NIL == module0065.f4749(var20) || module0562.NIL == module0065.f4773((SubLObject)module0562.$ic54$)) {
                                if (module0562.NIL != module0065.f4749(var20)) {
                                    var20 = (SubLObject)module0562.$ic54$;
                                }
                                module0012.note_percent_progress(var12, var11);
                                var12 = Numbers.add(var12, (SubLObject)module0562.ONE_INTEGER);
                                if (module0562.NIL != module0563.f34723(var20) && (module0562.NIL != f34686(var20, module0562.$ic106$) || module0562.NIL != module0259.f16891(var20, module0562.$ic106$))) {
                                    var21 = (SubLObject)module0562.NIL;
                                    var22 = module0562.$ic86$;
                                    if (module0562.NIL != module0158.f10010(var20, (SubLObject)module0562.ONE_INTEGER, var22)) {
                                        var23 = module0158.f10011(var20, (SubLObject)module0562.ONE_INTEGER, var22);
                                        var24 = var21;
                                        var25 = (SubLObject)module0562.NIL;
                                        while (module0562.NIL == var24) {
                                            var26 = module0052.f3695(var23, var25);
                                            var27 = (SubLObject)SubLObjectFactory.makeBoolean(!var25.eql(var26));
                                            if (module0562.NIL != var27) {
                                                var28 = (SubLObject)module0562.NIL;
                                                try {
                                                    var28 = module0158.f10316(var26, (SubLObject)module0562.$ic120$, (SubLObject)module0562.NIL, (SubLObject)module0562.NIL);
                                                    var73_272 = var21;
                                                    var74_273 = (SubLObject)module0562.NIL;
                                                    while (module0562.NIL == var73_272) {
                                                        var29 = module0052.f3695(var28, var74_273);
                                                        var76_274 = (SubLObject)SubLObjectFactory.makeBoolean(!var74_273.eql(var29));
                                                        if (module0562.NIL != var76_274) {
                                                            var21 = module0563.f34742(var29);
                                                        }
                                                        var73_272 = (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL == var76_274 || module0562.NIL != var21);
                                                    }
                                                }
                                                finally {
                                                    var6_265 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0562.T, var5);
                                                        if (module0562.NIL != var28) {
                                                            module0158.f10319(var28);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var6_265, var5);
                                                    }
                                                }
                                            }
                                            var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL == var27 || module0562.NIL != var21);
                                        }
                                    }
                                    if (module0562.NIL == var21) {
                                        var30 = module0202.f12768(module0562.$ic86$, var20, module0562.$ic121$);
                                        Errors.warn((SubLObject)module0562.$ic122$, var20, var30);
                                        module0540.f33516(var30, module0562.$ic123$, (SubLObject)module0562.UNPROVIDED);
                                        var31 = module0288.f19338(var30, module0562.$ic123$);
                                        if (module0562.NIL != assertion_handles_oc.f11035(var31)) {
                                            module0563.f34766(var31);
                                        }
                                        else {
                                            Errors.warn((SubLObject)module0562.$ic124$, var30);
                                        }
                                        var6 = Numbers.add(var6, (SubLObject)module0562.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                    }
                    final SubLObject var85_277 = var62_266;
                    if (module0562.NIL == module0065.f4777(var85_277) || module0562.NIL == module0065.f4773((SubLObject)module0562.$ic54$)) {
                        final SubLObject var32 = module0065.f4738(var85_277);
                        SubLObject var33 = module0065.f4739(var85_277);
                        final SubLObject var34 = module0065.f4734(var85_277);
                        final SubLObject var35 = (SubLObject)((module0562.NIL != module0065.f4773((SubLObject)module0562.$ic54$)) ? module0562.NIL : module0562.$ic54$);
                        while (var33.numL(var34)) {
                            final SubLObject var36 = Hashtables.gethash_without_values(var33, var32, var35);
                            if (module0562.NIL == module0065.f4773((SubLObject)module0562.$ic54$) || module0562.NIL == module0065.f4749(var36)) {
                                module0012.note_percent_progress(var12, var11);
                                var12 = Numbers.add(var12, (SubLObject)module0562.ONE_INTEGER);
                                if (module0562.NIL != module0563.f34723(var36) && (module0562.NIL != f34686(var36, module0562.$ic106$) || module0562.NIL != module0259.f16891(var36, module0562.$ic106$))) {
                                    SubLObject var37 = (SubLObject)module0562.NIL;
                                    final SubLObject var38 = module0562.$ic86$;
                                    if (module0562.NIL != module0158.f10010(var36, (SubLObject)module0562.ONE_INTEGER, var38)) {
                                        final SubLObject var39 = module0158.f10011(var36, (SubLObject)module0562.ONE_INTEGER, var38);
                                        SubLObject var40 = var37;
                                        final SubLObject var41 = (SubLObject)module0562.NIL;
                                        while (module0562.NIL == var40) {
                                            final SubLObject var42 = module0052.f3695(var39, var41);
                                            final SubLObject var43 = (SubLObject)SubLObjectFactory.makeBoolean(!var41.eql(var42));
                                            if (module0562.NIL != var43) {
                                                SubLObject var44 = (SubLObject)module0562.NIL;
                                                try {
                                                    var44 = module0158.f10316(var42, (SubLObject)module0562.$ic120$, (SubLObject)module0562.NIL, (SubLObject)module0562.NIL);
                                                    SubLObject var73_273 = var37;
                                                    final SubLObject var74_274 = (SubLObject)module0562.NIL;
                                                    while (module0562.NIL == var73_273) {
                                                        final SubLObject var45 = module0052.f3695(var44, var74_274);
                                                        final SubLObject var76_275 = (SubLObject)SubLObjectFactory.makeBoolean(!var74_274.eql(var45));
                                                        if (module0562.NIL != var76_275) {
                                                            var37 = module0563.f34742(var45);
                                                        }
                                                        var73_273 = (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL == var76_275 || module0562.NIL != var37);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var6_266 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0562.T, var5);
                                                        if (module0562.NIL != var44) {
                                                            module0158.f10319(var44);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var6_266, var5);
                                                    }
                                                }
                                            }
                                            var40 = (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL == var43 || module0562.NIL != var37);
                                        }
                                    }
                                    if (module0562.NIL == var37) {
                                        final SubLObject var46 = module0202.f12768(module0562.$ic86$, var36, module0562.$ic121$);
                                        Errors.warn((SubLObject)module0562.$ic122$, var36, var46);
                                        module0540.f33516(var46, module0562.$ic123$, (SubLObject)module0562.UNPROVIDED);
                                        final SubLObject var47 = module0288.f19338(var46, module0562.$ic123$);
                                        if (module0562.NIL != assertion_handles_oc.f11035(var47)) {
                                            module0563.f34766(var47);
                                        }
                                        else {
                                            Errors.warn((SubLObject)module0562.$ic124$, var46);
                                        }
                                        var6 = Numbers.add(var6, (SubLObject)module0562.ONE_INTEGER);
                                    }
                                }
                            }
                            var33 = Numbers.add(var33, (SubLObject)module0562.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var14, var5);
                module0012.$g77$.rebind(var13, var5);
                module0012.$g76$.rebind(var53_265, var5);
                module0012.$g75$.rebind(var6_264, var5);
            }
        }
        finally {
            module0147.$g2095$.rebind(var8, var5);
            module0147.$g2094$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f34690(final SubLObject var258) {
        final SubLObject var259 = module0538.f33367(var258, (SubLObject)module0562.UNPROVIDED);
        SubLObject var261;
        final SubLObject var260 = var261 = module0035.f2259((SubLObject)module0562.$ic126$, var259, (SubLObject)module0562.UNPROVIDED);
        SubLObject var262 = (SubLObject)module0562.NIL;
        var262 = var261.first();
        while (module0562.NIL != var261) {
            if (module0562.NIL != f34688(var262)) {
                return (SubLObject)module0562.T;
            }
            var261 = var261.rest();
            var262 = var261.first();
        }
        final SubLObject var263 = module0161.f10557(module0178.f11287(var258));
        if (module0562.NIL != module0259.f16891(var263, module0562.$ic127$) || module0562.NIL != module0259.f16891(var263, module0562.$ic128$) || var263.eql(module0562.$ic129$)) {
            return (SubLObject)module0562.NIL;
        }
        if (module0562.NIL != module0178.f11284(var258)) {
            final SubLObject var264 = module0178.f11332(var258);
            if (var264.eql(module0562.$ic130$) || var264.eql(module0562.$ic131$) || (var264.eql(module0562.$ic86$) && (module0178.f11335(var258).eql(module0562.$ic121$) || module0178.f11335(var258).eql(module0562.$ic132$))) || module0562.NIL != module0259.f16891(var264, module0562.$ic133$)) {
                return (SubLObject)module0562.NIL;
            }
        }
        final SubLObject var265 = module0178.f11326(var258, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
        SubLObject var266 = (SubLObject)module0562.NIL;
        if (module0562.NIL == var266) {
            SubLObject var267 = var265;
            SubLObject var268 = (SubLObject)module0562.NIL;
            var268 = var267.first();
            while (module0562.NIL == var266 && module0562.NIL != var267) {
                if (module0562.NIL != f34691(var268)) {
                    var266 = (SubLObject)module0562.T;
                }
                var267 = var267.rest();
                var268 = var267.first();
            }
        }
        if (module0562.NIL == var266) {
            return (SubLObject)module0562.NIL;
        }
        return (SubLObject)module0562.T;
    }
    
    public static SubLObject f34688(final SubLObject var258) {
        final SubLThread var259 = SubLProcess.currentSubLThread();
        final SubLObject var260 = module0034.$g879$.getDynamicValue(var259);
        SubLObject var261 = (SubLObject)module0562.NIL;
        if (module0562.NIL == var260) {
            return f34690(var258);
        }
        var261 = module0034.f1857(var260, (SubLObject)module0562.$ic125$, (SubLObject)module0562.UNPROVIDED);
        if (module0562.NIL == var261) {
            var261 = module0034.f1807(module0034.f1842(var260), (SubLObject)module0562.$ic125$, (SubLObject)module0562.ONE_INTEGER, (SubLObject)module0562.NIL, (SubLObject)module0562.EQ, (SubLObject)module0562.UNPROVIDED);
            module0034.f1860(var260, (SubLObject)module0562.$ic125$, var261);
        }
        SubLObject var262 = module0034.f1814(var261, var258, (SubLObject)module0562.$ic134$);
        if (var262 == module0562.$ic134$) {
            var262 = Values.arg2(var259.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f34690(var258)));
            module0034.f1816(var261, var258, var262, (SubLObject)module0562.UNPROVIDED);
        }
        return module0034.f1959(var262);
    }
    
    public static SubLObject f34691(final SubLObject var70) {
        return (SubLObject)SubLObjectFactory.makeBoolean((module0562.NIL != module0259.f16891(var70, module0562.$ic135$) || module0562.NIL != module0259.f16891(var70, module0562.$ic136$) || module0562.NIL != module0259.f16891(var70, module0562.$ic137$)) && module0562.NIL == f34686(var70, module0562.$ic138$) && module0562.NIL == f34686(var70, module0562.$ic139$) && module0562.NIL == module0259.f16891(var70, module0562.$ic140$) && (module0562.NIL == module0259.f16891(var70, module0562.$ic141$) || module0562.NIL != module0259.f16891(var70, module0562.$ic142$)));
    }
    
    public static SubLObject f34692(final SubLObject var291, SubLObject var39) {
        if (var39 == module0562.UNPROVIDED) {
            var39 = (SubLObject)module0562.NIL;
        }
        final SubLThread var292 = SubLProcess.currentSubLThread();
        final SubLObject var293 = Hashtables.make_hash_table(module0549.f33901(var291), Symbols.symbol_function((SubLObject)module0562.EQ), (SubLObject)module0562.UNPROVIDED);
        final SubLObject var294 = Hashtables.make_hash_table((SubLObject)module0562.SIXTEEN_INTEGER, Symbols.symbol_function((SubLObject)module0562.EQ), (SubLObject)module0562.UNPROVIDED);
        final SubLObject var295 = module0055.f4017();
        final SubLObject var296 = module0055.f4017();
        final SubLObject var297 = Hashtables.make_hash_table((SubLObject)module0562.SIXTEEN_INTEGER, Symbols.symbol_function((SubLObject)module0562.EQ), (SubLObject)module0562.UNPROVIDED);
        SubLObject var298 = (SubLObject)module0562.NIL;
        final SubLObject var299 = var39;
        final SubLObject var300 = module0147.$g2095$.currentBinding(var292);
        final SubLObject var301 = module0147.$g2094$.currentBinding(var292);
        final SubLObject var302 = module0147.$g2096$.currentBinding(var292);
        try {
            module0147.$g2095$.bind(module0147.f9545(var299), var292);
            module0147.$g2094$.bind(module0147.f9546(var299), var292);
            module0147.$g2096$.bind(module0147.f9549(var299), var292);
            module0055.f4021(var291, var295);
            while (module0562.NIL == module0055.f4019(var295) || module0562.NIL == module0055.f4019(var296)) {
                while (module0562.NIL == module0055.f4019(var295)) {
                    final SubLObject var303 = module0055.f4023(var295);
                    if (module0562.NIL == Hashtables.gethash_without_values(var303, var293, (SubLObject)module0562.UNPROVIDED)) {
                        Hashtables.sethash(var303, var293, (SubLObject)module0562.T);
                        final SubLObject var6_299 = module0137.$g1605$.currentBinding(var292);
                        try {
                            module0137.$g1605$.bind((module0562.NIL != module0137.f8955(module0562.$ic130$)) ? module0137.f8955(module0562.$ic130$) : module0137.$g1605$.getDynamicValue(var292), var292);
                            final SubLObject var304 = module0242.f15664(var303, module0137.f8955(module0562.$ic130$));
                            if (module0562.NIL != var304) {
                                SubLObject var305 = module0244.f15784(module0137.f8955(module0562.$ic130$));
                                SubLObject var306 = (SubLObject)module0562.NIL;
                                var306 = var305.first();
                                while (module0562.NIL != var305) {
                                    final SubLObject var307 = module0245.f15834(var304, var306, module0137.f8955(module0562.$ic130$));
                                    if (module0562.NIL != var307 && var306.eql(module0244.f15780(module0137.f8955(module0562.$ic130$)))) {
                                        SubLObject var308;
                                        for (var308 = module0066.f4838(module0067.f4891(var307)); module0562.NIL == module0066.f4841(var308); var308 = module0066.f4840(var308)) {
                                            var292.resetMultipleValues();
                                            final SubLObject var303_304 = module0066.f4839(var308);
                                            final SubLObject var309 = var292.secondMultipleValue();
                                            var292.resetMultipleValues();
                                            SubLObject var153_306;
                                            for (var153_306 = module0066.f4838(module0067.f4891(var309)); module0562.NIL == module0066.f4841(var153_306); var153_306 = module0066.f4840(var153_306)) {
                                                var292.resetMultipleValues();
                                                final SubLObject var310 = module0066.f4839(var153_306);
                                                final SubLObject var311 = var292.secondMultipleValue();
                                                var292.resetMultipleValues();
                                                if (module0562.NIL != module0141.f9279(var310)) {
                                                    final SubLObject var312 = var311;
                                                    if (module0562.NIL != module0077.f5302(var312)) {
                                                        final SubLObject var313 = module0077.f5333(var312);
                                                        SubLObject var314;
                                                        SubLObject var315;
                                                        SubLObject var316;
                                                        for (var314 = module0032.f1741(var313), var315 = (SubLObject)module0562.NIL, var315 = module0032.f1742(var314, var313); module0562.NIL == module0032.f1744(var314, var315); var315 = module0032.f1743(var315)) {
                                                            var316 = module0032.f1745(var314, var315);
                                                            if (module0562.NIL != module0032.f1746(var315, var316) && module0562.NIL != module0147.f9507(var303_304) && module0562.NIL == Hashtables.gethash_without_values(var316, var297, (SubLObject)module0562.UNPROVIDED)) {
                                                                var298 = (SubLObject)ConsesLow.cons(var316, var298);
                                                                Hashtables.sethash(var316, var297, (SubLObject)module0562.T);
                                                            }
                                                        }
                                                    }
                                                    else if (var312.isList()) {
                                                        SubLObject var317 = var312;
                                                        SubLObject var318 = (SubLObject)module0562.NIL;
                                                        var318 = var317.first();
                                                        while (module0562.NIL != var317) {
                                                            if (module0562.NIL != module0147.f9507(var303_304) && module0562.NIL == Hashtables.gethash_without_values(var318, var297, (SubLObject)module0562.UNPROVIDED)) {
                                                                var298 = (SubLObject)ConsesLow.cons(var318, var298);
                                                                Hashtables.sethash(var318, var297, (SubLObject)module0562.T);
                                                            }
                                                            var317 = var317.rest();
                                                            var318 = var317.first();
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)module0562.$ic98$, var312);
                                                    }
                                                }
                                            }
                                            module0066.f4842(var153_306);
                                        }
                                        module0066.f4842(var308);
                                    }
                                    var305 = var305.rest();
                                    var306 = var305.first();
                                }
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var6_299, var292);
                        }
                        final SubLObject var6_300 = module0137.$g1605$.currentBinding(var292);
                        try {
                            module0137.$g1605$.bind((module0562.NIL != module0137.f8955(module0562.$ic143$)) ? module0137.f8955(module0562.$ic143$) : module0137.$g1605$.getDynamicValue(var292), var292);
                            final SubLObject var304 = module0242.f15664(var303, module0137.f8955(module0562.$ic143$));
                            if (module0562.NIL != var304) {
                                SubLObject var305 = module0244.f15784(module0137.f8955(module0562.$ic143$));
                                SubLObject var306 = (SubLObject)module0562.NIL;
                                var306 = var305.first();
                                while (module0562.NIL != var305) {
                                    final SubLObject var307 = module0245.f15834(var304, var306, module0137.f8955(module0562.$ic143$));
                                    if (module0562.NIL != var307 && var306.eql(module0244.f15780(module0137.f8955(module0562.$ic143$)))) {
                                        SubLObject var308;
                                        for (var308 = module0066.f4838(module0067.f4891(var307)); module0562.NIL == module0066.f4841(var308); var308 = module0066.f4840(var308)) {
                                            var292.resetMultipleValues();
                                            final SubLObject var311_312 = module0066.f4839(var308);
                                            final SubLObject var309 = var292.secondMultipleValue();
                                            var292.resetMultipleValues();
                                            SubLObject var153_307;
                                            for (var153_307 = module0066.f4838(module0067.f4891(var309)); module0562.NIL == module0066.f4841(var153_307); var153_307 = module0066.f4840(var153_307)) {
                                                var292.resetMultipleValues();
                                                final SubLObject var319 = module0066.f4839(var153_307);
                                                final SubLObject var311 = var292.secondMultipleValue();
                                                var292.resetMultipleValues();
                                                if (module0562.NIL != module0141.f9279(var319)) {
                                                    final SubLObject var312 = var311;
                                                    if (module0562.NIL != module0077.f5302(var312)) {
                                                        final SubLObject var313 = module0077.f5333(var312);
                                                        SubLObject var314;
                                                        SubLObject var315;
                                                        SubLObject var320;
                                                        for (var314 = module0032.f1741(var313), var315 = (SubLObject)module0562.NIL, var315 = module0032.f1742(var314, var313); module0562.NIL == module0032.f1744(var314, var315); var315 = module0032.f1743(var315)) {
                                                            var320 = module0032.f1745(var314, var315);
                                                            if (module0562.NIL != module0032.f1746(var315, var320) && module0562.NIL != module0147.f9507(var311_312) && module0562.NIL == Hashtables.gethash_without_values(var320, var293, (SubLObject)module0562.UNPROVIDED)) {
                                                                module0055.f4021(var320, var295);
                                                            }
                                                        }
                                                    }
                                                    else if (var312.isList()) {
                                                        SubLObject var317 = var312;
                                                        SubLObject var321 = (SubLObject)module0562.NIL;
                                                        var321 = var317.first();
                                                        while (module0562.NIL != var317) {
                                                            if (module0562.NIL != module0147.f9507(var311_312) && module0562.NIL == Hashtables.gethash_without_values(var321, var293, (SubLObject)module0562.UNPROVIDED)) {
                                                                module0055.f4021(var321, var295);
                                                            }
                                                            var317 = var317.rest();
                                                            var321 = var317.first();
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)module0562.$ic98$, var312);
                                                    }
                                                }
                                            }
                                            module0066.f4842(var153_307);
                                        }
                                        module0066.f4842(var308);
                                    }
                                    var305 = var305.rest();
                                    var306 = var305.first();
                                }
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var6_300, var292);
                        }
                        SubLObject var322 = (SubLObject)module0562.NIL;
                        final SubLObject var323 = module0562.$ic144$;
                        if (module0562.NIL == module0158.f10010(var303, (SubLObject)module0562.TWO_INTEGER, var323)) {
                            continue;
                        }
                        final SubLObject var324 = module0158.f10011(var303, (SubLObject)module0562.TWO_INTEGER, var323);
                        SubLObject var325 = (SubLObject)module0562.NIL;
                        final SubLObject var326 = (SubLObject)module0562.NIL;
                        while (module0562.NIL == var325) {
                            final SubLObject var327 = module0052.f3695(var324, var326);
                            final SubLObject var328 = (SubLObject)SubLObjectFactory.makeBoolean(!var326.eql(var327));
                            if (module0562.NIL != var328) {
                                SubLObject var329 = (SubLObject)module0562.NIL;
                                try {
                                    var329 = module0158.f10316(var327, (SubLObject)module0562.$ic120$, (SubLObject)module0562.$ic145$, (SubLObject)module0562.NIL);
                                    SubLObject var73_317 = (SubLObject)module0562.NIL;
                                    final SubLObject var74_318 = (SubLObject)module0562.NIL;
                                    while (module0562.NIL == var73_317) {
                                        final SubLObject var330 = module0052.f3695(var329, var74_318);
                                        final SubLObject var76_320 = (SubLObject)SubLObjectFactory.makeBoolean(!var74_318.eql(var330));
                                        if (module0562.NIL != var76_320) {
                                            var322 = module0178.f11331(var330, (SubLObject)module0562.ONE_INTEGER);
                                            if (module0562.NIL == Hashtables.gethash_without_values(var322, var294, (SubLObject)module0562.UNPROVIDED)) {
                                                module0055.f4021(var322, var296);
                                            }
                                        }
                                        var73_317 = (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL == var76_320);
                                    }
                                }
                                finally {
                                    final SubLObject var6_301 = Threads.$is_thread_performing_cleanupP$.currentBinding(var292);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0562.T, var292);
                                        if (module0562.NIL != var329) {
                                            module0158.f10319(var329);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var6_301, var292);
                                    }
                                }
                            }
                            var325 = (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL == var328);
                        }
                    }
                }
                while (module0562.NIL == module0055.f4019(var296)) {
                    final SubLObject var331 = module0055.f4023(var296);
                    if (module0562.NIL == Hashtables.gethash_without_values(var331, var294, (SubLObject)module0562.UNPROVIDED)) {
                        Hashtables.sethash(var331, var294, (SubLObject)module0562.T);
                        final SubLObject var6_302 = module0137.$g1605$.currentBinding(var292);
                        try {
                            module0137.$g1605$.bind((module0562.NIL != module0137.f8955(module0562.$ic86$)) ? module0137.f8955(module0562.$ic86$) : module0137.$g1605$.getDynamicValue(var292), var292);
                            final SubLObject var304 = module0242.f15664(var331, module0137.f8955(module0562.$ic86$));
                            if (module0562.NIL != var304) {
                                SubLObject var305 = module0244.f15784(module0137.f8955(module0562.$ic86$));
                                SubLObject var306 = (SubLObject)module0562.NIL;
                                var306 = var305.first();
                                while (module0562.NIL != var305) {
                                    final SubLObject var307 = module0245.f15834(var304, var306, module0137.f8955(module0562.$ic86$));
                                    if (module0562.NIL != var307 && var306.eql(module0244.f15780(module0137.f8955(module0562.$ic86$)))) {
                                        SubLObject var308;
                                        for (var308 = module0066.f4838(module0067.f4891(var307)); module0562.NIL == module0066.f4841(var308); var308 = module0066.f4840(var308)) {
                                            var292.resetMultipleValues();
                                            final SubLObject var324_325 = module0066.f4839(var308);
                                            final SubLObject var309 = var292.secondMultipleValue();
                                            var292.resetMultipleValues();
                                            SubLObject var153_308;
                                            for (var153_308 = module0066.f4838(module0067.f4891(var309)); module0562.NIL == module0066.f4841(var153_308); var153_308 = module0066.f4840(var153_308)) {
                                                var292.resetMultipleValues();
                                                final SubLObject var332 = module0066.f4839(var153_308);
                                                final SubLObject var311 = var292.secondMultipleValue();
                                                var292.resetMultipleValues();
                                                if (module0562.NIL != module0141.f9279(var332)) {
                                                    final SubLObject var312 = var311;
                                                    if (module0562.NIL != module0077.f5302(var312)) {
                                                        final SubLObject var313 = module0077.f5333(var312);
                                                        SubLObject var314;
                                                        SubLObject var315;
                                                        SubLObject var316;
                                                        for (var314 = module0032.f1741(var313), var315 = (SubLObject)module0562.NIL, var315 = module0032.f1742(var314, var313); module0562.NIL == module0032.f1744(var314, var315); var315 = module0032.f1743(var315)) {
                                                            var316 = module0032.f1745(var314, var315);
                                                            if (module0562.NIL != module0032.f1746(var315, var316) && module0562.NIL != module0147.f9507(var324_325) && module0562.NIL == Hashtables.gethash_without_values(var316, var297, (SubLObject)module0562.UNPROVIDED)) {
                                                                var298 = (SubLObject)ConsesLow.cons(var316, var298);
                                                                Hashtables.sethash(var316, var297, (SubLObject)module0562.T);
                                                            }
                                                        }
                                                    }
                                                    else if (var312.isList()) {
                                                        SubLObject var317 = var312;
                                                        SubLObject var318 = (SubLObject)module0562.NIL;
                                                        var318 = var317.first();
                                                        while (module0562.NIL != var317) {
                                                            if (module0562.NIL != module0147.f9507(var324_325) && module0562.NIL == Hashtables.gethash_without_values(var318, var297, (SubLObject)module0562.UNPROVIDED)) {
                                                                var298 = (SubLObject)ConsesLow.cons(var318, var298);
                                                                Hashtables.sethash(var318, var297, (SubLObject)module0562.T);
                                                            }
                                                            var317 = var317.rest();
                                                            var318 = var317.first();
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)module0562.$ic98$, var312);
                                                    }
                                                }
                                            }
                                            module0066.f4842(var153_308);
                                        }
                                        module0066.f4842(var308);
                                    }
                                    var305 = var305.rest();
                                    var306 = var305.first();
                                }
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var6_302, var292);
                        }
                        SubLObject var333 = module0248.f15995(var331);
                        SubLObject var334 = (SubLObject)module0562.NIL;
                        var334 = var333.first();
                        while (module0562.NIL != var333) {
                            SubLObject var336;
                            final SubLObject var335 = var336 = var334;
                            SubLObject var337 = (SubLObject)module0562.NIL;
                            SubLObject var324_326 = (SubLObject)module0562.NIL;
                            SubLObject var338 = (SubLObject)module0562.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var336, var335, (SubLObject)module0562.$ic146$);
                            var337 = var336.first();
                            var336 = var336.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var336, var335, (SubLObject)module0562.$ic146$);
                            var324_326 = var336.first();
                            var336 = var336.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var336, var335, (SubLObject)module0562.$ic146$);
                            var338 = var336.first();
                            var336 = var336.rest();
                            if (module0562.NIL == var336) {
                                if (module0562.NIL != module0141.f9279(var338) && module0562.NIL != module0147.f9507(var324_326) && module0562.NIL == Hashtables.gethash_without_values(var337, var297, (SubLObject)module0562.UNPROVIDED)) {
                                    var298 = (SubLObject)ConsesLow.cons(var337, var298);
                                    Hashtables.sethash(var337, var297, (SubLObject)module0562.T);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var335, (SubLObject)module0562.$ic146$);
                            }
                            var333 = var333.rest();
                            var334 = var333.first();
                        }
                        final SubLObject var6_303 = module0137.$g1605$.currentBinding(var292);
                        try {
                            module0137.$g1605$.bind((module0562.NIL != module0137.f8955(module0562.$ic143$)) ? module0137.f8955(module0562.$ic143$) : module0137.$g1605$.getDynamicValue(var292), var292);
                            final SubLObject var304 = module0242.f15664(var331, module0137.f8955(module0562.$ic143$));
                            if (module0562.NIL == var304) {
                                continue;
                            }
                            SubLObject var305 = module0244.f15784(module0137.f8955(module0562.$ic143$));
                            SubLObject var306 = (SubLObject)module0562.NIL;
                            var306 = var305.first();
                            while (module0562.NIL != var305) {
                                final SubLObject var307 = module0245.f15834(var304, var306, module0137.f8955(module0562.$ic143$));
                                if (module0562.NIL != var307 && var306.eql(module0244.f15780(module0137.f8955(module0562.$ic143$)))) {
                                    SubLObject var308;
                                    for (var308 = module0066.f4838(module0067.f4891(var307)); module0562.NIL == module0066.f4841(var308); var308 = module0066.f4840(var308)) {
                                        var292.resetMultipleValues();
                                        final SubLObject var311_313 = module0066.f4839(var308);
                                        final SubLObject var309 = var292.secondMultipleValue();
                                        var292.resetMultipleValues();
                                        SubLObject var153_309;
                                        for (var153_309 = module0066.f4838(module0067.f4891(var309)); module0562.NIL == module0066.f4841(var153_309); var153_309 = module0066.f4840(var153_309)) {
                                            var292.resetMultipleValues();
                                            final SubLObject var319 = module0066.f4839(var153_309);
                                            final SubLObject var311 = var292.secondMultipleValue();
                                            var292.resetMultipleValues();
                                            if (module0562.NIL != module0141.f9279(var319)) {
                                                final SubLObject var312 = var311;
                                                if (module0562.NIL != module0077.f5302(var312)) {
                                                    final SubLObject var313 = module0077.f5333(var312);
                                                    SubLObject var314;
                                                    SubLObject var315;
                                                    SubLObject var339;
                                                    for (var314 = module0032.f1741(var313), var315 = (SubLObject)module0562.NIL, var315 = module0032.f1742(var314, var313); module0562.NIL == module0032.f1744(var314, var315); var315 = module0032.f1743(var315)) {
                                                        var339 = module0032.f1745(var314, var315);
                                                        if (module0562.NIL != module0032.f1746(var315, var339) && module0562.NIL != module0147.f9507(var311_313) && module0562.NIL == Hashtables.gethash_without_values(var339, var294, (SubLObject)module0562.UNPROVIDED)) {
                                                            module0055.f4021(var339, var296);
                                                        }
                                                    }
                                                }
                                                else if (var312.isList()) {
                                                    SubLObject var317 = var312;
                                                    SubLObject var340 = (SubLObject)module0562.NIL;
                                                    var340 = var317.first();
                                                    while (module0562.NIL != var317) {
                                                        if (module0562.NIL != module0147.f9507(var311_313) && module0562.NIL == Hashtables.gethash_without_values(var340, var294, (SubLObject)module0562.UNPROVIDED)) {
                                                            module0055.f4021(var340, var296);
                                                        }
                                                        var317 = var317.rest();
                                                        var340 = var317.first();
                                                    }
                                                }
                                                else {
                                                    Errors.error((SubLObject)module0562.$ic98$, var312);
                                                }
                                            }
                                        }
                                        module0066.f4842(var153_309);
                                    }
                                    module0066.f4842(var308);
                                }
                                var305 = var305.rest();
                                var306 = var305.first();
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var6_303, var292);
                        }
                    }
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var302, var292);
            module0147.$g2094$.rebind(var301, var292);
            module0147.$g2095$.rebind(var300, var292);
        }
        return Sequences.nreverse(var298);
    }
    
    public static SubLObject f34693(final SubLObject var105, final SubLObject var291, SubLObject var39) {
        if (var39 == module0562.UNPROVIDED) {
            var39 = (SubLObject)module0562.NIL;
        }
        final SubLThread var292 = SubLProcess.currentSubLThread();
        final SubLObject var293 = module0077.f5313(Symbols.symbol_function((SubLObject)module0562.EQ), module0549.f33894(var291));
        final SubLObject var294 = module0077.f5313(Symbols.symbol_function((SubLObject)module0562.EQ), module0549.f33894(var291));
        final SubLObject var295 = module0055.f4017();
        final SubLObject var296 = module0055.f4017();
        SubLObject var297 = (SubLObject)module0562.NIL;
        final SubLObject var298 = var39;
        final SubLObject var299 = module0147.$g2095$.currentBinding(var292);
        final SubLObject var300 = module0147.$g2094$.currentBinding(var292);
        final SubLObject var301 = module0147.$g2096$.currentBinding(var292);
        try {
            module0147.$g2095$.bind(module0147.f9545(var298), var292);
            module0147.$g2094$.bind(module0147.f9546(var298), var292);
            module0147.$g2096$.bind(module0147.f9549(var298), var292);
            final SubLObject var6_339 = module0137.$g1605$.currentBinding(var292);
            try {
                module0137.$g1605$.bind((module0562.NIL != module0137.f8955(module0562.$ic130$)) ? module0137.f8955(module0562.$ic130$) : module0137.$g1605$.getDynamicValue(var292), var292);
                final SubLObject var302 = module0242.f15664(var105, module0137.f8955(module0562.$ic130$));
                if (module0562.NIL != var302) {
                    SubLObject var303 = module0244.f15784(module0137.f8955(module0562.$ic130$));
                    SubLObject var304 = (SubLObject)module0562.NIL;
                    var304 = var303.first();
                    while (module0562.NIL != var303) {
                        final SubLObject var305 = module0245.f15834(var302, var304, module0137.f8955(module0562.$ic130$));
                        if (module0562.NIL != var305 && var304.eql(module0244.f15778(module0137.f8955(module0562.$ic130$)))) {
                            SubLObject var306;
                            for (var306 = module0066.f4838(module0067.f4891(var305)); module0562.NIL == module0066.f4841(var306); var306 = module0066.f4840(var306)) {
                                var292.resetMultipleValues();
                                final SubLObject var342_343 = module0066.f4839(var306);
                                final SubLObject var307 = var292.secondMultipleValue();
                                var292.resetMultipleValues();
                                SubLObject var153_345;
                                for (var153_345 = module0066.f4838(module0067.f4891(var307)); module0562.NIL == module0066.f4841(var153_345); var153_345 = module0066.f4840(var153_345)) {
                                    var292.resetMultipleValues();
                                    final SubLObject var308 = module0066.f4839(var153_345);
                                    final SubLObject var309 = var292.secondMultipleValue();
                                    var292.resetMultipleValues();
                                    if (module0562.NIL != module0141.f9279(var308)) {
                                        final SubLObject var310 = var309;
                                        if (module0562.NIL != module0077.f5302(var310)) {
                                            final SubLObject var311 = module0077.f5333(var310);
                                            SubLObject var312;
                                            SubLObject var313;
                                            SubLObject var314;
                                            for (var312 = module0032.f1741(var311), var313 = (SubLObject)module0562.NIL, var313 = module0032.f1742(var312, var311); module0562.NIL == module0032.f1744(var312, var313); var313 = module0032.f1743(var313)) {
                                                var314 = module0032.f1745(var312, var313);
                                                if (module0562.NIL != module0032.f1746(var313, var314) && module0562.NIL != module0147.f9507(var342_343)) {
                                                    module0055.f4021(var314, var295);
                                                }
                                            }
                                        }
                                        else if (var310.isList()) {
                                            SubLObject var315 = var310;
                                            SubLObject var316 = (SubLObject)module0562.NIL;
                                            var316 = var315.first();
                                            while (module0562.NIL != var315) {
                                                if (module0562.NIL != module0147.f9507(var342_343)) {
                                                    module0055.f4021(var316, var295);
                                                }
                                                var315 = var315.rest();
                                                var316 = var315.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)module0562.$ic98$, var310);
                                        }
                                    }
                                }
                                module0066.f4842(var153_345);
                            }
                            module0066.f4842(var306);
                        }
                        var303 = var303.rest();
                        var304 = var303.first();
                    }
                }
            }
            finally {
                module0137.$g1605$.rebind(var6_339, var292);
            }
            final SubLObject var6_340 = module0137.$g1605$.currentBinding(var292);
            try {
                module0137.$g1605$.bind((module0562.NIL != module0137.f8955(module0562.$ic86$)) ? module0137.f8955(module0562.$ic86$) : module0137.$g1605$.getDynamicValue(var292), var292);
                final SubLObject var302 = module0242.f15664(var105, module0137.f8955(module0562.$ic86$));
                if (module0562.NIL != var302) {
                    SubLObject var303 = module0244.f15784(module0137.f8955(module0562.$ic86$));
                    SubLObject var304 = (SubLObject)module0562.NIL;
                    var304 = var303.first();
                    while (module0562.NIL != var303) {
                        final SubLObject var305 = module0245.f15834(var302, var304, module0137.f8955(module0562.$ic86$));
                        if (module0562.NIL != var305 && var304.eql(module0244.f15778(module0137.f8955(module0562.$ic86$)))) {
                            SubLObject var306;
                            for (var306 = module0066.f4838(module0067.f4891(var305)); module0562.NIL == module0066.f4841(var306); var306 = module0066.f4840(var306)) {
                                var292.resetMultipleValues();
                                final SubLObject var350_351 = module0066.f4839(var306);
                                final SubLObject var307 = var292.secondMultipleValue();
                                var292.resetMultipleValues();
                                SubLObject var153_346;
                                for (var153_346 = module0066.f4838(module0067.f4891(var307)); module0562.NIL == module0066.f4841(var153_346); var153_346 = module0066.f4840(var153_346)) {
                                    var292.resetMultipleValues();
                                    final SubLObject var317 = module0066.f4839(var153_346);
                                    final SubLObject var309 = var292.secondMultipleValue();
                                    var292.resetMultipleValues();
                                    if (module0562.NIL != module0141.f9279(var317)) {
                                        final SubLObject var310 = var309;
                                        if (module0562.NIL != module0077.f5302(var310)) {
                                            final SubLObject var311 = module0077.f5333(var310);
                                            SubLObject var312;
                                            SubLObject var313;
                                            SubLObject var318;
                                            for (var312 = module0032.f1741(var311), var313 = (SubLObject)module0562.NIL, var313 = module0032.f1742(var312, var311); module0562.NIL == module0032.f1744(var312, var313); var313 = module0032.f1743(var313)) {
                                                var318 = module0032.f1745(var312, var313);
                                                if (module0562.NIL != module0032.f1746(var313, var318) && module0562.NIL != module0147.f9507(var350_351)) {
                                                    module0055.f4021(var318, var296);
                                                }
                                            }
                                        }
                                        else if (var310.isList()) {
                                            SubLObject var315 = var310;
                                            SubLObject var319 = (SubLObject)module0562.NIL;
                                            var319 = var315.first();
                                            while (module0562.NIL != var315) {
                                                if (module0562.NIL != module0147.f9507(var350_351)) {
                                                    module0055.f4021(var319, var296);
                                                }
                                                var315 = var315.rest();
                                                var319 = var315.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)module0562.$ic98$, var310);
                                        }
                                    }
                                }
                                module0066.f4842(var153_346);
                            }
                            module0066.f4842(var306);
                        }
                        var303 = var303.rest();
                        var304 = var303.first();
                    }
                }
            }
            finally {
                module0137.$g1605$.rebind(var6_340, var292);
            }
            while (module0562.NIL == var297 && (module0562.NIL == module0055.f4019(var295) || module0562.NIL == module0055.f4019(var296))) {
                while (module0562.NIL == var297 && module0562.NIL == module0055.f4019(var295)) {
                    final SubLObject var320 = module0055.f4023(var295);
                    if (module0562.NIL == module0077.f5320(var320, var293)) {
                        module0077.f5326(var320, var293);
                        if (var320.eql(var291)) {
                            var297 = (SubLObject)module0562.T;
                        }
                        else {
                            final SubLObject var6_341 = module0137.$g1605$.currentBinding(var292);
                            try {
                                module0137.$g1605$.bind((module0562.NIL != module0137.f8955(module0562.$ic143$)) ? module0137.f8955(module0562.$ic143$) : module0137.$g1605$.getDynamicValue(var292), var292);
                                final SubLObject var321 = module0242.f15664(var320, module0137.f8955(module0562.$ic143$));
                                if (module0562.NIL == var321) {
                                    continue;
                                }
                                SubLObject var322 = module0244.f15784(module0137.f8955(module0562.$ic143$));
                                SubLObject var323 = (SubLObject)module0562.NIL;
                                var323 = var322.first();
                                while (module0562.NIL != var322) {
                                    final SubLObject var324 = module0245.f15834(var321, var323, module0137.f8955(module0562.$ic143$));
                                    if (module0562.NIL != var324 && var323.eql(module0244.f15778(module0137.f8955(module0562.$ic143$)))) {
                                        SubLObject var325;
                                        for (var325 = module0066.f4838(module0067.f4891(var324)); module0562.NIL == module0066.f4841(var325); var325 = module0066.f4840(var325)) {
                                            var292.resetMultipleValues();
                                            final SubLObject var356_357 = module0066.f4839(var325);
                                            final SubLObject var326 = var292.secondMultipleValue();
                                            var292.resetMultipleValues();
                                            SubLObject var153_347;
                                            for (var153_347 = module0066.f4838(module0067.f4891(var326)); module0562.NIL == module0066.f4841(var153_347); var153_347 = module0066.f4840(var153_347)) {
                                                var292.resetMultipleValues();
                                                final SubLObject var327 = module0066.f4839(var153_347);
                                                final SubLObject var328 = var292.secondMultipleValue();
                                                var292.resetMultipleValues();
                                                if (module0562.NIL != module0141.f9279(var327)) {
                                                    final SubLObject var329 = var328;
                                                    if (module0562.NIL != module0077.f5302(var329)) {
                                                        final SubLObject var330 = module0077.f5333(var329);
                                                        SubLObject var331;
                                                        SubLObject var332;
                                                        SubLObject var333;
                                                        for (var331 = module0032.f1741(var330), var332 = (SubLObject)module0562.NIL, var332 = module0032.f1742(var331, var330); module0562.NIL == module0032.f1744(var331, var332); var332 = module0032.f1743(var332)) {
                                                            var333 = module0032.f1745(var331, var332);
                                                            if (module0562.NIL != module0032.f1746(var332, var333) && module0562.NIL != module0147.f9507(var356_357) && module0562.NIL == module0077.f5320(var333, var293)) {
                                                                module0055.f4021(var333, var295);
                                                            }
                                                        }
                                                    }
                                                    else if (var329.isList()) {
                                                        SubLObject var334 = var329;
                                                        SubLObject var335 = (SubLObject)module0562.NIL;
                                                        var335 = var334.first();
                                                        while (module0562.NIL != var334) {
                                                            if (module0562.NIL != module0147.f9507(var356_357) && module0562.NIL == module0077.f5320(var335, var293)) {
                                                                module0055.f4021(var335, var295);
                                                            }
                                                            var334 = var334.rest();
                                                            var335 = var334.first();
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)module0562.$ic98$, var329);
                                                    }
                                                }
                                            }
                                            module0066.f4842(var153_347);
                                        }
                                        module0066.f4842(var325);
                                    }
                                    var322 = var322.rest();
                                    var323 = var322.first();
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var6_341, var292);
                            }
                        }
                    }
                }
                while (module0562.NIL == var297 && module0562.NIL != module0055.f4019(var295) && module0562.NIL == module0055.f4019(var296)) {
                    final SubLObject var336 = module0055.f4023(var296);
                    if (module0562.NIL == module0077.f5320(var336, var294)) {
                        module0077.f5326(var336, var294);
                        final SubLObject var6_342 = module0137.$g1605$.currentBinding(var292);
                        try {
                            module0137.$g1605$.bind((module0562.NIL != module0137.f8955(module0562.$ic143$)) ? module0137.f8955(module0562.$ic143$) : module0137.$g1605$.getDynamicValue(var292), var292);
                            final SubLObject var321 = module0242.f15664(var336, module0137.f8955(module0562.$ic143$));
                            if (module0562.NIL != var321) {
                                SubLObject var322 = module0244.f15784(module0137.f8955(module0562.$ic143$));
                                SubLObject var323 = (SubLObject)module0562.NIL;
                                var323 = var322.first();
                                while (module0562.NIL != var322) {
                                    final SubLObject var324 = module0245.f15834(var321, var323, module0137.f8955(module0562.$ic143$));
                                    if (module0562.NIL != var324 && var323.eql(module0244.f15778(module0137.f8955(module0562.$ic143$)))) {
                                        SubLObject var325;
                                        for (var325 = module0066.f4838(module0067.f4891(var324)); module0562.NIL == module0066.f4841(var325); var325 = module0066.f4840(var325)) {
                                            var292.resetMultipleValues();
                                            final SubLObject var356_358 = module0066.f4839(var325);
                                            final SubLObject var326 = var292.secondMultipleValue();
                                            var292.resetMultipleValues();
                                            SubLObject var153_348;
                                            for (var153_348 = module0066.f4838(module0067.f4891(var326)); module0562.NIL == module0066.f4841(var153_348); var153_348 = module0066.f4840(var153_348)) {
                                                var292.resetMultipleValues();
                                                final SubLObject var327 = module0066.f4839(var153_348);
                                                final SubLObject var328 = var292.secondMultipleValue();
                                                var292.resetMultipleValues();
                                                if (module0562.NIL != module0141.f9279(var327)) {
                                                    final SubLObject var329 = var328;
                                                    if (module0562.NIL != module0077.f5302(var329)) {
                                                        final SubLObject var330 = module0077.f5333(var329);
                                                        SubLObject var331;
                                                        SubLObject var332;
                                                        SubLObject var337;
                                                        for (var331 = module0032.f1741(var330), var332 = (SubLObject)module0562.NIL, var332 = module0032.f1742(var331, var330); module0562.NIL == module0032.f1744(var331, var332); var332 = module0032.f1743(var332)) {
                                                            var337 = module0032.f1745(var331, var332);
                                                            if (module0562.NIL != module0032.f1746(var332, var337) && module0562.NIL != module0147.f9507(var356_358) && module0562.NIL == module0077.f5320(var337, var294)) {
                                                                module0055.f4021(var337, var296);
                                                            }
                                                        }
                                                    }
                                                    else if (var329.isList()) {
                                                        SubLObject var334 = var329;
                                                        SubLObject var338 = (SubLObject)module0562.NIL;
                                                        var338 = var334.first();
                                                        while (module0562.NIL != var334) {
                                                            if (module0562.NIL != module0147.f9507(var356_358) && module0562.NIL == module0077.f5320(var338, var294)) {
                                                                module0055.f4021(var338, var296);
                                                            }
                                                            var334 = var334.rest();
                                                            var338 = var334.first();
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)module0562.$ic98$, var329);
                                                    }
                                                }
                                            }
                                            module0066.f4842(var153_348);
                                        }
                                        module0066.f4842(var325);
                                    }
                                    var322 = var322.rest();
                                    var323 = var322.first();
                                }
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var6_342, var292);
                        }
                        SubLObject var339 = (SubLObject)module0562.NIL;
                        final SubLObject var340 = module0562.$ic144$;
                        if (module0562.NIL == module0158.f10010(var336, (SubLObject)module0562.ONE_INTEGER, var340)) {
                            continue;
                        }
                        final SubLObject var341 = module0158.f10011(var336, (SubLObject)module0562.ONE_INTEGER, var340);
                        SubLObject var342 = (SubLObject)module0562.NIL;
                        final SubLObject var343 = (SubLObject)module0562.NIL;
                        while (module0562.NIL == var342) {
                            final SubLObject var344 = module0052.f3695(var341, var343);
                            final SubLObject var345 = (SubLObject)SubLObjectFactory.makeBoolean(!var343.eql(var344));
                            if (module0562.NIL != var345) {
                                SubLObject var346 = (SubLObject)module0562.NIL;
                                try {
                                    var346 = module0158.f10316(var344, (SubLObject)module0562.$ic120$, (SubLObject)module0562.$ic145$, (SubLObject)module0562.NIL);
                                    SubLObject var73_365 = (SubLObject)module0562.NIL;
                                    final SubLObject var74_366 = (SubLObject)module0562.NIL;
                                    while (module0562.NIL == var73_365) {
                                        final SubLObject var347 = module0052.f3695(var346, var74_366);
                                        final SubLObject var76_367 = (SubLObject)SubLObjectFactory.makeBoolean(!var74_366.eql(var347));
                                        if (module0562.NIL != var76_367) {
                                            var339 = module0178.f11331(var347, (SubLObject)module0562.TWO_INTEGER);
                                            if (module0562.NIL == module0077.f5320(var339, var293)) {
                                                module0055.f4021(var339, var295);
                                            }
                                        }
                                        var73_365 = (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL == var76_367);
                                    }
                                }
                                finally {
                                    final SubLObject var6_343 = Threads.$is_thread_performing_cleanupP$.currentBinding(var292);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0562.T, var292);
                                        if (module0562.NIL != var346) {
                                            module0158.f10319(var346);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var6_343, var292);
                                    }
                                }
                            }
                            var342 = (SubLObject)SubLObjectFactory.makeBoolean(module0562.NIL == var345);
                        }
                    }
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var301, var292);
            module0147.$g2094$.rebind(var300, var292);
            module0147.$g2095$.rebind(var299, var292);
        }
        return var297;
    }
    
    public static SubLObject f34686(final SubLObject var105, final SubLObject var291) {
        final SubLThread var292 = SubLProcess.currentSubLThread();
        SubLObject var293 = (SubLObject)module0562.NIL;
        final SubLObject var294 = module0147.$g2094$.currentBinding(var292);
        final SubLObject var295 = module0147.$g2095$.currentBinding(var292);
        try {
            module0147.$g2094$.bind((SubLObject)module0562.$ic51$, var292);
            module0147.$g2095$.bind(module0562.$ic52$, var292);
            var293 = f34693(var105, var291, (SubLObject)module0562.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var295, var292);
            module0147.$g2094$.rebind(var294, var292);
        }
        return var293;
    }
    
    public static SubLObject f34694(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0562.$ic147$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)module0562.NIL;
        SubLObject var20 = (SubLObject)module0562.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0562.$ic147$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0562.$ic147$);
        var20 = var17.first();
        var17 = var17.rest();
        SubLObject var21 = (SubLObject)module0562.NIL;
        SubLObject var22 = var17;
        SubLObject var23 = (SubLObject)module0562.NIL;
        SubLObject var376_377 = (SubLObject)module0562.NIL;
        while (module0562.NIL != var22) {
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)module0562.$ic147$);
            var376_377 = var22.first();
            var22 = var22.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)module0562.$ic147$);
            if (module0562.NIL == conses_high.member(var376_377, (SubLObject)module0562.$ic148$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED)) {
                var23 = (SubLObject)module0562.T;
            }
            if (var376_377 == module0562.$ic149$) {
                var21 = var22.first();
            }
            var22 = var22.rest();
        }
        if (module0562.NIL != var23 && module0562.NIL == var21) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0562.$ic147$);
        }
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)module0562.$ic150$, var17);
        final SubLObject var25 = (SubLObject)((module0562.NIL != var24) ? conses_high.cadr(var24) : module0562.NIL);
        final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)module0562.$ic151$, var17);
        final SubLObject var27 = (SubLObject)((module0562.NIL != var26) ? conses_high.cadr(var26) : module0562.NIL);
        final SubLObject var28;
        var17 = (var28 = var18);
        return (SubLObject)ConsesLow.listS((SubLObject)module0562.$ic152$, (SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)module0562.$ic153$, var20, var25), (SubLObject)module0562.$ic151$, var27), ConsesLow.append(var28, (SubLObject)module0562.NIL));
    }
    
    public static SubLObject f34695(final SubLObject var381) {
        final SubLThread var382 = SubLProcess.currentSubLThread();
        if (module0562.NIL == module0259.f16891(var381, module0562.$ic154$)) {
            Errors.error((SubLObject)module0562.$ic155$);
        }
        final SubLObject var383 = module0220.f14565(var381, module0562.$ic156$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
        final SubLObject var384 = module0220.f14565(var381, module0562.$ic157$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
        final SubLObject var385 = module0220.f14565(var381, module0562.$ic158$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
        final SubLObject var386 = module0220.f14565(var381, module0562.$ic159$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
        final SubLObject var387 = module0220.f14565(var381, module0562.$ic160$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
        final SubLObject var388 = module0220.f14565(var381, module0562.$ic161$, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
        module0562.$g4090$.setDynamicValue((SubLObject)ConsesLow.list((SubLObject)module0562.$ic11$, module0597.f36628(var381), (SubLObject)module0562.$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { module0562.$ic23$, module0562.$ic162$, module0562.$ic31$, var383, module0562.$ic25$, var384, module0562.$ic30$, var385, module0562.$ic34$, var386, module0562.$ic33$, var387, module0562.$ic32$, var388 }))), var382);
        return module0562.$g4090$.getDynamicValue(var382);
    }
    
    public static SubLObject f34696(final SubLObject var388) {
        final SubLThread var389 = SubLProcess.currentSubLThread();
        Errors.error((SubLObject)module0562.$ic163$);
        return module0562.$g4090$.getDynamicValue(var389);
    }
    
    public static SubLObject f34697(final SubLObject var389) {
        final SubLThread var390 = SubLProcess.currentSubLThread();
        SubLObject var391 = (SubLObject)module0562.NIL;
        try {
            final SubLObject var392 = stream_macros.$stream_requires_locking$.currentBinding(var390);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0562.NIL, var390);
                var391 = compatibility.open_text(var389, (SubLObject)module0562.$ic164$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var392, var390);
            }
            if (!var391.isStream()) {
                Errors.error((SubLObject)module0562.$ic165$, var389);
            }
            final SubLObject var393 = var391;
            f34698(var393);
        }
        finally {
            final SubLObject var394 = Threads.$is_thread_performing_cleanupP$.currentBinding(var390);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0562.T, var390);
                if (var391.isStream()) {
                    streams_high.close(var391, (SubLObject)module0562.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var394, var390);
            }
        }
        return var389;
    }
    
    public static SubLObject f34698(final SubLObject var392) {
        final SubLThread var393 = SubLProcess.currentSubLThread();
        streams_high.write_string(module0107.f7574(), var392, (SubLObject)module0562.UNPROVIDED, (SubLObject)module0562.UNPROVIDED);
        streams_high.terpri(var392);
        final SubLObject var394 = assertion_handles_oc.f11010();
        final SubLObject var395 = (SubLObject)module0562.$ic166$;
        final SubLObject var396 = module0065.f4733(var394);
        SubLObject var397 = (SubLObject)module0562.ZERO_INTEGER;
        assert module0562.NIL != Types.stringp(var395) : var395;
        final SubLObject var398 = module0012.$g75$.currentBinding(var393);
        final SubLObject var399 = module0012.$g76$.currentBinding(var393);
        final SubLObject var400 = module0012.$g77$.currentBinding(var393);
        final SubLObject var401 = module0012.$g78$.currentBinding(var393);
        try {
            module0012.$g75$.bind((SubLObject)module0562.ZERO_INTEGER, var393);
            module0012.$g76$.bind((SubLObject)module0562.NIL, var393);
            module0012.$g77$.bind((SubLObject)module0562.T, var393);
            module0012.$g78$.bind(Time.get_universal_time(), var393);
            module0012.f478(var395);
            final SubLObject var62_393 = var394;
            if (module0562.NIL == module0065.f4772(var62_393, (SubLObject)module0562.$ic54$)) {
                final SubLObject var63_394 = var62_393;
                if (module0562.NIL == module0065.f4775(var63_394, (SubLObject)module0562.$ic54$)) {
                    final SubLObject var402 = module0065.f4740(var63_394);
                    final SubLObject var403 = (SubLObject)module0562.NIL;
                    SubLObject var404;
                    SubLObject var405;
                    SubLObject var406;
                    SubLObject var407;
                    SubLObject var408;
                    for (var404 = Sequences.length(var402), var405 = (SubLObject)module0562.NIL, var405 = (SubLObject)module0562.ZERO_INTEGER; var405.numL(var404); var405 = Numbers.add(var405, (SubLObject)module0562.ONE_INTEGER)) {
                        var406 = ((module0562.NIL != var403) ? Numbers.subtract(var404, var405, (SubLObject)module0562.ONE_INTEGER) : var405);
                        var407 = Vectors.aref(var402, var406);
                        if (module0562.NIL == module0065.f4749(var407) || module0562.NIL == module0065.f4773((SubLObject)module0562.$ic54$)) {
                            if (module0562.NIL != module0065.f4749(var407)) {
                                var407 = (SubLObject)module0562.$ic54$;
                            }
                            module0012.note_percent_progress(var397, var396);
                            var397 = Numbers.add(var397, (SubLObject)module0562.ONE_INTEGER);
                            var408 = module0289.f19402(var407);
                            module0194.f12114(var408, var392, (SubLObject)module0562.UNPROVIDED);
                        }
                    }
                }
                final SubLObject var85_395 = var62_393;
                if (module0562.NIL == module0065.f4777(var85_395) || module0562.NIL == module0065.f4773((SubLObject)module0562.$ic54$)) {
                    final SubLObject var409 = module0065.f4738(var85_395);
                    SubLObject var410 = module0065.f4739(var85_395);
                    final SubLObject var411 = module0065.f4734(var85_395);
                    final SubLObject var412 = (SubLObject)((module0562.NIL != module0065.f4773((SubLObject)module0562.$ic54$)) ? module0562.NIL : module0562.$ic54$);
                    while (var410.numL(var411)) {
                        final SubLObject var413 = Hashtables.gethash_without_values(var410, var409, var412);
                        if (module0562.NIL == module0065.f4773((SubLObject)module0562.$ic54$) || module0562.NIL == module0065.f4749(var413)) {
                            module0012.note_percent_progress(var397, var396);
                            var397 = Numbers.add(var397, (SubLObject)module0562.ONE_INTEGER);
                            final SubLObject var414 = module0289.f19402(var413);
                            module0194.f12114(var414, var392, (SubLObject)module0562.UNPROVIDED);
                        }
                        var410 = Numbers.add(var410, (SubLObject)module0562.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var401, var393);
            module0012.$g77$.rebind(var400, var393);
            module0012.$g76$.rebind(var399, var393);
            module0012.$g75$.rebind(var398, var393);
        }
        return var392;
    }
    
    public static SubLObject f34699() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34620", "S#37979", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34623", "S#37980", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34622", "S#37981", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34621", "S#37982", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34624", "S#37983", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34625", "S#37984", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34629", "S#37985", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34631", "S#37986", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34632", "S#37987", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34626", "S#37988", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34634", "S#37989", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34635", "S#37990", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34636", "S#37991", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34637", "S#37992", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34638", "S#37993", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34639", "S#37994", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34628", "S#37995", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34633", "S#37996", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0562", "f34640", "S#37997");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34641", "S#37998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34642", "S#37999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34643", "S#38000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34644", "S#38001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34645", "S#38002", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34646", "S#38003", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34647", "S#38004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34648", "S#38005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34649", "S#38006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34650", "S#38007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34651", "S#38008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34652", "S#38009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34627", "S#38010", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34630", "S#38011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34653", "S#38012", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34655", "S#38013", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34658", "S#38014", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34659", "S#38015", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34660", "S#38016", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34656", "S#38017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34657", "S#38018", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34654", "S#38019", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34661", "S#38020", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34662", "S#38021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34663", "S#38022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34664", "S#38023", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34665", "S#38024", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34666", "S#38025", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34670", "S#38026", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34669", "S#38027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34672", "S#38028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34673", "S#38029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34671", "S#38030", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34668", "S#38031", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34674", "S#38032", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34667", "S#38033", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34675", "S#38034", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34676", "S#38035", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34677", "S#38036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34678", "S#38037", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34679", "S#38038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34680", "S#38039", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34681", "S#38040", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34682", "S#38041", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34683", "S#38042", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34684", "S#38043", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34685", "S#38044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34687", "S#38045", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34689", "S#38046", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34690", "S#38047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34688", "S#38048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34691", "S#38049", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34692", "S#38050", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34693", "S#38051", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34686", "S#38052", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0562", "f34694", "S#38053");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34695", "S#38054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34696", "S#38055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34697", "S#38056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0562", "f34698", "S#38057", 1, 0, false);
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34700() {
        module0562.$g4090$ = SubLFiles.defvar("S#38058", (SubLObject)module0562.NIL);
        module0562.$g4091$ = SubLFiles.deflexical("S#38059", (SubLObject)module0562.$ic5$);
        module0562.$g4092$ = SubLFiles.defvar("S#38060", (SubLObject)module0562.$ic6$);
        module0562.$g4093$ = SubLFiles.deflexical("S#38061", (SubLObject)module0562.NIL);
        module0562.$g4094$ = SubLFiles.deflexical("S#38062", (SubLObject)module0562.NIL);
        module0562.$g4096$ = SubLFiles.deflexical("S#38063", (SubLObject)module0562.NIL);
        module0562.$g4097$ = SubLFiles.deflexical("S#38064", (SubLObject)module0562.NIL);
        module0562.$g4098$ = SubLFiles.deflexical("S#38065", (SubLObject)module0562.$ic59$);
        module0562.$g4099$ = SubLFiles.deflexical("S#38066", (SubLObject)module0562.$ic60$);
        module0562.$g4100$ = SubLFiles.deflexical("S#38067", (SubLObject)module0562.$ic78$);
        return (SubLObject)module0562.NIL;
    }
    
    public static SubLObject f34701() {
        module0012.f419((SubLObject)module0562.$ic68$);
        module0012.f419((SubLObject)module0562.$ic69$);
        module0012.f419((SubLObject)module0562.$ic70$);
        module0012.f419((SubLObject)module0562.$ic71$);
        module0012.f419((SubLObject)module0562.$ic72$);
        module0012.f419((SubLObject)module0562.$ic73$);
        module0034.f1895((SubLObject)module0562.$ic125$);
        return (SubLObject)module0562.NIL;
    }
    
    public void declareFunctions() {
        f34699();
    }
    
    public void initializeVariables() {
        f34700();
    }
    
    public void runTopLevelForms() {
        f34701();
    }
    
    static {
        me = (SubLFile)new module0562();
        module0562.$g4090$ = null;
        module0562.$g4091$ = null;
        module0562.$g4092$ = null;
        module0562.$g4093$ = null;
        module0562.$g4094$ = null;
        module0562.$g4096$ = null;
        module0562.$g4097$ = null;
        module0562.$g4098$ = null;
        module0562.$g4099$ = null;
        module0562.$g4100$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("NON-EMPTY-STRING?");
        $ic1$ = SubLObjectFactory.makeString("Continue");
        $ic2$ = SubLObjectFactory.makeString("The KBS definition is not valid.");
        $ic3$ = SubLObjectFactory.makeInteger(10000);
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("EVAL"), (SubLObject)SubLObjectFactory.makeKeyword("CODE")));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("SECTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("PREREMOVED-ASSERTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("PRERUN-FNS"), (SubLObject)SubLObjectFactory.makeKeyword("POST-IDENTIFY-FORTS-FNS"), (SubLObject)SubLObjectFactory.makeKeyword("POST-IDENTIFY-ASSERTIONS-FNS"), (SubLObject)SubLObjectFactory.makeKeyword("INHERITED-STORES"));
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("COLLECTIONS"), SubLObjectFactory.makeKeyword("SETS"), SubLObjectFactory.makeKeyword("OMISSION-COLLECTIONS"), SubLObjectFactory.makeKeyword("OMISSION-PREDICATE"), SubLObjectFactory.makeKeyword("DEFINITIONAL-PREDICATE-SET"), SubLObjectFactory.makeKeyword("DEFINITIONAL-RULE-PREDICATE"), SubLObjectFactory.makeKeyword("KBQ-QUERY-SETS"), SubLObjectFactory.makeKeyword("OMISSION-TERMS"), SubLObjectFactory.makeKeyword("OMISSION-ASSERTIONS"), SubLObjectFactory.makeKeyword("RETAINED-TERMS"), SubLObjectFactory.makeKeyword("RETAINED-ASSERTIONS"), SubLObjectFactory.makeKeyword("OMISSION-PREDICATE-EXTENT") });
        $ic7$ = SubLObjectFactory.makeString("*kbs-definition* is null");
        $ic8$ = SubLObjectFactory.makeString("*kbs-definition* has section using invalid property ~A");
        $ic9$ = SubLObjectFactory.makeKeyword("SECTIONS");
        $ic10$ = SubLObjectFactory.makeString("*kbs-definition* is not a plist.");
        $ic11$ = SubLObjectFactory.makeKeyword("NAME");
        $ic12$ = SubLObjectFactory.makeKeyword("PRERUN-FNS");
        $ic13$ = SubLObjectFactory.makeKeyword("PREREMOVED-ASSERTIONS");
        $ic14$ = SubLObjectFactory.makeKeyword("POST-IDENTIFY-FORTS-FNS");
        $ic15$ = SubLObjectFactory.makeKeyword("POST-IDENTIFY-ASSERTIONS-FNS");
        $ic16$ = SubLObjectFactory.makeKeyword("INHERITED-STORES");
        $ic17$ = SubLObjectFactory.makeString("A section is using invalid property ~A");
        $ic18$ = SubLObjectFactory.makeString("A Section is not a plist: ~A");
        $ic19$ = SubLObjectFactory.makeString("No sections are defined.");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38068", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic21$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37990", "CYC")));
        $ic23$ = SubLObjectFactory.makeKeyword("COLLECTIONS");
        $ic24$ = SubLObjectFactory.makeKeyword("SETS");
        $ic25$ = SubLObjectFactory.makeKeyword("OMISSION-COLLECTIONS");
        $ic26$ = SubLObjectFactory.makeKeyword("OMISSION-PREDICATE");
        $ic27$ = SubLObjectFactory.makeKeyword("DEFINITIONAL-PREDICATE-SET");
        $ic28$ = SubLObjectFactory.makeKeyword("DEFINITIONAL-RULE-PREDICATE");
        $ic29$ = SubLObjectFactory.makeKeyword("KBQ-QUERY-SETS");
        $ic30$ = SubLObjectFactory.makeKeyword("OMISSION-TERMS");
        $ic31$ = SubLObjectFactory.makeKeyword("OMISSION-ASSERTIONS");
        $ic32$ = SubLObjectFactory.makeKeyword("RETAINED-TERMS");
        $ic33$ = SubLObjectFactory.makeKeyword("RETAINED-ASSERTIONS");
        $ic34$ = SubLObjectFactory.makeKeyword("OMISSION-PREDICATE-EXTENT");
        $ic35$ = SubLObjectFactory.makeKeyword("RULE-STATISTICS");
        $ic36$ = SubLObjectFactory.makeKeyword("CACHING-POLICIES");
        $ic37$ = SubLObjectFactory.makeKeyword("EXTERNALIZE");
        $ic38$ = SubLObjectFactory.makeString("Unknown inherited store ~A: dont know how to save.");
        $ic39$ = SubLObjectFactory.makeString("Unknown inherited store ~A ... skipping.");
        $ic40$ = SubLObjectFactory.makeSymbol("S#38022", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#38021", "CYC");
        $ic42$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic43$ = SubLObjectFactory.makeString("Whoa, someone already populated the queue. There are ~A entries!");
        $ic44$ = SubLObjectFactory.makeKeyword("PREPARED");
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13918", "CYC"));
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("broaderTerm"));
        $ic48$ = SubLObjectFactory.makeString("This transform filters is not applicable to GAF ~A.");
        $ic49$ = SubLObjectFactory.makeString("GAF ~A has a non-standard EL strength ~A.");
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1546", "CYC"));
        $ic51$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic52$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic53$ = SubLObjectFactory.makeString("Unmarking forts with only included #$termOfUnit assertions");
        $ic54$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic55$ = SubLObjectFactory.makeString("unmarking ~A~%");
        $ic56$ = SubLObjectFactory.makeString("Unmarked ~A forts and ~A assertions~%");
        $ic57$ = SubLObjectFactory.makeSymbol("S#38029", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#38028", "CYC");
        $ic59$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("prettyString")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("prettyString-Canonical")));
        $ic60$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EnglishMt")));
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38069", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38070", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")));
        $ic62$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic63$ = SubLObjectFactory.makeString("Do not know how to simplify sentence ~S.");
        $ic64$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38071", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38072", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $ic65$ = SubLObjectFactory.makeString("Asserting pretty string assertions for all ");
        $ic66$ = SubLObjectFactory.makeString(" KBS FORTs");
        $ic67$ = SubLObjectFactory.makeString("Cannot be used without identifying KBS forts first.");
        $ic68$ = SubLObjectFactory.makeSymbol("S#38032", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#38034", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#38035", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#38036", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#38037", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#38038", "CYC");
        $ic74$ = SubLObjectFactory.makeString("Reset operation not supported for pretty string assert sentence accumulators.");
        $ic75$ = SubLObjectFactory.makeSymbol("S#13483", "CYC");
        $ic76$ = SubLObjectFactory.makeString("Get-contents operation not supported for pretty string assert sentence accumulators.");
        $ic77$ = SubLObjectFactory.makeString("Get-iterator operation not supported for pretty string assert sentence accumulators.");
        $ic78$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("WordNet-Version2_0")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("FOAFOntology")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycExtendedSystemFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LSCOMObjectAndSituationOntology"))));
        $ic79$ = SubLObjectFactory.makeString("OpenCycPermittedSource");
        $ic80$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept"));
        $ic81$ = SubLObjectFactory.makeString("Removing non-opencyc related #$synonymousExternalConcept assertions (pass ");
        $ic82$ = SubLObjectFactory.makeString(")");
        $ic83$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("broaderTerm-NonTaxonomic"));
        $ic84$ = SubLObjectFactory.makeString("Unmarking instances of #$TerroristAgent, #$TerroristAct, and #$HostileSocialAction~%");
        $ic85$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TerroristAgent"));
        $ic86$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic87$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic88$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic89$ = SubLObjectFactory.makeKeyword("STACK");
        $ic90$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic91$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic92$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic93$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic94$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic95$ = SubLObjectFactory.makeString("continue anyway");
        $ic96$ = SubLObjectFactory.makeKeyword("WARN");
        $ic97$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic98$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic99$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic100$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
        $ic101$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic102$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TerroristAct"));
        $ic103$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HostileSocialAction"));
        $ic104$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ResearchCycConstant"));
        $ic105$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProprietaryTerm"));
        $ic106$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TKBConstant"));
        $ic107$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermSuggestorExpertOnlyTerm"));
        $ic108$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TextualEntailmentConstant"));
        $ic109$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CurrentCycorpEmployee"));
        $ic110$ = SubLObjectFactory.makeString("AKB");
        $ic111$ = SubLObjectFactory.makeString("BUTLER");
        $ic112$ = SubLObjectFactory.makeString("CKB");
        $ic113$ = SubLObjectFactory.makeString("CycInternalAssignment");
        $ic114$ = SubLObjectFactory.makeString("TKB");
        $ic115$ = SubLObjectFactory.makeString("Translation-");
        $ic116$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic117$ = SubLObjectFactory.makeString("Unmarking non-TKB assertions");
        $ic118$ = SubLObjectFactory.makeString("mapping Cyc constants");
        $ic119$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic120$ = SubLObjectFactory.makeKeyword("GAF");
        $ic121$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Individual"));
        $ic122$ = SubLObjectFactory.makeString("Saving ~A by asserting ~A~%");
        $ic123$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic124$ = SubLObjectFactory.makeString("assertion ~A not found");
        $ic125$ = SubLObjectFactory.makeSymbol("S#38048", "CYC");
        $ic126$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic127$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TKBFullySpecifiedSourceMicrotheory"));
        $ic128$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LexicalMicrotheory"));
        $ic129$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TestVocabularyMt"));
        $ic130$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic131$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic132$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic133$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ImagePathnamePredicate"));
        $ic134$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic135$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Person"));
        $ic136$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LegalCorporation"));
        $ic137$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CommercialOrganization"));
        $ic138$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IndeterminateTerm"));
        $ic139$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IndexicalConcept"));
        $ic140$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AgentNowTerminated"));
        $ic141$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ComputerUserWithUserModel"));
        $ic142$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HumanCyclist"));
        $ic143$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic144$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls-GenlDenotesSpecInstances"));
        $ic145$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic146$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10388", "CYC"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#346C856"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#34E0056"));
        $ic147$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15398", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic148$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic149$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic150$ = SubLObjectFactory.makeKeyword("MT");
        $ic151$ = SubLObjectFactory.makeKeyword("DONE");
        $ic152$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic153$ = SubLObjectFactory.makeSymbol("S#38050", "CYC");
        $ic154$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("KBSubsetProfile"));
        $ic155$ = SubLObjectFactory.makeString("~S is not a valid #$KBSubsetProfile");
        $ic156$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("kbsProfileRemoveAssertion"));
        $ic157$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("kbsProfileRemoveCollectionExtent"));
        $ic158$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("kbsProfileRemoveFORT"));
        $ic159$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("kbsProfileRemovePredicateExtent"));
        $ic160$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("kbsProfileRetainAssertion"));
        $ic161$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("kbsProfileRetainTerm"));
        $ic162$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycLConstant")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing")));
        $ic163$ = SubLObjectFactory.makeString("KB subsets are not supported on this port.");
        $ic164$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic165$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic166$ = SubLObjectFactory.makeString("Gathering up all assertion EL formulas ....");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0562.class
	Total time: 6268 ms
	
	Decompiled with Procyon 0.5.32.
*/