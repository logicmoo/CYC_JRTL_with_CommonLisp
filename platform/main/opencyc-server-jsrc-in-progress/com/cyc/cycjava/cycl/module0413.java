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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return module0035.f2169(var1, (SubLObject)$ic0$);
    }
    
    public static SubLObject f28722(final SubLObject var2, final SubLObject var3) {
        f28723(var2, var3, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28724(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX31866_native.class) ? T : NIL);
    }
    
    public static SubLObject f28725(final SubLObject var2) {
        assert NIL != f28724(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f28726(final SubLObject var2) {
        assert NIL != f28724(var2) : var2;
        return var2.getField3();
    }
    
    public static SubLObject f28727(final SubLObject var2) {
        assert NIL != f28724(var2) : var2;
        return var2.getField4();
    }
    
    public static SubLObject f28728(final SubLObject var2) {
        assert NIL != f28724(var2) : var2;
        return var2.getField5();
    }
    
    public static SubLObject f28729(final SubLObject var2, final SubLObject var5) {
        assert NIL != f28724(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f28730(final SubLObject var2, final SubLObject var5) {
        assert NIL != f28724(var2) : var2;
        return var2.setField3(var5);
    }
    
    public static SubLObject f28731(final SubLObject var2, final SubLObject var5) {
        assert NIL != f28724(var2) : var2;
        return var2.setField4(var5);
    }
    
    public static SubLObject f28732(final SubLObject var2, final SubLObject var5) {
        assert NIL != f28724(var2) : var2;
        return var2.setField5(var5);
    }
    
    public static SubLObject f28733(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX31866_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)NIL, var8 = var6; NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)$ic18$)) {
                f28729(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic19$)) {
                f28730(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic20$)) {
                f28731(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic21$)) {
                f28732(var7, var10);
            }
            else {
                Errors.error((SubLObject)$ic22$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f28734(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)$ic23$, (SubLObject)$ic24$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var13, var12, (SubLObject)$ic25$, (SubLObject)$ic18$, f28725(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic25$, (SubLObject)$ic19$, f28726(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic25$, (SubLObject)$ic20$, f28727(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic25$, (SubLObject)$ic21$, f28728(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic26$, (SubLObject)$ic24$, (SubLObject)FOUR_INTEGER);
        return var12;
    }
    
    public static SubLObject f28735(final SubLObject var12, final SubLObject var13) {
        return f28734(var12, var13);
    }
    
    public static SubLObject f28723(final SubLObject var1, final SubLObject var3, final SubLObject var14) {
        PrintLow.format(var3, (SubLObject)$ic28$, f28725(var1));
        return var1;
    }
    
    public static SubLObject f28736(final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var18) {
        assert NIL != Types.keywordp(var15) : var15;
        assert NIL != Types.symbolp(var16) : var16;
        assert NIL != f28721(var17) : var17;
        assert NIL != Types.booleanp(var18) : var18;
        final SubLObject var19 = f28733((SubLObject)UNPROVIDED);
        f28729(var19, var15);
        f28730(var19, var16);
        f28731(var19, var17);
        f28732(var19, var18);
        return var19;
    }
    
    public static SubLObject f28737(final SubLObject var19) {
        assert NIL != f28724(var19) : var19;
        return f28725(var19);
    }
    
    public static SubLObject f28738(final SubLObject var19) {
        assert NIL != f28724(var19) : var19;
        return f28726(var19);
    }
    
    public static SubLObject f28739(final SubLObject var19) {
        assert NIL != f28724(var19) : var19;
        return f28727(var19);
    }
    
    public static SubLObject f28740(final SubLObject var19) {
        assert NIL != f28724(var19) : var19;
        return f28728(var19);
    }
    
    public static SubLObject f28741(final SubLObject var19, final SubLObject var20, final SubLObject var21) {
        assert NIL != f28724(var19) : var19;
        assert NIL != inference_datastructures_inference_oc.f25275(var20) : var20;
        assert NIL != module0361.f24009(var21) : var21;
        final SubLObject var22 = f28738(var19);
        final SubLObject var23 = f28739(var19);
        if (var23.eql((SubLObject)$ic35$)) {
            return Functions.funcall(var22, var21);
        }
        if (var23.eql((SubLObject)$ic36$)) {
            return Functions.funcall(var22, var20);
        }
        return Errors.error((SubLObject)$ic37$, f28739(var19));
    }
    
    public static SubLObject f28742(final SubLObject var1) {
        return module0035.f2169(var1, $g3335$.getGlobalValue());
    }
    
    public static SubLObject f28743(final SubLObject var15, final SubLObject var16, final SubLObject var17, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLObject var19 = f28736(var15, var16, var17, var18);
        module0067.f4886($g3334$.getGlobalValue(), var15, var19);
        return var19;
    }
    
    public static SubLObject f28744(final SubLObject var15) {
        return module0067.f4885($g3334$.getGlobalValue(), var15, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28745(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isKeyword() && NIL != module0035.sublisp_boolean(f28744(var1)));
    }
    
    public static SubLObject f28746() {
        return module0067.f4902($g3334$.getGlobalValue());
    }
    
    public static SubLObject f28747() {
        return $g3336$.getGlobalValue();
    }
    
    public static SubLObject f28748() {
        $g3336$.setGlobalValue(Numbers.add($g3336$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3336$.getGlobalValue();
    }
    
    public static SubLObject f28749() {
        return $g3337$.getGlobalValue();
    }
    
    public static SubLObject f28750() {
        return Numbers.subtract(f28747(), f28749());
    }
    
    public static SubLObject f28751() {
        $g3337$.setGlobalValue(Numbers.add($g3337$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3337$.getGlobalValue();
    }
    
    public static SubLObject f28752() {
        return $g3338$.getGlobalValue();
    }
    
    public static SubLObject f28753(final SubLObject var23) {
        final SubLObject var24 = module0361.f24229(var23);
        $g3338$.setGlobalValue(Numbers.max($g3338$.getGlobalValue(), var24));
        return $g3338$.getGlobalValue();
    }
    
    public static SubLObject f28754() {
        final SubLObject var25 = f28747();
        return (SubLObject)(var25.isZero() ? ZERO_INTEGER : Numbers.divide(f28755(), var25));
    }
    
    public static SubLObject f28756() {
        return $g3339$.getGlobalValue();
    }
    
    public static SubLObject f28757(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0361.f24229(var23);
        if (NIL != module0018.$g629$.getDynamicValue(var24) && var25.numGE($g3340$.getDynamicValue(var24))) {
            Errors.warn((SubLObject)$ic287$, var23, var25);
        }
        $g3339$.setGlobalValue(Numbers.max($g3339$.getGlobalValue(), var25));
        return $g3339$.getGlobalValue();
    }
    
    public static SubLObject f28758() {
        final SubLObject var25 = f28749();
        return (SubLObject)(var25.isZero() ? ZERO_INTEGER : Numbers.divide(f28759(), var25));
    }
    
    public static SubLObject f28760() {
        $g3341$.setGlobalValue(Numbers.add($g3341$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3341$.getGlobalValue();
    }
    
    public static SubLObject f28755() {
        return $g3341$.getGlobalValue();
    }
    
    public static SubLObject f28761() {
        return $g3342$.getGlobalValue();
    }
    
    public static SubLObject f28762() {
        $g3342$.setGlobalValue(Numbers.add($g3342$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3342$.getGlobalValue();
    }
    
    public static SubLObject f28763() {
        $g3342$.setGlobalValue(Numbers.subtract($g3342$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3342$.getGlobalValue();
    }
    
    public static SubLObject f28764() {
        return $g3343$.getGlobalValue();
    }
    
    public static SubLObject f28765() {
        $g3343$.setGlobalValue(Numbers.add($g3343$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3343$.getGlobalValue();
    }
    
    public static SubLObject f28759() {
        return $g3344$.getGlobalValue();
    }
    
    public static SubLObject f28766(final SubLObject var23) {
        final SubLObject var24 = module0361.f24229(var23);
        $g3344$.setGlobalValue(Numbers.add($g3344$.getGlobalValue(), var24));
        return $g3344$.getGlobalValue();
    }
    
    public static SubLObject f28767() {
        return $g3345$.getGlobalValue();
    }
    
    public static SubLObject f28768() {
        return Numbers.subtract(f28755(), f28767());
    }
    
    public static SubLObject f28769() {
        $g3345$.setGlobalValue(Numbers.add($g3345$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3345$.getGlobalValue();
    }
    
    public static SubLObject f28770() {
        return $g3346$.getGlobalValue();
    }
    
    public static SubLObject f28771() {
        return $g3347$.getGlobalValue();
    }
    
    public static SubLObject f28772() {
        return $g3348$.getGlobalValue();
    }
    
    public static SubLObject f28773() {
        return $g3349$.getGlobalValue();
    }
    
    public static SubLObject f28774() {
        return $g3350$.getGlobalValue();
    }
    
    public static SubLObject f28775(final SubLObject var27) {
        if (var27.eql((SubLObject)$ic298$)) {
            $g3349$.setGlobalValue(Numbers.add($g3349$.getGlobalValue(), (SubLObject)ONE_INTEGER));
            $g3348$.setGlobalValue(Numbers.add($g3348$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        }
        else if (var27.eql((SubLObject)$ic299$)) {
            $g3350$.setGlobalValue(Numbers.add($g3350$.getGlobalValue(), (SubLObject)ONE_INTEGER));
            $g3348$.setGlobalValue(Numbers.add($g3348$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        }
        else if (var27.eql((SubLObject)$ic300$)) {
            $g3348$.setGlobalValue(Numbers.add($g3348$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        }
        else {
            $g3347$.setGlobalValue(Numbers.add($g3347$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        }
        $g3346$.setGlobalValue(Numbers.add($g3346$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28776() {
        return $g3351$.getGlobalValue();
    }
    
    public static SubLObject f28777() {
        $g3351$.setGlobalValue(Numbers.add($g3351$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3351$.getGlobalValue();
    }
    
    public static SubLObject f28778() {
        return $g3352$.getGlobalValue();
    }
    
    public static SubLObject f28779() {
        return Numbers.subtract(f28776(), f28778());
    }
    
    public static SubLObject f28780() {
        $g3352$.setGlobalValue(Numbers.add($g3352$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3352$.getGlobalValue();
    }
    
    public static SubLObject f28781() {
        return Numbers.subtract(f28776(), f28755());
    }
    
    public static SubLObject f28782() {
        final SubLObject var28 = f28755();
        return (SubLObject)(var28.isZero() ? ZERO_INTEGER : Numbers.divide(f28781(), var28));
    }
    
    public static SubLObject f28783() {
        return Numbers.subtract(f28778(), f28767());
    }
    
    public static SubLObject f28784() {
        final SubLObject var28 = f28767();
        return (SubLObject)(var28.isZero() ? ZERO_INTEGER : Numbers.divide(f28783(), var28));
    }
    
    public static SubLObject f28785() {
        return Numbers.subtract(f28779(), f28768());
    }
    
    public static SubLObject f28786() {
        final SubLObject var28 = f28768();
        return (SubLObject)(var28.isZero() ? ZERO_INTEGER : Numbers.divide(f28785(), var28));
    }
    
    public static SubLObject f28787() {
        return $g3353$.getGlobalValue();
    }
    
    public static SubLObject f28788() {
        $g3353$.setGlobalValue(Numbers.add($g3353$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3353$.getGlobalValue();
    }
    
    public static SubLObject f28789() {
        return $g3354$.getGlobalValue();
    }
    
    public static SubLObject f28790() {
        $g3354$.setGlobalValue(Numbers.add($g3354$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3354$.getGlobalValue();
    }
    
    public static SubLObject f28791() {
        return $g3355$.getGlobalValue();
    }
    
    public static SubLObject f28792() {
        $g3355$.setGlobalValue(Numbers.add($g3355$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3355$.getGlobalValue();
    }
    
    public static SubLObject f28793() {
        return $g3356$.getGlobalValue();
    }
    
    public static SubLObject f28794() {
        $g3356$.setGlobalValue(Numbers.add($g3356$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3356$.getGlobalValue();
    }
    
    public static SubLObject f28795() {
        return $g3357$.getGlobalValue();
    }
    
    public static SubLObject f28796() {
        $g3357$.setGlobalValue(Numbers.add($g3357$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3357$.getGlobalValue();
    }
    
    public static SubLObject f28797() {
        return $g3358$.getGlobalValue();
    }
    
    public static SubLObject f28798() {
        $g3358$.setGlobalValue(Numbers.add($g3358$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3358$.getGlobalValue();
    }
    
    public static SubLObject f28799() {
        return $g3359$.getGlobalValue();
    }
    
    public static SubLObject f28800() {
        $g3359$.setGlobalValue(Numbers.add($g3359$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3359$.getGlobalValue();
    }
    
    public static SubLObject f28801() {
        return $g3360$.getGlobalValue();
    }
    
    public static SubLObject f28802() {
        $g3360$.setGlobalValue(Numbers.add($g3360$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3360$.getGlobalValue();
    }
    
    public static SubLObject f28803() {
        return $g3361$.getGlobalValue();
    }
    
    public static SubLObject f28804() {
        $g3361$.setGlobalValue(Numbers.add($g3361$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3361$.getGlobalValue();
    }
    
    public static SubLObject f28805() {
        return $g3362$.getGlobalValue();
    }
    
    public static SubLObject f28806() {
        $g3362$.setGlobalValue(Numbers.add($g3362$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3362$.getGlobalValue();
    }
    
    public static SubLObject f28807() {
        return $g3363$.getGlobalValue();
    }
    
    public static SubLObject f28808() {
        $g3363$.setGlobalValue(Numbers.add($g3363$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3363$.getGlobalValue();
    }
    
    public static SubLObject f28809() {
        return $g3364$.getGlobalValue();
    }
    
    public static SubLObject f28810() {
        $g3364$.setGlobalValue(Numbers.add($g3364$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3364$.getGlobalValue();
    }
    
    public static SubLObject f28811() {
        return $g3365$.getGlobalValue();
    }
    
    public static SubLObject f28812() {
        $g3365$.setGlobalValue(Numbers.add($g3365$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3365$.getGlobalValue();
    }
    
    public static SubLObject f28813() {
        return $g3366$.getGlobalValue();
    }
    
    public static SubLObject f28814() {
        return Numbers.subtract(f28809(), f28813());
    }
    
    public static SubLObject f28815() {
        $g3366$.setGlobalValue(Numbers.add($g3366$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3366$.getGlobalValue();
    }
    
    public static SubLObject f28816() {
        return $g3367$.getGlobalValue();
    }
    
    public static SubLObject f28817() {
        return Numbers.subtract(f28811(), f28816());
    }
    
    public static SubLObject f28818() {
        $g3367$.setGlobalValue(Numbers.add($g3367$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g3367$.getGlobalValue();
    }
    
    public static SubLObject f28819() {
        final SubLObject var29 = f28809();
        return (SubLObject)(var29.isZero() ? ZERO_INTEGER : Numbers.divide(f28755(), var29));
    }
    
    public static SubLObject f28820(final SubLObject var20) {
        return inference_datastructures_inference_oc.f25642(var20, (SubLObject)$ic318$);
    }
    
    public static SubLObject f28821(final SubLObject var20) {
        return inference_datastructures_inference_oc.f25642(var20, (SubLObject)$ic319$);
    }
    
    public static SubLObject f28822(final SubLObject var20) {
        return inference_datastructures_inference_oc.f25642(var20, (SubLObject)$ic320$);
    }
    
    public static SubLObject f28823(final SubLObject var20) {
        module0159.$g2147$.setDynamicValue((SubLObject)ZERO_INTEGER);
        module0159.$g2148$.setDynamicValue((SubLObject)ZERO_INTEGER);
        return Hashtables.make_hash_table((SubLObject)$ic322$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28824(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0034.$g879$.getDynamicValue(var21);
        SubLObject var23 = (SubLObject)NIL;
        if (NIL == var22) {
            return f28823(var20);
        }
        var23 = module0034.f1857(var22, (SubLObject)$ic321$, (SubLObject)UNPROVIDED);
        if (NIL == var23) {
            var23 = module0034.f1807(module0034.f1842(var22), (SubLObject)$ic321$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var22, (SubLObject)$ic321$, var23);
        }
        SubLObject var24 = module0034.f1814(var23, var20, (SubLObject)$ic323$);
        if (var24 == $ic323$) {
            var24 = Values.arg2(var21.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f28823(var20)));
            module0034.f1816(var23, var20, var24, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var24);
    }
    
    public static SubLObject f28825(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL != $g3368$.getDynamicValue(var21) || NIL != inference_datastructures_inference_oc.f25602(var20, (SubLObject)$ic276$)) {
            final SubLObject var22 = inference_datastructures_inference_oc.f25421(var20);
            final SubLObject var23 = f28826(var20);
            final SubLObject var24 = inference_datastructures_inference_oc.f25533(var20);
            final SubLObject var25 = (SubLObject)ConsesLow.list(module0361.f24229(var22), module0159.$g2147$.getDynamicValue(var21), module0159.$g2148$.getDynamicValue(var21), module0363.f24552(Functions.funcall((SubLObject)makeSymbol("S#31868", "CYC"), var22)), module0159.$g2143$.getGlobalValue(), module0159.$g2144$.getGlobalValue(), var24);
            Hashtables.sethash(var24, var23, var25);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28826(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = module0361.f24117(inference_datastructures_inference_oc.f25421(var20));
        final SubLObject var24 = module0034.$g879$.currentBinding(var21);
        try {
            module0034.$g879$.bind(var23, var21);
            SubLObject var25 = (SubLObject)NIL;
            if (NIL != var23 && NIL == module0034.f1842(var23)) {
                var25 = module0034.f1869(var23);
                final SubLObject var26 = Threads.current_process();
                if (NIL == var25) {
                    module0034.f1873(var23, var26);
                }
                else if (!var25.eql(var26)) {
                    Errors.error((SubLObject)$ic324$);
                }
            }
            try {
                var22 = f28824(var20);
            }
            finally {
                final SubLObject var38_41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var21);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var21);
                    if (NIL != var23 && NIL == var25) {
                        module0034.f1873(var23, (SubLObject)NIL);
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
        return Hashtables.make_hash_table((SubLObject)$ic322$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28828(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0034.$g879$.getDynamicValue(var21);
        SubLObject var23 = (SubLObject)NIL;
        if (NIL == var22) {
            return f28827(var20);
        }
        var23 = module0034.f1857(var22, (SubLObject)$ic325$, (SubLObject)UNPROVIDED);
        if (NIL == var23) {
            var23 = module0034.f1807(module0034.f1842(var22), (SubLObject)$ic325$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var22, (SubLObject)$ic325$, var23);
        }
        SubLObject var24 = module0034.f1814(var23, var20, (SubLObject)$ic323$);
        if (var24 == $ic323$) {
            var24 = Values.arg2(var21.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f28827(var20)));
            module0034.f1816(var23, var20, var24, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var24);
    }
    
    public static SubLObject f28829(final SubLObject var20) {
        if (NIL != f28830(var20)) {
            final SubLObject var21 = inference_datastructures_inference_oc.f25421(var20);
            final SubLObject var22 = f28831(var20);
            final SubLObject var23 = inference_datastructures_inference_oc.f25533(var20);
            final SubLObject var24 = module0361.f24229(inference_datastructures_inference_oc.f25421(var20));
            final SubLObject var25 = Numbers.add((SubLObject)MINUS_ONE_INTEGER, var23, var24);
            final SubLObject var26 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic326$, var25, $ic66$, var24, $ic327$, var23, $ic328$, module0425.f30062(), $ic329$, module0425.f30065(), $ic330$, module0425.f30058(), $ic331$, module0425.f30061(), $ic332$, Functions.funcall((SubLObject)makeSymbol("S#31868", "CYC"), var21) });
            Hashtables.sethash(var25, var22, var26);
            if (NIL == Hashtables.gethash((SubLObject)ONE_INTEGER, var22, (SubLObject)UNPROVIDED)) {
                final SubLObject var27 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic326$, ONE_INTEGER, $ic66$, ONE_INTEGER, $ic327$, ONE_INTEGER, $ic328$, ZERO_INTEGER, $ic329$, ZERO_INTEGER, $ic330$, NIL, $ic331$, NIL, $ic332$, inference_datastructures_inference_oc.f25597(var20) });
                Hashtables.sethash((SubLObject)ONE_INTEGER, var22, var27);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28830(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != inference_datastructures_inference_oc.f25417(var20) && (NIL != $g3369$.getDynamicValue(var21) || NIL != inference_datastructures_inference_oc.f25602(var20, (SubLObject)$ic278$)));
    }
    
    public static SubLObject f28831(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = module0361.f24117(inference_datastructures_inference_oc.f25421(var20));
        final SubLObject var24 = module0034.$g879$.currentBinding(var21);
        try {
            module0034.$g879$.bind(var23, var21);
            SubLObject var25 = (SubLObject)NIL;
            if (NIL != var23 && NIL == module0034.f1842(var23)) {
                var25 = module0034.f1869(var23);
                final SubLObject var26 = Threads.current_process();
                if (NIL == var25) {
                    module0034.f1873(var23, var26);
                }
                else if (!var25.eql(var26)) {
                    Errors.error((SubLObject)$ic324$);
                }
            }
            try {
                var22 = f28828(var20);
            }
            finally {
                final SubLObject var38_45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var21);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var21);
                    if (NIL != var23 && NIL == var25) {
                        module0034.f1873(var23, (SubLObject)NIL);
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
        if (NIL != var46) {
            return Hashtables.gethash(var46, var49, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28833(final SubLObject var20) {
        final SubLObject var21 = inference_datastructures_inference_oc.f25533(var20);
        final SubLObject var22 = module0361.f24229(inference_datastructures_inference_oc.f25421(var20));
        final SubLObject var23 = Numbers.add((SubLObject)MINUS_ONE_INTEGER, var21, var22);
        return var23;
    }
    
    public static SubLObject f28834(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = module0361.f24117(inference_datastructures_inference_oc.f25421(var20));
        final SubLObject var24 = module0034.$g879$.currentBinding(var21);
        try {
            module0034.$g879$.bind(var23, var21);
            SubLObject var25 = (SubLObject)NIL;
            if (NIL != var23 && NIL == module0034.f1842(var23)) {
                var25 = module0034.f1869(var23);
                final SubLObject var26 = Threads.current_process();
                if (NIL == var25) {
                    module0034.f1873(var23, var26);
                }
                else if (!var25.eql(var26)) {
                    Errors.error((SubLObject)$ic324$);
                }
            }
            try {
                var22 = f28835(var20);
            }
            finally {
                final SubLObject var38_50 = Threads.$is_thread_performing_cleanupP$.currentBinding(var21);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var21);
                    if (NIL != var23 && NIL == var25) {
                        module0034.f1873(var23, (SubLObject)NIL);
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
        return Hashtables.make_hash_table((SubLObject)$ic322$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28835(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0034.$g879$.getDynamicValue(var21);
        SubLObject var23 = (SubLObject)NIL;
        if (NIL == var22) {
            return f28836(var20);
        }
        var23 = module0034.f1857(var22, (SubLObject)$ic333$, (SubLObject)UNPROVIDED);
        if (NIL == var23) {
            var23 = module0034.f1807(module0034.f1842(var22), (SubLObject)$ic333$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var22, (SubLObject)$ic333$, var23);
        }
        SubLObject var24 = module0034.f1814(var23, var20, (SubLObject)$ic323$);
        if (var24 == $ic323$) {
            var24 = Values.arg2(var21.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f28836(var20)));
            module0034.f1816(var23, var20, var24, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var24);
    }
    
    public static SubLObject f28837(final SubLObject var20, final SubLObject var51, final SubLObject var52) {
        return module0030.f1599(var51, var52, f28834(var20));
    }
    
    public static SubLObject f28838(final SubLObject var52) {
        if (NIL != f28839((SubLObject)UNPROVIDED)) {
            module0030.f1599(module0373.f26108(), var52, f28834(module0339.f22757()));
            SubLObject var53 = module0339.f22758().rest();
            SubLObject var54 = (SubLObject)NIL;
            var54 = var53.first();
            while (NIL != var53) {
                module0030.f1599(module0365.f24865(module0373.f26105()), var52, f28834(var54));
                var53 = var53.rest();
                var54 = var53.first();
            }
            if (NIL != module0035.f2004(module0339.f22758(), module0373.f26106())) {
                SubLObject var55 = (SubLObject)NIL;
                SubLObject var20_55 = (SubLObject)NIL;
                SubLObject var56 = (SubLObject)NIL;
                SubLObject var57_58 = (SubLObject)NIL;
                var55 = module0339.f22758().rest();
                var20_55 = var55.first();
                var56 = module0373.f26106().rest();
                var57_58 = var56.first();
                while (NIL != var56 || NIL != var55) {
                    module0030.f1599(module0365.f24865(var57_58), Numbers.subtract((SubLObject)ZERO_INTEGER, var52), f28834(var20_55));
                    var55 = var55.rest();
                    var20_55 = var55.first();
                    var56 = var56.rest();
                    var57_58 = var56.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28840(SubLObject var20) {
        if (var20 == UNPROVIDED) {
            var20 = module0339.f22757();
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != inference_datastructures_inference_oc.f25417(var20) && (NIL != $g3370$.getDynamicValue(var21) || NIL != inference_datastructures_inference_oc.f25602(var20, (SubLObject)$ic280$)));
    }
    
    public static SubLObject f28839(SubLObject var59) {
        if (var59 == UNPROVIDED) {
            var59 = module0339.f22758();
        }
        SubLObject var60 = (SubLObject)NIL;
        if (NIL == var60) {
            SubLObject var61;
            SubLObject var62;
            for (var61 = var59, var62 = (SubLObject)NIL, var62 = var61.first(); NIL == var60 && NIL != var61; var60 = f28840(var62), var61 = var61.rest(), var62 = var61.first()) {}
        }
        return var60;
    }
    
    public static SubLObject f28841(final SubLObject var61, final SubLObject var62) {
        SubLObject var64;
        final SubLObject var63 = var64 = var61.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var64, var63, (SubLObject)$ic334$);
        final SubLObject var65 = var64.rest();
        var64 = var64.first();
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67 = var64;
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var69_70 = (SubLObject)NIL;
        while (NIL != var67) {
            cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)$ic334$);
            var69_70 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)$ic334$);
            if (NIL == conses_high.member(var69_70, (SubLObject)$ic335$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var68 = (SubLObject)T;
            }
            if (var69_70 == $ic336$) {
                var66 = var67.first();
            }
            var67 = var67.rest();
        }
        if (NIL != var68 && NIL == var66) {
            cdestructuring_bind.cdestructuring_bind_error(var63, (SubLObject)$ic334$);
        }
        final SubLObject var69 = cdestructuring_bind.property_list_member((SubLObject)$ic337$, var64);
        final SubLObject var70 = (SubLObject)((NIL != var69) ? conses_high.cadr(var69) : NIL);
        final SubLObject var71;
        var64 = (var71 = var65);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic338$, (SubLObject)ConsesLow.list((SubLObject)$ic339$, (SubLObject)ConsesLow.list((SubLObject)$ic340$, var70)), ConsesLow.append(var71, (SubLObject)$ic341$));
    }
    
    public static SubLObject f28842(final SubLObject var61, final SubLObject var62) {
        SubLObject var64;
        final SubLObject var63 = var64 = var61.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var64, var63, (SubLObject)$ic342$);
        final SubLObject var65 = var64.rest();
        var64 = var64.first();
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67 = var64;
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var80_81 = (SubLObject)NIL;
        while (NIL != var67) {
            cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)$ic342$);
            var80_81 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)$ic342$);
            if (NIL == conses_high.member(var80_81, (SubLObject)$ic343$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var68 = (SubLObject)T;
            }
            if (var80_81 == $ic336$) {
                var66 = var67.first();
            }
            var67 = var67.rest();
        }
        if (NIL != var68 && NIL == var66) {
            cdestructuring_bind.cdestructuring_bind_error(var63, (SubLObject)$ic342$);
        }
        final SubLObject var69 = cdestructuring_bind.property_list_member((SubLObject)$ic344$, var64);
        final SubLObject var70 = (SubLObject)((NIL != var69) ? conses_high.cadr(var69) : NIL);
        final SubLObject var71 = cdestructuring_bind.property_list_member((SubLObject)$ic337$, var64);
        final SubLObject var72 = (SubLObject)((NIL != var71) ? conses_high.cadr(var71) : NIL);
        final SubLObject var73;
        var64 = (var73 = var65);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic345$, (SubLObject)ConsesLow.list((SubLObject)$ic337$, var72), ConsesLow.append(var73, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic346$, var70))));
    }
    
    public static SubLObject f28843(final SubLObject var61, final SubLObject var62) {
        SubLObject var64;
        final SubLObject var63 = var64 = var61.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var64, var63, (SubLObject)$ic342$);
        final SubLObject var65 = var64.rest();
        var64 = var64.first();
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67 = var64;
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var91_92 = (SubLObject)NIL;
        while (NIL != var67) {
            cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)$ic342$);
            var91_92 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var63, (SubLObject)$ic342$);
            if (NIL == conses_high.member(var91_92, (SubLObject)$ic343$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var68 = (SubLObject)T;
            }
            if (var91_92 == $ic336$) {
                var66 = var67.first();
            }
            var67 = var67.rest();
        }
        if (NIL != var68 && NIL == var66) {
            cdestructuring_bind.cdestructuring_bind_error(var63, (SubLObject)$ic342$);
        }
        final SubLObject var69 = cdestructuring_bind.property_list_member((SubLObject)$ic344$, var64);
        final SubLObject var70 = (SubLObject)((NIL != var69) ? conses_high.cadr(var69) : NIL);
        final SubLObject var71 = cdestructuring_bind.property_list_member((SubLObject)$ic337$, var64);
        final SubLObject var72 = (SubLObject)((NIL != var71) ? conses_high.cadr(var71) : NIL);
        final SubLObject var73;
        var64 = (var73 = var65);
        return (SubLObject)ConsesLow.list((SubLObject)$ic347$, (SubLObject)$ic348$, (SubLObject)ConsesLow.listS((SubLObject)$ic349$, (SubLObject)ConsesLow.list((SubLObject)$ic344$, var70, (SubLObject)$ic337$, var72), ConsesLow.append(var73, (SubLObject)NIL)));
    }
    
    public static SubLObject f28844() {
        return $g3372$.getGlobalValue();
    }
    
    public static SubLObject f28845() {
        return $g3373$.getGlobalValue();
    }
    
    public static SubLObject f28846() {
        return $g3374$.getGlobalValue();
    }
    
    public static SubLObject f28847() {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = f28846();
        SubLObject var28;
        for (var28 = module0066.f4838(module0067.f4891(var27)); NIL == module0066.f4841(var28); var28 = module0066.f4840(var28)) {
            var26.resetMultipleValues();
            final SubLObject var29 = module0066.f4839(var28);
            final SubLObject var30 = var26.secondMultipleValue();
            var26.resetMultipleValues();
            final SubLObject var31 = module0035.remove_if_not((SubLObject)$ic353$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0067.f4886(var27, var29, var31);
        }
        module0066.f4842(var28);
        return var27;
    }
    
    public static SubLObject f28848() {
        return $g3375$.getGlobalValue();
    }
    
    public static SubLObject f28849() {
        module0067.f4881(f28844());
        module0067.f4881(f28845());
        module0067.f4881(f28846());
        module0067.f4881(f28848());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28850(final SubLObject var97, final SubLObject var99, final SubLObject var20) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL != $g3371$.getDynamicValue(var100)) {
            if (NIL != module0018.$g631$.getDynamicValue(var100) && NIL != var20) {
                module0084.f5762(f28846(), var97, var20);
            }
            final SubLObject var101 = module0528.f32908();
            if (NIL != var101) {
                module0084.f5765(f28848(), var97, var101, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            module0084.f5775(f28845(), var97, (SubLObject)UNPROVIDED);
            return module0084.f5775(f28844(), var97, var99);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28851(SubLObject var83) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)NIL;
        }
        f28847();
        SubLObject var84 = module0084.f5780($g3372$.getGlobalValue());
        var84 = Sequences.delete((SubLObject)NIL, var84, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic355$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var84 = Sort.sort(var84, Symbols.symbol_function((SubLObject)$ic356$), Symbols.symbol_function((SubLObject)$ic355$));
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)ZERO_INTEGER;
        SubLObject var87 = var84;
        SubLObject var88 = (SubLObject)NIL;
        var88 = var87.first();
        while (NIL != var87) {
            SubLObject var90;
            final SubLObject var89 = var90 = var88;
            SubLObject var91 = (SubLObject)NIL;
            SubLObject var92 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)$ic357$);
            var91 = var90.first();
            var90 = (var92 = var90.rest());
            if (NIL == var83 || var86.numL(var83)) {
                var85 = (SubLObject)ConsesLow.cons(f28852(var91, var92), var85);
            }
            var86 = Numbers.add(var86, (SubLObject)ONE_INTEGER);
            var87 = var87.rest();
            var88 = var87.first();
        }
        return Sequences.nreverse(var85);
    }
    
    public static SubLObject f28853() {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28;
        for (var28 = module0066.f4838(module0067.f4891(f28848())); NIL == module0066.f4841(var28); var28 = module0066.f4840(var28)) {
            var26.resetMultipleValues();
            final SubLObject var29 = module0066.f4839(var28);
            final SubLObject var30 = var26.secondMultipleValue();
            var26.resetMultipleValues();
            SubLObject var31 = (SubLObject)NIL;
            if (NIL == var31) {
                SubLObject var32;
                SubLObject var33;
                for (var32 = var30, var33 = (SubLObject)NIL, var33 = var32.first(); NIL == var31 && NIL != var32; var31 = module0211.f13667(var33, var29), var32 = var32.rest(), var33 = var32.first()) {}
            }
            if (NIL != var31) {
                var27 = (SubLObject)ConsesLow.cons(var29, var27);
            }
        }
        module0066.f4842(var28);
        return var27;
    }
    
    public static SubLObject f28854() {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28;
        for (var28 = module0066.f4838(module0067.f4891(f28848())); NIL == module0066.f4841(var28); var28 = module0066.f4840(var28)) {
            var26.resetMultipleValues();
            final SubLObject var29 = module0066.f4839(var28);
            final SubLObject var30 = var26.secondMultipleValue();
            var26.resetMultipleValues();
            SubLObject var31 = (SubLObject)NIL;
            if (NIL == var31) {
                SubLObject var32;
                SubLObject var33;
                for (var32 = var30, var33 = (SubLObject)NIL, var33 = var32.first(); NIL == var31 && NIL != var32; var31 = module0211.f13667(var33, var29), var32 = var32.rest(), var33 = var32.first()) {}
            }
            if (NIL == var31) {
                var27 = (SubLObject)ConsesLow.cons(var29, var27);
            }
        }
        module0066.f4842(var28);
        return var27;
    }
    
    public static SubLObject f28855(final SubLObject var97) {
        final SubLObject var98 = module0067.f4885($g3372$.getGlobalValue(), var97, (SubLObject)ZERO_INTEGER);
        return f28852(var97, var98);
    }
    
    public static SubLObject f28852(final SubLObject var97, final SubLObject var52) {
        final SubLObject var98 = module0067.f4884(f28845(), var97, (SubLObject)ZERO_INTEGER);
        final SubLObject var99 = module0067.f4884(f28848(), var97, (SubLObject)NIL);
        final SubLObject var100 = module0067.f4884(f28846(), var97, (SubLObject)NIL);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic358$, new SubLObject[] { var97, $ic359$, var52, $ic360$, conses_high.copy_list(var99), $ic361$, var98, (NIL != var100) ? ConsesLow.list((SubLObject)$ic362$, conses_high.copy_list(var100)) : NIL });
    }
    
    public static SubLObject f28856(final SubLObject var102) {
        SubLObject var103 = (SubLObject)ZERO_INTEGER;
        SubLObject var104 = (SubLObject)ZERO_INTEGER;
        SubLObject var105 = (SubLObject)ZERO_INTEGER;
        SubLObject var106 = (SubLObject)NIL;
        SubLObject var107 = (SubLObject)NIL;
        SubLObject var108 = (SubLObject)NIL;
        if (NIL == var102) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic50$, var104, (SubLObject)$ic363$, var105, (SubLObject)$ic364$, var103);
        }
        SubLObject var109 = var102;
        SubLObject var110 = (SubLObject)NIL;
        var110 = var109.first();
        while (NIL != var109) {
            final SubLObject var112;
            final SubLObject var111 = var112 = var110;
            final SubLObject var113 = cdestructuring_bind.property_list_member((SubLObject)$ic359$, var112);
            final SubLObject var114 = (SubLObject)((NIL != var113) ? conses_high.cadr(var113) : NIL);
            final SubLObject var115 = cdestructuring_bind.property_list_member((SubLObject)$ic361$, var112);
            final SubLObject var116 = (SubLObject)((NIL != var115) ? conses_high.cadr(var115) : NIL);
            var103 = Numbers.add(var103, (SubLObject)ONE_INTEGER);
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
        final SubLObject var123 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic50$, var104, $ic363$, var105, $ic364$, var103, $ic365$, var117, $ic366$, var118, $ic367$, var119, $ic368$, var120, $ic369$, var121, $ic370$, var122 });
        return var123;
    }
    
    public static SubLObject f28857(SubLObject var83, SubLObject var3) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var84 = f28851(var83);
        SubLObject var85 = (SubLObject)ZERO_INTEGER;
        SubLObject var86 = var84;
        SubLObject var87 = (SubLObject)NIL;
        var87 = var86.first();
        while (NIL != var86) {
            final SubLObject var89;
            final SubLObject var88 = var89 = var87;
            SubLObject var90 = (SubLObject)NIL;
            SubLObject var91 = var89;
            SubLObject var92 = (SubLObject)NIL;
            SubLObject var135_136 = (SubLObject)NIL;
            while (NIL != var91) {
                cdestructuring_bind.destructuring_bind_must_consp(var91, var88, (SubLObject)$ic371$);
                var135_136 = var91.first();
                var91 = var91.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var91, var88, (SubLObject)$ic371$);
                if (NIL == conses_high.member(var135_136, (SubLObject)$ic372$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var92 = (SubLObject)T;
                }
                if (var135_136 == $ic336$) {
                    var90 = var91.first();
                }
                var91 = var91.rest();
            }
            if (NIL != var92 && NIL == var90) {
                cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)$ic371$);
            }
            final SubLObject var93 = cdestructuring_bind.property_list_member((SubLObject)$ic358$, var89);
            final SubLObject var94 = (SubLObject)((NIL != var93) ? conses_high.cadr(var93) : NIL);
            final SubLObject var95 = cdestructuring_bind.property_list_member((SubLObject)$ic359$, var89);
            final SubLObject var96 = (SubLObject)((NIL != var95) ? conses_high.cadr(var95) : NIL);
            final SubLObject var97 = cdestructuring_bind.property_list_member((SubLObject)$ic360$, var89);
            final SubLObject var98 = (SubLObject)((NIL != var97) ? conses_high.cadr(var97) : NIL);
            final SubLObject var99 = cdestructuring_bind.property_list_member((SubLObject)$ic361$, var89);
            final SubLObject var100 = (SubLObject)((NIL != var99) ? conses_high.cadr(var99) : NIL);
            final SubLObject var101 = cdestructuring_bind.property_list_member((SubLObject)$ic362$, var89);
            final SubLObject var102 = (SubLObject)((NIL != var101) ? conses_high.cadr(var101) : NIL);
            var85 = Numbers.add(var85, var96);
            PrintLow.format(var3, (SubLObject)$ic373$, new SubLObject[] { var96, var100, var94, assertion_handles_oc.f11025(var94) });
            if (NIL != var98) {
                PrintLow.format(var3, (SubLObject)$ic374$, var98);
            }
            if (NIL != var102) {
                PrintLow.format(var3, (SubLObject)$ic374$, var102);
            }
            var86 = var86.rest();
            var87 = var86.first();
        }
        return var85;
    }
    
    public static SubLObject f28858(final SubLObject var142, final SubLObject var143, SubLObject var83, SubLObject var72) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)NIL;
        }
        if (var72 == UNPROVIDED) {
            var72 = (SubLObject)NIL;
        }
        final SubLThread var144 = SubLProcess.currentSubLThread();
        f28849();
        final SubLObject var145 = $g3371$.currentBinding(var144);
        final SubLObject var146 = module0018.$g631$.currentBinding(var144);
        try {
            $g3371$.bind((SubLObject)T, var144);
            module0018.$g631$.bind(var72, var144);
            module0540.f33518(var142, var143);
            module0540.f33516(var142, var143, (SubLObject)UNPROVIDED);
            f28857(var83, (SubLObject)UNPROVIDED);
            f28847();
        }
        finally {
            module0018.$g631$.rebind(var146, var144);
            $g3371$.rebind(var145, var144);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28859() {
        $g3336$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3337$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3338$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3339$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3341$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3342$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3343$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3344$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3345$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3346$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3347$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3348$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3349$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3350$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3351$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3352$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3353$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3354$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3355$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3358$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3359$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3360$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3361$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3362$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3356$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3357$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3363$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3364$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3365$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3366$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3367$.setGlobalValue((SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28860(SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = reader.$read_default_float_format$.currentBinding(var4);
        try {
            reader.$read_default_float_format$.bind((SubLObject)$ic375$, var4);
            SubLObject var6 = f28809();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)$ic376$, var6);
            SubLObject var7 = f28813();
            PrintLow.format(var3, (SubLObject)$ic377$, var7);
            f28861(var7, var6, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
            SubLObject var8 = f28816();
            PrintLow.format(var3, (SubLObject)$ic378$, var8);
            f28861(var8, var6, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
            SubLObject var9 = f28814();
            PrintLow.format(var3, (SubLObject)$ic379$, var9);
            f28861(var9, var6, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
            var8 = f28817();
            PrintLow.format(var3, (SubLObject)$ic380$, var8);
            f28861(var8, var6, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
            PrintLow.format(var3, (SubLObject)$ic381$, module0048.f3302(f28819(), (SubLObject)FOUR_INTEGER));
            var6 = f28747();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)$ic382$, var6);
            var7 = f28749();
            PrintLow.format(var3, (SubLObject)$ic383$, var7);
            f28861(var7, var6, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            var9 = f28750();
            PrintLow.format(var3, (SubLObject)$ic379$, var9);
            f28861(var9, var6, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            PrintLow.format(var3, (SubLObject)$ic384$, f28752());
            PrintLow.format(var3, (SubLObject)$ic385$, module0048.f3302(f28754(), (SubLObject)THREE_INTEGER));
            PrintLow.format(var3, (SubLObject)$ic386$, f28756());
            PrintLow.format(var3, (SubLObject)$ic387$, module0048.f3302(f28758(), (SubLObject)THREE_INTEGER));
            var6 = f28755();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)$ic388$, var6);
            final SubLObject var10 = f28761();
            PrintLow.format(var3, (SubLObject)$ic389$, var10);
            f28861(var10, var6, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var11 = f28764();
            PrintLow.format(var3, (SubLObject)$ic390$, var11);
            f28861(var11, var6, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            var7 = f28759();
            PrintLow.format(var3, (SubLObject)$ic391$, var7);
            f28861(var7, var6, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            PrintLow.format(var3, (SubLObject)$ic392$, f28781());
            PrintLow.format(var3, (SubLObject)$ic393$, module0048.f3302(f28782(), (SubLObject)THREE_INTEGER));
            var6 = f28770();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)$ic394$, var6);
            final SubLObject var12 = f28771();
            PrintLow.format(var3, (SubLObject)$ic395$, var12);
            f28861(var12, var6, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var13 = f28772();
            PrintLow.format(var3, (SubLObject)$ic396$, var13);
            f28861(var13, var6, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var14 = f28773();
            PrintLow.format(var3, (SubLObject)$ic397$, var14);
            f28861(var14, var6, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var15 = f28774();
            PrintLow.format(var3, (SubLObject)$ic398$, var15);
            f28861(var15, var6, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
            var6 = f28787();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)$ic399$, var6);
            final SubLObject var16 = f28789();
            PrintLow.format(var3, (SubLObject)$ic400$, var16);
            f28861(var16, var6, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var17 = f28791();
            PrintLow.format(var3, (SubLObject)$ic401$, var17);
            f28861(var17, var6, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            var6 = f28797();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)$ic402$, var6);
            SubLObject var18 = f28799();
            PrintLow.format(var3, (SubLObject)$ic403$, var18);
            f28861(var18, var6, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
            var6 = f28801();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)$ic404$, var6);
            var18 = f28803();
            PrintLow.format(var3, (SubLObject)$ic403$, var18);
            f28861(var18, var6, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
            var6 = f28793();
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)$ic405$, var6);
            var18 = f28795();
            PrintLow.format(var3, (SubLObject)$ic406$, var18);
            f28861(var18, var6, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            streams_high.terpri(var3);
            PrintLow.format(var3, (SubLObject)$ic407$, f28807());
            streams_high.terpri(var3);
        }
        finally {
            reader.$read_default_float_format$.rebind(var5, var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28861(final SubLObject var157, final SubLObject var158, final SubLObject var159, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (!var158.isZero()) {
            final SubLObject var160 = module0048.f3302(Numbers.multiply((SubLObject)$ic408$, Numbers.divide(var157, var158)), var159);
            if (var159.eql((SubLObject)TWO_INTEGER)) {
                PrintLow.format(var3, (SubLObject)$ic409$, var160);
            }
            else if (var159.eql((SubLObject)THREE_INTEGER)) {
                PrintLow.format(var3, (SubLObject)$ic410$, var160);
            }
            else {
                PrintLow.format(var3, (SubLObject)$ic411$, var160);
            }
        }
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28863() {
        $g3333$ = SubLFiles.defconstant("S#31983", (SubLObject)$ic1$);
        $g3334$ = SubLFiles.deflexical("S#31984", (NIL != Symbols.boundp((SubLObject)$ic38$)) ? $g3334$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g3335$ = SubLFiles.deflexical("S#31985", (SubLObject)$ic39$);
        $g3336$ = SubLFiles.deflexical("S#31986", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic282$)) ? $g3336$.getGlobalValue() : ZERO_INTEGER));
        $g3337$ = SubLFiles.deflexical("S#31987", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic283$)) ? $g3337$.getGlobalValue() : ZERO_INTEGER));
        $g3338$ = SubLFiles.deflexical("S#31988", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic284$)) ? $g3338$.getGlobalValue() : ZERO_INTEGER));
        $g3339$ = SubLFiles.deflexical("S#31989", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic285$)) ? $g3339$.getGlobalValue() : ZERO_INTEGER));
        $g3340$ = SubLFiles.defvar("S#31990", (SubLObject)$ic286$);
        $g3341$ = SubLFiles.deflexical("S#31991", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic288$)) ? $g3341$.getGlobalValue() : ZERO_INTEGER));
        $g3342$ = SubLFiles.deflexical("S#31992", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic289$)) ? $g3342$.getGlobalValue() : ZERO_INTEGER));
        $g3343$ = SubLFiles.deflexical("S#31993", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic290$)) ? $g3343$.getGlobalValue() : ZERO_INTEGER));
        $g3344$ = SubLFiles.deflexical("S#31994", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic291$)) ? $g3344$.getGlobalValue() : ZERO_INTEGER));
        $g3345$ = SubLFiles.deflexical("S#31995", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic292$)) ? $g3345$.getGlobalValue() : ZERO_INTEGER));
        $g3346$ = SubLFiles.deflexical("S#31996", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic293$)) ? $g3346$.getGlobalValue() : ZERO_INTEGER));
        $g3347$ = SubLFiles.deflexical("S#31997", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic294$)) ? $g3347$.getGlobalValue() : ZERO_INTEGER));
        $g3348$ = SubLFiles.deflexical("S#31998", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic295$)) ? $g3348$.getGlobalValue() : ZERO_INTEGER));
        $g3349$ = SubLFiles.deflexical("S#31999", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic296$)) ? $g3349$.getGlobalValue() : ZERO_INTEGER));
        $g3350$ = SubLFiles.deflexical("S#32000", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic297$)) ? $g3350$.getGlobalValue() : ZERO_INTEGER));
        $g3351$ = SubLFiles.deflexical("S#32001", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic301$)) ? $g3351$.getGlobalValue() : ZERO_INTEGER));
        $g3352$ = SubLFiles.deflexical("S#32002", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic302$)) ? $g3352$.getGlobalValue() : ZERO_INTEGER));
        $g3353$ = SubLFiles.deflexical("S#32003", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic303$)) ? $g3353$.getGlobalValue() : ZERO_INTEGER));
        $g3354$ = SubLFiles.deflexical("S#32004", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic304$)) ? $g3354$.getGlobalValue() : ZERO_INTEGER));
        $g3355$ = SubLFiles.deflexical("S#32005", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic305$)) ? $g3355$.getGlobalValue() : ZERO_INTEGER));
        $g3356$ = SubLFiles.deflexical("S#32006", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic306$)) ? $g3356$.getGlobalValue() : ZERO_INTEGER));
        $g3357$ = SubLFiles.deflexical("S#32007", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic307$)) ? $g3357$.getGlobalValue() : ZERO_INTEGER));
        $g3358$ = SubLFiles.deflexical("S#32008", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic308$)) ? $g3358$.getGlobalValue() : ZERO_INTEGER));
        $g3359$ = SubLFiles.deflexical("S#32009", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic309$)) ? $g3359$.getGlobalValue() : ZERO_INTEGER));
        $g3360$ = SubLFiles.deflexical("S#32010", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic310$)) ? $g3360$.getGlobalValue() : ZERO_INTEGER));
        $g3361$ = SubLFiles.deflexical("S#32011", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic311$)) ? $g3361$.getGlobalValue() : ZERO_INTEGER));
        $g3362$ = SubLFiles.deflexical("S#32012", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic312$)) ? $g3362$.getGlobalValue() : ZERO_INTEGER));
        $g3363$ = SubLFiles.deflexical("S#32013", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic313$)) ? $g3363$.getGlobalValue() : ZERO_INTEGER));
        $g3364$ = SubLFiles.deflexical("S#32014", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic314$)) ? $g3364$.getGlobalValue() : ZERO_INTEGER));
        $g3365$ = SubLFiles.deflexical("S#32015", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic315$)) ? $g3365$.getGlobalValue() : ZERO_INTEGER));
        $g3366$ = SubLFiles.deflexical("S#32016", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic316$)) ? $g3366$.getGlobalValue() : ZERO_INTEGER));
        $g3367$ = SubLFiles.deflexical("S#32017", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic317$)) ? $g3367$.getGlobalValue() : ZERO_INTEGER));
        $g3368$ = SubLFiles.defparameter("S#32018", (SubLObject)NIL);
        $g3369$ = SubLFiles.defparameter("S#32019", (SubLObject)NIL);
        $g3370$ = SubLFiles.defparameter("S#32020", (SubLObject)NIL);
        $g3371$ = SubLFiles.defvar("S#32021", (SubLObject)NIL);
        $g3372$ = SubLFiles.deflexical("S#32022", (NIL != Symbols.boundp((SubLObject)$ic350$)) ? $g3372$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g3373$ = SubLFiles.deflexical("S#32023", (NIL != Symbols.boundp((SubLObject)$ic351$)) ? $g3373$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g3374$ = SubLFiles.deflexical("S#32024", (NIL != Symbols.boundp((SubLObject)$ic352$)) ? $g3374$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g3375$ = SubLFiles.deflexical("S#32025", (NIL != Symbols.boundp((SubLObject)$ic354$)) ? $g3375$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28864() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3333$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Structures.def_csetf((SubLObject)$ic16$, (SubLObject)$ic17$);
        Equality.identity((SubLObject)$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3333$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic27$));
        module0012.f419((SubLObject)$ic7$);
        module0003.f57((SubLObject)$ic38$);
        f28743((SubLObject)$ic40$, (SubLObject)$ic41$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic42$, (SubLObject)$ic43$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic44$, (SubLObject)$ic45$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic46$, (SubLObject)$ic47$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic48$, (SubLObject)$ic49$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic50$, (SubLObject)$ic51$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic52$, (SubLObject)$ic53$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic54$, (SubLObject)$ic55$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic56$, (SubLObject)$ic57$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic58$, (SubLObject)$ic59$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic60$, (SubLObject)$ic61$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic62$, (SubLObject)$ic63$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic64$, (SubLObject)$ic65$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic66$, (SubLObject)$ic67$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic68$, (SubLObject)$ic67$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic69$, (SubLObject)$ic70$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic71$, (SubLObject)$ic70$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic72$, (SubLObject)$ic73$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic74$, (SubLObject)$ic75$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic76$, (SubLObject)$ic77$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic78$, (SubLObject)$ic79$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic80$, (SubLObject)$ic81$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic82$, (SubLObject)$ic83$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic84$, (SubLObject)$ic85$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic86$, (SubLObject)$ic87$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic88$, (SubLObject)$ic89$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic90$, (SubLObject)$ic91$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic92$, (SubLObject)$ic93$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic94$, (SubLObject)$ic95$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic96$, (SubLObject)$ic97$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic98$, (SubLObject)$ic99$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic100$, (SubLObject)$ic101$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic102$, (SubLObject)$ic103$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic104$, (SubLObject)$ic105$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic106$, (SubLObject)$ic107$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic108$, (SubLObject)$ic109$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic110$, (SubLObject)$ic111$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic112$, (SubLObject)$ic113$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic114$, (SubLObject)$ic115$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic116$, (SubLObject)$ic117$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic118$, (SubLObject)$ic119$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic120$, (SubLObject)$ic121$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic122$, (SubLObject)$ic123$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic124$, (SubLObject)$ic125$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic126$, (SubLObject)$ic127$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic128$, (SubLObject)$ic129$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic130$, (SubLObject)$ic131$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic132$, (SubLObject)$ic133$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic134$, (SubLObject)$ic135$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic136$, (SubLObject)$ic137$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic138$, (SubLObject)$ic139$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic140$, (SubLObject)$ic141$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic142$, (SubLObject)$ic143$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic144$, (SubLObject)$ic145$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic146$, (SubLObject)$ic147$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic148$, (SubLObject)$ic149$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic150$, (SubLObject)$ic151$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic152$, (SubLObject)$ic153$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic154$, (SubLObject)$ic155$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic156$, (SubLObject)$ic157$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic158$, (SubLObject)$ic159$, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        f28743((SubLObject)$ic160$, (SubLObject)$ic161$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic162$, (SubLObject)$ic163$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic164$, (SubLObject)$ic165$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic166$, (SubLObject)$ic167$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic168$, (SubLObject)$ic169$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic170$, (SubLObject)$ic171$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic172$, (SubLObject)$ic173$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic174$, (SubLObject)$ic175$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic176$, (SubLObject)$ic177$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic178$, (SubLObject)$ic179$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic180$, (SubLObject)$ic181$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic182$, (SubLObject)$ic183$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic184$, (SubLObject)$ic185$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic186$, (SubLObject)$ic187$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic188$, (SubLObject)$ic189$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic190$, (SubLObject)$ic191$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic192$, (SubLObject)$ic193$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic194$, (SubLObject)$ic195$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic196$, (SubLObject)$ic197$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic198$, (SubLObject)$ic199$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic200$, (SubLObject)$ic201$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic202$, (SubLObject)$ic203$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic204$, (SubLObject)$ic205$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic206$, (SubLObject)$ic207$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic208$, (SubLObject)$ic209$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic210$, (SubLObject)$ic211$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic212$, (SubLObject)$ic213$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic214$, (SubLObject)$ic215$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic216$, (SubLObject)$ic217$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic218$, (SubLObject)$ic219$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic220$, (SubLObject)$ic221$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic222$, (SubLObject)$ic223$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic224$, (SubLObject)$ic225$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic226$, (SubLObject)$ic227$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic228$, (SubLObject)$ic229$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic230$, (SubLObject)$ic231$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic232$, (SubLObject)$ic233$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic234$, (SubLObject)$ic235$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic236$, (SubLObject)$ic237$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic238$, (SubLObject)$ic239$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic240$, (SubLObject)$ic241$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic242$, (SubLObject)$ic243$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic244$, (SubLObject)$ic245$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic246$, (SubLObject)$ic247$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic248$, (SubLObject)$ic249$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic250$, (SubLObject)$ic251$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic252$, (SubLObject)$ic253$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic254$, (SubLObject)$ic255$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic256$, (SubLObject)$ic257$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic258$, (SubLObject)$ic259$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic260$, (SubLObject)$ic261$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic262$, (SubLObject)$ic263$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic264$, (SubLObject)$ic265$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic266$, (SubLObject)$ic267$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic268$, (SubLObject)$ic269$, (SubLObject)$ic35$, (SubLObject)T);
        f28743((SubLObject)$ic270$, (SubLObject)$ic271$, (SubLObject)$ic36$, (SubLObject)NIL);
        f28743((SubLObject)$ic272$, (SubLObject)$ic273$, (SubLObject)$ic36$, (SubLObject)NIL);
        f28743((SubLObject)$ic274$, (SubLObject)$ic275$, (SubLObject)$ic36$, (SubLObject)NIL);
        f28743((SubLObject)$ic276$, (SubLObject)$ic277$, (SubLObject)$ic36$, (SubLObject)NIL);
        f28743((SubLObject)$ic278$, (SubLObject)$ic279$, (SubLObject)$ic36$, (SubLObject)NIL);
        f28743((SubLObject)$ic280$, (SubLObject)$ic281$, (SubLObject)$ic36$, (SubLObject)NIL);
        module0003.f57((SubLObject)$ic282$);
        module0003.f57((SubLObject)$ic283$);
        module0003.f57((SubLObject)$ic284$);
        module0003.f57((SubLObject)$ic285$);
        module0003.f57((SubLObject)$ic288$);
        module0003.f57((SubLObject)$ic289$);
        module0003.f57((SubLObject)$ic290$);
        module0003.f57((SubLObject)$ic291$);
        module0003.f57((SubLObject)$ic292$);
        module0003.f57((SubLObject)$ic293$);
        module0003.f57((SubLObject)$ic294$);
        module0003.f57((SubLObject)$ic295$);
        module0003.f57((SubLObject)$ic296$);
        module0003.f57((SubLObject)$ic297$);
        module0003.f57((SubLObject)$ic301$);
        module0003.f57((SubLObject)$ic302$);
        module0003.f57((SubLObject)$ic303$);
        module0003.f57((SubLObject)$ic304$);
        module0003.f57((SubLObject)$ic305$);
        module0003.f57((SubLObject)$ic306$);
        module0003.f57((SubLObject)$ic307$);
        module0003.f57((SubLObject)$ic308$);
        module0003.f57((SubLObject)$ic309$);
        module0003.f57((SubLObject)$ic310$);
        module0003.f57((SubLObject)$ic311$);
        module0003.f57((SubLObject)$ic312$);
        module0003.f57((SubLObject)$ic313$);
        module0003.f57((SubLObject)$ic314$);
        module0003.f57((SubLObject)$ic315$);
        module0003.f57((SubLObject)$ic316$);
        module0003.f57((SubLObject)$ic317$);
        module0012.f419((SubLObject)$ic271$);
        module0012.f419((SubLObject)$ic273$);
        module0012.f419((SubLObject)$ic275$);
        module0034.f1895((SubLObject)$ic321$);
        module0034.f1895((SubLObject)$ic325$);
        module0034.f1895((SubLObject)$ic333$);
        module0003.f57((SubLObject)$ic350$);
        module0003.f57((SubLObject)$ic351$);
        module0003.f57((SubLObject)$ic352$);
        module0003.f57((SubLObject)$ic354$);
        return (SubLObject)NIL;
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
        $g3333$ = null;
        $g3334$ = null;
        $g3335$ = null;
        $g3336$ = null;
        $g3337$ = null;
        $g3338$ = null;
        $g3339$ = null;
        $g3340$ = null;
        $g3341$ = null;
        $g3342$ = null;
        $g3343$ = null;
        $g3344$ = null;
        $g3345$ = null;
        $g3346$ = null;
        $g3347$ = null;
        $g3348$ = null;
        $g3349$ = null;
        $g3350$ = null;
        $g3351$ = null;
        $g3352$ = null;
        $g3353$ = null;
        $g3354$ = null;
        $g3355$ = null;
        $g3356$ = null;
        $g3357$ = null;
        $g3358$ = null;
        $g3359$ = null;
        $g3360$ = null;
        $g3361$ = null;
        $g3362$ = null;
        $g3363$ = null;
        $g3364$ = null;
        $g3365$ = null;
        $g3366$ = null;
        $g3367$ = null;
        $g3368$ = null;
        $g3369$ = null;
        $g3370$ = null;
        $g3371$ = null;
        $g3372$ = null;
        $g3373$ = null;
        $g3374$ = null;
        $g3375$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeKeyword("STORE"), (SubLObject)makeKeyword("INFERENCE"));
        $ic1$ = makeSymbol("S#31866", "CYC");
        $ic2$ = makeSymbol("S#31867", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#32026", "CYC"), (SubLObject)makeSymbol("S#32027", "CYC"), (SubLObject)makeSymbol("S#32028", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeKeyword("EVALUATION-FUNC"), (SubLObject)makeKeyword("EVALUATION-ARG1"), (SubLObject)makeKeyword("CROSS-PRODUCT?"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#31876", "CYC"), (SubLObject)makeSymbol("S#31877", "CYC"), (SubLObject)makeSymbol("S#31878", "CYC"), (SubLObject)makeSymbol("S#31879", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#31880", "CYC"), (SubLObject)makeSymbol("S#31881", "CYC"), (SubLObject)makeSymbol("S#31882", "CYC"), (SubLObject)makeSymbol("S#31883", "CYC"));
        $ic7$ = makeSymbol("S#31887", "CYC");
        $ic8$ = makeSymbol("S#31875", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#31867", "CYC"));
        $ic10$ = makeSymbol("S#31876", "CYC");
        $ic11$ = makeSymbol("S#31880", "CYC");
        $ic12$ = makeSymbol("S#31877", "CYC");
        $ic13$ = makeSymbol("S#31881", "CYC");
        $ic14$ = makeSymbol("S#31878", "CYC");
        $ic15$ = makeSymbol("S#31882", "CYC");
        $ic16$ = makeSymbol("S#31879", "CYC");
        $ic17$ = makeSymbol("S#31883", "CYC");
        $ic18$ = makeKeyword("NAME");
        $ic19$ = makeKeyword("EVALUATION-FUNC");
        $ic20$ = makeKeyword("EVALUATION-ARG1");
        $ic21$ = makeKeyword("CROSS-PRODUCT?");
        $ic22$ = makeString("Invalid slot ~S for construction function");
        $ic23$ = makeKeyword("BEGIN");
        $ic24$ = makeSymbol("S#31884", "CYC");
        $ic25$ = makeKeyword("SLOT");
        $ic26$ = makeKeyword("END");
        $ic27$ = makeSymbol("S#31886", "CYC");
        $ic28$ = makeString("<INFERENCE-METRIC: ~s>");
        $ic29$ = makeSymbol("KEYWORDP");
        $ic30$ = makeSymbol("SYMBOLP");
        $ic31$ = makeSymbol("S#31874", "CYC");
        $ic32$ = makeSymbol("BOOLEANP");
        $ic33$ = makeSymbol("INFERENCE-P");
        $ic34$ = makeSymbol("S#26782", "CYC");
        $ic35$ = makeKeyword("STORE");
        $ic36$ = makeKeyword("INFERENCE");
        $ic37$ = makeString("Unhandled inference metric evaluation arg1 spec ~s");
        $ic38$ = makeSymbol("S#31984", "CYC");
        $ic39$ = ConsesLow.list((SubLObject)makeKeyword("EVALUATION-FUNC"), (SubLObject)makeKeyword("EVALUATION-ARG1"), (SubLObject)makeKeyword("CROSS-PRODUCT?"));
        $ic40$ = makeKeyword("ANSWER-COUNT");
        $ic41$ = makeSymbol("S#28575", "CYC");
        $ic42$ = makeKeyword("ANSWER-COUNT-AT-30-SECONDS");
        $ic43$ = makeSymbol("S#28548", "CYC");
        $ic44$ = makeKeyword("ANSWER-COUNT-AT-60-SECONDS");
        $ic45$ = makeSymbol("S#28549", "CYC");
        $ic46$ = makeKeyword("TIME-TO-FIRST-ANSWER");
        $ic47$ = makeSymbol("S#28542", "CYC");
        $ic48$ = makeKeyword("TIME-TO-LAST-ANSWER");
        $ic49$ = makeSymbol("S#28544", "CYC");
        $ic50$ = makeKeyword("TOTAL-TIME");
        $ic51$ = makeSymbol("S#28441", "CYC");
        $ic52$ = makeKeyword("TIME-PER-ANSWER");
        $ic53$ = makeSymbol("S#28711", "CYC");
        $ic54$ = makeKeyword("STEPS-TO-FIRST-ANSWER");
        $ic55$ = makeSymbol("S#28543", "CYC");
        $ic56$ = makeKeyword("STEPS-TO-LAST-ANSWER");
        $ic57$ = makeSymbol("S#28545", "CYC");
        $ic58$ = makeKeyword("TOTAL-STEPS");
        $ic59$ = makeSymbol("S#28443", "CYC");
        $ic60$ = makeKeyword("STEPS-PER-ANSWER");
        $ic61$ = makeSymbol("S#28712", "CYC");
        $ic62$ = makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER");
        $ic63$ = makeSymbol("S#28713", "CYC");
        $ic64$ = makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");
        $ic65$ = makeSymbol("S#28714", "CYC");
        $ic66$ = makeKeyword("PROBLEM-COUNT");
        $ic67$ = makeSymbol("S#27029", "CYC");
        $ic68$ = makeKeyword("PROBLEM-STORE-PROBLEM-COUNT");
        $ic69$ = makeKeyword("PROOF-COUNT");
        $ic70$ = makeSymbol("S#27116", "CYC");
        $ic71$ = makeKeyword("PROBLEM-STORE-PROOF-COUNT");
        $ic72$ = makeKeyword("LINK-COUNT");
        $ic73$ = makeSymbol("S#27014", "CYC");
        $ic74$ = makeKeyword("TACTIC-COUNT");
        $ic75$ = makeSymbol("S#27110", "CYC");
        $ic76$ = makeKeyword("POSSIBLE-TACTIC-COUNT");
        $ic77$ = makeSymbol("S#27113", "CYC");
        $ic78$ = makeKeyword("EXECUTED-TACTIC-COUNT");
        $ic79$ = makeSymbol("S#27114", "CYC");
        $ic80$ = makeKeyword("TACTIC-EXECUTION-COUNT");
        $ic81$ = makeSymbol("S#27796", "CYC");
        $ic82$ = makeKeyword("DISCARDED-TACTIC-COUNT");
        $ic83$ = makeSymbol("S#27115", "CYC");
        $ic84$ = makeKeyword("CONTENT-LINK-COUNT");
        $ic85$ = makeSymbol("S#27019", "CYC");
        $ic86$ = makeKeyword("REMOVAL-LINK-COUNT");
        $ic87$ = makeSymbol("S#27021", "CYC");
        $ic88$ = makeKeyword("REWRITE-LINK-COUNT");
        $ic89$ = makeSymbol("PROBLEM-STORE-REWRITE-LINK-COUNT");
        $ic90$ = makeKeyword("TRANSFORMATION-LINK-COUNT");
        $ic91$ = makeSymbol("S#27023", "CYC");
        $ic92$ = makeKeyword("STRUCTURAL-LINK-COUNT");
        $ic93$ = makeSymbol("S#27024", "CYC");
        $ic94$ = makeKeyword("JOIN-ORDERED-LINK-COUNT");
        $ic95$ = makeSymbol("S#27025", "CYC");
        $ic96$ = makeKeyword("JOIN-LINK-COUNT");
        $ic97$ = makeSymbol("S#27026", "CYC");
        $ic98$ = makeKeyword("SPLIT-LINK-COUNT");
        $ic99$ = makeSymbol("S#27027", "CYC");
        $ic100$ = makeKeyword("RESTRICTION-LINK-COUNT");
        $ic101$ = makeSymbol("PROBLEM-STORE-RESTRICTION-LINK-COUNT");
        $ic102$ = makeKeyword("RESIDUAL-TRANSFORMATION-LINK-COUNT");
        $ic103$ = makeSymbol("PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT");
        $ic104$ = makeKeyword("UNION-LINK-COUNT");
        $ic105$ = makeSymbol("S#27028", "CYC");
        $ic106$ = makeKeyword("GOOD-PROBLEM-COUNT");
        $ic107$ = makeSymbol("S#27045", "CYC");
        $ic108$ = makeKeyword("NEUTRAL-PROBLEM-COUNT");
        $ic109$ = makeSymbol("S#27046", "CYC");
        $ic110$ = makeKeyword("NO-GOOD-PROBLEM-COUNT");
        $ic111$ = makeSymbol("S#27047", "CYC");
        $ic112$ = makeKeyword("SINGLE-LITERAL-PROBLEM-COUNT");
        $ic113$ = makeSymbol("S#27048", "CYC");
        $ic114$ = makeKeyword("CONJUNCTIVE-PROBLEM-COUNT");
        $ic115$ = makeSymbol("S#27049", "CYC");
        $ic116$ = makeKeyword("JOIN-PROBLEM-COUNT");
        $ic117$ = makeSymbol("S#27050", "CYC");
        $ic118$ = makeKeyword("SPLIT-PROBLEM-COUNT");
        $ic119$ = makeSymbol("S#27051", "CYC");
        $ic120$ = makeKeyword("DISJUNCTIVE-PROBLEM-COUNT");
        $ic121$ = makeSymbol("S#27052", "CYC");
        $ic122$ = makeKeyword("UNEXAMINED-PROBLEM-COUNT");
        $ic123$ = makeSymbol("S#27040", "CYC");
        $ic124$ = makeKeyword("EXAMINED-PROBLEM-COUNT");
        $ic125$ = makeSymbol("S#27041", "CYC");
        $ic126$ = makeKeyword("POSSIBLE-PROBLEM-COUNT");
        $ic127$ = makeSymbol("S#27042", "CYC");
        $ic128$ = makeKeyword("PENDING-PROBLEM-COUNT");
        $ic129$ = makeSymbol("S#27043", "CYC");
        $ic130$ = makeKeyword("FINISHED-PROBLEM-COUNT");
        $ic131$ = makeSymbol("S#27044", "CYC");
        $ic132$ = makeKeyword("UNMANIFESTED-NON-FOCAL-COUNT");
        $ic133$ = makeSymbol("PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT");
        $ic134$ = makeKeyword("TRANSFORMATION-RULE-BINDINGS-TO-CLOSED");
        $ic135$ = makeSymbol("S#27134", "CYC");
        $ic136$ = makeKeyword("PROBLEM-QUERIES");
        $ic137$ = makeSymbol("S#27136", "CYC");
        $ic138$ = makeKeyword("ANSWER-TIMES");
        $ic139$ = makeSymbol("S#28550", "CYC");
        $ic140$ = makeKeyword("ANSWER-STEP-COUNTS");
        $ic141$ = makeSymbol("S#28551", "CYC");
        $ic142$ = makeKeyword("PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINK-COUNT");
        $ic143$ = makeSymbol("S#30075", "CYC");
        $ic144$ = makeKeyword("ESTIMATED-EXHAUSTIVE-NEW-ROOT-COUNT");
        $ic145$ = makeSymbol("S#32029", "CYC");
        $ic146$ = makeKeyword("TOP-LEVEL-REMOVAL-FANOUT");
        $ic147$ = makeSymbol("S#32030", "CYC");
        $ic148$ = makeKeyword("NEW-ROOT-INITIAL-REMOVAL-FANOUTS");
        $ic149$ = makeSymbol("S#32031", "CYC");
        $ic150$ = makeKeyword("PROOF-QUERY-PROPERTIES");
        $ic151$ = makeSymbol("S#28221", "CYC");
        $ic152$ = makeKeyword("ANSWER-PROOF-SPECS");
        $ic153$ = makeSymbol("S#29017", "CYC");
        $ic154$ = makeKeyword("INFERENCE-PROOF-SPEC");
        $ic155$ = makeSymbol("S#29015", "CYC");
        $ic156$ = makeKeyword("EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES");
        $ic157$ = makeSymbol("S#27108", "CYC");
        $ic158$ = makeKeyword("NEW-ROOT-METRICS");
        $ic159$ = makeSymbol("S#28552", "CYC");
        $ic160$ = makeKeyword("UNEXAMINED-GOOD-PROBLEM-COUNT");
        $ic161$ = makeSymbol("S#27053", "CYC");
        $ic162$ = makeKeyword("EXAMINED-GOOD-PROBLEM-COUNT");
        $ic163$ = makeSymbol("S#27054", "CYC");
        $ic164$ = makeKeyword("POSSIBLE-GOOD-PROBLEM-COUNT");
        $ic165$ = makeSymbol("S#27055", "CYC");
        $ic166$ = makeKeyword("PENDING-GOOD-PROBLEM-COUNT");
        $ic167$ = makeSymbol("S#27056", "CYC");
        $ic168$ = makeKeyword("FINISHED-GOOD-PROBLEM-COUNT");
        $ic169$ = makeSymbol("S#27057", "CYC");
        $ic170$ = makeKeyword("UNEXAMINED-NEUTRAL-PROBLEM-COUNT");
        $ic171$ = makeSymbol("S#27058", "CYC");
        $ic172$ = makeKeyword("EXAMINED-NEUTRAL-PROBLEM-COUNT");
        $ic173$ = makeSymbol("S#27059", "CYC");
        $ic174$ = makeKeyword("POSSIBLE-NEUTRAL-PROBLEM-COUNT");
        $ic175$ = makeSymbol("S#27060", "CYC");
        $ic176$ = makeKeyword("PENDING-NEUTRAL-PROBLEM-COUNT");
        $ic177$ = makeSymbol("S#27061", "CYC");
        $ic178$ = makeKeyword("FINISHED-NEUTRAL-PROBLEM-COUNT");
        $ic179$ = makeSymbol("S#27062", "CYC");
        $ic180$ = makeKeyword("UNEXAMINED-NO-GOOD-PROBLEM-COUNT");
        $ic181$ = makeSymbol("S#27063", "CYC");
        $ic182$ = makeKeyword("EXAMINED-NO-GOOD-PROBLEM-COUNT");
        $ic183$ = makeSymbol("S#27064", "CYC");
        $ic184$ = makeKeyword("POSSIBLE-NO-GOOD-PROBLEM-COUNT");
        $ic185$ = makeSymbol("S#27065", "CYC");
        $ic186$ = makeKeyword("PENDING-NO-GOOD-PROBLEM-COUNT");
        $ic187$ = makeSymbol("S#27066", "CYC");
        $ic188$ = makeKeyword("FINISHED-NO-GOOD-PROBLEM-COUNT");
        $ic189$ = makeSymbol("S#27067", "CYC");
        $ic190$ = makeKeyword("GOOD-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic191$ = makeSymbol("S#27068", "CYC");
        $ic192$ = makeKeyword("GOOD-CONJUNCTIVE-PROBLEM-COUNT");
        $ic193$ = makeSymbol("S#27069", "CYC");
        $ic194$ = makeKeyword("GOOD-JOIN-PROBLEM-COUNT");
        $ic195$ = makeSymbol("S#27070", "CYC");
        $ic196$ = makeKeyword("GOOD-SPLIT-PROBLEM-COUNT");
        $ic197$ = makeSymbol("S#27071", "CYC");
        $ic198$ = makeKeyword("GOOD-DISJUNCTIVE-PROBLEM-COUNT");
        $ic199$ = makeSymbol("S#27072", "CYC");
        $ic200$ = makeKeyword("NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic201$ = makeSymbol("S#27073", "CYC");
        $ic202$ = makeKeyword("NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT");
        $ic203$ = makeSymbol("S#27074", "CYC");
        $ic204$ = makeKeyword("NEUTRAL-JOIN-PROBLEM-COUNT");
        $ic205$ = makeSymbol("S#27075", "CYC");
        $ic206$ = makeKeyword("NEUTRAL-SPLIT-PROBLEM-COUNT");
        $ic207$ = makeSymbol("S#27076", "CYC");
        $ic208$ = makeKeyword("NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT");
        $ic209$ = makeSymbol("S#27077", "CYC");
        $ic210$ = makeKeyword("NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic211$ = makeSymbol("S#27078", "CYC");
        $ic212$ = makeKeyword("NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT");
        $ic213$ = makeSymbol("S#27079", "CYC");
        $ic214$ = makeKeyword("NO-GOOD-JOIN-PROBLEM-COUNT");
        $ic215$ = makeSymbol("S#27080", "CYC");
        $ic216$ = makeKeyword("NO-GOOD-SPLIT-PROBLEM-COUNT");
        $ic217$ = makeSymbol("S#27081", "CYC");
        $ic218$ = makeKeyword("NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT");
        $ic219$ = makeSymbol("S#27082", "CYC");
        $ic220$ = makeKeyword("UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic221$ = makeSymbol("S#27083", "CYC");
        $ic222$ = makeKeyword("UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT");
        $ic223$ = makeSymbol("S#27084", "CYC");
        $ic224$ = makeKeyword("UNEXAMINED-JOIN-PROBLEM-COUNT");
        $ic225$ = makeSymbol("S#27085", "CYC");
        $ic226$ = makeKeyword("UNEXAMINED-SPLIT-PROBLEM-COUNT");
        $ic227$ = makeSymbol("S#27086", "CYC");
        $ic228$ = makeKeyword("UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT");
        $ic229$ = makeSymbol("S#27087", "CYC");
        $ic230$ = makeKeyword("EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic231$ = makeSymbol("S#27088", "CYC");
        $ic232$ = makeKeyword("EXAMINED-CONJUNCTIVE-PROBLEM-COUNT");
        $ic233$ = makeSymbol("S#27089", "CYC");
        $ic234$ = makeKeyword("EXAMINED-JOIN-PROBLEM-COUNT");
        $ic235$ = makeSymbol("S#27090", "CYC");
        $ic236$ = makeKeyword("EXAMINED-SPLIT-PROBLEM-COUNT");
        $ic237$ = makeSymbol("S#27091", "CYC");
        $ic238$ = makeKeyword("EXAMINED-DISJUNCTIVE-PROBLEM-COUNT");
        $ic239$ = makeSymbol("S#27092", "CYC");
        $ic240$ = makeKeyword("POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic241$ = makeSymbol("S#27093", "CYC");
        $ic242$ = makeKeyword("POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT");
        $ic243$ = makeSymbol("S#27094", "CYC");
        $ic244$ = makeKeyword("POSSIBLE-JOIN-PROBLEM-COUNT");
        $ic245$ = makeSymbol("S#27095", "CYC");
        $ic246$ = makeKeyword("POSSIBLE-SPLIT-PROBLEM-COUNT");
        $ic247$ = makeSymbol("S#27096", "CYC");
        $ic248$ = makeKeyword("POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT");
        $ic249$ = makeSymbol("S#27097", "CYC");
        $ic250$ = makeKeyword("PENDING-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic251$ = makeSymbol("S#27098", "CYC");
        $ic252$ = makeKeyword("PENDING-CONJUNCTIVE-PROBLEM-COUNT");
        $ic253$ = makeSymbol("S#27099", "CYC");
        $ic254$ = makeKeyword("PENDING-JOIN-PROBLEM-COUNT");
        $ic255$ = makeSymbol("S#27100", "CYC");
        $ic256$ = makeKeyword("PENDING-SPLIT-PROBLEM-COUNT");
        $ic257$ = makeSymbol("S#27101", "CYC");
        $ic258$ = makeKeyword("PENDING-DISJUNCTIVE-PROBLEM-COUNT");
        $ic259$ = makeSymbol("S#27102", "CYC");
        $ic260$ = makeKeyword("FINISHED-SINGLE-LITERAL-PROBLEM-COUNT");
        $ic261$ = makeSymbol("S#27103", "CYC");
        $ic262$ = makeKeyword("FINISHED-CONJUNCTIVE-PROBLEM-COUNT");
        $ic263$ = makeSymbol("S#27104", "CYC");
        $ic264$ = makeKeyword("FINISHED-JOIN-PROBLEM-COUNT");
        $ic265$ = makeSymbol("S#27105", "CYC");
        $ic266$ = makeKeyword("FINISHED-SPLIT-PROBLEM-COUNT");
        $ic267$ = makeSymbol("S#27106", "CYC");
        $ic268$ = makeKeyword("FINISHED-DISJUNCTIVE-PROBLEM-COUNT");
        $ic269$ = makeSymbol("S#27107", "CYC");
        $ic270$ = makeKeyword("SKSI-QUERY-TOTAL-TIME");
        $ic271$ = makeSymbol("S#31946", "CYC");
        $ic272$ = makeKeyword("SKSI-QUERY-START-TIMES");
        $ic273$ = makeSymbol("S#31947", "CYC");
        $ic274$ = makeKeyword("SPARQL-QUERY-PROFILE");
        $ic275$ = makeSymbol("S#31948", "CYC");
        $ic276$ = makeKeyword("STEP-INDEXED-PROGRESS-DATA");
        $ic277$ = makeSymbol("S#31951", "CYC");
        $ic278$ = makeKeyword("TICK-INDEXED-PROGRESS-DATA");
        $ic279$ = makeSymbol("S#31954", "CYC");
        $ic280$ = makeKeyword("INFERENCE-HL-MODULE-TIMES");
        $ic281$ = makeSymbol("S#31957", "CYC");
        $ic282$ = makeSymbol("S#31986", "CYC");
        $ic283$ = makeSymbol("S#31987", "CYC");
        $ic284$ = makeSymbol("S#31988", "CYC");
        $ic285$ = makeSymbol("S#31989", "CYC");
        $ic286$ = makeInteger(1000);
        $ic287$ = makeString("Forward ~S contained ~S problems");
        $ic288$ = makeSymbol("S#31991", "CYC");
        $ic289$ = makeSymbol("S#31992", "CYC");
        $ic290$ = makeSymbol("S#31993", "CYC");
        $ic291$ = makeSymbol("S#31994", "CYC");
        $ic292$ = makeSymbol("S#31995", "CYC");
        $ic293$ = makeSymbol("S#31996", "CYC");
        $ic294$ = makeSymbol("S#31997", "CYC");
        $ic295$ = makeSymbol("S#31998", "CYC");
        $ic296$ = makeSymbol("S#31999", "CYC");
        $ic297$ = makeSymbol("S#32000", "CYC");
        $ic298$ = makeKeyword("REMOVAL");
        $ic299$ = makeKeyword("TRANSFORMATION");
        $ic300$ = makeKeyword("REWRITE");
        $ic301$ = makeSymbol("S#32001", "CYC");
        $ic302$ = makeSymbol("S#32002", "CYC");
        $ic303$ = makeSymbol("S#32003", "CYC");
        $ic304$ = makeSymbol("S#32004", "CYC");
        $ic305$ = makeSymbol("S#32005", "CYC");
        $ic306$ = makeSymbol("S#32006", "CYC");
        $ic307$ = makeSymbol("S#32007", "CYC");
        $ic308$ = makeSymbol("S#32008", "CYC");
        $ic309$ = makeSymbol("S#32009", "CYC");
        $ic310$ = makeSymbol("S#32010", "CYC");
        $ic311$ = makeSymbol("S#32011", "CYC");
        $ic312$ = makeSymbol("S#32012", "CYC");
        $ic313$ = makeSymbol("S#32013", "CYC");
        $ic314$ = makeSymbol("S#32014", "CYC");
        $ic315$ = makeSymbol("S#32015", "CYC");
        $ic316$ = makeSymbol("S#32016", "CYC");
        $ic317$ = makeSymbol("S#32017", "CYC");
        $ic318$ = makeKeyword("SKSI-QUERY-TOTAL-TIME-ACC");
        $ic319$ = makeKeyword("SKSI-QUERY-START-TIMES-ACC");
        $ic320$ = makeKeyword("SPARQL-QUERY-PROFILE-ACC");
        $ic321$ = makeSymbol("S#31950", "CYC");
        $ic322$ = makeInteger(128);
        $ic323$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic324$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic325$ = makeSymbol("S#31953", "CYC");
        $ic326$ = makeKeyword("TICK-COUNT");
        $ic327$ = makeKeyword("STEP-COUNT");
        $ic328$ = makeKeyword("ASSERTION-TOUCH-COUNT");
        $ic329$ = makeKeyword("TERM-TOUCH-COUNT");
        $ic330$ = makeKeyword("LAST-ASSERTION-TOUCHED");
        $ic331$ = makeKeyword("LAST-TERM-TOUCHED");
        $ic332$ = makeKeyword("PROBLEM");
        $ic333$ = makeSymbol("S#31959", "CYC");
        $ic334$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#9388", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic335$ = ConsesLow.list((SubLObject)makeKeyword("BROWSABLE?"));
        $ic336$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic337$ = makeKeyword("BROWSABLE?");
        $ic338$ = makeSymbol("CLET");
        $ic339$ = ConsesLow.list((SubLObject)makeSymbol("S#32021", "CYC"), (SubLObject)T);
        $ic340$ = makeSymbol("S#1862", "CYC");
        $ic341$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#31968", "CYC")));
        $ic342$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#759", "CYC"), (SubLObject)makeSymbol("S#9388", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic343$ = ConsesLow.list((SubLObject)makeKeyword("THRESHOLD"), (SubLObject)makeKeyword("BROWSABLE?"));
        $ic344$ = makeKeyword("THRESHOLD");
        $ic345$ = makeSymbol("S#31962", "CYC");
        $ic346$ = makeSymbol("S#31978", "CYC");
        $ic347$ = makeSymbol("PROGN");
        $ic348$ = ConsesLow.list((SubLObject)makeSymbol("S#31970", "CYC"));
        $ic349$ = makeSymbol("S#31963", "CYC");
        $ic350$ = makeSymbol("S#32022", "CYC");
        $ic351$ = makeSymbol("S#32023", "CYC");
        $ic352$ = makeSymbol("S#32024", "CYC");
        $ic353$ = makeSymbol("S#27365", "CYC");
        $ic354$ = makeSymbol("S#32025", "CYC");
        $ic355$ = makeSymbol("CDR");
        $ic356$ = makeSymbol(">");
        $ic357$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#13097", "CYC"), (SubLObject)makeSymbol("TIME"));
        $ic358$ = makeKeyword("RULE");
        $ic359$ = makeKeyword("TIME");
        $ic360$ = makeKeyword("TRIGGER-GAFS");
        $ic361$ = makeKeyword("INFERENCE-COUNT");
        $ic362$ = makeKeyword("INFERENCES");
        $ic363$ = makeKeyword("TOTAL-INFERENCES");
        $ic364$ = makeKeyword("TOTAL-RULES");
        $ic365$ = makeKeyword("AVERAGE-INFERENCES-PER-RULE");
        $ic366$ = makeKeyword("STDEV-INFERENCES-PER-RULE");
        $ic367$ = makeKeyword("AVERAGE-TIME-PER-RULE");
        $ic368$ = makeKeyword("STDEV-TIME-PER-RULE");
        $ic369$ = makeKeyword("AVERAGE-TIME-PER-INFERENCE");
        $ic370$ = makeKeyword("STDEV-TIME-PER-INFERENCE");
        $ic371$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#13097", "CYC"), (SubLObject)makeSymbol("TIME"), (SubLObject)makeSymbol("S#32032", "CYC"), (SubLObject)makeSymbol("S#32033", "CYC"), (SubLObject)makeSymbol("S#32034", "CYC"));
        $ic372$ = ConsesLow.list((SubLObject)makeKeyword("RULE"), (SubLObject)makeKeyword("TIME"), (SubLObject)makeKeyword("TRIGGER-GAFS"), (SubLObject)makeKeyword("INFERENCE-COUNT"), (SubLObject)makeKeyword("INFERENCES"));
        $ic373$ = makeString("~%~6F : ~S : ~S  a ~S");
        $ic374$ = makeString("~%~S");
        $ic375$ = makeSymbol("DOUBLE-FLOAT");
        $ic376$ = makeString("~%Total inferences                   : ~6,' D");
        $ic377$ = makeString("~% total forward (data directed)     : ~6,' D");
        $ic378$ = makeString("~%  successful forward               : ~6,' D");
        $ic379$ = makeString("~% total backward (query directed)   : ~6,' D");
        $ic380$ = makeString("~%  successful backward              : ~6,' D");
        $ic381$ = makeString("~% avg relevant problem count        : ~6,' D");
        $ic382$ = makeString("~%Total problem stores               : ~6,' D");
        $ic383$ = makeString("~% total forward  (data directed)    : ~6,' D");
        $ic384$ = makeString("~% max problem store problem count   : ~6,' D");
        $ic385$ = makeString("~% avg problem store problem count   : ~6,' D");
        $ic386$ = makeString("~% max forward problem store problem count   : ~6,' D");
        $ic387$ = makeString("~% avg forward problem store problem count   : ~6,' D");
        $ic388$ = makeString("~%Total problems          : ~6,' D");
        $ic389$ = makeString("~% total good problems    : ~6,' D");
        $ic390$ = makeString("~% total no-good problems : ~6,' D");
        $ic391$ = makeString("~% total forward problems : ~6,' D");
        $ic392$ = makeString("~% total problem reuses   : ~6,' D");
        $ic393$ = makeString("~%  problem reuse ratio   : ~6,' D per problem");
        $ic394$ = makeString("~%Total problem links     : ~6,' D");
        $ic395$ = makeString("~% total structural links : ~6,' D");
        $ic396$ = makeString("~% total content links    : ~6,' D");
        $ic397$ = makeString("~%  removal links         : ~6,' D");
        $ic398$ = makeString("~%  transformation links  : ~6,' D");
        $ic399$ = makeString("~%Total tactics    : ~6,' D");
        $ic400$ = makeString("~% total executed  : ~6,' D");
        $ic401$ = makeString("~% total discarded : ~6,' D");
        $ic402$ = makeString("~%Total SBHL cache calls   : ~9,' D");
        $ic403$ = makeString("~% successful              : ~9,' D");
        $ic404$ = makeString("~%Total SBHL graph walks   : ~9,' D");
        $ic405$ = makeString("~%Total unification attempts : ~6,' D");
        $ic406$ = makeString("~% successful unifications   : ~6,' D");
        $ic407$ = makeString("~%Total proofs : ~6,' D");
        $ic408$ = makeInteger(100);
        $ic409$ = makeString(" (~2,' D %)");
        $ic410$ = makeString(" (~3,' D %)");
        $ic411$ = makeString(" (~D %)");
    }
    
    public static final class $sX31866_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $evaluation_func;
        public SubLObject $evaluation_arg1;
        public SubLObject $cross_productP;
        public static final SubLStructDeclNative structDecl;
        
        public $sX31866_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$evaluation_func = (SubLObject)CommonSymbols.NIL;
            this.$evaluation_arg1 = (SubLObject)CommonSymbols.NIL;
            this.$cross_productP = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$sX31866_native.class, $ic1$, $ic2$, $ic3$, $ic4$, new String[] { "$name", "$evaluation_func", "$evaluation_arg1", "$cross_productP" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f28724$UnaryFunction extends UnaryFunction
    {
        public $f28724$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#31867"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return f28724(var4);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 862 ms
	
	Decompiled with Procyon 0.5.32.
*/