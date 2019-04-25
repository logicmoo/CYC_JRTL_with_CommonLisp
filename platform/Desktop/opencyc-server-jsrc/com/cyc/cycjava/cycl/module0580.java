package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0580 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0580";
    public static final String myFingerPrint = "d4ca29f85235280f1321cea09d5ee8a2bfbdd9a5cad4887189aa6dda90b82065";
    public static SubLSymbol $g4358$;
    public static SubLSymbol $g4359$;
    public static SubLSymbol $g4360$;
    public static SubLSymbol $g4361$;
    public static SubLSymbol $g4362$;
    public static SubLSymbol $g4363$;
    public static SubLSymbol $g4364$;
    public static SubLSymbol $g4365$;
    public static SubLSymbol $g4366$;
    public static SubLSymbol $g4367$;
    public static SubLSymbol $g4368$;
    public static SubLSymbol $g4369$;
    public static SubLSymbol $g4370$;
    public static SubLSymbol $g4371$;
    public static SubLSymbol $g4372$;
    public static SubLSymbol $g4373$;
    private static SubLSymbol $g4374$;
    public static SubLSymbol $g4375$;
    public static SubLSymbol $g4376$;
    public static SubLSymbol $g4377$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLList $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLList $ic69$;
    private static final SubLList $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLInteger $ic100$;
    private static final SubLList $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLString $ic105$;
    private static final SubLList $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLList $ic112$;
    private static final SubLList $ic113$;
    private static final SubLList $ic114$;
    private static final SubLList $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLList $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLList $ic124$;
    private static final SubLList $ic125$;
    private static final SubLList $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLString $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLString $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLList $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLList $ic136$;
    private static final SubLList $ic137$;
    private static final SubLList $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLList $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLList $ic148$;
    private static final SubLList $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLList $ic169$;
    private static final SubLList $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLList $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLList $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLList $ic188$;
    private static final SubLList $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLString $ic193$;
    private static final SubLList $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLString $ic201$;
    private static final SubLList $ic202$;
    private static final SubLList $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLList $ic208$;
    private static final SubLList $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLList $ic212$;
    private static final SubLList $ic213$;
    private static final SubLList $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLList $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLString $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLList $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLList $ic224$;
    private static final SubLList $ic225$;
    private static final SubLList $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLList $ic230$;
    private static final SubLList $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLList $ic234$;
    private static final SubLList $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLList $ic237$;
    private static final SubLString $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLList $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLList $ic244$;
    private static final SubLList $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLList $ic247$;
    private static final SubLList $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLList $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLList $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLList $ic257$;
    private static final SubLList $ic258$;
    private static final SubLList $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLList $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLList $ic263$;
    private static final SubLList $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLString $ic268$;
    private static final SubLList $ic269$;
    private static final SubLList $ic270$;
    private static final SubLSymbol $ic271$;
    private static final SubLList $ic272$;
    private static final SubLSymbol $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLList $ic277$;
    private static final SubLList $ic278$;
    private static final SubLSymbol $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLList $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLSymbol $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLList $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLList $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLList $ic293$;
    private static final SubLList $ic294$;
    private static final SubLList $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLList $ic297$;
    private static final SubLSymbol $ic298$;
    private static final SubLList $ic299$;
    private static final SubLString $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLList $ic303$;
    private static final SubLSymbol $ic304$;
    private static final SubLSymbol $ic305$;
    private static final SubLList $ic306$;
    private static final SubLList $ic307$;
    private static final SubLList $ic308$;
    private static final SubLList $ic309$;
    private static final SubLSymbol $ic310$;
    private static final SubLSymbol $ic311$;
    private static final SubLList $ic312$;
    private static final SubLList $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLString $ic316$;
    private static final SubLList $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLList $ic319$;
    private static final SubLSymbol $ic320$;
    private static final SubLList $ic321$;
    private static final SubLList $ic322$;
    private static final SubLSymbol $ic323$;
    private static final SubLSymbol $ic324$;
    private static final SubLSymbol $ic325$;
    private static final SubLSymbol $ic326$;
    private static final SubLSymbol $ic327$;
    private static final SubLSymbol $ic328$;
    private static final SubLSymbol $ic329$;
    private static final SubLSymbol $ic330$;
    private static final SubLSymbol $ic331$;
    private static final SubLSymbol $ic332$;
    private static final SubLSymbol $ic333$;
    private static final SubLSymbol $ic334$;
    private static final SubLSymbol $ic335$;
    private static final SubLList $ic336$;
    private static final SubLList $ic337$;
    private static final SubLSymbol $ic338$;
    private static final SubLSymbol $ic339$;
    private static final SubLSymbol $ic340$;
    private static final SubLSymbol $ic341$;
    private static final SubLInteger $ic342$;
    private static final SubLSymbol $ic343$;
    private static final SubLSymbol $ic344$;
    private static final SubLSymbol $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLSymbol $ic347$;
    private static final SubLList $ic348$;
    private static final SubLSymbol $ic349$;
    private static final SubLList $ic350$;
    private static final SubLList $ic351$;
    private static final SubLSymbol $ic352$;
    private static final SubLSymbol $ic353$;
    private static final SubLSymbol $ic354$;
    private static final SubLSymbol $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLString $ic357$;
    private static final SubLString $ic358$;
    private static final SubLString $ic359$;
    private static final SubLSymbol $ic360$;
    private static final SubLString $ic361$;
    private static final SubLList $ic362$;
    private static final SubLSymbol $ic363$;
    private static final SubLSymbol $ic364$;
    private static final SubLSymbol $ic365$;
    private static final SubLSymbol $ic366$;
    private static final SubLList $ic367$;
    private static final SubLSymbol $ic368$;
    private static final SubLSymbol $ic369$;
    private static final SubLSymbol $ic370$;
    private static final SubLSymbol $ic371$;
    private static final SubLSymbol $ic372$;
    private static final SubLString $ic373$;
    private static final SubLList $ic374$;
    private static final SubLString $ic375$;
    private static final SubLString $ic376$;
    private static final SubLString $ic377$;
    private static final SubLString $ic378$;
    private static final SubLList $ic379$;
    private static final SubLString $ic380$;
    private static final SubLSymbol $ic381$;
    private static final SubLString $ic382$;
    private static final SubLSymbol $ic383$;
    private static final SubLString $ic384$;
    private static final SubLList $ic385$;
    private static final SubLObject $ic386$;
    private static final SubLList $ic387$;
    private static final SubLString $ic388$;
    private static final SubLSymbol $ic389$;
    private static final SubLObject $ic390$;
    private static final SubLString $ic391$;
    private static final SubLList $ic392$;
    private static final SubLSymbol $ic393$;
    private static final SubLList $ic394$;
    private static final SubLList $ic395$;
    private static final SubLList $ic396$;
    
    public static SubLObject f35520(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0035.f2293(module0579.$g4263$.getDynamicValue(var2), var1, Symbols.symbol_function((SubLObject)module0580.EQUAL), (SubLObject)module0580.UNPROVIDED);
    }
    
    public static SubLObject f35521(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic0$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic2$, var7, (SubLObject)module0580.$ic3$), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic5$, var7)), ConsesLow.append(var8, (SubLObject)module0580.NIL)));
    }
    
    public static SubLObject f35522(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic0$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic6$, var7, (SubLObject)module0580.$ic7$), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic8$, var7)), ConsesLow.append(var8, (SubLObject)module0580.NIL)));
    }
    
    public static SubLObject f35523(final SubLObject var11) {
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        SubLObject var16;
        SubLObject var15;
        SubLObject var17;
        SubLObject var18;
        for (var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0580.NIL == module0035.f2292(var11)), var13 = (SubLObject)module0580.NIL, var13 = var11; module0580.NIL == var12 && module0580.NIL != var13; var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0580.NIL == module0206.f13450(var17) || module0580.NIL == module0038.f2614(var18)), var13 = var13.rest()) {
            var14 = var13.first();
            var15 = (var16 = var14);
            var17 = (SubLObject)module0580.NIL;
            var18 = (SubLObject)module0580.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0580.$ic9$);
            var17 = var16.first();
            var16 = (var18 = var16.rest());
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0580.NIL == var12);
    }
    
    public static SubLObject f35524(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic10$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic11$, var7, (SubLObject)module0580.$ic12$), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic13$, var7)), ConsesLow.append(var8, (SubLObject)module0580.NIL)));
    }
    
    public static SubLObject f35525(final SubLObject var11) {
        return assertion_handles_oc.f11035(var11);
    }
    
    public static SubLObject f35526(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic14$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        SubLObject var10 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic14$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic14$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic14$);
        var10 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var11;
            var6 = (var11 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic15$, (SubLObject)ConsesLow.list(var8, var9, var10), ConsesLow.append(var11, (SubLObject)module0580.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic14$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35527(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)module0580.$ic16$, ConsesLow.append(var7, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35528(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic17$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic6$, var7, (SubLObject)module0580.$ic18$), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic19$, var7)), ConsesLow.append(var8, (SubLObject)module0580.NIL)));
    }
    
    public static SubLObject f35529(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)module0580.$ic20$, ConsesLow.append(var7, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35530(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic21$, (SubLObject)module0580.T, reader.bq_cons((SubLObject)module0580.$ic22$, ConsesLow.append(var7, (SubLObject)module0580.NIL)));
    }
    
    public static SubLObject f35531(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic21$, (SubLObject)module0580.NIL, ConsesLow.append(var7, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35532(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic23$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic6$, var7, (SubLObject)module0580.$ic24$), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic21$, var7, ConsesLow.append(var8, (SubLObject)module0580.NIL)));
    }
    
    public static SubLObject f35533(final SubLObject var41) {
        if (module0580.NIL == var41) {
            return (SubLObject)module0580.T;
        }
        if (module0580.NIL == module0035.f2014(var41)) {
            return (SubLObject)module0580.NIL;
        }
        if (module0580.NIL != module0004.f104((SubLObject)module0580.NIL, var41, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED)) {
            return (SubLObject)module0580.NIL;
        }
        SubLObject var42 = var41;
        SubLObject var43 = (SubLObject)module0580.NIL;
        var43 = var42.first();
        while (module0580.NIL != var42) {
            if (var43.isInteger() && var43.isNegative()) {
                return (SubLObject)module0580.NIL;
            }
            if (!var43.isInteger() && module0580.NIL == f35533(var43)) {
                return (SubLObject)module0580.NIL;
            }
            var42 = var42.rest();
            var43 = var42.first();
        }
        return (SubLObject)module0580.T;
    }
    
    public static SubLObject f35534(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)module0580.$ic25$, ConsesLow.append(var7, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35535(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic26$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic26$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic27$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic28$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic29$, var8), var8, (SubLObject)module0580.$ic30$))), ConsesLow.append(var9, (SubLObject)module0580.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic26$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35536(final SubLObject var49) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0580.NIL == module0269.f17737(var49));
    }
    
    public static SubLObject f35537(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic32$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic32$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic32$);
        var9 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var10;
            var6 = (var10 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic33$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic34$, var8, (SubLObject)module0580.$ic35$)), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic36$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic34$, var9, (SubLObject)module0580.$ic37$))), ConsesLow.append(var10, (SubLObject)module0580.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic32$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35538(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic38$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic38$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic39$, var8)), ConsesLow.append(var9, (SubLObject)module0580.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic38$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35539(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)module0580.$ic40$, ConsesLow.append(var7, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35540(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)module0580.$ic41$, ConsesLow.append(var7, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35541(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic42$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic43$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic44$, (SubLObject)module0580.$ic45$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic46$, var7)))), ConsesLow.append(var8, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35542(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        final SubLObject var8 = (SubLObject)module0580.$ic47$;
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic49$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic50$, var8), (SubLObject)module0580.$ic51$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)module0580.$ic52$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic53$, (SubLObject)module0580.$ic54$, ConsesLow.append(var7, (SubLObject)module0580.NIL))), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic55$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic44$, (SubLObject)ConsesLow.listS((SubLObject)module0580.EQ, var8, (SubLObject)module0580.$ic56$), (SubLObject)module0580.$ic57$), (SubLObject)module0580.$ic58$)));
    }
    
    public static SubLObject f35543(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic53$, (SubLObject)module0580.$ic59$, ConsesLow.append(var7, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35544() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0580.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var2))) {
            return Values.values(module0580.$g4358$.getDynamicValue(var2), (SubLObject)module0580.$ic62$);
        }
        return Values.values(module0034.f1854((SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED), (SubLObject)module0580.$ic63$);
    }
    
    public static SubLObject f35545() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (module0580.NIL != module0107.f7628(module0580.$g4359$.getDynamicValue(var2))) ? Values.values(module0034.f1881(), (SubLObject)module0580.$ic63$) : Values.values(module0580.$g4359$.getDynamicValue(var2), (SubLObject)module0580.$ic62$);
    }
    
    public static SubLObject f35546(final SubLObject var71, final SubLObject var72) {
        f35547(var71, var72, (SubLObject)module0580.ZERO_INTEGER);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35548(final SubLObject var71) {
        return (SubLObject)((var71.getClass() == $sX39062_native.class) ? module0580.T : module0580.NIL);
    }
    
    public static SubLObject f35549(final SubLObject var71) {
        assert module0580.NIL != f35548(var71) : var71;
        return var71.getField2();
    }
    
    public static SubLObject f35550(final SubLObject var71, final SubLObject var74) {
        assert module0580.NIL != f35548(var71) : var71;
        return var71.setField2(var74);
    }
    
    public static SubLObject f35551(SubLObject var75) {
        if (var75 == module0580.UNPROVIDED) {
            var75 = (SubLObject)module0580.NIL;
        }
        final SubLObject var76 = (SubLObject)new $sX39062_native();
        SubLObject var77;
        SubLObject var78;
        SubLObject var79;
        SubLObject var80;
        for (var77 = (SubLObject)module0580.NIL, var77 = var75; module0580.NIL != var77; var77 = conses_high.cddr(var77)) {
            var78 = var77.first();
            var79 = conses_high.cadr(var77);
            var80 = var78;
            if (var80.eql((SubLObject)module0580.$ic77$)) {
                f35550(var76, var79);
            }
            else {
                Errors.error((SubLObject)module0580.$ic78$, var78);
            }
        }
        return var76;
    }
    
    public static SubLObject f35552(final SubLObject var81, final SubLObject var82) {
        Functions.funcall(var82, var81, (SubLObject)module0580.$ic79$, (SubLObject)module0580.$ic80$, (SubLObject)module0580.ONE_INTEGER);
        Functions.funcall(var82, var81, (SubLObject)module0580.$ic81$, (SubLObject)module0580.$ic77$, f35549(var81));
        Functions.funcall(var82, var81, (SubLObject)module0580.$ic82$, (SubLObject)module0580.$ic80$, (SubLObject)module0580.ONE_INTEGER);
        return var81;
    }
    
    public static SubLObject f35553(final SubLObject var81, final SubLObject var82) {
        return f35552(var81, var82);
    }
    
    public static SubLObject f35547(final SubLObject var83, final SubLObject var72, final SubLObject var84) {
        PrintLow.format(var72, (SubLObject)module0580.$ic84$, f35549(var83));
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35554(final SubLObject var83) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        assert module0580.NIL != f35548(var83) : var83;
        if (module0580.NIL != module0361.f24009(f35549(var83))) {
            module0361.f24005(f35549(var83));
        }
        f35555(var83, (SubLObject)module0580.$ic86$);
        module0580.$g4361$.setDynamicValue((SubLObject)ConsesLow.cons(var83, module0580.$g4361$.getDynamicValue(var84)), var84);
        return (SubLObject)module0580.$ic86$;
    }
    
    public static SubLObject f35555(final SubLObject var83, final SubLObject var85) {
        assert module0580.NIL != f35548(var83) : var83;
        f35550(var83, var85);
        return var85;
    }
    
    public static SubLObject f35556() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0580.NIL;
        if (module0580.NIL != module0580.$g4361$.getDynamicValue(var2)) {
            final SubLObject var4 = module0580.$g4361$.getDynamicValue(var2);
            var3 = var4.first();
            module0580.$g4361$.setDynamicValue(var4.rest(), var2);
        }
        else {
            var3 = f35551((SubLObject)module0580.UNPROVIDED);
        }
        return var3;
    }
    
    public static SubLObject f35557(final SubLObject var83) {
        assert module0580.NIL != f35548(var83) : var83;
        final SubLObject var84 = f35549(var83);
        final SubLObject var85 = module0361.f24136((SubLObject)module0580.UNPROVIDED);
        if (module0580.NIL != module0361.f24009(var84)) {
            module0361.f24005(var84);
        }
        f35555(var83, var85);
        return var83;
    }
    
    public static SubLObject f35558(SubLObject var89) {
        if (var89 == module0580.UNPROVIDED) {
            var89 = (SubLObject)module0580.NIL;
        }
        final SubLThread var90 = SubLProcess.currentSubLThread();
        final SubLObject var91 = module0580.$g4362$.getDynamicValue(var90);
        SubLObject var92 = (SubLObject)module0580.NIL;
        if (module0580.NIL != f35548(var91)) {
            var92 = f35549(var91);
            if (module0580.$ic86$ == var92 && module0580.NIL != var89) {
                f35557(var91);
                if (module0580.NIL != module0578.f35470((SubLObject)module0580.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0580.T, (SubLObject)module0580.$ic87$, f35549(var91));
                }
                var92 = f35549(var91);
            }
        }
        return (SubLObject)((module0580.NIL != var92) ? var92 : module0580.NIL);
    }
    
    public static SubLObject f35559(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        final SubLObject var8 = (SubLObject)module0580.$ic88$;
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)module0580.$ic89$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic49$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic90$, var8), (SubLObject)module0580.$ic91$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic92$, reader.bq_cons((SubLObject)module0580.$ic1$, ConsesLow.append(var7, (SubLObject)module0580.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic93$, var8, (SubLObject)module0580.$ic94$))));
    }
    
    public static SubLObject f35560() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0580.NIL == f35548(module0580.$g4362$.getDynamicValue(var2))) {
            final SubLObject var3 = f35556();
            return Values.values(var3, (SubLObject)module0580.NIL);
        }
        if (module0580.NIL == f35561()) {
            if (module0580.NIL != module0578.f35470((SubLObject)module0580.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0580.T, (SubLObject)module0580.$ic96$, f35558((SubLObject)module0580.UNPROVIDED));
            }
            f35557(module0580.$g4362$.getDynamicValue(var2));
            if (module0580.NIL == f35561()) {
                final SubLObject var4 = Sequences.cconcatenate((SubLObject)module0580.$ic97$, new SubLObject[] { module0006.f205((SubLObject)module0580.ONE_INTEGER), module0580.$ic98$, module0006.f203((SubLObject)module0580.$ic99$) });
                module0578.f35476(var4, (SubLObject)ConsesLow.list(f35558((SubLObject)module0580.UNPROVIDED)));
            }
            return Values.values(module0580.$g4362$.getDynamicValue(var2), (SubLObject)module0580.T);
        }
        return Values.values(module0580.$g4362$.getDynamicValue(var2), (SubLObject)module0580.T);
    }
    
    public static SubLObject f35561() {
        final SubLObject var85 = f35558((SubLObject)module0580.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0580.$ic86$ == var85 || (module0580.NIL != module0361.f24109(var85) && module0580.NIL != f35562(var85)));
    }
    
    public static SubLObject f35562(final SubLObject var85) {
        return Numbers.numL(module0361.f24112(var85), (SubLObject)module0580.$ic100$);
    }
    
    public static SubLObject f35563(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)module0580.$ic101$, ConsesLow.append(var7, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35564(final SubLObject var97) {
        final SubLThread var98 = SubLProcess.currentSubLThread();
        module0054.f3973(var97, module0580.$g4363$.getDynamicValue(var98));
        module0580.$g4366$.setDynamicValue(Numbers.add(module0580.$g4366$.getDynamicValue(var98), (SubLObject)module0580.ONE_INTEGER), var98);
        return (SubLObject)module0580.$ic102$;
    }
    
    public static SubLObject f35565() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0580.NIL != module0004.f106(module0580.$g4366$.getDynamicValue(var2))) ? module0580.$g4366$.getDynamicValue(var2) : module0580.ZERO_INTEGER);
    }
    
    public static SubLObject f35566() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0580.ZERO_INTEGER;
        while (module0580.NIL == module0054.f3970(module0580.$g4363$.getDynamicValue(var2))) {
            final SubLObject var4 = module0580.$g4367$.currentBinding(var2);
            try {
                module0580.$g4367$.bind((SubLObject)module0580.T, var2);
                final SubLObject var5 = module0054.f3975(module0580.$g4363$.getDynamicValue(var2));
                if (module0580.NIL != module0756.f47497(var5, (SubLObject)module0580.UNPROVIDED)) {
                    module0756.f47613(var5, (SubLObject)module0580.UNPROVIDED);
                    var3 = Numbers.add(var3, (SubLObject)module0580.ONE_INTEGER);
                }
                module0054.f3974(module0580.$g4363$.getDynamicValue(var2));
            }
            finally {
                module0580.$g4367$.rebind(var4, var2);
            }
        }
        if (module0580.NIL != module0578.f35470((SubLObject)module0580.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0580.T, (SubLObject)module0580.$ic105$, new SubLObject[] { var3, module0749.f46503(), module0749.f46502() });
        }
        return var3;
    }
    
    public static SubLObject f35567(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)module0580.$ic106$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic92$, reader.bq_cons((SubLObject)module0580.$ic1$, ConsesLow.append(var7, (SubLObject)module0580.NIL)), (SubLObject)module0580.$ic107$));
    }
    
    public static SubLObject f35568() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0580.NIL != module0107.f7629(module0580.$g4366$.getDynamicValue(var2))) ? module0580.$g4366$.getDynamicValue(var2) : module0580.ZERO_INTEGER);
    }
    
    public static SubLObject f35569(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic109$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic109$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            final SubLObject var10 = (SubLObject)module0580.$ic110$;
            final SubLObject var11 = (SubLObject)module0580.$ic111$;
            return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list(reader.bq_cons(var10, (SubLObject)module0580.$ic112$), (SubLObject)module0580.$ic113$, (SubLObject)module0580.$ic114$, reader.bq_cons(var8, (SubLObject)module0580.$ic115$)), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic92$, reader.bq_cons((SubLObject)module0580.$ic1$, ConsesLow.append(var9, (SubLObject)module0580.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic116$, var8, (SubLObject)module0580.$ic117$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic118$, reader.bq_cons(var11, (SubLObject)module0580.$ic112$), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic119$, var11, var10)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic109$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35570(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic116$, (SubLObject)module0580.$ic120$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic1$, (SubLObject)module0580.$ic121$, ConsesLow.append(var7, (SubLObject)module0580.NIL)), reader.bq_cons((SubLObject)module0580.$ic122$, ConsesLow.append(var7, (SubLObject)module0580.NIL))));
    }
    
    public static SubLObject f35571(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)module0580.$ic124$, (SubLObject)module0580.$ic125$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic92$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic1$, (SubLObject)module0580.$ic121$, ConsesLow.append(var7, (SubLObject)module0580.NIL)), (SubLObject)module0580.$ic126$));
    }
    
    public static SubLObject f35572() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0580.NIL != module0578.f35470((SubLObject)module0580.TWO_INTEGER)) {
            PrintLow.format((SubLObject)module0580.T, (SubLObject)module0580.$ic128$, module0579.$g4321$.getDynamicValue(var2));
        }
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35573() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0580.NIL != module0578.f35470((SubLObject)module0580.TWO_INTEGER)) {
            PrintLow.format((SubLObject)module0580.T, (SubLObject)module0580.$ic130$, module0579.$g4321$.getDynamicValue(var2));
        }
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35574() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0755.f47378(module0579.$g4321$.getDynamicValue(var2));
    }
    
    public static SubLObject f35575() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0579.$g4321$.setDynamicValue((SubLObject)module0580.NIL, var2);
        return module0579.$g4321$.getDynamicValue(var2);
    }
    
    public static SubLObject f35576(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var7;
        final SubLObject var6 = var7 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0580.$ic133$);
        final SubLObject var8 = var7.rest();
        var7 = var7.first();
        SubLObject var9 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0580.$ic133$);
        var9 = var7.first();
        var7 = var7.rest();
        if (module0580.NIL != var7) {
            cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)module0580.$ic133$);
            return (SubLObject)module0580.NIL;
        }
        final SubLObject var10;
        var7 = (var10 = var8);
        if (module0580.NIL != module0004.f104((SubLObject)module0580.$ic134$, reader.$features$.getDynamicValue(var5), (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED)) {
            final SubLObject var11 = (SubLObject)module0580.$ic135$;
            return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, reader.bq_cons(reader.bq_cons(var11, (SubLObject)module0580.$ic136$), (SubLObject)module0580.$ic137$), (SubLObject)module0580.$ic138$, ConsesLow.append(var10, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic139$, var9, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic140$, (SubLObject)module0580.$ic141$, var11)))));
        }
        return reader.bq_cons((SubLObject)module0580.$ic1$, ConsesLow.append(var10, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35577(final SubLObject var116, final SubLObject var115) {
        if (module0580.NIL != module0578.f35470((SubLObject)module0580.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0580.T, (SubLObject)module0580.$ic143$, var116);
        }
        SubLObject var117 = (SubLObject)module0580.NIL;
        var117 = conses_high.set_difference(module0755.f47383(var116), var115, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED);
        if (module0580.NIL != var117 && module0580.NIL != module0578.f35470((SubLObject)module0580.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0580.T, (SubLObject)module0580.$ic144$, var117);
        }
        return var117;
    }
    
    public static SubLObject f35578(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic145$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic145$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic145$);
        var9 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var10;
            var6 = (var10 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic146$, var8), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic147$, var9)), ConsesLow.append(var10, (SubLObject)module0580.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic145$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35579(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic148$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic148$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic148$);
        var9 = var6.first();
        var6 = var6.rest();
        SubLObject var10 = (SubLObject)module0580.NIL;
        SubLObject var11 = var6;
        SubLObject var12 = (SubLObject)module0580.NIL;
        SubLObject var131_132 = (SubLObject)module0580.NIL;
        while (module0580.NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)module0580.$ic148$);
            var131_132 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)module0580.$ic148$);
            if (module0580.NIL == conses_high.member(var131_132, (SubLObject)module0580.$ic149$, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED)) {
                var12 = (SubLObject)module0580.T;
            }
            if (var131_132 == module0580.$ic150$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (module0580.NIL != var12 && module0580.NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic148$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic151$, var6);
        final SubLObject var14 = (SubLObject)((module0580.NIL != var13) ? conses_high.cadr(var13) : module0580.$ic152$);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic153$, var6);
        final SubLObject var16 = (SubLObject)((module0580.NIL != var15) ? conses_high.cadr(var15) : module0580.$ic154$);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic155$, var6);
        final SubLObject var18 = (SubLObject)((module0580.NIL != var17) ? conses_high.cadr(var17) : module0580.$ic156$);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic157$, var6);
        final SubLObject var20 = (SubLObject)((module0580.NIL != var19) ? conses_high.cadr(var19) : module0580.$ic158$);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic159$, var6);
        final SubLObject var22 = (SubLObject)((module0580.NIL != var21) ? conses_high.cadr(var21) : module0580.$ic160$);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic161$, var6);
        final SubLObject var24 = (SubLObject)((module0580.NIL != var23) ? conses_high.cadr(var23) : module0580.$ic162$);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic163$, var6);
        final SubLObject var26 = (SubLObject)((module0580.NIL != var25) ? conses_high.cadr(var25) : module0580.$ic164$);
        final SubLObject var27;
        var6 = (var27 = var7);
        final SubLObject var28 = (SubLObject)module0580.$ic165$;
        final SubLObject var29 = (SubLObject)module0580.$ic166$;
        final SubLObject var30 = (SubLObject)module0580.$ic167$;
        final SubLObject var31 = (SubLObject)module0580.$ic168$;
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic6$, var9, (SubLObject)module0580.$ic169$), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list(reader.bq_cons(var24, (SubLObject)module0580.$ic170$), reader.bq_cons(var30, (SubLObject)module0580.$ic170$), (SubLObject)ConsesLow.list(var29, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic171$, var9, (SubLObject)module0580.$ic172$)), (SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic173$, var29, (SubLObject)module0580.$ic115$)), (SubLObject)ConsesLow.list(var31, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic174$, var9))), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic175$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic176$, var31), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var28, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic177$, var31))), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic178$, (SubLObject)ConsesLow.list(new SubLObject[] { var28, var8, var18, var20, var22, var14, var16, var26, var24, var30 }), ConsesLow.append(var27, (SubLObject)module0580.NIL))))));
    }
    
    public static SubLObject f35580(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        SubLObject var10 = (SubLObject)module0580.NIL;
        SubLObject var11 = (SubLObject)module0580.NIL;
        SubLObject var12 = (SubLObject)module0580.NIL;
        SubLObject var13 = (SubLObject)module0580.NIL;
        SubLObject var14 = (SubLObject)module0580.NIL;
        SubLObject var15 = (SubLObject)module0580.NIL;
        SubLObject var16 = (SubLObject)module0580.NIL;
        SubLObject var17 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var10 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var11 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var12 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var13 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var14 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var15 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var16 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var17 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var18;
            var6 = (var18 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic181$, (SubLObject)ConsesLow.list(new SubLObject[] { var8, var9, var10, var11, var12, var13, var14, var15, var16, var17 }), ConsesLow.append(var18, (SubLObject)module0580.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic182$, (SubLObject)ConsesLow.list(var8, var9, var10, var11, var12, var13, var14), ConsesLow.append(var18, (SubLObject)module0580.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic180$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35581(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        SubLObject var10 = (SubLObject)module0580.NIL;
        SubLObject var11 = (SubLObject)module0580.NIL;
        SubLObject var12 = (SubLObject)module0580.NIL;
        SubLObject var13 = (SubLObject)module0580.NIL;
        SubLObject var14 = (SubLObject)module0580.NIL;
        SubLObject var15 = (SubLObject)module0580.NIL;
        SubLObject var16 = (SubLObject)module0580.NIL;
        SubLObject var17 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var10 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var11 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var12 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var13 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var14 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var15 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var16 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic180$);
        var17 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var18;
            var6 = (var18 = var7);
            final SubLObject var19 = (SubLObject)module0580.$ic183$;
            return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic184$, var8, (SubLObject)module0580.$ic115$))), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic139$, var16, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic185$, var19, var15, var17)), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic55$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic186$, var16, var17), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic187$, var16, var17)), reader.bq_cons(var10, (SubLObject)module0580.$ic188$), reader.bq_cons(var11, (SubLObject)module0580.$ic115$), reader.bq_cons(var12, (SubLObject)module0580.$ic115$), reader.bq_cons(var13, (SubLObject)module0580.$ic189$), (SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic190$, var9)), (SubLObject)ConsesLow.list(var16, var17)), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic191$, var13, var14, var10, var11, var12, var16), ConsesLow.append(var18, (SubLObject)module0580.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic139$, var17, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic192$, var16, var19)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic180$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35582(final SubLObject var144, final SubLObject var156) {
        return Numbers.add(var144, Sequences.length(var156));
    }
    
    public static SubLObject f35583(final SubLObject var144, final SubLObject var148) {
        final SubLObject var149 = Numbers.subtract(var144, var148);
        if (var149.numG((SubLObject)module0580.ONE_INTEGER)) {
            final SubLObject var150 = Sequences.cconcatenate((SubLObject)module0580.$ic97$, new SubLObject[] { module0006.f205((SubLObject)module0580.ONE_INTEGER), module0580.$ic98$, module0006.f203((SubLObject)module0580.$ic193$) });
            module0578.f35476(var150, (SubLObject)ConsesLow.list(var149));
        }
        return Strings.make_string(var149, (SubLObject)Characters.CHAR_space);
    }
    
    public static SubLObject f35584(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic194$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        SubLObject var10 = (SubLObject)module0580.NIL;
        SubLObject var11 = (SubLObject)module0580.NIL;
        SubLObject var12 = (SubLObject)module0580.NIL;
        SubLObject var13 = (SubLObject)module0580.NIL;
        SubLObject var14 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic194$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic194$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic194$);
        var10 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic194$);
        var11 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic194$);
        var12 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic194$);
        var13 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic194$);
        var14 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var15;
            var6 = (var15 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic184$, var8, (SubLObject)module0580.$ic115$)), (SubLObject)ConsesLow.list(var10, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic195$, var8)), (SubLObject)ConsesLow.list(var11, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic196$, var8)), (SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic197$, var8)), (SubLObject)ConsesLow.list(var13, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic198$, var8)), (SubLObject)ConsesLow.list(var14, var8)), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic191$, var13, var14, var10, var11, var12), ConsesLow.append(var15, (SubLObject)module0580.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic194$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35585(final SubLObject var126, final SubLObject var146, final SubLObject var161) {
        assert module0580.NIL != module0581.f35648(var126) : var126;
        final SubLObject var162 = module0751.f46648(var126, (SubLObject)module0580.UNPROVIDED);
        final SubLObject var163 = (module0580.NIL != module0035.f2002(var162, (SubLObject)module0580.ZERO_INTEGER, (SubLObject)module0580.UNPROVIDED)) ? module0581.f35674(module0581.f35671(var162, (SubLObject)module0580.ZERO_INTEGER), var146, Symbols.symbol_function((SubLObject)module0580.$ic200$), Symbols.symbol_function((SubLObject)module0580.IDENTITY), var161, (SubLObject)module0580.UNPROVIDED) : var161;
        if (!var163.isInteger()) {
            final SubLObject var164 = Sequences.cconcatenate((SubLObject)module0580.$ic97$, new SubLObject[] { module0006.f205((SubLObject)module0580.ONE_INTEGER), module0580.$ic98$, module0006.f203((SubLObject)module0580.$ic201$) });
            module0578.f35476(var164, (SubLObject)ConsesLow.list(module0581.f35681(var126, (SubLObject)module0580.UNPROVIDED), module0581.f35681(module0581.f35679(var146, var161, (SubLObject)module0580.UNPROVIDED), (SubLObject)module0580.UNPROVIDED)));
        }
        return var163;
    }
    
    public static SubLObject f35586(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic202$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic202$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic202$);
        var9 = var6.first();
        var6 = var6.rest();
        SubLObject var10 = (SubLObject)module0580.NIL;
        SubLObject var11 = var6;
        SubLObject var12 = (SubLObject)module0580.NIL;
        SubLObject var171_172 = (SubLObject)module0580.NIL;
        while (module0580.NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)module0580.$ic202$);
            var171_172 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)module0580.$ic202$);
            if (module0580.NIL == conses_high.member(var171_172, (SubLObject)module0580.$ic203$, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED)) {
                var12 = (SubLObject)module0580.T;
            }
            if (var171_172 == module0580.$ic150$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (module0580.NIL != var12 && module0580.NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic202$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic204$, var6);
        final SubLObject var14 = (SubLObject)((module0580.NIL != var13) ? conses_high.cadr(var13) : module0580.NIL);
        final SubLObject var15;
        var6 = (var15 = var7);
        return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic205$, (SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic206$, var9), var14), ConsesLow.append(var15, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35587(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic208$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        SubLObject var10 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic208$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic208$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic208$);
        var10 = var6.first();
        var6 = var6.rest();
        SubLObject var11 = (SubLObject)module0580.NIL;
        SubLObject var12 = var6;
        SubLObject var13 = (SubLObject)module0580.NIL;
        SubLObject var183_184 = (SubLObject)module0580.NIL;
        while (module0580.NIL != var12) {
            cdestructuring_bind.destructuring_bind_must_consp(var12, var5, (SubLObject)module0580.$ic208$);
            var183_184 = var12.first();
            var12 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var12, var5, (SubLObject)module0580.$ic208$);
            if (module0580.NIL == conses_high.member(var183_184, (SubLObject)module0580.$ic209$, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED)) {
                var13 = (SubLObject)module0580.T;
            }
            if (var183_184 == module0580.$ic150$) {
                var11 = var12.first();
            }
            var12 = var12.rest();
        }
        if (module0580.NIL != var13 && module0580.NIL == var11) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic208$);
        }
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic210$, var6);
        final SubLObject var15 = (SubLObject)((module0580.NIL != var14) ? conses_high.cadr(var14) : module0580.$ic211$);
        final SubLObject var16;
        var6 = (var16 = var7);
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic212$, (SubLObject)module0580.$ic213$, (SubLObject)module0580.$ic214$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic215$, var10), (SubLObject)module0580.$ic216$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic217$, var15)), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic218$, (SubLObject)ConsesLow.list(var8, var9), ConsesLow.append(var16, (SubLObject)module0580.NIL)));
    }
    
    public static SubLObject f35588() {
        return module0067.f4880(Symbols.symbol_function((SubLObject)module0580.EQL), (SubLObject)module0580.UNPROVIDED);
    }
    
    public static SubLObject f35589(final SubLObject var187) {
        final SubLThread var188 = SubLProcess.currentSubLThread();
        assert module0580.NIL != module0753.f47248(var187) : var187;
        final SubLObject var189 = module0753.f47249(var187);
        final SubLObject var190 = module0753.f47250(var187);
        SubLObject var191 = (SubLObject)module0580.NIL;
        final SubLObject var192 = module0580.$g4368$.getDynamicValue(var188);
        if (var192.eql((SubLObject)module0580.$ic211$)) {
            var191 = module0751.f46953(var190);
        }
        else {
            final SubLObject var193 = Sequences.cconcatenate((SubLObject)module0580.$ic97$, new SubLObject[] { module0006.f205((SubLObject)module0580.$ic220$), module0580.$ic98$, module0006.f203(module0580.$g4368$.getDynamicValue(var188)) });
            module0578.f35476(var193, (SubLObject)ConsesLow.list(module0580.EMPTY_SUBL_OBJECT_ARRAY));
        }
        f35590(var189, var191, module0012.$g90$.getDynamicValue(var188));
        return module0012.$g90$.getDynamicValue(var188);
    }
    
    public static SubLObject f35590(final SubLObject var188, final SubLObject var189, final SubLObject var190) {
        module0067.f4886(var190, var188, var189);
        return var190;
    }
    
    public static SubLObject f35591(final SubLObject var191) {
        final SubLThread var192 = SubLProcess.currentSubLThread();
        SubLObject var193;
        for (var193 = module0066.f4838(module0067.f4891(var191)); module0580.NIL == module0066.f4841(var193); var193 = module0066.f4840(var193)) {
            var192.resetMultipleValues();
            final SubLObject var194 = module0066.f4839(var193);
            final SubLObject var195 = var192.secondMultipleValue();
            var192.resetMultipleValues();
            f35590(var194, var195, module0012.$g94$.getDynamicValue(var192));
        }
        module0066.f4842(var193);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35592(final SubLObject var193) {
        return module0035.f2319(module0084.f5794(var193, Symbols.symbol_function((SubLObject)module0580.$ic221$)));
    }
    
    public static SubLObject f35593(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic222$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic222$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            final SubLObject var10 = (SubLObject)module0580.$ic223$;
            return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic139$, var8, (SubLObject)module0580.$ic224$), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list(reader.bq_cons(var10, (SubLObject)module0580.$ic225$), (SubLObject)module0580.$ic226$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic227$, var8)), ConsesLow.append(var9, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic55$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic228$, var10), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic229$, (SubLObject)module0580.$ic227$, var10))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic222$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35594(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic230$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic230$);
        var8 = var6.first();
        var6 = var6.rest();
        final SubLObject var9 = var6.isCons() ? var6.first() : f35595();
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)module0580.$ic230$);
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var10;
            var6 = (var10 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic231$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic232$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic233$, var9)), (SubLObject)module0580.$ic234$), (SubLObject)module0580.$ic235$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic93$, (SubLObject)module0580.$ic236$, ConsesLow.append(var10, (SubLObject)module0580.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic139$, var8, (SubLObject)module0580.$ic237$));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic230$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35596() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (!module0580.$g4369$.getDynamicValue(var2).isNumber()) {
            return (SubLObject)module0580.NIL;
        }
        if (module0580.NIL != module0580.$g4370$.getDynamicValue(var2)) {
            return (SubLObject)module0580.T;
        }
        if (f35597().numGE(module0580.$g4369$.getDynamicValue(var2))) {
            module0580.$g4370$.setDynamicValue((SubLObject)module0580.T, var2);
            Errors.warn((SubLObject)module0580.$ic238$);
            return (SubLObject)module0580.T;
        }
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35597() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0580.$g4371$.setDynamicValue(Numbers.add(module0580.$g4371$.getDynamicValue(var2), (SubLObject)module0580.ONE_INTEGER), var2);
        return Time.get_internal_real_time();
    }
    
    public static SubLObject f35598(final SubLObject var203) {
        final SubLThread var204 = SubLProcess.currentSubLThread();
        if (!var203.isNumber()) {
            return module0580.$g4369$.getDynamicValue(var204);
        }
        final SubLObject var205 = f35597();
        final SubLObject var206 = Numbers.floor(Numbers.multiply(var203, time_high.$internal_time_units_per_second$.getGlobalValue()), (SubLObject)module0580.UNPROVIDED);
        return module0048.f3382(Sequences.remove((SubLObject)module0580.NIL, (SubLObject)ConsesLow.list(module0580.$g4369$.getDynamicValue(var204), Numbers.add(var205, var206)), (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED), (SubLObject)module0580.UNPROVIDED);
    }
    
    public static SubLObject f35595() {
        final SubLObject var206 = f35599();
        return (SubLObject)((module0580.NIL != module0048.f3293(var206)) ? var206 : module0580.NIL);
    }
    
    public static SubLObject f35599() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0580.NIL != module0579.f35495()) {
            return module0580.$g4372$.getDynamicValue(var2);
        }
        return module0048.f3326();
    }
    
    public static SubLObject f35600(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic241$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic242$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic28$, var7, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic243$, var7), (SubLObject)module0580.$ic244$))), ConsesLow.append(var8, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35601(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic245$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic246$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic28$, var7, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic243$, var7), (SubLObject)module0580.$ic247$))), ConsesLow.append(var8, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35602(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic248$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic248$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic248$);
        var9 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var10;
            var6 = (var10 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic249$, var8, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic250$, var9, ConsesLow.append(var10, (SubLObject)module0580.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic248$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35603(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic251$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        final SubLObject var8 = (SubLObject)(var6.isCons() ? var6.first() : module0580.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)module0580.$ic251$);
        var6 = var6.rest();
        if (module0580.NIL != var6) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic251$);
            return (SubLObject)module0580.NIL;
        }
        final SubLObject var9;
        var6 = (var9 = var7);
        if (module0580.NIL == var8) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic252$, (SubLObject)module0580.$ic242$, ConsesLow.append(var9, (SubLObject)module0580.NIL));
        }
        final SubLObject var10 = (SubLObject)module0580.$ic253$;
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic254$, (SubLObject)module0580.NIL, ConsesLow.append(var9, (SubLObject)module0580.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic55$, var8, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list(reader.bq_cons(var10, (SubLObject)module0580.$ic255$)), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic93$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic256$, var10, (SubLObject)module0580.$ic244$), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic242$, var10)), (SubLObject)module0580.$ic257$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic252$, (SubLObject)module0580.$ic242$, ConsesLow.append(var9, (SubLObject)module0580.NIL)))))));
    }
    
    public static SubLObject f35604(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic252$, (SubLObject)module0580.$ic258$, ConsesLow.append(var7, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35605(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic259$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        SubLObject var10 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic259$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic259$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic259$);
        var10 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var11;
            var6 = (var11 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic260$, (SubLObject)ConsesLow.listS(var8, var9, (SubLObject)module0580.$ic261$), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic93$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic262$, var10, (SubLObject)ConsesLow.listS((SubLObject)module0580.EQ, var8, (SubLObject)module0580.$ic263$)), ConsesLow.append(var11, (SubLObject)module0580.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic259$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35606(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic264$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic264$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic264$);
        var9 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var10;
            var6 = (var10 = var7);
            final SubLObject var11 = (SubLObject)module0580.$ic265$;
            return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var11, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic44$, (SubLObject)module0580.$ic266$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic46$, var8))), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic266$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic44$, (SubLObject)module0580.$ic266$, var8))), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic55$, var11, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic267$, (SubLObject)module0580.ONE_INTEGER, (SubLObject)module0580.$ic268$, var9)), ConsesLow.append(var10, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0580.$ic55$, var11, (SubLObject)module0580.$ic269$))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic264$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35607(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic270$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        final SubLObject var8 = var6.isCons() ? var6.first() : module0579.$g4288$.getGlobalValue();
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)module0580.$ic270$);
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic271$, var8, (SubLObject)module0580.$ic272$), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic273$, var8)), ConsesLow.append(var9, (SubLObject)module0580.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic270$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35608(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic270$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        final SubLObject var8 = var6.isCons() ? var6.first() : module0579.$g4288$.getGlobalValue();
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)module0580.$ic270$);
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic271$, var8, (SubLObject)module0580.$ic272$), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic273$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic274$, var8))), ConsesLow.append(var9, (SubLObject)module0580.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic270$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35609(final SubLObject var11) {
        return module0048.f3331(var11);
    }
    
    public static SubLObject f35610(final SubLObject var240) {
        final SubLThread var241 = SubLProcess.currentSubLThread();
        final SubLObject var242 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)module0580.$ic276$), (SubLObject)ConsesLow.list(var240, module0579.$g4287$.getDynamicValue(var241)), (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED);
        return (module0580.NIL != var242) ? module0048.f3382(var242, (SubLObject)module0580.UNPROVIDED) : module0048.f3326();
    }
    
    public static SubLObject f35611(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)module0580.$ic277$, ConsesLow.append(var7, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35612(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic278$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic278$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)module0580.$ic279$, var8), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic280$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic281$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic282$, var8))), (SubLObject)module0580.$ic283$), reader.bq_cons((SubLObject)module0580.$ic284$, ConsesLow.append(var9, (SubLObject)module0580.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic278$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35613(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        final SubLObject var8 = (SubLObject)module0580.$ic285$;
        final SubLObject var9 = (SubLObject)module0580.$ic286$;
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic49$, (SubLObject)ConsesLow.list(var8, var9), (SubLObject)module0580.$ic287$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic288$, (SubLObject)ConsesLow.list(var8, var9), ConsesLow.append(var7, (SubLObject)module0580.NIL)));
    }
    
    public static SubLObject f35614() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0580.NIL != module0579.$g4309$.getDynamicValue(var2)) {
            module0016.f892();
            module0016.f895();
        }
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35615() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0579.$g4298$.getDynamicValue(var2);
        final SubLObject var4 = module0579.$g4301$.getDynamicValue(var2);
        return Values.values(var3, var4);
    }
    
    public static SubLObject f35616(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic291$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic291$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            final SubLObject var10 = (SubLObject)module0580.$ic292$;
            return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, reader.bq_cons(reader.bq_cons(var10, (SubLObject)module0580.$ic293$), (SubLObject)module0580.$ic294$), (SubLObject)module0580.$ic295$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic92$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic296$, var10)), ConsesLow.append(var9, (SubLObject)module0580.NIL)), (SubLObject)module0580.$ic297$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic116$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic298$, var8), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic1$, (SubLObject)module0580.$ic299$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic267$, (SubLObject)module0580.ONE_INTEGER, (SubLObject)module0580.$ic300$, (SubLObject)module0580.$ic296$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic301$, var10)), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic302$, var10)), (SubLObject)module0580.$ic303$)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic291$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35617(final SubLObject var255) {
        final SubLThread var256 = SubLProcess.currentSubLThread();
        module0754.f47306();
        SubLObject var257;
        for (var257 = module0066.f4838(module0067.f4891(var255)); module0580.NIL == module0066.f4841(var257); var257 = module0066.f4840(var257)) {
            var256.resetMultipleValues();
            final SubLObject var258 = module0066.f4839(var257);
            final SubLObject var259 = var256.secondMultipleValue();
            var256.resetMultipleValues();
            module0067.f4886(module0579.$g4323$.getDynamicValue(var256), var258, var259);
        }
        module0066.f4842(var257);
        return module0579.$g4323$.getDynamicValue(var256);
    }
    
    public static SubLObject f35618(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        final SubLObject var8 = (SubLObject)module0580.$ic305$;
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic306$, reader.bq_cons(var8, (SubLObject)module0580.$ic307$), (SubLObject)module0580.$ic308$), (SubLObject)module0580.$ic309$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic92$, reader.bq_cons((SubLObject)module0580.$ic1$, ConsesLow.append(var7, (SubLObject)module0580.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic310$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic311$, (SubLObject)module0580.$ic312$, var8))), (SubLObject)module0580.$ic313$)));
    }
    
    public static SubLObject f35619(final SubLObject var261) {
        SubLObject var262 = var261;
        SubLObject var263 = (SubLObject)module0580.NIL;
        var263 = var262.first();
        while (module0580.NIL != var262) {
            if (module0580.NIL != module0578.f35470((SubLObject)module0580.TWO_INTEGER)) {
                PrintLow.format((SubLObject)module0580.T, (SubLObject)module0580.$ic316$, var263);
            }
            module0754.f47316(var263);
            module0755.f47450(var263);
            var262 = var262.rest();
            var263 = var262.first();
        }
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35620(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic317$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        SubLObject var10 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic317$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic317$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic317$);
        var10 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            var6 = var7;
            SubLObject var11 = (SubLObject)module0580.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic317$);
            var11 = var6.first();
            final SubLObject var12;
            var6 = (var12 = var6.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic318$, (SubLObject)ConsesLow.list(var8, var9, var10), var11, ConsesLow.append(var12, (SubLObject)module0580.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic317$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35621(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic319$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic319$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic319$);
        var9 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var10;
            var6 = (var10 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic320$, var9))), ConsesLow.append(var10, (SubLObject)module0580.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic319$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35622(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic321$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic321$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic321$);
        var9 = var6.first();
        var6 = var6.rest();
        SubLObject var10 = (SubLObject)module0580.NIL;
        SubLObject var11 = var6;
        SubLObject var12 = (SubLObject)module0580.NIL;
        SubLObject var282_283 = (SubLObject)module0580.NIL;
        while (module0580.NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)module0580.$ic321$);
            var282_283 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)module0580.$ic321$);
            if (module0580.NIL == conses_high.member(var282_283, (SubLObject)module0580.$ic322$, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED)) {
                var12 = (SubLObject)module0580.T;
            }
            if (var282_283 == module0580.$ic150$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (module0580.NIL != var12 && module0580.NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic321$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic323$, var6);
        final SubLObject var14 = (SubLObject)((module0580.NIL != var13) ? conses_high.cadr(var13) : module0580.NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic324$, var6);
        final SubLObject var16 = (module0580.NIL != var15) ? conses_high.cadr(var15) : module0751.f46691();
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic325$, var6);
        final SubLObject var18 = (SubLObject)((module0580.NIL != var17) ? conses_high.cadr(var17) : module0580.$ic326$);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic327$, var6);
        final SubLObject var20 = (SubLObject)((module0580.NIL != var19) ? conses_high.cadr(var19) : module0580.$ic328$);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic329$, var6);
        final SubLObject var22 = (SubLObject)((module0580.NIL != var21) ? conses_high.cadr(var21) : module0580.NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic204$, var6);
        final SubLObject var24 = (SubLObject)((module0580.NIL != var23) ? conses_high.cadr(var23) : module0580.NIL);
        final SubLObject var25;
        var6 = (var25 = var7);
        final SubLObject var26 = (SubLObject)module0580.$ic330$;
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic331$, var9, var22, var14, var20, var16))), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic92$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic175$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic262$, var24, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic332$, var26)), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic49$, (SubLObject)ConsesLow.list(var8, var18), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic333$, var26), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic191$, var18), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic55$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic334$, var8), ConsesLow.append(var25, (SubLObject)module0580.NIL))))), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic335$, var26));
    }
    
    public static SubLObject f35623(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic336$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        SubLObject var9 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic336$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic336$);
        var9 = var6.first();
        var6 = var6.rest();
        SubLObject var10 = (SubLObject)module0580.NIL;
        SubLObject var11 = var6;
        SubLObject var12 = (SubLObject)module0580.NIL;
        SubLObject var303_304 = (SubLObject)module0580.NIL;
        while (module0580.NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)module0580.$ic336$);
            var303_304 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)module0580.$ic336$);
            if (module0580.NIL == conses_high.member(var303_304, (SubLObject)module0580.$ic337$, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED)) {
                var12 = (SubLObject)module0580.T;
            }
            if (var303_304 == module0580.$ic150$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (module0580.NIL != var12 && module0580.NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic336$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic338$, var6);
        final SubLObject var14 = (SubLObject)((module0580.NIL != var13) ? conses_high.cadr(var13) : module0580.NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic324$, var6);
        final SubLObject var16 = (SubLObject)((module0580.NIL != var15) ? conses_high.cadr(var15) : module0580.NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic327$, var6);
        final SubLObject var18 = (SubLObject)((module0580.NIL != var17) ? conses_high.cadr(var17) : module0580.$ic328$);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)module0580.$ic204$, var6);
        final SubLObject var20 = (SubLObject)((module0580.NIL != var19) ? conses_high.cadr(var19) : module0580.NIL);
        final SubLObject var21;
        var6 = (var21 = var7);
        final SubLObject var22 = (SubLObject)module0580.$ic339$;
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic340$, (SubLObject)ConsesLow.list(new SubLObject[] { var22, var9, module0580.$ic329$, var14, module0580.$ic324$, var16, module0580.$ic327$, var18, module0580.$ic204$, var20 }), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic341$, var22, var9, var16, var18))), ConsesLow.append(var21, (SubLObject)module0580.NIL)));
    }
    
    public static SubLObject f35624() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0580.$g4374$.getDynamicValue(var2);
    }
    
    public static SubLObject f35625() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)SubLObjectFactory.makeBoolean(module0580.NIL != module0580.$g4376$.getDynamicValue(var2) && module0580.NIL != module0580.$g4377$.getDynamicValue(var2));
        return var3;
    }
    
    public static SubLObject f35626(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        final SubLObject var8 = (SubLObject)module0580.$ic345$;
        final SubLObject var9 = (SubLObject)module0580.$ic346$;
        final SubLObject var10 = (SubLObject)module0580.$ic347$;
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list(reader.bq_cons(var10, (SubLObject)module0580.$ic348$), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic349$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic28$, var10, (SubLObject)module0580.$ic350$)), (SubLObject)module0580.$ic351$, reader.bq_cons(var8, (SubLObject)module0580.$ic115$), reader.bq_cons(var9, (SubLObject)module0580.$ic115$)), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic352$, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic262$, var8, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic46$, var9)), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic55$, var8, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic353$, var8), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic139$, var8, (SubLObject)module0580.$ic115$)), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic354$, (SubLObject)module0580.$ic355$, var8, ConsesLow.append(var7, (SubLObject)module0580.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic139$, var9, (SubLObject)module0580.$ic172$)));
    }
    
    public static SubLObject f35627() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)SubLObjectFactory.makeBoolean(module0580.NIL == module0580.$g4377$.getDynamicValue(var2));
        return var3;
    }
    
    public static SubLObject f35628(final SubLObject var316) {
        Dynamic.sublisp_throw((SubLObject)module0580.$ic355$, var316);
        return var316;
    }
    
    public static SubLObject f35629(final SubLObject var317) {
        final SubLThread var318 = SubLProcess.currentSubLThread();
        if (module0580.NIL == f35625()) {
            final SubLObject var319 = Sequences.cconcatenate((SubLObject)module0580.$ic97$, new SubLObject[] { module0006.f205((SubLObject)module0580.ONE_INTEGER), module0580.$ic98$, module0006.f203((SubLObject)module0580.$ic357$) });
            module0578.f35476(var319, (SubLObject)ConsesLow.list(module0580.EMPTY_SUBL_OBJECT_ARRAY));
        }
        if (module0580.NIL != module0077.f5320(var317, module0580.$g4375$.getDynamicValue(var318))) {
            final SubLObject var319 = Sequences.cconcatenate((SubLObject)module0580.$ic97$, new SubLObject[] { module0006.f205((SubLObject)module0580.ONE_INTEGER), module0580.$ic98$, module0006.f203((SubLObject)module0580.$ic358$) });
            module0578.f35476(var319, (SubLObject)ConsesLow.list(var317));
        }
        module0077.f5326(var317, module0580.$g4375$.getDynamicValue(var318));
        if (module0077.f5311(module0580.$g4375$.getDynamicValue(var318)).numG(module0580.$g4374$.getDynamicValue(var318))) {
            final SubLObject var319 = Sequences.cconcatenate((SubLObject)module0580.$ic97$, new SubLObject[] { module0006.f205((SubLObject)module0580.TWO_INTEGER), module0580.$ic98$, module0006.f203((SubLObject)module0580.$ic359$) });
            module0578.f35476(var319, (SubLObject)ConsesLow.list(module0580.$g4374$.getDynamicValue(var318), var317));
        }
        return module0580.$g4375$.getDynamicValue(var318);
    }
    
    public static SubLObject f35630(final SubLObject var318) {
        final SubLThread var319 = SubLProcess.currentSubLThread();
        SubLObject var320 = (SubLObject)module0580.ZERO_INTEGER;
        if (module0580.NIL != module0580.$g4377$.getDynamicValue(var319)) {
            SubLObject var321 = (SubLObject)module0580.NIL;
            final SubLObject var322 = module0077.f5333(module0580.$g4375$.getDynamicValue(var319));
            SubLObject var323;
            SubLObject var324;
            SubLObject var325;
            for (var323 = module0032.f1741(var322), var324 = (SubLObject)module0580.NIL, var324 = module0032.f1742(var323, var322); module0580.NIL == module0032.f1744(var323, var324); var324 = module0032.f1743(var324)) {
                var325 = module0032.f1745(var323, var324);
                if (module0580.NIL != module0032.f1746(var324, var325) && conses_high.getf(var325, (SubLObject)module0580.$ic360$, (SubLObject)module0580.UNPROVIDED).equal(var318)) {
                    var321 = (SubLObject)ConsesLow.cons(var325, var321);
                }
            }
            SubLObject var326 = var321;
            SubLObject var327 = (SubLObject)module0580.NIL;
            var327 = var326.first();
            while (module0580.NIL != var326) {
                var320 = Numbers.add(var320, (SubLObject)module0580.ONE_INTEGER);
                module0077.f5327(var327, module0580.$g4375$.getDynamicValue(var319));
                var326 = var326.rest();
                var327 = var326.first();
            }
            if (var320.isPositive() && module0580.NIL != module0578.f35470((SubLObject)module0580.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0580.T, (SubLObject)module0580.$ic361$, var320, var318);
            }
        }
        return var320;
    }
    
    public static SubLObject f35631(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic362$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic362$);
        var8 = var6.first();
        var6 = var6.rest();
        final SubLObject var9 = (SubLObject)(var6.isCons() ? var6.first() : module0580.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)module0580.$ic362$);
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var10;
            var6 = (var10 = var7);
            final SubLObject var11 = (SubLObject)module0580.$ic363$;
            return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var11, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic364$, var8, var9))), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic365$, var8, var11), reader.bq_cons((SubLObject)module0580.$ic92$, ConsesLow.append(var10, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic366$, var8, var11)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic362$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35632(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic367$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0580.$ic368$, var7)), ConsesLow.append(var8, (SubLObject)module0580.NIL));
    }
    
    public static SubLObject f35633(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic291$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0580.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0580.$ic291$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0580.NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            final SubLObject var10 = (SubLObject)module0580.$ic369$;
            return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, (SubLObject)ConsesLow.list((SubLObject)module0580.$ic370$, var8))), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic92$, reader.bq_cons((SubLObject)module0580.$ic1$, ConsesLow.append(var9, (SubLObject)module0580.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic371$, var8, var10)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0580.$ic291$);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35634(final SubLObject var97) {
        SubLObject var98 = (SubLObject)module0580.NIL;
        if (module0580.NIL != module0751.f47213(module0756.f47487(var97, (SubLObject)module0580.UNPROVIDED))) {
            var98 = module0756.f47487(var97, (SubLObject)module0580.UNPROVIDED);
            if (module0580.NIL != module0578.f35470((SubLObject)module0580.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0580.T, (SubLObject)module0580.$ic373$, var98);
            }
            module0756.f47745(var97, module0751.f46604((SubLObject)module0580.$ic374$));
            final SubLObject var99 = module0756.f47488(var97, (SubLObject)module0580.UNPROVIDED);
            final SubLObject var100 = module0751.f47143(var98, var99);
            if (!var99.equal(var100)) {
                if (module0580.NIL != module0578.f35470((SubLObject)module0580.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0580.T, (SubLObject)module0580.$ic375$, var100);
                }
                module0756.f47784(var97, var100, (SubLObject)module0580.UNPROVIDED);
                if (module0580.NIL != module0578.f35470((SubLObject)module0580.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0580.T, (SubLObject)module0580.$ic376$, module0756.f47488(var97, (SubLObject)module0580.UNPROVIDED));
                }
            }
        }
        return var98;
    }
    
    public static SubLObject f35635(final SubLObject var97, final SubLObject var318, SubLObject var339) {
        if (var339 == module0580.UNPROVIDED) {
            var339 = module0579.$g4256$.getDynamicValue();
        }
        if (module0580.NIL != module0751.f47213(var318)) {
            f35636(var97, var318);
            if (module0580.NIL != module0756.f47479(var97)) {
                f35637(var97, module0751.f47144(var318), var339);
                if (module0580.NIL != module0756.f47760(var97)) {
                    module0758.f47893(var97);
                }
            }
        }
        return var97;
    }
    
    public static SubLObject f35637(final SubLObject var97, final SubLObject var340, SubLObject var339) {
        if (var339 == module0580.UNPROVIDED) {
            var339 = (SubLObject)module0580.NIL;
        }
        final SubLThread var341 = SubLProcess.currentSubLThread();
        if (module0580.NIL != module0751.f47145(var340)) {
            if (module0580.NIL != module0578.f35470((SubLObject)module0580.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0580.T, (SubLObject)module0580.$ic377$, module0756.f47467(var97));
            }
            SubLObject var342 = (SubLObject)module0580.NIL;
            SubLObject var343 = (SubLObject)module0580.NIL;
            final SubLObject var344 = Errors.$continue_cerrorP$.currentBinding(var341);
            final SubLObject var345 = module0578.$g4234$.currentBinding(var341);
            try {
                Errors.$continue_cerrorP$.bind((SubLObject)module0580.NIL, var341);
                module0578.$g4234$.bind((SubLObject)module0580.T, var341);
                if (module0580.NIL != module0578.f35473()) {
                    final SubLObject var346 = f35627();
                    final SubLObject var99_345 = module0580.$g4375$.currentBinding(var341);
                    final SubLObject var343_346 = module0580.$g4377$.currentBinding(var341);
                    try {
                        module0580.$g4375$.bind((module0580.NIL != var346) ? module0077.f5313(Symbols.symbol_function((SubLObject)module0580.EQUAL), f35624()) : module0580.$g4375$.getDynamicValue(var341), var341);
                        module0580.$g4377$.bind((SubLObject)module0580.T, var341);
                        for (SubLObject var347 = (SubLObject)module0580.NIL, var348 = (SubLObject)module0580.NIL; module0580.NIL != var347 || module0580.NIL == var348; var348 = (SubLObject)module0580.T) {
                            if (module0580.NIL != var347) {
                                f35629(var347);
                                var347 = (SubLObject)module0580.NIL;
                            }
                            try {
                                var341.throwStack.push(module0580.$ic355$);
                                if (module0580.NIL == var342) {
                                    var341.resetMultipleValues();
                                    final SubLObject var349 = f35638(var97, var340, var339);
                                    final SubLObject var350 = var341.secondMultipleValue();
                                    var341.resetMultipleValues();
                                    if (module0580.NIL != var350) {
                                        if (module0580.NIL != module0578.f35470((SubLObject)module0580.ONE_INTEGER) && module0580.NIL == module0578.f35477()) {
                                            Errors.warn((SubLObject)module0580.$ic378$, var350);
                                        }
                                        module0756.f47501(var97, (SubLObject)module0580.NIL, (SubLObject)module0580.UNPROVIDED);
                                        var342 = (SubLObject)module0580.T;
                                    }
                                    else {
                                        final SubLObject var351 = f35639(var97);
                                        SubLObject var353;
                                        final SubLObject var352 = var353 = var349;
                                        SubLObject var354 = (SubLObject)module0580.NIL;
                                        SubLObject var355 = (SubLObject)module0580.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var353, var352, (SubLObject)module0580.$ic379$);
                                        var354 = var353.first();
                                        var353 = var353.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var353, var352, (SubLObject)module0580.$ic379$);
                                        var355 = var353.first();
                                        var353 = var353.rest();
                                        if (module0580.NIL == var353) {
                                            if (module0580.NIL != module0756.f47478(var97)) {
                                                SubLObject var356 = var354;
                                                SubLObject var357 = (SubLObject)module0580.NIL;
                                                var357 = var356.first();
                                                while (module0580.NIL != var356) {
                                                    if (module0580.NIL != var351) {
                                                        module0756.f47836(var357, var97);
                                                    }
                                                    else {
                                                        module0756.f47834(module0749.f46494((SubLObject)module0580.$ic380$, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED), var97);
                                                        module0756.f47834(var357, var97);
                                                    }
                                                    var356 = var356.rest();
                                                    var357 = var356.first();
                                                }
                                                var356 = Sequences.reverse(var355);
                                                var357 = (SubLObject)module0580.NIL;
                                                var357 = var356.first();
                                                while (module0580.NIL != var356) {
                                                    module0756.f47834(var357, var97);
                                                    var356 = var356.rest();
                                                    var357 = var356.first();
                                                }
                                            }
                                            else {
                                                SubLObject var358 = module0756.f47467(var97);
                                                SubLObject var359 = var354;
                                                SubLObject var360 = (SubLObject)module0580.NIL;
                                                var360 = var359.first();
                                                while (module0580.NIL != var359) {
                                                    var358 = ((module0580.NIL != var351) ? ConsesLow.append(var358, module0756.f47467(var360)) : ConsesLow.append(module0756.f47467(var360), var358));
                                                    var359 = var359.rest();
                                                    var360 = var359.first();
                                                }
                                                var359 = Sequences.reverse(var355);
                                                var360 = (SubLObject)module0580.NIL;
                                                var360 = var359.first();
                                                while (module0580.NIL != var359) {
                                                    var358 = ConsesLow.append(module0756.f47467(var360), var358);
                                                    var359 = var359.rest();
                                                    var360 = var359.first();
                                                }
                                                module0756.f47501(var97, var358, (SubLObject)module0580.UNPROVIDED);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var352, (SubLObject)module0580.$ic379$);
                                        }
                                    }
                                }
                            }
                            catch (Throwable var361) {
                                var347 = Errors.handleThrowable(var361, (SubLObject)module0580.$ic355$);
                            }
                            finally {
                                var341.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        module0580.$g4377$.rebind(var343_346, var341);
                        module0580.$g4375$.rebind(var99_345, var341);
                    }
                }
                else {
                    try {
                        var341.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var99_346 = Errors.$error_handler$.currentBinding(var341);
                        try {
                            Errors.$error_handler$.bind((SubLObject)module0580.$ic381$, var341);
                            try {
                                final SubLObject var362 = f35627();
                                final SubLObject var99_347 = module0580.$g4375$.currentBinding(var341);
                                final SubLObject var343_347 = module0580.$g4377$.currentBinding(var341);
                                try {
                                    module0580.$g4375$.bind((module0580.NIL != var362) ? module0077.f5313(Symbols.symbol_function((SubLObject)module0580.EQUAL), f35624()) : module0580.$g4375$.getDynamicValue(var341), var341);
                                    module0580.$g4377$.bind((SubLObject)module0580.T, var341);
                                    for (SubLObject var363 = (SubLObject)module0580.NIL, var364 = (SubLObject)module0580.NIL; module0580.NIL != var363 || module0580.NIL == var364; var364 = (SubLObject)module0580.T) {
                                        if (module0580.NIL != var363) {
                                            f35629(var363);
                                            var363 = (SubLObject)module0580.NIL;
                                        }
                                        try {
                                            var341.throwStack.push(module0580.$ic355$);
                                            if (module0580.NIL == var342) {
                                                var341.resetMultipleValues();
                                                final SubLObject var365 = f35638(var97, var340, var339);
                                                final SubLObject var366 = var341.secondMultipleValue();
                                                var341.resetMultipleValues();
                                                if (module0580.NIL != var366) {
                                                    if (module0580.NIL != module0578.f35470((SubLObject)module0580.ONE_INTEGER) && module0580.NIL == module0578.f35477()) {
                                                        Errors.warn((SubLObject)module0580.$ic378$, var366);
                                                    }
                                                    module0756.f47501(var97, (SubLObject)module0580.NIL, (SubLObject)module0580.UNPROVIDED);
                                                    var342 = (SubLObject)module0580.T;
                                                }
                                                else {
                                                    final SubLObject var367 = f35639(var97);
                                                    SubLObject var369;
                                                    final SubLObject var368 = var369 = var365;
                                                    SubLObject var370 = (SubLObject)module0580.NIL;
                                                    SubLObject var371 = (SubLObject)module0580.NIL;
                                                    cdestructuring_bind.destructuring_bind_must_consp(var369, var368, (SubLObject)module0580.$ic379$);
                                                    var370 = var369.first();
                                                    var369 = var369.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(var369, var368, (SubLObject)module0580.$ic379$);
                                                    var371 = var369.first();
                                                    var369 = var369.rest();
                                                    if (module0580.NIL == var369) {
                                                        if (module0580.NIL != module0756.f47478(var97)) {
                                                            SubLObject var359 = var370;
                                                            SubLObject var360 = (SubLObject)module0580.NIL;
                                                            var360 = var359.first();
                                                            while (module0580.NIL != var359) {
                                                                if (module0580.NIL != var367) {
                                                                    module0756.f47836(var360, var97);
                                                                }
                                                                else {
                                                                    module0756.f47834(module0749.f46494((SubLObject)module0580.$ic380$, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED), var97);
                                                                    module0756.f47834(var360, var97);
                                                                }
                                                                var359 = var359.rest();
                                                                var360 = var359.first();
                                                            }
                                                            var359 = Sequences.reverse(var371);
                                                            var360 = (SubLObject)module0580.NIL;
                                                            var360 = var359.first();
                                                            while (module0580.NIL != var359) {
                                                                module0756.f47834(var360, var97);
                                                                var359 = var359.rest();
                                                                var360 = var359.first();
                                                            }
                                                        }
                                                        else {
                                                            SubLObject var372 = module0756.f47467(var97);
                                                            SubLObject var373 = var370;
                                                            SubLObject var374 = (SubLObject)module0580.NIL;
                                                            var374 = var373.first();
                                                            while (module0580.NIL != var373) {
                                                                var372 = ((module0580.NIL != var367) ? ConsesLow.append(var372, module0756.f47467(var374)) : ConsesLow.append(module0756.f47467(var374), var372));
                                                                var373 = var373.rest();
                                                                var374 = var373.first();
                                                            }
                                                            var373 = Sequences.reverse(var371);
                                                            var374 = (SubLObject)module0580.NIL;
                                                            var374 = var373.first();
                                                            while (module0580.NIL != var373) {
                                                                var372 = ConsesLow.append(module0756.f47467(var374), var372);
                                                                var373 = var373.rest();
                                                                var374 = var373.first();
                                                            }
                                                            module0756.f47501(var97, var372, (SubLObject)module0580.UNPROVIDED);
                                                        }
                                                    }
                                                    else {
                                                        cdestructuring_bind.cdestructuring_bind_error(var368, (SubLObject)module0580.$ic379$);
                                                    }
                                                }
                                            }
                                        }
                                        catch (Throwable var375) {
                                            var363 = Errors.handleThrowable(var375, (SubLObject)module0580.$ic355$);
                                        }
                                        finally {
                                            var341.throwStack.pop();
                                        }
                                    }
                                }
                                finally {
                                    module0580.$g4377$.rebind(var343_347, var341);
                                    module0580.$g4375$.rebind(var99_347, var341);
                                }
                            }
                            catch (Throwable var376) {
                                Errors.handleThrowable(var376, (SubLObject)module0580.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var99_346, var341);
                        }
                    }
                    catch (Throwable var377) {
                        var343 = Errors.handleThrowable(var377, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var341.throwStack.pop();
                    }
                    if (var343.isString() && module0580.NIL == module0578.f35477()) {
                        Errors.warn(Sequences.cconcatenate(module0752.f47234(var343), (SubLObject)module0580.$ic382$), module0579.f35508());
                    }
                }
            }
            finally {
                module0578.$g4234$.rebind(var345, var341);
                Errors.$continue_cerrorP$.rebind(var344, var341);
            }
            if (module0580.NIL != var342) {
                return (SubLObject)module0580.$ic383$;
            }
            if (module0580.NIL != module0578.f35470((SubLObject)module0580.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0580.T, (SubLObject)module0580.$ic384$, module0756.f47467(var97));
            }
        }
        return module0756.f47467(var97);
    }
    
    public static SubLObject f35639(final SubLObject var97) {
        if (module0580.NIL != module0756.f47822(var97)) {
            return (SubLObject)module0580.NIL;
        }
        return (SubLObject)module0580.T;
    }
    
    public static SubLObject f35638(final SubLObject var97, final SubLObject var340, SubLObject var339) {
        if (var339 == module0580.UNPROVIDED) {
            var339 = (SubLObject)module0580.NIL;
        }
        final SubLThread var341 = SubLProcess.currentSubLThread();
        final SubLObject var342 = module0751.f47200();
        SubLObject var343 = (SubLObject)module0580.NIL;
        SubLObject var344 = (SubLObject)module0580.NIL;
        SubLObject var345 = (SubLObject)module0580.NIL;
        if (module0580.NIL != module0751.f47145(var340)) {
            SubLObject var346 = (SubLObject)module0580.NIL;
            SubLObject var347 = (SubLObject)module0580.NIL;
            SubLObject var348 = (SubLObject)module0580.NIL;
            var346 = var340;
            var347 = var346.first();
            for (var348 = (SubLObject)module0580.ZERO_INTEGER; module0580.NIL == var345 && module0580.NIL != var346; var346 = var346.rest(), var347 = var346.first(), var348 = Numbers.add((SubLObject)module0580.ONE_INTEGER, var348)) {
                if (!var347.equal((SubLObject)module0580.$ic385$)) {
                    if (module0580.NIL == module0751.f46684(var347, module0580.$ic386$, (SubLObject)module0580.UNPROVIDED)) {
                        if (module0580.NIL == var339) {
                            final SubLObject var349 = f35640(var340, var348, var342, (SubLObject)module0580.$ic387$);
                            final SubLObject var350 = module0749.f46494((SubLObject)module0580.$ic388$, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED);
                            final SubLObject var351 = module0749.f46494((SubLObject)module0580.$ic380$, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED);
                            if (module0580.NIL == var345) {
                                SubLObject var352 = (SubLObject)ConsesLow.list(var351, var349, var350);
                                SubLObject var353 = (SubLObject)module0580.NIL;
                                var353 = var352.first();
                                while (module0580.NIL == var345 && module0580.NIL != var352) {
                                    module0758.f47878(var353, (SubLObject)module0580.$ic389$, var97);
                                    if (module0580.NIL != module0756.f47479(var353)) {
                                        var344 = (SubLObject)ConsesLow.cons(var353, var344);
                                    }
                                    else {
                                        var345 = var353;
                                    }
                                    var352 = var352.rest();
                                    var353 = var352.first();
                                }
                            }
                        }
                    }
                    else if (module0580.NIL == module0579.$g4258$.getDynamicValue(var341) && module0580.NIL != module0751.f47047(module0205.f13203(var347, (SubLObject)module0580.UNPROVIDED), module0580.$ic390$)) {
                        if (module0580.NIL != module0578.f35470((SubLObject)module0580.ONE_INTEGER)) {
                            PrintLow.format((SubLObject)module0580.T, (SubLObject)module0580.$ic391$, var347);
                        }
                    }
                    else {
                        final SubLObject var349 = f35640(var340, var348, var342, (SubLObject)module0580.UNPROVIDED);
                        module0770.f49065(var349, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED, (SubLObject)module0580.UNPROVIDED);
                        if (module0580.NIL != module0756.f47479(var349)) {
                            var343 = (SubLObject)ConsesLow.cons(var349, var343);
                        }
                        else {
                            var345 = var349;
                        }
                    }
                }
            }
        }
        return Values.values((SubLObject)ConsesLow.list(var343, var344), var345);
    }
    
    public static SubLObject f35640(final SubLObject var340, final SubLObject var369, final SubLObject var373, SubLObject var291) {
        if (var291 == module0580.UNPROVIDED) {
            var291 = (SubLObject)module0580.$ic392$;
        }
        final SubLObject var374 = ConsesLow.nth(var369, var340);
        final SubLObject var375 = f35641(var340, var369);
        final SubLObject var376 = module0751.f46604(var375);
        final SubLObject var377 = module0751.f46693(var373, var376);
        final SubLObject var378 = module0756.f47463(var374, var377, (SubLObject)module0580.UNPROVIDED);
        module0756.f47784(var378, var291, (SubLObject)module0580.UNPROVIDED);
        return var378;
    }
    
    public static SubLObject f35641(final SubLObject var340, final SubLObject var369) {
        return (SubLObject)((module0580.NIL != module0035.f2002(var340, (SubLObject)module0580.ONE_INTEGER, (SubLObject)module0580.UNPROVIDED)) ? ConsesLow.list((SubLObject)module0580.ONE_INTEGER, module0048.f_1X(var369)) : ConsesLow.list((SubLObject)module0580.ONE_INTEGER));
    }
    
    public static SubLObject f35642(final SubLObject var97, final SubLObject var318) {
        if (module0580.NIL != module0751.f47213(var318)) {
            f35636(var97, var318);
        }
        return var97;
    }
    
    public static SubLObject f35636(final SubLObject var97, final SubLObject var318) {
        return module0756.f47465(var97, var318);
    }
    
    public static SubLObject f35643(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        final SubLObject var8 = (SubLObject)module0580.$ic393$;
        return (SubLObject)ConsesLow.list((SubLObject)module0580.$ic4$, (SubLObject)ConsesLow.list(reader.bq_cons(var8, (SubLObject)module0580.$ic394$)), (SubLObject)ConsesLow.list((SubLObject)module0580.$ic92$, (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic1$, (SubLObject)module0580.$ic395$, ConsesLow.append(var7, (SubLObject)module0580.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0580.$ic93$, var8, (SubLObject)module0580.$ic396$)));
    }
    
    public static SubLObject f35644() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35520", "S#39111", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35521", "WITH-PARAPHRASE-MAPPINGS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35522", "S#39112");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35523", "S#39113", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35524", "S#39114");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35525", "S#39115", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35526", "S#39116");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35527", "S#39117");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35528", "WITH-PARAPHRASE-PRECISION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35529", "S#39118");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35530", "WITH-PRECISE-PARAPHRASE-ON");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35531", "WITH-PRECISE-PARAPHRASE-OFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35532", "S#39119");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35533", "S#39120", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35534", "MAXIMIZING-PPH-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35535", "S#39121");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35536", "S#39122", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35537", "S#39123");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35538", "S#39124");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35539", "S#39125");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35540", "S#39126");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35541", "S#39127");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35542", "WITH-PPH-MEMOIZATION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35543", "S#39128");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35544", "S#39129", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35545", "S#39130", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35546", "S#39131", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35548", "S#39063", 1, 0, false);
        new $f35548$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35549", "S#39132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35550", "S#39133", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35551", "S#39134", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35552", "S#39135", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35553", "S#39136", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35547", "S#39137", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35554", "S#39138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35555", "S#39139", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35556", "S#39140", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35557", "S#39141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35558", "S#39142", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35559", "S#39143");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35560", "S#39144", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35561", "S#39145", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35562", "S#39146", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35563", "S#39147");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35564", "S#39148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35565", "S#39149", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35566", "S#39150", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35567", "DESTROYING-NEW-PPH-PHRASES-WHEN-DONE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35568", "S#39151", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35569", "S#39152");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35570", "S#39153");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35571", "S#39154");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35572", "S#39155", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35573", "S#39156", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35574", "S#39157", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35575", "S#39158", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35576", "S#39159");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35577", "S#39160", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35578", "S#39161");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35579", "S#39162");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35580", "S#39163");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35581", "S#39164");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35582", "S#39165", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35583", "S#39166", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35584", "S#39167");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35585", "S#39168", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35586", "S#39169");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35587", "S#39170");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35588", "S#39171", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35589", "S#39172", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35590", "S#39173", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35591", "S#39174", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35592", "S#39175", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35593", "S#39176");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35594", "S#39177");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35596", "S#39178", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35597", "S#39179", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35598", "S#39180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35595", "S#39181", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35599", "S#39182", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35600", "S#39183");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35601", "S#39184");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35602", "S#39185");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35603", "S#39186");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35604", "S#39187");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35605", "S#39188");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35606", "S#39189");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35607", "WITH-PPH-DEMERIT-CUTOFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35608", "S#39190");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35609", "S#39191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35610", "S#39192", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35611", "S#39193");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35612", "S#39194");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35613", "S#39195");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35614", "S#39196", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35615", "S#39197", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35616", "S#39198");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35617", "S#39199", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35618", "S#39200");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35619", "S#39201", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35620", "S#39202");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35621", "S#39203");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35622", "S#39204");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35623", "S#39205");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35624", "S#39206", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35625", "S#39207", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35626", "S#39208");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35627", "S#39209", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35628", "S#39210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35629", "S#39211", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35630", "S#39212", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35631", "S#39213");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35632", "S#39214");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35633", "S#39215");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35634", "S#39216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35635", "S#39217", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35637", "S#39218", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35639", "S#39219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35638", "S#39220", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35640", "S#39221", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35641", "S#39222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35642", "S#39223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0580", "f35636", "S#39224", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0580", "f35643", "S#39225");
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35645() {
        module0580.$g4358$ = SubLFiles.defparameter("S#39226", module0107.f7627());
        module0580.$g4359$ = SubLFiles.defparameter("S#39227", module0107.f7627());
        module0580.$g4360$ = SubLFiles.defconstant("S#39228", (SubLObject)module0580.$ic66$);
        module0580.$g4361$ = SubLFiles.defparameter("S#39229", module0107.f7627());
        module0580.$g4362$ = SubLFiles.defparameter("S#39230", (SubLObject)module0580.NIL);
        module0580.$g4363$ = SubLFiles.defparameter("S#39231", module0107.f7627());
        module0580.$g4364$ = SubLFiles.defparameter("S#39232", (SubLObject)module0580.NIL);
        module0580.$g4365$ = SubLFiles.defparameter("S#39233", (SubLObject)module0580.NIL);
        module0580.$g4366$ = SubLFiles.defparameter("S#39234", module0107.f7627());
        module0580.$g4367$ = SubLFiles.defparameter("S#39235", (SubLObject)module0580.NIL);
        module0580.$g4368$ = SubLFiles.defparameter("S#39236", (SubLObject)module0580.$ic207$);
        module0580.$g4369$ = SubLFiles.defparameter("S#39237", (SubLObject)module0580.NIL);
        module0580.$g4370$ = SubLFiles.defparameter("S#39238", (SubLObject)module0580.NIL);
        module0580.$g4371$ = SubLFiles.defparameter("S#39239", (SubLObject)module0580.ZERO_INTEGER);
        module0580.$g4372$ = SubLFiles.defparameter("S#39240", (SubLObject)module0580.FIVE_INTEGER);
        module0580.$g4373$ = SubLFiles.defvar("S#39241", (SubLObject)module0580.ZERO_INTEGER);
        module0580.$g4374$ = SubLFiles.defparameter("S#39242", (SubLObject)module0580.$ic342$);
        module0580.$g4375$ = SubLFiles.defparameter("S#39243", (SubLObject)module0580.NIL);
        module0580.$g4376$ = SubLFiles.defparameter("S#39244", (SubLObject)module0580.T);
        module0580.$g4377$ = SubLFiles.defparameter("S#39245", (SubLObject)module0580.NIL);
        return (SubLObject)module0580.NIL;
    }
    
    public static SubLObject f35646() {
        module0002.f50((SubLObject)module0580.$ic29$, (SubLObject)module0580.$ic31$);
        module0002.f50((SubLObject)module0580.$ic60$, (SubLObject)module0580.$ic61$);
        module0002.f50((SubLObject)module0580.$ic64$, (SubLObject)module0580.$ic65$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0580.$g4360$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0580.$ic73$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0580.$ic74$);
        Structures.def_csetf((SubLObject)module0580.$ic75$, (SubLObject)module0580.$ic76$);
        Equality.identity((SubLObject)module0580.$ic66$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0580.$g4360$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0580.$ic83$));
        module0002.f50((SubLObject)module0580.$ic85$, (SubLObject)module0580.$ic48$);
        module0002.f50((SubLObject)module0580.$ic95$, (SubLObject)module0580.$ic48$);
        module0002.f50((SubLObject)module0580.$ic103$, (SubLObject)module0580.$ic104$);
        module0002.f50((SubLObject)module0580.$ic108$, (SubLObject)module0580.$ic104$);
        module0002.f50((SubLObject)module0580.$ic122$, (SubLObject)module0580.$ic123$);
        module0002.f50((SubLObject)module0580.$ic127$, (SubLObject)module0580.$ic122$);
        module0002.f50((SubLObject)module0580.$ic129$, (SubLObject)module0580.$ic122$);
        module0002.f50((SubLObject)module0580.$ic131$, (SubLObject)module0580.$ic123$);
        module0002.f50((SubLObject)module0580.$ic132$, (SubLObject)module0580.$ic122$);
        module0002.f50((SubLObject)module0580.$ic140$, (SubLObject)module0580.$ic142$);
        module0002.f50((SubLObject)module0580.$ic178$, (SubLObject)module0580.$ic179$);
        module0002.f50((SubLObject)module0580.$ic181$, (SubLObject)module0580.$ic179$);
        module0002.f50((SubLObject)module0580.$ic192$, (SubLObject)module0580.$ic179$);
        module0002.f50((SubLObject)module0580.$ic187$, (SubLObject)module0580.$ic181$);
        module0002.f50((SubLObject)module0580.$ic182$, (SubLObject)module0580.$ic179$);
        module0002.f50((SubLObject)module0580.$ic185$, (SubLObject)module0580.$ic179$);
        module0002.f50((SubLObject)module0580.$ic233$, (SubLObject)module0580.$ic239$);
        module0002.f50((SubLObject)module0580.$ic240$, (SubLObject)module0580.$ic239$);
        module0002.f50((SubLObject)module0580.$ic274$, (SubLObject)module0580.$ic275$);
        module0002.f50((SubLObject)module0580.$ic289$, (SubLObject)module0580.$ic290$);
        module0002.f50((SubLObject)module0580.$ic302$, (SubLObject)module0580.$ic304$);
        module0002.f50((SubLObject)module0580.$ic314$, (SubLObject)module0580.$ic315$);
        module0002.f50((SubLObject)module0580.$ic343$, (SubLObject)module0580.$ic344$);
        module0002.f50((SubLObject)module0580.$ic356$, (SubLObject)module0580.$ic344$);
        module0002.f50((SubLObject)module0580.$ic353$, (SubLObject)module0580.$ic344$);
        module0002.f50((SubLObject)module0580.$ic370$, (SubLObject)module0580.$ic372$);
        module0002.f50((SubLObject)module0580.$ic371$, (SubLObject)module0580.$ic372$);
        return (SubLObject)module0580.NIL;
    }
    
    public void declareFunctions() {
        f35644();
    }
    
    public void initializeVariables() {
        f35645();
    }
    
    public void runTopLevelForms() {
        f35646();
    }
    
    static {
        me = (SubLFile)new module0580();
        module0580.$g4358$ = null;
        module0580.$g4359$ = null;
        module0580.$g4360$ = null;
        module0580.$g4361$ = null;
        module0580.$g4362$ = null;
        module0580.$g4363$ = null;
        module0580.$g4364$ = null;
        module0580.$g4365$ = null;
        module0580.$g4366$ = null;
        module0580.$g4367$ = null;
        module0580.$g4368$ = null;
        module0580.$g4369$ = null;
        module0580.$g4370$ = null;
        module0580.$g4371$ = null;
        module0580.$g4372$ = null;
        module0580.$g4373$ = null;
        module0580.$g4374$ = null;
        module0580.$g4375$ = null;
        module0580.$g4376$ = null;
        module0580.$g4377$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39246", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic2$ = SubLObjectFactory.makeSymbol("ENFORCE-TYPE");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3593", "CYC"));
        $ic4$ = SubLObjectFactory.makeSymbol("CLET");
        $ic5$ = SubLObjectFactory.makeSymbol("S#38976", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39113", "CYC"));
        $ic8$ = SubLObjectFactory.makeSymbol("S#38977", "CYC");
        $ic9$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#35986", "CYC"));
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39247", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic11$ = SubLObjectFactory.makeSymbol("S#157", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39115", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("S#38978", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39248", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39249", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("MAP")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic15$ = SubLObjectFactory.makeSymbol("DO-ALIST");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38960", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-OF"), (SubLObject)SubLObjectFactory.makeSymbol("S#38960", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0580.EQUALP)))));
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39250", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PRECISION-P"));
        $ic19$ = SubLObjectFactory.makeSymbol("*PARAPHRASE-PRECISION*");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-TERSE-MODE?*"), (SubLObject)module0580.T));
        $ic21$ = SubLObjectFactory.makeSymbol("WITH-PARAPHRASE-PRECISION");
        $ic22$ = SubLObjectFactory.makeSymbol("S#39117", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39251", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39120", "CYC"));
        $ic25$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-MAXIMIZE-LINKS?*"), (SubLObject)module0580.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-LINK-ARG0?*"), (SubLObject)module0580.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), (SubLObject)module0580.NIL));
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39252", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic27$ = SubLObjectFactory.makeSymbol("S#39037", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("FIF");
        $ic29$ = SubLObjectFactory.makeSymbol("S#39122", "CYC");
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNSPECIFIED"));
        $ic31$ = SubLObjectFactory.makeSymbol("S#39121", "CYC");
        $ic32$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#1553", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic33$ = SubLObjectFactory.makeSymbol("S#39002", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("FIRST-OF");
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39002", "CYC"));
        $ic36$ = SubLObjectFactory.makeSymbol("S#39005", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39005", "CYC"));
        $ic38$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37217", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic39$ = SubLObjectFactory.makeSymbol("S#39006", "CYC");
        $ic40$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39002", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("NONE")));
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39003", "CYC"), (SubLObject)module0580.T));
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#151", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic43$ = SubLObjectFactory.makeSymbol("S#39008", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("CAND");
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38940", "CYC"));
        $ic46$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic47$ = SubLObjectFactory.makeUninternedSymbol("US#305812D");
        $ic48$ = SubLObjectFactory.makeSymbol("S#39143", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic50$ = SubLObjectFactory.makeSymbol("S#39226", "CYC");
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39129", "CYC"));
        $ic52$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39227", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39130", "CYC"))));
        $ic53$ = SubLObjectFactory.makeSymbol("S#3165", "CYC");
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39226", "CYC"));
        $ic55$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW"));
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3044", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39226", "CYC")));
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39226", "CYC")));
        $ic59$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39130", "CYC")));
        $ic60$ = SubLObjectFactory.makeSymbol("S#39129", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("WITH-PPH-MEMOIZATION");
        $ic62$ = SubLObjectFactory.makeKeyword("REUSED");
        $ic63$ = SubLObjectFactory.makeKeyword("NEW");
        $ic64$ = SubLObjectFactory.makeSymbol("S#39130", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-PPH-MEMOIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("S#39128", "CYC"));
        $ic66$ = SubLObjectFactory.makeSymbol("S#39062", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#39063", "CYC");
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3268", "CYC"));
        $ic69$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STORE"));
        $ic70$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39132", "CYC"));
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39133", "CYC"));
        $ic72$ = SubLObjectFactory.makeSymbol("S#39137", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#39131", "CYC");
        $ic74$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#39063", "CYC"));
        $ic75$ = SubLObjectFactory.makeSymbol("S#39132", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#39133", "CYC");
        $ic77$ = SubLObjectFactory.makeKeyword("STORE");
        $ic78$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic79$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic80$ = SubLObjectFactory.makeSymbol("S#39134", "CYC");
        $ic81$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic82$ = SubLObjectFactory.makeKeyword("END");
        $ic83$ = SubLObjectFactory.makeSymbol("S#39136", "CYC");
        $ic84$ = SubLObjectFactory.makeString("<PPH-PSP ~S>");
        $ic85$ = SubLObjectFactory.makeSymbol("S#39138", "CYC");
        $ic86$ = SubLObjectFactory.makeKeyword("FREE");
        $ic87$ = SubLObjectFactory.makeString("~&Initial PPH problem store: ~S~%");
        $ic88$ = SubLObjectFactory.makeUninternedSymbol("US#3117245");
        $ic89$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39229", "CYC"), (SubLObject)module0580.NIL));
        $ic90$ = SubLObjectFactory.makeSymbol("S#39230", "CYC");
        $ic91$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39144", "CYC"));
        $ic92$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic93$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic94$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39230", "CYC")));
        $ic95$ = SubLObjectFactory.makeSymbol("S#39144", "CYC");
        $ic96$ = SubLObjectFactory.makeString("Destroying PPH problem store: ~S~%");
        $ic97$ = SubLObjectFactory.makeString("(PPH error level ");
        $ic98$ = SubLObjectFactory.makeString(") ");
        $ic99$ = SubLObjectFactory.makeString("New PPH problem store is not ok: ~S");
        $ic100$ = SubLObjectFactory.makeInteger(100000);
        $ic101$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39231", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3952", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39234", "CYC"), (SubLObject)module0580.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39233", "CYC"), (SubLObject)module0580.T));
        $ic102$ = SubLObjectFactory.makeKeyword("NOTED");
        $ic103$ = SubLObjectFactory.makeSymbol("S#39150", "CYC");
        $ic104$ = SubLObjectFactory.makeSymbol("DESTROYING-NEW-PPH-PHRASES-WHEN-DONE");
        $ic105$ = SubLObjectFactory.makeString("Destroyed ~S PPH phrases.~% New object count: ~S size: ~S");
        $ic106$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39231", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3952", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39234", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39151", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39232", "CYC"), (SubLObject)module0580.T));
        $ic107$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39150", "CYC")));
        $ic108$ = SubLObjectFactory.makeSymbol("S#39151", "CYC");
        $ic109$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39253", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic110$ = SubLObjectFactory.makeUninternedSymbol("US#779232F");
        $ic111$ = SubLObjectFactory.makeUninternedSymbol("US#533E956");
        $ic112$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39231", "CYC"));
        $ic113$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39234", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39151", "CYC")));
        $ic114$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39231", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3952", "CYC")));
        $ic115$ = ConsesLow.list((SubLObject)module0580.NIL);
        $ic116$ = SubLObjectFactory.makeSymbol("PIF");
        $ic117$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39150", "CYC"));
        $ic118$ = SubLObjectFactory.makeSymbol("S#5452", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("S#3953", "CYC");
        $ic120$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39157", "CYC"));
        $ic121$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39254", "CYC"));
        $ic122$ = SubLObjectFactory.makeSymbol("S#39154", "CYC");
        $ic123$ = SubLObjectFactory.makeSymbol("S#39153", "CYC");
        $ic124$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39023", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39255", "CYC"))));
        $ic125$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39155", "CYC"));
        $ic126$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39156", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39158", "CYC")));
        $ic127$ = SubLObjectFactory.makeSymbol("S#39155", "CYC");
        $ic128$ = SubLObjectFactory.makeString("~&Entering WITHIN-NEW-PPH-DISCOURSE-CONTEXT, *pph-discourse-context* is~% ~S~%");
        $ic129$ = SubLObjectFactory.makeSymbol("S#39156", "CYC");
        $ic130$ = SubLObjectFactory.makeString("~&Leaving WITHIN-NEW-PPH-DISCOURSE-CONTEXT, *pph-discourse-context* is~% ~S~%");
        $ic131$ = SubLObjectFactory.makeSymbol("S#39157", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("S#39158", "CYC");
        $ic133$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39256", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic134$ = SubLObjectFactory.makeKeyword("CYC-LEXICON");
        $ic135$ = SubLObjectFactory.makeUninternedSymbol("US#B1027E");
        $ic136$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39069", "CYC")));
        $ic137$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39023", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39257", "CYC"))));
        $ic138$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38908", "CYC"), (SubLObject)module0580.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&Shadowing discourse context...~%"));
        $ic139$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic140$ = SubLObjectFactory.makeSymbol("S#39160", "CYC");
        $ic141$ = SubLObjectFactory.makeSymbol("S#39023", "CYC");
        $ic142$ = SubLObjectFactory.makeSymbol("S#39159", "CYC");
        $ic143$ = SubLObjectFactory.makeString("~&Leaving ~S");
        $ic144$ = SubLObjectFactory.makeString("New RMS: ~S");
        $ic145$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39258", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39259", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic146$ = SubLObjectFactory.makeSymbol("*PPH-SPEAKER*");
        $ic147$ = SubLObjectFactory.makeSymbol("*PPH-ADDRESSEE*");
        $ic148$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("S#39260", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39261", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39261", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39262", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39262", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33826", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33826", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39263", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39263", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39264", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39264", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39265", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39265", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39266", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39266", "CYC"))) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic149$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARANOID-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-ITEM"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-POSITION"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-OPEN-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-CLOSE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("START-CHAR-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("WHOLE-STRING"));
        $ic150$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic151$ = SubLObjectFactory.makeKeyword("PARANOID-ARG");
        $ic152$ = SubLObjectFactory.makeSymbol("S#39261", "CYC");
        $ic153$ = SubLObjectFactory.makeKeyword("OUTPUT-ITEM");
        $ic154$ = SubLObjectFactory.makeSymbol("S#39262", "CYC");
        $ic155$ = SubLObjectFactory.makeKeyword("ARG-POSITION");
        $ic156$ = SubLObjectFactory.makeSymbol("S#33826", "CYC");
        $ic157$ = SubLObjectFactory.makeKeyword("HTML-OPEN-TAG");
        $ic158$ = SubLObjectFactory.makeSymbol("S#39263", "CYC");
        $ic159$ = SubLObjectFactory.makeKeyword("HTML-CLOSE-TAG");
        $ic160$ = SubLObjectFactory.makeSymbol("S#39264", "CYC");
        $ic161$ = SubLObjectFactory.makeKeyword("START-CHAR-INDEX");
        $ic162$ = SubLObjectFactory.makeSymbol("S#39265", "CYC");
        $ic163$ = SubLObjectFactory.makeKeyword("WHOLE-STRING");
        $ic164$ = SubLObjectFactory.makeSymbol("S#39266", "CYC");
        $ic165$ = SubLObjectFactory.makeUninternedSymbol("US#35248DF");
        $ic166$ = SubLObjectFactory.makeUninternedSymbol("US#1D3DCF8");
        $ic167$ = SubLObjectFactory.makeUninternedSymbol("US#5953B69");
        $ic168$ = SubLObjectFactory.makeUninternedSymbol("US#2A76813");
        $ic169$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39267", "CYC"));
        $ic170$ = ConsesLow.list((SubLObject)module0580.ZERO_INTEGER);
        $ic171$ = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING");
        $ic172$ = ConsesLow.list((SubLObject)module0580.T);
        $ic173$ = SubLObjectFactory.makeSymbol("S#39071", "CYC");
        $ic174$ = SubLObjectFactory.makeSymbol("S#39268", "CYC");
        $ic175$ = SubLObjectFactory.makeSymbol("UNTIL");
        $ic176$ = SubLObjectFactory.makeSymbol("S#39269", "CYC");
        $ic177$ = SubLObjectFactory.makeSymbol("S#39270", "CYC");
        $ic178$ = SubLObjectFactory.makeSymbol("S#39163", "CYC");
        $ic179$ = SubLObjectFactory.makeSymbol("S#39162", "CYC");
        $ic180$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#143", "CYC"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("S#33826", "CYC"), SubLObjectFactory.makeSymbol("S#39263", "CYC"), SubLObjectFactory.makeSymbol("S#39264", "CYC"), SubLObjectFactory.makeSymbol("S#39261", "CYC"), SubLObjectFactory.makeSymbol("S#39262", "CYC"), SubLObjectFactory.makeSymbol("S#39266", "CYC"), SubLObjectFactory.makeSymbol("S#39265", "CYC"), SubLObjectFactory.makeSymbol("S#39271", "CYC") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic181$ = SubLObjectFactory.makeSymbol("S#39164", "CYC");
        $ic182$ = SubLObjectFactory.makeSymbol("S#39167", "CYC");
        $ic183$ = SubLObjectFactory.makeUninternedSymbol("US#5120BFC");
        $ic184$ = SubLObjectFactory.makeSymbol("S#39272", "CYC");
        $ic185$ = SubLObjectFactory.makeSymbol("S#39168", "CYC");
        $ic186$ = SubLObjectFactory.makeSymbol(">");
        $ic187$ = SubLObjectFactory.makeSymbol("S#39166", "CYC");
        $ic188$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39273", "CYC")));
        $ic189$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39274", "CYC")));
        $ic190$ = SubLObjectFactory.makeSymbol("S#39275", "CYC");
        $ic191$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic192$ = SubLObjectFactory.makeSymbol("S#39165", "CYC");
        $ic193$ = SubLObjectFactory.makeString("Adding space string of length ~S");
        $ic194$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#143", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#33826", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39263", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39264", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39261", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39262", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic195$ = SubLObjectFactory.makeSymbol("S#39276", "CYC");
        $ic196$ = SubLObjectFactory.makeSymbol("S#39277", "CYC");
        $ic197$ = SubLObjectFactory.makeSymbol("S#39278", "CYC");
        $ic198$ = SubLObjectFactory.makeSymbol("S#39279", "CYC");
        $ic199$ = SubLObjectFactory.makeSymbol("S#39070", "CYC");
        $ic200$ = SubLObjectFactory.makeSymbol("S#39280", "CYC");
        $ic201$ = SubLObjectFactory.makeString("Couldn't find ~S in ~S.~%");
        $ic202$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#143", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39281", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic203$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic204$ = SubLObjectFactory.makeKeyword("DONE");
        $ic205$ = SubLObjectFactory.makeSymbol("CSOME");
        $ic206$ = SubLObjectFactory.makeSymbol("S#39282", "CYC");
        $ic207$ = SubLObjectFactory.makeKeyword("PAIRS");
        $ic208$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39283", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#759", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39284", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39285", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("JAVALISTS"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic209$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN-STYLE"));
        $ic210$ = SubLObjectFactory.makeKeyword("RETURN-STYLE");
        $ic211$ = SubLObjectFactory.makeKeyword("JAVALISTS");
        $ic212$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#652", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39171", "CYC")));
        $ic213$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#653", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39172", "CYC")));
        $ic214$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#654", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39174", "CYC")));
        $ic215$ = SubLObjectFactory.makeSymbol("S#655", "CYC");
        $ic216$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#656", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39175", "CYC")));
        $ic217$ = SubLObjectFactory.makeSymbol("S#39236", "CYC");
        $ic218$ = SubLObjectFactory.makeSymbol("S#586", "CYC");
        $ic219$ = SubLObjectFactory.makeSymbol("S#39076", "CYC");
        $ic220$ = SubLObjectFactory.makeString("Don't know how to accumulate ~S answers.");
        $ic221$ = SubLObjectFactory.makeSymbol("<");
        $ic222$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39286", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic223$ = SubLObjectFactory.makeUninternedSymbol("US#57040A7");
        $ic224$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0580.EQL)));
        $ic225$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39039", "CYC"));
        $ic226$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39038", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38955", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#39038", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("QUIET")));
        $ic227$ = SubLObjectFactory.makeSymbol("S#39039", "CYC");
        $ic228$ = SubLObjectFactory.makeSymbol("S#6424", "CYC");
        $ic229$ = SubLObjectFactory.makeSymbol("S#39287", "CYC");
        $ic230$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#772", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39288", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39181", "CYC")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic231$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39239", "CYC"), (SubLObject)module0580.ZERO_INTEGER);
        $ic232$ = SubLObjectFactory.makeSymbol("S#39237", "CYC");
        $ic233$ = SubLObjectFactory.makeSymbol("S#39180", "CYC");
        $ic234$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39238", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39238", "CYC")));
        $ic235$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#39238", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39178", "CYC")));
        $ic236$ = SubLObjectFactory.makeSymbol("S#39238", "CYC");
        $ic237$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39178", "CYC")));
        $ic238$ = SubLObjectFactory.makeString("PPH timeout reached.");
        $ic239$ = SubLObjectFactory.makeSymbol("S#39177", "CYC");
        $ic240$ = SubLObjectFactory.makeSymbol("S#39181", "CYC");
        $ic241$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39289", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic242$ = SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*");
        $ic243$ = SubLObjectFactory.makeSymbol("S#39290", "CYC");
        $ic244$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*"));
        $ic245$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic246$ = SubLObjectFactory.makeSymbol("*PPH-DOMAIN-MT*");
        $ic247$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-DOMAIN-MT*"));
        $ic248$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39289", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic249$ = SubLObjectFactory.makeSymbol("S#39183", "CYC");
        $ic250$ = SubLObjectFactory.makeSymbol("S#39184", "CYC");
        $ic251$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39291", "CYC"), (SubLObject)module0580.NIL)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic252$ = SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
        $ic253$ = SubLObjectFactory.makeUninternedSymbol("US#154EE65");
        $ic254$ = SubLObjectFactory.makeSymbol("S#39186", "CYC");
        $ic255$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39292", "CYC")));
        $ic256$ = SubLObjectFactory.makeSymbol("S#12762", "CYC");
        $ic257$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38915", "CYC"), (SubLObject)module0580.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Broadening *PPH-LANGUAGE-MT* to ~S"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*"));
        $ic258$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39293", "CYC"));
        $ic259$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic260$ = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $ic261$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39020", "CYC"));
        $ic262$ = SubLObjectFactory.makeSymbol("COR");
        $ic263$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39294", "CYC")));
        $ic264$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39295", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic265$ = SubLObjectFactory.makeUninternedSymbol("US#7C53A59");
        $ic266$ = SubLObjectFactory.makeSymbol("*PPH-USE-BULLETED-LISTS?*");
        $ic267$ = SubLObjectFactory.makeSymbol("S#38908", "CYC");
        $ic268$ = SubLObjectFactory.makeString("~&Suspending bullet use for~% ~S~%");
        $ic269$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38908", "CYC"), (SubLObject)module0580.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&Turning bullet use back on.~%")));
        $ic270$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10875", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9979", "CYC"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic271$ = SubLObjectFactory.makeSymbol("S#38916", "CYC");
        $ic272$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39191", "CYC"));
        $ic273$ = SubLObjectFactory.makeSymbol("S#9978", "CYC");
        $ic274$ = SubLObjectFactory.makeSymbol("S#39192", "CYC");
        $ic275$ = SubLObjectFactory.makeSymbol("S#39190", "CYC");
        $ic276$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic277$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39052", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39296", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39053", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39297", "CYC"))));
        $ic278$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28211", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic279$ = SubLObjectFactory.makeSymbol("S#39000", "CYC");
        $ic280$ = SubLObjectFactory.makeSymbol("S#38987", "CYC");
        $ic281$ = SubLObjectFactory.makeSymbol("S#28402", "CYC");
        $ic282$ = SubLObjectFactory.makeSymbol("S#28654", "CYC");
        $ic283$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38985", "CYC"), (SubLObject)module0580.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-USE-BULLETED-LISTS?*"), (SubLObject)module0580.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39051", "CYC"), (SubLObject)module0580.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39052", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39296", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39053", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39297", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39056", "CYC"), (SubLObject)module0580.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39054", "CYC"), (SubLObject)module0580.NIL));
        $ic284$ = SubLObjectFactory.makeSymbol("S#39195", "CYC");
        $ic285$ = SubLObjectFactory.makeUninternedSymbol("US#4B44B");
        $ic286$ = SubLObjectFactory.makeUninternedSymbol("US#3CE5037");
        $ic287$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39197", "CYC"));
        $ic288$ = SubLObjectFactory.makeSymbol("S#39123", "CYC");
        $ic289$ = SubLObjectFactory.makeSymbol("S#39197", "CYC");
        $ic290$ = SubLObjectFactory.makeSymbol("S#39194", "CYC");
        $ic291$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39298", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic292$ = SubLObjectFactory.makeUninternedSymbol("US#2CF1D0E");
        $ic293$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3041", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39025", "CYC")));
        $ic294$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39026", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6424", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39026", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#39026", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0580.EQL), (SubLObject)module0580.SIXTEEN_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39241", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("S#39241", "CYC"))));
        $ic295$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38908", "CYC"), (SubLObject)module0580.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%"), (SubLObject)SubLObjectFactory.makeSymbol("S#39241", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("S#39025", "CYC")));
        $ic296$ = SubLObjectFactory.makeSymbol("S#39025", "CYC");
        $ic297$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38908", "CYC"), (SubLObject)module0580.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). "), (SubLObject)SubLObjectFactory.makeSymbol("S#39241", "CYC"));
        $ic298$ = SubLObjectFactory.makeSymbol("S#39091", "CYC");
        $ic299$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38908", "CYC"), (SubLObject)module0580.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("~& Output list: ~S~%"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39096", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39298", "CYC")));
        $ic300$ = SubLObjectFactory.makeString("~& Setting ~S to~% ~S");
        $ic301$ = SubLObjectFactory.makeSymbol("DICTIONARY-VALUES");
        $ic302$ = SubLObjectFactory.makeSymbol("S#39199", "CYC");
        $ic303$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38908", "CYC"), (SubLObject)module0580.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("~% Leaving *PPH-VAR-TYPES* ~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("S#39025", "CYC"))));
        $ic304$ = SubLObjectFactory.makeSymbol("S#39198", "CYC");
        $ic305$ = SubLObjectFactory.makeUninternedSymbol("US#3835629");
        $ic306$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39025", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6424", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39025", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#39025", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"))));
        $ic307$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39299", "CYC")));
        $ic308$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39300", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39300", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39026", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6424", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39026", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#39026", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0580.EQL), (SubLObject)module0580.SIXTEEN_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39027", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("S#39027", "CYC"))));
        $ic309$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38908", "CYC"), (SubLObject)module0580.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%"), (SubLObject)SubLObjectFactory.makeSymbol("S#39027", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("S#39025", "CYC")));
        $ic310$ = SubLObjectFactory.makeSymbol("S#39301", "CYC");
        $ic311$ = SubLObjectFactory.makeSymbol("SET-DIFFERENCE");
        $ic312$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39299", "CYC"));
        $ic313$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38908", "CYC"), (SubLObject)module0580.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s "), (SubLObject)SubLObjectFactory.makeSymbol("S#39027", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39299", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39201", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39301", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38908", "CYC"), (SubLObject)module0580.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&... and *pph-var-types* are now ~S~%"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39299", "CYC"))));
        $ic314$ = SubLObjectFactory.makeSymbol("S#39201", "CYC");
        $ic315$ = SubLObjectFactory.makeSymbol("S#39200", "CYC");
        $ic316$ = SubLObjectFactory.makeString("~&Deregistering ~S~%");
        $ic317$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39302", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("S#39303", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#39304", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic318$ = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $ic319$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39305", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39298", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic320$ = SubLObjectFactory.makeSymbol("S#39306", "CYC");
        $ic321$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#33867", "CYC"), SubLObjectFactory.makeSymbol("S#6061", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#12457", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39307", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39083", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24001", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1599", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39308", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ANY")), SubLObjectFactory.makeSymbol("S#39309", "CYC"), SubLObjectFactory.makeSymbol("S#127", "CYC") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic322$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RELN"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-POSITION-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("INVERSE?"), (SubLObject)SubLObjectFactory.makeKeyword("NL-PREDS"), (SubLObject)SubLObjectFactory.makeKeyword("FOCUS-ARGNUM"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic323$ = SubLObjectFactory.makeKeyword("RELN");
        $ic324$ = SubLObjectFactory.makeKeyword("ARG-POSITION-MAP");
        $ic325$ = SubLObjectFactory.makeKeyword("INVERSE?");
        $ic326$ = SubLObjectFactory.makeSymbol("S#1599", "CYC");
        $ic327$ = SubLObjectFactory.makeKeyword("NL-PREDS");
        $ic328$ = SubLObjectFactory.makeKeyword("ANY");
        $ic329$ = SubLObjectFactory.makeKeyword("FOCUS-ARGNUM");
        $ic330$ = SubLObjectFactory.makeUninternedSymbol("US#786530B");
        $ic331$ = SubLObjectFactory.makeSymbol("S#39310", "CYC");
        $ic332$ = SubLObjectFactory.makeSymbol("S#39311", "CYC");
        $ic333$ = SubLObjectFactory.makeSymbol("S#39312", "CYC");
        $ic334$ = SubLObjectFactory.makeSymbol("S#39064", "CYC");
        $ic335$ = SubLObjectFactory.makeSymbol("S#39313", "CYC");
        $ic336$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39314", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#39315", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39307", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39308", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ANY")), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic337$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-POSITION-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("NL-PREDS"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic338$ = SubLObjectFactory.makeKeyword("FOCUS-ARG");
        $ic339$ = SubLObjectFactory.makeUninternedSymbol("US#3A6A62");
        $ic340$ = SubLObjectFactory.makeSymbol("S#39204", "CYC");
        $ic341$ = SubLObjectFactory.makeSymbol("S#39316", "CYC");
        $ic342$ = SubLObjectFactory.makeInteger(300);
        $ic343$ = SubLObjectFactory.makeSymbol("S#39206", "CYC");
        $ic344$ = SubLObjectFactory.makeSymbol("S#39208", "CYC");
        $ic345$ = SubLObjectFactory.makeUninternedSymbol("US#5264075");
        $ic346$ = SubLObjectFactory.makeUninternedSymbol("US#2A9BCB3");
        $ic347$ = SubLObjectFactory.makeUninternedSymbol("US#3EFB8BE");
        $ic348$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39209", "CYC")));
        $ic349$ = SubLObjectFactory.makeSymbol("S#39243", "CYC");
        $ic350$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0580.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39206", "CYC"))), (SubLObject)SubLObjectFactory.makeSymbol("S#39243", "CYC"));
        $ic351$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39245", "CYC"), (SubLObject)module0580.T);
        $ic352$ = SubLObjectFactory.makeSymbol("WHILE");
        $ic353$ = SubLObjectFactory.makeSymbol("S#39211", "CYC");
        $ic354$ = SubLObjectFactory.makeSymbol("CCATCH");
        $ic355$ = SubLObjectFactory.makeKeyword("PPH-METHOD-FAILURE");
        $ic356$ = SubLObjectFactory.makeSymbol("S#39209", "CYC");
        $ic357$ = SubLObjectFactory.makeString("Can't note PPH method failure; not in failure handling mode.");
        $ic358$ = SubLObjectFactory.makeString("~S~% is already suspended.");
        $ic359$ = SubLObjectFactory.makeString("Over ~S suspended methods.~% Current plist:~% ~S");
        $ic360$ = SubLObjectFactory.makeKeyword("CYCL");
        $ic361$ = SubLObjectFactory.makeString("Cleared ~S suspended methods for ~S");
        $ic362$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39317", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#39318", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic363$ = SubLObjectFactory.makeUninternedSymbol("US#53A48DD");
        $ic364$ = SubLObjectFactory.makeSymbol("S#39319", "CYC");
        $ic365$ = SubLObjectFactory.makeSymbol("S#39320", "CYC");
        $ic366$ = SubLObjectFactory.makeSymbol("S#39321", "CYC");
        $ic367$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13101", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic368$ = SubLObjectFactory.makeSymbol("S#38966", "CYC");
        $ic369$ = SubLObjectFactory.makeUninternedSymbol("US#6365C71");
        $ic370$ = SubLObjectFactory.makeSymbol("S#39216", "CYC");
        $ic371$ = SubLObjectFactory.makeSymbol("S#39217", "CYC");
        $ic372$ = SubLObjectFactory.makeSymbol("S#39215", "CYC");
        $ic373$ = SubLObjectFactory.makeString("Removing MT scope from ~S");
        $ic374$ = ConsesLow.list((SubLObject)module0580.TWO_INTEGER);
        $ic375$ = SubLObjectFactory.makeString("Updating agr-preds to ~S based on mt scope.");
        $ic376$ = SubLObjectFactory.makeString("New agr preds: ~S");
        $ic377$ = SubLObjectFactory.makeString("Adding Mt scope paraphrases to~% ~S");
        $ic378$ = SubLObjectFactory.makeString("Couldn't finish temporal phrase:~% ~S~%");
        $ic379$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39322", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39323", "CYC"));
        $ic380$ = SubLObjectFactory.makeString(",");
        $ic381$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic382$ = SubLObjectFactory.makeString("~% Top-level CycL: ~S");
        $ic383$ = SubLObjectFactory.makeKeyword("FAILED");
        $ic384$ = SubLObjectFactory.makeString("Result of adding Mt scope paraphrases:~% ~S");
        $ic385$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Now")));
        $ic386$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TemporalMicrotheory"));
        $ic387$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nameString")));
        $ic388$ = SubLObjectFactory.makeString("according to");
        $ic389$ = SubLObjectFactory.makeKeyword("PHRASE-CYCL");
        $ic390$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Now"));
        $ic391$ = SubLObjectFactory.makeString("Ignoring ~S~% because it subsumes #$Now.");
        $ic392$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("prepositionStrings")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("adverbStrings")));
        $ic393$ = SubLObjectFactory.makeUninternedSymbol("US#70C2928");
        $ic394$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39324", "CYC")));
        $ic395$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39325", "CYC"));
        $ic396$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39326", "CYC")));
    }
    
    public static final class $sX39062_native extends SubLStructNative
    {
        public SubLObject $store;
        private static final SubLStructDeclNative structDecl;
        
        public $sX39062_native() {
            this.$store = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX39062_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$store;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$store = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX39062_native.class, module0580.$ic66$, module0580.$ic67$, module0580.$ic68$, module0580.$ic69$, new String[] { "$store" }, module0580.$ic70$, module0580.$ic71$, module0580.$ic72$);
        }
    }
    
    public static final class $f35548$UnaryFunction extends UnaryFunction
    {
        public $f35548$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39063"));
        }
        
        public SubLObject processItem(final SubLObject var73) {
            return module0580.f35548(var73);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0580.class
	Total time: 1192 ms
	
	Decompiled with Procyon 0.5.32.
*/