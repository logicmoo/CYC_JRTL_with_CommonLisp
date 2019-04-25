package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0141 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0141";
    public static final String myFingerPrint = "e10b8e1e011b58b44fd8d50e5353a74e22ff98ef0340cebdabb02cb76aa0634d";
    public static SubLSymbol $g1663$;
    public static SubLSymbol $g1664$;
    public static SubLSymbol $g1598$;
    public static SubLSymbol $g1665$;
    public static SubLSymbol $g1666$;
    public static SubLSymbol $g1667$;
    public static SubLSymbol $g1668$;
    public static SubLSymbol $g1669$;
    public static SubLSymbol $g1670$;
    public static SubLSymbol $g1671$;
    public static SubLSymbol $g1672$;
    public static SubLSymbol $g1673$;
    public static SubLSymbol $g1674$;
    public static SubLSymbol $g1675$;
    public static SubLSymbol $g1676$;
    public static SubLSymbol $g1677$;
    public static SubLSymbol $g1678$;
    public static SubLSymbol $g1679$;
    public static SubLSymbol $g1680$;
    public static SubLSymbol $g1681$;
    public static SubLSymbol $g1682$;
    public static SubLSymbol $g1683$;
    public static SubLSymbol $g1684$;
    public static SubLSymbol $g1685$;
    public static SubLSymbol $g1686$;
    public static SubLSymbol $g1687$;
    public static SubLSymbol $g1688$;
    public static SubLSymbol $g1689$;
    public static SubLSymbol $g1690$;
    public static SubLSymbol $g1691$;
    public static SubLSymbol $g1692$;
    public static SubLSymbol $g1693$;
    public static SubLSymbol $g1694$;
    public static SubLSymbol $g1695$;
    public static SubLSymbol $g1696$;
    public static SubLSymbol $g1697$;
    public static SubLSymbol $g1698$;
    public static SubLSymbol $g1699$;
    public static SubLSymbol $g1700$;
    public static SubLSymbol $g1701$;
    public static SubLSymbol $g1702$;
    public static SubLSymbol $g1703$;
    public static SubLSymbol $g1704$;
    public static SubLSymbol $g1705$;
    public static SubLSymbol $g1706$;
    public static SubLSymbol $g1707$;
    public static SubLSymbol $g1708$;
    public static SubLSymbol $g1709$;
    public static SubLSymbol $g1710$;
    private static SubLSymbol $g1711$;
    private static SubLSymbol $g1712$;
    private static SubLSymbol $g1713$;
    public static SubLSymbol $g1714$;
    public static SubLSymbol $g1715$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLList $ic45$;
    private static final SubLString $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLList $ic62$;
    private static final SubLList $ic63$;
    private static final SubLList $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    private static final SubLList $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLList $ic85$;
    private static final SubLList $ic86$;
    private static final SubLList $ic87$;
    private static final SubLList $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
    private static final SubLList $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLList $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLList $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLList $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLList $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLList $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLList $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLList $ic131$;
    private static final SubLList $ic132$;
    private static final SubLList $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLList $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLList $ic137$;
    private static final SubLList $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLList $ic140$;
    private static final SubLList $ic141$;
    private static final SubLList $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLObject $ic145$;
    private static final SubLObject $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLObject $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLObject $ic150$;
    private static final SubLObject $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLString $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLString $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLString $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLString $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLList $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLList $ic173$;
    private static final SubLList $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLList $ic176$;
    private static final SubLList $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLList $ic180$;
    private static final SubLList $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLList $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLList $ic186$;
    private static final SubLList $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLList $ic189$;
    private static final SubLList $ic190$;
    private static final SubLList $ic191$;
    private static final SubLSymbol $ic192$;
    
    public static SubLObject f9144(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic0$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic4$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic5$, reader.bq_cons((SubLObject)module0141.$ic6$, ConsesLow.append(var5, (SubLObject)module0141.NIL))))))));
    }
    
    public static SubLObject f9145(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic4$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic5$, reader.bq_cons((SubLObject)module0141.$ic6$, ConsesLow.append(var5, (SubLObject)module0141.NIL)))))));
    }
    
    public static SubLObject f9146(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic7$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic8$, reader.bq_cons((SubLObject)module0141.$ic9$, ConsesLow.append(var5, (SubLObject)module0141.NIL))));
    }
    
    public static SubLObject f9147(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic7$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic10$, reader.bq_cons((SubLObject)module0141.$ic11$, ConsesLow.append(var5, (SubLObject)module0141.NIL))));
    }
    
    public static SubLObject f9148(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic8$, reader.bq_cons((SubLObject)module0141.$ic9$, ConsesLow.append(var5, (SubLObject)module0141.NIL))));
    }
    
    public static SubLObject f9149(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic10$, reader.bq_cons((SubLObject)module0141.$ic11$, ConsesLow.append(var5, (SubLObject)module0141.NIL))));
    }
    
    public static SubLObject f9150(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        SubLObject var6 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic13$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic13$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic14$, var5, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic15$, var6, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic16$, reader.bq_cons((SubLObject)module0141.$ic17$, ConsesLow.append(var7, (SubLObject)module0141.NIL)))));
    }
    
    public static SubLObject f9151(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        SubLObject var6 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic13$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic13$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic14$, var5, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic15$, var6, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic18$, reader.bq_cons((SubLObject)module0141.$ic17$, ConsesLow.append(var7, (SubLObject)module0141.NIL)))));
    }
    
    public static SubLObject f9152(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        SubLObject var6 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic13$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic13$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic14$, var5, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic19$, var6, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic20$, reader.bq_cons((SubLObject)module0141.$ic17$, ConsesLow.append(var7, (SubLObject)module0141.NIL)))));
    }
    
    public static SubLObject f9153(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        SubLObject var6 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic13$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic13$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic14$, var5, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic19$, var6, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic21$, reader.bq_cons((SubLObject)module0141.$ic17$, ConsesLow.append(var7, (SubLObject)module0141.NIL)))));
    }
    
    public static SubLObject f9154(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic16$, reader.bq_cons((SubLObject)module0141.$ic17$, ConsesLow.append(var5, (SubLObject)module0141.NIL)));
    }
    
    public static SubLObject f9155(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic18$, reader.bq_cons((SubLObject)module0141.$ic17$, ConsesLow.append(var5, (SubLObject)module0141.NIL)));
    }
    
    public static SubLObject f9156(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic20$, reader.bq_cons((SubLObject)module0141.$ic17$, ConsesLow.append(var5, (SubLObject)module0141.NIL)));
    }
    
    public static SubLObject f9157(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic21$, reader.bq_cons((SubLObject)module0141.$ic17$, ConsesLow.append(var5, (SubLObject)module0141.NIL)));
    }
    
    public static SubLObject f9158(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0004.f104(var34, module0141.$g1663$.getDynamicValue(var35), (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED);
    }
    
    public static SubLObject f9159() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1664$.getDynamicValue(var35);
    }
    
    public static SubLObject f9160(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic23$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic25$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9161(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic26$, (SubLObject)module0141.$ic27$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9162(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic26$, (SubLObject)module0141.$ic28$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9163(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic26$, (SubLObject)module0141.$ic29$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9164() {
        return Equality.eq(f9159(), (SubLObject)module0141.$ic27$);
    }
    
    public static SubLObject f9165() {
        return Equality.eq(f9159(), (SubLObject)module0141.$ic28$);
    }
    
    public static SubLObject f9166() {
        return Equality.eq(f9159(), (SubLObject)module0141.$ic29$);
    }
    
    public static SubLObject f9167() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0141.NIL != f9165() || module0141.NIL != f9168());
    }
    
    public static SubLObject f9168() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1598$.getDynamicValue(var35);
    }
    
    public static SubLObject f9169(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic30$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9170(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic31$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9171() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1665$.getDynamicValue(var35);
    }
    
    public static SubLObject f9172(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic32$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic33$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9173() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1666$.getDynamicValue(var35);
    }
    
    public static SubLObject f9174(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic32$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic35$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9175(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic32$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        if (module0141.NIL != var5) {
            return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic36$, (SubLObject)module0141.$ic37$, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic35$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL)), reader.bq_cons((SubLObject)module0141.$ic38$, ConsesLow.append(var6, (SubLObject)module0141.NIL)));
        }
        return reader.bq_cons((SubLObject)module0141.$ic38$, ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9176(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic39$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9177(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic40$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9178(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic41$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9179(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic42$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9180() {
        module0141.$g1667$.setDynamicValue((SubLObject)module0141.T);
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9181() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1667$.getDynamicValue(var35);
    }
    
    public static SubLObject f9182() {
        module0141.$g1668$.setDynamicValue((SubLObject)module0141.T);
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9183(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic43$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9184() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1668$.getDynamicValue(var35);
    }
    
    public static SubLObject f9185() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1669$.getDynamicValue(var35);
    }
    
    public static SubLObject f9186(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic44$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9187(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic45$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9188() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (module0141.NIL == module0141.$g1670$.getDynamicValue(var35)) {
            Errors.warn((SubLObject)module0141.$ic46$);
        }
        return module0141.$g1670$.getDynamicValue(var35);
    }
    
    public static SubLObject f9189() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1671$.getDynamicValue(var35);
    }
    
    public static SubLObject f9190() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1672$.getDynamicValue(var35);
    }
    
    public static SubLObject f9191() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1673$.getDynamicValue(var35);
    }
    
    public static SubLObject f9192() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (module0137.f8917(module0141.$g1670$.getDynamicValue(var35)).eql(module0141.$ic47$)) {
            return module0137.f8955(module0141.$ic48$);
        }
        return module0141.$g1670$.getDynamicValue(var35);
    }
    
    public static SubLObject f9193() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (module0137.f8917(module0141.$g1670$.getDynamicValue(var35)).eql(module0141.$ic49$)) {
            return module0137.f8955(module0141.$ic50$);
        }
        return module0141.$g1670$.getDynamicValue(var35);
    }
    
    public static SubLObject f9194(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic51$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic52$, var5), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic53$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic54$, var5)), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic55$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic56$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic5$, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic57$, var5, ConsesLow.append(var6, (SubLObject)module0141.NIL))));
    }
    
    public static SubLObject f9195() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1674$.getDynamicValue(var35);
    }
    
    public static SubLObject f9196() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0141.NIL == module0141.$g1674$.getDynamicValue(var35));
    }
    
    public static SubLObject f9197(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic58$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9198(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic59$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic60$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9199(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic61$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9200(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic62$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9201(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic63$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9202(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic64$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9203(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic65$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9204(SubLObject var87) {
        if (var87 == module0141.UNPROVIDED) {
            var87 = module0137.f8955((SubLObject)module0141.UNPROVIDED);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0244.f15736(var87).eql(module0141.$ic47$) || module0244.f15736(var87).eql(module0141.$ic49$));
    }
    
    public static SubLObject f9205(SubLObject var87, SubLObject var88) {
        if (var87 == module0141.UNPROVIDED) {
            var87 = module0137.f8955((SubLObject)module0141.UNPROVIDED);
        }
        if (var88 == module0141.UNPROVIDED) {
            var88 = f9188();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0141.NIL != module0244.f15752(var88) && module0141.NIL != f9204(var87));
    }
    
    public static SubLObject f9206(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic66$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)module0141.$ic67$;
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic36$, (SubLObject)module0141.$ic68$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic69$, (SubLObject)ConsesLow.list(var7, var5), (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic70$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic56$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic71$, var7))), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic60$, (SubLObject)ConsesLow.listS((SubLObject)module0141.EQL, var7, (SubLObject)module0141.$ic72$))), ConsesLow.append(var6, (SubLObject)module0141.NIL))), reader.bq_cons((SubLObject)module0141.$ic38$, ConsesLow.append(var6, (SubLObject)module0141.NIL)));
    }
    
    public static SubLObject f9207(final SubLObject var93) {
        return Equality.eq(var93, module0141.$g1675$.getGlobalValue());
    }
    
    public static SubLObject f9208() {
        return module0141.$g1675$.getGlobalValue();
    }
    
    public static SubLObject f9209(final SubLObject var93) {
        return Equality.eq(var93, module0141.$g1676$.getGlobalValue());
    }
    
    public static SubLObject f9210() {
        return module0141.$g1676$.getGlobalValue();
    }
    
    public static SubLObject f9211() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1677$.getDynamicValue(var35);
    }
    
    public static SubLObject f9212(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic75$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic76$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9213(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic77$, (SubLObject)module0141.$ic78$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9214(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic77$, (SubLObject)module0141.$ic79$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9215() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return f9207(module0141.$g1677$.getDynamicValue(var35));
    }
    
    public static SubLObject f9216() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return f9209(module0141.$g1677$.getDynamicValue(var35));
    }
    
    public static SubLObject f9217() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1679$.getDynamicValue(var35);
    }
    
    public static SubLObject f9218() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return Numbers.subtract((SubLObject)module0141.THREE_INTEGER, module0141.$g1679$.getDynamicValue(var35));
    }
    
    public static SubLObject f9219(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic80$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9220() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1680$.getDynamicValue(var35);
    }
    
    public static SubLObject f9221(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic81$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic82$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9222() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1681$.getDynamicValue(var35);
    }
    
    public static SubLObject f9223(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic81$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic83$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9224() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1682$.getDynamicValue(var35);
    }
    
    public static SubLObject f9225() {
        module0141.$g1682$.setDynamicValue((SubLObject)module0141.T);
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9226() {
        module0141.$g1682$.setDynamicValue((SubLObject)module0141.NIL);
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9227(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic84$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9228(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic85$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9229() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1683$.getDynamicValue(var35);
    }
    
    public static SubLObject f9230(final SubLObject var111) {
        module0141.$g1683$.setDynamicValue(var111);
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9231(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic86$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9232(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic87$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9233(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic88$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9234() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1684$.getDynamicValue(var35);
    }
    
    public static SubLObject f9235(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic89$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9236() {
        module0141.$g1685$.setDynamicValue((SubLObject)module0141.$ic90$);
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9237() {
        module0141.$g1685$.setDynamicValue((SubLObject)module0141.$ic91$);
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9238() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1686$.getDynamicValue(var35);
    }
    
    public static SubLObject f9239() {
        module0141.$g1686$.setDynamicValue((SubLObject)module0141.T);
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9240() {
        module0141.$g1686$.setDynamicValue((SubLObject)module0141.NIL);
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9241(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic92$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9242(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        return Equality.eql(var122, module0141.$g1687$.getDynamicValue(var123));
    }
    
    public static SubLObject f9243(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic93$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic94$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9244(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        return Equality.eql(var122, module0141.$g1688$.getDynamicValue(var123));
    }
    
    public static SubLObject f9245(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic93$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic95$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9246() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1688$.getDynamicValue(var35);
    }
    
    public static SubLObject f9247(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        return module0004.f104(var122, module0141.$g1688$.getDynamicValue(var123), Symbols.symbol_function((SubLObject)module0141.EQL), (SubLObject)module0141.UNPROVIDED);
    }
    
    public static SubLObject f9248() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1689$.getDynamicValue(var35);
    }
    
    public static SubLObject f9249(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic96$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic95$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9250(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic93$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic97$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9251() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1690$.getDynamicValue(var35);
    }
    
    public static SubLObject f9252(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic98$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic99$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic100$, reader.bq_cons((SubLObject)module0141.$ic38$, ConsesLow.append(var6, (SubLObject)module0141.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic101$, var5, (SubLObject)module0141.$ic99$)));
    }
    
    public static SubLObject f9253(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic98$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic102$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic100$, reader.bq_cons((SubLObject)module0141.$ic38$, ConsesLow.append(var6, (SubLObject)module0141.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic101$, var5, (SubLObject)module0141.$ic102$)));
    }
    
    public static SubLObject f9254() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1693$.getDynamicValue(var35);
    }
    
    public static SubLObject f9255(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic103$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic104$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9256() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1694$.getDynamicValue(var35);
    }
    
    public static SubLObject f9257(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic103$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic105$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9258() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1695$.getDynamicValue(var35);
    }
    
    public static SubLObject f9259(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic103$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic107$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9260() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1696$.getDynamicValue(var35);
    }
    
    public static SubLObject f9261(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic103$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic108$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9262(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic109$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9263(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic93$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic110$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9264(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        return Equality.eql(var122, module0141.$g1698$.getDynamicValue(var123));
    }
    
    public static SubLObject f9265(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic111$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic112$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9266(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic113$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic114$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9267(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic115$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9268(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic93$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)module0141.$ic116$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic117$, var5, (SubLObject)module0141.$ic118$)), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic119$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic120$, var7))), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9269() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0141.$g1702$.getDynamicValue(var35));
    }
    
    public static SubLObject f9270(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic121$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0141.NIL;
        SubLObject var7 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic121$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic121$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0141.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)module0141.$ic122$;
            return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic123$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic124$, (SubLObject)module0141.$ic119$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic125$, var7)), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list(reader.bq_cons(var9, (SubLObject)module0141.$ic126$), (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic127$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic128$, var9)))), reader.bq_cons((SubLObject)module0141.$ic129$, ConsesLow.append(var8, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic36$, var7, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic38$, (SubLObject)ConsesLow.list((SubLObject)module0141.$ic130$, (SubLObject)module0141.$ic131$, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic120$, var9, (SubLObject)module0141.$ic132$)), (SubLObject)module0141.$ic133$), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic134$, var9)))))), (SubLObject)module0141.$ic135$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0141.$ic121$);
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9271(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        return Functions.funcall(module0141.$g1703$.getDynamicValue(var123), var122);
    }
    
    public static SubLObject f9272(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic81$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic136$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9273() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1704$.getDynamicValue(var35);
    }
    
    public static SubLObject f9274(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic137$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9275(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic138$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic139$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9276(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic140$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9277(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)module0141.$ic141$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9278() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return f9279(module0141.$g1710$.getDynamicValue(var35));
    }
    
    public static SubLObject f9280() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return f9281(module0141.$g1710$.getDynamicValue(var35));
    }
    
    public static SubLObject f9282(final SubLObject var177) {
        return module0004.f104(var177, module0141.$g1711$.getGlobalValue(), (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED);
    }
    
    public static SubLObject f9283() {
        return module0141.$g1712$.getGlobalValue();
    }
    
    public static SubLObject f9284() {
        return module0141.$g1713$.getGlobalValue();
    }
    
    public static SubLObject f9285() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0141.$g1714$.getDynamicValue(var35);
    }
    
    public static SubLObject f9286(final SubLObject var19) {
        return (SubLObject)module0141.T;
    }
    
    public static SubLObject f9287(final SubLObject var19, final SubLObject var178) {
        if (var19.eql(var178)) {
            return (SubLObject)module0141.T;
        }
        if (var19.eql(module0141.$ic145$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var178.eql(module0141.$ic146$) || var178.eql(module0141.$ic143$) || var178.eql(module0141.$ic147$));
        }
        if (var19.eql(module0141.$ic146$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var178.eql(module0141.$ic143$) || var178.eql(module0141.$ic148$));
        }
        if (var19.eql(module0141.$ic143$)) {
            return Equality.eql(var178, module0141.$ic148$);
        }
        if (var19.eql(module0141.$ic149$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var178.eql(module0141.$ic150$) || var178.eql(module0141.$ic144$) || var178.eql(module0141.$ic151$));
        }
        if (var19.eql(module0141.$ic150$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var178.eql(module0141.$ic144$) || var178.eql(module0141.$ic148$));
        }
        if (var19.eql(module0141.$ic144$)) {
            return Equality.eql(var178, module0141.$ic148$);
        }
        if (var19.eql(module0141.$ic152$)) {
            return Equality.eql(var178, module0141.$ic148$);
        }
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9288(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        return f9287(var19, module0141.$g1714$.getDynamicValue(var20));
    }
    
    public static SubLObject f9289(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        return (module0141.NIL != module0141.$g1715$.getDynamicValue(var20)) ? Functions.funcall(module0141.$g1715$.getDynamicValue(var20), var19) : f9288(var19);
    }
    
    public static SubLObject f9279(final SubLObject var19) {
        return f9287(var19, module0141.$ic143$);
    }
    
    public static SubLObject f9281(final SubLObject var19) {
        return f9287(var19, module0141.$ic144$);
    }
    
    public static SubLObject f9290(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (var19.eql(module0141.$ic145$)) {
            return module0141.$ic149$;
        }
        if (var19.eql(module0141.$ic146$)) {
            return module0141.$ic150$;
        }
        if (var19.eql(module0141.$ic149$)) {
            return module0141.$ic145$;
        }
        if (var19.eql(module0141.$ic150$)) {
            return module0141.$ic146$;
        }
        if (var19.eql(module0141.$ic143$)) {
            return module0141.$ic144$;
        }
        if (var19.eql(module0141.$ic144$)) {
            return module0141.$ic143$;
        }
        if (var19.eql(module0141.$ic148$)) {
            return module0141.$ic148$;
        }
        if (module0141.NIL != module0136.f8864() && module0141.NIL == f9282(var19)) {
            final SubLObject var179_181 = module0136.$g1591$.getDynamicValue(var20);
            if (var179_181.eql((SubLObject)module0141.$ic153$)) {
                module0136.f8870((SubLObject)module0141.ONE_INTEGER, (SubLObject)module0141.$ic154$, var19, (SubLObject)module0141.$ic155$, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED);
            }
            else if (var179_181.eql((SubLObject)module0141.$ic156$)) {
                module0136.f8871((SubLObject)module0141.ONE_INTEGER, (SubLObject)module0141.$ic157$, (SubLObject)module0141.$ic154$, var19, (SubLObject)module0141.$ic155$, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED);
            }
            else if (var179_181.eql((SubLObject)module0141.$ic158$)) {
                Errors.warn((SubLObject)module0141.$ic154$, var19, (SubLObject)module0141.$ic155$);
            }
            else {
                Errors.warn((SubLObject)module0141.$ic159$, module0136.$g1591$.getDynamicValue(var20));
                Errors.cerror((SubLObject)module0141.$ic157$, (SubLObject)module0141.$ic154$, var19, (SubLObject)module0141.$ic155$);
            }
        }
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9291(final SubLObject var19) {
        if (module0141.NIL != f9279(var19)) {
            return var19;
        }
        if (module0141.NIL != f9281(var19)) {
            return f9290(var19);
        }
        module0136.f8870((SubLObject)module0141.ONE_INTEGER, (SubLObject)module0141.$ic160$, var19, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED);
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9292(final SubLObject var19) {
        if (module0141.NIL != f9281(var19)) {
            return var19;
        }
        if (module0141.NIL != f9279(var19)) {
            return f9290(var19);
        }
        module0136.f8870((SubLObject)module0141.ONE_INTEGER, (SubLObject)module0141.$ic160$, var19, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED);
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9293() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return f9291(module0141.$g1714$.getDynamicValue(var35));
    }
    
    public static SubLObject f9294() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return f9292(module0141.$g1714$.getDynamicValue(var35));
    }
    
    public static SubLObject f9295(final SubLObject var19) {
        if (module0141.NIL != f9279(var19)) {
            return (SubLObject)module0141.$ic161$;
        }
        if (module0141.NIL != f9281(var19)) {
            return (SubLObject)module0141.$ic162$;
        }
        module0136.f8870((SubLObject)module0141.ONE_INTEGER, (SubLObject)module0141.$ic163$, var19, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED);
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9296(final SubLObject var19) {
        if (var19 != module0141.$ic161$ && var19 != module0141.$ic162$) {
            return f9295(var19);
        }
        return var19;
    }
    
    public static SubLObject f9297(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (var19.eql(module0141.$ic145$)) {
            return (SubLObject)module0141.$ic164$;
        }
        if (var19.eql(module0141.$ic146$)) {
            return (SubLObject)module0141.$ic165$;
        }
        if (var19.eql(module0141.$ic149$)) {
            return (SubLObject)module0141.$ic166$;
        }
        if (var19.eql(module0141.$ic150$)) {
            return (SubLObject)module0141.$ic167$;
        }
        if (var19.eql(module0141.$ic143$)) {
            return (SubLObject)module0141.$ic165$;
        }
        if (var19.eql(module0141.$ic144$)) {
            return (SubLObject)module0141.$ic167$;
        }
        if (var19.eql(module0141.$ic148$)) {
            return (SubLObject)module0141.$ic165$;
        }
        if (module0141.NIL != module0136.f8864() && module0141.NIL == f9282(var19)) {
            final SubLObject var179_182 = module0136.$g1591$.getDynamicValue(var20);
            if (var179_182.eql((SubLObject)module0141.$ic153$)) {
                module0136.f8870((SubLObject)module0141.ONE_INTEGER, (SubLObject)module0141.$ic154$, var19, (SubLObject)module0141.$ic155$, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED);
            }
            else if (var179_182.eql((SubLObject)module0141.$ic156$)) {
                module0136.f8871((SubLObject)module0141.ONE_INTEGER, (SubLObject)module0141.$ic157$, (SubLObject)module0141.$ic154$, var19, (SubLObject)module0141.$ic155$, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED, (SubLObject)module0141.UNPROVIDED);
            }
            else if (var179_182.eql((SubLObject)module0141.$ic158$)) {
                Errors.warn((SubLObject)module0141.$ic154$, var19, (SubLObject)module0141.$ic155$);
            }
            else {
                Errors.warn((SubLObject)module0141.$ic159$, module0136.$g1591$.getDynamicValue(var20));
                Errors.cerror((SubLObject)module0141.$ic157$, (SubLObject)module0141.$ic154$, var19, (SubLObject)module0141.$ic155$);
            }
        }
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9298(final SubLObject var19) {
        if (var19.eql((SubLObject)module0141.$ic164$)) {
            return module0141.$ic145$;
        }
        if (var19.eql((SubLObject)module0141.$ic165$)) {
            return module0141.$ic146$;
        }
        if (var19.eql((SubLObject)module0141.$ic166$)) {
            return module0141.$ic149$;
        }
        if (var19.eql((SubLObject)module0141.$ic167$)) {
            return module0141.$ic150$;
        }
        return Errors.error((SubLObject)module0141.$ic168$, var19);
    }
    
    public static SubLObject f9299(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic81$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic169$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9300(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic170$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0141.$ic171$, var5)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9301(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic172$, (SubLObject)module0141.$ic173$, ConsesLow.append(var5, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9302(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic170$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic172$, (SubLObject)module0141.$ic174$, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic175$, var5, ConsesLow.append(var6, (SubLObject)module0141.NIL)));
    }
    
    public static SubLObject f9303(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic170$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0141.$ic172$, (SubLObject)module0141.$ic176$, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic175$, var5, ConsesLow.append(var6, (SubLObject)module0141.NIL)));
    }
    
    public static SubLObject f9304(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic177$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)module0141.$ic178$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic171$, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic179$, var7, var7, (SubLObject)module0141.$ic180$)), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic169$, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic179$, var7, (SubLObject)module0141.$ic181$))), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic182$, var7, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic183$, var7, (SubLObject)module0141.$ic184$)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9305(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic177$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)module0141.$ic185$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic171$, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic179$, var7, var7, (SubLObject)module0141.$ic186$)), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic169$, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic179$, var7, (SubLObject)module0141.$ic181$))), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic182$, var7, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic183$, var7, (SubLObject)module0141.$ic187$)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9306(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic177$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)module0141.$ic188$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic171$, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic179$, var7, var7, (SubLObject)module0141.$ic189$)), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic169$, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic179$, var7, (SubLObject)module0141.$ic181$))), (SubLObject)ConsesLow.list((SubLObject)module0141.$ic182$, var7, (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic183$, var7, (SubLObject)module0141.$ic190$)), ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9307(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0141.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0141.$ic191$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0141.$ic192$, var5, ConsesLow.append(var6, (SubLObject)module0141.NIL));
    }
    
    public static SubLObject f9308() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9144", "S#11451");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9145", "S#11452");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9146", "S#11453");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9147", "S#11454");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9148", "S#11455");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9149", "S#11456");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9150", "S#11457");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9151", "S#11458");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9152", "S#11459");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9153", "S#11460");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9154", "S#11461");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9155", "S#11462");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9156", "S#11463");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9157", "S#11464");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9158", "S#11465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9159", "S#11466", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9160", "S#11467");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9161", "S#11468");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9162", "S#11469");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9163", "S#11470");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9164", "S#11471", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9165", "S#11472", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9166", "S#11473", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9167", "S#11474", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9168", "S#11475", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9169", "S#11476");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9170", "S#11477");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9171", "S#11478", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9172", "S#11479");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9173", "S#11480", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9174", "S#11481");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9175", "S#11482");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9176", "S#11483");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9177", "S#11484");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9178", "S#11485");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9179", "S#11486");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9180", "S#11487", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9181", "S#11488", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9182", "S#11489", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9183", "S#11490");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9184", "S#11491", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9185", "S#11492", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9186", "S#11493");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9187", "S#11494");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9188", "S#11495", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9189", "S#11496", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9190", "S#11497", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9191", "S#11498", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9192", "S#11499", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9193", "S#11500", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9194", "S#11501");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9195", "S#11502", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9196", "S#11503", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9197", "S#11504");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9198", "S#11505");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9199", "S#11506");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9200", "S#11507");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9201", "S#11508");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9202", "S#11509");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9203", "S#11510");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9204", "S#11511", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9205", "S#11512", 0, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9206", "S#11513");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9207", "S#11514", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9208", "S#11515", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9209", "S#11516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9210", "S#11517", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9211", "S#11518", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9212", "S#11519");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9213", "S#11520");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9214", "S#11521");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9215", "S#11271", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9216", "S#11272", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9217", "S#11522", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9218", "S#11523", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9219", "S#11524");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9220", "S#11525", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9221", "S#11526");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9222", "S#11527", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9223", "S#11528");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9224", "S#11529", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9225", "S#11530", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9226", "S#11531", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9227", "S#11532");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9228", "S#11533");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9229", "S#11534", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9230", "S#11535", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9231", "S#11536");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9232", "S#11537");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9233", "S#11538");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9234", "S#11539", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9235", "S#11540");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9236", "S#11541", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9237", "S#11542", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9238", "S#11543", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9239", "S#11544", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9240", "S#11545", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9241", "S#11546");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9242", "S#11547", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9243", "S#11548");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9244", "S#11549", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9245", "S#11550");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9246", "S#11551", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9247", "S#11552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9248", "S#11553", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9249", "S#11554");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9250", "S#11555");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9251", "S#11556", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9252", "S#11557");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9253", "S#11558");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9254", "S#11559", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9255", "S#11560");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9256", "S#11561", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9257", "S#11562");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9258", "S#11563", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9259", "S#11564");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9260", "S#11565", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9261", "S#11566");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9262", "S#11567");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9263", "S#11568");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9264", "S#11569", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9265", "S#11570");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9266", "S#11571");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9267", "S#11572");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9268", "S#11573");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9269", "S#11574", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9270", "S#11575");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9271", "S#11576", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9272", "S#11577");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9273", "S#11578", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9274", "S#11579");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9275", "S#11580");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9276", "S#11581");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9277", "S#11582");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9278", "S#11583", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9280", "S#11584", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9282", "S#11585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9283", "S#11586", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9284", "S#11587", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9285", "S#11588", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9286", "S#11589", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9287", "S#11590", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9288", "S#11450", 1, 0, false);
        new $f9288$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9289", "S#11591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9279", "S#11592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9281", "S#11593", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9290", "S#11594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9291", "S#11595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9292", "S#11596", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9293", "S#11597", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9294", "S#11598", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9295", "S#11599", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9296", "S#11600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9297", "S#11601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0141", "f9298", "S#11602", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9299", "S#11603");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9300", "S#11604");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9301", "S#11605");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9302", "S#11606");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9303", "S#11607");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9304", "S#11608");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9305", "S#11609");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9306", "S#11610");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0141", "f9307", "S#11611");
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9309() {
        module0141.$g1663$ = SubLFiles.defparameter("S#11612", (SubLObject)module0141.$ic22$);
        module0141.$g1664$ = SubLFiles.defparameter("S#11613", (SubLObject)module0141.NIL);
        module0141.$g1598$ = SubLFiles.defparameter("S#11614", (SubLObject)module0141.NIL);
        module0141.$g1665$ = SubLFiles.defparameter("S#11615", (SubLObject)module0141.NIL);
        module0141.$g1666$ = SubLFiles.defparameter("S#11616", (SubLObject)module0141.$ic34$);
        module0141.$g1667$ = SubLFiles.defparameter("S#11617", (SubLObject)module0141.NIL);
        module0141.$g1668$ = SubLFiles.defparameter("S#11618", (SubLObject)module0141.NIL);
        module0141.$g1669$ = SubLFiles.defparameter("S#11619", (SubLObject)module0141.NIL);
        module0141.$g1670$ = SubLFiles.defparameter("S#11620", (SubLObject)module0141.NIL);
        module0141.$g1671$ = SubLFiles.defparameter("S#11621", (SubLObject)module0141.NIL);
        module0141.$g1672$ = SubLFiles.defparameter("S#11622", (SubLObject)module0141.NIL);
        module0141.$g1673$ = SubLFiles.defparameter("S#11623", (SubLObject)module0141.NIL);
        module0141.$g1674$ = SubLFiles.defparameter("S#11624", (SubLObject)module0141.NIL);
        module0141.$g1675$ = SubLFiles.deflexical("S#11625", (SubLObject)module0141.$ic73$);
        module0141.$g1676$ = SubLFiles.deflexical("S#11626", (SubLObject)module0141.$ic74$);
        module0141.$g1677$ = SubLFiles.defparameter("S#11627", (SubLObject)module0141.NIL);
        module0141.$g1678$ = SubLFiles.defparameter("S#11628", (SubLObject)module0141.NIL);
        module0141.$g1679$ = SubLFiles.defparameter("S#11629", (SubLObject)module0141.NIL);
        module0141.$g1680$ = SubLFiles.defparameter("S#11630", (SubLObject)module0141.NIL);
        module0141.$g1681$ = SubLFiles.defparameter("S#11631", (SubLObject)module0141.NIL);
        module0141.$g1682$ = SubLFiles.defparameter("S#11632", (SubLObject)module0141.NIL);
        module0141.$g1683$ = SubLFiles.defparameter("S#11633", (SubLObject)module0141.NIL);
        module0141.$g1684$ = SubLFiles.defparameter("S#11634", (SubLObject)module0141.NIL);
        module0141.$g1685$ = SubLFiles.defparameter("S#11635", (SubLObject)module0141.NIL);
        module0141.$g1686$ = SubLFiles.defparameter("S#11636", (SubLObject)module0141.NIL);
        module0141.$g1687$ = SubLFiles.defparameter("S#11637", (SubLObject)module0141.NIL);
        module0141.$g1688$ = SubLFiles.defparameter("S#11638", (SubLObject)module0141.NIL);
        module0141.$g1689$ = SubLFiles.defparameter("S#11639", (SubLObject)module0141.NIL);
        module0141.$g1690$ = SubLFiles.defparameter("S#11640", (SubLObject)module0141.NIL);
        module0141.$g1691$ = SubLFiles.defparameter("S#11641", (SubLObject)module0141.NIL);
        module0141.$g1692$ = SubLFiles.defparameter("S#11642", (SubLObject)module0141.NIL);
        module0141.$g1693$ = SubLFiles.defparameter("S#11643", (SubLObject)module0141.NIL);
        module0141.$g1694$ = SubLFiles.defparameter("S#11644", (SubLObject)module0141.NIL);
        module0141.$g1695$ = SubLFiles.defparameter("S#11645", (SubLObject)module0141.$ic106$);
        module0141.$g1696$ = SubLFiles.defparameter("S#11646", (SubLObject)module0141.NIL);
        module0141.$g1697$ = SubLFiles.defparameter("S#11647", (SubLObject)module0141.NIL);
        module0141.$g1698$ = SubLFiles.defparameter("S#11648", (SubLObject)module0141.NIL);
        module0141.$g1699$ = SubLFiles.defparameter("S#11649", (SubLObject)module0141.NIL);
        module0141.$g1700$ = SubLFiles.defparameter("S#11650", (SubLObject)module0141.NIL);
        module0141.$g1701$ = SubLFiles.defparameter("S#11651", (SubLObject)module0141.NIL);
        module0141.$g1702$ = SubLFiles.defparameter("S#11652", (SubLObject)module0141.NIL);
        module0141.$g1703$ = SubLFiles.defparameter("S#11653", (SubLObject)module0141.NIL);
        module0141.$g1704$ = SubLFiles.defparameter("S#11654", (SubLObject)module0141.NIL);
        module0141.$g1705$ = SubLFiles.defparameter("S#11655", (SubLObject)module0141.NIL);
        module0141.$g1706$ = SubLFiles.defparameter("S#11656", (SubLObject)module0141.T);
        module0141.$g1707$ = SubLFiles.defparameter("S#11657", (SubLObject)module0141.NIL);
        module0141.$g1708$ = SubLFiles.defparameter("S#11658", (SubLObject)module0141.NIL);
        module0141.$g1709$ = SubLFiles.defparameter("S#11659", (SubLObject)module0141.T);
        module0141.$g1710$ = SubLFiles.defparameter("S#11660", (SubLObject)module0141.NIL);
        module0141.$g1711$ = SubLFiles.deflexical("S#11661", (SubLObject)module0141.$ic142$);
        module0141.$g1712$ = SubLFiles.deflexical("S#11662", module0141.$ic143$);
        module0141.$g1713$ = SubLFiles.deflexical("S#11663", module0141.$ic144$);
        module0141.$g1714$ = SubLFiles.defparameter("S#11664", module0141.$ic143$);
        module0141.$g1715$ = SubLFiles.defparameter("S#11665", (SubLObject)module0141.NIL);
        return (SubLObject)module0141.NIL;
    }
    
    public static SubLObject f9310() {
        return (SubLObject)module0141.NIL;
    }
    
    public void declareFunctions() {
        f9308();
    }
    
    public void initializeVariables() {
        f9309();
    }
    
    public void runTopLevelForms() {
        f9310();
    }
    
    static {
        me = (SubLFile)new module0141();
        module0141.$g1663$ = null;
        module0141.$g1664$ = null;
        module0141.$g1598$ = null;
        module0141.$g1665$ = null;
        module0141.$g1666$ = null;
        module0141.$g1667$ = null;
        module0141.$g1668$ = null;
        module0141.$g1669$ = null;
        module0141.$g1670$ = null;
        module0141.$g1671$ = null;
        module0141.$g1672$ = null;
        module0141.$g1673$ = null;
        module0141.$g1674$ = null;
        module0141.$g1675$ = null;
        module0141.$g1676$ = null;
        module0141.$g1677$ = null;
        module0141.$g1678$ = null;
        module0141.$g1679$ = null;
        module0141.$g1680$ = null;
        module0141.$g1681$ = null;
        module0141.$g1682$ = null;
        module0141.$g1683$ = null;
        module0141.$g1684$ = null;
        module0141.$g1685$ = null;
        module0141.$g1686$ = null;
        module0141.$g1687$ = null;
        module0141.$g1688$ = null;
        module0141.$g1689$ = null;
        module0141.$g1690$ = null;
        module0141.$g1691$ = null;
        module0141.$g1692$ = null;
        module0141.$g1693$ = null;
        module0141.$g1694$ = null;
        module0141.$g1695$ = null;
        module0141.$g1696$ = null;
        module0141.$g1697$ = null;
        module0141.$g1698$ = null;
        module0141.$g1699$ = null;
        module0141.$g1700$ = null;
        module0141.$g1701$ = null;
        module0141.$g1702$ = null;
        module0141.$g1703$ = null;
        module0141.$g1704$ = null;
        module0141.$g1705$ = null;
        module0141.$g1706$ = null;
        module0141.$g1707$ = null;
        module0141.$g1708$ = null;
        module0141.$g1709$ = null;
        module0141.$g1710$ = null;
        module0141.$g1711$ = null;
        module0141.$g1712$ = null;
        module0141.$g1713$ = null;
        module0141.$g1714$ = null;
        module0141.$g1715$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#11303", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#11540", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#11546", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#11536", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#11538", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#11504", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#11248", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#11581", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#11520", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#11232", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#11521", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#11234", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#11582", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic14$ = SubLObjectFactory.makeSymbol("S#11611", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#11609", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#11453", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#11451", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#11454", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#11610", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#11455", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#11456", "CYC");
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLOSURE"), (SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)SubLObjectFactory.makeKeyword("WHAT-MTS"));
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic24$ = SubLObjectFactory.makeSymbol("CLET");
        $ic25$ = SubLObjectFactory.makeSymbol("S#11613", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#11467", "CYC");
        $ic27$ = SubLObjectFactory.makeKeyword("CLOSURE");
        $ic28$ = SubLObjectFactory.makeKeyword("BOOLEAN");
        $ic29$ = SubLObjectFactory.makeKeyword("WHAT-MTS");
        $ic30$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11614", "CYC"), (SubLObject)module0141.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11632", "CYC"), (SubLObject)module0141.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11631", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11666", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#11667", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#11668", "CYC")))));
        $ic31$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11614", "CYC"), (SubLObject)module0141.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11632", "CYC"), (SubLObject)module0141.NIL));
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11669", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic33$ = SubLObjectFactory.makeSymbol("S#11615", "CYC");
        $ic34$ = SubLObjectFactory.makeKeyword("OLD");
        $ic35$ = SubLObjectFactory.makeSymbol("S#11616", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("PIF");
        $ic37$ = SubLObjectFactory.makeSymbol("S#11669", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11616", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION")));
        $ic40$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11616", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("VERBOSE")));
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11616", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OLD")));
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11617", "CYC"), (SubLObject)module0141.NIL));
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11618", "CYC"), (SubLObject)module0141.NIL));
        $ic44$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11619", "CYC"), (SubLObject)module0141.T));
        $ic45$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11619", "CYC"), (SubLObject)module0141.NIL));
        $ic46$ = SubLObjectFactory.makeString("get-sbhl-search-module: *sbhl-search-module* is unexpectedly null.");
        $ic47$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic48$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic49$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $ic50$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic52$ = SubLObjectFactory.makeSymbol("S#11620", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#11621", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#11670", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#11622", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#11671", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#11176", "CYC");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11624", "CYC"), (SubLObject)module0141.NIL));
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic60$ = SubLObjectFactory.makeSymbol("S#11624", "CYC");
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11624", "CYC"), (SubLObject)module0141.T));
        $ic62$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11624", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11511", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("S#11624", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#11624", "CYC"))));
        $ic63$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11624", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11512", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("S#11624", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#11624", "CYC"))));
        $ic64$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11624", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)module0141.EQL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11101", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11495", "CYC"))), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse"))), (SubLObject)module0141.T, (SubLObject)SubLObjectFactory.makeSymbol("S#11624", "CYC"))));
        $ic65$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11624", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("S#11624", "CYC"))));
        $ic66$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic67$ = SubLObjectFactory.makeUninternedSymbol("US#34A80D6");
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11449", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11495", "CYC")));
        $ic69$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic70$ = SubLObjectFactory.makeSymbol("S#11623", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#11102", "CYC");
        $ic72$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse")));
        $ic73$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic74$ = SubLObjectFactory.makeKeyword("BACKWARD");
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic76$ = SubLObjectFactory.makeSymbol("S#11627", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("S#11519", "CYC");
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11515", "CYC"));
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11517", "CYC"));
        $ic80$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11629", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)module0141.EQ, (SubLObject)SubLObjectFactory.makeSymbol("S#11627", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11673", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11102", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11674", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11102", "CYC"))))));
        $ic81$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic82$ = SubLObjectFactory.makeSymbol("S#11630", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#11631", "CYC");
        $ic84$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11632", "CYC"), (SubLObject)module0141.T));
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11632", "CYC"), (SubLObject)module0141.NIL));
        $ic86$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11633", "CYC"), (SubLObject)module0141.NIL));
        $ic87$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11633", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11633", "CYC")));
        $ic88$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11634", "CYC"), (SubLObject)module0141.NIL));
        $ic89$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11635", "CYC"), (SubLObject)module0141.NIL));
        $ic90$ = SubLObjectFactory.makeKeyword("GOAL");
        $ic91$ = SubLObjectFactory.makeKeyword("CUTOFF");
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11636", "CYC"), (SubLObject)module0141.NIL));
        $ic93$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic94$ = SubLObjectFactory.makeSymbol("S#11637", "CYC");
        $ic95$ = SubLObjectFactory.makeSymbol("S#11638", "CYC");
        $ic96$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2953", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic97$ = SubLObjectFactory.makeSymbol("S#11640", "CYC");
        $ic98$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#761", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic99$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11641", "CYC"));
        $ic100$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic101$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic102$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11642", "CYC"));
        $ic103$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic104$ = SubLObjectFactory.makeSymbol("S#11643", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("S#11644", "CYC");
        $ic106$ = SubLObjectFactory.makeSymbol("NCONC");
        $ic107$ = SubLObjectFactory.makeSymbol("S#11645", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("S#11646", "CYC");
        $ic109$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11647", "CYC"), (SubLObject)module0141.NIL));
        $ic110$ = SubLObjectFactory.makeSymbol("S#11648", "CYC");
        $ic111$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#202", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic112$ = SubLObjectFactory.makeSymbol("S#11649", "CYC");
        $ic113$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11676", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic114$ = SubLObjectFactory.makeSymbol("S#11650", "CYC");
        $ic115$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11651", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4669", "CYC"))));
        $ic116$ = SubLObjectFactory.makeUninternedSymbol("US#356AA47");
        $ic117$ = SubLObjectFactory.makeSymbol("S#4670", "CYC");
        $ic118$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4669", "CYC")));
        $ic119$ = SubLObjectFactory.makeSymbol("S#11652", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("LIST");
        $ic121$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11392", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11677", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic122$ = SubLObjectFactory.makeUninternedSymbol("US#356AA47");
        $ic123$ = SubLObjectFactory.makeSymbol("WHILE");
        $ic124$ = SubLObjectFactory.makeSymbol("CAND");
        $ic125$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic126$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("S#11652", "CYC")));
        $ic127$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic128$ = SubLObjectFactory.makeSymbol("S#5503", "CYC");
        $ic129$ = SubLObjectFactory.makeSymbol("S#11572", "CYC");
        $ic130$ = SubLObjectFactory.makeSymbol("RPLACD");
        $ic131$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)SubLObjectFactory.makeSymbol("S#11652", "CYC"));
        $ic132$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11651", "CYC"));
        $ic133$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#11652", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("S#11652", "CYC"))));
        $ic134$ = SubLObjectFactory.makeSymbol("S#4671", "CYC");
        $ic135$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#11652", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE-IF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#4672", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#11652", "CYC"))));
        $ic136$ = SubLObjectFactory.makeSymbol("S#11653", "CYC");
        $ic137$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11654", "CYC"), (SubLObject)module0141.T));
        $ic138$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10878", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic139$ = SubLObjectFactory.makeSymbol("S#11655", "CYC");
        $ic140$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11660", "CYC"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"))));
        $ic141$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11660", "CYC"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("False-JustificationTruth"))));
        $ic142$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MonotonicallyTrue")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DefaultTrue")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MonotonicallyFalse")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DefaultFalse")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("False-JustificationTruth")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ArbitraryTruth-JustificationTruth")));
        $ic143$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic144$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("False-JustificationTruth"));
        $ic145$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MonotonicallyTrue"));
        $ic146$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DefaultTrue"));
        $ic147$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ArbitraryTruth-JustifactionTruth"));
        $ic148$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ArbitraryTruth-JustificationTruth"));
        $ic149$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MonotonicallyFalse"));
        $ic150$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DefaultFalse"));
        $ic151$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("JustifactionTruth"));
        $ic152$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Unknown-JustificationTruth"));
        $ic153$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic154$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic155$ = SubLObjectFactory.makeSymbol("S#11585", "CYC");
        $ic156$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic157$ = SubLObjectFactory.makeString("continue anyway");
        $ic158$ = SubLObjectFactory.makeKeyword("WARN");
        $ic159$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic160$ = SubLObjectFactory.makeString("Expected true or false sbhl truth value. tv: ~a~%");
        $ic161$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic162$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic163$ = SubLObjectFactory.makeString("unknown truth value for translation: ~a");
        $ic164$ = SubLObjectFactory.makeKeyword("TRUE-MON");
        $ic165$ = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $ic166$ = SubLObjectFactory.makeKeyword("FALSE-MON");
        $ic167$ = SubLObjectFactory.makeKeyword("FALSE-DEF");
        $ic168$ = SubLObjectFactory.makeString("Cannot translate ~s truth to an sbhl-tv");
        $ic169$ = SubLObjectFactory.makeSymbol("S#11665", "CYC");
        $ic170$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11678", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic171$ = SubLObjectFactory.makeSymbol("S#11664", "CYC");
        $ic172$ = SubLObjectFactory.makeSymbol("S#11603", "CYC");
        $ic173$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#11589", "CYC"));
        $ic174$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#11450", "CYC"));
        $ic175$ = SubLObjectFactory.makeSymbol("S#11604", "CYC");
        $ic176$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#11679", "CYC"));
        $ic177$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic178$ = SubLObjectFactory.makeUninternedSymbol("US#34E0056");
        $ic179$ = SubLObjectFactory.makeSymbol("FIF");
        $ic180$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11664", "CYC"));
        $ic181$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#11450", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#11665", "CYC"));
        $ic182$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic183$ = SubLObjectFactory.makeSymbol("S#11077", "CYC");
        $ic184$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11585", "CYC"));
        $ic185$ = SubLObjectFactory.makeUninternedSymbol("US#34E0056");
        $ic186$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11586", "CYC")));
        $ic187$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11592", "CYC"));
        $ic188$ = SubLObjectFactory.makeUninternedSymbol("US#34E0056");
        $ic189$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11587", "CYC")));
        $ic190$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11593", "CYC"));
        $ic191$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic192$ = SubLObjectFactory.makeSymbol("S#11680", "CYC");
    }
    
    public static final class $f9288$UnaryFunction extends UnaryFunction
    {
        public $f9288$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#11450"));
        }
        
        public SubLObject processItem(final SubLObject var180) {
            return module0141.f9288(var180);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0141.class
	Total time: 447 ms
	
	Decompiled with Procyon 0.5.32.
*/