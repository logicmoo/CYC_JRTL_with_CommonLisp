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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0413 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0413";
    public static final String myFingerPrint = "df1b24826c09d129ba1fd0a0cb90d0525810f5473cdd861c62def0f393b93cb4";
    public static SubLSymbol $g3333$;
    private static SubLSymbol $g3334$;
    private static SubLSymbol $g3335$;
    private static SubLSymbol $g3336$;
    private static SubLSymbol $g3337$;
    private static SubLSymbol $g3338$;
    private static SubLSymbol $g3339$;
    private static SubLSymbol $g3340$;
    private static SubLSymbol $g3341$;
    private static SubLSymbol $g3342$;
    private static SubLSymbol $g3343$;
    private static SubLSymbol $g3344$;
    private static SubLSymbol $g3345$;
    private static SubLSymbol $g3346$;
    private static SubLSymbol $g3347$;
    private static SubLSymbol $g3348$;
    private static SubLSymbol $g3349$;
    private static SubLSymbol $g3350$;
    private static SubLSymbol $g3351$;
    private static SubLSymbol $g3352$;
    private static SubLSymbol $g3353$;
    private static SubLSymbol $g3354$;
    private static SubLSymbol $g3355$;
    private static SubLSymbol $g3356$;
    private static SubLSymbol $g3357$;
    private static SubLSymbol $g3358$;
    private static SubLSymbol $g3359$;
    private static SubLSymbol $g3360$;
    private static SubLSymbol $g3361$;
    private static SubLSymbol $g3362$;
    private static SubLSymbol $g3363$;
    private static SubLSymbol $g3364$;
    private static SubLSymbol $g3365$;
    private static SubLSymbol $g3366$;
    private static SubLSymbol $g3367$;
    public static SubLSymbol $g3368$;
    public static SubLSymbol $g3369$;
    public static SubLSymbol $g3370$;
    public static SubLSymbol $g3371$;
    private static SubLSymbol $g3372$;
    private static SubLSymbol $g3373$;
    private static SubLSymbol $g3374$;
    private static SubLSymbol $g3375$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
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
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
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
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
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
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
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
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
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
    private static final SubLSymbol $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLSymbol $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLSymbol $ic257$;
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
    private static final SubLSymbol $ic268$;
    private static final SubLSymbol $ic269$;
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
    private static final SubLSymbol $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLSymbol $ic285$;
    private static final SubLInteger $ic286$;
    private static final SubLString $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLSymbol $ic293$;
    private static final SubLSymbol $ic294$;
    private static final SubLSymbol $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLSymbol $ic297$;
    private static final SubLSymbol $ic298$;
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
    private static final SubLSymbol $ic309$;
    private static final SubLSymbol $ic310$;
    private static final SubLSymbol $ic311$;
    private static final SubLSymbol $ic312$;
    private static final SubLSymbol $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLSymbol $ic316$;
    private static final SubLSymbol $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLSymbol $ic319$;
    private static final SubLSymbol $ic320$;
    private static final SubLSymbol $ic321$;
    private static final SubLInteger $ic322$;
    private static final SubLSymbol $ic323$;
    private static final SubLString $ic324$;
    private static final SubLSymbol $ic325$;
    private static final SubLSymbol $ic326$;
    private static final SubLSymbol $ic327$;
    private static final SubLSymbol $ic328$;
    private static final SubLSymbol $ic329$;
    private static final SubLSymbol $ic330$;
    private static final SubLSymbol $ic331$;
    private static final SubLSymbol $ic332$;
    private static final SubLSymbol $ic333$;
    private static final SubLList $ic334$;
    private static final SubLList $ic335$;
    private static final SubLSymbol $ic336$;
    private static final SubLSymbol $ic337$;
    private static final SubLSymbol $ic338$;
    private static final SubLList $ic339$;
    private static final SubLSymbol $ic340$;
    private static final SubLList $ic341$;
    private static final SubLList $ic342$;
    private static final SubLList $ic343$;
    private static final SubLSymbol $ic344$;
    private static final SubLSymbol $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLSymbol $ic347$;
    private static final SubLList $ic348$;
    private static final SubLSymbol $ic349$;
    private static final SubLSymbol $ic350$;
    private static final SubLSymbol $ic351$;
    private static final SubLSymbol $ic352$;
    private static final SubLSymbol $ic353$;
    private static final SubLSymbol $ic354$;
    private static final SubLSymbol $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLList $ic357$;
    private static final SubLSymbol $ic358$;
    private static final SubLSymbol $ic359$;
    private static final SubLSymbol $ic360$;
    private static final SubLSymbol $ic361$;
    private static final SubLSymbol $ic362$;
    private static final SubLSymbol $ic363$;
    private static final SubLSymbol $ic364$;
    private static final SubLSymbol $ic365$;
    private static final SubLSymbol $ic366$;
    private static final SubLSymbol $ic367$;
    private static final SubLSymbol $ic368$;
    private static final SubLSymbol $ic369$;
    private static final SubLSymbol $ic370$;
    private static final SubLList $ic371$;
    private static final SubLList $ic372$;
    private static final SubLString $ic373$;
    private static final SubLString $ic374$;
    private static final SubLSymbol $ic375$;
    private static final SubLString $ic376$;
    private static final SubLString $ic377$;
    private static final SubLString $ic378$;
    private static final SubLString $ic379$;
    private static final SubLString $ic380$;
    private static final SubLString $ic381$;
    private static final SubLString $ic382$;
    private static final SubLString $ic383$;
    private static final SubLString $ic384$;
    private static final SubLString $ic385$;
    private static final SubLString $ic386$;
    private static final SubLString $ic387$;
    private static final SubLString $ic388$;
    private static final SubLString $ic389$;
    private static final SubLString $ic390$;
    private static final SubLString $ic391$;
    private static final SubLString $ic392$;
    private static final SubLString $ic393$;
    private static final SubLString $ic394$;
    private static final SubLString $ic395$;
    private static final SubLString $ic396$;
    private static final SubLString $ic397$;
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
    private static final SubLInteger $ic408$;
    private static final SubLString $ic409$;
    private static final SubLString $ic410$;
    private static final SubLString $ic411$;
    
    public static SubLObject f28721(final SubLObject var1) {
        return module0035.f2169(var1, (SubLObject)module0413.$ic0$);
    }
    
    public static SubLObject f28722(final SubLObject var2, final SubLObject var3) {
        f28723(var2, var3, (SubLObject)module0413.ZERO_INTEGER);
        return (SubLObject)module0413.NIL;
    }
    
    public static SubLObject f28724(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX31866_native.class) ? module0413.T : module0413.NIL);
    }
    
    public static SubLObject f28725(final SubLObject var2) {
        assert module0413.NIL != f28724(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f28726(final SubLObject var2) {
        assert module0413.NIL != f28724(var2) : var2;
        return var2.getField3();
    }
    
    public static SubLObject f28727(final SubLObject var2) {
        assert module0413.NIL != f28724(var2) : var2;
        return var2.getField4();
    }
    
    public static SubLObject f28728(final SubLObject var2) {
        assert module0413.NIL != f28724(var2) : var2;
        return var2.getField5();
    }
    
    public static SubLObject f28729(final SubLObject var2, final SubLObject var5) {
        assert module0413.NIL != f28724(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f28730(final SubLObject var2, final SubLObject var5) {
        assert module0413.NIL != f28724(var2) : var2;
        return var2.setField3(var5);
    }
    
    public static SubLObject f28731(final SubLObject var2, final SubLObject var5) {
        assert module0413.NIL != f28724(var2) : var2;
        return var2.setField4(var5);
    }
    
    public static SubLObject f28732(final SubLObject var2, final SubLObject var5) {
        assert module0413.NIL != f28724(var2) : var2;
        return var2.setField5(var5);
    }
    
    public static SubLObject f28733(SubLObject var6) {
        if (var6 == module0413.UNPROVIDED) {
            var6 = (SubLObject)module0413.NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX31866_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)module0413.NIL, var8 = var6; module0413.NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)module0413.$ic18$)) {
                f28729(var7, var10);
            }
            else if (var11.eql((SubLObject)module0413.$ic19$)) {
                f28730(var7, var10);
            }
            else if (var11.eql((SubLObject)module0413.$ic20$)) {
                f28731(var7, var10);
            }
            else if (var11.eql((SubLObject)module0413.$ic21$)) {
                f28732(var7, var10);
            }
            else {
                Errors.error((SubLObject)module0413.$ic22$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f28734(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)module0413.$ic23$, (SubLObject)module0413.$ic24$, (SubLObject)module0413.FOUR_INTEGER);
        Functions.funcall(var13, var12, (SubLObject)module0413.$ic25$, (SubLObject)module0413.$ic18$, f28725(var12));
        Functions.funcall(var13, var12, (SubLObject)module0413.$ic25$, (SubLObject)module0413.$ic19$, f28726(var12));
        Functions.funcall(var13, var12, (SubLObject)module0413.$ic25$, (SubLObject)module0413.$ic20$, f28727(var12));
        Functions.funcall(var13, var12, (SubLObject)module0413.$ic25$, (SubLObject)module0413.$ic21$, f28728(var12));
        Functions.funcall(var13, var12, (SubLObject)module0413.$ic26$, (SubLObject)module0413.$ic24$, (SubLObject)module0413.FOUR_INTEGER);
        return var12;
    }
    
    public static SubLObject f28735(final SubLObject var12, final SubLObject var13) {
        return f28734(var12, var13);
    }
    
    public static SubLObject f28723(final SubLObject var1, final SubLObject var3, final SubLObject var14) {
        PrintLow.format(var3, (SubLObject)module0413.$ic28$, f28725(var1));
        return var1;
    }
    
    public static SubLObject f28736(final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var18) {
        assert module0413.NIL != Types.keywordp(var15) : var15;
        assert module0413.NIL != Types.symbolp(var16) : var16;
        assert module0413.NIL != f28721(var17) : var17;
        assert module0413.NIL != Types.booleanp(var18) : var18;
        final SubLObject var19 = f28733((SubLObject)module0413.UNPROVIDED);
        f28729(var19, var15);
        f28730(var19, var16);
        f28731(var19, var17);
        f28732(var19, var18);
        return var19;
    }
    
    public static SubLObject f28737(final SubLObject var19) {
        assert module0413.NIL != f28724(var19) : var19;
        return f28725(var19);
    }
    
    public static SubLObject f28738(final SubLObject var19) {
        assert module0413.NIL != f28724(var19) : var19;
        return f28726(var19);
    }
    
    public static SubLObject f28739(final SubLObject var19) {
        assert module0413.NIL != f28724(var19) : var19;
        return f28727(var19);
    }
    
    public static SubLObject f28740(final SubLObject var19) {
        assert module0413.NIL != f28724(var19) : var19;
        return f28728(var19);
    }
    
    public static SubLObject f28741(final SubLObject var19, final SubLObject var20, final SubLObject var21) {
        assert module0413.NIL != f28724(var19) : var19;
        assert module0413.NIL != module0369.f25275(var20) : var20;
        assert module0413.NIL != module0361.f24009(var21) : var21;
        final SubLObject var22 = f28738(var19);
        final SubLObject var23 = f28739(var19);
        if (var23.eql((SubLObject)module0413.$ic35$)) {
            return Functions.funcall(var22, var21);
        }
        if (var23.eql((SubLObject)module0413.$ic36$)) {
            return Functions.funcall(var22, var20);
        }
        return Errors.error((SubLObject)module0413.$ic37$, f28739(var19));
    }
    
    public static SubLObject f28742(final SubLObject var1) {
        return module0035.f2169(var1, module0413.$g3335$.getGlobalValue());
    }
    
    public static SubLObject f28743(final SubLObject var15, final SubLObject var16, final SubLObject var17, SubLObject var18) {
        if (var18 == module0413.UNPROVIDED) {
            var18 = (SubLObject)module0413.NIL;
        }
        final SubLObject var19 = f28736(var15, var16, var17, var18);
        module0067.f4886(module0413.$g3334$.getGlobalValue(), var15, var19);
        return var19;
    }
    
    public static SubLObject f28744(final SubLObject var15) {
        return module0067.f4885(module0413.$g3334$.getGlobalValue(), var15, (SubLObject)module0413.UNPROVIDED);
    }
    
    public static SubLObject f28745(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isKeyword() && module0413.NIL != module0035.sublisp_boolean(f28744(var1)));
    }
    
    public static SubLObject f28746() {
        return module0067.f4902(module0413.$g3334$.getGlobalValue());
    }
    
    public static SubLObject f28747() {
        return module0413.$g3336$.getGlobalValue();
    }
    
    public static SubLObject f28748() {
        module0413.$g3336$.setGlobalValue(Numbers.add(module0413.$g3336$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3336$.getGlobalValue();
    }
    
    public static SubLObject f28749() {
        return module0413.$g3337$.getGlobalValue();
    }
    
    public static SubLObject f28750() {
        return Numbers.subtract(f28747(), f28749());
    }
    
    public static SubLObject f28751() {
        module0413.$g3337$.setGlobalValue(Numbers.add(module0413.$g3337$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3337$.getGlobalValue();
    }
    
    public static SubLObject f28752() {
        return module0413.$g3338$.getGlobalValue();
    }
    
    public static SubLObject f28753(final SubLObject var23) {
        final SubLObject var24 = module0361.f24229(var23);
        module0413.$g3338$.setGlobalValue(Numbers.max(module0413.$g3338$.getGlobalValue(), var24));
        return module0413.$g3338$.getGlobalValue();
    }
    
    public static SubLObject f28754() {
        final SubLObject var25 = f28747();
        return (SubLObject)(var25.isZero() ? module0413.ZERO_INTEGER : Numbers.divide(f28755(), var25));
    }
    
    public static SubLObject f28756() {
        return module0413.$g3339$.getGlobalValue();
    }
    
    public static SubLObject f28757(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0361.f24229(var23);
        if (module0413.NIL != module0018.$g629$.getDynamicValue(var24) && var25.numGE(module0413.$g3340$.getDynamicValue(var24))) {
            Errors.warn((SubLObject)module0413.$ic287$, var23, var25);
        }
        module0413.$g3339$.setGlobalValue(Numbers.max(module0413.$g3339$.getGlobalValue(), var25));
        return module0413.$g3339$.getGlobalValue();
    }
    
    public static SubLObject f28758() {
        final SubLObject var25 = f28749();
        return (SubLObject)(var25.isZero() ? module0413.ZERO_INTEGER : Numbers.divide(f28759(), var25));
    }
    
    public static SubLObject f28760() {
        module0413.$g3341$.setGlobalValue(Numbers.add(module0413.$g3341$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3341$.getGlobalValue();
    }
    
    public static SubLObject f28755() {
        return module0413.$g3341$.getGlobalValue();
    }
    
    public static SubLObject f28761() {
        return module0413.$g3342$.getGlobalValue();
    }
    
    public static SubLObject f28762() {
        module0413.$g3342$.setGlobalValue(Numbers.add(module0413.$g3342$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3342$.getGlobalValue();
    }
    
    public static SubLObject f28763() {
        module0413.$g3342$.setGlobalValue(Numbers.subtract(module0413.$g3342$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3342$.getGlobalValue();
    }
    
    public static SubLObject f28764() {
        return module0413.$g3343$.getGlobalValue();
    }
    
    public static SubLObject f28765() {
        module0413.$g3343$.setGlobalValue(Numbers.add(module0413.$g3343$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3343$.getGlobalValue();
    }
    
    public static SubLObject f28759() {
        return module0413.$g3344$.getGlobalValue();
    }
    
    public static SubLObject f28766(final SubLObject var23) {
        final SubLObject var24 = module0361.f24229(var23);
        module0413.$g3344$.setGlobalValue(Numbers.add(module0413.$g3344$.getGlobalValue(), var24));
        return module0413.$g3344$.getGlobalValue();
    }
    
    public static SubLObject f28767() {
        return module0413.$g3345$.getGlobalValue();
    }
    
    public static SubLObject f28768() {
        return Numbers.subtract(f28755(), f28767());
    }
    
    public static SubLObject f28769() {
        module0413.$g3345$.setGlobalValue(Numbers.add(module0413.$g3345$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3345$.getGlobalValue();
    }
    
    public static SubLObject f28770() {
        return module0413.$g3346$.getGlobalValue();
    }
    
    public static SubLObject f28771() {
        return module0413.$g3347$.getGlobalValue();
    }
    
    public static SubLObject f28772() {
        return module0413.$g3348$.getGlobalValue();
    }
    
    public static SubLObject f28773() {
        return module0413.$g3349$.getGlobalValue();
    }
    
    public static SubLObject f28774() {
        return module0413.$g3350$.getGlobalValue();
    }
    
    public static SubLObject f28775(final SubLObject var27) {
        if (var27.eql((SubLObject)module0413.$ic298$)) {
            module0413.$g3349$.setGlobalValue(Numbers.add(module0413.$g3349$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
            module0413.$g3348$.setGlobalValue(Numbers.add(module0413.$g3348$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        }
        else if (var27.eql((SubLObject)module0413.$ic299$)) {
            module0413.$g3350$.setGlobalValue(Numbers.add(module0413.$g3350$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
            module0413.$g3348$.setGlobalValue(Numbers.add(module0413.$g3348$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        }
        else if (var27.eql((SubLObject)module0413.$ic300$)) {
            module0413.$g3348$.setGlobalValue(Numbers.add(module0413.$g3348$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        }
        else {
            module0413.$g3347$.setGlobalValue(Numbers.add(module0413.$g3347$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        }
        module0413.$g3346$.setGlobalValue(Numbers.add(module0413.$g3346$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return (SubLObject)module0413.NIL;
    }
    
    public static SubLObject f28776() {
        return module0413.$g3351$.getGlobalValue();
    }
    
    public static SubLObject f28777() {
        module0413.$g3351$.setGlobalValue(Numbers.add(module0413.$g3351$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3351$.getGlobalValue();
    }
    
    public static SubLObject f28778() {
        return module0413.$g3352$.getGlobalValue();
    }
    
    public static SubLObject f28779() {
        return Numbers.subtract(f28776(), f28778());
    }
    
    public static SubLObject f28780() {
        module0413.$g3352$.setGlobalValue(Numbers.add(module0413.$g3352$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3352$.getGlobalValue();
    }
    
    public static SubLObject f28781() {
        return Numbers.subtract(f28776(), f28755());
    }
    
    public static SubLObject f28782() {
        final SubLObject var28 = f28755();
        return (SubLObject)(var28.isZero() ? module0413.ZERO_INTEGER : Numbers.divide(f28781(), var28));
    }
    
    public static SubLObject f28783() {
        return Numbers.subtract(f28778(), f28767());
    }
    
    public static SubLObject f28784() {
        final SubLObject var28 = f28767();
        return (SubLObject)(var28.isZero() ? module0413.ZERO_INTEGER : Numbers.divide(f28783(), var28));
    }
    
    public static SubLObject f28785() {
        return Numbers.subtract(f28779(), f28768());
    }
    
    public static SubLObject f28786() {
        final SubLObject var28 = f28768();
        return (SubLObject)(var28.isZero() ? module0413.ZERO_INTEGER : Numbers.divide(f28785(), var28));
    }
    
    public static SubLObject f28787() {
        return module0413.$g3353$.getGlobalValue();
    }
    
    public static SubLObject f28788() {
        module0413.$g3353$.setGlobalValue(Numbers.add(module0413.$g3353$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3353$.getGlobalValue();
    }
    
    public static SubLObject f28789() {
        return module0413.$g3354$.getGlobalValue();
    }
    
    public static SubLObject f28790() {
        module0413.$g3354$.setGlobalValue(Numbers.add(module0413.$g3354$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3354$.getGlobalValue();
    }
    
    public static SubLObject f28791() {
        return module0413.$g3355$.getGlobalValue();
    }
    
    public static SubLObject f28792() {
        module0413.$g3355$.setGlobalValue(Numbers.add(module0413.$g3355$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3355$.getGlobalValue();
    }
    
    public static SubLObject f28793() {
        return module0413.$g3356$.getGlobalValue();
    }
    
    public static SubLObject f28794() {
        module0413.$g3356$.setGlobalValue(Numbers.add(module0413.$g3356$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3356$.getGlobalValue();
    }
    
    public static SubLObject f28795() {
        return module0413.$g3357$.getGlobalValue();
    }
    
    public static SubLObject f28796() {
        module0413.$g3357$.setGlobalValue(Numbers.add(module0413.$g3357$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3357$.getGlobalValue();
    }
    
    public static SubLObject f28797() {
        return module0413.$g3358$.getGlobalValue();
    }
    
    public static SubLObject f28798() {
        module0413.$g3358$.setGlobalValue(Numbers.add(module0413.$g3358$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3358$.getGlobalValue();
    }
    
    public static SubLObject f28799() {
        return module0413.$g3359$.getGlobalValue();
    }
    
    public static SubLObject f28800() {
        module0413.$g3359$.setGlobalValue(Numbers.add(module0413.$g3359$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3359$.getGlobalValue();
    }
    
    public static SubLObject f28801() {
        return module0413.$g3360$.getGlobalValue();
    }
    
    public static SubLObject f28802() {
        module0413.$g3360$.setGlobalValue(Numbers.add(module0413.$g3360$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3360$.getGlobalValue();
    }
    
    public static SubLObject f28803() {
        return module0413.$g3361$.getGlobalValue();
    }
    
    public static SubLObject f28804() {
        module0413.$g3361$.setGlobalValue(Numbers.add(module0413.$g3361$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3361$.getGlobalValue();
    }
    
    public static SubLObject f28805() {
        return module0413.$g3362$.getGlobalValue();
    }
    
    public static SubLObject f28806() {
        module0413.$g3362$.setGlobalValue(Numbers.add(module0413.$g3362$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3362$.getGlobalValue();
    }
    
    public static SubLObject f28807() {
        return module0413.$g3363$.getGlobalValue();
    }
    
    public static SubLObject f28808() {
        module0413.$g3363$.setGlobalValue(Numbers.add(module0413.$g3363$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3363$.getGlobalValue();
    }
    
    public static SubLObject f28809() {
        return module0413.$g3364$.getGlobalValue();
    }
    
    public static SubLObject f28810() {
        module0413.$g3364$.setGlobalValue(Numbers.add(module0413.$g3364$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3364$.getGlobalValue();
    }
    
    public static SubLObject f28811() {
        return module0413.$g3365$.getGlobalValue();
    }
    
    public static SubLObject f28812() {
        module0413.$g3365$.setGlobalValue(Numbers.add(module0413.$g3365$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3365$.getGlobalValue();
    }
    
    public static SubLObject f28813() {
        return module0413.$g3366$.getGlobalValue();
    }
    
    public static SubLObject f28814() {
        return Numbers.subtract(f28809(), f28813());
    }
    
    public static SubLObject f28815() {
        module0413.$g3366$.setGlobalValue(Numbers.add(module0413.$g3366$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3366$.getGlobalValue();
    }
    
    public static SubLObject f28816() {
        return module0413.$g3367$.getGlobalValue();
    }
    
    public static SubLObject f28817() {
        return Numbers.subtract(f28811(), f28816());
    }
    
    public static SubLObject f28818() {
        module0413.$g3367$.setGlobalValue(Numbers.add(module0413.$g3367$.getGlobalValue(), (SubLObject)module0413.ONE_INTEGER));
        return module0413.$g3367$.getGlobalValue();
    }
    
    public static SubLObject f28819() {
        final SubLObject var29 = f28809();
        return (SubLObject)(var29.isZero() ? module0413.ZERO_INTEGER : Numbers.divide(f28755(), var29));
    }
    
    public static SubLObject f28820(final SubLObject var20) {
        return module0369.f25642(var20, (SubLObject)module0413.$ic318$);
    }
    
    public static SubLObject f28821(final SubLObject var20) {
        return module0369.f25642(var20, (SubLObject)module0413.$ic319$);
    }
    
    public static SubLObject f28822(final SubLObject var20) {
        return module0369.f25642(var20, (SubLObject)module0413.$ic320$);
    }
    
    public static SubLObject f28823(final SubLObject var20) {
        module0159.$g2147$.setDynamicValue((SubLObject)module0413.ZERO_INTEGER);
        module0159.$g2148$.setDynamicValue((SubLObject)module0413.ZERO_INTEGER);
        return Hashtables.make_hash_table((SubLObject)module0413.$ic322$, (SubLObject)module0413.UNPROVIDED, (SubLObject)module0413.UNPROVIDED);
    }
    
    public static SubLObject f28824(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0034.$g879$.getDynamicValue(var21);
        SubLObject var23 = (SubLObject)module0413.NIL;
        if (module0413.NIL == var22) {
            return f28823(var20);
        }
        var23 = module0034.f1857(var22, (SubLObject)module0413.$ic321$, (SubLObject)module0413.UNPROVIDED);
        if (module0413.NIL == var23) {
            var23 = module0034.f1807(module0034.f1842(var22), (SubLObject)module0413.$ic321$, (SubLObject)module0413.ONE_INTEGER, (SubLObject)module0413.NIL, (SubLObject)module0413.EQL, (SubLObject)module0413.UNPROVIDED);
            module0034.f1860(var22, (SubLObject)module0413.$ic321$, var23);
        }
        SubLObject var24 = module0034.f1814(var23, var20, (SubLObject)module0413.$ic323$);
        if (var24 == module0413.$ic323$) {
            var24 = Values.arg2(var21.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f28823(var20)));
            module0034.f1816(var23, var20, var24, (SubLObject)module0413.UNPROVIDED);
        }
        return module0034.f1959(var24);
    }
    
    public static SubLObject f28825(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0413.NIL != module0413.$g3368$.getDynamicValue(var21) || module0413.NIL != module0369.f25602(var20, (SubLObject)module0413.$ic276$)) {
            final SubLObject var22 = module0369.f25421(var20);
            final SubLObject var23 = f28826(var20);
            final SubLObject var24 = module0369.f25533(var20);
            final SubLObject var25 = (SubLObject)ConsesLow.list(module0361.f24229(var22), module0159.$g2147$.getDynamicValue(var21), module0159.$g2148$.getDynamicValue(var21), module0363.f24552(Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#31868", "CYC"), var22)), module0159.$g2143$.getGlobalValue(), module0159.$g2144$.getGlobalValue(), var24);
            Hashtables.sethash(var24, var23, var25);
        }
        return (SubLObject)module0413.NIL;
    }
    
    public static SubLObject f28826(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0413.NIL;
        final SubLObject var23 = module0361.f24117(module0369.f25421(var20));
        final SubLObject var24 = module0034.$g879$.currentBinding(var21);
        try {
            module0034.$g879$.bind(var23, var21);
            SubLObject var25 = (SubLObject)module0413.NIL;
            if (module0413.NIL != var23 && module0413.NIL == module0034.f1842(var23)) {
                var25 = module0034.f1869(var23);
                final SubLObject var26 = Threads.current_process();
                if (module0413.NIL == var25) {
                    module0034.f1873(var23, var26);
                }
                else if (!var25.eql(var26)) {
                    Errors.error((SubLObject)module0413.$ic324$);
                }
            }
            try {
                var22 = f28824(var20);
            }
            finally {
                final SubLObject var38_41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var21);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0413.T, var21);
                    if (module0413.NIL != var23 && module0413.NIL == var25) {
                        module0034.f1873(var23, (SubLObject)module0413.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var38_41, var21);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var24, var21);
        }
        return var22;
    }
    
    public static SubLObject f28827(final SubLObject var20) {
        return Hashtables.make_hash_table((SubLObject)module0413.$ic322$, (SubLObject)module0413.UNPROVIDED, (SubLObject)module0413.UNPROVIDED);
    }
    
    public static SubLObject f28828(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0034.$g879$.getDynamicValue(var21);
        SubLObject var23 = (SubLObject)module0413.NIL;
        if (module0413.NIL == var22) {
            return f28827(var20);
        }
        var23 = module0034.f1857(var22, (SubLObject)module0413.$ic325$, (SubLObject)module0413.UNPROVIDED);
        if (module0413.NIL == var23) {
            var23 = module0034.f1807(module0034.f1842(var22), (SubLObject)module0413.$ic325$, (SubLObject)module0413.ONE_INTEGER, (SubLObject)module0413.NIL, (SubLObject)module0413.EQL, (SubLObject)module0413.UNPROVIDED);
            module0034.f1860(var22, (SubLObject)module0413.$ic325$, var23);
        }
        SubLObject var24 = module0034.f1814(var23, var20, (SubLObject)module0413.$ic323$);
        if (var24 == module0413.$ic323$) {
            var24 = Values.arg2(var21.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f28827(var20)));
            module0034.f1816(var23, var20, var24, (SubLObject)module0413.UNPROVIDED);
        }
        return module0034.f1959(var24);
    }
    
    public static SubLObject f28829(final SubLObject var20) {
        if (module0413.NIL != f28830(var20)) {
            final SubLObject var21 = module0369.f25421(var20);
            final SubLObject var22 = f28831(var20);
            final SubLObject var23 = module0369.f25533(var20);
            final SubLObject var24 = module0361.f24229(module0369.f25421(var20));
            final SubLObject var25 = Numbers.add((SubLObject)module0413.MINUS_ONE_INTEGER, var23, var24);
            final SubLObject var26 = (SubLObject)ConsesLow.list(new SubLObject[] { module0413.$ic326$, var25, module0413.$ic66$, var24, module0413.$ic327$, var23, module0413.$ic328$, module0425.f30062(), module0413.$ic329$, module0425.f30065(), module0413.$ic330$, module0425.f30058(), module0413.$ic331$, module0425.f30061(), module0413.$ic332$, Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#31868", "CYC"), var21) });
            Hashtables.sethash(var25, var22, var26);
            if (module0413.NIL == Hashtables.gethash((SubLObject)module0413.ONE_INTEGER, var22, (SubLObject)module0413.UNPROVIDED)) {
                final SubLObject var27 = (SubLObject)ConsesLow.list(new SubLObject[] { module0413.$ic326$, module0413.ONE_INTEGER, module0413.$ic66$, module0413.ONE_INTEGER, module0413.$ic327$, module0413.ONE_INTEGER, module0413.$ic328$, module0413.ZERO_INTEGER, module0413.$ic329$, module0413.ZERO_INTEGER, module0413.$ic330$, module0413.NIL, module0413.$ic331$, module0413.NIL, module0413.$ic332$, module0369.f25597(var20) });
                Hashtables.sethash((SubLObject)module0413.ONE_INTEGER, var22, var27);
            }
        }
        return (SubLObject)module0413.NIL;
    }
    
    public static SubLObject f28830(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0413.NIL != module0369.f25417(var20) && (module0413.NIL != module0413.$g3369$.getDynamicValue(var21) || module0413.NIL != module0369.f25602(var20, (SubLObject)module0413.$ic278$)));
    }
    
    public static SubLObject f28831(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0413.NIL;
        final SubLObject var23 = module0361.f24117(module0369.f25421(var20));
        final SubLObject var24 = module0034.$g879$.currentBinding(var21);
        try {
            module0034.$g879$.bind(var23, var21);
            SubLObject var25 = (SubLObject)module0413.NIL;
            if (module0413.NIL != var23 && module0413.NIL == module0034.f1842(var23)) {
                var25 = module0034.f1869(var23);
                final SubLObject var26 = Threads.current_process();
                if (module0413.NIL == var25) {
                    module0034.f1873(var23, var26);
                }
                else if (!var25.eql(var26)) {
                    Errors.error((SubLObject)module0413.$ic324$);
                }
            }
            try {
                var22 = f28828(var20);
            }
            finally {
                final SubLObject var38_45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var21);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0413.T, var21);
                    if (module0413.NIL != var23 && module0413.NIL == var25) {
                        module0034.f1873(var23, (SubLObject)module0413.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var38_45, var21);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var24, var21);
        }
        return var22;
    }
    
    public static SubLObject f28832(final SubLObject var20, final SubLObject var46, final SubLObject var47, final SubLObject var48) {
        final SubLObject var49 = f28831(var20);
        if (module0413.NIL != var46) {
            return Hashtables.gethash(var46, var49, (SubLObject)module0413.UNPROVIDED);
        }
        return (SubLObject)module0413.NIL;
    }
    
    public static SubLObject f28833(final SubLObject var20) {
        final SubLObject var21 = module0369.f25533(var20);
        final SubLObject var22 = module0361.f24229(module0369.f25421(var20));
        final SubLObject var23 = Numbers.add((SubLObject)module0413.MINUS_ONE_INTEGER, var21, var22);
        return var23;
    }
    
    public static SubLObject f28834(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0413.NIL;
        final SubLObject var23 = module0361.f24117(module0369.f25421(var20));
        final SubLObject var24 = module0034.$g879$.currentBinding(var21);
        try {
            module0034.$g879$.bind(var23, var21);
            SubLObject var25 = (SubLObject)module0413.NIL;
            if (module0413.NIL != var23 && module0413.NIL == module0034.f1842(var23)) {
                var25 = module0034.f1869(var23);
                final SubLObject var26 = Threads.current_process();
                if (module0413.NIL == var25) {
                    module0034.f1873(var23, var26);
                }
                else if (!var25.eql(var26)) {
                    Errors.error((SubLObject)module0413.$ic324$);
                }
            }
            try {
                var22 = f28835(var20);
            }
            finally {
                final SubLObject var38_50 = Threads.$is_thread_performing_cleanupP$.currentBinding(var21);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0413.T, var21);
                    if (module0413.NIL != var23 && module0413.NIL == var25) {
                        module0034.f1873(var23, (SubLObject)module0413.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var38_50, var21);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var24, var21);
        }
        return var22;
    }
    
    public static SubLObject f28836(final SubLObject var20) {
        return Hashtables.make_hash_table((SubLObject)module0413.$ic322$, (SubLObject)module0413.UNPROVIDED, (SubLObject)module0413.UNPROVIDED);
    }
    
    public static SubLObject f28835(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0034.$g879$.getDynamicValue(var21);
        SubLObject var23 = (SubLObject)module0413.NIL;
        if (module0413.NIL == var22) {
            return f28836(var20);
        }
        var23 = module0034.f1857(var22, (SubLObject)module0413.$ic333$, (SubLObject)module0413.UNPROVIDED);
        if (module0413.NIL == var23) {
            var23 = module0034.f1807(module0034.f1842(var22), (SubLObject)module0413.$ic333$, (SubLObject)module0413.ONE_INTEGER, (SubLObject)module0413.NIL, (SubLObject)module0413.EQL, (SubLObject)module0413.UNPROVIDED);
            module0034.f1860(var22, (SubLObject)module0413.$ic333$, var23);
        }
        SubLObject var24 = module0034.f1814(var23, var20, (SubLObject)module0413.$ic323$);
        if (var24 == module0413.$ic323$) {
            var24 = Values.arg2(var21.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f28836(var20)));
            module0034.f1816(var23, var20, var24, (SubLObject)module0413.UNPROVIDED);
        }
        return module0034.f1959(var24);
    }
    
    public static SubLObject f28837(final SubLObject var20, final SubLObject var51, final SubLObject var52) {
        return module0030.f1599(var51, var52, f28834(var20));
    }
    
    public static SubLObject f28838(final SubLObject var52) {
        if (module0413.NIL != f28839((SubLObject)module0413.UNPROVIDED)) {
            module0030.f1599(module0373.f26108(), var52, f28834(module0339.f22757()));
            SubLObject var53 = module0339.f22758().rest();
            SubLObject var54 = (SubLObject)module0413.NIL;
            var54 = var53.first();
            while (module0413.NIL != var53) {
                module0030.f1599(module0365.f24865(module0373.f26105()), var52, f28834(var54));
                var53 = var53.rest();
                var54 = var53.first();
            }
            if (module0413.NIL != module0035.f2004(module0339.f22758(), module0373.f26106())) {
                SubLObject var55 = (SubLObject)module0413.NIL;
                SubLObject var20_55 = (SubLObject)module0413.NIL;
                SubLObject var56 = (SubLObject)module0413.NIL;
                SubLObject var57_58 = (SubLObject)module0413.NIL;
                var55 = module0339.f22758().rest();
                var20_55 = var55.first();
                var56 = module0373.f26106().rest();
                var57_58 = var56.first();
                while (module0413.NIL != var56 || module0413.NIL != var55) {
                    module0030.f1599(module0365.f24865(var57_58), Numbers.subtract((SubLObject)module0413.ZERO_INTEGER, var52), f28834(var20_55));
                    var55 = var55.rest();
                    var20_55 = var55.first();
                    var56 = var56.rest();
                    var57_58 = var56.first();
                }
            }
        }
        return (SubLObject)module0413.NIL;
    }
    
    public static SubLObject f28840(SubLObject var20) {
        if (var20 == module0413.UNPROVIDED) {
            var20 = module0339.f22757();
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0413.NIL != module0369.f25417(var20) && (module0413.NIL != module0413.$g3370$.getDynamicValue(var21) || module0413.NIL != module0369.f25602(var20, (SubLObject)module0413.$ic280$)));
    }
    
    public static SubLObject f28839(SubLObject var59) {
        if (var59 == module0413.UNPROVIDED) {
            var59 = module0339.f22758();
        }
        SubLObject var60 = (SubLObject)module0413.NIL;
        if (module0413.NIL == var60) {
            SubLObject var61;
            SubLObject var62;
            for (var61 = var59, var62 = (SubLObject)module0413.NIL, var62 = var61.first(); module0413.NIL == var60 && module0413.NIL != var61; var60 = f28840(var62), var61 = var61.rest(), var62 = var61.first()) {}
        }
        return var60;
    }
    
    public static SubLObject f28841(final SubLObject var61, final SubLObject var62) {
        SubLObject var64;
        final SubLObject var63 = var64 = var61.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var64, var63, (SubLObject)module0413.$ic334$);
        final SubLObject var65 = var64.rest();
        var64 = var64.first();
        SubLObject var66 = (SubLObject)module0413.NIL;
        SubLObject var67 = var64;
        SubLObject var68 = (SubLObject)module0413.NIL;
        SubLObject var69_70 = (SubLObject)module0413.NIL;
        while (module0413.NIL != var67) {
            cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)module0413.$ic334$);
            var69_70 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)module0413.$ic334$);
            if (module0413.NIL == conses_high.member(var69_70, (SubLObject)module0413.$ic335$, (SubLObject)module0413.UNPROVIDED, (SubLObject)module0413.UNPROVIDED)) {
                var68 = (SubLObject)module0413.T;
            }
            if (var69_70 == module0413.$ic336$) {
                var66 = var67.first();
            }
            var67 = var67.rest();
        }
        if (module0413.NIL != var68 && module0413.NIL == var66) {
            cdestructuring_bind.cdestructuring_bind_error(var63, (SubLObject)module0413.$ic334$);
        }
        final SubLObject var69 = cdestructuring_bind.property_list_member((SubLObject)module0413.$ic337$, var64);
        final SubLObject var70 = (SubLObject)((module0413.NIL != var69) ? conses_high.cadr(var69) : module0413.NIL);
        final SubLObject var71;
        var64 = (var71 = var65);
        return (SubLObject)ConsesLow.listS((SubLObject)module0413.$ic338$, (SubLObject)ConsesLow.list((SubLObject)module0413.$ic339$, (SubLObject)ConsesLow.list((SubLObject)module0413.$ic340$, var70)), ConsesLow.append(var71, (SubLObject)module0413.$ic341$));
    }
    
    public static SubLObject f28842(final SubLObject var61, final SubLObject var62) {
        SubLObject var64;
        final SubLObject var63 = var64 = var61.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var64, var63, (SubLObject)module0413.$ic342$);
        final SubLObject var65 = var64.rest();
        var64 = var64.first();
        SubLObject var66 = (SubLObject)module0413.NIL;
        SubLObject var67 = var64;
        SubLObject var68 = (SubLObject)module0413.NIL;
        SubLObject var80_81 = (SubLObject)module0413.NIL;
        while (module0413.NIL != var67) {
            cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)module0413.$ic342$);
            var80_81 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)module0413.$ic342$);
            if (module0413.NIL == conses_high.member(var80_81, (SubLObject)module0413.$ic343$, (SubLObject)module0413.UNPROVIDED, (SubLObject)module0413.UNPROVIDED)) {
                var68 = (SubLObject)module0413.T;
            }
            if (var80_81 == module0413.$ic336$) {
                var66 = var67.first();
            }
            var67 = var67.rest();
        }
        if (module0413.NIL != var68 && module0413.NIL == var66) {
            cdestructuring_bind.cdestructuring_bind_error(var63, (SubLObject)module0413.$ic342$);
        }
        final SubLObject var69 = cdestructuring_bind.property_list_member((SubLObject)module0413.$ic344$, var64);
        final SubLObject var70 = (SubLObject)((module0413.NIL != var69) ? conses_high.cadr(var69) : module0413.NIL);
        final SubLObject var71 = cdestructuring_bind.property_list_member((SubLObject)module0413.$ic337$, var64);
        final SubLObject var72 = (SubLObject)((module0413.NIL != var71) ? conses_high.cadr(var71) : module0413.NIL);
        final SubLObject var73;
        var64 = (var73 = var65);
        return (SubLObject)ConsesLow.listS((SubLObject)module0413.$ic345$, (SubLObject)ConsesLow.list((SubLObject)module0413.$ic337$, var72), ConsesLow.append(var73, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0413.$ic346$, var70))));
    }
    
    public static SubLObject f28843(final SubLObject var61, final SubLObject var62) {
        SubLObject var64;
        final SubLObject var63 = var64 = var61.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var64, var63, (SubLObject)module0413.$ic342$);
        final SubLObject var65 = var64.rest();
        var64 = var64.first();
        SubLObject var66 = (SubLObject)module0413.NIL;
        SubLObject var67 = var64;
        SubLObject var68 = (SubLObject)module0413.NIL;
        SubLObject var91_92 = (SubLObject)module0413.NIL;
        while (module0413.NIL != var67) {
            cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)module0413.$ic342$);
            var91_92 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)module0413.$ic342$);
            if (module0413.NIL == conses_high.member(var91_92, (SubLObject)module0413.$ic343$, (SubLObject)module0413.UNPROVIDED, (SubLObject)module0413.UNPROVIDED)) {
                var68 = (SubLObject)module0413.T;
            }
            if (var91_92 == module0413.$ic336$) {
                var66 = var67.first();
            }
            var67 = var67.rest();
        }
        if (module0413.NIL != var68 && module0413.NIL == var66) {
            cdestructuring_bind.cdestructuring_bind_error(var63, (SubLObject)module0413.$ic342$);
        }
        final SubLObject var69 = cdestructuring_bind.property_list_member((SubLObject)module0413.$ic344$, var64);
        final SubLObject var70 = (SubLObject)((module0413.NIL != var69) ? conses_high.cadr(var69) : module0413.NIL);
        final SubLObject var71 = cdestructuring_bind.property_list_member((SubLObject)module0413.$ic337$, var64);
        final SubLObject var72 = (SubLObject)((module0413.NIL != var71) ? conses_high.cadr(var71) : module0413.NIL);
        final SubLObject var73;
        var64 = (var73 = var65);
        return (SubLObject)ConsesLow.list((SubLObject)module0413.$ic347$, (SubLObject)module0413.$ic348$, (SubLObject)ConsesLow.listS((SubLObject)module0413.$ic349$, (SubLObject)ConsesLow.list((SubLObject)module0413.$ic344$, var70, (SubLObject)module0413.$ic337$, var72), ConsesLow.append(var73, (SubLObject)module0413.NIL)));
    }
    
    public static SubLObject f28844() {
        return module0413.$g3372$.getGlobalValue();
    }
    
    public static SubLObject f28845() {
        return module0413.$g3373$.getGlobalValue();
    }
    
    public static SubLObject f28846() {
        return module0413.$g3374$.getGlobalValue();
    }
    
    public static SubLObject f28847() {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = f28846();
        SubLObject var28;
        for (var28 = module0066.f4838(module0067.f4891(var27)); module0413.NIL == module0066.f4841(var28); var28 = module0066.f4840(var28)) {
            var26.resetMultipleValues();
            final SubLObject var29 = module0066.f4839(var28);
            final SubLObject var30 = var26.secondMultipleValue();
            var26.resetMultipleValues();
            final SubLObject var31 = module0035.remove_if_not((SubLObject)module0413.$ic353$, var30, (SubLObject)module0413.UNPROVIDED, (SubLObject)module0413.UNPROVIDED, (SubLObject)module0413.UNPROVIDED, (SubLObject)module0413.UNPROVIDED);
            module0067.f4886(var27, var29, var31);
        }
        module0066.f4842(var28);
        return var27;
    }
    
    public static SubLObject f28848() {
        return module0413.$g3375$.getGlobalValue();
    }
    
    public static SubLObject f28849() {
        module0067.f4881(f28844());
        module0067.f4881(f28845());
        module0067.f4881(f28846());
        module0067.f4881(f28848());
        return (SubLObject)module0413.NIL;
    }
    
    public static SubLObject f28850(final SubLObject var97, final SubLObject var99, final SubLObject var20) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (module0413.NIL != module0413.$g3371$.getDynamicValue(var100)) {
            if (module0413.NIL != module0018.$g631$.getDynamicValue(var100) && module0413.NIL != var20) {
                module0084.f5762(f28846(), var97, var20);
            }
            final SubLObject var101 = module0528.f32908();
            if (module0413.NIL != var101) {
                module0084.f5765(f28848(), var97, var101, (SubLObject)module0413.UNPROVIDED, (SubLObject)module0413.UNPROVIDED);
            }
            module0084.f5775(f28845(), var97, (SubLObject)module0413.UNPROVIDED);
            return module0084.f5775(f28844(), var97, var99);
        }
        return (SubLObject)module0413.NIL;
    }
    
    public static SubLObject f28851(SubLObject var83) {
        if (var83 == module0413.UNPROVIDED) {
            var83 = (SubLObject)module0413.NIL;
        }
        f28847();
        SubLObject var84 = module0084.f5780(module0413.$g3372$.getGlobalValue());
        var84 = Sequences.delete((SubLObject)module0413.NIL, var84, Symbols.symbol_function((SubLObject)module0413.EQ), Symbols.symbol_function((SubLObject)module0413.$ic355$), (SubLObject)module0413.UNPROVIDED, (SubLObject)module0413.UNPROVIDED, (SubLObject)module0413.UNPROVIDED);
        var84 = Sort.sort(var84, Symbols.symbol_function((SubLObject)module0413.$ic356$), Symbols.symbol_function((SubLObject)module0413.$ic355$));
        SubLObject var85 = (SubLObject)module0413.NIL;
        SubLObject var86 = (SubLObject)module0413.ZERO_INTEGER;
        SubLObject var87 = var84;
        SubLObject var88 = (SubLObject)module0413.NIL;
        var88 = var87.first();
        while (module0413.NIL != var87) {
            SubLObject var90;
            final SubLObject var89 = var90 = var88;
            SubLObject var91 = (SubLObject)module0413.NIL;
            SubLObject var92 = (SubLObject)module0413.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)module0413.$ic357$);
            var91 = var90.first();
            var90 = (var92 = var90.rest());
            if (module0413.NIL == var83 || var86.numL(var83)) {
                var85 = (SubLObject)ConsesLow.cons(f28852(var91, var92), var85);
            }
            var86 = Numbers.add(var86, (SubLObject)module0413.ONE_INTEGER);
            var87 = var87.rest();
            var88 = var87.first();
        }
        return Sequences.nreverse(var85);
    }
    
    public static SubLObject f28853() {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)module0413.NIL;
        SubLObject var28;
        for (var28 = module0066.f4838(module0067.f4891(f28848())); module0413.NIL == module0066.f4841(var28); var28 = module0066.f4840(var28)) {
            var26.resetMultipleValues();
            final SubLObject var29 = module0066.f4839(var28);
            final SubLObject var30 = var26.secondMultipleValue();
            var26.resetMultipleValues();
            SubLObject var31 = (SubLObject)module0413.NIL;
            if (module0413.NIL == var31) {
                SubLObject var32;
                SubLObject var33;
                for (var32 = var30, var33 = (SubLObject)module0413.NIL, var33 = var32.first(); module0413.NIL == var31 && module0413.NIL != var32; var31 = module0211.f13667(var33, var29), var32 = var32.rest(), var33 = var32.first()) {}
            }
            if (module0413.NIL != var31) {
                var27 = (SubLObject)ConsesLow.cons(var29, var27);
            }
        }
        module0066.f4842(var28);
        return var27;
    }
    
    public static SubLObject f28854() {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)module0413.NIL;
        SubLObject var28;
        for (var28 = module0066.f4838(module0067.f4891(f28848())); module0413.NIL == module0066.f4841(var28); var28 = module0066.f4840(var28)) {
            var26.resetMultipleValues();
            final SubLObject var29 = module0066.f4839(var28);
            final SubLObject var30 = var26.secondMultipleValue();
            var26.resetMultipleValues();
            SubLObject var31 = (SubLObject)module0413.NIL;
            if (module0413.NIL == var31) {
                SubLObject var32;
                SubLObject var33;
                for (var32 = var30, var33 = (SubLObject)module0413.NIL, var33 = var32.first(); module0413.NIL == var31 && module0413.NIL != var32; var31 = module0211.f13667(var33, var29), var32 = var32.rest(), var33 = var32.first()) {}
            }
            if (module0413.NIL == var31) {
                var27 = (SubLObject)ConsesLow.cons(var29, var27);
            }
        }
        module0066.f4842(var28);
        return var27;
    }
    
    public static SubLObject f28855(final SubLObject var97) {
        final SubLObject var98 = module0067.f4885(module0413.$g3372$.getGlobalValue(), var97, (SubLObject)module0413.ZERO_INTEGER);
        return f28852(var97, var98);
    }
    
    public static SubLObject f28852(final SubLObject var97, final SubLObject var52) {
        final SubLObject var98 = module0067.f4884(f28845(), var97, (SubLObject)module0413.ZERO_INTEGER);
        final SubLObject var99 = module0067.f4884(f28848(), var97, (SubLObject)module0413.NIL);
        final SubLObject var100 = module0067.f4884(f28846(), var97, (SubLObject)module0413.NIL);
        return (SubLObject)ConsesLow.listS((SubLObject)module0413.$ic358$, new SubLObject[] { var97, module0413.$ic359$, var52, module0413.$ic360$, conses_high.copy_list(var99), module0413.$ic361$, var98, (module0413.NIL != var100) ? ConsesLow.list((SubLObject)module0413.$ic362$, conses_high.copy_list(var100)) : module0413.NIL });
    }
    
    public static SubLObject f28856(final SubLObject var102) {
        SubLObject var103 = (SubLObject)module0413.ZERO_INTEGER;
        SubLObject var104 = (SubLObject)module0413.ZERO_INTEGER;
        SubLObject var105 = (SubLObject)module0413.ZERO_INTEGER;
        SubLObject var106 = (SubLObject)module0413.NIL;
        SubLObject var107 = (SubLObject)module0413.NIL;
        SubLObject var108 = (SubLObject)module0413.NIL;
        if (module0413.NIL == var102) {
            return (SubLObject)ConsesLow.list((SubLObject)module0413.$ic50$, var104, (SubLObject)module0413.$ic363$, var105, (SubLObject)module0413.$ic364$, var103);
        }
        SubLObject var109 = var102;
        SubLObject var110 = (SubLObject)module0413.NIL;
        var110 = var109.first();
        while (module0413.NIL != var109) {
            final SubLObject var112;
            final SubLObject var111 = var112 = var110;
            final SubLObject var113 = cdestructuring_bind.property_list_member((SubLObject)module0413.$ic359$, var112);
            final SubLObject var114 = (SubLObject)((module0413.NIL != var113) ? conses_high.cadr(var113) : module0413.NIL);
            final SubLObject var115 = cdestructuring_bind.property_list_member((SubLObject)module0413.$ic361$, var112);
            final SubLObject var116 = (SubLObject)((module0413.NIL != var115) ? conses_high.cadr(var115) : module0413.NIL);
            var103 = Numbers.add(var103, (SubLObject)module0413.ONE_INTEGER);
            var104 = Numbers.add(var104, var114);
            var105 = Numbers.add(var105, var116);
            var106 = (SubLObject)ConsesLow.cons(var114, var106);
            var107 = (SubLObject)ConsesLow.cons(var116, var107);
            if (var116.isPositive()) {
                var108 = (SubLObject)ConsesLow.cons(Numbers.divide(var114, var116), var108);
            }
            var109 = var109.rest();
            var110 = var109.first();
        }
        final SubLObject var117 = Numbers.divide(var105, var103);
        final SubLObject var118 = module0048.f3400(var107);
        final SubLObject var119 = Numbers.divide(var104, var103);
        final SubLObject var120 = module0048.f3400(var106);
        final SubLObject var121 = Numbers.divide(var104, var105);
        final SubLObject var122 = module0048.f3400(var108);
        final SubLObject var123 = (SubLObject)ConsesLow.list(new SubLObject[] { module0413.$ic50$, var104, module0413.$ic363$, var105, module0413.$ic364$, var103, module0413.$ic365$, var117, module0413.$ic366$, var118, module0413.$ic367$, var119, module0413.$ic368$, var120, module0413.$ic369$, var121, module0413.$ic370$, var122 });
        return var123;
    }
    
    public static SubLObject f28857(SubLObject var83, SubLObject var3) {
        if (var83 == module0413.UNPROVIDED) {
            var83 = (SubLObject)module0413.NIL;
        }
        if (var3 == module0413.UNPROVIDED) {
            var3 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var84 = f28851(var83);
        SubLObject var85 = (SubLObject)module0413.ZERO_INTEGER;
        SubLObject var86 = var84;
        SubLObject var87 = (SubLObject)module0413.NIL;
        var87 = var86.first();
        while (module0413.NIL != var86) {
            final SubLObject var89;
            final SubLObject var88 = var89 = var87;
            SubLObject var90 = (SubLObject)module0413.NIL;
            SubLObject var91 = var89;
            SubLObject var92 = (SubLObject)module0413.NIL;
            SubLObject var135_136 = (SubLObject)module0413.NIL;
            while (module0413.NIL != var91) {
                cdestructuring_bind.destructuring_bind_must_consp(var91, var88, (SubLObject)module0413.$ic371$);
                var135_136 = var91.first();
                var91 = var91.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var91, var88, (SubLObject)module0413.$ic371$);
                if (module0413.NIL == conses_high.member(var135_136, (SubLObject)module0413.$ic372$, (SubLObject)module0413.UNPROVIDED, (SubLObject)module0413.UNPROVIDED)) {
                    var92 = (SubLObject)module0413.T;
                }
                if (var135_136 == module0413.$ic336$) {
                    var90 = var91.first();
                }
                var91 = var91.rest();
            }
            if (module0413.NIL != var92 && module0413.NIL == var90) {
                cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)module0413.$ic371$);
            }
            final SubLObject var93 = cdestructuring_bind.property_list_member((SubLObject)module0413.$ic358$, var89);
            final SubLObject var94 = (SubLObject)((module0413.NIL != var93) ? conses_high.cadr(var93) : module0413.NIL);
            final SubLObject var95 = cdestructuring_bind.property_list_member((SubLObject)module0413.$ic359$, var89);
            final SubLObject var96 = (SubLObject)((module0413.NIL != var95) ? conses_high.cadr(var95) : module0413.NIL);
            final SubLObject var97 = cdestructuring_bind.property_list_member((SubLObject)module0413.$ic360$, var89);
            final SubLObject var98 = (SubLObject)((module0413.NIL != var97) ? conses_high.cadr(var97) : module0413.NIL);
            final SubLObject var99 = cdestructuring_bind.property_list_member((SubLObject)module0413.$ic361$, var89);
            final SubLObject var100 = (SubLObject)((module0413.NIL != var99) ? conses_high.cadr(var99) : module0413.NIL);
            final SubLObject var101 = cdestructuring_bind.property_list_member((SubLObject)module0413.$ic362$, var89);
            final SubLObject var102 = (SubLObject)((module0413.NIL != var101) ? conses_high.cadr(var101) : module0413.NIL);
            var85 = Numbers.add(var85, var96);
            PrintLow.format(var3, (SubLObject)module0413.$ic373$, new SubLObject[] { var96, var100, var94, module0174.f11025(var94) });
            if (module0413.NIL != var98) {
                PrintLow.format(var3, (SubLObject)module0413.$ic374$, var98);
            }
            if (module0413.NIL != var102) {
                PrintLow.format(var3, (SubLObject)module0413.$ic374$, var102);
            }
            var86 = var86.rest();
            var87 = var86.first();
        }
        return var85;
    }
    
    public static SubLObject f28858(final SubLObject var142, final SubLObject var143, SubLObject var83, SubLObject var72) {
        if (var83 == module0413.UNPROVIDED) {
            var83 = (SubLObject)module0413.NIL;
        }
        if (var72 == module0413.UNPROVIDED) {
            var72 = (SubLObject)module0413.NIL;
        }
        final SubLThread var144 = SubLProcess.currentSubLThread();
        f28849();
        final SubLObject var145 = module0413.$g3371$.currentBinding(var144);
        final SubLObject var146 = module0018.$g631$.currentBinding(var144);
        try {
            module0413.$g3371$.bind((SubLObject)module0413.T, var144);
            module0018.$g631$.bind(var72, var144);
            module0540.f33518(var142, var143);
            module0540.f33516(var142, var143, (SubLObject)module0413.UNPROVIDED);
            f28857(var83, (SubLObject)module0413.UNPROVIDED);
            f28847();
        }
        finally {
            module0018.$g631$.rebind(var146, var144);
            module0413.$g3371$.rebind(var145, var144);
        }
        return (SubLObject)module0413.NIL;
    }
    
    public static SubLObject f28859() {
        module0413.$g3336$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3337$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3338$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3339$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3341$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3342$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3343$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3344$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3345$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3346$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3347$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3348$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3349$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3350$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3351$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3352$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3353$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3354$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3355$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3358$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3359$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3360$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3361$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3362$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3356$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3357$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3363$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3364$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3365$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3366$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        module0413.$g3367$.setGlobalValue((SubLObject)module0413.ZERO_INTEGER);
        return (SubLObject)module0413.NIL;
    }
    
    public static SubLObject f28860(SubLObject var3) {
        if (var3 == module0413.UNPROVIDED) {
            var3 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = reader.$read_default_float_format$.currentBinding(var4);
        try {
            reader.$read_default_float_format$.bind((SubLObject)module0413.$ic375$, var4);
            SubLObject var6 = f28809();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)module0413.$ic376$, var6);
            SubLObject var7 = f28813();
            PrintLow.format(var3, (SubLObject)module0413.$ic377$, var7);
            f28861(var7, var6, (SubLObject)module0413.THREE_INTEGER, (SubLObject)module0413.UNPROVIDED);
            SubLObject var8 = f28816();
            PrintLow.format(var3, (SubLObject)module0413.$ic378$, var8);
            f28861(var8, var6, (SubLObject)module0413.THREE_INTEGER, (SubLObject)module0413.UNPROVIDED);
            SubLObject var9 = f28814();
            PrintLow.format(var3, (SubLObject)module0413.$ic379$, var9);
            f28861(var9, var6, (SubLObject)module0413.THREE_INTEGER, (SubLObject)module0413.UNPROVIDED);
            var8 = f28817();
            PrintLow.format(var3, (SubLObject)module0413.$ic380$, var8);
            f28861(var8, var6, (SubLObject)module0413.THREE_INTEGER, (SubLObject)module0413.UNPROVIDED);
            PrintLow.format(var3, (SubLObject)module0413.$ic381$, module0048.f3302(f28819(), (SubLObject)module0413.FOUR_INTEGER));
            var6 = f28747();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)module0413.$ic382$, var6);
            var7 = f28749();
            PrintLow.format(var3, (SubLObject)module0413.$ic383$, var7);
            f28861(var7, var6, (SubLObject)module0413.TWO_INTEGER, (SubLObject)module0413.UNPROVIDED);
            var9 = f28750();
            PrintLow.format(var3, (SubLObject)module0413.$ic379$, var9);
            f28861(var9, var6, (SubLObject)module0413.TWO_INTEGER, (SubLObject)module0413.UNPROVIDED);
            PrintLow.format(var3, (SubLObject)module0413.$ic384$, f28752());
            PrintLow.format(var3, (SubLObject)module0413.$ic385$, module0048.f3302(f28754(), (SubLObject)module0413.THREE_INTEGER));
            PrintLow.format(var3, (SubLObject)module0413.$ic386$, f28756());
            PrintLow.format(var3, (SubLObject)module0413.$ic387$, module0048.f3302(f28758(), (SubLObject)module0413.THREE_INTEGER));
            var6 = f28755();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)module0413.$ic388$, var6);
            final SubLObject var10 = f28761();
            PrintLow.format(var3, (SubLObject)module0413.$ic389$, var10);
            f28861(var10, var6, (SubLObject)module0413.TWO_INTEGER, (SubLObject)module0413.UNPROVIDED);
            final SubLObject var11 = f28764();
            PrintLow.format(var3, (SubLObject)module0413.$ic390$, var11);
            f28861(var11, var6, (SubLObject)module0413.TWO_INTEGER, (SubLObject)module0413.UNPROVIDED);
            var7 = f28759();
            PrintLow.format(var3, (SubLObject)module0413.$ic391$, var7);
            f28861(var7, var6, (SubLObject)module0413.TWO_INTEGER, (SubLObject)module0413.UNPROVIDED);
            PrintLow.format(var3, (SubLObject)module0413.$ic392$, f28781());
            PrintLow.format(var3, (SubLObject)module0413.$ic393$, module0048.f3302(f28782(), (SubLObject)module0413.THREE_INTEGER));
            var6 = f28770();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)module0413.$ic394$, var6);
            final SubLObject var12 = f28771();
            PrintLow.format(var3, (SubLObject)module0413.$ic395$, var12);
            f28861(var12, var6, (SubLObject)module0413.THREE_INTEGER, (SubLObject)module0413.UNPROVIDED);
            final SubLObject var13 = f28772();
            PrintLow.format(var3, (SubLObject)module0413.$ic396$, var13);
            f28861(var13, var6, (SubLObject)module0413.THREE_INTEGER, (SubLObject)module0413.UNPROVIDED);
            final SubLObject var14 = f28773();
            PrintLow.format(var3, (SubLObject)module0413.$ic397$, var14);
            f28861(var14, var6, (SubLObject)module0413.THREE_INTEGER, (SubLObject)module0413.UNPROVIDED);
            final SubLObject var15 = f28774();
            PrintLow.format(var3, (SubLObject)module0413.$ic398$, var15);
            f28861(var15, var6, (SubLObject)module0413.THREE_INTEGER, (SubLObject)module0413.UNPROVIDED);
            var6 = f28787();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)module0413.$ic399$, var6);
            final SubLObject var16 = f28789();
            PrintLow.format(var3, (SubLObject)module0413.$ic400$, var16);
            f28861(var16, var6, (SubLObject)module0413.TWO_INTEGER, (SubLObject)module0413.UNPROVIDED);
            final SubLObject var17 = f28791();
            PrintLow.format(var3, (SubLObject)module0413.$ic401$, var17);
            f28861(var17, var6, (SubLObject)module0413.TWO_INTEGER, (SubLObject)module0413.UNPROVIDED);
            var6 = f28797();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)module0413.$ic402$, var6);
            SubLObject var18 = f28799();
            PrintLow.format(var3, (SubLObject)module0413.$ic403$, var18);
            f28861(var18, var6, (SubLObject)module0413.THREE_INTEGER, (SubLObject)module0413.UNPROVIDED);
            var6 = f28801();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)module0413.$ic404$, var6);
            var18 = f28803();
            PrintLow.format(var3, (SubLObject)module0413.$ic403$, var18);
            f28861(var18, var6, (SubLObject)module0413.THREE_INTEGER, (SubLObject)module0413.UNPROVIDED);
            var6 = f28793();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)module0413.$ic405$, var6);
            var18 = f28795();
            PrintLow.format(var3, (SubLObject)module0413.$ic406$, var18);
            f28861(var18, var6, (SubLObject)module0413.TWO_INTEGER, (SubLObject)module0413.UNPROVIDED);
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)module0413.$ic407$, f28807());
            streams_high.terpri(var3);
        }
        finally {
            reader.$read_default_float_format$.rebind(var5, var4);
        }
        return (SubLObject)module0413.NIL;
    }
    
    public static SubLObject f28861(final SubLObject var157, final SubLObject var158, final SubLObject var159, SubLObject var3) {
        if (var3 == module0413.UNPROVIDED) {
            var3 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (!var158.isZero()) {
            final SubLObject var160 = module0048.f3302(Numbers.multiply((SubLObject)module0413.$ic408$, Numbers.divide(var157, var158)), var159);
            if (var159.eql((SubLObject)module0413.TWO_INTEGER)) {
                PrintLow.format(var3, (SubLObject)module0413.$ic409$, var160);
            }
            else if (var159.eql((SubLObject)module0413.THREE_INTEGER)) {
                PrintLow.format(var3, (SubLObject)module0413.$ic410$, var160);
            }
            else {
                PrintLow.format(var3, (SubLObject)module0413.$ic411$, var160);
            }
        }
        return (SubLObject)module0413.NIL;
    }
    
    public static SubLObject f28862() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28721", "S#31874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28722", "S#31875", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28724", "S#31867", 1, 0, false);
        new $f28724$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28725", "S#31876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28726", "S#31877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28727", "S#31878", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28728", "S#31879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28729", "S#31880", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28730", "S#31881", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28731", "S#31882", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28732", "S#31883", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28733", "S#31884", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28734", "S#31885", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28735", "S#31886", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28723", "S#31887", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28736", "S#31888", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28737", "S#31889", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28738", "S#31890", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28739", "S#31891", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28740", "S#31892", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28741", "S#28217", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28742", "S#31893", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28743", "S#31894", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28744", "S#28216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28745", "S#26479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28746", "S#26481", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28747", "S#31895", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28748", "S#26783", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28749", "S#31896", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28750", "S#31897", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28751", "S#31898", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28752", "S#31899", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28753", "S#26784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28754", "S#31900", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28756", "S#31901", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28757", "S#31902", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28758", "S#31903", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28760", "S#27333", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28755", "S#31904", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28761", "S#31905", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28762", "S#29295", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28763", "S#29294", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28764", "S#31906", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28765", "S#29296", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28759", "S#31907", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28766", "S#31908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28767", "S#31909", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28768", "S#31910", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28769", "S#27334", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28770", "S#31911", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28771", "S#31912", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28772", "S#31913", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28773", "S#31914", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28774", "S#31915", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28775", "S#27587", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28776", "S#31916", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28777", "S#27385", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28778", "S#31917", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28779", "S#31918", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28780", "S#27386", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28781", "S#31919", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28782", "S#31920", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28783", "S#31921", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28784", "S#31922", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28785", "S#31923", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28786", "S#31924", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28787", "S#31925", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28788", "S#27713", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28789", "S#31926", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28790", "S#27715", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28791", "S#31927", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28792", "S#27716", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28793", "S#31928", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28794", "S#18174", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28795", "S#31929", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28796", "S#18175", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28797", "S#31930", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28798", "S#20163", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28799", "S#31931", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28800", "S#20164", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28801", "S#31932", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28802", "S#18980", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28803", "S#31933", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28804", "S#18981", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28805", "S#31934", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28806", "S#31935", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28807", "S#31936", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28808", "S#27813", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28809", "S#31937", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28810", "S#28198", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28811", "S#31938", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28812", "S#28212", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28813", "S#31939", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28814", "S#31940", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28815", "S#31941", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28816", "S#31942", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28817", "S#31943", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28818", "S#31944", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28819", "S#31945", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28820", "S#31946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28821", "S#31947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28822", "S#31948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28823", "S#31949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28824", "S#31950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28825", "S#30565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28826", "S#31951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28827", "S#31952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28828", "S#31953", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28829", "S#29319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28830", "S#25427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28831", "S#31954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28832", "S#31955", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28833", "S#31956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28834", "S#31957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28836", "S#31958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28835", "S#31959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28837", "S#31960", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28838", "S#29210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28840", "S#31961", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28839", "S#29209", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0413", "f28841", "S#31962");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0413", "f28842", "S#31963");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0413", "f28843", "S#31964");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28844", "S#31965", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28845", "S#31966", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28846", "S#31967", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28847", "S#31968", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28848", "S#31969", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28849", "S#31970", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28850", "S#31971", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28851", "S#31972", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28853", "S#31973", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28854", "S#31974", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28855", "S#31975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28852", "S#31976", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28856", "S#31977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28857", "S#31978", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28858", "S#31979", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28859", "S#31980", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28860", "S#31981", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0413", "f28861", "S#31982", 3, 1, false);
        return (SubLObject)module0413.NIL;
    }
    
    public static SubLObject f28863() {
        module0413.$g3333$ = SubLFiles.defconstant("S#31983", (SubLObject)module0413.$ic1$);
        module0413.$g3334$ = SubLFiles.deflexical("S#31984", (module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic38$)) ? module0413.$g3334$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0413.EQ), (SubLObject)module0413.UNPROVIDED));
        module0413.$g3335$ = SubLFiles.deflexical("S#31985", (SubLObject)module0413.$ic39$);
        module0413.$g3336$ = SubLFiles.deflexical("S#31986", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic282$)) ? module0413.$g3336$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3337$ = SubLFiles.deflexical("S#31987", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic283$)) ? module0413.$g3337$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3338$ = SubLFiles.deflexical("S#31988", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic284$)) ? module0413.$g3338$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3339$ = SubLFiles.deflexical("S#31989", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic285$)) ? module0413.$g3339$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3340$ = SubLFiles.defvar("S#31990", (SubLObject)module0413.$ic286$);
        module0413.$g3341$ = SubLFiles.deflexical("S#31991", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic288$)) ? module0413.$g3341$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3342$ = SubLFiles.deflexical("S#31992", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic289$)) ? module0413.$g3342$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3343$ = SubLFiles.deflexical("S#31993", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic290$)) ? module0413.$g3343$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3344$ = SubLFiles.deflexical("S#31994", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic291$)) ? module0413.$g3344$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3345$ = SubLFiles.deflexical("S#31995", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic292$)) ? module0413.$g3345$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3346$ = SubLFiles.deflexical("S#31996", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic293$)) ? module0413.$g3346$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3347$ = SubLFiles.deflexical("S#31997", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic294$)) ? module0413.$g3347$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3348$ = SubLFiles.deflexical("S#31998", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic295$)) ? module0413.$g3348$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3349$ = SubLFiles.deflexical("S#31999", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic296$)) ? module0413.$g3349$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3350$ = SubLFiles.deflexical("S#32000", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic297$)) ? module0413.$g3350$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3351$ = SubLFiles.deflexical("S#32001", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic301$)) ? module0413.$g3351$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3352$ = SubLFiles.deflexical("S#32002", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic302$)) ? module0413.$g3352$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3353$ = SubLFiles.deflexical("S#32003", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic303$)) ? module0413.$g3353$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3354$ = SubLFiles.deflexical("S#32004", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic304$)) ? module0413.$g3354$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3355$ = SubLFiles.deflexical("S#32005", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic305$)) ? module0413.$g3355$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3356$ = SubLFiles.deflexical("S#32006", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic306$)) ? module0413.$g3356$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3357$ = SubLFiles.deflexical("S#32007", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic307$)) ? module0413.$g3357$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3358$ = SubLFiles.deflexical("S#32008", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic308$)) ? module0413.$g3358$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3359$ = SubLFiles.deflexical("S#32009", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic309$)) ? module0413.$g3359$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3360$ = SubLFiles.deflexical("S#32010", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic310$)) ? module0413.$g3360$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3361$ = SubLFiles.deflexical("S#32011", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic311$)) ? module0413.$g3361$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3362$ = SubLFiles.deflexical("S#32012", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic312$)) ? module0413.$g3362$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3363$ = SubLFiles.deflexical("S#32013", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic313$)) ? module0413.$g3363$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3364$ = SubLFiles.deflexical("S#32014", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic314$)) ? module0413.$g3364$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3365$ = SubLFiles.deflexical("S#32015", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic315$)) ? module0413.$g3365$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3366$ = SubLFiles.deflexical("S#32016", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic316$)) ? module0413.$g3366$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3367$ = SubLFiles.deflexical("S#32017", (SubLObject)((module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic317$)) ? module0413.$g3367$.getGlobalValue() : module0413.ZERO_INTEGER));
        module0413.$g3368$ = SubLFiles.defparameter("S#32018", (SubLObject)module0413.NIL);
        module0413.$g3369$ = SubLFiles.defparameter("S#32019", (SubLObject)module0413.NIL);
        module0413.$g3370$ = SubLFiles.defparameter("S#32020", (SubLObject)module0413.NIL);
        module0413.$g3371$ = SubLFiles.defvar("S#32021", (SubLObject)module0413.NIL);
        module0413.$g3372$ = SubLFiles.deflexical("S#32022", (module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic350$)) ? module0413.$g3372$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0413.EQ), (SubLObject)module0413.UNPROVIDED));
        module0413.$g3373$ = SubLFiles.deflexical("S#32023", (module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic351$)) ? module0413.$g3373$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0413.EQ), (SubLObject)module0413.UNPROVIDED));
        module0413.$g3374$ = SubLFiles.deflexical("S#32024", (module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic352$)) ? module0413.$g3374$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0413.EQ), (SubLObject)module0413.UNPROVIDED));
        module0413.$g3375$ = SubLFiles.deflexical("S#32025", (module0413.NIL != Symbols.boundp((SubLObject)module0413.$ic354$)) ? module0413.$g3375$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0413.EQ), (SubLObject)module0413.UNPROVIDED));
        return (SubLObject)module0413.NIL;
    }
    
    public static SubLObject f28864() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0413.$g3333$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0413.$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0413.$ic9$);
        Structures.def_csetf((SubLObject)module0413.$ic10$, (SubLObject)module0413.$ic11$);
        Structures.def_csetf((SubLObject)module0413.$ic12$, (SubLObject)module0413.$ic13$);
        Structures.def_csetf((SubLObject)module0413.$ic14$, (SubLObject)module0413.$ic15$);
        Structures.def_csetf((SubLObject)module0413.$ic16$, (SubLObject)module0413.$ic17$);
        Equality.identity((SubLObject)module0413.$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0413.$g3333$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0413.$ic27$));
        module0012.f419((SubLObject)module0413.$ic7$);
        module0003.f57((SubLObject)module0413.$ic38$);
        f28743((SubLObject)module0413.$ic40$, (SubLObject)module0413.$ic41$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic42$, (SubLObject)module0413.$ic43$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic44$, (SubLObject)module0413.$ic45$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic46$, (SubLObject)module0413.$ic47$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic48$, (SubLObject)module0413.$ic49$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic50$, (SubLObject)module0413.$ic51$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic52$, (SubLObject)module0413.$ic53$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic54$, (SubLObject)module0413.$ic55$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic56$, (SubLObject)module0413.$ic57$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic58$, (SubLObject)module0413.$ic59$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic60$, (SubLObject)module0413.$ic61$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic62$, (SubLObject)module0413.$ic63$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic64$, (SubLObject)module0413.$ic65$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic66$, (SubLObject)module0413.$ic67$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic68$, (SubLObject)module0413.$ic67$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic69$, (SubLObject)module0413.$ic70$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic71$, (SubLObject)module0413.$ic70$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic72$, (SubLObject)module0413.$ic73$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic74$, (SubLObject)module0413.$ic75$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic76$, (SubLObject)module0413.$ic77$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic78$, (SubLObject)module0413.$ic79$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic80$, (SubLObject)module0413.$ic81$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic82$, (SubLObject)module0413.$ic83$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic84$, (SubLObject)module0413.$ic85$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic86$, (SubLObject)module0413.$ic87$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic88$, (SubLObject)module0413.$ic89$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic90$, (SubLObject)module0413.$ic91$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic92$, (SubLObject)module0413.$ic93$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic94$, (SubLObject)module0413.$ic95$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic96$, (SubLObject)module0413.$ic97$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic98$, (SubLObject)module0413.$ic99$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic100$, (SubLObject)module0413.$ic101$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic102$, (SubLObject)module0413.$ic103$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic104$, (SubLObject)module0413.$ic105$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic106$, (SubLObject)module0413.$ic107$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic108$, (SubLObject)module0413.$ic109$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic110$, (SubLObject)module0413.$ic111$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic112$, (SubLObject)module0413.$ic113$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic114$, (SubLObject)module0413.$ic115$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic116$, (SubLObject)module0413.$ic117$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic118$, (SubLObject)module0413.$ic119$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic120$, (SubLObject)module0413.$ic121$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic122$, (SubLObject)module0413.$ic123$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic124$, (SubLObject)module0413.$ic125$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic126$, (SubLObject)module0413.$ic127$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic128$, (SubLObject)module0413.$ic129$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic130$, (SubLObject)module0413.$ic131$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic132$, (SubLObject)module0413.$ic133$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic134$, (SubLObject)module0413.$ic135$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic136$, (SubLObject)module0413.$ic137$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic138$, (SubLObject)module0413.$ic139$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic140$, (SubLObject)module0413.$ic141$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic142$, (SubLObject)module0413.$ic143$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic144$, (SubLObject)module0413.$ic145$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic146$, (SubLObject)module0413.$ic147$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic148$, (SubLObject)module0413.$ic149$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic150$, (SubLObject)module0413.$ic151$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic152$, (SubLObject)module0413.$ic153$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic154$, (SubLObject)module0413.$ic155$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic156$, (SubLObject)module0413.$ic157$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic158$, (SubLObject)module0413.$ic159$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.UNPROVIDED);
        f28743((SubLObject)module0413.$ic160$, (SubLObject)module0413.$ic161$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic162$, (SubLObject)module0413.$ic163$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic164$, (SubLObject)module0413.$ic165$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic166$, (SubLObject)module0413.$ic167$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic168$, (SubLObject)module0413.$ic169$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic170$, (SubLObject)module0413.$ic171$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic172$, (SubLObject)module0413.$ic173$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic174$, (SubLObject)module0413.$ic175$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic176$, (SubLObject)module0413.$ic177$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic178$, (SubLObject)module0413.$ic179$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic180$, (SubLObject)module0413.$ic181$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic182$, (SubLObject)module0413.$ic183$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic184$, (SubLObject)module0413.$ic185$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic186$, (SubLObject)module0413.$ic187$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic188$, (SubLObject)module0413.$ic189$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic190$, (SubLObject)module0413.$ic191$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic192$, (SubLObject)module0413.$ic193$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic194$, (SubLObject)module0413.$ic195$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic196$, (SubLObject)module0413.$ic197$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic198$, (SubLObject)module0413.$ic199$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic200$, (SubLObject)module0413.$ic201$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic202$, (SubLObject)module0413.$ic203$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic204$, (SubLObject)module0413.$ic205$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic206$, (SubLObject)module0413.$ic207$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic208$, (SubLObject)module0413.$ic209$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic210$, (SubLObject)module0413.$ic211$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic212$, (SubLObject)module0413.$ic213$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic214$, (SubLObject)module0413.$ic215$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic216$, (SubLObject)module0413.$ic217$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic218$, (SubLObject)module0413.$ic219$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic220$, (SubLObject)module0413.$ic221$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic222$, (SubLObject)module0413.$ic223$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic224$, (SubLObject)module0413.$ic225$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic226$, (SubLObject)module0413.$ic227$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic228$, (SubLObject)module0413.$ic229$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic230$, (SubLObject)module0413.$ic231$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic232$, (SubLObject)module0413.$ic233$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic234$, (SubLObject)module0413.$ic235$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic236$, (SubLObject)module0413.$ic237$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic238$, (SubLObject)module0413.$ic239$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic240$, (SubLObject)module0413.$ic241$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic242$, (SubLObject)module0413.$ic243$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic244$, (SubLObject)module0413.$ic245$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic246$, (SubLObject)module0413.$ic247$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic248$, (SubLObject)module0413.$ic249$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic250$, (SubLObject)module0413.$ic251$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic252$, (SubLObject)module0413.$ic253$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic254$, (SubLObject)module0413.$ic255$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic256$, (SubLObject)module0413.$ic257$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic258$, (SubLObject)module0413.$ic259$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic260$, (SubLObject)module0413.$ic261$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic262$, (SubLObject)module0413.$ic263$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic264$, (SubLObject)module0413.$ic265$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic266$, (SubLObject)module0413.$ic267$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic268$, (SubLObject)module0413.$ic269$, (SubLObject)module0413.$ic35$, (SubLObject)module0413.T);
        f28743((SubLObject)module0413.$ic270$, (SubLObject)module0413.$ic271$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.NIL);
        f28743((SubLObject)module0413.$ic272$, (SubLObject)module0413.$ic273$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.NIL);
        f28743((SubLObject)module0413.$ic274$, (SubLObject)module0413.$ic275$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.NIL);
        f28743((SubLObject)module0413.$ic276$, (SubLObject)module0413.$ic277$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.NIL);
        f28743((SubLObject)module0413.$ic278$, (SubLObject)module0413.$ic279$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.NIL);
        f28743((SubLObject)module0413.$ic280$, (SubLObject)module0413.$ic281$, (SubLObject)module0413.$ic36$, (SubLObject)module0413.NIL);
        module0003.f57((SubLObject)module0413.$ic282$);
        module0003.f57((SubLObject)module0413.$ic283$);
        module0003.f57((SubLObject)module0413.$ic284$);
        module0003.f57((SubLObject)module0413.$ic285$);
        module0003.f57((SubLObject)module0413.$ic288$);
        module0003.f57((SubLObject)module0413.$ic289$);
        module0003.f57((SubLObject)module0413.$ic290$);
        module0003.f57((SubLObject)module0413.$ic291$);
        module0003.f57((SubLObject)module0413.$ic292$);
        module0003.f57((SubLObject)module0413.$ic293$);
        module0003.f57((SubLObject)module0413.$ic294$);
        module0003.f57((SubLObject)module0413.$ic295$);
        module0003.f57((SubLObject)module0413.$ic296$);
        module0003.f57((SubLObject)module0413.$ic297$);
        module0003.f57((SubLObject)module0413.$ic301$);
        module0003.f57((SubLObject)module0413.$ic302$);
        module0003.f57((SubLObject)module0413.$ic303$);
        module0003.f57((SubLObject)module0413.$ic304$);
        module0003.f57((SubLObject)module0413.$ic305$);
        module0003.f57((SubLObject)module0413.$ic306$);
        module0003.f57((SubLObject)module0413.$ic307$);
        module0003.f57((SubLObject)module0413.$ic308$);
        module0003.f57((SubLObject)module0413.$ic309$);
        module0003.f57((SubLObject)module0413.$ic310$);
        module0003.f57((SubLObject)module0413.$ic311$);
        module0003.f57((SubLObject)module0413.$ic312$);
        module0003.f57((SubLObject)module0413.$ic313$);
        module0003.f57((SubLObject)module0413.$ic314$);
        module0003.f57((SubLObject)module0413.$ic315$);
        module0003.f57((SubLObject)module0413.$ic316$);
        module0003.f57((SubLObject)module0413.$ic317$);
        module0012.f419((SubLObject)module0413.$ic271$);
        module0012.f419((SubLObject)module0413.$ic273$);
        module0012.f419((SubLObject)module0413.$ic275$);
        module0034.f1895((SubLObject)module0413.$ic321$);
        module0034.f1895((SubLObject)module0413.$ic325$);
        module0034.f1895((SubLObject)module0413.$ic333$);
        module0003.f57((SubLObject)module0413.$ic350$);
        module0003.f57((SubLObject)module0413.$ic351$);
        module0003.f57((SubLObject)module0413.$ic352$);
        module0003.f57((SubLObject)module0413.$ic354$);
        return (SubLObject)module0413.NIL;
    }
    
    public void declareFunctions() {
        f28862();
    }
    
    public void initializeVariables() {
        f28863();
    }
    
    public void runTopLevelForms() {
        f28864();
    }
    
    static {
        me = (SubLFile)new module0413();
        module0413.$g3333$ = null;
        module0413.$g3334$ = null;
        module0413.$g3335$ = null;
        module0413.$g3336$ = null;
        module0413.$g3337$ = null;
        module0413.$g3338$ = null;
        module0413.$g3339$ = null;
        module0413.$g3340$ = null;
        module0413.$g3341$ = null;
        module0413.$g3342$ = null;
        module0413.$g3343$ = null;
        module0413.$g3344$ = null;
        module0413.$g3345$ = null;
        module0413.$g3346$ = null;
        module0413.$g3347$ = null;
        module0413.$g3348$ = null;
        module0413.$g3349$ = null;
        module0413.$g3350$ = null;
        module0413.$g3351$ = null;
        module0413.$g3352$ = null;
        module0413.$g3353$ = null;
        module0413.$g3354$ = null;
        module0413.$g3355$ = null;
        module0413.$g3356$ = null;
        module0413.$g3357$ = null;
        module0413.$g3358$ = null;
        module0413.$g3359$ = null;
        module0413.$g3360$ = null;
        module0413.$g3361$ = null;
        module0413.$g3362$ = null;
        module0413.$g3363$ = null;
        module0413.$g3364$ = null;
        module0413.$g3365$ = null;
        module0413.$g3366$ = null;
        module0413.$g3367$ = null;
        module0413.$g3368$ = null;
        module0413.$g3369$ = null;
        module0413.$g3370$ = null;
        module0413.$g3371$ = null;
        module0413.$g3372$ = null;
        module0413.$g3373$ = null;
        module0413.$g3374$ = null;
        module0413.$g3375$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STORE"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE"));
        $ic1$ = SubLObjectFactory.makeSymbol("S#31866", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#31867", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32026", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32027", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32028", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("EVALUATION-FUNC"), (SubLObject)SubLObjectFactory.makeKeyword("EVALUATION-ARG1"), (SubLObject)SubLObjectFactory.makeKeyword("CROSS-PRODUCT?"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31876", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31877", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31878", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31879", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31880", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31881", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31882", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31883", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#31887", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#31875", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#31867", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#31876", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#31880", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#31877", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#31881", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#31878", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#31882", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#31879", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#31883", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("NAME");
        $ic19$ = SubLObjectFactory.makeKeyword("EVALUATION-FUNC");
        $ic20$ = SubLObjectFactory.makeKeyword("EVALUATION-ARG1");
        $ic21$ = SubLObjectFactory.makeKeyword("CROSS-PRODUCT?");
        $ic22$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic23$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic24$ = SubLObjectFactory.makeSymbol("S#31884", "CYC");
        $ic25$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic26$ = SubLObjectFactory.makeKeyword("END");
        $ic27$ = SubLObjectFactory.makeSymbol("S#31886", "CYC");
        $ic28$ = SubLObjectFactory.makeString("<INFERENCE-METRIC: ~s>");
        $ic29$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic30$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic31$ = SubLObjectFactory.makeSymbol("S#31874", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic33$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic34$ = SubLObjectFactory.makeSymbol("S#26782", "CYC");
        $ic35$ = SubLObjectFactory.makeKeyword("STORE");
        $ic36$ = SubLObjectFactory.makeKeyword("INFERENCE");
        $ic37$ = SubLObjectFactory.makeString("Unhandled inference metric evaluation arg1 spec ~s");
        $ic38$ = SubLObjectFactory.makeSymbol("S#31984", "CYC");
        $ic39$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EVALUATION-FUNC"), (SubLObject)SubLObjectFactory.makeKeyword("EVALUATION-ARG1"), (SubLObject)SubLObjectFactory.makeKeyword("CROSS-PRODUCT?"));
        $ic40$ = SubLObjectFactory.makeKeyword("ANSWER-COUNT");
        $ic41$ = SubLObjectFactory.makeSymbol("S#28575", "CYC");
        $ic42$ = SubLObjectFactory.makeKeyword("ANSWER-COUNT-AT-30-SECONDS");
        $ic43$ = SubLObjectFactory.makeSymbol("S#28548", "CYC");
        $ic44$ = SubLObjectFactory.makeKeyword("ANSWER-COUNT-AT-60-SECONDS");
        $ic45$ = SubLObjectFactory.makeSymbol("S#28549", "CYC");
        $ic46$ = SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER");
        $ic47$ = SubLObjectFactory.makeSymbol("S#28542", "CYC");
        $ic48$ = SubLObjectFactory.makeKeyword("TIME-TO-LAST-ANSWER");
        $ic49$ = SubLObjectFactory.makeSymbol("S#28544", "CYC");
        $ic50$ = SubLObjectFactory.makeKeyword("TOTAL-TIME");
        $ic51$ = SubLObjectFactory.makeSymbol("S#28441", "CYC");
        $ic52$ = SubLObjectFactory.makeKeyword("TIME-PER-ANSWER");
        $ic53$ = SubLObjectFactory.makeSymbol("S#28711", "CYC");
        $ic54$ = SubLObjectFactory.makeKeyword("STEPS-TO-FIRST-ANSWER");
        $ic55$ = SubLObjectFactory.makeSymbol("S#28543", "CYC");
        $ic56$ = SubLObjectFactory.makeKeyword("STEPS-TO-LAST-ANSWER");
        $ic57$ = SubLObjectFactory.makeSymbol("S#28545", "CYC");
        $ic58$ = SubLObjectFactory.makeKeyword("TOTAL-STEPS");
        $ic59$ = SubLObjectFactory.makeSymbol("S#28443", "CYC");
        $ic60$ = SubLObjectFactory.makeKeyword("STEPS-PER-ANSWER");
        $ic61$ = SubLObjectFactory.makeSymbol("S#28712", "CYC");
        $ic62$ = SubLObjectFactory.makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER");
        $ic63$ = SubLObjectFactory.makeSymbol("S#28713", "CYC");
        $ic64$ = SubLObjectFactory.makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");
        $ic65$ = SubLObjectFactory.makeSymbol("S#28714", "CYC");
        $ic66$ = SubLObjectFactory.makeKeyword("PROBLEM-COUNT");
        $ic67$ = SubLObjectFactory.makeSymbol("S#27029", "CYC");
        $ic68$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE-PROBLEM-COUNT");
        $ic69$ = SubLObjectFactory.makeKeyword("PROOF-COUNT");
        $ic70$ = SubLObjectFactory.makeSymbol("S#27116", "CYC");
        $ic71$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE-PROOF-COUNT");
        $ic72$ = SubLObjectFactory.makeKeyword("LINK-COUNT");
        $ic73$ = SubLObjectFactory.makeSymbol("S#27014", "CYC");
        $ic74$ = SubLObjectFactory.makeKeyword("TACTIC-COUNT");
        $ic75$ = SubLObjectFactory.makeSymbol("S#27110", "CYC");
        $ic76$ = SubLObjectFactory.makeKeyword("POSSIBLE-TACTIC-COUNT");
        $ic77$ = SubLObjectFactory.makeSymbol("S#27113", "CYC");
        $ic78$ = SubLObjectFactory.makeKeyword("EXECUTED-TACTIC-COUNT");
        $ic79$ = SubLObjectFactory.makeSymbol("S#27114", "CYC");
        $ic80$ = SubLObjectFactory.makeKeyword("TACTIC-EXECUTION-COUNT");
        $ic81$ = SubLObjectFactory.makeSymbol("S#27796", "CYC");
        $ic82$ = SubLObjectFactory.makeKeyword("DISCARDED-TACTIC-COUNT");
        $ic83$ = SubLObjectFactory.makeSymbol("S#27115", "CYC");
        $ic84$ = SubLObjectFactory.makeKeyword("CONTENT-LINK-COUNT");
        $ic85$ = SubLObjectFactory.makeSymbol("S#27019", "CYC");
        $ic86$ = SubLObjectFactory.makeKeyword("REMOVAL-LINK-COUNT");
        $ic87$ = SubLObjectFactory.makeSymbol("S#27021", "CYC");
        $ic88$ = SubLObjectFactory.makeKeyword("REWRITE-LINK-COUNT");
        $ic89$ = SubLObjectFactory.makeSymbol("PROBLEM-STORE-REWRITE-LINK-COUNT");
        $ic90$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-LINK-COUNT");
        $ic91$ = SubLObjectFactory.makeSymbol("S#27023", "CYC");
        $ic92$ = SubLObjectFactory.makeKeyword("STRUCTURAL-LINK-COUNT");
        $ic93$ = SubLObjectFactory.makeSymbol("S#27024", "CYC");
        $ic94$ = SubLObjectFactory.makeKeyword("JOIN-ORDERED-LINK-COUNT");
        $ic95$ = SubLObjectFactory.makeSymbol("S#27025", "CYC");
        $ic96$ = SubLObjectFactory.makeKeyword("JOIN-LINK-COUNT");
        $ic97$ = SubLObjectFactory.makeSymbol("S#27026", "CYC");
        $ic98$ = SubLObjectFactory.makeKeyword("SPLIT-LINK-COUNT");
        $ic99$ = SubLObjectFactory.makeSymbol("S#27027", "CYC");
        $ic100$ = SubLObjectFactory.makeKeyword("RESTRICTION-LINK-COUNT");
        $ic101$ = SubLObjectFactory.makeSymbol("PROBLEM-STORE-RESTRICTION-LINK-COUNT");
        $ic102$ = SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION-LINK-COUNT");
        $ic103$ = SubLObjectFactory.makeSymbol("PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT");
        $ic104$ = SubLObjectFactory.makeKeyword("UNION-LINK-COUNT");
        $ic105$ = SubLObjectFactory.makeSymbol("S#27028", "CYC");
        $ic106$ = SubLObjectFactory.makeKeyword("GOOD-PROBLEM-COUNT");
        $ic107$ = SubLObjectFactory.makeSymbol("S#27045", "CYC");
        $ic108$ = SubLObjectFactory.makeKeyword("NEUTRAL-PROBLEM-COUNT");
        $ic109$ = SubLObjectFactory.makeSymbol("S#27046", "CYC");
        $ic110$ = SubLObjectFactory.makeKeyword("NO-GOOD-PROBLEM-COUNT");
        $ic111$ = SubLObjectFactory.makeSymbol("S#27047", "CYC");
        $ic112$ = SubLObjectFactory.makeKeyword("SINGLE-LITERAL-PROBLEM-COUNT");
        $ic113$ = SubLObjectFactory.makeSymbol("S#27048", "CYC");
        $ic114$ = SubLObjectFactory.makeKeyword("CONJUNCTIVE-PROBLEM-COUNT");
        $ic115$ = SubLObjectFactory.makeSymbol("S#27049", "CYC");
        $ic116$ = SubLObjectFactory.makeKeyword("JOIN-PROBLEM-COUNT");
        $ic117$ = SubLObjectFactory.makeSymbol("S#27050", "CYC");
        $ic118$ = SubLObjectFactory.makeKeyword("SPLIT-PROBLEM-COUNT");
        $ic119$ = SubLObjectFactory.makeSymbol("S#27051", "CYC");
        $ic120$ = SubLObjectFactory.makeKeyword("DISJUNCTIVE-PROBLEM-COUNT");
        $ic121$ = SubLObjectFactory.makeSymbol("S#27052", "CYC");
        $ic122$ = SubLObjectFactory.makeKeyword("UNEXAMINED-PROBLEM-COUNT");
        $ic123$ = SubLObjectFactory.makeSymbol("S#27040", "CYC");
        $ic124$ = SubLObjectFactory.makeKeyword("EXAMINED-PROBLEM-COUNT");
        $ic125$ = SubLObjectFactory.makeSymbol("S#27041", "CYC");
        $ic126$ = SubLObjectFactory.makeKeyword("POSSIBLE-PROBLEM-COUNT");
        $ic127$ = SubLObjectFactory.makeSymbol("S#27042", "CYC");
        $ic128$ = SubLObjectFactory.makeKeyword("PENDING-PROBLEM-COUNT");
        $ic129$ = SubLObjectFactory.makeSymbol("S#27043", "CYC");
        $ic130$ = SubLObjectFactory.makeKeyword("FINISHED-PROBLEM-COUNT");
        $ic131$ = SubLObjectFactory.makeSymbol("S#27044", "CYC");
        $ic132$ = SubLObjectFactory.makeKeyword("UNMANIFESTED-NON-FOCAL-COUNT");
        $ic133$ = SubLObjectFactory.makeSymbol("PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT");
        $ic134$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-RULE-BINDINGS-TO-CLOSED");
        $ic135$ = SubLObjectFactory.makeSymbol("S#27134", "CYC");
        $ic136$ = SubLObjectFactory.makeKeyword("PROBLEM-QUERIES");
        $ic137$ = SubLObjectFactory.makeSymbol("S#27136", "CYC");
        $ic138$ = SubLObjectFactory.makeKeyword("ANSWER-TIMES");
        $ic139$ = SubLObjectFactory.makeSymbol("S#28550", "CYC");
        $ic140$ = SubLObjectFactory.makeKeyword("ANSWER-STEP-COUNTS");
        $ic141$ = SubLObjectFactory.makeSymbol("S#28551", "CYC");
        $ic142$ = SubLObjectFactory.makeKeyword("PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINK-COUNT");
        $ic143$ = SubLObjectFactory.makeSymbol("S#30075", "CYC");
        $ic144$ = SubLObjectFactory.makeKeyword("ESTIMATED-EXHAUSTIVE-NEW-ROOT-COUNT");
        $ic145$ = SubLObjectFactory.makeSymbol("S#32029", "CYC");
        $ic146$ = SubLObjectFactory.makeKeyword("TOP-LEVEL-REMOVAL-FANOUT");
        $ic147$ = SubLObjectFactory.makeSymbol("S#32030", "CYC");
        $ic148$ = SubLObjectFactory.makeKeyword("NEW-ROOT-INITIAL-REMOVAL-FANOUTS");
        $ic149$ = SubLObjectFactory.makeSymbol("S#32031", "CYC");
        $ic150$ = SubLObjectFactory.makeKeyword("PROOF-QUERY-PROPERTIES");
        $ic151$ = SubLObjectFactory.makeSymbol("S#28221", "CYC");
        $ic152$ = SubLObjectFactory.makeKeyword("ANSWER-PROOF-SPECS");
        $ic153$ = SubLObjectFactory.makeSymbol("S#29017", "CYC");
        $ic154$ = SubLObjectFactory.makeKeyword("INFERENCE-PROOF-SPEC");
        $ic155$ = SubLObjectFactory.makeSymbol("S#29015", "CYC");
        $ic156$ = SubLObjectFactory.makeKeyword("EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES");
        $ic157$ = SubLObjectFactory.makeSymbol("S#27108", "CYC");
        $ic158$ = SubLObjectFactory.makeKeyword("NEW-ROOT-METRICS");
        $ic159$ = SubLObjectFactory.makeSymbol("S#28552", "CYC");
        $ic160$ = SubLObjectFactory.makeKeyword("UNEXAMINED-GOOD-PROBLEM-COUNT");
        $ic161$ = SubLObjectFactory.makeSymbol("S#27053", "CYC");
        $ic162$ = SubLObjectFactory.makeKeyword("EXAMINED-GOOD-PROBLEM-COUNT");
        $ic163$ = SubLObjectFactory.makeSymbol("S#27054", "CYC");
        $ic164$ = SubLObjectFactory.makeKeyword("POSSIBLE-GOOD-PROBLEM-COUNT");
        $ic165$ = SubLObjectFactory.makeSymbol("S#27055", "CYC");
        $ic166$ = SubLObjectFactory.makeKeyword("PENDING-GOOD-PROBLEM-COUNT");
        $ic167$ = SubLObjectFactory.makeSymbol("S#27056", "CYC");
        $ic168$ = SubLObjectFactory.makeKeyword("FINISHED-GOOD-PROBLEM-COUNT");
        $ic169$ = SubLObjectFactory.makeSymbol("S#27057", "CYC");
        $ic170$ = SubLObjectFactory.makeKeyword("UNEXAMINED-NEUTRAL-PROBLEM-COUNT");
        $ic171$ = SubLObjectFactory.makeSymbol("S#27058", "CYC");
        $ic172$ = SubLObjectFactory.makeKeyword("EXAMINED-NEUTRAL-PROBLEM-COUNT");
        $ic173$ = SubLObjectFactory.makeSymbol("S#27059", "CYC");
        $ic174$ = SubLObjectFactory.makeKeyword("POSSIBLE-NEUTRAL-PROBLEM-COUNT");
        $ic175$ = SubLObjectFactory.makeSymbol("S#27060", "CYC");
        $ic176$ = SubLObjectFactory.makeKeyword("PENDING-NEUTRAL-PROBLEM-COUNT");
        $ic177$ = SubLObjectFactory.makeSymbol("S#27061", "CYC");
        $ic178$ = SubLObjectFactory.makeKeyword("FINISHED-NEUTRAL-PROBLEM-COUNT");
        $ic179$ = SubLObjectFactory.makeSymbol("S#27062", "CYC");
        $ic180$ = SubLObjectFactory.makeKeyword("UNEXAMINED-NO-GOOD-PROBLEM-COUNT");
        $ic181$ = SubLObjectFactory.makeSymbol("S#27063", "CYC");
        $ic182$ = SubLObjectFactory.makeKeyword("EXAMINED-NO-GOOD-PROBLEM-COUNT");
        $ic183$ = SubLObjectFactory.makeSymbol("S#27064", "CYC");
        $ic184$ = SubLObjectFactory.makeKeyword("POSSIBLE-NO-GOOD-PROBLEM-COUNT");
        $ic185$ = SubLObjectFactory.makeSymbol("S#27065", "CYC");
        $ic186$ = SubLObjectFactory.makeKeyword("PENDING-NO-GOOD-PROBLEM-COUNT");
        $ic187$ = SubLObjectFactory.makeSymbol("S#27066", "CYC");
        $ic188$ = SubLObjectFactory.makeKeyword("FINISHED-NO-GOOD-PROBLEM-COUNT");
        $ic189$ = SubLObjectFactory.makeSymbol("S#27067", "CYC");
        $ic190$ = SubLObjectFactory.makeKeyword("GOOD-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic191$ = SubLObjectFactory.makeSymbol("S#27068", "CYC");
        $ic192$ = SubLObjectFactory.makeKeyword("GOOD-CONJUNCTIVE-PROBLEM-COUNT");
        $ic193$ = SubLObjectFactory.makeSymbol("S#27069", "CYC");
        $ic194$ = SubLObjectFactory.makeKeyword("GOOD-JOIN-PROBLEM-COUNT");
        $ic195$ = SubLObjectFactory.makeSymbol("S#27070", "CYC");
        $ic196$ = SubLObjectFactory.makeKeyword("GOOD-SPLIT-PROBLEM-COUNT");
        $ic197$ = SubLObjectFactory.makeSymbol("S#27071", "CYC");
        $ic198$ = SubLObjectFactory.makeKeyword("GOOD-DISJUNCTIVE-PROBLEM-COUNT");
        $ic199$ = SubLObjectFactory.makeSymbol("S#27072", "CYC");
        $ic200$ = SubLObjectFactory.makeKeyword("NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic201$ = SubLObjectFactory.makeSymbol("S#27073", "CYC");
        $ic202$ = SubLObjectFactory.makeKeyword("NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT");
        $ic203$ = SubLObjectFactory.makeSymbol("S#27074", "CYC");
        $ic204$ = SubLObjectFactory.makeKeyword("NEUTRAL-JOIN-PROBLEM-COUNT");
        $ic205$ = SubLObjectFactory.makeSymbol("S#27075", "CYC");
        $ic206$ = SubLObjectFactory.makeKeyword("NEUTRAL-SPLIT-PROBLEM-COUNT");
        $ic207$ = SubLObjectFactory.makeSymbol("S#27076", "CYC");
        $ic208$ = SubLObjectFactory.makeKeyword("NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT");
        $ic209$ = SubLObjectFactory.makeSymbol("S#27077", "CYC");
        $ic210$ = SubLObjectFactory.makeKeyword("NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic211$ = SubLObjectFactory.makeSymbol("S#27078", "CYC");
        $ic212$ = SubLObjectFactory.makeKeyword("NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT");
        $ic213$ = SubLObjectFactory.makeSymbol("S#27079", "CYC");
        $ic214$ = SubLObjectFactory.makeKeyword("NO-GOOD-JOIN-PROBLEM-COUNT");
        $ic215$ = SubLObjectFactory.makeSymbol("S#27080", "CYC");
        $ic216$ = SubLObjectFactory.makeKeyword("NO-GOOD-SPLIT-PROBLEM-COUNT");
        $ic217$ = SubLObjectFactory.makeSymbol("S#27081", "CYC");
        $ic218$ = SubLObjectFactory.makeKeyword("NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT");
        $ic219$ = SubLObjectFactory.makeSymbol("S#27082", "CYC");
        $ic220$ = SubLObjectFactory.makeKeyword("UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic221$ = SubLObjectFactory.makeSymbol("S#27083", "CYC");
        $ic222$ = SubLObjectFactory.makeKeyword("UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT");
        $ic223$ = SubLObjectFactory.makeSymbol("S#27084", "CYC");
        $ic224$ = SubLObjectFactory.makeKeyword("UNEXAMINED-JOIN-PROBLEM-COUNT");
        $ic225$ = SubLObjectFactory.makeSymbol("S#27085", "CYC");
        $ic226$ = SubLObjectFactory.makeKeyword("UNEXAMINED-SPLIT-PROBLEM-COUNT");
        $ic227$ = SubLObjectFactory.makeSymbol("S#27086", "CYC");
        $ic228$ = SubLObjectFactory.makeKeyword("UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT");
        $ic229$ = SubLObjectFactory.makeSymbol("S#27087", "CYC");
        $ic230$ = SubLObjectFactory.makeKeyword("EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic231$ = SubLObjectFactory.makeSymbol("S#27088", "CYC");
        $ic232$ = SubLObjectFactory.makeKeyword("EXAMINED-CONJUNCTIVE-PROBLEM-COUNT");
        $ic233$ = SubLObjectFactory.makeSymbol("S#27089", "CYC");
        $ic234$ = SubLObjectFactory.makeKeyword("EXAMINED-JOIN-PROBLEM-COUNT");
        $ic235$ = SubLObjectFactory.makeSymbol("S#27090", "CYC");
        $ic236$ = SubLObjectFactory.makeKeyword("EXAMINED-SPLIT-PROBLEM-COUNT");
        $ic237$ = SubLObjectFactory.makeSymbol("S#27091", "CYC");
        $ic238$ = SubLObjectFactory.makeKeyword("EXAMINED-DISJUNCTIVE-PROBLEM-COUNT");
        $ic239$ = SubLObjectFactory.makeSymbol("S#27092", "CYC");
        $ic240$ = SubLObjectFactory.makeKeyword("POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic241$ = SubLObjectFactory.makeSymbol("S#27093", "CYC");
        $ic242$ = SubLObjectFactory.makeKeyword("POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT");
        $ic243$ = SubLObjectFactory.makeSymbol("S#27094", "CYC");
        $ic244$ = SubLObjectFactory.makeKeyword("POSSIBLE-JOIN-PROBLEM-COUNT");
        $ic245$ = SubLObjectFactory.makeSymbol("S#27095", "CYC");
        $ic246$ = SubLObjectFactory.makeKeyword("POSSIBLE-SPLIT-PROBLEM-COUNT");
        $ic247$ = SubLObjectFactory.makeSymbol("S#27096", "CYC");
        $ic248$ = SubLObjectFactory.makeKeyword("POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT");
        $ic249$ = SubLObjectFactory.makeSymbol("S#27097", "CYC");
        $ic250$ = SubLObjectFactory.makeKeyword("PENDING-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic251$ = SubLObjectFactory.makeSymbol("S#27098", "CYC");
        $ic252$ = SubLObjectFactory.makeKeyword("PENDING-CONJUNCTIVE-PROBLEM-COUNT");
        $ic253$ = SubLObjectFactory.makeSymbol("S#27099", "CYC");
        $ic254$ = SubLObjectFactory.makeKeyword("PENDING-JOIN-PROBLEM-COUNT");
        $ic255$ = SubLObjectFactory.makeSymbol("S#27100", "CYC");
        $ic256$ = SubLObjectFactory.makeKeyword("PENDING-SPLIT-PROBLEM-COUNT");
        $ic257$ = SubLObjectFactory.makeSymbol("S#27101", "CYC");
        $ic258$ = SubLObjectFactory.makeKeyword("PENDING-DISJUNCTIVE-PROBLEM-COUNT");
        $ic259$ = SubLObjectFactory.makeSymbol("S#27102", "CYC");
        $ic260$ = SubLObjectFactory.makeKeyword("FINISHED-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic261$ = SubLObjectFactory.makeSymbol("S#27103", "CYC");
        $ic262$ = SubLObjectFactory.makeKeyword("FINISHED-CONJUNCTIVE-PROBLEM-COUNT");
        $ic263$ = SubLObjectFactory.makeSymbol("S#27104", "CYC");
        $ic264$ = SubLObjectFactory.makeKeyword("FINISHED-JOIN-PROBLEM-COUNT");
        $ic265$ = SubLObjectFactory.makeSymbol("S#27105", "CYC");
        $ic266$ = SubLObjectFactory.makeKeyword("FINISHED-SPLIT-PROBLEM-COUNT");
        $ic267$ = SubLObjectFactory.makeSymbol("S#27106", "CYC");
        $ic268$ = SubLObjectFactory.makeKeyword("FINISHED-DISJUNCTIVE-PROBLEM-COUNT");
        $ic269$ = SubLObjectFactory.makeSymbol("S#27107", "CYC");
        $ic270$ = SubLObjectFactory.makeKeyword("SKSI-QUERY-TOTAL-TIME");
        $ic271$ = SubLObjectFactory.makeSymbol("S#31946", "CYC");
        $ic272$ = SubLObjectFactory.makeKeyword("SKSI-QUERY-START-TIMES");
        $ic273$ = SubLObjectFactory.makeSymbol("S#31947", "CYC");
        $ic274$ = SubLObjectFactory.makeKeyword("SPARQL-QUERY-PROFILE");
        $ic275$ = SubLObjectFactory.makeSymbol("S#31948", "CYC");
        $ic276$ = SubLObjectFactory.makeKeyword("STEP-INDEXED-PROGRESS-DATA");
        $ic277$ = SubLObjectFactory.makeSymbol("S#31951", "CYC");
        $ic278$ = SubLObjectFactory.makeKeyword("TICK-INDEXED-PROGRESS-DATA");
        $ic279$ = SubLObjectFactory.makeSymbol("S#31954", "CYC");
        $ic280$ = SubLObjectFactory.makeKeyword("INFERENCE-HL-MODULE-TIMES");
        $ic281$ = SubLObjectFactory.makeSymbol("S#31957", "CYC");
        $ic282$ = SubLObjectFactory.makeSymbol("S#31986", "CYC");
        $ic283$ = SubLObjectFactory.makeSymbol("S#31987", "CYC");
        $ic284$ = SubLObjectFactory.makeSymbol("S#31988", "CYC");
        $ic285$ = SubLObjectFactory.makeSymbol("S#31989", "CYC");
        $ic286$ = SubLObjectFactory.makeInteger(1000);
        $ic287$ = SubLObjectFactory.makeString("Forward ~S contained ~S problems");
        $ic288$ = SubLObjectFactory.makeSymbol("S#31991", "CYC");
        $ic289$ = SubLObjectFactory.makeSymbol("S#31992", "CYC");
        $ic290$ = SubLObjectFactory.makeSymbol("S#31993", "CYC");
        $ic291$ = SubLObjectFactory.makeSymbol("S#31994", "CYC");
        $ic292$ = SubLObjectFactory.makeSymbol("S#31995", "CYC");
        $ic293$ = SubLObjectFactory.makeSymbol("S#31996", "CYC");
        $ic294$ = SubLObjectFactory.makeSymbol("S#31997", "CYC");
        $ic295$ = SubLObjectFactory.makeSymbol("S#31998", "CYC");
        $ic296$ = SubLObjectFactory.makeSymbol("S#31999", "CYC");
        $ic297$ = SubLObjectFactory.makeSymbol("S#32000", "CYC");
        $ic298$ = SubLObjectFactory.makeKeyword("REMOVAL");
        $ic299$ = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $ic300$ = SubLObjectFactory.makeKeyword("REWRITE");
        $ic301$ = SubLObjectFactory.makeSymbol("S#32001", "CYC");
        $ic302$ = SubLObjectFactory.makeSymbol("S#32002", "CYC");
        $ic303$ = SubLObjectFactory.makeSymbol("S#32003", "CYC");
        $ic304$ = SubLObjectFactory.makeSymbol("S#32004", "CYC");
        $ic305$ = SubLObjectFactory.makeSymbol("S#32005", "CYC");
        $ic306$ = SubLObjectFactory.makeSymbol("S#32006", "CYC");
        $ic307$ = SubLObjectFactory.makeSymbol("S#32007", "CYC");
        $ic308$ = SubLObjectFactory.makeSymbol("S#32008", "CYC");
        $ic309$ = SubLObjectFactory.makeSymbol("S#32009", "CYC");
        $ic310$ = SubLObjectFactory.makeSymbol("S#32010", "CYC");
        $ic311$ = SubLObjectFactory.makeSymbol("S#32011", "CYC");
        $ic312$ = SubLObjectFactory.makeSymbol("S#32012", "CYC");
        $ic313$ = SubLObjectFactory.makeSymbol("S#32013", "CYC");
        $ic314$ = SubLObjectFactory.makeSymbol("S#32014", "CYC");
        $ic315$ = SubLObjectFactory.makeSymbol("S#32015", "CYC");
        $ic316$ = SubLObjectFactory.makeSymbol("S#32016", "CYC");
        $ic317$ = SubLObjectFactory.makeSymbol("S#32017", "CYC");
        $ic318$ = SubLObjectFactory.makeKeyword("SKSI-QUERY-TOTAL-TIME-ACC");
        $ic319$ = SubLObjectFactory.makeKeyword("SKSI-QUERY-START-TIMES-ACC");
        $ic320$ = SubLObjectFactory.makeKeyword("SPARQL-QUERY-PROFILE-ACC");
        $ic321$ = SubLObjectFactory.makeSymbol("S#31950", "CYC");
        $ic322$ = SubLObjectFactory.makeInteger(128);
        $ic323$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic324$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic325$ = SubLObjectFactory.makeSymbol("S#31953", "CYC");
        $ic326$ = SubLObjectFactory.makeKeyword("TICK-COUNT");
        $ic327$ = SubLObjectFactory.makeKeyword("STEP-COUNT");
        $ic328$ = SubLObjectFactory.makeKeyword("ASSERTION-TOUCH-COUNT");
        $ic329$ = SubLObjectFactory.makeKeyword("TERM-TOUCH-COUNT");
        $ic330$ = SubLObjectFactory.makeKeyword("LAST-ASSERTION-TOUCHED");
        $ic331$ = SubLObjectFactory.makeKeyword("LAST-TERM-TOUCHED");
        $ic332$ = SubLObjectFactory.makeKeyword("PROBLEM");
        $ic333$ = SubLObjectFactory.makeSymbol("S#31959", "CYC");
        $ic334$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#9388", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic335$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"));
        $ic336$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic337$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $ic338$ = SubLObjectFactory.makeSymbol("CLET");
        $ic339$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32021", "CYC"), (SubLObject)module0413.T);
        $ic340$ = SubLObjectFactory.makeSymbol("S#1862", "CYC");
        $ic341$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31968", "CYC")));
        $ic342$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#759", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9388", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic343$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("THRESHOLD"), (SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"));
        $ic344$ = SubLObjectFactory.makeKeyword("THRESHOLD");
        $ic345$ = SubLObjectFactory.makeSymbol("S#31962", "CYC");
        $ic346$ = SubLObjectFactory.makeSymbol("S#31978", "CYC");
        $ic347$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic348$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31970", "CYC"));
        $ic349$ = SubLObjectFactory.makeSymbol("S#31963", "CYC");
        $ic350$ = SubLObjectFactory.makeSymbol("S#32022", "CYC");
        $ic351$ = SubLObjectFactory.makeSymbol("S#32023", "CYC");
        $ic352$ = SubLObjectFactory.makeSymbol("S#32024", "CYC");
        $ic353$ = SubLObjectFactory.makeSymbol("S#27365", "CYC");
        $ic354$ = SubLObjectFactory.makeSymbol("S#32025", "CYC");
        $ic355$ = SubLObjectFactory.makeSymbol("CDR");
        $ic356$ = SubLObjectFactory.makeSymbol(">");
        $ic357$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"));
        $ic358$ = SubLObjectFactory.makeKeyword("RULE");
        $ic359$ = SubLObjectFactory.makeKeyword("TIME");
        $ic360$ = SubLObjectFactory.makeKeyword("TRIGGER-GAFS");
        $ic361$ = SubLObjectFactory.makeKeyword("INFERENCE-COUNT");
        $ic362$ = SubLObjectFactory.makeKeyword("INFERENCES");
        $ic363$ = SubLObjectFactory.makeKeyword("TOTAL-INFERENCES");
        $ic364$ = SubLObjectFactory.makeKeyword("TOTAL-RULES");
        $ic365$ = SubLObjectFactory.makeKeyword("AVERAGE-INFERENCES-PER-RULE");
        $ic366$ = SubLObjectFactory.makeKeyword("STDEV-INFERENCES-PER-RULE");
        $ic367$ = SubLObjectFactory.makeKeyword("AVERAGE-TIME-PER-RULE");
        $ic368$ = SubLObjectFactory.makeKeyword("STDEV-TIME-PER-RULE");
        $ic369$ = SubLObjectFactory.makeKeyword("AVERAGE-TIME-PER-INFERENCE");
        $ic370$ = SubLObjectFactory.makeKeyword("STDEV-TIME-PER-INFERENCE");
        $ic371$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("S#32032", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32033", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32034", "CYC"));
        $ic372$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RULE"), (SubLObject)SubLObjectFactory.makeKeyword("TIME"), (SubLObject)SubLObjectFactory.makeKeyword("TRIGGER-GAFS"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCES"));
        $ic373$ = SubLObjectFactory.makeString("~%~6F : ~S : ~S  a ~S");
        $ic374$ = SubLObjectFactory.makeString("~%~S");
        $ic375$ = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $ic376$ = SubLObjectFactory.makeString("~%Total inferences                   : ~6,' D");
        $ic377$ = SubLObjectFactory.makeString("~% total forward (data directed)     : ~6,' D");
        $ic378$ = SubLObjectFactory.makeString("~%  successful forward               : ~6,' D");
        $ic379$ = SubLObjectFactory.makeString("~% total backward (query directed)   : ~6,' D");
        $ic380$ = SubLObjectFactory.makeString("~%  successful backward              : ~6,' D");
        $ic381$ = SubLObjectFactory.makeString("~% avg relevant problem count        : ~6,' D");
        $ic382$ = SubLObjectFactory.makeString("~%Total problem stores               : ~6,' D");
        $ic383$ = SubLObjectFactory.makeString("~% total forward  (data directed)    : ~6,' D");
        $ic384$ = SubLObjectFactory.makeString("~% max problem store problem count   : ~6,' D");
        $ic385$ = SubLObjectFactory.makeString("~% avg problem store problem count   : ~6,' D");
        $ic386$ = SubLObjectFactory.makeString("~% max forward problem store problem count   : ~6,' D");
        $ic387$ = SubLObjectFactory.makeString("~% avg forward problem store problem count   : ~6,' D");
        $ic388$ = SubLObjectFactory.makeString("~%Total problems          : ~6,' D");
        $ic389$ = SubLObjectFactory.makeString("~% total good problems    : ~6,' D");
        $ic390$ = SubLObjectFactory.makeString("~% total no-good problems : ~6,' D");
        $ic391$ = SubLObjectFactory.makeString("~% total forward problems : ~6,' D");
        $ic392$ = SubLObjectFactory.makeString("~% total problem reuses   : ~6,' D");
        $ic393$ = SubLObjectFactory.makeString("~%  problem reuse ratio   : ~6,' D per problem");
        $ic394$ = SubLObjectFactory.makeString("~%Total problem links     : ~6,' D");
        $ic395$ = SubLObjectFactory.makeString("~% total structural links : ~6,' D");
        $ic396$ = SubLObjectFactory.makeString("~% total content links    : ~6,' D");
        $ic397$ = SubLObjectFactory.makeString("~%  removal links         : ~6,' D");
        $ic398$ = SubLObjectFactory.makeString("~%  transformation links  : ~6,' D");
        $ic399$ = SubLObjectFactory.makeString("~%Total tactics    : ~6,' D");
        $ic400$ = SubLObjectFactory.makeString("~% total executed  : ~6,' D");
        $ic401$ = SubLObjectFactory.makeString("~% total discarded : ~6,' D");
        $ic402$ = SubLObjectFactory.makeString("~%Total SBHL cache calls   : ~9,' D");
        $ic403$ = SubLObjectFactory.makeString("~% successful              : ~9,' D");
        $ic404$ = SubLObjectFactory.makeString("~%Total SBHL graph walks   : ~9,' D");
        $ic405$ = SubLObjectFactory.makeString("~%Total unification attempts : ~6,' D");
        $ic406$ = SubLObjectFactory.makeString("~% successful unifications   : ~6,' D");
        $ic407$ = SubLObjectFactory.makeString("~%Total proofs : ~6,' D");
        $ic408$ = SubLObjectFactory.makeInteger(100);
        $ic409$ = SubLObjectFactory.makeString(" (~2,' D %)");
        $ic410$ = SubLObjectFactory.makeString(" (~3,' D %)");
        $ic411$ = SubLObjectFactory.makeString(" (~D %)");
    }
    
    public static final class $sX31866_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $evaluation_func;
        public SubLObject $evaluation_arg1;
        public SubLObject $cross_productP;
        private static final SubLStructDeclNative structDecl;
        
        public $sX31866_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$evaluation_func = (SubLObject)CommonSymbols.NIL;
            this.$evaluation_arg1 = (SubLObject)CommonSymbols.NIL;
            this.$cross_productP = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX31866_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$evaluation_func;
        }
        
        public SubLObject getField4() {
            return this.$evaluation_arg1;
        }
        
        public SubLObject getField5() {
            return this.$cross_productP;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$evaluation_func = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$evaluation_arg1 = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$cross_productP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX31866_native.class, module0413.$ic1$, module0413.$ic2$, module0413.$ic3$, module0413.$ic4$, new String[] { "$name", "$evaluation_func", "$evaluation_arg1", "$cross_productP" }, module0413.$ic5$, module0413.$ic6$, module0413.$ic7$);
        }
    }
    
    public static final class $f28724$UnaryFunction extends UnaryFunction
    {
        public $f28724$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#31867"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0413.f28724(var4);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0413.class
	Total time: 862 ms
	
	Decompiled with Procyon 0.5.32.
*/