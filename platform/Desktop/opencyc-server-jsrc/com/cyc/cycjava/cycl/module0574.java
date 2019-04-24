package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapper;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0574 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0574";
    public static final String myFingerPrint = "e4042bb2283e527e4120af3068af1d2d48b03d20135468718ceb16afcddf8d96";
    public static SubLSymbol $g4169$;
    public static SubLSymbol $g4170$;
    public static SubLSymbol $g4171$;
    public static SubLSymbol $g4172$;
    public static SubLSymbol $g4173$;
    public static SubLSymbol $g4174$;
    public static SubLSymbol $g4175$;
    public static SubLSymbol $g4176$;
    public static SubLSymbol $g4177$;
    public static SubLSymbol $g4178$;
    public static SubLSymbol $g4179$;
    public static SubLSymbol $g4180$;
    public static SubLSymbol $g4181$;
    public static SubLSymbol $g4182$;
    public static SubLSymbol $g4183$;
    public static SubLSymbol $g4184$;
    private static SubLSymbol $g4185$;
    public static SubLSymbol $g4186$;
    public static SubLSymbol $g4187$;
    private static SubLSymbol $g4188$;
    private static SubLSymbol $g4189$;
    public static SubLSymbol $g4190$;
    private static SubLSymbol $g4191$;
    private static SubLSymbol $g4192$;
    public static SubLSymbol $g4193$;
    public static SubLSymbol $g4194$;
    public static SubLSymbol $g4195$;
    private static SubLSymbol $g4199$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLInteger $ic11$;
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
    private static final SubLObject $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLList $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLString $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLString $ic47$;
    private static final SubLList $ic48$;
    private static final SubLList $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
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
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLInteger $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLString $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
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
    private static final SubLInteger $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLList $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLString $ic132$;
    private static final SubLInteger $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLList $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLInteger $ic147$;
    private static final SubLString $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLString $ic155$;
    private static final SubLInteger $ic156$;
    private static final SubLInteger $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLList $ic164$;
    private static final SubLList $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    
    
    public static SubLObject f35120() {
        return module0574.$g4171$.getGlobalValue();
    }
    
    public static SubLObject f35121(final SubLObject var1) {
        module0574.$g4171$.setGlobalValue(var1);
        return module0574.$g4171$.getGlobalValue();
    }
    
    public static SubLObject f35122() {
        return module0574.$g4172$.getGlobalValue();
    }
    
    public static SubLObject f35123(final SubLObject var1) {
        module0574.$g4172$.setGlobalValue(var1);
        return module0574.$g4172$.getGlobalValue();
    }
    
    public static SubLObject f35124() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0574.$g4173$.getDynamicValue(var2);
    }
    
    public static SubLObject f35125(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (f35126().equal((SubLObject)module0574.$ic8$)) {
            f35127((SubLObject)module0574.$ic9$);
        }
        if (f35126().equal((SubLObject)module0574.$ic10$)) {
            f35127((SubLObject)module0574.$ic2$);
        }
        module0575.f35274();
        module0575.f35279();
        f35121((SubLObject)SubLObjectFactory.makeBoolean(module0574.NIL == var1));
        module0574.$g4173$.setDynamicValue(var1, var2);
        return module0574.$g4173$.getDynamicValue(var2);
    }
    
    public static SubLObject f35128() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0574.$g4174$.getDynamicValue(var2);
    }
    
    public static SubLObject f35129(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        module0574.$g4174$.setDynamicValue(var3, var4);
        return module0574.$g4174$.getDynamicValue(var4);
    }
    
    public static SubLObject f35130() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0110.$g1376$.getDynamicValue(var2);
    }
    
    public static SubLObject f35131(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0110.$g1376$.setDynamicValue(var1, var2);
        return module0110.$g1376$.getDynamicValue(var2);
    }
    
    public static SubLObject f35132() {
        return module0574.$g4175$.getGlobalValue();
    }
    
    public static SubLObject f35133(final SubLObject var1) {
        module0574.$g4175$.setGlobalValue(var1);
        return module0574.$g4175$.getGlobalValue();
    }
    
    public static SubLObject f35134() {
        return module0574.$g4176$.getGlobalValue();
    }
    
    public static SubLObject f35135(final SubLObject var1) {
        module0574.$g4176$.setGlobalValue(var1);
        return module0574.$g4176$.getGlobalValue();
    }
    
    public static SubLObject f35136() {
        return module0574.$g4177$.getGlobalValue();
    }
    
    public static SubLObject f35137(final SubLObject var1) {
        module0574.$g4177$.setGlobalValue(var1);
        return module0574.$g4177$.getGlobalValue();
    }
    
    public static SubLObject f35138() {
        return module0574.$g4178$.getGlobalValue();
    }
    
    public static SubLObject f35139(final SubLObject var1) {
        module0574.$g4178$.setGlobalValue(var1);
        return module0574.$g4178$.getGlobalValue();
    }
    
    public static SubLObject f35140() {
        return module0574.$g4179$.getGlobalValue();
    }
    
    public static SubLObject f35141(final SubLObject var3) {
        module0574.$g4179$.setGlobalValue(var3);
        return module0574.$g4179$.getGlobalValue();
    }
    
    public static SubLObject f35142() {
        return module0574.$g4180$.getGlobalValue();
    }
    
    public static SubLObject f35143() {
        module0574.$g4180$.setGlobalValue(Numbers.add(module0574.$g4180$.getGlobalValue(), (SubLObject)module0574.ONE_INTEGER));
        return module0574.$g4180$.getGlobalValue();
    }
    
    public static SubLObject f35144() {
        return module0574.$g4181$.getGlobalValue();
    }
    
    public static SubLObject f35145() {
        module0574.$g4181$.setGlobalValue(Numbers.add(module0574.$g4181$.getGlobalValue(), (SubLObject)module0574.ONE_INTEGER));
        return module0574.$g4181$.getGlobalValue();
    }
    
    public static SubLObject f35146() {
        return module0574.$g4182$.getGlobalValue();
    }
    
    public static SubLObject f35147() {
        module0574.$g4182$.setGlobalValue(Numbers.add(module0574.$g4182$.getGlobalValue(), (SubLObject)module0574.ONE_INTEGER));
        return module0574.$g4182$.getGlobalValue();
    }
    
    public static SubLObject f35148() {
        return module0574.$g4183$.getGlobalValue();
    }
    
    public static SubLObject f35149(final SubLObject var3) {
        module0574.$g4183$.setGlobalValue(var3);
        return module0574.$g4183$.getGlobalValue();
    }
    
    public static SubLObject f35150() {
        return module0574.$g4184$.getGlobalValue();
    }
    
    public static SubLObject f35151(final SubLObject var3) {
        module0574.$g4184$.setGlobalValue(var3);
        return module0574.$g4184$.getGlobalValue();
    }
    
    public static SubLObject f35152() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0111.$g1405$.getDynamicValue(var2);
    }
    
    public static SubLObject f35153(SubLObject var4) {
        if (var4 == module0574.UNPROVIDED) {
            var4 = (SubLObject)module0574.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f35154(var4);
        module0111.$g1405$.setDynamicValue(var6, var5);
        return module0111.$g1405$.getDynamicValue(var5);
    }
    
    public static SubLObject f35154(final SubLObject var4) {
        final SubLObject var5 = (SubLObject)(var4.isString() ? module0538.f33337(var4) : ((module0574.NIL != module0173.f10969(var4)) ? var4 : module0574.NIL));
        if (module0574.NIL != var5 && module0574.NIL != module0226.f14809(var5)) {
            return var5;
        }
        return module0574.$ic23$;
    }
    
    public static SubLObject f35155() {
        return Equality.equal(f35152(), module0574.$ic23$);
    }
    
    public static SubLObject f35156() {
        return module0035.sublisp_boolean(module0574.$g4185$.getGlobalValue());
    }
    
    public static SubLObject f35157(final SubLObject var4, final SubLObject var7, SubLObject var8) {
        if (var8 == module0574.UNPROVIDED) {
            var8 = module0574.$g4186$.getDynamicValue();
        }
        assert module0574.NIL != Types.stringp(var4) : var4;
        assert module0574.NIL != Types.stringp(var7) : var7;
        assert module0574.NIL != module0173.f10955(var8) : var8;
        f35153((SubLObject)module0574.UNPROVIDED);
        final SubLObject var9 = f35154(var4);
        if (!var9.equal(module0574.$ic23$)) {
            final SubLObject var10 = f35158(var9, var8);
            if (var10.isString() && module0574.NIL != Strings.stringE(var7, var10, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED)) {
                module0111.$g1405$.setDynamicValue(var9);
            }
        }
        return f35152();
    }
    
    public static SubLObject f35158(final SubLObject var9, SubLObject var8) {
        if (var8 == module0574.UNPROVIDED) {
            var8 = module0574.$g4186$.getDynamicValue();
        }
        SubLObject var10 = (SubLObject)module0574.NIL;
        if (module0574.NIL != module0173.f10955(var8)) {
            final SubLObject var11 = module0202.f12768(module0574.$ic39$, var8, var9);
            final SubLObject var12 = module0172.f10921(var11);
            if (module0574.NIL == var12) {
                var10 = f35158(var9, (SubLObject)module0574.NIL);
            }
            else {
                var10 = f35159(var12);
                if (module0574.NIL == var10) {
                    var10 = f35158(var9, (SubLObject)module0574.NIL);
                }
            }
        }
        else {
            var10 = f35159(var9);
        }
        return var10;
    }
    
    public static SubLObject f35159(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0574.NIL;
        final SubLObject var12 = module0147.$g2094$.currentBinding(var10);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var10);
        try {
            module0147.$g2094$.bind((SubLObject)module0574.$ic40$, var10);
            module0147.$g2095$.bind(module0574.$g4187$.getDynamicValue(var10), var10);
            var11 = module0220.f14553(var9, module0574.$ic41$, (SubLObject)module0574.ONE_INTEGER, (SubLObject)module0574.TWO_INTEGER, (SubLObject)module0574.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var13, var10);
            module0147.$g2094$.rebind(var12, var10);
        }
        return var11.isCons() ? var11.first() : var11;
    }
    
    public static SubLObject f35160(final SubLObject var9, final SubLObject var17, SubLObject var8) {
        if (var8 == module0574.UNPROVIDED) {
            var8 = module0574.$g4186$.getDynamicValue();
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        assert module0574.NIL != module0173.f10955(var9) : var9;
        assert module0574.NIL != Types.stringp(var17) : var17;
        if (module0574.NIL != f35155()) {
            return Values.values((SubLObject)module0574.NIL, (SubLObject)module0574.$ic42$);
        }
        final SubLObject var19 = (module0574.NIL == var8) ? var9 : module0202.f12768(module0574.$ic39$, var8, var9);
        final SubLObject var20 = (module0574.NIL == var8) ? var9 : module0172.f10921(var19);
        if (module0574.NIL == var20 || module0574.NIL == f35159(var20)) {
            SubLObject var21 = (SubLObject)module0574.NIL;
            try {
                var18.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var22 = Errors.$error_handler$.currentBinding(var18);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0574.$ic43$, var18);
                    try {
                        f35161(var19, var17);
                    }
                    catch (Throwable var23) {
                        Errors.handleThrowable(var23, (SubLObject)module0574.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var22, var18);
                }
            }
            catch (Throwable var24) {
                var21 = Errors.handleThrowable(var24, module0003.$g3$.getGlobalValue());
            }
            finally {
                var18.throwStack.pop();
            }
            return Values.values((SubLObject)SubLObjectFactory.makeBoolean(!var21.isString()), var21);
        }
        if (!f35152().equal(var9)) {
            return Values.values((SubLObject)module0574.NIL, (SubLObject)module0574.$ic44$);
        }
        f35162(var20);
        return f35160(var9, var17, var8);
    }
    
    public static SubLObject f35161(final SubLObject var19, final SubLObject var17) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        var20.resetMultipleValues();
        final SubLObject var21 = module0543.f33631((SubLObject)ConsesLow.list(module0574.$ic41$, var19, var17), module0574.$g4187$.getDynamicValue(var20), (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED);
        final SubLObject var22 = var20.secondMultipleValue();
        var20.resetMultipleValues();
        if (module0574.NIL == var21) {
            SubLObject var23 = (SubLObject)module0574.NIL;
            SubLObject var24 = (SubLObject)module0574.NIL;
            try {
                var24 = streams_high.make_private_string_output_stream();
                SubLObject var25;
                SubLObject var26;
                SubLObject var27;
                for (var25 = (SubLObject)module0574.NIL, var25 = var22; module0574.NIL != var25; var25 = conses_high.cddr(var25)) {
                    var26 = var25.first();
                    var27 = conses_high.cadr(var25);
                    PrintLow.format(var24, (SubLObject)module0574.$ic50$, var26, var27);
                }
                var23 = streams_high.get_output_stream_string(var24);
            }
            finally {
                final SubLObject var28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var20);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0574.T, var20);
                    streams_high.close(var24, (SubLObject)module0574.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var28, var20);
                }
            }
            Errors.error((SubLObject)module0574.$ic51$, var19, var23);
        }
        return var19;
    }
    
    public static SubLObject f35162(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = f35159(var19);
        if (module0574.NIL == Errors.$ignore_mustsP$.getDynamicValue(var20) && !var21.isString()) {
            Errors.error((SubLObject)module0574.$ic52$, var19);
        }
        var20.resetMultipleValues();
        final SubLObject var22 = module0543.f33658((SubLObject)ConsesLow.list(module0574.$ic41$, var19, var21), module0574.$g4187$.getDynamicValue(var20));
        final SubLObject var23 = var20.secondMultipleValue();
        var20.resetMultipleValues();
        if (module0574.NIL == var22) {
            SubLObject var24 = (SubLObject)module0574.NIL;
            SubLObject var25 = (SubLObject)module0574.NIL;
            try {
                var25 = streams_high.make_private_string_output_stream();
                SubLObject var26;
                SubLObject var27;
                SubLObject var28;
                for (var26 = (SubLObject)module0574.NIL, var26 = var23; module0574.NIL != var26; var26 = conses_high.cddr(var26)) {
                    var27 = var26.first();
                    var28 = conses_high.cadr(var26);
                    PrintLow.format(var25, (SubLObject)module0574.$ic50$, var27, var28);
                }
                var24 = streams_high.get_output_stream_string(var25);
            }
            finally {
                final SubLObject var29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var20);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0574.T, var20);
                    streams_high.close(var25, (SubLObject)module0574.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var29, var20);
                }
            }
            Errors.error((SubLObject)module0574.$ic53$, var19, var21, var24);
        }
        return var19;
    }
    
    public static SubLObject f35163() {
        return (SubLObject)(f35148().numG((SubLObject)module0574.ZERO_INTEGER) ? f35148() : module0574.ZERO_INTEGER);
    }
    
    public static SubLObject f35164() {
        if (f35148().numG((SubLObject)module0574.ZERO_INTEGER)) {
            return PrintLow.format((SubLObject)module0574.NIL, (SubLObject)module0574.$ic55$, module0018.f971(), f35148());
        }
        return PrintLow.format((SubLObject)module0574.NIL, (SubLObject)module0574.$ic56$, module0018.f971());
    }
    
    public static SubLObject f35165() {
        return f35140();
    }
    
    public static SubLObject f35166(SubLObject var29) {
        if (var29 == module0574.UNPROVIDED) {
            var29 = module0018.f971();
        }
        return PrintLow.format((SubLObject)module0574.NIL, (SubLObject)module0574.$ic58$, var29);
    }
    
    public static SubLObject f35167() {
        return f35166((SubLObject)module0574.UNPROVIDED);
    }
    
    public static SubLObject f35168(SubLObject var30) {
        if (var30 == module0574.UNPROVIDED) {
            var30 = (SubLObject)module0574.NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        SubLObject var32 = (SubLObject)module0574.NIL;
        var32 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0574.$ic60$), module0574.$g4169$.getDynamicValue(var31));
        if (module0574.NIL != var30) {
            var32 = Sequences.remove(f35126(), var32, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED);
        }
        return var32;
    }
    
    public static SubLObject f35169(final SubLObject var32) {
        return module0004.f104(var32, f35168((SubLObject)module0574.UNPROVIDED), (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED);
    }
    
    public static SubLObject f35170(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        assert module0574.NIL != Types.keywordp(var32) : var32;
        return conses_high.assoc(var32, module0574.$g4169$.getDynamicValue(var33), (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED).rest();
    }
    
    public static SubLObject f35126() {
        return module0018.$g692$.getGlobalValue();
    }
    
    public static SubLObject f35171(final SubLObject var32) {
        module0018.$g692$.setGlobalValue(var32);
        return module0018.$g692$.getGlobalValue();
    }
    
    public static SubLObject f35127(SubLObject var33) {
        if (var33 == module0574.UNPROVIDED) {
            var33 = (SubLObject)module0574.$ic9$;
        }
        assert module0574.NIL != f35169(var33) : var33;
        if (module0574.NIL == module0018.f967()) {
            module0018.f966();
        }
        if (!f35126().eql(var33)) {
            if (module0574.NIL == module0572.f35020()) {
                module0572.f35018((SubLObject)module0574.UNPROVIDED);
            }
            if (module0574.NIL != module0018.$g695$.getGlobalValue() && module0574.NIL != module0572.f35035()) {
                f35172();
            }
            final SubLObject var34 = var33;
            if (var34.eql((SubLObject)module0574.$ic8$)) {
                f35173();
            }
            else if (var34.eql((SubLObject)module0574.$ic10$)) {
                f35174();
            }
            else if (var34.eql((SubLObject)module0574.$ic2$)) {
                f35175();
            }
            else if (var34.eql((SubLObject)module0574.$ic63$)) {
                f35176();
            }
            else if (var34.eql((SubLObject)module0574.$ic64$)) {
                f35177();
            }
            else {
                f35178();
            }
        }
        return f35126();
    }
    
    public static SubLObject f35179(final SubLObject var35) {
        return module0004.f104(var35, module0574.$g4188$.getGlobalValue(), (SubLObject)module0574.$ic66$, (SubLObject)module0574.UNPROVIDED);
    }
    
    public static SubLObject f35180(final SubLObject var35) {
        return module0004.f104(var35, module0574.$g4189$.getGlobalValue(), (SubLObject)module0574.$ic66$, (SubLObject)module0574.UNPROVIDED);
    }
    
    public static SubLObject f35181(final SubLObject var36, final SubLObject var37) {
        assert module0574.NIL != f35179(var36) : var36;
        assert module0574.NIL != f35180(var37) : var37;
        return f35127(f35182(var36, var37));
    }
    
    public static SubLObject f35183(final SubLObject var36) {
        return f35181(var36, f35184((SubLObject)module0574.UNPROVIDED));
    }
    
    public static SubLObject f35185(final SubLObject var37) {
        return f35181(f35186((SubLObject)module0574.UNPROVIDED), var37);
    }
    
    public static SubLObject f35187() {
        module0572.f35017();
        module0572.f35036((SubLObject)module0574.$ic70$);
        f35137((SubLObject)module0574.T);
        f35139((SubLObject)module0574.T);
        module0018.$g689$.setDynamicValue((SubLObject)module0574.T);
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35188() {
        module0572.f35017();
        f35137((SubLObject)module0574.T);
        f35139((SubLObject)module0574.T);
        module0018.$g689$.setDynamicValue((SubLObject)module0574.T);
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35189() {
        module0572.f35017();
        f35137((SubLObject)module0574.NIL);
        f35139((SubLObject)module0574.NIL);
        module0018.$g689$.setDynamicValue((SubLObject)module0574.NIL);
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35190() {
        module0572.f35019(module0572.f35020());
        f35133((SubLObject)module0574.T);
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35191() {
        f35133((SubLObject)module0574.NIL);
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35192(final SubLObject var38) {
        if (f35186(var38).equal(f35186(f35126()))) {
            return (SubLObject)module0574.NIL;
        }
        return (SubLObject)module0574.T;
    }
    
    public static SubLObject f35193(final SubLObject var38) {
        if (f35184(var38).equal(f35184(f35126()))) {
            return (SubLObject)module0574.NIL;
        }
        return (SubLObject)module0574.T;
    }
    
    public static SubLObject f35178() {
        if (module0574.NIL != f35192((SubLObject)module0574.$ic9$)) {
            f35188();
        }
        if (module0574.NIL != f35193((SubLObject)module0574.$ic9$)) {
            f35190();
        }
        f35171((SubLObject)module0574.$ic9$);
        return (SubLObject)module0574.$ic9$;
    }
    
    public static SubLObject f35175() {
        if (module0574.NIL != f35192((SubLObject)module0574.$ic2$)) {
            f35188();
        }
        if (module0574.NIL != f35193((SubLObject)module0574.$ic2$)) {
            f35191();
        }
        f35171((SubLObject)module0574.$ic2$);
        return (SubLObject)module0574.$ic2$;
    }
    
    public static SubLObject f35176() {
        if (module0574.NIL != f35192((SubLObject)module0574.$ic63$)) {
            f35189();
        }
        if (module0574.NIL != f35193((SubLObject)module0574.$ic63$)) {
            f35191();
        }
        f35171((SubLObject)module0574.$ic63$);
        return (SubLObject)module0574.$ic63$;
    }
    
    public static SubLObject f35173() {
        if (module0574.NIL != f35192((SubLObject)module0574.$ic8$)) {
            f35187();
        }
        if (module0574.NIL != f35193((SubLObject)module0574.$ic8$)) {
            f35190();
        }
        f35171((SubLObject)module0574.$ic8$);
        return (SubLObject)module0574.$ic8$;
    }
    
    public static SubLObject f35174() {
        if (module0574.NIL != f35192((SubLObject)module0574.$ic10$)) {
            f35187();
        }
        if (module0574.NIL != f35193((SubLObject)module0574.$ic10$)) {
            f35191();
        }
        f35171((SubLObject)module0574.$ic10$);
        return (SubLObject)module0574.$ic10$;
    }
    
    public static SubLObject f35177() {
        if (module0574.NIL != f35192((SubLObject)module0574.$ic64$)) {
            f35189();
        }
        if (module0574.NIL != f35193((SubLObject)module0574.$ic64$)) {
            f35190();
        }
        f35171((SubLObject)module0574.$ic64$);
        return (SubLObject)module0574.$ic64$;
    }
    
    public static SubLObject f35194() {
        if (f35126().equal((SubLObject)module0574.$ic10$) || f35126().equal((SubLObject)module0574.$ic8$)) {
            return (SubLObject)module0574.T;
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35195() {
        if (f35126().equal((SubLObject)module0574.$ic2$) || f35126().equal((SubLObject)module0574.$ic9$)) {
            return (SubLObject)module0574.T;
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35196() {
        if (f35126().equal((SubLObject)module0574.$ic63$) || f35126().equal((SubLObject)module0574.$ic64$)) {
            return (SubLObject)module0574.T;
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35197() {
        if (f35126() == module0574.$ic8$ || f35126() == module0574.$ic9$ || f35126() == module0574.$ic64$) {
            return (SubLObject)module0574.T;
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35186(SubLObject var32) {
        if (var32 == module0574.UNPROVIDED) {
            var32 = f35126();
        }
        SubLObject var33 = (SubLObject)module0574.NIL;
        if (var32 == module0574.$ic8$ || var32 == module0574.$ic10$) {
            var33 = (SubLObject)module0574.$ic71$;
        }
        else if (var32 == module0574.$ic2$ || var32 == module0574.$ic9$) {
            var33 = (SubLObject)module0574.$ic72$;
        }
        else if (var32 == module0574.$ic63$ || var32 == module0574.$ic64$) {
            var33 = (SubLObject)module0574.$ic73$;
        }
        else {
            var33 = (SubLObject)module0574.NIL;
        }
        return var33;
    }
    
    public static SubLObject f35184(SubLObject var32) {
        if (var32 == module0574.UNPROVIDED) {
            var32 = f35126();
        }
        SubLObject var33 = (SubLObject)module0574.NIL;
        if (var32 == module0574.$ic8$ || var32 == module0574.$ic9$ || var32 == module0574.$ic64$) {
            var33 = (SubLObject)module0574.$ic74$;
        }
        else if (var32 == module0574.$ic2$ || var32 == module0574.$ic10$ || var32 == module0574.$ic63$) {
            var33 = (SubLObject)module0574.$ic75$;
        }
        else {
            var33 = (SubLObject)module0574.NIL;
        }
        return var33;
    }
    
    public static SubLObject f35182(final SubLObject var36, final SubLObject var37) {
        if (module0574.NIL != var36 && !module0574.areAssertionsDisabledFor(me) && module0574.NIL == f35179(var36)) {
            throw new AssertionError(var36);
        }
        if (module0574.NIL != var37 && !module0574.areAssertionsDisabledFor(me) && module0574.NIL == f35180(var37)) {
            throw new AssertionError(var37);
        }
        if (module0574.NIL != var36 && module0574.NIL != var37) {
            SubLObject var38 = (SubLObject)module0574.NIL;
            if (module0574.NIL != Strings.string_equal(var36, (SubLObject)module0574.$ic71$, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED) && module0574.NIL != Strings.string_equal(var37, (SubLObject)module0574.$ic74$, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED)) {
                var38 = (SubLObject)module0574.$ic8$;
            }
            else if (module0574.NIL != Strings.string_equal(var36, (SubLObject)module0574.$ic71$, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED) && module0574.NIL != Strings.string_equal(var37, (SubLObject)module0574.$ic75$, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED)) {
                var38 = (SubLObject)module0574.$ic10$;
            }
            else if (module0574.NIL != Strings.string_equal(var36, (SubLObject)module0574.$ic72$, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED) && module0574.NIL != Strings.string_equal(var37, (SubLObject)module0574.$ic74$, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED)) {
                var38 = (SubLObject)module0574.$ic9$;
            }
            else if (module0574.NIL != Strings.string_equal(var36, (SubLObject)module0574.$ic72$, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED) && module0574.NIL != Strings.string_equal(var37, (SubLObject)module0574.$ic75$, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED)) {
                var38 = (SubLObject)module0574.$ic2$;
            }
            else if (module0574.NIL != Strings.string_equal(var36, (SubLObject)module0574.$ic73$, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED) && module0574.NIL != Strings.string_equal(var37, (SubLObject)module0574.$ic74$, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED)) {
                var38 = (SubLObject)module0574.$ic64$;
            }
            else if (module0574.NIL != Strings.string_equal(var36, (SubLObject)module0574.$ic73$, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED) && module0574.NIL != Strings.string_equal(var37, (SubLObject)module0574.$ic75$, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED)) {
                var38 = (SubLObject)module0574.$ic63$;
            }
            else {
                var38 = (SubLObject)module0574.NIL;
            }
            return var38;
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35198(final SubLObject var40) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var40.isCons() && Sequences.length(var40).numE((SubLObject)module0574.FOUR_INTEGER) && conses_high.second(var40).isString() && conses_high.third(var40).isInteger() && conses_high.fourth(var40).isCons());
    }
    
    public static SubLObject f35199(final SubLObject var41) {
        if (module0018.f967().equalp(conses_high.second(var41))) {
            return (SubLObject)module0574.T;
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35200() {
        return (SubLObject)SubLObjectFactory.makeBoolean(!f35186(f35126()).equal((SubLObject)module0574.$ic76$));
    }
    
    public static SubLObject f35201() {
        return Equality.equal(f35184(f35126()), (SubLObject)module0574.$ic77$);
    }
    
    public static SubLObject f35202() {
        f35172();
        if (module0574.NIL == module0575.f35278()) {
            module0572.f35036((SubLObject)module0574.$ic78$);
            module0572.f35017();
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35203() {
        f35172();
        if (module0574.NIL == module0575.f35278()) {
            while (module0574.NIL == module0575.f35278()) {
                module0575.f35275(module0575.f35281());
                f35147();
            }
            module0572.f35036((SubLObject)module0574.$ic70$);
            module0572.f35017();
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35204() {
        f35172();
        f35205();
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35205() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0574.NIL != module0573.f35083()) {
            module0573.f35110();
        }
        else {
            final SubLObject var3 = module0572.f35020();
            final SubLObject var4 = (SubLObject)((module0574.NIL != Filesys.probe_file(var3)) ? module0574.$ic80$ : module0574.$ic81$);
            SubLObject var5 = (SubLObject)module0574.NIL;
            try {
                final SubLObject var6 = stream_macros.$stream_requires_locking$.currentBinding(var2);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0574.NIL, var2);
                    var5 = compatibility.open_text(var3, var4);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var6, var2);
                }
                if (!var5.isStream()) {
                    Errors.error((SubLObject)module0574.$ic82$, var3);
                }
                final SubLObject var45_46 = var5;
                if (var45_46.isStream()) {
                    while (module0574.NIL == module0575.f35273()) {
                        PrintLow.format(var45_46, (SubLObject)module0574.$ic83$, module0575.f35276());
                    }
                }
            }
            finally {
                final SubLObject var7 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0574.T, var2);
                    if (var5.isStream()) {
                        streams_high.close(var5, (SubLObject)module0574.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var7, var2);
                }
            }
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35206() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0574.NIL != Locks.lock_idle_p(module0574.$g4191$.getDynamicValue(var2))) {
            return f35172();
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35172() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0574.NIL != module0575.$g3927$.getDynamicValue(var2)) {
            f35207();
        }
        if (module0574.NIL == module0575.f35258()) {
            final SubLObject var3 = module0574.$g4191$.getDynamicValue(var2);
            SubLObject var4 = (SubLObject)module0574.NIL;
            try {
                var4 = Locks.seize_lock(var3);
                f35208((SubLObject)module0574.UNPROVIDED);
            }
            finally {
                if (module0574.NIL != var4) {
                    Locks.release_lock(var3);
                }
            }
            return (SubLObject)module0574.T;
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35208(SubLObject var49) {
        if (var49 == module0574.UNPROVIDED) {
            var49 = (SubLObject)module0574.NIL;
        }
        final SubLThread var50 = SubLProcess.currentSubLThread();
        final SubLObject var51 = module0572.f35035();
        final SubLObject var52 = (SubLObject)((module0574.NIL != Filesys.probe_file(var51)) ? module0574.$ic80$ : module0574.$ic81$);
        SubLObject var53 = (SubLObject)module0574.NIL;
        try {
            final SubLObject var54 = stream_macros.$stream_requires_locking$.currentBinding(var50);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0574.NIL, var50);
                var53 = compatibility.open_text(var51, var52);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var54, var50);
            }
            if (!var53.isStream()) {
                Errors.error((SubLObject)module0574.$ic82$, var51);
            }
            final SubLObject var45_52 = var53;
            if (var45_52.isStream()) {
                final SubLObject var55 = print_high.$print_level$.currentBinding(var50);
                final SubLObject var56 = print_high.$print_length$.currentBinding(var50);
                try {
                    print_high.$print_level$.bind((SubLObject)module0574.NIL, var50);
                    print_high.$print_length$.bind((SubLObject)module0574.NIL, var50);
                    SubLObject var57 = (SubLObject)module0574.NIL;
                    while (module0574.NIL == module0575.f35258()) {
                        var57 = module0575.f35261();
                        if (module0574.NIL == f35130() && module0574.NIL != f35195()) {
                            PrintLow.format(var45_52, (SubLObject)module0574.$ic83$, var57);
                            module0575.f35280(var57);
                            f35145();
                        }
                        if (module0574.NIL != f35120() && module0574.NIL != f35194()) {
                            module0575.f35275(var57);
                            f35147();
                        }
                    }
                }
                finally {
                    print_high.$print_length$.rebind(var56, var50);
                    print_high.$print_level$.rebind(var55, var50);
                }
            }
        }
        finally {
            final SubLObject var58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var50);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0574.T, var50);
                if (var53.isStream()) {
                    streams_high.close(var53, (SubLObject)module0574.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var58, var50);
            }
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35209() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0574.NIL != Locks.lock_idle_p(module0574.$g4192$.getDynamicValue(var2))) {
            return f35207();
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35207() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0574.NIL == module0575.f35263()) {
            final SubLObject var3 = module0574.$g4192$.getDynamicValue(var2);
            SubLObject var4 = (SubLObject)module0574.NIL;
            try {
                var4 = Locks.seize_lock(var3);
                f35210();
            }
            finally {
                if (module0574.NIL != var4) {
                    Locks.release_lock(var3);
                }
            }
            return (SubLObject)module0574.T;
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35210() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0572.f35045();
        final SubLObject var4 = (SubLObject)((module0574.NIL != Filesys.probe_file(var3)) ? module0574.$ic80$ : module0574.$ic81$);
        SubLObject var5 = (SubLObject)module0574.NIL;
        try {
            final SubLObject var6 = stream_macros.$stream_requires_locking$.currentBinding(var2);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0574.NIL, var2);
                var5 = compatibility.open_text(var3, var4);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var6, var2);
            }
            if (!var5.isStream()) {
                Errors.error((SubLObject)module0574.$ic82$, var3);
            }
            final SubLObject var45_58 = var5;
            if (var45_58.isStream()) {
                final SubLObject var7 = print_high.$print_level$.currentBinding(var2);
                final SubLObject var8 = print_high.$print_length$.currentBinding(var2);
                try {
                    print_high.$print_level$.bind((SubLObject)module0574.NIL, var2);
                    print_high.$print_length$.bind((SubLObject)module0574.NIL, var2);
                    SubLObject var9 = (SubLObject)module0574.NIL;
                    while (module0574.NIL == module0575.f35263()) {
                        var9 = module0575.f35266();
                        if (module0574.NIL == f35130() && module0574.NIL != f35195()) {
                            PrintLow.format(var45_58, (SubLObject)module0574.$ic83$, var9);
                            module0575.f35280(var9);
                            f35145();
                        }
                        if (module0574.NIL != f35120() && module0574.NIL != f35194()) {
                            module0575.f35275(var9);
                            f35147();
                        }
                    }
                }
                finally {
                    print_high.$print_length$.rebind(var8, var2);
                    print_high.$print_level$.rebind(var7, var2);
                }
            }
        }
        finally {
            final SubLObject var10 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0574.T, var2);
                if (var5.isStream()) {
                    streams_high.close(var5, (SubLObject)module0574.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var10, var2);
            }
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35211(final SubLObject var59, final SubLObject var60) {
        if (var59.equal(module0018.f971())) {
            if (module0574.NIL != module0018.f959()) {
                module0018.f970(var60);
                f35149((SubLObject)module0574.ZERO_INTEGER);
                module0018.f977((SubLObject)module0574.NIL);
                if (module0574.NIL != var60) {
                    module0745.f46218();
                    module0572.f35038();
                    f35123((SubLObject)module0574.NIL);
                }
                if (module0574.NIL == f35124()) {
                    f35121((SubLObject)module0574.T);
                }
            }
            else {
                f35123((SubLObject)module0574.T);
                f35127((SubLObject)module0574.$ic2$);
                f35121((SubLObject)module0574.NIL);
            }
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35212(final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        SubLObject var47 = compatibility.get_file_position(var45);
        var46.resetMultipleValues();
        SubLObject var48 = reader.read_ignoring_errors(var45, (SubLObject)module0574.NIL, (SubLObject)module0574.$ic86$);
        SubLObject var49 = var46.secondMultipleValue();
        var46.resetMultipleValues();
        if (var48 == module0574.$ic86$) {
            return (SubLObject)module0574.NIL;
        }
        if (var49 == module0574.$ic87$) {
            Errors.error((SubLObject)module0574.$ic88$, var48, var47);
        }
        else {
            if (module0574.NIL != f35198(var48)) {
                return var48;
            }
            if (module0574.NIL == module0110.$g1372$.getDynamicValue(var46)) {
                Errors.cerror((SubLObject)module0574.$ic89$, (SubLObject)module0574.$ic88$, var48, var47);
            }
            while (var48 != module0574.$ic86$ && module0574.NIL == f35198(var48)) {
                var47 = Numbers.add(var47, (SubLObject)module0574.ONE_INTEGER);
                compatibility.set_file_position(var45, var47);
                var46.resetMultipleValues();
                final SubLObject var50 = reader.read_ignoring_errors(var45, (SubLObject)module0574.NIL, (SubLObject)module0574.$ic86$);
                final SubLObject var51 = var46.secondMultipleValue();
                var46.resetMultipleValues();
                var48 = var50;
                var49 = var51;
            }
            if (var48 == module0574.$ic86$) {
                return (SubLObject)module0574.NIL;
            }
            if (module0574.NIL != f35198(var48)) {
                return var48;
            }
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35213(final SubLObject var45, final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        final SubLObject var68 = compatibility.get_file_position(var45);
        final SubLObject var69 = Strings.make_string(Numbers.subtract(var68, var66), (SubLObject)module0574.UNPROVIDED);
        SubLObject var70;
        SubLObject var71;
        for (var70 = Sequences.length(var69), var71 = (SubLObject)module0574.NIL, var71 = (SubLObject)module0574.ZERO_INTEGER; var71.numL(var70); var71 = Numbers.add(var71, (SubLObject)module0574.ONE_INTEGER)) {
            Strings.set_char(var69, var71, streams_high.read_char(var45, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED));
        }
        if (module0574.NIL == module0110.$g1372$.getDynamicValue(var67)) {
            Errors.cerror((SubLObject)module0574.$ic90$, (SubLObject)module0574.$ic91$, var69);
        }
        compatibility.set_file_position(var45, var66);
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35214() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0574.NIL != module0573.f35083()) {
            module0573.f35114();
        }
        else {
            final SubLObject var3 = Filesys.probe_file(module0572.f35042());
            if (module0572.f35042().equal(module0572.f35020()) && module0574.NIL != module0572.f35022() && module0574.NIL == var3) {
                Errors.error((SubLObject)module0574.$ic94$, module0572.f35020());
            }
            else if (module0574.NIL != module0572.f35042() && module0574.NIL != var3) {
                if (module0572.f35042().equal(module0572.f35020())) {
                    module0572.f35016((SubLObject)module0574.T);
                }
                if (module0574.NIL == module0574.$g4194$.getGlobalValue()) {
                    SubLObject var4 = (SubLObject)module0574.NIL;
                    try {
                        final SubLObject var5 = stream_macros.$stream_requires_locking$.currentBinding(var2);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)module0574.NIL, var2);
                            var4 = compatibility.open_text(module0572.f35042(), (SubLObject)module0574.$ic95$);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(var5, var2);
                        }
                        if (!var4.isStream()) {
                            Errors.error((SubLObject)module0574.$ic82$, module0572.f35042());
                        }
                        final SubLObject var6 = var4;
                        module0574.$g4195$.setGlobalValue(streams_high.file_length(var6));
                    }
                    finally {
                        final SubLObject var7 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0574.T, var2);
                            if (var4.isStream()) {
                                streams_high.close(var4, (SubLObject)module0574.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var7, var2);
                        }
                    }
                }
                final SubLObject var8 = module0574.$g4193$.currentBinding(var2);
                try {
                    module0574.$g4193$.bind((SubLObject)module0574.NIL, var2);
                    f35215();
                    if (module0574.NIL != module0574.$g4193$.getDynamicValue(var2)) {
                        if (module0574.NIL == module0574.$g4194$.getGlobalValue()) {
                            module0574.$g4194$.setGlobalValue((SubLObject)module0574.T);
                        }
                        if (module0572.f35031().numGE(module0574.$g4195$.getGlobalValue())) {
                            module0018.f977((SubLObject)module0574.T);
                        }
                    }
                }
                finally {
                    module0574.$g4193$.rebind(var8, var2);
                }
            }
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35215() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0574.NIL;
        try {
            final SubLObject var4 = stream_macros.$stream_requires_locking$.currentBinding(var2);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0574.NIL, var2);
                var3 = compatibility.open_text(module0572.f35042(), (SubLObject)module0574.$ic95$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var4, var2);
            }
            if (!var3.isStream()) {
                Errors.error((SubLObject)module0574.$ic82$, module0572.f35042());
            }
            final SubLObject var45_74 = var3;
            compatibility.set_file_position(var45_74, module0572.f35031());
            SubLObject var5 = (SubLObject)module0574.ONE_INTEGER;
            SubLObject var6 = (SubLObject)module0574.NIL;
            SubLObject var7 = (SubLObject)module0574.NIL;
            var6 = f35212(var45_74);
            var7 = compatibility.get_file_position(var45_74);
            while (module0574.NIL != var6 && (module0574.NIL == f35128() || !var5.numE(f35128()))) {
                if (module0574.NIL == module0018.f976() && var7.numG(module0574.$g4195$.getGlobalValue())) {
                    module0018.f977((SubLObject)module0574.T);
                }
                var5 = Numbers.add(var5, (SubLObject)module0574.ONE_INTEGER);
                module0575.f35288(var6);
                var6 = f35212(var45_74);
                var7 = compatibility.get_file_position(var45_74);
            }
            if (module0574.NIL != f35128() && var5.numE(f35128())) {
                if (module0574.NIL == module0018.f976() && var7.numG(module0574.$g4195$.getGlobalValue())) {
                    module0018.f977((SubLObject)module0574.T);
                }
                var5 = Numbers.add(var5, (SubLObject)module0574.ONE_INTEGER);
                module0575.f35288(var6);
            }
            module0572.f35032(compatibility.get_file_position(var45_74));
        }
        finally {
            final SubLObject var8 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0574.T, var2);
                if (var3.isStream()) {
                    streams_high.close(var3, (SubLObject)module0574.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var8, var2);
            }
        }
        module0574.$g4193$.setDynamicValue((SubLObject)module0574.T, var2);
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35216() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0574.NIL != f35132() && module0574.NIL == module0575.f35253());
    }
    
    public static SubLObject f35217() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)module0574.T, (SubLObject)module0574.$ic96$);
        streams_high.finish_output(StreamsLow.$standard_output$.getDynamicValue(var2));
        while (module0574.NIL == module0018.f976()) {
            f35214();
            while (module0574.NIL == module0575.f35253()) {
                SubLObject var3 = (SubLObject)module0574.NIL;
                if (Numbers.mod(f35163(), (SubLObject)module0574.$ic97$).numE((SubLObject)module0574.ZERO_INTEGER)) {
                    streams_high.finish_output(StreamsLow.$error_output$.getDynamicValue(var2));
                    var2.resetMultipleValues();
                    final SubLObject var4 = Time.decode_universal_time(Time.get_universal_time(), (SubLObject)module0574.UNPROVIDED);
                    final SubLObject var5 = var2.secondMultipleValue();
                    final SubLObject var6 = var2.thirdMultipleValue();
                    final SubLObject var7 = var2.fourthMultipleValue();
                    final SubLObject var8 = var2.fifthMultipleValue();
                    final SubLObject var9 = var2.sixthMultipleValue();
                    var2.resetMultipleValues();
                    PrintLow.format((SubLObject)module0574.T, (SubLObject)module0574.$ic98$, new SubLObject[] { var9, var8, var7, var6, var5, var4, f35163() });
                    streams_high.finish_output(StreamsLow.$standard_output$.getDynamicValue(var2));
                }
                module0538.f33316();
                try {
                    var2.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var10 = Errors.$error_handler$.currentBinding(var2);
                    try {
                        Errors.$error_handler$.bind((SubLObject)module0574.$ic43$, var2);
                        try {
                            final SubLObject var15_84 = Errors.$continue_cerrorP$.currentBinding(var2);
                            final SubLObject var11 = Errors.$ignore_warnsP$.currentBinding(var2);
                            try {
                                Errors.$continue_cerrorP$.bind((SubLObject)module0574.T, var2);
                                Errors.$ignore_warnsP$.bind((SubLObject)module0574.T, var2);
                                module0575.f35290();
                            }
                            finally {
                                Errors.$ignore_warnsP$.rebind(var11, var2);
                                Errors.$continue_cerrorP$.rebind(var15_84, var2);
                            }
                        }
                        catch (Throwable var12) {
                            Errors.handleThrowable(var12, (SubLObject)module0574.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var10, var2);
                    }
                }
                catch (Throwable var13) {
                    var3 = Errors.handleThrowable(var13, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var2.throwStack.pop();
                }
                if (module0574.NIL != module0538.f33324()) {
                    var3 = module0538.f33327();
                }
                if (var3.isString()) {
                    Errors.warn(var3);
                }
            }
        }
        streams_high.finish_output(StreamsLow.$error_output$.getDynamicValue(var2));
        PrintLow.format((SubLObject)module0574.T, (SubLObject)module0574.$ic99$, f35163());
        streams_high.finish_output(StreamsLow.$standard_output$.getDynamicValue(var2));
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35218(final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        final SubLObject var64 = module0111.$g1406$.currentBinding(var63);
        try {
            module0111.$g1406$.bind((SubLObject)module0574.NIL, var63);
            final SubLObject var65 = conses_high.fourth(var62);
            if (module0574.NIL != var65) {
                module0018.$g677$.setGlobalValue(var65);
                final SubLObject var15_85 = module0018.$g693$.currentBinding(var63);
                try {
                    module0018.$g693$.bind((SubLObject)module0574.T, var63);
                    SubLObject var66 = (SubLObject)module0574.NIL;
                    try {
                        var63.throwStack.push(module0574.$ic100$);
                        var66 = module0571.f34994(var65);
                    }
                    catch (Throwable var67) {
                        var66 = Errors.handleThrowable(var67, (SubLObject)module0574.$ic100$);
                    }
                    finally {
                        var63.throwStack.pop();
                    }
                    if (module0574.NIL != var66) {
                        Eval.eval(var66);
                    }
                }
                finally {
                    module0018.$g693$.rebind(var15_85, var63);
                }
            }
        }
        finally {
            module0111.$g1406$.rebind(var64, var63);
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35219(final SubLObject var87, SubLObject var88, SubLObject var89, SubLObject var90, SubLObject var91) {
        if (var88 == module0574.UNPROVIDED) {
            var88 = (SubLObject)module0574.NIL;
        }
        if (var89 == module0574.UNPROVIDED) {
            var89 = (SubLObject)module0574.$ic101$;
        }
        if (var90 == module0574.UNPROVIDED) {
            var90 = (SubLObject)module0574.NIL;
        }
        if (var91 == module0574.UNPROVIDED) {
            var91 = (SubLObject)module0574.NIL;
        }
        final SubLThread var92 = SubLProcess.currentSubLThread();
        if (module0574.NIL != Filesys.probe_file(var87)) {
            SubLObject var93 = (SubLObject)module0574.ZERO_INTEGER;
            SubLObject var94 = (SubLObject)module0574.ZERO_INTEGER;
            final SubLObject var95 = module0018.$g689$.currentBinding(var92);
            try {
                module0018.$g689$.bind((var89 == module0574.$ic102$) ? var88 : module0018.$g689$.getDynamicValue(var92), var92);
                final SubLObject var96 = module0075.f5249(var87);
                SubLObject var97 = (SubLObject)module0574.NIL;
                try {
                    final SubLObject var15_96 = stream_macros.$stream_requires_locking$.currentBinding(var92);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0574.NIL, var92);
                        var97 = compatibility.open_text(var87, (SubLObject)module0574.$ic95$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var15_96, var92);
                    }
                    if (!var97.isStream()) {
                        Errors.error((SubLObject)module0574.$ic82$, var87);
                    }
                    final SubLObject var45_97 = var97;
                    if (var90.isInteger()) {
                        compatibility.set_file_position(var45_97, var90);
                    }
                    final SubLObject var15_97 = module0012.$g75$.currentBinding(var92);
                    final SubLObject var98 = module0012.$g76$.currentBinding(var92);
                    final SubLObject var99 = module0012.$g77$.currentBinding(var92);
                    final SubLObject var100 = module0012.$g78$.currentBinding(var92);
                    try {
                        module0012.$g75$.bind((SubLObject)module0574.ZERO_INTEGER, var92);
                        module0012.$g76$.bind((SubLObject)module0574.NIL, var92);
                        module0012.$g77$.bind((SubLObject)module0574.T, var92);
                        module0012.$g78$.bind(Time.get_universal_time(), var92);
                        module0012.f478(PrintLow.format((SubLObject)module0574.NIL, (SubLObject)module0574.$ic103$, var87));
                        SubLObject var101;
                        for (var101 = (SubLObject)module0574.NIL, var101 = f35212(var45_97); module0574.NIL != var101 && var101 != module0574.$ic86$; var101 = f35212(var45_97)) {
                            if (var101.isCons()) {
                                var94 = Numbers.add(var94, (SubLObject)module0574.ONE_INTEGER);
                            }
                            module0012.note_percent_progress(compatibility.get_file_position(var45_97), var96);
                            if (module0574.NIL == var91 || (var91.isInteger() && var94.numGE(var91))) {
                                if (var89 == module0574.$ic104$) {
                                    module0575.f35284(conses_high.fourth(var101), (SubLObject)module0574.NIL);
                                }
                                else if (var89 == module0574.$ic102$) {
                                    f35218(var101);
                                }
                                else {
                                    module0575.f35292(var101);
                                }
                                var93 = Numbers.add(var93, (SubLObject)module0574.ONE_INTEGER);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var100, var92);
                        module0012.$g77$.rebind(var99, var92);
                        module0012.$g76$.rebind(var98, var92);
                        module0012.$g75$.rebind(var15_97, var92);
                    }
                }
                finally {
                    final SubLObject var15_98 = Threads.$is_thread_performing_cleanupP$.currentBinding(var92);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0574.T, var92);
                        if (var97.isStream()) {
                            streams_high.close(var97, (SubLObject)module0574.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var15_98, var92);
                    }
                }
            }
            finally {
                module0018.$g689$.rebind(var95, var92);
            }
            return var93;
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35220(SubLObject var45) {
        if (var45 == module0574.UNPROVIDED) {
            var45 = StreamsLow.$standard_output$.getDynamicValue();
        }
        PrintLow.format(var45, (SubLObject)module0574.$ic105$, module0051.f3552((SubLObject)module0574.UNPROVIDED));
        PrintLow.format(var45, (SubLObject)module0574.$ic106$, Environment.get_machine_name((SubLObject)module0574.UNPROVIDED));
        PrintLow.format(var45, (SubLObject)module0574.$ic107$, f35152());
        PrintLow.format(var45, (SubLObject)module0574.$ic108$, f35164());
        PrintLow.format(var45, (SubLObject)module0574.$ic109$, module0011.f351());
        PrintLow.format(var45, (SubLObject)module0574.$ic110$, f35170(f35126()));
        PrintLow.format(var45, (SubLObject)module0574.$ic111$, module0593.f36286());
        PrintLow.format(var45, (SubLObject)module0574.$ic112$);
        if (module0575.f35267().isPositive() || f35142().isPositive()) {
            PrintLow.format(var45, (SubLObject)module0574.$ic113$);
            if (module0575.f35267().isPositive()) {
                PrintLow.format(var45, (SubLObject)module0574.$ic114$, module0575.f35267(), f35142());
            }
            else {
                PrintLow.format(var45, (SubLObject)module0574.$ic115$, f35142());
            }
        }
        if (f35163().isPositive() || (module0575.f35252().isPositive() && module0574.NIL != f35132())) {
            PrintLow.format(var45, (SubLObject)module0574.$ic116$);
            if (module0575.f35252().isPositive() && module0574.NIL != f35132()) {
                PrintLow.format(var45, (SubLObject)module0574.$ic114$, module0575.f35252(), f35163());
            }
            else {
                PrintLow.format(var45, (SubLObject)module0574.$ic115$, f35163());
            }
        }
        if (module0574.NIL != module0575.f35283()) {
            PrintLow.format(var45, (SubLObject)module0574.$ic117$);
            if (module0575.f35243().isPositive() || module0575.f35257().isPositive()) {
                PrintLow.format(var45, (SubLObject)module0574.$ic118$, new SubLObject[] { module0575.f35243(), module0575.f35257(), module0575.f35277() });
            }
            else {
                PrintLow.format(var45, (SubLObject)module0574.$ic115$, module0575.f35277());
            }
        }
        streams_high.terpri(var45);
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35221(final SubLObject var87, SubLObject var102) {
        if (var102 == module0574.UNPROVIDED) {
            var102 = (SubLObject)module0574.NIL;
        }
        assert module0574.NIL != Types.stringp(var87) : var87;
        if (module0574.NIL == module0575.f35244()) {
            while (module0574.NIL == module0575.f35244()) {
                module0575.f35286();
            }
        }
        f35172();
        final SubLObject var103 = module0593.f36267();
        final SubLObject var104 = module0572.$g4159$.getGlobalValue();
        final SubLObject var105 = module0572.$g4160$.getGlobalValue();
        final SubLObject var106 = module0018.$g692$.getGlobalValue();
        final SubLObject var107 = module0055.f4036(module0575.$g4196$.getGlobalValue());
        final SubLObject var108 = module0055.f4036(module0575.f35250());
        final SubLObject var109 = module0055.f4036(module0575.$g4197$.getGlobalValue());
        final SubLObject var110 = module0055.f4036(module0575.$g4198$.getGlobalValue());
        SubLObject var111 = (SubLObject)module0574.NIL;
        if (module0574.NIL != var103) {
            module0593.f36279((SubLObject)module0574.UNPROVIDED);
        }
        module0572.$g4161$.setGlobalValue((SubLObject)module0574.NIL);
        module0572.$g4159$.setGlobalValue((SubLObject)module0574.NIL);
        module0572.f35019((SubLObject)module0574.NIL);
        module0018.$g692$.setGlobalValue((SubLObject)module0574.$ic119$);
        module0575.f35254();
        module0575.f35245();
        module0575.f35269();
        module0575.f35259();
        var111 = Mapper.write_image(var87, var102);
        module0572.f35018((SubLObject)module0574.UNPROVIDED);
        module0572.$g4159$.setGlobalValue(var104);
        module0572.f35019(var105);
        if (module0574.NIL != f35169(var106)) {
            f35127(var106);
        }
        module0575.$g4196$.setGlobalValue(var107);
        module0575.f35251(var108);
        module0575.$g4197$.setGlobalValue(var109);
        module0575.$g4198$.setGlobalValue(var110);
        if (module0574.NIL != var103) {
            module0593.f36268((SubLObject)module0574.UNPROVIDED);
        }
        return var111;
    }
    
    public static SubLObject f35222(SubLObject var112) {
        if (var112 == module0574.UNPROVIDED) {
            var112 = (SubLObject)module0574.ZERO_INTEGER;
        }
        final SubLThread var113 = SubLProcess.currentSubLThread();
        if (module0574.NIL == Errors.$ignore_mustsP$.getDynamicValue(var113) && (module0574.NIL == module0004.f106(var112) || !var112.numLE((SubLObject)module0574.$ic120$))) {
            Errors.error((SubLObject)module0574.$ic121$);
        }
        final SubLObject var114 = Strings.sublisp_char((SubLObject)module0574.$ic122$, var112);
        final SubLObject var115 = module0018.f971();
        SubLObject var116 = (SubLObject)module0574.NIL;
        SubLObject var117 = (SubLObject)module0574.NIL;
        SubLObject var119;
        final SubLObject var118 = var119 = module0011.f353();
        SubLObject var120 = (SubLObject)module0574.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var119, var118, (SubLObject)module0574.$ic123$);
        var120 = var119.first();
        final SubLObject var121;
        var119 = (var121 = var119.rest());
        final SubLObject var122 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0574.$ic124$), var121);
        SubLObject var123 = (SubLObject)module0574.$ic125$;
        SubLObject var124 = var122;
        SubLObject var125 = (SubLObject)module0574.NIL;
        var125 = var124.first();
        while (module0574.NIL != var124) {
            var123 = Sequences.cconcatenate(var123, new SubLObject[] { module0574.$ic126$, var125 });
            var124 = var124.rest();
            var125 = var124.first();
        }
        if (module0574.NIL != var115) {
            var116 = PrintLow.format((SubLObject)module0574.NIL, (SubLObject)module0574.$ic127$, new SubLObject[] { var120, var123, f35167(), var114 });
        }
        else {
            var116 = PrintLow.format((SubLObject)module0574.NIL, (SubLObject)module0574.$ic128$, new SubLObject[] { var120, var123, var114 });
        }
        var117 = (SubLObject)module0574.$ic129$;
        return Sequences.cconcatenate(var116, new SubLObject[] { module0574.$ic130$, var117 });
    }
    
    public static SubLObject f35223(final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        assert module0574.NIL != Filesys.directory_p(var124) : var124;
        if (module0574.NIL == Errors.$ignore_mustsP$.getDynamicValue(var125) && module0574.NIL == module0075.f5192(var124, (SubLObject)module0574.UNPROVIDED)) {
            Errors.error((SubLObject)module0574.$ic132$);
        }
        SubLObject var126;
        SubLObject var127;
        SubLObject var128;
        for (var126 = (SubLObject)module0574.NIL, var126 = (SubLObject)module0574.ZERO_INTEGER; var126.numL((SubLObject)module0574.$ic133$); var126 = Numbers.add(var126, (SubLObject)module0574.ONE_INTEGER)) {
            var127 = f35222(var126);
            var128 = Sequences.cconcatenate(var124, var127);
            if (module0574.NIL == Filesys.probe_file(var128)) {
                return var128;
            }
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35224(SubLObject var127) {
        if (var127 == module0574.UNPROVIDED) {
            var127 = (SubLObject)module0574.$ic134$;
        }
        Errors.warn((SubLObject)module0574.$ic135$, var127);
        module0593.f36279((SubLObject)module0574.UNPROVIDED);
        if (module0574.NIL != module0018.f971()) {
            f35172();
            module0572.f35036((SubLObject)module0574.$ic136$);
            module0414.f28947();
            module0414.f28987();
        }
        Processes.exit((SubLObject)module0574.ZERO_INTEGER);
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35225() {
        return module0574.$g4199$.getGlobalValue();
    }
    
    public static SubLObject f35226(final SubLObject var5) {
        assert module0574.NIL != module0173.f10955(var5) : var5;
        module0574.$g4199$.setGlobalValue(var5);
        return f35225();
    }
    
    public static SubLObject f35227() {
        module0574.$g4199$.setGlobalValue((SubLObject)module0574.NIL);
        return f35225();
    }
    
    public static SubLObject f35228(final SubLObject var128) {
        if (module0574.$g4199$.getGlobalValue().eql(var128)) {
            f35127(f35182(f35186(f35126()), (SubLObject)module0574.$ic75$));
            f35227();
        }
        return var128;
    }
    
    public static SubLObject f35229(final SubLObject var128) {
        return module0575.f35295(module0571.f34986((SubLObject)ConsesLow.list((SubLObject)module0574.$ic138$, var128)));
    }
    
    public static SubLObject f35230() {
        if (module0574.NIL == f35120()) {
            final SubLObject var129 = module0018.f971();
            final SubLObject var130 = module0048.f_1X(var129);
            f35211(var129, var130);
        }
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35231(final SubLObject var131, final SubLObject var132) {
        final SubLObject var133 = var131.rest();
        final SubLObject var135;
        final SubLObject var134 = var135 = var133;
        return (SubLObject)ConsesLow.list((SubLObject)module0574.$ic139$, (SubLObject)ConsesLow.list((SubLObject)module0574.$ic140$, (SubLObject)ConsesLow.list((SubLObject)module0574.$ic141$, (SubLObject)ConsesLow.list((SubLObject)module0574.$ic142$, (SubLObject)ConsesLow.list((SubLObject)module0574.$ic143$, (SubLObject)ConsesLow.list((SubLObject)module0574.$ic144$, (SubLObject)module0574.$ic145$, reader.bq_cons((SubLObject)module0574.$ic146$, ConsesLow.append(var135, (SubLObject)module0574.NIL))))))));
    }
    
    public static SubLObject f35232(SubLObject var136) {
        if (var136 == module0574.UNPROVIDED) {
            var136 = (SubLObject)module0574.$ic147$;
        }
        f35191();
        final SubLObject var138;
        SubLObject var137 = var138 = ((module0574.NIL == var136) ? Numbers.$most_positive_fixnum$.getGlobalValue() : var136);
        while (module0574.NIL != module0593.f36288()) {
            if (var137.isZero()) {
                Errors.error((SubLObject)module0574.$ic148$, var138);
            }
            var137 = Numbers.subtract(var137, (SubLObject)module0574.ONE_INTEGER);
            Threads.sleep((SubLObject)module0574.ONE_INTEGER);
        }
        module0593.f36279((SubLObject)module0574.UNPROVIDED);
        return var137;
    }
    
    public static SubLObject f35233(SubLObject var139, SubLObject var140) {
        if (var139 == module0574.UNPROVIDED) {
            var139 = (SubLObject)module0574.NIL;
        }
        if (var140 == module0574.UNPROVIDED) {
            var140 = (SubLObject)module0574.$ic149$;
        }
        final SubLThread var141 = SubLProcess.currentSubLThread();
        final SubLObject var142 = module0176.$g2196$.getGlobalValue();
        final SubLObject var143 = module0160.f10437(var142);
        final SubLObject var144 = module0160.f10418(var142);
        try {
            module0160.f10447(var142);
            module0160.f10417(var142);
            final SubLObject var141_144 = module0186.$g2230$.getGlobalValue();
            final SubLObject var142_145 = module0160.f10437(var141_144);
            final SubLObject var143_146 = module0160.f10418(var141_144);
            try {
                module0160.f10447(var141_144);
                module0160.f10417(var141_144);
                final SubLObject var141_145 = module0181.$g2216$.getGlobalValue();
                final SubLObject var142_146 = module0160.f10437(var141_145);
                final SubLObject var143_147 = module0160.f10418(var141_145);
                try {
                    module0160.f10447(var141_145);
                    module0160.f10417(var141_145);
                    final SubLObject var141_146 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var142_147 = module0160.f10437(var141_146);
                    final SubLObject var143_148 = module0160.f10418(var141_146);
                    try {
                        module0160.f10447(var141_146);
                        module0160.f10417(var141_146);
                        final SubLObject var141_147 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var142_148 = module0160.f10437(var141_147);
                        final SubLObject var143_149 = module0160.f10418(var141_147);
                        try {
                            module0160.f10447(var141_147);
                            module0160.f10417(var141_147);
                            final SubLObject var145 = module0018.$g694$.currentBinding(var141);
                            try {
                                module0018.$g694$.bind((SubLObject)module0574.NIL, var141);
                                if (!var139.isString()) {
                                    var139 = f35234((SubLObject)module0574.UNPROVIDED);
                                }
                                if (module0574.NIL == module0075.f5192(var139, (SubLObject)module0574.UNPROVIDED)) {
                                    Errors.cerror((SubLObject)module0574.$ic150$, (SubLObject)module0574.$ic151$, var139);
                                    module0075.f5241(var139, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED);
                                    if (module0574.NIL == Errors.$ignore_mustsP$.getDynamicValue(var141) && module0574.NIL == module0075.f5192(var139, (SubLObject)module0574.UNPROVIDED)) {
                                        Errors.error((SubLObject)module0574.$ic152$, var139);
                                    }
                                }
                                final SubLObject var146 = f35235();
                                module0414.f28953();
                                final SubLObject var147 = module0018.f971();
                                try {
                                    module0018.f970(Numbers.subtract(var147, (SubLObject)module0574.ONE_INTEGER));
                                    final SubLObject var148 = var140;
                                    if (var148.eql((SubLObject)module0574.$ic153$)) {
                                        module0618.f37926(var139);
                                    }
                                    else if (var148.eql((SubLObject)module0574.$ic154$)) {
                                        module0618.f37924(var139);
                                    }
                                    else if (var148.eql((SubLObject)module0574.$ic149$)) {
                                        module0618.f37933(var139);
                                    }
                                    else {
                                        Errors.error((SubLObject)module0574.$ic155$, var140);
                                    }
                                }
                                finally {
                                    final SubLObject var15_158 = Threads.$is_thread_performing_cleanupP$.currentBinding(var141);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0574.T, var141);
                                        module0018.f970(var147);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var15_158, var141);
                                    }
                                }
                                module0069.f4937(var146, f35236(var139));
                                module0414.f28942(f35237(var139));
                            }
                            finally {
                                module0018.$g694$.rebind(var145, var141);
                            }
                        }
                        finally {
                            final SubLObject var149 = Threads.$is_thread_performing_cleanupP$.currentBinding(var141);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0574.T, var141);
                                if (module0574.NIL != var142_148) {
                                    module0160.f10446(var141_147);
                                }
                                if (module0574.NIL == var143_149) {
                                    module0160.f10414(var141_147, (SubLObject)module0574.$ic156$, (SubLObject)module0574.$ic157$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var149, var141);
                            }
                        }
                    }
                    finally {
                        final SubLObject var150 = Threads.$is_thread_performing_cleanupP$.currentBinding(var141);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0574.T, var141);
                            if (module0574.NIL != var142_147) {
                                module0160.f10446(var141_146);
                            }
                            if (module0574.NIL == var143_148) {
                                module0160.f10414(var141_146, (SubLObject)module0574.$ic156$, (SubLObject)module0574.$ic157$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var150, var141);
                        }
                    }
                }
                finally {
                    final SubLObject var151 = Threads.$is_thread_performing_cleanupP$.currentBinding(var141);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0574.T, var141);
                        if (module0574.NIL != var142_146) {
                            module0160.f10446(var141_145);
                        }
                        if (module0574.NIL == var143_147) {
                            module0160.f10414(var141_145, (SubLObject)module0574.$ic156$, (SubLObject)module0574.$ic157$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var151, var141);
                    }
                }
            }
            finally {
                final SubLObject var152 = Threads.$is_thread_performing_cleanupP$.currentBinding(var141);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0574.T, var141);
                    if (module0574.NIL != var142_145) {
                        module0160.f10446(var141_144);
                    }
                    if (module0574.NIL == var143_146) {
                        module0160.f10414(var141_144, (SubLObject)module0574.$ic156$, (SubLObject)module0574.$ic157$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var152, var141);
                }
            }
        }
        finally {
            final SubLObject var153 = Threads.$is_thread_performing_cleanupP$.currentBinding(var141);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0574.T, var141);
                if (module0574.NIL != var143) {
                    module0160.f10446(var142);
                }
                if (module0574.NIL == var144) {
                    module0160.f10414(var142, (SubLObject)module0574.$ic156$, (SubLObject)module0574.$ic157$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var153, var141);
            }
        }
        return Values.values(var139, var140);
    }
    
    public static SubLObject f35234(SubLObject var159) {
        if (var159 == module0574.UNPROVIDED) {
            var159 = (SubLObject)module0574.NIL;
        }
        final SubLObject var160 = var159.isString() ? module0618.f37915(module0018.f971(), (SubLObject)ConsesLow.list(var159)) : module0618.f37915(module0018.f971(), (SubLObject)module0574.UNPROVIDED);
        final SubLObject var161 = module0038.f2624(module0038.f2637(var160));
        final SubLObject var162 = module0038.f2666(var160, (SubLObject)module0574.UNPROVIDED);
        return Sequences.cconcatenate(var162, new SubLObject[] { module0574.$ic158$, module0038.f2624(f35163()), var161 });
    }
    
    public static SubLObject f35238(final SubLObject var139) {
        final SubLThread var140 = SubLProcess.currentSubLThread();
        module0618.f37949(var139);
        streams_high.terpri((SubLObject)module0574.UNPROVIDED);
        final SubLObject var141 = (SubLObject)module0574.$ic159$;
        final SubLObject var142 = module0012.$g73$.currentBinding(var140);
        final SubLObject var143 = module0012.$g65$.currentBinding(var140);
        final SubLObject var144 = module0012.$g67$.currentBinding(var140);
        final SubLObject var145 = module0012.$g68$.currentBinding(var140);
        final SubLObject var146 = module0012.$g66$.currentBinding(var140);
        final SubLObject var147 = module0012.$g69$.currentBinding(var140);
        final SubLObject var148 = module0012.$g70$.currentBinding(var140);
        final SubLObject var149 = module0012.$silent_progressP$.currentBinding(var140);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var140);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var140), var140);
            module0012.$g67$.bind((SubLObject)module0574.ONE_INTEGER, var140);
            module0012.$g68$.bind((SubLObject)module0574.ZERO_INTEGER, var140);
            module0012.$g66$.bind((SubLObject)module0574.ZERO_INTEGER, var140);
            module0012.$g69$.bind((SubLObject)module0574.ZERO_INTEGER, var140);
            module0012.$g70$.bind((SubLObject)module0574.T, var140);
            module0012.$silent_progressP$.bind((SubLObject)((module0574.NIL != var141) ? module0012.$silent_progressP$.getDynamicValue(var140) : module0574.T), var140);
            module0012.f474(var141);
            final SubLObject var150 = f35237(var139);
            if (module0574.NIL != Filesys.probe_file(var150)) {
                module0414.f28954(var150);
            }
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var149, var140);
            module0012.$g70$.rebind(var148, var140);
            module0012.$g69$.rebind(var147, var140);
            module0012.$g66$.rebind(var146, var140);
            module0012.$g68$.rebind(var145, var140);
            module0012.$g67$.rebind(var144, var140);
            module0012.$g65$.rebind(var143, var140);
            module0012.$g73$.rebind(var142, var140);
        }
        final SubLObject var151 = module0069.f4939(f35236(var139));
        f35239(var151);
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35236(final SubLObject var139) {
        return module0618.f37916((SubLObject)module0574.$ic160$, var139, (SubLObject)module0574.UNPROVIDED);
    }
    
    public static SubLObject f35237(final SubLObject var139) {
        return module0618.f37916((SubLObject)module0574.$ic161$, var139, (SubLObject)module0574.UNPROVIDED);
    }
    
    public static SubLObject f35235() {
        return (SubLObject)ConsesLow.list((SubLObject)module0574.$ic162$, f35140(), (SubLObject)module0574.$ic163$, f35163());
    }
    
    public static SubLObject f35239(final SubLObject var156) {
        SubLObject var157 = (SubLObject)module0574.NIL;
        SubLObject var158 = var156;
        SubLObject var159 = (SubLObject)module0574.NIL;
        SubLObject var174_175 = (SubLObject)module0574.NIL;
        while (module0574.NIL != var158) {
            cdestructuring_bind.destructuring_bind_must_consp(var158, var156, (SubLObject)module0574.$ic164$);
            var174_175 = var158.first();
            var158 = var158.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var158, var156, (SubLObject)module0574.$ic164$);
            if (module0574.NIL == conses_high.member(var174_175, (SubLObject)module0574.$ic165$, (SubLObject)module0574.UNPROVIDED, (SubLObject)module0574.UNPROVIDED)) {
                var159 = (SubLObject)module0574.T;
            }
            if (var174_175 == module0574.$ic166$) {
                var157 = var158.first();
            }
            var158 = var158.rest();
        }
        if (module0574.NIL != var159 && module0574.NIL == var157) {
            cdestructuring_bind.cdestructuring_bind_error(var156, (SubLObject)module0574.$ic164$);
        }
        final SubLObject var160 = cdestructuring_bind.property_list_member((SubLObject)module0574.$ic162$, var156);
        final SubLObject var161 = (SubLObject)((module0574.NIL != var160) ? conses_high.cadr(var160) : module0574.NIL);
        final SubLObject var162 = cdestructuring_bind.property_list_member((SubLObject)module0574.$ic163$, var156);
        final SubLObject var163 = (SubLObject)((module0574.NIL != var162) ? conses_high.cadr(var162) : module0574.NIL);
        f35141(var161);
        f35149(var163);
        return (SubLObject)module0574.$ic167$;
    }
    
    public static SubLObject f35240() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35120", "S#38476", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35121", "S#38474", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35122", "S#38548", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35123", "S#38549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35124", "S#38550", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35125", "S#38551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35128", "S#38475", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35129", "S#38552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35130", "S#38553", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35131", "S#38554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35132", "S#38555", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35133", "S#38556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35134", "S#38557", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35135", "S#38558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35136", "S#38559", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35137", "S#38560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35138", "S#38561", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35139", "S#38562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35140", "S#38563", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35141", "S#38564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35142", "S#38565", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35143", "S#38566", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35144", "S#38567", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35145", "S#38568", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35146", "S#38569", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35147", "S#38570", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35148", "S#38571", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35149", "S#38572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35150", "S#38573", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35151", "S#38574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35152", "THE-CYCLIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35153", "S#711", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35154", "S#38575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35155", "THE-CYCLIST-IS-GUEST?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35156", "IMAGE-REQUIRES-AUTHENTICATION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35157", "AUTHENTICATE-THE-CYCLIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35158", "S#38576", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35159", "S#38577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35160", "SPECIFY-AUTHENTICATION-INFO-FOR-USER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35161", "S#38578", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35162", "S#38579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35163", "S#25128", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35164", "KB-VERSION-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35165", "S#38580", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35166", "KB-NUMBER-STRING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35167", "KB-LOADED-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35168", "S#38581", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35169", "S#38582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35170", "S#38583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35126", "S#32538", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35171", "S#38584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35127", "SET-COMMUNICATION-MODE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35179", "S#38585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35180", "S#38586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35181", "S#38587", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35183", "S#38588", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35185", "S#38589", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35187", "S#38590", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35188", "S#38591", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35189", "S#38592", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35190", "S#38593", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35191", "S#38594", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35192", "S#38595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35193", "S#38596", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35178", "S#38597", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35175", "S#38598", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35176", "S#38599", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35173", "S#38600", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35174", "S#38601", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35177", "S#38602", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35194", "S#38603", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35195", "S#38604", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35196", "S#38605", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35197", "S#38606", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35186", "S#38607", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35184", "S#38608", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35182", "S#38609", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35198", "S#38481", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35199", "S#38610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35200", "S#38611", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35201", "S#38612", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35202", "S#38613", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35203", "S#38614", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35204", "S#38615", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35205", "S#38616", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35206", "S#38617", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35172", "S#38618", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35208", "S#38619", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35209", "S#38620", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35207", "S#38621", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35210", "S#38622", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35211", "S#38623", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35212", "S#38388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35213", "S#38624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35214", "S#38625", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35215", "S#38626", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35216", "S#38627", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35217", "S#38628", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35218", "S#38629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35219", "LOAD-TRANSCRIPT-FILE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35220", "SERVER-SUMMARY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35221", "S#38630", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35222", "S#38631", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35223", "S#38632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35224", "HALT-CYC-IMAGE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35225", "S#38633", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35226", "S#38634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35227", "S#38635", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35228", "S#38636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35229", "S#38637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35230", "S#38638", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0574", "f35231", "S#38639");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35232", "S#38640", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35233", "S#38641", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35234", "S#38642", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35238", "S#38643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35236", "S#38644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35237", "S#38645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35235", "S#38646", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0574", "f35239", "S#38647", 1, 0, false);
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35241() {
        module0574.$g4169$ = SubLFiles.defparameter("S#38648", (SubLObject)module0574.$ic0$);
        module0574.$g4170$ = SubLFiles.defvar("*STARTUP-COMMUNICATION-MODE*", (SubLObject)module0574.$ic5$);
        module0574.$g4171$ = SubLFiles.deflexical("S#38649", (SubLObject)((module0574.NIL != Symbols.boundp((SubLObject)module0574.$ic6$)) ? module0574.$g4171$.getGlobalValue() : module0574.T));
        module0574.$g4172$ = SubLFiles.deflexical("S#38650", (SubLObject)((module0574.NIL != Symbols.boundp((SubLObject)module0574.$ic7$)) ? module0574.$g4172$.getGlobalValue() : module0574.NIL));
        module0574.$g4173$ = SubLFiles.defparameter("S#38651", (SubLObject)module0574.NIL);
        module0574.$g4174$ = SubLFiles.defparameter("S#38652", (SubLObject)module0574.$ic11$);
        module0574.$g4175$ = SubLFiles.deflexical("S#38653", (SubLObject)((module0574.NIL != Symbols.boundp((SubLObject)module0574.$ic12$)) ? module0574.$g4175$.getGlobalValue() : module0574.T));
        module0574.$g4176$ = SubLFiles.deflexical("S#38654", (SubLObject)((module0574.NIL != Symbols.boundp((SubLObject)module0574.$ic13$)) ? module0574.$g4176$.getGlobalValue() : module0574.T));
        module0574.$g4177$ = SubLFiles.deflexical("S#38655", (SubLObject)((module0574.NIL != Symbols.boundp((SubLObject)module0574.$ic14$)) ? module0574.$g4177$.getGlobalValue() : module0574.T));
        module0574.$g4178$ = SubLFiles.deflexical("S#38656", (SubLObject)((module0574.NIL != Symbols.boundp((SubLObject)module0574.$ic15$)) ? module0574.$g4178$.getGlobalValue() : module0574.NIL));
        module0574.$g4179$ = SubLFiles.deflexical("S#38657", (SubLObject)((module0574.NIL != Symbols.boundp((SubLObject)module0574.$ic16$)) ? module0574.$g4179$.getGlobalValue() : module0574.ZERO_INTEGER));
        module0574.$g4180$ = SubLFiles.deflexical("S#38658", (SubLObject)((module0574.NIL != Symbols.boundp((SubLObject)module0574.$ic17$)) ? module0574.$g4180$.getGlobalValue() : module0574.ZERO_INTEGER));
        module0574.$g4181$ = SubLFiles.deflexical("S#38659", (SubLObject)((module0574.NIL != Symbols.boundp((SubLObject)module0574.$ic18$)) ? module0574.$g4181$.getGlobalValue() : module0574.ZERO_INTEGER));
        module0574.$g4182$ = SubLFiles.deflexical("S#38660", (SubLObject)((module0574.NIL != Symbols.boundp((SubLObject)module0574.$ic19$)) ? module0574.$g4182$.getGlobalValue() : module0574.ZERO_INTEGER));
        module0574.$g4183$ = SubLFiles.deflexical("S#38661", (SubLObject)((module0574.NIL != Symbols.boundp((SubLObject)module0574.$ic20$)) ? module0574.$g4183$.getGlobalValue() : module0574.ZERO_INTEGER));
        module0574.$g4184$ = SubLFiles.deflexical("S#38662", (SubLObject)((module0574.NIL != Symbols.boundp((SubLObject)module0574.$ic21$)) ? module0574.$g4184$.getGlobalValue() : module0574.ZERO_INTEGER));
        module0574.$g4185$ = SubLFiles.deflexical("S#38663", (SubLObject)module0574.NIL);
        module0574.$g4186$ = SubLFiles.defparameter("S#38664", module0574.$ic30$);
        module0574.$g4187$ = SubLFiles.defparameter("S#38665", module0574.$ic38$);
        module0574.$g4188$ = SubLFiles.deflexical("S#38666", (SubLObject)module0574.$ic65$);
        module0574.$g4189$ = SubLFiles.deflexical("S#38667", (SubLObject)module0574.$ic67$);
        module0574.$g4190$ = SubLFiles.deflexical("S#38668", (SubLObject)module0574.$ic79$);
        module0574.$g4191$ = SubLFiles.defparameter("S#38669", Locks.make_lock((SubLObject)module0574.$ic84$));
        module0574.$g4192$ = SubLFiles.defparameter("S#38670", Locks.make_lock((SubLObject)module0574.$ic85$));
        module0574.$g4193$ = SubLFiles.defvar("S#38671", (SubLObject)module0574.NIL);
        module0574.$g4194$ = SubLFiles.deflexical("S#38672", (SubLObject)((module0574.NIL != Symbols.boundp((SubLObject)module0574.$ic92$)) ? module0574.$g4194$.getGlobalValue() : module0574.NIL));
        module0574.$g4195$ = SubLFiles.deflexical("S#38673", (SubLObject)((module0574.NIL != Symbols.boundp((SubLObject)module0574.$ic93$)) ? module0574.$g4195$.getGlobalValue() : module0574.ZERO_INTEGER));
        module0574.$g4199$ = SubLFiles.deflexical("S#38674", (SubLObject)((module0574.NIL != Symbols.boundp((SubLObject)module0574.$ic137$)) ? module0574.$g4199$.getGlobalValue() : module0574.NIL));
        return (SubLObject)module0574.NIL;
    }
    
    public static SubLObject f35242() {
        module0110.f7668((SubLObject)module0574.$ic1$, (SubLObject)module0574.$ic2$, (SubLObject)module0574.$ic3$, (SubLObject)module0574.$ic4$);
        module0003.f57((SubLObject)module0574.$ic6$);
        module0003.f57((SubLObject)module0574.$ic7$);
        module0003.f57((SubLObject)module0574.$ic12$);
        module0003.f57((SubLObject)module0574.$ic13$);
        module0003.f57((SubLObject)module0574.$ic14$);
        module0003.f57((SubLObject)module0574.$ic15$);
        module0003.f57((SubLObject)module0574.$ic16$);
        module0003.f57((SubLObject)module0574.$ic17$);
        module0003.f57((SubLObject)module0574.$ic18$);
        module0003.f57((SubLObject)module0574.$ic19$);
        module0003.f57((SubLObject)module0574.$ic20$);
        module0003.f57((SubLObject)module0574.$ic21$);
        module0002.f38((SubLObject)module0574.$ic22$);
        module0012.f368((SubLObject)module0574.$ic24$, (SubLObject)module0574.NIL, (SubLObject)module0574.$ic25$, (SubLObject)module0574.NIL, (SubLObject)module0574.$ic26$);
        module0012.f368((SubLObject)module0574.$ic27$, (SubLObject)module0574.NIL, (SubLObject)module0574.$ic28$, (SubLObject)module0574.NIL, (SubLObject)module0574.$ic29$);
        module0012.f368((SubLObject)module0574.$ic33$, (SubLObject)module0574.$ic34$, (SubLObject)module0574.$ic35$, (SubLObject)module0574.$ic36$, (SubLObject)module0574.$ic37$);
        module0012.f368((SubLObject)module0574.$ic45$, (SubLObject)module0574.$ic46$, (SubLObject)module0574.$ic47$, (SubLObject)module0574.$ic48$, (SubLObject)module0574.$ic49$);
        module0002.f38((SubLObject)module0574.$ic54$);
        module0002.f38((SubLObject)module0574.$ic57$);
        module0002.f38((SubLObject)module0574.$ic59$);
        module0003.f57((SubLObject)module0574.$ic92$);
        module0003.f57((SubLObject)module0574.$ic93$);
        module0003.f57((SubLObject)module0574.$ic137$);
        return (SubLObject)module0574.NIL;
    }
    
    public void declareFunctions() {
        f35240();
    }
    
    public void initializeVariables() {
        f35241();
    }
    
    public void runTopLevelForms() {
        f35242();
    }
    
    static {
        me = (SubLFile)new module0574();
        module0574.$g4169$ = null;
        module0574.$g4170$ = null;
        module0574.$g4171$ = null;
        module0574.$g4172$ = null;
        module0574.$g4173$ = null;
        module0574.$g4174$ = null;
        module0574.$g4175$ = null;
        module0574.$g4176$ = null;
        module0574.$g4177$ = null;
        module0574.$g4178$ = null;
        module0574.$g4179$ = null;
        module0574.$g4180$ = null;
        module0574.$g4181$ = null;
        module0574.$g4182$ = null;
        module0574.$g4183$ = null;
        module0574.$g4184$ = null;
        module0574.$g4185$ = null;
        module0574.$g4186$ = null;
        module0574.$g4187$ = null;
        module0574.$g4188$ = null;
        module0574.$g4189$ = null;
        module0574.$g4190$ = null;
        module0574.$g4191$ = null;
        module0574.$g4192$ = null;
        module0574.$g4193$ = null;
        module0574.$g4194$ = null;
        module0574.$g4195$ = null;
        module0574.$g4199$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TRANSMIT-AND-RECEIVE"), (SubLObject)SubLObjectFactory.makeString("Sending and Receiving")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RECEIVE-ONLY"), (SubLObject)SubLObjectFactory.makeString("Storing and Receiving")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TRANSMIT-ONLY"), (SubLObject)SubLObjectFactory.makeString("Sending Only")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DEAD-RECEIVE"), (SubLObject)SubLObjectFactory.makeString("Not Recording but Receiving")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DEAF"), (SubLObject)SubLObjectFactory.makeString("Storing Only")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DEAD"), (SubLObject)SubLObjectFactory.makeString("Not Recording or Receiving")));
        $ic1$ = SubLObjectFactory.makeSymbol("*STARTUP-COMMUNICATION-MODE*");
        $ic2$ = SubLObjectFactory.makeKeyword("DEAF");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("S#38648", "CYC"));
        $ic4$ = SubLObjectFactory.makeString("This is the communication mode the cyc image should get \ninitialized to at system startup.");
        $ic5$ = SubLObjectFactory.makeKeyword("UNSET");
        $ic6$ = SubLObjectFactory.makeSymbol("S#38649", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#38650", "CYC");
        $ic8$ = SubLObjectFactory.makeKeyword("TRANSMIT-AND-RECEIVE");
        $ic9$ = SubLObjectFactory.makeKeyword("RECEIVE-ONLY");
        $ic10$ = SubLObjectFactory.makeKeyword("TRANSMIT-ONLY");
        $ic11$ = SubLObjectFactory.makeInteger(200);
        $ic12$ = SubLObjectFactory.makeSymbol("S#38653", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#38654", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#38655", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#38656", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#38657", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#38658", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#38659", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#38660", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#38661", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#38662", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("THE-CYCLIST");
        $ic23$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Guest"));
        $ic24$ = SubLObjectFactory.makeSymbol("THE-CYCLIST-IS-GUEST?");
        $ic25$ = SubLObjectFactory.makeString("Return T iff the current CyclIst is the #$Guest account.");
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")));
        $ic27$ = SubLObjectFactory.makeSymbol("IMAGE-REQUIRES-AUTHENTICATION?");
        $ic28$ = SubLObjectFactory.makeString("@return non-NIL iff this Cyc image requires authentication.");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycBrowser"));
        $ic31$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic32$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic33$ = SubLObjectFactory.makeSymbol("AUTHENTICATE-THE-CYCLIST");
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38676", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38664", "CYC")));
        $ic35$ = SubLObjectFactory.makeString("Ensure that the encrypted passphrase (e.g. SHA1 of password and user name, or similar)\n   is the one recorded for APPLICATION for the Cyclist identified by NAME\n   in the current KB.\n   Otherwise, sets the cyclist to #$Guest.\n   @return FORT-P the current cyclist\n   @see THE-CYCLIST-IS-GUEST?");
        $ic36$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38676", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-P"));
        $ic38$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CyclistsMt"));
        $ic39$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UserOfProgramFn"));
        $ic40$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic41$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("encryptedPasswordForUser"));
        $ic42$ = SubLObjectFactory.makeString("Please login to specify authentication information for others.");
        $ic43$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic44$ = SubLObjectFactory.makeString("Cyclists can only edit their own passwords.");
        $ic45$ = SubLObjectFactory.makeSymbol("SPECIFY-AUTHENTICATION-INFO-FOR-USER");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#710", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38677", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38676", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38664", "CYC")));
        $ic47$ = SubLObjectFactory.makeString("Store the authenitcation information for the user in the currrent KB.\n   Any valid user may add a password, but only the same user may edit it.\n   @param CYCLIST the cyclist for whom to establish this credential\n   @param PASSPHRASE the password as a STRINGP\n   @param APPLICATION the FORT-P denoting the program or NIL if it is the general credential\n   @return 0 BOOLEANP success indicator\n   @return 1 STRINGP error message, valid if BOOLEANP is NIL");
        $ic48$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#710", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38677", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $ic49$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP"));
        $ic50$ = SubLObjectFactory.makeString("~&Error ~A: ~A~%");
        $ic51$ = SubLObjectFactory.makeString("Cannot assert passphrase for ~A: ~A");
        $ic52$ = SubLObjectFactory.makeString("Cannot unassert missing passphrase for ~A ... concurrent modification?");
        $ic53$ = SubLObjectFactory.makeString("Cannot unassert passphrase ~A for ~A: ~A");
        $ic54$ = SubLObjectFactory.makeSymbol("KB-VERSION-STRING");
        $ic55$ = SubLObjectFactory.makeString("~a.~a");
        $ic56$ = SubLObjectFactory.makeString("~a");
        $ic57$ = SubLObjectFactory.makeSymbol("KB-NUMBER-STRING");
        $ic58$ = SubLObjectFactory.makeString("~4,'0D");
        $ic59$ = SubLObjectFactory.makeSymbol("KB-LOADED-STRING");
        $ic60$ = SubLObjectFactory.makeSymbol("CAR");
        $ic61$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic62$ = SubLObjectFactory.makeSymbol("S#38582", "CYC");
        $ic63$ = SubLObjectFactory.makeKeyword("DEAD");
        $ic64$ = SubLObjectFactory.makeKeyword("DEAD-RECEIVE");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("transmit"), (SubLObject)SubLObjectFactory.makeString("store"), (SubLObject)SubLObjectFactory.makeString("none"));
        $ic66$ = SubLObjectFactory.makeSymbol("STRING-EQUAL");
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("yes"), (SubLObject)SubLObjectFactory.makeString("no"));
        $ic68$ = SubLObjectFactory.makeSymbol("S#38585", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#38586", "CYC");
        $ic70$ = SubLObjectFactory.makeString("SENT");
        $ic71$ = SubLObjectFactory.makeString("transmit");
        $ic72$ = SubLObjectFactory.makeString("store");
        $ic73$ = SubLObjectFactory.makeString("none");
        $ic74$ = SubLObjectFactory.makeString("yes");
        $ic75$ = SubLObjectFactory.makeString("no");
        $ic76$ = SubLObjectFactory.makeString("None");
        $ic77$ = SubLObjectFactory.makeString("Yes");
        $ic78$ = SubLObjectFactory.makeString("CLEARED");
        $ic79$ = SubLObjectFactory.makeString("build-requests@cyc.com");
        $ic80$ = SubLObjectFactory.makeKeyword("APPEND");
        $ic81$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic82$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic83$ = SubLObjectFactory.makeString("~s~%");
        $ic84$ = SubLObjectFactory.makeString("Save Transcript OPS lock");
        $ic85$ = SubLObjectFactory.makeString("Save Hl-Transcript OPS lock");
        $ic86$ = SubLObjectFactory.makeKeyword("EOF");
        $ic87$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic88$ = SubLObjectFactory.makeString("Bogus form ~S read from transcript at position ~S");
        $ic89$ = SubLObjectFactory.makeString("Skip forward until a valid transcript form is reached");
        $ic90$ = SubLObjectFactory.makeString("Assume the rest of the operation is now there and retry reading it");
        $ic91$ = SubLObjectFactory.makeString("Partial transcript operation ~S was read in");
        $ic92$ = SubLObjectFactory.makeSymbol("S#38672", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("S#38673", "CYC");
        $ic94$ = SubLObjectFactory.makeString("The transcript file ~s has already been accessed, but cannot be found now.");
        $ic95$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic96$ = SubLObjectFactory.makeString("~&Processing master transcript operations~%");
        $ic97$ = SubLObjectFactory.makeInteger(100);
        $ic98$ = SubLObjectFactory.makeString("~&~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D: processed ~A operations~%");
        $ic99$ = SubLObjectFactory.makeString("~&Finished processing ~A master transcript operations~%");
        $ic100$ = SubLObjectFactory.makeKeyword("UNENCAPSULATION-ERROR");
        $ic101$ = SubLObjectFactory.makeKeyword("AUX");
        $ic102$ = SubLObjectFactory.makeKeyword("NONE");
        $ic103$ = SubLObjectFactory.makeString("Loading ~A");
        $ic104$ = SubLObjectFactory.makeKeyword("LOCAL");
        $ic105$ = SubLObjectFactory.makeString("~%Server Summary:  ~A");
        $ic106$ = SubLObjectFactory.makeString("   Machine: ~A");
        $ic107$ = SubLObjectFactory.makeString("~%Cyclist: ~A");
        $ic108$ = SubLObjectFactory.makeString("   KB: ~A");
        $ic109$ = SubLObjectFactory.makeString("   System: ~A");
        $ic110$ = SubLObjectFactory.makeString("~%Comm: ~A");
        $ic111$ = SubLObjectFactory.makeString("   Agenda: ~A");
        $ic112$ = SubLObjectFactory.makeString("~%Queues:");
        $ic113$ = SubLObjectFactory.makeString("   Aux: ");
        $ic114$ = SubLObjectFactory.makeString("(~d ~d)");
        $ic115$ = SubLObjectFactory.makeString("(~d)");
        $ic116$ = SubLObjectFactory.makeString("   Remote: ");
        $ic117$ = SubLObjectFactory.makeString("   Local: ");
        $ic118$ = SubLObjectFactory.makeString("(~d ~d ~d)");
        $ic119$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic120$ = SubLObjectFactory.makeInteger(25);
        $ic121$ = SubLObjectFactory.makeString("Minor-version ~S is not in the range 0 - 25.");
        $ic122$ = SubLObjectFactory.makeString("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        $ic123$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37821", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#38678", "CYC"));
        $ic124$ = SubLObjectFactory.makeSymbol("S#746", "CYC");
        $ic125$ = SubLObjectFactory.makeString("");
        $ic126$ = SubLObjectFactory.makeString("p");
        $ic127$ = SubLObjectFactory.makeString("cyc-s~D~A-kb~A-~C");
        $ic128$ = SubLObjectFactory.makeString("cyc-s~D~A-~C");
        $ic129$ = SubLObjectFactory.makeString("world");
        $ic130$ = SubLObjectFactory.makeString(".");
        $ic131$ = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $ic132$ = SubLObjectFactory.makeString("Directory ~S is not writeable");
        $ic133$ = SubLObjectFactory.makeInteger(26);
        $ic134$ = SubLObjectFactory.makeString("done");
        $ic135$ = SubLObjectFactory.makeString("Halting Cyc image : ~A");
        $ic136$ = SubLObjectFactory.makeString("QUIT");
        $ic137$ = SubLObjectFactory.makeSymbol("S#38674", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("S#38636", "CYC");
        $ic139$ = SubLObjectFactory.makeSymbol("S#13941", "CYC");
        $ic140$ = SubLObjectFactory.makeSymbol("S#14521", "CYC");
        $ic141$ = SubLObjectFactory.makeSymbol("S#14296", "CYC");
        $ic142$ = SubLObjectFactory.makeSymbol("S#13684", "CYC");
        $ic143$ = SubLObjectFactory.makeSymbol("S#13514", "CYC");
        $ic144$ = SubLObjectFactory.makeSymbol("CLET");
        $ic145$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1921", "CYC"), (SubLObject)module0574.NIL));
        $ic146$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic147$ = SubLObjectFactory.makeInteger(60);
        $ic148$ = SubLObjectFactory.makeString("Timeout of ~A secs arrived, without agenda stopping work.");
        $ic149$ = SubLObjectFactory.makeKeyword("ESSENTIAL");
        $ic150$ = SubLObjectFactory.makeString("Create directory and continue.");
        $ic151$ = SubLObjectFactory.makeString("Directory ~S does not exist.");
        $ic152$ = SubLObjectFactory.makeString("Still cannot write to dump directory ~A.");
        $ic153$ = SubLObjectFactory.makeKeyword("FULL");
        $ic154$ = SubLObjectFactory.makeKeyword("STANDARD");
        $ic155$ = SubLObjectFactory.makeString("Unknown dump style ~A not implemented.~%");
        $ic156$ = SubLObjectFactory.makeInteger(2048);
        $ic157$ = SubLObjectFactory.makeInteger(256);
        $ic158$ = SubLObjectFactory.makeString("op");
        $ic159$ = SubLObjectFactory.makeString("Loading transformation rule statistics into incremental KB");
        $ic160$ = SubLObjectFactory.makeString("incremental-stats");
        $ic161$ = SubLObjectFactory.makeString("received-experience");
        $ic162$ = SubLObjectFactory.makeKeyword("TOTAL-REMOTE-OPERATIONS-RUN");
        $ic163$ = SubLObjectFactory.makeKeyword("READ-MASTER-TRANSCRIPT-OP-NUMBER");
        $ic164$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#38563", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38571", "CYC"));
        $ic165$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOTAL-REMOTE-OPERATIONS-RUN"), (SubLObject)SubLObjectFactory.makeKeyword("READ-MASTER-TRANSCRIPT-OP-NUMBER"));
        $ic166$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic167$ = SubLObjectFactory.makeKeyword("DONE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0574.class
	Total time: 754 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/