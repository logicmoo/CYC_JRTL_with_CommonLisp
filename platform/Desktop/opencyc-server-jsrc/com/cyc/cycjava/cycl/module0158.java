package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0158 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0158";
    public static final String myFingerPrint = "356852b92c59c8c833a4bc0f522de13f8b8f5b274a0157a79e05a6cf7a79f802";
    private static SubLSymbol $g2136$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLList $ic73$;
    private static final SubLSymbol $ic74$;
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
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLList $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLList $ic109$;
    private static final SubLList $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLList $ic116$;
    private static final SubLList $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLString $ic136$;
    private static final SubLList $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLObject $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLList $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLObject $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLList $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLString $ic180$;
    private static final SubLList $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLString $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLString $ic199$;
    private static final SubLList $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLString $ic208$;
    private static final SubLList $ic209$;
    private static final SubLList $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLList $ic217$;
    private static final SubLList $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLList $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLString $ic234$;
    private static final SubLList $ic235$;
    private static final SubLList $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLString $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLList $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLSymbol $ic247$;
    private static final SubLList $ic248$;
    private static final SubLList $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLList $ic251$;
    private static final SubLList $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLList $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLString $ic268$;
    private static final SubLString $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLSymbol $ic271$;
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
    private static final SubLList $ic282$;
    private static final SubLList $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLSymbol $ic285$;
    private static final SubLList $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLList $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLSymbol $ic293$;
    private static final SubLSymbol $ic294$;
    private static final SubLSymbol $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLSymbol $ic297$;
    private static final SubLString $ic298$;
    private static final SubLSymbol $ic299$;
    private static final SubLSymbol $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLSymbol $ic303$;
    private static final SubLSymbol $ic304$;
    private static final SubLSymbol $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLSymbol $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLList $ic309$;
    private static final SubLString $ic310$;
    private static final SubLList $ic311$;
    private static final SubLSymbol $ic312$;
    private static final SubLList $ic313$;
    private static final SubLString $ic314$;
    private static final SubLList $ic315$;
    private static final SubLSymbol $ic316$;
    private static final SubLSymbol $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLSymbol $ic319$;
    private static final SubLInteger $ic320$;
    private static final SubLSymbol $ic321$;
    private static final SubLSymbol $ic322$;
    private static final SubLList $ic323$;
    private static final SubLList $ic324$;
    private static final SubLSymbol $ic325$;
    private static final SubLList $ic326$;
    private static final SubLList $ic327$;
    private static final SubLObject $ic328$;
    private static final SubLObject $ic329$;
    private static final SubLObject $ic330$;
    
    public static SubLObject f9994(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, var5), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9995(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic3$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var5), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f9996(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        if (NIL == var6) {
            return reader.bq_cons((SubLObject)$ic6$, ConsesLow.append(var7, (SubLObject)NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic7$, var5, var6), ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9997(final SubLObject var12, final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL == var13 || var12.eql(var13));
    }
    
    public static SubLObject f9998(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        if (NIL == var6) {
            return reader.bq_cons((SubLObject)$ic6$, ConsesLow.append(var7, (SubLObject)NIL));
        }
        if (NIL != module0130.f8511(var6)) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic10$, var5, var6), ConsesLow.append(var7, (SubLObject)NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic10$, var5, var6)), ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f9999(final SubLObject var1, final SubLObject var2) {
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
        if (NIL == var6) {
            return reader.bq_cons((SubLObject)$ic6$, ConsesLow.append(var7, (SubLObject)NIL));
        }
        if (NIL != f10000(var6)) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic14$, var5, var6), ConsesLow.append(var7, (SubLObject)NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic14$, var5, var6)), ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f10000(final SubLObject var20) {
        return module0130.f8503(var20);
    }
    
    public static SubLObject f10001(final SubLObject var16, final SubLObject var19) {
        return module0178.f11340(var16, var19);
    }
    
    public static SubLObject f10002(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic15$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic15$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic15$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var29_30 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic15$);
            var29_30 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic15$);
            if (NIL == conses_high.member(var29_30, (SubLObject)$ic16$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var29_30 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic15$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic20$, var16), (SubLObject)ConsesLow.listS((SubLObject)$ic22$, var6, var12, (SubLObject)ConsesLow.list((SubLObject)$ic23$, var6, var14), ConsesLow.append(var17, (SubLObject)NIL)));
    }
    
    public static SubLObject f10003(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic24$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic24$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic24$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var43_44 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic24$);
            var43_44 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic24$);
            if (NIL == conses_high.member(var43_44, (SubLObject)$ic16$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var43_44 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic24$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic25$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic26$, var7), (SubLObject)$ic18$, var12, (SubLObject)$ic19$, var14, (SubLObject)$ic20$, var16), ConsesLow.append(var17, (SubLObject)NIL));
    }
    
    public static SubLObject f10004(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic27$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic27$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        if (NIL == var6) {
            return reader.bq_cons((SubLObject)$ic6$, ConsesLow.append(var7, (SubLObject)NIL));
        }
        if ($ic28$ == var6) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic29$, var5), ConsesLow.append(var7, (SubLObject)NIL));
        }
        if ($ic30$ == var6) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic31$, var5), ConsesLow.append(var7, (SubLObject)NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic32$, var5, var6)), ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f10005(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic33$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic33$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var57_58 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic33$);
            var57_58 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic33$);
            if (NIL == conses_high.member(var57_58, (SubLObject)$ic34$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var57_58 == $ic17$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic33$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic35$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        if (NIL != var13) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)ConsesLow.listS((SubLObject)$ic37$, (SubLObject)ConsesLow.list(var6, (SubLObject)$ic35$, var11), (SubLObject)ConsesLow.listS((SubLObject)$ic1$, var13, (SubLObject)$ic38$), ConsesLow.append(var14, (SubLObject)NIL)));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic37$, (SubLObject)ConsesLow.list(var6, (SubLObject)$ic35$, var11), ConsesLow.append(var14, (SubLObject)NIL));
    }
    
    public static SubLObject f10006(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic40$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic40$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var68_69 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic40$);
            var68_69 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic40$);
            if (NIL == conses_high.member(var68_69, (SubLObject)$ic41$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var68_69 == $ic17$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic40$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic35$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12;
        var4 = (var12 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic42$, reader.bq_cons(var6, ConsesLow.append((SubLObject)((NIL != var11) ? ConsesLow.list(var11) : NIL), (SubLObject)NIL)), ConsesLow.append(var12, (SubLObject)NIL));
    }
    
    public static SubLObject f10007(final SubLObject var1, final SubLObject var2) {
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
        SubLObject var11 = (SubLObject)NIL;
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
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var11 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var12;
            var4 = (var12 = var5);
            final SubLObject var13 = (SubLObject)$ic46$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list(var13), (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic49$, var13, (SubLObject)ConsesLow.list((SubLObject)$ic50$, var7, var8, var9, var10)), (SubLObject)ConsesLow.listS((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var6, var13, (SubLObject)$ic20$, var11), ConsesLow.append(var12, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic1$, var13, (SubLObject)ConsesLow.list((SubLObject)$ic52$, var13))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic45$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10008(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic53$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic53$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic53$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var83_84 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic53$);
            var83_84 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic53$);
            if (NIL == conses_high.member(var83_84, (SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var83_84 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic53$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic55$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic56$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : NIL);
        final SubLObject var21;
        var4 = (var21 = var5);
        final SubLObject var22 = (SubLObject)$ic57$;
        final SubLObject var23 = (SubLObject)$ic58$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var22, var14)), (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic59$, var7, var12, var22), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)$ic60$, var7, var12, var22), (SubLObject)$ic20$, var20), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var23, (SubLObject)$ic28$, var16, var18, var20), ConsesLow.append(var21, (SubLObject)NIL)))));
    }
    
    public static SubLObject f10009(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic63$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic63$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic63$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic63$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var99_100 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic63$);
            var99_100 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic63$);
            if (NIL == conses_high.member(var99_100, (SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var99_100 == $ic17$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic63$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic55$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic56$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : NIL);
        final SubLObject var22;
        var4 = (var22 = var5);
        final SubLObject var23 = (SubLObject)$ic64$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list(var6), (SubLObject)ConsesLow.listS((SubLObject)$ic61$, (SubLObject)ConsesLow.list(new SubLObject[] { var23, var7, $ic55$, var13, $ic56$, var15, $ic18$, var17, $ic19$, var19, $ic20$, var21 }), (SubLObject)ConsesLow.list((SubLObject)$ic49$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic65$, var23, var8)), ConsesLow.append(var22, (SubLObject)NIL)));
    }
    
    public static SubLObject f10010(final SubLObject var39, final SubLObject var106, final SubLObject var5) {
        return module0217.f14235(var39, var106, var5, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10011(final SubLObject var39, SubLObject var106, SubLObject var5) {
        if (var106 == UNPROVIDED) {
            var106 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (NIL != module0212.f13795(var39)) {
            return module0052.f3710(f10012(var39, (SubLObject)((NIL != var106) ? var106 : $ic66$), var5, (SubLObject)NIL));
        }
        final SubLObject var107 = f10013(var39, var106, var5);
        return module0052.f3689(var107, (SubLObject)$ic67$, (SubLObject)$ic68$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10013(final SubLObject var39, final SubLObject var106, final SubLObject var5) {
        final SubLObject var107 = Vectors.make_vector((SubLObject)SIX_INTEGER, (SubLObject)NIL);
        Vectors.set_aref(var107, (SubLObject)ZERO_INTEGER, var39);
        Vectors.set_aref(var107, (SubLObject)ONE_INTEGER, var5);
        Vectors.set_aref(var107, (SubLObject)TWO_INTEGER, (SubLObject)$ic69$);
        Vectors.set_aref(var107, (SubLObject)THREE_INTEGER, (SubLObject)((NIL != var106) ? ConsesLow.list(var106) : module0217.f14229(var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        Vectors.set_aref(var107, (SubLObject)FOUR_INTEGER, (SubLObject)NIL);
        Vectors.set_aref(var107, (SubLObject)FIVE_INTEGER, (SubLObject)NIL);
        return var107;
    }
    
    public static SubLObject f10014(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f10015(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f10016(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f10017(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)THREE_INTEGER);
    }
    
    public static SubLObject f10018(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)FOUR_INTEGER);
    }
    
    public static SubLObject f10019(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)FIVE_INTEGER);
    }
    
    public static SubLObject f10020(final SubLObject var107, final SubLObject var108) {
        Vectors.set_aref(var107, (SubLObject)TWO_INTEGER, var108);
        return var107;
    }
    
    public static SubLObject f10021(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)THREE_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10022(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)FOUR_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10023(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)FIVE_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10024(final SubLObject var107) {
        return f10017(var107).first();
    }
    
    public static SubLObject f10025(final SubLObject var107) {
        return f10018(var107).first();
    }
    
    public static SubLObject f10026(final SubLObject var107) {
        return f10019(var107).first();
    }
    
    public static SubLObject f10027(final SubLObject var107) {
        return (SubLObject)ConsesLow.list(f10024(var107), f10025(var107), f10026(var107));
    }
    
    public static SubLObject f10028(final SubLObject var107) {
        final SubLObject var108 = f10016(var107);
        final SubLObject var109 = f10017(var107);
        final SubLObject var110 = f10018(var107);
        final SubLObject var111 = f10019(var107);
        return (SubLObject)makeBoolean(NIL == var109 || (NIL == var108 && NIL != module0035.f1995(var109, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0035.f1994(var110, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL == var111));
    }
    
    public static SubLObject f10029(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        var108.resetMultipleValues();
        final SubLObject var109 = f10030(var107);
        final SubLObject var110 = var108.secondMultipleValue();
        var108.resetMultipleValues();
        f10031(var107);
        return Values.values(var109, var107, var110);
    }
    
    public static SubLObject f10030(final SubLObject var107) {
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        while (NIL == var108 && NIL == var109) {
            final SubLObject var110 = f10032(var107);
            if (NIL != var110) {
                final SubLObject var111 = f10014(var107);
                var108 = f10033(var111, var110);
            }
            else {
                var109 = f10034(var107);
            }
        }
        return Values.values(var108, var109);
    }
    
    public static SubLObject f10033(final SubLObject var39, final SubLObject var117) {
        return (SubLObject)ConsesLow.listS(var39, (SubLObject)$ic70$, ConsesLow.append(var117, (SubLObject)NIL));
    }
    
    public static SubLObject f10032(final SubLObject var107) {
        final SubLObject var108 = f10015(var107);
        final SubLObject var109 = f10017(var107);
        final SubLObject var110 = f10018(var107);
        final SubLObject var111 = f10019(var107);
        final SubLObject var112 = var109.first();
        final SubLObject var113 = var110.first();
        final SubLObject var114 = var111.first();
        if (NIL != var112 && NIL != var113 && NIL != var114) {
            if (NIL == var108 && NIL == module0148.f9572(var113)) {
                f10023(var107, (SubLObject)NIL);
                f10020(var107, (SubLObject)NIL);
            }
            else if (NIL != module0147.f9507(var114)) {
                return (SubLObject)ConsesLow.list(var112, var113, var114);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10034(final SubLObject var107) {
        final SubLObject var108 = f10017(var107);
        final SubLObject var109 = f10018(var107);
        final SubLObject var110 = f10019(var107);
        if (NIL == var108) {
            return (SubLObject)T;
        }
        if (NIL == var109) {
            f10035(var107);
        }
        else if (NIL == var110) {
            f10036(var107);
        }
        else {
            f10031(var107);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10035(final SubLObject var107) {
        final SubLObject var108 = f10014(var107);
        final SubLObject var109 = f10015(var107);
        SubLObject var110 = f10017(var107);
        if ($ic69$ == f10016(var107)) {
            f10020(var107, (SubLObject)NIL);
        }
        else {
            var110 = var110.rest();
            f10021(var107, var110);
        }
        final SubLObject var111 = var110.first();
        if (NIL != var111) {
            if (NIL != var109) {
                f10022(var107, (SubLObject)ConsesLow.list(var109));
            }
            else {
                f10022(var107, module0217.f14229(var108, var111, (SubLObject)UNPROVIDED));
            }
            f10020(var107, (SubLObject)$ic71$);
        }
        return var107;
    }
    
    public static SubLObject f10036(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        final SubLObject var109 = f10014(var107);
        final SubLObject var110 = f10017(var107);
        SubLObject var111 = f10018(var107);
        if ($ic71$ == f10016(var107)) {
            f10020(var107, (SubLObject)NIL);
        }
        else {
            var111 = var111.rest();
            f10022(var107, var111);
        }
        final SubLObject var112 = var111.first();
        if (NIL != var112) {
            if (NIL != module0147.f9518()) {
                f10023(var107, (SubLObject)ConsesLow.list(module0147.$g2095$.getDynamicValue(var108)));
            }
            else {
                final SubLObject var113 = var110.first();
                f10023(var107, module0217.f14229(var109, var113, var112));
            }
        }
        return var107;
    }
    
    public static SubLObject f10031(final SubLObject var107) {
        final SubLObject var108 = f10019(var107);
        f10023(var107, var108.rest());
        return var107;
    }
    
    public static SubLObject f10037(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic72$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic72$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic72$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var127_128 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic72$);
            var127_128 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic72$);
            if (NIL == conses_high.member(var127_128, (SubLObject)$ic73$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var127_128 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic72$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic35$, var4);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19;
        var4 = (var19 = var5);
        final SubLObject var20 = (SubLObject)$ic74$;
        final SubLObject var21 = (SubLObject)$ic75$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var20, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic76$, var20), (SubLObject)ConsesLow.list((SubLObject)$ic77$, (SubLObject)$ic78$, (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.listS((SubLObject)$ic79$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic80$, var20, var12, var14), (SubLObject)$ic20$, var16, (SubLObject)$ic35$, var18), ConsesLow.append(var19, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic79$, (SubLObject)ConsesLow.list(var21, (SubLObject)ConsesLow.list((SubLObject)$ic81$, var20), (SubLObject)$ic20$, var16, (SubLObject)$ic35$, var18), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var21, (SubLObject)$ic28$, var12, var14, var16), ConsesLow.append(var19, (SubLObject)NIL))))));
    }
    
    public static SubLObject f10038(final SubLObject var5) {
        return module0173.f10955(var5);
    }
    
    public static SubLObject f10039(final SubLObject var5) {
        if (NIL != module0212.f13795(var5)) {
            return module0052.f3710(f10012(var5, (SubLObject)NIL, var5, (SubLObject)NIL));
        }
        final SubLObject var6 = f10040(var5);
        return module0052.f3689(var6, (SubLObject)$ic83$, (SubLObject)$ic84$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10040(final SubLObject var5) {
        final SubLObject var6 = Vectors.make_vector((SubLObject)TWO_INTEGER, (SubLObject)NIL);
        Vectors.set_aref(var6, (SubLObject)ZERO_INTEGER, var5);
        Vectors.set_aref(var6, (SubLObject)ONE_INTEGER, module0217.f14252(var5));
        return var6;
    }
    
    public static SubLObject f10041(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f10042(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f10043(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)ONE_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10044(final SubLObject var107) {
        return f10042(var107).first();
    }
    
    public static SubLObject f10045(final SubLObject var107) {
        return (SubLObject)ConsesLow.list(f10044(var107));
    }
    
    public static SubLObject f10046(final SubLObject var107) {
        final SubLObject var108 = f10042(var107);
        return Types.sublisp_null(var108);
    }
    
    public static SubLObject f10047(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        var108.resetMultipleValues();
        final SubLObject var109 = f10048(var107);
        final SubLObject var110 = var108.secondMultipleValue();
        var108.resetMultipleValues();
        f10049(var107);
        return Values.values(var109, var107, var110);
    }
    
    public static SubLObject f10048(final SubLObject var107) {
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        while (NIL == var108 && NIL == var109) {
            final SubLObject var110 = f10050(var107);
            if (NIL != var110) {
                final SubLObject var111 = f10041(var107);
                var108 = f10051(var111, var110);
            }
            else {
                var109 = f10052(var107);
            }
        }
        return Values.values(var108, var109);
    }
    
    public static SubLObject f10051(final SubLObject var39, final SubLObject var117) {
        return (SubLObject)ConsesLow.listS(var39, (SubLObject)$ic85$, ConsesLow.append(var117, (SubLObject)NIL));
    }
    
    public static SubLObject f10050(final SubLObject var107) {
        final SubLObject var108 = f10042(var107);
        final SubLObject var109 = var108.first();
        if (NIL != var109 && NIL != module0147.f9507(var109)) {
            return (SubLObject)ConsesLow.list(var109);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10052(final SubLObject var107) {
        final SubLObject var108 = f10042(var107);
        if (NIL == var108) {
            return (SubLObject)T;
        }
        f10049(var107);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10049(final SubLObject var107) {
        final SubLObject var108 = f10042(var107);
        f10043(var107, var108.rest());
        return var107;
    }
    
    public static SubLObject f10053(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic86$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic86$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic86$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var140_141 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic86$);
            var140_141 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic86$);
            if (NIL == conses_high.member(var140_141, (SubLObject)$ic87$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var140_141 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic86$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic55$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic88$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        final SubLObject var18 = (SubLObject)$ic89$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic90$, var7, var12, var14), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)$ic91$, var7, var12, var14), (SubLObject)$ic20$, var16), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var18, (SubLObject)$ic28$, (SubLObject)NIL, (SubLObject)NIL, var16), ConsesLow.append(var17, (SubLObject)NIL))));
    }
    
    public static SubLObject f10054(final SubLObject var39, final SubLObject var86, final SubLObject var144) {
        return (SubLObject)makeBoolean(NIL != module0212.f13762(var39) && (NIL == var86 || NIL != module0004.f105(var86)) && (NIL == var144 || NIL != module0173.f10955(var144)));
    }
    
    public static SubLObject f10055(final SubLObject var39, SubLObject var106, SubLObject var144) {
        if (var106 == UNPROVIDED) {
            var106 = (SubLObject)NIL;
        }
        if (var144 == UNPROVIDED) {
            var144 = (SubLObject)NIL;
        }
        if (NIL != module0212.f13795(var39)) {
            return module0052.f3710(f10056(var39, (SubLObject)((NIL != var106) ? var106 : $ic66$), var144));
        }
        final SubLObject var145 = f10057(var39, var106, var144);
        return module0052.f3689(var145, (SubLObject)$ic93$, (SubLObject)$ic94$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10057(final SubLObject var39, final SubLObject var106, final SubLObject var144) {
        final SubLObject var145 = Vectors.make_vector((SubLObject)FIVE_INTEGER, (SubLObject)NIL);
        Vectors.set_aref(var145, (SubLObject)ZERO_INTEGER, var39);
        Vectors.set_aref(var145, (SubLObject)ONE_INTEGER, var144);
        Vectors.set_aref(var145, (SubLObject)TWO_INTEGER, (SubLObject)$ic69$);
        Vectors.set_aref(var145, (SubLObject)THREE_INTEGER, (SubLObject)((NIL != var106) ? ConsesLow.list(var106) : module0217.f14242(var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        Vectors.set_aref(var145, (SubLObject)FOUR_INTEGER, (SubLObject)NIL);
        return var145;
    }
    
    public static SubLObject f10058(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f10059(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f10060(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f10061(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)THREE_INTEGER);
    }
    
    public static SubLObject f10062(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)FOUR_INTEGER);
    }
    
    public static SubLObject f10063(final SubLObject var107, final SubLObject var108) {
        Vectors.set_aref(var107, (SubLObject)TWO_INTEGER, var108);
        return var107;
    }
    
    public static SubLObject f10064(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)THREE_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10065(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)FOUR_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10066(final SubLObject var107) {
        return f10061(var107).first();
    }
    
    public static SubLObject f10067(final SubLObject var107) {
        return f10062(var107).first();
    }
    
    public static SubLObject f10068(final SubLObject var107) {
        return (SubLObject)ConsesLow.list(f10066(var107), f10067(var107));
    }
    
    public static SubLObject f10069(final SubLObject var107) {
        final SubLObject var108 = f10060(var107);
        final SubLObject var109 = f10061(var107);
        final SubLObject var110 = f10062(var107);
        return (SubLObject)makeBoolean(NIL == var109 || (NIL == var108 && NIL != module0035.f1995(var109, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL == var110));
    }
    
    public static SubLObject f10070(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        var108.resetMultipleValues();
        final SubLObject var109 = f10071(var107);
        final SubLObject var110 = var108.secondMultipleValue();
        var108.resetMultipleValues();
        f10072(var107);
        return Values.values(var109, var107, var110);
    }
    
    public static SubLObject f10071(final SubLObject var107) {
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        while (NIL == var108 && NIL == var109) {
            final SubLObject var110 = f10073(var107);
            if (NIL != var110) {
                final SubLObject var111 = f10058(var107);
                var108 = f10074(var111, var110);
            }
            else {
                var109 = f10075(var107);
            }
        }
        return Values.values(var108, var109);
    }
    
    public static SubLObject f10074(final SubLObject var39, final SubLObject var117) {
        return (SubLObject)ConsesLow.listS(var39, (SubLObject)$ic95$, ConsesLow.append(var117, (SubLObject)NIL));
    }
    
    public static SubLObject f10073(final SubLObject var107) {
        final SubLObject var108 = f10061(var107);
        final SubLObject var109 = f10062(var107);
        final SubLObject var110 = var108.first();
        final SubLObject var111 = var109.first();
        if (NIL != var110 && NIL != var111) {
            return (SubLObject)ConsesLow.list(var110, var111);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10075(final SubLObject var107) {
        final SubLObject var108 = f10061(var107);
        final SubLObject var109 = f10062(var107);
        if (NIL == var108) {
            return (SubLObject)T;
        }
        if (NIL == var109) {
            f10076(var107);
        }
        else {
            Errors.error((SubLObject)$ic96$, var108, var109);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10076(final SubLObject var107) {
        final SubLObject var108 = f10058(var107);
        final SubLObject var109 = f10059(var107);
        SubLObject var110 = f10061(var107);
        if ($ic69$ == f10060(var107)) {
            f10063(var107, (SubLObject)NIL);
        }
        else {
            var110 = var110.rest();
            f10064(var107, var110);
        }
        final SubLObject var111 = var110.first();
        if (NIL != var111) {
            if (NIL != var109) {
                f10065(var107, (SubLObject)ConsesLow.list(var109));
            }
            else {
                f10065(var107, module0217.f14242(var108, var111, (SubLObject)UNPROVIDED));
            }
            f10063(var107, (SubLObject)$ic97$);
        }
        return var107;
    }
    
    public static SubLObject f10072(final SubLObject var107) {
        final SubLObject var108 = f10062(var107);
        f10065(var107, var108.rest());
        return var107;
    }
    
    public static SubLObject f10077(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic98$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic98$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic98$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var153_154 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic98$);
            var153_154 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic98$);
            if (NIL == conses_high.member(var153_154, (SubLObject)$ic16$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var153_154 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic98$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        final SubLObject var18 = (SubLObject)$ic99$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic100$, var7), (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)$ic101$, var7))), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var18, (SubLObject)$ic28$, var12, var14, var16), ConsesLow.append(var17, (SubLObject)NIL))));
    }
    
    public static SubLObject f10078(final SubLObject var144) {
        return module0173.f10955(var144);
    }
    
    public static SubLObject f10079(final SubLObject var1, final SubLObject var2) {
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
        SubLObject var164_165 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic103$);
            var164_165 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic103$);
            if (NIL == conses_high.member(var164_165, (SubLObject)$ic104$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var164_165 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic103$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic105$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic102$, (SubLObject)ConsesLow.list(var14, var7, (SubLObject)$ic20$, var12), (SubLObject)ConsesLow.listS((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic106$, var14))), ConsesLow.append(var13, (SubLObject)NIL)));
    }
    
    public static SubLObject f10080(final SubLObject var144) {
        if (NIL != module0212.f13795(var144)) {
            return f10012(var144, (SubLObject)$ic107$, $ic108$, module0132.$g1558$.getGlobalValue());
        }
        return reader.bq_cons(var144, (SubLObject)$ic109$);
    }
    
    public static SubLObject f10081(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic110$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic110$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic110$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var174_175 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic110$);
            var174_175 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic110$);
            if (NIL == conses_high.member(var174_175, (SubLObject)$ic111$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var174_175 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic110$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic112$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic113$, (SubLObject)$ic114$, (SubLObject)$ic19$, var12, (SubLObject)$ic20$, var14), ConsesLow.append(var15, (SubLObject)NIL));
    }
    
    public static SubLObject f10082(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic110$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic110$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic110$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var184_185 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic110$);
            var184_185 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic110$);
            if (NIL == conses_high.member(var184_185, (SubLObject)$ic111$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var184_185 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic110$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic112$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic113$, (SubLObject)$ic115$, (SubLObject)$ic19$, var12, (SubLObject)$ic20$, var14), ConsesLow.append(var15, (SubLObject)NIL));
    }
    
    public static SubLObject f10083(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic116$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic116$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic116$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var194_195 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic116$);
            var194_195 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic116$);
            if (NIL == conses_high.member(var194_195, (SubLObject)$ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var194_195 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic116$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic113$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        final SubLObject var18 = (SubLObject)$ic118$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic119$, var7, var12, var14), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)$ic120$, var7, var12, var14), (SubLObject)$ic20$, var16), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var18, (SubLObject)$ic30$, (SubLObject)NIL, var14, var16), ConsesLow.append(var17, (SubLObject)NIL))));
    }
    
    public static SubLObject f10084(final SubLObject var5, final SubLObject var197, final SubLObject var33) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var5) && (NIL == var197 || NIL != module0130.f8516(var197)) && (NIL == var33 || NIL != module0130.f8503(var33)));
    }
    
    public static SubLObject f10085(final SubLObject var5, SubLObject var197, SubLObject var33) {
        if (var197 == UNPROVIDED) {
            var197 = (SubLObject)NIL;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        if (NIL != module0212.f13795(var5)) {
            return module0052.f3710(f10086(var5, var197, (SubLObject)$ic121$));
        }
        final SubLObject var198 = f10087(var5, var197, var33);
        return module0052.f3689(var198, (SubLObject)$ic122$, (SubLObject)$ic123$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10087(final SubLObject var5, final SubLObject var197, final SubLObject var33) {
        final SubLObject var198 = Vectors.make_vector((SubLObject)SIX_INTEGER, (SubLObject)NIL);
        Vectors.set_aref(var198, (SubLObject)ZERO_INTEGER, var5);
        Vectors.set_aref(var198, (SubLObject)ONE_INTEGER, var33);
        Vectors.set_aref(var198, (SubLObject)TWO_INTEGER, (SubLObject)$ic124$);
        Vectors.set_aref(var198, (SubLObject)THREE_INTEGER, (SubLObject)((NIL != var197) ? ConsesLow.list(var197) : module0217.f14268(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        Vectors.set_aref(var198, (SubLObject)FOUR_INTEGER, (SubLObject)NIL);
        Vectors.set_aref(var198, (SubLObject)FIVE_INTEGER, (SubLObject)NIL);
        return var198;
    }
    
    public static SubLObject f10088(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f10089(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f10090(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f10091(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)THREE_INTEGER);
    }
    
    public static SubLObject f10092(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)FOUR_INTEGER);
    }
    
    public static SubLObject f10093(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)FIVE_INTEGER);
    }
    
    public static SubLObject f10094(final SubLObject var107, final SubLObject var108) {
        Vectors.set_aref(var107, (SubLObject)TWO_INTEGER, var108);
        return var107;
    }
    
    public static SubLObject f10095(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)THREE_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10096(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)FOUR_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10097(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)FIVE_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10098(final SubLObject var107) {
        return f10091(var107).first();
    }
    
    public static SubLObject f10099(final SubLObject var107) {
        return f10092(var107).first();
    }
    
    public static SubLObject f10100(final SubLObject var107) {
        return f10093(var107).first();
    }
    
    public static SubLObject f10101(final SubLObject var107) {
        return (SubLObject)ConsesLow.list(f10098(var107), f10099(var107), f10100(var107));
    }
    
    public static SubLObject f10102(final SubLObject var107) {
        final SubLObject var108 = f10090(var107);
        final SubLObject var109 = f10091(var107);
        final SubLObject var110 = f10092(var107);
        final SubLObject var111 = f10093(var107);
        return (SubLObject)makeBoolean(NIL == var109 || (NIL == var108 && NIL != module0035.f1995(var109, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0035.f1994(var110, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL == var111));
    }
    
    public static SubLObject f10103(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        var108.resetMultipleValues();
        final SubLObject var109 = f10104(var107);
        final SubLObject var110 = var108.secondMultipleValue();
        var108.resetMultipleValues();
        f10105(var107);
        return Values.values(var109, var107, var110);
    }
    
    public static SubLObject f10104(final SubLObject var107) {
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        while (NIL == var108 && NIL == var109) {
            final SubLObject var110 = f10106(var107);
            if (NIL != var110) {
                final SubLObject var111 = f10088(var107);
                var108 = f10107(var111, var110);
            }
            else {
                var109 = f10108(var107);
            }
        }
        return Values.values(var108, var109);
    }
    
    public static SubLObject f10107(final SubLObject var133, final SubLObject var117) {
        return (SubLObject)ConsesLow.listS(var133, (SubLObject)$ic125$, ConsesLow.append(var117, (SubLObject)NIL));
    }
    
    public static SubLObject f10106(final SubLObject var107) {
        final SubLObject var108 = f10091(var107);
        final SubLObject var109 = f10092(var107);
        final SubLObject var110 = f10093(var107);
        final SubLObject var111 = var108.first();
        final SubLObject var112 = var109.first();
        final SubLObject var113 = var110.first();
        if (NIL != var111 && NIL != var112 && NIL != var113) {
            if (NIL != module0147.f9507(var112)) {
                return (SubLObject)ConsesLow.list(var111, var112, var113);
            }
            f10097(var107, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10108(final SubLObject var107) {
        final SubLObject var108 = f10091(var107);
        final SubLObject var109 = f10092(var107);
        final SubLObject var110 = f10093(var107);
        if (NIL == var108) {
            return (SubLObject)T;
        }
        if (NIL == var109) {
            f10109(var107);
        }
        else if (NIL == var110) {
            f10110(var107);
        }
        else {
            Errors.error((SubLObject)$ic126$, var107);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10109(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        final SubLObject var109 = f10088(var107);
        SubLObject var110 = f10091(var107);
        if ($ic124$ == f10090(var107)) {
            f10094(var107, (SubLObject)NIL);
        }
        else {
            var110 = var110.rest();
            f10095(var107, var110);
        }
        final SubLObject var111 = var110.first();
        if (NIL != var111) {
            if (NIL != module0147.f9518()) {
                f10096(var107, (SubLObject)ConsesLow.list(module0147.$g2095$.getDynamicValue(var108)));
            }
            else {
                f10096(var107, module0217.f14268(var109, var111, (SubLObject)UNPROVIDED));
            }
            f10094(var107, (SubLObject)$ic127$);
        }
        return var107;
    }
    
    public static SubLObject f10110(final SubLObject var107) {
        final SubLObject var108 = f10088(var107);
        final SubLObject var109 = f10089(var107);
        final SubLObject var110 = f10091(var107);
        SubLObject var111 = f10092(var107);
        if ($ic127$ == f10090(var107)) {
            f10094(var107, (SubLObject)NIL);
        }
        else {
            var111 = var111.rest();
            f10096(var107, var111);
        }
        final SubLObject var112 = var111.first();
        if (NIL != var112) {
            if (NIL != var109) {
                f10097(var107, (SubLObject)ConsesLow.list(var109));
            }
            else {
                final SubLObject var113 = var110.first();
                f10097(var107, module0217.f14268(var108, var113, var112));
            }
        }
        return var107;
    }
    
    public static SubLObject f10105(final SubLObject var107) {
        final SubLObject var108 = f10093(var107);
        f10097(var107, var108.rest());
        return var107;
    }
    
    public static SubLObject f10111(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic116$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic116$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic116$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var210_211 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic116$);
            var210_211 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic116$);
            if (NIL == conses_high.member(var210_211, (SubLObject)$ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var210_211 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic116$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic113$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        final SubLObject var18 = (SubLObject)$ic128$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic129$, var7, var12, var14), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)$ic130$, var7, var12, var14), (SubLObject)$ic20$, var16), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var18, (SubLObject)$ic30$, (SubLObject)NIL, var14, var16), ConsesLow.append(var17, (SubLObject)NIL))));
    }
    
    public static SubLObject f10112(final SubLObject var5, final SubLObject var197, final SubLObject var33) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var5) && (NIL == var197 || NIL != module0130.f8516(var197)) && (NIL == var33 || NIL != module0130.f8503(var33)));
    }
    
    public static SubLObject f10113(final SubLObject var5, SubLObject var197, SubLObject var33) {
        if (var197 == UNPROVIDED) {
            var197 = (SubLObject)NIL;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        if (NIL != module0212.f13795(var5)) {
            return module0052.f3710(f10086(var5, var197, (SubLObject)$ic132$));
        }
        final SubLObject var198 = f10114(var5, var197, var33);
        return module0052.f3689(var198, (SubLObject)$ic133$, (SubLObject)$ic134$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10114(final SubLObject var5, final SubLObject var197, final SubLObject var33) {
        final SubLObject var198 = Vectors.make_vector((SubLObject)SIX_INTEGER, (SubLObject)NIL);
        Vectors.set_aref(var198, (SubLObject)ZERO_INTEGER, var5);
        Vectors.set_aref(var198, (SubLObject)ONE_INTEGER, var33);
        Vectors.set_aref(var198, (SubLObject)TWO_INTEGER, (SubLObject)$ic124$);
        Vectors.set_aref(var198, (SubLObject)THREE_INTEGER, (SubLObject)((NIL != var197) ? ConsesLow.list(var197) : module0217.f14274(var5, (SubLObject)UNPROVIDED)));
        Vectors.set_aref(var198, (SubLObject)FOUR_INTEGER, (SubLObject)NIL);
        return var198;
    }
    
    public static SubLObject f10115(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f10116(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f10117(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f10118(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)THREE_INTEGER);
    }
    
    public static SubLObject f10119(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)FOUR_INTEGER);
    }
    
    public static SubLObject f10120(final SubLObject var107, final SubLObject var108) {
        Vectors.set_aref(var107, (SubLObject)TWO_INTEGER, var108);
        return var107;
    }
    
    public static SubLObject f10121(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)THREE_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10122(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)FOUR_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10123(final SubLObject var107) {
        return f10118(var107).first();
    }
    
    public static SubLObject f10124(final SubLObject var107) {
        return f10119(var107).first();
    }
    
    public static SubLObject f10125(final SubLObject var107) {
        return (SubLObject)ConsesLow.list(f10123(var107), f10124(var107));
    }
    
    public static SubLObject f10126(final SubLObject var107) {
        final SubLObject var108 = f10117(var107);
        final SubLObject var109 = f10118(var107);
        final SubLObject var110 = f10119(var107);
        return (SubLObject)makeBoolean(NIL == var109 || (NIL == var108 && NIL != module0035.f1995(var109, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL == var110));
    }
    
    public static SubLObject f10127(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        var108.resetMultipleValues();
        final SubLObject var109 = f10128(var107);
        final SubLObject var110 = var108.secondMultipleValue();
        var108.resetMultipleValues();
        f10129(var107);
        return Values.values(var109, var107, var110);
    }
    
    public static SubLObject f10128(final SubLObject var107) {
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        while (NIL == var108 && NIL == var109) {
            final SubLObject var110 = f10130(var107);
            if (NIL != var110) {
                final SubLObject var111 = f10115(var107);
                var108 = f10131(var111, var110);
            }
            else {
                var109 = f10132(var107);
            }
        }
        return Values.values(var108, var109);
    }
    
    public static SubLObject f10131(final SubLObject var133, final SubLObject var117) {
        return (SubLObject)ConsesLow.listS(var133, (SubLObject)$ic135$, ConsesLow.append(var117, (SubLObject)NIL));
    }
    
    public static SubLObject f10130(final SubLObject var107) {
        final SubLObject var108 = f10118(var107);
        final SubLObject var109 = f10119(var107);
        final SubLObject var110 = var108.first();
        final SubLObject var111 = var109.first();
        if (NIL != var110 && NIL != var111) {
            return (SubLObject)ConsesLow.list(var110, var111);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10132(final SubLObject var107) {
        final SubLObject var108 = f10118(var107);
        final SubLObject var109 = f10119(var107);
        if (NIL == var108) {
            return (SubLObject)T;
        }
        if (NIL == var109) {
            f10133(var107);
        }
        else {
            Errors.error((SubLObject)$ic136$, var107);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10133(final SubLObject var107) {
        final SubLObject var108 = f10115(var107);
        final SubLObject var109 = f10116(var107);
        SubLObject var110 = f10118(var107);
        if ($ic124$ == f10117(var107)) {
            f10120(var107, (SubLObject)NIL);
        }
        else {
            var110 = var110.rest();
            f10121(var107, var110);
        }
        final SubLObject var111 = var110.first();
        if (NIL != var111) {
            if (NIL != var109) {
                f10122(var107, (SubLObject)ConsesLow.list(var109));
            }
            else {
                f10122(var107, module0217.f14274(var108, var111));
            }
        }
        return var107;
    }
    
    public static SubLObject f10129(final SubLObject var107) {
        final SubLObject var108 = f10119(var107);
        f10122(var107, var108.rest());
        return var107;
    }
    
    public static SubLObject f10134(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic137$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic137$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic137$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var222_223 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic137$);
            var222_223 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic137$);
            if (NIL == conses_high.member(var222_223, (SubLObject)$ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var222_223 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic137$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic113$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        final SubLObject var18 = (SubLObject)$ic138$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic139$, var7, var12, var14), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)$ic140$, var7, var12, var14), (SubLObject)$ic20$, var16), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var18, (SubLObject)$ic30$, (SubLObject)NIL, var14, var16), ConsesLow.append(var17, (SubLObject)NIL))));
    }
    
    public static SubLObject f10135(final SubLObject var218, final SubLObject var197, final SubLObject var33) {
        return f10136(var218, var197, var33);
    }
    
    public static SubLObject f10137(final SubLObject var218, SubLObject var197, SubLObject var33) {
        if (var197 == UNPROVIDED) {
            var197 = (SubLObject)NIL;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        if (NIL != module0212.f13795(var218)) {
            return module0052.f3710(f10086(var218, var197, (SubLObject)$ic142$));
        }
        final SubLObject var219 = f10138($ic143$, (SubLObject)$ic144$, var218, var197, var33);
        return module0052.f3689(var219, (SubLObject)$ic145$, (SubLObject)$ic146$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10139(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic137$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic137$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic137$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var233_234 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic137$);
            var233_234 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic137$);
            if (NIL == conses_high.member(var233_234, (SubLObject)$ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var233_234 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic137$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic113$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        final SubLObject var18 = (SubLObject)$ic147$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic148$, var7, var12, var14), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)$ic149$, var7, var12, var14), (SubLObject)$ic20$, var16), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var18, (SubLObject)$ic30$, (SubLObject)NIL, var14, var16), ConsesLow.append(var17, (SubLObject)NIL))));
    }
    
    public static SubLObject f10140(final SubLObject var218, final SubLObject var197, final SubLObject var33) {
        return f10136(var218, var197, var33);
    }
    
    public static SubLObject f10141(final SubLObject var218, SubLObject var197, SubLObject var33) {
        if (var197 == UNPROVIDED) {
            var197 = (SubLObject)NIL;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        if (NIL != module0212.f13795(var218)) {
            return module0052.f3710(f10086(var218, var197, (SubLObject)$ic151$));
        }
        final SubLObject var219 = f10138($ic152$, (SubLObject)$ic153$, var218, var197, var33);
        return module0052.f3689(var219, (SubLObject)$ic145$, (SubLObject)$ic146$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10142(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic137$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic137$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic137$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var244_245 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic137$);
            var244_245 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic137$);
            if (NIL == conses_high.member(var244_245, (SubLObject)$ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var244_245 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic137$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic113$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        final SubLObject var18 = (SubLObject)$ic154$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic155$, var7, var12, var14), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)$ic156$, var7, var12, var14), (SubLObject)$ic20$, var16), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var18, (SubLObject)$ic30$, (SubLObject)NIL, var14, var16), ConsesLow.append(var17, (SubLObject)NIL))));
    }
    
    public static SubLObject f10143(final SubLObject var218, final SubLObject var197, final SubLObject var33) {
        return f10136(var218, var197, var33);
    }
    
    public static SubLObject f10144(final SubLObject var218, SubLObject var197, SubLObject var33) {
        if (var197 == UNPROVIDED) {
            var197 = (SubLObject)NIL;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        if (NIL != module0212.f13795(var218)) {
            return module0052.f3710(f10086(var218, var197, (SubLObject)$ic158$));
        }
        final SubLObject var219 = f10138($ic159$, (SubLObject)$ic160$, var218, var197, var33);
        return module0052.f3689(var219, (SubLObject)$ic145$, (SubLObject)$ic146$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10145(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic161$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic161$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic161$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var256_257 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic161$);
            var256_257 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic161$);
            if (NIL == conses_high.member(var256_257, (SubLObject)$ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var256_257 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic161$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic113$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        final SubLObject var18 = (SubLObject)$ic162$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic163$, var7, var12, var14), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)$ic164$, var7, var12, var14), (SubLObject)$ic20$, var16), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var18, (SubLObject)$ic30$, (SubLObject)NIL, var14, var16), ConsesLow.append(var17, (SubLObject)NIL))));
    }
    
    public static SubLObject f10146(final SubLObject var252, final SubLObject var197, final SubLObject var33) {
        return f10136(var252, var197, var33);
    }
    
    public static SubLObject f10147(final SubLObject var252, SubLObject var197, SubLObject var33) {
        if (var197 == UNPROVIDED) {
            var197 = (SubLObject)NIL;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        if (NIL != module0212.f13795(var252)) {
            return module0052.f3710(f10086(var252, var197, (SubLObject)$ic166$));
        }
        final SubLObject var253 = f10138($ic167$, (SubLObject)$ic168$, var252, var197, var33);
        return module0052.f3689(var253, (SubLObject)$ic145$, (SubLObject)$ic146$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10136(final SubLObject var261, final SubLObject var197, final SubLObject var33) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var261) && (NIL == var197 || NIL != module0130.f8516(var197)) && (NIL == var33 || NIL != module0130.f8503(var33)));
    }
    
    public static SubLObject f10138(final SubLObject var133, final SubLObject var262, final SubLObject var261, final SubLObject var197, final SubLObject var33) {
        final SubLObject var263 = Vectors.make_vector((SubLObject)EIGHT_INTEGER, (SubLObject)NIL);
        Vectors.set_aref(var263, (SubLObject)ZERO_INTEGER, var261);
        Vectors.set_aref(var263, (SubLObject)ONE_INTEGER, var33);
        Vectors.set_aref(var263, (SubLObject)TWO_INTEGER, (SubLObject)$ic124$);
        Vectors.set_aref(var263, (SubLObject)THREE_INTEGER, (SubLObject)((NIL != var197) ? ConsesLow.list(var197) : f10148(var133, var261, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        Vectors.set_aref(var263, (SubLObject)FOUR_INTEGER, (SubLObject)NIL);
        Vectors.set_aref(var263, (SubLObject)FIVE_INTEGER, (SubLObject)NIL);
        Vectors.set_aref(var263, (SubLObject)SIX_INTEGER, var133);
        Vectors.set_aref(var263, (SubLObject)SEVEN_INTEGER, var262);
        return var263;
    }
    
    public static SubLObject f10149(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f10150(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f10151(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f10152(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)THREE_INTEGER);
    }
    
    public static SubLObject f10153(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)FOUR_INTEGER);
    }
    
    public static SubLObject f10154(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)FIVE_INTEGER);
    }
    
    public static SubLObject f10155(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)SIX_INTEGER);
    }
    
    public static SubLObject f10156(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)SEVEN_INTEGER);
    }
    
    public static SubLObject f10157(final SubLObject var107, final SubLObject var108) {
        Vectors.set_aref(var107, (SubLObject)TWO_INTEGER, var108);
        return var107;
    }
    
    public static SubLObject f10158(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)THREE_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10159(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)FOUR_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10160(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)FIVE_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10161(final SubLObject var107) {
        return f10152(var107).first();
    }
    
    public static SubLObject f10162(final SubLObject var107) {
        return f10153(var107).first();
    }
    
    public static SubLObject f10163(final SubLObject var107) {
        return f10154(var107).first();
    }
    
    public static SubLObject f10164(final SubLObject var107) {
        return (SubLObject)ConsesLow.list(f10161(var107), f10162(var107), f10163(var107));
    }
    
    public static SubLObject f10165(final SubLObject var107) {
        final SubLObject var108 = f10151(var107);
        final SubLObject var109 = f10152(var107);
        final SubLObject var110 = f10153(var107);
        final SubLObject var111 = f10154(var107);
        return (SubLObject)makeBoolean(NIL == var109 || (NIL == var108 && NIL != module0035.f1995(var109, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0035.f1994(var110, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL == var111));
    }
    
    public static SubLObject f10166(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        var108.resetMultipleValues();
        final SubLObject var109 = f10167(var107);
        final SubLObject var110 = var108.secondMultipleValue();
        var108.resetMultipleValues();
        f10168(var107);
        return Values.values(var109, var107, var110);
    }
    
    public static SubLObject f10167(final SubLObject var107) {
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        while (NIL == var108 && NIL == var109) {
            final SubLObject var110 = f10169(var107);
            if (NIL != var110) {
                final SubLObject var111 = f10149(var107);
                final SubLObject var112 = f10156(var107);
                var108 = f10170(var111, var112, var110);
            }
            else {
                var109 = f10171(var107);
            }
        }
        return Values.values(var108, var109);
    }
    
    public static SubLObject f10170(final SubLObject var133, final SubLObject var262, final SubLObject var117) {
        return (SubLObject)ConsesLow.listS(var133, var262, ConsesLow.append(var117, (SubLObject)NIL));
    }
    
    public static SubLObject f10169(final SubLObject var107) {
        final SubLObject var108 = f10152(var107);
        final SubLObject var109 = f10153(var107);
        final SubLObject var110 = f10154(var107);
        final SubLObject var111 = var108.first();
        final SubLObject var112 = var109.first();
        final SubLObject var113 = var110.first();
        if (NIL != var111 && NIL != var112 && NIL != var113) {
            if (NIL != module0147.f9507(var112)) {
                return (SubLObject)ConsesLow.list(var111, var112, var113);
            }
            f10160(var107, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10171(final SubLObject var107) {
        final SubLObject var108 = f10152(var107);
        final SubLObject var109 = f10153(var107);
        final SubLObject var110 = f10154(var107);
        if (NIL == var108) {
            return (SubLObject)T;
        }
        if (NIL == var109) {
            f10172(var107);
        }
        else if (NIL == var110) {
            f10173(var107);
        }
        else {
            Errors.error((SubLObject)$ic169$, var107);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10172(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        final SubLObject var109 = f10155(var107);
        final SubLObject var110 = f10149(var107);
        SubLObject var111 = f10152(var107);
        if ($ic124$ == f10151(var107)) {
            f10157(var107, (SubLObject)NIL);
        }
        else {
            var111 = var111.rest();
            f10158(var107, var111);
        }
        final SubLObject var112 = var111.first();
        if (NIL != var112) {
            if (NIL != module0147.f9518()) {
                f10159(var107, (SubLObject)ConsesLow.list(module0147.$g2095$.getDynamicValue(var108)));
            }
            else {
                f10159(var107, f10148(var109, var110, var112, (SubLObject)UNPROVIDED));
            }
            f10157(var107, (SubLObject)$ic127$);
        }
        return var107;
    }
    
    public static SubLObject f10173(final SubLObject var107) {
        final SubLObject var108 = f10155(var107);
        final SubLObject var109 = f10149(var107);
        final SubLObject var110 = f10150(var107);
        final SubLObject var111 = f10152(var107);
        SubLObject var112 = f10153(var107);
        if ($ic127$ == f10151(var107)) {
            f10157(var107, (SubLObject)NIL);
        }
        else {
            var112 = var112.rest();
            f10159(var107, var112);
        }
        final SubLObject var113 = var112.first();
        if (NIL != var113) {
            if (NIL != var110) {
                f10160(var107, (SubLObject)ConsesLow.list(var110));
            }
            else {
                final SubLObject var114 = var111.first();
                f10160(var107, f10148(var108, var109, var114, var113));
            }
        }
        return var107;
    }
    
    public static SubLObject f10168(final SubLObject var107) {
        final SubLObject var108 = f10154(var107);
        f10160(var107, var108.rest());
        return var107;
    }
    
    public static SubLObject f10148(final SubLObject var133, final SubLObject var261, SubLObject var197, SubLObject var9) {
        if (var197 == UNPROVIDED) {
            var197 = (SubLObject)NIL;
        }
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (var133.eql($ic143$)) {
            return module0217.f14281(var261, var197, var9);
        }
        if (var133.eql($ic152$)) {
            return module0217.f14289(var261, var197, var9);
        }
        if (var133.eql($ic159$)) {
            return module0217.f14297(var261, var197, var9);
        }
        if (var133.eql($ic167$)) {
            return module0217.f14305(var261, var197, var9);
        }
        Errors.error((SubLObject)$ic170$, var133);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10174(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic171$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic171$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic171$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var270_271 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic171$);
            var270_271 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic171$);
            if (NIL == conses_high.member(var270_271, (SubLObject)$ic111$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var270_271 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic171$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)$ic172$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic173$, var7, var12), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)$ic174$, var7, var12), (SubLObject)$ic20$, var14), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)$ic30$, (SubLObject)NIL, var12, var14), ConsesLow.append(var15, (SubLObject)NIL))));
    }
    
    public static SubLObject f10175(final SubLObject var144, final SubLObject var33) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var144) && (NIL == var33 || NIL != module0130.f8503(var33)));
    }
    
    public static SubLObject f10176(final SubLObject var144, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        if (NIL != module0212.f13795(var144)) {
            return module0052.f3710(f10086(var144, (SubLObject)$ic115$, (SubLObject)$ic176$));
        }
        final SubLObject var145 = f10177(var144, var33);
        return module0052.f3689(var145, (SubLObject)$ic177$, (SubLObject)$ic178$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10177(final SubLObject var274, final SubLObject var33) {
        final SubLThread var275 = SubLProcess.currentSubLThread();
        final SubLObject var276 = Vectors.make_vector((SubLObject)FIVE_INTEGER, (SubLObject)NIL);
        Vectors.set_aref(var276, (SubLObject)ZERO_INTEGER, var274);
        Vectors.set_aref(var276, (SubLObject)ONE_INTEGER, var33);
        Vectors.set_aref(var276, (SubLObject)TWO_INTEGER, (SubLObject)$ic127$);
        Vectors.set_aref(var276, (SubLObject)THREE_INTEGER, (SubLObject)((NIL != module0147.f9518()) ? ConsesLow.list(module0147.$g2095$.getDynamicValue(var275)) : module0217.f14313(var274, (SubLObject)UNPROVIDED)));
        Vectors.set_aref(var276, (SubLObject)FOUR_INTEGER, (SubLObject)NIL);
        return var276;
    }
    
    public static SubLObject f10178(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f10179(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f10180(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f10181(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)THREE_INTEGER);
    }
    
    public static SubLObject f10182(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)FOUR_INTEGER);
    }
    
    public static SubLObject f10183(final SubLObject var107, final SubLObject var108) {
        Vectors.set_aref(var107, (SubLObject)TWO_INTEGER, var108);
        return var107;
    }
    
    public static SubLObject f10184(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)THREE_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10185(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)FOUR_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10186(final SubLObject var107) {
        return f10181(var107).first();
    }
    
    public static SubLObject f10187(final SubLObject var107) {
        return f10182(var107).first();
    }
    
    public static SubLObject f10188(final SubLObject var107) {
        return (SubLObject)ConsesLow.list(f10186(var107), f10187(var107));
    }
    
    public static SubLObject f10189(final SubLObject var107) {
        final SubLObject var108 = f10180(var107);
        final SubLObject var109 = f10181(var107);
        final SubLObject var110 = f10182(var107);
        return (SubLObject)makeBoolean(NIL == var109 || (NIL == var108 && NIL != module0035.f1995(var109, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL == var110));
    }
    
    public static SubLObject f10190(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        var108.resetMultipleValues();
        final SubLObject var109 = f10191(var107);
        final SubLObject var110 = var108.secondMultipleValue();
        var108.resetMultipleValues();
        f10192(var107);
        return Values.values(var109, var107, var110);
    }
    
    public static SubLObject f10191(final SubLObject var107) {
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        while (NIL == var108 && NIL == var109) {
            final SubLObject var110 = f10193(var107);
            if (NIL != var110) {
                final SubLObject var111 = f10178(var107);
                var108 = f10194(var111, var110);
            }
            else {
                var109 = f10195(var107);
            }
        }
        return Values.values(var108, var109);
    }
    
    public static SubLObject f10194(final SubLObject var133, final SubLObject var117) {
        return (SubLObject)ConsesLow.listS(var133, (SubLObject)$ic179$, ConsesLow.append(var117, (SubLObject)NIL));
    }
    
    public static SubLObject f10193(final SubLObject var107) {
        final SubLObject var108 = f10181(var107);
        final SubLObject var109 = f10182(var107);
        final SubLObject var110 = var108.first();
        final SubLObject var111 = var109.first();
        if (NIL != var110 && NIL != var111) {
            if (NIL != module0147.f9507(var110)) {
                return (SubLObject)ConsesLow.list(var110, var111);
            }
            f10185(var107, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10195(final SubLObject var107) {
        final SubLObject var108 = f10181(var107);
        final SubLObject var109 = f10182(var107);
        if (NIL == var108) {
            return (SubLObject)T;
        }
        if (NIL == var109) {
            f10196(var107);
        }
        else {
            Errors.error((SubLObject)$ic180$, var107);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10196(final SubLObject var107) {
        final SubLObject var108 = f10178(var107);
        final SubLObject var109 = f10179(var107);
        SubLObject var110 = f10181(var107);
        if ($ic127$ == f10180(var107)) {
            f10183(var107, (SubLObject)NIL);
        }
        else {
            var110 = var110.rest();
            f10184(var107, var110);
        }
        final SubLObject var111 = var110.first();
        if (NIL != var111) {
            if (NIL != var109) {
                f10185(var107, (SubLObject)ConsesLow.list(var109));
            }
            else {
                f10185(var107, module0217.f14313(var108, var111));
            }
        }
        return var107;
    }
    
    public static SubLObject f10192(final SubLObject var107) {
        final SubLObject var108 = f10182(var107);
        f10185(var107, var108.rest());
        return var107;
    }
    
    public static SubLObject f10197(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic181$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic181$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic181$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var282_283 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic181$);
            var282_283 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic181$);
            if (NIL == conses_high.member(var282_283, (SubLObject)$ic111$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var282_283 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic181$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)$ic182$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic183$, var7, var12), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)$ic184$, var7, var12), (SubLObject)$ic20$, var14), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)$ic30$, (SubLObject)NIL, var12, var14), ConsesLow.append(var15, (SubLObject)NIL))));
    }
    
    public static SubLObject f10198(final SubLObject var278, final SubLObject var33) {
        return (SubLObject)makeBoolean(NIL != module0178.f11290(var278) && (NIL == var33 || NIL != module0130.f8503(var33)));
    }
    
    public static SubLObject f10199(final SubLObject var278, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        if (NIL != module0212.f13795(var278)) {
            return module0052.f3710(f10086(var278, (SubLObject)$ic114$, (SubLObject)$ic186$));
        }
        final SubLObject var279 = f10200(var278, var33);
        return module0052.f3689(var279, (SubLObject)$ic187$, (SubLObject)$ic188$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10200(final SubLObject var278, final SubLObject var33) {
        final SubLThread var279 = SubLProcess.currentSubLThread();
        final SubLObject var280 = Vectors.make_vector((SubLObject)FIVE_INTEGER, (SubLObject)NIL);
        Vectors.set_aref(var280, (SubLObject)ZERO_INTEGER, var278);
        Vectors.set_aref(var280, (SubLObject)ONE_INTEGER, var33);
        Vectors.set_aref(var280, (SubLObject)TWO_INTEGER, (SubLObject)$ic127$);
        Vectors.set_aref(var280, (SubLObject)THREE_INTEGER, (SubLObject)((NIL != module0147.f9518()) ? ConsesLow.list(module0147.$g2095$.getDynamicValue(var279)) : module0217.f14322(var278, (SubLObject)UNPROVIDED)));
        Vectors.set_aref(var280, (SubLObject)FOUR_INTEGER, (SubLObject)NIL);
        return var280;
    }
    
    public static SubLObject f10201(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f10202(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f10203(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f10204(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)THREE_INTEGER);
    }
    
    public static SubLObject f10205(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)FOUR_INTEGER);
    }
    
    public static SubLObject f10206(final SubLObject var107, final SubLObject var108) {
        Vectors.set_aref(var107, (SubLObject)TWO_INTEGER, var108);
        return var107;
    }
    
    public static SubLObject f10207(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)THREE_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10208(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)FOUR_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10209(final SubLObject var107) {
        return f10204(var107).first();
    }
    
    public static SubLObject f10210(final SubLObject var107) {
        return f10205(var107).first();
    }
    
    public static SubLObject f10211(final SubLObject var107) {
        return (SubLObject)ConsesLow.list(f10209(var107), f10210(var107));
    }
    
    public static SubLObject f10212(final SubLObject var107) {
        final SubLObject var108 = f10203(var107);
        final SubLObject var109 = f10204(var107);
        final SubLObject var110 = f10205(var107);
        return (SubLObject)makeBoolean(NIL == var109 || (NIL == var108 && NIL != module0035.f1995(var109, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL == var110));
    }
    
    public static SubLObject f10213(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        var108.resetMultipleValues();
        final SubLObject var109 = f10214(var107);
        final SubLObject var110 = var108.secondMultipleValue();
        var108.resetMultipleValues();
        f10215(var107);
        return Values.values(var109, var107, var110);
    }
    
    public static SubLObject f10214(final SubLObject var107) {
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        while (NIL == var108 && NIL == var109) {
            final SubLObject var110 = f10216(var107);
            if (NIL != var110) {
                final SubLObject var111 = f10201(var107);
                var108 = f10217(var111, var110);
            }
            else {
                var109 = f10218(var107);
            }
        }
        return Values.values(var108, var109);
    }
    
    public static SubLObject f10217(final SubLObject var133, final SubLObject var117) {
        return (SubLObject)ConsesLow.listS(var133, (SubLObject)$ic189$, ConsesLow.append(var117, (SubLObject)NIL));
    }
    
    public static SubLObject f10216(final SubLObject var107) {
        final SubLObject var108 = f10204(var107);
        final SubLObject var109 = f10205(var107);
        final SubLObject var110 = var108.first();
        final SubLObject var111 = var109.first();
        if (NIL != var110 && NIL != var111) {
            if (NIL != module0147.f9507(var110)) {
                return (SubLObject)ConsesLow.list(var110, var111);
            }
            f10208(var107, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10218(final SubLObject var107) {
        final SubLObject var108 = f10204(var107);
        final SubLObject var109 = f10205(var107);
        if (NIL == var108) {
            return (SubLObject)T;
        }
        if (NIL == var109) {
            f10219(var107);
        }
        else {
            Errors.error((SubLObject)$ic190$, var107);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10219(final SubLObject var107) {
        final SubLObject var108 = f10201(var107);
        final SubLObject var109 = f10202(var107);
        SubLObject var110 = f10204(var107);
        if ($ic127$ == f10203(var107)) {
            f10206(var107, (SubLObject)NIL);
        }
        else {
            var110 = var110.rest();
            f10207(var107, var110);
        }
        final SubLObject var111 = var110.first();
        if (NIL != var111) {
            if (NIL != var109) {
                f10208(var107, (SubLObject)ConsesLow.list(var109));
            }
            else {
                f10208(var107, module0217.f14322(var108, var111));
            }
        }
        return var107;
    }
    
    public static SubLObject f10215(final SubLObject var107) {
        final SubLObject var108 = f10205(var107);
        f10208(var107, var108.rest());
        return var107;
    }
    
    public static SubLObject f10220(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic181$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic181$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic181$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var292_293 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic181$);
            var292_293 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic181$);
            if (NIL == conses_high.member(var292_293, (SubLObject)$ic111$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var292_293 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic181$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)$ic191$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic192$, var7, var12), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)$ic193$, var7, var12), (SubLObject)$ic20$, var14), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)$ic30$, (SubLObject)NIL, var12, var14), ConsesLow.append(var15, (SubLObject)NIL))));
    }
    
    public static SubLObject f10221(final SubLObject var278, final SubLObject var33) {
        return (SubLObject)makeBoolean(NIL != module0178.f11290(var278) && (NIL == var33 || NIL != module0130.f8503(var33)));
    }
    
    public static SubLObject f10222(final SubLObject var278, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        if (NIL != module0212.f13795(var278)) {
            return module0052.f3710(f10086(var278, (SubLObject)$ic114$, (SubLObject)$ic195$));
        }
        final SubLObject var279 = f10223(var278, var33);
        return module0052.f3689(var279, (SubLObject)$ic196$, (SubLObject)$ic197$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10223(final SubLObject var278, final SubLObject var33) {
        final SubLThread var279 = SubLProcess.currentSubLThread();
        final SubLObject var280 = Vectors.make_vector((SubLObject)FIVE_INTEGER, (SubLObject)NIL);
        Vectors.set_aref(var280, (SubLObject)ZERO_INTEGER, var278);
        Vectors.set_aref(var280, (SubLObject)ONE_INTEGER, var33);
        Vectors.set_aref(var280, (SubLObject)TWO_INTEGER, (SubLObject)$ic127$);
        Vectors.set_aref(var280, (SubLObject)THREE_INTEGER, (SubLObject)((NIL != module0147.f9518()) ? ConsesLow.list(module0147.$g2095$.getDynamicValue(var279)) : module0217.f14331(var278, (SubLObject)UNPROVIDED)));
        Vectors.set_aref(var280, (SubLObject)FOUR_INTEGER, (SubLObject)NIL);
        return var280;
    }
    
    public static SubLObject f10224(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f10225(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f10226(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f10227(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)THREE_INTEGER);
    }
    
    public static SubLObject f10228(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)FOUR_INTEGER);
    }
    
    public static SubLObject f10229(final SubLObject var107, final SubLObject var108) {
        Vectors.set_aref(var107, (SubLObject)TWO_INTEGER, var108);
        return var107;
    }
    
    public static SubLObject f10230(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)THREE_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10231(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)FOUR_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10232(final SubLObject var107) {
        return f10227(var107).first();
    }
    
    public static SubLObject f10233(final SubLObject var107) {
        return f10228(var107).first();
    }
    
    public static SubLObject f10234(final SubLObject var107) {
        return (SubLObject)ConsesLow.list(f10232(var107), f10233(var107));
    }
    
    public static SubLObject f10235(final SubLObject var107) {
        final SubLObject var108 = f10226(var107);
        final SubLObject var109 = f10227(var107);
        final SubLObject var110 = f10228(var107);
        return (SubLObject)makeBoolean(NIL == var109 || (NIL == var108 && NIL != module0035.f1995(var109, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL == var110));
    }
    
    public static SubLObject f10236(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        var108.resetMultipleValues();
        final SubLObject var109 = f10237(var107);
        final SubLObject var110 = var108.secondMultipleValue();
        var108.resetMultipleValues();
        f10238(var107);
        return Values.values(var109, var107, var110);
    }
    
    public static SubLObject f10237(final SubLObject var107) {
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        while (NIL == var108 && NIL == var109) {
            final SubLObject var110 = f10239(var107);
            if (NIL != var110) {
                final SubLObject var111 = f10224(var107);
                var108 = f10240(var111, var110);
            }
            else {
                var109 = f10241(var107);
            }
        }
        return Values.values(var108, var109);
    }
    
    public static SubLObject f10240(final SubLObject var133, final SubLObject var117) {
        return (SubLObject)ConsesLow.listS(var133, (SubLObject)$ic198$, ConsesLow.append(var117, (SubLObject)NIL));
    }
    
    public static SubLObject f10239(final SubLObject var107) {
        final SubLObject var108 = f10227(var107);
        final SubLObject var109 = f10228(var107);
        final SubLObject var110 = var108.first();
        final SubLObject var111 = var109.first();
        if (NIL != var110 && NIL != var111) {
            if (NIL != module0147.f9507(var110)) {
                return (SubLObject)ConsesLow.list(var110, var111);
            }
            f10231(var107, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10241(final SubLObject var107) {
        final SubLObject var108 = f10227(var107);
        final SubLObject var109 = f10228(var107);
        if (NIL == var108) {
            return (SubLObject)T;
        }
        if (NIL == var109) {
            f10242(var107);
        }
        else {
            Errors.error((SubLObject)$ic199$, var107);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10242(final SubLObject var107) {
        final SubLObject var108 = f10224(var107);
        final SubLObject var109 = f10225(var107);
        SubLObject var110 = f10227(var107);
        if ($ic127$ == f10226(var107)) {
            f10229(var107, (SubLObject)NIL);
        }
        else {
            var110 = var110.rest();
            f10230(var107, var110);
        }
        final SubLObject var111 = var110.first();
        if (NIL != var111) {
            if (NIL != var109) {
                f10231(var107, (SubLObject)ConsesLow.list(var109));
            }
            else {
                f10231(var107, module0217.f14331(var108, var111));
            }
        }
        return var107;
    }
    
    public static SubLObject f10238(final SubLObject var107) {
        final SubLObject var108 = f10228(var107);
        f10231(var107, var108.rest());
        return var107;
    }
    
    public static SubLObject f10243(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic200$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic200$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var302_303 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic200$);
            var302_303 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic200$);
            if (NIL == conses_high.member(var302_303, (SubLObject)$ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var302_303 == $ic17$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic200$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic113$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        final SubLObject var17 = (SubLObject)$ic201$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic202$, var11, var13), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)$ic203$, var11, var13), (SubLObject)$ic20$, var15), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var17, (SubLObject)$ic30$, (SubLObject)NIL, var13, var15), ConsesLow.append(var16, (SubLObject)NIL))));
    }
    
    public static SubLObject f10244(final SubLObject var197, final SubLObject var33) {
        return (SubLObject)makeBoolean((NIL == var197 || NIL != module0130.f8516(var197)) && (NIL == var33 || NIL != module0130.f8503(var33)));
    }
    
    public static SubLObject f10245(SubLObject var197, SubLObject var33) {
        if (var197 == UNPROVIDED) {
            var197 = (SubLObject)NIL;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        final SubLObject var198 = module0223.f14674();
        if (NIL != module0212.f13795(var198)) {
            return module0052.f3710(f10086(var198, var197, (SubLObject)$ic205$));
        }
        final SubLObject var199 = f10246(var197, var33);
        return module0052.f3689(var199, (SubLObject)$ic206$, (SubLObject)$ic207$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10246(final SubLObject var197, final SubLObject var33) {
        final SubLObject var198 = Vectors.make_vector((SubLObject)FIVE_INTEGER, (SubLObject)NIL);
        Vectors.set_aref(var198, (SubLObject)ZERO_INTEGER, var33);
        Vectors.set_aref(var198, (SubLObject)ONE_INTEGER, (SubLObject)$ic124$);
        Vectors.set_aref(var198, (SubLObject)TWO_INTEGER, (SubLObject)((NIL != var197) ? ConsesLow.list(var197) : module0223.f14677((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        Vectors.set_aref(var198, (SubLObject)THREE_INTEGER, (SubLObject)NIL);
        Vectors.set_aref(var198, (SubLObject)FOUR_INTEGER, (SubLObject)NIL);
        return var198;
    }
    
    public static SubLObject f10247(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f10248(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f10249(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f10250(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)THREE_INTEGER);
    }
    
    public static SubLObject f10251(final SubLObject var107) {
        return Vectors.aref(var107, (SubLObject)FOUR_INTEGER);
    }
    
    public static SubLObject f10252(final SubLObject var107, final SubLObject var108) {
        Vectors.set_aref(var107, (SubLObject)ONE_INTEGER, var108);
        return var107;
    }
    
    public static SubLObject f10253(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)TWO_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10254(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)THREE_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10255(final SubLObject var107, final SubLObject var109) {
        Vectors.set_aref(var107, (SubLObject)FOUR_INTEGER, var109);
        return var107;
    }
    
    public static SubLObject f10256(final SubLObject var107) {
        return f10249(var107).first();
    }
    
    public static SubLObject f10257(final SubLObject var107) {
        return f10250(var107).first();
    }
    
    public static SubLObject f10258(final SubLObject var107) {
        return f10251(var107).first();
    }
    
    public static SubLObject f10259(final SubLObject var107) {
        return (SubLObject)ConsesLow.list(f10256(var107), f10257(var107), f10258(var107));
    }
    
    public static SubLObject f10260(final SubLObject var107) {
        final SubLObject var108 = f10248(var107);
        final SubLObject var109 = f10249(var107);
        final SubLObject var110 = f10250(var107);
        final SubLObject var111 = f10251(var107);
        return (SubLObject)makeBoolean(NIL == var109 || (NIL == var108 && NIL != module0035.f1995(var109, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0035.f1994(var110, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL == var111));
    }
    
    public static SubLObject f10261(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        var108.resetMultipleValues();
        final SubLObject var109 = f10262(var107);
        final SubLObject var110 = var108.secondMultipleValue();
        var108.resetMultipleValues();
        f10263(var107);
        return Values.values(var109, var107, var110);
    }
    
    public static SubLObject f10262(final SubLObject var107) {
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = (SubLObject)NIL;
        while (NIL == var108 && NIL == var109) {
            final SubLObject var110 = f10264(var107);
            if (NIL != var110) {
                var108 = f10265(var110);
            }
            else {
                var109 = f10266(var107);
            }
        }
        return Values.values(var108, var109);
    }
    
    public static SubLObject f10265(final SubLObject var117) {
        return reader.bq_cons(module0223.f14674(), ConsesLow.append(var117, (SubLObject)NIL));
    }
    
    public static SubLObject f10264(final SubLObject var107) {
        final SubLObject var108 = f10249(var107);
        final SubLObject var109 = f10250(var107);
        final SubLObject var110 = f10251(var107);
        final SubLObject var111 = var108.first();
        final SubLObject var112 = var109.first();
        final SubLObject var113 = var110.first();
        if (NIL != var111 && NIL != var112 && NIL != var113) {
            if (NIL != module0147.f9507(var112)) {
                return (SubLObject)ConsesLow.list(var111, var112, var113);
            }
            f10255(var107, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10266(final SubLObject var107) {
        final SubLObject var108 = f10249(var107);
        final SubLObject var109 = f10250(var107);
        final SubLObject var110 = f10251(var107);
        if (NIL == var108) {
            return (SubLObject)T;
        }
        if (NIL == var109) {
            f10267(var107);
        }
        else if (NIL == var110) {
            f10268(var107);
        }
        else {
            Errors.error((SubLObject)$ic208$, var107);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10267(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        SubLObject var109 = f10249(var107);
        if ($ic124$ == f10248(var107)) {
            f10252(var107, (SubLObject)NIL);
        }
        else {
            var109 = var109.rest();
            f10253(var107, var109);
        }
        final SubLObject var110 = var109.first();
        if (NIL != var110) {
            if (NIL != module0147.f9518()) {
                f10254(var107, (SubLObject)ConsesLow.list(module0147.$g2095$.getDynamicValue(var108)));
            }
            else {
                f10254(var107, module0223.f14677(var110, (SubLObject)UNPROVIDED));
            }
            f10252(var107, (SubLObject)$ic127$);
        }
        return var107;
    }
    
    public static SubLObject f10268(final SubLObject var107) {
        final SubLObject var108 = f10247(var107);
        final SubLObject var109 = f10249(var107);
        SubLObject var110 = f10250(var107);
        if ($ic127$ == f10248(var107)) {
            f10252(var107, (SubLObject)NIL);
        }
        else {
            var110 = var110.rest();
            f10254(var107, var110);
        }
        final SubLObject var111 = var110.first();
        if (NIL != var111) {
            if (NIL != var108) {
                f10255(var107, (SubLObject)ConsesLow.list(var108));
            }
            else {
                final SubLObject var112 = var109.first();
                f10255(var107, module0223.f14677(var112, var111));
            }
        }
        return var107;
    }
    
    public static SubLObject f10263(final SubLObject var107) {
        final SubLObject var108 = f10251(var107);
        f10255(var107, var108.rest());
        return var107;
    }
    
    public static SubLObject f10269(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic209$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic209$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic209$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var314_315 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic209$);
            var314_315 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic209$);
            if (NIL == conses_high.member(var314_315, (SubLObject)$ic210$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var314_315 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic209$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic211$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19;
        var4 = (var19 = var5);
        final SubLObject var20 = (SubLObject)$ic212$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic213$, var7, var12), (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var20, (SubLObject)ConsesLow.list((SubLObject)$ic214$, var7))), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var20, var12, var14, var16, var18), ConsesLow.append(var19, (SubLObject)NIL))));
    }
    
    public static SubLObject f10270(final SubLObject var9, final SubLObject var50) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var9) && NIL == module0217.f14342(var9) && (NIL == var50 || NIL != module0130.f8506(var50)));
    }
    
    public static SubLObject f10271(final SubLObject var9) {
        if (NIL != module0212.f13795(var9)) {
            return f10272(var9, (SubLObject)$ic216$);
        }
        return reader.bq_cons(var9, (SubLObject)$ic217$);
    }
    
    public static SubLObject f10273(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic218$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic218$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic218$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var326_327 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic218$);
            var326_327 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic218$);
            if (NIL == conses_high.member(var326_327, (SubLObject)$ic210$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var326_327 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic218$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic211$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19;
        var4 = (var19 = var5);
        final SubLObject var20 = (SubLObject)$ic219$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic220$, var7, var12), (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var20, (SubLObject)ConsesLow.list((SubLObject)$ic221$, var7))), (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var20, var12, var14, var16, var18), (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic222$, var6), ConsesLow.append(var19, (SubLObject)NIL)))));
    }
    
    public static SubLObject f10274(final SubLObject var39, final SubLObject var50) {
        return (SubLObject)makeBoolean(NIL != module0212.f13762(var39) && (NIL == var50 || NIL != module0130.f8506(var50)));
    }
    
    public static SubLObject f10275(final SubLObject var39) {
        if (NIL != module0212.f13795(var39)) {
            return f10272(var39, (SubLObject)$ic224$);
        }
        return reader.bq_cons(var39, (SubLObject)$ic225$);
    }
    
    public static SubLObject f10276(final SubLObject var75) {
        return (SubLObject)makeBoolean(NIL != f10277(var75) || NIL != f10278(var75));
    }
    
    public static SubLObject f10277(final SubLObject var20) {
        return (SubLObject)makeBoolean(var20.first() == $ic228$ && conses_high.fourth(var20) == $ic224$);
    }
    
    public static SubLObject f10278(final SubLObject var20) {
        return Equality.eq((SubLObject)$ic229$, conses_high.second(var20));
    }
    
    public static SubLObject f10279(final SubLObject var16, final SubLObject var39) {
        return module0214.f14134(var16, var39);
    }
    
    public static SubLObject f10280(final SubLObject var16) {
        return module0147.f9508(var16);
    }
    
    public static SubLObject f10281(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic218$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic218$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic218$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var338_339 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic218$);
            var338_339 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic218$);
            if (NIL == conses_high.member(var338_339, (SubLObject)$ic210$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var338_339 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic218$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic211$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19;
        var4 = (var19 = var5);
        final SubLObject var20 = (SubLObject)$ic230$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic231$, var7, var12), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var20, (SubLObject)ConsesLow.list((SubLObject)$ic232$, var7, var12), (SubLObject)$ic20$, var18), (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var20, var12, var14, var16, var18), (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic233$, var6, var20), ConsesLow.append(var19, (SubLObject)NIL)))));
    }
    
    public static SubLObject f10282(final SubLObject var39, final SubLObject var50) {
        return (SubLObject)makeBoolean(NIL != module0212.f13762(var39) && (NIL == var50 || NIL != module0130.f8506(var50)));
    }
    
    public static SubLObject f10283(final SubLObject var39, final SubLObject var50) {
        SubLObject var51 = (SubLObject)NIL;
        if (NIL == var50 || $ic28$ == var50) {
            if (NIL != f10010(var39, (SubLObject)NIL, (SubLObject)NIL)) {
                var51 = (SubLObject)ConsesLow.cons(f10011(var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var51);
            }
            if (NIL != f10038(var39)) {
                var51 = (SubLObject)ConsesLow.cons(f10039(var39), var51);
            }
            if (NIL != f10054(var39, (SubLObject)NIL, (SubLObject)NIL)) {
                var51 = (SubLObject)ConsesLow.cons(f10055(var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var51);
            }
            if (NIL != f10078(var39)) {
                var51 = (SubLObject)ConsesLow.cons(module0052.f3710(f10080(var39)), var51);
            }
        }
        if (NIL == var50 || $ic30$ == var50) {
            if (NIL != f10084(var39, (SubLObject)NIL, (SubLObject)NIL)) {
                var51 = (SubLObject)ConsesLow.cons(f10085(var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var51);
            }
            if (NIL != f10135(var39, (SubLObject)NIL, (SubLObject)NIL)) {
                var51 = (SubLObject)ConsesLow.cons(f10137(var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var51);
            }
            if (NIL != f10143(var39, (SubLObject)NIL, (SubLObject)NIL)) {
                var51 = (SubLObject)ConsesLow.cons(f10144(var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var51);
            }
            if (NIL != f10146(var39, (SubLObject)NIL, (SubLObject)NIL)) {
                var51 = (SubLObject)ConsesLow.cons(f10147(var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var51);
            }
            if (NIL != f10175(var39, (SubLObject)NIL)) {
                var51 = (SubLObject)ConsesLow.cons(f10176(var39, (SubLObject)UNPROVIDED), var51);
            }
            if (NIL != f10198(var39, (SubLObject)NIL)) {
                var51 = (SubLObject)ConsesLow.cons(f10199(var39, (SubLObject)UNPROVIDED), var51);
            }
            if (NIL != f10221(var39, (SubLObject)NIL)) {
                var51 = (SubLObject)ConsesLow.cons(f10222(var39, (SubLObject)UNPROVIDED), var51);
            }
        }
        if (NIL != f10270(var39, (SubLObject)NIL)) {
            var51 = (SubLObject)ConsesLow.cons(module0052.f3710(f10271(var39)), var51);
        }
        if (NIL != f10274(var39, (SubLObject)NIL)) {
            var51 = (SubLObject)ConsesLow.cons(module0052.f3710(f10275(var39)), var51);
        }
        return module0052.f3749(Sequences.nreverse(var51));
    }
    
    public static SubLObject f10284(final SubLObject var16, final SubLObject var75) {
        if (NIL != f10276(var75)) {
            return module0147.f9508(var16);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f10285(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic235$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic235$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic235$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var351_352 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic235$);
            var351_352 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic235$);
            if (NIL == conses_high.member(var351_352, (SubLObject)$ic236$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var351_352 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic235$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic211$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic237$, var7, var12), (SubLObject)ConsesLow.list((SubLObject)$ic39$, (SubLObject)ConsesLow.list(var6, (SubLObject)$ic35$, (SubLObject)$ic238$, (SubLObject)$ic20$, var16), (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic239$, var6, var7, var12, var14), ConsesLow.append(var17, (SubLObject)NIL))));
    }
    
    public static SubLObject f10286(final SubLObject var9, final SubLObject var50) {
        return (SubLObject)makeBoolean(NIL != module0161.f10481(var9) && (NIL == var50 || NIL != module0130.f8506(var50)));
    }
    
    public static SubLObject f10287(final SubLObject var16, final SubLObject var9, final SubLObject var50, final SubLObject var12) {
        return (SubLObject)makeBoolean(var9.equal(module0178.f11287(var16)) && (NIL == var50 || NIL != module0178.f11321(var16, var50)) && (NIL == var12 || NIL != module0178.f11343(var16, var12)));
    }
    
    public static SubLObject f10288(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic235$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic235$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic235$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var362_363 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic235$);
            var362_363 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic235$);
            if (NIL == conses_high.member(var362_363, (SubLObject)$ic236$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var362_363 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic235$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic211$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic241$, (SubLObject)ConsesLow.list((SubLObject)$ic242$, var7), (SubLObject)ConsesLow.list((SubLObject)$ic243$, (SubLObject)ConsesLow.listS((SubLObject)$ic215$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic211$, var12, (SubLObject)$ic18$, var14, (SubLObject)$ic20$, var16), ConsesLow.append(var17, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)ConsesLow.listS((SubLObject)$ic240$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic211$, var12, (SubLObject)$ic18$, var14, (SubLObject)$ic20$, var16), ConsesLow.append(var17, (SubLObject)NIL))), (SubLObject)$ic245$);
    }
    
    public static SubLObject f10289(final SubLObject var9) {
        assert NIL != module0161.f10481(var9) : var9;
        return (SubLObject)((NIL != module0217.f14342(var9)) ? $ic244$ : $ic243$);
    }
    
    public static SubLObject f10290(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic248$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic248$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic248$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var374_375 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic248$);
            var374_375 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic248$);
            if (NIL == conses_high.member(var374_375, (SubLObject)$ic249$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var374_375 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic248$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic25$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic250$, var7), (SubLObject)$ic18$, var12, (SubLObject)$ic20$, var14), ConsesLow.append(var15, (SubLObject)NIL));
    }
    
    public static SubLObject f10291(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic251$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic251$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic251$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var385_386 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic251$);
            var385_386 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic251$);
            if (NIL == conses_high.member(var385_386, (SubLObject)$ic252$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var385_386 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic251$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic253$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic254$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic253$, var12, (SubLObject)$ic18$, var14, (SubLObject)$ic20$, var16), ConsesLow.append(var17, (SubLObject)NIL));
    }
    
    public static SubLObject f10292(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic251$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic251$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic251$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var397_398 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic251$);
            var397_398 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic251$);
            if (NIL == conses_high.member(var397_398, (SubLObject)$ic252$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var397_398 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic251$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic253$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic255$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic256$, var7, var14, var12), (SubLObject)$ic18$, var14, (SubLObject)$ic20$, var16), ConsesLow.append(var17, (SubLObject)NIL));
    }
    
    public static SubLObject f10293(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic257$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic257$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic257$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var409_410 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic257$);
            var409_410 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic257$);
            if (NIL == conses_high.member(var409_410, (SubLObject)$ic249$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var409_410 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic257$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)$ic258$;
        final SubLObject var17 = (SubLObject)$ic259$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, var7), (SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)$ic260$, var16))), (SubLObject)ConsesLow.list((SubLObject)$ic241$, var17, (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.listS((SubLObject)$ic261$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)$ic18$, var12, (SubLObject)$ic20$, var14), ConsesLow.append(var15, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic85$, (SubLObject)ConsesLow.listS((SubLObject)$ic262$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)$ic18$, var12, (SubLObject)$ic20$, var14), ConsesLow.append(var15, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic263$, (SubLObject)ConsesLow.listS((SubLObject)$ic264$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)$ic18$, var12, (SubLObject)$ic20$, var14), ConsesLow.append(var15, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic265$, (SubLObject)ConsesLow.list((SubLObject)$ic266$, var16, var17))));
    }
    
    public static SubLObject f10294(final SubLObject var405) {
        return module0217.f14396(var405, (SubLObject)$ic267$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10295(final SubLObject var405, final SubLObject var414) {
        if (NIL == var405) {
            return (SubLObject)NIL;
        }
        return Errors.cerror((SubLObject)$ic268$, (SubLObject)$ic269$, var414, var405);
    }
    
    public static SubLObject f10296(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic257$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic257$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic257$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var421_422 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic257$);
            var421_422 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic257$);
            if (NIL == conses_high.member(var421_422, (SubLObject)$ic249$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var421_422 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic257$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)$ic270$;
        final SubLObject var17 = (SubLObject)$ic271$;
        final SubLObject var18 = (SubLObject)$ic272$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic273$, (SubLObject)ConsesLow.list(var16, var17, var18), (SubLObject)ConsesLow.list((SubLObject)$ic274$, var7), (SubLObject)ConsesLow.list((SubLObject)$ic275$, var17, (SubLObject)ConsesLow.list((SubLObject)$ic275$, var18, (SubLObject)ConsesLow.listS((SubLObject)$ic61$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var16, $ic55$, var17, $ic56$, var18, $ic18$, var12, $ic20$, var14 }), ConsesLow.append(var15, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic61$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)$ic55$, var17, (SubLObject)$ic18$, var12, (SubLObject)$ic20$, var14), ConsesLow.append(var15, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic275$, var18, (SubLObject)ConsesLow.listS((SubLObject)$ic61$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)$ic56$, var18, (SubLObject)$ic18$, var12, (SubLObject)$ic20$, var14), ConsesLow.append(var15, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic61$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)$ic18$, var12, (SubLObject)$ic20$, var14), ConsesLow.append(var15, (SubLObject)NIL)))));
    }
    
    public static SubLObject f10297(final SubLObject var405) {
        return Values.values(module0217.f14396(var405, (SubLObject)$ic276$, (SubLObject)UNPROVIDED), module0217.f14396(var405, (SubLObject)$ic277$, (SubLObject)UNPROVIDED), module0217.f14396(var405, (SubLObject)$ic56$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f10298(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic257$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic257$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic257$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var431_432 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic257$);
            var431_432 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic257$);
            if (NIL == conses_high.member(var431_432, (SubLObject)$ic249$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var431_432 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic257$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic82$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic278$, var7), (SubLObject)$ic18$, var12, (SubLObject)$ic20$, var14), ConsesLow.append(var15, (SubLObject)NIL));
    }
    
    public static SubLObject f10299(final SubLObject var405) {
        return module0217.f14396(var405, (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10300(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic257$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic257$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic257$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var441_442 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic257$);
            var441_442 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic257$);
            if (NIL == conses_high.member(var441_442, (SubLObject)$ic249$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var441_442 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic257$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic279$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic280$, var7), (SubLObject)$ic18$, var12, (SubLObject)$ic20$, var14), ConsesLow.append(var15, (SubLObject)NIL));
    }
    
    public static SubLObject f10301(final SubLObject var405) {
        return module0217.f14396(var405, (SubLObject)$ic281$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10302(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic282$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic282$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic282$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var453_454 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic282$);
            var453_454 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic282$);
            if (NIL == conses_high.member(var453_454, (SubLObject)$ic283$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var453_454 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic282$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic253$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)$ic284$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic285$, (SubLObject)ConsesLow.list(var16, var7, (SubLObject)$ic253$, var12, (SubLObject)$ic20$, var14), (SubLObject)ConsesLow.listS((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic106$, var16))), ConsesLow.append(var15, (SubLObject)NIL)));
    }
    
    public static SubLObject f10303(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic286$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic286$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic286$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var464_465 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic286$);
            var464_465 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic286$);
            if (NIL == conses_high.member(var464_465, (SubLObject)$ic283$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var464_465 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic286$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic253$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic285$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic253$, var12, (SubLObject)$ic20$, var14), ConsesLow.append(var15, (SubLObject)NIL));
    }
    
    public static SubLObject f10304(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic286$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic286$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic286$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var474_475 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic286$);
            var474_475 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic286$);
            if (NIL == conses_high.member(var474_475, (SubLObject)$ic283$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var474_475 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic286$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic253$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic287$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic288$, var7, var12), (SubLObject)$ic20$, var14), ConsesLow.append(var15, (SubLObject)NIL));
    }
    
    public static SubLObject f10305(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic289$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic289$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic289$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var484_485 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic289$);
            var484_485 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic289$);
            if (NIL == conses_high.member(var484_485, (SubLObject)$ic104$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var484_485 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic289$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic290$;
        final SubLObject var15 = (SubLObject)$ic291$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, var7), (SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.list((SubLObject)$ic292$, var14))), (SubLObject)ConsesLow.list((SubLObject)$ic241$, var15, (SubLObject)ConsesLow.list((SubLObject)$ic95$, (SubLObject)ConsesLow.listS((SubLObject)$ic293$, (SubLObject)ConsesLow.list(var6, var14, (SubLObject)$ic20$, var12), ConsesLow.append(var13, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic294$, (SubLObject)ConsesLow.listS((SubLObject)$ic295$, (SubLObject)ConsesLow.list(var6, var14, (SubLObject)$ic20$, var12), ConsesLow.append(var13, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic263$, (SubLObject)ConsesLow.listS((SubLObject)$ic296$, (SubLObject)ConsesLow.list(var6, var14, (SubLObject)$ic20$, var12), ConsesLow.append(var13, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic265$, (SubLObject)ConsesLow.list((SubLObject)$ic297$, var14, var15))));
    }
    
    public static SubLObject f10306(final SubLObject var405) {
        return module0217.f14396(var405, (SubLObject)$ic267$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10307(final SubLObject var405, final SubLObject var414) {
        if (NIL == var405) {
            return (SubLObject)NIL;
        }
        return Errors.cerror((SubLObject)$ic268$, (SubLObject)$ic298$, var414, var405);
    }
    
    public static SubLObject f10308(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic289$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic289$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic289$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var493_494 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic289$);
            var493_494 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic289$);
            if (NIL == conses_high.member(var493_494, (SubLObject)$ic104$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var493_494 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic289$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic299$;
        final SubLObject var15 = (SubLObject)$ic300$;
        final SubLObject var16 = (SubLObject)$ic301$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic273$, (SubLObject)ConsesLow.list(var14, var15, var16), (SubLObject)ConsesLow.list((SubLObject)$ic302$, var7), (SubLObject)ConsesLow.list((SubLObject)$ic275$, var15, (SubLObject)ConsesLow.list((SubLObject)$ic275$, var16, (SubLObject)ConsesLow.listS((SubLObject)$ic92$, (SubLObject)ConsesLow.list(var6, var14, (SubLObject)$ic55$, var15, (SubLObject)$ic88$, var16, (SubLObject)$ic20$, var12), ConsesLow.append(var13, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic92$, (SubLObject)ConsesLow.list(var6, var14, (SubLObject)$ic55$, var15, (SubLObject)$ic20$, var12), ConsesLow.append(var13, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic275$, var16, (SubLObject)ConsesLow.listS((SubLObject)$ic92$, (SubLObject)ConsesLow.list(var6, var14, (SubLObject)$ic88$, var16, (SubLObject)$ic20$, var12), ConsesLow.append(var13, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic92$, (SubLObject)ConsesLow.list(var6, var14, (SubLObject)$ic20$, var12), ConsesLow.append(var13, (SubLObject)NIL)))));
    }
    
    public static SubLObject f10309(final SubLObject var405) {
        return Values.values(module0217.f14396(var405, (SubLObject)$ic276$, (SubLObject)UNPROVIDED), module0217.f14396(var405, (SubLObject)$ic277$, (SubLObject)UNPROVIDED), module0217.f14396(var405, (SubLObject)$ic303$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f10310(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic289$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic289$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic289$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var503_504 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic289$);
            var503_504 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic289$);
            if (NIL == conses_high.member(var503_504, (SubLObject)$ic104$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var503_504 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic289$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic102$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic304$, var7), (SubLObject)$ic20$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f10311(final SubLObject var405) {
        return module0217.f14396(var405, (SubLObject)$ic303$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10312(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic257$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic257$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic257$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var512_513 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic257$);
            var512_513 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic257$);
            if (NIL == conses_high.member(var512_513, (SubLObject)$ic249$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var512_513 == $ic17$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic257$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic279$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic305$, var7), (SubLObject)$ic18$, var12, (SubLObject)$ic20$, var14), ConsesLow.append(var15, (SubLObject)NIL));
    }
    
    public static SubLObject f10313(final SubLObject var405) {
        return module0217.f14396(var405, (SubLObject)$ic281$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10314(final SubLObject var75) {
        return Equality.eq((SubLObject)$ic228$, var75.first());
    }
    
    public static SubLObject f10315(final SubLObject var75) {
        return conses_high.second(var75);
    }
    
    public static SubLObject f10316(final SubLObject var75, SubLObject var50, SubLObject var12, SubLObject var33) {
        if (var50 == UNPROVIDED) {
            var50 = (SubLObject)NIL;
        }
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        if (NIL != f10314(var75)) {
            final SubLObject var76 = f10317(var75, var50, var12, var33);
            final SubLObject var77 = module0052.f3709(var76);
            final SubLObject var78 = module0052.f3783(var77, (SubLObject)$ic306$, (SubLObject)ConsesLow.list(var75), (SubLObject)UNPROVIDED);
            return var78;
        }
        final SubLObject var79 = hl_interface_infrastructure_oc.f8328((SubLObject)ConsesLow.list((SubLObject)$ic307$, (SubLObject)ConsesLow.list((SubLObject)$ic308$, var75), var50, var12, var33), (SubLObject)ONE_INTEGER);
        return var79;
    }
    
    public static SubLObject f10318(final SubLObject var16, final SubLObject var519) {
        final SubLThread var520 = SubLProcess.currentSubLThread();
        SubLObject var521 = (SubLObject)NIL;
        SubLObject var522 = (SubLObject)NIL;
        SubLObject var523 = (SubLObject)NIL;
        SubLObject var524 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var519, var519, (SubLObject)$ic309$);
        var521 = var519.first();
        SubLObject var525 = var519.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var525, var519, (SubLObject)$ic309$);
        var522 = var525.first();
        var525 = var525.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var525, var519, (SubLObject)$ic309$);
        var523 = var525.first();
        var525 = (var524 = var525.rest());
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var520) && $ic228$ != var521) {
            Errors.error((SubLObject)$ic310$, var519);
        }
        if ($ic28$ == var523) {
            SubLObject var526_527;
            final SubLObject var524_525 = var526_527 = var524;
            SubLObject var526 = (SubLObject)NIL;
            SubLObject var527 = (SubLObject)NIL;
            SubLObject var528 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var526_527, var524_525, (SubLObject)$ic311$);
            var526 = var526_527.first();
            var526_527 = var526_527.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var526_527, var524_525, (SubLObject)$ic311$);
            var527 = var526_527.first();
            var526_527 = var526_527.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var526_527, var524_525, (SubLObject)$ic311$);
            var528 = var526_527.first();
            var526_527 = var526_527.rest();
            if (NIL == var526_527) {
                if (NIL == var528 && NIL == module0211.f13663(var16)) {
                    return (SubLObject)NIL;
                }
                if (NIL == var527 && NIL == module0148.f9579()) {
                    final SubLObject var529 = module0178.f11332(var16);
                    if (NIL == module0148.f9572(var529)) {
                        return (SubLObject)NIL;
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var524_525, (SubLObject)$ic311$);
            }
        }
        else {
            if ($ic312$ == var523) {
                return (SubLObject)T;
            }
            if ($ic30$ == var523) {
                if (NIL == module0211.f13663(var16)) {
                    return (SubLObject)NIL;
                }
            }
            else if (NIL == var523) {
                SubLObject var533_534;
                final SubLObject var531_532 = var533_534 = var524;
                SubLObject var530 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var533_534, var531_532, (SubLObject)$ic313$);
                var530 = var533_534.first();
                var533_534 = var533_534.rest();
                if (NIL == var533_534) {
                    if ($ic216$ == var530) {
                        return (SubLObject)T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var531_532, (SubLObject)$ic313$);
                }
                if (NIL == module0211.f13663(var16)) {
                    return (SubLObject)NIL;
                }
            }
            else {
                Errors.error((SubLObject)$ic314$, var523, var519);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f10319(final SubLObject var76) {
        return module0052.f3696(var76);
    }
    
    public static SubLObject f10320(final SubLObject var75, final SubLObject var536, final SubLObject var13, final SubLObject var19) {
        SubLObject var537 = (SubLObject)NIL;
        SubLObject var538 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var75, var75, (SubLObject)$ic315$);
        var537 = var75.first();
        final SubLObject var539 = var538 = var75.rest();
        final SubLObject var540 = module0217.f14213(var537, var538);
        if (NIL == var540) {
            return (SubLObject)NIL;
        }
        assert NIL != module0212.f13820(var540) : var540;
        final SubLObject var541 = module0077.f5329(var540);
        final SubLObject var542 = module0052.f3783(var541, (SubLObject)$ic317$, (SubLObject)ConsesLow.list(var536, var13, var19), (SubLObject)UNPROVIDED);
        return var542;
    }
    
    public static SubLObject f10012(final SubLObject var39, final SubLObject var528, final SubLObject var543, final SubLObject var530) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic228$, var39, (SubLObject)$ic28$, var528, var543, var530);
    }
    
    public static SubLObject f10056(final SubLObject var39, final SubLObject var528, final SubLObject var544) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic228$, var39, (SubLObject)$ic312$, var528, var544);
    }
    
    public static SubLObject f10086(final SubLObject var39, final SubLObject var545, final SubLObject var546) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic228$, var39, (SubLObject)$ic30$, var545, var546);
    }
    
    public static SubLObject f10272(final SubLObject var39, final SubLObject var535) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic228$, var39, (SubLObject)NIL, var535);
    }
    
    public static SubLObject f10321() {
        final SubLObject var547 = $g2136$.getGlobalValue();
        if (NIL != var547) {
            module0034.f1818(var547);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10322(final SubLObject var519, final SubLObject var50, final SubLObject var12, final SubLObject var33) {
        return module0034.f1829($g2136$.getGlobalValue(), (SubLObject)ConsesLow.list(var519, var50, var12, var33), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10323(final SubLObject var519, final SubLObject var50, final SubLObject var12, final SubLObject var33) {
        SubLObject var520 = (SubLObject)NIL;
        final SubLObject var521 = f10315(var519);
        SubLObject var522 = module0212.f13798(var521);
        SubLObject var523 = (SubLObject)NIL;
        var523 = var522.first();
        while (NIL != var522) {
            if (NIL != f10324(var523, var519) && NIL != module0211.f13645(var523, var50, var12, var33)) {
                var520 = (SubLObject)ConsesLow.cons(var523, var520);
            }
            var522 = var522.rest();
            var523 = var522.first();
        }
        return Sequences.nreverse(var520);
    }
    
    public static SubLObject f10317(final SubLObject var519, final SubLObject var50, final SubLObject var12, final SubLObject var33) {
        SubLObject var520 = $g2136$.getGlobalValue();
        if (NIL == var520) {
            var520 = module0034.f1934((SubLObject)$ic318$, (SubLObject)$ic319$, (SubLObject)$ic320$, (SubLObject)EQUAL, (SubLObject)FOUR_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic321$);
        }
        final SubLObject var521 = module0034.f1780(var519, var50, var12, var33);
        final SubLObject var522 = module0034.f1814(var520, var521, (SubLObject)UNPROVIDED);
        if (var522 != $ic322$) {
            SubLObject var523 = var522;
            SubLObject var524 = (SubLObject)NIL;
            var524 = var523.first();
            while (NIL != var523) {
                SubLObject var525 = var524.first();
                final SubLObject var526 = conses_high.second(var524);
                if (var519.equal(var525.first())) {
                    var525 = var525.rest();
                    if (var50.equal(var525.first())) {
                        var525 = var525.rest();
                        if (var12.equal(var525.first())) {
                            var525 = var525.rest();
                            if (NIL != var525 && NIL == var525.rest() && var33.equal(var525.first())) {
                                return module0034.f1959(var526);
                            }
                        }
                    }
                }
                var523 = var523.rest();
                var524 = var523.first();
            }
        }
        final SubLObject var527 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f10323(var519, var50, var12, var33)));
        module0034.f1836(var520, var521, var522, var527, (SubLObject)ConsesLow.list(var519, var50, var12, var33));
        return module0034.f1959(var527);
    }
    
    public static SubLObject f10324(final SubLObject var16, final SubLObject var519) {
        final SubLThread var520 = SubLProcess.currentSubLThread();
        SubLObject var521 = (SubLObject)NIL;
        SubLObject var522 = (SubLObject)NIL;
        SubLObject var523 = (SubLObject)NIL;
        SubLObject var524 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var519, var519, (SubLObject)$ic309$);
        var521 = var519.first();
        SubLObject var525 = var519.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var525, var519, (SubLObject)$ic309$);
        var522 = var525.first();
        var525 = var525.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var525, var519, (SubLObject)$ic309$);
        var523 = var525.first();
        var525 = (var524 = var525.rest());
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var520) && $ic228$ != var521) {
            Errors.error((SubLObject)$ic310$, var519);
        }
        if (NIL != f10325(var16, var523)) {
            if ($ic28$ == var523) {
                return f10326(var16, var522, var524);
            }
            if ($ic312$ == var523) {
                return f10327(var16, var522, var524);
            }
            if ($ic30$ == var523) {
                return f10328(var16, var522, var524);
            }
            if (NIL == var523) {
                return f10329(var16, var522, var524);
            }
            Errors.error((SubLObject)$ic314$, var523, var519);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10325(final SubLObject var16, final SubLObject var50) {
        if ($ic312$ == var50) {
            return module0228.f15208(var16);
        }
        return module0211.f13641(var16, var50);
    }
    
    public static SubLObject f10326(final SubLObject var558, final SubLObject var39, final SubLObject var559) {
        SubLObject var560 = (SubLObject)NIL;
        SubLObject var561 = (SubLObject)NIL;
        SubLObject var562 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var559, var559, (SubLObject)$ic323$);
        var560 = var559.first();
        SubLObject var563 = var559.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var563, var559, (SubLObject)$ic323$);
        var561 = var563.first();
        var563 = var563.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var563, var559, (SubLObject)$ic323$);
        var562 = var563.first();
        var563 = var563.rest();
        if (NIL == var563) {
            if ((NIL == var561 || NIL != module0211.f13650(var558, var561)) && NIL != f10330(var558, var39, var560) && (NIL == var562 || NIL != module0178.f11319(var558, var562))) {
                return (SubLObject)T;
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var559, (SubLObject)$ic323$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10330(final SubLObject var558, final SubLObject var39, final SubLObject var528) {
        if (NIL == var528) {
            return (SubLObject)T;
        }
        if ($ic66$ == var528) {
            return module0211.f13647(var558, var39);
        }
        if (var528.isInteger()) {
            return module0211.f13646(var558, var39, var528);
        }
        if (!var528.isCons() || NIL == module0035.f1995(var528, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) || !var528.first().isInteger()) {
            return (SubLObject)NIL;
        }
        SubLObject var559 = (SubLObject)NIL;
        SubLObject var560 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var528, var528, (SubLObject)$ic324$);
        var559 = var528.first();
        SubLObject var561 = var528.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var561, var528, (SubLObject)$ic324$);
        var560 = var561.first();
        var561 = var561.rest();
        if (NIL != var561) {
            cdestructuring_bind.cdestructuring_bind_error(var528, (SubLObject)$ic324$);
            return (SubLObject)NIL;
        }
        final SubLObject var562 = module0178.f11331(var558, var559);
        assert NIL != module0202.f12590(var562) : var562;
        if (var560 == $ic66$) {
            return module0202.f12723(var39, var562);
        }
        return module0202.f12961(var562, var39, var560);
    }
    
    public static SubLObject f10327(final SubLObject var567, final SubLObject var39, final SubLObject var568) {
        SubLObject var569 = (SubLObject)NIL;
        SubLObject var570 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var568, var568, (SubLObject)$ic326$);
        var569 = var568.first();
        SubLObject var571 = var568.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var571, var568, (SubLObject)$ic326$);
        var570 = var571.first();
        var571 = var571.rest();
        if (NIL == var571) {
            return module0214.f14092(var567, var39, (SubLObject)(($ic66$ == var569) ? NIL : var569), var570);
        }
        cdestructuring_bind.cdestructuring_bind_error(var568, (SubLObject)$ic326$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10328(final SubLObject var278, final SubLObject var39, final SubLObject var571) {
        SubLObject var572 = (SubLObject)NIL;
        SubLObject var573 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var571, var571, (SubLObject)$ic327$);
        var572 = var571.first();
        SubLObject var574 = var571.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var574, var571, (SubLObject)$ic327$);
        var573 = var574.first();
        var574 = var574.rest();
        if (NIL == var574) {
            if (NIL != f10331(var278, var572, var39, var573)) {
                return (SubLObject)T;
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var571, (SubLObject)$ic327$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10331(final SubLObject var278, final SubLObject var197, final SubLObject var39, final SubLObject var546) {
        if (NIL == var197) {
            return (SubLObject)makeBoolean(NIL != f10331(var278, (SubLObject)$ic115$, var39, var546) || NIL != f10331(var278, (SubLObject)$ic114$, var39, var546));
        }
        if (NIL != assertion_handles_oc.f11045(var278)) {
            final SubLObject var547 = module0232.f15310(module0178.f11282(var278), var197);
            SubLObject var548 = (SubLObject)NIL;
            if (NIL == var548) {
                SubLObject var549;
                SubLObject var550;
                for (var549 = var547, var550 = (SubLObject)NIL, var550 = var549.first(); NIL == var548 && NIL != var549; var548 = f10332(var550, var39, var546), var549 = var549.rest(), var550 = var549.first()) {}
            }
            return var548;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10332(final SubLObject var381, final SubLObject var39, final SubLObject var546) {
        SubLObject var547 = (SubLObject)NIL;
        if (var546.eql((SubLObject)$ic121$)) {
            var547 = f10333(var381, var39);
        }
        else if (var546.eql((SubLObject)$ic142$)) {
            var547 = f10334(var381, var39);
        }
        else if (var546.eql((SubLObject)$ic158$)) {
            var547 = f10335(var381, var39);
        }
        else if (var546.eql((SubLObject)$ic166$)) {
            var547 = f10336(var381, var39);
        }
        else if (var546.eql((SubLObject)$ic176$)) {
            var547 = f10337(var381, var39);
        }
        else if (var546.eql((SubLObject)$ic186$)) {
            var547 = f10338(var381, var39);
        }
        else if (var546.eql((SubLObject)$ic195$)) {
            var547 = f10339(var381, var39);
        }
        else {
            var547 = Functions.funcall(var546, var381, var39);
        }
        return var547;
    }
    
    public static SubLObject f10329(final SubLObject var16, final SubLObject var39, final SubLObject var577) {
        SubLObject var578 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var577, var577, (SubLObject)$ic313$);
        var578 = var577.first();
        final SubLObject var579 = var577.rest();
        if (NIL == var579) {
            SubLObject var580 = (SubLObject)NIL;
            final SubLObject var581 = var578;
            if (var581.eql((SubLObject)$ic216$)) {
                var580 = f10340(var16, var39);
            }
            else {
                var580 = Functions.funcall(var578, var16, var39);
            }
            return var580;
        }
        cdestructuring_bind.cdestructuring_bind_error(var577, (SubLObject)$ic313$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10333(final SubLObject var381, final SubLObject var5) {
        return (SubLObject)makeBoolean(var5.eql(module0205.f13333(var381)) && NIL != f10341(var381));
    }
    
    public static SubLObject f10341(final SubLObject var381) {
        if (NIL == module0173.f10955(module0205.f13333(var381))) {
            return (SubLObject)NIL;
        }
        final SubLObject var382 = module0205.f13333(var381);
        if (var382.eql($ic143$)) {
            return (SubLObject)makeBoolean(NIL == f10342(var381));
        }
        if (var382.eql($ic159$)) {
            return (SubLObject)makeBoolean(NIL == f10343(var381));
        }
        if (var382.eql($ic167$)) {
            return (SubLObject)makeBoolean(NIL == f10344(var381));
        }
        if (var382.eql($ic108$)) {
            return (SubLObject)makeBoolean(NIL == f10345(var381));
        }
        if (var382.eql($ic328$)) {
            return (SubLObject)makeBoolean(NIL == f10346(var381));
        }
        if (var382.eql($ic329$)) {
            return (SubLObject)makeBoolean(NIL == f10347(var381));
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f10348(final SubLObject var381, final SubLObject var5) {
        return (SubLObject)makeBoolean($ic330$.eql(module0205.f13333(var381)) && var5.eql(module0202.f12832(module0205.f13388(var381, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)) && NIL != f10349(var381));
    }
    
    public static SubLObject f10349(final SubLObject var381) {
        if (!$ic330$.eql(module0205.f13333(var381))) {
            return (SubLObject)NIL;
        }
        final SubLObject var383;
        final SubLObject var382 = var383 = module0202.f12832(module0205.f13388(var381, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        if (var383.eql($ic143$)) {
            return (SubLObject)makeBoolean(NIL == f10342(var381));
        }
        if (var383.eql($ic159$)) {
            return (SubLObject)makeBoolean(NIL == f10343(var381));
        }
        if (var383.eql($ic167$)) {
            return (SubLObject)makeBoolean(NIL == f10344(var381));
        }
        if (var383.eql($ic108$)) {
            return (SubLObject)makeBoolean(NIL == f10345(var381));
        }
        if (var383.eql($ic328$)) {
            return (SubLObject)makeBoolean(NIL == f10346(var381));
        }
        if (var383.eql($ic329$)) {
            return (SubLObject)makeBoolean(NIL == f10347(var381));
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f10334(final SubLObject var381, final SubLObject var218) {
        return (SubLObject)makeBoolean(NIL != f10342(var381) && var218.eql(module0205.f13388(var381, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10350(final SubLObject var381, final SubLObject var218) {
        return (SubLObject)makeBoolean(NIL != f10351(var381) && var218.eql(module0205.f13388(var381, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10342(final SubLObject var381) {
        return (SubLObject)makeBoolean($ic143$.eql(module0205.f13333(var381)) && NIL != module0202.f12734(var381, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0173.f10955(module0205.f13388(var381, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10351(final SubLObject var381) {
        return (SubLObject)makeBoolean($ic152$.eql(module0205.f13333(var381)) && NIL != module0202.f12734(var381, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0173.f10955(module0205.f13388(var381, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10335(final SubLObject var381, final SubLObject var218) {
        return (SubLObject)makeBoolean(NIL != f10343(var381) && var218.eql(module0205.f13388(var381, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10343(final SubLObject var381) {
        return (SubLObject)makeBoolean($ic159$.eql(module0205.f13333(var381)) && NIL != module0202.f12734(var381, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0173.f10955(module0205.f13388(var381, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10336(final SubLObject var381, final SubLObject var252) {
        return (SubLObject)makeBoolean(NIL != f10344(var381) && var252.eql(module0205.f13388(var381, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10344(final SubLObject var381) {
        return (SubLObject)makeBoolean($ic167$.eql(module0205.f13333(var381)) && NIL != module0202.f12734(var381, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0173.f10955(module0205.f13388(var381, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10337(final SubLObject var381, final SubLObject var144) {
        return (SubLObject)makeBoolean(NIL != f10345(var381) && var144.eql(module0205.f13136(module0205.f13388(var381, (SubLObject)UNPROVIDED))));
    }
    
    public static SubLObject f10345(final SubLObject var381) {
        if ($ic108$.eql(module0205.f13333(var381)) && NIL != module0202.f12734(var381, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            final SubLObject var382 = module0205.f13388(var381, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(NIL != module0202.f12659(var382) && NIL != module0173.f10955(module0205.f13136(var382)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10338(final SubLObject var381, final SubLObject var278) {
        return (SubLObject)makeBoolean(NIL != f10346(var381) && var278.eql(module0205.f13388(var381, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10346(final SubLObject var381) {
        return (SubLObject)makeBoolean($ic328$.eql(module0205.f13333(var381)) && NIL != module0202.f12734(var381, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != assertion_handles_oc.f11035(module0205.f13388(var381, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10339(final SubLObject var381, final SubLObject var278) {
        return (SubLObject)makeBoolean(NIL != f10347(var381) && var278.eql(module0205.f13388(var381, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10347(final SubLObject var381) {
        return (SubLObject)makeBoolean($ic329$.eql(module0205.f13333(var381)) && NIL != module0202.f12734(var381, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != assertion_handles_oc.f11035(module0205.f13388(var381, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10352(final SubLObject var381, final SubLObject var580) {
        return f10353(var381);
    }
    
    public static SubLObject f10353(final SubLObject var381) {
        return (SubLObject)makeBoolean(NIL == module0193.f12105(module0205.f13333(var381)));
    }
    
    public static SubLObject f10340(final SubLObject var16, final SubLObject var9) {
        return module0161.f10514(var9, module0178.f11287(var16));
    }
    
    public static SubLObject f10354() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f9994", "S#12763");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f9995", "S#12764");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f9996", "S#12765");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f9997", "S#12766", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f9998", "S#12767");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f9999", "S#12768");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10000", "S#12769", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10001", "S#12770", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10002", "S#12771");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10003", "S#12772");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10004", "S#12773");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10005", "S#12774");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10006", "S#12775");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10007", "S#5220");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10008", "DO-GAF-ARG-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10009", "S#12703");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10010", "S#12776", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10011", "S#12777", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10013", "S#12778", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10014", "S#12779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10015", "S#12780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10016", "S#12781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10017", "S#12782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10018", "S#12783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10019", "S#12784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10020", "S#12785", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10021", "S#12786", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10022", "S#12787", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10023", "S#12788", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10024", "S#12789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10025", "S#12790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10026", "S#12791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10027", "S#12792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10028", "S#12720", 1, 0, false);
        new $f10028$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10029", "S#12721", 1, 0, false);
        new $f10029$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10030", "S#12793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10033", "S#12794", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10032", "S#12795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10034", "S#12796", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10035", "S#12797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10036", "S#12798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10031", "S#12799", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10037", "DO-PREDICATE-EXTENT-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10038", "S#12800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10039", "S#12801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10040", "S#12802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10041", "S#12803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10042", "S#12804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10043", "S#12805", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10044", "S#12806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10045", "S#12807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10046", "S#12722", 1, 0, false);
        new $f10046$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10047", "S#12723", 1, 0, false);
        new $f10047$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10048", "S#12808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10051", "S#12809", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10050", "S#12810", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10052", "S#12811", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10049", "S#12812", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10053", "S#5221");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10054", "S#12813", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10055", "S#12814", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10057", "S#12815", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10058", "S#12816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10059", "S#12817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10060", "S#12818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10061", "S#12819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10062", "S#12820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10063", "S#12821", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10064", "S#12822", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10065", "S#12823", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10066", "S#12824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10067", "S#12825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10068", "S#12826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10069", "S#12724", 1, 0, false);
        new $f10069$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10070", "S#12725", 1, 0, false);
        new $f10070$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10071", "S#12827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10074", "S#12828", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10073", "S#12829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10075", "S#12830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10076", "S#12831", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10072", "S#12832", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10077", "S#5222");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10078", "S#12833", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10079", "S#12834");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10080", "S#12835", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10081", "S#12836");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10082", "S#12837");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10083", "DO-PREDICATE-RULE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10084", "S#12838", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10085", "S#12839", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10087", "S#12840", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10088", "S#12841", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10089", "S#12842", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10090", "S#12843", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10091", "S#12844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10092", "S#12845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10093", "S#12846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10094", "S#12847", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10095", "S#12848", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10096", "S#12849", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10097", "S#12850", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10098", "S#12851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10099", "S#12852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10100", "S#12853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10101", "S#12854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10102", "S#12726", 1, 0, false);
        new $f10102$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10103", "S#12727", 1, 0, false);
        new $f10103$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10104", "S#12855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10107", "S#12856", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10106", "S#12857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10108", "S#12858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10109", "S#12859", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10110", "S#12860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10105", "S#12861", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10111", "S#12862");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10112", "S#12863", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10113", "S#12864", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10114", "S#12865", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10115", "S#12866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10116", "S#12867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10117", "S#12868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10118", "S#12869", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10119", "S#12870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10120", "S#12871", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10121", "S#12872", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10122", "S#12873", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10123", "S#12874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10124", "S#12875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10125", "S#12876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10126", "S#12728", 1, 0, false);
        new $f10126$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10127", "S#12729", 1, 0, false);
        new $f10127$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10128", "S#12877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10131", "S#12878", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10130", "S#12879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10132", "S#12880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10133", "S#12881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10129", "S#12882", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10134", "S#5223");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10135", "S#12883", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10137", "S#12884", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10139", "S#5224");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10140", "S#12885", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10141", "S#12886", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10142", "S#5225");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10143", "S#12887", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10144", "S#12888", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10145", "S#5226");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10146", "S#12889", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10147", "S#12890", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10136", "S#12891", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10138", "S#12892", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10149", "S#12893", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10150", "S#12894", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10151", "S#12895", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10152", "S#12896", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10153", "S#12897", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10154", "S#12898", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10155", "S#12899", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10156", "S#12900", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10157", "S#12901", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10158", "S#12902", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10159", "S#12903", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10160", "S#12904", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10161", "S#12905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10162", "S#12906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10163", "S#12907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10164", "S#12908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10165", "S#12730", 1, 0, false);
        new $f10165$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10166", "S#12731", 1, 0, false);
        new $f10166$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10167", "S#12909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10170", "S#12910", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10169", "S#12911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10171", "S#12912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10172", "S#12913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10173", "S#12914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10168", "S#12915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10148", "S#12916", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10174", "S#12917");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10175", "S#12918", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10176", "S#12919", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10177", "S#12920", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10178", "S#12921", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10179", "S#12922", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10180", "S#12923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10181", "S#12924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10182", "S#12925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10183", "S#12926", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10184", "S#12927", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10185", "S#12928", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10186", "S#12929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10187", "S#12930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10188", "S#12931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10189", "S#12932", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10190", "S#12933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10191", "S#12934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10194", "S#12935", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10193", "S#12936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10195", "S#12937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10196", "S#12938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10192", "S#12939", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10197", "S#5227");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10198", "S#12940", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10199", "S#12941", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10200", "S#12942", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10201", "S#12943", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10202", "S#12944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10203", "S#12945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10204", "S#12946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10205", "S#12947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10206", "S#12948", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10207", "S#12949", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10208", "S#12950", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10209", "S#12951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10210", "S#12952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10211", "S#12953", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10212", "S#12954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10213", "S#12955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10214", "S#12956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10217", "S#12957", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10216", "S#12958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10218", "S#12959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10219", "S#12960", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10215", "S#12961", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10220", "S#5228");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10221", "S#12962", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10222", "S#12963", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10223", "S#12964", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10224", "S#12965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10225", "S#12966", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10226", "S#12967", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10227", "S#12968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10228", "S#12969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10229", "S#12970", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10230", "S#12971", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10231", "S#12972", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10232", "S#12973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10233", "S#12974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10234", "S#12975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10235", "S#12976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10236", "S#12977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10237", "S#12978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10240", "S#12979", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10239", "S#12980", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10241", "S#12981", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10242", "S#12982", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10238", "S#12983", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10243", "S#5229");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10244", "S#12984", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10245", "S#12985", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10246", "S#12986", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10247", "S#12987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10248", "S#12988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10249", "S#12989", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10250", "S#12990", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10251", "S#12991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10252", "S#12992", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10253", "S#12993", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10254", "S#12994", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10255", "S#12995", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10256", "S#12996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10257", "S#12997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10258", "S#12998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10259", "S#12999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10260", "S#13000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10261", "S#13001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10262", "S#13002", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10265", "S#13003", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10264", "S#13004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10266", "S#13005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10267", "S#13006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10268", "S#13007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10263", "S#13008", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10269", "S#5230");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10270", "S#13009", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10271", "S#13010", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10273", "S#5231");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10274", "S#13011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10275", "S#13012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10276", "S#13013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10277", "S#13014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10278", "S#13015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10279", "S#12737", 2, 0, false);
        new $f10279$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10280", "S#13016", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10281", "DO-TERM-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10282", "S#13017", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10283", "S#13018", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10284", "S#13019", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10285", "S#13020");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10286", "S#13021", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10287", "S#13022", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10288", "S#13023");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10289", "S#13024", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10290", "S#13025");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10291", "S#13026");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10292", "S#13027");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10293", "S#13028");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10294", "S#13029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10295", "S#13030", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10296", "S#13031");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10297", "S#13032", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10298", "S#13033");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10299", "S#13034", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10300", "S#13035");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10301", "S#13036", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10302", "S#13037");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10303", "S#13038");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10304", "S#13039");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10305", "S#13040");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10306", "S#13041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10307", "S#13042", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10308", "S#13043");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10309", "S#13044", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10310", "S#13045");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10311", "S#13046", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0158", "f10312", "S#13047");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10313", "S#13048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10314", "S#13049", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10315", "S#13050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10316", "S#13051", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10318", "S#12741", 2, 0, false);
        new $f10318$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10319", "S#13052", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10320", "S#13053", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10012", "S#13054", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10056", "S#13055", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10086", "S#13056", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10272", "S#13057", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10321", "S#12744", 0, 0, false);
        new $f10321$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10322", "S#13058", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10323", "S#13059", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10317", "S#13060", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10324", "S#13061", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10325", "S#13062", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10326", "S#13063", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10330", "S#13064", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10327", "S#13065", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10328", "S#13066", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10331", "S#13067", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10332", "S#13068", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10329", "S#13069", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10333", "S#13070", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10341", "S#13071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10348", "S#12759", 2, 0, false);
        new $f10348$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10349", "S#13072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10334", "S#13073", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10350", "S#13074", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10342", "S#13075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10351", "S#13076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10335", "S#13077", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10343", "S#13078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10336", "S#13079", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10344", "S#13080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10337", "S#13081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10345", "S#13082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10338", "S#13083", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10346", "S#13084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10339", "S#13085", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10347", "S#13086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10352", "S#13087", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10353", "S#13088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0158", "f10340", "S#13089", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10355() {
        $g2136$ = SubLFiles.deflexical("S#13090", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10356() {
        module0002.f50((SubLObject)$ic7$, (SubLObject)$ic8$);
        module0002.f50((SubLObject)$ic37$, (SubLObject)$ic39$);
        module0002.f50((SubLObject)$ic43$, (SubLObject)$ic44$);
        module0012.f375((SubLObject)$ic61$, (SubLObject)$ic53$, (SubLObject)$ic62$);
        module0002.f50((SubLObject)$ic59$, (SubLObject)$ic61$);
        module0002.f50((SubLObject)$ic60$, (SubLObject)$ic61$);
        module0002.f50((SubLObject)$ic76$, (SubLObject)$ic82$);
        module0002.f50((SubLObject)$ic81$, (SubLObject)$ic82$);
        module0002.f50((SubLObject)$ic90$, (SubLObject)$ic92$);
        module0002.f50((SubLObject)$ic91$, (SubLObject)$ic92$);
        module0002.f50((SubLObject)$ic100$, (SubLObject)$ic102$);
        module0002.f50((SubLObject)$ic101$, (SubLObject)$ic102$);
        module0002.f50((SubLObject)$ic119$, (SubLObject)$ic112$);
        module0002.f50((SubLObject)$ic120$, (SubLObject)$ic112$);
        module0002.f50((SubLObject)$ic129$, (SubLObject)$ic131$);
        module0002.f50((SubLObject)$ic130$, (SubLObject)$ic131$);
        module0002.f50((SubLObject)$ic139$, (SubLObject)$ic141$);
        module0002.f50((SubLObject)$ic140$, (SubLObject)$ic141$);
        module0002.f50((SubLObject)$ic148$, (SubLObject)$ic150$);
        module0002.f50((SubLObject)$ic149$, (SubLObject)$ic150$);
        module0002.f50((SubLObject)$ic155$, (SubLObject)$ic157$);
        module0002.f50((SubLObject)$ic156$, (SubLObject)$ic157$);
        module0002.f50((SubLObject)$ic163$, (SubLObject)$ic165$);
        module0002.f50((SubLObject)$ic164$, (SubLObject)$ic165$);
        module0002.f50((SubLObject)$ic173$, (SubLObject)$ic175$);
        module0002.f50((SubLObject)$ic174$, (SubLObject)$ic175$);
        module0002.f50((SubLObject)$ic183$, (SubLObject)$ic185$);
        module0002.f50((SubLObject)$ic184$, (SubLObject)$ic185$);
        module0002.f50((SubLObject)$ic192$, (SubLObject)$ic194$);
        module0002.f50((SubLObject)$ic193$, (SubLObject)$ic194$);
        module0002.f50((SubLObject)$ic202$, (SubLObject)$ic204$);
        module0002.f50((SubLObject)$ic203$, (SubLObject)$ic204$);
        module0002.f50((SubLObject)$ic213$, (SubLObject)$ic215$);
        module0002.f50((SubLObject)$ic214$, (SubLObject)$ic215$);
        module0002.f50((SubLObject)$ic220$, (SubLObject)$ic223$);
        module0002.f50((SubLObject)$ic221$, (SubLObject)$ic223$);
        module0002.f50((SubLObject)$ic226$, (SubLObject)$ic227$);
        module0002.f50((SubLObject)$ic222$, (SubLObject)$ic223$);
        module0012.f375((SubLObject)$ic227$, (SubLObject)$ic218$, (SubLObject)$ic234$);
        module0002.f50((SubLObject)$ic231$, (SubLObject)$ic227$);
        module0002.f50((SubLObject)$ic232$, (SubLObject)$ic227$);
        module0002.f50((SubLObject)$ic233$, (SubLObject)$ic227$);
        module0002.f50((SubLObject)$ic237$, (SubLObject)$ic240$);
        module0002.f50((SubLObject)$ic239$, (SubLObject)$ic240$);
        module0002.f50((SubLObject)$ic242$, (SubLObject)$ic246$);
        module0002.f50((SubLObject)$ic260$, (SubLObject)$ic255$);
        module0002.f50((SubLObject)$ic266$, (SubLObject)$ic255$);
        module0002.f50((SubLObject)$ic261$, (SubLObject)$ic255$);
        module0002.f50((SubLObject)$ic274$, (SubLObject)$ic261$);
        module0002.f50((SubLObject)$ic262$, (SubLObject)$ic255$);
        module0002.f50((SubLObject)$ic278$, (SubLObject)$ic262$);
        module0002.f50((SubLObject)$ic264$, (SubLObject)$ic255$);
        module0002.f50((SubLObject)$ic280$, (SubLObject)$ic264$);
        module0002.f50((SubLObject)$ic292$, (SubLObject)$ic287$);
        module0002.f50((SubLObject)$ic297$, (SubLObject)$ic287$);
        module0002.f50((SubLObject)$ic293$, (SubLObject)$ic287$);
        module0002.f50((SubLObject)$ic302$, (SubLObject)$ic293$);
        module0002.f50((SubLObject)$ic295$, (SubLObject)$ic287$);
        module0002.f50((SubLObject)$ic304$, (SubLObject)$ic295$);
        module0002.f50((SubLObject)$ic296$, (SubLObject)$ic287$);
        module0002.f50((SubLObject)$ic305$, (SubLObject)$ic296$);
        module0002.f50((SubLObject)$ic50$, (SubLObject)$ic43$);
        module0002.f50((SubLObject)$ic52$, (SubLObject)$ic43$);
        module0034.f1909((SubLObject)$ic318$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f10354();
    }
    
    public void initializeVariables() {
        f10355();
    }
    
    public void runTopLevelForms() {
        f10356();
    }
    
    static {
        me = (SubLFile)new module0158();
        $g2136$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeSymbol("PWHEN");
        $ic2$ = makeSymbol("S#12350", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic4$ = makeSymbol("RELEVANT-MT?");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#13091", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic6$ = makeSymbol("PROGN");
        $ic7$ = makeSymbol("S#12766", "CYC");
        $ic8$ = makeSymbol("S#12765", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic10$ = makeSymbol("ASSERTION-HAS-TRUTH");
        $ic11$ = makeSymbol("COR");
        $ic12$ = makeSymbol("NULL");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#13092", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic14$ = makeSymbol("S#12770", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#13093", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic16$ = ConsesLow.list((SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("DONE"));
        $ic17$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic18$ = makeKeyword("TRUTH");
        $ic19$ = makeKeyword("DIRECTION");
        $ic20$ = makeKeyword("DONE");
        $ic21$ = makeSymbol("DO-LIST");
        $ic22$ = makeSymbol("S#12767", "CYC");
        $ic23$ = makeSymbol("S#12768", "CYC");
        $ic24$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic25$ = makeSymbol("S#12771", "CYC");
        $ic26$ = makeSymbol("S#13094", "CYC");
        $ic27$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic28$ = makeKeyword("GAF");
        $ic29$ = makeSymbol("S#11995", "CYC");
        $ic30$ = makeKeyword("RULE");
        $ic31$ = makeSymbol("S#12732", "CYC");
        $ic32$ = makeSymbol("S#12738", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#130", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic34$ = ConsesLow.list((SubLObject)makeKeyword("PROGRESS-MESSAGE"), (SubLObject)makeKeyword("DONE"));
        $ic35$ = makeKeyword("PROGRESS-MESSAGE");
        $ic36$ = makeSymbol("S#421", "CYC");
        $ic37$ = makeSymbol("S#12775", "CYC");
        $ic38$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#422", "CYC")));
        $ic39$ = makeSymbol("S#12774", "CYC");
        $ic40$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#130", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic41$ = ConsesLow.list((SubLObject)makeKeyword("PROGRESS-MESSAGE"));
        $ic42$ = makeSymbol("DO-ASSERTIONS");
        $ic43$ = makeSymbol("S#5220", "CYC");
        $ic44$ = ConsesLow.list(new SubLObject[] { makeSymbol("DO-GAF-ARG-INDEX"), makeSymbol("DO-PREDICATE-EXTENT-INDEX"), makeSymbol("S#5221", "CYC"), makeSymbol("S#5222", "CYC"), makeSymbol("DO-PREDICATE-RULE-INDEX"), makeSymbol("S#5223", "CYC"), makeSymbol("S#5224", "CYC"), makeSymbol("S#5225", "CYC"), makeSymbol("S#5226", "CYC"), makeSymbol("S#12917", "CYC"), makeSymbol("S#5227", "CYC"), makeSymbol("S#5228", "CYC"), makeSymbol("S#5229", "CYC"), makeSymbol("S#5230", "CYC"), makeSymbol("S#5231", "CYC"), makeSymbol("DO-TERM-INDEX") });
        $ic45$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12704", "CYC"), (SubLObject)makeSymbol("S#13095", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic46$ = makeUninternedSymbol("US#4CE6AE7");
        $ic47$ = makeSymbol("CLET");
        $ic48$ = makeSymbol("CUNWIND-PROTECT");
        $ic49$ = makeSymbol("CSETQ");
        $ic50$ = makeSymbol("S#13051", "CYC");
        $ic51$ = makeSymbol("S#5131", "CYC");
        $ic52$ = makeSymbol("S#13052", "CYC");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12704", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic54$ = ConsesLow.list((SubLObject)makeKeyword("INDEX"), (SubLObject)makeKeyword("PREDICATE"), (SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("DONE"));
        $ic55$ = makeKeyword("INDEX");
        $ic56$ = makeKeyword("PREDICATE");
        $ic57$ = makeUninternedSymbol("US#37F0605");
        $ic58$ = makeUninternedSymbol("US#58CF4EC");
        $ic59$ = makeSymbol("S#12776", "CYC");
        $ic60$ = makeSymbol("S#12777", "CYC");
        $ic61$ = makeSymbol("DO-GAF-ARG-INDEX");
        $ic62$ = makeString("Iterate over an index of gaf assertions executing BODY within the scope of VAR.\nVAR is bound to each assertion in the iteration such that:\nThe assertion is in a relevant microtheory (relevance is established outside).\nIf predicate = NIL, then predicate relevance is established outside.\nIf INDEX is non-nil and positive, TERM is the INDEX argument of the assertion,\nelse TERM is some nonzero argument of the assertion.\nIf PREDICATE is non-nil, PREDICATE is the predicate of the assertion.\nIf TRUTH is non-nil, the assertion has TRUTH as its truth value.\nIf DIRECTION is non-nil, the assertion has DIRECTION as its direction.\nIteration is halted as soon as DONE becomes non-nil.\n@note VAR may be bound to the same assertion twice, if it exists in multiple indexing leaf sets,\nfor example if TERM appears in more than one non-zero argnum of VAR.");
        $ic63$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeSymbol("VAR", "CYC"), makeSymbol("S#12141", "CYC"), makeSymbol("GATHER-INDEX"), makeSymbol("&KEY"), makeSymbol("S#134", "CYC"), makeSymbol("S#717", "CYC"), makeSymbol("S#12576", "CYC"), makeSymbol("S#5432", "CYC"), makeSymbol("S#127", "CYC") }), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic64$ = makeUninternedSymbol("US#67B23EC");
        $ic65$ = makeSymbol("GAF-ARG");
        $ic66$ = makeKeyword("ANY");
        $ic67$ = makeSymbol("S#12720", "CYC");
        $ic68$ = makeSymbol("S#12721", "CYC");
        $ic69$ = makeKeyword("ARGNUM-KEYS-ARE-FRESH");
        $ic70$ = makeKeyword("GAF-ARG");
        $ic71$ = makeKeyword("PREDICATE-KEYS-ARE-FRESH");
        $ic72$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#130", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic73$ = ConsesLow.list((SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("PROGRESS-MESSAGE"));
        $ic74$ = makeUninternedSymbol("US#37F0605");
        $ic75$ = makeUninternedSymbol("US#58CF4EC");
        $ic76$ = makeSymbol("S#12800", "CYC");
        $ic77$ = makeSymbol("PIF-FEATURE");
        $ic78$ = makeKeyword("CYC-ALEXANDRIA");
        $ic79$ = makeSymbol("DO-ITERATOR-WITHOUT-VALUES-PROGRESS");
        $ic80$ = makeSymbol("NEW-ALEXANDRIA-GAF-ARG0-ITERATOR-RELEVANT-MT");
        $ic81$ = makeSymbol("S#12801", "CYC");
        $ic82$ = makeSymbol("DO-PREDICATE-EXTENT-INDEX");
        $ic83$ = makeSymbol("S#12722", "CYC");
        $ic84$ = makeSymbol("S#12723", "CYC");
        $ic85$ = makeKeyword("PREDICATE-EXTENT");
        $ic86$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic87$ = ConsesLow.list((SubLObject)makeKeyword("INDEX"), (SubLObject)makeKeyword("FUNCTION"), (SubLObject)makeKeyword("DONE"));
        $ic88$ = makeKeyword("FUNCTION");
        $ic89$ = makeUninternedSymbol("US#58CF4EC");
        $ic90$ = makeSymbol("S#12813", "CYC");
        $ic91$ = makeSymbol("S#12814", "CYC");
        $ic92$ = makeSymbol("S#5221", "CYC");
        $ic93$ = makeSymbol("S#12724", "CYC");
        $ic94$ = makeSymbol("S#12725", "CYC");
        $ic95$ = makeKeyword("NART-ARG");
        $ic96$ = makeString("nart arg keys should never be irrelevant: ~s ~s");
        $ic97$ = makeKeyword("FUNCTION-KEYS-ARE-FRESH");
        $ic98$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic99$ = makeUninternedSymbol("US#58CF4EC");
        $ic100$ = makeSymbol("S#12833", "CYC");
        $ic101$ = makeSymbol("S#12835", "CYC");
        $ic102$ = makeSymbol("S#5222", "CYC");
        $ic103$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic104$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic105$ = makeUninternedSymbol("US#33EA096");
        $ic106$ = makeSymbol("GAF-ARG1");
        $ic107$ = ConsesLow.list((SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        $ic108$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic109$ = ConsesLow.list((SubLObject)makeKeyword("FUNCTION-EXTENT"));
        $ic110$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic111$ = ConsesLow.list((SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("DONE"));
        $ic112$ = makeSymbol("DO-PREDICATE-RULE-INDEX");
        $ic113$ = makeKeyword("SENSE");
        $ic114$ = makeKeyword("POS");
        $ic115$ = makeKeyword("NEG");
        $ic116$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic117$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("DONE"));
        $ic118$ = makeUninternedSymbol("US#58CF4EC");
        $ic119$ = makeSymbol("S#12838", "CYC");
        $ic120$ = makeSymbol("S#12839", "CYC");
        $ic121$ = makeSymbol("S#13070", "CYC");
        $ic122$ = makeSymbol("S#12726", "CYC");
        $ic123$ = makeSymbol("S#12727", "CYC");
        $ic124$ = makeKeyword("SENSE-KEYS-ARE-FRESH");
        $ic125$ = makeKeyword("PREDICATE-RULE");
        $ic126$ = makeString("predicate-rule iterator quiescense failed with ~s");
        $ic127$ = makeKeyword("MT-KEYS-ARE-FRESH");
        $ic128$ = makeUninternedSymbol("US#58CF4EC");
        $ic129$ = makeSymbol("S#12863", "CYC");
        $ic130$ = makeSymbol("S#12864", "CYC");
        $ic131$ = makeSymbol("S#12862", "CYC");
        $ic132$ = makeSymbol("S#12759", "CYC");
        $ic133$ = makeSymbol("S#12728", "CYC");
        $ic134$ = makeSymbol("S#12729", "CYC");
        $ic135$ = makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");
        $ic136$ = makeString("ist-predicate-rule iterator quiescense failed with ~s");
        $ic137$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12458", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic138$ = makeUninternedSymbol("US#58CF4EC");
        $ic139$ = makeSymbol("S#12883", "CYC");
        $ic140$ = makeSymbol("S#12884", "CYC");
        $ic141$ = makeSymbol("S#5223", "CYC");
        $ic142$ = makeSymbol("S#13073", "CYC");
        $ic143$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic144$ = makeKeyword("ISA-RULE");
        $ic145$ = makeSymbol("S#12730", "CYC");
        $ic146$ = makeSymbol("S#12731", "CYC");
        $ic147$ = makeUninternedSymbol("US#58CF4EC");
        $ic148$ = makeSymbol("S#12885", "CYC");
        $ic149$ = makeSymbol("S#12886", "CYC");
        $ic150$ = makeSymbol("S#5224", "CYC");
        $ic151$ = makeSymbol("S#13074", "CYC");
        $ic152$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic153$ = makeKeyword("QUOTED-ISA-RULE");
        $ic154$ = makeUninternedSymbol("US#58CF4EC");
        $ic155$ = makeSymbol("S#12887", "CYC");
        $ic156$ = makeSymbol("S#12888", "CYC");
        $ic157$ = makeSymbol("S#5225", "CYC");
        $ic158$ = makeSymbol("S#13077", "CYC");
        $ic159$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic160$ = makeKeyword("GENLS-RULE");
        $ic161$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#13096", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic162$ = makeUninternedSymbol("US#58CF4EC");
        $ic163$ = makeSymbol("S#12889", "CYC");
        $ic164$ = makeSymbol("S#12890", "CYC");
        $ic165$ = makeSymbol("S#5226", "CYC");
        $ic166$ = makeSymbol("S#13079", "CYC");
        $ic167$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic168$ = makeKeyword("GENL-MT-RULE");
        $ic169$ = makeString("pred-arg2-rule iterator quiescense failed with ~s");
        $ic170$ = makeString("unexpected pred in pred-arg2 indexing: ~s");
        $ic171$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic172$ = makeUninternedSymbol("US#58CF4EC");
        $ic173$ = makeSymbol("S#12918", "CYC");
        $ic174$ = makeSymbol("S#12919", "CYC");
        $ic175$ = makeSymbol("S#12917", "CYC");
        $ic176$ = makeSymbol("S#13081", "CYC");
        $ic177$ = makeSymbol("S#12932", "CYC");
        $ic178$ = makeSymbol("S#12933", "CYC");
        $ic179$ = makeKeyword("FUNCTION-RULE");
        $ic180$ = makeString("function-rule iterator quiescense failed with ~s");
        $ic181$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#13097", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic182$ = makeUninternedSymbol("US#58CF4EC");
        $ic183$ = makeSymbol("S#12940", "CYC");
        $ic184$ = makeSymbol("S#12941", "CYC");
        $ic185$ = makeSymbol("S#5227", "CYC");
        $ic186$ = makeSymbol("S#13083", "CYC");
        $ic187$ = makeSymbol("S#12954", "CYC");
        $ic188$ = makeSymbol("S#12955", "CYC");
        $ic189$ = makeKeyword("EXCEPTION-RULE");
        $ic190$ = makeString("exception-rule iterator quiescense failed with ~s");
        $ic191$ = makeUninternedSymbol("US#58CF4EC");
        $ic192$ = makeSymbol("S#12962", "CYC");
        $ic193$ = makeSymbol("S#12963", "CYC");
        $ic194$ = makeSymbol("S#5228", "CYC");
        $ic195$ = makeSymbol("S#13085", "CYC");
        $ic196$ = makeSymbol("S#12976", "CYC");
        $ic197$ = makeSymbol("S#12977", "CYC");
        $ic198$ = makeKeyword("PRAGMA-RULE");
        $ic199$ = makeString("pragma-rule iterator quiescense failed with ~s");
        $ic200$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic201$ = makeUninternedSymbol("US#58CF4EC");
        $ic202$ = makeSymbol("S#12984", "CYC");
        $ic203$ = makeSymbol("S#12985", "CYC");
        $ic204$ = makeSymbol("S#5229", "CYC");
        $ic205$ = makeSymbol("S#13087", "CYC");
        $ic206$ = makeSymbol("S#13000", "CYC");
        $ic207$ = makeSymbol("S#13001", "CYC");
        $ic208$ = makeString("unbound-predicate-rule iterator quiescense failed with ~s");
        $ic209$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic210$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("DONE"));
        $ic211$ = makeKeyword("TYPE");
        $ic212$ = makeUninternedSymbol("US#58CF4EC");
        $ic213$ = makeSymbol("S#13009", "CYC");
        $ic214$ = makeSymbol("S#13010", "CYC");
        $ic215$ = makeSymbol("S#5230", "CYC");
        $ic216$ = makeSymbol("S#13089", "CYC");
        $ic217$ = ConsesLow.list((SubLObject)makeKeyword("IST"));
        $ic218$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic219$ = makeUninternedSymbol("US#58CF4EC");
        $ic220$ = makeSymbol("S#13011", "CYC");
        $ic221$ = makeSymbol("S#13012", "CYC");
        $ic222$ = makeSymbol("S#13016", "CYC");
        $ic223$ = makeSymbol("S#5231", "CYC");
        $ic224$ = makeSymbol("S#12737", "CYC");
        $ic225$ = ConsesLow.list((SubLObject)makeKeyword("OTHER"));
        $ic226$ = makeSymbol("S#13013", "CYC");
        $ic227$ = makeSymbol("DO-TERM-INDEX");
        $ic228$ = makeKeyword("SIMPLE");
        $ic229$ = makeKeyword("OTHER");
        $ic230$ = makeUninternedSymbol("US#58CF4EC");
        $ic231$ = makeSymbol("S#13017", "CYC");
        $ic232$ = makeSymbol("S#13018", "CYC");
        $ic233$ = makeSymbol("S#13019", "CYC");
        $ic234$ = makeString("Iterate over all assertions indexed from TERM executing BODY within the scope of VAR.\nVAR is bound to each assertion in the iteration such that:\nThe assertion is indexed from TERM.\nThe assertion is in a relevant microtheory (relevance is established outside).\nIf the assertion is a gaf, then its predicate is relevant (relevance is established outside).\nIf TYPE is non-nil, then assertion has TYPE as its type.\nIf TRUTH is non-nil, the assertion has TRUTH as its truth value.\nIf DIRECTION is non-nil, the assertion has DIRECTION as its direction.\nIteration is halted as soon as DONE becomes non-nil.\n@note VAR may be bound to the same assertion twice, if it exists in multiple indexing leaf sets.\nSee other indexing macros for examples of how this could happen.");
        $ic235$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic236$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("DONE"));
        $ic237$ = makeSymbol("S#13021", "CYC");
        $ic238$ = makeString("do-broad-mt-index");
        $ic239$ = makeSymbol("S#13022", "CYC");
        $ic240$ = makeSymbol("S#13020", "CYC");
        $ic241$ = makeSymbol("PCASE");
        $ic242$ = makeSymbol("S#13024", "CYC");
        $ic243$ = makeKeyword("MT");
        $ic244$ = makeKeyword("BROAD-MT");
        $ic245$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("OTHERWISE")));
        $ic246$ = makeSymbol("S#13023", "CYC");
        $ic247$ = makeSymbol("S#12263", "CYC");
        $ic248$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12704", "CYC"), (SubLObject)makeSymbol("S#13098", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic249$ = ConsesLow.list((SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("DONE"));
        $ic250$ = makeSymbol("S#13099", "CYC");
        $ic251$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12704", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#13101", "CYC"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic252$ = ConsesLow.list((SubLObject)makeKeyword("METHODS"), (SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("DONE"));
        $ic253$ = makeKeyword("METHODS");
        $ic254$ = makeSymbol("S#13027", "CYC");
        $ic255$ = makeSymbol("S#13028", "CYC");
        $ic256$ = makeSymbol("S#13102", "CYC");
        $ic257$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12704", "CYC"), (SubLObject)makeSymbol("S#13103", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic258$ = makeUninternedSymbol("US#12702DE");
        $ic259$ = makeUninternedSymbol("US#1074F5E");
        $ic260$ = makeSymbol("S#13029", "CYC");
        $ic261$ = makeSymbol("S#13031", "CYC");
        $ic262$ = makeSymbol("S#13033", "CYC");
        $ic263$ = makeKeyword("OVERLAP");
        $ic264$ = makeSymbol("S#13035", "CYC");
        $ic265$ = makeSymbol("OTHERWISE");
        $ic266$ = makeSymbol("S#13030", "CYC");
        $ic267$ = makeKeyword("INDEX-TYPE");
        $ic268$ = makeString("Skip iteration");
        $ic269$ = makeString("Unsupported method ~S in ~S in DO-GAF-LOOKUP-INDEX");
        $ic270$ = makeUninternedSymbol("US#516A0DA");
        $ic271$ = makeUninternedSymbol("US#759625C");
        $ic272$ = makeUninternedSymbol("US#37A662B");
        $ic273$ = makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic274$ = makeSymbol("S#13032", "CYC");
        $ic275$ = makeSymbol("PIF");
        $ic276$ = makeKeyword("TERM");
        $ic277$ = makeKeyword("ARGNUM");
        $ic278$ = makeSymbol("S#13034", "CYC");
        $ic279$ = makeSymbol("S#13025", "CYC");
        $ic280$ = makeSymbol("S#13036", "CYC");
        $ic281$ = makeKeyword("TERMS");
        $ic282$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13104", "CYC"), (SubLObject)makeSymbol("NART-HL-FORMULA"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#13101", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic283$ = ConsesLow.list((SubLObject)makeKeyword("METHODS"), (SubLObject)makeKeyword("DONE"));
        $ic284$ = makeUninternedSymbol("US#16ECB9A");
        $ic285$ = makeSymbol("S#13039", "CYC");
        $ic286$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12704", "CYC"), (SubLObject)makeSymbol("NART-HL-FORMULA"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#13101", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic287$ = makeSymbol("S#13040", "CYC");
        $ic288$ = makeSymbol("S#13105", "CYC");
        $ic289$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12704", "CYC"), (SubLObject)makeSymbol("S#13103", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic290$ = makeUninternedSymbol("US#12702DE");
        $ic291$ = makeUninternedSymbol("US#1074F5E");
        $ic292$ = makeSymbol("S#13041", "CYC");
        $ic293$ = makeSymbol("S#13043", "CYC");
        $ic294$ = makeKeyword("FUNCTION-EXTENT");
        $ic295$ = makeSymbol("S#13045", "CYC");
        $ic296$ = makeSymbol("S#13047", "CYC");
        $ic297$ = makeSymbol("S#13042", "CYC");
        $ic298$ = makeString("Unsupported method ~S in ~S in DO-NAT-LOOKUP-INDEX");
        $ic299$ = makeUninternedSymbol("US#516A0DA");
        $ic300$ = makeUninternedSymbol("US#759625C");
        $ic301$ = makeUninternedSymbol("US#705DAD2");
        $ic302$ = makeSymbol("S#13044", "CYC");
        $ic303$ = makeKeyword("FUNCTOR");
        $ic304$ = makeSymbol("S#13046", "CYC");
        $ic305$ = makeSymbol("S#13048", "CYC");
        $ic306$ = makeSymbol("S#12741", "CYC");
        $ic307$ = makeSymbol("S#13053", "CYC");
        $ic308$ = makeSymbol("QUOTE");
        $ic309$ = ConsesLow.listS((SubLObject)makeSymbol("S#13106", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("REST"));
        $ic310$ = makeString("Unexpected non-simple index ~s");
        $ic311$ = ConsesLow.list((SubLObject)makeSymbol("S#13107", "CYC"), (SubLObject)makeSymbol("S#13108", "CYC"), (SubLObject)makeSymbol("S#13109", "CYC"));
        $ic312$ = makeKeyword("NART");
        $ic313$ = ConsesLow.list((SubLObject)makeSymbol("S#13110", "CYC"));
        $ic314$ = makeString("unexpected type ~s in simple final index spec ~s");
        $ic315$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#8831", "CYC"));
        $ic316$ = makeSymbol("S#12743", "CYC");
        $ic317$ = makeSymbol("S#12746", "CYC");
        $ic318$ = makeSymbol("S#13060", "CYC");
        $ic319$ = makeSymbol("S#13090", "CYC");
        $ic320$ = makeInteger(512);
        $ic321$ = makeSymbol("S#12744", "CYC");
        $ic322$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic323$ = ConsesLow.list((SubLObject)makeSymbol("S#13107", "CYC"), (SubLObject)makeSymbol("S#13111", "CYC"), (SubLObject)makeSymbol("S#13109", "CYC"));
        $ic324$ = ConsesLow.list((SubLObject)makeSymbol("S#770", "CYC"), (SubLObject)makeSymbol("S#13112", "CYC"));
        $ic325$ = makeSymbol("S#12753", "CYC");
        $ic326$ = ConsesLow.list((SubLObject)makeSymbol("S#13107", "CYC"), (SubLObject)makeSymbol("S#13113", "CYC"));
        $ic327$ = ConsesLow.list((SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#13114", "CYC"));
        $ic328$ = constant_handles_oc.f8479((SubLObject)makeString("abnormal"));
        $ic329$ = constant_handles_oc.f8479((SubLObject)makeString("meetsPragmaticRequirement"));
        $ic330$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
    }
    
    public static final class $f10028$UnaryFunction extends UnaryFunction
    {
        public $f10028$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12720"));
        }
        
        public SubLObject processItem(final SubLObject var113) {
            return f10028(var113);
        }
    }
    
    public static final class $f10029$UnaryFunction extends UnaryFunction
    {
        public $f10029$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12721"));
        }
        
        public SubLObject processItem(final SubLObject var113) {
            return f10029(var113);
        }
    }
    
    public static final class $f10046$UnaryFunction extends UnaryFunction
    {
        public $f10046$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12722"));
        }
        
        public SubLObject processItem(final SubLObject var113) {
            return f10046(var113);
        }
    }
    
    public static final class $f10047$UnaryFunction extends UnaryFunction
    {
        public $f10047$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12723"));
        }
        
        public SubLObject processItem(final SubLObject var113) {
            return f10047(var113);
        }
    }
    
    public static final class $f10069$UnaryFunction extends UnaryFunction
    {
        public $f10069$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12724"));
        }
        
        public SubLObject processItem(final SubLObject var113) {
            return f10069(var113);
        }
    }
    
    public static final class $f10070$UnaryFunction extends UnaryFunction
    {
        public $f10070$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12725"));
        }
        
        public SubLObject processItem(final SubLObject var113) {
            return f10070(var113);
        }
    }
    
    public static final class $f10102$UnaryFunction extends UnaryFunction
    {
        public $f10102$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12726"));
        }
        
        public SubLObject processItem(final SubLObject var113) {
            return f10102(var113);
        }
    }
    
    public static final class $f10103$UnaryFunction extends UnaryFunction
    {
        public $f10103$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12727"));
        }
        
        public SubLObject processItem(final SubLObject var113) {
            return f10103(var113);
        }
    }
    
    public static final class $f10126$UnaryFunction extends UnaryFunction
    {
        public $f10126$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12728"));
        }
        
        public SubLObject processItem(final SubLObject var113) {
            return f10126(var113);
        }
    }
    
    public static final class $f10127$UnaryFunction extends UnaryFunction
    {
        public $f10127$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12729"));
        }
        
        public SubLObject processItem(final SubLObject var113) {
            return f10127(var113);
        }
    }
    
    public static final class $f10165$UnaryFunction extends UnaryFunction
    {
        public $f10165$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12730"));
        }
        
        public SubLObject processItem(final SubLObject var113) {
            return f10165(var113);
        }
    }
    
    public static final class $f10166$UnaryFunction extends UnaryFunction
    {
        public $f10166$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12731"));
        }
        
        public SubLObject processItem(final SubLObject var113) {
            return f10166(var113);
        }
    }
    
    public static final class $f10279$BinaryFunction extends BinaryFunction
    {
        public $f10279$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12737"));
        }
        
        public SubLObject processItem(final SubLObject var113, final SubLObject var261) {
            return f10279(var113, var261);
        }
    }
    
    public static final class $f10318$BinaryFunction extends BinaryFunction
    {
        public $f10318$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12741"));
        }
        
        public SubLObject processItem(final SubLObject var113, final SubLObject var261) {
            return f10318(var113, var261);
        }
    }
    
    public static final class $f10321$ZeroArityFunction extends ZeroArityFunction
    {
        public $f10321$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12744"));
        }
        
        public SubLObject processItem() {
            return f10321();
        }
    }
    
    public static final class $f10348$BinaryFunction extends BinaryFunction
    {
        public $f10348$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12759"));
        }
        
        public SubLObject processItem(final SubLObject var113, final SubLObject var261) {
            return f10348(var113, var261);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1934 ms
	
	Decompiled with Procyon 0.5.32.
*/