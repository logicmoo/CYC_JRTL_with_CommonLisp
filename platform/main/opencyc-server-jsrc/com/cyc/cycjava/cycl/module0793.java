package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0793 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0793";
    public static final String myFingerPrint = "57e0dec36048cb0a66539a0adae0e3e07a227455c224a73cb37750ef3ea62323";
    public static SubLSymbol $g6345$;
    private static SubLSymbol $g6346$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLInteger $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    
    public static SubLObject f50749() {
        final SubLObject var1 = $g6346$.getGlobalValue();
        if (NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50750(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)$ic0$;
        }
        return module0034.f1829($g6346$.getGlobalValue(), (SubLObject)ConsesLow.list(var2, var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50751(final SubLObject var2, final SubLObject var3) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var2) && NIL != ((var3 == $ic0$) ? module0256.f16598(var2, $ic2$) : module0256.f16576(var2, $ic2$, var3, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f50752(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)$ic0$;
        }
        SubLObject var4 = $g6346$.getGlobalValue();
        if (NIL == var4) {
            var4 = module0034.f1934((SubLObject)$ic1$, (SubLObject)$ic3$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)TWO_INTEGER, (SubLObject)$ic4$);
        }
        final SubLObject var5 = module0034.f1782(var2, var3);
        final SubLObject var6 = module0034.f1814(var4, var5, (SubLObject)UNPROVIDED);
        if (var6 != $ic5$) {
            SubLObject var7 = var6;
            SubLObject var8 = (SubLObject)NIL;
            var8 = var7.first();
            while (NIL != var7) {
                SubLObject var9 = var8.first();
                final SubLObject var10 = conses_high.second(var8);
                if (var2.eql(var9.first())) {
                    var9 = var9.rest();
                    if (NIL != var9 && NIL == var9.rest() && var3.eql(var9.first())) {
                        return module0034.f1959(var10);
                    }
                }
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        final SubLObject var11 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50751(var2, var3)));
        module0034.f1836(var4, var5, var6, var11, (SubLObject)ConsesLow.list(var2, var3));
        return module0034.f1959(var11);
    }
    
    public static SubLObject f50753(final SubLObject var12) {
        return (SubLObject)makeBoolean(var12.isList() && NIL != f50752(var12.first(), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f50754(final SubLObject var12) {
        if (NIL != f50753(var12)) {
            return var12.first();
        }
        if (var12.first().eql($ic6$)) {
            return conses_high.second(var12);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50755(final SubLObject var12) {
        return (SubLObject)makeBoolean(var12.isList() && NIL != module0173.f10955(var12.first()) && NIL != module0731.f44656(var12.first(), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f50756(final SubLObject var12) {
        return (SubLObject)makeBoolean(var12.isList() && NIL != module0173.f10955(var12.first()) && NIL != module0584.f35801(var12.first()));
    }
    
    public static SubLObject f50757(final SubLObject var12) {
        return (SubLObject)makeBoolean(var12.isList() && var12.first().eql($ic7$));
    }
    
    public static SubLObject f50758(final SubLObject var12) {
        if (var12.isList() && NIL != module0173.f10955(var12.first())) {
            return module0731.f44764(f50759(var12), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50760(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != f50758(var12) && NIL != module0731.f44656(f50761(var12), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f50762(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != f50758(var12) && NIL != module0731.f44690(f50761(var12), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f50759(final SubLObject var12) {
        if (var12.first().eql($ic8$)) {
            return conses_high.second(var12);
        }
        return var12.first();
    }
    
    public static SubLObject f50761(final SubLObject var12) {
        if (var12.first().eql($ic8$)) {
            return conses_high.third(var12);
        }
        return conses_high.second(var12);
    }
    
    public static SubLObject f50763(final SubLObject var13, final SubLObject var14) {
        return (SubLObject)ConsesLow.list($ic8$, var13, var14);
    }
    
    public static SubLObject f50764(final SubLObject var12) {
        return (SubLObject)makeBoolean(var12.isList() && (var12.first() == $ic9$ || var12.first().eql($ic10$)));
    }
    
    public static SubLObject f50765(final SubLObject var12) {
        return (SubLObject)makeBoolean(var12.isList() && var12.first().eql($ic11$));
    }
    
    public static SubLObject f50766(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != f50767(var12) || NIL != f50768(var12));
    }
    
    public static SubLObject f50768(final SubLObject var12) {
        return (SubLObject)makeBoolean(var12.isList() && (var12.first() == $ic12$ || var12.first().eql($ic13$)));
    }
    
    public static SubLObject f50767(final SubLObject var12) {
        return (SubLObject)makeBoolean(var12.isList() && var12.first().eql($ic14$));
    }
    
    public static SubLObject f50769(final SubLObject var12) {
        return (SubLObject)makeBoolean(var12.isList() && NIL != conses_high.member(var12.first(), (SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f50770(final SubLObject var12) {
        if (var12.isList() && NIL != conses_high.member(var12.first(), (SubLObject)$ic16$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return var12.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50771(final SubLObject var12) {
        return (SubLObject)makeBoolean(var12.isCons() && (var12.first().eql($ic17$) || var12.first().eql($ic18$) || var12.first() == $ic19$));
    }
    
    public static SubLObject f50772(final SubLObject var2) {
        return Types.stringp(var2);
    }
    
    public static SubLObject f50773(final SubLObject var15) {
        return var15;
    }
    
    public static SubLObject f50774(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.isList() && (var2.first().eql($ic17$) || var2.first().eql($ic18$) || var2.first() == $ic19$));
    }
    
    public static SubLObject f50775(final SubLObject var2) {
        if (NIL != f50774(var2)) {
            return var2.rest();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50776(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.isCons() && (var2.first().eql($ic20$) || var2.first().eql($ic21$) || var2.first().eql($ic22$) || var2.first().eql($ic23$)));
    }
    
    public static SubLObject f50777(final SubLObject var16) {
        if (NIL == module0035.f2014(var16)) {
            return (SubLObject)NIL;
        }
        SubLObject var17 = (SubLObject)NIL;
        if (NIL == var17) {
            SubLObject var18 = var16;
            SubLObject var19 = (SubLObject)NIL;
            var19 = var18.first();
            while (NIL == var17 && NIL != var18) {
                if (!var19.eql($ic24$) && NIL == f50778(var19)) {
                    var17 = (SubLObject)T;
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var17);
    }
    
    public static SubLObject f50778(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (NIL != f50779(var16)) {
            return f50780(var16);
        }
        return (SubLObject)makeBoolean((NIL != $g6345$.getDynamicValue(var17) && NIL != module0206.f13497(var16)) || NIL != f50781(var16) || NIL != f50782(var16) || NIL != f50783(var16, (SubLObject)UNPROVIDED) || NIL != f50784(var16) || NIL != f50785(var16) || NIL != f50786(var16) || NIL != f50787(var16) || NIL != f50788(var16) || NIL != f50789(var16));
    }
    
    public static SubLObject f50779(final SubLObject var16) {
        return (SubLObject)makeBoolean(var16.isList() && NIL != module0259.f16854(module0205.f13132(var16), $ic25$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f50780(final SubLObject var16) {
        if (NIL != module0259.f16854(module0205.f13132(var16), $ic25$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var17 = (SubLObject)NIL;
            final SubLObject var18 = module0205.f13207(var16, (SubLObject)$ic26$);
            SubLObject var19;
            SubLObject var20;
            for (var19 = (SubLObject)NIL, var19 = var18; NIL == var17 && NIL != var19; var17 = (SubLObject)makeBoolean(var20.isList() && NIL == f50778(var20)), var19 = var19.rest()) {
                var20 = var19.first();
            }
            return (SubLObject)makeBoolean(NIL == var17);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50784(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (NIL == module0202.f12734(var16, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        SubLObject var19;
        final SubLObject var18 = var19 = module0205.f13180(var16, (SubLObject)UNPROVIDED);
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)$ic27$);
        var20 = var19.first();
        var19 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)$ic27$);
        var21 = var19.first();
        var19 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)$ic27$);
        var22 = var19.first();
        var19 = var19.rest();
        if (NIL != var19) {
            cdestructuring_bind.cdestructuring_bind_error(var18, (SubLObject)$ic27$);
            return (SubLObject)NIL;
        }
        if (NIL == module0173.f10955(var21) && (NIL == $g6345$.getDynamicValue(var17) || NIL == module0206.f13497(var21))) {
            return (SubLObject)NIL;
        }
        if (var20.eql($ic20$) || var20.eql($ic21$) || var20.eql($ic22$)) {
            return (SubLObject)makeBoolean((NIL != module0210.f13565(var22) && (NIL != module0731.f44690(var22, (SubLObject)UNPROVIDED) || NIL != module0731.f44656(var22, (SubLObject)UNPROVIDED) || NIL != module0584.f35795(var22))) || (NIL != $g6345$.getDynamicValue(var17) && NIL != module0206.f13497(var22)));
        }
        if (var20.eql($ic23$)) {
            return (SubLObject)makeBoolean((NIL != module0210.f13565(var22) && NIL != module0259.f16891(var22, $ic28$)) || (NIL != $g6345$.getDynamicValue(var17) && NIL != module0206.f13497(var22)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50782(final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        if (NIL != module0202.f12734(var29, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && module0205.f13132(var29).eql($ic8$)) {
            var31 = module0205.f13203(var29, (SubLObject)UNPROVIDED);
            var32 = module0205.f13204(var29, (SubLObject)UNPROVIDED);
        }
        else {
            if (NIL == module0202.f12734(var29, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            var31 = module0205.f13132(var29);
            var32 = module0205.f13203(var29, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)makeBoolean(((NIL != module0210.f13565(var31) && NIL != module0259.f16891(var31, $ic29$)) || (NIL != $g6345$.getDynamicValue(var30) && NIL != module0206.f13497(var31))) && ((NIL != module0210.f13565(var32) && (NIL != module0256.f16598(var32, $ic30$) || NIL != module0259.f16891(var32, $ic28$))) || (NIL != $g6345$.getDynamicValue(var30) && NIL != module0206.f13497(var32))));
    }
    
    public static SubLObject f50781(final SubLObject var29) {
        return (SubLObject)makeBoolean(var29.isString() || NIL != conses_high.member(var29, module0259.f16850($ic31$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f50785(final SubLObject var29) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var29) && (module0205.f13132(var29).eql($ic14$) || module0205.f13132(var29).eql($ic11$)) && NIL != f50790(module0205.f13207(var29, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f50790(final SubLObject var32) {
        SubLObject var33 = (SubLObject)NIL;
        if (NIL == var33) {
            SubLObject var34 = var32;
            SubLObject var35 = (SubLObject)NIL;
            var35 = var34.first();
            while (NIL == var33 && NIL != var34) {
                if (NIL == f50791(var35)) {
                    var33 = (SubLObject)T;
                }
                var34 = var34.rest();
                var35 = var34.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var33);
    }
    
    public static SubLObject f50791(final SubLObject var34) {
        return (SubLObject)makeBoolean(NIL != f50781(var34) || NIL != f50782(var34) || NIL != f50792(var34) || NIL != f50787(var34) || NIL != f50784(var34));
    }
    
    public static SubLObject f50786(final SubLObject var29) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var29) && (module0205.f13132(var29).eql($ic13$) || module0205.f13132(var29).eql($ic10$)) && NIL != f50793(module0205.f13207(var29, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f50793(final SubLObject var32) {
        SubLObject var33 = (SubLObject)NIL;
        if (NIL == var33) {
            SubLObject var34 = var32;
            SubLObject var35 = (SubLObject)NIL;
            var35 = var34.first();
            while (NIL == var33 && NIL != var34) {
                if (NIL == f50794(var35)) {
                    var33 = (SubLObject)T;
                }
                var34 = var34.rest();
                var35 = var34.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var33);
    }
    
    public static SubLObject f50794(final SubLObject var34) {
        return (SubLObject)makeBoolean(NIL != f50781(var34) || NIL != f50782(var34) || NIL != f50784(var34));
    }
    
    public static SubLObject f50792(final SubLObject var34) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var34) && module0205.f13132(var34).eql($ic17$) && NIL != f50795(module0205.f13207(var34, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f50787(final SubLObject var34) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var34) && module0205.f13132(var34).eql($ic18$) && NIL != f50795(module0205.f13207(var34, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f50795(final SubLObject var32) {
        SubLObject var33 = (SubLObject)NIL;
        if (NIL == var33) {
            SubLObject var34 = var32;
            SubLObject var35 = (SubLObject)NIL;
            var35 = var34.first();
            while (NIL == var33 && NIL != var34) {
                if (NIL == f50781(var35) && NIL == f50782(var35) && NIL == f50784(var35)) {
                    var33 = (SubLObject)T;
                }
                var34 = var34.rest();
                var35 = var34.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var33);
    }
    
    public static SubLObject f50783(final SubLObject var29, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        if (NIL == module0202.f12590(var29)) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        if (NIL != module0202.f12734(var29, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && module0205.f13132(var29).eql($ic6$)) {
            var36 = module0205.f13203(var29, (SubLObject)UNPROVIDED);
            var37 = module0205.f13204(var29, (SubLObject)UNPROVIDED);
        }
        else {
            if (NIL == module0202.f12734(var29, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                return Values.values((SubLObject)NIL, (SubLObject)NIL);
            }
            var36 = module0205.f13132(var29);
            var37 = module0205.f13203(var29, (SubLObject)UNPROVIDED);
        }
        if (NIL != f50752(var36, (SubLObject)UNPROVIDED) && var37.isKeyword() && (NIL == var35 || var37.equal(var35))) {
            return Values.values(var36, var37);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50788(final SubLObject var29) {
        if (NIL == module0202.f12590(var29)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0202.f12734(var29, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && module0205.f13132(var29).eql($ic32$)) {
            return (SubLObject)makeBoolean(NIL != module0173.f10955(module0205.f13204(var29, (SubLObject)UNPROVIDED)) && NIL != module0731.f44656(module0205.f13204(var29, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED) && module0205.f13203(var29, (SubLObject)UNPROVIDED).isKeyword());
        }
        if (NIL != module0202.f12734(var29, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)makeBoolean(NIL != module0173.f10955(module0205.f13132(var29)) && NIL != module0731.f44656(module0205.f13132(var29), (SubLObject)UNPROVIDED) && module0205.f13203(var29, (SubLObject)UNPROVIDED).isKeyword());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50789(final SubLObject var29) {
        if (NIL == module0202.f12590(var29)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0202.f12734(var29, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && module0205.f13132(var29).eql($ic33$)) {
            return (SubLObject)makeBoolean(NIL != module0173.f10955(module0205.f13204(var29, (SubLObject)UNPROVIDED)) && NIL != module0584.f35801(module0205.f13204(var29, (SubLObject)UNPROVIDED)) && module0205.f13203(var29, (SubLObject)UNPROVIDED).isKeyword());
        }
        if (NIL != module0202.f12734(var29, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)makeBoolean(NIL != module0173.f10955(module0205.f13132(var29)) && NIL != module0584.f35801(module0205.f13132(var29)) && module0205.f13203(var29, (SubLObject)UNPROVIDED).isKeyword());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50796() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50749", "S#55347", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50750", "S#55348", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50751", "S#55349", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50752", "S#55350", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50753", "S#55351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50754", "S#55352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50755", "S#55353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50756", "S#55354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50757", "S#55355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50758", "S#55356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50760", "S#55357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50762", "S#55358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50759", "S#55359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50761", "S#55360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50763", "S#55361", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50764", "S#55362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50765", "S#55363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50766", "S#55364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50768", "S#55365", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50767", "S#55366", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50769", "S#55367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50770", "S#55368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50771", "S#55369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50772", "S#55370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50773", "S#55371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50774", "S#55372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50775", "S#55373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50776", "S#55374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50777", "S#37378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50778", "S#55375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50779", "S#55376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50780", "S#55377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50784", "S#55378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50782", "S#55379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50781", "S#55380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50785", "S#55381", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50790", "S#55382", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50791", "S#55383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50786", "S#55384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50793", "S#55385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50794", "S#55386", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50792", "S#55387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50787", "S#55388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50795", "S#55389", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50783", "S#55390", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50788", "S#55391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0793", "f50789", "S#55392", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50797() {
        $g6345$ = SubLFiles.defparameter("S#55393", (SubLObject)T);
        $g6346$ = SubLFiles.deflexical("S#55394", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50798() {
        module0034.f1909((SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f50796();
    }
    
    public void initializeVariables() {
        f50797();
    }
    
    public void runTopLevelForms() {
        f50798();
    }
    
    static {
        me = (SubLFile)new module0793();
        $g6345$ = null;
        $g6346$ = null;
        $ic0$ = makeKeyword("ANY");
        $ic1$ = makeSymbol("S#55350", "CYC");
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("ParsingTemplateCategory"));
        $ic3$ = makeSymbol("S#55394", "CYC");
        $ic4$ = makeInteger(32);
        $ic5$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("NLPattern-Template"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("TokenTemplate"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("NLPattern-Word"));
        $ic9$ = makeSymbol("*");
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("OptionalSome"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("OptionalOne"));
        $ic12$ = makeSymbol("+");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("RequireSome"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("RequireOne"));
        $ic15$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("OptionalOne")), constant_handles_oc.f8479((SubLObject)makeString("OptionalSome")));
        $ic16$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RequireOne")), constant_handles_oc.f8479((SubLObject)makeString("RequireSome")), constant_handles_oc.f8479((SubLObject)makeString("OptionalOne")), constant_handles_oc.f8479((SubLObject)makeString("OptionalSome")));
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("WordSequence"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("NLPattern-Exact"));
        $ic19$ = makeKeyword("SEQUENCE");
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("TermPOSPair"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("NLPattern-Term"));
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("NLPattern-Term-Optional"));
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("NLPattern-TermPred"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("NLPatternList"));
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("NLParsingSlot"));
        $ic26$ = makeKeyword("IGNORE");
        $ic27$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("CLASS"));
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("SpeechPartPredicate"));
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("LexicalWord"));
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("NLWordForm"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("TemplateSententialMarker"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("NLPattern-POS"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("NLPattern-Agr"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 186 ms
	
	Decompiled with Procyon 0.5.32.
*/