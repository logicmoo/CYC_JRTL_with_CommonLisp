package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0212 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0212";
    public static final String myFingerPrint = "f638860e85631c3b5d26d982ea252abea5b1a446e279416c52a09527dad2532a";
    private static SubLSymbol $g2343$;
    private static SubLSymbol $g2344$;
    private static SubLSymbol $g2345$;
    private static final SubLSymbol $ic0$;
    private static final SubLFloat $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLString $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
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
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    
    
    public static SubLObject f13751(final SubLObject var1) {
        final SubLObject var2 = Numbers.multiply((SubLObject)TEN_INTEGER, var1);
        f13752(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13753() {
        return $g2343$.getGlobalValue();
    }
    
    public static SubLObject f13754(final SubLObject var3) {
        $g2343$.setGlobalValue(var3);
        return var3;
    }
    
    public static SubLObject f13755(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (NIL != var2) {
            return Numbers.round(Numbers.multiply(var2, $g2344$.getGlobalValue()), (SubLObject)UNPROVIDED);
        }
        if (NIL != module0018.f971()) {
            return Numbers.round(Numbers.multiply(assertion_handles_oc.f11019(), $g2344$.getGlobalValue()), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)$ic2$;
    }
    
    public static SubLObject f13752(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = f13755(var2);
        f13754(Hashtables.make_hash_table(var3, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        return $g2343$.getGlobalValue();
    }
    
    public static SubLObject f13756(final SubLObject var5) {
        return Values.values(Hashtables.gethash(var5, $g2343$.getGlobalValue(), f13757()));
    }
    
    public static SubLObject f13758(final SubLObject var5) {
        return Hashtables.remhash(var5, $g2343$.getGlobalValue());
    }
    
    public static SubLObject f13759(final SubLObject var5, final SubLObject var6) {
        if (var6.eql(f13757())) {
            return f13758(var5);
        }
        return Hashtables.sethash(var5, $g2343$.getGlobalValue(), var6);
    }
    
    public static SubLObject f13760() {
        return $g2345$.getGlobalValue();
    }
    
    public static SubLObject f13761(final SubLObject var7) {
        return module0004.f104(var7, $g2345$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13762(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0205.f13155(var7) || NIL != f13763(var7));
    }
    
    public static SubLObject f13763(final SubLObject var7) {
        return module0206.f13478(var7);
    }
    
    public static SubLObject f13764(final SubLObject var7) {
        if (NIL != module0173.f10955(var7)) {
            return module0173.f10969(var7);
        }
        if (NIL != assertion_handles_oc.f11035(var7)) {
            return assertion_handles_oc.f11041(var7, (SubLObject)UNPROVIDED);
        }
        if (NIL != f13763(var7)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13765(final SubLObject var7) {
        if (NIL != module0173.f10955(var7)) {
            return module0173.f10970(var7);
        }
        if (NIL != assertion_handles_oc.f11035(var7)) {
            return assertions_low_oc.f11254(var7);
        }
        if (NIL != f13763(var7)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13766(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f13762(var7) && NIL == f13764(var7));
    }
    
    public static SubLObject f13767(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f13762(var7) && NIL == f13765(var7));
    }
    
    public static SubLObject f13768(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f13762(var7) || NIL != module0161.f10481(var7));
    }
    
    public static SubLObject f13769(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f13762(var7) && NIL == f13761(var7));
    }
    
    public static SubLObject f13770(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f13764(var7) && NIL == f13761(var7));
    }
    
    public static SubLObject f13771(final SubLObject var9, final SubLObject var10) {
        SubLObject var12;
        final SubLObject var11 = var12 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic8$);
        final SubLObject var13 = var12.rest();
        var12 = var12.first();
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic8$);
        var14 = var12.first();
        var12 = var12.rest();
        final SubLObject var15 = (SubLObject)(var12.isCons() ? var12.first() : $ic9$);
        cdestructuring_bind.destructuring_bind_must_listp(var12, var11, (SubLObject)$ic8$);
        var12 = var12.rest();
        if (NIL == var12) {
            final SubLObject var16;
            var12 = (var16 = var13);
            return (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.listS((SubLObject)$ic11$, (SubLObject)ConsesLow.list(var14, var15), ConsesLow.append(var16, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic12$, (SubLObject)ConsesLow.list(var14, var15), ConsesLow.append(var16, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic13$, (SubLObject)ConsesLow.list(var14, (SubLObject)$ic14$, var15), ConsesLow.append(var16, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)$ic8$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13772(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f13773(var7) || NIL != f13774(var7));
    }
    
    public static SubLObject f13775(final SubLObject var7) {
        if (NIL != f13773(var7)) {
            return f13776(var7);
        }
        if (NIL != f13774(var7)) {
            return f13777(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13778(final SubLObject var7) {
        if (NIL != f13773(var7)) {
            return f13779(var7);
        }
        if (NIL != f13774(var7)) {
            return f13780(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13781(final SubLObject var6) {
        if (NIL != f13773(var6)) {
            return f13782(var6);
        }
        return f13783(var6);
    }
    
    public static SubLObject f13784(final SubLObject var6) {
        if (NIL != f13773(var6)) {
            return f13785(var6);
        }
        return f13786(var6);
    }
    
    public static SubLObject f13787(final SubLObject var17) {
        if (NIL != constant_handles_oc.f8449(var17)) {
            if (NIL != constant_handles_oc.f8463(var17, (SubLObject)UNPROVIDED)) {
                return module0165.f10719(var17);
            }
        }
        else if (NIL != module0167.f10813(var17)) {
            if (NIL != module0167.f10824(var17, (SubLObject)UNPROVIDED)) {
                return module0171.f10901(var17);
            }
        }
        else {
            if (NIL != assertion_handles_oc.f11035(var17)) {
                return assertions_low_oc.f11242(var17);
            }
            if (NIL != f13763(var17)) {
                return module0190.f11878(var17);
            }
            if (NIL != module0223.f14667(var17)) {
                return module0223.f14668(var17);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13788(final SubLObject var17) {
        if (NIL != constant_handles_oc.f8449(var17)) {
            if (NIL != constant_handles_oc.f8463(var17, (SubLObject)UNPROVIDED)) {
                return module0165.f10720(var17);
            }
        }
        else if (NIL != module0167.f10813(var17)) {
            if (NIL != module0167.f10824(var17, (SubLObject)UNPROVIDED)) {
                return module0171.f10902(var17);
            }
        }
        else {
            if (NIL != assertion_handles_oc.f11035(var17)) {
                return assertions_low_oc.f11243(var17);
            }
            if (NIL != f13763(var17)) {
                return module0190.f11879(var17);
            }
            if (NIL != module0223.f14667(var17)) {
                return module0223.f14669(var17);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f13789(final SubLObject var17, final SubLObject var6) {
        if (NIL != module0173.f10955(var17)) {
            module0173.f10965(var17, var6);
        }
        else if (NIL == module0161.f10481(var17)) {
            if (NIL != assertion_handles_oc.f11035(var17)) {
                assertions_low_oc.f11244(var17, var6);
            }
            else if (NIL != f13763(var17)) {
                module0190.f11883(var17, var6, (SubLObject)T);
            }
            else if (NIL != module0223.f14667(var17)) {
                module0223.f14670(var17, var6);
            }
            else {
                Errors.error((SubLObject)$ic15$, var17);
            }
        }
        return var17;
    }
    
    public static SubLObject f13790(final SubLObject var17) {
        if (NIL != module0173.f10955(var17)) {
            module0173.f10966(var17);
        }
        else if (NIL == module0161.f10481(var17)) {
            if (NIL != assertion_handles_oc.f11035(var17)) {
                assertions_low_oc.f11245(var17);
            }
            else if (NIL != f13763(var17)) {
                module0190.f11884(var17);
            }
            else if (NIL != module0223.f14667(var17)) {
                module0223.f14671(var17);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13791(final SubLObject var6) {
        if (NIL != f13773(var6)) {
            return f13792(var6);
        }
        if (NIL != f13774(var6)) {
            return f13793(var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13794(final SubLObject var17) {
        f13791(f13787(var17));
        f13789(var17, f13757());
        return var17;
    }
    
    public static SubLObject f13773(final SubLObject var7) {
        return (SubLObject)makeBoolean(var7.isList() && NIL == f13774(var7));
    }
    
    public static SubLObject f13776(final SubLObject var7) {
        return f13773(var7);
    }
    
    public static SubLObject f13779(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f13773(var7) && NIL != module0035.f2370(Symbols.symbol_function((SubLObject)$ic16$), var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f13795(final SubLObject var17) {
        return f13773(f13787(var17));
    }
    
    public static SubLObject f13757() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13782(final SubLObject var18) {
        return var18;
    }
    
    public static SubLObject f13785(final SubLObject var18) {
        return Sequences.length(var18);
    }
    
    public static SubLObject f13796(final SubLObject var18, final SubLObject var19) {
        return module0004.f104(var19, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13797(final SubLObject var17) {
        assert NIL != f13795(var17) : var17;
        return Sequences.length(f13787(var17));
    }
    
    public static SubLObject f13798(final SubLObject var17) {
        assert NIL != f13795(var17) : var17;
        return f13787(var17);
    }
    
    public static SubLObject f13799(final SubLObject var17) {
        return f13798(var17);
    }
    
    public static SubLObject f13800(final SubLObject var17, final SubLObject var18) {
        assert NIL != f13773(var18) : var18;
        return f13789(var17, var18);
    }
    
    public static SubLObject f13801(final SubLObject var18, final SubLObject var19) {
        if (NIL != f13796(var18, var19)) {
            return var18;
        }
        return (SubLObject)ConsesLow.cons(var19, var18);
    }
    
    public static SubLObject f13802(final SubLObject var18, final SubLObject var19) {
        if (NIL != f13796(var18, var19)) {
            return module0035.f2073(var19, var18, (SubLObject)UNPROVIDED);
        }
        return var18;
    }
    
    public static SubLObject f13792(final SubLObject var18) {
        return var18;
    }
    
    public static SubLObject f13774(final SubLObject var7) {
        return f13803(var7);
    }
    
    public static SubLObject f13777(final SubLObject var7) {
        return f13804(var7);
    }
    
    public static SubLObject f13780(final SubLObject var7) {
        return f13805(var7);
    }
    
    public static SubLObject f13806(final SubLObject var17) {
        return f13774(f13787(var17));
    }
    
    public static SubLObject f13783(final SubLObject var20) {
        return f13807(var20);
    }
    
    public static SubLObject f13786(final SubLObject var20) {
        return f13808(var20);
    }
    
    public static SubLObject f13809(final SubLObject var20, final SubLObject var21) {
        return f13810(var20, var21);
    }
    
    public static SubLObject f13811(final SubLObject var17, final SubLObject var21) {
        final SubLObject var22 = f13787(var17);
        if (NIL == var22) {
            return (SubLObject)NIL;
        }
        assert NIL != f13774(var22) : var22;
        return f13809(var22, var21);
    }
    
    public static SubLObject f13812(final SubLObject var17) {
        return f13813(var17);
    }
    
    public static SubLObject f13814(final SubLObject var17, final SubLObject var21, final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var23) && NIL != var22 && NIL == f13803(var22)) {
            Errors.error((SubLObject)$ic22$, var22);
        }
        final SubLObject var24 = f13787(var17);
        if (NIL != var22 && !areAssertionsDisabledFor(me) && NIL == f13815(var24)) {
            throw new AssertionError(var24);
        }
        if (NIL != var24) {
            f13816(var24, var21, var22);
        }
        return var22;
    }
    
    public static SubLObject f13817(final SubLObject var17, final SubLObject var21) {
        final SubLObject var22 = f13787(var17);
        if (NIL != var22) {
            f13818(var22, var21);
        }
        return var17;
    }
    
    public static SubLObject f13793(final SubLObject var20) {
        return f13819(var20);
    }
    
    public static SubLObject f13803(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f13815(var7) || NIL != f13820(var7));
    }
    
    public static SubLObject f13804(final SubLObject var7) {
        if (NIL != f13815(var7)) {
            return f13821(var7);
        }
        if (NIL != f13820(var7)) {
            return f13822(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13805(final SubLObject var7) {
        if (NIL != f13815(var7)) {
            return f13823(var7);
        }
        if (NIL != f13820(var7)) {
            return f13824(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13810(final SubLObject var24, final SubLObject var21) {
        if (NIL != f13815(var24)) {
            return f13825(var24, var21);
        }
        if (NIL != f13826(var24, var21)) {
            return var21;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13807(final SubLObject var24) {
        if (NIL != f13815(var24)) {
            return f13827(var24);
        }
        return f13828(var24);
    }
    
    public static SubLObject f13808(final SubLObject var24) {
        if (NIL != f13815(var24)) {
            return f13829(var24);
        }
        return f13830(var24);
    }
    
    public static SubLObject f13813(final SubLObject var17) {
        return f13831(var17);
    }
    
    public static SubLObject f13819(final SubLObject var24) {
        if (NIL != f13815(var24)) {
            return f13832(var24);
        }
        if (NIL != f13820(var24)) {
            return f13833(var24);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13815(final SubLObject var7) {
        return (SubLObject)makeBoolean(var7.isCons() && var7.first().isInteger() && NIL != module0067.f4852(var7.rest()));
    }
    
    public static SubLObject f13821(final SubLObject var7) {
        if (NIL == f13815(var7)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f13823(final SubLObject var7) {
        if (NIL == f13815(var7)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f13834(final SubLObject var25) {
        return (SubLObject)ConsesLow.cons((SubLObject)ZERO_INTEGER, module0067.f4880(var25, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f13835(final SubLObject var9, final SubLObject var10) {
        SubLObject var12;
        final SubLObject var11 = var12 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic24$);
        final SubLObject var13 = var12.rest();
        var12 = var12.first();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic24$);
        var14 = var12.first();
        var12 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic24$);
        var15 = var12.first();
        var12 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic24$);
        var16 = var12.first();
        var12 = var12.rest();
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = var12;
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var35_36 = (SubLObject)NIL;
        while (NIL != var18) {
            cdestructuring_bind.destructuring_bind_must_consp(var18, var11, (SubLObject)$ic24$);
            var35_36 = var18.first();
            var18 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var11, (SubLObject)$ic24$);
            if (NIL == conses_high.member(var35_36, (SubLObject)$ic25$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var19 = (SubLObject)T;
            }
            if (var35_36 == $ic26$) {
                var17 = var18.first();
            }
            var18 = var18.rest();
        }
        if (NIL != var19 && NIL == var17) {
            cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)$ic24$);
        }
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic27$, var12);
        final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : NIL);
        final SubLObject var22;
        var12 = (var22 = var13);
        final SubLObject var23 = (SubLObject)$ic28$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var23, var16)), (SubLObject)ConsesLow.list((SubLObject)$ic30$, (SubLObject)ConsesLow.list((SubLObject)$ic31$, var23), (SubLObject)ConsesLow.listS((SubLObject)$ic32$, (SubLObject)ConsesLow.list(var14, var15, (SubLObject)ConsesLow.list((SubLObject)$ic33$, var23), var21), ConsesLow.append(var22, (SubLObject)NIL))));
    }
    
    public static SubLObject f13836(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != var7);
    }
    
    public static SubLObject f13825(final SubLObject var31, final SubLObject var21) {
        assert NIL != f13815(var31) : var31;
        final SubLObject var32 = f13837(var31);
        return module0067.f4885(var32, var21, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13838(final SubLObject var31) {
        assert NIL != f13815(var31) : var31;
        return module0067.f4902(f13837(var31));
    }
    
    public static SubLObject f13829(final SubLObject var31) {
        assert NIL != f13815(var31) : var31;
        return var31.first();
    }
    
    public static SubLObject f13827(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert NIL != f13815(var31) : var31;
        SubLObject var33 = (SubLObject)NIL;
        if (NIL != f13836(var31)) {
            SubLObject var34;
            for (var34 = module0066.f4838(module0067.f4891(f13837(var31))); NIL == module0066.f4841(var34); var34 = module0066.f4840(var34)) {
                var32.resetMultipleValues();
                final SubLObject var35 = module0066.f4839(var34);
                final SubLObject var36 = var32.secondMultipleValue();
                var32.resetMultipleValues();
                SubLObject var37 = f13807(var36);
                SubLObject var38 = (SubLObject)NIL;
                var38 = var37.first();
                while (NIL != var37) {
                    var33 = (SubLObject)ConsesLow.cons(var38, var33);
                    var37 = var37.rest();
                    var38 = var37.first();
                }
            }
            module0066.f4842(var34);
        }
        return Sequences.nreverse(var33);
    }
    
    public static SubLObject f13816(final SubLObject var31, final SubLObject var21, final SubLObject var22) {
        assert NIL != f13803(var22) : var22;
        f13839(var31, var21, var22);
        return var31;
    }
    
    public static SubLObject f13840(final SubLObject var31, final SubLObject var44, final SubLObject var19) {
        assert NIL != f13815(var31) : var31;
        return f13841(var31, var44, var19, (SubLObject)NIL);
    }
    
    public static SubLObject f13841(final SubLObject var31, final SubLObject var44, final SubLObject var19, final SubLObject var45) {
        SubLObject var46 = (SubLObject)NIL;
        SubLObject var47 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var44, var44, (SubLObject)$ic36$);
        var46 = var44.first();
        final SubLObject var48 = var47 = var44.rest();
        if (NIL != var47) {
            final SubLObject var49 = ConsesLow.nconc(var45, (SubLObject)ConsesLow.list(var46));
            final SubLObject var50 = f13842(var31, var46, var49);
            if (NIL != f13841(var50, var47, var19, var49)) {
                f13843(var31, (SubLObject)ONE_INTEGER);
                return (SubLObject)T;
            }
        }
        else {
            final SubLObject var51 = f13844(var31, var46);
            assert NIL != f13820(var51) : var51;
            final SubLObject var52 = f13830(var51);
            f13845(var51, var19);
            final SubLObject var53 = f13830(var51);
            if (!var52.numE(var53)) {
                f13843(var31, (SubLObject)ONE_INTEGER);
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13846(final SubLObject var31, final SubLObject var44, final SubLObject var19) {
        assert NIL != f13815(var31) : var31;
        SubLObject var45 = (SubLObject)NIL;
        SubLObject var46 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var44, var44, (SubLObject)$ic36$);
        var45 = var44.first();
        final SubLObject var47 = var46 = var44.rest();
        SubLObject var48 = (SubLObject)NIL;
        final SubLObject var49 = f13825(var31, var45);
        if (NIL != var49) {
            if (NIL != var46) {
                var48 = f13846(var49, var46, var19);
                if (NIL != var48) {
                    f13843(var31, (SubLObject)MINUS_ONE_INTEGER);
                }
            }
            else {
                assert NIL != f13820(var49) : var49;
                final SubLObject var50 = f13830(var49);
                f13847(var49, var19);
                final SubLObject var51 = f13830(var49);
                if (!var50.numE(var51)) {
                    f13843(var31, (SubLObject)MINUS_ONE_INTEGER);
                    var48 = (SubLObject)T;
                }
            }
            if (ZERO_INTEGER.numE(f13808(var49))) {
                f13818(var31, var45);
            }
        }
        return var48;
    }
    
    public static SubLObject f13818(final SubLObject var31, final SubLObject var21) {
        f13848(var31, var21);
        return var31;
    }
    
    public static SubLObject f13831(final SubLObject var17) {
        return f13789(var17, f13834(Symbols.symbol_function((SubLObject)EQ)));
    }
    
    public static SubLObject f13832(final SubLObject var31) {
        return module0067.f4881(f13837(var31));
    }
    
    public static SubLObject f13849(final SubLObject var31, final SubLObject var51) {
        return ConsesLow.rplaca(var31, var51);
    }
    
    public static SubLObject f13843(final SubLObject var31, final SubLObject var55) {
        final SubLObject var56 = f13829(var31);
        final SubLObject var57 = Numbers.add(var56, var55);
        f13849(var31, var57);
        return var31;
    }
    
    public static SubLObject f13842(final SubLObject var31, final SubLObject var21, final SubLObject var45) {
        assert NIL != f13815(var31) : var31;
        final SubLObject var46 = f13825(var31, var21);
        if (NIL != var46) {
            return var46;
        }
        final SubLObject var47 = module0215.f14163(var45);
        final SubLObject var48 = f13834(var47);
        f13816(var31, var21, var48);
        return var48;
    }
    
    public static SubLObject f13844(final SubLObject var31, final SubLObject var21) {
        assert NIL != f13815(var31) : var31;
        SubLObject var32 = f13825(var31, var21);
        if (NIL != var32) {
            return var32;
        }
        var32 = f13850();
        f13816(var31, var21, var32);
        return var32;
    }
    
    public static SubLObject f13837(final SubLObject var31) {
        return var31.rest();
    }
    
    public static SubLObject f13839(final SubLObject var31, final SubLObject var21, final SubLObject var22) {
        assert NIL != f13803(var22) : var22;
        return module0067.f4886(f13837(var31), var21, var22);
    }
    
    public static SubLObject f13848(final SubLObject var31, final SubLObject var21) {
        return module0067.f4887(f13837(var31), var21);
    }
    
    public static SubLObject f13820(final SubLObject var7) {
        return module0077.f5302(var7);
    }
    
    public static SubLObject f13822(final SubLObject var7) {
        return f13820(var7);
    }
    
    public static SubLObject f13824(final SubLObject var7) {
        return f13820(var7);
    }
    
    public static SubLObject f13850() {
        return module0077.f5313((SubLObject)EQL, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13851(final SubLObject var9, final SubLObject var10) {
        SubLObject var12;
        final SubLObject var11 = var12 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic38$);
        final SubLObject var13 = var12.rest();
        var12 = var12.first();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic38$);
        var14 = var12.first();
        var12 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic38$);
        var15 = var12.first();
        var12 = var12.rest();
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = var12;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var65_66 = (SubLObject)NIL;
        while (NIL != var17) {
            cdestructuring_bind.destructuring_bind_must_consp(var17, var11, (SubLObject)$ic38$);
            var65_66 = var17.first();
            var17 = var17.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var17, var11, (SubLObject)$ic38$);
            if (NIL == conses_high.member(var65_66, (SubLObject)$ic25$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var18 = (SubLObject)T;
            }
            if (var65_66 == $ic26$) {
                var16 = var17.first();
            }
            var17 = var17.rest();
        }
        if (NIL != var18 && NIL == var16) {
            cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)$ic38$);
        }
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic27$, var12);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : NIL);
        final SubLObject var21;
        var12 = (var21 = var13);
        final SubLObject var22 = (SubLObject)$ic39$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var22, var15)), (SubLObject)ConsesLow.list((SubLObject)$ic30$, (SubLObject)ConsesLow.list((SubLObject)$ic40$, var22), (SubLObject)ConsesLow.listS((SubLObject)$ic41$, (SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var22), (SubLObject)$ic27$, var20), ConsesLow.append(var21, (SubLObject)NIL))));
    }
    
    public static SubLObject f13852(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != var7);
    }
    
    public static SubLObject f13830(final SubLObject var61) {
        return module0077.f5311(f13853(var61));
    }
    
    public static SubLObject f13828(final SubLObject var61) {
        return module0077.f5312(f13853(var61));
    }
    
    public static SubLObject f13826(final SubLObject var61, final SubLObject var19) {
        return module0077.f5320(var19, f13853(var61));
    }
    
    public static SubLObject f13854(final SubLObject var61) {
        return module0078.f5343(f13853(var61));
    }
    
    public static SubLObject f13855(final SubLObject var61, final SubLObject var68) {
        final SubLObject var69 = f13853(var61);
        module0077.f5328(var69);
        SubLObject var70 = var68;
        SubLObject var71 = (SubLObject)NIL;
        var71 = var70.first();
        while (NIL != var70) {
            module0077.f5326(var71, var69);
            var70 = var70.rest();
            var71 = var70.first();
        }
        return var61;
    }
    
    public static SubLObject f13845(final SubLObject var61, final SubLObject var19) {
        module0077.f5326(var19, f13853(var61));
        return var61;
    }
    
    public static SubLObject f13847(final SubLObject var61, final SubLObject var19) {
        module0077.f5327(var19, f13853(var61));
        return var61;
    }
    
    public static SubLObject f13833(final SubLObject var61) {
        return var61;
    }
    
    public static SubLObject f13853(final SubLObject var61) {
        return var61;
    }
    
    public static SubLObject f13856(final SubLObject var7) {
        return assertion_handles_oc.f11035(var7);
    }
    
    public static SubLObject f13857(final SubLObject var7) {
        return module0178.f11361(var7, (SubLObject)NIL);
    }
    
    public static SubLObject f13858(final SubLObject var7) {
        return module0178.f11361(var7, (SubLObject)T);
    }
    
    public static SubLObject f13859() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13751", "S#16588", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13753", "S#16589", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13754", "S#16590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13755", "S#16591", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13752", "S#16592", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13756", "S#13962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13758", "S#13963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13759", "S#13964", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13760", "S#16593", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13761", "S#16594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13762", "INDEXED-TERM-P", 1, 0, false);
        new $f13762$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13763", "S#14625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13764", "S#16595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13765", "S#16596", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13766", "S#14187", 1, 0, false);
        new $f13766$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13767", "S#16597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13768", "S#16598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13769", "S#13258", 1, 0, false);
        new $f13769$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13770", "S#16599", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0212", "f13771", "DO-INDEXED-TERMS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13772", "S#16600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13775", "S#10523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13778", "S#16601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13781", "S#16602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13784", "S#16603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13787", "TERM-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13788", "S#16604", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13789", "S#16605", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13790", "S#16606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13791", "S#16607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13794", "S#10530", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13773", "SIMPLE-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13776", "S#16608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13779", "S#16609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13795", "SIMPLE-INDEXED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13757", "S#13753", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13782", "S#16610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13785", "S#16611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13796", "S#16612", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13797", "S#16613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13798", "S#12745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13799", "S#13094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13800", "S#16614", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13801", "S#16615", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13802", "S#16616", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13792", "S#16617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13774", "COMPLEX-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13777", "S#16618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13780", "S#16619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13806", "COMPLEX-INDEXED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13783", "S#16620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13786", "S#16621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13809", "S#16622", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13811", "S#16623", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13812", "S#16624", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13814", "S#16625", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13817", "S#16626", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13793", "S#16627", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13803", "SUBINDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13804", "S#16628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13805", "S#16629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13810", "S#16630", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13807", "SUBINDEX-LEAVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13808", "SUBINDEX-LEAF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13813", "S#16631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13819", "S#16632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13815", "INTERMEDIATE-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13821", "S#16633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13823", "S#16634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13834", "S#16635", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0212", "f13835", "DO-INTERMEDIATE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13836", "S#16636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13825", "INTERMEDIATE-INDEX-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13838", "INTERMEDIATE-INDEX-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13829", "S#16637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13827", "S#16638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13816", "S#16639", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13840", "S#16640", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13841", "S#16641", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13846", "S#16642", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13818", "S#16643", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13831", "S#16644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13832", "S#16645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13849", "S#16646", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13843", "S#16647", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13842", "S#16648", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13844", "S#16649", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13837", "S#16650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13839", "S#16651", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13848", "S#16652", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13820", "S#12743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13822", "S#16653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13824", "S#16654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13850", "S#16655", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0212", "f13851", "S#16656");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13852", "S#16657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13830", "S#16658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13828", "S#16659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13826", "S#16660", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13854", "S#16661", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13855", "S#16662", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13845", "S#16663", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13847", "S#16664", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13833", "S#16665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13853", "S#16666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13856", "S#16667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13857", "S#16668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0212", "f13858", "S#16669", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13860() {
        $g2343$ = SubLFiles.deflexical("S#16670", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2343$.getGlobalValue() : NIL));
        $g2344$ = SubLFiles.deflexical("S#16671", (SubLObject)$ic1$);
        $g2345$ = SubLFiles.deflexical("S#16672", (SubLObject)$ic3$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13861() {
        module0003.f57((SubLObject)$ic0$);
        module0012.f368((SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)NIL, (SubLObject)$ic7$);
        module0002.f50((SubLObject)$ic18$, (SubLObject)$ic19$);
        module0002.f50((SubLObject)$ic31$, (SubLObject)$ic34$);
        module0002.f50((SubLObject)$ic33$, (SubLObject)$ic34$);
        module0002.f50((SubLObject)$ic40$, (SubLObject)$ic43$);
        module0002.f50((SubLObject)$ic42$, (SubLObject)$ic43$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f13859();
    }
    
    public void initializeVariables() {
        f13860();
    }
    
    public void runTopLevelForms() {
        f13861();
    }
    
    static {
        me = (SubLFile)new module0212();
        $g2343$ = null;
        $g2344$ = null;
        $g2345$ = null;
        $ic0$ = makeSymbol("S#16670", "CYC");
        $ic1$ = (SubLFloat)makeDouble(0.015);
        $ic2$ = makeInteger(64);
        $ic3$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), constant_handles_oc.f8479((SubLObject)makeString("and")), constant_handles_oc.f8479((SubLObject)makeString("or")), constant_handles_oc.f8479((SubLObject)makeString("not")));
        $ic4$ = makeSymbol("INDEXED-TERM-P");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"));
        $ic6$ = makeString("Returns T iff OBJECT is an indexed CycL term, e.g. a fort or assertion.");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#295", "CYC"), (SubLObject)makeString("mapping Cyc indexed terms"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic9$ = makeString("mapping Cyc indexed terms");
        $ic10$ = makeSymbol("PROGN");
        $ic11$ = makeSymbol("DO-FORTS");
        $ic12$ = makeSymbol("DO-ASSERTIONS");
        $ic13$ = makeSymbol("S#14631", "CYC");
        $ic14$ = makeKeyword("PROGRESS-MESSAGE");
        $ic15$ = makeString("~S is not indexed");
        $ic16$ = makeSymbol("S#16668", "CYC");
        $ic17$ = makeSymbol("SIMPLE-INDEXED-TERM-P");
        $ic18$ = makeSymbol("S#13094", "CYC");
        $ic19$ = makeSymbol("S#12772", "CYC");
        $ic20$ = makeSymbol("SIMPLE-INDEX-P");
        $ic21$ = makeSymbol("COMPLEX-INDEX-P");
        $ic22$ = makeString("~s is not a SUBINDEX-P");
        $ic23$ = makeSymbol("INTERMEDIATE-INDEX-P");
        $ic24$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#148", "CYC"), (SubLObject)makeSymbol("S#16673", "CYC"), (SubLObject)makeSymbol("S#16674", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic25$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic26$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic27$ = makeKeyword("DONE");
        $ic28$ = makeUninternedSymbol("US#13A64D7");
        $ic29$ = makeSymbol("CLET");
        $ic30$ = makeSymbol("PWHEN");
        $ic31$ = makeSymbol("S#16636", "CYC");
        $ic32$ = makeSymbol("DO-DICTIONARY");
        $ic33$ = makeSymbol("S#16650", "CYC");
        $ic34$ = makeSymbol("DO-INTERMEDIATE-INDEX");
        $ic35$ = makeSymbol("SUBINDEX-P");
        $ic36$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#5234", "CYC"));
        $ic37$ = makeSymbol("S#12743", "CYC");
        $ic38$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3841", "CYC"), (SubLObject)makeSymbol("S#16675", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic39$ = makeUninternedSymbol("US#13A64D7");
        $ic40$ = makeSymbol("S#16657", "CYC");
        $ic41$ = makeSymbol("S#708", "CYC");
        $ic42$ = makeSymbol("S#16666", "CYC");
        $ic43$ = makeSymbol("S#16656", "CYC");
    }
    
    public static final class $f13762$UnaryFunction extends UnaryFunction
    {
        public $f13762$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INDEXED-TERM-P"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f13762(var8);
        }
    }
    
    public static final class $f13766$UnaryFunction extends UnaryFunction
    {
        public $f13766$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14187"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f13766(var8);
        }
    }
    
    public static final class $f13769$UnaryFunction extends UnaryFunction
    {
        public $f13769$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13258"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f13769(var8);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 247 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/