package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0216 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0216";
    public static final String myFingerPrint = "69229065429c80d66beaac88df5c91ed11ad4af0f9e68f45fed06149277dfee1";
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
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
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLList $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLList $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLList $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLList $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    
    public static SubLObject f14167(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        final SubLObject var9 = module0215.f14160(var6, (SubLObject)$ic1$);
        final SubLObject var10 = module0215.f14160(var6, (SubLObject)$ic2$);
        final SubLObject var11 = (SubLObject)$ic3$;
        final SubLObject var12 = (SubLObject)$ic4$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic6$, var7), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list(reader.bq_cons(var11, (SubLObject)$ic8$)), (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list(var12, var7), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.listS(var9, var12, var7, ConsesLow.append(var8, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var11))), (SubLObject)ConsesLow.list((SubLObject)$ic12$, var5, var11)), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)ConsesLow.listS(var10, var7, ConsesLow.append(var8, (SubLObject)NIL)))), (SubLObject)ConsesLow.listS((SubLObject)$ic12$, var5, (SubLObject)$ic14$)));
    }
    
    public static SubLObject f14168(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic17$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic17$);
        final SubLObject var6 = var4.rest();
        var4 = var4.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic17$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic17$);
        var8 = var4.first();
        final SubLObject var9;
        var4 = (var9 = var4.rest());
        var4 = var6;
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)$ic18$, var8), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.listS(var7, (SubLObject)$ic18$, var8, ConsesLow.append(var9, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)$ic19$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic17$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14169(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        final SubLObject var9 = module0215.f14160(var6, (SubLObject)$ic2$);
        final SubLObject var10 = module0215.f14160(var6, (SubLObject)$ic21$);
        final SubLObject var11 = module0215.f14160(var6, (SubLObject)$ic22$);
        final SubLObject var12 = f14170(var6);
        if (!var12.isInteger()) {
            Errors.error((SubLObject)$ic23$, var6);
        }
        if (f14171(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numGE(var12)) {
            Errors.error((SubLObject)$ic24$);
        }
        final SubLObject var13 = (SubLObject)$ic25$;
        final SubLObject var14 = (SubLObject)$ic26$;
        final SubLObject var15 = (SubLObject)$ic27$;
        final SubLObject var16 = (SubLObject)$ic28$;
        final SubLObject var17 = (SubLObject)$ic29$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var13, reader.bq_cons((SubLObject)$ic30$, ConsesLow.append(var8, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic31$, var13, (SubLObject)ConsesLow.listS((SubLObject)$ic32$, var12, (SubLObject)$ic33$)), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.listS(var9, var7, ConsesLow.append(var8, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic10$, var15, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var5, (SubLObject)ConsesLow.list((SubLObject)$ic34$, var15)))), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.listS((SubLObject)$ic35$, var13, ConsesLow.append(var8, (SubLObject)NIL))), (SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var10), var7, var14))), (SubLObject)ConsesLow.list((SubLObject)$ic38$, (SubLObject)ConsesLow.list(var17, var16), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5, (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var11), var7, (SubLObject)ConsesLow.list((SubLObject)$ic39$, var14, (SubLObject)ConsesLow.list((SubLObject)$ic40$, var17))))))));
    }
    
    public static SubLObject f14172(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        final SubLObject var9 = module0215.f14160(var6, (SubLObject)$ic1$);
        final SubLObject var10 = module0215.f14160(var6, (SubLObject)$ic41$);
        return (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)$ic42$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var5, (SubLObject)ConsesLow.listS(var10, var7, ConsesLow.append(var8, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic6$, var7), (SubLObject)ConsesLow.list((SubLObject)$ic15$, var5, (SubLObject)ConsesLow.listS(var9, var7, ConsesLow.append(var8, (SubLObject)NIL))), (SubLObject)ConsesLow.listS((SubLObject)$ic20$, var5, var6, var7, ConsesLow.append(var8, (SubLObject)NIL))));
    }
    
    public static SubLObject f14173(final SubLObject var32, final SubLObject var33) {
        return Numbers.numGE(var32, var33);
    }
    
    public static SubLObject f14174(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic44$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic44$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic44$);
        final SubLObject var7 = var4.rest();
        var4 = var4.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic44$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic44$);
        var9 = var4.first();
        final SubLObject var10;
        var4 = (var10 = var4.rest());
        var4 = var7;
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)$ic18$, var9), (SubLObject)ConsesLow.list((SubLObject)$ic45$, (SubLObject)ConsesLow.list((SubLObject)$ic46$, var5, var6), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.listS(var8, (SubLObject)$ic18$, var9, ConsesLow.append(var10, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)$ic19$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic44$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14175(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic48$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic48$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic48$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic48$);
        var8 = var4.first();
        final SubLObject var9;
        var4 = (var9 = var4.rest());
        final SubLObject var10 = module0215.f14160(var7, (SubLObject)$ic2$);
        final SubLObject var11 = module0215.f14160(var7, (SubLObject)$ic21$);
        final SubLObject var12 = module0215.f14160(var7, (SubLObject)$ic49$);
        final SubLObject var13 = f14170(var7);
        if (!var13.isInteger()) {
            Errors.error((SubLObject)$ic50$, var7);
        }
        if (f14171(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numGE(var13)) {
            Errors.error((SubLObject)$ic51$);
        }
        final SubLObject var14 = (SubLObject)$ic52$;
        final SubLObject var15 = (SubLObject)$ic53$;
        final SubLObject var16 = (SubLObject)$ic54$;
        final SubLObject var17 = (SubLObject)$ic55$;
        final SubLObject var18 = (SubLObject)$ic56$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, reader.bq_cons((SubLObject)$ic30$, ConsesLow.append(var9, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic31$, var14, (SubLObject)ConsesLow.listS((SubLObject)$ic32$, var13, (SubLObject)$ic33$)), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.listS(var10, var8, ConsesLow.append(var9, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic10$, var16, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var5, (SubLObject)ConsesLow.list((SubLObject)$ic57$, var16, var6)))), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.listS((SubLObject)$ic35$, var14, ConsesLow.append(var9, (SubLObject)NIL))), (SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var11), var8, var15))), (SubLObject)ConsesLow.list((SubLObject)$ic38$, (SubLObject)ConsesLow.list(var18, var17), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5, (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var12), var8, var6, (SubLObject)ConsesLow.list((SubLObject)$ic39$, var15, (SubLObject)ConsesLow.list((SubLObject)$ic40$, var18))))))));
    }
    
    public static SubLObject f14176(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic48$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic48$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic48$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic48$);
        var8 = var4.first();
        final SubLObject var9;
        var4 = (var9 = var4.rest());
        final SubLObject var10 = module0215.f14160(var7, (SubLObject)$ic1$);
        final SubLObject var11 = module0215.f14160(var7, (SubLObject)$ic41$);
        return (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)$ic42$, (SubLObject)ConsesLow.list((SubLObject)$ic58$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var5, (SubLObject)ConsesLow.listS(var11, var8, ConsesLow.append(var9, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic46$, var5, var6), (SubLObject)ConsesLow.list((SubLObject)$ic12$, var5, var6))), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic6$, var8), (SubLObject)ConsesLow.list((SubLObject)$ic43$, var5, var6, (SubLObject)ConsesLow.listS(var10, var8, ConsesLow.append(var9, (SubLObject)NIL))), (SubLObject)ConsesLow.listS((SubLObject)$ic47$, var5, var6, var7, var8, ConsesLow.append(var9, (SubLObject)NIL))));
    }
    
    public static SubLObject f14177(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        final SubLObject var9 = module0215.f14160(var6, (SubLObject)$ic59$);
        final SubLObject var10 = module0215.f14160(var6, (SubLObject)$ic2$);
        final SubLObject var11 = (SubLObject)$ic60$;
        final SubLObject var12 = (SubLObject)$ic61$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic6$, var7), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list(reader.bq_cons(var11, (SubLObject)$ic62$)), (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list(var12, var7), (SubLObject)ConsesLow.list((SubLObject)$ic12$, var11, (SubLObject)ConsesLow.listS(var9, var12, var11, var7, ConsesLow.append(var8, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic12$, var5, var11)), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic63$, (SubLObject)ConsesLow.listS(var10, var7, ConsesLow.append(var8, (SubLObject)NIL)))), (SubLObject)ConsesLow.listS((SubLObject)$ic12$, var5, (SubLObject)$ic64$)));
    }
    
    public static SubLObject f14178(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        final SubLObject var9 = module0215.f14160(var6, (SubLObject)$ic1$);
        final SubLObject var10 = module0215.f14160(var6, (SubLObject)$ic59$);
        final SubLObject var11 = (SubLObject)$ic67$;
        final SubLObject var12 = (SubLObject)$ic68$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list(reader.bq_cons(var11, (SubLObject)$ic62$)), (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list(var12, var7), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.listS(var9, var12, var7, ConsesLow.append(var8, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic69$, (SubLObject)ConsesLow.list((SubLObject)$ic70$, var12)), (SubLObject)ConsesLow.list((SubLObject)$ic12$, var11, (SubLObject)ConsesLow.listS(var10, var12, var11, var7, ConsesLow.append(var8, (SubLObject)NIL)))))), (SubLObject)ConsesLow.list((SubLObject)$ic12$, var5, var11));
    }
    
    public static SubLObject f14179(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        final SubLObject var9 = module0215.f14160(var6, (SubLObject)$ic21$);
        final SubLObject var10 = module0215.f14160(var6, (SubLObject)$ic2$);
        final SubLObject var11 = module0215.f14160(var6, (SubLObject)$ic22$);
        final SubLObject var12 = f14170(var6);
        if (!var12.isInteger()) {
            Errors.error((SubLObject)$ic23$, var6);
        }
        if (f14171(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numGE(var12)) {
            Errors.error((SubLObject)$ic24$);
        }
        final SubLObject var13 = (SubLObject)$ic72$;
        final SubLObject var14 = (SubLObject)$ic73$;
        final SubLObject var15 = (SubLObject)$ic74$;
        final SubLObject var16 = (SubLObject)$ic75$;
        final SubLObject var17 = (SubLObject)$ic76$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var13, reader.bq_cons((SubLObject)$ic30$, ConsesLow.append(var8, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic31$, var13, (SubLObject)ConsesLow.listS((SubLObject)$ic32$, var12, (SubLObject)$ic33$)), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.listS(var10, var7, ConsesLow.append(var8, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic10$, var15, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var5, (SubLObject)ConsesLow.list((SubLObject)$ic77$, var15)))), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.listS((SubLObject)$ic35$, var13, ConsesLow.append(var8, (SubLObject)NIL))), (SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var9), var7, var14))), (SubLObject)ConsesLow.list((SubLObject)$ic38$, (SubLObject)ConsesLow.list(var17, var16), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic78$, (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var11), var7, (SubLObject)ConsesLow.list((SubLObject)$ic39$, var14, (SubLObject)ConsesLow.list((SubLObject)$ic40$, var17)))), (SubLObject)ConsesLow.list((SubLObject)$ic79$, var17, var5))))));
    }
    
    public static SubLObject f14180(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        final SubLObject var9 = module0215.f14160(var6, (SubLObject)$ic21$);
        return (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)$ic42$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var5, (SubLObject)ConsesLow.listS(var9, var7, ConsesLow.append(var8, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic6$, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic65$, var5, var6, var7, ConsesLow.append(var8, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic71$, var5, var6, var7, ConsesLow.append(var8, (SubLObject)NIL))));
    }
    
    public static SubLObject f14170(final SubLObject var6) {
        final SubLObject var7 = module0215.f14160(var6, (SubLObject)$ic81$);
        SubLObject var8 = (SubLObject)ONE_INTEGER;
        SubLObject var9 = var7;
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            if (NIL != conses_high.getf(var10, (SubLObject)$ic82$, (SubLObject)UNPROVIDED)) {
                return var8;
            }
            var8 = Numbers.add(var8, (SubLObject)ONE_INTEGER);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14181(final SubLObject var56, SubLObject var57, SubLObject var58, SubLObject var59, SubLObject var60, SubLObject var61) {
        if (var57 == UNPROVIDED) {
            var57 = (SubLObject)NIL;
        }
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)NIL;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        SubLObject var62 = (SubLObject)NIL;
        if (var56.numGE((SubLObject)ONE_INTEGER)) {
            var62 = (SubLObject)ConsesLow.cons(var57, var62);
        }
        if (var56.numGE((SubLObject)TWO_INTEGER)) {
            var62 = (SubLObject)ConsesLow.cons(var58, var62);
        }
        if (var56.numGE((SubLObject)THREE_INTEGER)) {
            var62 = (SubLObject)ConsesLow.cons(var59, var62);
        }
        if (var56.numGE((SubLObject)FOUR_INTEGER)) {
            var62 = (SubLObject)ConsesLow.cons(var60, var62);
        }
        if (var56.numGE((SubLObject)FIVE_INTEGER)) {
            var62 = (SubLObject)ConsesLow.cons(var61, var62);
        }
        return Sequences.nreverse(var62);
    }
    
    public static SubLObject f14171(SubLObject var57, SubLObject var58, SubLObject var59, SubLObject var60, SubLObject var61) {
        if (var57 == UNPROVIDED) {
            var57 = (SubLObject)NIL;
        }
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)NIL;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        SubLObject var62 = (SubLObject)ZERO_INTEGER;
        if (NIL == var57) {
            return var62;
        }
        var62 = Numbers.add(var62, (SubLObject)ONE_INTEGER);
        if (NIL == var58) {
            return var62;
        }
        var62 = Numbers.add(var62, (SubLObject)ONE_INTEGER);
        if (NIL == var59) {
            return var62;
        }
        var62 = Numbers.add(var62, (SubLObject)ONE_INTEGER);
        if (NIL == var60) {
            return var62;
        }
        var62 = Numbers.add(var62, (SubLObject)ONE_INTEGER);
        if (NIL == var61) {
            return var62;
        }
        var62 = Numbers.add(var62, (SubLObject)ONE_INTEGER);
        return var62;
    }
    
    public static SubLObject f14182(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic83$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic83$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic83$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic83$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var70_71 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic83$);
            var70_71 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic83$);
            if (NIL == conses_high.member(var70_71, (SubLObject)$ic84$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var70_71 == $ic85$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic83$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)$ic88$, var8), (SubLObject)$ic86$, var13), (SubLObject)ConsesLow.listS((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic89$, var6), ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f14183(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic90$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic90$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic90$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var81_82 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic90$);
            var81_82 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic90$);
            if (NIL == conses_high.member(var81_82, (SubLObject)$ic84$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var81_82 == $ic85$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic90$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic91$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic92$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)$ic86$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic93$, var14), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f14184(final SubLObject var7) {
        return module0212.f13825(module0212.f13787(var7), (SubLObject)$ic94$);
    }
    
    public static SubLObject f14185(final SubLObject var84) {
        return (SubLObject)T;
    }
    
    public static SubLObject f14186(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic83$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic83$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic83$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic83$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var91_92 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic83$);
            var91_92 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic83$);
            if (NIL == conses_high.member(var91_92, (SubLObject)$ic84$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var91_92 == $ic85$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic83$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)$ic95$, var8), (SubLObject)$ic86$, var13), (SubLObject)ConsesLow.listS((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic96$, var6), ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f14187(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic90$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic90$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic90$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var100_101 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic90$);
            var100_101 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic90$);
            if (NIL == conses_high.member(var100_101, (SubLObject)$ic84$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var100_101 == $ic85$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic90$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic97$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic98$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)$ic86$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic93$, var14), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f14188(final SubLObject var7) {
        return module0212.f13825(module0212.f13787(var7), (SubLObject)$ic99$);
    }
    
    public static SubLObject f14189(final SubLObject var84) {
        return (SubLObject)T;
    }
    
    public static SubLObject f14190(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic100$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic100$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic100$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic100$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var111_112 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic100$);
            var111_112 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic100$);
            if (NIL == conses_high.member(var111_112, (SubLObject)$ic84$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var111_112 == $ic85$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic100$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)$ic101$, var8), (SubLObject)$ic86$, var13), (SubLObject)ConsesLow.listS((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic102$, var6), ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f14191(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic103$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic103$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic103$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var120_121 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic103$);
            var120_121 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic103$);
            if (NIL == conses_high.member(var120_121, (SubLObject)$ic84$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var120_121 == $ic85$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic103$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic104$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic105$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)$ic86$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic93$, var14), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f14192(final SubLObject var107) {
        return module0212.f13825(module0212.f13787(var107), (SubLObject)$ic106$);
    }
    
    public static SubLObject f14193(final SubLObject var84) {
        return (SubLObject)T;
    }
    
    public static SubLObject f14194(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic100$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic100$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic100$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic100$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var129_130 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic100$);
            var129_130 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic100$);
            if (NIL == conses_high.member(var129_130, (SubLObject)$ic84$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var129_130 == $ic85$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic100$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)$ic107$, var8), (SubLObject)$ic86$, var13), (SubLObject)ConsesLow.listS((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic102$, var6), ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f14195(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic103$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic103$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic103$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var138_139 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic103$);
            var138_139 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic103$);
            if (NIL == conses_high.member(var138_139, (SubLObject)$ic84$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var138_139 == $ic85$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic103$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic108$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic109$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)$ic86$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic93$, var14), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f14196(final SubLObject var107) {
        return module0212.f13825(module0212.f13787(var107), (SubLObject)$ic110$);
    }
    
    public static SubLObject f14197(final SubLObject var84) {
        return (SubLObject)T;
    }
    
    public static SubLObject f14198(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic112$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic112$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic112$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic112$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var148_149 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic112$);
            var148_149 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic112$);
            if (NIL == conses_high.member(var148_149, (SubLObject)$ic84$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var148_149 == $ic85$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic112$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)$ic113$, var8), (SubLObject)$ic86$, var13), (SubLObject)ConsesLow.listS((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic114$, var6), ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f14199(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var157_158 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic115$);
            var157_158 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic115$);
            if (NIL == conses_high.member(var157_158, (SubLObject)$ic84$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var157_158 == $ic85$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic115$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic116$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic117$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)$ic86$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic93$, var14), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f14200(final SubLObject var144) {
        return module0212.f13825(module0212.f13787(var144), (SubLObject)$ic118$);
    }
    
    public static SubLObject f14201(final SubLObject var84) {
        return (SubLObject)T;
    }
    
    public static SubLObject f14202(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic112$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic112$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic112$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic112$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var166_167 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic112$);
            var166_167 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic112$);
            if (NIL == conses_high.member(var166_167, (SubLObject)$ic84$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var166_167 == $ic85$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic112$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)$ic119$, var8), (SubLObject)$ic86$, var13), (SubLObject)ConsesLow.listS((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic120$, var6), ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f14203(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var175_176 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic115$);
            var175_176 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic115$);
            if (NIL == conses_high.member(var175_176, (SubLObject)$ic84$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var175_176 == $ic85$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic115$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic121$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic122$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)$ic86$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic93$, var14), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f14204(final SubLObject var144) {
        return module0212.f13825(module0212.f13787(var144), (SubLObject)$ic123$);
    }
    
    public static SubLObject f14205(final SubLObject var84) {
        return (SubLObject)T;
    }
    
    public static SubLObject f14206(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic112$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic112$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic112$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic112$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var184_185 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic112$);
            var184_185 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic112$);
            if (NIL == conses_high.member(var184_185, (SubLObject)$ic84$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var184_185 == $ic85$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic112$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)$ic124$, var8), (SubLObject)$ic86$, var13), (SubLObject)ConsesLow.listS((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic125$, var6), ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f14207(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var193_194 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic115$);
            var193_194 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic115$);
            if (NIL == conses_high.member(var193_194, (SubLObject)$ic84$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var193_194 == $ic85$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic115$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic126$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic127$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)$ic86$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic93$, var14), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f14208(final SubLObject var144) {
        return module0212.f13825(module0212.f13787(var144), (SubLObject)$ic128$);
    }
    
    public static SubLObject f14209(final SubLObject var84) {
        return (SubLObject)T;
    }
    
    public static SubLObject f14210() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14167", "S#17090");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14168", "S#17091");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14169", "S#17092");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14172", "S#17093");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14173", "S#17094", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14174", "S#17095");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14175", "S#17096");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14176", "S#17097");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14177", "S#17098");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14178", "S#17099");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14179", "S#17100");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14180", "S#17101");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14170", "S#17102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14181", "S#17103", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14171", "S#17104", 0, 5, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14182", "S#17105");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14183", "S#17106");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14184", "S#17107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14185", "S#17108", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14186", "S#17109");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14187", "S#17110");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14188", "S#17111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14189", "S#17112", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14190", "S#17113");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14191", "S#17114");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14192", "S#17115", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14193", "S#17116", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14194", "S#17117");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14195", "S#17118");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14196", "S#17119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14197", "S#17120", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14198", "S#17121");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14199", "S#17122");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14200", "S#17123", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14201", "S#17124", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14202", "S#17125");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14203", "S#17126");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14204", "S#17127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14205", "S#17128", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14206", "S#17129");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0216", "f14207", "S#17130");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14208", "S#17131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0216", "f14209", "S#17132", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14211() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14212() {
        module0002.f50((SubLObject)$ic15$, (SubLObject)$ic16$);
        module0002.f50((SubLObject)$ic20$, (SubLObject)$ic16$);
        module0002.f50((SubLObject)$ic43$, (SubLObject)$ic16$);
        module0002.f50((SubLObject)$ic47$, (SubLObject)$ic16$);
        module0002.f50((SubLObject)$ic65$, (SubLObject)$ic66$);
        module0002.f50((SubLObject)$ic71$, (SubLObject)$ic66$);
        module0002.f50((SubLObject)$ic80$, (SubLObject)$ic20$);
        module0002.f50((SubLObject)$ic35$, (SubLObject)$ic20$);
        module0002.f50((SubLObject)$ic30$, (SubLObject)$ic20$);
        module0002.f50((SubLObject)$ic88$, (SubLObject)$ic92$);
        module0002.f50((SubLObject)$ic89$, (SubLObject)$ic92$);
        module0002.f50((SubLObject)$ic95$, (SubLObject)$ic98$);
        module0002.f50((SubLObject)$ic96$, (SubLObject)$ic98$);
        module0002.f50((SubLObject)$ic101$, (SubLObject)$ic105$);
        module0002.f50((SubLObject)$ic102$, (SubLObject)$ic105$);
        module0002.f50((SubLObject)$ic107$, (SubLObject)$ic109$);
        module0002.f50((SubLObject)$ic111$, (SubLObject)$ic109$);
        module0002.f50((SubLObject)$ic113$, (SubLObject)$ic117$);
        module0002.f50((SubLObject)$ic114$, (SubLObject)$ic117$);
        module0002.f50((SubLObject)$ic119$, (SubLObject)$ic122$);
        module0002.f50((SubLObject)$ic120$, (SubLObject)$ic122$);
        module0002.f50((SubLObject)$ic124$, (SubLObject)$ic127$);
        module0002.f50((SubLObject)$ic125$, (SubLObject)$ic127$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f14210();
    }
    
    public void initializeVariables() {
        f14211();
    }
    
    public void runTopLevelForms() {
        f14212();
    }
    
    static {
        me = (SubLFile)new module0216();
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#3267", "CYC"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#8831", "CYC"));
        $ic1$ = makeKeyword("SIMPLE-MATCH-FUNCTION");
        $ic2$ = makeKeyword("GET-SUBINDEX-FUNCTION");
        $ic3$ = makeUninternedSymbol("US#33E32D8");
        $ic4$ = makeUninternedSymbol("US#74E0897");
        $ic5$ = makeSymbol("PIF");
        $ic6$ = makeSymbol("SIMPLE-INDEXED-TERM-P");
        $ic7$ = makeSymbol("CLET");
        $ic8$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic9$ = makeSymbol("S#12772", "CYC");
        $ic10$ = makeSymbol("PWHEN");
        $ic11$ = makeSymbol("CINC");
        $ic12$ = makeSymbol("CSETQ");
        $ic13$ = makeSymbol("S#17133", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FIF"), (SubLObject)makeSymbol("S#17133", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("SUBINDEX-LEAF-COUNT"), (SubLObject)makeSymbol("S#17133", "CYC")), (SubLObject)ZERO_INTEGER));
        $ic15$ = makeSymbol("S#17091", "CYC");
        $ic16$ = makeSymbol("S#17093", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("S#17134", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC")));
        $ic18$ = makeSymbol("S#17135", "CYC");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("RELEVANT-MT?"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION-MT"), (SubLObject)makeSymbol("S#17135", "CYC")));
        $ic20$ = makeSymbol("S#17092", "CYC");
        $ic21$ = makeKeyword("KEY-FUNCTION");
        $ic22$ = makeKeyword("RELEVANT-NUM-FUNCTION");
        $ic23$ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT called on an index (~s) without an mt layer");
        $ic24$ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT called with too many arguments");
        $ic25$ = makeUninternedSymbol("US#213E720");
        $ic26$ = makeUninternedSymbol("US#78CFC94");
        $ic27$ = makeUninternedSymbol("US#2D3D43C");
        $ic28$ = makeUninternedSymbol("US#2B43232");
        $ic29$ = makeUninternedSymbol("US#1A4B619");
        $ic30$ = makeSymbol("S#17104", "CYC");
        $ic31$ = makeSymbol("=");
        $ic32$ = makeSymbol("-");
        $ic33$ = ConsesLow.list((SubLObject)ONE_INTEGER);
        $ic34$ = makeSymbol("S#17136", "CYC");
        $ic35$ = makeSymbol("S#17103", "CYC");
        $ic36$ = makeSymbol("APPLY");
        $ic37$ = makeSymbol("QUOTE");
        $ic38$ = makeSymbol("CDOLIST");
        $ic39$ = makeSymbol("APPEND");
        $ic40$ = makeSymbol("LIST");
        $ic41$ = makeKeyword("NUM-FUNCTION");
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("S#17137", "CYC"));
        $ic43$ = makeSymbol("S#17095", "CYC");
        $ic44$ = ConsesLow.list((SubLObject)makeSymbol("S#17134", "CYC"), (SubLObject)makeSymbol("S#10875", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC")));
        $ic45$ = makeSymbol("PUNLESS");
        $ic46$ = makeSymbol("S#17094", "CYC");
        $ic47$ = makeSymbol("S#17096", "CYC");
        $ic48$ = ConsesLow.list((SubLObject)makeSymbol("S#3267", "CYC"), (SubLObject)makeSymbol("S#10875", "CYC"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#8831", "CYC"));
        $ic49$ = makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF");
        $ic50$ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF called on an index (~s) without an mt layer");
        $ic51$ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF called with too many arguments");
        $ic52$ = makeUninternedSymbol("US#213E720");
        $ic53$ = makeUninternedSymbol("US#78CFC94");
        $ic54$ = makeUninternedSymbol("US#2D3D43C");
        $ic55$ = makeUninternedSymbol("US#2B43232");
        $ic56$ = makeUninternedSymbol("US#1A4B619");
        $ic57$ = makeSymbol("S#17138", "CYC");
        $ic58$ = makeSymbol("PROGN");
        $ic59$ = makeKeyword("SIMPLE-KEY-FUNCTION");
        $ic60$ = makeUninternedSymbol("US#36728AC");
        $ic61$ = makeUninternedSymbol("US#74E0897");
        $ic62$ = ConsesLow.list((SubLObject)NIL);
        $ic63$ = makeSymbol("S#17139", "CYC");
        $ic64$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("INTERMEDIATE-INDEX-P"), (SubLObject)makeSymbol("S#17139", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("INTERMEDIATE-INDEX-KEYS"), (SubLObject)makeSymbol("S#17139", "CYC"))));
        $ic65$ = makeSymbol("S#17099", "CYC");
        $ic66$ = makeSymbol("S#17101", "CYC");
        $ic67$ = makeUninternedSymbol("US#36728AC");
        $ic68$ = makeUninternedSymbol("US#74E0897");
        $ic69$ = makeSymbol("RELEVANT-MT?");
        $ic70$ = makeSymbol("ASSERTION-MT");
        $ic71$ = makeSymbol("S#17100", "CYC");
        $ic72$ = makeUninternedSymbol("US#213E720");
        $ic73$ = makeUninternedSymbol("US#78CFC94");
        $ic74$ = makeUninternedSymbol("US#2D3D43C");
        $ic75$ = makeUninternedSymbol("US#2B43232");
        $ic76$ = makeUninternedSymbol("US#1A4B619");
        $ic77$ = makeSymbol("S#17140", "CYC");
        $ic78$ = makeSymbol("PLUSP");
        $ic79$ = makeSymbol("CPUSH");
        $ic80$ = makeSymbol("S#17102", "CYC");
        $ic81$ = makeKeyword("KEYS");
        $ic82$ = makeKeyword("MT?");
        $ic83$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("S#17133", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic84$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic85$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic86$ = makeKeyword("DONE");
        $ic87$ = makeSymbol("DO-INTERMEDIATE-INDEX");
        $ic88$ = makeSymbol("S#17107", "CYC");
        $ic89$ = makeSymbol("S#17108", "CYC");
        $ic90$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic91$ = makeUninternedSymbol("US#5E7BF83");
        $ic92$ = makeSymbol("S#17105", "CYC");
        $ic93$ = makeSymbol("IGNORE");
        $ic94$ = makeKeyword("GAF-ARG");
        $ic95$ = makeSymbol("S#17111", "CYC");
        $ic96$ = makeSymbol("S#17112", "CYC");
        $ic97$ = makeUninternedSymbol("US#5E7BF83");
        $ic98$ = makeSymbol("S#17109", "CYC");
        $ic99$ = makeKeyword("NART-ARG");
        $ic100$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#17133", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic101$ = makeSymbol("S#17115", "CYC");
        $ic102$ = makeSymbol("S#17116", "CYC");
        $ic103$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic104$ = makeUninternedSymbol("US#5E7BF83");
        $ic105$ = makeSymbol("S#17113", "CYC");
        $ic106$ = makeKeyword("PREDICATE-RULE");
        $ic107$ = makeSymbol("S#17119", "CYC");
        $ic108$ = makeUninternedSymbol("US#5E7BF83");
        $ic109$ = makeSymbol("S#17117", "CYC");
        $ic110$ = makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");
        $ic111$ = makeSymbol("S#17120", "CYC");
        $ic112$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#17133", "CYC"), (SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic113$ = makeSymbol("S#17123", "CYC");
        $ic114$ = makeSymbol("S#17124", "CYC");
        $ic115$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic116$ = makeUninternedSymbol("US#5E7BF83");
        $ic117$ = makeSymbol("S#17121", "CYC");
        $ic118$ = makeKeyword("ISA-RULE");
        $ic119$ = makeSymbol("S#17127", "CYC");
        $ic120$ = makeSymbol("S#17128", "CYC");
        $ic121$ = makeUninternedSymbol("US#5E7BF83");
        $ic122$ = makeSymbol("S#17125", "CYC");
        $ic123$ = makeKeyword("GENLS-RULE");
        $ic124$ = makeSymbol("S#17131", "CYC");
        $ic125$ = makeSymbol("S#17132", "CYC");
        $ic126$ = makeUninternedSymbol("US#5E7BF83");
        $ic127$ = makeSymbol("S#17129", "CYC");
        $ic128$ = makeKeyword("GENL-MT-RULE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 293 ms
	
	Decompiled with Procyon 0.5.32.
*/