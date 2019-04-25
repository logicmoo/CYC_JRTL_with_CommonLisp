package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0018 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0018";
    public static final String myFingerPrint = "2103bd580e5ac715dedebf3537e9fd5eb85f8a8a7a026f870f01cbf835b13151";
    public static SubLSymbol $g571$;
    public static SubLSymbol $g572$;
    public static SubLSymbol $g573$;
    public static SubLSymbol $g574$;
    public static SubLSymbol $g575$;
    public static SubLSymbol $g576$;
    public static SubLSymbol $g577$;
    public static SubLSymbol $g578$;
    public static SubLSymbol $g579$;
    public static SubLSymbol $g580$;
    public static SubLSymbol $g581$;
    public static SubLSymbol $g582$;
    public static SubLSymbol $g583$;
    public static SubLSymbol $g584$;
    public static SubLSymbol $g585$;
    public static SubLSymbol $g586$;
    public static SubLSymbol $g587$;
    public static SubLSymbol $g588$;
    public static SubLSymbol $g589$;
    public static SubLSymbol $g590$;
    public static SubLSymbol $g591$;
    public static SubLSymbol $g592$;
    public static SubLSymbol $g593$;
    public static SubLSymbol $g594$;
    public static SubLSymbol $g595$;
    public static SubLSymbol $g596$;
    public static SubLSymbol $g597$;
    public static SubLSymbol $g598$;
    public static SubLSymbol $g599$;
    public static SubLSymbol $g600$;
    public static SubLSymbol $g601$;
    public static SubLSymbol $g602$;
    public static SubLSymbol $g603$;
    public static SubLSymbol $g604$;
    public static SubLSymbol $g605$;
    public static SubLSymbol $g606$;
    public static SubLSymbol $g607$;
    public static SubLSymbol $g608$;
    public static SubLSymbol $g609$;
    public static SubLSymbol $g610$;
    public static SubLSymbol $g611$;
    public static SubLSymbol $g612$;
    public static SubLSymbol $g613$;
    public static SubLSymbol $g614$;
    public static SubLSymbol $g615$;
    public static SubLSymbol $g616$;
    public static SubLSymbol $g617$;
    public static SubLSymbol $g618$;
    public static SubLSymbol $g619$;
    public static SubLSymbol $g620$;
    public static SubLSymbol $g621$;
    public static SubLSymbol $g622$;
    public static SubLSymbol $g61$;
    public static SubLSymbol $g623$;
    public static SubLSymbol $g624$;
    public static SubLSymbol $g625$;
    public static SubLSymbol $g626$;
    public static SubLSymbol $g627$;
    public static SubLSymbol $g628$;
    public static SubLSymbol $g629$;
    public static SubLSymbol $g630$;
    public static SubLSymbol $g631$;
    public static SubLSymbol $g632$;
    public static SubLSymbol $g633$;
    public static SubLSymbol $g634$;
    public static SubLSymbol $g635$;
    public static SubLSymbol $g636$;
    public static SubLSymbol $g637$;
    public static SubLSymbol $g638$;
    public static SubLSymbol $g639$;
    public static SubLSymbol $g640$;
    public static SubLSymbol $g641$;
    public static SubLSymbol $g642$;
    public static SubLSymbol $g643$;
    public static SubLSymbol $g644$;
    public static SubLSymbol $g645$;
    public static SubLSymbol $g646$;
    public static SubLSymbol $g647$;
    public static SubLSymbol $g648$;
    public static SubLSymbol $g649$;
    public static SubLSymbol $g650$;
    public static SubLSymbol $g651$;
    public static SubLSymbol $g652$;
    public static SubLSymbol $g653$;
    public static SubLSymbol $g654$;
    public static SubLSymbol $g655$;
    public static SubLSymbol $g656$;
    public static SubLSymbol $g657$;
    public static SubLSymbol $g658$;
    public static SubLSymbol $g659$;
    public static SubLSymbol $g660$;
    public static SubLSymbol $g661$;
    public static SubLSymbol $g662$;
    public static SubLSymbol $g663$;
    public static SubLSymbol $g664$;
    public static SubLSymbol $g665$;
    public static SubLSymbol $g666$;
    public static SubLSymbol $g667$;
    public static SubLSymbol $g668$;
    public static SubLSymbol $g669$;
    public static SubLSymbol $g670$;
    public static SubLSymbol $g671$;
    public static SubLSymbol $g672$;
    public static SubLSymbol $g673$;
    public static SubLSymbol $g674$;
    public static SubLSymbol $g675$;
    public static SubLSymbol $g676$;
    public static SubLSymbol $g677$;
    public static SubLSymbol $g678$;
    public static SubLSymbol $g679$;
    public static SubLSymbol $g680$;
    public static SubLSymbol $g681$;
    public static SubLSymbol $g682$;
    private static SubLSymbol $g683$;
    private static SubLSymbol $g684$;
    public static SubLSymbol $g685$;
    private static SubLSymbol $g686$;
    private static SubLSymbol $g687$;
    public static SubLSymbol $g688$;
    public static SubLSymbol $g689$;
    public static SubLSymbol $g690$;
    public static SubLSymbol $g691$;
    public static SubLSymbol $g692$;
    public static SubLSymbol $g693$;
    public static SubLSymbol $g694$;
    public static SubLSymbol $g695$;
    public static SubLSymbol $g696$;
    public static SubLSymbol $g697$;
    public static SubLSymbol $g698$;
    public static SubLSymbol $g699$;
    public static SubLSymbol $g700$;
    public static SubLSymbol $g701$;
    public static SubLSymbol $g702$;
    private static SubLSymbol $g703$;
    public static SubLSymbol $g704$;
    public static SubLSymbol $g705$;
    private static SubLSymbol $g706$;
    public static SubLSymbol $g707$;
    public static SubLSymbol $g708$;
    public static SubLSymbol $g709$;
    public static SubLSymbol $g710$;
    public static SubLSymbol $g711$;
    public static SubLSymbol $g712$;
    public static SubLSymbol $g713$;
    public static SubLSymbol $g714$;
    public static SubLSymbol $g715$;
    public static SubLSymbol $g716$;
    public static SubLSymbol $g717$;
    public static SubLSymbol $g718$;
    public static SubLSymbol $g719$;
    public static SubLSymbol $g720$;
    public static SubLSymbol $g721$;
    public static SubLSymbol $g722$;
    public static SubLSymbol $g723$;
    public static SubLSymbol $g724$;
    public static SubLSymbol $g725$;
    public static SubLSymbol $g726$;
    public static SubLSymbol $g727$;
    public static SubLSymbol $g728$;
    public static SubLSymbol $g729$;
    public static SubLSymbol $g730$;
    public static SubLSymbol $g731$;
    public static SubLSymbol $g732$;
    public static SubLSymbol $g733$;
    public static SubLSymbol $g734$;
    public static SubLSymbol $g735$;
    public static SubLSymbol $g736$;
    public static SubLSymbol $g737$;
    public static SubLSymbol $g738$;
    public static SubLSymbol $g739$;
    public static SubLSymbol $g740$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLInteger $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLFloat $ic31$;
    private static final SubLFloat $ic32$;
    private static final SubLFloat $ic33$;
    private static final SubLFloat $ic34$;
    private static final SubLInteger $ic35$;
    private static final SubLInteger $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
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
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
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
    
    
    public static SubLObject f952(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0018.$ic3$, (SubLObject)module0018.$ic4$, ConsesLow.append(var5, (SubLObject)module0018.NIL));
    }
    
    public static SubLObject f953(final SubLObject var6) {
        assert module0018.NIL != Types.symbolp(var6) : var6;
        if (var6.isKeyword()) {
            return module0018.$g575$.getGlobalValue();
        }
        final SubLObject var7 = Symbols.symbol_package(var6);
        if (module0018.NIL == var7) {
            return (SubLObject)module0018.NIL;
        }
        final SubLObject var8 = Symbols.symbol_name(var6);
        if (var6.eql(Packages.find_symbol(var8, module0018.$g576$.getGlobalValue()))) {
            return module0018.$g576$.getGlobalValue();
        }
        if (var6.eql(Packages.find_symbol(var8, module0018.$g577$.getGlobalValue()))) {
            return module0018.$g577$.getGlobalValue();
        }
        return Errors.error((SubLObject)module0018.$ic9$, var6, var7);
    }
    
    public static SubLObject f954(final SubLObject var9, SubLObject var10) {
        if (var10 == module0018.UNPROVIDED) {
            var10 = module0018.$g606$.getDynamicValue();
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)module0018.NIL;
        final SubLObject var13 = var10;
        if (var13.eql((SubLObject)module0018.ONE_INTEGER)) {
            final SubLObject var14 = module0018.$g607$.currentBinding(var11);
            try {
                module0018.$g607$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                module0018.$g607$.rebind(var14, var11);
            }
        }
        else if (var13.eql((SubLObject)module0018.TWO_INTEGER)) {
            final SubLObject var14 = module0018.$g608$.currentBinding(var11);
            try {
                module0018.$g608$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                module0018.$g608$.rebind(var14, var11);
            }
        }
        else if (var13.eql((SubLObject)module0018.THREE_INTEGER)) {
            final SubLObject var14 = module0018.$g609$.currentBinding(var11);
            try {
                module0018.$g609$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                module0018.$g609$.rebind(var14, var11);
            }
        }
        else if (var13.eql((SubLObject)module0018.FOUR_INTEGER)) {
            final SubLObject var14 = module0018.$g610$.currentBinding(var11);
            try {
                module0018.$g610$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                module0018.$g610$.rebind(var14, var11);
            }
        }
        else if (var13.eql((SubLObject)module0018.FIVE_INTEGER)) {
            final SubLObject var14 = module0018.$g611$.currentBinding(var11);
            try {
                module0018.$g611$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                module0018.$g611$.rebind(var14, var11);
            }
        }
        else if (var13.eql((SubLObject)module0018.SIX_INTEGER)) {
            final SubLObject var14 = module0018.$g612$.currentBinding(var11);
            try {
                module0018.$g612$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                module0018.$g612$.rebind(var14, var11);
            }
        }
        else if (var13.eql((SubLObject)module0018.SEVEN_INTEGER)) {
            final SubLObject var14 = module0018.$g613$.currentBinding(var11);
            try {
                module0018.$g613$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                module0018.$g613$.rebind(var14, var11);
            }
        }
        else if (var13.eql((SubLObject)module0018.EIGHT_INTEGER)) {
            final SubLObject var14 = module0018.$g614$.currentBinding(var11);
            try {
                module0018.$g614$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                module0018.$g614$.rebind(var14, var11);
            }
        }
        return var12;
    }
    
    public static SubLObject f955() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (module0018.NIL != module0012.f421(module0018.$g605$.getDynamicValue(var11))) {
            return (SubLObject)module0018.NIL;
        }
        if (module0018.NIL != module0012.f421(module0018.$g608$.getDynamicValue(var11))) {
            return Functions.funcall(module0018.$g605$.getDynamicValue(var11), module0018.$g607$.getDynamicValue(var11));
        }
        if (module0018.NIL != module0012.f421(module0018.$g609$.getDynamicValue(var11))) {
            return Functions.funcall(module0018.$g605$.getDynamicValue(var11), module0018.$g607$.getDynamicValue(var11), module0018.$g608$.getDynamicValue(var11));
        }
        if (module0018.NIL != module0012.f421(module0018.$g610$.getDynamicValue(var11))) {
            return Functions.funcall(module0018.$g605$.getDynamicValue(var11), module0018.$g607$.getDynamicValue(var11), module0018.$g608$.getDynamicValue(var11), module0018.$g609$.getDynamicValue(var11));
        }
        if (module0018.NIL != module0012.f421(module0018.$g611$.getDynamicValue(var11))) {
            return Functions.funcall(module0018.$g605$.getDynamicValue(var11), module0018.$g607$.getDynamicValue(var11), module0018.$g608$.getDynamicValue(var11), module0018.$g609$.getDynamicValue(var11), module0018.$g610$.getDynamicValue(var11));
        }
        if (module0018.NIL != module0012.f421(module0018.$g612$.getDynamicValue(var11))) {
            return Functions.funcall(module0018.$g605$.getDynamicValue(var11), module0018.$g607$.getDynamicValue(var11), module0018.$g608$.getDynamicValue(var11), module0018.$g609$.getDynamicValue(var11), module0018.$g610$.getDynamicValue(var11), module0018.$g611$.getDynamicValue(var11));
        }
        if (module0018.NIL != module0012.f421(module0018.$g613$.getDynamicValue(var11))) {
            return Functions.funcall(module0018.$g605$.getDynamicValue(var11), module0018.$g607$.getDynamicValue(var11), module0018.$g608$.getDynamicValue(var11), module0018.$g609$.getDynamicValue(var11), module0018.$g610$.getDynamicValue(var11), module0018.$g611$.getDynamicValue(var11), module0018.$g612$.getDynamicValue(var11));
        }
        if (module0018.NIL != module0012.f421(module0018.$g614$.getDynamicValue(var11))) {
            return Functions.funcall(module0018.$g605$.getDynamicValue(var11), new SubLObject[] { module0018.$g607$.getDynamicValue(var11), module0018.$g608$.getDynamicValue(var11), module0018.$g609$.getDynamicValue(var11), module0018.$g610$.getDynamicValue(var11), module0018.$g611$.getDynamicValue(var11), module0018.$g612$.getDynamicValue(var11), module0018.$g613$.getDynamicValue(var11) });
        }
        return Functions.funcall(module0018.$g605$.getDynamicValue(var11), new SubLObject[] { module0018.$g607$.getDynamicValue(var11), module0018.$g608$.getDynamicValue(var11), module0018.$g609$.getDynamicValue(var11), module0018.$g610$.getDynamicValue(var11), module0018.$g611$.getDynamicValue(var11), module0018.$g612$.getDynamicValue(var11), module0018.$g613$.getDynamicValue(var11), module0018.$g614$.getDynamicValue(var11) });
    }
    
    public static SubLObject f956(final SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var16 == module0018.UNPROVIDED) {
            var16 = (SubLObject)module0018.NIL;
        }
        if (var17 == module0018.UNPROVIDED) {
            var17 = (SubLObject)module0018.NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0018.NIL != module0018.$g629$.getDynamicValue(var18)) {
            return Errors.error(var15, var16, var17);
        }
        return Errors.warn(var15, var16, var17);
    }
    
    public static SubLObject f957() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return module0018.$g631$.getDynamicValue(var11);
    }
    
    public static SubLObject f958(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        return module0004.f104(var18, module0018.$g670$.getDynamicValue(var19), (SubLObject)module0018.UNPROVIDED, (SubLObject)module0018.UNPROVIDED);
    }
    
    public static SubLObject f959() {
        return module0018.$g682$.getGlobalValue();
    }
    
    public static SubLObject f960(final SubLObject var19) {
        assert module0018.NIL != Types.booleanp(var19) : var19;
        module0018.$g682$.setGlobalValue(var19);
        return module0018.$g682$.getGlobalValue();
    }
    
    public static SubLObject f961() {
        return module0018.$g683$.getGlobalValue();
    }
    
    public static SubLObject f962(final SubLObject var19) {
        assert module0018.NIL != Types.booleanp(var19) : var19;
        module0018.$g683$.setGlobalValue(var19);
        return module0018.$g683$.getGlobalValue();
    }
    
    public static SubLObject f963() {
        return module0018.$g684$.getGlobalValue();
    }
    
    public static SubLObject f964(final SubLObject var19) {
        assert module0018.NIL != Types.booleanp(var19) : var19;
        module0018.$g684$.setGlobalValue(var19);
        return module0018.$g684$.getGlobalValue();
    }
    
    public static SubLObject f965() {
        final SubLObject var20 = Strings.string_downcase(module0038.f2622(Environment.get_machine_name((SubLObject)module0018.$ic39$), (SubLObject)Characters.CHAR_period), (SubLObject)module0018.UNPROVIDED, (SubLObject)module0018.UNPROVIDED);
        final SubLObject var21 = Environment.get_process_id((SubLObject)module0018.UNPROVIDED);
        final SubLObject var22 = module0051.f3563((SubLObject)module0018.UNPROVIDED);
        return PrintLow.format((SubLObject)module0018.NIL, (SubLObject)module0018.$ic40$, new SubLObject[] { var20, var22, var21 });
    }
    
    public static SubLObject f966() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        module0018.$g685$.setDynamicValue(f965(), var11);
        return module0018.$g685$.getDynamicValue(var11);
    }
    
    public static SubLObject f967() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return module0018.$g685$.getDynamicValue(var11);
    }
    
    public static SubLObject f968() {
        return module0018.$g686$.getGlobalValue();
    }
    
    public static SubLObject f969(final SubLObject var23) {
        if (module0018.NIL != var23 && !module0018.areAssertionsDisabledFor(me) && module0018.NIL == Types.integerp(var23)) {
            throw new AssertionError(var23);
        }
        module0018.$g686$.setGlobalValue(var23);
        return f970(var23);
    }
    
    public static SubLObject f971() {
        return module0018.$g687$.getGlobalValue();
    }
    
    public static SubLObject f970(final SubLObject var23) {
        if (module0018.NIL != var23 && !module0018.areAssertionsDisabledFor(me) && module0018.NIL == Types.integerp(var23)) {
            throw new AssertionError(var23);
        }
        module0018.$g687$.setGlobalValue(var23);
        return var23;
    }
    
    public static SubLObject f972() {
        return module0035.sublisp_boolean(f971());
    }
    
    public static SubLObject f973() {
        return Numbers.numG(constant_handles_oc.f8433(), (SubLObject)module0018.$ic28$);
    }
    
    public static SubLObject f974() {
        if (module0018.NIL != f973()) {
            return (SubLObject)module0018.$ic44$;
        }
        return (SubLObject)module0018.$ic45$;
    }
    
    public static SubLObject f975() {
        return module0018.$g688$.getGlobalValue();
    }
    
    public static SubLObject f976() {
        return module0018.$g691$.getGlobalValue();
    }
    
    public static SubLObject f977(final SubLObject var19) {
        module0018.$g691$.setGlobalValue(var19);
        return module0018.$g691$.getGlobalValue();
    }
    
    public static SubLObject f978() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0018.NIL != module0018.$g694$.getDynamicValue(var11) && module0018.NIL != f973() && module0018.NIL != module0004.f105(f971()));
    }
    
    public static SubLObject f979() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return module0018.$g698$.getDynamicValue(var11);
    }
    
    public static SubLObject f980() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0018.NIL != module0018.$g698$.getDynamicValue(var11) || module0018.NIL != module0018.$g699$.getDynamicValue(var11));
    }
    
    public static SubLObject f981() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return module0018.$g696$.getDynamicValue(var11);
    }
    
    public static SubLObject f982() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return module0018.$g697$.getDynamicValue(var11);
    }
    
    public static SubLObject f983() {
        module0018.$g703$.setGlobalValue((SubLObject)module0018.T);
        return module0018.$g703$.getGlobalValue();
    }
    
    public static SubLObject f984() {
        return module0035.sublisp_boolean(module0018.$g703$.getGlobalValue());
    }
    
    public static SubLObject f985(final SubLObject var24) {
        return module0035.f2169(var24, module0018.$g706$.getGlobalValue());
    }
    
    public static SubLObject f986(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        if (module0018.NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0018.NIL);
        }
        return (SubLObject)module0018.$ic59$;
    }
    
    public static SubLObject f987(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0018.$ic60$, (SubLObject)module0018.$ic61$, ConsesLow.append(var5, (SubLObject)module0018.NIL));
    }
    
    public static SubLObject f988() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0018", "f952", "S#1770");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f953", "S#1771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f954", "S#1772", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f955", "S#1773", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f956", "S#1774", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f957", "S#1775", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f958", "S#1776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f959", "S#1777", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f960", "S#1778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f961", "S#1779", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f962", "S#1780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f963", "S#1781", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f964", "S#1782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f965", "S#1783", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f966", "S#1784", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f967", "CYC-IMAGE-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f968", "S#1785", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f969", "S#1786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f971", "KB-LOADED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f970", "S#1787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f972", "S#1788", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f973", "S#1789", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f974", "S#1790", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f975", "S#1791", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f976", "S#1792", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f977", "S#1793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f978", "S#1794", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f979", "S#1795", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f980", "S#1796", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f981", "S#1797", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f982", "S#1798", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f983", "S#1799", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f984", "S#1800", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0018", "f985", "S#1801", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0018", "f986", "S#1802");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0018", "f987", "S#1803");
        return (SubLObject)module0018.NIL;
    }
    
    public static SubLObject f989() {
        module0018.$g571$ = SubLFiles.defparameter("*READ-REQUIRE-CONSTANT-EXISTS*", (SubLObject)module0018.T);
        module0018.$g572$ = SubLFiles.deflexical("S#1804", (SubLObject)((module0018.NIL != Symbols.boundp((SubLObject)module0018.$ic0$)) ? module0018.$g572$.getGlobalValue() : module0018.NIL));
        module0018.$g573$ = SubLFiles.deflexical("S#1805", (module0018.NIL != Symbols.boundp((SubLObject)module0018.$ic1$)) ? module0018.$g573$.getGlobalValue() : Locks.make_lock((SubLObject)module0018.$ic2$));
        module0018.$g574$ = SubLFiles.defparameter("S#1806", (SubLObject)module0018.NIL);
        module0018.$g575$ = SubLFiles.deflexical("S#1807", Packages.find_package((SubLObject)module0018.$ic5$));
        module0018.$g576$ = SubLFiles.deflexical("S#1808", Packages.find_package((SubLObject)module0018.$ic6$));
        module0018.$g577$ = SubLFiles.deflexical("S#1809", Packages.find_package((SubLObject)module0018.$ic7$));
        module0018.$g578$ = SubLFiles.defparameter("S#1810", (SubLObject)module0018.EQUAL);
        module0018.$g579$ = SubLFiles.defparameter("S#1811", (SubLObject)module0018.EQUAL);
        module0018.$g580$ = SubLFiles.defparameter("S#1812", (SubLObject)module0018.EQUAL);
        module0018.$g581$ = SubLFiles.defparameter("S#1813", (SubLObject)module0018.NIL);
        module0018.$g582$ = SubLFiles.defparameter("S#1814", (SubLObject)module0018.NIL);
        module0018.$g583$ = SubLFiles.defparameter("S#1815", (SubLObject)module0018.$ic10$);
        module0018.$g584$ = SubLFiles.defparameter("S#1816", (SubLObject)module0018.NIL);
        module0018.$g585$ = SubLFiles.defparameter("S#1817", (SubLObject)module0018.NIL);
        module0018.$g586$ = SubLFiles.defparameter("S#1818", (SubLObject)module0018.NIL);
        module0018.$g587$ = SubLFiles.defparameter("S#1819", (SubLObject)module0018.NIL);
        module0018.$g588$ = SubLFiles.defparameter("S#1820", (SubLObject)module0018.NIL);
        module0018.$g589$ = SubLFiles.defparameter("S#1821", (SubLObject)module0018.NIL);
        module0018.$g590$ = SubLFiles.defparameter("S#1822", (SubLObject)module0018.NIL);
        module0018.$g591$ = SubLFiles.defparameter("S#1823", (SubLObject)module0018.NIL);
        module0018.$g592$ = SubLFiles.defparameter("S#1824", (SubLObject)module0018.T);
        module0018.$g593$ = SubLFiles.defparameter("S#1825", Symbols.symbol_function((SubLObject)module0018.EQL));
        module0018.$g594$ = SubLFiles.defparameter("S#1826", (SubLObject)module0018.NIL);
        module0018.$g595$ = SubLFiles.defparameter("S#1827", (SubLObject)module0018.NIL);
        module0018.$g596$ = SubLFiles.defparameter("S#1828", (SubLObject)module0018.NIL);
        module0018.$g597$ = SubLFiles.defparameter("S#1829", (SubLObject)module0018.NIL);
        module0018.$g598$ = SubLFiles.defparameter("S#1830", (SubLObject)module0018.NIL);
        module0018.$g599$ = SubLFiles.defparameter("S#1831", (SubLObject)module0018.NIL);
        module0018.$g600$ = SubLFiles.defparameter("S#1832", (SubLObject)module0018.NIL);
        module0018.$g601$ = SubLFiles.defparameter("S#1833", Symbols.symbol_function((SubLObject)module0018.IDENTITY));
        module0018.$g602$ = SubLFiles.defparameter("S#1834", (SubLObject)module0018.NIL);
        module0018.$g603$ = SubLFiles.defparameter("S#1835", (SubLObject)module0018.NIL);
        module0018.$g604$ = SubLFiles.defparameter("S#1836", (SubLObject)module0018.NIL);
        module0018.$g605$ = SubLFiles.defparameter("S#1837", module0012.$g49$.getGlobalValue());
        module0018.$g606$ = SubLFiles.defparameter("S#1838", (SubLObject)module0018.ONE_INTEGER);
        module0018.$g607$ = SubLFiles.defparameter("S#1839", module0012.$g49$.getGlobalValue());
        module0018.$g608$ = SubLFiles.defparameter("S#1840", module0012.$g49$.getGlobalValue());
        module0018.$g609$ = SubLFiles.defparameter("S#1841", module0012.$g49$.getGlobalValue());
        module0018.$g610$ = SubLFiles.defparameter("S#1842", module0012.$g49$.getGlobalValue());
        module0018.$g611$ = SubLFiles.defparameter("S#1843", module0012.$g49$.getGlobalValue());
        module0018.$g612$ = SubLFiles.defparameter("S#1844", module0012.$g49$.getGlobalValue());
        module0018.$g613$ = SubLFiles.defparameter("S#1845", module0012.$g49$.getGlobalValue());
        module0018.$g614$ = SubLFiles.defparameter("S#1846", module0012.$g49$.getGlobalValue());
        module0018.$g615$ = SubLFiles.defparameter("S#1847", (SubLObject)module0018.NIL);
        module0018.$g616$ = SubLFiles.defparameter("S#1848", (SubLObject)module0018.$ic11$);
        module0018.$g617$ = SubLFiles.defparameter("*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*", (SubLObject)module0018.NIL);
        module0018.$g618$ = SubLFiles.defparameter("S#1849", (SubLObject)module0018.NIL);
        module0018.$g619$ = SubLFiles.defparameter("S#1850", (SubLObject)module0018.NIL);
        module0018.$g620$ = SubLFiles.defparameter("S#1851", (SubLObject)module0018.NIL);
        module0018.$g621$ = SubLFiles.defparameter("S#1852", (SubLObject)module0018.ZERO_INTEGER);
        module0018.$g622$ = SubLFiles.defparameter("S#1853", (SubLObject)module0018.NIL);
        module0018.$g61$ = SubLFiles.defparameter("S#694", (SubLObject)module0018.NIL);
        module0018.$g623$ = SubLFiles.defparameter("S#1854", (SubLObject)module0018.T);
        module0018.$g624$ = SubLFiles.defparameter("S#1855", (SubLObject)module0018.T);
        module0018.$g625$ = SubLFiles.defparameter("S#1856", (SubLObject)module0018.T);
        module0018.$g626$ = SubLFiles.defparameter("S#1857", (SubLObject)module0018.$ic12$);
        module0018.$g627$ = SubLFiles.defparameter("S#1858", (SubLObject)module0018.T);
        module0018.$g628$ = SubLFiles.defparameter("S#1859", (SubLObject)module0018.NIL);
        module0018.$g629$ = SubLFiles.defparameter("S#1860", (SubLObject)module0018.NIL);
        module0018.$g630$ = SubLFiles.defparameter("S#1861", (SubLObject)module0018.ZERO_INTEGER);
        module0018.$g631$ = SubLFiles.defvar("S#1862", (SubLObject)module0018.NIL);
        module0018.$g632$ = SubLFiles.defparameter("S#1863", (SubLObject)module0018.$ic13$);
        module0018.$g633$ = SubLFiles.defparameter("S#1864", (SubLObject)module0018.NIL);
        module0018.$g634$ = SubLFiles.defparameter("S#1865", (SubLObject)module0018.NIL);
        module0018.$g635$ = SubLFiles.defparameter("S#1866", (SubLObject)module0018.NIL);
        module0018.$g636$ = SubLFiles.defparameter("S#1867", (SubLObject)module0018.NIL);
        module0018.$g637$ = SubLFiles.defparameter("S#1868", (SubLObject)module0018.NIL);
        module0018.$g638$ = SubLFiles.defparameter("S#1869", (SubLObject)module0018.NIL);
        module0018.$g639$ = SubLFiles.defparameter("S#1870", (SubLObject)module0018.NIL);
        module0018.$g640$ = SubLFiles.defparameter("S#1871", (SubLObject)module0018.NIL);
        module0018.$g641$ = SubLFiles.defparameter("S#1872", (SubLObject)module0018.NIL);
        module0018.$g642$ = SubLFiles.defparameter("S#1873", (SubLObject)module0018.NIL);
        module0018.$g643$ = SubLFiles.defparameter("S#1874", (SubLObject)module0018.NIL);
        module0018.$g644$ = SubLFiles.defparameter("*HL-FAILURE-BACKCHAINING*", (SubLObject)module0018.NIL);
        module0018.$g645$ = SubLFiles.defparameter("*EVALUATABLE-BACKCHAIN-ENABLED*", (SubLObject)module0018.NIL);
        module0018.$g646$ = SubLFiles.defparameter("S#1875", (SubLObject)module0018.NIL);
        module0018.$g647$ = SubLFiles.defparameter("S#1876", (SubLObject)module0018.T);
        module0018.$g648$ = SubLFiles.defparameter("*UNBOUND-RULE-BACKCHAIN-ENABLED*", (SubLObject)module0018.NIL);
        module0018.$g649$ = SubLFiles.deflexical("S#1877", (SubLObject)module0018.$ic28$);
        module0018.$g650$ = SubLFiles.defparameter("S#1878", module0018.$g649$.getGlobalValue());
        module0018.$g651$ = SubLFiles.defparameter("S#1879", module0018.$g649$.getGlobalValue());
        module0018.$g652$ = SubLFiles.defparameter("S#1880", (SubLObject)module0018.NIL);
        module0018.$g653$ = SubLFiles.defparameter("S#1881", (SubLObject)module0018.NIL);
        module0018.$g654$ = SubLFiles.defparameter("S#1882", (SubLObject)module0018.$ic29$);
        module0018.$g655$ = SubLFiles.defparameter("S#1883", (SubLObject)module0018.T);
        module0018.$g656$ = SubLFiles.defparameter("S#1884", (SubLObject)module0018.$ic30$);
        module0018.$g657$ = SubLFiles.defparameter("S#1885", (SubLObject)module0018.$ic31$);
        module0018.$g658$ = SubLFiles.defparameter("S#1886", (SubLObject)module0018.$ic32$);
        module0018.$g659$ = SubLFiles.deflexical("S#1887", (SubLObject)module0018.$ic32$);
        module0018.$g660$ = SubLFiles.deflexical("S#1888", (SubLObject)module0018.$ic33$);
        module0018.$g661$ = SubLFiles.deflexical("S#1889", (SubLObject)module0018.$ic34$);
        module0018.$g662$ = SubLFiles.deflexical("S#1890", module0018.$g661$.getGlobalValue());
        module0018.$g663$ = SubLFiles.defparameter("S#1891", (SubLObject)module0018.NIL);
        module0018.$g664$ = SubLFiles.defparameter("S#1892", (SubLObject)module0018.$ic35$);
        module0018.$g665$ = SubLFiles.defparameter("S#1893", (SubLObject)module0018.$ic36$);
        module0018.$g666$ = SubLFiles.defparameter("S#1894", (SubLObject)module0018.NIL);
        module0018.$g667$ = SubLFiles.defparameter("S#1895", (SubLObject)module0018.NIL);
        module0018.$g668$ = SubLFiles.defparameter("S#1896", (SubLObject)module0018.NIL);
        module0018.$g669$ = SubLFiles.defparameter("S#1897", (SubLObject)module0018.NIL);
        module0018.$g670$ = SubLFiles.defparameter("S#1898", (SubLObject)module0018.NIL);
        module0018.$g671$ = SubLFiles.defparameter("S#1899", (SubLObject)module0018.NIL);
        module0018.$g672$ = SubLFiles.defparameter("S#1900", (SubLObject)module0018.NIL);
        module0018.$g673$ = SubLFiles.defparameter("S#1901", (SubLObject)module0018.NIL);
        module0018.$g674$ = SubLFiles.defparameter("S#1902", (SubLObject)module0018.NIL);
        module0018.$g675$ = SubLFiles.defparameter("S#1903", (SubLObject)module0018.NIL);
        module0018.$g676$ = SubLFiles.defparameter("S#1904", (SubLObject)module0018.NIL);
        module0018.$g677$ = SubLFiles.deflexical("S#1905", (SubLObject)module0018.NIL);
        module0018.$g678$ = SubLFiles.deflexical("S#1906", (SubLObject)module0018.NIL);
        module0018.$g679$ = SubLFiles.deflexical("S#1907", (SubLObject)module0018.NIL);
        module0018.$g680$ = SubLFiles.defparameter("S#1908", (SubLObject)module0018.NIL);
        module0018.$g681$ = SubLFiles.defparameter("S#1909", (SubLObject)module0018.T);
        module0018.$g682$ = SubLFiles.deflexical("S#1910", (SubLObject)((module0018.NIL != Symbols.boundp((SubLObject)module0018.$ic37$)) ? module0018.$g682$.getGlobalValue() : module0018.NIL));
        module0018.$g683$ = SubLFiles.deflexical("S#1911", (SubLObject)module0018.NIL);
        module0018.$g684$ = SubLFiles.deflexical("S#1912", (SubLObject)module0018.NIL);
        module0018.$g685$ = SubLFiles.defvar("S#1913", (SubLObject)module0018.NIL);
        module0018.$g686$ = SubLFiles.deflexical("S#1914", (SubLObject)((module0018.NIL != Symbols.boundp((SubLObject)module0018.$ic41$)) ? module0018.$g686$.getGlobalValue() : module0018.NIL));
        module0018.$g687$ = SubLFiles.deflexical("S#1915", (SubLObject)((module0018.NIL != Symbols.boundp((SubLObject)module0018.$ic43$)) ? module0018.$g687$.getGlobalValue() : module0018.NIL));
        module0018.$g688$ = SubLFiles.deflexical("S#1916", (SubLObject)((module0018.NIL != Symbols.boundp((SubLObject)module0018.$ic46$)) ? module0018.$g688$.getGlobalValue() : module0018.$ic47$));
        module0018.$g689$ = SubLFiles.defparameter("*USE-TRANSCRIPT?*", (SubLObject)module0018.T);
        module0018.$g690$ = SubLFiles.deflexical("S#1917", (SubLObject)((module0018.NIL != Symbols.boundp((SubLObject)module0018.$ic48$)) ? module0018.$g690$.getGlobalValue() : module0018.T));
        module0018.$g691$ = SubLFiles.deflexical("S#1918", (SubLObject)((module0018.NIL != Symbols.boundp((SubLObject)module0018.$ic49$)) ? module0018.$g691$.getGlobalValue() : module0018.NIL));
        module0018.$g692$ = SubLFiles.deflexical("S#1919", (SubLObject)((module0018.NIL != Symbols.boundp((SubLObject)module0018.$ic50$)) ? module0018.$g692$.getGlobalValue() : module0018.$ic47$));
        module0018.$g693$ = SubLFiles.defparameter("S#1920", (SubLObject)module0018.NIL);
        module0018.$g694$ = SubLFiles.defvar("S#1921", (SubLObject)module0018.NIL);
        module0018.$g695$ = SubLFiles.deflexical("*INIT-FILE-LOADED?*", (SubLObject)((module0018.NIL != Symbols.boundp((SubLObject)module0018.$ic51$)) ? module0018.$g695$.getGlobalValue() : module0018.NIL));
        module0018.$g696$ = SubLFiles.defparameter("S#1922", (SubLObject)module0018.NIL);
        module0018.$g697$ = SubLFiles.defparameter("S#1923", (SubLObject)module0018.NIL);
        module0018.$g698$ = SubLFiles.defparameter("*WITHIN-ASK*", (SubLObject)module0018.NIL);
        module0018.$g699$ = SubLFiles.defparameter("S#1924", (SubLObject)module0018.NIL);
        module0018.$g700$ = SubLFiles.defparameter("S#1925", (SubLObject)module0018.T);
        module0018.$g701$ = SubLFiles.defparameter("*CACHE-INFERENCE-RESULTS*", (SubLObject)module0018.NIL);
        module0018.$g702$ = SubLFiles.defparameter("S#1926", (SubLObject)module0018.NIL);
        module0018.$g703$ = SubLFiles.deflexical("S#1927", (SubLObject)((module0018.NIL != Symbols.boundp((SubLObject)module0018.$ic55$)) ? module0018.$g703$.getGlobalValue() : module0018.NIL));
        module0018.$g704$ = SubLFiles.defparameter("S#1928", (SubLObject)module0018.NIL);
        module0018.$g705$ = SubLFiles.defparameter("S#1929", (SubLObject)module0018.T);
        module0018.$g706$ = SubLFiles.deflexical("S#1930", (SubLObject)module0018.$ic56$);
        module0018.$g707$ = SubLFiles.defparameter("S#1931", (SubLObject)module0018.$ic57$);
        module0018.$g708$ = SubLFiles.defparameter("S#1932", (SubLObject)module0018.NIL);
        module0018.$g709$ = SubLFiles.defparameter("S#1933", (SubLObject)module0018.T);
        module0018.$g710$ = SubLFiles.defparameter("S#1934", (SubLObject)module0018.NIL);
        module0018.$g711$ = SubLFiles.defparameter("S#1935", (SubLObject)module0018.T);
        module0018.$g712$ = SubLFiles.defparameter("S#1936", (SubLObject)module0018.T);
        module0018.$g713$ = SubLFiles.defparameter("S#1937", (SubLObject)module0018.NIL);
        module0018.$g714$ = SubLFiles.defparameter("S#1938", (SubLObject)module0018.NIL);
        module0018.$g715$ = SubLFiles.defparameter("S#1939", (SubLObject)module0018.NIL);
        module0018.$g716$ = SubLFiles.defparameter("S#1940", (SubLObject)module0018.NIL);
        module0018.$g717$ = SubLFiles.defparameter("S#1941", (SubLObject)module0018.NIL);
        module0018.$g718$ = SubLFiles.defparameter("S#1942", (SubLObject)module0018.NIL);
        module0018.$g719$ = SubLFiles.defparameter("S#1943", (SubLObject)module0018.NIL);
        module0018.$g720$ = SubLFiles.defparameter("S#1944", (SubLObject)module0018.NIL);
        module0018.$g721$ = SubLFiles.defparameter("S#1945", (SubLObject)module0018.NIL);
        module0018.$g722$ = SubLFiles.defparameter("S#1946", (SubLObject)module0018.NIL);
        module0018.$g723$ = SubLFiles.defparameter("S#1947", (SubLObject)module0018.NIL);
        module0018.$g724$ = SubLFiles.defparameter("S#1948", (SubLObject)module0018.NIL);
        module0018.$g725$ = SubLFiles.deflexical("S#1949", (SubLObject)((module0018.NIL != Symbols.boundp((SubLObject)module0018.$ic72$)) ? module0018.$g725$.getGlobalValue() : module0018.NIL));
        module0018.$g726$ = SubLFiles.deflexical("S#1950", (SubLObject)((module0018.NIL != Symbols.boundp((SubLObject)module0018.$ic73$)) ? module0018.$g726$.getGlobalValue() : module0018.NIL));
        module0018.$g727$ = SubLFiles.deflexical("S#1951", (SubLObject)((module0018.NIL != Symbols.boundp((SubLObject)module0018.$ic74$)) ? module0018.$g727$.getGlobalValue() : module0018.NIL));
        module0018.$g728$ = SubLFiles.deflexical("S#1952", (SubLObject)((module0018.NIL != Symbols.boundp((SubLObject)module0018.$ic75$)) ? module0018.$g728$.getGlobalValue() : module0018.NIL));
        module0018.$g729$ = SubLFiles.defparameter("S#1953", (SubLObject)module0018.NIL);
        module0018.$g730$ = SubLFiles.defparameter("S#1954", (SubLObject)module0018.NIL);
        module0018.$g731$ = SubLFiles.defparameter("S#1955", (SubLObject)module0018.NIL);
        module0018.$g732$ = SubLFiles.defparameter("S#1956", (SubLObject)module0018.NIL);
        module0018.$g733$ = SubLFiles.defparameter("S#1957", (SubLObject)module0018.NIL);
        module0018.$g734$ = SubLFiles.defparameter("S#1958", (SubLObject)module0018.NIL);
        module0018.$g735$ = SubLFiles.defparameter("S#1959", (SubLObject)module0018.NIL);
        module0018.$g736$ = SubLFiles.defparameter("S#1960", (SubLObject)module0018.NIL);
        module0018.$g737$ = SubLFiles.defvar("S#1961", (SubLObject)module0018.NIL);
        module0018.$g738$ = SubLFiles.defparameter("S#1962", (SubLObject)module0018.T);
        module0018.$g739$ = SubLFiles.defparameter("S#1963", (SubLObject)module0018.T);
        module0018.$g740$ = SubLFiles.defvar("S#1964", (SubLObject)module0018.NIL);
        return (SubLObject)module0018.NIL;
    }
    
    public static SubLObject f990() {
        module0003.f57((SubLObject)module0018.$ic0$);
        module0003.f57((SubLObject)module0018.$ic1$);
        module0012.f436((SubLObject)module0018.$ic1$, (SubLObject)module0018.$ic2$);
        module0012.f423((SubLObject)module0018.$ic14$, (SubLObject)module0018.$ic15$, (SubLObject)module0018.$ic16$, (SubLObject)module0018.$ic17$);
        module0012.f423((SubLObject)module0018.$ic18$, (SubLObject)module0018.$ic19$, (SubLObject)module0018.$ic20$, (SubLObject)module0018.$ic21$);
        module0012.f423((SubLObject)module0018.$ic22$, (SubLObject)module0018.$ic23$, (SubLObject)module0018.$ic24$, (SubLObject)module0018.$ic21$);
        module0012.f423((SubLObject)module0018.$ic25$, (SubLObject)module0018.$ic26$, (SubLObject)module0018.$ic27$, (SubLObject)module0018.$ic17$);
        module0003.f57((SubLObject)module0018.$ic37$);
        module0003.f57((SubLObject)module0018.$ic41$);
        module0003.f57((SubLObject)module0018.$ic43$);
        module0003.f57((SubLObject)module0018.$ic46$);
        module0003.f57((SubLObject)module0018.$ic48$);
        module0003.f57((SubLObject)module0018.$ic49$);
        module0003.f57((SubLObject)module0018.$ic50$);
        module0003.f57((SubLObject)module0018.$ic51$);
        module0012.f423((SubLObject)module0018.$ic52$, (SubLObject)module0018.$ic53$, (SubLObject)module0018.$ic54$, (SubLObject)module0018.$ic21$);
        module0003.f57((SubLObject)module0018.$ic55$);
        module0012.f441((SubLObject)module0018.$ic58$);
        module0012.f444((SubLObject)module0018.$ic58$);
        module0012.f441((SubLObject)module0018.$ic62$);
        module0012.f444((SubLObject)module0018.$ic62$);
        module0012.f441((SubLObject)module0018.$ic63$);
        module0012.f444((SubLObject)module0018.$ic63$);
        module0012.f441((SubLObject)module0018.$ic64$);
        module0012.f444((SubLObject)module0018.$ic64$);
        module0012.f441((SubLObject)module0018.$ic65$);
        module0012.f444((SubLObject)module0018.$ic65$);
        module0012.f441((SubLObject)module0018.$ic66$);
        module0012.f444((SubLObject)module0018.$ic66$);
        module0012.f441((SubLObject)module0018.$ic67$);
        module0012.f444((SubLObject)module0018.$ic67$);
        module0012.f441((SubLObject)module0018.$ic68$);
        module0012.f444((SubLObject)module0018.$ic68$);
        module0012.f441((SubLObject)module0018.$ic69$);
        module0012.f444((SubLObject)module0018.$ic69$);
        module0012.f441((SubLObject)module0018.$ic70$);
        module0012.f444((SubLObject)module0018.$ic70$);
        module0012.f441((SubLObject)module0018.$ic71$);
        module0003.f57((SubLObject)module0018.$ic72$);
        module0003.f57((SubLObject)module0018.$ic73$);
        module0003.f57((SubLObject)module0018.$ic74$);
        module0003.f57((SubLObject)module0018.$ic75$);
        return (SubLObject)module0018.NIL;
    }
    
    public void declareFunctions() {
        f988();
    }
    
    public void initializeVariables() {
        f989();
    }
    
    public void runTopLevelForms() {
        f990();
    }
    
    static {
        me = (SubLFile)new module0018();
        module0018.$g571$ = null;
        module0018.$g572$ = null;
        module0018.$g573$ = null;
        module0018.$g574$ = null;
        module0018.$g575$ = null;
        module0018.$g576$ = null;
        module0018.$g577$ = null;
        module0018.$g578$ = null;
        module0018.$g579$ = null;
        module0018.$g580$ = null;
        module0018.$g581$ = null;
        module0018.$g582$ = null;
        module0018.$g583$ = null;
        module0018.$g584$ = null;
        module0018.$g585$ = null;
        module0018.$g586$ = null;
        module0018.$g587$ = null;
        module0018.$g588$ = null;
        module0018.$g589$ = null;
        module0018.$g590$ = null;
        module0018.$g591$ = null;
        module0018.$g592$ = null;
        module0018.$g593$ = null;
        module0018.$g594$ = null;
        module0018.$g595$ = null;
        module0018.$g596$ = null;
        module0018.$g597$ = null;
        module0018.$g598$ = null;
        module0018.$g599$ = null;
        module0018.$g600$ = null;
        module0018.$g601$ = null;
        module0018.$g602$ = null;
        module0018.$g603$ = null;
        module0018.$g604$ = null;
        module0018.$g605$ = null;
        module0018.$g606$ = null;
        module0018.$g607$ = null;
        module0018.$g608$ = null;
        module0018.$g609$ = null;
        module0018.$g610$ = null;
        module0018.$g611$ = null;
        module0018.$g612$ = null;
        module0018.$g613$ = null;
        module0018.$g614$ = null;
        module0018.$g615$ = null;
        module0018.$g616$ = null;
        module0018.$g617$ = null;
        module0018.$g618$ = null;
        module0018.$g619$ = null;
        module0018.$g620$ = null;
        module0018.$g621$ = null;
        module0018.$g622$ = null;
        module0018.$g61$ = null;
        module0018.$g623$ = null;
        module0018.$g624$ = null;
        module0018.$g625$ = null;
        module0018.$g626$ = null;
        module0018.$g627$ = null;
        module0018.$g628$ = null;
        module0018.$g629$ = null;
        module0018.$g630$ = null;
        module0018.$g631$ = null;
        module0018.$g632$ = null;
        module0018.$g633$ = null;
        module0018.$g634$ = null;
        module0018.$g635$ = null;
        module0018.$g636$ = null;
        module0018.$g637$ = null;
        module0018.$g638$ = null;
        module0018.$g639$ = null;
        module0018.$g640$ = null;
        module0018.$g641$ = null;
        module0018.$g642$ = null;
        module0018.$g643$ = null;
        module0018.$g644$ = null;
        module0018.$g645$ = null;
        module0018.$g646$ = null;
        module0018.$g647$ = null;
        module0018.$g648$ = null;
        module0018.$g649$ = null;
        module0018.$g650$ = null;
        module0018.$g651$ = null;
        module0018.$g652$ = null;
        module0018.$g653$ = null;
        module0018.$g654$ = null;
        module0018.$g655$ = null;
        module0018.$g656$ = null;
        module0018.$g657$ = null;
        module0018.$g658$ = null;
        module0018.$g659$ = null;
        module0018.$g660$ = null;
        module0018.$g661$ = null;
        module0018.$g662$ = null;
        module0018.$g663$ = null;
        module0018.$g664$ = null;
        module0018.$g665$ = null;
        module0018.$g666$ = null;
        module0018.$g667$ = null;
        module0018.$g668$ = null;
        module0018.$g669$ = null;
        module0018.$g670$ = null;
        module0018.$g671$ = null;
        module0018.$g672$ = null;
        module0018.$g673$ = null;
        module0018.$g674$ = null;
        module0018.$g675$ = null;
        module0018.$g676$ = null;
        module0018.$g677$ = null;
        module0018.$g678$ = null;
        module0018.$g679$ = null;
        module0018.$g680$ = null;
        module0018.$g681$ = null;
        module0018.$g682$ = null;
        module0018.$g683$ = null;
        module0018.$g684$ = null;
        module0018.$g685$ = null;
        module0018.$g686$ = null;
        module0018.$g687$ = null;
        module0018.$g688$ = null;
        module0018.$g689$ = null;
        module0018.$g690$ = null;
        module0018.$g691$ = null;
        module0018.$g692$ = null;
        module0018.$g693$ = null;
        module0018.$g694$ = null;
        module0018.$g695$ = null;
        module0018.$g696$ = null;
        module0018.$g697$ = null;
        module0018.$g698$ = null;
        module0018.$g699$ = null;
        module0018.$g700$ = null;
        module0018.$g701$ = null;
        module0018.$g702$ = null;
        module0018.$g703$ = null;
        module0018.$g704$ = null;
        module0018.$g705$ = null;
        module0018.$g706$ = null;
        module0018.$g707$ = null;
        module0018.$g708$ = null;
        module0018.$g709$ = null;
        module0018.$g710$ = null;
        module0018.$g711$ = null;
        module0018.$g712$ = null;
        module0018.$g713$ = null;
        module0018.$g714$ = null;
        module0018.$g715$ = null;
        module0018.$g716$ = null;
        module0018.$g717$ = null;
        module0018.$g718$ = null;
        module0018.$g719$ = null;
        module0018.$g720$ = null;
        module0018.$g721$ = null;
        module0018.$g722$ = null;
        module0018.$g723$ = null;
        module0018.$g724$ = null;
        module0018.$g725$ = null;
        module0018.$g726$ = null;
        module0018.$g727$ = null;
        module0018.$g728$ = null;
        module0018.$g729$ = null;
        module0018.$g730$ = null;
        module0018.$g731$ = null;
        module0018.$g732$ = null;
        module0018.$g733$ = null;
        module0018.$g734$ = null;
        module0018.$g735$ = null;
        module0018.$g736$ = null;
        module0018.$g737$ = null;
        module0018.$g738$ = null;
        module0018.$g739$ = null;
        module0018.$g740$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#1804", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#1805", "CYC");
        $ic2$ = SubLObjectFactory.makeString("HL Store Lock");
        $ic3$ = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1805", "CYC"));
        $ic5$ = SubLObjectFactory.makeString("KEYWORD");
        $ic6$ = SubLObjectFactory.makeString("SUBLISP");
        $ic7$ = SubLObjectFactory.makeString("CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic9$ = SubLObjectFactory.makeString("Symbol ~S from package ~S is not visible to SubL.");
        $ic10$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic11$ = SubLObjectFactory.makeString(" ");
        $ic12$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"));
        $ic14$ = SubLObjectFactory.makeSymbol("*HL-FAILURE-BACKCHAINING*");
        $ic15$ = SubLObjectFactory.makeString("Enable HL predicate backchaining");
        $ic16$ = SubLObjectFactory.makeString("This controls whether or not we allow backchaining on those predicates \nwhich have dedicated HL module support, such as #$isa, #$genls and #$equals.");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0018.NIL, (SubLObject)SubLObjectFactory.makeString("No")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0018.T, (SubLObject)SubLObjectFactory.makeString("Yes (expensive)")));
        $ic18$ = SubLObjectFactory.makeSymbol("S#1875", "CYC");
        $ic19$ = SubLObjectFactory.makeString("Enable negation by failure");
        $ic20$ = SubLObjectFactory.makeString("This controls whether or not we allow the inability to prove a proposition to be an\nargument for that proposition not being true.");
        $ic21$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0018.NIL, (SubLObject)SubLObjectFactory.makeString("No")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0018.T, (SubLObject)SubLObjectFactory.makeString("Yes")));
        $ic22$ = SubLObjectFactory.makeSymbol("S#1876", "CYC");
        $ic23$ = SubLObjectFactory.makeString("Enable complete extent minimization");
        $ic24$ = SubLObjectFactory.makeString("This controls whether or not we allow the use of completeness meta-knowledge\nto provide arguments for negated propositions.");
        $ic25$ = SubLObjectFactory.makeSymbol("*UNBOUND-RULE-BACKCHAIN-ENABLED*");
        $ic26$ = SubLObjectFactory.makeString("Enable unbound predicate rule backchaining");
        $ic27$ = SubLObjectFactory.makeString("This controls whether or not we allow backchaining with rules\nthat conclude literals whose predicate position is unbound.\nMany type-level predicates have defining axioms of this form.");
        $ic28$ = SubLObjectFactory.makeInteger(10000);
        $ic29$ = SubLObjectFactory.makeKeyword("HEURISTIC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#1965", "CYC");
        $ic31$ = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $ic32$ = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $ic33$ = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $ic34$ = (SubLFloat)SubLObjectFactory.makeDouble(1.5);
        $ic35$ = SubLObjectFactory.makeInteger(38);
        $ic36$ = SubLObjectFactory.makeInteger(47);
        $ic37$ = SubLObjectFactory.makeSymbol("S#1910", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic39$ = SubLObjectFactory.makeString("UNKNOWN");
        $ic40$ = SubLObjectFactory.makeString("~a-~a-~a");
        $ic41$ = SubLObjectFactory.makeSymbol("S#1914", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic43$ = SubLObjectFactory.makeSymbol("S#1915", "CYC");
        $ic44$ = SubLObjectFactory.makeKeyword("FULL");
        $ic45$ = SubLObjectFactory.makeKeyword("TINY");
        $ic46$ = SubLObjectFactory.makeSymbol("S#1916", "CYC");
        $ic47$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic48$ = SubLObjectFactory.makeSymbol("S#1917", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#1918", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#1919", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("*INIT-FILE-LOADED?*");
        $ic52$ = SubLObjectFactory.makeSymbol("*CACHE-INFERENCE-RESULTS*");
        $ic53$ = SubLObjectFactory.makeString("Cache backward query results");
        $ic54$ = SubLObjectFactory.makeString("This controls whether the results of successful backward queries are cached in the KB.");
        $ic55$ = SubLObjectFactory.makeSymbol("S#1927", "CYC");
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("NL"), (SubLObject)SubLObjectFactory.makeKeyword("FOL"), (SubLObject)SubLObjectFactory.makeKeyword("SILK"));
        $ic57$ = SubLObjectFactory.makeKeyword("CYCL");
        $ic58$ = SubLObjectFactory.makeSymbol("S#1931", "CYC");
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-HALO"), (SubLObject)module0018.T), (SubLObject)ConsesLow.list((SubLObject)module0018.EQ, (SubLObject)SubLObjectFactory.makeKeyword("SILK"), (SubLObject)SubLObjectFactory.makeSymbol("S#1931", "CYC")));
        $ic60$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1802", "CYC"));
        $ic62$ = SubLObjectFactory.makeSymbol("S#1933", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#1934", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#1935", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#1936", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#1937", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#1938", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#1939", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#1940", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#1941", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#1943", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#1949", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#1950", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#1951", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#1952", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0018.class
	Total time: 236 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/