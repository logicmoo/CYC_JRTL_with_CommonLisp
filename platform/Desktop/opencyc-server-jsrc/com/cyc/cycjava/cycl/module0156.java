package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0156 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0156";
    public static final String myFingerPrint = "e50e4d64f3f3c35f003e4fc623b37b2e482f37b96303cb18c4d72edea69aa80d";
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLList $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLList $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLList $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLList $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLList $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLList $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
    private static final SubLList $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLList $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLList $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLList $ic128$;
    private static final SubLList $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLList $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLList $ic133$;
    private static final SubLList $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLList $ic136$;
    private static final SubLList $ic137$;
    private static final SubLString $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLList $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLList $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLList $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    
    public static SubLObject f9803(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, var6), ConsesLow.append(var7, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9804(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic4$, (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic6$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9805(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)$ic8$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9806(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)$ic9$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9807(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic11$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9808(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)$ic12$, (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic6$, ConsesLow.append(var5, (SubLObject)NIL)), (SubLObject)$ic13$);
    }
    
    public static SubLObject f9809(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)$ic14$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9810(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)$ic15$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9811(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)$ic16$, (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic17$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9812(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)$ic18$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9813(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        if (NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)NIL);
        }
        return (SubLObject)$ic19$;
    }
    
    public static SubLObject f9814(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic20$, (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic6$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9815(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)$ic21$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9816(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)$ic22$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9817(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        if (NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)NIL);
        }
        return (SubLObject)$ic23$;
    }
    
    public static SubLObject f9818(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return reader.bq_cons((SubLObject)$ic10$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9819(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic24$, (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic6$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9820(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        if (NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)NIL);
        }
        return (SubLObject)$ic25$;
    }
    
    public static SubLObject f9821(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return reader.bq_cons((SubLObject)$ic10$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9822(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic26$, (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic6$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9823(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)$ic27$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9824(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)$ic28$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9825(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)$ic29$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9826(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return reader.bq_cons((SubLObject)$ic10$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9827(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic30$, (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic6$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9828(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)$ic31$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9829(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)$ic32$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9830(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return reader.bq_cons((SubLObject)$ic10$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9831(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)$ic33$, (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic6$, ConsesLow.append(var5, (SubLObject)NIL)), (SubLObject)$ic13$);
    }
    
    public static SubLObject f9832(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)$ic34$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9833(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)$ic35$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9834(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)$ic36$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9835(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic37$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic37$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var12;
            var4 = (var12 = var5);
            module0002.f37((SubLObject)$ic38$, (SubLObject)$ic39$);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, $ic41$, var8, $ic42$, var10, $ic43$, var11, $ic44$, var9 }), ConsesLow.append(var12, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic37$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9836(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var10 = var4.first();
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic45$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic45$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var13;
            var4 = (var13 = var5);
            module0002.f37((SubLObject)$ic46$, (SubLObject)$ic47$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic48$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, $ic41$, var8, $ic42$, var11, $ic43$, var12, $ic44$, var9 }), ConsesLow.append(var13, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic45$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9837(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var10 = var4.first();
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic49$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic49$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var13;
            var4 = (var13 = var5);
            module0002.f37((SubLObject)$ic50$, (SubLObject)$ic51$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic52$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, $ic41$, var8, $ic42$, var11, $ic43$, var12, $ic44$, var9 }), ConsesLow.append(var13, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic49$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9838(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic37$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic37$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var12;
            var4 = (var12 = var5);
            module0002.f37((SubLObject)$ic53$, (SubLObject)$ic54$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic55$, (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, $ic41$, var8, $ic42$, var10, $ic43$, var11, $ic44$, var9 }), ConsesLow.append(var12, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic37$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9839(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic56$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic56$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic56$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic56$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic56$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic56$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic56$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic56$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var13;
            var4 = (var13 = var5);
            module0002.f37((SubLObject)$ic57$, (SubLObject)$ic58$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic59$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, $ic41$, var8, $ic42$, var11, $ic43$, var12, $ic44$, var9 }), ConsesLow.append(var13, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic56$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9840(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic60$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic60$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic60$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var13;
            var4 = (var13 = var5);
            module0002.f37((SubLObject)$ic61$, (SubLObject)$ic62$);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, var11, $ic41$, var8, $ic42$, var10, $ic43$, var12, $ic44$, var9 }), ConsesLow.append(var13, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic60$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9841(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic64$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic64$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic64$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic64$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic64$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic64$);
        var10 = var4.first();
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic64$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic64$);
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic64$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var14;
            var4 = (var14 = var5);
            module0002.f37((SubLObject)$ic65$, (SubLObject)$ic66$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic48$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, var12, $ic41$, var8, $ic42$, var11, $ic43$, var13, $ic44$, var9 }), ConsesLow.append(var14, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic64$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9842(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic67$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic67$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic67$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic67$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic67$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic67$);
        var10 = var4.first();
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic67$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic67$);
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic67$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var14;
            var4 = (var14 = var5);
            module0002.f37((SubLObject)$ic68$, (SubLObject)$ic69$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic52$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, var12, $ic41$, var8, $ic42$, var11, $ic43$, var13, $ic44$, var9 }), ConsesLow.append(var14, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic67$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9843(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic60$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic60$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic60$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var13;
            var4 = (var13 = var5);
            module0002.f37((SubLObject)$ic70$, (SubLObject)$ic71$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic55$, (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, var11, $ic41$, var8, $ic42$, var10, $ic43$, var12, $ic44$, var9 }), ConsesLow.append(var13, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic60$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9844(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic72$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic72$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic72$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic72$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic72$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic72$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic72$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic72$);
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic72$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var14;
            var4 = (var14 = var5);
            module0002.f37((SubLObject)$ic73$, (SubLObject)$ic74$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic59$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, var12, $ic41$, var8, $ic42$, var11, $ic43$, var13, $ic44$, var9 }), ConsesLow.append(var14, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic72$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9845(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic37$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic37$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var12;
            var4 = (var12 = var5);
            module0002.f37((SubLObject)$ic75$, (SubLObject)$ic39$);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, $ic41$, var8, $ic42$, var10, $ic43$, var11, $ic44$, var9 }), ConsesLow.append(var12, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic37$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9846(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var10 = var4.first();
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic45$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic45$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var13;
            var4 = (var13 = var5);
            module0002.f37((SubLObject)$ic76$, (SubLObject)$ic47$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic48$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, $ic41$, var8, $ic42$, var11, $ic43$, var12, $ic44$, var9 }), ConsesLow.append(var13, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic45$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9847(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var10 = var4.first();
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic49$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic49$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var13;
            var4 = (var13 = var5);
            module0002.f37((SubLObject)$ic77$, (SubLObject)$ic51$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic52$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, $ic41$, var8, $ic42$, var11, $ic43$, var12, $ic44$, var9 }), ConsesLow.append(var13, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic49$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9848(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic37$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic37$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var12;
            var4 = (var12 = var5);
            module0002.f37((SubLObject)$ic78$, (SubLObject)$ic54$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic55$, (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, $ic41$, var8, $ic42$, var10, $ic43$, var11, $ic44$, var9 }), ConsesLow.append(var12, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic37$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9849(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic56$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic56$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic56$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic56$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic56$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic56$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic56$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic56$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var13;
            var4 = (var13 = var5);
            module0002.f37((SubLObject)$ic79$, (SubLObject)$ic58$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic59$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, $ic41$, var8, $ic42$, var11, $ic43$, var12, $ic44$, var9 }), ConsesLow.append(var13, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic56$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9850(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic60$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic60$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic60$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var13;
            var4 = (var13 = var5);
            module0002.f37((SubLObject)$ic80$, (SubLObject)$ic62$);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, var11, $ic41$, var8, $ic42$, var10, $ic43$, var12, $ic44$, var9 }), ConsesLow.append(var13, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic60$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9851(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic64$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic64$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic64$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic64$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic64$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic64$);
        var10 = var4.first();
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic64$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic64$);
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic64$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var14;
            var4 = (var14 = var5);
            module0002.f37((SubLObject)$ic81$, (SubLObject)$ic66$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic48$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, var12, $ic41$, var8, $ic42$, var11, $ic43$, var13, $ic44$, var9 }), ConsesLow.append(var14, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic64$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9852(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic67$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic67$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic67$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic67$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic67$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic67$);
        var10 = var4.first();
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic67$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic67$);
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic67$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var14;
            var4 = (var14 = var5);
            module0002.f37((SubLObject)$ic82$, (SubLObject)$ic69$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic52$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, var12, $ic41$, var8, $ic42$, var11, $ic43$, var13, $ic44$, var9 }), ConsesLow.append(var14, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic67$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9853(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic60$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic60$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic60$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var13;
            var4 = (var13 = var5);
            module0002.f37((SubLObject)$ic83$, (SubLObject)$ic71$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic55$, (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, var11, $ic41$, var8, $ic42$, var10, $ic43$, var12, $ic44$, var9 }), ConsesLow.append(var13, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic60$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9854(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic72$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic72$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic72$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic72$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic72$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic72$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic72$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic72$);
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic72$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var14;
            var4 = (var14 = var5);
            module0002.f37((SubLObject)$ic84$, (SubLObject)$ic74$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic59$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, var12, $ic41$, var8, $ic42$, var11, $ic43$, var13, $ic44$, var9 }), ConsesLow.append(var14, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic72$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9855(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic85$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic85$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic85$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic85$);
        var8 = var4.first();
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic85$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            module0002.f37((SubLObject)$ic86$, (SubLObject)$ic87$);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic88$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic43$, var9, (SubLObject)$ic44$, var8), ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic85$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9856(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic89$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic89$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic89$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic89$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic89$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic89$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var11;
            var4 = (var11 = var5);
            module0002.f37((SubLObject)$ic90$, (SubLObject)$ic91$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic48$, var9, (SubLObject)ConsesLow.listS((SubLObject)$ic88$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic43$, var10, (SubLObject)$ic44$, var8), ConsesLow.append(var11, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic89$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9857(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic92$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic92$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic92$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic92$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic92$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic92$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var11;
            var4 = (var11 = var5);
            module0002.f37((SubLObject)$ic93$, (SubLObject)$ic94$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic52$, var9, (SubLObject)ConsesLow.listS((SubLObject)$ic88$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic43$, var10, (SubLObject)$ic44$, var8), ConsesLow.append(var11, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic92$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9858(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic85$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic85$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic85$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic85$);
        var8 = var4.first();
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic85$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            module0002.f37((SubLObject)$ic95$, (SubLObject)$ic96$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic55$, (SubLObject)ConsesLow.listS((SubLObject)$ic88$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic43$, var9, (SubLObject)$ic44$, var8), ConsesLow.append(var10, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic85$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9859(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic97$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic97$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic97$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic97$);
        var8 = var4.first();
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic97$);
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic97$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var11;
            var4 = (var11 = var5);
            module0002.f37((SubLObject)$ic98$, (SubLObject)$ic99$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic59$, var9, (SubLObject)ConsesLow.listS((SubLObject)$ic88$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic43$, var10, (SubLObject)$ic44$, var8), ConsesLow.append(var11, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic97$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9860(final SubLObject var1, final SubLObject var2) {
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
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic100$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            module0002.f37((SubLObject)$ic101$, (SubLObject)$ic39$);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic42$, var9, (SubLObject)$ic44$, var8), ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic100$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9861(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic102$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic102$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic102$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var162_163 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic102$);
            var162_163 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic102$);
            if (NIL == conses_high.member(var162_163, (SubLObject)$ic103$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var162_163 == $ic104$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic102$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic42$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic43$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic105$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic44$, var4);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19;
        var4 = (var19 = var5);
        module0002.f37((SubLObject)$ic106$, (SubLObject)$ic39$);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, $ic42$, var12, $ic43$, var14, $ic105$, var16, $ic44$, var18 }), ConsesLow.append(var19, (SubLObject)NIL));
    }
    
    public static SubLObject f9862(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic107$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic107$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic107$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic107$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic107$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic107$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var11;
            var4 = (var11 = var5);
            module0002.f37((SubLObject)$ic108$, (SubLObject)$ic109$);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic110$, (SubLObject)ConsesLow.list(var6, var7, var8, (SubLObject)$ic42$, var10, (SubLObject)$ic44$, var9), ConsesLow.append(var11, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9863(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic111$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic111$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic111$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic111$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic111$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic111$);
        var10 = var4.first();
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic111$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var12;
            var4 = (var12 = var5);
            module0002.f37((SubLObject)$ic112$, (SubLObject)$ic113$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic114$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic110$, (SubLObject)ConsesLow.list(var6, var7, var8, (SubLObject)$ic42$, var11, (SubLObject)$ic44$, var9), ConsesLow.append(var12, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic111$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9864(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        var10 = var4.first();
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic115$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var12;
            var4 = (var12 = var5);
            module0002.f37((SubLObject)$ic116$, (SubLObject)$ic117$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic52$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic110$, (SubLObject)ConsesLow.list(var6, var7, var8, (SubLObject)$ic42$, var11, (SubLObject)$ic44$, var9), ConsesLow.append(var12, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic115$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9865(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic107$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic107$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic107$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic107$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic107$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic107$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var11;
            var4 = (var11 = var5);
            module0002.f37((SubLObject)$ic118$, (SubLObject)$ic119$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic55$, (SubLObject)ConsesLow.listS((SubLObject)$ic110$, (SubLObject)ConsesLow.list(var6, var7, var8, (SubLObject)$ic42$, var10, (SubLObject)$ic44$, var9), ConsesLow.append(var11, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9866(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic111$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic111$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic111$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic111$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic111$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic111$);
        var10 = var4.first();
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic111$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var12;
            var4 = (var12 = var5);
            module0002.f37((SubLObject)$ic120$, (SubLObject)$ic121$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic59$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic110$, (SubLObject)ConsesLow.list(var6, var7, var8, (SubLObject)$ic42$, var11, (SubLObject)$ic44$, var9), ConsesLow.append(var12, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic111$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9867(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic122$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic122$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic122$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic122$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic122$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic122$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic122$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var12;
            var4 = (var12 = var5);
            module0002.f37((SubLObject)$ic123$, (SubLObject)$ic124$);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic125$, (SubLObject)ConsesLow.list(var6, var7, var11, var8, (SubLObject)$ic42$, var10, (SubLObject)$ic44$, var9), ConsesLow.append(var12, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic122$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9868(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic126$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic126$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic126$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic126$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic126$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic126$);
        var10 = var4.first();
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic126$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic126$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var13;
            var4 = (var13 = var5);
            module0002.f37((SubLObject)$ic127$, (SubLObject)$ic128$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic114$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic125$, (SubLObject)ConsesLow.list(var6, var7, var12, var8, (SubLObject)$ic42$, var11, (SubLObject)$ic44$, var9), ConsesLow.append(var13, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic126$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9869(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic129$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic129$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic129$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic129$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic129$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic129$);
        var10 = var4.first();
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic129$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic129$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var13;
            var4 = (var13 = var5);
            module0002.f37((SubLObject)$ic130$, (SubLObject)$ic131$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic52$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic125$, (SubLObject)ConsesLow.list(var6, var7, var12, var8, (SubLObject)$ic42$, var11, (SubLObject)$ic44$, var9), ConsesLow.append(var13, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic129$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9870(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic122$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic122$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic122$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic122$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic122$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic122$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic122$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var12;
            var4 = (var12 = var5);
            module0002.f37((SubLObject)$ic132$, (SubLObject)$ic133$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic55$, (SubLObject)ConsesLow.listS((SubLObject)$ic125$, (SubLObject)ConsesLow.list(var6, var7, var11, var8, (SubLObject)$ic42$, var10, (SubLObject)$ic44$, var9), ConsesLow.append(var12, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic122$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9871(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic134$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic134$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic134$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic134$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic134$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic134$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic134$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic134$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var13;
            var4 = (var13 = var5);
            module0002.f37((SubLObject)$ic135$, (SubLObject)$ic136$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic59$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic125$, (SubLObject)ConsesLow.list(var6, var7, var12, var8, (SubLObject)$ic42$, var11, (SubLObject)$ic44$, var9), ConsesLow.append(var13, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic134$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9872(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic137$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic137$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : $ic138$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic137$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            module0002.f37((SubLObject)$ic139$, (SubLObject)$ic140$);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic141$, (SubLObject)ConsesLow.list(var6, var7), ConsesLow.append(var8, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic137$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9873(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic142$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic142$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic142$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic142$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            module0002.f37((SubLObject)$ic143$, (SubLObject)$ic144$);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic145$, (SubLObject)ConsesLow.listS(var6, var7, var8, (SubLObject)$ic146$), ConsesLow.append(var9, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic142$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9874() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9803", "S#12630");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9804", "S#12631");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9805", "S#12632");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9806", "S#12633");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9807", "S#12634");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9808", "S#12635");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9809", "S#12636");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9810", "S#12637");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9811", "S#12638");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9812", "S#12639");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9813", "S#12640");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9814", "S#12641");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9815", "S#12642");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9816", "S#12643");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9817", "S#12644");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9818", "S#12645");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9819", "S#12646");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9820", "S#12647");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9821", "S#12648");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9822", "S#12649");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9823", "S#12650");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9824", "S#12651");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9825", "S#12652");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9826", "S#12653");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9827", "S#12654");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9828", "S#12655");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9829", "S#12656");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9830", "S#12657");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9831", "S#12658");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9832", "S#12659");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9833", "S#12660");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9834", "S#12661");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9835", "S#12662");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9836", "S#12663");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9837", "S#12664");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9838", "S#12665");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9839", "S#12666");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9840", "S#12667");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9841", "S#12668");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9842", "S#12669");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9843", "S#12670");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9844", "S#12671");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9845", "S#12672");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9846", "S#12673");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9847", "S#12674");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9848", "S#12675");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9849", "S#12676");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9850", "S#12677");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9851", "S#12678");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9852", "S#12679");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9853", "S#12680");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9854", "S#12681");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9855", "S#12682");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9856", "S#12683");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9857", "S#12684");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9858", "S#12685");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9859", "S#12686");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9860", "S#12687");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9861", "S#12688");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9862", "S#12689");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9863", "S#12690");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9864", "S#12691");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9865", "S#12692");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9866", "S#12693");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9867", "S#12694");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9868", "S#12695");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9869", "S#12696");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9870", "S#12697");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9871", "S#12698");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9872", "S#12699");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0156", "f9873", "S#12700");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9875() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9876() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f9874();
    }
    
    public void initializeVariables() {
        f9875();
    }
    
    public void runTopLevelForms() {
        f9876();
    }
    
    static {
        me = (SubLFile)new module0156();
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1504", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeSymbol("PROGN");
        $ic2$ = makeSymbol("S#907", "CYC");
        $ic3$ = makeSymbol("S#921", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#1240", "CYC"), (SubLObject)makeSymbol("S#1241", "CYC"));
        $ic5$ = makeSymbol("CLET");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1491", "CYC"), (SubLObject)NIL));
        $ic7$ = makeSymbol("S#12630", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("S#1242", "CYC"));
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("S#1243", "CYC"));
        $ic10$ = makeSymbol("S#923", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1498", "CYC"), (SubLObject)T));
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("S#907", "CYC"), (SubLObject)makeSymbol("S#1253", "CYC"));
        $ic13$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#908", "CYC"), (SubLObject)Characters.CHAR_greater));
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#1263", "CYC"));
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("S#1260", "CYC"));
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#1265", "CYC"));
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1491", "CYC"), (SubLObject)T));
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("S#1261", "CYC"));
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#907", "CYC"), (SubLObject)makeSymbol("S#1254", "CYC"));
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("S#1276", "CYC"), (SubLObject)makeSymbol("S#1277", "CYC"));
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("S#1278", "CYC"));
        $ic22$ = ConsesLow.list((SubLObject)makeSymbol("S#1279", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#1531", "CYC"), (SubLObject)makeSymbol("S#1280", "CYC"));
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("S#1282", "CYC"), (SubLObject)makeSymbol("S#1283", "CYC"));
        $ic25$ = ConsesLow.list((SubLObject)makeSymbol("S#1531", "CYC"), (SubLObject)makeSymbol("S#1285", "CYC"));
        $ic26$ = ConsesLow.list((SubLObject)makeSymbol("S#1294", "CYC"), (SubLObject)makeSymbol("S#1295", "CYC"));
        $ic27$ = ConsesLow.list((SubLObject)makeSymbol("S#1296", "CYC"));
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("S#1298", "CYC"));
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("S#1297", "CYC"));
        $ic30$ = ConsesLow.list((SubLObject)makeSymbol("S#1339", "CYC"), (SubLObject)makeSymbol("S#1340", "CYC"));
        $ic31$ = ConsesLow.list((SubLObject)makeSymbol("S#1341", "CYC"));
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#1342", "CYC"));
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#907", "CYC"), (SubLObject)makeSymbol("S#1389", "CYC"));
        $ic34$ = ConsesLow.list((SubLObject)makeSymbol("S#1398", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)makeSymbol("S#1395", "CYC"));
        $ic36$ = ConsesLow.list((SubLObject)makeSymbol("S#1397", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)ONE_INTEGER), (SubLObject)makeSymbol("S#12576", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic38$ = makeSymbol("S#12662", "CYC");
        $ic39$ = ConsesLow.list((SubLObject)makeSymbol("DO-GAF-ARG-INDEX"));
        $ic40$ = makeSymbol("DO-GAF-ARG-INDEX");
        $ic41$ = makeKeyword("PREDICATE");
        $ic42$ = makeKeyword("INDEX");
        $ic43$ = makeKeyword("TRUTH");
        $ic44$ = makeKeyword("DONE");
        $ic45$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)ONE_INTEGER), (SubLObject)makeSymbol("S#12576", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic46$ = makeSymbol("S#12663", "CYC");
        $ic47$ = ConsesLow.list((SubLObject)makeSymbol("WITH-JUST-MT"), (SubLObject)makeSymbol("DO-GAF-ARG-INDEX"));
        $ic48$ = makeSymbol("WITH-JUST-MT");
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#12701", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)ONE_INTEGER), (SubLObject)makeSymbol("S#12576", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic50$ = makeSymbol("S#12664", "CYC");
        $ic51$ = ConsesLow.list((SubLObject)makeSymbol("WITH-MT-LIST"), (SubLObject)makeSymbol("DO-GAF-ARG-INDEX"));
        $ic52$ = makeSymbol("WITH-MT-LIST");
        $ic53$ = makeSymbol("S#12665", "CYC");
        $ic54$ = ConsesLow.list((SubLObject)makeSymbol("WITH-ALL-MTS"), (SubLObject)makeSymbol("DO-GAF-ARG-INDEX"));
        $ic55$ = makeSymbol("WITH-ALL-MTS");
        $ic56$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)ONE_INTEGER), (SubLObject)makeSymbol("S#12576", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic57$ = makeSymbol("S#12666", "CYC");
        $ic58$ = ConsesLow.list((SubLObject)makeSymbol("S#12296", "CYC"), (SubLObject)makeSymbol("DO-GAF-ARG-INDEX"));
        $ic59$ = makeSymbol("S#12296", "CYC");
        $ic60$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11198", "CYC"), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12702", "CYC"), (SubLObject)TWO_INTEGER), (SubLObject)makeSymbol("S#12576", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic61$ = makeSymbol("S#12667", "CYC");
        $ic62$ = ConsesLow.list((SubLObject)makeSymbol("S#12703", "CYC"));
        $ic63$ = makeSymbol("S#12703", "CYC");
        $ic64$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeSymbol("VAR", "CYC"), makeSymbol("S#12141", "CYC"), makeSymbol("S#155", "CYC"), makeSymbol("S#127", "CYC"), makeSymbol("S#11445", "CYC"), makeSymbol("&OPTIONAL"), ConsesLow.list((SubLObject)makeSymbol("S#11198", "CYC"), (SubLObject)ONE_INTEGER), ConsesLow.list((SubLObject)makeSymbol("S#12702", "CYC"), (SubLObject)TWO_INTEGER), makeSymbol("S#12576", "CYC") }), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic65$ = makeSymbol("S#12668", "CYC");
        $ic66$ = ConsesLow.list((SubLObject)makeSymbol("WITH-JUST-MT"), (SubLObject)makeSymbol("S#12703", "CYC"));
        $ic67$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeSymbol("VAR", "CYC"), makeSymbol("S#12141", "CYC"), makeSymbol("S#155", "CYC"), makeSymbol("S#127", "CYC"), makeSymbol("S#12701", "CYC"), makeSymbol("&OPTIONAL"), ConsesLow.list((SubLObject)makeSymbol("S#11198", "CYC"), (SubLObject)ONE_INTEGER), ConsesLow.list((SubLObject)makeSymbol("S#12702", "CYC"), (SubLObject)TWO_INTEGER), makeSymbol("S#12576", "CYC") }), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic68$ = makeSymbol("S#12669", "CYC");
        $ic69$ = ConsesLow.list((SubLObject)makeSymbol("WITH-MT-LIST"), (SubLObject)makeSymbol("S#12703", "CYC"));
        $ic70$ = makeSymbol("S#12670", "CYC");
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("WITH-ALL-MTS"), (SubLObject)makeSymbol("S#12703", "CYC"));
        $ic72$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeSymbol("VAR", "CYC"), makeSymbol("S#12141", "CYC"), makeSymbol("S#155", "CYC"), makeSymbol("S#127", "CYC"), makeSymbol("&OPTIONAL"), makeSymbol("S#11445", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#11198", "CYC"), (SubLObject)ONE_INTEGER), ConsesLow.list((SubLObject)makeSymbol("S#12702", "CYC"), (SubLObject)TWO_INTEGER), makeSymbol("S#12576", "CYC") }), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic73$ = makeSymbol("S#12671", "CYC");
        $ic74$ = ConsesLow.list((SubLObject)makeSymbol("S#12296", "CYC"), (SubLObject)makeSymbol("S#12703", "CYC"));
        $ic75$ = makeSymbol("S#12672", "CYC");
        $ic76$ = makeSymbol("S#12673", "CYC");
        $ic77$ = makeSymbol("S#12674", "CYC");
        $ic78$ = makeSymbol("S#12675", "CYC");
        $ic79$ = makeSymbol("S#12676", "CYC");
        $ic80$ = makeSymbol("S#12677", "CYC");
        $ic81$ = makeSymbol("S#12678", "CYC");
        $ic82$ = makeSymbol("S#12679", "CYC");
        $ic83$ = makeSymbol("S#12680", "CYC");
        $ic84$ = makeSymbol("S#12681", "CYC");
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#12576", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic86$ = makeSymbol("S#12682", "CYC");
        $ic87$ = ConsesLow.list((SubLObject)makeSymbol("DO-PREDICATE-EXTENT-INDEX"));
        $ic88$ = makeSymbol("DO-PREDICATE-EXTENT-INDEX");
        $ic89$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#12576", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic90$ = makeSymbol("S#12683", "CYC");
        $ic91$ = ConsesLow.list((SubLObject)makeSymbol("WITH-JUST-MT"), (SubLObject)makeSymbol("DO-PREDICATE-EXTENT-INDEX"));
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#12701", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#12576", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic93$ = makeSymbol("S#12684", "CYC");
        $ic94$ = ConsesLow.list((SubLObject)makeSymbol("WITH-MT-LIST"), (SubLObject)makeSymbol("DO-PREDICATE-EXTENT-INDEX"));
        $ic95$ = makeSymbol("S#12685", "CYC");
        $ic96$ = ConsesLow.list((SubLObject)makeSymbol("WITH-ALL-MTS"), (SubLObject)makeSymbol("DO-PREDICATE-EXTENT-INDEX"));
        $ic97$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#12576", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic98$ = makeSymbol("S#12686", "CYC");
        $ic99$ = ConsesLow.list((SubLObject)makeSymbol("S#12296", "CYC"), (SubLObject)makeSymbol("DO-PREDICATE-EXTENT-INDEX"));
        $ic100$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)ONE_INTEGER)), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic101$ = makeSymbol("S#12687", "CYC");
        $ic102$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12704", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic103$ = ConsesLow.list((SubLObject)makeKeyword("INDEX"), (SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("DONE"));
        $ic104$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic105$ = makeKeyword("DIRECTION");
        $ic106$ = makeSymbol("S#12688", "CYC");
        $ic107$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)ONE_INTEGER)), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic108$ = makeSymbol("S#12689", "CYC");
        $ic109$ = ConsesLow.list((SubLObject)makeSymbol("S#12705", "CYC"));
        $ic110$ = makeSymbol("S#12705", "CYC");
        $ic111$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)ONE_INTEGER)), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic112$ = makeSymbol("S#12690", "CYC");
        $ic113$ = ConsesLow.list((SubLObject)makeSymbol("WITH-MT"), (SubLObject)makeSymbol("S#12705", "CYC"));
        $ic114$ = makeSymbol("WITH-MT");
        $ic115$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#12701", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)ONE_INTEGER)), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic116$ = makeSymbol("S#12691", "CYC");
        $ic117$ = ConsesLow.list((SubLObject)makeSymbol("WITH-MT-LIST"), (SubLObject)makeSymbol("S#12705", "CYC"));
        $ic118$ = makeSymbol("S#12692", "CYC");
        $ic119$ = ConsesLow.list((SubLObject)makeSymbol("WITH-ALL-MTS"), (SubLObject)makeSymbol("S#12705", "CYC"));
        $ic120$ = makeSymbol("S#12693", "CYC");
        $ic121$ = ConsesLow.list((SubLObject)makeSymbol("S#12296", "CYC"), (SubLObject)makeSymbol("S#12705", "CYC"));
        $ic122$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11198", "CYC"), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12702", "CYC"), (SubLObject)TWO_INTEGER)), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic123$ = makeSymbol("S#12694", "CYC");
        $ic124$ = ConsesLow.list((SubLObject)makeSymbol("S#12706", "CYC"));
        $ic125$ = makeSymbol("S#12706", "CYC");
        $ic126$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11198", "CYC"), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12702", "CYC"), (SubLObject)TWO_INTEGER)), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic127$ = makeSymbol("S#12695", "CYC");
        $ic128$ = ConsesLow.list((SubLObject)makeSymbol("WITH-MT"), (SubLObject)makeSymbol("S#12706", "CYC"));
        $ic129$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#12701", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11198", "CYC"), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12702", "CYC"), (SubLObject)TWO_INTEGER)), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic130$ = makeSymbol("S#12696", "CYC");
        $ic131$ = ConsesLow.list((SubLObject)makeSymbol("WITH-MT-LIST"), (SubLObject)makeSymbol("S#12706", "CYC"));
        $ic132$ = makeSymbol("S#12697", "CYC");
        $ic133$ = ConsesLow.list((SubLObject)makeSymbol("WITH-ALL-MTS"), (SubLObject)makeSymbol("S#12706", "CYC"));
        $ic134$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11198", "CYC"), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12702", "CYC"), (SubLObject)TWO_INTEGER)), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic135$ = makeSymbol("S#12698", "CYC");
        $ic136$ = ConsesLow.list((SubLObject)makeSymbol("S#12296", "CYC"), (SubLObject)makeSymbol("S#12706", "CYC"));
        $ic137$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#295", "CYC"), (SubLObject)makeString("mapping Cyc NATs"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic138$ = makeString("mapping Cyc NATs");
        $ic139$ = makeSymbol("S#12699", "CYC");
        $ic140$ = ConsesLow.list((SubLObject)makeSymbol("DO-NARTS"));
        $ic141$ = makeSymbol("DO-NARTS");
        $ic142$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#56", "CYC"), (SubLObject)makeSymbol("S#57", "CYC"), (SubLObject)makeSymbol("S#58", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic143$ = makeSymbol("S#12700", "CYC");
        $ic144$ = ConsesLow.list((SubLObject)makeSymbol("S#47", "CYC"));
        $ic145$ = makeSymbol("S#47", "CYC");
        $ic146$ = ConsesLow.list((SubLObject)makeKeyword("ACCESS-MODE"), (SubLObject)makeKeyword("PRIVATE"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 440 ms
	
	Decompiled with Procyon 0.5.32.
*/