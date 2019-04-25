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
        return (SubLObject)SubLObjectFactory.makeBoolean(module0579.$ic4$ != module0579.$g4251$.getDynamicValue(var1) && (module0579.$ic5$ != module0579.$g4251$.getDynamicValue(var1) || module0579.NIL != f35486()));
    }
    
    public static SubLObject f35486() {
        return Numbers.numLE(f35487(), (SubLObject)module0579.ONE_INTEGER);
    }
    
    public static SubLObject f35488() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return Equality.eq((SubLObject)module0579.$ic6$, module0579.$g4251$.getDynamicValue(var1));
    }
    
    public static SubLObject f35489() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0579.$ic4$ != module0579.$g4251$.getDynamicValue(var1) && module0579.$ic5$ != module0579.$g4251$.getDynamicValue(var1));
    }
    
    public static SubLObject f35490() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0579.$g4260$.getDynamicValue(var1);
    }
    
    public static SubLObject f35491() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0579.$g4262$.getDynamicValue(var1);
    }
    
    public static SubLObject f35492() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return Types.consp(module0579.$g4264$.getDynamicValue(var1));
    }
    
    public static SubLObject f35493(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0579.NIL != module0035.f2292(module0579.$g4264$.getDynamicValue(var4)) && module0579.NIL != module0756.f47694(var2) && module0579.NIL != conses_high.member(var3, module0035.f2293(module0579.$g4264$.getDynamicValue(var4), var2, Symbols.symbol_function((SubLObject)module0579.EQUAL), (SubLObject)module0579.NIL), Symbols.symbol_function((SubLObject)module0579.EQUALP), (SubLObject)module0579.UNPROVIDED));
    }
    
    public static SubLObject f35494(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0579.NIL != module0035.f2169(var4, module0579.$g4265$.getDynamicValue(var5)) || module0579.NIL != module0731.f44849(var4));
    }
    
    public static SubLObject f35495() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0048.f3333(module0579.$g4287$.getDynamicValue(var1), module0048.f3326());
    }
    
    public static SubLObject f35496(final SubLObject var5, SubLObject var6) {
        if (var6 == module0579.UNPROVIDED) {
            var6 = module0579.$g4287$.getDynamicValue();
        }
        final SubLObject var7 = module0048.f3334(var5, var6);
        if (module0579.NIL != var7 && module0579.NIL != module0578.f35470((SubLObject)module0579.ONE_INTEGER) && module0579.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0579.$ic12$, var5);
        }
        return var7;
    }
    
    public static SubLObject f35497() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0579.$g4305$.getDynamicValue(var1));
    }
    
    public static SubLObject f35498() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0579.$g4306$.getDynamicValue(var1));
    }
    
    public static SubLObject f35499(SubLObject var8) {
        if (var8 == module0579.UNPROVIDED) {
            var8 = (SubLObject)module0579.T;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0579.NIL != var8) {
            SubLObject var10 = module0579.$g4312$.getDynamicValue(var9);
            SubLObject var11 = (SubLObject)module0579.NIL;
            var11 = var10.first();
            while (module0579.NIL != var10) {
                if (module0579.NIL != f35500(var11)) {
                    module0579.$g4312$.setDynamicValue(module0035.f2146(var11, module0579.$g4312$.getDynamicValue(var9), Symbols.symbol_function((SubLObject)module0579.EQUAL)), var9);
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
        final SubLObject var2 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)module0579.$ic23$), module0579.$g4310$.getGlobalValue(), (SubLObject)module0579.UNPROVIDED, (SubLObject)module0579.UNPROVIDED, (SubLObject)module0579.UNPROVIDED, (SubLObject)module0579.UNPROVIDED);
        SubLObject var3 = (SubLObject)module0579.NIL;
        SubLObject var4 = var2;
        SubLObject var5 = (SubLObject)module0579.NIL;
        var5 = var4.first();
        while (module0579.NIL != var4) {
            final SubLObject var6 = f35502(var5);
            var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var5, var6), var3);
            var4 = var4.rest();
            var5 = var4.first();
        }
        if (module0579.NIL == module0004.f104(var3, module0579.$g4312$.getDynamicValue(var1), Symbols.symbol_function((SubLObject)module0579.EQUAL), (SubLObject)module0579.UNPROVIDED)) {
            module0579.$g4312$.setDynamicValue((SubLObject)ConsesLow.cons(var3, module0579.$g4312$.getDynamicValue(var1)), var1);
            if (module0579.NIL != module0035.f2002(module0579.$g4312$.getDynamicValue(var1), module0579.$g4311$.getGlobalValue(), (SubLObject)module0579.UNPROVIDED)) {
                module0579.$g4312$.setDynamicValue(module0035.f2124(module0579.$g4311$.getGlobalValue(), module0579.$g4312$.getDynamicValue(var1)), var1);
            }
        }
        return var3;
    }
    
    public static SubLObject f35500(final SubLObject var10) {
        SubLObject var11 = (SubLObject)module0579.NIL;
        if (module0579.NIL == var11) {
            SubLObject var12 = var10;
            SubLObject var13 = (SubLObject)module0579.NIL;
            var13 = var12.first();
            while (module0579.NIL == var11 && module0579.NIL != var12) {
                SubLObject var15;
                final SubLObject var14 = var15 = var13;
                SubLObject var16 = (SubLObject)module0579.NIL;
                SubLObject var17 = (SubLObject)module0579.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0579.$ic24$);
                var16 = var15.first();
                var15 = var15.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0579.$ic24$);
                var17 = var15.first();
                var15 = var15.rest();
                if (module0579.NIL == var15) {
                    final SubLObject var18 = f35502(var16);
                    if (!var17.equal(var18)) {
                        var11 = (SubLObject)module0579.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)module0579.$ic24$);
                }
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0579.NIL == var11);
    }
    
    public static SubLObject f35502(final SubLObject var13) {
        return Symbols.symbol_value(var13);
    }
    
    public static SubLObject f35503(final SubLObject var22) {
        return module0004.f104(var22, module0579.$g4313$.getGlobalValue(), (SubLObject)module0579.UNPROVIDED, (SubLObject)module0579.UNPROVIDED);
    }
    
    public static SubLObject f35504() {
        return module0579.$g4313$.getGlobalValue();
    }
    
    public static SubLObject f35505(final SubLObject var23, final SubLObject var24) {
        SubLObject var26;
        final SubLObject var25 = var26 = var23.rest();
        SubLObject var27 = (SubLObject)module0579.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)module0579.$ic26$);
        var27 = var26.first();
        final SubLObject var28;
        var26 = (var28 = var26.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0579.$ic27$, (SubLObject)ConsesLow.listS((SubLObject)module0579.$ic28$, var27, (SubLObject)module0579.$ic29$), (SubLObject)ConsesLow.listS((SubLObject)module0579.$ic30$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0579.$ic31$, (SubLObject)ConsesLow.listS((SubLObject)module0579.$ic32$, var27, (SubLObject)module0579.$ic33$))), (SubLObject)ConsesLow.list((SubLObject)module0579.$ic34$, (SubLObject)module0579.ONE_INTEGER, (SubLObject)module0579.$ic35$, var27), ConsesLow.append(var28, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0579.$ic34$, (SubLObject)module0579.ONE_INTEGER, (SubLObject)module0579.$ic36$, var27)))));
    }
    
    public static SubLObject f35506() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0004.f104((SubLObject)module0579.$ic37$, module0579.$g4314$.getDynamicValue(var1), (SubLObject)module0579.UNPROVIDED, (SubLObject)module0579.UNPROVIDED);
    }
    
    public static SubLObject f35507() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0579.NIL != module0004.f104((SubLObject)module0579.$ic37$, module0579.$g4314$.getDynamicValue(var1), (SubLObject)module0579.UNPROVIDED, (SubLObject)module0579.UNPROVIDED) || module0579.NIL != module0004.f104((SubLObject)module0579.$ic38$, module0579.$g4314$.getDynamicValue(var1), (SubLObject)module0579.UNPROVIDED, (SubLObject)module0579.UNPROVIDED));
    }
    
    public static SubLObject f35508() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0035.f2114(module0579.$g4320$.getDynamicValue(var1));
    }
    
    public static SubLObject f35509() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0579.$g4320$.getDynamicValue(var1).first();
    }
    
    public static SubLObject f35510() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0107.f7629(module0579.$g4323$.getDynamicValue(var1));
    }
    
    public static SubLObject f35511() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0579.$g4328$.getDynamicValue(var1));
    }
    
    public static SubLObject f35512() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0579.$g4332$.getDynamicValue(var1));
    }
    
    public static SubLObject f35487() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0579.$g4334$.getDynamicValue(var1);
    }
    
    public static SubLObject f35513() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0579.$g4337$.getDynamicValue(var1) != module0579.$ic44$);
    }
    
    public static SubLObject f35514() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (module0579.NIL != module0018.f971()) {
            module0579.$g4260$.setDynamicValue(f35515((SubLObject)module0579.UNPROVIDED), var1);
            module0579.$g4262$.setDynamicValue(module0579.$g4260$.getDynamicValue(var1), var1);
            module0751.f46588();
            return (SubLObject)module0579.$ic48$;
        }
        final SubLObject var2 = Sequences.cconcatenate((SubLObject)module0579.$ic49$, new SubLObject[] { module0006.f205((SubLObject)module0579.ONE_INTEGER), module0579.$ic50$, module0006.f203((SubLObject)module0579.$ic51$) });
        module0578.f35476(var2, (SubLObject)ConsesLow.list(module0579.EMPTY_SUBL_OBJECT_ARRAY));
        return (SubLObject)module0579.$ic52$;
    }
    
    public static SubLObject f35515(SubLObject var30) {
        if (var30 == module0579.UNPROVIDED) {
            var30 = (SubLObject)module0579.NIL;
        }
        SubLObject var31 = (SubLObject)module0579.NIL;
        if (module0579.NIL == var31) {
            SubLObject var32 = (SubLObject)module0579.$ic53$;
            SubLObject var33 = (SubLObject)module0579.NIL;
            var33 = var32.first();
            while (module0579.NIL == var31 && module0579.NIL != var32) {
                final SubLObject var34 = constants_high_oc.f10737(var33);
                if (module0579.NIL != constant_handles_oc.f8463(var34, (SubLObject)module0579.UNPROVIDED)) {
                    var31 = var34;
                }
                var32 = var32.rest();
                var33 = var32.first();
            }
        }
        if (module0579.NIL != var30) {
            var31 = module0202.f12720(module0579.$ic54$, (SubLObject)ConsesLow.cons(var31, var30), (SubLObject)module0579.UNPROVIDED);
        }
        return f35516(var31);
    }
    
    public static SubLObject f35516(SubLObject var31) {
        if (module0579.NIL != module0161.f10471()) {
            var31 = module0162.f10628((SubLObject)ConsesLow.listS(module0579.$ic55$, var31, (SubLObject)module0579.$ic56$));
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
        return (SubLObject)module0579.NIL;
    }
    
    public static SubLObject f35518() {
        module0579.$g4236$ = SubLFiles.defparameter("S#38959", (SubLObject)module0579.$ic0$);
        module0579.$g4237$ = SubLFiles.defparameter("S#38960", (SubLObject)module0579.NIL);
        module0579.$g4238$ = SubLFiles.defparameter("*PPH-USE-BULLETED-LISTS?*", (SubLObject)module0579.NIL);
        module0579.$g4239$ = SubLFiles.defparameter("S#38961", (SubLObject)module0579.ONE_INTEGER);
        module0579.$g4240$ = SubLFiles.defparameter("*PPH-REPLACE-BULLETED-LIST-TAGS?*", (SubLObject)module0579.NIL);
        module0579.$g4241$ = SubLFiles.defparameter("S#38962", (SubLObject)module0579.T);
        module0579.$g4242$ = SubLFiles.defparameter("S#38963", (SubLObject)module0579.T);
        module0579.$g4243$ = SubLFiles.defparameter("S#38964", (SubLObject)module0579.$ic1$);
        module0579.$g4244$ = SubLFiles.deflexical("S#38965", (SubLObject)ConsesLow.list(new SubLObject[] { module0015.$g224$.getGlobalValue(), module0015.$g225$.getGlobalValue(), module0015.$g264$.getGlobalValue(), module0015.$g265$.getGlobalValue(), module0015.$g275$.getGlobalValue(), module0015.$g276$.getGlobalValue(), module0579.$ic2$, module0579.$ic3$, module0015.$g382$.getGlobalValue(), module0015.$g236$.getGlobalValue(), module0015.$g237$.getGlobalValue(), module0015.$g238$.getGlobalValue(), module0015.$g239$.getGlobalValue() }));
        module0579.$g4245$ = SubLFiles.defparameter("*PPH-USE-INDEXICAL-DATES?*", (SubLObject)module0579.T);
        module0579.$g4246$ = SubLFiles.defparameter("S#38966", (SubLObject)module0579.NIL);
        module0579.$g4247$ = SubLFiles.defparameter("S#38967", (SubLObject)module0579.T);
        module0579.$g4248$ = SubLFiles.defparameter("*PPH-COERCE-DEFINITE-DESCRIPTIONS-FOR-UNLEXIFIED-TERMS?*", (SubLObject)module0579.NIL);
        module0579.$g4249$ = SubLFiles.defparameter("S#38968", (SubLObject)module0579.T);
        module0579.$g4250$ = SubLFiles.defparameter("S#38969", (SubLObject)module0579.NIL);
        module0579.$g4251$ = SubLFiles.defparameter("S#38970", (SubLObject)module0579.$ic4$);
        module0579.$g4252$ = SubLFiles.defparameter("S#38971", module0107.f7627());
        module0579.$g4253$ = SubLFiles.defparameter("S#38972", (SubLObject)module0579.NIL);
        module0579.$g4254$ = SubLFiles.defparameter("*PARAPHRASE-PRECISION*", (SubLObject)module0579.NIL);
        module0579.$g4255$ = SubLFiles.defparameter("*PPH-TERSE-MODE?*", (SubLObject)module0579.T);
        module0579.$g4256$ = SubLFiles.defparameter("*PPH-TERSE-MT-SCOPE?*", (SubLObject)module0579.NIL);
        module0579.$g4257$ = SubLFiles.defparameter("S#38973", (SubLObject)module0579.NIL);
        module0579.$g4258$ = SubLFiles.defparameter("S#38974", (SubLObject)module0579.T);
        module0579.$g4259$ = SubLFiles.defparameter("*PARAPHRASE-MODE*", (SubLObject)module0579.$ic8$);
        module0579.$g4260$ = SubLFiles.defvar("*PPH-LANGUAGE-MT*", (SubLObject)module0579.NIL);
        module0579.$g4261$ = SubLFiles.defparameter("S#38975", (SubLObject)module0579.T);
        module0579.$g4262$ = SubLFiles.defvar("*PPH-DOMAIN-MT*", (SubLObject)module0579.NIL);
        module0579.$g4263$ = SubLFiles.defparameter("S#38976", (SubLObject)module0579.NIL);
        module0579.$g4264$ = SubLFiles.defparameter("S#38977", (SubLObject)module0579.NIL);
        module0579.$g4265$ = SubLFiles.defparameter("S#38978", (SubLObject)module0579.NIL);
        module0579.$g4266$ = SubLFiles.defparameter("S#38979", (SubLObject)module0579.$ic9$);
        module0579.$g4267$ = SubLFiles.defparameter("S#38980", (SubLObject)module0579.NIL);
        module0579.$g4268$ = SubLFiles.defparameter("*DETERMINERS-BEFORE-VARIABLES*", (SubLObject)module0579.NIL);
        module0579.$g4269$ = SubLFiles.defparameter("S#38981", (SubLObject)module0579.NIL);
        module0579.$g4270$ = SubLFiles.defparameter("S#38982", (SubLObject)module0579.T);
        module0579.$g4271$ = SubLFiles.defparameter("S#38983", (SubLObject)module0579.T);
        module0579.$g4272$ = SubLFiles.defparameter("S#38984", (SubLObject)module0579.T);
        module0579.$g4273$ = SubLFiles.defparameter("S#38985", (SubLObject)module0579.NIL);
        module0579.$g4274$ = SubLFiles.defparameter("*PPH-USE-TITLE-CAPITALIZATION?*", (SubLObject)module0579.NIL);
        module0579.$g4275$ = SubLFiles.defparameter("*PPH-EXPAND-E-NOTATION-FOR-FLOATS?*", (SubLObject)module0579.T);
        module0579.$g4276$ = SubLFiles.defparameter("*PPH-QUANTIFY-VARS?*", (SubLObject)module0579.T);
        module0579.$g4277$ = SubLFiles.defparameter("S#38986", (SubLObject)module0579.T);
        module0579.$g4278$ = SubLFiles.defparameter("S#38987", (SubLObject)module0579.NIL);
        module0579.$g4279$ = SubLFiles.defparameter("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*", (SubLObject)module0579.T);
        module0579.$g4280$ = SubLFiles.defparameter("S#38988", (SubLObject)module0579.TWO_INTEGER);
        module0579.$g4281$ = SubLFiles.defparameter("S#38989", (SubLObject)module0579.T);
        module0579.$g4282$ = SubLFiles.defparameter("S#38990", (SubLObject)module0579.NIL);
        module0579.$g4283$ = SubLFiles.defparameter("*PPH-ADDRESSEE*", (SubLObject)module0579.$ic10$);
        module0579.$g4284$ = SubLFiles.defparameter("*PPH-SPEAKER*", (SubLObject)module0579.$ic10$);
        module0579.$g4285$ = SubLFiles.defparameter("S#38991", (SubLObject)module0579.NIL);
        module0579.$g4286$ = SubLFiles.defparameter("S#38992", (SubLObject)module0579.$ic11$);
        module0579.$g4287$ = SubLFiles.defparameter("S#9978", module0048.f3326());
        module0579.$g4288$ = SubLFiles.defconstant("S#9979", (SubLObject)module0579.TWO_INTEGER);
        module0579.$g4289$ = SubLFiles.defparameter("S#38993", (SubLObject)module0579.T);
        module0579.$g4290$ = SubLFiles.defparameter("S#38994", (SubLObject)module0579.FOUR_INTEGER);
        module0579.$g4291$ = SubLFiles.defparameter("S#38995", module0048.f3326());
        module0579.$g4292$ = SubLFiles.defparameter("S#38996", (SubLObject)module0579.NIL);
        module0579.$g4293$ = SubLFiles.defparameter("S#38997", (SubLObject)module0579.NIL);
        module0579.$g4294$ = SubLFiles.defparameter("S#38998", (SubLObject)module0579.NIL);
        module0579.$g4295$ = SubLFiles.defparameter("S#38999", (SubLObject)module0579.NIL);
        module0579.$g4296$ = SubLFiles.defparameter("S#39000", (SubLObject)module0579.NIL);
        module0579.$g4297$ = SubLFiles.defparameter("S#39001", module0107.f7627());
        module0579.$g4298$ = SubLFiles.defparameter("S#39002", (SubLObject)module0579.$ic13$);
        module0579.$g4299$ = SubLFiles.defparameter("S#39003", (SubLObject)module0579.NIL);
        module0579.$g4300$ = SubLFiles.defparameter("S#39004", (SubLObject)module0579.NIL);
        module0579.$g4301$ = SubLFiles.defparameter("S#39005", (SubLObject)module0579.$ic17$);
        module0579.$g4302$ = SubLFiles.defparameter("S#39006", (SubLObject)module0579.$ic19$);
        module0579.$g4303$ = SubLFiles.defparameter("S#39007", (SubLObject)module0579.T);
        module0579.$g4304$ = SubLFiles.defparameter("*PPH-LINK-ARG0?*", (SubLObject)module0579.NIL);
        module0579.$g4305$ = SubLFiles.defparameter("S#39008", (SubLObject)module0579.T);
        module0579.$g4306$ = SubLFiles.defparameter("*PPH-MAXIMIZE-LINKS?*", (SubLObject)module0579.NIL);
        module0579.$g4307$ = SubLFiles.defparameter("S#39009", (SubLObject)module0579.T);
        module0579.$g4308$ = SubLFiles.defparameter("S#39010", (SubLObject)module0579.NIL);
        module0579.$g4309$ = SubLFiles.defparameter("S#39011", (SubLObject)module0579.T);
        module0579.$g4310$ = SubLFiles.deflexical("S#39012", (SubLObject)module0579.$ic22$);
        module0579.$g4311$ = SubLFiles.defconstant("S#39013", (SubLObject)module0579.TEN_INTEGER);
        module0579.$g4312$ = SubLFiles.defparameter("S#39014", (SubLObject)module0579.NIL);
        module0579.$g4313$ = SubLFiles.defconstant("S#39015", (SubLObject)module0579.$ic25$);
        module0579.$g4314$ = SubLFiles.defparameter("S#39016", (SubLObject)module0579.NIL);
        module0579.$g4315$ = SubLFiles.defconstant("S#39017", (SubLObject)module0579.$ic39$);
        module0579.$g4316$ = SubLFiles.deflexical("S#39018", Locks.make_lock((SubLObject)module0579.$ic40$));
        module0579.$g4317$ = SubLFiles.defparameter("S#39019", (SubLObject)module0579.NIL);
        module0579.$g4318$ = SubLFiles.defparameter("S#39020", module0067.f4880((SubLObject)module0579.UNPROVIDED, (SubLObject)module0579.UNPROVIDED));
        module0579.$g4319$ = SubLFiles.deflexical("S#39021", (SubLObject)((module0579.NIL != Symbols.boundp((SubLObject)module0579.$ic41$)) ? module0579.$g4319$.getGlobalValue() : module0579.NIL));
        module0579.$g4320$ = SubLFiles.defparameter("S#39022", (SubLObject)module0579.NIL);
        module0579.$g4321$ = SubLFiles.defparameter("S#39023", (SubLObject)module0579.NIL);
        module0579.$g4322$ = SubLFiles.defparameter("S#39024", (SubLObject)module0579.T);
        module0579.$g4323$ = SubLFiles.defparameter("S#39025", module0107.f7627());
        module0579.$g4324$ = SubLFiles.defparameter("S#39026", (SubLObject)module0579.NIL);
        module0579.$g4325$ = SubLFiles.defparameter("S#39027", (SubLObject)module0579.ZERO_INTEGER);
        module0579.$g4326$ = SubLFiles.defparameter("S#39028", (SubLObject)module0579.T);
        module0579.$g4327$ = SubLFiles.defparameter("S#39029", (SubLObject)module0579.NIL);
        module0579.$g4328$ = SubLFiles.defparameter("S#39030", (SubLObject)module0579.NIL);
        module0579.$g4329$ = SubLFiles.defparameter("*PPH-USE-WHOM?*", (SubLObject)module0579.T);
        module0579.$g4330$ = SubLFiles.defparameter("S#39031", (SubLObject)module0579.NIL);
        module0579.$g4331$ = SubLFiles.defparameter("S#39032", (SubLObject)module0579.NIL);
        module0579.$g4332$ = SubLFiles.defparameter("S#39033", (SubLObject)module0579.NIL);
        module0579.$g4333$ = SubLFiles.defparameter("S#39034", (SubLObject)module0579.$ic42$);
        module0579.$g4334$ = SubLFiles.defparameter("S#39035", (SubLObject)module0579.ZERO_INTEGER);
        module0579.$g4335$ = SubLFiles.defparameter("S#39036", (SubLObject)module0579.$ic43$);
        module0579.$g4336$ = SubLFiles.defparameter("S#39037", (SubLObject)module0579.$ic42$);
        module0579.$g4337$ = SubLFiles.defparameter("S#39038", (SubLObject)module0579.$ic44$);
        module0579.$g4338$ = SubLFiles.defparameter("S#39039", (SubLObject)module0579.$ic45$);
        module0579.$g4339$ = SubLFiles.defparameter("S#39040", (SubLObject)module0579.NIL);
        module0579.$g4340$ = SubLFiles.defparameter("S#39041", (SubLObject)module0579.NIL);
        module0579.$g4341$ = SubLFiles.defparameter("S#39042", (SubLObject)module0579.NIL);
        module0579.$g4342$ = SubLFiles.defparameter("S#39043", (SubLObject)module0579.NIL);
        module0579.$g4343$ = SubLFiles.defconstant("S#39044", (SubLObject)module0579.$ic46$);
        module0579.$g4344$ = SubLFiles.defparameter("S#39045", (SubLObject)module0579.$ic47$);
        module0579.$g4345$ = SubLFiles.defparameter("S#39046", (SubLObject)module0579.T);
        module0579.$g4346$ = SubLFiles.defparameter("S#39047", (SubLObject)module0579.T);
        module0579.$g4347$ = SubLFiles.defparameter("S#39048", (SubLObject)module0579.T);
        module0579.$g4348$ = SubLFiles.defparameter("S#39049", (SubLObject)module0579.ONE_INTEGER);
        module0579.$g4349$ = SubLFiles.defparameter("S#39050", (SubLObject)module0579.NIL);
        module0579.$g4350$ = SubLFiles.defparameter("S#39051", (SubLObject)module0579.NIL);
        module0579.$g4351$ = SubLFiles.defparameter("S#39052", (SubLObject)module0579.NIL);
        module0579.$g4352$ = SubLFiles.defparameter("S#39053", (SubLObject)module0579.NIL);
        module0579.$g4353$ = SubLFiles.defparameter("S#39054", (SubLObject)module0579.$ic47$);
        module0579.$g4354$ = SubLFiles.deflexical("S#39055", module0067.f4880((SubLObject)module0579.UNPROVIDED, (SubLObject)module0579.UNPROVIDED));
        module0579.$g4355$ = SubLFiles.defparameter("S#39056", (SubLObject)module0579.ZERO_INTEGER);
        module0579.$g4356$ = SubLFiles.defconstant("S#39057", (SubLObject)module0579.ONE_INTEGER);
        module0579.$g4357$ = SubLFiles.defparameter("S#39058", (SubLObject)module0579.T);
        return (SubLObject)module0579.NIL;
    }
    
    public static SubLObject f35519() {
        module0002.f38((SubLObject)module0579.$ic7$);
        module0012.f441((SubLObject)module0579.$ic14$);
        module0012.f441((SubLObject)module0579.$ic15$);
        module0012.f441((SubLObject)module0579.$ic16$);
        module0012.f441((SubLObject)module0579.$ic18$);
        module0012.f441((SubLObject)module0579.$ic20$);
        module0012.f441((SubLObject)module0579.$ic21$);
        module0003.f57((SubLObject)module0579.$ic41$);
        return (SubLObject)module0579.NIL;
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
        module0579.$g4236$ = null;
        module0579.$g4237$ = null;
        module0579.$g4238$ = null;
        module0579.$g4239$ = null;
        module0579.$g4240$ = null;
        module0579.$g4241$ = null;
        module0579.$g4242$ = null;
        module0579.$g4243$ = null;
        module0579.$g4244$ = null;
        module0579.$g4245$ = null;
        module0579.$g4246$ = null;
        module0579.$g4247$ = null;
        module0579.$g4248$ = null;
        module0579.$g4249$ = null;
        module0579.$g4250$ = null;
        module0579.$g4251$ = null;
        module0579.$g4252$ = null;
        module0579.$g4253$ = null;
        module0579.$g4254$ = null;
        module0579.$g4255$ = null;
        module0579.$g4256$ = null;
        module0579.$g4257$ = null;
        module0579.$g4258$ = null;
        module0579.$g4259$ = null;
        module0579.$g4260$ = null;
        module0579.$g4261$ = null;
        module0579.$g4262$ = null;
        module0579.$g4263$ = null;
        module0579.$g4264$ = null;
        module0579.$g4265$ = null;
        module0579.$g4266$ = null;
        module0579.$g4267$ = null;
        module0579.$g4268$ = null;
        module0579.$g4269$ = null;
        module0579.$g4270$ = null;
        module0579.$g4271$ = null;
        module0579.$g4272$ = null;
        module0579.$g4273$ = null;
        module0579.$g4274$ = null;
        module0579.$g4275$ = null;
        module0579.$g4276$ = null;
        module0579.$g4277$ = null;
        module0579.$g4278$ = null;
        module0579.$g4279$ = null;
        module0579.$g4280$ = null;
        module0579.$g4281$ = null;
        module0579.$g4282$ = null;
        module0579.$g4283$ = null;
        module0579.$g4284$ = null;
        module0579.$g4285$ = null;
        module0579.$g4286$ = null;
        module0579.$g4287$ = null;
        module0579.$g4288$ = null;
        module0579.$g4289$ = null;
        module0579.$g4290$ = null;
        module0579.$g4291$ = null;
        module0579.$g4292$ = null;
        module0579.$g4293$ = null;
        module0579.$g4294$ = null;
        module0579.$g4295$ = null;
        module0579.$g4296$ = null;
        module0579.$g4297$ = null;
        module0579.$g4298$ = null;
        module0579.$g4299$ = null;
        module0579.$g4300$ = null;
        module0579.$g4301$ = null;
        module0579.$g4302$ = null;
        module0579.$g4303$ = null;
        module0579.$g4304$ = null;
        module0579.$g4305$ = null;
        module0579.$g4306$ = null;
        module0579.$g4307$ = null;
        module0579.$g4308$ = null;
        module0579.$g4309$ = null;
        module0579.$g4310$ = null;
        module0579.$g4311$ = null;
        module0579.$g4312$ = null;
        module0579.$g4313$ = null;
        module0579.$g4314$ = null;
        module0579.$g4315$ = null;
        module0579.$g4316$ = null;
        module0579.$g4317$ = null;
        module0579.$g4318$ = null;
        module0579.$g4319$ = null;
        module0579.$g4320$ = null;
        module0579.$g4321$ = null;
        module0579.$g4322$ = null;
        module0579.$g4323$ = null;
        module0579.$g4324$ = null;
        module0579.$g4325$ = null;
        module0579.$g4326$ = null;
        module0579.$g4327$ = null;
        module0579.$g4328$ = null;
        module0579.$g4329$ = null;
        module0579.$g4330$ = null;
        module0579.$g4331$ = null;
        module0579.$g4332$ = null;
        module0579.$g4333$ = null;
        module0579.$g4334$ = null;
        module0579.$g4335$ = null;
        module0579.$g4336$ = null;
        module0579.$g4337$ = null;
        module0579.$g4338$ = null;
        module0579.$g4339$ = null;
        module0579.$g4340$ = null;
        module0579.$g4341$ = null;
        module0579.$g4342$ = null;
        module0579.$g4343$ = null;
        module0579.$g4344$ = null;
        module0579.$g4345$ = null;
        module0579.$g4346$ = null;
        module0579.$g4347$ = null;
        module0579.$g4348$ = null;
        module0579.$g4349$ = null;
        module0579.$g4350$ = null;
        module0579.$g4351$ = null;
        module0579.$g4352$ = null;
        module0579.$g4353$ = null;
        module0579.$g4354$ = null;
        module0579.$g4355$ = null;
        module0579.$g4356$ = null;
        module0579.$g4357$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("WHEN-NECESSARY");
        $ic1$ = SubLObjectFactory.makeKeyword("SUPERSCRIPTS");
        $ic2$ = SubLObjectFactory.makeString("<a>");
        $ic3$ = SubLObjectFactory.makeString("<a ");
        $ic4$ = SubLObjectFactory.makeKeyword("NONE");
        $ic5$ = SubLObjectFactory.makeKeyword("TOP-LEVEL-ONLY");
        $ic6$ = SubLObjectFactory.makeKeyword("ALL");
        $ic7$ = SubLObjectFactory.makeSymbol("*PPH-TERSE-MODE?*");
        $ic8$ = SubLObjectFactory.makeKeyword("HTML");
        $ic9$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Agent-Generic")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Place")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TimeInterval")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Time-Quantity")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Event")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ScalarInterval")));
        $ic10$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic11$ = SubLObjectFactory.makeKeyword("ARBITRARY");
        $ic12$ = SubLObjectFactory.makeString("Too many demerits: ~S");
        $ic13$ = SubLObjectFactory.makeSymbol("CB-CF");
        $ic14$ = SubLObjectFactory.makeSymbol("S#39002", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#39003", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#39004", "CYC");
        $ic17$ = SubLObjectFactory.makeString("_self");
        $ic18$ = SubLObjectFactory.makeSymbol("S#39005", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#39059", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#39006", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#39007", "CYC");
        $ic22$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#38959", "CYC"), SubLObjectFactory.makeSymbol("*PPH-USE-BULLETED-LISTS?*"), SubLObjectFactory.makeSymbol("*PPH-USE-INDEXICAL-DATES?*"), SubLObjectFactory.makeSymbol("S#38966", "CYC"), SubLObjectFactory.makeSymbol("S#38967", "CYC"), SubLObjectFactory.makeSymbol("S#38968", "CYC"), SubLObjectFactory.makeSymbol("S#38969", "CYC"), SubLObjectFactory.makeSymbol("S#38981", "CYC"), SubLObjectFactory.makeSymbol("S#38984", "CYC"), SubLObjectFactory.makeSymbol("*THE-CYCLIST*"), SubLObjectFactory.makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*"), SubLObjectFactory.makeSymbol("*PARAPHRASE-PRECISION*"), SubLObjectFactory.makeSymbol("*PPH-TERSE-MODE?*"), SubLObjectFactory.makeSymbol("S#38982", "CYC"), SubLObjectFactory.makeSymbol("*PARAPHRASE-MODE*"), SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*"), SubLObjectFactory.makeSymbol("*PPH-DOMAIN-MT*"), SubLObjectFactory.makeSymbol("S#38976", "CYC"), SubLObjectFactory.makeSymbol("*DETERMINERS-BEFORE-VARIABLES*"), SubLObjectFactory.makeSymbol("*PPH-QUANTIFY-VARS?*"), SubLObjectFactory.makeSymbol("S#38986", "CYC"), SubLObjectFactory.makeSymbol("*PPH-EXPAND-E-NOTATION-FOR-FLOATS?*"), SubLObjectFactory.makeSymbol("S#39037", "CYC"), SubLObjectFactory.makeSymbol("S#39036", "CYC"), SubLObjectFactory.makeSymbol("S#38987", "CYC"), SubLObjectFactory.makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), SubLObjectFactory.makeSymbol("S#38988", "CYC"), SubLObjectFactory.makeSymbol("S#38989", "CYC"), SubLObjectFactory.makeSymbol("*PPH-ADDRESSEE*"), SubLObjectFactory.makeSymbol("*PPH-SPEAKER*"), SubLObjectFactory.makeSymbol("S#38991", "CYC"), SubLObjectFactory.makeSymbol("S#9978", "CYC"), SubLObjectFactory.makeSymbol("S#38993", "CYC"), SubLObjectFactory.makeSymbol("S#38994", "CYC"), SubLObjectFactory.makeSymbol("S#38995", "CYC"), SubLObjectFactory.makeSymbol("S#38996", "CYC"), SubLObjectFactory.makeSymbol("S#39002", "CYC"), SubLObjectFactory.makeSymbol("S#39005", "CYC"), SubLObjectFactory.makeSymbol("S#39006", "CYC"), SubLObjectFactory.makeSymbol("*PPH-LINK-ARG0?*"), SubLObjectFactory.makeSymbol("*PPH-MAXIMIZE-LINKS?*"), SubLObjectFactory.makeSymbol("S#39011", "CYC"), SubLObjectFactory.makeSymbol("S#39000", "CYC") });
        $ic23$ = SubLObjectFactory.makeSymbol("BOUNDP");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5251", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39060", "CYC"));
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNIVERSAL"), (SubLObject)SubLObjectFactory.makeKeyword("EXISTENTIAL"), (SubLObject)SubLObjectFactory.makeKeyword("NO"), (SubLObject)SubLObjectFactory.makeKeyword("SCOPED"), (SubLObject)SubLObjectFactory.makeKeyword("QUERY"));
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic27$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic28$ = SubLObjectFactory.makeSymbol("S#38916", "CYC");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38946", "CYC"));
        $ic30$ = SubLObjectFactory.makeSymbol("CLET");
        $ic31$ = SubLObjectFactory.makeSymbol("S#39016", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("CONS");
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39016", "CYC"));
        $ic34$ = SubLObjectFactory.makeSymbol("S#38908", "CYC");
        $ic35$ = SubLObjectFactory.makeString("Inside operator scope ~S");
        $ic36$ = SubLObjectFactory.makeString("Leaving operator scope ~S");
        $ic37$ = SubLObjectFactory.makeKeyword("NO");
        $ic38$ = SubLObjectFactory.makeKeyword("IMPLIES");
        $ic39$ = SubLObjectFactory.makeString("______");
        $ic40$ = SubLObjectFactory.makeString("Gen-Template Store Lock");
        $ic41$ = SubLObjectFactory.makeSymbol("S#39021", "CYC");
        $ic42$ = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $ic43$ = ConsesLow.list((SubLObject)module0579.ZERO_INTEGER);
        $ic44$ = SubLObjectFactory.makeKeyword("OFF");
        $ic45$ = SubLObjectFactory.makeKeyword("NOT-GATHERING");
        $ic46$ = SubLObjectFactory.makeKeyword("PPH-BAD-TEMPLATE-DUMMY");
        $ic47$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic48$ = SubLObjectFactory.makeKeyword("INITIALIZED");
        $ic49$ = SubLObjectFactory.makeString("(PPH error level ");
        $ic50$ = SubLObjectFactory.makeString(") ");
        $ic51$ = SubLObjectFactory.makeString("No KB loaded. Couldn't initialize paraphrase vars.");
        $ic52$ = SubLObjectFactory.makeKeyword("NO-KB-LOADED");
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("CyclishParaphraseMt"), (SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt"), (SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic54$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $ic55$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $ic56$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Now"))));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0579.class
	Total time: 223 ms
	
	Decompiled with Procyon 0.5.32.
*/