package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0579 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0579";
    public static final String myFingerPrint = "b1ef5c6d95da638d65df82fbe78e1891df3865cc60ec9d1e22d0f48c22331710";
    public static SubLSymbol $g4236$;
    public static SubLSymbol $g4237$;
    public static SubLSymbol $g4238$;
    public static SubLSymbol $g4239$;
    public static SubLSymbol $g4240$;
    public static SubLSymbol $g4241$;
    public static SubLSymbol $g4242$;
    public static SubLSymbol $g4243$;
    public static SubLSymbol $g4244$;
    public static SubLSymbol $g4245$;
    public static SubLSymbol $g4246$;
    public static SubLSymbol $g4247$;
    public static SubLSymbol $g4248$;
    public static SubLSymbol $g4249$;
    public static SubLSymbol $g4250$;
    public static SubLSymbol $g4251$;
    public static SubLSymbol $g4252$;
    public static SubLSymbol $g4253$;
    public static SubLSymbol $g4254$;
    public static SubLSymbol $g4255$;
    public static SubLSymbol $g4256$;
    public static SubLSymbol $g4257$;
    public static SubLSymbol $g4258$;
    public static SubLSymbol $g4259$;
    public static SubLSymbol $g4260$;
    public static SubLSymbol $g4261$;
    public static SubLSymbol $g4262$;
    public static SubLSymbol $g4263$;
    public static SubLSymbol $g4264$;
    public static SubLSymbol $g4265$;
    public static SubLSymbol $g4266$;
    public static SubLSymbol $g4267$;
    public static SubLSymbol $g4268$;
    public static SubLSymbol $g4269$;
    public static SubLSymbol $g4270$;
    public static SubLSymbol $g4271$;
    public static SubLSymbol $g4272$;
    public static SubLSymbol $g4273$;
    public static SubLSymbol $g4274$;
    public static SubLSymbol $g4275$;
    public static SubLSymbol $g4276$;
    public static SubLSymbol $g4277$;
    public static SubLSymbol $g4278$;
    public static SubLSymbol $g4279$;
    public static SubLSymbol $g4280$;
    public static SubLSymbol $g4281$;
    public static SubLSymbol $g4282$;
    public static SubLSymbol $g4283$;
    public static SubLSymbol $g4284$;
    public static SubLSymbol $g4285$;
    public static SubLSymbol $g4286$;
    public static SubLSymbol $g4287$;
    public static SubLSymbol $g4288$;
    public static SubLSymbol $g4289$;
    public static SubLSymbol $g4290$;
    public static SubLSymbol $g4291$;
    public static SubLSymbol $g4292$;
    public static SubLSymbol $g4293$;
    public static SubLSymbol $g4294$;
    public static SubLSymbol $g4295$;
    public static SubLSymbol $g4296$;
    public static SubLSymbol $g4297$;
    public static SubLSymbol $g4298$;
    public static SubLSymbol $g4299$;
    public static SubLSymbol $g4300$;
    public static SubLSymbol $g4301$;
    public static SubLSymbol $g4302$;
    public static SubLSymbol $g4303$;
    public static SubLSymbol $g4304$;
    public static SubLSymbol $g4305$;
    public static SubLSymbol $g4306$;
    public static SubLSymbol $g4307$;
    public static SubLSymbol $g4308$;
    public static SubLSymbol $g4309$;
    private static SubLSymbol $g4310$;
    private static SubLSymbol $g4311$;
    public static SubLSymbol $g4312$;
    private static SubLSymbol $g4313$;
    public static SubLSymbol $g4314$;
    public static SubLSymbol $g4315$;
    public static SubLSymbol $g4316$;
    public static SubLSymbol $g4317$;
    public static SubLSymbol $g4318$;
    public static SubLSymbol $g4319$;
    public static SubLSymbol $g4320$;
    public static SubLSymbol $g4321$;
    public static SubLSymbol $g4322$;
    public static SubLSymbol $g4323$;
    public static SubLSymbol $g4324$;
    public static SubLSymbol $g4325$;
    public static SubLSymbol $g4326$;
    public static SubLSymbol $g4327$;
    public static SubLSymbol $g4328$;
    public static SubLSymbol $g4329$;
    public static SubLSymbol $g4330$;
    public static SubLSymbol $g4331$;
    public static SubLSymbol $g4332$;
    public static SubLSymbol $g4333$;
    public static SubLSymbol $g4334$;
    public static SubLSymbol $g4335$;
    public static SubLSymbol $g4336$;
    public static SubLSymbol $g4337$;
    public static SubLSymbol $g4338$;
    public static SubLSymbol $g4339$;
    public static SubLSymbol $g4340$;
    public static SubLSymbol $g4341$;
    public static SubLSymbol $g4342$;
    public static SubLSymbol $g4343$;
    public static SubLSymbol $g4344$;
    public static SubLSymbol $g4345$;
    public static SubLSymbol $g4346$;
    public static SubLSymbol $g4347$;
    public static SubLSymbol $g4348$;
    public static SubLSymbol $g4349$;
    public static SubLSymbol $g4350$;
    public static SubLSymbol $g4351$;
    public static SubLSymbol $g4352$;
    public static SubLSymbol $g4353$;
    public static SubLSymbol $g4354$;
    public static SubLSymbol $g4355$;
    public static SubLSymbol $g4356$;
    public static SubLSymbol $g4357$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLList $ic56$;
    
    public static SubLObject f35485() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean($ic4$ != $g4251$.getDynamicValue(var1) && ($ic5$ != $g4251$.getDynamicValue(var1) || NIL != f35486()));
    }
    
    public static SubLObject f35486() {
        return Numbers.numLE(f35487(), (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f35488() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return Equality.eq((SubLObject)$ic6$, $g4251$.getDynamicValue(var1));
    }
    
    public static SubLObject f35489() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean($ic4$ != $g4251$.getDynamicValue(var1) && $ic5$ != $g4251$.getDynamicValue(var1));
    }
    
    public static SubLObject f35490() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4260$.getDynamicValue(var1);
    }
    
    public static SubLObject f35491() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4262$.getDynamicValue(var1);
    }
    
    public static SubLObject f35492() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return Types.consp($g4264$.getDynamicValue(var1));
    }
    
    public static SubLObject f35493(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0035.f2292($g4264$.getDynamicValue(var4)) && NIL != module0756.f47694(var2) && NIL != conses_high.member(var3, module0035.f2293($g4264$.getDynamicValue(var4), var2, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)NIL), Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f35494(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0035.f2169(var4, $g4265$.getDynamicValue(var5)) || NIL != module0731.f44849(var4));
    }
    
    public static SubLObject f35495() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0048.f3333($g4287$.getDynamicValue(var1), module0048.f3326());
    }
    
    public static SubLObject f35496(final SubLObject var5, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = $g4287$.getDynamicValue();
        }
        final SubLObject var7 = module0048.f3334(var5, var6);
        if (NIL != var7 && NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
            Errors.warn((SubLObject)$ic12$, var5);
        }
        return var7;
    }
    
    public static SubLObject f35497() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean($g4305$.getDynamicValue(var1));
    }
    
    public static SubLObject f35498() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean($g4306$.getDynamicValue(var1));
    }
    
    public static SubLObject f35499(SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)T;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL != var8) {
            SubLObject var10 = $g4312$.getDynamicValue(var9);
            SubLObject var11 = (SubLObject)NIL;
            var11 = var10.first();
            while (NIL != var10) {
                if (NIL != f35500(var11)) {
                    $g4312$.setDynamicValue(module0035.f2146(var11, $g4312$.getDynamicValue(var9), Symbols.symbol_function((SubLObject)EQUAL)), var9);
                    return var11;
                }
                var10 = var10.rest();
                var11 = var10.first();
            }
        }
        return f35501();
    }
    
    public static SubLObject f35501() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic23$), $g4310$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = var2;
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            final SubLObject var6 = f35502(var5);
            var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var5, var6), var3);
            var4 = var4.rest();
            var5 = var4.first();
        }
        if (NIL == module0004.f104(var3, $g4312$.getDynamicValue(var1), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            $g4312$.setDynamicValue((SubLObject)ConsesLow.cons(var3, $g4312$.getDynamicValue(var1)), var1);
            if (NIL != module0035.f2002($g4312$.getDynamicValue(var1), $g4311$.getGlobalValue(), (SubLObject)UNPROVIDED)) {
                $g4312$.setDynamicValue(module0035.f2124($g4311$.getGlobalValue(), $g4312$.getDynamicValue(var1)), var1);
            }
        }
        return var3;
    }
    
    public static SubLObject f35500(final SubLObject var10) {
        SubLObject var11 = (SubLObject)NIL;
        if (NIL == var11) {
            SubLObject var12 = var10;
            SubLObject var13 = (SubLObject)NIL;
            var13 = var12.first();
            while (NIL == var11 && NIL != var12) {
                SubLObject var15;
                final SubLObject var14 = var15 = var13;
                SubLObject var16 = (SubLObject)NIL;
                SubLObject var17 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic24$);
                var16 = var15.first();
                var15 = var15.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic24$);
                var17 = var15.first();
                var15 = var15.rest();
                if (NIL == var15) {
                    final SubLObject var18 = f35502(var16);
                    if (!var17.equal(var18)) {
                        var11 = (SubLObject)T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)$ic24$);
                }
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var11);
    }
    
    public static SubLObject f35502(final SubLObject var13) {
        return Symbols.symbol_value(var13);
    }
    
    public static SubLObject f35503(final SubLObject var22) {
        return module0004.f104(var22, $g4313$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35504() {
        return $g4313$.getGlobalValue();
    }
    
    public static SubLObject f35505(final SubLObject var23, final SubLObject var24) {
        SubLObject var26;
        final SubLObject var25 = var26 = var23.rest();
        SubLObject var27 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic26$);
        var27 = var26.first();
        final SubLObject var28;
        var26 = (var28 = var26.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic27$, (SubLObject)ConsesLow.listS((SubLObject)$ic28$, var27, (SubLObject)$ic29$), (SubLObject)ConsesLow.listS((SubLObject)$ic30$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic31$, (SubLObject)ConsesLow.listS((SubLObject)$ic32$, var27, (SubLObject)$ic33$))), (SubLObject)ConsesLow.list((SubLObject)$ic34$, (SubLObject)ONE_INTEGER, (SubLObject)$ic35$, var27), ConsesLow.append(var28, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic34$, (SubLObject)ONE_INTEGER, (SubLObject)$ic36$, var27)))));
    }
    
    public static SubLObject f35506() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0004.f104((SubLObject)$ic37$, $g4314$.getDynamicValue(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35507() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0004.f104((SubLObject)$ic37$, $g4314$.getDynamicValue(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0004.f104((SubLObject)$ic38$, $g4314$.getDynamicValue(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f35508() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0035.f2114($g4320$.getDynamicValue(var1));
    }
    
    public static SubLObject f35509() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4320$.getDynamicValue(var1).first();
    }
    
    public static SubLObject f35510() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0107.f7629($g4323$.getDynamicValue(var1));
    }
    
    public static SubLObject f35511() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean($g4328$.getDynamicValue(var1));
    }
    
    public static SubLObject f35512() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean($g4332$.getDynamicValue(var1));
    }
    
    public static SubLObject f35487() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4334$.getDynamicValue(var1);
    }
    
    public static SubLObject f35513() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean($g4337$.getDynamicValue(var1) != $ic44$);
    }
    
    public static SubLObject f35514() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (NIL != module0018.f971()) {
            $g4260$.setDynamicValue(f35515((SubLObject)UNPROVIDED), var1);
            $g4262$.setDynamicValue($g4260$.getDynamicValue(var1), var1);
            module0751.f46588();
            return (SubLObject)$ic48$;
        }
        final SubLObject var2 = Sequences.cconcatenate((SubLObject)$ic49$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic50$, module0006.f203((SubLObject)$ic51$) });
        module0578.f35476(var2, (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY));
        return (SubLObject)$ic52$;
    }
    
    public static SubLObject f35515(SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        SubLObject var31 = (SubLObject)NIL;
        if (NIL == var31) {
            SubLObject var32 = (SubLObject)$ic53$;
            SubLObject var33 = (SubLObject)NIL;
            var33 = var32.first();
            while (NIL == var31 && NIL != var32) {
                final SubLObject var34 = constants_high_oc.f10737(var33);
                if (NIL != constant_handles_oc.f8463(var34, (SubLObject)UNPROVIDED)) {
                    var31 = var34;
                }
                var32 = var32.rest();
                var33 = var32.first();
            }
        }
        if (NIL != var30) {
            var31 = module0202.f12720($ic54$, (SubLObject)ConsesLow.cons(var31, var30), (SubLObject)UNPROVIDED);
        }
        return f35516(var31);
    }
    
    public static SubLObject f35516(SubLObject var31) {
        if (NIL != module0161.f10471()) {
            var31 = module0162.f10628((SubLObject)ConsesLow.listS($ic55$, var31, (SubLObject)$ic56$));
        }
        return var31;
    }
    
    public static SubLObject f35517() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35485", "S#38931", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35486", "S#38932", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35488", "S#38933", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35489", "S#38934", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35490", "S#15491", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35491", "S#15492", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35492", "S#38935", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35493", "S#38936", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35494", "S#38937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35495", "S#38938", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35496", "S#38939", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35497", "S#38940", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35498", "S#38941", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35499", "S#38942", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35501", "S#38943", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35500", "S#38944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35502", "S#38945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35503", "S#38946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35504", "S#38947", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0579", "f35505", "S#38948");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35506", "S#38949", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35507", "S#38950", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35508", "S#38927", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35509", "S#38951", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35510", "S#38952", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35511", "S#38953", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35512", "S#38954", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35487", "S#38902", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35513", "S#38955", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35514", "S#38956", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35515", "S#38957", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0579", "f35516", "S#38958", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35518() {
        $g4236$ = SubLFiles.defparameter("S#38959", (SubLObject)$ic0$);
        $g4237$ = SubLFiles.defparameter("S#38960", (SubLObject)NIL);
        $g4238$ = SubLFiles.defparameter("*PPH-USE-BULLETED-LISTS?*", (SubLObject)NIL);
        $g4239$ = SubLFiles.defparameter("S#38961", (SubLObject)ONE_INTEGER);
        $g4240$ = SubLFiles.defparameter("*PPH-REPLACE-BULLETED-LIST-TAGS?*", (SubLObject)NIL);
        $g4241$ = SubLFiles.defparameter("S#38962", (SubLObject)T);
        $g4242$ = SubLFiles.defparameter("S#38963", (SubLObject)T);
        $g4243$ = SubLFiles.defparameter("S#38964", (SubLObject)$ic1$);
        $g4244$ = SubLFiles.deflexical("S#38965", (SubLObject)ConsesLow.list(new SubLObject[] { module0015.$g224$.getGlobalValue(), module0015.$g225$.getGlobalValue(), module0015.$g264$.getGlobalValue(), module0015.$g265$.getGlobalValue(), module0015.$g275$.getGlobalValue(), module0015.$g276$.getGlobalValue(), $ic2$, $ic3$, module0015.$g382$.getGlobalValue(), module0015.$g236$.getGlobalValue(), module0015.$g237$.getGlobalValue(), module0015.$g238$.getGlobalValue(), module0015.$g239$.getGlobalValue() }));
        $g4245$ = SubLFiles.defparameter("*PPH-USE-INDEXICAL-DATES?*", (SubLObject)T);
        $g4246$ = SubLFiles.defparameter("S#38966", (SubLObject)NIL);
        $g4247$ = SubLFiles.defparameter("S#38967", (SubLObject)T);
        $g4248$ = SubLFiles.defparameter("*PPH-COERCE-DEFINITE-DESCRIPTIONS-FOR-UNLEXIFIED-TERMS?*", (SubLObject)NIL);
        $g4249$ = SubLFiles.defparameter("S#38968", (SubLObject)T);
        $g4250$ = SubLFiles.defparameter("S#38969", (SubLObject)NIL);
        $g4251$ = SubLFiles.defparameter("S#38970", (SubLObject)$ic4$);
        $g4252$ = SubLFiles.defparameter("S#38971", module0107.f7627());
        $g4253$ = SubLFiles.defparameter("S#38972", (SubLObject)NIL);
        $g4254$ = SubLFiles.defparameter("*PARAPHRASE-PRECISION*", (SubLObject)NIL);
        $g4255$ = SubLFiles.defparameter("*PPH-TERSE-MODE?*", (SubLObject)T);
        $g4256$ = SubLFiles.defparameter("*PPH-TERSE-MT-SCOPE?*", (SubLObject)NIL);
        $g4257$ = SubLFiles.defparameter("S#38973", (SubLObject)NIL);
        $g4258$ = SubLFiles.defparameter("S#38974", (SubLObject)T);
        $g4259$ = SubLFiles.defparameter("*PARAPHRASE-MODE*", (SubLObject)$ic8$);
        $g4260$ = SubLFiles.defvar("*PPH-LANGUAGE-MT*", (SubLObject)NIL);
        $g4261$ = SubLFiles.defparameter("S#38975", (SubLObject)T);
        $g4262$ = SubLFiles.defvar("*PPH-DOMAIN-MT*", (SubLObject)NIL);
        $g4263$ = SubLFiles.defparameter("S#38976", (SubLObject)NIL);
        $g4264$ = SubLFiles.defparameter("S#38977", (SubLObject)NIL);
        $g4265$ = SubLFiles.defparameter("S#38978", (SubLObject)NIL);
        $g4266$ = SubLFiles.defparameter("S#38979", (SubLObject)$ic9$);
        $g4267$ = SubLFiles.defparameter("S#38980", (SubLObject)NIL);
        $g4268$ = SubLFiles.defparameter("*DETERMINERS-BEFORE-VARIABLES*", (SubLObject)NIL);
        $g4269$ = SubLFiles.defparameter("S#38981", (SubLObject)NIL);
        $g4270$ = SubLFiles.defparameter("S#38982", (SubLObject)T);
        $g4271$ = SubLFiles.defparameter("S#38983", (SubLObject)T);
        $g4272$ = SubLFiles.defparameter("S#38984", (SubLObject)T);
        $g4273$ = SubLFiles.defparameter("S#38985", (SubLObject)NIL);
        $g4274$ = SubLFiles.defparameter("*PPH-USE-TITLE-CAPITALIZATION?*", (SubLObject)NIL);
        $g4275$ = SubLFiles.defparameter("*PPH-EXPAND-E-NOTATION-FOR-FLOATS?*", (SubLObject)T);
        $g4276$ = SubLFiles.defparameter("*PPH-QUANTIFY-VARS?*", (SubLObject)T);
        $g4277$ = SubLFiles.defparameter("S#38986", (SubLObject)T);
        $g4278$ = SubLFiles.defparameter("S#38987", (SubLObject)NIL);
        $g4279$ = SubLFiles.defparameter("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*", (SubLObject)T);
        $g4280$ = SubLFiles.defparameter("S#38988", (SubLObject)TWO_INTEGER);
        $g4281$ = SubLFiles.defparameter("S#38989", (SubLObject)T);
        $g4282$ = SubLFiles.defparameter("S#38990", (SubLObject)NIL);
        $g4283$ = SubLFiles.defparameter("*PPH-ADDRESSEE*", (SubLObject)$ic10$);
        $g4284$ = SubLFiles.defparameter("*PPH-SPEAKER*", (SubLObject)$ic10$);
        $g4285$ = SubLFiles.defparameter("S#38991", (SubLObject)NIL);
        $g4286$ = SubLFiles.defparameter("S#38992", (SubLObject)$ic11$);
        $g4287$ = SubLFiles.defparameter("S#9978", module0048.f3326());
        $g4288$ = SubLFiles.defconstant("S#9979", (SubLObject)TWO_INTEGER);
        $g4289$ = SubLFiles.defparameter("S#38993", (SubLObject)T);
        $g4290$ = SubLFiles.defparameter("S#38994", (SubLObject)FOUR_INTEGER);
        $g4291$ = SubLFiles.defparameter("S#38995", module0048.f3326());
        $g4292$ = SubLFiles.defparameter("S#38996", (SubLObject)NIL);
        $g4293$ = SubLFiles.defparameter("S#38997", (SubLObject)NIL);
        $g4294$ = SubLFiles.defparameter("S#38998", (SubLObject)NIL);
        $g4295$ = SubLFiles.defparameter("S#38999", (SubLObject)NIL);
        $g4296$ = SubLFiles.defparameter("S#39000", (SubLObject)NIL);
        $g4297$ = SubLFiles.defparameter("S#39001", module0107.f7627());
        $g4298$ = SubLFiles.defparameter("S#39002", (SubLObject)$ic13$);
        $g4299$ = SubLFiles.defparameter("S#39003", (SubLObject)NIL);
        $g4300$ = SubLFiles.defparameter("S#39004", (SubLObject)NIL);
        $g4301$ = SubLFiles.defparameter("S#39005", (SubLObject)$ic17$);
        $g4302$ = SubLFiles.defparameter("S#39006", (SubLObject)$ic19$);
        $g4303$ = SubLFiles.defparameter("S#39007", (SubLObject)T);
        $g4304$ = SubLFiles.defparameter("*PPH-LINK-ARG0?*", (SubLObject)NIL);
        $g4305$ = SubLFiles.defparameter("S#39008", (SubLObject)T);
        $g4306$ = SubLFiles.defparameter("*PPH-MAXIMIZE-LINKS?*", (SubLObject)NIL);
        $g4307$ = SubLFiles.defparameter("S#39009", (SubLObject)T);
        $g4308$ = SubLFiles.defparameter("S#39010", (SubLObject)NIL);
        $g4309$ = SubLFiles.defparameter("S#39011", (SubLObject)T);
        $g4310$ = SubLFiles.deflexical("S#39012", (SubLObject)$ic22$);
        $g4311$ = SubLFiles.defconstant("S#39013", (SubLObject)TEN_INTEGER);
        $g4312$ = SubLFiles.defparameter("S#39014", (SubLObject)NIL);
        $g4313$ = SubLFiles.defconstant("S#39015", (SubLObject)$ic25$);
        $g4314$ = SubLFiles.defparameter("S#39016", (SubLObject)NIL);
        $g4315$ = SubLFiles.defconstant("S#39017", (SubLObject)$ic39$);
        $g4316$ = SubLFiles.deflexical("S#39018", Locks.make_lock((SubLObject)$ic40$));
        $g4317$ = SubLFiles.defparameter("S#39019", (SubLObject)NIL);
        $g4318$ = SubLFiles.defparameter("S#39020", module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4319$ = SubLFiles.deflexical("S#39021", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic41$)) ? $g4319$.getGlobalValue() : NIL));
        $g4320$ = SubLFiles.defparameter("S#39022", (SubLObject)NIL);
        $g4321$ = SubLFiles.defparameter("S#39023", (SubLObject)NIL);
        $g4322$ = SubLFiles.defparameter("S#39024", (SubLObject)T);
        $g4323$ = SubLFiles.defparameter("S#39025", module0107.f7627());
        $g4324$ = SubLFiles.defparameter("S#39026", (SubLObject)NIL);
        $g4325$ = SubLFiles.defparameter("S#39027", (SubLObject)ZERO_INTEGER);
        $g4326$ = SubLFiles.defparameter("S#39028", (SubLObject)T);
        $g4327$ = SubLFiles.defparameter("S#39029", (SubLObject)NIL);
        $g4328$ = SubLFiles.defparameter("S#39030", (SubLObject)NIL);
        $g4329$ = SubLFiles.defparameter("*PPH-USE-WHOM?*", (SubLObject)T);
        $g4330$ = SubLFiles.defparameter("S#39031", (SubLObject)NIL);
        $g4331$ = SubLFiles.defparameter("S#39032", (SubLObject)NIL);
        $g4332$ = SubLFiles.defparameter("S#39033", (SubLObject)NIL);
        $g4333$ = SubLFiles.defparameter("S#39034", (SubLObject)$ic42$);
        $g4334$ = SubLFiles.defparameter("S#39035", (SubLObject)ZERO_INTEGER);
        $g4335$ = SubLFiles.defparameter("S#39036", (SubLObject)$ic43$);
        $g4336$ = SubLFiles.defparameter("S#39037", (SubLObject)$ic42$);
        $g4337$ = SubLFiles.defparameter("S#39038", (SubLObject)$ic44$);
        $g4338$ = SubLFiles.defparameter("S#39039", (SubLObject)$ic45$);
        $g4339$ = SubLFiles.defparameter("S#39040", (SubLObject)NIL);
        $g4340$ = SubLFiles.defparameter("S#39041", (SubLObject)NIL);
        $g4341$ = SubLFiles.defparameter("S#39042", (SubLObject)NIL);
        $g4342$ = SubLFiles.defparameter("S#39043", (SubLObject)NIL);
        $g4343$ = SubLFiles.defconstant("S#39044", (SubLObject)$ic46$);
        $g4344$ = SubLFiles.defparameter("S#39045", (SubLObject)$ic47$);
        $g4345$ = SubLFiles.defparameter("S#39046", (SubLObject)T);
        $g4346$ = SubLFiles.defparameter("S#39047", (SubLObject)T);
        $g4347$ = SubLFiles.defparameter("S#39048", (SubLObject)T);
        $g4348$ = SubLFiles.defparameter("S#39049", (SubLObject)ONE_INTEGER);
        $g4349$ = SubLFiles.defparameter("S#39050", (SubLObject)NIL);
        $g4350$ = SubLFiles.defparameter("S#39051", (SubLObject)NIL);
        $g4351$ = SubLFiles.defparameter("S#39052", (SubLObject)NIL);
        $g4352$ = SubLFiles.defparameter("S#39053", (SubLObject)NIL);
        $g4353$ = SubLFiles.defparameter("S#39054", (SubLObject)$ic47$);
        $g4354$ = SubLFiles.deflexical("S#39055", module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4355$ = SubLFiles.defparameter("S#39056", (SubLObject)ZERO_INTEGER);
        $g4356$ = SubLFiles.defconstant("S#39057", (SubLObject)ONE_INTEGER);
        $g4357$ = SubLFiles.defparameter("S#39058", (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35519() {
        module0002.f38((SubLObject)$ic7$);
        module0012.f441((SubLObject)$ic14$);
        module0012.f441((SubLObject)$ic15$);
        module0012.f441((SubLObject)$ic16$);
        module0012.f441((SubLObject)$ic18$);
        module0012.f441((SubLObject)$ic20$);
        module0012.f441((SubLObject)$ic21$);
        module0003.f57((SubLObject)$ic41$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f35517();
    }
    
    public void initializeVariables() {
        f35518();
    }
    
    public void runTopLevelForms() {
        f35519();
    }
    
    static {
        me = (SubLFile)new module0579();
        $g4236$ = null;
        $g4237$ = null;
        $g4238$ = null;
        $g4239$ = null;
        $g4240$ = null;
        $g4241$ = null;
        $g4242$ = null;
        $g4243$ = null;
        $g4244$ = null;
        $g4245$ = null;
        $g4246$ = null;
        $g4247$ = null;
        $g4248$ = null;
        $g4249$ = null;
        $g4250$ = null;
        $g4251$ = null;
        $g4252$ = null;
        $g4253$ = null;
        $g4254$ = null;
        $g4255$ = null;
        $g4256$ = null;
        $g4257$ = null;
        $g4258$ = null;
        $g4259$ = null;
        $g4260$ = null;
        $g4261$ = null;
        $g4262$ = null;
        $g4263$ = null;
        $g4264$ = null;
        $g4265$ = null;
        $g4266$ = null;
        $g4267$ = null;
        $g4268$ = null;
        $g4269$ = null;
        $g4270$ = null;
        $g4271$ = null;
        $g4272$ = null;
        $g4273$ = null;
        $g4274$ = null;
        $g4275$ = null;
        $g4276$ = null;
        $g4277$ = null;
        $g4278$ = null;
        $g4279$ = null;
        $g4280$ = null;
        $g4281$ = null;
        $g4282$ = null;
        $g4283$ = null;
        $g4284$ = null;
        $g4285$ = null;
        $g4286$ = null;
        $g4287$ = null;
        $g4288$ = null;
        $g4289$ = null;
        $g4290$ = null;
        $g4291$ = null;
        $g4292$ = null;
        $g4293$ = null;
        $g4294$ = null;
        $g4295$ = null;
        $g4296$ = null;
        $g4297$ = null;
        $g4298$ = null;
        $g4299$ = null;
        $g4300$ = null;
        $g4301$ = null;
        $g4302$ = null;
        $g4303$ = null;
        $g4304$ = null;
        $g4305$ = null;
        $g4306$ = null;
        $g4307$ = null;
        $g4308$ = null;
        $g4309$ = null;
        $g4310$ = null;
        $g4311$ = null;
        $g4312$ = null;
        $g4313$ = null;
        $g4314$ = null;
        $g4315$ = null;
        $g4316$ = null;
        $g4317$ = null;
        $g4318$ = null;
        $g4319$ = null;
        $g4320$ = null;
        $g4321$ = null;
        $g4322$ = null;
        $g4323$ = null;
        $g4324$ = null;
        $g4325$ = null;
        $g4326$ = null;
        $g4327$ = null;
        $g4328$ = null;
        $g4329$ = null;
        $g4330$ = null;
        $g4331$ = null;
        $g4332$ = null;
        $g4333$ = null;
        $g4334$ = null;
        $g4335$ = null;
        $g4336$ = null;
        $g4337$ = null;
        $g4338$ = null;
        $g4339$ = null;
        $g4340$ = null;
        $g4341$ = null;
        $g4342$ = null;
        $g4343$ = null;
        $g4344$ = null;
        $g4345$ = null;
        $g4346$ = null;
        $g4347$ = null;
        $g4348$ = null;
        $g4349$ = null;
        $g4350$ = null;
        $g4351$ = null;
        $g4352$ = null;
        $g4353$ = null;
        $g4354$ = null;
        $g4355$ = null;
        $g4356$ = null;
        $g4357$ = null;
        $ic0$ = makeKeyword("WHEN-NECESSARY");
        $ic1$ = makeKeyword("SUPERSCRIPTS");
        $ic2$ = makeString("<a>");
        $ic3$ = makeString("<a ");
        $ic4$ = makeKeyword("NONE");
        $ic5$ = makeKeyword("TOP-LEVEL-ONLY");
        $ic6$ = makeKeyword("ALL");
        $ic7$ = makeSymbol("*PPH-TERSE-MODE?*");
        $ic8$ = makeKeyword("HTML");
        $ic9$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Agent-Generic")), constant_handles_oc.f8479((SubLObject)makeString("Thing")), constant_handles_oc.f8479((SubLObject)makeString("Place")), constant_handles_oc.f8479((SubLObject)makeString("TimeInterval")), constant_handles_oc.f8479((SubLObject)makeString("Time-Quantity")), constant_handles_oc.f8479((SubLObject)makeString("Event")), constant_handles_oc.f8479((SubLObject)makeString("ScalarInterval")));
        $ic10$ = makeKeyword("UNKNOWN");
        $ic11$ = makeKeyword("ARBITRARY");
        $ic12$ = makeString("Too many demerits: ~S");
        $ic13$ = makeSymbol("CB-CF");
        $ic14$ = makeSymbol("S#39002", "CYC");
        $ic15$ = makeSymbol("S#39003", "CYC");
        $ic16$ = makeSymbol("S#39004", "CYC");
        $ic17$ = makeString("_self");
        $ic18$ = makeSymbol("S#39005", "CYC");
        $ic19$ = makeSymbol("S#39059", "CYC");
        $ic20$ = makeSymbol("S#39006", "CYC");
        $ic21$ = makeSymbol("S#39007", "CYC");
        $ic22$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#38959", "CYC"), makeSymbol("*PPH-USE-BULLETED-LISTS?*"), makeSymbol("*PPH-USE-INDEXICAL-DATES?*"), makeSymbol("S#38966", "CYC"), makeSymbol("S#38967", "CYC"), makeSymbol("S#38968", "CYC"), makeSymbol("S#38969", "CYC"), makeSymbol("S#38981", "CYC"), makeSymbol("S#38984", "CYC"), makeSymbol("*THE-CYCLIST*"), makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*"), makeSymbol("*PARAPHRASE-PRECISION*"), makeSymbol("*PPH-TERSE-MODE?*"), makeSymbol("S#38982", "CYC"), makeSymbol("*PARAPHRASE-MODE*"), makeSymbol("*PPH-LANGUAGE-MT*"), makeSymbol("*PPH-DOMAIN-MT*"), makeSymbol("S#38976", "CYC"), makeSymbol("*DETERMINERS-BEFORE-VARIABLES*"), makeSymbol("*PPH-QUANTIFY-VARS?*"), makeSymbol("S#38986", "CYC"), makeSymbol("*PPH-EXPAND-E-NOTATION-FOR-FLOATS?*"), makeSymbol("S#39037", "CYC"), makeSymbol("S#39036", "CYC"), makeSymbol("S#38987", "CYC"), makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), makeSymbol("S#38988", "CYC"), makeSymbol("S#38989", "CYC"), makeSymbol("*PPH-ADDRESSEE*"), makeSymbol("*PPH-SPEAKER*"), makeSymbol("S#38991", "CYC"), makeSymbol("S#9978", "CYC"), makeSymbol("S#38993", "CYC"), makeSymbol("S#38994", "CYC"), makeSymbol("S#38995", "CYC"), makeSymbol("S#38996", "CYC"), makeSymbol("S#39002", "CYC"), makeSymbol("S#39005", "CYC"), makeSymbol("S#39006", "CYC"), makeSymbol("*PPH-LINK-ARG0?*"), makeSymbol("*PPH-MAXIMIZE-LINKS?*"), makeSymbol("S#39011", "CYC"), makeSymbol("S#39000", "CYC") });
        $ic23$ = makeSymbol("BOUNDP");
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("S#5251", "CYC"), (SubLObject)makeSymbol("S#39060", "CYC"));
        $ic25$ = ConsesLow.list((SubLObject)makeKeyword("UNIVERSAL"), (SubLObject)makeKeyword("EXISTENTIAL"), (SubLObject)makeKeyword("NO"), (SubLObject)makeKeyword("SCOPED"), (SubLObject)makeKeyword("QUERY"));
        $ic26$ = ConsesLow.list((SubLObject)makeSymbol("S#39061", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic27$ = makeSymbol("PROGN");
        $ic28$ = makeSymbol("S#38916", "CYC");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("S#38946", "CYC"));
        $ic30$ = makeSymbol("CLET");
        $ic31$ = makeSymbol("S#39016", "CYC");
        $ic32$ = makeSymbol("CONS");
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#39016", "CYC"));
        $ic34$ = makeSymbol("S#38908", "CYC");
        $ic35$ = makeString("Inside operator scope ~S");
        $ic36$ = makeString("Leaving operator scope ~S");
        $ic37$ = makeKeyword("NO");
        $ic38$ = makeKeyword("IMPLIES");
        $ic39$ = makeString("______");
        $ic40$ = makeString("Gen-Template Store Lock");
        $ic41$ = makeSymbol("S#39021", "CYC");
        $ic42$ = makeKeyword("UNSPECIFIED");
        $ic43$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic44$ = makeKeyword("OFF");
        $ic45$ = makeKeyword("NOT-GATHERING");
        $ic46$ = makeKeyword("PPH-BAD-TEMPLATE-DUMMY");
        $ic47$ = makeKeyword("UNINITIALIZED");
        $ic48$ = makeKeyword("INITIALIZED");
        $ic49$ = makeString("(PPH error level ");
        $ic50$ = makeString(") ");
        $ic51$ = makeString("No KB loaded. Couldn't initialize paraphrase vars.");
        $ic52$ = makeKeyword("NO-KB-LOADED");
        $ic53$ = ConsesLow.list((SubLObject)makeString("CyclishParaphraseMt"), (SubLObject)makeString("EnglishParaphraseMt"), (SubLObject)makeString("BaseKB"));
        $ic54$ = constant_handles_oc.f8479((SubLObject)makeString("MtUnionFn"));
        $ic55$ = constant_handles_oc.f8479((SubLObject)makeString("MtSpace"));
        $ic56$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MtTimeDimFn")), constant_handles_oc.f8479((SubLObject)makeString("Now"))));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 223 ms
	
	Decompiled with Procyon 0.5.32.
*/