package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0686 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0686";
    public static final String myFingerPrint = "4fdf589ddb905c3a61f276eff64d433c60b8877d065c719246b2398031dfafeb";
    public static SubLSymbol $g5388$;
    private static SubLSymbol $g5389$;
    public static SubLSymbol $g5390$;
    public static SubLSymbol $g5391$;
    public static SubLSymbol $g5392$;
    public static SubLSymbol $g5393$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLString $ic46$;
    private static final SubLInteger $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLString $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLInteger $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    private static final SubLList $ic147$;
    private static final SubLList $ic148$;
    private static final SubLList $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLList $ic152$;
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
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLString $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLList $ic200$;
    private static final SubLString $ic201$;
    private static final SubLList $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLString $ic210$;
    private static final SubLString $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLString $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLList $ic219$;
    private static final SubLList $ic220$;
    private static final SubLList $ic221$;
    private static final SubLList $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLList $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLSymbol $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLString $ic238$;
    private static final SubLString $ic239$;
    private static final SubLString $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLString $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLString $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLString $ic246$;
    private static final SubLString $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLList $ic250$;
    private static final SubLString $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLString $ic253$;
    private static final SubLString $ic254$;
    private static final SubLString $ic255$;
    private static final SubLString $ic256$;
    private static final SubLString $ic257$;
    private static final SubLString $ic258$;
    private static final SubLString $ic259$;
    private static final SubLString $ic260$;
    private static final SubLString $ic261$;
    private static final SubLString $ic262$;
    private static final SubLString $ic263$;
    private static final SubLString $ic264$;
    private static final SubLString $ic265$;
    private static final SubLString $ic266$;
    private static final SubLString $ic267$;
    private static final SubLString $ic268$;
    private static final SubLString $ic269$;
    private static final SubLString $ic270$;
    private static final SubLString $ic271$;
    private static final SubLString $ic272$;
    private static final SubLString $ic273$;
    private static final SubLString $ic274$;
    private static final SubLString $ic275$;
    private static final SubLString $ic276$;
    private static final SubLString $ic277$;
    private static final SubLString $ic278$;
    private static final SubLString $ic279$;
    private static final SubLString $ic280$;
    private static final SubLString $ic281$;
    private static final SubLString $ic282$;
    private static final SubLString $ic283$;
    private static final SubLString $ic284$;
    private static final SubLString $ic285$;
    private static final SubLString $ic286$;
    private static final SubLString $ic287$;
    private static final SubLString $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLString $ic290$;
    private static final SubLString $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLList $ic293$;
    private static final SubLString $ic294$;
    private static final SubLString $ic295$;
    private static final SubLString $ic296$;
    private static final SubLSymbol $ic297$;
    private static final SubLObject $ic298$;
    private static final SubLString $ic299$;
    private static final SubLInteger $ic300$;
    private static final SubLString $ic301$;
    private static final SubLString $ic302$;
    private static final SubLString $ic303$;
    private static final SubLSymbol $ic304$;
    private static final SubLSymbol $ic305$;
    private static final SubLString $ic306$;
    private static final SubLString $ic307$;
    private static final SubLString $ic308$;
    private static final SubLString $ic309$;
    private static final SubLString $ic310$;
    private static final SubLString $ic311$;
    private static final SubLString $ic312$;
    private static final SubLString $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLString $ic315$;
    private static final SubLString $ic316$;
    private static final SubLString $ic317$;
    private static final SubLString $ic318$;
    private static final SubLObject $ic319$;
    private static final SubLString $ic320$;
    private static final SubLString $ic321$;
    private static final SubLList $ic322$;
    private static final SubLList $ic323$;
    private static final SubLList $ic324$;
    private static final SubLSymbol $ic325$;
    private static final SubLString $ic326$;
    private static final SubLString $ic327$;
    private static final SubLString $ic328$;
    private static final SubLString $ic329$;
    private static final SubLString $ic330$;
    private static final SubLString $ic331$;
    private static final SubLSymbol $ic332$;
    private static final SubLString $ic333$;
    private static final SubLString $ic334$;
    private static final SubLString $ic335$;
    private static final SubLString $ic336$;
    private static final SubLString $ic337$;
    private static final SubLSymbol $ic338$;
    private static final SubLString $ic339$;
    private static final SubLString $ic340$;
    private static final SubLString $ic341$;
    private static final SubLString $ic342$;
    private static final SubLString $ic343$;
    private static final SubLString $ic344$;
    private static final SubLString $ic345$;
    private static final SubLString $ic346$;
    private static final SubLString $ic347$;
    private static final SubLString $ic348$;
    private static final SubLString $ic349$;
    private static final SubLString $ic350$;
    private static final SubLString $ic351$;
    private static final SubLString $ic352$;
    private static final SubLString $ic353$;
    private static final SubLString $ic354$;
    private static final SubLString $ic355$;
    private static final SubLString $ic356$;
    private static final SubLString $ic357$;
    private static final SubLString $ic358$;
    private static final SubLSymbol $ic359$;
    private static final SubLString $ic360$;
    private static final SubLString $ic361$;
    private static final SubLString $ic362$;
    private static final SubLString $ic363$;
    private static final SubLString $ic364$;
    private static final SubLString $ic365$;
    private static final SubLString $ic366$;
    private static final SubLString $ic367$;
    private static final SubLString $ic368$;
    private static final SubLString $ic369$;
    private static final SubLString $ic370$;
    private static final SubLString $ic371$;
    private static final SubLString $ic372$;
    private static final SubLString $ic373$;
    private static final SubLString $ic374$;
    private static final SubLString $ic375$;
    private static final SubLString $ic376$;
    private static final SubLString $ic377$;
    private static final SubLString $ic378$;
    private static final SubLString $ic379$;
    private static final SubLString $ic380$;
    private static final SubLString $ic381$;
    private static final SubLSymbol $ic382$;
    private static final SubLSymbol $ic383$;
    private static final SubLString $ic384$;
    private static final SubLString $ic385$;
    private static final SubLString $ic386$;
    private static final SubLString $ic387$;
    private static final SubLSymbol $ic388$;
    private static final SubLSymbol $ic389$;
    private static final SubLSymbol $ic390$;
    private static final SubLString $ic391$;
    private static final SubLSymbol $ic392$;
    private static final SubLSymbol $ic393$;
    private static final SubLSymbol $ic394$;
    private static final SubLString $ic395$;
    private static final SubLSymbol $ic396$;
    private static final SubLList $ic397$;
    private static final SubLString $ic398$;
    private static final SubLString $ic399$;
    private static final SubLString $ic400$;
    private static final SubLString $ic401$;
    private static final SubLString $ic402$;
    private static final SubLString $ic403$;
    private static final SubLString $ic404$;
    private static final SubLString $ic405$;
    private static final SubLString $ic406$;
    private static final SubLString $ic407$;
    private static final SubLObject $ic408$;
    private static final SubLString $ic409$;
    private static final SubLString $ic410$;
    private static final SubLString $ic411$;
    private static final SubLString $ic412$;
    private static final SubLString $ic413$;
    private static final SubLString $ic414$;
    private static final SubLSymbol $ic415$;
    private static final SubLSymbol $ic416$;
    private static final SubLSymbol $ic417$;
    private static final SubLObject $ic418$;
    private static final SubLList $ic419$;
    private static final SubLList $ic420$;
    private static final SubLObject $ic421$;
    private static final SubLString $ic422$;
    private static final SubLList $ic423$;
    private static final SubLString $ic424$;
    private static final SubLObject $ic425$;
    private static final SubLObject $ic426$;
    private static final SubLObject $ic427$;
    private static final SubLObject $ic428$;
    private static final SubLObject $ic429$;
    private static final SubLObject $ic430$;
    private static final SubLObject $ic431$;
    private static final SubLSymbol $ic432$;
    private static final SubLObject $ic433$;
    private static final SubLObject $ic434$;
    private static final SubLObject $ic435$;
    private static final SubLObject $ic436$;
    private static final SubLSymbol $ic437$;
    private static final SubLObject $ic438$;
    private static final SubLSymbol $ic439$;
    private static final SubLSymbol $ic440$;
    private static final SubLObject $ic441$;
    private static final SubLObject $ic442$;
    private static final SubLList $ic443$;
    private static final SubLObject $ic444$;
    private static final SubLSymbol $ic445$;
    private static final SubLObject $ic446$;
    private static final SubLList $ic447$;
    private static final SubLObject $ic448$;
    private static final SubLObject $ic449$;
    private static final SubLList $ic450$;
    private static final SubLSymbol $ic451$;
    private static final SubLString $ic452$;
    private static final SubLString $ic453$;
    private static final SubLString $ic454$;
    private static final SubLString $ic455$;
    private static final SubLString $ic456$;
    private static final SubLSymbol $ic457$;
    private static final SubLString $ic458$;
    private static final SubLString $ic459$;
    private static final SubLString $ic460$;
    private static final SubLString $ic461$;
    private static final SubLSymbol $ic462$;
    private static final SubLString $ic463$;
    private static final SubLString $ic464$;
    private static final SubLString $ic465$;
    private static final SubLString $ic466$;
    private static final SubLString $ic467$;
    private static final SubLString $ic468$;
    private static final SubLString $ic469$;
    private static final SubLString $ic470$;
    private static final SubLString $ic471$;
    private static final SubLString $ic472$;
    private static final SubLString $ic473$;
    private static final SubLSymbol $ic474$;
    private static final SubLList $ic475$;
    
    
    public static SubLObject f42009(final SubLObject var1, SubLObject var2) {
        if (var2 == module0686.UNPROVIDED) {
            var2 = (SubLObject)module0686.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0686.NIL == var2) {
            var2 = (SubLObject)module0686.$ic0$;
        }
        final SubLObject var4 = module0656.f39832((SubLObject)module0686.$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)module0686.$ic2$, module0656.f39842(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL != var4) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var3);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f42010(final SubLObject var6) {
        final SubLObject var7 = module0656.f39943(var6, (SubLObject)module0686.UNPROVIDED);
        module0635.f38802(var7, (SubLObject)module0686.T);
        f42011((SubLObject)module0686.UNPROVIDED);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42012(final SubLObject var7, SubLObject var2) {
        if (var2 == module0686.UNPROVIDED) {
            var2 = (SubLObject)module0686.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0686.NIL == var2) {
            var2 = (SubLObject)module0686.$ic6$;
        }
        final SubLObject var9 = module0656.f39832((SubLObject)module0686.$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var8), (SubLObject)module0686.$ic7$, module0656.f39842(var7));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL != var9) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var8);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var10, var8);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var7;
    }
    
    public static SubLObject f42013(final SubLObject var6) {
        final SubLObject var7 = module0656.f39943(var6, (SubLObject)module0686.UNPROVIDED);
        module0635.f38803(var7, (SubLObject)module0686.T);
        f42011((SubLObject)module0686.UNPROVIDED);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42014(SubLObject var2) {
        if (var2 == module0686.UNPROVIDED) {
            var2 = (SubLObject)module0686.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0686.NIL == var2) {
            var2 = (SubLObject)module0686.$ic15$;
        }
        final SubLObject var4 = module0656.f39832((SubLObject)module0686.$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0686.$ic16$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL != var4) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var3);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42011(SubLObject var6) {
        if (var6 == module0686.UNPROVIDED) {
            var6 = (SubLObject)module0686.NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = (SubLObject)module0686.$ic12$;
        module0642.f39020((SubLObject)module0686.$ic19$);
        module0642.f39029((SubLObject)module0686.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
        final SubLObject var9 = module0014.f672((SubLObject)module0686.$ic20$);
        module0642.f39029((SubLObject)module0686.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.$ic21$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL != var9) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.$ic22$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        module0642.f39029((SubLObject)module0686.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var8);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0666.f40471();
        if (module0686.NIL != module0686.$g5388$.getDynamicValue(var7)) {
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g166$.getGlobalValue());
            module0642.f39020(module0015.$g167$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic23$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g168$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic24$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0686.UNPROVIDED);
        final SubLObject var10 = module0015.$g132$.getDynamicValue(var7);
        final SubLObject var11 = module0015.$g535$.currentBinding(var7);
        try {
            module0015.$g535$.bind((SubLObject)module0686.T, var7);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (module0686.NIL != var10) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(module0642.f39042(var10));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_11 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var7);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)module0686.ONE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                module0642.f39019(var8);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)module0686.ONE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                f42015((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                if (module0686.NIL != module0635.f38784()) {
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020((SubLObject)module0686.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0015.$g353$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020((SubLObject)module0686.THREE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0015.$g357$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020((SubLObject)module0686.$ic25$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_12 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var7);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g366$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020((SubLObject)module0686.$ic26$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                        final SubLObject var5_13 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)module0686.T, var7);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020((SubLObject)module0686.FOUR_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_14 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var7);
                                if (module0686.NIL != module0635.f38801()) {
                                    module0656.f39837((SubLObject)module0686.$ic28$, (SubLObject)module0686.$ic29$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                                }
                                else {
                                    module0642.f39021((SubLObject)module0686.$ic30$);
                                    module0686.$g5388$.setDynamicValue((SubLObject)module0686.NIL, var7);
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var5_14, var7);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_13, var7);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0686.UNPROVIDED);
                        var7.resetMultipleValues();
                        final SubLObject var12 = module0635.f38800(module0635.f38784());
                        final SubLObject var13 = var7.secondMultipleValue();
                        var7.resetMultipleValues();
                        if (module0686.NIL != var12) {
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g366$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020((SubLObject)module0686.$ic26$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_15 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var7);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020((SubLObject)module0686.FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_16 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var7);
                                    module0642.f39021((SubLObject)module0686.$ic31$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_16, var7);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var5_15, var7);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0686.UNPROVIDED);
                            f42016();
                            SubLObject var14 = var12;
                            SubLObject var15 = (SubLObject)module0686.NIL;
                            var15 = var14.first();
                            while (module0686.NIL != var14) {
                                f42017(var15);
                                var14 = var14.rest();
                                var15 = var14.first();
                            }
                        }
                        if (module0686.NIL != var13) {
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g366$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020((SubLObject)module0686.$ic26$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_17 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var7);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020((SubLObject)module0686.FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_18 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var7);
                                    module0642.f39021((SubLObject)module0686.$ic32$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_18, var7);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var5_17, var7);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0686.UNPROVIDED);
                            f42016();
                            SubLObject var14 = var13;
                            SubLObject var15 = (SubLObject)module0686.NIL;
                            var15 = var14.first();
                            while (module0686.NIL != var14) {
                                f42017(var15);
                                var14 = var14.rest();
                                var15 = var14.first();
                            }
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var5_12, var7);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
                else {
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)module0686.$ic33$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                module0642.f39029((SubLObject)module0686.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var5_11, var7);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var11, var7);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0686.UNPROVIDED);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42016() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39020(module0015.$g366$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.$ic35$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var3);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_23 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var3);
                module0642.f39021((SubLObject)module0686.$ic36$);
            }
            finally {
                module0015.$g533$.rebind(var5_23, var3);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_24 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var3);
                module0642.f39021((SubLObject)module0686.$ic37$);
            }
            finally {
                module0015.$g533$.rebind(var5_24, var3);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_25 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var3);
                module0642.f39021((SubLObject)module0686.$ic38$);
            }
            finally {
                module0015.$g533$.rebind(var5_25, var3);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_26 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var3);
                module0642.f39021((SubLObject)module0686.$ic39$);
            }
            finally {
                module0015.$g533$.rebind(var5_26, var3);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var4, var3);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)module0686.UNPROVIDED);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42015(SubLObject var27, SubLObject var28) {
        if (var27 == module0686.UNPROVIDED) {
            var27 = (SubLObject)module0686.NIL;
        }
        if (var28 == module0686.UNPROVIDED) {
            var28 = (SubLObject)module0686.NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = module0656.f39832((SubLObject)module0686.NIL);
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var29));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020(module0015.$g285$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.$ic40$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL != var30) {
            module0642.f39020(module0015.$g286$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        SubLObject var31 = module0015.$g533$.currentBinding(var29);
        SubLObject var32 = module0015.$g541$.currentBinding(var29);
        SubLObject var33 = module0015.$g539$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var29);
            module0015.$g541$.bind((SubLObject)module0686.T, var29);
            module0015.$g539$.bind(module0015.f797(), var29);
            module0642.f39069((SubLObject)module0686.$ic41$, (SubLObject)module0686.T, (SubLObject)module0686.UNPROVIDED);
            module0642.f39021((SubLObject)module0686.$ic42$);
            module0642.f39026((SubLObject)module0686.UNPROVIDED);
            module0666.f40467((SubLObject)module0686.$ic43$, (SubLObject)module0686.$ic44$, module0686.$ic45$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
            module0642.f39032((SubLObject)module0686.UNPROVIDED);
            module0644.f39184((SubLObject)module0686.$ic43$, (SubLObject)module0686.$ic46$);
            module0642.f39032((SubLObject)module0686.UNPROVIDED);
            module0642.f39075((SubLObject)module0686.$ic43$, (SubLObject)((module0686.NIL != var27) ? module0166.f10743(var27) : module0686.NIL), (SubLObject)module0686.$ic47$);
            module0642.f39074((SubLObject)module0686.$ic48$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
            module0015.f799(module0015.$g539$.getDynamicValue(var29));
        }
        finally {
            module0015.$g539$.rebind(var33, var29);
            module0015.$g541$.rebind(var32, var29);
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        var30 = module0656.f39832((SubLObject)module0686.NIL);
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var29));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020(module0015.$g285$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.$ic40$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL != var30) {
            module0642.f39020(module0015.$g286$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        var31 = module0015.$g533$.currentBinding(var29);
        var32 = module0015.$g541$.currentBinding(var29);
        var33 = module0015.$g539$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var29);
            module0015.$g541$.bind((SubLObject)module0686.T, var29);
            module0015.$g539$.bind(module0015.f797(), var29);
            module0642.f39069((SubLObject)module0686.$ic49$, (SubLObject)module0686.T, (SubLObject)module0686.UNPROVIDED);
            module0642.f39021((SubLObject)module0686.$ic50$);
            module0642.f39026((SubLObject)module0686.UNPROVIDED);
            module0666.f40467((SubLObject)module0686.$ic51$, (SubLObject)module0686.$ic44$, module0686.$ic52$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
            module0642.f39032((SubLObject)module0686.UNPROVIDED);
            module0644.f39184((SubLObject)module0686.$ic51$, (SubLObject)module0686.$ic46$);
            module0642.f39032((SubLObject)module0686.UNPROVIDED);
            module0642.f39075((SubLObject)module0686.$ic51$, (SubLObject)((module0686.NIL != var28) ? module0166.f10743(var28) : module0686.NIL), (SubLObject)module0686.$ic47$);
            module0642.f39074((SubLObject)module0686.$ic48$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
            module0015.f799(module0015.$g539$.getDynamicValue(var29));
        }
        finally {
            module0015.$g539$.rebind(var33, var29);
            module0015.$g541$.rebind(var32, var29);
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42018(final SubLObject var6) {
        final SubLObject var7 = module0642.f39104((SubLObject)module0686.$ic43$, var6);
        final SubLObject var8 = module0656.f39957(var7, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL == module0633.f38716(var8, (SubLObject)module0686.UNPROVIDED)) {
            return module0656.f39789((SubLObject)module0686.$ic53$, var7, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        module0635.f38802(var8, (SubLObject)module0686.T);
        return f42011((SubLObject)module0686.UNPROVIDED);
    }
    
    public static SubLObject f42019(final SubLObject var6) {
        final SubLObject var7 = module0642.f39104((SubLObject)module0686.$ic51$, var6);
        final SubLObject var8 = module0656.f39957(var7, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL == module0633.f38718(var8, (SubLObject)module0686.UNPROVIDED)) {
            return module0656.f39789((SubLObject)module0686.$ic55$, var7, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        module0635.f38803(var8, (SubLObject)module0686.T);
        return f42011((SubLObject)module0686.UNPROVIDED);
    }
    
    public static SubLObject f42020(final SubLObject var20) {
        final SubLObject var21 = module0635.f38788(var20);
        final SubLObject var22 = module0059.f4256(var20);
        final SubLObject var23 = (SubLObject)((module0686.NIL != var21) ? module0424.f29842(var21) : module0686.NIL);
        SubLObject var24 = (SubLObject)module0686.NIL;
        final SubLObject var25 = var22;
        if (var25.eql((SubLObject)module0686.$ic57$) || var25.eql((SubLObject)module0686.$ic58$)) {
            var24 = (SubLObject)module0686.$ic59$;
        }
        else if (var25.eql((SubLObject)module0686.$ic60$) || var25.eql((SubLObject)module0686.$ic61$)) {
            var24 = (SubLObject)module0686.$ic62$;
        }
        else if (var25.eql((SubLObject)module0686.$ic63$)) {
            var24 = (SubLObject)module0686.$ic64$;
        }
        else if (var25.eql((SubLObject)module0686.$ic65$)) {
            if (var23.equal((SubLObject)module0686.$ic66$)) {
                var24 = (SubLObject)module0686.$ic59$;
            }
            else if (var23.equal((SubLObject)module0686.$ic67$) || var23.equal((SubLObject)module0686.$ic63$) || var23.equal((SubLObject)module0686.$ic68$)) {
                var24 = (SubLObject)module0686.$ic64$;
            }
            else if (var23.equal((SubLObject)module0686.$ic69$)) {
                var24 = (SubLObject)module0686.$ic62$;
            }
        }
        return var24;
    }
    
    public static SubLObject f42017(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0635.f38787(var20);
        final SubLObject var23 = module0635.f38788(var20);
        final SubLObject var24 = module0635.f38786(var20);
        final SubLObject var25 = (SubLObject)((module0686.NIL != module0424.f29729(var23) && var24 == module0686.$ic70$) ? module0424.f29937(var23) : module0686.NIL);
        final SubLObject var26 = module0059.f4256(var20);
        final SubLObject var27 = f42020(var20);
        SubLObject var28 = (SubLObject)module0686.NIL;
        SubLObject var29 = (SubLObject)module0686.NIL;
        module0642.f39020(module0015.$g364$.getGlobalValue());
        if (module0686.NIL != var27) {
            module0642.f39020(module0015.$g366$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var30 = module0015.$g533$.currentBinding(var21);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var21);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_44 = module0015.$g533$.currentBinding(var21);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var21);
                module0656.f39804(var22, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                if (module0686.NIL != module0633.f38716(var22, (SubLObject)module0686.UNPROVIDED)) {
                    module0642.f39026((SubLObject)module0686.UNPROVIDED);
                    module0656.f39837((SubLObject)module0686.$ic71$, var22, (SubLObject)module0686.$ic72$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                }
            }
            finally {
                module0015.$g533$.rebind(var5_44, var21);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_45 = module0015.$g533$.currentBinding(var21);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var21);
                module0642.f39019(var26);
                if (var24 == module0686.$ic70$) {
                    module0642.f39067();
                    module0656.f39837((SubLObject)module0686.$ic73$, var20, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                }
                else {
                    final SubLObject var31 = (SubLObject)((module0686.NIL != module0424.f29714(var23)) ? module0424.f29851(var23) : module0686.NIL);
                    if (module0686.NIL != module0369.f25417(var31)) {}
                }
            }
            finally {
                module0015.$g533$.rebind(var5_45, var21);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_46 = module0015.$g533$.currentBinding(var21);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var21);
                if (var26 == module0686.$ic57$ || var26 == module0686.$ic58$) {
                    module0656.f39837((SubLObject)module0686.$ic74$, var20, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                }
                else {
                    module0656.f39837((SubLObject)module0686.$ic75$, var20, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                }
            }
            finally {
                module0015.$g533$.rebind(var5_46, var21);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_47 = module0015.$g533$.currentBinding(var21);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var21);
                final SubLObject var32 = var26;
                if (var32.eql((SubLObject)module0686.$ic57$)) {
                    module0642.f39019((SubLObject)module0686.$ic76$);
                }
                else if (var32.eql((SubLObject)module0686.$ic58$)) {
                    module0642.f39019((SubLObject)module0686.$ic77$);
                }
                else if (var32.eql((SubLObject)module0686.$ic63$)) {
                    final SubLObject var33 = module0059.f4263(var20);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var21), (SubLObject)module0686.$ic78$, var33);
                }
                else if (var32.eql((SubLObject)module0686.$ic60$)) {
                    module0642.f39019((SubLObject)module0686.$ic79$);
                }
                else if (var32.eql((SubLObject)module0686.$ic65$)) {
                    if (module0686.NIL != module0633.f38716(var22, (SubLObject)module0686.UNPROVIDED)) {
                        var21.resetMultipleValues();
                        final SubLObject var34 = module0633.f38736(var22);
                        final SubLObject var35 = var21.secondMultipleValue();
                        var21.resetMultipleValues();
                        var28 = var34;
                        var29 = var35;
                    }
                    else if (module0686.NIL != module0633.f38718(var22, (SubLObject)module0686.UNPROVIDED)) {
                        var21.resetMultipleValues();
                        final SubLObject var34 = module0633.f38738(var22);
                        final SubLObject var35 = var21.secondMultipleValue();
                        var21.resetMultipleValues();
                        var28 = var34;
                        var29 = var35;
                    }
                    if (var28 == module0686.$ic80$) {
                        module0642.f39019(PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic81$, var29));
                    }
                    else {
                        module0642.f39019(module0424.f29842(var23));
                        module0642.f39032((SubLObject)module0686.THREE_INTEGER);
                        module0656.f39837((SubLObject)module0686.$ic82$, var20, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    }
                }
                else if (var32.eql((SubLObject)module0686.$ic61$)) {
                    module0642.f39019((SubLObject)module0686.$ic83$);
                }
                else {
                    Errors.error((SubLObject)module0686.$ic84$, var26);
                }
            }
            finally {
                module0015.$g533$.rebind(var5_47, var21);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var30, var21);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)module0686.UNPROVIDED);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42021(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = (SubLObject)((module0686.NIL != module0686.$g5388$.getDynamicValue(var7)) ? module0686.$ic85$ : module0686.$ic86$);
        final SubLObject var9 = ConsesLow.nth((SubLObject)module0686.ZERO_INTEGER, var6);
        final SubLObject var10 = ConsesLow.nth((SubLObject)module0686.ONE_INTEGER, var6);
        final SubLObject var11 = ConsesLow.nth((SubLObject)module0686.TWO_INTEGER, var6);
        SubLObject var12 = (SubLObject)module0686.$ic87$;
        if (module0686.NIL != var9) {
            var12 = Sequences.cconcatenate(var12, new SubLObject[] { module0686.$ic88$, PrintLow.format((SubLObject)module0686.NIL, var9) });
            if (module0686.NIL != var10) {
                var12 = Sequences.cconcatenate(var12, new SubLObject[] { module0686.$ic88$, PrintLow.format((SubLObject)module0686.NIL, var10) });
                if (module0686.NIL != var11) {
                    var12 = Sequences.cconcatenate(var12, new SubLObject[] { module0686.$ic88$, PrintLow.format((SubLObject)module0686.NIL, var11) });
                }
            }
        }
        final SubLObject var13 = module0656.f39832((SubLObject)module0686.$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0655.f39768();
        module0642.f39019(var12);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL != var13) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var13);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var14 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var7);
            module0642.f39019(var8);
        }
        finally {
            module0015.$g533$.rebind(var14, var7);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42022(SubLObject var6) {
        if (var6 == module0686.UNPROVIDED) {
            var6 = (SubLObject)module0686.NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = var6.first();
        if (module0686.NIL != module0686.$g5388$.getDynamicValue(var7)) {
            module0686.$g5388$.setDynamicValue((SubLObject)module0686.NIL, var7);
        }
        else {
            module0686.$g5388$.setDynamicValue((SubLObject)module0686.T, var7);
        }
        if (var8.equal((SubLObject)module0686.$ic90$)) {
            return f42011((SubLObject)module0686.UNPROVIDED);
        }
        if (var8.equal((SubLObject)module0686.$ic91$)) {
            return f42023(var6.rest());
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42024(final SubLObject var20, SubLObject var2) {
        if (var2 == module0686.UNPROVIDED) {
            var2 = (SubLObject)module0686.NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0686.NIL == var2) {
            var2 = (SubLObject)module0686.$ic93$;
        }
        final SubLObject var22 = module0656.f39832((SubLObject)module0686.$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var21), (SubLObject)module0686.$ic94$, module0635.f38785(var20));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL != var22) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var22);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var23 = module0015.$g533$.currentBinding(var21);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var21);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var23, var21);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var20;
    }
    
    public static SubLObject f42025(SubLObject var6) {
        if (var6 == module0686.UNPROVIDED) {
            var6 = (SubLObject)module0686.NIL;
        }
        final SubLObject var7 = var6.first();
        final SubLObject var8 = (SubLObject)(Sequences.length(module0038.f2735(var7)).numG((SubLObject)module0686.ZERO_INTEGER) ? reader.read_from_string_ignoring_errors(var7, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED) : module0686.NIL);
        final SubLObject var9 = (SubLObject)((module0686.NIL != var8) ? module0635.f38795(var8) : module0686.NIL);
        if (module0686.NIL != module0059.f4212(var9)) {
            module0635.f38793(var9);
        }
        f42011((SubLObject)module0686.UNPROVIDED);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42026(final SubLObject var20, SubLObject var2) {
        if (var2 == module0686.UNPROVIDED) {
            var2 = (SubLObject)module0686.NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0686.NIL == var2) {
            var2 = (SubLObject)module0686.$ic97$;
        }
        final SubLObject var22 = module0656.f39832((SubLObject)module0686.$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var21), (SubLObject)module0686.$ic98$, module0635.f38785(var20));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL != var22) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var22);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var23 = module0015.$g533$.currentBinding(var21);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var21);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var23, var21);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var20;
    }
    
    public static SubLObject f42027(SubLObject var6) {
        if (var6 == module0686.UNPROVIDED) {
            var6 = (SubLObject)module0686.NIL;
        }
        final SubLObject var7 = var6.first();
        final SubLObject var8 = (SubLObject)(Sequences.length(module0038.f2735(var7)).numG((SubLObject)module0686.ZERO_INTEGER) ? reader.read_from_string_ignoring_errors(var7, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED) : module0686.NIL);
        final SubLObject var9 = (SubLObject)((module0686.NIL != var8) ? module0635.f38795(var8) : module0686.NIL);
        if (module0686.NIL != module0059.f4212(var9)) {
            module0635.f38798(var9);
        }
        f42011((SubLObject)module0686.UNPROVIDED);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42028(final SubLObject var20, SubLObject var2) {
        if (var2 == module0686.UNPROVIDED) {
            var2 = (SubLObject)module0686.NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0686.NIL == var2) {
            var2 = (SubLObject)module0686.$ic101$;
        }
        final SubLObject var22 = module0656.f39832((SubLObject)module0686.$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var21), (SubLObject)module0686.$ic102$, module0635.f38785(var20));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL != var22) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var22);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var23 = module0015.$g533$.currentBinding(var21);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var21);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var23, var21);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var20;
    }
    
    public static SubLObject f42029(SubLObject var6) {
        if (var6 == module0686.UNPROVIDED) {
            var6 = (SubLObject)module0686.NIL;
        }
        final SubLObject var7 = var6.first();
        final SubLObject var8 = (SubLObject)(Sequences.length(module0038.f2735(var7)).numG((SubLObject)module0686.ZERO_INTEGER) ? reader.read_from_string_ignoring_errors(var7, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED) : module0686.NIL);
        final SubLObject var9 = (SubLObject)((module0686.NIL != var8) ? module0635.f38795(var8) : module0686.NIL);
        if (module0686.NIL != module0059.f4212(var9)) {
            final SubLObject var10 = module0635.f38788(var9);
            final SubLObject var12;
            final SubLObject var11 = var12 = module0635.f38786(var9);
            if (var12.eql((SubLObject)module0686.$ic104$)) {
                return f42030(var10, (SubLObject)module0686.$ic105$);
            }
            if (var12.eql((SubLObject)module0686.$ic70$)) {
                return f42031(var10, (SubLObject)module0686.$ic105$);
            }
            Errors.error((SubLObject)module0686.$ic106$, var11);
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42032(final SubLObject var20, SubLObject var2) {
        if (var2 == module0686.UNPROVIDED) {
            var2 = (SubLObject)module0686.NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0686.NIL == var2) {
            var2 = (SubLObject)module0686.$ic108$;
        }
        final SubLObject var22 = module0656.f39832((SubLObject)module0686.$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var21), (SubLObject)module0686.$ic109$, module0635.f38785(var20));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL != var22) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var22);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var23 = module0015.$g533$.currentBinding(var21);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var21);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var23, var21);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var20;
    }
    
    public static SubLObject f42023(SubLObject var6) {
        if (var6 == module0686.UNPROVIDED) {
            var6 = (SubLObject)module0686.NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = var6.first();
        final SubLObject var9 = (SubLObject)(Sequences.length(module0038.f2735(var8)).numG((SubLObject)module0686.ZERO_INTEGER) ? reader.read_from_string_ignoring_errors(var8, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED) : module0686.NIL);
        final SubLObject var10 = (SubLObject)((module0686.NIL != var9) ? module0635.f38795(var9) : module0686.NIL);
        if (module0686.NIL != module0059.f4212(var10)) {
            final SubLObject var11 = module0635.f38788(var10);
            final SubLObject var12 = module0424.f29838(var11);
            final SubLObject var13 = (SubLObject)((module0686.NIL != module0424.f29729(var11)) ? module0424.f29937(var11) : module0686.NIL);
            final SubLObject var14 = PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic111$, var12);
            module0642.f39020((SubLObject)module0686.$ic19$);
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
            final SubLObject var15 = module0014.f672((SubLObject)module0686.$ic20$);
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            if (module0686.NIL != var15) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(var15);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic22$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            module0642.f39019(var14);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            if (module0686.NIL != module0686.$g5388$.getDynamicValue(var7)) {
                final SubLObject var16 = PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic112$, var9);
                module0642.f39029((SubLObject)module0686.UNPROVIDED);
                module0642.f39020(module0015.$g166$.getGlobalValue());
                module0642.f39020(module0015.$g167$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020((SubLObject)module0686.$ic23$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                if (module0686.NIL != var16) {
                    module0642.f39020(module0015.$g168$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(var16);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            final SubLObject var17 = module0015.$g132$.getDynamicValue(var7);
            final SubLObject var18 = module0015.$g535$.currentBinding(var7);
            try {
                module0015.$g535$.bind((SubLObject)module0686.T, var7);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0686.NIL != var17) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0642.f39042(var17));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_60 = module0015.$g533$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var7);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)module0686.ONE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39019(var14);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)module0686.ONE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    if (module0686.NIL == var13) {
                        module0642.f39021((SubLObject)module0686.$ic113$);
                    }
                    else {
                        module0642.f39028((SubLObject)module0686.UNPROVIDED);
                        final SubLObject var19 = module0059.f4256(var10);
                        if (var19.eql((SubLObject)module0686.$ic57$) || var19.eql((SubLObject)module0686.$ic58$)) {
                            module0656.f39837((SubLObject)module0686.$ic28$, (SubLObject)ConsesLow.cons((SubLObject)module0686.$ic91$, var6), (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                        }
                        else if (var19.eql((SubLObject)module0686.$ic60$)) {
                            module0642.f39021((SubLObject)module0686.$ic114$);
                            module0686.$g5388$.setDynamicValue((SubLObject)module0686.NIL, var7);
                        }
                        else {
                            module0642.f39021((SubLObject)module0686.$ic115$);
                            module0686.$g5388$.setDynamicValue((SubLObject)module0686.NIL, var7);
                        }
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020((SubLObject)module0686.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020((SubLObject)module0686.THREE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0015.$g357$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020((SubLObject)module0686.$ic25$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                        final SubLObject var5_61 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)module0686.T, var7);
                            SubLObject var20 = var13;
                            SubLObject var21 = (SubLObject)module0686.NIL;
                            var21 = var20.first();
                            while (module0686.NIL != var20) {
                                final SubLObject var38_63 = module0424.f29840(var21);
                                final SubLObject var22 = module0424.f29851(var21);
                                final SubLObject var23 = module0424.f29846(var21);
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39020(module0015.$g366$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020((SubLObject)module0686.$ic26$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_62 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var7);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                    final SubLObject var5_63 = module0015.$g533$.currentBinding(var7);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0686.T, var7);
                                        module0656.f39804(var38_63, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_63, var7);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                    final SubLObject var5_64 = module0015.$g533$.currentBinding(var7);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0686.T, var7);
                                        module0642.f39019(var23);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_64, var7);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_62, var7);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)module0686.UNPROVIDED);
                                if (var23 == module0686.$ic65$) {
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g366$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0686.$ic26$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                    final SubLObject var5_65 = module0015.$g533$.currentBinding(var7);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0686.T, var7);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g371$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0686.THREE_INTEGER);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                        final SubLObject var5_66 = module0015.$g533$.currentBinding(var7);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0686.T, var7);
                                            f42030(var21, (SubLObject)module0686.$ic105$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_66, var7);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_65, var7);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)module0686.UNPROVIDED);
                                }
                                var20 = var20.rest();
                                var21 = var20.first();
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var5_61, var7);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                    }
                    module0642.f39029((SubLObject)module0686.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_60, var7);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0686.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var18, var7);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42031(final SubLObject var33, final SubLObject var70) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        final SubLObject var72 = (SubLObject)module0686.$ic119$;
        final SubLObject var73 = module0015.$g538$.currentBinding(var71);
        try {
            module0015.$g538$.bind((module0686.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var71))) ? module0015.$g538$.getDynamicValue(var71) : module0057.f4173((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED), var71);
            module0642.f39020((SubLObject)module0686.$ic19$);
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var71), module0655.$g5142$.getDynamicValue(var71));
            final SubLObject var74 = module0014.f672((SubLObject)module0686.$ic20$);
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            if (module0686.NIL != var74) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(var74);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic22$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            module0016.f941();
            if (module0686.NIL != var72) {
                module0642.f39029((SubLObject)module0686.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var72);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_72 = module0015.$g535$.currentBinding(var71);
            try {
                module0015.$g535$.bind((SubLObject)module0686.T, var71);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0686.NIL != module0015.$g132$.getDynamicValue(var71)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var71)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020((SubLObject)module0686.$ic122$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_73 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var71);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020((SubLObject)module0686.$ic123$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_74 = module0015.$g533$.currentBinding(var71);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var71);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020((SubLObject)module0686.$ic124$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020((SubLObject)module0686.$ic125$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39019((SubLObject)module0686.$ic126$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_74, var71);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0686.NIL != var72) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0686.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39019(var72);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0686.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    }
                    module0656.f39870((SubLObject)module0686.$ic117$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39046(module0015.$g348$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020((SubLObject)module0686.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0015.$g353$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020((SubLObject)module0686.TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0015.$g354$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020((SubLObject)module0686.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_75 = module0015.$g533$.currentBinding(var71);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var71);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                        final SubLObject var5_76 = module0015.$g533$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)module0686.T, var71);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_77 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var71);
                                module0642.f39019((SubLObject)module0686.$ic127$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_77, var71);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_78 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var71);
                                module0642.f39019(module0424.f29838(var33));
                            }
                            finally {
                                module0015.$g533$.rebind(var5_78, var71);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_76, var71);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                        final SubLObject var5_79 = module0015.$g533$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)module0686.T, var71);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_80 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var71);
                                module0642.f39019((SubLObject)module0686.$ic128$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_80, var71);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_81 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var71);
                                module0642.f39019((SubLObject)module0686.$ic129$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_81, var71);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_79, var71);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                        final SubLObject var5_82 = module0015.$g533$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)module0686.T, var71);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_83 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var71);
                                module0642.f39019((SubLObject)module0686.$ic130$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_83, var71);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_84 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var71);
                                module0642.f39019((SubLObject)module0686.$ic129$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_84, var71);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_82, var71);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                        final SubLObject var5_85 = module0015.$g533$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)module0686.T, var71);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_86 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var71);
                                module0642.f39019((SubLObject)module0686.$ic131$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_86, var71);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_87 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var71);
                                module0642.f39019(module0424.f29842(var33));
                            }
                            finally {
                                module0015.$g533$.rebind(var5_87, var71);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_85, var71);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                        final SubLObject var5_88 = module0015.$g533$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)module0686.T, var71);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_89 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var71);
                                module0642.f39019((SubLObject)module0686.$ic132$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_89, var71);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_90 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var71);
                                module0642.f39019(module0424.f29845(var33));
                            }
                            finally {
                                module0015.$g533$.rebind(var5_90, var71);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_88, var71);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0686.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_75, var71);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)module0686.$ic133$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    SubLObject var75 = module0424.f29937(var33);
                    SubLObject var76 = (SubLObject)module0686.NIL;
                    var76 = var75.first();
                    while (module0686.NIL != var75) {
                        f42030(var76, var70);
                        var75 = var75.rest();
                        var76 = var75.first();
                    }
                    module0642.f39029((SubLObject)module0686.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_73, var71);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0686.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5_72, var71);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var73, var71);
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42030(final SubLObject var91, final SubLObject var70) {
        final SubLThread var92 = SubLProcess.currentSubLThread();
        assert module0686.NIL != module0424.f29714(var91) : var91;
        final SubLObject var93 = module0424.f29838(var91);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0686.$ic135$);
        module0656.f39804(var93, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39067();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var94 = module0015.$g533$.currentBinding(var92);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var92);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_93 = module0015.$g533$.currentBinding(var92);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var92);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_94 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var92);
                    module0642.f39019((SubLObject)module0686.$ic136$);
                }
                finally {
                    module0015.$g533$.rebind(var5_94, var92);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_95 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var92);
                    module0656.f39804(module0633.f38713(var93, (SubLObject)module0686.UNPROVIDED), (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var5_95, var92);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var5_93, var92);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_96 = module0015.$g533$.currentBinding(var92);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var92);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_97 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var92);
                    module0642.f39019((SubLObject)module0686.$ic137$);
                }
                finally {
                    module0015.$g533$.rebind(var5_97, var92);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_98 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var92);
                    module0656.f39804(module0423.f29562(module0633.f38713(var93, (SubLObject)module0686.UNPROVIDED)).first(), (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var5_98, var92);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var5_96, var92);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_99 = module0015.$g533$.currentBinding(var92);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var92);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_100 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var92);
                    module0642.f39019((SubLObject)module0686.$ic138$);
                }
                finally {
                    module0015.$g533$.rebind(var5_100, var92);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_101 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var92);
                    final SubLObject var95 = module0424.f29842(var91);
                    if (module0686.$ic67$ == var95) {
                        final SubLObject var96 = (SubLObject)module0686.$ic139$;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (module0686.NIL != var96) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39042(var96));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                        final SubLObject var5_102 = module0015.$g533$.currentBinding(var92);
                        try {
                            module0015.$g533$.bind((SubLObject)module0686.T, var92);
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0642.f39019(var95);
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_102, var92);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                    }
                    else if (module0686.$ic66$ == var95) {
                        final SubLObject var96 = (SubLObject)module0686.$ic140$;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (module0686.NIL != var96) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39042(var96));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                        final SubLObject var5_103 = module0015.$g533$.currentBinding(var92);
                        try {
                            module0015.$g533$.bind((SubLObject)module0686.T, var92);
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0642.f39019(var95);
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_103, var92);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                    }
                    else {
                        module0642.f39019(var95);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var5_101, var92);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var5_99, var92);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            if (module0424.f29842(var91) == module0686.$ic67$) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_104 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var92);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_105 = module0015.$g533$.currentBinding(var92);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var92);
                        module0642.f39019((SubLObject)module0686.$ic132$);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_105, var92);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_106 = module0015.$g533$.currentBinding(var92);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var92);
                        module0015.f741();
                        module0642.f39020(module0015.$g203$.getGlobalValue());
                        final SubLObject var5_107 = module0015.$g537$.currentBinding(var92);
                        try {
                            module0015.$g537$.bind((SubLObject)module0686.T, var92);
                            module0642.f39019(module0424.f29911(var91));
                        }
                        finally {
                            module0015.$g537$.rebind(var5_107, var92);
                        }
                        module0642.f39020(module0015.$g204$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var5_106, var92);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_104, var92);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0686.UNPROVIDED);
            }
            SubLObject var97 = module0424.f29731(module0633.f38724(module0424.f29840(var91), (SubLObject)module0686.UNPROVIDED));
            SubLObject var98 = (SubLObject)module0686.NIL;
            var98 = var97.first();
            while (module0686.NIL != var97) {
                final SubLObject var99 = module0424.f29912(var91, var98);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_108 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var92);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_109 = module0015.$g533$.currentBinding(var92);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var92);
                        module0642.f39019(var98);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_109, var92);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_110 = module0015.$g533$.currentBinding(var92);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var92);
                        module0642.f39019(var99);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_110, var92);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_108, var92);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0686.UNPROVIDED);
                var97 = var97.rest();
                var98 = var97.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var94, var92);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42033(final SubLObject var46, final SubLObject var114) {
        final SubLThread var115 = SubLProcess.currentSubLThread();
        assert module0686.NIL != module0369.f25275(var46) : var46;
        assert module0686.NIL != module0633.f38716(var114, (SubLObject)module0686.UNPROVIDED) : var114;
        return Hashtables.sethash(var46, module0686.$g5389$.getDynamicValue(var115), var114);
    }
    
    public static SubLObject f42034(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        assert module0686.NIL != module0369.f25275(var46) : var46;
        return Hashtables.remhash(var46, module0686.$g5389$.getDynamicValue(var47));
    }
    
    public static SubLObject f42035(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        assert module0686.NIL != module0369.f25275(var46) : var46;
        return Hashtables.gethash(var46, module0686.$g5389$.getDynamicValue(var47), (SubLObject)module0686.UNPROVIDED);
    }
    
    public static SubLObject f42036(final SubLObject var115, final SubLObject var116) {
        compatibility.default_struct_print_function(var115, var116, (SubLObject)module0686.ZERO_INTEGER);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42037(final SubLObject var115) {
        return (SubLObject)((var115.getClass() == $sX46003_native.class) ? module0686.T : module0686.NIL);
    }
    
    public static SubLObject f42038(final SubLObject var115) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.getField2();
    }
    
    public static SubLObject f42039(final SubLObject var115) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.getField3();
    }
    
    public static SubLObject f42040(final SubLObject var115) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.getField4();
    }
    
    public static SubLObject f42041(final SubLObject var115) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.getField5();
    }
    
    public static SubLObject f42042(final SubLObject var115) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.getField6();
    }
    
    public static SubLObject f42043(final SubLObject var115) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.getField7();
    }
    
    public static SubLObject f42044(final SubLObject var115) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.getField8();
    }
    
    public static SubLObject f42045(final SubLObject var115) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.getField9();
    }
    
    public static SubLObject f42046(final SubLObject var115) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.getField10();
    }
    
    public static SubLObject f42047(final SubLObject var115) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.getField11();
    }
    
    public static SubLObject f42048(final SubLObject var115) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.getField12();
    }
    
    public static SubLObject f42049(final SubLObject var115) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.getField13();
    }
    
    public static SubLObject f42050(final SubLObject var115) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.getField14();
    }
    
    public static SubLObject f42051(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.setField2(var117);
    }
    
    public static SubLObject f42052(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.setField3(var117);
    }
    
    public static SubLObject f42053(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.setField4(var117);
    }
    
    public static SubLObject f42054(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.setField5(var117);
    }
    
    public static SubLObject f42055(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.setField6(var117);
    }
    
    public static SubLObject f42056(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.setField7(var117);
    }
    
    public static SubLObject f42057(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.setField8(var117);
    }
    
    public static SubLObject f42058(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.setField9(var117);
    }
    
    public static SubLObject f42059(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.setField10(var117);
    }
    
    public static SubLObject f42060(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.setField11(var117);
    }
    
    public static SubLObject f42061(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.setField12(var117);
    }
    
    public static SubLObject f42062(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.setField13(var117);
    }
    
    public static SubLObject f42063(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42037(var115) : var115;
        return var115.setField14(var117);
    }
    
    public static SubLObject f42064(SubLObject var118) {
        if (var118 == module0686.UNPROVIDED) {
            var118 = (SubLObject)module0686.NIL;
        }
        final SubLObject var119 = (SubLObject)new $sX46003_native();
        SubLObject var120;
        SubLObject var121;
        SubLObject var122;
        SubLObject var123;
        for (var120 = (SubLObject)module0686.NIL, var120 = var118; module0686.NIL != var120; var120 = conses_high.cddr(var120)) {
            var121 = var120.first();
            var122 = conses_high.cadr(var120);
            var123 = var121;
            if (var123.eql((SubLObject)module0686.$ic179$)) {
                f42051(var119, var122);
            }
            else if (var123.eql((SubLObject)module0686.$ic180$)) {
                f42052(var119, var122);
            }
            else if (var123.eql((SubLObject)module0686.$ic181$)) {
                f42053(var119, var122);
            }
            else if (var123.eql((SubLObject)module0686.$ic182$)) {
                f42054(var119, var122);
            }
            else if (var123.eql((SubLObject)module0686.$ic183$)) {
                f42055(var119, var122);
            }
            else if (var123.eql((SubLObject)module0686.$ic184$)) {
                f42056(var119, var122);
            }
            else if (var123.eql((SubLObject)module0686.$ic185$)) {
                f42057(var119, var122);
            }
            else if (var123.eql((SubLObject)module0686.$ic186$)) {
                f42058(var119, var122);
            }
            else if (var123.eql((SubLObject)module0686.$ic187$)) {
                f42059(var119, var122);
            }
            else if (var123.eql((SubLObject)module0686.$ic188$)) {
                f42060(var119, var122);
            }
            else if (var123.eql((SubLObject)module0686.$ic189$)) {
                f42061(var119, var122);
            }
            else if (var123.eql((SubLObject)module0686.$ic190$)) {
                f42062(var119, var122);
            }
            else if (var123.eql((SubLObject)module0686.$ic191$)) {
                f42063(var119, var122);
            }
            else {
                Errors.error((SubLObject)module0686.$ic192$, var121);
            }
        }
        return var119;
    }
    
    public static SubLObject f42065(final SubLObject var123, final SubLObject var124) {
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic193$, (SubLObject)module0686.$ic194$, (SubLObject)module0686.THIRTEEN_INTEGER);
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic179$, f42038(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic180$, f42039(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic181$, f42040(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic182$, f42041(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic183$, f42042(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic184$, f42043(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic185$, f42044(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic186$, f42045(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic187$, f42046(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic188$, f42047(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic189$, f42048(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic190$, f42049(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic191$, f42050(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic196$, (SubLObject)module0686.$ic194$, (SubLObject)module0686.THIRTEEN_INTEGER);
        return var123;
    }
    
    public static SubLObject f42066(final SubLObject var123, final SubLObject var124) {
        return f42065(var123, var124);
    }
    
    public static SubLObject f42067(final SubLObject var125, final SubLObject var126) {
        assert module0686.NIL != f42037(var125) : var125;
        assert module0686.NIL != Types.stringp(var126) : var126;
        f42062(var125, (SubLObject)ConsesLow.cons(var126, f42049(var125)));
        return f42049(var125);
    }
    
    public static SubLObject f42068(final SubLObject var125, final SubLObject var39, final SubLObject var127) {
        assert module0686.NIL != f42037(var125) : var125;
        if (module0686.NIL != var127 && !module0686.areAssertionsDisabledFor(me) && module0686.NIL == Types.integerp(var127)) {
            throw new AssertionError(var127);
        }
        if (module0686.NIL == module0004.f104(var39, (SubLObject)module0686.$ic200$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED)) {
            Errors.error((SubLObject)module0686.$ic201$, var39);
        }
        f42063(var125, conses_high.putf(f42050(var125), var39, var127));
        return f42050(var125);
    }
    
    public static SubLObject f42069(final SubLObject var114) {
        assert module0686.NIL != module0633.f38716(var114, (SubLObject)module0686.UNPROVIDED) : var114;
        final SubLObject var115 = f42064((SubLObject)module0686.UNPROVIDED);
        final SubLObject var116 = module0633.f38713(var114, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var117 = module0682.f41658(var116, var115);
        final SubLObject var118 = module0633.f38733(var114);
        f42051(var115, var114);
        f42052(var115, module0656.f39942(var114));
        f42053(var115, module0633.f38720(var114, (SubLObject)module0686.UNPROVIDED));
        f42054(var115, var117);
        f42055(var115, var118);
        f42057(var115, module0065.f4745((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED));
        f42058(var115, module0067.f4880(Symbols.symbol_function((SubLObject)module0686.EQUAL), (SubLObject)module0686.UNPROVIDED));
        f42063(var115, module0035.f2333((SubLObject)module0686.$ic200$, (SubLObject)module0686.$ic202$));
        final SubLObject var119 = module0633.f38726(var114, var118);
        final SubLObject var120 = module0633.f38727(var114, var118);
        final SubLObject var121 = module0633.f38728(var114, var118);
        final SubLObject var122 = module0633.f38729(var114, var118);
        final SubLObject var123 = module0633.f38730(var114, var118);
        final SubLObject var124 = module0633.f38731(var114, var118);
        final SubLObject var125 = module0633.f38732(var114, var118);
        f42068(var115, (SubLObject)module0686.$ic203$, var123);
        f42068(var115, (SubLObject)module0686.$ic204$, var124);
        f42068(var115, (SubLObject)module0686.$ic205$, var125);
        if (module0686.NIL != var122) {
            f42056(var115, (SubLObject)module0686.$ic206$);
        }
        else if (module0686.NIL != var119 || module0686.NIL != module0633.f38725(var114, var118)) {
            f42056(var115, (SubLObject)module0686.$ic207$);
            SubLObject var126 = var119;
            SubLObject var127 = (SubLObject)module0686.NIL;
            var127 = var126.first();
            while (module0686.NIL != var126) {
                f42070(var127, var115, (SubLObject)module0686.$ic208$);
                var126 = var126.rest();
                var127 = var126.first();
            }
        }
        else if (module0686.NIL != var120 || module0686.NIL != var121) {
            f42056(var115, (SubLObject)module0686.$ic209$);
            SubLObject var126 = var120;
            SubLObject var127 = (SubLObject)module0686.NIL;
            var127 = var126.first();
            while (module0686.NIL != var126) {
                if (module0686.NIL != module0233.f15359(var127)) {
                    f42070(var127, var115, (SubLObject)module0686.$ic208$);
                }
                else {
                    f42067(var115, Sequences.cconcatenate((SubLObject)module0686.$ic210$, new SubLObject[] { module0006.f203(var127), module0686.$ic211$ }));
                }
                var126 = var126.rest();
                var127 = var126.first();
            }
            var126 = var121;
            var127 = (SubLObject)module0686.NIL;
            var127 = var126.first();
            while (module0686.NIL != var126) {
                if (module0686.NIL != module0233.f15359(var127)) {
                    f42070(var127, var115, (SubLObject)module0686.$ic212$);
                }
                else {
                    f42067(var115, Sequences.cconcatenate((SubLObject)module0686.$ic213$, new SubLObject[] { module0006.f203(var127), module0686.$ic211$ }));
                }
                var126 = var126.rest();
                var127 = var126.first();
            }
        }
        else {
            f42056(var115, (SubLObject)module0686.$ic214$);
        }
        f42059(var115, module0633.f38719(var114, var118));
        f42060(var115, module0633.f38724(var114, var118));
        f42061(var115, module0633.f38722(var114, (SubLObject)module0686.UNPROVIDED));
        return var115;
    }
    
    public static SubLObject f42071(final SubLObject var46) {
        assert module0686.NIL != module0369.f25275(var46) : var46;
        final SubLObject var47 = f42064((SubLObject)module0686.UNPROVIDED);
        final SubLObject var48 = module0682.f41659(var46, var47);
        f42051(var47, f42035(var46));
        f42054(var47, var48);
        f42055(var47, module0632.f38705());
        f42057(var47, module0065.f4745((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED));
        f42058(var47, module0067.f4880(Symbols.symbol_function((SubLObject)module0686.EQUAL), (SubLObject)module0686.UNPROVIDED));
        f42063(var47, module0035.f2333((SubLObject)module0686.$ic200$, (SubLObject)module0686.$ic202$));
        return var47;
    }
    
    public static SubLObject f42072(final SubLObject var125) {
        return f42073(var125, (SubLObject)module0686.$ic207$, (SubLObject)module0686.$ic208$);
    }
    
    public static SubLObject f42074(final SubLObject var125) {
        return f42073(var125, (SubLObject)module0686.$ic209$, (SubLObject)module0686.$ic208$);
    }
    
    public static SubLObject f42075(final SubLObject var125) {
        return f42073(var125, (SubLObject)module0686.$ic209$, (SubLObject)module0686.$ic212$);
    }
    
    public static SubLObject f42076(final SubLObject var125) {
        return f42073(var125, (SubLObject)module0686.NIL, (SubLObject)module0686.$ic214$);
    }
    
    public static SubLObject f42077(final SubLObject var125) {
        return Equality.eq(f42043(var125), (SubLObject)module0686.$ic206$);
    }
    
    public static SubLObject f42078(final SubLObject var125) {
        return (SubLObject)SubLObjectFactory.makeBoolean(f42043(var125) == module0686.$ic207$ && module0686.NIL == f42072(var125));
    }
    
    public static SubLObject f42073(final SubLObject var125, final SubLObject var139, final SubLObject var140) {
        if (module0686.NIL != var139 && !f42043(var125).eql(var139)) {
            return (SubLObject)module0686.NIL;
        }
        SubLObject var141 = (SubLObject)module0686.NIL;
        final SubLObject var143;
        final SubLObject var142 = var143 = f42044(var125);
        if (module0686.NIL == module0065.f4772(var143, (SubLObject)module0686.$ic215$)) {
            final SubLObject var144_145 = var143;
            if (module0686.NIL == module0065.f4775(var144_145, (SubLObject)module0686.$ic215$)) {
                final SubLObject var144 = module0065.f4740(var144_145);
                final SubLObject var145 = (SubLObject)module0686.NIL;
                SubLObject var146;
                SubLObject var147;
                SubLObject var148;
                SubLObject var149;
                for (var146 = Sequences.length(var144), var147 = (SubLObject)module0686.NIL, var147 = (SubLObject)module0686.ZERO_INTEGER; var147.numL(var146); var147 = Numbers.add(var147, (SubLObject)module0686.ONE_INTEGER)) {
                    var148 = ((module0686.NIL != var145) ? Numbers.subtract(var146, var147, (SubLObject)module0686.ONE_INTEGER) : var147);
                    var149 = Vectors.aref(var144, var148);
                    if (module0686.NIL == module0065.f4749(var149) || module0686.NIL == module0065.f4773((SubLObject)module0686.$ic215$)) {
                        if (module0686.NIL != module0065.f4749(var149)) {
                            var149 = (SubLObject)module0686.$ic215$;
                        }
                        if (f42079(var149).eql(var140)) {
                            var141 = (SubLObject)ConsesLow.cons(f42080(var149), var141);
                        }
                    }
                }
            }
            final SubLObject var151_152 = var143;
            if (module0686.NIL == module0065.f4777(var151_152)) {
                final SubLObject var150 = module0065.f4738(var151_152);
                SubLObject var151 = (SubLObject)module0686.NIL;
                SubLObject var152 = (SubLObject)module0686.NIL;
                final Iterator var153 = Hashtables.getEntrySetIterator(var150);
                try {
                    while (Hashtables.iteratorHasNext(var153)) {
                        final Map.Entry var154 = Hashtables.iteratorNextEntry(var153);
                        var151 = Hashtables.getEntryKey(var154);
                        var152 = Hashtables.getEntryValue(var154);
                        if (f42079(var152).eql(var140)) {
                            var141 = (SubLObject)ConsesLow.cons(f42080(var152), var141);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var153);
                }
            }
        }
        return Sequences.nreverse(var141);
    }
    
    public static SubLObject f42081() {
        module0686.$g5391$.setDynamicValue((SubLObject)module0686.NIL);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42082() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return module0686.$g5391$.getDynamicValue(var3);
    }
    
    public static SubLObject f42083(final SubLObject var156) {
        module0686.$g5391$.setDynamicValue(var156);
        return var156;
    }
    
    public static SubLObject f42084(final SubLObject var115, final SubLObject var116) {
        compatibility.default_struct_print_function(var115, var116, (SubLObject)module0686.ZERO_INTEGER);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42085(final SubLObject var115) {
        return (SubLObject)((var115.getClass() == $sX46004_native.class) ? module0686.T : module0686.NIL);
    }
    
    public static SubLObject f42080(final SubLObject var115) {
        assert module0686.NIL != f42085(var115) : var115;
        return var115.getField2();
    }
    
    public static SubLObject f42079(final SubLObject var115) {
        assert module0686.NIL != f42085(var115) : var115;
        return var115.getField3();
    }
    
    public static SubLObject f42086(final SubLObject var115) {
        assert module0686.NIL != f42085(var115) : var115;
        return var115.getField4();
    }
    
    public static SubLObject f42087(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42085(var115) : var115;
        return var115.setField2(var117);
    }
    
    public static SubLObject f42088(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42085(var115) : var115;
        return var115.setField3(var117);
    }
    
    public static SubLObject f42089(final SubLObject var115, final SubLObject var117) {
        assert module0686.NIL != f42085(var115) : var115;
        return var115.setField4(var117);
    }
    
    public static SubLObject f42090(SubLObject var118) {
        if (var118 == module0686.UNPROVIDED) {
            var118 = (SubLObject)module0686.NIL;
        }
        final SubLObject var119 = (SubLObject)new $sX46004_native();
        SubLObject var120;
        SubLObject var121;
        SubLObject var122;
        SubLObject var123;
        for (var120 = (SubLObject)module0686.NIL, var120 = var118; module0686.NIL != var120; var120 = conses_high.cddr(var120)) {
            var121 = var120.first();
            var122 = conses_high.cadr(var120);
            var123 = var121;
            if (var123.eql((SubLObject)module0686.$ic231$)) {
                f42087(var119, var122);
            }
            else if (var123.eql((SubLObject)module0686.$ic232$)) {
                f42088(var119, var122);
            }
            else if (var123.eql((SubLObject)module0686.$ic233$)) {
                f42089(var119, var122);
            }
            else {
                Errors.error((SubLObject)module0686.$ic192$, var121);
            }
        }
        return var119;
    }
    
    public static SubLObject f42091(final SubLObject var123, final SubLObject var124) {
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic193$, (SubLObject)module0686.$ic234$, (SubLObject)module0686.THREE_INTEGER);
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic231$, f42080(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic232$, f42079(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic195$, (SubLObject)module0686.$ic233$, f42086(var123));
        Functions.funcall(var124, var123, (SubLObject)module0686.$ic196$, (SubLObject)module0686.$ic234$, (SubLObject)module0686.THREE_INTEGER);
        return var123;
    }
    
    public static SubLObject f42092(final SubLObject var123, final SubLObject var124) {
        return f42091(var123, var124);
    }
    
    public static SubLObject f42070(final SubLObject var138, final SubLObject var125, SubLObject var41) {
        if (var41 == module0686.UNPROVIDED) {
            var41 = (SubLObject)module0686.$ic214$;
        }
        assert module0686.NIL != module0233.f15359(var138) : var138;
        assert module0686.NIL != f42037(var125) : var125;
        assert module0686.NIL != Types.keywordp(var41) : var41;
        final SubLObject var139 = f42044(var125);
        final SubLObject var140 = f42045(var125);
        final SubLObject var141 = module0065.f4746(var139);
        final SubLObject var142 = f42090((SubLObject)module0686.UNPROVIDED);
        f42087(var142, var138);
        f42088(var142, var41);
        f42089(var142, var141);
        module0065.f4753(var139, var141, var142);
        module0067.f4886(var140, var138, var142);
        return var142;
    }
    
    public static SubLObject f42093(final SubLObject var125) {
        assert module0686.NIL != f42037(var125) : var125;
        final SubLObject var126 = f42044(var125);
        return module0065.f4733(var126);
    }
    
    public static SubLObject f42094(final SubLObject var125, final SubLObject var58) {
        assert module0686.NIL != f42037(var125) : var125;
        final SubLObject var126 = f42044(var125);
        return module0065.f4750(var126, var58, (SubLObject)module0686.UNPROVIDED);
    }
    
    public static SubLObject f42095(final SubLObject var125, final SubLObject var138) {
        assert module0686.NIL != f42037(var125) : var125;
        assert module0686.NIL != module0233.f15359(var138) : var138;
        final SubLObject var139 = f42045(var125);
        return module0067.f4884(var139, var138, (SubLObject)module0686.UNPROVIDED);
    }
    
    public static SubLObject f42096(final SubLObject var125, final SubLObject var58) {
        assert module0686.NIL != f42037(var125) : var125;
        final SubLObject var126 = f42044(var125);
        return module0065.f4761(var126, var58);
    }
    
    public static SubLObject f42097(final SubLObject var150, final SubLObject var41) {
        assert module0686.NIL != f42085(var150) : var150;
        assert module0686.NIL != Types.keywordp(var41) : var41;
        f42088(var150, var41);
        return var150;
    }
    
    public static SubLObject f42098(final SubLObject var114, SubLObject var2) {
        if (var2 == module0686.UNPROVIDED) {
            var2 = (SubLObject)module0686.NIL;
        }
        final SubLThread var115 = SubLProcess.currentSubLThread();
        if (module0686.NIL == var2) {
            var2 = (SubLObject)module0686.$ic72$;
        }
        assert module0686.NIL != module0633.f38716(var114, (SubLObject)module0686.UNPROVIDED) : var114;
        final SubLObject var116 = module0656.f39832((SubLObject)module0686.$ic1$);
        if (module0686.$ic238$.isString()) {
            final SubLObject var117 = module0644.f39202((SubLObject)module0686.$ic238$, (SubLObject)module0686.NIL, (SubLObject)module0686.NIL, (SubLObject)module0686.NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var115), (SubLObject)module0686.$ic239$, module0656.f39842(var114));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            if (module0686.NIL != var116) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(var116);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var117);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic240$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var118 = module0015.$g533$.currentBinding(var115);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var115);
                module0642.f39019(var2);
            }
            finally {
                module0015.$g533$.rebind(var118, var115);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42099(final SubLObject var6) {
        final SubLObject var7 = module0656.f39943(var6.first(), (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL == module0633.f38716(var7, (SubLObject)module0686.UNPROVIDED)) {
            return module0656.f39789((SubLObject)module0686.$ic242$, var6.first(), (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        f42083(f42069(var7));
        module0682.f41666(f42041(f42082()));
        f42100(var7);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42101(final SubLObject var46, SubLObject var2) {
        if (var2 == module0686.UNPROVIDED) {
            var2 = (SubLObject)module0686.NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        if (module0686.NIL == var2) {
            var2 = (SubLObject)module0686.$ic244$;
        }
        assert module0686.NIL != module0369.f25275(var46) : var46;
        final SubLObject var48 = module0656.f39832((SubLObject)module0686.$ic245$);
        if (module0686.$ic246$.isString()) {
            final SubLObject var49 = module0644.f39202((SubLObject)module0686.$ic246$, (SubLObject)module0686.NIL, (SubLObject)module0686.NIL, (SubLObject)module0686.NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)module0686.$ic247$, module0361.f23996(module0369.f25421(var46)), module0369.f25422(var46));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            if (module0686.NIL != var48) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(var48);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var49);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic240$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var50 = module0015.$g533$.currentBinding(var47);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var47);
                module0642.f39019(var2);
            }
            finally {
                module0015.$g533$.rebind(var50, var47);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42102(final SubLObject var6) {
        SubLObject var7 = (SubLObject)module0686.NIL;
        SubLObject var8 = (SubLObject)module0686.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var6, (SubLObject)module0686.$ic250$);
        var7 = var6.first();
        SubLObject var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var6, (SubLObject)module0686.$ic250$);
        var8 = var9.first();
        var9 = var9.rest();
        if (module0686.NIL != var9) {
            cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)module0686.$ic250$);
            return (SubLObject)module0686.NIL;
        }
        final SubLObject var10 = reader.parse_integer(var7, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var11 = reader.parse_integer(var8, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var12 = module0361.f24195(var10, var11);
        final SubLObject var13 = (SubLObject)((module0686.NIL != var12) ? f42035(var12) : module0686.NIL);
        if (module0686.NIL == var12) {
            return module0656.f39789((SubLObject)module0686.$ic251$, var11, var10, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        f42083(f42071(var12));
        module0682.f41666(f42041(f42082()));
        if (module0686.NIL != module0633.f38716(var13, (SubLObject)module0686.UNPROVIDED)) {
            f42051(f42082(), var13);
        }
        return f42100(var13);
    }
    
    public static SubLObject f42100(SubLObject var114) {
        if (var114 == module0686.UNPROVIDED) {
            var114 = (SubLObject)module0686.NIL;
        }
        final SubLThread var115 = SubLProcess.currentSubLThread();
        final SubLObject var116 = (SubLObject)((module0686.NIL != var114) ? module0686.$ic253$ : module0686.$ic254$);
        final SubLObject var117 = module0644.f39214(module0644.$g5024$.getGlobalValue());
        final SubLObject var118 = module0015.$g538$.currentBinding(var115);
        try {
            module0015.$g538$.bind((module0686.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var115))) ? module0015.$g538$.getDynamicValue(var115) : module0057.f4173((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED), var115);
            module0642.f39020((SubLObject)module0686.$ic19$);
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var115), module0655.$g5142$.getDynamicValue(var115));
            final SubLObject var119 = module0014.f672((SubLObject)module0686.$ic20$);
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            if (module0686.NIL != var119) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(var119);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic22$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            module0642.f39019(var116);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            module0666.f40471();
            module0644.f39213();
            module0016.f892();
            module0016.f895();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_170 = module0015.$g535$.currentBinding(var115);
            try {
                module0015.$g535$.bind((SubLObject)module0686.T, var115);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_171 = module0015.$g533$.currentBinding(var115);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var115);
                    module0644.f39197();
                    final SubLObject var120 = module0656.f39832((SubLObject)module0686.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var115));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020((SubLObject)module0686.$ic40$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    if (module0686.NIL != var120) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(var120);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    }
                    module0642.f39032((SubLObject)module0686.ONE_INTEGER);
                    module0642.f39020(var117);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_172 = module0015.$g533$.currentBinding(var115);
                    final SubLObject var121 = module0015.$g541$.currentBinding(var115);
                    final SubLObject var122 = module0015.$g539$.currentBinding(var115);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var115);
                        module0015.$g541$.bind((SubLObject)module0686.T, var115);
                        module0015.$g539$.bind(module0015.f797(), var115);
                        module0642.f39069((SubLObject)module0686.$ic255$, (SubLObject)module0686.NIL, (SubLObject)module0686.UNPROVIDED);
                        f42103(var116);
                        module0642.f39026((SubLObject)module0686.UNPROVIDED);
                        f42104((SubLObject)module0686.UNPROVIDED);
                        module0642.f39026((SubLObject)module0686.UNPROVIDED);
                        module0683.f41737(module0682.f41660(module0682.f41665()), module0682.f41662(module0682.f41665()), (SubLObject)module0686.NIL);
                        module0642.f39026((SubLObject)module0686.UNPROVIDED);
                        module0684.f41943();
                        module0642.f39026((SubLObject)module0686.UNPROVIDED);
                        module0683.f41738(module0682.f41660(module0682.f41665()), (SubLObject)module0686.NIL);
                        module0642.f39026((SubLObject)module0686.UNPROVIDED);
                        module0684.f41944();
                        module0642.f39026((SubLObject)module0686.UNPROVIDED);
                        module0683.f41739(module0682.f41639(module0682.f41665()), (SubLObject)module0686.NIL);
                        module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                        module0684.f41945((SubLObject)module0686.UNPROVIDED);
                        module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                        f42105((SubLObject)module0686.UNPROVIDED);
                        module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                        f42106((SubLObject)module0686.UNPROVIDED);
                        module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                        f42107((SubLObject)module0686.UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var115));
                    }
                    finally {
                        module0015.$g539$.rebind(var122, var115);
                        module0015.$g541$.rebind(var121, var115);
                        module0015.$g533$.rebind(var5_172, var115);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0686.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_171, var115);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0686.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5_170, var115);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var118, var115);
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42103(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = (SubLObject)module0686.FIVE_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0686.NIL != var10) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var11 = module0015.$g533$.currentBinding(var9);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var9);
            module0683.f41676(var8, (SubLObject)module0686.$ic256$, (SubLObject)module0686.$ic257$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var11, var9);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39026((SubLObject)module0686.UNPROVIDED);
        module0683.f41676((SubLObject)module0686.$ic258$, (SubLObject)module0686.$ic259$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        module0642.f39032((SubLObject)module0686.UNPROVIDED);
        module0683.f41677((SubLObject)module0686.$ic260$, (SubLObject)module0686.$ic261$, (SubLObject)module0686.$ic262$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        module0642.f39032((SubLObject)module0686.UNPROVIDED);
        module0683.f41677((SubLObject)module0686.$ic263$, (SubLObject)module0686.$ic264$, (SubLObject)module0686.$ic265$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        module0642.f39032((SubLObject)module0686.UNPROVIDED);
        module0683.f41677((SubLObject)module0686.$ic266$, (SubLObject)module0686.$ic267$, (SubLObject)module0686.$ic268$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        module0642.f39032((SubLObject)module0686.UNPROVIDED);
        module0683.f41677((SubLObject)module0686.$ic269$, (SubLObject)module0686.$ic270$, (SubLObject)module0686.$ic271$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        module0642.f39032((SubLObject)module0686.UNPROVIDED);
        module0683.f41677((SubLObject)module0686.$ic272$, (SubLObject)module0686.$ic273$, (SubLObject)module0686.$ic274$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        module0642.f39032((SubLObject)module0686.UNPROVIDED);
        module0683.f41677((SubLObject)module0686.$ic275$, (SubLObject)module0686.$ic276$, (SubLObject)module0686.$ic277$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL != f42049(f42082())) {
            module0642.f39026((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)module0686.$ic278$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)module0686.UNPROVIDED);
            SubLObject var12 = f42049(f42082());
            SubLObject var13 = (SubLObject)module0686.NIL;
            var13 = var12.first();
            while (module0686.NIL != var12) {
                module0642.f39019(var13);
                module0642.f39026((SubLObject)module0686.UNPROVIDED);
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42104(SubLObject var174) {
        if (var174 == module0686.UNPROVIDED) {
            var174 = (SubLObject)module0686.T;
        }
        final SubLThread var175 = SubLProcess.currentSubLThread();
        module0642.f39026((SubLObject)module0686.UNPROVIDED);
        final SubLObject var176 = f42039(f42082());
        final SubLObject var177 = f42038(f42082());
        module0642.f39032((SubLObject)module0686.UNPROVIDED);
        module0683.f41676((SubLObject)module0686.$ic279$, (SubLObject)module0686.$ic280$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL != var174) {
            module0642.f39075((SubLObject)module0686.$ic281$, var176, (SubLObject)module0686.$ic47$);
        }
        else {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            if (module0686.NIL != var177) {
                module0656.f39804(var177, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
            }
            else {
                module0642.f39019(var176);
            }
            module0642.f39020(module0015.$g235$.getGlobalValue());
        }
        if (module0686.NIL != var174) {
            module0642.f39032((SubLObject)module0686.UNPROVIDED);
            module0683.f41678((SubLObject)module0686.$ic282$, (SubLObject)module0686.$ic283$, (SubLObject)module0686.$ic284$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39026((SubLObject)module0686.TWO_INTEGER);
        if (module0686.NIL != var174) {
            module0642.f39073((SubLObject)module0686.$ic285$);
            module0642.f39026((SubLObject)module0686.UNPROVIDED);
        }
        module0016.f920((SubLObject)module0686.$ic286$, (SubLObject)module0686.$ic287$, (SubLObject)module0686.$ic288$);
        final SubLObject var178 = (SubLObject)module0686.$ic289$;
        final SubLObject var179 = (SubLObject)module0686.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0686.NIL != var179) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var179);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        SubLObject var180 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var175);
            module0683.f41676((SubLObject)module0686.$ic290$, (SubLObject)module0686.$ic291$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var180, var175);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)module0686.$ic286$, var178, (SubLObject)module0686.$ic292$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.$ic286$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        var180 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var175);
            if (module0686.NIL != var174) {
                module0657.f39992(f42042(f42082()), (SubLObject)module0686.$ic293$);
            }
            else {
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0656.f39804(f42042(f42082()), (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
        }
        finally {
            module0015.$g533$.rebind(var180, var175);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0686.UNPROVIDED);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42105(SubLObject var174) {
        if (var174 == module0686.UNPROVIDED) {
            var174 = (SubLObject)module0686.T;
        }
        final SubLThread var175 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)module0686.$ic269$);
        module0016.f920((SubLObject)module0686.$ic294$, (SubLObject)module0686.$ic287$, (SubLObject)module0686.$ic288$);
        final SubLObject var176 = (SubLObject)module0686.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0686.NIL != var176) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var176);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var177 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var175);
            module0683.f41676((SubLObject)module0686.$ic295$, (SubLObject)module0686.$ic296$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var177, var175);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)module0686.$ic294$, (SubLObject)module0686.$ic297$, (SubLObject)module0686.$ic292$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.$ic294$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var178 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var175);
            SubLObject var179 = f42046(f42082());
            final SubLObject var180 = module0035.f2169(module0686.$ic298$, var179);
            if (module0686.NIL == var180) {
                var179 = (SubLObject)ConsesLow.cons(module0686.$ic298$, var179);
            }
            SubLObject var181 = var179;
            SubLObject var182 = (SubLObject)module0686.NIL;
            var182 = var181.first();
            while (module0686.NIL != var181) {
                module0642.f39026((SubLObject)module0686.UNPROVIDED);
                if (module0686.NIL != var174) {
                    final SubLObject var183 = (SubLObject)SubLObjectFactory.makeBoolean(!var182.eql(module0686.$ic298$) || module0686.NIL != var180);
                    module0642.f39068((SubLObject)module0686.$ic299$, module0656.f39842(var182), var183, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39032((SubLObject)module0686.TWO_INTEGER);
                    module0656.f39804(var182, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                }
                var181 = var181.rest();
                var182 = var181.first();
            }
            if (module0686.NIL != var174) {
                final SubLObject var184 = module0259.f16850(module0686.$ic52$);
                if (Sequences.length(var184).numG((SubLObject)module0686.$ic300$)) {
                    module0642.f39026((SubLObject)module0686.UNPROVIDED);
                    module0666.f40467((SubLObject)module0686.$ic301$, (SubLObject)module0686.$ic44$, module0686.$ic52$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39032((SubLObject)module0686.UNPROVIDED);
                    module0642.f39021((SubLObject)module0686.$ic302$);
                    module0642.f39032((SubLObject)module0686.UNPROVIDED);
                    module0642.f39075((SubLObject)module0686.$ic301$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                }
                else {
                    module0642.f39026((SubLObject)module0686.UNPROVIDED);
                    module0642.f39021((SubLObject)module0686.$ic302$);
                    module0642.f39032((SubLObject)module0686.UNPROVIDED);
                    module0656.f39982((SubLObject)module0686.$ic303$, Sort.sort(var184, Symbols.symbol_function((SubLObject)module0686.$ic304$), Symbols.symbol_function((SubLObject)module0686.$ic305$)), (SubLObject)module0686.NIL, (SubLObject)module0686.ONE_INTEGER, Symbols.symbol_function((SubLObject)module0686.IDENTITY), (SubLObject)module0686.T, (SubLObject)module0686.UNPROVIDED);
                }
            }
        }
        finally {
            module0015.$g533$.rebind(var178, var175);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0686.UNPROVIDED);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42106(SubLObject var174) {
        if (var174 == module0686.UNPROVIDED) {
            var174 = (SubLObject)module0686.T;
        }
        final SubLThread var175 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)module0686.$ic272$);
        module0016.f920((SubLObject)module0686.$ic306$, (SubLObject)module0686.$ic287$, (SubLObject)module0686.$ic288$);
        final SubLObject var176 = (SubLObject)module0686.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0686.NIL != var176) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var176);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var177 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var175);
            module0683.f41676((SubLObject)module0686.$ic307$, (SubLObject)module0686.$ic308$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var177, var175);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)module0686.$ic306$, (SubLObject)module0686.$ic297$, (SubLObject)module0686.$ic292$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.$ic306$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var178 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var175);
            module0642.f39026((SubLObject)module0686.UNPROVIDED);
            final SubLObject var179 = f42047(f42082());
            if (module0686.NIL == var179 && module0686.NIL == var174) {
                module0642.f39021((SubLObject)module0686.$ic309$);
            }
            SubLObject var180 = module0631.f38700();
            SubLObject var181 = (SubLObject)module0686.NIL;
            var181 = var180.first();
            while (module0686.NIL != var180) {
                final SubLObject var182 = conses_high.member(var181, var179, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                if (module0686.NIL != var174) {
                    module0642.f39068((SubLObject)module0686.$ic310$, module0656.f39842(var181), var182, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39032((SubLObject)module0686.TWO_INTEGER);
                }
                if (module0686.NIL != var174 || module0686.NIL != var182) {
                    module0656.f39804(var181, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39026((SubLObject)module0686.UNPROVIDED);
                }
                var180 = var180.rest();
                var181 = var180.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var178, var175);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0686.UNPROVIDED);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42107(SubLObject var174) {
        if (var174 == module0686.UNPROVIDED) {
            var174 = (SubLObject)module0686.T;
        }
        final SubLThread var175 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)module0686.$ic275$);
        module0016.f920((SubLObject)module0686.$ic311$, (SubLObject)module0686.$ic287$, (SubLObject)module0686.$ic288$);
        final SubLObject var176 = (SubLObject)module0686.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0686.NIL != var176) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var176);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var177 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var175);
            module0683.f41676((SubLObject)module0686.$ic312$, (SubLObject)module0686.$ic313$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var177, var175);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)module0686.$ic311$, (SubLObject)module0686.$ic297$, (SubLObject)module0686.$ic292$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.$ic311$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var178 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var175);
            final SubLObject var179 = f42048(f42082());
            if (module0686.NIL != var179) {
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020((SubLObject)module0686.ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(module0015.$g353$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020((SubLObject)module0686.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(module0015.$g354$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020((SubLObject)module0686.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_186 = module0015.$g533$.currentBinding(var175);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var175);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_187 = module0015.$g533$.currentBinding(var175);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var175);
                        if (module0686.NIL != var174) {
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic314$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_188 = module0015.$g533$.currentBinding(var175);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var175);
                                module0642.f39021((SubLObject)module0686.$ic315$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_188, var175);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0686.$ic314$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                        final SubLObject var5_189 = module0015.$g533$.currentBinding(var175);
                        try {
                            module0015.$g533$.bind((SubLObject)module0686.T, var175);
                            module0642.f39021((SubLObject)module0686.$ic316$);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_189, var175);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var5_187, var175);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)module0686.UNPROVIDED);
                    SubLObject var180 = var179;
                    SubLObject var181 = (SubLObject)module0686.NIL;
                    var181 = var180.first();
                    while (module0686.NIL != var180) {
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                        final SubLObject var5_190 = module0015.$g533$.currentBinding(var175);
                        try {
                            module0015.$g533$.bind((SubLObject)module0686.T, var175);
                            if (module0686.NIL != var174) {
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0686.$ic314$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_191 = module0015.$g533$.currentBinding(var175);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var175);
                                    module0642.f39068((SubLObject)module0686.$ic317$, module0656.f39842(var181), (SubLObject)module0686.T, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_191, var175);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic314$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_192 = module0015.$g533$.currentBinding(var175);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var175);
                                module0656.f39804(var181, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_192, var175);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_190, var175);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0686.UNPROVIDED);
                        var180 = var180.rest();
                        var181 = var180.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var5_186, var175);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
            }
            if (module0686.NIL != var174) {
                module0642.f39026((SubLObject)module0686.UNPROVIDED);
                module0666.f40467((SubLObject)module0686.$ic318$, (SubLObject)module0686.$ic44$, module0686.$ic319$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                module0642.f39032((SubLObject)module0686.UNPROVIDED);
                module0642.f39021((SubLObject)module0686.$ic320$);
                module0642.f39032((SubLObject)module0686.UNPROVIDED);
                module0642.f39075((SubLObject)module0686.$ic318$, (SubLObject)((module0686.NIL != var179) ? module0686.NIL : module0574.f35152()), (SubLObject)module0686.UNPROVIDED);
            }
        }
        finally {
            module0015.$g533$.rebind(var178, var175);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0686.UNPROVIDED);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42108(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0684.f41953(var6);
        var7.resetMultipleValues();
        final SubLObject var9 = module0684.f41954(var6);
        final SubLObject var10 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (module0686.NIL != var10) {
            return module0656.f39789((SubLObject)module0686.$ic321$, var10, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var11 = module0684.f41955(var6);
        final SubLObject var12 = var7.secondMultipleValue();
        final SubLObject var13 = var7.thirdMultipleValue();
        var7.resetMultipleValues();
        if (module0686.NIL != var12) {
            return module0656.f39789((SubLObject)module0686.$ic321$, var13, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var14 = module0683.f41792(var6, (SubLObject)module0686.NIL, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var15 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (module0686.NIL != var15) {
            return module0656.f39789((SubLObject)module0686.$ic321$, var15, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var16 = module0657.f40003(var6, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var17 = var7.secondMultipleValue();
        final SubLObject var18 = var7.thirdMultipleValue();
        var7.resetMultipleValues();
        if (module0686.NIL != var17) {
            module0657.f40013(var17, var18);
            return (SubLObject)module0686.NIL;
        }
        var7.resetMultipleValues();
        final SubLObject var19 = module0657.f40022(var6, (SubLObject)module0686.$ic322$);
        final SubLObject var20 = var7.secondMultipleValue();
        final SubLObject var21 = var7.thirdMultipleValue();
        var7.resetMultipleValues();
        if (module0686.NIL != var20) {
            return module0657.f40031(var20, var21, (SubLObject)module0686.UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var22 = module0657.f40022(var6, (SubLObject)module0686.$ic323$);
        final SubLObject var23 = var7.secondMultipleValue();
        final SubLObject var24 = var7.thirdMultipleValue();
        var7.resetMultipleValues();
        if (module0686.NIL != var23) {
            return module0657.f40031(var23, var24, (SubLObject)module0686.$ic324$);
        }
        var7.resetMultipleValues();
        final SubLObject var25 = f42109(var6);
        final SubLObject var26 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (module0686.NIL != var26) {
            return module0656.f39789((SubLObject)module0686.$ic321$, var26, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var27 = f42110(var6);
        final SubLObject var28 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (module0686.NIL != var28) {
            return module0656.f39789((SubLObject)module0686.$ic321$, var28, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var29 = f42111(var6);
        final SubLObject var30 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (module0686.NIL != var30) {
            return module0656.f39789((SubLObject)module0686.$ic321$, var30, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var31 = module0684.f41956(var6);
        final SubLObject var32 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (module0686.NIL != var32) {
            return module0656.f39789((SubLObject)module0686.$ic321$, var32, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        f42052(f42082(), var9);
        f42055(f42082(), var11);
        f42059(f42082(), var25);
        f42060(f42082(), var27);
        f42061(f42082(), var29);
        module0682.f41651(module0682.f41665(), var8);
        module0682.f41645(module0682.f41665(), var11);
        module0682.f41652(module0682.f41665(), var14);
        module0682.f41648(module0682.f41665(), (SubLObject)ConsesLow.list(var16));
        module0682.f41647(module0682.f41665(), (SubLObject)ConsesLow.list(var19));
        module0682.f41653(module0682.f41665(), var22);
        module0682.f41650(module0682.f41665(), var31);
        f42054(f42082(), module0682.f41665());
        module0682.f41644(module0682.f41665(), f42082());
        final SubLObject var33 = f42038(f42082());
        final SubLObject var34 = (SubLObject)((module0686.NIL != module0128.f8449(var33)) ? module0166.f10743(var33) : module0686.NIL);
        if (module0686.NIL != module0126.f8389(var9) && module0686.NIL != module0126.f8389(var34) && !var9.equal(var34)) {
            f42051(f42082(), (SubLObject)module0686.NIL);
        }
        final SubLObject var35 = module0682.f41632(module0682.f41665());
        if (module0686.NIL != module0369.f25275(var35) && module0369.f25423(var35).equal(var19)) {
            var7.resetMultipleValues();
            final SubLObject var36 = module0685.f41988(var35);
            final SubLObject var37 = var7.secondMultipleValue();
            final SubLObject var38 = var7.thirdMultipleValue();
            var7.resetMultipleValues();
            SubLObject var39 = var36;
            SubLObject var40 = (SubLObject)module0686.NIL;
            var40 = var39.first();
            while (module0686.NIL != var39) {
                final SubLObject var41 = module0233.f15414(module0369.f25687(var40));
                if (module0686.NIL == f42095(f42082(), var41)) {
                    f42070(var41, f42082(), (SubLObject)module0686.UNPROVIDED);
                }
                var39 = var39.rest();
                var40 = var39.first();
            }
        }
        f42112(f42082());
        return f42113(f42082());
    }
    
    public static SubLObject f42112(final SubLObject var125) {
        final SubLObject var126 = f42041(var125);
        final SubLObject var127 = module0682.f41660(var126);
        final SubLObject var128 = (module0686.NIL != module0202.f12597(var127)) ? module0202.f12966(var127, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED) : module0202.f12911(var127, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var130;
        final SubLObject var129 = var130 = f42044(var125);
        if (module0686.NIL == module0065.f4772(var130, (SubLObject)module0686.$ic215$)) {
            final SubLObject var144_224 = var130;
            if (module0686.NIL == module0065.f4775(var144_224, (SubLObject)module0686.$ic215$)) {
                final SubLObject var131 = module0065.f4740(var144_224);
                final SubLObject var132 = (SubLObject)module0686.NIL;
                SubLObject var133;
                SubLObject var134;
                SubLObject var135;
                SubLObject var136;
                for (var133 = Sequences.length(var131), var134 = (SubLObject)module0686.NIL, var134 = (SubLObject)module0686.ZERO_INTEGER; var134.numL(var133); var134 = Numbers.add(var134, (SubLObject)module0686.ONE_INTEGER)) {
                    var135 = ((module0686.NIL != var132) ? Numbers.subtract(var133, var134, (SubLObject)module0686.ONE_INTEGER) : var134);
                    var136 = Vectors.aref(var131, var135);
                    if (module0686.NIL == module0065.f4749(var136) || module0686.NIL == module0065.f4773((SubLObject)module0686.$ic215$)) {
                        if (module0686.NIL != module0065.f4749(var136)) {
                            var136 = (SubLObject)module0686.$ic215$;
                        }
                        if (module0686.NIL == module0035.f2201(module0233.f15421(f42080(var136)), var128, (SubLObject)module0686.UNPROVIDED)) {
                            f42096(var125, var135);
                        }
                    }
                }
            }
            final SubLObject var151_225 = var130;
            if (module0686.NIL == module0065.f4777(var151_225)) {
                final SubLObject var137 = module0065.f4738(var151_225);
                SubLObject var138 = (SubLObject)module0686.NIL;
                SubLObject var139 = (SubLObject)module0686.NIL;
                final Iterator var140 = Hashtables.getEntrySetIterator(var137);
                try {
                    while (Hashtables.iteratorHasNext(var140)) {
                        final Map.Entry var141 = Hashtables.iteratorNextEntry(var140);
                        var138 = Hashtables.getEntryKey(var141);
                        var139 = Hashtables.getEntryValue(var141);
                        if (module0686.NIL == module0035.f2201(module0233.f15421(f42080(var139)), var128, (SubLObject)module0686.UNPROVIDED)) {
                            f42096(var125, var138);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var140);
                }
            }
        }
        return var125;
    }
    
    public static SubLObject f42109(final SubLObject var6) {
        final SubLObject var7 = module0642.f39109((SubLObject)module0686.$ic299$, var6);
        SubLObject var8 = module0642.f39104((SubLObject)module0686.$ic301$, var6);
        final SubLObject var9 = module0656.f39983((SubLObject)module0686.$ic303$, var6);
        SubLObject var10 = (SubLObject)module0686.NIL;
        SubLObject var11 = (SubLObject)module0686.NIL;
        SubLObject var12 = (SubLObject)module0686.NIL;
        if (module0686.NIL != module0038.f2610(var8)) {
            var8 = (SubLObject)module0686.NIL;
        }
        if (module0686.NIL != module0126.f8389(var8)) {
            var10 = module0166.f10737(var8);
        }
        SubLObject var13 = var7;
        SubLObject var14 = (SubLObject)module0686.NIL;
        var14 = var13.first();
        while (module0686.NIL != var13) {
            if (module0686.NIL == module0038.f2610(var14)) {
                final SubLObject var15 = module0656.f39957(var14, (SubLObject)module0686.UNPROVIDED);
                if (module0686.NIL == module0633.f38718(var15, (SubLObject)module0686.UNPROVIDED)) {
                    var12 = PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic326$, var14);
                }
                if (module0686.NIL == var12) {
                    var11 = (SubLObject)ConsesLow.cons(var15, var11);
                }
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        if (module0686.NIL != var10 && module0686.NIL != module0633.f38718(var10, (SubLObject)module0686.UNPROVIDED)) {
            var11 = (SubLObject)ConsesLow.cons(var10, var11);
        }
        else if (module0686.NIL != var8) {
            var12 = PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic327$, var8);
        }
        if (module0686.NIL == module0656.f39984(var9)) {
            if (module0686.NIL != module0633.f38718(var9, (SubLObject)module0686.UNPROVIDED)) {
                var11 = (SubLObject)ConsesLow.cons(var9, var11);
            }
            else {
                var12 = PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic328$, var9);
            }
        }
        return Values.values(var11, var12);
    }
    
    public static SubLObject f42110(final SubLObject var6) {
        final SubLObject var7 = module0642.f39109((SubLObject)module0686.$ic310$, var6);
        SubLObject var8 = (SubLObject)module0686.NIL;
        SubLObject var9 = (SubLObject)module0686.NIL;
        SubLObject var10 = var7;
        SubLObject var11 = (SubLObject)module0686.NIL;
        var11 = var10.first();
        while (module0686.NIL != var10) {
            if (module0686.NIL == module0038.f2610(var11)) {
                final SubLObject var12 = module0656.f39957(var11, (SubLObject)module0686.UNPROVIDED);
                if (module0686.NIL == module0631.f38698(var12)) {
                    var9 = PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic329$, var11);
                }
                if (module0686.NIL == var9) {
                    var8 = (SubLObject)ConsesLow.cons(var12, var8);
                }
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return Values.values(var8, var9);
    }
    
    public static SubLObject f42111(final SubLObject var6) {
        final SubLObject var7 = module0642.f39109((SubLObject)module0686.$ic317$, var6);
        final SubLObject var8 = module0642.f39104((SubLObject)module0686.$ic318$, var6);
        final SubLObject var9 = (SubLObject)((module0686.NIL != module0126.f8389(var8)) ? module0166.f10737(var8) : module0686.NIL);
        SubLObject var10 = (SubLObject)module0686.NIL;
        SubLObject var11 = (SubLObject)module0686.NIL;
        SubLObject var12 = var7;
        SubLObject var13 = (SubLObject)module0686.NIL;
        var13 = var12.first();
        while (module0686.NIL != var12) {
            if (module0686.NIL == module0038.f2610(var13)) {
                final SubLObject var14 = module0656.f39957(var13, (SubLObject)module0686.UNPROVIDED);
                if (module0686.NIL == module0226.f14809(var14)) {
                    var11 = PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic330$, var13);
                }
                if (module0686.NIL == var11) {
                    var10 = (SubLObject)ConsesLow.cons(var14, var10);
                }
            }
            var12 = var12.rest();
            var13 = var12.first();
        }
        if (module0686.NIL != module0226.f14809(var9)) {
            var10 = (SubLObject)ConsesLow.cons(var9, var10);
        }
        else if (module0686.NIL == var10) {
            var11 = PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic331$, var8);
        }
        return Values.values(var10, var11);
    }
    
    public static SubLObject f42114() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0686.$g5393$.getDynamicValue(var3).equal((SubLObject)module0686.$ic333$)) {
            module0686.$g5393$.setDynamicValue((SubLObject)module0686.$ic26$, var3);
        }
        else {
            module0686.$g5393$.setDynamicValue((SubLObject)module0686.$ic333$, var3);
        }
        return module0686.$g5393$.getDynamicValue(var3);
    }
    
    public static SubLObject f42113(final SubLObject var125) {
        final SubLThread var126 = SubLProcess.currentSubLThread();
        final SubLObject var127 = f42041(var125);
        final SubLObject var128 = f42072(var125);
        final SubLObject var129 = f42074(var125);
        final SubLObject var130 = f42075(var125);
        final SubLObject var131 = f42076(var125);
        final SubLObject var132 = f42077(var125);
        final SubLObject var133 = conses_high.getf(f42050(var125), (SubLObject)module0686.$ic203$, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var134 = conses_high.getf(f42050(var125), (SubLObject)module0686.$ic204$, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var135 = conses_high.getf(f42050(var125), (SubLObject)module0686.$ic205$, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var136 = (SubLObject)module0686.$ic334$;
        final SubLObject var137 = module0682.f41660(var127);
        final SubLObject var138 = module0682.f41662(var127);
        final SubLObject var139 = (module0686.NIL != module0202.f12597(var137)) ? module0202.f12966(var137, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED) : module0202.f12911(var137, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var140 = Types.sublisp_null(var139);
        final SubLObject var141 = var136;
        final SubLObject var142 = module0015.$g538$.currentBinding(var126);
        try {
            module0015.$g538$.bind((module0686.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var126))) ? module0015.$g538$.getDynamicValue(var126) : module0057.f4173((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED), var126);
            module0642.f39020((SubLObject)module0686.$ic19$);
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var126), module0655.$g5142$.getDynamicValue(var126));
            final SubLObject var143 = module0014.f672((SubLObject)module0686.$ic20$);
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            if (module0686.NIL != var143) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(var143);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic22$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            if (module0686.NIL != var141) {
                module0642.f39029((SubLObject)module0686.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var141);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0016.f941();
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0016.f892();
            module0016.f895();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_247 = module0015.$g535$.currentBinding(var126);
            try {
                module0015.$g535$.bind((SubLObject)module0686.T, var126);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0686.NIL != module0015.$g132$.getDynamicValue(var126)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var126)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020((SubLObject)module0686.$ic122$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_248 = module0015.$g533$.currentBinding(var126);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var126);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020((SubLObject)module0686.$ic123$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_249 = module0015.$g533$.currentBinding(var126);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var126);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020((SubLObject)module0686.$ic124$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020((SubLObject)module0686.$ic125$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39019((SubLObject)module0686.$ic23$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020((SubLObject)module0686.$ic335$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_249, var126);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    module0644.f39197();
                    final SubLObject var144 = module0656.f39832((SubLObject)module0686.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var126));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020((SubLObject)module0686.$ic40$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    if (module0686.NIL != var144) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(var144);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_250 = module0015.$g533$.currentBinding(var126);
                    final SubLObject var145 = module0015.$g541$.currentBinding(var126);
                    final SubLObject var146 = module0015.$g539$.currentBinding(var126);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var126);
                        module0015.$g541$.bind((SubLObject)module0686.T, var126);
                        module0015.$g539$.bind(module0015.f797(), var126);
                        module0642.f39069((SubLObject)module0686.$ic336$, (SubLObject)module0686.T, (SubLObject)module0686.UNPROVIDED);
                        final SubLObject var147 = (SubLObject)module0686.FIVE_INTEGER;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (module0686.NIL != var147) {
                            module0642.f39020(module0015.$g221$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(var147);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                        final SubLObject var5_251 = module0015.$g533$.currentBinding(var126);
                        try {
                            module0015.$g533$.bind((SubLObject)module0686.T, var126);
                            module0683.f41676(var136, (SubLObject)module0686.$ic337$, (SubLObject)module0686.$ic334$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_251, var126);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020((SubLObject)module0686.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020((SubLObject)module0686.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                        final SubLObject var5_252 = module0015.$g533$.currentBinding(var126);
                        try {
                            module0015.$g533$.bind((SubLObject)module0686.T, var126);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_253 = module0015.$g533$.currentBinding(var126);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0686.$ic338$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_254 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                    module0642.f39019((SubLObject)module0686.$ic339$);
                                    module0642.f39075((SubLObject)module0686.$ic340$, var133, (SubLObject)module0686.FIVE_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_254, var126);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020((SubLObject)module0686.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_255 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                    module0642.f39019((SubLObject)module0686.$ic341$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_255, var126);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var5_253, var126);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_256 = module0015.$g533$.currentBinding(var126);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0686.$ic338$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_257 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                    module0642.f39019((SubLObject)module0686.$ic342$);
                                    module0642.f39075((SubLObject)module0686.$ic343$, var134, (SubLObject)module0686.FIVE_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_257, var126);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020((SubLObject)module0686.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_258 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                    module0642.f39019((SubLObject)module0686.$ic341$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_258, var126);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var5_256, var126);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_259 = module0015.$g533$.currentBinding(var126);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0686.$ic338$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_260 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                    module0642.f39019((SubLObject)module0686.$ic344$);
                                    module0642.f39075((SubLObject)module0686.$ic345$, var135, (SubLObject)module0686.FIVE_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_260, var126);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020((SubLObject)module0686.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_261 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                    module0642.f39019((SubLObject)module0686.$ic341$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_261, var126);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var5_259, var126);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0686.UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_262 = module0015.$g533$.currentBinding(var126);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0686.$ic338$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_263 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                    module0642.f39072((SubLObject)module0686.$ic346$, (SubLObject)module0686.$ic347$, var132, (SubLObject)module0686.UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_263, var126);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020((SubLObject)module0686.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_264 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                    module0642.f39019((SubLObject)module0686.$ic348$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_264, var126);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var5_262, var126);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0686.UNPROVIDED);
                            if (module0686.NIL != var140) {
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_265 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0686.$ic338$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                    final SubLObject var5_266 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                        module0642.f39072((SubLObject)module0686.$ic346$, (SubLObject)module0686.$ic349$, (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(var128).numE((SubLObject)module0686.ONE_INTEGER) && module0686.NIL == module0233.f15422(var128.first())), (SubLObject)module0686.UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_266, var126);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                    final SubLObject var5_267 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                        module0642.f39019((SubLObject)module0686.$ic350$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_267, var126);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_265, var126);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)module0686.UNPROVIDED);
                            }
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var5_268 = module0015.$g533$.currentBinding(var126);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0686.$ic338$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_269 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                    module0642.f39072((SubLObject)module0686.$ic346$, (SubLObject)module0686.$ic351$, (SubLObject)SubLObjectFactory.makeBoolean(module0686.NIL == var128 && f42043(var125) == module0686.$ic207$), (SubLObject)module0686.UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_269, var126);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020((SubLObject)module0686.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_270 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                    if (module0686.NIL != var139) {
                                        module0642.f39019((SubLObject)module0686.$ic352$);
                                    }
                                    else {
                                        module0642.f39019((SubLObject)module0686.$ic353$);
                                    }
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_270, var126);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var5_268, var126);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0686.UNPROVIDED);
                            if (module0686.NIL == var140) {
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_271 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0686.$ic338$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                    final SubLObject var5_272 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                        module0642.f39072((SubLObject)module0686.$ic346$, (SubLObject)module0686.$ic354$, var128, (SubLObject)module0686.UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_272, var126);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g371$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0686.TWO_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                    final SubLObject var5_273 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                        module0642.f39019((SubLObject)module0686.$ic355$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_273, var126);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_271, var126);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)module0686.UNPROVIDED);
                                final SubLObject var148 = (SubLObject)SubLObjectFactory.makeBoolean(module0686.NIL != var129 || module0686.NIL != var130);
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                final SubLObject var5_274 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0686.$ic338$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                    final SubLObject var5_275 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                        module0642.f39020(module0015.$g295$.getGlobalValue());
                                        module0642.f39020(module0015.$g305$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020(module0015.$g314$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020(module0015.$g302$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0686.$ic346$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020(module0015.$g307$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39019((SubLObject)module0686.$ic356$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        if (module0686.NIL != var148) {
                                            module0642.f39046(module0015.$g296$.getGlobalValue());
                                        }
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_275, var126);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g371$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0686.TWO_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                    final SubLObject var5_276 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                        module0642.f39019((SubLObject)module0686.$ic357$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_276, var126);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_274, var126);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)module0686.UNPROVIDED);
                                if (module0686.NIL != var128 || module0686.NIL != var129 || module0686.NIL != var130 || module0686.NIL != var131) {
                                    final SubLObject var149 = Numbers.add((SubLObject)module0686.THREE_INTEGER, Sequences.length(var139));
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                    final SubLObject var5_277 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        if (module0686.NIL != var149) {
                                            module0642.f39020(module0015.$g371$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                            module0642.f39020(var149);
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        }
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                        final SubLObject var5_278 = module0015.$g533$.currentBinding(var126);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                            module0642.f39021((SubLObject)module0686.$ic358$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_278, var126);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_277, var126);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)module0686.UNPROVIDED);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                    final SubLObject var5_279 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0686.$ic359$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                        final SubLObject var5_280 = module0015.$g533$.currentBinding(var126);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                            module0642.f39021((SubLObject)module0686.$ic360$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_280, var126);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0686.$ic359$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                        final SubLObject var5_281 = module0015.$g533$.currentBinding(var126);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                            module0642.f39021((SubLObject)module0686.$ic361$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_281, var126);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0686.$ic359$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                                        final SubLObject var5_282 = module0015.$g533$.currentBinding(var126);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0686.T, var126);
                                            module0642.f39021((SubLObject)module0686.$ic362$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_282, var126);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0685.f41990(var139, (SubLObject)module0686.NIL, (SubLObject)module0686.T);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_279, var126);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)module0686.UNPROVIDED);
                                    module0686.$g5393$.setDynamicValue((SubLObject)module0686.$ic333$, var126);
                                    f42115(var125, var139);
                                    f42116(var125, var139);
                                    f42117(var125, var139);
                                }
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var5_252, var126);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        if (module0686.NIL != var139) {
                            module0642.f39026((SubLObject)module0686.UNPROVIDED);
                            f42118(var137, var138, var139);
                        }
                        module0642.f39026((SubLObject)module0686.TWO_INTEGER);
                        module0683.f41678((SubLObject)module0686.$ic363$, (SubLObject)module0686.$ic364$, (SubLObject)module0686.$ic365$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                        if (module0686.NIL != f42038(f42082())) {
                            module0683.f41678((SubLObject)module0686.$ic366$, (SubLObject)module0686.$ic367$, (SubLObject)module0686.$ic368$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                        }
                        module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                        module0684.f41946(module0682.f41665());
                        module0015.f799(module0015.$g539$.getDynamicValue(var126));
                    }
                    finally {
                        module0015.$g539$.rebind(var146, var126);
                        module0015.$g541$.rebind(var145, var126);
                        module0015.$g533$.rebind(var5_250, var126);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39026((SubLObject)module0686.UNPROVIDED);
                    final SubLObject var150 = (SubLObject)module0686.FOUR_INTEGER;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (module0686.NIL != var150) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(var150);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_283 = module0015.$g533$.currentBinding(var126);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var126);
                        module0683.f41676((SubLObject)module0686.$ic369$, (SubLObject)module0686.$ic370$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_283, var126);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39026((SubLObject)module0686.UNPROVIDED);
                    f42104((SubLObject)module0686.NIL);
                    module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    module0684.f41948();
                    module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    module0684.f41949();
                    module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    module0684.f41950();
                    module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    module0684.f41945((SubLObject)module0686.NIL);
                    module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    f42105((SubLObject)module0686.NIL);
                    module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    f42106((SubLObject)module0686.NIL);
                    module0642.f39051((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    f42107((SubLObject)module0686.NIL);
                    module0642.f39029((SubLObject)module0686.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_248, var126);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0686.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5_247, var126);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var142, var126);
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42118(final SubLObject var203, final SubLObject var200, final SubLObject var244) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        module0683.f41676((SubLObject)module0686.$ic371$, (SubLObject)module0686.$ic372$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        module0642.f39026((SubLObject)module0686.TWO_INTEGER);
        module0642.f39021((SubLObject)module0686.$ic373$);
        module0642.f39032((SubLObject)module0686.ONE_INTEGER);
        module0642.f39072((SubLObject)module0686.$ic284$, (SubLObject)module0686.$ic374$, (SubLObject)module0686.NIL, (SubLObject)module0686.UNPROVIDED);
        module0642.f39032((SubLObject)module0686.FOUR_INTEGER);
        module0642.f39021((SubLObject)module0686.$ic375$);
        module0642.f39032((SubLObject)module0686.ONE_INTEGER);
        module0642.f39072((SubLObject)module0686.$ic284$, (SubLObject)module0686.$ic376$, (SubLObject)module0686.NIL, (SubLObject)module0686.UNPROVIDED);
        module0642.f39032((SubLObject)module0686.FOUR_INTEGER);
        module0683.f41678((SubLObject)module0686.$ic377$, (SubLObject)module0686.$ic378$, (SubLObject)module0686.$ic379$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var246 = module0307.f20765(var203, var200, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var247 = module0015.$g533$.currentBinding(var245);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var245);
            SubLObject var248;
            SubLObject var249;
            SubLObject var250;
            SubLObject var251;
            SubLObject var252;
            SubLObject var253;
            SubLObject var5_290;
            SubLObject var5_291;
            SubLObject var5_292;
            for (var248 = Sequences.length(var244), var249 = (SubLObject)module0686.NIL, var249 = (SubLObject)module0686.ZERO_INTEGER; var249.numL(var248); var249 = Numbers.add(var249, (SubLObject)module0686.ONE_INTEGER)) {
                var250 = PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic380$, var249);
                var251 = Sequences.elt(var244, var249);
                var252 = module0256.f16529(module0067.f4884(var246, var251, (SubLObject)module0686.UNPROVIDED).first(), var200, (SubLObject)module0686.UNPROVIDED);
                var253 = (SubLObject)((module0686.NIL != module0035.f1997(var252)) ? var252.first() : module0686.NIL);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                var5_290 = module0015.$g533$.currentBinding(var245);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var245);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0686.$ic381$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    var5_291 = module0015.$g533$.currentBinding(var245);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var245);
                        module0642.f39021(var251);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_291, var245);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0686.$ic381$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    var5_292 = module0015.$g533$.currentBinding(var245);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var245);
                        module0657.f40033((SubLObject)module0686.NIL, (SubLObject)ConsesLow.list((SubLObject)module0686.$ic382$, var250, (SubLObject)module0686.$ic383$, var253));
                    }
                    finally {
                        module0015.$g533$.rebind(var5_292, var245);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_290, var245);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0686.UNPROVIDED);
            }
        }
        finally {
            module0015.$g533$.rebind(var247, var245);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42119(final SubLObject var150) {
        final SubLThread var151 = SubLProcess.currentSubLThread();
        final SubLObject var152 = f42086(var150);
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        SubLObject var153 = module0015.$g533$.currentBinding(var151);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var151);
            module0642.f39072(PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic384$, var152), (SubLObject)module0686.$ic385$, Equality.eq(f42079(var150), (SubLObject)module0686.$ic208$), (SubLObject)module0686.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var153, var151);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        var153 = module0015.$g533$.currentBinding(var151);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var151);
            module0642.f39072(PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic384$, var152), (SubLObject)module0686.$ic386$, Equality.eq(f42079(var150), (SubLObject)module0686.$ic212$), (SubLObject)module0686.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var153, var151);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        var153 = module0015.$g533$.currentBinding(var151);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var151);
            module0642.f39072(PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic384$, var152), (SubLObject)module0686.$ic387$, Equality.eq(f42079(var150), (SubLObject)module0686.$ic214$), (SubLObject)module0686.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var153, var151);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42115(final SubLObject var125, final SubLObject var244) {
        return f42120(var125, var244, (SubLObject)module0686.$ic208$);
    }
    
    public static SubLObject f42116(final SubLObject var125, final SubLObject var244) {
        return f42120(var125, var244, (SubLObject)module0686.$ic212$);
    }
    
    public static SubLObject f42117(final SubLObject var125, final SubLObject var244) {
        return f42120(var125, var244, (SubLObject)module0686.$ic214$);
    }
    
    public static SubLObject f42120(final SubLObject var125, final SubLObject var244, final SubLObject var41) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        final SubLObject var247;
        final SubLObject var246 = var247 = f42044(var125);
        if (module0686.NIL == module0065.f4772(var247, (SubLObject)module0686.$ic215$)) {
            final SubLObject var144_293 = var247;
            if (module0686.NIL == module0065.f4775(var144_293, (SubLObject)module0686.$ic215$)) {
                final SubLObject var248 = module0065.f4740(var144_293);
                final SubLObject var249 = (SubLObject)module0686.NIL;
                SubLObject var250;
                SubLObject var251;
                SubLObject var252;
                SubLObject var253;
                SubLObject var254;
                SubLObject var255;
                for (var250 = Sequences.length(var248), var251 = (SubLObject)module0686.NIL, var251 = (SubLObject)module0686.ZERO_INTEGER; var251.numL(var250); var251 = Numbers.add(var251, (SubLObject)module0686.ONE_INTEGER)) {
                    var252 = ((module0686.NIL != var249) ? Numbers.subtract(var250, var251, (SubLObject)module0686.ONE_INTEGER) : var251);
                    var253 = Vectors.aref(var248, var252);
                    if (module0686.NIL == module0065.f4749(var253) || module0686.NIL == module0065.f4773((SubLObject)module0686.$ic215$)) {
                        if (module0686.NIL != module0065.f4749(var253)) {
                            var253 = (SubLObject)module0686.$ic215$;
                        }
                        if (f42079(var253).eql(var41)) {
                            var254 = module0233.f15408(f42080(var253));
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            if (module0686.NIL != module0686.$g5393$.getDynamicValue(var245)) {
                                module0642.f39020(module0015.$g366$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020(module0686.$g5393$.getDynamicValue(var245));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            var255 = module0015.$g533$.currentBinding(var245);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var245);
                                f42119(var253);
                                module0685.f41997(var254, var244);
                            }
                            finally {
                                module0015.$g533$.rebind(var255, var245);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0686.UNPROVIDED);
                            f42114();
                        }
                    }
                }
            }
            final SubLObject var151_294 = var247;
            if (module0686.NIL == module0065.f4777(var151_294)) {
                final SubLObject var256 = module0065.f4738(var151_294);
                SubLObject var257 = (SubLObject)module0686.NIL;
                SubLObject var258 = (SubLObject)module0686.NIL;
                final Iterator var259 = Hashtables.getEntrySetIterator(var256);
                try {
                    while (Hashtables.iteratorHasNext(var259)) {
                        final Map.Entry var260 = Hashtables.iteratorNextEntry(var259);
                        var257 = Hashtables.getEntryKey(var260);
                        var258 = Hashtables.getEntryValue(var260);
                        if (f42079(var258).eql(var41)) {
                            final SubLObject var261 = module0233.f15408(f42080(var258));
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            if (module0686.NIL != module0686.$g5393$.getDynamicValue(var245)) {
                                module0642.f39020(module0015.$g366$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                                module0642.f39020(module0686.$g5393$.getDynamicValue(var245));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                            final SubLObject var262 = module0015.$g533$.currentBinding(var245);
                            try {
                                module0015.$g533$.bind((SubLObject)module0686.T, var245);
                                f42119(var258);
                                module0685.f41997(var261, var244);
                            }
                            finally {
                                module0015.$g533$.rebind(var262, var245);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0686.UNPROVIDED);
                            f42114();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var259);
                }
            }
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42121(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0682.f41660(module0682.f41665());
        final SubLObject var9 = module0684.f41957(var6, var8);
        final SubLObject var10 = f42122(var6);
        module0682.f41654(module0682.f41665(), var9);
        var7.resetMultipleValues();
        final SubLObject var11 = f42123(var6);
        final SubLObject var12 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (module0686.NIL == var11) {
            return module0656.f39789((SubLObject)module0686.$ic321$, var12, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var13 = f42124(var6);
        final SubLObject var14 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (module0686.NIL == var13) {
            return module0656.f39789((SubLObject)module0686.$ic321$, var14, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        final SubLObject var15 = var10;
        if (var15.eql((SubLObject)module0686.$ic388$)) {
            f42113(f42082());
            return (SubLObject)module0686.NIL;
        }
        if (var15.eql((SubLObject)module0686.$ic389$)) {
            final SubLObject var16 = f42125(f42082());
            if (module0686.NIL != var16) {
                module0682.f41664();
                f42081();
            }
            return var16;
        }
        if (var15.eql((SubLObject)module0686.$ic390$)) {
            final SubLObject var16 = f42126(f42082());
            if (module0686.NIL != var16) {
                module0682.f41664();
                f42081();
            }
            return var16;
        }
        return module0656.f39789((SubLObject)module0686.$ic391$, var10, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
    }
    
    public static SubLObject f42122(final SubLObject var6) {
        if (module0686.NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)module0686.$ic379$, var6))) {
            return (SubLObject)module0686.$ic388$;
        }
        if (module0686.NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)module0686.$ic365$, var6))) {
            return (SubLObject)module0686.$ic389$;
        }
        if (module0686.NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)module0686.$ic368$, var6))) {
            return (SubLObject)module0686.$ic390$;
        }
        return (SubLObject)module0686.$ic393$;
    }
    
    public static SubLObject f42123(final SubLObject var6) {
        SubLObject var7 = module0642.f39104((SubLObject)module0686.$ic340$, var6);
        SubLObject var8 = module0642.f39104((SubLObject)module0686.$ic343$, var6);
        SubLObject var9 = module0642.f39104((SubLObject)module0686.$ic345$, var6);
        if (module0686.NIL != module0038.f2608(var7)) {
            f42068(f42082(), (SubLObject)module0686.$ic203$, (SubLObject)module0686.NIL);
        }
        else {
            var7 = reader.read_from_string_ignoring_errors(var7, (SubLObject)module0686.NIL, (SubLObject)module0686.$ic394$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
            if (!var7.isInteger()) {
                return Values.values((SubLObject)module0686.NIL, Sequences.cconcatenate(module0006.f203(var7), (SubLObject)module0686.$ic395$));
            }
            f42068(f42082(), (SubLObject)module0686.$ic203$, var7);
        }
        if (module0686.NIL != module0038.f2608(var8)) {
            f42068(f42082(), (SubLObject)module0686.$ic204$, (SubLObject)module0686.NIL);
        }
        else {
            var8 = reader.read_from_string_ignoring_errors(var8, (SubLObject)module0686.NIL, (SubLObject)module0686.$ic394$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
            if (!var8.isInteger()) {
                return Values.values((SubLObject)module0686.NIL, Sequences.cconcatenate(module0006.f203(var7), (SubLObject)module0686.$ic395$));
            }
            f42068(f42082(), (SubLObject)module0686.$ic204$, var8);
        }
        if (module0686.NIL != module0038.f2608(var9)) {
            f42068(f42082(), (SubLObject)module0686.$ic205$, (SubLObject)module0686.NIL);
        }
        else {
            var9 = reader.read_from_string_ignoring_errors(var9, (SubLObject)module0686.NIL, (SubLObject)module0686.$ic394$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
            if (!var9.isInteger()) {
                return Values.values((SubLObject)module0686.NIL, Sequences.cconcatenate(module0006.f203(var7), (SubLObject)module0686.$ic395$));
            }
            f42068(f42082(), (SubLObject)module0686.$ic205$, var9);
        }
        return Values.values((SubLObject)module0686.T, (SubLObject)module0686.NIL);
    }
    
    public static SubLObject f42124(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        var7.resetMultipleValues();
        final SubLObject var8 = f42127(var6);
        final SubLObject var9 = var7.secondMultipleValue();
        final SubLObject var10 = var7.thirdMultipleValue();
        final SubLObject var11 = var7.fourthMultipleValue();
        final SubLObject var12 = var7.fifthMultipleValue();
        var7.resetMultipleValues();
        if (module0686.NIL != var12) {
            return Values.values((SubLObject)module0686.NIL, var12);
        }
        final SubLObject var14;
        final SubLObject var13 = var14 = f42044(f42082());
        if (module0686.NIL == module0065.f4772(var14, (SubLObject)module0686.$ic215$)) {
            final SubLObject var144_306 = var14;
            if (module0686.NIL == module0065.f4775(var144_306, (SubLObject)module0686.$ic215$)) {
                final SubLObject var15 = module0065.f4740(var144_306);
                final SubLObject var16 = (SubLObject)module0686.NIL;
                SubLObject var17;
                SubLObject var18;
                SubLObject var19;
                SubLObject var20;
                for (var17 = Sequences.length(var15), var18 = (SubLObject)module0686.NIL, var18 = (SubLObject)module0686.ZERO_INTEGER; var18.numL(var17); var18 = Numbers.add(var18, (SubLObject)module0686.ONE_INTEGER)) {
                    var19 = ((module0686.NIL != var16) ? Numbers.subtract(var17, var18, (SubLObject)module0686.ONE_INTEGER) : var18);
                    var20 = Vectors.aref(var15, var19);
                    if (module0686.NIL == module0065.f4749(var20) || module0686.NIL == module0065.f4773((SubLObject)module0686.$ic215$)) {
                        if (module0686.NIL != module0065.f4749(var20)) {
                            var20 = (SubLObject)module0686.$ic215$;
                        }
                        f42097(var20, (SubLObject)module0686.$ic214$);
                    }
                }
            }
            final SubLObject var151_307 = var14;
            if (module0686.NIL == module0065.f4777(var151_307)) {
                final SubLObject var21 = module0065.f4738(var151_307);
                SubLObject var22 = (SubLObject)module0686.NIL;
                SubLObject var23 = (SubLObject)module0686.NIL;
                final Iterator var24 = Hashtables.getEntrySetIterator(var21);
                try {
                    while (Hashtables.iteratorHasNext(var24)) {
                        final Map.Entry var25 = Hashtables.iteratorNextEntry(var24);
                        var22 = Hashtables.getEntryKey(var25);
                        var23 = Hashtables.getEntryValue(var25);
                        f42097(var23, (SubLObject)module0686.$ic214$);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var24);
                }
            }
        }
        if (module0686.NIL != var11) {
            f42056(f42082(), (SubLObject)module0686.$ic206$);
        }
        else if (module0686.NIL != var8) {
            f42056(f42082(), (SubLObject)module0686.$ic207$);
            if (var8 != module0686.$ic61$) {
                SubLObject var26 = var8;
                SubLObject var27 = (SubLObject)module0686.NIL;
                var27 = var26.first();
                while (module0686.NIL != var26) {
                    f42097(var27, (SubLObject)module0686.$ic208$);
                    var26 = var26.rest();
                    var27 = var26.first();
                }
            }
        }
        else if (module0686.NIL != var9 || module0686.NIL != var10) {
            f42056(f42082(), (SubLObject)module0686.$ic209$);
            SubLObject var26 = var9;
            SubLObject var28 = (SubLObject)module0686.NIL;
            var28 = var26.first();
            while (module0686.NIL != var26) {
                f42097(var28, (SubLObject)module0686.$ic208$);
                var26 = var26.rest();
                var28 = var26.first();
            }
            var26 = var10;
            SubLObject var29 = (SubLObject)module0686.NIL;
            var29 = var26.first();
            while (module0686.NIL != var26) {
                f42097(var29, (SubLObject)module0686.$ic212$);
                var26 = var26.rest();
                var29 = var26.first();
            }
        }
        var7.resetMultipleValues();
        final SubLObject var30 = f42128(var6);
        final SubLObject var31 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (module0686.NIL == var30) {
            return Values.values((SubLObject)module0686.T, (SubLObject)module0686.NIL);
        }
        if (module0686.NIL != var31) {
            return Values.values((SubLObject)module0686.NIL, var31);
        }
        var7.resetMultipleValues();
        final SubLObject var32 = f42129(var6);
        final SubLObject var33 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (module0686.NIL != var33) {
            return Values.values((SubLObject)module0686.NIL, var33);
        }
        f42056(f42082(), var32);
        if (var32 == module0686.$ic206$) {
            return Values.values((SubLObject)module0686.T, (SubLObject)module0686.NIL);
        }
        final SubLObject var34 = f42041(f42082());
        final SubLObject var35 = module0682.f41660(var34);
        final SubLObject var36 = (module0686.NIL != module0202.f12597(var35)) ? module0202.f12966(var35, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED) : module0202.f12911(var35, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        SubLObject var37 = (SubLObject)module0686.NIL;
        SubLObject var38 = (SubLObject)module0686.NIL;
        SubLObject var39;
        SubLObject var40;
        SubLObject var41;
        SubLObject var42;
        for (var39 = Sequences.length(var36), var40 = (SubLObject)module0686.NIL, var40 = (SubLObject)module0686.ZERO_INTEGER; var40.numL(var39); var40 = Numbers.add(var40, (SubLObject)module0686.ONE_INTEGER)) {
            var41 = f42130(PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic380$, var40), var6);
            var42 = (SubLObject)((module0686.NIL != var41) ? module0233.f15418(Sequences.elt(var36, var40), var41) : module0686.NIL);
            if (module0686.NIL != module0233.f15358(var42)) {
                var37 = (SubLObject)ConsesLow.cons(var42, var37);
            }
        }
        if (module0686.NIL != module0035.f2004(var37, var36)) {
            var38 = module0233.f15415(var37);
            if (module0686.NIL == f42095(f42082(), var38)) {
                f42070(var38, f42082(), var30);
            }
        }
        return Values.values((SubLObject)module0686.T, (SubLObject)module0686.NIL);
    }
    
    public static SubLObject f42130(final SubLObject var316, final SubLObject var6) {
        return module0657.f40035(var6, (SubLObject)ConsesLow.listS((SubLObject)module0686.$ic396$, (SubLObject)module0686.T, (SubLObject)module0686.$ic382$, var316, (SubLObject)module0686.$ic397$));
    }
    
    public static SubLObject f42128(final SubLObject var6) {
        final SubLObject var7 = module0642.f39104((SubLObject)module0686.$ic284$, var6);
        final SubLObject var8 = (SubLObject)module0686.NIL;
        if (module0686.NIL != var8) {
            return (SubLObject)module0686.NIL;
        }
        if (var7.equal((SubLObject)module0686.$ic374$)) {
            return (SubLObject)module0686.$ic208$;
        }
        if (var7.equal((SubLObject)module0686.$ic376$)) {
            return (SubLObject)module0686.$ic212$;
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42129(final SubLObject var6) {
        final SubLObject var7 = module0642.f39104((SubLObject)module0686.$ic346$, var6);
        if (var7.equal((SubLObject)module0686.$ic347$)) {
            return Values.values((SubLObject)module0686.$ic206$, (SubLObject)module0686.NIL);
        }
        if (var7.equal((SubLObject)module0686.$ic351$)) {
            return Values.values((SubLObject)module0686.$ic207$, (SubLObject)module0686.NIL);
        }
        if (var7.equal((SubLObject)module0686.$ic349$)) {
            return Values.values((SubLObject)module0686.$ic207$, (SubLObject)module0686.NIL);
        }
        if (var7.equal((SubLObject)module0686.$ic354$)) {
            return Values.values((SubLObject)module0686.$ic207$, (SubLObject)module0686.NIL);
        }
        if (var7.equal((SubLObject)module0686.$ic356$)) {
            return Values.values((SubLObject)module0686.$ic209$, (SubLObject)module0686.NIL);
        }
        return Values.values((SubLObject)module0686.NIL, PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic398$, var7));
    }
    
    public static SubLObject f42131(final SubLObject var6) {
        final SubLObject var7 = module0642.f39104((SubLObject)module0686.$ic399$, var6);
        final SubLObject var8 = module0656.f39943(var7, (SubLObject)module0686.UNPROVIDED);
        SubLObject var9 = (SubLObject)module0686.NIL;
        if (module0686.NIL == module0633.f38716(var8, (SubLObject)module0686.UNPROVIDED)) {
            var9 = PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic400$, var7);
        }
        return Values.values(var8, var9);
    }
    
    public static SubLObject f42127(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = f42129(var6);
        SubLObject var9 = (SubLObject)module0686.NIL;
        SubLObject var10 = (SubLObject)module0686.NIL;
        SubLObject var11 = (SubLObject)module0686.NIL;
        SubLObject var12 = (SubLObject)module0686.NIL;
        SubLObject var13 = (SubLObject)module0686.NIL;
        final SubLObject var14 = var8;
        if (var14.eql((SubLObject)module0686.$ic207$)) {
            var7.resetMultipleValues();
            final SubLObject var15 = f42132(var6);
            final SubLObject var16 = var7.secondMultipleValue();
            var7.resetMultipleValues();
            var9 = var15;
            var13 = var16;
        }
        else if (var14.eql((SubLObject)module0686.$ic209$)) {
            var7.resetMultipleValues();
            final SubLObject var17 = f42133(var6);
            SubLObject var16 = var7.secondMultipleValue();
            var7.resetMultipleValues();
            var10 = var17;
            var13 = var16;
            var7.resetMultipleValues();
            final SubLObject var18 = f42134(var6);
            var16 = var7.secondMultipleValue();
            var7.resetMultipleValues();
            var11 = var18;
            var13 = var16;
        }
        else if (var14.eql((SubLObject)module0686.$ic206$)) {
            var12 = (SubLObject)module0686.T;
        }
        else {
            var13 = (SubLObject)module0686.$ic401$;
        }
        return Values.values(var9, var10, var11, var12, var13);
    }
    
    public static SubLObject f42132(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0642.f39104((SubLObject)module0686.$ic346$, var6);
        if (var8.equalp((SubLObject)module0686.$ic354$)) {
            var7.resetMultipleValues();
            final SubLObject var9 = f42135((SubLObject)module0686.$ic385$, var6);
            final SubLObject var10 = var7.secondMultipleValue();
            var7.resetMultipleValues();
            return Values.values(var9, var10);
        }
        if (var8.equalp((SubLObject)module0686.$ic349$)) {
            SubLObject var11 = f42095(f42082(), module0233.f15428());
            if (module0686.NIL == var11) {
                var11 = f42070(module0233.f15428(), f42082(), (SubLObject)module0686.$ic208$);
            }
            return Values.values((SubLObject)ConsesLow.list(var11), (SubLObject)module0686.NIL);
        }
        if (var8.equalp((SubLObject)module0686.$ic351$)) {
            return Values.values((SubLObject)module0686.$ic61$, (SubLObject)module0686.NIL);
        }
        return Values.values((SubLObject)module0686.NIL, (SubLObject)module0686.$ic402$);
    }
    
    public static SubLObject f42133(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        var7.resetMultipleValues();
        final SubLObject var8 = f42135((SubLObject)module0686.$ic385$, var6);
        final SubLObject var9 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        return Values.values(var8, var9);
    }
    
    public static SubLObject f42134(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        var7.resetMultipleValues();
        final SubLObject var8 = f42135((SubLObject)module0686.$ic386$, var6);
        final SubLObject var9 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        return Values.values(var8, var9);
    }
    
    public static SubLObject f42135(final SubLObject var314, final SubLObject var6) {
        final SubLObject var315 = f42044(f42082());
        SubLObject var316 = (SubLObject)module0686.NIL;
        SubLObject var317 = (SubLObject)module0686.NIL;
        final SubLObject var318 = var315;
        if (module0686.NIL == module0065.f4772(var318, (SubLObject)module0686.$ic215$)) {
            final SubLObject var144_328 = var318;
            if (module0686.NIL == module0065.f4775(var144_328, (SubLObject)module0686.$ic215$)) {
                final SubLObject var319 = module0065.f4740(var144_328);
                final SubLObject var320 = (SubLObject)module0686.NIL;
                SubLObject var321;
                SubLObject var322;
                SubLObject var323;
                SubLObject var324;
                SubLObject var325;
                for (var321 = Sequences.length(var319), var322 = (SubLObject)module0686.NIL, var322 = (SubLObject)module0686.ZERO_INTEGER; var322.numL(var321); var322 = Numbers.add(var322, (SubLObject)module0686.ONE_INTEGER)) {
                    var323 = ((module0686.NIL != var320) ? Numbers.subtract(var321, var322, (SubLObject)module0686.ONE_INTEGER) : var322);
                    var324 = Vectors.aref(var319, var323);
                    if (module0686.NIL == module0065.f4749(var324) || module0686.NIL == module0065.f4773((SubLObject)module0686.$ic215$)) {
                        if (module0686.NIL != module0065.f4749(var324)) {
                            var324 = (SubLObject)module0686.$ic215$;
                        }
                        var325 = module0642.f39104(PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic384$, var323), var6);
                        if (var325.equal(var314)) {
                            if (module0686.NIL == f42085(var324)) {
                                var316 = PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic403$, var323);
                            }
                            if (module0686.NIL == var316) {
                                var317 = (SubLObject)ConsesLow.cons(var324, var317);
                            }
                        }
                    }
                }
            }
            final SubLObject var151_329 = var318;
            if (module0686.NIL == module0065.f4777(var151_329)) {
                final SubLObject var326 = module0065.f4738(var151_329);
                SubLObject var327 = (SubLObject)module0686.NIL;
                SubLObject var328 = (SubLObject)module0686.NIL;
                final Iterator var329 = Hashtables.getEntrySetIterator(var326);
                try {
                    while (Hashtables.iteratorHasNext(var329)) {
                        final Map.Entry var330 = Hashtables.iteratorNextEntry(var329);
                        var327 = Hashtables.getEntryKey(var330);
                        var328 = Hashtables.getEntryValue(var330);
                        final SubLObject var331 = module0642.f39104(PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic384$, var327), var6);
                        if (var331.equal(var314)) {
                            if (module0686.NIL == f42085(var328)) {
                                var316 = PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic403$, var327);
                            }
                            if (module0686.NIL != var316) {
                                continue;
                            }
                            var317 = (SubLObject)ConsesLow.cons(var328, var317);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var329);
                }
            }
        }
        return Values.values(var317, var316);
    }
    
    public static SubLObject f42125(final SubLObject var125) {
        final SubLThread var126 = SubLProcess.currentSubLThread();
        if (module0686.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0686.$ic404$);
            return (SubLObject)module0686.NIL;
        }
        SubLObject var127 = (SubLObject)module0686.NIL;
        final SubLObject var128 = f42039(var125);
        final SubLObject var129 = f42042(var125);
        final SubLObject var130 = f42072(var125);
        final SubLObject var131 = f42074(var125);
        final SubLObject var132 = f42075(var125);
        final SubLObject var133 = f42077(var125);
        final SubLObject var134 = f42078(var125);
        final SubLObject var135 = conses_high.getf(f42050(var125), (SubLObject)module0686.$ic203$, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var136 = conses_high.getf(f42050(var125), (SubLObject)module0686.$ic204$, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var137 = conses_high.getf(f42050(var125), (SubLObject)module0686.$ic205$, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var138 = f42047(var125);
        final SubLObject var139 = f42048(var125);
        final SubLObject var140 = f42046(var125);
        final SubLObject var141 = f42041(var125);
        final SubLObject var142 = module0682.f41660(var141);
        final SubLObject var143 = module0682.f41639(var141);
        final SubLObject var144 = module0682.f41662(var141);
        final SubLObject var145 = module0682.f41638(var141);
        final SubLObject var146 = module0682.f41637(var141);
        final SubLObject var147 = module0682.f41636(var141);
        final SubLObject var148 = module0682.f41640(var141);
        if (module0686.NIL == module0126.f8389(var128)) {
            return module0656.f39789((SubLObject)module0686.$ic405$, var128, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        final SubLObject var149 = module0166.f10737(var128);
        SubLObject var150 = (SubLObject)module0686.NIL;
        SubLObject var151 = (SubLObject)module0686.NIL;
        if (module0686.NIL != var149) {
            return module0656.f39789((SubLObject)module0686.$ic406$, var128, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        final SubLObject var152 = module0126.f8393(var128, (SubLObject)module0686.NIL, (SubLObject)module0686.T, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL != var152) {
            return module0656.f39789((SubLObject)module0686.$ic407$, var152.first(), var128, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        var150 = module0673.f41078(var128);
        var151 = module0202.f12720(module0686.$ic408$, (SubLObject)ConsesLow.list(var150), (SubLObject)module0686.UNPROVIDED);
        f42136(var150, var151, var135, var136, var137, var130, var131, var132, var133, var134, var138, var139, var140, var129, var148);
        var151 = module0172.f10921(var151);
        module0423.f29533(var151, var142, var144, module0412.f28669(var145, var142), var129, var143, var148);
        module0423.f29554(var151, (SubLObject)module0686.NIL, var146, var147, var129);
        SubLObject var153 = (SubLObject)ConsesLow.list(var150, var151);
        SubLObject var154 = (SubLObject)module0686.NIL;
        var154 = var153.first();
        while (module0686.NIL != var153) {
            if (module0686.NIL != module0128.f8449(var154)) {
                module0677.f41359(var154);
            }
            else if (module0686.NIL != module0167.f10813(var154)) {
                module0677.f41360(var154);
            }
            var153 = var153.rest();
            var154 = var153.first();
        }
        var126.resetMultipleValues();
        final SubLObject var155 = module0633.f38736(var150);
        final SubLObject var156 = var126.secondMultipleValue();
        var126.resetMultipleValues();
        SubLObject var157 = (SubLObject)module0686.NIL;
        if (module0686.NIL != var155) {
            var157 = PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic409$, var156);
        }
        else {
            var157 = (SubLObject)module0686.$ic410$;
            var127 = (SubLObject)module0686.T;
        }
        module0674.f41154(var157, (SubLObject)module0686.NIL, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        return var127;
    }
    
    public static SubLObject f42126(final SubLObject var125) {
        final SubLThread var126 = SubLProcess.currentSubLThread();
        if (module0686.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0686.$ic411$);
            return (SubLObject)module0686.NIL;
        }
        SubLObject var127 = (SubLObject)module0686.NIL;
        final SubLObject var128 = f42039(var125);
        SubLObject var129 = f42038(var125);
        final SubLObject var130 = f42042(var125);
        final SubLObject var131 = conses_high.getf(f42050(var125), (SubLObject)module0686.$ic203$, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var132 = conses_high.getf(f42050(var125), (SubLObject)module0686.$ic204$, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var133 = conses_high.getf(f42050(var125), (SubLObject)module0686.$ic205$, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var134 = f42072(var125);
        final SubLObject var135 = f42074(var125);
        final SubLObject var136 = f42075(var125);
        final SubLObject var137 = f42077(var125);
        final SubLObject var138 = f42078(var125);
        final SubLObject var139 = f42047(var125);
        final SubLObject var140 = f42048(var125);
        final SubLObject var141 = f42046(var125);
        final SubLObject var142 = f42041(var125);
        SubLObject var143 = module0682.f41627(var142);
        final SubLObject var144 = module0682.f41631(var142);
        final SubLObject var145 = module0682.f41660(var142);
        final SubLObject var146 = module0682.f41639(var142);
        final SubLObject var147 = module0682.f41662(var142);
        final SubLObject var148 = module0682.f41638(var142);
        final SubLObject var149 = module0682.f41635(var142);
        final SubLObject var150 = module0682.f41637(var142);
        final SubLObject var151 = module0682.f41636(var142);
        final SubLObject var152 = module0682.f41640(var142);
        if (module0686.NIL != var128) {
            final SubLObject var153 = module0656.f39957(var128, (SubLObject)module0686.UNPROVIDED);
            if (module0686.NIL == module0633.f38716(var153, (SubLObject)module0686.UNPROVIDED)) {
                return module0656.f39789((SubLObject)module0686.$ic412$, var128, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
            }
            var129 = var153;
        }
        var143 = module0633.f38713(var129, var130);
        if (module0686.NIL == var143) {
            var143 = module0202.f12720(module0686.$ic408$, (SubLObject)ConsesLow.list(var129), (SubLObject)module0686.UNPROVIDED);
        }
        module0423.f29539(var143, var145, var147, module0412.f28669(var148, var145), var144, var146, var152);
        module0423.f29558(var143, var149, var150, var151, var144);
        f42137(var129, var143, var131, var132, var133, var134, var135, var136, var137, var138, var139, var140, var141, var130, var152);
        var126.resetMultipleValues();
        final SubLObject var154 = module0633.f38736(var129);
        final SubLObject var155 = var126.secondMultipleValue();
        var126.resetMultipleValues();
        SubLObject var156 = (SubLObject)module0686.NIL;
        if (module0686.NIL != var154) {
            var156 = PrintLow.format((SubLObject)module0686.NIL, (SubLObject)module0686.$ic413$, var155);
        }
        else {
            var156 = (SubLObject)module0686.$ic414$;
            var127 = (SubLObject)module0686.T;
        }
        module0674.f41154(var156, (SubLObject)module0686.NIL, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        return var127;
    }
    
    public static SubLObject f42136(final SubLObject var114, final SubLObject var128, final SubLObject var241, final SubLObject var242, final SubLObject var243, final SubLObject var131, final SubLObject var132, final SubLObject var133, final SubLObject var343, final SubLObject var344, final SubLObject var211, final SubLObject var213, final SubLObject var209, final SubLObject var130, final SubLObject var331) {
        assert module0686.NIL != module0128.f8449(var114) : var114;
        if (module0686.NIL != var241 && !module0686.areAssertionsDisabledFor(me) && module0686.NIL == Types.integerp(var241)) {
            throw new AssertionError(var241);
        }
        if (module0686.NIL != var242 && !module0686.areAssertionsDisabledFor(me) && module0686.NIL == Types.integerp(var242)) {
            throw new AssertionError(var242);
        }
        if (module0686.NIL != var243 && !module0686.areAssertionsDisabledFor(me) && module0686.NIL == Types.integerp(var243)) {
            throw new AssertionError(var243);
        }
        if (module0686.NIL != var131 && !module0686.areAssertionsDisabledFor(me) && module0686.NIL == Types.listp(var131)) {
            throw new AssertionError(var131);
        }
        if (module0686.NIL != var132 && !module0686.areAssertionsDisabledFor(me) && module0686.NIL == Types.listp(var132)) {
            throw new AssertionError(var132);
        }
        if (module0686.NIL != var133 && !module0686.areAssertionsDisabledFor(me) && module0686.NIL == Types.listp(var133)) {
            throw new AssertionError(var133);
        }
        assert module0686.NIL != Types.listp(var211) : var211;
        assert module0686.NIL != Types.listp(var213) : var213;
        assert module0686.NIL != module0161.f10479(var130) : var130;
        if (module0686.NIL != f42138(var331)) {
            module0543.f33631((SubLObject)ConsesLow.listS(module0686.$ic418$, var114, (SubLObject)module0686.$ic419$), module0132.$g1555$.getGlobalValue(), (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        else {
            module0543.f33631((SubLObject)ConsesLow.listS(module0686.$ic418$, var114, (SubLObject)module0686.$ic420$), module0132.$g1555$.getGlobalValue(), (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        module0543.f33631((SubLObject)ConsesLow.list(module0686.$ic421$, var114, var128), var130, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        SubLObject var345 = (SubLObject)module0686.NIL;
        if (module0686.NIL != var131 || module0686.NIL != var344) {
            f42139(var114, var131, var130, var331);
        }
        else if (module0686.NIL != var132 || module0686.NIL != var133) {
            if (module0686.NIL != var132) {
                SubLObject var346 = var132;
                SubLObject var347 = (SubLObject)module0686.NIL;
                var347 = var346.first();
                while (module0686.NIL != var346) {
                    f42140(var114, var347, var130);
                    var346 = var346.rest();
                    var347 = var346.first();
                }
            }
            if (module0686.NIL != var133) {
                SubLObject var346 = var133;
                SubLObject var348 = (SubLObject)module0686.NIL;
                var348 = var346.first();
                while (module0686.NIL != var346) {
                    f42141(var114, var348, var130);
                    var346 = var346.rest();
                    var348 = var346.first();
                }
            }
        }
        else if (module0686.NIL != var343) {
            f42142(var114, var130);
        }
        else {
            var345 = (SubLObject)module0686.$ic422$;
        }
        if (module0686.NIL != var241) {
            f42143(var114, var241, var130);
        }
        if (module0686.NIL != var242) {
            f42144(var114, var242, var130);
        }
        if (module0686.NIL != var243) {
            f42145(var114, var243, var130);
        }
        SubLObject var346 = var209;
        SubLObject var349 = (SubLObject)module0686.NIL;
        var349 = var346.first();
        while (module0686.NIL != var346) {
            f42146(var114, var349, var130);
            var346 = var346.rest();
            var349 = var346.first();
        }
        var346 = var211;
        SubLObject var350 = (SubLObject)module0686.NIL;
        var350 = var346.first();
        while (module0686.NIL != var346) {
            f42147(var114, var350, var130);
            var346 = var346.rest();
            var350 = var346.first();
        }
        var346 = var213;
        SubLObject var351 = (SubLObject)module0686.NIL;
        var351 = var346.first();
        while (module0686.NIL != var346) {
            f42148(var114, var351, var130);
            var346 = var346.rest();
            var351 = var346.first();
        }
        return Values.values(var114, var345);
    }
    
    public static SubLObject f42138(final SubLObject var331) {
        SubLObject var332 = var331;
        SubLObject var333 = (SubLObject)module0686.NIL;
        var333 = var332.first();
        while (module0686.NIL != var332) {
            SubLObject var335;
            final SubLObject var334 = var335 = var333;
            SubLObject var336 = (SubLObject)module0686.NIL;
            SubLObject var337 = (SubLObject)module0686.NIL;
            SubLObject var338 = (SubLObject)module0686.NIL;
            SubLObject var339 = (SubLObject)module0686.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var335, var334, (SubLObject)module0686.$ic423$);
            var336 = var335.first();
            var335 = var335.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var335, var334, (SubLObject)module0686.$ic423$);
            var337 = var335.first();
            var335 = var335.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var335, var334, (SubLObject)module0686.$ic423$);
            var338 = var335.first();
            var335 = var335.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var335, var334, (SubLObject)module0686.$ic423$);
            var339 = var335.first();
            var335 = var335.rest();
            if (module0686.NIL == var335) {
                if (module0686.NIL != var339) {
                    return (SubLObject)module0686.T;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var334, (SubLObject)module0686.$ic423$);
            }
            var332 = var332.rest();
            var333 = var332.first();
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42137(final SubLObject var114, final SubLObject var128, final SubLObject var241, final SubLObject var242, final SubLObject var243, final SubLObject var131, final SubLObject var132, final SubLObject var133, final SubLObject var343, final SubLObject var344, final SubLObject var211, final SubLObject var213, final SubLObject var209, final SubLObject var130, final SubLObject var331) {
        final SubLThread var345 = SubLProcess.currentSubLThread();
        assert module0686.NIL != module0128.f8449(var114) : var114;
        if (module0686.NIL != var241 && !module0686.areAssertionsDisabledFor(me) && module0686.NIL == Types.integerp(var241)) {
            throw new AssertionError(var241);
        }
        if (module0686.NIL != var242 && !module0686.areAssertionsDisabledFor(me) && module0686.NIL == Types.integerp(var242)) {
            throw new AssertionError(var242);
        }
        if (module0686.NIL != var243 && !module0686.areAssertionsDisabledFor(me) && module0686.NIL == Types.integerp(var243)) {
            throw new AssertionError(var243);
        }
        if (module0686.NIL == Errors.$ignore_mustsP$.getDynamicValue(var345) && module0686.NIL == module0035.f2370((SubLObject)module0686.$ic236$, var132, (SubLObject)module0686.UNPROVIDED)) {
            Errors.error((SubLObject)module0686.$ic424$, var131);
        }
        if (module0686.NIL == Errors.$ignore_mustsP$.getDynamicValue(var345) && module0686.NIL == module0035.f2370((SubLObject)module0686.$ic236$, var132, (SubLObject)module0686.UNPROVIDED)) {
            Errors.error((SubLObject)module0686.$ic424$, var132);
        }
        if (module0686.NIL == Errors.$ignore_mustsP$.getDynamicValue(var345) && module0686.NIL == module0035.f2370((SubLObject)module0686.$ic236$, var133, (SubLObject)module0686.UNPROVIDED)) {
            Errors.error((SubLObject)module0686.$ic424$, var133);
        }
        assert module0686.NIL != Types.listp(var211) : var211;
        assert module0686.NIL != Types.listp(var213) : var213;
        assert module0686.NIL != module0161.f10479(var130) : var130;
        if (module0686.NIL != var331) {
            module0543.f33631((SubLObject)ConsesLow.listS(module0686.$ic418$, var114, (SubLObject)module0686.$ic419$), module0132.$g1555$.getGlobalValue(), (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        else {
            module0543.f33631((SubLObject)ConsesLow.listS(module0686.$ic418$, var114, (SubLObject)module0686.$ic420$), module0132.$g1555$.getGlobalValue(), (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        }
        module0543.f33631((SubLObject)ConsesLow.list(module0686.$ic421$, var114, var128), var130, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        f42149(var114, var241, var130);
        f42150(var114, var242, var130);
        f42151(var114, var243, var130);
        if (module0686.NIL != var131 || module0686.NIL != var344) {
            f42152(var114, var131, var130, var331);
        }
        else if (module0686.NIL != var132 || module0686.NIL != var133) {
            f42153(var114, var132, var133, var130);
        }
        else if (module0686.NIL != var343) {
            f42154(var114, var130);
        }
        f42155(var114, var209, var130);
        f42156(var114, var211, var130);
        f42157(var114, var213, var130);
        return var114;
    }
    
    public static SubLObject f42149(final SubLObject var114, final SubLObject var241, final SubLObject var130) {
        final SubLObject var242 = f42158(var114, module0686.$ic425$).first();
        final SubLObject var243 = (SubLObject)((module0686.NIL != var242) ? module0178.f11335(var242) : module0686.NIL);
        if (!var243.eql(var241)) {
            if (module0686.NIL != module0174.f11035(var242)) {
                module0543.f33630(var242);
            }
            if (module0686.NIL != var241) {
                return f42143(var114, var241, var130);
            }
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42150(final SubLObject var114, final SubLObject var242, final SubLObject var130) {
        final SubLObject var243 = f42158(var114, module0686.$ic426$).first();
        final SubLObject var244 = (SubLObject)((module0686.NIL != var243) ? module0178.f11335(var243) : module0686.NIL);
        if (!var244.eql(var242)) {
            if (module0686.NIL != module0174.f11035(var243)) {
                module0543.f33630(var243);
            }
            if (module0686.NIL != var242) {
                return f42144(var114, var242, var130);
            }
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42151(final SubLObject var114, final SubLObject var243, final SubLObject var130) {
        final SubLObject var244 = f42158(var114, module0686.$ic427$).first();
        final SubLObject var245 = (SubLObject)((module0686.NIL != var244) ? module0178.f11335(var244) : module0686.NIL);
        if (!var245.eql(var243)) {
            if (module0686.NIL != module0174.f11035(var244)) {
                module0543.f33630(var244);
            }
            if (module0686.NIL != var243) {
                return f42145(var114, var243, var130);
            }
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42143(final SubLObject var114, final SubLObject var241, final SubLObject var130) {
        return f42159(var114, module0686.$ic425$, var241, var130);
    }
    
    public static SubLObject f42144(final SubLObject var114, final SubLObject var242, final SubLObject var130) {
        return f42159(var114, module0686.$ic426$, var242, var130);
    }
    
    public static SubLObject f42145(final SubLObject var114, final SubLObject var243, final SubLObject var130) {
        return f42159(var114, module0686.$ic427$, var243, var130);
    }
    
    public static SubLObject f42152(final SubLObject var114, final SubLObject var131, final SubLObject var130, final SubLObject var331) {
        final SubLObject var332 = f42158(var114, module0686.$ic428$);
        final SubLObject var333 = f42158(var114, module0686.$ic429$);
        final SubLObject var334 = f42158(var114, module0686.$ic430$);
        final SubLObject var335 = f42158(var114, module0686.$ic431$);
        final SubLObject var336 = module0233.f15412(var131);
        SubLObject var337 = (SubLObject)module0686.T;
        SubLObject var338 = var333;
        SubLObject var339 = (SubLObject)module0686.NIL;
        var339 = var338.first();
        while (module0686.NIL != var338) {
            module0543.f33630(var339);
            var338 = var338.rest();
            var339 = var338.first();
        }
        var338 = var334;
        SubLObject var340 = (SubLObject)module0686.NIL;
        var340 = var338.first();
        while (module0686.NIL != var338) {
            module0543.f33630(var340);
            var338 = var338.rest();
            var340 = var338.first();
        }
        var338 = var332;
        SubLObject var341 = (SubLObject)module0686.NIL;
        var341 = var338.first();
        while (module0686.NIL != var338) {
            final SubLObject var342 = module0178.f11335(var341);
            final SubLObject var343 = module0178.f11287(var341);
            if (!var343.eql(var130) || !var342.equal(var336)) {
                module0543.f33630(var341);
            }
            var338 = var338.rest();
            var341 = var338.first();
        }
        var338 = var335;
        SubLObject var344 = (SubLObject)module0686.NIL;
        var344 = var338.first();
        while (module0686.NIL != var338) {
            module0543.f33630(var344);
            var338 = var338.rest();
            var344 = var338.first();
        }
        if (module0686.NIL == module0220.f14584((SubLObject)ConsesLow.list(module0686.$ic428$, var114, var336), var130, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED)) {
            var337 = f42139(var114, var131, var130, var331);
        }
        return var337;
    }
    
    public static SubLObject f42153(final SubLObject var114, final SubLObject var132, final SubLObject var133, final SubLObject var130) {
        final SubLObject var134 = f42158(var114, module0686.$ic428$);
        final SubLObject var135 = f42158(var114, module0686.$ic431$);
        SubLObject var136 = var134;
        SubLObject var137 = (SubLObject)module0686.NIL;
        var137 = var136.first();
        while (module0686.NIL != var136) {
            module0543.f33630(var137);
            var136 = var136.rest();
            var137 = var136.first();
        }
        var136 = var135;
        SubLObject var138 = (SubLObject)module0686.NIL;
        var138 = var136.first();
        while (module0686.NIL != var136) {
            module0543.f33630(var138);
            var136 = var136.rest();
            var138 = var136.first();
        }
        f42160(var114, module0686.$ic429$, var132, var130);
        f42160(var114, module0686.$ic430$, var133, var130);
        return var114;
    }
    
    public static SubLObject f42154(final SubLObject var114, final SubLObject var130) {
        final SubLObject var131 = f42158(var114, module0686.$ic428$);
        final SubLObject var132 = f42158(var114, module0686.$ic429$);
        final SubLObject var133 = f42158(var114, module0686.$ic430$);
        SubLObject var135;
        final SubLObject var134 = var135 = ConsesLow.append(var131, var132, var133);
        SubLObject var136 = (SubLObject)module0686.NIL;
        var136 = var135.first();
        while (module0686.NIL != var135) {
            module0543.f33630(var136);
            var135 = var135.rest();
            var136 = var135.first();
        }
        if (module0686.NIL == module0220.f14584((SubLObject)ConsesLow.list(module0686.$ic431$, var114), var130, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED)) {
            f42142(var114, var130);
        }
        return var114;
    }
    
    public static SubLObject f42139(final SubLObject var114, final SubLObject var131, final SubLObject var130, final SubLObject var331) {
        final SubLObject var332 = module0233.f15412(var131);
        if (module0686.NIL != var331) {
            final SubLObject var333 = Sequences.position(var332, var331, Symbols.symbol_function((SubLObject)module0686.EQUAL), Symbols.symbol_function((SubLObject)module0686.$ic432$), (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
            if (module0686.NIL != var333) {
                final SubLObject var334 = ConsesLow.nth(var333, var331).first();
                final SubLObject var335 = module0633.f38713(var114, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var336 = (SubLObject)ConsesLow.list(module0686.$ic433$, var335, var334);
                f42159(var114, module0686.$ic434$, var336, var130);
            }
        }
        return f42159(var114, module0686.$ic428$, var332, var130);
    }
    
    public static SubLObject f42140(final SubLObject var114, final SubLObject var345, final SubLObject var130) {
        assert module0686.NIL != module0233.f15359(var345) : var345;
        return f42159(var114, module0686.$ic429$, var345, var130);
    }
    
    public static SubLObject f42141(final SubLObject var114, final SubLObject var346, final SubLObject var130) {
        assert module0686.NIL != module0233.f15359(var346) : var346;
        return f42159(var114, module0686.$ic430$, var346, var130);
    }
    
    public static SubLObject f42142(final SubLObject var114, final SubLObject var130) {
        return module0543.f33631((SubLObject)ConsesLow.list(module0686.$ic431$, var114), var130, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
    }
    
    public static SubLObject f42155(final SubLObject var114, final SubLObject var209, final SubLObject var130) {
        SubLObject var211;
        final SubLObject var210 = var211 = f42158(var114, module0686.$ic418$);
        SubLObject var212 = (SubLObject)module0686.NIL;
        var212 = var211.first();
        while (module0686.NIL != var211) {
            final SubLObject var213 = module0178.f11335(var212);
            final SubLObject var214 = module0178.f11287(var212);
            if (!var213.eql(module0686.$ic45$) && ((!var214.eql(module0132.$g1555$.getGlobalValue()) && !var214.eql(var130)) || module0686.NIL == conses_high.member(var213, var209, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED))) {
                module0543.f33630(var212);
            }
            var211 = var211.rest();
            var212 = var211.first();
        }
        var211 = var209;
        SubLObject var215 = (SubLObject)module0686.NIL;
        var215 = var211.first();
        while (module0686.NIL != var211) {
            if (module0686.NIL == module0220.f14587((SubLObject)ConsesLow.list(module0686.$ic418$, var114, var215), var130, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED)) {
                f42146(var114, var215, var130);
            }
            var211 = var211.rest();
            var215 = var211.first();
        }
        return var114;
    }
    
    public static SubLObject f42146(final SubLObject var114, final SubLObject var347, final SubLObject var130) {
        return f42159(var114, module0686.$ic418$, var347, var130);
    }
    
    public static SubLObject f42156(final SubLObject var114, final SubLObject var211, final SubLObject var130) {
        return f42160(var114, module0686.$ic435$, var211, var130);
    }
    
    public static SubLObject f42147(final SubLObject var114, final SubLObject var183, final SubLObject var130) {
        return f42159(var114, module0686.$ic435$, var183, var130);
    }
    
    public static SubLObject f42157(final SubLObject var114, final SubLObject var185, final SubLObject var130) {
        return f42160(var114, module0686.$ic436$, var185, var130);
    }
    
    public static SubLObject f42148(final SubLObject var114, final SubLObject var190, final SubLObject var130) {
        return f42159(var114, module0686.$ic436$, var190, var130);
    }
    
    public static SubLObject f42158(final SubLObject var114, final SubLObject var374) {
        final SubLThread var375 = SubLProcess.currentSubLThread();
        SubLObject var376 = (SubLObject)module0686.NIL;
        final SubLObject var377 = module0147.$g2094$.currentBinding(var375);
        final SubLObject var378 = module0147.$g2095$.currentBinding(var375);
        try {
            module0147.$g2094$.bind((SubLObject)module0686.$ic437$, var375);
            module0147.$g2095$.bind(module0686.$ic438$, var375);
            if (module0686.NIL != module0158.f10010(var114, (SubLObject)module0686.ONE_INTEGER, var374)) {
                final SubLObject var379 = module0158.f10011(var114, (SubLObject)module0686.ONE_INTEGER, var374);
                SubLObject var380 = (SubLObject)module0686.NIL;
                final SubLObject var381 = (SubLObject)module0686.NIL;
                while (module0686.NIL == var380) {
                    final SubLObject var382 = module0052.f3695(var379, var381);
                    final SubLObject var383 = (SubLObject)SubLObjectFactory.makeBoolean(!var381.eql(var382));
                    if (module0686.NIL != var383) {
                        SubLObject var384 = (SubLObject)module0686.NIL;
                        try {
                            var384 = module0158.f10316(var382, (SubLObject)module0686.$ic439$, (SubLObject)module0686.$ic440$, (SubLObject)module0686.NIL);
                            SubLObject var377_382 = (SubLObject)module0686.NIL;
                            final SubLObject var378_383 = (SubLObject)module0686.NIL;
                            while (module0686.NIL == var377_382) {
                                final SubLObject var385 = module0052.f3695(var384, var378_383);
                                final SubLObject var380_384 = (SubLObject)SubLObjectFactory.makeBoolean(!var378_383.eql(var385));
                                if (module0686.NIL != var380_384) {
                                    var376 = (SubLObject)ConsesLow.cons(var385, var376);
                                }
                                var377_382 = (SubLObject)SubLObjectFactory.makeBoolean(module0686.NIL == var380_384);
                            }
                        }
                        finally {
                            final SubLObject var5_385 = Threads.$is_thread_performing_cleanupP$.currentBinding(var375);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0686.T, var375);
                                if (module0686.NIL != var384) {
                                    module0158.f10319(var384);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var5_385, var375);
                            }
                        }
                    }
                    var380 = (SubLObject)SubLObjectFactory.makeBoolean(module0686.NIL == var383);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var378, var375);
            module0147.$g2094$.rebind(var377, var375);
        }
        return var376;
    }
    
    public static SubLObject f42161(final SubLObject var386) {
        SubLObject var387 = (module0686.NIL != module0614.f37617(var386)) ? module0614.f37640(var386) : module0267.f17575(var386, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL == var387) {
            var387 = module0202.f12643(module0686.$ic441$, var386);
        }
        return var387;
    }
    
    public static SubLObject f42162(final SubLObject var386) {
        final SubLThread var387 = SubLProcess.currentSubLThread();
        SubLObject var388 = (SubLObject)module0686.NIL;
        final SubLObject var389 = module0147.f9540(module0632.f38705());
        final SubLObject var390 = module0147.$g2095$.currentBinding(var387);
        final SubLObject var391 = module0147.$g2094$.currentBinding(var387);
        final SubLObject var392 = module0147.$g2096$.currentBinding(var387);
        try {
            module0147.$g2095$.bind(module0147.f9545(var389), var387);
            module0147.$g2094$.bind(module0147.f9546(var389), var387);
            module0147.$g2096$.bind(module0147.f9549(var389), var387);
            if (module0686.NIL != module0161.f10593(var386)) {
                var388 = module0202.f12768(module0686.$ic442$, f42161(var386), (SubLObject)module0686.$ic443$);
            }
            else {
                var388 = module0202.f12643(module0686.$ic444$, (SubLObject)module0686.$ic443$);
            }
        }
        finally {
            module0147.$g2096$.rebind(var392, var387);
            module0147.$g2094$.rebind(var391, var387);
            module0147.$g2095$.rebind(var390, var387);
        }
        return var388;
    }
    
    public static SubLObject f42163(final SubLObject var374) {
        return module0035.sublisp_boolean(module0434.f30578((SubLObject)module0686.$ic445$, (SubLObject)ConsesLow.listS(module0686.$ic446$, var374, (SubLObject)module0686.$ic447$), module0632.f38705(), (SubLObject)module0686.UNPROVIDED));
    }
    
    public static SubLObject f42164(final SubLObject var389) {
        final SubLObject var390 = module0617.f37872(var389, (SubLObject)module0686.UNPROVIDED);
        if (var390.isInteger()) {
            return module0612.f37514(var390);
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42160(final SubLObject var114, final SubLObject var374, final SubLObject var391, final SubLObject var130) {
        final SubLThread var392 = SubLProcess.currentSubLThread();
        final SubLObject var393 = f42163(var374);
        final SubLObject var394 = f42158(var114, var374);
        final SubLObject var395 = (module0686.NIL != var393) ? module0632.f38707(var130) : var130;
        SubLObject var396 = var394;
        SubLObject var397 = (SubLObject)module0686.NIL;
        var397 = var396.first();
        while (module0686.NIL != var396) {
            final SubLObject var398 = module0178.f11335(var397);
            final SubLObject var399 = module0178.f11287(var397);
            final SubLObject var400 = module0161.f10557(var399);
            if ((!var400.eql(var130) || module0686.NIL == conses_high.member(var398, var391, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED)) && (module0686.NIL == var393 || module0686.NIL != module0434.f30578((SubLObject)module0686.$ic445$, (SubLObject)ConsesLow.list(var374, var114, var398), var395, (SubLObject)module0686.UNPROVIDED))) {
                module0543.f33630(var397);
                if (module0686.NIL != var393) {
                    final SubLObject var401 = module0161.f10586(var399);
                    SubLObject var402 = (SubLObject)module0686.NIL;
                    SubLObject var403 = (SubLObject)module0686.NIL;
                    var392.resetMultipleValues();
                    final SubLObject var400_401 = module0161.f10598(var401);
                    final SubLObject var402_403 = var392.secondMultipleValue();
                    var392.resetMultipleValues();
                    var402 = var400_401;
                    var403 = var402_403;
                    if (var403.eql(module0686.$ic448$)) {
                        var403 = module0686.$ic449$;
                    }
                    final SubLObject var404 = module0147.f9540(module0632.f38705());
                    final SubLObject var405 = module0147.$g2095$.currentBinding(var392);
                    final SubLObject var406 = module0147.$g2094$.currentBinding(var392);
                    final SubLObject var407 = module0147.$g2096$.currentBinding(var392);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var404), var392);
                        module0147.$g2094$.bind(module0147.f9546(var404), var392);
                        module0147.$g2096$.bind(module0147.f9549(var404), var392);
                        final SubLObject var408 = (module0686.NIL != module0161.f10593(var402)) ? var402 : f42164(var114);
                        final SubLObject var409 = f42162(var408);
                        final SubLObject var410 = module0633.f38742(var400, var409, var403);
                        f42165(var114, var374, var398, var410);
                    }
                    finally {
                        module0147.$g2096$.rebind(var407, var392);
                        module0147.$g2094$.rebind(var406, var392);
                        module0147.$g2095$.rebind(var405, var392);
                    }
                }
            }
            var396 = var396.rest();
            var397 = var396.first();
        }
        var396 = var391;
        SubLObject var411 = (SubLObject)module0686.NIL;
        var411 = var396.first();
        while (module0686.NIL != var396) {
            if (module0686.NIL == module0434.f30578((SubLObject)module0686.$ic445$, (SubLObject)ConsesLow.list(var374, var114, var411), var395, (SubLObject)module0686.UNPROVIDED)) {
                f42159(var114, var374, var411, var130);
            }
            var396 = var396.rest();
            var411 = var396.first();
        }
        return var114;
    }
    
    public static SubLObject f42159(final SubLObject var114, final SubLObject var374, final SubLObject var407, SubLObject var130) {
        if (module0686.NIL != f42163(var374)) {
            var130 = module0161.f10518((SubLObject)ConsesLow.list(var130, module0161.f10543((SubLObject)module0686.$ic450$, module0686.$ic449$)));
        }
        return f42165(var114, var374, var407, var130);
    }
    
    public static SubLObject f42165(final SubLObject var114, final SubLObject var374, final SubLObject var407, final SubLObject var200) {
        return module0543.f33631((SubLObject)ConsesLow.list(var374, var114, var407), var200, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
    }
    
    public static SubLObject f42166(SubLObject var2) {
        if (var2 == module0686.UNPROVIDED) {
            var2 = (SubLObject)module0686.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0686.NIL == var2) {
            var2 = (SubLObject)module0686.$ic455$;
        }
        final SubLObject var4 = module0656.f39832((SubLObject)module0686.$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0686.$ic456$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        if (module0686.NIL != var4) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var3);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42167(SubLObject var6) {
        if (var6 == module0686.UNPROVIDED) {
            var6 = (SubLObject)module0686.NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = (SubLObject)module0686.$ic452$;
        final SubLObject var9 = module0015.$g538$.currentBinding(var7);
        try {
            module0015.$g538$.bind((module0686.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var7))) ? module0015.$g538$.getDynamicValue(var7) : module0057.f4173((SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED), var7);
            module0642.f39020((SubLObject)module0686.$ic19$);
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
            final SubLObject var10 = module0014.f672((SubLObject)module0686.$ic20$);
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            if (module0686.NIL != var10) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(var10);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic22$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            module0016.f941();
            if (module0686.NIL != var8) {
                module0642.f39029((SubLObject)module0686.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var8);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_408 = module0015.$g535$.currentBinding(var7);
            try {
                module0015.$g535$.bind((SubLObject)module0686.T, var7);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0686.NIL != module0015.$g132$.getDynamicValue(var7)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var7)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020((SubLObject)module0686.$ic122$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_409 = module0015.$g533$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var7);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020((SubLObject)module0686.$ic123$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_410 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var7);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020((SubLObject)module0686.$ic124$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020((SubLObject)module0686.$ic125$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39019((SubLObject)module0686.$ic126$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_410, var7);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0686.NIL != var8) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0686.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39019(var8);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0686.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    }
                    final SubLObject var11 = module0656.f39832((SubLObject)module0686.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var7));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020((SubLObject)module0686.$ic40$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    if (module0686.NIL != var11) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39020(var11);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_411 = module0015.$g533$.currentBinding(var7);
                    final SubLObject var12 = module0015.$g541$.currentBinding(var7);
                    final SubLObject var13 = module0015.$g539$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var7);
                        module0015.$g541$.bind((SubLObject)module0686.T, var7);
                        module0015.$g539$.bind(module0015.f797(), var7);
                        module0642.f39069((SubLObject)module0686.$ic458$, (SubLObject)module0686.T, (SubLObject)module0686.UNPROVIDED);
                        final SubLObject var14 = f42168(module0574.f35152());
                        module0642.f39020(module0015.$g207$.getGlobalValue());
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0686.$ic459$);
                        module0656.f39804(module0574.f35152(), (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                        module0642.f39019((SubLObject)module0686.$ic460$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39020(module0015.$g208$.getGlobalValue());
                        module0642.f39026((SubLObject)module0686.TWO_INTEGER);
                        if (module0686.NIL != var14) {
                            f42169();
                            f42170(var14);
                            f42169();
                        }
                        else {
                            module0642.f39021((SubLObject)module0686.$ic461$);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var7));
                    }
                    finally {
                        module0015.$g539$.rebind(var13, var7);
                        module0015.$g541$.rebind(var12, var7);
                        module0015.$g533$.rebind(var5_411, var7);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0686.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_409, var7);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0686.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5_408, var7);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var9, var7);
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42168(final SubLObject var190) {
        return module0213.f13926(module0634.f38758(var190), (SubLObject)module0686.NIL, (SubLObject)module0686.NIL, (SubLObject)module0686.T, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
    }
    
    public static SubLObject f42169() {
        module0656.f39837((SubLObject)module0686.$ic451$, (SubLObject)module0686.$ic463$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
        module0642.f39032((SubLObject)module0686.UNPROVIDED);
        module0642.f39074((SubLObject)module0686.$ic464$, (SubLObject)module0686.$ic465$, (SubLObject)module0686.UNPROVIDED);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42170(final SubLObject var412) {
        final SubLThread var413 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39020((SubLObject)module0686.THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var414 = module0015.$g533$.currentBinding(var413);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var413);
            f42171();
            SubLObject var415 = var412;
            SubLObject var416 = (SubLObject)module0686.NIL;
            var416 = var415.first();
            while (module0686.NIL != var415) {
                final SubLObject var417 = module0259.f16854(var416, module0686.$ic298$, module0632.f38705(), (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_414 = module0015.$g533$.currentBinding(var413);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var413);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_415 = module0015.$g533$.currentBinding(var413);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var413);
                        module0656.f39837((SubLObject)module0686.$ic71$, var416, (SubLObject)module0686.$ic466$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_415, var413);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_416 = module0015.$g533$.currentBinding(var413);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var413);
                        module0656.f39837((SubLObject)module0686.$ic3$, var416, (SubLObject)module0686.$ic467$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_416, var413);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_417 = module0015.$g533$.currentBinding(var413);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var413);
                        module0656.f39804(var416, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_417, var413);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0686.$ic314$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                    final SubLObject var5_418 = module0015.$g533$.currentBinding(var413);
                    try {
                        module0015.$g533$.bind((SubLObject)module0686.T, var413);
                        final SubLObject var418 = (SubLObject)SubLObjectFactory.makeBoolean(module0686.NIL != var417 && module0686.NIL == f42172(var416));
                        module0642.f39068(module0656.f39842(var416), var417, var417, (SubLObject)module0686.NIL, (SubLObject)module0686.NIL, var418);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_418, var413);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_414, var413);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0686.UNPROVIDED);
                var415 = var415.rest();
                var416 = var415.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var414, var413);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42171() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0686.T, var3);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_420 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var3);
                module0642.f39021((SubLObject)module0686.$ic468$);
            }
            finally {
                module0015.$g533$.rebind(var5_420, var3);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_421 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var3);
                module0642.f39021((SubLObject)module0686.$ic469$);
            }
            finally {
                module0015.$g533$.rebind(var5_421, var3);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_422 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var3);
                module0642.f39021((SubLObject)module0686.$ic470$);
            }
            finally {
                module0015.$g533$.rebind(var5_422, var3);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0686.$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            final SubLObject var5_423 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0686.T, var3);
                module0642.f39021((SubLObject)module0686.$ic471$);
            }
            finally {
                module0015.$g533$.rebind(var5_423, var3);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var4, var3);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)module0686.UNPROVIDED);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42173(SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        var6 = var6.rest();
        final SubLObject var8 = f42168(module0574.f35152());
        SubLObject var9 = (SubLObject)module0686.NIL;
        SubLObject var10 = (SubLObject)module0686.NIL;
        SubLObject var11 = var6;
        SubLObject var12 = (SubLObject)module0686.NIL;
        var12 = var11.first();
        while (module0686.NIL != var11) {
            final SubLObject var13 = var12.first();
            if (var13.equal((SubLObject)module0686.$ic465$)) {
                var9 = (SubLObject)module0686.T;
            }
            else {
                final SubLObject var14 = module0656.f39943(var13, (SubLObject)module0686.UNPROVIDED);
                if (module0686.NIL != var14) {
                    var10 = (SubLObject)ConsesLow.cons(var14, var10);
                }
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        if (module0686.NIL != var9) {
            final SubLObject var15 = module0035.f2220(var8, var10, (SubLObject)module0686.UNPROVIDED);
            if (module0686.NIL != module0543.f33698()) {
                module0667.f40583((SubLObject)module0686.$ic472$);
            }
            else {
                SubLObject var16 = var10;
                SubLObject var17 = (SubLObject)module0686.NIL;
                var17 = var16.first();
                while (module0686.NIL != var16) {
                    f42174(var17, (SubLObject)module0686.T);
                    var16 = var16.rest();
                    var17 = var16.first();
                }
                var16 = var15;
                var17 = (SubLObject)module0686.NIL;
                var17 = var16.first();
                while (module0686.NIL != var16) {
                    f42174(var17, (SubLObject)module0686.NIL);
                    var16 = var16.rest();
                    var17 = var16.first();
                }
            }
            module0642.f39020((SubLObject)module0686.$ic19$);
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
            final SubLObject var18 = module0014.f672((SubLObject)module0686.$ic20$);
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            if (module0686.NIL != var18) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                module0642.f39020(var18);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39020((SubLObject)module0686.$ic22$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            module0642.f39019((SubLObject)module0686.$ic473$);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
            final SubLObject var19 = module0015.$g132$.getDynamicValue(var7);
            final SubLObject var20 = module0015.$g535$.currentBinding(var7);
            try {
                module0015.$g535$.bind((SubLObject)module0686.T, var7);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0686.NIL != var19) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                    module0642.f39020(module0642.f39042(var19));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0686.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0686.UNPROVIDED);
                final SubLObject var5_431 = module0015.$g533$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)module0686.T, var7);
                    module0642.f39020(module0015.$g207$.getGlobalValue());
                    module0642.f39021((SubLObject)module0686.$ic473$);
                    module0642.f39020(module0015.$g208$.getGlobalValue());
                    module0656.f39794((SubLObject)module0686.$ic452$);
                    module0642.f39029((SubLObject)module0686.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_431, var7);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0686.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var20, var7);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0686.UNPROVIDED);
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42174(final SubLObject var429, final SubLObject var432) {
        final SubLObject var433 = f42172(var429);
        if (module0686.NIL != var432) {
            if (module0686.NIL == var433) {
                module0543.f33628((SubLObject)ConsesLow.listS(module0686.$ic418$, var429, (SubLObject)module0686.$ic475$), module0632.f38705(), (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
            }
        }
        else {
            SubLObject var434 = var433;
            SubLObject var435 = (SubLObject)module0686.NIL;
            var435 = var434.first();
            while (module0686.NIL != var434) {
                module0543.f33658((SubLObject)ConsesLow.listS(module0686.$ic418$, var429, (SubLObject)module0686.$ic475$), var435);
                if (module0686.NIL == module0633.f38716(var429, (SubLObject)module0686.UNPROVIDED)) {
                    module0543.f33628((SubLObject)ConsesLow.listS(module0686.$ic418$, var429, (SubLObject)module0686.$ic420$), module0632.f38705(), (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED);
                }
                var434 = var434.rest();
                var435 = var434.first();
            }
        }
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42172(final SubLObject var429) {
        final SubLThread var430 = SubLProcess.currentSubLThread();
        SubLObject var431 = (SubLObject)module0686.NIL;
        final SubLObject var432 = module0147.$g2094$.currentBinding(var430);
        final SubLObject var433 = module0147.$g2095$.currentBinding(var430);
        try {
            module0147.$g2094$.bind((SubLObject)module0686.$ic437$, var430);
            module0147.$g2095$.bind(module0686.$ic438$, var430);
            SubLObject var434 = module0288.f19344((SubLObject)ConsesLow.listS(module0686.$ic418$, var429, (SubLObject)module0686.$ic475$), (SubLObject)module0686.UNPROVIDED);
            SubLObject var435 = (SubLObject)module0686.NIL;
            var435 = var434.first();
            while (module0686.NIL != var434) {
                if (module0686.NIL != module0178.f11375(var435)) {
                    var431 = (SubLObject)ConsesLow.cons(module0178.f11287(var435), var431);
                }
                var434 = var434.rest();
                var435 = var434.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var433, var430);
            module0147.$g2094$.rebind(var432, var430);
        }
        return Sequences.nreverse(var431);
    }
    
    public static SubLObject f42175() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42009", "S#46006", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42010", "CB-KCT-TEST-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42012", "S#46007", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42013", "CB-KCT-TEST-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42014", "S#46008", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42011", "CB-KCT-MAIN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42016", "S#46009", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42015", "S#46010", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42018", "CB-KCT-START-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42019", "CB-KCT-START-TEST-COLLECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42020", "S#46011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42017", "S#46012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42021", "S#46013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42022", "CB-KCT-TOGGLE-REFRESH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42024", "S#46014", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42025", "CB-KCT-THINKING-FORGET", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42026", "S#46015", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42027", "CB-KCT-THINKING-ABORT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42028", "S#46016", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42029", "CB-KCT-THINKING-RESULTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42032", "S#46017", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42023", "CB-KCT-THINKING-MEMBERS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42031", "S#46018", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42030", "S#46019", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42033", "S#45675", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42034", "S#45672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42035", "S#46020", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42036", "S#46021", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42037", "S#45615", 1, 0, false);
        new $f42037$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42038", "S#46022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42039", "S#46023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42040", "S#46024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42041", "S#46025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42042", "S#46026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42043", "S#46027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42044", "S#46028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42045", "S#46029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42046", "S#46030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42047", "S#46031", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42048", "S#46032", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42049", "S#46033", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42050", "S#46034", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42051", "S#46035", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42052", "S#46036", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42053", "S#46037", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42054", "S#46038", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42055", "S#46039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42056", "S#46040", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42057", "S#46041", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42058", "S#46042", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42059", "S#46043", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42060", "S#46044", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42061", "S#46045", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42062", "S#46046", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42063", "S#46047", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42064", "S#46048", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42065", "S#46049", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42066", "S#46050", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42067", "S#46051", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42068", "S#46052", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42069", "S#46053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42071", "S#46054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42072", "S#46055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42074", "S#46056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42075", "S#46057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42076", "S#46058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42077", "S#46059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42078", "S#46060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42073", "S#46061", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42081", "S#46062", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42082", "S#46063", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42083", "S#46064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42084", "S#46065", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42085", "S#46005", 1, 0, false);
        new $f42085$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42080", "S#46066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42079", "S#46067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42086", "S#46068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42087", "S#46069", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42088", "S#46070", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42089", "S#46071", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42090", "S#46072", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42091", "S#46073", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42092", "S#46074", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42070", "S#46075", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42093", "S#46076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42094", "S#46077", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42095", "S#46078", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42096", "S#46079", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42097", "S#46080", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42098", "S#46081", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42099", "CB-EDIT-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42101", "S#46082", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42102", "CB-SAVE-AS-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42100", "S#46083", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42103", "S#46084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42104", "S#46085", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42105", "S#46086", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42106", "S#46087", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42107", "S#46088", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42108", "CB-HANDLE-CONFIRM-SAVE-AS-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42112", "S#46089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42109", "S#46090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42110", "S#46091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42111", "S#46092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42114", "S#46093", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42113", "S#46094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42118", "S#46095", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42119", "S#46096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42115", "S#46097", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42116", "S#46098", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42117", "S#46099", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42120", "S#46100", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42121", "CB-HANDLE-SPECIFY-TEST-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42122", "S#46101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42123", "S#46102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42124", "S#46103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42130", "S#46104", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42128", "S#46105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42129", "S#46106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42131", "S#46107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42127", "S#46108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42132", "S#46109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42133", "S#46110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42134", "S#46111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42135", "S#46112", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42125", "S#46113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42126", "S#46114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42136", "S#46115", 15, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42138", "S#32653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42137", "S#46116", 15, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42149", "S#46117", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42150", "S#46118", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42151", "S#46119", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42143", "S#46120", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42144", "S#46121", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42145", "S#46122", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42152", "S#46123", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42153", "S#46124", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42154", "S#46125", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42139", "S#46126", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42140", "S#46127", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42141", "S#46128", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42142", "S#46129", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42155", "S#46130", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42146", "S#46131", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42156", "S#46132", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42147", "S#46133", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42157", "S#46134", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42148", "S#46135", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42158", "S#46136", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42161", "S#46137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42162", "S#46138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42163", "S#46139", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42164", "S#46140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42160", "S#46141", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42159", "S#46142", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42165", "S#46143", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42166", "S#46144", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42167", "CB-KCT-CONTROL-PANEL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42168", "S#46145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42169", "S#46146", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42170", "S#46147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42171", "S#46148", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42173", "CB-KCT-CONTROL-PANEL-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42174", "S#46149", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0686", "f42172", "S#46150", 1, 0, false);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42176() {
        module0686.$g5388$ = SubLFiles.defparameter("S#46151", (SubLObject)module0686.NIL);
        module0686.$g5389$ = SubLFiles.defparameter("S#46152", Hashtables.make_hash_table((SubLObject)module0686.$ic141$, (SubLObject)module0686.UNPROVIDED, (SubLObject)module0686.UNPROVIDED));
        module0686.$g5390$ = SubLFiles.defconstant("S#46153", (SubLObject)module0686.$ic144$);
        module0686.$g5391$ = SubLFiles.defvar("S#46154", (SubLObject)module0686.NIL);
        module0686.$g5392$ = SubLFiles.defconstant("S#46155", (SubLObject)module0686.$ic217$);
        module0686.$g5393$ = SubLFiles.defparameter("S#46156", (SubLObject)module0686.$ic26$);
        return (SubLObject)module0686.NIL;
    }
    
    public static SubLObject f42177() {
        module0656.f39840((SubLObject)module0686.$ic3$, (SubLObject)module0686.$ic4$, (SubLObject)module0686.TWO_INTEGER);
        module0015.f873((SubLObject)module0686.$ic5$);
        module0656.f39840((SubLObject)module0686.$ic8$, (SubLObject)module0686.$ic9$, (SubLObject)module0686.TWO_INTEGER);
        module0015.f873((SubLObject)module0686.$ic10$);
        module0656.f39819((SubLObject)module0686.$ic11$, (SubLObject)module0686.$ic12$, (SubLObject)module0686.$ic13$, (SubLObject)module0686.$ic14$);
        module0656.f39840((SubLObject)module0686.$ic11$, (SubLObject)module0686.$ic17$, (SubLObject)module0686.ONE_INTEGER);
        module0012.f441((SubLObject)module0686.$ic18$);
        module0015.f873((SubLObject)module0686.$ic34$);
        module0015.f873((SubLObject)module0686.$ic54$);
        module0015.f873((SubLObject)module0686.$ic56$);
        module0656.f39840((SubLObject)module0686.$ic28$, (SubLObject)module0686.$ic89$, (SubLObject)module0686.ONE_INTEGER);
        module0015.f873((SubLObject)module0686.$ic92$);
        module0656.f39840((SubLObject)module0686.$ic75$, (SubLObject)module0686.$ic95$, (SubLObject)module0686.TWO_INTEGER);
        module0015.f873((SubLObject)module0686.$ic96$);
        module0656.f39840((SubLObject)module0686.$ic74$, (SubLObject)module0686.$ic99$, (SubLObject)module0686.TWO_INTEGER);
        module0015.f873((SubLObject)module0686.$ic100$);
        module0656.f39840((SubLObject)module0686.$ic82$, (SubLObject)module0686.$ic103$, (SubLObject)module0686.TWO_INTEGER);
        module0015.f873((SubLObject)module0686.$ic107$);
        module0656.f39840((SubLObject)module0686.$ic73$, (SubLObject)module0686.$ic110$, (SubLObject)module0686.TWO_INTEGER);
        module0015.f873((SubLObject)module0686.$ic116$);
        Hashtables.sethash((SubLObject)module0686.$ic117$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0686.$ic118$, (SubLObject)module0686.NIL));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0686.$g5390$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0686.$ic151$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0686.$ic152$);
        Structures.def_csetf((SubLObject)module0686.$ic153$, (SubLObject)module0686.$ic154$);
        Structures.def_csetf((SubLObject)module0686.$ic155$, (SubLObject)module0686.$ic156$);
        Structures.def_csetf((SubLObject)module0686.$ic157$, (SubLObject)module0686.$ic158$);
        Structures.def_csetf((SubLObject)module0686.$ic159$, (SubLObject)module0686.$ic160$);
        Structures.def_csetf((SubLObject)module0686.$ic161$, (SubLObject)module0686.$ic162$);
        Structures.def_csetf((SubLObject)module0686.$ic163$, (SubLObject)module0686.$ic164$);
        Structures.def_csetf((SubLObject)module0686.$ic165$, (SubLObject)module0686.$ic166$);
        Structures.def_csetf((SubLObject)module0686.$ic167$, (SubLObject)module0686.$ic168$);
        Structures.def_csetf((SubLObject)module0686.$ic169$, (SubLObject)module0686.$ic170$);
        Structures.def_csetf((SubLObject)module0686.$ic171$, (SubLObject)module0686.$ic172$);
        Structures.def_csetf((SubLObject)module0686.$ic173$, (SubLObject)module0686.$ic174$);
        Structures.def_csetf((SubLObject)module0686.$ic175$, (SubLObject)module0686.$ic176$);
        Structures.def_csetf((SubLObject)module0686.$ic177$, (SubLObject)module0686.$ic178$);
        Equality.identity((SubLObject)module0686.$ic144$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0686.$g5390$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0686.$ic197$));
        module0012.f441((SubLObject)module0686.$ic216$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0686.$g5392$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0686.$ic223$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0686.$ic224$);
        Structures.def_csetf((SubLObject)module0686.$ic225$, (SubLObject)module0686.$ic226$);
        Structures.def_csetf((SubLObject)module0686.$ic227$, (SubLObject)module0686.$ic228$);
        Structures.def_csetf((SubLObject)module0686.$ic229$, (SubLObject)module0686.$ic230$);
        Equality.identity((SubLObject)module0686.$ic217$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0686.$g5392$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0686.$ic235$));
        module0656.f39840((SubLObject)module0686.$ic71$, (SubLObject)module0686.$ic241$, (SubLObject)module0686.TWO_INTEGER);
        module0015.f873((SubLObject)module0686.$ic243$);
        module0656.f39840((SubLObject)module0686.$ic248$, (SubLObject)module0686.$ic249$, (SubLObject)module0686.TWO_INTEGER);
        module0015.f873((SubLObject)module0686.$ic252$);
        module0015.f873((SubLObject)module0686.$ic325$);
        module0012.f441((SubLObject)module0686.$ic332$);
        module0015.f873((SubLObject)module0686.$ic392$);
        module0656.f39819((SubLObject)module0686.$ic451$, (SubLObject)module0686.$ic452$, (SubLObject)module0686.$ic453$, (SubLObject)module0686.$ic454$);
        module0656.f39840((SubLObject)module0686.$ic451$, (SubLObject)module0686.$ic457$, (SubLObject)module0686.ONE_INTEGER);
        module0015.f873((SubLObject)module0686.$ic462$);
        module0015.f873((SubLObject)module0686.$ic474$);
        return (SubLObject)module0686.NIL;
    }
    
    public void declareFunctions() {
        f42175();
    }
    
    public void initializeVariables() {
        f42176();
    }
    
    public void runTopLevelForms() {
        f42177();
    }
    
    static {
        me = (SubLFile)new module0686();
        module0686.$g5388$ = null;
        module0686.$g5389$ = null;
        module0686.$g5390$ = null;
        module0686.$g5391$ = null;
        module0686.$g5392$ = null;
        module0686.$g5393$ = null;
        $ic0$ = SubLObjectFactory.makeString("[Run Test]");
        $ic1$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic2$ = SubLObjectFactory.makeString("cb-kct-test-run&~a");
        $ic3$ = SubLObjectFactory.makeKeyword("KCT-TEST");
        $ic4$ = SubLObjectFactory.makeSymbol("S#46006", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("CB-KCT-TEST-RUN");
        $ic6$ = SubLObjectFactory.makeString("[Run Test Set]");
        $ic7$ = SubLObjectFactory.makeString("cb-kct-test-set-run&~a");
        $ic8$ = SubLObjectFactory.makeKeyword("KCT-TEST-SET");
        $ic9$ = SubLObjectFactory.makeSymbol("S#46007", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("CB-KCT-TEST-SET-RUN");
        $ic11$ = SubLObjectFactory.makeKeyword("KCT");
        $ic12$ = SubLObjectFactory.makeString("KB Content Test Monitor");
        $ic13$ = SubLObjectFactory.makeString("KCTRun");
        $ic14$ = SubLObjectFactory.makeString("View status of running and completed KB Content Tests");
        $ic15$ = SubLObjectFactory.makeString("[KCTRun]");
        $ic16$ = SubLObjectFactory.makeString("cb-kct-main");
        $ic17$ = SubLObjectFactory.makeSymbol("S#46008", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#46151", "CYC");
        $ic19$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic20$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic21$ = SubLObjectFactory.makeString("stylesheet");
        $ic22$ = SubLObjectFactory.makeString("text/css");
        $ic23$ = SubLObjectFactory.makeString("Refresh");
        $ic24$ = SubLObjectFactory.makeString("5; URL=cg?cb-kct-main");
        $ic25$ = SubLObjectFactory.makeString("#9999ff");
        $ic26$ = SubLObjectFactory.makeString("#ffffff");
        $ic27$ = SubLObjectFactory.makeKeyword("TOP");
        $ic28$ = SubLObjectFactory.makeKeyword("KCT-TOGGLE-REFRESH");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("main"));
        $ic30$ = SubLObjectFactory.makeString("None running.");
        $ic31$ = SubLObjectFactory.makeString("Individual Tests");
        $ic32$ = SubLObjectFactory.makeString("Test Categories");
        $ic33$ = SubLObjectFactory.makeString("There are no running or finished tests at this time.");
        $ic34$ = SubLObjectFactory.makeSymbol("CB-KCT-MAIN");
        $ic35$ = SubLObjectFactory.makeString("#99ccff");
        $ic36$ = SubLObjectFactory.makeString("TEST");
        $ic37$ = SubLObjectFactory.makeString("TASK STATUS");
        $ic38$ = SubLObjectFactory.makeString("TASK ACTIONS");
        $ic39$ = SubLObjectFactory.makeString("TEST RESULT");
        $ic40$ = SubLObjectFactory.makeString("post");
        $ic41$ = SubLObjectFactory.makeString("cb-kct-start-test");
        $ic42$ = SubLObjectFactory.makeString("Enter test to run : ");
        $ic43$ = SubLObjectFactory.makeString("kct-test");
        $ic44$ = SubLObjectFactory.makeString("Complete");
        $ic45$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBContentTest-FullySpecified"));
        $ic46$ = SubLObjectFactory.makeString("Clear");
        $ic47$ = SubLObjectFactory.makeInteger(40);
        $ic48$ = SubLObjectFactory.makeString("Run Test");
        $ic49$ = SubLObjectFactory.makeString("cb-kct-start-test-collection");
        $ic50$ = SubLObjectFactory.makeString("Enter test category to run : ");
        $ic51$ = SubLObjectFactory.makeString("kct-coll");
        $ic52$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBContentTestSpecificationType"));
        $ic53$ = SubLObjectFactory.makeString("~A is not the name of a #$KBContentTest-FullySpecified.");
        $ic54$ = SubLObjectFactory.makeSymbol("CB-KCT-START-TEST");
        $ic55$ = SubLObjectFactory.makeString("~A is not the name of a #$KBContentTestSpecificationType.");
        $ic56$ = SubLObjectFactory.makeSymbol("CB-KCT-START-TEST-COLLECTION");
        $ic57$ = SubLObjectFactory.makeKeyword("RUNNING");
        $ic58$ = SubLObjectFactory.makeKeyword("STARTED");
        $ic59$ = SubLObjectFactory.makeString("#99ffff");
        $ic60$ = SubLObjectFactory.makeKeyword("STOPPED");
        $ic61$ = SubLObjectFactory.makeKeyword("NONE");
        $ic62$ = SubLObjectFactory.makeString("#cccccc");
        $ic63$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic64$ = SubLObjectFactory.makeString("#ff6666");
        $ic65$ = SubLObjectFactory.makeKeyword("FINISHED");
        $ic66$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic67$ = SubLObjectFactory.makeKeyword("FAILURE");
        $ic68$ = SubLObjectFactory.makeKeyword("PROBLEM");
        $ic69$ = SubLObjectFactory.makeKeyword("SKIPPED");
        $ic70$ = SubLObjectFactory.makeKeyword("COLLECTION");
        $ic71$ = SubLObjectFactory.makeKeyword("KCT-EDIT");
        $ic72$ = SubLObjectFactory.makeString("[Edit Test]");
        $ic73$ = SubLObjectFactory.makeKeyword("KCT-MEMBERS");
        $ic74$ = SubLObjectFactory.makeKeyword("KCT-ABORT");
        $ic75$ = SubLObjectFactory.makeKeyword("KCT-FORGET");
        $ic76$ = SubLObjectFactory.makeString(" ");
        $ic77$ = SubLObjectFactory.makeString("Task is just starting.");
        $ic78$ = SubLObjectFactory.makeString("Test halted with this error: ~A");
        $ic79$ = SubLObjectFactory.makeString("Task was halted before completion.");
        $ic80$ = SubLObjectFactory.makeKeyword("SEVERE");
        $ic81$ = SubLObjectFactory.makeString("Test is un-executable due to configuration errors.  Email detailing problems has been sent to the responsible cyclist.  Problems:  ~A");
        $ic82$ = SubLObjectFactory.makeKeyword("KCT-RESULTS");
        $ic83$ = SubLObjectFactory.makeString("Task was never begun.");
        $ic84$ = SubLObjectFactory.makeString("Unknown thinking status ~A");
        $ic85$ = SubLObjectFactory.makeString("[Halt Auto Refresh]");
        $ic86$ = SubLObjectFactory.makeString("[Start Auto Refresh]");
        $ic87$ = SubLObjectFactory.makeString("cb-kct-toggle-refresh");
        $ic88$ = SubLObjectFactory.makeString("|");
        $ic89$ = SubLObjectFactory.makeSymbol("S#46013", "CYC");
        $ic90$ = SubLObjectFactory.makeString("main");
        $ic91$ = SubLObjectFactory.makeString("members");
        $ic92$ = SubLObjectFactory.makeSymbol("CB-KCT-TOGGLE-REFRESH");
        $ic93$ = SubLObjectFactory.makeString("[Forget]");
        $ic94$ = SubLObjectFactory.makeString("cb-kct-thinking-forget&~a");
        $ic95$ = SubLObjectFactory.makeSymbol("S#46014", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("CB-KCT-THINKING-FORGET");
        $ic97$ = SubLObjectFactory.makeString("[Abort]");
        $ic98$ = SubLObjectFactory.makeString("cb-kct-thinking-abort&~a");
        $ic99$ = SubLObjectFactory.makeSymbol("S#46015", "CYC");
        $ic100$ = SubLObjectFactory.makeSymbol("CB-KCT-THINKING-ABORT");
        $ic101$ = SubLObjectFactory.makeString("[View Results]");
        $ic102$ = SubLObjectFactory.makeString("cb-kct-thinking-results&~a");
        $ic103$ = SubLObjectFactory.makeSymbol("S#46016", "CYC");
        $ic104$ = SubLObjectFactory.makeKeyword("INDIVIDUAL");
        $ic105$ = SubLObjectFactory.makeKeyword("BRIEF");
        $ic106$ = SubLObjectFactory.makeString("Wrong type of KCT Thinking Task: ~A!");
        $ic107$ = SubLObjectFactory.makeSymbol("CB-KCT-THINKING-RESULTS");
        $ic108$ = SubLObjectFactory.makeString("[View Member Tests]");
        $ic109$ = SubLObjectFactory.makeString("cb-kct-thinking-members&~a");
        $ic110$ = SubLObjectFactory.makeSymbol("S#46017", "CYC");
        $ic111$ = SubLObjectFactory.makeString("Member test status for ~A");
        $ic112$ = SubLObjectFactory.makeString("5; URL=cg?cb-kct-thinking-members&~A");
        $ic113$ = SubLObjectFactory.makeString("This test category has no member tests!");
        $ic114$ = SubLObjectFactory.makeString("The test was stopped before all member tests could finish.");
        $ic115$ = SubLObjectFactory.makeString("All member tests have finished.");
        $ic116$ = SubLObjectFactory.makeSymbol("CB-KCT-THINKING-MEMBERS");
        $ic117$ = SubLObjectFactory.makeKeyword("CB-KCT-TEST-SET");
        $ic118$ = SubLObjectFactory.makeString("cb-kct-test-set.html");
        $ic119$ = SubLObjectFactory.makeString("Test Category Results");
        $ic120$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic121$ = SubLObjectFactory.makeString("text/javascript");
        $ic122$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic123$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic124$ = SubLObjectFactory.makeString("button");
        $ic125$ = SubLObjectFactory.makeString("reload");
        $ic126$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic127$ = SubLObjectFactory.makeString("Test Category: ");
        $ic128$ = SubLObjectFactory.makeString("First test in set started: ");
        $ic129$ = SubLObjectFactory.makeString("[unimplemented]");
        $ic130$ = SubLObjectFactory.makeString("Last test in set ended: ");
        $ic131$ = SubLObjectFactory.makeString("Overall status: ");
        $ic132$ = SubLObjectFactory.makeString("Explanation: ");
        $ic133$ = SubLObjectFactory.makeString("Results for member tests:");
        $ic134$ = SubLObjectFactory.makeSymbol("S#32782", "CYC");
        $ic135$ = SubLObjectFactory.makeString("Test Results for ");
        $ic136$ = SubLObjectFactory.makeString("Query: ");
        $ic137$ = SubLObjectFactory.makeString("Query Formula: ");
        $ic138$ = SubLObjectFactory.makeString("Test Status: ");
        $ic139$ = SubLObjectFactory.makeString("#B40000");
        $ic140$ = SubLObjectFactory.makeString("#228b22");
        $ic141$ = SubLObjectFactory.makeInteger(1024);
        $ic142$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic143$ = SubLObjectFactory.makeSymbol("S#32762", "CYC");
        $ic144$ = SubLObjectFactory.makeSymbol("S#46003", "CYC");
        $ic145$ = SubLObjectFactory.makeSymbol("S#45615", "CYC");
        $ic146$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#33259", "CYC"), SubLObjectFactory.makeSymbol("S#29", "CYC"), SubLObjectFactory.makeSymbol("S#45660", "CYC"), SubLObjectFactory.makeSymbol("S#46157", "CYC"), SubLObjectFactory.makeSymbol("S#45662", "CYC"), SubLObjectFactory.makeSymbol("S#46158", "CYC"), SubLObjectFactory.makeSymbol("S#46159", "CYC"), SubLObjectFactory.makeSymbol("S#46160", "CYC"), SubLObjectFactory.makeSymbol("S#1988", "CYC"), SubLObjectFactory.makeSymbol("S#7998", "CYC"), SubLObjectFactory.makeSymbol("S#46161", "CYC"), SubLObjectFactory.makeSymbol("S#46162", "CYC"), SubLObjectFactory.makeSymbol("S#46163", "CYC") });
        $ic147$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TEST-SPEC"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("COMMENTS"), SubLObjectFactory.makeKeyword("QUERY-STATE"), SubLObjectFactory.makeKeyword("SAVE-MT"), SubLObjectFactory.makeKeyword("ANSWER-STATUS"), SubLObjectFactory.makeKeyword("ANSWER-OPTIONS-INDEX"), SubLObjectFactory.makeKeyword("ANSWER-OPTIONS-BINDINGS-INDEX"), SubLObjectFactory.makeKeyword("CATEGORIES"), SubLObjectFactory.makeKeyword("METRICS"), SubLObjectFactory.makeKeyword("CYCLISTS"), SubLObjectFactory.makeKeyword("NOTES"), SubLObjectFactory.makeKeyword("ANSWER-CARDINALITY") });
        $ic148$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#46022", "CYC"), SubLObjectFactory.makeSymbol("S#46023", "CYC"), SubLObjectFactory.makeSymbol("S#46024", "CYC"), SubLObjectFactory.makeSymbol("S#46025", "CYC"), SubLObjectFactory.makeSymbol("S#46026", "CYC"), SubLObjectFactory.makeSymbol("S#46027", "CYC"), SubLObjectFactory.makeSymbol("S#46028", "CYC"), SubLObjectFactory.makeSymbol("S#46029", "CYC"), SubLObjectFactory.makeSymbol("S#46030", "CYC"), SubLObjectFactory.makeSymbol("S#46031", "CYC"), SubLObjectFactory.makeSymbol("S#46032", "CYC"), SubLObjectFactory.makeSymbol("S#46033", "CYC"), SubLObjectFactory.makeSymbol("S#46034", "CYC") });
        $ic149$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#46035", "CYC"), SubLObjectFactory.makeSymbol("S#46036", "CYC"), SubLObjectFactory.makeSymbol("S#46037", "CYC"), SubLObjectFactory.makeSymbol("S#46038", "CYC"), SubLObjectFactory.makeSymbol("S#46039", "CYC"), SubLObjectFactory.makeSymbol("S#46040", "CYC"), SubLObjectFactory.makeSymbol("S#46041", "CYC"), SubLObjectFactory.makeSymbol("S#46042", "CYC"), SubLObjectFactory.makeSymbol("S#46043", "CYC"), SubLObjectFactory.makeSymbol("S#46044", "CYC"), SubLObjectFactory.makeSymbol("S#46045", "CYC"), SubLObjectFactory.makeSymbol("S#46046", "CYC"), SubLObjectFactory.makeSymbol("S#46047", "CYC") });
        $ic150$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic151$ = SubLObjectFactory.makeSymbol("S#46021", "CYC");
        $ic152$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#45615", "CYC"));
        $ic153$ = SubLObjectFactory.makeSymbol("S#46022", "CYC");
        $ic154$ = SubLObjectFactory.makeSymbol("S#46035", "CYC");
        $ic155$ = SubLObjectFactory.makeSymbol("S#46023", "CYC");
        $ic156$ = SubLObjectFactory.makeSymbol("S#46036", "CYC");
        $ic157$ = SubLObjectFactory.makeSymbol("S#46024", "CYC");
        $ic158$ = SubLObjectFactory.makeSymbol("S#46037", "CYC");
        $ic159$ = SubLObjectFactory.makeSymbol("S#46025", "CYC");
        $ic160$ = SubLObjectFactory.makeSymbol("S#46038", "CYC");
        $ic161$ = SubLObjectFactory.makeSymbol("S#46026", "CYC");
        $ic162$ = SubLObjectFactory.makeSymbol("S#46039", "CYC");
        $ic163$ = SubLObjectFactory.makeSymbol("S#46027", "CYC");
        $ic164$ = SubLObjectFactory.makeSymbol("S#46040", "CYC");
        $ic165$ = SubLObjectFactory.makeSymbol("S#46028", "CYC");
        $ic166$ = SubLObjectFactory.makeSymbol("S#46041", "CYC");
        $ic167$ = SubLObjectFactory.makeSymbol("S#46029", "CYC");
        $ic168$ = SubLObjectFactory.makeSymbol("S#46042", "CYC");
        $ic169$ = SubLObjectFactory.makeSymbol("S#46030", "CYC");
        $ic170$ = SubLObjectFactory.makeSymbol("S#46043", "CYC");
        $ic171$ = SubLObjectFactory.makeSymbol("S#46031", "CYC");
        $ic172$ = SubLObjectFactory.makeSymbol("S#46044", "CYC");
        $ic173$ = SubLObjectFactory.makeSymbol("S#46032", "CYC");
        $ic174$ = SubLObjectFactory.makeSymbol("S#46045", "CYC");
        $ic175$ = SubLObjectFactory.makeSymbol("S#46033", "CYC");
        $ic176$ = SubLObjectFactory.makeSymbol("S#46046", "CYC");
        $ic177$ = SubLObjectFactory.makeSymbol("S#46034", "CYC");
        $ic178$ = SubLObjectFactory.makeSymbol("S#46047", "CYC");
        $ic179$ = SubLObjectFactory.makeKeyword("TEST-SPEC");
        $ic180$ = SubLObjectFactory.makeKeyword("NAME");
        $ic181$ = SubLObjectFactory.makeKeyword("COMMENTS");
        $ic182$ = SubLObjectFactory.makeKeyword("QUERY-STATE");
        $ic183$ = SubLObjectFactory.makeKeyword("SAVE-MT");
        $ic184$ = SubLObjectFactory.makeKeyword("ANSWER-STATUS");
        $ic185$ = SubLObjectFactory.makeKeyword("ANSWER-OPTIONS-INDEX");
        $ic186$ = SubLObjectFactory.makeKeyword("ANSWER-OPTIONS-BINDINGS-INDEX");
        $ic187$ = SubLObjectFactory.makeKeyword("CATEGORIES");
        $ic188$ = SubLObjectFactory.makeKeyword("METRICS");
        $ic189$ = SubLObjectFactory.makeKeyword("CYCLISTS");
        $ic190$ = SubLObjectFactory.makeKeyword("NOTES");
        $ic191$ = SubLObjectFactory.makeKeyword("ANSWER-CARDINALITY");
        $ic192$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic193$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic194$ = SubLObjectFactory.makeSymbol("S#46048", "CYC");
        $ic195$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic196$ = SubLObjectFactory.makeKeyword("END");
        $ic197$ = SubLObjectFactory.makeSymbol("S#46050", "CYC");
        $ic198$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic199$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic200$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("N"), (SubLObject)SubLObjectFactory.makeKeyword("MIN"), (SubLObject)SubLObjectFactory.makeKeyword("MAX"));
        $ic201$ = SubLObjectFactory.makeString("~A is not a known answer cardinality type.");
        $ic202$ = ConsesLow.list((SubLObject)module0686.NIL, (SubLObject)module0686.NIL, (SubLObject)module0686.NIL);
        $ic203$ = SubLObjectFactory.makeKeyword("N");
        $ic204$ = SubLObjectFactory.makeKeyword("MIN");
        $ic205$ = SubLObjectFactory.makeKeyword("MAX");
        $ic206$ = SubLObjectFactory.makeKeyword("UNIMPORTANT");
        $ic207$ = SubLObjectFactory.makeKeyword("EXACT");
        $ic208$ = SubLObjectFactory.makeKeyword("WANTED");
        $ic209$ = SubLObjectFactory.makeKeyword("INEXACT");
        $ic210$ = SubLObjectFactory.makeString("The wanted binding set, ");
        $ic211$ = SubLObjectFactory.makeString(", was not a KB-BINDING-SET-P -- dropping it.");
        $ic212$ = SubLObjectFactory.makeKeyword("UNWANTED");
        $ic213$ = SubLObjectFactory.makeString("The unwanted binding set, ");
        $ic214$ = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $ic215$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic216$ = SubLObjectFactory.makeSymbol("S#46154", "CYC");
        $ic217$ = SubLObjectFactory.makeSymbol("S#46004", "CYC");
        $ic218$ = SubLObjectFactory.makeSymbol("S#46005", "CYC");
        $ic219$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36025", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5846", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"));
        $ic220$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BINDING-SET"), (SubLObject)SubLObjectFactory.makeKeyword("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("ID"));
        $ic221$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#46066", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46067", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46068", "CYC"));
        $ic222$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#46069", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46070", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46071", "CYC"));
        $ic223$ = SubLObjectFactory.makeSymbol("S#46065", "CYC");
        $ic224$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#46005", "CYC"));
        $ic225$ = SubLObjectFactory.makeSymbol("S#46066", "CYC");
        $ic226$ = SubLObjectFactory.makeSymbol("S#46069", "CYC");
        $ic227$ = SubLObjectFactory.makeSymbol("S#46067", "CYC");
        $ic228$ = SubLObjectFactory.makeSymbol("S#46070", "CYC");
        $ic229$ = SubLObjectFactory.makeSymbol("S#46068", "CYC");
        $ic230$ = SubLObjectFactory.makeSymbol("S#46071", "CYC");
        $ic231$ = SubLObjectFactory.makeKeyword("BINDING-SET");
        $ic232$ = SubLObjectFactory.makeKeyword("STATUS");
        $ic233$ = SubLObjectFactory.makeKeyword("ID");
        $ic234$ = SubLObjectFactory.makeSymbol("S#46072", "CYC");
        $ic235$ = SubLObjectFactory.makeSymbol("S#46074", "CYC");
        $ic236$ = SubLObjectFactory.makeSymbol("S#18095", "CYC");
        $ic237$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic238$ = SubLObjectFactory.makeString("Edit this instance of #$KBContentTest-FullySpecified.");
        $ic239$ = SubLObjectFactory.makeString("cb-edit-test&~A");
        $ic240$ = SubLObjectFactory.makeString("nd();");
        $ic241$ = SubLObjectFactory.makeSymbol("S#46081", "CYC");
        $ic242$ = SubLObjectFactory.makeString("~A does not denote a test specification");
        $ic243$ = SubLObjectFactory.makeSymbol("CB-EDIT-TEST");
        $ic244$ = SubLObjectFactory.makeString("[Save As Test]");
        $ic245$ = SubLObjectFactory.makeKeyword("SELF");
        $ic246$ = SubLObjectFactory.makeString("Create an instance of #$KBContentTest-FullySpecified having a query specification with the sentence, microtheory and inference settings of the focal inference, and with expected results based on those obtained by the focal inference.");
        $ic247$ = SubLObjectFactory.makeString("cb-save-as-test&~A&~A");
        $ic248$ = SubLObjectFactory.makeKeyword("KCT-SAVE");
        $ic249$ = SubLObjectFactory.makeSymbol("S#46082", "CYC");
        $ic250$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45911", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45912", "CYC"));
        $ic251$ = SubLObjectFactory.makeString("Inference ~S in problem store ~S is no longer available.");
        $ic252$ = SubLObjectFactory.makeSymbol("CB-SAVE-AS-TEST");
        $ic253$ = SubLObjectFactory.makeString("Edit Test Specification");
        $ic254$ = SubLObjectFactory.makeString("Save Inference Settings and Results as Test Specification");
        $ic255$ = SubLObjectFactory.makeString("cb-handle-confirm-save-as-test");
        $ic256$ = SubLObjectFactory.makeString("An interface for creating and editing KBContentTest-FullySpecified instances.  Hover over the various headers for context-sensitive help.");
        $ic257$ = SubLObjectFactory.makeString("Save As Test");
        $ic258$ = SubLObjectFactory.makeString("Goto section :");
        $ic259$ = SubLObjectFactory.makeString("Shortcut links to sections that appear further down on this page.");
        $ic260$ = SubLObjectFactory.makeString("mt-section");
        $ic261$ = SubLObjectFactory.makeString("[Mt]");
        $ic262$ = SubLObjectFactory.makeString("Change the Microtheory settings to be used for the saved test's query.");
        $ic263$ = SubLObjectFactory.makeString("sentence-section");
        $ic264$ = SubLObjectFactory.makeString("[Sentence]");
        $ic265$ = SubLObjectFactory.makeString("Change the CycL sentence to be used for the saved test's query.");
        $ic266$ = SubLObjectFactory.makeString("parameters-section");
        $ic267$ = SubLObjectFactory.makeString("[Inference Parameters]");
        $ic268$ = SubLObjectFactory.makeString("Adjust the inference parameters and resource constraints that will be used when saving the query for this test.");
        $ic269$ = SubLObjectFactory.makeString("categories-section");
        $ic270$ = SubLObjectFactory.makeString("[Test Categories]");
        $ic271$ = SubLObjectFactory.makeString("Specify instances of KBContentTestSpecificationType that this test belongs to.");
        $ic272$ = SubLObjectFactory.makeString("metrics-section");
        $ic273$ = SubLObjectFactory.makeString("[Test Metrics]");
        $ic274$ = SubLObjectFactory.makeString("Specify metrics that should be collected for this test.");
        $ic275$ = SubLObjectFactory.makeString("cyclists-section");
        $ic276$ = SubLObjectFactory.makeString("[Responsible Cyclists]");
        $ic277$ = SubLObjectFactory.makeString("Specify cyclists that are responsible for this test.");
        $ic278$ = SubLObjectFactory.makeString("Notes:");
        $ic279$ = SubLObjectFactory.makeString("Test Name: ");
        $ic280$ = SubLObjectFactory.makeString("The constant name to save the test specification as.");
        $ic281$ = SubLObjectFactory.makeString("name");
        $ic282$ = SubLObjectFactory.makeString("Next (Specify Expected Results)");
        $ic283$ = SubLObjectFactory.makeString("Store the specified sentence, mt, inference settings and so on in a temporary area, and then take you to a page where you can specify the bindings the test query should return.");
        $ic284$ = SubLObjectFactory.makeString("new");
        $ic285$ = SubLObjectFactory.makeString("Reset Values");
        $ic286$ = SubLObjectFactory.makeString("cb-kct-save-mt");
        $ic287$ = SubLObjectFactory.makeString("Show");
        $ic288$ = SubLObjectFactory.makeString("Hide");
        $ic289$ = SubLObjectFactory.makeKeyword("INVISIBLE");
        $ic290$ = SubLObjectFactory.makeString("Save In Mt: ");
        $ic291$ = SubLObjectFactory.makeString("The microtheory in which to save the assertions about the test specification.  Should be a spec-mt of #$TestVocabularyMt.");
        $ic292$ = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $ic293$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("defining-mt"));
        $ic294$ = SubLObjectFactory.makeString("test-categories");
        $ic295$ = SubLObjectFactory.makeString("Test Categories (optional)");
        $ic296$ = SubLObjectFactory.makeString("Instances of KBContentTestSpecificationType which the test should be an instance of.");
        $ic297$ = SubLObjectFactory.makeKeyword("VISIBLE");
        $ic298$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBContentRegressionTest"));
        $ic299$ = SubLObjectFactory.makeString("category");
        $ic300$ = SubLObjectFactory.makeInteger(100);
        $ic301$ = SubLObjectFactory.makeString("category-name");
        $ic302$ = SubLObjectFactory.makeString("Add a Test Category: ");
        $ic303$ = SubLObjectFactory.makeString("category-id");
        $ic304$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic305$ = SubLObjectFactory.makeSymbol("S#18405", "CYC");
        $ic306$ = SubLObjectFactory.makeString("test-metrics");
        $ic307$ = SubLObjectFactory.makeString("Test Metrics to Gather");
        $ic308$ = SubLObjectFactory.makeString("The metrics that should be gathered and reported when the test is run.");
        $ic309$ = SubLObjectFactory.makeString("None selected.");
        $ic310$ = SubLObjectFactory.makeString("metric");
        $ic311$ = SubLObjectFactory.makeString("cyclists");
        $ic312$ = SubLObjectFactory.makeString("Responsible Cyclists (required)");
        $ic313$ = SubLObjectFactory.makeString("The cyclists who are responsible for this test.");
        $ic314$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic315$ = SubLObjectFactory.makeString("Selected?");
        $ic316$ = SubLObjectFactory.makeString("Cyclist");
        $ic317$ = SubLObjectFactory.makeString("cyclist");
        $ic318$ = SubLObjectFactory.makeString("cyclist-name");
        $ic319$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("HumanCyclist"));
        $ic320$ = SubLObjectFactory.makeString("Add a Cyclist: ");
        $ic321$ = SubLObjectFactory.makeString("~A");
        $ic322$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("sentence"));
        $ic323$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("non_exp_sentence"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED?"), (SubLObject)module0686.NIL);
        $ic324$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCATION"), (SubLObject)SubLObjectFactory.makeString("Pragmatics"));
        $ic325$ = SubLObjectFactory.makeSymbol("CB-HANDLE-CONFIRM-SAVE-AS-TEST");
        $ic326$ = SubLObjectFactory.makeString("The ID, ~A, did not yield a KBContentTestSpecificationType.");
        $ic327$ = SubLObjectFactory.makeString("The name, ~S, did not denote a KBContentTestSpecificationType.");
        $ic328$ = SubLObjectFactory.makeString("The object, ~S, extracted from the test category selector, is not a KBContentTestSpecificationType.");
        $ic329$ = SubLObjectFactory.makeString("The ID, ~A, did not yield a Test Metric constant.");
        $ic330$ = SubLObjectFactory.makeString("The ID, ~A, did not yield a HumanCyclist.");
        $ic331$ = SubLObjectFactory.makeString("The name, ~A, did not denote a HumanCyclist.");
        $ic332$ = SubLObjectFactory.makeSymbol("S#46156", "CYC");
        $ic333$ = SubLObjectFactory.makeString("#ccccff");
        $ic334$ = SubLObjectFactory.makeString("Specify Test Expectations");
        $ic335$ = SubLObjectFactory.makeString("reloadCurrentFrame('reloadFrameButton');");
        $ic336$ = SubLObjectFactory.makeString("cb-handle-specify-test-results");
        $ic337$ = SubLObjectFactory.makeString("The interface for stating test expectations for a KB Content Test");
        $ic338$ = SubLObjectFactory.makeKeyword("RIGHT");
        $ic339$ = SubLObjectFactory.makeString("Exactly ");
        $ic340$ = SubLObjectFactory.makeString("cardinality");
        $ic341$ = SubLObjectFactory.makeString(" answers should be found.");
        $ic342$ = SubLObjectFactory.makeString("At least ");
        $ic343$ = SubLObjectFactory.makeString("min-cardinality");
        $ic344$ = SubLObjectFactory.makeString("At most ");
        $ic345$ = SubLObjectFactory.makeString("max-cardinality");
        $ic346$ = SubLObjectFactory.makeString("bindings");
        $ic347$ = SubLObjectFactory.makeString("unimportant");
        $ic348$ = SubLObjectFactory.makeString("The bindings obtained are unimportant.");
        $ic349$ = SubLObjectFactory.makeString("proven");
        $ic350$ = SubLObjectFactory.makeString("The query (with no free variables) should be proven.");
        $ic351$ = SubLObjectFactory.makeString("none");
        $ic352$ = SubLObjectFactory.makeString("No bindings should be found.");
        $ic353$ = SubLObjectFactory.makeString("The query (with no free variables) should not be proven.");
        $ic354$ = SubLObjectFactory.makeString("exact");
        $ic355$ = SubLObjectFactory.makeString("Require all and only the wanted bindings below (exact match).");
        $ic356$ = SubLObjectFactory.makeString("inexact");
        $ic357$ = SubLObjectFactory.makeString("Specify wanted and/or unwanted bindings below (inexact match).");
        $ic358$ = SubLObjectFactory.makeString("Check wanted and unwanted bindings:");
        $ic359$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic360$ = SubLObjectFactory.makeString("Wanted");
        $ic361$ = SubLObjectFactory.makeString("Not Wanted");
        $ic362$ = SubLObjectFactory.makeString("Unspecified");
        $ic363$ = SubLObjectFactory.makeString("Save New Test");
        $ic364$ = SubLObjectFactory.makeString("Creates a new #$KBContentTest-FullySpecified instance and associated #$CycLQuerySpecification, having the specified sentence, mt, inference settings and expected results.");
        $ic365$ = SubLObjectFactory.makeString("save-new");
        $ic366$ = SubLObjectFactory.makeString("Overwrite Existing Test");
        $ic367$ = SubLObjectFactory.makeString("Overwrites the existing test specification with the sentence, mt, inference settings and expected results specified here.");
        $ic368$ = SubLObjectFactory.makeString("overwrite");
        $ic369$ = SubLObjectFactory.makeString("Test Definition So Far");
        $ic370$ = SubLObjectFactory.makeString("The currently specified properties of the test being saved.  These values will be stored in the KB when you finish specifying results and choose either \"Save New Test\" or \"Overwrite Existing Test\".");
        $ic371$ = SubLObjectFactory.makeString("Specify a binding set:");
        $ic372$ = SubLObjectFactory.makeString("Enter values for each free variable, choose Wanted or Unwanted, and click Add to add the binding set to the expected results.");
        $ic373$ = SubLObjectFactory.makeString("Wanted:");
        $ic374$ = SubLObjectFactory.makeString("wanted");
        $ic375$ = SubLObjectFactory.makeString("Unwanted:");
        $ic376$ = SubLObjectFactory.makeString("unwanted");
        $ic377$ = SubLObjectFactory.makeString("Add this binding set");
        $ic378$ = SubLObjectFactory.makeString("Updates the state of the test being defined or edited, and displays this page again so another binding set may be added to the expected results.");
        $ic379$ = SubLObjectFactory.makeString("add");
        $ic380$ = SubLObjectFactory.makeString("new-~A");
        $ic381$ = SubLObjectFactory.makeString("top");
        $ic382$ = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $ic383$ = SubLObjectFactory.makeKeyword("COMPLETE-TYPE");
        $ic384$ = SubLObjectFactory.makeString("wanted-~A");
        $ic385$ = SubLObjectFactory.makeString("yes");
        $ic386$ = SubLObjectFactory.makeString("no");
        $ic387$ = SubLObjectFactory.makeString("unspecified");
        $ic388$ = SubLObjectFactory.makeKeyword("ADD");
        $ic389$ = SubLObjectFactory.makeKeyword("SAVE-NEW");
        $ic390$ = SubLObjectFactory.makeKeyword("OVERWRITE");
        $ic391$ = SubLObjectFactory.makeString("Unknown test save method ~A");
        $ic392$ = SubLObjectFactory.makeSymbol("CB-HANDLE-SPECIFY-TEST-RESULTS");
        $ic393$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic394$ = SubLObjectFactory.makeKeyword("EOF");
        $ic395$ = SubLObjectFactory.makeString(" is not an integer.");
        $ic396$ = SubLObjectFactory.makeKeyword("REQUIRED?");
        $ic397$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AUTO-CYCLIFY"), (SubLObject)module0686.T);
        $ic398$ = SubLObjectFactory.makeString("The value, ~A, is not a known exactness.");
        $ic399$ = SubLObjectFactory.makeString("test-spec");
        $ic400$ = SubLObjectFactory.makeString("~A does not denote a test specification.");
        $ic401$ = SubLObjectFactory.makeString("You need to make a choice for Expected Test Results.");
        $ic402$ = SubLObjectFactory.makeString("Problem extracting exact answers.");
        $ic403$ = SubLObjectFactory.makeString("The ID ~A does not denote a kct answer.");
        $ic404$ = SubLObjectFactory.makeString("Save Test Specification");
        $ic405$ = SubLObjectFactory.makeString("~A is not a valid constant name.");
        $ic406$ = SubLObjectFactory.makeString("Already a constant named ~A");
        $ic407$ = SubLObjectFactory.makeString("Constant ~S already exists which differs from ~S only by case");
        $ic408$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TestQueryFn"));
        $ic409$ = SubLObjectFactory.makeString("Save New Test Specification finished with these problems: ~A");
        $ic410$ = SubLObjectFactory.makeString("Save New Test Specification finished successfully.");
        $ic411$ = SubLObjectFactory.makeString("Overwrite Test Specification");
        $ic412$ = SubLObjectFactory.makeString("~A is not the name of a KBContentTest-FullySpecified.");
        $ic413$ = SubLObjectFactory.makeString("Edit Test Specification finished with these problems: ~A");
        $ic414$ = SubLObjectFactory.makeString("Edit Test Specification finished successfully.");
        $ic415$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic416$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic417$ = SubLObjectFactory.makeSymbol("S#12264", "CYC");
        $ic418$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic419$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MultipleChoiceKBContentTest")));
        $ic420$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBContentTest-FullySpecified")));
        $ic421$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testQuerySpecification"));
        $ic422$ = SubLObjectFactory.makeString("Remember to state expected results using the Cyc Browser.");
        $ic423$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32746", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32747", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32748", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45958", "CYC"));
        $ic424$ = SubLObjectFactory.makeString("Some item in ~A was not a KB-BINDING-SET-P");
        $ic425$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswers-Cardinality-Exact"));
        $ic426$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswers-Cardinality-Min"));
        $ic427$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswers-Cardinality-Max"));
        $ic428$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswersCycL-Exact"));
        $ic429$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswersCycL-Wanted"));
        $ic430$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswersCycL-NotWanted"));
        $ic431$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswersCycLUnimportant"));
        $ic432$ = SubLObjectFactory.makeSymbol("FOURTH");
        $ic433$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MCQuestionNthOptionFn"));
        $ic434$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswer-MultipleChoice"));
        $ic435$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testMetricsToGather"));
        $ic436$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testResponsibleCyclist"));
        $ic437$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic438$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic439$ = SubLObjectFactory.makeKeyword("GAF");
        $ic440$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic441$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("StartFn"));
        $ic442$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn"));
        $ic443$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("IndexicalReferentFn-EvaluateAtEL")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Now")));
        $ic444$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn-Inclusive"));
        $ic445$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic446$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("temporallyQualifiablePredicateInInterface"));
        $ic447$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycTestAndQuerySavingAndEditingTool")));
        $ic448$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Null-TimeParameter"));
        $ic449$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimePoint"));
        $ic450$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("IndexicalReferentFn-EvaluateAtEL")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Now"))), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Now")));
        $ic451$ = SubLObjectFactory.makeKeyword("KCT-CONTROL-PANEL");
        $ic452$ = SubLObjectFactory.makeString("KB Content Test Control Panel");
        $ic453$ = SubLObjectFactory.makeString("KCT");
        $ic454$ = SubLObjectFactory.makeString("View and edit your KB Content Tests");
        $ic455$ = SubLObjectFactory.makeString("[KCT]");
        $ic456$ = SubLObjectFactory.makeString("cb-kct-control-panel");
        $ic457$ = SubLObjectFactory.makeSymbol("S#46144", "CYC");
        $ic458$ = SubLObjectFactory.makeString("cb-kct-control-panel-handler");
        $ic459$ = SubLObjectFactory.makeString("KB Content Tests owned by ");
        $ic460$ = SubLObjectFactory.makeString(":");
        $ic461$ = SubLObjectFactory.makeString("No tests.");
        $ic462$ = SubLObjectFactory.makeSymbol("CB-KCT-CONTROL-PANEL");
        $ic463$ = SubLObjectFactory.makeString("[Refresh]");
        $ic464$ = SubLObjectFactory.makeString("Submit");
        $ic465$ = SubLObjectFactory.makeString("save");
        $ic466$ = SubLObjectFactory.makeString("[Edit]");
        $ic467$ = SubLObjectFactory.makeString("[Run]");
        $ic468$ = SubLObjectFactory.makeString("Edit");
        $ic469$ = SubLObjectFactory.makeString("Run");
        $ic470$ = SubLObjectFactory.makeString("Name");
        $ic471$ = SubLObjectFactory.makeString("Regression Test?");
        $ic472$ = SubLObjectFactory.makeString("Save Interface");
        $ic473$ = SubLObjectFactory.makeString("Tests' Regression Status Modified");
        $ic474$ = SubLObjectFactory.makeSymbol("CB-KCT-CONTROL-PANEL-HANDLER");
        $ic475$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBContentRegressionTest")));
    }
    
    public static final class $sX46003_native extends SubLStructNative
    {
        public SubLObject $test_spec;
        public SubLObject $name;
        public SubLObject $comments;
        public SubLObject $query_state;
        public SubLObject $save_mt;
        public SubLObject $answer_status;
        public SubLObject $answer_options_index;
        public SubLObject $answer_options_bindings_index;
        public SubLObject $categories;
        public SubLObject $metrics;
        public SubLObject $cyclists;
        public SubLObject $notes;
        public SubLObject $answer_cardinality;
        private static final SubLStructDeclNative structDecl;
        
        public $sX46003_native() {
            this.$test_spec = (SubLObject)CommonSymbols.NIL;
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$comments = (SubLObject)CommonSymbols.NIL;
            this.$query_state = (SubLObject)CommonSymbols.NIL;
            this.$save_mt = (SubLObject)CommonSymbols.NIL;
            this.$answer_status = (SubLObject)CommonSymbols.NIL;
            this.$answer_options_index = (SubLObject)CommonSymbols.NIL;
            this.$answer_options_bindings_index = (SubLObject)CommonSymbols.NIL;
            this.$categories = (SubLObject)CommonSymbols.NIL;
            this.$metrics = (SubLObject)CommonSymbols.NIL;
            this.$cyclists = (SubLObject)CommonSymbols.NIL;
            this.$notes = (SubLObject)CommonSymbols.NIL;
            this.$answer_cardinality = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX46003_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$test_spec;
        }
        
        public SubLObject getField3() {
            return this.$name;
        }
        
        public SubLObject getField4() {
            return this.$comments;
        }
        
        public SubLObject getField5() {
            return this.$query_state;
        }
        
        public SubLObject getField6() {
            return this.$save_mt;
        }
        
        public SubLObject getField7() {
            return this.$answer_status;
        }
        
        public SubLObject getField8() {
            return this.$answer_options_index;
        }
        
        public SubLObject getField9() {
            return this.$answer_options_bindings_index;
        }
        
        public SubLObject getField10() {
            return this.$categories;
        }
        
        public SubLObject getField11() {
            return this.$metrics;
        }
        
        public SubLObject getField12() {
            return this.$cyclists;
        }
        
        public SubLObject getField13() {
            return this.$notes;
        }
        
        public SubLObject getField14() {
            return this.$answer_cardinality;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$test_spec = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$comments = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$query_state = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$save_mt = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$answer_status = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$answer_options_index = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$answer_options_bindings_index = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$categories = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$metrics = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$cyclists = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$notes = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$answer_cardinality = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX46003_native.class, module0686.$ic144$, module0686.$ic145$, module0686.$ic146$, module0686.$ic147$, new String[] { "$test_spec", "$name", "$comments", "$query_state", "$save_mt", "$answer_status", "$answer_options_index", "$answer_options_bindings_index", "$categories", "$metrics", "$cyclists", "$notes", "$answer_cardinality" }, module0686.$ic148$, module0686.$ic149$, module0686.$ic150$);
        }
    }
    
    public static final class $f42037$UnaryFunction extends UnaryFunction
    {
        public $f42037$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#45615"));
        }
        
        public SubLObject processItem(final SubLObject var52) {
            return module0686.f42037(var52);
        }
    }
    
    public static final class $sX46004_native extends SubLStructNative
    {
        public SubLObject $binding_set;
        public SubLObject $status;
        public SubLObject $id;
        private static final SubLStructDeclNative structDecl;
        
        public $sX46004_native() {
            this.$binding_set = (SubLObject)CommonSymbols.NIL;
            this.$status = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX46004_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$binding_set;
        }
        
        public SubLObject getField3() {
            return this.$status;
        }
        
        public SubLObject getField4() {
            return this.$id;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$binding_set = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$status = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$id = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX46004_native.class, module0686.$ic217$, module0686.$ic218$, module0686.$ic219$, module0686.$ic220$, new String[] { "$binding_set", "$status", "$id" }, module0686.$ic221$, module0686.$ic222$, module0686.$ic150$);
        }
    }
    
    public static final class $f42085$UnaryFunction extends UnaryFunction
    {
        public $f42085$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#46005"));
        }
        
        public SubLObject processItem(final SubLObject var52) {
            return module0686.f42085(var52);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0686.class
	Total time: 4026 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/