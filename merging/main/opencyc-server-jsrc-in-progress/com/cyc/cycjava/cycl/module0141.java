package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return (SubLObject)ConsesLow.list((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, reader.bq_cons((SubLObject)$ic6$, ConsesLow.append(var5, (SubLObject)NIL))))))));
    }
    
    public static SubLObject f9145(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, reader.bq_cons((SubLObject)$ic6$, ConsesLow.append(var5, (SubLObject)NIL)))))));
    }
    
    public static SubLObject f9146(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)$ic8$, reader.bq_cons((SubLObject)$ic9$, ConsesLow.append(var5, (SubLObject)NIL))));
    }
    
    public static SubLObject f9147(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)$ic10$, reader.bq_cons((SubLObject)$ic11$, ConsesLow.append(var5, (SubLObject)NIL))));
    }
    
    public static SubLObject f9148(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)$ic8$, reader.bq_cons((SubLObject)$ic9$, ConsesLow.append(var5, (SubLObject)NIL))));
    }
    
    public static SubLObject f9149(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)$ic10$, reader.bq_cons((SubLObject)$ic11$, ConsesLow.append(var5, (SubLObject)NIL))));
    }
    
    public static SubLObject f9150(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic13$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic13$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic14$, var5, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic16$, reader.bq_cons((SubLObject)$ic17$, ConsesLow.append(var7, (SubLObject)NIL)))));
    }
    
    public static SubLObject f9151(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic13$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic13$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic14$, var5, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic18$, reader.bq_cons((SubLObject)$ic17$, ConsesLow.append(var7, (SubLObject)NIL)))));
    }
    
    public static SubLObject f9152(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic13$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic13$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic14$, var5, (SubLObject)ConsesLow.list((SubLObject)$ic19$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic20$, reader.bq_cons((SubLObject)$ic17$, ConsesLow.append(var7, (SubLObject)NIL)))));
    }
    
    public static SubLObject f9153(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic13$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic13$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic14$, var5, (SubLObject)ConsesLow.list((SubLObject)$ic19$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic21$, reader.bq_cons((SubLObject)$ic17$, ConsesLow.append(var7, (SubLObject)NIL)))));
    }
    
    public static SubLObject f9154(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic16$, reader.bq_cons((SubLObject)$ic17$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9155(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic18$, reader.bq_cons((SubLObject)$ic17$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9156(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic20$, reader.bq_cons((SubLObject)$ic17$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9157(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic21$, reader.bq_cons((SubLObject)$ic17$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f9158(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0004.f104(var34, $g1663$.getDynamicValue(var35), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f9159() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1664$.getDynamicValue(var35);
    }
    
    public static SubLObject f9160(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic25$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9161(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic26$, (SubLObject)$ic27$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9162(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic26$, (SubLObject)$ic28$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9163(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic26$, (SubLObject)$ic29$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9164() {
        return Equality.eq(f9159(), (SubLObject)$ic27$);
    }
    
    public static SubLObject f9165() {
        return Equality.eq(f9159(), (SubLObject)$ic28$);
    }
    
    public static SubLObject f9166() {
        return Equality.eq(f9159(), (SubLObject)$ic29$);
    }
    
    public static SubLObject f9167() {
        return (SubLObject)makeBoolean(NIL != f9165() || NIL != f9168());
    }
    
    public static SubLObject f9168() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1598$.getDynamicValue(var35);
    }
    
    public static SubLObject f9169(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic30$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9170(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic31$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9171() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1665$.getDynamicValue(var35);
    }
    
    public static SubLObject f9172(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic32$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic33$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9173() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1666$.getDynamicValue(var35);
    }
    
    public static SubLObject f9174(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic32$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic35$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9175(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic32$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        if (NIL != var5) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)$ic37$, (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic35$, var5)), ConsesLow.append(var6, (SubLObject)NIL)), reader.bq_cons((SubLObject)$ic38$, ConsesLow.append(var6, (SubLObject)NIL)));
        }
        return reader.bq_cons((SubLObject)$ic38$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9176(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic39$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9177(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic40$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9178(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic41$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9179(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic42$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9180() {
        $g1667$.setDynamicValue((SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9181() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1667$.getDynamicValue(var35);
    }
    
    public static SubLObject f9182() {
        $g1668$.setDynamicValue((SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9183(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic43$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9184() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1668$.getDynamicValue(var35);
    }
    
    public static SubLObject f9185() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1669$.getDynamicValue(var35);
    }
    
    public static SubLObject f9186(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic44$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9187(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic45$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9188() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (NIL == $g1670$.getDynamicValue(var35)) {
            Errors.warn((SubLObject)$ic46$);
        }
        return $g1670$.getDynamicValue(var35);
    }
    
    public static SubLObject f9189() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1671$.getDynamicValue(var35);
    }
    
    public static SubLObject f9190() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1672$.getDynamicValue(var35);
    }
    
    public static SubLObject f9191() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1673$.getDynamicValue(var35);
    }
    
    public static SubLObject f9192() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (module0137.f8917($g1670$.getDynamicValue(var35)).eql($ic47$)) {
            return module0137.f8955($ic48$);
        }
        return $g1670$.getDynamicValue(var35);
    }
    
    public static SubLObject f9193() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (module0137.f8917($g1670$.getDynamicValue(var35)).eql($ic49$)) {
            return module0137.f8955($ic50$);
        }
        return $g1670$.getDynamicValue(var35);
    }
    
    public static SubLObject f9194(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic51$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic52$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic53$, (SubLObject)ConsesLow.list((SubLObject)$ic54$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic55$, (SubLObject)ConsesLow.list((SubLObject)$ic56$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.listS((SubLObject)$ic57$, var5, ConsesLow.append(var6, (SubLObject)NIL))));
    }
    
    public static SubLObject f9195() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1674$.getDynamicValue(var35);
    }
    
    public static SubLObject f9196() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL == $g1674$.getDynamicValue(var35));
    }
    
    public static SubLObject f9197(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic58$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9198(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic59$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic60$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9199(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic61$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9200(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic62$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9201(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic63$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9202(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic64$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9203(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic65$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9204(SubLObject var87) {
        if (var87 == UNPROVIDED) {
            var87 = module0137.f8955((SubLObject)UNPROVIDED);
        }
        return (SubLObject)makeBoolean(module0244.f15736(var87).eql($ic47$) || module0244.f15736(var87).eql($ic49$));
    }
    
    public static SubLObject f9205(SubLObject var87, SubLObject var88) {
        if (var87 == UNPROVIDED) {
            var87 = module0137.f8955((SubLObject)UNPROVIDED);
        }
        if (var88 == UNPROVIDED) {
            var88 = f9188();
        }
        return (SubLObject)makeBoolean(NIL != module0244.f15752(var88) && NIL != f9204(var87));
    }
    
    public static SubLObject f9206(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic66$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic67$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)$ic68$, (SubLObject)ConsesLow.list((SubLObject)$ic69$, (SubLObject)ConsesLow.list(var7, var5), (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list((SubLObject)$ic56$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var7))), (SubLObject)ConsesLow.list((SubLObject)$ic60$, (SubLObject)ConsesLow.listS((SubLObject)EQL, var7, (SubLObject)$ic72$))), ConsesLow.append(var6, (SubLObject)NIL))), reader.bq_cons((SubLObject)$ic38$, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9207(final SubLObject var93) {
        return Equality.eq(var93, $g1675$.getGlobalValue());
    }
    
    public static SubLObject f9208() {
        return $g1675$.getGlobalValue();
    }
    
    public static SubLObject f9209(final SubLObject var93) {
        return Equality.eq(var93, $g1676$.getGlobalValue());
    }
    
    public static SubLObject f9210() {
        return $g1676$.getGlobalValue();
    }
    
    public static SubLObject f9211() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1677$.getDynamicValue(var35);
    }
    
    public static SubLObject f9212(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic75$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic76$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9213(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic77$, (SubLObject)$ic78$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9214(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic77$, (SubLObject)$ic79$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9215() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return f9207($g1677$.getDynamicValue(var35));
    }
    
    public static SubLObject f9216() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return f9209($g1677$.getDynamicValue(var35));
    }
    
    public static SubLObject f9217() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1679$.getDynamicValue(var35);
    }
    
    public static SubLObject f9218() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return Numbers.subtract((SubLObject)THREE_INTEGER, $g1679$.getDynamicValue(var35));
    }
    
    public static SubLObject f9219(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic80$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9220() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1680$.getDynamicValue(var35);
    }
    
    public static SubLObject f9221(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic81$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic82$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9222() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1681$.getDynamicValue(var35);
    }
    
    public static SubLObject f9223(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic81$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic83$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9224() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1682$.getDynamicValue(var35);
    }
    
    public static SubLObject f9225() {
        $g1682$.setDynamicValue((SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9226() {
        $g1682$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9227(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic84$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9228(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic85$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9229() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1683$.getDynamicValue(var35);
    }
    
    public static SubLObject f9230(final SubLObject var111) {
        $g1683$.setDynamicValue(var111);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9231(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic86$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9232(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic87$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9233(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic88$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9234() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1684$.getDynamicValue(var35);
    }
    
    public static SubLObject f9235(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic89$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9236() {
        $g1685$.setDynamicValue((SubLObject)$ic90$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9237() {
        $g1685$.setDynamicValue((SubLObject)$ic91$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9238() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1686$.getDynamicValue(var35);
    }
    
    public static SubLObject f9239() {
        $g1686$.setDynamicValue((SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9240() {
        $g1686$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9241(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic92$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9242(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        return Equality.eql(var122, $g1687$.getDynamicValue(var123));
    }
    
    public static SubLObject f9243(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic93$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic94$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9244(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        return Equality.eql(var122, $g1688$.getDynamicValue(var123));
    }
    
    public static SubLObject f9245(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic93$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic95$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9246() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1688$.getDynamicValue(var35);
    }
    
    public static SubLObject f9247(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        return module0004.f104(var122, $g1688$.getDynamicValue(var123), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f9248() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1689$.getDynamicValue(var35);
    }
    
    public static SubLObject f9249(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic96$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic95$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9250(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic93$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic97$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9251() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1690$.getDynamicValue(var35);
    }
    
    public static SubLObject f9252(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic98$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic24$, (SubLObject)$ic99$, (SubLObject)ConsesLow.list((SubLObject)$ic100$, reader.bq_cons((SubLObject)$ic38$, ConsesLow.append(var6, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic101$, var5, (SubLObject)$ic99$)));
    }
    
    public static SubLObject f9253(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic98$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic24$, (SubLObject)$ic102$, (SubLObject)ConsesLow.list((SubLObject)$ic100$, reader.bq_cons((SubLObject)$ic38$, ConsesLow.append(var6, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic101$, var5, (SubLObject)$ic102$)));
    }
    
    public static SubLObject f9254() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1693$.getDynamicValue(var35);
    }
    
    public static SubLObject f9255(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic103$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic104$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9256() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1694$.getDynamicValue(var35);
    }
    
    public static SubLObject f9257(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic103$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic105$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9258() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1695$.getDynamicValue(var35);
    }
    
    public static SubLObject f9259(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic103$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic107$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9260() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1696$.getDynamicValue(var35);
    }
    
    public static SubLObject f9261(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic103$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic108$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9262(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic109$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9263(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic93$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic110$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9264(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        return Equality.eql(var122, $g1698$.getDynamicValue(var123));
    }
    
    public static SubLObject f9265(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic111$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic112$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9266(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic113$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic114$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9267(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic115$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9268(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic93$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic116$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.listS((SubLObject)$ic117$, var5, (SubLObject)$ic118$)), (SubLObject)ConsesLow.list((SubLObject)$ic119$, (SubLObject)ConsesLow.list((SubLObject)$ic120$, var7))), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9269() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean($g1702$.getDynamicValue(var35));
    }
    
    public static SubLObject f9270(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic121$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic121$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic121$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)$ic122$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic123$, (SubLObject)ConsesLow.list((SubLObject)$ic124$, (SubLObject)$ic119$, (SubLObject)ConsesLow.list((SubLObject)$ic125$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic24$, (SubLObject)ConsesLow.list(reader.bq_cons(var9, (SubLObject)$ic126$), (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic127$, (SubLObject)ConsesLow.list((SubLObject)$ic128$, var9)))), reader.bq_cons((SubLObject)$ic129$, ConsesLow.append(var8, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic36$, var7, (SubLObject)ConsesLow.listS((SubLObject)$ic38$, (SubLObject)ConsesLow.list((SubLObject)$ic130$, (SubLObject)$ic131$, (SubLObject)ConsesLow.listS((SubLObject)$ic120$, var9, (SubLObject)$ic132$)), (SubLObject)$ic133$), (SubLObject)ConsesLow.list((SubLObject)$ic134$, var9)))))), (SubLObject)$ic135$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic121$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9271(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        return Functions.funcall($g1703$.getDynamicValue(var123), var122);
    }
    
    public static SubLObject f9272(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic81$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic136$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9273() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1704$.getDynamicValue(var35);
    }
    
    public static SubLObject f9274(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic137$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9275(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic138$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic139$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9276(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic140$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9277(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic141$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9278() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return f9279($g1710$.getDynamicValue(var35));
    }
    
    public static SubLObject f9280() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return f9281($g1710$.getDynamicValue(var35));
    }
    
    public static SubLObject f9282(final SubLObject var177) {
        return module0004.f104(var177, $g1711$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f9283() {
        return $g1712$.getGlobalValue();
    }
    
    public static SubLObject f9284() {
        return $g1713$.getGlobalValue();
    }
    
    public static SubLObject f9285() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return $g1714$.getDynamicValue(var35);
    }
    
    public static SubLObject f9286(final SubLObject var19) {
        return (SubLObject)T;
    }
    
    public static SubLObject f9287(final SubLObject var19, final SubLObject var178) {
        if (var19.eql(var178)) {
            return (SubLObject)T;
        }
        if (var19.eql($ic145$)) {
            return (SubLObject)makeBoolean(var178.eql($ic146$) || var178.eql($ic143$) || var178.eql($ic147$));
        }
        if (var19.eql($ic146$)) {
            return (SubLObject)makeBoolean(var178.eql($ic143$) || var178.eql($ic148$));
        }
        if (var19.eql($ic143$)) {
            return Equality.eql(var178, $ic148$);
        }
        if (var19.eql($ic149$)) {
            return (SubLObject)makeBoolean(var178.eql($ic150$) || var178.eql($ic144$) || var178.eql($ic151$));
        }
        if (var19.eql($ic150$)) {
            return (SubLObject)makeBoolean(var178.eql($ic144$) || var178.eql($ic148$));
        }
        if (var19.eql($ic144$)) {
            return Equality.eql(var178, $ic148$);
        }
        if (var19.eql($ic152$)) {
            return Equality.eql(var178, $ic148$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9288(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        return f9287(var19, $g1714$.getDynamicValue(var20));
    }
    
    public static SubLObject f9289(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        return (NIL != $g1715$.getDynamicValue(var20)) ? Functions.funcall($g1715$.getDynamicValue(var20), var19) : f9288(var19);
    }
    
    public static SubLObject f9279(final SubLObject var19) {
        return f9287(var19, $ic143$);
    }
    
    public static SubLObject f9281(final SubLObject var19) {
        return f9287(var19, $ic144$);
    }
    
    public static SubLObject f9290(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (var19.eql($ic145$)) {
            return $ic149$;
        }
        if (var19.eql($ic146$)) {
            return $ic150$;
        }
        if (var19.eql($ic149$)) {
            return $ic145$;
        }
        if (var19.eql($ic150$)) {
            return $ic146$;
        }
        if (var19.eql($ic143$)) {
            return $ic144$;
        }
        if (var19.eql($ic144$)) {
            return $ic143$;
        }
        if (var19.eql($ic148$)) {
            return $ic148$;
        }
        if (NIL != module0136.f8864() && NIL == f9282(var19)) {
            final SubLObject var179_181 = module0136.$g1591$.getDynamicValue(var20);
            if (var179_181.eql((SubLObject)$ic153$)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic154$, var19, (SubLObject)$ic155$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var179_181.eql((SubLObject)$ic156$)) {
                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic157$, (SubLObject)$ic154$, var19, (SubLObject)$ic155$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var179_181.eql((SubLObject)$ic158$)) {
                Errors.warn((SubLObject)$ic154$, var19, (SubLObject)$ic155$);
            }
            else {
                Errors.warn((SubLObject)$ic159$, module0136.$g1591$.getDynamicValue(var20));
                Errors.cerror((SubLObject)$ic157$, (SubLObject)$ic154$, var19, (SubLObject)$ic155$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9291(final SubLObject var19) {
        if (NIL != f9279(var19)) {
            return var19;
        }
        if (NIL != f9281(var19)) {
            return f9290(var19);
        }
        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic160$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9292(final SubLObject var19) {
        if (NIL != f9281(var19)) {
            return var19;
        }
        if (NIL != f9279(var19)) {
            return f9290(var19);
        }
        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic160$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9293() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return f9291($g1714$.getDynamicValue(var35));
    }
    
    public static SubLObject f9294() {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return f9292($g1714$.getDynamicValue(var35));
    }
    
    public static SubLObject f9295(final SubLObject var19) {
        if (NIL != f9279(var19)) {
            return (SubLObject)$ic161$;
        }
        if (NIL != f9281(var19)) {
            return (SubLObject)$ic162$;
        }
        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic163$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9296(final SubLObject var19) {
        if (var19 != $ic161$ && var19 != $ic162$) {
            return f9295(var19);
        }
        return var19;
    }
    
    public static SubLObject f9297(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (var19.eql($ic145$)) {
            return (SubLObject)$ic164$;
        }
        if (var19.eql($ic146$)) {
            return (SubLObject)$ic165$;
        }
        if (var19.eql($ic149$)) {
            return (SubLObject)$ic166$;
        }
        if (var19.eql($ic150$)) {
            return (SubLObject)$ic167$;
        }
        if (var19.eql($ic143$)) {
            return (SubLObject)$ic165$;
        }
        if (var19.eql($ic144$)) {
            return (SubLObject)$ic167$;
        }
        if (var19.eql($ic148$)) {
            return (SubLObject)$ic165$;
        }
        if (NIL != module0136.f8864() && NIL == f9282(var19)) {
            final SubLObject var179_182 = module0136.$g1591$.getDynamicValue(var20);
            if (var179_182.eql((SubLObject)$ic153$)) {
                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic154$, var19, (SubLObject)$ic155$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var179_182.eql((SubLObject)$ic156$)) {
                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic157$, (SubLObject)$ic154$, var19, (SubLObject)$ic155$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var179_182.eql((SubLObject)$ic158$)) {
                Errors.warn((SubLObject)$ic154$, var19, (SubLObject)$ic155$);
            }
            else {
                Errors.warn((SubLObject)$ic159$, module0136.$g1591$.getDynamicValue(var20));
                Errors.cerror((SubLObject)$ic157$, (SubLObject)$ic154$, var19, (SubLObject)$ic155$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9298(final SubLObject var19) {
        if (var19.eql((SubLObject)$ic164$)) {
            return $ic145$;
        }
        if (var19.eql((SubLObject)$ic165$)) {
            return $ic146$;
        }
        if (var19.eql((SubLObject)$ic166$)) {
            return $ic149$;
        }
        if (var19.eql((SubLObject)$ic167$)) {
            return $ic150$;
        }
        return Errors.error((SubLObject)$ic168$, var19);
    }
    
    public static SubLObject f9299(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic81$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic169$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9300(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic170$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic171$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9301(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic172$, (SubLObject)$ic173$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f9302(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic170$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic172$, (SubLObject)$ic174$, (SubLObject)ConsesLow.listS((SubLObject)$ic175$, var5, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9303(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic170$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic172$, (SubLObject)$ic176$, (SubLObject)ConsesLow.listS((SubLObject)$ic175$, var5, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f9304(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic177$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic178$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5), (SubLObject)ConsesLow.list((SubLObject)$ic171$, (SubLObject)ConsesLow.listS((SubLObject)$ic179$, var7, var7, (SubLObject)$ic180$)), (SubLObject)ConsesLow.list((SubLObject)$ic169$, (SubLObject)ConsesLow.listS((SubLObject)$ic179$, var7, (SubLObject)$ic181$))), (SubLObject)ConsesLow.list((SubLObject)$ic182$, var7, (SubLObject)ConsesLow.listS((SubLObject)$ic183$, var7, (SubLObject)$ic184$)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9305(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic177$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic185$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5), (SubLObject)ConsesLow.list((SubLObject)$ic171$, (SubLObject)ConsesLow.listS((SubLObject)$ic179$, var7, var7, (SubLObject)$ic186$)), (SubLObject)ConsesLow.list((SubLObject)$ic169$, (SubLObject)ConsesLow.listS((SubLObject)$ic179$, var7, (SubLObject)$ic181$))), (SubLObject)ConsesLow.list((SubLObject)$ic182$, var7, (SubLObject)ConsesLow.listS((SubLObject)$ic183$, var7, (SubLObject)$ic187$)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9306(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic177$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic188$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5), (SubLObject)ConsesLow.list((SubLObject)$ic171$, (SubLObject)ConsesLow.listS((SubLObject)$ic179$, var7, var7, (SubLObject)$ic189$)), (SubLObject)ConsesLow.list((SubLObject)$ic169$, (SubLObject)ConsesLow.listS((SubLObject)$ic179$, var7, (SubLObject)$ic181$))), (SubLObject)ConsesLow.list((SubLObject)$ic182$, var7, (SubLObject)ConsesLow.listS((SubLObject)$ic183$, var7, (SubLObject)$ic190$)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9307(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic191$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic192$, var5, ConsesLow.append(var6, (SubLObject)NIL));
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9309() {
        $g1663$ = SubLFiles.defparameter("S#11612", (SubLObject)$ic22$);
        $g1664$ = SubLFiles.defparameter("S#11613", (SubLObject)NIL);
        $g1598$ = SubLFiles.defparameter("S#11614", (SubLObject)NIL);
        $g1665$ = SubLFiles.defparameter("S#11615", (SubLObject)NIL);
        $g1666$ = SubLFiles.defparameter("S#11616", (SubLObject)$ic34$);
        $g1667$ = SubLFiles.defparameter("S#11617", (SubLObject)NIL);
        $g1668$ = SubLFiles.defparameter("S#11618", (SubLObject)NIL);
        $g1669$ = SubLFiles.defparameter("S#11619", (SubLObject)NIL);
        $g1670$ = SubLFiles.defparameter("S#11620", (SubLObject)NIL);
        $g1671$ = SubLFiles.defparameter("S#11621", (SubLObject)NIL);
        $g1672$ = SubLFiles.defparameter("S#11622", (SubLObject)NIL);
        $g1673$ = SubLFiles.defparameter("S#11623", (SubLObject)NIL);
        $g1674$ = SubLFiles.defparameter("S#11624", (SubLObject)NIL);
        $g1675$ = SubLFiles.deflexical("S#11625", (SubLObject)$ic73$);
        $g1676$ = SubLFiles.deflexical("S#11626", (SubLObject)$ic74$);
        $g1677$ = SubLFiles.defparameter("S#11627", (SubLObject)NIL);
        $g1678$ = SubLFiles.defparameter("S#11628", (SubLObject)NIL);
        $g1679$ = SubLFiles.defparameter("S#11629", (SubLObject)NIL);
        $g1680$ = SubLFiles.defparameter("S#11630", (SubLObject)NIL);
        $g1681$ = SubLFiles.defparameter("S#11631", (SubLObject)NIL);
        $g1682$ = SubLFiles.defparameter("S#11632", (SubLObject)NIL);
        $g1683$ = SubLFiles.defparameter("S#11633", (SubLObject)NIL);
        $g1684$ = SubLFiles.defparameter("S#11634", (SubLObject)NIL);
        $g1685$ = SubLFiles.defparameter("S#11635", (SubLObject)NIL);
        $g1686$ = SubLFiles.defparameter("S#11636", (SubLObject)NIL);
        $g1687$ = SubLFiles.defparameter("S#11637", (SubLObject)NIL);
        $g1688$ = SubLFiles.defparameter("S#11638", (SubLObject)NIL);
        $g1689$ = SubLFiles.defparameter("S#11639", (SubLObject)NIL);
        $g1690$ = SubLFiles.defparameter("S#11640", (SubLObject)NIL);
        $g1691$ = SubLFiles.defparameter("S#11641", (SubLObject)NIL);
        $g1692$ = SubLFiles.defparameter("S#11642", (SubLObject)NIL);
        $g1693$ = SubLFiles.defparameter("S#11643", (SubLObject)NIL);
        $g1694$ = SubLFiles.defparameter("S#11644", (SubLObject)NIL);
        $g1695$ = SubLFiles.defparameter("S#11645", (SubLObject)$ic106$);
        $g1696$ = SubLFiles.defparameter("S#11646", (SubLObject)NIL);
        $g1697$ = SubLFiles.defparameter("S#11647", (SubLObject)NIL);
        $g1698$ = SubLFiles.defparameter("S#11648", (SubLObject)NIL);
        $g1699$ = SubLFiles.defparameter("S#11649", (SubLObject)NIL);
        $g1700$ = SubLFiles.defparameter("S#11650", (SubLObject)NIL);
        $g1701$ = SubLFiles.defparameter("S#11651", (SubLObject)NIL);
        $g1702$ = SubLFiles.defparameter("S#11652", (SubLObject)NIL);
        $g1703$ = SubLFiles.defparameter("S#11653", (SubLObject)NIL);
        $g1704$ = SubLFiles.defparameter("S#11654", (SubLObject)NIL);
        $g1705$ = SubLFiles.defparameter("S#11655", (SubLObject)NIL);
        $g1706$ = SubLFiles.defparameter("S#11656", (SubLObject)T);
        $g1707$ = SubLFiles.defparameter("S#11657", (SubLObject)NIL);
        $g1708$ = SubLFiles.defparameter("S#11658", (SubLObject)NIL);
        $g1709$ = SubLFiles.defparameter("S#11659", (SubLObject)T);
        $g1710$ = SubLFiles.defparameter("S#11660", (SubLObject)NIL);
        $g1711$ = SubLFiles.deflexical("S#11661", (SubLObject)$ic142$);
        $g1712$ = SubLFiles.deflexical("S#11662", $ic143$);
        $g1713$ = SubLFiles.deflexical("S#11663", $ic144$);
        $g1714$ = SubLFiles.defparameter("S#11664", $ic143$);
        $g1715$ = SubLFiles.defparameter("S#11665", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9310() {
        return (SubLObject)NIL;
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
        $g1663$ = null;
        $g1664$ = null;
        $g1598$ = null;
        $g1665$ = null;
        $g1666$ = null;
        $g1667$ = null;
        $g1668$ = null;
        $g1669$ = null;
        $g1670$ = null;
        $g1671$ = null;
        $g1672$ = null;
        $g1673$ = null;
        $g1674$ = null;
        $g1675$ = null;
        $g1676$ = null;
        $g1677$ = null;
        $g1678$ = null;
        $g1679$ = null;
        $g1680$ = null;
        $g1681$ = null;
        $g1682$ = null;
        $g1683$ = null;
        $g1684$ = null;
        $g1685$ = null;
        $g1686$ = null;
        $g1687$ = null;
        $g1688$ = null;
        $g1689$ = null;
        $g1690$ = null;
        $g1691$ = null;
        $g1692$ = null;
        $g1693$ = null;
        $g1694$ = null;
        $g1695$ = null;
        $g1696$ = null;
        $g1697$ = null;
        $g1698$ = null;
        $g1699$ = null;
        $g1700$ = null;
        $g1701$ = null;
        $g1702$ = null;
        $g1703$ = null;
        $g1704$ = null;
        $g1705$ = null;
        $g1706$ = null;
        $g1707$ = null;
        $g1708$ = null;
        $g1709$ = null;
        $g1710$ = null;
        $g1711$ = null;
        $g1712$ = null;
        $g1713$ = null;
        $g1714$ = null;
        $g1715$ = null;
        $ic0$ = makeSymbol("S#11303", "CYC");
        $ic1$ = makeSymbol("S#11540", "CYC");
        $ic2$ = makeSymbol("S#11546", "CYC");
        $ic3$ = makeSymbol("S#11536", "CYC");
        $ic4$ = makeSymbol("S#11538", "CYC");
        $ic5$ = makeSymbol("S#11504", "CYC");
        $ic6$ = makeSymbol("S#11248", "CYC");
        $ic7$ = makeSymbol("S#11581", "CYC");
        $ic8$ = makeSymbol("S#11520", "CYC");
        $ic9$ = makeSymbol("S#11232", "CYC");
        $ic10$ = makeSymbol("S#11521", "CYC");
        $ic11$ = makeSymbol("S#11234", "CYC");
        $ic12$ = makeSymbol("S#11582", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic14$ = makeSymbol("S#11611", "CYC");
        $ic15$ = makeSymbol("S#11609", "CYC");
        $ic16$ = makeSymbol("S#11453", "CYC");
        $ic17$ = makeSymbol("S#11451", "CYC");
        $ic18$ = makeSymbol("S#11454", "CYC");
        $ic19$ = makeSymbol("S#11610", "CYC");
        $ic20$ = makeSymbol("S#11455", "CYC");
        $ic21$ = makeSymbol("S#11456", "CYC");
        $ic22$ = ConsesLow.list((SubLObject)makeKeyword("CLOSURE"), (SubLObject)makeKeyword("BOOLEAN"), (SubLObject)makeKeyword("WHAT-MTS"));
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic24$ = makeSymbol("CLET");
        $ic25$ = makeSymbol("S#11613", "CYC");
        $ic26$ = makeSymbol("S#11467", "CYC");
        $ic27$ = makeKeyword("CLOSURE");
        $ic28$ = makeKeyword("BOOLEAN");
        $ic29$ = makeKeyword("WHAT-MTS");
        $ic30$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11614", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11632", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11631", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11666", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#11667", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#11668", "CYC")))));
        $ic31$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11614", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11632", "CYC"), (SubLObject)NIL));
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#11669", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic33$ = makeSymbol("S#11615", "CYC");
        $ic34$ = makeKeyword("OLD");
        $ic35$ = makeSymbol("S#11616", "CYC");
        $ic36$ = makeSymbol("PIF");
        $ic37$ = makeSymbol("S#11669", "CYC");
        $ic38$ = makeSymbol("PROGN");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11616", "CYC"), (SubLObject)makeKeyword("ASSERTION")));
        $ic40$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11616", "CYC"), (SubLObject)makeKeyword("VERBOSE")));
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11616", "CYC"), (SubLObject)makeKeyword("OLD")));
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11617", "CYC"), (SubLObject)NIL));
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11618", "CYC"), (SubLObject)NIL));
        $ic44$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11619", "CYC"), (SubLObject)T));
        $ic45$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11619", "CYC"), (SubLObject)NIL));
        $ic46$ = makeString("get-sbhl-search-module: *sbhl-search-module* is unexpectedly null.");
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic48$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("negationInverse"));
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("negationPreds"));
        $ic51$ = ConsesLow.list((SubLObject)makeSymbol("S#205", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic52$ = makeSymbol("S#11620", "CYC");
        $ic53$ = makeSymbol("S#11621", "CYC");
        $ic54$ = makeSymbol("S#11670", "CYC");
        $ic55$ = makeSymbol("S#11622", "CYC");
        $ic56$ = makeSymbol("S#11671", "CYC");
        $ic57$ = makeSymbol("S#11176", "CYC");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11624", "CYC"), (SubLObject)NIL));
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("S#4785", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic60$ = makeSymbol("S#11624", "CYC");
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11624", "CYC"), (SubLObject)T));
        $ic62$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11624", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11511", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CNOT"), (SubLObject)makeSymbol("S#11624", "CYC")), (SubLObject)makeSymbol("S#11624", "CYC"))));
        $ic63$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11624", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11512", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CNOT"), (SubLObject)makeSymbol("S#11624", "CYC")), (SubLObject)makeSymbol("S#11624", "CYC"))));
        $ic64$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11624", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)EQL, (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11101", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11495", "CYC"))), constant_handles_oc.f8479((SubLObject)makeString("negationInverse"))), (SubLObject)T, (SubLObject)makeSymbol("S#11624", "CYC"))));
        $ic65$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11624", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CNOT"), (SubLObject)makeSymbol("S#11624", "CYC"))));
        $ic66$ = ConsesLow.list((SubLObject)makeSymbol("S#11672", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic67$ = makeUninternedSymbol("US#34A80D6");
        $ic68$ = ConsesLow.list((SubLObject)makeSymbol("S#11449", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11495", "CYC")));
        $ic69$ = makeSymbol("CDOLIST");
        $ic70$ = makeSymbol("S#11623", "CYC");
        $ic71$ = makeSymbol("S#11102", "CYC");
        $ic72$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")));
        $ic73$ = makeKeyword("FORWARD");
        $ic74$ = makeKeyword("BACKWARD");
        $ic75$ = ConsesLow.list((SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic76$ = makeSymbol("S#11627", "CYC");
        $ic77$ = makeSymbol("S#11519", "CYC");
        $ic78$ = ConsesLow.list((SubLObject)makeSymbol("S#11515", "CYC"));
        $ic79$ = ConsesLow.list((SubLObject)makeSymbol("S#11517", "CYC"));
        $ic80$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11629", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)EQ, (SubLObject)makeSymbol("S#11627", "CYC"), (SubLObject)makeKeyword("FORWARD")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11673", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11102", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11674", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11102", "CYC"))))));
        $ic81$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic82$ = makeSymbol("S#11630", "CYC");
        $ic83$ = makeSymbol("S#11631", "CYC");
        $ic84$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11632", "CYC"), (SubLObject)T));
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11632", "CYC"), (SubLObject)NIL));
        $ic86$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11633", "CYC"), (SubLObject)NIL));
        $ic87$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11633", "CYC"), (SubLObject)makeSymbol("S#11633", "CYC")));
        $ic88$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11634", "CYC"), (SubLObject)NIL));
        $ic89$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11635", "CYC"), (SubLObject)NIL));
        $ic90$ = makeKeyword("GOAL");
        $ic91$ = makeKeyword("CUTOFF");
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11636", "CYC"), (SubLObject)NIL));
        $ic93$ = ConsesLow.list((SubLObject)makeSymbol("S#9182", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic94$ = makeSymbol("S#11637", "CYC");
        $ic95$ = makeSymbol("S#11638", "CYC");
        $ic96$ = ConsesLow.list((SubLObject)makeSymbol("S#2953", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic97$ = makeSymbol("S#11640", "CYC");
        $ic98$ = ConsesLow.list((SubLObject)makeSymbol("S#761", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic99$ = ConsesLow.list((SubLObject)makeSymbol("S#11641", "CYC"));
        $ic100$ = makeSymbol("CUNWIND-PROTECT");
        $ic101$ = makeSymbol("CSETQ");
        $ic102$ = ConsesLow.list((SubLObject)makeSymbol("S#11642", "CYC"));
        $ic103$ = ConsesLow.list((SubLObject)makeSymbol("S#11675", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic104$ = makeSymbol("S#11643", "CYC");
        $ic105$ = makeSymbol("S#11644", "CYC");
        $ic106$ = makeSymbol("NCONC");
        $ic107$ = makeSymbol("S#11645", "CYC");
        $ic108$ = makeSymbol("S#11646", "CYC");
        $ic109$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11647", "CYC"), (SubLObject)NIL));
        $ic110$ = makeSymbol("S#11648", "CYC");
        $ic111$ = ConsesLow.list((SubLObject)makeSymbol("S#202", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic112$ = makeSymbol("S#11649", "CYC");
        $ic113$ = ConsesLow.list((SubLObject)makeSymbol("S#11676", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic114$ = makeSymbol("S#11650", "CYC");
        $ic115$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11651", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4669", "CYC"))));
        $ic116$ = makeUninternedSymbol("US#356AA47");
        $ic117$ = makeSymbol("S#4670", "CYC");
        $ic118$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4669", "CYC")));
        $ic119$ = makeSymbol("S#11652", "CYC");
        $ic120$ = makeSymbol("LIST");
        $ic121$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11392", "CYC"), (SubLObject)makeSymbol("S#11677", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic122$ = makeUninternedSymbol("US#356AA47");
        $ic123$ = makeSymbol("WHILE");
        $ic124$ = makeSymbol("CAND");
        $ic125$ = makeSymbol("CNOT");
        $ic126$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FIRST"), (SubLObject)makeSymbol("S#11652", "CYC")));
        $ic127$ = makeSymbol("FIRST");
        $ic128$ = makeSymbol("S#5503", "CYC");
        $ic129$ = makeSymbol("S#11572", "CYC");
        $ic130$ = makeSymbol("RPLACD");
        $ic131$ = ConsesLow.list((SubLObject)makeSymbol("LAST"), (SubLObject)makeSymbol("S#11652", "CYC"));
        $ic132$ = ConsesLow.list((SubLObject)makeSymbol("S#11651", "CYC"));
        $ic133$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#11652", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CDR"), (SubLObject)makeSymbol("S#11652", "CYC"))));
        $ic134$ = makeSymbol("S#4671", "CYC");
        $ic135$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#11652", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("REMOVE-IF"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#4672", "CYC")), (SubLObject)makeSymbol("S#11652", "CYC"))));
        $ic136$ = makeSymbol("S#11653", "CYC");
        $ic137$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11654", "CYC"), (SubLObject)T));
        $ic138$ = ConsesLow.list((SubLObject)makeSymbol("S#10878", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic139$ = makeSymbol("S#11655", "CYC");
        $ic140$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11660", "CYC"), constant_handles_oc.f8479((SubLObject)makeString("True-JustificationTruth"))));
        $ic141$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11660", "CYC"), constant_handles_oc.f8479((SubLObject)makeString("False-JustificationTruth"))));
        $ic142$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MonotonicallyTrue")), constant_handles_oc.f8479((SubLObject)makeString("DefaultTrue")), constant_handles_oc.f8479((SubLObject)makeString("MonotonicallyFalse")), constant_handles_oc.f8479((SubLObject)makeString("DefaultFalse")), constant_handles_oc.f8479((SubLObject)makeString("True-JustificationTruth")), constant_handles_oc.f8479((SubLObject)makeString("False-JustificationTruth")), constant_handles_oc.f8479((SubLObject)makeString("ArbitraryTruth-JustificationTruth")));
        $ic143$ = constant_handles_oc.f8479((SubLObject)makeString("True-JustificationTruth"));
        $ic144$ = constant_handles_oc.f8479((SubLObject)makeString("False-JustificationTruth"));
        $ic145$ = constant_handles_oc.f8479((SubLObject)makeString("MonotonicallyTrue"));
        $ic146$ = constant_handles_oc.f8479((SubLObject)makeString("DefaultTrue"));
        $ic147$ = constant_handles_oc.f8479((SubLObject)makeString("ArbitraryTruth-JustifactionTruth"));
        $ic148$ = constant_handles_oc.f8479((SubLObject)makeString("ArbitraryTruth-JustificationTruth"));
        $ic149$ = constant_handles_oc.f8479((SubLObject)makeString("MonotonicallyFalse"));
        $ic150$ = constant_handles_oc.f8479((SubLObject)makeString("DefaultFalse"));
        $ic151$ = constant_handles_oc.f8479((SubLObject)makeString("JustifactionTruth"));
        $ic152$ = constant_handles_oc.f8479((SubLObject)makeString("Unknown-JustificationTruth"));
        $ic153$ = makeKeyword("ERROR");
        $ic154$ = makeString("~A is not a ~A");
        $ic155$ = makeSymbol("S#11585", "CYC");
        $ic156$ = makeKeyword("CERROR");
        $ic157$ = makeString("continue anyway");
        $ic158$ = makeKeyword("WARN");
        $ic159$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic160$ = makeString("Expected true or false sbhl truth value. tv: ~a~%");
        $ic161$ = makeKeyword("TRUE");
        $ic162$ = makeKeyword("FALSE");
        $ic163$ = makeString("unknown truth value for translation: ~a");
        $ic164$ = makeKeyword("TRUE-MON");
        $ic165$ = makeKeyword("TRUE-DEF");
        $ic166$ = makeKeyword("FALSE-MON");
        $ic167$ = makeKeyword("FALSE-DEF");
        $ic168$ = makeString("Cannot translate ~s truth to an sbhl-tv");
        $ic169$ = makeSymbol("S#11665", "CYC");
        $ic170$ = ConsesLow.list((SubLObject)makeSymbol("S#11678", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic171$ = makeSymbol("S#11664", "CYC");
        $ic172$ = makeSymbol("S#11603", "CYC");
        $ic173$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#11589", "CYC"));
        $ic174$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#11450", "CYC"));
        $ic175$ = makeSymbol("S#11604", "CYC");
        $ic176$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#11679", "CYC"));
        $ic177$ = ConsesLow.list((SubLObject)makeSymbol("S#10995", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic178$ = makeUninternedSymbol("US#34E0056");
        $ic179$ = makeSymbol("FIF");
        $ic180$ = ConsesLow.list((SubLObject)makeSymbol("S#11664", "CYC"));
        $ic181$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#11450", "CYC")), (SubLObject)makeSymbol("S#11665", "CYC"));
        $ic182$ = makeSymbol("PWHEN");
        $ic183$ = makeSymbol("S#11077", "CYC");
        $ic184$ = ConsesLow.list((SubLObject)makeSymbol("S#11585", "CYC"));
        $ic185$ = makeUninternedSymbol("US#34E0056");
        $ic186$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11586", "CYC")));
        $ic187$ = ConsesLow.list((SubLObject)makeSymbol("S#11592", "CYC"));
        $ic188$ = makeUninternedSymbol("US#34E0056");
        $ic189$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11587", "CYC")));
        $ic190$ = ConsesLow.list((SubLObject)makeSymbol("S#11593", "CYC"));
        $ic191$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic192$ = makeSymbol("S#11680", "CYC");
    }
    
    public static final class $f9288$UnaryFunction extends UnaryFunction
    {
        public $f9288$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#11450"));
        }
        
        public SubLObject processItem(final SubLObject var180) {
            return f9288(var180);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 447 ms
	
	Decompiled with Procyon 0.5.32.
*/