package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0273 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0273";
    public static final String myFingerPrint = "672047946f86658aa11b745c6e4f36d031542c847b3f1353af433a67e0a983b4";
    private static SubLSymbol $g2583$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLList $ic36$;
    private static final SubLString $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLList $ic46$;
    private static final SubLString $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLList $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLList $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLList $ic80$;
    private static final SubLString $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLList $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLObject $ic99$;
    private static final SubLObject $ic100$;
    private static final SubLObject $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLList $ic104$;
    private static final SubLObject $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLList $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLList $ic113$;
    private static final SubLList $ic114$;
    private static final SubLString $ic115$;
    private static final SubLObject $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLList $ic118$;
    private static final SubLObject $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
    private static final SubLList $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLObject $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLList $ic128$;
    private static final SubLString $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLList $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLString $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLObject $ic141$;
    private static final SubLObject $ic142$;
    private static final SubLList $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLList $ic146$;
    private static final SubLString $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLObject $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLObject $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLList $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLList $ic161$;
    private static final SubLObject $ic162$;
    private static final SubLString $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLList $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLList $ic167$;
    private static final SubLString $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLList $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLList $ic172$;
    private static final SubLObject $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLList $ic175$;
    private static final SubLList $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLList $ic180$;
    private static final SubLString $ic181$;
    private static final SubLString $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLList $ic184$;
    private static final SubLList $ic185$;
    private static final SubLString $ic186$;
    private static final SubLString $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLList $ic189$;
    private static final SubLList $ic190$;
    private static final SubLString $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLList $ic193$;
    private static final SubLString $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLList $ic196$;
    private static final SubLString $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLList $ic199$;
    private static final SubLList $ic200$;
    private static final SubLString $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLList $ic203$;
    private static final SubLString $ic204$;
    private static final SubLObject $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLList $ic207$;
    private static final SubLString $ic208$;
    private static final SubLString $ic209$;
    private static final SubLObject $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLList $ic212$;
    private static final SubLList $ic213$;
    private static final SubLString $ic214$;
    private static final SubLString $ic215$;
    private static final SubLString $ic216$;
    private static final SubLString $ic217$;
    private static final SubLString $ic218$;
    private static final SubLString $ic219$;
    private static final SubLString $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLString $ic222$;
    private static final SubLString $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLList $ic225$;
    private static final SubLList $ic226$;
    private static final SubLString $ic227$;
    private static final SubLString $ic228$;
    private static final SubLString $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLList $ic231$;
    private static final SubLList $ic232$;
    private static final SubLString $ic233$;
    private static final SubLString $ic234$;
    private static final SubLObject $ic235$;
    private static final SubLObject $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLList $ic238$;
    private static final SubLList $ic239$;
    private static final SubLString $ic240$;
    private static final SubLObject $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLObject $ic243$;
    private static final SubLList $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLList $ic246$;
    private static final SubLList $ic247$;
    private static final SubLString $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLString $ic251$;
    private static final SubLString $ic252$;
    private static final SubLString $ic253$;
    private static final SubLString $ic254$;
    private static final SubLString $ic255$;
    private static final SubLObject $ic256$;
    private static final SubLString $ic257$;
    private static final SubLString $ic258$;
    private static final SubLString $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLList $ic261$;
    private static final SubLString $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLString $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLList $ic266$;
    private static final SubLList $ic267$;
    private static final SubLString $ic268$;
    private static final SubLObject $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLSymbol $ic271$;
    private static final SubLString $ic272$;
    private static final SubLString $ic273$;
    private static final SubLString $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLList $ic276$;
    private static final SubLSymbol $ic277$;
    private static final SubLList $ic278$;
    private static final SubLString $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLList $ic281$;
    private static final SubLList $ic282$;
    private static final SubLString $ic283$;
    private static final SubLString $ic284$;
    private static final SubLSymbol $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLList $ic287$;
    private static final SubLList $ic288$;
    private static final SubLString $ic289$;
    private static final SubLString $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLList $ic292$;
    private static final SubLSymbol $ic293$;
    private static final SubLString $ic294$;
    private static final SubLSymbol $ic295$;
    private static final SubLList $ic296$;
    private static final SubLString $ic297$;
    private static final SubLObject $ic298$;
    private static final SubLSymbol $ic299$;
    private static final SubLList $ic300$;
    private static final SubLString $ic301$;
    private static final SubLObject $ic302$;
    private static final SubLSymbol $ic303$;
    private static final SubLList $ic304$;
    private static final SubLString $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLList $ic307$;
    private static final SubLString $ic308$;
    private static final SubLString $ic309$;
    private static final SubLSymbol $ic310$;
    private static final SubLList $ic311$;
    private static final SubLString $ic312$;
    private static final SubLSymbol $ic313$;
    private static final SubLList $ic314$;
    private static final SubLString $ic315$;
    private static final SubLSymbol $ic316$;
    private static final SubLList $ic317$;
    private static final SubLList $ic318$;
    private static final SubLString $ic319$;
    private static final SubLSymbol $ic320$;
    private static final SubLList $ic321$;
    private static final SubLList $ic322$;
    private static final SubLString $ic323$;
    private static final SubLSymbol $ic324$;
    private static final SubLList $ic325$;
    private static final SubLString $ic326$;
    private static final SubLSymbol $ic327$;
    private static final SubLList $ic328$;
    private static final SubLSymbol $ic329$;
    private static final SubLSymbol $ic330$;
    private static final SubLSymbol $ic331$;
    private static final SubLSymbol $ic332$;
    private static final SubLSymbol $ic333$;
    private static final SubLString $ic334$;
    private static final SubLString $ic335$;
    private static final SubLSymbol $ic336$;
    private static final SubLList $ic337$;
    private static final SubLString $ic338$;
    private static final SubLSymbol $ic339$;
    private static final SubLList $ic340$;
    private static final SubLString $ic341$;
    private static final SubLSymbol $ic342$;
    private static final SubLList $ic343$;
    private static final SubLString $ic344$;
    private static final SubLSymbol $ic345$;
    private static final SubLList $ic346$;
    private static final SubLString $ic347$;
    private static final SubLSymbol $ic348$;
    private static final SubLList $ic349$;
    private static final SubLString $ic350$;
    private static final SubLSymbol $ic351$;
    private static final SubLList $ic352$;
    private static final SubLString $ic353$;
    private static final SubLSymbol $ic354$;
    private static final SubLList $ic355$;
    private static final SubLString $ic356$;
    private static final SubLSymbol $ic357$;
    private static final SubLList $ic358$;
    private static final SubLString $ic359$;
    private static final SubLSymbol $ic360$;
    private static final SubLList $ic361$;
    private static final SubLString $ic362$;
    private static final SubLSymbol $ic363$;
    private static final SubLList $ic364$;
    private static final SubLList $ic365$;
    private static final SubLString $ic366$;
    private static final SubLSymbol $ic367$;
    private static final SubLList $ic368$;
    private static final SubLList $ic369$;
    private static final SubLString $ic370$;
    private static final SubLSymbol $ic371$;
    private static final SubLList $ic372$;
    private static final SubLString $ic373$;
    private static final SubLSymbol $ic374$;
    private static final SubLList $ic375$;
    private static final SubLList $ic376$;
    private static final SubLString $ic377$;
    private static final SubLString $ic378$;
    private static final SubLObject $ic379$;
    private static final SubLObject $ic380$;
    private static final SubLObject $ic381$;
    private static final SubLObject $ic382$;
    private static final SubLObject $ic383$;
    private static final SubLSymbol $ic384$;
    private static final SubLList $ic385$;
    private static final SubLList $ic386$;
    private static final SubLString $ic387$;
    
    public static SubLObject f17958(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic3$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic3$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var7 = Sequences.length(var5);
            if (var7.numE((SubLObject)module0273.ZERO_INTEGER)) {
                return (SubLObject)module0273.NIL;
            }
            final SubLObject var8 = var2;
            if (var8.eql((SubLObject)module0273.$ic2$)) {
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic4$, new SubLObject[] { var6, var7, module0038.f2888(var5, Symbols.symbol_function((SubLObject)module0273.$ic5$), (SubLObject)module0273.$ic6$, (SubLObject)module0273.$ic7$), var7, module0201.$g2291$.getGlobalValue() });
            }
            if (var8.eql((SubLObject)module0273.$ic8$)) {
                if (var7.numG((SubLObject)module0273.ONE_INTEGER)) {
                    SubLObject var9 = (SubLObject)module0273.NIL;
                    SubLObject var10 = var5;
                    SubLObject var11 = (SubLObject)module0273.NIL;
                    var11 = var10.first();
                    while (module0273.NIL != var10) {
                        var9 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.listS(module0273.$ic10$, var11, (SubLObject)module0273.$ic11$)), var9);
                        var10 = var10.rest();
                        var11 = var10.first();
                    }
                    return module0276.f18287(var9, (SubLObject)module0273.UNPROVIDED);
                }
                final SubLObject var12 = var5.first();
                return (SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.listS(module0273.$ic10$, var12, (SubLObject)module0273.$ic11$));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic3$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17959(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic14$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic14$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var7 = var2;
            if (var7.eql((SubLObject)module0273.$ic2$)) {
                if (module0273.NIL != var6) {
                    return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic15$, var5, var6), (SubLObject)(var5.isCons() ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic16$, module0205.f13136(var5), var6) : module0273.$ic17$));
                }
                return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic18$, var5), (SubLObject)(var5.isCons() ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic19$, module0205.f13136(var5)) : module0273.$ic17$));
            }
            else if (var7.eql((SubLObject)module0273.$ic8$)) {
                if (module0273.NIL != var6) {
                    return (SubLObject)ConsesLow.list(module0273.$ic20$, var6, (SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.list(module0273.$ic21$, (SubLObject)ConsesLow.list(module0273.$ic22$, var5))));
                }
                return (SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.list(module0273.$ic21$, (SubLObject)ConsesLow.list(module0273.$ic22$, var5)));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic14$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17960(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            SubLObject var5;
            final SubLObject var4 = var5 = var1.rest();
            SubLObject var6 = (SubLObject)module0273.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic25$);
            var6 = var5.first();
            var5 = var5.rest();
            if (module0273.NIL == var5) {
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic26$, var6);
            }
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0273.$ic25$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17961(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic29$, module0038.f2888(conses_high.cadr(var1), Symbols.symbol_function((SubLObject)module0273.$ic5$), (SubLObject)module0273.$ic6$, (SubLObject)module0273.$ic7$));
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17962(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            SubLObject var5;
            final SubLObject var4 = var5 = var1.rest();
            SubLObject var6 = (SubLObject)module0273.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic32$);
            var6 = var5.first();
            var5 = var5.rest();
            if (module0273.NIL == var5) {
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic33$, var6);
            }
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0273.$ic32$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17963(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic36$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic36$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic36$);
        var7 = var4.first();
        var4 = (var8 = var4.rest());
        final SubLObject var9 = var2;
        if (var9.eql((SubLObject)module0273.$ic2$)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic37$, new SubLObject[] { var5, var6, var7 }), f17964(var8));
        }
        if (var9.eql((SubLObject)module0273.$ic8$)) {
            return module0276.f18287((SubLObject)ConsesLow.list(module0279.f18489((SubLObject)ConsesLow.list(var5, var6, var7), (SubLObject)module0273.UNPROVIDED), module0279.f18489((SubLObject)ConsesLow.listS(module0273.$ic38$, var5, (SubLObject)module0273.$ic39$), (SubLObject)module0273.UNPROVIDED)), (SubLObject)module0273.UNPROVIDED);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17965(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        SubLObject var10 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic42$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic42$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic42$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic42$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic42$);
        var9 = var4.first();
        var4 = (var10 = var4.rest());
        final SubLObject var11 = var2;
        if (var11.eql((SubLObject)module0273.$ic2$)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic43$, new SubLObject[] { var5, var6, var7, var8, var9 }), f17964(var10));
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17966(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic46$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic46$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic46$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic46$);
        var8 = var4.first();
        var4 = (var9 = var4.rest());
        final SubLObject var10 = var2;
        if (var10.eql((SubLObject)module0273.$ic2$)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic47$, new SubLObject[] { var5, var6, var7 }), f17964(var9));
        }
        if (var10.eql((SubLObject)module0273.$ic8$)) {
            return module0276.f18287((SubLObject)ConsesLow.list(module0279.f18489((SubLObject)ConsesLow.list(var5, var6, var7), (SubLObject)module0273.UNPROVIDED), var5.eql(module0273.$ic48$) ? module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.list(module0273.$ic49$, (SubLObject)ConsesLow.list(module0273.$ic50$, (SubLObject)ConsesLow.list(module0273.$ic51$, var8)), var7)), (SubLObject)module0273.UNPROVIDED) : (var5.eql(module0273.$ic52$) ? module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.list(module0273.$ic49$, var7, (SubLObject)ConsesLow.list(module0273.$ic50$, (SubLObject)ConsesLow.list(module0273.$ic51$, var8)))), (SubLObject)module0273.UNPROVIDED) : module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.list(module0273.$ic53$, var7, (SubLObject)ConsesLow.list(module0273.$ic50$, (SubLObject)ConsesLow.list(module0273.$ic51$, var8)))), (SubLObject)module0273.UNPROVIDED))), (SubLObject)module0273.UNPROVIDED);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17967(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            SubLObject var5;
            final SubLObject var4 = var5 = var1.rest();
            SubLObject var6 = (SubLObject)module0273.NIL;
            SubLObject var7 = (SubLObject)module0273.NIL;
            SubLObject var8 = (SubLObject)module0273.NIL;
            SubLObject var9 = (SubLObject)module0273.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic56$);
            var6 = var5.first();
            var5 = var5.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic56$);
            var7 = var5.first();
            var5 = var5.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic56$);
            var8 = var5.first();
            var5 = (var9 = var5.rest());
            return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic57$, var6), f17964(var9));
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17968(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            SubLObject var5;
            final SubLObject var4 = var5 = var1.rest();
            SubLObject var6 = (SubLObject)module0273.NIL;
            SubLObject var7 = (SubLObject)module0273.NIL;
            SubLObject var8 = (SubLObject)module0273.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic60$);
            var6 = var5.first();
            var5 = var5.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic60$);
            var7 = var5.first();
            var5 = var5.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic60$);
            var8 = var5.first();
            var5 = var5.rest();
            if (module0273.NIL == var5) {
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic61$, new SubLObject[] { var6, var7, var8 });
            }
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0273.$ic60$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17969(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var4 = conses_high.cadr(var1);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic64$, var4);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17970(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var4 = conses_high.cadr(var1);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic67$, var4);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17971(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var4 = conses_high.cadr(var1);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic70$, var4);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17972(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var4 = conses_high.cadr(var1);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic73$, var4);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17973(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            SubLObject var5;
            final SubLObject var4 = var5 = var1.rest();
            SubLObject var6 = (SubLObject)module0273.NIL;
            SubLObject var7 = (SubLObject)module0273.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic76$);
            var6 = var5.first();
            var5 = var5.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic76$);
            var7 = var5.first();
            var5 = var5.rest();
            if (module0273.NIL == var5) {
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic77$, var6, var7);
            }
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0273.$ic76$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17974(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic80$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic80$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic80$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var8 = Sequences.length(var5);
            if (var8.numE((SubLObject)module0273.ZERO_INTEGER)) {
                return (SubLObject)module0273.NIL;
            }
            final SubLObject var9 = var2;
            if (var9.eql((SubLObject)module0273.$ic2$)) {
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic81$, new SubLObject[] { var6, var7, var8, module0038.f2888(var5, Symbols.symbol_function((SubLObject)module0273.$ic5$), (SubLObject)module0273.$ic6$, (SubLObject)module0273.$ic7$), module0205.f13203(var7, (SubLObject)module0273.UNPROVIDED), module0205.f13204(var7, (SubLObject)module0273.UNPROVIDED) });
            }
            if (var9.eql((SubLObject)module0273.$ic8$)) {
                if (var8.numG((SubLObject)module0273.ONE_INTEGER)) {
                    final SubLObject var10 = module0205.f13204(var7, (SubLObject)module0273.UNPROVIDED);
                    SubLObject var11 = (SubLObject)module0273.NIL;
                    SubLObject var12 = var5;
                    SubLObject var13 = (SubLObject)module0273.NIL;
                    var13 = var12.first();
                    while (module0273.NIL != var12) {
                        var11 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.list(module0273.$ic82$, (SubLObject)ConsesLow.list((SubLObject)module0273.$ic83$, var13, var10))), var11);
                        var12 = var12.rest();
                        var13 = var12.first();
                    }
                    return module0276.f18287(var11, (SubLObject)module0273.UNPROVIDED);
                }
                final SubLObject var14 = var5.first();
                return (SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.list(module0273.$ic82$, (SubLObject)ConsesLow.list((SubLObject)module0273.$ic83$, var14, module0205.f13204(var7, (SubLObject)module0273.UNPROVIDED))));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic80$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17975(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic86$, conses_high.cadr(var1));
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17976(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = var2;
        if (var4.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var5 = conses_high.cadr(var1);
            final SubLObject var6 = module0228.f15210(var5);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic89$, new SubLObject[] { var5, var6, module0018.$g617$.getDynamicValue(var3) });
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17977(final SubLObject var1, final SubLObject var52, final SubLObject var2) {
        SubLObject var54;
        final SubLObject var53 = var54 = var1.rest();
        SubLObject var55 = (SubLObject)module0273.NIL;
        SubLObject var56 = (SubLObject)module0273.NIL;
        SubLObject var57 = (SubLObject)module0273.NIL;
        SubLObject var58 = (SubLObject)module0273.NIL;
        SubLObject var59 = (SubLObject)module0273.NIL;
        SubLObject var60 = (SubLObject)module0273.NIL;
        SubLObject var61 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0273.$ic92$);
        var55 = var54.first();
        var54 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0273.$ic92$);
        var56 = var54.first();
        var54 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0273.$ic92$);
        var57 = var54.first();
        var54 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0273.$ic92$);
        var58 = var54.first();
        var54 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0273.$ic92$);
        var59 = var54.first();
        var54 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0273.$ic92$);
        var60 = var54.first();
        var54 = (var61 = var54.rest());
        final SubLObject var62 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic93$, var61, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var63 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic94$, var61, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var64 = (module0273.NIL != var62) ? var62 : var63;
        if (var2.eql((SubLObject)module0273.$ic2$)) {
            SubLObject var65 = PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic95$, new SubLObject[] { var55, var52, var59.isList() ? module0038.f2888(var59, Symbols.symbol_function((SubLObject)module0273.$ic5$), (SubLObject)module0273.$ic6$, (SubLObject)module0273.$ic7$) : var59, var58 });
            if (module0273.NIL != var56 && module0273.NIL != var57) {
                var65 = Sequences.cconcatenate(var65, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic96$, var57, var56));
            }
            if (module0273.NIL != var64) {
                var65 = Sequences.cconcatenate(var65, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, var64));
            }
            var65 = Sequences.cconcatenate(var65, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var60));
            return var65;
        }
        if (var2.eql((SubLObject)module0273.$ic8$)) {
            SubLObject var66 = (SubLObject)module0273.NIL;
            if (var59.isList()) {
                SubLObject var67 = var59;
                SubLObject var68 = (SubLObject)module0273.NIL;
                var68 = var67.first();
                while (module0273.NIL != var67) {
                    var66 = (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(var52, var58, (SubLObject)ConsesLow.list(module0273.$ic22$, var68)), var60), var66);
                    var66 = (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic53$, module0273.$ic99$, (SubLObject)ConsesLow.list(module0273.$ic100$, (SubLObject)ConsesLow.list(module0273.$ic101$, (SubLObject)ConsesLow.list(var55), (SubLObject)ConsesLow.list(var68, var55)))), var60), var66);
                    var67 = var67.rest();
                    var68 = var67.first();
                }
            }
            else {
                var66 = (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(var52, var58, (SubLObject)ConsesLow.list(module0273.$ic22$, var59)), var60), var66);
                var66 = (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic53$, module0273.$ic99$, (SubLObject)ConsesLow.list(module0273.$ic100$, (SubLObject)ConsesLow.list(module0273.$ic101$, (SubLObject)ConsesLow.list(var55), (SubLObject)ConsesLow.list(var59, var55)))), var60), var66);
            }
            return module0276.f18287(var66, (SubLObject)module0273.UNPROVIDED);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17978(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        return f17977(var1, module0273.$ic102$, var2);
    }
    
    public static SubLObject f17979(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        return f17977(var1, module0273.$ic105$, var2);
    }
    
    public static SubLObject f17980(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        return f17977(var1, module0273.$ic108$, var2);
    }
    
    public static SubLObject f17981(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        return f17977(var1, module0273.$ic111$, var2);
    }
    
    public static SubLObject f17982(final SubLObject var1, final SubLObject var52, final SubLObject var2) {
        SubLObject var54;
        final SubLObject var53 = var54 = var1.rest();
        SubLObject var55 = (SubLObject)module0273.NIL;
        SubLObject var56 = (SubLObject)module0273.NIL;
        SubLObject var57 = (SubLObject)module0273.NIL;
        SubLObject var58 = (SubLObject)module0273.NIL;
        SubLObject var59 = (SubLObject)module0273.NIL;
        SubLObject var60 = (SubLObject)module0273.NIL;
        SubLObject var61 = (SubLObject)module0273.NIL;
        SubLObject var62 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0273.$ic114$);
        var55 = var54.first();
        var54 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0273.$ic114$);
        var56 = var54.first();
        var54 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0273.$ic114$);
        var57 = var54.first();
        var54 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0273.$ic114$);
        var58 = var54.first();
        var54 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0273.$ic114$);
        var59 = var54.first();
        var54 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0273.$ic114$);
        var60 = var54.first();
        var54 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0273.$ic114$);
        var61 = var54.first();
        var54 = (var62 = var54.rest());
        final SubLObject var63 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic93$, var62, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var64 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic94$, var62, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var65 = (module0273.NIL != var63) ? var63 : var64;
        if (var2.eql((SubLObject)module0273.$ic2$)) {
            SubLObject var66 = PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic115$, new SubLObject[] { var55, var52, var59, var60, var58 });
            if (module0273.NIL != var56 && module0273.NIL != var57) {
                var66 = Sequences.cconcatenate(var66, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic96$, var57, var56));
            }
            if (module0273.NIL != var65) {
                var66 = Sequences.cconcatenate(var66, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, var65));
            }
            var66 = Sequences.cconcatenate(var66, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var61));
            return var66;
        }
        if (var2.eql((SubLObject)module0273.$ic8$)) {
            return module0276.f18287((SubLObject)ConsesLow.list(module0279.f18489((SubLObject)ConsesLow.list(var52, var59, (SubLObject)ConsesLow.list(module0273.$ic22$, var60)), var61), module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic53$, module0273.$ic99$, (SubLObject)ConsesLow.list(module0273.$ic100$, (SubLObject)ConsesLow.list(module0273.$ic101$, (SubLObject)ConsesLow.list(var55), (SubLObject)ConsesLow.list(var60, var55)))), var61)), (SubLObject)module0273.UNPROVIDED);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17983(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        return f17982(var1, module0273.$ic116$, var2);
    }
    
    public static SubLObject f17984(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        return f17982(var1, module0273.$ic119$, var2);
    }
    
    public static SubLObject f17985(final SubLObject var1, final SubLObject var69, final SubLObject var52, final SubLObject var2) {
        SubLObject var71;
        final SubLObject var70 = var71 = var1.rest();
        SubLObject var72 = (SubLObject)module0273.NIL;
        SubLObject var73 = (SubLObject)module0273.NIL;
        SubLObject var74 = (SubLObject)module0273.NIL;
        SubLObject var75 = (SubLObject)module0273.NIL;
        SubLObject var76 = (SubLObject)module0273.NIL;
        SubLObject var77 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var71, var70, (SubLObject)module0273.$ic122$);
        var72 = var71.first();
        var71 = var71.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var71, var70, (SubLObject)module0273.$ic122$);
        var73 = var71.first();
        var71 = var71.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var71, var70, (SubLObject)module0273.$ic122$);
        var74 = var71.first();
        var71 = var71.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var71, var70, (SubLObject)module0273.$ic122$);
        var75 = var71.first();
        var71 = var71.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var71, var70, (SubLObject)module0273.$ic122$);
        var76 = var71.first();
        var71 = (var77 = var71.rest());
        final SubLObject var78 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic93$, var77, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var79 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic94$, var77, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var80 = (module0273.NIL != var78) ? var78 : var79;
        if (var2.eql((SubLObject)module0273.$ic2$)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic123$, new SubLObject[] { var72, var69, var75 }), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic124$, var74, var73), (module0273.NIL != var80) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, var80) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var76) });
        }
        if (var2.eql((SubLObject)module0273.$ic8$)) {
            return module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.list(var52, var72, var75)), var76);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17986(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        return f17985(var1, (SubLObject)module0273.$ic125$, module0273.$ic126$, var2);
    }
    
    public static SubLObject f17987(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        return f17985(var1, (SubLObject)module0273.$ic129$, module0273.$ic10$, var2);
    }
    
    public static SubLObject f17988(final SubLObject var74) {
        if (var74.eql((SubLObject)module0273.$ic132$)) {
            return (SubLObject)module0273.$ic125$;
        }
        if (var74.eql((SubLObject)module0273.$ic133$)) {
            return (SubLObject)module0273.$ic134$;
        }
        if (var74.eql((SubLObject)module0273.$ic135$)) {
            return (SubLObject)module0273.$ic129$;
        }
        if (var74.eql((SubLObject)module0273.$ic136$)) {
            return (SubLObject)module0273.$ic137$;
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17989(final SubLObject var74) {
        if (var74.eql((SubLObject)module0273.$ic132$)) {
            return (SubLObject)module0273.$ic138$;
        }
        if (var74.eql((SubLObject)module0273.$ic135$)) {
            return (SubLObject)module0273.$ic139$;
        }
        if (var74.eql((SubLObject)module0273.$ic136$)) {
            return (SubLObject)module0273.$ic140$;
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17990(final SubLObject var74) {
        if (var74.eql((SubLObject)module0273.$ic132$) || var74.eql((SubLObject)module0273.$ic133$)) {
            return module0273.$ic126$;
        }
        if (var74.eql((SubLObject)module0273.$ic135$)) {
            return module0273.$ic10$;
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17991(final SubLObject var74, final SubLObject var56, final SubLObject var73, final SubLObject var58, final SubLObject var75, final SubLObject var14) {
        SubLObject var76 = (SubLObject)module0273.NIL;
        final SubLObject var77 = module0302.f20101(var74, var73, var56);
        if (module0273.NIL != var77) {
            SubLObject var78 = module0279.f18491((SubLObject)ConsesLow.list(var77, var75, var58), var14);
            if (module0273.NIL != var78) {
                var76 = (SubLObject)ConsesLow.cons(var78, var76);
            }
            if (module0273.NIL != var76) {
                var78 = module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic141$, var56, var75), var14);
                if (module0273.NIL != var78) {
                    var76 = (SubLObject)ConsesLow.cons(var78, var76);
                }
            }
        }
        return var76;
    }
    
    public static SubLObject f17992(final SubLObject var74, final SubLObject var56, final SubLObject var73, final SubLObject var58, final SubLObject var79, final SubLObject var14) {
        SubLObject var80 = (SubLObject)module0273.NIL;
        final SubLObject var81 = module0302.f20103(var74, var73, var56);
        if (module0273.NIL != var81) {
            SubLObject var82 = module0279.f18491((SubLObject)ConsesLow.list(var81, var79, var58), var14);
            if (module0273.NIL != var82) {
                var80 = (SubLObject)ConsesLow.cons(var82, var80);
            }
            if (module0273.NIL != var80) {
                var82 = module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic142$, var56, var79), var14);
                if (module0273.NIL != var82) {
                    var80 = (SubLObject)ConsesLow.cons(var82, var80);
                }
            }
        }
        return var80;
    }
    
    public static SubLObject f17993(final SubLObject var74, final SubLObject var73, final SubLObject var56, final SubLObject var58, final SubLObject var14) {
        SubLObject var75 = (SubLObject)module0273.NIL;
        final SubLObject var76 = module0302.f20101(var74, var73, var56);
        if (module0273.NIL != var76) {
            var75 = (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(var76, var56, var58), var14), var75);
        }
        return var75;
    }
    
    public static SubLObject f17994(final SubLObject var1, final SubLObject var74, SubLObject var81) {
        if (var81 == module0273.UNPROVIDED) {
            var81 = (SubLObject)module0273.T;
        }
        SubLObject var83;
        final SubLObject var82 = var83 = var1.rest();
        SubLObject var84 = (SubLObject)module0273.NIL;
        SubLObject var85 = (SubLObject)module0273.NIL;
        SubLObject var86 = (SubLObject)module0273.NIL;
        SubLObject var87 = (SubLObject)module0273.NIL;
        SubLObject var88 = (SubLObject)module0273.NIL;
        SubLObject var89 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var83, var82, (SubLObject)module0273.$ic143$);
        var84 = var83.first();
        var83 = var83.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var83, var82, (SubLObject)module0273.$ic143$);
        var85 = var83.first();
        var83 = var83.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var83, var82, (SubLObject)module0273.$ic143$);
        var86 = var83.first();
        var83 = var83.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var83, var82, (SubLObject)module0273.$ic143$);
        var87 = var83.first();
        var83 = var83.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var83, var82, (SubLObject)module0273.$ic143$);
        var88 = var83.first();
        var83 = (var89 = var83.rest());
        final SubLObject var90 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic93$, var89, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var91 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic94$, var89, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        SubLObject var92 = (SubLObject)module0273.NIL;
        if (module0273.NIL != var90) {
            var92 = f17991(var74, var85, var86, var87, var90, var88);
        }
        else if (module0273.NIL != var91) {
            var92 = f17992(var74, var85, var86, var87, var91, var88);
        }
        else if (module0273.NIL != var81) {
            var92 = f17993(var74, var86, var85, var87, var88);
        }
        return var92;
    }
    
    public static SubLObject f17995(final SubLObject var1, final SubLObject var74) {
        SubLObject var76;
        final SubLObject var75 = var76 = var1.rest();
        SubLObject var77 = (SubLObject)module0273.NIL;
        SubLObject var78 = (SubLObject)module0273.NIL;
        SubLObject var79 = (SubLObject)module0273.NIL;
        SubLObject var80 = (SubLObject)module0273.NIL;
        SubLObject var81 = (SubLObject)module0273.NIL;
        SubLObject var82 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)module0273.$ic143$);
        var77 = var76.first();
        var76 = var76.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)module0273.$ic143$);
        var78 = var76.first();
        var76 = var76.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)module0273.$ic143$);
        var79 = var76.first();
        var76 = var76.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)module0273.$ic143$);
        var80 = var76.first();
        var76 = var76.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)module0273.$ic143$);
        var81 = var76.first();
        var76 = (var82 = var76.rest());
        final SubLObject var83 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic93$, var82, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var84 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic94$, var82, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var85 = (module0273.NIL != var83) ? var83 : var84;
        final SubLObject var86 = f17988(var74);
        return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic144$, new SubLObject[] { var77, var86, var80 }), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic124$, var79, var78), (module0273.NIL != var85) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, var85) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var81) });
    }
    
    public static SubLObject f17996(final SubLObject var1, final SubLObject var74) {
        SubLObject var76;
        final SubLObject var75 = var76 = var1.rest();
        SubLObject var77 = (SubLObject)module0273.NIL;
        SubLObject var78 = (SubLObject)module0273.NIL;
        SubLObject var79 = (SubLObject)module0273.NIL;
        SubLObject var80 = (SubLObject)module0273.NIL;
        SubLObject var81 = (SubLObject)module0273.NIL;
        SubLObject var82 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)module0273.$ic143$);
        var77 = var76.first();
        var76 = var76.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)module0273.$ic143$);
        var78 = var76.first();
        var76 = var76.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)module0273.$ic143$);
        var79 = var76.first();
        var76 = var76.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)module0273.$ic143$);
        var80 = var76.first();
        var76 = var76.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)module0273.$ic143$);
        var81 = var76.first();
        var76 = (var82 = var76.rest());
        final SubLObject var83 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic93$, var82, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var84 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic94$, var82, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var85 = (module0273.NIL != var83) ? var83 : var84;
        final SubLObject var86 = f17989(var74);
        final SubLObject var87 = f17988(var74);
        return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic145$, new SubLObject[] { var77, var86, var87, var80 }), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic124$, var79, var78), (module0273.NIL != var85) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, var85) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var81) });
    }
    
    public static SubLObject f17997(final SubLObject var1, final SubLObject var74, final SubLObject var90) {
        if (var90.eql((SubLObject)module0273.$ic2$)) {
            return f17995(var1, var74);
        }
        if (var90.eql((SubLObject)module0273.$ic8$)) {
            SubLObject var92;
            final SubLObject var91 = var92 = var1.rest();
            SubLObject var93 = (SubLObject)module0273.NIL;
            SubLObject var94 = (SubLObject)module0273.NIL;
            SubLObject var95 = (SubLObject)module0273.NIL;
            SubLObject var96 = (SubLObject)module0273.NIL;
            SubLObject var97 = (SubLObject)module0273.NIL;
            SubLObject var98 = (SubLObject)module0273.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var92, var91, (SubLObject)module0273.$ic143$);
            var93 = var92.first();
            var92 = var92.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var92, var91, (SubLObject)module0273.$ic143$);
            var94 = var92.first();
            var92 = var92.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var92, var91, (SubLObject)module0273.$ic143$);
            var95 = var92.first();
            var92 = var92.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var92, var91, (SubLObject)module0273.$ic143$);
            var96 = var92.first();
            var92 = var92.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var92, var91, (SubLObject)module0273.$ic143$);
            var97 = var92.first();
            var92 = (var98 = var92.rest());
            final SubLObject var99 = f17994(var1, var74, (SubLObject)module0273.UNPROVIDED);
            final SubLObject var100 = f17990(var74);
            return module0276.f18287(Sequences.remove((SubLObject)module0273.NIL, (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.list(var100, var93, var96)), var97), var99), (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED), (SubLObject)module0273.UNPROVIDED);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17998(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        if (module0273.NIL != module0273.$g2583$.getGlobalValue()) {
            return f17999(var1, var2);
        }
        return f17997(var1, (SubLObject)module0273.$ic132$, var2);
    }
    
    public static SubLObject f17999(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var3 = (SubLObject)module0273.NIL;
        SubLObject var4 = (SubLObject)module0273.NIL;
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0273.$ic146$);
        var3 = var1.first();
        SubLObject var10 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var1, (SubLObject)module0273.$ic146$);
        var4 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var1, (SubLObject)module0273.$ic146$);
        var5 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var1, (SubLObject)module0273.$ic146$);
        var6 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var1, (SubLObject)module0273.$ic146$);
        var7 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var1, (SubLObject)module0273.$ic146$);
        var8 = var10.first();
        var10 = (var9 = var10.rest());
        final SubLObject var11 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic93$, var9, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var12 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic94$, var9, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var13 = (module0273.NIL != var11) ? var11 : var12;
        final SubLObject var14 = var2;
        if (var14.eql((SubLObject)module0273.$ic2$)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic147$, var4, var7), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic124$, var6, var5), (module0273.NIL != var11) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, var13) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var8) });
        }
        if (var14.eql((SubLObject)module0273.$ic8$)) {
            final SubLObject var15 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic148$, var9, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
            final SubLObject var16 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic149$, var9, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
            final SubLObject var17 = module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic150$, (SubLObject)ConsesLow.list(module0273.$ic126$, var4, var7)), var8);
            SubLObject var18 = (SubLObject)ConsesLow.list(var3);
            SubLObject var19 = (SubLObject)module0273.NIL;
            SubLObject var20 = (SubLObject)module0273.NIL;
            var18 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0273.$ic151$, var4, var5, var6, var7, var8), var18);
            if (module0273.NIL != module0174.f11035(var15)) {
                var20 = (SubLObject)ConsesLow.cons(var15, var20);
            }
            if (module0273.NIL != module0173.f10955(var11)) {
                final SubLObject var21 = (SubLObject)ConsesLow.list(module0273.$ic141$, var5, var11);
                final SubLObject var22 = module0191.f11990((SubLObject)module0273.$ic152$, var21, var8, (SubLObject)module0273.UNPROVIDED);
                if (module0273.NIL != var22) {
                    var20 = (SubLObject)ConsesLow.cons(var22, var20);
                }
            }
            else if (module0273.NIL != module0173.f10955(var12)) {
                final SubLObject var23 = (SubLObject)ConsesLow.list(module0273.$ic142$, var5, var11);
                final SubLObject var22 = module0191.f11990((SubLObject)module0273.$ic152$, var23, var8, (SubLObject)module0273.UNPROVIDED);
                if (module0273.NIL != var22) {
                    var20 = (SubLObject)ConsesLow.cons(var22, var20);
                }
            }
            if (module0273.NIL != var17) {
                var19 = (SubLObject)ConsesLow.cons(var17, var19);
                var20 = (SubLObject)ConsesLow.cons(var17, var20);
            }
            if (module0273.NIL != var19) {
                var18 = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)module0273.$ic153$, ConsesLow.append(var19, (SubLObject)module0273.NIL)), var18);
            }
            if (module0273.NIL != var16) {
                var18 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0273.$ic154$, (SubLObject)ConsesLow.list(module0273.$ic155$, var16)), var18);
            }
            if (module0273.NIL != var20) {
                var18 = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)module0273.$ic156$, ConsesLow.append(Sequences.nreverse(var20), (SubLObject)module0273.NIL)), var18);
            }
            if (module0273.NIL != module0274.f18088()) {
                final SubLObject var24 = module0275.f18236(var1, (SubLObject)module0273.UNPROVIDED);
                var18 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)module0273.$ic157$, var24), var18);
            }
            return Sequences.nreverse(var18);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18000(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        return f17997(var1, (SubLObject)module0273.$ic135$, var2);
    }
    
    public static SubLObject f18001(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        if (module0273.NIL != module0273.$g2583$.getGlobalValue()) {
            return f18002(var1, var2);
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            return f17995(var1, (SubLObject)module0273.$ic136$);
        }
        if (var3.eql((SubLObject)module0273.$ic8$)) {
            SubLObject var4 = f17994(var1, (SubLObject)module0273.$ic136$, (SubLObject)module0273.NIL);
            SubLObject var6;
            final SubLObject var5 = var6 = var1.rest();
            SubLObject var7 = (SubLObject)module0273.NIL;
            SubLObject var8 = (SubLObject)module0273.NIL;
            SubLObject var9 = (SubLObject)module0273.NIL;
            SubLObject var10 = (SubLObject)module0273.NIL;
            SubLObject var11 = (SubLObject)module0273.NIL;
            SubLObject var12 = (SubLObject)module0273.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0273.$ic143$);
            var7 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0273.$ic143$);
            var8 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0273.$ic143$);
            var9 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0273.$ic143$);
            var10 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0273.$ic143$);
            var11 = var6.first();
            var6 = (var12 = var6.rest());
            if (module0273.NIL == var4) {
                final SubLObject var13 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic93$, var12, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
                if (module0273.NIL != var13) {
                    var4 = (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(var13, var8, var10), var11), var4);
                }
            }
            return module0276.f18287(Sequences.remove((SubLObject)module0273.NIL, (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.list(module0273.$ic162$, var7, var10)), var11), var4), (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED), (SubLObject)module0273.UNPROVIDED);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18002(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var3 = (SubLObject)module0273.NIL;
        SubLObject var4 = (SubLObject)module0273.NIL;
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0273.$ic146$);
        var3 = var1.first();
        SubLObject var10 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var1, (SubLObject)module0273.$ic146$);
        var4 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var1, (SubLObject)module0273.$ic146$);
        var5 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var1, (SubLObject)module0273.$ic146$);
        var6 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var1, (SubLObject)module0273.$ic146$);
        var7 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var1, (SubLObject)module0273.$ic146$);
        var8 = var10.first();
        var10 = (var9 = var10.rest());
        final SubLObject var11 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic93$, var9, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var12 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic94$, var9, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var13 = (module0273.NIL != var11) ? var11 : var12;
        final SubLObject var14 = var2;
        if (var14.eql((SubLObject)module0273.$ic2$)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic163$, var4, var7), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic124$, var6, var5), (module0273.NIL != var11) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, var13) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var8) });
        }
        if (var14.eql((SubLObject)module0273.$ic8$)) {
            final SubLObject var15 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic148$, var9, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
            final SubLObject var16 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic149$, var9, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
            final SubLObject var17 = module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic150$, (SubLObject)ConsesLow.list(module0273.$ic162$, var4, var7)), var8);
            SubLObject var18 = (SubLObject)ConsesLow.list(var3);
            SubLObject var19 = (SubLObject)module0273.NIL;
            SubLObject var20 = (SubLObject)module0273.NIL;
            var18 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0273.$ic151$, var4, var5, var6, var7, var8), var18);
            if (module0273.NIL != module0174.f11035(var15)) {
                var20 = (SubLObject)ConsesLow.cons(var15, var20);
            }
            if (module0273.NIL != module0173.f10955(var11)) {
                final SubLObject var21 = (SubLObject)ConsesLow.list(module0273.$ic141$, var5, var11);
                final SubLObject var22 = module0191.f11990((SubLObject)module0273.$ic152$, var21, var8, (SubLObject)module0273.UNPROVIDED);
                if (module0273.NIL != var22) {
                    var20 = (SubLObject)ConsesLow.cons(var22, var20);
                }
            }
            else if (module0273.NIL != module0173.f10955(var12)) {
                final SubLObject var23 = (SubLObject)ConsesLow.list(module0273.$ic142$, var5, var12);
                final SubLObject var22 = module0191.f11990((SubLObject)module0273.$ic152$, var23, var8, (SubLObject)module0273.UNPROVIDED);
                if (module0273.NIL != var22) {
                    var20 = (SubLObject)ConsesLow.cons(var22, var20);
                }
            }
            if (module0273.NIL != var17) {
                var19 = (SubLObject)ConsesLow.cons(var17, var19);
                var20 = (SubLObject)ConsesLow.cons(var17, var20);
            }
            if (module0273.NIL != var19) {
                var18 = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)module0273.$ic153$, ConsesLow.append(var19, (SubLObject)module0273.NIL)), var18);
            }
            if (module0273.NIL != var16) {
                var18 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0273.$ic154$, (SubLObject)ConsesLow.list(module0273.$ic155$, var16)), var18);
            }
            if (module0273.NIL != var20) {
                var18 = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)module0273.$ic156$, ConsesLow.append(Sequences.nreverse(var20), (SubLObject)module0273.NIL)), var18);
            }
            if (module0273.NIL != module0274.f18088()) {
                final SubLObject var24 = module0275.f18244(var1, (SubLObject)module0273.UNPROVIDED);
                var18 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)module0273.$ic157$, var24), var18);
            }
            return Sequences.nreverse(var18);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18003(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            return f17995(var1, (SubLObject)module0273.$ic133$);
        }
        if (var3.eql((SubLObject)module0273.$ic8$)) {
            SubLObject var5;
            final SubLObject var4 = var5 = var1.rest();
            SubLObject var6 = (SubLObject)module0273.NIL;
            SubLObject var7 = (SubLObject)module0273.NIL;
            SubLObject var8 = (SubLObject)module0273.NIL;
            SubLObject var9 = (SubLObject)module0273.NIL;
            SubLObject var10 = (SubLObject)module0273.NIL;
            SubLObject var11 = (SubLObject)module0273.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic143$);
            var6 = var5.first();
            var5 = var5.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic143$);
            var7 = var5.first();
            var5 = var5.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic143$);
            var8 = var5.first();
            var5 = var5.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic143$);
            var9 = var5.first();
            var5 = var5.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic143$);
            var10 = var5.first();
            var5 = (var11 = var5.rest());
            final SubLObject var12 = f17994(var1, (SubLObject)module0273.$ic133$, (SubLObject)module0273.UNPROVIDED);
            final SubLObject var13 = f17990((SubLObject)module0273.$ic133$);
            return module0276.f18287(Sequences.remove((SubLObject)module0273.NIL, (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(var13, var6, var9), var10), var12), (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED), (SubLObject)module0273.UNPROVIDED);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18004(final SubLObject var1, final SubLObject var74, final SubLObject var2) {
        if (var2.eql((SubLObject)module0273.$ic2$)) {
            return f17996(var1, var74);
        }
        if (var2.eql((SubLObject)module0273.$ic8$)) {
            SubLObject var75 = f17994(var1, var74, (SubLObject)module0273.UNPROVIDED);
            SubLObject var77;
            final SubLObject var76 = var77 = var1.rest();
            SubLObject var78 = (SubLObject)module0273.NIL;
            SubLObject var79 = (SubLObject)module0273.NIL;
            SubLObject var80 = (SubLObject)module0273.NIL;
            SubLObject var81 = (SubLObject)module0273.NIL;
            SubLObject var82 = (SubLObject)module0273.NIL;
            SubLObject var83 = (SubLObject)module0273.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)module0273.$ic143$);
            var78 = var77.first();
            var77 = var77.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)module0273.$ic143$);
            var79 = var77.first();
            var77 = var77.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)module0273.$ic143$);
            var80 = var77.first();
            var77 = var77.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)module0273.$ic143$);
            var81 = var77.first();
            var77 = var77.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)module0273.$ic143$);
            var82 = var77.first();
            var77 = (var83 = var77.rest());
            final SubLObject var84 = module0302.f20101(var74, var80, var79);
            final SubLObject var85 = f17990(var74);
            if (module0273.NIL == var75 && module0273.NIL != var84) {
                var75 = (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(var84, var79, var81), var82), var75);
            }
            return module0276.f18287(Sequences.remove((SubLObject)module0273.NIL, (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.list(var85, var78, var81)), var82), var75), (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED), (SubLObject)module0273.UNPROVIDED);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18005(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        if (module0273.NIL != module0273.$g2583$.getGlobalValue()) {
            return f18006(var1, var2);
        }
        return f18004(var1, (SubLObject)module0273.$ic132$, var2);
    }
    
    public static SubLObject f18006(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var3 = (SubLObject)module0273.NIL;
        SubLObject var4 = (SubLObject)module0273.NIL;
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0273.$ic146$);
        var3 = var1.first();
        SubLObject var10 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var1, (SubLObject)module0273.$ic146$);
        var4 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var1, (SubLObject)module0273.$ic146$);
        var5 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var1, (SubLObject)module0273.$ic146$);
        var6 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var1, (SubLObject)module0273.$ic146$);
        var7 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var1, (SubLObject)module0273.$ic146$);
        var8 = var10.first();
        var10 = (var9 = var10.rest());
        final SubLObject var11 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic93$, var9, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var12 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic94$, var9, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
        final SubLObject var13 = (module0273.NIL != var11) ? var11 : var12;
        final SubLObject var14 = var2;
        if (var14.eql((SubLObject)module0273.$ic2$)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic168$, var4, var7), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic124$, var6, var5), (module0273.NIL != var11) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, var13) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var8) });
        }
        if (var14.eql((SubLObject)module0273.$ic8$)) {
            final SubLObject var15 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic148$, var9, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
            final SubLObject var16 = conses_high.cadr(conses_high.assoc((SubLObject)module0273.$ic149$, var9, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED));
            final SubLObject var17 = module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.list(module0273.$ic126$, var4, var7)), var8);
            SubLObject var18 = (SubLObject)ConsesLow.list(var3);
            SubLObject var19 = (SubLObject)module0273.NIL;
            SubLObject var20 = (SubLObject)module0273.NIL;
            var18 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0273.$ic151$, var4, var5, var6, var7, var8), var18);
            if (module0273.NIL != module0174.f11035(var15)) {
                var20 = (SubLObject)ConsesLow.cons(var15, var20);
            }
            if (module0273.NIL != module0173.f10955(var11)) {
                final SubLObject var21 = (SubLObject)ConsesLow.list(module0273.$ic141$, var5, var11);
                final SubLObject var22 = module0191.f11990((SubLObject)module0273.$ic152$, var21, var8, (SubLObject)module0273.UNPROVIDED);
                if (module0273.NIL != var22) {
                    var20 = (SubLObject)ConsesLow.cons(var22, var20);
                }
            }
            else if (module0273.NIL != module0173.f10955(var12)) {
                final SubLObject var23 = (SubLObject)ConsesLow.list(module0273.$ic142$, var5, var11);
                final SubLObject var22 = module0191.f11990((SubLObject)module0273.$ic152$, var23, var8, (SubLObject)module0273.UNPROVIDED);
                if (module0273.NIL != var22) {
                    var20 = (SubLObject)ConsesLow.cons(var22, var20);
                }
            }
            if (module0273.NIL != var17) {
                var19 = (SubLObject)ConsesLow.cons(var17, var19);
                var20 = (SubLObject)ConsesLow.cons(var17, var20);
            }
            if (module0273.NIL != var19) {
                var18 = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)module0273.$ic153$, ConsesLow.append(var19, (SubLObject)module0273.NIL)), var18);
            }
            if (module0273.NIL != var16) {
                var18 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0273.$ic154$, (SubLObject)ConsesLow.list(module0273.$ic155$, var16)), var18);
            }
            if (module0273.NIL != var20) {
                var18 = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)module0273.$ic156$, ConsesLow.append(Sequences.nreverse(var20), (SubLObject)module0273.NIL)), var18);
            }
            if (module0273.NIL != module0274.f18088()) {
                final SubLObject var24 = module0275.f18242(var1, (SubLObject)module0273.UNPROVIDED);
                var18 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)module0273.$ic157$, var24), var18);
            }
            return Sequences.nreverse(var18);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18007(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        return f18004(var1, (SubLObject)module0273.$ic132$, var2);
    }
    
    public static SubLObject f18008(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            return f17996(var1, (SubLObject)module0273.$ic136$);
        }
        if (var3.eql((SubLObject)module0273.$ic8$)) {
            SubLObject var4 = f17994(var1, (SubLObject)module0273.$ic136$, (SubLObject)module0273.UNPROVIDED);
            SubLObject var6;
            final SubLObject var5 = var6 = var1.rest();
            SubLObject var7 = (SubLObject)module0273.NIL;
            SubLObject var8 = (SubLObject)module0273.NIL;
            SubLObject var9 = (SubLObject)module0273.NIL;
            SubLObject var10 = (SubLObject)module0273.NIL;
            SubLObject var11 = (SubLObject)module0273.NIL;
            SubLObject var12 = (SubLObject)module0273.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0273.$ic143$);
            var7 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0273.$ic143$);
            var8 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0273.$ic143$);
            var9 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0273.$ic143$);
            var10 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0273.$ic143$);
            var11 = var6.first();
            var6 = (var12 = var6.rest());
            if (module0273.NIL == var4) {
                final SubLObject var13 = module0226.f14947(var9, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED);
                if (module0273.NIL != var13) {
                    var4 = (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(var13, var8, var10), var11), var4);
                }
            }
            return module0276.f18287(Sequences.remove((SubLObject)module0273.NIL, (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic173$, var7, var10), var11), var4), (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED), (SubLObject)module0273.UNPROVIDED);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18009(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        SubLObject var10 = (SubLObject)module0273.NIL;
        SubLObject var11 = (SubLObject)module0273.NIL;
        SubLObject var12 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var10 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var11 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var12 = var4.first();
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : module0273.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0273.$ic176$);
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var14 = var2;
            if (var14.eql((SubLObject)module0273.$ic2$)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic177$, var5, var8), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic124$, var7, var6), (module0273.NIL != var13) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, conses_high.second(var13)) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic178$, new SubLObject[] { var10, var11, var9 }), PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var12) });
            }
            if (var14.eql((SubLObject)module0273.$ic8$)) {
                final SubLObject var15 = module0303.f20126(var10, var7);
                SubLObject var16 = (SubLObject)module0273.NIL;
                if (module0273.NIL != var13) {
                    final SubLObject var8_125 = var13.first();
                    if (var8_125.eql((SubLObject)module0273.$ic94$)) {
                        final SubLObject var17 = module0303.f20127(var10, var7);
                        final SubLObject var18 = conses_high.second(var13);
                        SubLObject var76_128 = (SubLObject)module0273.NIL;
                        SubLObject var19 = module0279.f18491((SubLObject)ConsesLow.list(var17, var18, var9, var8), var12);
                        if (module0273.NIL != var19) {
                            var76_128 = (SubLObject)ConsesLow.cons(var19, var76_128);
                        }
                        if (module0273.NIL != var76_128) {
                            var19 = module0279.f18491((SubLObject)ConsesLow.list(module0273.$ic142$, var6, var18), var12);
                            if (module0273.NIL != var19) {
                                var76_128 = (SubLObject)ConsesLow.cons(var19, var76_128);
                            }
                        }
                    }
                    else if (var8_125.eql((SubLObject)module0273.$ic93$) && module0273.NIL != var15) {
                        SubLObject var20 = module0279.f18491((SubLObject)ConsesLow.list(var15, conses_high.second(var13), var9, var8), var12);
                        if (module0273.NIL != var20) {
                            var16 = (SubLObject)ConsesLow.cons(var20, var16);
                        }
                        if (module0273.NIL != var16) {
                            var20 = module0279.f18491((SubLObject)ConsesLow.list(module0273.$ic141$, var6, conses_high.second(var13)), var12);
                            if (module0273.NIL != var20) {
                                var16 = (SubLObject)ConsesLow.cons(var20, var16);
                            }
                        }
                    }
                }
                if (module0273.NIL == var16 && module0273.NIL != var15) {
                    var16 = (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(var15, var6, var9, var8), var12), var16);
                }
                return module0276.f18287(Sequences.remove((SubLObject)module0273.NIL, (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.list(module0273.$ic126$, var5, var8)), var12), (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic126$, var11, var9), var12), var16)), (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED), (SubLObject)module0273.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic176$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18010(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        SubLObject var10 = (SubLObject)module0273.NIL;
        SubLObject var11 = (SubLObject)module0273.NIL;
        SubLObject var12 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var10 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var11 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic176$);
        var12 = var4.first();
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : module0273.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0273.$ic176$);
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var14 = var2;
            if (var14.eql((SubLObject)module0273.$ic2$)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic181$, var5, var8), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic124$, var7, var6), (module0273.NIL != var13) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, conses_high.second(var13)) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic182$, new SubLObject[] { var10, var11, var9 }), PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var12) });
            }
            if (var14.eql((SubLObject)module0273.$ic8$)) {
                final SubLObject var15 = module0303.f20128(var10, var7);
                SubLObject var16 = (SubLObject)module0273.NIL;
                if (module0273.NIL != var13) {
                    final SubLObject var8_132 = var13.first();
                    if (var8_132.eql((SubLObject)module0273.$ic94$)) {
                        final SubLObject var17 = module0303.f20129(var10, var7);
                        final SubLObject var18 = conses_high.second(var13);
                        SubLObject var76_133 = (SubLObject)module0273.NIL;
                        SubLObject var19 = module0279.f18491((SubLObject)ConsesLow.list(var17, var18, var9, var8), var12);
                        if (module0273.NIL != var19) {
                            var76_133 = (SubLObject)ConsesLow.cons(var19, var76_133);
                        }
                        if (module0273.NIL != var76_133) {
                            var19 = module0279.f18491((SubLObject)ConsesLow.list(module0273.$ic142$, var6, var18), var12);
                            if (module0273.NIL != var19) {
                                var76_133 = (SubLObject)ConsesLow.cons(var19, var76_133);
                            }
                        }
                    }
                    else if (var8_132.eql((SubLObject)module0273.$ic93$) && module0273.NIL != var15) {
                        SubLObject var20 = module0279.f18491((SubLObject)ConsesLow.list(var15, conses_high.second(var13), var9, var8), var12);
                        if (module0273.NIL != var20) {
                            var16 = (SubLObject)ConsesLow.cons(var20, var16);
                        }
                        if (module0273.NIL != var16) {
                            var20 = module0279.f18491((SubLObject)ConsesLow.list(module0273.$ic141$, var6, conses_high.second(var13)), var12);
                            if (module0273.NIL != var20) {
                                var16 = (SubLObject)ConsesLow.cons(var20, var16);
                            }
                        }
                    }
                }
                if (module0273.NIL == var16 && module0273.NIL != var15) {
                    var16 = (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(var15, var6, var9, var8), var12), var16);
                }
                return module0276.f18287(Sequences.remove((SubLObject)module0273.NIL, (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic126$, var5, var8), var12), (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic126$, var11, var9), var12), var16)), (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED), (SubLObject)module0273.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic176$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18011(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        SubLObject var10 = (SubLObject)module0273.NIL;
        SubLObject var11 = (SubLObject)module0273.NIL;
        SubLObject var12 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic185$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic185$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic185$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic185$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic185$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic185$);
        var10 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic185$);
        var11 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic185$);
        var12 = var4.first();
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : module0273.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0273.$ic185$);
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var14 = var2;
            if (var14.eql((SubLObject)module0273.$ic2$)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic186$, var5, var8), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic124$, var7, var6), (module0273.NIL != var13) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, conses_high.second(var13)) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic187$, new SubLObject[] { var10, var11, var9 }), PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var12) });
            }
            if (var14.eql((SubLObject)module0273.$ic8$)) {
                final SubLObject var15 = module0303.f20130(var10, var7);
                SubLObject var16 = (SubLObject)module0273.NIL;
                if (module0273.NIL != var13) {
                    final SubLObject var8_137 = var13.first();
                    if (var8_137.eql((SubLObject)module0273.$ic94$)) {
                        final SubLObject var17 = module0303.f20134(var10, var7);
                        final SubLObject var18 = conses_high.second(var13);
                        SubLObject var76_138 = (SubLObject)module0273.NIL;
                        SubLObject var19 = module0279.f18491((SubLObject)ConsesLow.list(var17, var18, var9, var8), var12);
                        if (module0273.NIL != var19) {
                            var76_138 = (SubLObject)ConsesLow.cons(var19, var76_138);
                        }
                        if (module0273.NIL != var76_138) {
                            var19 = module0279.f18491((SubLObject)ConsesLow.list(module0273.$ic142$, var6, var18), var12);
                            if (module0273.NIL != var19) {
                                var76_138 = (SubLObject)ConsesLow.cons(var19, var76_138);
                            }
                        }
                    }
                    else if (var8_137.eql((SubLObject)module0273.$ic93$) && module0273.NIL != var15) {
                        SubLObject var20 = module0279.f18491((SubLObject)ConsesLow.list(var15, conses_high.second(var13), var9, var8), var12);
                        if (module0273.NIL != var20) {
                            var16 = (SubLObject)ConsesLow.cons(var20, var16);
                        }
                        if (module0273.NIL != var16) {
                            var20 = module0279.f18491((SubLObject)ConsesLow.list(module0273.$ic141$, var6, conses_high.second(var13)), var12);
                            if (module0273.NIL != var20) {
                                var16 = (SubLObject)ConsesLow.cons(var20, var16);
                            }
                        }
                    }
                }
                if (module0273.NIL == var16 && module0273.NIL != var15) {
                    var16 = (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(var15, var6, var9, var8), var12), var16);
                }
                return module0276.f18287(Sequences.remove((SubLObject)module0273.NIL, (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.list(module0273.$ic162$, var5, var8)), var12), (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic162$, var11, var9), var12), var16)), (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED), (SubLObject)module0273.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic185$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18012(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        SubLObject var10 = (SubLObject)module0273.NIL;
        SubLObject var11 = (SubLObject)module0273.NIL;
        SubLObject var12 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var10 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var11 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var12 = var4.first();
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : module0273.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0273.$ic190$);
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var14 = var2;
            if (var14.eql((SubLObject)module0273.$ic2$)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic191$, var5, var8), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic124$, var7, var6), (module0273.NIL != var13) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, conses_high.second(var13)) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic178$, new SubLObject[] { var10, var11, var9 }), PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var12) });
            }
            if (var14.eql((SubLObject)module0273.$ic8$)) {
                return f18009(var1, var2);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic190$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18013(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        SubLObject var10 = (SubLObject)module0273.NIL;
        SubLObject var11 = (SubLObject)module0273.NIL;
        SubLObject var12 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var10 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var11 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var12 = var4.first();
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : module0273.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0273.$ic190$);
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var14 = var2;
            if (var14.eql((SubLObject)module0273.$ic2$)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic194$, var5, var8), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic124$, var7, var6), (module0273.NIL != var13) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, conses_high.second(var13)) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic182$, new SubLObject[] { var10, var11, var9 }), PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var12) });
            }
            if (var14.eql((SubLObject)module0273.$ic8$)) {
                return f18010(var1, var2);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic190$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18014(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        SubLObject var10 = (SubLObject)module0273.NIL;
        SubLObject var11 = (SubLObject)module0273.NIL;
        SubLObject var12 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var10 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var11 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var12 = var4.first();
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : module0273.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0273.$ic190$);
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var14 = var2;
            if (var14.eql((SubLObject)module0273.$ic2$)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic197$, var5, var8), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic124$, var7, var6), (module0273.NIL != var13) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, conses_high.second(var13)) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic178$, new SubLObject[] { var10, var11, var9 }), PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var12) });
            }
            if (var14.eql((SubLObject)module0273.$ic8$)) {
                return f18009(var1, var2);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic190$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18015(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        SubLObject var10 = (SubLObject)module0273.NIL;
        SubLObject var11 = (SubLObject)module0273.NIL;
        SubLObject var12 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var10 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var11 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var12 = var4.first();
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : module0273.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0273.$ic200$);
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var14 = var2;
            if (var14.eql((SubLObject)module0273.$ic2$)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic201$, var5, var8), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic124$, var7, var6), (module0273.NIL != var13) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, conses_high.second(var13)) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic178$, new SubLObject[] { var10, var11, var9 }), PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var12) });
            }
            if (var14.eql((SubLObject)module0273.$ic8$)) {
                return f18011(var1, var2);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic200$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18016(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        SubLObject var10 = (SubLObject)module0273.NIL;
        SubLObject var11 = (SubLObject)module0273.NIL;
        SubLObject var12 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var10 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var11 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic190$);
        var12 = var4.first();
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : module0273.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0273.$ic190$);
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var14 = var2;
            if (var14.eql((SubLObject)module0273.$ic2$)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic204$, var5, var8), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic124$, var7, var6), (module0273.NIL != var13) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, conses_high.second(var13)) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic178$, new SubLObject[] { var10, var11, var9 }), PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var12) });
            }
            if (var14.eql((SubLObject)module0273.$ic8$)) {
                return module0276.f18287((SubLObject)ConsesLow.list(module0202.f12771(module0202.f12768(module0273.$ic162$, var5, var8)), module0202.f12768(module0273.$ic126$, var11, var9), (SubLObject)ConsesLow.list(module0273.$ic205$, var6, var10, var9, var7, var8)), (SubLObject)module0273.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic190$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18017(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        SubLObject var10 = (SubLObject)module0273.NIL;
        SubLObject var11 = (SubLObject)module0273.NIL;
        SubLObject var12 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var10 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var11 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic200$);
        var12 = var4.first();
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : module0273.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0273.$ic200$);
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var14 = var2;
            if (var14.eql((SubLObject)module0273.$ic2$)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic208$, var5, var8), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic124$, var7, var6), (module0273.NIL != var13) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, conses_high.second(var13)) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic209$, new SubLObject[] { var10, var11, var9 }), PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var12) });
            }
            if (var14.eql((SubLObject)module0273.$ic8$)) {
                return module0276.f18287((SubLObject)ConsesLow.list(module0202.f12771(module0202.f12768(module0273.$ic126$, var5, var8)), module0202.f12768(module0273.$ic210$, var11, var9), (SubLObject)ConsesLow.list(module0273.$ic205$, var6, var10, var9, var7, var8)), (SubLObject)module0273.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic200$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18018(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        SubLObject var10 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic213$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic213$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic213$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic213$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic213$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic213$);
        var10 = var4.first();
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : module0273.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0273.$ic213$);
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var12 = var2;
            if (var12.eql((SubLObject)module0273.$ic2$)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic214$, var5, var8), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic215$, var7, var6), (module0273.NIL != var11) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic216$, conses_high.second(var11)) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic217$, var9), (module0273.NIL != var10) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic218$, (SubLObject)((module0273.NIL != var10.rest()) ? module0273.$ic219$ : module0273.$ic220$), module0038.f2888(var10, Symbols.symbol_function((SubLObject)module0273.$ic221$), (SubLObject)module0273.$ic222$, (SubLObject)module0273.$ic223$)) : module0273.$ic17$ });
            }
            if (var12.eql((SubLObject)module0273.$ic8$)) {
                SubLObject var13 = (SubLObject)module0273.NIL;
                final SubLObject var8_155 = var11.first();
                if (var8_155.eql((SubLObject)module0273.$ic93$)) {
                    final SubLObject var14 = module0226.f15038(var7);
                    if (module0273.NIL != var14) {
                        SubLObject var15 = module0279.f18491((SubLObject)ConsesLow.list(var14, conses_high.second(var11), var8), var9);
                        if (module0273.NIL != var15) {
                            var13 = (SubLObject)ConsesLow.cons(var15, var13);
                        }
                        if (module0273.NIL != var13) {
                            var15 = module0279.f18491((SubLObject)ConsesLow.list(module0273.$ic141$, var6, conses_high.second(var11)), var9);
                            if (module0273.NIL != var15) {
                                var13 = (SubLObject)ConsesLow.cons(var15, var13);
                            }
                        }
                    }
                }
                else if (var8_155.eql((SubLObject)module0273.$ic94$)) {
                    final SubLObject var16 = module0226.f15037(var7);
                    if (module0273.NIL != var16) {
                        SubLObject var15 = module0279.f18491((SubLObject)ConsesLow.list(var16, conses_high.second(var11), var8), var9);
                        if (module0273.NIL != var15) {
                            var13 = (SubLObject)ConsesLow.cons(var15, var13);
                        }
                        if (module0273.NIL != var13) {
                            var15 = module0279.f18491((SubLObject)ConsesLow.list(module0273.$ic142$, var6, conses_high.second(var11)), var9);
                            if (module0273.NIL != var15) {
                                var13 = (SubLObject)ConsesLow.cons(var15, var13);
                            }
                        }
                    }
                }
                else {
                    final SubLObject var14 = module0226.f15038(var7);
                    var13 = (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(var14, var6, var8), var9), var13);
                }
                if (module0273.NIL != var13 && module0273.NIL != var10) {
                    return module0276.f18287(ConsesLow.append(var13, var10), (SubLObject)module0273.UNPROVIDED);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic213$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18019(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        SubLObject var10 = (SubLObject)module0273.NIL;
        SubLObject var11 = (SubLObject)module0273.NIL;
        SubLObject var12 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic226$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic226$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic226$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic226$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic226$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic226$);
        var10 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic226$);
        var11 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic226$);
        var12 = var4.first();
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : module0273.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0273.$ic226$);
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var14 = (SubLObject)module0273.NIL;
            final SubLObject var15 = var2;
            if (var15.eql((SubLObject)module0273.$ic2$)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic227$, var5, var8), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic215$, var7, var6), (module0273.NIL != var13) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic216$, conses_high.second(var13)) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic228$, new SubLObject[] { var10, var11, var9 }), PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic217$, var12), (module0273.NIL != var14) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic229$, (SubLObject)((module0273.NIL != var14.rest()) ? module0273.$ic219$ : module0273.$ic220$), module0038.f2888(var14, Symbols.symbol_function((SubLObject)module0273.$ic221$), (SubLObject)module0273.$ic222$, (SubLObject)module0273.$ic223$)) : module0273.$ic17$ });
            }
            if (var15.eql((SubLObject)module0273.$ic8$)) {
                final SubLObject var16 = module0226.f15051(var10, var7);
                SubLObject var17 = (SubLObject)module0273.NIL;
                if (module0273.NIL != var13) {
                    final SubLObject var8_160 = var13.first();
                    if (var8_160.eql((SubLObject)module0273.$ic94$)) {
                        final SubLObject var18 = module0226.f15054(var10, var7);
                        if (module0273.NIL != var18) {
                            SubLObject var19 = module0279.f18491((SubLObject)ConsesLow.list(var18, conses_high.second(var13), var9, var8), var12);
                            if (module0273.NIL != var19) {
                                var17 = (SubLObject)ConsesLow.cons(var19, var17);
                            }
                            if (module0273.NIL != var17) {
                                var19 = module0279.f18491((SubLObject)ConsesLow.list(module0273.$ic142$, var6, conses_high.second(var13)), var12);
                                if (module0273.NIL != var19) {
                                    var17 = (SubLObject)ConsesLow.cons(var19, var17);
                                }
                            }
                        }
                    }
                    else if (var8_160.eql((SubLObject)module0273.$ic93$) && module0273.NIL != var16) {
                        SubLObject var20 = module0279.f18491((SubLObject)ConsesLow.list(var16, conses_high.second(var13), var9, var8), var12);
                        if (module0273.NIL != var20) {
                            var17 = (SubLObject)ConsesLow.cons(var20, var17);
                        }
                        if (module0273.NIL != var17) {
                            var20 = module0279.f18491((SubLObject)ConsesLow.list(module0273.$ic141$, var6, conses_high.second(var13)), var12);
                            if (module0273.NIL != var20) {
                                var17 = (SubLObject)ConsesLow.cons(var20, var17);
                            }
                        }
                    }
                }
                if (module0273.NIL == var17 && module0273.NIL != var16) {
                    var17 = (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(var16, var6, var9, var8), var12), var17);
                }
                if (module0273.NIL != var17 && module0273.NIL != var14) {
                    return module0276.f18287(ConsesLow.append(var17, var14), (SubLObject)module0273.UNPROVIDED);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic226$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18020(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        SubLObject var9 = (SubLObject)module0273.NIL;
        SubLObject var10 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic232$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic232$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic232$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic232$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic232$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic232$);
        var10 = var4.first();
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : module0273.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0273.$ic232$);
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var12 = var2;
            if (var12.eql((SubLObject)module0273.$ic2$)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic233$, var6, var8), new SubLObject[] { PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic234$, new SubLObject[] { var7, var9, var5 }), (module0273.NIL != var11) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic97$, conses_high.second(var11)) : module0273.$ic17$, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic98$, var10) });
            }
            if (var12.eql((SubLObject)module0273.$ic8$)) {
                SubLObject var13 = (SubLObject)module0273.NIL;
                if (module0273.NIL != var11) {
                    final SubLObject var8_167 = var11.first();
                    if (var8_167.eql((SubLObject)module0273.$ic94$)) {
                        SubLObject var14 = module0279.f18491((SubLObject)ConsesLow.list(module0273.$ic235$, conses_high.second(var11), var9, var7), var10);
                        if (module0273.NIL != var14) {
                            var13 = (SubLObject)ConsesLow.cons(var14, var13);
                        }
                        if (module0273.NIL != var13) {
                            var14 = module0279.f18491((SubLObject)ConsesLow.list(module0273.$ic142$, var5, conses_high.second(var11)), var10);
                            if (module0273.NIL != var14) {
                                var13 = (SubLObject)ConsesLow.cons(var14, var13);
                            }
                        }
                    }
                    else if (var8_167.eql((SubLObject)module0273.$ic93$)) {
                        SubLObject var14 = module0279.f18491((SubLObject)ConsesLow.list(module0273.$ic235$, conses_high.second(var11), var7, var9), var10);
                        if (module0273.NIL != var14) {
                            var13 = (SubLObject)ConsesLow.cons(var14, var13);
                        }
                        if (module0273.NIL != var13) {
                            var14 = module0279.f18491((SubLObject)ConsesLow.list(module0273.$ic141$, var5, conses_high.second(var11)), var10);
                            if (module0273.NIL != var14) {
                                var13 = (SubLObject)ConsesLow.cons(var14, var13);
                            }
                        }
                    }
                }
                if (module0273.NIL == var13) {
                    var13 = (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic235$, var5, var7, var9), var10), var13);
                }
                return module0276.f18287(Sequences.remove((SubLObject)module0273.NIL, (SubLObject)ConsesLow.cons(module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic236$, var6, var8), var10), var13), (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED), (SubLObject)module0273.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic232$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18021(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic239$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic239$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic239$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var8 = var2;
            if (var8.eql((SubLObject)module0273.$ic2$)) {
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic240$, new SubLObject[] { var6, var5, var7 });
            }
            if (var8.eql((SubLObject)module0273.$ic8$)) {
                return (SubLObject)ConsesLow.list(module0273.$ic20$, var7, (SubLObject)ConsesLow.list(module0273.$ic150$, (SubLObject)ConsesLow.list(module0273.$ic241$, (SubLObject)module0273.$ic242$, (SubLObject)ConsesLow.listS(module0273.$ic243$, var5, (SubLObject)module0273.$ic244$))));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic239$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18022(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic247$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic247$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var7 = module0202.f12832(var5, (SubLObject)module0273.UNPROVIDED);
            final SubLObject var8 = module0202.f12834(var5, (SubLObject)module0273.UNPROVIDED);
            final SubLObject var9 = module0202.f12835(var5, (SubLObject)module0273.UNPROVIDED);
            SubLObject var10 = (SubLObject)module0273.NIL;
            SubLObject var11 = (SubLObject)module0273.$ic17$;
            final SubLObject var12 = var2;
            if (var12.eql((SubLObject)module0273.$ic2$)) {
                var10 = f18023(var7, var8, var9, var6);
                if (module0273.NIL != var10) {
                    var11 = PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic248$, new SubLObject[] { var5, module0273.$ic249$, var6, module0038.f2888(var10, (SubLObject)module0273.$ic250$, (SubLObject)module0273.$ic251$, (SubLObject)module0273.UNPROVIDED) });
                }
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic252$, new SubLObject[] { var8, f18024(var7), var9, var6, var11 });
            }
            if (var12.eql((SubLObject)module0273.$ic8$)) {
                return (SubLObject)ConsesLow.list(module0273.$ic20$, var6, (SubLObject)ConsesLow.list(module0273.$ic9$, (SubLObject)ConsesLow.list(var7, var8, var9)));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic247$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18023(final SubLObject var52, final SubLObject var163, final SubLObject var165, SubLObject var14) {
        if (var14 == module0273.UNPROVIDED) {
            var14 = (SubLObject)module0273.NIL;
        }
        if (module0273.NIL == module0244.f15734(var52)) {
            return (SubLObject)module0273.NIL;
        }
        final SubLObject var166 = module0137.f8955(var52);
        if (module0273.NIL != module0244.f15768(var166)) {
            return module0252.f16350(var166, var163, var165, var14, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED);
        }
        return module0254.f16496(var166, var163, var165, var14, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED);
    }
    
    public static SubLObject f18024(final SubLObject var52) {
        SubLObject var53 = (SubLObject)module0273.$ic253$;
        if (var52.eql(module0273.$ic126$)) {
            var53 = (SubLObject)module0273.$ic254$;
        }
        else if (var52.eql(module0273.$ic162$)) {
            var53 = (SubLObject)module0273.$ic255$;
        }
        else if (var52.eql(module0273.$ic256$)) {
            var53 = (SubLObject)module0273.$ic257$;
        }
        else if (var52.eql(module0273.$ic141$)) {
            var53 = (SubLObject)module0273.$ic258$;
        }
        else if (var52.eql(module0273.$ic142$)) {
            var53 = (SubLObject)module0273.$ic259$;
        }
        return var53;
    }
    
    public static SubLObject f18025(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic247$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic247$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var7 = module0202.f12832(var5, (SubLObject)module0273.UNPROVIDED);
            final SubLObject var8 = module0202.f12834(var5, (SubLObject)module0273.UNPROVIDED);
            final SubLObject var9 = module0202.f12835(var5, (SubLObject)module0273.UNPROVIDED);
            SubLObject var10 = (SubLObject)module0273.NIL;
            SubLObject var11 = (SubLObject)module0273.$ic17$;
            final SubLObject var12 = var2;
            if (var12.eql((SubLObject)module0273.$ic2$)) {
                var10 = f18026(var7, var8, var9, var6);
                if (module0273.NIL != var10) {
                    var11 = PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic262$, new SubLObject[] { var5, module0273.$ic263$, var6, module0038.f2888(var10, (SubLObject)module0273.$ic250$, (SubLObject)module0273.$ic251$, (SubLObject)module0273.UNPROVIDED) });
                }
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic264$, new SubLObject[] { var8, f18024(var7), var9, var6, var11 });
            }
            if (var12.eql((SubLObject)module0273.$ic8$)) {
                return (SubLObject)ConsesLow.list(module0273.$ic20$, var6, (SubLObject)ConsesLow.list(var7, var8, var9));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic247$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18026(final SubLObject var52, final SubLObject var163, final SubLObject var165, SubLObject var14) {
        if (var14 == module0273.UNPROVIDED) {
            var14 = (SubLObject)module0273.NIL;
        }
        if (module0273.NIL != module0244.f15734(var52)) {
            return module0252.f16349(module0137.f8955(var52), var163, var165, var14, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18027(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic267$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic267$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic267$);
        var7 = var4.first();
        var4 = (var8 = var4.rest());
        final SubLObject var9 = var2;
        if (var9.eql((SubLObject)module0273.$ic2$)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic268$, new SubLObject[] { var5, var6, var7 }), f17964(var8));
        }
        if (var9.eql((SubLObject)module0273.$ic8$)) {
            SubLObject var10 = (SubLObject)module0273.NIL;
            SubLObject var11 = var6;
            SubLObject var12 = (SubLObject)module0273.NIL;
            var12 = var11.first();
            while (module0273.NIL != var11) {
                var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0273.$ic126$, var5, var12), var10);
                var11 = var11.rest();
                var12 = var11.first();
            }
            return (SubLObject)ConsesLow.list(module0273.$ic20$, var7, (SubLObject)ConsesLow.list(module0273.$ic9$, reader.bq_cons(module0273.$ic269$, ConsesLow.append(var10, (SubLObject)module0273.NIL))));
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f17964(final SubLObject var26) {
        SubLObject var27 = (SubLObject)module0273.$ic17$;
        SubLObject var28 = (SubLObject)module0273.NIL;
        SubLObject var29 = (SubLObject)module0273.NIL;
        SubLObject var30 = (SubLObject)module0273.NIL;
        SubLObject var31 = var26;
        SubLObject var32 = (SubLObject)module0273.NIL;
        var32 = var31.first();
        while (module0273.NIL != var31) {
            final SubLObject var33 = var32.first();
            if (var33.eql((SubLObject)module0273.$ic149$)) {
                var28 = conses_high.second(var32);
            }
            else if (var33.eql((SubLObject)module0273.$ic270$)) {
                var30 = conses_high.second(var32);
            }
            else if (var33.eql((SubLObject)module0273.$ic271$)) {
                var29 = conses_high.second(var32);
            }
            var31 = var31.rest();
            var32 = var31.first();
        }
        if (var28.equal(var29)) {
            if (module0273.NIL != var28 && module0273.NIL != var30) {
                var27 = Sequences.cconcatenate(var27, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic272$, var28));
                var27 = Sequences.cconcatenate(var27, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic273$, var30));
            }
        }
        else {
            if (module0273.NIL != var29) {
                var27 = Sequences.cconcatenate(var27, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic272$, var29));
            }
            if (module0273.NIL != var28) {
                var27 = Sequences.cconcatenate(var27, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic274$, var28));
            }
            if (module0273.NIL != var30) {
                var27 = Sequences.cconcatenate(var27, PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic273$, var30));
            }
        }
        return var27;
    }
    
    public static SubLObject f18028(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic267$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic267$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic267$);
        var7 = var4.first();
        var4 = (var8 = var4.rest());
        final SubLObject var9 = var2;
        if (var9.eql((SubLObject)module0273.$ic2$)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic268$, new SubLObject[] { var5, var6, var7 }), f17964(var8));
        }
        if (var9.eql((SubLObject)module0273.$ic8$)) {
            SubLObject var10 = (SubLObject)module0273.NIL;
            SubLObject var11 = var6;
            SubLObject var12 = (SubLObject)module0273.NIL;
            var12 = var11.first();
            while (module0273.NIL != var11) {
                var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0273.$ic10$, var5, var12), var10);
                var11 = var11.rest();
                var12 = var11.first();
            }
            return (SubLObject)ConsesLow.list(module0273.$ic20$, var7, (SubLObject)ConsesLow.list(module0273.$ic9$, reader.bq_cons(module0273.$ic269$, ConsesLow.append(var10, (SubLObject)module0273.NIL))));
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18029(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic267$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic267$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic267$);
        var7 = var4.first();
        var4 = (var8 = var4.rest());
        final SubLObject var9 = var2;
        if (var9.eql((SubLObject)module0273.$ic2$)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic279$, new SubLObject[] { var5, var6, var7 }), f17964(var8));
        }
        if (var9.eql((SubLObject)module0273.$ic8$)) {
            SubLObject var10 = (SubLObject)module0273.NIL;
            SubLObject var11 = var6;
            SubLObject var12 = (SubLObject)module0273.NIL;
            var12 = var11.first();
            while (module0273.NIL != var11) {
                var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0273.$ic162$, var5, var12), var10);
                var11 = var11.rest();
                var12 = var11.first();
            }
            return (SubLObject)ConsesLow.list(module0273.$ic20$, var7, (SubLObject)ConsesLow.list(module0273.$ic9$, reader.bq_cons(module0273.$ic269$, ConsesLow.append(var10, (SubLObject)module0273.NIL))));
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18030(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            SubLObject var5;
            final SubLObject var4 = var5 = var1.rest();
            SubLObject var6 = (SubLObject)module0273.NIL;
            SubLObject var7 = (SubLObject)module0273.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic282$);
            var6 = var5.first();
            var5 = var5.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic282$);
            var7 = var5.first();
            var5 = var5.rest();
            if (module0273.NIL == var5) {
                if (module0273.NIL != module0035.f1997(var7)) {
                    return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic283$, var7.first(), var6);
                }
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic284$, module0038.f2888(var7, Symbols.symbol_function((SubLObject)module0273.$ic285$), (SubLObject)module0273.$ic6$, (SubLObject)module0273.$ic7$), var6);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0273.$ic282$);
            }
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18031(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            SubLObject var5;
            final SubLObject var4 = var5 = var1.rest();
            SubLObject var6 = (SubLObject)module0273.NIL;
            SubLObject var7 = (SubLObject)module0273.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic288$);
            var6 = var5.first();
            var5 = var5.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic288$);
            var7 = var5.first();
            var5 = var5.rest();
            if (module0273.NIL == var5) {
                if (module0273.NIL != module0035.f1997(var7)) {
                    return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic289$, var7.first(), var6);
                }
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic290$, module0038.f2888(var7, Symbols.symbol_function((SubLObject)module0273.$ic285$), (SubLObject)module0273.$ic6$, (SubLObject)module0273.$ic7$), var6);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0273.$ic288$);
            }
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18032(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var4 = conses_high.cadr(var1);
            final SubLObject var5 = module0202.f12832(var4, (SubLObject)module0273.UNPROVIDED);
            final SubLObject var6 = module0035.f2439(Symbols.symbol_function((SubLObject)module0273.$ic293$), var4, (SubLObject)module0273.UNPROVIDED);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic294$, var6, var5);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18033(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = conses_high.second(var1);
        final SubLObject var4 = module0202.f12832(var3, (SubLObject)module0273.UNPROVIDED);
        final SubLObject var5 = conses_high.third(var1);
        final SubLObject var6 = var2;
        if (var6.eql((SubLObject)module0273.$ic2$)) {
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic297$, var4, var5);
        }
        if (var6.eql((SubLObject)module0273.$ic8$)) {
            return (SubLObject)ConsesLow.list(module0273.$ic20$, var5, (SubLObject)ConsesLow.list(module0273.$ic298$, var4));
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18034(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = conses_high.second(var1);
        final SubLObject var4 = module0202.f12835(var3, (SubLObject)module0273.UNPROVIDED);
        final SubLObject var5 = conses_high.third(var1);
        final SubLObject var6 = var2;
        if (var6.eql((SubLObject)module0273.$ic2$)) {
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic301$, var4, var5);
        }
        if (var6.eql((SubLObject)module0273.$ic8$)) {
            return (SubLObject)ConsesLow.list(module0273.$ic20$, var5, (SubLObject)ConsesLow.list(module0273.$ic302$, var4));
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18035(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = conses_high.second(var1);
        final SubLObject var4 = conses_high.third(var1);
        final SubLObject var5 = var2;
        if (var5.eql((SubLObject)module0273.$ic2$)) {
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic305$, var4, var3);
        }
        if (var5.eql((SubLObject)module0273.$ic8$)) {
            return (SubLObject)ConsesLow.list(module0273.$ic20$, var4, (SubLObject)ConsesLow.list(module0273.$ic9$, var3));
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18036(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var4 = conses_high.cadr(var1);
            final SubLObject var5 = module0202.f12942(module0202.f12835(var4, (SubLObject)module0273.UNPROVIDED), (SubLObject)module0273.UNPROVIDED);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic308$, new SubLObject[] { Sequences.length(var5), (module0273.NIL != var5) ? module0273.$ic309$ : module0273.$ic17$, module0038.f2888(var5, Symbols.symbol_function((SubLObject)module0273.$ic285$), (SubLObject)module0273.$ic6$, (SubLObject)module0273.$ic7$) });
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18037(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var4 = module0035.caddr(var1);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic312$, var4, module0132.$g1558$.getGlobalValue());
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18038(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var4 = conses_high.second(var1);
            final SubLObject var5 = module0205.f13378(var4);
            final SubLObject var6 = conses_high.third(var1);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic315$, var5, var6);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18039(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic318$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic318$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic318$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : module0273.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0273.$ic318$);
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var9 = var2;
            if (var9.eql((SubLObject)module0273.$ic2$)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic319$, new SubLObject[] { var5, var6, var7 }), (SubLObject)((module0273.NIL != var8) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic229$, (SubLObject)((module0273.NIL != var8.rest()) ? module0273.$ic219$ : module0273.$ic220$), module0038.f2888(var8, Symbols.symbol_function((SubLObject)module0273.$ic221$), (SubLObject)module0273.$ic222$, (SubLObject)module0273.$ic223$)) : module0273.$ic17$));
            }
            if (var9.eql((SubLObject)module0273.$ic8$)) {
                final SubLObject var10 = module0279.f18489((SubLObject)ConsesLow.list(module0273.$ic126$, var5, var6), var7);
                if (module0273.NIL != var10) {
                    if (module0273.NIL != var8) {
                        return module0276.f18287((SubLObject)ConsesLow.cons(var10, var8), (SubLObject)module0273.UNPROVIDED);
                    }
                    return var10;
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic318$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18040(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        SubLObject var8 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic322$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic322$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic322$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic322$);
        var8 = var4.first();
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : module0273.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0273.$ic322$);
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var10 = var2;
            if (var10.eql((SubLObject)module0273.$ic2$)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic323$, new SubLObject[] { var6, var5, var7, var8 }), (SubLObject)((module0273.NIL != var9) ? PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic229$, (SubLObject)((module0273.NIL != var9.rest()) ? module0273.$ic219$ : module0273.$ic220$), module0038.f2888(var9, Symbols.symbol_function((SubLObject)module0273.$ic221$), (SubLObject)module0273.$ic222$, (SubLObject)module0273.$ic223$)) : module0273.$ic17$));
            }
            if (var10.eql((SubLObject)module0273.$ic8$)) {
                final SubLObject var11 = module0279.f18489((SubLObject)ConsesLow.list(var6, var5, var7), var8);
                if (module0273.NIL != var11 && module0273.NIL != var9) {
                    return module0276.f18287((SubLObject)ConsesLow.cons(var11, var9), (SubLObject)module0273.UNPROVIDED);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic322$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18041(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic326$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18042(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (!var3.eql((SubLObject)module0273.$ic2$)) {
            return (SubLObject)module0273.NIL;
        }
        final SubLObject var4 = conses_high.second(var1);
        final SubLObject var5 = conses_high.third(var1);
        final SubLObject var6 = conses_high.fourth(var1);
        final SubLObject var7 = (SubLObject)(var6.isCons() ? module0035.f2399(module0036.f2532(module0036.f2531(var6, Symbols.symbol_function((SubLObject)module0273.$ic329$), Symbols.symbol_function((SubLObject)module0273.$ic330$), (SubLObject)module0273.UNPROVIDED), Symbols.symbol_function((SubLObject)module0273.$ic331$), Symbols.symbol_function((SubLObject)module0273.$ic332$), (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED), Symbols.symbol_function((SubLObject)module0273.$ic329$), (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED, (SubLObject)module0273.UNPROVIDED) : module0273.NIL);
        final SubLObject var8 = (SubLObject)(var7.isCons() ? Functions.apply(Symbols.symbol_function((SubLObject)module0273.$ic333$), var7) : module0273.NIL);
        if (var8.isInteger() && module0273.NIL != module0202.f12729(var4, var8, (SubLObject)module0273.UNPROVIDED)) {
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic334$, new SubLObject[] { var4, module0202.f12725(var4, (SubLObject)module0273.UNPROVIDED), var5, var8, module0303.f20123(var8) });
        }
        return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic335$, new SubLObject[] { var4, var5, var6 });
    }
    
    public static SubLObject f18043(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic338$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18044(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = conses_high.second(var1);
        final SubLObject var4 = var2;
        if (var4.eql((SubLObject)module0273.$ic2$)) {
            return Sequences.cconcatenate(module0006.f205(var3), new SubLObject[] { module0273.$ic341$, module0006.$g11$.getGlobalValue(), module0006.$g11$.getGlobalValue() });
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18045(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var4 = conses_high.second(var1);
            final SubLObject var5 = conses_high.third(var1);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic344$, var4, var5);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18046(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var4 = conses_high.second(var1);
            final SubLObject var5 = conses_high.third(var1);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic347$, var5, var4);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18047(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var4 = conses_high.second(var1);
            final SubLObject var5 = conses_high.third(var1);
            final SubLObject var6 = conses_high.fourth(var1);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic350$, new SubLObject[] { var4, var5, var6 });
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18048(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var4 = conses_high.second(var1);
            final SubLObject var5 = conses_high.third(var1);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic353$, new SubLObject[] { var4, var5, var4 });
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18049(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var4 = conses_high.second(var1);
            final SubLObject var5 = conses_high.third(var1);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic356$, var4, var5);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18050(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var4 = conses_high.second(var1);
            final SubLObject var5 = module0205.f13203(var4, (SubLObject)module0273.UNPROVIDED);
            final SubLObject var6 = conses_high.third(var1);
            final SubLObject var7 = conses_high.fourth(var1);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic359$, new SubLObject[] { var6, var5, var7 });
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18051(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            final SubLObject var4 = conses_high.second(var1);
            final SubLObject var5 = conses_high.third(var1);
            final SubLObject var6 = conses_high.fourth(var1);
            return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic362$, new SubLObject[] { var4, var5, module0038.f2888(var6, (SubLObject)module0273.$ic5$, (SubLObject)module0273.$ic6$, (SubLObject)module0273.$ic7$) });
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18052(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            SubLObject var5;
            final SubLObject var4 = var5 = var1.rest();
            SubLObject var6 = (SubLObject)module0273.NIL;
            SubLObject var7 = (SubLObject)module0273.NIL;
            SubLObject var8 = (SubLObject)module0273.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic365$);
            var6 = var5.first();
            var5 = var5.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic365$);
            var7 = var5.first();
            var5 = var5.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic365$);
            var8 = var5.first();
            var5 = var5.rest();
            if (module0273.NIL == var5) {
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic366$, new SubLObject[] { var6, var7, var8 });
            }
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0273.$ic365$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18053(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            SubLObject var5;
            final SubLObject var4 = var5 = var1.rest();
            SubLObject var6 = (SubLObject)module0273.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic369$);
            var6 = var5.first();
            var5 = var5.rest();
            if (module0273.NIL == var5) {
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic370$, var6);
            }
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0273.$ic369$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18054(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        final SubLObject var3 = var2;
        if (var3.eql((SubLObject)module0273.$ic2$)) {
            SubLObject var5;
            final SubLObject var4 = var5 = var1.rest();
            SubLObject var6 = (SubLObject)module0273.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0273.$ic369$);
            var6 = var5.first();
            var5 = var5.rest();
            if (module0273.NIL == var5) {
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic373$, var6);
            }
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0273.$ic369$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18055(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        SubLObject var6 = (SubLObject)module0273.NIL;
        SubLObject var7 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic376$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic376$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic376$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var8 = var2;
            if (var8.eql((SubLObject)module0273.$ic2$)) {
                if (module0273.NIL != var7) {
                    return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic377$, var6, var5);
                }
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic378$, var6, var5);
            }
            else if (var8.eql((SubLObject)module0273.$ic8$)) {
                if (module0273.NIL != var7) {
                    final SubLObject var9 = module0205.f13333(var6);
                    if (module0273.NIL != module0226.f14820(var9)) {
                        return (SubLObject)ConsesLow.list(module0273.$ic269$, (SubLObject)ConsesLow.list(module0273.$ic379$, var9), (SubLObject)ConsesLow.list(module0273.$ic380$, var9, var5), (SubLObject)ConsesLow.list(module0273.$ic381$, var5));
                    }
                    if (module0273.NIL != module0226.f14825(var6)) {
                        final SubLObject var10 = module0205.f13388(var6, (SubLObject)module0273.UNPROVIDED);
                        return (SubLObject)ConsesLow.list(module0273.$ic269$, (SubLObject)ConsesLow.list(module0273.$ic382$, var10), (SubLObject)ConsesLow.list(module0273.$ic383$, var10, var5), (SubLObject)ConsesLow.list(module0273.$ic381$, var5));
                    }
                }
                return (SubLObject)ConsesLow.list(module0273.$ic381$, var5);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic376$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18056(final SubLObject var1, SubLObject var2) {
        if (var2 == module0273.UNPROVIDED) {
            var2 = (SubLObject)module0273.$ic2$;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0273.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0273.$ic386$);
        var5 = var4.first();
        var4 = var4.rest();
        if (module0273.NIL == var4) {
            final SubLObject var6 = var2;
            if (var6.eql((SubLObject)module0273.$ic2$)) {
                return PrintLow.format((SubLObject)module0273.NIL, (SubLObject)module0273.$ic387$, var5);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0273.$ic386$);
        }
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18057() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17958", "S#20511", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17959", "S#20512", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17960", "S#20513", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17961", "S#20514", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17962", "S#20515", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17963", "S#20516", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17965", "S#20517", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17966", "S#20518", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17967", "S#20519", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17968", "S#20520", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17969", "S#20521", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17970", "S#20522", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17971", "S#20523", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17972", "S#20524", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17973", "S#20525", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17974", "S#20526", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17975", "S#20527", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17976", "S#20528", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17977", "S#20529", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17978", "S#20530", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17979", "S#20531", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17980", "S#20532", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17981", "S#20533", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17982", "S#20534", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17983", "S#20535", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17984", "S#20536", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17985", "S#20537", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17986", "S#20538", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17987", "S#20539", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17988", "S#20540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17989", "S#20541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17990", "S#20542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17991", "S#20543", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17992", "S#20544", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17993", "S#20545", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17994", "S#20546", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17995", "S#20547", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17996", "S#20548", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17997", "S#20549", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17998", "S#20550", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17999", "S#20551", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18000", "S#20552", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18001", "S#20553", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18002", "S#20554", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18003", "S#20555", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18004", "S#20556", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18005", "S#20557", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18006", "S#20558", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18007", "S#20559", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18008", "S#20560", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18009", "S#20561", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18010", "S#20562", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18011", "S#20563", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18012", "S#20564", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18013", "S#20565", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18014", "S#20566", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18015", "S#20567", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18016", "S#20568", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18017", "S#20569", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18018", "S#20570", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18019", "S#20571", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18020", "S#20572", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18021", "S#20573", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18022", "S#20574", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18023", "S#20575", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18024", "S#20576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18025", "S#20577", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18026", "S#20578", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18027", "S#20579", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f17964", "S#20580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18028", "S#20581", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18029", "S#20582", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18030", "S#20583", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18031", "S#20584", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18032", "S#20585", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18033", "S#20586", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18034", "S#20587", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18035", "S#20588", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18036", "S#20589", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18037", "S#20590", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18038", "S#20591", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18039", "S#20592", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18040", "S#20593", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18041", "S#20594", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18042", "S#20595", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18043", "S#20596", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18044", "S#20597", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18045", "S#20598", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18046", "S#20599", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18047", "S#20600", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18048", "S#20601", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18049", "S#20602", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18050", "S#20603", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18051", "S#20604", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18052", "S#20605", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18053", "S#20606", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18054", "S#20607", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18055", "S#20608", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0273", "f18056", "S#20609", 1, 1, false);
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18058() {
        module0273.$g2583$ = SubLFiles.deflexical("S#20610", (SubLObject)module0273.NIL);
        return (SubLObject)module0273.NIL;
    }
    
    public static SubLObject f18059() {
        module0272.f17952((SubLObject)module0273.$ic0$, (SubLObject)module0273.$ic1$);
        module0272.f17952((SubLObject)module0273.$ic12$, (SubLObject)module0273.$ic13$);
        module0272.f17952((SubLObject)module0273.$ic23$, (SubLObject)module0273.$ic24$);
        module0272.f17952((SubLObject)module0273.$ic27$, (SubLObject)module0273.$ic28$);
        module0272.f17952((SubLObject)module0273.$ic30$, (SubLObject)module0273.$ic31$);
        module0272.f17952((SubLObject)module0273.$ic34$, (SubLObject)module0273.$ic35$);
        module0272.f17952((SubLObject)module0273.$ic40$, (SubLObject)module0273.$ic41$);
        module0272.f17952((SubLObject)module0273.$ic44$, (SubLObject)module0273.$ic45$);
        module0272.f17952((SubLObject)module0273.$ic54$, (SubLObject)module0273.$ic55$);
        module0272.f17952((SubLObject)module0273.$ic58$, (SubLObject)module0273.$ic59$);
        module0272.f17952((SubLObject)module0273.$ic62$, (SubLObject)module0273.$ic63$);
        module0272.f17952((SubLObject)module0273.$ic65$, (SubLObject)module0273.$ic66$);
        module0272.f17952((SubLObject)module0273.$ic68$, (SubLObject)module0273.$ic69$);
        module0272.f17952((SubLObject)module0273.$ic71$, (SubLObject)module0273.$ic72$);
        module0272.f17952((SubLObject)module0273.$ic74$, (SubLObject)module0273.$ic75$);
        module0272.f17952((SubLObject)module0273.$ic78$, (SubLObject)module0273.$ic79$);
        module0272.f17952((SubLObject)module0273.$ic84$, (SubLObject)module0273.$ic85$);
        module0272.f17952((SubLObject)module0273.$ic87$, (SubLObject)module0273.$ic88$);
        module0272.f17952((SubLObject)module0273.$ic90$, (SubLObject)module0273.$ic91$);
        module0272.f17952((SubLObject)module0273.$ic103$, (SubLObject)module0273.$ic104$);
        module0272.f17952((SubLObject)module0273.$ic106$, (SubLObject)module0273.$ic107$);
        module0272.f17952((SubLObject)module0273.$ic109$, (SubLObject)module0273.$ic110$);
        module0272.f17952((SubLObject)module0273.$ic112$, (SubLObject)module0273.$ic113$);
        module0272.f17952((SubLObject)module0273.$ic117$, (SubLObject)module0273.$ic118$);
        module0272.f17952((SubLObject)module0273.$ic120$, (SubLObject)module0273.$ic121$);
        module0272.f17952((SubLObject)module0273.$ic127$, (SubLObject)module0273.$ic128$);
        module0272.f17952((SubLObject)module0273.$ic130$, (SubLObject)module0273.$ic131$);
        module0272.f17952((SubLObject)module0273.$ic158$, (SubLObject)module0273.$ic159$);
        module0272.f17952((SubLObject)module0273.$ic160$, (SubLObject)module0273.$ic161$);
        module0272.f17952((SubLObject)module0273.$ic164$, (SubLObject)module0273.$ic165$);
        module0272.f17952((SubLObject)module0273.$ic166$, (SubLObject)module0273.$ic167$);
        module0272.f17952((SubLObject)module0273.$ic169$, (SubLObject)module0273.$ic170$);
        module0272.f17952((SubLObject)module0273.$ic171$, (SubLObject)module0273.$ic172$);
        module0272.f17952((SubLObject)module0273.$ic174$, (SubLObject)module0273.$ic175$);
        module0272.f17952((SubLObject)module0273.$ic179$, (SubLObject)module0273.$ic180$);
        module0272.f17952((SubLObject)module0273.$ic183$, (SubLObject)module0273.$ic184$);
        module0272.f17952((SubLObject)module0273.$ic188$, (SubLObject)module0273.$ic189$);
        module0272.f17952((SubLObject)module0273.$ic192$, (SubLObject)module0273.$ic193$);
        module0272.f17952((SubLObject)module0273.$ic195$, (SubLObject)module0273.$ic196$);
        module0272.f17952((SubLObject)module0273.$ic198$, (SubLObject)module0273.$ic199$);
        module0272.f17952((SubLObject)module0273.$ic202$, (SubLObject)module0273.$ic203$);
        module0272.f17952((SubLObject)module0273.$ic206$, (SubLObject)module0273.$ic207$);
        module0272.f17952((SubLObject)module0273.$ic211$, (SubLObject)module0273.$ic212$);
        module0272.f17952((SubLObject)module0273.$ic224$, (SubLObject)module0273.$ic225$);
        module0272.f17952((SubLObject)module0273.$ic230$, (SubLObject)module0273.$ic231$);
        module0272.f17952((SubLObject)module0273.$ic237$, (SubLObject)module0273.$ic238$);
        module0272.f17952((SubLObject)module0273.$ic245$, (SubLObject)module0273.$ic246$);
        module0272.f17952((SubLObject)module0273.$ic260$, (SubLObject)module0273.$ic261$);
        module0272.f17952((SubLObject)module0273.$ic265$, (SubLObject)module0273.$ic266$);
        module0272.f17952((SubLObject)module0273.$ic275$, (SubLObject)module0273.$ic276$);
        module0272.f17952((SubLObject)module0273.$ic277$, (SubLObject)module0273.$ic278$);
        module0272.f17952((SubLObject)module0273.$ic280$, (SubLObject)module0273.$ic281$);
        module0272.f17952((SubLObject)module0273.$ic286$, (SubLObject)module0273.$ic287$);
        module0272.f17952((SubLObject)module0273.$ic291$, (SubLObject)module0273.$ic292$);
        module0272.f17952((SubLObject)module0273.$ic295$, (SubLObject)module0273.$ic296$);
        module0272.f17952((SubLObject)module0273.$ic299$, (SubLObject)module0273.$ic300$);
        module0272.f17952((SubLObject)module0273.$ic303$, (SubLObject)module0273.$ic304$);
        module0272.f17952((SubLObject)module0273.$ic306$, (SubLObject)module0273.$ic307$);
        module0272.f17952((SubLObject)module0273.$ic310$, (SubLObject)module0273.$ic311$);
        module0272.f17952((SubLObject)module0273.$ic313$, (SubLObject)module0273.$ic314$);
        module0272.f17952((SubLObject)module0273.$ic316$, (SubLObject)module0273.$ic317$);
        module0272.f17952((SubLObject)module0273.$ic320$, (SubLObject)module0273.$ic321$);
        module0272.f17952((SubLObject)module0273.$ic324$, (SubLObject)module0273.$ic325$);
        module0272.f17952((SubLObject)module0273.$ic327$, (SubLObject)module0273.$ic328$);
        module0272.f17952((SubLObject)module0273.$ic336$, (SubLObject)module0273.$ic337$);
        module0272.f17952((SubLObject)module0273.$ic339$, (SubLObject)module0273.$ic340$);
        module0272.f17952((SubLObject)module0273.$ic342$, (SubLObject)module0273.$ic343$);
        module0272.f17952((SubLObject)module0273.$ic345$, (SubLObject)module0273.$ic346$);
        module0272.f17952((SubLObject)module0273.$ic348$, (SubLObject)module0273.$ic349$);
        module0272.f17952((SubLObject)module0273.$ic351$, (SubLObject)module0273.$ic352$);
        module0272.f17952((SubLObject)module0273.$ic354$, (SubLObject)module0273.$ic355$);
        module0272.f17952((SubLObject)module0273.$ic357$, (SubLObject)module0273.$ic358$);
        module0272.f17952((SubLObject)module0273.$ic360$, (SubLObject)module0273.$ic361$);
        module0272.f17952((SubLObject)module0273.$ic363$, (SubLObject)module0273.$ic364$);
        module0272.f17952((SubLObject)module0273.$ic367$, (SubLObject)module0273.$ic368$);
        module0272.f17952((SubLObject)module0273.$ic371$, (SubLObject)module0273.$ic372$);
        module0272.f17952((SubLObject)module0273.$ic374$, (SubLObject)module0273.$ic375$);
        module0272.f17952((SubLObject)module0273.$ic384$, (SubLObject)module0273.$ic385$);
        return (SubLObject)module0273.NIL;
    }
    
    public void declareFunctions() {
        f18057();
    }
    
    public void initializeVariables() {
        f18058();
    }
    
    public void runTopLevelForms() {
        f18059();
    }
    
    static {
        me = (SubLFile)new module0273();
        module0273.$g2583$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("INVALID-VARIABLES");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20511", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence has at least one variable which is not a valid variable name."));
        $ic2$ = SubLObjectFactory.makeKeyword("NL");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#62", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"));
        $ic4$ = SubLObjectFactory.makeString("Sentence ~s contains invalid variable~P: ~a ~% which do~[~;es~:;~] not satisfy the regular expression ~a~%");
        $ic5$ = SubLObjectFactory.makeSymbol("S#3851", "CYC");
        $ic6$ = SubLObjectFactory.makeString(", ");
        $ic7$ = SubLObjectFactory.makeString(", and ");
        $ic8$ = SubLObjectFactory.makeKeyword("HL");
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("not"));
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic11$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLVariable")));
        $ic12$ = SubLObjectFactory.makeKeyword("INVALID-SENTENCE");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20512", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("Not a well-formed sentence."));
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic15$ = SubLObjectFactory.makeString("~s is not a well-formed sentence in ~s.~%");
        $ic16$ = SubLObjectFactory.makeString("Perhaps ~s is insufficiently defined in mt ~s.~%");
        $ic17$ = SubLObjectFactory.makeString("");
        $ic18$ = SubLObjectFactory.makeString("~s is not a well-formed sentence.~%");
        $ic19$ = SubLObjectFactory.makeString("Perhaps ~s is insufficiently defined.~%");
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic21$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("admittedSentence"));
        $ic22$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $ic23$ = SubLObjectFactory.makeKeyword("NOT-AN-ASCII-STRING");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20513", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence references a non-ASCII string."));
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $ic26$ = SubLObjectFactory.makeString("String ~s contains non-ASCII characters.~%");
        $ic27$ = SubLObjectFactory.makeKeyword("MAL-FORTS");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20514", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence references invalid (undefined) Forts."));
        $ic29$ = SubLObjectFactory.makeString("References invalid forts: ~a.~%");
        $ic30$ = SubLObjectFactory.makeKeyword("MAL-FORT");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20515", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence references an invalid (undefined) Fort."));
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"));
        $ic33$ = SubLObjectFactory.makeString("FORT ~s is invalid.~%");
        $ic34$ = SubLObjectFactory.makeKeyword("MAL-ARITY");
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20516", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The arity of a predicate is a Non-Negative Integer."));
        $ic36$ = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("S#20611", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17572", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ARITY"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"));
        $ic37$ = SubLObjectFactory.makeString("The ~s of ~s should be a #$NonNegativeInteger is ~s.~%");
        $ic38$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg2Isa"));
        $ic39$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("NonNegativeInteger")));
        $ic40$ = SubLObjectFactory.makeKeyword("ARITY-MISMATCH");
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20517", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The number of arguments applied to the relation in the sentence was different than the number of arguments it expected"));
        $ic42$ = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17572", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#669", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20612", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20613", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"));
        $ic43$ = SubLObjectFactory.makeString("Arity mismatch in ~A: ~A is a(n) ~A, so it expects ~D argument~:P, but it is being applied to ~D argument~:P.~%");
        $ic44$ = SubLObjectFactory.makeKeyword("VIOLATED-ARITY");
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20518", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains use of a predicate which does not conform to the arity of the relation."));
        $ic46$ = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("S#20611", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17572", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ARITY"), (SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"));
        $ic47$ = SubLObjectFactory.makeString("The ~s of ~s is ~s.~%");
        $ic48$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("arityMin"));
        $ic49$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("greaterThanOrEqualTo"));
        $ic50$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("FormulaArityFn"));
        $ic51$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Quote"));
        $ic52$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("arityMax"));
        $ic53$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $ic54$ = SubLObjectFactory.makeKeyword("MISSING-ARITY");
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20519", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence uses a relation whose arity has not yet been defined."));
        $ic56$ = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("S#17572", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ARITY"), (SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"));
        $ic57$ = SubLObjectFactory.makeString("The arity of ~s is unknown.~%");
        $ic58$ = SubLObjectFactory.makeKeyword("MALFORMED-ARGS");
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20520", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The relation got malformed argument list"));
        $ic60$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#669", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17572", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic61$ = SubLObjectFactory.makeString("The ~A ~A got the malformed argument list ~%~A.~%");
        $ic62$ = SubLObjectFactory.makeKeyword("NOT-A-DENOTATIONAL-TERM");
        $ic63$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20521", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is not a denotational term"));
        $ic64$ = SubLObjectFactory.makeString("~A is not a denotational term.~%");
        $ic65$ = SubLObjectFactory.makeKeyword("NOT-A-TRUTH-FUNCTION");
        $ic66$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20522", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is not a truth function in its arg0 position"));
        $ic67$ = SubLObjectFactory.makeString("Did not recognize ~A as a truth function (predicate, quantifier, or logical operator).~%");
        $ic68$ = SubLObjectFactory.makeKeyword("NOT-AN-EL-FORMULA");
        $ic69$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20523", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The formula given was not a EL formula"));
        $ic70$ = SubLObjectFactory.makeString("~A is not an EL formula, and is not #$True, #$False, or an EL variable.~%");
        $ic71$ = SubLObjectFactory.makeKeyword("NOT-AN-EL-VARIABLE");
        $ic72$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20524", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence does not contain an EL variable where an EL variable is expected"));
        $ic73$ = SubLObjectFactory.makeString("~A is not an EL variable.~%");
        $ic74$ = SubLObjectFactory.makeKeyword("SEQUENCE-NON-VAR");
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20525", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The formula contains an ill-formed sequence variable syntax"));
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"));
        $ic77$ = SubLObjectFactory.makeString("~A contains ill-formed sequence variable syntax; ~A is not a variable.~%");
        $ic78$ = SubLObjectFactory.makeKeyword("EXPAND-SUBL-FN-IRRELEVANT-TERM-IN-ARG1");
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20526", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence has (#$ExpandSubLFn SUBL-LIST-CONTAINING-NON-VARIABLE SUBL) where SUBL does not mention the non-variables in SUBL-LIST-CONTAINING-NON-VARIABLE."));
        $ic80$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20614", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20615", "CYC"));
        $ic81$ = SubLObjectFactory.makeString("Sentence ~s ~%has #$ExpandSubLFn formula ~s, ~%which contains the term~P ~a in arg1 ~s ~%not mentioned in its arg2 ~s.~%");
        $ic82$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSubL"));
        $ic83$ = SubLObjectFactory.makeSymbol("TREE-FIND");
        $ic84$ = SubLObjectFactory.makeKeyword("INVALID-MT");
        $ic85$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20527", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The Mt specified for the sentence is not a #$Microtheory."));
        $ic86$ = SubLObjectFactory.makeString("Mt ~s is invalid.~%");
        $ic87$ = SubLObjectFactory.makeKeyword("MAL-FN-NESTING");
        $ic88$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20528", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a function term whose nesting levels exceeds the allowed limit."));
        $ic89$ = SubLObjectFactory.makeString("Term ~s~%     has ~s nesting levels but only ~s are permitted.~%");
        $ic90$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-IFF-DEFN");
        $ic91$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20530", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates #$defnIff of some collection."));
        $ic92$ = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("S#202", "CYC"), new SubLObject[] { SubLObjectFactory.makeSymbol("S#12457", "CYC"), SubLObjectFactory.makeSymbol("S#20616", "CYC"), SubLObjectFactory.makeSymbol("S#12455", "CYC"), SubLObjectFactory.makeSymbol("DEFNS"), SubLObjectFactory.makeSymbol("S#11445", "CYC"), SubLObjectFactory.makeSymbol("S#1625", "CYC") });
        $ic93$ = SubLObjectFactory.makeKeyword("VIA-GENL-PRED");
        $ic94$ = SubLObjectFactory.makeKeyword("VIA-GENL-INVERSE");
        $ic95$ = SubLObjectFactory.makeString("Term ~s~%violates ~s ~s~%of collection ~s~%");
        $ic96$ = SubLObjectFactory.makeString("applicable to arg ~s of ~s~%");
        $ic97$ = SubLObjectFactory.makeString("(via ~s)~%");
        $ic98$ = SubLObjectFactory.makeString("in mt ~s.~%");
        $ic99$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("False"));
        $ic100$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EvaluateSubLFn"));
        $ic101$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn"));
        $ic102$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("defnIff"));
        $ic103$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-QUOTED-IFF-DEFN");
        $ic104$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20531", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates #$quotedDefnIff of some collection."));
        $ic105$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedDefnIff"));
        $ic106$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-SUF-DEFNS");
        $ic107$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20532", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The formula contains a term which violates #$defnSufficient of some Collection."));
        $ic108$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("defnSufficient"));
        $ic109$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-QUOTED-SUF-DEFNS");
        $ic110$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20533", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The formula contains a term which violates #$quotedDefnSufficient of some Collection."));
        $ic111$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedDefnSufficient"));
        $ic112$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-NEC-DEFN");
        $ic113$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20535", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates #$defnNecessary of some Collection."));
        $ic114$ = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("S#202", "CYC"), new SubLObject[] { SubLObjectFactory.makeSymbol("S#12457", "CYC"), SubLObjectFactory.makeSymbol("S#20616", "CYC"), SubLObjectFactory.makeSymbol("S#12455", "CYC"), SubLObjectFactory.makeSymbol("S#20617", "CYC"), SubLObjectFactory.makeSymbol("S#12453", "CYC"), SubLObjectFactory.makeSymbol("S#11445", "CYC"), SubLObjectFactory.makeSymbol("S#1625", "CYC") });
        $ic115$ = SubLObjectFactory.makeString("Term ~s~%violates ~s ~s (~s)~%of collection ~s~%");
        $ic116$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("defnNecessary"));
        $ic117$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-QUOTED-NEC-DEFN");
        $ic118$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20536", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates #$quotedDefnNecessary of some Collection."));
        $ic119$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedDefnNecessary"));
        $ic120$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-COL-DEFN");
        $ic121$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20538", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates defns of argIsa to some Collection."));
        $ic122$ = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("S#202", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#891", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20618", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"));
        $ic123$ = SubLObjectFactory.makeString("Term ~s violates defns of ~a ~s~%");
        $ic124$ = SubLObjectFactory.makeString("applicable to argument ~s of relation ~s~%");
        $ic125$ = SubLObjectFactory.makeString("arg-isa");
        $ic126$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic127$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-COL-QUOTED-DEFN");
        $ic128$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20539", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates quoted-defns of argQuotedIsa to some Collection."));
        $ic129$ = SubLObjectFactory.makeString("arg-quoted-isa");
        $ic130$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-ISA");
        $ic131$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20550", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates argIsa constraint."));
        $ic132$ = SubLObjectFactory.makeKeyword("ARG-ISA");
        $ic133$ = SubLObjectFactory.makeKeyword("ARG-NOT-ISA");
        $ic134$ = SubLObjectFactory.makeString("arg-not-isa");
        $ic135$ = SubLObjectFactory.makeKeyword("ARG-QUOTED-ISA");
        $ic136$ = SubLObjectFactory.makeKeyword("ARG-GENLS");
        $ic137$ = SubLObjectFactory.makeString("arg-genls");
        $ic138$ = SubLObjectFactory.makeString("isa-disjoint");
        $ic139$ = SubLObjectFactory.makeString("quoted-isa-disjoint");
        $ic140$ = SubLObjectFactory.makeString("disjoint");
        $ic141$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic142$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic143$ = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("S#202", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12457", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20618", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"));
        $ic144$ = SubLObjectFactory.makeString("Term ~s violates ~a ~s~%");
        $ic145$ = SubLObjectFactory.makeString("Term ~s is ~a with ~a ~s~%");
        $ic146$ = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("S#20462", "CYC"), new SubLObject[] { SubLObjectFactory.makeSymbol("S#202", "CYC"), SubLObjectFactory.makeSymbol("S#12457", "CYC"), SubLObjectFactory.makeSymbol("S#20618", "CYC"), SubLObjectFactory.makeSymbol("S#12455", "CYC"), SubLObjectFactory.makeSymbol("S#11445", "CYC"), SubLObjectFactory.makeSymbol("S#1625", "CYC") });
        $ic147$ = SubLObjectFactory.makeString("Term ~s violates arg-isa ~s~%");
        $ic148$ = SubLObjectFactory.makeKeyword("AT-CONSTRAINT-GAF");
        $ic149$ = SubLObjectFactory.makeKeyword("WFF-FORMULA");
        $ic150$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $ic151$ = SubLObjectFactory.makeKeyword("ARGUMENTS");
        $ic152$ = SubLObjectFactory.makeKeyword("GENLPREDS");
        $ic153$ = SubLObjectFactory.makeKeyword("EXPLANATION");
        $ic154$ = SubLObjectFactory.makeKeyword("CONSEQUENCE");
        $ic155$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("rejectedSentence"));
        $ic156$ = SubLObjectFactory.makeKeyword("JUSTIFICATION");
        $ic157$ = SubLObjectFactory.makeKeyword("CANDIDATE-REPAIRS");
        $ic158$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-QUOTED-ISA");
        $ic159$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20552", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates argQuotedIsa constraint."));
        $ic160$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-GENL");
        $ic161$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20553", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates a argGenl constraint."));
        $ic162$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic163$ = SubLObjectFactory.makeString("Term ~s violates arg-genls ~s~%");
        $ic164$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-NOT-ISA");
        $ic165$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20555", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is an instance of a collection specified to be an argNotIsa."));
        $ic166$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT");
        $ic167$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20557", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is disjoint with the argIsa constraint."));
        $ic168$ = SubLObjectFactory.makeString("Term ~s is isa-disjoint with arg-isa ~s~%");
        $ic169$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT");
        $ic170$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20559", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is disjoint with the argQuotedIsa constraint."));
        $ic171$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT");
        $ic172$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20560", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term (NAT..) which is disjoint with the argGenl contraint."));
        $ic173$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $ic174$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA");
        $ic175$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20561", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is violates interArgIsa constraints."));
        $ic176$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#202", "CYC"), SubLObjectFactory.makeSymbol("S#12457", "CYC"), SubLObjectFactory.makeSymbol("S#20618", "CYC"), SubLObjectFactory.makeSymbol("S#12455", "CYC"), SubLObjectFactory.makeSymbol("S#20619", "CYC"), SubLObjectFactory.makeSymbol("S#20620", "CYC"), SubLObjectFactory.makeSymbol("S#20621", "CYC"), SubLObjectFactory.makeSymbol("S#11445", "CYC"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("S#20622", "CYC") });
        $ic177$ = SubLObjectFactory.makeString("Term ~s violates inter-arg-isa ~s~%");
        $ic178$ = SubLObjectFactory.makeString("when argument ~s, ~s, isa ~s~%");
        $ic179$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA");
        $ic180$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20562", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is violates interArgNotIsa constraints."));
        $ic181$ = SubLObjectFactory.makeString("Term ~s violates inter-arg-not-isa ~s~%");
        $ic182$ = SubLObjectFactory.makeString("when argument ~s, ~s, not isa ~s~%");
        $ic183$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-GENL");
        $ic184$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20563", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates interArgGenl constraints."));
        $ic185$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#202", "CYC"), SubLObjectFactory.makeSymbol("S#12457", "CYC"), SubLObjectFactory.makeSymbol("S#20618", "CYC"), SubLObjectFactory.makeSymbol("S#12455", "CYC"), SubLObjectFactory.makeSymbol("S#20623", "CYC"), SubLObjectFactory.makeSymbol("S#20620", "CYC"), SubLObjectFactory.makeSymbol("S#20621", "CYC"), SubLObjectFactory.makeSymbol("S#11445", "CYC"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("S#20622", "CYC") });
        $ic186$ = SubLObjectFactory.makeString("Term ~s violates inter-arg-genl ~s~%");
        $ic187$ = SubLObjectFactory.makeString("when argument ~s, ~s, genl ~s~%");
        $ic188$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-DEFN");
        $ic189$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20564", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic190$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#202", "CYC"), SubLObjectFactory.makeSymbol("S#891", "CYC"), SubLObjectFactory.makeSymbol("S#20618", "CYC"), SubLObjectFactory.makeSymbol("S#12455", "CYC"), SubLObjectFactory.makeSymbol("S#20619", "CYC"), SubLObjectFactory.makeSymbol("S#20620", "CYC"), SubLObjectFactory.makeSymbol("S#20621", "CYC"), SubLObjectFactory.makeSymbol("S#11445", "CYC"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("S#20622", "CYC") });
        $ic191$ = SubLObjectFactory.makeString("Term ~s violates defns of inter-arg-isa ~s~%");
        $ic192$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-DEFN");
        $ic193$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20565", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic194$ = SubLObjectFactory.makeString("Term ~s violates defns of inter-arg-not-isa ~s~%");
        $ic195$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT");
        $ic196$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20566", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term (NAT..) which is disjoint with the interArgIsa constraint."));
        $ic197$ = SubLObjectFactory.makeString("Term ~s is isa-disjoint with inter-arg-isa ~s~%");
        $ic198$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT");
        $ic199$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20567", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term (NAT...) which is disjoint with the interArgGenl constraint."));
        $ic200$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#202", "CYC"), SubLObjectFactory.makeSymbol("S#891", "CYC"), SubLObjectFactory.makeSymbol("S#20618", "CYC"), SubLObjectFactory.makeSymbol("S#12455", "CYC"), SubLObjectFactory.makeSymbol("S#20623", "CYC"), SubLObjectFactory.makeSymbol("S#20620", "CYC"), SubLObjectFactory.makeSymbol("S#20621", "CYC"), SubLObjectFactory.makeSymbol("S#11445", "CYC"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("S#20622", "CYC") });
        $ic201$ = SubLObjectFactory.makeString("Term ~s is genl-disjoint with inter-arg-genl ~s~%");
        $ic202$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA-GENL");
        $ic203$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20568", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term (NAT...) which violates the interArgIsaGenl constraint."));
        $ic204$ = SubLObjectFactory.makeString("Term ~s is not a spec of ~s, violating inter-arg-isa-genl constraint~%");
        $ic205$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl"));
        $ic206$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-GENL-ISA");
        $ic207$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20569", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term (NAT...) which violates the interArgGenlIsa constraint."));
        $ic208$ = SubLObjectFactory.makeString("Term ~s is not an instance of ~s, violating inter-arg-genl-isa constraint~%");
        $ic209$ = SubLObjectFactory.makeString("when argument ~s, ~s, genls ~s~%");
        $ic210$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genl"));
        $ic211$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-FORMAT");
        $ic212$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20570", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates argFormat constraint."));
        $ic213$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#202", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12457", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20618", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20624", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#20622", "CYC"));
        $ic214$ = SubLObjectFactory.makeString("Term ~s violates arg-format ~s~%");
        $ic215$ = SubLObjectFactory.makeString("  applicable to argument ~s of relation ~s~%");
        $ic216$ = SubLObjectFactory.makeString("  (via ~s)~%");
        $ic217$ = SubLObjectFactory.makeString("  in mt ~s.~%");
        $ic218$ = SubLObjectFactory.makeString("  ~%  In conflict ~a: ~%    ~a~%");
        $ic219$ = SubLObjectFactory.makeString("are");
        $ic220$ = SubLObjectFactory.makeString("is");
        $ic221$ = SubLObjectFactory.makeSymbol("S#20625", "CYC");
        $ic222$ = SubLObjectFactory.makeString(", ~%    ");
        $ic223$ = SubLObjectFactory.makeString(", and ~%    ");
        $ic224$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-FORMAT");
        $ic225$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20571", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates interArgFormat constraint."));
        $ic226$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#202", "CYC"), SubLObjectFactory.makeSymbol("S#12457", "CYC"), SubLObjectFactory.makeSymbol("S#20618", "CYC"), SubLObjectFactory.makeSymbol("FORMAT"), SubLObjectFactory.makeSymbol("S#20619", "CYC"), SubLObjectFactory.makeSymbol("S#20620", "CYC"), SubLObjectFactory.makeSymbol("S#20621", "CYC"), SubLObjectFactory.makeSymbol("S#11445", "CYC"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("S#20622", "CYC") });
        $ic227$ = SubLObjectFactory.makeString("Term ~s violates inter-arg-format ~s~%");
        $ic228$ = SubLObjectFactory.makeString("  when argument ~s, ~s, isa ~s~%");
        $ic229$ = SubLObjectFactory.makeString("  ~%  In conflict ~a: ~%    ~a");
        $ic230$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-DIFFERENT");
        $ic231$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20572", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates interArgDifferent constraint."));
        $ic232$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12457", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20626", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20627", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#20622", "CYC"));
        $ic233$ = SubLObjectFactory.makeString("Terms ~s and ~s are equal, which violates the inter-arg-different constraint~%");
        $ic234$ = SubLObjectFactory.makeString("applicable to arguments ~s and ~s of relation ~s~%");
        $ic235$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgDifferent"));
        $ic236$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic237$ = SubLObjectFactory.makeKeyword("MAL-RELN-WRT-ARG-ISA-REQUIRED");
        $ic238$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20573", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a predicate for which argIsa is not defined when argIsa's are strictly required on a predicate before using it."));
        $ic239$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17572", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic240$ = SubLObjectFactory.makeString("argument ~s of ~s has no #$argIsa constraint in mt ~s.~%");
        $ic241$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $ic242$ = SubLObjectFactory.makeSymbol("?COL");
        $ic243$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $ic244$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("?COL"));
        $ic245$ = SubLObjectFactory.makeKeyword("CONFLICT-ASSERTING-TRUE-SBHL");
        $ic246$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20574", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains sentences which violate the current sbhl information."));
        $ic247$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic248$ = SubLObjectFactory.makeString("sbhl conflict: ~s ~a ~a~%      because: ~a~%");
        $ic249$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic250$ = SubLObjectFactory.makeSymbol("S#4216", "CYC");
        $ic251$ = SubLObjectFactory.makeString("               ~%");
        $ic252$ = SubLObjectFactory.makeString("~s is known not to be ~a ~s in mt ~s.  ~%~a~%");
        $ic253$ = SubLObjectFactory.makeString("related to");
        $ic254$ = SubLObjectFactory.makeString("an instance of");
        $ic255$ = SubLObjectFactory.makeString("a spec of");
        $ic256$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic257$ = SubLObjectFactory.makeString("a spec mt of");
        $ic258$ = SubLObjectFactory.makeString("a spec pred of");
        $ic259$ = SubLObjectFactory.makeString("a spec inverse of");
        $ic260$ = SubLObjectFactory.makeKeyword("CONFLICT-ASSERTING-FALSE-SBHL");
        $ic261$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20577", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contain sentences which negate the current sbhl information."));
        $ic262$ = SubLObjectFactory.makeString("sbhl conflict: ~s ~a ~a~%      because: ~a ~%");
        $ic263$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic264$ = SubLObjectFactory.makeString("~s is known to be ~a ~s in mt ~s.  ~%~a~%");
        $ic265$ = SubLObjectFactory.makeKeyword("DISJOINT-ARG-ISA");
        $ic266$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20579", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is said to be #$isa of disjoint collections."));
        $ic267$ = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20628", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"));
        $ic268$ = SubLObjectFactory.makeString("Variable ~s is subject to disjoint ~%isa constraints ~s in mt ~s.~%");
        $ic269$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic270$ = SubLObjectFactory.makeKeyword("WFF-EXPANSION-FORMULA");
        $ic271$ = SubLObjectFactory.makeKeyword("WFF-ORIGINAL-FORMULA");
        $ic272$ = SubLObjectFactory.makeString("~%Original formula: ~% ~s");
        $ic273$ = SubLObjectFactory.makeString("~%Expansion formula: ~% ~s");
        $ic274$ = SubLObjectFactory.makeString("~%WFF checked formula: ~% ~s");
        $ic275$ = SubLObjectFactory.makeKeyword("DISJOINT-ARG-QUOTED-ISA");
        $ic276$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20581", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is said to be #$quotedIsa of disjoint collections."));
        $ic277$ = SubLObjectFactory.makeKeyword("DISJOINT-ARG-GENL");
        $ic278$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20582", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is said to be #$genls of disjoint collections."));
        $ic279$ = SubLObjectFactory.makeString("Variable ~s is subject to disjoint ~%genl constraints ~s in mt ~s.~%");
        $ic280$ = SubLObjectFactory.makeKeyword("ISOLATED-TERMS");
        $ic281$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20583", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains terms which are isolated when strict coherence is enforced."));
        $ic282$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13098", "CYC"));
        $ic283$ = SubLObjectFactory.makeString(" ~s is an isolated term in~%~s.~%");
        $ic284$ = SubLObjectFactory.makeString(" ~s~%are isolated terms in~%~s.~%");
        $ic285$ = SubLObjectFactory.makeSymbol("S#4217", "CYC");
        $ic286$ = SubLObjectFactory.makeKeyword("IRRELEVANT-LITERALS");
        $ic287$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20584", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains literals which become irrelevant when strict coherence is enforced. (Normally simplifier takes care of such cases and reduces them.  This violation will be generated in the above case only when simplifier is turned off and coherence checking is done.)."));
        $ic288$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20629", "CYC"));
        $ic289$ = SubLObjectFactory.makeString(" ~s is irrelevant in~%~s.~%");
        $ic290$ = SubLObjectFactory.makeString(" ~s~%are irrelevant in~%~s.~%");
        $ic291$ = SubLObjectFactory.makeKeyword("RESTRICTED-SKOLEM-ASSERTION");
        $ic292$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20585", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence attempts to state more about a skolem function, which is not allowed."));
        $ic293$ = SubLObjectFactory.makeSymbol("S#13552", "CYC");
        $ic294$ = SubLObjectFactory.makeString("Asserting a sentence that references a skolem (e.g., ~s) ~%in a literal with predicate ~s is prohibited.~%");
        $ic295$ = SubLObjectFactory.makeKeyword("RESTRICTED-PREDICATE-ASSERTION");
        $ic296$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20586", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence attempts to assert a literal with a predicate which is #$notAssertible."));
        $ic297$ = SubLObjectFactory.makeString("Asserting a literal with predicate ~s is prohibited in mt ~s.~%");
        $ic298$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("notAssertible"));
        $ic299$ = SubLObjectFactory.makeKeyword("RESTRICTED-COLLECTION-ASSERTION");
        $ic300$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20587", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence attempts to assert members for a collection which is #$notAssertibleCollection."));
        $ic301$ = SubLObjectFactory.makeString("Asserting an #$isa literal with collection ~s is prohibited in mt ~s.~%");
        $ic302$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("notAssertibleCollection"));
        $ic303$ = SubLObjectFactory.makeKeyword("EVALUATABLE-LITERAL-FALSE");
        $ic304$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20588", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic305$ = SubLObjectFactory.makeString("Asserting a sentence in mt ~s ~%  that references a false evaluatable literal: ~%  ~s ~%  is prohibited.~%");
        $ic306$ = SubLObjectFactory.makeKeyword("EXCEPT-FOR-W/O-SINGLETON-VAR");
        $ic307$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20589", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic308$ = SubLObjectFactory.makeString("#$exceptFor sentence arg2 must have precisely one variable but has ~s~s~a.~%");
        $ic309$ = SubLObjectFactory.makeString(": ");
        $ic310$ = SubLObjectFactory.makeKeyword("INVALID-MT-FOR-TOU");
        $ic311$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20590", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic312$ = SubLObjectFactory.makeString("attempt to assert #$termOfUnit gaf in mt ~s; it may only be asserted in mt ~s.~%");
        $ic313$ = SubLObjectFactory.makeKeyword("NON-DEFN-PRED-IN-VOCAB-MT");
        $ic314$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20591", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic315$ = SubLObjectFactory.makeString("attempt to assert gaf with non-definitional predicate ~S in vocab mt ~s.~%");
        $ic316$ = SubLObjectFactory.makeKeyword("PREDICATE-ISA-VIOLATION");
        $ic317$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20592", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic318$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#20624", "CYC"));
        $ic319$ = SubLObjectFactory.makeString("(#$isa ~s ~s) in mt ~s~%");
        $ic320$ = SubLObjectFactory.makeKeyword("META-PREDICATE-VIOLATION");
        $ic321$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20593", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic322$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20630", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20631", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#20624", "CYC"));
        $ic323$ = SubLObjectFactory.makeString("(~s ~s ~s) in mt ~s~%");
        $ic324$ = SubLObjectFactory.makeKeyword("MAL-PRECANONICALIZATIONS");
        $ic325$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20594", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic326$ = SubLObjectFactory.makeString("Uninformative error during precanonicalization.~%~%");
        $ic327$ = SubLObjectFactory.makeKeyword("INVALID-EXPANSION");
        $ic328$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20595", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic329$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic330$ = SubLObjectFactory.makeSymbol("NULL");
        $ic331$ = SubLObjectFactory.makeSymbol("S#15431", "CYC");
        $ic332$ = SubLObjectFactory.makeSymbol("S#20632", "CYC");
        $ic333$ = SubLObjectFactory.makeSymbol("MAX");
        $ic334$ = SubLObjectFactory.makeString("~A has arity ~A, but the expansion for ~A requires arity ~A, because it references the generic argument ~A.~%");
        $ic335$ = SubLObjectFactory.makeString("~A does not fit the pattern of the expansion of ~A, which is ~A.~%");
        $ic336$ = SubLObjectFactory.makeKeyword("RECURSION-LIMIT-EXCEEDED");
        $ic337$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20596", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic338$ = SubLObjectFactory.makeString("Recursion limit exceeded; probably trying to expand a recursive EL relation.~%~%");
        $ic339$ = SubLObjectFactory.makeKeyword("EL-UNEVALUATABLE-EXPRESSION");
        $ic340$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20597", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic341$ = SubLObjectFactory.makeString(" was marked as #$evaluateAtEL, but was unevaluatable.");
        $ic342$ = SubLObjectFactory.makeKeyword("QUANTIFIED-SEQUENCE-VARIABLE");
        $ic343$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20598", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic344$ = SubLObjectFactory.makeString("The variable ~A is existentially quantified and then used as a sequence variable in the sentence~%~A.~%See rule Q2 in the sequence variable specification.");
        $ic345$ = SubLObjectFactory.makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");
        $ic346$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20599", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic347$ = SubLObjectFactory.makeString("The variables ~A were used as sequence variables within the scope of the existentially quantified variable ~A.  Only one such sequence variable is permitted.  See rule Q3 in the sequence variable specification.");
        $ic348$ = SubLObjectFactory.makeKeyword("AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE");
        $ic349$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20600", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic350$ = SubLObjectFactory.makeString("The variable ~A was used both as a sequence variable and a term variable within the scope of the existentially quantified variable ~A, in the sentence~%~A.~%See rule Q4 in the sequence variable specification.");
        $ic351$ = SubLObjectFactory.makeKeyword("INHIBITED-SEQUENCE-VARIABLE");
        $ic352$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20601", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic353$ = SubLObjectFactory.makeString("The variable ~A was used as a sequence variable in the sentence ~A, which is not allowed because ~A is scoped.  See the section on scoping expressions in the sequence variable specification.");
        $ic354$ = SubLObjectFactory.makeKeyword("TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST");
        $ic355$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20602", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic356$ = SubLObjectFactory.makeString("In conflict: ~a.~%No more than one #$commutativeInArgsAndRest assertion is allowed.~%");
        $ic357$ = SubLObjectFactory.makeKeyword("CYCLIC-COMMUTATIVE-IN-ARGS");
        $ic358$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20603", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic359$ = SubLObjectFactory.makeString("An assertion of partial commutativity has already been made about argument position ~a of relation ~a, namely:~%~a.~%");
        $ic360$ = SubLObjectFactory.makeKeyword("DEFINING-MT-VIOLATION");
        $ic361$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20604", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic362$ = SubLObjectFactory.makeString("Term ~a was referenced in ~a ~%but is defined only in ~a.~%");
        $ic363$ = SubLObjectFactory.makeKeyword("DISJUNCT-IN-PRAGMATIC-REQUIREMENT");
        $ic364$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20605", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence is a pragmatic requirement which contains a disjunct.  e.g. (#$pragmaticRequirement (#$or (#$isa ?X #$Dog) (#$isa ?X #$Cat)) (#$implies (#$isa ?X #$DomesticPet) (#$relationInstanceAll #$loves ?X #$HumanChild)))"));
        $ic365$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20633", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic366$ = SubLObjectFactory.makeString("Disjoint condition ~s is present in ~%~s ~s. ~%Disjunct condition is not allowed in a pragmatic requirement sentence.~%");
        $ic367$ = SubLObjectFactory.makeKeyword("BAD-EXPONENTIAL-DISJUNCTION");
        $ic368$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20606", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence is a disjunction of conjunctions which was attempted to be converted into CNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead."));
        $ic369$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"));
        $ic370$ = SubLObjectFactory.makeString("~s is a disjunction of conjunctions which was attempted to be converted into CNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead.");
        $ic371$ = SubLObjectFactory.makeKeyword("BAD-EXPONENTIAL-CONJUNCTION");
        $ic372$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20607", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence is a conjunction of disjunctions which was attempted to be converted into DNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead."));
        $ic373$ = SubLObjectFactory.makeString("~s is a conjunction of disjunctions which was attempted to be converted into DNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead.");
        $ic374$ = SubLObjectFactory.makeKeyword("RESTRICTED-MT-ASSERTION");
        $ic375$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20608", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The microtheory specified for the the sentence is a #$notAssertibleMt. For decontextualized collection / predicates the specified mt will be taken as the convention mt."));
        $ic376$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12398", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17622", "CYC"));
        $ic377$ = SubLObjectFactory.makeString("Asserting the decontextualized literal ~s in its convention mt ~s is prohibited.");
        $ic378$ = SubLObjectFactory.makeString("Asserting the literal ~s in microtherory ~s is prohibited.");
        $ic379$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("decontextualizedPredicate"));
        $ic380$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("predicateConventionMt"));
        $ic381$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("notAssertibleMt"));
        $ic382$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("decontextualizedCollection"));
        $ic383$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("collectionConventionMt"));
        $ic384$ = SubLObjectFactory.makeKeyword("SIMPLIFICATION-TO-TAUTOLOGY-DUE-TO-POS-AND-NEG-LITERAL");
        $ic385$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20609", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("Formula has a literal that occurs in both the antecedent and consequent."));
        $ic386$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12398", "CYC"));
        $ic387$ = SubLObjectFactory.makeString("Formula simplifies to a tautology due to literal ~%~S being both a pos and neg lit.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0273.class
	Total time: 1175 ms
	
	Decompiled with Procyon 0.5.32.
*/