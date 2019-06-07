package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0674 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0674";
    public static final String myFingerPrint = "6390342d613985323b707d1b6b92f79e170dd6799197910cf9d8a3547c6adb5d";
    public static SubLSymbol $g5307$;
    private static SubLSymbol $g5308$;
    private static SubLSymbol $g5309$;
    private static SubLSymbol $g5310$;
    private static SubLSymbol $g5311$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
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
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLList $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLString $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLString $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLObject $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLList $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLList $ic130$;
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
    private static final SubLString $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLString $ic161$;
    private static final SubLList $ic162$;
    private static final SubLString $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLString $ic174$;
    private static final SubLString $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLString $ic180$;
    private static final SubLString $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLString $ic183$;
    private static final SubLString $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLString $ic186$;
    private static final SubLString $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLString $ic190$;
    private static final SubLString $ic191$;
    private static final SubLString $ic192$;
    private static final SubLString $ic193$;
    private static final SubLString $ic194$;
    private static final SubLString $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLString $ic198$;
    private static final SubLString $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLString $ic202$;
    private static final SubLString $ic203$;
    private static final SubLString $ic204$;
    private static final SubLString $ic205$;
    private static final SubLString $ic206$;
    private static final SubLString $ic207$;
    private static final SubLString $ic208$;
    private static final SubLString $ic209$;
    private static final SubLString $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLString $ic213$;
    private static final SubLString $ic214$;
    private static final SubLString $ic215$;
    private static final SubLString $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLString $ic218$;
    private static final SubLList $ic219$;
    private static final SubLString $ic220$;
    private static final SubLString $ic221$;
    private static final SubLString $ic222$;
    private static final SubLString $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLList $ic226$;
    private static final SubLList $ic227$;
    private static final SubLString $ic228$;
    private static final SubLString $ic229$;
    private static final SubLString $ic230$;
    private static final SubLString $ic231$;
    private static final SubLString $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLString $ic234$;
    private static final SubLString $ic235$;
    private static final SubLString $ic236$;
    private static final SubLString $ic237$;
    private static final SubLString $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLString $ic240$;
    private static final SubLString $ic241$;
    private static final SubLString $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLString $ic244$;
    private static final SubLString $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLString $ic247$;
    private static final SubLString $ic248$;
    private static final SubLString $ic249$;
    private static final SubLString $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLString $ic252$;
    private static final SubLString $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLString $ic256$;
    private static final SubLString $ic257$;
    private static final SubLString $ic258$;
    private static final SubLString $ic259$;
    private static final SubLObject $ic260$;
    private static final SubLList $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLString $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLString $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLString $ic268$;
    private static final SubLString $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLList $ic271$;
    private static final SubLString $ic272$;
    private static final SubLString $ic273$;
    private static final SubLString $ic274$;
    private static final SubLList $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLString $ic277$;
    private static final SubLString $ic278$;
    private static final SubLString $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLString $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLString $ic285$;
    private static final SubLString $ic286$;
    private static final SubLString $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLString $ic289$;
    private static final SubLString $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLString $ic292$;
    private static final SubLString $ic293$;
    private static final SubLString $ic294$;
    private static final SubLList $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLString $ic297$;
    private static final SubLString $ic298$;
    private static final SubLString $ic299$;
    private static final SubLString $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLString $ic302$;
    private static final SubLSymbol $ic303$;
    private static final SubLString $ic304$;
    private static final SubLString $ic305$;
    private static final SubLString $ic306$;
    private static final SubLString $ic307$;
    private static final SubLString $ic308$;
    private static final SubLString $ic309$;
    private static final SubLString $ic310$;
    private static final SubLSymbol $ic311$;
    private static final SubLSymbol $ic312$;
    private static final SubLSymbol $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLList $ic316$;
    private static final SubLSymbol $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLString $ic319$;
    private static final SubLSymbol $ic320$;
    private static final SubLString $ic321$;
    private static final SubLSymbol $ic322$;
    private static final SubLString $ic323$;
    private static final SubLSymbol $ic324$;
    private static final SubLString $ic325$;
    private static final SubLSymbol $ic326$;
    private static final SubLSymbol $ic327$;
    private static final SubLInteger $ic328$;
    private static final SubLSymbol $ic329$;
    private static final SubLSymbol $ic330$;
    private static final SubLList $ic331$;
    private static final SubLString $ic332$;
    private static final SubLString $ic333$;
    private static final SubLString $ic334$;
    private static final SubLString $ic335$;
    private static final SubLString $ic336$;
    private static final SubLObject $ic337$;
    private static final SubLSymbol $ic338$;
    private static final SubLString $ic339$;
    private static final SubLString $ic340$;
    private static final SubLObject $ic341$;
    private static final SubLString $ic342$;
    private static final SubLList $ic343$;
    private static final SubLObject $ic344$;
    private static final SubLSymbol $ic345$;
    private static final SubLObject $ic346$;
    private static final SubLString $ic347$;
    private static final SubLString $ic348$;
    private static final SubLSymbol $ic349$;
    private static final SubLSymbol $ic350$;
    private static final SubLSymbol $ic351$;
    private static final SubLString $ic352$;
    private static final SubLString $ic353$;
    private static final SubLSymbol $ic354$;
    private static final SubLSymbol $ic355$;
    private static final SubLString $ic356$;
    private static final SubLString $ic357$;
    private static final SubLString $ic358$;
    private static final SubLSymbol $ic359$;
    private static final SubLString $ic360$;
    private static final SubLString $ic361$;
    private static final SubLSymbol $ic362$;
    private static final SubLSymbol $ic363$;
    private static final SubLList $ic364$;
    private static final SubLSymbol $ic365$;
    private static final SubLString $ic366$;
    private static final SubLSymbol $ic367$;
    private static final SubLList $ic368$;
    private static final SubLString $ic369$;
    private static final SubLString $ic370$;
    private static final SubLSymbol $ic371$;
    private static final SubLSymbol $ic372$;
    private static final SubLString $ic373$;
    private static final SubLString $ic374$;
    private static final SubLString $ic375$;
    private static final SubLString $ic376$;
    private static final SubLSymbol $ic377$;
    private static final SubLString $ic378$;
    private static final SubLSymbol $ic379$;
    private static final SubLString $ic380$;
    private static final SubLString $ic381$;
    private static final SubLString $ic382$;
    private static final SubLString $ic383$;
    private static final SubLString $ic384$;
    private static final SubLList $ic385$;
    private static final SubLString $ic386$;
    private static final SubLString $ic387$;
    private static final SubLString $ic388$;
    private static final SubLSymbol $ic389$;
    private static final SubLString $ic390$;
    private static final SubLSymbol $ic391$;
    private static final SubLString $ic392$;
    private static final SubLString $ic393$;
    private static final SubLSymbol $ic394$;
    private static final SubLString $ic395$;
    private static final SubLSymbol $ic396$;
    private static final SubLString $ic397$;
    private static final SubLSymbol $ic398$;
    private static final SubLString $ic399$;
    private static final SubLString $ic400$;
    private static final SubLSymbol $ic401$;
    private static final SubLString $ic402$;
    private static final SubLSymbol $ic403$;
    private static final SubLString $ic404$;
    private static final SubLString $ic405$;
    private static final SubLSymbol $ic406$;
    private static final SubLString $ic407$;
    private static final SubLSymbol $ic408$;
    private static final SubLString $ic409$;
    private static final SubLString $ic410$;
    private static final SubLSymbol $ic411$;
    private static final SubLList $ic412$;
    private static final SubLString $ic413$;
    private static final SubLString $ic414$;
    private static final SubLSymbol $ic415$;
    private static final SubLString $ic416$;
    private static final SubLString $ic417$;
    private static final SubLSymbol $ic418$;
    private static final SubLSymbol $ic419$;
    private static final SubLString $ic420$;
    private static final SubLSymbol $ic421$;
    private static final SubLString $ic422$;
    private static final SubLString $ic423$;
    private static final SubLSymbol $ic424$;
    private static final SubLSymbol $ic425$;
    private static final SubLString $ic426$;
    private static final SubLString $ic427$;
    private static final SubLString $ic428$;
    private static final SubLString $ic429$;
    private static final SubLString $ic430$;
    private static final SubLSymbol $ic431$;
    private static final SubLString $ic432$;
    private static final SubLString $ic433$;
    private static final SubLSymbol $ic434$;
    private static final SubLSymbol $ic435$;
    private static final SubLSymbol $ic436$;
    private static final SubLSymbol $ic437$;
    private static final SubLString $ic438$;
    private static final SubLString $ic439$;
    private static final SubLSymbol $ic440$;
    private static final SubLSymbol $ic441$;
    private static final SubLString $ic442$;
    private static final SubLString $ic443$;
    private static final SubLSymbol $ic444$;
    private static final SubLString $ic445$;
    private static final SubLSymbol $ic446$;
    private static final SubLString $ic447$;
    private static final SubLString $ic448$;
    private static final SubLSymbol $ic449$;
    private static final SubLInteger $ic450$;
    private static final SubLSymbol $ic451$;
    private static final SubLSymbol $ic452$;
    private static final SubLString $ic453$;
    private static final SubLSymbol $ic454$;
    private static final SubLString $ic455$;
    private static final SubLString $ic456$;
    private static final SubLString $ic457$;
    
    public static SubLObject f41126(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        module0677.f41335(var1);
        return module0543.f33691(var1, var2, var3);
    }
    
    public static SubLObject f41127(final SubLObject var1, final SubLObject var4) {
        return module0543.f33690(var1, var4);
    }
    
    public static SubLObject f41128(final SubLObject var1, final SubLObject var5) {
        return module0543.f33689(var1, var5);
    }
    
    public static SubLObject f41129(final SubLObject var1) {
        return module0543.f33647(var1);
    }
    
    public static SubLObject f41130(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        module0677.f41335(var1);
        module0677.f41366(module0538.f33480(var1, (SubLObject)UNPROVIDED), (SubLObject)NIL);
        return module0543.f33674(var1, var3);
    }
    
    public static SubLObject f41131(final SubLObject var1, final SubLObject var6) {
        return module0543.f33680(module0289.f19396(var1), var6, module0178.f11287(var1));
    }
    
    public static SubLObject f41132(final SubLObject var1, final SubLObject var7, final SubLObject var8, final SubLObject var4, final SubLObject var5, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        module0677.f41335(var1);
        module0677.f41366(var7, var8);
        if (NIL != var3) {
            return module0543.f33662(var1, var3, var7, var8, var4, var5);
        }
        return module0543.f33661(var1, var7, var8, var4, var5);
    }
    
    public static SubLObject f41133(final SubLObject var1) {
        if (NIL != module0178.f11375(var1)) {
            return f41130(var1, module0211.f13702(var1));
        }
        return module0543.f33644(var1, module0178.f11293(var1), module0178.f11291(var1));
    }
    
    public static SubLObject f41134(final SubLObject var1, final SubLObject var7, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        module0677.f41335(var1);
        return module0543.f33670(var1, var7, var3);
    }
    
    public static SubLObject f41135(final SubLObject var9, final SubLObject var10) {
        compatibility.default_struct_print_function(var9, var10, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41136(final SubLObject var9) {
        return (SubLObject)((var9.getClass() == $sX45181_native.class) ? T : NIL);
    }
    
    public static SubLObject f41137(final SubLObject var9) {
        assert NIL != f41136(var9) : var9;
        return var9.getField2();
    }
    
    public static SubLObject f41138(final SubLObject var9) {
        assert NIL != f41136(var9) : var9;
        return var9.getField3();
    }
    
    public static SubLObject f41139(final SubLObject var9) {
        assert NIL != f41136(var9) : var9;
        return var9.getField4();
    }
    
    public static SubLObject f41140(final SubLObject var9) {
        assert NIL != f41136(var9) : var9;
        return var9.getField5();
    }
    
    public static SubLObject f41141(final SubLObject var9) {
        assert NIL != f41136(var9) : var9;
        return var9.getField6();
    }
    
    public static SubLObject f41142(final SubLObject var9) {
        assert NIL != f41136(var9) : var9;
        return var9.getField7();
    }
    
    public static SubLObject f41143(final SubLObject var9, final SubLObject var12) {
        assert NIL != f41136(var9) : var9;
        return var9.setField2(var12);
    }
    
    public static SubLObject f41144(final SubLObject var9, final SubLObject var12) {
        assert NIL != f41136(var9) : var9;
        return var9.setField3(var12);
    }
    
    public static SubLObject f41145(final SubLObject var9, final SubLObject var12) {
        assert NIL != f41136(var9) : var9;
        return var9.setField4(var12);
    }
    
    public static SubLObject f41146(final SubLObject var9, final SubLObject var12) {
        assert NIL != f41136(var9) : var9;
        return var9.setField5(var12);
    }
    
    public static SubLObject f41147(final SubLObject var9, final SubLObject var12) {
        assert NIL != f41136(var9) : var9;
        return var9.setField6(var12);
    }
    
    public static SubLObject f41148(final SubLObject var9, final SubLObject var12) {
        assert NIL != f41136(var9) : var9;
        return var9.setField7(var12);
    }
    
    public static SubLObject f41149(SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = (SubLObject)new $sX45181_native();
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        for (var15 = (SubLObject)NIL, var15 = var13; NIL != var15; var15 = conses_high.cddr(var15)) {
            var16 = var15.first();
            var17 = conses_high.cadr(var15);
            var18 = var16;
            if (var18.eql((SubLObject)$ic21$)) {
                f41143(var14, var17);
            }
            else if (var18.eql((SubLObject)$ic22$)) {
                f41144(var14, var17);
            }
            else if (var18.eql((SubLObject)$ic23$)) {
                f41145(var14, var17);
            }
            else if (var18.eql((SubLObject)$ic24$)) {
                f41146(var14, var17);
            }
            else if (var18.eql((SubLObject)$ic25$)) {
                f41147(var14, var17);
            }
            else if (var18.eql((SubLObject)$ic26$)) {
                f41148(var14, var17);
            }
            else {
                Errors.error((SubLObject)$ic27$, var16);
            }
        }
        return var14;
    }
    
    public static SubLObject f41150(final SubLObject var19, final SubLObject var20) {
        Functions.funcall(var20, var19, (SubLObject)$ic28$, (SubLObject)$ic29$, (SubLObject)SIX_INTEGER);
        Functions.funcall(var20, var19, (SubLObject)$ic30$, (SubLObject)$ic21$, f41137(var19));
        Functions.funcall(var20, var19, (SubLObject)$ic30$, (SubLObject)$ic22$, f41138(var19));
        Functions.funcall(var20, var19, (SubLObject)$ic30$, (SubLObject)$ic23$, f41139(var19));
        Functions.funcall(var20, var19, (SubLObject)$ic30$, (SubLObject)$ic24$, f41140(var19));
        Functions.funcall(var20, var19, (SubLObject)$ic30$, (SubLObject)$ic25$, f41141(var19));
        Functions.funcall(var20, var19, (SubLObject)$ic30$, (SubLObject)$ic26$, f41142(var19));
        Functions.funcall(var20, var19, (SubLObject)$ic31$, (SubLObject)$ic29$, (SubLObject)SIX_INTEGER);
        return var19;
    }
    
    public static SubLObject f41151(final SubLObject var19, final SubLObject var20) {
        return f41150(var19, var20);
    }
    
    public static SubLObject f41152(final SubLObject var7, final SubLObject var8, SubLObject var4, SubLObject var5, SubLObject var21, SubLObject var22) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)NIL;
        }
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        return f41149((SubLObject)ConsesLow.list(new SubLObject[] { $ic21$, var7, $ic22$, var8, $ic23$, var4, $ic24$, var5, $ic25$, var21, $ic26$, var22 }));
    }
    
    public static SubLObject f41153(final SubLObject var23) {
        assert NIL != f41136(var23) : var23;
        final SubLObject var24 = f41137(var23);
        final SubLObject var25 = f41138(var23);
        final SubLObject var26 = f41139(var23);
        final SubLObject var27 = f41140(var23);
        return module0543.f33628(var24, var25, var26, var27);
    }
    
    public static SubLObject f41154(final SubLObject var24, final SubLObject var25, SubLObject var26, SubLObject var27) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)TWO_INTEGER;
        }
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)$ic33$;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)NIL;
        if (NIL != var25 && NIL != module0111.$g1406$.getDynamicValue(var28)) {
            var29 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic34$, var24);
        }
        else {
            var29 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic35$, var24);
        }
        if (var26.eql((SubLObject)ONE_INTEGER)) {
            return module0656.f39792(var29, var26, var27);
        }
        return module0656.f39793(var29, (SubLObject)T);
    }
    
    public static SubLObject f41155(final SubLObject var7, final SubLObject var8, final SubLObject var4, final SubLObject var5, final SubLObject var30, final SubLObject var31) {
        final SubLObject var32 = (SubLObject)NIL;
        return f41156(var7, var8, var31, var4, var5, (SubLObject)T, (SubLObject)NIL, (SubLObject)NIL, var32);
    }
    
    public static SubLObject f41156(final SubLObject var7, final SubLObject var8, SubLObject var31, SubLObject var4, SubLObject var5, SubLObject var32, SubLObject var33, SubLObject var21, SubLObject var22) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)NIL;
        }
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        if (NIL != var33) {
            assert NIL != module0054.f3959(var33) : var33;
        }
        else {
            var33 = module0054.f3968();
        }
        final SubLObject var35 = module0274.f18195(var7, var8, (SubLObject)ConsesLow.list((SubLObject)$ic39$, (SubLObject)$ic40$, (SubLObject)$ic41$, var31));
        final SubLObject var36 = module0275.f18234(var7, var8);
        final SubLObject var37 = module0054.f3972(var33);
        final SubLObject var38 = (SubLObject)$ic42$;
        final SubLObject var39 = module0015.$g538$.currentBinding(var34);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var34))) ? module0015.$g538$.getDynamicValue(var34) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var34);
            module0642.f39020((SubLObject)$ic43$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var34), module0655.$g5142$.getDynamicValue(var34));
            final SubLObject var40 = module0014.f672((SubLObject)$ic44$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic45$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var40) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var40);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic46$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var38) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var38);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var38_40 = module0015.$g535$.currentBinding(var34);
            try {
                module0015.$g535$.bind((SubLObject)T, var34);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var34)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var34)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic49$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var38_41 = module0015.$g533$.currentBinding(var34);
                try {
                    module0015.$g533$.bind((SubLObject)T, var34);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic50$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var38_42 = module0015.$g533$.currentBinding(var34);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var34);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic51$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic52$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic53$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var38_42, var34);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var38) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var38);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var34));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var38_43 = module0015.$g533$.currentBinding(var34);
                    final SubLObject var41 = module0015.$g541$.currentBinding(var34);
                    final SubLObject var42 = module0015.$g539$.currentBinding(var34);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var34);
                        module0015.$g541$.bind((SubLObject)T, var34);
                        module0015.$g539$.bind(module0015.f797(), var34);
                        module0656.f39870((SubLObject)$ic36$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic54$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0656.f39804(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic55$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0656.f39804(var7, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic56$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        if (NIL != module0035.f2013(var36)) {
                            module0054.f3973(f41152(var7, var8, var4, var5, var21, var22), var33);
                            SubLObject var43 = var36;
                            SubLObject var44 = (SubLObject)NIL;
                            var44 = var43.first();
                            while (NIL != var43) {
                                f41157(var44, var8, var4, var5, var32, var33);
                                var43 = var43.rest();
                                var44 = var43.first();
                            }
                        }
                        else {
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g240$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic57$);
                            module0642.f39020(module0015.$g241$.getGlobalValue());
                        }
                        module0015.f741();
                        module0642.f39020(module0015.$g203$.getGlobalValue());
                        final SubLObject var38_44 = module0015.$g537$.currentBinding(var34);
                        try {
                            module0015.$g537$.bind((SubLObject)T, var34);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic58$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g158$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic59$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var38_45 = module0015.$g533$.currentBinding(var34);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var34);
                                module0642.f39034(var35, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var38_45, var34);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                        }
                        finally {
                            module0015.$g537$.rebind(var38_44, var34);
                        }
                        module0642.f39020(module0015.$g204$.getGlobalValue());
                        if (NIL != module0035.f2013(var37)) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic60$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                            SubLObject var43 = Sequences.reverse(var37);
                            SubLObject var45 = (SubLObject)NIL;
                            var45 = var43.first();
                            while (NIL != var43) {
                                final SubLObject var46 = f41137(var45);
                                final SubLObject var47 = f41138(var45);
                                module0656.f39804(var46, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                                module0642.f39019((SubLObject)$ic61$);
                                module0656.f39804(var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                var43 = var43.rest();
                                var45 = var43.first();
                            }
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var34));
                    }
                    finally {
                        module0015.$g539$.rebind(var42, var34);
                        module0015.$g541$.rebind(var41, var34);
                        module0015.$g533$.rebind(var38_43, var34);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var38_41, var34);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var38_40, var34);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var39, var34);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41157(final SubLObject var53, final SubLObject var8, final SubLObject var4, final SubLObject var5, final SubLObject var32, final SubLObject var33) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g240$.getGlobalValue());
        SubLObject var55 = (SubLObject)NIL;
        final SubLObject var56 = module0147.$g2094$.currentBinding(var54);
        final SubLObject var57 = module0147.$g2095$.currentBinding(var54);
        try {
            module0147.$g2094$.bind((SubLObject)$ic62$, var54);
            module0147.$g2095$.bind($ic63$, var54);
            var55 = module0288.f19342(var53, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var57, var54);
            module0147.$g2094$.rebind(var56, var54);
        }
        var55 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic64$), var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f2012(var55)) {
            f41158(var53, var8, var4, var5, var32, var33);
        }
        else {
            f41159(var53, var8, var4, var5, var55, var32, var33);
        }
        module0642.f39020(module0015.$g241$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41158(final SubLObject var53, final SubLObject var8, final SubLObject var4, final SubLObject var5, final SubLObject var32, final SubLObject var33) {
        module0642.f39019((SubLObject)$ic65$);
        module0656.f39804(var53, (SubLObject)ZERO_INTEGER, (SubLObject)T);
        module0642.f39019((SubLObject)$ic66$);
        module0656.f39804(var8, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
        module0642.f39019((SubLObject)$ic67$);
        if (NIL != var32) {
            final SubLObject var54 = f41152(var53, var8, var4, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0656.f39837((SubLObject)$ic68$, var54, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41159(final SubLObject var53, final SubLObject var8, final SubLObject var4, final SubLObject var5, final SubLObject var54, final SubLObject var32, final SubLObject var33) {
        final SubLObject var55 = f41160(var8, var54);
        if (NIL != module0035.f2012(var55)) {
            f41161(var53, var8, var4, var5, var54, var32, var33);
        }
        else {
            f41162(var53, var8, var4, var5, var55, var32, var33);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41160(final SubLObject var8, final SubLObject var57) {
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var59 = var57;
        SubLObject var60 = (SubLObject)NIL;
        var60 = var59.first();
        while (NIL != var59) {
            final SubLObject var61 = module0178.f11287(var60);
            if (NIL != module0262.f17336(var61, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var58 = (SubLObject)ConsesLow.cons(var60, var58);
            }
            var59 = var59.rest();
            var60 = var59.first();
        }
        return var58;
    }
    
    public static SubLObject f41161(final SubLObject var53, final SubLObject var8, final SubLObject var4, final SubLObject var5, final SubLObject var54, final SubLObject var32, final SubLObject var33) {
        final SubLObject var55 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic69$), var54);
        final SubLObject var56 = module0262.f17369((SubLObject)ConsesLow.cons(var8, var55), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var57 = (SubLObject)((NIL != var56) ? module0048.f3382(var56, Symbols.symbol_function((SubLObject)$ic70$)) : NIL);
        module0642.f39019((SubLObject)$ic65$);
        module0656.f39804(var53, (SubLObject)ZERO_INTEGER, (SubLObject)T);
        module0642.f39019((SubLObject)$ic66$);
        module0656.f39804(var8, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
        module0642.f39019((SubLObject)$ic67$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic71$);
        module0656.f39909(var55);
        module0642.f39019((SubLObject)$ic72$);
        module0642.f39026((SubLObject)UNPROVIDED);
        if (NIL != var57) {
            module0642.f39019((SubLObject)$ic73$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic74$);
            module0656.f39804(var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var32) {
                final SubLObject var58 = f41152(var53, var57, var4, var5, var54, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)TWO_INTEGER);
                module0656.f39837((SubLObject)$ic68$, var58, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic75$);
            module0656.f39804(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic76$);
            if (NIL != var32) {
                final SubLObject var58 = f41152(var53, var8, var4, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)TWO_INTEGER);
                module0656.f39837((SubLObject)$ic68$, var58, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            module0642.f39019((SubLObject)$ic77$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic78$);
            module0656.f39804(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var32) {
                final SubLObject var58 = f41152(var53, var8, var4, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)TWO_INTEGER);
                module0656.f39837((SubLObject)$ic68$, var58, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41162(final SubLObject var53, final SubLObject var8, final SubLObject var4, final SubLObject var5, final SubLObject var56, final SubLObject var32, final SubLObject var33) {
        module0642.f39019((SubLObject)$ic65$);
        module0656.f39804(var53, (SubLObject)ZERO_INTEGER, (SubLObject)T);
        module0642.f39019((SubLObject)$ic79$);
        module0656.f39804(var8, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
        module0642.f39019((SubLObject)$ic67$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic80$);
        SubLObject var57 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic69$), var56);
        SubLObject var58 = (SubLObject)NIL;
        var58 = var57.first();
        while (NIL != var57) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0656.f39804(var58, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var57 = var57.rest();
            var58 = var57.first();
        }
        if (NIL != var32) {
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var59 = f41152(var53, var8, var4, var5, var56, (SubLObject)UNPROVIDED);
            module0656.f39837((SubLObject)$ic68$, var59, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41163(final SubLObject var55, final SubLObject var64, SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic81$;
        }
        final SubLObject var67 = module0655.f39759(var55);
        final SubLObject var68 = module0655.f39759(var64);
        final SubLObject var69 = module0656.f39832((SubLObject)$ic82$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var66), (SubLObject)$ic83$, var67, var68);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var69) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var69);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var70 = module0015.$g533$.currentBinding(var66);
        try {
            module0015.$g533$.bind((SubLObject)T, var66);
            module0642.f39019(var65);
        }
        finally {
            module0015.$g533$.rebind(var70, var66);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var64;
    }
    
    public static SubLObject f41164(final SubLObject var30) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic85$);
            return (SubLObject)NIL;
        }
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var30, var30, (SubLObject)$ic86$);
        var31 = var30.first();
        SubLObject var33 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var30, (SubLObject)$ic86$);
        var32 = var33.first();
        var33 = var33.rest();
        if (NIL == var33) {
            final SubLObject var34 = module0655.f39758(var31);
            final SubLObject var35 = module0655.f39758(var32);
            SubLObject var36 = (SubLObject)NIL;
            module0054.f3973(var34, var35);
            while (NIL == module0054.f3970(var35) && NIL == var36) {
                final SubLObject var37 = module0054.f3974(var35);
                final SubLObject var38 = f41137(var37);
                final SubLObject var39 = f41138(var37);
                final SubLObject var40 = f41139(var37);
                final SubLObject var41 = f41140(var37);
                final SubLObject var42 = f41141(var37);
                final SubLObject var43 = f41142(var37);
                final SubLObject var44 = module0274.f18192(var38, var39, (SubLObject)UNPROVIDED);
                if (NIL != var44) {
                    f41156(var38, var39, var44, var40, var41, (SubLObject)T, var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var36 = (SubLObject)T;
                }
                else {
                    module0543.f33631(var38, var39, var40, var41);
                    module0677.f41366(var38, var39);
                    SubLObject var45 = var42;
                    SubLObject var46 = (SubLObject)NIL;
                    var46 = var45.first();
                    while (NIL != var45) {
                        module0543.f33639(var46);
                        var45 = var45.rest();
                        var46 = var45.first();
                    }
                    var45 = var43;
                    SubLObject var47 = (SubLObject)NIL;
                    var47 = var45.first();
                    while (NIL != var45) {
                        f41153(var47);
                        var45 = var45.rest();
                        var47 = var45.first();
                    }
                }
            }
            if (NIL == var36) {
                module0656.f39793((SubLObject)$ic87$, (SubLObject)T);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic86$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41165(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles_oc.f11035(var1)) {
            final SubLObject var3 = f41166(var1);
            final SubLObject var4 = module0178.f11314(var1);
            final SubLObject var5 = module0178.f11290(var1);
            final SubLObject var6 = module0178.f11375(var1);
            final SubLObject var7 = module0178.f11376(var1);
            final SubLObject var8 = (SubLObject)makeBoolean(NIL == var3);
            final SubLObject var9 = module0211.f13700(var1);
            module0656.f39870((SubLObject)$ic89$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == module0655.$g5096$.getDynamicValue(var2)) {
                module0656.f39837((SubLObject)$ic91$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
            }
            module0656.f39837((SubLObject)$ic92$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)UNPROVIDED);
            module0656.f39837((SubLObject)$ic93$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)UNPROVIDED);
            if (NIL != module0655.$g5115$.getDynamicValue(var2) && NIL != var6) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0656.f39837((SubLObject)$ic94$, var1, (SubLObject)NIL, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
                module0656.f39837((SubLObject)$ic95$, var1, (SubLObject)NIL, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
                module0656.f39837((SubLObject)$ic96$, var1, (SubLObject)NIL, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
                if (NIL != var9) {
                    module0656.f39837((SubLObject)$ic97$, var1, (SubLObject)NIL, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
                if (NIL != module0178.f11348(var1)) {
                    if (NIL != module0211.f13732(var1)) {
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0656.f39837((SubLObject)$ic98$, var1, (SubLObject)NIL, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    else {
                        module0656.f39837((SubLObject)$ic98$, var1, (SubLObject)NIL, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
            }
            if (NIL != module0655.$g5115$.getDynamicValue(var2)) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0656.f39837((SubLObject)$ic99$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
                module0656.f39837((SubLObject)$ic100$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
                if (NIL != var6 && NIL != f41167(var1)) {
                    module0656.f39837((SubLObject)$ic101$, var1, (SubLObject)NIL, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
                if (NIL != var6) {
                    module0656.f39837((SubLObject)$ic102$, var1, (SubLObject)NIL, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
                module0656.f39837((SubLObject)$ic103$, var1, (SubLObject)NIL, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
                if (NIL != var6) {
                    module0656.f39837((SubLObject)$ic104$, var1, (SubLObject)NIL, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
                if (NIL != module0178.f11299(var1)) {
                    module0656.f39837((SubLObject)$ic105$, var1, (SubLObject)NIL, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
            }
            if (NIL != module0178.f11290(var1)) {
                final SubLObject var10 = module0178.f11282(var1);
                module0642.f39026((SubLObject)UNPROVIDED);
                if (NIL != module0232.f15306(var10)) {
                    module0656.f39837((SubLObject)$ic106$, var1, (SubLObject)$ic107$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
                if (NIL != module0232.f15308(var10)) {
                    module0656.f39837((SubLObject)$ic108$, var1, (SubLObject)$ic109$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
                if (NIL != module0232.f15308(var10)) {
                    module0656.f39837((SubLObject)$ic110$, var1, (SubLObject)$ic111$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
                module0656.f39837((SubLObject)$ic112$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
            }
            module0642.f39026((SubLObject)UNPROVIDED);
            if (NIL != var7) {
                module0656.f39837((SubLObject)$ic113$, var1, (SubLObject)NIL, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
            }
            if (NIL != var7) {
                module0656.f39837((SubLObject)$ic114$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
            }
            if (NIL != module0655.$g5115$.getDynamicValue(var2) && NIL != var6) {
                module0656.f39837((SubLObject)$ic115$, var1, (SubLObject)NIL, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
            }
            if (NIL != module0655.$g5115$.getDynamicValue(var2) && NIL != var4) {
                module0656.f39837((SubLObject)$ic116$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
            }
            if (NIL == module0178.f11290(var1)) {
                module0656.f39837((SubLObject)$ic112$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
            }
            if (NIL != var5) {
                module0656.f39837((SubLObject)$ic117$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
            }
            if (NIL != module0178.f11290(var1)) {
                module0656.f39837((SubLObject)$ic118$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41166(final SubLObject var1) {
        if (NIL != module0178.f11341(var1)) {
            return (SubLObject)NIL;
        }
        if (NIL == module0178.f11284(var1)) {
            return (SubLObject)T;
        }
        return (SubLObject)makeBoolean(NIL == module0259.f16854(module0178.f11332(var1), $ic119$, module0132.$g1554$.getGlobalValue(), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f41168(final SubLObject var65) {
        module0642.f39019(var65);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41169(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic122$);
        }
        else {
            SubLObject var32 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var30, (SubLObject)$ic123$);
            var32 = var30.first();
            final SubLObject var33 = var30.rest();
            if (NIL == var33) {
                final SubLObject var34 = module0656.f39970(var32);
                final SubLObject var35 = module0178.f11287(var34);
                final SubLObject var36 = (SubLObject)$ic124$;
                final SubLObject var37 = module0015.$g538$.currentBinding(var31);
                try {
                    module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var31))) ? module0015.$g538$.getDynamicValue(var31) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var31);
                    module0642.f39020((SubLObject)$ic43$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g155$.getGlobalValue());
                    module0642.f39020(module0015.$g153$.getGlobalValue());
                    module0015.f718();
                    module0655.f39766();
                    module0642.f39064(module0655.$g5143$.getDynamicValue(var31), module0655.$g5142$.getDynamicValue(var31));
                    final SubLObject var38 = module0014.f672((SubLObject)$ic44$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g175$.getGlobalValue());
                    module0642.f39020(module0015.$g176$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic45$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var38) {
                        module0642.f39020(module0015.$g178$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var38);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g177$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic46$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0016.f941();
                    if (NIL != var36) {
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g173$.getGlobalValue());
                        module0642.f39019(var36);
                        module0642.f39020(module0015.$g174$.getGlobalValue());
                    }
                    module0666.f40471();
                    module0666.f40487();
                    module0666.f40535();
                    module0642.f39020(module0015.$g154$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    final SubLObject var38_86 = module0015.$g535$.currentBinding(var31);
                    try {
                        module0015.$g535$.bind((SubLObject)T, var31);
                        module0642.f39020(module0015.$g133$.getGlobalValue());
                        if (NIL != module0015.$g132$.getDynamicValue(var31)) {
                            module0642.f39020(module0015.$g135$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var31)));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g137$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic49$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_87 = module0015.$g533$.currentBinding(var31);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var31);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic50$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var38_88 = module0015.$g533$.currentBinding(var31);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var31);
                                module0642.f39020(module0015.$g295$.getGlobalValue());
                                module0642.f39020(module0015.$g305$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic51$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g302$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic52$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g307$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic53$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var38_88, var31);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            if (NIL != var36) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                module0642.f39019(var36);
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            final SubLObject var39 = module0656.f39832((SubLObject)NIL);
                            module0642.f39020(module0015.$g282$.getGlobalValue());
                            module0642.f39020(module0015.$g284$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0110.$g570$.getDynamicValue(var31));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g285$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic125$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != var39) {
                                module0642.f39020(module0015.$g286$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var39);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var38_89 = module0015.$g533$.currentBinding(var31);
                            final SubLObject var40 = module0015.$g541$.currentBinding(var31);
                            final SubLObject var41 = module0015.$g539$.currentBinding(var31);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var31);
                                module0015.$g541$.bind((SubLObject)T, var31);
                                module0015.$g539$.bind(module0015.f797(), var31);
                                module0642.f39069((SubLObject)$ic126$, (SubLObject)T, (SubLObject)UNPROVIDED);
                                module0642.f39069((SubLObject)$ic127$, var32, (SubLObject)UNPROVIDED);
                                module0656.f39870((SubLObject)$ic120$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                if (NIL != module0211.f13700(var34)) {
                                    final SubLObject var42 = (SubLObject)$ic128$;
                                    module0642.f39020(module0015.$g219$.getGlobalValue());
                                    if (NIL != var42) {
                                        module0642.f39020(module0015.$g222$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39042(var42));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    }
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var38_90 = module0015.$g533$.currentBinding(var31);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var31);
                                        module0642.f39021((SubLObject)$ic129$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var38_90, var31);
                                    }
                                    module0642.f39020(module0015.$g220$.getGlobalValue());
                                    module0642.f39026((SubLObject)TWO_INTEGER);
                                }
                                module0657.f39992(var35, (SubLObject)$ic130$);
                                module0656.f39790((SubLObject)$ic82$, (SubLObject)$ic131$);
                                module0642.f39032((SubLObject)UNPROVIDED);
                                module0642.f39073((SubLObject)$ic132$);
                                module0642.f39032((SubLObject)UNPROVIDED);
                                module0642.f39074((SubLObject)$ic133$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                f41170(var34);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic55$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0656.f39878(var34, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                                f41171(var34, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0015.f799(module0015.$g539$.getDynamicValue(var31));
                            }
                            finally {
                                module0015.$g539$.rebind(var41, var31);
                                module0015.$g541$.rebind(var40, var31);
                                module0015.$g533$.rebind(var38_89, var31);
                            }
                            module0642.f39020(module0015.$g283$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39050();
                        }
                        finally {
                            module0015.$g533$.rebind(var38_87, var31);
                        }
                        module0642.f39020(module0015.$g134$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g535$.rebind(var38_86, var31);
                    }
                    module0642.f39020(module0015.$g156$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g538$.rebind(var37, var31);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic123$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41170(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0211.f13700(var1)) {
            final SubLObject var3 = module0211.f13701(var1);
            SubLObject var4 = (SubLObject)NIL;
            SubLObject var5 = (SubLObject)NIL;
            var4 = module0178.f11287(var1);
            SubLObject var6 = var3;
            SubLObject var7 = (SubLObject)NIL;
            var7 = var6.first();
            while (NIL != var6) {
                var5 = module0178.f11287(var7);
                if (!var4.eql(var5)) {
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39021((SubLObject)$ic135$);
                    module0656.f39837((SubLObject)$ic97$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    return (SubLObject)NIL;
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39068((SubLObject)$ic136$, (SubLObject)$ic137$, module0655.$g5099$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)UNPROVIDED);
            module0642.f39021((SubLObject)$ic138$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41172(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic139$);
            return (SubLObject)NIL;
        }
        final SubLObject var32 = module0642.f39104((SubLObject)$ic127$, var30);
        final SubLObject var33 = module0656.f39970(var32);
        var31.resetMultipleValues();
        final SubLObject var34 = module0657.f40003(var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var35 = var31.secondMultipleValue();
        final SubLObject var36 = var31.thirdMultipleValue();
        var31.resetMultipleValues();
        if (NIL != var35) {
            return module0657.f40013(var35, var36);
        }
        if (NIL != module0161.f10514(var34, module0178.f11287(var33))) {
            return module0656.f39789((SubLObject)$ic140$, var34, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var37 = module0642.f39104((SubLObject)$ic136$, var30);
        final SubLObject var38 = f41173(var33, var30, (SubLObject)$ic141$, (SubLObject)((NIL != var37) ? var34 : NIL));
        f41126(var33, var34, var38);
        f41154((SubLObject)$ic124$, (SubLObject)T, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41174(final SubLObject var1, SubLObject var65, SubLObject var99) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic143$;
        }
        if (NIL != var99) {
            f41168(var65);
        }
        else {
            final SubLObject var101 = module0656.f39832((SubLObject)$ic82$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var100), (SubLObject)$ic144$, assertion_handles_oc.f11025(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var101) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var101);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var102 = module0015.$g533$.currentBinding(var100);
            try {
                module0015.$g533$.bind((SubLObject)T, var100);
                module0642.f39019(var65);
            }
            finally {
                module0015.$g533$.rebind(var102, var100);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var1;
    }
    
    public static SubLObject f41175(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic148$);
        }
        else {
            SubLObject var32 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var30, (SubLObject)$ic123$);
            var32 = var30.first();
            final SubLObject var33 = var30.rest();
            if (NIL == var33) {
                final SubLObject var34 = module0656.f39970(var32);
                final SubLObject var35 = module0178.f11293(var34);
                final SubLObject var36 = (SubLObject)$ic149$;
                final SubLObject var37 = module0015.$g538$.currentBinding(var31);
                try {
                    module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var31))) ? module0015.$g538$.getDynamicValue(var31) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var31);
                    module0642.f39020((SubLObject)$ic43$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g155$.getGlobalValue());
                    module0642.f39020(module0015.$g153$.getGlobalValue());
                    module0015.f718();
                    module0655.f39766();
                    module0642.f39064(module0655.$g5143$.getDynamicValue(var31), module0655.$g5142$.getDynamicValue(var31));
                    final SubLObject var38 = module0014.f672((SubLObject)$ic44$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g175$.getGlobalValue());
                    module0642.f39020(module0015.$g176$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic45$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var38) {
                        module0642.f39020(module0015.$g178$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var38);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g177$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic46$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0016.f941();
                    if (NIL != var36) {
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g173$.getGlobalValue());
                        module0642.f39019(var36);
                        module0642.f39020(module0015.$g174$.getGlobalValue());
                    }
                    module0642.f39020(module0015.$g154$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    final SubLObject var38_102 = module0015.$g535$.currentBinding(var31);
                    try {
                        module0015.$g535$.bind((SubLObject)T, var31);
                        module0642.f39020(module0015.$g133$.getGlobalValue());
                        if (NIL != module0015.$g132$.getDynamicValue(var31)) {
                            module0642.f39020(module0015.$g135$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var31)));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g137$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic49$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_103 = module0015.$g533$.currentBinding(var31);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var31);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic50$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var38_104 = module0015.$g533$.currentBinding(var31);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var31);
                                module0642.f39020(module0015.$g295$.getGlobalValue());
                                module0642.f39020(module0015.$g305$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic51$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g302$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic52$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g307$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic53$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var38_104, var31);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            if (NIL != var36) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                module0642.f39019(var36);
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            final SubLObject var39 = module0656.f39832((SubLObject)NIL);
                            module0642.f39020(module0015.$g282$.getGlobalValue());
                            module0642.f39020(module0015.$g284$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0110.$g570$.getDynamicValue(var31));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g285$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic125$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != var39) {
                                module0642.f39020(module0015.$g286$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var39);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var38_105 = module0015.$g533$.currentBinding(var31);
                            final SubLObject var40 = module0015.$g541$.currentBinding(var31);
                            final SubLObject var41 = module0015.$g539$.currentBinding(var31);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var31);
                                module0015.$g541$.bind((SubLObject)T, var31);
                                module0015.$g539$.bind(module0015.f797(), var31);
                                module0642.f39069((SubLObject)$ic150$, (SubLObject)T, (SubLObject)UNPROVIDED);
                                module0642.f39069((SubLObject)$ic127$, var32, (SubLObject)UNPROVIDED);
                                module0656.f39870((SubLObject)$ic146$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic151$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0642.f39026((SubLObject)TWO_INTEGER);
                                module0642.f39072((SubLObject)$ic152$, (SubLObject)$ic153$, Equality.eq(var35, (SubLObject)$ic154$), (SubLObject)UNPROVIDED);
                                module0642.f39032((SubLObject)TWO_INTEGER);
                                module0642.f39019((SubLObject)$ic155$);
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39072((SubLObject)$ic152$, (SubLObject)$ic156$, Equality.eq(var35, (SubLObject)$ic157$), (SubLObject)UNPROVIDED);
                                module0642.f39032((SubLObject)TWO_INTEGER);
                                module0642.f39019((SubLObject)$ic158$);
                                module0642.f39026((SubLObject)TWO_INTEGER);
                                module0656.f39790((SubLObject)$ic82$, (SubLObject)$ic131$);
                                module0642.f39032((SubLObject)ONE_INTEGER);
                                module0642.f39073((SubLObject)$ic132$);
                                module0642.f39032((SubLObject)ONE_INTEGER);
                                module0642.f39074((SubLObject)$ic159$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic54$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0656.f39804(module0178.f11287(var34), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic55$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0656.f39878(var34, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                                module0015.f799(module0015.$g539$.getDynamicValue(var31));
                            }
                            finally {
                                module0015.$g539$.rebind(var41, var31);
                                module0015.$g541$.rebind(var40, var31);
                                module0015.$g533$.rebind(var38_105, var31);
                            }
                            module0642.f39020(module0015.$g283$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39050();
                        }
                        finally {
                            module0015.$g533$.rebind(var38_103, var31);
                        }
                        module0642.f39020(module0015.$g134$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g535$.rebind(var38_102, var31);
                    }
                    module0642.f39020(module0015.$g156$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g538$.rebind(var37, var31);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic123$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41176(final SubLObject var30) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic161$);
            return (SubLObject)NIL;
        }
        final SubLObject var31 = module0642.f39104((SubLObject)$ic127$, var30);
        final SubLObject var32 = module0656.f39970(var31);
        final SubLObject var33 = reader.read_from_string_ignoring_errors(module0642.f39104((SubLObject)$ic152$, var30), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0004.f104(var33, (SubLObject)$ic162$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            if (!var33.equal(module0178.f11293(var32))) {
                f41127(var32, var33);
            }
            f41154((SubLObject)$ic149$, (SubLObject)T, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        }
        else {
            module0656.f39789((SubLObject)$ic163$, conses_high.second(var30), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41177(final SubLObject var1, SubLObject var65, SubLObject var99) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic165$;
        }
        if (NIL != var99) {
            f41168(var65);
        }
        else {
            final SubLObject var101 = module0656.f39832((SubLObject)$ic82$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var100), (SubLObject)$ic166$, assertion_handles_oc.f11025(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var101) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var101);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var102 = module0015.$g533$.currentBinding(var100);
            try {
                module0015.$g533$.bind((SubLObject)T, var100);
                module0642.f39019(var65);
            }
            finally {
                module0015.$g533$.rebind(var102, var100);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var1;
    }
    
    public static SubLObject f41178(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic170$);
        }
        else {
            SubLObject var32 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var30, (SubLObject)$ic123$);
            var32 = var30.first();
            final SubLObject var33 = var30.rest();
            if (NIL == var33) {
                final SubLObject var34 = module0656.f39970(var32);
                final SubLObject var35 = module0178.f11291(var34);
                final SubLObject var36 = (SubLObject)$ic171$;
                final SubLObject var37 = module0015.$g538$.currentBinding(var31);
                try {
                    module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var31))) ? module0015.$g538$.getDynamicValue(var31) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var31);
                    module0642.f39020((SubLObject)$ic43$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g155$.getGlobalValue());
                    module0642.f39020(module0015.$g153$.getGlobalValue());
                    module0015.f718();
                    module0655.f39766();
                    module0642.f39064(module0655.$g5143$.getDynamicValue(var31), module0655.$g5142$.getDynamicValue(var31));
                    final SubLObject var38 = module0014.f672((SubLObject)$ic44$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g175$.getGlobalValue());
                    module0642.f39020(module0015.$g176$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic45$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var38) {
                        module0642.f39020(module0015.$g178$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var38);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g177$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic46$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0016.f941();
                    if (NIL != var36) {
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g173$.getGlobalValue());
                        module0642.f39019(var36);
                        module0642.f39020(module0015.$g174$.getGlobalValue());
                    }
                    module0642.f39020(module0015.$g154$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    final SubLObject var38_109 = module0015.$g535$.currentBinding(var31);
                    try {
                        module0015.$g535$.bind((SubLObject)T, var31);
                        module0642.f39020(module0015.$g133$.getGlobalValue());
                        if (NIL != module0015.$g132$.getDynamicValue(var31)) {
                            module0642.f39020(module0015.$g135$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var31)));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g137$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic49$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_110 = module0015.$g533$.currentBinding(var31);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var31);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic50$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var38_111 = module0015.$g533$.currentBinding(var31);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var31);
                                module0642.f39020(module0015.$g295$.getGlobalValue());
                                module0642.f39020(module0015.$g305$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic51$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g302$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic52$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g307$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic53$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var38_111, var31);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            if (NIL != var36) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                module0642.f39019(var36);
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            final SubLObject var39 = module0656.f39832((SubLObject)NIL);
                            module0642.f39020(module0015.$g282$.getGlobalValue());
                            module0642.f39020(module0015.$g284$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0110.$g570$.getDynamicValue(var31));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g285$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic125$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != var39) {
                                module0642.f39020(module0015.$g286$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var39);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var38_112 = module0015.$g533$.currentBinding(var31);
                            final SubLObject var40 = module0015.$g541$.currentBinding(var31);
                            final SubLObject var41 = module0015.$g539$.currentBinding(var31);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var31);
                                module0015.$g541$.bind((SubLObject)T, var31);
                                module0015.$g539$.bind(module0015.f797(), var31);
                                module0642.f39069((SubLObject)$ic172$, (SubLObject)T, (SubLObject)UNPROVIDED);
                                module0642.f39069((SubLObject)$ic127$, var32, (SubLObject)UNPROVIDED);
                                module0656.f39870((SubLObject)$ic168$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic173$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39072((SubLObject)$ic174$, (SubLObject)$ic175$, Equality.eq(var35, (SubLObject)$ic176$), (SubLObject)UNPROVIDED);
                                module0642.f39032((SubLObject)TWO_INTEGER);
                                module0642.f39019((SubLObject)$ic177$);
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39072((SubLObject)$ic174$, (SubLObject)$ic178$, Equality.eq(var35, (SubLObject)$ic179$), (SubLObject)UNPROVIDED);
                                module0642.f39032((SubLObject)TWO_INTEGER);
                                module0642.f39019((SubLObject)$ic180$);
                                if (NIL != module0178.f11290(var34)) {
                                    final SubLObject var42 = module0178.f11282(var34);
                                    if (NIL != module0232.f15306(var42)) {
                                        module0642.f39032((SubLObject)TWO_INTEGER);
                                        module0656.f39837((SubLObject)$ic106$, var34, (SubLObject)$ic107$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                }
                                module0642.f39026((SubLObject)TWO_INTEGER);
                                module0656.f39790((SubLObject)$ic82$, (SubLObject)$ic131$);
                                module0642.f39032((SubLObject)ONE_INTEGER);
                                module0642.f39073((SubLObject)$ic132$);
                                module0642.f39032((SubLObject)ONE_INTEGER);
                                module0642.f39074((SubLObject)$ic181$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic54$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0656.f39804(module0178.f11287(var34), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic55$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0656.f39878(var34, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                                module0015.f799(module0015.$g539$.getDynamicValue(var31));
                            }
                            finally {
                                module0015.$g539$.rebind(var41, var31);
                                module0015.$g541$.rebind(var40, var31);
                                module0015.$g533$.rebind(var38_112, var31);
                            }
                            module0642.f39020(module0015.$g283$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39050();
                        }
                        finally {
                            module0015.$g533$.rebind(var38_110, var31);
                        }
                        module0642.f39020(module0015.$g134$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g535$.rebind(var38_109, var31);
                    }
                    module0642.f39020(module0015.$g156$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g538$.rebind(var37, var31);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic123$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41179(final SubLObject var30) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic183$);
            return (SubLObject)NIL;
        }
        final SubLObject var31 = module0642.f39104((SubLObject)$ic127$, var30);
        final SubLObject var32 = module0656.f39970(var31);
        final SubLObject var33 = reader.read_from_string_ignoring_errors(module0642.f39104((SubLObject)$ic174$, var30), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var34 = module0178.f11291(var32);
        if (NIL != module0130.f8503(var33)) {
            if (!var33.eql(var34)) {
                f41128(var32, var33);
            }
            f41154((SubLObject)$ic171$, (SubLObject)T, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        }
        else {
            module0656.f39789((SubLObject)$ic184$, conses_high.second(var30), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41180(final SubLObject var1, SubLObject var65, SubLObject var99) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic186$;
        }
        if (NIL != var99) {
            f41168(var65);
        }
        else {
            final SubLObject var101 = module0656.f39832((SubLObject)$ic82$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var100), (SubLObject)$ic187$, assertion_handles_oc.f11025(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var101) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var101);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var102 = module0015.$g533$.currentBinding(var100);
            try {
                module0015.$g533$.bind((SubLObject)T, var100);
                module0642.f39019(var65);
            }
            finally {
                module0015.$g533$.rebind(var102, var100);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var1;
    }
    
    public static SubLObject f41181(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic122$);
        }
        else {
            SubLObject var32 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var30, (SubLObject)$ic123$);
            var32 = var30.first();
            final SubLObject var33 = var30.rest();
            if (NIL == var33) {
                final SubLObject var34 = module0656.f39970(var32);
                final SubLObject var35 = module0178.f11287(var34);
                final SubLObject var36 = (SubLObject)$ic191$;
                final SubLObject var37 = module0015.$g538$.currentBinding(var31);
                try {
                    module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var31))) ? module0015.$g538$.getDynamicValue(var31) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var31);
                    module0642.f39020((SubLObject)$ic43$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g155$.getGlobalValue());
                    module0642.f39020(module0015.$g153$.getGlobalValue());
                    module0015.f718();
                    module0655.f39766();
                    module0642.f39064(module0655.$g5143$.getDynamicValue(var31), module0655.$g5142$.getDynamicValue(var31));
                    final SubLObject var38 = module0014.f672((SubLObject)$ic44$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g175$.getGlobalValue());
                    module0642.f39020(module0015.$g176$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic45$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var38) {
                        module0642.f39020(module0015.$g178$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var38);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g177$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic46$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0016.f941();
                    if (NIL != var36) {
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g173$.getGlobalValue());
                        module0642.f39019(var36);
                        module0642.f39020(module0015.$g174$.getGlobalValue());
                    }
                    module0666.f40471();
                    module0666.f40487();
                    module0666.f40535();
                    module0642.f39020(module0015.$g154$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    final SubLObject var38_116 = module0015.$g535$.currentBinding(var31);
                    try {
                        module0015.$g535$.bind((SubLObject)T, var31);
                        module0642.f39020(module0015.$g133$.getGlobalValue());
                        if (NIL != module0015.$g132$.getDynamicValue(var31)) {
                            module0642.f39020(module0015.$g135$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var31)));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g137$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic49$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_117 = module0015.$g533$.currentBinding(var31);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var31);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic50$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var38_118 = module0015.$g533$.currentBinding(var31);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var31);
                                module0642.f39020(module0015.$g295$.getGlobalValue());
                                module0642.f39020(module0015.$g305$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic51$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g302$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic52$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g307$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic53$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var38_118, var31);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            if (NIL != var36) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                module0642.f39019(var36);
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            final SubLObject var39 = module0656.f39832((SubLObject)NIL);
                            module0642.f39020(module0015.$g282$.getGlobalValue());
                            module0642.f39020(module0015.$g284$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0110.$g570$.getDynamicValue(var31));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g285$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic125$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != var39) {
                                module0642.f39020(module0015.$g286$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var39);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var38_119 = module0015.$g533$.currentBinding(var31);
                            final SubLObject var40 = module0015.$g541$.currentBinding(var31);
                            final SubLObject var41 = module0015.$g539$.currentBinding(var31);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var31);
                                module0015.$g541$.bind((SubLObject)T, var31);
                                module0015.$g539$.bind(module0015.f797(), var31);
                                module0642.f39069((SubLObject)$ic192$, (SubLObject)T, (SubLObject)UNPROVIDED);
                                module0642.f39069((SubLObject)$ic127$, var32, (SubLObject)UNPROVIDED);
                                module0656.f39870((SubLObject)$ic189$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic193$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0642.f39026((SubLObject)TWO_INTEGER);
                                module0656.f39916(var34, (SubLObject)T, (SubLObject)T);
                                module0642.f39026((SubLObject)TWO_INTEGER);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0657.f39992(var35, (SubLObject)$ic130$);
                                module0656.f39790((SubLObject)$ic82$, (SubLObject)$ic131$);
                                module0642.f39032((SubLObject)UNPROVIDED);
                                module0642.f39073((SubLObject)$ic132$);
                                module0642.f39032((SubLObject)UNPROVIDED);
                                module0642.f39074((SubLObject)$ic133$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                f41171(var34, (SubLObject)TWO_INTEGER, (SubLObject)$ic194$, (SubLObject)$ic195$, (SubLObject)T);
                                module0015.f799(module0015.$g539$.getDynamicValue(var31));
                            }
                            finally {
                                module0015.$g539$.rebind(var41, var31);
                                module0015.$g541$.rebind(var40, var31);
                                module0015.$g533$.rebind(var38_119, var31);
                            }
                            module0642.f39020(module0015.$g283$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39050();
                        }
                        finally {
                            module0015.$g533$.rebind(var38_117, var31);
                        }
                        module0642.f39020(module0015.$g134$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g535$.rebind(var38_116, var31);
                    }
                    module0642.f39020(module0015.$g156$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g538$.rebind(var37, var31);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic123$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41182(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic139$);
            return (SubLObject)NIL;
        }
        final SubLObject var32 = module0642.f39104((SubLObject)$ic127$, var30);
        final SubLObject var33 = module0656.f39970(var32);
        var31.resetMultipleValues();
        final SubLObject var34 = module0657.f40003(var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var35 = var31.secondMultipleValue();
        final SubLObject var36 = var31.thirdMultipleValue();
        var31.resetMultipleValues();
        if (NIL != var35) {
            return module0657.f40013(var35, var36);
        }
        final SubLObject var37 = f41173(var33, var30, (SubLObject)$ic194$, (SubLObject)UNPROVIDED);
        SubLObject var38 = (SubLObject)ZERO_INTEGER;
        SubLObject var39 = var37;
        SubLObject var40 = (SubLObject)NIL;
        var40 = var39.first();
        while (NIL != var39) {
            final SubLObject var41 = var40.first();
            if (NIL == module0161.f10514(var34, module0178.f11287(var41))) {
                f41126(var41, var34, (SubLObject)NIL);
                var38 = Numbers.add(var38, (SubLObject)ONE_INTEGER);
            }
            var39 = var39.rest();
            var40 = var39.first();
        }
        f41154((SubLObject)$ic191$, (SubLObject)T, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41183(final SubLObject var1, SubLObject var65, SubLObject var99) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic198$;
        }
        if (NIL != var99) {
            f41168(var65);
        }
        else {
            final SubLObject var101 = module0656.f39832((SubLObject)$ic82$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var100), (SubLObject)$ic199$, assertion_handles_oc.f11025(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var101) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var101);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var102 = module0015.$g533$.currentBinding(var100);
            try {
                module0015.$g533$.bind((SubLObject)T, var100);
                module0642.f39019(var65);
            }
            finally {
                module0015.$g533$.rebind(var102, var100);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var1;
    }
    
    public static SubLObject f41184(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            return module0667.f40583((SubLObject)$ic203$);
        }
        SubLObject var32 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var30, var30, (SubLObject)$ic123$);
        var32 = var30.first();
        final SubLObject var33 = var30.rest();
        if (NIL == var33) {
            final SubLObject var34 = module0656.f39970(var32);
            final SubLObject var35 = module0178.f11348(var34);
            final SubLObject var36 = module0271.f17880(var35);
            final SubLObject var37 = module0202.f12700(var36);
            SubLObject var38 = (SubLObject)NIL;
            final SubLObject var39 = (SubLObject)$ic204$;
            final SubLObject var40 = module0015.$g538$.currentBinding(var31);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var31))) ? module0015.$g538$.getDynamicValue(var31) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var31);
                module0642.f39020((SubLObject)$ic43$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var31), module0655.$g5142$.getDynamicValue(var31));
                final SubLObject var41 = module0014.f672((SubLObject)$ic44$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic45$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var41) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var41);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic46$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var39) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var39);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0666.f40471();
                module0666.f40487();
                module0666.f40535();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var38_128 = module0015.$g535$.currentBinding(var31);
                try {
                    module0015.$g535$.bind((SubLObject)T, var31);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var31)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var31)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic49$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var38_129 = module0015.$g533$.currentBinding(var31);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var31);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic50$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_130 = module0015.$g533$.currentBinding(var31);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var31);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic51$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic52$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic53$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var38_130, var31);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var39) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var39);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        final SubLObject var42 = module0656.f39832((SubLObject)NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var31));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic125$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != var42) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var42);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_131 = module0015.$g533$.currentBinding(var31);
                        final SubLObject var43 = module0015.$g541$.currentBinding(var31);
                        final SubLObject var44 = module0015.$g539$.currentBinding(var31);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var31);
                            module0015.$g541$.bind((SubLObject)T, var31);
                            module0015.$g539$.bind(module0015.f797(), var31);
                            module0642.f39069((SubLObject)$ic205$, (SubLObject)T, (SubLObject)UNPROVIDED);
                            module0642.f39069((SubLObject)$ic127$, var32, (SubLObject)UNPROVIDED);
                            module0656.f39870((SubLObject)$ic201$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic206$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0656.f39916(var34, (SubLObject)T, (SubLObject)T);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            if (NIL != var36) {
                                module0642.f39021((SubLObject)$ic207$);
                                module0642.f39019((SubLObject)$ic208$);
                                final SubLObject var45 = (SubLObject)$ic128$;
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != var45) {
                                    module0642.f39020(module0015.$g222$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39042(var45));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var38_132 = module0015.$g533$.currentBinding(var31);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var31);
                                    module0642.f39021((SubLObject)$ic209$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var38_132, var31);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic210$);
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g240$.getGlobalValue());
                                module0642.f39019(module0201.$g2291$.getGlobalValue());
                                module0642.f39020(module0015.$g241$.getGlobalValue());
                                module0642.f39026((SubLObject)UNPROVIDED);
                            }
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g346$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var38_133 = module0015.$g533$.currentBinding(var31);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var31);
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var38_134 = module0015.$g533$.currentBinding(var31);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var31);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic211$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic212$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var38_135 = module0015.$g533$.currentBinding(var31);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var31);
                                        module0642.f39032((SubLObject)TWO_INTEGER);
                                        module0642.f39021((SubLObject)$ic213$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var38_135, var31);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic211$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic212$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var38_136 = module0015.$g533$.currentBinding(var31);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var31);
                                        module0642.f39032((SubLObject)TWO_INTEGER);
                                        module0642.f39021((SubLObject)$ic214$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var38_136, var31);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var38_134, var31);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)UNPROVIDED);
                                SubLObject var46 = var35;
                                SubLObject var47 = (SubLObject)NIL;
                                var47 = var46.first();
                                while (NIL != var46) {
                                    var38 = module0035.f2293(var37, var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var38_137 = module0015.$g533$.currentBinding(var31);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var31);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic211$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic212$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var38_138 = module0015.$g533$.currentBinding(var31);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var31);
                                            module0642.f39032((SubLObject)TWO_INTEGER);
                                            if (NIL != module0004.f104(var47, var36, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                                final SubLObject var48 = (SubLObject)$ic128$;
                                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                                if (NIL != var48) {
                                                    module0642.f39020(module0015.$g222$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                    module0642.f39020(module0642.f39042(var48));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                }
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                final SubLObject var38_139 = module0015.$g533$.currentBinding(var31);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)T, var31);
                                                    module0642.f39021(var47);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var38_139, var31);
                                                }
                                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                            }
                                            else {
                                                module0642.f39019(var47);
                                            }
                                            module0642.f39020(module0015.$g360$.getGlobalValue());
                                            module0642.f39020(module0015.$g370$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0642.f39049((SubLObject)$ic211$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g373$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0642.f39049((SubLObject)$ic212$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var38_140 = module0015.$g533$.currentBinding(var31);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var31);
                                                module0642.f39032((SubLObject)TWO_INTEGER);
                                                module0642.f39075(var47, (NIL != var38) ? var38 : var47, module0655.$g5135$.getDynamicValue(var31));
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var38_140, var31);
                                            }
                                            module0642.f39020(module0015.$g361$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var38_138, var31);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var38_137, var31);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                    var46 = var46.rest();
                                    var47 = var46.first();
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var38_133, var31);
                            }
                            module0642.f39020(module0015.$g347$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0642.f39074((SubLObject)$ic215$, (SubLObject)$ic216$, (SubLObject)UNPROVIDED);
                            module0015.f799(module0015.$g539$.getDynamicValue(var31));
                        }
                        finally {
                            module0015.$g539$.rebind(var44, var31);
                            module0015.$g541$.rebind(var43, var31);
                            module0015.$g533$.rebind(var38_131, var31);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var38_129, var31);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var38_128, var31);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var40, var31);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic123$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41185(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = module0642.f39104((SubLObject)$ic127$, var30);
        final SubLObject var33 = module0656.f39970(var32);
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        var31.resetMultipleValues();
        final SubLObject var144_145 = f41186(var30);
        final SubLObject var146_147 = var31.secondMultipleValue();
        var31.resetMultipleValues();
        var34 = var144_145;
        var35 = var146_147;
        if (NIL != var35) {
            return f41187(var35);
        }
        if (NIL == var34) {
            return module0656.f39792((SubLObject)$ic218$, (SubLObject)TWO_INTEGER, (SubLObject)$ic33$);
        }
        if (NIL != module0642.f39104((SubLObject)$ic216$, var30)) {
            if (NIL != module0202.f12704(var33, var34)) {
                final SubLObject var36 = (SubLObject)$ic204$;
                final SubLObject var37 = module0015.$g538$.currentBinding(var31);
                try {
                    module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var31))) ? module0015.$g538$.getDynamicValue(var31) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var31);
                    module0642.f39020((SubLObject)$ic43$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g155$.getGlobalValue());
                    module0642.f39020(module0015.$g153$.getGlobalValue());
                    module0015.f718();
                    module0655.f39766();
                    module0642.f39064(module0655.$g5143$.getDynamicValue(var31), module0655.$g5142$.getDynamicValue(var31));
                    final SubLObject var38 = module0014.f672((SubLObject)$ic44$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g175$.getGlobalValue());
                    module0642.f39020(module0015.$g176$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic45$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var38) {
                        module0642.f39020(module0015.$g178$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var38);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g177$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic46$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0016.f941();
                    if (NIL != var36) {
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g173$.getGlobalValue());
                        module0642.f39019(var36);
                        module0642.f39020(module0015.$g174$.getGlobalValue());
                    }
                    module0642.f39020(module0015.$g154$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    final SubLObject var38_148 = module0015.$g535$.currentBinding(var31);
                    try {
                        module0015.$g535$.bind((SubLObject)T, var31);
                        module0642.f39020(module0015.$g133$.getGlobalValue());
                        if (NIL != module0015.$g132$.getDynamicValue(var31)) {
                            module0642.f39020(module0015.$g135$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var31)));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g137$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic49$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_149 = module0015.$g533$.currentBinding(var31);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var31);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic50$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var38_150 = module0015.$g533$.currentBinding(var31);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var31);
                                module0642.f39020(module0015.$g295$.getGlobalValue());
                                module0642.f39020(module0015.$g305$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic51$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g302$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic52$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g307$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic53$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var38_150, var31);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            if (NIL != var36) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                module0642.f39019(var36);
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            final SubLObject var39 = module0656.f39832((SubLObject)NIL);
                            module0642.f39020(module0015.$g282$.getGlobalValue());
                            module0642.f39020(module0015.$g284$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0110.$g570$.getDynamicValue(var31));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g285$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic125$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != var39) {
                                module0642.f39020(module0015.$g286$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var39);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var38_151 = module0015.$g533$.currentBinding(var31);
                            final SubLObject var40 = module0015.$g541$.currentBinding(var31);
                            final SubLObject var41 = module0015.$g539$.currentBinding(var31);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var31);
                                module0015.$g541$.bind((SubLObject)T, var31);
                                module0015.$g539$.bind(module0015.f797(), var31);
                                module0642.f39069((SubLObject)$ic205$, (SubLObject)T, (SubLObject)UNPROVIDED);
                                module0642.f39069((SubLObject)$ic127$, var32, (SubLObject)UNPROVIDED);
                                SubLObject var42 = var34;
                                SubLObject var43 = (SubLObject)NIL;
                                var43 = var42.first();
                                while (NIL != var42) {
                                    SubLObject var45;
                                    final SubLObject var44 = var45 = var43;
                                    SubLObject var46 = (SubLObject)NIL;
                                    SubLObject var47 = (SubLObject)NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var45, var44, (SubLObject)$ic219$);
                                    var46 = var45.first();
                                    var45 = (var47 = var45.rest());
                                    module0642.f39069(var46, var47, (SubLObject)UNPROVIDED);
                                    var42 = var42.rest();
                                    var43 = var42.first();
                                }
                                module0642.f39021((SubLObject)$ic220$);
                                module0642.f39026((SubLObject)TWO_INTEGER);
                                module0642.f39074((SubLObject)$ic221$, (SubLObject)$ic222$, (SubLObject)UNPROVIDED);
                                module0642.f39032((SubLObject)TWO_INTEGER);
                                module0656.f39790((SubLObject)$ic82$, (SubLObject)$ic223$);
                                module0015.f799(module0015.$g539$.getDynamicValue(var31));
                            }
                            finally {
                                module0015.$g539$.rebind(var41, var31);
                                module0015.$g541$.rebind(var40, var31);
                                module0015.$g533$.rebind(var38_151, var31);
                            }
                            module0642.f39020(module0015.$g283$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39050();
                        }
                        finally {
                            module0015.$g533$.rebind(var38_149, var31);
                        }
                        module0642.f39020(module0015.$g134$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g535$.rebind(var38_148, var31);
                    }
                    module0642.f39020(module0015.$g156$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g538$.rebind(var37, var31);
                }
            }
            else {
                f41131(var33, var34);
                f41154((SubLObject)$ic215$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else if (NIL != module0642.f39104((SubLObject)$ic222$, var30)) {
            SubLObject var48 = conses_high.copy_tree(module0289.f19396(var33));
            var48 = conses_high.sublis(var34, var48, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f41188((SubLObject)$ic224$, var33, var48, (SubLObject)T);
            f41154((SubLObject)$ic215$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41186(final SubLObject var30) {
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        SubLObject var33 = var30;
        SubLObject var34 = (SubLObject)NIL;
        var34 = var33.first();
        while (NIL != var33) {
            if (var34.isCons()) {
                SubLObject var36;
                final SubLObject var35 = var36 = var34;
                SubLObject var37 = (SubLObject)NIL;
                SubLObject var38 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic226$);
                var37 = var36.first();
                var36 = var36.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic226$);
                var38 = var36.first();
                var36 = var36.rest();
                if (NIL == var36) {
                    var38 = Strings.string_trim((SubLObject)$ic227$, var38);
                    if (NIL != module0038.f2684(var37, (SubLObject)$ic228$) && NIL == Strings.string_equal(var38, (SubLObject)$ic229$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != Strings.string_not_equal(var37, var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        if (NIL != module0201.f12554(var38)) {
                            var31 = module0035.f2063(var31, module0201.f12550(var37), module0201.f12550(var38), (SubLObject)UNPROVIDED);
                        }
                        else {
                            var32 = (SubLObject)ConsesLow.cons(var38, var32);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)$ic226$);
                }
            }
            var33 = var33.rest();
            var34 = var33.first();
        }
        return Values.values(var31, var32);
    }
    
    public static SubLObject f41187(final SubLObject var163) {
        final SubLThread var164 = SubLProcess.currentSubLThread();
        final SubLObject var165 = (SubLObject)$ic230$;
        final SubLObject var166 = module0015.$g538$.currentBinding(var164);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var164))) ? module0015.$g538$.getDynamicValue(var164) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var164);
            module0642.f39020((SubLObject)$ic43$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var164), module0655.$g5142$.getDynamicValue(var164));
            final SubLObject var167 = module0014.f672((SubLObject)$ic44$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic45$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var167) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var167);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic46$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var165) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var165);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var38_164 = module0015.$g535$.currentBinding(var164);
            try {
                module0015.$g535$.bind((SubLObject)T, var164);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var164)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var164)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic49$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var38_165 = module0015.$g533$.currentBinding(var164);
                try {
                    module0015.$g533$.bind((SubLObject)T, var164);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic50$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var38_166 = module0015.$g533$.currentBinding(var164);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var164);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic51$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic52$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic53$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var38_166, var164);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var165) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var165);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var164));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var38_167 = module0015.$g533$.currentBinding(var164);
                    final SubLObject var168 = module0015.$g541$.currentBinding(var164);
                    final SubLObject var169 = module0015.$g539$.currentBinding(var164);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var164);
                        module0015.$g541$.bind((SubLObject)T, var164);
                        module0015.$g539$.bind(module0015.f797(), var164);
                        module0656.f39790((SubLObject)$ic82$, (SubLObject)$ic231$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39021((SubLObject)$ic232$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39019(module0038.f2888(var163, Symbols.symbol_function((SubLObject)$ic233$), (SubLObject)$ic234$, (SubLObject)$ic235$));
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39021((SubLObject)$ic236$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g240$.getGlobalValue());
                        module0642.f39019(module0201.$g2291$.getGlobalValue());
                        module0642.f39020(module0015.$g241$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var164));
                    }
                    finally {
                        module0015.$g539$.rebind(var169, var164);
                        module0015.$g541$.rebind(var168, var164);
                        module0015.$g533$.rebind(var38_167, var164);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var38_165, var164);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var38_164, var164);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var166, var164);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41189(final SubLObject var1, SubLObject var65, SubLObject var99) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic237$;
        }
        if (NIL != var99) {
            f41168(var65);
        }
        else {
            final SubLObject var101 = module0656.f39832((SubLObject)$ic82$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var100), (SubLObject)$ic238$, assertion_handles_oc.f11025(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var101) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var101);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var102 = module0015.$g533$.currentBinding(var100);
            try {
                module0015.$g533$.bind((SubLObject)T, var100);
                module0642.f39019(var65);
            }
            finally {
                module0015.$g533$.rebind(var102, var100);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var1;
    }
    
    public static SubLObject f41190(final SubLObject var30) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic240$);
        }
        else {
            SubLObject var31 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var30, (SubLObject)$ic123$);
            var31 = var30.first();
            final SubLObject var32 = var30.rest();
            if (NIL == var32) {
                final SubLObject var33 = module0656.f39970(var31);
                final SubLObject var34 = module0178.f11291(var33);
                if (var34 == $ic179$) {
                    f41129(var33);
                    f41154((SubLObject)$ic241$, (SubLObject)T, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                }
                else {
                    module0656.f39789((SubLObject)$ic242$, var30.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic123$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41191(final SubLObject var1, SubLObject var65, SubLObject var99) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic244$;
        }
        if (NIL != var99) {
            f41168(var65);
        }
        else {
            final SubLObject var101 = module0656.f39832((SubLObject)$ic82$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var100), (SubLObject)$ic245$, assertion_handles_oc.f11025(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var101) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var101);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var102 = module0015.$g533$.currentBinding(var100);
            try {
                module0015.$g533$.bind((SubLObject)T, var100);
                module0642.f39019(var65);
            }
            finally {
                module0015.$g533$.rebind(var102, var100);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var1;
    }
    
    public static SubLObject f41192(final SubLObject var30) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic247$);
        }
        else {
            SubLObject var31 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var30, (SubLObject)$ic123$);
            var31 = var30.first();
            final SubLObject var32 = var30.rest();
            if (NIL == var32) {
                final SubLObject var33 = module0656.f39970(var31);
                if (NIL == assertion_handles_oc.f11035(var33)) {
                    return module0656.f39789((SubLObject)$ic248$, var30.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL == module0285.f19085(var33)) {
                    return module0656.f39792((SubLObject)$ic249$, (SubLObject)TWO_INTEGER, (SubLObject)$ic33$);
                }
                f41130(var33, module0211.f13702(var33));
                f41154((SubLObject)$ic250$, (SubLObject)T, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic123$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41193(final SubLObject var1, SubLObject var65, SubLObject var99) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic252$;
        }
        if (NIL != var99) {
            f41168(var65);
        }
        else {
            final SubLObject var101 = module0656.f39832((SubLObject)$ic82$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var100), (SubLObject)$ic253$, assertion_handles_oc.f11025(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var101) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var101);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var102 = module0015.$g533$.currentBinding(var100);
            try {
                module0015.$g533$.bind((SubLObject)T, var100);
                module0642.f39019(var65);
            }
            finally {
                module0015.$g533$.rebind(var102, var100);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var1;
    }
    
    public static SubLObject f41194(SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = (SubLObject)$ic257$;
        final SubLObject var33 = module0015.$g538$.currentBinding(var31);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var31))) ? module0015.$g538$.getDynamicValue(var31) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var31);
            module0642.f39020((SubLObject)$ic43$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var31), module0655.$g5142$.getDynamicValue(var31));
            final SubLObject var34 = module0014.f672((SubLObject)$ic44$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic45$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var34) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var34);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic46$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var32) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var32);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0644.f39213();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var38_172 = module0015.$g535$.currentBinding(var31);
            try {
                module0015.$g535$.bind((SubLObject)T, var31);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var31)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var31)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic49$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var38_173 = module0015.$g533$.currentBinding(var31);
                try {
                    module0015.$g533$.bind((SubLObject)T, var31);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic50$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var38_174 = module0015.$g533$.currentBinding(var31);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var31);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic51$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic52$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic53$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var38_174, var31);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var32) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var32);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var35 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var31));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic125$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var35) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var35);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var38_175 = module0015.$g533$.currentBinding(var31);
                    final SubLObject var36 = module0015.$g541$.currentBinding(var31);
                    final SubLObject var37 = module0015.$g539$.currentBinding(var31);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var31);
                        module0015.$g541$.bind((SubLObject)T, var31);
                        module0015.$g539$.bind(module0015.f797(), var31);
                        module0642.f39069((SubLObject)$ic258$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0656.f39870((SubLObject)$ic255$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                        module0642.f39073((SubLObject)$ic259$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39074((SubLObject)$ic257$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0657.f39992($ic260$, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0657.f40017((SubLObject)NIL, (SubLObject)$ic261$);
                        module0015.f799(module0015.$g539$.getDynamicValue(var31));
                    }
                    finally {
                        module0015.$g539$.rebind(var37, var31);
                        module0015.$g541$.rebind(var36, var31);
                        module0015.$g533$.rebind(var38_175, var31);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var38_173, var31);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var38_172, var31);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var33, var31);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41195(SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic263$;
        }
        final SubLObject var67 = module0656.f39832((SubLObject)$ic264$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic265$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var67) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var67);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var68 = module0015.$g533$.currentBinding(var66);
        try {
            module0015.$g533$.bind((SubLObject)T, var66);
            module0642.f39019(var65);
        }
        finally {
            module0015.$g533$.rebind(var68, var66);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41196(final SubLObject var30) {
        return f41197(var30, (SubLObject)NIL);
    }
    
    public static SubLObject f41197(final SubLObject var30, SubLObject var176) {
        if (var176 == UNPROVIDED) {
            var176 = (SubLObject)NIL;
        }
        final SubLThread var177 = SubLProcess.currentSubLThread();
        var177.resetMultipleValues();
        final SubLObject var178 = module0657.f40003(var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var179 = var177.secondMultipleValue();
        final SubLObject var180 = var177.thirdMultipleValue();
        var177.resetMultipleValues();
        if (NIL != var179) {
            return module0657.f40013(var179, var180);
        }
        var177.resetMultipleValues();
        final SubLObject var181 = module0657.f40022(var30, (SubLObject)$ic271$);
        final SubLObject var182 = var177.secondMultipleValue();
        final SubLObject var183 = var177.thirdMultipleValue();
        var177.resetMultipleValues();
        if (NIL != var182) {
            return module0657.f40031(var182, var183, (SubLObject)UNPROVIDED);
        }
        return f41198(var181, var178, (SubLObject)T, var176);
    }
    
    public static SubLObject f41199(final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = (SubLObject)$ic272$;
        final SubLObject var11 = module0015.$g538$.currentBinding(var9);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var9))) ? module0015.$g538$.getDynamicValue(var9) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var9);
            module0642.f39020((SubLObject)$ic43$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var9), module0655.$g5142$.getDynamicValue(var9));
            final SubLObject var12 = module0014.f672((SubLObject)$ic44$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic45$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var12) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var12);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic46$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var10) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var10);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var38_179 = module0015.$g535$.currentBinding(var9);
            try {
                module0015.$g535$.bind((SubLObject)T, var9);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var9)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var9)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic49$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var38_180 = module0015.$g533$.currentBinding(var9);
                try {
                    module0015.$g533$.bind((SubLObject)T, var9);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic50$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var38_181 = module0015.$g533$.currentBinding(var9);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var9);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic51$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic52$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic53$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var38_181, var9);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var10) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var10);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var9));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var38_182 = module0015.$g533$.currentBinding(var9);
                    final SubLObject var13 = module0015.$g541$.currentBinding(var9);
                    final SubLObject var14 = module0015.$g539$.currentBinding(var9);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var9);
                        module0015.$g541$.bind((SubLObject)T, var9);
                        module0015.$g539$.bind(module0015.f797(), var9);
                        module0656.f39870((SubLObject)$ic36$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic54$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0656.f39804(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic55$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0656.f39804(var7, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic273$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic274$);
                        module0015.f799(module0015.$g539$.getDynamicValue(var9));
                    }
                    finally {
                        module0015.$g539$.rebind(var14, var9);
                        module0015.$g541$.rebind(var13, var9);
                        module0015.$g533$.rebind(var38_182, var9);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var38_180, var9);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var38_179, var9);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var11, var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41200(SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic85$);
        }
        else {
            f41188((SubLObject)$ic154$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41201(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic277$);
            return (SubLObject)NIL;
        }
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic278$, var30))) {
            return f41197(var30, (SubLObject)T);
        }
        var31.resetMultipleValues();
        final SubLObject var32 = f41202(var30);
        final SubLObject var33 = var31.secondMultipleValue();
        final SubLObject var34 = var31.thirdMultipleValue();
        final SubLObject var35 = var31.fourthMultipleValue();
        final SubLObject var36 = var31.fifthMultipleValue();
        var31.resetMultipleValues();
        if (NIL != var32) {
            return (SubLObject)NIL;
        }
        final SubLObject var37 = module0274.f18192(var34, var33, (SubLObject)UNPROVIDED);
        if (NIL != var37) {
            return f41155(var34, var33, var35, var36, var30, var37);
        }
        final SubLObject var39;
        final SubLObject var38 = var39 = reader.read_from_string_ignoring_errors(module0642.f39104((SubLObject)$ic279$, var30), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (!var39.eql((SubLObject)$ic280$)) {
            if (var39.eql((SubLObject)$ic281$)) {
                module0543.f33631(var34, var33, var35, var36);
            }
            else {
                module0543.f33628(var34, var33, var35, var36);
            }
        }
        module0677.f41366(var34, var33);
        return f41154((SubLObject)$ic282$, (SubLObject)T, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41202(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        var31.resetMultipleValues();
        final SubLObject var32 = module0657.f40003(var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var33 = var31.secondMultipleValue();
        final SubLObject var34 = var31.thirdMultipleValue();
        var31.resetMultipleValues();
        if (NIL != var33) {
            module0657.f40013(var33, var34);
            return Values.values(var33, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        var31.resetMultipleValues();
        final SubLObject var35 = module0657.f40022(var30, (SubLObject)$ic271$);
        final SubLObject var36 = var31.secondMultipleValue();
        final SubLObject var37 = var31.thirdMultipleValue();
        var31.resetMultipleValues();
        if (NIL != var36) {
            module0657.f40031(var36, var37, (SubLObject)UNPROVIDED);
            return Values.values(var36, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        var31.resetMultipleValues();
        final SubLObject var38 = f41203(var30, (SubLObject)UNPROVIDED);
        final SubLObject var39 = var31.secondMultipleValue();
        var31.resetMultipleValues();
        return Values.values((SubLObject)NIL, var32, var35, var38, var39);
    }
    
    public static SubLObject f41204(SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic286$;
        }
        final SubLObject var67 = module0656.f39832((SubLObject)$ic264$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic287$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var67) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var67);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var68 = module0015.$g533$.currentBinding(var66);
        try {
            module0015.$g533$.bind((SubLObject)T, var66);
            if (NIL != module0014.f695((SubLObject)$ic284$)) {
                final SubLObject var69 = module0014.f697((SubLObject)$ic284$);
                final SubLObject var70 = (SubLObject)$ic212$;
                final SubLObject var71 = module0014.f694((SubLObject)$ic284$);
                final SubLObject var72 = (SubLObject)ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var69);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var71) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var71);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var70) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049(var70));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var72) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var72);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var38_189 = module0015.$g533$.currentBinding(var66);
                try {
                    module0015.$g533$.bind((SubLObject)T, var66);
                }
                finally {
                    module0015.$g533$.rebind(var38_189, var66);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
                module0642.f39067();
            }
            module0642.f39019(var65);
        }
        finally {
            module0015.$g533$.rebind(var68, var66);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41188(final SubLObject var190, SubLObject var1, SubLObject var7, SubLObject var191) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        if (var191 == UNPROVIDED) {
            var191 = (SubLObject)NIL;
        }
        final SubLThread var192 = SubLProcess.currentSubLThread();
        final SubLObject var193 = conses_high.assoc(var190, $g5308$.getDynamicValue(var192), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var193) {
            module0667.f40568((SubLObject)$ic293$, PrintLow.format((SubLObject)NIL, (SubLObject)$ic294$));
            return (SubLObject)NIL;
        }
        SubLObject var195;
        final SubLObject var194 = var195 = var193;
        SubLObject var196 = (SubLObject)NIL;
        SubLObject var197 = (SubLObject)NIL;
        SubLObject var198 = (SubLObject)NIL;
        SubLObject var199 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var195, var194, (SubLObject)$ic295$);
        var196 = var195.first();
        var195 = var195.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var195, var194, (SubLObject)$ic295$);
        var197 = var195.first();
        var195 = var195.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var195, var194, (SubLObject)$ic295$);
        var198 = var195.first();
        var195 = var195.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var195, var194, (SubLObject)$ic295$);
        var199 = var195.first();
        var195 = var195.rest();
        if (NIL == var195) {
            var192.resetMultipleValues();
            final SubLObject var200 = f41205(var1, var7, var191, var197);
            SubLObject var201 = var192.secondMultipleValue();
            final SubLObject var202 = var192.thirdMultipleValue();
            final SubLObject var203 = var192.fourthMultipleValue();
            SubLObject var204 = var192.fifthMultipleValue();
            final SubLObject var205 = var192.sixthMultipleValue();
            final SubLObject var206 = var192.seventhMultipleValue();
            final SubLObject var207 = var192.eighthMultipleValue();
            var192.resetMultipleValues();
            if (NIL == var204) {
                var204 = (SubLObject)$ic154$;
            }
            final SubLObject var208 = module0015.$g538$.currentBinding(var192);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var192))) ? module0015.$g538$.getDynamicValue(var192) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var192);
                module0642.f39020((SubLObject)$ic43$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var198);
                module0642.f39020(module0015.$g174$.getGlobalValue());
                module0666.f40471();
                module0016.f892();
                module0016.f895();
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var38_203 = module0015.$g535$.currentBinding(var192);
                try {
                    module0015.$g535$.bind((SubLObject)T, var192);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic49$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var38_204 = module0015.$g533$.currentBinding(var192);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var192);
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var198);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var209 = module0656.f39832((SubLObject)NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var192));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic125$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != var209) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var209);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_205 = module0015.$g533$.currentBinding(var192);
                        final SubLObject var210 = module0015.$g541$.currentBinding(var192);
                        final SubLObject var211 = module0015.$g539$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var192);
                            module0015.$g541$.bind((SubLObject)T, var192);
                            module0015.$g539$.bind(module0015.f797(), var192);
                            module0642.f39069(var197, (SubLObject)T, (SubLObject)UNPROVIDED);
                            if (NIL != assertion_handles_oc.f11035(var1)) {
                                module0642.f39069((SubLObject)$ic127$, var200, (SubLObject)UNPROVIDED);
                            }
                            else if (NIL != module0206.f13425(var7)) {
                                module0642.f39069((SubLObject)$ic127$, module0655.f39759(var7), (SubLObject)UNPROVIDED);
                            }
                            if ($ic296$ == var190) {
                                var201 = module0655.$g5118$.getGlobalValue();
                                module0642.f39019((SubLObject)$ic297$);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0656.f39804(var201, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic298$);
                                module0642.f39020(module0015.$g185$.getGlobalValue());
                                module0656.f39916(var1, (SubLObject)T, (SubLObject)T);
                                module0642.f39020(module0015.$g186$.getGlobalValue());
                            }
                            if (NIL != assertion_handles_oc.f11035(var1) && ($ic224$ == var190 || $ic101$ == var190) && NIL != module0211.f13700(var1)) {
                                final SubLObject var212 = (SubLObject)$ic128$;
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != var212) {
                                    module0642.f39020(module0015.$g222$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39042(var212));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var38_206 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var192);
                                    module0642.f39021((SubLObject)$ic129$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var38_206, var192);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                module0642.f39026((SubLObject)TWO_INTEGER);
                            }
                            module0656.f39870((SubLObject)$ic291$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            module0642.f39073((SubLObject)$ic299$);
                            module0642.f39032((SubLObject)ONE_INTEGER);
                            module0642.f39074(var199, (SubLObject)$ic300$, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)ONE_INTEGER);
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            if (var190 == $ic154$ || var190 == $ic301$) {
                                final SubLObject var213 = (SubLObject)$ic279$;
                                module0642.f39072(var213, (SubLObject)$ic302$, Equality.eq(module0655.$g5106$.getDynamicValue(var192), (SubLObject)$ic303$), (SubLObject)$ic302$);
                                module0642.f39032((SubLObject)ONE_INTEGER);
                                module0642.f39019((SubLObject)$ic304$);
                                module0642.f39032((SubLObject)THREE_INTEGER);
                                module0642.f39020(module0015.$g246$.getGlobalValue());
                                module0642.f39020(module0015.$g249$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39042((SubLObject)$ic305$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var38_207 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var192);
                                    module0642.f39072(var213, (SubLObject)$ic305$, Equality.eq(module0655.$g5106$.getDynamicValue(var192), (SubLObject)$ic281$), (SubLObject)$ic305$);
                                    module0642.f39032((SubLObject)ONE_INTEGER);
                                    module0642.f39019((SubLObject)$ic306$);
                                    module0642.f39032((SubLObject)THREE_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var38_207, var192);
                                }
                                module0642.f39020(module0015.$g247$.getGlobalValue());
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            module0016.f920((SubLObject)$ic307$, (SubLObject)$ic308$, (SubLObject)$ic309$);
                            module0642.f39020(module0015.$g207$.getGlobalValue());
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic310$);
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                            module0642.f39020(module0015.$g208$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                            final SubLObject var214 = (SubLObject)$ic311$;
                            module0016.f908((SubLObject)$ic307$, var214, (SubLObject)$ic312$);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic307$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var38_208 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                f41206(var204, var203, (SubLObject)ConsesLow.list((SubLObject)$ic313$, var206));
                                final SubLObject var215 = (SubLObject)ConsesLow.list((SubLObject)$ic314$, (SubLObject)makeBoolean(NIL == var206), (SubLObject)$ic315$, (SubLObject)$ic316$, (SubLObject)$ic317$, (SubLObject)NIL);
                                module0657.f39992(var202, var215);
                            }
                            finally {
                                module0015.$g533$.rebind(var38_208, var192);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            final SubLObject var216 = f41207(var190);
                            final SubLObject var217 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic318$, $ic319$, $ic320$, $ic321$, $ic322$, $ic323$, $ic324$, $ic325$, $ic326$, TWENTY_INTEGER, $ic327$, $ic328$, $ic329$, $ic284$, $ic330$, var216 });
                            module0657.f40017(var201, var217);
                            if (NIL != assertion_handles_oc.f11035(var1) && ($ic224$ == var190 || $ic101$ == var190)) {
                                f41171(var1, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            module0015.f799(module0015.$g539$.getDynamicValue(var192));
                        }
                        finally {
                            module0015.$g539$.rebind(var211, var192);
                            module0015.$g541$.rebind(var210, var192);
                            module0015.$g533$.rebind(var38_205, var192);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var38_204, var192);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var38_203, var192);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var208, var192);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var194, (SubLObject)$ic295$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41207(final SubLObject var190) {
        if (var190.eql((SubLObject)$ic296$)) {
            return (SubLObject)$ic331$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41205(final SubLObject var1, final SubLObject var7, final SubLObject var191, final SubLObject var196) {
        final SubLThread var197 = SubLProcess.currentSubLThread();
        SubLObject var198 = (SubLObject)NIL;
        SubLObject var199 = (SubLObject)NIL;
        SubLObject var200 = module0132.$g1569$.getGlobalValue();
        SubLObject var201 = (SubLObject)NIL;
        SubLObject var202 = (SubLObject)NIL;
        SubLObject var203 = (SubLObject)NIL;
        SubLObject var204 = (SubLObject)NIL;
        SubLObject var205 = (SubLObject)NIL;
        final SubLObject var206 = assertion_handles_oc.f11035(var1);
        final SubLObject var207 = module0202.f12660(var7);
        final SubLObject var208 = module0202.f12883(var7, (SubLObject)UNPROVIDED);
        if (NIL != module0655.$g5114$.getDynamicValue(var197)) {
            var200 = module0655.$g5114$.getDynamicValue(var197);
        }
        if (NIL != var207) {
            if (NIL != var208) {
                var200 = module0202.f12906(var7);
                var199 = module0202.f12887(var7);
            }
            else {
                var199 = var7;
            }
        }
        if (NIL != var206) {
            if (NIL == var208 || NIL == var191) {
                var200 = module0178.f11287(var1);
            }
            if (NIL == var207 || NIL == var191) {
                var199 = module0543.f33671(var1);
            }
            var198 = assertion_handles_oc.f11025(var1);
            var201 = module0178.f11291(var1);
            var202 = module0178.f11293(var1);
            var203 = (SubLObject)makeBoolean($ic332$.equal(var196) || $ic333$.equal(var196) || $ic334$.equal(var196));
            var204 = Equality.equal((SubLObject)$ic332$, var196);
            var205 = (SubLObject)((NIL != module0178.f11375(var1)) ? module0178.f11295(var1) : NIL);
        }
        return Values.values(var198, var199, var200, var201, var202, var203, var204, var205);
    }
    
    public static SubLObject f41171(final SubLObject var1, SubLObject var216, SubLObject var217, SubLObject var24, SubLObject var218) {
        if (var216 == UNPROVIDED) {
            var216 = (SubLObject)ZERO_INTEGER;
        }
        if (var217 == UNPROVIDED) {
            var217 = (SubLObject)$ic141$;
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)$ic335$;
        }
        if (var218 == UNPROVIDED) {
            var218 = module0655.$g5098$.getDynamicValue();
        }
        final SubLThread var219 = SubLProcess.currentSubLThread();
        if (NIL != module0211.f13700(var1)) {
            module0642.f39026(var216);
            module0642.f39021(var24);
            final SubLObject var220 = module0211.f13701(var1);
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var221 = module0015.$g533$.currentBinding(var219);
            try {
                module0015.$g533$.bind((SubLObject)T, var219);
                SubLObject var222 = var220;
                SubLObject var223 = (SubLObject)NIL;
                var223 = var222.first();
                while (NIL != var222) {
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var38_219 = module0015.$g533$.currentBinding(var219);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var219);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic211$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic212$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_220 = module0015.$g533$.currentBinding(var219);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var219);
                            final SubLObject var224 = assertion_handles_oc.f11025(var223);
                            final SubLObject var225 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic336$, var217, var224);
                            module0642.f39068(var225, var224, var218, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var38_220, var219);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic211$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic212$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_221 = module0015.$g533$.currentBinding(var219);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var219);
                            f41208(var223, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var38_221, var219);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var38_219, var219);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    var222 = var222.rest();
                    var223 = var222.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var221, var219);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41208(final SubLObject var95, final SubLObject var1, SubLObject var224, SubLObject var225, SubLObject var226) {
        if (var224 == UNPROVIDED) {
            var224 = $ic337$;
        }
        if (var225 == UNPROVIDED) {
            var225 = (SubLObject)T;
        }
        if (var226 == UNPROVIDED) {
            var226 = (SubLObject)T;
        }
        return module0656.f39916(var95, var225, var226);
    }
    
    public static SubLObject f41209(final SubLObject var227) {
        assert NIL != Types.stringp(var227) : var227;
        final SubLObject var228 = module0656.f39959(var227);
        if (NIL == module0161.f10481(var228)) {
            module0656.f39789((SubLObject)$ic339$, var227, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        if (NIL == f41210(var228)) {
            module0656.f39789((SubLObject)$ic340$, var228, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        return var228;
    }
    
    public static SubLObject f41210(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != var8 && NIL != module0161.f10480(var8) && NIL != module0259.f16891(var8, $ic341$));
    }
    
    public static SubLObject f41211(final SubLObject var227, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var227) : var227;
        final SubLObject var228 = reader.read_from_string_ignoring_errors(var227, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == module0202.f12660(var228)) {
            module0656.f39789((SubLObject)$ic342$, var227, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        if (NIL != var8) {
            final SubLObject var229 = module0274.f18188(var228, var8, (SubLObject)UNPROVIDED);
            if (NIL != var229) {
                return f41156(var228, var8, var229, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return var228;
    }
    
    public static SubLObject f41198(final SubLObject var7, final SubLObject var8, SubLObject var228, SubLObject var176) {
        if (var228 == UNPROVIDED) {
            var228 = (SubLObject)T;
        }
        if (var176 == UNPROVIDED) {
            var176 = (SubLObject)NIL;
        }
        SubLObject var229 = (SubLObject)NIL;
        if (NIL != var176) {
            var229 = module0274.f18192(var7, var8, (SubLObject)UNPROVIDED);
        }
        else {
            var229 = module0274.f18188(var7, var8, (SubLObject)UNPROVIDED);
        }
        if (NIL != var229) {
            f41156(var7, var8, var229, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != var228) {
            f41199(var7, var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41212(final SubLObject var30) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic85$);
        }
        else {
            SubLObject var31 = (SubLObject)NIL;
            SubLObject var32 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var30, (SubLObject)$ic343$);
            var31 = var30.first();
            SubLObject var33 = var30.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var33, var30, (SubLObject)$ic343$);
            var32 = var33.first();
            var33 = var33.rest();
            if (NIL == var33) {
                final SubLObject var34 = module0655.f39758(var31);
                final SubLObject var35 = module0656.f39943(var32, (SubLObject)UNPROVIDED);
                final SubLObject var36 = (SubLObject)ConsesLow.list($ic344$, var35, var34);
                f41188((SubLObject)$ic154$, (SubLObject)NIL, var36, (SubLObject)UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic343$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41213(final SubLObject var199, SubLObject var8, SubLObject var65) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        final SubLThread var200 = SubLProcess.currentSubLThread();
        if (NIL == var8) {
            var8 = $ic346$;
        }
        if (NIL == var65) {
            var65 = (SubLObject)$ic347$;
        }
        final SubLObject var201 = module0656.f39832((SubLObject)$ic82$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var200), (SubLObject)$ic348$, module0655.f39759(var199), module0656.f39842(var8));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var201) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var201);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var202 = module0015.$g533$.currentBinding(var200);
        try {
            module0015.$g533$.bind((SubLObject)T, var200);
            module0642.f39019(var65);
        }
        finally {
            module0015.$g533$.rebind(var202, var200);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var199;
    }
    
    public static SubLObject f41214(final SubLObject var30) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic85$);
        }
        else {
            SubLObject var31 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var30, (SubLObject)$ic123$);
            var31 = var30.first();
            final SubLObject var32 = var30.rest();
            if (NIL == var32) {
                final SubLObject var33 = module0656.f39970(var31);
                if (NIL == assertion_handles_oc.f11035(var33)) {
                    module0656.f39789((SubLObject)$ic242$, var31, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    return (SubLObject)NIL;
                }
                f41188((SubLObject)$ic301$, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic123$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41215(final SubLObject var1, SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic352$;
        }
        final SubLObject var67 = module0656.f39832((SubLObject)$ic82$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var66), (SubLObject)$ic353$, assertion_handles_oc.f11025(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var67) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var67);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var68 = module0015.$g533$.currentBinding(var66);
        try {
            module0015.$g533$.bind((SubLObject)T, var66);
            module0642.f39019(var65);
        }
        finally {
            module0015.$g533$.rebind(var68, var66);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f41216(final SubLObject var30) {
        if (NIL != module0543.f33698()) {
            return module0667.f40583((SubLObject)$ic85$);
        }
        SubLObject var31 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var30, var30, (SubLObject)$ic123$);
        var31 = var30.first();
        final SubLObject var32 = var30.rest();
        if (NIL != var32) {
            cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic123$);
            return (SubLObject)NIL;
        }
        final SubLObject var33 = module0656.f39970(var31);
        if (NIL == assertion_handles_oc.f11035(var33)) {
            module0656.f39789((SubLObject)$ic242$, var31, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        return f41188((SubLObject)$ic296$, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41217(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic356$);
            return (SubLObject)NIL;
        }
        final SubLObject var32 = module0642.f39104((SubLObject)$ic127$, var30);
        final SubLObject var33 = module0656.f39970(var32);
        if (NIL == assertion_handles_oc.f11035(var33)) {
            return module0656.f39789((SubLObject)$ic248$, var30.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var31.resetMultipleValues();
        final SubLObject var34 = f41202(var30);
        final SubLObject var35 = var31.secondMultipleValue();
        SubLObject var36 = var31.thirdMultipleValue();
        final SubLObject var37 = var31.fourthMultipleValue();
        final SubLObject var38 = var31.fifthMultipleValue();
        var31.resetMultipleValues();
        if (NIL != var34) {
            return (SubLObject)NIL;
        }
        if (NIL == module0035.f2428(module0655.$g5118$.getGlobalValue(), var36, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0656.f39789((SubLObject)$ic357$, module0655.$g5118$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var39 = module0289.f19402(var33);
        var36 = conses_high.subst(var39, module0655.$g5118$.getGlobalValue(), var36, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic278$, var30))) {
            return f41198(var36, var35, (SubLObject)T, (SubLObject)UNPROVIDED);
        }
        final SubLObject var40 = module0274.f18192(var36, var35, (SubLObject)UNPROVIDED);
        if (NIL != var40) {
            return f41155(var36, var35, var37, var38, var30, var40);
        }
        module0543.f33628(var36, var35, var37, var38);
        return f41154((SubLObject)$ic358$, (SubLObject)T, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41218(final SubLObject var1, SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic360$;
        }
        final SubLObject var67 = module0656.f39832((SubLObject)$ic82$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var66), (SubLObject)$ic361$, assertion_handles_oc.f11025(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var67) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var67);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var68 = module0015.$g533$.currentBinding(var66);
        try {
            module0015.$g533$.bind((SubLObject)T, var66);
            module0642.f39019(var65);
        }
        finally {
            module0015.$g533$.rebind(var68, var66);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f41219(final SubLObject var238, final SubLObject var239) {
        final SubLObject var240 = var238.rest();
        final SubLObject var242;
        final SubLObject var241 = var242 = var240;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic363$, (SubLObject)$ic364$, ConsesLow.append(var242, (SubLObject)NIL));
    }
    
    public static SubLObject f41220(final SubLObject var30) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic85$);
        }
        else {
            SubLObject var31 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var30, (SubLObject)$ic123$);
            var31 = var30.first();
            final SubLObject var32 = var30.rest();
            if (NIL == var32) {
                final SubLObject var33 = module0656.f39970(var31);
                if (NIL == assertion_handles_oc.f11035(var33)) {
                    module0656.f39789((SubLObject)$ic242$, var31, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    return (SubLObject)NIL;
                }
                f41188((SubLObject)$ic224$, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic123$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41221(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic356$);
            return (SubLObject)NIL;
        }
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic278$, var30))) {
            return f41197(var30, (SubLObject)NIL);
        }
        final SubLObject var32 = module0642.f39104((SubLObject)$ic127$, var30);
        final SubLObject var33 = module0656.f39970(var32);
        if (NIL == assertion_handles_oc.f11035(var33)) {
            return module0656.f39789((SubLObject)$ic248$, var30.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var31.resetMultipleValues();
        final SubLObject var34 = f41202(var30);
        final SubLObject var35 = var31.secondMultipleValue();
        final SubLObject var36 = var31.thirdMultipleValue();
        final SubLObject var37 = var31.fourthMultipleValue();
        final SubLObject var38 = var31.fifthMultipleValue();
        var31.resetMultipleValues();
        if (NIL != var34) {
            return (SubLObject)NIL;
        }
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = module0144.$g1769$.currentBinding(var31);
        final SubLObject var41 = module0144.$g1771$.currentBinding(var31);
        try {
            module0144.$g1769$.bind((SubLObject)NIL, var31);
            module0144.$g1771$.bind((SubLObject)NIL, var31);
            var39 = module0274.f18188(var36, var35, (SubLObject)UNPROVIDED);
        }
        finally {
            module0144.$g1771$.rebind(var41, var31);
            module0144.$g1769$.rebind(var40, var31);
        }
        if (NIL != var39) {
            f41156(var36, var35, var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        final SubLObject var42 = f41173(var33, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f41132(var33, var36, var35, var37, var38, var42);
        return f41154((SubLObject)$ic366$, (SubLObject)T, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41173(final SubLObject var1, final SubLObject var30, SubLObject var245, SubLObject var246) {
        if (var245 == UNPROVIDED) {
            var245 = (SubLObject)$ic141$;
        }
        if (var246 == UNPROVIDED) {
            var246 = (SubLObject)NIL;
        }
        SubLObject var247 = (SubLObject)NIL;
        SubLObject var248 = var30;
        SubLObject var249 = (SubLObject)NIL;
        var249 = var248.first();
        while (NIL != var248) {
            if (var249.isCons()) {
                SubLObject var251;
                final SubLObject var250 = var251 = var249;
                SubLObject var252 = (SubLObject)NIL;
                SubLObject var253 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var251, var250, (SubLObject)$ic368$);
                var252 = var251.first();
                var251 = var251.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var251, var250, (SubLObject)$ic368$);
                var253 = var251.first();
                var251 = var251.rest();
                if (NIL == var251) {
                    if (NIL != module0038.f2684(var252, var245)) {
                        final SubLObject var254 = module0656.f39970(var253);
                        final SubLObject var255 = (NIL != var246) ? var246 : module0178.f11287(var254);
                        if (NIL != assertion_handles_oc.f11035(var254) && NIL != module0205.f13220(var1, var254, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var247 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var254, var255), var247);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var250, (SubLObject)$ic368$);
                }
            }
            var248 = var248.rest();
            var249 = var248.first();
        }
        return Sequences.nreverse(var247);
    }
    
    public static SubLObject f41222(final SubLObject var1, SubLObject var65, SubLObject var99, SubLObject var251) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)NIL;
        }
        if (var251 == UNPROVIDED) {
            var251 = (SubLObject)$ic82$;
        }
        final SubLThread var252 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic369$;
        }
        if (NIL != var99) {
            f41168(var65);
        }
        else {
            final SubLObject var253 = module0656.f39832(var251);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var252), (SubLObject)$ic370$, assertion_handles_oc.f11025(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var253) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var253);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var254 = module0015.$g533$.currentBinding(var252);
            try {
                module0015.$g533$.bind((SubLObject)T, var252);
                module0642.f39019(var65);
            }
            finally {
                module0015.$g533$.rebind(var254, var252);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var1;
    }
    
    public static SubLObject f41223(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = module0587.$g4457$.currentBinding(var31);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var31), var31);
            if (NIL != module0543.f33698()) {
                try {
                    final SubLObject var38_252 = module0601.$g4652$.currentBinding(var31);
                    final SubLObject var33 = module0601.$g4654$.currentBinding(var31);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var31), module0601.$g4652$.getDynamicValue(var31)), var31);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var31), var31);
                        module0601.f36758((SubLObject)$ic374$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                        PrintLow.format(module0587.$g4457$.getDynamicValue(var31), (SubLObject)$ic375$, module0667.f40585((SubLObject)$ic376$));
                    }
                    finally {
                        module0601.$g4654$.rebind(var33, var31);
                        module0601.$g4652$.rebind(var38_252, var31);
                    }
                }
                finally {
                    final SubLObject var38_253 = Threads.$is_thread_performing_cleanupP$.currentBinding(var31);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var31);
                        module0601.f36746();
                        module0601.f36760((SubLObject)$ic374$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var38_253, var31);
                    }
                }
                return (SubLObject)NIL;
            }
            SubLObject var34 = (SubLObject)NIL;
            SubLObject var35 = (SubLObject)NIL;
            final SubLObject var36 = module0642.f39113((SubLObject)$ic378$, var30, (SubLObject)UNPROVIDED);
            final SubLObject var37 = (SubLObject)((NIL != var36) ? assertion_handles_oc.f11053(var36) : NIL);
            SubLObject var38 = var30;
            SubLObject var39 = (SubLObject)NIL;
            var39 = var38.first();
            while (NIL != var38) {
                if (NIL != module0035.f2014(var39)) {
                    final SubLObject var40 = var39.first();
                    if (NIL != module0038.f2684(var40, (SubLObject)$ic319$)) {
                        final SubLObject var41 = module0657.f40022(var30, (SubLObject)ConsesLow.list((SubLObject)$ic318$, var40));
                        final SubLObject var42 = Sequences.subseq(var40, (SubLObject)EIGHT_INTEGER, (SubLObject)UNPROVIDED);
                        if (NIL != module0274.f18065(var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var35 = (SubLObject)ConsesLow.cons(var41, var35);
                        }
                        else {
                            var34 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic379$, var42, (SubLObject)$ic21$, module0642.f39104(var40, var30)), var34);
                        }
                    }
                }
                var38 = var38.rest();
                var39 = var38.first();
            }
            if (NIL == var34 && NIL != var37) {
                module0543.f33639(var37);
            }
            var38 = var35;
            SubLObject var43 = (SubLObject)NIL;
            var43 = var38.first();
            while (NIL != var38) {
                module0543.f33628(var43, $ic346$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var38 = var38.rest();
                var43 = var38.first();
            }
            try {
                final SubLObject var38_254 = module0601.$g4652$.currentBinding(var31);
                final SubLObject var44 = module0601.$g4654$.currentBinding(var31);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var31), module0601.$g4652$.getDynamicValue(var31)), var31);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var31), var31);
                    module0601.f36758((SubLObject)$ic380$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                    if (NIL != var34) {
                        try {
                            final SubLObject var38_255 = module0601.$g4652$.currentBinding(var31);
                            final SubLObject var44_262 = module0601.$g4654$.currentBinding(var31);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var31), module0601.$g4652$.getDynamicValue(var31)), var31);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var31), var31);
                                module0601.f36758((SubLObject)$ic374$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var45 = var34;
                                SubLObject var46 = (SubLObject)NIL;
                                var46 = var45.first();
                                while (NIL != var45) {
                                    final SubLObject var47 = conses_high.getf(var46, (SubLObject)$ic21$, (SubLObject)UNPROVIDED);
                                    final SubLObject var48 = (SubLObject)ConsesLow.list((SubLObject)$ic127$, conses_high.getf(var46, (SubLObject)$ic379$, (SubLObject)UNPROVIDED));
                                    try {
                                        final SubLObject var38_256 = module0601.$g4652$.currentBinding(var31);
                                        final SubLObject var44_263 = module0601.$g4654$.currentBinding(var31);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var31), module0601.$g4652$.getDynamicValue(var31)), var31);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var31), var31);
                                            module0601.f36758((SubLObject)$ic381$, var48, (SubLObject)NIL, (SubLObject)NIL);
                                            module0601.f36754(module0006.f204(var47));
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var44_263, var31);
                                            module0601.$g4652$.rebind(var38_256, var31);
                                        }
                                    }
                                    finally {
                                        final SubLObject var38_257 = Threads.$is_thread_performing_cleanupP$.currentBinding(var31);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var31);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)$ic381$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var38_257, var31);
                                        }
                                    }
                                    var45 = var45.rest();
                                    var46 = var45.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var44_262, var31);
                                module0601.$g4652$.rebind(var38_255, var31);
                            }
                        }
                        finally {
                            final SubLObject var38_258 = Threads.$is_thread_performing_cleanupP$.currentBinding(var31);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var31);
                                module0601.f36746();
                                module0601.f36760((SubLObject)$ic374$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var38_258, var31);
                            }
                        }
                    }
                    else {
                        final SubLObject var49 = (SubLObject)ConsesLow.list((SubLObject)$ic382$, module0038.f2624(Sequences.length(var35)));
                        try {
                            final SubLObject var38_259 = module0601.$g4652$.currentBinding(var31);
                            final SubLObject var44_264 = module0601.$g4654$.currentBinding(var31);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var31), module0601.$g4652$.getDynamicValue(var31)), var31);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var31), var31);
                                module0601.f36758((SubLObject)$ic383$, var49, (SubLObject)NIL, (SubLObject)NIL);
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var31), (SubLObject)$ic384$, Sequences.length(var35), Sequences.length(var35));
                            }
                            finally {
                                module0601.$g4654$.rebind(var44_264, var31);
                                module0601.$g4652$.rebind(var38_259, var31);
                            }
                        }
                        finally {
                            final SubLObject var38_260 = Threads.$is_thread_performing_cleanupP$.currentBinding(var31);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var31);
                                module0601.f36760((SubLObject)$ic383$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var38_260, var31);
                            }
                        }
                        if (NIL != var37) {
                            final SubLObject var264_272 = (SubLObject)$ic385$;
                            try {
                                final SubLObject var38_261 = module0601.$g4652$.currentBinding(var31);
                                final SubLObject var44_265 = module0601.$g4654$.currentBinding(var31);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var31), module0601.$g4652$.getDynamicValue(var31)), var31);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var31), var31);
                                    module0601.f36758((SubLObject)$ic386$, var264_272, (SubLObject)NIL, (SubLObject)NIL);
                                    PrintLow.format(module0587.$g4457$.getDynamicValue(var31), (SubLObject)$ic387$, (SubLObject)ONE_INTEGER);
                                }
                                finally {
                                    module0601.$g4654$.rebind(var44_265, var31);
                                    module0601.$g4652$.rebind(var38_261, var31);
                                }
                            }
                            finally {
                                final SubLObject var38_262 = Threads.$is_thread_performing_cleanupP$.currentBinding(var31);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var31);
                                    module0601.f36760((SubLObject)$ic386$);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var38_262, var31);
                                }
                            }
                        }
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var44, var31);
                    module0601.$g4652$.rebind(var38_254, var31);
                }
            }
            finally {
                final SubLObject var38_263 = Threads.$is_thread_performing_cleanupP$.currentBinding(var31);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var31);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic380$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var38_263, var31);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var32, var31);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41224(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic356$);
            return (SubLObject)NIL;
        }
        final SubLObject var32 = module0642.f39104((SubLObject)$ic127$, var30);
        final SubLObject var33 = module0655.f39758(var32);
        if (NIL == module0202.f12883(var33, (SubLObject)UNPROVIDED)) {
            return module0656.f39789((SubLObject)$ic388$, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var31.resetMultipleValues();
        final SubLObject var34 = f41202(var30);
        final SubLObject var35 = var31.secondMultipleValue();
        final SubLObject var36 = var31.thirdMultipleValue();
        final SubLObject var37 = var31.fourthMultipleValue();
        final SubLObject var38 = var31.fifthMultipleValue();
        var31.resetMultipleValues();
        if (NIL != var34) {
            return (SubLObject)NIL;
        }
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = module0144.$g1769$.currentBinding(var31);
        final SubLObject var41 = module0144.$g1771$.currentBinding(var31);
        try {
            module0144.$g1769$.bind((SubLObject)NIL, var31);
            module0144.$g1771$.bind((SubLObject)NIL, var31);
            var39 = module0274.f18192(var36, var35, (SubLObject)UNPROVIDED);
        }
        finally {
            module0144.$g1771$.rebind(var41, var31);
            module0144.$g1769$.rebind(var40, var31);
        }
        if (NIL != var39) {
            return f41156(var36, var35, var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var42 = module0205.f13204(var33, (SubLObject)UNPROVIDED);
        final SubLObject var43 = module0205.f13203(var33, (SubLObject)UNPROVIDED);
        f41225(var42, var43, var36, var35, var37, var38);
        return f41154((SubLObject)$ic366$, (SubLObject)T, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41225(final SubLObject var278, final SubLObject var279, final SubLObject var277, final SubLObject var2, final SubLObject var106, final SubLObject var113) {
        module0677.f41371(module0202.f12782(var279, var278));
        module0677.f41366(var277, var2);
        return module0543.f33659(var278, var277, var279, var2, var106, var113);
    }
    
    public static SubLObject f41226(final SubLObject var30) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic390$);
        }
        else {
            SubLObject var31 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var30, (SubLObject)$ic123$);
            var31 = var30.first();
            final SubLObject var32 = var30.rest();
            if (NIL == var32) {
                final SubLObject var33 = module0656.f39970(var31);
                if (NIL == assertion_handles_oc.f11035(var33)) {
                    module0656.f39789((SubLObject)$ic242$, var31, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    return (SubLObject)NIL;
                }
                f41188((SubLObject)$ic101$, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic123$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41227(final SubLObject var1, SubLObject var65, SubLObject var99) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic392$;
        }
        if (NIL != var99) {
            f41168(var65);
        }
        else {
            final SubLObject var101 = module0656.f39832((SubLObject)$ic82$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var100), (SubLObject)$ic393$, assertion_handles_oc.f11025(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var101) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var101);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var102 = module0015.$g533$.currentBinding(var100);
            try {
                module0015.$g533$.bind((SubLObject)T, var100);
                module0642.f39019(var65);
            }
            finally {
                module0015.$g533$.rebind(var102, var100);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var1;
    }
    
    public static SubLObject f41228(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic390$);
            return (SubLObject)NIL;
        }
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic278$, var30))) {
            return f41197(var30, (SubLObject)T);
        }
        final SubLObject var32 = module0642.f39104((SubLObject)$ic127$, var30);
        final SubLObject var33 = module0656.f39970(var32);
        if (NIL == assertion_handles_oc.f11035(var33)) {
            return module0656.f39789((SubLObject)$ic248$, var30.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var31.resetMultipleValues();
        final SubLObject var34 = f41202(var30);
        final SubLObject var35 = var31.secondMultipleValue();
        final SubLObject var36 = var31.thirdMultipleValue();
        final SubLObject var37 = var31.fourthMultipleValue();
        final SubLObject var38 = var31.fifthMultipleValue();
        var31.resetMultipleValues();
        if (NIL != var34) {
            return (SubLObject)NIL;
        }
        final SubLObject var39 = module0543.f33671(var33);
        if (NIL == module0543.f33672(var39, var36)) {
            return module0656.f39789((SubLObject)$ic395$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var40 = (SubLObject)NIL;
        final SubLObject var41 = module0144.$g1769$.currentBinding(var31);
        final SubLObject var42 = module0144.$g1771$.currentBinding(var31);
        try {
            module0144.$g1769$.bind((SubLObject)NIL, var31);
            module0144.$g1771$.bind((SubLObject)NIL, var31);
            var40 = module0274.f18192(var36, var35, (SubLObject)UNPROVIDED);
        }
        finally {
            module0144.$g1771$.rebind(var42, var31);
            module0144.$g1769$.rebind(var41, var31);
        }
        if (NIL != var40) {
            return f41156(var36, var35, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var43 = f41173(var33, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f41134(var33, var36, var43);
        return f41154((SubLObject)$ic366$, (SubLObject)T, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41167(final SubLObject var1) {
        return module0205.f13216(Symbols.symbol_function((SubLObject)$ic338$), var1, (SubLObject)T, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41229(final SubLObject var30) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic85$);
        }
        else {
            final SubLObject var31 = module0656.f39970(var30);
            if (NIL == assertion_handles_oc.f11035(var31)) {
                module0656.f39789((SubLObject)$ic242$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                f41133(var31);
                f41154((SubLObject)$ic397$, (SubLObject)T, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41230(final SubLObject var1, SubLObject var65, SubLObject var99) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic399$;
        }
        if (NIL != var99) {
            f41168(var65);
        }
        else {
            final SubLObject var101 = module0656.f39832((SubLObject)$ic82$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var100), (SubLObject)$ic400$, assertion_handles_oc.f11025(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var101) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var101);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var102 = module0015.$g533$.currentBinding(var100);
            try {
                module0015.$g533$.bind((SubLObject)T, var100);
                module0642.f39019(var65);
            }
            finally {
                module0015.$g533$.rebind(var102, var100);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var1;
    }
    
    public static SubLObject f41231(final SubLObject var30) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic85$);
        }
        else {
            final SubLObject var31 = module0656.f39970(var30);
            if (NIL == assertion_handles_oc.f11035(var31)) {
                module0656.f39789((SubLObject)$ic242$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                module0677.f41335(var31);
                module0543.f33639(var31);
                f41154((SubLObject)$ic402$, (SubLObject)T, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41232(final SubLObject var1, SubLObject var65, SubLObject var99) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic404$;
        }
        if (NIL != var99) {
            f41168(var65);
        }
        else {
            final SubLObject var101 = module0656.f39832((SubLObject)$ic82$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var100), (SubLObject)$ic405$, assertion_handles_oc.f11025(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var101) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var101);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var102 = module0015.$g533$.currentBinding(var100);
            try {
                module0015.$g533$.bind((SubLObject)T, var100);
                module0642.f39019(var65);
            }
            finally {
                module0015.$g533$.rebind(var102, var100);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var1;
    }
    
    public static SubLObject f41233(final SubLObject var30) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic85$);
        }
        else {
            final SubLObject var31 = module0656.f39970(var30);
            if (NIL == assertion_handles_oc.f11035(var31)) {
                module0656.f39789((SubLObject)$ic242$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                module0677.f41335(var31);
                module0543.f33679(var31);
                f41154((SubLObject)$ic407$, (SubLObject)T, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41234(final SubLObject var1, SubLObject var65, SubLObject var99) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic409$;
        }
        if (NIL != var99) {
            f41168(var65);
        }
        else {
            final SubLObject var101 = module0656.f39832((SubLObject)$ic82$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var100), (SubLObject)$ic410$, assertion_handles_oc.f11025(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var101) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var101);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var102 = module0015.$g533$.currentBinding(var100);
            try {
                module0015.$g533$.bind((SubLObject)T, var100);
                module0642.f39019(var65);
            }
            finally {
                module0015.$g533$.rebind(var102, var100);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var1;
    }
    
    public static SubLObject f41235(final SubLObject var30) {
        if (NIL != module0543.f33698()) {
            return module0667.f40583((SubLObject)$ic85$);
        }
        SubLObject var31 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var30, var30, (SubLObject)$ic412$);
        var31 = var30.first();
        final SubLObject var32 = var30.rest();
        if (NIL != var32) {
            cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic412$);
            return (SubLObject)NIL;
        }
        final SubLObject var33 = module0656.f39971(var31);
        if (NIL == deduction_handles_oc.f11659(var33)) {
            return module0656.f39789((SubLObject)$ic413$, var31, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0543.f33684(var33);
        return f41154((SubLObject)$ic414$, (SubLObject)T, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41236(final SubLObject var285, SubLObject var65, SubLObject var99) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)NIL;
        }
        final SubLThread var286 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic416$;
        }
        if (NIL != var99) {
            f41168(var65);
        }
        else {
            final SubLObject var287 = module0656.f39832((SubLObject)$ic82$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var286), (SubLObject)$ic417$, deduction_handles_oc.f11649(var285));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var287) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var287);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var288 = module0015.$g533$.currentBinding(var286);
            try {
                module0015.$g533$.bind((SubLObject)T, var286);
                module0642.f39019(var65);
            }
            finally {
                module0015.$g533$.rebind(var288, var286);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var285;
    }
    
    public static SubLObject f41237(final SubLObject var30) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic85$);
        }
        else {
            final SubLObject var31 = module0656.f39970(var30);
            if (NIL == assertion_handles_oc.f11035(var31)) {
                module0656.f39789((SubLObject)$ic242$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                module0543.f33687(var31);
                f41154((SubLObject)$ic420$, (SubLObject)T, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41238(final SubLObject var1, SubLObject var65, SubLObject var99) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)NIL;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic422$;
        }
        if (NIL != var99) {
            f41168(var65);
        }
        else {
            final SubLObject var101 = module0656.f39832((SubLObject)$ic82$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var100), (SubLObject)$ic423$, assertion_handles_oc.f11025(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var101) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var101);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var102 = module0015.$g533$.currentBinding(var100);
            try {
                module0015.$g533$.bind((SubLObject)T, var100);
                module0642.f39019(var65);
            }
            finally {
                module0015.$g533$.rebind(var102, var100);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var1;
    }
    
    public static SubLObject f41239(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic427$);
        }
        else {
            final SubLObject var32 = module0656.f39970(var30);
            if (NIL == assertion_handles_oc.f11035(var32)) {
                module0656.f39789((SubLObject)$ic428$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return (SubLObject)NIL;
            }
            final SubLObject var33 = (SubLObject)$ic429$;
            final SubLObject var34 = module0015.$g538$.currentBinding(var31);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var31))) ? module0015.$g538$.getDynamicValue(var31) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var31);
                module0642.f39020((SubLObject)$ic43$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var31), module0655.$g5142$.getDynamicValue(var31));
                final SubLObject var35 = module0014.f672((SubLObject)$ic44$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic45$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var35) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var35);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic46$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var33) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var33);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var38_286 = module0015.$g535$.currentBinding(var31);
                try {
                    module0015.$g535$.bind((SubLObject)T, var31);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var31)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var31)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic49$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var38_287 = module0015.$g533$.currentBinding(var31);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var31);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic50$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_288 = module0015.$g533$.currentBinding(var31);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var31);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic51$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic52$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic53$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var38_288, var31);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var33) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var33);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var31));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_289 = module0015.$g533$.currentBinding(var31);
                        final SubLObject var36 = module0015.$g541$.currentBinding(var31);
                        final SubLObject var37 = module0015.$g539$.currentBinding(var31);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var31);
                            module0015.$g541$.bind((SubLObject)T, var31);
                            module0015.$g539$.bind(module0015.f797(), var31);
                            module0656.f39870((SubLObject)$ic425$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic430$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0656.f39916(var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            final SubLObject var38 = module0671.f40988(var32);
                            final SubLObject var39 = f41240(var32);
                            if (NIL == var39 && NIL == var38) {
                                module0642.f39019((SubLObject)$ic274$);
                            }
                            module0015.f799(module0015.$g539$.getDynamicValue(var31));
                        }
                        finally {
                            module0015.$g539$.rebind(var37, var31);
                            module0015.$g541$.rebind(var36, var31);
                            module0015.$g533$.rebind(var38_289, var31);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var38_287, var31);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var38_286, var31);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var34, var31);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41240(final SubLObject var1) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41241(final SubLObject var1, SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        if (NIL == var65) {
            var65 = (SubLObject)$ic432$;
        }
        final SubLObject var67 = module0656.f39832((SubLObject)$ic264$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var66), (SubLObject)$ic433$, assertion_handles_oc.f11025(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var67) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var67);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var68 = module0015.$g533$.currentBinding(var66);
        try {
            module0015.$g533$.bind((SubLObject)T, var66);
            module0642.f39019(var65);
        }
        finally {
            module0015.$g533$.rebind(var68, var66);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f41242() {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        $g5309$.setDynamicValue(module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic437$), $g5309$.getDynamicValue(var28), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var28);
        return conses_high.copy_list($g5309$.getDynamicValue(var28));
    }
    
    public static SubLObject f41243(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles_oc.f11035(var1) && NIL != module0178.f11290(var1) && NIL == conses_high.member(var1, $g5309$.getDynamicValue(var2), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g5309$.setDynamicValue((SubLObject)ConsesLow.cons(var1, $g5309$.getDynamicValue(var2)), var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41244(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        $g5309$.setDynamicValue(Sequences.delete(var1, $g5309$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41245() {
        $g5309$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41246(final SubLObject var30) {
        final SubLObject var31 = module0656.f39970(var30);
        if (NIL == assertion_handles_oc.f11035(var31)) {
            return module0656.f39789((SubLObject)$ic242$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == module0178.f11290(var31)) {
            return module0656.f39789((SubLObject)$ic438$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f41243(var31);
        return module0656.f39792((SubLObject)$ic439$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41247(final SubLObject var1, SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        if (NIL == var65) {
            var65 = (SubLObject)$ic442$;
        }
        final SubLObject var67 = module0656.f39832((SubLObject)$ic82$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var66), (SubLObject)$ic443$, assertion_handles_oc.f11025(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var67) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var67);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var68 = module0015.$g533$.currentBinding(var66);
        try {
            module0015.$g533$.bind((SubLObject)T, var66);
            module0642.f39019(var65);
        }
        finally {
            module0015.$g533$.rebind(var68, var66);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f41248(final SubLObject var30) {
        final SubLObject var31 = module0656.f39970(var30);
        if (NIL != module0178.f11290(var31)) {
            f41249(var31, (SubLObject)UNPROVIDED);
            return module0671.f40980(var30);
        }
        return module0656.f39789((SubLObject)$ic445$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41250(final SubLObject var1, SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        if (NIL == var65) {
            var65 = (SubLObject)$ic447$;
        }
        final SubLObject var67 = module0656.f39832((SubLObject)$ic82$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var66), (SubLObject)$ic448$, assertion_handles_oc.f11025(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var67) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var67);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var68 = module0015.$g533$.currentBinding(var66);
        try {
            module0015.$g533$.bind((SubLObject)T, var66);
            module0642.f39019(var65);
        }
        finally {
            module0015.$g533$.rebind(var68, var66);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f41249(final SubLObject var293, SubLObject var294) {
        if (var294 == UNPROVIDED) {
            var294 = (SubLObject)$ic450$;
        }
        module0414.f28908(var293, (SubLObject)T, var294, (SubLObject)UNPROVIDED);
        module0414.f28909(var293, (SubLObject)T, var294, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41206(final SubLObject var4, final SubLObject var5, SubLObject var211) {
        if (var211 == UNPROVIDED) {
            var211 = (SubLObject)NIL;
        }
        final SubLThread var212 = SubLProcess.currentSubLThread();
        final SubLObject var214;
        final SubLObject var213 = var214 = var211;
        final SubLObject var215 = cdestructuring_bind.property_list_member((SubLObject)$ic313$, var214);
        final SubLObject var216 = (SubLObject)((NIL != var215) ? conses_high.cadr(var215) : NIL);
        final SubLObject var217 = cdestructuring_bind.property_list_member((SubLObject)$ic451$, var214);
        final SubLObject var218 = (NIL != var217) ? conses_high.cadr(var217) : $g5310$.getGlobalValue();
        final SubLObject var219 = cdestructuring_bind.property_list_member((SubLObject)$ic452$, var214);
        final SubLObject var220 = (NIL != var219) ? conses_high.cadr(var219) : $g5311$.getGlobalValue();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var221 = module0015.$g533$.currentBinding(var212);
        try {
            module0015.$g533$.bind((SubLObject)T, var212);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var38_303 = module0015.$g533$.currentBinding(var212);
            try {
                module0015.$g533$.bind((SubLObject)T, var212);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var38_304 = module0015.$g533$.currentBinding(var212);
                try {
                    module0015.$g533$.bind((SubLObject)T, var212);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic453$);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var38_304, var212);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var38_305 = module0015.$g533$.currentBinding(var212);
                try {
                    module0015.$g533$.bind((SubLObject)T, var212);
                    if (NIL != var216) {
                        module0642.f39027((SubLObject)$ic454$, (SubLObject)UNPROVIDED);
                        module0656.f39796(var4);
                        module0642.f39069(var218, var4, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                    }
                    else {
                        module0642.f39020(module0015.$g246$.getGlobalValue());
                        module0642.f39020(module0015.$g249$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042((SubLObject)$ic455$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_306 = module0015.$g533$.currentBinding(var212);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var212);
                            module0642.f39072(var218, (SubLObject)$ic153$, Equality.eq(var4, (SubLObject)$ic154$), (SubLObject)$ic455$);
                            module0642.f39032((SubLObject)ONE_INTEGER);
                            module0642.f39019((SubLObject)$ic155$);
                        }
                        finally {
                            module0015.$g533$.rebind(var38_306, var212);
                        }
                        module0642.f39020(module0015.$g247$.getGlobalValue());
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g246$.getGlobalValue());
                        module0642.f39020(module0015.$g249$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042((SubLObject)$ic456$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_307 = module0015.$g533$.currentBinding(var212);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var212);
                            module0642.f39072(var218, (SubLObject)$ic156$, Equality.eq(var4, (SubLObject)$ic157$), (SubLObject)$ic456$);
                            module0642.f39032((SubLObject)ONE_INTEGER);
                            module0642.f39019((SubLObject)$ic158$);
                        }
                        finally {
                            module0015.$g533$.rebind(var38_307, var212);
                        }
                        module0642.f39020(module0015.$g247$.getGlobalValue());
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var38_305, var212);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var38_308 = module0015.$g533$.currentBinding(var212);
                try {
                    module0015.$g533$.bind((SubLObject)T, var212);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic457$);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var38_308, var212);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var38_309 = module0015.$g533$.currentBinding(var212);
                try {
                    module0015.$g533$.bind((SubLObject)T, var212);
                    if (NIL != var216) {
                        module0642.f39027((SubLObject)$ic454$, (SubLObject)UNPROVIDED);
                        module0656.f39797(var5);
                        module0642.f39069(var220, var5, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                    }
                    else {
                        module0642.f39020(module0015.$g246$.getGlobalValue());
                        module0642.f39020(module0015.$g249$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042((SubLObject)$ic175$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_310 = module0015.$g533$.currentBinding(var212);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var212);
                            module0642.f39072(var220, (SubLObject)$ic175$, (SubLObject)NIL, (SubLObject)$ic175$);
                            module0642.f39032((SubLObject)ONE_INTEGER);
                            module0642.f39019((SubLObject)$ic177$);
                        }
                        finally {
                            module0015.$g533$.rebind(var38_310, var212);
                        }
                        module0642.f39020(module0015.$g247$.getGlobalValue());
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g246$.getGlobalValue());
                        module0642.f39020(module0015.$g249$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042((SubLObject)$ic178$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var38_311 = module0015.$g533$.currentBinding(var212);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var212);
                            module0642.f39072(var220, (SubLObject)$ic178$, (SubLObject)NIL, (SubLObject)$ic178$);
                            module0642.f39032((SubLObject)ONE_INTEGER);
                            module0642.f39019((SubLObject)$ic180$);
                        }
                        finally {
                            module0015.$g533$.rebind(var38_311, var212);
                        }
                        module0642.f39020(module0015.$g247$.getGlobalValue());
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var38_309, var212);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var38_303, var212);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var221, var212);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41203(final SubLObject var30, SubLObject var312) {
        if (var312 == UNPROVIDED) {
            var312 = (SubLObject)NIL;
        }
        final SubLObject var314;
        final SubLObject var313 = var314 = var312;
        final SubLObject var315 = cdestructuring_bind.property_list_member((SubLObject)$ic451$, var314);
        final SubLObject var316 = (NIL != var315) ? conses_high.cadr(var315) : $g5310$.getGlobalValue();
        final SubLObject var317 = cdestructuring_bind.property_list_member((SubLObject)$ic452$, var314);
        final SubLObject var318 = (NIL != var317) ? conses_high.cadr(var317) : $g5311$.getGlobalValue();
        final SubLObject var319 = module0642.f39104(var316, var30);
        final SubLObject var320 = module0642.f39104(var318, var30);
        SubLObject var321 = (SubLObject)NIL;
        SubLObject var322 = (SubLObject)NIL;
        if (var319.isString()) {
            var321 = reader.read_from_string_ignoring_errors(var319, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var320.isString()) {
            var322 = reader.read_from_string_ignoring_errors(var320, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return Values.values(var321, var322);
    }
    
    public static SubLObject f41251() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41126", "S#45183", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41127", "S#45184", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41128", "S#45185", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41129", "S#45186", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41130", "S#45187", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41131", "S#45188", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41132", "S#45189", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41133", "S#45190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41134", "S#45191", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41135", "S#45192", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41136", "S#45182", 1, 0, false);
        new $f41136$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41137", "S#45193", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41138", "S#45194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41139", "S#45195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41140", "S#45196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41141", "S#45197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41142", "S#45198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41143", "S#45199", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41144", "S#45200", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41145", "S#45201", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41146", "S#45202", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41147", "S#45203", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41148", "S#45204", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41149", "S#45205", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41150", "S#45206", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41151", "S#45207", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41152", "S#45208", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41153", "S#45209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41154", "S#45125", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41155", "S#45210", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41156", "S#43993", 2, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41157", "S#45211", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41158", "S#45212", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41159", "S#45213", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41160", "S#45214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41161", "S#45215", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41162", "S#45216", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41163", "S#45217", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41164", "CB-REPAIR-AND-REATTEMPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41165", "S#45064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41166", "S#43763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41168", "S#45124", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41169", "CB-CHANGE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41170", "S#45218", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41172", "CB-HANDLE-CHANGE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41174", "S#45219", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41175", "CB-CHANGE-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41176", "CB-HANDLE-CHANGE-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41177", "S#45220", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41178", "CB-CHANGE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41179", "CB-HANDLE-CHANGE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41180", "S#45221", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41181", "CB-CHANGE-META-ASSERTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41182", "CB-HANDLE-CHANGE-META-ASSERTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41183", "S#45222", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41184", "CB-RENAME-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41185", "CB-HANDLE-RENAME-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41186", "S#45223", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41187", "S#45224", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41189", "S#45225", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41190", "CB-REPROPAGATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41191", "S#45226", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41192", "CB-RECANONICALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41193", "S#45227", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41194", "CB-WFF", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41195", "S#45228", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41196", "CB-HANDLE-WFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41197", "S#45229", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41199", "S#45230", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41200", "CB-ASSERT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41201", "CB-HANDLE-ASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41202", "S#45231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41204", "S#45232", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41188", "S#45008", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41207", "S#45233", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41205", "S#45234", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41171", "S#45235", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41208", "S#45236", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41209", "S#45237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41210", "S#43991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41211", "S#45238", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41198", "S#45123", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41212", "CB-ASSERT-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41213", "S#45239", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41214", "CB-SIMILAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41215", "S#45240", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41216", "CB-ASSERT-META", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41217", "CB-HANDLE-ASSERT-META", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41218", "S#45241", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0674", "f41219", "S#45242");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41220", "CB-EDIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41221", "CB-HANDLE-EDIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41173", "S#45243", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41222", "S#45244", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41223", "CB-HANDLE-EDIT-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41224", "CB-HANDLE-SENTENCE-EDIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41225", "S#45245", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41226", "CB-FIX-TYPO-EDIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41227", "S#45246", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41228", "CB-HANDLE-FIX-TYPO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41167", "S#45247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41229", "CB-REASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41230", "S#45248", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41231", "CB-UNASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41232", "S#45249", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41233", "CB-BLAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41234", "S#45250", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41235", "CB-REMOVE-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41236", "S#45251", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41237", "CB-ASSERTION-TMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41238", "S#45252", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41239", "CB-DIAGNOSE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41240", "S#45253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41241", "S#45254", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41242", "S#45255", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41243", "S#45256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41244", "S#45257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41245", "S#45258", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41246", "CB-USE-IN-PROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41247", "S#45259", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41248", "CB-REINFORCE-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41250", "S#45260", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41249", "S#45261", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41206", "S#45262", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0674", "f41203", "S#45263", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41252() {
        $g5307$ = SubLFiles.defconstant("S#45264", (SubLObject)$ic0$);
        $g5308$ = SubLFiles.defparameter("S#45265", (SubLObject)$ic275$);
        $g5309$ = SubLFiles.defparameter("S#45266", (SubLObject)NIL);
        $g5310$ = SubLFiles.deflexical("S#45267", (SubLObject)$ic152$);
        $g5311$ = SubLFiles.deflexical("S#45268", (SubLObject)$ic174$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41253() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5307$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5307$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic32$));
        Hashtables.sethash((SubLObject)$ic36$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic37$, (SubLObject)NIL));
        module0656.f39840((SubLObject)$ic68$, (SubLObject)$ic84$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic88$);
        Hashtables.sethash((SubLObject)$ic89$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic90$, (SubLObject)NIL));
        Hashtables.sethash((SubLObject)$ic120$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic121$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic134$);
        module0015.f873((SubLObject)$ic142$);
        module0656.f39840((SubLObject)$ic94$, (SubLObject)$ic145$, (SubLObject)THREE_INTEGER);
        Hashtables.sethash((SubLObject)$ic146$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic147$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic160$);
        module0015.f873((SubLObject)$ic164$);
        module0656.f39840((SubLObject)$ic95$, (SubLObject)$ic167$, (SubLObject)THREE_INTEGER);
        Hashtables.sethash((SubLObject)$ic168$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic169$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic182$);
        module0015.f873((SubLObject)$ic185$);
        module0656.f39840((SubLObject)$ic96$, (SubLObject)$ic188$, (SubLObject)THREE_INTEGER);
        Hashtables.sethash((SubLObject)$ic189$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic190$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic196$);
        module0015.f873((SubLObject)$ic197$);
        module0656.f39840((SubLObject)$ic97$, (SubLObject)$ic200$, (SubLObject)THREE_INTEGER);
        Hashtables.sethash((SubLObject)$ic201$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic202$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic217$);
        module0015.f873((SubLObject)$ic225$);
        module0656.f39840((SubLObject)$ic98$, (SubLObject)$ic239$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic243$);
        module0656.f39840((SubLObject)$ic116$, (SubLObject)$ic246$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic251$);
        module0656.f39840((SubLObject)$ic115$, (SubLObject)$ic254$, (SubLObject)THREE_INTEGER);
        Hashtables.sethash((SubLObject)$ic255$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic256$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic262$);
        module0656.f39840((SubLObject)$ic266$, (SubLObject)$ic267$, (SubLObject)ONE_INTEGER);
        module0656.f39819((SubLObject)$ic266$, (SubLObject)$ic263$, (SubLObject)$ic268$, (SubLObject)$ic269$);
        module0015.f873((SubLObject)$ic270$);
        Hashtables.sethash((SubLObject)$ic36$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic37$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic276$);
        module0015.f873((SubLObject)$ic283$);
        Hashtables.sethash((SubLObject)$ic284$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic285$, (SubLObject)NIL));
        module0656.f39840((SubLObject)$ic284$, (SubLObject)$ic288$, (SubLObject)ONE_INTEGER);
        module0656.f39819((SubLObject)$ic284$, (SubLObject)$ic286$, (SubLObject)$ic289$, (SubLObject)$ic290$);
        Hashtables.sethash((SubLObject)$ic291$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic292$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic345$);
        module0656.f39840((SubLObject)$ic349$, (SubLObject)$ic350$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic351$);
        module0656.f39840((SubLObject)$ic99$, (SubLObject)$ic354$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic355$);
        module0015.f873((SubLObject)$ic359$);
        module0656.f39840((SubLObject)$ic100$, (SubLObject)$ic362$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic365$);
        module0015.f873((SubLObject)$ic367$);
        module0656.f39840((SubLObject)$ic102$, (SubLObject)$ic371$, (SubLObject)FOUR_INTEGER);
        module0015.f877((SubLObject)$ic372$, (SubLObject)$ic373$);
        module0015.f873((SubLObject)$ic372$);
        module0015.f873((SubLObject)$ic389$);
        module0015.f873((SubLObject)$ic391$);
        module0656.f39840((SubLObject)$ic101$, (SubLObject)$ic394$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic396$);
        module0015.f873((SubLObject)$ic398$);
        module0656.f39840((SubLObject)$ic103$, (SubLObject)$ic401$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic403$);
        module0656.f39840((SubLObject)$ic104$, (SubLObject)$ic406$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic408$);
        module0656.f39840((SubLObject)$ic105$, (SubLObject)$ic411$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic415$);
        module0656.f39840((SubLObject)$ic418$, (SubLObject)$ic419$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic421$);
        module0656.f39840((SubLObject)$ic113$, (SubLObject)$ic424$, (SubLObject)THREE_INTEGER);
        Hashtables.sethash((SubLObject)$ic425$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic426$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic431$);
        module0656.f39840((SubLObject)$ic434$, (SubLObject)$ic435$, (SubLObject)TWO_INTEGER);
        module0012.f441((SubLObject)$ic436$);
        module0015.f873((SubLObject)$ic440$);
        module0656.f39840((SubLObject)$ic117$, (SubLObject)$ic444$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic446$);
        module0656.f39840((SubLObject)$ic118$, (SubLObject)$ic449$, (SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f41251();
    }
    
    public void initializeVariables() {
        f41252();
    }
    
    public void runTopLevelForms() {
        f41253();
    }
    
    static {
        me = (SubLFile)new module0674();
        $g5307$ = null;
        $g5308$ = null;
        $g5309$ = null;
        $g5310$ = null;
        $g5311$ = null;
        $ic0$ = makeSymbol("S#45181", "CYC");
        $ic1$ = makeSymbol("S#45182", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#13918", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#45269", "CYC"), (SubLObject)makeSymbol("S#45270", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("SENTENCE"), (SubLObject)makeKeyword("MT"), (SubLObject)makeKeyword("STRENGTH"), (SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("UNASSERTS"), (SubLObject)makeKeyword("METAS"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#45193", "CYC"), (SubLObject)makeSymbol("S#45194", "CYC"), (SubLObject)makeSymbol("S#45195", "CYC"), (SubLObject)makeSymbol("S#45196", "CYC"), (SubLObject)makeSymbol("S#45197", "CYC"), (SubLObject)makeSymbol("S#45198", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#45199", "CYC"), (SubLObject)makeSymbol("S#45200", "CYC"), (SubLObject)makeSymbol("S#45201", "CYC"), (SubLObject)makeSymbol("S#45202", "CYC"), (SubLObject)makeSymbol("S#45203", "CYC"), (SubLObject)makeSymbol("S#45204", "CYC"));
        $ic6$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = makeSymbol("S#45192", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#45182", "CYC"));
        $ic9$ = makeSymbol("S#45193", "CYC");
        $ic10$ = makeSymbol("S#45199", "CYC");
        $ic11$ = makeSymbol("S#45194", "CYC");
        $ic12$ = makeSymbol("S#45200", "CYC");
        $ic13$ = makeSymbol("S#45195", "CYC");
        $ic14$ = makeSymbol("S#45201", "CYC");
        $ic15$ = makeSymbol("S#45196", "CYC");
        $ic16$ = makeSymbol("S#45202", "CYC");
        $ic17$ = makeSymbol("S#45197", "CYC");
        $ic18$ = makeSymbol("S#45203", "CYC");
        $ic19$ = makeSymbol("S#45198", "CYC");
        $ic20$ = makeSymbol("S#45204", "CYC");
        $ic21$ = makeKeyword("SENTENCE");
        $ic22$ = makeKeyword("MT");
        $ic23$ = makeKeyword("STRENGTH");
        $ic24$ = makeKeyword("DIRECTION");
        $ic25$ = makeKeyword("UNASSERTS");
        $ic26$ = makeKeyword("METAS");
        $ic27$ = makeString("Invalid slot ~S for construction function");
        $ic28$ = makeKeyword("BEGIN");
        $ic29$ = makeSymbol("S#45205", "CYC");
        $ic30$ = makeKeyword("SLOT");
        $ic31$ = makeKeyword("END");
        $ic32$ = makeSymbol("S#45207", "CYC");
        $ic33$ = makeInteger(2000);
        $ic34$ = makeString("~a operation was added to queue");
        $ic35$ = makeString("~a operation completed");
        $ic36$ = makeKeyword("CB-WFF-CHECK-FORMULA");
        $ic37$ = makeString("cb-wff-check-formula.html");
        $ic38$ = makeSymbol("S#5434", "CYC");
        $ic39$ = makeKeyword("IO-MODE");
        $ic40$ = makeKeyword("NL");
        $ic41$ = makeKeyword("VIOLATIONS");
        $ic42$ = makeString("Sentence not Well-Formed");
        $ic43$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic44$ = makeKeyword("CB-CYC");
        $ic45$ = makeString("stylesheet");
        $ic46$ = makeString("text/css");
        $ic47$ = makeKeyword("SHA1");
        $ic48$ = makeString("text/javascript");
        $ic49$ = makeString("yui-skin-sam");
        $ic50$ = makeString("reloadFrameButton");
        $ic51$ = makeString("button");
        $ic52$ = makeString("reload");
        $ic53$ = makeString("Refresh Frames");
        $ic54$ = makeString("Mt : ");
        $ic55$ = makeString("Sentence : ");
        $ic56$ = makeString("Repairs : ");
        $ic57$ = makeString("No repairs available.  Could not determine any way to make the above sentence well-formed by adding new knowledge.");
        $ic58$ = makeString("Explanation :");
        $ic59$ = makeString("wff-explain");
        $ic60$ = makeString("Stack of pending assertions depending on this one :");
        $ic61$ = makeString("  in ");
        $ic62$ = makeSymbol("S#12274", "CYC");
        $ic63$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic64$ = makeSymbol("ASSERTED-ASSERTION?");
        $ic65$ = makeString("The fact ");
        $ic66$ = makeString(" must be added to ");
        $ic67$ = makeString(" in order for the above sentence to be well-formed.");
        $ic68$ = makeKeyword("REPAIR-AND-REATTEMPT");
        $ic69$ = makeSymbol("ASSERTION-MT");
        $ic70$ = makeSymbol("S#17474", "CYC");
        $ic71$ = makeString("That fact is already asserted in ");
        $ic72$ = makeString(".");
        $ic73$ = makeString("You can repair this by doing either of the following:");
        $ic74$ = makeString("1) Lifting the assertion to ");
        $ic75$ = makeString("2) Asserting it in ");
        $ic76$ = makeString(" as well");
        $ic77$ = makeString("You can repair this by doing the following:");
        $ic78$ = makeString("Asserting it in ");
        $ic79$ = makeString(" must be lifted to ");
        $ic80$ = makeString("It is currently asserted in the following spec Mts:");
        $ic81$ = makeString("[Make this repair and then reattempt]");
        $ic82$ = makeKeyword("SELF");
        $ic83$ = makeString("cb-repair-and-reattempt&~A&~A");
        $ic84$ = makeSymbol("S#45217", "CYC");
        $ic85$ = makeString("the Cyc KB editing facilities");
        $ic86$ = ConsesLow.list((SubLObject)makeSymbol("S#45271", "CYC"), (SubLObject)makeSymbol("S#45272", "CYC"));
        $ic87$ = makeString("Repair and assert operations completed");
        $ic88$ = makeSymbol("CB-REPAIR-AND-REATTEMPT");
        $ic89$ = makeKeyword("CB-AF");
        $ic90$ = makeString("cb-af.html");
        $ic91$ = makeKeyword("SHOW-EL-FORMULA");
        $ic92$ = makeKeyword("WFF-ASSERTION");
        $ic93$ = makeKeyword("FIND-SIMILAR-ASSERTION");
        $ic94$ = makeKeyword("CHANGE-MT");
        $ic95$ = makeKeyword("CHANGE-STRENGTH");
        $ic96$ = makeKeyword("CHANGE-DIRECTION");
        $ic97$ = makeKeyword("CHANGE-META-ASSERTION-MT");
        $ic98$ = makeKeyword("RENAME-VARIABLES");
        $ic99$ = makeKeyword("ASSERT-SIMILAR");
        $ic100$ = makeKeyword("ASSERT-META");
        $ic101$ = makeKeyword("FIX-TYPO");
        $ic102$ = makeKeyword("EDIT-ASSERTION");
        $ic103$ = makeKeyword("REASSERT");
        $ic104$ = makeKeyword("UNASSERT");
        $ic105$ = makeKeyword("BLAST");
        $ic106$ = makeKeyword("ANTECEDENT-QUERY");
        $ic107$ = makeString("[Query Antecedent]");
        $ic108$ = makeKeyword("RULE-KNOWN-EXTENT-QUERY");
        $ic109$ = makeString("[Known Extent]");
        $ic110$ = makeKeyword("RULE-UNKNOWN-EXTENT-QUERY");
        $ic111$ = makeString("[Unknown Extent]");
        $ic112$ = makeKeyword("ASSERTION-SIMILAR-QUERY");
        $ic113$ = makeKeyword("ASSERT-TMS");
        $ic114$ = makeKeyword("JUSTIFY");
        $ic115$ = makeKeyword("RECANONICALIZE");
        $ic116$ = makeKeyword("REPROPAGATE");
        $ic117$ = makeKeyword("USE-IN-PROOF");
        $ic118$ = makeKeyword("REINFORCE-RULE");
        $ic119$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceRelatedBookkeepingPredicate"));
        $ic120$ = makeKeyword("CB-CHANGE-MT");
        $ic121$ = makeString("cb-change-mt.html");
        $ic122$ = makeString("the Change Assertion Mt page");
        $ic123$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"));
        $ic124$ = makeString("Change Assertion Mt");
        $ic125$ = makeString("post");
        $ic126$ = makeString("cb-handle-change-mt");
        $ic127$ = makeString("id");
        $ic128$ = makeKeyword("RED");
        $ic129$ = makeString("Note : This assertion has meta-assertions");
        $ic130$ = ConsesLow.list((SubLObject)makeKeyword("ANYTIME-PSC-ALLOWED?"), (SubLObject)NIL);
        $ic131$ = makeString("Abort Edit");
        $ic132$ = makeString("Current Value");
        $ic133$ = makeString("Change Mt");
        $ic134$ = makeSymbol("CB-CHANGE-MT");
        $ic135$ = makeString("To change Mt of all meta-assertions use ");
        $ic136$ = makeString("move-all-meta-assertions");
        $ic137$ = makeString("t");
        $ic138$ = makeString("Change the Mt of all meta-assertions to the new Mt");
        $ic139$ = makeString("change microtheory");
        $ic140$ = makeString("Assertion is already in ~S");
        $ic141$ = makeString("preserve_");
        $ic142$ = makeSymbol("CB-HANDLE-CHANGE-MT");
        $ic143$ = makeString("[Change Mt]");
        $ic144$ = makeString("cb-change-mt&~a");
        $ic145$ = makeSymbol("S#45219", "CYC");
        $ic146$ = makeKeyword("CB-CHANGE-STRENGTH");
        $ic147$ = makeString("cb-change-strength.html");
        $ic148$ = makeString("the Change Assertion Strength page");
        $ic149$ = makeString("Change Assertion Strength");
        $ic150$ = makeString("cb-handle-change-strength");
        $ic151$ = makeString("Choose a new truth strength :");
        $ic152$ = makeString("strength");
        $ic153$ = makeString(":default");
        $ic154$ = makeKeyword("DEFAULT");
        $ic155$ = makeString("Default");
        $ic156$ = makeString(":monotonic");
        $ic157$ = makeKeyword("MONOTONIC");
        $ic158$ = makeString("Monotonic");
        $ic159$ = makeString("Change Strength");
        $ic160$ = makeSymbol("CB-CHANGE-STRENGTH");
        $ic161$ = makeString("change strength");
        $ic162$ = ConsesLow.list((SubLObject)makeKeyword("DEFAULT"), (SubLObject)makeKeyword("MONOTONIC"));
        $ic163$ = makeString("~a was not a microtheory");
        $ic164$ = makeSymbol("CB-HANDLE-CHANGE-STRENGTH");
        $ic165$ = makeString("[Change Strength]");
        $ic166$ = makeString("cb-change-strength&~a");
        $ic167$ = makeSymbol("S#45220", "CYC");
        $ic168$ = makeKeyword("CB-CHANGE-DIRECTION");
        $ic169$ = makeString("cb-change-direction.html");
        $ic170$ = makeString("the Change Assertion Direction page");
        $ic171$ = makeString("Change Assertion Direction");
        $ic172$ = makeString("cb-handle-change-direction");
        $ic173$ = makeString("Choose a direction :");
        $ic174$ = makeString("direction");
        $ic175$ = makeString(":backward");
        $ic176$ = makeKeyword("BACKWARD");
        $ic177$ = makeString("Backward");
        $ic178$ = makeString(":forward");
        $ic179$ = makeKeyword("FORWARD");
        $ic180$ = makeString("Forward");
        $ic181$ = makeString("Change Direction");
        $ic182$ = makeSymbol("CB-CHANGE-DIRECTION");
        $ic183$ = makeString("direction changes");
        $ic184$ = makeString("~a does not specify a valid direction");
        $ic185$ = makeSymbol("CB-HANDLE-CHANGE-DIRECTION");
        $ic186$ = makeString("[Change Direction]");
        $ic187$ = makeString("cb-change-direction&~a");
        $ic188$ = makeSymbol("S#45221", "CYC");
        $ic189$ = makeKeyword("CB-CHANGE-META-ASSERTION-MT");
        $ic190$ = makeString("cb-change-meta-assertion-mt.html");
        $ic191$ = makeString("Change Meta Assertions Mt");
        $ic192$ = makeString("cb-handle-change-meta-assertion-mt");
        $ic193$ = makeString("Change the Mt of Meta-Assertions of the assertion : ");
        $ic194$ = makeString("change_meta_");
        $ic195$ = makeString("Choose the meta assertions :");
        $ic196$ = makeSymbol("CB-CHANGE-META-ASSERTION-MT");
        $ic197$ = makeSymbol("CB-HANDLE-CHANGE-META-ASSERTION-MT");
        $ic198$ = makeString("[Change Meta Assertions Mt]");
        $ic199$ = makeString("cb-change-meta-assertion-mt&~a");
        $ic200$ = makeSymbol("S#45222", "CYC");
        $ic201$ = makeKeyword("CB-RENAME-VARIABLES");
        $ic202$ = makeString("cb-rename-variables.html");
        $ic203$ = makeString("the facility to rename variables");
        $ic204$ = makeString("Rename Assertion Variables");
        $ic205$ = makeString("cb-handle-rename-variables");
        $ic206$ = makeString("Rename the variables of the assertion : ");
        $ic207$ = makeString("Note: ");
        $ic208$ = makeString("Variables listed in ");
        $ic209$ = makeString("red");
        $ic210$ = makeString(" have invalid variable names.  Valid variables must satisfy the regular expression ");
        $ic211$ = makeKeyword("LEFT");
        $ic212$ = makeKeyword("TOP");
        $ic213$ = makeString("Current Variable");
        $ic214$ = makeString("Changed Variable");
        $ic215$ = makeString("Rename Variables");
        $ic216$ = makeString("rename");
        $ic217$ = makeSymbol("CB-RENAME-VARIABLES");
        $ic218$ = makeString("No variables were specified to be renamed.");
        $ic219$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("S#45273", "CYC"));
        $ic220$ = makeString("The proposed rename may change the logical intent of the assertion, and would require unasserting and reasserting it.  Do you want to continue?");
        $ic221$ = makeString("Yes");
        $ic222$ = makeString("continue");
        $ic223$ = makeString("No");
        $ic224$ = makeKeyword("EDIT");
        $ic225$ = makeSymbol("CB-HANDLE-RENAME-VARIABLES");
        $ic226$ = ConsesLow.list((SubLObject)makeSymbol("S#15462", "CYC"), (SubLObject)makeSymbol("S#45274", "CYC"));
        $ic227$ = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_tab, (SubLObject)Characters.CHAR_newline);
        $ic228$ = makeString("?");
        $ic229$ = makeString("");
        $ic230$ = makeString("Invalid Variables");
        $ic231$ = makeString("Back");
        $ic232$ = makeString("The following variables have invalid variable names");
        $ic233$ = makeSymbol("S#3851", "CYC");
        $ic234$ = makeString(", ");
        $ic235$ = makeString(", and ");
        $ic236$ = makeString("Valid variables must satisfy the regular expression ");
        $ic237$ = makeString("[Rename Variables]");
        $ic238$ = makeString("cb-rename-variables&~a");
        $ic239$ = makeSymbol("S#45225", "CYC");
        $ic240$ = makeString("the facility to repropagate forward inference on an assertion");
        $ic241$ = makeString("Forward Assertion Repropagation");
        $ic242$ = makeString("~a does not specify an assertion");
        $ic243$ = makeSymbol("CB-REPROPAGATE");
        $ic244$ = makeString("[Repropagate]");
        $ic245$ = makeString("cb-repropagate&~a");
        $ic246$ = makeSymbol("S#45226", "CYC");
        $ic247$ = makeString("the facility to recanonicalize an assertion");
        $ic248$ = makeString("~S did not specify an assertion.");
        $ic249$ = makeString("Assertion is already canonical");
        $ic250$ = makeString("Recanonicalize Assertion");
        $ic251$ = makeSymbol("CB-RECANONICALIZE");
        $ic252$ = makeString("[Recanonicalize]");
        $ic253$ = makeString("cb-recanonicalize&~a");
        $ic254$ = makeSymbol("S#45227", "CYC");
        $ic255$ = makeKeyword("CB-WFF");
        $ic256$ = makeString("cb-wff.html");
        $ic257$ = makeString("WFF-Check Sentence");
        $ic258$ = makeString("cb-handle-wff");
        $ic259$ = makeString("Clear");
        $ic260$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic261$ = ConsesLow.list(new SubLObject[] { makeKeyword("INPUT-NAME"), makeString("sentence"), makeKeyword("COMPLETE-LABEL"), makeString("Complete"), makeKeyword("CYCLIFY-LABEL"), makeString("Cyclify"), makeKeyword("CLEAR-LABEL"), makeString("Clear Sentence"), makeKeyword("HEIGHT"), TWENTY_INTEGER, makeKeyword("WIDTH"), makeInteger(80) });
        $ic262$ = makeSymbol("CB-WFF");
        $ic263$ = makeString("WFF Check");
        $ic264$ = makeKeyword("MAIN");
        $ic265$ = makeString("cb-wff");
        $ic266$ = makeKeyword("WFF");
        $ic267$ = makeSymbol("S#45228", "CYC");
        $ic268$ = makeString("WFF");
        $ic269$ = makeString("Check a CycL Expression for well-formedness");
        $ic270$ = makeSymbol("CB-HANDLE-WFF");
        $ic271$ = ConsesLow.list((SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeString("sentence"));
        $ic272$ = makeString("Sentence is Well Formed");
        $ic273$ = makeString("WFF-Status : ");
        $ic274$ = makeString("OK");
        $ic275$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("DEFAULT"), (SubLObject)makeString("cb-handle-assert"), (SubLObject)makeString("Assert Sentence"), (SubLObject)makeString("Assert Sentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("SIMILAR"), (SubLObject)makeString("cb-handle-assert"), (SubLObject)makeString("Assert Similar Sentence"), (SubLObject)makeString("Assert Sentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("EDIT"), (SubLObject)makeString("cb-handle-edit"), (SubLObject)makeString("Edit Assertion"), (SubLObject)makeString("Perform Edit")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("EDIT-SENTENCE"), (SubLObject)makeString("cb-handle-sentence-edit"), (SubLObject)makeString("Edit Sentence"), (SubLObject)makeString("Perform Edit")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FIX-TYPO"), (SubLObject)makeString("cb-handle-fix-typo"), (SubLObject)makeString("Fix Assertion"), (SubLObject)makeString("Perform Fix")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("META"), (SubLObject)makeString("cb-handle-assert-meta"), (SubLObject)makeString("Assert Meta Assertion"), (SubLObject)makeString("Assert Sentence")));
        $ic276$ = makeSymbol("CB-ASSERT");
        $ic277$ = makeString("assertions");
        $ic278$ = makeString("wff-check");
        $ic279$ = makeString("assertion-queue");
        $ic280$ = makeKeyword("BROWSE");
        $ic281$ = makeKeyword("NOW");
        $ic282$ = makeString("EL Sentence Assert");
        $ic283$ = makeSymbol("CB-HANDLE-ASSERT");
        $ic284$ = makeKeyword("ASSERT");
        $ic285$ = makeString("assert-tool.gif");
        $ic286$ = makeString("Assert");
        $ic287$ = makeString("cb-assert");
        $ic288$ = makeSymbol("S#45232", "CYC");
        $ic289$ = makeString("Asrt");
        $ic290$ = makeString("Assert CycL Expression");
        $ic291$ = makeKeyword("CB-ASSERT-INTERNAL");
        $ic292$ = makeString("cb-assert-internal.html");
        $ic293$ = makeString("Fatal Error");
        $ic294$ = makeString("cb-assert called without a valid mode");
        $ic295$ = ConsesLow.list((SubLObject)makeSymbol("KEYWORD"), (SubLObject)makeSymbol("S#1755", "CYC"), (SubLObject)makeSymbol("S#1523", "CYC"), (SubLObject)makeSymbol("S#45275", "CYC"));
        $ic296$ = makeKeyword("META");
        $ic297$ = makeString("Please use ");
        $ic298$ = makeString(" to refer to the following assertion :");
        $ic299$ = makeString("Reset All Fields");
        $ic300$ = makeString("assert");
        $ic301$ = makeKeyword("SIMILAR");
        $ic302$ = makeString(":local");
        $ic303$ = makeKeyword("LOCAL");
        $ic304$ = makeString("Assert using Local queue");
        $ic305$ = makeString(":now");
        $ic306$ = makeString("Assert now, bypassing Local queue");
        $ic307$ = makeString("cb-assert-parameters");
        $ic308$ = makeString("Show");
        $ic309$ = makeString("Hide");
        $ic310$ = makeString("Assert Context");
        $ic311$ = makeKeyword("INVISIBLE");
        $ic312$ = makeKeyword("PARAGRAPH");
        $ic313$ = makeKeyword("EDIT-ONLY");
        $ic314$ = makeKeyword("EDIT-ALLOWED?");
        $ic315$ = makeKeyword("MONAD-CHOICES");
        $ic316$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt")));
        $ic317$ = makeKeyword("ANYTIME-PSC-ALLOWED?");
        $ic318$ = makeKeyword("INPUT-NAME");
        $ic319$ = makeString("sentence");
        $ic320$ = makeKeyword("COMPLETE-LABEL");
        $ic321$ = makeString("Complete");
        $ic322$ = makeKeyword("CYCLIFY-LABEL");
        $ic323$ = makeString("Cyclify");
        $ic324$ = makeKeyword("CLEAR-LABEL");
        $ic325$ = makeString("Clear Sentence");
        $ic326$ = makeKeyword("HEIGHT");
        $ic327$ = makeKeyword("WIDTH");
        $ic328$ = makeInteger(80);
        $ic329$ = makeKeyword("MODE");
        $ic330$ = makeKeyword("CHOICES");
        $ic331$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheAssertionSentence")), constant_handles_oc.f8479((SubLObject)makeString("exceptWhen")), constant_handles_oc.f8479((SubLObject)makeString("pragmaticRequirement")), constant_handles_oc.f8479((SubLObject)makeString("salientAssertions")));
        $ic332$ = makeString("cb-handle-fix-typo");
        $ic333$ = makeString("cb-handle-edit");
        $ic334$ = makeString("cb-handle-sentence-edit");
        $ic335$ = makeString("Choose analogous meta-assertions to assert :");
        $ic336$ = makeString("~a~S");
        $ic337$ = constant_handles_oc.f8479((SubLObject)makeString("TheAssertionSentence"));
        $ic338$ = makeSymbol("STRINGP");
        $ic339$ = makeString("~S did not specify a microtheory.");
        $ic340$ = makeString("~S is not a microtheory.");
        $ic341$ = constant_handles_oc.f8479((SubLObject)makeString("Microtheory"));
        $ic342$ = makeString("Bad sentence, probably due to a misspelling.~%Check these inputs:~%~%~S");
        $ic343$ = ConsesLow.list((SubLObject)makeSymbol("S#45276", "CYC"), (SubLObject)makeSymbol("S#45277", "CYC"));
        $ic344$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic345$ = makeSymbol("CB-ASSERT-FORMULA");
        $ic346$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic347$ = makeString("[Assert Formula]");
        $ic348$ = makeString("cb-assert-formula&~A&~A");
        $ic349$ = makeKeyword("ASSERT-FORMULA");
        $ic350$ = makeSymbol("S#45239", "CYC");
        $ic351$ = makeSymbol("CB-SIMILAR");
        $ic352$ = makeString("[Assert Similar]");
        $ic353$ = makeString("cb-similar&~a");
        $ic354$ = makeSymbol("S#45240", "CYC");
        $ic355$ = makeSymbol("CB-ASSERT-META");
        $ic356$ = makeString("editing");
        $ic357$ = makeString("The sentence did not mention ~S.");
        $ic358$ = makeString("EL Meta Sentence Assert");
        $ic359$ = makeSymbol("CB-HANDLE-ASSERT-META");
        $ic360$ = makeString("[Assert Meta]");
        $ic361$ = makeString("cb-assert-meta&~a");
        $ic362$ = makeSymbol("S#45241", "CYC");
        $ic363$ = makeSymbol("CLET");
        $ic364$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11889", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11891", "CYC"), (SubLObject)NIL));
        $ic365$ = makeSymbol("CB-EDIT");
        $ic366$ = makeString("Assertion Edit");
        $ic367$ = makeSymbol("CB-HANDLE-EDIT");
        $ic368$ = ConsesLow.list((SubLObject)makeSymbol("S#44050", "CYC"), (SubLObject)makeSymbol("S#45278", "CYC"));
        $ic369$ = makeString("[Edit]");
        $ic370$ = makeString("cb-edit&~a");
        $ic371$ = makeSymbol("S#45244", "CYC");
        $ic372$ = makeSymbol("CB-HANDLE-EDIT-ASSERTION");
        $ic373$ = makeString("text/xml");
        $ic374$ = makeString("error");
        $ic375$ = makeString("~S");
        $ic376$ = makeString("assertion editing facilities");
        $ic377$ = makeSymbol("S#5859", "CYC");
        $ic378$ = makeString("oldAssertionId");
        $ic379$ = makeKeyword("SENTENCE-NUM");
        $ic380$ = makeString("response");
        $ic381$ = makeString("invalidSentence");
        $ic382$ = makeString("count");
        $ic383$ = makeString("assertionsQueued");
        $ic384$ = makeString("~A assertion~P added to the local queue.");
        $ic385$ = ConsesLow.list((SubLObject)makeString("count"), (SubLObject)makeString("1"));
        $ic386$ = makeString("unassertedQueued");
        $ic387$ = makeString("~A unassert~:P added to the local queue.");
        $ic388$ = makeString("~S did not specify a CycL sentence eligible for editing.");
        $ic389$ = makeSymbol("CB-HANDLE-SENTENCE-EDIT");
        $ic390$ = makeString("the Cyc KB typo fixing facilities");
        $ic391$ = makeSymbol("CB-FIX-TYPO-EDIT");
        $ic392$ = makeString("[Fix Typo]");
        $ic393$ = makeString("cb-fix-typo-edit&~a");
        $ic394$ = makeSymbol("S#45246", "CYC");
        $ic395$ = makeString("Edited sentence does not differ only in strings.");
        $ic396$ = makeSymbol("CB-HANDLE-FIX-TYPO");
        $ic397$ = makeString("Reassert");
        $ic398$ = makeSymbol("CB-REASSERT");
        $ic399$ = makeString("[Reassert]");
        $ic400$ = makeString("cb-reassert&~a");
        $ic401$ = makeSymbol("S#45248", "CYC");
        $ic402$ = makeString("Unassert");
        $ic403$ = makeSymbol("CB-UNASSERT");
        $ic404$ = makeString("[Unassert]");
        $ic405$ = makeString("cb-unassert&~a");
        $ic406$ = makeSymbol("S#45249", "CYC");
        $ic407$ = makeString("Assertion Blast");
        $ic408$ = makeSymbol("CB-BLAST");
        $ic409$ = makeString("[Blast]");
        $ic410$ = makeString("cb-blast&~a");
        $ic411$ = makeSymbol("S#45250", "CYC");
        $ic412$ = ConsesLow.list((SubLObject)makeSymbol("S#38900", "CYC"));
        $ic413$ = makeString("~a does not specify a deduction");
        $ic414$ = makeString("Deduction Removal");
        $ic415$ = makeSymbol("CB-REMOVE-DEDUCTION");
        $ic416$ = makeString("[Remove Deduction]");
        $ic417$ = makeString("cb-remove-deduction&~a");
        $ic418$ = makeKeyword("REMOVE-DEDUCTION");
        $ic419$ = makeSymbol("S#45251", "CYC");
        $ic420$ = makeString("Redo TMS for Assertion");
        $ic421$ = makeSymbol("CB-ASSERTION-TMS");
        $ic422$ = makeString("[Redo TMS]");
        $ic423$ = makeString("cb-assertion-tms&~a");
        $ic424$ = makeSymbol("S#45252", "CYC");
        $ic425$ = makeKeyword("CB-DIAGNOSE-ASSERTION");
        $ic426$ = makeString("cb-diagnose-assertion.html");
        $ic427$ = makeString("the Assertion Diagnostics page");
        $ic428$ = makeString("~a does not specify a Cyc assertion");
        $ic429$ = makeString("Assertion Diagnostics");
        $ic430$ = makeString("Diagnosis of :");
        $ic431$ = makeSymbol("CB-DIAGNOSE-ASSERTION");
        $ic432$ = makeString("[Run Diagnostics]");
        $ic433$ = makeString("cb-diagnose-assertion&~A");
        $ic434$ = makeKeyword("DIAGNOSE-ASSERTION");
        $ic435$ = makeSymbol("S#45254", "CYC");
        $ic436$ = makeSymbol("S#45266", "CYC");
        $ic437$ = makeSymbol("S#14110", "CYC");
        $ic438$ = makeString("Assertion specified was not a rule");
        $ic439$ = makeString("Rule has been added to proof checker rule set.");
        $ic440$ = makeSymbol("CB-USE-IN-PROOF");
        $ic441$ = makeSymbol("ASSERTION-P");
        $ic442$ = makeString("[Use in Proof]");
        $ic443$ = makeString("cb-use-in-proof&~a");
        $ic444$ = makeSymbol("S#45259", "CYC");
        $ic445$ = makeString("~a does not specify a rule");
        $ic446$ = makeSymbol("CB-REINFORCE-RULE");
        $ic447$ = makeString("[Reinforce]");
        $ic448$ = makeString("cb-reinforce-rule&~a");
        $ic449$ = makeSymbol("S#45260", "CYC");
        $ic450$ = makeInteger(100);
        $ic451$ = makeKeyword("STRENGTH-INPUT-NAME");
        $ic452$ = makeKeyword("DIRECTION-INPUT-NAME");
        $ic453$ = makeString("Strength :");
        $ic454$ = makeKeyword("NBSP");
        $ic455$ = makeString(":default-strength");
        $ic456$ = makeString(":monotonic-strength");
        $ic457$ = makeString("Direction :");
    }
    
    public static final class $sX45181_native extends SubLStructNative
    {
        public SubLObject $sentence;
        public SubLObject $mt;
        public SubLObject $strength;
        public SubLObject $direction;
        public SubLObject $unasserts;
        public SubLObject $metas;
        private static final SubLStructDeclNative structDecl;
        
        public $sX45181_native() {
            this.$sentence = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$strength = (SubLObject)CommonSymbols.NIL;
            this.$direction = (SubLObject)CommonSymbols.NIL;
            this.$unasserts = (SubLObject)CommonSymbols.NIL;
            this.$metas = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX45181_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$sentence;
        }
        
        public SubLObject getField3() {
            return this.$mt;
        }
        
        public SubLObject getField4() {
            return this.$strength;
        }
        
        public SubLObject getField5() {
            return this.$direction;
        }
        
        public SubLObject getField6() {
            return this.$unasserts;
        }
        
        public SubLObject getField7() {
            return this.$metas;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$sentence = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$strength = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$direction = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$unasserts = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$metas = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX45181_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$sentence", "$mt", "$strength", "$direction", "$unasserts", "$metas" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f41136$UnaryFunction extends UnaryFunction
    {
        public $f41136$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#45182"));
        }
        
        public SubLObject processItem(final SubLObject var11) {
            return f41136(var11);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2860 ms
	
	Decompiled with Procyon 0.5.32.
*/