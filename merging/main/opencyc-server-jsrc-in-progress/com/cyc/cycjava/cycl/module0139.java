package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0139 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0139";
    public static final String myFingerPrint = "5cd398b4621b089fe71541e1934e15aafe9acf41368518cd515d8ffc41e37b54";
    public static SubLSymbol $g1629$;
    public static SubLSymbol $g1630$;
    public static SubLSymbol $g1631$;
    public static SubLSymbol $g1632$;
    private static SubLSymbol $g1633$;
    private static SubLSymbol $g1634$;
    public static SubLSymbol $g1635$;
    public static SubLSymbol $g1636$;
    public static SubLSymbol $g1637$;
    public static SubLSymbol $g1638$;
    public static SubLSymbol $g1639$;
    public static SubLSymbol $g1640$;
    public static SubLSymbol $g1641$;
    public static SubLSymbol $g1642$;
    public static SubLSymbol $g1643$;
    public static SubLSymbol $g1644$;
    public static SubLSymbol $g1645$;
    public static SubLSymbol $g1646$;
    public static SubLSymbol $g1647$;
    public static SubLSymbol $g1648$;
    public static SubLSymbol $g1649$;
    public static SubLSymbol $g1650$;
    public static SubLSymbol $g1651$;
    public static SubLSymbol $g1652$;
    public static SubLSymbol $g1653$;
    public static SubLSymbol $g1654$;
    public static SubLSymbol $g1655$;
    public static SubLSymbol $g1656$;
    public static SubLSymbol $g1657$;
    public static SubLSymbol $g1658$;
    public static SubLSymbol $g1659$;
    public static SubLSymbol $g1660$;
    private static final SubLInteger $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLList $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLList $ic72$;
    private static final SubLList $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLList $ic87$;
    private static final SubLList $ic88$;
    private static final SubLList $ic89$;
    private static final SubLList $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLList $ic94$;
    private static final SubLList $ic95$;
    private static final SubLList $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLList $ic112$;
    private static final SubLSymbol $ic113$;
    
    public static SubLObject f9005(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        return (SubLObject)$ic0$;
    }
    
    public static SubLObject f9006(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        return (SubLObject)$ic1$;
    }
    
    public static SubLObject f9007() {
        if (NIL != f9008()) {
            return f9009();
        }
        return f9010();
    }
    
    public static SubLObject f9011(final SubLObject var2) {
        if (NIL != f9008()) {
            f9012(var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9010() {
        if (NIL != module0141.f9215()) {
            return Hashtables.make_hash_table(f9005((SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        if (NIL != module0141.f9216()) {
            return Hashtables.make_hash_table(f9006((SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        return Hashtables.make_hash_table(f9005((SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f9013(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic2$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list(reader.bq_cons(var7, (SubLObject)$ic4$)), ConsesLow.append(var8, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic5$, var7))));
    }
    
    public static SubLObject f9008() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return $g1630$.getDynamicValue(var8);
    }
    
    public static SubLObject f9014(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic6$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        final SubLObject var9 = (SubLObject)$ic7$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.listS(reader.bq_cons(var9, (SubLObject)$ic8$), (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)$ic10$, var9, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var9)), (SubLObject)$ic13$), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9015(final SubLObject var13, final SubLObject var11) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (NIL != var13) {
            return Numbers.max($g1631$.getDynamicValue(var14), var11);
        }
        return var11;
    }
    
    public static SubLObject f9016(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (NIL != var13) {
            return $g1632$.getDynamicValue(var14);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9017(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic15$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9018(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic16$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic17$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9019(SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = (SubLObject)((NIL != var11) ? var11 : ZERO_INTEGER);
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = $g1634$.currentBinding(var12);
        try {
            $g1634$.bind((SubLObject)T, var12);
            SubLObject var16;
            for (var16 = (SubLObject)NIL, var16 = (SubLObject)ZERO_INTEGER; var16.numL(var13); var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER)) {
                var14 = (SubLObject)ConsesLow.cons(f9010(), var14);
            }
        }
        finally {
            $g1634$.rebind(var15, var12);
        }
        return Sequences.nreverse(var14);
    }
    
    public static SubLObject f9020() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return $g1632$.getDynamicValue(var8);
    }
    
    public static SubLObject f9021(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic18$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)$ic11$, var7), (SubLObject)$ic19$), ConsesLow.append(var8, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic20$, var7, (SubLObject)$ic21$))));
    }
    
    public static SubLObject f9022(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic22$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var6;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var31_32 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var5, (SubLObject)$ic22$);
            var31_32 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var5, (SubLObject)$ic22$);
            if (NIL == conses_high.member(var31_32, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var31_32 == $ic24$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic22$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var6);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var6 = (var13 = var7);
        final SubLObject var14 = (SubLObject)$ic26$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.list((SubLObject)$ic27$, var12))), (SubLObject)ConsesLow.listS((SubLObject)$ic28$, var14, ConsesLow.append(var13, (SubLObject)NIL)));
    }
    
    public static SubLObject f9023(final SubLObject var34) {
        final SubLObject var35 = Sequences.length(var34);
        if (var35.eql((SubLObject)ZERO_INTEGER)) {
            return $g1633$.getGlobalValue();
        }
        return var35;
    }
    
    public static SubLObject f9009() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)NIL;
        var9 = $g1632$.getDynamicValue(var8).first();
        if (NIL != var9) {
            if (NIL != $g1629$.getDynamicValue(var8) && NIL == module0030.f1594(var9)) {
                Errors.warn((SubLObject)$ic30$, var9);
            }
            $g1632$.setDynamicValue($g1632$.getDynamicValue(var8).rest(), var8);
        }
        else {
            var9 = f9010();
        }
        return var9;
    }
    
    public static SubLObject f9012(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0035.f2000($g1632$.getDynamicValue(var3), $g1631$.getDynamicValue(var3), (SubLObject)UNPROVIDED)) {
            if (NIL != $g1629$.getDynamicValue(var3)) {
                Errors.warn((SubLObject)$ic31$, $g1631$.getDynamicValue(var3));
            }
        }
        else {
            module0249.f16088(var2);
            $g1632$.setDynamicValue((SubLObject)ConsesLow.cons(var2, $g1632$.getDynamicValue(var3)), var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9024() {
        $g1632$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9025(final SubLObject var2) {
        return Types.hash_table_p(var2);
    }
    
    public static SubLObject f9026() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return $g1635$.getDynamicValue(var8);
    }
    
    public static SubLObject f9027() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return $g1636$.getDynamicValue(var8);
    }
    
    public static SubLObject f9028(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic32$, (SubLObject)$ic33$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9029(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic34$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)ConsesLow.listS((SubLObject)$ic36$, var7, ConsesLow.append(var8, (SubLObject)NIL)));
    }
    
    public static SubLObject f9030(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic32$, (SubLObject)$ic37$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9031(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)$ic35$, reader.bq_cons((SubLObject)$ic38$, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f9032(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)$ic39$, reader.bq_cons((SubLObject)$ic40$, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f9033(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)$ic35$, reader.bq_cons((SubLObject)$ic40$, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f9034(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        final SubLObject var8 = (SubLObject)$ic41$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list(reader.bq_cons(var8, (SubLObject)$ic42$)), (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list((SubLObject)$ic33$, var8), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var8), ConsesLow.append(var7, (SubLObject)NIL))));
    }
    
    public static SubLObject f9035(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic45$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic45$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic45$);
        var9 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var10;
            var6 = (var10 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)$ic46$, (SubLObject)ConsesLow.listS((SubLObject)EQ, var9, (SubLObject)$ic47$), var8, (SubLObject)ConsesLow.list((SubLObject)$ic48$, var9)))), ConsesLow.append(var10, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic49$, (SubLObject)ConsesLow.listS((SubLObject)EQ, var9, (SubLObject)$ic50$), (SubLObject)ConsesLow.list((SubLObject)$ic51$, var8)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic45$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9036() {
        if (NIL != f9037()) {
            return (SubLObject)$ic53$;
        }
        if (NIL != f9008()) {
            return (SubLObject)$ic54$;
        }
        return (SubLObject)$ic55$;
    }
    
    public static SubLObject f9038(final SubLObject var51) {
        if (var51.eql((SubLObject)$ic54$)) {
            return f9009();
        }
        return f9010();
    }
    
    public static SubLObject f9039(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic56$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list(reader.bq_cons(var7, (SubLObject)$ic57$)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9040(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic56$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list(reader.bq_cons(var7, (SubLObject)$ic58$)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9041(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic56$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic33$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9042(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic56$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic37$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9043(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic59$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic59$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic59$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic59$);
        var10 = var6.first();
        var6 = var6.rest();
        final SubLObject var11 = (SubLObject)(var6.isCons() ? var6.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)$ic59$);
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var12;
            var6 = (var12 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic60$, (SubLObject)ConsesLow.list(var8, var9, var10, (SubLObject)$ic61$, var11), ConsesLow.append(var12, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic59$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9044(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic62$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic62$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic63$;
            final SubLObject var10 = (SubLObject)$ic64$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic65$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic66$, var8), (SubLObject)ConsesLow.list((SubLObject)$ic67$, (SubLObject)ConsesLow.list(var9, var10, var8), (SubLObject)ConsesLow.list((SubLObject)$ic68$, var10), (SubLObject)ConsesLow.list((SubLObject)$ic69$, var7, var9))), (SubLObject)ConsesLow.list((SubLObject)T, (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)THREE_INTEGER, (SubLObject)$ic71$, var8)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic62$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9037() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return $g1644$.getDynamicValue(var8);
    }
    
    public static SubLObject f9045(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic72$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9046(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic73$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9047() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return $g1645$.getDynamicValue(var8);
    }
    
    public static SubLObject f9048(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic2$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic74$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9049(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)$ic75$, (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic76$, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f9050(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)$ic32$, (SubLObject)$ic77$, (SubLObject)ConsesLow.listS((SubLObject)$ic32$, (SubLObject)$ic78$, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f9051(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic32$, (SubLObject)$ic77$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9052(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic32$, (SubLObject)$ic78$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9053(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic76$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9054(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic79$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9055(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)$ic80$, reader.bq_cons((SubLObject)$ic81$, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f9056(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic82$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic77$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9057() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        module0249.f16088($g1646$.getDynamicValue(var8));
        module0249.f16088($g1647$.getDynamicValue(var8));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9058() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        module0249.f16088($g1646$.getDynamicValue(var8));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9059() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return $g1648$.getDynamicValue(var8);
    }
    
    public static SubLObject f9060(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic2$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic83$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9061(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic84$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9062(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic2$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic85$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9063(final SubLObject var106) {
        return Equality.eql(var106, $g1650$.getGlobalValue());
    }
    
    public static SubLObject f9064(final SubLObject var106) {
        return Equality.eql(var106, $g1651$.getGlobalValue());
    }
    
    public static SubLObject f9065(final SubLObject var106) {
        return (SubLObject)makeBoolean(var106.eql($g1652$.getGlobalValue()) || var106.eql($g1653$.getGlobalValue()));
    }
    
    public static SubLObject f9066(final SubLObject var106) {
        if (NIL != f9063(var106)) {
            return $g1651$.getGlobalValue();
        }
        if (NIL != f9064(var106)) {
            return $g1650$.getGlobalValue();
        }
        return var106;
    }
    
    public static SubLObject f9067() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        $g1654$.setDynamicValue(Numbers.add($g1654$.getDynamicValue(var8), (SubLObject)ONE_INTEGER), var8);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9068() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return $g1654$.getDynamicValue(var8);
    }
    
    public static SubLObject f9069(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic90$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9070() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return $g1655$.getDynamicValue(var8);
    }
    
    public static SubLObject f9071(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic2$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic91$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9072(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic2$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic92$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9073(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic93$, reader.bq_cons((SubLObject)$ic40$, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f9074(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)$ic75$, (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic94$, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f9075(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic2$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)$ic91$, var7), (SubLObject)$ic95$), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9076(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic2$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)$ic92$, var7), (SubLObject)$ic95$), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9077() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return $g1658$.getDynamicValue(var8);
    }
    
    public static SubLObject f9078(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic96$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9079(final SubLObject var123) {
        return Types.hash_table_p(var123);
    }
    
    public static SubLObject f9080(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic32$, (SubLObject)$ic98$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9081(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic56$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list(reader.bq_cons(var7, (SubLObject)$ic99$)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9082(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic34$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        final SubLObject var9 = (SubLObject)$ic100$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list(reader.bq_cons(var9, (SubLObject)$ic101$)), (SubLObject)ConsesLow.list((SubLObject)$ic102$, (SubLObject)ConsesLow.list((SubLObject)$ic103$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var7, (SubLObject)ConsesLow.listS((SubLObject)$ic105$, var9, ConsesLow.append(var8, (SubLObject)NIL))))));
    }
    
    public static SubLObject f9083(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic56$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic98$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9084(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic106$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic106$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic106$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic106$);
        var10 = var6.first();
        var6 = var6.rest();
        final SubLObject var11 = (SubLObject)(var6.isCons() ? var6.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)$ic106$);
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var12;
            var6 = (var12 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic60$, (SubLObject)ConsesLow.list(var8, var9, var10, (SubLObject)$ic61$, var11), ConsesLow.append(var12, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic106$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9085(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic107$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic107$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic108$;
            final SubLObject var10 = (SubLObject)$ic109$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic65$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic66$, var8), (SubLObject)ConsesLow.list((SubLObject)$ic67$, (SubLObject)ConsesLow.list(var9, var10, var8), (SubLObject)ConsesLow.list((SubLObject)$ic68$, var10), (SubLObject)ConsesLow.list((SubLObject)$ic69$, var7, var9))), (SubLObject)ConsesLow.list((SubLObject)T, (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)THREE_INTEGER, (SubLObject)$ic110$, var8)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9086(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic111$, (SubLObject)$ic98$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9087() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return $g1660$.getDynamicValue(var8);
    }
    
    public static SubLObject f9088(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic112$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic113$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9089() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9005", "S#11274", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9006", "S#11275", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9007", "S#11276", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9011", "S#11277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9010", "S#11278", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9013", "S#11279");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9008", "S#11280", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9014", "S#11281");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9015", "S#11282", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9016", "S#11283", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9017", "S#11284");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9018", "S#11285");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9019", "S#11286", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9020", "S#11287", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9021", "S#11288");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9022", "S#11289");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9023", "S#11290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9009", "S#11291", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9012", "S#11292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9024", "S#11293", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9025", "S#11294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9026", "S#11295", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9027", "S#11296", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9028", "S#11297");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9029", "S#11298");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9030", "S#11299");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9031", "S#11300");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9032", "S#11301");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9033", "S#11302");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9034", "S#11303");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9035", "S#11304");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9036", "S#11305", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9038", "S#11306", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9039", "S#11307");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9040", "S#11308");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9041", "S#11309");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9042", "S#11310");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9043", "S#11311");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9044", "S#11312");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9037", "S#11313", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9045", "S#11314");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9046", "S#11315");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9047", "S#11316", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9048", "S#11317");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9049", "S#11318");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9050", "S#11319");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9051", "S#11320");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9052", "S#11321");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9053", "S#11322");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9054", "S#11323");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9055", "S#11324");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9056", "S#11325");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9057", "S#11326", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9058", "S#11327", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9059", "S#11328", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9060", "S#11329");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9061", "S#11330");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9062", "S#11331");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9063", "S#11332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9064", "S#11333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9065", "S#11334", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9066", "S#11335", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9067", "S#11336", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9068", "S#11337", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9069", "S#11338");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9070", "S#11339", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9071", "S#11340");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9072", "S#11341");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9073", "S#11342");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9074", "S#11343");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9075", "S#11344");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9076", "S#11345");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9077", "S#11346", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9078", "S#11347");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9079", "S#11348", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9080", "S#11349");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9081", "S#11350");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9082", "S#11351");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9083", "S#11352");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9084", "S#11353");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9085", "S#11354");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9086", "S#11355");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0139", "f9087", "S#11356", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0139", "f9088", "S#11357");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9090() {
        $g1629$ = SubLFiles.defparameter("S#11358", (SubLObject)NIL);
        $g1630$ = SubLFiles.defparameter("S#11359", (SubLObject)NIL);
        $g1631$ = SubLFiles.defparameter("S#11360", (SubLObject)NIL);
        $g1632$ = SubLFiles.defparameter("S#11361", (SubLObject)NIL);
        $g1633$ = SubLFiles.deflexical("S#11362", (SubLObject)FOUR_INTEGER);
        $g1634$ = SubLFiles.defparameter("S#11363", (SubLObject)NIL);
        $g1635$ = SubLFiles.defparameter("S#11364", (SubLObject)NIL);
        $g1636$ = SubLFiles.defparameter("S#11365", (SubLObject)NIL);
        $g1637$ = SubLFiles.defparameter("S#11366", (SubLObject)NIL);
        $g1638$ = SubLFiles.defparameter("S#11367", (SubLObject)NIL);
        $g1639$ = SubLFiles.defparameter("S#11368", (SubLObject)NIL);
        $g1640$ = SubLFiles.defparameter("S#11369", (SubLObject)NIL);
        $g1641$ = SubLFiles.defparameter("S#11370", (SubLObject)NIL);
        $g1642$ = SubLFiles.defparameter("S#11371", (SubLObject)NIL);
        $g1643$ = SubLFiles.defparameter("S#11372", (SubLObject)NIL);
        $g1644$ = SubLFiles.defparameter("S#11373", (SubLObject)NIL);
        $g1645$ = SubLFiles.defparameter("S#11374", (SubLObject)NIL);
        $g1646$ = SubLFiles.defparameter("S#11375", (SubLObject)NIL);
        $g1647$ = SubLFiles.defparameter("S#11376", (SubLObject)NIL);
        $g1648$ = SubLFiles.defparameter("S#11377", (SubLObject)NIL);
        $g1649$ = SubLFiles.defparameter("S#11378", (SubLObject)NIL);
        $g1650$ = SubLFiles.deflexical("S#11379", (SubLObject)$ic86$);
        $g1651$ = SubLFiles.deflexical("S#11380", (SubLObject)$ic87$);
        $g1652$ = SubLFiles.deflexical("S#11381", (SubLObject)$ic88$);
        $g1653$ = SubLFiles.deflexical("S#11382", (SubLObject)$ic89$);
        $g1654$ = SubLFiles.defparameter("S#11383", (SubLObject)NIL);
        $g1655$ = SubLFiles.defparameter("S#11384", (SubLObject)NIL);
        $g1656$ = SubLFiles.defparameter("S#11385", (SubLObject)NIL);
        $g1657$ = SubLFiles.defparameter("S#11386", (SubLObject)NIL);
        $g1658$ = SubLFiles.defparameter("S#11387", (SubLObject)NIL);
        $g1659$ = SubLFiles.defparameter("S#11388", (SubLObject)$ic97$);
        $g1660$ = SubLFiles.defparameter("S#11389", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9091() {
        module0002.f50((SubLObject)$ic10$, (SubLObject)$ic14$);
        module0002.f50((SubLObject)$ic12$, (SubLObject)$ic14$);
        module0002.f50((SubLObject)$ic29$, (SubLObject)NIL);
        module0002.f50((SubLObject)$ic43$, (SubLObject)$ic44$);
        module0002.f50((SubLObject)$ic52$, (SubLObject)$ic44$);
        module0002.f50((SubLObject)$ic48$, (SubLObject)$ic44$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f9089();
    }
    
    public void initializeVariables() {
        f9090();
    }
    
    public void runTopLevelForms() {
        f9091();
    }
    
    static {
        me = (SubLFile)new module0139();
        $g1629$ = null;
        $g1630$ = null;
        $g1631$ = null;
        $g1632$ = null;
        $g1633$ = null;
        $g1634$ = null;
        $g1635$ = null;
        $g1636$ = null;
        $g1637$ = null;
        $g1638$ = null;
        $g1639$ = null;
        $g1640$ = null;
        $g1641$ = null;
        $g1642$ = null;
        $g1643$ = null;
        $g1644$ = null;
        $g1645$ = null;
        $g1646$ = null;
        $g1647$ = null;
        $g1648$ = null;
        $g1649$ = null;
        $g1650$ = null;
        $g1651$ = null;
        $g1652$ = null;
        $g1653$ = null;
        $g1654$ = null;
        $g1655$ = null;
        $g1656$ = null;
        $g1657$ = null;
        $g1658$ = null;
        $g1659$ = null;
        $g1660$ = null;
        $ic0$ = makeInteger(100);
        $ic1$ = makeInteger(3000);
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("SPACE"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic3$ = makeSymbol("CLET");
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11276", "CYC")));
        $ic5$ = makeSymbol("S#11277", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#1993", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic7$ = makeUninternedSymbol("US#56C5140");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("S#11359", "CYC"));
        $ic9$ = makeSymbol("S#11360", "CYC");
        $ic10$ = makeSymbol("S#11282", "CYC");
        $ic11$ = makeSymbol("S#11361", "CYC");
        $ic12$ = makeSymbol("S#11283", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11359", "CYC"), (SubLObject)T));
        $ic14$ = makeSymbol("S#11281", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11359", "CYC"), (SubLObject)NIL));
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#11390", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic17$ = makeSymbol("S#11359", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("S#11391", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic19$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11359", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11360", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11290", "CYC"), (SubLObject)makeSymbol("S#11361", "CYC"))));
        $ic20$ = makeSymbol("CSETQ");
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("S#11361", "CYC"));
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#1993", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)makeKeyword("NUM"));
        $ic24$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic25$ = makeKeyword("NUM");
        $ic26$ = makeUninternedSymbol("US#86BC1D");
        $ic27$ = makeSymbol("S#11286", "CYC");
        $ic28$ = makeSymbol("S#11288", "CYC");
        $ic29$ = makeSymbol("S#11290", "CYC");
        $ic30$ = makeString("Dirty resourced marking space being reused ~A!");
        $ic31$ = makeString("Need more than the limit of ~A marking spaces.");
        $ic32$ = makeSymbol("S#11279", "CYC");
        $ic33$ = makeSymbol("S#11364", "CYC");
        $ic34$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic35$ = makeSymbol("S#11297", "CYC");
        $ic36$ = makeSymbol("S#11307", "CYC");
        $ic37$ = makeSymbol("S#11365", "CYC");
        $ic38$ = makeSymbol("S#11299", "CYC");
        $ic39$ = makeSymbol("S#11300", "CYC");
        $ic40$ = makeSymbol("S#11314", "CYC");
        $ic41$ = makeUninternedSymbol("US#32FF944");
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11305", "CYC")));
        $ic43$ = makeSymbol("S#11304", "CYC");
        $ic44$ = makeSymbol("S#11303", "CYC");
        $ic45$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("SPACE"), (SubLObject)makeSymbol("S#10134", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic46$ = makeSymbol("FIF");
        $ic47$ = ConsesLow.list((SubLObject)makeKeyword("OLD"));
        $ic48$ = makeSymbol("S#11306", "CYC");
        $ic49$ = makeSymbol("PWHEN");
        $ic50$ = ConsesLow.list((SubLObject)makeKeyword("RESOURCE"));
        $ic51$ = makeSymbol("S#11292", "CYC");
        $ic52$ = makeSymbol("S#11305", "CYC");
        $ic53$ = makeKeyword("OLD");
        $ic54$ = makeKeyword("RESOURCE");
        $ic55$ = makeKeyword("NEW");
        $ic56$ = ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic57$ = ConsesLow.list((SubLObject)makeSymbol("S#11364", "CYC"));
        $ic58$ = ConsesLow.list((SubLObject)makeSymbol("S#11365", "CYC"));
        $ic59$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11392", "CYC"), (SubLObject)makeSymbol("S#11393", "CYC"), (SubLObject)makeSymbol("S#11394", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#8587", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic60$ = makeSymbol("DO-HASH-TABLE");
        $ic61$ = makeKeyword("DONE");
        $ic62$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#11394", "CYC"));
        $ic63$ = makeUninternedSymbol("US#13E70D7");
        $ic64$ = makeUninternedSymbol("US#706A092");
        $ic65$ = makeSymbol("PCOND");
        $ic66$ = makeSymbol("HASH-TABLE-P");
        $ic67$ = makeSymbol("CDOHASH");
        $ic68$ = makeSymbol("IGNORE");
        $ic69$ = makeSymbol("FUNCALL");
        $ic70$ = makeSymbol("S#11080", "CYC");
        $ic71$ = makeString("no mapping method defiend for sbhl-space ~s");
        $ic72$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11373", "CYC"), (SubLObject)T));
        $ic73$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11373", "CYC"), (SubLObject)NIL));
        $ic74$ = makeSymbol("S#11374", "CYC");
        $ic75$ = makeSymbol("S#11319", "CYC");
        $ic76$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11364", "CYC"), (SubLObject)makeSymbol("S#11375", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11365", "CYC"), (SubLObject)makeSymbol("S#11376", "CYC")));
        $ic77$ = makeSymbol("S#11375", "CYC");
        $ic78$ = makeSymbol("S#11376", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11364", "CYC"), (SubLObject)makeSymbol("S#11375", "CYC")));
        $ic80$ = makeSymbol("S#11320", "CYC");
        $ic81$ = makeSymbol("S#11323", "CYC");
        $ic82$ = ConsesLow.list((SubLObject)makeSymbol("S#11395", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic83$ = makeSymbol("S#11377", "CYC");
        $ic84$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11364", "CYC"), (SubLObject)makeSymbol("S#11377", "CYC")));
        $ic85$ = makeSymbol("S#11378", "CYC");
        $ic86$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")));
        $ic87$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")));
        $ic88$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlInverse")));
        $ic89$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")));
        $ic90$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11383", "CYC"), (SubLObject)ZERO_INTEGER));
        $ic91$ = makeSymbol("S#11385", "CYC");
        $ic92$ = makeSymbol("S#11386", "CYC");
        $ic93$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11364", "CYC"), (SubLObject)makeSymbol("S#11385", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11365", "CYC"), (SubLObject)makeSymbol("S#11386", "CYC")));
        $ic94$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11385", "CYC"), (SubLObject)makeSymbol("S#11375", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11386", "CYC"), (SubLObject)makeSymbol("S#11376", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11384", "CYC"), (SubLObject)T));
        $ic95$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11384", "CYC"), (SubLObject)T));
        $ic96$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11387", "CYC"), (SubLObject)T));
        $ic97$ = makeString("Table used for public marking interface");
        $ic98$ = makeSymbol("S#11388", "CYC");
        $ic99$ = ConsesLow.list((SubLObject)makeSymbol("S#11388", "CYC"));
        $ic100$ = makeUninternedSymbol("US#779246A");
        $ic101$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11280", "CYC")));
        $ic102$ = makeSymbol("S#11284", "CYC");
        $ic103$ = makeSymbol("S#11349", "CYC");
        $ic104$ = makeSymbol("S#11350", "CYC");
        $ic105$ = makeSymbol("S#11285", "CYC");
        $ic106$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11392", "CYC"), (SubLObject)makeSymbol("S#11393", "CYC"), (SubLObject)makeSymbol("S#11396", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#8587", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic107$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#11396", "CYC"));
        $ic108$ = makeUninternedSymbol("US#13E70D7");
        $ic109$ = makeUninternedSymbol("US#706A092");
        $ic110$ = makeString("no mapping method defiend for sbhl-table ~s");
        $ic111$ = makeSymbol("S#11309", "CYC");
        $ic112$ = ConsesLow.list((SubLObject)makeSymbol("S#705", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic113$ = makeSymbol("S#11389", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 252 ms
	
	Decompiled with Procyon 0.5.32.
*/