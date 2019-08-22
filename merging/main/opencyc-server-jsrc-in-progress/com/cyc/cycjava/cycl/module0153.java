package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0153 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0153";
    public static final String myFingerPrint = "98712826175262e07b5bd2ed5289c9f61addd0abe13d8e48c420f12492025132";
    public static SubLSymbol $g2135$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLInteger $ic46$;
    private static final SubLList $ic47$;
    private static final SubLList $ic48$;
    private static final SubLList $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLList $ic63$;
    private static final SubLList $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLList $ic69$;
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLList $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLList $ic81$;
    private static final SubLList $ic82$;
    private static final SubLList $ic83$;
    private static final SubLList $ic84$;
    
    public static SubLObject f9732(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var5), (SubLObject)$ic4$, var5), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic6$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9733(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, reader.bq_cons((SubLObject)$ic7$, ConsesLow.append(var5, (SubLObject)$ic8$)));
    }
    
    public static SubLObject f9734(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var5, (SubLObject)$ic11$), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic12$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9735(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic13$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var5, (SubLObject)$ic14$), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic15$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9736(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic16$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var5, (SubLObject)$ic17$), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic18$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9737(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic16$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var5, (SubLObject)$ic17$), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic19$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9738(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic16$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic20$, var5, (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var5, (SubLObject)$ic17$)), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic21$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9739(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic16$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var5, (SubLObject)$ic17$), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic22$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9740(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic16$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic23$, var5), (SubLObject)$ic24$, var5), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic25$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9741(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic16$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var5, (SubLObject)$ic17$), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic26$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9742(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic16$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var5, (SubLObject)$ic17$), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic27$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9743(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic28$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic29$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9744(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic30$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic31$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9745(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic13$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var5, (SubLObject)$ic14$), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic32$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9746(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic33$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var5, (SubLObject)$ic34$), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic35$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9747(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic33$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var5, (SubLObject)$ic34$), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic36$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9748(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic38$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9749(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic39$, (SubLObject)$ic40$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9750(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic41$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9751(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic42$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic42$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : THREE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic42$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)$ic44$, (SubLObject)ConsesLow.list((SubLObject)$ic45$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic42$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9752(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)$ic47$, (SubLObject)$ic48$, (SubLObject)$ic49$, (SubLObject)$ic50$, (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)$ic51$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9753(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic52$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic53$, (SubLObject)ConsesLow.list((SubLObject)$ic54$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9754(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic55$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.listS((SubLObject)$ic56$, (SubLObject)ConsesLow.list((SubLObject)$ic57$, var5), (SubLObject)$ic58$), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9755(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic59$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic60$, (SubLObject)ConsesLow.listS((SubLObject)$ic61$, var5, (SubLObject)$ic62$), (SubLObject)$ic63$, (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.listS((SubLObject)$ic64$, (SubLObject)ConsesLow.list((SubLObject)$ic65$, var5), (SubLObject)$ic66$), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9756(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)$ic67$, (SubLObject)$ic68$, (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)$ic51$, (SubLObject)$ic69$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9757(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic70$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic20$, (SubLObject)$ic71$, (SubLObject)ConsesLow.listS((SubLObject)$ic72$, (SubLObject)ConsesLow.list((SubLObject)$ic73$, (SubLObject)ConsesLow.list((SubLObject)$ic74$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic75$, var5)), (SubLObject)$ic76$)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9758(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)$ic77$, reader.bq_cons((SubLObject)$ic1$, ConsesLow.append(var5, (SubLObject)$ic76$)));
    }
    
    public static SubLObject f9759(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic78$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic79$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9760(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic80$, (SubLObject)$ic81$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9761(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic82$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9762(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic83$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9763(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic84$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9764() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9732", "S#12541");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9733", "S#12542");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9734", "S#12543");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9735", "S#12544");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9736", "S#12545");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9737", "S#12546");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9738", "S#12547");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9739", "S#12548");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9740", "S#12549");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9741", "S#12550");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9742", "S#12551");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9743", "S#12552");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9744", "S#12553");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9745", "S#12554");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9746", "S#12555");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9747", "S#12556");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9748", "S#12557");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9749", "S#12558");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9750", "S#12559");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9751", "S#12560");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9752", "S#12561");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9753", "S#12562");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9754", "S#12563");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9755", "S#12564");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9756", "S#12565");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9757", "S#12566");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9758", "S#12567");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9759", "S#12568");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9760", "S#12569");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9761", "S#12570");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9762", "S#12571");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0153", "f9763", "S#12572");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9765() {
        $g2135$ = SubLFiles.defparameter("S#12573", (SubLObject)$ic46$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9766() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f9764();
    }
    
    public void initializeVariables() {
        f9765();
    }
    
    public void runTopLevelForms() {
        f9766();
    }
    
    static {
        me = (SubLFile)new module0153();
        $g2135$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#4785", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeSymbol("PROGN");
        $ic2$ = makeSymbol("MUST");
        $ic3$ = makeSymbol("S#12574", "CYC");
        $ic4$ = makeString("invalid gt mode: ~a");
        $ic5$ = makeSymbol("CLET");
        $ic6$ = makeSymbol("S#12019", "CYC");
        $ic7$ = makeSymbol("S#11248", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol(">="), (SubLObject)makeSymbol("S#12064", "CYC"), (SubLObject)FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12575", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("SBHL-MARKED-NODES")))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("PWHEN"), (SubLObject)makeSymbol("S#12575", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11994", "CYC"), (SubLObject)THREE_INTEGER, (SubLObject)makeString("~s marked constants: ~s"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("LENGTH"), (SubLObject)makeSymbol("S#12575", "CYC")), (SubLObject)makeSymbol("S#12575", "CYC"))))));
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic10$ = makeSymbol("CHECK-TYPE");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("TRUTH-P"));
        $ic12$ = makeSymbol("S#12021", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("FORT-P"));
        $ic15$ = makeSymbol("S#12012", "CYC");
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#11675", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION-SPEC-P"));
        $ic18$ = makeSymbol("S#12032", "CYC");
        $ic19$ = makeSymbol("S#12028", "CYC");
        $ic20$ = makeSymbol("PWHEN");
        $ic21$ = makeSymbol("S#12029", "CYC");
        $ic22$ = makeSymbol("S#12077", "CYC");
        $ic23$ = makeSymbol("FUNCTION-SPEC-P");
        $ic24$ = makeString("~a is not a function");
        $ic25$ = makeSymbol("S#12031", "CYC");
        $ic26$ = makeSymbol("S#12030", "CYC");
        $ic27$ = makeSymbol("S#12033", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("S#1553", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic29$ = makeSymbol("S#12025", "CYC");
        $ic30$ = ConsesLow.list((SubLObject)makeSymbol("S#12577", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic31$ = makeSymbol("S#12027", "CYC");
        $ic32$ = makeSymbol("S#12035", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#202", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic34$ = ConsesLow.list((SubLObject)makeSymbol("FIXNUMP"));
        $ic35$ = makeSymbol("S#12036", "CYC");
        $ic36$ = makeSymbol("S#12037", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("S#12578", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic38$ = makeSymbol("S#12040", "CYC");
        $ic39$ = makeSymbol("CCATCH-IGNORE");
        $ic40$ = makeKeyword("GT-ERROR");
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12065", "CYC"), (SubLObject)T));
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#696", "CYC"), (SubLObject)THREE_INTEGER));
        $ic43$ = makeSymbol("PUNLESS");
        $ic44$ = ConsesLow.list((SubLObject)makeSymbol("COR"), (SubLObject)makeSymbol("*SUSPEND-TYPE-CHECKING?*"), (SubLObject)makeSymbol("S#12065", "CYC"), (SubLObject)makeSymbol("*IGNORE-MUSTS?*"));
        $ic45$ = makeSymbol("S#12579", "CYC");
        $ic46$ = makeInteger(64);
        $ic47$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12580", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12573", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("INTEGERP"), (SubLObject)makeSymbol("S#12573", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("-"), (SubLObject)makeSymbol("S#12573", "CYC"), (SubLObject)ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12049", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("-"), (SubLObject)makeSymbol("S#12049", "CYC"), (SubLObject)ONE_INTEGER)));
        $ic48$ = ConsesLow.list((SubLObject)makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("INTEGERP"), (SubLObject)makeSymbol("S#12573", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("<"), (SubLObject)makeSymbol("S#12573", "CYC"), (SubLObject)ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("PIF-FEATURE"), (SubLObject)makeKeyword("CYC-MAINT"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ERROR"), (SubLObject)makeString("GT recursion limit reached.  Please report this problem on bug 15244.")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ERROR"), (SubLObject)makeString("GT recursion limit reached."))));
        $ic49$ = ConsesLow.list((SubLObject)makeSymbol("PWHEN"), (SubLObject)makeSymbol("S#12050", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("<"), (SubLObject)makeSymbol("S#12049", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#12580", "CYC"), (SubLObject)T)));
        $ic50$ = ConsesLow.list((SubLObject)makeSymbol("PWHEN"), (SubLObject)makeSymbol("S#12052", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("<"), (SubLObject)makeSymbol("S#12053", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("/"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("-"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("GET-INTERNAL-REAL-TIME")), (SubLObject)makeSymbol("S#12054", "CYC")), (SubLObject)makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#12580", "CYC"), (SubLObject)T)));
        $ic51$ = makeSymbol("S#12580", "CYC");
        $ic52$ = ConsesLow.list((SubLObject)makeSymbol("S#10875", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic53$ = ConsesLow.list((SubLObject)makeSymbol("S#12050", "CYC"), (SubLObject)T);
        $ic54$ = makeSymbol("S#12049", "CYC");
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("S#12581", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic56$ = ConsesLow.list((SubLObject)makeSymbol("S#12052", "CYC"), (SubLObject)T);
        $ic57$ = makeSymbol("S#12053", "CYC");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12054", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("GET-INTERNAL-REAL-TIME"))));
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("S#1993", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic60$ = makeSymbol("PIF");
        $ic61$ = makeSymbol("<");
        $ic62$ = ConsesLow.list((SubLObject)ONE_INTEGER);
        $ic63$ = ConsesLow.list((SubLObject)makeSymbol("S#11994", "CYC"), (SubLObject)THREE_INTEGER, (SubLObject)makeString("illegal value for number of answers cutoff. try a bigger one"));
        $ic64$ = ConsesLow.list((SubLObject)makeSymbol("S#12055", "CYC"), (SubLObject)T);
        $ic65$ = makeSymbol("S#12056", "CYC");
        $ic66$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12057", "CYC"), (SubLObject)ZERO_INTEGER));
        $ic67$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12580", "CYC"), (SubLObject)NIL));
        $ic68$ = ConsesLow.list((SubLObject)makeSymbol("PWHEN"), (SubLObject)makeSymbol("S#12055", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol(">="), (SubLObject)makeSymbol("S#12057", "CYC"), (SubLObject)makeSymbol("S#12056", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#422", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#12580", "CYC"), (SubLObject)T)));
        $ic69$ = ConsesLow.list((SubLObject)makeSymbol("CINC"), (SubLObject)makeSymbol("S#12057", "CYC"));
        $ic70$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic71$ = makeSymbol("S#12060", "CYC");
        $ic72$ = makeSymbol("CPUSH");
        $ic73$ = makeSymbol("LIST");
        $ic74$ = makeSymbol("GAF-ARG1");
        $ic75$ = makeSymbol("GAF-ARG2");
        $ic76$ = ConsesLow.list((SubLObject)makeSymbol("S#12059", "CYC"));
        $ic77$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12060", "CYC"), (SubLObject)T), (SubLObject)makeSymbol("S#12059", "CYC"));
        $ic78$ = ConsesLow.list((SubLObject)makeSymbol("S#705", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic79$ = makeSymbol("S#12047", "CYC");
        $ic80$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12048", "CYC"), (SubLObject)makeSymbol("S#12047", "CYC")), (SubLObject)makeSymbol("S#12047", "CYC"));
        $ic81$ = ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#12047", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("MAKE-HASH-TABLE"), (SubLObject)makeInteger(128)));
        $ic82$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12080", "CYC"), (SubLObject)T));
        $ic83$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12583", "CYC"), (SubLObject)NIL));
        $ic84$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12583", "CYC"), (SubLObject)T));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 106 ms
	
	Decompiled with Procyon 0.5.32.
*/