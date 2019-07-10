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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == var2) {
            var2 = (SubLObject)$ic0$;
        }
        final SubLObject var4 = module0656.f39832((SubLObject)$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)$ic2$, module0656.f39842(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var4) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f42010(final SubLObject var6) {
        final SubLObject var7 = module0656.f39943(var6, (SubLObject)UNPROVIDED);
        module0635.f38802(var7, (SubLObject)T);
        f42011((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42012(final SubLObject var7, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (NIL == var2) {
            var2 = (SubLObject)$ic6$;
        }
        final SubLObject var9 = module0656.f39832((SubLObject)$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var8), (SubLObject)$ic7$, module0656.f39842(var7));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var9) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)T, var8);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var10, var8);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var7;
    }
    
    public static SubLObject f42013(final SubLObject var6) {
        final SubLObject var7 = module0656.f39943(var6, (SubLObject)UNPROVIDED);
        module0635.f38803(var7, (SubLObject)T);
        f42011((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42014(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == var2) {
            var2 = (SubLObject)$ic15$;
        }
        final SubLObject var4 = module0656.f39832((SubLObject)$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic16$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var4) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42011(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = (SubLObject)$ic12$;
        module0642.f39020((SubLObject)$ic19$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
        final SubLObject var9 = module0014.f672((SubLObject)$ic20$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic21$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var9) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic22$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var8);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0666.f40471();
        if (NIL != $g5388$.getDynamicValue(var7)) {
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g166$.getGlobalValue());
            module0642.f39020(module0015.$g167$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic23$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g168$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic24$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var10 = module0015.$g132$.getDynamicValue(var7);
        final SubLObject var11 = module0015.$g535$.currentBinding(var7);
        try {
            module0015.$g535$.bind((SubLObject)T, var7);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var10) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var10));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_11 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)T, var7);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)ONE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39019(var8);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)ONE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                f42015((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0635.f38784()) {
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g353$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)THREE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g357$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic25$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_12 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var7);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g366$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic26$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_13 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var7);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)FOUR_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_14 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                if (NIL != module0635.f38801()) {
                                    module0656.f39837((SubLObject)$ic28$, (SubLObject)$ic29$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else {
                                    module0642.f39021((SubLObject)$ic30$);
                                    $g5388$.setDynamicValue((SubLObject)NIL, var7);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        var7.resetMultipleValues();
                        final SubLObject var12 = module0635.f38800(module0635.f38784());
                        final SubLObject var13 = var7.secondMultipleValue();
                        var7.resetMultipleValues();
                        if (NIL != var12) {
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g366$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic26$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_15 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_16 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var7);
                                    module0642.f39021((SubLObject)$ic31$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            f42016();
                            SubLObject var14 = var12;
                            SubLObject var15 = (SubLObject)NIL;
                            var15 = var14.first();
                            while (NIL != var14) {
                                f42017(var15);
                                var14 = var14.rest();
                                var15 = var14.first();
                            }
                        }
                        if (NIL != var13) {
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g366$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic26$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_17 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_18 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var7);
                                    module0642.f39021((SubLObject)$ic32$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            f42016();
                            SubLObject var14 = var13;
                            SubLObject var15 = (SubLObject)NIL;
                            var15 = var14.first();
                            while (NIL != var14) {
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
                    module0642.f39019((SubLObject)$ic33$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var5_11, var7);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var11, var7);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42016() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39020(module0015.$g366$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic35$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_23 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39021((SubLObject)$ic36$);
            }
            finally {
                module0015.$g533$.rebind(var5_23, var3);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_24 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39021((SubLObject)$ic37$);
            }
            finally {
                module0015.$g533$.rebind(var5_24, var3);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_25 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39021((SubLObject)$ic38$);
            }
            finally {
                module0015.$g533$.rebind(var5_25, var3);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_26 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39021((SubLObject)$ic39$);
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
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42015(SubLObject var27, SubLObject var28) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = module0656.f39832((SubLObject)NIL);
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var29));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g285$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic40$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g286$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var31 = module0015.$g533$.currentBinding(var29);
        SubLObject var32 = module0015.$g541$.currentBinding(var29);
        SubLObject var33 = module0015.$g539$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            module0015.$g541$.bind((SubLObject)T, var29);
            module0015.$g539$.bind(module0015.f797(), var29);
            module0642.f39069((SubLObject)$ic41$, (SubLObject)T, (SubLObject)UNPROVIDED);
            module0642.f39021((SubLObject)$ic42$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0666.f40467((SubLObject)$ic43$, (SubLObject)$ic44$, $ic45$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)UNPROVIDED);
            module0644.f39184((SubLObject)$ic43$, (SubLObject)$ic46$);
            module0642.f39032((SubLObject)UNPROVIDED);
            module0642.f39075((SubLObject)$ic43$, (SubLObject)((NIL != var27) ? constants_high_oc.f10743(var27) : NIL), (SubLObject)$ic47$);
            module0642.f39074((SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0015.f799(module0015.$g539$.getDynamicValue(var29));
        }
        finally {
            module0015.$g539$.rebind(var33, var29);
            module0015.$g541$.rebind(var32, var29);
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        var30 = module0656.f39832((SubLObject)NIL);
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var29));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g285$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic40$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g286$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var31 = module0015.$g533$.currentBinding(var29);
        var32 = module0015.$g541$.currentBinding(var29);
        var33 = module0015.$g539$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            module0015.$g541$.bind((SubLObject)T, var29);
            module0015.$g539$.bind(module0015.f797(), var29);
            module0642.f39069((SubLObject)$ic49$, (SubLObject)T, (SubLObject)UNPROVIDED);
            module0642.f39021((SubLObject)$ic50$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0666.f40467((SubLObject)$ic51$, (SubLObject)$ic44$, $ic52$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)UNPROVIDED);
            module0644.f39184((SubLObject)$ic51$, (SubLObject)$ic46$);
            module0642.f39032((SubLObject)UNPROVIDED);
            module0642.f39075((SubLObject)$ic51$, (SubLObject)((NIL != var28) ? constants_high_oc.f10743(var28) : NIL), (SubLObject)$ic47$);
            module0642.f39074((SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0015.f799(module0015.$g539$.getDynamicValue(var29));
        }
        finally {
            module0015.$g539$.rebind(var33, var29);
            module0015.$g541$.rebind(var32, var29);
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42018(final SubLObject var6) {
        final SubLObject var7 = module0642.f39104((SubLObject)$ic43$, var6);
        final SubLObject var8 = module0656.f39957(var7, (SubLObject)UNPROVIDED);
        if (NIL == module0633.f38716(var8, (SubLObject)UNPROVIDED)) {
            return module0656.f39789((SubLObject)$ic53$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0635.f38802(var8, (SubLObject)T);
        return f42011((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42019(final SubLObject var6) {
        final SubLObject var7 = module0642.f39104((SubLObject)$ic51$, var6);
        final SubLObject var8 = module0656.f39957(var7, (SubLObject)UNPROVIDED);
        if (NIL == module0633.f38718(var8, (SubLObject)UNPROVIDED)) {
            return module0656.f39789((SubLObject)$ic55$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0635.f38803(var8, (SubLObject)T);
        return f42011((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42020(final SubLObject var20) {
        final SubLObject var21 = module0635.f38788(var20);
        final SubLObject var22 = module0059.f4256(var20);
        final SubLObject var23 = (SubLObject)((NIL != var21) ? module0424.f29842(var21) : NIL);
        SubLObject var24 = (SubLObject)NIL;
        final SubLObject var25 = var22;
        if (var25.eql((SubLObject)$ic57$) || var25.eql((SubLObject)$ic58$)) {
            var24 = (SubLObject)$ic59$;
        }
        else if (var25.eql((SubLObject)$ic60$) || var25.eql((SubLObject)$ic61$)) {
            var24 = (SubLObject)$ic62$;
        }
        else if (var25.eql((SubLObject)$ic63$)) {
            var24 = (SubLObject)$ic64$;
        }
        else if (var25.eql((SubLObject)$ic65$)) {
            if (var23.equal((SubLObject)$ic66$)) {
                var24 = (SubLObject)$ic59$;
            }
            else if (var23.equal((SubLObject)$ic67$) || var23.equal((SubLObject)$ic63$) || var23.equal((SubLObject)$ic68$)) {
                var24 = (SubLObject)$ic64$;
            }
            else if (var23.equal((SubLObject)$ic69$)) {
                var24 = (SubLObject)$ic62$;
            }
        }
        return var24;
    }
    
    public static SubLObject f42017(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0635.f38787(var20);
        final SubLObject var23 = module0635.f38788(var20);
        final SubLObject var24 = module0635.f38786(var20);
        final SubLObject var25 = (SubLObject)((NIL != module0424.f29729(var23) && var24 == $ic70$) ? module0424.f29937(var23) : NIL);
        final SubLObject var26 = module0059.f4256(var20);
        final SubLObject var27 = f42020(var20);
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        module0642.f39020(module0015.$g364$.getGlobalValue());
        if (NIL != var27) {
            module0642.f39020(module0015.$g366$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0015.$g533$.currentBinding(var21);
        try {
            module0015.$g533$.bind((SubLObject)T, var21);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_44 = module0015.$g533$.currentBinding(var21);
            try {
                module0015.$g533$.bind((SubLObject)T, var21);
                module0656.f39804(var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0633.f38716(var22, (SubLObject)UNPROVIDED)) {
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0656.f39837((SubLObject)$ic71$, var22, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0015.$g533$.rebind(var5_44, var21);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_45 = module0015.$g533$.currentBinding(var21);
            try {
                module0015.$g533$.bind((SubLObject)T, var21);
                module0642.f39019(var26);
                if (var24 == $ic70$) {
                    module0642.f39067();
                    module0656.f39837((SubLObject)$ic73$, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    final SubLObject var31 = (SubLObject)((NIL != module0424.f29714(var23)) ? module0424.f29851(var23) : NIL);
                    if (NIL != inference_datastructures_inference_oc.f25417(var31)) {}
                }
            }
            finally {
                module0015.$g533$.rebind(var5_45, var21);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_46 = module0015.$g533$.currentBinding(var21);
            try {
                module0015.$g533$.bind((SubLObject)T, var21);
                if (var26 == $ic57$ || var26 == $ic58$) {
                    module0656.f39837((SubLObject)$ic74$, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    module0656.f39837((SubLObject)$ic75$, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0015.$g533$.rebind(var5_46, var21);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_47 = module0015.$g533$.currentBinding(var21);
            try {
                module0015.$g533$.bind((SubLObject)T, var21);
                final SubLObject var32 = var26;
                if (var32.eql((SubLObject)$ic57$)) {
                    module0642.f39019((SubLObject)$ic76$);
                }
                else if (var32.eql((SubLObject)$ic58$)) {
                    module0642.f39019((SubLObject)$ic77$);
                }
                else if (var32.eql((SubLObject)$ic63$)) {
                    final SubLObject var33 = module0059.f4263(var20);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var21), (SubLObject)$ic78$, var33);
                }
                else if (var32.eql((SubLObject)$ic60$)) {
                    module0642.f39019((SubLObject)$ic79$);
                }
                else if (var32.eql((SubLObject)$ic65$)) {
                    if (NIL != module0633.f38716(var22, (SubLObject)UNPROVIDED)) {
                        var21.resetMultipleValues();
                        final SubLObject var34 = module0633.f38736(var22);
                        final SubLObject var35 = var21.secondMultipleValue();
                        var21.resetMultipleValues();
                        var28 = var34;
                        var29 = var35;
                    }
                    else if (NIL != module0633.f38718(var22, (SubLObject)UNPROVIDED)) {
                        var21.resetMultipleValues();
                        final SubLObject var34 = module0633.f38738(var22);
                        final SubLObject var35 = var21.secondMultipleValue();
                        var21.resetMultipleValues();
                        var28 = var34;
                        var29 = var35;
                    }
                    if (var28 == $ic80$) {
                        module0642.f39019(PrintLow.format((SubLObject)NIL, (SubLObject)$ic81$, var29));
                    }
                    else {
                        module0642.f39019(module0424.f29842(var23));
                        module0642.f39032((SubLObject)THREE_INTEGER);
                        module0656.f39837((SubLObject)$ic82$, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                else if (var32.eql((SubLObject)$ic61$)) {
                    module0642.f39019((SubLObject)$ic83$);
                }
                else {
                    Errors.error((SubLObject)$ic84$, var26);
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
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42021(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = (SubLObject)((NIL != $g5388$.getDynamicValue(var7)) ? $ic85$ : $ic86$);
        final SubLObject var9 = ConsesLow.nth((SubLObject)ZERO_INTEGER, var6);
        final SubLObject var10 = ConsesLow.nth((SubLObject)ONE_INTEGER, var6);
        final SubLObject var11 = ConsesLow.nth((SubLObject)TWO_INTEGER, var6);
        SubLObject var12 = (SubLObject)$ic87$;
        if (NIL != var9) {
            var12 = Sequences.cconcatenate(var12, new SubLObject[] { $ic88$, PrintLow.format((SubLObject)NIL, var9) });
            if (NIL != var10) {
                var12 = Sequences.cconcatenate(var12, new SubLObject[] { $ic88$, PrintLow.format((SubLObject)NIL, var10) });
                if (NIL != var11) {
                    var12 = Sequences.cconcatenate(var12, new SubLObject[] { $ic88$, PrintLow.format((SubLObject)NIL, var11) });
                }
            }
        }
        final SubLObject var13 = module0656.f39832((SubLObject)$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019(var12);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var13) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var13);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            module0642.f39019(var8);
        }
        finally {
            module0015.$g533$.rebind(var14, var7);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42022(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = var6.first();
        if (NIL != $g5388$.getDynamicValue(var7)) {
            $g5388$.setDynamicValue((SubLObject)NIL, var7);
        }
        else {
            $g5388$.setDynamicValue((SubLObject)T, var7);
        }
        if (var8.equal((SubLObject)$ic90$)) {
            return f42011((SubLObject)UNPROVIDED);
        }
        if (var8.equal((SubLObject)$ic91$)) {
            return f42023(var6.rest());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42024(final SubLObject var20, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL == var2) {
            var2 = (SubLObject)$ic93$;
        }
        final SubLObject var22 = module0656.f39832((SubLObject)$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var21), (SubLObject)$ic94$, module0635.f38785(var20));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var22) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var22);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var23 = module0015.$g533$.currentBinding(var21);
        try {
            module0015.$g533$.bind((SubLObject)T, var21);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var23, var21);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var20;
    }
    
    public static SubLObject f42025(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var7 = var6.first();
        final SubLObject var8 = (SubLObject)(Sequences.length(module0038.f2735(var7)).numG((SubLObject)ZERO_INTEGER) ? reader.read_from_string_ignoring_errors(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var9 = (SubLObject)((NIL != var8) ? module0635.f38795(var8) : NIL);
        if (NIL != module0059.f4212(var9)) {
            module0635.f38793(var9);
        }
        f42011((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42026(final SubLObject var20, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL == var2) {
            var2 = (SubLObject)$ic97$;
        }
        final SubLObject var22 = module0656.f39832((SubLObject)$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var21), (SubLObject)$ic98$, module0635.f38785(var20));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var22) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var22);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var23 = module0015.$g533$.currentBinding(var21);
        try {
            module0015.$g533$.bind((SubLObject)T, var21);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var23, var21);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var20;
    }
    
    public static SubLObject f42027(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var7 = var6.first();
        final SubLObject var8 = (SubLObject)(Sequences.length(module0038.f2735(var7)).numG((SubLObject)ZERO_INTEGER) ? reader.read_from_string_ignoring_errors(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var9 = (SubLObject)((NIL != var8) ? module0635.f38795(var8) : NIL);
        if (NIL != module0059.f4212(var9)) {
            module0635.f38798(var9);
        }
        f42011((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42028(final SubLObject var20, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL == var2) {
            var2 = (SubLObject)$ic101$;
        }
        final SubLObject var22 = module0656.f39832((SubLObject)$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var21), (SubLObject)$ic102$, module0635.f38785(var20));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var22) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var22);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var23 = module0015.$g533$.currentBinding(var21);
        try {
            module0015.$g533$.bind((SubLObject)T, var21);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var23, var21);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var20;
    }
    
    public static SubLObject f42029(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var7 = var6.first();
        final SubLObject var8 = (SubLObject)(Sequences.length(module0038.f2735(var7)).numG((SubLObject)ZERO_INTEGER) ? reader.read_from_string_ignoring_errors(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var9 = (SubLObject)((NIL != var8) ? module0635.f38795(var8) : NIL);
        if (NIL != module0059.f4212(var9)) {
            final SubLObject var10 = module0635.f38788(var9);
            final SubLObject var12;
            final SubLObject var11 = var12 = module0635.f38786(var9);
            if (var12.eql((SubLObject)$ic104$)) {
                return f42030(var10, (SubLObject)$ic105$);
            }
            if (var12.eql((SubLObject)$ic70$)) {
                return f42031(var10, (SubLObject)$ic105$);
            }
            Errors.error((SubLObject)$ic106$, var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42032(final SubLObject var20, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL == var2) {
            var2 = (SubLObject)$ic108$;
        }
        final SubLObject var22 = module0656.f39832((SubLObject)$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var21), (SubLObject)$ic109$, module0635.f38785(var20));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var22) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var22);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var23 = module0015.$g533$.currentBinding(var21);
        try {
            module0015.$g533$.bind((SubLObject)T, var21);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var23, var21);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var20;
    }
    
    public static SubLObject f42023(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = var6.first();
        final SubLObject var9 = (SubLObject)(Sequences.length(module0038.f2735(var8)).numG((SubLObject)ZERO_INTEGER) ? reader.read_from_string_ignoring_errors(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var10 = (SubLObject)((NIL != var9) ? module0635.f38795(var9) : NIL);
        if (NIL != module0059.f4212(var10)) {
            final SubLObject var11 = module0635.f38788(var10);
            final SubLObject var12 = module0424.f29838(var11);
            final SubLObject var13 = (SubLObject)((NIL != module0424.f29729(var11)) ? module0424.f29937(var11) : NIL);
            final SubLObject var14 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic111$, var12);
            module0642.f39020((SubLObject)$ic19$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
            final SubLObject var15 = module0014.f672((SubLObject)$ic20$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var15) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var15);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic22$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            module0642.f39019(var14);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            if (NIL != $g5388$.getDynamicValue(var7)) {
                final SubLObject var16 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic112$, var9);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g166$.getGlobalValue());
                module0642.f39020(module0015.$g167$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic23$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var16) {
                    module0642.f39020(module0015.$g168$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var16);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var17 = module0015.$g132$.getDynamicValue(var7);
            final SubLObject var18 = module0015.$g535$.currentBinding(var7);
            try {
                module0015.$g535$.bind((SubLObject)T, var7);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != var17) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(var17));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_60 = module0015.$g533$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)T, var7);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)ONE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0642.f39019(var14);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)ONE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL == var13) {
                        module0642.f39021((SubLObject)$ic113$);
                    }
                    else {
                        module0642.f39028((SubLObject)UNPROVIDED);
                        final SubLObject var19 = module0059.f4256(var10);
                        if (var19.eql((SubLObject)$ic57$) || var19.eql((SubLObject)$ic58$)) {
                            module0656.f39837((SubLObject)$ic28$, (SubLObject)ConsesLow.cons((SubLObject)$ic91$, var6), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var19.eql((SubLObject)$ic60$)) {
                            module0642.f39021((SubLObject)$ic114$);
                            $g5388$.setDynamicValue((SubLObject)NIL, var7);
                        }
                        else {
                            module0642.f39021((SubLObject)$ic115$);
                            $g5388$.setDynamicValue((SubLObject)NIL, var7);
                        }
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)THREE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g357$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic25$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_61 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var7);
                            SubLObject var20 = var13;
                            SubLObject var21 = (SubLObject)NIL;
                            var21 = var20.first();
                            while (NIL != var20) {
                                final SubLObject var38_63 = module0424.f29840(var21);
                                final SubLObject var22 = module0424.f29851(var21);
                                final SubLObject var23 = module0424.f29846(var21);
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39020(module0015.$g366$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic26$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_62 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var7);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var5_63 = module0015.$g533$.currentBinding(var7);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var7);
                                        module0656.f39804(var38_63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_63, var7);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var5_64 = module0015.$g533$.currentBinding(var7);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var7);
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
                                module0642.f39029((SubLObject)UNPROVIDED);
                                if (var23 == $ic65$) {
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g366$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)$ic26$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var5_65 = module0015.$g533$.currentBinding(var7);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var7);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g371$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)THREE_INTEGER);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var5_66 = module0015.$g533$.currentBinding(var7);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var7);
                                            f42030(var21, (SubLObject)$ic105$);
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
                                    module0642.f39029((SubLObject)UNPROVIDED);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_60, var7);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var18, var7);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42031(final SubLObject var33, final SubLObject var70) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        final SubLObject var72 = (SubLObject)$ic119$;
        final SubLObject var73 = module0015.$g538$.currentBinding(var71);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var71))) ? module0015.$g538$.getDynamicValue(var71) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var71);
            module0642.f39020((SubLObject)$ic19$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var71), module0655.$g5142$.getDynamicValue(var71));
            final SubLObject var74 = module0014.f672((SubLObject)$ic20$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var74) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var74);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic22$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var72) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var72);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var5_72 = module0015.$g535$.currentBinding(var71);
            try {
                module0015.$g535$.bind((SubLObject)T, var71);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var71)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var71)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic122$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_73 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)T, var71);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic123$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_74 = module0015.$g533$.currentBinding(var71);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var71);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic124$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic125$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic126$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_74, var71);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var72) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var72);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0656.f39870((SubLObject)$ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39046(module0015.$g348$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g353$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g354$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_75 = module0015.$g533$.currentBinding(var71);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var71);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_76 = module0015.$g533$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var71);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_77 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var71);
                                module0642.f39019((SubLObject)$ic127$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_77, var71);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_78 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var71);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_79 = module0015.$g533$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var71);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_80 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var71);
                                module0642.f39019((SubLObject)$ic128$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_80, var71);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_81 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var71);
                                module0642.f39019((SubLObject)$ic129$);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_82 = module0015.$g533$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var71);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_83 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var71);
                                module0642.f39019((SubLObject)$ic130$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_83, var71);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_84 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var71);
                                module0642.f39019((SubLObject)$ic129$);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_85 = module0015.$g533$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var71);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_86 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var71);
                                module0642.f39019((SubLObject)$ic131$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_86, var71);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_87 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var71);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_88 = module0015.$g533$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var71);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_89 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var71);
                                module0642.f39019((SubLObject)$ic132$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_89, var71);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_90 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var71);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_75, var71);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic133$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var75 = module0424.f29937(var33);
                    SubLObject var76 = (SubLObject)NIL;
                    var76 = var75.first();
                    while (NIL != var75) {
                        f42030(var76, var70);
                        var75 = var75.rest();
                        var76 = var75.first();
                    }
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_73, var71);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5_72, var71);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var73, var71);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42030(final SubLObject var91, final SubLObject var70) {
        final SubLThread var92 = SubLProcess.currentSubLThread();
        assert NIL != module0424.f29714(var91) : var91;
        final SubLObject var93 = module0424.f29838(var91);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic135$);
        module0656.f39804(var93, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39067();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var94 = module0015.$g533$.currentBinding(var92);
        try {
            module0015.$g533$.bind((SubLObject)T, var92);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_93 = module0015.$g533$.currentBinding(var92);
            try {
                module0015.$g533$.bind((SubLObject)T, var92);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_94 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)T, var92);
                    module0642.f39019((SubLObject)$ic136$);
                }
                finally {
                    module0015.$g533$.rebind(var5_94, var92);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_95 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)T, var92);
                    module0656.f39804(module0633.f38713(var93, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_96 = module0015.$g533$.currentBinding(var92);
            try {
                module0015.$g533$.bind((SubLObject)T, var92);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_97 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)T, var92);
                    module0642.f39019((SubLObject)$ic137$);
                }
                finally {
                    module0015.$g533$.rebind(var5_97, var92);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_98 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)T, var92);
                    module0656.f39804(module0423.f29562(module0633.f38713(var93, (SubLObject)UNPROVIDED)).first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_99 = module0015.$g533$.currentBinding(var92);
            try {
                module0015.$g533$.bind((SubLObject)T, var92);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_100 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)T, var92);
                    module0642.f39019((SubLObject)$ic138$);
                }
                finally {
                    module0015.$g533$.rebind(var5_100, var92);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_101 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)T, var92);
                    final SubLObject var95 = module0424.f29842(var91);
                    if ($ic67$ == var95) {
                        final SubLObject var96 = (SubLObject)$ic139$;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != var96) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(var96));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_102 = module0015.$g533$.currentBinding(var92);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var92);
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0642.f39019(var95);
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_102, var92);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                    }
                    else if ($ic66$ == var95) {
                        final SubLObject var96 = (SubLObject)$ic140$;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != var96) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(var96));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_103 = module0015.$g533$.currentBinding(var92);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var92);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            if (module0424.f29842(var91) == $ic67$) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_104 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)T, var92);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_105 = module0015.$g533$.currentBinding(var92);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var92);
                        module0642.f39019((SubLObject)$ic132$);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_105, var92);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_106 = module0015.$g533$.currentBinding(var92);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var92);
                        module0015.f741();
                        module0642.f39020(module0015.$g203$.getGlobalValue());
                        final SubLObject var5_107 = module0015.$g537$.currentBinding(var92);
                        try {
                            module0015.$g537$.bind((SubLObject)T, var92);
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
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            SubLObject var97 = module0424.f29731(module0633.f38724(module0424.f29840(var91), (SubLObject)UNPROVIDED));
            SubLObject var98 = (SubLObject)NIL;
            var98 = var97.first();
            while (NIL != var97) {
                final SubLObject var99 = module0424.f29912(var91, var98);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_108 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)T, var92);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_109 = module0015.$g533$.currentBinding(var92);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var92);
                        module0642.f39019(var98);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_109, var92);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_110 = module0015.$g533$.currentBinding(var92);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var92);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                var97 = var97.rest();
                var98 = var97.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var94, var92);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42033(final SubLObject var46, final SubLObject var114) {
        final SubLThread var115 = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference_oc.f25275(var46) : var46;
        assert NIL != module0633.f38716(var114, (SubLObject)UNPROVIDED) : var114;
        return Hashtables.sethash(var46, $g5389$.getDynamicValue(var115), var114);
    }
    
    public static SubLObject f42034(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference_oc.f25275(var46) : var46;
        return Hashtables.remhash(var46, $g5389$.getDynamicValue(var47));
    }
    
    public static SubLObject f42035(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference_oc.f25275(var46) : var46;
        return Hashtables.gethash(var46, $g5389$.getDynamicValue(var47), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42036(final SubLObject var115, final SubLObject var116) {
        compatibility.default_struct_print_function(var115, var116, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42037(final SubLObject var115) {
        return (SubLObject)((var115.getClass() == $sX46003_native.class) ? T : NIL);
    }
    
    public static SubLObject f42038(final SubLObject var115) {
        assert NIL != f42037(var115) : var115;
        return var115.getField2();
    }
    
    public static SubLObject f42039(final SubLObject var115) {
        assert NIL != f42037(var115) : var115;
        return var115.getField3();
    }
    
    public static SubLObject f42040(final SubLObject var115) {
        assert NIL != f42037(var115) : var115;
        return var115.getField4();
    }
    
    public static SubLObject f42041(final SubLObject var115) {
        assert NIL != f42037(var115) : var115;
        return var115.getField5();
    }
    
    public static SubLObject f42042(final SubLObject var115) {
        assert NIL != f42037(var115) : var115;
        return var115.getField6();
    }
    
    public static SubLObject f42043(final SubLObject var115) {
        assert NIL != f42037(var115) : var115;
        return var115.getField7();
    }
    
    public static SubLObject f42044(final SubLObject var115) {
        assert NIL != f42037(var115) : var115;
        return var115.getField8();
    }
    
    public static SubLObject f42045(final SubLObject var115) {
        assert NIL != f42037(var115) : var115;
        return var115.getField9();
    }
    
    public static SubLObject f42046(final SubLObject var115) {
        assert NIL != f42037(var115) : var115;
        return var115.getField10();
    }
    
    public static SubLObject f42047(final SubLObject var115) {
        assert NIL != f42037(var115) : var115;
        return var115.getField11();
    }
    
    public static SubLObject f42048(final SubLObject var115) {
        assert NIL != f42037(var115) : var115;
        return var115.getField12();
    }
    
    public static SubLObject f42049(final SubLObject var115) {
        assert NIL != f42037(var115) : var115;
        return var115.getField13();
    }
    
    public static SubLObject f42050(final SubLObject var115) {
        assert NIL != f42037(var115) : var115;
        return var115.getField14();
    }
    
    public static SubLObject f42051(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42037(var115) : var115;
        return var115.setField2(var117);
    }
    
    public static SubLObject f42052(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42037(var115) : var115;
        return var115.setField3(var117);
    }
    
    public static SubLObject f42053(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42037(var115) : var115;
        return var115.setField4(var117);
    }
    
    public static SubLObject f42054(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42037(var115) : var115;
        return var115.setField5(var117);
    }
    
    public static SubLObject f42055(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42037(var115) : var115;
        return var115.setField6(var117);
    }
    
    public static SubLObject f42056(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42037(var115) : var115;
        return var115.setField7(var117);
    }
    
    public static SubLObject f42057(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42037(var115) : var115;
        return var115.setField8(var117);
    }
    
    public static SubLObject f42058(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42037(var115) : var115;
        return var115.setField9(var117);
    }
    
    public static SubLObject f42059(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42037(var115) : var115;
        return var115.setField10(var117);
    }
    
    public static SubLObject f42060(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42037(var115) : var115;
        return var115.setField11(var117);
    }
    
    public static SubLObject f42061(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42037(var115) : var115;
        return var115.setField12(var117);
    }
    
    public static SubLObject f42062(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42037(var115) : var115;
        return var115.setField13(var117);
    }
    
    public static SubLObject f42063(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42037(var115) : var115;
        return var115.setField14(var117);
    }
    
    public static SubLObject f42064(SubLObject var118) {
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)NIL;
        }
        final SubLObject var119 = (SubLObject)new $sX46003_native();
        SubLObject var120;
        SubLObject var121;
        SubLObject var122;
        SubLObject var123;
        for (var120 = (SubLObject)NIL, var120 = var118; NIL != var120; var120 = conses_high.cddr(var120)) {
            var121 = var120.first();
            var122 = conses_high.cadr(var120);
            var123 = var121;
            if (var123.eql((SubLObject)$ic179$)) {
                f42051(var119, var122);
            }
            else if (var123.eql((SubLObject)$ic180$)) {
                f42052(var119, var122);
            }
            else if (var123.eql((SubLObject)$ic181$)) {
                f42053(var119, var122);
            }
            else if (var123.eql((SubLObject)$ic182$)) {
                f42054(var119, var122);
            }
            else if (var123.eql((SubLObject)$ic183$)) {
                f42055(var119, var122);
            }
            else if (var123.eql((SubLObject)$ic184$)) {
                f42056(var119, var122);
            }
            else if (var123.eql((SubLObject)$ic185$)) {
                f42057(var119, var122);
            }
            else if (var123.eql((SubLObject)$ic186$)) {
                f42058(var119, var122);
            }
            else if (var123.eql((SubLObject)$ic187$)) {
                f42059(var119, var122);
            }
            else if (var123.eql((SubLObject)$ic188$)) {
                f42060(var119, var122);
            }
            else if (var123.eql((SubLObject)$ic189$)) {
                f42061(var119, var122);
            }
            else if (var123.eql((SubLObject)$ic190$)) {
                f42062(var119, var122);
            }
            else if (var123.eql((SubLObject)$ic191$)) {
                f42063(var119, var122);
            }
            else {
                Errors.error((SubLObject)$ic192$, var121);
            }
        }
        return var119;
    }
    
    public static SubLObject f42065(final SubLObject var123, final SubLObject var124) {
        Functions.funcall(var124, var123, (SubLObject)$ic193$, (SubLObject)$ic194$, (SubLObject)THIRTEEN_INTEGER);
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic179$, f42038(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic180$, f42039(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic181$, f42040(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic182$, f42041(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic183$, f42042(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic184$, f42043(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic185$, f42044(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic186$, f42045(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic187$, f42046(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic188$, f42047(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic189$, f42048(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic190$, f42049(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic191$, f42050(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic196$, (SubLObject)$ic194$, (SubLObject)THIRTEEN_INTEGER);
        return var123;
    }
    
    public static SubLObject f42066(final SubLObject var123, final SubLObject var124) {
        return f42065(var123, var124);
    }
    
    public static SubLObject f42067(final SubLObject var125, final SubLObject var126) {
        assert NIL != f42037(var125) : var125;
        assert NIL != Types.stringp(var126) : var126;
        f42062(var125, (SubLObject)ConsesLow.cons(var126, f42049(var125)));
        return f42049(var125);
    }
    
    public static SubLObject f42068(final SubLObject var125, final SubLObject var39, final SubLObject var127) {
        assert NIL != f42037(var125) : var125;
        if (NIL != var127 && !areAssertionsDisabledFor(me) && NIL == Types.integerp(var127)) {
            throw new AssertionError(var127);
        }
        if (NIL == module0004.f104(var39, (SubLObject)$ic200$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic201$, var39);
        }
        f42063(var125, conses_high.putf(f42050(var125), var39, var127));
        return f42050(var125);
    }
    
    public static SubLObject f42069(final SubLObject var114) {
        assert NIL != module0633.f38716(var114, (SubLObject)UNPROVIDED) : var114;
        final SubLObject var115 = f42064((SubLObject)UNPROVIDED);
        final SubLObject var116 = module0633.f38713(var114, (SubLObject)UNPROVIDED);
        final SubLObject var117 = module0682.f41658(var116, var115);
        final SubLObject var118 = module0633.f38733(var114);
        f42051(var115, var114);
        f42052(var115, module0656.f39942(var114));
        f42053(var115, module0633.f38720(var114, (SubLObject)UNPROVIDED));
        f42054(var115, var117);
        f42055(var115, var118);
        f42057(var115, module0065.f4745((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f42058(var115, module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        f42063(var115, module0035.f2333((SubLObject)$ic200$, (SubLObject)$ic202$));
        final SubLObject var119 = module0633.f38726(var114, var118);
        final SubLObject var120 = module0633.f38727(var114, var118);
        final SubLObject var121 = module0633.f38728(var114, var118);
        final SubLObject var122 = module0633.f38729(var114, var118);
        final SubLObject var123 = module0633.f38730(var114, var118);
        final SubLObject var124 = module0633.f38731(var114, var118);
        final SubLObject var125 = module0633.f38732(var114, var118);
        f42068(var115, (SubLObject)$ic203$, var123);
        f42068(var115, (SubLObject)$ic204$, var124);
        f42068(var115, (SubLObject)$ic205$, var125);
        if (NIL != var122) {
            f42056(var115, (SubLObject)$ic206$);
        }
        else if (NIL != var119 || NIL != module0633.f38725(var114, var118)) {
            f42056(var115, (SubLObject)$ic207$);
            SubLObject var126 = var119;
            SubLObject var127 = (SubLObject)NIL;
            var127 = var126.first();
            while (NIL != var126) {
                f42070(var127, var115, (SubLObject)$ic208$);
                var126 = var126.rest();
                var127 = var126.first();
            }
        }
        else if (NIL != var120 || NIL != var121) {
            f42056(var115, (SubLObject)$ic209$);
            SubLObject var126 = var120;
            SubLObject var127 = (SubLObject)NIL;
            var127 = var126.first();
            while (NIL != var126) {
                if (NIL != module0233.f15359(var127)) {
                    f42070(var127, var115, (SubLObject)$ic208$);
                }
                else {
                    f42067(var115, Sequences.cconcatenate((SubLObject)$ic210$, new SubLObject[] { module0006.f203(var127), $ic211$ }));
                }
                var126 = var126.rest();
                var127 = var126.first();
            }
            var126 = var121;
            var127 = (SubLObject)NIL;
            var127 = var126.first();
            while (NIL != var126) {
                if (NIL != module0233.f15359(var127)) {
                    f42070(var127, var115, (SubLObject)$ic212$);
                }
                else {
                    f42067(var115, Sequences.cconcatenate((SubLObject)$ic213$, new SubLObject[] { module0006.f203(var127), $ic211$ }));
                }
                var126 = var126.rest();
                var127 = var126.first();
            }
        }
        else {
            f42056(var115, (SubLObject)$ic214$);
        }
        f42059(var115, module0633.f38719(var114, var118));
        f42060(var115, module0633.f38724(var114, var118));
        f42061(var115, module0633.f38722(var114, (SubLObject)UNPROVIDED));
        return var115;
    }
    
    public static SubLObject f42071(final SubLObject var46) {
        assert NIL != inference_datastructures_inference_oc.f25275(var46) : var46;
        final SubLObject var47 = f42064((SubLObject)UNPROVIDED);
        final SubLObject var48 = module0682.f41659(var46, var47);
        f42051(var47, f42035(var46));
        f42054(var47, var48);
        f42055(var47, module0632.f38705());
        f42057(var47, module0065.f4745((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f42058(var47, module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        f42063(var47, module0035.f2333((SubLObject)$ic200$, (SubLObject)$ic202$));
        return var47;
    }
    
    public static SubLObject f42072(final SubLObject var125) {
        return f42073(var125, (SubLObject)$ic207$, (SubLObject)$ic208$);
    }
    
    public static SubLObject f42074(final SubLObject var125) {
        return f42073(var125, (SubLObject)$ic209$, (SubLObject)$ic208$);
    }
    
    public static SubLObject f42075(final SubLObject var125) {
        return f42073(var125, (SubLObject)$ic209$, (SubLObject)$ic212$);
    }
    
    public static SubLObject f42076(final SubLObject var125) {
        return f42073(var125, (SubLObject)NIL, (SubLObject)$ic214$);
    }
    
    public static SubLObject f42077(final SubLObject var125) {
        return Equality.eq(f42043(var125), (SubLObject)$ic206$);
    }
    
    public static SubLObject f42078(final SubLObject var125) {
        return (SubLObject)makeBoolean(f42043(var125) == $ic207$ && NIL == f42072(var125));
    }
    
    public static SubLObject f42073(final SubLObject var125, final SubLObject var139, final SubLObject var140) {
        if (NIL != var139 && !f42043(var125).eql(var139)) {
            return (SubLObject)NIL;
        }
        SubLObject var141 = (SubLObject)NIL;
        final SubLObject var143;
        final SubLObject var142 = var143 = f42044(var125);
        if (NIL == module0065.f4772(var143, (SubLObject)$ic215$)) {
            final SubLObject var144_145 = var143;
            if (NIL == module0065.f4775(var144_145, (SubLObject)$ic215$)) {
                final SubLObject var144 = module0065.f4740(var144_145);
                final SubLObject var145 = (SubLObject)NIL;
                SubLObject var146;
                SubLObject var147;
                SubLObject var148;
                SubLObject var149;
                for (var146 = Sequences.length(var144), var147 = (SubLObject)NIL, var147 = (SubLObject)ZERO_INTEGER; var147.numL(var146); var147 = Numbers.add(var147, (SubLObject)ONE_INTEGER)) {
                    var148 = ((NIL != var145) ? Numbers.subtract(var146, var147, (SubLObject)ONE_INTEGER) : var147);
                    var149 = Vectors.aref(var144, var148);
                    if (NIL == module0065.f4749(var149) || NIL == module0065.f4773((SubLObject)$ic215$)) {
                        if (NIL != module0065.f4749(var149)) {
                            var149 = (SubLObject)$ic215$;
                        }
                        if (f42079(var149).eql(var140)) {
                            var141 = (SubLObject)ConsesLow.cons(f42080(var149), var141);
                        }
                    }
                }
            }
            final SubLObject var151_152 = var143;
            if (NIL == module0065.f4777(var151_152)) {
                final SubLObject var150 = module0065.f4738(var151_152);
                SubLObject var151 = (SubLObject)NIL;
                SubLObject var152 = (SubLObject)NIL;
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
        $g5391$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42082() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return $g5391$.getDynamicValue(var3);
    }
    
    public static SubLObject f42083(final SubLObject var156) {
        $g5391$.setDynamicValue(var156);
        return var156;
    }
    
    public static SubLObject f42084(final SubLObject var115, final SubLObject var116) {
        compatibility.default_struct_print_function(var115, var116, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42085(final SubLObject var115) {
        return (SubLObject)((var115.getClass() == $sX46004_native.class) ? T : NIL);
    }
    
    public static SubLObject f42080(final SubLObject var115) {
        assert NIL != f42085(var115) : var115;
        return var115.getField2();
    }
    
    public static SubLObject f42079(final SubLObject var115) {
        assert NIL != f42085(var115) : var115;
        return var115.getField3();
    }
    
    public static SubLObject f42086(final SubLObject var115) {
        assert NIL != f42085(var115) : var115;
        return var115.getField4();
    }
    
    public static SubLObject f42087(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42085(var115) : var115;
        return var115.setField2(var117);
    }
    
    public static SubLObject f42088(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42085(var115) : var115;
        return var115.setField3(var117);
    }
    
    public static SubLObject f42089(final SubLObject var115, final SubLObject var117) {
        assert NIL != f42085(var115) : var115;
        return var115.setField4(var117);
    }
    
    public static SubLObject f42090(SubLObject var118) {
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)NIL;
        }
        final SubLObject var119 = (SubLObject)new $sX46004_native();
        SubLObject var120;
        SubLObject var121;
        SubLObject var122;
        SubLObject var123;
        for (var120 = (SubLObject)NIL, var120 = var118; NIL != var120; var120 = conses_high.cddr(var120)) {
            var121 = var120.first();
            var122 = conses_high.cadr(var120);
            var123 = var121;
            if (var123.eql((SubLObject)$ic231$)) {
                f42087(var119, var122);
            }
            else if (var123.eql((SubLObject)$ic232$)) {
                f42088(var119, var122);
            }
            else if (var123.eql((SubLObject)$ic233$)) {
                f42089(var119, var122);
            }
            else {
                Errors.error((SubLObject)$ic192$, var121);
            }
        }
        return var119;
    }
    
    public static SubLObject f42091(final SubLObject var123, final SubLObject var124) {
        Functions.funcall(var124, var123, (SubLObject)$ic193$, (SubLObject)$ic234$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic231$, f42080(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic232$, f42079(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic195$, (SubLObject)$ic233$, f42086(var123));
        Functions.funcall(var124, var123, (SubLObject)$ic196$, (SubLObject)$ic234$, (SubLObject)THREE_INTEGER);
        return var123;
    }
    
    public static SubLObject f42092(final SubLObject var123, final SubLObject var124) {
        return f42091(var123, var124);
    }
    
    public static SubLObject f42070(final SubLObject var138, final SubLObject var125, SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)$ic214$;
        }
        assert NIL != module0233.f15359(var138) : var138;
        assert NIL != f42037(var125) : var125;
        assert NIL != Types.keywordp(var41) : var41;
        final SubLObject var139 = f42044(var125);
        final SubLObject var140 = f42045(var125);
        final SubLObject var141 = module0065.f4746(var139);
        final SubLObject var142 = f42090((SubLObject)UNPROVIDED);
        f42087(var142, var138);
        f42088(var142, var41);
        f42089(var142, var141);
        module0065.f4753(var139, var141, var142);
        module0067.f4886(var140, var138, var142);
        return var142;
    }
    
    public static SubLObject f42093(final SubLObject var125) {
        assert NIL != f42037(var125) : var125;
        final SubLObject var126 = f42044(var125);
        return module0065.f4733(var126);
    }
    
    public static SubLObject f42094(final SubLObject var125, final SubLObject var58) {
        assert NIL != f42037(var125) : var125;
        final SubLObject var126 = f42044(var125);
        return module0065.f4750(var126, var58, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42095(final SubLObject var125, final SubLObject var138) {
        assert NIL != f42037(var125) : var125;
        assert NIL != module0233.f15359(var138) : var138;
        final SubLObject var139 = f42045(var125);
        return module0067.f4884(var139, var138, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42096(final SubLObject var125, final SubLObject var58) {
        assert NIL != f42037(var125) : var125;
        final SubLObject var126 = f42044(var125);
        return module0065.f4761(var126, var58);
    }
    
    public static SubLObject f42097(final SubLObject var150, final SubLObject var41) {
        assert NIL != f42085(var150) : var150;
        assert NIL != Types.keywordp(var41) : var41;
        f42088(var150, var41);
        return var150;
    }
    
    public static SubLObject f42098(final SubLObject var114, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var115 = SubLProcess.currentSubLThread();
        if (NIL == var2) {
            var2 = (SubLObject)$ic72$;
        }
        assert NIL != module0633.f38716(var114, (SubLObject)UNPROVIDED) : var114;
        final SubLObject var116 = module0656.f39832((SubLObject)$ic1$);
        if ($ic238$.isString()) {
            final SubLObject var117 = module0644.f39202((SubLObject)$ic238$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var115), (SubLObject)$ic239$, module0656.f39842(var114));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var116) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var116);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var117);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic240$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var118 = module0015.$g533$.currentBinding(var115);
            try {
                module0015.$g533$.bind((SubLObject)T, var115);
                module0642.f39019(var2);
            }
            finally {
                module0015.$g533$.rebind(var118, var115);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42099(final SubLObject var6) {
        final SubLObject var7 = module0656.f39943(var6.first(), (SubLObject)UNPROVIDED);
        if (NIL == module0633.f38716(var7, (SubLObject)UNPROVIDED)) {
            return module0656.f39789((SubLObject)$ic242$, var6.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f42083(f42069(var7));
        module0682.f41666(f42041(f42082()));
        f42100(var7);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42101(final SubLObject var46, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        if (NIL == var2) {
            var2 = (SubLObject)$ic244$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var46) : var46;
        final SubLObject var48 = module0656.f39832((SubLObject)$ic245$);
        if ($ic246$.isString()) {
            final SubLObject var49 = module0644.f39202((SubLObject)$ic246$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic247$, module0361.f23996(inference_datastructures_inference_oc.f25421(var46)), inference_datastructures_inference_oc.f25422(var46));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var48) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var48);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var49);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic240$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var50 = module0015.$g533$.currentBinding(var47);
            try {
                module0015.$g533$.bind((SubLObject)T, var47);
                module0642.f39019(var2);
            }
            finally {
                module0015.$g533$.rebind(var50, var47);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42102(final SubLObject var6) {
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var6, (SubLObject)$ic250$);
        var7 = var6.first();
        SubLObject var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var6, (SubLObject)$ic250$);
        var8 = var9.first();
        var9 = var9.rest();
        if (NIL != var9) {
            cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic250$);
            return (SubLObject)NIL;
        }
        final SubLObject var10 = reader.parse_integer(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var11 = reader.parse_integer(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0361.f24195(var10, var11);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? f42035(var12) : NIL);
        if (NIL == var12) {
            return module0656.f39789((SubLObject)$ic251$, var11, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f42083(f42071(var12));
        module0682.f41666(f42041(f42082()));
        if (NIL != module0633.f38716(var13, (SubLObject)UNPROVIDED)) {
            f42051(f42082(), var13);
        }
        return f42100(var13);
    }
    
    public static SubLObject f42100(SubLObject var114) {
        if (var114 == UNPROVIDED) {
            var114 = (SubLObject)NIL;
        }
        final SubLThread var115 = SubLProcess.currentSubLThread();
        final SubLObject var116 = (SubLObject)((NIL != var114) ? $ic253$ : $ic254$);
        final SubLObject var117 = module0644.f39214(module0644.$g5024$.getGlobalValue());
        final SubLObject var118 = module0015.$g538$.currentBinding(var115);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var115))) ? module0015.$g538$.getDynamicValue(var115) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var115);
            module0642.f39020((SubLObject)$ic19$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var115), module0655.$g5142$.getDynamicValue(var115));
            final SubLObject var119 = module0014.f672((SubLObject)$ic20$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var119) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var119);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic22$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            module0642.f39019(var116);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            module0666.f40471();
            module0644.f39213();
            module0016.f892();
            module0016.f895();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var5_170 = module0015.$g535$.currentBinding(var115);
            try {
                module0015.$g535$.bind((SubLObject)T, var115);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_171 = module0015.$g533$.currentBinding(var115);
                try {
                    module0015.$g533$.bind((SubLObject)T, var115);
                    module0644.f39197();
                    final SubLObject var120 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var115));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic40$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var120) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var120);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39032((SubLObject)ONE_INTEGER);
                    module0642.f39020(var117);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_172 = module0015.$g533$.currentBinding(var115);
                    final SubLObject var121 = module0015.$g541$.currentBinding(var115);
                    final SubLObject var122 = module0015.$g539$.currentBinding(var115);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var115);
                        module0015.$g541$.bind((SubLObject)T, var115);
                        module0015.$g539$.bind(module0015.f797(), var115);
                        module0642.f39069((SubLObject)$ic255$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                        f42103(var116);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f42104((SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0683.f41737(module0682.f41660(module0682.f41665()), module0682.f41662(module0682.f41665()), (SubLObject)NIL);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0684.f41943();
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0683.f41738(module0682.f41660(module0682.f41665()), (SubLObject)NIL);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0684.f41944();
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0683.f41739(module0682.f41639(module0682.f41665()), (SubLObject)NIL);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0684.f41945((SubLObject)UNPROVIDED);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        f42105((SubLObject)UNPROVIDED);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        f42106((SubLObject)UNPROVIDED);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        f42107((SubLObject)UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var115));
                    }
                    finally {
                        module0015.$g539$.rebind(var122, var115);
                        module0015.$g541$.rebind(var121, var115);
                        module0015.$g533$.rebind(var5_172, var115);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_171, var115);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5_170, var115);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var118, var115);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42103(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = (SubLObject)FIVE_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var10) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0015.$g533$.currentBinding(var9);
        try {
            module0015.$g533$.bind((SubLObject)T, var9);
            module0683.f41676(var8, (SubLObject)$ic256$, (SubLObject)$ic257$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var11, var9);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0683.f41676((SubLObject)$ic258$, (SubLObject)$ic259$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0683.f41677((SubLObject)$ic260$, (SubLObject)$ic261$, (SubLObject)$ic262$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0683.f41677((SubLObject)$ic263$, (SubLObject)$ic264$, (SubLObject)$ic265$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0683.f41677((SubLObject)$ic266$, (SubLObject)$ic267$, (SubLObject)$ic268$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0683.f41677((SubLObject)$ic269$, (SubLObject)$ic270$, (SubLObject)$ic271$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0683.f41677((SubLObject)$ic272$, (SubLObject)$ic273$, (SubLObject)$ic274$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0683.f41677((SubLObject)$ic275$, (SubLObject)$ic276$, (SubLObject)$ic277$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != f42049(f42082())) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic278$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            SubLObject var12 = f42049(f42082());
            SubLObject var13 = (SubLObject)NIL;
            var13 = var12.first();
            while (NIL != var12) {
                module0642.f39019(var13);
                module0642.f39026((SubLObject)UNPROVIDED);
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42104(SubLObject var174) {
        if (var174 == UNPROVIDED) {
            var174 = (SubLObject)T;
        }
        final SubLThread var175 = SubLProcess.currentSubLThread();
        module0642.f39026((SubLObject)UNPROVIDED);
        final SubLObject var176 = f42039(f42082());
        final SubLObject var177 = f42038(f42082());
        module0642.f39032((SubLObject)UNPROVIDED);
        module0683.f41676((SubLObject)$ic279$, (SubLObject)$ic280$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var174) {
            module0642.f39075((SubLObject)$ic281$, var176, (SubLObject)$ic47$);
        }
        else {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            if (NIL != var177) {
                module0656.f39804(var177, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                module0642.f39019(var176);
            }
            module0642.f39020(module0015.$g235$.getGlobalValue());
        }
        if (NIL != var174) {
            module0642.f39032((SubLObject)UNPROVIDED);
            module0683.f41678((SubLObject)$ic282$, (SubLObject)$ic283$, (SubLObject)$ic284$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0642.f39026((SubLObject)TWO_INTEGER);
        if (NIL != var174) {
            module0642.f39073((SubLObject)$ic285$);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        module0016.f920((SubLObject)$ic286$, (SubLObject)$ic287$, (SubLObject)$ic288$);
        final SubLObject var178 = (SubLObject)$ic289$;
        final SubLObject var179 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var179) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var179);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var180 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)T, var175);
            module0683.f41676((SubLObject)$ic290$, (SubLObject)$ic291$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var180, var175);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)$ic286$, var178, (SubLObject)$ic292$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic286$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var180 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)T, var175);
            if (NIL != var174) {
                module0657.f39992(f42042(f42082()), (SubLObject)$ic293$);
            }
            else {
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0656.f39804(f42042(f42082()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
        }
        finally {
            module0015.$g533$.rebind(var180, var175);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42105(SubLObject var174) {
        if (var174 == UNPROVIDED) {
            var174 = (SubLObject)T;
        }
        final SubLThread var175 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)$ic269$);
        module0016.f920((SubLObject)$ic294$, (SubLObject)$ic287$, (SubLObject)$ic288$);
        final SubLObject var176 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var176) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var176);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var177 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)T, var175);
            module0683.f41676((SubLObject)$ic295$, (SubLObject)$ic296$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var177, var175);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)$ic294$, (SubLObject)$ic297$, (SubLObject)$ic292$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic294$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var178 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)T, var175);
            SubLObject var179 = f42046(f42082());
            final SubLObject var180 = module0035.f2169($ic298$, var179);
            if (NIL == var180) {
                var179 = (SubLObject)ConsesLow.cons($ic298$, var179);
            }
            SubLObject var181 = var179;
            SubLObject var182 = (SubLObject)NIL;
            var182 = var181.first();
            while (NIL != var181) {
                module0642.f39026((SubLObject)UNPROVIDED);
                if (NIL != var174) {
                    final SubLObject var183 = (SubLObject)makeBoolean(!var182.eql($ic298$) || NIL != var180);
                    module0642.f39068((SubLObject)$ic299$, module0656.f39842(var182), var183, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                    module0656.f39804(var182, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                var181 = var181.rest();
                var182 = var181.first();
            }
            if (NIL != var174) {
                final SubLObject var184 = module0259.f16850($ic52$);
                if (Sequences.length(var184).numG((SubLObject)$ic300$)) {
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0666.f40467((SubLObject)$ic301$, (SubLObject)$ic44$, $ic52$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39021((SubLObject)$ic302$);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39075((SubLObject)$ic301$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39021((SubLObject)$ic302$);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0656.f39982((SubLObject)$ic303$, Sort.sort(var184, Symbols.symbol_function((SubLObject)$ic304$), Symbols.symbol_function((SubLObject)$ic305$)), (SubLObject)NIL, (SubLObject)ONE_INTEGER, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)T, (SubLObject)UNPROVIDED);
                }
            }
        }
        finally {
            module0015.$g533$.rebind(var178, var175);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42106(SubLObject var174) {
        if (var174 == UNPROVIDED) {
            var174 = (SubLObject)T;
        }
        final SubLThread var175 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)$ic272$);
        module0016.f920((SubLObject)$ic306$, (SubLObject)$ic287$, (SubLObject)$ic288$);
        final SubLObject var176 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var176) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var176);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var177 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)T, var175);
            module0683.f41676((SubLObject)$ic307$, (SubLObject)$ic308$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var177, var175);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)$ic306$, (SubLObject)$ic297$, (SubLObject)$ic292$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic306$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var178 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)T, var175);
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var179 = f42047(f42082());
            if (NIL == var179 && NIL == var174) {
                module0642.f39021((SubLObject)$ic309$);
            }
            SubLObject var180 = module0631.f38700();
            SubLObject var181 = (SubLObject)NIL;
            var181 = var180.first();
            while (NIL != var180) {
                final SubLObject var182 = conses_high.member(var181, var179, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var174) {
                    module0642.f39068((SubLObject)$ic310$, module0656.f39842(var181), var182, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                }
                if (NIL != var174 || NIL != var182) {
                    module0656.f39804(var181, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39026((SubLObject)UNPROVIDED);
                }
                var180 = var180.rest();
                var181 = var180.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var178, var175);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42107(SubLObject var174) {
        if (var174 == UNPROVIDED) {
            var174 = (SubLObject)T;
        }
        final SubLThread var175 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)$ic275$);
        module0016.f920((SubLObject)$ic311$, (SubLObject)$ic287$, (SubLObject)$ic288$);
        final SubLObject var176 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var176) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var176);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var177 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)T, var175);
            module0683.f41676((SubLObject)$ic312$, (SubLObject)$ic313$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var177, var175);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)$ic311$, (SubLObject)$ic297$, (SubLObject)$ic292$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic311$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var178 = module0015.$g533$.currentBinding(var175);
        try {
            module0015.$g533$.bind((SubLObject)T, var175);
            final SubLObject var179 = f42048(f42082());
            if (NIL != var179) {
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g353$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g354$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_186 = module0015.$g533$.currentBinding(var175);
                try {
                    module0015.$g533$.bind((SubLObject)T, var175);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_187 = module0015.$g533$.currentBinding(var175);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var175);
                        if (NIL != var174) {
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic314$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_188 = module0015.$g533$.currentBinding(var175);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var175);
                                module0642.f39021((SubLObject)$ic315$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_188, var175);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic314$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_189 = module0015.$g533$.currentBinding(var175);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var175);
                            module0642.f39021((SubLObject)$ic316$);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                    SubLObject var180 = var179;
                    SubLObject var181 = (SubLObject)NIL;
                    var181 = var180.first();
                    while (NIL != var180) {
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_190 = module0015.$g533$.currentBinding(var175);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var175);
                            if (NIL != var174) {
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic314$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_191 = module0015.$g533$.currentBinding(var175);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var175);
                                    module0642.f39068((SubLObject)$ic317$, module0656.f39842(var181), (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_191, var175);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic314$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_192 = module0015.$g533$.currentBinding(var175);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var175);
                                module0656.f39804(var181, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        var180 = var180.rest();
                        var181 = var180.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var5_186, var175);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
            }
            if (NIL != var174) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0666.f40467((SubLObject)$ic318$, (SubLObject)$ic44$, $ic319$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
                module0642.f39021((SubLObject)$ic320$);
                module0642.f39032((SubLObject)UNPROVIDED);
                module0642.f39075((SubLObject)$ic318$, (SubLObject)((NIL != var179) ? NIL : module0574.f35152()), (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0015.$g533$.rebind(var178, var175);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42108(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0684.f41953(var6);
        var7.resetMultipleValues();
        final SubLObject var9 = module0684.f41954(var6);
        final SubLObject var10 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var10) {
            return module0656.f39789((SubLObject)$ic321$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var11 = module0684.f41955(var6);
        final SubLObject var12 = var7.secondMultipleValue();
        final SubLObject var13 = var7.thirdMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var12) {
            return module0656.f39789((SubLObject)$ic321$, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var14 = module0683.f41792(var6, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        final SubLObject var15 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var15) {
            return module0656.f39789((SubLObject)$ic321$, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var16 = module0657.f40003(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var17 = var7.secondMultipleValue();
        final SubLObject var18 = var7.thirdMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var17) {
            module0657.f40013(var17, var18);
            return (SubLObject)NIL;
        }
        var7.resetMultipleValues();
        final SubLObject var19 = module0657.f40022(var6, (SubLObject)$ic322$);
        final SubLObject var20 = var7.secondMultipleValue();
        final SubLObject var21 = var7.thirdMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var20) {
            return module0657.f40031(var20, var21, (SubLObject)UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var22 = module0657.f40022(var6, (SubLObject)$ic323$);
        final SubLObject var23 = var7.secondMultipleValue();
        final SubLObject var24 = var7.thirdMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var23) {
            return module0657.f40031(var23, var24, (SubLObject)$ic324$);
        }
        var7.resetMultipleValues();
        final SubLObject var25 = f42109(var6);
        final SubLObject var26 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var26) {
            return module0656.f39789((SubLObject)$ic321$, var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var27 = f42110(var6);
        final SubLObject var28 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var28) {
            return module0656.f39789((SubLObject)$ic321$, var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var29 = f42111(var6);
        final SubLObject var30 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var30) {
            return module0656.f39789((SubLObject)$ic321$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var31 = module0684.f41956(var6);
        final SubLObject var32 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var32) {
            return module0656.f39789((SubLObject)$ic321$, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        final SubLObject var34 = (SubLObject)((NIL != constant_handles_oc.f8449(var33)) ? constants_high_oc.f10743(var33) : NIL);
        if (NIL != module0126.f8389(var9) && NIL != module0126.f8389(var34) && !var9.equal(var34)) {
            f42051(f42082(), (SubLObject)NIL);
        }
        final SubLObject var35 = module0682.f41632(module0682.f41665());
        if (NIL != inference_datastructures_inference_oc.f25275(var35) && inference_datastructures_inference_oc.f25423(var35).equal(var19)) {
            var7.resetMultipleValues();
            final SubLObject var36 = cb_query_browser_oc.f41988(var35);
            final SubLObject var37 = var7.secondMultipleValue();
            final SubLObject var38 = var7.thirdMultipleValue();
            var7.resetMultipleValues();
            SubLObject var39 = var36;
            SubLObject var40 = (SubLObject)NIL;
            var40 = var39.first();
            while (NIL != var39) {
                final SubLObject var41 = module0233.f15414(inference_datastructures_inference_oc.f25687(var40));
                if (NIL == f42095(f42082(), var41)) {
                    f42070(var41, f42082(), (SubLObject)UNPROVIDED);
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
        final SubLObject var128 = (NIL != module0202.f12597(var127)) ? module0202.f12966(var127, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0202.f12911(var127, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var130;
        final SubLObject var129 = var130 = f42044(var125);
        if (NIL == module0065.f4772(var130, (SubLObject)$ic215$)) {
            final SubLObject var144_224 = var130;
            if (NIL == module0065.f4775(var144_224, (SubLObject)$ic215$)) {
                final SubLObject var131 = module0065.f4740(var144_224);
                final SubLObject var132 = (SubLObject)NIL;
                SubLObject var133;
                SubLObject var134;
                SubLObject var135;
                SubLObject var136;
                for (var133 = Sequences.length(var131), var134 = (SubLObject)NIL, var134 = (SubLObject)ZERO_INTEGER; var134.numL(var133); var134 = Numbers.add(var134, (SubLObject)ONE_INTEGER)) {
                    var135 = ((NIL != var132) ? Numbers.subtract(var133, var134, (SubLObject)ONE_INTEGER) : var134);
                    var136 = Vectors.aref(var131, var135);
                    if (NIL == module0065.f4749(var136) || NIL == module0065.f4773((SubLObject)$ic215$)) {
                        if (NIL != module0065.f4749(var136)) {
                            var136 = (SubLObject)$ic215$;
                        }
                        if (NIL == module0035.f2201(module0233.f15421(f42080(var136)), var128, (SubLObject)UNPROVIDED)) {
                            f42096(var125, var135);
                        }
                    }
                }
            }
            final SubLObject var151_225 = var130;
            if (NIL == module0065.f4777(var151_225)) {
                final SubLObject var137 = module0065.f4738(var151_225);
                SubLObject var138 = (SubLObject)NIL;
                SubLObject var139 = (SubLObject)NIL;
                final Iterator var140 = Hashtables.getEntrySetIterator(var137);
                try {
                    while (Hashtables.iteratorHasNext(var140)) {
                        final Map.Entry var141 = Hashtables.iteratorNextEntry(var140);
                        var138 = Hashtables.getEntryKey(var141);
                        var139 = Hashtables.getEntryValue(var141);
                        if (NIL == module0035.f2201(module0233.f15421(f42080(var139)), var128, (SubLObject)UNPROVIDED)) {
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
        final SubLObject var7 = module0642.f39109((SubLObject)$ic299$, var6);
        SubLObject var8 = module0642.f39104((SubLObject)$ic301$, var6);
        final SubLObject var9 = module0656.f39983((SubLObject)$ic303$, var6);
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        if (NIL != module0038.f2610(var8)) {
            var8 = (SubLObject)NIL;
        }
        if (NIL != module0126.f8389(var8)) {
            var10 = constants_high_oc.f10737(var8);
        }
        SubLObject var13 = var7;
        SubLObject var14 = (SubLObject)NIL;
        var14 = var13.first();
        while (NIL != var13) {
            if (NIL == module0038.f2610(var14)) {
                final SubLObject var15 = module0656.f39957(var14, (SubLObject)UNPROVIDED);
                if (NIL == module0633.f38718(var15, (SubLObject)UNPROVIDED)) {
                    var12 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic326$, var14);
                }
                if (NIL == var12) {
                    var11 = (SubLObject)ConsesLow.cons(var15, var11);
                }
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        if (NIL != var10 && NIL != module0633.f38718(var10, (SubLObject)UNPROVIDED)) {
            var11 = (SubLObject)ConsesLow.cons(var10, var11);
        }
        else if (NIL != var8) {
            var12 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic327$, var8);
        }
        if (NIL == module0656.f39984(var9)) {
            if (NIL != module0633.f38718(var9, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)ConsesLow.cons(var9, var11);
            }
            else {
                var12 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic328$, var9);
            }
        }
        return Values.values(var11, var12);
    }
    
    public static SubLObject f42110(final SubLObject var6) {
        final SubLObject var7 = module0642.f39109((SubLObject)$ic310$, var6);
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var7;
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            if (NIL == module0038.f2610(var11)) {
                final SubLObject var12 = module0656.f39957(var11, (SubLObject)UNPROVIDED);
                if (NIL == module0631.f38698(var12)) {
                    var9 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic329$, var11);
                }
                if (NIL == var9) {
                    var8 = (SubLObject)ConsesLow.cons(var12, var8);
                }
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return Values.values(var8, var9);
    }
    
    public static SubLObject f42111(final SubLObject var6) {
        final SubLObject var7 = module0642.f39109((SubLObject)$ic317$, var6);
        final SubLObject var8 = module0642.f39104((SubLObject)$ic318$, var6);
        final SubLObject var9 = (SubLObject)((NIL != module0126.f8389(var8)) ? constants_high_oc.f10737(var8) : NIL);
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = var7;
        SubLObject var13 = (SubLObject)NIL;
        var13 = var12.first();
        while (NIL != var12) {
            if (NIL == module0038.f2610(var13)) {
                final SubLObject var14 = module0656.f39957(var13, (SubLObject)UNPROVIDED);
                if (NIL == module0226.f14809(var14)) {
                    var11 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic330$, var13);
                }
                if (NIL == var11) {
                    var10 = (SubLObject)ConsesLow.cons(var14, var10);
                }
            }
            var12 = var12.rest();
            var13 = var12.first();
        }
        if (NIL != module0226.f14809(var9)) {
            var10 = (SubLObject)ConsesLow.cons(var9, var10);
        }
        else if (NIL == var10) {
            var11 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic331$, var8);
        }
        return Values.values(var10, var11);
    }
    
    public static SubLObject f42114() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if ($g5393$.getDynamicValue(var3).equal((SubLObject)$ic333$)) {
            $g5393$.setDynamicValue((SubLObject)$ic26$, var3);
        }
        else {
            $g5393$.setDynamicValue((SubLObject)$ic333$, var3);
        }
        return $g5393$.getDynamicValue(var3);
    }
    
    public static SubLObject f42113(final SubLObject var125) {
        final SubLThread var126 = SubLProcess.currentSubLThread();
        final SubLObject var127 = f42041(var125);
        final SubLObject var128 = f42072(var125);
        final SubLObject var129 = f42074(var125);
        final SubLObject var130 = f42075(var125);
        final SubLObject var131 = f42076(var125);
        final SubLObject var132 = f42077(var125);
        final SubLObject var133 = conses_high.getf(f42050(var125), (SubLObject)$ic203$, (SubLObject)UNPROVIDED);
        final SubLObject var134 = conses_high.getf(f42050(var125), (SubLObject)$ic204$, (SubLObject)UNPROVIDED);
        final SubLObject var135 = conses_high.getf(f42050(var125), (SubLObject)$ic205$, (SubLObject)UNPROVIDED);
        final SubLObject var136 = (SubLObject)$ic334$;
        final SubLObject var137 = module0682.f41660(var127);
        final SubLObject var138 = module0682.f41662(var127);
        final SubLObject var139 = (NIL != module0202.f12597(var137)) ? module0202.f12966(var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0202.f12911(var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var140 = Types.sublisp_null(var139);
        final SubLObject var141 = var136;
        final SubLObject var142 = module0015.$g538$.currentBinding(var126);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var126))) ? module0015.$g538$.getDynamicValue(var126) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var126);
            module0642.f39020((SubLObject)$ic19$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var126), module0655.$g5142$.getDynamicValue(var126));
            final SubLObject var143 = module0014.f672((SubLObject)$ic20$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var143) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var143);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic22$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            if (NIL != var141) {
                module0642.f39029((SubLObject)UNPROVIDED);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var5_247 = module0015.$g535$.currentBinding(var126);
            try {
                module0015.$g535$.bind((SubLObject)T, var126);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var126)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var126)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic122$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_248 = module0015.$g533$.currentBinding(var126);
                try {
                    module0015.$g533$.bind((SubLObject)T, var126);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic123$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_249 = module0015.$g533$.currentBinding(var126);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var126);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic124$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic125$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic23$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic335$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_249, var126);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    module0644.f39197();
                    final SubLObject var144 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var126));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic40$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var144) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var144);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_250 = module0015.$g533$.currentBinding(var126);
                    final SubLObject var145 = module0015.$g541$.currentBinding(var126);
                    final SubLObject var146 = module0015.$g539$.currentBinding(var126);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var126);
                        module0015.$g541$.bind((SubLObject)T, var126);
                        module0015.$g539$.bind(module0015.f797(), var126);
                        module0642.f39069((SubLObject)$ic336$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        final SubLObject var147 = (SubLObject)FIVE_INTEGER;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != var147) {
                            module0642.f39020(module0015.$g221$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var147);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_251 = module0015.$g533$.currentBinding(var126);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var126);
                            module0683.f41676(var136, (SubLObject)$ic337$, (SubLObject)$ic334$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_251, var126);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_252 = module0015.$g533$.currentBinding(var126);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var126);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_253 = module0015.$g533$.currentBinding(var126);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var126);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic338$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_254 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var126);
                                    module0642.f39019((SubLObject)$ic339$);
                                    module0642.f39075((SubLObject)$ic340$, var133, (SubLObject)FIVE_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_254, var126);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_255 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var126);
                                    module0642.f39019((SubLObject)$ic341$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_256 = module0015.$g533$.currentBinding(var126);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var126);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic338$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_257 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var126);
                                    module0642.f39019((SubLObject)$ic342$);
                                    module0642.f39075((SubLObject)$ic343$, var134, (SubLObject)FIVE_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_257, var126);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_258 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var126);
                                    module0642.f39019((SubLObject)$ic341$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_259 = module0015.$g533$.currentBinding(var126);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var126);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic338$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_260 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var126);
                                    module0642.f39019((SubLObject)$ic344$);
                                    module0642.f39075((SubLObject)$ic345$, var135, (SubLObject)FIVE_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_260, var126);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_261 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var126);
                                    module0642.f39019((SubLObject)$ic341$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_262 = module0015.$g533$.currentBinding(var126);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var126);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic338$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_263 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var126);
                                    module0642.f39072((SubLObject)$ic346$, (SubLObject)$ic347$, var132, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_263, var126);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_264 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var126);
                                    module0642.f39019((SubLObject)$ic348$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            if (NIL != var140) {
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_265 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var126);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic338$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var5_266 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var126);
                                        module0642.f39072((SubLObject)$ic346$, (SubLObject)$ic349$, (SubLObject)makeBoolean(Sequences.length(var128).numE((SubLObject)ONE_INTEGER) && NIL == module0233.f15422(var128.first())), (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_266, var126);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var5_267 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var126);
                                        module0642.f39019((SubLObject)$ic350$);
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
                                module0642.f39029((SubLObject)UNPROVIDED);
                            }
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_268 = module0015.$g533$.currentBinding(var126);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var126);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic338$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_269 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var126);
                                    module0642.f39072((SubLObject)$ic346$, (SubLObject)$ic351$, (SubLObject)makeBoolean(NIL == var128 && f42043(var125) == $ic207$), (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_269, var126);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_270 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var126);
                                    if (NIL != var139) {
                                        module0642.f39019((SubLObject)$ic352$);
                                    }
                                    else {
                                        module0642.f39019((SubLObject)$ic353$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            if (NIL == var140) {
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_271 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var126);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic338$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var5_272 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var126);
                                        module0642.f39072((SubLObject)$ic346$, (SubLObject)$ic354$, var128, (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_272, var126);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g371$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)TWO_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var5_273 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var126);
                                        module0642.f39019((SubLObject)$ic355$);
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
                                module0642.f39029((SubLObject)UNPROVIDED);
                                final SubLObject var148 = (SubLObject)makeBoolean(NIL != var129 || NIL != var130);
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_274 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var126);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic338$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var5_275 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var126);
                                        module0642.f39020(module0015.$g295$.getGlobalValue());
                                        module0642.f39020(module0015.$g305$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g314$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g302$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)$ic346$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g307$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39019((SubLObject)$ic356$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        if (NIL != var148) {
                                            module0642.f39046(module0015.$g296$.getGlobalValue());
                                        }
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_275, var126);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g371$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)TWO_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var5_276 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var126);
                                        module0642.f39019((SubLObject)$ic357$);
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
                                module0642.f39029((SubLObject)UNPROVIDED);
                                if (NIL != var128 || NIL != var129 || NIL != var130 || NIL != var131) {
                                    final SubLObject var149 = Numbers.add((SubLObject)THREE_INTEGER, Sequences.length(var139));
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var5_277 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var126);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        if (NIL != var149) {
                                            module0642.f39020(module0015.$g371$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(var149);
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        }
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var5_278 = module0015.$g533$.currentBinding(var126);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var126);
                                            module0642.f39021((SubLObject)$ic358$);
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
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var5_279 = module0015.$g533$.currentBinding(var126);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var126);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic359$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var5_280 = module0015.$g533$.currentBinding(var126);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var126);
                                            module0642.f39021((SubLObject)$ic360$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_280, var126);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic359$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var5_281 = module0015.$g533$.currentBinding(var126);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var126);
                                            module0642.f39021((SubLObject)$ic361$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_281, var126);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic359$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic27$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var5_282 = module0015.$g533$.currentBinding(var126);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var126);
                                            module0642.f39021((SubLObject)$ic362$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_282, var126);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        cb_query_browser_oc.f41990(var139, (SubLObject)NIL, (SubLObject)T);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_279, var126);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                    $g5393$.setDynamicValue((SubLObject)$ic333$, var126);
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
                        if (NIL != var139) {
                            module0642.f39026((SubLObject)UNPROVIDED);
                            f42118(var137, var138, var139);
                        }
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0683.f41678((SubLObject)$ic363$, (SubLObject)$ic364$, (SubLObject)$ic365$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (NIL != f42038(f42082())) {
                            module0683.f41678((SubLObject)$ic366$, (SubLObject)$ic367$, (SubLObject)$ic368$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0684.f41946(module0682.f41665());
                        module0015.f799(module0015.$g539$.getDynamicValue(var126));
                    }
                    finally {
                        module0015.$g539$.rebind(var146, var126);
                        module0015.$g541$.rebind(var145, var126);
                        module0015.$g533$.rebind(var5_250, var126);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    final SubLObject var150 = (SubLObject)FOUR_INTEGER;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var150) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var150);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_283 = module0015.$g533$.currentBinding(var126);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var126);
                        module0683.f41676((SubLObject)$ic369$, (SubLObject)$ic370$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_283, var126);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    f42104((SubLObject)NIL);
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0684.f41948();
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0684.f41949();
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0684.f41950();
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0684.f41945((SubLObject)NIL);
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    f42105((SubLObject)NIL);
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    f42106((SubLObject)NIL);
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    f42107((SubLObject)NIL);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_248, var126);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5_247, var126);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var142, var126);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42118(final SubLObject var203, final SubLObject var200, final SubLObject var244) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        module0683.f41676((SubLObject)$ic371$, (SubLObject)$ic372$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)TWO_INTEGER);
        module0642.f39021((SubLObject)$ic373$);
        module0642.f39032((SubLObject)ONE_INTEGER);
        module0642.f39072((SubLObject)$ic284$, (SubLObject)$ic374$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)FOUR_INTEGER);
        module0642.f39021((SubLObject)$ic375$);
        module0642.f39032((SubLObject)ONE_INTEGER);
        module0642.f39072((SubLObject)$ic284$, (SubLObject)$ic376$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)FOUR_INTEGER);
        module0683.f41678((SubLObject)$ic377$, (SubLObject)$ic378$, (SubLObject)$ic379$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var246 = module0307.f20765(var203, var200, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var247 = module0015.$g533$.currentBinding(var245);
        try {
            module0015.$g533$.bind((SubLObject)T, var245);
            SubLObject var248;
            SubLObject var249;
            SubLObject var250;
            SubLObject var251;
            SubLObject var252;
            SubLObject var253;
            SubLObject var5_290;
            SubLObject var5_291;
            SubLObject var5_292;
            for (var248 = Sequences.length(var244), var249 = (SubLObject)NIL, var249 = (SubLObject)ZERO_INTEGER; var249.numL(var248); var249 = Numbers.add(var249, (SubLObject)ONE_INTEGER)) {
                var250 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic380$, var249);
                var251 = Sequences.elt(var244, var249);
                var252 = module0256.f16529(module0067.f4884(var246, var251, (SubLObject)UNPROVIDED).first(), var200, (SubLObject)UNPROVIDED);
                var253 = (SubLObject)((NIL != module0035.f1997(var252)) ? var252.first() : NIL);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                var5_290 = module0015.$g533$.currentBinding(var245);
                try {
                    module0015.$g533$.bind((SubLObject)T, var245);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic381$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    var5_291 = module0015.$g533$.currentBinding(var245);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var245);
                        module0642.f39021(var251);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_291, var245);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic381$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    var5_292 = module0015.$g533$.currentBinding(var245);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var245);
                        module0657.f40033((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic382$, var250, (SubLObject)$ic383$, var253));
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
                module0642.f39029((SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0015.$g533$.rebind(var247, var245);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42119(final SubLObject var150) {
        final SubLThread var151 = SubLProcess.currentSubLThread();
        final SubLObject var152 = f42086(var150);
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var153 = module0015.$g533$.currentBinding(var151);
        try {
            module0015.$g533$.bind((SubLObject)T, var151);
            module0642.f39072(PrintLow.format((SubLObject)NIL, (SubLObject)$ic384$, var152), (SubLObject)$ic385$, Equality.eq(f42079(var150), (SubLObject)$ic208$), (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var153, var151);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var153 = module0015.$g533$.currentBinding(var151);
        try {
            module0015.$g533$.bind((SubLObject)T, var151);
            module0642.f39072(PrintLow.format((SubLObject)NIL, (SubLObject)$ic384$, var152), (SubLObject)$ic386$, Equality.eq(f42079(var150), (SubLObject)$ic212$), (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var153, var151);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var153 = module0015.$g533$.currentBinding(var151);
        try {
            module0015.$g533$.bind((SubLObject)T, var151);
            module0642.f39072(PrintLow.format((SubLObject)NIL, (SubLObject)$ic384$, var152), (SubLObject)$ic387$, Equality.eq(f42079(var150), (SubLObject)$ic214$), (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var153, var151);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42115(final SubLObject var125, final SubLObject var244) {
        return f42120(var125, var244, (SubLObject)$ic208$);
    }
    
    public static SubLObject f42116(final SubLObject var125, final SubLObject var244) {
        return f42120(var125, var244, (SubLObject)$ic212$);
    }
    
    public static SubLObject f42117(final SubLObject var125, final SubLObject var244) {
        return f42120(var125, var244, (SubLObject)$ic214$);
    }
    
    public static SubLObject f42120(final SubLObject var125, final SubLObject var244, final SubLObject var41) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        final SubLObject var247;
        final SubLObject var246 = var247 = f42044(var125);
        if (NIL == module0065.f4772(var247, (SubLObject)$ic215$)) {
            final SubLObject var144_293 = var247;
            if (NIL == module0065.f4775(var144_293, (SubLObject)$ic215$)) {
                final SubLObject var248 = module0065.f4740(var144_293);
                final SubLObject var249 = (SubLObject)NIL;
                SubLObject var250;
                SubLObject var251;
                SubLObject var252;
                SubLObject var253;
                SubLObject var254;
                SubLObject var255;
                for (var250 = Sequences.length(var248), var251 = (SubLObject)NIL, var251 = (SubLObject)ZERO_INTEGER; var251.numL(var250); var251 = Numbers.add(var251, (SubLObject)ONE_INTEGER)) {
                    var252 = ((NIL != var249) ? Numbers.subtract(var250, var251, (SubLObject)ONE_INTEGER) : var251);
                    var253 = Vectors.aref(var248, var252);
                    if (NIL == module0065.f4749(var253) || NIL == module0065.f4773((SubLObject)$ic215$)) {
                        if (NIL != module0065.f4749(var253)) {
                            var253 = (SubLObject)$ic215$;
                        }
                        if (f42079(var253).eql(var41)) {
                            var254 = module0233.f15408(f42080(var253));
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            if (NIL != $g5393$.getDynamicValue(var245)) {
                                module0642.f39020(module0015.$g366$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020($g5393$.getDynamicValue(var245));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            var255 = module0015.$g533$.currentBinding(var245);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var245);
                                f42119(var253);
                                cb_query_browser_oc.f41997(var254, var244);
                            }
                            finally {
                                module0015.$g533$.rebind(var255, var245);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            f42114();
                        }
                    }
                }
            }
            final SubLObject var151_294 = var247;
            if (NIL == module0065.f4777(var151_294)) {
                final SubLObject var256 = module0065.f4738(var151_294);
                SubLObject var257 = (SubLObject)NIL;
                SubLObject var258 = (SubLObject)NIL;
                final Iterator var259 = Hashtables.getEntrySetIterator(var256);
                try {
                    while (Hashtables.iteratorHasNext(var259)) {
                        final Map.Entry var260 = Hashtables.iteratorNextEntry(var259);
                        var257 = Hashtables.getEntryKey(var260);
                        var258 = Hashtables.getEntryValue(var260);
                        if (f42079(var258).eql(var41)) {
                            final SubLObject var261 = module0233.f15408(f42080(var258));
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            if (NIL != $g5393$.getDynamicValue(var245)) {
                                module0642.f39020(module0015.$g366$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020($g5393$.getDynamicValue(var245));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var262 = module0015.$g533$.currentBinding(var245);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var245);
                                f42119(var258);
                                cb_query_browser_oc.f41997(var261, var244);
                            }
                            finally {
                                module0015.$g533$.rebind(var262, var245);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            f42114();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var259);
                }
            }
        }
        return (SubLObject)NIL;
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
        if (NIL == var11) {
            return module0656.f39789((SubLObject)$ic321$, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var7.resetMultipleValues();
        final SubLObject var13 = f42124(var6);
        final SubLObject var14 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL == var13) {
            return module0656.f39789((SubLObject)$ic321$, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var15 = var10;
        if (var15.eql((SubLObject)$ic388$)) {
            f42113(f42082());
            return (SubLObject)NIL;
        }
        if (var15.eql((SubLObject)$ic389$)) {
            final SubLObject var16 = f42125(f42082());
            if (NIL != var16) {
                module0682.f41664();
                f42081();
            }
            return var16;
        }
        if (var15.eql((SubLObject)$ic390$)) {
            final SubLObject var16 = f42126(f42082());
            if (NIL != var16) {
                module0682.f41664();
                f42081();
            }
            return var16;
        }
        return module0656.f39789((SubLObject)$ic391$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42122(final SubLObject var6) {
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic379$, var6))) {
            return (SubLObject)$ic388$;
        }
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic365$, var6))) {
            return (SubLObject)$ic389$;
        }
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic368$, var6))) {
            return (SubLObject)$ic390$;
        }
        return (SubLObject)$ic393$;
    }
    
    public static SubLObject f42123(final SubLObject var6) {
        SubLObject var7 = module0642.f39104((SubLObject)$ic340$, var6);
        SubLObject var8 = module0642.f39104((SubLObject)$ic343$, var6);
        SubLObject var9 = module0642.f39104((SubLObject)$ic345$, var6);
        if (NIL != module0038.f2608(var7)) {
            f42068(f42082(), (SubLObject)$ic203$, (SubLObject)NIL);
        }
        else {
            var7 = reader.read_from_string_ignoring_errors(var7, (SubLObject)NIL, (SubLObject)$ic394$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (!var7.isInteger()) {
                return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f203(var7), (SubLObject)$ic395$));
            }
            f42068(f42082(), (SubLObject)$ic203$, var7);
        }
        if (NIL != module0038.f2608(var8)) {
            f42068(f42082(), (SubLObject)$ic204$, (SubLObject)NIL);
        }
        else {
            var8 = reader.read_from_string_ignoring_errors(var8, (SubLObject)NIL, (SubLObject)$ic394$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (!var8.isInteger()) {
                return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f203(var7), (SubLObject)$ic395$));
            }
            f42068(f42082(), (SubLObject)$ic204$, var8);
        }
        if (NIL != module0038.f2608(var9)) {
            f42068(f42082(), (SubLObject)$ic205$, (SubLObject)NIL);
        }
        else {
            var9 = reader.read_from_string_ignoring_errors(var9, (SubLObject)NIL, (SubLObject)$ic394$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (!var9.isInteger()) {
                return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f203(var7), (SubLObject)$ic395$));
            }
            f42068(f42082(), (SubLObject)$ic205$, var9);
        }
        return Values.values((SubLObject)T, (SubLObject)NIL);
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
        if (NIL != var12) {
            return Values.values((SubLObject)NIL, var12);
        }
        final SubLObject var14;
        final SubLObject var13 = var14 = f42044(f42082());
        if (NIL == module0065.f4772(var14, (SubLObject)$ic215$)) {
            final SubLObject var144_306 = var14;
            if (NIL == module0065.f4775(var144_306, (SubLObject)$ic215$)) {
                final SubLObject var15 = module0065.f4740(var144_306);
                final SubLObject var16 = (SubLObject)NIL;
                SubLObject var17;
                SubLObject var18;
                SubLObject var19;
                SubLObject var20;
                for (var17 = Sequences.length(var15), var18 = (SubLObject)NIL, var18 = (SubLObject)ZERO_INTEGER; var18.numL(var17); var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER)) {
                    var19 = ((NIL != var16) ? Numbers.subtract(var17, var18, (SubLObject)ONE_INTEGER) : var18);
                    var20 = Vectors.aref(var15, var19);
                    if (NIL == module0065.f4749(var20) || NIL == module0065.f4773((SubLObject)$ic215$)) {
                        if (NIL != module0065.f4749(var20)) {
                            var20 = (SubLObject)$ic215$;
                        }
                        f42097(var20, (SubLObject)$ic214$);
                    }
                }
            }
            final SubLObject var151_307 = var14;
            if (NIL == module0065.f4777(var151_307)) {
                final SubLObject var21 = module0065.f4738(var151_307);
                SubLObject var22 = (SubLObject)NIL;
                SubLObject var23 = (SubLObject)NIL;
                final Iterator var24 = Hashtables.getEntrySetIterator(var21);
                try {
                    while (Hashtables.iteratorHasNext(var24)) {
                        final Map.Entry var25 = Hashtables.iteratorNextEntry(var24);
                        var22 = Hashtables.getEntryKey(var25);
                        var23 = Hashtables.getEntryValue(var25);
                        f42097(var23, (SubLObject)$ic214$);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var24);
                }
            }
        }
        if (NIL != var11) {
            f42056(f42082(), (SubLObject)$ic206$);
        }
        else if (NIL != var8) {
            f42056(f42082(), (SubLObject)$ic207$);
            if (var8 != $ic61$) {
                SubLObject var26 = var8;
                SubLObject var27 = (SubLObject)NIL;
                var27 = var26.first();
                while (NIL != var26) {
                    f42097(var27, (SubLObject)$ic208$);
                    var26 = var26.rest();
                    var27 = var26.first();
                }
            }
        }
        else if (NIL != var9 || NIL != var10) {
            f42056(f42082(), (SubLObject)$ic209$);
            SubLObject var26 = var9;
            SubLObject var28 = (SubLObject)NIL;
            var28 = var26.first();
            while (NIL != var26) {
                f42097(var28, (SubLObject)$ic208$);
                var26 = var26.rest();
                var28 = var26.first();
            }
            var26 = var10;
            SubLObject var29 = (SubLObject)NIL;
            var29 = var26.first();
            while (NIL != var26) {
                f42097(var29, (SubLObject)$ic212$);
                var26 = var26.rest();
                var29 = var26.first();
            }
        }
        var7.resetMultipleValues();
        final SubLObject var30 = f42128(var6);
        final SubLObject var31 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL == var30) {
            return Values.values((SubLObject)T, (SubLObject)NIL);
        }
        if (NIL != var31) {
            return Values.values((SubLObject)NIL, var31);
        }
        var7.resetMultipleValues();
        final SubLObject var32 = f42129(var6);
        final SubLObject var33 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL != var33) {
            return Values.values((SubLObject)NIL, var33);
        }
        f42056(f42082(), var32);
        if (var32 == $ic206$) {
            return Values.values((SubLObject)T, (SubLObject)NIL);
        }
        final SubLObject var34 = f42041(f42082());
        final SubLObject var35 = module0682.f41660(var34);
        final SubLObject var36 = (NIL != module0202.f12597(var35)) ? module0202.f12966(var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0202.f12911(var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39;
        SubLObject var40;
        SubLObject var41;
        SubLObject var42;
        for (var39 = Sequences.length(var36), var40 = (SubLObject)NIL, var40 = (SubLObject)ZERO_INTEGER; var40.numL(var39); var40 = Numbers.add(var40, (SubLObject)ONE_INTEGER)) {
            var41 = f42130(PrintLow.format((SubLObject)NIL, (SubLObject)$ic380$, var40), var6);
            var42 = (SubLObject)((NIL != var41) ? module0233.f15418(Sequences.elt(var36, var40), var41) : NIL);
            if (NIL != module0233.f15358(var42)) {
                var37 = (SubLObject)ConsesLow.cons(var42, var37);
            }
        }
        if (NIL != module0035.f2004(var37, var36)) {
            var38 = module0233.f15415(var37);
            if (NIL == f42095(f42082(), var38)) {
                f42070(var38, f42082(), var30);
            }
        }
        return Values.values((SubLObject)T, (SubLObject)NIL);
    }
    
    public static SubLObject f42130(final SubLObject var316, final SubLObject var6) {
        return module0657.f40035(var6, (SubLObject)ConsesLow.listS((SubLObject)$ic396$, (SubLObject)T, (SubLObject)$ic382$, var316, (SubLObject)$ic397$));
    }
    
    public static SubLObject f42128(final SubLObject var6) {
        final SubLObject var7 = module0642.f39104((SubLObject)$ic284$, var6);
        final SubLObject var8 = (SubLObject)NIL;
        if (NIL != var8) {
            return (SubLObject)NIL;
        }
        if (var7.equal((SubLObject)$ic374$)) {
            return (SubLObject)$ic208$;
        }
        if (var7.equal((SubLObject)$ic376$)) {
            return (SubLObject)$ic212$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42129(final SubLObject var6) {
        final SubLObject var7 = module0642.f39104((SubLObject)$ic346$, var6);
        if (var7.equal((SubLObject)$ic347$)) {
            return Values.values((SubLObject)$ic206$, (SubLObject)NIL);
        }
        if (var7.equal((SubLObject)$ic351$)) {
            return Values.values((SubLObject)$ic207$, (SubLObject)NIL);
        }
        if (var7.equal((SubLObject)$ic349$)) {
            return Values.values((SubLObject)$ic207$, (SubLObject)NIL);
        }
        if (var7.equal((SubLObject)$ic354$)) {
            return Values.values((SubLObject)$ic207$, (SubLObject)NIL);
        }
        if (var7.equal((SubLObject)$ic356$)) {
            return Values.values((SubLObject)$ic209$, (SubLObject)NIL);
        }
        return Values.values((SubLObject)NIL, PrintLow.format((SubLObject)NIL, (SubLObject)$ic398$, var7));
    }
    
    public static SubLObject f42131(final SubLObject var6) {
        final SubLObject var7 = module0642.f39104((SubLObject)$ic399$, var6);
        final SubLObject var8 = module0656.f39943(var7, (SubLObject)UNPROVIDED);
        SubLObject var9 = (SubLObject)NIL;
        if (NIL == module0633.f38716(var8, (SubLObject)UNPROVIDED)) {
            var9 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic400$, var7);
        }
        return Values.values(var8, var9);
    }
    
    public static SubLObject f42127(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = f42129(var6);
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = var8;
        if (var14.eql((SubLObject)$ic207$)) {
            var7.resetMultipleValues();
            final SubLObject var15 = f42132(var6);
            final SubLObject var16 = var7.secondMultipleValue();
            var7.resetMultipleValues();
            var9 = var15;
            var13 = var16;
        }
        else if (var14.eql((SubLObject)$ic209$)) {
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
        else if (var14.eql((SubLObject)$ic206$)) {
            var12 = (SubLObject)T;
        }
        else {
            var13 = (SubLObject)$ic401$;
        }
        return Values.values(var9, var10, var11, var12, var13);
    }
    
    public static SubLObject f42132(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0642.f39104((SubLObject)$ic346$, var6);
        if (var8.equalp((SubLObject)$ic354$)) {
            var7.resetMultipleValues();
            final SubLObject var9 = f42135((SubLObject)$ic385$, var6);
            final SubLObject var10 = var7.secondMultipleValue();
            var7.resetMultipleValues();
            return Values.values(var9, var10);
        }
        if (var8.equalp((SubLObject)$ic349$)) {
            SubLObject var11 = f42095(f42082(), module0233.f15428());
            if (NIL == var11) {
                var11 = f42070(module0233.f15428(), f42082(), (SubLObject)$ic208$);
            }
            return Values.values((SubLObject)ConsesLow.list(var11), (SubLObject)NIL);
        }
        if (var8.equalp((SubLObject)$ic351$)) {
            return Values.values((SubLObject)$ic61$, (SubLObject)NIL);
        }
        return Values.values((SubLObject)NIL, (SubLObject)$ic402$);
    }
    
    public static SubLObject f42133(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        var7.resetMultipleValues();
        final SubLObject var8 = f42135((SubLObject)$ic385$, var6);
        final SubLObject var9 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        return Values.values(var8, var9);
    }
    
    public static SubLObject f42134(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        var7.resetMultipleValues();
        final SubLObject var8 = f42135((SubLObject)$ic386$, var6);
        final SubLObject var9 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        return Values.values(var8, var9);
    }
    
    public static SubLObject f42135(final SubLObject var314, final SubLObject var6) {
        final SubLObject var315 = f42044(f42082());
        SubLObject var316 = (SubLObject)NIL;
        SubLObject var317 = (SubLObject)NIL;
        final SubLObject var318 = var315;
        if (NIL == module0065.f4772(var318, (SubLObject)$ic215$)) {
            final SubLObject var144_328 = var318;
            if (NIL == module0065.f4775(var144_328, (SubLObject)$ic215$)) {
                final SubLObject var319 = module0065.f4740(var144_328);
                final SubLObject var320 = (SubLObject)NIL;
                SubLObject var321;
                SubLObject var322;
                SubLObject var323;
                SubLObject var324;
                SubLObject var325;
                for (var321 = Sequences.length(var319), var322 = (SubLObject)NIL, var322 = (SubLObject)ZERO_INTEGER; var322.numL(var321); var322 = Numbers.add(var322, (SubLObject)ONE_INTEGER)) {
                    var323 = ((NIL != var320) ? Numbers.subtract(var321, var322, (SubLObject)ONE_INTEGER) : var322);
                    var324 = Vectors.aref(var319, var323);
                    if (NIL == module0065.f4749(var324) || NIL == module0065.f4773((SubLObject)$ic215$)) {
                        if (NIL != module0065.f4749(var324)) {
                            var324 = (SubLObject)$ic215$;
                        }
                        var325 = module0642.f39104(PrintLow.format((SubLObject)NIL, (SubLObject)$ic384$, var323), var6);
                        if (var325.equal(var314)) {
                            if (NIL == f42085(var324)) {
                                var316 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic403$, var323);
                            }
                            if (NIL == var316) {
                                var317 = (SubLObject)ConsesLow.cons(var324, var317);
                            }
                        }
                    }
                }
            }
            final SubLObject var151_329 = var318;
            if (NIL == module0065.f4777(var151_329)) {
                final SubLObject var326 = module0065.f4738(var151_329);
                SubLObject var327 = (SubLObject)NIL;
                SubLObject var328 = (SubLObject)NIL;
                final Iterator var329 = Hashtables.getEntrySetIterator(var326);
                try {
                    while (Hashtables.iteratorHasNext(var329)) {
                        final Map.Entry var330 = Hashtables.iteratorNextEntry(var329);
                        var327 = Hashtables.getEntryKey(var330);
                        var328 = Hashtables.getEntryValue(var330);
                        final SubLObject var331 = module0642.f39104(PrintLow.format((SubLObject)NIL, (SubLObject)$ic384$, var327), var6);
                        if (var331.equal(var314)) {
                            if (NIL == f42085(var328)) {
                                var316 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic403$, var327);
                            }
                            if (NIL != var316) {
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
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic404$);
            return (SubLObject)NIL;
        }
        SubLObject var127 = (SubLObject)NIL;
        final SubLObject var128 = f42039(var125);
        final SubLObject var129 = f42042(var125);
        final SubLObject var130 = f42072(var125);
        final SubLObject var131 = f42074(var125);
        final SubLObject var132 = f42075(var125);
        final SubLObject var133 = f42077(var125);
        final SubLObject var134 = f42078(var125);
        final SubLObject var135 = conses_high.getf(f42050(var125), (SubLObject)$ic203$, (SubLObject)UNPROVIDED);
        final SubLObject var136 = conses_high.getf(f42050(var125), (SubLObject)$ic204$, (SubLObject)UNPROVIDED);
        final SubLObject var137 = conses_high.getf(f42050(var125), (SubLObject)$ic205$, (SubLObject)UNPROVIDED);
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
        if (NIL == module0126.f8389(var128)) {
            return module0656.f39789((SubLObject)$ic405$, var128, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var149 = constants_high_oc.f10737(var128);
        SubLObject var150 = (SubLObject)NIL;
        SubLObject var151 = (SubLObject)NIL;
        if (NIL != var149) {
            return module0656.f39789((SubLObject)$ic406$, var128, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var152 = module0126.f8393(var128, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var152) {
            return module0656.f39789((SubLObject)$ic407$, var152.first(), var128, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var150 = module0673.f41078(var128);
        var151 = module0202.f12720($ic408$, (SubLObject)ConsesLow.list(var150), (SubLObject)UNPROVIDED);
        f42136(var150, var151, var135, var136, var137, var130, var131, var132, var133, var134, var138, var139, var140, var129, var148);
        var151 = module0172.f10921(var151);
        module0423.f29533(var151, var142, var144, module0412.f28669(var145, var142), var129, var143, var148);
        module0423.f29554(var151, (SubLObject)NIL, var146, var147, var129);
        SubLObject var153 = (SubLObject)ConsesLow.list(var150, var151);
        SubLObject var154 = (SubLObject)NIL;
        var154 = var153.first();
        while (NIL != var153) {
            if (NIL != constant_handles_oc.f8449(var154)) {
                module0677.f41359(var154);
            }
            else if (NIL != module0167.f10813(var154)) {
                module0677.f41360(var154);
            }
            var153 = var153.rest();
            var154 = var153.first();
        }
        var126.resetMultipleValues();
        final SubLObject var155 = module0633.f38736(var150);
        final SubLObject var156 = var126.secondMultipleValue();
        var126.resetMultipleValues();
        SubLObject var157 = (SubLObject)NIL;
        if (NIL != var155) {
            var157 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic409$, var156);
        }
        else {
            var157 = (SubLObject)$ic410$;
            var127 = (SubLObject)T;
        }
        module0674.f41154(var157, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var127;
    }
    
    public static SubLObject f42126(final SubLObject var125) {
        final SubLThread var126 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic411$);
            return (SubLObject)NIL;
        }
        SubLObject var127 = (SubLObject)NIL;
        final SubLObject var128 = f42039(var125);
        SubLObject var129 = f42038(var125);
        final SubLObject var130 = f42042(var125);
        final SubLObject var131 = conses_high.getf(f42050(var125), (SubLObject)$ic203$, (SubLObject)UNPROVIDED);
        final SubLObject var132 = conses_high.getf(f42050(var125), (SubLObject)$ic204$, (SubLObject)UNPROVIDED);
        final SubLObject var133 = conses_high.getf(f42050(var125), (SubLObject)$ic205$, (SubLObject)UNPROVIDED);
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
        if (NIL != var128) {
            final SubLObject var153 = module0656.f39957(var128, (SubLObject)UNPROVIDED);
            if (NIL == module0633.f38716(var153, (SubLObject)UNPROVIDED)) {
                return module0656.f39789((SubLObject)$ic412$, var128, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var129 = var153;
        }
        var143 = module0633.f38713(var129, var130);
        if (NIL == var143) {
            var143 = module0202.f12720($ic408$, (SubLObject)ConsesLow.list(var129), (SubLObject)UNPROVIDED);
        }
        module0423.f29539(var143, var145, var147, module0412.f28669(var148, var145), var144, var146, var152);
        module0423.f29558(var143, var149, var150, var151, var144);
        f42137(var129, var143, var131, var132, var133, var134, var135, var136, var137, var138, var139, var140, var141, var130, var152);
        var126.resetMultipleValues();
        final SubLObject var154 = module0633.f38736(var129);
        final SubLObject var155 = var126.secondMultipleValue();
        var126.resetMultipleValues();
        SubLObject var156 = (SubLObject)NIL;
        if (NIL != var154) {
            var156 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic413$, var155);
        }
        else {
            var156 = (SubLObject)$ic414$;
            var127 = (SubLObject)T;
        }
        module0674.f41154(var156, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var127;
    }
    
    public static SubLObject f42136(final SubLObject var114, final SubLObject var128, final SubLObject var241, final SubLObject var242, final SubLObject var243, final SubLObject var131, final SubLObject var132, final SubLObject var133, final SubLObject var343, final SubLObject var344, final SubLObject var211, final SubLObject var213, final SubLObject var209, final SubLObject var130, final SubLObject var331) {
        assert NIL != constant_handles_oc.f8449(var114) : var114;
        if (NIL != var241 && !areAssertionsDisabledFor(me) && NIL == Types.integerp(var241)) {
            throw new AssertionError(var241);
        }
        if (NIL != var242 && !areAssertionsDisabledFor(me) && NIL == Types.integerp(var242)) {
            throw new AssertionError(var242);
        }
        if (NIL != var243 && !areAssertionsDisabledFor(me) && NIL == Types.integerp(var243)) {
            throw new AssertionError(var243);
        }
        if (NIL != var131 && !areAssertionsDisabledFor(me) && NIL == Types.listp(var131)) {
            throw new AssertionError(var131);
        }
        if (NIL != var132 && !areAssertionsDisabledFor(me) && NIL == Types.listp(var132)) {
            throw new AssertionError(var132);
        }
        if (NIL != var133 && !areAssertionsDisabledFor(me) && NIL == Types.listp(var133)) {
            throw new AssertionError(var133);
        }
        assert NIL != Types.listp(var211) : var211;
        assert NIL != Types.listp(var213) : var213;
        assert NIL != module0161.f10479(var130) : var130;
        if (NIL != f42138(var331)) {
            module0543.f33631((SubLObject)ConsesLow.listS($ic418$, var114, (SubLObject)$ic419$), module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0543.f33631((SubLObject)ConsesLow.listS($ic418$, var114, (SubLObject)$ic420$), module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0543.f33631((SubLObject)ConsesLow.list($ic421$, var114, var128), var130, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var345 = (SubLObject)NIL;
        if (NIL != var131 || NIL != var344) {
            f42139(var114, var131, var130, var331);
        }
        else if (NIL != var132 || NIL != var133) {
            if (NIL != var132) {
                SubLObject var346 = var132;
                SubLObject var347 = (SubLObject)NIL;
                var347 = var346.first();
                while (NIL != var346) {
                    f42140(var114, var347, var130);
                    var346 = var346.rest();
                    var347 = var346.first();
                }
            }
            if (NIL != var133) {
                SubLObject var346 = var133;
                SubLObject var348 = (SubLObject)NIL;
                var348 = var346.first();
                while (NIL != var346) {
                    f42141(var114, var348, var130);
                    var346 = var346.rest();
                    var348 = var346.first();
                }
            }
        }
        else if (NIL != var343) {
            f42142(var114, var130);
        }
        else {
            var345 = (SubLObject)$ic422$;
        }
        if (NIL != var241) {
            f42143(var114, var241, var130);
        }
        if (NIL != var242) {
            f42144(var114, var242, var130);
        }
        if (NIL != var243) {
            f42145(var114, var243, var130);
        }
        SubLObject var346 = var209;
        SubLObject var349 = (SubLObject)NIL;
        var349 = var346.first();
        while (NIL != var346) {
            f42146(var114, var349, var130);
            var346 = var346.rest();
            var349 = var346.first();
        }
        var346 = var211;
        SubLObject var350 = (SubLObject)NIL;
        var350 = var346.first();
        while (NIL != var346) {
            f42147(var114, var350, var130);
            var346 = var346.rest();
            var350 = var346.first();
        }
        var346 = var213;
        SubLObject var351 = (SubLObject)NIL;
        var351 = var346.first();
        while (NIL != var346) {
            f42148(var114, var351, var130);
            var346 = var346.rest();
            var351 = var346.first();
        }
        return Values.values(var114, var345);
    }
    
    public static SubLObject f42138(final SubLObject var331) {
        SubLObject var332 = var331;
        SubLObject var333 = (SubLObject)NIL;
        var333 = var332.first();
        while (NIL != var332) {
            SubLObject var335;
            final SubLObject var334 = var335 = var333;
            SubLObject var336 = (SubLObject)NIL;
            SubLObject var337 = (SubLObject)NIL;
            SubLObject var338 = (SubLObject)NIL;
            SubLObject var339 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var335, var334, (SubLObject)$ic423$);
            var336 = var335.first();
            var335 = var335.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var335, var334, (SubLObject)$ic423$);
            var337 = var335.first();
            var335 = var335.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var335, var334, (SubLObject)$ic423$);
            var338 = var335.first();
            var335 = var335.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var335, var334, (SubLObject)$ic423$);
            var339 = var335.first();
            var335 = var335.rest();
            if (NIL == var335) {
                if (NIL != var339) {
                    return (SubLObject)T;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var334, (SubLObject)$ic423$);
            }
            var332 = var332.rest();
            var333 = var332.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42137(final SubLObject var114, final SubLObject var128, final SubLObject var241, final SubLObject var242, final SubLObject var243, final SubLObject var131, final SubLObject var132, final SubLObject var133, final SubLObject var343, final SubLObject var344, final SubLObject var211, final SubLObject var213, final SubLObject var209, final SubLObject var130, final SubLObject var331) {
        final SubLThread var345 = SubLProcess.currentSubLThread();
        assert NIL != constant_handles_oc.f8449(var114) : var114;
        if (NIL != var241 && !areAssertionsDisabledFor(me) && NIL == Types.integerp(var241)) {
            throw new AssertionError(var241);
        }
        if (NIL != var242 && !areAssertionsDisabledFor(me) && NIL == Types.integerp(var242)) {
            throw new AssertionError(var242);
        }
        if (NIL != var243 && !areAssertionsDisabledFor(me) && NIL == Types.integerp(var243)) {
            throw new AssertionError(var243);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var345) && NIL == module0035.f2370((SubLObject)$ic236$, var132, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic424$, var131);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var345) && NIL == module0035.f2370((SubLObject)$ic236$, var132, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic424$, var132);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var345) && NIL == module0035.f2370((SubLObject)$ic236$, var133, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic424$, var133);
        }
        assert NIL != Types.listp(var211) : var211;
        assert NIL != Types.listp(var213) : var213;
        assert NIL != module0161.f10479(var130) : var130;
        if (NIL != var331) {
            module0543.f33631((SubLObject)ConsesLow.listS($ic418$, var114, (SubLObject)$ic419$), module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0543.f33631((SubLObject)ConsesLow.listS($ic418$, var114, (SubLObject)$ic420$), module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0543.f33631((SubLObject)ConsesLow.list($ic421$, var114, var128), var130, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f42149(var114, var241, var130);
        f42150(var114, var242, var130);
        f42151(var114, var243, var130);
        if (NIL != var131 || NIL != var344) {
            f42152(var114, var131, var130, var331);
        }
        else if (NIL != var132 || NIL != var133) {
            f42153(var114, var132, var133, var130);
        }
        else if (NIL != var343) {
            f42154(var114, var130);
        }
        f42155(var114, var209, var130);
        f42156(var114, var211, var130);
        f42157(var114, var213, var130);
        return var114;
    }
    
    public static SubLObject f42149(final SubLObject var114, final SubLObject var241, final SubLObject var130) {
        final SubLObject var242 = f42158(var114, $ic425$).first();
        final SubLObject var243 = (SubLObject)((NIL != var242) ? module0178.f11335(var242) : NIL);
        if (!var243.eql(var241)) {
            if (NIL != assertion_handles_oc.f11035(var242)) {
                module0543.f33630(var242);
            }
            if (NIL != var241) {
                return f42143(var114, var241, var130);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42150(final SubLObject var114, final SubLObject var242, final SubLObject var130) {
        final SubLObject var243 = f42158(var114, $ic426$).first();
        final SubLObject var244 = (SubLObject)((NIL != var243) ? module0178.f11335(var243) : NIL);
        if (!var244.eql(var242)) {
            if (NIL != assertion_handles_oc.f11035(var243)) {
                module0543.f33630(var243);
            }
            if (NIL != var242) {
                return f42144(var114, var242, var130);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42151(final SubLObject var114, final SubLObject var243, final SubLObject var130) {
        final SubLObject var244 = f42158(var114, $ic427$).first();
        final SubLObject var245 = (SubLObject)((NIL != var244) ? module0178.f11335(var244) : NIL);
        if (!var245.eql(var243)) {
            if (NIL != assertion_handles_oc.f11035(var244)) {
                module0543.f33630(var244);
            }
            if (NIL != var243) {
                return f42145(var114, var243, var130);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42143(final SubLObject var114, final SubLObject var241, final SubLObject var130) {
        return f42159(var114, $ic425$, var241, var130);
    }
    
    public static SubLObject f42144(final SubLObject var114, final SubLObject var242, final SubLObject var130) {
        return f42159(var114, $ic426$, var242, var130);
    }
    
    public static SubLObject f42145(final SubLObject var114, final SubLObject var243, final SubLObject var130) {
        return f42159(var114, $ic427$, var243, var130);
    }
    
    public static SubLObject f42152(final SubLObject var114, final SubLObject var131, final SubLObject var130, final SubLObject var331) {
        final SubLObject var332 = f42158(var114, $ic428$);
        final SubLObject var333 = f42158(var114, $ic429$);
        final SubLObject var334 = f42158(var114, $ic430$);
        final SubLObject var335 = f42158(var114, $ic431$);
        final SubLObject var336 = module0233.f15412(var131);
        SubLObject var337 = (SubLObject)T;
        SubLObject var338 = var333;
        SubLObject var339 = (SubLObject)NIL;
        var339 = var338.first();
        while (NIL != var338) {
            module0543.f33630(var339);
            var338 = var338.rest();
            var339 = var338.first();
        }
        var338 = var334;
        SubLObject var340 = (SubLObject)NIL;
        var340 = var338.first();
        while (NIL != var338) {
            module0543.f33630(var340);
            var338 = var338.rest();
            var340 = var338.first();
        }
        var338 = var332;
        SubLObject var341 = (SubLObject)NIL;
        var341 = var338.first();
        while (NIL != var338) {
            final SubLObject var342 = module0178.f11335(var341);
            final SubLObject var343 = module0178.f11287(var341);
            if (!var343.eql(var130) || !var342.equal(var336)) {
                module0543.f33630(var341);
            }
            var338 = var338.rest();
            var341 = var338.first();
        }
        var338 = var335;
        SubLObject var344 = (SubLObject)NIL;
        var344 = var338.first();
        while (NIL != var338) {
            module0543.f33630(var344);
            var338 = var338.rest();
            var344 = var338.first();
        }
        if (NIL == module0220.f14584((SubLObject)ConsesLow.list($ic428$, var114, var336), var130, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var337 = f42139(var114, var131, var130, var331);
        }
        return var337;
    }
    
    public static SubLObject f42153(final SubLObject var114, final SubLObject var132, final SubLObject var133, final SubLObject var130) {
        final SubLObject var134 = f42158(var114, $ic428$);
        final SubLObject var135 = f42158(var114, $ic431$);
        SubLObject var136 = var134;
        SubLObject var137 = (SubLObject)NIL;
        var137 = var136.first();
        while (NIL != var136) {
            module0543.f33630(var137);
            var136 = var136.rest();
            var137 = var136.first();
        }
        var136 = var135;
        SubLObject var138 = (SubLObject)NIL;
        var138 = var136.first();
        while (NIL != var136) {
            module0543.f33630(var138);
            var136 = var136.rest();
            var138 = var136.first();
        }
        f42160(var114, $ic429$, var132, var130);
        f42160(var114, $ic430$, var133, var130);
        return var114;
    }
    
    public static SubLObject f42154(final SubLObject var114, final SubLObject var130) {
        final SubLObject var131 = f42158(var114, $ic428$);
        final SubLObject var132 = f42158(var114, $ic429$);
        final SubLObject var133 = f42158(var114, $ic430$);
        SubLObject var135;
        final SubLObject var134 = var135 = ConsesLow.append(var131, var132, var133);
        SubLObject var136 = (SubLObject)NIL;
        var136 = var135.first();
        while (NIL != var135) {
            module0543.f33630(var136);
            var135 = var135.rest();
            var136 = var135.first();
        }
        if (NIL == module0220.f14584((SubLObject)ConsesLow.list($ic431$, var114), var130, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            f42142(var114, var130);
        }
        return var114;
    }
    
    public static SubLObject f42139(final SubLObject var114, final SubLObject var131, final SubLObject var130, final SubLObject var331) {
        final SubLObject var332 = module0233.f15412(var131);
        if (NIL != var331) {
            final SubLObject var333 = Sequences.position(var332, var331, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic432$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var333) {
                final SubLObject var334 = ConsesLow.nth(var333, var331).first();
                final SubLObject var335 = module0633.f38713(var114, (SubLObject)UNPROVIDED);
                final SubLObject var336 = (SubLObject)ConsesLow.list($ic433$, var335, var334);
                f42159(var114, $ic434$, var336, var130);
            }
        }
        return f42159(var114, $ic428$, var332, var130);
    }
    
    public static SubLObject f42140(final SubLObject var114, final SubLObject var345, final SubLObject var130) {
        assert NIL != module0233.f15359(var345) : var345;
        return f42159(var114, $ic429$, var345, var130);
    }
    
    public static SubLObject f42141(final SubLObject var114, final SubLObject var346, final SubLObject var130) {
        assert NIL != module0233.f15359(var346) : var346;
        return f42159(var114, $ic430$, var346, var130);
    }
    
    public static SubLObject f42142(final SubLObject var114, final SubLObject var130) {
        return module0543.f33631((SubLObject)ConsesLow.list($ic431$, var114), var130, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42155(final SubLObject var114, final SubLObject var209, final SubLObject var130) {
        SubLObject var211;
        final SubLObject var210 = var211 = f42158(var114, $ic418$);
        SubLObject var212 = (SubLObject)NIL;
        var212 = var211.first();
        while (NIL != var211) {
            final SubLObject var213 = module0178.f11335(var212);
            final SubLObject var214 = module0178.f11287(var212);
            if (!var213.eql($ic45$) && ((!var214.eql(module0132.$g1555$.getGlobalValue()) && !var214.eql(var130)) || NIL == conses_high.member(var213, var209, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                module0543.f33630(var212);
            }
            var211 = var211.rest();
            var212 = var211.first();
        }
        var211 = var209;
        SubLObject var215 = (SubLObject)NIL;
        var215 = var211.first();
        while (NIL != var211) {
            if (NIL == module0220.f14587((SubLObject)ConsesLow.list($ic418$, var114, var215), var130, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                f42146(var114, var215, var130);
            }
            var211 = var211.rest();
            var215 = var211.first();
        }
        return var114;
    }
    
    public static SubLObject f42146(final SubLObject var114, final SubLObject var347, final SubLObject var130) {
        return f42159(var114, $ic418$, var347, var130);
    }
    
    public static SubLObject f42156(final SubLObject var114, final SubLObject var211, final SubLObject var130) {
        return f42160(var114, $ic435$, var211, var130);
    }
    
    public static SubLObject f42147(final SubLObject var114, final SubLObject var183, final SubLObject var130) {
        return f42159(var114, $ic435$, var183, var130);
    }
    
    public static SubLObject f42157(final SubLObject var114, final SubLObject var185, final SubLObject var130) {
        return f42160(var114, $ic436$, var185, var130);
    }
    
    public static SubLObject f42148(final SubLObject var114, final SubLObject var190, final SubLObject var130) {
        return f42159(var114, $ic436$, var190, var130);
    }
    
    public static SubLObject f42158(final SubLObject var114, final SubLObject var374) {
        final SubLThread var375 = SubLProcess.currentSubLThread();
        SubLObject var376 = (SubLObject)NIL;
        final SubLObject var377 = module0147.$g2094$.currentBinding(var375);
        final SubLObject var378 = module0147.$g2095$.currentBinding(var375);
        try {
            module0147.$g2094$.bind((SubLObject)$ic437$, var375);
            module0147.$g2095$.bind($ic438$, var375);
            if (NIL != module0158.f10010(var114, (SubLObject)ONE_INTEGER, var374)) {
                final SubLObject var379 = module0158.f10011(var114, (SubLObject)ONE_INTEGER, var374);
                SubLObject var380 = (SubLObject)NIL;
                final SubLObject var381 = (SubLObject)NIL;
                while (NIL == var380) {
                    final SubLObject var382 = module0052.f3695(var379, var381);
                    final SubLObject var383 = (SubLObject)makeBoolean(!var381.eql(var382));
                    if (NIL != var383) {
                        SubLObject var384 = (SubLObject)NIL;
                        try {
                            var384 = module0158.f10316(var382, (SubLObject)$ic439$, (SubLObject)$ic440$, (SubLObject)NIL);
                            SubLObject var377_382 = (SubLObject)NIL;
                            final SubLObject var378_383 = (SubLObject)NIL;
                            while (NIL == var377_382) {
                                final SubLObject var385 = module0052.f3695(var384, var378_383);
                                final SubLObject var380_384 = (SubLObject)makeBoolean(!var378_383.eql(var385));
                                if (NIL != var380_384) {
                                    var376 = (SubLObject)ConsesLow.cons(var385, var376);
                                }
                                var377_382 = (SubLObject)makeBoolean(NIL == var380_384);
                            }
                        }
                        finally {
                            final SubLObject var5_385 = Threads.$is_thread_performing_cleanupP$.currentBinding(var375);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var375);
                                if (NIL != var384) {
                                    module0158.f10319(var384);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var5_385, var375);
                            }
                        }
                    }
                    var380 = (SubLObject)makeBoolean(NIL == var383);
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
        SubLObject var387 = (NIL != module0614.f37617(var386)) ? module0614.f37640(var386) : module0267.f17575(var386, (SubLObject)UNPROVIDED);
        if (NIL == var387) {
            var387 = module0202.f12643($ic441$, var386);
        }
        return var387;
    }
    
    public static SubLObject f42162(final SubLObject var386) {
        final SubLThread var387 = SubLProcess.currentSubLThread();
        SubLObject var388 = (SubLObject)NIL;
        final SubLObject var389 = module0147.f9540(module0632.f38705());
        final SubLObject var390 = module0147.$g2095$.currentBinding(var387);
        final SubLObject var391 = module0147.$g2094$.currentBinding(var387);
        final SubLObject var392 = module0147.$g2096$.currentBinding(var387);
        try {
            module0147.$g2095$.bind(module0147.f9545(var389), var387);
            module0147.$g2094$.bind(module0147.f9546(var389), var387);
            module0147.$g2096$.bind(module0147.f9549(var389), var387);
            if (NIL != module0161.f10593(var386)) {
                var388 = module0202.f12768($ic442$, f42161(var386), (SubLObject)$ic443$);
            }
            else {
                var388 = module0202.f12643($ic444$, (SubLObject)$ic443$);
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
        return module0035.sublisp_boolean(module0434.f30578((SubLObject)$ic445$, (SubLObject)ConsesLow.listS($ic446$, var374, (SubLObject)$ic447$), module0632.f38705(), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f42164(final SubLObject var389) {
        final SubLObject var390 = module0617.f37872(var389, (SubLObject)UNPROVIDED);
        if (var390.isInteger()) {
            return module0612.f37514(var390);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42160(final SubLObject var114, final SubLObject var374, final SubLObject var391, final SubLObject var130) {
        final SubLThread var392 = SubLProcess.currentSubLThread();
        final SubLObject var393 = f42163(var374);
        final SubLObject var394 = f42158(var114, var374);
        final SubLObject var395 = (NIL != var393) ? module0632.f38707(var130) : var130;
        SubLObject var396 = var394;
        SubLObject var397 = (SubLObject)NIL;
        var397 = var396.first();
        while (NIL != var396) {
            final SubLObject var398 = module0178.f11335(var397);
            final SubLObject var399 = module0178.f11287(var397);
            final SubLObject var400 = module0161.f10557(var399);
            if ((!var400.eql(var130) || NIL == conses_high.member(var398, var391, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) && (NIL == var393 || NIL != module0434.f30578((SubLObject)$ic445$, (SubLObject)ConsesLow.list(var374, var114, var398), var395, (SubLObject)UNPROVIDED))) {
                module0543.f33630(var397);
                if (NIL != var393) {
                    final SubLObject var401 = module0161.f10586(var399);
                    SubLObject var402 = (SubLObject)NIL;
                    SubLObject var403 = (SubLObject)NIL;
                    var392.resetMultipleValues();
                    final SubLObject var400_401 = module0161.f10598(var401);
                    final SubLObject var402_403 = var392.secondMultipleValue();
                    var392.resetMultipleValues();
                    var402 = var400_401;
                    var403 = var402_403;
                    if (var403.eql($ic448$)) {
                        var403 = $ic449$;
                    }
                    final SubLObject var404 = module0147.f9540(module0632.f38705());
                    final SubLObject var405 = module0147.$g2095$.currentBinding(var392);
                    final SubLObject var406 = module0147.$g2094$.currentBinding(var392);
                    final SubLObject var407 = module0147.$g2096$.currentBinding(var392);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var404), var392);
                        module0147.$g2094$.bind(module0147.f9546(var404), var392);
                        module0147.$g2096$.bind(module0147.f9549(var404), var392);
                        final SubLObject var408 = (NIL != module0161.f10593(var402)) ? var402 : f42164(var114);
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
        SubLObject var411 = (SubLObject)NIL;
        var411 = var396.first();
        while (NIL != var396) {
            if (NIL == module0434.f30578((SubLObject)$ic445$, (SubLObject)ConsesLow.list(var374, var114, var411), var395, (SubLObject)UNPROVIDED)) {
                f42159(var114, var374, var411, var130);
            }
            var396 = var396.rest();
            var411 = var396.first();
        }
        return var114;
    }
    
    public static SubLObject f42159(final SubLObject var114, final SubLObject var374, final SubLObject var407, SubLObject var130) {
        if (NIL != f42163(var374)) {
            var130 = module0161.f10518((SubLObject)ConsesLow.list(var130, module0161.f10543((SubLObject)$ic450$, $ic449$)));
        }
        return f42165(var114, var374, var407, var130);
    }
    
    public static SubLObject f42165(final SubLObject var114, final SubLObject var374, final SubLObject var407, final SubLObject var200) {
        return module0543.f33631((SubLObject)ConsesLow.list(var374, var114, var407), var200, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42166(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == var2) {
            var2 = (SubLObject)$ic455$;
        }
        final SubLObject var4 = module0656.f39832((SubLObject)$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic456$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var4) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42167(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = (SubLObject)$ic452$;
        final SubLObject var9 = module0015.$g538$.currentBinding(var7);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var7))) ? module0015.$g538$.getDynamicValue(var7) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var7);
            module0642.f39020((SubLObject)$ic19$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
            final SubLObject var10 = module0014.f672((SubLObject)$ic20$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var10) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var10);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic22$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var8) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var8);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var5_408 = module0015.$g535$.currentBinding(var7);
            try {
                module0015.$g535$.bind((SubLObject)T, var7);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var7)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var7)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic122$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_409 = module0015.$g533$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)T, var7);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic123$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_410 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var7);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic124$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic125$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic126$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_410, var7);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var8) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var8);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var11 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var7));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic40$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var11) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var11);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_411 = module0015.$g533$.currentBinding(var7);
                    final SubLObject var12 = module0015.$g541$.currentBinding(var7);
                    final SubLObject var13 = module0015.$g539$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var7);
                        module0015.$g541$.bind((SubLObject)T, var7);
                        module0015.$g539$.bind(module0015.f797(), var7);
                        module0642.f39069((SubLObject)$ic458$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        final SubLObject var14 = f42168(module0574.f35152());
                        module0642.f39020(module0015.$g207$.getGlobalValue());
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic459$);
                        module0656.f39804(module0574.f35152(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic460$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39020(module0015.$g208$.getGlobalValue());
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        if (NIL != var14) {
                            f42169();
                            f42170(var14);
                            f42169();
                        }
                        else {
                            module0642.f39021((SubLObject)$ic461$);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var7));
                    }
                    finally {
                        module0015.$g539$.rebind(var13, var7);
                        module0015.$g541$.rebind(var12, var7);
                        module0015.$g533$.rebind(var5_411, var7);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_409, var7);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5_408, var7);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var9, var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42168(final SubLObject var190) {
        return module0213.f13926(module0634.f38758(var190), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42169() {
        module0656.f39837((SubLObject)$ic451$, (SubLObject)$ic463$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0642.f39074((SubLObject)$ic464$, (SubLObject)$ic465$, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42170(final SubLObject var412) {
        final SubLThread var413 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var414 = module0015.$g533$.currentBinding(var413);
        try {
            module0015.$g533$.bind((SubLObject)T, var413);
            f42171();
            SubLObject var415 = var412;
            SubLObject var416 = (SubLObject)NIL;
            var416 = var415.first();
            while (NIL != var415) {
                final SubLObject var417 = module0259.f16854(var416, $ic298$, module0632.f38705(), (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_414 = module0015.$g533$.currentBinding(var413);
                try {
                    module0015.$g533$.bind((SubLObject)T, var413);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_415 = module0015.$g533$.currentBinding(var413);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var413);
                        module0656.f39837((SubLObject)$ic71$, var416, (SubLObject)$ic466$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_415, var413);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_416 = module0015.$g533$.currentBinding(var413);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var413);
                        module0656.f39837((SubLObject)$ic3$, var416, (SubLObject)$ic467$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_416, var413);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_417 = module0015.$g533$.currentBinding(var413);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var413);
                        module0656.f39804(var416, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_417, var413);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic314$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_418 = module0015.$g533$.currentBinding(var413);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var413);
                        final SubLObject var418 = (SubLObject)makeBoolean(NIL != var417 && NIL == f42172(var416));
                        module0642.f39068(module0656.f39842(var416), var417, var417, (SubLObject)NIL, (SubLObject)NIL, var418);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                var415 = var415.rest();
                var416 = var415.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var414, var413);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42171() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_420 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39021((SubLObject)$ic468$);
            }
            finally {
                module0015.$g533$.rebind(var5_420, var3);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_421 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39021((SubLObject)$ic469$);
            }
            finally {
                module0015.$g533$.rebind(var5_421, var3);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_422 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39021((SubLObject)$ic470$);
            }
            finally {
                module0015.$g533$.rebind(var5_422, var3);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic27$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_423 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39021((SubLObject)$ic471$);
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
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42173(SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        var6 = var6.rest();
        final SubLObject var8 = f42168(module0574.f35152());
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = var6;
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            final SubLObject var13 = var12.first();
            if (var13.equal((SubLObject)$ic465$)) {
                var9 = (SubLObject)T;
            }
            else {
                final SubLObject var14 = module0656.f39943(var13, (SubLObject)UNPROVIDED);
                if (NIL != var14) {
                    var10 = (SubLObject)ConsesLow.cons(var14, var10);
                }
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        if (NIL != var9) {
            final SubLObject var15 = module0035.f2220(var8, var10, (SubLObject)UNPROVIDED);
            if (NIL != module0543.f33698()) {
                module0667.f40583((SubLObject)$ic472$);
            }
            else {
                SubLObject var16 = var10;
                SubLObject var17 = (SubLObject)NIL;
                var17 = var16.first();
                while (NIL != var16) {
                    f42174(var17, (SubLObject)T);
                    var16 = var16.rest();
                    var17 = var16.first();
                }
                var16 = var15;
                var17 = (SubLObject)NIL;
                var17 = var16.first();
                while (NIL != var16) {
                    f42174(var17, (SubLObject)NIL);
                    var16 = var16.rest();
                    var17 = var16.first();
                }
            }
            module0642.f39020((SubLObject)$ic19$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
            final SubLObject var18 = module0014.f672((SubLObject)$ic20$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var18) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var18);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic22$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            module0642.f39019((SubLObject)$ic473$);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var19 = module0015.$g132$.getDynamicValue(var7);
            final SubLObject var20 = module0015.$g535$.currentBinding(var7);
            try {
                module0015.$g535$.bind((SubLObject)T, var7);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != var19) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(var19));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_431 = module0015.$g533$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)T, var7);
                    module0642.f39020(module0015.$g207$.getGlobalValue());
                    module0642.f39021((SubLObject)$ic473$);
                    module0642.f39020(module0015.$g208$.getGlobalValue());
                    module0656.f39794((SubLObject)$ic452$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_431, var7);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var20, var7);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42174(final SubLObject var429, final SubLObject var432) {
        final SubLObject var433 = f42172(var429);
        if (NIL != var432) {
            if (NIL == var433) {
                module0543.f33628((SubLObject)ConsesLow.listS($ic418$, var429, (SubLObject)$ic475$), module0632.f38705(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            SubLObject var434 = var433;
            SubLObject var435 = (SubLObject)NIL;
            var435 = var434.first();
            while (NIL != var434) {
                module0543.f33658((SubLObject)ConsesLow.listS($ic418$, var429, (SubLObject)$ic475$), var435);
                if (NIL == module0633.f38716(var429, (SubLObject)UNPROVIDED)) {
                    module0543.f33628((SubLObject)ConsesLow.listS($ic418$, var429, (SubLObject)$ic420$), module0632.f38705(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                var434 = var434.rest();
                var435 = var434.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42172(final SubLObject var429) {
        final SubLThread var430 = SubLProcess.currentSubLThread();
        SubLObject var431 = (SubLObject)NIL;
        final SubLObject var432 = module0147.$g2094$.currentBinding(var430);
        final SubLObject var433 = module0147.$g2095$.currentBinding(var430);
        try {
            module0147.$g2094$.bind((SubLObject)$ic437$, var430);
            module0147.$g2095$.bind($ic438$, var430);
            SubLObject var434 = module0288.f19344((SubLObject)ConsesLow.listS($ic418$, var429, (SubLObject)$ic475$), (SubLObject)UNPROVIDED);
            SubLObject var435 = (SubLObject)NIL;
            var435 = var434.first();
            while (NIL != var434) {
                if (NIL != module0178.f11375(var435)) {
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42176() {
        $g5388$ = SubLFiles.defparameter("S#46151", (SubLObject)NIL);
        $g5389$ = SubLFiles.defparameter("S#46152", Hashtables.make_hash_table((SubLObject)$ic141$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g5390$ = SubLFiles.defconstant("S#46153", (SubLObject)$ic144$);
        $g5391$ = SubLFiles.defvar("S#46154", (SubLObject)NIL);
        $g5392$ = SubLFiles.defconstant("S#46155", (SubLObject)$ic217$);
        $g5393$ = SubLFiles.defparameter("S#46156", (SubLObject)$ic26$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42177() {
        module0656.f39840((SubLObject)$ic3$, (SubLObject)$ic4$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic5$);
        module0656.f39840((SubLObject)$ic8$, (SubLObject)$ic9$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic10$);
        module0656.f39819((SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)$ic13$, (SubLObject)$ic14$);
        module0656.f39840((SubLObject)$ic11$, (SubLObject)$ic17$, (SubLObject)ONE_INTEGER);
        module0012.f441((SubLObject)$ic18$);
        module0015.f873((SubLObject)$ic34$);
        module0015.f873((SubLObject)$ic54$);
        module0015.f873((SubLObject)$ic56$);
        module0656.f39840((SubLObject)$ic28$, (SubLObject)$ic89$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic92$);
        module0656.f39840((SubLObject)$ic75$, (SubLObject)$ic95$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic96$);
        module0656.f39840((SubLObject)$ic74$, (SubLObject)$ic99$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic100$);
        module0656.f39840((SubLObject)$ic82$, (SubLObject)$ic103$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic107$);
        module0656.f39840((SubLObject)$ic73$, (SubLObject)$ic110$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic116$);
        Hashtables.sethash((SubLObject)$ic117$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic118$, (SubLObject)NIL));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5390$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic151$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic152$);
        Structures.def_csetf((SubLObject)$ic153$, (SubLObject)$ic154$);
        Structures.def_csetf((SubLObject)$ic155$, (SubLObject)$ic156$);
        Structures.def_csetf((SubLObject)$ic157$, (SubLObject)$ic158$);
        Structures.def_csetf((SubLObject)$ic159$, (SubLObject)$ic160$);
        Structures.def_csetf((SubLObject)$ic161$, (SubLObject)$ic162$);
        Structures.def_csetf((SubLObject)$ic163$, (SubLObject)$ic164$);
        Structures.def_csetf((SubLObject)$ic165$, (SubLObject)$ic166$);
        Structures.def_csetf((SubLObject)$ic167$, (SubLObject)$ic168$);
        Structures.def_csetf((SubLObject)$ic169$, (SubLObject)$ic170$);
        Structures.def_csetf((SubLObject)$ic171$, (SubLObject)$ic172$);
        Structures.def_csetf((SubLObject)$ic173$, (SubLObject)$ic174$);
        Structures.def_csetf((SubLObject)$ic175$, (SubLObject)$ic176$);
        Structures.def_csetf((SubLObject)$ic177$, (SubLObject)$ic178$);
        Equality.identity((SubLObject)$ic144$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5390$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic197$));
        module0012.f441((SubLObject)$ic216$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5392$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic223$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic224$);
        Structures.def_csetf((SubLObject)$ic225$, (SubLObject)$ic226$);
        Structures.def_csetf((SubLObject)$ic227$, (SubLObject)$ic228$);
        Structures.def_csetf((SubLObject)$ic229$, (SubLObject)$ic230$);
        Equality.identity((SubLObject)$ic217$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5392$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic235$));
        module0656.f39840((SubLObject)$ic71$, (SubLObject)$ic241$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic243$);
        module0656.f39840((SubLObject)$ic248$, (SubLObject)$ic249$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic252$);
        module0015.f873((SubLObject)$ic325$);
        module0012.f441((SubLObject)$ic332$);
        module0015.f873((SubLObject)$ic392$);
        module0656.f39819((SubLObject)$ic451$, (SubLObject)$ic452$, (SubLObject)$ic453$, (SubLObject)$ic454$);
        module0656.f39840((SubLObject)$ic451$, (SubLObject)$ic457$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic462$);
        module0015.f873((SubLObject)$ic474$);
        return (SubLObject)NIL;
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
        $g5388$ = null;
        $g5389$ = null;
        $g5390$ = null;
        $g5391$ = null;
        $g5392$ = null;
        $g5393$ = null;
        $ic0$ = makeString("[Run Test]");
        $ic1$ = makeKeyword("MAIN");
        $ic2$ = makeString("cb-kct-test-run&~a");
        $ic3$ = makeKeyword("KCT-TEST");
        $ic4$ = makeSymbol("S#46006", "CYC");
        $ic5$ = makeSymbol("CB-KCT-TEST-RUN");
        $ic6$ = makeString("[Run Test Set]");
        $ic7$ = makeString("cb-kct-test-set-run&~a");
        $ic8$ = makeKeyword("KCT-TEST-SET");
        $ic9$ = makeSymbol("S#46007", "CYC");
        $ic10$ = makeSymbol("CB-KCT-TEST-SET-RUN");
        $ic11$ = makeKeyword("KCT");
        $ic12$ = makeString("KB Content Test Monitor");
        $ic13$ = makeString("KCTRun");
        $ic14$ = makeString("View status of running and completed KB Content Tests");
        $ic15$ = makeString("[KCTRun]");
        $ic16$ = makeString("cb-kct-main");
        $ic17$ = makeSymbol("S#46008", "CYC");
        $ic18$ = makeSymbol("S#46151", "CYC");
        $ic19$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic20$ = makeKeyword("CB-CYC");
        $ic21$ = makeString("stylesheet");
        $ic22$ = makeString("text/css");
        $ic23$ = makeString("Refresh");
        $ic24$ = makeString("5; URL=cg?cb-kct-main");
        $ic25$ = makeString("#9999ff");
        $ic26$ = makeString("#ffffff");
        $ic27$ = makeKeyword("TOP");
        $ic28$ = makeKeyword("KCT-TOGGLE-REFRESH");
        $ic29$ = ConsesLow.list((SubLObject)makeString("main"));
        $ic30$ = makeString("None running.");
        $ic31$ = makeString("Individual Tests");
        $ic32$ = makeString("Test Categories");
        $ic33$ = makeString("There are no running or finished tests at this time.");
        $ic34$ = makeSymbol("CB-KCT-MAIN");
        $ic35$ = makeString("#99ccff");
        $ic36$ = makeString("TEST");
        $ic37$ = makeString("TASK STATUS");
        $ic38$ = makeString("TASK ACTIONS");
        $ic39$ = makeString("TEST RESULT");
        $ic40$ = makeString("post");
        $ic41$ = makeString("cb-kct-start-test");
        $ic42$ = makeString("Enter test to run : ");
        $ic43$ = makeString("kct-test");
        $ic44$ = makeString("Complete");
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("KBContentTest-FullySpecified"));
        $ic46$ = makeString("Clear");
        $ic47$ = makeInteger(40);
        $ic48$ = makeString("Run Test");
        $ic49$ = makeString("cb-kct-start-test-collection");
        $ic50$ = makeString("Enter test category to run : ");
        $ic51$ = makeString("kct-coll");
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("KBContentTestSpecificationType"));
        $ic53$ = makeString("~A is not the name of a #$KBContentTest-FullySpecified.");
        $ic54$ = makeSymbol("CB-KCT-START-TEST");
        $ic55$ = makeString("~A is not the name of a #$KBContentTestSpecificationType.");
        $ic56$ = makeSymbol("CB-KCT-START-TEST-COLLECTION");
        $ic57$ = makeKeyword("RUNNING");
        $ic58$ = makeKeyword("STARTED");
        $ic59$ = makeString("#99ffff");
        $ic60$ = makeKeyword("STOPPED");
        $ic61$ = makeKeyword("NONE");
        $ic62$ = makeString("#cccccc");
        $ic63$ = makeKeyword("ERROR");
        $ic64$ = makeString("#ff6666");
        $ic65$ = makeKeyword("FINISHED");
        $ic66$ = makeKeyword("SUCCESS");
        $ic67$ = makeKeyword("FAILURE");
        $ic68$ = makeKeyword("PROBLEM");
        $ic69$ = makeKeyword("SKIPPED");
        $ic70$ = makeKeyword("COLLECTION");
        $ic71$ = makeKeyword("KCT-EDIT");
        $ic72$ = makeString("[Edit Test]");
        $ic73$ = makeKeyword("KCT-MEMBERS");
        $ic74$ = makeKeyword("KCT-ABORT");
        $ic75$ = makeKeyword("KCT-FORGET");
        $ic76$ = makeString(" ");
        $ic77$ = makeString("Task is just starting.");
        $ic78$ = makeString("Test halted with this error: ~A");
        $ic79$ = makeString("Task was halted before completion.");
        $ic80$ = makeKeyword("SEVERE");
        $ic81$ = makeString("Test is un-executable due to configuration errors.  Email detailing problems has been sent to the responsible cyclist.  Problems:  ~A");
        $ic82$ = makeKeyword("KCT-RESULTS");
        $ic83$ = makeString("Task was never begun.");
        $ic84$ = makeString("Unknown thinking status ~A");
        $ic85$ = makeString("[Halt Auto Refresh]");
        $ic86$ = makeString("[Start Auto Refresh]");
        $ic87$ = makeString("cb-kct-toggle-refresh");
        $ic88$ = makeString("|");
        $ic89$ = makeSymbol("S#46013", "CYC");
        $ic90$ = makeString("main");
        $ic91$ = makeString("members");
        $ic92$ = makeSymbol("CB-KCT-TOGGLE-REFRESH");
        $ic93$ = makeString("[Forget]");
        $ic94$ = makeString("cb-kct-thinking-forget&~a");
        $ic95$ = makeSymbol("S#46014", "CYC");
        $ic96$ = makeSymbol("CB-KCT-THINKING-FORGET");
        $ic97$ = makeString("[Abort]");
        $ic98$ = makeString("cb-kct-thinking-abort&~a");
        $ic99$ = makeSymbol("S#46015", "CYC");
        $ic100$ = makeSymbol("CB-KCT-THINKING-ABORT");
        $ic101$ = makeString("[View Results]");
        $ic102$ = makeString("cb-kct-thinking-results&~a");
        $ic103$ = makeSymbol("S#46016", "CYC");
        $ic104$ = makeKeyword("INDIVIDUAL");
        $ic105$ = makeKeyword("BRIEF");
        $ic106$ = makeString("Wrong type of KCT Thinking Task: ~A!");
        $ic107$ = makeSymbol("CB-KCT-THINKING-RESULTS");
        $ic108$ = makeString("[View Member Tests]");
        $ic109$ = makeString("cb-kct-thinking-members&~a");
        $ic110$ = makeSymbol("S#46017", "CYC");
        $ic111$ = makeString("Member test status for ~A");
        $ic112$ = makeString("5; URL=cg?cb-kct-thinking-members&~A");
        $ic113$ = makeString("This test category has no member tests!");
        $ic114$ = makeString("The test was stopped before all member tests could finish.");
        $ic115$ = makeString("All member tests have finished.");
        $ic116$ = makeSymbol("CB-KCT-THINKING-MEMBERS");
        $ic117$ = makeKeyword("CB-KCT-TEST-SET");
        $ic118$ = makeString("cb-kct-test-set.html");
        $ic119$ = makeString("Test Category Results");
        $ic120$ = makeKeyword("SHA1");
        $ic121$ = makeString("text/javascript");
        $ic122$ = makeString("yui-skin-sam");
        $ic123$ = makeString("reloadFrameButton");
        $ic124$ = makeString("button");
        $ic125$ = makeString("reload");
        $ic126$ = makeString("Refresh Frames");
        $ic127$ = makeString("Test Category: ");
        $ic128$ = makeString("First test in set started: ");
        $ic129$ = makeString("[unimplemented]");
        $ic130$ = makeString("Last test in set ended: ");
        $ic131$ = makeString("Overall status: ");
        $ic132$ = makeString("Explanation: ");
        $ic133$ = makeString("Results for member tests:");
        $ic134$ = makeSymbol("S#32782", "CYC");
        $ic135$ = makeString("Test Results for ");
        $ic136$ = makeString("Query: ");
        $ic137$ = makeString("Query Formula: ");
        $ic138$ = makeString("Test Status: ");
        $ic139$ = makeString("#B40000");
        $ic140$ = makeString("#228b22");
        $ic141$ = makeInteger(1024);
        $ic142$ = makeSymbol("INFERENCE-P");
        $ic143$ = makeSymbol("S#32762", "CYC");
        $ic144$ = makeSymbol("S#46003", "CYC");
        $ic145$ = makeSymbol("S#45615", "CYC");
        $ic146$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#33259", "CYC"), makeSymbol("S#29", "CYC"), makeSymbol("S#45660", "CYC"), makeSymbol("S#46157", "CYC"), makeSymbol("S#45662", "CYC"), makeSymbol("S#46158", "CYC"), makeSymbol("S#46159", "CYC"), makeSymbol("S#46160", "CYC"), makeSymbol("S#1988", "CYC"), makeSymbol("S#7998", "CYC"), makeSymbol("S#46161", "CYC"), makeSymbol("S#46162", "CYC"), makeSymbol("S#46163", "CYC") });
        $ic147$ = ConsesLow.list(new SubLObject[] { makeKeyword("TEST-SPEC"), makeKeyword("NAME"), makeKeyword("COMMENTS"), makeKeyword("QUERY-STATE"), makeKeyword("SAVE-MT"), makeKeyword("ANSWER-STATUS"), makeKeyword("ANSWER-OPTIONS-INDEX"), makeKeyword("ANSWER-OPTIONS-BINDINGS-INDEX"), makeKeyword("CATEGORIES"), makeKeyword("METRICS"), makeKeyword("CYCLISTS"), makeKeyword("NOTES"), makeKeyword("ANSWER-CARDINALITY") });
        $ic148$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#46022", "CYC"), makeSymbol("S#46023", "CYC"), makeSymbol("S#46024", "CYC"), makeSymbol("S#46025", "CYC"), makeSymbol("S#46026", "CYC"), makeSymbol("S#46027", "CYC"), makeSymbol("S#46028", "CYC"), makeSymbol("S#46029", "CYC"), makeSymbol("S#46030", "CYC"), makeSymbol("S#46031", "CYC"), makeSymbol("S#46032", "CYC"), makeSymbol("S#46033", "CYC"), makeSymbol("S#46034", "CYC") });
        $ic149$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#46035", "CYC"), makeSymbol("S#46036", "CYC"), makeSymbol("S#46037", "CYC"), makeSymbol("S#46038", "CYC"), makeSymbol("S#46039", "CYC"), makeSymbol("S#46040", "CYC"), makeSymbol("S#46041", "CYC"), makeSymbol("S#46042", "CYC"), makeSymbol("S#46043", "CYC"), makeSymbol("S#46044", "CYC"), makeSymbol("S#46045", "CYC"), makeSymbol("S#46046", "CYC"), makeSymbol("S#46047", "CYC") });
        $ic150$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic151$ = makeSymbol("S#46021", "CYC");
        $ic152$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#45615", "CYC"));
        $ic153$ = makeSymbol("S#46022", "CYC");
        $ic154$ = makeSymbol("S#46035", "CYC");
        $ic155$ = makeSymbol("S#46023", "CYC");
        $ic156$ = makeSymbol("S#46036", "CYC");
        $ic157$ = makeSymbol("S#46024", "CYC");
        $ic158$ = makeSymbol("S#46037", "CYC");
        $ic159$ = makeSymbol("S#46025", "CYC");
        $ic160$ = makeSymbol("S#46038", "CYC");
        $ic161$ = makeSymbol("S#46026", "CYC");
        $ic162$ = makeSymbol("S#46039", "CYC");
        $ic163$ = makeSymbol("S#46027", "CYC");
        $ic164$ = makeSymbol("S#46040", "CYC");
        $ic165$ = makeSymbol("S#46028", "CYC");
        $ic166$ = makeSymbol("S#46041", "CYC");
        $ic167$ = makeSymbol("S#46029", "CYC");
        $ic168$ = makeSymbol("S#46042", "CYC");
        $ic169$ = makeSymbol("S#46030", "CYC");
        $ic170$ = makeSymbol("S#46043", "CYC");
        $ic171$ = makeSymbol("S#46031", "CYC");
        $ic172$ = makeSymbol("S#46044", "CYC");
        $ic173$ = makeSymbol("S#46032", "CYC");
        $ic174$ = makeSymbol("S#46045", "CYC");
        $ic175$ = makeSymbol("S#46033", "CYC");
        $ic176$ = makeSymbol("S#46046", "CYC");
        $ic177$ = makeSymbol("S#46034", "CYC");
        $ic178$ = makeSymbol("S#46047", "CYC");
        $ic179$ = makeKeyword("TEST-SPEC");
        $ic180$ = makeKeyword("NAME");
        $ic181$ = makeKeyword("COMMENTS");
        $ic182$ = makeKeyword("QUERY-STATE");
        $ic183$ = makeKeyword("SAVE-MT");
        $ic184$ = makeKeyword("ANSWER-STATUS");
        $ic185$ = makeKeyword("ANSWER-OPTIONS-INDEX");
        $ic186$ = makeKeyword("ANSWER-OPTIONS-BINDINGS-INDEX");
        $ic187$ = makeKeyword("CATEGORIES");
        $ic188$ = makeKeyword("METRICS");
        $ic189$ = makeKeyword("CYCLISTS");
        $ic190$ = makeKeyword("NOTES");
        $ic191$ = makeKeyword("ANSWER-CARDINALITY");
        $ic192$ = makeString("Invalid slot ~S for construction function");
        $ic193$ = makeKeyword("BEGIN");
        $ic194$ = makeSymbol("S#46048", "CYC");
        $ic195$ = makeKeyword("SLOT");
        $ic196$ = makeKeyword("END");
        $ic197$ = makeSymbol("S#46050", "CYC");
        $ic198$ = makeSymbol("STRINGP");
        $ic199$ = makeSymbol("INTEGERP");
        $ic200$ = ConsesLow.list((SubLObject)makeKeyword("N"), (SubLObject)makeKeyword("MIN"), (SubLObject)makeKeyword("MAX"));
        $ic201$ = makeString("~A is not a known answer cardinality type.");
        $ic202$ = ConsesLow.list((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        $ic203$ = makeKeyword("N");
        $ic204$ = makeKeyword("MIN");
        $ic205$ = makeKeyword("MAX");
        $ic206$ = makeKeyword("UNIMPORTANT");
        $ic207$ = makeKeyword("EXACT");
        $ic208$ = makeKeyword("WANTED");
        $ic209$ = makeKeyword("INEXACT");
        $ic210$ = makeString("The wanted binding set, ");
        $ic211$ = makeString(", was not a KB-BINDING-SET-P -- dropping it.");
        $ic212$ = makeKeyword("UNWANTED");
        $ic213$ = makeString("The unwanted binding set, ");
        $ic214$ = makeKeyword("UNSPECIFIED");
        $ic215$ = makeKeyword("SKIP");
        $ic216$ = makeSymbol("S#46154", "CYC");
        $ic217$ = makeSymbol("S#46004", "CYC");
        $ic218$ = makeSymbol("S#46005", "CYC");
        $ic219$ = ConsesLow.list((SubLObject)makeSymbol("S#36025", "CYC"), (SubLObject)makeSymbol("S#5846", "CYC"), (SubLObject)makeSymbol("S#1519", "CYC"));
        $ic220$ = ConsesLow.list((SubLObject)makeKeyword("BINDING-SET"), (SubLObject)makeKeyword("STATUS"), (SubLObject)makeKeyword("ID"));
        $ic221$ = ConsesLow.list((SubLObject)makeSymbol("S#46066", "CYC"), (SubLObject)makeSymbol("S#46067", "CYC"), (SubLObject)makeSymbol("S#46068", "CYC"));
        $ic222$ = ConsesLow.list((SubLObject)makeSymbol("S#46069", "CYC"), (SubLObject)makeSymbol("S#46070", "CYC"), (SubLObject)makeSymbol("S#46071", "CYC"));
        $ic223$ = makeSymbol("S#46065", "CYC");
        $ic224$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#46005", "CYC"));
        $ic225$ = makeSymbol("S#46066", "CYC");
        $ic226$ = makeSymbol("S#46069", "CYC");
        $ic227$ = makeSymbol("S#46067", "CYC");
        $ic228$ = makeSymbol("S#46070", "CYC");
        $ic229$ = makeSymbol("S#46068", "CYC");
        $ic230$ = makeSymbol("S#46071", "CYC");
        $ic231$ = makeKeyword("BINDING-SET");
        $ic232$ = makeKeyword("STATUS");
        $ic233$ = makeKeyword("ID");
        $ic234$ = makeSymbol("S#46072", "CYC");
        $ic235$ = makeSymbol("S#46074", "CYC");
        $ic236$ = makeSymbol("S#18095", "CYC");
        $ic237$ = makeSymbol("KEYWORDP");
        $ic238$ = makeString("Edit this instance of #$KBContentTest-FullySpecified.");
        $ic239$ = makeString("cb-edit-test&~A");
        $ic240$ = makeString("nd();");
        $ic241$ = makeSymbol("S#46081", "CYC");
        $ic242$ = makeString("~A does not denote a test specification");
        $ic243$ = makeSymbol("CB-EDIT-TEST");
        $ic244$ = makeString("[Save As Test]");
        $ic245$ = makeKeyword("SELF");
        $ic246$ = makeString("Create an instance of #$KBContentTest-FullySpecified having a query specification with the sentence, microtheory and inference settings of the focal inference, and with expected results based on those obtained by the focal inference.");
        $ic247$ = makeString("cb-save-as-test&~A&~A");
        $ic248$ = makeKeyword("KCT-SAVE");
        $ic249$ = makeSymbol("S#46082", "CYC");
        $ic250$ = ConsesLow.list((SubLObject)makeSymbol("S#45911", "CYC"), (SubLObject)makeSymbol("S#45912", "CYC"));
        $ic251$ = makeString("Inference ~S in problem store ~S is no longer available.");
        $ic252$ = makeSymbol("CB-SAVE-AS-TEST");
        $ic253$ = makeString("Edit Test Specification");
        $ic254$ = makeString("Save Inference Settings and Results as Test Specification");
        $ic255$ = makeString("cb-handle-confirm-save-as-test");
        $ic256$ = makeString("An interface for creating and editing KBContentTest-FullySpecified instances.  Hover over the various headers for context-sensitive help.");
        $ic257$ = makeString("Save As Test");
        $ic258$ = makeString("Goto section :");
        $ic259$ = makeString("Shortcut links to sections that appear further down on this page.");
        $ic260$ = makeString("mt-section");
        $ic261$ = makeString("[Mt]");
        $ic262$ = makeString("Change the Microtheory settings to be used for the saved test's query.");
        $ic263$ = makeString("sentence-section");
        $ic264$ = makeString("[Sentence]");
        $ic265$ = makeString("Change the CycL sentence to be used for the saved test's query.");
        $ic266$ = makeString("parameters-section");
        $ic267$ = makeString("[Inference Parameters]");
        $ic268$ = makeString("Adjust the inference parameters and resource constraints that will be used when saving the query for this test.");
        $ic269$ = makeString("categories-section");
        $ic270$ = makeString("[Test Categories]");
        $ic271$ = makeString("Specify instances of KBContentTestSpecificationType that this test belongs to.");
        $ic272$ = makeString("metrics-section");
        $ic273$ = makeString("[Test Metrics]");
        $ic274$ = makeString("Specify metrics that should be collected for this test.");
        $ic275$ = makeString("cyclists-section");
        $ic276$ = makeString("[Responsible Cyclists]");
        $ic277$ = makeString("Specify cyclists that are responsible for this test.");
        $ic278$ = makeString("Notes:");
        $ic279$ = makeString("Test Name: ");
        $ic280$ = makeString("The constant name to save the test specification as.");
        $ic281$ = makeString("name");
        $ic282$ = makeString("Next (Specify Expected Results)");
        $ic283$ = makeString("Store the specified sentence, mt, inference settings and so on in a temporary area, and then take you to a page where you can specify the bindings the test query should return.");
        $ic284$ = makeString("new");
        $ic285$ = makeString("Reset Values");
        $ic286$ = makeString("cb-kct-save-mt");
        $ic287$ = makeString("Show");
        $ic288$ = makeString("Hide");
        $ic289$ = makeKeyword("INVISIBLE");
        $ic290$ = makeString("Save In Mt: ");
        $ic291$ = makeString("The microtheory in which to save the assertions about the test specification.  Should be a spec-mt of #$TestVocabularyMt.");
        $ic292$ = makeKeyword("PARAGRAPH");
        $ic293$ = ConsesLow.list((SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeString("defining-mt"));
        $ic294$ = makeString("test-categories");
        $ic295$ = makeString("Test Categories (optional)");
        $ic296$ = makeString("Instances of KBContentTestSpecificationType which the test should be an instance of.");
        $ic297$ = makeKeyword("VISIBLE");
        $ic298$ = constant_handles_oc.f8479((SubLObject)makeString("KBContentRegressionTest"));
        $ic299$ = makeString("category");
        $ic300$ = makeInteger(100);
        $ic301$ = makeString("category-name");
        $ic302$ = makeString("Add a Test Category: ");
        $ic303$ = makeString("category-id");
        $ic304$ = makeSymbol("STRING<");
        $ic305$ = makeSymbol("S#18405", "CYC");
        $ic306$ = makeString("test-metrics");
        $ic307$ = makeString("Test Metrics to Gather");
        $ic308$ = makeString("The metrics that should be gathered and reported when the test is run.");
        $ic309$ = makeString("None selected.");
        $ic310$ = makeString("metric");
        $ic311$ = makeString("cyclists");
        $ic312$ = makeString("Responsible Cyclists (required)");
        $ic313$ = makeString("The cyclists who are responsible for this test.");
        $ic314$ = makeKeyword("CENTER");
        $ic315$ = makeString("Selected?");
        $ic316$ = makeString("Cyclist");
        $ic317$ = makeString("cyclist");
        $ic318$ = makeString("cyclist-name");
        $ic319$ = constant_handles_oc.f8479((SubLObject)makeString("HumanCyclist"));
        $ic320$ = makeString("Add a Cyclist: ");
        $ic321$ = makeString("~A");
        $ic322$ = ConsesLow.list((SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeString("sentence"));
        $ic323$ = ConsesLow.list((SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeString("non_exp_sentence"), (SubLObject)makeKeyword("REQUIRED?"), (SubLObject)NIL);
        $ic324$ = ConsesLow.list((SubLObject)makeKeyword("LOCATION"), (SubLObject)makeString("Pragmatics"));
        $ic325$ = makeSymbol("CB-HANDLE-CONFIRM-SAVE-AS-TEST");
        $ic326$ = makeString("The ID, ~A, did not yield a KBContentTestSpecificationType.");
        $ic327$ = makeString("The name, ~S, did not denote a KBContentTestSpecificationType.");
        $ic328$ = makeString("The object, ~S, extracted from the test category selector, is not a KBContentTestSpecificationType.");
        $ic329$ = makeString("The ID, ~A, did not yield a Test Metric constant.");
        $ic330$ = makeString("The ID, ~A, did not yield a HumanCyclist.");
        $ic331$ = makeString("The name, ~A, did not denote a HumanCyclist.");
        $ic332$ = makeSymbol("S#46156", "CYC");
        $ic333$ = makeString("#ccccff");
        $ic334$ = makeString("Specify Test Expectations");
        $ic335$ = makeString("reloadCurrentFrame('reloadFrameButton');");
        $ic336$ = makeString("cb-handle-specify-test-results");
        $ic337$ = makeString("The interface for stating test expectations for a KB Content Test");
        $ic338$ = makeKeyword("RIGHT");
        $ic339$ = makeString("Exactly ");
        $ic340$ = makeString("cardinality");
        $ic341$ = makeString(" answers should be found.");
        $ic342$ = makeString("At least ");
        $ic343$ = makeString("min-cardinality");
        $ic344$ = makeString("At most ");
        $ic345$ = makeString("max-cardinality");
        $ic346$ = makeString("bindings");
        $ic347$ = makeString("unimportant");
        $ic348$ = makeString("The bindings obtained are unimportant.");
        $ic349$ = makeString("proven");
        $ic350$ = makeString("The query (with no free variables) should be proven.");
        $ic351$ = makeString("none");
        $ic352$ = makeString("No bindings should be found.");
        $ic353$ = makeString("The query (with no free variables) should not be proven.");
        $ic354$ = makeString("exact");
        $ic355$ = makeString("Require all and only the wanted bindings below (exact match).");
        $ic356$ = makeString("inexact");
        $ic357$ = makeString("Specify wanted and/or unwanted bindings below (inexact match).");
        $ic358$ = makeString("Check wanted and unwanted bindings:");
        $ic359$ = makeKeyword("LEFT");
        $ic360$ = makeString("Wanted");
        $ic361$ = makeString("Not Wanted");
        $ic362$ = makeString("Unspecified");
        $ic363$ = makeString("Save New Test");
        $ic364$ = makeString("Creates a new #$KBContentTest-FullySpecified instance and associated #$CycLQuerySpecification, having the specified sentence, mt, inference settings and expected results.");
        $ic365$ = makeString("save-new");
        $ic366$ = makeString("Overwrite Existing Test");
        $ic367$ = makeString("Overwrites the existing test specification with the sentence, mt, inference settings and expected results specified here.");
        $ic368$ = makeString("overwrite");
        $ic369$ = makeString("Test Definition So Far");
        $ic370$ = makeString("The currently specified properties of the test being saved.  These values will be stored in the KB when you finish specifying results and choose either \"Save New Test\" or \"Overwrite Existing Test\".");
        $ic371$ = makeString("Specify a binding set:");
        $ic372$ = makeString("Enter values for each free variable, choose Wanted or Unwanted, and click Add to add the binding set to the expected results.");
        $ic373$ = makeString("Wanted:");
        $ic374$ = makeString("wanted");
        $ic375$ = makeString("Unwanted:");
        $ic376$ = makeString("unwanted");
        $ic377$ = makeString("Add this binding set");
        $ic378$ = makeString("Updates the state of the test being defined or edited, and displays this page again so another binding set may be added to the expected results.");
        $ic379$ = makeString("add");
        $ic380$ = makeString("new-~A");
        $ic381$ = makeString("top");
        $ic382$ = makeKeyword("INPUT-NAME");
        $ic383$ = makeKeyword("COMPLETE-TYPE");
        $ic384$ = makeString("wanted-~A");
        $ic385$ = makeString("yes");
        $ic386$ = makeString("no");
        $ic387$ = makeString("unspecified");
        $ic388$ = makeKeyword("ADD");
        $ic389$ = makeKeyword("SAVE-NEW");
        $ic390$ = makeKeyword("OVERWRITE");
        $ic391$ = makeString("Unknown test save method ~A");
        $ic392$ = makeSymbol("CB-HANDLE-SPECIFY-TEST-RESULTS");
        $ic393$ = makeKeyword("UNKNOWN");
        $ic394$ = makeKeyword("EOF");
        $ic395$ = makeString(" is not an integer.");
        $ic396$ = makeKeyword("REQUIRED?");
        $ic397$ = ConsesLow.list((SubLObject)makeKeyword("AUTO-CYCLIFY"), (SubLObject)T);
        $ic398$ = makeString("The value, ~A, is not a known exactness.");
        $ic399$ = makeString("test-spec");
        $ic400$ = makeString("~A does not denote a test specification.");
        $ic401$ = makeString("You need to make a choice for Expected Test Results.");
        $ic402$ = makeString("Problem extracting exact answers.");
        $ic403$ = makeString("The ID ~A does not denote a kct answer.");
        $ic404$ = makeString("Save Test Specification");
        $ic405$ = makeString("~A is not a valid constant name.");
        $ic406$ = makeString("Already a constant named ~A");
        $ic407$ = makeString("Constant ~S already exists which differs from ~S only by case");
        $ic408$ = constant_handles_oc.f8479((SubLObject)makeString("TestQueryFn"));
        $ic409$ = makeString("Save New Test Specification finished with these problems: ~A");
        $ic410$ = makeString("Save New Test Specification finished successfully.");
        $ic411$ = makeString("Overwrite Test Specification");
        $ic412$ = makeString("~A is not the name of a KBContentTest-FullySpecified.");
        $ic413$ = makeString("Edit Test Specification finished with these problems: ~A");
        $ic414$ = makeString("Edit Test Specification finished successfully.");
        $ic415$ = makeSymbol("CONSTANT-P");
        $ic416$ = makeSymbol("LISTP");
        $ic417$ = makeSymbol("S#12264", "CYC");
        $ic418$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic419$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MultipleChoiceKBContentTest")));
        $ic420$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("KBContentTest-FullySpecified")));
        $ic421$ = constant_handles_oc.f8479((SubLObject)makeString("testQuerySpecification"));
        $ic422$ = makeString("Remember to state expected results using the Cyc Browser.");
        $ic423$ = ConsesLow.list((SubLObject)makeSymbol("S#32746", "CYC"), (SubLObject)makeSymbol("S#32747", "CYC"), (SubLObject)makeSymbol("S#32748", "CYC"), (SubLObject)makeSymbol("S#45958", "CYC"));
        $ic424$ = makeString("Some item in ~A was not a KB-BINDING-SET-P");
        $ic425$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswers-Cardinality-Exact"));
        $ic426$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswers-Cardinality-Min"));
        $ic427$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswers-Cardinality-Max"));
        $ic428$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswersCycL-Exact"));
        $ic429$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswersCycL-Wanted"));
        $ic430$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswersCycL-NotWanted"));
        $ic431$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswersCycLUnimportant"));
        $ic432$ = makeSymbol("FOURTH");
        $ic433$ = constant_handles_oc.f8479((SubLObject)makeString("MCQuestionNthOptionFn"));
        $ic434$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswer-MultipleChoice"));
        $ic435$ = constant_handles_oc.f8479((SubLObject)makeString("testMetricsToGather"));
        $ic436$ = constant_handles_oc.f8479((SubLObject)makeString("testResponsibleCyclist"));
        $ic437$ = makeSymbol("S#12274", "CYC");
        $ic438$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic439$ = makeKeyword("GAF");
        $ic440$ = makeKeyword("TRUE");
        $ic441$ = constant_handles_oc.f8479((SubLObject)makeString("StartFn"));
        $ic442$ = constant_handles_oc.f8479((SubLObject)makeString("TimeIntervalInclusiveFn"));
        $ic443$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("IndexicalReferentFn-EvaluateAtEL")), constant_handles_oc.f8479((SubLObject)makeString("Now")));
        $ic444$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalEndedByFn-Inclusive"));
        $ic445$ = makeKeyword("IGNORE");
        $ic446$ = constant_handles_oc.f8479((SubLObject)makeString("temporallyQualifiablePredicateInInterface"));
        $ic447$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CycTestAndQuerySavingAndEditingTool")));
        $ic448$ = constant_handles_oc.f8479((SubLObject)makeString("Null-TimeParameter"));
        $ic449$ = constant_handles_oc.f8479((SubLObject)makeString("TimePoint"));
        $ic450$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("IndexicalReferentFn-EvaluateAtEL")), constant_handles_oc.f8479((SubLObject)makeString("Now"))), constant_handles_oc.f8479((SubLObject)makeString("Now")));
        $ic451$ = makeKeyword("KCT-CONTROL-PANEL");
        $ic452$ = makeString("KB Content Test Control Panel");
        $ic453$ = makeString("KCT");
        $ic454$ = makeString("View and edit your KB Content Tests");
        $ic455$ = makeString("[KCT]");
        $ic456$ = makeString("cb-kct-control-panel");
        $ic457$ = makeSymbol("S#46144", "CYC");
        $ic458$ = makeString("cb-kct-control-panel-handler");
        $ic459$ = makeString("KB Content Tests owned by ");
        $ic460$ = makeString(":");
        $ic461$ = makeString("No tests.");
        $ic462$ = makeSymbol("CB-KCT-CONTROL-PANEL");
        $ic463$ = makeString("[Refresh]");
        $ic464$ = makeString("Submit");
        $ic465$ = makeString("save");
        $ic466$ = makeString("[Edit]");
        $ic467$ = makeString("[Run]");
        $ic468$ = makeString("Edit");
        $ic469$ = makeString("Run");
        $ic470$ = makeString("Name");
        $ic471$ = makeString("Regression Test?");
        $ic472$ = makeString("Save Interface");
        $ic473$ = makeString("Tests' Regression Status Modified");
        $ic474$ = makeSymbol("CB-KCT-CONTROL-PANEL-HANDLER");
        $ic475$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("KBContentRegressionTest")));
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
        public static final SubLStructDeclNative structDecl;
        
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
            structDecl = Structures.makeStructDeclNative((Class)$sX46003_native.class, $ic144$, $ic145$, $ic146$, $ic147$, new String[] { "$test_spec", "$name", "$comments", "$query_state", "$save_mt", "$answer_status", "$answer_options_index", "$answer_options_bindings_index", "$categories", "$metrics", "$cyclists", "$notes", "$answer_cardinality" }, $ic148$, $ic149$, $ic150$);
        }
    }
    
    public static final class $f42037$UnaryFunction extends UnaryFunction
    {
        public $f42037$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#45615"));
        }
        
        public SubLObject processItem(final SubLObject var52) {
            return f42037(var52);
        }
    }
    
    public static final class $sX46004_native extends SubLStructNative
    {
        public SubLObject $binding_set;
        public SubLObject $status;
        public SubLObject $id;
        public static final SubLStructDeclNative structDecl;
        
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
            structDecl = Structures.makeStructDeclNative((Class)$sX46004_native.class, $ic217$, $ic218$, $ic219$, $ic220$, new String[] { "$binding_set", "$status", "$id" }, $ic221$, $ic222$, $ic150$);
        }
    }
    
    public static final class $f42085$UnaryFunction extends UnaryFunction
    {
        public $f42085$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#46005"));
        }
        
        public SubLObject processItem(final SubLObject var52) {
            return f42085(var52);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 4026 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/