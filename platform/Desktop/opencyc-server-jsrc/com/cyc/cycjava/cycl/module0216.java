package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        SubLObject var5 = (SubLObject)module0216.NIL;
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        final SubLObject var9 = module0215.f14160(var6, (SubLObject)module0216.$ic1$);
        final SubLObject var10 = module0215.f14160(var6, (SubLObject)module0216.$ic2$);
        final SubLObject var11 = (SubLObject)module0216.$ic3$;
        final SubLObject var12 = (SubLObject)module0216.$ic4$;
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic6$, var7), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic7$, (SubLObject)ConsesLow.list(reader.bq_cons(var11, (SubLObject)module0216.$ic8$)), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic9$, (SubLObject)ConsesLow.list(var12, var7), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic10$, (SubLObject)ConsesLow.listS(var9, var12, var7, ConsesLow.append(var8, (SubLObject)module0216.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic11$, var11))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic12$, var5, var11)), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0216.$ic13$, (SubLObject)ConsesLow.listS(var10, var7, ConsesLow.append(var8, (SubLObject)module0216.NIL)))), (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic12$, var5, (SubLObject)module0216.$ic14$)));
    }
    
    public static SubLObject f14168(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic17$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic17$);
        final SubLObject var6 = var4.rest();
        var4 = var4.first();
        SubLObject var7 = (SubLObject)module0216.NIL;
        SubLObject var8 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic17$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic17$);
        var8 = var4.first();
        final SubLObject var9;
        var4 = (var9 = var4.rest());
        var4 = var6;
        if (module0216.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic9$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic18$, var8), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic10$, (SubLObject)ConsesLow.listS(var7, (SubLObject)module0216.$ic18$, var8, ConsesLow.append(var9, (SubLObject)module0216.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic10$, (SubLObject)module0216.$ic19$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic11$, var5))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic17$);
        return (SubLObject)module0216.NIL;
    }
    
    public static SubLObject f14169(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0216.NIL;
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        final SubLObject var9 = module0215.f14160(var6, (SubLObject)module0216.$ic2$);
        final SubLObject var10 = module0215.f14160(var6, (SubLObject)module0216.$ic21$);
        final SubLObject var11 = module0215.f14160(var6, (SubLObject)module0216.$ic22$);
        final SubLObject var12 = f14170(var6);
        if (!var12.isInteger()) {
            Errors.error((SubLObject)module0216.$ic23$, var6);
        }
        if (f14171(var8, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED).numGE(var12)) {
            Errors.error((SubLObject)module0216.$ic24$);
        }
        final SubLObject var13 = (SubLObject)module0216.$ic25$;
        final SubLObject var14 = (SubLObject)module0216.$ic26$;
        final SubLObject var15 = (SubLObject)module0216.$ic27$;
        final SubLObject var16 = (SubLObject)module0216.$ic28$;
        final SubLObject var17 = (SubLObject)module0216.$ic29$;
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var13, reader.bq_cons((SubLObject)module0216.$ic30$, ConsesLow.append(var8, (SubLObject)module0216.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic31$, var13, (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic32$, var12, (SubLObject)module0216.$ic33$)), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.listS(var9, var7, ConsesLow.append(var8, (SubLObject)module0216.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic10$, var15, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic12$, var5, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic34$, var15)))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic35$, var13, ConsesLow.append(var8, (SubLObject)module0216.NIL))), (SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic36$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic37$, var10), var7, var14))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic38$, (SubLObject)ConsesLow.list(var17, var16), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic11$, var5, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic36$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic37$, var11), var7, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic39$, var14, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic40$, var17))))))));
    }
    
    public static SubLObject f14172(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0216.NIL;
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        final SubLObject var9 = module0215.f14160(var6, (SubLObject)module0216.$ic1$);
        final SubLObject var10 = module0215.f14160(var6, (SubLObject)module0216.$ic41$);
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic5$, (SubLObject)module0216.$ic42$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic12$, var5, (SubLObject)ConsesLow.listS(var10, var7, ConsesLow.append(var8, (SubLObject)module0216.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic6$, var7), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic15$, var5, (SubLObject)ConsesLow.listS(var9, var7, ConsesLow.append(var8, (SubLObject)module0216.NIL))), (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic20$, var5, var6, var7, ConsesLow.append(var8, (SubLObject)module0216.NIL))));
    }
    
    public static SubLObject f14173(final SubLObject var32, final SubLObject var33) {
        return Numbers.numGE(var32, var33);
    }
    
    public static SubLObject f14174(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0216.NIL;
        SubLObject var6 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic44$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic44$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic44$);
        final SubLObject var7 = var4.rest();
        var4 = var4.first();
        SubLObject var8 = (SubLObject)module0216.NIL;
        SubLObject var9 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic44$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic44$);
        var9 = var4.first();
        final SubLObject var10;
        var4 = (var10 = var4.rest());
        var4 = var7;
        if (module0216.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic9$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic18$, var9), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic45$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic46$, var5, var6), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic10$, (SubLObject)ConsesLow.listS(var8, (SubLObject)module0216.$ic18$, var9, ConsesLow.append(var10, (SubLObject)module0216.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic10$, (SubLObject)module0216.$ic19$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic11$, var5)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic44$);
        return (SubLObject)module0216.NIL;
    }
    
    public static SubLObject f14175(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0216.NIL;
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        SubLObject var8 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic48$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic48$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic48$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic48$);
        var8 = var4.first();
        final SubLObject var9;
        var4 = (var9 = var4.rest());
        final SubLObject var10 = module0215.f14160(var7, (SubLObject)module0216.$ic2$);
        final SubLObject var11 = module0215.f14160(var7, (SubLObject)module0216.$ic21$);
        final SubLObject var12 = module0215.f14160(var7, (SubLObject)module0216.$ic49$);
        final SubLObject var13 = f14170(var7);
        if (!var13.isInteger()) {
            Errors.error((SubLObject)module0216.$ic50$, var7);
        }
        if (f14171(var9, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED).numGE(var13)) {
            Errors.error((SubLObject)module0216.$ic51$);
        }
        final SubLObject var14 = (SubLObject)module0216.$ic52$;
        final SubLObject var15 = (SubLObject)module0216.$ic53$;
        final SubLObject var16 = (SubLObject)module0216.$ic54$;
        final SubLObject var17 = (SubLObject)module0216.$ic55$;
        final SubLObject var18 = (SubLObject)module0216.$ic56$;
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, reader.bq_cons((SubLObject)module0216.$ic30$, ConsesLow.append(var9, (SubLObject)module0216.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic31$, var14, (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic32$, var13, (SubLObject)module0216.$ic33$)), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.listS(var10, var8, ConsesLow.append(var9, (SubLObject)module0216.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic10$, var16, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic12$, var5, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic57$, var16, var6)))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic35$, var14, ConsesLow.append(var9, (SubLObject)module0216.NIL))), (SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic36$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic37$, var11), var8, var15))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic38$, (SubLObject)ConsesLow.list(var18, var17), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic11$, var5, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic36$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic37$, var12), var8, var6, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic39$, var15, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic40$, var18))))))));
    }
    
    public static SubLObject f14176(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0216.NIL;
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        SubLObject var8 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic48$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic48$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic48$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic48$);
        var8 = var4.first();
        final SubLObject var9;
        var4 = (var9 = var4.rest());
        final SubLObject var10 = module0215.f14160(var7, (SubLObject)module0216.$ic1$);
        final SubLObject var11 = module0215.f14160(var7, (SubLObject)module0216.$ic41$);
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic5$, (SubLObject)module0216.$ic42$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic58$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic12$, var5, (SubLObject)ConsesLow.listS(var11, var8, ConsesLow.append(var9, (SubLObject)module0216.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic46$, var5, var6), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic12$, var5, var6))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic6$, var8), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic43$, var5, var6, (SubLObject)ConsesLow.listS(var10, var8, ConsesLow.append(var9, (SubLObject)module0216.NIL))), (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic47$, var5, var6, var7, var8, ConsesLow.append(var9, (SubLObject)module0216.NIL))));
    }
    
    public static SubLObject f14177(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0216.NIL;
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        final SubLObject var9 = module0215.f14160(var6, (SubLObject)module0216.$ic59$);
        final SubLObject var10 = module0215.f14160(var6, (SubLObject)module0216.$ic2$);
        final SubLObject var11 = (SubLObject)module0216.$ic60$;
        final SubLObject var12 = (SubLObject)module0216.$ic61$;
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic6$, var7), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic7$, (SubLObject)ConsesLow.list(reader.bq_cons(var11, (SubLObject)module0216.$ic62$)), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic9$, (SubLObject)ConsesLow.list(var12, var7), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic12$, var11, (SubLObject)ConsesLow.listS(var9, var12, var11, var7, ConsesLow.append(var8, (SubLObject)module0216.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic12$, var5, var11)), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0216.$ic63$, (SubLObject)ConsesLow.listS(var10, var7, ConsesLow.append(var8, (SubLObject)module0216.NIL)))), (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic12$, var5, (SubLObject)module0216.$ic64$)));
    }
    
    public static SubLObject f14178(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0216.NIL;
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        final SubLObject var9 = module0215.f14160(var6, (SubLObject)module0216.$ic1$);
        final SubLObject var10 = module0215.f14160(var6, (SubLObject)module0216.$ic59$);
        final SubLObject var11 = (SubLObject)module0216.$ic67$;
        final SubLObject var12 = (SubLObject)module0216.$ic68$;
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic7$, (SubLObject)ConsesLow.list(reader.bq_cons(var11, (SubLObject)module0216.$ic62$)), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic9$, (SubLObject)ConsesLow.list(var12, var7), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic10$, (SubLObject)ConsesLow.listS(var9, var12, var7, ConsesLow.append(var8, (SubLObject)module0216.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic69$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic70$, var12)), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic12$, var11, (SubLObject)ConsesLow.listS(var10, var12, var11, var7, ConsesLow.append(var8, (SubLObject)module0216.NIL)))))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic12$, var5, var11));
    }
    
    public static SubLObject f14179(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0216.NIL;
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        final SubLObject var9 = module0215.f14160(var6, (SubLObject)module0216.$ic21$);
        final SubLObject var10 = module0215.f14160(var6, (SubLObject)module0216.$ic2$);
        final SubLObject var11 = module0215.f14160(var6, (SubLObject)module0216.$ic22$);
        final SubLObject var12 = f14170(var6);
        if (!var12.isInteger()) {
            Errors.error((SubLObject)module0216.$ic23$, var6);
        }
        if (f14171(var8, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED).numGE(var12)) {
            Errors.error((SubLObject)module0216.$ic24$);
        }
        final SubLObject var13 = (SubLObject)module0216.$ic72$;
        final SubLObject var14 = (SubLObject)module0216.$ic73$;
        final SubLObject var15 = (SubLObject)module0216.$ic74$;
        final SubLObject var16 = (SubLObject)module0216.$ic75$;
        final SubLObject var17 = (SubLObject)module0216.$ic76$;
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var13, reader.bq_cons((SubLObject)module0216.$ic30$, ConsesLow.append(var8, (SubLObject)module0216.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic31$, var13, (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic32$, var12, (SubLObject)module0216.$ic33$)), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.listS(var10, var7, ConsesLow.append(var8, (SubLObject)module0216.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic10$, var15, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic12$, var5, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic77$, var15)))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic35$, var13, ConsesLow.append(var8, (SubLObject)module0216.NIL))), (SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic36$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic37$, var9), var7, var14))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic38$, (SubLObject)ConsesLow.list(var17, var16), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic78$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic36$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic37$, var11), var7, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic39$, var14, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic40$, var17)))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic79$, var17, var5))))));
    }
    
    public static SubLObject f14180(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0216.NIL;
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic0$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        final SubLObject var9 = module0215.f14160(var6, (SubLObject)module0216.$ic21$);
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic5$, (SubLObject)module0216.$ic42$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic12$, var5, (SubLObject)ConsesLow.listS(var9, var7, ConsesLow.append(var8, (SubLObject)module0216.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic6$, var7), (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic65$, var5, var6, var7, ConsesLow.append(var8, (SubLObject)module0216.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic71$, var5, var6, var7, ConsesLow.append(var8, (SubLObject)module0216.NIL))));
    }
    
    public static SubLObject f14170(final SubLObject var6) {
        final SubLObject var7 = module0215.f14160(var6, (SubLObject)module0216.$ic81$);
        SubLObject var8 = (SubLObject)module0216.ONE_INTEGER;
        SubLObject var9 = var7;
        SubLObject var10 = (SubLObject)module0216.NIL;
        var10 = var9.first();
        while (module0216.NIL != var9) {
            if (module0216.NIL != conses_high.getf(var10, (SubLObject)module0216.$ic82$, (SubLObject)module0216.UNPROVIDED)) {
                return var8;
            }
            var8 = Numbers.add(var8, (SubLObject)module0216.ONE_INTEGER);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return (SubLObject)module0216.NIL;
    }
    
    public static SubLObject f14181(final SubLObject var56, SubLObject var57, SubLObject var58, SubLObject var59, SubLObject var60, SubLObject var61) {
        if (var57 == module0216.UNPROVIDED) {
            var57 = (SubLObject)module0216.NIL;
        }
        if (var58 == module0216.UNPROVIDED) {
            var58 = (SubLObject)module0216.NIL;
        }
        if (var59 == module0216.UNPROVIDED) {
            var59 = (SubLObject)module0216.NIL;
        }
        if (var60 == module0216.UNPROVIDED) {
            var60 = (SubLObject)module0216.NIL;
        }
        if (var61 == module0216.UNPROVIDED) {
            var61 = (SubLObject)module0216.NIL;
        }
        SubLObject var62 = (SubLObject)module0216.NIL;
        if (var56.numGE((SubLObject)module0216.ONE_INTEGER)) {
            var62 = (SubLObject)ConsesLow.cons(var57, var62);
        }
        if (var56.numGE((SubLObject)module0216.TWO_INTEGER)) {
            var62 = (SubLObject)ConsesLow.cons(var58, var62);
        }
        if (var56.numGE((SubLObject)module0216.THREE_INTEGER)) {
            var62 = (SubLObject)ConsesLow.cons(var59, var62);
        }
        if (var56.numGE((SubLObject)module0216.FOUR_INTEGER)) {
            var62 = (SubLObject)ConsesLow.cons(var60, var62);
        }
        if (var56.numGE((SubLObject)module0216.FIVE_INTEGER)) {
            var62 = (SubLObject)ConsesLow.cons(var61, var62);
        }
        return Sequences.nreverse(var62);
    }
    
    public static SubLObject f14171(SubLObject var57, SubLObject var58, SubLObject var59, SubLObject var60, SubLObject var61) {
        if (var57 == module0216.UNPROVIDED) {
            var57 = (SubLObject)module0216.NIL;
        }
        if (var58 == module0216.UNPROVIDED) {
            var58 = (SubLObject)module0216.NIL;
        }
        if (var59 == module0216.UNPROVIDED) {
            var59 = (SubLObject)module0216.NIL;
        }
        if (var60 == module0216.UNPROVIDED) {
            var60 = (SubLObject)module0216.NIL;
        }
        if (var61 == module0216.UNPROVIDED) {
            var61 = (SubLObject)module0216.NIL;
        }
        SubLObject var62 = (SubLObject)module0216.ZERO_INTEGER;
        if (module0216.NIL == var57) {
            return var62;
        }
        var62 = Numbers.add(var62, (SubLObject)module0216.ONE_INTEGER);
        if (module0216.NIL == var58) {
            return var62;
        }
        var62 = Numbers.add(var62, (SubLObject)module0216.ONE_INTEGER);
        if (module0216.NIL == var59) {
            return var62;
        }
        var62 = Numbers.add(var62, (SubLObject)module0216.ONE_INTEGER);
        if (module0216.NIL == var60) {
            return var62;
        }
        var62 = Numbers.add(var62, (SubLObject)module0216.ONE_INTEGER);
        if (module0216.NIL == var61) {
            return var62;
        }
        var62 = Numbers.add(var62, (SubLObject)module0216.ONE_INTEGER);
        return var62;
    }
    
    public static SubLObject f14182(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic83$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        SubLObject var8 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic83$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic83$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic83$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0216.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0216.NIL;
        SubLObject var70_71 = (SubLObject)module0216.NIL;
        while (module0216.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0216.$ic83$);
            var70_71 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0216.$ic83$);
            if (module0216.NIL == conses_high.member(var70_71, (SubLObject)module0216.$ic84$, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED)) {
                var11 = (SubLObject)module0216.T;
            }
            if (var70_71 == module0216.$ic85$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0216.NIL != var11 && module0216.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic83$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0216.$ic86$, var4);
        final SubLObject var13 = (SubLObject)((module0216.NIL != var12) ? conses_high.cadr(var12) : module0216.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic88$, var8), (SubLObject)module0216.$ic86$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic89$, var6), ConsesLow.append(var14, (SubLObject)module0216.NIL)));
    }
    
    public static SubLObject f14183(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic90$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic90$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic90$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0216.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0216.NIL;
        SubLObject var81_82 = (SubLObject)module0216.NIL;
        while (module0216.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0216.$ic90$);
            var81_82 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0216.$ic90$);
            if (module0216.NIL == conses_high.member(var81_82, (SubLObject)module0216.$ic84$, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED)) {
                var10 = (SubLObject)module0216.T;
            }
            if (var81_82 == module0216.$ic85$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0216.NIL != var10 && module0216.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic90$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0216.$ic86$, var4);
        final SubLObject var12 = (SubLObject)((module0216.NIL != var11) ? conses_high.cadr(var11) : module0216.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)module0216.$ic91$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic92$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)module0216.$ic86$, var12), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic93$, var14), ConsesLow.append(var13, (SubLObject)module0216.NIL));
    }
    
    public static SubLObject f14184(final SubLObject var7) {
        return module0212.f13825(module0212.f13787(var7), (SubLObject)module0216.$ic94$);
    }
    
    public static SubLObject f14185(final SubLObject var84) {
        return (SubLObject)module0216.T;
    }
    
    public static SubLObject f14186(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic83$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        SubLObject var8 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic83$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic83$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic83$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0216.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0216.NIL;
        SubLObject var91_92 = (SubLObject)module0216.NIL;
        while (module0216.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0216.$ic83$);
            var91_92 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0216.$ic83$);
            if (module0216.NIL == conses_high.member(var91_92, (SubLObject)module0216.$ic84$, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED)) {
                var11 = (SubLObject)module0216.T;
            }
            if (var91_92 == module0216.$ic85$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0216.NIL != var11 && module0216.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic83$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0216.$ic86$, var4);
        final SubLObject var13 = (SubLObject)((module0216.NIL != var12) ? conses_high.cadr(var12) : module0216.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic95$, var8), (SubLObject)module0216.$ic86$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic96$, var6), ConsesLow.append(var14, (SubLObject)module0216.NIL)));
    }
    
    public static SubLObject f14187(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic90$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic90$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic90$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0216.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0216.NIL;
        SubLObject var100_101 = (SubLObject)module0216.NIL;
        while (module0216.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0216.$ic90$);
            var100_101 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0216.$ic90$);
            if (module0216.NIL == conses_high.member(var100_101, (SubLObject)module0216.$ic84$, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED)) {
                var10 = (SubLObject)module0216.T;
            }
            if (var100_101 == module0216.$ic85$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0216.NIL != var10 && module0216.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic90$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0216.$ic86$, var4);
        final SubLObject var12 = (SubLObject)((module0216.NIL != var11) ? conses_high.cadr(var11) : module0216.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)module0216.$ic97$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic98$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)module0216.$ic86$, var12), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic93$, var14), ConsesLow.append(var13, (SubLObject)module0216.NIL));
    }
    
    public static SubLObject f14188(final SubLObject var7) {
        return module0212.f13825(module0212.f13787(var7), (SubLObject)module0216.$ic99$);
    }
    
    public static SubLObject f14189(final SubLObject var84) {
        return (SubLObject)module0216.T;
    }
    
    public static SubLObject f14190(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic100$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        SubLObject var8 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic100$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic100$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic100$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0216.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0216.NIL;
        SubLObject var111_112 = (SubLObject)module0216.NIL;
        while (module0216.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0216.$ic100$);
            var111_112 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0216.$ic100$);
            if (module0216.NIL == conses_high.member(var111_112, (SubLObject)module0216.$ic84$, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED)) {
                var11 = (SubLObject)module0216.T;
            }
            if (var111_112 == module0216.$ic85$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0216.NIL != var11 && module0216.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic100$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0216.$ic86$, var4);
        final SubLObject var13 = (SubLObject)((module0216.NIL != var12) ? conses_high.cadr(var12) : module0216.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic101$, var8), (SubLObject)module0216.$ic86$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic102$, var6), ConsesLow.append(var14, (SubLObject)module0216.NIL)));
    }
    
    public static SubLObject f14191(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic103$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic103$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic103$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0216.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0216.NIL;
        SubLObject var120_121 = (SubLObject)module0216.NIL;
        while (module0216.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0216.$ic103$);
            var120_121 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0216.$ic103$);
            if (module0216.NIL == conses_high.member(var120_121, (SubLObject)module0216.$ic84$, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED)) {
                var10 = (SubLObject)module0216.T;
            }
            if (var120_121 == module0216.$ic85$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0216.NIL != var10 && module0216.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic103$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0216.$ic86$, var4);
        final SubLObject var12 = (SubLObject)((module0216.NIL != var11) ? conses_high.cadr(var11) : module0216.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)module0216.$ic104$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic105$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)module0216.$ic86$, var12), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic93$, var14), ConsesLow.append(var13, (SubLObject)module0216.NIL));
    }
    
    public static SubLObject f14192(final SubLObject var107) {
        return module0212.f13825(module0212.f13787(var107), (SubLObject)module0216.$ic106$);
    }
    
    public static SubLObject f14193(final SubLObject var84) {
        return (SubLObject)module0216.T;
    }
    
    public static SubLObject f14194(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic100$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        SubLObject var8 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic100$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic100$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic100$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0216.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0216.NIL;
        SubLObject var129_130 = (SubLObject)module0216.NIL;
        while (module0216.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0216.$ic100$);
            var129_130 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0216.$ic100$);
            if (module0216.NIL == conses_high.member(var129_130, (SubLObject)module0216.$ic84$, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED)) {
                var11 = (SubLObject)module0216.T;
            }
            if (var129_130 == module0216.$ic85$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0216.NIL != var11 && module0216.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic100$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0216.$ic86$, var4);
        final SubLObject var13 = (SubLObject)((module0216.NIL != var12) ? conses_high.cadr(var12) : module0216.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic107$, var8), (SubLObject)module0216.$ic86$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic102$, var6), ConsesLow.append(var14, (SubLObject)module0216.NIL)));
    }
    
    public static SubLObject f14195(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic103$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic103$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic103$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0216.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0216.NIL;
        SubLObject var138_139 = (SubLObject)module0216.NIL;
        while (module0216.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0216.$ic103$);
            var138_139 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0216.$ic103$);
            if (module0216.NIL == conses_high.member(var138_139, (SubLObject)module0216.$ic84$, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED)) {
                var10 = (SubLObject)module0216.T;
            }
            if (var138_139 == module0216.$ic85$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0216.NIL != var10 && module0216.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic103$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0216.$ic86$, var4);
        final SubLObject var12 = (SubLObject)((module0216.NIL != var11) ? conses_high.cadr(var11) : module0216.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)module0216.$ic108$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic109$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)module0216.$ic86$, var12), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic93$, var14), ConsesLow.append(var13, (SubLObject)module0216.NIL));
    }
    
    public static SubLObject f14196(final SubLObject var107) {
        return module0212.f13825(module0212.f13787(var107), (SubLObject)module0216.$ic110$);
    }
    
    public static SubLObject f14197(final SubLObject var84) {
        return (SubLObject)module0216.T;
    }
    
    public static SubLObject f14198(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic112$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        SubLObject var8 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic112$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic112$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic112$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0216.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0216.NIL;
        SubLObject var148_149 = (SubLObject)module0216.NIL;
        while (module0216.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0216.$ic112$);
            var148_149 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0216.$ic112$);
            if (module0216.NIL == conses_high.member(var148_149, (SubLObject)module0216.$ic84$, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED)) {
                var11 = (SubLObject)module0216.T;
            }
            if (var148_149 == module0216.$ic85$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0216.NIL != var11 && module0216.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic112$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0216.$ic86$, var4);
        final SubLObject var13 = (SubLObject)((module0216.NIL != var12) ? conses_high.cadr(var12) : module0216.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic113$, var8), (SubLObject)module0216.$ic86$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic114$, var6), ConsesLow.append(var14, (SubLObject)module0216.NIL)));
    }
    
    public static SubLObject f14199(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic115$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic115$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic115$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0216.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0216.NIL;
        SubLObject var157_158 = (SubLObject)module0216.NIL;
        while (module0216.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0216.$ic115$);
            var157_158 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0216.$ic115$);
            if (module0216.NIL == conses_high.member(var157_158, (SubLObject)module0216.$ic84$, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED)) {
                var10 = (SubLObject)module0216.T;
            }
            if (var157_158 == module0216.$ic85$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0216.NIL != var10 && module0216.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic115$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0216.$ic86$, var4);
        final SubLObject var12 = (SubLObject)((module0216.NIL != var11) ? conses_high.cadr(var11) : module0216.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)module0216.$ic116$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic117$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)module0216.$ic86$, var12), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic93$, var14), ConsesLow.append(var13, (SubLObject)module0216.NIL));
    }
    
    public static SubLObject f14200(final SubLObject var144) {
        return module0212.f13825(module0212.f13787(var144), (SubLObject)module0216.$ic118$);
    }
    
    public static SubLObject f14201(final SubLObject var84) {
        return (SubLObject)module0216.T;
    }
    
    public static SubLObject f14202(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic112$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        SubLObject var8 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic112$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic112$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic112$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0216.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0216.NIL;
        SubLObject var166_167 = (SubLObject)module0216.NIL;
        while (module0216.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0216.$ic112$);
            var166_167 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0216.$ic112$);
            if (module0216.NIL == conses_high.member(var166_167, (SubLObject)module0216.$ic84$, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED)) {
                var11 = (SubLObject)module0216.T;
            }
            if (var166_167 == module0216.$ic85$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0216.NIL != var11 && module0216.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic112$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0216.$ic86$, var4);
        final SubLObject var13 = (SubLObject)((module0216.NIL != var12) ? conses_high.cadr(var12) : module0216.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic119$, var8), (SubLObject)module0216.$ic86$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic120$, var6), ConsesLow.append(var14, (SubLObject)module0216.NIL)));
    }
    
    public static SubLObject f14203(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic115$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic115$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic115$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0216.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0216.NIL;
        SubLObject var175_176 = (SubLObject)module0216.NIL;
        while (module0216.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0216.$ic115$);
            var175_176 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0216.$ic115$);
            if (module0216.NIL == conses_high.member(var175_176, (SubLObject)module0216.$ic84$, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED)) {
                var10 = (SubLObject)module0216.T;
            }
            if (var175_176 == module0216.$ic85$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0216.NIL != var10 && module0216.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic115$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0216.$ic86$, var4);
        final SubLObject var12 = (SubLObject)((module0216.NIL != var11) ? conses_high.cadr(var11) : module0216.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)module0216.$ic121$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic122$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)module0216.$ic86$, var12), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic93$, var14), ConsesLow.append(var13, (SubLObject)module0216.NIL));
    }
    
    public static SubLObject f14204(final SubLObject var144) {
        return module0212.f13825(module0212.f13787(var144), (SubLObject)module0216.$ic123$);
    }
    
    public static SubLObject f14205(final SubLObject var84) {
        return (SubLObject)module0216.T;
    }
    
    public static SubLObject f14206(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic112$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        SubLObject var8 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic112$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic112$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic112$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0216.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0216.NIL;
        SubLObject var184_185 = (SubLObject)module0216.NIL;
        while (module0216.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0216.$ic112$);
            var184_185 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0216.$ic112$);
            if (module0216.NIL == conses_high.member(var184_185, (SubLObject)module0216.$ic84$, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED)) {
                var11 = (SubLObject)module0216.T;
            }
            if (var184_185 == module0216.$ic85$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0216.NIL != var11 && module0216.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic112$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0216.$ic86$, var4);
        final SubLObject var13 = (SubLObject)((module0216.NIL != var12) ? conses_high.cadr(var12) : module0216.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0216.$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic124$, var8), (SubLObject)module0216.$ic86$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0216.$ic125$, var6), ConsesLow.append(var14, (SubLObject)module0216.NIL)));
    }
    
    public static SubLObject f14207(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic115$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0216.NIL;
        SubLObject var7 = (SubLObject)module0216.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic115$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0216.$ic115$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0216.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0216.NIL;
        SubLObject var193_194 = (SubLObject)module0216.NIL;
        while (module0216.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0216.$ic115$);
            var193_194 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0216.$ic115$);
            if (module0216.NIL == conses_high.member(var193_194, (SubLObject)module0216.$ic84$, (SubLObject)module0216.UNPROVIDED, (SubLObject)module0216.UNPROVIDED)) {
                var10 = (SubLObject)module0216.T;
            }
            if (var193_194 == module0216.$ic85$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0216.NIL != var10 && module0216.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0216.$ic115$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0216.$ic86$, var4);
        final SubLObject var12 = (SubLObject)((module0216.NIL != var11) ? conses_high.cadr(var11) : module0216.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)module0216.$ic126$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0216.$ic127$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)module0216.$ic86$, var12), (SubLObject)ConsesLow.list((SubLObject)module0216.$ic93$, var14), ConsesLow.append(var13, (SubLObject)module0216.NIL));
    }
    
    public static SubLObject f14208(final SubLObject var144) {
        return module0212.f13825(module0212.f13787(var144), (SubLObject)module0216.$ic128$);
    }
    
    public static SubLObject f14209(final SubLObject var84) {
        return (SubLObject)module0216.T;
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
        return (SubLObject)module0216.NIL;
    }
    
    public static SubLObject f14211() {
        return (SubLObject)module0216.NIL;
    }
    
    public static SubLObject f14212() {
        module0002.f50((SubLObject)module0216.$ic15$, (SubLObject)module0216.$ic16$);
        module0002.f50((SubLObject)module0216.$ic20$, (SubLObject)module0216.$ic16$);
        module0002.f50((SubLObject)module0216.$ic43$, (SubLObject)module0216.$ic16$);
        module0002.f50((SubLObject)module0216.$ic47$, (SubLObject)module0216.$ic16$);
        module0002.f50((SubLObject)module0216.$ic65$, (SubLObject)module0216.$ic66$);
        module0002.f50((SubLObject)module0216.$ic71$, (SubLObject)module0216.$ic66$);
        module0002.f50((SubLObject)module0216.$ic80$, (SubLObject)module0216.$ic20$);
        module0002.f50((SubLObject)module0216.$ic35$, (SubLObject)module0216.$ic20$);
        module0002.f50((SubLObject)module0216.$ic30$, (SubLObject)module0216.$ic20$);
        module0002.f50((SubLObject)module0216.$ic88$, (SubLObject)module0216.$ic92$);
        module0002.f50((SubLObject)module0216.$ic89$, (SubLObject)module0216.$ic92$);
        module0002.f50((SubLObject)module0216.$ic95$, (SubLObject)module0216.$ic98$);
        module0002.f50((SubLObject)module0216.$ic96$, (SubLObject)module0216.$ic98$);
        module0002.f50((SubLObject)module0216.$ic101$, (SubLObject)module0216.$ic105$);
        module0002.f50((SubLObject)module0216.$ic102$, (SubLObject)module0216.$ic105$);
        module0002.f50((SubLObject)module0216.$ic107$, (SubLObject)module0216.$ic109$);
        module0002.f50((SubLObject)module0216.$ic111$, (SubLObject)module0216.$ic109$);
        module0002.f50((SubLObject)module0216.$ic113$, (SubLObject)module0216.$ic117$);
        module0002.f50((SubLObject)module0216.$ic114$, (SubLObject)module0216.$ic117$);
        module0002.f50((SubLObject)module0216.$ic119$, (SubLObject)module0216.$ic122$);
        module0002.f50((SubLObject)module0216.$ic120$, (SubLObject)module0216.$ic122$);
        module0002.f50((SubLObject)module0216.$ic124$, (SubLObject)module0216.$ic127$);
        module0002.f50((SubLObject)module0216.$ic125$, (SubLObject)module0216.$ic127$);
        return (SubLObject)module0216.NIL;
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
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3267", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#8831", "CYC"));
        $ic1$ = SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION");
        $ic2$ = SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION");
        $ic3$ = SubLObjectFactory.makeUninternedSymbol("US#33E32D8");
        $ic4$ = SubLObjectFactory.makeUninternedSymbol("US#74E0897");
        $ic5$ = SubLObjectFactory.makeSymbol("PIF");
        $ic6$ = SubLObjectFactory.makeSymbol("SIMPLE-INDEXED-TERM-P");
        $ic7$ = SubLObjectFactory.makeSymbol("CLET");
        $ic8$ = ConsesLow.list((SubLObject)module0216.ZERO_INTEGER);
        $ic9$ = SubLObjectFactory.makeSymbol("S#12772", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic11$ = SubLObjectFactory.makeSymbol("CINC");
        $ic12$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic13$ = SubLObjectFactory.makeSymbol("S#17133", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("S#17133", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBINDEX-LEAF-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("S#17133", "CYC")), (SubLObject)module0216.ZERO_INTEGER));
        $ic15$ = SubLObjectFactory.makeSymbol("S#17091", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#17093", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17134", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC")));
        $ic18$ = SubLObjectFactory.makeSymbol("S#17135", "CYC");
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-MT"), (SubLObject)SubLObjectFactory.makeSymbol("S#17135", "CYC")));
        $ic20$ = SubLObjectFactory.makeSymbol("S#17092", "CYC");
        $ic21$ = SubLObjectFactory.makeKeyword("KEY-FUNCTION");
        $ic22$ = SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION");
        $ic23$ = SubLObjectFactory.makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT called on an index (~s) without an mt layer");
        $ic24$ = SubLObjectFactory.makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT called with too many arguments");
        $ic25$ = SubLObjectFactory.makeUninternedSymbol("US#213E720");
        $ic26$ = SubLObjectFactory.makeUninternedSymbol("US#78CFC94");
        $ic27$ = SubLObjectFactory.makeUninternedSymbol("US#2D3D43C");
        $ic28$ = SubLObjectFactory.makeUninternedSymbol("US#2B43232");
        $ic29$ = SubLObjectFactory.makeUninternedSymbol("US#1A4B619");
        $ic30$ = SubLObjectFactory.makeSymbol("S#17104", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("=");
        $ic32$ = SubLObjectFactory.makeSymbol("-");
        $ic33$ = ConsesLow.list((SubLObject)module0216.ONE_INTEGER);
        $ic34$ = SubLObjectFactory.makeSymbol("S#17136", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#17103", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("APPLY");
        $ic37$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic38$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic39$ = SubLObjectFactory.makeSymbol("APPEND");
        $ic40$ = SubLObjectFactory.makeSymbol("LIST");
        $ic41$ = SubLObjectFactory.makeKeyword("NUM-FUNCTION");
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17137", "CYC"));
        $ic43$ = SubLObjectFactory.makeSymbol("S#17095", "CYC");
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10875", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC")));
        $ic45$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic46$ = SubLObjectFactory.makeSymbol("S#17094", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#17096", "CYC");
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3267", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10875", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#8831", "CYC"));
        $ic49$ = SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF");
        $ic50$ = SubLObjectFactory.makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF called on an index (~s) without an mt layer");
        $ic51$ = SubLObjectFactory.makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF called with too many arguments");
        $ic52$ = SubLObjectFactory.makeUninternedSymbol("US#213E720");
        $ic53$ = SubLObjectFactory.makeUninternedSymbol("US#78CFC94");
        $ic54$ = SubLObjectFactory.makeUninternedSymbol("US#2D3D43C");
        $ic55$ = SubLObjectFactory.makeUninternedSymbol("US#2B43232");
        $ic56$ = SubLObjectFactory.makeUninternedSymbol("US#1A4B619");
        $ic57$ = SubLObjectFactory.makeSymbol("S#17138", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic59$ = SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION");
        $ic60$ = SubLObjectFactory.makeUninternedSymbol("US#36728AC");
        $ic61$ = SubLObjectFactory.makeUninternedSymbol("US#74E0897");
        $ic62$ = ConsesLow.list((SubLObject)module0216.NIL);
        $ic63$ = SubLObjectFactory.makeSymbol("S#17139", "CYC");
        $ic64$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX-P"), (SubLObject)SubLObjectFactory.makeSymbol("S#17139", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX-KEYS"), (SubLObject)SubLObjectFactory.makeSymbol("S#17139", "CYC"))));
        $ic65$ = SubLObjectFactory.makeSymbol("S#17099", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#17101", "CYC");
        $ic67$ = SubLObjectFactory.makeUninternedSymbol("US#36728AC");
        $ic68$ = SubLObjectFactory.makeUninternedSymbol("US#74E0897");
        $ic69$ = SubLObjectFactory.makeSymbol("RELEVANT-MT?");
        $ic70$ = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $ic71$ = SubLObjectFactory.makeSymbol("S#17100", "CYC");
        $ic72$ = SubLObjectFactory.makeUninternedSymbol("US#213E720");
        $ic73$ = SubLObjectFactory.makeUninternedSymbol("US#78CFC94");
        $ic74$ = SubLObjectFactory.makeUninternedSymbol("US#2D3D43C");
        $ic75$ = SubLObjectFactory.makeUninternedSymbol("US#2B43232");
        $ic76$ = SubLObjectFactory.makeUninternedSymbol("US#1A4B619");
        $ic77$ = SubLObjectFactory.makeSymbol("S#17140", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("PLUSP");
        $ic79$ = SubLObjectFactory.makeSymbol("CPUSH");
        $ic80$ = SubLObjectFactory.makeSymbol("S#17102", "CYC");
        $ic81$ = SubLObjectFactory.makeKeyword("KEYS");
        $ic82$ = SubLObjectFactory.makeKeyword("MT?");
        $ic83$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17133", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic84$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic85$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic86$ = SubLObjectFactory.makeKeyword("DONE");
        $ic87$ = SubLObjectFactory.makeSymbol("DO-INTERMEDIATE-INDEX");
        $ic88$ = SubLObjectFactory.makeSymbol("S#17107", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#17108", "CYC");
        $ic90$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic91$ = SubLObjectFactory.makeUninternedSymbol("US#5E7BF83");
        $ic92$ = SubLObjectFactory.makeSymbol("S#17105", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic94$ = SubLObjectFactory.makeKeyword("GAF-ARG");
        $ic95$ = SubLObjectFactory.makeSymbol("S#17111", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#17112", "CYC");
        $ic97$ = SubLObjectFactory.makeUninternedSymbol("US#5E7BF83");
        $ic98$ = SubLObjectFactory.makeSymbol("S#17109", "CYC");
        $ic99$ = SubLObjectFactory.makeKeyword("NART-ARG");
        $ic100$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17133", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic101$ = SubLObjectFactory.makeSymbol("S#17115", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("S#17116", "CYC");
        $ic103$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic104$ = SubLObjectFactory.makeUninternedSymbol("US#5E7BF83");
        $ic105$ = SubLObjectFactory.makeSymbol("S#17113", "CYC");
        $ic106$ = SubLObjectFactory.makeKeyword("PREDICATE-RULE");
        $ic107$ = SubLObjectFactory.makeSymbol("S#17119", "CYC");
        $ic108$ = SubLObjectFactory.makeUninternedSymbol("US#5E7BF83");
        $ic109$ = SubLObjectFactory.makeSymbol("S#17117", "CYC");
        $ic110$ = SubLObjectFactory.makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");
        $ic111$ = SubLObjectFactory.makeSymbol("S#17120", "CYC");
        $ic112$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17133", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic113$ = SubLObjectFactory.makeSymbol("S#17123", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("S#17124", "CYC");
        $ic115$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic116$ = SubLObjectFactory.makeUninternedSymbol("US#5E7BF83");
        $ic117$ = SubLObjectFactory.makeSymbol("S#17121", "CYC");
        $ic118$ = SubLObjectFactory.makeKeyword("ISA-RULE");
        $ic119$ = SubLObjectFactory.makeSymbol("S#17127", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("S#17128", "CYC");
        $ic121$ = SubLObjectFactory.makeUninternedSymbol("US#5E7BF83");
        $ic122$ = SubLObjectFactory.makeSymbol("S#17125", "CYC");
        $ic123$ = SubLObjectFactory.makeKeyword("GENLS-RULE");
        $ic124$ = SubLObjectFactory.makeSymbol("S#17131", "CYC");
        $ic125$ = SubLObjectFactory.makeSymbol("S#17132", "CYC");
        $ic126$ = SubLObjectFactory.makeUninternedSymbol("US#5E7BF83");
        $ic127$ = SubLObjectFactory.makeSymbol("S#17129", "CYC");
        $ic128$ = SubLObjectFactory.makeKeyword("GENL-MT-RULE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0216.class
	Total time: 293 ms
	
	Decompiled with Procyon 0.5.32.
*/