package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0073 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0073";
    public static final String myFingerPrint = "63986bd00b5efd5da61d914c1d317bdab5ac4f0c4994314831c6f2c53a29176a";
    private static SubLSymbol $g1113$;
    private static SubLSymbol $g1114$;
    private static SubLSymbol $g1115$;
    private static SubLSymbol $g1116$;
    private static SubLSymbol $g1117$;
    public static SubLSymbol $g1118$;
    public static SubLSymbol $g1119$;
    private static SubLSymbol $g1120$;
    public static SubLSymbol $g1121$;
    public static SubLSymbol $g1122$;
    private static SubLSymbol $g1123$;
    public static SubLSymbol $g1124$;
    public static SubLSymbol $g1125$;
    private static SubLSymbol $g1126$;
    public static SubLSymbol $g1127$;
    public static SubLSymbol $g1128$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
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
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    
    public static SubLObject f5118(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic7$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5119(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic8$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic7$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5120(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic9$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic7$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5121(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic10$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic11$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5122(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic12$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic11$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5123(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic13$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic11$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5124(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic14$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic15$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5125(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic16$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic15$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5126(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic17$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic15$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5127(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic18$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic19$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5128(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic20$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic19$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5129(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic21$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic19$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5130(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic22$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5131(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic8$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic22$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5132(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic9$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic22$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5133(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic10$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic23$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5134(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic12$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic23$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5135(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic13$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic23$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5136(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic14$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic24$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5137(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic16$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic24$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5138(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic17$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic24$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5139(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic18$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic25$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5140(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic20$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic25$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5141(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic21$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), (SubLObject)$ic25$), var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5142(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic26$);
        var5 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic27$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic26$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5143(final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var57, SubLObject var58) {
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)$ic29$;
        }
        final SubLObject var59 = module0072.f5096(var5, var6, var7, var57, var58);
        module0072.f5103(var59);
        return module0072.f5105(var59);
    }
    
    public static SubLObject f5144(final SubLObject var6) {
        final SubLObject var7 = module0067.f4884(module0072.$g1107$.getGlobalValue(), var6, (SubLObject)UNPROVIDED);
        if (NIL != var7) {
            module0072.f5091(var7, (SubLObject)NIL);
            Symbols.set(module0072.f5081(var7), module0072.f5105(var7));
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5145() {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62 = (SubLObject)NIL;
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = (SubLObject)NIL;
        var61 = module0072.$g1107$.getGlobalValue();
        module0072.$g1107$.setGlobalValue(module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        var62 = module0072.$g1108$.getGlobalValue();
        module0072.$g1108$.setGlobalValue((SubLObject)NIL);
        var63 = module0072.$g1111$.getGlobalValue();
        module0072.$g1111$.setGlobalValue((SubLObject)NIL);
        $g1128$.setGlobalValue($g1114$.getGlobalValue());
        $g1127$.setGlobalValue($g1114$.getGlobalValue());
        $g1126$.setGlobalValue($g1114$.getGlobalValue());
        $g1119$.setGlobalValue($g1114$.getGlobalValue());
        $g1118$.setGlobalValue($g1114$.getGlobalValue());
        $g1117$.setGlobalValue($g1114$.getGlobalValue());
        $g1116$.setGlobalValue($g1114$.getGlobalValue());
        $g1122$.setDynamicValue($g1114$.getGlobalValue(), var60);
        $g1121$.setDynamicValue($g1114$.getGlobalValue(), var60);
        $g1120$.setDynamicValue($g1114$.getGlobalValue(), var60);
        $g1125$.setDynamicValue($g1114$.getGlobalValue(), var60);
        $g1124$.setDynamicValue($g1114$.getGlobalValue(), var60);
        $g1123$.setDynamicValue($g1114$.getGlobalValue(), var60);
        module0072.f5103(module0072.f5096($g1113$.getGlobalValue(), (SubLObject)$ic40$, $g1114$.getGlobalValue(), (SubLObject)$ic35$, (SubLObject)UNPROVIDED));
        module0072.f5103(module0072.f5096($g1113$.getGlobalValue(), (SubLObject)$ic39$, $g1114$.getGlobalValue(), (SubLObject)$ic35$, (SubLObject)UNPROVIDED));
        module0072.f5103(module0072.f5096($g1113$.getGlobalValue(), (SubLObject)$ic37$, $g1114$.getGlobalValue(), (SubLObject)$ic35$, (SubLObject)UNPROVIDED));
        module0072.f5103(module0072.f5096($g1113$.getGlobalValue(), (SubLObject)$ic34$, $g1114$.getGlobalValue(), (SubLObject)$ic35$, (SubLObject)UNPROVIDED));
        module0072.f5103(module0072.f5096($g1113$.getGlobalValue(), (SubLObject)$ic52$, $g1114$.getGlobalValue(), (SubLObject)$ic50$, (SubLObject)UNPROVIDED));
        module0072.f5103(module0072.f5096($g1113$.getGlobalValue(), (SubLObject)$ic51$, $g1114$.getGlobalValue(), (SubLObject)$ic50$, (SubLObject)UNPROVIDED));
        module0072.f5103(module0072.f5096($g1113$.getGlobalValue(), (SubLObject)$ic49$, $g1114$.getGlobalValue(), (SubLObject)$ic50$, (SubLObject)UNPROVIDED));
        module0072.f5103(module0072.f5096($g1113$.getGlobalValue(), (SubLObject)$ic44$, $g1114$.getGlobalValue(), (SubLObject)$ic42$, (SubLObject)UNPROVIDED));
        module0072.f5103(module0072.f5096($g1113$.getGlobalValue(), (SubLObject)$ic43$, $g1114$.getGlobalValue(), (SubLObject)$ic42$, (SubLObject)UNPROVIDED));
        module0072.f5103(module0072.f5096($g1113$.getGlobalValue(), (SubLObject)$ic41$, $g1114$.getGlobalValue(), (SubLObject)$ic42$, (SubLObject)UNPROVIDED));
        module0072.f5103(module0072.f5096($g1113$.getGlobalValue(), (SubLObject)$ic48$, $g1114$.getGlobalValue(), (SubLObject)$ic46$, (SubLObject)UNPROVIDED));
        module0072.f5103(module0072.f5096($g1113$.getGlobalValue(), (SubLObject)$ic47$, $g1114$.getGlobalValue(), (SubLObject)$ic46$, (SubLObject)UNPROVIDED));
        module0072.f5103(module0072.f5096($g1113$.getGlobalValue(), (SubLObject)$ic45$, $g1114$.getGlobalValue(), (SubLObject)$ic46$, (SubLObject)UNPROVIDED));
        if (!$g1128$.getGlobalValue().equal($g1114$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic53$, $g1114$.getGlobalValue(), $g1128$.getGlobalValue()), var64);
        }
        if (!$g1127$.getGlobalValue().equal($g1114$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic54$, $g1114$.getGlobalValue(), $g1127$.getGlobalValue()), var64);
        }
        if (!$g1126$.getGlobalValue().equal($g1114$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic55$, $g1114$.getGlobalValue(), $g1126$.getGlobalValue()), var64);
        }
        if (!$g1125$.getDynamicValue(var60).equal($g1114$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic56$, $g1114$.getGlobalValue(), $g1125$.getDynamicValue(var60)), var64);
        }
        if (!$g1124$.getDynamicValue(var60).equal($g1114$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic57$, $g1114$.getGlobalValue(), $g1124$.getDynamicValue(var60)), var64);
        }
        if (!$g1123$.getDynamicValue(var60).equal($g1114$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic58$, $g1114$.getGlobalValue(), $g1123$.getDynamicValue(var60)), var64);
        }
        if (!$g1119$.getGlobalValue().equal($g1114$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic59$, $g1114$.getGlobalValue(), $g1119$.getGlobalValue()), var64);
        }
        if (!$g1118$.getGlobalValue().equal($g1114$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic60$, $g1114$.getGlobalValue(), $g1118$.getGlobalValue()), var64);
        }
        if (!$g1117$.getGlobalValue().equal($g1114$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic61$, $g1114$.getGlobalValue(), $g1117$.getGlobalValue()), var64);
        }
        if (!$g1116$.getGlobalValue().equal($g1114$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic62$, $g1114$.getGlobalValue(), $g1116$.getGlobalValue()), var64);
        }
        if (!$g1122$.getDynamicValue(var60).equal($g1114$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic63$, $g1114$.getGlobalValue(), $g1122$.getDynamicValue(var60)), var64);
        }
        if (!$g1121$.getDynamicValue(var60).equal($g1114$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic64$, $g1114$.getGlobalValue(), $g1121$.getDynamicValue(var60)), var64);
        }
        if (!$g1120$.getDynamicValue(var60).equal($g1114$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic65$, $g1114$.getGlobalValue(), $g1120$.getDynamicValue(var60)), var64);
        }
        module0072.f5097();
        if (!$g1128$.getGlobalValue().equal($g1115$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic66$, $g1115$.getGlobalValue(), $g1128$.getGlobalValue()), var64);
        }
        if (!$g1127$.getGlobalValue().equal($g1115$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic67$, $g1115$.getGlobalValue(), $g1127$.getGlobalValue()), var64);
        }
        if (!$g1126$.getGlobalValue().equal($g1115$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic68$, $g1115$.getGlobalValue(), $g1126$.getGlobalValue()), var64);
        }
        if (!$g1125$.getDynamicValue(var60).equal($g1115$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic69$, $g1115$.getGlobalValue(), $g1125$.getDynamicValue(var60)), var64);
        }
        if (!$g1124$.getDynamicValue(var60).equal($g1115$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic70$, $g1115$.getGlobalValue(), $g1124$.getDynamicValue(var60)), var64);
        }
        if (!$g1123$.getDynamicValue(var60).equal($g1115$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic71$, $g1115$.getGlobalValue(), $g1123$.getDynamicValue(var60)), var64);
        }
        if (!$g1119$.getGlobalValue().equal($g1115$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic72$, $g1115$.getGlobalValue(), $g1119$.getGlobalValue()), var64);
        }
        if (!$g1118$.getGlobalValue().equal($g1115$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic73$, $g1115$.getGlobalValue(), $g1118$.getGlobalValue()), var64);
        }
        if (!$g1117$.getGlobalValue().equal($g1115$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic74$, $g1115$.getGlobalValue(), $g1117$.getGlobalValue()), var64);
        }
        if (!$g1116$.getGlobalValue().equal($g1115$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic75$, $g1115$.getGlobalValue(), $g1116$.getGlobalValue()), var64);
        }
        if (!$g1122$.getDynamicValue(var60).equal($g1115$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic76$, $g1115$.getGlobalValue(), $g1122$.getDynamicValue(var60)), var64);
        }
        if (!$g1121$.getDynamicValue(var60).equal($g1115$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic77$, $g1115$.getGlobalValue(), $g1121$.getDynamicValue(var60)), var64);
        }
        if (!$g1120$.getDynamicValue(var60).equal($g1115$.getGlobalValue())) {
            var64 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic78$, $g1115$.getGlobalValue(), $g1120$.getDynamicValue(var60)), var64);
        }
        module0072.$g1107$.setGlobalValue(var61);
        module0072.$g1108$.setGlobalValue(var62);
        module0072.$g1111$.setGlobalValue(var63);
        return Sequences.nreverse(var64);
    }
    
    public static SubLObject f5146() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5118", "S#6708");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5119", "S#6709");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5120", "S#6710");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5121", "S#6711");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5122", "S#6712");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5123", "S#6713");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5124", "S#6714");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5125", "S#6715");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5126", "S#6716");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5127", "S#6717");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5128", "S#6718");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5129", "S#6719");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5130", "S#6720");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5131", "S#6721");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5132", "S#6722");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5133", "S#6723");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5134", "S#6724");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5135", "S#6725");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5136", "S#6726");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5137", "S#6727");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5138", "S#6728");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5139", "S#6729");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5140", "S#6730");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5141", "S#6731");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0073", "f5142", "S#6732");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0073", "f5143", "S#6733", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0073", "f5144", "S#6734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0073", "f5145", "S#6735", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5147() {
        $g1113$ = SubLFiles.defconstant("S#6736", (SubLObject)$ic31$);
        $g1114$ = SubLFiles.defconstant("S#6737", (SubLObject)$ic32$);
        $g1115$ = SubLFiles.defconstant("S#6738", (SubLObject)$ic33$);
        $g1116$ = SubLFiles.deflexical("S#6739", f5143((SubLObject)($ic31$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic31$) : $ic31$), (SubLObject)$ic34$, (SubLObject)($ic32$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic32$) : $ic32$), (SubLObject)$ic35$, (SubLObject)UNPROVIDED));
        $g1117$ = SubLFiles.deflexical("S#6740", f5143((SubLObject)($ic36$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic36$) : $ic36$), (SubLObject)$ic37$, (SubLObject)($ic38$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic38$) : $ic38$), (SubLObject)$ic35$, (SubLObject)UNPROVIDED));
        $g1118$ = SubLFiles.deflexical("S#6741", f5143((SubLObject)($ic36$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic36$) : $ic36$), (SubLObject)$ic39$, (SubLObject)($ic38$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic38$) : $ic38$), (SubLObject)$ic35$, (SubLObject)UNPROVIDED));
        $g1119$ = SubLFiles.deflexical("S#6742", f5143((SubLObject)($ic36$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic36$) : $ic36$), (SubLObject)$ic40$, (SubLObject)($ic38$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic38$) : $ic38$), (SubLObject)$ic35$, (SubLObject)UNPROVIDED));
        $g1120$ = SubLFiles.defparameter("S#6743", f5143((SubLObject)($ic36$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic36$) : $ic36$), (SubLObject)$ic41$, (SubLObject)($ic38$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic38$) : $ic38$), (SubLObject)$ic42$, (SubLObject)UNPROVIDED));
        $g1121$ = SubLFiles.defparameter("S#6744", f5143((SubLObject)($ic36$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic36$) : $ic36$), (SubLObject)$ic43$, (SubLObject)($ic38$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic38$) : $ic38$), (SubLObject)$ic42$, (SubLObject)UNPROVIDED));
        $g1122$ = SubLFiles.defparameter("S#6745", f5143((SubLObject)($ic36$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic36$) : $ic36$), (SubLObject)$ic44$, (SubLObject)($ic38$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic38$) : $ic38$), (SubLObject)$ic42$, (SubLObject)UNPROVIDED));
        $g1123$ = SubLFiles.defvar("S#6746", f5143((SubLObject)($ic36$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic36$) : $ic36$), (SubLObject)$ic45$, (SubLObject)($ic38$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic38$) : $ic38$), (SubLObject)$ic46$, (SubLObject)UNPROVIDED));
        $g1124$ = SubLFiles.defvar("S#6747", f5143((SubLObject)($ic36$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic36$) : $ic36$), (SubLObject)$ic47$, (SubLObject)($ic38$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic38$) : $ic38$), (SubLObject)$ic46$, (SubLObject)UNPROVIDED));
        $g1125$ = SubLFiles.defvar("S#6748", f5143((SubLObject)($ic36$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic36$) : $ic36$), (SubLObject)$ic48$, (SubLObject)($ic38$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic38$) : $ic38$), (SubLObject)$ic46$, (SubLObject)UNPROVIDED));
        $g1126$ = SubLFiles.deflexical("S#6749", (NIL != Symbols.boundp((SubLObject)$ic49$)) ? $g1126$.getGlobalValue() : f5143((SubLObject)($ic36$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic36$) : $ic36$), (SubLObject)$ic49$, (SubLObject)($ic38$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic38$) : $ic38$), (SubLObject)$ic50$, (SubLObject)UNPROVIDED));
        $g1127$ = SubLFiles.deflexical("S#6750", (NIL != Symbols.boundp((SubLObject)$ic51$)) ? $g1127$.getGlobalValue() : f5143((SubLObject)($ic36$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic36$) : $ic36$), (SubLObject)$ic51$, (SubLObject)($ic38$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic38$) : $ic38$), (SubLObject)$ic50$, (SubLObject)UNPROVIDED));
        $g1128$ = SubLFiles.deflexical("S#6751", (NIL != Symbols.boundp((SubLObject)$ic52$)) ? $g1128$.getGlobalValue() : f5143((SubLObject)($ic36$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic36$) : $ic36$), (SubLObject)$ic52$, (SubLObject)($ic38$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic38$) : $ic38$), (SubLObject)$ic50$, (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5148() {
        module0002.f50((SubLObject)$ic2$, (SubLObject)$ic28$);
        module0002.f50((SubLObject)$ic27$, (SubLObject)$ic30$);
        module0003.f57((SubLObject)$ic49$);
        module0003.f57((SubLObject)$ic51$);
        module0003.f57((SubLObject)$ic52$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f5146();
    }
    
    public void initializeVariables() {
        f5147();
    }
    
    public void runTopLevelForms() {
        f5148();
    }
    
    static {
        me = (SubLFile)new module0073();
        $g1113$ = null;
        $g1114$ = null;
        $g1115$ = null;
        $g1116$ = null;
        $g1117$ = null;
        $g1118$ = null;
        $g1119$ = null;
        $g1120$ = null;
        $g1121$ = null;
        $g1122$ = null;
        $g1123$ = null;
        $g1124$ = null;
        $g1125$ = null;
        $g1126$ = null;
        $g1127$ = null;
        $g1128$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#6752", "CYC"), (SubLObject)makeSymbol("S#669", "CYC"));
        $ic1$ = makeSymbol("DEFPARAMETER-PUBLIC");
        $ic2$ = makeSymbol("S#6733", "CYC");
        $ic3$ = makeSymbol("FIF");
        $ic4$ = makeSymbol("SYMBOLP");
        $ic5$ = makeSymbol("QUOTE");
        $ic6$ = makeSymbol("SYMBOL-VALUE");
        $ic7$ = ConsesLow.list((SubLObject)makeKeyword("PARAMETER"));
        $ic8$ = makeSymbol("DEFPARAMETER-PROTECTED");
        $ic9$ = makeSymbol("DEFPARAMETER-PRIVATE");
        $ic10$ = makeSymbol("DEFLEXICAL-PUBLIC");
        $ic11$ = ConsesLow.list((SubLObject)makeKeyword("LEXICAL"));
        $ic12$ = makeSymbol("DEFLEXICAL-PROTECTED");
        $ic13$ = makeSymbol("DEFLEXICAL-PRIVATE");
        $ic14$ = makeSymbol("DEFGLOBAL-PUBLIC");
        $ic15$ = ConsesLow.list((SubLObject)makeKeyword("GLOBAL"));
        $ic16$ = makeSymbol("DEFGLOBAL-PROTECTED");
        $ic17$ = makeSymbol("DEFGLOBAL-PRIVATE");
        $ic18$ = makeSymbol("DEFVAR-PUBLIC");
        $ic19$ = ConsesLow.list((SubLObject)makeKeyword("VAR"));
        $ic20$ = makeSymbol("DEFVAR-PROTECTED");
        $ic21$ = makeSymbol("DEFVAR-PRIVATE");
        $ic22$ = ConsesLow.list((SubLObject)makeKeyword("PARAMETER"), (SubLObject)makeKeyword("LIST"));
        $ic23$ = ConsesLow.list((SubLObject)makeKeyword("LEXICAL"), (SubLObject)makeKeyword("LIST"));
        $ic24$ = ConsesLow.list((SubLObject)makeKeyword("GLOBAL"), (SubLObject)makeKeyword("LIST"));
        $ic25$ = ConsesLow.list((SubLObject)makeKeyword("VAR"), (SubLObject)makeKeyword("LIST"));
        $ic26$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"));
        $ic27$ = makeSymbol("S#6734", "CYC");
        $ic28$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#6708", "CYC"), makeSymbol("S#6709", "CYC"), makeSymbol("S#6710", "CYC"), makeSymbol("S#6711", "CYC"), makeSymbol("S#6712", "CYC"), makeSymbol("S#6713", "CYC"), makeSymbol("S#6714", "CYC"), makeSymbol("S#6715", "CYC"), makeSymbol("S#6716", "CYC"), makeSymbol("S#6717", "CYC"), makeSymbol("S#6718", "CYC"), makeSymbol("S#6719", "CYC"), makeSymbol("S#6720", "CYC"), makeSymbol("S#6721", "CYC"), makeSymbol("S#6722", "CYC"), makeSymbol("S#6723", "CYC"), makeSymbol("S#6724", "CYC"), makeSymbol("S#6725", "CYC"), makeSymbol("S#6726", "CYC"), makeSymbol("S#6727", "CYC"), makeSymbol("S#6728", "CYC"), makeSymbol("S#6729", "CYC"), makeSymbol("S#6730", "CYC"), makeSymbol("S#6731", "CYC") });
        $ic29$ = makeKeyword("SIMPLE");
        $ic30$ = makeSymbol("S#6732", "CYC");
        $ic31$ = ConsesLow.list((SubLObject)makeString("redtest.crtl.worldfile"));
        $ic32$ = makeString("dflt");
        $ic33$ = makeString("/cyc/CycC/Linux/head/run/world/latest.load");
        $ic34$ = makeSymbol("S#6739", "CYC");
        $ic35$ = makeKeyword("LEXICAL");
        $ic36$ = makeSymbol("S#6736", "CYC");
        $ic37$ = makeSymbol("S#6740", "CYC");
        $ic38$ = makeSymbol("S#6737", "CYC");
        $ic39$ = makeSymbol("S#6741", "CYC");
        $ic40$ = makeSymbol("S#6742", "CYC");
        $ic41$ = makeSymbol("S#6743", "CYC");
        $ic42$ = makeKeyword("PARAMETER");
        $ic43$ = makeSymbol("S#6744", "CYC");
        $ic44$ = makeSymbol("S#6745", "CYC");
        $ic45$ = makeSymbol("S#6746", "CYC");
        $ic46$ = makeKeyword("VAR");
        $ic47$ = makeSymbol("S#6747", "CYC");
        $ic48$ = makeSymbol("S#6748", "CYC");
        $ic49$ = makeSymbol("S#6749", "CYC");
        $ic50$ = makeKeyword("GLOBAL");
        $ic51$ = makeSymbol("S#6750", "CYC");
        $ic52$ = makeSymbol("S#6751", "CYC");
        $ic53$ = makeString("reddef-gbl-publ didn't have the default value(~s) ~s~%");
        $ic54$ = makeString("reddef-gbl-prot didn't have the default value(~s) ~s~%");
        $ic55$ = makeString("reddef-gbl-prvt didn't have the default value(~s) ~s~%");
        $ic56$ = makeString("reddef-var-publ didn't have the default value(~s) ~s~%");
        $ic57$ = makeString("reddef-var-prot didn't have the default value(~s) ~s~%");
        $ic58$ = makeString("reddef-var-prvt didn't have the default value(~s) ~s~%");
        $ic59$ = makeString("reddef-lex-publ didn't have the default value(~s) ~s~%");
        $ic60$ = makeString("reddef-lex-prot didn't have the default value(~s) ~s~%");
        $ic61$ = makeString("reddef-lex-prvt didn't have the default value(~s) ~s~%");
        $ic62$ = makeString("reddef-lex-prvt-2 didn't have the default value(~s) ~s~%");
        $ic63$ = makeString("reddef-par-publ didn't have the default value(~s) ~s~%");
        $ic64$ = makeString("reddef-par-prot didn't have the default value(~s) ~s~%");
        $ic65$ = makeString("reddef-par-prvt didn't have the default value(~s) ~s~%");
        $ic66$ = makeString("reddef-gbl-publ didn't have the value from the red repository(~s) ~s~%");
        $ic67$ = makeString("reddef-gbl-prot didn't have the value from the red repository(~s) ~s~%");
        $ic68$ = makeString("reddef-gbl-prvt didn't have the value from the red repository(~s) ~s~%");
        $ic69$ = makeString("reddef-var-publ didn't have the value from the red repository(~s) ~s~%");
        $ic70$ = makeString("reddef-var-prot didn't have the value from the red repository(~s) ~s~%");
        $ic71$ = makeString("reddef-var-prvt didn't have the value from the red repository(~s) ~s~%");
        $ic72$ = makeString("reddef-lex-publ didn't have the value from the red repository(~s) ~s~%");
        $ic73$ = makeString("reddef-lex-prot didn't have the value from the red repository(~s) ~s~%");
        $ic74$ = makeString("reddef-lex-prvt didn't have the value from the red repository(~s) ~s~%");
        $ic75$ = makeString("reddef-lex-prvt-2 didn't have the value from the red repository(~s) ~s~%");
        $ic76$ = makeString("reddef-par-publ didn't have the value from the red repository(~s) ~s~%");
        $ic77$ = makeString("reddef-par-prot didn't have the value from the red repository(~s) ~s~%");
        $ic78$ = makeString("reddef-par-prvt didn't have the value from the red repository(~s) ~s~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 281 ms
	
	Decompiled with Procyon 0.5.32.
*/