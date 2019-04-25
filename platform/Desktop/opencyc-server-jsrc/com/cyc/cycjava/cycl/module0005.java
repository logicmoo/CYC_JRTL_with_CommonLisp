package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0005 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0005";
    public static final String myFingerPrint = "6f6381fff1e8da77c1e2633a7c734c133dc9e8d073c1d0ef2b4c97562ebc3ebc";
    public static SubLSymbol $g10$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
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
    private static final SubLList $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
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
    private static final SubLList $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLList $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLList $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLList $ic115$;
    private static final SubLList $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
    private static final SubLList $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLList $ic131$;
    private static final SubLList $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLList $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLList $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLList $ic141$;
    private static final SubLList $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLList $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLList $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLList $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLList $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLList $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLList $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLString $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLList $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLList $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLList $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLList $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLList $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLList $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLList $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLList $ic214$;
    private static final SubLList $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLList $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLList $ic221$;
    private static final SubLList $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLList $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLList $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLList $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLList $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLList $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLList $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLString $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLList $ic247$;
    private static final SubLList $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLList $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLList $ic255$;
    private static final SubLList $ic256$;
    private static final SubLList $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLList $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLList $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLList $ic270$;
    private static final SubLList $ic271$;
    private static final SubLSymbol $ic272$;
    private static final SubLSymbol $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLSymbol $ic277$;
    private static final SubLSymbol $ic278$;
    private static final SubLSymbol $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLList $ic284$;
    private static final SubLSymbol $ic285$;
    private static final SubLList $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLList $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLList $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLSymbol $ic292$;
    
    public static SubLObject f119(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic1$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)NIL, (SubLObject)ConsesLow.list(var5), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f120(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic1$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var5), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f121(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)T, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f122(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic7$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic7$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var18_19 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic7$);
            var18_19 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic7$);
            if (NIL == conses_high.member(var18_19, (SubLObject)$ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var18_19 == $ic9$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic7$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : ZERO_INTEGER);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic11$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic12$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : ONE_INTEGER);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18;
        var4 = (var18 = var5);
        if (ZERO_INTEGER.eql(var11) && var13.isInteger() && !var13.isNegative() && ONE_INTEGER.eql(var15) && NIL == var17) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic14$, (SubLObject)ConsesLow.list(var6, var13), ConsesLow.append(var18, (SubLObject)NIL));
        }
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        if (ONE_INTEGER.eql(var15)) {
            var20 = (SubLObject)ONE_INTEGER;
            var21 = (SubLObject)ConsesLow.list((SubLObject)$ic15$, var6);
        }
        else if (var15.isAtom()) {
            var20 = var15;
            var21 = (SubLObject)ConsesLow.list((SubLObject)$ic16$, var6, var15);
        }
        else {
            final SubLObject var24 = (SubLObject)$ic17$;
            var19 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var24, var15), var19);
            var20 = var24;
            var21 = (SubLObject)ConsesLow.list((SubLObject)$ic16$, var6, var24);
        }
        if (NIL != var13) {
            final SubLObject var25 = (SubLObject)$ic18$;
            var19 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var25, var13), var19);
            var22 = (SubLObject)ConsesLow.list((SubLObject)$ic19$, var6, var20, var25);
        }
        if (NIL != var17) {
            if (NIL != var22) {
                var22 = (SubLObject)ConsesLow.list((SubLObject)$ic20$, var17, var22);
            }
            else {
                var22 = var17;
            }
        }
        var23 = (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, var11, var21)), (SubLObject)ConsesLow.list(var22), ConsesLow.append(var18, (SubLObject)NIL));
        if (NIL != var19) {
            var23 = (SubLObject)ConsesLow.list((SubLObject)$ic21$, var19, var23);
        }
        if (NIL != var17) {
            var23 = (SubLObject)ConsesLow.list((SubLObject)$ic22$, var17, var23);
        }
        return var23;
    }
    
    public static SubLObject f123(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic23$);
            return (SubLObject)NIL;
        }
        if (!var6.isNumber()) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic27$, var5, var6, var7);
        }
        if (var6.isPositive()) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic24$, var5, var7);
        }
        if (var6.isNegative()) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic25$, var5, var7);
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic26$, var5, var7);
    }
    
    public static SubLObject f124(final SubLObject var37, final SubLObject var25, final SubLObject var23) {
        if (var25.isPositive()) {
            return Numbers.numGE(var37, var23);
        }
        if (var25.isNegative()) {
            return Numbers.numLE(var37, var23);
        }
        return Numbers.numE(var37, var23);
    }
    
    public static SubLObject f125(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic29$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic29$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic29$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var46_47 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic29$);
            var46_47 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic29$);
            if (NIL == conses_high.member(var46_47, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var46_47 == $ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic29$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic31$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        if (NIL != var14) {
            final SubLObject var16 = (SubLObject)$ic32$;
            final SubLObject var17 = (SubLObject)$ic33$;
            final SubLObject var18 = (SubLObject)$ic34$;
            final SubLObject var19 = (SubLObject)$ic35$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, var14), (SubLObject)ConsesLow.list(var17, var7), reader.bq_cons(var18, (SubLObject)$ic36$), (SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var17))), (SubLObject)ConsesLow.list((SubLObject)$ic38$, var16, (SubLObject)ConsesLow.listS((SubLObject)$ic28$, (SubLObject)ConsesLow.list(var6, var17, (SubLObject)$ic13$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic39$, var18, var19), (SubLObject)ConsesLow.list((SubLObject)$ic40$, var18), ConsesLow.append(var15, (SubLObject)NIL))));
        }
        if (NIL != var12) {
            final SubLObject var55_56 = (SubLObject)$ic41$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var55_56, var7, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var55_56))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic20$, var12, (SubLObject)ConsesLow.list((SubLObject)$ic43$, var55_56))), (SubLObject)ConsesLow.listS((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic44$, var55_56))), ConsesLow.append(var15, (SubLObject)NIL)));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic45$, (SubLObject)ConsesLow.list(var6, var7), ConsesLow.append(var15, (SubLObject)NIL));
    }
    
    public static SubLObject f126(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic47$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic47$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic47$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic47$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var65_66 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic47$);
            var65_66 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic47$);
            if (NIL == conses_high.member(var65_66, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var65_66 == $ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic47$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)$ic49$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, var8, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var15)), (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic44$, var15), (SubLObject)ConsesLow.list((SubLObject)$ic44$, var15)), (SubLObject)ConsesLow.list(var6, (SubLObject)ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var6))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic20$, var13, (SubLObject)ConsesLow.list((SubLObject)$ic43$, var15))), ConsesLow.append(var14, (SubLObject)NIL));
    }
    
    public static SubLObject f127(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic51$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic51$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic51$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic51$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var75_76 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic51$);
            var75_76 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic51$);
            if (NIL == conses_high.member(var75_76, (SubLObject)$ic52$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var75_76 == $ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic51$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic53$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        if (NIL != var13) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list(reader.bq_cons(var13, (SubLObject)$ic36$)), (SubLObject)ConsesLow.listS((SubLObject)$ic50$, (SubLObject)ConsesLow.list(var6, var7, var8, (SubLObject)$ic13$, var15), ConsesLow.append(var16, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic40$, var13)))));
        }
        final SubLObject var17 = (SubLObject)$ic54$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic28$, (SubLObject)ConsesLow.list(var17, var8, (SubLObject)$ic13$, var15), (SubLObject)ConsesLow.listS((SubLObject)$ic55$, reader.bq_cons(var6, var7), var17, ConsesLow.append(var16, (SubLObject)NIL)));
    }
    
    public static SubLObject f128(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic57$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic57$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic57$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var87_88 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic57$);
            var87_88 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic57$);
            if (NIL == conses_high.member(var87_88, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var87_88 == $ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic57$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic58$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic50$, (SubLObject)ConsesLow.list(var14, var6, var7, (SubLObject)$ic13$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic59$, var14), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f129(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic61$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic61$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic61$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var96_97 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic61$);
            var96_97 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic61$);
            if (NIL == conses_high.member(var96_97, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var96_97 == $ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic61$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic62$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic50$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)$ic13$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic59$, var14), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f130(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic64$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic64$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : EQL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic64$);
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic64$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9 = (SubLObject)$ic65$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)$ic66$, var5, var6, (SubLObject)ConsesLow.list((SubLObject)$ic67$, var7)))), (SubLObject)ConsesLow.list((SubLObject)$ic22$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic68$, var9, (SubLObject)ConsesLow.listS((SubLObject)$ic69$, var5, (SubLObject)$ic36$)), (SubLObject)ConsesLow.list((SubLObject)$ic70$, var9, var6)), (SubLObject)ConsesLow.list((SubLObject)$ic71$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var9), var8)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic64$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f131(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic73$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic73$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : EQL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic73$);
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic73$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic63$, var5, var6, var7, Numbers.minus(var8));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic73$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f132(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic75$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic75$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic75$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic75$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var114_115 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic75$);
            var114_115 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic75$);
            if (NIL == conses_high.member(var114_115, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var114_115 == $ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic75$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)$ic76$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, var8, (SubLObject)ConsesLow.list((SubLObject)$ic77$, var15))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic20$, var13, (SubLObject)ConsesLow.list((SubLObject)$ic43$, var15))), (SubLObject)ConsesLow.listS((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic44$, var15)), (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic78$, var15))), ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f133(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic80$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic80$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic80$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var124_125 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic80$);
            var124_125 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic80$);
            if (NIL == conses_high.member(var124_125, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var124_125 == $ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic80$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic81$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic74$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)$ic13$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic59$, var14), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f134(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic83$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic83$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic83$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var133_134 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic83$);
            var133_134 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic83$);
            if (NIL == conses_high.member(var133_134, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var133_134 == $ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic83$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic84$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic74$, (SubLObject)ConsesLow.list(var14, var6, var7, (SubLObject)$ic13$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic59$, var14), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f135(final SubLObject var1, final SubLObject var2) {
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
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic28$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic13$, var8), ConsesLow.append(var9, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic85$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f136(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic87$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic87$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic87$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var147_148 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic87$);
            var147_148 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic87$);
            if (NIL == conses_high.member(var147_148, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var147_148 == $ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic87$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        if (NIL != var12) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var6))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic20$, var12, (SubLObject)ConsesLow.list((SubLObject)$ic88$, var6))), ConsesLow.append(var13, (SubLObject)NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var6))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic88$, var6)), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f137(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic90$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic90$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic90$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic90$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var158_159 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic90$);
            var158_159 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic90$);
            if (NIL == conses_high.member(var158_159, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var158_159 == $ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic90$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)$ic91$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic86$, (SubLObject)ConsesLow.list(var15, var8, (SubLObject)$ic13$, var13), (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic92$, var15))), (SubLObject)ConsesLow.listS((SubLObject)$ic93$, (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic94$, var15), var13), ConsesLow.append(var14, (SubLObject)NIL))));
    }
    
    public static SubLObject f138(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic96$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic96$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic96$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic96$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var169_170 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic96$);
            var169_170 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic96$);
            if (NIL == conses_high.member(var169_170, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var169_170 == $ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic96$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)$ic97$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic86$, (SubLObject)ConsesLow.list(var15, var8, (SubLObject)$ic13$, var13), (SubLObject)ConsesLow.listS((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic44$, var15)), (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var15))), ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f139(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic99$);
        final SubLObject var5 = var4.rest();
        final SubLObject var6;
        var4 = (var6 = var4.first());
        final SubLObject var7;
        var4 = (var7 = var5);
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var6;
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            final SubLObject var12 = var11.first();
            final SubLObject var13 = conses_high.cadr(var11);
            final SubLObject var14 = Symbols.make_symbol(PrintLow.format((SubLObject)NIL, (SubLObject)$ic100$, var12));
            var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var14, var13, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var14)), var8);
            var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.list((SubLObject)$ic44$, var14), (SubLObject)ConsesLow.list((SubLObject)$ic44$, var14)), var8);
            var10 = var10.rest();
            var11 = var10.first();
        }
        var8 = Sequences.nreverse(var8);
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        var15 = var8;
        var16 = conses_high.caar(var15);
        while (NIL != var15) {
            var9 = (SubLObject)ConsesLow.cons(var16, var9);
            var15 = conses_high.cddr(var15);
            var16 = conses_high.caar(var15);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, var8, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic4$, reader.bq_cons((SubLObject)$ic101$, ConsesLow.append(var9, (SubLObject)NIL)))), ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f140(final SubLObject var1, final SubLObject var2) {
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
        SubLObject var192_193 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic103$);
            var192_193 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic103$);
            if (NIL == conses_high.member(var192_193, (SubLObject)$ic104$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var192_193 == $ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic103$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : ZERO_INTEGER);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic11$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic105$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19;
        var4 = (var19 = var5);
        if (NIL != var16) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic106$, (SubLObject)ConsesLow.list(new SubLObject[] { var16, var6, var7, $ic10$, var12, $ic11$, var14, $ic13$, var18 }), ConsesLow.append(var19, (SubLObject)NIL));
        }
        final SubLObject var197_199 = (SubLObject)$ic107$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic102$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, $ic105$, var197_199, $ic10$, var12, $ic11$, var14, $ic13$, var18 }), (SubLObject)ConsesLow.list((SubLObject)$ic59$, var197_199), ConsesLow.append(var19, (SubLObject)NIL));
    }
    
    public static SubLObject f141(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic108$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic108$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic108$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic108$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var206_207 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic108$);
            var206_207 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic108$);
            if (NIL == conses_high.member(var206_207, (SubLObject)$ic109$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var206_207 == $ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic108$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : ZERO_INTEGER);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic11$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18;
        var4 = (var18 = var5);
        final SubLObject var19 = (SubLObject)$ic110$;
        final SubLObject var20 = (SubLObject)$ic111$;
        SubLObject var21 = (SubLObject)NIL;
        if (var15.isInteger()) {
            var21 = var15;
        }
        else if (NIL == var15) {
            var21 = (SubLObject)ConsesLow.list((SubLObject)$ic37$, var19);
        }
        else {
            var21 = (SubLObject)ConsesLow.list((SubLObject)$ic112$, var15, var15, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var19));
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, var8), (SubLObject)ConsesLow.list(var20, var21)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list(var6, (SubLObject)$ic10$, var13, (SubLObject)$ic11$, var20, (SubLObject)$ic13$, var17), (SubLObject)ConsesLow.listS((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic113$, var19, var6))), ConsesLow.append(var18, (SubLObject)NIL))));
    }
    
    public static SubLObject f142(final SubLObject var1, final SubLObject var2) {
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
        SubLObject var220_221 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic115$);
            var220_221 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic115$);
            if (NIL == conses_high.member(var220_221, (SubLObject)$ic116$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var220_221 == $ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic115$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic117$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic118$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        if (NIL != var12) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic119$, (SubLObject)ConsesLow.list(var12, var6, var7, (SubLObject)$ic13$, var14, (SubLObject)$ic118$, var16), ConsesLow.append(var17, (SubLObject)NIL));
        }
        final SubLObject var223_227 = (SubLObject)$ic120$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic119$, (SubLObject)ConsesLow.list(var223_227, var6, var7, (SubLObject)$ic13$, var14, (SubLObject)$ic118$, var16), (SubLObject)ConsesLow.list((SubLObject)$ic59$, var223_227), ConsesLow.append(var17, (SubLObject)NIL));
    }
    
    public static SubLObject f143(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic121$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic121$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic121$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic121$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var234_235 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic121$);
            var234_235 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic121$);
            if (NIL == conses_high.member(var234_235, (SubLObject)$ic122$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var234_235 == $ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic121$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic118$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        final SubLObject var17 = (SubLObject)$ic123$;
        final SubLObject var18 = (SubLObject)$ic124$;
        final SubLObject var19 = (SubLObject)$ic125$;
        if (NIL != var13) {
            final SubLObject var20 = (SubLObject)$ic126$;
            final SubLObject var21 = (SubLObject)$ic127$;
            final SubLObject var22 = (SubLObject)$ic128$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, var8), (SubLObject)ConsesLow.list(var18, var15), (SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var17))), (SubLObject)ConsesLow.list((SubLObject)$ic55$, (SubLObject)ConsesLow.list(var20, var21, var22), (SubLObject)ConsesLow.list((SubLObject)$ic112$, var18, (SubLObject)ConsesLow.listS((SubLObject)$ic129$, (SubLObject)ConsesLow.listS((SubLObject)$ic130$, var19, (SubLObject)$ic131$), (SubLObject)$ic132$), (SubLObject)ConsesLow.listS((SubLObject)$ic129$, (SubLObject)ZERO_INTEGER, var19, (SubLObject)$ic131$)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, $ic10$, var20, $ic11$, var21, $ic13$, var13, $ic12$, var22 }), (SubLObject)ConsesLow.listS((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic133$, var17, var6))), ConsesLow.append(var16, (SubLObject)NIL)))));
        }
        final SubLObject var23 = (SubLObject)$ic134$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, var8), (SubLObject)ConsesLow.list(var18, var15), (SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var17))), (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.list(var23, var19), (SubLObject)ConsesLow.listS((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic112$, var18, (SubLObject)ConsesLow.listS((SubLObject)$ic130$, var19, var23, (SubLObject)$ic131$), var23)), (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic133$, var17, var6))), ConsesLow.append(var16, (SubLObject)NIL))));
    }
    
    public static SubLObject f144(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic136$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic136$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic136$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic114$, (SubLObject)ConsesLow.list(var6, var7), ConsesLow.append(var8, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic136$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f145(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic138$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic138$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic138$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic138$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic114$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic13$, var8), ConsesLow.append(var9, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic138$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f146(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic138$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic138$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic138$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic138$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic114$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic13$, var8), ConsesLow.append(var9, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic138$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f147(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic141$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic141$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic141$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var258_259 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic141$);
            var258_259 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic141$);
            if (NIL == conses_high.member(var258_259, (SubLObject)$ic142$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var258_259 == $ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic141$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic117$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        if (NIL != var12) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic143$, (SubLObject)ConsesLow.list(var12, var6, var7, (SubLObject)$ic13$, var14), ConsesLow.append(var15, (SubLObject)NIL));
        }
        final SubLObject var223_262 = (SubLObject)$ic144$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic143$, (SubLObject)ConsesLow.list(var223_262, var6, var7, (SubLObject)$ic13$, var14), (SubLObject)ConsesLow.list((SubLObject)$ic59$, var223_262), ConsesLow.append(var15, (SubLObject)NIL));
    }
    
    public static SubLObject f148(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic145$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic145$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic145$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic145$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var271_272 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic145$);
            var271_272 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic145$);
            if (NIL == conses_high.member(var271_272, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var271_272 == $ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic145$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)$ic146$;
        final SubLObject var16 = (SubLObject)$ic147$;
        final SubLObject var17 = (SubLObject)$ic148$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, var8), (SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)$ic149$, (SubLObject)ConsesLow.list((SubLObject)$ic150$, var15), (SubLObject)ConsesLow.list((SubLObject)$ic37$, var15))), reader.bq_cons(var6, (SubLObject)$ic36$), (SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)$ic151$, var6, var16, var15))), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic101$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic4$, var13)), (SubLObject)ConsesLow.listS((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic152$, var6, var15))), ConsesLow.append(var14, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic153$, (SubLObject)ConsesLow.list((SubLObject)$ic68$, var15, (SubLObject)ConsesLow.list((SubLObject)$ic154$, var15)), (SubLObject)ConsesLow.list((SubLObject)$ic40$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic68$, var17, (SubLObject)ConsesLow.list((SubLObject)$ic151$, var6, var16, var15))))))));
    }
    
    public static SubLObject f149(final SubLObject var78, final SubLObject var275, final SubLObject var254) {
        if (var254.isList()) {
            return Types.sublisp_null(var254);
        }
        return Numbers.numE(var78, var275);
    }
    
    public static SubLObject f150(final SubLObject var78, final SubLObject var254) {
        if (var254.isList()) {
            return var254.first();
        }
        if (var254.isVector()) {
            return Vectors.aref(var254, var78);
        }
        return Strings.sublisp_char(var254, var78);
    }
    
    public static SubLObject f151(final SubLObject var254) {
        if (var254.isList()) {
            return var254.rest();
        }
        return var254;
    }
    
    public static SubLObject f152(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic156$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic156$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic156$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic156$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var284_285 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic156$);
            var284_285 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic156$);
            if (NIL == conses_high.member(var284_285, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var284_285 == $ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic156$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic31$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        if (NIL != var15) {
            final SubLObject var17 = (SubLObject)$ic157$;
            final SubLObject var18 = (SubLObject)$ic158$;
            final SubLObject var19 = (SubLObject)$ic159$;
            final SubLObject var20 = (SubLObject)$ic160$;
            final SubLObject var21 = (SubLObject)$ic161$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, var15), reader.bq_cons(var18, (SubLObject)$ic162$), (SubLObject)ConsesLow.list((SubLObject)$ic163$, (SubLObject)ConsesLow.list((SubLObject)$ic20$, var18, (SubLObject)ConsesLow.list((SubLObject)$ic43$, var17)))), (SubLObject)ConsesLow.list((SubLObject)$ic38$, (SubLObject)ConsesLow.listS((SubLObject)$ic164$, var17, (SubLObject)$ic165$), (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, var8), reader.bq_cons(var20, (SubLObject)$ic36$), (SubLObject)ConsesLow.list(var21, (SubLObject)ConsesLow.list((SubLObject)$ic166$, var19))), (SubLObject)ConsesLow.list((SubLObject)$ic155$, (SubLObject)ConsesLow.list(var6, var7, var19, (SubLObject)$ic13$, var13), (SubLObject)ConsesLow.listS((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic163$, var18)), ConsesLow.append(var16, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic68$, var20, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var20)), (SubLObject)ConsesLow.list((SubLObject)$ic39$, var20, var21)))));
        }
        if (NIL != var13) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic22$, var13, (SubLObject)ConsesLow.list((SubLObject)$ic167$, (SubLObject)$ic168$, (SubLObject)ConsesLow.listS((SubLObject)$ic155$, (SubLObject)ConsesLow.list(var6, var7, var8), (SubLObject)ConsesLow.list((SubLObject)$ic169$, var13), ConsesLow.append(var16, (SubLObject)NIL))));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic170$, (SubLObject)ConsesLow.list(var6, var7, var8), ConsesLow.append(var16, (SubLObject)NIL));
    }
    
    public static SubLObject f153(final SubLObject var27) {
        if (NIL != var27) {
            Dynamic.sublisp_throw((SubLObject)$ic168$, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f154(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic171$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic172$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list(var7), (SubLObject)ConsesLow.list((SubLObject)$ic59$, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic173$, var5, var7, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f155(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic175$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic176$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list(var7), (SubLObject)ConsesLow.list((SubLObject)$ic177$, (SubLObject)ConsesLow.list(var7), var5), (SubLObject)ConsesLow.listS((SubLObject)$ic22$, var7, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f156(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic175$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic179$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list(var7), (SubLObject)ConsesLow.list((SubLObject)$ic177$, (SubLObject)ConsesLow.list(var7), var5), (SubLObject)ConsesLow.listS((SubLObject)$ic180$, var7, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f157(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        final SubLObject var6 = (SubLObject)$ic182$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list(var6), (SubLObject)ConsesLow.listS((SubLObject)$ic177$, (SubLObject)ConsesLow.list(var6), ConsesLow.append(var5, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic180$, (SubLObject)ConsesLow.list((SubLObject)$ic183$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic184$, (SubLObject)$ic185$, var6)));
    }
    
    public static SubLObject f158(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic187$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic188$, var5, reader.bq_cons((SubLObject)$ic181$, ConsesLow.append(var6, (SubLObject)NIL)), reader.bq_cons((SubLObject)$ic153$, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f159(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic187$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic188$, var5, reader.bq_cons((SubLObject)$ic190$, ConsesLow.append(var6, (SubLObject)NIL)), reader.bq_cons((SubLObject)$ic153$, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f160(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic192$, (SubLObject)NIL, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f161(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic194$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic195$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list(var7), (SubLObject)ConsesLow.list((SubLObject)$ic196$, (SubLObject)ConsesLow.list((SubLObject)$ic153$, var5, (SubLObject)ConsesLow.listS((SubLObject)$ic68$, var7, (SubLObject)$ic197$)), (SubLObject)ConsesLow.listS((SubLObject)$ic22$, var7, ConsesLow.append(var6, (SubLObject)NIL))));
    }
    
    public static SubLObject f162(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic199$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic199$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        final SubLObject var8 = (SubLObject)$ic200$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list(var8), (SubLObject)ConsesLow.list((SubLObject)$ic196$, (SubLObject)ConsesLow.list((SubLObject)$ic153$, var5, (SubLObject)ConsesLow.listS((SubLObject)$ic68$, var8, (SubLObject)$ic197$)), (SubLObject)ConsesLow.listS((SubLObject)$ic196$, (SubLObject)ConsesLow.list((SubLObject)$ic22$, var8, var6), ConsesLow.append(var7, (SubLObject)NIL))));
    }
    
    public static SubLObject f163(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic203$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic203$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic203$);
            return (SubLObject)NIL;
        }
        if (NIL != $g10$.getGlobalValue()) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic59$, var5);
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic204$, var5, var6);
    }
    
    public static SubLObject f164(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic203$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic203$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic203$);
            return (SubLObject)NIL;
        }
        if (NIL != $g10$.getGlobalValue()) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic59$, var5);
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic206$, var5, var6);
    }
    
    public static SubLObject f165(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic208$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic208$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic208$);
            return (SubLObject)NIL;
        }
        if (NIL != $g10$.getGlobalValue()) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic59$, var5);
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic209$, var5, var6);
    }
    
    public static SubLObject f166(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic211$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic211$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic211$);
            return (SubLObject)NIL;
        }
        if (NIL != $g10$.getGlobalValue()) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic59$, var5);
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic212$, var5, var6);
    }
    
    public static SubLObject f167(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic214$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic214$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        if (NIL != $g10$.getGlobalValue()) {
            return (SubLObject)$ic215$;
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic216$, var5, var6, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f168(final SubLObject var1, final SubLObject var2) {
        final SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var6;
        final SubLObject var5 = var6 = var4;
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            SubLObject var337_338;
            final SubLObject var335_336 = var337_338 = var7;
            SubLObject var8 = (SubLObject)NIL;
            SubLObject var9 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var337_338, var335_336, (SubLObject)$ic218$);
            var8 = var337_338.first();
            var337_338 = (var9 = var337_338.rest());
            if ($ic219$ == var8 || NIL != f169(var8)) {
                return reader.bq_cons((SubLObject)$ic153$, ConsesLow.append(var9, (SubLObject)NIL));
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return (SubLObject)$ic215$;
    }
    
    public static SubLObject f170(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic221$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic221$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic221$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic217$, (SubLObject)ConsesLow.list(var5, var6), (SubLObject)ConsesLow.list((SubLObject)$ic219$, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic221$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f171(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic224$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic217$, reader.bq_cons(var5, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f172(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic224$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic217$, (SubLObject)ConsesLow.list(var5), reader.bq_cons((SubLObject)$ic219$, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f173(final SubLObject var1, final SubLObject var2) {
        final SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var6;
        final SubLObject var5 = var6 = var4;
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            SubLObject var352_353;
            final SubLObject var350_351 = var352_353 = var7;
            SubLObject var8 = (SubLObject)NIL;
            SubLObject var9 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var352_353, var350_351, (SubLObject)$ic227$);
            var8 = var352_353.first();
            var352_353 = var352_353.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var352_353, var350_351, (SubLObject)$ic227$);
            var9 = var352_353.first();
            var352_353 = var352_353.rest();
            if (NIL == var352_353) {
                if ($ic219$ == var8 || NIL != f169(var8)) {
                    return var9;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var350_351, (SubLObject)$ic227$);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f174(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic221$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic221$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic221$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic226$, (SubLObject)ConsesLow.list(var5, var6), (SubLObject)ConsesLow.list((SubLObject)$ic219$, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic221$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f175(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic224$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic226$, reader.bq_cons(var5, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f176(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic231$);
        var5 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic229$, var5, (SubLObject)$ic197$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic231$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f177(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic224$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic226$, reader.bq_cons(var5, (SubLObject)$ic233$), reader.bq_cons((SubLObject)$ic219$, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f178(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic224$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic226$, reader.bq_cons(var5, ConsesLow.append(var6, (SubLObject)NIL)), (SubLObject)$ic235$);
    }
    
    public static SubLObject f179(final SubLObject var364) {
        final SubLThread var365 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != conses_high.member(var364, reader.$features$.getDynamicValue(var365), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? T : NIL);
    }
    
    public static SubLObject f169(final SubLObject var339) {
        if (var339.isAtom()) {
            if (var339.isSymbol()) {
                return f179(var339);
            }
        }
        else {
            SubLObject var340 = (SubLObject)NIL;
            SubLObject var341 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var339, var339, (SubLObject)$ic238$);
            var340 = var339.first();
            final SubLObject var342 = var341 = var339.rest();
            final SubLObject var343 = var340;
            if (var343.eql((SubLObject)$ic239$) || var343.eql((SubLObject)$ic240$) || var343.eql((SubLObject)$ic4$)) {
                return (SubLObject)makeBoolean(NIL == f169(var341.first()));
            }
            if (var343.eql((SubLObject)$ic241$) || var343.eql((SubLObject)$ic242$) || var343.eql((SubLObject)$ic20$)) {
                SubLObject var344 = (SubLObject)NIL;
                if (NIL == var344) {
                    SubLObject var345;
                    SubLObject var346;
                    for (var345 = var341, var346 = (SubLObject)NIL, var346 = var345.first(); NIL == var344 && NIL != var345; var344 = f169(var346), var345 = var345.rest(), var346 = var345.first()) {}
                }
                return var344;
            }
            if (var343.eql((SubLObject)$ic243$) || var343.eql((SubLObject)$ic244$) || var343.eql((SubLObject)$ic101$)) {
                SubLObject var347 = (SubLObject)NIL;
                if (NIL == var347) {
                    SubLObject var345;
                    SubLObject var346;
                    for (var345 = var341, var346 = (SubLObject)NIL, var346 = var345.first(); NIL == var347 && NIL != var345; var347 = (SubLObject)makeBoolean(NIL == f169(var346)), var345 = var345.rest(), var346 = var345.first()) {}
                }
                return (SubLObject)makeBoolean(NIL == var347);
            }
        }
        Errors.error((SubLObject)$ic245$, var339);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f180(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic247$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        if (NIL == var5) {
            return (SubLObject)$ic248$;
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic249$, var5, (SubLObject)ConsesLow.listS((SubLObject)$ic250$, var5, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f181(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic252$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic252$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7 = (SubLObject)$ic253$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic180$, var7, (SubLObject)ConsesLow.list((SubLObject)$ic70$, var7, var6)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic252$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f182(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic255$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic255$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : $ic256$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic255$);
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : $ic257$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic255$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9 = (SubLObject)$ic258$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic180$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic259$, var9, var6, var7, var8)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic255$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f183(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic261$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic261$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7 = (SubLObject)$ic262$;
            final SubLObject var8 = (SubLObject)$ic263$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic188$, (SubLObject)ConsesLow.list((SubLObject)$ic264$, var8), (SubLObject)ConsesLow.list((SubLObject)$ic114$, (SubLObject)ConsesLow.list(var7, var8), (SubLObject)ConsesLow.list((SubLObject)$ic70$, var7, var6)), (SubLObject)ConsesLow.list((SubLObject)$ic45$, (SubLObject)ConsesLow.list(var7, var8), (SubLObject)ConsesLow.list((SubLObject)$ic70$, var7, var6))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic261$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f184(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic266$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic266$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : $ic256$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic266$);
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : $ic257$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic266$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9 = (SubLObject)$ic267$;
            final SubLObject var10 = (SubLObject)$ic268$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic188$, (SubLObject)ConsesLow.list((SubLObject)$ic264$, var10), (SubLObject)ConsesLow.list((SubLObject)$ic114$, (SubLObject)ConsesLow.list(var9, var10), (SubLObject)ConsesLow.list((SubLObject)$ic259$, var9, var6, var7, var8)), (SubLObject)ConsesLow.list((SubLObject)$ic45$, (SubLObject)ConsesLow.list(var9, var10), (SubLObject)ConsesLow.list((SubLObject)$ic259$, var9, var6, var7, var8))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic266$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f185(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic270$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic270$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var395_396 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic270$);
            var395_396 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic270$);
            if (NIL == conses_high.member(var395_396, (SubLObject)$ic271$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var395_396 == $ic9$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic270$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic272$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : $ic256$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic273$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : $ic257$);
        if (!var13.equal((SubLObject)$ic257$)) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic274$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic275$, var5, var6, var11, var13));
        }
        if (var11.equal((SubLObject)$ic256$)) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic274$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic275$, var5, var6));
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic274$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic275$, var5, var6, var11));
    }
    
    public static SubLObject f186(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic252$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic252$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7 = (SubLObject)$ic277$;
            final SubLObject var8 = (SubLObject)$ic278$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.listS((SubLObject)$ic69$, var5, (SubLObject)$ic233$)), (SubLObject)ConsesLow.list(var8, var6)), (SubLObject)ConsesLow.list((SubLObject)$ic188$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic279$, var8, var7), (SubLObject)ConsesLow.list((SubLObject)$ic274$, var6, var7)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic252$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f187(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic270$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic270$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var407_408 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic270$);
            var407_408 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic270$);
            if (NIL == conses_high.member(var407_408, (SubLObject)$ic271$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var407_408 == $ic9$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic270$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic272$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : $ic256$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic273$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : $ic257$);
        final SubLObject var14 = (SubLObject)$ic281$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)$ic282$, var14, var6, var11, var13), (SubLObject)ConsesLow.list((SubLObject)$ic276$, var14, var6)));
    }
    
    public static SubLObject f188(final SubLObject var412, final SubLObject var413) {
        return ConsesLow.rplacd(conses_high.last(var412, (SubLObject)UNPROVIDED), var413);
    }
    
    public static SubLObject f189(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic21$, (SubLObject)$ic284$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f190(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic286$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic286$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic20$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var5), var6);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic286$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f191(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic288$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic288$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)EQ, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic4$, var6)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic288$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f192(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic288$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic288$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)EQ, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic4$, var6));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic288$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f193(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic290$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        if (NIL != Sequences.find((SubLObject)$ic291$, reader.$features$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return reader.bq_cons((SubLObject)$ic153$, ConsesLow.append(var7, (SubLObject)NIL));
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic188$, var6, reader.bq_cons((SubLObject)$ic292$, ConsesLow.append(var7, (SubLObject)NIL)), reader.bq_cons((SubLObject)$ic153$, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f194() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f119", "UNTIL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f120", "WHILE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f121", "REPEAT-FOREVER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f122", "DO-NUMBERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f123", "S#113");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0005", "f124", "S#114", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f125", "DO-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f126", "DO-LIST-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f127", "DO-ALIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f128", "DO-ALIST-VALUES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f129", "DO-ALIST-KEYS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f130", "CINC-ALIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f131", "CDEC-ALIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f132", "DO-PLIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f133", "DO-PLIST-PROPERTIES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f134", "DO-PLIST-VALUES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f135", "S#115");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f136", "CDOCONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f137", "DO-PAIRS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f138", "DO-LIST-WITH-TAIL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f139", "DOLISTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f140", "DO-STRING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f141", "DO-STRING-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f142", "DO-VECTOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f143", "DO-VECTOR-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f144", "CDOVECTOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f145", "CSOME-VECTOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f146", "SMART-CSOMEVECTOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f147", "DO-SEQUENCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f148", "DO-SEQUENCE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0005", "f149", "S#116", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0005", "f150", "S#117", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0005", "f151", "S#118", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f152", "DO-HASH-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0005", "f153", "S#119", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f154", "CCATCH-IGNORE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f155", "PUNLESS-ERROR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f156", "PWHEN-ERROR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f157", "WARN-ON-ERRORS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f158", "POSSIBLY-WARN-ON-ERRORS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f159", "POSSIBLY-IGNORE-ERRORS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f160", "WITH-DEFAULT-ERROR-HANDLING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f161", "CUNWIND-ON-FAILURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f162", "CUNWIND-PROTECT-WITH-FAIL-CLAUSE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f163", "ASSERT-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f164", "ASSERT-TYPE-IF-PRESENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f165", "ASSERT-LIST-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f166", "ASSERT-PLIST-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f167", "ASSERT-MUST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f168", "PCASE-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f170", "PIF-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f171", "PWHEN-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f172", "PUNLESS-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f173", "FCASE-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f174", "FIF-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f175", "FWHEN-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f176", "FEATURE-MATCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f177", "FUNLESS-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f178", "FIMPLIES-FEATURE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0005", "f179", "ATOMIC-FEATURE-MATCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0005", "f169", "FEATURE-EXPRESSION-MATCH", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f180", "FUNCALL-IF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f181", "CPUSH-IF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f182", "CPUSHNEW-IF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f183", "CPUSH-ALL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f184", "CPUSHNEW-ALL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f185", "CSETF-DELETE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f186", "CPUSH-END");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f187", "CPUSHNEW-END");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0005", "f188", "S#120", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f189", "SILENTLY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f190", "FIMPLIES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f191", "FXOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f192", "FEQUIV");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0005", "f193", "S#121");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f195() {
        $g10$ = SubLFiles.deflexical("*IGNORE-ASSERT-TYPES?*", (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f196() {
        module0002.f38((SubLObject)$ic0$);
        module0002.f38((SubLObject)$ic3$);
        module0002.f38((SubLObject)$ic5$);
        module0002.f38((SubLObject)$ic6$);
        module0002.f50((SubLObject)$ic19$, (SubLObject)$ic6$);
        module0002.f50((SubLObject)$ic27$, (SubLObject)$ic6$);
        module0002.f38((SubLObject)$ic28$);
        module0002.f38((SubLObject)$ic46$);
        module0002.f38((SubLObject)$ic50$);
        module0002.f38((SubLObject)$ic56$);
        module0002.f38((SubLObject)$ic60$);
        module0002.f38((SubLObject)$ic63$);
        module0002.f38((SubLObject)$ic72$);
        module0002.f38((SubLObject)$ic74$);
        module0002.f38((SubLObject)$ic79$);
        module0002.f38((SubLObject)$ic82$);
        module0002.f38((SubLObject)$ic86$);
        module0002.f38((SubLObject)$ic89$);
        module0002.f38((SubLObject)$ic95$);
        module0002.f38((SubLObject)$ic98$);
        module0002.f38((SubLObject)$ic102$);
        module0002.f38((SubLObject)$ic106$);
        module0002.f38((SubLObject)$ic114$);
        module0002.f38((SubLObject)$ic119$);
        module0002.f38((SubLObject)$ic135$);
        module0002.f38((SubLObject)$ic137$);
        module0002.f38((SubLObject)$ic139$);
        module0002.f38((SubLObject)$ic140$);
        module0002.f38((SubLObject)$ic143$);
        module0002.f50((SubLObject)$ic151$, (SubLObject)$ic143$);
        module0002.f50((SubLObject)$ic152$, (SubLObject)$ic143$);
        module0002.f50((SubLObject)$ic154$, (SubLObject)$ic143$);
        module0002.f38((SubLObject)$ic155$);
        module0002.f50((SubLObject)$ic169$, (SubLObject)$ic155$);
        module0002.f38((SubLObject)$ic167$);
        module0002.f38((SubLObject)$ic174$);
        module0002.f38((SubLObject)$ic178$);
        module0002.f38((SubLObject)$ic181$);
        module0002.f38((SubLObject)$ic186$);
        module0002.f38((SubLObject)$ic189$);
        module0002.f38((SubLObject)$ic191$);
        module0002.f38((SubLObject)$ic193$);
        module0002.f38((SubLObject)$ic198$);
        module0002.f38((SubLObject)$ic201$);
        module0002.f38((SubLObject)$ic202$);
        module0002.f38((SubLObject)$ic205$);
        module0002.f38((SubLObject)$ic207$);
        module0002.f38((SubLObject)$ic210$);
        module0002.f38((SubLObject)$ic213$);
        module0002.f38((SubLObject)$ic217$);
        module0002.f38((SubLObject)$ic220$);
        module0001.f5((SubLObject)$ic220$, (SubLObject)$ic222$);
        module0002.f38((SubLObject)$ic223$);
        module0002.f38((SubLObject)$ic225$);
        module0002.f38((SubLObject)$ic226$);
        module0002.f38((SubLObject)$ic228$);
        module0001.f5((SubLObject)$ic228$, (SubLObject)$ic222$);
        module0002.f38((SubLObject)$ic229$);
        module0002.f38((SubLObject)$ic230$);
        module0002.f38((SubLObject)$ic232$);
        module0002.f38((SubLObject)$ic234$);
        module0002.f38((SubLObject)$ic236$);
        module0002.f38((SubLObject)$ic237$);
        module0002.f38((SubLObject)$ic246$);
        module0002.f38((SubLObject)$ic251$);
        module0002.f38((SubLObject)$ic254$);
        module0002.f38((SubLObject)$ic260$);
        module0002.f38((SubLObject)$ic265$);
        module0002.f38((SubLObject)$ic269$);
        module0002.f38((SubLObject)$ic276$);
        module0002.f38((SubLObject)$ic280$);
        module0002.f38((SubLObject)$ic283$);
        module0002.f38((SubLObject)$ic285$);
        module0002.f38((SubLObject)$ic287$);
        module0002.f38((SubLObject)$ic289$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f194();
    }
    
    public void initializeVariables() {
        f195();
    }
    
    public void runTopLevelForms() {
        f196();
    }
    
    static {
        me = (SubLFile)new module0005();
        $g10$ = null;
        $ic0$ = makeSymbol("UNTIL");
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic2$ = makeSymbol("CDO");
        $ic3$ = makeSymbol("WHILE");
        $ic4$ = makeSymbol("CNOT");
        $ic5$ = makeSymbol("REPEAT-FOREVER");
        $ic6$ = makeSymbol("DO-NUMBERS");
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#123", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#126", "CYC"), (SubLObject)ONE_INTEGER), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)makeKeyword("START"), (SubLObject)makeKeyword("END"), (SubLObject)makeKeyword("DELTA"), (SubLObject)makeKeyword("DONE"));
        $ic9$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic10$ = makeKeyword("START");
        $ic11$ = makeKeyword("END");
        $ic12$ = makeKeyword("DELTA");
        $ic13$ = makeKeyword("DONE");
        $ic14$ = makeSymbol("CDOTIMES");
        $ic15$ = makeSymbol("1+");
        $ic16$ = makeSymbol("+");
        $ic17$ = makeUninternedSymbol("US#3D54294");
        $ic18$ = makeUninternedSymbol("US#36A439E");
        $ic19$ = makeSymbol("S#113", "CYC");
        $ic20$ = makeSymbol("COR");
        $ic21$ = makeSymbol("CLET");
        $ic22$ = makeSymbol("PUNLESS");
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#123", "CYC"), (SubLObject)makeSymbol("S#128", "CYC"), (SubLObject)makeSymbol("S#129", "CYC"));
        $ic24$ = makeSymbol(">=");
        $ic25$ = makeSymbol("<=");
        $ic26$ = makeSymbol("=");
        $ic27$ = makeSymbol("S#114", "CYC");
        $ic28$ = makeSymbol("DO-LIST");
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#130", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic30$ = ConsesLow.list((SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("PROGRESS-MESSAGE"));
        $ic31$ = makeKeyword("PROGRESS-MESSAGE");
        $ic32$ = makeUninternedSymbol("US#7028EF8");
        $ic33$ = makeUninternedSymbol("US#713E610");
        $ic34$ = makeUninternedSymbol("US#53EB1D3");
        $ic35$ = makeUninternedSymbol("US#13E86D7");
        $ic36$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic37$ = makeSymbol("LENGTH");
        $ic38$ = makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic39$ = makeSymbol("NOTE-PERCENT-PROGRESS");
        $ic40$ = makeSymbol("CINC");
        $ic41$ = makeUninternedSymbol("US#71690C3");
        $ic42$ = makeSymbol("CDR");
        $ic43$ = makeSymbol("NULL");
        $ic44$ = makeSymbol("CAR");
        $ic45$ = makeSymbol("CDOLIST");
        $ic46$ = makeSymbol("DO-LIST-INDEX");
        $ic47$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic48$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic49$ = makeUninternedSymbol("US#713E610");
        $ic50$ = makeSymbol("DO-ALIST");
        $ic51$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#133", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic52$ = ConsesLow.list((SubLObject)makeKeyword("INDEX"), (SubLObject)makeKeyword("DONE"));
        $ic53$ = makeKeyword("INDEX");
        $ic54$ = makeUninternedSymbol("US#53E18C3");
        $ic55$ = makeSymbol("CDESTRUCTURING-BIND");
        $ic56$ = makeSymbol("DO-ALIST-VALUES");
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#133", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic58$ = makeUninternedSymbol("US#3165895");
        $ic59$ = makeSymbol("IGNORE");
        $ic60$ = makeSymbol("DO-ALIST-KEYS");
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#133", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic62$ = makeUninternedSymbol("US#1069245");
        $ic63$ = makeSymbol("CINC-ALIST");
        $ic64$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#133", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)EQL)), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#135", "CYC"), (SubLObject)ONE_INTEGER));
        $ic65$ = makeUninternedSymbol("US#13A0444");
        $ic66$ = makeSymbol("ASSOC");
        $ic67$ = makeSymbol("QUOTE");
        $ic68$ = makeSymbol("CSETQ");
        $ic69$ = makeSymbol("CONS");
        $ic70$ = makeSymbol("CPUSH");
        $ic71$ = makeSymbol("RPLACD");
        $ic72$ = makeSymbol("CDEC-ALIST");
        $ic73$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#133", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)EQL)), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#136", "CYC"), (SubLObject)ONE_INTEGER));
        $ic74$ = makeSymbol("DO-PLIST");
        $ic75$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#137", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#138", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic76$ = makeUninternedSymbol("US#3853685");
        $ic77$ = makeSymbol("CDDR");
        $ic78$ = makeSymbol("CADR");
        $ic79$ = makeSymbol("DO-PLIST-PROPERTIES");
        $ic80$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#137", "CYC"), (SubLObject)makeSymbol("S#138", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic81$ = makeUninternedSymbol("US#1069245");
        $ic82$ = makeSymbol("DO-PLIST-VALUES");
        $ic83$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#138", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic84$ = makeUninternedSymbol("US#5DE2218");
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("S#139", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic86$ = makeSymbol("CDOCONS");
        $ic87$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#140", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic88$ = makeSymbol("ATOM");
        $ic89$ = makeSymbol("DO-PAIRS");
        $ic90$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#141", "CYC"), (SubLObject)makeSymbol("S#142", "CYC"), (SubLObject)makeSymbol("S#140", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic91$ = makeUninternedSymbol("US#72660C3");
        $ic92$ = makeSymbol("FIRST");
        $ic93$ = makeSymbol("CSOME");
        $ic94$ = makeSymbol("REST");
        $ic95$ = makeSymbol("DO-LIST-WITH-TAIL");
        $ic96$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#143", "CYC"), (SubLObject)makeSymbol("S#144", "CYC"), (SubLObject)makeSymbol("S#140", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic97$ = makeUninternedSymbol("US#742739B");
        $ic98$ = makeSymbol("DOLISTS");
        $ic99$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("SPECS")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic100$ = makeString("CURRENT-~A");
        $ic101$ = makeSymbol("CAND");
        $ic102$ = makeSymbol("DO-STRING");
        $ic103$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CHAR"), (SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)makeSymbol("S#145", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic104$ = ConsesLow.list((SubLObject)makeKeyword("START"), (SubLObject)makeKeyword("END"), (SubLObject)makeKeyword("CHAR-NUM"), (SubLObject)makeKeyword("DONE"));
        $ic105$ = makeKeyword("CHAR-NUM");
        $ic106$ = makeSymbol("DO-STRING-INDEX");
        $ic107$ = makeUninternedSymbol("US#1919E0D");
        $ic108$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#145", "CYC"), (SubLObject)makeSymbol("CHAR"), (SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic109$ = ConsesLow.list((SubLObject)makeKeyword("START"), (SubLObject)makeKeyword("END"), (SubLObject)makeKeyword("DONE"));
        $ic110$ = makeUninternedSymbol("US#4E23580");
        $ic111$ = makeUninternedSymbol("US#36A439E");
        $ic112$ = makeSymbol("FIF");
        $ic113$ = makeSymbol("CHAR");
        $ic114$ = makeSymbol("DO-VECTOR");
        $ic115$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("VECTOR"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#146", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#147", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic116$ = ConsesLow.list((SubLObject)makeKeyword("ELEMENT-NUM"), (SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("BACKWARD?"));
        $ic117$ = makeKeyword("ELEMENT-NUM");
        $ic118$ = makeKeyword("BACKWARD?");
        $ic119$ = makeSymbol("DO-VECTOR-INDEX");
        $ic120$ = makeUninternedSymbol("US#13ADC23");
        $ic121$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("VECTOR"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#147", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic122$ = ConsesLow.list((SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("BACKWARD?"));
        $ic123$ = makeUninternedSymbol("US#6A35D19");
        $ic124$ = makeUninternedSymbol("US#4FA4FBF");
        $ic125$ = makeUninternedSymbol("US#5044AD7");
        $ic126$ = makeUninternedSymbol("US#352B2C1");
        $ic127$ = makeUninternedSymbol("US#13A2892");
        $ic128$ = makeUninternedSymbol("US#1160044");
        $ic129$ = makeSymbol("LIST");
        $ic130$ = makeSymbol("-");
        $ic131$ = ConsesLow.list((SubLObject)ONE_INTEGER);
        $ic132$ = ConsesLow.list((SubLObject)MINUS_ONE_INTEGER, (SubLObject)MINUS_ONE_INTEGER);
        $ic133$ = makeSymbol("AREF");
        $ic134$ = makeUninternedSymbol("US#2676A7E");
        $ic135$ = makeSymbol("CDOVECTOR");
        $ic136$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("VECTOR")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic137$ = makeSymbol("CSOME-VECTOR");
        $ic138$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("VECTOR"), (SubLObject)makeSymbol("S#139", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic139$ = makeSymbol("SMART-CSOMEVECTOR");
        $ic140$ = makeSymbol("DO-SEQUENCE");
        $ic141$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("SEQUENCE"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#146", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic142$ = ConsesLow.list((SubLObject)makeKeyword("ELEMENT-NUM"), (SubLObject)makeKeyword("DONE"));
        $ic143$ = makeSymbol("DO-SEQUENCE-INDEX");
        $ic144$ = makeUninternedSymbol("US#13ADC23");
        $ic145$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#148", "CYC"), (SubLObject)makeSymbol("S#149", "CYC"), (SubLObject)makeSymbol("SEQUENCE"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic146$ = makeUninternedSymbol("US#1E66264");
        $ic147$ = makeUninternedSymbol("US#1A98E9B");
        $ic148$ = makeUninternedSymbol("US#5FA2DE2");
        $ic149$ = makeSymbol("FUNLESS");
        $ic150$ = makeSymbol("LISTP");
        $ic151$ = makeSymbol("S#116", "CYC");
        $ic152$ = makeSymbol("S#117", "CYC");
        $ic153$ = makeSymbol("PROGN");
        $ic154$ = makeSymbol("S#118", "CYC");
        $ic155$ = makeSymbol("DO-HASH-TABLE");
        $ic156$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("HASH-TABLE"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#130", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic157$ = makeUninternedSymbol("US#7028EF8");
        $ic158$ = makeUninternedSymbol("US#2D3BFD5");
        $ic159$ = makeUninternedSymbol("US#7C5C08F");
        $ic160$ = makeUninternedSymbol("US#3F92607");
        $ic161$ = makeUninternedSymbol("US#1FD7008");
        $ic162$ = ConsesLow.list((SubLObject)makeSymbol("*SILENT-PROGRESS?*"));
        $ic163$ = makeSymbol("*SILENT-PROGRESS?*");
        $ic164$ = makeSymbol("FIRST-OF");
        $ic165$ = ConsesLow.list((SubLObject)makeString(""));
        $ic166$ = makeSymbol("HASH-TABLE-COUNT");
        $ic167$ = makeSymbol("CCATCH-IGNORE");
        $ic168$ = makeKeyword("DO-HASH-TABLE");
        $ic169$ = makeSymbol("S#119", "CYC");
        $ic170$ = makeSymbol("CDOHASH");
        $ic171$ = ConsesLow.list((SubLObject)makeSymbol("S#150", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic172$ = makeUninternedSymbol("US#3C57E05");
        $ic173$ = makeSymbol("CCATCH");
        $ic174$ = makeSymbol("PUNLESS-ERROR");
        $ic175$ = ConsesLow.list((SubLObject)makeSymbol("S#151", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic176$ = makeUninternedSymbol("US#54A01D8");
        $ic177$ = makeSymbol("CATCH-ERROR-MESSAGE");
        $ic178$ = makeSymbol("PWHEN-ERROR");
        $ic179$ = makeUninternedSymbol("US#54A01D8");
        $ic180$ = makeSymbol("PWHEN");
        $ic181$ = makeSymbol("WARN-ON-ERRORS");
        $ic182$ = makeUninternedSymbol("US#7028EF8");
        $ic183$ = makeSymbol("STRINGP");
        $ic184$ = makeSymbol("WARN");
        $ic185$ = makeString("~A");
        $ic186$ = makeSymbol("POSSIBLY-WARN-ON-ERRORS");
        $ic187$ = ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic188$ = makeSymbol("PIF");
        $ic189$ = makeSymbol("POSSIBLY-IGNORE-ERRORS");
        $ic190$ = makeSymbol("IGNORE-ERRORS");
        $ic191$ = makeSymbol("WITH-DEFAULT-ERROR-HANDLING");
        $ic192$ = makeSymbol("WITH-ERROR-HANDLER");
        $ic193$ = makeSymbol("CUNWIND-ON-FAILURE");
        $ic194$ = ConsesLow.list((SubLObject)makeSymbol("S#152", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic195$ = makeUninternedSymbol("US#5877CEC");
        $ic196$ = makeSymbol("CUNWIND-PROTECT");
        $ic197$ = ConsesLow.list((SubLObject)T);
        $ic198$ = makeSymbol("CUNWIND-PROTECT-WITH-FAIL-CLAUSE");
        $ic199$ = ConsesLow.list((SubLObject)makeSymbol("S#152", "CYC"), (SubLObject)makeSymbol("S#153", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic200$ = makeUninternedSymbol("US#5877CEC");
        $ic201$ = makeSymbol("*IGNORE-ASSERT-TYPES?*");
        $ic202$ = makeSymbol("ASSERT-TYPE");
        $ic203$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"));
        $ic204$ = makeSymbol("CHECK-TYPE");
        $ic205$ = makeSymbol("ASSERT-TYPE-IF-PRESENT");
        $ic206$ = makeSymbol("S#156", "CYC");
        $ic207$ = makeSymbol("ASSERT-LIST-TYPE");
        $ic208$ = ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("S#155", "CYC"));
        $ic209$ = makeSymbol("S#157", "CYC");
        $ic210$ = makeSymbol("ASSERT-PLIST-TYPE");
        $ic211$ = ConsesLow.list((SubLObject)makeSymbol("S#138", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"));
        $ic212$ = makeSymbol("S#158", "CYC");
        $ic213$ = makeSymbol("ASSERT-MUST");
        $ic214$ = ConsesLow.list((SubLObject)makeSymbol("S#151", "CYC"), (SubLObject)makeSymbol("S#159", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#160", "CYC"));
        $ic215$ = ConsesLow.list((SubLObject)makeSymbol("PROGN"));
        $ic216$ = makeSymbol("MUST");
        $ic217$ = makeSymbol("PCASE-FEATURE");
        $ic218$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#161", "CYC"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic219$ = makeSymbol("OTHERWISE");
        $ic220$ = makeSymbol("PIF-FEATURE");
        $ic221$ = ConsesLow.list((SubLObject)makeSymbol("S#162", "CYC"), (SubLObject)makeSymbol("S#163", "CYC"), (SubLObject)makeSymbol("S#164", "CYC"));
        $ic222$ = ConsesLow.list((SubLObject)makeSymbol("S#162", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#165", "CYC"));
        $ic223$ = makeSymbol("PWHEN-FEATURE");
        $ic224$ = ConsesLow.list((SubLObject)makeSymbol("S#162", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic225$ = makeSymbol("PUNLESS-FEATURE");
        $ic226$ = makeSymbol("FCASE-FEATURE");
        $ic227$ = ConsesLow.list((SubLObject)makeSymbol("S#161", "CYC"), (SubLObject)makeSymbol("S#151", "CYC"));
        $ic228$ = makeSymbol("FIF-FEATURE");
        $ic229$ = makeSymbol("FWHEN-FEATURE");
        $ic230$ = makeSymbol("FEATURE-MATCH");
        $ic231$ = ConsesLow.list((SubLObject)makeSymbol("S#162", "CYC"));
        $ic232$ = makeSymbol("FUNLESS-FEATURE");
        $ic233$ = ConsesLow.list((SubLObject)NIL);
        $ic234$ = makeSymbol("FIMPLIES-FEATURE");
        $ic235$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("OTHERWISE"), (SubLObject)T));
        $ic236$ = makeSymbol("ATOMIC-FEATURE-MATCH");
        $ic237$ = makeSymbol("FEATURE-EXPRESSION-MATCH");
        $ic238$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#167", "CYC"));
        $ic239$ = makeKeyword("NOT");
        $ic240$ = makeSymbol("NOT");
        $ic241$ = makeKeyword("OR");
        $ic242$ = makeSymbol("OR");
        $ic243$ = makeKeyword("AND");
        $ic244$ = makeSymbol("AND");
        $ic245$ = makeString("~S is not a well-formed feature expression");
        $ic246$ = makeSymbol("FUNCALL-IF");
        $ic247$ = ConsesLow.list((SubLObject)makeSymbol("S#168", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic248$ = ConsesLow.list((SubLObject)makeSymbol("FALSE"));
        $ic249$ = makeSymbol("FWHEN");
        $ic250$ = makeSymbol("FUNCALL");
        $ic251$ = makeSymbol("CPUSH-IF");
        $ic252$ = ConsesLow.list((SubLObject)makeSymbol("S#143", "CYC"), (SubLObject)makeSymbol("S#169", "CYC"));
        $ic253$ = makeUninternedSymbol("US#506B097");
        $ic254$ = makeSymbol("CPUSHNEW-IF");
        $ic255$ = ConsesLow.list((SubLObject)makeSymbol("S#143", "CYC"), (SubLObject)makeSymbol("S#169", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQL))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)IDENTITY))));
        $ic256$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQL);
        $ic257$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)IDENTITY);
        $ic258$ = makeUninternedSymbol("US#506B097");
        $ic259$ = makeSymbol("CPUSHNEW");
        $ic260$ = makeSymbol("CPUSH-ALL");
        $ic261$ = ConsesLow.list((SubLObject)makeSymbol("S#170", "CYC"), (SubLObject)makeSymbol("S#169", "CYC"));
        $ic262$ = makeUninternedSymbol("US#35248DF");
        $ic263$ = makeUninternedSymbol("US#191238F");
        $ic264$ = makeSymbol("VECTORP");
        $ic265$ = makeSymbol("CPUSHNEW-ALL");
        $ic266$ = ConsesLow.list((SubLObject)makeSymbol("S#170", "CYC"), (SubLObject)makeSymbol("S#169", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQL))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)IDENTITY))));
        $ic267$ = makeUninternedSymbol("US#35248DF");
        $ic268$ = makeUninternedSymbol("US#191238F");
        $ic269$ = makeSymbol("CSETF-DELETE");
        $ic270$ = ConsesLow.list((SubLObject)makeSymbol("S#143", "CYC"), (SubLObject)makeSymbol("S#169", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQL))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)IDENTITY))));
        $ic271$ = ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeKeyword("KEY"));
        $ic272$ = makeKeyword("TEST");
        $ic273$ = makeKeyword("KEY");
        $ic274$ = makeSymbol("CSETF");
        $ic275$ = makeSymbol("DELETE");
        $ic276$ = makeSymbol("CPUSH-END");
        $ic277$ = makeUninternedSymbol("US#6C59149");
        $ic278$ = makeUninternedSymbol("US#72660C3");
        $ic279$ = makeSymbol("S#120", "CYC");
        $ic280$ = makeSymbol("CPUSHNEW-END");
        $ic281$ = makeUninternedSymbol("US#367CE0C");
        $ic282$ = makeSymbol("MEMBER");
        $ic283$ = makeSymbol("SILENTLY");
        $ic284$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("*IGNORE-WARNS?*"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*IGNORE-BREAKS?*"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*SILENT-PROGRESS?*"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*CONTINUE-CERROR?*"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*STANDARD-OUTPUT*"), (SubLObject)makeSymbol("*NULL-OUTPUT*")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*ERROR-OUTPUT*"), (SubLObject)makeSymbol("*NULL-OUTPUT*")));
        $ic285$ = makeSymbol("FIMPLIES");
        $ic286$ = ConsesLow.list((SubLObject)makeSymbol("S#171", "CYC"), (SubLObject)makeSymbol("S#172", "CYC"));
        $ic287$ = makeSymbol("FXOR");
        $ic288$ = ConsesLow.list((SubLObject)makeSymbol("S#173", "CYC"), (SubLObject)makeSymbol("S#174", "CYC"));
        $ic289$ = makeSymbol("FEQUIV");
        $ic290$ = ConsesLow.list((SubLObject)makeSymbol("S#175", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic291$ = makeKeyword("SL2JAVA");
        $ic292$ = makeSymbol("WITH-STATIC-AREA");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 670 ms
	
	Decompiled with Procyon 0.5.32.
*/