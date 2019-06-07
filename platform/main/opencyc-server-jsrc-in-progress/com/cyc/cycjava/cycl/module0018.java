package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic4$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f953(final SubLObject var6) {
        assert NIL != Types.symbolp(var6) : var6;
        if (var6.isKeyword()) {
            return $g575$.getGlobalValue();
        }
        final SubLObject var7 = Symbols.symbol_package(var6);
        if (NIL == var7) {
            return (SubLObject)NIL;
        }
        final SubLObject var8 = Symbols.symbol_name(var6);
        if (var6.eql(Packages.find_symbol(var8, $g576$.getGlobalValue()))) {
            return $g576$.getGlobalValue();
        }
        if (var6.eql(Packages.find_symbol(var8, $g577$.getGlobalValue()))) {
            return $g577$.getGlobalValue();
        }
        return Errors.error((SubLObject)$ic9$, var6, var7);
    }
    
    public static SubLObject f954(final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = $g606$.getDynamicValue();
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)NIL;
        final SubLObject var13 = var10;
        if (var13.eql((SubLObject)ONE_INTEGER)) {
            final SubLObject var14 = $g607$.currentBinding(var11);
            try {
                $g607$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                $g607$.rebind(var14, var11);
            }
        }
        else if (var13.eql((SubLObject)TWO_INTEGER)) {
            final SubLObject var14 = $g608$.currentBinding(var11);
            try {
                $g608$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                $g608$.rebind(var14, var11);
            }
        }
        else if (var13.eql((SubLObject)THREE_INTEGER)) {
            final SubLObject var14 = $g609$.currentBinding(var11);
            try {
                $g609$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                $g609$.rebind(var14, var11);
            }
        }
        else if (var13.eql((SubLObject)FOUR_INTEGER)) {
            final SubLObject var14 = $g610$.currentBinding(var11);
            try {
                $g610$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                $g610$.rebind(var14, var11);
            }
        }
        else if (var13.eql((SubLObject)FIVE_INTEGER)) {
            final SubLObject var14 = $g611$.currentBinding(var11);
            try {
                $g611$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                $g611$.rebind(var14, var11);
            }
        }
        else if (var13.eql((SubLObject)SIX_INTEGER)) {
            final SubLObject var14 = $g612$.currentBinding(var11);
            try {
                $g612$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                $g612$.rebind(var14, var11);
            }
        }
        else if (var13.eql((SubLObject)SEVEN_INTEGER)) {
            final SubLObject var14 = $g613$.currentBinding(var11);
            try {
                $g613$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                $g613$.rebind(var14, var11);
            }
        }
        else if (var13.eql((SubLObject)EIGHT_INTEGER)) {
            final SubLObject var14 = $g614$.currentBinding(var11);
            try {
                $g614$.bind(var9, var11);
                var12 = f955();
            }
            finally {
                $g614$.rebind(var14, var11);
            }
        }
        return var12;
    }
    
    public static SubLObject f955() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (NIL != module0012.f421($g605$.getDynamicValue(var11))) {
            return (SubLObject)NIL;
        }
        if (NIL != module0012.f421($g608$.getDynamicValue(var11))) {
            return Functions.funcall($g605$.getDynamicValue(var11), $g607$.getDynamicValue(var11));
        }
        if (NIL != module0012.f421($g609$.getDynamicValue(var11))) {
            return Functions.funcall($g605$.getDynamicValue(var11), $g607$.getDynamicValue(var11), $g608$.getDynamicValue(var11));
        }
        if (NIL != module0012.f421($g610$.getDynamicValue(var11))) {
            return Functions.funcall($g605$.getDynamicValue(var11), $g607$.getDynamicValue(var11), $g608$.getDynamicValue(var11), $g609$.getDynamicValue(var11));
        }
        if (NIL != module0012.f421($g611$.getDynamicValue(var11))) {
            return Functions.funcall($g605$.getDynamicValue(var11), $g607$.getDynamicValue(var11), $g608$.getDynamicValue(var11), $g609$.getDynamicValue(var11), $g610$.getDynamicValue(var11));
        }
        if (NIL != module0012.f421($g612$.getDynamicValue(var11))) {
            return Functions.funcall($g605$.getDynamicValue(var11), $g607$.getDynamicValue(var11), $g608$.getDynamicValue(var11), $g609$.getDynamicValue(var11), $g610$.getDynamicValue(var11), $g611$.getDynamicValue(var11));
        }
        if (NIL != module0012.f421($g613$.getDynamicValue(var11))) {
            return Functions.funcall($g605$.getDynamicValue(var11), $g607$.getDynamicValue(var11), $g608$.getDynamicValue(var11), $g609$.getDynamicValue(var11), $g610$.getDynamicValue(var11), $g611$.getDynamicValue(var11), $g612$.getDynamicValue(var11));
        }
        if (NIL != module0012.f421($g614$.getDynamicValue(var11))) {
            return Functions.funcall($g605$.getDynamicValue(var11), new SubLObject[] { $g607$.getDynamicValue(var11), $g608$.getDynamicValue(var11), $g609$.getDynamicValue(var11), $g610$.getDynamicValue(var11), $g611$.getDynamicValue(var11), $g612$.getDynamicValue(var11), $g613$.getDynamicValue(var11) });
        }
        return Functions.funcall($g605$.getDynamicValue(var11), new SubLObject[] { $g607$.getDynamicValue(var11), $g608$.getDynamicValue(var11), $g609$.getDynamicValue(var11), $g610$.getDynamicValue(var11), $g611$.getDynamicValue(var11), $g612$.getDynamicValue(var11), $g613$.getDynamicValue(var11), $g614$.getDynamicValue(var11) });
    }
    
    public static SubLObject f956(final SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (NIL != $g629$.getDynamicValue(var18)) {
            return Errors.error(var15, var16, var17);
        }
        return Errors.warn(var15, var16, var17);
    }
    
    public static SubLObject f957() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return $g631$.getDynamicValue(var11);
    }
    
    public static SubLObject f958(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        return module0004.f104(var18, $g670$.getDynamicValue(var19), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f959() {
        return $g682$.getGlobalValue();
    }
    
    public static SubLObject f960(final SubLObject var19) {
        assert NIL != Types.booleanp(var19) : var19;
        $g682$.setGlobalValue(var19);
        return $g682$.getGlobalValue();
    }
    
    public static SubLObject f961() {
        return $g683$.getGlobalValue();
    }
    
    public static SubLObject f962(final SubLObject var19) {
        assert NIL != Types.booleanp(var19) : var19;
        $g683$.setGlobalValue(var19);
        return $g683$.getGlobalValue();
    }
    
    public static SubLObject f963() {
        return $g684$.getGlobalValue();
    }
    
    public static SubLObject f964(final SubLObject var19) {
        assert NIL != Types.booleanp(var19) : var19;
        $g684$.setGlobalValue(var19);
        return $g684$.getGlobalValue();
    }
    
    public static SubLObject f965() {
        final SubLObject var20 = Strings.string_downcase(module0038.f2622(Environment.get_machine_name((SubLObject)$ic39$), (SubLObject)Characters.CHAR_period), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var21 = Environment.get_process_id((SubLObject)UNPROVIDED);
        final SubLObject var22 = module0051.f3563((SubLObject)UNPROVIDED);
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic40$, new SubLObject[] { var20, var22, var21 });
    }
    
    public static SubLObject f966() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        $g685$.setDynamicValue(f965(), var11);
        return $g685$.getDynamicValue(var11);
    }
    
    public static SubLObject f967() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return $g685$.getDynamicValue(var11);
    }
    
    public static SubLObject f968() {
        return $g686$.getGlobalValue();
    }
    
    public static SubLObject f969(final SubLObject var23) {
        if (NIL != var23 && !areAssertionsDisabledFor(me) && NIL == Types.integerp(var23)) {
            throw new AssertionError(var23);
        }
        $g686$.setGlobalValue(var23);
        return f970(var23);
    }
    
    public static SubLObject f971() {
        return $g687$.getGlobalValue();
    }
    
    public static SubLObject f970(final SubLObject var23) {
        if (NIL != var23 && !areAssertionsDisabledFor(me) && NIL == Types.integerp(var23)) {
            throw new AssertionError(var23);
        }
        $g687$.setGlobalValue(var23);
        return var23;
    }
    
    public static SubLObject f972() {
        return module0035.sublisp_boolean(f971());
    }
    
    public static SubLObject f973() {
        return Numbers.numG(constant_handles_oc.f8433(), (SubLObject)$ic28$);
    }
    
    public static SubLObject f974() {
        if (NIL != f973()) {
            return (SubLObject)$ic44$;
        }
        return (SubLObject)$ic45$;
    }
    
    public static SubLObject f975() {
        return $g688$.getGlobalValue();
    }
    
    public static SubLObject f976() {
        return $g691$.getGlobalValue();
    }
    
    public static SubLObject f977(final SubLObject var19) {
        $g691$.setGlobalValue(var19);
        return $g691$.getGlobalValue();
    }
    
    public static SubLObject f978() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != $g694$.getDynamicValue(var11) && NIL != f973() && NIL != module0004.f105(f971()));
    }
    
    public static SubLObject f979() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return $g698$.getDynamicValue(var11);
    }
    
    public static SubLObject f980() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != $g698$.getDynamicValue(var11) || NIL != $g699$.getDynamicValue(var11));
    }
    
    public static SubLObject f981() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return $g696$.getDynamicValue(var11);
    }
    
    public static SubLObject f982() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return $g697$.getDynamicValue(var11);
    }
    
    public static SubLObject f983() {
        $g703$.setGlobalValue((SubLObject)T);
        return $g703$.getGlobalValue();
    }
    
    public static SubLObject f984() {
        return module0035.sublisp_boolean($g703$.getGlobalValue());
    }
    
    public static SubLObject f985(final SubLObject var24) {
        return module0035.f2169(var24, $g706$.getGlobalValue());
    }
    
    public static SubLObject f986(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        if (NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)NIL);
        }
        return (SubLObject)$ic59$;
    }
    
    public static SubLObject f987(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic60$, (SubLObject)$ic61$, ConsesLow.append(var5, (SubLObject)NIL));
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f989() {
        $g571$ = SubLFiles.defparameter("*READ-REQUIRE-CONSTANT-EXISTS*", (SubLObject)T);
        $g572$ = SubLFiles.deflexical("S#1804", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g572$.getGlobalValue() : NIL));
        $g573$ = SubLFiles.deflexical("S#1805", (NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g573$.getGlobalValue() : Locks.make_lock((SubLObject)$ic2$));
        $g574$ = SubLFiles.defparameter("S#1806", (SubLObject)NIL);
        $g575$ = SubLFiles.deflexical("S#1807", Packages.find_package((SubLObject)$ic5$));
        $g576$ = SubLFiles.deflexical("S#1808", Packages.find_package((SubLObject)$ic6$));
        $g577$ = SubLFiles.deflexical("S#1809", Packages.find_package((SubLObject)$ic7$));
        $g578$ = SubLFiles.defparameter("S#1810", (SubLObject)EQUAL);
        $g579$ = SubLFiles.defparameter("S#1811", (SubLObject)EQUAL);
        $g580$ = SubLFiles.defparameter("S#1812", (SubLObject)EQUAL);
        $g581$ = SubLFiles.defparameter("S#1813", (SubLObject)NIL);
        $g582$ = SubLFiles.defparameter("S#1814", (SubLObject)NIL);
        $g583$ = SubLFiles.defparameter("S#1815", (SubLObject)$ic10$);
        $g584$ = SubLFiles.defparameter("S#1816", (SubLObject)NIL);
        $g585$ = SubLFiles.defparameter("S#1817", (SubLObject)NIL);
        $g586$ = SubLFiles.defparameter("S#1818", (SubLObject)NIL);
        $g587$ = SubLFiles.defparameter("S#1819", (SubLObject)NIL);
        $g588$ = SubLFiles.defparameter("S#1820", (SubLObject)NIL);
        $g589$ = SubLFiles.defparameter("S#1821", (SubLObject)NIL);
        $g590$ = SubLFiles.defparameter("S#1822", (SubLObject)NIL);
        $g591$ = SubLFiles.defparameter("S#1823", (SubLObject)NIL);
        $g592$ = SubLFiles.defparameter("S#1824", (SubLObject)T);
        $g593$ = SubLFiles.defparameter("S#1825", Symbols.symbol_function((SubLObject)EQL));
        $g594$ = SubLFiles.defparameter("S#1826", (SubLObject)NIL);
        $g595$ = SubLFiles.defparameter("S#1827", (SubLObject)NIL);
        $g596$ = SubLFiles.defparameter("S#1828", (SubLObject)NIL);
        $g597$ = SubLFiles.defparameter("S#1829", (SubLObject)NIL);
        $g598$ = SubLFiles.defparameter("S#1830", (SubLObject)NIL);
        $g599$ = SubLFiles.defparameter("S#1831", (SubLObject)NIL);
        $g600$ = SubLFiles.defparameter("S#1832", (SubLObject)NIL);
        $g601$ = SubLFiles.defparameter("S#1833", Symbols.symbol_function((SubLObject)IDENTITY));
        $g602$ = SubLFiles.defparameter("S#1834", (SubLObject)NIL);
        $g603$ = SubLFiles.defparameter("S#1835", (SubLObject)NIL);
        $g604$ = SubLFiles.defparameter("S#1836", (SubLObject)NIL);
        $g605$ = SubLFiles.defparameter("S#1837", module0012.$g49$.getGlobalValue());
        $g606$ = SubLFiles.defparameter("S#1838", (SubLObject)ONE_INTEGER);
        $g607$ = SubLFiles.defparameter("S#1839", module0012.$g49$.getGlobalValue());
        $g608$ = SubLFiles.defparameter("S#1840", module0012.$g49$.getGlobalValue());
        $g609$ = SubLFiles.defparameter("S#1841", module0012.$g49$.getGlobalValue());
        $g610$ = SubLFiles.defparameter("S#1842", module0012.$g49$.getGlobalValue());
        $g611$ = SubLFiles.defparameter("S#1843", module0012.$g49$.getGlobalValue());
        $g612$ = SubLFiles.defparameter("S#1844", module0012.$g49$.getGlobalValue());
        $g613$ = SubLFiles.defparameter("S#1845", module0012.$g49$.getGlobalValue());
        $g614$ = SubLFiles.defparameter("S#1846", module0012.$g49$.getGlobalValue());
        $g615$ = SubLFiles.defparameter("S#1847", (SubLObject)NIL);
        $g616$ = SubLFiles.defparameter("S#1848", (SubLObject)$ic11$);
        $g617$ = SubLFiles.defparameter("*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*", (SubLObject)NIL);
        $g618$ = SubLFiles.defparameter("S#1849", (SubLObject)NIL);
        $g619$ = SubLFiles.defparameter("S#1850", (SubLObject)NIL);
        $g620$ = SubLFiles.defparameter("S#1851", (SubLObject)NIL);
        $g621$ = SubLFiles.defparameter("S#1852", (SubLObject)ZERO_INTEGER);
        $g622$ = SubLFiles.defparameter("S#1853", (SubLObject)NIL);
        $g61$ = SubLFiles.defparameter("S#694", (SubLObject)NIL);
        $g623$ = SubLFiles.defparameter("S#1854", (SubLObject)T);
        $g624$ = SubLFiles.defparameter("S#1855", (SubLObject)T);
        $g625$ = SubLFiles.defparameter("S#1856", (SubLObject)T);
        $g626$ = SubLFiles.defparameter("S#1857", (SubLObject)$ic12$);
        $g627$ = SubLFiles.defparameter("S#1858", (SubLObject)T);
        $g628$ = SubLFiles.defparameter("S#1859", (SubLObject)NIL);
        $g629$ = SubLFiles.defparameter("S#1860", (SubLObject)NIL);
        $g630$ = SubLFiles.defparameter("S#1861", (SubLObject)ZERO_INTEGER);
        $g631$ = SubLFiles.defvar("S#1862", (SubLObject)NIL);
        $g632$ = SubLFiles.defparameter("S#1863", (SubLObject)$ic13$);
        $g633$ = SubLFiles.defparameter("S#1864", (SubLObject)NIL);
        $g634$ = SubLFiles.defparameter("S#1865", (SubLObject)NIL);
        $g635$ = SubLFiles.defparameter("S#1866", (SubLObject)NIL);
        $g636$ = SubLFiles.defparameter("S#1867", (SubLObject)NIL);
        $g637$ = SubLFiles.defparameter("S#1868", (SubLObject)NIL);
        $g638$ = SubLFiles.defparameter("S#1869", (SubLObject)NIL);
        $g639$ = SubLFiles.defparameter("S#1870", (SubLObject)NIL);
        $g640$ = SubLFiles.defparameter("S#1871", (SubLObject)NIL);
        $g641$ = SubLFiles.defparameter("S#1872", (SubLObject)NIL);
        $g642$ = SubLFiles.defparameter("S#1873", (SubLObject)NIL);
        $g643$ = SubLFiles.defparameter("S#1874", (SubLObject)NIL);
        $g644$ = SubLFiles.defparameter("*HL-FAILURE-BACKCHAINING*", (SubLObject)NIL);
        $g645$ = SubLFiles.defparameter("*EVALUATABLE-BACKCHAIN-ENABLED*", (SubLObject)NIL);
        $g646$ = SubLFiles.defparameter("S#1875", (SubLObject)NIL);
        $g647$ = SubLFiles.defparameter("S#1876", (SubLObject)T);
        $g648$ = SubLFiles.defparameter("*UNBOUND-RULE-BACKCHAIN-ENABLED*", (SubLObject)NIL);
        $g649$ = SubLFiles.deflexical("S#1877", (SubLObject)$ic28$);
        $g650$ = SubLFiles.defparameter("S#1878", $g649$.getGlobalValue());
        $g651$ = SubLFiles.defparameter("S#1879", $g649$.getGlobalValue());
        $g652$ = SubLFiles.defparameter("S#1880", (SubLObject)NIL);
        $g653$ = SubLFiles.defparameter("S#1881", (SubLObject)NIL);
        $g654$ = SubLFiles.defparameter("S#1882", (SubLObject)$ic29$);
        $g655$ = SubLFiles.defparameter("S#1883", (SubLObject)T);
        $g656$ = SubLFiles.defparameter("S#1884", (SubLObject)$ic30$);
        $g657$ = SubLFiles.defparameter("S#1885", (SubLObject)$ic31$);
        $g658$ = SubLFiles.defparameter("S#1886", (SubLObject)$ic32$);
        $g659$ = SubLFiles.deflexical("S#1887", (SubLObject)$ic32$);
        $g660$ = SubLFiles.deflexical("S#1888", (SubLObject)$ic33$);
        $g661$ = SubLFiles.deflexical("S#1889", (SubLObject)$ic34$);
        $g662$ = SubLFiles.deflexical("S#1890", $g661$.getGlobalValue());
        $g663$ = SubLFiles.defparameter("S#1891", (SubLObject)NIL);
        $g664$ = SubLFiles.defparameter("S#1892", (SubLObject)$ic35$);
        $g665$ = SubLFiles.defparameter("S#1893", (SubLObject)$ic36$);
        $g666$ = SubLFiles.defparameter("S#1894", (SubLObject)NIL);
        $g667$ = SubLFiles.defparameter("S#1895", (SubLObject)NIL);
        $g668$ = SubLFiles.defparameter("S#1896", (SubLObject)NIL);
        $g669$ = SubLFiles.defparameter("S#1897", (SubLObject)NIL);
        $g670$ = SubLFiles.defparameter("S#1898", (SubLObject)NIL);
        $g671$ = SubLFiles.defparameter("S#1899", (SubLObject)NIL);
        $g672$ = SubLFiles.defparameter("S#1900", (SubLObject)NIL);
        $g673$ = SubLFiles.defparameter("S#1901", (SubLObject)NIL);
        $g674$ = SubLFiles.defparameter("S#1902", (SubLObject)NIL);
        $g675$ = SubLFiles.defparameter("S#1903", (SubLObject)NIL);
        $g676$ = SubLFiles.defparameter("S#1904", (SubLObject)NIL);
        $g677$ = SubLFiles.deflexical("S#1905", (SubLObject)NIL);
        $g678$ = SubLFiles.deflexical("S#1906", (SubLObject)NIL);
        $g679$ = SubLFiles.deflexical("S#1907", (SubLObject)NIL);
        $g680$ = SubLFiles.defparameter("S#1908", (SubLObject)NIL);
        $g681$ = SubLFiles.defparameter("S#1909", (SubLObject)T);
        $g682$ = SubLFiles.deflexical("S#1910", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic37$)) ? $g682$.getGlobalValue() : NIL));
        $g683$ = SubLFiles.deflexical("S#1911", (SubLObject)NIL);
        $g684$ = SubLFiles.deflexical("S#1912", (SubLObject)NIL);
        $g685$ = SubLFiles.defvar("S#1913", (SubLObject)NIL);
        $g686$ = SubLFiles.deflexical("S#1914", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic41$)) ? $g686$.getGlobalValue() : NIL));
        $g687$ = SubLFiles.deflexical("S#1915", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic43$)) ? $g687$.getGlobalValue() : NIL));
        $g688$ = SubLFiles.deflexical("S#1916", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic46$)) ? $g688$.getGlobalValue() : $ic47$));
        $g689$ = SubLFiles.defparameter("*USE-TRANSCRIPT?*", (SubLObject)T);
        $g690$ = SubLFiles.deflexical("S#1917", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic48$)) ? $g690$.getGlobalValue() : T));
        $g691$ = SubLFiles.deflexical("S#1918", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic49$)) ? $g691$.getGlobalValue() : NIL));
        $g692$ = SubLFiles.deflexical("S#1919", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic50$)) ? $g692$.getGlobalValue() : $ic47$));
        $g693$ = SubLFiles.defparameter("S#1920", (SubLObject)NIL);
        $g694$ = SubLFiles.defvar("S#1921", (SubLObject)NIL);
        $g695$ = SubLFiles.deflexical("*INIT-FILE-LOADED?*", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic51$)) ? $g695$.getGlobalValue() : NIL));
        $g696$ = SubLFiles.defparameter("S#1922", (SubLObject)NIL);
        $g697$ = SubLFiles.defparameter("S#1923", (SubLObject)NIL);
        $g698$ = SubLFiles.defparameter("*WITHIN-ASK*", (SubLObject)NIL);
        $g699$ = SubLFiles.defparameter("S#1924", (SubLObject)NIL);
        $g700$ = SubLFiles.defparameter("S#1925", (SubLObject)T);
        $g701$ = SubLFiles.defparameter("*CACHE-INFERENCE-RESULTS*", (SubLObject)NIL);
        $g702$ = SubLFiles.defparameter("S#1926", (SubLObject)NIL);
        $g703$ = SubLFiles.deflexical("S#1927", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic55$)) ? $g703$.getGlobalValue() : NIL));
        $g704$ = SubLFiles.defparameter("S#1928", (SubLObject)NIL);
        $g705$ = SubLFiles.defparameter("S#1929", (SubLObject)T);
        $g706$ = SubLFiles.deflexical("S#1930", (SubLObject)$ic56$);
        $g707$ = SubLFiles.defparameter("S#1931", (SubLObject)$ic57$);
        $g708$ = SubLFiles.defparameter("S#1932", (SubLObject)NIL);
        $g709$ = SubLFiles.defparameter("S#1933", (SubLObject)T);
        $g710$ = SubLFiles.defparameter("S#1934", (SubLObject)NIL);
        $g711$ = SubLFiles.defparameter("S#1935", (SubLObject)T);
        $g712$ = SubLFiles.defparameter("S#1936", (SubLObject)T);
        $g713$ = SubLFiles.defparameter("S#1937", (SubLObject)NIL);
        $g714$ = SubLFiles.defparameter("S#1938", (SubLObject)NIL);
        $g715$ = SubLFiles.defparameter("S#1939", (SubLObject)NIL);
        $g716$ = SubLFiles.defparameter("S#1940", (SubLObject)NIL);
        $g717$ = SubLFiles.defparameter("S#1941", (SubLObject)NIL);
        $g718$ = SubLFiles.defparameter("S#1942", (SubLObject)NIL);
        $g719$ = SubLFiles.defparameter("S#1943", (SubLObject)NIL);
        $g720$ = SubLFiles.defparameter("S#1944", (SubLObject)NIL);
        $g721$ = SubLFiles.defparameter("S#1945", (SubLObject)NIL);
        $g722$ = SubLFiles.defparameter("S#1946", (SubLObject)NIL);
        $g723$ = SubLFiles.defparameter("S#1947", (SubLObject)NIL);
        $g724$ = SubLFiles.defparameter("S#1948", (SubLObject)NIL);
        $g725$ = SubLFiles.deflexical("S#1949", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic72$)) ? $g725$.getGlobalValue() : NIL));
        $g726$ = SubLFiles.deflexical("S#1950", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic73$)) ? $g726$.getGlobalValue() : NIL));
        $g727$ = SubLFiles.deflexical("S#1951", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic74$)) ? $g727$.getGlobalValue() : NIL));
        $g728$ = SubLFiles.deflexical("S#1952", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic75$)) ? $g728$.getGlobalValue() : NIL));
        $g729$ = SubLFiles.defparameter("S#1953", (SubLObject)NIL);
        $g730$ = SubLFiles.defparameter("S#1954", (SubLObject)NIL);
        $g731$ = SubLFiles.defparameter("S#1955", (SubLObject)NIL);
        $g732$ = SubLFiles.defparameter("S#1956", (SubLObject)NIL);
        $g733$ = SubLFiles.defparameter("S#1957", (SubLObject)NIL);
        $g734$ = SubLFiles.defparameter("S#1958", (SubLObject)NIL);
        $g735$ = SubLFiles.defparameter("S#1959", (SubLObject)NIL);
        $g736$ = SubLFiles.defparameter("S#1960", (SubLObject)NIL);
        $g737$ = SubLFiles.defvar("S#1961", (SubLObject)NIL);
        $g738$ = SubLFiles.defparameter("S#1962", (SubLObject)T);
        $g739$ = SubLFiles.defparameter("S#1963", (SubLObject)T);
        $g740$ = SubLFiles.defvar("S#1964", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f990() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic1$);
        module0012.f436((SubLObject)$ic1$, (SubLObject)$ic2$);
        module0012.f423((SubLObject)$ic14$, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)$ic17$);
        module0012.f423((SubLObject)$ic18$, (SubLObject)$ic19$, (SubLObject)$ic20$, (SubLObject)$ic21$);
        module0012.f423((SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)$ic24$, (SubLObject)$ic21$);
        module0012.f423((SubLObject)$ic25$, (SubLObject)$ic26$, (SubLObject)$ic27$, (SubLObject)$ic17$);
        module0003.f57((SubLObject)$ic37$);
        module0003.f57((SubLObject)$ic41$);
        module0003.f57((SubLObject)$ic43$);
        module0003.f57((SubLObject)$ic46$);
        module0003.f57((SubLObject)$ic48$);
        module0003.f57((SubLObject)$ic49$);
        module0003.f57((SubLObject)$ic50$);
        module0003.f57((SubLObject)$ic51$);
        module0012.f423((SubLObject)$ic52$, (SubLObject)$ic53$, (SubLObject)$ic54$, (SubLObject)$ic21$);
        module0003.f57((SubLObject)$ic55$);
        module0012.f441((SubLObject)$ic58$);
        module0012.f444((SubLObject)$ic58$);
        module0012.f441((SubLObject)$ic62$);
        module0012.f444((SubLObject)$ic62$);
        module0012.f441((SubLObject)$ic63$);
        module0012.f444((SubLObject)$ic63$);
        module0012.f441((SubLObject)$ic64$);
        module0012.f444((SubLObject)$ic64$);
        module0012.f441((SubLObject)$ic65$);
        module0012.f444((SubLObject)$ic65$);
        module0012.f441((SubLObject)$ic66$);
        module0012.f444((SubLObject)$ic66$);
        module0012.f441((SubLObject)$ic67$);
        module0012.f444((SubLObject)$ic67$);
        module0012.f441((SubLObject)$ic68$);
        module0012.f444((SubLObject)$ic68$);
        module0012.f441((SubLObject)$ic69$);
        module0012.f444((SubLObject)$ic69$);
        module0012.f441((SubLObject)$ic70$);
        module0012.f444((SubLObject)$ic70$);
        module0012.f441((SubLObject)$ic71$);
        module0003.f57((SubLObject)$ic72$);
        module0003.f57((SubLObject)$ic73$);
        module0003.f57((SubLObject)$ic74$);
        module0003.f57((SubLObject)$ic75$);
        return (SubLObject)NIL;
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
        $g571$ = null;
        $g572$ = null;
        $g573$ = null;
        $g574$ = null;
        $g575$ = null;
        $g576$ = null;
        $g577$ = null;
        $g578$ = null;
        $g579$ = null;
        $g580$ = null;
        $g581$ = null;
        $g582$ = null;
        $g583$ = null;
        $g584$ = null;
        $g585$ = null;
        $g586$ = null;
        $g587$ = null;
        $g588$ = null;
        $g589$ = null;
        $g590$ = null;
        $g591$ = null;
        $g592$ = null;
        $g593$ = null;
        $g594$ = null;
        $g595$ = null;
        $g596$ = null;
        $g597$ = null;
        $g598$ = null;
        $g599$ = null;
        $g600$ = null;
        $g601$ = null;
        $g602$ = null;
        $g603$ = null;
        $g604$ = null;
        $g605$ = null;
        $g606$ = null;
        $g607$ = null;
        $g608$ = null;
        $g609$ = null;
        $g610$ = null;
        $g611$ = null;
        $g612$ = null;
        $g613$ = null;
        $g614$ = null;
        $g615$ = null;
        $g616$ = null;
        $g617$ = null;
        $g618$ = null;
        $g619$ = null;
        $g620$ = null;
        $g621$ = null;
        $g622$ = null;
        $g61$ = null;
        $g623$ = null;
        $g624$ = null;
        $g625$ = null;
        $g626$ = null;
        $g627$ = null;
        $g628$ = null;
        $g629$ = null;
        $g630$ = null;
        $g631$ = null;
        $g632$ = null;
        $g633$ = null;
        $g634$ = null;
        $g635$ = null;
        $g636$ = null;
        $g637$ = null;
        $g638$ = null;
        $g639$ = null;
        $g640$ = null;
        $g641$ = null;
        $g642$ = null;
        $g643$ = null;
        $g644$ = null;
        $g645$ = null;
        $g646$ = null;
        $g647$ = null;
        $g648$ = null;
        $g649$ = null;
        $g650$ = null;
        $g651$ = null;
        $g652$ = null;
        $g653$ = null;
        $g654$ = null;
        $g655$ = null;
        $g656$ = null;
        $g657$ = null;
        $g658$ = null;
        $g659$ = null;
        $g660$ = null;
        $g661$ = null;
        $g662$ = null;
        $g663$ = null;
        $g664$ = null;
        $g665$ = null;
        $g666$ = null;
        $g667$ = null;
        $g668$ = null;
        $g669$ = null;
        $g670$ = null;
        $g671$ = null;
        $g672$ = null;
        $g673$ = null;
        $g674$ = null;
        $g675$ = null;
        $g676$ = null;
        $g677$ = null;
        $g678$ = null;
        $g679$ = null;
        $g680$ = null;
        $g681$ = null;
        $g682$ = null;
        $g683$ = null;
        $g684$ = null;
        $g685$ = null;
        $g686$ = null;
        $g687$ = null;
        $g688$ = null;
        $g689$ = null;
        $g690$ = null;
        $g691$ = null;
        $g692$ = null;
        $g693$ = null;
        $g694$ = null;
        $g695$ = null;
        $g696$ = null;
        $g697$ = null;
        $g698$ = null;
        $g699$ = null;
        $g700$ = null;
        $g701$ = null;
        $g702$ = null;
        $g703$ = null;
        $g704$ = null;
        $g705$ = null;
        $g706$ = null;
        $g707$ = null;
        $g708$ = null;
        $g709$ = null;
        $g710$ = null;
        $g711$ = null;
        $g712$ = null;
        $g713$ = null;
        $g714$ = null;
        $g715$ = null;
        $g716$ = null;
        $g717$ = null;
        $g718$ = null;
        $g719$ = null;
        $g720$ = null;
        $g721$ = null;
        $g722$ = null;
        $g723$ = null;
        $g724$ = null;
        $g725$ = null;
        $g726$ = null;
        $g727$ = null;
        $g728$ = null;
        $g729$ = null;
        $g730$ = null;
        $g731$ = null;
        $g732$ = null;
        $g733$ = null;
        $g734$ = null;
        $g735$ = null;
        $g736$ = null;
        $g737$ = null;
        $g738$ = null;
        $g739$ = null;
        $g740$ = null;
        $ic0$ = makeSymbol("S#1804", "CYC");
        $ic1$ = makeSymbol("S#1805", "CYC");
        $ic2$ = makeString("HL Store Lock");
        $ic3$ = makeSymbol("WITH-LOCK-HELD");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#1805", "CYC"));
        $ic5$ = makeString("KEYWORD");
        $ic6$ = makeString("SUBLISP");
        $ic7$ = makeString("CYC");
        $ic8$ = makeSymbol("SYMBOLP");
        $ic9$ = makeString("Symbol ~S from package ~S is not visible to SubL.");
        $ic10$ = makeKeyword("TRUE");
        $ic11$ = makeString(" ");
        $ic12$ = makeKeyword("FORWARD");
        $ic13$ = ConsesLow.list((SubLObject)makeKeyword("PRODUCTIVITY-LIMIT"), (SubLObject)makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"));
        $ic14$ = makeSymbol("*HL-FAILURE-BACKCHAINING*");
        $ic15$ = makeString("Enable HL predicate backchaining");
        $ic16$ = makeString("This controls whether or not we allow backchaining on those predicates \nwhich have dedicated HL module support, such as #$isa, #$genls and #$equals.");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)NIL, (SubLObject)makeString("No")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)T, (SubLObject)makeString("Yes (expensive)")));
        $ic18$ = makeSymbol("S#1875", "CYC");
        $ic19$ = makeString("Enable negation by failure");
        $ic20$ = makeString("This controls whether or not we allow the inability to prove a proposition to be an\nargument for that proposition not being true.");
        $ic21$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)NIL, (SubLObject)makeString("No")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)T, (SubLObject)makeString("Yes")));
        $ic22$ = makeSymbol("S#1876", "CYC");
        $ic23$ = makeString("Enable complete extent minimization");
        $ic24$ = makeString("This controls whether or not we allow the use of completeness meta-knowledge\nto provide arguments for negated propositions.");
        $ic25$ = makeSymbol("*UNBOUND-RULE-BACKCHAIN-ENABLED*");
        $ic26$ = makeString("Enable unbound predicate rule backchaining");
        $ic27$ = makeString("This controls whether or not we allow backchaining with rules\nthat conclude literals whose predicate position is unbound.\nMany type-level predicates have defining axioms of this form.");
        $ic28$ = makeInteger(10000);
        $ic29$ = makeKeyword("HEURISTIC");
        $ic30$ = makeSymbol("S#1965", "CYC");
        $ic31$ = (SubLFloat)makeDouble(0.1);
        $ic32$ = (SubLFloat)makeDouble(0.5);
        $ic33$ = (SubLFloat)makeDouble(1.0);
        $ic34$ = (SubLFloat)makeDouble(1.5);
        $ic35$ = makeInteger(38);
        $ic36$ = makeInteger(47);
        $ic37$ = makeSymbol("S#1910", "CYC");
        $ic38$ = makeSymbol("BOOLEANP");
        $ic39$ = makeString("UNKNOWN");
        $ic40$ = makeString("~a-~a-~a");
        $ic41$ = makeSymbol("S#1914", "CYC");
        $ic42$ = makeSymbol("INTEGERP");
        $ic43$ = makeSymbol("S#1915", "CYC");
        $ic44$ = makeKeyword("FULL");
        $ic45$ = makeKeyword("TINY");
        $ic46$ = makeSymbol("S#1916", "CYC");
        $ic47$ = makeKeyword("UNKNOWN");
        $ic48$ = makeSymbol("S#1917", "CYC");
        $ic49$ = makeSymbol("S#1918", "CYC");
        $ic50$ = makeSymbol("S#1919", "CYC");
        $ic51$ = makeSymbol("*INIT-FILE-LOADED?*");
        $ic52$ = makeSymbol("*CACHE-INFERENCE-RESULTS*");
        $ic53$ = makeString("Cache backward query results");
        $ic54$ = makeString("This controls whether the results of successful backward queries are cached in the KB.");
        $ic55$ = makeSymbol("S#1927", "CYC");
        $ic56$ = ConsesLow.list((SubLObject)makeKeyword("CYCL"), (SubLObject)makeKeyword("NL"), (SubLObject)makeKeyword("FOL"), (SubLObject)makeKeyword("SILK"));
        $ic57$ = makeKeyword("CYCL");
        $ic58$ = makeSymbol("S#1931", "CYC");
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FWHEN-FEATURE"), (SubLObject)makeKeyword("CYC-HALO"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)EQ, (SubLObject)makeKeyword("SILK"), (SubLObject)makeSymbol("S#1931", "CYC")));
        $ic60$ = makeSymbol("PWHEN");
        $ic61$ = ConsesLow.list((SubLObject)makeSymbol("S#1802", "CYC"));
        $ic62$ = makeSymbol("S#1933", "CYC");
        $ic63$ = makeSymbol("S#1934", "CYC");
        $ic64$ = makeSymbol("S#1935", "CYC");
        $ic65$ = makeSymbol("S#1936", "CYC");
        $ic66$ = makeSymbol("S#1937", "CYC");
        $ic67$ = makeSymbol("S#1938", "CYC");
        $ic68$ = makeSymbol("S#1939", "CYC");
        $ic69$ = makeSymbol("S#1940", "CYC");
        $ic70$ = makeSymbol("S#1941", "CYC");
        $ic71$ = makeSymbol("S#1943", "CYC");
        $ic72$ = makeSymbol("S#1949", "CYC");
        $ic73$ = makeSymbol("S#1950", "CYC");
        $ic74$ = makeSymbol("S#1951", "CYC");
        $ic75$ = makeSymbol("S#1952", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 236 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/