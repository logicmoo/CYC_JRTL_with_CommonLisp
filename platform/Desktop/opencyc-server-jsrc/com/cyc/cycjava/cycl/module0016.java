package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0016 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0016";
    public static final String myFingerPrint = "f43470eea46f72e2f5dc806e9c5e8c1197750af4e611e94c592a49019012e68b";
    public static SubLSymbol $g545$;
    public static SubLSymbol $g546$;
    public static SubLSymbol $g547$;
    public static SubLSymbol $g548$;
    public static SubLSymbol $g549$;
    public static SubLSymbol $g550$;
    public static SubLSymbol $g551$;
    public static SubLSymbol $g552$;
    public static SubLSymbol $g553$;
    public static SubLSymbol $g554$;
    public static SubLSymbol $g555$;
    public static SubLSymbol $g556$;
    public static SubLSymbol $g557$;
    public static SubLSymbol $g558$;
    private static SubLSymbol $g559$;
    private static SubLSymbol $g560$;
    private static SubLSymbol $g561$;
    private static SubLSymbol $g562$;
    private static SubLSymbol $g563$;
    private static SubLSymbol $g564$;
    public static SubLSymbol $g565$;
    public static SubLSymbol $g566$;
    public static SubLSymbol $g567$;
    public static SubLSymbol $g568$;
    public static SubLSymbol $g569$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLList $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
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
    private static final SubLList $ic51$;
    private static final SubLList $ic52$;
    private static final SubLList $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLList $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLList $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLList $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLList $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLList $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
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
    private static final SubLString $ic123$;
    private static final SubLList $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLList $ic134$;
    private static final SubLList $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLList $ic139$;
    private static final SubLList $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLList $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLString $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLString $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLString $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLString $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLString $ic175$;
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLString $ic182$;
    private static final SubLList $ic183$;
    private static final SubLList $ic184$;
    private static final SubLString $ic185$;
    private static final SubLString $ic186$;
    private static final SubLString $ic187$;
    private static final SubLList $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLList $ic190$;
    private static final SubLList $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLList $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLString $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLString $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLString $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLList $ic203$;
    private static final SubLList $ic204$;
    private static final SubLList $ic205$;
    private static final SubLString $ic206$;
    private static final SubLList $ic207$;
    private static final SubLList $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLString $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLInteger $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLString $ic219$;
    private static final SubLString $ic220$;
    private static final SubLString $ic221$;
    private static final SubLString $ic222$;
    private static final SubLList $ic223$;
    private static final SubLString $ic224$;
    private static final SubLString $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLString $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLString $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLString $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLString $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLString $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLString $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLString $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLString $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLString $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLString $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLString $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLString $ic249$;
    private static final SubLString $ic250$;
    private static final SubLString $ic251$;
    private static final SubLString $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLString $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLString $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLString $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLString $ic260$;
    private static final SubLString $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLString $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLString $ic265$;
    private static final SubLString $ic266$;
    
    public static SubLObject f884(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic4$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : module0016.$ic5$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0016.$ic4$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0016.$ic6$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0016.$ic4$);
        var4 = var4.rest();
        if (module0016.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            SubLObject var9 = (SubLObject)module0016.NIL;
            if (module0016.NIL != var6) {
                var9 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0016.$ic7$, (SubLObject)module0016.$ic8$, (SubLObject)(var6.isAtom() ? ConsesLow.list((SubLObject)module0016.$ic9$, var6) : var6)), var9);
            }
            if (module0016.NIL != var7) {
                var9 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0016.$ic7$, (SubLObject)module0016.$ic10$, (SubLObject)(var6.isAtom() ? ConsesLow.list((SubLObject)module0016.$ic9$, var7) : var7)), var9);
            }
            if (module0016.NIL != var9) {
                var9 = Sequences.nreverse(var9);
            }
            return (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic11$, (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic12$, (SubLObject)module0016.$ic13$, ConsesLow.append(var9, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)module0016.$ic14$, ConsesLow.append(var8, (SubLObject)module0016.NIL))))), (SubLObject)module0016.$ic15$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0016.$ic4$);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f885(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic25$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0016.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic25$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0016.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic11$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic26$, var6), ConsesLow.append(var7, (SubLObject)module0016.$ic27$));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0016.$ic25$);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f886(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        return PrintLow.format(module0015.$g131$.getDynamicValue(var14), (SubLObject)module0016.$ic29$, var13);
    }
    
    public static SubLObject f887() {
        return module0642.f39020((SubLObject)module0016.$ic31$);
    }
    
    public static SubLObject f888(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic32$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0016.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic32$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0016.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic11$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic33$, var6), ConsesLow.append(var7, (SubLObject)module0016.$ic34$));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0016.$ic32$);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f889(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        return PrintLow.format(module0015.$g131$.getDynamicValue(var19), (SubLObject)module0016.$ic36$, var18);
    }
    
    public static SubLObject f890() {
        return module0642.f39020((SubLObject)module0016.$ic38$);
    }
    
    public static SubLObject f891(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic39$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0016.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic39$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic39$);
        final SubLObject var22_23 = var4.rest();
        var4 = var4.first();
        SubLObject var7 = (SubLObject)module0016.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0016.NIL;
        SubLObject var27_28 = (SubLObject)module0016.NIL;
        while (module0016.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0016.$ic39$);
            var27_28 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0016.$ic39$);
            if (module0016.NIL == conses_high.member(var27_28, (SubLObject)module0016.$ic40$, (SubLObject)module0016.UNPROVIDED, (SubLObject)module0016.UNPROVIDED)) {
                var9 = (SubLObject)module0016.T;
            }
            if (var27_28 == module0016.$ic41$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0016.NIL != var9 && module0016.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0016.$ic39$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic42$, var4);
        final SubLObject var11 = (SubLObject)((module0016.NIL != var10) ? conses_high.cadr(var10) : module0016.NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic43$, var4);
        final SubLObject var13 = (SubLObject)((module0016.NIL != var12) ? conses_high.cadr(var12) : module0016.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic44$, var4);
        final SubLObject var15 = (SubLObject)((module0016.NIL != var14) ? conses_high.cadr(var14) : module0016.NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic45$, var4);
        final SubLObject var17 = (SubLObject)((module0016.NIL != var16) ? conses_high.cadr(var16) : module0016.NIL);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic46$, var4);
        final SubLObject var19 = (SubLObject)((module0016.NIL != var18) ? conses_high.cadr(var18) : module0016.NIL);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic47$, var4);
        final SubLObject var21 = (SubLObject)((module0016.NIL != var20) ? conses_high.cadr(var20) : module0016.NIL);
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic48$, var4);
        final SubLObject var23 = (SubLObject)((module0016.NIL != var22) ? conses_high.cadr(var22) : module0016.NIL);
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic49$, var4);
        final SubLObject var25 = (SubLObject)((module0016.NIL != var24) ? conses_high.cadr(var24) : module0016.NIL);
        final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic50$, var4);
        final SubLObject var27 = (SubLObject)((module0016.NIL != var26) ? conses_high.cadr(var26) : module0016.NIL);
        final SubLObject var28;
        var4 = (var28 = var22_23);
        var4 = var5;
        if (module0016.NIL == var4) {
            SubLObject var29 = (SubLObject)module0016.NIL;
            if (module0016.NIL != var23) {
                var29 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0016.$ic35$, (SubLObject)module0016.$ic51$, (SubLObject)(var23.isAtom() ? ConsesLow.list((SubLObject)module0016.$ic9$, var23) : var23)), var29);
            }
            if (module0016.NIL != var11) {
                var29 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0016.$ic35$, (SubLObject)module0016.$ic52$, (SubLObject)(var11.isAtom() ? ConsesLow.list((SubLObject)module0016.$ic9$, var11) : var11)), var29);
            }
            if (module0016.NIL != var13) {
                var29 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0016.$ic35$, (SubLObject)module0016.$ic53$, (SubLObject)(var13.isAtom() ? ConsesLow.list((SubLObject)module0016.$ic9$, var13) : var13)), var29);
            }
            if (module0016.NIL != var17) {
                var29 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0016.$ic35$, (SubLObject)module0016.$ic54$, (SubLObject)(var17.isAtom() ? ConsesLow.list((SubLObject)module0016.$ic9$, var17) : var17)), var29);
            }
            if (module0016.NIL != var15) {
                var29 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0016.$ic35$, (SubLObject)module0016.$ic55$, (SubLObject)(var15.isAtom() ? ConsesLow.list((SubLObject)module0016.$ic9$, var15) : var15)), var29);
            }
            if (module0016.NIL != var25) {
                var29 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0016.$ic35$, (SubLObject)module0016.$ic56$, (SubLObject)(var25.isAtom() ? ConsesLow.list((SubLObject)module0016.$ic9$, var25) : var25)), var29);
            }
            if (module0016.NIL != var27) {
                var29 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0016.$ic35$, (SubLObject)module0016.$ic57$, (SubLObject)(var27.isAtom() ? ConsesLow.list((SubLObject)module0016.$ic9$, var27) : var27)), var29);
            }
            if (module0016.NIL != var19) {
                var29 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0016.$ic35$, (SubLObject)module0016.$ic58$, (SubLObject)(var19.isAtom() ? ConsesLow.list((SubLObject)module0016.$ic9$, var19) : var19)), var29);
            }
            if (module0016.NIL != var21) {
                var29 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0016.$ic35$, (SubLObject)module0016.$ic59$, (SubLObject)(var21.isAtom() ? ConsesLow.list((SubLObject)module0016.$ic9$, var21) : var21)), var29);
            }
            if (module0016.NIL != var29) {
                var29 = Sequences.nreverse(var29);
            }
            return (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic11$, (SubLObject)module0016.$ic60$, (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic28$, (SubLObject)ConsesLow.list(var6), ConsesLow.append(var29, var28, (SubLObject)module0016.NIL)), (SubLObject)module0016.$ic15$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0016.$ic39$);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f892() {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0014.f657((SubLObject)module0016.$ic61$);
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var15);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic65$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        final SubLObject var16 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var16, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return module0642.f39029((SubLObject)module0016.UNPROVIDED);
    }
    
    public static SubLObject f893() {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0014.f657((SubLObject)module0016.$ic66$);
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var15);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic65$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        final SubLObject var16 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var16, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f894() {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0014.f657((SubLObject)module0016.$ic68$);
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var15);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic65$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        final SubLObject var16 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var16, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f895() {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0014.f657((SubLObject)module0016.$ic49$);
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var15);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic65$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        final SubLObject var16 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var16, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return module0642.f39029((SubLObject)module0016.UNPROVIDED);
    }
    
    public static SubLObject f896(final SubLObject var49) {
        return module0004.f104(var49, (SubLObject)module0016.$ic70$, (SubLObject)module0016.UNPROVIDED, (SubLObject)module0016.UNPROVIDED);
    }
    
    public static SubLObject f897(final SubLObject var49) {
        return module0004.f104(var49, (SubLObject)module0016.$ic71$, (SubLObject)module0016.UNPROVIDED, (SubLObject)module0016.UNPROVIDED);
    }
    
    public static SubLObject f898(final SubLObject var44) {
        if (var44.eql((SubLObject)module0016.$ic72$)) {
            return (SubLObject)module0016.$ic73$;
        }
        if (var44.eql((SubLObject)module0016.$ic73$)) {
            return (SubLObject)module0016.$ic72$;
        }
        return Errors.error((SubLObject)module0016.$ic74$, var44);
    }
    
    public static SubLObject f899(final SubLObject var44, final SubLObject var51) {
        assert module0016.NIL != f897(var44) : var44;
        assert module0016.NIL != f896(var51) : var51;
        if (module0016.$ic73$ == var44) {
            return (SubLObject)module0016.$ic77$;
        }
        if (module0016.$ic78$ == var51) {
            return (SubLObject)module0016.$ic79$;
        }
        return (SubLObject)module0016.$ic80$;
    }
    
    public static SubLObject f900(final SubLObject var13, final SubLObject var44, SubLObject var51) {
        if (var51 == module0016.UNPROVIDED) {
            var51 = (SubLObject)module0016.$ic81$;
        }
        final SubLObject var52 = f899(var44, var51);
        return Sequences.cconcatenate((SubLObject)module0016.$ic82$, new SubLObject[] { module0006.f203(var13), module0016.$ic83$, module0006.f203(var52), module0016.$ic84$ });
    }
    
    public static SubLObject f901(final SubLObject var13, final SubLObject var44, SubLObject var51) {
        if (var51 == module0016.UNPROVIDED) {
            var51 = (SubLObject)module0016.$ic81$;
        }
        final SubLThread var52 = SubLProcess.currentSubLThread();
        final SubLObject var53 = f899(var44, var51);
        module0642.f39020(module0016.$g545$.getGlobalValue());
        module0642.f39020(module0016.$g546$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic5$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0016.$g547$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic6$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        final SubLObject var54 = module0015.$g533$.currentBinding(var52);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var52);
            module0642.f39028((SubLObject)module0016.UNPROVIDED);
            f886(var13);
            f889(module0016.$g555$.getGlobalValue());
            module0642.f39020(var53);
            f890();
            f887();
            module0642.f39028((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var54, var52);
        }
        module0642.f39020(module0016.$g548$.getGlobalValue());
        module0642.f39028((SubLObject)module0016.UNPROVIDED);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f902(final SubLObject var13) {
        final SubLObject var14 = f903(var13);
        final SubLObject var15 = f904(var13);
        return Values.values(var14, var15);
    }
    
    public static SubLObject f903(final SubLObject var13) {
        assert module0016.NIL != Types.stringp(var13) : var13;
        return Sequences.cconcatenate(var13, (SubLObject)module0016.$ic86$);
    }
    
    public static SubLObject f904(final SubLObject var13) {
        assert module0016.NIL != Types.stringp(var13) : var13;
        return Sequences.cconcatenate(var13, (SubLObject)module0016.$ic87$);
    }
    
    public static SubLObject f905(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic88$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0016.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic88$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0016.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0016.NIL;
        SubLObject var61_62 = (SubLObject)module0016.NIL;
        while (module0016.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0016.$ic88$);
            var61_62 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0016.$ic88$);
            if (module0016.NIL == conses_high.member(var61_62, (SubLObject)module0016.$ic89$, (SubLObject)module0016.UNPROVIDED, (SubLObject)module0016.UNPROVIDED)) {
                var9 = (SubLObject)module0016.T;
            }
            if (var61_62 == module0016.$ic41$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0016.NIL != var9 && module0016.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0016.$ic88$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic90$, var4);
        final SubLObject var11 = (SubLObject)((module0016.NIL != var10) ? conses_high.cadr(var10) : module0016.$ic72$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic91$, var4);
        final SubLObject var13 = (SubLObject)((module0016.NIL != var12) ? conses_high.cadr(var12) : module0016.$ic81$);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic11$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic92$, var6, var11, var13), (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic93$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic94$, var6), ConsesLow.append(var14, (SubLObject)module0016.NIL)), (SubLObject)module0016.$ic95$);
    }
    
    public static SubLObject f906(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic88$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0016.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic88$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0016.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0016.NIL;
        SubLObject var72_73 = (SubLObject)module0016.NIL;
        while (module0016.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0016.$ic88$);
            var72_73 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0016.$ic88$);
            if (module0016.NIL == conses_high.member(var72_73, (SubLObject)module0016.$ic89$, (SubLObject)module0016.UNPROVIDED, (SubLObject)module0016.UNPROVIDED)) {
                var9 = (SubLObject)module0016.T;
            }
            if (var72_73 == module0016.$ic41$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0016.NIL != var9 && module0016.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0016.$ic88$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic90$, var4);
        final SubLObject var11 = (SubLObject)((module0016.NIL != var10) ? conses_high.cadr(var10) : module0016.$ic72$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic91$, var4);
        final SubLObject var13 = (SubLObject)((module0016.NIL != var12) ? conses_high.cadr(var12) : module0016.$ic81$);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic11$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic96$, var6, var11, var13), (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic93$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic94$, var6), ConsesLow.append(var14, (SubLObject)module0016.NIL)), (SubLObject)module0016.$ic95$);
    }
    
    public static SubLObject f907(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic97$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0016.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic97$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0016.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0016.NIL;
        SubLObject var82_83 = (SubLObject)module0016.NIL;
        while (module0016.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0016.$ic97$);
            var82_83 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0016.$ic97$);
            if (module0016.NIL == conses_high.member(var82_83, (SubLObject)module0016.$ic98$, (SubLObject)module0016.UNPROVIDED, (SubLObject)module0016.UNPROVIDED)) {
                var9 = (SubLObject)module0016.T;
            }
            if (var82_83 == module0016.$ic41$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0016.NIL != var9 && module0016.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0016.$ic97$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic99$, var4);
        final SubLObject var11 = (SubLObject)((module0016.NIL != var10) ? conses_high.cadr(var10) : module0016.$ic100$);
        final SubLObject var12;
        var4 = (var12 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic11$, (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic101$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic94$, var6, (SubLObject)module0016.$ic99$, var11), ConsesLow.append(var12, (SubLObject)module0016.NIL)), (SubLObject)module0016.$ic95$);
    }
    
    public static SubLObject f908(final SubLObject var13, final SubLObject var44, SubLObject var51) {
        if (var51 == module0016.UNPROVIDED) {
            var51 = (SubLObject)module0016.$ic81$;
        }
        final SubLThread var52 = SubLProcess.currentSubLThread();
        var52.resetMultipleValues();
        final SubLObject var53 = f902(var13);
        final SubLObject var54 = var52.secondMultipleValue();
        var52.resetMultipleValues();
        f901(var13, var44, var51);
        f901(var53, f898(var44), (SubLObject)module0016.$ic81$);
        f901(var54, var44, (SubLObject)module0016.$ic81$);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f909(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic103$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0016.NIL;
        SubLObject var7 = (SubLObject)module0016.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic103$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic103$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0016.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0016.NIL;
        SubLObject var92_93 = (SubLObject)module0016.NIL;
        while (module0016.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0016.$ic103$);
            var92_93 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0016.$ic103$);
            if (module0016.NIL == conses_high.member(var92_93, (SubLObject)module0016.$ic104$, (SubLObject)module0016.UNPROVIDED, (SubLObject)module0016.UNPROVIDED)) {
                var10 = (SubLObject)module0016.T;
            }
            if (var92_93 == module0016.$ic41$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0016.NIL != var10 && module0016.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0016.$ic103$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic105$, var4);
        final SubLObject var12 = (SubLObject)((module0016.NIL != var11) ? conses_high.cadr(var11) : module0016.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic91$, var4);
        final SubLObject var14 = (SubLObject)((module0016.NIL != var13) ? conses_high.cadr(var13) : module0016.$ic81$);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)module0016.$ic106$;
        final SubLObject var17 = (SubLObject)module0016.$ic107$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic108$, (SubLObject)ConsesLow.list(reader.bq_cons(var16, (SubLObject)module0016.$ic109$), (SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic110$, var6, var7, var14))), (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic111$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic112$, var16, (SubLObject)module0016.$ic113$, var17), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic114$, var12, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic115$, var12)), ConsesLow.append(var15, (SubLObject)module0016.NIL)), (SubLObject)module0016.$ic95$);
    }
    
    public static SubLObject f910(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic116$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0016.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic116$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0016.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0016.NIL;
        SubLObject var105_106 = (SubLObject)module0016.NIL;
        while (module0016.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0016.$ic116$);
            var105_106 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0016.$ic116$);
            if (module0016.NIL == conses_high.member(var105_106, (SubLObject)module0016.$ic117$, (SubLObject)module0016.UNPROVIDED, (SubLObject)module0016.UNPROVIDED)) {
                var9 = (SubLObject)module0016.T;
            }
            if (var105_106 == module0016.$ic41$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0016.NIL != var9 && module0016.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0016.$ic116$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic105$, var4);
        final SubLObject var11 = (SubLObject)((module0016.NIL != var10) ? conses_high.cadr(var10) : module0016.NIL);
        final SubLObject var12;
        var4 = (var12 = var5);
        final SubLObject var13 = (SubLObject)module0016.$ic118$;
        final SubLObject var14 = (SubLObject)module0016.$ic119$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic108$, (SubLObject)ConsesLow.list(reader.bq_cons(var13, (SubLObject)module0016.$ic109$), (SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic120$, var6))), (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic111$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic112$, var13, (SubLObject)module0016.$ic113$, var14), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic114$, var11, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic115$, var11)), ConsesLow.append(var12, (SubLObject)module0016.NIL)), (SubLObject)module0016.$ic95$);
    }
    
    public static SubLObject f911(final SubLObject var13) {
        assert module0016.NIL != Strings.string(var13) : var13;
        return Sequences.cconcatenate((SubLObject)module0016.$ic123$, new SubLObject[] { var13, module0016.$ic84$ });
    }
    
    public static SubLObject f912(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0016.NIL;
        SubLObject var6 = (SubLObject)module0016.NIL;
        SubLObject var7 = (SubLObject)module0016.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic124$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic124$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic124$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0016.NIL == var4) {
            final SubLObject var8 = (SubLObject)module0016.$ic125$;
            final SubLObject var9 = (SubLObject)module0016.$ic126$;
            final SubLObject var10 = (SubLObject)module0016.$ic127$;
            final SubLObject var11 = (SubLObject)module0016.$ic128$;
            return (SubLObject)ConsesLow.list((SubLObject)module0016.$ic129$, (SubLObject)ConsesLow.list(var8, var9, var10, var11), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic130$, var5), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic131$, var8, var10), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic132$, var8, var9, var6), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic132$, var10, var11, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0016.$ic124$);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f913(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var14.resetMultipleValues();
        final SubLObject var15 = f902(var13);
        final SubLObject var16 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        final SubLObject var17 = f914(var13, var15, var16);
        final SubLObject var18 = f915(var13, var15, var16);
        return Values.values(var15, var17, var16, var18);
    }
    
    public static SubLObject f916(final SubLObject var53, final SubLObject var54) {
        f901(var53, (SubLObject)module0016.$ic72$, (SubLObject)module0016.$ic81$);
        f901(var54, (SubLObject)module0016.$ic73$, (SubLObject)module0016.$ic81$);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f917(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0016.NIL;
        SubLObject var6 = (SubLObject)module0016.NIL;
        SubLObject var7 = (SubLObject)module0016.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic135$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic135$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic135$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0016.NIL == var4) {
            final SubLObject var8 = (SubLObject)module0016.$ic136$;
            return (SubLObject)ConsesLow.list((SubLObject)module0016.$ic108$, (SubLObject)ConsesLow.list(reader.bq_cons(var8, (SubLObject)module0016.$ic109$)), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic137$, (SubLObject)ConsesLow.list(var5), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic138$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic111$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic112$, var8, (SubLObject)module0016.$ic113$, var6), var7))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0016.$ic135$);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f914(final SubLObject var13, final SubLObject var53, final SubLObject var54) {
        return Sequences.cconcatenate(f900(var13, (SubLObject)module0016.$ic72$, (SubLObject)module0016.$ic78$), new SubLObject[] { f900(var53, (SubLObject)module0016.$ic73$, (SubLObject)module0016.$ic81$), f900(var54, (SubLObject)module0016.$ic72$, (SubLObject)module0016.$ic81$) });
    }
    
    public static SubLObject f915(final SubLObject var13, final SubLObject var53, final SubLObject var54) {
        return Sequences.cconcatenate(f900(var13, (SubLObject)module0016.$ic73$, (SubLObject)module0016.$ic78$), new SubLObject[] { f900(var53, (SubLObject)module0016.$ic72$, (SubLObject)module0016.$ic81$), f900(var54, (SubLObject)module0016.$ic73$, (SubLObject)module0016.$ic81$) });
    }
    
    public static SubLObject f918(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic139$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0016.NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)module0016.NIL;
        SubLObject var124_125 = (SubLObject)module0016.NIL;
        while (module0016.NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0016.$ic139$);
            var124_125 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0016.$ic139$);
            if (module0016.NIL == conses_high.member(var124_125, (SubLObject)module0016.$ic140$, (SubLObject)module0016.UNPROVIDED, (SubLObject)module0016.UNPROVIDED)) {
                var8 = (SubLObject)module0016.T;
            }
            if (var124_125 == module0016.$ic41$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (module0016.NIL != var8 && module0016.NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0016.$ic139$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic141$, var4);
        final SubLObject var10 = (SubLObject)((module0016.NIL != var9) ? conses_high.cadr(var9) : module0016.NIL);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic142$, var4);
        final SubLObject var12 = (SubLObject)((module0016.NIL != var11) ? conses_high.cadr(var11) : module0016.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic111$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic112$, (SubLObject)module0016.$ic143$, (SubLObject)module0016.$ic113$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic9$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic144$, var10, var12))), ConsesLow.append(var13, (SubLObject)module0016.NIL));
    }
    
    public static SubLObject f919(final SubLObject var127, final SubLObject var129) {
        return Sequences.cconcatenate((SubLObject)module0016.$ic82$, new SubLObject[] { module0006.f203(var127), module0016.$ic146$, module0006.f203(var129), module0016.$ic147$ });
    }
    
    public static SubLObject f920(final SubLObject var13, final SubLObject var130, final SubLObject var131) {
        final SubLThread var132 = SubLProcess.currentSubLThread();
        var132.resetMultipleValues();
        final SubLObject var133 = f913(var13);
        final SubLObject var134 = var132.secondMultipleValue();
        final SubLObject var135 = var132.thirdMultipleValue();
        final SubLObject var136 = var132.fourthMultipleValue();
        var132.resetMultipleValues();
        f916(var133, var135);
        SubLObject var137 = module0016.$g558$.getGlobalValue();
        module0642.f39020(module0015.$g149$.getGlobalValue());
        if (module0016.NIL != var133) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var133);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        }
        module0642.f39020(module0015.$g152$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic100$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        SubLObject var138 = module0015.$g533$.currentBinding(var132);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var132);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var137);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(module0015.$g160$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var134);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
            final SubLObject var48_137 = module0015.$g533$.currentBinding(var132);
            try {
                module0015.$g533$.bind((SubLObject)module0016.T, var132);
                module0642.f39019(var130);
            }
            finally {
                module0015.$g533$.rebind(var48_137, var132);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39020(module0015.$g231$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var138, var132);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        var137 = module0016.$g558$.getGlobalValue();
        module0642.f39020(module0015.$g149$.getGlobalValue());
        if (module0016.NIL != var135) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var135);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        }
        module0642.f39020(module0015.$g152$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic100$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        var138 = module0015.$g533$.currentBinding(var132);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var132);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var137);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(module0015.$g160$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var136);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
            final SubLObject var48_138 = module0015.$g533$.currentBinding(var132);
            try {
                module0015.$g533$.bind((SubLObject)module0016.T, var132);
                module0642.f39019(var131);
            }
            finally {
                module0015.$g533$.rebind(var48_138, var132);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39020(module0015.$g231$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var138, var132);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f921(final SubLObject var13, final SubLObject var139) {
        return f922(var13, var139, (SubLObject)module0016.$ic161$, (SubLObject)module0016.$ic163$);
    }
    
    public static SubLObject f923(final SubLObject var13, final SubLObject var139) {
        return f922(var13, var139, (SubLObject)module0016.$ic148$, (SubLObject)module0016.$ic153$);
    }
    
    public static SubLObject f922(final SubLObject var13, final SubLObject var139, final SubLObject var140, final SubLObject var141) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        var142.resetMultipleValues();
        final SubLObject var143 = f913(var13);
        final SubLObject var144 = var142.secondMultipleValue();
        final SubLObject var145 = var142.thirdMultipleValue();
        final SubLObject var146 = var142.fourthMultipleValue();
        var142.resetMultipleValues();
        f916(var143, var145);
        SubLObject var147 = module0016.$g558$.getGlobalValue();
        module0642.f39020(module0015.$g149$.getGlobalValue());
        if (module0016.NIL != var143) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var143);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        }
        module0642.f39020(module0015.$g152$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic100$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        SubLObject var148 = module0015.$g533$.currentBinding(var142);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var142);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var147);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(module0015.$g160$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var144);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
            final SubLObject var48_142 = module0015.$g533$.currentBinding(var142);
            try {
                module0015.$g533$.bind((SubLObject)module0016.T, var142);
                final SubLObject var149 = Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var142), module0014.f683(var140));
                final SubLObject var150 = (SubLObject)module0016.$ic42$;
                final SubLObject var151 = module0014.f679(var140);
                final SubLObject var152 = (SubLObject)module0016.ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                module0642.f39020(var149);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                if (module0016.NIL != var151) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var151);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var150) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(module0642.f39049(var150));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var152) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var152);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
                final SubLObject var48_143 = module0015.$g533$.currentBinding(var142);
                try {
                    module0015.$g533$.bind((SubLObject)module0016.T, var142);
                }
                finally {
                    module0015.$g533$.rebind(var48_143, var142);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var48_142, var142);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39020(module0015.$g231$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var148, var142);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        var147 = module0016.$g558$.getGlobalValue();
        module0642.f39020(module0015.$g149$.getGlobalValue());
        if (module0016.NIL != var145) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var145);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        }
        module0642.f39020(module0015.$g152$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic100$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        var148 = module0015.$g533$.currentBinding(var142);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var142);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var147);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(module0015.$g160$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var146);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
            final SubLObject var48_144 = module0015.$g533$.currentBinding(var142);
            try {
                module0015.$g533$.bind((SubLObject)module0016.T, var142);
                final SubLObject var149 = Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var142), module0014.f683(var141));
                final SubLObject var150 = (SubLObject)module0016.$ic42$;
                final SubLObject var151 = module0014.f679(var141);
                final SubLObject var152 = (SubLObject)module0016.ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                module0642.f39020(var149);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                if (module0016.NIL != var151) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var151);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var150) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(module0642.f39049(var150));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var152) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var152);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
                final SubLObject var48_145 = module0015.$g533$.currentBinding(var142);
                try {
                    module0015.$g533$.bind((SubLObject)module0016.T, var142);
                }
                finally {
                    module0015.$g533$.rebind(var48_145, var142);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var48_144, var142);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39020(module0015.$g231$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var148, var142);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39019(var139);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f924(final SubLObject var13, final SubLObject var139) {
        final SubLThread var140 = SubLProcess.currentSubLThread();
        var140.resetMultipleValues();
        final SubLObject var141 = f913(var13);
        final SubLObject var142 = var140.secondMultipleValue();
        final SubLObject var143 = var140.thirdMultipleValue();
        final SubLObject var144 = var140.fourthMultipleValue();
        var140.resetMultipleValues();
        f916(var141, var143);
        SubLObject var145 = module0016.$g558$.getGlobalValue();
        module0642.f39020(module0015.$g149$.getGlobalValue());
        if (module0016.NIL != var141) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var141);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        }
        module0642.f39020(module0015.$g152$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic100$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        SubLObject var146 = module0015.$g533$.currentBinding(var140);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var140);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var145);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(module0015.$g160$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var142);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
            final SubLObject var48_150 = module0015.$g533$.currentBinding(var140);
            try {
                module0015.$g533$.bind((SubLObject)module0016.T, var140);
                final SubLObject var147 = Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var140), module0014.f683((SubLObject)module0016.$ic148$));
                final SubLObject var148 = (SubLObject)module0016.$ic42$;
                final SubLObject var149 = module0014.f679((SubLObject)module0016.$ic148$);
                final SubLObject var150 = (SubLObject)module0016.ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                module0642.f39020(var147);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                if (module0016.NIL != var149) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var149);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var148) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(module0642.f39049(var148));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var150) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var150);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
                final SubLObject var48_151 = module0015.$g533$.currentBinding(var140);
                try {
                    module0015.$g533$.bind((SubLObject)module0016.T, var140);
                }
                finally {
                    module0015.$g533$.rebind(var48_151, var140);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
                module0642.f39019(var139);
            }
            finally {
                module0015.$g533$.rebind(var48_150, var140);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39020(module0015.$g231$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var146, var140);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        var145 = module0016.$g558$.getGlobalValue();
        module0642.f39020(module0015.$g149$.getGlobalValue());
        if (module0016.NIL != var143) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var143);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        }
        module0642.f39020(module0015.$g152$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic100$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        var146 = module0015.$g533$.currentBinding(var140);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var140);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var145);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(module0015.$g160$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var144);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
            final SubLObject var48_152 = module0015.$g533$.currentBinding(var140);
            try {
                module0015.$g533$.bind((SubLObject)module0016.T, var140);
                final SubLObject var147 = Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var140), module0014.f683((SubLObject)module0016.$ic153$));
                final SubLObject var148 = (SubLObject)module0016.$ic42$;
                final SubLObject var149 = module0014.f679((SubLObject)module0016.$ic153$);
                final SubLObject var150 = (SubLObject)module0016.ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                module0642.f39020(var147);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                if (module0016.NIL != var149) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var149);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var148) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(module0642.f39049(var148));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var150) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var150);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
                final SubLObject var48_153 = module0015.$g533$.currentBinding(var140);
                try {
                    module0015.$g533$.bind((SubLObject)module0016.T, var140);
                }
                finally {
                    module0015.$g533$.rebind(var48_153, var140);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
                module0642.f39019(var139);
            }
            finally {
                module0015.$g533$.rebind(var48_152, var140);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39020(module0015.$g231$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var146, var140);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f925(final SubLObject var13, final SubLObject var139) {
        final SubLThread var140 = SubLProcess.currentSubLThread();
        module0642.f39019(var139);
        var140.resetMultipleValues();
        final SubLObject var141 = f913(var13);
        final SubLObject var142 = var140.secondMultipleValue();
        final SubLObject var143 = var140.thirdMultipleValue();
        final SubLObject var144 = var140.fourthMultipleValue();
        var140.resetMultipleValues();
        f916(var141, var143);
        SubLObject var145 = module0016.$g558$.getGlobalValue();
        module0642.f39020(module0015.$g149$.getGlobalValue());
        if (module0016.NIL != var141) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var141);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        }
        module0642.f39020(module0015.$g152$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic100$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        SubLObject var146 = module0015.$g533$.currentBinding(var140);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var140);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var145);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(module0015.$g160$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var142);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
            final SubLObject var48_154 = module0015.$g533$.currentBinding(var140);
            try {
                module0015.$g533$.bind((SubLObject)module0016.T, var140);
                final SubLObject var147 = Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var140), module0014.f683((SubLObject)module0016.$ic151$));
                final SubLObject var148 = (SubLObject)module0016.$ic167$;
                final SubLObject var149 = module0014.f679((SubLObject)module0016.$ic151$);
                final SubLObject var150 = (SubLObject)module0016.ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                module0642.f39020(var147);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                if (module0016.NIL != var149) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var149);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var148) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(module0642.f39049(var148));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var150) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var150);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
                final SubLObject var48_155 = module0015.$g533$.currentBinding(var140);
                try {
                    module0015.$g533$.bind((SubLObject)module0016.T, var140);
                }
                finally {
                    module0015.$g533$.rebind(var48_155, var140);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var48_154, var140);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39020(module0015.$g231$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var146, var140);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        var145 = module0016.$g558$.getGlobalValue();
        module0642.f39020(module0015.$g149$.getGlobalValue());
        if (module0016.NIL != var143) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var143);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        }
        module0642.f39020(module0015.$g152$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic100$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        var146 = module0015.$g533$.currentBinding(var140);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var140);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var145);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(module0015.$g160$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var144);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
            final SubLObject var48_156 = module0015.$g533$.currentBinding(var140);
            try {
                module0015.$g533$.bind((SubLObject)module0016.T, var140);
                final SubLObject var147 = Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var140), module0014.f683((SubLObject)module0016.$ic153$));
                final SubLObject var148 = (SubLObject)module0016.$ic167$;
                final SubLObject var149 = module0014.f679((SubLObject)module0016.$ic153$);
                final SubLObject var150 = (SubLObject)module0016.ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                module0642.f39020(var147);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                if (module0016.NIL != var149) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var149);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var148) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(module0642.f39049(var148));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var150) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var150);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
                final SubLObject var48_157 = module0015.$g533$.currentBinding(var140);
                try {
                    module0015.$g533$.bind((SubLObject)module0016.T, var140);
                }
                finally {
                    module0015.$g533$.rebind(var48_157, var140);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var48_156, var140);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39020(module0015.$g231$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var146, var140);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f926(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var14.resetMultipleValues();
        final SubLObject var15 = f913(var13);
        final SubLObject var16 = var14.secondMultipleValue();
        final SubLObject var17 = var14.thirdMultipleValue();
        final SubLObject var18 = var14.fourthMultipleValue();
        var14.resetMultipleValues();
        f916(var15, var17);
        SubLObject var19 = module0016.$g558$.getGlobalValue();
        module0642.f39020(module0015.$g149$.getGlobalValue());
        if (module0016.NIL != var15) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var15);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        }
        module0642.f39020(module0015.$g152$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic100$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        SubLObject var20 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var19);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(module0015.$g160$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var16);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
            final SubLObject var48_158 = module0015.$g533$.currentBinding(var14);
            try {
                module0015.$g533$.bind((SubLObject)module0016.T, var14);
                final SubLObject var21 = Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var14), module0014.f683((SubLObject)module0016.$ic148$));
                final SubLObject var22 = (SubLObject)module0016.$ic167$;
                final SubLObject var23 = module0014.f679((SubLObject)module0016.$ic148$);
                final SubLObject var24 = (SubLObject)module0016.ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                module0642.f39020(var21);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                if (module0016.NIL != var23) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var23);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var22) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(module0642.f39049(var22));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var24) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var24);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
                final SubLObject var48_159 = module0015.$g533$.currentBinding(var14);
                try {
                    module0015.$g533$.bind((SubLObject)module0016.T, var14);
                }
                finally {
                    module0015.$g533$.rebind(var48_159, var14);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var48_158, var14);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39020(module0015.$g231$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var20, var14);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        var19 = module0016.$g558$.getGlobalValue();
        module0642.f39020(module0015.$g149$.getGlobalValue());
        if (module0016.NIL != var17) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var17);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        }
        module0642.f39020(module0015.$g152$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic100$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        var20 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var19);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(module0015.$g160$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var18);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
            final SubLObject var48_160 = module0015.$g533$.currentBinding(var14);
            try {
                module0015.$g533$.bind((SubLObject)module0016.T, var14);
                final SubLObject var21 = Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var14), module0014.f683((SubLObject)module0016.$ic156$));
                final SubLObject var22 = (SubLObject)module0016.$ic167$;
                final SubLObject var23 = module0014.f679((SubLObject)module0016.$ic156$);
                final SubLObject var24 = (SubLObject)module0016.ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                module0642.f39020(var21);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                if (module0016.NIL != var23) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var23);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var22) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(module0642.f39049(var22));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                if (module0016.NIL != var24) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                    module0642.f39020(var24);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
                final SubLObject var48_161 = module0015.$g533$.currentBinding(var14);
                try {
                    module0015.$g533$.bind((SubLObject)module0016.T, var14);
                }
                finally {
                    module0015.$g533$.rebind(var48_161, var14);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var48_160, var14);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39020(module0015.$g231$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var20, var14);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f927() {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var14), module0014.f683((SubLObject)module0016.$ic158$));
        final SubLObject var16 = (SubLObject)module0016.$ic42$;
        final SubLObject var17 = module0014.f679((SubLObject)module0016.$ic158$);
        final SubLObject var18 = (SubLObject)module0016.ZERO_INTEGER;
        module0642.f39020(module0015.$g431$.getGlobalValue());
        module0642.f39020(module0015.$g440$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var15);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        if (module0016.NIL != var17) {
            module0642.f39020(module0015.$g437$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var17);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        }
        if (module0016.NIL != var16) {
            module0642.f39020(module0015.$g438$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(module0642.f39049(var16));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        }
        if (module0016.NIL != var18) {
            module0642.f39020(module0015.$g439$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var18);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        final SubLObject var19 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
        }
        finally {
            module0015.$g533$.rebind(var19, var14);
        }
        module0642.f39020(module0015.$g432$.getGlobalValue());
        module0642.f39027((SubLObject)module0016.$ic168$, (SubLObject)module0016.UNPROVIDED);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f928() {
        f929();
        f930();
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f929() {
        module0015.f730(module0016.$g559$.getGlobalValue(), (SubLObject)module0016.UNPROVIDED, (SubLObject)module0016.UNPROVIDED, (SubLObject)module0016.UNPROVIDED);
        module0015.f730(module0016.$g560$.getGlobalValue(), (SubLObject)module0016.$ic175$, (SubLObject)module0016.UNPROVIDED, (SubLObject)module0016.UNPROVIDED);
        module0015.f730(module0016.$g561$.getGlobalValue(), (SubLObject)module0016.UNPROVIDED, (SubLObject)module0016.UNPROVIDED, (SubLObject)module0016.UNPROVIDED);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f930() {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = (SubLObject)module0016.$ic65$;
        final SubLObject var16 = (SubLObject)module0016.$ic182$;
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var16);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0016.$g562$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var15);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        SubLObject var17 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var17, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var16);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0016.$g563$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var15);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        var17 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var17, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var16);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0016.$g564$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var15);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        var17 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var17, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f931(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0016.$ic11$, (SubLObject)module0016.$ic183$, (SubLObject)module0016.$ic184$, reader.bq_cons((SubLObject)module0016.$ic11$, ConsesLow.append(var5, (SubLObject)module0016.NIL)));
    }
    
    public static SubLObject f932(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0016.$ic93$, (SubLObject)module0016.$ic188$, (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic189$, (SubLObject)module0016.$ic190$, ConsesLow.append(var5, (SubLObject)module0016.NIL)));
    }
    
    public static SubLObject f933(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0016.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic191$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0016.$ic192$, (SubLObject)module0016.$ic193$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic11$, (SubLObject)ConsesLow.list((SubLObject)module0016.$ic11$, var5), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic11$, reader.bq_cons((SubLObject)module0016.$ic194$, ConsesLow.append(var6, (SubLObject)module0016.NIL)))));
    }
    
    public static SubLObject f934(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return reader.bq_cons((SubLObject)module0016.$ic195$, ConsesLow.append(var5, (SubLObject)module0016.NIL));
    }
    
    public static SubLObject f935() {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0016.$g568$.getDynamicValue(var14);
        module0016.$g568$.setDynamicValue(Numbers.add(module0016.$g568$.getDynamicValue(var14), (SubLObject)module0016.ONE_INTEGER), var14);
        return var15;
    }
    
    public static SubLObject f936() {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = module0014.f657((SubLObject)module0016.$ic202$);
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var15);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic65$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        SubLObject var16 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var16, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        var15 = module0014.f657((SubLObject)module0016.$ic200$);
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var15);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic65$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        var16 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var16, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f937(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic108$, (SubLObject)module0016.$ic203$, (SubLObject)module0016.$ic204$, (SubLObject)module0016.$ic205$, ConsesLow.append(var5, (SubLObject)module0016.NIL));
    }
    
    public static SubLObject f938(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0016.NIL;
        SubLObject var6 = (SubLObject)module0016.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic207$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0016.$ic207$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0016.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0016.NIL;
        SubLObject var182_183 = (SubLObject)module0016.NIL;
        while (module0016.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0016.$ic207$);
            var182_183 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0016.$ic207$);
            if (module0016.NIL == conses_high.member(var182_183, (SubLObject)module0016.$ic208$, (SubLObject)module0016.UNPROVIDED, (SubLObject)module0016.UNPROVIDED)) {
                var9 = (SubLObject)module0016.T;
            }
            if (var182_183 == module0016.$ic41$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0016.NIL != var9 && module0016.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0016.$ic207$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic209$, var4);
        final SubLObject var11 = (SubLObject)((module0016.NIL != var10) ? conses_high.cadr(var10) : module0016.$ic100$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic210$, var4);
        final SubLObject var13 = (SubLObject)((module0016.NIL != var12) ? conses_high.cadr(var12) : module0016.$ic211$);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic212$, var4);
        final SubLObject var15 = (SubLObject)((module0016.NIL != var14) ? conses_high.cadr(var14) : module0016.$ic213$);
        return (SubLObject)ConsesLow.list((SubLObject)module0016.$ic214$, (SubLObject)ConsesLow.listS((SubLObject)module0016.$ic215$, (SubLObject)module0016.$ic216$, var5, (SubLObject)module0016.$ic217$, var6, ConsesLow.append((SubLObject)((module0016.NIL != var11) ? ConsesLow.list((SubLObject)module0016.$ic209$, var11) : module0016.NIL), (SubLObject)((module0016.NIL != var13) ? ConsesLow.list((SubLObject)module0016.$ic210$, var13) : module0016.NIL), (SubLObject)((module0016.NIL != var15) ? ConsesLow.list((SubLObject)module0016.$ic212$, var15) : module0016.NIL), (SubLObject)module0016.NIL)));
    }
    
    public static SubLObject f939(final SubLObject var190) {
        final SubLThread var191 = SubLProcess.currentSubLThread();
        final SubLObject var192 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic216$, var190);
        final SubLObject var193 = (SubLObject)((module0016.NIL != var192) ? conses_high.cadr(var192) : module0016.NIL);
        final SubLObject var194 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic217$, var190);
        final SubLObject var195 = (SubLObject)((module0016.NIL != var194) ? conses_high.cadr(var194) : module0016.NIL);
        final SubLObject var196 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic209$, var190);
        final SubLObject var197 = (SubLObject)((module0016.NIL != var196) ? conses_high.cadr(var196) : module0016.NIL);
        final SubLObject var198 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic210$, var190);
        final SubLObject var199 = (SubLObject)((module0016.NIL != var198) ? conses_high.cadr(var198) : module0016.NIL);
        final SubLObject var200 = cdestructuring_bind.property_list_member((SubLObject)module0016.$ic212$, var190);
        final SubLObject var201 = (SubLObject)((module0016.NIL != var200) ? conses_high.cadr(var200) : module0016.NIL);
        final SubLObject var202 = f940(var193, var195);
        final SubLObject var203 = Sequences.cconcatenate((SubLObject)module0016.$ic219$, module0006.f203(module0016.$g568$.getDynamicValue(var191)));
        PrintLow.format(module0015.$g131$.getDynamicValue(var191), (SubLObject)module0016.$ic220$, new SubLObject[] { var199, var203, var197, var199 });
        PrintLow.format(module0015.$g131$.getDynamicValue(var191), (SubLObject)module0016.$ic221$, new SubLObject[] { var202, var203, var201, var203, var197 });
        module0016.$g568$.setDynamicValue(Numbers.add(module0016.$g568$.getDynamicValue(var191), (SubLObject)module0016.ONE_INTEGER), var191);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f940(final SubLObject var177, final SubLObject var200) {
        final SubLThread var201 = SubLProcess.currentSubLThread();
        SubLObject var202 = Sequences.cconcatenate(module0110.$g570$.getDynamicValue(var201), new SubLObject[] { module0016.$ic222$, module0038.f2624(var177) });
        SubLObject var203 = var200;
        SubLObject var204 = (SubLObject)module0016.NIL;
        var204 = var203.first();
        while (module0016.NIL != var203) {
            SubLObject var206;
            final SubLObject var205 = var206 = var204;
            SubLObject var207 = (SubLObject)module0016.NIL;
            SubLObject var208 = (SubLObject)module0016.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var206, var205, (SubLObject)module0016.$ic223$);
            var207 = var206.first();
            var206 = (var208 = var206.rest());
            var202 = Sequences.cconcatenate(var202, new SubLObject[] { module0016.$ic224$, var207, module0016.$ic225$, module0656.f39932(var208) });
            var203 = var203.rest();
            var204 = var203.first();
        }
        return var202;
    }
    
    public static SubLObject f941() {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = module0014.f672((SubLObject)module0016.$ic230$);
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic266$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        if (module0016.NIL != var15) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var15);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic5$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        var15 = module0014.f672((SubLObject)module0016.$ic226$);
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic266$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        if (module0016.NIL != var15) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
            module0642.f39020(var15);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic5$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        module0666.f40487();
        f936();
        module0666.f40535();
        SubLObject var16 = module0014.f657((SubLObject)module0016.$ic242$);
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var16);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic65$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        SubLObject var17 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var17, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var16 = module0014.f657((SubLObject)module0016.$ic244$);
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var16);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic65$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        var17 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var17, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var16 = module0014.f657((SubLObject)module0016.$ic246$);
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var16);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic65$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        var17 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var17, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var16 = module0014.f657((SubLObject)module0016.$ic248$);
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var16);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic65$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        var17 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var17, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var16 = module0014.f657((SubLObject)module0016.$ic230$);
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var16);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic65$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        var17 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var17, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var16 = module0014.f657((SubLObject)module0016.$ic238$);
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var16);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic65$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        var17 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var17, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        var16 = module0014.f657((SubLObject)module0016.$ic240$);
        module0642.f39029((SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(var16);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39020((SubLObject)module0016.$ic65$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0016.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0016.UNPROVIDED);
        var17 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0016.T, var14);
            module0642.f39029((SubLObject)module0016.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var17, var14);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f942() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f884", "S#1653");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f885", "S#1654");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f886", "S#1655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f887", "S#1656", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f888", "S#1657");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f889", "S#1658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f890", "S#1659", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f891", "S#1660");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f892", "S#1661", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f893", "S#1662", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f894", "S#1663", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f895", "S#1664", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f896", "S#1665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f897", "S#1666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f898", "S#1667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f899", "S#1668", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f900", "S#1669", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f901", "S#1670", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f902", "S#1671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f903", "S#1672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f904", "S#1673", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f905", "S#1674");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f906", "S#1675");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f907", "S#1676");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f908", "S#1677", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f909", "S#1678");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f910", "S#1679");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f911", "S#1680", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f912", "S#1681");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f913", "S#1682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f916", "S#1683", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f917", "S#1684");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f914", "S#1685", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f915", "S#1686", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f918", "S#1687");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f919", "S#1688", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f920", "S#1689", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f921", "S#1690", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f923", "S#1691", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f922", "S#1692", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f924", "S#1693", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f925", "S#1694", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f926", "S#1695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f927", "S#1696", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f928", "S#1697", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f929", "S#1698", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f930", "S#1699", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f931", "S#1700");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f932", "S#1701");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f933", "S#1702");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f934", "S#1703");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f935", "S#1704", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f936", "S#1705", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f937", "S#1706");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0016", "f938", "S#1707");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f939", "S#1708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f940", "S#1709", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0016", "f941", "S#1710", 0, 0, false);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f943() {
        module0016.$g545$ = SubLFiles.defconstant("S#1711", (SubLObject)module0016.$ic0$);
        module0016.$g546$ = SubLFiles.defconstant("S#1712", (SubLObject)module0016.$ic1$);
        module0016.$g547$ = SubLFiles.defconstant("S#1713", (SubLObject)module0016.$ic2$);
        module0016.$g548$ = SubLFiles.defconstant("S#1714", (SubLObject)module0016.$ic3$);
        module0016.$g549$ = SubLFiles.defconstant("S#1715", (SubLObject)module0016.$ic16$);
        module0016.$g550$ = SubLFiles.defconstant("S#1716", (SubLObject)module0016.$ic17$);
        module0016.$g551$ = SubLFiles.defconstant("S#1717", (SubLObject)module0016.$ic18$);
        module0016.$g552$ = SubLFiles.defconstant("S#1718", (SubLObject)module0016.$ic19$);
        module0016.$g553$ = SubLFiles.defconstant("S#1719", (SubLObject)module0016.$ic20$);
        module0016.$g554$ = SubLFiles.defconstant("S#1720", (SubLObject)module0016.$ic21$);
        module0016.$g555$ = SubLFiles.defconstant("S#1721", (SubLObject)module0016.$ic22$);
        module0016.$g556$ = SubLFiles.defconstant("S#1722", (SubLObject)module0016.$ic23$);
        module0016.$g557$ = SubLFiles.defconstant("S#1723", (SubLObject)module0016.$ic24$);
        module0016.$g558$ = SubLFiles.defconstant("S#1724", (SubLObject)module0016.$ic64$);
        module0016.$g559$ = SubLFiles.deflexical("S#1725", (SubLObject)module0016.$ic169$);
        module0016.$g560$ = SubLFiles.deflexical("S#1726", (SubLObject)module0016.$ic170$);
        module0016.$g561$ = SubLFiles.deflexical("S#1727", (SubLObject)module0016.$ic171$);
        module0016.$g562$ = SubLFiles.deflexical("S#1728", (SubLObject)module0016.$ic176$);
        module0016.$g563$ = SubLFiles.deflexical("S#1729", (SubLObject)module0016.$ic177$);
        module0016.$g564$ = SubLFiles.deflexical("S#1730", (SubLObject)module0016.$ic178$);
        module0016.$g565$ = SubLFiles.deflexical("S#1731", (SubLObject)module0016.$ic185$);
        module0016.$g566$ = SubLFiles.deflexical("S#1732", (SubLObject)module0016.$ic186$);
        module0016.$g567$ = SubLFiles.deflexical("S#1733", (SubLObject)module0016.$ic187$);
        module0016.$g568$ = SubLFiles.defparameter("S#1734", (SubLObject)module0016.ZERO_INTEGER);
        module0016.$g569$ = SubLFiles.deflexical("S#1735", (SubLObject)module0016.$ic206$);
        return (SubLObject)module0016.NIL;
    }
    
    public static SubLObject f944() {
        module0002.f50((SubLObject)module0016.$ic26$, (SubLObject)module0016.$ic28$);
        module0002.f50((SubLObject)module0016.$ic30$, (SubLObject)module0016.$ic28$);
        module0002.f50((SubLObject)module0016.$ic33$, (SubLObject)module0016.$ic35$);
        module0002.f50((SubLObject)module0016.$ic37$, (SubLObject)module0016.$ic35$);
        Hashtables.sethash((SubLObject)module0016.$ic61$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic62$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic49$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic63$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic66$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic67$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic68$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic69$, (SubLObject)module0016.NIL));
        module0002.f50((SubLObject)module0016.$ic96$, (SubLObject)module0016.$ic102$);
        module0002.f50((SubLObject)module0016.$ic120$, (SubLObject)module0016.$ic121$);
        module0001.f5((SubLObject)module0016.$ic133$, (SubLObject)module0016.$ic134$);
        module0002.f50((SubLObject)module0016.$ic130$, (SubLObject)module0016.$ic133$);
        module0002.f50((SubLObject)module0016.$ic131$, (SubLObject)module0016.$ic133$);
        module0002.f50((SubLObject)module0016.$ic132$, (SubLObject)module0016.$ic133$);
        module0002.f50((SubLObject)module0016.$ic144$, (SubLObject)module0016.$ic145$);
        Hashtables.sethash((SubLObject)module0016.$ic148$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic149$, (SubLObject)module0016.$ic150$));
        Hashtables.sethash((SubLObject)module0016.$ic151$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic152$, (SubLObject)module0016.$ic150$));
        Hashtables.sethash((SubLObject)module0016.$ic153$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic154$, (SubLObject)module0016.$ic155$));
        Hashtables.sethash((SubLObject)module0016.$ic156$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic157$, (SubLObject)module0016.$ic155$));
        Hashtables.sethash((SubLObject)module0016.$ic158$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic159$, (SubLObject)module0016.$ic160$));
        Hashtables.sethash((SubLObject)module0016.$ic161$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic162$, (SubLObject)module0016.$ic150$));
        Hashtables.sethash((SubLObject)module0016.$ic163$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic164$, (SubLObject)module0016.$ic155$));
        Hashtables.sethash((SubLObject)module0016.$ic165$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic166$, (SubLObject)module0016.$ic160$));
        Hashtables.sethash((SubLObject)module0016.$ic172$, module0014.$g114$.getGlobalValue(), (SubLObject)ConsesLow.list(module0016.$g559$.getGlobalValue(), (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic173$, module0014.$g114$.getGlobalValue(), (SubLObject)ConsesLow.list(module0016.$g560$.getGlobalValue(), (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic174$, module0014.$g114$.getGlobalValue(), (SubLObject)ConsesLow.list(module0016.$g561$.getGlobalValue(), (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic179$, module0014.$g114$.getGlobalValue(), (SubLObject)ConsesLow.list(module0016.$g562$.getGlobalValue(), (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic180$, module0014.$g114$.getGlobalValue(), (SubLObject)ConsesLow.list(module0016.$g563$.getGlobalValue(), (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic181$, module0014.$g114$.getGlobalValue(), (SubLObject)ConsesLow.list(module0016.$g564$.getGlobalValue(), (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic196$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic197$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic198$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic199$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic200$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic201$, (SubLObject)module0016.NIL));
        module0002.f50((SubLObject)module0016.$ic214$, (SubLObject)module0016.$ic218$);
        Hashtables.sethash((SubLObject)module0016.$ic226$, module0014.$g116$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic227$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic228$, module0014.$g116$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic229$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic230$, module0014.$g116$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic231$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic232$, module0014.$g116$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic233$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic234$, module0014.$g116$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic235$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic236$, module0014.$g116$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic237$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic238$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic239$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic240$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic241$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic242$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic243$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic244$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic245$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic246$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic247$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic248$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic249$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic232$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic250$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic230$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic251$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic246$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic247$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic202$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic252$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic253$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic254$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic255$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic256$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic257$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic258$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic259$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic260$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic234$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic261$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic262$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic263$, (SubLObject)module0016.NIL));
        Hashtables.sethash((SubLObject)module0016.$ic264$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0016.$ic265$, (SubLObject)module0016.NIL));
        return (SubLObject)module0016.NIL;
    }
    
    public void declareFunctions() {
        f942();
    }
    
    public void initializeVariables() {
        f943();
    }
    
    public void runTopLevelForms() {
        f944();
    }
    
    static {
        me = (SubLFile)new module0016();
        module0016.$g545$ = null;
        module0016.$g546$ = null;
        module0016.$g547$ = null;
        module0016.$g548$ = null;
        module0016.$g549$ = null;
        module0016.$g550$ = null;
        module0016.$g551$ = null;
        module0016.$g552$ = null;
        module0016.$g553$ = null;
        module0016.$g554$ = null;
        module0016.$g555$ = null;
        module0016.$g556$ = null;
        module0016.$g557$ = null;
        module0016.$g558$ = null;
        module0016.$g559$ = null;
        module0016.$g560$ = null;
        module0016.$g561$ = null;
        module0016.$g562$ = null;
        module0016.$g563$ = null;
        module0016.$g564$ = null;
        module0016.$g565$ = null;
        module0016.$g566$ = null;
        module0016.$g567$ = null;
        module0016.$g568$ = null;
        module0016.$g569$ = null;
        $ic0$ = SubLObjectFactory.makeString("<style");
        $ic1$ = SubLObjectFactory.makeString(" type=");
        $ic2$ = SubLObjectFactory.makeString(" media=");
        $ic3$ = SubLObjectFactory.makeString("</style>");
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeString("text/css")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1530", "CYC"), (SubLObject)SubLObjectFactory.makeString("screen"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic5$ = SubLObjectFactory.makeString("text/css");
        $ic6$ = SubLObjectFactory.makeString("screen");
        $ic7$ = SubLObjectFactory.makeSymbol("S#922", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1712", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#907", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1713", "CYC"));
        $ic11$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic12$ = SubLObjectFactory.makeSymbol("S#921", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1711", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1714", "CYC"));
        $ic14$ = SubLObjectFactory.makeSymbol("S#923", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1648", "CYC")));
        $ic16$ = SubLObjectFactory.makeString("position");
        $ic17$ = SubLObjectFactory.makeString("top");
        $ic18$ = SubLObjectFactory.makeString("bottom");
        $ic19$ = SubLObjectFactory.makeString("right");
        $ic20$ = SubLObjectFactory.makeString("left");
        $ic21$ = SubLObjectFactory.makeString("visibility");
        $ic22$ = SubLObjectFactory.makeString("display");
        $ic23$ = SubLObjectFactory.makeString("height");
        $ic24$ = SubLObjectFactory.makeString("width");
        $ic25$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1736", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic26$ = SubLObjectFactory.makeSymbol("S#1655", "CYC");
        $ic27$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1656", "CYC")));
        $ic28$ = SubLObjectFactory.makeSymbol("S#1654", "CYC");
        $ic29$ = SubLObjectFactory.makeString("#~A {");
        $ic30$ = SubLObjectFactory.makeSymbol("S#1656", "CYC");
        $ic31$ = SubLObjectFactory.makeString(" }");
        $ic32$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1737", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic33$ = SubLObjectFactory.makeSymbol("S#1658", "CYC");
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1659", "CYC")));
        $ic35$ = SubLObjectFactory.makeSymbol("S#1657", "CYC");
        $ic36$ = SubLObjectFactory.makeString(" ~A:");
        $ic37$ = SubLObjectFactory.makeSymbol("S#1659", "CYC");
        $ic38$ = SubLObjectFactory.makeString(";");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1736", "CYC"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#1738", "CYC"), SubLObjectFactory.makeSymbol("S#1739", "CYC"), SubLObjectFactory.makeSymbol("S#1740", "CYC"), SubLObjectFactory.makeSymbol("S#1741", "CYC"), SubLObjectFactory.makeSymbol("S#895", "CYC"), SubLObjectFactory.makeSymbol("S#896", "CYC"), SubLObjectFactory.makeSymbol("POSITION"), SubLObjectFactory.makeSymbol("S#1742", "CYC"), SubLObjectFactory.makeSymbol("S#1743", "CYC") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC")));
        $ic40$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TOP"), SubLObjectFactory.makeKeyword("BOTTOM"), SubLObjectFactory.makeKeyword("RIGHT"), SubLObjectFactory.makeKeyword("LEFT"), SubLObjectFactory.makeKeyword("HEIGHT"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("POSITION"), SubLObjectFactory.makeKeyword("VISIBILITY"), SubLObjectFactory.makeKeyword("DISPLAY") });
        $ic41$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic42$ = SubLObjectFactory.makeKeyword("TOP");
        $ic43$ = SubLObjectFactory.makeKeyword("BOTTOM");
        $ic44$ = SubLObjectFactory.makeKeyword("RIGHT");
        $ic45$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic46$ = SubLObjectFactory.makeKeyword("HEIGHT");
        $ic47$ = SubLObjectFactory.makeKeyword("WIDTH");
        $ic48$ = SubLObjectFactory.makeKeyword("POSITION");
        $ic49$ = SubLObjectFactory.makeKeyword("VISIBILITY");
        $ic50$ = SubLObjectFactory.makeKeyword("DISPLAY");
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1715", "CYC"));
        $ic52$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1716", "CYC"));
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1717", "CYC"));
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1719", "CYC"));
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1718", "CYC"));
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1720", "CYC"));
        $ic57$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1721", "CYC"));
        $ic58$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1722", "CYC"));
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1723", "CYC"));
        $ic60$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1648", "CYC"));
        $ic61$ = SubLObjectFactory.makeKeyword("FINDDOM");
        $ic62$ = SubLObjectFactory.makeString("findDOM.js");
        $ic63$ = SubLObjectFactory.makeString("visibility.js");
        $ic64$ = SubLObjectFactory.makeString("javascript:void('')");
        $ic65$ = SubLObjectFactory.makeString("text/javascript");
        $ic66$ = SubLObjectFactory.makeKeyword("CONSTANT-CREATION");
        $ic67$ = SubLObjectFactory.makeString("constant-creation.js");
        $ic68$ = SubLObjectFactory.makeKeyword("LEXICAL");
        $ic69$ = SubLObjectFactory.makeString("lexical.js");
        $ic70$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARAGRAPH"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"));
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VISIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("INVISIBLE"));
        $ic72$ = SubLObjectFactory.makeKeyword("VISIBLE");
        $ic73$ = SubLObjectFactory.makeKeyword("INVISIBLE");
        $ic74$ = SubLObjectFactory.makeString("~S was not a known visibility-p");
        $ic75$ = SubLObjectFactory.makeSymbol("S#1666", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#1665", "CYC");
        $ic77$ = SubLObjectFactory.makeString("none");
        $ic78$ = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $ic79$ = SubLObjectFactory.makeString("block");
        $ic80$ = SubLObjectFactory.makeString("inline");
        $ic81$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic82$ = SubLObjectFactory.makeString("setVisibility('");
        $ic83$ = SubLObjectFactory.makeString("','");
        $ic84$ = SubLObjectFactory.makeString("');");
        $ic85$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic86$ = SubLObjectFactory.makeString("_show_button");
        $ic87$ = SubLObjectFactory.makeString("_hide_button");
        $ic88$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1736", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1744", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("VISIBLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1745", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic89$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INITIAL-VISIBILITY"), (SubLObject)SubLObjectFactory.makeKeyword("FLOW-TYPE"));
        $ic90$ = SubLObjectFactory.makeKeyword("INITIAL-VISIBILITY");
        $ic91$ = SubLObjectFactory.makeKeyword("FLOW-TYPE");
        $ic92$ = SubLObjectFactory.makeSymbol("S#1670", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("S#931", "CYC");
        $ic94$ = SubLObjectFactory.makeKeyword("ID");
        $ic95$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#906", "CYC")));
        $ic96$ = SubLObjectFactory.makeSymbol("S#1677", "CYC");
        $ic97$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1736", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1520", "CYC"), (SubLObject)SubLObjectFactory.makeString(""))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic98$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STYLE"));
        $ic99$ = SubLObjectFactory.makeKeyword("STYLE");
        $ic100$ = SubLObjectFactory.makeString("");
        $ic101$ = SubLObjectFactory.makeSymbol("S#934", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("S#1675", "CYC");
        $ic103$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1736", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1742", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#1746", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1745", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic104$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK-TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("FLOW-TYPE"));
        $ic105$ = SubLObjectFactory.makeKeyword("LINK-TEXT");
        $ic106$ = SubLObjectFactory.makeUninternedSymbol("US#34A40D4");
        $ic107$ = SubLObjectFactory.makeUninternedSymbol("US#58E5BB9");
        $ic108$ = SubLObjectFactory.makeSymbol("CLET");
        $ic109$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1724", "CYC"));
        $ic110$ = SubLObjectFactory.makeSymbol("S#1669", "CYC");
        $ic111$ = SubLObjectFactory.makeSymbol("S#1039", "CYC");
        $ic112$ = SubLObjectFactory.makeKeyword("HREF");
        $ic113$ = SubLObjectFactory.makeKeyword("ONCLICK");
        $ic114$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic115$ = SubLObjectFactory.makeSymbol("S#1531", "CYC");
        $ic116$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1736", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#1746", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic117$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK-TEXT"));
        $ic118$ = SubLObjectFactory.makeUninternedSymbol("US#34A40D4");
        $ic119$ = SubLObjectFactory.makeUninternedSymbol("US#58E5BB9");
        $ic120$ = SubLObjectFactory.makeSymbol("S#1680", "CYC");
        $ic121$ = SubLObjectFactory.makeSymbol("S#1679", "CYC");
        $ic122$ = SubLObjectFactory.makeSymbol("STRING");
        $ic123$ = SubLObjectFactory.makeString("toggleVisibility('");
        $ic124$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1736", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1747", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1748", "CYC"));
        $ic125$ = SubLObjectFactory.makeUninternedSymbol("US#7B0DE46");
        $ic126$ = SubLObjectFactory.makeUninternedSymbol("US#7CFE05A");
        $ic127$ = SubLObjectFactory.makeUninternedSymbol("US#1B40656");
        $ic128$ = SubLObjectFactory.makeUninternedSymbol("US#1CB384A");
        $ic129$ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic130$ = SubLObjectFactory.makeSymbol("S#1682", "CYC");
        $ic131$ = SubLObjectFactory.makeSymbol("S#1683", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("S#1684", "CYC");
        $ic133$ = SubLObjectFactory.makeSymbol("S#1681", "CYC");
        $ic134$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1736", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic135$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1736", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1749", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1750", "CYC"));
        $ic136$ = SubLObjectFactory.makeUninternedSymbol("US#34A40D4");
        $ic137$ = SubLObjectFactory.makeSymbol("S#1676", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("S#971", "CYC");
        $ic139$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#1751", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1752", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic140$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SHOW"), (SubLObject)SubLObjectFactory.makeKeyword("HIDE"));
        $ic141$ = SubLObjectFactory.makeKeyword("SHOW");
        $ic142$ = SubLObjectFactory.makeKeyword("HIDE");
        $ic143$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#907", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1753", "CYC")));
        $ic144$ = SubLObjectFactory.makeSymbol("S#1688", "CYC");
        $ic145$ = SubLObjectFactory.makeSymbol("S#1687", "CYC");
        $ic146$ = SubLObjectFactory.makeString("','block');setVisibility('");
        $ic147$ = SubLObjectFactory.makeString("','none');");
        $ic148$ = SubLObjectFactory.makeKeyword("RIGHT-TRIANGLE-V");
        $ic149$ = SubLObjectFactory.makeString("cyc-right-triangle-violet.gif");
        $ic150$ = SubLObjectFactory.makeString("[Show]");
        $ic151$ = SubLObjectFactory.makeKeyword("LEFT-TRIANGLE-V");
        $ic152$ = SubLObjectFactory.makeString("cyc-left-triangle-violet.gif");
        $ic153$ = SubLObjectFactory.makeKeyword("DOWN-TRIANGLE-V");
        $ic154$ = SubLObjectFactory.makeString("cyc-down-triangle-violet.gif");
        $ic155$ = SubLObjectFactory.makeString("[Hide]");
        $ic156$ = SubLObjectFactory.makeKeyword("UP-TRIANGLE-V");
        $ic157$ = SubLObjectFactory.makeString("cyc-up-triangle-violet.gif");
        $ic158$ = SubLObjectFactory.makeKeyword("BLANK-TRIANGLE");
        $ic159$ = SubLObjectFactory.makeString("cyc-no-triangle-violet.gif");
        $ic160$ = SubLObjectFactory.makeString("  ");
        $ic161$ = SubLObjectFactory.makeKeyword("SQUARE-MINUS");
        $ic162$ = SubLObjectFactory.makeString("square-minus.gif");
        $ic163$ = SubLObjectFactory.makeKeyword("SQUARE-PLUS");
        $ic164$ = SubLObjectFactory.makeString("square-plus.gif");
        $ic165$ = SubLObjectFactory.makeKeyword("SQUARE-BLANK");
        $ic166$ = SubLObjectFactory.makeString("square-blank.gif");
        $ic167$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic168$ = SubLObjectFactory.makeKeyword("NBSP");
        $ic169$ = SubLObjectFactory.makeString("/javascript/cssjsmenudhtml.css");
        $ic170$ = SubLObjectFactory.makeString("/javascript/cssjsmenuhover.css");
        $ic171$ = SubLObjectFactory.makeString("/javascript/cssjsmenupreso.css");
        $ic172$ = SubLObjectFactory.makeKeyword("DEVEDGE-MENUS-DHTML");
        $ic173$ = SubLObjectFactory.makeKeyword("DEVEDGE-MENUS-HOVER");
        $ic174$ = SubLObjectFactory.makeKeyword("DEVEDGE-MENUS-PRESO");
        $ic175$ = SubLObjectFactory.makeString("hoverJS");
        $ic176$ = SubLObjectFactory.makeString("/javascript/dhtml.js");
        $ic177$ = SubLObjectFactory.makeString("/javascript/cssjsmenu.js");
        $ic178$ = SubLObjectFactory.makeString("/javascript/config.js");
        $ic179$ = SubLObjectFactory.makeKeyword("DEVEDGE-SCRIPTS-DHTML");
        $ic180$ = SubLObjectFactory.makeKeyword("DEVEDGE-SCRIPTS-CSSJSMENU");
        $ic181$ = SubLObjectFactory.makeKeyword("DEVEDGE-SCRIPTS-CONFIG");
        $ic182$ = SubLObjectFactory.makeString("javascript");
        $ic183$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1697", "CYC"));
        $ic184$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1060", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("init(); ")));
        $ic185$ = SubLObjectFactory.makeString("navbar");
        $ic186$ = SubLObjectFactory.makeString("nde-menu-system");
        $ic187$ = SubLObjectFactory.makeString("submenu");
        $ic188$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("S#1731", "CYC"));
        $ic189$ = SubLObjectFactory.makeSymbol("S#993", "CYC");
        $ic190$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("S#1732", "CYC"));
        $ic191$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1754", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic192$ = SubLObjectFactory.makeSymbol("S#997", "CYC");
        $ic193$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("S#1733", "CYC"));
        $ic194$ = SubLObjectFactory.makeSymbol("S#994", "CYC");
        $ic195$ = SubLObjectFactory.makeSymbol("S#998", "CYC");
        $ic196$ = SubLObjectFactory.makeKeyword("YAHOO-MIN");
        $ic197$ = SubLObjectFactory.makeString("yahoo-min.js");
        $ic198$ = SubLObjectFactory.makeKeyword("EVENT-MIN");
        $ic199$ = SubLObjectFactory.makeString("event-min.js");
        $ic200$ = SubLObjectFactory.makeKeyword("CONNECTION");
        $ic201$ = SubLObjectFactory.makeString("connection-min.js");
        $ic202$ = SubLObjectFactory.makeKeyword("YAHOO-DOM-EVENT");
        $ic203$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1734", "CYC"), (SubLObject)module0016.ZERO_INTEGER));
        $ic204$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1705", "CYC"));
        $ic205$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#907", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1735", "CYC"));
        $ic206$ = SubLObjectFactory.makeString("<script type='text/javascript'>function loadLater(url, id) {\n  var callback = {success: handleDelayedLoad, \n                  failure: handleFailedDelayedLoad,\n                  argument: {eltId: id}};\n  YAHOO.util.Connect.asyncRequest('get', url, callback);\n}\nfunction handleDelayedLoad(o) {\n  document.getElementById(o.argument.eltId).innerHTML=o.responseText;\n}\nfunction handleFailedDelayedLoad(o) {\n  document.getElementById(o.argument.eltId).innerHTML='Unable to load';\n}\n</script>\n");
        $ic207$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1755", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#295", "CYC"), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#150", "CYC"), (SubLObject)SubLObjectFactory.makeString("span")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1756", "CYC"), (SubLObject)SubLObjectFactory.makeInteger(50)));
        $ic208$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("TAG"), (SubLObject)SubLObjectFactory.makeKeyword("DELAY"));
        $ic209$ = SubLObjectFactory.makeKeyword("MESSAGE");
        $ic210$ = SubLObjectFactory.makeKeyword("TAG");
        $ic211$ = SubLObjectFactory.makeString("span");
        $ic212$ = SubLObjectFactory.makeKeyword("DELAY");
        $ic213$ = SubLObjectFactory.makeInteger(50);
        $ic214$ = SubLObjectFactory.makeSymbol("S#1708", "CYC");
        $ic215$ = SubLObjectFactory.makeSymbol("LIST");
        $ic216$ = SubLObjectFactory.makeKeyword("HANDLER");
        $ic217$ = SubLObjectFactory.makeKeyword("ARGS");
        $ic218$ = SubLObjectFactory.makeSymbol("S#1707", "CYC");
        $ic219$ = SubLObjectFactory.makeString("cyc-elt-");
        $ic220$ = SubLObjectFactory.makeString("<~A id='~A'>~A</~A>");
        $ic221$ = SubLObjectFactory.makeString("<script type='text/javascript'>try {YAHOO.util.Event.addListener(window, 'load', setTimeout(\"loadLater('~A', '~A')\", ~A));} catch(err) {document.getElementById('~a').innerHTML='Error ~A';}</script>");
        $ic222$ = SubLObjectFactory.makeString("?");
        $ic223$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic224$ = SubLObjectFactory.makeString("&");
        $ic225$ = SubLObjectFactory.makeString("=");
        $ic226$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic227$ = SubLObjectFactory.makeString("cb-cyc.css");
        $ic228$ = SubLObjectFactory.makeKeyword("FONTS");
        $ic229$ = SubLObjectFactory.makeString("fonts-min.css");
        $ic230$ = SubLObjectFactory.makeKeyword("MENU");
        $ic231$ = SubLObjectFactory.makeString("yui/menu/menu.css");
        $ic232$ = SubLObjectFactory.makeKeyword("CONTAINER");
        $ic233$ = SubLObjectFactory.makeString("yui/container/assets/container.css");
        $ic234$ = SubLObjectFactory.makeKeyword("TABVIEW");
        $ic235$ = SubLObjectFactory.makeString("yui/tabview/assets/skins/sam/tabview.css");
        $ic236$ = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE");
        $ic237$ = SubLObjectFactory.makeString("sam-autocomplete.css");
        $ic238$ = SubLObjectFactory.makeKeyword("CB");
        $ic239$ = SubLObjectFactory.makeString("cb.js");
        $ic240$ = SubLObjectFactory.makeKeyword("CB-INLINE-EDIT");
        $ic241$ = SubLObjectFactory.makeString("cb-inline-edit.js");
        $ic242$ = SubLObjectFactory.makeKeyword("SELECTOR");
        $ic243$ = SubLObjectFactory.makeString("selector-min.js");
        $ic244$ = SubLObjectFactory.makeKeyword("EVENT-DELEGATION");
        $ic245$ = SubLObjectFactory.makeString("event-delegate-min.js");
        $ic246$ = SubLObjectFactory.makeKeyword("ANIMATION");
        $ic247$ = SubLObjectFactory.makeString("animation-min.js");
        $ic248$ = SubLObjectFactory.makeKeyword("CONTAINER-CORE");
        $ic249$ = SubLObjectFactory.makeString("container_core-min.js");
        $ic250$ = SubLObjectFactory.makeString("container-min.js");
        $ic251$ = SubLObjectFactory.makeString("menu-min.js");
        $ic252$ = SubLObjectFactory.makeString("yahoo-dom-event.js");
        $ic253$ = SubLObjectFactory.makeKeyword("YAHOO");
        $ic254$ = SubLObjectFactory.makeString("yahoo.js");
        $ic255$ = SubLObjectFactory.makeKeyword("DOM");
        $ic256$ = SubLObjectFactory.makeString("dom.js");
        $ic257$ = SubLObjectFactory.makeKeyword("EVENT");
        $ic258$ = SubLObjectFactory.makeString("event.js");
        $ic259$ = SubLObjectFactory.makeKeyword("ELEMENT");
        $ic260$ = SubLObjectFactory.makeString("element.js");
        $ic261$ = SubLObjectFactory.makeString("tabview.js");
        $ic262$ = SubLObjectFactory.makeKeyword("DATASOURCE");
        $ic263$ = SubLObjectFactory.makeString("datasource-min.js");
        $ic264$ = SubLObjectFactory.makeKeyword("AUTOCOMPLETE");
        $ic265$ = SubLObjectFactory.makeString("autocomplete-min.js");
        $ic266$ = SubLObjectFactory.makeString("stylesheet");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0016.class
	Total time: 860 ms
	
	Decompiled with Procyon 0.5.32.
*/