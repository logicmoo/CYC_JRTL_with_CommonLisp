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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return module0035.f2293(module0579.$g4263$.getDynamicValue(var2), var1, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35521(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic0$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, var7, (SubLObject)$ic3$), (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), ConsesLow.append(var8, (SubLObject)NIL)));
    }
    
    public static SubLObject f35522(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic0$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic6$, var7, (SubLObject)$ic7$), (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic8$, var7)), ConsesLow.append(var8, (SubLObject)NIL)));
    }
    
    public static SubLObject f35523(final SubLObject var11) {
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        SubLObject var16;
        SubLObject var15;
        SubLObject var17;
        SubLObject var18;
        for (var12 = (SubLObject)makeBoolean(NIL == module0035.f2292(var11)), var13 = (SubLObject)NIL, var13 = var11; NIL == var12 && NIL != var13; var12 = (SubLObject)makeBoolean(NIL == module0206.f13450(var17) || NIL == module0038.f2614(var18)), var13 = var13.rest()) {
            var14 = var13.first();
            var15 = (var16 = var14);
            var17 = (SubLObject)NIL;
            var18 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic9$);
            var17 = var16.first();
            var16 = (var18 = var16.rest());
        }
        return (SubLObject)makeBoolean(NIL == var12);
    }
    
    public static SubLObject f35524(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic10$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic11$, var7, (SubLObject)$ic12$), (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic13$, var7)), ConsesLow.append(var8, (SubLObject)NIL)));
    }
    
    public static SubLObject f35525(final SubLObject var11) {
        return assertion_handles_oc.f11035(var11);
    }
    
    public static SubLObject f35526(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic14$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic14$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic14$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic14$);
        var10 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var11;
            var6 = (var11 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list(var8, var9, var10), ConsesLow.append(var11, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic14$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35527(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)$ic16$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f35528(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic17$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic6$, var7, (SubLObject)$ic18$), (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic19$, var7)), ConsesLow.append(var8, (SubLObject)NIL)));
    }
    
    public static SubLObject f35529(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)$ic20$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f35530(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)T, reader.bq_cons((SubLObject)$ic22$, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f35531(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic21$, (SubLObject)NIL, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f35532(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic23$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic6$, var7, (SubLObject)$ic24$), (SubLObject)ConsesLow.listS((SubLObject)$ic21$, var7, ConsesLow.append(var8, (SubLObject)NIL)));
    }
    
    public static SubLObject f35533(final SubLObject var41) {
        if (NIL == var41) {
            return (SubLObject)T;
        }
        if (NIL == module0035.f2014(var41)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0004.f104((SubLObject)NIL, var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        SubLObject var42 = var41;
        SubLObject var43 = (SubLObject)NIL;
        var43 = var42.first();
        while (NIL != var42) {
            if (var43.isInteger() && var43.isNegative()) {
                return (SubLObject)NIL;
            }
            if (!var43.isInteger() && NIL == f35533(var43)) {
                return (SubLObject)NIL;
            }
            var42 = var42.rest();
            var43 = var42.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f35534(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)$ic25$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f35535(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic26$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic26$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic27$, (SubLObject)ConsesLow.listS((SubLObject)$ic28$, (SubLObject)ConsesLow.list((SubLObject)$ic29$, var8), var8, (SubLObject)$ic30$))), ConsesLow.append(var9, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic26$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35536(final SubLObject var49) {
        return (SubLObject)makeBoolean(NIL == module0269.f17737(var49));
    }
    
    public static SubLObject f35537(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic32$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic32$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic32$);
        var9 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var10;
            var6 = (var10 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)ConsesLow.listS((SubLObject)$ic34$, var8, (SubLObject)$ic35$)), (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)ConsesLow.listS((SubLObject)$ic34$, var9, (SubLObject)$ic37$))), ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic32$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35538(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic38$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic38$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic39$, var8)), ConsesLow.append(var9, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic38$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35539(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)$ic40$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f35540(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)$ic41$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f35541(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic42$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list((SubLObject)$ic44$, (SubLObject)$ic45$, (SubLObject)ConsesLow.list((SubLObject)$ic46$, var7)))), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f35542(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        final SubLObject var8 = (SubLObject)$ic47$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list((SubLObject)$ic49$, (SubLObject)ConsesLow.list((SubLObject)$ic50$, var8), (SubLObject)$ic51$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)$ic52$, (SubLObject)ConsesLow.listS((SubLObject)$ic53$, (SubLObject)$ic54$, ConsesLow.append(var7, (SubLObject)NIL))), (SubLObject)ConsesLow.listS((SubLObject)$ic55$, (SubLObject)ConsesLow.listS((SubLObject)$ic44$, (SubLObject)ConsesLow.listS((SubLObject)EQ, var8, (SubLObject)$ic56$), (SubLObject)$ic57$), (SubLObject)$ic58$)));
    }
    
    public static SubLObject f35543(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic53$, (SubLObject)$ic59$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f35544() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0034.f1839($g4358$.getDynamicValue(var2))) {
            return Values.values($g4358$.getDynamicValue(var2), (SubLObject)$ic62$);
        }
        return Values.values(module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)$ic63$);
    }
    
    public static SubLObject f35545() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (NIL != module0107.f7628($g4359$.getDynamicValue(var2))) ? Values.values(module0034.f1881(), (SubLObject)$ic63$) : Values.values($g4359$.getDynamicValue(var2), (SubLObject)$ic62$);
    }
    
    public static SubLObject f35546(final SubLObject var71, final SubLObject var72) {
        f35547(var71, var72, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35548(final SubLObject var71) {
        return (SubLObject)((var71.getClass() == $sX39062_native.class) ? T : NIL);
    }
    
    public static SubLObject f35549(final SubLObject var71) {
        assert NIL != f35548(var71) : var71;
        return var71.getField2();
    }
    
    public static SubLObject f35550(final SubLObject var71, final SubLObject var74) {
        assert NIL != f35548(var71) : var71;
        return var71.setField2(var74);
    }
    
    public static SubLObject f35551(SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        final SubLObject var76 = (SubLObject)new $sX39062_native();
        SubLObject var77;
        SubLObject var78;
        SubLObject var79;
        SubLObject var80;
        for (var77 = (SubLObject)NIL, var77 = var75; NIL != var77; var77 = conses_high.cddr(var77)) {
            var78 = var77.first();
            var79 = conses_high.cadr(var77);
            var80 = var78;
            if (var80.eql((SubLObject)$ic77$)) {
                f35550(var76, var79);
            }
            else {
                Errors.error((SubLObject)$ic78$, var78);
            }
        }
        return var76;
    }
    
    public static SubLObject f35552(final SubLObject var81, final SubLObject var82) {
        Functions.funcall(var82, var81, (SubLObject)$ic79$, (SubLObject)$ic80$, (SubLObject)ONE_INTEGER);
        Functions.funcall(var82, var81, (SubLObject)$ic81$, (SubLObject)$ic77$, f35549(var81));
        Functions.funcall(var82, var81, (SubLObject)$ic82$, (SubLObject)$ic80$, (SubLObject)ONE_INTEGER);
        return var81;
    }
    
    public static SubLObject f35553(final SubLObject var81, final SubLObject var82) {
        return f35552(var81, var82);
    }
    
    public static SubLObject f35547(final SubLObject var83, final SubLObject var72, final SubLObject var84) {
        PrintLow.format(var72, (SubLObject)$ic84$, f35549(var83));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35554(final SubLObject var83) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        assert NIL != f35548(var83) : var83;
        if (NIL != module0361.f24009(f35549(var83))) {
            module0361.f24005(f35549(var83));
        }
        f35555(var83, (SubLObject)$ic86$);
        $g4361$.setDynamicValue((SubLObject)ConsesLow.cons(var83, $g4361$.getDynamicValue(var84)), var84);
        return (SubLObject)$ic86$;
    }
    
    public static SubLObject f35555(final SubLObject var83, final SubLObject var85) {
        assert NIL != f35548(var83) : var83;
        f35550(var83, var85);
        return var85;
    }
    
    public static SubLObject f35556() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        if (NIL != $g4361$.getDynamicValue(var2)) {
            final SubLObject var4 = $g4361$.getDynamicValue(var2);
            var3 = var4.first();
            $g4361$.setDynamicValue(var4.rest(), var2);
        }
        else {
            var3 = f35551((SubLObject)UNPROVIDED);
        }
        return var3;
    }
    
    public static SubLObject f35557(final SubLObject var83) {
        assert NIL != f35548(var83) : var83;
        final SubLObject var84 = f35549(var83);
        final SubLObject var85 = module0361.f24136((SubLObject)UNPROVIDED);
        if (NIL != module0361.f24009(var84)) {
            module0361.f24005(var84);
        }
        f35555(var83, var85);
        return var83;
    }
    
    public static SubLObject f35558(SubLObject var89) {
        if (var89 == UNPROVIDED) {
            var89 = (SubLObject)NIL;
        }
        final SubLThread var90 = SubLProcess.currentSubLThread();
        final SubLObject var91 = $g4362$.getDynamicValue(var90);
        SubLObject var92 = (SubLObject)NIL;
        if (NIL != f35548(var91)) {
            var92 = f35549(var91);
            if ($ic86$ == var92 && NIL != var89) {
                f35557(var91);
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic87$, f35549(var91));
                }
                var92 = f35549(var91);
            }
        }
        return (SubLObject)((NIL != var92) ? var92 : NIL);
    }
    
    public static SubLObject f35559(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        final SubLObject var8 = (SubLObject)$ic88$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)$ic89$, (SubLObject)ConsesLow.list((SubLObject)$ic49$, (SubLObject)ConsesLow.list((SubLObject)$ic90$, var8), (SubLObject)$ic91$, (SubLObject)ConsesLow.list((SubLObject)$ic92$, reader.bq_cons((SubLObject)$ic1$, ConsesLow.append(var7, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic93$, var8, (SubLObject)$ic94$))));
    }
    
    public static SubLObject f35560() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL == f35548($g4362$.getDynamicValue(var2))) {
            final SubLObject var3 = f35556();
            return Values.values(var3, (SubLObject)NIL);
        }
        if (NIL == f35561()) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic96$, f35558((SubLObject)UNPROVIDED));
            }
            f35557($g4362$.getDynamicValue(var2));
            if (NIL == f35561()) {
                final SubLObject var4 = Sequences.cconcatenate((SubLObject)$ic97$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic98$, module0006.f203((SubLObject)$ic99$) });
                module0578.f35476(var4, (SubLObject)ConsesLow.list(f35558((SubLObject)UNPROVIDED)));
            }
            return Values.values($g4362$.getDynamicValue(var2), (SubLObject)T);
        }
        return Values.values($g4362$.getDynamicValue(var2), (SubLObject)T);
    }
    
    public static SubLObject f35561() {
        final SubLObject var85 = f35558((SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean($ic86$ == var85 || (NIL != module0361.f24109(var85) && NIL != f35562(var85)));
    }
    
    public static SubLObject f35562(final SubLObject var85) {
        return Numbers.numL(module0361.f24112(var85), (SubLObject)$ic100$);
    }
    
    public static SubLObject f35563(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)$ic101$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f35564(final SubLObject var97) {
        final SubLThread var98 = SubLProcess.currentSubLThread();
        module0054.f3973(var97, $g4363$.getDynamicValue(var98));
        $g4366$.setDynamicValue(Numbers.add($g4366$.getDynamicValue(var98), (SubLObject)ONE_INTEGER), var98);
        return (SubLObject)$ic102$;
    }
    
    public static SubLObject f35565() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != module0004.f106($g4366$.getDynamicValue(var2))) ? $g4366$.getDynamicValue(var2) : ZERO_INTEGER);
    }
    
    public static SubLObject f35566() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)ZERO_INTEGER;
        while (NIL == module0054.f3970($g4363$.getDynamicValue(var2))) {
            final SubLObject var4 = $g4367$.currentBinding(var2);
            try {
                $g4367$.bind((SubLObject)T, var2);
                final SubLObject var5 = module0054.f3975($g4363$.getDynamicValue(var2));
                if (NIL != module0756.f47497(var5, (SubLObject)UNPROVIDED)) {
                    module0756.f47613(var5, (SubLObject)UNPROVIDED);
                    var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
                }
                module0054.f3974($g4363$.getDynamicValue(var2));
            }
            finally {
                $g4367$.rebind(var4, var2);
            }
        }
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic105$, new SubLObject[] { var3, module0749.f46503(), module0749.f46502() });
        }
        return var3;
    }
    
    public static SubLObject f35567(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)$ic106$, (SubLObject)ConsesLow.listS((SubLObject)$ic92$, reader.bq_cons((SubLObject)$ic1$, ConsesLow.append(var7, (SubLObject)NIL)), (SubLObject)$ic107$));
    }
    
    public static SubLObject f35568() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != module0107.f7629($g4366$.getDynamicValue(var2))) ? $g4366$.getDynamicValue(var2) : ZERO_INTEGER);
    }
    
    public static SubLObject f35569(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic109$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic109$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            final SubLObject var10 = (SubLObject)$ic110$;
            final SubLObject var11 = (SubLObject)$ic111$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list(reader.bq_cons(var10, (SubLObject)$ic112$), (SubLObject)$ic113$, (SubLObject)$ic114$, reader.bq_cons(var8, (SubLObject)$ic115$)), (SubLObject)ConsesLow.list((SubLObject)$ic92$, reader.bq_cons((SubLObject)$ic1$, ConsesLow.append(var9, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic116$, var8, (SubLObject)$ic117$, (SubLObject)ConsesLow.list((SubLObject)$ic118$, reader.bq_cons(var11, (SubLObject)$ic112$), (SubLObject)ConsesLow.list((SubLObject)$ic119$, var11, var10)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic109$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35570(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic116$, (SubLObject)$ic120$, (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)$ic121$, ConsesLow.append(var7, (SubLObject)NIL)), reader.bq_cons((SubLObject)$ic122$, ConsesLow.append(var7, (SubLObject)NIL))));
    }
    
    public static SubLObject f35571(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)$ic124$, (SubLObject)$ic125$, (SubLObject)ConsesLow.listS((SubLObject)$ic92$, (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)$ic121$, ConsesLow.append(var7, (SubLObject)NIL)), (SubLObject)$ic126$));
    }
    
    public static SubLObject f35572() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic128$, module0579.$g4321$.getDynamicValue(var2));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35573() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic130$, module0579.$g4321$.getDynamicValue(var2));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35574() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0755.f47378(module0579.$g4321$.getDynamicValue(var2));
    }
    
    public static SubLObject f35575() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0579.$g4321$.setDynamicValue((SubLObject)NIL, var2);
        return module0579.$g4321$.getDynamicValue(var2);
    }
    
    public static SubLObject f35576(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var7;
        final SubLObject var6 = var7 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic133$);
        final SubLObject var8 = var7.rest();
        var7 = var7.first();
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic133$);
        var9 = var7.first();
        var7 = var7.rest();
        if (NIL != var7) {
            cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic133$);
            return (SubLObject)NIL;
        }
        final SubLObject var10;
        var7 = (var10 = var8);
        if (NIL != module0004.f104((SubLObject)$ic134$, reader.$features$.getDynamicValue(var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var11 = (SubLObject)$ic135$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, reader.bq_cons(reader.bq_cons(var11, (SubLObject)$ic136$), (SubLObject)$ic137$), (SubLObject)$ic138$, ConsesLow.append(var10, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic139$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic140$, (SubLObject)$ic141$, var11)))));
        }
        return reader.bq_cons((SubLObject)$ic1$, ConsesLow.append(var10, (SubLObject)NIL));
    }
    
    public static SubLObject f35577(final SubLObject var116, final SubLObject var115) {
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic143$, var116);
        }
        SubLObject var117 = (SubLObject)NIL;
        var117 = conses_high.set_difference(module0755.f47383(var116), var115, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var117 && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic144$, var117);
        }
        return var117;
    }
    
    public static SubLObject f35578(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic145$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic145$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic145$);
        var9 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var10;
            var6 = (var10 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic146$, var8), (SubLObject)ConsesLow.list((SubLObject)$ic147$, var9)), ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic145$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35579(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic148$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic148$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic148$);
        var9 = var6.first();
        var6 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = var6;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var131_132 = (SubLObject)NIL;
        while (NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)$ic148$);
            var131_132 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)$ic148$);
            if (NIL == conses_high.member(var131_132, (SubLObject)$ic149$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var12 = (SubLObject)T;
            }
            if (var131_132 == $ic150$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (NIL != var12 && NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic148$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic151$, var6);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : $ic152$);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic153$, var6);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : $ic154$);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic155$, var6);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : $ic156$);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic157$, var6);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : $ic158$);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)$ic159$, var6);
        final SubLObject var22 = (SubLObject)((NIL != var21) ? conses_high.cadr(var21) : $ic160$);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic161$, var6);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : $ic162$);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)$ic163$, var6);
        final SubLObject var26 = (SubLObject)((NIL != var25) ? conses_high.cadr(var25) : $ic164$);
        final SubLObject var27;
        var6 = (var27 = var7);
        final SubLObject var28 = (SubLObject)$ic165$;
        final SubLObject var29 = (SubLObject)$ic166$;
        final SubLObject var30 = (SubLObject)$ic167$;
        final SubLObject var31 = (SubLObject)$ic168$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic6$, var9, (SubLObject)$ic169$), (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list(reader.bq_cons(var24, (SubLObject)$ic170$), reader.bq_cons(var30, (SubLObject)$ic170$), (SubLObject)ConsesLow.list(var29, (SubLObject)ConsesLow.listS((SubLObject)$ic171$, var9, (SubLObject)$ic172$)), (SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.listS((SubLObject)$ic173$, var29, (SubLObject)$ic115$)), (SubLObject)ConsesLow.list(var31, (SubLObject)ConsesLow.list((SubLObject)$ic174$, var9))), (SubLObject)ConsesLow.list((SubLObject)$ic175$, (SubLObject)ConsesLow.list((SubLObject)$ic176$, var31), (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var28, (SubLObject)ConsesLow.list((SubLObject)$ic177$, var31))), (SubLObject)ConsesLow.listS((SubLObject)$ic178$, (SubLObject)ConsesLow.list(new SubLObject[] { var28, var8, var18, var20, var22, var14, var16, var26, var24, var30 }), ConsesLow.append(var27, (SubLObject)NIL))))));
    }
    
    public static SubLObject f35580(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var10 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var11 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var12 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var13 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var14 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var15 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var16 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var17 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var18;
            var6 = (var18 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic181$, (SubLObject)ConsesLow.list(new SubLObject[] { var8, var9, var10, var11, var12, var13, var14, var15, var16, var17 }), ConsesLow.append(var18, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic182$, (SubLObject)ConsesLow.list(var8, var9, var10, var11, var12, var13, var14), ConsesLow.append(var18, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic180$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35581(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var10 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var11 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var12 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var13 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var14 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var15 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var16 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic180$);
        var17 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var18;
            var6 = (var18 = var7);
            final SubLObject var19 = (SubLObject)$ic183$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.listS((SubLObject)$ic184$, var8, (SubLObject)$ic115$))), (SubLObject)ConsesLow.list((SubLObject)$ic139$, var16, (SubLObject)ConsesLow.list((SubLObject)$ic185$, var19, var15, var17)), (SubLObject)ConsesLow.list((SubLObject)$ic55$, (SubLObject)ConsesLow.list((SubLObject)$ic186$, var16, var17), (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)$ic187$, var16, var17)), reader.bq_cons(var10, (SubLObject)$ic188$), reader.bq_cons(var11, (SubLObject)$ic115$), reader.bq_cons(var12, (SubLObject)$ic115$), reader.bq_cons(var13, (SubLObject)$ic189$), (SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.list((SubLObject)$ic190$, var9)), (SubLObject)ConsesLow.list(var16, var17)), (SubLObject)ConsesLow.list((SubLObject)$ic191$, var13, var14, var10, var11, var12, var16), ConsesLow.append(var18, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic139$, var17, (SubLObject)ConsesLow.list((SubLObject)$ic192$, var16, var19)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic180$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35582(final SubLObject var144, final SubLObject var156) {
        return Numbers.add(var144, Sequences.length(var156));
    }
    
    public static SubLObject f35583(final SubLObject var144, final SubLObject var148) {
        final SubLObject var149 = Numbers.subtract(var144, var148);
        if (var149.numG((SubLObject)ONE_INTEGER)) {
            final SubLObject var150 = Sequences.cconcatenate((SubLObject)$ic97$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic98$, module0006.f203((SubLObject)$ic193$) });
            module0578.f35476(var150, (SubLObject)ConsesLow.list(var149));
        }
        return Strings.make_string(var149, (SubLObject)Characters.CHAR_space);
    }
    
    public static SubLObject f35584(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic194$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic194$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic194$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic194$);
        var10 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic194$);
        var11 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic194$);
        var12 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic194$);
        var13 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic194$);
        var14 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var15;
            var6 = (var15 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.listS((SubLObject)$ic184$, var8, (SubLObject)$ic115$)), (SubLObject)ConsesLow.list(var10, (SubLObject)ConsesLow.list((SubLObject)$ic195$, var8)), (SubLObject)ConsesLow.list(var11, (SubLObject)ConsesLow.list((SubLObject)$ic196$, var8)), (SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.list((SubLObject)$ic197$, var8)), (SubLObject)ConsesLow.list(var13, (SubLObject)ConsesLow.list((SubLObject)$ic198$, var8)), (SubLObject)ConsesLow.list(var14, var8)), (SubLObject)ConsesLow.list((SubLObject)$ic191$, var13, var14, var10, var11, var12), ConsesLow.append(var15, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic194$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35585(final SubLObject var126, final SubLObject var146, final SubLObject var161) {
        assert NIL != module0581.f35648(var126) : var126;
        final SubLObject var162 = module0751.f46648(var126, (SubLObject)UNPROVIDED);
        final SubLObject var163 = (NIL != module0035.f2002(var162, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED)) ? module0581.f35674(module0581.f35671(var162, (SubLObject)ZERO_INTEGER), var146, Symbols.symbol_function((SubLObject)$ic200$), Symbols.symbol_function((SubLObject)IDENTITY), var161, (SubLObject)UNPROVIDED) : var161;
        if (!var163.isInteger()) {
            final SubLObject var164 = Sequences.cconcatenate((SubLObject)$ic97$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic98$, module0006.f203((SubLObject)$ic201$) });
            module0578.f35476(var164, (SubLObject)ConsesLow.list(module0581.f35681(var126, (SubLObject)UNPROVIDED), module0581.f35681(module0581.f35679(var146, var161, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)));
        }
        return var163;
    }
    
    public static SubLObject f35586(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic202$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic202$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic202$);
        var9 = var6.first();
        var6 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = var6;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var171_172 = (SubLObject)NIL;
        while (NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)$ic202$);
            var171_172 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)$ic202$);
            if (NIL == conses_high.member(var171_172, (SubLObject)$ic203$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var12 = (SubLObject)T;
            }
            if (var171_172 == $ic150$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (NIL != var12 && NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic202$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic204$, var6);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var6 = (var15 = var7);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic205$, (SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)$ic206$, var9), var14), ConsesLow.append(var15, (SubLObject)NIL));
    }
    
    public static SubLObject f35587(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic208$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic208$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic208$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic208$);
        var10 = var6.first();
        var6 = var6.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = var6;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var183_184 = (SubLObject)NIL;
        while (NIL != var12) {
            cdestructuring_bind.destructuring_bind_must_consp(var12, var5, (SubLObject)$ic208$);
            var183_184 = var12.first();
            var12 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var12, var5, (SubLObject)$ic208$);
            if (NIL == conses_high.member(var183_184, (SubLObject)$ic209$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var13 = (SubLObject)T;
            }
            if (var183_184 == $ic150$) {
                var11 = var12.first();
            }
            var12 = var12.rest();
        }
        if (NIL != var13 && NIL == var11) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic208$);
        }
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic210$, var6);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : $ic211$);
        final SubLObject var16;
        var6 = (var16 = var7);
        return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic212$, (SubLObject)$ic213$, (SubLObject)$ic214$, (SubLObject)ConsesLow.list((SubLObject)$ic215$, var10), (SubLObject)$ic216$, (SubLObject)ConsesLow.list((SubLObject)$ic217$, var15)), (SubLObject)ConsesLow.listS((SubLObject)$ic218$, (SubLObject)ConsesLow.list(var8, var9), ConsesLow.append(var16, (SubLObject)NIL)));
    }
    
    public static SubLObject f35588() {
        return module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35589(final SubLObject var187) {
        final SubLThread var188 = SubLProcess.currentSubLThread();
        assert NIL != module0753.f47248(var187) : var187;
        final SubLObject var189 = module0753.f47249(var187);
        final SubLObject var190 = module0753.f47250(var187);
        SubLObject var191 = (SubLObject)NIL;
        final SubLObject var192 = $g4368$.getDynamicValue(var188);
        if (var192.eql((SubLObject)$ic211$)) {
            var191 = module0751.f46953(var190);
        }
        else {
            final SubLObject var193 = Sequences.cconcatenate((SubLObject)$ic97$, new SubLObject[] { module0006.f205((SubLObject)$ic220$), $ic98$, module0006.f203($g4368$.getDynamicValue(var188)) });
            module0578.f35476(var193, (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY));
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
        for (var193 = module0066.f4838(module0067.f4891(var191)); NIL == module0066.f4841(var193); var193 = module0066.f4840(var193)) {
            var192.resetMultipleValues();
            final SubLObject var194 = module0066.f4839(var193);
            final SubLObject var195 = var192.secondMultipleValue();
            var192.resetMultipleValues();
            f35590(var194, var195, module0012.$g94$.getDynamicValue(var192));
        }
        module0066.f4842(var193);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35592(final SubLObject var193) {
        return module0035.f2319(module0084.f5794(var193, Symbols.symbol_function((SubLObject)$ic221$)));
    }
    
    public static SubLObject f35593(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic222$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic222$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            final SubLObject var10 = (SubLObject)$ic223$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic139$, var8, (SubLObject)$ic224$), (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list(reader.bq_cons(var10, (SubLObject)$ic225$), (SubLObject)$ic226$, (SubLObject)ConsesLow.list((SubLObject)$ic227$, var8)), ConsesLow.append(var9, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic55$, (SubLObject)ConsesLow.list((SubLObject)$ic228$, var10), (SubLObject)ConsesLow.list((SubLObject)$ic229$, (SubLObject)$ic227$, var10))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic222$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35594(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic230$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic230$);
        var8 = var6.first();
        var6 = var6.rest();
        final SubLObject var9 = var6.isCons() ? var6.first() : f35595();
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)$ic230$);
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var10;
            var6 = (var10 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.listS((SubLObject)$ic231$, (SubLObject)ConsesLow.list((SubLObject)$ic232$, (SubLObject)ConsesLow.list((SubLObject)$ic233$, var9)), (SubLObject)$ic234$), (SubLObject)$ic235$, (SubLObject)ConsesLow.listS((SubLObject)$ic93$, (SubLObject)$ic236$, ConsesLow.append(var10, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic139$, var8, (SubLObject)$ic237$));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic230$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35596() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (!$g4369$.getDynamicValue(var2).isNumber()) {
            return (SubLObject)NIL;
        }
        if (NIL != $g4370$.getDynamicValue(var2)) {
            return (SubLObject)T;
        }
        if (f35597().numGE($g4369$.getDynamicValue(var2))) {
            $g4370$.setDynamicValue((SubLObject)T, var2);
            Errors.warn((SubLObject)$ic238$);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35597() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        $g4371$.setDynamicValue(Numbers.add($g4371$.getDynamicValue(var2), (SubLObject)ONE_INTEGER), var2);
        return Time.get_internal_real_time();
    }
    
    public static SubLObject f35598(final SubLObject var203) {
        final SubLThread var204 = SubLProcess.currentSubLThread();
        if (!var203.isNumber()) {
            return $g4369$.getDynamicValue(var204);
        }
        final SubLObject var205 = f35597();
        final SubLObject var206 = Numbers.floor(Numbers.multiply(var203, time_high.$internal_time_units_per_second$.getGlobalValue()), (SubLObject)UNPROVIDED);
        return module0048.f3382(Sequences.remove((SubLObject)NIL, (SubLObject)ConsesLow.list($g4369$.getDynamicValue(var204), Numbers.add(var205, var206)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35595() {
        final SubLObject var206 = f35599();
        return (SubLObject)((NIL != module0048.f3293(var206)) ? var206 : NIL);
    }
    
    public static SubLObject f35599() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0579.f35495()) {
            return $g4372$.getDynamicValue(var2);
        }
        return module0048.f3326();
    }
    
    public static SubLObject f35600(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic241$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic242$, (SubLObject)ConsesLow.listS((SubLObject)$ic28$, var7, (SubLObject)ConsesLow.list((SubLObject)$ic243$, var7), (SubLObject)$ic244$))), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f35601(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic245$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic246$, (SubLObject)ConsesLow.listS((SubLObject)$ic28$, var7, (SubLObject)ConsesLow.list((SubLObject)$ic243$, var7), (SubLObject)$ic247$))), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f35602(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic248$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic248$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic248$);
        var9 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var10;
            var6 = (var10 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)$ic249$, var8, (SubLObject)ConsesLow.listS((SubLObject)$ic250$, var9, ConsesLow.append(var10, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic248$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35603(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic251$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        final SubLObject var8 = (SubLObject)(var6.isCons() ? var6.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)$ic251$);
        var6 = var6.rest();
        if (NIL != var6) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic251$);
            return (SubLObject)NIL;
        }
        final SubLObject var9;
        var6 = (var9 = var7);
        if (NIL == var8) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic252$, (SubLObject)$ic242$, ConsesLow.append(var9, (SubLObject)NIL));
        }
        final SubLObject var10 = (SubLObject)$ic253$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic254$, (SubLObject)NIL, ConsesLow.append(var9, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic55$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list(reader.bq_cons(var10, (SubLObject)$ic255$)), (SubLObject)ConsesLow.list((SubLObject)$ic93$, (SubLObject)ConsesLow.listS((SubLObject)$ic256$, var10, (SubLObject)$ic244$), (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic242$, var10)), (SubLObject)$ic257$, (SubLObject)ConsesLow.listS((SubLObject)$ic252$, (SubLObject)$ic242$, ConsesLow.append(var9, (SubLObject)NIL)))))));
    }
    
    public static SubLObject f35604(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic252$, (SubLObject)$ic258$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f35605(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic259$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic259$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic259$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic259$);
        var10 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var11;
            var6 = (var11 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)$ic260$, (SubLObject)ConsesLow.listS(var8, var9, (SubLObject)$ic261$), (SubLObject)ConsesLow.listS((SubLObject)$ic93$, (SubLObject)ConsesLow.list((SubLObject)$ic262$, var10, (SubLObject)ConsesLow.listS((SubLObject)EQ, var8, (SubLObject)$ic263$)), ConsesLow.append(var11, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic259$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35606(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic264$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic264$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic264$);
        var9 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var10;
            var6 = (var10 = var7);
            final SubLObject var11 = (SubLObject)$ic265$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var11, (SubLObject)ConsesLow.list((SubLObject)$ic44$, (SubLObject)$ic266$, (SubLObject)ConsesLow.list((SubLObject)$ic46$, var8))), (SubLObject)ConsesLow.list((SubLObject)$ic266$, (SubLObject)ConsesLow.list((SubLObject)$ic44$, (SubLObject)$ic266$, var8))), (SubLObject)ConsesLow.list((SubLObject)$ic55$, var11, (SubLObject)ConsesLow.list((SubLObject)$ic267$, (SubLObject)ONE_INTEGER, (SubLObject)$ic268$, var9)), ConsesLow.append(var10, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic55$, var11, (SubLObject)$ic269$))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic264$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35607(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic270$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        final SubLObject var8 = var6.isCons() ? var6.first() : module0579.$g4288$.getGlobalValue();
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)$ic270$);
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic271$, var8, (SubLObject)$ic272$), (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic273$, var8)), ConsesLow.append(var9, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic270$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35608(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic270$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        final SubLObject var8 = var6.isCons() ? var6.first() : module0579.$g4288$.getGlobalValue();
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)$ic270$);
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic271$, var8, (SubLObject)$ic272$), (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic273$, (SubLObject)ConsesLow.list((SubLObject)$ic274$, var8))), ConsesLow.append(var9, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic270$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35609(final SubLObject var11) {
        return module0048.f3331(var11);
    }
    
    public static SubLObject f35610(final SubLObject var240) {
        final SubLThread var241 = SubLProcess.currentSubLThread();
        final SubLObject var242 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic276$), (SubLObject)ConsesLow.list(var240, module0579.$g4287$.getDynamicValue(var241)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (NIL != var242) ? module0048.f3382(var242, (SubLObject)UNPROVIDED) : module0048.f3326();
    }
    
    public static SubLObject f35611(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)$ic277$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f35612(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic278$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic278$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)$ic279$, var8), (SubLObject)ConsesLow.list((SubLObject)$ic280$, (SubLObject)ConsesLow.list((SubLObject)$ic281$, (SubLObject)ConsesLow.list((SubLObject)$ic282$, var8))), (SubLObject)$ic283$), reader.bq_cons((SubLObject)$ic284$, ConsesLow.append(var9, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic278$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35613(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        final SubLObject var8 = (SubLObject)$ic285$;
        final SubLObject var9 = (SubLObject)$ic286$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic49$, (SubLObject)ConsesLow.list(var8, var9), (SubLObject)$ic287$, (SubLObject)ConsesLow.listS((SubLObject)$ic288$, (SubLObject)ConsesLow.list(var8, var9), ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f35614() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0579.$g4309$.getDynamicValue(var2)) {
            module0016.f892();
            module0016.f895();
        }
        return (SubLObject)NIL;
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
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic291$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic291$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            final SubLObject var10 = (SubLObject)$ic292$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic4$, reader.bq_cons(reader.bq_cons(var10, (SubLObject)$ic293$), (SubLObject)$ic294$), (SubLObject)$ic295$, (SubLObject)ConsesLow.list((SubLObject)$ic92$, (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic296$, var10)), ConsesLow.append(var9, (SubLObject)NIL)), (SubLObject)$ic297$, (SubLObject)ConsesLow.listS((SubLObject)$ic116$, (SubLObject)ConsesLow.list((SubLObject)$ic298$, var8), (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)$ic299$, (SubLObject)ConsesLow.list((SubLObject)$ic267$, (SubLObject)ONE_INTEGER, (SubLObject)$ic300$, (SubLObject)$ic296$, (SubLObject)ConsesLow.list((SubLObject)$ic301$, var10)), (SubLObject)ConsesLow.list((SubLObject)$ic302$, var10)), (SubLObject)$ic303$)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic291$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35617(final SubLObject var255) {
        final SubLThread var256 = SubLProcess.currentSubLThread();
        module0754.f47306();
        SubLObject var257;
        for (var257 = module0066.f4838(module0067.f4891(var255)); NIL == module0066.f4841(var257); var257 = module0066.f4840(var257)) {
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
        final SubLObject var8 = (SubLObject)$ic305$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.listS((SubLObject)$ic306$, reader.bq_cons(var8, (SubLObject)$ic307$), (SubLObject)$ic308$), (SubLObject)$ic309$, (SubLObject)ConsesLow.list((SubLObject)$ic92$, reader.bq_cons((SubLObject)$ic1$, ConsesLow.append(var7, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic310$, (SubLObject)ConsesLow.list((SubLObject)$ic311$, (SubLObject)$ic312$, var8))), (SubLObject)$ic313$)));
    }
    
    public static SubLObject f35619(final SubLObject var261) {
        SubLObject var262 = var261;
        SubLObject var263 = (SubLObject)NIL;
        var263 = var262.first();
        while (NIL != var262) {
            if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic316$, var263);
            }
            module0754.f47316(var263);
            module0755.f47450(var263);
            var262 = var262.rest();
            var263 = var262.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35620(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic317$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic317$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic317$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic317$);
        var10 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            var6 = var7;
            SubLObject var11 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic317$);
            var11 = var6.first();
            final SubLObject var12;
            var6 = (var12 = var6.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)$ic318$, (SubLObject)ConsesLow.list(var8, var9, var10), var11, ConsesLow.append(var12, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic317$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35621(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic319$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic319$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic319$);
        var9 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var10;
            var6 = (var10 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)$ic320$, var9))), ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic319$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35622(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic321$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic321$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic321$);
        var9 = var6.first();
        var6 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = var6;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var282_283 = (SubLObject)NIL;
        while (NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)$ic321$);
            var282_283 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)$ic321$);
            if (NIL == conses_high.member(var282_283, (SubLObject)$ic322$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var12 = (SubLObject)T;
            }
            if (var282_283 == $ic150$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (NIL != var12 && NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic321$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic323$, var6);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic324$, var6);
        final SubLObject var16 = (NIL != var15) ? conses_high.cadr(var15) : module0751.f46691();
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic325$, var6);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : $ic326$);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic327$, var6);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : $ic328$);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)$ic329$, var6);
        final SubLObject var22 = (SubLObject)((NIL != var21) ? conses_high.cadr(var21) : NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic204$, var6);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : NIL);
        final SubLObject var25;
        var6 = (var25 = var7);
        final SubLObject var26 = (SubLObject)$ic330$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)$ic331$, var9, var22, var14, var20, var16))), (SubLObject)ConsesLow.list((SubLObject)$ic92$, (SubLObject)ConsesLow.list((SubLObject)$ic175$, (SubLObject)ConsesLow.list((SubLObject)$ic262$, var24, (SubLObject)ConsesLow.list((SubLObject)$ic332$, var26)), (SubLObject)ConsesLow.list((SubLObject)$ic49$, (SubLObject)ConsesLow.list(var8, var18), (SubLObject)ConsesLow.list((SubLObject)$ic333$, var26), (SubLObject)ConsesLow.list((SubLObject)$ic191$, var18), (SubLObject)ConsesLow.listS((SubLObject)$ic55$, (SubLObject)ConsesLow.list((SubLObject)$ic334$, var8), ConsesLow.append(var25, (SubLObject)NIL))))), (SubLObject)ConsesLow.list((SubLObject)$ic335$, var26));
    }
    
    public static SubLObject f35623(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic336$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic336$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic336$);
        var9 = var6.first();
        var6 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = var6;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var303_304 = (SubLObject)NIL;
        while (NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)$ic336$);
            var303_304 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)$ic336$);
            if (NIL == conses_high.member(var303_304, (SubLObject)$ic337$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var12 = (SubLObject)T;
            }
            if (var303_304 == $ic150$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (NIL != var12 && NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic336$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic338$, var6);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic324$, var6);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic327$, var6);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : $ic328$);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic204$, var6);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : NIL);
        final SubLObject var21;
        var6 = (var21 = var7);
        final SubLObject var22 = (SubLObject)$ic339$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic340$, (SubLObject)ConsesLow.list(new SubLObject[] { var22, var9, $ic329$, var14, $ic324$, var16, $ic327$, var18, $ic204$, var20 }), (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)$ic341$, var22, var9, var16, var18))), ConsesLow.append(var21, (SubLObject)NIL)));
    }
    
    public static SubLObject f35624() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return $g4374$.getDynamicValue(var2);
    }
    
    public static SubLObject f35625() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)makeBoolean(NIL != $g4376$.getDynamicValue(var2) && NIL != $g4377$.getDynamicValue(var2));
        return var3;
    }
    
    public static SubLObject f35626(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        final SubLObject var8 = (SubLObject)$ic345$;
        final SubLObject var9 = (SubLObject)$ic346$;
        final SubLObject var10 = (SubLObject)$ic347$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list(reader.bq_cons(var10, (SubLObject)$ic348$), (SubLObject)ConsesLow.list((SubLObject)$ic349$, (SubLObject)ConsesLow.listS((SubLObject)$ic28$, var10, (SubLObject)$ic350$)), (SubLObject)$ic351$, reader.bq_cons(var8, (SubLObject)$ic115$), reader.bq_cons(var9, (SubLObject)$ic115$)), (SubLObject)ConsesLow.list((SubLObject)$ic352$, (SubLObject)ConsesLow.list((SubLObject)$ic262$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic46$, var9)), (SubLObject)ConsesLow.list((SubLObject)$ic55$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic353$, var8), (SubLObject)ConsesLow.listS((SubLObject)$ic139$, var8, (SubLObject)$ic115$)), (SubLObject)ConsesLow.listS((SubLObject)$ic354$, (SubLObject)$ic355$, var8, ConsesLow.append(var7, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic139$, var9, (SubLObject)$ic172$)));
    }
    
    public static SubLObject f35627() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)makeBoolean(NIL == $g4377$.getDynamicValue(var2));
        return var3;
    }
    
    public static SubLObject f35628(final SubLObject var316) {
        Dynamic.sublisp_throw((SubLObject)$ic355$, var316);
        return var316;
    }
    
    public static SubLObject f35629(final SubLObject var317) {
        final SubLThread var318 = SubLProcess.currentSubLThread();
        if (NIL == f35625()) {
            final SubLObject var319 = Sequences.cconcatenate((SubLObject)$ic97$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic98$, module0006.f203((SubLObject)$ic357$) });
            module0578.f35476(var319, (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY));
        }
        if (NIL != module0077.f5320(var317, $g4375$.getDynamicValue(var318))) {
            final SubLObject var319 = Sequences.cconcatenate((SubLObject)$ic97$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic98$, module0006.f203((SubLObject)$ic358$) });
            module0578.f35476(var319, (SubLObject)ConsesLow.list(var317));
        }
        module0077.f5326(var317, $g4375$.getDynamicValue(var318));
        if (module0077.f5311($g4375$.getDynamicValue(var318)).numG($g4374$.getDynamicValue(var318))) {
            final SubLObject var319 = Sequences.cconcatenate((SubLObject)$ic97$, new SubLObject[] { module0006.f205((SubLObject)TWO_INTEGER), $ic98$, module0006.f203((SubLObject)$ic359$) });
            module0578.f35476(var319, (SubLObject)ConsesLow.list($g4374$.getDynamicValue(var318), var317));
        }
        return $g4375$.getDynamicValue(var318);
    }
    
    public static SubLObject f35630(final SubLObject var318) {
        final SubLThread var319 = SubLProcess.currentSubLThread();
        SubLObject var320 = (SubLObject)ZERO_INTEGER;
        if (NIL != $g4377$.getDynamicValue(var319)) {
            SubLObject var321 = (SubLObject)NIL;
            final SubLObject var322 = module0077.f5333($g4375$.getDynamicValue(var319));
            SubLObject var323;
            SubLObject var324;
            SubLObject var325;
            for (var323 = module0032.f1741(var322), var324 = (SubLObject)NIL, var324 = module0032.f1742(var323, var322); NIL == module0032.f1744(var323, var324); var324 = module0032.f1743(var324)) {
                var325 = module0032.f1745(var323, var324);
                if (NIL != module0032.f1746(var324, var325) && conses_high.getf(var325, (SubLObject)$ic360$, (SubLObject)UNPROVIDED).equal(var318)) {
                    var321 = (SubLObject)ConsesLow.cons(var325, var321);
                }
            }
            SubLObject var326 = var321;
            SubLObject var327 = (SubLObject)NIL;
            var327 = var326.first();
            while (NIL != var326) {
                var320 = Numbers.add(var320, (SubLObject)ONE_INTEGER);
                module0077.f5327(var327, $g4375$.getDynamicValue(var319));
                var326 = var326.rest();
                var327 = var326.first();
            }
            if (var320.isPositive() && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic361$, var320, var318);
            }
        }
        return var320;
    }
    
    public static SubLObject f35631(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic362$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic362$);
        var8 = var6.first();
        var6 = var6.rest();
        final SubLObject var9 = (SubLObject)(var6.isCons() ? var6.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)$ic362$);
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var10;
            var6 = (var10 = var7);
            final SubLObject var11 = (SubLObject)$ic363$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var11, (SubLObject)ConsesLow.list((SubLObject)$ic364$, var8, var9))), (SubLObject)ConsesLow.list((SubLObject)$ic365$, var8, var11), reader.bq_cons((SubLObject)$ic92$, ConsesLow.append(var10, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic366$, var8, var11)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic362$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35632(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic367$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic368$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f35633(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic291$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic291$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            final SubLObject var10 = (SubLObject)$ic369$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, (SubLObject)ConsesLow.list((SubLObject)$ic370$, var8))), (SubLObject)ConsesLow.list((SubLObject)$ic92$, reader.bq_cons((SubLObject)$ic1$, ConsesLow.append(var9, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic371$, var8, var10)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic291$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35634(final SubLObject var97) {
        SubLObject var98 = (SubLObject)NIL;
        if (NIL != module0751.f47213(module0756.f47487(var97, (SubLObject)UNPROVIDED))) {
            var98 = module0756.f47487(var97, (SubLObject)UNPROVIDED);
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic373$, var98);
            }
            module0756.f47745(var97, module0751.f46604((SubLObject)$ic374$));
            final SubLObject var99 = module0756.f47488(var97, (SubLObject)UNPROVIDED);
            final SubLObject var100 = module0751.f47143(var98, var99);
            if (!var99.equal(var100)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic375$, var100);
                }
                module0756.f47784(var97, var100, (SubLObject)UNPROVIDED);
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic376$, module0756.f47488(var97, (SubLObject)UNPROVIDED));
                }
            }
        }
        return var98;
    }
    
    public static SubLObject f35635(final SubLObject var97, final SubLObject var318, SubLObject var339) {
        if (var339 == UNPROVIDED) {
            var339 = module0579.$g4256$.getDynamicValue();
        }
        if (NIL != module0751.f47213(var318)) {
            f35636(var97, var318);
            if (NIL != module0756.f47479(var97)) {
                f35637(var97, module0751.f47144(var318), var339);
                if (NIL != module0756.f47760(var97)) {
                    module0758.f47893(var97);
                }
            }
        }
        return var97;
    }
    
    public static SubLObject f35637(final SubLObject var97, final SubLObject var340, SubLObject var339) {
        if (var339 == UNPROVIDED) {
            var339 = (SubLObject)NIL;
        }
        final SubLThread var341 = SubLProcess.currentSubLThread();
        if (NIL != module0751.f47145(var340)) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic377$, module0756.f47467(var97));
            }
            SubLObject var342 = (SubLObject)NIL;
            SubLObject var343 = (SubLObject)NIL;
            final SubLObject var344 = Errors.$continue_cerrorP$.currentBinding(var341);
            final SubLObject var345 = module0578.$g4234$.currentBinding(var341);
            try {
                Errors.$continue_cerrorP$.bind((SubLObject)NIL, var341);
                module0578.$g4234$.bind((SubLObject)T, var341);
                if (NIL != module0578.f35473()) {
                    final SubLObject var346 = f35627();
                    final SubLObject var99_345 = $g4375$.currentBinding(var341);
                    final SubLObject var343_346 = $g4377$.currentBinding(var341);
                    try {
                        $g4375$.bind((NIL != var346) ? module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), f35624()) : $g4375$.getDynamicValue(var341), var341);
                        $g4377$.bind((SubLObject)T, var341);
                        for (SubLObject var347 = (SubLObject)NIL, var348 = (SubLObject)NIL; NIL != var347 || NIL == var348; var348 = (SubLObject)T) {
                            if (NIL != var347) {
                                f35629(var347);
                                var347 = (SubLObject)NIL;
                            }
                            try {
                                var341.throwStack.push($ic355$);
                                if (NIL == var342) {
                                    var341.resetMultipleValues();
                                    final SubLObject var349 = f35638(var97, var340, var339);
                                    final SubLObject var350 = var341.secondMultipleValue();
                                    var341.resetMultipleValues();
                                    if (NIL != var350) {
                                        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                                            Errors.warn((SubLObject)$ic378$, var350);
                                        }
                                        module0756.f47501(var97, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                                        var342 = (SubLObject)T;
                                    }
                                    else {
                                        final SubLObject var351 = f35639(var97);
                                        SubLObject var353;
                                        final SubLObject var352 = var353 = var349;
                                        SubLObject var354 = (SubLObject)NIL;
                                        SubLObject var355 = (SubLObject)NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var353, var352, (SubLObject)$ic379$);
                                        var354 = var353.first();
                                        var353 = var353.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var353, var352, (SubLObject)$ic379$);
                                        var355 = var353.first();
                                        var353 = var353.rest();
                                        if (NIL == var353) {
                                            if (NIL != module0756.f47478(var97)) {
                                                SubLObject var356 = var354;
                                                SubLObject var357 = (SubLObject)NIL;
                                                var357 = var356.first();
                                                while (NIL != var356) {
                                                    if (NIL != var351) {
                                                        module0756.f47836(var357, var97);
                                                    }
                                                    else {
                                                        module0756.f47834(module0749.f46494((SubLObject)$ic380$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var97);
                                                        module0756.f47834(var357, var97);
                                                    }
                                                    var356 = var356.rest();
                                                    var357 = var356.first();
                                                }
                                                var356 = Sequences.reverse(var355);
                                                var357 = (SubLObject)NIL;
                                                var357 = var356.first();
                                                while (NIL != var356) {
                                                    module0756.f47834(var357, var97);
                                                    var356 = var356.rest();
                                                    var357 = var356.first();
                                                }
                                            }
                                            else {
                                                SubLObject var358 = module0756.f47467(var97);
                                                SubLObject var359 = var354;
                                                SubLObject var360 = (SubLObject)NIL;
                                                var360 = var359.first();
                                                while (NIL != var359) {
                                                    var358 = ((NIL != var351) ? ConsesLow.append(var358, module0756.f47467(var360)) : ConsesLow.append(module0756.f47467(var360), var358));
                                                    var359 = var359.rest();
                                                    var360 = var359.first();
                                                }
                                                var359 = Sequences.reverse(var355);
                                                var360 = (SubLObject)NIL;
                                                var360 = var359.first();
                                                while (NIL != var359) {
                                                    var358 = ConsesLow.append(module0756.f47467(var360), var358);
                                                    var359 = var359.rest();
                                                    var360 = var359.first();
                                                }
                                                module0756.f47501(var97, var358, (SubLObject)UNPROVIDED);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var352, (SubLObject)$ic379$);
                                        }
                                    }
                                }
                            }
                            catch (Throwable var361) {
                                var347 = Errors.handleThrowable(var361, (SubLObject)$ic355$);
                            }
                            finally {
                                var341.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        $g4377$.rebind(var343_346, var341);
                        $g4375$.rebind(var99_345, var341);
                    }
                }
                else {
                    try {
                        var341.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var99_346 = Errors.$error_handler$.currentBinding(var341);
                        try {
                            Errors.$error_handler$.bind((SubLObject)$ic381$, var341);
                            try {
                                final SubLObject var362 = f35627();
                                final SubLObject var99_347 = $g4375$.currentBinding(var341);
                                final SubLObject var343_347 = $g4377$.currentBinding(var341);
                                try {
                                    $g4375$.bind((NIL != var362) ? module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), f35624()) : $g4375$.getDynamicValue(var341), var341);
                                    $g4377$.bind((SubLObject)T, var341);
                                    for (SubLObject var363 = (SubLObject)NIL, var364 = (SubLObject)NIL; NIL != var363 || NIL == var364; var364 = (SubLObject)T) {
                                        if (NIL != var363) {
                                            f35629(var363);
                                            var363 = (SubLObject)NIL;
                                        }
                                        try {
                                            var341.throwStack.push($ic355$);
                                            if (NIL == var342) {
                                                var341.resetMultipleValues();
                                                final SubLObject var365 = f35638(var97, var340, var339);
                                                final SubLObject var366 = var341.secondMultipleValue();
                                                var341.resetMultipleValues();
                                                if (NIL != var366) {
                                                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                                                        Errors.warn((SubLObject)$ic378$, var366);
                                                    }
                                                    module0756.f47501(var97, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                                                    var342 = (SubLObject)T;
                                                }
                                                else {
                                                    final SubLObject var367 = f35639(var97);
                                                    SubLObject var369;
                                                    final SubLObject var368 = var369 = var365;
                                                    SubLObject var370 = (SubLObject)NIL;
                                                    SubLObject var371 = (SubLObject)NIL;
                                                    cdestructuring_bind.destructuring_bind_must_consp(var369, var368, (SubLObject)$ic379$);
                                                    var370 = var369.first();
                                                    var369 = var369.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(var369, var368, (SubLObject)$ic379$);
                                                    var371 = var369.first();
                                                    var369 = var369.rest();
                                                    if (NIL == var369) {
                                                        if (NIL != module0756.f47478(var97)) {
                                                            SubLObject var359 = var370;
                                                            SubLObject var360 = (SubLObject)NIL;
                                                            var360 = var359.first();
                                                            while (NIL != var359) {
                                                                if (NIL != var367) {
                                                                    module0756.f47836(var360, var97);
                                                                }
                                                                else {
                                                                    module0756.f47834(module0749.f46494((SubLObject)$ic380$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var97);
                                                                    module0756.f47834(var360, var97);
                                                                }
                                                                var359 = var359.rest();
                                                                var360 = var359.first();
                                                            }
                                                            var359 = Sequences.reverse(var371);
                                                            var360 = (SubLObject)NIL;
                                                            var360 = var359.first();
                                                            while (NIL != var359) {
                                                                module0756.f47834(var360, var97);
                                                                var359 = var359.rest();
                                                                var360 = var359.first();
                                                            }
                                                        }
                                                        else {
                                                            SubLObject var372 = module0756.f47467(var97);
                                                            SubLObject var373 = var370;
                                                            SubLObject var374 = (SubLObject)NIL;
                                                            var374 = var373.first();
                                                            while (NIL != var373) {
                                                                var372 = ((NIL != var367) ? ConsesLow.append(var372, module0756.f47467(var374)) : ConsesLow.append(module0756.f47467(var374), var372));
                                                                var373 = var373.rest();
                                                                var374 = var373.first();
                                                            }
                                                            var373 = Sequences.reverse(var371);
                                                            var374 = (SubLObject)NIL;
                                                            var374 = var373.first();
                                                            while (NIL != var373) {
                                                                var372 = ConsesLow.append(module0756.f47467(var374), var372);
                                                                var373 = var373.rest();
                                                                var374 = var373.first();
                                                            }
                                                            module0756.f47501(var97, var372, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else {
                                                        cdestructuring_bind.cdestructuring_bind_error(var368, (SubLObject)$ic379$);
                                                    }
                                                }
                                            }
                                        }
                                        catch (Throwable var375) {
                                            var363 = Errors.handleThrowable(var375, (SubLObject)$ic355$);
                                        }
                                        finally {
                                            var341.throwStack.pop();
                                        }
                                    }
                                }
                                finally {
                                    $g4377$.rebind(var343_347, var341);
                                    $g4375$.rebind(var99_347, var341);
                                }
                            }
                            catch (Throwable var376) {
                                Errors.handleThrowable(var376, (SubLObject)NIL);
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
                    if (var343.isString() && NIL == module0578.f35477()) {
                        Errors.warn(Sequences.cconcatenate(module0752.f47234(var343), (SubLObject)$ic382$), module0579.f35508());
                    }
                }
            }
            finally {
                module0578.$g4234$.rebind(var345, var341);
                Errors.$continue_cerrorP$.rebind(var344, var341);
            }
            if (NIL != var342) {
                return (SubLObject)$ic383$;
            }
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic384$, module0756.f47467(var97));
            }
        }
        return module0756.f47467(var97);
    }
    
    public static SubLObject f35639(final SubLObject var97) {
        if (NIL != module0756.f47822(var97)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f35638(final SubLObject var97, final SubLObject var340, SubLObject var339) {
        if (var339 == UNPROVIDED) {
            var339 = (SubLObject)NIL;
        }
        final SubLThread var341 = SubLProcess.currentSubLThread();
        final SubLObject var342 = module0751.f47200();
        SubLObject var343 = (SubLObject)NIL;
        SubLObject var344 = (SubLObject)NIL;
        SubLObject var345 = (SubLObject)NIL;
        if (NIL != module0751.f47145(var340)) {
            SubLObject var346 = (SubLObject)NIL;
            SubLObject var347 = (SubLObject)NIL;
            SubLObject var348 = (SubLObject)NIL;
            var346 = var340;
            var347 = var346.first();
            for (var348 = (SubLObject)ZERO_INTEGER; NIL == var345 && NIL != var346; var346 = var346.rest(), var347 = var346.first(), var348 = Numbers.add((SubLObject)ONE_INTEGER, var348)) {
                if (!var347.equal((SubLObject)$ic385$)) {
                    if (NIL == module0751.f46684(var347, $ic386$, (SubLObject)UNPROVIDED)) {
                        if (NIL == var339) {
                            final SubLObject var349 = f35640(var340, var348, var342, (SubLObject)$ic387$);
                            final SubLObject var350 = module0749.f46494((SubLObject)$ic388$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            final SubLObject var351 = module0749.f46494((SubLObject)$ic380$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            if (NIL == var345) {
                                SubLObject var352 = (SubLObject)ConsesLow.list(var351, var349, var350);
                                SubLObject var353 = (SubLObject)NIL;
                                var353 = var352.first();
                                while (NIL == var345 && NIL != var352) {
                                    module0758.f47878(var353, (SubLObject)$ic389$, var97);
                                    if (NIL != module0756.f47479(var353)) {
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
                    else if (NIL == module0579.$g4258$.getDynamicValue(var341) && NIL != module0751.f47047(module0205.f13203(var347, (SubLObject)UNPROVIDED), $ic390$)) {
                        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic391$, var347);
                        }
                    }
                    else {
                        final SubLObject var349 = f35640(var340, var348, var342, (SubLObject)UNPROVIDED);
                        module0770.f49065(var349, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (NIL != module0756.f47479(var349)) {
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
        if (var291 == UNPROVIDED) {
            var291 = (SubLObject)$ic392$;
        }
        final SubLObject var374 = ConsesLow.nth(var369, var340);
        final SubLObject var375 = f35641(var340, var369);
        final SubLObject var376 = module0751.f46604(var375);
        final SubLObject var377 = module0751.f46693(var373, var376);
        final SubLObject var378 = module0756.f47463(var374, var377, (SubLObject)UNPROVIDED);
        module0756.f47784(var378, var291, (SubLObject)UNPROVIDED);
        return var378;
    }
    
    public static SubLObject f35641(final SubLObject var340, final SubLObject var369) {
        return (SubLObject)((NIL != module0035.f2002(var340, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) ? ConsesLow.list((SubLObject)ONE_INTEGER, module0048.f_1X(var369)) : ConsesLow.list((SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f35642(final SubLObject var97, final SubLObject var318) {
        if (NIL != module0751.f47213(var318)) {
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
        final SubLObject var8 = (SubLObject)$ic393$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list(reader.bq_cons(var8, (SubLObject)$ic394$)), (SubLObject)ConsesLow.list((SubLObject)$ic92$, (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)$ic395$, ConsesLow.append(var7, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic93$, var8, (SubLObject)$ic396$)));
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35645() {
        $g4358$ = SubLFiles.defparameter("S#39226", module0107.f7627());
        $g4359$ = SubLFiles.defparameter("S#39227", module0107.f7627());
        $g4360$ = SubLFiles.defconstant("S#39228", (SubLObject)$ic66$);
        $g4361$ = SubLFiles.defparameter("S#39229", module0107.f7627());
        $g4362$ = SubLFiles.defparameter("S#39230", (SubLObject)NIL);
        $g4363$ = SubLFiles.defparameter("S#39231", module0107.f7627());
        $g4364$ = SubLFiles.defparameter("S#39232", (SubLObject)NIL);
        $g4365$ = SubLFiles.defparameter("S#39233", (SubLObject)NIL);
        $g4366$ = SubLFiles.defparameter("S#39234", module0107.f7627());
        $g4367$ = SubLFiles.defparameter("S#39235", (SubLObject)NIL);
        $g4368$ = SubLFiles.defparameter("S#39236", (SubLObject)$ic207$);
        $g4369$ = SubLFiles.defparameter("S#39237", (SubLObject)NIL);
        $g4370$ = SubLFiles.defparameter("S#39238", (SubLObject)NIL);
        $g4371$ = SubLFiles.defparameter("S#39239", (SubLObject)ZERO_INTEGER);
        $g4372$ = SubLFiles.defparameter("S#39240", (SubLObject)FIVE_INTEGER);
        $g4373$ = SubLFiles.defvar("S#39241", (SubLObject)ZERO_INTEGER);
        $g4374$ = SubLFiles.defparameter("S#39242", (SubLObject)$ic342$);
        $g4375$ = SubLFiles.defparameter("S#39243", (SubLObject)NIL);
        $g4376$ = SubLFiles.defparameter("S#39244", (SubLObject)T);
        $g4377$ = SubLFiles.defparameter("S#39245", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35646() {
        module0002.f50((SubLObject)$ic29$, (SubLObject)$ic31$);
        module0002.f50((SubLObject)$ic60$, (SubLObject)$ic61$);
        module0002.f50((SubLObject)$ic64$, (SubLObject)$ic65$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g4360$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic73$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic74$);
        Structures.def_csetf((SubLObject)$ic75$, (SubLObject)$ic76$);
        Equality.identity((SubLObject)$ic66$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g4360$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic83$));
        module0002.f50((SubLObject)$ic85$, (SubLObject)$ic48$);
        module0002.f50((SubLObject)$ic95$, (SubLObject)$ic48$);
        module0002.f50((SubLObject)$ic103$, (SubLObject)$ic104$);
        module0002.f50((SubLObject)$ic108$, (SubLObject)$ic104$);
        module0002.f50((SubLObject)$ic122$, (SubLObject)$ic123$);
        module0002.f50((SubLObject)$ic127$, (SubLObject)$ic122$);
        module0002.f50((SubLObject)$ic129$, (SubLObject)$ic122$);
        module0002.f50((SubLObject)$ic131$, (SubLObject)$ic123$);
        module0002.f50((SubLObject)$ic132$, (SubLObject)$ic122$);
        module0002.f50((SubLObject)$ic140$, (SubLObject)$ic142$);
        module0002.f50((SubLObject)$ic178$, (SubLObject)$ic179$);
        module0002.f50((SubLObject)$ic181$, (SubLObject)$ic179$);
        module0002.f50((SubLObject)$ic192$, (SubLObject)$ic179$);
        module0002.f50((SubLObject)$ic187$, (SubLObject)$ic181$);
        module0002.f50((SubLObject)$ic182$, (SubLObject)$ic179$);
        module0002.f50((SubLObject)$ic185$, (SubLObject)$ic179$);
        module0002.f50((SubLObject)$ic233$, (SubLObject)$ic239$);
        module0002.f50((SubLObject)$ic240$, (SubLObject)$ic239$);
        module0002.f50((SubLObject)$ic274$, (SubLObject)$ic275$);
        module0002.f50((SubLObject)$ic289$, (SubLObject)$ic290$);
        module0002.f50((SubLObject)$ic302$, (SubLObject)$ic304$);
        module0002.f50((SubLObject)$ic314$, (SubLObject)$ic315$);
        module0002.f50((SubLObject)$ic343$, (SubLObject)$ic344$);
        module0002.f50((SubLObject)$ic356$, (SubLObject)$ic344$);
        module0002.f50((SubLObject)$ic353$, (SubLObject)$ic344$);
        module0002.f50((SubLObject)$ic370$, (SubLObject)$ic372$);
        module0002.f50((SubLObject)$ic371$, (SubLObject)$ic372$);
        return (SubLObject)NIL;
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
        $g4358$ = null;
        $g4359$ = null;
        $g4360$ = null;
        $g4361$ = null;
        $g4362$ = null;
        $g4363$ = null;
        $g4364$ = null;
        $g4365$ = null;
        $g4366$ = null;
        $g4367$ = null;
        $g4368$ = null;
        $g4369$ = null;
        $g4370$ = null;
        $g4371$ = null;
        $g4372$ = null;
        $g4373$ = null;
        $g4374$ = null;
        $g4375$ = null;
        $g4376$ = null;
        $g4377$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#39246", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeSymbol("PROGN");
        $ic2$ = makeSymbol("ENFORCE-TYPE");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#3593", "CYC"));
        $ic4$ = makeSymbol("CLET");
        $ic5$ = makeSymbol("S#38976", "CYC");
        $ic6$ = makeSymbol("CHECK-TYPE");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("S#39113", "CYC"));
        $ic8$ = makeSymbol("S#38977", "CYC");
        $ic9$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#35986", "CYC"));
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("S#39247", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic11$ = makeSymbol("S#157", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("S#39115", "CYC"));
        $ic13$ = makeSymbol("S#38978", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39248", "CYC"), (SubLObject)makeSymbol("S#39249", "CYC"), (SubLObject)makeSymbol("MAP")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic15$ = makeSymbol("DO-ALIST");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38960", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FIRST-OF"), (SubLObject)makeSymbol("S#38960", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQUALP)))));
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("S#39250", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("PPH-PRECISION-P"));
        $ic19$ = makeSymbol("*PARAPHRASE-PRECISION*");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("*PPH-TERSE-MODE?*"), (SubLObject)T));
        $ic21$ = makeSymbol("WITH-PARAPHRASE-PRECISION");
        $ic22$ = makeSymbol("S#39117", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#39251", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("S#39120", "CYC"));
        $ic25$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("*PPH-MAXIMIZE-LINKS?*"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*PPH-LINK-ARG0?*"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), (SubLObject)NIL));
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39252", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic27$ = makeSymbol("S#39037", "CYC");
        $ic28$ = makeSymbol("FIF");
        $ic29$ = makeSymbol("S#39122", "CYC");
        $ic30$ = ConsesLow.list((SubLObject)makeKeyword("UNSPECIFIED"));
        $ic31$ = makeSymbol("S#39121", "CYC");
        $ic32$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#1553", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic33$ = makeSymbol("S#39002", "CYC");
        $ic34$ = makeSymbol("FIRST-OF");
        $ic35$ = ConsesLow.list((SubLObject)makeSymbol("S#39002", "CYC"));
        $ic36$ = makeSymbol("S#39005", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("S#39005", "CYC"));
        $ic38$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#37217", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic39$ = makeSymbol("S#39006", "CYC");
        $ic40$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39002", "CYC"), (SubLObject)makeKeyword("NONE")));
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39003", "CYC"), (SubLObject)T));
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("S#151", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic43$ = makeSymbol("S#39008", "CYC");
        $ic44$ = makeSymbol("CAND");
        $ic45$ = ConsesLow.list((SubLObject)makeSymbol("S#38940", "CYC"));
        $ic46$ = makeSymbol("CNOT");
        $ic47$ = makeUninternedSymbol("US#305812D");
        $ic48$ = makeSymbol("S#39143", "CYC");
        $ic49$ = makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic50$ = makeSymbol("S#39226", "CYC");
        $ic51$ = ConsesLow.list((SubLObject)makeSymbol("S#39129", "CYC"));
        $ic52$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39227", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39130", "CYC"))));
        $ic53$ = makeSymbol("S#3165", "CYC");
        $ic54$ = ConsesLow.list((SubLObject)makeSymbol("S#39226", "CYC"));
        $ic55$ = makeSymbol("PWHEN");
        $ic56$ = ConsesLow.list((SubLObject)makeKeyword("NEW"));
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3044", "CYC"), (SubLObject)makeSymbol("S#39226", "CYC")));
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3174", "CYC"), (SubLObject)makeSymbol("S#39226", "CYC")));
        $ic59$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39130", "CYC")));
        $ic60$ = makeSymbol("S#39129", "CYC");
        $ic61$ = makeSymbol("WITH-PPH-MEMOIZATION");
        $ic62$ = makeKeyword("REUSED");
        $ic63$ = makeKeyword("NEW");
        $ic64$ = makeSymbol("S#39130", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)makeSymbol("WITH-PPH-MEMOIZATION"), (SubLObject)makeSymbol("S#39128", "CYC"));
        $ic66$ = makeSymbol("S#39062", "CYC");
        $ic67$ = makeSymbol("S#39063", "CYC");
        $ic68$ = ConsesLow.list((SubLObject)makeSymbol("S#3268", "CYC"));
        $ic69$ = ConsesLow.list((SubLObject)makeKeyword("STORE"));
        $ic70$ = ConsesLow.list((SubLObject)makeSymbol("S#39132", "CYC"));
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("S#39133", "CYC"));
        $ic72$ = makeSymbol("S#39137", "CYC");
        $ic73$ = makeSymbol("S#39131", "CYC");
        $ic74$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#39063", "CYC"));
        $ic75$ = makeSymbol("S#39132", "CYC");
        $ic76$ = makeSymbol("S#39133", "CYC");
        $ic77$ = makeKeyword("STORE");
        $ic78$ = makeString("Invalid slot ~S for construction function");
        $ic79$ = makeKeyword("BEGIN");
        $ic80$ = makeSymbol("S#39134", "CYC");
        $ic81$ = makeKeyword("SLOT");
        $ic82$ = makeKeyword("END");
        $ic83$ = makeSymbol("S#39136", "CYC");
        $ic84$ = makeString("<PPH-PSP ~S>");
        $ic85$ = makeSymbol("S#39138", "CYC");
        $ic86$ = makeKeyword("FREE");
        $ic87$ = makeString("~&Initial PPH problem store: ~S~%");
        $ic88$ = makeUninternedSymbol("US#3117245");
        $ic89$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39229", "CYC"), (SubLObject)NIL));
        $ic90$ = makeSymbol("S#39230", "CYC");
        $ic91$ = ConsesLow.list((SubLObject)makeSymbol("S#39144", "CYC"));
        $ic92$ = makeSymbol("CUNWIND-PROTECT");
        $ic93$ = makeSymbol("PUNLESS");
        $ic94$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39138", "CYC"), (SubLObject)makeSymbol("S#39230", "CYC")));
        $ic95$ = makeSymbol("S#39144", "CYC");
        $ic96$ = makeString("Destroying PPH problem store: ~S~%");
        $ic97$ = makeString("(PPH error level ");
        $ic98$ = makeString(") ");
        $ic99$ = makeString("New PPH problem store is not ok: ~S");
        $ic100$ = makeInteger(100000);
        $ic101$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39231", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3952", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39234", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39233", "CYC"), (SubLObject)T));
        $ic102$ = makeKeyword("NOTED");
        $ic103$ = makeSymbol("S#39150", "CYC");
        $ic104$ = makeSymbol("DESTROYING-NEW-PPH-PHRASES-WHEN-DONE");
        $ic105$ = makeString("Destroyed ~S PPH phrases.~% New object count: ~S size: ~S");
        $ic106$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39231", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3952", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39234", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39151", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39232", "CYC"), (SubLObject)T));
        $ic107$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39150", "CYC")));
        $ic108$ = makeSymbol("S#39151", "CYC");
        $ic109$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39253", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic110$ = makeUninternedSymbol("US#779232F");
        $ic111$ = makeUninternedSymbol("US#533E956");
        $ic112$ = ConsesLow.list((SubLObject)makeSymbol("S#39231", "CYC"));
        $ic113$ = ConsesLow.list((SubLObject)makeSymbol("S#39234", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39151", "CYC")));
        $ic114$ = ConsesLow.list((SubLObject)makeSymbol("S#39231", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3952", "CYC")));
        $ic115$ = ConsesLow.list((SubLObject)NIL);
        $ic116$ = makeSymbol("PIF");
        $ic117$ = ConsesLow.list((SubLObject)makeSymbol("S#39150", "CYC"));
        $ic118$ = makeSymbol("S#5452", "CYC");
        $ic119$ = makeSymbol("S#3953", "CYC");
        $ic120$ = ConsesLow.list((SubLObject)makeSymbol("S#39157", "CYC"));
        $ic121$ = ConsesLow.list((SubLObject)makeSymbol("S#39254", "CYC"));
        $ic122$ = makeSymbol("S#39154", "CYC");
        $ic123$ = makeSymbol("S#39153", "CYC");
        $ic124$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39023", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39255", "CYC"))));
        $ic125$ = ConsesLow.list((SubLObject)makeSymbol("S#39155", "CYC"));
        $ic126$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39156", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39158", "CYC")));
        $ic127$ = makeSymbol("S#39155", "CYC");
        $ic128$ = makeString("~&Entering WITHIN-NEW-PPH-DISCOURSE-CONTEXT, *pph-discourse-context* is~% ~S~%");
        $ic129$ = makeSymbol("S#39156", "CYC");
        $ic130$ = makeString("~&Leaving WITHIN-NEW-PPH-DISCOURSE-CONTEXT, *pph-discourse-context* is~% ~S~%");
        $ic131$ = makeSymbol("S#39157", "CYC");
        $ic132$ = makeSymbol("S#39158", "CYC");
        $ic133$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39256", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic134$ = makeKeyword("CYC-LEXICON");
        $ic135$ = makeUninternedSymbol("US#B1027E");
        $ic136$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39069", "CYC")));
        $ic137$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39023", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39257", "CYC"))));
        $ic138$ = ConsesLow.list((SubLObject)makeSymbol("S#38908", "CYC"), (SubLObject)ONE_INTEGER, (SubLObject)makeString("~&Shadowing discourse context...~%"));
        $ic139$ = makeSymbol("CSETQ");
        $ic140$ = makeSymbol("S#39160", "CYC");
        $ic141$ = makeSymbol("S#39023", "CYC");
        $ic142$ = makeSymbol("S#39159", "CYC");
        $ic143$ = makeString("~&Leaving ~S");
        $ic144$ = makeString("New RMS: ~S");
        $ic145$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39258", "CYC"), (SubLObject)makeSymbol("S#39259", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic146$ = makeSymbol("*PPH-SPEAKER*");
        $ic147$ = makeSymbol("*PPH-ADDRESSEE*");
        $ic148$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeSymbol("STRING"), makeSymbol("S#39260", "CYC"), makeSymbol("&KEY"), ConsesLow.list((SubLObject)makeSymbol("S#39261", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#39261", "CYC"))), ConsesLow.list((SubLObject)makeSymbol("S#39262", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#39262", "CYC"))), ConsesLow.list((SubLObject)makeSymbol("S#33826", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#33826", "CYC"))), ConsesLow.list((SubLObject)makeSymbol("S#39263", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#39263", "CYC"))), ConsesLow.list((SubLObject)makeSymbol("S#39264", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#39264", "CYC"))), ConsesLow.list((SubLObject)makeSymbol("S#39265", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#39265", "CYC"))), ConsesLow.list((SubLObject)makeSymbol("S#39266", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#39266", "CYC"))) }), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic149$ = ConsesLow.list((SubLObject)makeKeyword("PARANOID-ARG"), (SubLObject)makeKeyword("OUTPUT-ITEM"), (SubLObject)makeKeyword("ARG-POSITION"), (SubLObject)makeKeyword("HTML-OPEN-TAG"), (SubLObject)makeKeyword("HTML-CLOSE-TAG"), (SubLObject)makeKeyword("START-CHAR-INDEX"), (SubLObject)makeKeyword("WHOLE-STRING"));
        $ic150$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic151$ = makeKeyword("PARANOID-ARG");
        $ic152$ = makeSymbol("S#39261", "CYC");
        $ic153$ = makeKeyword("OUTPUT-ITEM");
        $ic154$ = makeSymbol("S#39262", "CYC");
        $ic155$ = makeKeyword("ARG-POSITION");
        $ic156$ = makeSymbol("S#33826", "CYC");
        $ic157$ = makeKeyword("HTML-OPEN-TAG");
        $ic158$ = makeSymbol("S#39263", "CYC");
        $ic159$ = makeKeyword("HTML-CLOSE-TAG");
        $ic160$ = makeSymbol("S#39264", "CYC");
        $ic161$ = makeKeyword("START-CHAR-INDEX");
        $ic162$ = makeSymbol("S#39265", "CYC");
        $ic163$ = makeKeyword("WHOLE-STRING");
        $ic164$ = makeSymbol("S#39266", "CYC");
        $ic165$ = makeUninternedSymbol("US#35248DF");
        $ic166$ = makeUninternedSymbol("US#1D3DCF8");
        $ic167$ = makeUninternedSymbol("US#5953B69");
        $ic168$ = makeUninternedSymbol("US#2A76813");
        $ic169$ = ConsesLow.list((SubLObject)makeSymbol("S#39267", "CYC"));
        $ic170$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic171$ = makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING");
        $ic172$ = ConsesLow.list((SubLObject)T);
        $ic173$ = makeSymbol("S#39071", "CYC");
        $ic174$ = makeSymbol("S#39268", "CYC");
        $ic175$ = makeSymbol("UNTIL");
        $ic176$ = makeSymbol("S#39269", "CYC");
        $ic177$ = makeSymbol("S#39270", "CYC");
        $ic178$ = makeSymbol("S#39163", "CYC");
        $ic179$ = makeSymbol("S#39162", "CYC");
        $ic180$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeSymbol("S#143", "CYC"), makeSymbol("STRING"), makeSymbol("S#33826", "CYC"), makeSymbol("S#39263", "CYC"), makeSymbol("S#39264", "CYC"), makeSymbol("S#39261", "CYC"), makeSymbol("S#39262", "CYC"), makeSymbol("S#39266", "CYC"), makeSymbol("S#39265", "CYC"), makeSymbol("S#39271", "CYC") }), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic181$ = makeSymbol("S#39164", "CYC");
        $ic182$ = makeSymbol("S#39167", "CYC");
        $ic183$ = makeUninternedSymbol("US#5120BFC");
        $ic184$ = makeSymbol("S#39272", "CYC");
        $ic185$ = makeSymbol("S#39168", "CYC");
        $ic186$ = makeSymbol(">");
        $ic187$ = makeSymbol("S#39166", "CYC");
        $ic188$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39273", "CYC")));
        $ic189$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39274", "CYC")));
        $ic190$ = makeSymbol("S#39275", "CYC");
        $ic191$ = makeSymbol("IGNORE");
        $ic192$ = makeSymbol("S#39165", "CYC");
        $ic193$ = makeString("Adding space string of length ~S");
        $ic194$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#143", "CYC"), (SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("S#33826", "CYC"), (SubLObject)makeSymbol("S#39263", "CYC"), (SubLObject)makeSymbol("S#39264", "CYC"), (SubLObject)makeSymbol("S#39261", "CYC"), (SubLObject)makeSymbol("S#39262", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic195$ = makeSymbol("S#39276", "CYC");
        $ic196$ = makeSymbol("S#39277", "CYC");
        $ic197$ = makeSymbol("S#39278", "CYC");
        $ic198$ = makeSymbol("S#39279", "CYC");
        $ic199$ = makeSymbol("S#39070", "CYC");
        $ic200$ = makeSymbol("S#39280", "CYC");
        $ic201$ = makeString("Couldn't find ~S in ~S.~%");
        $ic202$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#143", "CYC"), (SubLObject)makeSymbol("S#39281", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic203$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic204$ = makeKeyword("DONE");
        $ic205$ = makeSymbol("CSOME");
        $ic206$ = makeSymbol("S#39282", "CYC");
        $ic207$ = makeKeyword("PAIRS");
        $ic208$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39283", "CYC"), (SubLObject)makeSymbol("S#759", "CYC"), (SubLObject)makeSymbol("S#39284", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39285", "CYC"), (SubLObject)makeKeyword("JAVALISTS"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic209$ = ConsesLow.list((SubLObject)makeKeyword("RETURN-STYLE"));
        $ic210$ = makeKeyword("RETURN-STYLE");
        $ic211$ = makeKeyword("JAVALISTS");
        $ic212$ = ConsesLow.list((SubLObject)makeSymbol("S#652", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#39171", "CYC")));
        $ic213$ = ConsesLow.list((SubLObject)makeSymbol("S#653", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#39172", "CYC")));
        $ic214$ = ConsesLow.list((SubLObject)makeSymbol("S#654", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#39174", "CYC")));
        $ic215$ = makeSymbol("S#655", "CYC");
        $ic216$ = ConsesLow.list((SubLObject)makeSymbol("S#656", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#39175", "CYC")));
        $ic217$ = makeSymbol("S#39236", "CYC");
        $ic218$ = makeSymbol("S#586", "CYC");
        $ic219$ = makeSymbol("S#39076", "CYC");
        $ic220$ = makeString("Don't know how to accumulate ~S answers.");
        $ic221$ = makeSymbol("<");
        $ic222$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39286", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic223$ = makeUninternedSymbol("US#57040A7");
        $ic224$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQL)));
        $ic225$ = ConsesLow.list((SubLObject)makeSymbol("S#39039", "CYC"));
        $ic226$ = ConsesLow.list((SubLObject)makeSymbol("S#39038", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38955", "CYC")), (SubLObject)makeSymbol("S#39038", "CYC"), (SubLObject)makeKeyword("QUIET")));
        $ic227$ = makeSymbol("S#39039", "CYC");
        $ic228$ = makeSymbol("S#6424", "CYC");
        $ic229$ = makeSymbol("S#39287", "CYC");
        $ic230$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#772", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39288", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39181", "CYC")))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic231$ = ConsesLow.list((SubLObject)makeSymbol("S#39239", "CYC"), (SubLObject)ZERO_INTEGER);
        $ic232$ = makeSymbol("S#39237", "CYC");
        $ic233$ = makeSymbol("S#39180", "CYC");
        $ic234$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39238", "CYC"), (SubLObject)makeSymbol("S#39238", "CYC")));
        $ic235$ = ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#39238", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39178", "CYC")));
        $ic236$ = makeSymbol("S#39238", "CYC");
        $ic237$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39178", "CYC")));
        $ic238$ = makeString("PPH timeout reached.");
        $ic239$ = makeSymbol("S#39177", "CYC");
        $ic240$ = makeSymbol("S#39181", "CYC");
        $ic241$ = ConsesLow.list((SubLObject)makeSymbol("S#39289", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic242$ = makeSymbol("*PPH-LANGUAGE-MT*");
        $ic243$ = makeSymbol("S#39290", "CYC");
        $ic244$ = ConsesLow.list((SubLObject)makeSymbol("*PPH-LANGUAGE-MT*"));
        $ic245$ = ConsesLow.list((SubLObject)makeSymbol("S#15402", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic246$ = makeSymbol("*PPH-DOMAIN-MT*");
        $ic247$ = ConsesLow.list((SubLObject)makeSymbol("*PPH-DOMAIN-MT*"));
        $ic248$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39289", "CYC"), (SubLObject)makeSymbol("S#15402", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic249$ = makeSymbol("S#39183", "CYC");
        $ic250$ = makeSymbol("S#39184", "CYC");
        $ic251$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39291", "CYC"), (SubLObject)NIL)), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic252$ = makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
        $ic253$ = makeUninternedSymbol("US#154EE65");
        $ic254$ = makeSymbol("S#39186", "CYC");
        $ic255$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39292", "CYC")));
        $ic256$ = makeSymbol("S#12762", "CYC");
        $ic257$ = ConsesLow.list((SubLObject)makeSymbol("S#38915", "CYC"), (SubLObject)ONE_INTEGER, (SubLObject)makeString("Broadening *PPH-LANGUAGE-MT* to ~S"), (SubLObject)makeSymbol("*PPH-LANGUAGE-MT*"));
        $ic258$ = ConsesLow.list((SubLObject)makeSymbol("S#39293", "CYC"));
        $ic259$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11675", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic260$ = makeSymbol("DO-DICTIONARY");
        $ic261$ = ConsesLow.list((SubLObject)makeSymbol("S#39020", "CYC"));
        $ic262$ = makeSymbol("COR");
        $ic263$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#39294", "CYC")));
        $ic264$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39295", "CYC"), (SubLObject)makeSymbol("OBJECT", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic265$ = makeUninternedSymbol("US#7C53A59");
        $ic266$ = makeSymbol("*PPH-USE-BULLETED-LISTS?*");
        $ic267$ = makeSymbol("S#38908", "CYC");
        $ic268$ = makeString("~&Suspending bullet use for~% ~S~%");
        $ic269$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38908", "CYC"), (SubLObject)ONE_INTEGER, (SubLObject)makeString("~&Turning bullet use back on.~%")));
        $ic270$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10875", "CYC"), (SubLObject)makeSymbol("S#9979", "CYC"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic271$ = makeSymbol("S#38916", "CYC");
        $ic272$ = ConsesLow.list((SubLObject)makeSymbol("S#39191", "CYC"));
        $ic273$ = makeSymbol("S#9978", "CYC");
        $ic274$ = makeSymbol("S#39192", "CYC");
        $ic275$ = makeSymbol("S#39190", "CYC");
        $ic276$ = makeSymbol("INTEGERP");
        $ic277$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39052", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39296", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39053", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39297", "CYC"))));
        $ic278$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#28211", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic279$ = makeSymbol("S#39000", "CYC");
        $ic280$ = makeSymbol("S#38987", "CYC");
        $ic281$ = makeSymbol("S#28402", "CYC");
        $ic282$ = makeSymbol("S#28654", "CYC");
        $ic283$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38985", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*PPH-USE-BULLETED-LISTS?*"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39051", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39052", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39296", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39053", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39297", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39056", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39054", "CYC"), (SubLObject)NIL));
        $ic284$ = makeSymbol("S#39195", "CYC");
        $ic285$ = makeUninternedSymbol("US#4B44B");
        $ic286$ = makeUninternedSymbol("US#3CE5037");
        $ic287$ = ConsesLow.list((SubLObject)makeSymbol("S#39197", "CYC"));
        $ic288$ = makeSymbol("S#39123", "CYC");
        $ic289$ = makeSymbol("S#39197", "CYC");
        $ic290$ = makeSymbol("S#39194", "CYC");
        $ic291$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39298", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic292$ = makeUninternedSymbol("US#2CF1D0E");
        $ic293$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3041", "CYC"), (SubLObject)makeSymbol("S#39025", "CYC")));
        $ic294$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39026", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6424", "CYC"), (SubLObject)makeSymbol("S#39026", "CYC")), (SubLObject)makeSymbol("S#39026", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQL), (SubLObject)SIXTEEN_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39241", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("1+"), (SubLObject)makeSymbol("S#39241", "CYC"))));
        $ic295$ = ConsesLow.list((SubLObject)makeSymbol("S#38908", "CYC"), (SubLObject)ONE_INTEGER, (SubLObject)makeString("~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%"), (SubLObject)makeSymbol("S#39241", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("DICTIONARY-VALUES"), (SubLObject)makeSymbol("S#39025", "CYC")));
        $ic296$ = makeSymbol("S#39025", "CYC");
        $ic297$ = ConsesLow.list((SubLObject)makeSymbol("S#38908", "CYC"), (SubLObject)ONE_INTEGER, (SubLObject)makeString("~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). "), (SubLObject)makeSymbol("S#39241", "CYC"));
        $ic298$ = makeSymbol("S#39091", "CYC");
        $ic299$ = ConsesLow.list((SubLObject)makeSymbol("S#38908", "CYC"), (SubLObject)ONE_INTEGER, (SubLObject)makeString("~& Output list: ~S~%"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39096", "CYC"), (SubLObject)makeSymbol("S#39298", "CYC")));
        $ic300$ = makeString("~& Setting ~S to~% ~S");
        $ic301$ = makeSymbol("DICTIONARY-VALUES");
        $ic302$ = makeSymbol("S#39199", "CYC");
        $ic303$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38908", "CYC"), (SubLObject)ONE_INTEGER, (SubLObject)makeString("~% Leaving *PPH-VAR-TYPES* ~S"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("DICTIONARY-VALUES"), (SubLObject)makeSymbol("S#39025", "CYC"))));
        $ic304$ = makeSymbol("S#39198", "CYC");
        $ic305$ = makeUninternedSymbol("US#3835629");
        $ic306$ = ConsesLow.list((SubLObject)makeSymbol("S#39025", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6424", "CYC"), (SubLObject)makeSymbol("S#39025", "CYC")), (SubLObject)makeSymbol("S#39025", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NEW-DICTIONARY"))));
        $ic307$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39299", "CYC")));
        $ic308$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39300", "CYC"), (SubLObject)makeSymbol("S#39300", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39026", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6424", "CYC"), (SubLObject)makeSymbol("S#39026", "CYC")), (SubLObject)makeSymbol("S#39026", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQL), (SubLObject)SIXTEEN_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39027", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("1+"), (SubLObject)makeSymbol("S#39027", "CYC"))));
        $ic309$ = ConsesLow.list((SubLObject)makeSymbol("S#38908", "CYC"), (SubLObject)TWO_INTEGER, (SubLObject)makeString("~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%"), (SubLObject)makeSymbol("S#39027", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("DICTIONARY-VALUES"), (SubLObject)makeSymbol("S#39025", "CYC")));
        $ic310$ = makeSymbol("S#39301", "CYC");
        $ic311$ = makeSymbol("SET-DIFFERENCE");
        $ic312$ = ConsesLow.list((SubLObject)makeSymbol("S#39299", "CYC"));
        $ic313$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38908", "CYC"), (SubLObject)TWO_INTEGER, (SubLObject)makeString("~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s "), (SubLObject)makeSymbol("S#39027", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39299", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39201", "CYC"), (SubLObject)makeSymbol("S#39301", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38908", "CYC"), (SubLObject)TWO_INTEGER, (SubLObject)makeString("~&... and *pph-var-types* are now ~S~%"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39299", "CYC"))));
        $ic314$ = makeSymbol("S#39201", "CYC");
        $ic315$ = makeSymbol("S#39200", "CYC");
        $ic316$ = makeString("~&Deregistering ~S~%");
        $ic317$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39302", "CYC"), (SubLObject)makeSymbol("NUMBER"), (SubLObject)makeSymbol("S#39303", "CYC")), (SubLObject)makeSymbol("S#39304", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic318$ = makeSymbol("CDESTRUCTURING-BIND");
        $ic319$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39305", "CYC"), (SubLObject)makeSymbol("S#39298", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic320$ = makeSymbol("S#39306", "CYC");
        $ic321$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeSymbol("S#33867", "CYC"), makeSymbol("S#6061", "CYC"), makeSymbol("&KEY"), makeSymbol("S#12457", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#39307", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39083", "CYC"))), ConsesLow.list((SubLObject)makeSymbol("S#24001", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#1599", "CYC"))), ConsesLow.list((SubLObject)makeSymbol("S#39308", "CYC"), (SubLObject)makeKeyword("ANY")), makeSymbol("S#39309", "CYC"), makeSymbol("S#127", "CYC") }), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic322$ = ConsesLow.list((SubLObject)makeKeyword("RELN"), (SubLObject)makeKeyword("ARG-POSITION-MAP"), (SubLObject)makeKeyword("INVERSE?"), (SubLObject)makeKeyword("NL-PREDS"), (SubLObject)makeKeyword("FOCUS-ARGNUM"), (SubLObject)makeKeyword("DONE"));
        $ic323$ = makeKeyword("RELN");
        $ic324$ = makeKeyword("ARG-POSITION-MAP");
        $ic325$ = makeKeyword("INVERSE?");
        $ic326$ = makeSymbol("S#1599", "CYC");
        $ic327$ = makeKeyword("NL-PREDS");
        $ic328$ = makeKeyword("ANY");
        $ic329$ = makeKeyword("FOCUS-ARGNUM");
        $ic330$ = makeUninternedSymbol("US#786530B");
        $ic331$ = makeSymbol("S#39310", "CYC");
        $ic332$ = makeSymbol("S#39311", "CYC");
        $ic333$ = makeSymbol("S#39312", "CYC");
        $ic334$ = makeSymbol("S#39064", "CYC");
        $ic335$ = makeSymbol("S#39313", "CYC");
        $ic336$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39314", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#39315", "CYC"), (SubLObject)makeSymbol("S#39307", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39308", "CYC"), (SubLObject)makeKeyword("ANY")), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic337$ = ConsesLow.list((SubLObject)makeKeyword("FOCUS-ARG"), (SubLObject)makeKeyword("ARG-POSITION-MAP"), (SubLObject)makeKeyword("NL-PREDS"), (SubLObject)makeKeyword("DONE"));
        $ic338$ = makeKeyword("FOCUS-ARG");
        $ic339$ = makeUninternedSymbol("US#3A6A62");
        $ic340$ = makeSymbol("S#39204", "CYC");
        $ic341$ = makeSymbol("S#39316", "CYC");
        $ic342$ = makeInteger(300);
        $ic343$ = makeSymbol("S#39206", "CYC");
        $ic344$ = makeSymbol("S#39208", "CYC");
        $ic345$ = makeUninternedSymbol("US#5264075");
        $ic346$ = makeUninternedSymbol("US#2A9BCB3");
        $ic347$ = makeUninternedSymbol("US#3EFB8BE");
        $ic348$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39209", "CYC")));
        $ic349$ = makeSymbol("S#39243", "CYC");
        $ic350$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("NEW-SET"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQUAL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39206", "CYC"))), (SubLObject)makeSymbol("S#39243", "CYC"));
        $ic351$ = ConsesLow.list((SubLObject)makeSymbol("S#39245", "CYC"), (SubLObject)T);
        $ic352$ = makeSymbol("WHILE");
        $ic353$ = makeSymbol("S#39211", "CYC");
        $ic354$ = makeSymbol("CCATCH");
        $ic355$ = makeKeyword("PPH-METHOD-FAILURE");
        $ic356$ = makeSymbol("S#39209", "CYC");
        $ic357$ = makeString("Can't note PPH method failure; not in failure handling mode.");
        $ic358$ = makeString("~S~% is already suspended.");
        $ic359$ = makeString("Over ~S suspended methods.~% Current plist:~% ~S");
        $ic360$ = makeKeyword("CYCL");
        $ic361$ = makeString("Cleared ~S suspended methods for ~S");
        $ic362$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39317", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#39318", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic363$ = makeUninternedSymbol("US#53A48DD");
        $ic364$ = makeSymbol("S#39319", "CYC");
        $ic365$ = makeSymbol("S#39320", "CYC");
        $ic366$ = makeSymbol("S#39321", "CYC");
        $ic367$ = ConsesLow.list((SubLObject)makeSymbol("S#13101", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic368$ = makeSymbol("S#38966", "CYC");
        $ic369$ = makeUninternedSymbol("US#6365C71");
        $ic370$ = makeSymbol("S#39216", "CYC");
        $ic371$ = makeSymbol("S#39217", "CYC");
        $ic372$ = makeSymbol("S#39215", "CYC");
        $ic373$ = makeString("Removing MT scope from ~S");
        $ic374$ = ConsesLow.list((SubLObject)TWO_INTEGER);
        $ic375$ = makeString("Updating agr-preds to ~S based on mt scope.");
        $ic376$ = makeString("New agr preds: ~S");
        $ic377$ = makeString("Adding Mt scope paraphrases to~% ~S");
        $ic378$ = makeString("Couldn't finish temporal phrase:~% ~S~%");
        $ic379$ = ConsesLow.list((SubLObject)makeSymbol("S#39322", "CYC"), (SubLObject)makeSymbol("S#39323", "CYC"));
        $ic380$ = makeString(",");
        $ic381$ = makeSymbol("S#38", "CYC");
        $ic382$ = makeString("~% Top-level CycL: ~S");
        $ic383$ = makeKeyword("FAILED");
        $ic384$ = makeString("Result of adding Mt scope paraphrases:~% ~S");
        $ic385$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MtTimeDimFn")), constant_handles_oc.f8479((SubLObject)makeString("Now")));
        $ic386$ = constant_handles_oc.f8479((SubLObject)makeString("TemporalMicrotheory"));
        $ic387$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), constant_handles_oc.f8479((SubLObject)makeString("nameString")));
        $ic388$ = makeString("according to");
        $ic389$ = makeKeyword("PHRASE-CYCL");
        $ic390$ = constant_handles_oc.f8479((SubLObject)makeString("Now"));
        $ic391$ = makeString("Ignoring ~S~% because it subsumes #$Now.");
        $ic392$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("prepositionStrings")), constant_handles_oc.f8479((SubLObject)makeString("adverbStrings")));
        $ic393$ = makeUninternedSymbol("US#70C2928");
        $ic394$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39324", "CYC")));
        $ic395$ = ConsesLow.list((SubLObject)makeSymbol("S#39325", "CYC"));
        $ic396$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39326", "CYC")));
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
            structDecl = Structures.makeStructDeclNative((Class)$sX39062_native.class, $ic66$, $ic67$, $ic68$, $ic69$, new String[] { "$store" }, $ic70$, $ic71$, $ic72$);
        }
    }
    
    public static final class $f35548$UnaryFunction extends UnaryFunction
    {
        public $f35548$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39063"));
        }
        
        public SubLObject processItem(final SubLObject var73) {
            return f35548(var73);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1192 ms
	
	Decompiled with Procyon 0.5.32.
*/