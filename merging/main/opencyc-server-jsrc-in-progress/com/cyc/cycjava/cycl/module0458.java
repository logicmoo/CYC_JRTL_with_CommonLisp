package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0458 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0458";
    public static final String myFingerPrint = "484d3701a597513e1e1d5ed117369e02b45e0eed6fa3ce213ab032c07baf6b69";
    private static SubLSymbol $g3610$;
    private static SubLSymbol $g3611$;
    private static SubLSymbol $g3612$;
    private static SubLSymbol $g3613$;
    private static SubLSymbol $g3614$;
    private static SubLSymbol $g3615$;
    private static SubLSymbol $g3616$;
    private static SubLSymbol $g3617$;
    private static SubLSymbol $g3618$;
    private static SubLSymbol $g3619$;
    private static SubLSymbol $g3620$;
    private static SubLSymbol $g3621$;
    private static SubLSymbol $g3622$;
    private static SubLSymbol $g3623$;
    private static SubLSymbol $g3624$;
    private static SubLSymbol $g3625$;
    private static SubLSymbol $g3626$;
    private static SubLSymbol $g3627$;
    public static SubLSymbol $g3628$;
    public static SubLSymbol $g3629$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLList $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLList $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLObject $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLList $ic98$;
    private static final SubLObject $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLList $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLList $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLList $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLObject $ic118$;
    private static final SubLList $ic119$;
    private static final SubLObject $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLList $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLList $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLList $ic126$;
    private static final SubLObject $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLList $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLInteger $ic133$;
    private static final SubLInteger $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLObject $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLList $ic138$;
    private static final SubLList $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLList $ic141$;
    private static final SubLObject $ic142$;
    private static final SubLList $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLObject $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLList $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLList $ic149$;
    
    public static SubLObject f31226(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var4 = f31227(var1, var3);
        return module0004.f104(var2, var4, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31227(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0259.f16822(var1, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31228(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var4 = module0259.f16829(var2, var3, (SubLObject)UNPROVIDED);
        return var4;
    }
    
    public static SubLObject f31229(final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLObject var8 = module0191.f11990((SubLObject)$ic2$, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var9 = (SubLObject)NIL;
        return Values.values(var8, var9);
    }
    
    public static SubLObject f31230(final SubLObject var10) {
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var10, (SubLObject)$ic3$);
        var11 = var10.first();
        SubLObject var15 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var12 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var13 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var14 = var15.first();
        var15 = var15.rest();
        if (NIL != var15) {
            cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        if (var11 != $ic2$) {
            return (SubLObject)T;
        }
        final SubLObject var16 = module0202.f12834(var12, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0202.f12835(var12, (SubLObject)UNPROVIDED);
        return f31226(var16, var17, var13);
    }
    
    public static SubLObject f31231(final SubLObject var10) {
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var10, (SubLObject)$ic3$);
        var11 = var10.first();
        SubLObject var15 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var12 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var13 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var14 = var15.first();
        var15 = var15.rest();
        if (NIL != var15) {
            cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        if (var11 != $ic2$) {
            return (SubLObject)ConsesLow.list(var10);
        }
        final SubLObject var16 = module0202.f12834(var12, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0202.f12835(var12, (SubLObject)UNPROVIDED);
        final SubLObject var18 = module0202.f12768($ic4$, var16, var17);
        final SubLObject var19 = (SubLObject)ConsesLow.list($ic5$, (SubLObject)$ic6$, (SubLObject)ConsesLow.list($ic7$, (SubLObject)ConsesLow.list($ic8$, (SubLObject)$ic6$, var17), (SubLObject)ConsesLow.listS($ic4$, var16, (SubLObject)$ic9$), (SubLObject)ConsesLow.list($ic10$, (SubLObject)$ic6$, var17)));
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var10_23 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        if (NIL != module0205.f13337(var12)) {
            var12 = module0205.f13338(var18);
            var20 = (SubLObject)ConsesLow.list($ic11$, var19);
        }
        else {
            var12 = var18;
            var20 = (SubLObject)ConsesLow.list($ic12$, var19);
        }
        var10_23 = module0191.f11990((SubLObject)$ic2$, var12, var13, var14);
        var21 = module0191.f11990((SubLObject)$ic13$, var20, var13, var14);
        return (SubLObject)ConsesLow.list(var10_23, var21);
    }
    
    public static SubLObject f31232(final SubLObject var25) {
        final SubLObject var26 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        return f31226(var26, var27, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31233(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        return Numbers.add(f31234(var25, (SubLObject)UNPROVIDED), (SubLObject)((NIL != module0202.f12659(module0205.f13387(var25, (SubLObject)UNPROVIDED))) ? $g3611$.getGlobalValue() : ZERO_INTEGER));
    }
    
    public static SubLObject f31234(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        return module0217.f14223(module0205.f13387(var25, (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER, $ic4$);
    }
    
    public static SubLObject f31235(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        return (NIL != module0193.f12105(var25)) ? module0018.$g660$.getGlobalValue() : module0217.f14223(module0205.f13388(var25, (SubLObject)UNPROVIDED), (SubLObject)TWO_INTEGER, $ic4$);
    }
    
    public static SubLObject f31236(final SubLObject var29, final SubLObject var30, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var31 = f31237(var29, var3);
        return module0004.f104(var30, var31, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31237(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0256.f16525(var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31238(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0256.f16541(var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31239(final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLObject var8 = module0191.f11990((SubLObject)$ic21$, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var9 = (SubLObject)NIL;
        return Values.values(var8, var9);
    }
    
    public static SubLObject f31240(final SubLObject var10) {
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var10, (SubLObject)$ic3$);
        var11 = var10.first();
        SubLObject var15 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var12 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var13 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var14 = var15.first();
        var15 = var15.rest();
        if (NIL != var15) {
            cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        if (var11 != $ic21$) {
            return (SubLObject)T;
        }
        final SubLObject var16 = module0202.f12834(var12, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0202.f12835(var12, (SubLObject)UNPROVIDED);
        return f31236(var16, var17, var13);
    }
    
    public static SubLObject f31241(final SubLObject var10) {
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var10, (SubLObject)$ic3$);
        var11 = var10.first();
        SubLObject var15 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var12 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var13 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var14 = var15.first();
        var15 = var15.rest();
        if (NIL != var15) {
            cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        if (var11 != $ic21$) {
            return (SubLObject)ConsesLow.list(var10);
        }
        final SubLObject var16 = module0202.f12834(var12, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0202.f12835(var12, (SubLObject)UNPROVIDED);
        final SubLObject var18 = module0202.f12768($ic10$, var16, var17);
        final SubLObject var19 = (SubLObject)ConsesLow.list($ic5$, (SubLObject)$ic6$, (SubLObject)ConsesLow.list($ic7$, (SubLObject)ConsesLow.list($ic8$, (SubLObject)$ic6$, var17), (SubLObject)ConsesLow.listS($ic10$, var16, (SubLObject)$ic9$), (SubLObject)ConsesLow.list($ic10$, (SubLObject)$ic6$, var17)));
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var10_38 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        if (NIL != module0205.f13337(var12)) {
            var12 = module0205.f13338(var18);
            var20 = (SubLObject)ConsesLow.list($ic11$, var19);
        }
        else {
            var12 = var18;
            var20 = (SubLObject)ConsesLow.list($ic12$, var19);
        }
        var10_38 = module0191.f11990((SubLObject)$ic21$, var12, var13, var14);
        var21 = module0191.f11990((SubLObject)$ic13$, var20, var13, var14);
        return (SubLObject)ConsesLow.list(var10_38, var21);
    }
    
    public static SubLObject f31242(final SubLObject var25) {
        final SubLObject var26 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        return f31236(var26, var27, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31243(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        return module0217.f14223(module0205.f13387(var25, (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER, $ic10$);
    }
    
    public static SubLObject f31244(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        return module0217.f14223(module0205.f13388(var25, (SubLObject)UNPROVIDED), (SubLObject)TWO_INTEGER, $ic10$);
    }
    
    public static SubLObject f31245(final SubLObject var39, final SubLObject var40, SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        final SubLObject var42 = f31246(var39, var41);
        return module0004.f104(var40, var42, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31246(final SubLObject var3, SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        return module0262.f17301(var3, var41, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31247(final SubLObject var3, SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        return module0262.f17306(var3, var41, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31248(final SubLObject var25) {
        final SubLObject var26 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        return f31245(var26, var27, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31249(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        return module0217.f14223(module0205.f13387(var25, (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER, $ic35$);
    }
    
    public static SubLObject f31250(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        return module0217.f14223(module0205.f13388(var25, (SubLObject)UNPROVIDED), (SubLObject)TWO_INTEGER, $ic35$);
    }
    
    public static SubLObject f31251(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLObject var29 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        final SubLObject var31 = f31246(var29, (SubLObject)UNPROVIDED);
        if (NIL != module0004.f104(var30, var31, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic13$, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31252(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        SubLObject var33;
        final SubLObject var32 = var33 = f31246(var30, (SubLObject)UNPROVIDED);
        SubLObject var34 = (SubLObject)NIL;
        var34 = var33.first();
        while (NIL != var33) {
            var29.resetMultipleValues();
            final SubLObject var35 = module0235.f15474(var31, var34, (SubLObject)T, (SubLObject)T);
            final SubLObject var36 = var29.secondMultipleValue();
            var29.resetMultipleValues();
            if (NIL != var35) {
                final SubLObject var37 = module0233.f15361(var35, var25);
                module0347.f23330(module0191.f11990((SubLObject)$ic13$, var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var35, var36);
            }
            var33 = var33.rest();
            var34 = var33.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31253(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        SubLObject var33;
        final SubLObject var32 = var33 = f31247(var31, (SubLObject)UNPROVIDED);
        SubLObject var34 = (SubLObject)NIL;
        var34 = var33.first();
        while (NIL != var33) {
            var29.resetMultipleValues();
            final SubLObject var35 = module0235.f15474(var30, var34, (SubLObject)T, (SubLObject)T);
            final SubLObject var36 = var29.secondMultipleValue();
            var29.resetMultipleValues();
            if (NIL != var35) {
                final SubLObject var37 = module0233.f15361(var35, var25);
                module0347.f23330(module0191.f11990((SubLObject)$ic13$, var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var35, var36);
            }
            var33 = var33.rest();
            var34 = var33.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31254(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        return Numbers.add(module0217.f14223(module0205.f13387(var25, (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER, $ic46$), module0217.f14223(module0205.f13387(var25, (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER, $ic47$));
    }
    
    public static SubLObject f31255(final SubLObject var25) {
        final SubLObject var26 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        return f31256(var26, var27);
    }
    
    public static SubLObject f31257(final SubLObject var49, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var50 = module0260.f17007(var49, var3, (SubLObject)UNPROVIDED);
        return module0260.f17085(var50, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31256(final SubLObject var29, final SubLObject var30) {
        final SubLObject var31 = f31257(var29, (SubLObject)UNPROVIDED);
        return module0004.f104(var30, var31, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31258(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        return Numbers.add(module0217.f14223(module0205.f13388(var25, (SubLObject)UNPROVIDED), (SubLObject)TWO_INTEGER, $ic46$), module0217.f14223(module0205.f13388(var25, (SubLObject)UNPROVIDED), (SubLObject)TWO_INTEGER, $ic47$));
    }
    
    public static SubLObject f31259(final SubLObject var49, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0260.f17015(var49, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31260(final SubLObject var25) {
        final SubLObject var26 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        final SubLObject var28 = module0205.f13389(var25, (SubLObject)UNPROVIDED);
        final SubLObject var29 = f31261(var26, var27, (SubLObject)UNPROVIDED);
        return module0004.f104(var28, var29, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31261(final SubLObject var51, final SubLObject var52, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0259.f16928((SubLObject)ConsesLow.list(var51, var52), (SubLObject)NIL, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31262(final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        SubLObject var9;
        final SubLObject var8 = var9 = module0205.f13207(var6, (SubLObject)UNPROVIDED);
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic58$);
        var10 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic58$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic58$);
        var12 = var9.first();
        var9 = var9.rest();
        if (NIL == var9) {
            final SubLObject var13 = module0202.f12768($ic10$, var10, var12);
            final SubLObject var14 = module0191.f11990((SubLObject)$ic21$, var13, var7, (SubLObject)UNPROVIDED);
            final SubLObject var15 = module0202.f12768($ic10$, var11, var12);
            final SubLObject var16 = module0191.f11990((SubLObject)$ic21$, var15, var7, (SubLObject)UNPROVIDED);
            final SubLObject var17 = (SubLObject)$ic59$;
            final SubLObject var18 = (SubLObject)ConsesLow.list(module0202.f12768($ic60$, var17, var12), module0202.f12768($ic10$, var17, var12), module0202.f12768($ic10$, var10, var17), module0202.f12768($ic10$, var11, var17));
            final SubLObject var19 = module0202.f12643($ic12$, module0202.f12768($ic5$, var17, module0276.f18287(var18, (SubLObject)UNPROVIDED)));
            final SubLObject var20 = module0191.f11990((SubLObject)$ic61$, var19, var7, (SubLObject)UNPROVIDED);
            return Values.values(var20, (SubLObject)ConsesLow.list(var14, var16));
        }
        cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic58$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31263(final SubLObject var25) {
        final SubLObject var26 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        final SubLObject var28 = module0205.f13389(var25, (SubLObject)UNPROVIDED);
        return module0004.f104(var28, f31264(var26, var27, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31264(final SubLObject var55, final SubLObject var56, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0256.f16636((SubLObject)ConsesLow.list(var55, var56), (SubLObject)NIL, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31265(final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        SubLObject var9;
        final SubLObject var8 = var9 = module0205.f13207(var6, (SubLObject)UNPROVIDED);
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic68$);
        var10 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic68$);
        var11 = var9.first();
        var9 = var9.rest();
        if (NIL == var9) {
            final SubLObject var12 = module0202.f12760(var10);
            final SubLObject var13 = (SubLObject)$ic59$;
            SubLObject var14 = (SubLObject)ConsesLow.list(module0202.f12768($ic10$, var13, var11), module0202.f12768($ic60$, var13, var11));
            SubLObject var15 = (SubLObject)NIL;
            SubLObject var16 = var12;
            SubLObject var17 = (SubLObject)NIL;
            var17 = var16.first();
            while (NIL != var16) {
                final SubLObject var18 = module0202.f12768($ic10$, var17, var11);
                var15 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic21$, var18, var7, (SubLObject)UNPROVIDED), var15);
                final SubLObject var19 = module0202.f12768($ic10$, var17, var13);
                var14 = (SubLObject)ConsesLow.cons(var19, var14);
                var16 = var16.rest();
                var17 = var16.first();
            }
            final SubLObject var20 = module0202.f12643($ic12$, module0202.f12768($ic5$, var13, module0276.f18287(var14, (SubLObject)UNPROVIDED)));
            final SubLObject var21 = module0191.f11990((SubLObject)$ic61$, var20, var7, (SubLObject)UNPROVIDED);
            return Values.values(var21, var15);
        }
        cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic68$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31266(final SubLObject var69, final SubLObject var2) {
        return module0035.f2171(var2, module0256.f16636(var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31267(final SubLObject var25) {
        final SubLObject var26 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        final SubLObject var28 = module0205.f13389(var25, (SubLObject)UNPROVIDED);
        return module0004.f104(var28, f31268(var26, var27, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31268(final SubLObject var55, final SubLObject var56, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0256.f16638((SubLObject)ConsesLow.list(var55, var56), (SubLObject)NIL, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31269(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLObject var29 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0205.f13389(var25, (SubLObject)UNPROVIDED);
        final SubLObject var32 = f31270(var29, var30, (SubLObject)UNPROVIDED);
        return module0004.f104(var31, var32, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31270(final SubLObject var79, final SubLObject var80, SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = module0132.$g1548$.getGlobalValue();
        }
        return module0262.f17369((SubLObject)ConsesLow.list(var79, var80), (SubLObject)NIL, var41);
    }
    
    public static SubLObject f31271(final SubLObject var25) {
        final SubLObject var26 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        final SubLObject var28 = module0205.f13389(var25, (SubLObject)UNPROVIDED);
        final SubLObject var29 = f31272(var26, var27, (SubLObject)UNPROVIDED);
        return module0004.f104(var28, var29, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31272(final SubLObject var26, final SubLObject var83, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var26.equal(var83)) {
            return (SubLObject)NIL;
        }
        final SubLObject var84 = module0259.f16840(var26, var3, (SubLObject)UNPROVIDED);
        final SubLObject var85 = module0259.f16840(var83, var3, (SubLObject)UNPROVIDED);
        final SubLObject var86 = conses_high.set_difference(var84, var85, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        if (NIL == var86) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var86)) {
            return var86;
        }
        final SubLObject var87 = module0256.f16529(var86, var3, (SubLObject)UNPROVIDED);
        return var87;
    }
    
    public static SubLObject f31273(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        return module0217.f14223(module0205.f13387(var25, (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER, $ic4$);
    }
    
    public static SubLObject f31274(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLObject var29 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0205.f13389(var25, (SubLObject)UNPROVIDED);
        final SubLObject var32 = f31275(var29, var30, (SubLObject)UNPROVIDED);
        return module0004.f104(var31, var32, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31275(final SubLObject var27, final SubLObject var89, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var27.equal(var89)) {
            return (SubLObject)NIL;
        }
        final SubLObject var90 = module0256.f16531(var27, var3, (SubLObject)UNPROVIDED);
        final SubLObject var91 = (SubLObject)ConsesLow.cons(var27, module0256.f16531(var89, var3, (SubLObject)UNPROVIDED));
        final SubLObject var92 = conses_high.set_difference(var90, var91, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        if (NIL == var92) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var92)) {
            return var92;
        }
        final SubLObject var93 = module0256.f16529(var92, var3, (SubLObject)UNPROVIDED);
        return var93;
    }
    
    public static SubLObject f31276(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        return module0217.f14223(module0205.f13387(var25, (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER, $ic10$);
    }
    
    public static SubLObject f31277(final SubLObject var1, final SubLObject var90, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var91 = f31278(var1, var90, var3);
        return module0004.f104(var2, var91, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31278(final SubLObject var1, final SubLObject var90, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0259.f16839(var1, var90, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31279(final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLObject var8 = module0191.f11990((SubLObject)$ic2$, var6, var7, (SubLObject)UNPROVIDED);
        final SubLObject var9 = (SubLObject)NIL;
        return Values.values(var8, var9);
    }
    
    public static SubLObject f31280(final SubLObject var10) {
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var10, (SubLObject)$ic3$);
        var11 = var10.first();
        SubLObject var15 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var12 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var13 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var14 = var15.first();
        var15 = var15.rest();
        if (NIL != var15) {
            cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        if (var11 != $ic2$) {
            return (SubLObject)T;
        }
        final SubLObject var16 = module0202.f12834(var12, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0202.f12835(var12, (SubLObject)UNPROVIDED);
        final SubLObject var18 = module0202.f12836(var12, (SubLObject)UNPROVIDED);
        return f31277(var16, var17, var18, var13);
    }
    
    public static SubLObject f31281(final SubLObject var10) {
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var10, (SubLObject)$ic3$);
        var11 = var10.first();
        SubLObject var15 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var12 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var13 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var14 = var15.first();
        var15 = var15.rest();
        if (NIL != var15) {
            cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        if (var11 != $ic2$) {
            return (SubLObject)ConsesLow.list(var10);
        }
        final SubLObject var16 = module0202.f12834(var12, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0202.f12835(var12, (SubLObject)UNPROVIDED);
        final SubLObject var18 = module0202.f12836(var12, (SubLObject)UNPROVIDED);
        final SubLObject var19 = module0202.f12768($ic4$, var16, var18);
        final SubLObject var20 = module0202.f12768($ic4$, var18, var17);
        final SubLObject var21 = (SubLObject)ConsesLow.list($ic5$, (SubLObject)$ic6$, (SubLObject)ConsesLow.list($ic7$, (SubLObject)ConsesLow.list($ic8$, (SubLObject)$ic6$, var18), (SubLObject)ConsesLow.listS($ic4$, var16, (SubLObject)$ic9$), (SubLObject)ConsesLow.list($ic10$, (SubLObject)$ic6$, var18), (SubLObject)ConsesLow.list($ic4$, (SubLObject)$ic6$, var17)));
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        if (NIL != module0205.f13337(var12)) {
            var22 = module0205.f13338(var19);
            var23 = module0205.f13338(var20);
            var24 = (SubLObject)ConsesLow.list($ic11$, var21);
        }
        else {
            var22 = var19;
            var23 = var20;
            var24 = (SubLObject)ConsesLow.list($ic12$, var21);
        }
        final SubLObject var25 = module0191.f11990((SubLObject)$ic2$, var22, var13, var14);
        final SubLObject var26 = module0191.f11990((SubLObject)$ic2$, var23, var13, var14);
        final SubLObject var27 = module0191.f11990((SubLObject)$ic61$, var24, var13, var14);
        return (SubLObject)ConsesLow.list(var25, var26, var27);
    }
    
    public static SubLObject f31282(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLObject var29 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        return (NIL != module0173.f10955(var29)) ? f31234(var25, var28) : $g3612$.getGlobalValue();
    }
    
    public static SubLObject f31283(final SubLObject var29, final SubLObject var90, final SubLObject var30, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var91 = f31284(var29, var90, var3, (SubLObject)UNPROVIDED);
        return module0004.f104(var30, var91, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31284(final SubLObject var2, final SubLObject var103, SubLObject var3, SubLObject var15) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        final SubLObject var104 = Sequences.remove(var2, module0256.f16531(var2, var3, var15), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var105 = module0259.f16841(var103, var104, var3, var15);
        return module0256.f16529(var105, var3, var15);
    }
    
    public static SubLObject f31285(final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLObject var8 = module0191.f11990((SubLObject)$ic21$, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var9 = (SubLObject)NIL;
        return Values.values(var8, var9);
    }
    
    public static SubLObject f31286(final SubLObject var10) {
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var10, (SubLObject)$ic3$);
        var11 = var10.first();
        SubLObject var15 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var12 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var13 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var14 = var15.first();
        var15 = var15.rest();
        if (NIL != var15) {
            cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        if (var11 != $ic21$) {
            return (SubLObject)T;
        }
        final SubLObject var16 = module0202.f12834(var12, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0202.f12835(var12, (SubLObject)UNPROVIDED);
        final SubLObject var18 = module0202.f12836(var12, (SubLObject)UNPROVIDED);
        return f31283(var16, var17, var18, var13);
    }
    
    public static SubLObject f31287(final SubLObject var10) {
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var10, (SubLObject)$ic3$);
        var11 = var10.first();
        SubLObject var15 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var12 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var13 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var10, (SubLObject)$ic3$);
        var14 = var15.first();
        var15 = var15.rest();
        if (NIL != var15) {
            cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        if (var11 != $ic21$) {
            return (SubLObject)ConsesLow.list(var10);
        }
        final SubLObject var16 = module0202.f12834(var12, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0202.f12835(var12, (SubLObject)UNPROVIDED);
        final SubLObject var18 = module0202.f12836(var12, (SubLObject)UNPROVIDED);
        final SubLObject var19 = module0202.f12768($ic10$, var16, var18);
        final SubLObject var20 = module0202.f12768($ic4$, var18, var17);
        final SubLObject var21 = (SubLObject)ConsesLow.list($ic5$, (SubLObject)$ic6$, (SubLObject)ConsesLow.list($ic7$, (SubLObject)ConsesLow.list($ic8$, (SubLObject)$ic6$, var18), (SubLObject)ConsesLow.listS($ic10$, var16, (SubLObject)$ic9$), (SubLObject)ConsesLow.list($ic10$, (SubLObject)$ic6$, var18), (SubLObject)ConsesLow.list($ic4$, (SubLObject)$ic6$, var17)));
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        if (NIL != module0205.f13337(var12)) {
            var22 = module0205.f13338(var19);
            var23 = module0205.f13338(var20);
            var24 = (SubLObject)ConsesLow.list($ic11$, var21);
        }
        else {
            var22 = var19;
            var23 = var20;
            var24 = (SubLObject)ConsesLow.list($ic12$, var21);
        }
        final SubLObject var25 = module0191.f11990((SubLObject)$ic21$, var22, var13, var14);
        final SubLObject var26 = module0191.f11990((SubLObject)$ic2$, var23, var13, var14);
        final SubLObject var27 = module0191.f11990((SubLObject)$ic61$, var24, var13, var14);
        return (SubLObject)ConsesLow.list(var25, var26, var27);
    }
    
    public static SubLObject f31288(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLObject var29 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        return (NIL != module0173.f10955(var29)) ? f31243(var25, var28) : $g3615$.getGlobalValue();
    }
    
    public static SubLObject f31289(final SubLObject var112, final SubLObject var113, final SubLObject var114) {
        return module0004.f104(var114, module0226.f14917(var112, var113, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31290(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLObject var29 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        SubLObject var31 = (SubLObject)ZERO_INTEGER;
        final SubLObject var32 = $ic111$;
        if (NIL != module0158.f10010(var29, (SubLObject)ONE_INTEGER, var32)) {
            final SubLObject var33 = module0158.f10011(var29, (SubLObject)ONE_INTEGER, var32);
            SubLObject var34 = (SubLObject)NIL;
            final SubLObject var35 = (SubLObject)NIL;
            while (NIL == var34) {
                final SubLObject var36 = module0052.f3695(var33, var35);
                final SubLObject var37 = (SubLObject)makeBoolean(!var35.eql(var36));
                if (NIL != var37) {
                    SubLObject var38 = (SubLObject)NIL;
                    try {
                        var38 = module0158.f10316(var36, (SubLObject)$ic112$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var118_123 = (SubLObject)NIL;
                        final SubLObject var119_124 = (SubLObject)NIL;
                        while (NIL == var118_123) {
                            final SubLObject var39 = module0052.f3695(var38, var119_124);
                            final SubLObject var121_126 = (SubLObject)makeBoolean(!var119_124.eql(var39));
                            if (NIL != var121_126 && NIL != module0178.f11284(var39) && var30.eql(module0178.f11335(var39))) {
                                var31 = Numbers.add(var31, (SubLObject)ONE_INTEGER);
                            }
                            var118_123 = (SubLObject)makeBoolean(NIL == var121_126);
                        }
                    }
                    finally {
                        final SubLObject var40 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var38) {
                                module0158.f10319(var38);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var40);
                        }
                    }
                }
                var34 = (SubLObject)makeBoolean(NIL == var37);
            }
        }
        return Numbers.max(var31, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f31291(final SubLObject var112, final SubLObject var113) {
        return module0052.f3709(module0226.f14917(var112, var113, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31292(final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        return Values.values(module0191.f11990((SubLObject)$ic13$, var6, var7, (SubLObject)UNPROVIDED), (SubLObject)NIL);
    }
    
    public static SubLObject f31293(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLObject var29 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0205.f13389(var25, (SubLObject)UNPROVIDED);
        SubLObject var31 = (SubLObject)ZERO_INTEGER;
        final SubLObject var32 = $ic111$;
        if (NIL != module0158.f10010(var30, (SubLObject)THREE_INTEGER, var32)) {
            final SubLObject var33 = module0158.f10011(var30, (SubLObject)THREE_INTEGER, var32);
            SubLObject var34 = (SubLObject)NIL;
            final SubLObject var35 = (SubLObject)NIL;
            while (NIL == var34) {
                final SubLObject var36 = module0052.f3695(var33, var35);
                final SubLObject var37 = (SubLObject)makeBoolean(!var35.eql(var36));
                if (NIL != var37) {
                    SubLObject var38 = (SubLObject)NIL;
                    try {
                        var38 = module0158.f10316(var36, (SubLObject)$ic112$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var118_128 = (SubLObject)NIL;
                        final SubLObject var119_129 = (SubLObject)NIL;
                        while (NIL == var118_128) {
                            final SubLObject var39 = module0052.f3695(var38, var119_129);
                            final SubLObject var121_130 = (SubLObject)makeBoolean(!var119_129.eql(var39));
                            if (NIL != var121_130 && NIL != module0178.f11284(var39) && var29.eql(module0178.f11335(var39))) {
                                var31 = Numbers.add(var31, (SubLObject)ONE_INTEGER);
                            }
                            var118_128 = (SubLObject)makeBoolean(NIL == var121_130);
                        }
                    }
                    finally {
                        final SubLObject var40 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var38) {
                                module0158.f10319(var38);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var40);
                        }
                    }
                }
                var34 = (SubLObject)makeBoolean(NIL == var37);
            }
        }
        return var31;
    }
    
    public static SubLObject f31294(final SubLObject var113, final SubLObject var2) {
        return f31295(var113, var2);
    }
    
    public static SubLObject f31295(final SubLObject var113, final SubLObject var2) {
        return module0052.f3689(f31296(var113, var2), (SubLObject)$ic115$, (SubLObject)$ic116$, (SubLObject)$ic117$);
    }
    
    public static SubLObject f31296(final SubLObject var113, final SubLObject var2) {
        return (SubLObject)ConsesLow.list(module0052.f3709(module0259.f16848($ic118$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), var113, var2);
    }
    
    public static SubLObject f31297(final SubLObject var131) {
        SubLObject var132 = (SubLObject)NIL;
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var131, var131, (SubLObject)$ic119$);
        var132 = var131.first();
        SubLObject var135 = var131.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var135, var131, (SubLObject)$ic119$);
        var133 = var135.first();
        var135 = var135.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var135, var131, (SubLObject)$ic119$);
        var134 = var135.first();
        var135 = var135.rest();
        if (NIL == var135) {
            return module0052.f3687(var132);
        }
        cdestructuring_bind.cdestructuring_bind_error(var131, (SubLObject)$ic119$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31298(final SubLObject var131) {
        SubLObject var132 = (SubLObject)NIL;
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = (SubLObject)NIL;
        SubLObject var135 = (SubLObject)NIL;
        SubLObject var136 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var131, var131, (SubLObject)$ic119$);
        var134 = var131.first();
        SubLObject var137 = var131.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var137, var131, (SubLObject)$ic119$);
        var135 = var137.first();
        var137 = var137.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var137, var131, (SubLObject)$ic119$);
        var136 = var137.first();
        var137 = var137.rest();
        if (NIL == var137) {
            while (NIL == var132 && NIL == var133) {
                final SubLObject var138 = module0052.f3693(var134);
                if (NIL != var138) {
                    if (NIL == module0004.f104(var136, module0226.f14917(var138, var135, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        continue;
                    }
                    var132 = var138;
                }
                else {
                    var133 = (SubLObject)T;
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var131, (SubLObject)$ic119$);
        }
        return Values.values(var132, var131, var133);
    }
    
    public static SubLObject f31299(final SubLObject var131) {
        SubLObject var132 = (SubLObject)NIL;
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var131, var131, (SubLObject)$ic119$);
        var132 = var131.first();
        SubLObject var135 = var131.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var135, var131, (SubLObject)$ic119$);
        var133 = var135.first();
        var135 = var135.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var135, var131, (SubLObject)$ic119$);
        var134 = var135.first();
        var135 = var135.rest();
        if (NIL == var135) {
            return module0052.f3696(var132);
        }
        cdestructuring_bind.cdestructuring_bind_error(var131, (SubLObject)$ic119$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31300(final SubLObject var112, final SubLObject var113, final SubLObject var141) {
        return module0004.f104(var141, module0226.f14949(var112, var113, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31301(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLObject var29 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        SubLObject var31 = (SubLObject)ZERO_INTEGER;
        final SubLObject var32 = $ic127$;
        if (NIL != module0158.f10010(var29, (SubLObject)ONE_INTEGER, var32)) {
            final SubLObject var33 = module0158.f10011(var29, (SubLObject)ONE_INTEGER, var32);
            SubLObject var34 = (SubLObject)NIL;
            final SubLObject var35 = (SubLObject)NIL;
            while (NIL == var34) {
                final SubLObject var36 = module0052.f3695(var33, var35);
                final SubLObject var37 = (SubLObject)makeBoolean(!var35.eql(var36));
                if (NIL != var37) {
                    SubLObject var38 = (SubLObject)NIL;
                    try {
                        var38 = module0158.f10316(var36, (SubLObject)$ic112$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var118_142 = (SubLObject)NIL;
                        final SubLObject var119_143 = (SubLObject)NIL;
                        while (NIL == var118_142) {
                            final SubLObject var39 = module0052.f3695(var38, var119_143);
                            final SubLObject var121_144 = (SubLObject)makeBoolean(!var119_143.eql(var39));
                            if (NIL != var121_144 && NIL != module0178.f11284(var39) && var30.eql(module0178.f11335(var39))) {
                                var31 = Numbers.add(var31, (SubLObject)ONE_INTEGER);
                            }
                            var118_142 = (SubLObject)makeBoolean(NIL == var121_144);
                        }
                    }
                    finally {
                        final SubLObject var40 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var38) {
                                module0158.f10319(var38);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var40);
                        }
                    }
                }
                var34 = (SubLObject)makeBoolean(NIL == var37);
            }
        }
        return Numbers.max(var31, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f31302(final SubLObject var112, final SubLObject var113) {
        return module0052.f3709(module0226.f14949(var112, var113, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31303(final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        return Values.values(module0191.f11990((SubLObject)$ic13$, var6, var7, (SubLObject)UNPROVIDED), (SubLObject)NIL);
    }
    
    public static SubLObject f31304(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLObject var29 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0205.f13389(var25, (SubLObject)UNPROVIDED);
        SubLObject var31 = (SubLObject)ZERO_INTEGER;
        final SubLObject var32 = $ic127$;
        if (NIL != module0158.f10010(var30, (SubLObject)THREE_INTEGER, var32)) {
            final SubLObject var33 = module0158.f10011(var30, (SubLObject)THREE_INTEGER, var32);
            SubLObject var34 = (SubLObject)NIL;
            final SubLObject var35 = (SubLObject)NIL;
            while (NIL == var34) {
                final SubLObject var36 = module0052.f3695(var33, var35);
                final SubLObject var37 = (SubLObject)makeBoolean(!var35.eql(var36));
                if (NIL != var37) {
                    SubLObject var38 = (SubLObject)NIL;
                    try {
                        var38 = module0158.f10316(var36, (SubLObject)$ic112$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var118_145 = (SubLObject)NIL;
                        final SubLObject var119_146 = (SubLObject)NIL;
                        while (NIL == var118_145) {
                            final SubLObject var39 = module0052.f3695(var38, var119_146);
                            final SubLObject var121_147 = (SubLObject)makeBoolean(!var119_146.eql(var39));
                            if (NIL != var121_147 && NIL != module0178.f11284(var39) && var29.eql(module0178.f11335(var39))) {
                                var31 = Numbers.add(var31, (SubLObject)ONE_INTEGER);
                            }
                            var118_145 = (SubLObject)makeBoolean(NIL == var121_147);
                        }
                    }
                    finally {
                        final SubLObject var40 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var38) {
                                module0158.f10319(var38);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var40);
                        }
                    }
                }
                var34 = (SubLObject)makeBoolean(NIL == var37);
            }
        }
        return var31;
    }
    
    public static SubLObject f31305(final SubLObject var113, final SubLObject var2) {
        return f31306(var113, var2);
    }
    
    public static SubLObject f31306(final SubLObject var113, final SubLObject var2) {
        return module0052.f3689(f31307(var113, var2), (SubLObject)$ic130$, (SubLObject)$ic131$, (SubLObject)$ic132$);
    }
    
    public static SubLObject f31307(final SubLObject var113, final SubLObject var2) {
        return (SubLObject)ConsesLow.list(module0052.f3709(module0259.f16848($ic118$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), var113, var2);
    }
    
    public static SubLObject f31308(final SubLObject var131) {
        SubLObject var132 = (SubLObject)NIL;
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var131, var131, (SubLObject)$ic119$);
        var132 = var131.first();
        SubLObject var135 = var131.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var135, var131, (SubLObject)$ic119$);
        var133 = var135.first();
        var135 = var135.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var135, var131, (SubLObject)$ic119$);
        var134 = var135.first();
        var135 = var135.rest();
        if (NIL == var135) {
            return module0052.f3687(var132);
        }
        cdestructuring_bind.cdestructuring_bind_error(var131, (SubLObject)$ic119$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31309(final SubLObject var131) {
        SubLObject var132 = (SubLObject)NIL;
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = (SubLObject)NIL;
        SubLObject var135 = (SubLObject)NIL;
        SubLObject var136 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var131, var131, (SubLObject)$ic119$);
        var134 = var131.first();
        SubLObject var137 = var131.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var137, var131, (SubLObject)$ic119$);
        var135 = var137.first();
        var137 = var137.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var137, var131, (SubLObject)$ic119$);
        var136 = var137.first();
        var137 = var137.rest();
        if (NIL == var137) {
            while (NIL == var132 && NIL == var133) {
                final SubLObject var138 = module0052.f3693(var134);
                if (NIL != var138) {
                    if (NIL == module0004.f104(var136, module0226.f14949(var138, var135, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        continue;
                    }
                    var132 = var138;
                }
                else {
                    var133 = (SubLObject)T;
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var131, (SubLObject)$ic119$);
        }
        return Values.values(var132, var131, var133);
    }
    
    public static SubLObject f31310(final SubLObject var131) {
        SubLObject var132 = (SubLObject)NIL;
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var131, var131, (SubLObject)$ic119$);
        var132 = var131.first();
        SubLObject var135 = var131.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var135, var131, (SubLObject)$ic119$);
        var133 = var135.first();
        var135 = var135.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var135, var131, (SubLObject)$ic119$);
        var134 = var135.first();
        var135 = var135.rest();
        if (NIL == var135) {
            return module0052.f3696(var132);
        }
        cdestructuring_bind.cdestructuring_bind_error(var131, (SubLObject)$ic119$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31311(final SubLObject var1, SubLObject var154) {
        if (var154 == UNPROVIDED) {
            var154 = $g3629$.getDynamicValue();
        }
        final SubLThread var155 = SubLProcess.currentSubLThread();
        assert NIL != Types.numberp(var154) : var154;
        if (NIL == module0269.f17710(var1)) {
            return (SubLObject)NIL;
        }
        if (var154.numL((SubLObject)ONE_INTEGER)) {
            return (SubLObject)NIL;
        }
        if (var154.numL((SubLObject)TWO_INTEGER)) {
            return (SubLObject)ConsesLow.list(var1);
        }
        if (module0549.f33906(var1).numG($g3628$.getDynamicValue(var155))) {
            return (SubLObject)NIL;
        }
        if (module0549.f33906(var1).numL(var154)) {
            return module0256.f16552(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == module0256.f16661(var1, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(var1);
        }
        final SubLObject var156 = Numbers.multiply((SubLObject)TWO_INTEGER, Numbers.divide(var154, Sequences.length(module0256.f16541(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))));
        SubLObject var157 = (SubLObject)NIL;
        if (NIL == conses_high.member(var1, var157, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            var157 = (SubLObject)ConsesLow.cons(var1, var157);
        }
        SubLObject var158 = module0256.f16541(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var159 = (SubLObject)NIL;
        var159 = var158.first();
        while (NIL != var158) {
            SubLObject var44_158 = f31311(var159, var156);
            SubLObject var160 = (SubLObject)NIL;
            var160 = var44_158.first();
            while (NIL != var44_158) {
                final SubLObject var161 = var160;
                if (NIL == conses_high.member(var161, var157, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var157 = (SubLObject)ConsesLow.cons(var161, var157);
                }
                var44_158 = var44_158.rest();
                var160 = var44_158.first();
            }
            var158 = var158.rest();
            var159 = var158.first();
        }
        return var157;
    }
    
    public static SubLObject f31312(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLObject var29 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        return Numbers.max(module0549.f33901(var29), module0217.f14223(var29, (SubLObject)TWO_INTEGER, $ic10$));
    }
    
    public static SubLObject f31313(final SubLObject var27) {
        return module0052.f3709(f31311(var27, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31314(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLObject var29 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        if (NIL != module0004.f104(var30, f31311(var29, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic13$, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31315(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLObject var29 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        return Numbers.max(module0549.f33901(var29), module0217.f14223(var29, (SubLObject)TWO_INTEGER, $ic10$));
    }
    
    public static SubLObject f31316(final SubLObject var27) {
        final SubLObject var28 = module0220.f14567($ic144$, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        final SubLObject var29 = module0220.f14567($ic145$, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        if (NIL != module0004.f104(var27, var28, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != module0004.f104(var27, var29, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0256.f16606(var27, var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL == module0256.f16604(var27, var29, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31317(final SubLObject var27) {
        if (NIL != f31316(var27)) {
            return module0052.f3709(module0454.f31146(var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31318(final SubLObject var25, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLObject var29 = module0205.f13387(var25, (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0205.f13388(var25, (SubLObject)UNPROVIDED);
        if (NIL != f31316(var29) && NIL != module0256.f16576(var30, var29, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic13$, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31319() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31226", "S#34504", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31227", "S#34505", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31228", "S#34506", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31229", "S#34507", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31230", "S#24956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31231", "S#24958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31232", "S#34508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31233", "S#34509", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31234", "S#34510", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31235", "S#34511", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31236", "S#34512", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31237", "S#34513", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31238", "S#34514", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31239", "S#34515", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31240", "S#24961", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31241", "S#24964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31242", "S#34516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31243", "S#34517", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31244", "S#34518", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31245", "S#34519", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31246", "S#34520", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31247", "S#34521", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31248", "S#34522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31249", "S#34523", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31250", "S#34524", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31251", "S#34525", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31252", "S#34526", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31253", "S#34527", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31254", "S#34528", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31255", "S#34529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31257", "S#34530", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31256", "S#34531", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31258", "S#34532", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31259", "S#34533", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31260", "S#34534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31261", "S#34535", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31262", "S#34536", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31263", "S#34537", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31264", "S#34538", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31265", "S#34539", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31266", "S#34540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31267", "S#34541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31268", "S#34542", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31269", "S#34543", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31270", "S#34544", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31271", "S#34545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31272", "S#34546", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31273", "S#34547", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31274", "S#34548", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31275", "S#34549", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31276", "S#34550", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31277", "S#34551", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31278", "S#34552", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31279", "S#34553", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31280", "S#24957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31281", "S#24959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31282", "S#34554", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31283", "S#34555", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31284", "S#34556", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31285", "S#34557", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31286", "S#24962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31287", "S#24965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31288", "S#34558", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31289", "S#34559", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31290", "S#34560", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31291", "S#34561", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31292", "S#34562", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31293", "S#34563", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31294", "S#34564", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31295", "S#34565", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31296", "S#34566", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31297", "S#34567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31298", "S#34568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31299", "S#34569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31300", "S#34570", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31301", "S#34571", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31302", "S#34572", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31303", "S#34573", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31304", "S#34574", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31305", "S#34575", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31306", "S#34576", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31307", "S#34577", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31308", "S#34578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31309", "S#34579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31310", "S#34580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31311", "S#34581", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31312", "S#34582", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31313", "S#34583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31314", "S#34584", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31315", "S#34585", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31316", "S#34586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31317", "S#34587", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0458", "f31318", "S#34588", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31320() {
        $g3610$ = SubLFiles.defparameter("S#34589", module0018.$g659$.getGlobalValue());
        $g3611$ = SubLFiles.deflexical("S#34590", (SubLObject)ONE_INTEGER);
        $g3612$ = SubLFiles.deflexical("S#34591", $g3611$.getGlobalValue());
        $g3613$ = SubLFiles.defparameter("S#34592", module0018.$g658$.getDynamicValue());
        $g3614$ = SubLFiles.deflexical("S#34593", (SubLObject)ONE_INTEGER);
        $g3615$ = SubLFiles.deflexical("S#34594", $g3614$.getGlobalValue());
        $g3616$ = SubLFiles.defparameter("S#34595", module0018.$g658$.getDynamicValue());
        $g3617$ = SubLFiles.defparameter("S#34596", module0018.$g658$.getDynamicValue());
        $g3618$ = SubLFiles.defparameter("S#34597", module0018.$g658$.getDynamicValue());
        $g3619$ = SubLFiles.defparameter("S#34598", (SubLObject)ONE_INTEGER);
        $g3620$ = SubLFiles.defparameter("S#34599", module0018.$g658$.getDynamicValue());
        $g3621$ = SubLFiles.defparameter("S#34600", (SubLObject)ONE_INTEGER);
        $g3622$ = SubLFiles.defparameter("S#34601", module0018.$g658$.getDynamicValue());
        $g3623$ = SubLFiles.defparameter("S#34602", (SubLObject)TWO_INTEGER);
        $g3624$ = SubLFiles.defparameter("S#34603", module0018.$g658$.getDynamicValue());
        $g3625$ = SubLFiles.defparameter("S#34604", (SubLObject)ONE_INTEGER);
        $g3626$ = SubLFiles.defparameter("S#34605", module0018.$g658$.getDynamicValue());
        $g3627$ = SubLFiles.defparameter("S#34606", module0018.$g658$.getDynamicValue());
        $g3628$ = SubLFiles.defparameter("S#34607", (SubLObject)$ic133$);
        $g3629$ = SubLFiles.defparameter("S#34608", (SubLObject)$ic134$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31321() {
        module0340.f22938($ic0$);
        module0358.f23774((SubLObject)$ic1$, $ic0$);
        module0340.f22941((SubLObject)$ic14$, (SubLObject)$ic15$);
        module0340.f22941((SubLObject)$ic16$, (SubLObject)$ic17$);
        module0340.f22941((SubLObject)$ic18$, (SubLObject)$ic19$);
        module0340.f22938($ic20$);
        module0358.f23774((SubLObject)$ic1$, $ic20$);
        module0340.f22941((SubLObject)$ic22$, (SubLObject)$ic23$);
        module0340.f22941((SubLObject)$ic24$, (SubLObject)$ic25$);
        module0340.f22941((SubLObject)$ic26$, (SubLObject)$ic27$);
        module0340.f22941((SubLObject)$ic28$, (SubLObject)$ic29$);
        module0340.f22941((SubLObject)$ic30$, (SubLObject)$ic31$);
        module0340.f22938($ic32$);
        module0358.f23774((SubLObject)$ic1$, $ic32$);
        module0340.f22941((SubLObject)$ic33$, (SubLObject)$ic34$);
        module0340.f22941((SubLObject)$ic36$, (SubLObject)$ic37$);
        module0340.f22941((SubLObject)$ic38$, (SubLObject)$ic39$);
        module0340.f22941((SubLObject)$ic33$, (SubLObject)$ic40$);
        module0340.f22941((SubLObject)$ic36$, (SubLObject)$ic41$);
        module0340.f22941((SubLObject)$ic38$, (SubLObject)$ic42$);
        module0340.f22938($ic43$);
        module0358.f23774((SubLObject)$ic1$, $ic43$);
        module0340.f22941((SubLObject)$ic44$, (SubLObject)$ic45$);
        module0340.f22941((SubLObject)$ic48$, (SubLObject)$ic49$);
        module0340.f22941((SubLObject)$ic50$, (SubLObject)$ic51$);
        module0340.f22938($ic52$);
        module0358.f23771((SubLObject)$ic1$, $ic52$, (SubLObject)ONE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic52$, (SubLObject)TWO_INTEGER);
        module0340.f22941((SubLObject)$ic53$, (SubLObject)$ic54$);
        module0340.f22941((SubLObject)$ic55$, (SubLObject)$ic56$);
        module0340.f22938($ic57$);
        module0358.f23771((SubLObject)$ic1$, $ic57$, (SubLObject)ONE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic57$, (SubLObject)TWO_INTEGER);
        module0012.f419((SubLObject)$ic62$);
        module0340.f22941((SubLObject)$ic63$, (SubLObject)$ic64$);
        module0340.f22941((SubLObject)$ic65$, (SubLObject)$ic66$);
        module0340.f22938($ic67$);
        module0358.f23771((SubLObject)$ic1$, $ic67$, (SubLObject)ONE_INTEGER);
        module0012.f419((SubLObject)$ic69$);
        module0340.f22941((SubLObject)$ic70$, (SubLObject)$ic71$);
        module0340.f22941((SubLObject)$ic72$, (SubLObject)$ic73$);
        module0340.f22938($ic74$);
        module0358.f23771((SubLObject)$ic1$, $ic74$, (SubLObject)ONE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic74$, (SubLObject)TWO_INTEGER);
        module0340.f22941((SubLObject)$ic75$, (SubLObject)$ic76$);
        module0340.f22941((SubLObject)$ic77$, (SubLObject)$ic78$);
        module0340.f22938($ic79$);
        module0358.f23771((SubLObject)$ic1$, $ic79$, (SubLObject)ONE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic79$, (SubLObject)TWO_INTEGER);
        module0340.f22941((SubLObject)$ic80$, (SubLObject)$ic81$);
        module0340.f22941((SubLObject)$ic82$, (SubLObject)$ic83$);
        module0340.f22938($ic84$);
        module0358.f23771((SubLObject)$ic1$, $ic84$, (SubLObject)ONE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic84$, (SubLObject)TWO_INTEGER);
        module0340.f22941((SubLObject)$ic85$, (SubLObject)$ic86$);
        module0340.f22941((SubLObject)$ic87$, (SubLObject)$ic88$);
        module0340.f22938($ic89$);
        module0358.f23771((SubLObject)$ic1$, $ic89$, (SubLObject)ONE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic89$, (SubLObject)TWO_INTEGER);
        module0340.f22941((SubLObject)$ic90$, (SubLObject)$ic91$);
        module0340.f22941((SubLObject)$ic92$, (SubLObject)$ic93$);
        module0340.f22938($ic94$);
        module0358.f23771((SubLObject)$ic1$, $ic94$, (SubLObject)ONE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic94$, (SubLObject)TWO_INTEGER);
        module0340.f22941((SubLObject)$ic95$, (SubLObject)$ic96$);
        module0340.f22941((SubLObject)$ic97$, (SubLObject)$ic98$);
        module0340.f22938($ic99$);
        module0358.f23771((SubLObject)$ic1$, $ic99$, (SubLObject)ONE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic99$, (SubLObject)TWO_INTEGER);
        module0340.f22941((SubLObject)$ic100$, (SubLObject)$ic101$);
        module0340.f22941((SubLObject)$ic102$, (SubLObject)$ic103$);
        module0340.f22938($ic104$);
        module0358.f23771((SubLObject)$ic1$, $ic104$, (SubLObject)TWO_INTEGER);
        module0358.f23730((SubLObject)$ic105$, (SubLObject)$ic106$);
        module0340.f22941((SubLObject)$ic107$, (SubLObject)$ic108$);
        module0340.f22941((SubLObject)$ic109$, (SubLObject)$ic110$);
        module0340.f22941((SubLObject)$ic113$, (SubLObject)$ic114$);
        module0340.f22938($ic120$);
        module0358.f23771((SubLObject)$ic1$, $ic120$, (SubLObject)TWO_INTEGER);
        module0358.f23730((SubLObject)$ic121$, (SubLObject)$ic122$);
        module0340.f22941((SubLObject)$ic123$, (SubLObject)$ic124$);
        module0340.f22941((SubLObject)$ic125$, (SubLObject)$ic126$);
        module0340.f22941((SubLObject)$ic128$, (SubLObject)$ic129$);
        module0340.f22938($ic136$);
        module0358.f23730((SubLObject)$ic137$, (SubLObject)$ic138$);
        module0358.f23771((SubLObject)$ic1$, $ic136$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic137$, (SubLObject)$ic139$);
        module0340.f22941((SubLObject)$ic140$, (SubLObject)$ic141$);
        module0340.f22938($ic142$);
        module0358.f23730((SubLObject)$ic137$, (SubLObject)$ic143$);
        module0358.f23771((SubLObject)$ic1$, $ic142$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic146$, (SubLObject)$ic147$);
        module0340.f22941((SubLObject)$ic148$, (SubLObject)$ic149$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31319();
    }
    
    public void initializeVariables() {
        f31320();
    }
    
    public void runTopLevelForms() {
        f31321();
    }
    
    static {
        me = (SubLFile)new module0458();
        $g3610$ = null;
        $g3611$ = null;
        $g3612$ = null;
        $g3613$ = null;
        $g3614$ = null;
        $g3615$ = null;
        $g3616$ = null;
        $g3617$ = null;
        $g3618$ = null;
        $g3619$ = null;
        $g3620$ = null;
        $g3621$ = null;
        $g3622$ = null;
        $g3623$ = null;
        $g3624$ = null;
        $g3625$ = null;
        $g3626$ = null;
        $g3627$ = null;
        $g3628$ = null;
        $g3629$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("nearestIsa"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("ISA");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("S#12398", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("thereExists"));
        $ic6$ = makeSymbol("?NEARER");
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("differentSymbols"));
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("?NEARER"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("knownSentence"));
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("unknownSentence"));
        $ic13$ = makeKeyword("OPAQUE");
        $ic14$ = makeKeyword("REMOVAL-NEAREST-ISA-CHECK");
        $ic15$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestIsa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34589", "CYC"), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34508", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#34507", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestIsa <fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestIsa #$Canada #$IndependentCountry)\n(#$nearestIsa (#$YearFn 2001) #$CalendarYear)") });
        $ic16$ = makeKeyword("REMOVAL-NEAREST-ISA-GENERATE");
        $ic17$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestIsa")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("S#34509", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestIsa")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("OBJECT", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("OBJECT", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34505", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestIsa")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("OBJECT", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#34507", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestIsa <fort> <non fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestIsa #$Canada ?WHAT)\n(#$nearestIsa (#$YearFn 2001) ?WHAT)") });
        $ic18$ = makeKeyword("REMOVAL-NEAREST-INSTANCES-GENERATE");
        $ic19$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestIsa")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34511", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestIsa")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12458", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12458", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34506", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestIsa")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12458", "CYC"))), makeKeyword("SUPPORT"), makeSymbol("S#34507", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestIsa <whatever> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestIsa ?WHAT #$IndependentCountry)") });
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("nearestGenls"));
        $ic21$ = makeKeyword("GENLS");
        $ic22$ = makeKeyword("REMOVAL-NEAREST-GENLS-FORT-CHECK");
        $ic23$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34592", "CYC"), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34516", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#34515", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenls <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenls #$Wine #$AlcoholicBeverage)") });
        $ic24$ = makeKeyword("REMOVAL-NEAREST-GENLS-NAUT-CHECK");
        $ic25$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34592", "CYC"), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34516", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#34515", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenls (<fort> . <fully-bound>) <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenls (#$JuvenileFn #$Cougar) #$JuvenileAnimal)") });
        $ic26$ = makeKeyword("REMOVAL-NEAREST-GENLS-FORT-GENERATE");
        $ic27$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("S#34517", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12109", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12109", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34513", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12109", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#34515", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenls <fort> <non-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenls #$Wine ?WHAT)") });
        $ic28$ = makeKeyword("REMOVAL-NEAREST-GENLS-NAUT-GENERATE");
        $ic29$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34594", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12109", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12109", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34513", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12109", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#34515", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenls (<fort> . <fully-bound>) <non-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenls (#$JuvenileFn #$Cougar) ?WHAT)") });
        $ic30$ = makeKeyword("REMOVAL-NEAREST-SPECS-GENERATE");
        $ic31$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34518", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12112", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12112", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34514", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenls")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12112", "CYC"))), makeKeyword("SUPPORT"), makeSymbol("S#34515", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenls <whatever> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenls ?SPEC #$AlcoholicBeverage)") });
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt"));
        $ic33$ = makeKeyword("REMOVAL-NEAREST-GENL-MTS-CHECK");
        $ic34$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34595", "CYC"), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34522", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlMt #$HumanPerceptionMt #$PerceptionMt)") });
        $ic35$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic36$ = makeKeyword("REMOVAL-NEAREST-GENL-MTS-GENERATE");
        $ic37$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("S#34523", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34609", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34609", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34520", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34609", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <fort> <non-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlMt #$HumanPerceptionMt ?WHAT)") });
        $ic38$ = makeKeyword("REMOVAL-NEAREST-SPEC-MTS-GENERATE");
        $ic39$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34524", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13096", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13096", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34521", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13096", "CYC"))), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <non-fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlMt ?SPEC #$PerceptionMt)") });
        $ic40$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34595", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34525", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlMt #$HumanPerceptionMt #$PerceptionMt)") });
        $ic41$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("S#34523", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34526", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlMt #$HumanPerceptionMt ?WHAT)") });
        $ic42$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlMt")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34524", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34527", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <whatever> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlMt ?SPEC #$PerceptionMt)") });
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("nearestGenlPreds"));
        $ic44$ = makeKeyword("REMOVAL-NEAREST-GENL-PREDS-CHECK");
        $ic45$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenlPreds")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlPreds")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34596", "CYC"), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34529", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlPreds <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlPreds #$performedBy #$doneBy)") });
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic48$ = makeKeyword("REMOVAL-NEAREST-GENL-PREDS-GENERATE");
        $ic49$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenlPreds")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlPreds")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("S#34528", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlPreds")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("OBJECT", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("OBJECT", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34530", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlPreds")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("OBJECT", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlPreds <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlPreds #$performedBy ?WHAT)") });
        $ic50$ = makeKeyword("REMOVAL-NEAREST-SPEC-PREDS-GENERATE");
        $ic51$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenlPreds")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlPreds")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34532", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlPreds")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("OBJECT", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("OBJECT", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34533", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlPreds")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("OBJECT", "CYC"))), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlPreds <whatever> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlPreds ?WHAT #$doneBy)") });
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("nearestCommonIsa"));
        $ic53$ = makeKeyword("REMOVAL-NEAREST-COMMON-ISA-CHECK");
        $ic54$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestCommonIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonIsa")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34597", "CYC"), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34534", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonIsa <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonIsa #$France #$Spain #$IndependentCountry)") });
        $ic55$ = makeKeyword("REMOVAL-NEAREST-COMMON-ISA-GENERATE");
        $ic56$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestCommonIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonIsa")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34598", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonIsa")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34610", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34611", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34610", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34611", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34610", "CYC"), (SubLObject)makeSymbol("S#34611", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34535", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34610", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34611", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonIsa")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34610", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34611", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonIsa <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonIsa #$France #$Spain ?WHAT)") });
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenls"));
        $ic58$ = ConsesLow.list((SubLObject)makeSymbol("S#25108", "CYC"), (SubLObject)makeSymbol("S#25109", "CYC"), (SubLObject)makeSymbol("S#34612", "CYC"));
        $ic59$ = makeSymbol("?COL");
        $ic60$ = constant_handles_oc.f8479((SubLObject)makeString("different"));
        $ic61$ = makeKeyword("CODE");
        $ic62$ = makeSymbol("S#34536", "CYC");
        $ic63$ = makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-CHECK");
        $ic64$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenls")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenls")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34599", "CYC"), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34537", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#34536", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonGenls <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenls #$Beer #$Wine #$AlcoholicBeverage)") });
        $ic65$ = makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-GENERATE");
        $ic66$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenls")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenls")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34600", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenls")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#25108", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#25109", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25108", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25109", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25108", "CYC"), (SubLObject)makeSymbol("S#25109", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34538", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25108", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25109", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenls")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25108", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25109", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#34536", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonGenls <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenls #$Beer #$Wine ?WHAT)") });
        $ic67$ = constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenlsOfSet"));
        $ic68$ = ConsesLow.list((SubLObject)makeSymbol("SET"), (SubLObject)makeSymbol("S#12112", "CYC"));
        $ic69$ = makeSymbol("S#34539", "CYC");
        $ic70$ = makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-OF-SET-CHECK");
        $ic71$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenlsOfSet")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenlsOfSet")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15603", "CYC")), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34599", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenlsOfSet")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12455", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12455", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("SET"), (SubLObject)makeSymbol("S#12455", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34540", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#15671", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12455", "CYC")))), makeKeyword("SUPPORT"), makeSymbol("S#34539", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonGenlsOfSet <set> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenlsOfSet (#$TheSet #$Beer #$Wine) #$AlcoholicBeverage)") });
        $ic72$ = makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-OF-SET-GENERATE");
        $ic73$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenlsOfSet")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenlsOfSet")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#15603", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34600", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenlsOfSet")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("SET")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#19334", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#15671", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenlsOfSet")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("SET")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#34539", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonGenlsOfSet <set> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenlsOfSet (#$TheSet #$Beer #$Wine) ?WHAT)") });
        $ic74$ = constant_handles_oc.f8479((SubLObject)makeString("nearestCommonSpecs"));
        $ic75$ = makeKeyword("REMOVAL-NEAREST-COMMON-SPECS-CHECK");
        $ic76$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestCommonSpecs")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonSpecs")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34601", "CYC"), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34541", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonSpecs <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonSpecs #$HumanAdult #$MaleAnimal #$AdultMalePerson)") });
        $ic77$ = makeKeyword("REMOVAL-NEAREST-COMMON-SPECS-GENERATE");
        $ic78$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestCommonSpecs")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonSpecs")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34602", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonSpecs")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#25108", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#25109", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25108", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25109", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25108", "CYC"), (SubLObject)makeSymbol("S#25109", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34542", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25108", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25109", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonSpecs")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25108", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#25109", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonSpecs <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonSpecs #$HumanAdult #$MaleAnimal ?WHAT)") });
        $ic79$ = constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenlMt"));
        $ic80$ = makeKeyword("REMOVAL-NEAREST-COMMON-GENL-MTS-CHECK");
        $ic81$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenlMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenlMt")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34603", "CYC"), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34543", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonGenlMt <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenlMt #$FrenchLexicalMt #$GermanLexicalMt #$GeneralLexiconMt)") });
        $ic82$ = makeKeyword("REMOVAL-NEAREST-COMMON-GENL-MTS-GENERATE");
        $ic83$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenlMt")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenlMt")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34604", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenlMt")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34269", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34275", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34269", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34275", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34269", "CYC"), (SubLObject)makeSymbol("S#34275", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34544", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34269", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34275", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestCommonGenlMt")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34269", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34275", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonGenlMt <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenlMt #$FrenchLexicalMt #$GermanLexicalMt ?MT)") });
        $ic84$ = constant_handles_oc.f8479((SubLObject)makeString("nearestDifferentIsa"));
        $ic85$ = makeKeyword("REMOVAL-NEAREST-DIFFERENT-ISA-CHECK");
        $ic86$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestDifferentIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestDifferentIsa")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34605", "CYC"), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34545", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestDifferentIsa <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestDifferentIsa #$Canada #$Minnesota-State #$IndependentCountry)") });
        $ic87$ = makeKeyword("REMOVAL-NEAREST-DIFFERENT-ISA-GENERATE");
        $ic88$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestDifferentIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestDifferentIsa")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("S#34547", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestDifferentIsa")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34613", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34614", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34613", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34614", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34613", "CYC"), (SubLObject)makeSymbol("S#34614", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34546", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34613", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34614", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestDifferentIsa")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34613", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34614", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestDifferentIsa <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestDifferentIsa #$Canada #$Minnesota-State ?WHAT)") });
        $ic89$ = constant_handles_oc.f8479((SubLObject)makeString("nearestDifferentGenls"));
        $ic90$ = makeKeyword("REMOVAL-NEAREST-DIFFERENT-GENLS-CHECK");
        $ic91$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestDifferentGenls")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestDifferentGenls")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34606", "CYC"), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34548", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestDifferentGenls <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestDifferentGenls #$Wine #$Milk #$AlcoholicBeverage)") });
        $ic92$ = makeKeyword("REMOVAL-NEAREST-DIFFERENT-GENLS-GENERATE");
        $ic93$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestDifferentGenls")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestDifferentGenls")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("S#34550", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestDifferentGenls")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34613", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34614", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34613", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34614", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34613", "CYC"), (SubLObject)makeSymbol("S#34614", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34549", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34613", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34614", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestDifferentGenls")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34613", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34614", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestDifferentGenls <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestDifferentGenls #$Wine #$Milk ?WHAT)") });
        $ic94$ = constant_handles_oc.f8479((SubLObject)makeString("nearestIsaOfType"));
        $ic95$ = makeKeyword("REMOVAL-NEAREST-ISA-OF-TYPE-CHECK");
        $ic96$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestIsaOfType")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestIsaOfType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34589", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestIsaOfType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12455", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12455", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#12455", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34551", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12455", "CYC")))), makeKeyword("SUPPORT"), makeSymbol("S#34553", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestIsaOfType <fort-or-naut> <fort-or-naut> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestIsaOfType #$ThomasPynchon #$PersonTypeByOccupation #$Writer)") });
        $ic97$ = makeKeyword("REMOVAL-NEAREST-ISA-OF-TYPE-GENERATE");
        $ic98$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestIsaOfType")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestIsaOfType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34554", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestIsaOfType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("TYPE")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34552", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestIsaOfType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#34553", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestIsaOfType <fort-or-naut> <fort-or-naut> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestIsaOfType #$ThomasPynchon #$PersonTypeByOccupation ?WHAT)") });
        $ic99$ = constant_handles_oc.f8479((SubLObject)makeString("nearestGenlsOfType"));
        $ic100$ = makeKeyword("REMOVAL-NEAREST-GENLS-OF-TYPE-CHECK");
        $ic101$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenlsOfType")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlsOfType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34592", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlsOfType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12109", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12112", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12109", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12112", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#12112", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34555", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12109", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12112", "CYC")))), makeKeyword("SUPPORT"), makeSymbol("S#34557", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlsOfType <fort-or-naut> <fort-or-naut> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlsOfType #$Wine #$TangibleStuffCompositionType #$AlcoholicBeverage)") });
        $ic102$ = makeKeyword("REMOVAL-NEAREST-GENLS-OF-TYPE-GENERATE");
        $ic103$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestGenlsOfType")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlsOfType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34558", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlsOfType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12109", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("TYPE")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12109", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34556", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12109", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestGenlsOfType")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12109", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("TYPE")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#34557", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlsOfType <fort-or-naut> <fort-or-naut> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlsOfType #$Wine #$PharmacyProductType ?WHAT)") });
        $ic104$ = constant_handles_oc.f8479((SubLObject)makeString("nearestArgIsa"));
        $ic105$ = makeKeyword("NEAREST-ARG-ISA-UNBOUND-RELATION-AND-COLLECTION-POS");
        $ic106$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestArgIsa")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgIsa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#26436", "CYC"));
        $ic107$ = makeKeyword("REMOVAL-NEAREST-ARG-ISA-CHECK");
        $ic108$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestArgIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgIsa")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1886", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgIsa")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#17706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17706", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#17572", "CYC"), (SubLObject)makeSymbol("S#34615", "CYC"), (SubLObject)makeSymbol("S#17706", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34559", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17706", "CYC")))), makeKeyword("SUPPORT"), makeSymbol("S#34562", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgIsa <fort> <integer> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgIsa #$geographicallySubsumes 1 #$GeographicalThing)") });
        $ic109$ = makeKeyword("REMOVAL-NEAREST-ARG-ISA-GENERATE");
        $ic110$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestArgIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgIsa")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34560", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgIsa")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#17572", "CYC"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34561", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgIsa")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#34562", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgIsa <fort> <integer> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgIsa #$geographicallySubsumes 1 ?WHAT)") });
        $ic111$ = constant_handles_oc.f8479((SubLObject)makeString("argIsa"));
        $ic112$ = makeKeyword("GAF");
        $ic113$ = makeKeyword("REMOVAL-NEAREST-ARG-ISA-GENERATE-REVERSE");
        $ic114$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestArgIsa")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgIsa")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34563", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgIsa")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12455", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12455", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34615", "CYC"), (SubLObject)makeSymbol("S#12455", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34564", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12455", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgIsa")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12455", "CYC"))), makeKeyword("SUPPORT"), makeSymbol("S#34562", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgIsa <not-fully-bound> <integer> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgIsa ?WHAT 1 #$GeographicalThing)") });
        $ic115$ = makeSymbol("S#34567", "CYC");
        $ic116$ = makeSymbol("S#34568", "CYC");
        $ic117$ = makeSymbol("S#34569", "CYC");
        $ic118$ = constant_handles_oc.f8479((SubLObject)makeString("Relation"));
        $ic119$ = ConsesLow.list((SubLObject)makeSymbol("S#34616", "CYC"), (SubLObject)makeSymbol("S#34615", "CYC"), (SubLObject)makeSymbol("S#12455", "CYC"));
        $ic120$ = constant_handles_oc.f8479((SubLObject)makeString("nearestArgGenl"));
        $ic121$ = makeKeyword("NEAREST-ARG-GENL-UNBOUND-RELATION-AND-COLLECTION-POS");
        $ic122$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestArgGenl")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgGenl")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#26436", "CYC"));
        $ic123$ = makeKeyword("REMOVAL-NEAREST-ARG-GENL-CHECK");
        $ic124$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestArgGenl")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgGenl")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1886", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgGenl")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34617", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34617", "CYC")))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#17572", "CYC"), (SubLObject)makeSymbol("S#34615", "CYC"), (SubLObject)makeSymbol("S#34617", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34570", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34617", "CYC")))), makeKeyword("SUPPORT"), makeSymbol("S#34573", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgGenl <fort> <integer> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgGenl #$transportees-Type 1 #$GeographicalThing)") });
        $ic125$ = makeKeyword("REMOVAL-NEAREST-ARG-GENL-GENERATE");
        $ic126$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestArgGenl")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgGenl")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34571", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgGenl")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#17572", "CYC"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34572", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgGenl")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#17572", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("S#34573", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgGenl <fort> <integer> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgGenl #$transportees-Type 1 ?WHAT)") });
        $ic127$ = constant_handles_oc.f8479((SubLObject)makeString("argGenl"));
        $ic128$ = makeKeyword("REMOVAL-NEAREST-ARG-GENL-GENERATE-REVERSE");
        $ic129$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearestArgGenl")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgGenl")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34574", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgGenl")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12455", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12455", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34615", "CYC"), (SubLObject)makeSymbol("S#12455", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34575", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12455", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearestArgGenl")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34615", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12455", "CYC"))), makeKeyword("SUPPORT"), makeSymbol("S#34573", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgGenl <not-fully-bound> <integer> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgGenl ?WHAT 1 #$GeographicalThing)") });
        $ic130$ = makeSymbol("S#34578", "CYC");
        $ic131$ = makeSymbol("S#34579", "CYC");
        $ic132$ = makeSymbol("S#34580", "CYC");
        $ic133$ = makeInteger(10000);
        $ic134$ = makeInteger(212);
        $ic135$ = makeSymbol("NUMBERP");
        $ic136$ = constant_handles_oc.f8479((SubLObject)makeString("nearNarrowSpecs"));
        $ic137$ = makeKeyword("NEAR-NARROW-SPECS-GENERATE-POS");
        $ic138$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearNarrowSpecs")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearNarrowSpecs")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#26426", "CYC"));
        $ic139$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearNarrowSpecs")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearNarrowSpecs")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34582", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearNarrowSpecs")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12458", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12458", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34583", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearNarrowSpecs")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12458", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearNarrowSpecs <fort> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearNarrowSpecs #$Animal ?WHAT)") });
        $ic140$ = makeKeyword("NEAR-NARROW-SPECS-CHECK-POS");
        $ic141$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("nearNarrowSpecs")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nearNarrowSpecs")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34584", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$nearNarrowSpecs <fort> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearNarrowSpecs #$Animal #$Dog)") });
        $ic142$ = constant_handles_oc.f8479((SubLObject)makeString("thresholdSpecs"));
        $ic143$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("thresholdSpecs")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thresholdSpecs")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#26426", "CYC"));
        $ic144$ = constant_handles_oc.f8479((SubLObject)makeString("includeInThresholdSpecs"));
        $ic145$ = constant_handles_oc.f8479((SubLObject)makeString("excludeFromThresholdSpecs"));
        $ic146$ = makeKeyword("THRESHOLD-SPECS-GENERATE-POS");
        $ic147$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("thresholdSpecs")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thresholdSpecs")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34585", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thresholdSpecs")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12458", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12458", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34587", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thresholdSpecs")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#12458", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$thresholdSpecs <fort> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$thresholdSpecs #$Animal ?WHAT)") });
        $ic148$ = makeKeyword("THRESHOLD-SPECS-CHECK-POS");
        $ic149$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("thresholdSpecs")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thresholdSpecs")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34588", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$thresholdSpecs <fort> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$thresholdSpecs #$Animal #$Dog)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1044 ms
	
	Decompiled with Procyon 0.5.32.
*/