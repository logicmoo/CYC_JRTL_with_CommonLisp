package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0149 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0149";
    public static final String myFingerPrint = "cdfa3240a573a39d2132cbfd46cf1def86f515bb9ac9820be5b78b2a65f180b0";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
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
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLList $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    private static final SubLList $ic80$;
    private static final SubLList $ic81$;
    private static final SubLList $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLList $ic90$;
    private static final SubLList $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLList $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLList $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLList $ic113$;
    private static final SubLList $ic114$;
    private static final SubLList $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLList $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLList $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLList $ic128$;
    private static final SubLList $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLObject $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLList $ic141$;
    private static final SubLList $ic142$;
    private static final SubLList $ic143$;
    
    public static SubLObject f9620(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic0$, (SubLObject)$ic1$, reader.bq_cons((SubLObject)$ic2$, ConsesLow.append(var5, (SubLObject)$ic3$)));
    }
    
    public static SubLObject f9621(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic0$, (SubLObject)$ic4$, reader.bq_cons((SubLObject)$ic2$, ConsesLow.append(var5, (SubLObject)$ic3$)));
    }
    
    public static SubLObject f9622() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return Hashtables.make_hash_table(module0144.$g1877$.getDynamicValue(var8), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f9623() {
        return f9622();
    }
    
    public static SubLObject f9624() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return Hashtables.make_hash_table(module0144.$g1878$.getDynamicValue(var8), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f9625() {
        return f9624();
    }
    
    public static SubLObject f9626() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (NIL != module0107.f7628(module0144.$g1881$.getDynamicValue(var8))) {
            return f9622();
        }
        return module0144.$g1881$.getDynamicValue(var8);
    }
    
    public static SubLObject f9627() {
        return f9626();
    }
    
    public static SubLObject f9628() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (NIL != module0107.f7628(module0144.$g1879$.getDynamicValue(var8))) {
            return f9624();
        }
        return module0144.$g1879$.getDynamicValue(var8);
    }
    
    public static SubLObject f9629() {
        return f9628();
    }
    
    public static SubLObject f9630(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic15$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic16$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9631(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic17$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic18$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9632(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic15$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic19$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9633(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic17$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic20$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9634(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic21$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic22$, ConsesLow.append(var6, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic23$, var5, (SubLObject)$ic22$))));
    }
    
    public static SubLObject f9635(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic24$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic25$, ConsesLow.append(var6, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic23$, var5, (SubLObject)$ic25$))));
    }
    
    public static SubLObject f9636(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic26$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic27$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9637(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic28$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic29$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9638(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic30$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic31$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9639(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic32$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic33$, var5)), (SubLObject)ConsesLow.listS((SubLObject)$ic34$, (SubLObject)$ic33$, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9640(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic32$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic35$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9641(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic34$, (SubLObject)$ic36$, (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic37$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9642(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic38$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic39$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic40$, (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list((SubLObject)$ic44$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic45$, var5)))), (SubLObject)ConsesLow.list((SubLObject)$ic46$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)$ic49$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic50$, (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)$ic51$, var7))), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9643(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic30$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic52$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9644(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic53$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic54$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9645(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic55$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic40$, (SubLObject)ConsesLow.listS((SubLObject)$ic56$, var5, (SubLObject)$ic57$), (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic58$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9646(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic30$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic59$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9647(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic55$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic40$, (SubLObject)ConsesLow.listS((SubLObject)$ic56$, var5, (SubLObject)$ic57$), (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic60$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9648(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic61$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic40$, (SubLObject)ConsesLow.listS((SubLObject)$ic56$, var5, (SubLObject)$ic62$), (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic63$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9649(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic64$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic40$, (SubLObject)ConsesLow.listS((SubLObject)$ic56$, var5, (SubLObject)$ic65$), (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic66$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9650(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic30$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic67$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9651(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic68$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic69$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9652(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic70$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic34$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, (SubLObject)$ic72$, var5), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9653(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic70$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic34$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, (SubLObject)$ic73$, var5), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9654(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic70$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic34$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, (SubLObject)$ic74$, var5), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9655(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic70$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic34$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, (SubLObject)$ic75$, var5), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9656(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic76$, ConsesLow.append(var5, (SubLObject)$ic77$));
    }
    
    public static SubLObject f9657(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic78$, ConsesLow.append(var5, (SubLObject)$ic79$));
    }
    
    public static SubLObject f9658(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic80$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9659(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic81$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9660(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic82$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9661(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic83$, (SubLObject)$ic84$, (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic85$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9662(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic86$);
        var5 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic34$, (SubLObject)ConsesLow.list((SubLObject)$ic87$, (SubLObject)ConsesLow.list((SubLObject)$ic88$, var5)), (SubLObject)ConsesLow.listS((SubLObject)$ic89$, (SubLObject)ConsesLow.list((SubLObject)$ic88$, var5), (SubLObject)$ic90$));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic86$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9663(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic91$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic91$);
        final SubLObject var6 = var4.rest();
        final SubLObject var7;
        var4 = (var7 = var4.first());
        final SubLObject var8;
        var4 = (var8 = var6);
        final SubLObject var9 = Packages.intern(PrintLow.format((SubLObject)NIL, (SubLObject)$ic92$, var5), (SubLObject)UNPROVIDED);
        final SubLObject var10 = Packages.intern(PrintLow.format((SubLObject)NIL, (SubLObject)$ic93$, var5), (SubLObject)UNPROVIDED);
        final SubLObject var11 = Packages.intern(PrintLow.format((SubLObject)NIL, (SubLObject)$ic94$, var5), (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0035.f1992(var7);
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic40$, ConsesLow.list((SubLObject)$ic95$, var9, (SubLObject)$ic96$, PrintLow.format((SubLObject)NIL, (SubLObject)$ic97$, var5)), ConsesLow.listS((SubLObject)$ic98$, new SubLObject[] { var11, NIL, ConsesLow.listS((SubLObject)$ic99$, (SubLObject)ConsesLow.list((SubLObject)$ic100$, (SubLObject)$ic101$, var9), (SubLObject)$ic102$), ConsesLow.listS((SubLObject)$ic99$, (SubLObject)ConsesLow.list((SubLObject)$ic100$, (SubLObject)$ic103$, var9), (SubLObject)$ic104$), ConsesLow.listS((SubLObject)$ic99$, (SubLObject)ConsesLow.list((SubLObject)$ic100$, (SubLObject)$ic105$, var9), (SubLObject)$ic104$), ConsesLow.listS((SubLObject)$ic99$, (SubLObject)ConsesLow.list((SubLObject)$ic100$, (SubLObject)$ic106$, var9), (SubLObject)$ic104$), ConsesLow.list((SubLObject)$ic107$, (SubLObject)$ic108$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic88$, var12)), ConsesLow.list((SubLObject)$ic107$, (SubLObject)$ic109$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic88$, var5)), $ic110$ }), ConsesLow.list(var11), ConsesLow.list((SubLObject)$ic107$, (SubLObject)$ic111$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic88$, var11)), ConsesLow.listS((SubLObject)$ic98$, var10, var7, ConsesLow.append(var8, (SubLObject)NIL)), ConsesLow.list((SubLObject)$ic112$, (SubLObject)$ic113$, (SubLObject)ConsesLow.listS((SubLObject)$ic34$, (SubLObject)ConsesLow.listS((SubLObject)EQ, (SubLObject)ConsesLow.list((SubLObject)$ic88$, var5), (SubLObject)$ic114$), (SubLObject)$ic115$)), ConsesLow.listS((SubLObject)$ic116$, var9, (SubLObject)$ic117$), ConsesLow.list((SubLObject)$ic98$, var5, var7, (SubLObject)ConsesLow.list((SubLObject)$ic118$, (SubLObject)$ic119$, (SubLObject)ConsesLow.listS((SubLObject)$ic0$, new SubLObject[] { $ic120$, ConsesLow.list((SubLObject)$ic121$, (SubLObject)$ic122$, (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)$ic123$, reader.bq_cons(var10, ConsesLow.append(var12, (SubLObject)NIL)))), ConsesLow.list((SubLObject)$ic124$, (SubLObject)ConsesLow.list((SubLObject)$ic100$, (SubLObject)$ic101$, var9)), ConsesLow.list((SubLObject)$ic116$, (SubLObject)$ic122$, (SubLObject)ConsesLow.list((SubLObject)$ic100$, (SubLObject)$ic103$, var9)), ConsesLow.list((SubLObject)$ic116$, (SubLObject)$ic123$, (SubLObject)ConsesLow.list((SubLObject)$ic100$, (SubLObject)$ic105$, var9)), ConsesLow.list((SubLObject)$ic116$, reader.bq_cons((SubLObject)$ic125$, ConsesLow.append(var12, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic100$, (SubLObject)$ic106$, var9)), $ic126$ }), (SubLObject)ConsesLow.list((SubLObject)$ic127$, reader.bq_cons(var10, ConsesLow.append(var12, (SubLObject)NIL))))) });
    }
    
    public static SubLObject f9664(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic128$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic128$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic128$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var109_110 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic128$);
            var109_110 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic128$);
            if (NIL == conses_high.member(var109_110, (SubLObject)$ic129$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var109_110 == $ic130$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic128$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic131$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic132$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.list((SubLObject)$ic133$, var7))), (SubLObject)ConsesLow.listS((SubLObject)$ic134$, (SubLObject)ConsesLow.list(var6, var14, var12), ConsesLow.append(var13, (SubLObject)NIL)));
    }
    
    public static SubLObject f9665(final SubLObject var105) {
        final SubLThread var106 = SubLProcess.currentSubLThread();
        SubLObject var107 = (SubLObject)NIL;
        final SubLObject var108 = module0147.$g2094$.currentBinding(var106);
        final SubLObject var109 = module0147.$g2095$.currentBinding(var106);
        try {
            module0147.$g2094$.bind((SubLObject)$ic136$, var106);
            module0147.$g2095$.bind($ic137$, var106);
            var107 = module0309.f21083(var105);
        }
        finally {
            module0147.$g2095$.rebind(var109, var106);
            module0147.$g2094$.rebind(var108, var106);
        }
        return var107;
    }
    
    public static SubLObject f9666(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic128$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic128$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic128$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var123_124 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic128$);
            var123_124 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic128$);
            if (NIL == conses_high.member(var123_124, (SubLObject)$ic129$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var123_124 == $ic130$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic128$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic131$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic138$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.list((SubLObject)$ic139$, var7))), (SubLObject)ConsesLow.listS((SubLObject)$ic134$, (SubLObject)ConsesLow.list(var6, var14, var12), ConsesLow.append(var13, (SubLObject)NIL)));
    }
    
    public static SubLObject f9667(final SubLObject var105) {
        final SubLThread var106 = SubLProcess.currentSubLThread();
        SubLObject var107 = (SubLObject)NIL;
        final SubLObject var108 = module0147.$g2094$.currentBinding(var106);
        final SubLObject var109 = module0147.$g2095$.currentBinding(var106);
        try {
            module0147.$g2094$.bind((SubLObject)$ic136$, var106);
            module0147.$g2095$.bind($ic137$, var106);
            var107 = module0309.f21086(var105);
        }
        finally {
            module0147.$g2095$.rebind(var109, var106);
            module0147.$g2094$.rebind(var108, var106);
        }
        return var107;
    }
    
    public static SubLObject f9668(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic141$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9669(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic142$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9670(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic143$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9671() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9620", "S#12401");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9621", "S#12402");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0149", "f9622", "S#12403", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0149", "f9623", "S#12404", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0149", "f9624", "S#12405", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0149", "f9625", "S#12406", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0149", "f9626", "S#12407", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0149", "f9627", "S#12408", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0149", "f9628", "S#12409", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0149", "f9629", "S#12410", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9630", "S#12411");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9631", "S#12412");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9632", "S#12413");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9633", "S#12414");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9634", "S#12415");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9635", "S#12416");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9636", "S#12417");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9637", "S#12418");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9638", "S#12419");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9639", "S#12420");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9640", "S#12421");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9641", "S#12422");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9642", "S#12423");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9643", "S#12424");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9644", "S#12425");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9645", "S#12426");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9646", "S#12427");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9647", "S#12428");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9648", "S#12429");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9649", "S#12430");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9650", "S#12431");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9651", "S#12432");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9652", "S#12433");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9653", "S#12434");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9654", "S#12435");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9655", "S#12436");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9656", "S#12437");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9657", "S#12438");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9658", "S#12439");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9659", "S#12440");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9660", "S#12441");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9661", "S#12442");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9662", "S#12443");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9663", "S#12444");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9664", "S#12445");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0149", "f9665", "S#12446", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9666", "S#12447");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0149", "f9667", "S#12448", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9668", "S#12449");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9669", "S#12450");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0149", "f9670", "S#12451");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9672() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9673() {
        module0002.f50((SubLObject)$ic5$, (SubLObject)$ic6$);
        module0002.f50((SubLObject)$ic7$, (SubLObject)$ic6$);
        module0002.f50((SubLObject)$ic8$, (SubLObject)$ic6$);
        module0002.f50((SubLObject)$ic9$, (SubLObject)$ic6$);
        module0002.f50((SubLObject)$ic10$, (SubLObject)$ic11$);
        module0002.f50((SubLObject)$ic12$, (SubLObject)$ic11$);
        module0002.f50((SubLObject)$ic13$, (SubLObject)$ic11$);
        module0002.f50((SubLObject)$ic14$, (SubLObject)$ic11$);
        module0002.f50((SubLObject)$ic133$, (SubLObject)$ic135$);
        module0002.f50((SubLObject)$ic139$, (SubLObject)$ic140$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f9671();
    }
    
    public void initializeVariables() {
        f9672();
    }
    
    public void runTopLevelForms() {
        f9673();
    }
    
    static {
        me = (SubLFile)new module0149();
        $ic0$ = makeSymbol("CLET");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11991", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12403", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11992", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12404", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11989", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12405", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11990", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12406", "CYC"))));
        $ic2$ = makeSymbol("CUNWIND-PROTECT");
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12452", "CYC")));
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11991", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12407", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11992", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12408", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11989", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12409", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11990", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12410", "CYC"))));
        $ic5$ = makeSymbol("S#12403", "CYC");
        $ic6$ = makeSymbol("S#12401", "CYC");
        $ic7$ = makeSymbol("S#12404", "CYC");
        $ic8$ = makeSymbol("S#12405", "CYC");
        $ic9$ = makeSymbol("S#12406", "CYC");
        $ic10$ = makeSymbol("S#12407", "CYC");
        $ic11$ = makeSymbol("S#12402", "CYC");
        $ic12$ = makeSymbol("S#12408", "CYC");
        $ic13$ = makeSymbol("S#12409", "CYC");
        $ic14$ = makeSymbol("S#12410", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("DEFNS"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic16$ = makeSymbol("S#11982", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("S#12453", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic18$ = makeSymbol("S#11981", "CYC");
        $ic19$ = makeSymbol("S#11986", "CYC");
        $ic20$ = makeSymbol("S#11985", "CYC");
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("S#761", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic22$ = ConsesLow.list((SubLObject)makeSymbol("S#11926", "CYC"));
        $ic23$ = makeSymbol("CSETQ");
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("S#12454", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic25$ = ConsesLow.list((SubLObject)makeSymbol("S#11927", "CYC"));
        $ic26$ = ConsesLow.list((SubLObject)makeSymbol("S#4785", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic27$ = makeSymbol("S#11937", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic29$ = makeSymbol("S#11951", "CYC");
        $ic30$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic31$ = makeSymbol("S#11952", "CYC");
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#12456", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic33$ = makeSymbol("S#11942", "CYC");
        $ic34$ = makeSymbol("PWHEN");
        $ic35$ = makeSymbol("S#11943", "CYC");
        $ic36$ = ConsesLow.list((SubLObject)makeSymbol("CAND"), (SubLObject)makeSymbol("*AT-CHECK-GENL-INVERSES?*"), (SubLObject)makeSymbol("S#11943", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11955", "CYC"), (SubLObject)T));
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("S#12457", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic39$ = makeUninternedSymbol("US#5705DBF");
        $ic40$ = makeSymbol("PROGN");
        $ic41$ = makeSymbol("FWHEN");
        $ic42$ = makeSymbol("FORT-P");
        $ic43$ = makeSymbol("COR");
        $ic44$ = makeSymbol("GENL-PREDICATES");
        $ic45$ = makeSymbol("GENL-INVERSES");
        $ic46$ = makeSymbol("S#11944", "CYC");
        $ic47$ = makeSymbol("S#11956", "CYC");
        $ic48$ = makeSymbol("CAND");
        $ic49$ = makeSymbol("*AT-CHECK-GENL-PREDS?*");
        $ic50$ = makeSymbol("S#11957", "CYC");
        $ic51$ = makeSymbol("*AT-CHECK-GENL-INVERSES?*");
        $ic52$ = makeSymbol("S#11945", "CYC");
        $ic53$ = ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic54$ = makeSymbol("S#11939", "CYC");
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("INTEGER"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic56$ = makeSymbol("CHECK-TYPE");
        $ic57$ = ConsesLow.list((SubLObject)makeSymbol("INTEGERP"));
        $ic58$ = makeSymbol("S#11946", "CYC");
        $ic59$ = makeSymbol("S#11950", "CYC");
        $ic60$ = makeSymbol("S#11949", "CYC");
        $ic61$ = ConsesLow.list((SubLObject)makeSymbol("S#12458", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic62$ = ConsesLow.list((SubLObject)makeSymbol("FORT-P"));
        $ic63$ = makeSymbol("S#11953", "CYC");
        $ic64$ = ConsesLow.list((SubLObject)makeSymbol("S#11675", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic65$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION-SPEC-P"));
        $ic66$ = makeSymbol("S#11940", "CYC");
        $ic67$ = makeSymbol("S#11954", "CYC");
        $ic68$ = ConsesLow.list((SubLObject)makeSymbol("S#12459", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic69$ = makeSymbol("S#11959", "CYC");
        $ic70$ = ConsesLow.list((SubLObject)makeSymbol("S#696", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic71$ = makeSymbol(">=");
        $ic72$ = makeSymbol("S#11913", "CYC");
        $ic73$ = makeSymbol("*AT-TRACE-LEVEL*");
        $ic74$ = makeSymbol("S#11974", "CYC");
        $ic75$ = makeSymbol("*DEFN-TRACE-LEVEL*");
        $ic76$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11903", "CYC"), (SubLObject)T));
        $ic77$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CLRHASH"), (SubLObject)makeSymbol("S#11929", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CLRHASH"), (SubLObject)makeSymbol("S#11930", "CYC")));
        $ic78$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11904", "CYC"), (SubLObject)T));
        $ic79$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CLRHASH"), (SubLObject)makeSymbol("S#11933", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CLRHASH"), (SubLObject)makeSymbol("S#11934", "CYC")));
        $ic80$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11905", "CYC"), (SubLObject)T), (SubLObject)makeSymbol("S#11908", "CYC"));
        $ic81$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11906", "CYC"), (SubLObject)T), (SubLObject)makeSymbol("S#11909", "CYC"));
        $ic82$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11907", "CYC"), (SubLObject)T), (SubLObject)makeSymbol("S#11894", "CYC"));
        $ic83$ = makeSymbol("CCATCH-IGNORE");
        $ic84$ = makeKeyword("AT-MAPPING-DONE");
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11911", "CYC"), (SubLObject)T));
        $ic86$ = ConsesLow.list((SubLObject)makeSymbol("SYMBOL"));
        $ic87$ = makeSymbol("SYMBOLP");
        $ic88$ = makeSymbol("QUOTE");
        $ic89$ = makeSymbol("CPUSHNEW");
        $ic90$ = ConsesLow.list((SubLObject)makeSymbol("S#11973", "CYC"));
        $ic91$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#12460", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic92$ = makeString("*~a-METERS*");
        $ic93$ = makeString("~a-METERED");
        $ic94$ = makeString("RESET-~a-METERS");
        $ic95$ = makeSymbol("S#449", "CYC");
        $ic96$ = ConsesLow.list((SubLObject)makeSymbol("MAKE-HASH-TABLE"), (SubLObject)EIGHT_INTEGER);
        $ic97$ = makeString("metering cache for calls to defn module function ~a");
        $ic98$ = makeSymbol("DEFINE");
        $ic99$ = makeSymbol("CSETF");
        $ic100$ = makeSymbol("GETHASH");
        $ic101$ = makeKeyword("CALLS");
        $ic102$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic103$ = makeKeyword("TIMES");
        $ic104$ = ConsesLow.list((SubLObject)NIL);
        $ic105$ = makeKeyword("RESULTS");
        $ic106$ = makeKeyword("ARGS");
        $ic107$ = makeSymbol("SETHASH");
        $ic108$ = makeKeyword("ARG-LIST");
        $ic109$ = makeKeyword("FUNCTION");
        $ic110$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("RET"), (SubLObject)NIL));
        $ic111$ = makeKeyword("RESET");
        $ic112$ = makeSymbol("CDOLIST");
        $ic113$ = ConsesLow.list((SubLObject)makeSymbol("S#4495", "CYC"), (SubLObject)makeSymbol("S#11978", "CYC"));
        $ic114$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("GETHASH"), (SubLObject)makeKeyword("FUNCTION"), (SubLObject)makeSymbol("S#4495", "CYC")));
        $ic115$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#11978", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("DELETE"), (SubLObject)makeSymbol("S#4495", "CYC"), (SubLObject)makeSymbol("S#11978", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CLRHASH"), (SubLObject)makeSymbol("S#4495", "CYC")));
        $ic116$ = makeSymbol("CPUSH");
        $ic117$ = ConsesLow.list((SubLObject)makeSymbol("S#11978", "CYC"));
        $ic118$ = makeSymbol("PIF");
        $ic119$ = makeSymbol("S#11975", "CYC");
        $ic120$ = ConsesLow.list((SubLObject)makeSymbol("S#3267", "CYC"), (SubLObject)makeSymbol("S#12461", "CYC"));
        $ic121$ = makeSymbol("CTIME");
        $ic122$ = makeSymbol("S#12461", "CYC");
        $ic123$ = makeSymbol("S#3267", "CYC");
        $ic124$ = makeSymbol("CINC");
        $ic125$ = makeSymbol("LIST");
        $ic126$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("RET"), (SubLObject)makeSymbol("S#3267", "CYC")));
        $ic127$ = makeSymbol("RET");
        $ic128$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12462", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#8587", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic129$ = ConsesLow.list((SubLObject)makeKeyword("DONE-VAR"));
        $ic130$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic131$ = makeKeyword("DONE-VAR");
        $ic132$ = makeUninternedSymbol("US#6C305C9");
        $ic133$ = makeSymbol("S#12446", "CYC");
        $ic134$ = makeSymbol("CSOME");
        $ic135$ = makeSymbol("S#12445", "CYC");
        $ic136$ = makeSymbol("S#12274", "CYC");
        $ic137$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic138$ = makeUninternedSymbol("US#6C305C9");
        $ic139$ = makeSymbol("S#12448", "CYC");
        $ic140$ = makeSymbol("S#12447", "CYC");
        $ic141$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("*NOTING-AT-VIOLATIONS?*"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12463", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), (SubLObject)T));
        $ic142$ = ConsesLow.list((SubLObject)makeSymbol("*NOTING-AT-VIOLATIONS?*"), (SubLObject)makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), (SubLObject)makeSymbol("S#12463", "CYC"), (SubLObject)makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"));
        $ic143$ = ConsesLow.list((SubLObject)makeSymbol("*NOTING-AT-VIOLATIONS?*"), (SubLObject)makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), (SubLObject)makeSymbol("S#12463", "CYC"), (SubLObject)makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), (SubLObject)makeSymbol("S#12464", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 210 ms
	
	Decompiled with Procyon 0.5.32.
*/