package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        SubLObject var5 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic1$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic2$, (SubLObject)module0005.NIL, (SubLObject)ConsesLow.list(var5), ConsesLow.append(var6, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f120(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic1$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic0$, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic4$, var5), ConsesLow.append(var6, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f121(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic3$, (SubLObject)module0005.T, ConsesLow.append(var5, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f122(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic7$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic7$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0005.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0005.NIL;
        SubLObject var18_19 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0005.$ic7$);
            var18_19 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0005.$ic7$);
            if (module0005.NIL == conses_high.member(var18_19, (SubLObject)module0005.$ic8$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var9 = (SubLObject)module0005.T;
            }
            if (var18_19 == module0005.$ic9$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0005.NIL != var9 && module0005.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic7$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic10$, var4);
        final SubLObject var11 = (SubLObject)((module0005.NIL != var10) ? conses_high.cadr(var10) : module0005.ZERO_INTEGER);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic11$, var4);
        final SubLObject var13 = (SubLObject)((module0005.NIL != var12) ? conses_high.cadr(var12) : module0005.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic12$, var4);
        final SubLObject var15 = (SubLObject)((module0005.NIL != var14) ? conses_high.cadr(var14) : module0005.ONE_INTEGER);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var17 = (SubLObject)((module0005.NIL != var16) ? conses_high.cadr(var16) : module0005.NIL);
        final SubLObject var18;
        var4 = (var18 = var5);
        if (module0005.ZERO_INTEGER.eql(var11) && var13.isInteger() && !var13.isNegative() && module0005.ONE_INTEGER.eql(var15) && module0005.NIL == var17) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic14$, (SubLObject)ConsesLow.list(var6, var13), ConsesLow.append(var18, (SubLObject)module0005.NIL));
        }
        SubLObject var19 = (SubLObject)module0005.NIL;
        SubLObject var20 = (SubLObject)module0005.NIL;
        SubLObject var21 = (SubLObject)module0005.NIL;
        SubLObject var22 = (SubLObject)module0005.NIL;
        SubLObject var23 = (SubLObject)module0005.NIL;
        if (module0005.ONE_INTEGER.eql(var15)) {
            var20 = (SubLObject)module0005.ONE_INTEGER;
            var21 = (SubLObject)ConsesLow.list((SubLObject)module0005.$ic15$, var6);
        }
        else if (var15.isAtom()) {
            var20 = var15;
            var21 = (SubLObject)ConsesLow.list((SubLObject)module0005.$ic16$, var6, var15);
        }
        else {
            final SubLObject var24 = (SubLObject)module0005.$ic17$;
            var19 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var24, var15), var19);
            var20 = var24;
            var21 = (SubLObject)ConsesLow.list((SubLObject)module0005.$ic16$, var6, var24);
        }
        if (module0005.NIL != var13) {
            final SubLObject var25 = (SubLObject)module0005.$ic18$;
            var19 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var25, var13), var19);
            var22 = (SubLObject)ConsesLow.list((SubLObject)module0005.$ic19$, var6, var20, var25);
        }
        if (module0005.NIL != var17) {
            if (module0005.NIL != var22) {
                var22 = (SubLObject)ConsesLow.list((SubLObject)module0005.$ic20$, var17, var22);
            }
            else {
                var22 = var17;
            }
        }
        var23 = (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, var11, var21)), (SubLObject)ConsesLow.list(var22), ConsesLow.append(var18, (SubLObject)module0005.NIL));
        if (module0005.NIL != var19) {
            var23 = (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, var19, var23);
        }
        if (module0005.NIL != var17) {
            var23 = (SubLObject)ConsesLow.list((SubLObject)module0005.$ic22$, var17, var23);
        }
        return var23;
    }
    
    public static SubLObject f123(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic23$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic23$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic23$);
            return (SubLObject)module0005.NIL;
        }
        if (!var6.isNumber()) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic27$, var5, var6, var7);
        }
        if (var6.isPositive()) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic24$, var5, var7);
        }
        if (var6.isNegative()) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic25$, var5, var7);
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic26$, var5, var7);
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
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic29$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic29$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic29$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0005.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0005.NIL;
        SubLObject var46_47 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic29$);
            var46_47 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic29$);
            if (module0005.NIL == conses_high.member(var46_47, (SubLObject)module0005.$ic30$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var10 = (SubLObject)module0005.T;
            }
            if (var46_47 == module0005.$ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0005.NIL != var10 && module0005.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic29$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var12 = (SubLObject)((module0005.NIL != var11) ? conses_high.cadr(var11) : module0005.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic31$, var4);
        final SubLObject var14 = (SubLObject)((module0005.NIL != var13) ? conses_high.cadr(var13) : module0005.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        if (module0005.NIL != var14) {
            final SubLObject var16 = (SubLObject)module0005.$ic32$;
            final SubLObject var17 = (SubLObject)module0005.$ic33$;
            final SubLObject var18 = (SubLObject)module0005.$ic34$;
            final SubLObject var19 = (SubLObject)module0005.$ic35$;
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, var14), (SubLObject)ConsesLow.list(var17, var7), reader.bq_cons(var18, (SubLObject)module0005.$ic36$), (SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic37$, var17))), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic38$, var16, (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic28$, (SubLObject)ConsesLow.list(var6, var17, (SubLObject)module0005.$ic13$, var12), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic39$, var18, var19), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic40$, var18), ConsesLow.append(var15, (SubLObject)module0005.NIL))));
        }
        if (module0005.NIL != var12) {
            final SubLObject var55_56 = (SubLObject)module0005.$ic41$;
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var55_56, var7, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic42$, var55_56))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0005.$ic20$, var12, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic43$, var55_56))), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic44$, var55_56))), ConsesLow.append(var15, (SubLObject)module0005.NIL)));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic45$, (SubLObject)ConsesLow.list(var6, var7), ConsesLow.append(var15, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f126(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic47$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        SubLObject var8 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic47$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic47$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic47$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0005.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0005.NIL;
        SubLObject var65_66 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic47$);
            var65_66 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic47$);
            if (module0005.NIL == conses_high.member(var65_66, (SubLObject)module0005.$ic48$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var11 = (SubLObject)module0005.T;
            }
            if (var65_66 == module0005.$ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0005.NIL != var11 && module0005.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic47$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var13 = (SubLObject)((module0005.NIL != var12) ? conses_high.cadr(var12) : module0005.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)module0005.$ic49$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, var8, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic42$, var15)), (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic44$, var15), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic44$, var15)), (SubLObject)ConsesLow.list(var6, (SubLObject)module0005.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic15$, var6))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0005.$ic20$, var13, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic43$, var15))), ConsesLow.append(var14, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f127(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic51$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        SubLObject var8 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic51$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic51$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic51$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0005.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0005.NIL;
        SubLObject var75_76 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic51$);
            var75_76 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic51$);
            if (module0005.NIL == conses_high.member(var75_76, (SubLObject)module0005.$ic52$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var11 = (SubLObject)module0005.T;
            }
            if (var75_76 == module0005.$ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0005.NIL != var11 && module0005.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic51$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic53$, var4);
        final SubLObject var13 = (SubLObject)((module0005.NIL != var12) ? conses_high.cadr(var12) : module0005.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var15 = (SubLObject)((module0005.NIL != var14) ? conses_high.cadr(var14) : module0005.NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        if (module0005.NIL != var13) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list(reader.bq_cons(var13, (SubLObject)module0005.$ic36$)), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic50$, (SubLObject)ConsesLow.list(var6, var7, var8, (SubLObject)module0005.$ic13$, var15), ConsesLow.append(var16, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0005.$ic40$, var13)))));
        }
        final SubLObject var17 = (SubLObject)module0005.$ic54$;
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic28$, (SubLObject)ConsesLow.list(var17, var8, (SubLObject)module0005.$ic13$, var15), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic55$, reader.bq_cons(var6, var7), var17, ConsesLow.append(var16, (SubLObject)module0005.NIL)));
    }
    
    public static SubLObject f128(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic57$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic57$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic57$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0005.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0005.NIL;
        SubLObject var87_88 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic57$);
            var87_88 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic57$);
            if (module0005.NIL == conses_high.member(var87_88, (SubLObject)module0005.$ic48$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var10 = (SubLObject)module0005.T;
            }
            if (var87_88 == module0005.$ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0005.NIL != var10 && module0005.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic57$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var12 = (SubLObject)((module0005.NIL != var11) ? conses_high.cadr(var11) : module0005.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)module0005.$ic58$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic50$, (SubLObject)ConsesLow.list(var14, var6, var7, (SubLObject)module0005.$ic13$, var12), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic59$, var14), ConsesLow.append(var13, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f129(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic61$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic61$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic61$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0005.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0005.NIL;
        SubLObject var96_97 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic61$);
            var96_97 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic61$);
            if (module0005.NIL == conses_high.member(var96_97, (SubLObject)module0005.$ic48$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var10 = (SubLObject)module0005.T;
            }
            if (var96_97 == module0005.$ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0005.NIL != var10 && module0005.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic61$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var12 = (SubLObject)((module0005.NIL != var11) ? conses_high.cadr(var11) : module0005.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)module0005.$ic62$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic50$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)module0005.$ic13$, var12), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic59$, var14), ConsesLow.append(var13, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f130(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic64$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic64$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0005.EQL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0005.$ic64$);
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : module0005.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0005.$ic64$);
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            final SubLObject var9 = (SubLObject)module0005.$ic65$;
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic66$, var5, var6, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic67$, var7)))), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic22$, var9, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic68$, var9, (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic69$, var5, (SubLObject)module0005.$ic36$)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic70$, var9, var6)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic71$, var9, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic16$, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic42$, var9), var8)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic64$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f131(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic73$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic73$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0005.EQL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0005.$ic73$);
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : module0005.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0005.$ic73$);
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic63$, var5, var6, var7, Numbers.minus(var8));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic73$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f132(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic75$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        SubLObject var8 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic75$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic75$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic75$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0005.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0005.NIL;
        SubLObject var114_115 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic75$);
            var114_115 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic75$);
            if (module0005.NIL == conses_high.member(var114_115, (SubLObject)module0005.$ic48$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var11 = (SubLObject)module0005.T;
            }
            if (var114_115 == module0005.$ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0005.NIL != var11 && module0005.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic75$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var13 = (SubLObject)((module0005.NIL != var12) ? conses_high.cadr(var12) : module0005.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)module0005.$ic76$;
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, var8, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic77$, var15))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0005.$ic20$, var13, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic43$, var15))), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic44$, var15)), (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic78$, var15))), ConsesLow.append(var14, (SubLObject)module0005.NIL)));
    }
    
    public static SubLObject f133(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic80$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic80$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic80$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0005.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0005.NIL;
        SubLObject var124_125 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic80$);
            var124_125 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic80$);
            if (module0005.NIL == conses_high.member(var124_125, (SubLObject)module0005.$ic48$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var10 = (SubLObject)module0005.T;
            }
            if (var124_125 == module0005.$ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0005.NIL != var10 && module0005.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic80$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var12 = (SubLObject)((module0005.NIL != var11) ? conses_high.cadr(var11) : module0005.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)module0005.$ic81$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic74$, (SubLObject)ConsesLow.list(var6, var14, var7, (SubLObject)module0005.$ic13$, var12), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic59$, var14), ConsesLow.append(var13, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f134(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic83$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic83$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic83$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0005.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0005.NIL;
        SubLObject var133_134 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic83$);
            var133_134 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic83$);
            if (module0005.NIL == conses_high.member(var133_134, (SubLObject)module0005.$ic48$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var10 = (SubLObject)module0005.T;
            }
            if (var133_134 == module0005.$ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0005.NIL != var10 && module0005.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic83$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var12 = (SubLObject)((module0005.NIL != var11) ? conses_high.cadr(var11) : module0005.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)module0005.$ic84$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic74$, (SubLObject)ConsesLow.list(var14, var6, var7, (SubLObject)module0005.$ic13$, var12), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic59$, var14), ConsesLow.append(var13, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f135(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic85$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        SubLObject var8 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic85$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic85$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic85$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic28$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0005.$ic13$, var8), ConsesLow.append(var9, (SubLObject)module0005.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic85$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f136(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic87$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic87$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic87$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0005.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0005.NIL;
        SubLObject var147_148 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic87$);
            var147_148 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic87$);
            if (module0005.NIL == conses_high.member(var147_148, (SubLObject)module0005.$ic48$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var10 = (SubLObject)module0005.T;
            }
            if (var147_148 == module0005.$ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0005.NIL != var10 && module0005.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic87$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var12 = (SubLObject)((module0005.NIL != var11) ? conses_high.cadr(var11) : module0005.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        if (module0005.NIL != var12) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic42$, var6))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0005.$ic20$, var12, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic88$, var6))), ConsesLow.append(var13, (SubLObject)module0005.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic42$, var6))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0005.$ic88$, var6)), ConsesLow.append(var13, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f137(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic90$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        SubLObject var8 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic90$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic90$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic90$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0005.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0005.NIL;
        SubLObject var158_159 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic90$);
            var158_159 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic90$);
            if (module0005.NIL == conses_high.member(var158_159, (SubLObject)module0005.$ic48$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var11 = (SubLObject)module0005.T;
            }
            if (var158_159 == module0005.$ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0005.NIL != var11 && module0005.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic90$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var13 = (SubLObject)((module0005.NIL != var12) ? conses_high.cadr(var12) : module0005.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)module0005.$ic91$;
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic86$, (SubLObject)ConsesLow.list(var15, var8, (SubLObject)module0005.$ic13$, var13), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic92$, var15))), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic93$, (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic94$, var15), var13), ConsesLow.append(var14, (SubLObject)module0005.NIL))));
    }
    
    public static SubLObject f138(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic96$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        SubLObject var8 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic96$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic96$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic96$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0005.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0005.NIL;
        SubLObject var169_170 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic96$);
            var169_170 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic96$);
            if (module0005.NIL == conses_high.member(var169_170, (SubLObject)module0005.$ic48$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var11 = (SubLObject)module0005.T;
            }
            if (var169_170 == module0005.$ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0005.NIL != var11 && module0005.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic96$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var13 = (SubLObject)((module0005.NIL != var12) ? conses_high.cadr(var12) : module0005.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)module0005.$ic97$;
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic86$, (SubLObject)ConsesLow.list(var15, var8, (SubLObject)module0005.$ic13$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic44$, var15)), (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic42$, var15))), ConsesLow.append(var14, (SubLObject)module0005.NIL)));
    }
    
    public static SubLObject f139(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic99$);
        final SubLObject var5 = var4.rest();
        final SubLObject var6;
        var4 = (var6 = var4.first());
        final SubLObject var7;
        var4 = (var7 = var5);
        SubLObject var8 = (SubLObject)module0005.NIL;
        SubLObject var9 = (SubLObject)module0005.NIL;
        SubLObject var10 = var6;
        SubLObject var11 = (SubLObject)module0005.NIL;
        var11 = var10.first();
        while (module0005.NIL != var10) {
            final SubLObject var12 = var11.first();
            final SubLObject var13 = conses_high.cadr(var11);
            final SubLObject var14 = Symbols.make_symbol(PrintLow.format((SubLObject)module0005.NIL, (SubLObject)module0005.$ic100$, var12));
            var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var14, var13, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic42$, var14)), var8);
            var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic44$, var14), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic44$, var14)), var8);
            var10 = var10.rest();
            var11 = var10.first();
        }
        var8 = Sequences.nreverse(var8);
        SubLObject var15 = (SubLObject)module0005.NIL;
        SubLObject var16 = (SubLObject)module0005.NIL;
        var15 = var8;
        var16 = conses_high.caar(var15);
        while (module0005.NIL != var15) {
            var9 = (SubLObject)ConsesLow.cons(var16, var9);
            var15 = conses_high.cddr(var15);
            var16 = conses_high.caar(var15);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic2$, var8, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0005.$ic4$, reader.bq_cons((SubLObject)module0005.$ic101$, ConsesLow.append(var9, (SubLObject)module0005.NIL)))), ConsesLow.append(var7, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f140(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic103$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic103$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic103$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0005.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0005.NIL;
        SubLObject var192_193 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic103$);
            var192_193 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic103$);
            if (module0005.NIL == conses_high.member(var192_193, (SubLObject)module0005.$ic104$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var10 = (SubLObject)module0005.T;
            }
            if (var192_193 == module0005.$ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0005.NIL != var10 && module0005.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic103$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic10$, var4);
        final SubLObject var12 = (SubLObject)((module0005.NIL != var11) ? conses_high.cadr(var11) : module0005.ZERO_INTEGER);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic11$, var4);
        final SubLObject var14 = (SubLObject)((module0005.NIL != var13) ? conses_high.cadr(var13) : module0005.NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic105$, var4);
        final SubLObject var16 = (SubLObject)((module0005.NIL != var15) ? conses_high.cadr(var15) : module0005.NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var18 = (SubLObject)((module0005.NIL != var17) ? conses_high.cadr(var17) : module0005.NIL);
        final SubLObject var19;
        var4 = (var19 = var5);
        if (module0005.NIL != var16) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic106$, (SubLObject)ConsesLow.list(new SubLObject[] { var16, var6, var7, module0005.$ic10$, var12, module0005.$ic11$, var14, module0005.$ic13$, var18 }), ConsesLow.append(var19, (SubLObject)module0005.NIL));
        }
        final SubLObject var197_199 = (SubLObject)module0005.$ic107$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic102$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, module0005.$ic105$, var197_199, module0005.$ic10$, var12, module0005.$ic11$, var14, module0005.$ic13$, var18 }), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic59$, var197_199), ConsesLow.append(var19, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f141(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic108$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        SubLObject var8 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic108$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic108$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic108$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0005.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0005.NIL;
        SubLObject var206_207 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic108$);
            var206_207 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic108$);
            if (module0005.NIL == conses_high.member(var206_207, (SubLObject)module0005.$ic109$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var11 = (SubLObject)module0005.T;
            }
            if (var206_207 == module0005.$ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0005.NIL != var11 && module0005.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic108$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic10$, var4);
        final SubLObject var13 = (SubLObject)((module0005.NIL != var12) ? conses_high.cadr(var12) : module0005.ZERO_INTEGER);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic11$, var4);
        final SubLObject var15 = (SubLObject)((module0005.NIL != var14) ? conses_high.cadr(var14) : module0005.NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var17 = (SubLObject)((module0005.NIL != var16) ? conses_high.cadr(var16) : module0005.NIL);
        final SubLObject var18;
        var4 = (var18 = var5);
        final SubLObject var19 = (SubLObject)module0005.$ic110$;
        final SubLObject var20 = (SubLObject)module0005.$ic111$;
        SubLObject var21 = (SubLObject)module0005.NIL;
        if (var15.isInteger()) {
            var21 = var15;
        }
        else if (module0005.NIL == var15) {
            var21 = (SubLObject)ConsesLow.list((SubLObject)module0005.$ic37$, var19);
        }
        else {
            var21 = (SubLObject)ConsesLow.list((SubLObject)module0005.$ic112$, var15, var15, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic37$, var19));
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, var8), (SubLObject)ConsesLow.list(var20, var21)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic6$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0005.$ic10$, var13, (SubLObject)module0005.$ic11$, var20, (SubLObject)module0005.$ic13$, var17), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic113$, var19, var6))), ConsesLow.append(var18, (SubLObject)module0005.NIL))));
    }
    
    public static SubLObject f142(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic115$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic115$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic115$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0005.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0005.NIL;
        SubLObject var220_221 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic115$);
            var220_221 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic115$);
            if (module0005.NIL == conses_high.member(var220_221, (SubLObject)module0005.$ic116$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var10 = (SubLObject)module0005.T;
            }
            if (var220_221 == module0005.$ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0005.NIL != var10 && module0005.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic115$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic117$, var4);
        final SubLObject var12 = (SubLObject)((module0005.NIL != var11) ? conses_high.cadr(var11) : module0005.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var14 = (SubLObject)((module0005.NIL != var13) ? conses_high.cadr(var13) : module0005.NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic118$, var4);
        final SubLObject var16 = (SubLObject)((module0005.NIL != var15) ? conses_high.cadr(var15) : module0005.NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        if (module0005.NIL != var12) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic119$, (SubLObject)ConsesLow.list(var12, var6, var7, (SubLObject)module0005.$ic13$, var14, (SubLObject)module0005.$ic118$, var16), ConsesLow.append(var17, (SubLObject)module0005.NIL));
        }
        final SubLObject var223_227 = (SubLObject)module0005.$ic120$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic119$, (SubLObject)ConsesLow.list(var223_227, var6, var7, (SubLObject)module0005.$ic13$, var14, (SubLObject)module0005.$ic118$, var16), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic59$, var223_227), ConsesLow.append(var17, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f143(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic121$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        SubLObject var8 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic121$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic121$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic121$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0005.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0005.NIL;
        SubLObject var234_235 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic121$);
            var234_235 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic121$);
            if (module0005.NIL == conses_high.member(var234_235, (SubLObject)module0005.$ic122$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var11 = (SubLObject)module0005.T;
            }
            if (var234_235 == module0005.$ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0005.NIL != var11 && module0005.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic121$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var13 = (SubLObject)((module0005.NIL != var12) ? conses_high.cadr(var12) : module0005.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic118$, var4);
        final SubLObject var15 = (SubLObject)((module0005.NIL != var14) ? conses_high.cadr(var14) : module0005.NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        final SubLObject var17 = (SubLObject)module0005.$ic123$;
        final SubLObject var18 = (SubLObject)module0005.$ic124$;
        final SubLObject var19 = (SubLObject)module0005.$ic125$;
        if (module0005.NIL != var13) {
            final SubLObject var20 = (SubLObject)module0005.$ic126$;
            final SubLObject var21 = (SubLObject)module0005.$ic127$;
            final SubLObject var22 = (SubLObject)module0005.$ic128$;
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, var8), (SubLObject)ConsesLow.list(var18, var15), (SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic37$, var17))), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic55$, (SubLObject)ConsesLow.list(var20, var21, var22), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic112$, var18, (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic129$, (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic130$, var19, (SubLObject)module0005.$ic131$), (SubLObject)module0005.$ic132$), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic129$, (SubLObject)module0005.ZERO_INTEGER, var19, (SubLObject)module0005.$ic131$)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic6$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, module0005.$ic10$, var20, module0005.$ic11$, var21, module0005.$ic13$, var13, module0005.$ic12$, var22 }), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic133$, var17, var6))), ConsesLow.append(var16, (SubLObject)module0005.NIL)))));
        }
        final SubLObject var23 = (SubLObject)module0005.$ic134$;
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, var8), (SubLObject)ConsesLow.list(var18, var15), (SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic37$, var17))), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic14$, (SubLObject)ConsesLow.list(var23, var19), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic112$, var18, (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic130$, var19, var23, (SubLObject)module0005.$ic131$), var23)), (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic133$, var17, var6))), ConsesLow.append(var16, (SubLObject)module0005.NIL))));
    }
    
    public static SubLObject f144(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic136$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic136$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic136$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic114$, (SubLObject)ConsesLow.list(var6, var7), ConsesLow.append(var8, (SubLObject)module0005.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic136$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f145(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic138$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        SubLObject var8 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic138$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic138$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic138$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic114$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0005.$ic13$, var8), ConsesLow.append(var9, (SubLObject)module0005.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic138$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f146(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic138$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        SubLObject var8 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic138$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic138$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic138$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic114$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0005.$ic13$, var8), ConsesLow.append(var9, (SubLObject)module0005.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic138$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f147(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic141$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic141$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic141$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0005.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0005.NIL;
        SubLObject var258_259 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic141$);
            var258_259 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0005.$ic141$);
            if (module0005.NIL == conses_high.member(var258_259, (SubLObject)module0005.$ic142$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var10 = (SubLObject)module0005.T;
            }
            if (var258_259 == module0005.$ic9$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0005.NIL != var10 && module0005.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic141$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic117$, var4);
        final SubLObject var12 = (SubLObject)((module0005.NIL != var11) ? conses_high.cadr(var11) : module0005.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var14 = (SubLObject)((module0005.NIL != var13) ? conses_high.cadr(var13) : module0005.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        if (module0005.NIL != var12) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic143$, (SubLObject)ConsesLow.list(var12, var6, var7, (SubLObject)module0005.$ic13$, var14), ConsesLow.append(var15, (SubLObject)module0005.NIL));
        }
        final SubLObject var223_262 = (SubLObject)module0005.$ic144$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic143$, (SubLObject)ConsesLow.list(var223_262, var6, var7, (SubLObject)module0005.$ic13$, var14), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic59$, var223_262), ConsesLow.append(var15, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f148(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic145$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        SubLObject var8 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic145$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic145$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic145$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0005.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0005.NIL;
        SubLObject var271_272 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic145$);
            var271_272 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic145$);
            if (module0005.NIL == conses_high.member(var271_272, (SubLObject)module0005.$ic48$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var11 = (SubLObject)module0005.T;
            }
            if (var271_272 == module0005.$ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0005.NIL != var11 && module0005.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic145$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var13 = (SubLObject)((module0005.NIL != var12) ? conses_high.cadr(var12) : module0005.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)module0005.$ic146$;
        final SubLObject var16 = (SubLObject)module0005.$ic147$;
        final SubLObject var17 = (SubLObject)module0005.$ic148$;
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, var8), (SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic149$, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic150$, var15), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic37$, var15))), reader.bq_cons(var6, (SubLObject)module0005.$ic36$), (SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic151$, var6, var16, var15))), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic101$, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic4$, var17), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic4$, var13)), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic152$, var6, var15))), ConsesLow.append(var14, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0005.$ic153$, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic68$, var15, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic154$, var15)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic40$, var6), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic68$, var17, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic151$, var6, var16, var15))))))));
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
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic156$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        SubLObject var8 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic156$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic156$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic156$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0005.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0005.NIL;
        SubLObject var284_285 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic156$);
            var284_285 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0005.$ic156$);
            if (module0005.NIL == conses_high.member(var284_285, (SubLObject)module0005.$ic30$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var11 = (SubLObject)module0005.T;
            }
            if (var284_285 == module0005.$ic9$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0005.NIL != var11 && module0005.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic156$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic13$, var4);
        final SubLObject var13 = (SubLObject)((module0005.NIL != var12) ? conses_high.cadr(var12) : module0005.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic31$, var4);
        final SubLObject var15 = (SubLObject)((module0005.NIL != var14) ? conses_high.cadr(var14) : module0005.NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        if (module0005.NIL != var15) {
            final SubLObject var17 = (SubLObject)module0005.$ic157$;
            final SubLObject var18 = (SubLObject)module0005.$ic158$;
            final SubLObject var19 = (SubLObject)module0005.$ic159$;
            final SubLObject var20 = (SubLObject)module0005.$ic160$;
            final SubLObject var21 = (SubLObject)module0005.$ic161$;
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, var15), reader.bq_cons(var18, (SubLObject)module0005.$ic162$), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic163$, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic20$, var18, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic43$, var17)))), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic38$, (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic164$, var17, (SubLObject)module0005.$ic165$), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, var8), reader.bq_cons(var20, (SubLObject)module0005.$ic36$), (SubLObject)ConsesLow.list(var21, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic166$, var19))), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic155$, (SubLObject)ConsesLow.list(var6, var7, var19, (SubLObject)module0005.$ic13$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0005.$ic163$, var18)), ConsesLow.append(var16, (SubLObject)module0005.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic68$, var20, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic15$, var20)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic39$, var20, var21)))));
        }
        if (module0005.NIL != var13) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic22$, var13, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic167$, (SubLObject)module0005.$ic168$, (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic155$, (SubLObject)ConsesLow.list(var6, var7, var8), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic169$, var13), ConsesLow.append(var16, (SubLObject)module0005.NIL))));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic170$, (SubLObject)ConsesLow.list(var6, var7, var8), ConsesLow.append(var16, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f153(final SubLObject var27) {
        if (module0005.NIL != var27) {
            Dynamic.sublisp_throw((SubLObject)module0005.$ic168$, (SubLObject)module0005.NIL);
        }
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f154(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic171$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)module0005.$ic172$;
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list(var7), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic59$, var7), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic173$, var5, var7, ConsesLow.append(var6, (SubLObject)module0005.NIL)));
    }
    
    public static SubLObject f155(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic175$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)module0005.$ic176$;
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list(var7), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic177$, (SubLObject)ConsesLow.list(var7), var5), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic22$, var7, ConsesLow.append(var6, (SubLObject)module0005.NIL)));
    }
    
    public static SubLObject f156(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic175$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)module0005.$ic179$;
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list(var7), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic177$, (SubLObject)ConsesLow.list(var7), var5), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic180$, var7, ConsesLow.append(var6, (SubLObject)module0005.NIL)));
    }
    
    public static SubLObject f157(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        final SubLObject var6 = (SubLObject)module0005.$ic182$;
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list(var6), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic177$, (SubLObject)ConsesLow.list(var6), ConsesLow.append(var5, (SubLObject)module0005.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic180$, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic183$, var6), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic184$, (SubLObject)module0005.$ic185$, var6)));
    }
    
    public static SubLObject f158(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic187$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic188$, var5, reader.bq_cons((SubLObject)module0005.$ic181$, ConsesLow.append(var6, (SubLObject)module0005.NIL)), reader.bq_cons((SubLObject)module0005.$ic153$, ConsesLow.append(var6, (SubLObject)module0005.NIL)));
    }
    
    public static SubLObject f159(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic187$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic188$, var5, reader.bq_cons((SubLObject)module0005.$ic190$, ConsesLow.append(var6, (SubLObject)module0005.NIL)), reader.bq_cons((SubLObject)module0005.$ic153$, ConsesLow.append(var6, (SubLObject)module0005.NIL)));
    }
    
    public static SubLObject f160(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic192$, (SubLObject)module0005.NIL, ConsesLow.append(var5, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f161(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic194$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)module0005.$ic195$;
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list(var7), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic196$, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic153$, var5, (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic68$, var7, (SubLObject)module0005.$ic197$)), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic22$, var7, ConsesLow.append(var6, (SubLObject)module0005.NIL))));
    }
    
    public static SubLObject f162(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic199$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic199$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        final SubLObject var8 = (SubLObject)module0005.$ic200$;
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list(var8), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic196$, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic153$, var5, (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic68$, var8, (SubLObject)module0005.$ic197$)), (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic196$, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic22$, var8, var6), ConsesLow.append(var7, (SubLObject)module0005.NIL))));
    }
    
    public static SubLObject f163(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic203$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic203$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic203$);
            return (SubLObject)module0005.NIL;
        }
        if (module0005.NIL != module0005.$g10$.getGlobalValue()) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic59$, var5);
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic204$, var5, var6);
    }
    
    public static SubLObject f164(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic203$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic203$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic203$);
            return (SubLObject)module0005.NIL;
        }
        if (module0005.NIL != module0005.$g10$.getGlobalValue()) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic59$, var5);
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic206$, var5, var6);
    }
    
    public static SubLObject f165(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic208$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic208$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic208$);
            return (SubLObject)module0005.NIL;
        }
        if (module0005.NIL != module0005.$g10$.getGlobalValue()) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic59$, var5);
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic209$, var5, var6);
    }
    
    public static SubLObject f166(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic211$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic211$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic211$);
            return (SubLObject)module0005.NIL;
        }
        if (module0005.NIL != module0005.$g10$.getGlobalValue()) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic59$, var5);
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic212$, var5, var6);
    }
    
    public static SubLObject f167(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic214$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic214$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        if (module0005.NIL != module0005.$g10$.getGlobalValue()) {
            return (SubLObject)module0005.$ic215$;
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic216$, var5, var6, ConsesLow.append(var7, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f168(final SubLObject var1, final SubLObject var2) {
        final SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var6;
        final SubLObject var5 = var6 = var4;
        SubLObject var7 = (SubLObject)module0005.NIL;
        var7 = var6.first();
        while (module0005.NIL != var6) {
            SubLObject var337_338;
            final SubLObject var335_336 = var337_338 = var7;
            SubLObject var8 = (SubLObject)module0005.NIL;
            SubLObject var9 = (SubLObject)module0005.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var337_338, var335_336, (SubLObject)module0005.$ic218$);
            var8 = var337_338.first();
            var337_338 = (var9 = var337_338.rest());
            if (module0005.$ic219$ == var8 || module0005.NIL != f169(var8)) {
                return reader.bq_cons((SubLObject)module0005.$ic153$, ConsesLow.append(var9, (SubLObject)module0005.NIL));
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return (SubLObject)module0005.$ic215$;
    }
    
    public static SubLObject f170(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic221$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic221$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic221$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic217$, (SubLObject)ConsesLow.list(var5, var6), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic219$, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic221$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f171(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic224$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic217$, reader.bq_cons(var5, ConsesLow.append(var6, (SubLObject)module0005.NIL)));
    }
    
    public static SubLObject f172(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic224$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic217$, (SubLObject)ConsesLow.list(var5), reader.bq_cons((SubLObject)module0005.$ic219$, ConsesLow.append(var6, (SubLObject)module0005.NIL)));
    }
    
    public static SubLObject f173(final SubLObject var1, final SubLObject var2) {
        final SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var6;
        final SubLObject var5 = var6 = var4;
        SubLObject var7 = (SubLObject)module0005.NIL;
        var7 = var6.first();
        while (module0005.NIL != var6) {
            SubLObject var352_353;
            final SubLObject var350_351 = var352_353 = var7;
            SubLObject var8 = (SubLObject)module0005.NIL;
            SubLObject var9 = (SubLObject)module0005.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var352_353, var350_351, (SubLObject)module0005.$ic227$);
            var8 = var352_353.first();
            var352_353 = var352_353.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var352_353, var350_351, (SubLObject)module0005.$ic227$);
            var9 = var352_353.first();
            var352_353 = var352_353.rest();
            if (module0005.NIL == var352_353) {
                if (module0005.$ic219$ == var8 || module0005.NIL != f169(var8)) {
                    return var9;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var350_351, (SubLObject)module0005.$ic227$);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f174(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        SubLObject var7 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic221$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic221$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic221$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic226$, (SubLObject)ConsesLow.list(var5, var6), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic219$, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic221$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f175(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic224$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic226$, reader.bq_cons(var5, ConsesLow.append(var6, (SubLObject)module0005.NIL)));
    }
    
    public static SubLObject f176(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic231$);
        var5 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic229$, var5, (SubLObject)module0005.$ic197$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic231$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f177(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic224$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic226$, reader.bq_cons(var5, (SubLObject)module0005.$ic233$), reader.bq_cons((SubLObject)module0005.$ic219$, ConsesLow.append(var6, (SubLObject)module0005.NIL)));
    }
    
    public static SubLObject f178(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic224$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic226$, reader.bq_cons(var5, ConsesLow.append(var6, (SubLObject)module0005.NIL)), (SubLObject)module0005.$ic235$);
    }
    
    public static SubLObject f179(final SubLObject var364) {
        final SubLThread var365 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0005.NIL != conses_high.member(var364, reader.$features$.getDynamicValue(var365), (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) ? module0005.T : module0005.NIL);
    }
    
    public static SubLObject f169(final SubLObject var339) {
        if (var339.isAtom()) {
            if (var339.isSymbol()) {
                return f179(var339);
            }
        }
        else {
            SubLObject var340 = (SubLObject)module0005.NIL;
            SubLObject var341 = (SubLObject)module0005.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var339, var339, (SubLObject)module0005.$ic238$);
            var340 = var339.first();
            final SubLObject var342 = var341 = var339.rest();
            final SubLObject var343 = var340;
            if (var343.eql((SubLObject)module0005.$ic239$) || var343.eql((SubLObject)module0005.$ic240$) || var343.eql((SubLObject)module0005.$ic4$)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(module0005.NIL == f169(var341.first()));
            }
            if (var343.eql((SubLObject)module0005.$ic241$) || var343.eql((SubLObject)module0005.$ic242$) || var343.eql((SubLObject)module0005.$ic20$)) {
                SubLObject var344 = (SubLObject)module0005.NIL;
                if (module0005.NIL == var344) {
                    SubLObject var345;
                    SubLObject var346;
                    for (var345 = var341, var346 = (SubLObject)module0005.NIL, var346 = var345.first(); module0005.NIL == var344 && module0005.NIL != var345; var344 = f169(var346), var345 = var345.rest(), var346 = var345.first()) {}
                }
                return var344;
            }
            if (var343.eql((SubLObject)module0005.$ic243$) || var343.eql((SubLObject)module0005.$ic244$) || var343.eql((SubLObject)module0005.$ic101$)) {
                SubLObject var347 = (SubLObject)module0005.NIL;
                if (module0005.NIL == var347) {
                    SubLObject var345;
                    SubLObject var346;
                    for (var345 = var341, var346 = (SubLObject)module0005.NIL, var346 = var345.first(); module0005.NIL == var347 && module0005.NIL != var345; var347 = (SubLObject)SubLObjectFactory.makeBoolean(module0005.NIL == f169(var346)), var345 = var345.rest(), var346 = var345.first()) {}
                }
                return (SubLObject)SubLObjectFactory.makeBoolean(module0005.NIL == var347);
            }
        }
        Errors.error((SubLObject)module0005.$ic245$, var339);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f180(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic247$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        if (module0005.NIL == var5) {
            return (SubLObject)module0005.$ic248$;
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic249$, var5, (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic250$, var5, ConsesLow.append(var6, (SubLObject)module0005.NIL)));
    }
    
    public static SubLObject f181(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic252$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic252$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            final SubLObject var7 = (SubLObject)module0005.$ic253$;
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic180$, var7, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic70$, var7, var6)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic252$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f182(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic255$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic255$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0005.$ic256$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0005.$ic255$);
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : module0005.$ic257$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0005.$ic255$);
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            final SubLObject var9 = (SubLObject)module0005.$ic258$;
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, var5)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic180$, var9, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic259$, var9, var6, var7, var8)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic255$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f183(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic261$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic261$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            final SubLObject var7 = (SubLObject)module0005.$ic262$;
            final SubLObject var8 = (SubLObject)module0005.$ic263$;
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, var5)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic188$, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic264$, var8), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic114$, (SubLObject)ConsesLow.list(var7, var8), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic70$, var7, var6)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic45$, (SubLObject)ConsesLow.list(var7, var8), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic70$, var7, var6))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic261$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f184(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic266$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic266$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0005.$ic256$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0005.$ic266$);
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : module0005.$ic257$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0005.$ic266$);
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            final SubLObject var9 = (SubLObject)module0005.$ic267$;
            final SubLObject var10 = (SubLObject)module0005.$ic268$;
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var5)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic188$, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic264$, var10), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic114$, (SubLObject)ConsesLow.list(var9, var10), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic259$, var9, var6, var7, var8)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic45$, (SubLObject)ConsesLow.list(var9, var10), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic259$, var9, var6, var7, var8))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic266$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f185(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic270$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic270$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0005.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0005.NIL;
        SubLObject var395_396 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0005.$ic270$);
            var395_396 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0005.$ic270$);
            if (module0005.NIL == conses_high.member(var395_396, (SubLObject)module0005.$ic271$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var9 = (SubLObject)module0005.T;
            }
            if (var395_396 == module0005.$ic9$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0005.NIL != var9 && module0005.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic270$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic272$, var4);
        final SubLObject var11 = (SubLObject)((module0005.NIL != var10) ? conses_high.cadr(var10) : module0005.$ic256$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic273$, var4);
        final SubLObject var13 = (SubLObject)((module0005.NIL != var12) ? conses_high.cadr(var12) : module0005.$ic257$);
        if (!var13.equal((SubLObject)module0005.$ic257$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic274$, var6, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic275$, var5, var6, var11, var13));
        }
        if (var11.equal((SubLObject)module0005.$ic256$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic274$, var6, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic275$, var5, var6));
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic274$, var6, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic275$, var5, var6, var11));
    }
    
    public static SubLObject f186(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic252$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic252$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            final SubLObject var7 = (SubLObject)module0005.$ic277$;
            final SubLObject var8 = (SubLObject)module0005.$ic278$;
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic69$, var5, (SubLObject)module0005.$ic233$)), (SubLObject)ConsesLow.list(var8, var6)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic188$, var8, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic279$, var8, var7), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic274$, var6, var7)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic252$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f187(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic270$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic270$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0005.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0005.NIL;
        SubLObject var407_408 = (SubLObject)module0005.NIL;
        while (module0005.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0005.$ic270$);
            var407_408 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0005.$ic270$);
            if (module0005.NIL == conses_high.member(var407_408, (SubLObject)module0005.$ic271$, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
                var9 = (SubLObject)module0005.T;
            }
            if (var407_408 == module0005.$ic9$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0005.NIL != var9 && module0005.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic270$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic272$, var4);
        final SubLObject var11 = (SubLObject)((module0005.NIL != var10) ? conses_high.cadr(var10) : module0005.$ic256$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0005.$ic273$, var4);
        final SubLObject var13 = (SubLObject)((module0005.NIL != var12) ? conses_high.cadr(var12) : module0005.$ic257$);
        final SubLObject var14 = (SubLObject)module0005.$ic281$;
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic21$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, var5)), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic22$, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic282$, var14, var6, var11, var13), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic276$, var14, var6)));
    }
    
    public static SubLObject f188(final SubLObject var412, final SubLObject var413) {
        return ConsesLow.rplacd(conses_high.last(var412, (SubLObject)module0005.UNPROVIDED), var413);
    }
    
    public static SubLObject f189(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0005.$ic21$, (SubLObject)module0005.$ic284$, ConsesLow.append(var5, (SubLObject)module0005.NIL));
    }
    
    public static SubLObject f190(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic286$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic286$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic20$, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic4$, var5), var6);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic286$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f191(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic288$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic288$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic4$, (SubLObject)ConsesLow.list((SubLObject)module0005.EQ, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic4$, var5), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic4$, var6)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic288$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f192(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0005.NIL;
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic288$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0005.$ic288$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0005.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0005.EQ, (SubLObject)ConsesLow.list((SubLObject)module0005.$ic4$, var5), (SubLObject)ConsesLow.list((SubLObject)module0005.$ic4$, var6));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0005.$ic288$);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f193(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)module0005.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0005.$ic290$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        if (module0005.NIL != Sequences.find((SubLObject)module0005.$ic291$, reader.$features$.getDynamicValue(var3), (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED, (SubLObject)module0005.UNPROVIDED)) {
            return reader.bq_cons((SubLObject)module0005.$ic153$, ConsesLow.append(var7, (SubLObject)module0005.NIL));
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0005.$ic188$, var6, reader.bq_cons((SubLObject)module0005.$ic292$, ConsesLow.append(var7, (SubLObject)module0005.NIL)), reader.bq_cons((SubLObject)module0005.$ic153$, ConsesLow.append(var7, (SubLObject)module0005.NIL)));
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
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f195() {
        module0005.$g10$ = SubLFiles.deflexical("*IGNORE-ASSERT-TYPES?*", (SubLObject)module0005.T);
        return (SubLObject)module0005.NIL;
    }
    
    public static SubLObject f196() {
        module0002.f38((SubLObject)module0005.$ic0$);
        module0002.f38((SubLObject)module0005.$ic3$);
        module0002.f38((SubLObject)module0005.$ic5$);
        module0002.f38((SubLObject)module0005.$ic6$);
        module0002.f50((SubLObject)module0005.$ic19$, (SubLObject)module0005.$ic6$);
        module0002.f50((SubLObject)module0005.$ic27$, (SubLObject)module0005.$ic6$);
        module0002.f38((SubLObject)module0005.$ic28$);
        module0002.f38((SubLObject)module0005.$ic46$);
        module0002.f38((SubLObject)module0005.$ic50$);
        module0002.f38((SubLObject)module0005.$ic56$);
        module0002.f38((SubLObject)module0005.$ic60$);
        module0002.f38((SubLObject)module0005.$ic63$);
        module0002.f38((SubLObject)module0005.$ic72$);
        module0002.f38((SubLObject)module0005.$ic74$);
        module0002.f38((SubLObject)module0005.$ic79$);
        module0002.f38((SubLObject)module0005.$ic82$);
        module0002.f38((SubLObject)module0005.$ic86$);
        module0002.f38((SubLObject)module0005.$ic89$);
        module0002.f38((SubLObject)module0005.$ic95$);
        module0002.f38((SubLObject)module0005.$ic98$);
        module0002.f38((SubLObject)module0005.$ic102$);
        module0002.f38((SubLObject)module0005.$ic106$);
        module0002.f38((SubLObject)module0005.$ic114$);
        module0002.f38((SubLObject)module0005.$ic119$);
        module0002.f38((SubLObject)module0005.$ic135$);
        module0002.f38((SubLObject)module0005.$ic137$);
        module0002.f38((SubLObject)module0005.$ic139$);
        module0002.f38((SubLObject)module0005.$ic140$);
        module0002.f38((SubLObject)module0005.$ic143$);
        module0002.f50((SubLObject)module0005.$ic151$, (SubLObject)module0005.$ic143$);
        module0002.f50((SubLObject)module0005.$ic152$, (SubLObject)module0005.$ic143$);
        module0002.f50((SubLObject)module0005.$ic154$, (SubLObject)module0005.$ic143$);
        module0002.f38((SubLObject)module0005.$ic155$);
        module0002.f50((SubLObject)module0005.$ic169$, (SubLObject)module0005.$ic155$);
        module0002.f38((SubLObject)module0005.$ic167$);
        module0002.f38((SubLObject)module0005.$ic174$);
        module0002.f38((SubLObject)module0005.$ic178$);
        module0002.f38((SubLObject)module0005.$ic181$);
        module0002.f38((SubLObject)module0005.$ic186$);
        module0002.f38((SubLObject)module0005.$ic189$);
        module0002.f38((SubLObject)module0005.$ic191$);
        module0002.f38((SubLObject)module0005.$ic193$);
        module0002.f38((SubLObject)module0005.$ic198$);
        module0002.f38((SubLObject)module0005.$ic201$);
        module0002.f38((SubLObject)module0005.$ic202$);
        module0002.f38((SubLObject)module0005.$ic205$);
        module0002.f38((SubLObject)module0005.$ic207$);
        module0002.f38((SubLObject)module0005.$ic210$);
        module0002.f38((SubLObject)module0005.$ic213$);
        module0002.f38((SubLObject)module0005.$ic217$);
        module0002.f38((SubLObject)module0005.$ic220$);
        module0001.f5((SubLObject)module0005.$ic220$, (SubLObject)module0005.$ic222$);
        module0002.f38((SubLObject)module0005.$ic223$);
        module0002.f38((SubLObject)module0005.$ic225$);
        module0002.f38((SubLObject)module0005.$ic226$);
        module0002.f38((SubLObject)module0005.$ic228$);
        module0001.f5((SubLObject)module0005.$ic228$, (SubLObject)module0005.$ic222$);
        module0002.f38((SubLObject)module0005.$ic229$);
        module0002.f38((SubLObject)module0005.$ic230$);
        module0002.f38((SubLObject)module0005.$ic232$);
        module0002.f38((SubLObject)module0005.$ic234$);
        module0002.f38((SubLObject)module0005.$ic236$);
        module0002.f38((SubLObject)module0005.$ic237$);
        module0002.f38((SubLObject)module0005.$ic246$);
        module0002.f38((SubLObject)module0005.$ic251$);
        module0002.f38((SubLObject)module0005.$ic254$);
        module0002.f38((SubLObject)module0005.$ic260$);
        module0002.f38((SubLObject)module0005.$ic265$);
        module0002.f38((SubLObject)module0005.$ic269$);
        module0002.f38((SubLObject)module0005.$ic276$);
        module0002.f38((SubLObject)module0005.$ic280$);
        module0002.f38((SubLObject)module0005.$ic283$);
        module0002.f38((SubLObject)module0005.$ic285$);
        module0002.f38((SubLObject)module0005.$ic287$);
        module0002.f38((SubLObject)module0005.$ic289$);
        return (SubLObject)module0005.NIL;
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
        module0005.$g10$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("UNTIL");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic2$ = SubLObjectFactory.makeSymbol("CDO");
        $ic3$ = SubLObjectFactory.makeSymbol("WHILE");
        $ic4$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic5$ = SubLObjectFactory.makeSymbol("REPEAT-FOREVER");
        $ic6$ = SubLObjectFactory.makeSymbol("DO-NUMBERS");
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#123", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)module0005.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#126", "CYC"), (SubLObject)module0005.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)SubLObjectFactory.makeKeyword("DELTA"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic9$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic10$ = SubLObjectFactory.makeKeyword("START");
        $ic11$ = SubLObjectFactory.makeKeyword("END");
        $ic12$ = SubLObjectFactory.makeKeyword("DELTA");
        $ic13$ = SubLObjectFactory.makeKeyword("DONE");
        $ic14$ = SubLObjectFactory.makeSymbol("CDOTIMES");
        $ic15$ = SubLObjectFactory.makeSymbol("1+");
        $ic16$ = SubLObjectFactory.makeSymbol("+");
        $ic17$ = SubLObjectFactory.makeUninternedSymbol("US#3D54294");
        $ic18$ = SubLObjectFactory.makeUninternedSymbol("US#36A439E");
        $ic19$ = SubLObjectFactory.makeSymbol("S#113", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("COR");
        $ic21$ = SubLObjectFactory.makeSymbol("CLET");
        $ic22$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#123", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#128", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#129", "CYC"));
        $ic24$ = SubLObjectFactory.makeSymbol(">=");
        $ic25$ = SubLObjectFactory.makeSymbol("<=");
        $ic26$ = SubLObjectFactory.makeSymbol("=");
        $ic27$ = SubLObjectFactory.makeSymbol("S#114", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"));
        $ic31$ = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $ic32$ = SubLObjectFactory.makeUninternedSymbol("US#7028EF8");
        $ic33$ = SubLObjectFactory.makeUninternedSymbol("US#713E610");
        $ic34$ = SubLObjectFactory.makeUninternedSymbol("US#53EB1D3");
        $ic35$ = SubLObjectFactory.makeUninternedSymbol("US#13E86D7");
        $ic36$ = ConsesLow.list((SubLObject)module0005.ZERO_INTEGER);
        $ic37$ = SubLObjectFactory.makeSymbol("LENGTH");
        $ic38$ = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic39$ = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $ic40$ = SubLObjectFactory.makeSymbol("CINC");
        $ic41$ = SubLObjectFactory.makeUninternedSymbol("US#71690C3");
        $ic42$ = SubLObjectFactory.makeSymbol("CDR");
        $ic43$ = SubLObjectFactory.makeSymbol("NULL");
        $ic44$ = SubLObjectFactory.makeSymbol("CAR");
        $ic45$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic46$ = SubLObjectFactory.makeSymbol("DO-LIST-INDEX");
        $ic47$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic49$ = SubLObjectFactory.makeUninternedSymbol("US#713E610");
        $ic50$ = SubLObjectFactory.makeSymbol("DO-ALIST");
        $ic51$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#133", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic52$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic53$ = SubLObjectFactory.makeKeyword("INDEX");
        $ic54$ = SubLObjectFactory.makeUninternedSymbol("US#53E18C3");
        $ic55$ = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $ic56$ = SubLObjectFactory.makeSymbol("DO-ALIST-VALUES");
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#133", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic58$ = SubLObjectFactory.makeUninternedSymbol("US#3165895");
        $ic59$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic60$ = SubLObjectFactory.makeSymbol("DO-ALIST-KEYS");
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#133", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic62$ = SubLObjectFactory.makeUninternedSymbol("US#1069245");
        $ic63$ = SubLObjectFactory.makeSymbol("CINC-ALIST");
        $ic64$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#133", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)module0005.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#135", "CYC"), (SubLObject)module0005.ONE_INTEGER));
        $ic65$ = SubLObjectFactory.makeUninternedSymbol("US#13A0444");
        $ic66$ = SubLObjectFactory.makeSymbol("ASSOC");
        $ic67$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic68$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic69$ = SubLObjectFactory.makeSymbol("CONS");
        $ic70$ = SubLObjectFactory.makeSymbol("CPUSH");
        $ic71$ = SubLObjectFactory.makeSymbol("RPLACD");
        $ic72$ = SubLObjectFactory.makeSymbol("CDEC-ALIST");
        $ic73$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#133", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)module0005.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#136", "CYC"), (SubLObject)module0005.ONE_INTEGER));
        $ic74$ = SubLObjectFactory.makeSymbol("DO-PLIST");
        $ic75$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#137", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic76$ = SubLObjectFactory.makeUninternedSymbol("US#3853685");
        $ic77$ = SubLObjectFactory.makeSymbol("CDDR");
        $ic78$ = SubLObjectFactory.makeSymbol("CADR");
        $ic79$ = SubLObjectFactory.makeSymbol("DO-PLIST-PROPERTIES");
        $ic80$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#137", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic81$ = SubLObjectFactory.makeUninternedSymbol("US#1069245");
        $ic82$ = SubLObjectFactory.makeSymbol("DO-PLIST-VALUES");
        $ic83$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic84$ = SubLObjectFactory.makeUninternedSymbol("US#5DE2218");
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("S#139", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic86$ = SubLObjectFactory.makeSymbol("CDOCONS");
        $ic87$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#140", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic88$ = SubLObjectFactory.makeSymbol("ATOM");
        $ic89$ = SubLObjectFactory.makeSymbol("DO-PAIRS");
        $ic90$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#142", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#140", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic91$ = SubLObjectFactory.makeUninternedSymbol("US#72660C3");
        $ic92$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic93$ = SubLObjectFactory.makeSymbol("CSOME");
        $ic94$ = SubLObjectFactory.makeSymbol("REST");
        $ic95$ = SubLObjectFactory.makeSymbol("DO-LIST-WITH-TAIL");
        $ic96$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#143", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#144", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#140", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic97$ = SubLObjectFactory.makeUninternedSymbol("US#742739B");
        $ic98$ = SubLObjectFactory.makeSymbol("DOLISTS");
        $ic99$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("SPECS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic100$ = SubLObjectFactory.makeString("CURRENT-~A");
        $ic101$ = SubLObjectFactory.makeSymbol("CAND");
        $ic102$ = SubLObjectFactory.makeSymbol("DO-STRING");
        $ic103$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHAR"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)module0005.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#145", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic104$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic105$ = SubLObjectFactory.makeKeyword("CHAR-NUM");
        $ic106$ = SubLObjectFactory.makeSymbol("DO-STRING-INDEX");
        $ic107$ = SubLObjectFactory.makeUninternedSymbol("US#1919E0D");
        $ic108$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#145", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CHAR"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)module0005.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic109$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic110$ = SubLObjectFactory.makeUninternedSymbol("US#4E23580");
        $ic111$ = SubLObjectFactory.makeUninternedSymbol("US#36A439E");
        $ic112$ = SubLObjectFactory.makeSymbol("FIF");
        $ic113$ = SubLObjectFactory.makeSymbol("CHAR");
        $ic114$ = SubLObjectFactory.makeSymbol("DO-VECTOR");
        $ic115$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#146", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#147", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic116$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ELEMENT-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD?"));
        $ic117$ = SubLObjectFactory.makeKeyword("ELEMENT-NUM");
        $ic118$ = SubLObjectFactory.makeKeyword("BACKWARD?");
        $ic119$ = SubLObjectFactory.makeSymbol("DO-VECTOR-INDEX");
        $ic120$ = SubLObjectFactory.makeUninternedSymbol("US#13ADC23");
        $ic121$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#147", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic122$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD?"));
        $ic123$ = SubLObjectFactory.makeUninternedSymbol("US#6A35D19");
        $ic124$ = SubLObjectFactory.makeUninternedSymbol("US#4FA4FBF");
        $ic125$ = SubLObjectFactory.makeUninternedSymbol("US#5044AD7");
        $ic126$ = SubLObjectFactory.makeUninternedSymbol("US#352B2C1");
        $ic127$ = SubLObjectFactory.makeUninternedSymbol("US#13A2892");
        $ic128$ = SubLObjectFactory.makeUninternedSymbol("US#1160044");
        $ic129$ = SubLObjectFactory.makeSymbol("LIST");
        $ic130$ = SubLObjectFactory.makeSymbol("-");
        $ic131$ = ConsesLow.list((SubLObject)module0005.ONE_INTEGER);
        $ic132$ = ConsesLow.list((SubLObject)module0005.MINUS_ONE_INTEGER, (SubLObject)module0005.MINUS_ONE_INTEGER);
        $ic133$ = SubLObjectFactory.makeSymbol("AREF");
        $ic134$ = SubLObjectFactory.makeUninternedSymbol("US#2676A7E");
        $ic135$ = SubLObjectFactory.makeSymbol("CDOVECTOR");
        $ic136$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic137$ = SubLObjectFactory.makeSymbol("CSOME-VECTOR");
        $ic138$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("S#139", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic139$ = SubLObjectFactory.makeSymbol("SMART-CSOMEVECTOR");
        $ic140$ = SubLObjectFactory.makeSymbol("DO-SEQUENCE");
        $ic141$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#146", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic142$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ELEMENT-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic143$ = SubLObjectFactory.makeSymbol("DO-SEQUENCE-INDEX");
        $ic144$ = SubLObjectFactory.makeUninternedSymbol("US#13ADC23");
        $ic145$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#148", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#149", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic146$ = SubLObjectFactory.makeUninternedSymbol("US#1E66264");
        $ic147$ = SubLObjectFactory.makeUninternedSymbol("US#1A98E9B");
        $ic148$ = SubLObjectFactory.makeUninternedSymbol("US#5FA2DE2");
        $ic149$ = SubLObjectFactory.makeSymbol("FUNLESS");
        $ic150$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic151$ = SubLObjectFactory.makeSymbol("S#116", "CYC");
        $ic152$ = SubLObjectFactory.makeSymbol("S#117", "CYC");
        $ic153$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic154$ = SubLObjectFactory.makeSymbol("S#118", "CYC");
        $ic155$ = SubLObjectFactory.makeSymbol("DO-HASH-TABLE");
        $ic156$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("HASH-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic157$ = SubLObjectFactory.makeUninternedSymbol("US#7028EF8");
        $ic158$ = SubLObjectFactory.makeUninternedSymbol("US#2D3BFD5");
        $ic159$ = SubLObjectFactory.makeUninternedSymbol("US#7C5C08F");
        $ic160$ = SubLObjectFactory.makeUninternedSymbol("US#3F92607");
        $ic161$ = SubLObjectFactory.makeUninternedSymbol("US#1FD7008");
        $ic162$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*"));
        $ic163$ = SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*");
        $ic164$ = SubLObjectFactory.makeSymbol("FIRST-OF");
        $ic165$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""));
        $ic166$ = SubLObjectFactory.makeSymbol("HASH-TABLE-COUNT");
        $ic167$ = SubLObjectFactory.makeSymbol("CCATCH-IGNORE");
        $ic168$ = SubLObjectFactory.makeKeyword("DO-HASH-TABLE");
        $ic169$ = SubLObjectFactory.makeSymbol("S#119", "CYC");
        $ic170$ = SubLObjectFactory.makeSymbol("CDOHASH");
        $ic171$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#150", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic172$ = SubLObjectFactory.makeUninternedSymbol("US#3C57E05");
        $ic173$ = SubLObjectFactory.makeSymbol("CCATCH");
        $ic174$ = SubLObjectFactory.makeSymbol("PUNLESS-ERROR");
        $ic175$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#151", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic176$ = SubLObjectFactory.makeUninternedSymbol("US#54A01D8");
        $ic177$ = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE");
        $ic178$ = SubLObjectFactory.makeSymbol("PWHEN-ERROR");
        $ic179$ = SubLObjectFactory.makeUninternedSymbol("US#54A01D8");
        $ic180$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic181$ = SubLObjectFactory.makeSymbol("WARN-ON-ERRORS");
        $ic182$ = SubLObjectFactory.makeUninternedSymbol("US#7028EF8");
        $ic183$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic184$ = SubLObjectFactory.makeSymbol("WARN");
        $ic185$ = SubLObjectFactory.makeString("~A");
        $ic186$ = SubLObjectFactory.makeSymbol("POSSIBLY-WARN-ON-ERRORS");
        $ic187$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic188$ = SubLObjectFactory.makeSymbol("PIF");
        $ic189$ = SubLObjectFactory.makeSymbol("POSSIBLY-IGNORE-ERRORS");
        $ic190$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS");
        $ic191$ = SubLObjectFactory.makeSymbol("WITH-DEFAULT-ERROR-HANDLING");
        $ic192$ = SubLObjectFactory.makeSymbol("WITH-ERROR-HANDLER");
        $ic193$ = SubLObjectFactory.makeSymbol("CUNWIND-ON-FAILURE");
        $ic194$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#152", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic195$ = SubLObjectFactory.makeUninternedSymbol("US#5877CEC");
        $ic196$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic197$ = ConsesLow.list((SubLObject)module0005.T);
        $ic198$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT-WITH-FAIL-CLAUSE");
        $ic199$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#152", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#153", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic200$ = SubLObjectFactory.makeUninternedSymbol("US#5877CEC");
        $ic201$ = SubLObjectFactory.makeSymbol("*IGNORE-ASSERT-TYPES?*");
        $ic202$ = SubLObjectFactory.makeSymbol("ASSERT-TYPE");
        $ic203$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"));
        $ic204$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic205$ = SubLObjectFactory.makeSymbol("ASSERT-TYPE-IF-PRESENT");
        $ic206$ = SubLObjectFactory.makeSymbol("S#156", "CYC");
        $ic207$ = SubLObjectFactory.makeSymbol("ASSERT-LIST-TYPE");
        $ic208$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"));
        $ic209$ = SubLObjectFactory.makeSymbol("S#157", "CYC");
        $ic210$ = SubLObjectFactory.makeSymbol("ASSERT-PLIST-TYPE");
        $ic211$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"));
        $ic212$ = SubLObjectFactory.makeSymbol("S#158", "CYC");
        $ic213$ = SubLObjectFactory.makeSymbol("ASSERT-MUST");
        $ic214$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#151", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#159", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#160", "CYC"));
        $ic215$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"));
        $ic216$ = SubLObjectFactory.makeSymbol("MUST");
        $ic217$ = SubLObjectFactory.makeSymbol("PCASE-FEATURE");
        $ic218$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#161", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic219$ = SubLObjectFactory.makeSymbol("OTHERWISE");
        $ic220$ = SubLObjectFactory.makeSymbol("PIF-FEATURE");
        $ic221$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#162", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#163", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#164", "CYC"));
        $ic222$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#162", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#165", "CYC"));
        $ic223$ = SubLObjectFactory.makeSymbol("PWHEN-FEATURE");
        $ic224$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#162", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic225$ = SubLObjectFactory.makeSymbol("PUNLESS-FEATURE");
        $ic226$ = SubLObjectFactory.makeSymbol("FCASE-FEATURE");
        $ic227$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#161", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#151", "CYC"));
        $ic228$ = SubLObjectFactory.makeSymbol("FIF-FEATURE");
        $ic229$ = SubLObjectFactory.makeSymbol("FWHEN-FEATURE");
        $ic230$ = SubLObjectFactory.makeSymbol("FEATURE-MATCH");
        $ic231$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#162", "CYC"));
        $ic232$ = SubLObjectFactory.makeSymbol("FUNLESS-FEATURE");
        $ic233$ = ConsesLow.list((SubLObject)module0005.NIL);
        $ic234$ = SubLObjectFactory.makeSymbol("FIMPLIES-FEATURE");
        $ic235$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE"), (SubLObject)module0005.T));
        $ic236$ = SubLObjectFactory.makeSymbol("ATOMIC-FEATURE-MATCH");
        $ic237$ = SubLObjectFactory.makeSymbol("FEATURE-EXPRESSION-MATCH");
        $ic238$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#167", "CYC"));
        $ic239$ = SubLObjectFactory.makeKeyword("NOT");
        $ic240$ = SubLObjectFactory.makeSymbol("NOT");
        $ic241$ = SubLObjectFactory.makeKeyword("OR");
        $ic242$ = SubLObjectFactory.makeSymbol("OR");
        $ic243$ = SubLObjectFactory.makeKeyword("AND");
        $ic244$ = SubLObjectFactory.makeSymbol("AND");
        $ic245$ = SubLObjectFactory.makeString("~S is not a well-formed feature expression");
        $ic246$ = SubLObjectFactory.makeSymbol("FUNCALL-IF");
        $ic247$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#168", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic248$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FALSE"));
        $ic249$ = SubLObjectFactory.makeSymbol("FWHEN");
        $ic250$ = SubLObjectFactory.makeSymbol("FUNCALL");
        $ic251$ = SubLObjectFactory.makeSymbol("CPUSH-IF");
        $ic252$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#143", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC"));
        $ic253$ = SubLObjectFactory.makeUninternedSymbol("US#506B097");
        $ic254$ = SubLObjectFactory.makeSymbol("CPUSHNEW-IF");
        $ic255$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#143", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0005.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0005.IDENTITY))));
        $ic256$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0005.EQL);
        $ic257$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0005.IDENTITY);
        $ic258$ = SubLObjectFactory.makeUninternedSymbol("US#506B097");
        $ic259$ = SubLObjectFactory.makeSymbol("CPUSHNEW");
        $ic260$ = SubLObjectFactory.makeSymbol("CPUSH-ALL");
        $ic261$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#170", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC"));
        $ic262$ = SubLObjectFactory.makeUninternedSymbol("US#35248DF");
        $ic263$ = SubLObjectFactory.makeUninternedSymbol("US#191238F");
        $ic264$ = SubLObjectFactory.makeSymbol("VECTORP");
        $ic265$ = SubLObjectFactory.makeSymbol("CPUSHNEW-ALL");
        $ic266$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#170", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0005.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0005.IDENTITY))));
        $ic267$ = SubLObjectFactory.makeUninternedSymbol("US#35248DF");
        $ic268$ = SubLObjectFactory.makeUninternedSymbol("US#191238F");
        $ic269$ = SubLObjectFactory.makeSymbol("CSETF-DELETE");
        $ic270$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#143", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0005.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0005.IDENTITY))));
        $ic271$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("KEY"));
        $ic272$ = SubLObjectFactory.makeKeyword("TEST");
        $ic273$ = SubLObjectFactory.makeKeyword("KEY");
        $ic274$ = SubLObjectFactory.makeSymbol("CSETF");
        $ic275$ = SubLObjectFactory.makeSymbol("DELETE");
        $ic276$ = SubLObjectFactory.makeSymbol("CPUSH-END");
        $ic277$ = SubLObjectFactory.makeUninternedSymbol("US#6C59149");
        $ic278$ = SubLObjectFactory.makeUninternedSymbol("US#72660C3");
        $ic279$ = SubLObjectFactory.makeSymbol("S#120", "CYC");
        $ic280$ = SubLObjectFactory.makeSymbol("CPUSHNEW-END");
        $ic281$ = SubLObjectFactory.makeUninternedSymbol("US#367CE0C");
        $ic282$ = SubLObjectFactory.makeSymbol("MEMBER");
        $ic283$ = SubLObjectFactory.makeSymbol("SILENTLY");
        $ic284$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*IGNORE-WARNS?*"), (SubLObject)module0005.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*IGNORE-BREAKS?*"), (SubLObject)module0005.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*"), (SubLObject)module0005.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONTINUE-CERROR?*"), (SubLObject)module0005.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"), (SubLObject)SubLObjectFactory.makeSymbol("*NULL-OUTPUT*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ERROR-OUTPUT*"), (SubLObject)SubLObjectFactory.makeSymbol("*NULL-OUTPUT*")));
        $ic285$ = SubLObjectFactory.makeSymbol("FIMPLIES");
        $ic286$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#171", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#172", "CYC"));
        $ic287$ = SubLObjectFactory.makeSymbol("FXOR");
        $ic288$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC"));
        $ic289$ = SubLObjectFactory.makeSymbol("FEQUIV");
        $ic290$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#175", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic291$ = SubLObjectFactory.makeKeyword("SL2JAVA");
        $ic292$ = SubLObjectFactory.makeSymbol("WITH-STATIC-AREA");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0005.class
	Total time: 670 ms
	
	Decompiled with Procyon 0.5.32.
*/