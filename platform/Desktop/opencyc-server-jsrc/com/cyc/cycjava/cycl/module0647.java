package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0647 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0647";
    public static final String myFingerPrint = "47a7167cd3996dc22c513723a21394a910b4d833e78bda469c5777fc7b47e65a";
    public static SubLSymbol $g5031$;
    private static SubLSymbol $g5032$;
    public static SubLSymbol $g5033$;
    private static SubLSymbol $g5034$;
    public static SubLSymbol $g5035$;
    private static SubLSymbol $g5036$;
    private static SubLSymbol $g5037$;
    public static SubLSymbol $g5038$;
    private static SubLSymbol $g5039$;
    private static SubLSymbol $g5040$;
    private static SubLSymbol $g5041$;
    private static SubLSymbol $g5042$;
    private static SubLSymbol $g5043$;
    private static SubLSymbol $g5044$;
    private static SubLSymbol $g5045$;
    private static SubLSymbol $g5046$;
    private static SubLSymbol $g5047$;
    private static SubLSymbol $g5048$;
    public static SubLSymbol $g5049$;
    private static SubLSymbol $g5050$;
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
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLList $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
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
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLList $ic98$;
    private static final SubLList $ic99$;
    private static final SubLList $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLString $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLList $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLList $ic151$;
    private static final SubLList $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLString $ic174$;
    private static final SubLList $ic175$;
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLString $ic181$;
    private static final SubLString $ic182$;
    private static final SubLString $ic183$;
    private static final SubLString $ic184$;
    private static final SubLString $ic185$;
    private static final SubLString $ic186$;
    private static final SubLString $ic187$;
    private static final SubLString $ic188$;
    private static final SubLString $ic189$;
    private static final SubLString $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLString $ic193$;
    private static final SubLObject $ic194$;
    private static final SubLObject $ic195$;
    private static final SubLString $ic196$;
    private static final SubLString $ic197$;
    private static final SubLString $ic198$;
    private static final SubLString $ic199$;
    private static final SubLString $ic200$;
    private static final SubLString $ic201$;
    private static final SubLString $ic202$;
    private static final SubLString $ic203$;
    private static final SubLString $ic204$;
    private static final SubLString $ic205$;
    private static final SubLString $ic206$;
    private static final SubLString $ic207$;
    private static final SubLString $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLString $ic213$;
    private static final SubLString $ic214$;
    private static final SubLString $ic215$;
    private static final SubLString $ic216$;
    private static final SubLString $ic217$;
    private static final SubLString $ic218$;
    private static final SubLString $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLString $ic221$;
    private static final SubLString $ic222$;
    private static final SubLString $ic223$;
    private static final SubLString $ic224$;
    private static final SubLString $ic225$;
    private static final SubLString $ic226$;
    private static final SubLList $ic227$;
    private static final SubLString $ic228$;
    private static final SubLString $ic229$;
    private static final SubLString $ic230$;
    private static final SubLString $ic231$;
    private static final SubLString $ic232$;
    private static final SubLString $ic233$;
    private static final SubLString $ic234$;
    private static final SubLSymbol $ic235$;
    private static final SubLString $ic236$;
    private static final SubLString $ic237$;
    private static final SubLString $ic238$;
    private static final SubLString $ic239$;
    private static final SubLString $ic240$;
    private static final SubLString $ic241$;
    private static final SubLString $ic242$;
    private static final SubLString $ic243$;
    private static final SubLString $ic244$;
    private static final SubLString $ic245$;
    private static final SubLString $ic246$;
    private static final SubLString $ic247$;
    private static final SubLString $ic248$;
    private static final SubLString $ic249$;
    private static final SubLString $ic250$;
    private static final SubLString $ic251$;
    private static final SubLString $ic252$;
    private static final SubLString $ic253$;
    private static final SubLString $ic254$;
    private static final SubLString $ic255$;
    private static final SubLString $ic256$;
    private static final SubLString $ic257$;
    private static final SubLString $ic258$;
    private static final SubLString $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLString $ic261$;
    private static final SubLString $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLString $ic264$;
    private static final SubLObject $ic265$;
    private static final SubLList $ic266$;
    private static final SubLList $ic267$;
    private static final SubLList $ic268$;
    private static final SubLList $ic269$;
    private static final SubLList $ic270$;
    private static final SubLSymbol $ic271$;
    private static final SubLSymbol $ic272$;
    private static final SubLSymbol $ic273$;
    private static final SubLString $ic274$;
    private static final SubLList $ic275$;
    private static final SubLObject $ic276$;
    private static final SubLObject $ic277$;
    private static final SubLObject $ic278$;
    private static final SubLObject $ic279$;
    private static final SubLObject $ic280$;
    private static final SubLObject $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLList $ic284$;
    private static final SubLObject $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLList $ic287$;
    private static final SubLObject $ic288$;
    private static final SubLList $ic289$;
    private static final SubLObject $ic290$;
    private static final SubLList $ic291$;
    private static final SubLObject $ic292$;
    private static final SubLObject $ic293$;
    private static final SubLSymbol $ic294$;
    private static final SubLObject $ic295$;
    private static final SubLObject $ic296$;
    private static final SubLSymbol $ic297$;
    private static final SubLSymbol $ic298$;
    private static final SubLSymbol $ic299$;
    private static final SubLSymbol $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLSymbol $ic303$;
    private static final SubLObject $ic304$;
    private static final SubLObject $ic305$;
    private static final SubLObject $ic306$;
    private static final SubLList $ic307$;
    private static final SubLObject $ic308$;
    private static final SubLList $ic309$;
    private static final SubLObject $ic310$;
    private static final SubLSymbol $ic311$;
    private static final SubLObject $ic312$;
    private static final SubLObject $ic313$;
    private static final SubLObject $ic314$;
    private static final SubLList $ic315$;
    private static final SubLObject $ic316$;
    private static final SubLObject $ic317$;
    private static final SubLObject $ic318$;
    private static final SubLSymbol $ic319$;
    private static final SubLSymbol $ic320$;
    private static final SubLSymbol $ic321$;
    private static final SubLList $ic322$;
    private static final SubLString $ic323$;
    private static final SubLList $ic324$;
    private static final SubLSymbol $ic325$;
    private static final SubLSymbol $ic326$;
    private static final SubLList $ic327$;
    private static final SubLObject $ic328$;
    private static final SubLList $ic329$;
    private static final SubLList $ic330$;
    private static final SubLObject $ic331$;
    private static final SubLList $ic332$;
    private static final SubLObject $ic333$;
    private static final SubLSymbol $ic334$;
    private static final SubLSymbol $ic335$;
    private static final SubLSymbol $ic336$;
    private static final SubLString $ic337$;
    private static final SubLString $ic338$;
    private static final SubLObject $ic339$;
    private static final SubLObject $ic340$;
    private static final SubLSymbol $ic341$;
    private static final SubLObject $ic342$;
    private static final SubLObject $ic343$;
    private static final SubLSymbol $ic344$;
    private static final SubLSymbol $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLList $ic347$;
    private static final SubLSymbol $ic348$;
    private static final SubLSymbol $ic349$;
    private static final SubLSymbol $ic350$;
    private static final SubLSymbol $ic351$;
    private static final SubLObject $ic352$;
    private static final SubLList $ic353$;
    private static final SubLList $ic354$;
    private static final SubLObject $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLObject $ic357$;
    private static final SubLObject $ic358$;
    private static final SubLObject $ic359$;
    private static final SubLObject $ic360$;
    private static final SubLObject $ic361$;
    private static final SubLObject $ic362$;
    private static final SubLSymbol $ic363$;
    private static final SubLList $ic364$;
    private static final SubLString $ic365$;
    private static final SubLString $ic366$;
    private static final SubLString $ic367$;
    private static final SubLString $ic368$;
    private static final SubLString $ic369$;
    private static final SubLList $ic370$;
    private static final SubLString $ic371$;
    private static final SubLString $ic372$;
    private static final SubLList $ic373$;
    private static final SubLString $ic374$;
    private static final SubLString $ic375$;
    private static final SubLString $ic376$;
    private static final SubLString $ic377$;
    private static final SubLSymbol $ic378$;
    private static final SubLString $ic379$;
    private static final SubLString $ic380$;
    private static final SubLString $ic381$;
    private static final SubLString $ic382$;
    private static final SubLString $ic383$;
    private static final SubLString $ic384$;
    private static final SubLList $ic385$;
    private static final SubLString $ic386$;
    private static final SubLString $ic387$;
    private static final SubLString $ic388$;
    private static final SubLString $ic389$;
    private static final SubLString $ic390$;
    private static final SubLList $ic391$;
    private static final SubLSymbol $ic392$;
    private static final SubLList $ic393$;
    private static final SubLList $ic394$;
    private static final SubLSymbol $ic395$;
    private static final SubLObject $ic396$;
    private static final SubLList $ic397$;
    private static final SubLString $ic398$;
    private static final SubLString $ic399$;
    private static final SubLSymbol $ic400$;
    private static final SubLSymbol $ic401$;
    private static final SubLObject $ic402$;
    private static final SubLSymbol $ic403$;
    private static final SubLList $ic404$;
    private static final SubLSymbol $ic405$;
    private static final SubLObject $ic406$;
    private static final SubLObject $ic407$;
    private static final SubLObject $ic408$;
    private static final SubLSymbol $ic409$;
    private static final SubLSymbol $ic410$;
    private static final SubLSymbol $ic411$;
    private static final SubLSymbol $ic412$;
    private static final SubLSymbol $ic413$;
    private static final SubLFloat $ic414$;
    private static final SubLSymbol $ic415$;
    private static final SubLSymbol $ic416$;
    private static final SubLSymbol $ic417$;
    private static final SubLSymbol $ic418$;
    private static final SubLObject $ic419$;
    private static final SubLList $ic420$;
    private static final SubLSymbol $ic421$;
    private static final SubLSymbol $ic422$;
    private static final SubLSymbol $ic423$;
    private static final SubLSymbol $ic424$;
    private static final SubLSymbol $ic425$;
    private static final SubLObject $ic426$;
    private static final SubLObject $ic427$;
    private static final SubLList $ic428$;
    private static final SubLSymbol $ic429$;
    private static final SubLList $ic430$;
    private static final SubLObject $ic431$;
    private static final SubLObject $ic432$;
    private static final SubLObject $ic433$;
    private static final SubLList $ic434$;
    private static final SubLObject $ic435$;
    private static final SubLObject $ic436$;
    private static final SubLObject $ic437$;
    private static final SubLObject $ic438$;
    private static final SubLObject $ic439$;
    private static final SubLSymbol $ic440$;
    private static final SubLList $ic441$;
    private static final SubLObject $ic442$;
    
    
    public static SubLObject f39237(final SubLObject var1, final SubLObject var2) {
        f39238(var1, var2, (SubLObject)module0647.ZERO_INTEGER);
        return (SubLObject)module0647.NIL;
    }
    
    public static SubLObject f39239(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX43015_native.class) ? module0647.T : module0647.NIL);
    }
    
    public static SubLObject f39240(final SubLObject var1) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f39241(final SubLObject var1) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f39242(final SubLObject var1) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f39243(final SubLObject var1) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f39244(final SubLObject var1) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f39245(final SubLObject var1) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f39246(final SubLObject var1) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f39247(final SubLObject var1) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f39248(final SubLObject var1) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f39249(final SubLObject var1) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f39250(final SubLObject var1) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f39251(final SubLObject var1) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f39252(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f39253(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f39254(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f39255(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f39256(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f39257(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f39258(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f39259(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f39260(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f39261(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f39262(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f39263(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39239(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f39264(SubLObject var5) {
        if (var5 == module0647.UNPROVIDED) {
            var5 = (SubLObject)module0647.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX43015_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0647.NIL, var7 = var5; module0647.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0647.$ic33$)) {
                f39252(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic34$)) {
                f39253(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic35$)) {
                f39254(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic36$)) {
                f39255(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic37$)) {
                f39256(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic38$)) {
                f39257(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic39$)) {
                f39258(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic40$)) {
                f39259(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic41$)) {
                f39260(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic42$)) {
                f39261(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic43$)) {
                f39262(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic44$)) {
                f39263(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0647.$ic45$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f39265(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic46$, (SubLObject)module0647.$ic47$, (SubLObject)module0647.TWELVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic33$, f39240(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic34$, f39241(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic35$, f39242(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic36$, f39243(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic37$, f39244(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic38$, f39245(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic39$, f39246(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic40$, f39247(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic41$, f39248(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic42$, f39249(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic43$, f39250(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic44$, f39251(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic49$, (SubLObject)module0647.$ic47$, (SubLObject)module0647.TWELVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f39266(final SubLObject var11, final SubLObject var12) {
        return f39265(var11, var12);
    }
    
    public static SubLObject f39267(final SubLObject var1, final SubLObject var2) {
        f39268(var1, var2, (SubLObject)module0647.ZERO_INTEGER);
        return (SubLObject)module0647.NIL;
    }
    
    public static SubLObject f39269(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX43017_native.class) ? module0647.T : module0647.NIL);
    }
    
    public static SubLObject f39270(final SubLObject var1) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f39271(final SubLObject var1) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f39272(final SubLObject var1) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f39273(final SubLObject var1) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f39274(final SubLObject var1) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f39275(final SubLObject var1) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f39276(final SubLObject var1) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f39277(final SubLObject var1) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f39278(final SubLObject var1) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f39279(final SubLObject var1) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f39280(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f39281(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f39282(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f39283(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f39284(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f39285(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f39286(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f39287(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f39288(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f39289(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39269(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f39290(SubLObject var5) {
        if (var5 == module0647.UNPROVIDED) {
            var5 = (SubLObject)module0647.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX43017_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0647.NIL, var7 = var5; module0647.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0647.$ic82$)) {
                f39280(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic37$)) {
                f39281(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic83$)) {
                f39282(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic84$)) {
                f39283(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic85$)) {
                f39284(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic86$)) {
                f39285(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic87$)) {
                f39286(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic88$)) {
                f39287(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic89$)) {
                f39288(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic90$)) {
                f39289(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0647.$ic45$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f39291(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic46$, (SubLObject)module0647.$ic91$, (SubLObject)module0647.TEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic82$, f39270(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic37$, f39271(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic83$, f39272(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic84$, f39273(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic85$, f39274(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic86$, f39275(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic87$, f39276(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic88$, f39277(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic89$, f39278(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic90$, f39279(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic49$, (SubLObject)module0647.$ic91$, (SubLObject)module0647.TEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f39292(final SubLObject var11, final SubLObject var12) {
        return f39291(var11, var12);
    }
    
    public static SubLObject f39293(final SubLObject var1, final SubLObject var2) {
        f39294(var1, var2, (SubLObject)module0647.ZERO_INTEGER);
        return (SubLObject)module0647.NIL;
    }
    
    public static SubLObject f39295(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX43019_native.class) ? module0647.T : module0647.NIL);
    }
    
    public static SubLObject f39296(final SubLObject var1) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f39297(final SubLObject var1) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f39298(final SubLObject var1) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f39299(final SubLObject var1) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f39300(final SubLObject var1) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f39301(final SubLObject var1) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f39302(final SubLObject var1) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f39303(final SubLObject var1) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f39304(final SubLObject var1) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f39305(final SubLObject var1) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f39306(final SubLObject var1) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f39307(final SubLObject var1) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f39308(final SubLObject var1) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.getField14();
    }
    
    public static SubLObject f39309(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f39310(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f39311(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f39312(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f39313(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f39314(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f39315(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f39316(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f39317(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f39318(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f39319(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f39320(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f39321(final SubLObject var1, final SubLObject var4) {
        assert module0647.NIL != f39295(var1) : var1;
        return var1.setField14(var4);
    }
    
    public static SubLObject f39322(SubLObject var5) {
        if (var5 == module0647.UNPROVIDED) {
            var5 = (SubLObject)module0647.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX43019_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0647.NIL, var7 = var5; module0647.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0647.$ic34$)) {
                f39309(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic130$)) {
                f39310(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic131$)) {
                f39311(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic132$)) {
                f39312(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic133$)) {
                f39313(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic134$)) {
                f39314(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic135$)) {
                f39315(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic136$)) {
                f39316(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic137$)) {
                f39317(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic138$)) {
                f39318(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic139$)) {
                f39319(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic83$)) {
                f39320(var6, var9);
            }
            else if (var10.eql((SubLObject)module0647.$ic140$)) {
                f39321(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0647.$ic45$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f39323(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic46$, (SubLObject)module0647.$ic141$, (SubLObject)module0647.THIRTEEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic34$, f39296(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic130$, f39297(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic131$, f39298(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic132$, f39299(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic133$, f39300(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic134$, f39301(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic135$, f39302(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic136$, f39303(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic137$, f39304(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic138$, f39305(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic139$, f39306(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic83$, f39307(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic48$, (SubLObject)module0647.$ic140$, f39308(var11));
        Functions.funcall(var12, var11, (SubLObject)module0647.$ic49$, (SubLObject)module0647.$ic141$, (SubLObject)module0647.THIRTEEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f39324(final SubLObject var11, final SubLObject var12) {
        return f39323(var11, var12);
    }
    
    public static SubLObject f39325() {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0647.$g5037$.getDynamicValue(var19));
    }
    
    public static SubLObject f39326(final SubLObject var20, final SubLObject var21) {
        final SubLObject var22 = var20.rest();
        final SubLObject var24;
        final SubLObject var23 = var24 = var22;
        return (SubLObject)ConsesLow.listS((SubLObject)module0647.$ic145$, (SubLObject)module0647.$ic146$, ConsesLow.append(var24, (SubLObject)module0647.NIL));
    }
    
    public static SubLObject f39327(final SubLObject var20, final SubLObject var21) {
        final SubLObject var22 = var20.rest();
        final SubLObject var24;
        final SubLObject var23 = var24 = var22;
        return reader.bq_cons((SubLObject)module0647.$ic147$, ConsesLow.append(var24, (SubLObject)module0647.NIL));
    }
    
    public static SubLObject f39328() {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        return module0647.$g5038$.getDynamicValue(var19);
    }
    
    public static SubLObject f39329(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0647.$ic148$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0647.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0647.$ic148$);
        var25 = var23.first();
        var23 = var23.rest();
        if (module0647.NIL == var23) {
            final SubLObject var26;
            var23 = (var26 = var24);
            return (SubLObject)ConsesLow.listS((SubLObject)module0647.$ic145$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0647.$ic149$, var25)), (SubLObject)ConsesLow.listS((SubLObject)module0647.$ic150$, var25, (SubLObject)module0647.$ic151$), ConsesLow.append(var26, (SubLObject)module0647.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0647.$ic148$);
        return (SubLObject)module0647.NIL;
    }
    
    public static SubLObject f39330(final SubLObject var31, final SubLObject var32, final SubLObject var33, final SubLObject var34) {
        final SubLObject var35 = module0077.f5313((SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        return var35;
    }
    
    public static SubLObject f39331(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        if (module0647.NIL != module0077.f5302(module0647.$g5038$.getDynamicValue(var36))) {
            return module0077.f5320(var35, module0647.$g5038$.getDynamicValue(var36));
        }
        return (SubLObject)module0647.NIL;
    }
    
    public static SubLObject f39332(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0647.$ic152$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0647.NIL;
        SubLObject var26 = (SubLObject)module0647.NIL;
        SubLObject var27 = (SubLObject)module0647.NIL;
        SubLObject var28 = (SubLObject)module0647.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0647.$ic152$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0647.$ic152$);
        var26 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0647.$ic152$);
        var27 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0647.$ic152$);
        var28 = var23.first();
        var23 = var23.rest();
        if (module0647.NIL == var23) {
            final SubLObject var29;
            var23 = (var29 = var24);
            final SubLObject var30 = (SubLObject)module0647.$ic153$;
            return (SubLObject)ConsesLow.list((SubLObject)module0647.$ic145$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var30, (SubLObject)ConsesLow.list((SubLObject)module0647.$ic154$, var25, var26, var27, var28))), (SubLObject)ConsesLow.listS((SubLObject)module0647.$ic155$, (SubLObject)ConsesLow.list(var30), ConsesLow.append(var29, (SubLObject)module0647.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0647.$ic152$);
        return (SubLObject)module0647.NIL;
    }
    
    public static SubLObject f39333(final SubLObject var40) {
        SubLObject var41 = (SubLObject)module0647.NIL;
        if (module0647.NIL == f39295(var40)) {
            Errors.warn((SubLObject)module0647.$ic156$, var40);
        }
        else if (module0647.NIL != module0637.f38878(f39299(var40)) && module0647.NIL != module0202.f12590(module0637.f38899(f39299(var40))) && module0647.NIL != module0161.f10479(module0637.f38900(f39299(var40)))) {
            var41 = (SubLObject)module0647.T;
        }
        else if (module0647.NIL == module0202.f12590(f39298(var40))) {
            Errors.warn((SubLObject)module0647.$ic157$, f39298(var40));
        }
        else if (module0647.NIL == module0161.f10479(f39300(var40))) {
            Errors.warn((SubLObject)module0647.$ic158$, f39300(var40));
        }
        else {
            var41 = (SubLObject)module0647.T;
        }
        if (module0647.NIL == var41) {
            Errors.warn((SubLObject)module0647.$ic159$, var40);
        }
        return var41;
    }
    
    public static SubLObject f39334(final SubLObject var42, SubLObject var43) {
        if (var43 == module0647.UNPROVIDED) {
            var43 = (SubLObject)module0647.NIL;
        }
        final SubLObject var44 = f39264((SubLObject)module0647.UNPROVIDED);
        f39253(var44, var42);
        if (module0647.NIL != var43) {
            f39252(var44, var43);
        }
        return var44;
    }
    
    public static SubLObject f39335(final SubLObject var44, final SubLObject var45) {
        assert module0647.NIL != f39239(var44) : var44;
        assert module0647.NIL != f39239(var45) : var45;
        f39252(var45, var44);
        f39254(var44, (SubLObject)ConsesLow.cons(var45, f39242(var44)));
        return var44;
    }
    
    public static SubLObject f39336(final SubLObject var44, final SubLObject var46) {
        assert module0647.NIL != f39239(var44) : var44;
        assert module0647.NIL != f39295(var46) : var46;
        f39309(var46, var44);
        f39255(var44, (SubLObject)ConsesLow.cons(var46, f39243(var44)));
        return var44;
    }
    
    public static SubLObject f39337(final SubLObject var44, final SubLObject var47) {
        assert module0647.NIL != f39239(var44) : var44;
        assert module0647.NIL != Types.stringp(var47) : var47;
        f39257(var44, var47);
        return var44;
    }
    
    public static SubLObject f39338(final SubLObject var44, final SubLObject var48) {
        assert module0647.NIL != f39239(var44) : var44;
        assert module0647.NIL != Types.stringp(var48) : var48;
        f39258(var44, var48);
        return var44;
    }
    
    public static SubLObject f39339(final SubLObject var44, final SubLObject var49) {
        assert module0647.NIL != f39239(var44) : var44;
        assert module0647.NIL != module0173.f10955(var49) : var49;
        f39259(var44, var49);
        return var44;
    }
    
    public static SubLObject f39340(final SubLObject var44, final SubLObject var50) {
        assert module0647.NIL != f39239(var44) : var44;
        assert module0647.NIL != Types.listp(var50) : var50;
        f39260(var44, var50);
        return var44;
    }
    
    public static SubLObject f39238(final SubLObject var44, final SubLObject var2, final SubLObject var51) {
        streams_high.write_string((SubLObject)module0647.$ic163$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        PrintLow.format(var2, (SubLObject)module0647.$ic164$, (SubLObject)((module0647.NIL != f39240(var44)) ? f39241(f39240(var44)) : module0647.NIL), f39241(var44));
        if (f39245(var44).isString()) {
            streams_high.write_string((SubLObject)module0647.$ic165$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
            streams_high.write_string(f39245(var44), var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
            print_high.princ((SubLObject)Characters.CHAR_space, var2);
        }
        if (f39246(var44).isString()) {
            streams_high.write_string((SubLObject)module0647.$ic166$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
            streams_high.write_string(f39246(var44), var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
            print_high.princ((SubLObject)Characters.CHAR_space, var2);
        }
        if (module0647.NIL != f39242(var44)) {
            streams_high.write_string((SubLObject)module0647.$ic167$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
            SubLObject var52 = f39242(var44);
            SubLObject var53 = (SubLObject)module0647.NIL;
            var53 = var52.first();
            while (module0647.NIL != var52) {
                print_high.princ((SubLObject)Characters.CHAR_space, var2);
                print_high.prin1(f39241(var53), var2);
                var52 = var52.rest();
                var53 = var52.first();
            }
        }
        if (module0647.NIL != f39248(var44)) {
            streams_high.write_string((SubLObject)module0647.$ic168$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
            SubLObject var52 = f39248(var44);
            SubLObject var54 = (SubLObject)module0647.NIL;
            var54 = var52.first();
            while (module0647.NIL != var52) {
                print_high.princ((SubLObject)Characters.CHAR_space, var2);
                print_high.prin1(var54, var2);
                var52 = var52.rest();
                var54 = var52.first();
            }
        }
        if (module0647.NIL != f39249(var44)) {
            streams_high.write_string((SubLObject)module0647.$ic169$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
            print_high.prin1(f39249(var44), var2);
        }
        if (module0647.NIL != f39250(var44)) {
            streams_high.write_string((SubLObject)module0647.$ic170$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
            print_high.prin1(f39250(var44), var2);
        }
        if (module0647.NIL != f39251(var44)) {
            streams_high.write_string((SubLObject)module0647.$ic171$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
            print_high.prin1(f39251(var44), var2);
        }
        if (module0647.NIL != f39243(var44)) {
            streams_high.write_string((SubLObject)module0647.$ic172$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
            SubLObject var52 = f39243(var44);
            SubLObject var55 = (SubLObject)module0647.NIL;
            var55 = var52.first();
            while (module0647.NIL != var52) {
                print_high.princ((SubLObject)Characters.CHAR_space, var2);
                print_high.prin1(f39297(var55), var2);
                if (f39297(var55).eql(f39247(var44))) {
                    print_high.princ((SubLObject)module0647.$ic173$, var2);
                }
                var52 = var52.rest();
                var55 = var52.first();
            }
        }
        streams_high.write_string((SubLObject)module0647.$ic174$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        return var44;
    }
    
    public static SubLObject f39341() {
        return module0647.$g5040$.getGlobalValue().first().first();
    }
    
    public static SubLObject f39342(final SubLObject var44, SubLObject var2) {
        if (var2 == module0647.UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        assert module0647.NIL != f39239(var44) : var44;
        final SubLObject var46 = module0587.$g4457$.currentBinding(var45);
        try {
            module0587.$g4457$.bind(var2, var45);
            try {
                final SubLObject var54_55 = module0601.$g4652$.currentBinding(var45);
                final SubLObject var47 = module0601.$g4654$.currentBinding(var45);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var45), module0601.$g4652$.getDynamicValue(var45)), var45);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var45), var45);
                    module0601.f36758((SubLObject)module0647.$ic176$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                    if (module0647.NIL == module0647.$g5039$.getDynamicValue(var45)) {
                        try {
                            final SubLObject var54_56 = module0601.$g4652$.currentBinding(var45);
                            final SubLObject var56_58 = module0601.$g4654$.currentBinding(var45);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var45), module0601.$g4652$.getDynamicValue(var45)), var45);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var45), var45);
                                module0601.f36758((SubLObject)module0647.$ic177$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0797.f50948(f39341(), (SubLObject)module0647.UNPROVIDED);
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_58, var45);
                                module0601.$g4652$.rebind(var54_56, var45);
                            }
                        }
                        finally {
                            final SubLObject var54_57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var45);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic177$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_57, var45);
                            }
                        }
                    }
                    try {
                        final SubLObject var54_58 = module0601.$g4652$.currentBinding(var45);
                        final SubLObject var56_59 = module0601.$g4654$.currentBinding(var45);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var45), module0601.$g4652$.getDynamicValue(var45)), var45);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var45), var45);
                            module0601.f36758((SubLObject)module0647.$ic178$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                            module0798.f51048(f39241(var44));
                        }
                        finally {
                            module0601.$g4654$.rebind(var56_59, var45);
                            module0601.$g4652$.rebind(var54_58, var45);
                        }
                    }
                    finally {
                        final SubLObject var54_59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var45);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0647.$ic178$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var54_59, var45);
                        }
                    }
                    if (module0647.NIL != f39240(var44)) {
                        try {
                            final SubLObject var54_60 = module0601.$g4652$.currentBinding(var45);
                            final SubLObject var56_60 = module0601.$g4654$.currentBinding(var45);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var45), module0601.$g4652$.getDynamicValue(var45)), var45);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var45), var45);
                                module0601.f36758((SubLObject)module0647.$ic179$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0798.f51048(f39241(f39240(var44)));
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_60, var45);
                                module0601.$g4652$.rebind(var54_60, var45);
                            }
                        }
                        finally {
                            final SubLObject var54_61 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var45);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic179$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_61, var45);
                            }
                        }
                    }
                    if (module0647.NIL != f39245(var44)) {
                        try {
                            final SubLObject var54_62 = module0601.$g4652$.currentBinding(var45);
                            final SubLObject var56_61 = module0601.$g4654$.currentBinding(var45);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var45), module0601.$g4652$.getDynamicValue(var45)), var45);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var45), var45);
                                module0601.f36758((SubLObject)module0647.$ic180$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0601.f36747(f39245(var44), (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_61, var45);
                                module0601.$g4652$.rebind(var54_62, var45);
                            }
                        }
                        finally {
                            final SubLObject var54_63 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var45);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic180$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_63, var45);
                            }
                        }
                    }
                    if (module0647.NIL != f39246(var44)) {
                        try {
                            final SubLObject var54_64 = module0601.$g4652$.currentBinding(var45);
                            final SubLObject var56_62 = module0601.$g4654$.currentBinding(var45);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var45), module0601.$g4652$.getDynamicValue(var45)), var45);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var45), var45);
                                module0601.f36758((SubLObject)module0647.$ic181$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0601.f36747(f39246(var44), (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_62, var45);
                                module0601.$g4652$.rebind(var54_64, var45);
                            }
                        }
                        finally {
                            final SubLObject var54_65 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var45);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic181$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_65, var45);
                            }
                        }
                    }
                    if (module0647.NIL != f39247(var44)) {
                        try {
                            final SubLObject var54_66 = module0601.$g4652$.currentBinding(var45);
                            final SubLObject var56_63 = module0601.$g4654$.currentBinding(var45);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var45), module0601.$g4652$.getDynamicValue(var45)), var45);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var45), var45);
                                module0601.f36758((SubLObject)module0647.$ic182$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0798.f51048(f39247(var44));
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_63, var45);
                                module0601.$g4652$.rebind(var54_66, var45);
                            }
                        }
                        finally {
                            final SubLObject var54_67 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var45);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic182$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_67, var45);
                            }
                        }
                    }
                    if (module0647.NIL != f39242(var44)) {
                        try {
                            final SubLObject var54_68 = module0601.$g4652$.currentBinding(var45);
                            final SubLObject var56_64 = module0601.$g4654$.currentBinding(var45);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var45), module0601.$g4652$.getDynamicValue(var45)), var45);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var45), var45);
                                module0601.f36758((SubLObject)module0647.$ic183$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                SubLObject var48 = f39242(var44);
                                SubLObject var49 = (SubLObject)module0647.NIL;
                                var49 = var48.first();
                                while (module0647.NIL != var48) {
                                    try {
                                        final SubLObject var54_69 = module0601.$g4652$.currentBinding(var45);
                                        final SubLObject var56_65 = module0601.$g4654$.currentBinding(var45);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var45), module0601.$g4652$.getDynamicValue(var45)), var45);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var45), var45);
                                            module0601.f36758((SubLObject)module0647.$ic184$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                            f39342(var49, var2);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var56_65, var45);
                                            module0601.$g4652$.rebind(var54_69, var45);
                                        }
                                    }
                                    finally {
                                        final SubLObject var54_70 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var45);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0647.$ic184$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var54_70, var45);
                                        }
                                    }
                                    var48 = var48.rest();
                                    var49 = var48.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_64, var45);
                                module0601.$g4652$.rebind(var54_68, var45);
                            }
                        }
                        finally {
                            final SubLObject var54_71 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var45);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic183$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_71, var45);
                            }
                        }
                    }
                    if (module0647.NIL != f39248(var44)) {
                        try {
                            final SubLObject var54_72 = module0601.$g4652$.currentBinding(var45);
                            final SubLObject var56_66 = module0601.$g4654$.currentBinding(var45);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var45), module0601.$g4652$.getDynamicValue(var45)), var45);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var45), var45);
                                module0601.f36758((SubLObject)module0647.$ic185$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                SubLObject var48 = f39248(var44);
                                SubLObject var50 = (SubLObject)module0647.NIL;
                                var50 = var48.first();
                                while (module0647.NIL != var48) {
                                    try {
                                        final SubLObject var54_73 = module0601.$g4652$.currentBinding(var45);
                                        final SubLObject var56_67 = module0601.$g4654$.currentBinding(var45);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var45), module0601.$g4652$.getDynamicValue(var45)), var45);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var45), var45);
                                            module0601.f36758((SubLObject)module0647.$ic186$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                            module0797.f50965(var50);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var56_67, var45);
                                            module0601.$g4652$.rebind(var54_73, var45);
                                        }
                                    }
                                    finally {
                                        final SubLObject var54_74 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var45);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0647.$ic186$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var54_74, var45);
                                        }
                                    }
                                    var48 = var48.rest();
                                    var50 = var48.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_66, var45);
                                module0601.$g4652$.rebind(var54_72, var45);
                            }
                        }
                        finally {
                            final SubLObject var54_75 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var45);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic185$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_75, var45);
                            }
                        }
                    }
                    if (module0647.NIL != f39249(var44)) {
                        try {
                            final SubLObject var54_76 = module0601.$g4652$.currentBinding(var45);
                            final SubLObject var56_68 = module0601.$g4654$.currentBinding(var45);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var45), module0601.$g4652$.getDynamicValue(var45)), var45);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var45), var45);
                                module0601.f36758((SubLObject)module0647.$ic187$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0797.f50965(f39249(var44));
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_68, var45);
                                module0601.$g4652$.rebind(var54_76, var45);
                            }
                        }
                        finally {
                            final SubLObject var54_77 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var45);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic187$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_77, var45);
                            }
                        }
                    }
                    if (module0647.NIL != f39250(var44)) {
                        try {
                            final SubLObject var54_78 = module0601.$g4652$.currentBinding(var45);
                            final SubLObject var56_69 = module0601.$g4654$.currentBinding(var45);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var45), module0601.$g4652$.getDynamicValue(var45)), var45);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var45), var45);
                                module0601.f36758((SubLObject)module0647.$ic188$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0797.f50965(f39250(var44));
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_69, var45);
                                module0601.$g4652$.rebind(var54_78, var45);
                            }
                        }
                        finally {
                            final SubLObject var54_79 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var45);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic188$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_79, var45);
                            }
                        }
                    }
                    if (module0647.NIL != f39251(var44)) {
                        try {
                            final SubLObject var54_80 = module0601.$g4652$.currentBinding(var45);
                            final SubLObject var56_70 = module0601.$g4654$.currentBinding(var45);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var45), module0601.$g4652$.getDynamicValue(var45)), var45);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var45), var45);
                                module0601.f36758((SubLObject)module0647.$ic189$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0797.f50965(f39251(var44));
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_70, var45);
                                module0601.$g4652$.rebind(var54_80, var45);
                            }
                        }
                        finally {
                            final SubLObject var54_81 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var45);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic189$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_81, var45);
                            }
                        }
                    }
                    if (module0647.NIL != f39243(var44)) {
                        try {
                            final SubLObject var54_82 = module0601.$g4652$.currentBinding(var45);
                            final SubLObject var56_71 = module0601.$g4654$.currentBinding(var45);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var45), module0601.$g4652$.getDynamicValue(var45)), var45);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var45), var45);
                                module0601.f36758((SubLObject)module0647.$ic190$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                SubLObject var48 = f39243(var44);
                                SubLObject var51 = (SubLObject)module0647.NIL;
                                var51 = var48.first();
                                while (module0647.NIL != var48) {
                                    if (module0647.NIL != f39333(var51)) {
                                        f39343(var51, var2);
                                    }
                                    var48 = var48.rest();
                                    var51 = var48.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_71, var45);
                                module0601.$g4652$.rebind(var54_82, var45);
                            }
                        }
                        finally {
                            final SubLObject var54_83 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var45);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic190$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_83, var45);
                            }
                        }
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var47, var45);
                    module0601.$g4652$.rebind(var54_55, var45);
                }
            }
            finally {
                final SubLObject var54_84 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var45);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0647.$ic176$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var54_84, var45);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var46, var45);
        }
        return var44;
    }
    
    public static SubLObject f39344(final SubLObject var101, final SubLObject var2) {
        return f39345(var101, var2);
    }
    
    public static SubLObject f39345(final SubLObject var44, final SubLObject var2) {
        module0021.f1198(var2, module0647.$g5032$.getGlobalValue());
        module0021.f1038(f39241(var44), var2);
        final SubLObject var45 = (SubLObject)((module0647.NIL != f39239(f39240(var44))) ? f39241(f39240(var44)) : module0647.NIL);
        module0021.f1038(var45, var2);
        module0021.f1038(f39245(var44), var2);
        module0021.f1038(f39246(var44), var2);
        module0021.f1038(f39247(var44), var2);
        module0021.f1038(f39242(var44), var2);
        module0021.f1038(f39248(var44), var2);
        module0021.f1038(f39249(var44), var2);
        module0021.f1038(f39250(var44), var2);
        module0021.f1038(f39251(var44), var2);
        final SubLObject var46 = conses_high.copy_list(f39243(var44));
        final SubLObject var47 = module0035.remove_if_not((SubLObject)module0647.$ic192$, var46, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        module0021.f1038(var47, var2);
        return var44;
    }
    
    public static SubLObject f39346(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = f39264((SubLObject)module0647.UNPROVIDED);
        f39253(var4, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39252(var4, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39257(var4, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39258(var4, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39259(var4, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39254(var4, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39260(var4, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39261(var4, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39262(var4, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39263(var4, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39255(var4, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        SubLObject var5 = f39242(var4);
        SubLObject var6 = (SubLObject)module0647.NIL;
        var6 = var5.first();
        while (module0647.NIL != var5) {
            if (module0647.NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && !f39240(var6).eql(f39241(var4))) {
                Errors.error((SubLObject)module0647.$ic193$, f39240(var6), f39241(var4));
            }
            f39252(var6, var4);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return var4;
    }
    
    public static SubLObject f39347(final SubLObject var105, SubLObject var42) {
        if (var42 == module0647.UNPROVIDED) {
            var42 = (SubLObject)module0647.NIL;
        }
        final SubLObject var106 = f39322((SubLObject)module0647.UNPROVIDED);
        f39310(var106, var105);
        if (module0647.NIL != f39239(var42)) {
            f39336(var42, var106);
        }
        else {
            f39309(var106, var42);
        }
        f39315(var106, module0067.f4880(Symbols.symbol_function((SubLObject)module0647.EQUAL), (SubLObject)module0647.UNPROVIDED));
        return var106;
    }
    
    public static SubLObject f39348(final SubLObject var46) {
        return Equality.eq(module0647.$ic194$, f39305(var46));
    }
    
    public static SubLObject f39349(final SubLObject var46) {
        return Equality.eq(module0647.$ic195$, f39305(var46));
    }
    
    public static SubLObject f39350(final SubLObject var46) {
        return module0035.sublisp_boolean(f39308(var46));
    }
    
    public static SubLObject f39294(final SubLObject var46, final SubLObject var2, final SubLObject var51) {
        streams_high.write_string((SubLObject)module0647.$ic196$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        PrintLow.format(var2, (SubLObject)module0647.$ic197$, f39297(var46));
        if (module0647.NIL != f39239(f39296(var46))) {
            PrintLow.format(var2, (SubLObject)module0647.$ic198$, f39241(f39296(var46)));
        }
        else {
            streams_high.terpri(var2);
        }
        module0038.f2648(var2, var51);
        if (module0647.NIL != f39298(var46)) {
            PrintLow.format(var2, (SubLObject)module0647.$ic199$, f39298(var46), f39300(var46));
        }
        else {
            PrintLow.format(var2, (SubLObject)module0647.$ic200$, f39299(var46), f39300(var46));
        }
        module0038.f2648(var2, var51);
        if (module0647.NIL != f39301(var46)) {
            if (module0647.NIL != module0035.f1997(f39301(var46))) {
                PrintLow.format(var2, (SubLObject)module0647.$ic201$, f39301(var46).first(), f39305(var46));
            }
            else {
                PrintLow.format(var2, (SubLObject)module0647.$ic202$, f39301(var46), f39305(var46));
            }
            module0038.f2648(var2, var51);
        }
        if (module0647.NIL != f39304(var46)) {
            PrintLow.format(var2, (SubLObject)module0647.$ic203$, f39304(var46));
            module0038.f2648(var2, var51);
        }
        if (module0647.NIL != f39306(var46)) {
            PrintLow.format(var2, (SubLObject)module0647.$ic204$, f39306(var46));
            module0038.f2648(var2, var51);
        }
        if (module0647.NIL != f39307(var46)) {
            PrintLow.format(var2, (SubLObject)module0647.$ic205$, f39307(var46));
            module0038.f2648(var2, var51);
        }
        if (module0647.NIL != f39308(var46)) {
            PrintLow.format(var2, (SubLObject)module0647.$ic206$, f39308(var46));
            module0038.f2648(var2, var51);
        }
        if (module0647.NIL != f39302(var46)) {
            streams_high.write_string((SubLObject)module0647.$ic207$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
            if (module0647.NIL == f39303(var46)) {
                print_high.princ(f39302(var46), var2);
            }
            else {
                SubLObject var52 = f39303(var46);
                SubLObject var53 = (SubLObject)module0647.NIL;
                var53 = var52.first();
                while (module0647.NIL != var52) {
                    f39268(var53, var2, Numbers.add(var51, (SubLObject)module0647.ONE_INTEGER));
                    print_high.princ((SubLObject)module0647.$ic208$, var2);
                    var52 = var52.rest();
                    var53 = var52.first();
                }
            }
        }
        streams_high.write_string((SubLObject)module0647.$ic174$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        return var46;
    }
    
    public static SubLObject f39351(final SubLObject var46, final SubLObject var107) {
        assert module0647.NIL != f39295(var46) : var46;
        assert module0647.NIL != module0202.f12590(var107) : var107;
        f39311(var46, var107);
        return var46;
    }
    
    public static SubLObject f39352(final SubLObject var46, final SubLObject var108) {
        assert module0647.NIL != f39295(var46) : var46;
        assert module0647.NIL != Types.listp(var108) : var108;
        f39317(var46, var108);
        return var46;
    }
    
    public static SubLObject f39353(final SubLObject var46, final SubLObject var109) {
        assert module0647.NIL != f39295(var46) : var46;
        assert module0647.NIL != module0173.f10955(var109) : var109;
        f39314(var46, var109);
        return var46;
    }
    
    public static SubLObject f39354(final SubLObject var46, final SubLObject var110) {
        assert module0647.NIL != f39295(var46) : var46;
        assert module0647.NIL != module0269.f17732(var110, (SubLObject)module0647.UNPROVIDED) : var110;
        f39313(var46, var110);
        return var46;
    }
    
    public static SubLObject f39355(final SubLObject var46, final SubLObject var111) {
        assert module0647.NIL != f39295(var46) : var46;
        assert module0647.NIL != module0128.f8449(var111) : var111;
        f39318(var46, var111);
        return var46;
    }
    
    public static SubLObject f39356(final SubLObject var46, final SubLObject var112) {
        assert module0647.NIL != f39295(var46) : var46;
        assert module0647.NIL != Types.stringp(var112) : var112;
        f39320(var46, var112);
        return var46;
    }
    
    public static SubLObject f39357(final SubLObject var46, final SubLObject var113) {
        assert module0647.NIL != f39295(var46) : var46;
        assert module0647.NIL != module0637.f38878(var113) : var113;
        f39312(var46, var113);
        return var46;
    }
    
    public static SubLObject f39343(final SubLObject var46, SubLObject var2) {
        if (var2 == module0647.UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0587.$g4457$.currentBinding(var47);
        try {
            module0587.$g4457$.bind(var2, var47);
            try {
                final SubLObject var54_114 = module0601.$g4652$.currentBinding(var47);
                final SubLObject var49 = module0601.$g4654$.currentBinding(var47);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                    module0601.f36758((SubLObject)module0647.$ic213$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                    try {
                        final SubLObject var54_115 = module0601.$g4652$.currentBinding(var47);
                        final SubLObject var56_116 = module0601.$g4654$.currentBinding(var47);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                            module0601.f36758((SubLObject)module0647.$ic214$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                            module0797.f50965(f39297(var46));
                        }
                        finally {
                            module0601.$g4654$.rebind(var56_116, var47);
                            module0601.$g4652$.rebind(var54_115, var47);
                        }
                    }
                    finally {
                        final SubLObject var54_116 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0647.$ic214$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var54_116, var47);
                        }
                    }
                    if (module0647.NIL != f39298(var46)) {
                        try {
                            final SubLObject var54_117 = module0601.$g4652$.currentBinding(var47);
                            final SubLObject var56_117 = module0601.$g4654$.currentBinding(var47);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                                module0601.f36758((SubLObject)module0647.$ic215$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0797.f50968(f39298(var46));
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_117, var47);
                                module0601.$g4652$.rebind(var54_117, var47);
                            }
                        }
                        finally {
                            final SubLObject var54_118 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic215$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_118, var47);
                            }
                        }
                    }
                    final SubLObject var50 = f39299(var46);
                    if (module0647.NIL != var50 && module0647.NIL != module0206.f13425(module0202.f12644(module0637.f38899(var50)))) {
                        module0637.f38896(var50, (SubLObject)module0647.UNPROVIDED);
                    }
                    try {
                        final SubLObject var54_119 = module0601.$g4652$.currentBinding(var47);
                        final SubLObject var56_118 = module0601.$g4654$.currentBinding(var47);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                            module0601.f36758((SubLObject)module0647.$ic216$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                            module0797.f50965(f39300(var46));
                        }
                        finally {
                            module0601.$g4654$.rebind(var56_118, var47);
                            module0601.$g4652$.rebind(var54_119, var47);
                        }
                    }
                    finally {
                        final SubLObject var54_120 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0647.$ic216$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var54_120, var47);
                        }
                    }
                    if (module0647.NIL != f39301(var46)) {
                        try {
                            final SubLObject var54_121 = module0601.$g4652$.currentBinding(var47);
                            final SubLObject var56_119 = module0601.$g4654$.currentBinding(var47);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                                module0601.f36758((SubLObject)module0647.$ic217$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                if (module0647.NIL != module0035.f1997(f39301(var46))) {
                                    f39358(f39301(var46).first(), (SubLObject)module0647.UNPROVIDED);
                                }
                                else {
                                    try {
                                        final SubLObject var54_122 = module0601.$g4652$.currentBinding(var47);
                                        final SubLObject var56_120 = module0601.$g4654$.currentBinding(var47);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                                            module0601.f36758((SubLObject)module0647.$ic218$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                            SubLObject var51 = f39301(var46);
                                            SubLObject var52 = (SubLObject)module0647.NIL;
                                            var52 = var51.first();
                                            while (module0647.NIL != var51) {
                                                f39358(var52, (SubLObject)module0647.UNPROVIDED);
                                                var51 = var51.rest();
                                                var52 = var51.first();
                                            }
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var56_120, var47);
                                            module0601.$g4652$.rebind(var54_122, var47);
                                        }
                                    }
                                    finally {
                                        final SubLObject var54_123 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0647.$ic218$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var54_123, var47);
                                        }
                                    }
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_119, var47);
                                module0601.$g4652$.rebind(var54_121, var47);
                            }
                        }
                        finally {
                            final SubLObject var54_124 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic217$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_124, var47);
                            }
                        }
                    }
                    if (module0647.NIL != f39348(var46)) {
                        try {
                            final SubLObject var54_125 = module0601.$g4652$.currentBinding(var47);
                            final SubLObject var56_121 = module0601.$g4654$.currentBinding(var47);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                                module0601.f36758((SubLObject)module0647.$ic219$, (SubLObject)module0647.NIL, (SubLObject)module0647.$ic220$, (SubLObject)module0647.NIL);
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_121, var47);
                                module0601.$g4652$.rebind(var54_125, var47);
                            }
                        }
                        finally {
                            final SubLObject var54_126 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_126, var47);
                            }
                        }
                    }
                    else {
                        try {
                            final SubLObject var54_127 = module0601.$g4652$.currentBinding(var47);
                            final SubLObject var56_122 = module0601.$g4654$.currentBinding(var47);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                                module0601.f36758((SubLObject)module0647.$ic221$, (SubLObject)module0647.NIL, (SubLObject)module0647.$ic220$, (SubLObject)module0647.NIL);
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_122, var47);
                                module0601.$g4652$.rebind(var54_127, var47);
                            }
                        }
                        finally {
                            final SubLObject var54_128 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_128, var47);
                            }
                        }
                    }
                    if (module0647.NIL != f39304(var46)) {
                        try {
                            final SubLObject var54_129 = module0601.$g4652$.currentBinding(var47);
                            final SubLObject var56_123 = module0601.$g4654$.currentBinding(var47);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                                module0601.f36758((SubLObject)module0647.$ic222$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                SubLObject var53 = f39304(var46);
                                SubLObject var54 = (SubLObject)module0647.NIL;
                                var54 = var53.first();
                                while (module0647.NIL != var53) {
                                    try {
                                        final SubLObject var54_130 = module0601.$g4652$.currentBinding(var47);
                                        final SubLObject var56_124 = module0601.$g4654$.currentBinding(var47);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                                            module0601.f36758((SubLObject)module0647.$ic223$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                            module0797.f50968(var54);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var56_124, var47);
                                            module0601.$g4652$.rebind(var54_130, var47);
                                        }
                                    }
                                    finally {
                                        final SubLObject var54_131 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0647.$ic223$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var54_131, var47);
                                        }
                                    }
                                    var53 = var53.rest();
                                    var54 = var53.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_123, var47);
                                module0601.$g4652$.rebind(var54_129, var47);
                            }
                        }
                        finally {
                            final SubLObject var54_132 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic222$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_132, var47);
                            }
                        }
                    }
                    if (module0647.NIL != f39307(var46)) {
                        try {
                            final SubLObject var54_133 = module0601.$g4652$.currentBinding(var47);
                            final SubLObject var56_125 = module0601.$g4654$.currentBinding(var47);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                                module0601.f36758((SubLObject)module0647.$ic224$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0601.f36762(f39307(var46), (SubLObject)module0647.UNPROVIDED);
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_125, var47);
                                module0601.$g4652$.rebind(var54_133, var47);
                            }
                        }
                        finally {
                            final SubLObject var54_134 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic224$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_134, var47);
                            }
                        }
                    }
                    if (module0647.NIL != f39306(var46)) {
                        try {
                            final SubLObject var54_135 = module0601.$g4652$.currentBinding(var47);
                            final SubLObject var56_126 = module0601.$g4654$.currentBinding(var47);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                                module0601.f36758((SubLObject)module0647.$ic225$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                SubLObject var53 = f39306(var46);
                                SubLObject var55 = (SubLObject)module0647.NIL;
                                var55 = var53.first();
                                while (module0647.NIL != var53) {
                                    try {
                                        final SubLObject var54_136 = module0601.$g4652$.currentBinding(var47);
                                        final SubLObject var56_127 = module0601.$g4654$.currentBinding(var47);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                                            module0601.f36758((SubLObject)module0647.$ic226$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                            SubLObject var57;
                                            final SubLObject var56 = var57 = var55;
                                            SubLObject var58 = (SubLObject)module0647.NIL;
                                            SubLObject var59 = (SubLObject)module0647.NIL;
                                            SubLObject var60 = (SubLObject)module0647.NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0647.$ic227$);
                                            var58 = var57.first();
                                            var57 = var57.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0647.$ic227$);
                                            var59 = var57.first();
                                            var57 = var57.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0647.$ic227$);
                                            var60 = var57.first();
                                            var57 = var57.rest();
                                            if (module0647.NIL == var57) {
                                                try {
                                                    final SubLObject var54_137 = module0601.$g4652$.currentBinding(var47);
                                                    final SubLObject var56_128 = module0601.$g4654$.currentBinding(var47);
                                                    try {
                                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                                                        module0601.f36758((SubLObject)module0647.$ic228$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                                        module0797.f50965(var58);
                                                    }
                                                    finally {
                                                        module0601.$g4654$.rebind(var56_128, var47);
                                                        module0601.$g4652$.rebind(var54_137, var47);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var54_138 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                                                        module0601.f36746();
                                                        module0601.f36760((SubLObject)module0647.$ic228$);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var54_138, var47);
                                                    }
                                                }
                                                try {
                                                    final SubLObject var54_139 = module0601.$g4652$.currentBinding(var47);
                                                    final SubLObject var56_129 = module0601.$g4654$.currentBinding(var47);
                                                    try {
                                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                                                        module0601.f36758((SubLObject)module0647.$ic229$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                                        module0797.f50965(var59);
                                                    }
                                                    finally {
                                                        module0601.$g4654$.rebind(var56_129, var47);
                                                        module0601.$g4652$.rebind(var54_139, var47);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var54_140 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                                                        module0601.f36746();
                                                        module0601.f36760((SubLObject)module0647.$ic229$);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var54_140, var47);
                                                    }
                                                }
                                                try {
                                                    final SubLObject var54_141 = module0601.$g4652$.currentBinding(var47);
                                                    final SubLObject var56_130 = module0601.$g4654$.currentBinding(var47);
                                                    try {
                                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                                                        module0601.f36758((SubLObject)module0647.$ic230$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                                        module0797.f50965(var60);
                                                    }
                                                    finally {
                                                        module0601.$g4654$.rebind(var56_130, var47);
                                                        module0601.$g4652$.rebind(var54_141, var47);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var54_142 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                                                        module0601.f36746();
                                                        module0601.f36760((SubLObject)module0647.$ic230$);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var54_142, var47);
                                                    }
                                                }
                                            }
                                            else {
                                                cdestructuring_bind.cdestructuring_bind_error(var56, (SubLObject)module0647.$ic227$);
                                            }
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var56_127, var47);
                                            module0601.$g4652$.rebind(var54_136, var47);
                                        }
                                    }
                                    finally {
                                        final SubLObject var54_143 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0647.$ic226$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var54_143, var47);
                                        }
                                    }
                                    var53 = var53.rest();
                                    var55 = var53.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_126, var47);
                                module0601.$g4652$.rebind(var54_135, var47);
                            }
                        }
                        finally {
                            final SubLObject var54_144 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic225$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_144, var47);
                            }
                        }
                    }
                    if (module0647.NIL != f39308(var46)) {
                        try {
                            final SubLObject var54_145 = module0601.$g4652$.currentBinding(var47);
                            final SubLObject var56_131 = module0601.$g4654$.currentBinding(var47);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                                module0601.f36758((SubLObject)module0647.$ic231$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0797.f50965(f39308(var46));
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_131, var47);
                                module0601.$g4652$.rebind(var54_145, var47);
                            }
                        }
                        finally {
                            final SubLObject var54_146 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic231$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_146, var47);
                            }
                        }
                    }
                    if (module0647.NIL != f39302(var46)) {
                        try {
                            final SubLObject var54_147 = module0601.$g4652$.currentBinding(var47);
                            final SubLObject var56_132 = module0601.$g4654$.currentBinding(var47);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var47), module0601.$g4652$.getDynamicValue(var47)), var47);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var47), var47);
                                module0601.f36758((SubLObject)module0647.$ic232$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                if (module0647.NIL != f39303(var46)) {
                                    SubLObject var53 = f39303(var46);
                                    SubLObject var61 = (SubLObject)module0647.NIL;
                                    var61 = var53.first();
                                    while (module0647.NIL != var53) {
                                        if (module0647.NIL != f39359(var61)) {
                                            f39360(var61, (SubLObject)module0647.UNPROVIDED);
                                        }
                                        var53 = var53.rest();
                                        var61 = var53.first();
                                    }
                                }
                                else {
                                    SubLObject var62;
                                    for (var62 = module0066.f4838(module0067.f4891(f39302(var46))); module0647.NIL == module0066.f4841(var62); var62 = module0066.f4840(var62)) {
                                        var47.resetMultipleValues();
                                        final SubLObject var63 = module0066.f4839(var62);
                                        final SubLObject var64 = var47.secondMultipleValue();
                                        var47.resetMultipleValues();
                                        if (module0647.NIL != f39359(var64)) {
                                            f39360(var64, (SubLObject)module0647.UNPROVIDED);
                                        }
                                    }
                                    module0066.f4842(var62);
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_132, var47);
                                module0601.$g4652$.rebind(var54_147, var47);
                            }
                        }
                        finally {
                            final SubLObject var54_148 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic232$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_148, var47);
                            }
                        }
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var49, var47);
                    module0601.$g4652$.rebind(var54_114, var47);
                }
            }
            finally {
                final SubLObject var54_149 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var47);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0647.$ic213$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var54_149, var47);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var48, var47);
        }
        return var46;
    }
    
    public static SubLObject f39361(final SubLObject var46, SubLObject var2) {
        if (var2 == module0647.UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        f39362(var2);
        f39343(var46, var2);
        return var46;
    }
    
    public static SubLObject f39362(SubLObject var2) {
        if (var2 == module0647.UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0587.$g4457$.currentBinding(var3);
        try {
            module0587.$g4457$.bind(var2, var3);
            print_high.princ((SubLObject)module0647.$ic233$, module0587.$g4457$.getDynamicValue(var3));
            streams_high.terpri(module0587.$g4457$.getDynamicValue(var3));
            print_high.princ((SubLObject)module0647.$ic234$, module0587.$g4457$.getDynamicValue(var3));
        }
        finally {
            module0587.$g4457$.rebind(var4, var3);
        }
        return (SubLObject)module0647.NIL;
    }
    
    public static SubLObject f39363(final SubLObject var101, final SubLObject var2) {
        return f39364(var101, var2);
    }
    
    public static SubLObject f39364(final SubLObject var46, final SubLObject var2) {
        module0021.f1198(var2, module0647.$g5036$.getGlobalValue());
        module0021.f1038(f39297(var46), var2);
        module0021.f1038(f39298(var46), var2);
        module0021.f1038(f39299(var46), var2);
        module0021.f1038(f39300(var46), var2);
        module0021.f1038(f39301(var46), var2);
        module0021.f1038(f39305(var46), var2);
        module0021.f1038(f39304(var46), var2);
        module0021.f1038(f39307(var46), var2);
        module0021.f1038(f39306(var46), var2);
        module0021.f1038(f39308(var46), var2);
        if (module0647.NIL == f39303(var46)) {
            module0021.f1038((SubLObject)module0647.NIL, var2);
        }
        else {
            final SubLObject var47 = Mapping.mapcar((SubLObject)module0647.$ic62$, f39303(var46));
            module0021.f1038(var47, var2);
        }
        module0021.f1038(f39302(var46), var2);
        return var46;
    }
    
    public static SubLObject f39365(final SubLObject var2) {
        final SubLObject var3 = f39322((SubLObject)module0647.UNPROVIDED);
        f39310(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39311(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39312(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39313(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39314(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39318(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39317(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39320(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39319(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39321(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        final SubLObject var4 = module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        SubLObject var5 = (SubLObject)module0647.NIL;
        f39315(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        SubLObject var6 = var4;
        SubLObject var7 = (SubLObject)module0647.NIL;
        var7 = var6.first();
        while (module0647.NIL != var6) {
            final SubLObject var8 = module0067.f4884(f39302(var3), var7, (SubLObject)module0647.UNPROVIDED);
            var5 = (SubLObject)ConsesLow.cons(var8, var5);
            var6 = var6.rest();
            var7 = var6.first();
        }
        f39316(var3, Sequences.nreverse(var5));
        return var3;
    }
    
    public static SubLObject f39366(final SubLObject var175) {
        final SubLObject var176 = f39290((SubLObject)module0647.UNPROVIDED);
        f39280(var176, var175);
        return var176;
    }
    
    public static SubLObject f39359(final SubLObject var175) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0647.NIL != f39269(var175) && (module0647.NIL != f39275(var175) || module0647.NIL != f39274(var175) || module0647.NIL != f39272(var175)));
    }
    
    public static SubLObject f39268(final SubLObject var173, final SubLObject var2, final SubLObject var51) {
        streams_high.write_string((SubLObject)module0647.$ic236$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        PrintLow.format(var2, (SubLObject)module0647.$ic237$, f39270(var173));
        if (f39271(var173).isFixnum()) {
            PrintLow.format(var2, (SubLObject)module0647.$ic238$, f39271(var173));
        }
        else {
            streams_high.write_string((SubLObject)module0647.$ic239$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        }
        if (module0647.NIL == f39276(var173)) {
            streams_high.write_string((SubLObject)module0647.$ic240$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        }
        streams_high.terpri(var2);
        if (module0647.NIL != f39272(var173)) {
            PrintLow.format(var2, (SubLObject)module0647.$ic241$, f39272(var173));
        }
        if (module0647.NIL != f39273(var173)) {
            PrintLow.format(var2, (SubLObject)module0647.$ic242$, f39273(var173));
            module0038.f2648(var2, var51);
        }
        if (module0647.NIL != f39274(var173)) {
            PrintLow.format(var2, (SubLObject)module0647.$ic243$, f39275(var173));
            module0038.f2648(var2, var51);
        }
        if (module0647.NIL != f39274(var173)) {
            PrintLow.format(var2, (SubLObject)module0647.$ic244$, f39274(var173));
            module0038.f2648(var2, var51);
        }
        if (module0647.NIL != f39278(var173)) {
            PrintLow.format(var2, (SubLObject)module0647.$ic245$);
            module0038.f2648(var2, var51);
        }
        if (module0647.NIL != f39277(var173)) {
            PrintLow.format(var2, (SubLObject)module0647.$ic246$, f39277(var173));
            module0038.f2648(var2, var51);
        }
        if (module0647.NIL != f39279(var173)) {
            PrintLow.format(var2, (SubLObject)module0647.$ic247$, f39279(var173));
            module0038.f2648(var2, var51);
        }
        streams_high.write_string((SubLObject)module0647.$ic174$, var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        return var173;
    }
    
    public static SubLObject f39360(final SubLObject var173, SubLObject var2) {
        if (var2 == module0647.UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var174 = SubLProcess.currentSubLThread();
        final SubLObject var175 = module0587.$g4457$.currentBinding(var174);
        try {
            module0587.$g4457$.bind(var2, var174);
            try {
                final SubLObject var54_181 = module0601.$g4652$.currentBinding(var174);
                final SubLObject var176 = module0601.$g4654$.currentBinding(var174);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var174), module0601.$g4652$.getDynamicValue(var174)), var174);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var174), var174);
                    module0601.f36758((SubLObject)module0647.$ic248$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                    f39358(f39270(var173), (SubLObject)module0647.UNPROVIDED);
                    if (f39271(var173).isFixnum()) {
                        try {
                            final SubLObject var54_182 = module0601.$g4652$.currentBinding(var174);
                            final SubLObject var56_183 = module0601.$g4654$.currentBinding(var174);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var174), module0601.$g4652$.getDynamicValue(var174)), var174);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var174), var174);
                                module0601.f36758((SubLObject)module0647.$ic249$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0601.f36763(f39271(var173), (SubLObject)module0647.UNPROVIDED);
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_183, var174);
                                module0601.$g4652$.rebind(var54_182, var174);
                            }
                        }
                        finally {
                            final SubLObject var54_183 = Threads.$is_thread_performing_cleanupP$.currentBinding(var174);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var174);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic249$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_183, var174);
                            }
                        }
                    }
                    if (f39272(var173).isString()) {
                        try {
                            final SubLObject var54_184 = module0601.$g4652$.currentBinding(var174);
                            final SubLObject var56_184 = module0601.$g4654$.currentBinding(var174);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var174), module0601.$g4652$.getDynamicValue(var174)), var174);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var174), var174);
                                module0601.f36758((SubLObject)module0647.$ic250$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0601.f36747(f39272(var173), (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_184, var174);
                                module0601.$g4652$.rebind(var54_184, var174);
                            }
                        }
                        finally {
                            final SubLObject var54_185 = Threads.$is_thread_performing_cleanupP$.currentBinding(var174);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var174);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic250$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_185, var174);
                            }
                        }
                    }
                    if (module0647.NIL != f39275(var173)) {
                        try {
                            final SubLObject var54_186 = module0601.$g4652$.currentBinding(var174);
                            final SubLObject var56_185 = module0601.$g4654$.currentBinding(var174);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var174), module0601.$g4652$.getDynamicValue(var174)), var174);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var174), var174);
                                module0601.f36758((SubLObject)module0647.$ic251$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                SubLObject var177 = f39275(var173);
                                SubLObject var178 = (SubLObject)module0647.NIL;
                                var178 = var177.first();
                                while (module0647.NIL != var177) {
                                    try {
                                        final SubLObject var54_187 = module0601.$g4652$.currentBinding(var174);
                                        final SubLObject var56_186 = module0601.$g4654$.currentBinding(var174);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var174), module0601.$g4652$.getDynamicValue(var174)), var174);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var174), var174);
                                            module0601.f36758((SubLObject)module0647.$ic252$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                            module0797.f50965(var178);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var56_186, var174);
                                            module0601.$g4652$.rebind(var54_187, var174);
                                        }
                                    }
                                    finally {
                                        final SubLObject var54_188 = Threads.$is_thread_performing_cleanupP$.currentBinding(var174);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var174);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0647.$ic252$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var54_188, var174);
                                        }
                                    }
                                    var177 = var177.rest();
                                    var178 = var177.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_185, var174);
                                module0601.$g4652$.rebind(var54_186, var174);
                            }
                        }
                        finally {
                            final SubLObject var54_189 = Threads.$is_thread_performing_cleanupP$.currentBinding(var174);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var174);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic251$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_189, var174);
                            }
                        }
                    }
                    if (module0647.NIL != f39273(var173)) {
                        try {
                            final SubLObject var54_190 = module0601.$g4652$.currentBinding(var174);
                            final SubLObject var56_187 = module0601.$g4654$.currentBinding(var174);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var174), module0601.$g4652$.getDynamicValue(var174)), var174);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var174), var174);
                                module0601.f36758((SubLObject)module0647.$ic253$, (SubLObject)module0647.NIL, (SubLObject)module0647.$ic220$, (SubLObject)module0647.NIL);
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_187, var174);
                                module0601.$g4652$.rebind(var54_190, var174);
                            }
                        }
                        finally {
                            final SubLObject var54_191 = Threads.$is_thread_performing_cleanupP$.currentBinding(var174);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var174);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_191, var174);
                            }
                        }
                    }
                    if (module0647.NIL != f39276(var173)) {
                        try {
                            final SubLObject var54_192 = module0601.$g4652$.currentBinding(var174);
                            final SubLObject var56_188 = module0601.$g4654$.currentBinding(var174);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var174), module0601.$g4652$.getDynamicValue(var174)), var174);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var174), var174);
                                module0601.f36758((SubLObject)module0647.$ic254$, (SubLObject)module0647.NIL, (SubLObject)module0647.$ic220$, (SubLObject)module0647.NIL);
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_188, var174);
                                module0601.$g4652$.rebind(var54_192, var174);
                            }
                        }
                        finally {
                            final SubLObject var54_193 = Threads.$is_thread_performing_cleanupP$.currentBinding(var174);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var174);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_193, var174);
                            }
                        }
                    }
                    if (module0647.NIL != f39278(var173)) {
                        try {
                            final SubLObject var54_194 = module0601.$g4652$.currentBinding(var174);
                            final SubLObject var56_189 = module0601.$g4654$.currentBinding(var174);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var174), module0601.$g4652$.getDynamicValue(var174)), var174);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var174), var174);
                                module0601.f36758((SubLObject)module0647.$ic255$, (SubLObject)module0647.NIL, (SubLObject)module0647.$ic220$, (SubLObject)module0647.NIL);
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_189, var174);
                                module0601.$g4652$.rebind(var54_194, var174);
                            }
                        }
                        finally {
                            final SubLObject var54_195 = Threads.$is_thread_performing_cleanupP$.currentBinding(var174);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var174);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_195, var174);
                            }
                        }
                    }
                    if (module0647.NIL != f39277(var173)) {
                        try {
                            final SubLObject var54_196 = module0601.$g4652$.currentBinding(var174);
                            final SubLObject var56_190 = module0601.$g4654$.currentBinding(var174);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var174), module0601.$g4652$.getDynamicValue(var174)), var174);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var174), var174);
                                module0601.f36758((SubLObject)module0647.$ic256$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0601.f36747(f39277(var173), (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_190, var174);
                                module0601.$g4652$.rebind(var54_196, var174);
                            }
                        }
                        finally {
                            final SubLObject var54_197 = Threads.$is_thread_performing_cleanupP$.currentBinding(var174);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var174);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic256$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_197, var174);
                            }
                        }
                    }
                    if (module0647.NIL != f39279(var173)) {
                        try {
                            final SubLObject var54_198 = module0601.$g4652$.currentBinding(var174);
                            final SubLObject var56_191 = module0601.$g4654$.currentBinding(var174);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var174), module0601.$g4652$.getDynamicValue(var174)), var174);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var174), var174);
                                module0601.f36758((SubLObject)module0647.$ic257$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0797.f50965(f39279(var173));
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_191, var174);
                                module0601.$g4652$.rebind(var54_198, var174);
                            }
                        }
                        finally {
                            final SubLObject var54_199 = Threads.$is_thread_performing_cleanupP$.currentBinding(var174);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var174);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic257$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_199, var174);
                            }
                        }
                    }
                    if (module0647.NIL != f39274(var173)) {
                        try {
                            final SubLObject var54_200 = module0601.$g4652$.currentBinding(var174);
                            final SubLObject var56_192 = module0601.$g4654$.currentBinding(var174);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var174), module0601.$g4652$.getDynamicValue(var174)), var174);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var174), var174);
                                module0601.f36758((SubLObject)module0647.$ic258$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                SubLObject var177 = f39274(var173);
                                SubLObject var179 = (SubLObject)module0647.NIL;
                                var179 = var177.first();
                                while (module0647.NIL != var177) {
                                    try {
                                        final SubLObject var54_201 = module0601.$g4652$.currentBinding(var174);
                                        final SubLObject var56_193 = module0601.$g4654$.currentBinding(var174);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var174), module0601.$g4652$.getDynamicValue(var174)), var174);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var174), var174);
                                            module0601.f36758((SubLObject)module0647.$ic259$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                            module0797.f50965(var179);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var56_193, var174);
                                            module0601.$g4652$.rebind(var54_201, var174);
                                        }
                                    }
                                    finally {
                                        final SubLObject var54_202 = Threads.$is_thread_performing_cleanupP$.currentBinding(var174);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var174);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0647.$ic259$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var54_202, var174);
                                        }
                                    }
                                    var177 = var177.rest();
                                    var179 = var177.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_192, var174);
                                module0601.$g4652$.rebind(var54_200, var174);
                            }
                        }
                        finally {
                            final SubLObject var54_203 = Threads.$is_thread_performing_cleanupP$.currentBinding(var174);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var174);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic258$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_203, var174);
                            }
                        }
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var176, var174);
                    module0601.$g4652$.rebind(var54_181, var174);
                }
            }
            finally {
                final SubLObject var54_204 = Threads.$is_thread_performing_cleanupP$.currentBinding(var174);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var174);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0647.$ic248$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var54_204, var174);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var175, var174);
        }
        return var173;
    }
    
    public static SubLObject f39367(final SubLObject var101, final SubLObject var2) {
        return f39368(var101, var2);
    }
    
    public static SubLObject f39368(final SubLObject var173, final SubLObject var2) {
        module0021.f1198(var2, module0647.$g5034$.getGlobalValue());
        module0021.f1038(f39270(var173), var2);
        module0021.f1038(f39271(var173), var2);
        module0021.f1038(f39272(var173), var2);
        module0021.f1038(f39275(var173), var2);
        module0021.f1038(f39273(var173), var2);
        module0021.f1038(f39276(var173), var2);
        module0021.f1038(f39278(var173), var2);
        module0021.f1038(f39277(var173), var2);
        module0021.f1038(f39279(var173), var2);
        module0021.f1038(f39274(var173), var2);
        return var173;
    }
    
    public static SubLObject f39369(final SubLObject var2) {
        final SubLObject var3 = f39290((SubLObject)module0647.UNPROVIDED);
        f39280(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39281(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39282(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39285(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39283(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39286(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39288(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39287(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39289(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        f39284(var3, module0021.f1060(var2, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        return var3;
    }
    
    public static SubLObject f39358(final SubLObject var218, SubLObject var2) {
        if (var2 == module0647.UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var219 = SubLProcess.currentSubLThread();
        final SubLObject var220 = module0587.$g4457$.currentBinding(var219);
        try {
            module0587.$g4457$.bind(var2, var219);
            try {
                final SubLObject var54_219 = module0601.$g4652$.currentBinding(var219);
                final SubLObject var221 = module0601.$g4654$.currentBinding(var219);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var219), module0601.$g4652$.getDynamicValue(var219)), var219);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var219), var219);
                    module0601.f36758((SubLObject)module0647.$ic261$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                    SubLObject var222 = var218.rest();
                    SubLObject var223 = (SubLObject)module0647.NIL;
                    var223 = var222.first();
                    while (module0647.NIL != var222) {
                        try {
                            final SubLObject var54_220 = module0601.$g4652$.currentBinding(var219);
                            final SubLObject var56_222 = module0601.$g4654$.currentBinding(var219);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var219), module0601.$g4652$.getDynamicValue(var219)), var219);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var219), var219);
                                module0601.f36758((SubLObject)module0647.$ic262$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0601.f36763(var223, (SubLObject)module0647.UNPROVIDED);
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_222, var219);
                                module0601.$g4652$.rebind(var54_220, var219);
                            }
                        }
                        finally {
                            final SubLObject var54_221 = Threads.$is_thread_performing_cleanupP$.currentBinding(var219);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var219);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic262$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_221, var219);
                            }
                        }
                        var222 = var222.rest();
                        var223 = var222.first();
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var221, var219);
                    module0601.$g4652$.rebind(var54_219, var219);
                }
            }
            finally {
                final SubLObject var54_222 = Threads.$is_thread_performing_cleanupP$.currentBinding(var219);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var219);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0647.$ic261$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var54_222, var219);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var220, var219);
        }
        return var218;
    }
    
    public static SubLObject f39370(final SubLObject var225, final SubLObject var46, final SubLObject var110) {
        final SubLThread var226 = SubLProcess.currentSubLThread();
        if (module0647.NIL != var225 && !module0647.areAssertionsDisabledFor(me) && module0647.NIL == module0173.f10955(var225)) {
            throw new AssertionError(var225);
        }
        assert module0647.NIL != f39295(var46) : var46;
        assert module0647.NIL != module0161.f10481(var110) : var110;
        final SubLObject var227 = f39297(var46);
        if (module0647.NIL == Errors.$ignore_mustsP$.getDynamicValue(var226) && module0647.NIL == module0173.f10955(var227)) {
            Errors.error((SubLObject)module0647.$ic264$, var46);
        }
        f39311(var46, f39371(var227, var110));
        f39313(var46, f39372(var227, var110));
        f39319(var46, f39373(var227, var110));
        f39320(var46, f39374(var227, var110));
        f39321(var46, f39375(var227, var110));
        if (module0647.NIL != module0173.f10955(var225)) {
            f39314(var46, f39376(var227, var225, var110));
            f39318(var46, f39377(var227, var225, var110));
            f39317(var46, f39378(var227, var225, var110));
        }
        f39379(var46, var110, var225);
        return var46;
    }
    
    public static SubLObject f39379(final SubLObject var46, final SubLObject var110, SubLObject var225) {
        if (var225 == module0647.UNPROVIDED) {
            var225 = (SubLObject)module0647.NIL;
        }
        final SubLThread var226 = SubLProcess.currentSubLThread();
        final SubLObject var227 = f39297(var46);
        if (module0647.NIL == Errors.$ignore_mustsP$.getDynamicValue(var226) && module0647.NIL == module0173.f10955(var227)) {
            Errors.error((SubLObject)module0647.$ic264$, var46);
        }
        if (module0647.NIL != module0128.f8463(module0647.$ic265$, (SubLObject)module0647.UNPROVIDED) && module0647.NIL != module0222.f14635(module0647.$ic265$, var227, (SubLObject)module0647.ONE_INTEGER, (SubLObject)module0647.T)) {
            f39380(var46, f39381(var227, var225, var110));
            f39382(var46, f39383(var227, var110));
            f39384(var46, f39385(var227, var110));
            f39386(var46, f39387(var227, var110));
            if (module0647.NIL != module0173.f10955(var225)) {
                f39388(var46, f39389(var227, var225, var110));
                f39390(var46, f39391(var227, var225, var110));
            }
            f39392(var46, f39393(var227, var110));
            f39394(var46, f39395(var227, var110));
            f39396(var46);
            if (module0647.NIL == module0067.f4882(f39302(var46))) {}
        }
        return var46;
    }
    
    public static SubLObject f39388(final SubLObject var46, final SubLObject var226) {
        SubLObject var227 = var226;
        SubLObject var228 = (SubLObject)module0647.NIL;
        var228 = var227.first();
        while (module0647.NIL != var227) {
            SubLObject var230;
            final SubLObject var229 = var230 = var228;
            SubLObject var231 = (SubLObject)module0647.NIL;
            SubLObject var232 = (SubLObject)module0647.NIL;
            SubLObject var233 = (SubLObject)module0647.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var230, var229, (SubLObject)module0647.$ic266$);
            var231 = var230.first();
            var230 = var230.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var230, var229, (SubLObject)module0647.$ic266$);
            var232 = var230.first();
            var230 = var230.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var230, var229, (SubLObject)module0647.$ic266$);
            var233 = var230.first();
            var230 = var230.rest();
            if (module0647.NIL == var230) {
                final SubLObject var234 = f39397(var46, var232);
                f39281(var234, var233);
                f39282(var234, var231);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var229, (SubLObject)module0647.$ic266$);
            }
            var227 = var227.rest();
            var228 = var227.first();
        }
        return var46;
    }
    
    public static SubLObject f39390(final SubLObject var46, final SubLObject var231) {
        SubLObject var232 = var231;
        SubLObject var233 = (SubLObject)module0647.NIL;
        var233 = var232.first();
        while (module0647.NIL != var232) {
            SubLObject var235;
            final SubLObject var234 = var235 = var233;
            SubLObject var236 = (SubLObject)module0647.NIL;
            SubLObject var237 = (SubLObject)module0647.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var235, var234, (SubLObject)module0647.$ic267$);
            var236 = var235.first();
            var235 = var235.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var235, var234, (SubLObject)module0647.$ic267$);
            var237 = var235.first();
            var235 = var235.rest();
            if (module0647.NIL == var235) {
                final SubLObject var238 = f39397(var46, var237);
                f39287(var238, var236);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var234, (SubLObject)module0647.$ic267$);
            }
            var232 = var232.rest();
            var233 = var232.first();
        }
        return var46;
    }
    
    public static SubLObject f39380(final SubLObject var46, final SubLObject var236) {
        SubLObject var237 = var236;
        SubLObject var238 = (SubLObject)module0647.NIL;
        var238 = var237.first();
        while (module0647.NIL != var237) {
            final SubLObject var239 = f39397(var46, var238);
            f39283(var239, (SubLObject)module0647.T);
            var237 = var237.rest();
            var238 = var237.first();
        }
        return var46;
    }
    
    public static SubLObject f39382(final SubLObject var46, final SubLObject var238) {
        SubLObject var239 = var238;
        SubLObject var240 = (SubLObject)module0647.NIL;
        var240 = var239.first();
        while (module0647.NIL != var239) {
            final SubLObject var241 = f39397(var46, var240);
            f39286(var241, (SubLObject)module0647.T);
            var239 = var239.rest();
            var240 = var239.first();
        }
        return var46;
    }
    
    public static SubLObject f39384(final SubLObject var46, final SubLObject var240) {
        SubLObject var241 = var240;
        SubLObject var242 = (SubLObject)module0647.NIL;
        var242 = var241.first();
        while (module0647.NIL != var241) {
            SubLObject var244;
            final SubLObject var243 = var244 = var242;
            SubLObject var245 = (SubLObject)module0647.NIL;
            SubLObject var246 = (SubLObject)module0647.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var244, var243, (SubLObject)module0647.$ic268$);
            var245 = var244.first();
            var244 = var244.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var244, var243, (SubLObject)module0647.$ic268$);
            var246 = var244.first();
            var244 = var244.rest();
            if (module0647.NIL == var244) {
                final SubLObject var247 = f39397(var46, var245);
                f39284(var247, var246);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var243, (SubLObject)module0647.$ic268$);
            }
            var241 = var241.rest();
            var242 = var241.first();
        }
        return var46;
    }
    
    public static SubLObject f39386(final SubLObject var46, final SubLObject var244) {
        SubLObject var245 = var244;
        SubLObject var246 = (SubLObject)module0647.NIL;
        var246 = var245.first();
        while (module0647.NIL != var245) {
            SubLObject var248;
            final SubLObject var247 = var248 = var246;
            SubLObject var249 = (SubLObject)module0647.NIL;
            SubLObject var250 = (SubLObject)module0647.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var248, var247, (SubLObject)module0647.$ic269$);
            var249 = var248.first();
            var248 = var248.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var248, var247, (SubLObject)module0647.$ic269$);
            var250 = var248.first();
            var248 = var248.rest();
            if (module0647.NIL == var248) {
                final SubLObject var251 = f39397(var46, var249);
                f39285(var251, var250);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var247, (SubLObject)module0647.$ic269$);
            }
            var245 = var245.rest();
            var246 = var245.first();
        }
        return var46;
    }
    
    public static SubLObject f39392(final SubLObject var46, final SubLObject var249) {
        SubLObject var250 = var249;
        SubLObject var251 = (SubLObject)module0647.NIL;
        var251 = var250.first();
        while (module0647.NIL != var250) {
            final SubLObject var252 = f39397(var46, var251);
            f39288(var252, (SubLObject)module0647.T);
            var250 = var250.rest();
            var251 = var250.first();
        }
        return var46;
    }
    
    public static SubLObject f39394(final SubLObject var46, final SubLObject var244) {
        SubLObject var245 = var244;
        SubLObject var246 = (SubLObject)module0647.NIL;
        var246 = var245.first();
        while (module0647.NIL != var245) {
            SubLObject var248;
            final SubLObject var247 = var248 = var246;
            SubLObject var249 = (SubLObject)module0647.NIL;
            SubLObject var250 = (SubLObject)module0647.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var248, var247, (SubLObject)module0647.$ic270$);
            var249 = var248.first();
            var248 = var248.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var248, var247, (SubLObject)module0647.$ic270$);
            var250 = var248.first();
            var248 = var248.rest();
            if (module0647.NIL == var248) {
                final SubLObject var251 = f39397(var46, var249);
                f39289(var251, var250);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var247, (SubLObject)module0647.$ic270$);
            }
            var245 = var245.rest();
            var246 = var245.first();
        }
        return var46;
    }
    
    public static SubLObject f39397(final SubLObject var46, final SubLObject var175) {
        final SubLObject var176 = f39302(var46);
        SubLObject var177 = module0067.f4884(var176, var175, (SubLObject)module0647.NIL);
        if (module0647.NIL == f39269(var177)) {
            var177 = f39366(var175);
            module0067.f4886(var176, var175, var177);
        }
        return var177;
    }
    
    public static SubLObject f39396(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)module0647.NIL;
        SubLObject var49 = (SubLObject)module0647.NIL;
        SubLObject var50 = (SubLObject)module0647.NIL;
        SubLObject var51;
        for (var51 = module0066.f4838(module0067.f4891(f39302(var46))); module0647.NIL == module0066.f4841(var51); var51 = module0066.f4840(var51)) {
            var47.resetMultipleValues();
            final SubLObject var52 = module0066.f4839(var51);
            final SubLObject var53 = var47.secondMultipleValue();
            var47.resetMultipleValues();
            if (f39271(var53).isFixnum()) {
                var49 = (SubLObject)ConsesLow.cons(var53, var49);
            }
            else {
                var50 = (SubLObject)ConsesLow.cons(var53, var50);
            }
        }
        module0066.f4842(var51);
        var48 = f39398(var49, var50);
        f39316(var46, var48);
        return var46;
    }
    
    public static SubLObject f39398(final SubLObject var255, final SubLObject var256) {
        return Sequences.cconcatenate(f39399(var255), Sort.sort(var256, (SubLObject)module0647.$ic271$, (SubLObject)module0647.$ic62$));
    }
    
    public static SubLObject f39399(final SubLObject var254) {
        return Sort.sort(var254, Symbols.symbol_function((SubLObject)module0647.$ic272$), (SubLObject)module0647.$ic64$);
    }
    
    public static SubLObject f39400(final SubLObject var257, final SubLObject var258) {
        if (!var257.isCons()) {
            return (SubLObject)module0647.T;
        }
        if (!var258.isCons()) {
            return (SubLObject)module0647.NIL;
        }
        if (!var257.first().isFixnum()) {
            return (SubLObject)module0647.T;
        }
        if (!var258.first().isFixnum()) {
            return (SubLObject)module0647.NIL;
        }
        if (var257.first().numE(var258.first())) {
            return f39400(var257.rest(), var258.rest());
        }
        return Numbers.numL(var257.first(), var258.first());
    }
    
    public static SubLObject f39401(final SubLObject var259, final SubLObject var110) {
        assert module0647.NIL != module0202.f12657(var259) : var259;
        assert module0647.NIL != module0161.f10481(var110) : var110;
        final SubLObject var260 = module0285.f18875(var259, (SubLObject)module0647.UNPROVIDED);
        final SubLObject var261 = f39347(var260, (SubLObject)module0647.UNPROVIDED);
        f39320(var261, f39374(var260, var110));
        f39313(var261, var110);
        return var261;
    }
    
    public static SubLObject f39402(final SubLObject var260, final SubLObject var110) {
        assert module0647.NIL != module0202.f12657(var260) : var260;
        assert module0647.NIL != module0161.f10481(var110) : var110;
        final SubLObject var261 = module0285.f18875(var260, (SubLObject)module0647.UNPROVIDED);
        final SubLObject var262 = f39347(var261, (SubLObject)module0647.UNPROVIDED);
        final SubLObject var263 = f39403(var261, var110);
        if (module0647.NIL == var263) {
            f39311(var262, f39371(var261, var110));
            f39313(var262, f39372(var261, var110));
        }
        else {
            final SubLObject var264 = module0637.f38922(var263, var110);
            f39312(var262, var264);
            if (module0647.NIL == module0637.f38900(var264)) {
                Errors.warn((SubLObject)module0647.$ic274$, var261, var110);
                module0637.f38918(var264, var110);
            }
            f39313(var262, module0637.f38900(var264));
        }
        f39319(var262, f39373(var261, var110));
        f39320(var262, f39374(var261, var110));
        f39379(var262, var110, (SubLObject)module0647.UNPROVIDED);
        return var262;
    }
    
    public static SubLObject f39404(final SubLObject var46, final SubLObject var110) {
        final SubLObject var111 = f39297(var46);
        final SubLObject var112 = f39403(var111, var110);
        if (module0647.NIL == var112) {
            f39311(var46, f39371(var111, var110));
            return var46;
        }
        final SubLObject var113 = module0637.f38922(var112, var110);
        f39312(var46, var113);
        return var46;
    }
    
    public static SubLObject f39405(final SubLObject var32, final SubLObject var262, final SubLObject var110) {
        final SubLObject var263 = (SubLObject)module0647.ONE_INTEGER;
        final SubLObject var264 = (SubLObject)module0647.NIL;
        final SubLObject var265 = (SubLObject)module0647.NIL;
        final SubLObject var266 = (SubLObject)module0647.NIL;
        final SubLObject var267 = (SubLObject)module0647.$ic275$;
        return f39406(var32, var264, var262, var110, var263, var265, var267, var266);
    }
    
    public static SubLObject f39375(final SubLObject var32, final SubLObject var110) {
        return f39405(var32, module0647.$ic276$, var110);
    }
    
    public static SubLObject f39403(final SubLObject var32, final SubLObject var110) {
        if (module0647.NIL != module0167.f10813(var32) && module0205.f13276(var32).eql(module0647.$ic277$)) {
            return module0205.f13277(var32, (SubLObject)module0647.UNPROVIDED);
        }
        return f39405(var32, module0647.$ic278$, var110);
    }
    
    public static SubLObject f39371(final SubLObject var32, final SubLObject var110) {
        return f39405(var32, module0647.$ic279$, var110);
    }
    
    public static SubLObject f39372(final SubLObject var32, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        final SubLObject var112 = (SubLObject)module0647.ONE_INTEGER;
        final SubLObject var113 = (SubLObject)module0647.NIL;
        final SubLObject var114 = (SubLObject)module0647.NIL;
        final SubLObject var115 = (SubLObject)module0647.$ic275$;
        final SubLObject var116 = (SubLObject)module0647.NIL;
        SubLObject var117 = f39406(var32, var114, module0647.$ic280$, var110, var112, var113, var115, var116);
        if (module0647.NIL == var117) {
            if (module0647.NIL != module0205.f13296(module0586.$g4456$.getDynamicValue(var111))) {
                var117 = module0285.f18875(module0586.$g4456$.getDynamicValue(var111), (SubLObject)module0647.UNPROVIDED);
            }
            else {
                var117 = var110;
            }
        }
        return var117;
    }
    
    public static SubLObject f39373(final SubLObject var32, final SubLObject var110) {
        final SubLObject var111 = (SubLObject)module0647.ONE_INTEGER;
        final SubLObject var112 = (SubLObject)module0647.TWO_INTEGER;
        final SubLObject var113 = (SubLObject)module0647.THREE_INTEGER;
        final SubLObject var114 = (SubLObject)module0647.NIL;
        final SubLObject var115 = (SubLObject)module0647.NIL;
        final SubLObject var116 = (SubLObject)module0647.NIL;
        final SubLObject var117 = f39407(var32, var115, module0647.$ic281$, var110, var111, var114, (SubLObject)ConsesLow.list(var112, var113), var116, (SubLObject)module0647.UNPROVIDED);
        final SubLObject var118 = module0035.remove_if_not((SubLObject)module0647.$ic282$, f39407(var32, var115, module0647.$ic281$, var110, var112, var114, (SubLObject)ConsesLow.list(var111, var113), var116, (SubLObject)module0647.UNPROVIDED), Symbols.symbol_function((SubLObject)module0647.$ic283$), (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        final SubLObject var119 = ConsesLow.append(var117, var118);
        SubLObject var120 = (SubLObject)module0647.NIL;
        SubLObject var121 = var119;
        SubLObject var122 = (SubLObject)module0647.NIL;
        var122 = var121.first();
        while (module0647.NIL != var121) {
            SubLObject var124;
            final SubLObject var123 = var124 = var122;
            SubLObject var125 = (SubLObject)module0647.NIL;
            SubLObject var126 = (SubLObject)module0647.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var124, var123, (SubLObject)module0647.$ic284$);
            var125 = var124.first();
            var124 = var124.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var124, var123, (SubLObject)module0647.$ic284$);
            var126 = var124.first();
            var124 = var124.rest();
            if (module0647.NIL == var124) {
                var120 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var125, var126, var110), var120);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var123, (SubLObject)module0647.$ic284$);
            }
            var121 = var121.rest();
            var122 = var121.first();
        }
        return Sequences.nreverse(var120);
    }
    
    public static SubLObject f39374(final SubLObject var32, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        final SubLObject var112 = f39408(var110);
        SubLObject var113 = (SubLObject)module0647.NIL;
        final SubLObject var114 = module0147.f9540(var112);
        final SubLObject var115 = module0147.$g2095$.currentBinding(var111);
        final SubLObject var116 = module0147.$g2094$.currentBinding(var111);
        final SubLObject var117 = module0147.$g2096$.currentBinding(var111);
        try {
            module0147.$g2095$.bind(module0147.f9545(var114), var111);
            module0147.$g2094$.bind(module0147.f9546(var114), var111);
            module0147.$g2096$.bind(module0147.f9549(var114), var111);
            var113 = module0220.f14553(var32, module0647.$ic285$, (SubLObject)module0647.ONE_INTEGER, (SubLObject)module0647.TWO_INTEGER, (SubLObject)module0647.$ic286$);
        }
        finally {
            module0147.$g2096$.rebind(var117, var111);
            module0147.$g2094$.rebind(var116, var111);
            module0147.$g2095$.rebind(var115, var111);
        }
        return var113;
    }
    
    public static SubLObject f39408(final SubLObject var278) {
        return f39409(var278, (SubLObject)module0647.$ic287$);
    }
    
    public static SubLObject f39410(final SubLObject var278) {
        return f39409(var278, module0647.$ic288$);
    }
    
    public static SubLObject f39409(final SubLObject var279, final SubLObject var280) {
        final SubLObject var281 = module0161.f10557(var279);
        return (module0647.NIL != module0161.f10481(var281)) ? module0161.f10518((SubLObject)ConsesLow.list(var281, var280)) : var279;
    }
    
    public static SubLObject f39389(final SubLObject var32, final SubLObject var225, final SubLObject var110) {
        final SubLObject var226 = (SubLObject)module0647.ONE_INTEGER;
        final SubLObject var227 = (SubLObject)module0647.TWO_INTEGER;
        final SubLObject var228 = (SubLObject)module0647.$ic289$;
        final SubLObject var229 = f39411();
        return f39407(var32, var225, module0647.$ic290$, var110, var226, var227, var228, var229, (SubLObject)module0647.UNPROVIDED);
    }
    
    public static SubLObject f39391(final SubLObject var32, final SubLObject var225, final SubLObject var110) {
        final SubLObject var226 = (SubLObject)module0647.ONE_INTEGER;
        final SubLObject var227 = (SubLObject)module0647.TWO_INTEGER;
        final SubLObject var228 = (SubLObject)module0647.$ic291$;
        final SubLObject var229 = f39411();
        return f39407(var32, var225, module0647.$ic292$, var110, var226, var227, var228, var229, (SubLObject)module0647.UNPROVIDED);
    }
    
    public static SubLObject f39378(final SubLObject var32, final SubLObject var225, final SubLObject var110) {
        return f39407(var32, var225, module0647.$ic293$, var110, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
    }
    
    public static SubLObject f39406(final SubLObject var32, final SubLObject var225, final SubLObject var262, final SubLObject var110, SubLObject var263, SubLObject var264, SubLObject var266, SubLObject var265) {
        if (var263 == module0647.UNPROVIDED) {
            var263 = (SubLObject)module0647.ONE_INTEGER;
        }
        if (var264 == module0647.UNPROVIDED) {
            var264 = (SubLObject)module0647.TWO_INTEGER;
        }
        if (var266 == module0647.UNPROVIDED) {
            var266 = (SubLObject)ConsesLow.list((SubLObject)module0647.THREE_INTEGER);
        }
        if (var265 == module0647.UNPROVIDED) {
            var265 = f39411();
        }
        final SubLObject var267 = (SubLObject)module0647.T;
        return f39407(var32, var225, var262, var110, var263, var264, var266, var265, var267).first();
    }
    
    public static SubLObject f39407(final SubLObject var32, final SubLObject var225, final SubLObject var262, final SubLObject var110, SubLObject var263, SubLObject var264, SubLObject var266, SubLObject var265, SubLObject var282) {
        if (var263 == module0647.UNPROVIDED) {
            var263 = (SubLObject)module0647.ONE_INTEGER;
        }
        if (var264 == module0647.UNPROVIDED) {
            var264 = (SubLObject)module0647.TWO_INTEGER;
        }
        if (var266 == module0647.UNPROVIDED) {
            var266 = (SubLObject)ConsesLow.list((SubLObject)module0647.THREE_INTEGER);
        }
        if (var265 == module0647.UNPROVIDED) {
            var265 = f39411();
        }
        if (var282 == module0647.UNPROVIDED) {
            var282 = (SubLObject)module0647.NIL;
        }
        final SubLThread var283 = SubLProcess.currentSubLThread();
        final SubLObject var284 = Mapping.mapcar((SubLObject)module0647.$ic294$, var266);
        final SubLObject var285 = module0225.f14762(var262);
        SubLObject var286 = (SubLObject)ConsesLow.cons(var262, Mapping.mapcar((SubLObject)module0647.$ic294$, module0035.f2160(var285, (SubLObject)module0647.ONE_INTEGER)));
        SubLObject var287 = (SubLObject)module0647.NIL;
        final SubLObject var288 = (SubLObject)module0647.NIL;
        if (var263.isInteger()) {
            var286 = module0035.f2044(var263, var32, var286);
        }
        if (module0647.NIL != var265) {
            final SubLObject var289 = module0193.f12075(var264);
            var287 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0647.$ic295$, var225, var289), var287);
        }
        else if (module0647.NIL != module0004.f105(var264)) {
            var286 = module0035.f2044(var264, var225, var286);
        }
        var287 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0647.$ic296$, var286), var287);
        final SubLObject var290 = (module0647.NIL != module0035.f1997(var284)) ? var284.first() : var284;
        SubLObject var291 = (SubLObject)module0647.NIL;
        SubLObject var292 = (SubLObject)module0647.NIL;
        if (module0647.NIL != var282) {
            var291 = conses_high.putf(var291, (SubLObject)module0647.$ic297$, (SubLObject)module0647.ONE_INTEGER);
        }
        if (module0647.NIL != var288 || module0647.NIL != module0035.f2002(var287, (SubLObject)module0647.ONE_INTEGER, (SubLObject)module0647.UNPROVIDED)) {
            final SubLObject var293 = module0232.f15305(var288, var287);
            var291 = conses_high.putf(var291, (SubLObject)module0647.$ic298$, (SubLObject)module0647.NIL);
            var291 = conses_high.putf(var291, (SubLObject)module0647.$ic299$, module0586.f35849());
            var291 = conses_high.putf(var291, (SubLObject)module0647.$ic300$, (SubLObject)ConsesLow.list((SubLObject)module0647.$ic301$, var290));
            var291 = conses_high.putf(var291, (SubLObject)module0647.$ic302$, (SubLObject)module0647.$ic303$);
            var292 = module0409.f28508(var293, var110, (SubLObject)module0647.NIL, var291);
        }
        else {
            SubLObject var294 = (SubLObject)module0647.NIL;
            if (module0647.NIL != var225 && module0647.NIL != module0004.f105(var264) && module0647.NIL != var32 && module0647.NIL != module0004.f105(var263)) {
                final SubLObject var295 = module0147.f9540(var110);
                final SubLObject var296 = module0147.$g2095$.currentBinding(var283);
                final SubLObject var297 = module0147.$g2094$.currentBinding(var283);
                final SubLObject var298 = module0147.$g2096$.currentBinding(var283);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var295), var283);
                    module0147.$g2094$.bind(module0147.f9546(var295), var283);
                    module0147.$g2096$.bind(module0147.f9549(var295), var283);
                    var294 = module0220.f14572(var262, var32, var225, var263, var264, (SubLObject)module0647.$ic286$);
                }
                finally {
                    module0147.$g2096$.rebind(var298, var283);
                    module0147.$g2094$.rebind(var297, var283);
                    module0147.$g2095$.rebind(var296, var283);
                }
            }
            else if (module0647.NIL != var32 && module0647.NIL != module0004.f105(var263)) {
                final SubLObject var295 = module0147.f9540(var110);
                final SubLObject var296 = module0147.$g2095$.currentBinding(var283);
                final SubLObject var297 = module0147.$g2094$.currentBinding(var283);
                final SubLObject var298 = module0147.$g2096$.currentBinding(var283);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var295), var283);
                    module0147.$g2094$.bind(module0147.f9546(var295), var283);
                    module0147.$g2096$.bind(module0147.f9549(var295), var283);
                    var294 = module0220.f14558(var32, var262, var263, (SubLObject)module0647.$ic286$);
                }
                finally {
                    module0147.$g2096$.rebind(var298, var283);
                    module0147.$g2094$.rebind(var297, var283);
                    module0147.$g2095$.rebind(var296, var283);
                }
            }
            else if (module0647.NIL != var225 && module0647.NIL != module0004.f105(var264)) {
                final SubLObject var295 = module0147.f9540(var110);
                final SubLObject var296 = module0147.$g2095$.currentBinding(var283);
                final SubLObject var297 = module0147.$g2094$.currentBinding(var283);
                final SubLObject var298 = module0147.$g2096$.currentBinding(var283);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var295), var283);
                    module0147.$g2094$.bind(module0147.f9546(var295), var283);
                    module0147.$g2096$.bind(module0147.f9549(var295), var283);
                    var294 = module0220.f14558(var225, var262, var264, (SubLObject)module0647.$ic286$);
                }
                finally {
                    module0147.$g2096$.rebind(var298, var283);
                    module0147.$g2094$.rebind(var297, var283);
                    module0147.$g2095$.rebind(var296, var283);
                }
            }
            if (module0647.NIL != var294) {
                if (module0647.NIL != module0035.f1997(var266)) {
                    final SubLObject var299 = var266.first();
                    if (module0647.NIL != var282) {
                        var292 = (SubLObject)ConsesLow.cons(module0178.f11331(var294.first(), var299), var292);
                    }
                    else {
                        SubLObject var300 = var294;
                        SubLObject var301 = (SubLObject)module0647.NIL;
                        var301 = var300.first();
                        while (module0647.NIL != var300) {
                            var292 = (SubLObject)ConsesLow.cons(module0178.f11331(var301, var299), var292);
                            var300 = var300.rest();
                            var301 = var300.first();
                        }
                    }
                }
                else if (module0647.NIL != var282) {
                    final SubLObject var302 = var294.first();
                    SubLObject var303 = (SubLObject)module0647.NIL;
                    SubLObject var304 = var266;
                    SubLObject var305 = (SubLObject)module0647.NIL;
                    var305 = var304.first();
                    while (module0647.NIL != var304) {
                        var303 = (SubLObject)ConsesLow.cons(module0178.f11331(var302, var305), var303);
                        var304 = var304.rest();
                        var305 = var304.first();
                    }
                    var292 = (SubLObject)ConsesLow.list(Sequences.nreverse(var303));
                }
                else {
                    SubLObject var306 = var294;
                    SubLObject var307 = (SubLObject)module0647.NIL;
                    var307 = var306.first();
                    while (module0647.NIL != var306) {
                        SubLObject var308 = (SubLObject)module0647.NIL;
                        SubLObject var52_295 = var266;
                        SubLObject var309 = (SubLObject)module0647.NIL;
                        var309 = var52_295.first();
                        while (module0647.NIL != var52_295) {
                            var308 = (SubLObject)ConsesLow.cons(module0178.f11331(var307, var309), var308);
                            var52_295 = var52_295.rest();
                            var309 = var52_295.first();
                        }
                        var292 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var308), var292);
                        var306 = var306.rest();
                        var307 = var306.first();
                    }
                }
            }
        }
        return var292;
    }
    
    public static SubLObject f39376(final SubLObject var32, final SubLObject var225, final SubLObject var110) {
        final SubLObject var226 = (SubLObject)module0647.ONE_INTEGER;
        final SubLObject var227 = (SubLObject)module0647.THREE_INTEGER;
        final SubLObject var228 = (SubLObject)module0647.$ic275$;
        final SubLObject var229 = f39411();
        return f39407(var32, var225, module0647.$ic304$, var110, var226, var227, var228, var229, (SubLObject)module0647.UNPROVIDED);
    }
    
    public static SubLObject f39377(final SubLObject var32, final SubLObject var225, final SubLObject var110) {
        final SubLObject var226 = (SubLObject)module0647.ONE_INTEGER;
        final SubLObject var227 = (SubLObject)module0647.THREE_INTEGER;
        final SubLObject var228 = (SubLObject)module0647.$ic275$;
        final SubLObject var229 = f39411();
        return f39406(var32, var225, module0647.$ic305$, var110, var226, var227, var228, var229);
    }
    
    public static SubLObject f39381(final SubLObject var32, final SubLObject var225, final SubLObject var110) {
        final SubLObject var226 = (SubLObject)module0647.ONE_INTEGER;
        final SubLObject var227 = (SubLObject)module0647.NIL;
        final SubLObject var228 = (SubLObject)module0647.$ic275$;
        final SubLObject var229 = (SubLObject)module0647.NIL;
        return f39407(var32, var225, module0647.$ic306$, var110, var226, var227, var228, var229, (SubLObject)module0647.UNPROVIDED);
    }
    
    public static SubLObject f39385(final SubLObject var32, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        final SubLObject var112 = (SubLObject)module0647.ONE_INTEGER;
        final SubLObject var113 = (SubLObject)module0647.NIL;
        final SubLObject var114 = (SubLObject)module0647.NIL;
        final SubLObject var115 = (SubLObject)module0647.$ic307$;
        final SubLObject var116 = (SubLObject)module0647.NIL;
        final SubLObject var117 = f39407(var32, var114, module0647.$ic308$, var110, var112, var113, var115, var116, (SubLObject)module0647.UNPROVIDED);
        final SubLObject var118 = module0067.f4880(Symbols.symbol_function((SubLObject)module0647.EQUAL), (SubLObject)module0647.UNPROVIDED);
        SubLObject var119 = (SubLObject)module0647.NIL;
        SubLObject var120 = var117;
        SubLObject var121 = (SubLObject)module0647.NIL;
        var121 = var120.first();
        while (module0647.NIL != var120) {
            SubLObject var123;
            final SubLObject var122 = var123 = var121;
            SubLObject var124 = (SubLObject)module0647.NIL;
            SubLObject var125 = (SubLObject)module0647.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var123, var122, (SubLObject)module0647.$ic309$);
            var124 = var123.first();
            var123 = var123.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var123, var122, (SubLObject)module0647.$ic309$);
            var125 = var123.first();
            var123 = var123.rest();
            if (module0647.NIL == var123) {
                if (!module0205.f13132(var125).eql(module0647.$ic310$)) {
                    var125 = (SubLObject)ConsesLow.list(module0647.$ic310$, (SubLObject)module0647.$ic311$, (SubLObject)ConsesLow.list(module0647.$ic312$, (SubLObject)module0647.$ic311$, var125));
                }
                module0084.f5762(var118, var124, var125);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var122, (SubLObject)module0647.$ic309$);
            }
            var120 = var120.rest();
            var121 = var120.first();
        }
        SubLObject var126;
        for (var126 = module0066.f4838(module0067.f4891(var118)); module0647.NIL == module0066.f4841(var126); var126 = module0066.f4840(var126)) {
            var111.resetMultipleValues();
            final SubLObject var127 = module0066.f4839(var126);
            final SubLObject var128 = var111.secondMultipleValue();
            var111.resetMultipleValues();
            var119 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var127, var128), var119);
        }
        module0066.f4842(var126);
        return var119;
    }
    
    public static SubLObject f39395(final SubLObject var32, final SubLObject var110) {
        final SubLObject var111 = (SubLObject)module0647.ONE_INTEGER;
        final SubLObject var112 = (SubLObject)module0647.NIL;
        final SubLObject var113 = (SubLObject)module0647.NIL;
        final SubLObject var114 = (SubLObject)module0647.$ic307$;
        final SubLObject var115 = (SubLObject)module0647.NIL;
        final SubLObject var116 = f39407(var32, var113, module0647.$ic313$, var110, var111, var112, var114, var115, (SubLObject)module0647.UNPROVIDED);
        return var116;
    }
    
    public static SubLObject f39387(final SubLObject var32, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        final SubLObject var112 = (SubLObject)module0647.ONE_INTEGER;
        final SubLObject var113 = (SubLObject)module0647.NIL;
        final SubLObject var114 = (SubLObject)module0647.NIL;
        final SubLObject var115 = (SubLObject)module0647.$ic307$;
        final SubLObject var116 = (SubLObject)module0647.NIL;
        final SubLObject var117 = f39407(var32, var114, module0647.$ic314$, var110, var112, var113, var115, var116, (SubLObject)module0647.UNPROVIDED);
        final SubLObject var118 = module0067.f4880(Symbols.symbol_function((SubLObject)module0647.EQUAL), (SubLObject)module0647.UNPROVIDED);
        SubLObject var119 = (SubLObject)module0647.NIL;
        SubLObject var120 = var117;
        SubLObject var121 = (SubLObject)module0647.NIL;
        var121 = var120.first();
        while (module0647.NIL != var120) {
            SubLObject var123;
            final SubLObject var122 = var123 = var121;
            SubLObject var124 = (SubLObject)module0647.NIL;
            SubLObject var125 = (SubLObject)module0647.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var123, var122, (SubLObject)module0647.$ic315$);
            var124 = var123.first();
            var123 = var123.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var123, var122, (SubLObject)module0647.$ic315$);
            var125 = var123.first();
            var123 = var123.rest();
            if (module0647.NIL == var123) {
                module0084.f5762(var118, var124, var125);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var122, (SubLObject)module0647.$ic315$);
            }
            var120 = var120.rest();
            var121 = var120.first();
        }
        SubLObject var126;
        for (var126 = module0066.f4838(module0067.f4891(var118)); module0647.NIL == module0066.f4841(var126); var126 = module0066.f4840(var126)) {
            var111.resetMultipleValues();
            final SubLObject var127 = module0066.f4839(var126);
            final SubLObject var128 = var111.secondMultipleValue();
            var111.resetMultipleValues();
            var119 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var127, var128), var119);
        }
        module0066.f4842(var126);
        return var119;
    }
    
    public static SubLObject f39383(final SubLObject var32, final SubLObject var110) {
        final SubLObject var111 = (SubLObject)module0647.ONE_INTEGER;
        final SubLObject var112 = (SubLObject)module0647.NIL;
        final SubLObject var113 = (SubLObject)module0647.NIL;
        final SubLObject var114 = (SubLObject)module0647.$ic275$;
        final SubLObject var115 = (SubLObject)module0647.NIL;
        return f39407(var32, var113, module0647.$ic316$, var110, var111, var112, var114, var115, (SubLObject)module0647.UNPROVIDED);
    }
    
    public static SubLObject f39393(final SubLObject var32, final SubLObject var110) {
        final SubLObject var111 = (SubLObject)module0647.ONE_INTEGER;
        final SubLObject var112 = (SubLObject)module0647.NIL;
        final SubLObject var113 = (SubLObject)module0647.NIL;
        final SubLObject var114 = (SubLObject)module0647.$ic275$;
        final SubLObject var115 = (SubLObject)module0647.NIL;
        return f39407(var32, var113, module0647.$ic317$, var110, var111, var112, var114, var115, (SubLObject)module0647.UNPROVIDED);
    }
    
    public static SubLObject f39412(final SubLObject var42, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        if (module0647.NIL != module0259.f16854(var42, module0647.$ic318$, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED)) {
            return f39413(f39414(var42, var110), var110);
        }
        var111.resetMultipleValues();
        final SubLObject var112 = f39415(var42, var110);
        final SubLObject var113 = var111.secondMultipleValue();
        var111.resetMultipleValues();
        return f39416(var112, var113);
    }
    
    public static SubLObject f39417(final SubLObject var42, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        SubLObject var112 = (SubLObject)module0647.NIL;
        var111.resetMultipleValues();
        final SubLObject var113 = f39418(var42, var110);
        final SubLObject var114 = var111.secondMultipleValue();
        var111.resetMultipleValues();
        var112 = f39416(var113, var114);
        return var112;
    }
    
    public static SubLObject f39419(final SubLObject var310) {
        return f39420(var310, module0077.f5313(Symbols.symbol_function((SubLObject)module0647.EQUAL), (SubLObject)module0647.UNPROVIDED));
    }
    
    public static SubLObject f39420(final SubLObject var310, final SubLObject var311) {
        final SubLThread var312 = SubLProcess.currentSubLThread();
        SubLObject var313 = module0067.f4884(module0647.$g5041$.getDynamicValue(var312), var310, (SubLObject)module0647.UNPROVIDED);
        SubLObject var314 = (SubLObject)module0647.NIL;
        var314 = var313.first();
        while (module0647.NIL != var313) {
            if (module0647.NIL == module0077.f5320(var314, var311)) {
                module0077.f5326(var314, var311);
                f39420(var314, var311);
            }
            var313 = var313.rest();
            var314 = var313.first();
        }
        return var311;
    }
    
    public static SubLObject f39421(final SubLObject var313, final SubLObject var314) {
        final SubLThread var315 = SubLProcess.currentSubLThread();
        assert module0647.NIL != module0067.f4852(module0647.$g5041$.getDynamicValue(var315)) : module0647.$g5041$.getDynamicValue(var315);
        return module0077.f5320(var314, f39419(var313));
    }
    
    public static SubLObject f39416(final SubLObject var307, final SubLObject var308) {
        final SubLThread var309 = SubLProcess.currentSubLThread();
        SubLObject var310 = (SubLObject)module0647.NIL;
        final SubLObject var311 = module0067.f4902(var307);
        final SubLObject var312 = module0067.f4902(var308);
        final SubLObject var313 = module0647.$g5041$.currentBinding(var309);
        try {
            module0647.$g5041$.bind(var307, var309);
            final SubLObject var314 = conses_high.union(var311, var312, module0067.f4854(var307), (SubLObject)module0647.UNPROVIDED);
            var310 = Sort.sort(var314, (SubLObject)module0647.$ic320$, (SubLObject)module0647.UNPROVIDED);
        }
        finally {
            module0647.$g5041$.rebind(var313, var309);
        }
        return var310;
    }
    
    public static SubLObject f39422(final SubLObject var307, final SubLObject var308) {
        SubLObject var309 = (SubLObject)module0647.NIL;
        final SubLObject var310 = module0067.f4902(var307);
        final SubLObject var311 = module0067.f4902(var308);
        SubLObject var312 = conses_high.set_difference(var310, var311, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        if (module0647.NIL == var312) {
            var312 = var310;
        }
        final SubLObject var313 = module0055.f4017();
        final SubLObject var314 = module0055.f4017();
        SubLObject var315 = Sort.sort(var312, Symbols.symbol_function((SubLObject)module0647.$ic321$), (SubLObject)module0647.UNPROVIDED);
        SubLObject var316 = (SubLObject)module0647.NIL;
        var316 = var315.first();
        while (module0647.NIL != var315) {
            module0055.f4021(var316, var313);
            var315 = var315.rest();
            var316 = var315.first();
        }
        while (module0647.NIL == module0055.f4019(var313)) {
            final SubLObject var317 = module0055.f4023(var313);
            final SubLObject var318 = module0067.f4884(var307, var317, (SubLObject)module0647.NIL);
            if (module0647.NIL == module0055.f4028(var317, var314, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED)) {
                module0055.f4021(var317, var314);
            }
            if (module0647.NIL != var318) {
                SubLObject var319 = Sort.sort(var318, Symbols.symbol_function((SubLObject)module0647.$ic321$), (SubLObject)module0647.UNPROVIDED);
                SubLObject var320 = (SubLObject)module0647.NIL;
                var320 = var319.first();
                while (module0647.NIL != var319) {
                    if (module0647.NIL == module0055.f4028(var320, var314, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED)) {
                        module0055.f4021(var320, var313);
                    }
                    var319 = var319.rest();
                    var320 = var319.first();
                }
            }
        }
        var309 = module0055.f4020(var314);
        return var309;
    }
    
    public static SubLObject f39423(final SubLObject var319) {
        final SubLObject var320 = module0067.f4880((SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        final SubLObject var321 = module0067.f4880((SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        SubLObject var322 = var319;
        SubLObject var323 = (SubLObject)module0647.NIL;
        var323 = var322.first();
        while (module0647.NIL != var322) {
            SubLObject var325;
            final SubLObject var324 = var325 = var323;
            SubLObject var326 = (SubLObject)module0647.NIL;
            SubLObject var327 = (SubLObject)module0647.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var325, var324, (SubLObject)module0647.$ic322$);
            var326 = var325.first();
            var325 = var325.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var325, var324, (SubLObject)module0647.$ic322$);
            var327 = var325.first();
            var325 = var325.rest();
            if (module0647.NIL == var325) {
                var326 = module0285.f18875(var326, (SubLObject)module0647.UNPROVIDED);
                var327 = module0285.f18875(var327, (SubLObject)module0647.UNPROVIDED);
                module0084.f5762(var320, var326, var327);
                module0084.f5762(var321, var327, var326);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var324, (SubLObject)module0647.$ic322$);
            }
            var322 = var322.rest();
            var323 = var322.first();
        }
        return Values.values(var320, var321);
    }
    
    public static SubLObject f39415(final SubLObject var42, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        final SubLObject var112 = module0166.f10737((SubLObject)module0647.$ic323$);
        final SubLObject var113 = (module0647.NIL != module0128.f8463(var112, (SubLObject)module0647.UNPROVIDED)) ? f39424((SubLObject)module0647.$ic324$, (SubLObject)ConsesLow.list(var112, (SubLObject)module0647.$ic325$, (SubLObject)module0647.$ic326$, var42), var110, (SubLObject)module0647.$ic327$) : f39424((SubLObject)module0647.$ic324$, (SubLObject)ConsesLow.list(module0647.$ic328$, (SubLObject)module0647.$ic329$, (SubLObject)module0647.$ic330$, (SubLObject)ConsesLow.list(module0647.$ic331$, (SubLObject)module0647.$ic325$, var42), (SubLObject)ConsesLow.list(module0647.$ic331$, (SubLObject)module0647.$ic326$, var42)), var110, (SubLObject)module0647.$ic332$);
        var111.resetMultipleValues();
        final SubLObject var114 = f39423(var113);
        final SubLObject var115 = var111.secondMultipleValue();
        var111.resetMultipleValues();
        return Values.values(var114, var115);
    }
    
    public static SubLObject f39418(final SubLObject var42, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        final SubLObject var112 = f39424((SubLObject)module0647.$ic324$, (SubLObject)ConsesLow.list(module0647.$ic333$, (SubLObject)module0647.$ic325$, (SubLObject)module0647.$ic326$, var42), var110, (SubLObject)module0647.$ic327$);
        var111.resetMultipleValues();
        final SubLObject var113 = f39423(var112);
        final SubLObject var114 = var111.secondMultipleValue();
        var111.resetMultipleValues();
        return Values.values(var113, var114);
    }
    
    public static SubLObject f39425(final SubLObject var42) {
        final SubLObject var43 = f39244(var42);
        final SubLObject var44 = module0067.f4880((SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        SubLObject var45 = (SubLObject)module0647.NIL;
        SubLObject var46 = f39243(var42);
        SubLObject var47 = (SubLObject)module0647.NIL;
        var47 = var46.first();
        while (module0647.NIL != var46) {
            module0067.f4886(var44, f39297(var47), var47);
            var46 = var46.rest();
            var47 = var46.first();
        }
        var45 = f39426(var44, var43, (SubLObject)module0647.$ic334$);
        f39255(var42, var45);
        return var45;
    }
    
    public static SubLObject f39427(final SubLObject var42) {
        final SubLObject var43 = f39244(var42);
        final SubLObject var44 = module0067.f4880((SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        SubLObject var45 = (SubLObject)module0647.NIL;
        SubLObject var46 = f39242(var42);
        SubLObject var47 = (SubLObject)module0647.NIL;
        var47 = var46.first();
        while (module0647.NIL != var46) {
            module0067.f4886(var44, f39241(var47), var47);
            var46 = var46.rest();
            var47 = var46.first();
        }
        var45 = f39426(var44, var43, (SubLObject)module0647.$ic334$);
        f39254(var42, var45);
        return var45;
    }
    
    public static SubLObject f39426(final SubLObject var336, final SubLObject var179, final SubLObject var337) {
        SubLObject var338 = (SubLObject)module0647.NIL;
        SubLObject var339 = var179;
        SubLObject var340 = (SubLObject)module0647.NIL;
        var340 = var339.first();
        while (module0647.NIL != var339) {
            final SubLObject var341 = module0067.f4884(var336, var340, (SubLObject)module0647.UNPROVIDED);
            if (module0647.NIL != var341) {
                var338 = (SubLObject)ConsesLow.cons(var341, var338);
                module0067.f4887(var336, var340);
            }
            var339 = var339.rest();
            var340 = var339.first();
        }
        final SubLObject var342 = module0067.f4902(var336);
        SubLObject var343 = Sort.sort(var342, var337, (SubLObject)module0647.UNPROVIDED);
        SubLObject var344 = (SubLObject)module0647.NIL;
        var344 = var343.first();
        while (module0647.NIL != var343) {
            final SubLObject var345 = module0067.f4884(var336, var344, (SubLObject)module0647.UNPROVIDED);
            var338 = (SubLObject)ConsesLow.cons(var345, var338);
            var343 = var343.rest();
            var344 = var343.first();
        }
        return Sequences.nreverse(var338);
    }
    
    public static SubLObject f39428(final SubLObject var342, final SubLObject var343) {
        return module0213.f13927(var342, var343, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
    }
    
    public static SubLObject f39429(final SubLObject var42, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        assert module0647.NIL != module0173.f10955(var42) : var42;
        assert module0647.NIL != module0161.f10481(var110) : var110;
        final SubLObject var112 = f39334(var42, (SubLObject)module0647.UNPROVIDED);
        var111.resetMultipleValues();
        final SubLObject var113 = module0586.$g4453$.currentBinding(var111);
        try {
            module0586.$g4453$.bind(module0586.f35853(), var111);
            final SubLObject var114 = var111.secondMultipleValue();
            var111.resetMultipleValues();
            try {
                final SubLObject var115 = module0077.f5313(Symbols.symbol_function((SubLObject)module0647.EQL), (SubLObject)module0647.UNPROVIDED);
                final SubLObject var116 = module0055.f4017();
                module0055.f4021(var112, var116);
                module0077.f5326(var112, var115);
                while (module0647.NIL == module0055.f4019(var116)) {
                    SubLObject var117 = (SubLObject)module0647.NIL;
                    SubLObject var118 = (SubLObject)module0647.NIL;
                    var117 = module0055.f4023(var116);
                    final SubLObject var119 = f39241(var117);
                    final SubLObject var120 = f39430(var119, var110);
                    f39431(var117, var110);
                    if (module0647.NIL == var120) {
                        SubLObject var122;
                        final SubLObject var121 = var122 = f39432(var119, var110);
                        SubLObject var123 = (SubLObject)module0647.NIL;
                        var123 = var122.first();
                        while (module0647.NIL != var122) {
                            final SubLObject var124 = f39347(var123, var117);
                            f39370(var119, var124, var110);
                            var122 = var122.rest();
                            var123 = var122.first();
                        }
                        f39425(var117);
                    }
                    else {
                        SubLObject var125 = (SubLObject)module0647.NIL;
                        SubLObject var122 = var120;
                        SubLObject var126 = (SubLObject)module0647.NIL;
                        var126 = var122.first();
                        while (module0647.NIL != var122) {
                            final SubLObject var127 = f39433(var126, var110);
                            final SubLObject var128 = f39334(var126, var117);
                            if (module0647.NIL != var127 || module0647.NIL != f39434(var126, var110)) {
                                f39335(var117, var128);
                                var125 = (SubLObject)ConsesLow.cons(var128, var125);
                            }
                            var122 = var122.rest();
                            var126 = var122.first();
                        }
                        var118 = var125;
                        f39427(var117);
                    }
                    SubLObject var129 = var118;
                    SubLObject var130 = (SubLObject)module0647.NIL;
                    var130 = var129.first();
                    while (module0647.NIL != var129) {
                        if (module0647.NIL == module0077.f5320(var130, var115)) {
                            module0077.f5326(var130, var115);
                            module0055.f4021(var130, var116);
                        }
                        var129 = var129.rest();
                        var130 = var129.first();
                    }
                }
            }
            finally {
                final SubLObject var54_353 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var111);
                    if (module0647.NIL == var114 && module0647.NIL == module0586.f35855()) {
                        module0586.f35851((SubLObject)module0647.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var54_353, var111);
                }
            }
        }
        finally {
            module0586.$g4453$.rebind(var113, var111);
        }
        f39435(var112);
        return var112;
    }
    
    public static SubLObject f39435(final SubLObject var354) {
        f39436(var354);
        return var354;
    }
    
    public static SubLObject f39436(final SubLObject var354) {
        final SubLObject var355 = f39250(var354);
        SubLObject var356 = f39242(var354);
        SubLObject var357 = (SubLObject)module0647.NIL;
        var357 = var356.first();
        while (module0647.NIL != var356) {
            f39437(var357, var355);
            var356 = var356.rest();
            var357 = var356.first();
        }
        return var354;
    }
    
    public static SubLObject f39437(final SubLObject var45, final SubLObject var34) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        if (module0647.NIL == f39242(var45)) {
            SubLObject var47 = f39243(var45);
            SubLObject var48 = (SubLObject)module0647.NIL;
            var48 = var47.first();
            while (module0647.NIL != var47) {
                final SubLObject var49 = f39300(var48);
                SubLObject var50 = (SubLObject)module0647.NIL;
                final SubLObject var51 = module0147.f9540(var34);
                final SubLObject var52 = module0147.$g2095$.currentBinding(var46);
                final SubLObject var53 = module0147.$g2094$.currentBinding(var46);
                final SubLObject var54 = module0147.$g2096$.currentBinding(var46);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var51), var46);
                    module0147.$g2094$.bind(module0147.f9546(var51), var46);
                    module0147.$g2096$.bind(module0147.f9549(var51), var46);
                    var50 = module0147.f9507(var49);
                }
                finally {
                    module0147.$g2096$.rebind(var54, var46);
                    module0147.$g2094$.rebind(var53, var46);
                    module0147.$g2095$.rebind(var52, var46);
                }
                if (module0647.NIL == var50) {
                    Functions.funcall((SubLObject)((module0647.NIL != module0647.$g5042$.getGlobalValue()) ? module0647.$ic335$ : module0647.$ic336$), (SubLObject)module0647.$ic337$, f39297(var48), f39241(var45), var34, var49);
                }
                var47 = var47.rest();
                var48 = var47.first();
            }
        }
        else {
            SubLObject var47 = f39242(var45);
            SubLObject var55 = (SubLObject)module0647.NIL;
            var55 = var47.first();
            while (module0647.NIL != var47) {
                f39437(var55, var34);
                var47 = var47.rest();
                var55 = var47.first();
            }
        }
        return var45;
    }
    
    public static SubLObject f39411() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0647.NIL == module0166.f10737((SubLObject)module0647.$ic338$) || module0647.NIL == module0259.f16854(module0647.$ic339$, module0647.$ic340$, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
    }
    
    public static SubLObject f39432(final SubLObject var42, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        SubLObject var112 = (SubLObject)module0647.NIL;
        if (module0647.NIL != f39411()) {
            final SubLObject var113 = module0147.f9540(var110);
            final SubLObject var114 = module0147.$g2095$.currentBinding(var111);
            final SubLObject var115 = module0147.$g2094$.currentBinding(var111);
            final SubLObject var116 = module0147.$g2096$.currentBinding(var111);
            try {
                module0147.$g2095$.bind(module0147.f9545(var113), var111);
                module0147.$g2094$.bind(module0147.f9546(var113), var111);
                module0147.$g2096$.bind(module0147.f9549(var113), var111);
                var112 = module0259.f16829(var42, var110, (SubLObject)module0647.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var116, var111);
                module0147.$g2094$.rebind(var115, var111);
                module0147.$g2095$.rebind(var114, var111);
            }
        }
        else {
            var112 = f39438((SubLObject)module0647.$ic341$, (SubLObject)ConsesLow.list(module0647.$ic296$, (SubLObject)ConsesLow.list(module0647.$ic342$, (SubLObject)module0647.$ic341$, var42)), var110, (SubLObject)module0647.UNPROVIDED);
        }
        return var112;
    }
    
    public static SubLObject f39413(final SubLObject var350, final SubLObject var110) {
        final SubLThread var351 = SubLProcess.currentSubLThread();
        SubLObject var352 = (SubLObject)module0647.NIL;
        final SubLObject var353 = module0647.$g5043$.currentBinding(var351);
        try {
            module0647.$g5043$.bind(var110, var351);
            var352 = Sort.sort(var350, Symbols.symbol_function((SubLObject)module0647.$ic344$), (SubLObject)module0647.$ic345$);
        }
        finally {
            module0647.$g5043$.rebind(var353, var351);
        }
        return var352;
    }
    
    public static SubLObject f39439(final SubLObject var42, SubLObject var110) {
        if (var110 == module0647.UNPROVIDED) {
            var110 = module0647.$g5043$.getDynamicValue();
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        SubLObject var112 = (SubLObject)module0647.NIL;
        if (module0647.NIL != f39411()) {
            final SubLObject var113 = module0147.f9540(var110);
            final SubLObject var114 = module0147.$g2095$.currentBinding(var111);
            final SubLObject var115 = module0147.$g2094$.currentBinding(var111);
            final SubLObject var116 = module0147.$g2096$.currentBinding(var111);
            try {
                module0147.$g2095$.bind(module0147.f9545(var113), var111);
                module0147.$g2094$.bind(module0147.f9546(var113), var111);
                module0147.$g2096$.bind(module0147.f9549(var113), var111);
                var112 = module0259.f16876(var42, var110, (SubLObject)module0647.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var116, var111);
                module0147.$g2094$.rebind(var115, var111);
                module0147.$g2095$.rebind(var114, var111);
            }
        }
        else {
            var112 = Sequences.length(f39432(var42, var110));
        }
        return var112;
    }
    
    public static SubLObject f39440(final SubLObject var42, SubLObject var110) {
        if (var110 == module0647.UNPROVIDED) {
            var110 = module0647.$g5043$.getDynamicValue();
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        final SubLObject var112 = module0034.$g879$.getDynamicValue(var111);
        SubLObject var113 = (SubLObject)module0647.NIL;
        if (module0647.NIL == var112) {
            return f39439(var42, var110);
        }
        var113 = module0034.f1857(var112, (SubLObject)module0647.$ic345$, (SubLObject)module0647.UNPROVIDED);
        if (module0647.NIL == var113) {
            var113 = module0034.f1807(module0034.f1842(var112), (SubLObject)module0647.$ic345$, (SubLObject)module0647.TWO_INTEGER, (SubLObject)module0647.NIL, (SubLObject)module0647.EQL, (SubLObject)module0647.UNPROVIDED);
            module0034.f1860(var112, (SubLObject)module0647.$ic345$, var113);
        }
        final SubLObject var114 = module0034.f1782(var42, var110);
        final SubLObject var115 = module0034.f1814(var113, var114, (SubLObject)module0647.UNPROVIDED);
        if (var115 != module0647.$ic346$) {
            SubLObject var116 = var115;
            SubLObject var117 = (SubLObject)module0647.NIL;
            var117 = var116.first();
            while (module0647.NIL != var116) {
                SubLObject var118 = var117.first();
                final SubLObject var119 = conses_high.second(var117);
                if (var42.eql(var118.first())) {
                    var118 = var118.rest();
                    if (module0647.NIL != var118 && module0647.NIL == var118.rest() && var110.eql(var118.first())) {
                        return module0034.f1959(var119);
                    }
                }
                var116 = var116.rest();
                var117 = var116.first();
            }
        }
        final SubLObject var120 = Values.arg2(var111.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f39439(var42, var110)));
        module0034.f1836(var113, var114, var115, var120, (SubLObject)ConsesLow.list(var42, var110));
        return module0034.f1959(var120);
    }
    
    public static SubLObject f39433(final SubLObject var42, final SubLObject var110) {
        return module0035.sublisp_boolean(f39430(var42, var110));
    }
    
    public static SubLObject f39434(final SubLObject var42, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        SubLObject var112 = (SubLObject)module0647.NIL;
        if (module0647.NIL != f39411()) {
            final SubLObject var113 = module0147.f9540(var110);
            final SubLObject var114 = module0147.$g2095$.currentBinding(var111);
            final SubLObject var115 = module0147.$g2094$.currentBinding(var111);
            final SubLObject var116 = module0147.$g2096$.currentBinding(var111);
            try {
                module0147.$g2095$.bind(module0147.f9545(var113), var111);
                module0147.$g2094$.bind(module0147.f9546(var113), var111);
                module0147.$g2096$.bind(module0147.f9549(var113), var111);
                var112 = module0035.sublisp_boolean(module0259.f16848(var42, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
            }
            finally {
                module0147.$g2096$.rebind(var116, var111);
                module0147.$g2094$.rebind(var115, var111);
                module0147.$g2095$.rebind(var114, var111);
            }
            return var112;
        }
        return module0035.sublisp_boolean(f39438((SubLObject)module0647.$ic341$, (SubLObject)ConsesLow.list(module0647.$ic342$, (SubLObject)module0647.$ic341$, var42), var110, (SubLObject)module0647.$ic347$));
    }
    
    public static SubLObject f39430(final SubLObject var42, final SubLObject var110) {
        return f39441(var42, var110);
    }
    
    public static SubLObject f39441(final SubLObject var42, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        SubLObject var112 = (SubLObject)module0647.NIL;
        if (module0647.NIL != f39411()) {
            final SubLObject var113 = module0147.f9540(var110);
            final SubLObject var114 = module0147.$g2095$.currentBinding(var111);
            final SubLObject var115 = module0147.$g2094$.currentBinding(var111);
            final SubLObject var116 = module0147.$g2096$.currentBinding(var111);
            try {
                module0147.$g2095$.bind(module0147.f9545(var113), var111);
                module0147.$g2094$.bind(module0147.f9546(var113), var111);
                module0147.$g2096$.bind(module0147.f9549(var113), var111);
                var112 = module0256.f16539(var42, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var116, var111);
                module0147.$g2094$.rebind(var115, var111);
                module0147.$g2095$.rebind(var114, var111);
            }
        }
        else {
            var112 = f39438((SubLObject)module0647.$ic348$, (SubLObject)ConsesLow.list(module0647.$ic331$, (SubLObject)module0647.$ic348$, var42), var110, (SubLObject)module0647.UNPROVIDED);
        }
        return var112;
    }
    
    public static SubLObject f39414(final SubLObject var42, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        SubLObject var112 = (SubLObject)module0647.NIL;
        if (module0647.NIL != f39411()) {
            final SubLObject var113 = module0147.f9540(var110);
            final SubLObject var114 = module0147.$g2095$.currentBinding(var111);
            final SubLObject var115 = module0147.$g2094$.currentBinding(var111);
            final SubLObject var116 = module0147.$g2096$.currentBinding(var111);
            try {
                module0147.$g2095$.bind(module0147.f9545(var113), var111);
                module0147.$g2094$.bind(module0147.f9546(var113), var111);
                module0147.$g2096$.bind(module0147.f9549(var113), var111);
                var112 = module0256.f16539(var42, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var116, var111);
                module0147.$g2094$.rebind(var115, var111);
                module0147.$g2095$.rebind(var114, var111);
            }
        }
        else {
            var112 = f39438((SubLObject)module0647.$ic348$, (SubLObject)ConsesLow.list(module0647.$ic296$, (SubLObject)ConsesLow.list(module0647.$ic331$, (SubLObject)module0647.$ic348$, var42)), var110, (SubLObject)module0647.UNPROVIDED);
        }
        return var112;
    }
    
    public static SubLObject f39442(final SubLObject var42, final SubLObject var110) {
        return module0647.$ic343$;
    }
    
    public static SubLObject f39431(final SubLObject var354, final SubLObject var110) {
        final SubLObject var355 = f39241(var354);
        final SubLObject var356 = f39443(var355, var110);
        if (var356.isString()) {
            f39337(var354, var356);
        }
        final SubLObject var357 = f39444(var355, var110);
        if (var357.isString()) {
            f39338(var354, var357);
        }
        final SubLObject var358 = f39445(var355, var110);
        if (module0647.NIL != module0173.f10955(var358)) {
            f39339(var354, var358);
        }
        final SubLObject var359 = f39446(var355, var110);
        if (module0647.NIL != module0035.f2192(Symbols.symbol_function((SubLObject)module0647.$ic356$), var359)) {
            f39340(var354, var359);
        }
        f39256(var354, (module0647.NIL != f39240(var354)) ? f39417(var355, var110) : f39412(var355, var110));
        f39262(var354, f39447(var355, var110));
        f39263(var354, f39448(var355, var110));
        f39261(var354, var110);
        return var354;
    }
    
    public static SubLObject f39446(final SubLObject var42, final SubLObject var110) {
        final SubLObject var111 = (SubLObject)module0647.NIL;
        final SubLObject var112 = (SubLObject)module0647.NIL;
        final SubLObject var113 = (SubLObject)module0647.ONE_INTEGER;
        final SubLObject var114 = (SubLObject)module0647.$ic275$;
        final SubLObject var115 = (SubLObject)module0647.NIL;
        return f39407(var112, var42, module0647.$ic357$, var110, var111, var113, var114, var115, (SubLObject)module0647.UNPROVIDED);
    }
    
    public static SubLObject f39449(final SubLObject var225, final SubLObject var262, final SubLObject var110) {
        final SubLObject var263 = (SubLObject)module0647.NIL;
        final SubLObject var264 = (SubLObject)module0647.NIL;
        final SubLObject var265 = (SubLObject)module0647.ONE_INTEGER;
        final SubLObject var266 = (SubLObject)module0647.$ic275$;
        final SubLObject var267 = (SubLObject)module0647.NIL;
        return f39406(var264, var225, var262, var110, var263, var265, var266, var267);
    }
    
    public static SubLObject f39445(final SubLObject var42, final SubLObject var110) {
        return f39449(var42, module0647.$ic358$, var110);
    }
    
    public static SubLObject f39443(final SubLObject var42, final SubLObject var110) {
        return f39449(var42, module0647.$ic359$, var110);
    }
    
    public static SubLObject f39444(final SubLObject var42, final SubLObject var110) {
        return f39449(var42, module0647.$ic360$, var110);
    }
    
    public static SubLObject f39447(final SubLObject var42, final SubLObject var110) {
        return f39449(var42, module0647.$ic361$, var110);
    }
    
    public static SubLObject f39448(final SubLObject var42, final SubLObject var110) {
        return f39449(var42, module0647.$ic362$, var110);
    }
    
    public static SubLObject f39438(final SubLObject var368, final SubLObject var369, final SubLObject var278, SubLObject var289) {
        if (var289 == module0647.UNPROVIDED) {
            var289 = (SubLObject)module0647.NIL;
        }
        final SubLObject var370 = conses_high.putf(var289, (SubLObject)module0647.$ic299$, module0586.f35849());
        return module0434.f30578(var368, var369, var278, var370);
    }
    
    public static SubLObject f39424(final SubLObject var40, final SubLObject var369, final SubLObject var278, SubLObject var289) {
        if (var289 == module0647.UNPROVIDED) {
            var289 = (SubLObject)module0647.NIL;
        }
        final SubLObject var370 = conses_high.putf(var289, (SubLObject)module0647.$ic299$, module0586.f35849());
        return module0434.f30576(var40, var369, var278, var370);
    }
    
    public static SubLObject f39450(final SubLObject var109, final SubLObject var354, final SubLObject var110) {
        final SubLThread var355 = SubLProcess.currentSubLThread();
        SubLObject var356 = (SubLObject)module0647.NIL;
        SubLObject var357 = (SubLObject)module0647.NIL;
        var355.resetMultipleValues();
        final SubLObject var358 = module0586.$g4453$.currentBinding(var355);
        try {
            module0586.$g4453$.bind(module0586.f35853(), var355);
            final SubLObject var359 = var355.secondMultipleValue();
            var355.resetMultipleValues();
            try {
                final SubLObject var360 = f39250(var354);
                final SubLObject var361 = f39330(var109, f39241(var354), var110, var360);
                final SubLObject var54_372 = module0647.$g5038$.currentBinding(var355);
                try {
                    module0647.$g5038$.bind(var361, var355);
                    assert module0647.NIL != module0077.f5302(var361) : var361;
                    var356 = f39451(var109, var354, var110, var360);
                    var357 = f39328();
                }
                finally {
                    module0647.$g5038$.rebind(var54_372, var355);
                }
            }
            finally {
                final SubLObject var54_373 = Threads.$is_thread_performing_cleanupP$.currentBinding(var355);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var355);
                    if (module0647.NIL == var359 && module0647.NIL == module0586.f35855()) {
                        module0586.f35851((SubLObject)module0647.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var54_373, var355);
                }
            }
        }
        finally {
            module0586.$g4453$.rebind(var358, var355);
        }
        return Values.values(var356, var357);
    }
    
    public static SubLObject f39452(final SubLObject var109, final SubLObject var354, final SubLObject var110) {
        final SubLThread var355 = SubLProcess.currentSubLThread();
        var355.resetMultipleValues();
        final SubLObject var356 = f39450(var109, var354, var110);
        final SubLObject var357 = var355.secondMultipleValue();
        var355.resetMultipleValues();
        return var356;
    }
    
    public static SubLObject f39451(final SubLObject var109, final SubLObject var354, final SubLObject var110, final SubLObject var34) {
        SubLObject var355 = (SubLObject)module0647.NIL;
        SubLObject var356 = f39242(var354);
        SubLObject var357 = (SubLObject)module0647.NIL;
        var357 = var356.first();
        while (module0647.NIL != var356) {
            SubLObject var358 = (SubLObject)module0647.NIL;
            if (module0647.NIL == f39243(var357)) {
                var358 = f39451(var109, var357, var110, var34);
            }
            else {
                var358 = f39453(var109, var357, var110, var34);
            }
            if (module0647.NIL != var358) {
                var355 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(f39241(var357), var358), var355);
            }
            var356 = var356.rest();
            var357 = var356.first();
        }
        return Sequences.nreverse(var355);
    }
    
    public static SubLObject f39454() {
        return module0647.$g5044$.getGlobalValue().first().first();
    }
    
    public static SubLObject f39455(final SubLObject var109, final SubLObject var354, final SubLObject var33, final SubLObject var375, final SubLObject var271, SubLObject var2) {
        if (var2 == module0647.UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var376 = SubLProcess.currentSubLThread();
        final SubLObject var377 = module0587.$g4457$.currentBinding(var376);
        try {
            module0587.$g4457$.bind(var2, var376);
            try {
                final SubLObject var54_376 = module0601.$g4652$.currentBinding(var376);
                final SubLObject var378 = module0601.$g4654$.currentBinding(var376);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var376), module0601.$g4652$.getDynamicValue(var376)), var376);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var376), var376);
                    module0601.f36758((SubLObject)module0647.$ic365$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                    try {
                        final SubLObject var54_377 = module0601.$g4652$.currentBinding(var376);
                        final SubLObject var56_378 = module0601.$g4654$.currentBinding(var376);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var376), module0601.$g4652$.getDynamicValue(var376)), var376);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var376), var376);
                            module0601.f36758((SubLObject)module0647.$ic176$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                            module0797.f50965(f39241(var354));
                        }
                        finally {
                            module0601.$g4654$.rebind(var56_378, var376);
                            module0601.$g4652$.rebind(var54_377, var376);
                        }
                    }
                    finally {
                        final SubLObject var54_378 = Threads.$is_thread_performing_cleanupP$.currentBinding(var376);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var376);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0647.$ic176$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var54_378, var376);
                        }
                    }
                    try {
                        final SubLObject var54_379 = module0601.$g4652$.currentBinding(var376);
                        final SubLObject var56_379 = module0601.$g4654$.currentBinding(var376);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var376), module0601.$g4652$.getDynamicValue(var376)), var376);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var376), var376);
                            module0601.f36758((SubLObject)module0647.$ic366$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                            module0797.f50965(var375);
                        }
                        finally {
                            module0601.$g4654$.rebind(var56_379, var376);
                            module0601.$g4652$.rebind(var54_379, var376);
                        }
                    }
                    finally {
                        final SubLObject var54_380 = Threads.$is_thread_performing_cleanupP$.currentBinding(var376);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var376);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0647.$ic366$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var54_380, var376);
                        }
                    }
                    try {
                        final SubLObject var54_381 = module0601.$g4652$.currentBinding(var376);
                        final SubLObject var56_380 = module0601.$g4654$.currentBinding(var376);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var376), module0601.$g4652$.getDynamicValue(var376)), var376);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var376), var376);
                            module0601.f36758((SubLObject)module0647.$ic367$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                            module0797.f50965(var109);
                        }
                        finally {
                            module0601.$g4654$.rebind(var56_380, var376);
                            module0601.$g4652$.rebind(var54_381, var376);
                        }
                    }
                    finally {
                        final SubLObject var54_382 = Threads.$is_thread_performing_cleanupP$.currentBinding(var376);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var376);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0647.$ic367$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var54_382, var376);
                        }
                    }
                    if (module0647.NIL == module0647.$g5039$.getDynamicValue(var376)) {
                        try {
                            final SubLObject var54_383 = module0601.$g4652$.currentBinding(var376);
                            final SubLObject var56_381 = module0601.$g4654$.currentBinding(var376);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var376), module0601.$g4652$.getDynamicValue(var376)), var376);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var376), var376);
                                module0601.f36758((SubLObject)module0647.$ic368$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                module0797.f50948(f39454(), (SubLObject)module0647.UNPROVIDED);
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_381, var376);
                                module0601.$g4652$.rebind(var54_383, var376);
                            }
                        }
                        finally {
                            final SubLObject var54_384 = Threads.$is_thread_performing_cleanupP$.currentBinding(var376);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var376);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0647.$ic368$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_384, var376);
                            }
                        }
                    }
                    try {
                        final SubLObject var54_385 = module0601.$g4652$.currentBinding(var376);
                        final SubLObject var56_382 = module0601.$g4654$.currentBinding(var376);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var376), module0601.$g4652$.getDynamicValue(var376)), var376);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var376), var376);
                            module0601.f36758((SubLObject)module0647.$ic369$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                            SubLObject var379 = var271;
                            SubLObject var380 = (SubLObject)module0647.NIL;
                            var380 = var379.first();
                            while (module0647.NIL != var379) {
                                SubLObject var382;
                                final SubLObject var381 = var382 = var380;
                                SubLObject var383 = (SubLObject)module0647.NIL;
                                SubLObject var384 = (SubLObject)module0647.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var382, var381, (SubLObject)module0647.$ic370$);
                                var383 = var382.first();
                                var382 = var382.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var382, var381, (SubLObject)module0647.$ic370$);
                                var384 = var382.first();
                                var382 = var382.rest();
                                if (module0647.NIL == var382) {
                                    try {
                                        final SubLObject var54_386 = module0601.$g4652$.currentBinding(var376);
                                        final SubLObject var56_383 = module0601.$g4654$.currentBinding(var376);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var376), module0601.$g4652$.getDynamicValue(var376)), var376);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var376), var376);
                                            module0601.f36758((SubLObject)module0647.$ic371$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                            try {
                                                final SubLObject var54_387 = module0601.$g4652$.currentBinding(var376);
                                                final SubLObject var56_384 = module0601.$g4654$.currentBinding(var376);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var376), module0601.$g4652$.getDynamicValue(var376)), var376);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var376), var376);
                                                    module0601.f36758((SubLObject)module0647.$ic184$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                                    module0797.f50965(var383);
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var56_384, var376);
                                                    module0601.$g4652$.rebind(var54_387, var376);
                                                }
                                            }
                                            finally {
                                                final SubLObject var54_388 = Threads.$is_thread_performing_cleanupP$.currentBinding(var376);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var376);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)module0647.$ic184$);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var54_388, var376);
                                                }
                                            }
                                            try {
                                                final SubLObject var54_389 = module0601.$g4652$.currentBinding(var376);
                                                final SubLObject var56_385 = module0601.$g4654$.currentBinding(var376);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var376), module0601.$g4652$.getDynamicValue(var376)), var376);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var376), var376);
                                                    module0601.f36758((SubLObject)module0647.$ic372$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                                    SubLObject var52_403 = var384;
                                                    SubLObject var385 = (SubLObject)module0647.NIL;
                                                    var385 = var52_403.first();
                                                    while (module0647.NIL != var52_403) {
                                                        SubLObject var407_408;
                                                        final SubLObject var405_406 = var407_408 = var385;
                                                        SubLObject var386 = (SubLObject)module0647.NIL;
                                                        SubLObject var387 = (SubLObject)module0647.NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(var407_408, var405_406, (SubLObject)module0647.$ic373$);
                                                        var386 = var407_408.first();
                                                        var407_408 = var407_408.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var407_408, var405_406, (SubLObject)module0647.$ic373$);
                                                        var387 = var407_408.first();
                                                        var407_408 = var407_408.rest();
                                                        if (module0647.NIL == var407_408) {
                                                            f39456(var109, var386, var387, (SubLObject)module0647.UNPROVIDED);
                                                        }
                                                        else {
                                                            cdestructuring_bind.cdestructuring_bind_error(var405_406, (SubLObject)module0647.$ic373$);
                                                        }
                                                        var52_403 = var52_403.rest();
                                                        var385 = var52_403.first();
                                                    }
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var56_385, var376);
                                                    module0601.$g4652$.rebind(var54_389, var376);
                                                }
                                            }
                                            finally {
                                                final SubLObject var54_390 = Threads.$is_thread_performing_cleanupP$.currentBinding(var376);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var376);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)module0647.$ic372$);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var54_390, var376);
                                                }
                                            }
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var56_383, var376);
                                            module0601.$g4652$.rebind(var54_386, var376);
                                        }
                                    }
                                    finally {
                                        final SubLObject var54_391 = Threads.$is_thread_performing_cleanupP$.currentBinding(var376);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var376);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0647.$ic371$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var54_391, var376);
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var381, (SubLObject)module0647.$ic370$);
                                }
                                var379 = var379.rest();
                                var380 = var379.first();
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var56_382, var376);
                            module0601.$g4652$.rebind(var54_385, var376);
                        }
                    }
                    finally {
                        final SubLObject var54_392 = Threads.$is_thread_performing_cleanupP$.currentBinding(var376);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var376);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0647.$ic369$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var54_392, var376);
                        }
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var378, var376);
                    module0601.$g4652$.rebind(var54_376, var376);
                }
            }
            finally {
                final SubLObject var54_393 = Threads.$is_thread_performing_cleanupP$.currentBinding(var376);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var376);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0647.$ic365$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var54_393, var376);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var377, var376);
        }
        return var354;
    }
    
    public static SubLObject f39456(final SubLObject var109, final SubLObject var32, final SubLObject var292, SubLObject var2) {
        if (var2 == module0647.UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var293 = SubLProcess.currentSubLThread();
        final SubLObject var294 = module0587.$g4457$.currentBinding(var293);
        try {
            module0587.$g4457$.bind(var2, var293);
            try {
                final SubLObject var54_413 = module0601.$g4652$.currentBinding(var293);
                final SubLObject var295 = module0601.$g4654$.currentBinding(var293);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var293), module0601.$g4652$.getDynamicValue(var293)), var293);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var293), var293);
                    module0601.f36758((SubLObject)module0647.$ic374$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                    try {
                        final SubLObject var54_414 = module0601.$g4652$.currentBinding(var293);
                        final SubLObject var56_415 = module0601.$g4654$.currentBinding(var293);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var293), module0601.$g4652$.getDynamicValue(var293)), var293);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var293), var293);
                            module0601.f36758((SubLObject)module0647.$ic375$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                            module0797.f50965(var32);
                        }
                        finally {
                            module0601.$g4654$.rebind(var56_415, var293);
                            module0601.$g4652$.rebind(var54_414, var293);
                        }
                    }
                    finally {
                        final SubLObject var54_415 = Threads.$is_thread_performing_cleanupP$.currentBinding(var293);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var293);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0647.$ic375$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var54_415, var293);
                        }
                    }
                    try {
                        final SubLObject var54_416 = module0601.$g4652$.currentBinding(var293);
                        final SubLObject var56_416 = module0601.$g4654$.currentBinding(var293);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var293), module0601.$g4652$.getDynamicValue(var293)), var293);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var293), var293);
                            module0601.f36758((SubLObject)module0647.$ic376$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                            SubLObject var296 = var292;
                            SubLObject var297 = (SubLObject)module0647.NIL;
                            var297 = var296.first();
                            while (module0647.NIL != var296) {
                                final SubLObject var298 = f39457(var109, var297, var2);
                                if (var298.isString()) {
                                    Errors.error(Sequences.cconcatenate(Sequences.cconcatenate((SubLObject)module0647.$ic377$, module0006.f203(var32)), var298));
                                }
                                var296 = var296.rest();
                                var297 = var296.first();
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var56_416, var293);
                            module0601.$g4652$.rebind(var54_416, var293);
                        }
                    }
                    finally {
                        final SubLObject var54_417 = Threads.$is_thread_performing_cleanupP$.currentBinding(var293);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var293);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0647.$ic376$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var54_417, var293);
                        }
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var295, var293);
                    module0601.$g4652$.rebind(var54_413, var293);
                }
            }
            finally {
                final SubLObject var54_418 = Threads.$is_thread_performing_cleanupP$.currentBinding(var293);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var293);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0647.$ic374$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var54_418, var293);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var294, var293);
        }
        return var32;
    }
    
    public static SubLObject f39458(final SubLObject var35, final SubLObject var109) {
        SubLObject var110 = (SubLObject)module0647.NIL;
        if (module0647.NIL != module0174.f11035(var35)) {
            var110 = (SubLObject)SubLObjectFactory.makeBoolean(module0647.NIL != module0178.f11376(var35) || module0647.NIL != f39331(var35));
        }
        else if (module0647.NIL != f39459(var35)) {
            var110 = module0035.sublisp_boolean(module0035.find_if_not((SubLObject)module0647.$ic378$, f39460(var35, var109), (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        }
        else {
            var110 = (SubLObject)module0647.NIL;
        }
        return var110;
    }
    
    public static SubLObject f39457(final SubLObject var109, final SubLObject var35, final SubLObject var2) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        final SubLObject var111 = f39459(var35);
        final SubLObject var112 = (SubLObject)SubLObjectFactory.makeBoolean(module0647.NIL == var111 && module0647.NIL == module0174.f11035(var35));
        final SubLObject var113 = (SubLObject)((module0647.NIL != var112) ? Sequences.cconcatenate((SubLObject)module0647.$ic379$, new SubLObject[] { module0006.f203(var35), module0647.$ic380$ }) : module0647.NIL);
        final SubLObject var114 = (SubLObject)((module0647.NIL != var113) ? module0647.NIL : f39458(var35, var109));
        if (!var113.isString()) {
            try {
                final SubLObject var115 = module0601.$g4652$.currentBinding(var110);
                final SubLObject var116 = module0601.$g4654$.currentBinding(var110);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var110), module0601.$g4652$.getDynamicValue(var110)), var110);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var110), var110);
                    module0601.f36758((SubLObject)module0647.$ic381$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                    if (module0647.NIL != var114) {
                        try {
                            final SubLObject var54_425 = module0601.$g4652$.currentBinding(var110);
                            final SubLObject var56_426 = module0601.$g4654$.currentBinding(var110);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var110), module0601.$g4652$.getDynamicValue(var110)), var110);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var110), var110);
                                module0601.f36758((SubLObject)module0647.$ic382$, (SubLObject)module0647.NIL, (SubLObject)module0647.$ic220$, (SubLObject)module0647.NIL);
                            }
                            finally {
                                module0601.$g4654$.rebind(var56_426, var110);
                                module0601.$g4652$.rebind(var54_425, var110);
                            }
                        }
                        finally {
                            final SubLObject var54_426 = Threads.$is_thread_performing_cleanupP$.currentBinding(var110);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var110);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var54_426, var110);
                            }
                        }
                    }
                    f39461(var35, var111, var2);
                    f39462(var35, var111, var2);
                    if (module0647.NIL == module0647.$g5039$.getDynamicValue(var110)) {
                        f39463(var109, var35, var111, var2);
                        f39464(var109, var35, var111, var2);
                        f39465(var109, var35, var111, var2);
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var116, var110);
                    module0601.$g4652$.rebind(var115, var110);
                }
            }
            finally {
                final SubLObject var117 = Threads.$is_thread_performing_cleanupP$.currentBinding(var110);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var110);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0647.$ic381$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var117, var110);
                }
            }
        }
        return var113;
    }
    
    public static SubLObject f39461(final SubLObject var35, final SubLObject var423, final SubLObject var2) {
        final SubLThread var424 = SubLProcess.currentSubLThread();
        final SubLObject var425 = module0587.$g4457$.currentBinding(var424);
        try {
            module0587.$g4457$.bind(var2, var424);
            if (module0647.NIL != var423) {
                module0797.f50960(f39466(var35));
            }
            else {
                module0797.f50960(module0289.f19396(var35));
            }
        }
        finally {
            module0587.$g4457$.rebind(var425, var424);
        }
        return var35;
    }
    
    public static SubLObject f39463(final SubLObject var109, final SubLObject var35, final SubLObject var423, final SubLObject var2) {
        final SubLThread var424 = SubLProcess.currentSubLThread();
        final SubLObject var425 = module0587.$g4457$.currentBinding(var424);
        try {
            module0587.$g4457$.bind(var2, var424);
            try {
                final SubLObject var54_428 = module0601.$g4652$.currentBinding(var424);
                final SubLObject var426 = module0601.$g4654$.currentBinding(var424);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var424), module0601.$g4652$.getDynamicValue(var424)), var424);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var424), var424);
                    module0601.f36758((SubLObject)module0647.$ic383$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                    SubLObject var428;
                    final SubLObject var427 = var428 = (SubLObject)((module0647.NIL != var423) ? f39467(var109, var35) : ConsesLow.list(module0174.f11025(var35)));
                    SubLObject var429 = (SubLObject)module0647.NIL;
                    var429 = var428.first();
                    while (module0647.NIL != var428) {
                        if (var429.isInteger()) {
                            module0797.f50942(var429, (SubLObject)module0647.UNPROVIDED);
                        }
                        var428 = var428.rest();
                        var429 = var428.first();
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var426, var424);
                    module0601.$g4652$.rebind(var54_428, var424);
                }
            }
            finally {
                final SubLObject var54_429 = Threads.$is_thread_performing_cleanupP$.currentBinding(var424);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var424);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0647.$ic383$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var54_429, var424);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var425, var424);
        }
        return var35;
    }
    
    public static SubLObject f39467(final SubLObject var109, final SubLObject var35) {
        SubLObject var110 = (SubLObject)module0647.NIL;
        SubLObject var111 = f39460(var35, var109);
        SubLObject var112 = (SubLObject)module0647.NIL;
        var112 = var111.first();
        while (module0647.NIL != var111) {
            var110 = (SubLObject)ConsesLow.cons(module0174.f11025(var112), var110);
            var111 = var111.rest();
            var112 = var111.first();
        }
        return var110;
    }
    
    public static SubLObject f39465(final SubLObject var109, final SubLObject var35, final SubLObject var423, final SubLObject var2) {
        final SubLThread var424 = SubLProcess.currentSubLThread();
        final SubLObject var425 = module0587.$g4457$.currentBinding(var424);
        try {
            module0587.$g4457$.bind(var2, var424);
            try {
                final SubLObject var54_433 = module0601.$g4652$.currentBinding(var424);
                final SubLObject var426 = module0601.$g4654$.currentBinding(var424);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var424), module0601.$g4652$.getDynamicValue(var424)), var424);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var424), var424);
                    module0601.f36758((SubLObject)module0647.$ic384$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                    SubLObject var427 = f39468(var109, var35, var423);
                    SubLObject var428 = (SubLObject)module0647.NIL;
                    var428 = var427.first();
                    while (module0647.NIL != var427) {
                        SubLObject var430;
                        final SubLObject var429 = var430 = var428;
                        SubLObject var431 = (SubLObject)module0647.NIL;
                        SubLObject var432 = (SubLObject)module0647.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var430, var429, (SubLObject)module0647.$ic385$);
                        var431 = var430.first();
                        var430 = var430.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var430, var429, (SubLObject)module0647.$ic385$);
                        var432 = var430.first();
                        var430 = var430.rest();
                        if (module0647.NIL == var430) {
                            final SubLObject var433 = f39469(var431);
                            Label_1165: {
                                if (module0647.NIL == var431) {
                                    if (module0647.NIL == var433) {
                                        break Label_1165;
                                    }
                                }
                                try {
                                    final SubLObject var54_434 = module0601.$g4652$.currentBinding(var424);
                                    final SubLObject var56_441 = module0601.$g4654$.currentBinding(var424);
                                    try {
                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var424), module0601.$g4652$.getDynamicValue(var424)), var424);
                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var424), var424);
                                        module0601.f36758((SubLObject)module0647.$ic386$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                        if (module0647.NIL != var432) {
                                            try {
                                                final SubLObject var54_435 = module0601.$g4652$.currentBinding(var424);
                                                final SubLObject var56_442 = module0601.$g4654$.currentBinding(var424);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var424), module0601.$g4652$.getDynamicValue(var424)), var424);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var424), var424);
                                                    module0601.f36758((SubLObject)module0647.$ic387$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                                    module0797.f50965(var432);
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var56_442, var424);
                                                    module0601.$g4652$.rebind(var54_435, var424);
                                                }
                                            }
                                            finally {
                                                final SubLObject var54_436 = Threads.$is_thread_performing_cleanupP$.currentBinding(var424);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var424);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)module0647.$ic387$);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var54_436, var424);
                                                }
                                            }
                                        }
                                        if (module0647.NIL != var433) {
                                            try {
                                                final SubLObject var54_437 = module0601.$g4652$.currentBinding(var424);
                                                final SubLObject var56_443 = module0601.$g4654$.currentBinding(var424);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var424), module0601.$g4652$.getDynamicValue(var424)), var424);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var424), var424);
                                                    module0601.f36758((SubLObject)module0647.$ic388$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                                                    module0797.f50965(var433);
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var56_443, var424);
                                                    module0601.$g4652$.rebind(var54_437, var424);
                                                }
                                            }
                                            finally {
                                                final SubLObject var54_438 = Threads.$is_thread_performing_cleanupP$.currentBinding(var424);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var424);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)module0647.$ic388$);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var54_438, var424);
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        module0601.$g4654$.rebind(var56_441, var424);
                                        module0601.$g4652$.rebind(var54_434, var424);
                                    }
                                }
                                finally {
                                    final SubLObject var54_439 = Threads.$is_thread_performing_cleanupP$.currentBinding(var424);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var424);
                                        module0601.f36746();
                                        module0601.f36760((SubLObject)module0647.$ic386$);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var54_439, var424);
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var429, (SubLObject)module0647.$ic385$);
                        }
                        var427 = var427.rest();
                        var428 = var427.first();
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var426, var424);
                    module0601.$g4652$.rebind(var54_433, var424);
                }
            }
            finally {
                final SubLObject var54_440 = Threads.$is_thread_performing_cleanupP$.currentBinding(var424);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var424);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0647.$ic384$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var54_440, var424);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var425, var424);
        }
        return var35;
    }
    
    public static SubLObject f39470() {
        SubLObject var450 = module0647.$g5045$.getGlobalValue();
        if (module0647.NIL == var450) {
            var450 = module0166.f10737((SubLObject)module0647.$ic389$);
            if (module0647.NIL == var450) {
                var450 = module0166.f10737((SubLObject)module0647.$ic390$);
            }
            module0647.$g5045$.setGlobalValue(var450);
        }
        return var450;
    }
    
    public static SubLObject f39468(final SubLObject var109, SubLObject var35, final SubLObject var423) {
        SubLObject var424 = (SubLObject)module0647.NIL;
        if (module0647.NIL != var423) {
            var35 = f39460(var35, var109).first();
        }
        if (module0647.NIL != var35 && module0647.NIL != module0211.f13700(var35)) {
            final SubLObject var425 = f39470();
            final SubLObject var426 = module0647.$ic343$;
            var424 = f39424((SubLObject)module0647.$ic391$, (SubLObject)ConsesLow.list(module0647.$ic296$, (SubLObject)ConsesLow.listS(var425, (SubLObject)module0647.$ic392$, var35, (SubLObject)module0647.$ic393$)), var426, (SubLObject)module0647.$ic394$);
        }
        return var424;
    }
    
    public static SubLObject f39469(final SubLObject var437) {
        return f39438((SubLObject)module0647.$ic395$, (SubLObject)ConsesLow.list(module0647.$ic296$, (SubLObject)ConsesLow.listS(module0647.$ic396$, var437, (SubLObject)module0647.$ic397$)), module0647.$ic343$, (SubLObject)module0647.UNPROVIDED).first();
    }
    
    public static SubLObject f39464(final SubLObject var109, final SubLObject var35, final SubLObject var423, final SubLObject var2) {
        final SubLThread var424 = SubLProcess.currentSubLThread();
        final SubLObject var425 = (module0647.NIL != var423) ? f39471(var109, var35) : module0178.f11296(var35);
        final SubLObject var426 = (module0647.NIL != var423) ? f39472(var109, var35) : module0178.f11298(var35);
        final SubLObject var427 = (SubLObject)module0647.NIL;
        final SubLObject var428 = (SubLObject)module0647.NIL;
        final SubLObject var429 = (SubLObject)module0647.NIL;
        final SubLObject var430 = module0587.$g4457$.currentBinding(var424);
        try {
            module0587.$g4457$.bind(var2, var424);
            module0798.f51047(var427, var428, var425, var426, var429);
        }
        finally {
            module0587.$g4457$.rebind(var430, var424);
        }
        return var35;
    }
    
    public static SubLObject f39471(final SubLObject var109, final SubLObject var35) {
        SubLObject var110 = (SubLObject)module0647.NIL;
        if (module0647.NIL == var110) {
            SubLObject var111;
            SubLObject var112;
            for (var111 = f39460(var35, var109), var112 = (SubLObject)module0647.NIL, var112 = var111.first(); module0647.NIL == var110 && module0647.NIL != var111; var110 = module0178.f11296(var112), var111 = var111.rest(), var112 = var111.first()) {}
        }
        return var110;
    }
    
    public static SubLObject f39472(final SubLObject var109, final SubLObject var35) {
        SubLObject var110 = (SubLObject)module0647.NIL;
        if (module0647.NIL == var110) {
            SubLObject var111;
            SubLObject var112;
            for (var111 = f39460(var35, var109), var112 = (SubLObject)module0647.NIL, var112 = var111.first(); module0647.NIL == var110 && module0647.NIL != var111; var110 = module0178.f11298(var112), var111 = var111.rest(), var112 = var111.first()) {}
        }
        return var110;
    }
    
    public static SubLObject f39462(final SubLObject var35, final SubLObject var423, final SubLObject var2) {
        final SubLThread var424 = SubLProcess.currentSubLThread();
        final SubLObject var425 = module0587.$g4457$.currentBinding(var424);
        try {
            module0587.$g4457$.bind(var2, var424);
            if (module0647.NIL != var423) {
                f39473(f39474(var35), var2);
            }
            else {
                f39473(module0289.f19401(var35), var2);
            }
        }
        finally {
            module0587.$g4457$.rebind(var425, var424);
        }
        return var35;
    }
    
    public static SubLObject f39473(final SubLObject var110, SubLObject var2) {
        if (var2 == module0647.UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        final SubLObject var112 = module0587.$g4457$.currentBinding(var111);
        try {
            module0587.$g4457$.bind(var2, var111);
            try {
                final SubLObject var54_458 = module0601.$g4652$.currentBinding(var111);
                final SubLObject var113 = module0601.$g4654$.currentBinding(var111);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var111), module0601.$g4652$.getDynamicValue(var111)), var111);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var111), var111);
                    module0601.f36758((SubLObject)module0647.$ic398$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                    module0797.f50965(var110);
                }
                finally {
                    module0601.$g4654$.rebind(var113, var111);
                    module0601.$g4652$.rebind(var54_458, var111);
                }
            }
            finally {
                final SubLObject var54_459 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var111);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0647.$ic398$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var54_459, var111);
                }
            }
            final SubLObject var114 = f39475(var110);
            if (module0647.NIL != var114) {
                try {
                    final SubLObject var54_460 = module0601.$g4652$.currentBinding(var111);
                    final SubLObject var115 = module0601.$g4654$.currentBinding(var111);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var111), module0601.$g4652$.getDynamicValue(var111)), var111);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var111), var111);
                        module0601.f36758((SubLObject)module0647.$ic399$, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
                        module0797.f50965(var114);
                    }
                    finally {
                        module0601.$g4654$.rebind(var115, var111);
                        module0601.$g4652$.rebind(var54_460, var111);
                    }
                }
                finally {
                    final SubLObject var54_461 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0647.T, var111);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0647.$ic399$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var54_461, var111);
                    }
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var112, var111);
        }
        return var110;
    }
    
    public static SubLObject f39476() {
        final SubLObject var463 = module0647.$g5046$.getGlobalValue();
        if (module0647.NIL != var463) {
            module0034.f1818(var463);
        }
        return (SubLObject)module0647.NIL;
    }
    
    public static SubLObject f39477(final SubLObject var110) {
        return module0034.f1829(module0647.$g5046$.getGlobalValue(), (SubLObject)ConsesLow.list(var110), (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
    }
    
    public static SubLObject f39478(final SubLObject var110) {
        final SubLObject var111 = (SubLObject)ConsesLow.list((SubLObject)module0647.$ic297$, (SubLObject)module0647.ONE_INTEGER);
        final SubLObject var112 = module0162.f10628(var110);
        final SubLObject var113 = module0161.f10557(var112);
        return (SubLObject)((module0647.NIL != module0161.f10481(var113)) ? f39438((SubLObject)module0647.$ic401$, (SubLObject)ConsesLow.list(module0647.$ic402$, (SubLObject)module0647.$ic401$, var113), module0647.$ic343$, var111).first() : module0647.NIL);
    }
    
    public static SubLObject f39475(final SubLObject var110) {
        SubLObject var111 = module0647.$g5046$.getGlobalValue();
        if (module0647.NIL == var111) {
            var111 = module0034.f1934((SubLObject)module0647.$ic400$, (SubLObject)module0647.$ic403$, (SubLObject)module0647.NIL, (SubLObject)module0647.EQUAL, (SubLObject)module0647.ONE_INTEGER, (SubLObject)module0647.ZERO_INTEGER);
        }
        SubLObject var112 = module0034.f1814(var111, var110, (SubLObject)module0647.$ic346$);
        if (var112 == module0647.$ic346$) {
            var112 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f39478(var110)));
            module0034.f1816(var111, var110, var112, (SubLObject)module0647.UNPROVIDED);
        }
        return module0034.f1959(var112);
    }
    
    public static SubLObject f39453(final SubLObject var109, final SubLObject var354, final SubLObject var110, final SubLObject var34) {
        SubLObject var355 = (SubLObject)module0647.NIL;
        SubLObject var356 = f39243(var354);
        SubLObject var357 = (SubLObject)module0647.NIL;
        var357 = var356.first();
        while (module0647.NIL != var356) {
            final SubLObject var358 = f39297(var357);
            final SubLObject var359 = f39479(var109, var357, var110, var34);
            if (module0647.NIL != var359) {
                var355 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var358, var359), var355);
            }
            var356 = var356.rest();
            var357 = var356.first();
        }
        return Sequences.nreverse(var355);
    }
    
    public static SubLObject f39479(final SubLObject var109, final SubLObject var46, SubLObject var110, final SubLObject var34) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        assert module0647.NIL != module0173.f10955(var109) : var109;
        assert module0647.NIL != f39295(var46) : var46;
        var110 = module0285.f18875(var110, var110);
        assert module0647.NIL != module0161.f10481(var110) : var110;
        SubLObject var112 = (SubLObject)module0647.NIL;
        var111.resetMultipleValues();
        final SubLObject var113 = f39480(var46, var109, var110);
        final SubLObject var114 = var111.secondMultipleValue();
        var111.resetMultipleValues();
        var111.resetMultipleValues();
        final SubLObject var115 = f39481(var113, var114);
        final SubLObject var116 = var111.secondMultipleValue();
        final SubLObject var117 = var111.thirdMultipleValue();
        var111.resetMultipleValues();
        if (module0647.NIL != var115) {
            final SubLObject var118 = f39350(var46);
            final SubLObject var119 = (SubLObject)((module0647.NIL == var118 && module0647.NIL != f39348(var46)) ? module0647.ONE_INTEGER : module0647.NIL);
            final SubLObject var120 = f39482(var115, var109, var34, var119, var116, var114, (SubLObject)module0647.T, var118);
            var112 = module0213.f13926(var120, (SubLObject)module0647.NIL, (SubLObject)module0647.T, (SubLObject)module0647.NIL, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        }
        return var112;
    }
    
    public static SubLObject f39482(final SubLObject var107, final SubLObject var109, SubLObject var34, final SubLObject var472, final SubLObject var469, SubLObject var467, SubLObject var473, SubLObject var474) {
        if (var467 == module0647.UNPROVIDED) {
            var467 = (SubLObject)module0647.NIL;
        }
        if (var473 == module0647.UNPROVIDED) {
            var473 = (SubLObject)module0647.T;
        }
        if (var474 == module0647.UNPROVIDED) {
            var474 = (SubLObject)module0647.NIL;
        }
        final SubLThread var475 = SubLProcess.currentSubLThread();
        SubLObject var476 = (SubLObject)module0647.NIL;
        SubLObject var477 = (SubLObject)module0647.NIL;
        SubLObject var478 = (SubLObject)module0647.NIL;
        SubLObject var479 = (SubLObject)module0647.NIL;
        final SubLObject var480 = module0205.f13220(f39483(var469), var107, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        if (module0647.NIL == module0205.f13220(module0647.$ic406$, var107, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED)) {
            final SubLObject var481 = (module0647.NIL != module0161.f10479(module0586.$g4456$.getDynamicValue(var475))) ? module0162.f10628((SubLObject)ConsesLow.list(module0647.$ic407$, module0586.$g4456$.getDynamicValue(var475), var34)) : var34;
            var476 = f39484(var107, var481, var472, (SubLObject)module0647.T);
            var477 = f39485(var469, var476, var109, var481, var473, var480);
            if (module0647.NIL == var476 && module0647.NIL != module0259.f16854(var34, module0647.$ic408$, var34, (SubLObject)module0647.UNPROVIDED)) {
                final SubLObject var482 = f39486(var34);
                var476 = f39484(var107, var482, var472, (SubLObject)module0647.T);
                var34 = var482;
            }
            final SubLObject var483 = f39485(var469, var476, var109, var34, var473, var480);
            if (module0647.NIL != var483) {
                var477 = ConsesLow.append(var483, var477);
            }
        }
        if (module0647.NIL != var474) {
            final SubLObject var484 = (SubLObject)module0647.$ic409$;
            final SubLObject var485 = f39487(module0721.f44213((SubLObject)module0647.$ic410$, var109, var469, var484), var467);
            var478 = f39484(var485, f39488(var34, var469), var472, (SubLObject)module0647.T);
            if (module0647.NIL == var478 && module0647.NIL != module0161.f10479(module0586.$g4456$.getDynamicValue(var475)) && module0647.NIL != f39489(var469)) {
                var478 = f39484(var485, f39488(module0586.$g4456$.getDynamicValue(var475), var469), var472, (SubLObject)module0647.T);
            }
            var478 = f39490(var478, var476);
            var479 = f39491(var469, var478, var473);
        }
        return Sequences.remove_duplicates(conses_high.union(var479, var477, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED), Symbols.symbol_function((SubLObject)module0647.EQUAL), (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
    }
    
    public static SubLObject f39489(final SubLObject var469) {
        return (SubLObject)module0647.T;
    }
    
    public static SubLObject f39488(final SubLObject var34, final SubLObject var469) {
        return (module0647.NIL != module0202.f12589(var469, module0647.$ic406$)) ? f39410(var34) : var34;
    }
    
    public static SubLObject f39490(final SubLObject var477, final SubLObject var485) {
        SubLObject var486 = (SubLObject)module0647.NIL;
        SubLObject var487 = var477;
        SubLObject var488 = (SubLObject)module0647.NIL;
        var488 = var487.first();
        while (module0647.NIL != var487) {
            if (module0647.NIL == f39492(var488, var485)) {
                var486 = (SubLObject)ConsesLow.cons(var488, var486);
            }
            var487 = var487.rest();
            var488 = var487.first();
        }
        return var486;
    }
    
    public static SubLObject f39492(final SubLObject var487, final SubLObject var485) {
        final SubLObject var488 = var487.first();
        final SubLObject var489 = module0233.f15369((SubLObject)module0647.$ic410$, var488);
        SubLObject var490 = (SubLObject)module0647.NIL;
        if (module0647.NIL != module0174.f11035(var489) && module0647.NIL == var490) {
            SubLObject var491 = var485;
            SubLObject var492 = (SubLObject)module0647.NIL;
            var492 = var491.first();
            while (module0647.NIL == var490 && module0647.NIL != var491) {
                if (module0647.NIL == var490) {
                    SubLObject var457_491 = conses_high.second(var492);
                    SubLObject var493 = (SubLObject)module0647.NIL;
                    var493 = var457_491.first();
                    while (module0647.NIL == var490 && module0647.NIL != var457_491) {
                        if (var493.eql(var489)) {
                            var490 = (SubLObject)module0647.T;
                        }
                        var457_491 = var457_491.rest();
                        var493 = var457_491.first();
                    }
                }
                var491 = var491.rest();
                var492 = var491.first();
            }
        }
        return var490;
    }
    
    public static SubLObject f39491(final SubLObject var469, final SubLObject var475, final SubLObject var473) {
        SubLObject var476 = (SubLObject)module0647.NIL;
        SubLObject var477 = var475;
        SubLObject var478 = (SubLObject)module0647.NIL;
        var478 = var477.first();
        while (module0647.NIL != var477) {
            SubLObject var52_493 = f39493(var469, var478, var473);
            SubLObject var479 = (SubLObject)module0647.NIL;
            var479 = var52_493.first();
            while (module0647.NIL != var52_493) {
                if (module0647.NIL != module0174.f11035(var479)) {
                    var476 = (SubLObject)ConsesLow.cons(var479, var476);
                }
                else {
                    var476 = f39494(var479, var476);
                }
                var52_493 = var52_493.rest();
                var479 = var52_493.first();
            }
            var477 = var477.rest();
            var478 = var477.first();
        }
        return Sequences.nreverse(var476);
    }
    
    public static SubLObject f39494(final SubLObject var35, SubLObject var292) {
        SubLObject var293 = (SubLObject)module0647.NIL;
        if (module0647.NIL == var293) {
            SubLObject var294 = var292;
            SubLObject var295 = (SubLObject)module0647.NIL;
            var295 = var294.first();
            while (module0647.NIL == var293 && module0647.NIL != var294) {
                if (module0647.NIL != f39459(var295) && conses_high.second(var295).equal(conses_high.second(var35)) && conses_high.third(var295).equal(conses_high.third(var35))) {
                    var293 = var295;
                }
                var294 = var294.rest();
                var295 = var294.first();
            }
        }
        if (module0647.NIL == var293) {
            var292 = (SubLObject)ConsesLow.cons(var35, var292);
        }
        else if (!var293.equal(var35)) {
            ConsesLow.set_nth((SubLObject)module0647.THREE_INTEGER, var293, Sequences.delete_duplicates(ConsesLow.nconc(ConsesLow.nth((SubLObject)module0647.THREE_INTEGER, var35), ConsesLow.nth((SubLObject)module0647.THREE_INTEGER, var293)), (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
        }
        return var292;
    }
    
    public static SubLObject f39493(final SubLObject var469, final SubLObject var41, final SubLObject var473) {
        SubLObject var474 = (SubLObject)module0647.NIL;
        final SubLObject var475 = var41.first();
        final SubLObject var476 = conses_high.second(var41);
        SubLObject var477 = (SubLObject)module0647.NIL;
        if (module0647.NIL != var473) {
            final SubLObject var478 = module0233.f15362(var475, module0202.f12763(var469));
            SubLObject var479 = (SubLObject)module0647.NIL;
            SubLObject var480 = var476;
            SubLObject var481 = (SubLObject)module0647.NIL;
            var481 = var480.first();
            while (module0647.NIL != var480) {
                if (module0647.NIL != module0174.f11035(var481) && module0647.NIL != module0721.f44224(var481)) {
                    final SubLObject var482 = module0178.f11334(var481);
                    if (module0647.NIL != module0174.f11035(var482)) {
                        var479 = (SubLObject)ConsesLow.cons(var482, var479);
                        if (module0647.NIL == var477) {
                            var477 = module0289.f19401(var481);
                        }
                    }
                }
                var480 = var480.rest();
                var481 = var480.first();
            }
            if (module0647.NIL != var479) {
                final SubLObject var483 = f39495(var478, var477, var479);
                if (module0647.NIL == conses_high.member(var483, var474, Symbols.symbol_function((SubLObject)module0647.EQUAL), Symbols.symbol_function((SubLObject)module0647.IDENTITY))) {
                    var474 = (SubLObject)ConsesLow.cons(var483, var474);
                }
            }
        }
        else {
            final SubLObject var484 = module0233.f15369((SubLObject)module0647.$ic410$, var475);
            if (module0647.NIL != module0174.f11035(var484)) {
                final SubLObject var485 = var484;
                if (module0647.NIL == conses_high.member(var485, var474, Symbols.symbol_function((SubLObject)module0647.EQL), Symbols.symbol_function((SubLObject)module0647.IDENTITY))) {
                    var474 = (SubLObject)ConsesLow.cons(var485, var474);
                }
            }
        }
        return Sequences.nreverse(var474);
    }
    
    public static SubLObject f39484(final SubLObject var484, final SubLObject var110, final SubLObject var501, SubLObject var502) {
        if (var502 == module0647.UNPROVIDED) {
            var502 = (SubLObject)module0647.NIL;
        }
        SubLObject var503 = module0434.f30570((SubLObject)module0647.ZERO_INTEGER, var501, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED);
        SubLObject var504 = (SubLObject)module0647.NIL;
        var503 = conses_high.putf(var503, (SubLObject)module0647.$ic411$, (SubLObject)module0647.$ic412$);
        var503 = conses_high.putf(var503, (SubLObject)module0647.$ic413$, (SubLObject)module0647.$ic414$);
        var503 = conses_high.putf(var503, (SubLObject)module0647.$ic300$, (SubLObject)module0647.$ic415$);
        var503 = conses_high.putf(var503, (SubLObject)module0647.$ic302$, (SubLObject)module0647.$ic303$);
        var503 = conses_high.putf(var503, (SubLObject)module0647.$ic416$, var502);
        var503 = conses_high.putf(var503, (SubLObject)module0647.$ic299$, module0586.f35849());
        if (module0647.NIL != f39325()) {
            var503 = conses_high.putf(var503, (SubLObject)module0647.$ic417$, (SubLObject)module0647.T);
        }
        var504 = module0409.f28506(var484, var110, var503);
        return var504;
    }
    
    public static SubLObject f39496(final SubLObject var107, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        SubLObject var112 = (SubLObject)module0647.NIL;
        SubLObject var113 = (SubLObject)module0647.NIL;
        final SubLObject var114 = module0147.$g2094$.currentBinding(var111);
        final SubLObject var115 = module0147.$g2095$.currentBinding(var111);
        try {
            module0147.$g2094$.bind((SubLObject)module0647.$ic418$, var111);
            module0147.$g2095$.bind(module0647.$ic419$, var111);
            var113 = module0288.f19344(var107, (SubLObject)module0647.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var115, var111);
            module0147.$g2094$.rebind(var114, var111);
        }
        final SubLObject var116 = module0147.f9540(var110);
        final SubLObject var117 = module0147.$g2095$.currentBinding(var111);
        final SubLObject var118 = module0147.$g2094$.currentBinding(var111);
        final SubLObject var119 = module0147.$g2096$.currentBinding(var111);
        try {
            module0147.$g2095$.bind(module0147.f9545(var116), var111);
            module0147.$g2094$.bind(module0147.f9546(var116), var111);
            module0147.$g2096$.bind(module0147.f9549(var116), var111);
            SubLObject var120 = var113;
            SubLObject var121 = (SubLObject)module0647.NIL;
            var121 = var120.first();
            while (module0647.NIL != var120) {
                if (module0647.NIL != module0147.f9507(module0178.f11287(var121))) {
                    var112 = (SubLObject)ConsesLow.cons(var121, var112);
                }
                var120 = var120.rest();
                var121 = var120.first();
            }
        }
        finally {
            module0147.$g2096$.rebind(var119, var111);
            module0147.$g2094$.rebind(var118, var111);
            module0147.$g2095$.rebind(var117, var111);
        }
        return var112;
    }
    
    public static SubLObject f39485(final SubLObject var107, final SubLObject var475, final SubLObject var109, final SubLObject var110, final SubLObject var473, SubLObject var479) {
        if (var479 == module0647.UNPROVIDED) {
            var479 = (SubLObject)module0647.NIL;
        }
        SubLObject var480 = (SubLObject)module0647.NIL;
        SubLObject var481 = var475;
        SubLObject var482 = (SubLObject)module0647.NIL;
        var482 = var481.first();
        while (module0647.NIL != var481) {
            final SubLObject var483 = var482.first();
            final SubLObject var484 = conses_high.second(var482);
            SubLObject var485 = module0202.f12763(var107);
            final SubLObject var486 = (SubLObject)module0647.NIL;
            SubLObject var487 = (SubLObject)module0647.NIL;
            SubLObject var488 = (SubLObject)module0647.NIL;
            if (module0647.NIL == var486) {
                SubLObject var489 = var483;
                SubLObject var490 = (SubLObject)module0647.NIL;
                var490 = var489.first();
                while (module0647.NIL == var486 && module0647.NIL != var489) {
                    SubLObject var492;
                    final SubLObject var491 = var492 = var490;
                    SubLObject var493 = (SubLObject)module0647.NIL;
                    SubLObject var494 = (SubLObject)module0647.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var492, var491, (SubLObject)module0647.$ic420$);
                    var493 = var492.first();
                    var492 = (var494 = var492.rest());
                    if (module0647.NIL != f39497(var494)) {
                        var488 = (SubLObject)ConsesLow.cons(var494, var488);
                        var487 = (SubLObject)module0647.T;
                    }
                    else {
                        var485 = module0035.f2457(var485, var493, var494);
                    }
                    var489 = var489.rest();
                    var490 = var489.first();
                }
            }
            if (module0647.NIL == var486) {
                if (module0647.NIL != var473 && module0647.NIL != var487) {
                    SubLObject var495 = (SubLObject)module0647.NIL;
                    SubLObject var496 = (SubLObject)module0647.NIL;
                    SubLObject var52_513 = var484;
                    SubLObject var497 = (SubLObject)module0647.NIL;
                    var497 = var52_513.first();
                    while (module0647.NIL != var52_513) {
                        if (module0647.NIL != module0174.f11035(var497)) {
                            var496 = (SubLObject)ConsesLow.cons(var497, var496);
                            if (module0647.NIL == var495) {
                                SubLObject var52_514 = var488;
                                SubLObject var498 = (SubLObject)module0647.NIL;
                                var498 = var52_514.first();
                                while (module0647.NIL != var52_514) {
                                    if (module0647.NIL != module0205.f13220(var498, var497, (SubLObject)module0647.T, Symbols.symbol_function((SubLObject)module0647.EQUAL), (SubLObject)module0647.UNPROVIDED)) {
                                        var495 = module0289.f19401(var497);
                                    }
                                    var52_514 = var52_514.rest();
                                    var498 = var52_514.first();
                                }
                            }
                        }
                        var52_513 = var52_513.rest();
                        var497 = var52_513.first();
                    }
                    if (module0647.NIL == var495) {
                        var495 = var110;
                    }
                    if (module0647.NIL != var496) {
                        var480 = f39494(f39495(var485, var495, var496), var480);
                    }
                }
                else if (module0647.NIL != var487) {
                    SubLObject var52_515 = var484;
                    SubLObject var499 = (SubLObject)module0647.NIL;
                    var499 = var52_515.first();
                    while (module0647.NIL != var52_515) {
                        if (module0647.NIL != module0174.f11035(var499)) {
                            var480 = (SubLObject)ConsesLow.cons(var499, var480);
                        }
                        var52_515 = var52_515.rest();
                        var499 = var52_515.first();
                    }
                }
                else if (module0647.NIL != var479) {
                    final SubLObject var500 = module0233.f15369(f39483(var107), var483);
                    if (module0647.NIL != module0174.f11035(var500)) {
                        var480 = (SubLObject)ConsesLow.cons(var500, var480);
                    }
                }
                else {
                    final SubLObject var501 = f39496(var485, var110);
                    if (module0647.NIL != var501) {
                        if (module0647.NIL != module0035.f1997(var501)) {
                            final SubLObject var502 = var501.first();
                            if (module0647.NIL == conses_high.member(var502, var480, Symbols.symbol_function((SubLObject)module0647.EQUAL), Symbols.symbol_function((SubLObject)module0647.IDENTITY))) {
                                var480 = (SubLObject)ConsesLow.cons(var502, var480);
                            }
                        }
                        else if (module0647.NIL != module0035.f2192(Symbols.symbol_function((SubLObject)module0647.$ic421$), var501)) {
                            final SubLObject var502 = var501.first();
                            if (module0647.NIL == conses_high.member(var502, var480, Symbols.symbol_function((SubLObject)module0647.EQUAL), Symbols.symbol_function((SubLObject)module0647.IDENTITY))) {
                                var480 = (SubLObject)ConsesLow.cons(var502, var480);
                            }
                        }
                        else if (module0647.NIL != var473 && (module0647.NIL != module0202.f12595(var107) || module0647.NIL != module0202.f12606(var107))) {
                            final SubLObject var110_518 = module0205.f13144(module0233.f15369(module0647.$g5048$.getGlobalValue(), var483));
                            if (module0647.NIL == module0207.f13529(var110_518)) {
                                module0289.f19401(var501.first());
                            }
                            final SubLObject var503 = f39495(var485, var110_518, (SubLObject)module0647.UNPROVIDED);
                            if (module0647.NIL == conses_high.member(var503, var480, Symbols.symbol_function((SubLObject)module0647.EQUAL), Symbols.symbol_function((SubLObject)module0647.IDENTITY))) {
                                var480 = (SubLObject)ConsesLow.cons(var503, var480);
                            }
                        }
                        else {
                            SubLObject var52_516 = var501;
                            SubLObject var504 = (SubLObject)module0647.NIL;
                            var504 = var52_516.first();
                            while (module0647.NIL != var52_516) {
                                if (module0647.NIL != module0174.f11035(var504)) {
                                    var480 = (SubLObject)ConsesLow.cons(var504, var480);
                                }
                                var52_516 = var52_516.rest();
                                var504 = var52_516.first();
                            }
                        }
                    }
                }
            }
            var481 = var481.rest();
            var482 = var481.first();
        }
        SubLObject var505 = (SubLObject)module0647.NIL;
        SubLObject var506 = var480;
        SubLObject var507 = (SubLObject)module0647.NIL;
        var507 = var506.first();
        while (module0647.NIL != var506) {
            if (module0647.NIL == f39498(var507)) {
                var505 = (SubLObject)ConsesLow.cons(var507, var505);
            }
            var506 = var506.rest();
            var507 = var506.first();
        }
        return var505;
    }
    
    public static SubLObject f39495(final SubLObject var369, final SubLObject var278, SubLObject var499) {
        if (var499 == module0647.UNPROVIDED) {
            var499 = (SubLObject)module0647.NIL;
        }
        assert module0647.NIL != module0202.f12590(var369) : var369;
        assert module0647.NIL != module0207.f13529(var278) : var278;
        SubLObject var500 = var499;
        SubLObject var501 = (SubLObject)module0647.NIL;
        var501 = var500.first();
        while (module0647.NIL != var500) {
            assert module0647.NIL != module0174.f11035(var501) : var501;
            var500 = var500.rest();
            var501 = var500.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0647.$ic424$, var369, var278, var499);
    }
    
    public static SubLObject f39459(final SubLObject var101) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var101.isList() && module0647.NIL != module0035.f2000(var101, (SubLObject)module0647.THREE_INTEGER, (SubLObject)module0647.UNPROVIDED) && module0647.NIL != module0035.f1994(var101, (SubLObject)module0647.FOUR_INTEGER, (SubLObject)module0647.UNPROVIDED) && var101.first() == module0647.$ic424$);
    }
    
    public static SubLObject f39466(final SubLObject var35) {
        assert module0647.NIL != f39459(var35) : var35;
        return conses_high.second(var35);
    }
    
    public static SubLObject f39460(final SubLObject var35, final SubLObject var522) {
        assert module0647.NIL != f39459(var35) : var35;
        final SubLObject var523 = conses_high.fourth(var35);
        if (module0647.NIL != var523) {
            return var523;
        }
        final SubLObject var524 = f39499(var35, var522);
        ConsesLow.set_nth((SubLObject)module0647.THREE_INTEGER, var35, var524);
        return var524;
    }
    
    public static SubLObject f39499(final SubLObject var35, final SubLObject var522) {
        final SubLObject var523 = f39466(var35);
        final SubLObject var524 = module0162.f10628(f39474(var35));
        final SubLObject var525 = f39481(var523, (SubLObject)module0647.NIL);
        final SubLObject var526 = (SubLObject)module0647.NIL;
        final SubLObject var527 = (SubLObject)module0647.NIL;
        final SubLObject var528 = (SubLObject)module0647.T;
        return f39482(var525, var522, var524, var526, var523, (SubLObject)module0647.NIL, var527, var528);
    }
    
    public static SubLObject f39474(final SubLObject var35) {
        assert module0647.NIL != f39459(var35) : var35;
        return conses_high.third(var35);
    }
    
    public static SubLObject f39500(final SubLObject var35) {
        if (module0647.NIL != module0174.f11035(var35)) {
            return module0178.f11287(var35);
        }
        if (module0647.NIL != f39459(var35)) {
            return f39474(var35);
        }
        return (SubLObject)module0647.NIL;
    }
    
    public static SubLObject f39498(final SubLObject var35) {
        final SubLObject var36 = (SubLObject)module0647.NIL;
        if (module0647.NIL != module0174.f11035(var35)) {}
        return var36;
    }
    
    public static SubLObject f39501(final SubLObject var49) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0647.NIL != module0349.f23399(var49) && module0647.NIL == f39497(var49));
    }
    
    public static SubLObject f39497(final SubLObject var49) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0647.NIL != module0269.f17801(var49) || module0647.NIL != module0210.f13585(var49));
    }
    
    public static SubLObject f39480(final SubLObject var46, final SubLObject var109, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        SubLObject var112 = f39298(var46);
        final SubLObject var113 = f39301(var46);
        SubLObject var114 = (SubLObject)module0647.NIL;
        if (module0647.NIL != var112) {
            var112 = module0202.f12763(var112);
            SubLObject var115 = var113;
            SubLObject var116 = (SubLObject)module0647.NIL;
            var116 = var115.first();
            while (module0647.NIL != var115) {
                module0205.f13268(var109, var116.rest(), var112);
                var115 = var115.rest();
                var116 = var115.first();
            }
            SubLObject var117 = (SubLObject)module0647.NIL;
            SubLObject var118 = (SubLObject)module0647.NIL;
            SubLObject var119 = (SubLObject)module0647.NIL;
            var117 = f39303(var46);
            var118 = var117.first();
            for (var119 = (SubLObject)module0647.ZERO_INTEGER; module0647.NIL != var117; var117 = var117.rest(), var118 = var117.first(), var119 = Numbers.add((SubLObject)module0647.ONE_INTEGER, var119)) {
                final SubLObject var120 = ConsesLow.nth(var119, module0647.$g5047$.getGlobalValue());
                final SubLObject var121 = f39270(var118);
                final SubLObject var122 = f39279(var118);
                SubLObject var123 = (SubLObject)module0647.NIL;
                if (module0647.NIL == module0004.f104(var121, var113, Symbols.symbol_function((SubLObject)module0647.EQUAL), (SubLObject)module0647.UNPROVIDED)) {
                    var123 = module0205.f13394(var112, var121.rest(), (SubLObject)module0647.UNPROVIDED);
                    module0205.f13268(var120, var121.rest(), var112);
                    var111.resetMultipleValues();
                    final SubLObject var124 = f39502(var123, var110);
                    final SubLObject var125 = var111.secondMultipleValue();
                    var111.resetMultipleValues();
                    if (module0647.NIL != var124) {
                        SubLObject var126 = module0202.f12768(var125, var120, var124);
                        if (module0647.NIL != module0206.f13451(var122)) {
                            var126 = module0202.f12772((SubLObject)ConsesLow.list(var126, (SubLObject)ConsesLow.list(module0647.$ic426$, var120, var122)));
                        }
                        var114 = (SubLObject)ConsesLow.cons(var126, var114);
                    }
                }
            }
            return Values.values(var112, var114);
        }
        return (SubLObject)module0647.NIL;
    }
    
    public static SubLObject f39481(SubLObject var107, SubLObject var528) {
        if (var528 == module0647.UNPROVIDED) {
            var528 = (SubLObject)module0647.NIL;
        }
        SubLObject var529 = (SubLObject)module0647.NIL;
        final SubLObject var530 = module0202.f12763(var107);
        if (module0647.NIL != module0202.f12606(var107)) {
            var107 = module0205.f13204(var107, (SubLObject)module0647.UNPROVIDED);
            var529 = (SubLObject)module0647.T;
        }
        var107 = f39487(var107, var528);
        return Values.values(var107, var530, var529);
    }
    
    public static SubLObject f39487(final SubLObject var107, SubLObject var528) {
        SubLObject var529 = var107;
        if (module0647.NIL == var528) {
            return f39503(var107, (SubLObject)module0647.UNPROVIDED);
        }
        if (module0205.f13132(var107).eql(module0647.$ic427$)) {
            SubLObject var530 = (SubLObject)module0647.NIL;
            SubLObject var531 = (SubLObject)module0647.NIL;
            SubLObject var532 = (SubLObject)module0647.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var107, var107, (SubLObject)module0647.$ic428$);
            var530 = var107.first();
            SubLObject var533 = var107.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var533, var107, (SubLObject)module0647.$ic428$);
            var531 = var533.first();
            var533 = var533.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var533, var107, (SubLObject)module0647.$ic428$);
            var532 = var533.first();
            var533 = var533.rest();
            if (module0647.NIL == var533) {
                var528 = (SubLObject)ConsesLow.cons(f39503(var532, (SubLObject)module0647.UNPROVIDED), var528);
                var529 = module0202.f12768(var530, var531, module0276.f18287(var528, (SubLObject)module0647.UNPROVIDED));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var107, (SubLObject)module0647.$ic428$);
            }
        }
        else {
            var528 = (SubLObject)ConsesLow.cons(f39503(var107, (SubLObject)module0647.UNPROVIDED), var528);
            var529 = module0276.f18287(var528, (SubLObject)module0647.UNPROVIDED);
        }
        return var529;
    }
    
    public static SubLObject f39483(final SubLObject var107) {
        return (SubLObject)module0647.$ic429$;
    }
    
    public static SubLObject f39503(final SubLObject var107, SubLObject var543) {
        if (var543 == module0647.UNPROVIDED) {
            var543 = (SubLObject)module0647.NIL;
        }
        final SubLThread var544 = SubLProcess.currentSubLThread();
        final SubLObject var545 = module0205.f13132(var107);
        if (module0647.NIL != module0202.f12606(var107)) {
            SubLObject var546 = (SubLObject)module0647.NIL;
            SubLObject var547 = (SubLObject)module0647.NIL;
            SubLObject var548 = (SubLObject)module0647.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var107, var107, (SubLObject)module0647.$ic430$);
            var546 = var107.first();
            SubLObject var549 = var107.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var549, var107, (SubLObject)module0647.$ic430$);
            var547 = var549.first();
            var549 = var549.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var549, var107, (SubLObject)module0647.$ic430$);
            var548 = var549.first();
            var549 = var549.rest();
            if (module0647.NIL == var549) {
                return module0202.f12768(var546, var547, f39503(var548, (SubLObject)module0647.UNPROVIDED));
            }
            cdestructuring_bind.cdestructuring_bind_error(var107, (SubLObject)module0647.$ic430$);
        }
        else {
            if (module0647.NIL != module0202.f12595(var107)) {
                SubLObject var550 = (SubLObject)module0647.NIL;
                final SubLObject var551 = module0647.$g5049$.currentBinding(var544);
                try {
                    module0647.$g5049$.bind((SubLObject)module0647.NIL, var544);
                    SubLObject var552 = var107.rest();
                    SubLObject var553 = (SubLObject)module0647.NIL;
                    var553 = var552.first();
                    while (module0647.NIL != var552) {
                        var550 = (SubLObject)ConsesLow.cons(f39503(var553, (SubLObject)module0647.T), var550);
                        var552 = var552.rest();
                        var553 = var552.first();
                    }
                }
                finally {
                    module0647.$g5049$.rebind(var551, var544);
                }
                return module0276.f18287(var550, (SubLObject)module0647.UNPROVIDED);
            }
            if (module0647.NIL == module0269.f17737(var545)) {
                final SubLObject var554 = f39483(var107);
                return (module0647.NIL != f39504(var107, var554)) ? module0202.f12768(module0647.$ic431$, var554, var107) : ((module0647.NIL != module0202.f12589(var107, module0647.$ic427$)) ? module0202.f12817((SubLObject)module0647.ZERO_INTEGER, module0647.$ic432$, var107) : ((module0647.NIL != var543) ? module0202.f12768(module0647.$ic432$, module0647.$g5048$.getGlobalValue(), var107) : module0202.f12643(module0647.$ic296$, var107)));
            }
        }
        return var107;
    }
    
    public static SubLObject f39504(final SubLObject var107, final SubLObject var549) {
        final SubLThread var550 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0647.NIL != module0647.$g5049$.getDynamicValue(var550) && module0647.NIL == module0205.f13220(var549, var107, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED) && module0647.NIL == module0202.f12589(var107, module0647.$ic433$));
    }
    
    public static SubLObject f39502(final SubLObject var212, final SubLObject var110) {
        final SubLThread var213 = SubLProcess.currentSubLThread();
        if (module0647.NIL != module0172.f10917(var212) && module0647.NIL == module0004.f104(var212, module0647.$g5050$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0647.EQUAL), (SubLObject)module0647.UNPROVIDED)) {
            final SubLObject var214 = module0205.f13203(var212, (SubLObject)module0647.UNPROVIDED);
            if (module0647.NIL != module0172.f10917(var214)) {
                final SubLObject var215 = module0205.f13132(var214);
                if (var215.eql(module0647.$ic435$)) {
                    return Values.values(module0205.f13203(var214, (SubLObject)module0647.UNPROVIDED), module0647.$ic295$);
                }
                if (var215.eql(module0647.$ic436$)) {
                    SubLObject var216 = module0205.f13203(var214, (SubLObject)module0647.UNPROVIDED);
                    if (module0647.NIL != module0172.f10917(var216) && module0205.f13132(var216).eql(module0647.$ic435$)) {
                        var216 = module0205.f13203(var216, (SubLObject)module0647.UNPROVIDED);
                    }
                    return Values.values(var216, module0647.$ic312$);
                }
                if (var215.eql(module0647.$ic437$)) {
                    return Values.values(module0205.f13203(var214, (SubLObject)module0647.UNPROVIDED), module0647.$ic312$);
                }
                return Values.values(var214, module0647.$ic312$);
            }
            else if (module0647.NIL != module0173.f10955(var214)) {
                SubLObject var217 = (SubLObject)module0647.NIL;
                final SubLObject var218 = module0147.f9540(var110);
                final SubLObject var219 = module0147.$g2095$.currentBinding(var213);
                final SubLObject var220 = module0147.$g2094$.currentBinding(var213);
                final SubLObject var221 = module0147.$g2096$.currentBinding(var213);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var218), var213);
                    module0147.$g2094$.bind(module0147.f9546(var218), var213);
                    module0147.$g2096$.bind(module0147.f9549(var218), var213);
                    var217 = (SubLObject)SubLObjectFactory.makeBoolean(module0647.NIL == module0220.f14544(var214, module0647.$ic438$, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED) && module0647.NIL == module0220.f14544(var214, module0647.$ic439$, (SubLObject)module0647.UNPROVIDED, (SubLObject)module0647.UNPROVIDED));
                }
                finally {
                    module0147.$g2096$.rebind(var221, var213);
                    module0147.$g2094$.rebind(var220, var213);
                    module0147.$g2095$.rebind(var219, var213);
                }
                return Values.values((SubLObject)((module0647.NIL != var217) ? var214 : module0647.NIL), module0647.$ic312$);
            }
        }
        return Values.values((SubLObject)module0647.NIL, (SubLObject)module0647.NIL);
    }
    
    public static SubLObject f39486(final SubLObject var552) {
        final SubLObject var553 = (SubLObject)ConsesLow.list((SubLObject)module0647.$ic297$, (SubLObject)module0647.ONE_INTEGER);
        final SubLObject var554 = f39438((SubLObject)module0647.$ic440$, (SubLObject)ConsesLow.list(module0647.$ic328$, (SubLObject)module0647.$ic441$, (SubLObject)ConsesLow.list(module0647.$ic442$, (SubLObject)module0647.$ic440$, var552)), var552, var553);
        return var554.first();
    }
    
    public static SubLObject f39505() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39237", "S#43028", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39239", "S#43016", 1, 0, false);
        new $f39239$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39240", "S#43029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39241", "S#43030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39242", "S#43031", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39243", "S#43032", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39244", "S#43033", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39245", "S#43034", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39246", "S#43035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39247", "S#43036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39248", "S#43037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39249", "S#43038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39250", "S#43039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39251", "S#43040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39252", "S#43041", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39253", "S#43042", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39254", "S#43043", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39255", "S#43044", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39256", "S#43045", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39257", "S#43046", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39258", "S#43047", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39259", "S#43048", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39260", "S#43049", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39261", "S#43050", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39262", "S#43051", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39263", "S#43052", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39264", "S#43053", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39265", "S#43054", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39266", "S#43055", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39267", "S#43056", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39269", "S#43018", 1, 0, false);
        new $f39269$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39270", "S#43057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39271", "S#43058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39272", "S#43059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39273", "S#43060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39274", "S#43061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39275", "S#43062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39276", "S#43063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39277", "S#43064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39278", "S#43065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39279", "S#43066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39280", "S#43067", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39281", "S#43068", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39282", "S#43069", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39283", "S#43070", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39284", "S#43071", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39285", "S#43072", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39286", "S#43073", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39287", "S#43074", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39288", "S#43075", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39289", "S#43076", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39290", "S#43077", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39291", "S#43078", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39292", "S#43079", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39293", "S#43080", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39295", "S#43020", 1, 0, false);
        new $f39295$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39296", "S#43081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39297", "S#43082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39298", "S#43083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39299", "S#43084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39300", "S#43085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39301", "S#43086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39302", "S#43087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39303", "S#43088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39304", "S#43089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39305", "S#43090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39306", "S#43091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39307", "S#43092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39308", "S#43093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39309", "S#43094", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39310", "S#43095", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39311", "S#43096", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39312", "S#43097", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39313", "S#43098", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39314", "S#43099", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39315", "S#43100", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39316", "S#43101", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39317", "S#43102", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39318", "S#43103", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39319", "S#43104", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39320", "S#43105", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39321", "S#43106", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39322", "S#43107", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39323", "S#43108", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39324", "S#43109", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39325", "S#43110", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0647", "f39326", "S#43111");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0647", "f39327", "S#43112");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39328", "S#43113", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0647", "f39329", "S#43114");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39330", "S#43115", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39331", "S#43116", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0647", "f39332", "S#43117");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39333", "S#43118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39334", "S#43119", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39335", "S#43120", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39336", "S#43121", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39337", "S#43122", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39338", "S#43123", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39339", "S#43124", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39340", "S#43125", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39238", "S#43126", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39341", "S#43127", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39342", "S#43128", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39344", "S#43129", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39345", "S#43130", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39346", "S#43131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39347", "S#43132", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39348", "S#43133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39349", "S#43134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39350", "S#43135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39294", "S#43136", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39351", "S#43137", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39352", "S#43138", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39353", "S#43139", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39354", "S#43140", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39355", "S#43141", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39356", "S#43142", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39357", "S#43143", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39343", "S#43144", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39361", "S#43145", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39362", "S#43146", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39363", "S#43147", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39364", "S#43148", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39365", "S#43149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39366", "S#43150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39359", "S#43151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39268", "S#43152", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39360", "S#43153", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39367", "S#43154", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39368", "S#43155", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39369", "S#43156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39358", "S#43157", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39370", "S#43158", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39379", "S#43159", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39388", "S#43160", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39390", "S#43161", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39380", "S#43162", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39382", "S#43163", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39384", "S#43164", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39386", "S#43165", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39392", "S#43166", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39394", "S#43167", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39397", "S#43168", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39396", "S#43169", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39398", "S#43170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39399", "S#43171", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39400", "S#43172", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39401", "S#43173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39402", "S#43174", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39404", "S#43175", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39405", "S#43176", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39375", "S#43177", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39403", "S#43178", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39371", "S#43179", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39372", "S#43180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39373", "S#43181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39374", "S#43182", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39408", "S#43183", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39410", "S#43184", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39409", "S#43185", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39389", "S#43186", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39391", "S#43187", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39378", "S#43188", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39406", "S#43189", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39407", "S#43190", 4, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39376", "S#43191", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39377", "S#43192", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39381", "S#43193", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39385", "S#43194", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39395", "S#43195", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39387", "S#43196", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39383", "S#43197", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39393", "S#43198", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39412", "S#43199", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39417", "S#43200", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39419", "S#43201", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39420", "S#43202", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39421", "S#43203", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39416", "S#43204", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39422", "S#43205", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39423", "S#43206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39415", "S#43207", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39418", "S#43208", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39425", "S#43209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39427", "S#43210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39426", "S#43211", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39428", "S#43212", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39429", "S#43213", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39435", "S#43214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39436", "S#43215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39437", "S#43216", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39411", "S#43217", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39432", "S#43218", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39413", "S#43219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39439", "S#43220", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39440", "S#43221", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39433", "S#43222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39434", "S#43223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39430", "S#43224", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39441", "S#43225", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39414", "S#43226", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39442", "S#43227", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39431", "S#43228", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39446", "S#43229", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39449", "S#43230", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39445", "S#43231", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39443", "S#43232", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39444", "S#43233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39447", "S#43234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39448", "S#43235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39438", "S#43236", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39424", "S#43237", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39450", "S#43238", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39452", "S#43239", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39451", "S#43240", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39454", "S#43241", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39455", "S#43242", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39456", "S#43243", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39458", "S#43244", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39457", "S#43245", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39461", "S#43246", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39463", "S#43247", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39467", "S#43248", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39465", "S#43249", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39470", "S#43250", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39468", "S#43251", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39469", "S#43252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39464", "S#43253", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39471", "S#43254", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39472", "S#43255", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39462", "S#43256", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39473", "S#43257", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39476", "S#43258", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39477", "S#43259", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39478", "S#43260", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39475", "S#43261", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39453", "S#43262", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39479", "S#43263", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39482", "S#43264", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39489", "S#43265", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39488", "S#43266", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39490", "S#43267", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39492", "S#43268", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39491", "S#43269", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39494", "S#43270", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39493", "S#43271", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39484", "S#43272", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39496", "S#43273", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39485", "S#43274", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39495", "S#43275", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39459", "S#43276", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39466", "S#43277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39460", "S#43278", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39499", "S#43279", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39474", "S#43280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39500", "S#43281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39498", "S#43282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39501", "S#43283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39497", "S#43284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39480", "S#43285", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39481", "S#43286", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39487", "S#43287", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39483", "S#43288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39503", "S#43289", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39504", "S#43290", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39502", "S#43291", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0647", "f39486", "S#43292", 1, 0, false);
        return (SubLObject)module0647.NIL;
    }
    
    public static SubLObject f39506() {
        module0647.$g5031$ = SubLFiles.defconstant("S#43293", (SubLObject)module0647.$ic0$);
        module0647.$g5032$ = SubLFiles.deflexical("S#43294", Guids.string_to_guid((SubLObject)module0647.$ic51$));
        module0647.$g5033$ = SubLFiles.defconstant("S#43295", (SubLObject)module0647.$ic53$);
        module0647.$g5034$ = SubLFiles.deflexical("S#43296", Guids.string_to_guid((SubLObject)module0647.$ic93$));
        module0647.$g5035$ = SubLFiles.defconstant("S#43297", (SubLObject)module0647.$ic95$);
        module0647.$g5036$ = SubLFiles.deflexical("S#43298", Guids.string_to_guid((SubLObject)module0647.$ic143$));
        module0647.$g5037$ = SubLFiles.defparameter("S#43299", (SubLObject)module0647.NIL);
        module0647.$g5038$ = SubLFiles.defparameter("S#43300", (SubLObject)module0647.NIL);
        module0647.$g5039$ = SubLFiles.defparameter("S#43301", (SubLObject)module0647.T);
        module0647.$g5040$ = SubLFiles.deflexical("S#43302", (SubLObject)module0647.$ic175$);
        module0647.$g5041$ = SubLFiles.defparameter("S#43303", (SubLObject)module0647.NIL);
        module0647.$g5042$ = SubLFiles.deflexical("S#43304", (SubLObject)module0647.T);
        module0647.$g5043$ = SubLFiles.defparameter("S#43305", module0647.$ic343$);
        module0647.$g5044$ = SubLFiles.deflexical("S#43306", (SubLObject)module0647.$ic364$);
        module0647.$g5045$ = SubLFiles.deflexical("S#43307", (SubLObject)module0647.NIL);
        module0647.$g5046$ = SubLFiles.deflexical("S#43308", (SubLObject)module0647.NIL);
        module0647.$g5047$ = SubLFiles.deflexical("S#43309", (SubLObject)module0647.$ic404$);
        module0647.$g5048$ = SubLFiles.deflexical("S#43310", (SubLObject)module0647.$ic405$);
        module0647.$g5049$ = SubLFiles.defparameter("S#43311", (SubLObject)module0647.T);
        module0647.$g5050$ = SubLFiles.deflexical("S#43312", (SubLObject)module0647.$ic434$);
        return (SubLObject)module0647.NIL;
    }
    
    public static SubLObject f39507() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0647.$g5031$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0647.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0647.$ic8$);
        Structures.def_csetf((SubLObject)module0647.$ic9$, (SubLObject)module0647.$ic10$);
        Structures.def_csetf((SubLObject)module0647.$ic11$, (SubLObject)module0647.$ic12$);
        Structures.def_csetf((SubLObject)module0647.$ic13$, (SubLObject)module0647.$ic14$);
        Structures.def_csetf((SubLObject)module0647.$ic15$, (SubLObject)module0647.$ic16$);
        Structures.def_csetf((SubLObject)module0647.$ic17$, (SubLObject)module0647.$ic18$);
        Structures.def_csetf((SubLObject)module0647.$ic19$, (SubLObject)module0647.$ic20$);
        Structures.def_csetf((SubLObject)module0647.$ic21$, (SubLObject)module0647.$ic22$);
        Structures.def_csetf((SubLObject)module0647.$ic23$, (SubLObject)module0647.$ic24$);
        Structures.def_csetf((SubLObject)module0647.$ic25$, (SubLObject)module0647.$ic26$);
        Structures.def_csetf((SubLObject)module0647.$ic27$, (SubLObject)module0647.$ic28$);
        Structures.def_csetf((SubLObject)module0647.$ic29$, (SubLObject)module0647.$ic30$);
        Structures.def_csetf((SubLObject)module0647.$ic31$, (SubLObject)module0647.$ic32$);
        Equality.identity((SubLObject)module0647.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0647.$g5031$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0647.$ic50$));
        module0021.f1197(module0647.$g5032$.getGlobalValue(), (SubLObject)module0647.$ic52$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0647.$g5033$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0647.$ic60$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0647.$ic61$);
        Structures.def_csetf((SubLObject)module0647.$ic62$, (SubLObject)module0647.$ic63$);
        Structures.def_csetf((SubLObject)module0647.$ic64$, (SubLObject)module0647.$ic65$);
        Structures.def_csetf((SubLObject)module0647.$ic66$, (SubLObject)module0647.$ic67$);
        Structures.def_csetf((SubLObject)module0647.$ic68$, (SubLObject)module0647.$ic69$);
        Structures.def_csetf((SubLObject)module0647.$ic70$, (SubLObject)module0647.$ic71$);
        Structures.def_csetf((SubLObject)module0647.$ic72$, (SubLObject)module0647.$ic73$);
        Structures.def_csetf((SubLObject)module0647.$ic74$, (SubLObject)module0647.$ic75$);
        Structures.def_csetf((SubLObject)module0647.$ic76$, (SubLObject)module0647.$ic77$);
        Structures.def_csetf((SubLObject)module0647.$ic78$, (SubLObject)module0647.$ic79$);
        Structures.def_csetf((SubLObject)module0647.$ic80$, (SubLObject)module0647.$ic81$);
        Equality.identity((SubLObject)module0647.$ic53$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0647.$g5033$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0647.$ic92$));
        module0021.f1197(module0647.$g5034$.getGlobalValue(), (SubLObject)module0647.$ic94$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0647.$g5035$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0647.$ic102$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0647.$ic103$);
        Structures.def_csetf((SubLObject)module0647.$ic104$, (SubLObject)module0647.$ic105$);
        Structures.def_csetf((SubLObject)module0647.$ic106$, (SubLObject)module0647.$ic107$);
        Structures.def_csetf((SubLObject)module0647.$ic108$, (SubLObject)module0647.$ic109$);
        Structures.def_csetf((SubLObject)module0647.$ic110$, (SubLObject)module0647.$ic111$);
        Structures.def_csetf((SubLObject)module0647.$ic112$, (SubLObject)module0647.$ic113$);
        Structures.def_csetf((SubLObject)module0647.$ic114$, (SubLObject)module0647.$ic115$);
        Structures.def_csetf((SubLObject)module0647.$ic116$, (SubLObject)module0647.$ic117$);
        Structures.def_csetf((SubLObject)module0647.$ic118$, (SubLObject)module0647.$ic119$);
        Structures.def_csetf((SubLObject)module0647.$ic120$, (SubLObject)module0647.$ic121$);
        Structures.def_csetf((SubLObject)module0647.$ic122$, (SubLObject)module0647.$ic123$);
        Structures.def_csetf((SubLObject)module0647.$ic124$, (SubLObject)module0647.$ic125$);
        Structures.def_csetf((SubLObject)module0647.$ic126$, (SubLObject)module0647.$ic127$);
        Structures.def_csetf((SubLObject)module0647.$ic128$, (SubLObject)module0647.$ic129$);
        Equality.identity((SubLObject)module0647.$ic95$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0647.$g5035$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0647.$ic142$));
        module0021.f1197(module0647.$g5036$.getGlobalValue(), (SubLObject)module0647.$ic144$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0647.$g5031$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0647.$ic191$));
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0647.$g5035$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0647.$ic235$));
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0647.$g5033$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0647.$ic260$));
        module0034.f1895((SubLObject)module0647.$ic345$);
        module0034.f1909((SubLObject)module0647.$ic400$);
        return (SubLObject)module0647.NIL;
    }
    
    public void declareFunctions() {
        f39505();
    }
    
    public void initializeVariables() {
        f39506();
    }
    
    public void runTopLevelForms() {
        f39507();
    }
    
    static {
        me = (SubLFile)new module0647();
        module0647.$g5031$ = null;
        module0647.$g5032$ = null;
        module0647.$g5033$ = null;
        module0647.$g5034$ = null;
        module0647.$g5035$ = null;
        module0647.$g5036$ = null;
        module0647.$g5037$ = null;
        module0647.$g5038$ = null;
        module0647.$g5039$ = null;
        module0647.$g5040$ = null;
        module0647.$g5041$ = null;
        module0647.$g5042$ = null;
        module0647.$g5043$ = null;
        module0647.$g5044$ = null;
        module0647.$g5045$ = null;
        module0647.$g5046$ = null;
        module0647.$g5047$ = null;
        module0647.$g5048$ = null;
        module0647.$g5049$ = null;
        module0647.$g5050$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#43015", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#43016", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#43313", "CYC"), SubLObjectFactory.makeSymbol("S#43314", "CYC"), SubLObjectFactory.makeSymbol("S#43315", "CYC"), SubLObjectFactory.makeSymbol("S#43316", "CYC"), SubLObjectFactory.makeSymbol("S#43317", "CYC"), SubLObjectFactory.makeSymbol("S#1523", "CYC"), SubLObjectFactory.makeSymbol("S#43318", "CYC"), SubLObjectFactory.makeSymbol("S#43319", "CYC"), SubLObjectFactory.makeSymbol("S#43320", "CYC"), SubLObjectFactory.makeSymbol("S#43321", "CYC"), SubLObjectFactory.makeSymbol("S#43322", "CYC"), SubLObjectFactory.makeSymbol("S#43323", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SUPERTOPIC"), SubLObjectFactory.makeKeyword("TOPIC"), SubLObjectFactory.makeKeyword("SUBTOPICS"), SubLObjectFactory.makeKeyword("TEMPLATES"), SubLObjectFactory.makeKeyword("ORDERING"), SubLObjectFactory.makeKeyword("TITLE"), SubLObjectFactory.makeKeyword("TERM-PREFIX"), SubLObjectFactory.makeKeyword("INTRO-TEMPLATE"), SubLObjectFactory.makeKeyword("SOURCE-TYPES"), SubLObjectFactory.makeKeyword("SOURCE-MT"), SubLObjectFactory.makeKeyword("QUERY-MT"), SubLObjectFactory.makeKeyword("DEFINITIONAL-MT") });
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#43029", "CYC"), SubLObjectFactory.makeSymbol("S#43030", "CYC"), SubLObjectFactory.makeSymbol("S#43031", "CYC"), SubLObjectFactory.makeSymbol("S#43032", "CYC"), SubLObjectFactory.makeSymbol("S#43033", "CYC"), SubLObjectFactory.makeSymbol("S#43034", "CYC"), SubLObjectFactory.makeSymbol("S#43035", "CYC"), SubLObjectFactory.makeSymbol("S#43036", "CYC"), SubLObjectFactory.makeSymbol("S#43037", "CYC"), SubLObjectFactory.makeSymbol("S#43038", "CYC"), SubLObjectFactory.makeSymbol("S#43039", "CYC"), SubLObjectFactory.makeSymbol("S#43040", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#43041", "CYC"), SubLObjectFactory.makeSymbol("S#43042", "CYC"), SubLObjectFactory.makeSymbol("S#43043", "CYC"), SubLObjectFactory.makeSymbol("S#43044", "CYC"), SubLObjectFactory.makeSymbol("S#43045", "CYC"), SubLObjectFactory.makeSymbol("S#43046", "CYC"), SubLObjectFactory.makeSymbol("S#43047", "CYC"), SubLObjectFactory.makeSymbol("S#43048", "CYC"), SubLObjectFactory.makeSymbol("S#43049", "CYC"), SubLObjectFactory.makeSymbol("S#43050", "CYC"), SubLObjectFactory.makeSymbol("S#43051", "CYC"), SubLObjectFactory.makeSymbol("S#43052", "CYC") });
        $ic6$ = SubLObjectFactory.makeSymbol("S#43126", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#43028", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#43016", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#43029", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#43041", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#43030", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#43042", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#43031", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#43043", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#43032", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#43044", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#43033", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#43045", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#43034", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#43046", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#43035", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#43047", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#43036", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#43048", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#43037", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#43049", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#43038", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#43050", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#43039", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#43051", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#43040", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#43052", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("SUPERTOPIC");
        $ic34$ = SubLObjectFactory.makeKeyword("TOPIC");
        $ic35$ = SubLObjectFactory.makeKeyword("SUBTOPICS");
        $ic36$ = SubLObjectFactory.makeKeyword("TEMPLATES");
        $ic37$ = SubLObjectFactory.makeKeyword("ORDERING");
        $ic38$ = SubLObjectFactory.makeKeyword("TITLE");
        $ic39$ = SubLObjectFactory.makeKeyword("TERM-PREFIX");
        $ic40$ = SubLObjectFactory.makeKeyword("INTRO-TEMPLATE");
        $ic41$ = SubLObjectFactory.makeKeyword("SOURCE-TYPES");
        $ic42$ = SubLObjectFactory.makeKeyword("SOURCE-MT");
        $ic43$ = SubLObjectFactory.makeKeyword("QUERY-MT");
        $ic44$ = SubLObjectFactory.makeKeyword("DEFINITIONAL-MT");
        $ic45$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic46$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic47$ = SubLObjectFactory.makeSymbol("S#43053", "CYC");
        $ic48$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic49$ = SubLObjectFactory.makeKeyword("END");
        $ic50$ = SubLObjectFactory.makeSymbol("S#43055", "CYC");
        $ic51$ = SubLObjectFactory.makeString("18287931-d871-11d9-8eef-0002b3891c5a");
        $ic52$ = SubLObjectFactory.makeSymbol("S#43131", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#43017", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#43018", "CYC");
        $ic55$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#43324", "CYC"), SubLObjectFactory.makeSymbol("S#43317", "CYC"), SubLObjectFactory.makeSymbol("S#43325", "CYC"), SubLObjectFactory.makeSymbol("S#43326", "CYC"), SubLObjectFactory.makeSymbol("S#43327", "CYC"), SubLObjectFactory.makeSymbol("S#43328", "CYC"), SubLObjectFactory.makeSymbol("S#43329", "CYC"), SubLObjectFactory.makeSymbol("S#43330", "CYC"), SubLObjectFactory.makeSymbol("S#43331", "CYC"), SubLObjectFactory.makeSymbol("S#43332", "CYC") });
        $ic56$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ARGUMENT-POSITION"), SubLObjectFactory.makeKeyword("ORDERING"), SubLObjectFactory.makeKeyword("GLOSS"), SubLObjectFactory.makeKeyword("INVISIBLE-REPLACEMENT-POSITIONS"), SubLObjectFactory.makeKeyword("REPLACEMENT-CONSTRAINTS"), SubLObjectFactory.makeKeyword("CANDIDATE-REPLACEMENTS"), SubLObjectFactory.makeKeyword("IS-EDITABLE"), SubLObjectFactory.makeKeyword("EXPLANATION"), SubLObjectFactory.makeKeyword("REQUIRES-VALIDATION"), SubLObjectFactory.makeKeyword("UNKNOWN-REPLACEMENT") });
        $ic57$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#43057", "CYC"), SubLObjectFactory.makeSymbol("S#43058", "CYC"), SubLObjectFactory.makeSymbol("S#43059", "CYC"), SubLObjectFactory.makeSymbol("S#43060", "CYC"), SubLObjectFactory.makeSymbol("S#43061", "CYC"), SubLObjectFactory.makeSymbol("S#43062", "CYC"), SubLObjectFactory.makeSymbol("S#43063", "CYC"), SubLObjectFactory.makeSymbol("S#43064", "CYC"), SubLObjectFactory.makeSymbol("S#43065", "CYC"), SubLObjectFactory.makeSymbol("S#43066", "CYC") });
        $ic58$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#43067", "CYC"), SubLObjectFactory.makeSymbol("S#43068", "CYC"), SubLObjectFactory.makeSymbol("S#43069", "CYC"), SubLObjectFactory.makeSymbol("S#43070", "CYC"), SubLObjectFactory.makeSymbol("S#43071", "CYC"), SubLObjectFactory.makeSymbol("S#43072", "CYC"), SubLObjectFactory.makeSymbol("S#43073", "CYC"), SubLObjectFactory.makeSymbol("S#43074", "CYC"), SubLObjectFactory.makeSymbol("S#43075", "CYC"), SubLObjectFactory.makeSymbol("S#43076", "CYC") });
        $ic59$ = SubLObjectFactory.makeSymbol("S#43152", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#43056", "CYC");
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#43018", "CYC"));
        $ic62$ = SubLObjectFactory.makeSymbol("S#43057", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#43067", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#43058", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#43068", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#43059", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#43069", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#43060", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#43070", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#43061", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#43071", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#43062", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#43072", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#43063", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#43073", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#43064", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("S#43074", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("S#43065", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("S#43075", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("S#43066", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#43076", "CYC");
        $ic82$ = SubLObjectFactory.makeKeyword("ARGUMENT-POSITION");
        $ic83$ = SubLObjectFactory.makeKeyword("GLOSS");
        $ic84$ = SubLObjectFactory.makeKeyword("INVISIBLE-REPLACEMENT-POSITIONS");
        $ic85$ = SubLObjectFactory.makeKeyword("REPLACEMENT-CONSTRAINTS");
        $ic86$ = SubLObjectFactory.makeKeyword("CANDIDATE-REPLACEMENTS");
        $ic87$ = SubLObjectFactory.makeKeyword("IS-EDITABLE");
        $ic88$ = SubLObjectFactory.makeKeyword("EXPLANATION");
        $ic89$ = SubLObjectFactory.makeKeyword("REQUIRES-VALIDATION");
        $ic90$ = SubLObjectFactory.makeKeyword("UNKNOWN-REPLACEMENT");
        $ic91$ = SubLObjectFactory.makeSymbol("S#43077", "CYC");
        $ic92$ = SubLObjectFactory.makeSymbol("S#43079", "CYC");
        $ic93$ = SubLObjectFactory.makeString("182a9c10-d871-11d9-8eef-0002b3891c5a");
        $ic94$ = SubLObjectFactory.makeSymbol("S#43156", "CYC");
        $ic95$ = SubLObjectFactory.makeSymbol("S#43019", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#43020", "CYC");
        $ic97$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#43314", "CYC"), SubLObjectFactory.makeSymbol("S#1519", "CYC"), SubLObjectFactory.makeSymbol("S#6061", "CYC"), SubLObjectFactory.makeSymbol("S#43333", "CYC"), SubLObjectFactory.makeSymbol("S#12327", "CYC"), SubLObjectFactory.makeSymbol("S#43334", "CYC"), SubLObjectFactory.makeSymbol("S#43335", "CYC"), SubLObjectFactory.makeSymbol("S#43336", "CYC"), SubLObjectFactory.makeSymbol("S#43337", "CYC"), SubLObjectFactory.makeSymbol("S#1642", "CYC"), SubLObjectFactory.makeSymbol("S#43338", "CYC"), SubLObjectFactory.makeSymbol("S#43325", "CYC"), SubLObjectFactory.makeSymbol("S#43339", "CYC") });
        $ic98$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TOPIC"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("FORMULA"), SubLObjectFactory.makeKeyword("QUERY-SPECIFICATION"), SubLObjectFactory.makeKeyword("ELMT"), SubLObjectFactory.makeKeyword("FOCAL-TERM"), SubLObjectFactory.makeKeyword("ARGPOS-DETAILS"), SubLObjectFactory.makeKeyword("ARGPOS-ORDERING"), SubLObjectFactory.makeKeyword("EXAMPLES"), SubLObjectFactory.makeKeyword("ENTRY-FORMAT"), SubLObjectFactory.makeKeyword("FOLLOW-UPS"), SubLObjectFactory.makeKeyword("GLOSS"), SubLObjectFactory.makeKeyword("REFSPEC") });
        $ic99$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#43081", "CYC"), SubLObjectFactory.makeSymbol("S#43082", "CYC"), SubLObjectFactory.makeSymbol("S#43083", "CYC"), SubLObjectFactory.makeSymbol("S#43084", "CYC"), SubLObjectFactory.makeSymbol("S#43085", "CYC"), SubLObjectFactory.makeSymbol("S#43086", "CYC"), SubLObjectFactory.makeSymbol("S#43087", "CYC"), SubLObjectFactory.makeSymbol("S#43088", "CYC"), SubLObjectFactory.makeSymbol("S#43089", "CYC"), SubLObjectFactory.makeSymbol("S#43090", "CYC"), SubLObjectFactory.makeSymbol("S#43091", "CYC"), SubLObjectFactory.makeSymbol("S#43092", "CYC"), SubLObjectFactory.makeSymbol("S#43093", "CYC") });
        $ic100$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#43094", "CYC"), SubLObjectFactory.makeSymbol("S#43095", "CYC"), SubLObjectFactory.makeSymbol("S#43096", "CYC"), SubLObjectFactory.makeSymbol("S#43097", "CYC"), SubLObjectFactory.makeSymbol("S#43098", "CYC"), SubLObjectFactory.makeSymbol("S#43099", "CYC"), SubLObjectFactory.makeSymbol("S#43100", "CYC"), SubLObjectFactory.makeSymbol("S#43101", "CYC"), SubLObjectFactory.makeSymbol("S#43102", "CYC"), SubLObjectFactory.makeSymbol("S#43103", "CYC"), SubLObjectFactory.makeSymbol("S#43104", "CYC"), SubLObjectFactory.makeSymbol("S#43105", "CYC"), SubLObjectFactory.makeSymbol("S#43106", "CYC") });
        $ic101$ = SubLObjectFactory.makeSymbol("S#43136", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("S#43080", "CYC");
        $ic103$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#43020", "CYC"));
        $ic104$ = SubLObjectFactory.makeSymbol("S#43081", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("S#43094", "CYC");
        $ic106$ = SubLObjectFactory.makeSymbol("S#43082", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("S#43095", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("S#43083", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("S#43096", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("S#43084", "CYC");
        $ic111$ = SubLObjectFactory.makeSymbol("S#43097", "CYC");
        $ic112$ = SubLObjectFactory.makeSymbol("S#43085", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("S#43098", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("S#43086", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#43099", "CYC");
        $ic116$ = SubLObjectFactory.makeSymbol("S#43087", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("S#43100", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("S#43088", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("S#43101", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("S#43089", "CYC");
        $ic121$ = SubLObjectFactory.makeSymbol("S#43102", "CYC");
        $ic122$ = SubLObjectFactory.makeSymbol("S#43090", "CYC");
        $ic123$ = SubLObjectFactory.makeSymbol("S#43103", "CYC");
        $ic124$ = SubLObjectFactory.makeSymbol("S#43091", "CYC");
        $ic125$ = SubLObjectFactory.makeSymbol("S#43104", "CYC");
        $ic126$ = SubLObjectFactory.makeSymbol("S#43092", "CYC");
        $ic127$ = SubLObjectFactory.makeSymbol("S#43105", "CYC");
        $ic128$ = SubLObjectFactory.makeSymbol("S#43093", "CYC");
        $ic129$ = SubLObjectFactory.makeSymbol("S#43106", "CYC");
        $ic130$ = SubLObjectFactory.makeKeyword("ID");
        $ic131$ = SubLObjectFactory.makeKeyword("FORMULA");
        $ic132$ = SubLObjectFactory.makeKeyword("QUERY-SPECIFICATION");
        $ic133$ = SubLObjectFactory.makeKeyword("ELMT");
        $ic134$ = SubLObjectFactory.makeKeyword("FOCAL-TERM");
        $ic135$ = SubLObjectFactory.makeKeyword("ARGPOS-DETAILS");
        $ic136$ = SubLObjectFactory.makeKeyword("ARGPOS-ORDERING");
        $ic137$ = SubLObjectFactory.makeKeyword("EXAMPLES");
        $ic138$ = SubLObjectFactory.makeKeyword("ENTRY-FORMAT");
        $ic139$ = SubLObjectFactory.makeKeyword("FOLLOW-UPS");
        $ic140$ = SubLObjectFactory.makeKeyword("REFSPEC");
        $ic141$ = SubLObjectFactory.makeSymbol("S#43107", "CYC");
        $ic142$ = SubLObjectFactory.makeSymbol("S#43109", "CYC");
        $ic143$ = SubLObjectFactory.makeString("182b1140-d871-11d9-8eef-0002b3891c5a");
        $ic144$ = SubLObjectFactory.makeSymbol("S#43149", "CYC");
        $ic145$ = SubLObjectFactory.makeSymbol("CLET");
        $ic146$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43299", "CYC"), (SubLObject)module0647.T));
        $ic147$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic148$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43340", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic149$ = SubLObjectFactory.makeSymbol("S#43300", "CYC");
        $ic150$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic151$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6920", "CYC"));
        $ic152$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10388", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43341", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43342", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43322", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic153$ = SubLObjectFactory.makeUninternedSymbol("US#1965848");
        $ic154$ = SubLObjectFactory.makeSymbol("S#43115", "CYC");
        $ic155$ = SubLObjectFactory.makeSymbol("S#43114", "CYC");
        $ic156$ = SubLObjectFactory.makeString("~S is not a FORMULA-TEMPLATE-P.");
        $ic157$ = SubLObjectFactory.makeString("~S is not EL-FORMULA-P.");
        $ic158$ = SubLObjectFactory.makeString("~S is not POSSIBLY-MT-P.");
        $ic159$ = SubLObjectFactory.makeString("bad formula template: ~S~%");
        $ic160$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic161$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic162$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic163$ = SubLObjectFactory.makeString("<TemplateTopic: ");
        $ic164$ = SubLObjectFactory.makeString("Parent: ~S : Topic: ~S ");
        $ic165$ = SubLObjectFactory.makeString(" named ");
        $ic166$ = SubLObjectFactory.makeString(" Term Prefix: ");
        $ic167$ = SubLObjectFactory.makeString(" : SubTopics: ");
        $ic168$ = SubLObjectFactory.makeString(" : Sources: ");
        $ic169$ = SubLObjectFactory.makeString(" : Template Source Mt: ");
        $ic170$ = SubLObjectFactory.makeString(" : Template Query Mt: ");
        $ic171$ = SubLObjectFactory.makeString(" : Template Definitional Mt: ");
        $ic172$ = SubLObjectFactory.makeString(" : Templates:");
        $ic173$ = SubLObjectFactory.makeString(" (= introductory template) ");
        $ic174$ = SubLObjectFactory.makeString(">");
        $ic175$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0647.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Adds <templateTopicRevision> to <templateTopic>")), (SubLObject)ConsesLow.list((SubLObject)module0647.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("Initial version")));
        $ic176$ = SubLObjectFactory.makeString("templateTopic");
        $ic177$ = SubLObjectFactory.makeString("templateTopicRevision");
        $ic178$ = SubLObjectFactory.makeString("topic");
        $ic179$ = SubLObjectFactory.makeString("superTopic");
        $ic180$ = SubLObjectFactory.makeString("title");
        $ic181$ = SubLObjectFactory.makeString("termPrefix");
        $ic182$ = SubLObjectFactory.makeString("introductoryTemplate");
        $ic183$ = SubLObjectFactory.makeString("subTopics");
        $ic184$ = SubLObjectFactory.makeString("subTopic");
        $ic185$ = SubLObjectFactory.makeString("sourcesOfTopic");
        $ic186$ = SubLObjectFactory.makeString("sourceOfTopic");
        $ic187$ = SubLObjectFactory.makeString("templateSourceMt");
        $ic188$ = SubLObjectFactory.makeString("templateQueryMt");
        $ic189$ = SubLObjectFactory.makeString("templateDefinitionalMt");
        $ic190$ = SubLObjectFactory.makeString("formulaTemplates");
        $ic191$ = SubLObjectFactory.makeSymbol("S#43129", "CYC");
        $ic192$ = SubLObjectFactory.makeSymbol("S#43118", "CYC");
        $ic193$ = SubLObjectFactory.makeString("CFASL-INPUT-TEMPLATE-TOPIC has loaded a subtopic for ~A which claims to belong to ~A");
        $ic194$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SingleAssertionEntry"));
        $ic195$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MultipleAssertionEntry"));
        $ic196$ = SubLObjectFactory.makeString("<Formula Template: ");
        $ic197$ = SubLObjectFactory.makeString("~A ");
        $ic198$ = SubLObjectFactory.makeString("of topic ~A~%");
        $ic199$ = SubLObjectFactory.makeString(" formula ~A in ~A~%");
        $ic200$ = SubLObjectFactory.makeString(" query-spec ~A in ~A~%");
        $ic201$ = SubLObjectFactory.makeString(" focal term ~A (~A)~%");
        $ic202$ = SubLObjectFactory.makeString(" focal term occurrences ~A (~A)~%");
        $ic203$ = SubLObjectFactory.makeString(" examples: ~A~%");
        $ic204$ = SubLObjectFactory.makeString(" follow-ups: ~A~%");
        $ic205$ = SubLObjectFactory.makeString(" template gloss: ~A~%");
        $ic206$ = SubLObjectFactory.makeString(" reformulation specification: ~A~%");
        $ic207$ = SubLObjectFactory.makeString(" argpos-details: ");
        $ic208$ = SubLObjectFactory.makeString(" ");
        $ic209$ = SubLObjectFactory.makeSymbol("S#12753", "CYC");
        $ic210$ = SubLObjectFactory.makeSymbol("S#18501", "CYC");
        $ic211$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic212$ = SubLObjectFactory.makeSymbol("S#42592", "CYC");
        $ic213$ = SubLObjectFactory.makeString("formulaTemplate");
        $ic214$ = SubLObjectFactory.makeString("id");
        $ic215$ = SubLObjectFactory.makeString("formula");
        $ic216$ = SubLObjectFactory.makeString("elmt");
        $ic217$ = SubLObjectFactory.makeString("focalTerm");
        $ic218$ = SubLObjectFactory.makeString("argPositions");
        $ic219$ = SubLObjectFactory.makeString("singleEntry");
        $ic220$ = SubLObjectFactory.makeKeyword("ATOMIC");
        $ic221$ = SubLObjectFactory.makeString("multipleEntry");
        $ic222$ = SubLObjectFactory.makeString("usageExamples");
        $ic223$ = SubLObjectFactory.makeString("example");
        $ic224$ = SubLObjectFactory.makeString("glossForTemplate");
        $ic225$ = SubLObjectFactory.makeString("followUps");
        $ic226$ = SubLObjectFactory.makeString("followUp");
        $ic227$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43343", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43344", "CYC"));
        $ic228$ = SubLObjectFactory.makeString("templateId");
        $ic229$ = SubLObjectFactory.makeString("connective");
        $ic230$ = SubLObjectFactory.makeString("loadMt");
        $ic231$ = SubLObjectFactory.makeString("reformulationSpecification");
        $ic232$ = SubLObjectFactory.makeString("argumentPositionDetails");
        $ic233$ = SubLObjectFactory.makeString("<?xml version=\"1.0\" encoding=\"US-ASCII\" standalone=\"no\"?>");
        $ic234$ = SubLObjectFactory.makeString("<!DOCTYPE formulaTemplate SYSTEM \"http://www.opencyc.org/xml/formulaTemplate.dtd\">");
        $ic235$ = SubLObjectFactory.makeSymbol("S#43147", "CYC");
        $ic236$ = SubLObjectFactory.makeString("#<ArgPos-Details: ");
        $ic237$ = SubLObjectFactory.makeString(" for position ~A ");
        $ic238$ = SubLObjectFactory.makeString(" (ordering slot ~D)");
        $ic239$ = SubLObjectFactory.makeString(" (no ordering info)");
        $ic240$ = SubLObjectFactory.makeString(" READ-ONLY");
        $ic241$ = SubLObjectFactory.makeString(" gloss: ~A~%");
        $ic242$ = SubLObjectFactory.makeString(" replacementInvisible: ~A~%");
        $ic243$ = SubLObjectFactory.makeString(" candidate replacements: ~A~%");
        $ic244$ = SubLObjectFactory.makeString(" constraints: ~A~%");
        $ic245$ = SubLObjectFactory.makeString(" [requires validation] ~%");
        $ic246$ = SubLObjectFactory.makeString(" explanation: ~A~%");
        $ic247$ = SubLObjectFactory.makeString(" term for unknown: ~A~%");
        $ic248$ = SubLObjectFactory.makeString("argumentPositionDetail");
        $ic249$ = SubLObjectFactory.makeString("ordering");
        $ic250$ = SubLObjectFactory.makeString("glossText");
        $ic251$ = SubLObjectFactory.makeString("candidateReplacementsForPosition");
        $ic252$ = SubLObjectFactory.makeString("candidateReplacementForPosition");
        $ic253$ = SubLObjectFactory.makeString("templateReplacementsInvisibleForPosition");
        $ic254$ = SubLObjectFactory.makeString("isEditable");
        $ic255$ = SubLObjectFactory.makeString("validationRequired");
        $ic256$ = SubLObjectFactory.makeString("explanation");
        $ic257$ = SubLObjectFactory.makeString("unknownTermForTemplatePosition");
        $ic258$ = SubLObjectFactory.makeString("constraintsOnReplacement");
        $ic259$ = SubLObjectFactory.makeString("constraintOnReplacement");
        $ic260$ = SubLObjectFactory.makeSymbol("S#43154", "CYC");
        $ic261$ = SubLObjectFactory.makeString("argPosition");
        $ic262$ = SubLObjectFactory.makeString("position");
        $ic263$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic264$ = SubLObjectFactory.makeString("Can't load a formula template without a FORT id: ~S");
        $ic265$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("formulaTemplateHasArgumentPositionInformation"));
        $ic266$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43345", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15208", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43317", "CYC"));
        $ic267$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43346", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15208", "CYC"));
        $ic268$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15208", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43347", "CYC"));
        $ic269$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15208", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12121", "CYC"));
        $ic270$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15208", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43348", "CYC"));
        $ic271$ = SubLObjectFactory.makeSymbol("S#43172", "CYC");
        $ic272$ = SubLObjectFactory.makeSymbol("<");
        $ic273$ = SubLObjectFactory.makeSymbol("S#15589", "CYC");
        $ic274$ = SubLObjectFactory.makeString("Dwimming MT for ~A to ~A -- your own fault.");
        $ic275$ = ConsesLow.list((SubLObject)module0647.TWO_INTEGER);
        $ic276$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("reformulateTemplateViaSpecification"));
        $ic277$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TemplateFromTestQueryFn"));
        $ic278$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("querySpecificationForFormulaTemplate"));
        $ic279$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("formulaForFormulaTemplate"));
        $ic280$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertMtForFormulaTemplate"));
        $ic281$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("formulaTemplateFollowUp"));
        $ic282$ = SubLObjectFactory.makeSymbol("COMMUTATIVE-RELATION?");
        $ic283$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic284$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43343", "CYC"));
        $ic285$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("formulaTemplateGloss"));
        $ic286$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic287$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Now")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarSecond")));
        $ic288$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AnytimePSC"));
        $ic289$ = ConsesLow.list((SubLObject)module0647.FOUR_INTEGER, (SubLObject)module0647.THREE_INTEGER, (SubLObject)module0647.FIVE_INTEGER);
        $ic290$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("glossForFormulaTemplate"));
        $ic291$ = ConsesLow.list((SubLObject)module0647.FOUR_INTEGER, (SubLObject)module0647.THREE_INTEGER);
        $ic292$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("formulaTemplateArgExplanation"));
        $ic293$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("formulaTemplateExample"));
        $ic294$ = SubLObjectFactory.makeSymbol("GET-VARIABLE");
        $ic295$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic296$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedSentence"));
        $ic297$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic298$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?");
        $ic299$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic300$ = SubLObjectFactory.makeKeyword("RETURN");
        $ic301$ = SubLObjectFactory.makeKeyword("TEMPLATE");
        $ic302$ = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $ic303$ = SubLObjectFactory.makeKeyword("HL");
        $ic304$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("focalTermPositionForFormulaTemplate"));
        $ic305$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionFormatForFormulaTemplate"));
        $ic306$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("templateReplacementsInvisibleForPosition"));
        $ic307$ = ConsesLow.list((SubLObject)module0647.TWO_INTEGER, (SubLObject)module0647.THREE_INTEGER);
        $ic308$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("constraintOnReplacement"));
        $ic309$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("S#43350", "CYC"));
        $ic310$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $ic311$ = SubLObjectFactory.makeSymbol("?X");
        $ic312$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic313$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("unknownTermForTemplatePosition"));
        $ic314$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("candidateReplacementForPosition"));
        $ic315$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("S#43351", "CYC"));
        $ic316$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("positionInFormulaTemplateIsReplaceable"));
        $ic317$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("validationRequiredOnTemplatePosition"));
        $ic318$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InducedFormulaTemplateTopicType"));
        $ic319$ = SubLObjectFactory.makeSymbol("S#6424", "CYC");
        $ic320$ = SubLObjectFactory.makeSymbol("S#43203", "CYC");
        $ic321$ = SubLObjectFactory.makeSymbol("S#16763", "CYC");
        $ic322$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5429", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5428", "CYC"));
        $ic323$ = SubLObjectFactory.makeString("higherPriorityTemplateTypeForTopicType");
        $ic324$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?HIGHER"), (SubLObject)SubLObjectFactory.makeSymbol("?LOWER"));
        $ic325$ = SubLObjectFactory.makeSymbol("?HIGHER");
        $ic326$ = SubLObjectFactory.makeSymbol("?LOWER");
        $ic327$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)module0647.ZERO_INTEGER);
        $ic328$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic329$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("higherPriorityTemplateType")), (SubLObject)SubLObjectFactory.makeSymbol("?HIGHER"), (SubLObject)SubLObjectFactory.makeSymbol("?LOWER"));
        $ic330$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("different")), (SubLObject)SubLObjectFactory.makeSymbol("?HIGHER"), (SubLObject)SubLObjectFactory.makeSymbol("?LOWER"));
        $ic331$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("formulaTemplateTypeHasTopicType"));
        $ic332$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)module0647.ONE_INTEGER);
        $ic333$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("higherPriorityTemplateForType"));
        $ic334$ = SubLObjectFactory.makeSymbol("S#43212", "CYC");
        $ic335$ = SubLObjectFactory.makeSymbol("WARN");
        $ic336$ = SubLObjectFactory.makeSymbol("ERROR");
        $ic337$ = SubLObjectFactory.makeString("Invalid formula template ~A in topic ~A: template topic query mt ~A cannot see formula template mt ~A");
        $ic338$ = SubLObjectFactory.makeString("FactivoreTab");
        $ic339$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("FormulaTemplateTopicType"));
        $ic340$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("FirstOrderCollection"));
        $ic341$ = SubLObjectFactory.makeSymbol("?TEMPLATE");
        $ic342$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("formulaTemplateHasType"));
        $ic343$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic344$ = SubLObjectFactory.makeSymbol(">");
        $ic345$ = SubLObjectFactory.makeSymbol("S#43221", "CYC");
        $ic346$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic347$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0647.ONE_INTEGER);
        $ic348$ = SubLObjectFactory.makeSymbol("?SUBTOPIC");
        $ic349$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic350$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic351$ = SubLObjectFactory.makeSymbol("?MT");
        $ic352$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $ic353$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VOCABULARY-MT"));
        $ic354$ = ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt-Vocabulary")), (SubLObject)SubLObjectFactory.makeSymbol("?MT"), (SubLObject)SubLObjectFactory.makeSymbol("?VOCABULARY-MT")));
        $ic355$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DataForNLMt"));
        $ic356$ = SubLObjectFactory.makeSymbol("S#16177", "CYC");
        $ic357$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("sourcesForTopic"));
        $ic358$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("focalTermIntroduction"));
        $ic359$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("titleForFormulaTemplateType-String"));
        $ic360$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("templateTopicPrefix"));
        $ic361$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryMtForTopicAssertions"));
        $ic362$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("definitionalMtForTopicAssertions"));
        $ic363$ = SubLObjectFactory.makeSymbol("S#6920", "CYC");
        $ic364$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0647.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Adds <templateTopicAssertionsRevision> to <knownAssertionsForTemplateTopic>\n          Adds <knownAssertionSUIDs> to <knownAssertion>\n          Adds <assertion-id> to <knownAssertionSUIDs>\n          Adds <bookkeeping-info> to <knownAssertion>\n          Adds <date> to <bookkeeping-info>\n          Adds <time> to <bookkeeping-info>\n          Adds <knownAssertionEvaluations> to <knownAssertion>\n          Adds <knownAssertionEvaluation> to <knownAssertionEvaluations>\n          Adds <evaluator> to <knownAssertionEvaluation>\n          Adds <judgment> to <knownAssertionEvaluation>")), (SubLObject)ConsesLow.list((SubLObject)module0647.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("Initial version")));
        $ic365$ = SubLObjectFactory.makeString("knownAssertionsForTemplateTopic");
        $ic366$ = SubLObjectFactory.makeString("queryELMt");
        $ic367$ = SubLObjectFactory.makeString("templateInstance");
        $ic368$ = SubLObjectFactory.makeString("templateTopicAssertionsRevision");
        $ic369$ = SubLObjectFactory.makeString("knownAssertionsForTemplateSubTopics");
        $ic370$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43352", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43353", "CYC"));
        $ic371$ = SubLObjectFactory.makeString("knownAssertionsForTemplateSubTopic");
        $ic372$ = SubLObjectFactory.makeString("knownAssertionsForFormulaTemplates");
        $ic373$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43341", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13093", "CYC"));
        $ic374$ = SubLObjectFactory.makeString("knownAssertionsForFormulaTemplate");
        $ic375$ = SubLObjectFactory.makeString("assertionsMatchTemplate");
        $ic376$ = SubLObjectFactory.makeString("knownAssertions");
        $ic377$ = SubLObjectFactory.makeString("Problem serializing assertions for ");
        $ic378$ = SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION?");
        $ic379$ = SubLObjectFactory.makeString("Invalid return object ");
        $ic380$ = SubLObjectFactory.makeString(" in assertion list");
        $ic381$ = SubLObjectFactory.makeString("knownAssertion");
        $ic382$ = SubLObjectFactory.makeString("deducedAssertion");
        $ic383$ = SubLObjectFactory.makeString("knownAssertionSUIDs");
        $ic384$ = SubLObjectFactory.makeString("knownAssertionEvaluations");
        $ic385$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43354", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43355", "CYC"));
        $ic386$ = SubLObjectFactory.makeString("knownAssertionEvaluation");
        $ic387$ = SubLObjectFactory.makeString("evaluator");
        $ic388$ = SubLObjectFactory.makeString("judgment");
        $ic389$ = SubLObjectFactory.makeString("evaluationOfAssertionByOn");
        $ic390$ = SubLObjectFactory.makeString("evaluationOfAssertionOfByOn");
        $ic391$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?EVAL"), (SubLObject)SubLObjectFactory.makeSymbol("?BY"));
        $ic392$ = SubLObjectFactory.makeSymbol("?EVAL");
        $ic393$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?BY"), (SubLObject)SubLObjectFactory.makeSymbol("??ON"));
        $ic394$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $ic395$ = SubLObjectFactory.makeSymbol("?JUDGMENT");
        $ic396$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluationOutputSentences"));
        $ic397$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?JUDGMENT"), (SubLObject)SubLObjectFactory.makeSymbol("?SENTENCE")));
        $ic398$ = SubLObjectFactory.makeString("knownAssertionELMt");
        $ic399$ = SubLObjectFactory.makeString("knownAssertionCW");
        $ic400$ = SubLObjectFactory.makeSymbol("S#43261", "CYC");
        $ic401$ = SubLObjectFactory.makeKeyword("PCW");
        $ic402$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("contextOfPCW"));
        $ic403$ = SubLObjectFactory.makeSymbol("S#43308", "CYC");
        $ic404$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("?A"), SubLObjectFactory.makeSymbol("?B"), SubLObjectFactory.makeSymbol("?C"), SubLObjectFactory.makeSymbol("?D"), SubLObjectFactory.makeSymbol("?E"), SubLObjectFactory.makeSymbol("?F"), SubLObjectFactory.makeSymbol("?G"), SubLObjectFactory.makeSymbol("?H"), SubLObjectFactory.makeSymbol("?J"), SubLObjectFactory.makeSymbol("?K"), SubLObjectFactory.makeSymbol("?L"), SubLObjectFactory.makeSymbol("?M"), SubLObjectFactory.makeSymbol("?N"), SubLObjectFactory.makeSymbol("?O"), SubLObjectFactory.makeSymbol("?P"), SubLObjectFactory.makeSymbol("?Q"), SubLObjectFactory.makeSymbol("?R"), SubLObjectFactory.makeSymbol("?S"), SubLObjectFactory.makeSymbol("?T"), SubLObjectFactory.makeSymbol("?U"), SubLObjectFactory.makeSymbol("?V"), SubLObjectFactory.makeSymbol("?W"), SubLObjectFactory.makeSymbol("?X"), SubLObjectFactory.makeSymbol("?Y"), SubLObjectFactory.makeSymbol("?Z") });
        $ic405$ = SubLObjectFactory.makeSymbol("?POLY-ELMT");
        $ic406$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist-Intermediate"));
        $ic407$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $ic408$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("RKFInteractionContextMicrotheory"));
        $ic409$ = SubLObjectFactory.makeSymbol("??REFSPEC");
        $ic410$ = SubLObjectFactory.makeSymbol("??ASSERTION");
        $ic411$ = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $ic412$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic413$ = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic414$ = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $ic415$ = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic416$ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic417$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $ic418$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic419$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic420$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"));
        $ic421$ = SubLObjectFactory.makeSymbol("DEDUCED-ASSERTION?");
        $ic422$ = SubLObjectFactory.makeSymbol("S#16374", "CYC");
        $ic423$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic424$ = SubLObjectFactory.makeKeyword("POLY-CANONICALIZED");
        $ic425$ = SubLObjectFactory.makeSymbol("S#43276", "CYC");
        $ic426$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic427$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic428$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43356", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43357", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43358", "CYC"));
        $ic429$ = SubLObjectFactory.makeSymbol("?FET-ASSERTION-VAR-524");
        $ic430$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22105", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#735", "CYC"));
        $ic431$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionSentence"));
        $ic432$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist-Asserted"));
        $ic433$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionProducedByReformulation"));
        $ic434$ = ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SomeExampleFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeInterval"))));
        $ic435$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SpecsFn"));
        $ic436$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SomeExampleFn"));
        $ic437$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SomeExampleSpecFn"));
        $ic438$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("defnIff"));
        $ic439$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("defnSufficient"));
        $ic440$ = SubLObjectFactory.makeKeyword("LEXICAL-MT");
        $ic441$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("LEXICAL-MT"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalMicrotheory")));
        $ic442$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
    }
    
    public static final class $sX43015_native extends SubLStructNative
    {
        public SubLObject $supertopic;
        public SubLObject $topic;
        public SubLObject $subtopics;
        public SubLObject $templates;
        public SubLObject $ordering;
        public SubLObject $title;
        public SubLObject $term_prefix;
        public SubLObject $intro_template;
        public SubLObject $source_types;
        public SubLObject $source_mt;
        public SubLObject $query_mt;
        public SubLObject $definitional_mt;
        private static final SubLStructDeclNative structDecl;
        
        public $sX43015_native() {
            this.$supertopic = (SubLObject)CommonSymbols.NIL;
            this.$topic = (SubLObject)CommonSymbols.NIL;
            this.$subtopics = (SubLObject)CommonSymbols.NIL;
            this.$templates = (SubLObject)CommonSymbols.NIL;
            this.$ordering = (SubLObject)CommonSymbols.NIL;
            this.$title = (SubLObject)CommonSymbols.NIL;
            this.$term_prefix = (SubLObject)CommonSymbols.NIL;
            this.$intro_template = (SubLObject)CommonSymbols.NIL;
            this.$source_types = (SubLObject)CommonSymbols.NIL;
            this.$source_mt = (SubLObject)CommonSymbols.NIL;
            this.$query_mt = (SubLObject)CommonSymbols.NIL;
            this.$definitional_mt = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX43015_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$supertopic;
        }
        
        public SubLObject getField3() {
            return this.$topic;
        }
        
        public SubLObject getField4() {
            return this.$subtopics;
        }
        
        public SubLObject getField5() {
            return this.$templates;
        }
        
        public SubLObject getField6() {
            return this.$ordering;
        }
        
        public SubLObject getField7() {
            return this.$title;
        }
        
        public SubLObject getField8() {
            return this.$term_prefix;
        }
        
        public SubLObject getField9() {
            return this.$intro_template;
        }
        
        public SubLObject getField10() {
            return this.$source_types;
        }
        
        public SubLObject getField11() {
            return this.$source_mt;
        }
        
        public SubLObject getField12() {
            return this.$query_mt;
        }
        
        public SubLObject getField13() {
            return this.$definitional_mt;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$supertopic = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$topic = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$subtopics = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$templates = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$ordering = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$title = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$term_prefix = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$intro_template = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$source_types = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$source_mt = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$query_mt = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$definitional_mt = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX43015_native.class, module0647.$ic0$, module0647.$ic1$, module0647.$ic2$, module0647.$ic3$, new String[] { "$supertopic", "$topic", "$subtopics", "$templates", "$ordering", "$title", "$term_prefix", "$intro_template", "$source_types", "$source_mt", "$query_mt", "$definitional_mt" }, module0647.$ic4$, module0647.$ic5$, module0647.$ic6$);
        }
    }
    
    public static final class $f39239$UnaryFunction extends UnaryFunction
    {
        public $f39239$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#43016"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0647.f39239(var3);
        }
    }
    
    public static final class $sX43017_native extends SubLStructNative
    {
        public SubLObject $argument_position;
        public SubLObject $ordering;
        public SubLObject $gloss;
        public SubLObject $invisible_replacement_positions;
        public SubLObject $replacement_constraints;
        public SubLObject $candidate_replacements;
        public SubLObject $is_editable;
        public SubLObject $explanation;
        public SubLObject $requires_validation;
        public SubLObject $unknown_replacement;
        private static final SubLStructDeclNative structDecl;
        
        public $sX43017_native() {
            this.$argument_position = (SubLObject)CommonSymbols.NIL;
            this.$ordering = (SubLObject)CommonSymbols.NIL;
            this.$gloss = (SubLObject)CommonSymbols.NIL;
            this.$invisible_replacement_positions = (SubLObject)CommonSymbols.NIL;
            this.$replacement_constraints = (SubLObject)CommonSymbols.NIL;
            this.$candidate_replacements = (SubLObject)CommonSymbols.NIL;
            this.$is_editable = (SubLObject)CommonSymbols.NIL;
            this.$explanation = (SubLObject)CommonSymbols.NIL;
            this.$requires_validation = (SubLObject)CommonSymbols.NIL;
            this.$unknown_replacement = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX43017_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$argument_position;
        }
        
        public SubLObject getField3() {
            return this.$ordering;
        }
        
        public SubLObject getField4() {
            return this.$gloss;
        }
        
        public SubLObject getField5() {
            return this.$invisible_replacement_positions;
        }
        
        public SubLObject getField6() {
            return this.$replacement_constraints;
        }
        
        public SubLObject getField7() {
            return this.$candidate_replacements;
        }
        
        public SubLObject getField8() {
            return this.$is_editable;
        }
        
        public SubLObject getField9() {
            return this.$explanation;
        }
        
        public SubLObject getField10() {
            return this.$requires_validation;
        }
        
        public SubLObject getField11() {
            return this.$unknown_replacement;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$argument_position = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$ordering = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$gloss = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$invisible_replacement_positions = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$replacement_constraints = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$candidate_replacements = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$is_editable = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$explanation = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$requires_validation = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$unknown_replacement = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX43017_native.class, module0647.$ic53$, module0647.$ic54$, module0647.$ic55$, module0647.$ic56$, new String[] { "$argument_position", "$ordering", "$gloss", "$invisible_replacement_positions", "$replacement_constraints", "$candidate_replacements", "$is_editable", "$explanation", "$requires_validation", "$unknown_replacement" }, module0647.$ic57$, module0647.$ic58$, module0647.$ic59$);
        }
    }
    
    public static final class $f39269$UnaryFunction extends UnaryFunction
    {
        public $f39269$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#43018"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0647.f39269(var3);
        }
    }
    
    public static final class $sX43019_native extends SubLStructNative
    {
        public SubLObject $topic;
        public SubLObject $id;
        public SubLObject $formula;
        public SubLObject $query_specification;
        public SubLObject $elmt;
        public SubLObject $focal_term;
        public SubLObject $argpos_details;
        public SubLObject $argpos_ordering;
        public SubLObject $examples;
        public SubLObject $entry_format;
        public SubLObject $follow_ups;
        public SubLObject $gloss;
        public SubLObject $refspec;
        private static final SubLStructDeclNative structDecl;
        
        public $sX43019_native() {
            this.$topic = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$formula = (SubLObject)CommonSymbols.NIL;
            this.$query_specification = (SubLObject)CommonSymbols.NIL;
            this.$elmt = (SubLObject)CommonSymbols.NIL;
            this.$focal_term = (SubLObject)CommonSymbols.NIL;
            this.$argpos_details = (SubLObject)CommonSymbols.NIL;
            this.$argpos_ordering = (SubLObject)CommonSymbols.NIL;
            this.$examples = (SubLObject)CommonSymbols.NIL;
            this.$entry_format = (SubLObject)CommonSymbols.NIL;
            this.$follow_ups = (SubLObject)CommonSymbols.NIL;
            this.$gloss = (SubLObject)CommonSymbols.NIL;
            this.$refspec = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX43019_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$topic;
        }
        
        public SubLObject getField3() {
            return this.$id;
        }
        
        public SubLObject getField4() {
            return this.$formula;
        }
        
        public SubLObject getField5() {
            return this.$query_specification;
        }
        
        public SubLObject getField6() {
            return this.$elmt;
        }
        
        public SubLObject getField7() {
            return this.$focal_term;
        }
        
        public SubLObject getField8() {
            return this.$argpos_details;
        }
        
        public SubLObject getField9() {
            return this.$argpos_ordering;
        }
        
        public SubLObject getField10() {
            return this.$examples;
        }
        
        public SubLObject getField11() {
            return this.$entry_format;
        }
        
        public SubLObject getField12() {
            return this.$follow_ups;
        }
        
        public SubLObject getField13() {
            return this.$gloss;
        }
        
        public SubLObject getField14() {
            return this.$refspec;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$topic = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$formula = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$query_specification = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$elmt = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$focal_term = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$argpos_details = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$argpos_ordering = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$examples = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$entry_format = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$follow_ups = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$gloss = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$refspec = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX43019_native.class, module0647.$ic95$, module0647.$ic96$, module0647.$ic97$, module0647.$ic98$, new String[] { "$topic", "$id", "$formula", "$query_specification", "$elmt", "$focal_term", "$argpos_details", "$argpos_ordering", "$examples", "$entry_format", "$follow_ups", "$gloss", "$refspec" }, module0647.$ic99$, module0647.$ic100$, module0647.$ic101$);
        }
    }
    
    public static final class $f39295$UnaryFunction extends UnaryFunction
    {
        public $f39295$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#43020"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0647.f39295(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0647.class
	Total time: 6518 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/